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
package org.opends.server.admin.std.server;



import java.net.InetAddress;
import java.util.SortedSet;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.types.DN;



/**
 * A server-side interface for querying JMX Connection Handler
 * settings.
 * <p>
 * The JMX Connection Handler is used to interact with clients using
 * the Java Management Extensions (JMX) protocol.
 */
public interface JMXConnectionHandlerCfg extends ConnectionHandlerCfg {

  /**
   * Gets the configuration class associated with this JMX Connection Handler.
   *
   * @return Returns the configuration class associated with this JMX Connection Handler.
   */
  Class<? extends JMXConnectionHandlerCfg> configurationClass();



  /**
   * Register to be notified when this JMX Connection Handler is changed.
   *
   * @param listener
   *          The JMX Connection Handler configuration change listener.
   */
  void addJMXChangeListener(ConfigurationChangeListener<JMXConnectionHandlerCfg> listener);



  /**
   * Deregister an existing JMX Connection Handler configuration change listener.
   *
   * @param listener
   *          The JMX Connection Handler configuration change listener.
   */
  void removeJMXChangeListener(ConfigurationChangeListener<JMXConnectionHandlerCfg> listener);



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the JMX Connection Handler implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();



  /**
   * Gets the "key-manager-provider" property.
   * <p>
   * Specifies the name of the key manager that should be used with
   * this JMX Connection Handler .
   *
   * @return Returns the value of the "key-manager-provider" property.
   */
  String getKeyManagerProvider();



  /**
   * Gets the "key-manager-provider" property as a DN.
   * <p>
   * Specifies the name of the key manager that should be used with
   * this JMX Connection Handler .
   *
   * @return Returns the DN value of the "key-manager-provider"
   *         property.
   */
  DN getKeyManagerProviderDN();



  /**
   * Gets the "listen-address" property.
   * <p>
   * Specifies the address or set of addresses on which this JMX
   * Connection Handler should listen for connections from SNMP
   * clients.
   * <p>
   * Multiple addresses may be provided as separate values for this
   * attribute. If no values are provided, then the JMX Connection
   * Handler listens on all interfaces.
   *
   * @return Returns an unmodifiable set containing the values of the "listen-address" property.
   */
  SortedSet<InetAddress> getListenAddress();



  /**
   * Gets the "listen-port" property.
   * <p>
   * Specifies the port number on which the JMX Connection Handler
   * will listen for connections from clients.
   * <p>
   * Only a single port number may be provided.
   *
   * @return Returns the value of the "listen-port" property.
   */
  int getListenPort();



  /**
   * Gets the "ssl-cert-nickname" property.
   * <p>
   * Specifies the nickname (also called the alias) of the certificate
   * that the JMX Connection Handler should use when performing SSL
   * communication.
   * <p>
   * This is only applicable when the JMX Connection Handler is
   * configured to use SSL.
   *
   * @return Returns the value of the "ssl-cert-nickname" property.
   */
  String getSSLCertNickname();



  /**
   * Gets the "use-ssl" property.
   * <p>
   * Indicates whether the JMX Connection Handler should use SSL.
   * <p>
   * If enabled, the JMX Connection Handler will use SSL to encrypt
   * communication with the clients.
   *
   * @return Returns the value of the "use-ssl" property.
   */
  boolean isUseSSL();

}
