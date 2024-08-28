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
package org.opends.server.admin.std.meta;



import java.util.Collection;
import java.util.SortedSet;
import java.util.TreeSet;
import org.opends.server.admin.AdministratorAction;
import org.opends.server.admin.AggregationPropertyDefinition;
import org.opends.server.admin.AliasDefaultBehaviorProvider;
import org.opends.server.admin.BooleanPropertyDefinition;
import org.opends.server.admin.client.AuthorizationException;
import org.opends.server.admin.client.CommunicationException;
import org.opends.server.admin.client.ConcurrentModificationException;
import org.opends.server.admin.client.ManagedObject;
import org.opends.server.admin.client.ManagedObjectDecodingException;
import org.opends.server.admin.client.MissingMandatoryPropertiesException;
import org.opends.server.admin.client.OperationRejectedException;
import org.opends.server.admin.condition.Conditions;
import org.opends.server.admin.DefaultBehaviorException;
import org.opends.server.admin.DefaultBehaviorProvider;
import org.opends.server.admin.DefinedDefaultBehaviorProvider;
import org.opends.server.admin.DefinitionDecodingException;
import org.opends.server.admin.EnumPropertyDefinition;
import org.opends.server.admin.IntegerPropertyDefinition;
import org.opends.server.admin.IPAddressMaskPropertyDefinition;
import org.opends.server.admin.ManagedObjectAlreadyExistsException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.ManagedObjectNotFoundException;
import org.opends.server.admin.PropertyOption;
import org.opends.server.admin.PropertyProvider;
import org.opends.server.admin.server.ConfigurationAddListener;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.server.ConfigurationDeleteListener;
import org.opends.server.admin.server.ServerManagedObject;
import org.opends.server.admin.SetRelationDefinition;
import org.opends.server.admin.std.client.NetworkGroupCfgClient;
import org.opends.server.admin.std.client.QOSPolicyCfgClient;
import org.opends.server.admin.std.client.WorkflowCfgClient;
import org.opends.server.admin.std.server.NetworkGroupCfg;
import org.opends.server.admin.std.server.QOSPolicyCfg;
import org.opends.server.admin.std.server.WorkflowCfg;
import org.opends.server.admin.StringPropertyDefinition;
import org.opends.server.admin.Tag;
import org.opends.server.admin.TopCfgDefn;
import org.opends.server.admin.UndefinedDefaultBehaviorProvider;
import org.opends.server.config.ConfigException;
import org.opends.server.types.AddressMask;
import org.opends.server.types.DN;



/**
 * An interface for querying the Network Group managed object
 * definition meta information.
 * <p>
 * The Network Group is used to classify incoming client connections
 * and route requests to workflows.
 */
public final class NetworkGroupCfgDefn extends ManagedObjectDefinition<NetworkGroupCfgClient, NetworkGroupCfg> {

  // The singleton configuration definition instance.
  private static final NetworkGroupCfgDefn INSTANCE = new NetworkGroupCfgDefn();



  /**
   * Defines the set of permissable values for the "allowed-auth-method" property.
   * <p>
   * Specifies a set of allowed authorization methods that clients
   * must use in order to establish connections to this Network Group.
   */
  public static enum AllowedAuthMethod {

    /**
     * Unauthorized clients.
     */
    ANONYMOUS("anonymous"),



    /**
     * Clients who bind using SASL/external certificate based
     * authentication.
     */
    SASL("sasl"),



    /**
     * Clients who bind using simple authentication (name and
     * password).
     */
    SIMPLE("simple");



    // String representation of the value.
    private final String name;



    // Private constructor.
    private AllowedAuthMethod(String name) { this.name = name; }



    /**
     * {@inheritDoc}
     */
    public String toString() { return name; }

  }



  /**
   * Defines the set of permissable values for the "allowed-protocol" property.
   * <p>
   * Specifies a set of allowed supported protocols that clients must
   * use in order to establish connections to this Network Group.
   */
  public static enum AllowedProtocol {

    /**
     * Clients using LDAP are allowed.
     */
    LDAP("ldap"),



    /**
     * Clients using LDAPS are allowed.
     */
    LDAPS("ldaps");



    // String representation of the value.
    private final String name;



    // Private constructor.
    private AllowedProtocol(String name) { this.name = name; }



    /**
     * {@inheritDoc}
     */
    public String toString() { return name; }

  }



  // The "allowed-auth-method" property definition.
  private static final EnumPropertyDefinition<AllowedAuthMethod> PD_ALLOWED_AUTH_METHOD;



  // The "allowed-bind-dn" property definition.
  private static final StringPropertyDefinition PD_ALLOWED_BIND_DN;



  // The "allowed-client" property definition.
  private static final IPAddressMaskPropertyDefinition PD_ALLOWED_CLIENT;



  // The "allowed-protocol" property definition.
  private static final EnumPropertyDefinition<AllowedProtocol> PD_ALLOWED_PROTOCOL;



  // The "denied-client" property definition.
  private static final IPAddressMaskPropertyDefinition PD_DENIED_CLIENT;



  // The "enabled" property definition.
  private static final BooleanPropertyDefinition PD_ENABLED;



  // The "is-security-mandatory" property definition.
  private static final BooleanPropertyDefinition PD_IS_SECURITY_MANDATORY;



  // The "priority" property definition.
  private static final IntegerPropertyDefinition PD_PRIORITY;



  // The "workflow" property definition.
  private static final AggregationPropertyDefinition<WorkflowCfgClient, WorkflowCfg> PD_WORKFLOW;



  // The "network-group-qos-policies" relation definition.
  private static final SetRelationDefinition<QOSPolicyCfgClient, QOSPolicyCfg> RD_NETWORK_GROUP_QOS_POLICIES;



  // Build the "allowed-auth-method" property definition.
  static {
      EnumPropertyDefinition.Builder<AllowedAuthMethod> builder = EnumPropertyDefinition.createBuilder(INSTANCE, "allowed-auth-method");
      builder.setOption(PropertyOption.MULTI_VALUED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "allowed-auth-method"));
      builder.setDefaultBehaviorProvider(new AliasDefaultBehaviorProvider<AllowedAuthMethod>(INSTANCE, "allowed-auth-method"));
      builder.setEnumClass(AllowedAuthMethod.class);
      PD_ALLOWED_AUTH_METHOD = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_ALLOWED_AUTH_METHOD);
  }



  // Build the "allowed-bind-dn" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "allowed-bind-dn");
      builder.setOption(PropertyOption.MULTI_VALUED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "allowed-bind-dn"));
      builder.setDefaultBehaviorProvider(new AliasDefaultBehaviorProvider<String>(INSTANCE, "allowed-bind-dn"));
      PD_ALLOWED_BIND_DN = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_ALLOWED_BIND_DN);
  }



  // Build the "allowed-client" property definition.
  static {
      IPAddressMaskPropertyDefinition.Builder builder = IPAddressMaskPropertyDefinition.createBuilder(INSTANCE, "allowed-client");
      builder.setOption(PropertyOption.MULTI_VALUED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "allowed-client"));
      builder.setDefaultBehaviorProvider(new AliasDefaultBehaviorProvider<AddressMask>(INSTANCE, "allowed-client"));
      PD_ALLOWED_CLIENT = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_ALLOWED_CLIENT);
  }



  // Build the "allowed-protocol" property definition.
  static {
      EnumPropertyDefinition.Builder<AllowedProtocol> builder = EnumPropertyDefinition.createBuilder(INSTANCE, "allowed-protocol");
      builder.setOption(PropertyOption.MULTI_VALUED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "allowed-protocol"));
      builder.setDefaultBehaviorProvider(new AliasDefaultBehaviorProvider<AllowedProtocol>(INSTANCE, "allowed-protocol"));
      builder.setEnumClass(AllowedProtocol.class);
      PD_ALLOWED_PROTOCOL = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_ALLOWED_PROTOCOL);
  }



  // Build the "denied-client" property definition.
  static {
      IPAddressMaskPropertyDefinition.Builder builder = IPAddressMaskPropertyDefinition.createBuilder(INSTANCE, "denied-client");
      builder.setOption(PropertyOption.MULTI_VALUED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "denied-client"));
      builder.setDefaultBehaviorProvider(new AliasDefaultBehaviorProvider<AddressMask>(INSTANCE, "denied-client"));
      PD_DENIED_CLIENT = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_DENIED_CLIENT);
  }



  // Build the "enabled" property definition.
  static {
      BooleanPropertyDefinition.Builder builder = BooleanPropertyDefinition.createBuilder(INSTANCE, "enabled");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "enabled"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<Boolean>());
      PD_ENABLED = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_ENABLED);
  }



  // Build the "is-security-mandatory" property definition.
  static {
      BooleanPropertyDefinition.Builder builder = BooleanPropertyDefinition.createBuilder(INSTANCE, "is-security-mandatory");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "is-security-mandatory"));
      DefaultBehaviorProvider<Boolean> provider = new DefinedDefaultBehaviorProvider<Boolean>("false");
      builder.setDefaultBehaviorProvider(provider);
      PD_IS_SECURITY_MANDATORY = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_IS_SECURITY_MANDATORY);
  }



  // Build the "priority" property definition.
  static {
      IntegerPropertyDefinition.Builder builder = IntegerPropertyDefinition.createBuilder(INSTANCE, "priority");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "priority"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<Integer>());
      builder.setLowerLimit(0);
      PD_PRIORITY = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_PRIORITY);
  }



  // Build the "workflow" property definition.
  static {
      AggregationPropertyDefinition.Builder<WorkflowCfgClient, WorkflowCfg> builder = AggregationPropertyDefinition.createBuilder(INSTANCE, "workflow");
      builder.setOption(PropertyOption.MULTI_VALUED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "workflow"));
      builder.setDefaultBehaviorProvider(new AliasDefaultBehaviorProvider<String>(INSTANCE, "workflow"));
      builder.setParentPath("/");
      builder.setRelationDefinition("workflow");
      builder.setTargetIsEnabledCondition(Conditions.contains("enabled", "true"));
      PD_WORKFLOW = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_WORKFLOW);
      INSTANCE.registerConstraint(PD_WORKFLOW.getSourceConstraint());
  }



  // Build the "network-group-qos-policies" relation definition.
  static {
    SetRelationDefinition.Builder<QOSPolicyCfgClient, QOSPolicyCfg> builder =
      new SetRelationDefinition.Builder<QOSPolicyCfgClient, QOSPolicyCfg>(INSTANCE, "network-group-qos-policy", "network-group-qos-policies", QOSPolicyCfgDefn.getInstance());
    RD_NETWORK_GROUP_QOS_POLICIES = builder.getInstance();
    INSTANCE.registerRelationDefinition(RD_NETWORK_GROUP_QOS_POLICIES);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("core-server"));
  }



  /**
   * Get the Network Group configuration definition singleton.
   *
   * @return Returns the Network Group configuration definition
   *         singleton.
   */
  public static NetworkGroupCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private NetworkGroupCfgDefn() {
    super("network-group", TopCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public NetworkGroupCfgClient createClientConfiguration(
      ManagedObject<? extends NetworkGroupCfgClient> impl) {
    return new NetworkGroupCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public NetworkGroupCfg createServerConfiguration(
      ServerManagedObject<? extends NetworkGroupCfg> impl) {
    return new NetworkGroupCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<NetworkGroupCfg> getServerConfigurationClass() {
    return NetworkGroupCfg.class;
  }



  /**
   * Get the "allowed-auth-method" property definition.
   * <p>
   * Specifies a set of allowed authorization methods that clients
   * must use in order to establish connections to this Network Group.
   *
   * @return Returns the "allowed-auth-method" property definition.
   */
  public EnumPropertyDefinition<AllowedAuthMethod> getAllowedAuthMethodPropertyDefinition() {
    return PD_ALLOWED_AUTH_METHOD;
  }



  /**
   * Get the "allowed-bind-dn" property definition.
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
   * @return Returns the "allowed-bind-dn" property definition.
   */
  public StringPropertyDefinition getAllowedBindDNPropertyDefinition() {
    return PD_ALLOWED_BIND_DN;
  }



  /**
   * Get the "allowed-client" property definition.
   * <p>
   * Specifies a set of host names or address masks that determine the
   * clients that are allowed to establish connections to this Network
   * Group.
   * <p>
   * Valid values include a host name, a fully qualified domain name,
   * a domain name, an IP address, or a subnetwork with subnetwork
   * mask.
   *
   * @return Returns the "allowed-client" property definition.
   */
  public IPAddressMaskPropertyDefinition getAllowedClientPropertyDefinition() {
    return PD_ALLOWED_CLIENT;
  }



  /**
   * Get the "allowed-protocol" property definition.
   * <p>
   * Specifies a set of allowed supported protocols that clients must
   * use in order to establish connections to this Network Group.
   *
   * @return Returns the "allowed-protocol" property definition.
   */
  public EnumPropertyDefinition<AllowedProtocol> getAllowedProtocolPropertyDefinition() {
    return PD_ALLOWED_PROTOCOL;
  }



  /**
   * Get the "denied-client" property definition.
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
   * @return Returns the "denied-client" property definition.
   */
  public IPAddressMaskPropertyDefinition getDeniedClientPropertyDefinition() {
    return PD_DENIED_CLIENT;
  }



  /**
   * Get the "enabled" property definition.
   * <p>
   * Indicates whether the Network Group is enabled for use in the
   * server.
   * <p>
   * If a Network Group is not enabled then its workflows will not be
   * accessible when processing operations.
   *
   * @return Returns the "enabled" property definition.
   */
  public BooleanPropertyDefinition getEnabledPropertyDefinition() {
    return PD_ENABLED;
  }



  /**
   * Get the "is-security-mandatory" property definition.
   * <p>
   * Specifies whether or not a secured client connection is required
   * in order for clients to establish connections to this Network
   * Group.
   *
   * @return Returns the "is-security-mandatory" property definition.
   */
  public BooleanPropertyDefinition getIsSecurityMandatoryPropertyDefinition() {
    return PD_IS_SECURITY_MANDATORY;
  }



  /**
   * Get the "priority" property definition.
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
   * @return Returns the "priority" property definition.
   */
  public IntegerPropertyDefinition getPriorityPropertyDefinition() {
    return PD_PRIORITY;
  }



  /**
   * Get the "workflow" property definition.
   * <p>
   * Specifies a set of workflows which should be accessible from this
   * Network Group .
   *
   * @return Returns the "workflow" property definition.
   */
  public AggregationPropertyDefinition<WorkflowCfgClient, WorkflowCfg> getWorkflowPropertyDefinition() {
    return PD_WORKFLOW;
  }



  /**
   * Get the "network-group-qos-policies" relation definition.
   *
   * @return Returns the "network-group-qos-policies" relation definition.
   */
  public SetRelationDefinition<QOSPolicyCfgClient,QOSPolicyCfg> getNetworkGroupQOSPoliciesRelationDefinition() {
    return RD_NETWORK_GROUP_QOS_POLICIES;
  }



  /**
   * Managed object client implementation.
   */
  private static class NetworkGroupCfgClientImpl implements
    NetworkGroupCfgClient {

    // Private implementation.
    private ManagedObject<? extends NetworkGroupCfgClient> impl;



    // Private constructor.
    private NetworkGroupCfgClientImpl(
        ManagedObject<? extends NetworkGroupCfgClient> impl) {
      this.impl = impl;
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<AllowedAuthMethod> getAllowedAuthMethod() {
      return impl.getPropertyValues(INSTANCE.getAllowedAuthMethodPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setAllowedAuthMethod(Collection<AllowedAuthMethod> values) {
      impl.setPropertyValues(INSTANCE.getAllowedAuthMethodPropertyDefinition(), values);
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<String> getAllowedBindDN() {
      return impl.getPropertyValues(INSTANCE.getAllowedBindDNPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setAllowedBindDN(Collection<String> values) {
      impl.setPropertyValues(INSTANCE.getAllowedBindDNPropertyDefinition(), values);
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<AddressMask> getAllowedClient() {
      return impl.getPropertyValues(INSTANCE.getAllowedClientPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setAllowedClient(Collection<AddressMask> values) {
      impl.setPropertyValues(INSTANCE.getAllowedClientPropertyDefinition(), values);
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<AllowedProtocol> getAllowedProtocol() {
      return impl.getPropertyValues(INSTANCE.getAllowedProtocolPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setAllowedProtocol(Collection<AllowedProtocol> values) {
      impl.setPropertyValues(INSTANCE.getAllowedProtocolPropertyDefinition(), values);
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<AddressMask> getDeniedClient() {
      return impl.getPropertyValues(INSTANCE.getDeniedClientPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setDeniedClient(Collection<AddressMask> values) {
      impl.setPropertyValues(INSTANCE.getDeniedClientPropertyDefinition(), values);
    }



    /**
     * {@inheritDoc}
     */
    public Boolean isEnabled() {
      return impl.getPropertyValue(INSTANCE.getEnabledPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setEnabled(boolean value) {
      impl.setPropertyValue(INSTANCE.getEnabledPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public boolean isIsSecurityMandatory() {
      return impl.getPropertyValue(INSTANCE.getIsSecurityMandatoryPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setIsSecurityMandatory(Boolean value) {
      impl.setPropertyValue(INSTANCE.getIsSecurityMandatoryPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public Integer getPriority() {
      return impl.getPropertyValue(INSTANCE.getPriorityPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setPriority(int value) {
      impl.setPropertyValue(INSTANCE.getPriorityPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<String> getWorkflow() {
      return impl.getPropertyValues(INSTANCE.getWorkflowPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setWorkflow(Collection<String> values) {
      impl.setPropertyValues(INSTANCE.getWorkflowPropertyDefinition(), values);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listNetworkGroupQOSPolicies() throws ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.listChildren(INSTANCE.getNetworkGroupQOSPoliciesRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public QOSPolicyCfgClient getNetworkGroupQOSPolicy(String name)
        throws DefinitionDecodingException, ManagedObjectDecodingException,
        ManagedObjectNotFoundException, ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.getChild(INSTANCE.getNetworkGroupQOSPoliciesRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public <M extends QOSPolicyCfgClient> M createNetworkGroupQOSPolicy(
        ManagedObjectDefinition<M, ? extends QOSPolicyCfg> d, Collection<DefaultBehaviorException> exceptions) {
      return impl.createChild(INSTANCE.getNetworkGroupQOSPoliciesRelationDefinition(), d, exceptions).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void removeNetworkGroupQOSPolicy(String name)
        throws ManagedObjectNotFoundException, ConcurrentModificationException,
        OperationRejectedException, AuthorizationException, CommunicationException {
      impl.removeChild(INSTANCE.getNetworkGroupQOSPoliciesRelationDefinition(), name);
    }



    /**
     * {@inheritDoc}
     */
    public ManagedObjectDefinition<? extends NetworkGroupCfgClient, ? extends NetworkGroupCfg> definition() {
      return INSTANCE;
    }



    /**
     * {@inheritDoc}
     */
    public PropertyProvider properties() {
      return impl;
    }



    /**
     * {@inheritDoc}
     */
    public void commit() throws ManagedObjectAlreadyExistsException,
        MissingMandatoryPropertiesException, ConcurrentModificationException,
        OperationRejectedException, AuthorizationException,
        CommunicationException {
      impl.commit();
    }

  }



  /**
   * Managed object server implementation.
   */
  private static class NetworkGroupCfgServerImpl implements
    NetworkGroupCfg {

    // Private implementation.
    private ServerManagedObject<? extends NetworkGroupCfg> impl;

    // The value of the "allowed-auth-method" property.
    private final SortedSet<AllowedAuthMethod> pAllowedAuthMethod;

    // The value of the "allowed-bind-dn" property.
    private final SortedSet<String> pAllowedBindDN;

    // The value of the "allowed-client" property.
    private final SortedSet<AddressMask> pAllowedClient;

    // The value of the "allowed-protocol" property.
    private final SortedSet<AllowedProtocol> pAllowedProtocol;

    // The value of the "denied-client" property.
    private final SortedSet<AddressMask> pDeniedClient;

    // The value of the "enabled" property.
    private final boolean pEnabled;

    // The value of the "is-security-mandatory" property.
    private final boolean pIsSecurityMandatory;

    // The value of the "priority" property.
    private final int pPriority;

    // The value of the "workflow" property.
    private final SortedSet<String> pWorkflow;



    // Private constructor.
    private NetworkGroupCfgServerImpl(ServerManagedObject<? extends NetworkGroupCfg> impl) {
      this.impl = impl;
      this.pAllowedAuthMethod = impl.getPropertyValues(INSTANCE.getAllowedAuthMethodPropertyDefinition());
      this.pAllowedBindDN = impl.getPropertyValues(INSTANCE.getAllowedBindDNPropertyDefinition());
      this.pAllowedClient = impl.getPropertyValues(INSTANCE.getAllowedClientPropertyDefinition());
      this.pAllowedProtocol = impl.getPropertyValues(INSTANCE.getAllowedProtocolPropertyDefinition());
      this.pDeniedClient = impl.getPropertyValues(INSTANCE.getDeniedClientPropertyDefinition());
      this.pEnabled = impl.getPropertyValue(INSTANCE.getEnabledPropertyDefinition());
      this.pIsSecurityMandatory = impl.getPropertyValue(INSTANCE.getIsSecurityMandatoryPropertyDefinition());
      this.pPriority = impl.getPropertyValue(INSTANCE.getPriorityPropertyDefinition());
      this.pWorkflow = impl.getPropertyValues(INSTANCE.getWorkflowPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addChangeListener(
        ConfigurationChangeListener<NetworkGroupCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeChangeListener(
        ConfigurationChangeListener<NetworkGroupCfg> listener) {
      impl.deregisterChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<AllowedAuthMethod> getAllowedAuthMethod() {
      return pAllowedAuthMethod;
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<String> getAllowedBindDN() {
      return pAllowedBindDN;
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<AddressMask> getAllowedClient() {
      return pAllowedClient;
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<AllowedProtocol> getAllowedProtocol() {
      return pAllowedProtocol;
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<AddressMask> getDeniedClient() {
      return pDeniedClient;
    }



    /**
     * {@inheritDoc}
     */
    public boolean isEnabled() {
      return pEnabled;
    }



    /**
     * {@inheritDoc}
     */
    public boolean isIsSecurityMandatory() {
      return pIsSecurityMandatory;
    }



    /**
     * {@inheritDoc}
     */
    public int getPriority() {
      return pPriority;
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<String> getWorkflow() {
      return pWorkflow;
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<DN> getWorkflowDNs() {
      SortedSet<String> values = getWorkflow();
      SortedSet<DN> dnValues = new TreeSet<DN>();
      for (String value : values) {
        DN dn = INSTANCE.getWorkflowPropertyDefinition().getChildDN(value);
        dnValues.add(dn);
      }
      return dnValues;
    }



    /**
     * {@inheritDoc}
     */
    public String[] listNetworkGroupQOSPolicies() {
      return impl.listChildren(INSTANCE.getNetworkGroupQOSPoliciesRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public QOSPolicyCfg getNetworkGroupQOSPolicy(String name) throws ConfigException {
      return impl.getChild(INSTANCE.getNetworkGroupQOSPoliciesRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void addNetworkGroupQOSPolicyAddListener(
        ConfigurationAddListener<QOSPolicyCfg> listener) throws ConfigException {
      impl.registerAddListener(INSTANCE.getNetworkGroupQOSPoliciesRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeNetworkGroupQOSPolicyAddListener(
        ConfigurationAddListener<QOSPolicyCfg> listener) {
      impl.deregisterAddListener(INSTANCE.getNetworkGroupQOSPoliciesRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void addNetworkGroupQOSPolicyDeleteListener(
        ConfigurationDeleteListener<QOSPolicyCfg> listener) throws ConfigException {
      impl.registerDeleteListener(INSTANCE.getNetworkGroupQOSPoliciesRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeNetworkGroupQOSPolicyDeleteListener(
        ConfigurationDeleteListener<QOSPolicyCfg> listener) {
      impl.deregisterDeleteListener(INSTANCE.getNetworkGroupQOSPoliciesRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public Class<? extends NetworkGroupCfg> configurationClass() {
      return NetworkGroupCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
