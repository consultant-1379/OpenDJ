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
 *      Copyright 2008 Sun Microsystems, Inc.
 */
package org.opends.server.admin.std.client;



import java.net.InetAddress;
import java.util.Collection;
import java.util.SortedSet;
import org.opends.server.admin.IllegalPropertyValueException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.std.meta.LDAPConnectionHandlerCfgDefn.SSLClientAuthPolicy;
import org.opends.server.admin.std.server.LDAPConnectionHandlerCfg;



/**
 * A client-side interface for reading and modifying LDAP Connection
 * Handler settings.
 * <p>
 * The LDAP Connection Handler is used to interact with clients using
 * LDAP.
 */
public interface LDAPConnectionHandlerCfgClient extends ConnectionHandlerCfgClient {

  /**
   * Get the configuration definition associated with this LDAP Connection Handler.
   *
   * @return Returns the configuration definition associated with this LDAP Connection Handler.
   */
  ManagedObjectDefinition<? extends LDAPConnectionHandlerCfgClient, ? extends LDAPConnectionHandlerCfg> definition();



  /**
   * Gets the "accept-backlog" property.
   * <p>
   * Specifies the maximum number of pending connection attempts that
   * are allowed to queue up in the accept backlog before the server
   * starts rejecting new connection attempts.
   * <p>
   * This is primarily an issue for cases in which a large number of
   * connections are established to the server in a very short period
   * of time (for example, a benchmark utility that creates a large
   * number of client threads that each have their own connection to
   * the server) and the connection handler is unable to keep up with
   * the rate at which the new connections are established.
   *
   * @return Returns the value of the "accept-backlog" property.
   */
  int getAcceptBacklog();



  /**
   * Sets the "accept-backlog" property.
   * <p>
   * Specifies the maximum number of pending connection attempts that
   * are allowed to queue up in the accept backlog before the server
   * starts rejecting new connection attempts.
   * <p>
   * This is primarily an issue for cases in which a large number of
   * connections are established to the server in a very short period
   * of time (for example, a benchmark utility that creates a large
   * number of client threads that each have their own connection to
   * the server) and the connection handler is unable to keep up with
   * the rate at which the new connections are established.
   *
   * @param value The value of the "accept-backlog" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setAcceptBacklog(Integer value) throws IllegalPropertyValueException;



  /**
   * Gets the "allow-ldap-v2" property.
   * <p>
   * Indicates whether connections from LDAPv2 clients are allowed.
   * <p>
   * If LDAPv2 clients are allowed, then only a minimal degree of
   * special support are provided for them to ensure that
   * LDAPv3-specific protocol elements (for example, Configuration
   * Guide 25 controls, extended response messages, intermediate
   * response messages, referrals) are not sent to an LDAPv2 client.
   *
   * @return Returns the value of the "allow-ldap-v2" property.
   */
  boolean isAllowLDAPV2();



  /**
   * Sets the "allow-ldap-v2" property.
   * <p>
   * Indicates whether connections from LDAPv2 clients are allowed.
   * <p>
   * If LDAPv2 clients are allowed, then only a minimal degree of
   * special support are provided for them to ensure that
   * LDAPv3-specific protocol elements (for example, Configuration
   * Guide 25 controls, extended response messages, intermediate
   * response messages, referrals) are not sent to an LDAPv2 client.
   *
   * @param value The value of the "allow-ldap-v2" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setAllowLDAPV2(Boolean value) throws IllegalPropertyValueException;



  /**
   * Gets the "allow-start-tls" property.
   * <p>
   * Indicates whether clients are allowed to use StartTLS.
   * <p>
   * If enabled, the LDAP Connection Handler allows clients to use the
   * StartTLS extended operation to initiate secure communication over
   * an otherwise insecure channel. Note that this is only allowed if
   * the LDAP Connection Handler is not configured to use SSL, and if
   * the server is configured with a valid key manager provider and a
   * valid trust manager provider.
   *
   * @return Returns the value of the "allow-start-tls" property.
   */
  boolean isAllowStartTLS();



  /**
   * Sets the "allow-start-tls" property.
   * <p>
   * Indicates whether clients are allowed to use StartTLS.
   * <p>
   * If enabled, the LDAP Connection Handler allows clients to use the
   * StartTLS extended operation to initiate secure communication over
   * an otherwise insecure channel. Note that this is only allowed if
   * the LDAP Connection Handler is not configured to use SSL, and if
   * the server is configured with a valid key manager provider and a
   * valid trust manager provider.
   *
   * @param value The value of the "allow-start-tls" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setAllowStartTLS(Boolean value) throws IllegalPropertyValueException;



  /**
   * Gets the "allow-tcp-reuse-address" property.
   * <p>
   * Indicates whether the LDAP Connection Handler should reuse socket
   * descriptors.
   * <p>
   * If enabled, the SO_REUSEADDR socket option is used on the server
   * listen socket to potentially allow the reuse of socket descriptors
   * for clients in a TIME_WAIT state. This may help the server avoid
   * temporarily running out of socket descriptors in cases in which a
   * very large number of short-lived connections have been established
   * from the same client system.
   *
   * @return Returns the value of the "allow-tcp-reuse-address" property.
   */
  boolean isAllowTCPReuseAddress();



  /**
   * Sets the "allow-tcp-reuse-address" property.
   * <p>
   * Indicates whether the LDAP Connection Handler should reuse socket
   * descriptors.
   * <p>
   * If enabled, the SO_REUSEADDR socket option is used on the server
   * listen socket to potentially allow the reuse of socket descriptors
   * for clients in a TIME_WAIT state. This may help the server avoid
   * temporarily running out of socket descriptors in cases in which a
   * very large number of short-lived connections have been established
   * from the same client system.
   *
   * @param value The value of the "allow-tcp-reuse-address" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setAllowTCPReuseAddress(Boolean value) throws IllegalPropertyValueException;



  /**
   * Gets the "buffer-size" property.
   * <p>
   * Specifies the size in bytes of the LDAP response message write
   * buffer.
   * <p>
   * This property specifies write buffer size allocated by the server
   * for each client connection and used to buffer LDAP response
   * messages data when writing.
   *
   * @return Returns the value of the "buffer-size" property.
   */
  long getBufferSize();



  /**
   * Sets the "buffer-size" property.
   * <p>
   * Specifies the size in bytes of the LDAP response message write
   * buffer.
   * <p>
   * This property specifies write buffer size allocated by the server
   * for each client connection and used to buffer LDAP response
   * messages data when writing.
   *
   * @param value The value of the "buffer-size" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setBufferSize(Long value) throws IllegalPropertyValueException;



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the LDAP Connection Handler implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();



  /**
   * Sets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the LDAP Connection Handler implementation.
   *
   * @param value The value of the "java-class" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setJavaClass(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "keep-stats" property.
   * <p>
   * Indicates whether the LDAP Connection Handler should keep
   * statistics.
   * <p>
   * If enabled, the LDAP Connection Handler maintains statistics
   * about the number and types of operations requested over LDAP and
   * the amount of data sent and received.
   *
   * @return Returns the value of the "keep-stats" property.
   */
  boolean isKeepStats();



  /**
   * Sets the "keep-stats" property.
   * <p>
   * Indicates whether the LDAP Connection Handler should keep
   * statistics.
   * <p>
   * If enabled, the LDAP Connection Handler maintains statistics
   * about the number and types of operations requested over LDAP and
   * the amount of data sent and received.
   *
   * @param value The value of the "keep-stats" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setKeepStats(Boolean value) throws IllegalPropertyValueException;



  /**
   * Gets the "key-manager-provider" property.
   * <p>
   * Specifies the name of the key manager that should be used with
   * this LDAP Connection Handler .
   *
   * @return Returns the value of the "key-manager-provider" property.
   */
  String getKeyManagerProvider();



  /**
   * Sets the "key-manager-provider" property.
   * <p>
   * Specifies the name of the key manager that should be used with
   * this LDAP Connection Handler .
   *
   * @param value The value of the "key-manager-provider" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setKeyManagerProvider(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "listen-address" property.
   * <p>
   * Specifies the address or set of addresses on which this LDAP
   * Connection Handler should listen for connections from LDAP
   * clients.
   * <p>
   * Multiple addresses may be provided as separate values for this
   * attribute. If no values are provided, then the LDAP Connection
   * Handler listens on all interfaces.
   *
   * @return Returns the values of the "listen-address" property.
   */
  SortedSet<InetAddress> getListenAddress();



  /**
   * Sets the "listen-address" property.
   * <p>
   * Specifies the address or set of addresses on which this LDAP
   * Connection Handler should listen for connections from LDAP
   * clients.
   * <p>
   * Multiple addresses may be provided as separate values for this
   * attribute. If no values are provided, then the LDAP Connection
   * Handler listens on all interfaces.
   *
   * @param values The values of the "listen-address" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setListenAddress(Collection<InetAddress> values) throws IllegalPropertyValueException;



  /**
   * Gets the "listen-port" property.
   * <p>
   * Specifies the port number on which the LDAP Connection Handler
   * will listen for connections from clients.
   * <p>
   * Only a single port number may be provided.
   *
   * @return Returns the value of the "listen-port" property.
   */
  Integer getListenPort();



  /**
   * Sets the "listen-port" property.
   * <p>
   * Specifies the port number on which the LDAP Connection Handler
   * will listen for connections from clients.
   * <p>
   * Only a single port number may be provided.
   *
   * @param value The value of the "listen-port" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setListenPort(int value) throws IllegalPropertyValueException;



  /**
   * Gets the "max-blocked-write-time-limit" property.
   * <p>
   * Specifies the maximum length of time that attempts to write data
   * to LDAP clients should be allowed to block.
   * <p>
   * If an attempt to write data to a client takes longer than this
   * length of time, then the client connection is terminated.
   *
   * @return Returns the value of the "max-blocked-write-time-limit" property.
   */
  long getMaxBlockedWriteTimeLimit();



  /**
   * Sets the "max-blocked-write-time-limit" property.
   * <p>
   * Specifies the maximum length of time that attempts to write data
   * to LDAP clients should be allowed to block.
   * <p>
   * If an attempt to write data to a client takes longer than this
   * length of time, then the client connection is terminated.
   *
   * @param value The value of the "max-blocked-write-time-limit" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setMaxBlockedWriteTimeLimit(Long value) throws IllegalPropertyValueException;



  /**
   * Gets the "max-request-size" property.
   * <p>
   * Specifies the size in bytes of the largest LDAP request message
   * that will be allowed by this LDAP Connection handler.
   * <p>
   * This property is analogous to the maxBERSize configuration
   * attribute of the Sun Java System Directory Server. This can help
   * prevent denial-of-service attacks by clients that indicate they
   * send extremely large requests to the server causing it to attempt
   * to allocate large amounts of memory.
   *
   * @return Returns the value of the "max-request-size" property.
   */
  long getMaxRequestSize();



  /**
   * Sets the "max-request-size" property.
   * <p>
   * Specifies the size in bytes of the largest LDAP request message
   * that will be allowed by this LDAP Connection handler.
   * <p>
   * This property is analogous to the maxBERSize configuration
   * attribute of the Sun Java System Directory Server. This can help
   * prevent denial-of-service attacks by clients that indicate they
   * send extremely large requests to the server causing it to attempt
   * to allocate large amounts of memory.
   *
   * @param value The value of the "max-request-size" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setMaxRequestSize(Long value) throws IllegalPropertyValueException;



  /**
   * Gets the "num-request-handlers" property.
   * <p>
   * Specifies the number of request handlers that are used to read
   * requests from clients.
   * <p>
   * The LDAP Connection Handler uses one thread to accept new
   * connections from clients, but uses one or more additional threads
   * to read requests from existing client connections. This ensures
   * that new requests are read efficiently and that the connection
   * handler itself does not become a bottleneck when the server is
   * under heavy load from many clients at the same time.
   *
   * @return Returns the value of the "num-request-handlers" property.
   */
  int getNumRequestHandlers();



  /**
   * Sets the "num-request-handlers" property.
   * <p>
   * Specifies the number of request handlers that are used to read
   * requests from clients.
   * <p>
   * The LDAP Connection Handler uses one thread to accept new
   * connections from clients, but uses one or more additional threads
   * to read requests from existing client connections. This ensures
   * that new requests are read efficiently and that the connection
   * handler itself does not become a bottleneck when the server is
   * under heavy load from many clients at the same time.
   *
   * @param value The value of the "num-request-handlers" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setNumRequestHandlers(Integer value) throws IllegalPropertyValueException;



  /**
   * Gets the "send-rejection-notice" property.
   * <p>
   * Indicates whether the LDAP Connection Handler should send a
   * notice of disconnection extended response message to the client if
   * a new connection is rejected for some reason.
   * <p>
   * The extended response message may provide an explanation
   * indicating the reason that the connection was rejected.
   *
   * @return Returns the value of the "send-rejection-notice" property.
   */
  boolean isSendRejectionNotice();



  /**
   * Sets the "send-rejection-notice" property.
   * <p>
   * Indicates whether the LDAP Connection Handler should send a
   * notice of disconnection extended response message to the client if
   * a new connection is rejected for some reason.
   * <p>
   * The extended response message may provide an explanation
   * indicating the reason that the connection was rejected.
   *
   * @param value The value of the "send-rejection-notice" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setSendRejectionNotice(Boolean value) throws IllegalPropertyValueException;



  /**
   * Gets the "ssl-cert-nickname" property.
   * <p>
   * Specifies the nickname (also called the alias) of the certificate
   * that the LDAP Connection Handler should use when performing SSL
   * communication.
   * <p>
   * This is only applicable when the LDAP Connection Handler is
   * configured to use SSL.
   *
   * @return Returns the value of the "ssl-cert-nickname" property.
   */
  String getSSLCertNickname();



  /**
   * Sets the "ssl-cert-nickname" property.
   * <p>
   * Specifies the nickname (also called the alias) of the certificate
   * that the LDAP Connection Handler should use when performing SSL
   * communication.
   * <p>
   * This is only applicable when the LDAP Connection Handler is
   * configured to use SSL.
   *
   * @param value The value of the "ssl-cert-nickname" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setSSLCertNickname(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "ssl-cipher-suite" property.
   * <p>
   * Specifies the names of the SSL cipher suites that are allowed for
   * use in SSL or StartTLS communication.
   *
   * @return Returns the values of the "ssl-cipher-suite" property.
   */
  SortedSet<String> getSSLCipherSuite();



  /**
   * Sets the "ssl-cipher-suite" property.
   * <p>
   * Specifies the names of the SSL cipher suites that are allowed for
   * use in SSL or StartTLS communication.
   *
   * @param values The values of the "ssl-cipher-suite" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setSSLCipherSuite(Collection<String> values) throws IllegalPropertyValueException;



  /**
   * Gets the "ssl-client-auth-policy" property.
   * <p>
   * Specifies the policy that the LDAP Connection Handler should use
   * regarding client SSL certificates.
   * <p>
   * This is only applicable if clients are allowed to use SSL.
   *
   * @return Returns the value of the "ssl-client-auth-policy" property.
   */
  SSLClientAuthPolicy getSSLClientAuthPolicy();



  /**
   * Sets the "ssl-client-auth-policy" property.
   * <p>
   * Specifies the policy that the LDAP Connection Handler should use
   * regarding client SSL certificates.
   * <p>
   * This is only applicable if clients are allowed to use SSL.
   *
   * @param value The value of the "ssl-client-auth-policy" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setSSLClientAuthPolicy(SSLClientAuthPolicy value) throws IllegalPropertyValueException;



  /**
   * Gets the "ssl-protocol" property.
   * <p>
   * Specifies the names of the SSL protocols that are allowed for use
   * in SSL or StartTLS communication.
   *
   * @return Returns the values of the "ssl-protocol" property.
   */
  SortedSet<String> getSSLProtocol();



  /**
   * Sets the "ssl-protocol" property.
   * <p>
   * Specifies the names of the SSL protocols that are allowed for use
   * in SSL or StartTLS communication.
   *
   * @param values The values of the "ssl-protocol" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setSSLProtocol(Collection<String> values) throws IllegalPropertyValueException;



  /**
   * Gets the "trust-manager-provider" property.
   * <p>
   * Specifies the name of the trust manager that should be used with
   * the LDAP Connection Handler .
   *
   * @return Returns the value of the "trust-manager-provider" property.
   */
  String getTrustManagerProvider();



  /**
   * Sets the "trust-manager-provider" property.
   * <p>
   * Specifies the name of the trust manager that should be used with
   * the LDAP Connection Handler .
   *
   * @param value The value of the "trust-manager-provider" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setTrustManagerProvider(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "use-ssl" property.
   * <p>
   * Indicates whether the LDAP Connection Handler should use SSL.
   * <p>
   * If enabled, the LDAP Connection Handler will use SSL to encrypt
   * communication with the clients.
   *
   * @return Returns the value of the "use-ssl" property.
   */
  boolean isUseSSL();



  /**
   * Sets the "use-ssl" property.
   * <p>
   * Indicates whether the LDAP Connection Handler should use SSL.
   * <p>
   * If enabled, the LDAP Connection Handler will use SSL to encrypt
   * communication with the clients.
   *
   * @param value The value of the "use-ssl" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setUseSSL(Boolean value) throws IllegalPropertyValueException;



  /**
   * Gets the "use-tcp-keep-alive" property.
   * <p>
   * Indicates whether the LDAP Connection Handler should use TCP
   * keep-alive.
   * <p>
   * If enabled, the SO_KEEPALIVE socket option is used to indicate
   * that TCP keepalive messages should periodically be sent to the
   * client to verify that the associated connection is still valid.
   * This may also help prevent cases in which intermediate network
   * hardware could silently drop an otherwise idle client connection,
   * provided that the keepalive interval configured in the underlying
   * operating system is smaller than the timeout enforced by the
   * network hardware.
   *
   * @return Returns the value of the "use-tcp-keep-alive" property.
   */
  boolean isUseTCPKeepAlive();



  /**
   * Sets the "use-tcp-keep-alive" property.
   * <p>
   * Indicates whether the LDAP Connection Handler should use TCP
   * keep-alive.
   * <p>
   * If enabled, the SO_KEEPALIVE socket option is used to indicate
   * that TCP keepalive messages should periodically be sent to the
   * client to verify that the associated connection is still valid.
   * This may also help prevent cases in which intermediate network
   * hardware could silently drop an otherwise idle client connection,
   * provided that the keepalive interval configured in the underlying
   * operating system is smaller than the timeout enforced by the
   * network hardware.
   *
   * @param value The value of the "use-tcp-keep-alive" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setUseTCPKeepAlive(Boolean value) throws IllegalPropertyValueException;



  /**
   * Gets the "use-tcp-no-delay" property.
   * <p>
   * Indicates whether the LDAP Connection Handler should use TCP
   * no-delay.
   * <p>
   * If enabled, the TCP_NODELAY socket option is used to ensure that
   * response messages to the client are sent immediately rather than
   * potentially waiting to determine whether additional response
   * messages can be sent in the same packet. In most cases, using the
   * TCP_NODELAY socket option provides better performance and lower
   * response times, but disabling it may help for some cases in which
   * the server sends a large number of entries to a client in response
   * to a search request.
   *
   * @return Returns the value of the "use-tcp-no-delay" property.
   */
  boolean isUseTCPNoDelay();



  /**
   * Sets the "use-tcp-no-delay" property.
   * <p>
   * Indicates whether the LDAP Connection Handler should use TCP
   * no-delay.
   * <p>
   * If enabled, the TCP_NODELAY socket option is used to ensure that
   * response messages to the client are sent immediately rather than
   * potentially waiting to determine whether additional response
   * messages can be sent in the same packet. In most cases, using the
   * TCP_NODELAY socket option provides better performance and lower
   * response times, but disabling it may help for some cases in which
   * the server sends a large number of entries to a client in response
   * to a search request.
   *
   * @param value The value of the "use-tcp-no-delay" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setUseTCPNoDelay(Boolean value) throws IllegalPropertyValueException;

}
