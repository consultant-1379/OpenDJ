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
import org.opends.server.admin.std.client.SimilarityBasedPasswordValidatorCfgClient;
import org.opends.server.admin.std.server.PasswordValidatorCfg;
import org.opends.server.admin.std.server.SimilarityBasedPasswordValidatorCfg;
import org.opends.server.admin.Tag;
import org.opends.server.admin.UndefinedDefaultBehaviorProvider;
import org.opends.server.types.DN;



/**
 * An interface for querying the Similarity Based Password Validator
 * managed object definition meta information.
 * <p>
 * The Similarity Based Password Validator determines whether a
 * proposed password is acceptable by measuring how similar it is to
 * the user's current password.
 */
public final class SimilarityBasedPasswordValidatorCfgDefn extends ManagedObjectDefinition<SimilarityBasedPasswordValidatorCfgClient, SimilarityBasedPasswordValidatorCfg> {

  // The singleton configuration definition instance.
  private static final SimilarityBasedPasswordValidatorCfgDefn INSTANCE = new SimilarityBasedPasswordValidatorCfgDefn();



  // The "java-class" property definition.
  private static final ClassPropertyDefinition PD_JAVA_CLASS;



  // The "min-password-difference" property definition.
  private static final IntegerPropertyDefinition PD_MIN_PASSWORD_DIFFERENCE;



  // Build the "java-class" property definition.
  static {
      ClassPropertyDefinition.Builder builder = ClassPropertyDefinition.createBuilder(INSTANCE, "java-class");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.COMPONENT_RESTART, INSTANCE, "java-class"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("org.opends.server.extensions.SimilarityBasedPasswordValidator");
      builder.setDefaultBehaviorProvider(provider);
      builder.addInstanceOf("org.opends.server.api.PasswordValidator");
      PD_JAVA_CLASS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_JAVA_CLASS);
  }



  // Build the "min-password-difference" property definition.
  static {
      IntegerPropertyDefinition.Builder builder = IntegerPropertyDefinition.createBuilder(INSTANCE, "min-password-difference");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "min-password-difference"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<Integer>());
      builder.setUpperLimit(2147483647);
      builder.setLowerLimit(0);
      PD_MIN_PASSWORD_DIFFERENCE = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_MIN_PASSWORD_DIFFERENCE);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("user-management"));
  }



  /**
   * Get the Similarity Based Password Validator configuration
   * definition singleton.
   *
   * @return Returns the Similarity Based Password Validator
   *         configuration definition singleton.
   */
  public static SimilarityBasedPasswordValidatorCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private SimilarityBasedPasswordValidatorCfgDefn() {
    super("similarity-based-password-validator", PasswordValidatorCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public SimilarityBasedPasswordValidatorCfgClient createClientConfiguration(
      ManagedObject<? extends SimilarityBasedPasswordValidatorCfgClient> impl) {
    return new SimilarityBasedPasswordValidatorCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public SimilarityBasedPasswordValidatorCfg createServerConfiguration(
      ServerManagedObject<? extends SimilarityBasedPasswordValidatorCfg> impl) {
    return new SimilarityBasedPasswordValidatorCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<SimilarityBasedPasswordValidatorCfg> getServerConfigurationClass() {
    return SimilarityBasedPasswordValidatorCfg.class;
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
   * Get the "min-password-difference" property definition.
   * <p>
   * Specifies the minimum difference of new and old password.
   * <p>
   * A value of zero indicates that no difference between passwords is
   * acceptable.
   *
   * @return Returns the "min-password-difference" property definition.
   */
  public IntegerPropertyDefinition getMinPasswordDifferencePropertyDefinition() {
    return PD_MIN_PASSWORD_DIFFERENCE;
  }



  /**
   * Managed object client implementation.
   */
  private static class SimilarityBasedPasswordValidatorCfgClientImpl implements
    SimilarityBasedPasswordValidatorCfgClient {

    // Private implementation.
    private ManagedObject<? extends SimilarityBasedPasswordValidatorCfgClient> impl;



    // Private constructor.
    private SimilarityBasedPasswordValidatorCfgClientImpl(
        ManagedObject<? extends SimilarityBasedPasswordValidatorCfgClient> impl) {
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
    public Integer getMinPasswordDifference() {
      return impl.getPropertyValue(INSTANCE.getMinPasswordDifferencePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setMinPasswordDifference(int value) {
      impl.setPropertyValue(INSTANCE.getMinPasswordDifferencePropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public ManagedObjectDefinition<? extends SimilarityBasedPasswordValidatorCfgClient, ? extends SimilarityBasedPasswordValidatorCfg> definition() {
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
  private static class SimilarityBasedPasswordValidatorCfgServerImpl implements
    SimilarityBasedPasswordValidatorCfg {

    // Private implementation.
    private ServerManagedObject<? extends SimilarityBasedPasswordValidatorCfg> impl;

    // The value of the "enabled" property.
    private final boolean pEnabled;

    // The value of the "java-class" property.
    private final String pJavaClass;

    // The value of the "min-password-difference" property.
    private final int pMinPasswordDifference;



    // Private constructor.
    private SimilarityBasedPasswordValidatorCfgServerImpl(ServerManagedObject<? extends SimilarityBasedPasswordValidatorCfg> impl) {
      this.impl = impl;
      this.pEnabled = impl.getPropertyValue(INSTANCE.getEnabledPropertyDefinition());
      this.pJavaClass = impl.getPropertyValue(INSTANCE.getJavaClassPropertyDefinition());
      this.pMinPasswordDifference = impl.getPropertyValue(INSTANCE.getMinPasswordDifferencePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addSimilarityBasedChangeListener(
        ConfigurationChangeListener<SimilarityBasedPasswordValidatorCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeSimilarityBasedChangeListener(
        ConfigurationChangeListener<SimilarityBasedPasswordValidatorCfg> listener) {
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
    public int getMinPasswordDifference() {
      return pMinPasswordDifference;
    }



    /**
     * {@inheritDoc}
     */
    public Class<? extends SimilarityBasedPasswordValidatorCfg> configurationClass() {
      return SimilarityBasedPasswordValidatorCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
