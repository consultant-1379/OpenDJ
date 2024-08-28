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
import org.opends.server.admin.std.client.ParallelWorkQueueCfgClient;
import org.opends.server.admin.std.server.ParallelWorkQueueCfg;
import org.opends.server.admin.std.server.WorkQueueCfg;
import org.opends.server.admin.Tag;
import org.opends.server.types.DN;



/**
 * An interface for querying the Parallel Work Queue managed object
 * definition meta information.
 * <p>
 * The Parallel Work Queue is a type of work queue that uses a number
 * of worker threads that watch a queue and pick up an operation to
 * process whenever one becomes available.
 */
public final class ParallelWorkQueueCfgDefn extends ManagedObjectDefinition<ParallelWorkQueueCfgClient, ParallelWorkQueueCfg> {

  // The singleton configuration definition instance.
  private static final ParallelWorkQueueCfgDefn INSTANCE = new ParallelWorkQueueCfgDefn();



  // The "java-class" property definition.
  private static final ClassPropertyDefinition PD_JAVA_CLASS;



  // The "num-worker-threads" property definition.
  private static final IntegerPropertyDefinition PD_NUM_WORKER_THREADS;



  // Build the "java-class" property definition.
  static {
      ClassPropertyDefinition.Builder builder = ClassPropertyDefinition.createBuilder(INSTANCE, "java-class");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.SERVER_RESTART, INSTANCE, "java-class"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("org.opends.server.extensions.ParallelWorkQueue");
      builder.setDefaultBehaviorProvider(provider);
      builder.addInstanceOf("org.opends.server.api.WorkQueue");
      PD_JAVA_CLASS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_JAVA_CLASS);
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
   * Get the Parallel Work Queue configuration definition singleton.
   *
   * @return Returns the Parallel Work Queue configuration definition
   *         singleton.
   */
  public static ParallelWorkQueueCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private ParallelWorkQueueCfgDefn() {
    super("parallel-work-queue", WorkQueueCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public ParallelWorkQueueCfgClient createClientConfiguration(
      ManagedObject<? extends ParallelWorkQueueCfgClient> impl) {
    return new ParallelWorkQueueCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public ParallelWorkQueueCfg createServerConfiguration(
      ServerManagedObject<? extends ParallelWorkQueueCfg> impl) {
    return new ParallelWorkQueueCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<ParallelWorkQueueCfg> getServerConfigurationClass() {
    return ParallelWorkQueueCfg.class;
  }



  /**
   * Get the "java-class" property definition.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Parallel Work Queue implementation.
   *
   * @return Returns the "java-class" property definition.
   */
  public ClassPropertyDefinition getJavaClassPropertyDefinition() {
    return PD_JAVA_CLASS;
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
  private static class ParallelWorkQueueCfgClientImpl implements
    ParallelWorkQueueCfgClient {

    // Private implementation.
    private ManagedObject<? extends ParallelWorkQueueCfgClient> impl;



    // Private constructor.
    private ParallelWorkQueueCfgClientImpl(
        ManagedObject<? extends ParallelWorkQueueCfgClient> impl) {
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
    public ManagedObjectDefinition<? extends ParallelWorkQueueCfgClient, ? extends ParallelWorkQueueCfg> definition() {
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
  private static class ParallelWorkQueueCfgServerImpl implements
    ParallelWorkQueueCfg {

    // Private implementation.
    private ServerManagedObject<? extends ParallelWorkQueueCfg> impl;

    // The value of the "java-class" property.
    private final String pJavaClass;

    // The value of the "num-worker-threads" property.
    private final Integer pNumWorkerThreads;



    // Private constructor.
    private ParallelWorkQueueCfgServerImpl(ServerManagedObject<? extends ParallelWorkQueueCfg> impl) {
      this.impl = impl;
      this.pJavaClass = impl.getPropertyValue(INSTANCE.getJavaClassPropertyDefinition());
      this.pNumWorkerThreads = impl.getPropertyValue(INSTANCE.getNumWorkerThreadsPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addParallelChangeListener(
        ConfigurationChangeListener<ParallelWorkQueueCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeParallelChangeListener(
        ConfigurationChangeListener<ParallelWorkQueueCfg> listener) {
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
    public Integer getNumWorkerThreads() {
      return pNumWorkerThreads;
    }



    /**
     * {@inheritDoc}
     */
    public Class<? extends ParallelWorkQueueCfg> configurationClass() {
      return ParallelWorkQueueCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
