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
import org.opends.server.admin.AttributeTypePropertyDefinition;
import org.opends.server.admin.client.AuthorizationException;
import org.opends.server.admin.client.CommunicationException;
import org.opends.server.admin.client.ConcurrentModificationException;
import org.opends.server.admin.client.ManagedObject;
import org.opends.server.admin.client.MissingMandatoryPropertiesException;
import org.opends.server.admin.client.OperationRejectedException;
import org.opends.server.admin.DefaultBehaviorProvider;
import org.opends.server.admin.DefinedDefaultBehaviorProvider;
import org.opends.server.admin.EnumPropertyDefinition;
import org.opends.server.admin.IntegerPropertyDefinition;
import org.opends.server.admin.ManagedObjectAlreadyExistsException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.PropertyIsReadOnlyException;
import org.opends.server.admin.PropertyOption;
import org.opends.server.admin.PropertyProvider;
import org.opends.server.admin.RelativeInheritedDefaultBehaviorProvider;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.server.ServerManagedObject;
import org.opends.server.admin.std.client.LocalDBIndexCfgClient;
import org.opends.server.admin.std.server.LocalDBIndexCfg;
import org.opends.server.admin.StringPropertyDefinition;
import org.opends.server.admin.Tag;
import org.opends.server.admin.TopCfgDefn;
import org.opends.server.admin.UndefinedDefaultBehaviorProvider;
import org.opends.server.types.AttributeType;
import org.opends.server.types.DN;



/**
 * An interface for querying the Local DB Index managed object
 * definition meta information.
 * <p>
 * Local DB Indexes are used to store information that makes it
 * possible to locate entries very quickly when processing search
 * operations.
 */
public final class LocalDBIndexCfgDefn extends ManagedObjectDefinition<LocalDBIndexCfgClient, LocalDBIndexCfg> {

  // The singleton configuration definition instance.
  private static final LocalDBIndexCfgDefn INSTANCE = new LocalDBIndexCfgDefn();



  /**
   * Defines the set of permissable values for the "index-type" property.
   * <p>
   * Specifies the type(s) of indexing that should be performed for
   * the associated attribute.
   * <p>
   * For equality, presence, and substring index types, the associated
   * attribute type must have a corresponding matching rule.
   */
  public static enum IndexType {

    /**
     * This index type is used to improve the efficiency of searches
     * using approximate matching search filters.
     */
    APPROXIMATE("approximate"),



    /**
     * This index type is used to improve the efficiency of searches
     * using equality search filters.
     */
    EQUALITY("equality"),



    /**
     * This index type is used to improve the efficiency of searches
     * using extensible matching search filters.
     */
    EXTENSIBLE("extensible"),



    /**
     * This index type is used to improve the efficiency of searches
     * using "greater than or equal to" or "less then or equal to"
     * search filters.
     */
    ORDERING("ordering"),



    /**
     * This index type is used to improve the efficiency of searches
     * using the presence search filters.
     */
    PRESENCE("presence"),



    /**
     * This index type is used to improve the efficiency of searches
     * using substring search filters.
     */
    SUBSTRING("substring");



    // String representation of the value.
    private final String name;



    // Private constructor.
    private IndexType(String name) { this.name = name; }



    /**
     * {@inheritDoc}
     */
    public String toString() { return name; }

  }



  // The "attribute" property definition.
  private static final AttributeTypePropertyDefinition PD_ATTRIBUTE;



  // The "index-entry-limit" property definition.
  private static final IntegerPropertyDefinition PD_INDEX_ENTRY_LIMIT;



  // The "index-extensible-matching-rule" property definition.
  private static final StringPropertyDefinition PD_INDEX_EXTENSIBLE_MATCHING_RULE;



  // The "index-type" property definition.
  private static final EnumPropertyDefinition<IndexType> PD_INDEX_TYPE;



  // The "substring-length" property definition.
  private static final IntegerPropertyDefinition PD_SUBSTRING_LENGTH;



  // Build the "attribute" property definition.
  static {
      AttributeTypePropertyDefinition.Builder builder = AttributeTypePropertyDefinition.createBuilder(INSTANCE, "attribute");
      builder.setOption(PropertyOption.READ_ONLY);
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "attribute"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<AttributeType>());
      PD_ATTRIBUTE = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_ATTRIBUTE);
  }



  // Build the "index-entry-limit" property definition.
  static {
      IntegerPropertyDefinition.Builder builder = IntegerPropertyDefinition.createBuilder(INSTANCE, "index-entry-limit");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.OTHER, INSTANCE, "index-entry-limit"));
      DefaultBehaviorProvider<Integer> provider = new RelativeInheritedDefaultBehaviorProvider<Integer>(LocalDBBackendCfgDefn.getInstance(), "index-entry-limit", 1);
      builder.setDefaultBehaviorProvider(provider);
      builder.setUpperLimit(2147483647);
      builder.setLowerLimit(0);
      PD_INDEX_ENTRY_LIMIT = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_INDEX_ENTRY_LIMIT);
  }



  // Build the "index-extensible-matching-rule" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "index-extensible-matching-rule");
      builder.setOption(PropertyOption.MULTI_VALUED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.OTHER, INSTANCE, "index-extensible-matching-rule"));
      builder.setDefaultBehaviorProvider(new AliasDefaultBehaviorProvider<String>(INSTANCE, "index-extensible-matching-rule"));
      builder.setPattern("([a-z][a-z](-[A-Z][A-Z]){0,2}(.(([a-z]{2,3})|\\d))?)|(^\\d.((\\d)+.)+\\d$)", "LOCALE | OID");
      PD_INDEX_EXTENSIBLE_MATCHING_RULE = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_INDEX_EXTENSIBLE_MATCHING_RULE);
  }



  // Build the "index-type" property definition.
  static {
      EnumPropertyDefinition.Builder<IndexType> builder = EnumPropertyDefinition.createBuilder(INSTANCE, "index-type");
      builder.setOption(PropertyOption.MULTI_VALUED);
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.OTHER, INSTANCE, "index-type"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<IndexType>());
      builder.setEnumClass(IndexType.class);
      PD_INDEX_TYPE = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_INDEX_TYPE);
  }



  // Build the "substring-length" property definition.
  static {
      IntegerPropertyDefinition.Builder builder = IntegerPropertyDefinition.createBuilder(INSTANCE, "substring-length");
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.OTHER, INSTANCE, "substring-length"));
      DefaultBehaviorProvider<Integer> provider = new DefinedDefaultBehaviorProvider<Integer>("6");
      builder.setDefaultBehaviorProvider(provider);
      builder.setLowerLimit(3);
      PD_SUBSTRING_LENGTH = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_SUBSTRING_LENGTH);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("database"));
  }



  /**
   * Get the Local DB Index configuration definition singleton.
   *
   * @return Returns the Local DB Index configuration definition
   *         singleton.
   */
  public static LocalDBIndexCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private LocalDBIndexCfgDefn() {
    super("local-db-index", TopCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public LocalDBIndexCfgClient createClientConfiguration(
      ManagedObject<? extends LocalDBIndexCfgClient> impl) {
    return new LocalDBIndexCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public LocalDBIndexCfg createServerConfiguration(
      ServerManagedObject<? extends LocalDBIndexCfg> impl) {
    return new LocalDBIndexCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<LocalDBIndexCfg> getServerConfigurationClass() {
    return LocalDBIndexCfg.class;
  }



  /**
   * Get the "attribute" property definition.
   * <p>
   * Specifies the name of the attribute for which the index is to be
   * maintained.
   *
   * @return Returns the "attribute" property definition.
   */
  public AttributeTypePropertyDefinition getAttributePropertyDefinition() {
    return PD_ATTRIBUTE;
  }



  /**
   * Get the "index-entry-limit" property definition.
   * <p>
   * Specifies the maximum number of entries that are allowed to match
   * a given index key before that particular index key is no longer
   * maintained.
   * <p>
   * This is analogous to the ALL IDs threshold in the Sun Java System
   * Directory Server. If this is specified, its value overrides the JE
   * backend-wide configuration. For no limit, use 0 for the value.
   *
   * @return Returns the "index-entry-limit" property definition.
   */
  public IntegerPropertyDefinition getIndexEntryLimitPropertyDefinition() {
    return PD_INDEX_ENTRY_LIMIT;
  }



  /**
   * Get the "index-extensible-matching-rule" property definition.
   * <p>
   * The extensible matching rule in an extensible index.
   * <p>
   * An extensible matching rule must be specified using either LOCALE
   * or OID of the matching rule.
   *
   * @return Returns the "index-extensible-matching-rule" property definition.
   */
  public StringPropertyDefinition getIndexExtensibleMatchingRulePropertyDefinition() {
    return PD_INDEX_EXTENSIBLE_MATCHING_RULE;
  }



  /**
   * Get the "index-type" property definition.
   * <p>
   * Specifies the type(s) of indexing that should be performed for
   * the associated attribute.
   * <p>
   * For equality, presence, and substring index types, the associated
   * attribute type must have a corresponding matching rule.
   *
   * @return Returns the "index-type" property definition.
   */
  public EnumPropertyDefinition<IndexType> getIndexTypePropertyDefinition() {
    return PD_INDEX_TYPE;
  }



  /**
   * Get the "substring-length" property definition.
   * <p>
   * The length of substrings in a substring index.
   *
   * @return Returns the "substring-length" property definition.
   */
  public IntegerPropertyDefinition getSubstringLengthPropertyDefinition() {
    return PD_SUBSTRING_LENGTH;
  }



  /**
   * Managed object client implementation.
   */
  private static class LocalDBIndexCfgClientImpl implements
    LocalDBIndexCfgClient {

    // Private implementation.
    private ManagedObject<? extends LocalDBIndexCfgClient> impl;



    // Private constructor.
    private LocalDBIndexCfgClientImpl(
        ManagedObject<? extends LocalDBIndexCfgClient> impl) {
      this.impl = impl;
    }



    /**
     * {@inheritDoc}
     */
    public AttributeType getAttribute() {
      return impl.getPropertyValue(INSTANCE.getAttributePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setAttribute(AttributeType value) throws PropertyIsReadOnlyException {
      impl.setPropertyValue(INSTANCE.getAttributePropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public Integer getIndexEntryLimit() {
      return impl.getPropertyValue(INSTANCE.getIndexEntryLimitPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setIndexEntryLimit(Integer value) {
      impl.setPropertyValue(INSTANCE.getIndexEntryLimitPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<String> getIndexExtensibleMatchingRule() {
      return impl.getPropertyValues(INSTANCE.getIndexExtensibleMatchingRulePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setIndexExtensibleMatchingRule(Collection<String> values) {
      impl.setPropertyValues(INSTANCE.getIndexExtensibleMatchingRulePropertyDefinition(), values);
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<IndexType> getIndexType() {
      return impl.getPropertyValues(INSTANCE.getIndexTypePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setIndexType(Collection<IndexType> values) {
      impl.setPropertyValues(INSTANCE.getIndexTypePropertyDefinition(), values);
    }



    /**
     * {@inheritDoc}
     */
    public int getSubstringLength() {
      return impl.getPropertyValue(INSTANCE.getSubstringLengthPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setSubstringLength(Integer value) {
      impl.setPropertyValue(INSTANCE.getSubstringLengthPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public ManagedObjectDefinition<? extends LocalDBIndexCfgClient, ? extends LocalDBIndexCfg> definition() {
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
  private static class LocalDBIndexCfgServerImpl implements
    LocalDBIndexCfg {

    // Private implementation.
    private ServerManagedObject<? extends LocalDBIndexCfg> impl;

    // The value of the "attribute" property.
    private final AttributeType pAttribute;

    // The value of the "index-entry-limit" property.
    private final Integer pIndexEntryLimit;

    // The value of the "index-extensible-matching-rule" property.
    private final SortedSet<String> pIndexExtensibleMatchingRule;

    // The value of the "index-type" property.
    private final SortedSet<IndexType> pIndexType;

    // The value of the "substring-length" property.
    private final int pSubstringLength;



    // Private constructor.
    private LocalDBIndexCfgServerImpl(ServerManagedObject<? extends LocalDBIndexCfg> impl) {
      this.impl = impl;
      this.pAttribute = impl.getPropertyValue(INSTANCE.getAttributePropertyDefinition());
      this.pIndexEntryLimit = impl.getPropertyValue(INSTANCE.getIndexEntryLimitPropertyDefinition());
      this.pIndexExtensibleMatchingRule = impl.getPropertyValues(INSTANCE.getIndexExtensibleMatchingRulePropertyDefinition());
      this.pIndexType = impl.getPropertyValues(INSTANCE.getIndexTypePropertyDefinition());
      this.pSubstringLength = impl.getPropertyValue(INSTANCE.getSubstringLengthPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addChangeListener(
        ConfigurationChangeListener<LocalDBIndexCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeChangeListener(
        ConfigurationChangeListener<LocalDBIndexCfg> listener) {
      impl.deregisterChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public AttributeType getAttribute() {
      return pAttribute;
    }



    /**
     * {@inheritDoc}
     */
    public Integer getIndexEntryLimit() {
      return pIndexEntryLimit;
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<String> getIndexExtensibleMatchingRule() {
      return pIndexExtensibleMatchingRule;
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<IndexType> getIndexType() {
      return pIndexType;
    }



    /**
     * {@inheritDoc}
     */
    public int getSubstringLength() {
      return pSubstringLength;
    }



    /**
     * {@inheritDoc}
     */
    public Class<? extends LocalDBIndexCfg> configurationClass() {
      return LocalDBIndexCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
