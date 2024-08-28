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
import org.opends.server.admin.EnumPropertyDefinition;
import org.opends.server.admin.ManagedObjectAlreadyExistsException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.PropertyOption;
import org.opends.server.admin.PropertyProvider;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.server.ServerManagedObject;
import org.opends.server.admin.std.client.CollationMatchingRuleCfgClient;
import org.opends.server.admin.std.server.CollationMatchingRuleCfg;
import org.opends.server.admin.std.server.MatchingRuleCfg;
import org.opends.server.admin.StringPropertyDefinition;
import org.opends.server.admin.Tag;
import org.opends.server.admin.UndefinedDefaultBehaviorProvider;
import org.opends.server.types.DN;



/**
 * An interface for querying the Collation Matching Rule managed
 * object definition meta information.
 * <p>
 * Collation Matching Rules provide support for locale-specific
 * filtering and indexing.
 */
public final class CollationMatchingRuleCfgDefn extends ManagedObjectDefinition<CollationMatchingRuleCfgClient, CollationMatchingRuleCfg> {

  // The singleton configuration definition instance.
  private static final CollationMatchingRuleCfgDefn INSTANCE = new CollationMatchingRuleCfgDefn();



  /**
   * Defines the set of permissable values for the "matching-rule-type" property.
   * <p>
   * the types of matching rules that should be supported for each
   * locale
   */
  public static enum MatchingRuleType {

    /**
     * Specifies if equality type collation matching rule needs to be
     * created for each locale.
     */
    EQUALITY("equality"),



    /**
     * Specifies if greater-than type collation matching rule needs to
     * be created for each locale.
     */
    GREATER_THAN("greater-than"),



    /**
     * Specifies if greater-than-or-equal-to type collation matching
     * rule needs to be created for each locale.
     */
    GREATER_THAN_OR_EQUAL_TO("greater-than-or-equal-to"),



    /**
     * Specifies if less-than type collation matching rule needs to be
     * created for each locale.
     */
    LESS_THAN("less-than"),



    /**
     * Specifies if less-than-or-equal-to type collation matching rule
     * needs to be created for each locale.
     */
    LESS_THAN_OR_EQUAL_TO("less-than-or-equal-to"),



    /**
     * Specifies if substring type collation matching rule needs to be
     * created for each locale.
     */
    SUBSTRING("substring");



    // String representation of the value.
    private final String name;



    // Private constructor.
    private MatchingRuleType(String name) { this.name = name; }



    /**
     * {@inheritDoc}
     */
    public String toString() { return name; }

  }



  // The "collation" property definition.
  private static final StringPropertyDefinition PD_COLLATION;



  // The "java-class" property definition.
  private static final ClassPropertyDefinition PD_JAVA_CLASS;



  // The "matching-rule-type" property definition.
  private static final EnumPropertyDefinition<MatchingRuleType> PD_MATCHING_RULE_TYPE;



  // Build the "collation" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "collation");
      builder.setOption(PropertyOption.MULTI_VALUED);
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "collation"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<String>());
      builder.setPattern("^[a-z-A-Z]+:[0-9.]+\\d$", "LOCALE:OID");
      PD_COLLATION = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_COLLATION);
  }



  // Build the "java-class" property definition.
  static {
      ClassPropertyDefinition.Builder builder = ClassPropertyDefinition.createBuilder(INSTANCE, "java-class");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "java-class"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("org.opends.server.schema.CollationMatchingRuleFactory");
      builder.setDefaultBehaviorProvider(provider);
      builder.addInstanceOf("org.opends.server.api.MatchingRuleFactory");
      PD_JAVA_CLASS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_JAVA_CLASS);
  }



  // Build the "matching-rule-type" property definition.
  static {
      EnumPropertyDefinition.Builder<MatchingRuleType> builder = EnumPropertyDefinition.createBuilder(INSTANCE, "matching-rule-type");
      builder.setOption(PropertyOption.MULTI_VALUED);
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "matching-rule-type"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<MatchingRuleType>());
      builder.setEnumClass(MatchingRuleType.class);
      PD_MATCHING_RULE_TYPE = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_MATCHING_RULE_TYPE);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("core-server"));
  }



  /**
   * Get the Collation Matching Rule configuration definition
   * singleton.
   *
   * @return Returns the Collation Matching Rule configuration
   *         definition singleton.
   */
  public static CollationMatchingRuleCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private CollationMatchingRuleCfgDefn() {
    super("collation-matching-rule", MatchingRuleCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public CollationMatchingRuleCfgClient createClientConfiguration(
      ManagedObject<? extends CollationMatchingRuleCfgClient> impl) {
    return new CollationMatchingRuleCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public CollationMatchingRuleCfg createServerConfiguration(
      ServerManagedObject<? extends CollationMatchingRuleCfg> impl) {
    return new CollationMatchingRuleCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<CollationMatchingRuleCfg> getServerConfigurationClass() {
    return CollationMatchingRuleCfg.class;
  }



  /**
   * Get the "collation" property definition.
   * <p>
   * the set of supported locales
   * <p>
   * Collation must be specified using the syntax: LOCALE:OID
   *
   * @return Returns the "collation" property definition.
   */
  public StringPropertyDefinition getCollationPropertyDefinition() {
    return PD_COLLATION;
  }



  /**
   * Get the "enabled" property definition.
   * <p>
   * Indicates whether the Collation Matching Rule is enabled for use.
   *
   * @return Returns the "enabled" property definition.
   */
  public BooleanPropertyDefinition getEnabledPropertyDefinition() {
    return MatchingRuleCfgDefn.getInstance().getEnabledPropertyDefinition();
  }



  /**
   * Get the "java-class" property definition.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Collation Matching Rule implementation.
   *
   * @return Returns the "java-class" property definition.
   */
  public ClassPropertyDefinition getJavaClassPropertyDefinition() {
    return PD_JAVA_CLASS;
  }



  /**
   * Get the "matching-rule-type" property definition.
   * <p>
   * the types of matching rules that should be supported for each
   * locale
   *
   * @return Returns the "matching-rule-type" property definition.
   */
  public EnumPropertyDefinition<MatchingRuleType> getMatchingRuleTypePropertyDefinition() {
    return PD_MATCHING_RULE_TYPE;
  }



  /**
   * Managed object client implementation.
   */
  private static class CollationMatchingRuleCfgClientImpl implements
    CollationMatchingRuleCfgClient {

    // Private implementation.
    private ManagedObject<? extends CollationMatchingRuleCfgClient> impl;



    // Private constructor.
    private CollationMatchingRuleCfgClientImpl(
        ManagedObject<? extends CollationMatchingRuleCfgClient> impl) {
      this.impl = impl;
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<String> getCollation() {
      return impl.getPropertyValues(INSTANCE.getCollationPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setCollation(Collection<String> values) {
      impl.setPropertyValues(INSTANCE.getCollationPropertyDefinition(), values);
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
    public SortedSet<MatchingRuleType> getMatchingRuleType() {
      return impl.getPropertyValues(INSTANCE.getMatchingRuleTypePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setMatchingRuleType(Collection<MatchingRuleType> values) {
      impl.setPropertyValues(INSTANCE.getMatchingRuleTypePropertyDefinition(), values);
    }



    /**
     * {@inheritDoc}
     */
    public ManagedObjectDefinition<? extends CollationMatchingRuleCfgClient, ? extends CollationMatchingRuleCfg> definition() {
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
  private static class CollationMatchingRuleCfgServerImpl implements
    CollationMatchingRuleCfg {

    // Private implementation.
    private ServerManagedObject<? extends CollationMatchingRuleCfg> impl;

    // The value of the "collation" property.
    private final SortedSet<String> pCollation;

    // The value of the "enabled" property.
    private final boolean pEnabled;

    // The value of the "java-class" property.
    private final String pJavaClass;

    // The value of the "matching-rule-type" property.
    private final SortedSet<MatchingRuleType> pMatchingRuleType;



    // Private constructor.
    private CollationMatchingRuleCfgServerImpl(ServerManagedObject<? extends CollationMatchingRuleCfg> impl) {
      this.impl = impl;
      this.pCollation = impl.getPropertyValues(INSTANCE.getCollationPropertyDefinition());
      this.pEnabled = impl.getPropertyValue(INSTANCE.getEnabledPropertyDefinition());
      this.pJavaClass = impl.getPropertyValue(INSTANCE.getJavaClassPropertyDefinition());
      this.pMatchingRuleType = impl.getPropertyValues(INSTANCE.getMatchingRuleTypePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addCollationChangeListener(
        ConfigurationChangeListener<CollationMatchingRuleCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeCollationChangeListener(
        ConfigurationChangeListener<CollationMatchingRuleCfg> listener) {
      impl.deregisterChangeListener(listener);
    }
    /**
     * {@inheritDoc}
     */
    public void addChangeListener(
        ConfigurationChangeListener<MatchingRuleCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeChangeListener(
        ConfigurationChangeListener<MatchingRuleCfg> listener) {
      impl.deregisterChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<String> getCollation() {
      return pCollation;
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
    public String getJavaClass() {
      return pJavaClass;
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<MatchingRuleType> getMatchingRuleType() {
      return pMatchingRuleType;
    }



    /**
     * {@inheritDoc}
     */
    public Class<? extends CollationMatchingRuleCfg> configurationClass() {
      return CollationMatchingRuleCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
