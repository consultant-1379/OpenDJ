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
import org.opends.server.admin.ManagedObjectAlreadyExistsException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.PropertyOption;
import org.opends.server.admin.PropertyProvider;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.server.ServerManagedObject;
import org.opends.server.admin.std.client.RegularExpressionIdentityMapperCfgClient;
import org.opends.server.admin.std.server.IdentityMapperCfg;
import org.opends.server.admin.std.server.RegularExpressionIdentityMapperCfg;
import org.opends.server.admin.StringPropertyDefinition;
import org.opends.server.admin.Tag;
import org.opends.server.admin.UndefinedDefaultBehaviorProvider;
import org.opends.server.types.AttributeType;
import org.opends.server.types.DN;



/**
 * An interface for querying the Regular Expression Identity Mapper
 * managed object definition meta information.
 * <p>
 * The Regular Expression Identity Mapper provides a way to use a
 * regular expression to translate the provided identifier when
 * searching for the appropriate user entry.
 */
public final class RegularExpressionIdentityMapperCfgDefn extends ManagedObjectDefinition<RegularExpressionIdentityMapperCfgClient, RegularExpressionIdentityMapperCfg> {

  // The singleton configuration definition instance.
  private static final RegularExpressionIdentityMapperCfgDefn INSTANCE = new RegularExpressionIdentityMapperCfgDefn();



  // The "java-class" property definition.
  private static final ClassPropertyDefinition PD_JAVA_CLASS;



  // The "match-attribute" property definition.
  private static final AttributeTypePropertyDefinition PD_MATCH_ATTRIBUTE;



  // The "match-base-dn" property definition.
  private static final DNPropertyDefinition PD_MATCH_BASE_DN;



  // The "match-pattern" property definition.
  private static final StringPropertyDefinition PD_MATCH_PATTERN;



  // The "replace-pattern" property definition.
  private static final StringPropertyDefinition PD_REPLACE_PATTERN;



  // Build the "java-class" property definition.
  static {
      ClassPropertyDefinition.Builder builder = ClassPropertyDefinition.createBuilder(INSTANCE, "java-class");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.COMPONENT_RESTART, INSTANCE, "java-class"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("org.opends.server.extensions.RegularExpressionIdentityMapper");
      builder.setDefaultBehaviorProvider(provider);
      builder.addInstanceOf("org.opends.server.api.IdentityMapper");
      PD_JAVA_CLASS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_JAVA_CLASS);
  }



  // Build the "match-attribute" property definition.
  static {
      AttributeTypePropertyDefinition.Builder builder = AttributeTypePropertyDefinition.createBuilder(INSTANCE, "match-attribute");
      builder.setOption(PropertyOption.MULTI_VALUED);
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "match-attribute"));
      DefaultBehaviorProvider<AttributeType> provider = new DefinedDefaultBehaviorProvider<AttributeType>("uid");
      builder.setDefaultBehaviorProvider(provider);
      PD_MATCH_ATTRIBUTE = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_MATCH_ATTRIBUTE);
  }



  // Build the "match-base-dn" property definition.
  static {
      DNPropertyDefinition.Builder builder = DNPropertyDefinition.createBuilder(INSTANCE, "match-base-dn");
      builder.setOption(PropertyOption.MULTI_VALUED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "match-base-dn"));
      builder.setDefaultBehaviorProvider(new AliasDefaultBehaviorProvider<DN>(INSTANCE, "match-base-dn"));
      PD_MATCH_BASE_DN = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_MATCH_BASE_DN);
  }



  // Build the "match-pattern" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "match-pattern");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "match-pattern"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<String>());
      builder.setPattern(".*", "REGEXP");
      PD_MATCH_PATTERN = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_MATCH_PATTERN);
  }



  // Build the "replace-pattern" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "replace-pattern");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "replace-pattern"));
      builder.setDefaultBehaviorProvider(new AliasDefaultBehaviorProvider<String>(INSTANCE, "replace-pattern"));
      builder.setPattern(".*", "REGEXP");
      PD_REPLACE_PATTERN = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_REPLACE_PATTERN);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("security"));
    INSTANCE.registerTag(Tag.valueOf("user-management"));
  }



  /**
   * Get the Regular Expression Identity Mapper configuration
   * definition singleton.
   *
   * @return Returns the Regular Expression Identity Mapper
   *         configuration definition singleton.
   */
  public static RegularExpressionIdentityMapperCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private RegularExpressionIdentityMapperCfgDefn() {
    super("regular-expression-identity-mapper", IdentityMapperCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public RegularExpressionIdentityMapperCfgClient createClientConfiguration(
      ManagedObject<? extends RegularExpressionIdentityMapperCfgClient> impl) {
    return new RegularExpressionIdentityMapperCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public RegularExpressionIdentityMapperCfg createServerConfiguration(
      ServerManagedObject<? extends RegularExpressionIdentityMapperCfg> impl) {
    return new RegularExpressionIdentityMapperCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<RegularExpressionIdentityMapperCfg> getServerConfigurationClass() {
    return RegularExpressionIdentityMapperCfg.class;
  }



  /**
   * Get the "enabled" property definition.
   * <p>
   * Indicates whether the Regular Expression Identity Mapper is
   * enabled for use.
   *
   * @return Returns the "enabled" property definition.
   */
  public BooleanPropertyDefinition getEnabledPropertyDefinition() {
    return IdentityMapperCfgDefn.getInstance().getEnabledPropertyDefinition();
  }



  /**
   * Get the "java-class" property definition.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Regular Expression Identity Mapper implementation.
   *
   * @return Returns the "java-class" property definition.
   */
  public ClassPropertyDefinition getJavaClassPropertyDefinition() {
    return PD_JAVA_CLASS;
  }



  /**
   * Get the "match-attribute" property definition.
   * <p>
   * Specifies the name or OID of the attribute whose value should
   * match the provided identifier string after it has been processed
   * by the associated regular expression.
   * <p>
   * All values must refer to the name or OID of an attribute type
   * defined in the Directory Server schema. If multiple attributes or
   * OIDs are provided, at least one of those attributes must contain
   * the provided ID string value in exactly one entry.
   *
   * @return Returns the "match-attribute" property definition.
   */
  public AttributeTypePropertyDefinition getMatchAttributePropertyDefinition() {
    return PD_MATCH_ATTRIBUTE;
  }



  /**
   * Get the "match-base-dn" property definition.
   * <p>
   * Specifies the base DN(s) that should be used when performing
   * searches to map the provided ID string to a user entry. If
   * multiple values are given, searches are performed below all the
   * specified base DNs.
   *
   * @return Returns the "match-base-dn" property definition.
   */
  public DNPropertyDefinition getMatchBaseDNPropertyDefinition() {
    return PD_MATCH_BASE_DN;
  }



  /**
   * Get the "match-pattern" property definition.
   * <p>
   * Specifies the regular expression pattern that is used to identify
   * portions of the ID string that will be replaced.
   * <p>
   * Any portion of the ID string that matches this pattern is
   * replaced in accordance with the provided replace pattern (or is
   * removed if no replace pattern is specified). If multiple
   * substrings within the given ID string match this pattern, all
   * occurrences are replaced. If no part of the given ID string
   * matches this pattern, the ID string is not altered. Exactly one
   * match pattern value must be provided, and it must be a valid
   * regular expression as described in the API documentation for the
   * java.util.regex.Pattern class, including support for capturing
   * groups.
   *
   * @return Returns the "match-pattern" property definition.
   */
  public StringPropertyDefinition getMatchPatternPropertyDefinition() {
    return PD_MATCH_PATTERN;
  }



  /**
   * Get the "replace-pattern" property definition.
   * <p>
   * Specifies the replacement pattern that should be used for
   * substrings in the ID string that match the provided regular
   * expression pattern.
   * <p>
   * If no replacement pattern is provided, then any matching portions
   * of the ID string will be removed (i.e., replaced with an empty
   * string). The replacement pattern may include a string from a
   * capturing group by using a dollar sign ($) followed by an integer
   * value that indicates which capturing group should be used.
   *
   * @return Returns the "replace-pattern" property definition.
   */
  public StringPropertyDefinition getReplacePatternPropertyDefinition() {
    return PD_REPLACE_PATTERN;
  }



  /**
   * Managed object client implementation.
   */
  private static class RegularExpressionIdentityMapperCfgClientImpl implements
    RegularExpressionIdentityMapperCfgClient {

    // Private implementation.
    private ManagedObject<? extends RegularExpressionIdentityMapperCfgClient> impl;



    // Private constructor.
    private RegularExpressionIdentityMapperCfgClientImpl(
        ManagedObject<? extends RegularExpressionIdentityMapperCfgClient> impl) {
      this.impl = impl;
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
    public SortedSet<AttributeType> getMatchAttribute() {
      return impl.getPropertyValues(INSTANCE.getMatchAttributePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setMatchAttribute(Collection<AttributeType> values) {
      impl.setPropertyValues(INSTANCE.getMatchAttributePropertyDefinition(), values);
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<DN> getMatchBaseDN() {
      return impl.getPropertyValues(INSTANCE.getMatchBaseDNPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setMatchBaseDN(Collection<DN> values) {
      impl.setPropertyValues(INSTANCE.getMatchBaseDNPropertyDefinition(), values);
    }



    /**
     * {@inheritDoc}
     */
    public String getMatchPattern() {
      return impl.getPropertyValue(INSTANCE.getMatchPatternPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setMatchPattern(String value) {
      impl.setPropertyValue(INSTANCE.getMatchPatternPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public String getReplacePattern() {
      return impl.getPropertyValue(INSTANCE.getReplacePatternPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setReplacePattern(String value) {
      impl.setPropertyValue(INSTANCE.getReplacePatternPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public ManagedObjectDefinition<? extends RegularExpressionIdentityMapperCfgClient, ? extends RegularExpressionIdentityMapperCfg> definition() {
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
  private static class RegularExpressionIdentityMapperCfgServerImpl implements
    RegularExpressionIdentityMapperCfg {

    // Private implementation.
    private ServerManagedObject<? extends RegularExpressionIdentityMapperCfg> impl;

    // The value of the "enabled" property.
    private final boolean pEnabled;

    // The value of the "java-class" property.
    private final String pJavaClass;

    // The value of the "match-attribute" property.
    private final SortedSet<AttributeType> pMatchAttribute;

    // The value of the "match-base-dn" property.
    private final SortedSet<DN> pMatchBaseDN;

    // The value of the "match-pattern" property.
    private final String pMatchPattern;

    // The value of the "replace-pattern" property.
    private final String pReplacePattern;



    // Private constructor.
    private RegularExpressionIdentityMapperCfgServerImpl(ServerManagedObject<? extends RegularExpressionIdentityMapperCfg> impl) {
      this.impl = impl;
      this.pEnabled = impl.getPropertyValue(INSTANCE.getEnabledPropertyDefinition());
      this.pJavaClass = impl.getPropertyValue(INSTANCE.getJavaClassPropertyDefinition());
      this.pMatchAttribute = impl.getPropertyValues(INSTANCE.getMatchAttributePropertyDefinition());
      this.pMatchBaseDN = impl.getPropertyValues(INSTANCE.getMatchBaseDNPropertyDefinition());
      this.pMatchPattern = impl.getPropertyValue(INSTANCE.getMatchPatternPropertyDefinition());
      this.pReplacePattern = impl.getPropertyValue(INSTANCE.getReplacePatternPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addRegularExpressionChangeListener(
        ConfigurationChangeListener<RegularExpressionIdentityMapperCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeRegularExpressionChangeListener(
        ConfigurationChangeListener<RegularExpressionIdentityMapperCfg> listener) {
      impl.deregisterChangeListener(listener);
    }
    /**
     * {@inheritDoc}
     */
    public void addChangeListener(
        ConfigurationChangeListener<IdentityMapperCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeChangeListener(
        ConfigurationChangeListener<IdentityMapperCfg> listener) {
      impl.deregisterChangeListener(listener);
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
    public SortedSet<AttributeType> getMatchAttribute() {
      return pMatchAttribute;
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<DN> getMatchBaseDN() {
      return pMatchBaseDN;
    }



    /**
     * {@inheritDoc}
     */
    public String getMatchPattern() {
      return pMatchPattern;
    }



    /**
     * {@inheritDoc}
     */
    public String getReplacePattern() {
      return pReplacePattern;
    }



    /**
     * {@inheritDoc}
     */
    public Class<? extends RegularExpressionIdentityMapperCfg> configurationClass() {
      return RegularExpressionIdentityMapperCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
