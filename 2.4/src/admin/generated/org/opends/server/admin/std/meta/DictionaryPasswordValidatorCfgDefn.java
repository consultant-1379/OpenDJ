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
import org.opends.server.admin.ManagedObjectAlreadyExistsException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.PropertyOption;
import org.opends.server.admin.PropertyProvider;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.server.ServerManagedObject;
import org.opends.server.admin.std.client.DictionaryPasswordValidatorCfgClient;
import org.opends.server.admin.std.server.DictionaryPasswordValidatorCfg;
import org.opends.server.admin.std.server.PasswordValidatorCfg;
import org.opends.server.admin.StringPropertyDefinition;
import org.opends.server.admin.Tag;
import org.opends.server.types.DN;



/**
 * An interface for querying the Dictionary Password Validator managed
 * object definition meta information.
 * <p>
 * The Dictionary Password Validator determines whether a proposed
 * password is acceptable based on whether the given password value
 * appears in a provided dictionary file.
 */
public final class DictionaryPasswordValidatorCfgDefn extends ManagedObjectDefinition<DictionaryPasswordValidatorCfgClient, DictionaryPasswordValidatorCfg> {

  // The singleton configuration definition instance.
  private static final DictionaryPasswordValidatorCfgDefn INSTANCE = new DictionaryPasswordValidatorCfgDefn();



  // The "case-sensitive-validation" property definition.
  private static final BooleanPropertyDefinition PD_CASE_SENSITIVE_VALIDATION;



  // The "dictionary-file" property definition.
  private static final StringPropertyDefinition PD_DICTIONARY_FILE;



  // The "java-class" property definition.
  private static final ClassPropertyDefinition PD_JAVA_CLASS;



  // The "test-reversed-password" property definition.
  private static final BooleanPropertyDefinition PD_TEST_REVERSED_PASSWORD;



  // Build the "case-sensitive-validation" property definition.
  static {
      BooleanPropertyDefinition.Builder builder = BooleanPropertyDefinition.createBuilder(INSTANCE, "case-sensitive-validation");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "case-sensitive-validation"));
      DefaultBehaviorProvider<Boolean> provider = new DefinedDefaultBehaviorProvider<Boolean>("false");
      builder.setDefaultBehaviorProvider(provider);
      PD_CASE_SENSITIVE_VALIDATION = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_CASE_SENSITIVE_VALIDATION);
  }



  // Build the "dictionary-file" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "dictionary-file");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "dictionary-file"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("For Unix and Linux systems: config/wordlist.txt. For Windows systems: config\\wordlist.txt");
      builder.setDefaultBehaviorProvider(provider);
      builder.setPattern(".*", "FILE");
      PD_DICTIONARY_FILE = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_DICTIONARY_FILE);
  }



  // Build the "java-class" property definition.
  static {
      ClassPropertyDefinition.Builder builder = ClassPropertyDefinition.createBuilder(INSTANCE, "java-class");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.COMPONENT_RESTART, INSTANCE, "java-class"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("org.opends.server.extensions.DictionaryPasswordValidator");
      builder.setDefaultBehaviorProvider(provider);
      builder.addInstanceOf("org.opends.server.api.PasswordValidator");
      PD_JAVA_CLASS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_JAVA_CLASS);
  }



  // Build the "test-reversed-password" property definition.
  static {
      BooleanPropertyDefinition.Builder builder = BooleanPropertyDefinition.createBuilder(INSTANCE, "test-reversed-password");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "test-reversed-password"));
      DefaultBehaviorProvider<Boolean> provider = new DefinedDefaultBehaviorProvider<Boolean>("true");
      builder.setDefaultBehaviorProvider(provider);
      PD_TEST_REVERSED_PASSWORD = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_TEST_REVERSED_PASSWORD);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("user-management"));
  }



  /**
   * Get the Dictionary Password Validator configuration definition
   * singleton.
   *
   * @return Returns the Dictionary Password Validator configuration
   *         definition singleton.
   */
  public static DictionaryPasswordValidatorCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private DictionaryPasswordValidatorCfgDefn() {
    super("dictionary-password-validator", PasswordValidatorCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public DictionaryPasswordValidatorCfgClient createClientConfiguration(
      ManagedObject<? extends DictionaryPasswordValidatorCfgClient> impl) {
    return new DictionaryPasswordValidatorCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public DictionaryPasswordValidatorCfg createServerConfiguration(
      ServerManagedObject<? extends DictionaryPasswordValidatorCfg> impl) {
    return new DictionaryPasswordValidatorCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<DictionaryPasswordValidatorCfg> getServerConfigurationClass() {
    return DictionaryPasswordValidatorCfg.class;
  }



  /**
   * Get the "case-sensitive-validation" property definition.
   * <p>
   * Indicates whether this password validator is to treat password
   * characters in a case-sensitive manner.
   * <p>
   * If it is set to true, then the validator rejects a password only
   * if it appears in the dictionary with exactly the same
   * capitalization as provided by the user.
   *
   * @return Returns the "case-sensitive-validation" property definition.
   */
  public BooleanPropertyDefinition getCaseSensitiveValidationPropertyDefinition() {
    return PD_CASE_SENSITIVE_VALIDATION;
  }



  /**
   * Get the "dictionary-file" property definition.
   * <p>
   * Specifies the path to the file containing a list of words that
   * cannot be used as passwords.
   * <p>
   * It should be formatted with one word per line. The value can be
   * an absolute path or a path that is relative to the OpenDS
   * Directory Server instance root.
   *
   * @return Returns the "dictionary-file" property definition.
   */
  public StringPropertyDefinition getDictionaryFilePropertyDefinition() {
    return PD_DICTIONARY_FILE;
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
   * Get the "test-reversed-password" property definition.
   * <p>
   * Indicates whether this password validator is to test the reversed
   * value of the provided password as well as the order in which it
   * was given.
   * <p>
   * For example, if the user provides a new password of "password"
   * and this configuration attribute is set to true, then the value
   * "drowssap" is also tested against attribute values in the user's
   * entry.
   *
   * @return Returns the "test-reversed-password" property definition.
   */
  public BooleanPropertyDefinition getTestReversedPasswordPropertyDefinition() {
    return PD_TEST_REVERSED_PASSWORD;
  }



  /**
   * Managed object client implementation.
   */
  private static class DictionaryPasswordValidatorCfgClientImpl implements
    DictionaryPasswordValidatorCfgClient {

    // Private implementation.
    private ManagedObject<? extends DictionaryPasswordValidatorCfgClient> impl;



    // Private constructor.
    private DictionaryPasswordValidatorCfgClientImpl(
        ManagedObject<? extends DictionaryPasswordValidatorCfgClient> impl) {
      this.impl = impl;
    }



    /**
     * {@inheritDoc}
     */
    public boolean isCaseSensitiveValidation() {
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
    public String getDictionaryFile() {
      return impl.getPropertyValue(INSTANCE.getDictionaryFilePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setDictionaryFile(String value) {
      impl.setPropertyValue(INSTANCE.getDictionaryFilePropertyDefinition(), value);
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
    public boolean isTestReversedPassword() {
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
    public ManagedObjectDefinition<? extends DictionaryPasswordValidatorCfgClient, ? extends DictionaryPasswordValidatorCfg> definition() {
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
  private static class DictionaryPasswordValidatorCfgServerImpl implements
    DictionaryPasswordValidatorCfg {

    // Private implementation.
    private ServerManagedObject<? extends DictionaryPasswordValidatorCfg> impl;

    // The value of the "case-sensitive-validation" property.
    private final boolean pCaseSensitiveValidation;

    // The value of the "dictionary-file" property.
    private final String pDictionaryFile;

    // The value of the "enabled" property.
    private final boolean pEnabled;

    // The value of the "java-class" property.
    private final String pJavaClass;

    // The value of the "test-reversed-password" property.
    private final boolean pTestReversedPassword;



    // Private constructor.
    private DictionaryPasswordValidatorCfgServerImpl(ServerManagedObject<? extends DictionaryPasswordValidatorCfg> impl) {
      this.impl = impl;
      this.pCaseSensitiveValidation = impl.getPropertyValue(INSTANCE.getCaseSensitiveValidationPropertyDefinition());
      this.pDictionaryFile = impl.getPropertyValue(INSTANCE.getDictionaryFilePropertyDefinition());
      this.pEnabled = impl.getPropertyValue(INSTANCE.getEnabledPropertyDefinition());
      this.pJavaClass = impl.getPropertyValue(INSTANCE.getJavaClassPropertyDefinition());
      this.pTestReversedPassword = impl.getPropertyValue(INSTANCE.getTestReversedPasswordPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addDictionaryChangeListener(
        ConfigurationChangeListener<DictionaryPasswordValidatorCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeDictionaryChangeListener(
        ConfigurationChangeListener<DictionaryPasswordValidatorCfg> listener) {
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
    public String getDictionaryFile() {
      return pDictionaryFile;
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
    public boolean isTestReversedPassword() {
      return pTestReversedPassword;
    }



    /**
     * {@inheritDoc}
     */
    public Class<? extends DictionaryPasswordValidatorCfg> configurationClass() {
      return DictionaryPasswordValidatorCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
