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
import org.opends.server.admin.client.AuthorizationException;
import org.opends.server.admin.client.CommunicationException;
import org.opends.server.admin.client.ConcurrentModificationException;
import org.opends.server.admin.client.ManagedObjectDecodingException;
import org.opends.server.admin.client.OperationRejectedException;
import org.opends.server.admin.ConfigurationClient;
import org.opends.server.admin.DefaultBehaviorException;
import org.opends.server.admin.DefinitionDecodingException;
import org.opends.server.admin.IllegalPropertyValueException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.ManagedObjectNotFoundException;
import org.opends.server.admin.std.meta.NetworkGroupCfgDefn.AllowedAuthMethod;
import org.opends.server.admin.std.meta.NetworkGroupCfgDefn.AllowedProtocol;
import org.opends.server.admin.std.server.NetworkGroupCfg;
import org.opends.server.admin.std.server.QOSPolicyCfg;
import org.opends.server.types.AddressMask;



/**
 * A client-side interface for reading and modifying Network Group
 * settings.
 * <p>
 * The Network Group is used to classify incoming client connections
 * and route requests to workflows.
 */
public interface NetworkGroupCfgClient extends ConfigurationClient {

  /**
   * Get the configuration definition associated with this Network Group.
   *
   * @return Returns the configuration definition associated with this Network Group.
   */
  ManagedObjectDefinition<? extends NetworkGroupCfgClient, ? extends NetworkGroupCfg> definition();



  /**
   * Gets the "allowed-auth-method" property.
   * <p>
   * Specifies a set of allowed authorization methods that clients
   * must use in order to establish connections to this Network Group.
   *
   * @return Returns the values of the "allowed-auth-method" property.
   */
  SortedSet<AllowedAuthMethod> getAllowedAuthMethod();



  /**
   * Sets the "allowed-auth-method" property.
   * <p>
   * Specifies a set of allowed authorization methods that clients
   * must use in order to establish connections to this Network Group.
   *
   * @param values The values of the "allowed-auth-method" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setAllowedAuthMethod(Collection<AllowedAuthMethod> values) throws IllegalPropertyValueException;



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
   * @return Returns the values of the "allowed-bind-dn" property.
   */
  SortedSet<String> getAllowedBindDN();



  /**
   * Sets the "allowed-bind-dn" property.
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
   * @param values The values of the "allowed-bind-dn" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setAllowedBindDN(Collection<String> values) throws IllegalPropertyValueException;



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
   * @return Returns the values of the "allowed-client" property.
   */
  SortedSet<AddressMask> getAllowedClient();



  /**
   * Sets the "allowed-client" property.
   * <p>
   * Specifies a set of host names or address masks that determine the
   * clients that are allowed to establish connections to this Network
   * Group.
   * <p>
   * Valid values include a host name, a fully qualified domain name,
   * a domain name, an IP address, or a subnetwork with subnetwork
   * mask.
   *
   * @param values The values of the "allowed-client" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setAllowedClient(Collection<AddressMask> values) throws IllegalPropertyValueException;



  /**
   * Gets the "allowed-protocol" property.
   * <p>
   * Specifies a set of allowed supported protocols that clients must
   * use in order to establish connections to this Network Group.
   *
   * @return Returns the values of the "allowed-protocol" property.
   */
  SortedSet<AllowedProtocol> getAllowedProtocol();



  /**
   * Sets the "allowed-protocol" property.
   * <p>
   * Specifies a set of allowed supported protocols that clients must
   * use in order to establish connections to this Network Group.
   *
   * @param values The values of the "allowed-protocol" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setAllowedProtocol(Collection<AllowedProtocol> values) throws IllegalPropertyValueException;



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
   * @return Returns the values of the "denied-client" property.
   */
  SortedSet<AddressMask> getDeniedClient();



  /**
   * Sets the "denied-client" property.
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
   * @param values The values of the "denied-client" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setDeniedClient(Collection<AddressMask> values) throws IllegalPropertyValueException;



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
  Boolean isEnabled();



  /**
   * Sets the "enabled" property.
   * <p>
   * Indicates whether the Network Group is enabled for use in the
   * server.
   * <p>
   * If a Network Group is not enabled then its workflows will not be
   * accessible when processing operations.
   *
   * @param value The value of the "enabled" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setEnabled(boolean value) throws IllegalPropertyValueException;



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
   * Sets the "is-security-mandatory" property.
   * <p>
   * Specifies whether or not a secured client connection is required
   * in order for clients to establish connections to this Network
   * Group.
   *
   * @param value The value of the "is-security-mandatory" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setIsSecurityMandatory(Boolean value) throws IllegalPropertyValueException;



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
  Integer getPriority();



  /**
   * Sets the "priority" property.
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
   * @param value The value of the "priority" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setPriority(int value) throws IllegalPropertyValueException;



  /**
   * Gets the "workflow" property.
   * <p>
   * Specifies a set of workflows which should be accessible from this
   * Network Group .
   *
   * @return Returns the values of the "workflow" property.
   */
  SortedSet<String> getWorkflow();



  /**
   * Sets the "workflow" property.
   * <p>
   * Specifies a set of workflows which should be accessible from this
   * Network Group .
   *
   * @param values The values of the "workflow" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setWorkflow(Collection<String> values) throws IllegalPropertyValueException;



  /**
   * Lists the Network Group QOS Policies.
   *
   * @return Returns an array containing the names of the Network
   *         Group QOS Policies.
   * @throws ConcurrentModificationException
   *           If this Network Group has been removed from the server
   *           by another client.
   * @throws AuthorizationException
   *           If the server refuses to list the Network Group QOS
   *           Policies because the client does not have the correct
   *           privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  String[] listNetworkGroupQOSPolicies() throws ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Gets the named Network Group QOS Policy.
   *
   * @param name
   *           The name of the Network Group QOS Policy to retrieve.
   * @return Returns the named Network Group QOS Policy.
   * @throws DefinitionDecodingException
   *           If the named Network Group QOS Policy was found but its
   *           type could not be determined.
   * @throws ManagedObjectDecodingException
   *           If the named Network Group QOS Policy was found but one
   *           or more of its properties could not be decoded.
   * @throws ManagedObjectNotFoundException
   *           If the named Network Group QOS Policy was not found on
   *           the server.
   * @throws ConcurrentModificationException
   *           If this Network Group has been removed from the server
   *           by another client.
   * @throws AuthorizationException
   *           If the server refuses to retrieve the named Network
   *           Group QOS Policy because the client does not have the
   *           correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  QOSPolicyCfgClient getNetworkGroupQOSPolicy(String name)
      throws DefinitionDecodingException, ManagedObjectDecodingException,
      ManagedObjectNotFoundException, ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Creates a new Network Group QOS Policy. The new Network Group QOS
   * Policy will initially not contain any property values (including
   * mandatory properties). Once the Network Group QOS Policy has been
   * configured it can be added to the server using the {@link
   * #commit()} method.
   *
   * @param <C>
   *          The type of the Network Group QOS Policy being created.
   * @param d
   *          The definition of the Network Group QOS Policy to be
   *          created.
   * @param exceptions
   *          An optional collection in which to place any {@link
   *          DefaultBehaviorException}s that occurred whilst
   *          attempting to determine the default values of the Network
   *          Group QOS Policy. This argument can be <code>null<code>.
   * @return Returns a new Network Group QOS Policy configuration
   *         instance.
   */
  <C extends QOSPolicyCfgClient> C createNetworkGroupQOSPolicy(
      ManagedObjectDefinition<C, ? extends QOSPolicyCfg> d, Collection<DefaultBehaviorException> exceptions);



  /**
   * Removes the named Network Group QOS Policy.
   *
   * @param name
   *          The name of the Network Group QOS Policy to remove.
   * @throws ManagedObjectNotFoundException
   *           If the Network Group QOS Policy does not exist.
   * @throws OperationRejectedException
   *           If the server refuses to remove the Network Group QOS
   *           Policy due to some server-side constraint which cannot
   *           be satisfied (for example, if it is referenced by
   *           another managed object).
   * @throws ConcurrentModificationException
   *           If this Network Group has been removed from the server
   *           by another client.
   * @throws AuthorizationException
   *           If the server refuses to remove the Network Group QOS
   *           Policy because the client does not have the correct
   *           privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  void removeNetworkGroupQOSPolicy(String name)
      throws ManagedObjectNotFoundException, OperationRejectedException,
      ConcurrentModificationException, AuthorizationException,
      CommunicationException;

}
