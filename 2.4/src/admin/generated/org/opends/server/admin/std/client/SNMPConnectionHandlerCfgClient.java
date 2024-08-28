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
import org.opends.server.admin.std.meta.SNMPConnectionHandlerCfgDefn.SecurityLevel;
import org.opends.server.admin.std.server.SNMPConnectionHandlerCfg;



/**
 * A client-side interface for reading and modifying SNMP Connection
 * Handler settings.
 * <p>
 * The SNMP Connection Handler can be used to process SNMP requests to
 * retrieve monitoring information described by the MIB 2605. Supported
 * protocol are SNMP V1, V2c and V3.
 */
public interface SNMPConnectionHandlerCfgClient extends ConnectionHandlerCfgClient {

  /**
   * Get the configuration definition associated with this SNMP Connection Handler.
   *
   * @return Returns the configuration definition associated with this SNMP Connection Handler.
   */
  ManagedObjectDefinition<? extends SNMPConnectionHandlerCfgClient, ? extends SNMPConnectionHandlerCfg> definition();



  /**
   * Gets the "allowed-manager" property.
   * <p>
   * Specifies the hosts of the managers to be granted the access
   * rights. This property is required for SNMP v1 and v2 security
   * configuration. An asterisk (*) opens access to all managers.
   *
   * @return Returns the values of the "allowed-manager" property.
   */
  SortedSet<String> getAllowedManager();



  /**
   * Sets the "allowed-manager" property.
   * <p>
   * Specifies the hosts of the managers to be granted the access
   * rights. This property is required for SNMP v1 and v2 security
   * configuration. An asterisk (*) opens access to all managers.
   *
   * @param values The values of the "allowed-manager" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setAllowedManager(Collection<String> values) throws IllegalPropertyValueException;



  /**
   * Gets the "allowed-user" property.
   * <p>
   * Specifies the users to be granted the access rights. This
   * property is required for SNMP v3 security configuration. An
   * asterisk (*) opens access to all users.
   *
   * @return Returns the values of the "allowed-user" property.
   */
  SortedSet<String> getAllowedUser();



  /**
   * Sets the "allowed-user" property.
   * <p>
   * Specifies the users to be granted the access rights. This
   * property is required for SNMP v3 security configuration. An
   * asterisk (*) opens access to all users.
   *
   * @param values The values of the "allowed-user" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setAllowedUser(Collection<String> values) throws IllegalPropertyValueException;



  /**
   * Gets the "community" property.
   * <p>
   * Specifies the v1,v2 community or the v3 context name allowed to
   * access the MIB 2605 monitoring information or the USM MIB. The
   * mapping between "community" and "context name" is set.
   *
   * @return Returns the value of the "community" property.
   */
  String getCommunity();



  /**
   * Sets the "community" property.
   * <p>
   * Specifies the v1,v2 community or the v3 context name allowed to
   * access the MIB 2605 monitoring information or the USM MIB. The
   * mapping between "community" and "context name" is set.
   *
   * @param value The value of the "community" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setCommunity(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the SNMP Connection Handler implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();



  /**
   * Sets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the SNMP Connection Handler implementation.
   *
   * @param value The value of the "java-class" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setJavaClass(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "listen-address" property.
   * <p>
   * Specifies the address or set of addresses on which this SNMP
   * Connection Handler should listen for connections from SNMP
   * clients.
   * <p>
   * Multiple addresses may be provided as separate values for this
   * attribute. If no values are provided, then the SNMP Connection
   * Handler listens on all interfaces.
   *
   * @return Returns the values of the "listen-address" property.
   */
  SortedSet<InetAddress> getListenAddress();



  /**
   * Sets the "listen-address" property.
   * <p>
   * Specifies the address or set of addresses on which this SNMP
   * Connection Handler should listen for connections from SNMP
   * clients.
   * <p>
   * Multiple addresses may be provided as separate values for this
   * attribute. If no values are provided, then the SNMP Connection
   * Handler listens on all interfaces.
   * <p>
   * This property is read-only and can only be modified during
   * creation of a SNMP Connection Handler.
   *
   * @param values The values of the "listen-address" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   * @throws PropertyIsReadOnlyException
   *           If this SNMP Connection Handler is not being initialized.
   */
  void setListenAddress(Collection<InetAddress> values) throws IllegalPropertyValueException, PropertyIsReadOnlyException;



  /**
   * Gets the "listen-port" property.
   * <p>
   * Specifies the port number on which the SNMP Connection Handler
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
   * Specifies the port number on which the SNMP Connection Handler
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
   * Gets the "opendmk-jarfile" property.
   * <p>
   * Indicates the OpenDMK runtime jar file location
   *
   * @return Returns the value of the "opendmk-jarfile" property.
   */
  String getOpendmkJarfile();



  /**
   * Sets the "opendmk-jarfile" property.
   * <p>
   * Indicates the OpenDMK runtime jar file location
   *
   * @param value The value of the "opendmk-jarfile" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setOpendmkJarfile(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "registered-mbean" property.
   * <p>
   * Indicates whether the SNMP objects have to be registered in the
   * Directory Server MBeanServer or not allowing to access SNMP
   * Objects with RMI connector if enabled.
   *
   * @return Returns the value of the "registered-mbean" property.
   */
  boolean isRegisteredMbean();



  /**
   * Sets the "registered-mbean" property.
   * <p>
   * Indicates whether the SNMP objects have to be registered in the
   * Directory Server MBeanServer or not allowing to access SNMP
   * Objects with RMI connector if enabled.
   *
   * @param value The value of the "registered-mbean" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setRegisteredMbean(Boolean value) throws IllegalPropertyValueException;



  /**
   * Gets the "security-agent-file" property.
   * <p>
   * Specifies the USM security configuration to receive authenticated
   * only SNMP requests.
   *
   * @return Returns the value of the "security-agent-file" property.
   */
  String getSecurityAgentFile();



  /**
   * Sets the "security-agent-file" property.
   * <p>
   * Specifies the USM security configuration to receive authenticated
   * only SNMP requests.
   *
   * @param value The value of the "security-agent-file" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setSecurityAgentFile(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "security-level" property.
   * <p>
   * Specifies the type of security level : NoAuthNoPriv : No security
   * mechanisms activated, AuthNoPriv : Authentication activated with
   * no privacy, AuthPriv : Authentication with privacy activated. This
   * property is required for SNMP V3 security configuration.
   *
   * @return Returns the value of the "security-level" property.
   */
  SecurityLevel getSecurityLevel();



  /**
   * Sets the "security-level" property.
   * <p>
   * Specifies the type of security level : NoAuthNoPriv : No security
   * mechanisms activated, AuthNoPriv : Authentication activated with
   * no privacy, AuthPriv : Authentication with privacy activated. This
   * property is required for SNMP V3 security configuration.
   *
   * @param value The value of the "security-level" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setSecurityLevel(SecurityLevel value) throws IllegalPropertyValueException;



  /**
   * Gets the "trap-port" property.
   * <p>
   * Specifies the port to use to send SNMP Traps.
   *
   * @return Returns the value of the "trap-port" property.
   */
  Integer getTrapPort();



  /**
   * Sets the "trap-port" property.
   * <p>
   * Specifies the port to use to send SNMP Traps.
   *
   * @param value The value of the "trap-port" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setTrapPort(int value) throws IllegalPropertyValueException;



  /**
   * Gets the "traps-community" property.
   * <p>
   * Specifies the community string that must be included in the traps
   * sent to define managers (trap-destinations). This property is used
   * in the context of SNMP v1, v2 and v3.
   *
   * @return Returns the value of the "traps-community" property.
   */
  String getTrapsCommunity();



  /**
   * Sets the "traps-community" property.
   * <p>
   * Specifies the community string that must be included in the traps
   * sent to define managers (trap-destinations). This property is used
   * in the context of SNMP v1, v2 and v3.
   *
   * @param value The value of the "traps-community" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setTrapsCommunity(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "traps-destination" property.
   * <p>
   * Specifies the hosts to which V1 traps will be sent. V1 Traps are
   * sent to every host listed.
   * <p>
   * If this list is empty, V1 traps are sent to "localhost". Each
   * host in the list must be identifed by its name or complete IP
   * Addess.
   *
   * @return Returns the values of the "traps-destination" property.
   */
  SortedSet<String> getTrapsDestination();



  /**
   * Sets the "traps-destination" property.
   * <p>
   * Specifies the hosts to which V1 traps will be sent. V1 Traps are
   * sent to every host listed.
   * <p>
   * If this list is empty, V1 traps are sent to "localhost". Each
   * host in the list must be identifed by its name or complete IP
   * Addess.
   *
   * @param values The values of the "traps-destination" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setTrapsDestination(Collection<String> values) throws IllegalPropertyValueException;

}
