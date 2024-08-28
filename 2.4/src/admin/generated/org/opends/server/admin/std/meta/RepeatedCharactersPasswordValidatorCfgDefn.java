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
import org.opends.server.admin.IntegerPropertyDefinition;
import org.opends.server.admin.ManagedObjectAlreadyExistsException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.PropertyOption;
import org.opends.server.admin.PropertyProvider;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.server.ServerManagedObject;
import org.opends.server.admin.std.client.RepeatedCharactersPasswordValidatorCfgClient;
import org.opends.server.admin.std.server.PasswordValidatorCfg;
import org.opends.server.admin.std.server.RepeatedCharactersPasswordValidatorCfg;
import org.opends.server.admin.Tag;
import org.opends.server.admin.UndefinedDefaultBehaviorProvider;
import org.opends.server.types.DN;



/**
 * An interface for querying the Repeated Characters Password
 * Validator managed object definition meta information.
 * <p>
 * The Repeated Characters Password Validator is used to determine
 * whether a proposed password is acceptable based on the number of
 * times any character appears consecutively in a password value.
 */
public final class RepeatedCharactersPasswordValidatorCfgDefn extends ManagedObjectDefinition<RepeatedCharactersPasswordValidatorCfgClient, RepeatedCharactersPasswordValidatorCfg> {

  // The singleton configuration definition instance.
  private static final RepeatedCharactersPasswordValidatorCfgDefn INSTANCE = new RepeatedCharactersPasswordValidatorCfgDefn();



  // The "case-sensitive-validation" property definition.
  private static final BooleanPropertyDefinition PD_CASE_SENSITIVE_VALIDATION;



  // The "java-class" property definition.
  private static final ClassPropertyDefinition PD_JAVA_CLASS;



  // The "max-consecutive-length" property definition.
  private static final IntegerPropertyDefinition PD_MAX_CONSECUTIVE_LENGTH;



  // Build the "case-sensitive-validation" property definition.
  static {
      BooleanPropertyDefinition.Builder builder = BooleanPropertyDefinition.createBuilder(INSTANCE, "case-sensitive-validation");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "case-sensitive-validation"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<Boolean>());
      PD_CASE_SENSITIVE_VALIDATION = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_CASE_SENSITIVE_VALIDATION);
  }



  // Build the "java-class" property definition.
  static {
      ClassPropertyDefinition.Builder builder = ClassPropertyDefinition.createBuilder(INSTANCE, "java-class");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.COMPONENT_RESTART, INSTANCE, "java-class"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("org.opends.server.extensions.RepeatedCharactersPasswordValidator");
      builder.setDefaultBehaviorProvider(provider);
      builder.addInstanceOf("org.opends.server.api.PasswordValidator");
      PD_JAVA_CLASS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_JAVA_CLASS);
  }



  // Build the "max-consecutive-length" property definition.
  static {
      IntegerPropertyDefinition.Builder builder = IntegerPropertyDefinition.createBuilder(INSTANCE, "max-consecutive-length");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "max-consecutive-length"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<Integer>());
      builder.setLowerLimit(0);
      PD_MAX_CONSECUTIVE_LENGTH = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_MAX_CONSECUTIVE_LENGTH);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("user-management"));
  }



  /**
   * Get the Repeated Characters Password Validator configuration
   * definition singleton.
   *
   * @return Returns the Repeated Characters Password Validator
   *         configuration definition singleton.
   */
  public static RepeatedCharactersPasswordValidatorCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private RepeatedCharactersPasswordValidatorCfgDefn() {
    super("repeated-characters-password-validator", PasswordValidatorCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public RepeatedCharactersPasswordValidatorCfgClient createClientConfiguration(
      ManagedObject<? extends RepeatedCharactersPasswordValidatorCfgClient> impl) {
    return new RepeatedCharactersPasswordValidatorCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public RepeatedCharactersPasswordValidatorCfg createServerConfiguration(
      ServerManagedObject<? extends RepeatedCharactersPasswordValidatorCfg> impl) {
    return new RepeatedCharactersPasswordValidatorCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<RepeatedCharactersPasswordValidatorCfg> getServerConfigurationClass() {
    return RepeatedCharactersPasswordValidatorCfg.class;
  }



  /**
   * Get the "case-sensitive-validation" property definition.
   * <p>
   * Indicates whether this password validator should treat password
   * characters in a case-sensitive manner.
   * <p>
   * If the value of this property is false, the validator ignores any
   * differences in capitalization when looking for consecutive
   * characters in the password. If the value is true, the validator
   * considers a character to be repeating only if all consecutive
   * occurrences use the same capitalization.
   *
   * @return Returns the "case-sensitive-validation" property definition.
   */
  public BooleanPropertyDefinition getCaseSensitiveValidationPropertyDefinition() {
    return PD_CASE_SENSITIVE_VALIDATION;
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
   * Get the "max-consecutive-length" property definition.
   * <p>
   * Specifies the maximum number of times that any character can
   * appear consecutively in a password value.
   * <p>
   * A value of zero indicates that no maximum limit is enforced.
   *
   * @return Returns the "max-consecutive-length" property definition.
   */
  public IntegerPropertyDefinition getMaxConsecutiveLengthPropertyDefinition() {
    return PD_MAX_CONSECUTIVE_LENGTH;
  }



  /**
   * Managed object client implementation.
   */
  private static class RepeatedCharactersPasswordValidatorCfgClientImpl implements
    RepeatedCharactersPasswordValidatorCfgClient {

    // Private implementation.
    private ManagedObject<? extends RepeatedCharactersPasswordValidatorCfgClient> impl;



    // Private constructor.
    private RepeatedCharactersPasswordValidatorCfgClientImpl(
        ManagedObject<? extends RepeatedCharactersPasswordValidatorCfgClient> impl) {
      this.impl = impl;
    }



    /**
     * {@inheritDoc}
     */
    public Boolean isCaseSensitiveValidation() {
      return impl.getPropertyValue(INSTANCE.getCaseSensitiveValidationPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setCaseSensitiveValidation(boolean value) {
      impl.setPropertyValue(INSTANCE.getCaseSensitiveValidationPropertyDefinition(), value);
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
    public Integer getMaxConsecutiveLength() {
      return impl.getPropertyValue(INSTANCE.getMaxConsecutiveLengthPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setMaxConsecutiveLength(int value) {
      impl.setPropertyValue(INSTANCE.getMaxConsecutiveLengthPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public ManagedObjectDefinition<? extends RepeatedCharactersPasswordValidatorCfgClient, ? extends RepeatedCharactersPasswordValidatorCfg> definition() {
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
  private static class RepeatedCharactersPasswordValidatorCfgServerImpl implements
    RepeatedCharactersPasswordValidatorCfg {

    // Private implementation.
    private ServerManagedObject<? extends RepeatedCharactersPasswordValidatorCfg> impl;

    // The value of the "case-sensitive-validation" property.
    private final boolean pCaseSensitiveValidation;

    // The value of the "enabled" property.
    private final boolean pEnabled;

    // The value of the "java-class" property.
    private final String pJavaClass;

    // The value of the "max-consecutive-length" property.
    private final int pMaxConsecutiveLength;



    // Private constructor.
    private RepeatedCharactersPasswordValidatorCfgServerImpl(ServerManagedObject<? extends RepeatedCharactersPasswordValidatorCfg> impl) {
      this.impl = impl;
      this.pCaseSensitiveValidation = impl.getPropertyValue(INSTANCE.getCaseSensitiveValidationPropertyDefinition());
      this.pEnabled = impl.getPropertyValue(INSTANCE.getEnabledPropertyDefinition());
      this.pJavaClass = impl.getPropertyValue(INSTANCE.getJavaClassPropertyDefinition());
      this.pMaxConsecutiveLength = impl.getPropertyValue(INSTANCE.getMaxConsecutiveLengthPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addRepeatedCharactersChangeListener(
        ConfigurationChangeListener<RepeatedCharactersPasswordValidatorCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeRepeatedCharactersChangeListener(
        ConfigurationChangeListener<RepeatedCharactersPasswordValidatorCfg> listener) {
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
    public boolean isCaseSensitiveValidation() {
      return pCaseSensitiveValidation;
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
    public int getMaxConsecutiveLength() {
      return pMaxConsecutiveLength;
    }



    /**
     * {@inheritDoc}
     */
    public Class<? extends RepeatedCharactersPasswordValidatorCfg> configurationClass() {
      return RepeatedCharactersPasswordValidatorCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
