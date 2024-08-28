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
import org.opends.server.admin.std.client.LengthBasedPasswordValidatorCfgClient;
import org.opends.server.admin.std.server.LengthBasedPasswordValidatorCfg;
import org.opends.server.admin.std.server.PasswordValidatorCfg;
import org.opends.server.admin.Tag;
import org.opends.server.types.DN;



/**
 * An interface for querying the Length Based Password Validator
 * managed object definition meta information.
 * <p>
 * The Length Based Password Validator is used to determine whether a
 * proposed password is acceptable based on whether the number of
 * characters it contains falls within an acceptable range of values.
 */
public final class LengthBasedPasswordValidatorCfgDefn extends ManagedObjectDefinition<LengthBasedPasswordValidatorCfgClient, LengthBasedPasswordValidatorCfg> {

  // The singleton configuration definition instance.
  private static final LengthBasedPasswordValidatorCfgDefn INSTANCE = new LengthBasedPasswordValidatorCfgDefn();



  // The "java-class" property definition.
  private static final ClassPropertyDefinition PD_JAVA_CLASS;



  // The "max-password-length" property definition.
  private static final IntegerPropertyDefinition PD_MAX_PASSWORD_LENGTH;



  // The "min-password-length" property definition.
  private static final IntegerPropertyDefinition PD_MIN_PASSWORD_LENGTH;



  // Build the "java-class" property definition.
  static {
      ClassPropertyDefinition.Builder builder = ClassPropertyDefinition.createBuilder(INSTANCE, "java-class");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.COMPONENT_RESTART, INSTANCE, "java-class"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("org.opends.server.extensions.LengthBasedPasswordValidator");
      builder.setDefaultBehaviorProvider(provider);
      builder.addInstanceOf("org.opends.server.api.PasswordValidator");
      PD_JAVA_CLASS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_JAVA_CLASS);
  }



  // Build the "max-password-length" property definition.
  static {
      IntegerPropertyDefinition.Builder builder = IntegerPropertyDefinition.createBuilder(INSTANCE, "max-password-length");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "max-password-length"));
      DefaultBehaviorProvider<Integer> provider = new DefinedDefaultBehaviorProvider<Integer>("0");
      builder.setDefaultBehaviorProvider(provider);
      builder.setUpperLimit(2147483647);
      builder.setLowerLimit(0);
      PD_MAX_PASSWORD_LENGTH = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_MAX_PASSWORD_LENGTH);
  }



  // Build the "min-password-length" property definition.
  static {
      IntegerPropertyDefinition.Builder builder = IntegerPropertyDefinition.createBuilder(INSTANCE, "min-password-length");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "min-password-length"));
      DefaultBehaviorProvider<Integer> provider = new DefinedDefaultBehaviorProvider<Integer>("6");
      builder.setDefaultBehaviorProvider(provider);
      builder.setUpperLimit(2147483647);
      builder.setLowerLimit(0);
      PD_MIN_PASSWORD_LENGTH = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_MIN_PASSWORD_LENGTH);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("user-management"));
  }



  /**
   * Get the Length Based Password Validator configuration definition
   * singleton.
   *
   * @return Returns the Length Based Password Validator configuration
   *         definition singleton.
   */
  public static LengthBasedPasswordValidatorCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private LengthBasedPasswordValidatorCfgDefn() {
    super("length-based-password-validator", PasswordValidatorCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public LengthBasedPasswordValidatorCfgClient createClientConfiguration(
      ManagedObject<? extends LengthBasedPasswordValidatorCfgClient> impl) {
    return new LengthBasedPasswordValidatorCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public LengthBasedPasswordValidatorCfg createServerConfiguration(
      ServerManagedObject<? extends LengthBasedPasswordValidatorCfg> impl) {
    return new LengthBasedPasswordValidatorCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<LengthBasedPasswordValidatorCfg> getServerConfigurationClass() {
    return LengthBasedPasswordValidatorCfg.class;
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
   * Get the "max-password-length" property definition.
   * <p>
   * Specifies the maximum number of characters that can be included
   * in a proposed password.
   * <p>
   * A value of zero indicates that there will be no upper bound
   * enforced. If both minimum and maximum lengths are defined, then
   * the minimum length must be less than or equal to the maximum
   * length.
   *
   * @return Returns the "max-password-length" property definition.
   */
  public IntegerPropertyDefinition getMaxPasswordLengthPropertyDefinition() {
    return PD_MAX_PASSWORD_LENGTH;
  }



  /**
   * Get the "min-password-length" property definition.
   * <p>
   * Specifies the minimum number of characters that must be included
   * in a proposed password.
   * <p>
   * A value of zero indicates that there will be no lower bound
   * enforced. If both minimum and maximum lengths are defined, then
   * the minimum length must be less than or equal to the maximum
   * length.
   *
   * @return Returns the "min-password-length" property definition.
   */
  public IntegerPropertyDefinition getMinPasswordLengthPropertyDefinition() {
    return PD_MIN_PASSWORD_LENGTH;
  }



  /**
   * Managed object client implementation.
   */
  private static class LengthBasedPasswordValidatorCfgClientImpl implements
    LengthBasedPasswordValidatorCfgClient {

    // Private implementation.
    private ManagedObject<? extends LengthBasedPasswordValidatorCfgClient> impl;



    // Private constructor.
    private LengthBasedPasswordValidatorCfgClientImpl(
        ManagedObject<? extends LengthBasedPasswordValidatorCfgClient> impl) {
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
    public int getMaxPasswordLength() {
      return impl.getPropertyValue(INSTANCE.getMaxPasswordLengthPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setMaxPasswordLength(Integer value) {
      impl.setPropertyValue(INSTANCE.getMaxPasswordLengthPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public int getMinPasswordLength() {
      return impl.getPropertyValue(INSTANCE.getMinPasswordLengthPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setMinPasswordLength(Integer value) {
      impl.setPropertyValue(INSTANCE.getMinPasswordLengthPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public ManagedObjectDefinition<? extends LengthBasedPasswordValidatorCfgClient, ? extends LengthBasedPasswordValidatorCfg> definition() {
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
  private static class LengthBasedPasswordValidatorCfgServerImpl implements
    LengthBasedPasswordValidatorCfg {

    // Private implementation.
    private ServerManagedObject<? extends LengthBasedPasswordValidatorCfg> impl;

    // The value of the "enabled" property.
    private final boolean pEnabled;

    // The value of the "java-class" property.
    private final String pJavaClass;

    // The value of the "max-password-length" property.
    private final int pMaxPasswordLength;

    // The value of the "min-password-length" property.
    private final int pMinPasswordLength;



    // Private constructor.
    private LengthBasedPasswordValidatorCfgServerImpl(ServerManagedObject<? extends LengthBasedPasswordValidatorCfg> impl) {
      this.impl = impl;
      this.pEnabled = impl.getPropertyValue(INSTANCE.getEnabledPropertyDefinition());
      this.pJavaClass = impl.getPropertyValue(INSTANCE.getJavaClassPropertyDefinition());
      this.pMaxPasswordLength = impl.getPropertyValue(INSTANCE.getMaxPasswordLengthPropertyDefinition());
      this.pMinPasswordLength = impl.getPropertyValue(INSTANCE.getMinPasswordLengthPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addLengthBasedChangeListener(
        ConfigurationChangeListener<LengthBasedPasswordValidatorCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeLengthBasedChangeListener(
        ConfigurationChangeListener<LengthBasedPasswordValidatorCfg> listener) {
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
    public int getMaxPasswordLength() {
      return pMaxPasswordLength;
    }



    /**
     * {@inheritDoc}
     */
    public int getMinPasswordLength() {
      return pMinPasswordLength;
    }



    /**
     * {@inheritDoc}
     */
    public Class<? extends LengthBasedPasswordValidatorCfg> configurationClass() {
      return LengthBasedPasswordValidatorCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
