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
import org.opends.server.admin.Configuration;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.types.DN;



/**
 * A server-side interface for querying Administration Connector
 * settings.
 * <p>
 * The Administration Connector is used to interact with
 * administration tools using LDAP.
 */
public interface AdministrationConnectorCfg extends Configuration {

  /**
   * Gets the configuration class associated with this Administration Connector.
   *
   * @return Returns the configuration class associated with this Administration Connector.
   */
  Class<? extends AdministrationConnectorCfg> configurationClass();



  /**
   * Register to be notified when this Administration Connector is changed.
   *
   * @param listener
   *          The Administration Connector configuration change listener.
   */
  void addChangeListener(ConfigurationChangeListener<AdministrationConnectorCfg> listener);



  /**
   * Deregister an existing Administration Connector configuration change listener.
   *
   * @param listener
   *          The Administration Connector configuration change listener.
   */
  void removeChangeListener(ConfigurationChangeListener<AdministrationConnectorCfg> listener);



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
   * Gets the "key-manager-provider" property as a DN.
   * <p>
   * Specifies the name of the key manager that is used with the
   * Administration Connector .
   *
   * @return Returns the DN value of the "key-manager-provider"
   *         property.
   */
  DN getKeyManagerProviderDN();



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
   * @return Returns an unmodifiable set containing the values of the "listen-address" property.
   */
  SortedSet<InetAddress> getListenAddress();



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
  int getListenPort();



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
   * Gets the "trust-manager-provider" property.
   * <p>
   * Specifies the name of the trust manager that is used with the
   * Administration Connector .
   *
   * @return Returns the value of the "trust-manager-provider" property.
   */
  String getTrustManagerProvider();



  /**
   * Gets the "trust-manager-provider" property as a DN.
   * <p>
   * Specifies the name of the trust manager that is used with the
   * Administration Connector .
   *
   * @return Returns the DN value of the "trust-manager-provider"
   *         property.
   */
  DN getTrustManagerProviderDN();

}
