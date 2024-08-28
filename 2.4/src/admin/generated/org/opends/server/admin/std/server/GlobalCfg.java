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



import java.util.SortedSet;
import org.opends.server.admin.Configuration;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.std.meta.GlobalCfgDefn.DisabledPrivilege;
import org.opends.server.admin.std.meta.GlobalCfgDefn.EtimeResolution;
import org.opends.server.admin.std.meta.GlobalCfgDefn.InvalidAttributeSyntaxBehavior;
import org.opends.server.admin.std.meta.GlobalCfgDefn.SingleStructuralObjectclassBehavior;
import org.opends.server.admin.std.meta.GlobalCfgDefn.WorkflowConfigurationMode;
import org.opends.server.admin.std.meta.GlobalCfgDefn.WritabilityMode;
import org.opends.server.types.DN;



/**
 * A server-side interface for querying Global Configuration settings.
 * <p>
 * The Global Configuration contains properties that affect the
 * overall operation of the OpenDS Directory Server .
 */
public interface GlobalCfg extends Configuration {

  /**
   * Gets the configuration class associated with this Global Configuration.
   *
   * @return Returns the configuration class associated with this Global Configuration.
   */
  Class<? extends GlobalCfg> configurationClass();



  /**
   * Register to be notified when this Global Configuration is changed.
   *
   * @param listener
   *          The Global Configuration configuration change listener.
   */
  void addChangeListener(ConfigurationChangeListener<GlobalCfg> listener);



  /**
   * Deregister an existing Global Configuration configuration change listener.
   *
   * @param listener
   *          The Global Configuration configuration change listener.
   */
  void removeChangeListener(ConfigurationChangeListener<GlobalCfg> listener);



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
   * Gets the "allowed-task" property.
   * <p>
   * Specifies the fully-qualified name of a Java class that may be
   * invoked in the server.
   * <p>
   * Any attempt to invoke a task not included in the list of allowed
   * tasks is rejected.
   *
   * @return Returns an unmodifiable set containing the values of the "allowed-task" property.
   */
  SortedSet<String> getAllowedTask();



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
   * Gets the "default-password-policy" property as a DN.
   * <p>
   * Specifies the name of the password policy that is in effect for
   * users whose entries do not specify an alternate password policy
   * (either via a real or virtual attribute).
   *
   * @return Returns the DN value of the "default-password-policy"
   *         property.
   */
  DN getDefaultPasswordPolicyDN();



  /**
   * Gets the "disabled-privilege" property.
   * <p>
   * Specifies the name of a privilege that should not be evaluated by
   * the server.
   * <p>
   * If a privilege is disabled, then it is assumed that all clients
   * (including unauthenticated clients) have that privilege.
   *
   * @return Returns an unmodifiable set containing the values of the "disabled-privilege" property.
   */
  SortedSet<DisabledPrivilege> getDisabledPrivilege();



  /**
   * Gets the "entry-cache-preload" property.
   * <p>
   * Indicates whether or not to preload the entry cache on startup.
   *
   * @return Returns the value of the "entry-cache-preload" property.
   */
  boolean isEntryCachePreload();



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
   * Gets the "proxied-authorization-identity-mapper" property as a
   * DN.
   * <p>
   * Specifies the name of the identity mapper to map authorization ID
   * values (using the "u:" form) provided in the proxied authorization
   * control to the corresponding user entry.
   *
   * @return Returns the DN value of the
   *         "proxied-authorization-identity-mapper" property.
   */
  DN getProxiedAuthorizationIdentityMapperDN();



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
   * Gets the "server-error-result-code" property.
   * <p>
   * Specifies the numeric value of the result code when request
   * processing fails due to an internal server error.
   *
   * @return Returns the value of the "server-error-result-code" property.
   */
  int getServerErrorResultCode();



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
   * Gets the "smtp-server" property.
   * <p>
   * Specifies the address (and optional port number) for a mail
   * server that can be used to send email messages via SMTP.
   * <p>
   * It may be an IP address or resolvable hostname, optionally
   * followed by a colon and a port number.
   *
   * @return Returns an unmodifiable set containing the values of the "smtp-server" property.
   */
  SortedSet<String> getSMTPServer();



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
   * Gets the "workflow-configuration-mode" property.
   * <p>
   * Specifies the workflow configuration mode (auto vs. manual).
   *
   * @return Returns the value of the "workflow-configuration-mode" property.
   */
  WorkflowConfigurationMode getWorkflowConfigurationMode();



  /**
   * Gets the "writability-mode" property.
   * <p>
   * Specifies the kinds of write operations the Directory Server can
   * process.
   *
   * @return Returns the value of the "writability-mode" property.
   */
  WritabilityMode getWritabilityMode();

}
