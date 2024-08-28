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
import org.opends.server.admin.ManagedObjectAlreadyExistsException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.PropertyOption;
import org.opends.server.admin.PropertyProvider;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.server.ServerManagedObject;
import org.opends.server.admin.std.client.AttributeValuePasswordValidatorCfgClient;
import org.opends.server.admin.std.server.AttributeValuePasswordValidatorCfg;
import org.opends.server.admin.std.server.PasswordValidatorCfg;
import org.opends.server.admin.Tag;
import org.opends.server.admin.UndefinedDefaultBehaviorProvider;
import org.opends.server.types.AttributeType;
import org.opends.server.types.DN;



/**
 * An interface for querying the Attribute Value Password Validator
 * managed object definition meta information.
 * <p>
 * The Attribute Value Password Validator attempts to determine
 * whether a proposed password is acceptable for use by determining
 * whether that password is contained in any attribute within the
 * user's entry.
 */
public final class AttributeValuePasswordValidatorCfgDefn extends ManagedObjectDefinition<AttributeValuePasswordValidatorCfgClient, AttributeValuePasswordValidatorCfg> {

  // The singleton configuration definition instance.
  private static final AttributeValuePasswordValidatorCfgDefn INSTANCE = new AttributeValuePasswordValidatorCfgDefn();



  // The "java-class" property definition.
  private static final ClassPropertyDefinition PD_JAVA_CLASS;



  // The "match-attribute" property definition.
  private static final AttributeTypePropertyDefinition PD_MATCH_ATTRIBUTE;



  // The "test-reversed-password" property definition.
  private static final BooleanPropertyDefinition PD_TEST_REVERSED_PASSWORD;



  // Build the "java-class" property definition.
  static {
      ClassPropertyDefinition.Builder builder = ClassPropertyDefinition.createBuilder(INSTANCE, "java-class");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.COMPONENT_RESTART, INSTANCE, "java-class"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("org.opends.server.extensions.AttributeValuePasswordValidator");
      builder.setDefaultBehaviorProvider(provider);
      builder.addInstanceOf("org.opends.server.api.PasswordValidator");
      PD_JAVA_CLASS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_JAVA_CLASS);
  }



  // Build the "match-attribute" property definition.
  static {
      AttributeTypePropertyDefinition.Builder builder = AttributeTypePropertyDefinition.createBuilder(INSTANCE, "match-attribute");
      builder.setOption(PropertyOption.MULTI_VALUED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "match-attribute"));
      builder.setDefaultBehaviorProvider(new AliasDefaultBehaviorProvider<AttributeType>(INSTANCE, "match-attribute"));
      PD_MATCH_ATTRIBUTE = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_MATCH_ATTRIBUTE);
  }



  // Build the "test-reversed-password" property definition.
  static {
      BooleanPropertyDefinition.Builder builder = BooleanPropertyDefinition.createBuilder(INSTANCE, "test-reversed-password");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "test-reversed-password"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<Boolean>());
      PD_TEST_REVERSED_PASSWORD = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_TEST_REVERSED_PASSWORD);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("user-management"));
  }



  /**
   * Get the Attribute Value Password Validator configuration
   * definition singleton.
   *
   * @return Returns the Attribute Value Password Validator
   *         configuration definition singleton.
   */
  public static AttributeValuePasswordValidatorCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private AttributeValuePasswordValidatorCfgDefn() {
    super("attribute-value-password-validator", PasswordValidatorCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public AttributeValuePasswordValidatorCfgClient createClientConfiguration(
      ManagedObject<? extends AttributeValuePasswordValidatorCfgClient> impl) {
    return new AttributeValuePasswordValidatorCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public AttributeValuePasswordValidatorCfg createServerConfiguration(
      ServerManagedObject<? extends AttributeValuePasswordValidatorCfg> impl) {
    return new AttributeValuePasswordValidatorCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<AttributeValuePasswordValidatorCfg> getServerConfigurationClass() {
    return AttributeValuePasswordValidatorCfg.class;
  }



  /**
   * Get the "enabled" property definition.
   * <p>
   * Indicates whether the password validator is enabled for use.
   *
   * @return Returns the "enabled" property definition.
   */
  public BooleanPropertyDefinition getEnabledPropertyDefinition() {
    return PasswordValidatorCfgDefn.getInstance().getEnabledPropertyDefinition();
  }



  /**
   * Get the "java-class" property definition.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the password validator implementation.
   *
   * @return Returns the "java-class" property definition.
   */
  public ClassPropertyDefinition getJavaClassPropertyDefinition() {
    return PD_JAVA_CLASS;
  }



  /**
   * Get the "match-attribute" property definition.
   * <p>
   * Specifies the name(s) of the attribute(s) whose values should be
   * checked to determine whether they match the provided password. If
   * no values are provided, then the server checks if the proposed
   * password matches the value of any attribute in the user's entry.
   *
   * @return Returns the "match-attribute" property definition.
   */
  public AttributeTypePropertyDefinition getMatchAttributePropertyDefinition() {
    return PD_MATCH_ATTRIBUTE;
  }



  /**
   * Get the "test-reversed-password" property definition.
   * <p>
   * Indicates whether this password validator should test the
   * reversed value of the provided password as well as the order in
   * which it was given.
   *
   * @return Returns the "test-reversed-password" property definition.
   */
  public BooleanPropertyDefinition getTestReversedPasswordPropertyDefinition() {
    return PD_TEST_REVERSED_PASSWORD;
  }



  /**
   * Managed object client implementation.
   */
  private static class AttributeValuePasswordValidatorCfgClientImpl implements
    AttributeValuePasswordValidatorCfgClient {

    // Private implementation.
    private ManagedObject<? extends AttributeValuePasswordValidatorCfgClient> impl;



    // Private constructor.
    private AttributeValuePasswordValidatorCfgClientImpl(
        ManagedObject<? extends AttributeValuePasswordValidatorCfgClient> impl) {
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
    public Boolean isTestReversedPassword() {
      return impl.getPropertyValue(INSTANCE.getTestReversedPasswordPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setTestReversedPassword(boolean value) {
      impl.setPropertyValue(INSTANCE.getTestReversedPasswordPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public ManagedObjectDefinition<? extends AttributeValuePasswordValidatorCfgClient, ? extends AttributeValuePasswordValidatorCfg> definition() {
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
  private static class AttributeValuePasswordValidatorCfgServerImpl implements
    AttributeValuePasswordValidatorCfg {

    // Private implementation.
    private ServerManagedObject<? extends AttributeValuePasswordValidatorCfg> impl;

    // The value of the "enabled" property.
    private final boolean pEnabled;

    // The value of the "java-class" property.
    private final String pJavaClass;

    // The value of the "match-attribute" property.
    private final SortedSet<AttributeType> pMatchAttribute;

    // The value of the "test-reversed-password" property.
    private final boolean pTestReversedPassword;



    // Private constructor.
    private AttributeValuePasswordValidatorCfgServerImpl(ServerManagedObject<? extends AttributeValuePasswordValidatorCfg> impl) {
      this.impl = impl;
      this.pEnabled = impl.getPropertyValue(INSTANCE.getEnabledPropertyDefinition());
      this.pJavaClass = impl.getPropertyValue(INSTANCE.getJavaClassPropertyDefinition());
      this.pMatchAttribute = impl.getPropertyValues(INSTANCE.getMatchAttributePropertyDefinition());
      this.pTestReversedPassword = impl.getPropertyValue(INSTANCE.getTestReversedPasswordPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addAttributeValueChangeListener(
        ConfigurationChangeListener<AttributeValuePasswordValidatorCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeAttributeValueChangeListener(
        ConfigurationChangeListener<AttributeValuePasswordValidatorCfg> listener) {
      impl.deregisterChangeListener(listener);
    }
    /**
     * {@inheritDoc}
     */
    public void addChangeListener(
        ConfigurationChangeListener<PasswordValidatorCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeChangeListener(
        ConfigurationChangeListener<PasswordValidatorCfg> listener) {
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
    public boolean isTestReversedPassword() {
      return pTestReversedPassword;
    }



    /**
     * {@inheritDoc}
     */
    public Class<? extends AttributeValuePasswordValidatorCfg> configurationClass() {
      return AttributeValuePasswordValidatorCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
