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
import org.opends.server.admin.server.ConfigurationAddListener;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.server.ConfigurationDeleteListener;
import org.opends.server.admin.std.meta.NetworkGroupCfgDefn.AllowedAuthMethod;
import org.opends.server.admin.std.meta.NetworkGroupCfgDefn.AllowedProtocol;
import org.opends.server.config.ConfigException;
import org.opends.server.types.AddressMask;
import org.opends.server.types.DN;



/**
 * A server-side interface for querying Network Group settings.
 * <p>
 * The Network Group is used to classify incoming client connections
 * and route requests to workflows.
 */
public interface NetworkGroupCfg extends Configuration {

  /**
   * Gets the configuration class associated with this Network Group.
   *
   * @return Returns the configuration class associated with this Network Group.
   */
  Class<? extends NetworkGroupCfg> configurationClass();



  /**
   * Register to be notified when this Network Group is changed.
   *
   * @param listener
   *          The Network Group configuration change listener.
   */
  void addChangeListener(ConfigurationChangeListener<NetworkGroupCfg> listener);



  /**
   * Deregister an existing Network Group configuration change listener.
   *
   * @param listener
   *          The Network Group configuration change listener.
   */
  void removeChangeListener(ConfigurationChangeListener<NetworkGroupCfg> listener);



  /**
   * Gets the "allowed-auth-method" property.
   * <p>
   * Specifies a set of allowed authorization methods that clients
   * must use in order to establish connections to this Network Group.
   *
   * @return Returns an unmodifiable set containing the values of the "allowed-auth-method" property.
   */
  SortedSet<AllowedAuthMethod> getAllowedAuthMethod();



  /**
   * Gets the "allowed-bind-dn" property.
   * <p>
   * Specifies a set of bind DN patterns that determine the clients
   * that are allowed to establish connections to this Network Group.
   * <p>
   * Valid bind DN filters are strings composed of zero or more
   * wildcards. A double wildcard ** replaces one or more RDN
   * components (as in uid=dmiller,**,dc=example,dc=com). A simple
   * wildcard * replaces either a whole RDN, or a whole type, or a
   * value substring (as in uid=bj*,ou=people,dc=example,dc=com).
   *
   * @return Returns an unmodifiable set containing the values of the "allowed-bind-dn" property.
   */
  SortedSet<String> getAllowedBindDN();



  /**
   * Gets the "allowed-client" property.
   * <p>
   * Specifies a set of host names or address masks that determine the
   * clients that are allowed to establish connections to this Network
   * Group.
   * <p>
   * Valid values include a host name, a fully qualified domain name,
   * a domain name, an IP address, or a subnetwork with subnetwork
   * mask.
   *
   * @return Returns an unmodifiable set containing the values of the "allowed-client" property.
   */
  SortedSet<AddressMask> getAllowedClient();



  /**
   * Gets the "allowed-protocol" property.
   * <p>
   * Specifies a set of allowed supported protocols that clients must
   * use in order to establish connections to this Network Group.
   *
   * @return Returns an unmodifiable set containing the values of the "allowed-protocol" property.
   */
  SortedSet<AllowedProtocol> getAllowedProtocol();



  /**
   * Gets the "denied-client" property.
   * <p>
   * Specifies a set of host names or address masks that determine the
   * clients that are not allowed to establish connections to this
   * Network Group.
   * <p>
   * Valid values include a host name, a fully qualified domain name,
   * a domain name, an IP address, or a subnetwork with subnetwork
   * mask. If both allowed and denied client masks are defined and a
   * client connection matches one or more masks in both lists, then
   * the connection is denied. If only a denied list is specified, then
   * any client not matching a mask in that list is allowed.
   *
   * @return Returns an unmodifiable set containing the values of the "denied-client" property.
   */
  SortedSet<AddressMask> getDeniedClient();



  /**
   * Gets the "enabled" property.
   * <p>
   * Indicates whether the Network Group is enabled for use in the
   * server.
   * <p>
   * If a Network Group is not enabled then its workflows will not be
   * accessible when processing operations.
   *
   * @return Returns the value of the "enabled" property.
   */
  boolean isEnabled();



  /**
   * Gets the "is-security-mandatory" property.
   * <p>
   * Specifies whether or not a secured client connection is required
   * in order for clients to establish connections to this Network
   * Group.
   *
   * @return Returns the value of the "is-security-mandatory" property.
   */
  boolean isIsSecurityMandatory();



  /**
   * Gets the "priority" property.
   * <p>
   * Specifies the priority for this Network Group.
   * <p>
   * A client connection is first compared against the Network Group
   * with the lowest priority. If the client connection does not match
   * its connection criteria, then the client connection is compared
   * against the Network Group with next lowest priority, and so on. If
   * no Network Group is selected then the client connection is
   * rejected.
   *
   * @return Returns the value of the "priority" property.
   */
  int getPriority();



  /**
   * Gets the "workflow" property.
   * <p>
   * Specifies a set of workflows which should be accessible from this
   * Network Group .
   *
   * @return Returns an unmodifiable set containing the values of the "workflow" property.
   */
  SortedSet<String> getWorkflow();



  /**
   * Gets the "workflow" property as a set of DNs.
   * <p>
   * Specifies a set of workflows which should be accessible from this
   * Network Group .
   *
   * @return Returns the DN values of the "workflow" property.
   */
  SortedSet<DN> getWorkflowDNs();



  /**
   * Lists the Network Group QOS Policies.
   *
   * @return Returns an array containing the names of the
   *         Network Group QOS Policies.
   */
  String[] listNetworkGroupQOSPolicies();



  /**
   * Gets the named Network Group QOS Policy.
   *
   * @param name
   *          The name of the Network Group QOS Policy to retrieve.
   * @return Returns the named Network Group QOS Policy.
   * @throws ConfigException
   *           If the Network Group QOS Policy could not be found or it
   *           could not be successfully decoded.
   */
  QOSPolicyCfg getNetworkGroupQOSPolicy(String name) throws ConfigException;



  /**
   * Registers to be notified when new Network Group QOS Policies are added.
   *
   * @param listener
   *          The Network Group QOS Policy configuration add listener.
   * @throws ConfigException
   *          If the add listener could not be registered.
   */
  void addNetworkGroupQOSPolicyAddListener(ConfigurationAddListener<QOSPolicyCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Network Group QOS Policy configuration add listener.
   *
   * @param listener
   *          The Network Group QOS Policy configuration add listener.
   */
  void removeNetworkGroupQOSPolicyAddListener(ConfigurationAddListener<QOSPolicyCfg> listener);



  /**
   * Registers to be notified when existing Network Group QOS Policies are deleted.
   *
   * @param listener
   *          The Network Group QOS Policy configuration delete listener.
   * @throws ConfigException
   *          If the delete listener could not be registered.
   */
  void addNetworkGroupQOSPolicyDeleteListener(ConfigurationDeleteListener<QOSPolicyCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Network Group QOS Policy configuration delete listener.
   *
   * @param listener
   *          The Network Group QOS Policy configuration delete listener.
   */
  void removeNetworkGroupQOSPolicyDeleteListener(ConfigurationDeleteListener<QOSPolicyCfg> listener);

}
