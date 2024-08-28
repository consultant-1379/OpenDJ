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
import org.opends.server.admin.BooleanPropertyDefinition;
import org.opends.server.admin.ClassPropertyDefinition;
import org.opends.server.admin.client.AuthorizationException;
import org.opends.server.admin.client.CommunicationException;
import org.opends.server.admin.client.ConcurrentModificationException;
import org.opends.server.admin.client.ManagedObject;
import org.opends.server.admin.client.MissingMandatoryPropertiesException;
import org.opends.server.admin.client.OperationRejectedException;
import org.opends.server.admin.ManagedObjectAlreadyExistsException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.PropertyOption;
import org.opends.server.admin.PropertyProvider;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.server.ServerManagedObject;
import org.opends.server.admin.std.client.AlertHandlerCfgClient;
import org.opends.server.admin.std.server.AlertHandlerCfg;
import org.opends.server.admin.StringPropertyDefinition;
import org.opends.server.admin.Tag;
import org.opends.server.admin.TopCfgDefn;
import org.opends.server.admin.UndefinedDefaultBehaviorProvider;
import org.opends.server.types.DN;



/**
 * An interface for querying the Alert Handler managed object
 * definition meta information.
 * <p>
 * Alert Handlers are used to notify administrators of significant
 * problems or notable events that occur in the Directory Server.
 */
public final class AlertHandlerCfgDefn extends ManagedObjectDefinition<AlertHandlerCfgClient, AlertHandlerCfg> {

  // The singleton configuration definition instance.
  private static final AlertHandlerCfgDefn INSTANCE = new AlertHandlerCfgDefn();



  // The "disabled-alert-type" property definition.
  private static final StringPropertyDefinition PD_DISABLED_ALERT_TYPE;



  // The "enabled" property definition.
  private static final BooleanPropertyDefinition PD_ENABLED;



  // The "enabled-alert-type" property definition.
  private static final StringPropertyDefinition PD_ENABLED_ALERT_TYPE;



  // The "java-class" property definition.
  private static final ClassPropertyDefinition PD_JAVA_CLASS;



  // Build the "disabled-alert-type" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "disabled-alert-type");
      builder.setOption(PropertyOption.MULTI_VALUED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "disabled-alert-type"));
      builder.setDefaultBehaviorProvider(new AliasDefaultBehaviorProvider<String>(INSTANCE, "disabled-alert-type"));
      PD_DISABLED_ALERT_TYPE = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_DISABLED_ALERT_TYPE);
  }



  // Build the "enabled" property definition.
  static {
      BooleanPropertyDefinition.Builder builder = BooleanPropertyDefinition.createBuilder(INSTANCE, "enabled");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "enabled"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<Boolean>());
      PD_ENABLED = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_ENABLED);
  }



  // Build the "enabled-alert-type" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "enabled-alert-type");
      builder.setOption(PropertyOption.MULTI_VALUED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "enabled-alert-type"));
      builder.setDefaultBehaviorProvider(new AliasDefaultBehaviorProvider<String>(INSTANCE, "enabled-alert-type"));
      PD_ENABLED_ALERT_TYPE = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_ENABLED_ALERT_TYPE);
  }



  // Build the "java-class" property definition.
  static {
      ClassPropertyDefinition.Builder builder = ClassPropertyDefinition.createBuilder(INSTANCE, "java-class");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.COMPONENT_RESTART, INSTANCE, "java-class"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<String>());
      builder.addInstanceOf("org.opends.server.api.AlertHandler");
      PD_JAVA_CLASS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_JAVA_CLASS);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("core-server"));
  }



  /**
   * Get the Alert Handler configuration definition singleton.
   *
   * @return Returns the Alert Handler configuration definition
   *         singleton.
   */
  public static AlertHandlerCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private AlertHandlerCfgDefn() {
    super("alert-handler", TopCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public AlertHandlerCfgClient createClientConfiguration(
      ManagedObject<? extends AlertHandlerCfgClient> impl) {
    return new AlertHandlerCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public AlertHandlerCfg createServerConfiguration(
      ServerManagedObject<? extends AlertHandlerCfg> impl) {
    return new AlertHandlerCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<AlertHandlerCfg> getServerConfigurationClass() {
    return AlertHandlerCfg.class;
  }



  /**
   * Get the "disabled-alert-type" property definition.
   * <p>
   * Specifies the names of the alert types that are disabled for this
   * alert handler.
   * <p>
   * If there are any values for this attribute, then no alerts with
   * any of the specified types are allowed. If there are no values for
   * this attribute, then only alerts with a type included in the set
   * of enabled alert types are allowed, or if there are no values for
   * the enabled alert types option, then all alert types are allowed.
   *
   * @return Returns the "disabled-alert-type" property definition.
   */
  public StringPropertyDefinition getDisabledAlertTypePropertyDefinition() {
    return PD_DISABLED_ALERT_TYPE;
  }



  /**
   * Get the "enabled" property definition.
   * <p>
   * Indicates whether the Alert Handler is enabled.
   *
   * @return Returns the "enabled" property definition.
   */
  public BooleanPropertyDefinition getEnabledPropertyDefinition() {
    return PD_ENABLED;
  }



  /**
   * Get the "enabled-alert-type" property definition.
   * <p>
   * Specifies the names of the alert types that are enabled for this
   * alert handler.
   * <p>
   * If there are any values for this attribute, then only alerts with
   * one of the specified types are allowed (unless they are also
   * included in the disabled alert types). If there are no values for
   * this attribute, then any alert with a type not included in the
   * list of disabled alert types is allowed.
   *
   * @return Returns the "enabled-alert-type" property definition.
   */
  public StringPropertyDefinition getEnabledAlertTypePropertyDefinition() {
    return PD_ENABLED_ALERT_TYPE;
  }



  /**
   * Get the "java-class" property definition.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Alert Handler implementation.
   *
   * @return Returns the "java-class" property definition.
   */
  public ClassPropertyDefinition getJavaClassPropertyDefinition() {
    return PD_JAVA_CLASS;
  }



  /**
   * Managed object client implementation.
   */
  private static class AlertHandlerCfgClientImpl implements
    AlertHandlerCfgClient {

    // Private implementation.
    private ManagedObject<? extends AlertHandlerCfgClient> impl;



    // Private constructor.
    private AlertHandlerCfgClientImpl(
        ManagedObject<? extends AlertHandlerCfgClient> impl) {
      this.impl = impl;
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<String> getDisabledAlertType() {
      return impl.getPropertyValues(INSTANCE.getDisabledAlertTypePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setDisabledAlertType(Collection<String> values) {
      impl.setPropertyValues(INSTANCE.getDisabledAlertTypePropertyDefinition(), values);
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
    public SortedSet<String> getEnabledAlertType() {
      return impl.getPropertyValues(INSTANCE.getEnabledAlertTypePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setEnabledAlertType(Collection<String> values) {
      impl.setPropertyValues(INSTANCE.getEnabledAlertTypePropertyDefinition(), values);
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
    public ManagedObjectDefinition<? extends AlertHandlerCfgClient, ? extends AlertHandlerCfg> definition() {
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
  private static class AlertHandlerCfgServerImpl implements
    AlertHandlerCfg {

    // Private implementation.
    private ServerManagedObject<? extends AlertHandlerCfg> impl;

    // The value of the "disabled-alert-type" property.
    private final SortedSet<String> pDisabledAlertType;

    // The value of the "enabled" property.
    private final boolean pEnabled;

    // The value of the "enabled-alert-type" property.
    private final SortedSet<String> pEnabledAlertType;

    // The value of the "java-class" property.
    private final String pJavaClass;



    // Private constructor.
    private AlertHandlerCfgServerImpl(ServerManagedObject<? extends AlertHandlerCfg> impl) {
      this.impl = impl;
      this.pDisabledAlertType = impl.getPropertyValues(INSTANCE.getDisabledAlertTypePropertyDefinition());
      this.pEnabled = impl.getPropertyValue(INSTANCE.getEnabledPropertyDefinition());
      this.pEnabledAlertType = impl.getPropertyValues(INSTANCE.getEnabledAlertTypePropertyDefinition());
      this.pJavaClass = impl.getPropertyValue(INSTANCE.getJavaClassPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addChangeListener(
        ConfigurationChangeListener<AlertHandlerCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeChangeListener(
        ConfigurationChangeListener<AlertHandlerCfg> listener) {
      impl.deregisterChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<String> getDisabledAlertType() {
      return pDisabledAlertType;
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
    public SortedSet<String> getEnabledAlertType() {
      return pEnabledAlertType;
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
    public Class<? extends AlertHandlerCfg> configurationClass() {
      return AlertHandlerCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
