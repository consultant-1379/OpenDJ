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
import org.opends.server.admin.ConfigurationClient;
import org.opends.server.admin.IllegalPropertyValueException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.std.server.AdministrationConnectorCfg;



/**
 * A client-side interface for reading and modifying Administration
 * Connector settings.
 * <p>
 * The Administration Connector is used to interact with
 * administration tools using LDAP.
 */
public interface AdministrationConnectorCfgClient extends ConfigurationClient {

  /**
   * Get the configuration definition associated with this Administration Connector.
   *
   * @return Returns the configuration definition associated with this Administration Connector.
   */
  ManagedObjectDefinition<? extends AdministrationConnectorCfgClient, ? extends AdministrationConnectorCfg> definition();



  /**
   * Gets the "key-manager-provider" property.
   * <p>
   * Specifies the name of the key manager that is used with the
   * Administration Connector .
   *
   * @return Returns the value of the "key-manager-provider" property.
   */
  String getKeyManagerProvider();



  /**
   * Sets the "key-manager-provider" property.
   * <p>
   * Specifies the name of the key manager that is used with the
   * Administration Connector .
   *
   * @param value The value of the "key-manager-provider" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setKeyManagerProvider(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "listen-address" property.
   * <p>
   * Specifies the address or set of addresses on which this
   * Administration Connector should listen for connections from LDAP
   * clients.
   * <p>
   * Multiple addresses may be provided as separate values for this
   * attribute. If no values are provided, then the Administration
   * Connector listens on all interfaces.
   *
   * @return Returns the values of the "listen-address" property.
   */
  SortedSet<InetAddress> getListenAddress();



  /**
   * Sets the "listen-address" property.
   * <p>
   * Specifies the address or set of addresses on which this
   * Administration Connector should listen for connections from LDAP
   * clients.
   * <p>
   * Multiple addresses may be provided as separate values for this
   * attribute. If no values are provided, then the Administration
   * Connector listens on all interfaces.
   *
   * @param values The values of the "listen-address" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setListenAddress(Collection<InetAddress> values) throws IllegalPropertyValueException;



  /**
   * Gets the "listen-port" property.
   * <p>
   * Specifies the port number on which the Administration Connector
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
   * Specifies the port number on which the Administration Connector
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
   * that the Administration Connector will use when performing SSL
   * communication.
   *
   * @return Returns the value of the "ssl-cert-nickname" property.
   */
  String getSSLCertNickname();



  /**
   * Sets the "ssl-cert-nickname" property.
   * <p>
   * Specifies the nickname (also called the alias) of the certificate
   * that the Administration Connector will use when performing SSL
   * communication.
   *
   * @param value The value of the "ssl-cert-nickname" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setSSLCertNickname(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "trust-manager-provider" property.
   * <p>
   * Specifies the name of the trust manager that is used with the
   * Administration Connector .
   *
   * @return Returns the value of the "trust-manager-provider" property.
   */
  String getTrustManagerProvider();



  /**
   * Sets the "trust-manager-provider" property.
   * <p>
   * Specifies the name of the trust manager that is used with the
   * Administration Connector .
   *
   * @param value The value of the "trust-manager-provider" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setTrustManagerProvider(String value) throws IllegalPropertyValueException;

}
