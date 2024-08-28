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



import org.opends.server.admin.AbsoluteInheritedDefaultBehaviorProvider;
import org.opends.server.admin.AdministratorAction;
import org.opends.server.admin.ClassPropertyDefinition;
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
import org.opends.server.admin.PropertyOption;
import org.opends.server.admin.PropertyProvider;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.server.ServerManagedObject;
import org.opends.server.admin.std.client.ResourceLimitsQOSPolicyCfgClient;
import org.opends.server.admin.std.server.QOSPolicyCfg;
import org.opends.server.admin.std.server.ResourceLimitsQOSPolicyCfg;
import org.opends.server.admin.Tag;
import org.opends.server.types.DN;



/**
 * An interface for querying the Resource Limits QOS Policy managed
 * object definition meta information.
 * <p>
 * The Resource Limits QOS Policy are used to define resource limits
 * enforced by the server.
 */
public final class ResourceLimitsQOSPolicyCfgDefn extends ManagedObjectDefinition<ResourceLimitsQOSPolicyCfgClient, ResourceLimitsQOSPolicyCfg> {

  // The singleton configuration definition instance.
  private static final ResourceLimitsQOSPolicyCfgDefn INSTANCE = new ResourceLimitsQOSPolicyCfgDefn();



  // The "java-class" property definition.
  private static final ClassPropertyDefinition PD_JAVA_CLASS;



  // The "max-concurrent-ops-per-connection" property definition.
  private static final IntegerPropertyDefinition PD_MAX_CONCURRENT_OPS_PER_CONNECTION;



  // The "max-connections" property definition.
  private static final IntegerPropertyDefinition PD_MAX_CONNECTIONS;



  // The "max-connections-from-same-ip" property definition.
  private static final IntegerPropertyDefinition PD_MAX_CONNECTIONS_FROM_SAME_IP;



  // The "max-ops-interval" property definition.
  private static final DurationPropertyDefinition PD_MAX_OPS_INTERVAL;



  // The "max-ops-per-connection" property definition.
  private static final IntegerPropertyDefinition PD_MAX_OPS_PER_CONNECTION;



  // The "max-ops-per-interval" property definition.
  private static final IntegerPropertyDefinition PD_MAX_OPS_PER_INTERVAL;



  // The "min-substring-length" property definition.
  private static final IntegerPropertyDefinition PD_MIN_SUBSTRING_LENGTH;



  // The "size-limit" property definition.
  private static final IntegerPropertyDefinition PD_SIZE_LIMIT;



  // The "time-limit" property definition.
  private static final DurationPropertyDefinition PD_TIME_LIMIT;



  // Build the "java-class" property definition.
  static {
      ClassPropertyDefinition.Builder builder = ClassPropertyDefinition.createBuilder(INSTANCE, "java-class");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.COMPONENT_RESTART, INSTANCE, "java-class"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("org.opends.server.core.networkgroups.ResourceLimitsPolicyFactory");
      builder.setDefaultBehaviorProvider(provider);
      builder.addInstanceOf("org.opends.server.api.QOSPolicyFactory");
      PD_JAVA_CLASS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_JAVA_CLASS);
  }



  // Build the "max-concurrent-ops-per-connection" property definition.
  static {
      IntegerPropertyDefinition.Builder builder = IntegerPropertyDefinition.createBuilder(INSTANCE, "max-concurrent-ops-per-connection");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "max-concurrent-ops-per-connection"));
      DefaultBehaviorProvider<Integer> provider = new DefinedDefaultBehaviorProvider<Integer>("0");
      builder.setDefaultBehaviorProvider(provider);
      builder.setLowerLimit(0);
      PD_MAX_CONCURRENT_OPS_PER_CONNECTION = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_MAX_CONCURRENT_OPS_PER_CONNECTION);
  }



  // Build the "max-connections" property definition.
  static {
      IntegerPropertyDefinition.Builder builder = IntegerPropertyDefinition.createBuilder(INSTANCE, "max-connections");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "max-connections"));
      DefaultBehaviorProvider<Integer> provider = new DefinedDefaultBehaviorProvider<Integer>("0");
      builder.setDefaultBehaviorProvider(provider);
      builder.setLowerLimit(0);
      PD_MAX_CONNECTIONS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_MAX_CONNECTIONS);
  }



  // Build the "max-connections-from-same-ip" property definition.
  static {
      IntegerPropertyDefinition.Builder builder = IntegerPropertyDefinition.createBuilder(INSTANCE, "max-connections-from-same-ip");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "max-connections-from-same-ip"));
      DefaultBehaviorProvider<Integer> provider = new DefinedDefaultBehaviorProvider<Integer>("0");
      builder.setDefaultBehaviorProvider(provider);
      builder.setLowerLimit(0);
      PD_MAX_CONNECTIONS_FROM_SAME_IP = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_MAX_CONNECTIONS_FROM_SAME_IP);
  }



  // Build the "max-ops-interval" property definition.
  static {
      DurationPropertyDefinition.Builder builder = DurationPropertyDefinition.createBuilder(INSTANCE, "max-ops-interval");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "max-ops-interval"));
      DefaultBehaviorProvider<Long> provider = new DefinedDefaultBehaviorProvider<Long>("1s");
      builder.setDefaultBehaviorProvider(provider);
      builder.setBaseUnit("ms");
      builder.setLowerLimit("1");
      PD_MAX_OPS_INTERVAL = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_MAX_OPS_INTERVAL);
  }



  // Build the "max-ops-per-connection" property definition.
  static {
      IntegerPropertyDefinition.Builder builder = IntegerPropertyDefinition.createBuilder(INSTANCE, "max-ops-per-connection");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "max-ops-per-connection"));
      DefaultBehaviorProvider<Integer> provider = new DefinedDefaultBehaviorProvider<Integer>("0");
      builder.setDefaultBehaviorProvider(provider);
      builder.setLowerLimit(0);
      PD_MAX_OPS_PER_CONNECTION = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_MAX_OPS_PER_CONNECTION);
  }



  // Build the "max-ops-per-interval" property definition.
  static {
      IntegerPropertyDefinition.Builder builder = IntegerPropertyDefinition.createBuilder(INSTANCE, "max-ops-per-interval");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "max-ops-per-interval"));
      DefaultBehaviorProvider<Integer> provider = new DefinedDefaultBehaviorProvider<Integer>("0");
      builder.setDefaultBehaviorProvider(provider);
      builder.setLowerLimit(0);
      PD_MAX_OPS_PER_INTERVAL = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_MAX_OPS_PER_INTERVAL);
  }



  // Build the "min-substring-length" property definition.
  static {
      IntegerPropertyDefinition.Builder builder = IntegerPropertyDefinition.createBuilder(INSTANCE, "min-substring-length");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "min-substring-length"));
      DefaultBehaviorProvider<Integer> provider = new DefinedDefaultBehaviorProvider<Integer>("0");
      builder.setDefaultBehaviorProvider(provider);
      builder.setLowerLimit(0);
      PD_MIN_SUBSTRING_LENGTH = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_MIN_SUBSTRING_LENGTH);
  }



  // Build the "size-limit" property definition.
  static {
      IntegerPropertyDefinition.Builder builder = IntegerPropertyDefinition.createBuilder(INSTANCE, "size-limit");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "size-limit"));
      DefaultBehaviorProvider<Integer> provider = new AbsoluteInheritedDefaultBehaviorProvider<Integer>("/relation=global-configuration", "size-limit");
      builder.setDefaultBehaviorProvider(provider);
      builder.setLowerLimit(0);
      PD_SIZE_LIMIT = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_SIZE_LIMIT);
  }



  // Build the "time-limit" property definition.
  static {
      DurationPropertyDefinition.Builder builder = DurationPropertyDefinition.createBuilder(INSTANCE, "time-limit");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "time-limit"));
      DefaultBehaviorProvider<Long> provider = new AbsoluteInheritedDefaultBehaviorProvider<Long>("/relation=global-configuration", "time-limit");
      builder.setDefaultBehaviorProvider(provider);
      builder.setBaseUnit("s");
      builder.setLowerLimit("0");
      PD_TIME_LIMIT = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_TIME_LIMIT);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("core-server"));
  }



  /**
   * Get the Resource Limits QOS Policy configuration definition
   * singleton.
   *
   * @return Returns the Resource Limits QOS Policy configuration
   *         definition singleton.
   */
  public static ResourceLimitsQOSPolicyCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private ResourceLimitsQOSPolicyCfgDefn() {
    super("resource-limits-qos-policy", QOSPolicyCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public ResourceLimitsQOSPolicyCfgClient createClientConfiguration(
      ManagedObject<? extends ResourceLimitsQOSPolicyCfgClient> impl) {
    return new ResourceLimitsQOSPolicyCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public ResourceLimitsQOSPolicyCfg createServerConfiguration(
      ServerManagedObject<? extends ResourceLimitsQOSPolicyCfg> impl) {
    return new ResourceLimitsQOSPolicyCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<ResourceLimitsQOSPolicyCfg> getServerConfigurationClass() {
    return ResourceLimitsQOSPolicyCfg.class;
  }



  /**
   * Get the "java-class" property definition.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Resource Limits QOS Policy implementation.
   *
   * @return Returns the "java-class" property definition.
   */
  public ClassPropertyDefinition getJavaClassPropertyDefinition() {
    return PD_JAVA_CLASS;
  }



  /**
   * Get the "max-concurrent-ops-per-connection" property definition.
   * <p>
   * Specifies the maximum number of concurrent operations per client
   * connection.
   * <p>
   * A value of 0 means that no limit is enforced.
   *
   * @return Returns the "max-concurrent-ops-per-connection" property definition.
   */
  public IntegerPropertyDefinition getMaxConcurrentOpsPerConnectionPropertyDefinition() {
    return PD_MAX_CONCURRENT_OPS_PER_CONNECTION;
  }



  /**
   * Get the "max-connections" property definition.
   * <p>
   * Specifies the maximum number of concurrent client connections to
   * the server.
   * <p>
   * A value of 0 means that no limit is enforced.
   *
   * @return Returns the "max-connections" property definition.
   */
  public IntegerPropertyDefinition getMaxConnectionsPropertyDefinition() {
    return PD_MAX_CONNECTIONS;
  }



  /**
   * Get the "max-connections-from-same-ip" property definition.
   * <p>
   * Specifies the maximum number of client connections from the same
   * source address.
   * <p>
   * A value of 0 means that no limit is enforced.
   *
   * @return Returns the "max-connections-from-same-ip" property definition.
   */
  public IntegerPropertyDefinition getMaxConnectionsFromSameIPPropertyDefinition() {
    return PD_MAX_CONNECTIONS_FROM_SAME_IP;
  }



  /**
   * Get the "max-ops-interval" property definition.
   * <p>
   * Specifies the interval during which the number of operations is
   * limited.
   * <p>
   * When the maximum number of operations per interval is reached,
   * all subsequent operations on the same network group are refused
   * until the end of the time interval. This parameter allows to limit
   * the throughput on the network group.
   *
   * @return Returns the "max-ops-interval" property definition.
   */
  public DurationPropertyDefinition getMaxOpsIntervalPropertyDefinition() {
    return PD_MAX_OPS_INTERVAL;
  }



  /**
   * Get the "max-ops-per-connection" property definition.
   * <p>
   * Specifies the maximum number of operations per client connection.
   * <p>
   * A value of 0 means that no limit is enforced.
   *
   * @return Returns the "max-ops-per-connection" property definition.
   */
  public IntegerPropertyDefinition getMaxOpsPerConnectionPropertyDefinition() {
    return PD_MAX_OPS_PER_CONNECTION;
  }



  /**
   * Get the "max-ops-per-interval" property definition.
   * <p>
   * Specifies the maximum number of operations that can take place on
   * the same network group during the specified interval.
   * <p>
   * When the maximum number of operations per interval is reached,
   * all subsequent operations on the same network group are refused
   * until the end of the time interval. This parameter allows to limit
   * the throughput on the network group. A value of 0 indicates that
   * no limit is enforced.
   *
   * @return Returns the "max-ops-per-interval" property definition.
   */
  public IntegerPropertyDefinition getMaxOpsPerIntervalPropertyDefinition() {
    return PD_MAX_OPS_PER_INTERVAL;
  }



  /**
   * Get the "min-substring-length" property definition.
   * <p>
   * Specifies the minimum length for a search filter substring.
   * <p>
   * Search operations with short search filter substring are likely
   * to match a high number of entries and might degrade performance
   * overall. A value of 0 indicates that no limit is enforced.
   *
   * @return Returns the "min-substring-length" property definition.
   */
  public IntegerPropertyDefinition getMinSubstringLengthPropertyDefinition() {
    return PD_MIN_SUBSTRING_LENGTH;
  }



  /**
   * Get the "size-limit" property definition.
   * <p>
   * Specifies the maximum number of entries that can be returned to
   * the client during a single search operation.
   * <p>
   * A value of 0 indicates that no size limit is enforced. Note that
   * this is the default for the server, but it may be overridden on a
   * per-user basis using the ds-rlim-size-limit operational attribute.
   *
   * @return Returns the "size-limit" property definition.
   */
  public IntegerPropertyDefinition getSizeLimitPropertyDefinition() {
    return PD_SIZE_LIMIT;
  }



  /**
   * Get the "time-limit" property definition.
   * <p>
   * Specifies the maximum length of time that should be spent
   * processing a search operation.
   * <p>
   * A value of 0 seconds indicates that no time limit is enforced.
   * Note that this is the default for the server, but it may be
   * overridden on a per-user basis using the ds-rlim-time-limit
   * operational attribute.
   *
   * @return Returns the "time-limit" property definition.
   */
  public DurationPropertyDefinition getTimeLimitPropertyDefinition() {
    return PD_TIME_LIMIT;
  }



  /**
   * Managed object client implementation.
   */
  private static class ResourceLimitsQOSPolicyCfgClientImpl implements
    ResourceLimitsQOSPolicyCfgClient {

    // Private implementation.
    private ManagedObject<? extends ResourceLimitsQOSPolicyCfgClient> impl;



    // Private constructor.
    private ResourceLimitsQOSPolicyCfgClientImpl(
        ManagedObject<? extends ResourceLimitsQOSPolicyCfgClient> impl) {
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
    public int getMaxConcurrentOpsPerConnection() {
      return impl.getPropertyValue(INSTANCE.getMaxConcurrentOpsPerConnectionPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setMaxConcurrentOpsPerConnection(Integer value) {
      impl.setPropertyValue(INSTANCE.getMaxConcurrentOpsPerConnectionPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public int getMaxConnections() {
      return impl.getPropertyValue(INSTANCE.getMaxConnectionsPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setMaxConnections(Integer value) {
      impl.setPropertyValue(INSTANCE.getMaxConnectionsPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public int getMaxConnectionsFromSameIP() {
      return impl.getPropertyValue(INSTANCE.getMaxConnectionsFromSameIPPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setMaxConnectionsFromSameIP(Integer value) {
      impl.setPropertyValue(INSTANCE.getMaxConnectionsFromSameIPPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public long getMaxOpsInterval() {
      return impl.getPropertyValue(INSTANCE.getMaxOpsIntervalPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setMaxOpsInterval(Long value) {
      impl.setPropertyValue(INSTANCE.getMaxOpsIntervalPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public int getMaxOpsPerConnection() {
      return impl.getPropertyValue(INSTANCE.getMaxOpsPerConnectionPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setMaxOpsPerConnection(Integer value) {
      impl.setPropertyValue(INSTANCE.getMaxOpsPerConnectionPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public int getMaxOpsPerInterval() {
      return impl.getPropertyValue(INSTANCE.getMaxOpsPerIntervalPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setMaxOpsPerInterval(Integer value) {
      impl.setPropertyValue(INSTANCE.getMaxOpsPerIntervalPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public int getMinSubstringLength() {
      return impl.getPropertyValue(INSTANCE.getMinSubstringLengthPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setMinSubstringLength(Integer value) {
      impl.setPropertyValue(INSTANCE.getMinSubstringLengthPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public Integer getSizeLimit() {
      return impl.getPropertyValue(INSTANCE.getSizeLimitPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setSizeLimit(Integer value) {
      impl.setPropertyValue(INSTANCE.getSizeLimitPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public Long getTimeLimit() {
      return impl.getPropertyValue(INSTANCE.getTimeLimitPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setTimeLimit(Long value) {
      impl.setPropertyValue(INSTANCE.getTimeLimitPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public ManagedObjectDefinition<? extends ResourceLimitsQOSPolicyCfgClient, ? extends ResourceLimitsQOSPolicyCfg> definition() {
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
  private static class ResourceLimitsQOSPolicyCfgServerImpl implements
    ResourceLimitsQOSPolicyCfg {

    // Private implementation.
    private ServerManagedObject<? extends ResourceLimitsQOSPolicyCfg> impl;

    // The value of the "java-class" property.
    private final String pJavaClass;

    // The value of the "max-concurrent-ops-per-connection" property.
    private final int pMaxConcurrentOpsPerConnection;

    // The value of the "max-connections" property.
    private final int pMaxConnections;

    // The value of the "max-connections-from-same-ip" property.
    private final int pMaxConnectionsFromSameIP;

    // The value of the "max-ops-interval" property.
    private final long pMaxOpsInterval;

    // The value of the "max-ops-per-connection" property.
    private final int pMaxOpsPerConnection;

    // The value of the "max-ops-per-interval" property.
    private final int pMaxOpsPerInterval;

    // The value of the "min-substring-length" property.
    private final int pMinSubstringLength;

    // The value of the "size-limit" property.
    private final Integer pSizeLimit;

    // The value of the "time-limit" property.
    private final Long pTimeLimit;



    // Private constructor.
    private ResourceLimitsQOSPolicyCfgServerImpl(ServerManagedObject<? extends ResourceLimitsQOSPolicyCfg> impl) {
      this.impl = impl;
      this.pJavaClass = impl.getPropertyValue(INSTANCE.getJavaClassPropertyDefinition());
      this.pMaxConcurrentOpsPerConnection = impl.getPropertyValue(INSTANCE.getMaxConcurrentOpsPerConnectionPropertyDefinition());
      this.pMaxConnections = impl.getPropertyValue(INSTANCE.getMaxConnectionsPropertyDefinition());
      this.pMaxConnectionsFromSameIP = impl.getPropertyValue(INSTANCE.getMaxConnectionsFromSameIPPropertyDefinition());
      this.pMaxOpsInterval = impl.getPropertyValue(INSTANCE.getMaxOpsIntervalPropertyDefinition());
      this.pMaxOpsPerConnection = impl.getPropertyValue(INSTANCE.getMaxOpsPerConnectionPropertyDefinition());
      this.pMaxOpsPerInterval = impl.getPropertyValue(INSTANCE.getMaxOpsPerIntervalPropertyDefinition());
      this.pMinSubstringLength = impl.getPropertyValue(INSTANCE.getMinSubstringLengthPropertyDefinition());
      this.pSizeLimit = impl.getPropertyValue(INSTANCE.getSizeLimitPropertyDefinition());
      this.pTimeLimit = impl.getPropertyValue(INSTANCE.getTimeLimitPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addResourceLimitsChangeListener(
        ConfigurationChangeListener<ResourceLimitsQOSPolicyCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeResourceLimitsChangeListener(
        ConfigurationChangeListener<ResourceLimitsQOSPolicyCfg> listener) {
      impl.deregisterChangeListener(listener);
    }
    /**
     * {@inheritDoc}
     */
    public void addChangeListener(
        ConfigurationChangeListener<QOSPolicyCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeChangeListener(
        ConfigurationChangeListener<QOSPolicyCfg> listener) {
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
    public int getMaxConcurrentOpsPerConnection() {
      return pMaxConcurrentOpsPerConnection;
    }



    /**
     * {@inheritDoc}
     */
    public int getMaxConnections() {
      return pMaxConnections;
    }



    /**
     * {@inheritDoc}
     */
    public int getMaxConnectionsFromSameIP() {
      return pMaxConnectionsFromSameIP;
    }



    /**
     * {@inheritDoc}
     */
    public long getMaxOpsInterval() {
      return pMaxOpsInterval;
    }



    /**
     * {@inheritDoc}
     */
    public int getMaxOpsPerConnection() {
      return pMaxOpsPerConnection;
    }



    /**
     * {@inheritDoc}
     */
    public int getMaxOpsPerInterval() {
      return pMaxOpsPerInterval;
    }



    /**
     * {@inheritDoc}
     */
    public int getMinSubstringLength() {
      return pMinSubstringLength;
    }



    /**
     * {@inheritDoc}
     */
    public Integer getSizeLimit() {
      return pSizeLimit;
    }



    /**
     * {@inheritDoc}
     */
    public Long getTimeLimit() {
      return pTimeLimit;
    }



    /**
     * {@inheritDoc}
     */
    public Class<? extends ResourceLimitsQOSPolicyCfg> configurationClass() {
      return ResourceLimitsQOSPolicyCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
