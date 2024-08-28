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
import org.opends.server.admin.std.client.UniqueCharactersPasswordValidatorCfgClient;
import org.opends.server.admin.std.server.PasswordValidatorCfg;
import org.opends.server.admin.std.server.UniqueCharactersPasswordValidatorCfg;
import org.opends.server.admin.Tag;
import org.opends.server.admin.UndefinedDefaultBehaviorProvider;
import org.opends.server.types.DN;



/**
 * An interface for querying the Unique Characters Password Validator
 * managed object definition meta information.
 * <p>
 * The Unique Characters Password Validator is used to determine
 * whether a proposed password is acceptable based on the number of
 * unique characters that it contains.
 */
public final class UniqueCharactersPasswordValidatorCfgDefn extends ManagedObjectDefinition<UniqueCharactersPasswordValidatorCfgClient, UniqueCharactersPasswordValidatorCfg> {

  // The singleton configuration definition instance.
  private static final UniqueCharactersPasswordValidatorCfgDefn INSTANCE = new UniqueCharactersPasswordValidatorCfgDefn();



  // The "case-sensitive-validation" property definition.
  private static final BooleanPropertyDefinition PD_CASE_SENSITIVE_VALIDATION;



  // The "java-class" property definition.
  private static final ClassPropertyDefinition PD_JAVA_CLASS;



  // The "min-unique-characters" property definition.
  private static final IntegerPropertyDefinition PD_MIN_UNIQUE_CHARACTERS;



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
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("org.opends.server.extensions.UniqueCharactersPasswordValidator");
      builder.setDefaultBehaviorProvider(provider);
      builder.addInstanceOf("org.opends.server.api.PasswordValidator");
      PD_JAVA_CLASS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_JAVA_CLASS);
  }



  // Build the "min-unique-characters" property definition.
  static {
      IntegerPropertyDefinition.Builder builder = IntegerPropertyDefinition.createBuilder(INSTANCE, "min-unique-characters");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "min-unique-characters"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<Integer>());
      builder.setLowerLimit(0);
      PD_MIN_UNIQUE_CHARACTERS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_MIN_UNIQUE_CHARACTERS);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("user-management"));
  }



  /**
   * Get the Unique Characters Password Validator configuration
   * definition singleton.
   *
   * @return Returns the Unique Characters Password Validator
   *         configuration definition singleton.
   */
  public static UniqueCharactersPasswordValidatorCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private UniqueCharactersPasswordValidatorCfgDefn() {
    super("unique-characters-password-validator", PasswordValidatorCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public UniqueCharactersPasswordValidatorCfgClient createClientConfiguration(
      ManagedObject<? extends UniqueCharactersPasswordValidatorCfgClient> impl) {
    return new UniqueCharactersPasswordValidatorCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public UniqueCharactersPasswordValidatorCfg createServerConfiguration(
      ServerManagedObject<? extends UniqueCharactersPasswordValidatorCfg> impl) {
    return new UniqueCharactersPasswordValidatorCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<UniqueCharactersPasswordValidatorCfg> getServerConfigurationClass() {
    return UniqueCharactersPasswordValidatorCfg.class;
  }



  /**
   * Get the "case-sensitive-validation" property definition.
   * <p>
   * Indicates whether this password validator should treat password
   * characters in a case-sensitive manner.
   * <p>
   * A value of true indicates that the validator does not consider a
   * capital letter to be the same as its lower-case counterpart. A
   * value of false indicates that the validator ignores differences in
   * capitalization when looking at the number of unique characters in
   * the password.
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
   * Get the "min-unique-characters" property definition.
   * <p>
   * Specifies the minimum number of unique characters that a password
   * will be allowed to contain.
   * <p>
   * A value of zero indicates that no minimum value is enforced.
   *
   * @return Returns the "min-unique-characters" property definition.
   */
  public IntegerPropertyDefinition getMinUniqueCharactersPropertyDefinition() {
    return PD_MIN_UNIQUE_CHARACTERS;
  }



  /**
   * Managed object client implementation.
   */
  private static class UniqueCharactersPasswordValidatorCfgClientImpl implements
    UniqueCharactersPasswordValidatorCfgClient {

    // Private implementation.
    private ManagedObject<? extends UniqueCharactersPasswordValidatorCfgClient> impl;



    // Private constructor.
    private UniqueCharactersPasswordValidatorCfgClientImpl(
        ManagedObject<? extends UniqueCharactersPasswordValidatorCfgClient> impl) {
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
    public Integer getMinUniqueCharacters() {
      return impl.getPropertyValue(INSTANCE.getMinUniqueCharactersPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setMinUniqueCharacters(int value) {
      impl.setPropertyValue(INSTANCE.getMinUniqueCharactersPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public ManagedObjectDefinition<? extends UniqueCharactersPasswordValidatorCfgClient, ? extends UniqueCharactersPasswordValidatorCfg> definition() {
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
  private static class UniqueCharactersPasswordValidatorCfgServerImpl implements
    UniqueCharactersPasswordValidatorCfg {

    // Private implementation.
    private ServerManagedObject<? extends UniqueCharactersPasswordValidatorCfg> impl;

    // The value of the "case-sensitive-validation" property.
    private final boolean pCaseSensitiveValidation;

    // The value of the "enabled" property.
    private final boolean pEnabled;

    // The value of the "java-class" property.
    private final String pJavaClass;

    // The value of the "min-unique-characters" property.
    private final int pMinUniqueCharacters;



    // Private constructor.
    private UniqueCharactersPasswordValidatorCfgServerImpl(ServerManagedObject<? extends UniqueCharactersPasswordValidatorCfg> impl) {
      this.impl = impl;
      this.pCaseSensitiveValidation = impl.getPropertyValue(INSTANCE.getCaseSensitiveValidationPropertyDefinition());
      this.pEnabled = impl.getPropertyValue(INSTANCE.getEnabledPropertyDefinition());
      this.pJavaClass = impl.getPropertyValue(INSTANCE.getJavaClassPropertyDefinition());
      this.pMinUniqueCharacters = impl.getPropertyValue(INSTANCE.getMinUniqueCharactersPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addUniqueCharactersChangeListener(
        ConfigurationChangeListener<UniqueCharactersPasswordValidatorCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeUniqueCharactersChangeListener(
        ConfigurationChangeListener<UniqueCharactersPasswordValidatorCfg> listener) {
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
    public int getMinUniqueCharacters() {
      return pMinUniqueCharacters;
    }



    /**
     * {@inheritDoc}
     */
    public Class<? extends UniqueCharactersPasswordValidatorCfg> configurationClass() {
      return UniqueCharactersPasswordValidatorCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
