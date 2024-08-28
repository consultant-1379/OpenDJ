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
import org.opends.server.admin.DefaultBehaviorProvider;
import org.opends.server.admin.DefinedDefaultBehaviorProvider;
import org.opends.server.admin.DNPropertyDefinition;
import org.opends.server.admin.DurationPropertyDefinition;
import org.opends.server.admin.EnumPropertyDefinition;
import org.opends.server.admin.ManagedObjectAlreadyExistsException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.ManagedObjectOption;
import org.opends.server.admin.PropertyIsReadOnlyException;
import org.opends.server.admin.PropertyOption;
import org.opends.server.admin.PropertyProvider;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.server.ServerManagedObject;
import org.opends.server.admin.std.client.TaskBackendCfgClient;
import org.opends.server.admin.std.meta.BackendCfgDefn.WritabilityMode;
import org.opends.server.admin.std.server.BackendCfg;
import org.opends.server.admin.std.server.TaskBackendCfg;
import org.opends.server.admin.StringPropertyDefinition;
import org.opends.server.admin.Tag;
import org.opends.server.admin.UndefinedDefaultBehaviorProvider;
import org.opends.server.types.DN;



/**
 * An interface for querying the Task Backend managed object
 * definition meta information.
 * <p>
 * The Task Backend provides a mechanism for scheduling tasks in the
 * OpenDS Directory Server. Tasks are intended to provide access to
 * certain types of administrative functions in the server that may not
 * be convenient to perform remotely.
 */
public final class TaskBackendCfgDefn extends ManagedObjectDefinition<TaskBackendCfgClient, TaskBackendCfg> {

  // The singleton configuration definition instance.
  private static final TaskBackendCfgDefn INSTANCE = new TaskBackendCfgDefn();



  // The "java-class" property definition.
  private static final ClassPropertyDefinition PD_JAVA_CLASS;



  // The "notification-sender-address" property definition.
  private static final StringPropertyDefinition PD_NOTIFICATION_SENDER_ADDRESS;



  // The "task-backing-file" property definition.
  private static final StringPropertyDefinition PD_TASK_BACKING_FILE;



  // The "task-retention-time" property definition.
  private static final DurationPropertyDefinition PD_TASK_RETENTION_TIME;



  // The "writability-mode" property definition.
  private static final EnumPropertyDefinition<WritabilityMode> PD_WRITABILITY_MODE;



  // Build the "java-class" property definition.
  static {
      ClassPropertyDefinition.Builder builder = ClassPropertyDefinition.createBuilder(INSTANCE, "java-class");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.COMPONENT_RESTART, INSTANCE, "java-class"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("org.opends.server.backends.task.TaskBackend");
      builder.setDefaultBehaviorProvider(provider);
      builder.addInstanceOf("org.opends.server.api.Backend");
      PD_JAVA_CLASS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_JAVA_CLASS);
  }



  // Build the "notification-sender-address" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "notification-sender-address");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "notification-sender-address"));
      builder.setDefaultBehaviorProvider(new AliasDefaultBehaviorProvider<String>(INSTANCE, "notification-sender-address"));
      PD_NOTIFICATION_SENDER_ADDRESS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_NOTIFICATION_SENDER_ADDRESS);
  }



  // Build the "task-backing-file" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "task-backing-file");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "task-backing-file"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<String>());
      PD_TASK_BACKING_FILE = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_TASK_BACKING_FILE);
  }



  // Build the "task-retention-time" property definition.
  static {
      DurationPropertyDefinition.Builder builder = DurationPropertyDefinition.createBuilder(INSTANCE, "task-retention-time");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "task-retention-time"));
      DefaultBehaviorProvider<Long> provider = new DefinedDefaultBehaviorProvider<Long>("24 hours");
      builder.setDefaultBehaviorProvider(provider);
      PD_TASK_RETENTION_TIME = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_TASK_RETENTION_TIME);
  }



  // Build the "writability-mode" property definition.
  static {
      EnumPropertyDefinition.Builder<WritabilityMode> builder = EnumPropertyDefinition.createBuilder(INSTANCE, "writability-mode");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "writability-mode"));
      DefaultBehaviorProvider<WritabilityMode> provider = new DefinedDefaultBehaviorProvider<WritabilityMode>("enabled");
      builder.setDefaultBehaviorProvider(provider);
      builder.setEnumClass(WritabilityMode.class);
      PD_WRITABILITY_MODE = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_WRITABILITY_MODE);
  }



  // Register the options associated with this managed object definition.
  static {
    INSTANCE.registerOption(ManagedObjectOption.ADVANCED);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("database"));
  }



  /**
   * Get the Task Backend configuration definition singleton.
   *
   * @return Returns the Task Backend configuration definition
   *         singleton.
   */
  public static TaskBackendCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private TaskBackendCfgDefn() {
    super("task-backend", BackendCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public TaskBackendCfgClient createClientConfiguration(
      ManagedObject<? extends TaskBackendCfgClient> impl) {
    return new TaskBackendCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public TaskBackendCfg createServerConfiguration(
      ServerManagedObject<? extends TaskBackendCfg> impl) {
    return new TaskBackendCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<TaskBackendCfg> getServerConfigurationClass() {
    return TaskBackendCfg.class;
  }



  /**
   * Get the "backend-id" property definition.
   * <p>
   * Specifies a name to identify the associated backend.
   * <p>
   * The name must be unique among all backends in the server. The
   * backend ID may not be altered after the backend is created in the
   * server.
   *
   * @return Returns the "backend-id" property definition.
   */
  public StringPropertyDefinition getBackendIdPropertyDefinition() {
    return BackendCfgDefn.getInstance().getBackendIdPropertyDefinition();
  }



  /**
   * Get the "base-dn" property definition.
   * <p>
   * Specifies the base DN(s) for the data that the backend handles.
   * <p>
   * A single backend may be responsible for one or more base DNs.
   * Note that no two backends may have the same base DN although one
   * backend may have a base DN that is below a base DN provided by
   * another backend (similar to the use of sub-suffixes in the Sun
   * Java System Directory Server). If any of the base DNs is
   * subordinate to a base DN for another backend, then all base DNs
   * for that backend must be subordinate to that same base DN.
   *
   * @return Returns the "base-dn" property definition.
   */
  public DNPropertyDefinition getBaseDNPropertyDefinition() {
    return BackendCfgDefn.getInstance().getBaseDNPropertyDefinition();
  }



  /**
   * Get the "enabled" property definition.
   * <p>
   * Indicates whether the backend is enabled in the server.
   * <p>
   * If a backend is not enabled, then its contents are not accessible
   * when processing operations.
   *
   * @return Returns the "enabled" property definition.
   */
  public BooleanPropertyDefinition getEnabledPropertyDefinition() {
    return BackendCfgDefn.getInstance().getEnabledPropertyDefinition();
  }



  /**
   * Get the "java-class" property definition.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the backend implementation.
   *
   * @return Returns the "java-class" property definition.
   */
  public ClassPropertyDefinition getJavaClassPropertyDefinition() {
    return PD_JAVA_CLASS;
  }



  /**
   * Get the "notification-sender-address" property definition.
   * <p>
   * Specifies the email address to use as the sender (that is, the
   * "From:" address) address for notification mail messages generated
   * when a task completes execution.
   *
   * @return Returns the "notification-sender-address" property definition.
   */
  public StringPropertyDefinition getNotificationSenderAddressPropertyDefinition() {
    return PD_NOTIFICATION_SENDER_ADDRESS;
  }



  /**
   * Get the "task-backing-file" property definition.
   * <p>
   * Specifies the path to the backing file for storing information
   * about the tasks configured in the server.
   * <p>
   * It may be either an absolute path or a relative path to the base
   * of the OpenDS Directory Server instance.
   *
   * @return Returns the "task-backing-file" property definition.
   */
  public StringPropertyDefinition getTaskBackingFilePropertyDefinition() {
    return PD_TASK_BACKING_FILE;
  }



  /**
   * Get the "task-retention-time" property definition.
   * <p>
   * Specifies the length of time that task entries should be retained
   * after processing on the associated task has been completed.
   *
   * @return Returns the "task-retention-time" property definition.
   */
  public DurationPropertyDefinition getTaskRetentionTimePropertyDefinition() {
    return PD_TASK_RETENTION_TIME;
  }



  /**
   * Get the "writability-mode" property definition.
   * <p>
   * Specifies the behavior that the backend should use when
   * processing write operations.
   *
   * @return Returns the "writability-mode" property definition.
   */
  public EnumPropertyDefinition<WritabilityMode> getWritabilityModePropertyDefinition() {
    return PD_WRITABILITY_MODE;
  }



  /**
   * Managed object client implementation.
   */
  private static class TaskBackendCfgClientImpl implements
    TaskBackendCfgClient {

    // Private implementation.
    private ManagedObject<? extends TaskBackendCfgClient> impl;



    // Private constructor.
    private TaskBackendCfgClientImpl(
        ManagedObject<? extends TaskBackendCfgClient> impl) {
      this.impl = impl;
    }



    /**
     * {@inheritDoc}
     */
    public String getBackendId() {
      return impl.getPropertyValue(INSTANCE.getBackendIdPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setBackendId(String value) throws PropertyIsReadOnlyException {
      impl.setPropertyValue(INSTANCE.getBackendIdPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<DN> getBaseDN() {
      return impl.getPropertyValues(INSTANCE.getBaseDNPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setBaseDN(Collection<DN> values) {
      impl.setPropertyValues(INSTANCE.getBaseDNPropertyDefinition(), values);
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
    public String getNotificationSenderAddress() {
      return impl.getPropertyValue(INSTANCE.getNotificationSenderAddressPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setNotificationSenderAddress(String value) {
      impl.setPropertyValue(INSTANCE.getNotificationSenderAddressPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public String getTaskBackingFile() {
      return impl.getPropertyValue(INSTANCE.getTaskBackingFilePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setTaskBackingFile(String value) {
      impl.setPropertyValue(INSTANCE.getTaskBackingFilePropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public long getTaskRetentionTime() {
      return impl.getPropertyValue(INSTANCE.getTaskRetentionTimePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setTaskRetentionTime(Long value) {
      impl.setPropertyValue(INSTANCE.getTaskRetentionTimePropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public WritabilityMode getWritabilityMode() {
      return impl.getPropertyValue(INSTANCE.getWritabilityModePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setWritabilityMode(WritabilityMode value) {
      impl.setPropertyValue(INSTANCE.getWritabilityModePropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public ManagedObjectDefinition<? extends TaskBackendCfgClient, ? extends TaskBackendCfg> definition() {
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
  private static class TaskBackendCfgServerImpl implements
    TaskBackendCfg {

    // Private implementation.
    private ServerManagedObject<? extends TaskBackendCfg> impl;

    // The value of the "backend-id" property.
    private final String pBackendId;

    // The value of the "base-dn" property.
    private final SortedSet<DN> pBaseDN;

    // The value of the "enabled" property.
    private final boolean pEnabled;

    // The value of the "java-class" property.
    private final String pJavaClass;

    // The value of the "notification-sender-address" property.
    private final String pNotificationSenderAddress;

    // The value of the "task-backing-file" property.
    private final String pTaskBackingFile;

    // The value of the "task-retention-time" property.
    private final long pTaskRetentionTime;

    // The value of the "writability-mode" property.
    private final WritabilityMode pWritabilityMode;



    // Private constructor.
    private TaskBackendCfgServerImpl(ServerManagedObject<? extends TaskBackendCfg> impl) {
      this.impl = impl;
      this.pBackendId = impl.getPropertyValue(INSTANCE.getBackendIdPropertyDefinition());
      this.pBaseDN = impl.getPropertyValues(INSTANCE.getBaseDNPropertyDefinition());
      this.pEnabled = impl.getPropertyValue(INSTANCE.getEnabledPropertyDefinition());
      this.pJavaClass = impl.getPropertyValue(INSTANCE.getJavaClassPropertyDefinition());
      this.pNotificationSenderAddress = impl.getPropertyValue(INSTANCE.getNotificationSenderAddressPropertyDefinition());
      this.pTaskBackingFile = impl.getPropertyValue(INSTANCE.getTaskBackingFilePropertyDefinition());
      this.pTaskRetentionTime = impl.getPropertyValue(INSTANCE.getTaskRetentionTimePropertyDefinition());
      this.pWritabilityMode = impl.getPropertyValue(INSTANCE.getWritabilityModePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addTaskChangeListener(
        ConfigurationChangeListener<TaskBackendCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeTaskChangeListener(
        ConfigurationChangeListener<TaskBackendCfg> listener) {
      impl.deregisterChangeListener(listener);
    }
    /**
     * {@inheritDoc}
     */
    public void addChangeListener(
        ConfigurationChangeListener<BackendCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeChangeListener(
        ConfigurationChangeListener<BackendCfg> listener) {
      impl.deregisterChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public String getBackendId() {
      return pBackendId;
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<DN> getBaseDN() {
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
    public String getJavaClass() {
      return pJavaClass;
    }



    /**
     * {@inheritDoc}
     */
    public String getNotificationSenderAddress() {
      return pNotificationSenderAddress;
    }



    /**
     * {@inheritDoc}
     */
    public String getTaskBackingFile() {
      return pTaskBackingFile;
    }



    /**
     * {@inheritDoc}
     */
    public long getTaskRetentionTime() {
      return pTaskRetentionTime;
    }



    /**
     * {@inheritDoc}
     */
    public WritabilityMode getWritabilityMode() {
      return pWritabilityMode;
    }



    /**
     * {@inheritDoc}
     */
    public Class<? extends TaskBackendCfg> configurationClass() {
      return TaskBackendCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
