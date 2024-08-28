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
import org.opends.server.admin.client.AuthorizationException;
import org.opends.server.admin.client.CommunicationException;
import org.opends.server.admin.client.ConcurrentModificationException;
import org.opends.server.admin.client.ManagedObject;
import org.opends.server.admin.client.MissingMandatoryPropertiesException;
import org.opends.server.admin.client.OperationRejectedException;
import org.opends.server.admin.DefaultBehaviorProvider;
import org.opends.server.admin.DefinedDefaultBehaviorProvider;
import org.opends.server.admin.DurationPropertyDefinition;
import org.opends.server.admin.IntegerPropertyDefinition;
import org.opends.server.admin.ManagedObjectAlreadyExistsException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.PropertyIsReadOnlyException;
import org.opends.server.admin.PropertyOption;
import org.opends.server.admin.PropertyProvider;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.server.ServerManagedObject;
import org.opends.server.admin.std.client.ReplicationServerCfgClient;
import org.opends.server.admin.std.server.ReplicationServerCfg;
import org.opends.server.admin.StringPropertyDefinition;
import org.opends.server.admin.Tag;
import org.opends.server.admin.TopCfgDefn;
import org.opends.server.admin.UndefinedDefaultBehaviorProvider;
import org.opends.server.types.DN;



/**
 * An interface for querying the Replication Server managed object
 * definition meta information.
 * <p>
 * Replication Servers publish updates to Directory Servers within a
 * Replication Domain.
 */
public final class ReplicationServerCfgDefn extends ManagedObjectDefinition<ReplicationServerCfgClient, ReplicationServerCfg> {

  // The singleton configuration definition instance.
  private static final ReplicationServerCfgDefn INSTANCE = new ReplicationServerCfgDefn();



  // The "assured-timeout" property definition.
  private static final DurationPropertyDefinition PD_ASSURED_TIMEOUT;



  // The "degraded-status-threshold" property definition.
  private static final IntegerPropertyDefinition PD_DEGRADED_STATUS_THRESHOLD;



  // The "group-id" property definition.
  private static final IntegerPropertyDefinition PD_GROUP_ID;



  // The "monitoring-period" property definition.
  private static final DurationPropertyDefinition PD_MONITORING_PERIOD;



  // The "queue-size" property definition.
  private static final IntegerPropertyDefinition PD_QUEUE_SIZE;



  // The "replication-db-directory" property definition.
  private static final StringPropertyDefinition PD_REPLICATION_DB_DIRECTORY;



  // The "replication-port" property definition.
  private static final IntegerPropertyDefinition PD_REPLICATION_PORT;



  // The "replication-purge-delay" property definition.
  private static final DurationPropertyDefinition PD_REPLICATION_PURGE_DELAY;



  // The "replication-server" property definition.
  private static final StringPropertyDefinition PD_REPLICATION_SERVER;



  // The "replication-server-id" property definition.
  private static final IntegerPropertyDefinition PD_REPLICATION_SERVER_ID;



  // The "weight" property definition.
  private static final IntegerPropertyDefinition PD_WEIGHT;



  // The "window-size" property definition.
  private static final IntegerPropertyDefinition PD_WINDOW_SIZE;



  // Build the "assured-timeout" property definition.
  static {
      DurationPropertyDefinition.Builder builder = DurationPropertyDefinition.createBuilder(INSTANCE, "assured-timeout");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "assured-timeout"));
      DefaultBehaviorProvider<Long> provider = new DefinedDefaultBehaviorProvider<Long>("1000ms");
      builder.setDefaultBehaviorProvider(provider);
      builder.setBaseUnit("ms");
      builder.setLowerLimit("1");
      PD_ASSURED_TIMEOUT = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_ASSURED_TIMEOUT);
  }



  // Build the "degraded-status-threshold" property definition.
  static {
      IntegerPropertyDefinition.Builder builder = IntegerPropertyDefinition.createBuilder(INSTANCE, "degraded-status-threshold");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "degraded-status-threshold"));
      DefaultBehaviorProvider<Integer> provider = new DefinedDefaultBehaviorProvider<Integer>("5000");
      builder.setDefaultBehaviorProvider(provider);
      builder.setLowerLimit(0);
      PD_DEGRADED_STATUS_THRESHOLD = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_DEGRADED_STATUS_THRESHOLD);
  }



  // Build the "group-id" property definition.
  static {
      IntegerPropertyDefinition.Builder builder = IntegerPropertyDefinition.createBuilder(INSTANCE, "group-id");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "group-id"));
      DefaultBehaviorProvider<Integer> provider = new DefinedDefaultBehaviorProvider<Integer>("1");
      builder.setDefaultBehaviorProvider(provider);
      builder.setUpperLimit(127);
      builder.setLowerLimit(1);
      PD_GROUP_ID = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_GROUP_ID);
  }



  // Build the "monitoring-period" property definition.
  static {
      DurationPropertyDefinition.Builder builder = DurationPropertyDefinition.createBuilder(INSTANCE, "monitoring-period");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "monitoring-period"));
      DefaultBehaviorProvider<Long> provider = new DefinedDefaultBehaviorProvider<Long>("3000ms");
      builder.setDefaultBehaviorProvider(provider);
      builder.setBaseUnit("ms");
      builder.setLowerLimit("0");
      PD_MONITORING_PERIOD = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_MONITORING_PERIOD);
  }



  // Build the "queue-size" property definition.
  static {
      IntegerPropertyDefinition.Builder builder = IntegerPropertyDefinition.createBuilder(INSTANCE, "queue-size");
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "queue-size"));
      DefaultBehaviorProvider<Integer> provider = new DefinedDefaultBehaviorProvider<Integer>("10000");
      builder.setDefaultBehaviorProvider(provider);
      PD_QUEUE_SIZE = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_QUEUE_SIZE);
  }



  // Build the "replication-db-directory" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "replication-db-directory");
      builder.setOption(PropertyOption.READ_ONLY);
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "replication-db-directory"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("changelogDb");
      builder.setDefaultBehaviorProvider(provider);
      PD_REPLICATION_DB_DIRECTORY = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_REPLICATION_DB_DIRECTORY);
  }



  // Build the "replication-port" property definition.
  static {
      IntegerPropertyDefinition.Builder builder = IntegerPropertyDefinition.createBuilder(INSTANCE, "replication-port");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "replication-port"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<Integer>());
      builder.setUpperLimit(65535);
      builder.setLowerLimit(1);
      PD_REPLICATION_PORT = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_REPLICATION_PORT);
  }



  // Build the "replication-purge-delay" property definition.
  static {
      DurationPropertyDefinition.Builder builder = DurationPropertyDefinition.createBuilder(INSTANCE, "replication-purge-delay");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "replication-purge-delay"));
      DefaultBehaviorProvider<Long> provider = new DefinedDefaultBehaviorProvider<Long>("86400s");
      builder.setDefaultBehaviorProvider(provider);
      builder.setAllowUnlimited(false);
      builder.setBaseUnit("s");
      PD_REPLICATION_PURGE_DELAY = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_REPLICATION_PURGE_DELAY);
  }



  // Build the "replication-server" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "replication-server");
      builder.setOption(PropertyOption.MULTI_VALUED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "replication-server"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<String>());
      builder.setPattern("^.+:[0-9]+$", "HOST:PORT");
      PD_REPLICATION_SERVER = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_REPLICATION_SERVER);
  }



  // Build the "replication-server-id" property definition.
  static {
      IntegerPropertyDefinition.Builder builder = IntegerPropertyDefinition.createBuilder(INSTANCE, "replication-server-id");
      builder.setOption(PropertyOption.READ_ONLY);
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "replication-server-id"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<Integer>());
      builder.setUpperLimit(65535);
      builder.setLowerLimit(1);
      PD_REPLICATION_SERVER_ID = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_REPLICATION_SERVER_ID);
  }



  // Build the "weight" property definition.
  static {
      IntegerPropertyDefinition.Builder builder = IntegerPropertyDefinition.createBuilder(INSTANCE, "weight");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "weight"));
      DefaultBehaviorProvider<Integer> provider = new DefinedDefaultBehaviorProvider<Integer>("1");
      builder.setDefaultBehaviorProvider(provider);
      builder.setLowerLimit(1);
      PD_WEIGHT = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_WEIGHT);
  }



  // Build the "window-size" property definition.
  static {
      IntegerPropertyDefinition.Builder builder = IntegerPropertyDefinition.createBuilder(INSTANCE, "window-size");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "window-size"));
      DefaultBehaviorProvider<Integer> provider = new DefinedDefaultBehaviorProvider<Integer>("100");
      builder.setDefaultBehaviorProvider(provider);
      PD_WINDOW_SIZE = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_WINDOW_SIZE);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("replication"));
  }



  /**
   * Get the Replication Server configuration definition singleton.
   *
   * @return Returns the Replication Server configuration definition
   *         singleton.
   */
  public static ReplicationServerCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private ReplicationServerCfgDefn() {
    super("replication-server", TopCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public ReplicationServerCfgClient createClientConfiguration(
      ManagedObject<? extends ReplicationServerCfgClient> impl) {
    return new ReplicationServerCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public ReplicationServerCfg createServerConfiguration(
      ServerManagedObject<? extends ReplicationServerCfg> impl) {
    return new ReplicationServerCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<ReplicationServerCfg> getServerConfigurationClass() {
    return ReplicationServerCfg.class;
  }



  /**
   * Get the "assured-timeout" property definition.
   * <p>
   * The timeout value when waiting for assured mode acknowledgments.
   * <p>
   * Defines the number of milliseconds that the replication server
   * will wait for assured acknowledgments (in either Safe Data or Safe
   * Read assured sub modes) before forgetting them and answer to the
   * entity that sent an update and is waiting for acknowledgment.
   *
   * @return Returns the "assured-timeout" property definition.
   */
  public DurationPropertyDefinition getAssuredTimeoutPropertyDefinition() {
    return PD_ASSURED_TIMEOUT;
  }



  /**
   * Get the "degraded-status-threshold" property definition.
   * <p>
   * The number of pending changes as threshold value for putting a
   * directory server in degraded status.
   * <p>
   * This value represents a number of pending changes a replication
   * server has in queue for sending to a directory server. Once this
   * value is crossed, the matching directory server goes in degraded
   * status. When number of pending changes goes back under this value,
   * the directory server is put back in normal status. 0 means status
   * analyzer is disabled and directory servers are never put in
   * degraded status.
   *
   * @return Returns the "degraded-status-threshold" property definition.
   */
  public IntegerPropertyDefinition getDegradedStatusThresholdPropertyDefinition() {
    return PD_DEGRADED_STATUS_THRESHOLD;
  }



  /**
   * Get the "group-id" property definition.
   * <p>
   * The group id for the replication server.
   * <p>
   * This value defines the group id of the replication server. The
   * replication system of a LDAP server uses the group id of the
   * replicated domain and tries to connect, if possible, to a
   * replication with the same group id.
   *
   * @return Returns the "group-id" property definition.
   */
  public IntegerPropertyDefinition getGroupIdPropertyDefinition() {
    return PD_GROUP_ID;
  }



  /**
   * Get the "monitoring-period" property definition.
   * <p>
   * The period between sending of monitoring messages.
   * <p>
   * Defines the number of milliseconds that the replication server
   * will wait before sending new monitoring messages to its peers
   * (replication servers and directory servers).
   *
   * @return Returns the "monitoring-period" property definition.
   */
  public DurationPropertyDefinition getMonitoringPeriodPropertyDefinition() {
    return PD_MONITORING_PERIOD;
  }



  /**
   * Get the "queue-size" property definition.
   * <p>
   * Specifies the number of changes that are kept in memory for each
   * Directory Server in the Replication Domain.
   *
   * @return Returns the "queue-size" property definition.
   */
  public IntegerPropertyDefinition getQueueSizePropertyDefinition() {
    return PD_QUEUE_SIZE;
  }



  /**
   * Get the "replication-db-directory" property definition.
   * <p>
   * The path where the Replication Server stores all persistent
   * information.
   *
   * @return Returns the "replication-db-directory" property definition.
   */
  public StringPropertyDefinition getReplicationDBDirectoryPropertyDefinition() {
    return PD_REPLICATION_DB_DIRECTORY;
  }



  /**
   * Get the "replication-port" property definition.
   * <p>
   * The port on which this Replication Server waits for connections
   * from other Replication Servers or Directory Servers.
   *
   * @return Returns the "replication-port" property definition.
   */
  public IntegerPropertyDefinition getReplicationPortPropertyDefinition() {
    return PD_REPLICATION_PORT;
  }



  /**
   * Get the "replication-purge-delay" property definition.
   * <p>
   * The time (in seconds) after which the Replication Server erases
   * all persistent information.
   *
   * @return Returns the "replication-purge-delay" property definition.
   */
  public DurationPropertyDefinition getReplicationPurgeDelayPropertyDefinition() {
    return PD_REPLICATION_PURGE_DELAY;
  }



  /**
   * Get the "replication-server" property definition.
   * <p>
   * Specifies the addresses of other Replication Servers to which
   * this Replication Server tries to connect at startup time.
   * <p>
   * Addresses must be specified using the syntax: hostname:port
   *
   * @return Returns the "replication-server" property definition.
   */
  public StringPropertyDefinition getReplicationServerPropertyDefinition() {
    return PD_REPLICATION_SERVER;
  }



  /**
   * Get the "replication-server-id" property definition.
   * <p>
   * Specifies a unique identifier for the Replication Server.
   * <p>
   * Each Replication Server must have a different server ID.
   *
   * @return Returns the "replication-server-id" property definition.
   */
  public IntegerPropertyDefinition getReplicationServerIdPropertyDefinition() {
    return PD_REPLICATION_SERVER_ID;
  }



  /**
   * Get the "weight" property definition.
   * <p>
   * The weight of the replication server.
   * <p>
   * The weight affected to the replication server. Each replication
   * server of the topology has a weight. When combined together, the
   * weights of the replication servers of a same group can be
   * translated to a percentage that determines the quantity of
   * directory servers of the topology that should be connected to a
   * replication server. For instance imagine a topology with 3
   * replication servers (with the same group id) with the following
   * weights: RS1=1, RS2=1, RS3=2. This means that RS1 should have 25%
   * of the directory servers connected in the topology, RS2 25%, and
   * RS3 50%. This may be useful if the replication servers of the
   * topology have a different power and one wants to spread the load
   * between the replication servers according to their power.
   *
   * @return Returns the "weight" property definition.
   */
  public IntegerPropertyDefinition getWeightPropertyDefinition() {
    return PD_WEIGHT;
  }



  /**
   * Get the "window-size" property definition.
   * <p>
   * Specifies the window size that the Replication Server uses when
   * communicating with other Replication Servers.
   *
   * @return Returns the "window-size" property definition.
   */
  public IntegerPropertyDefinition getWindowSizePropertyDefinition() {
    return PD_WINDOW_SIZE;
  }



  /**
   * Managed object client implementation.
   */
  private static class ReplicationServerCfgClientImpl implements
    ReplicationServerCfgClient {

    // Private implementation.
    private ManagedObject<? extends ReplicationServerCfgClient> impl;



    // Private constructor.
    private ReplicationServerCfgClientImpl(
        ManagedObject<? extends ReplicationServerCfgClient> impl) {
      this.impl = impl;
    }



    /**
     * {@inheritDoc}
     */
    public long getAssuredTimeout() {
      return impl.getPropertyValue(INSTANCE.getAssuredTimeoutPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setAssuredTimeout(Long value) {
      impl.setPropertyValue(INSTANCE.getAssuredTimeoutPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public int getDegradedStatusThreshold() {
      return impl.getPropertyValue(INSTANCE.getDegradedStatusThresholdPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setDegradedStatusThreshold(Integer value) {
      impl.setPropertyValue(INSTANCE.getDegradedStatusThresholdPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public int getGroupId() {
      return impl.getPropertyValue(INSTANCE.getGroupIdPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setGroupId(Integer value) {
      impl.setPropertyValue(INSTANCE.getGroupIdPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public long getMonitoringPeriod() {
      return impl.getPropertyValue(INSTANCE.getMonitoringPeriodPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setMonitoringPeriod(Long value) {
      impl.setPropertyValue(INSTANCE.getMonitoringPeriodPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public int getQueueSize() {
      return impl.getPropertyValue(INSTANCE.getQueueSizePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setQueueSize(Integer value) {
      impl.setPropertyValue(INSTANCE.getQueueSizePropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public String getReplicationDBDirectory() {
      return impl.getPropertyValue(INSTANCE.getReplicationDBDirectoryPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setReplicationDBDirectory(String value) throws PropertyIsReadOnlyException {
      impl.setPropertyValue(INSTANCE.getReplicationDBDirectoryPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public Integer getReplicationPort() {
      return impl.getPropertyValue(INSTANCE.getReplicationPortPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setReplicationPort(int value) {
      impl.setPropertyValue(INSTANCE.getReplicationPortPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public long getReplicationPurgeDelay() {
      return impl.getPropertyValue(INSTANCE.getReplicationPurgeDelayPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setReplicationPurgeDelay(Long value) {
      impl.setPropertyValue(INSTANCE.getReplicationPurgeDelayPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<String> getReplicationServer() {
      return impl.getPropertyValues(INSTANCE.getReplicationServerPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setReplicationServer(Collection<String> values) {
      impl.setPropertyValues(INSTANCE.getReplicationServerPropertyDefinition(), values);
    }



    /**
     * {@inheritDoc}
     */
    public Integer getReplicationServerId() {
      return impl.getPropertyValue(INSTANCE.getReplicationServerIdPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setReplicationServerId(int value) throws PropertyIsReadOnlyException {
      impl.setPropertyValue(INSTANCE.getReplicationServerIdPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public int getWeight() {
      return impl.getPropertyValue(INSTANCE.getWeightPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setWeight(Integer value) {
      impl.setPropertyValue(INSTANCE.getWeightPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public int getWindowSize() {
      return impl.getPropertyValue(INSTANCE.getWindowSizePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setWindowSize(Integer value) {
      impl.setPropertyValue(INSTANCE.getWindowSizePropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public ManagedObjectDefinition<? extends ReplicationServerCfgClient, ? extends ReplicationServerCfg> definition() {
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
  private static class ReplicationServerCfgServerImpl implements
    ReplicationServerCfg {

    // Private implementation.
    private ServerManagedObject<? extends ReplicationServerCfg> impl;

    // The value of the "assured-timeout" property.
    private final long pAssuredTimeout;

    // The value of the "degraded-status-threshold" property.
    private final int pDegradedStatusThreshold;

    // The value of the "group-id" property.
    private final int pGroupId;

    // The value of the "monitoring-period" property.
    private final long pMonitoringPeriod;

    // The value of the "queue-size" property.
    private final int pQueueSize;

    // The value of the "replication-db-directory" property.
    private final String pReplicationDBDirectory;

    // The value of the "replication-port" property.
    private final int pReplicationPort;

    // The value of the "replication-purge-delay" property.
    private final long pReplicationPurgeDelay;

    // The value of the "replication-server" property.
    private final SortedSet<String> pReplicationServer;

    // The value of the "replication-server-id" property.
    private final int pReplicationServerId;

    // The value of the "weight" property.
    private final int pWeight;

    // The value of the "window-size" property.
    private final int pWindowSize;



    // Private constructor.
    private ReplicationServerCfgServerImpl(ServerManagedObject<? extends ReplicationServerCfg> impl) {
      this.impl = impl;
      this.pAssuredTimeout = impl.getPropertyValue(INSTANCE.getAssuredTimeoutPropertyDefinition());
      this.pDegradedStatusThreshold = impl.getPropertyValue(INSTANCE.getDegradedStatusThresholdPropertyDefinition());
      this.pGroupId = impl.getPropertyValue(INSTANCE.getGroupIdPropertyDefinition());
      this.pMonitoringPeriod = impl.getPropertyValue(INSTANCE.getMonitoringPeriodPropertyDefinition());
      this.pQueueSize = impl.getPropertyValue(INSTANCE.getQueueSizePropertyDefinition());
      this.pReplicationDBDirectory = impl.getPropertyValue(INSTANCE.getReplicationDBDirectoryPropertyDefinition());
      this.pReplicationPort = impl.getPropertyValue(INSTANCE.getReplicationPortPropertyDefinition());
      this.pReplicationPurgeDelay = impl.getPropertyValue(INSTANCE.getReplicationPurgeDelayPropertyDefinition());
      this.pReplicationServer = impl.getPropertyValues(INSTANCE.getReplicationServerPropertyDefinition());
      this.pReplicationServerId = impl.getPropertyValue(INSTANCE.getReplicationServerIdPropertyDefinition());
      this.pWeight = impl.getPropertyValue(INSTANCE.getWeightPropertyDefinition());
      this.pWindowSize = impl.getPropertyValue(INSTANCE.getWindowSizePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addChangeListener(
        ConfigurationChangeListener<ReplicationServerCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeChangeListener(
        ConfigurationChangeListener<ReplicationServerCfg> listener) {
      impl.deregisterChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public long getAssuredTimeout() {
      return pAssuredTimeout;
    }



    /**
     * {@inheritDoc}
     */
    public int getDegradedStatusThreshold() {
      return pDegradedStatusThreshold;
    }



    /**
     * {@inheritDoc}
     */
    public int getGroupId() {
      return pGroupId;
    }



    /**
     * {@inheritDoc}
     */
    public long getMonitoringPeriod() {
      return pMonitoringPeriod;
    }



    /**
     * {@inheritDoc}
     */
    public int getQueueSize() {
      return pQueueSize;
    }



    /**
     * {@inheritDoc}
     */
    public String getReplicationDBDirectory() {
      return pReplicationDBDirectory;
    }



    /**
     * {@inheritDoc}
     */
    public int getReplicationPort() {
      return pReplicationPort;
    }



    /**
     * {@inheritDoc}
     */
    public long getReplicationPurgeDelay() {
      return pReplicationPurgeDelay;
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<String> getReplicationServer() {
      return pReplicationServer;
    }



    /**
     * {@inheritDoc}
     */
    public int getReplicationServerId() {
      return pReplicationServerId;
    }



    /**
     * {@inheritDoc}
     */
    public int getWeight() {
      return pWeight;
    }



    /**
     * {@inheritDoc}
     */
    public int getWindowSize() {
      return pWindowSize;
    }



    /**
     * {@inheritDoc}
     */
    public Class<? extends ReplicationServerCfg> configurationClass() {
      return ReplicationServerCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
