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



import java.util.Collection;
import java.util.SortedSet;
import org.opends.server.admin.ConfigurationClient;
import org.opends.server.admin.IllegalPropertyValueException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.std.meta.GlobalCfgDefn.DisabledPrivilege;
import org.opends.server.admin.std.meta.GlobalCfgDefn.EtimeResolution;
import org.opends.server.admin.std.meta.GlobalCfgDefn.InvalidAttributeSyntaxBehavior;
import org.opends.server.admin.std.meta.GlobalCfgDefn.SingleStructuralObjectclassBehavior;
import org.opends.server.admin.std.meta.GlobalCfgDefn.WorkflowConfigurationMode;
import org.opends.server.admin.std.meta.GlobalCfgDefn.WritabilityMode;
import org.opends.server.admin.std.server.GlobalCfg;



/**
 * A client-side interface for reading and modifying Global
 * Configuration settings.
 * <p>
 * The Global Configuration contains properties that affect the
 * overall operation of the OpenDS Directory Server .
 */
public interface GlobalCfgClient extends ConfigurationClient {

  /**
   * Get the configuration definition associated with this Global Configuration.
   *
   * @return Returns the configuration definition associated with this Global Configuration.
   */
  ManagedObjectDefinition<? extends GlobalCfgClient, ? extends GlobalCfg> definition();



  /**
   * Gets the "add-missing-rdn-attributes" property.
   * <p>
   * Indicates whether the Directory Server should automatically add
   * any attribute values contained in the entry's RDN into that entry
   * when processing an add request.
   *
   * @return Returns the value of the "add-missing-rdn-attributes" property.
   */
  boolean isAddMissingRDNAttributes();



  /**
   * Sets the "add-missing-rdn-attributes" property.
   * <p>
   * Indicates whether the Directory Server should automatically add
   * any attribute values contained in the entry's RDN into that entry
   * when processing an add request.
   *
   * @param value The value of the "add-missing-rdn-attributes" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setAddMissingRDNAttributes(Boolean value) throws IllegalPropertyValueException;



  /**
   * Gets the "allow-attribute-name-exceptions" property.
   * <p>
   * Indicates whether the Directory Server should allow underscores
   * in attribute names and allow attribute names to begin with numeric
   * digits (both of which are violations of the LDAP standards).
   *
   * @return Returns the value of the "allow-attribute-name-exceptions" property.
   */
  boolean isAllowAttributeNameExceptions();



  /**
   * Sets the "allow-attribute-name-exceptions" property.
   * <p>
   * Indicates whether the Directory Server should allow underscores
   * in attribute names and allow attribute names to begin with numeric
   * digits (both of which are violations of the LDAP standards).
   *
   * @param value The value of the "allow-attribute-name-exceptions" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setAllowAttributeNameExceptions(Boolean value) throws IllegalPropertyValueException;



  /**
   * Gets the "allowed-task" property.
   * <p>
   * Specifies the fully-qualified name of a Java class that may be
   * invoked in the server.
   * <p>
   * Any attempt to invoke a task not included in the list of allowed
   * tasks is rejected.
   *
   * @return Returns the values of the "allowed-task" property.
   */
  SortedSet<String> getAllowedTask();



  /**
   * Sets the "allowed-task" property.
   * <p>
   * Specifies the fully-qualified name of a Java class that may be
   * invoked in the server.
   * <p>
   * Any attempt to invoke a task not included in the list of allowed
   * tasks is rejected.
   *
   * @param values The values of the "allowed-task" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setAllowedTask(Collection<String> values) throws IllegalPropertyValueException;



  /**
   * Gets the "bind-with-dn-requires-password" property.
   * <p>
   * Indicates whether the Directory Server should reject any simple
   * bind request that contains a DN but no password.
   * <p>
   * Although such bind requests are technically allowed by the LDAPv3
   * specification (and should be treated as anonymous simple
   * authentication), they may introduce security problems in
   * applications that do not verify that the client actually provided
   * a password.
   *
   * @return Returns the value of the "bind-with-dn-requires-password" property.
   */
  boolean isBindWithDNRequiresPassword();



  /**
   * Sets the "bind-with-dn-requires-password" property.
   * <p>
   * Indicates whether the Directory Server should reject any simple
   * bind request that contains a DN but no password.
   * <p>
   * Although such bind requests are technically allowed by the LDAPv3
   * specification (and should be treated as anonymous simple
   * authentication), they may introduce security problems in
   * applications that do not verify that the client actually provided
   * a password.
   *
   * @param value The value of the "bind-with-dn-requires-password" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setBindWithDNRequiresPassword(Boolean value) throws IllegalPropertyValueException;



  /**
   * Gets the "check-schema" property.
   * <p>
   * Indicates whether schema enforcement is active.
   * <p>
   * When schema enforcement is activated, the Directory Server
   * ensures that all operations result in entries are valid according
   * to the defined server schema. It is strongly recommended that this
   * option be left enabled to prevent the inadvertent addition of
   * invalid data into the server.
   *
   * @return Returns the value of the "check-schema" property.
   */
  boolean isCheckSchema();



  /**
   * Sets the "check-schema" property.
   * <p>
   * Indicates whether schema enforcement is active.
   * <p>
   * When schema enforcement is activated, the Directory Server
   * ensures that all operations result in entries are valid according
   * to the defined server schema. It is strongly recommended that this
   * option be left enabled to prevent the inadvertent addition of
   * invalid data into the server.
   *
   * @param value The value of the "check-schema" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setCheckSchema(Boolean value) throws IllegalPropertyValueException;



  /**
   * Gets the "default-password-policy" property.
   * <p>
   * Specifies the name of the password policy that is in effect for
   * users whose entries do not specify an alternate password policy
   * (either via a real or virtual attribute).
   *
   * @return Returns the value of the "default-password-policy" property.
   */
  String getDefaultPasswordPolicy();



  /**
   * Sets the "default-password-policy" property.
   * <p>
   * Specifies the name of the password policy that is in effect for
   * users whose entries do not specify an alternate password policy
   * (either via a real or virtual attribute).
   *
   * @param value The value of the "default-password-policy" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setDefaultPasswordPolicy(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "disabled-privilege" property.
   * <p>
   * Specifies the name of a privilege that should not be evaluated by
   * the server.
   * <p>
   * If a privilege is disabled, then it is assumed that all clients
   * (including unauthenticated clients) have that privilege.
   *
   * @return Returns the values of the "disabled-privilege" property.
   */
  SortedSet<DisabledPrivilege> getDisabledPrivilege();



  /**
   * Sets the "disabled-privilege" property.
   * <p>
   * Specifies the name of a privilege that should not be evaluated by
   * the server.
   * <p>
   * If a privilege is disabled, then it is assumed that all clients
   * (including unauthenticated clients) have that privilege.
   *
   * @param values The values of the "disabled-privilege" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setDisabledPrivilege(Collection<DisabledPrivilege> values) throws IllegalPropertyValueException;



  /**
   * Gets the "entry-cache-preload" property.
   * <p>
   * Indicates whether or not to preload the entry cache on startup.
   *
   * @return Returns the value of the "entry-cache-preload" property.
   */
  boolean isEntryCachePreload();



  /**
   * Sets the "entry-cache-preload" property.
   * <p>
   * Indicates whether or not to preload the entry cache on startup.
   *
   * @param value The value of the "entry-cache-preload" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setEntryCachePreload(Boolean value) throws IllegalPropertyValueException;



  /**
   * Gets the "etime-resolution" property.
   * <p>
   * Specifies the resolution to use for operation elapsed processing
   * time (etime) measurements.
   *
   * @return Returns the value of the "etime-resolution" property.
   */
  EtimeResolution getEtimeResolution();



  /**
   * Sets the "etime-resolution" property.
   * <p>
   * Specifies the resolution to use for operation elapsed processing
   * time (etime) measurements.
   *
   * @param value The value of the "etime-resolution" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setEtimeResolution(EtimeResolution value) throws IllegalPropertyValueException;



  /**
   * Gets the "idle-time-limit" property.
   * <p>
   * Specifies the maximum length of time that a client connection may
   * remain established since its last completed operation.
   * <p>
   * A value of "0 seconds" indicates that no idle time limit is
   * enforced.
   *
   * @return Returns the value of the "idle-time-limit" property.
   */
  long getIdleTimeLimit();



  /**
   * Sets the "idle-time-limit" property.
   * <p>
   * Specifies the maximum length of time that a client connection may
   * remain established since its last completed operation.
   * <p>
   * A value of "0 seconds" indicates that no idle time limit is
   * enforced.
   *
   * @param value The value of the "idle-time-limit" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setIdleTimeLimit(Long value) throws IllegalPropertyValueException;



  /**
   * Gets the "invalid-attribute-syntax-behavior" property.
   * <p>
   * Specifies how the Directory Server should handle operations
   * whenever an attribute value violates the associated attribute
   * syntax.
   *
   * @return Returns the value of the "invalid-attribute-syntax-behavior" property.
   */
  InvalidAttributeSyntaxBehavior getInvalidAttributeSyntaxBehavior();



  /**
   * Sets the "invalid-attribute-syntax-behavior" property.
   * <p>
   * Specifies how the Directory Server should handle operations
   * whenever an attribute value violates the associated attribute
   * syntax.
   *
   * @param value The value of the "invalid-attribute-syntax-behavior" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setInvalidAttributeSyntaxBehavior(InvalidAttributeSyntaxBehavior value) throws IllegalPropertyValueException;



  /**
   * Gets the "lookthrough-limit" property.
   * <p>
   * Specifies the maximum number of entries that the Directory Server
   * should "look through" in the course of processing a search
   * request.
   * <p>
   * This includes any entry that the server must examine in the
   * course of processing the request, regardless of whether it
   * actually matches the search criteria. A value of 0 indicates that
   * no lookthrough limit is enforced. Note that this is the default
   * server-wide limit, but it may be overridden on a per-user basis
   * using the ds-rlim-lookthrough-limit operational attribute.
   *
   * @return Returns the value of the "lookthrough-limit" property.
   */
  int getLookthroughLimit();



  /**
   * Sets the "lookthrough-limit" property.
   * <p>
   * Specifies the maximum number of entries that the Directory Server
   * should "look through" in the course of processing a search
   * request.
   * <p>
   * This includes any entry that the server must examine in the
   * course of processing the request, regardless of whether it
   * actually matches the search criteria. A value of 0 indicates that
   * no lookthrough limit is enforced. Note that this is the default
   * server-wide limit, but it may be overridden on a per-user basis
   * using the ds-rlim-lookthrough-limit operational attribute.
   *
   * @param value The value of the "lookthrough-limit" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setLookthroughLimit(Integer value) throws IllegalPropertyValueException;



  /**
   * Gets the "max-allowed-client-connections" property.
   * <p>
   * Specifies the maximum number of client connections that may be
   * established at any given time
   * <p>
   * A value of 0 indicates that unlimited client connection is
   * allowed.
   *
   * @return Returns the value of the "max-allowed-client-connections" property.
   */
  int getMaxAllowedClientConnections();



  /**
   * Sets the "max-allowed-client-connections" property.
   * <p>
   * Specifies the maximum number of client connections that may be
   * established at any given time
   * <p>
   * A value of 0 indicates that unlimited client connection is
   * allowed.
   *
   * @param value The value of the "max-allowed-client-connections" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setMaxAllowedClientConnections(Integer value) throws IllegalPropertyValueException;



  /**
   * Gets the "max-psearches" property.
   * <p>
   * Defines the maximum number of concurrent persistent searches that
   * can be performed on Directory Server
   * <p>
   * The persistent search mechanism provides an active channel
   * through which entries that change, and information about the
   * changes that occur, can be communicated. Because each persistent
   * search operation consumes resources, limiting the number of
   * simultaneous persistent searches keeps the performance impact
   * minimal. A value of -1 indicates that there is no limit on the
   * persistent searches.
   *
   * @return Returns the value of the "max-psearches" property.
   */
  int getMaxPsearches();



  /**
   * Sets the "max-psearches" property.
   * <p>
   * Defines the maximum number of concurrent persistent searches that
   * can be performed on Directory Server
   * <p>
   * The persistent search mechanism provides an active channel
   * through which entries that change, and information about the
   * changes that occur, can be communicated. Because each persistent
   * search operation consumes resources, limiting the number of
   * simultaneous persistent searches keeps the performance impact
   * minimal. A value of -1 indicates that there is no limit on the
   * persistent searches.
   *
   * @param value The value of the "max-psearches" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setMaxPsearches(Integer value) throws IllegalPropertyValueException;



  /**
   * Gets the "notify-abandoned-operations" property.
   * <p>
   * Indicates whether the Directory Server should send a response to
   * any operation that is interrupted via an abandon request.
   * <p>
   * The LDAP specification states that abandoned operations should
   * not receive any response, but this may cause problems with client
   * applications that always expect to receive a response to each
   * request.
   *
   * @return Returns the value of the "notify-abandoned-operations" property.
   */
  boolean isNotifyAbandonedOperations();



  /**
   * Sets the "notify-abandoned-operations" property.
   * <p>
   * Indicates whether the Directory Server should send a response to
   * any operation that is interrupted via an abandon request.
   * <p>
   * The LDAP specification states that abandoned operations should
   * not receive any response, but this may cause problems with client
   * applications that always expect to receive a response to each
   * request.
   *
   * @param value The value of the "notify-abandoned-operations" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setNotifyAbandonedOperations(Boolean value) throws IllegalPropertyValueException;



  /**
   * Gets the "proxied-authorization-identity-mapper" property.
   * <p>
   * Specifies the name of the identity mapper to map authorization ID
   * values (using the "u:" form) provided in the proxied authorization
   * control to the corresponding user entry.
   *
   * @return Returns the value of the "proxied-authorization-identity-mapper" property.
   */
  String getProxiedAuthorizationIdentityMapper();



  /**
   * Sets the "proxied-authorization-identity-mapper" property.
   * <p>
   * Specifies the name of the identity mapper to map authorization ID
   * values (using the "u:" form) provided in the proxied authorization
   * control to the corresponding user entry.
   *
   * @param value The value of the "proxied-authorization-identity-mapper" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setProxiedAuthorizationIdentityMapper(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "reject-unauthenticated-requests" property.
   * <p>
   * Indicates whether the Directory Server should reject any request
   * (other than bind or StartTLS requests) received from a client that
   * has not yet been authenticated, whose last authentication attempt
   * was unsuccessful, or whose last authentication attempt used
   * anonymous authentication.
   *
   * @return Returns the value of the "reject-unauthenticated-requests" property.
   */
  boolean isRejectUnauthenticatedRequests();



  /**
   * Sets the "reject-unauthenticated-requests" property.
   * <p>
   * Indicates whether the Directory Server should reject any request
   * (other than bind or StartTLS requests) received from a client that
   * has not yet been authenticated, whose last authentication attempt
   * was unsuccessful, or whose last authentication attempt used
   * anonymous authentication.
   *
   * @param value The value of the "reject-unauthenticated-requests" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setRejectUnauthenticatedRequests(Boolean value) throws IllegalPropertyValueException;



  /**
   * Gets the "return-bind-error-messages" property.
   * <p>
   * Indicates whether responses for failed bind operations should
   * include a message string providing the reason for the
   * authentication failure.
   * <p>
   * Note that these messages may include information that could
   * potentially be used by an attacker. If this option is disabled,
   * then these messages appears only in the server's access log.
   *
   * @return Returns the value of the "return-bind-error-messages" property.
   */
  boolean isReturnBindErrorMessages();



  /**
   * Sets the "return-bind-error-messages" property.
   * <p>
   * Indicates whether responses for failed bind operations should
   * include a message string providing the reason for the
   * authentication failure.
   * <p>
   * Note that these messages may include information that could
   * potentially be used by an attacker. If this option is disabled,
   * then these messages appears only in the server's access log.
   *
   * @param value The value of the "return-bind-error-messages" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setReturnBindErrorMessages(Boolean value) throws IllegalPropertyValueException;



  /**
   * Gets the "save-config-on-successful-startup" property.
   * <p>
   * Indicates whether the Directory Server should save a copy of its
   * configuration whenever the startup process completes successfully.
   * <p>
   * This ensures that the server provides a "last known good"
   * configuration, which can be used as a reference (or copied into
   * the active config) if the server fails to start with the current
   * "active" configuration.
   *
   * @return Returns the value of the "save-config-on-successful-startup" property.
   */
  boolean isSaveConfigOnSuccessfulStartup();



  /**
   * Sets the "save-config-on-successful-startup" property.
   * <p>
   * Indicates whether the Directory Server should save a copy of its
   * configuration whenever the startup process completes successfully.
   * <p>
   * This ensures that the server provides a "last known good"
   * configuration, which can be used as a reference (or copied into
   * the active config) if the server fails to start with the current
   * "active" configuration.
   *
   * @param value The value of the "save-config-on-successful-startup" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setSaveConfigOnSuccessfulStartup(Boolean value) throws IllegalPropertyValueException;



  /**
   * Gets the "server-error-result-code" property.
   * <p>
   * Specifies the numeric value of the result code when request
   * processing fails due to an internal server error.
   *
   * @return Returns the value of the "server-error-result-code" property.
   */
  int getServerErrorResultCode();



  /**
   * Sets the "server-error-result-code" property.
   * <p>
   * Specifies the numeric value of the result code when request
   * processing fails due to an internal server error.
   *
   * @param value The value of the "server-error-result-code" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setServerErrorResultCode(Integer value) throws IllegalPropertyValueException;



  /**
   * Gets the "single-structural-objectclass-behavior" property.
   * <p>
   * Specifies how the Directory Server should handle operations an
   * entry does not contain a structural object class or contains
   * multiple structural classes.
   *
   * @return Returns the value of the "single-structural-objectclass-behavior" property.
   */
  SingleStructuralObjectclassBehavior getSingleStructuralObjectclassBehavior();



  /**
   * Sets the "single-structural-objectclass-behavior" property.
   * <p>
   * Specifies how the Directory Server should handle operations an
   * entry does not contain a structural object class or contains
   * multiple structural classes.
   *
   * @param value The value of the "single-structural-objectclass-behavior" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setSingleStructuralObjectclassBehavior(SingleStructuralObjectclassBehavior value) throws IllegalPropertyValueException;



  /**
   * Gets the "size-limit" property.
   * <p>
   * Specifies the maximum number of entries that can be returned to
   * the client during a single search operation.
   * <p>
   * A value of 0 indicates that no size limit is enforced. Note that
   * this is the default server-wide limit, but it may be overridden on
   * a per-user basis using the ds-rlim-size-limit operational
   * attribute.
   *
   * @return Returns the value of the "size-limit" property.
   */
  int getSizeLimit();



  /**
   * Sets the "size-limit" property.
   * <p>
   * Specifies the maximum number of entries that can be returned to
   * the client during a single search operation.
   * <p>
   * A value of 0 indicates that no size limit is enforced. Note that
   * this is the default server-wide limit, but it may be overridden on
   * a per-user basis using the ds-rlim-size-limit operational
   * attribute.
   *
   * @param value The value of the "size-limit" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setSizeLimit(Integer value) throws IllegalPropertyValueException;



  /**
   * Gets the "smtp-server" property.
   * <p>
   * Specifies the address (and optional port number) for a mail
   * server that can be used to send email messages via SMTP.
   * <p>
   * It may be an IP address or resolvable hostname, optionally
   * followed by a colon and a port number.
   *
   * @return Returns the values of the "smtp-server" property.
   */
  SortedSet<String> getSMTPServer();



  /**
   * Sets the "smtp-server" property.
   * <p>
   * Specifies the address (and optional port number) for a mail
   * server that can be used to send email messages via SMTP.
   * <p>
   * It may be an IP address or resolvable hostname, optionally
   * followed by a colon and a port number.
   *
   * @param values The values of the "smtp-server" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setSMTPServer(Collection<String> values) throws IllegalPropertyValueException;



  /**
   * Gets the "time-limit" property.
   * <p>
   * Specifies the maximum length of time that should be spent
   * processing a single search operation.
   * <p>
   * A value of 0 seconds indicates that no time limit is enforced.
   * Note that this is the default server-wide time limit, but it may
   * be overridden on a per-user basis using the ds-rlim-time-limit
   * operational attribute.
   *
   * @return Returns the value of the "time-limit" property.
   */
  long getTimeLimit();



  /**
   * Sets the "time-limit" property.
   * <p>
   * Specifies the maximum length of time that should be spent
   * processing a single search operation.
   * <p>
   * A value of 0 seconds indicates that no time limit is enforced.
   * Note that this is the default server-wide time limit, but it may
   * be overridden on a per-user basis using the ds-rlim-time-limit
   * operational attribute.
   *
   * @param value The value of the "time-limit" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setTimeLimit(Long value) throws IllegalPropertyValueException;



  /**
   * Gets the "workflow-configuration-mode" property.
   * <p>
   * Specifies the workflow configuration mode (auto vs. manual).
   *
   * @return Returns the value of the "workflow-configuration-mode" property.
   */
  WorkflowConfigurationMode getWorkflowConfigurationMode();



  /**
   * Sets the "workflow-configuration-mode" property.
   * <p>
   * Specifies the workflow configuration mode (auto vs. manual).
   *
   * @param value The value of the "workflow-configuration-mode" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setWorkflowConfigurationMode(WorkflowConfigurationMode value) throws IllegalPropertyValueException;



  /**
   * Gets the "writability-mode" property.
   * <p>
   * Specifies the kinds of write operations the Directory Server can
   * process.
   *
   * @return Returns the value of the "writability-mode" property.
   */
  WritabilityMode getWritabilityMode();



  /**
   * Sets the "writability-mode" property.
   * <p>
   * Specifies the kinds of write operations the Directory Server can
   * process.
   *
   * @param value The value of the "writability-mode" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setWritabilityMode(WritabilityMode value) throws IllegalPropertyValueException;

}
