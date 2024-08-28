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
import org.opends.server.admin.AliasDefaultBehaviorProvider;
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
import org.opends.server.admin.std.client.TraditionalWorkQueueCfgClient;
import org.opends.server.admin.std.server.TraditionalWorkQueueCfg;
import org.opends.server.admin.std.server.WorkQueueCfg;
import org.opends.server.admin.Tag;
import org.opends.server.types.DN;



/**
 * An interface for querying the Traditional Work Queue managed object
 * definition meta information.
 * <p>
 * The Traditional Work Queue is a type of work queue that uses a
 * number of worker threads that watch a queue and pick up an operation
 * to process whenever one becomes available.
 */
public final class TraditionalWorkQueueCfgDefn extends ManagedObjectDefinition<TraditionalWorkQueueCfgClient, TraditionalWorkQueueCfg> {

  // The singleton configuration definition instance.
  private static final TraditionalWorkQueueCfgDefn INSTANCE = new TraditionalWorkQueueCfgDefn();



  // The "java-class" property definition.
  private static final ClassPropertyDefinition PD_JAVA_CLASS;



  // The "max-work-queue-capacity" property definition.
  private static final IntegerPropertyDefinition PD_MAX_WORK_QUEUE_CAPACITY;



  // The "num-worker-threads" property definition.
  private static final IntegerPropertyDefinition PD_NUM_WORKER_THREADS;



  // Build the "java-class" property definition.
  static {
      ClassPropertyDefinition.Builder builder = ClassPropertyDefinition.createBuilder(INSTANCE, "java-class");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.SERVER_RESTART, INSTANCE, "java-class"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("org.opends.server.extensions.TraditionalWorkQueue");
      builder.setDefaultBehaviorProvider(provider);
      builder.addInstanceOf("org.opends.server.api.WorkQueue");
      PD_JAVA_CLASS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_JAVA_CLASS);
  }



  // Build the "max-work-queue-capacity" property definition.
  static {
      IntegerPropertyDefinition.Builder builder = IntegerPropertyDefinition.createBuilder(INSTANCE, "max-work-queue-capacity");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "max-work-queue-capacity"));
      DefaultBehaviorProvider<Integer> provider = new DefinedDefaultBehaviorProvider<Integer>("1000");
      builder.setDefaultBehaviorProvider(provider);
      builder.setUpperLimit(2147483647);
      builder.setLowerLimit(1);
      PD_MAX_WORK_QUEUE_CAPACITY = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_MAX_WORK_QUEUE_CAPACITY);
  }



  // Build the "num-worker-threads" property definition.
  static {
      IntegerPropertyDefinition.Builder builder = IntegerPropertyDefinition.createBuilder(INSTANCE, "num-worker-threads");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "num-worker-threads"));
      builder.setDefaultBehaviorProvider(new AliasDefaultBehaviorProvider<Integer>(INSTANCE, "num-worker-threads"));
      builder.setUpperLimit(2147483647);
      builder.setLowerLimit(1);
      PD_NUM_WORKER_THREADS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_NUM_WORKER_THREADS);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("core-server"));
  }



  /**
   * Get the Traditional Work Queue configuration definition
   * singleton.
   *
   * @return Returns the Traditional Work Queue configuration
   *         definition singleton.
   */
  public static TraditionalWorkQueueCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private TraditionalWorkQueueCfgDefn() {
    super("traditional-work-queue", WorkQueueCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public TraditionalWorkQueueCfgClient createClientConfiguration(
      ManagedObject<? extends TraditionalWorkQueueCfgClient> impl) {
    return new TraditionalWorkQueueCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public TraditionalWorkQueueCfg createServerConfiguration(
      ServerManagedObject<? extends TraditionalWorkQueueCfg> impl) {
    return new TraditionalWorkQueueCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<TraditionalWorkQueueCfg> getServerConfigurationClass() {
    return TraditionalWorkQueueCfg.class;
  }



  /**
   * Get the "java-class" property definition.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Traditional Work Queue implementation.
   *
   * @return Returns the "java-class" property definition.
   */
  public ClassPropertyDefinition getJavaClassPropertyDefinition() {
    return PD_JAVA_CLASS;
  }



  /**
   * Get the "max-work-queue-capacity" property definition.
   * <p>
   * Specifies the maximum number of queued operations that can be in
   * the work queue at any given time.
   * <p>
   * If the work queue is already full and additional requests are
   * received by the server, then the server front end, and possibly
   * the client, will be blocked until the work queue has available
   * capacity.
   *
   * @return Returns the "max-work-queue-capacity" property definition.
   */
  public IntegerPropertyDefinition getMaxWorkQueueCapacityPropertyDefinition() {
    return PD_MAX_WORK_QUEUE_CAPACITY;
  }



  /**
   * Get the "num-worker-threads" property definition.
   * <p>
   * Specifies the number of worker threads to be used for processing
   * operations placed in the queue.
   * <p>
   * If the value is increased, the additional worker threads are
   * created immediately. If the value is reduced, the appropriate
   * number of threads are destroyed as operations complete processing.
   *
   * @return Returns the "num-worker-threads" property definition.
   */
  public IntegerPropertyDefinition getNumWorkerThreadsPropertyDefinition() {
    return PD_NUM_WORKER_THREADS;
  }



  /**
   * Managed object client implementation.
   */
  private static class TraditionalWorkQueueCfgClientImpl implements
    TraditionalWorkQueueCfgClient {

    // Private implementation.
    private ManagedObject<? extends TraditionalWorkQueueCfgClient> impl;



    // Private constructor.
    private TraditionalWorkQueueCfgClientImpl(
        ManagedObject<? extends TraditionalWorkQueueCfgClient> impl) {
      this.impl = impl;
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
    public int getMaxWorkQueueCapacity() {
      return impl.getPropertyValue(INSTANCE.getMaxWorkQueueCapacityPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setMaxWorkQueueCapacity(Integer value) {
      impl.setPropertyValue(INSTANCE.getMaxWorkQueueCapacityPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public Integer getNumWorkerThreads() {
      return impl.getPropertyValue(INSTANCE.getNumWorkerThreadsPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setNumWorkerThreads(Integer value) {
      impl.setPropertyValue(INSTANCE.getNumWorkerThreadsPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public ManagedObjectDefinition<? extends TraditionalWorkQueueCfgClient, ? extends TraditionalWorkQueueCfg> definition() {
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
  private static class TraditionalWorkQueueCfgServerImpl implements
    TraditionalWorkQueueCfg {

    // Private implementation.
    private ServerManagedObject<? extends TraditionalWorkQueueCfg> impl;

    // The value of the "java-class" property.
    private final String pJavaClass;

    // The value of the "max-work-queue-capacity" property.
    private final int pMaxWorkQueueCapacity;

    // The value of the "num-worker-threads" property.
    private final Integer pNumWorkerThreads;



    // Private constructor.
    private TraditionalWorkQueueCfgServerImpl(ServerManagedObject<? extends TraditionalWorkQueueCfg> impl) {
      this.impl = impl;
      this.pJavaClass = impl.getPropertyValue(INSTANCE.getJavaClassPropertyDefinition());
      this.pMaxWorkQueueCapacity = impl.getPropertyValue(INSTANCE.getMaxWorkQueueCapacityPropertyDefinition());
      this.pNumWorkerThreads = impl.getPropertyValue(INSTANCE.getNumWorkerThreadsPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addTraditionalChangeListener(
        ConfigurationChangeListener<TraditionalWorkQueueCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeTraditionalChangeListener(
        ConfigurationChangeListener<TraditionalWorkQueueCfg> listener) {
      impl.deregisterChangeListener(listener);
    }
    /**
     * {@inheritDoc}
     */
    public void addChangeListener(
        ConfigurationChangeListener<WorkQueueCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeChangeListener(
        ConfigurationChangeListener<WorkQueueCfg> listener) {
      impl.deregisterChangeListener(listener);
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
    public int getMaxWorkQueueCapacity() {
      return pMaxWorkQueueCapacity;
    }



    /**
     * {@inheritDoc}
     */
    public Integer getNumWorkerThreads() {
      return pNumWorkerThreads;
    }



    /**
     * {@inheritDoc}
     */
    public Class<? extends TraditionalWorkQueueCfg> configurationClass() {
      return TraditionalWorkQueueCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
