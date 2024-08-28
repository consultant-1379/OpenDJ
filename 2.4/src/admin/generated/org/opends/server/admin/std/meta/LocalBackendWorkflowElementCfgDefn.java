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
import org.opends.server.admin.AggregationPropertyDefinition;
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
import org.opends.server.admin.PropertyIsReadOnlyException;
import org.opends.server.admin.PropertyOption;
import org.opends.server.admin.PropertyProvider;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.server.ServerManagedObject;
import org.opends.server.admin.std.client.BackendCfgClient;
import org.opends.server.admin.std.client.LocalBackendWorkflowElementCfgClient;
import org.opends.server.admin.std.server.BackendCfg;
import org.opends.server.admin.std.server.LocalBackendWorkflowElementCfg;
import org.opends.server.admin.std.server.WorkflowElementCfg;
import org.opends.server.admin.Tag;
import org.opends.server.admin.UndefinedDefaultBehaviorProvider;
import org.opends.server.types.DN;



/**
 * An interface for querying the Local Backend Workflow Element
 * managed object definition meta information.
 * <p>
 * The Local Backend Workflow Element provides access to a backend.
 */
public final class LocalBackendWorkflowElementCfgDefn extends ManagedObjectDefinition<LocalBackendWorkflowElementCfgClient, LocalBackendWorkflowElementCfg> {

  // The singleton configuration definition instance.
  private static final LocalBackendWorkflowElementCfgDefn INSTANCE = new LocalBackendWorkflowElementCfgDefn();



  // The "backend" property definition.
  private static final AggregationPropertyDefinition<BackendCfgClient, BackendCfg> PD_BACKEND;



  // The "java-class" property definition.
  private static final ClassPropertyDefinition PD_JAVA_CLASS;



  // Build the "backend" property definition.
  static {
      AggregationPropertyDefinition.Builder<BackendCfgClient, BackendCfg> builder = AggregationPropertyDefinition.createBuilder(INSTANCE, "backend");
      builder.setOption(PropertyOption.READ_ONLY);
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "backend"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<String>());
      builder.setParentPath("/");
      builder.setRelationDefinition("backend");
      PD_BACKEND = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_BACKEND);
      INSTANCE.registerConstraint(PD_BACKEND.getSourceConstraint());
  }



  // Build the "java-class" property definition.
  static {
      ClassPropertyDefinition.Builder builder = ClassPropertyDefinition.createBuilder(INSTANCE, "java-class");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "java-class"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("org.opends.server.workflowelement.localbackend.LocalBackendWorkflowElement");
      builder.setDefaultBehaviorProvider(provider);
      builder.addInstanceOf("org.opends.server.workflowelement.WorkflowElement");
      PD_JAVA_CLASS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_JAVA_CLASS);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("core-server"));
    INSTANCE.registerTag(Tag.valueOf("user-management"));
  }



  /**
   * Get the Local Backend Workflow Element configuration definition
   * singleton.
   *
   * @return Returns the Local Backend Workflow Element configuration
   *         definition singleton.
   */
  public static LocalBackendWorkflowElementCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private LocalBackendWorkflowElementCfgDefn() {
    super("local-backend-workflow-element", WorkflowElementCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public LocalBackendWorkflowElementCfgClient createClientConfiguration(
      ManagedObject<? extends LocalBackendWorkflowElementCfgClient> impl) {
    return new LocalBackendWorkflowElementCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public LocalBackendWorkflowElementCfg createServerConfiguration(
      ServerManagedObject<? extends LocalBackendWorkflowElementCfg> impl) {
    return new LocalBackendWorkflowElementCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<LocalBackendWorkflowElementCfg> getServerConfigurationClass() {
    return LocalBackendWorkflowElementCfg.class;
  }



  /**
   * Get the "backend" property definition.
   * <p>
   * Identifies the backend accessed by the workflow element.
   *
   * @return Returns the "backend" property definition.
   */
  public AggregationPropertyDefinition<BackendCfgClient, BackendCfg> getBackendPropertyDefinition() {
    return PD_BACKEND;
  }



  /**
   * Get the "enabled" property definition.
   * <p>
   * Indicates whether the Local Backend Workflow Element is enabled
   * for use in the server.
   * <p>
   * If a Local Backend Workflow Element is not enabled, then its
   * contents are not accessible when processing operations.
   *
   * @return Returns the "enabled" property definition.
   */
  public BooleanPropertyDefinition getEnabledPropertyDefinition() {
    return WorkflowElementCfgDefn.getInstance().getEnabledPropertyDefinition();
  }



  /**
   * Get the "java-class" property definition.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Local Backend Workflow Element implementation.
   *
   * @return Returns the "java-class" property definition.
   */
  public ClassPropertyDefinition getJavaClassPropertyDefinition() {
    return PD_JAVA_CLASS;
  }



  /**
   * Managed object client implementation.
   */
  private static class LocalBackendWorkflowElementCfgClientImpl implements
    LocalBackendWorkflowElementCfgClient {

    // Private implementation.
    private ManagedObject<? extends LocalBackendWorkflowElementCfgClient> impl;



    // Private constructor.
    private LocalBackendWorkflowElementCfgClientImpl(
        ManagedObject<? extends LocalBackendWorkflowElementCfgClient> impl) {
      this.impl = impl;
    }



    /**
     * {@inheritDoc}
     */
    public String getBackend() {
      return impl.getPropertyValue(INSTANCE.getBackendPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setBackend(String value) throws PropertyIsReadOnlyException {
      impl.setPropertyValue(INSTANCE.getBackendPropertyDefinition(), value);
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
    public ManagedObjectDefinition<? extends LocalBackendWorkflowElementCfgClient, ? extends LocalBackendWorkflowElementCfg> definition() {
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
  private static class LocalBackendWorkflowElementCfgServerImpl implements
    LocalBackendWorkflowElementCfg {

    // Private implementation.
    private ServerManagedObject<? extends LocalBackendWorkflowElementCfg> impl;

    // The value of the "backend" property.
    private final String pBackend;

    // The value of the "enabled" property.
    private final boolean pEnabled;

    // The value of the "java-class" property.
    private final String pJavaClass;



    // Private constructor.
    private LocalBackendWorkflowElementCfgServerImpl(ServerManagedObject<? extends LocalBackendWorkflowElementCfg> impl) {
      this.impl = impl;
      this.pBackend = impl.getPropertyValue(INSTANCE.getBackendPropertyDefinition());
      this.pEnabled = impl.getPropertyValue(INSTANCE.getEnabledPropertyDefinition());
      this.pJavaClass = impl.getPropertyValue(INSTANCE.getJavaClassPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addLocalBackendChangeListener(
        ConfigurationChangeListener<LocalBackendWorkflowElementCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeLocalBackendChangeListener(
        ConfigurationChangeListener<LocalBackendWorkflowElementCfg> listener) {
      impl.deregisterChangeListener(listener);
    }
    /**
     * {@inheritDoc}
     */
    public void addChangeListener(
        ConfigurationChangeListener<WorkflowElementCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeChangeListener(
        ConfigurationChangeListener<WorkflowElementCfg> listener) {
      impl.deregisterChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public String getBackend() {
      return pBackend;
    }



    /**
     * {@inheritDoc}
     */
    public DN getBackendDN() {
      String value = getBackend();
      if (value == null) return null;
      return INSTANCE.getBackendPropertyDefinition().getChildDN(value);
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
    public Class<? extends LocalBackendWorkflowElementCfg> configurationClass() {
      return LocalBackendWorkflowElementCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
