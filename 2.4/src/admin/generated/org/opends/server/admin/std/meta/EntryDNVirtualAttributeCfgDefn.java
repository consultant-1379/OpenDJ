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
import org.opends.server.admin.AttributeTypePropertyDefinition;
import org.opends.server.admin.BooleanPropertyDefinition;
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
import org.opends.server.admin.std.client.EntryDNVirtualAttributeCfgClient;
import org.opends.server.admin.std.meta.VirtualAttributeCfgDefn.ConflictBehavior;
import org.opends.server.admin.std.server.EntryDNVirtualAttributeCfg;
import org.opends.server.admin.std.server.VirtualAttributeCfg;
import org.opends.server.admin.StringPropertyDefinition;
import org.opends.server.admin.Tag;
import org.opends.server.types.AttributeType;
import org.opends.server.types.DN;



/**
 * An interface for querying the Entry DN Virtual Attribute managed
 * object definition meta information.
 * <p>
 * The Entry DN Virtual Attribute generates the entryDN operational
 * attribute in directory entries, which contains a normalized form of
 * the entry's DN.
 */
public final class EntryDNVirtualAttributeCfgDefn extends ManagedObjectDefinition<EntryDNVirtualAttributeCfgClient, EntryDNVirtualAttributeCfg> {

  // The singleton configuration definition instance.
  private static final EntryDNVirtualAttributeCfgDefn INSTANCE = new EntryDNVirtualAttributeCfgDefn();



  // The "attribute-type" property definition.
  private static final AttributeTypePropertyDefinition PD_ATTRIBUTE_TYPE;



  // The "conflict-behavior" property definition.
  private static final EnumPropertyDefinition<ConflictBehavior> PD_CONFLICT_BEHAVIOR;



  // The "java-class" property definition.
  private static final ClassPropertyDefinition PD_JAVA_CLASS;



  // Build the "attribute-type" property definition.
  static {
      AttributeTypePropertyDefinition.Builder builder = AttributeTypePropertyDefinition.createBuilder(INSTANCE, "attribute-type");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "attribute-type"));
      DefaultBehaviorProvider<AttributeType> provider = new DefinedDefaultBehaviorProvider<AttributeType>("entryDN");
      builder.setDefaultBehaviorProvider(provider);
      PD_ATTRIBUTE_TYPE = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_ATTRIBUTE_TYPE);
  }



  // Build the "conflict-behavior" property definition.
  static {
      EnumPropertyDefinition.Builder<ConflictBehavior> builder = EnumPropertyDefinition.createBuilder(INSTANCE, "conflict-behavior");
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "conflict-behavior"));
      DefaultBehaviorProvider<ConflictBehavior> provider = new DefinedDefaultBehaviorProvider<ConflictBehavior>("virtual-overrides-real");
      builder.setDefaultBehaviorProvider(provider);
      builder.setEnumClass(ConflictBehavior.class);
      PD_CONFLICT_BEHAVIOR = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_CONFLICT_BEHAVIOR);
  }



  // Build the "java-class" property definition.
  static {
      ClassPropertyDefinition.Builder builder = ClassPropertyDefinition.createBuilder(INSTANCE, "java-class");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.COMPONENT_RESTART, INSTANCE, "java-class"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("org.opends.server.extensions.EntryDNVirtualAttributeProvider");
      builder.setDefaultBehaviorProvider(provider);
      builder.addInstanceOf("org.opends.server.api.VirtualAttributeProvider");
      PD_JAVA_CLASS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_JAVA_CLASS);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("core-server"));
  }



  /**
   * Get the Entry DN Virtual Attribute configuration definition
   * singleton.
   *
   * @return Returns the Entry DN Virtual Attribute configuration
   *         definition singleton.
   */
  public static EntryDNVirtualAttributeCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private EntryDNVirtualAttributeCfgDefn() {
    super("entry-dn-virtual-attribute", VirtualAttributeCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public EntryDNVirtualAttributeCfgClient createClientConfiguration(
      ManagedObject<? extends EntryDNVirtualAttributeCfgClient> impl) {
    return new EntryDNVirtualAttributeCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public EntryDNVirtualAttributeCfg createServerConfiguration(
      ServerManagedObject<? extends EntryDNVirtualAttributeCfg> impl) {
    return new EntryDNVirtualAttributeCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<EntryDNVirtualAttributeCfg> getServerConfigurationClass() {
    return EntryDNVirtualAttributeCfg.class;
  }



  /**
   * Get the "attribute-type" property definition.
   * <p>
   * Specifies the attribute type for the attribute whose values are
   * to be dynamically assigned by the virtual attribute.
   *
   * @return Returns the "attribute-type" property definition.
   */
  public AttributeTypePropertyDefinition getAttributeTypePropertyDefinition() {
    return PD_ATTRIBUTE_TYPE;
  }



  /**
   * Get the "base-dn" property definition.
   * <p>
   * Specifies the base DNs for the branches containing entries that
   * are eligible to use this virtual attribute.
   * <p>
   * If no values are given, then the server generates virtual
   * attributes anywhere in the server.
   *
   * @return Returns the "base-dn" property definition.
   */
  public DNPropertyDefinition getBaseDNPropertyDefinition() {
    return VirtualAttributeCfgDefn.getInstance().getBaseDNPropertyDefinition();
  }



  /**
   * Get the "conflict-behavior" property definition.
   * <p>
   * Specifies the behavior that the server is to exhibit for entries
   * that already contain one or more real values for the associated
   * attribute.
   *
   * @return Returns the "conflict-behavior" property definition.
   */
  public EnumPropertyDefinition<ConflictBehavior> getConflictBehaviorPropertyDefinition() {
    return PD_CONFLICT_BEHAVIOR;
  }



  /**
   * Get the "enabled" property definition.
   * <p>
   * Indicates whether the Entry DN Virtual Attribute is enabled for
   * use.
   *
   * @return Returns the "enabled" property definition.
   */
  public BooleanPropertyDefinition getEnabledPropertyDefinition() {
    return VirtualAttributeCfgDefn.getInstance().getEnabledPropertyDefinition();
  }



  /**
   * Get the "filter" property definition.
   * <p>
   * Specifies the search filters to be applied against entries to
   * determine if the virtual attribute is to be generated for those
   * entries.
   * <p>
   * If no values are given, then any entry is eligible to have the
   * value generated. If one or more filters are specified, then only
   * entries that match at least one of those filters are allowed to
   * have the virtual attribute.
   *
   * @return Returns the "filter" property definition.
   */
  public StringPropertyDefinition getFilterPropertyDefinition() {
    return VirtualAttributeCfgDefn.getInstance().getFilterPropertyDefinition();
  }



  /**
   * Get the "group-dn" property definition.
   * <p>
   * Specifies the DNs of the groups whose members can be eligible to
   * use this virtual attribute.
   * <p>
   * If no values are given, then group membership is not taken into
   * account when generating the virtual attribute. If one or more
   * group DNs are specified, then only members of those groups are
   * allowed to have the virtual attribute.
   *
   * @return Returns the "group-dn" property definition.
   */
  public DNPropertyDefinition getGroupDNPropertyDefinition() {
    return VirtualAttributeCfgDefn.getInstance().getGroupDNPropertyDefinition();
  }



  /**
   * Get the "java-class" property definition.
   * <p>
   * Specifies the fully-qualified name of the virtual attribute
   * provider class that generates the attribute values.
   *
   * @return Returns the "java-class" property definition.
   */
  public ClassPropertyDefinition getJavaClassPropertyDefinition() {
    return PD_JAVA_CLASS;
  }



  /**
   * Managed object client implementation.
   */
  private static class EntryDNVirtualAttributeCfgClientImpl implements
    EntryDNVirtualAttributeCfgClient {

    // Private implementation.
    private ManagedObject<? extends EntryDNVirtualAttributeCfgClient> impl;



    // Private constructor.
    private EntryDNVirtualAttributeCfgClientImpl(
        ManagedObject<? extends EntryDNVirtualAttributeCfgClient> impl) {
      this.impl = impl;
    }



    /**
     * {@inheritDoc}
     */
    public AttributeType getAttributeType() {
      return impl.getPropertyValue(INSTANCE.getAttributeTypePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setAttributeType(AttributeType value) {
      impl.setPropertyValue(INSTANCE.getAttributeTypePropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<DN> getBaseDN() {
      return impl.getPropertyValues(INSTANCE.getBaseDNPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setBaseDN(Collection<DN> values) {
      impl.setPropertyValues(INSTANCE.getBaseDNPropertyDefinition(), values);
    }



    /**
     * {@inheritDoc}
     */
    public ConflictBehavior getConflictBehavior() {
      return impl.getPropertyValue(INSTANCE.getConflictBehaviorPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setConflictBehavior(ConflictBehavior value) {
      impl.setPropertyValue(INSTANCE.getConflictBehaviorPropertyDefinition(), value);
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
    public SortedSet<String> getFilter() {
      return impl.getPropertyValues(INSTANCE.getFilterPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setFilter(Collection<String> values) {
      impl.setPropertyValues(INSTANCE.getFilterPropertyDefinition(), values);
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<DN> getGroupDN() {
      return impl.getPropertyValues(INSTANCE.getGroupDNPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setGroupDN(Collection<DN> values) {
      impl.setPropertyValues(INSTANCE.getGroupDNPropertyDefinition(), values);
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
    public ManagedObjectDefinition<? extends EntryDNVirtualAttributeCfgClient, ? extends EntryDNVirtualAttributeCfg> definition() {
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
  private static class EntryDNVirtualAttributeCfgServerImpl implements
    EntryDNVirtualAttributeCfg {

    // Private implementation.
    private ServerManagedObject<? extends EntryDNVirtualAttributeCfg> impl;

    // The value of the "attribute-type" property.
    private final AttributeType pAttributeType;

    // The value of the "base-dn" property.
    private final SortedSet<DN> pBaseDN;

    // The value of the "conflict-behavior" property.
    private final ConflictBehavior pConflictBehavior;

    // The value of the "enabled" property.
    private final boolean pEnabled;

    // The value of the "filter" property.
    private final SortedSet<String> pFilter;

    // The value of the "group-dn" property.
    private final SortedSet<DN> pGroupDN;

    // The value of the "java-class" property.
    private final String pJavaClass;



    // Private constructor.
    private EntryDNVirtualAttributeCfgServerImpl(ServerManagedObject<? extends EntryDNVirtualAttributeCfg> impl) {
      this.impl = impl;
      this.pAttributeType = impl.getPropertyValue(INSTANCE.getAttributeTypePropertyDefinition());
      this.pBaseDN = impl.getPropertyValues(INSTANCE.getBaseDNPropertyDefinition());
      this.pConflictBehavior = impl.getPropertyValue(INSTANCE.getConflictBehaviorPropertyDefinition());
      this.pEnabled = impl.getPropertyValue(INSTANCE.getEnabledPropertyDefinition());
      this.pFilter = impl.getPropertyValues(INSTANCE.getFilterPropertyDefinition());
      this.pGroupDN = impl.getPropertyValues(INSTANCE.getGroupDNPropertyDefinition());
      this.pJavaClass = impl.getPropertyValue(INSTANCE.getJavaClassPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addEntryDNChangeListener(
        ConfigurationChangeListener<EntryDNVirtualAttributeCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeEntryDNChangeListener(
        ConfigurationChangeListener<EntryDNVirtualAttributeCfg> listener) {
      impl.deregisterChangeListener(listener);
    }
    /**
     * {@inheritDoc}
     */
    public void addChangeListener(
        ConfigurationChangeListener<VirtualAttributeCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeChangeListener(
        ConfigurationChangeListener<VirtualAttributeCfg> listener) {
      impl.deregisterChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public AttributeType getAttributeType() {
      return pAttributeType;
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<DN> getBaseDN() {
      return pBaseDN;
    }



    /**
     * {@inheritDoc}
     */
    public ConflictBehavior getConflictBehavior() {
      return pConflictBehavior;
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
    public SortedSet<String> getFilter() {
      return pFilter;
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<DN> getGroupDN() {
      return pGroupDN;
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
    public Class<? extends EntryDNVirtualAttributeCfg> configurationClass() {
      return EntryDNVirtualAttributeCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
