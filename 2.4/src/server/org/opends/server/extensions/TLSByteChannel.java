/*
 * CDDL HEADER START
 *
 * The contents of this file are subject to the terms of the
 * Common Development and Distribution License, Version 1.0 only
 * (the "License").  You may not use this file except in compliance
 * with the License.
 *
 * You can obtain a copy of the license at
 * trunk/opends/resource/legal-notices/OpenDS.LICENSE
 * or https://OpenDS.dev.java.net/OpenDS.LICENSE.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL HEADER in each
 * file and include the License file at
 * trunk/opends/resource/legal-notices/OpenDS.LICENSE.  If applicable,
 * add the following below this CDDL HEADER, with the fields enclosed
 * by brackets "[]" replaced with your own identifying information:
 *      Portions Copyright [yyyy] [name of copyright owner]
 *
 * CDDL HEADER END
 *
 *
 *      Copyright 2008-2009 Sun Microsystems, Inc.
 */
package org.opends.server.extensions;

import static org.opends.server.loggers.debug.DebugLogger.debugEnabled;
import static org.opends.server.loggers.debug.DebugLogger.getTracer;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.ClosedChannelException;
import java.security.cert.Certificate;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.net.ssl.*;

import org.opends.server.admin.std.server.LDAPConnectionHandlerCfg;
import org.opends.server.api.ClientConnection;
import org.opends.server.loggers.debug.DebugTracer;
import org.opends.server.types.DebugLogLevel;

/**
 * A class that provides a TLS byte channel implementation.
 *
 */
public class TLSByteChannel implements
                                ByteChannel, ConnectionSecurityProvider {

    private static final DebugTracer TRACER = getTracer();

    private final ClientConnection connection;
    private final ByteChannel socketChannel;

    private final SSLEngine sslEngine;

    //read copy to buffer
    private final ByteBuffer appData;
    //read encrypted
    private final ByteBuffer appNetData;

    //Write encrypted
    private final ByteBuffer netData, tempData;
    private final int sslBufferSize, appBufSize;
    private boolean reading = false;

    //Map of cipher phrases to effective key size (bits). Taken from the
    //following RFCs: 5289, 4346, 3268,4132 and 4162.
    private static final Map<String, Integer> cipherMap;

    static {
        cipherMap = new LinkedHashMap<String, Integer>();
        cipherMap.put("_WITH_AES_256_CBC_", new Integer(256));
        cipherMap.put("_WITH_CAMELLIA_256_CBC_", new Integer(256));
        cipherMap.put("_WITH_AES_256_GCM_", new Integer(256));
        cipherMap.put("_WITH_3DES_EDE_CBC_", new Integer(112));
        cipherMap.put("_WITH_AES_128_GCM_", new Integer(128));
        cipherMap.put("_WITH_SEED_CBC_", new Integer(128));
        cipherMap.put("_WITH_CAMELLIA_128_CBC_", new Integer(128));
        cipherMap.put("_WITH_AES_128_CBC_", new Integer(128));
        cipherMap.put("_WITH_IDEA_CBC_", new Integer(128));
        cipherMap.put("_WITH_DES_CBC_", new Integer(56));
        cipherMap.put("_WITH_RC2_CBC_40_", new Integer(40));
        cipherMap.put("_WITH_RC4_40_", new Integer(40));
        cipherMap.put("_WITH_DES40_CBC_", new Integer(40));
        cipherMap.put("_WITH_NULL_", new Integer(0));
    };

    private TLSByteChannel(LDAPConnectionHandlerCfg config, ClientConnection c,
        ByteChannel socketChannel, SSLContext sslContext)  {

        this.socketChannel = socketChannel;
        this.connection = c;
      // getHostName could potentially be very expensive and could block
      // the connection handler for several minutes. (See issue 4229)
      // Accepting new connections should be done in a seperate thread to
      // avoid blocking new connections. Just remove for now to prevent
      // potential DoS attacks. SSL sessions will not be reused and some
      // cipher suites (such as Kerberos) will not work.
      //String hostName = socketChannel.socket().getInetAddress().getHostName();
      //int port = socketChannel.socket().getPort();
      //sslEngine = sslContext.createSSLEngine(hostName, port);
        sslEngine = sslContext.createSSLEngine();
        sslEngine.setUseClientMode(false);
        Set<String> protocols = config.getSSLProtocol();
        if (!protocols.isEmpty())
            sslEngine.setEnabledProtocols(protocols.toArray(new String[0]));
        Set<String> ciphers = config.getSSLCipherSuite();
        if (!ciphers.isEmpty())
            sslEngine.setEnabledCipherSuites(ciphers.toArray(new String[0]));
        switch (config.getSSLClientAuthPolicy()) {
        case DISABLED:
            sslEngine.setNeedClientAuth(false);
            sslEngine.setWantClientAuth(false);
            break;
        case REQUIRED:
            sslEngine.setWantClientAuth(true);
            sslEngine.setNeedClientAuth(true);
            break;
        case OPTIONAL:
        default:
            sslEngine.setNeedClientAuth(false);
            sslEngine.setWantClientAuth(true);
            break;
        }
        SSLSession sslSession = sslEngine.getSession();
        sslBufferSize = sslSession.getPacketBufferSize();
        appBufSize = sslSession.getApplicationBufferSize();

        appNetData = ByteBuffer.allocate(sslBufferSize);
        netData = ByteBuffer.allocate(sslBufferSize);

        appData = ByteBuffer.allocate(sslSession.getApplicationBufferSize());
        tempData = ByteBuffer.allocate(sslSession.getApplicationBufferSize());
    }

    /**
     * {@inheritDoc}
     */
    public int getAppBufSize() {
        return appBufSize;
    }

    /**
     * Create an TLS byte channel instance using the specified LDAP connection
     * configuration, client connection, SSL context and socket channel
     * parameters.
     *
     * @param config The LDAP connection configuration.
     * @param c The client connection.
     * @param sslContext The SSL context.
     * @param socketChannel The socket channel.
     * @return A TLS capable byte channel.
     */
    public static TLSByteChannel
    getTLSByteChannel(LDAPConnectionHandlerCfg config, ClientConnection c,
                        SSLContext sslContext, ByteChannel socketChannel) {
        return new TLSByteChannel(config, c, socketChannel, sslContext);
    }

    private SSLEngineResult.HandshakeStatus doTasks() {
        Runnable task;
        while ((task = sslEngine.getDelegatedTask()) != null)
            task.run();
        return sslEngine.getHandshakeStatus();
    }

    private void doHandshakeRead(SSLEngineResult.HandshakeStatus hsStatus)
    throws IOException {
        do {
            doHandshakeOp(hsStatus);
            hsStatus = sslEngine.getHandshakeStatus();
        } while (hsStatus == SSLEngineResult.HandshakeStatus.NEED_WRAP ||
                hsStatus == SSLEngineResult.HandshakeStatus.NEED_TASK);
    }

    private void  doHandshakeOp(SSLEngineResult.HandshakeStatus hsStatus)
    throws IOException {
        SSLEngineResult res;
        switch (hsStatus) {
        case NEED_TASK:
            hsStatus = doTasks();
            break;
        case NEED_WRAP:
            tempData.clear();
            netData.clear();
            res = sslEngine.wrap(tempData, netData);
            hsStatus = res.getHandshakeStatus();
            netData.flip();
            while(netData.hasRemaining()) {
                socketChannel.write(netData);
            }
            hsStatus = sslEngine.getHandshakeStatus();
            return;
        default:
            return;
        }
    }

    /**
     * {@inheritDoc}
     */
    public synchronized int read(ByteBuffer clearBuffer) throws IOException {
        SSLEngineResult.HandshakeStatus hsStatus;
        if(!reading)
          appNetData.clear();
        else
          reading = false;
        if(!socketChannel.isOpen())
            return -1;
        if(sslEngine.isInboundDone())
            return -1;
        do {
            int wrappedBytes = socketChannel.read(appNetData);
            appNetData.flip();
            if(wrappedBytes == -1) {
                return -1;
            }
            hsStatus = sslEngine.getHandshakeStatus();
            if (hsStatus == SSLEngineResult.HandshakeStatus.NEED_TASK ||
                    hsStatus == SSLEngineResult.HandshakeStatus.NEED_WRAP)
                doHandshakeRead(hsStatus);
            if(wrappedBytes == 0)
              return 0;
            while (appNetData.hasRemaining()) {
                appData.clear();
                SSLEngineResult res = sslEngine.unwrap(appNetData, appData);
                appData.flip();
                if(res.getStatus() == SSLEngineResult.Status.BUFFER_UNDERFLOW) {
                  appNetData.compact();
                  reading = true;
                  break;
                } else  if(res.getStatus() != SSLEngineResult.Status.OK)
                    return -1;
                hsStatus = sslEngine.getHandshakeStatus();
                if (hsStatus == SSLEngineResult.HandshakeStatus.NEED_TASK ||
                        hsStatus == SSLEngineResult.HandshakeStatus.NEED_WRAP)
                    doHandshakeOp(hsStatus);
                clearBuffer.put(appData);
            }
            hsStatus = sslEngine.getHandshakeStatus();
        } while (hsStatus == SSLEngineResult.HandshakeStatus.NEED_TASK ||
                 hsStatus == SSLEngineResult.HandshakeStatus.NEED_WRAP );
        return clearBuffer.position();
    }

    /**
     * {@inheritDoc}
     */
    public synchronized void close() throws IOException {
        sslEngine.closeInbound();
        sslEngine.closeOutbound();
        SSLEngineResult.HandshakeStatus hsStatus =
                                      sslEngine.getHandshakeStatus();
        if(hsStatus != SSLEngineResult.HandshakeStatus.FINISHED &&
           hsStatus !=  SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING)
            doHandshakeWrite(hsStatus);
    }

    /**
     * {@inheritDoc}
     */
    public boolean isOpen() {
        if(sslEngine.isInboundDone() || sslEngine.isOutboundDone())
          return false;
        return true;
    }

    /**
     * {@inheritDoc}
     */
    public int getSSF() {
        int cipherKeySSF = 0;
        String cipherString = sslEngine.getSession().getCipherSuite();
        for(Map.Entry<String, Integer> mapEntry : cipherMap.entrySet()) {
            if(cipherString.indexOf(mapEntry.getKey()) >= 0) {
                cipherKeySSF = mapEntry.getValue().intValue();
                break;
            }
        }
        return cipherKeySSF;
    }

    /**
     * {@inheritDoc}
     */
    public  Certificate[] getClientCertificateChain() {
        try {
          return sslEngine.getSession().getPeerCertificates();
        }
        catch (SSLPeerUnverifiedException e) {
          if (debugEnabled()) {
            TRACER.debugCaught(DebugLogLevel.ERROR, e);
          }
          return new Certificate[0];
        }
    }

    private void doHandshakeUnwrap() throws IOException {
        netData.clear();
        tempData.clear();
        int bytesRead = socketChannel.read(netData);
        if (bytesRead <= 0)
            throw new ClosedChannelException();
         else
          sslEngine.unwrap(netData, tempData);
    }

    private void
    doHandshakeWrite(SSLEngineResult.HandshakeStatus hsStatus)
    throws IOException {
        do {
            if(hsStatus == SSLEngineResult.HandshakeStatus.NEED_UNWRAP) {
                doHandshakeUnwrap();
            } else
               doHandshakeOp(hsStatus);
            hsStatus = sslEngine.getHandshakeStatus();
        } while (hsStatus == SSLEngineResult.HandshakeStatus.NEED_WRAP ||
                hsStatus == SSLEngineResult.HandshakeStatus.NEED_TASK ||
                hsStatus == SSLEngineResult.HandshakeStatus.NEED_UNWRAP);
    }

    /**
     * {@inheritDoc}
     */
    public synchronized int write(ByteBuffer clearData) throws IOException {
        if(!socketChannel.isOpen() || sslEngine.isOutboundDone()) {
            throw new ClosedChannelException();
        }
        int originalPosition = clearData.position();
        int originalLimit = clearData.limit();
        int length = originalLimit - originalPosition;
        if (length > sslBufferSize) {
            int pos = originalPosition;
            int lim = originalPosition + sslBufferSize;
            while (pos < originalLimit) {
                clearData.position(pos);
                clearData.limit(lim);
                writeInternal(clearData);
                pos = lim;
                lim = Math.min(originalLimit, pos + sslBufferSize);
            }
            return length;
        }  else {
            return writeInternal(clearData);
        }
    }

    private int writeInternal(ByteBuffer clearData) throws IOException {
        int totBytesSent = 0;
        SSLEngineResult.HandshakeStatus hsStatus;
        hsStatus = sslEngine.getHandshakeStatus();
        if (hsStatus == SSLEngineResult.HandshakeStatus.NEED_TASK ||
                hsStatus == SSLEngineResult.HandshakeStatus.NEED_WRAP ||
                hsStatus == SSLEngineResult.HandshakeStatus.NEED_UNWRAP)
            doHandshakeWrite(hsStatus);
        while(clearData.hasRemaining()) {
            netData.clear();
            SSLEngineResult res = sslEngine.wrap(clearData, netData);
            netData.flip();
            if(netData.remaining() == 0)
            {
              // wrap didn't produce any data from our clear buffer.
              // Throw exception to prevent looping.
              throw new SSLException("SSLEngine.wrap produced 0 bytes");
            }
            if(res.getStatus() != SSLEngineResult.Status.OK)
                throw new ClosedChannelException();
            if (hsStatus == SSLEngineResult.HandshakeStatus.NEED_TASK ||
                    hsStatus == SSLEngineResult.HandshakeStatus.NEED_WRAP ||
                    hsStatus == SSLEngineResult.HandshakeStatus.NEED_UNWRAP)
                doHandshakeWrite(hsStatus);
            totBytesSent += socketChannel.write(netData);
        }
        return totBytesSent;
    }

    /**
     * {@inheritDoc}
     */
    public ByteChannel wrapChannel(ByteChannel channel) {
        return this;
    }

    /**
     * {@inheritDoc}
     */
    public String getName() {
        return "TLS";
    }

    /**
     * {@inheritDoc}
     */
    public boolean isSecure() {
        return true;
    }
}
