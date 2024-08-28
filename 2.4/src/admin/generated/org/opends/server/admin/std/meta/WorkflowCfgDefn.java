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
import org.opends.server.admin.client.AuthorizationException;
import org.opends.server.admin.client.CommunicationException;
import org.opends.server.admin.client.ConcurrentModificationException;
import org.opends.server.admin.client.ManagedObject;
import org.opends.server.admin.client.MissingMandatoryPropertiesException;
import org.opends.server.admin.client.OperationRejectedException;
import org.opends.server.admin.condition.Conditions;
import org.opends.server.admin.DNPropertyDefinition;
import org.opends.server.admin.ManagedObjectAlreadyExistsException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.PropertyIsReadOnlyException;
import org.opends.server.admin.PropertyOption;
import org.opends.server.admin.PropertyProvider;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.server.ServerManagedObject;
import org.opends.server.admin.std.client.WorkflowCfgClient;
import org.opends.server.admin.std.client.WorkflowElementCfgClient;
import org.opends.server.admin.std.server.WorkflowCfg;
import org.opends.server.admin.std.server.WorkflowElementCfg;
import org.opends.server.admin.Tag;
import org.opends.server.admin.TopCfgDefn;
import org.opends.server.admin.UndefinedDefaultBehaviorProvider;
import org.opends.server.types.DN;



/**
 * An interface for querying the Workflow managed object definition
 * meta information.
 * <p>
 * The Workflow is a list of processing steps (Work Flow Elements)
 * that are applied to data as it is retrieved from the Directory
 * Server.
 */
public final class WorkflowCfgDefn extends ManagedObjectDefinition<WorkflowCfgClient, WorkflowCfg> {

  // The singleton configuration definition instance.
  private static final WorkflowCfgDefn INSTANCE = new WorkflowCfgDefn();



  // The "base-dn" property definition.
  private static final DNPropertyDefinition PD_BASE_DN;



  // The "enabled" property definition.
  private static final BooleanPropertyDefinition PD_ENABLED;



  // The "workflow-element" property definition.
  private static final AggregationPropertyDefinition<WorkflowElementCfgClient, WorkflowElementCfg> PD_WORKFLOW_ELEMENT;



  // Build the "base-dn" property definition.
  static {
      DNPropertyDefinition.Builder builder = DNPropertyDefinition.createBuilder(INSTANCE, "base-dn");
      builder.setOption(PropertyOption.READ_ONLY);
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "base-dn"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<DN>());
      PD_BASE_DN = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_BASE_DN);
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



  // Build the "workflow-element" property definition.
  static {
      AggregationPropertyDefinition.Builder<WorkflowElementCfgClient, WorkflowElementCfg> builder = AggregationPropertyDefinition.createBuilder(INSTANCE, "workflow-element");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "workflow-element"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<String>());
      builder.setParentPath("/");
      builder.setRelationDefinition("workflow-element");
      builder.setTargetIsEnabledCondition(Conditions.contains("enabled", "true"));
      PD_WORKFLOW_ELEMENT = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_WORKFLOW_ELEMENT);
      INSTANCE.registerConstraint(PD_WORKFLOW_ELEMENT.getSourceConstraint());
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("core-server"));
  }



  /**
   * Get the Workflow configuration definition singleton.
   *
   * @return Returns the Workflow configuration definition singleton.
   */
  public static WorkflowCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private WorkflowCfgDefn() {
    super("workflow", TopCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public WorkflowCfgClient createClientConfiguration(
      ManagedObject<? extends WorkflowCfgClient> impl) {
    return new WorkflowCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public WorkflowCfg createServerConfiguration(
      ServerManagedObject<? extends WorkflowCfg> impl) {
    return new WorkflowCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<WorkflowCfg> getServerConfigurationClass() {
    return WorkflowCfg.class;
  }



  /**
   * Get the "base-dn" property definition.
   * <p>
   * Specifies the base DN of the data targeted by the Workflow .
   *
   * @return Returns the "base-dn" property definition.
   */
  public DNPropertyDefinition getBaseDNPropertyDefinition() {
    return PD_BASE_DN;
  }



  /**
   * Get the "enabled" property definition.
   * <p>
   * Indicates whether the Workflow is enabled for use in the server.
   * <p>
   * If a Workflow is not enabled, then its contents are not
   * accessible when processing operations.
   *
   * @return Returns the "enabled" property definition.
   */
  public BooleanPropertyDefinition getEnabledPropertyDefinition() {
    return PD_ENABLED;
  }



  /**
   * Get the "workflow-element" property definition.
   * <p>
   * Specifies the root Workflow Element in the Workflow .
   *
   * @return Returns the "workflow-element" property definition.
   */
  public AggregationPropertyDefinition<WorkflowElementCfgClient, WorkflowElementCfg> getWorkflowElementPropertyDefinition() {
    return PD_WORKFLOW_ELEMENT;
  }



  /**
   * Managed object client implementation.
   */
  private static class WorkflowCfgClientImpl implements
    WorkflowCfgClient {

    // Private implementation.
    private ManagedObject<? extends WorkflowCfgClient> impl;



    // Private constructor.
    private WorkflowCfgClientImpl(
        ManagedObject<? extends WorkflowCfgClient> impl) {
      this.impl = impl;
    }



    /**
     * {@inheritDoc}
     */
    public DN getBaseDN() {
      return impl.getPropertyValue(INSTANCE.getBaseDNPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setBaseDN(DN value) throws PropertyIsReadOnlyException {
      impl.setPropertyValue(INSTANCE.getBaseDNPropertyDefinition(), value);
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
    public String getWorkflowElement() {
      return impl.getPropertyValue(INSTANCE.getWorkflowElementPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setWorkflowElement(String value) {
      impl.setPropertyValue(INSTANCE.getWorkflowElementPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public ManagedObjectDefinition<? extends WorkflowCfgClient, ? extends WorkflowCfg> definition() {
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
  private static class WorkflowCfgServerImpl implements
    WorkflowCfg {

    // Private implementation.
    private ServerManagedObject<? extends WorkflowCfg> impl;

    // The value of the "base-dn" property.
    private final DN pBaseDN;

    // The value of the "enabled" property.
    private final boolean pEnabled;

    // The value of the "workflow-element" property.
    private final String pWorkflowElement;



    // Private constructor.
    private WorkflowCfgServerImpl(ServerManagedObject<? extends WorkflowCfg> impl) {
      this.impl = impl;
      this.pBaseDN = impl.getPropertyValue(INSTANCE.getBaseDNPropertyDefinition());
      this.pEnabled = impl.getPropertyValue(INSTANCE.getEnabledPropertyDefinition());
      this.pWorkflowElement = impl.getPropertyValue(INSTANCE.getWorkflowElementPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addChangeListener(
        ConfigurationChangeListener<WorkflowCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeChangeListener(
        ConfigurationChangeListener<WorkflowCfg> listener) {
      impl.deregisterChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public DN getBaseDN() {
      return pBaseDN;
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
    public String getWorkflowElement() {
      return pWorkflowElement;
    }



    /**
     * {@inheritDoc}
     */
    public DN getWorkflowElementDN() {
      String value = getWorkflowElement();
      if (value == null) return null;
      return INSTANCE.getWorkflowElementPropertyDefinition().getChildDN(value);
    }



    /**
     * {@inheritDoc}
     */
    public Class<? extends WorkflowCfg> configurationClass() {
      return WorkflowCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
