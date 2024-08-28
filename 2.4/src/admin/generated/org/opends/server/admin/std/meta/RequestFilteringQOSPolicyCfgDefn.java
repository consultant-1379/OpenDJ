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
import org.opends.server.admin.AdministratorAction;
import org.opends.server.admin.AliasDefaultBehaviorProvider;
import org.opends.server.admin.ClassPropertyDefinition;
import org.opends.server.admin.client.AuthorizationException;
import org.opends.server.admin.client.CommunicationException;
import org.opends.server.admin.client.ConcurrentModificationException;
import org.opends.server.admin.client.ManagedObject;
import org.opends.server.admin.client.MissingMandatoryPropertiesException;
import org.opends.server.admin.client.OperationRejectedException;
import org.opends.server.admin.DefaultBehaviorProvider;
import org.opends.server.admin.DefinedDefaultBehaviorProvider;
import org.opends.server.admin.DNPropertyDefinition;
import org.opends.server.admin.EnumPropertyDefinition;
import org.opends.server.admin.ManagedObjectAlreadyExistsException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.PropertyOption;
import org.opends.server.admin.PropertyProvider;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.server.ServerManagedObject;
import org.opends.server.admin.std.client.RequestFilteringQOSPolicyCfgClient;
import org.opends.server.admin.std.server.QOSPolicyCfg;
import org.opends.server.admin.std.server.RequestFilteringQOSPolicyCfg;
import org.opends.server.admin.StringPropertyDefinition;
import org.opends.server.admin.Tag;
import org.opends.server.types.DN;



/**
 * An interface for querying the Request Filtering QOS Policy managed
 * object definition meta information.
 * <p>
 * The Request Filtering QOS Policy is used to define the type of
 * requests allowed by the server.
 */
public final class RequestFilteringQOSPolicyCfgDefn extends ManagedObjectDefinition<RequestFilteringQOSPolicyCfgClient, RequestFilteringQOSPolicyCfg> {

  // The singleton configuration definition instance.
  private static final RequestFilteringQOSPolicyCfgDefn INSTANCE = new RequestFilteringQOSPolicyCfgDefn();



  /**
   * Defines the set of permissable values for the "allowed-operations" property.
   * <p>
   * Specifies which operations are allowed by the server.
   */
  public static enum AllowedOperations {

    /**
     * Add operations.
     */
    ADD("add"),



    /**
     * Bind operations.
     */
    BIND("bind"),



    /**
     * Compare operations
     */
    COMPARE("compare"),



    /**
     * Delete operations
     */
    DELETE("delete"),



    /**
     * Extended operations
     */
    EXTENDED("extended"),



    /**
     * Inequality Search operations
     */
    INEQUALITY_SEARCH("inequality-search"),



    /**
     * Modify operations
     */
    MODIFY("modify"),



    /**
     * Rename operations
     */
    RENAME("rename"),



    /**
     * Search operations
     */
    SEARCH("search");



    // String representation of the value.
    private final String name;



    // Private constructor.
    private AllowedOperations(String name) { this.name = name; }



    /**
     * {@inheritDoc}
     */
    public String toString() { return name; }

  }



  /**
   * Defines the set of permissable values for the "allowed-search-scopes" property.
   * <p>
   * Specifies which search scopes are allowed by the server.
   */
  public static enum AllowedSearchScopes {

    /**
     * Base-object search.
     */
    BASE("base"),



    /**
     * Subordinate subtree search
     */
    CHILDREN("children"),



    /**
     * One-level search.
     */
    ONE("one"),



    /**
     * Whole subtree search
     */
    SUB("sub");



    // String representation of the value.
    private final String name;



    // Private constructor.
    private AllowedSearchScopes(String name) { this.name = name; }



    /**
     * {@inheritDoc}
     */
    public String toString() { return name; }

  }



  // The "allowed-attributes" property definition.
  private static final StringPropertyDefinition PD_ALLOWED_ATTRIBUTES;



  // The "allowed-operations" property definition.
  private static final EnumPropertyDefinition<AllowedOperations> PD_ALLOWED_OPERATIONS;



  // The "allowed-search-scopes" property definition.
  private static final EnumPropertyDefinition<AllowedSearchScopes> PD_ALLOWED_SEARCH_SCOPES;



  // The "allowed-subtrees" property definition.
  private static final DNPropertyDefinition PD_ALLOWED_SUBTREES;



  // The "java-class" property definition.
  private static final ClassPropertyDefinition PD_JAVA_CLASS;



  // The "prohibited-attributes" property definition.
  private static final StringPropertyDefinition PD_PROHIBITED_ATTRIBUTES;



  // The "prohibited-subtrees" property definition.
  private static final DNPropertyDefinition PD_PROHIBITED_SUBTREES;



  // Build the "allowed-attributes" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "allowed-attributes");
      builder.setOption(PropertyOption.MULTI_VALUED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "allowed-attributes"));
      builder.setDefaultBehaviorProvider(new AliasDefaultBehaviorProvider<String>(INSTANCE, "allowed-attributes"));
      PD_ALLOWED_ATTRIBUTES = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_ALLOWED_ATTRIBUTES);
  }



  // Build the "allowed-operations" property definition.
  static {
      EnumPropertyDefinition.Builder<AllowedOperations> builder = EnumPropertyDefinition.createBuilder(INSTANCE, "allowed-operations");
      builder.setOption(PropertyOption.MULTI_VALUED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "allowed-operations"));
      builder.setDefaultBehaviorProvider(new AliasDefaultBehaviorProvider<AllowedOperations>(INSTANCE, "allowed-operations"));
      builder.setEnumClass(AllowedOperations.class);
      PD_ALLOWED_OPERATIONS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_ALLOWED_OPERATIONS);
  }



  // Build the "allowed-search-scopes" property definition.
  static {
      EnumPropertyDefinition.Builder<AllowedSearchScopes> builder = EnumPropertyDefinition.createBuilder(INSTANCE, "allowed-search-scopes");
      builder.setOption(PropertyOption.MULTI_VALUED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "allowed-search-scopes"));
      builder.setDefaultBehaviorProvider(new AliasDefaultBehaviorProvider<AllowedSearchScopes>(INSTANCE, "allowed-search-scopes"));
      builder.setEnumClass(AllowedSearchScopes.class);
      PD_ALLOWED_SEARCH_SCOPES = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_ALLOWED_SEARCH_SCOPES);
  }



  // Build the "allowed-subtrees" property definition.
  static {
      DNPropertyDefinition.Builder builder = DNPropertyDefinition.createBuilder(INSTANCE, "allowed-subtrees");
      builder.setOption(PropertyOption.MULTI_VALUED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "allowed-subtrees"));
      builder.setDefaultBehaviorProvider(new AliasDefaultBehaviorProvider<DN>(INSTANCE, "allowed-subtrees"));
      PD_ALLOWED_SUBTREES = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_ALLOWED_SUBTREES);
  }



  // Build the "java-class" property definition.
  static {
      ClassPropertyDefinition.Builder builder = ClassPropertyDefinition.createBuilder(INSTANCE, "java-class");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.COMPONENT_RESTART, INSTANCE, "java-class"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("org.opends.server.core.networkgroups.RequestFilteringPolicyFactory");
      builder.setDefaultBehaviorProvider(provider);
      builder.addInstanceOf("org.opends.server.api.QOSPolicyFactory");
      PD_JAVA_CLASS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_JAVA_CLASS);
  }



  // Build the "prohibited-attributes" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "prohibited-attributes");
      builder.setOption(PropertyOption.MULTI_VALUED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "prohibited-attributes"));
      builder.setDefaultBehaviorProvider(new AliasDefaultBehaviorProvider<String>(INSTANCE, "prohibited-attributes"));
      PD_PROHIBITED_ATTRIBUTES = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_PROHIBITED_ATTRIBUTES);
  }



  // Build the "prohibited-subtrees" property definition.
  static {
      DNPropertyDefinition.Builder builder = DNPropertyDefinition.createBuilder(INSTANCE, "prohibited-subtrees");
      builder.setOption(PropertyOption.MULTI_VALUED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "prohibited-subtrees"));
      builder.setDefaultBehaviorProvider(new AliasDefaultBehaviorProvider<DN>(INSTANCE, "prohibited-subtrees"));
      PD_PROHIBITED_SUBTREES = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_PROHIBITED_SUBTREES);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("core-server"));
  }



  /**
   * Get the Request Filtering QOS Policy configuration definition
   * singleton.
   *
   * @return Returns the Request Filtering QOS Policy configuration
   *         definition singleton.
   */
  public static RequestFilteringQOSPolicyCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private RequestFilteringQOSPolicyCfgDefn() {
    super("request-filtering-qos-policy", QOSPolicyCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public RequestFilteringQOSPolicyCfgClient createClientConfiguration(
      ManagedObject<? extends RequestFilteringQOSPolicyCfgClient> impl) {
    return new RequestFilteringQOSPolicyCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public RequestFilteringQOSPolicyCfg createServerConfiguration(
      ServerManagedObject<? extends RequestFilteringQOSPolicyCfg> impl) {
    return new RequestFilteringQOSPolicyCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<RequestFilteringQOSPolicyCfg> getServerConfigurationClass() {
    return RequestFilteringQOSPolicyCfg.class;
  }



  /**
   * Get the "allowed-attributes" property definition.
   * <p>
   * Specifies which attributes are allowed in search and compare
   * operations.
   *
   * @return Returns the "allowed-attributes" property definition.
   */
  public StringPropertyDefinition getAllowedAttributesPropertyDefinition() {
    return PD_ALLOWED_ATTRIBUTES;
  }



  /**
   * Get the "allowed-operations" property definition.
   * <p>
   * Specifies which operations are allowed by the server.
   *
   * @return Returns the "allowed-operations" property definition.
   */
  public EnumPropertyDefinition<AllowedOperations> getAllowedOperationsPropertyDefinition() {
    return PD_ALLOWED_OPERATIONS;
  }



  /**
   * Get the "allowed-search-scopes" property definition.
   * <p>
   * Specifies which search scopes are allowed by the server.
   *
   * @return Returns the "allowed-search-scopes" property definition.
   */
  public EnumPropertyDefinition<AllowedSearchScopes> getAllowedSearchScopesPropertyDefinition() {
    return PD_ALLOWED_SEARCH_SCOPES;
  }



  /**
   * Get the "allowed-subtrees" property definition.
   * <p>
   * Specifies which subtrees are accessible to clients.
   *
   * @return Returns the "allowed-subtrees" property definition.
   */
  public DNPropertyDefinition getAllowedSubtreesPropertyDefinition() {
    return PD_ALLOWED_SUBTREES;
  }



  /**
   * Get the "java-class" property definition.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Request Filtering QOS Policy implementation.
   *
   * @return Returns the "java-class" property definition.
   */
  public ClassPropertyDefinition getJavaClassPropertyDefinition() {
    return PD_JAVA_CLASS;
  }



  /**
   * Get the "prohibited-attributes" property definition.
   * <p>
   * Specifies which attributes are not allowed in search and compare
   * operations.
   *
   * @return Returns the "prohibited-attributes" property definition.
   */
  public StringPropertyDefinition getProhibitedAttributesPropertyDefinition() {
    return PD_PROHIBITED_ATTRIBUTES;
  }



  /**
   * Get the "prohibited-subtrees" property definition.
   * <p>
   * Specifies which subtrees must be hidden from clients. Each
   * prohibited subtree must be subordinate to an allowed subtree.
   *
   * @return Returns the "prohibited-subtrees" property definition.
   */
  public DNPropertyDefinition getProhibitedSubtreesPropertyDefinition() {
    return PD_PROHIBITED_SUBTREES;
  }



  /**
   * Managed object client implementation.
   */
  private static class RequestFilteringQOSPolicyCfgClientImpl implements
    RequestFilteringQOSPolicyCfgClient {

    // Private implementation.
    private ManagedObject<? extends RequestFilteringQOSPolicyCfgClient> impl;



    // Private constructor.
    private RequestFilteringQOSPolicyCfgClientImpl(
        ManagedObject<? extends RequestFilteringQOSPolicyCfgClient> impl) {
      this.impl = impl;
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<String> getAllowedAttributes() {
      return impl.getPropertyValues(INSTANCE.getAllowedAttributesPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setAllowedAttributes(Collection<String> values) {
      impl.setPropertyValues(INSTANCE.getAllowedAttributesPropertyDefinition(), values);
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<AllowedOperations> getAllowedOperations() {
      return impl.getPropertyValues(INSTANCE.getAllowedOperationsPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setAllowedOperations(Collection<AllowedOperations> values) {
      impl.setPropertyValues(INSTANCE.getAllowedOperationsPropertyDefinition(), values);
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<AllowedSearchScopes> getAllowedSearchScopes() {
      return impl.getPropertyValues(INSTANCE.getAllowedSearchScopesPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setAllowedSearchScopes(Collection<AllowedSearchScopes> values) {
      impl.setPropertyValues(INSTANCE.getAllowedSearchScopesPropertyDefinition(), values);
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<DN> getAllowedSubtrees() {
      return impl.getPropertyValues(INSTANCE.getAllowedSubtreesPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setAllowedSubtrees(Collection<DN> values) {
      impl.setPropertyValues(INSTANCE.getAllowedSubtreesPropertyDefinition(), values);
    }



    /**
     * {@inheritDoc}
     */
    public String getJavaClass() {
      return impl.getPropertyValue(INSTANCE.getJavaClassPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setJavaClass(String value) {
      impl.setPropertyValue(INSTANCE.getJavaClassPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<String> getProhibitedAttributes() {
      return impl.getPropertyValues(INSTANCE.getProhibitedAttributesPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setProhibitedAttributes(Collection<String> values) {
      impl.setPropertyValues(INSTANCE.getProhibitedAttributesPropertyDefinition(), values);
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<DN> getProhibitedSubtrees() {
      return impl.getPropertyValues(INSTANCE.getProhibitedSubtreesPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setProhibitedSubtrees(Collection<DN> values) {
      impl.setPropertyValues(INSTANCE.getProhibitedSubtreesPropertyDefinition(), values);
    }



    /**
     * {@inheritDoc}
     */
    public ManagedObjectDefinition<? extends RequestFilteringQOSPolicyCfgClient, ? extends RequestFilteringQOSPolicyCfg> definition() {
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
  private static class RequestFilteringQOSPolicyCfgServerImpl implements
    RequestFilteringQOSPolicyCfg {

    // Private implementation.
    private ServerManagedObject<? extends RequestFilteringQOSPolicyCfg> impl;

    // The value of the "allowed-attributes" property.
    private final SortedSet<String> pAllowedAttributes;

    // The value of the "allowed-operations" property.
    private final SortedSet<AllowedOperations> pAllowedOperations;

    // The value of the "allowed-search-scopes" property.
    private final SortedSet<AllowedSearchScopes> pAllowedSearchScopes;

    // The value of the "allowed-subtrees" property.
    private final SortedSet<DN> pAllowedSubtrees;

    // The value of the "java-class" property.
    private final String pJavaClass;

    // The value of the "prohibited-attributes" property.
    private final SortedSet<String> pProhibitedAttributes;

    // The value of the "prohibited-subtrees" property.
    private final SortedSet<DN> pProhibitedSubtrees;



    // Private constructor.
    private RequestFilteringQOSPolicyCfgServerImpl(ServerManagedObject<? extends RequestFilteringQOSPolicyCfg> impl) {
      this.impl = impl;
      this.pAllowedAttributes = impl.getPropertyValues(INSTANCE.getAllowedAttributesPropertyDefinition());
      this.pAllowedOperations = impl.getPropertyValues(INSTANCE.getAllowedOperationsPropertyDefinition());
      this.pAllowedSearchScopes = impl.getPropertyValues(INSTANCE.getAllowedSearchScopesPropertyDefinition());
      this.pAllowedSubtrees = impl.getPropertyValues(INSTANCE.getAllowedSubtreesPropertyDefinition());
      this.pJavaClass = impl.getPropertyValue(INSTANCE.getJavaClassPropertyDefinition());
      this.pProhibitedAttributes = impl.getPropertyValues(INSTANCE.getProhibitedAttributesPropertyDefinition());
      this.pProhibitedSubtrees = impl.getPropertyValues(INSTANCE.getProhibitedSubtreesPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addRequestFilteringChangeListener(
        ConfigurationChangeListener<RequestFilteringQOSPolicyCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeRequestFilteringChangeListener(
        ConfigurationChangeListener<RequestFilteringQOSPolicyCfg> listener) {
      impl.deregisterChangeListener(listener);
    }
    /**
     * {@inheritDoc}
     */
    public void addChangeListener(
        ConfigurationChangeListener<QOSPolicyCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeChangeListener(
        ConfigurationChangeListener<QOSPolicyCfg> listener) {
      impl.deregisterChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<String> getAllowedAttributes() {
      return pAllowedAttributes;
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<AllowedOperations> getAllowedOperations() {
      return pAllowedOperations;
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<AllowedSearchScopes> getAllowedSearchScopes() {
      return pAllowedSearchScopes;
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<DN> getAllowedSubtrees() {
      return pAllowedSubtrees;
    }



    /**
     * {@inheritDoc}
     */
    public String getJavaClass() {
      return pJavaClass;
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<String> getProhibitedAttributes() {
      return pProhibitedAttributes;
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<DN> getProhibitedSubtrees() {
      return pProhibitedSubtrees;
    }



    /**
     * {@inheritDoc}
     */
    public Class<? extends RequestFilteringQOSPolicyCfg> configurationClass() {
      return RequestFilteringQOSPolicyCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
