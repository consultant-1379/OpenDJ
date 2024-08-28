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
import org.opends.server.admin.PropertyIsReadOnlyException;
import org.opends.server.admin.std.server.JMXConnectionHandlerCfg;



/**
 * A client-side interface for reading and modifying JMX Connection
 * Handler settings.
 * <p>
 * The JMX Connection Handler is used to interact with clients using
 * the Java Management Extensions (JMX) protocol.
 */
public interface JMXConnectionHandlerCfgClient extends ConnectionHandlerCfgClient {

  /**
   * Get the configuration definition associated with this JMX Connection Handler.
   *
   * @return Returns the configuration definition associated with this JMX Connection Handler.
   */
  ManagedObjectDefinition<? extends JMXConnectionHandlerCfgClient, ? extends JMXConnectionHandlerCfg> definition();



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
   * Sets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the JMX Connection Handler implementation.
   *
   * @param value The value of the "java-class" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setJavaClass(String value) throws IllegalPropertyValueException;



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
   * Sets the "key-manager-provider" property.
   * <p>
   * Specifies the name of the key manager that should be used with
   * this JMX Connection Handler .
   *
   * @param value The value of the "key-manager-provider" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setKeyManagerProvider(String value) throws IllegalPropertyValueException;



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
   * @return Returns the values of the "listen-address" property.
   */
  SortedSet<InetAddress> getListenAddress();



  /**
   * Sets the "listen-address" property.
   * <p>
   * Specifies the address or set of addresses on which this JMX
   * Connection Handler should listen for connections from SNMP
   * clients.
   * <p>
   * Multiple addresses may be provided as separate values for this
   * attribute. If no values are provided, then the JMX Connection
   * Handler listens on all interfaces.
   * <p>
   * This property is read-only and can only be modified during
   * creation of a JMX Connection Handler.
   *
   * @param values The values of the "listen-address" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   * @throws PropertyIsReadOnlyException
   *           If this JMX Connection Handler is not being initialized.
   */
  void setListenAddress(Collection<InetAddress> values) throws IllegalPropertyValueException, PropertyIsReadOnlyException;



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
  Integer getListenPort();



  /**
   * Sets the "listen-port" property.
   * <p>
   * Specifies the port number on which the JMX Connection Handler
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
   * Sets the "ssl-cert-nickname" property.
   * <p>
   * Specifies the nickname (also called the alias) of the certificate
   * that the JMX Connection Handler should use when performing SSL
   * communication.
   * <p>
   * This is only applicable when the JMX Connection Handler is
   * configured to use SSL.
   *
   * @param value The value of the "ssl-cert-nickname" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setSSLCertNickname(String value) throws IllegalPropertyValueException;



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



  /**
   * Sets the "use-ssl" property.
   * <p>
   * Indicates whether the JMX Connection Handler should use SSL.
   * <p>
   * If enabled, the JMX Connection Handler will use SSL to encrypt
   * communication with the clients.
   *
   * @param value The value of the "use-ssl" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setUseSSL(Boolean value) throws IllegalPropertyValueException;

}
