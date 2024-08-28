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
import org.opends.server.admin.std.client.WhoAmIExtendedOperationHandlerCfgClient;
import org.opends.server.admin.std.server.ExtendedOperationHandlerCfg;
import org.opends.server.admin.std.server.WhoAmIExtendedOperationHandlerCfg;
import org.opends.server.admin.Tag;
import org.opends.server.types.DN;



/**
 * An interface for querying the Who Am I Extended Operation Handler
 * managed object definition meta information.
 * <p>
 * The Who Am I Extended Operation Handler provides the ability for
 * clients to request their authorization identity using the "Who Am
 * I?" extended operation as defined in RFC 4532.
 */
public final class WhoAmIExtendedOperationHandlerCfgDefn extends ManagedObjectDefinition<WhoAmIExtendedOperationHandlerCfgClient, WhoAmIExtendedOperationHandlerCfg> {

  // The singleton configuration definition instance.
  private static final WhoAmIExtendedOperationHandlerCfgDefn INSTANCE = new WhoAmIExtendedOperationHandlerCfgDefn();



  // The "java-class" property definition.
  private static final ClassPropertyDefinition PD_JAVA_CLASS;



  // Build the "java-class" property definition.
  static {
      ClassPropertyDefinition.Builder builder = ClassPropertyDefinition.createBuilder(INSTANCE, "java-class");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.COMPONENT_RESTART, INSTANCE, "java-class"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("org.opends.server.extensions.WhoAmIExtendedOperation");
      builder.setDefaultBehaviorProvider(provider);
      builder.addInstanceOf("org.opends.server.api.ExtendedOperationHandler");
      PD_JAVA_CLASS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_JAVA_CLASS);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("core-server"));
  }



  /**
   * Get the Who Am I Extended Operation Handler configuration
   * definition singleton.
   *
   * @return Returns the Who Am I Extended Operation Handler
   *         configuration definition singleton.
   */
  public static WhoAmIExtendedOperationHandlerCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private WhoAmIExtendedOperationHandlerCfgDefn() {
    super("who-am-i-extended-operation-handler", ExtendedOperationHandlerCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public WhoAmIExtendedOperationHandlerCfgClient createClientConfiguration(
      ManagedObject<? extends WhoAmIExtendedOperationHandlerCfgClient> impl) {
    return new WhoAmIExtendedOperationHandlerCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public WhoAmIExtendedOperationHandlerCfg createServerConfiguration(
      ServerManagedObject<? extends WhoAmIExtendedOperationHandlerCfg> impl) {
    return new WhoAmIExtendedOperationHandlerCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<WhoAmIExtendedOperationHandlerCfg> getServerConfigurationClass() {
    return WhoAmIExtendedOperationHandlerCfg.class;
  }



  /**
   * Get the "enabled" property definition.
   * <p>
   * Indicates whether the Who Am I Extended Operation Handler is
   * enabled (that is, whether the types of extended operations are
   * allowed in the server).
   *
   * @return Returns the "enabled" property definition.
   */
  public BooleanPropertyDefinition getEnabledPropertyDefinition() {
    return ExtendedOperationHandlerCfgDefn.getInstance().getEnabledPropertyDefinition();
  }



  /**
   * Get the "java-class" property definition.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Who Am I Extended Operation Handler implementation.
   *
   * @return Returns the "java-class" property definition.
   */
  public ClassPropertyDefinition getJavaClassPropertyDefinition() {
    return PD_JAVA_CLASS;
  }



  /**
   * Managed object client implementation.
   */
  private static class WhoAmIExtendedOperationHandlerCfgClientImpl implements
    WhoAmIExtendedOperationHandlerCfgClient {

    // Private implementation.
    private ManagedObject<? extends WhoAmIExtendedOperationHandlerCfgClient> impl;



    // Private constructor.
    private WhoAmIExtendedOperationHandlerCfgClientImpl(
        ManagedObject<? extends WhoAmIExtendedOperationHandlerCfgClient> impl) {
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
    public ManagedObjectDefinition<? extends WhoAmIExtendedOperationHandlerCfgClient, ? extends WhoAmIExtendedOperationHandlerCfg> definition() {
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
  private static class WhoAmIExtendedOperationHandlerCfgServerImpl implements
    WhoAmIExtendedOperationHandlerCfg {

    // Private implementation.
    private ServerManagedObject<? extends WhoAmIExtendedOperationHandlerCfg> impl;

    // The value of the "enabled" property.
    private final boolean pEnabled;

    // The value of the "java-class" property.
    private final String pJavaClass;



    // Private constructor.
    private WhoAmIExtendedOperationHandlerCfgServerImpl(ServerManagedObject<? extends WhoAmIExtendedOperationHandlerCfg> impl) {
      this.impl = impl;
      this.pEnabled = impl.getPropertyValue(INSTANCE.getEnabledPropertyDefinition());
      this.pJavaClass = impl.getPropertyValue(INSTANCE.getJavaClassPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addWhoAmIChangeListener(
        ConfigurationChangeListener<WhoAmIExtendedOperationHandlerCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeWhoAmIChangeListener(
        ConfigurationChangeListener<WhoAmIExtendedOperationHandlerCfg> listener) {
      impl.deregisterChangeListener(listener);
    }
    /**
     * {@inheritDoc}
     */
    public void addChangeListener(
        ConfigurationChangeListener<ExtendedOperationHandlerCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeChangeListener(
        ConfigurationChangeListener<ExtendedOperationHandlerCfg> listener) {
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
    public Class<? extends WhoAmIExtendedOperationHandlerCfg> configurationClass() {
      return WhoAmIExtendedOperationHandlerCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
