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
import org.opends.server.admin.std.client.BlindTrustManagerProviderCfgClient;
import org.opends.server.admin.std.server.BlindTrustManagerProviderCfg;
import org.opends.server.admin.std.server.TrustManagerProviderCfg;
import org.opends.server.admin.Tag;
import org.opends.server.types.DN;



/**
 * An interface for querying the Blind Trust Manager Provider managed
 * object definition meta information.
 * <p>
 * The blind trust manager provider always trusts any certificate that
 * is presented to it, regardless of its issuer, subject, and validity
 * dates.
 */
public final class BlindTrustManagerProviderCfgDefn extends ManagedObjectDefinition<BlindTrustManagerProviderCfgClient, BlindTrustManagerProviderCfg> {

  // The singleton configuration definition instance.
  private static final BlindTrustManagerProviderCfgDefn INSTANCE = new BlindTrustManagerProviderCfgDefn();



  // The "java-class" property definition.
  private static final ClassPropertyDefinition PD_JAVA_CLASS;



  // Build the "java-class" property definition.
  static {
      ClassPropertyDefinition.Builder builder = ClassPropertyDefinition.createBuilder(INSTANCE, "java-class");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "java-class"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("org.opends.server.extensions.BlindTrustManagerProvider");
      builder.setDefaultBehaviorProvider(provider);
      builder.addInstanceOf("org.opends.server.api.TrustManagerProvider");
      PD_JAVA_CLASS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_JAVA_CLASS);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("security"));
  }



  /**
   * Get the Blind Trust Manager Provider configuration definition
   * singleton.
   *
   * @return Returns the Blind Trust Manager Provider configuration
   *         definition singleton.
   */
  public static BlindTrustManagerProviderCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private BlindTrustManagerProviderCfgDefn() {
    super("blind-trust-manager-provider", TrustManagerProviderCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public BlindTrustManagerProviderCfgClient createClientConfiguration(
      ManagedObject<? extends BlindTrustManagerProviderCfgClient> impl) {
    return new BlindTrustManagerProviderCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public BlindTrustManagerProviderCfg createServerConfiguration(
      ServerManagedObject<? extends BlindTrustManagerProviderCfg> impl) {
    return new BlindTrustManagerProviderCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<BlindTrustManagerProviderCfg> getServerConfigurationClass() {
    return BlindTrustManagerProviderCfg.class;
  }



  /**
   * Get the "enabled" property definition.
   * <p>
   * Indicate whether the Blind Trust Manager Provider is enabled for
   * use.
   *
   * @return Returns the "enabled" property definition.
   */
  public BooleanPropertyDefinition getEnabledPropertyDefinition() {
    return TrustManagerProviderCfgDefn.getInstance().getEnabledPropertyDefinition();
  }



  /**
   * Get the "java-class" property definition.
   * <p>
   * The fully-qualified name of the Java class that provides the
   * Blind Trust Manager Provider implementation.
   *
   * @return Returns the "java-class" property definition.
   */
  public ClassPropertyDefinition getJavaClassPropertyDefinition() {
    return PD_JAVA_CLASS;
  }



  /**
   * Managed object client implementation.
   */
  private static class BlindTrustManagerProviderCfgClientImpl implements
    BlindTrustManagerProviderCfgClient {

    // Private implementation.
    private ManagedObject<? extends BlindTrustManagerProviderCfgClient> impl;



    // Private constructor.
    private BlindTrustManagerProviderCfgClientImpl(
        ManagedObject<? extends BlindTrustManagerProviderCfgClient> impl) {
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
    public ManagedObjectDefinition<? extends BlindTrustManagerProviderCfgClient, ? extends BlindTrustManagerProviderCfg> definition() {
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
  private static class BlindTrustManagerProviderCfgServerImpl implements
    BlindTrustManagerProviderCfg {

    // Private implementation.
    private ServerManagedObject<? extends BlindTrustManagerProviderCfg> impl;

    // The value of the "enabled" property.
    private final boolean pEnabled;

    // The value of the "java-class" property.
    private final String pJavaClass;



    // Private constructor.
    private BlindTrustManagerProviderCfgServerImpl(ServerManagedObject<? extends BlindTrustManagerProviderCfg> impl) {
      this.impl = impl;
      this.pEnabled = impl.getPropertyValue(INSTANCE.getEnabledPropertyDefinition());
      this.pJavaClass = impl.getPropertyValue(INSTANCE.getJavaClassPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addBlindChangeListener(
        ConfigurationChangeListener<BlindTrustManagerProviderCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeBlindChangeListener(
        ConfigurationChangeListener<BlindTrustManagerProviderCfg> listener) {
      impl.deregisterChangeListener(listener);
    }
    /**
     * {@inheritDoc}
     */
    public void addChangeListener(
        ConfigurationChangeListener<TrustManagerProviderCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeChangeListener(
        ConfigurationChangeListener<TrustManagerProviderCfg> listener) {
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
    public Class<? extends BlindTrustManagerProviderCfg> configurationClass() {
      return BlindTrustManagerProviderCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
