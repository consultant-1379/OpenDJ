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



import org.opends.server.admin.AdministratorAction;
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
import org.opends.server.admin.IntegerPropertyDefinition;
import org.opends.server.admin.ManagedObjectAlreadyExistsException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.PropertyIsReadOnlyException;
import org.opends.server.admin.PropertyOption;
import org.opends.server.admin.PropertyProvider;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.server.ServerManagedObject;
import org.opends.server.admin.std.client.LocalDBVLVIndexCfgClient;
import org.opends.server.admin.std.server.LocalDBVLVIndexCfg;
import org.opends.server.admin.StringPropertyDefinition;
import org.opends.server.admin.Tag;
import org.opends.server.admin.TopCfgDefn;
import org.opends.server.admin.UndefinedDefaultBehaviorProvider;
import org.opends.server.types.DN;



/**
 * An interface for querying the Local DB VLV Index managed object
 * definition meta information.
 * <p>
 * Local DB VLV Indexes are used to store information about a specific
 * search request that makes it possible to efficiently process them
 * using the VLV control.
 */
public final class LocalDBVLVIndexCfgDefn extends ManagedObjectDefinition<LocalDBVLVIndexCfgClient, LocalDBVLVIndexCfg> {

  // The singleton configuration definition instance.
  private static final LocalDBVLVIndexCfgDefn INSTANCE = new LocalDBVLVIndexCfgDefn();



  /**
   * Defines the set of permissable values for the "scope" property.
   * <p>
   * Specifies the LDAP scope of the query that is being indexed.
   */
  public static enum Scope {

    /**
     * Search the base object only.
     */
    BASE_OBJECT("base-object"),



    /**
     * Search the immediate children of the base object but do not
     * include any of their descendants or the base object itself.
     */
    SINGLE_LEVEL("single-level"),



    /**
     * Search the entire subtree below the base object but do not
     * include the base object itself.
     */
    SUBORDINATE_SUBTREE("subordinate-subtree"),



    /**
     * Search the base object and the entire subtree below the base
     * object.
     */
    WHOLE_SUBTREE("whole-subtree");



    // String representation of the value.
    private final String name;



    // Private constructor.
    private Scope(String name) { this.name = name; }



    /**
     * {@inheritDoc}
     */
    public String toString() { return name; }

  }



  // The "base-dn" property definition.
  private static final DNPropertyDefinition PD_BASE_DN;



  // The "filter" property definition.
  private static final StringPropertyDefinition PD_FILTER;



  // The "max-block-size" property definition.
  private static final IntegerPropertyDefinition PD_MAX_BLOCK_SIZE;



  // The "name" property definition.
  private static final StringPropertyDefinition PD_NAME;



  // The "scope" property definition.
  private static final EnumPropertyDefinition<Scope> PD_SCOPE;



  // The "sort-order" property definition.
  private static final StringPropertyDefinition PD_SORT_ORDER;



  // Build the "base-dn" property definition.
  static {
      DNPropertyDefinition.Builder builder = DNPropertyDefinition.createBuilder(INSTANCE, "base-dn");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.OTHER, INSTANCE, "base-dn"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<DN>());
      PD_BASE_DN = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_BASE_DN);
  }



  // Build the "filter" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "filter");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.OTHER, INSTANCE, "filter"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<String>());
      builder.setPattern(".*", "STRING");
      PD_FILTER = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_FILTER);
  }



  // Build the "max-block-size" property definition.
  static {
      IntegerPropertyDefinition.Builder builder = IntegerPropertyDefinition.createBuilder(INSTANCE, "max-block-size");
      builder.setOption(PropertyOption.READ_ONLY);
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "max-block-size"));
      DefaultBehaviorProvider<Integer> provider = new DefinedDefaultBehaviorProvider<Integer>("4000");
      builder.setDefaultBehaviorProvider(provider);
      PD_MAX_BLOCK_SIZE = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_MAX_BLOCK_SIZE);
  }



  // Build the "name" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "name");
      builder.setOption(PropertyOption.READ_ONLY);
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "name"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<String>());
      PD_NAME = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_NAME);
  }



  // Build the "scope" property definition.
  static {
      EnumPropertyDefinition.Builder<Scope> builder = EnumPropertyDefinition.createBuilder(INSTANCE, "scope");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.OTHER, INSTANCE, "scope"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<Scope>());
      builder.setEnumClass(Scope.class);
      PD_SCOPE = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_SCOPE);
  }



  // Build the "sort-order" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "sort-order");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.OTHER, INSTANCE, "sort-order"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<String>());
      builder.setPattern(".*", "STRING");
      PD_SORT_ORDER = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_SORT_ORDER);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("database"));
  }



  /**
   * Get the Local DB VLV Index configuration definition singleton.
   *
   * @return Returns the Local DB VLV Index configuration definition
   *         singleton.
   */
  public static LocalDBVLVIndexCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private LocalDBVLVIndexCfgDefn() {
    super("local-db-vlv-index", TopCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public LocalDBVLVIndexCfgClient createClientConfiguration(
      ManagedObject<? extends LocalDBVLVIndexCfgClient> impl) {
    return new LocalDBVLVIndexCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public LocalDBVLVIndexCfg createServerConfiguration(
      ServerManagedObject<? extends LocalDBVLVIndexCfg> impl) {
    return new LocalDBVLVIndexCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<LocalDBVLVIndexCfg> getServerConfigurationClass() {
    return LocalDBVLVIndexCfg.class;
  }



  /**
   * Get the "base-dn" property definition.
   * <p>
   * Specifies the base DN used in the search query that is being
   * indexed.
   *
   * @return Returns the "base-dn" property definition.
   */
  public DNPropertyDefinition getBaseDNPropertyDefinition() {
    return PD_BASE_DN;
  }



  /**
   * Get the "filter" property definition.
   * <p>
   * Specifies the LDAP filter used in the query that is being
   * indexed.
   *
   * @return Returns the "filter" property definition.
   */
  public StringPropertyDefinition getFilterPropertyDefinition() {
    return PD_FILTER;
  }



  /**
   * Get the "max-block-size" property definition.
   * <p>
   * Specifies the number of entry IDs to store in a single sorted set
   * before it must be split.
   *
   * @return Returns the "max-block-size" property definition.
   */
  public IntegerPropertyDefinition getMaxBlockSizePropertyDefinition() {
    return PD_MAX_BLOCK_SIZE;
  }



  /**
   * Get the "name" property definition.
   * <p>
   * Specifies a unique name for this VLV index.
   *
   * @return Returns the "name" property definition.
   */
  public StringPropertyDefinition getNamePropertyDefinition() {
    return PD_NAME;
  }



  /**
   * Get the "scope" property definition.
   * <p>
   * Specifies the LDAP scope of the query that is being indexed.
   *
   * @return Returns the "scope" property definition.
   */
  public EnumPropertyDefinition<Scope> getScopePropertyDefinition() {
    return PD_SCOPE;
  }



  /**
   * Get the "sort-order" property definition.
   * <p>
   * Specifies the names of the attributes that are used to sort the
   * entries for the query being indexed.
   * <p>
   * Multiple attributes can be used to determine the sort order by
   * listing the attribute names from highest to lowest precedence.
   * Optionally, + or - can be prefixed to the attribute name to sort
   * the attribute in ascending order or descending order respectively.
   *
   * @return Returns the "sort-order" property definition.
   */
  public StringPropertyDefinition getSortOrderPropertyDefinition() {
    return PD_SORT_ORDER;
  }



  /**
   * Managed object client implementation.
   */
  private static class LocalDBVLVIndexCfgClientImpl implements
    LocalDBVLVIndexCfgClient {

    // Private implementation.
    private ManagedObject<? extends LocalDBVLVIndexCfgClient> impl;



    // Private constructor.
    private LocalDBVLVIndexCfgClientImpl(
        ManagedObject<? extends LocalDBVLVIndexCfgClient> impl) {
      this.impl = impl;
    }



    /**
     * {@inheritDoc}
     */
    public DN getBaseDN() {
      return impl.getPropertyValue(INSTANCE.getBaseDNPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setBaseDN(DN value) {
      impl.setPropertyValue(INSTANCE.getBaseDNPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public String getFilter() {
      return impl.getPropertyValue(INSTANCE.getFilterPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setFilter(String value) {
      impl.setPropertyValue(INSTANCE.getFilterPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public int getMaxBlockSize() {
      return impl.getPropertyValue(INSTANCE.getMaxBlockSizePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setMaxBlockSize(Integer value) throws PropertyIsReadOnlyException {
      impl.setPropertyValue(INSTANCE.getMaxBlockSizePropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public String getName() {
      return impl.getPropertyValue(INSTANCE.getNamePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setName(String value) throws PropertyIsReadOnlyException {
      impl.setPropertyValue(INSTANCE.getNamePropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public Scope getScope() {
      return impl.getPropertyValue(INSTANCE.getScopePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setScope(Scope value) {
      impl.setPropertyValue(INSTANCE.getScopePropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public String getSortOrder() {
      return impl.getPropertyValue(INSTANCE.getSortOrderPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setSortOrder(String value) {
      impl.setPropertyValue(INSTANCE.getSortOrderPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public ManagedObjectDefinition<? extends LocalDBVLVIndexCfgClient, ? extends LocalDBVLVIndexCfg> definition() {
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
  private static class LocalDBVLVIndexCfgServerImpl implements
    LocalDBVLVIndexCfg {

    // Private implementation.
    private ServerManagedObject<? extends LocalDBVLVIndexCfg> impl;

    // The value of the "base-dn" property.
    private final DN pBaseDN;

    // The value of the "filter" property.
    private final String pFilter;

    // The value of the "max-block-size" property.
    private final int pMaxBlockSize;

    // The value of the "name" property.
    private final String pName;

    // The value of the "scope" property.
    private final Scope pScope;

    // The value of the "sort-order" property.
    private final String pSortOrder;



    // Private constructor.
    private LocalDBVLVIndexCfgServerImpl(ServerManagedObject<? extends LocalDBVLVIndexCfg> impl) {
      this.impl = impl;
      this.pBaseDN = impl.getPropertyValue(INSTANCE.getBaseDNPropertyDefinition());
      this.pFilter = impl.getPropertyValue(INSTANCE.getFilterPropertyDefinition());
      this.pMaxBlockSize = impl.getPropertyValue(INSTANCE.getMaxBlockSizePropertyDefinition());
      this.pName = impl.getPropertyValue(INSTANCE.getNamePropertyDefinition());
      this.pScope = impl.getPropertyValue(INSTANCE.getScopePropertyDefinition());
      this.pSortOrder = impl.getPropertyValue(INSTANCE.getSortOrderPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addChangeListener(
        ConfigurationChangeListener<LocalDBVLVIndexCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeChangeListener(
        ConfigurationChangeListener<LocalDBVLVIndexCfg> listener) {
      impl.deregisterChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public DN getBaseDN() {
      return pBaseDN;
    }



    /**
     * {@inheritDoc}
     */
    public String getFilter() {
      return pFilter;
    }



    /**
     * {@inheritDoc}
     */
    public int getMaxBlockSize() {
      return pMaxBlockSize;
    }



    /**
     * {@inheritDoc}
     */
    public String getName() {
      return pName;
    }



    /**
     * {@inheritDoc}
     */
    public Scope getScope() {
      return pScope;
    }



    /**
     * {@inheritDoc}
     */
    public String getSortOrder() {
      return pSortOrder;
    }



    /**
     * {@inheritDoc}
     */
    public Class<? extends LocalDBVLVIndexCfg> configurationClass() {
      return LocalDBVLVIndexCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
