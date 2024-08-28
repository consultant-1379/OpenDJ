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
import org.opends.server.admin.BooleanPropertyDefinition;
import org.opends.server.admin.client.AuthorizationException;
import org.opends.server.admin.client.CommunicationException;
import org.opends.server.admin.client.ConcurrentModificationException;
import org.opends.server.admin.client.ManagedObject;
import org.opends.server.admin.client.ManagedObjectDecodingException;
import org.opends.server.admin.client.MissingMandatoryPropertiesException;
import org.opends.server.admin.client.OperationRejectedException;
import org.opends.server.admin.DefaultBehaviorProvider;
import org.opends.server.admin.DefinedDefaultBehaviorProvider;
import org.opends.server.admin.DefinitionDecodingException;
import org.opends.server.admin.DNPropertyDefinition;
import org.opends.server.admin.DurationPropertyDefinition;
import org.opends.server.admin.EnumPropertyDefinition;
import org.opends.server.admin.IntegerPropertyDefinition;
import org.opends.server.admin.ManagedObjectAlreadyExistsException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.ManagedObjectNotFoundException;
import org.opends.server.admin.PropertyIsReadOnlyException;
import org.opends.server.admin.PropertyOption;
import org.opends.server.admin.PropertyProvider;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.server.ServerManagedObject;
import org.opends.server.admin.SingletonRelationDefinition;
import org.opends.server.admin.std.client.ExternalChangelogDomainCfgClient;
import org.opends.server.admin.std.client.ReplicationDomainCfgClient;
import org.opends.server.admin.std.server.ExternalChangelogDomainCfg;
import org.opends.server.admin.std.server.ReplicationDomainCfg;
import org.opends.server.admin.StringPropertyDefinition;
import org.opends.server.admin.Tag;
import org.opends.server.admin.TopCfgDefn;
import org.opends.server.admin.UndefinedDefaultBehaviorProvider;
import org.opends.server.config.ConfigException;
import org.opends.server.types.DN;



/**
 * An interface for querying the Replication Domain managed object
 * definition meta information.
 * <p>
 * A Replication Domain comprises of several Directory Servers sharing
 * the same synchronized set of data.
 */
public final class ReplicationDomainCfgDefn extends ManagedObjectDefinition<ReplicationDomainCfgClient, ReplicationDomainCfg> {

  // The singleton configuration definition instance.
  private static final ReplicationDomainCfgDefn INSTANCE = new ReplicationDomainCfgDefn();



  /**
   * Defines the set of permissable values for the "assured-type" property.
   * <p>
   * Defines the assured replication mode of the replicated domain.
   * <p>
   * The assured replication can be disabled or enabled. When enabled,
   * two modes are available: Safe Data or Safe Read modes.
   */
  public static enum AssuredType {

    /**
     * Assured replication is not enabled. Updates sent for
     * replication (for being replayed on other LDAP servers in the
     * topology) are sent without waiting for any acknowledgment and
     * the LDAP client call returns immediately.
     */
    NOT_ASSURED("not-assured"),



    /**
     * Assured replication is enabled in Safe Data mode: updates sent
     * for replication are subject to acknowledgment from the
     * replication servers that have the same group ID as the local
     * server (defined with the group-id property). The number of
     * acknowledgments to expect is defined by the assured-sd-level
     * property. After acknowledgments are received, LDAP client call
     * returns.
     */
    SAFE_DATA("safe-data"),



    /**
     * Assured replication is enabled in Safe Read mode: updates sent
     * for replication are subject to acknowledgments from the LDAP
     * servers in the topology that have the same group ID as the local
     * server (defined with the group-id property). After
     * acknowledgments are received, LDAP client call returns.
     */
    SAFE_READ("safe-read");



    // String representation of the value.
    private final String name;



    // Private constructor.
    private AssuredType(String name) { this.name = name; }



    /**
     * {@inheritDoc}
     */
    public String toString() { return name; }

  }



  /**
   * Defines the set of permissable values for the "isolation-policy" property.
   * <p>
   * Specifies the behavior of the Directory Server if a write
   * operation is attempted on the data within the Replication Domain
   * when none of the configured Replication Servers are available.
   */
  public static enum IsolationPolicy {

    /**
     * Indicates that updates should be accepted even though it is not
     * possible to send them to any Replication Server. Best effort is
     * made to re-send those updates to a Replication Servers when one
     * of them is available, however those changes are at risk because
     * they are only available from the historical information. This
     * mode can also introduce high replication latency.
     */
    ACCEPT_ALL_UPDATES("accept-all-updates"),



    /**
     * Indicates that all updates attempted on this Replication Domain
     * are rejected when no Replication Server is available.
     */
    REJECT_ALL_UPDATES("reject-all-updates");



    // String representation of the value.
    private final String name;



    // Private constructor.
    private IsolationPolicy(String name) { this.name = name; }



    /**
     * {@inheritDoc}
     */
    public String toString() { return name; }

  }



  // The "assured-sd-level" property definition.
  private static final IntegerPropertyDefinition PD_ASSURED_SD_LEVEL;



  // The "assured-timeout" property definition.
  private static final DurationPropertyDefinition PD_ASSURED_TIMEOUT;



  // The "assured-type" property definition.
  private static final EnumPropertyDefinition<AssuredType> PD_ASSURED_TYPE;



  // The "base-dn" property definition.
  private static final DNPropertyDefinition PD_BASE_DN;



  // The "changetime-heartbeat-interval" property definition.
  private static final DurationPropertyDefinition PD_CHANGETIME_HEARTBEAT_INTERVAL;



  // The "conflicts-historical-purge-delay" property definition.
  private static final DurationPropertyDefinition PD_CONFLICTS_HISTORICAL_PURGE_DELAY;



  // The "fractional-exclude" property definition.
  private static final StringPropertyDefinition PD_FRACTIONAL_EXCLUDE;



  // The "fractional-include" property definition.
  private static final StringPropertyDefinition PD_FRACTIONAL_INCLUDE;



  // The "group-id" property definition.
  private static final IntegerPropertyDefinition PD_GROUP_ID;



  // The "heartbeat-interval" property definition.
  private static final DurationPropertyDefinition PD_HEARTBEAT_INTERVAL;



  // The "initialization-window-size" property definition.
  private static final IntegerPropertyDefinition PD_INITIALIZATION_WINDOW_SIZE;



  // The "isolation-policy" property definition.
  private static final EnumPropertyDefinition<IsolationPolicy> PD_ISOLATION_POLICY;



  // The "log-changenumber" property definition.
  private static final BooleanPropertyDefinition PD_LOG_CHANGENUMBER;



  // The "referrals-url" property definition.
  private static final StringPropertyDefinition PD_REFERRALS_URL;



  // The "replication-server" property definition.
  private static final StringPropertyDefinition PD_REPLICATION_SERVER;



  // The "server-id" property definition.
  private static final IntegerPropertyDefinition PD_SERVER_ID;



  // The "solve-conflicts" property definition.
  private static final BooleanPropertyDefinition PD_SOLVE_CONFLICTS;



  // The "window-size" property definition.
  private static final IntegerPropertyDefinition PD_WINDOW_SIZE;



  // The "external-changelog-domain" relation definition.
  private static final SingletonRelationDefinition<ExternalChangelogDomainCfgClient, ExternalChangelogDomainCfg> RD_EXTERNAL_CHANGELOG_DOMAIN;



  // Build the "assured-sd-level" property definition.
  static {
      IntegerPropertyDefinition.Builder builder = IntegerPropertyDefinition.createBuilder(INSTANCE, "assured-sd-level");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "assured-sd-level"));
      DefaultBehaviorProvider<Integer> provider = new DefinedDefaultBehaviorProvider<Integer>("1");
      builder.setDefaultBehaviorProvider(provider);
      builder.setUpperLimit(127);
      builder.setLowerLimit(1);
      PD_ASSURED_SD_LEVEL = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_ASSURED_SD_LEVEL);
  }



  // Build the "assured-timeout" property definition.
  static {
      DurationPropertyDefinition.Builder builder = DurationPropertyDefinition.createBuilder(INSTANCE, "assured-timeout");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "assured-timeout"));
      DefaultBehaviorProvider<Long> provider = new DefinedDefaultBehaviorProvider<Long>("2000ms");
      builder.setDefaultBehaviorProvider(provider);
      builder.setBaseUnit("ms");
      builder.setLowerLimit("1");
      PD_ASSURED_TIMEOUT = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_ASSURED_TIMEOUT);
  }



  // Build the "assured-type" property definition.
  static {
      EnumPropertyDefinition.Builder<AssuredType> builder = EnumPropertyDefinition.createBuilder(INSTANCE, "assured-type");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "assured-type"));
      DefaultBehaviorProvider<AssuredType> provider = new DefinedDefaultBehaviorProvider<AssuredType>("not-assured");
      builder.setDefaultBehaviorProvider(provider);
      builder.setEnumClass(AssuredType.class);
      PD_ASSURED_TYPE = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_ASSURED_TYPE);
  }



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



  // Build the "changetime-heartbeat-interval" property definition.
  static {
      DurationPropertyDefinition.Builder builder = DurationPropertyDefinition.createBuilder(INSTANCE, "changetime-heartbeat-interval");
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "changetime-heartbeat-interval"));
      DefaultBehaviorProvider<Long> provider = new DefinedDefaultBehaviorProvider<Long>("1000ms");
      builder.setDefaultBehaviorProvider(provider);
      builder.setBaseUnit("ms");
      builder.setLowerLimit("0");
      PD_CHANGETIME_HEARTBEAT_INTERVAL = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_CHANGETIME_HEARTBEAT_INTERVAL);
  }



  // Build the "conflicts-historical-purge-delay" property definition.
  static {
      DurationPropertyDefinition.Builder builder = DurationPropertyDefinition.createBuilder(INSTANCE, "conflicts-historical-purge-delay");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "conflicts-historical-purge-delay"));
      DefaultBehaviorProvider<Long> provider = new DefinedDefaultBehaviorProvider<Long>("1440m");
      builder.setDefaultBehaviorProvider(provider);
      builder.setAllowUnlimited(false);
      builder.setBaseUnit("m");
      PD_CONFLICTS_HISTORICAL_PURGE_DELAY = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_CONFLICTS_HISTORICAL_PURGE_DELAY);
  }



  // Build the "fractional-exclude" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "fractional-exclude");
      builder.setOption(PropertyOption.MULTI_VALUED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "fractional-exclude"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<String>());
      builder.setPattern("^((([a-zA-Z]([a-zA-Z]|[0-9]|-|;)*+)|(0|([1-9]([0-9])*+))(\\.(0|([1-9]([0-9])*+)))*+)|\\*):(([a-zA-Z]([a-zA-Z]|[0-9]|-|;)*+)|(0|([1-9]([0-9])*+))(\\.(0|([1-9]([0-9])*+)))*+)(,(([a-zA-Z]([a-zA-Z]|[0-9]|-|;)*+)|(0|([1-9]([0-9])*+))(\\.(0|([1-9]([0-9])*+)))*+))*+$", "Syntax: className:attributeName[,attributeName] or *:attributeName[,attributeName]. Note that any class (className) or attribute (attributeName) definition can be replaced with its OID definition. Examples: inetOrgPerson:photo,jpegPhoto : 'photo' and 'jpegPhoto' attributes of any entry of type 'inetOrgPerson' class. This can also be 2.16.840.1.113730.3.2.2:0.9.2342.19200300.100.1.7,0.9.2342.19200300.100.1.60 or a mix. *:jpegPhoto : the 'jpegPhoto' attribute of any entry that has this attribute. This can also be *:0.9.2342.19200300.100.1.60");
      PD_FRACTIONAL_EXCLUDE = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_FRACTIONAL_EXCLUDE);
  }



  // Build the "fractional-include" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "fractional-include");
      builder.setOption(PropertyOption.MULTI_VALUED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "fractional-include"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<String>());
      builder.setPattern("^((([a-zA-Z]([a-zA-Z]|[0-9]|-|;)*+)|(0|([1-9]([0-9])*+))(\\.(0|([1-9]([0-9])*+)))*+)|\\*):(([a-zA-Z]([a-zA-Z]|[0-9]|-|;)*+)|(0|([1-9]([0-9])*+))(\\.(0|([1-9]([0-9])*+)))*+)(,(([a-zA-Z]([a-zA-Z]|[0-9]|-|;)*+)|(0|([1-9]([0-9])*+))(\\.(0|([1-9]([0-9])*+)))*+))*+$", "Syntax: className:attributeName[,attributeName] or *:attributeName[,attributeName] Note that any class (className) or attribute (attributeName) definition can be replaced with its OID definition. Examples: - inetOrgPerson:uid,employeeNumber : 'uid' and 'employeeNumber' attributes of any entry of type 'inetOrgPerson' class. This can also be 2.16.840.1.113730.3.2.2:0.9.2342.19200300.100.1.1,2.16.840.1.113730.3.1.3 or a mix. - *:description : the 'description' attribute of any entry that has this attribute. This can also be *:2.5.4.13");
      PD_FRACTIONAL_INCLUDE = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_FRACTIONAL_INCLUDE);
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



  // Build the "heartbeat-interval" property definition.
  static {
      DurationPropertyDefinition.Builder builder = DurationPropertyDefinition.createBuilder(INSTANCE, "heartbeat-interval");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "heartbeat-interval"));
      DefaultBehaviorProvider<Long> provider = new DefinedDefaultBehaviorProvider<Long>("10000ms");
      builder.setDefaultBehaviorProvider(provider);
      builder.setBaseUnit("ms");
      builder.setLowerLimit("100");
      PD_HEARTBEAT_INTERVAL = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_HEARTBEAT_INTERVAL);
  }



  // Build the "initialization-window-size" property definition.
  static {
      IntegerPropertyDefinition.Builder builder = IntegerPropertyDefinition.createBuilder(INSTANCE, "initialization-window-size");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "initialization-window-size"));
      DefaultBehaviorProvider<Integer> provider = new DefinedDefaultBehaviorProvider<Integer>("100");
      builder.setDefaultBehaviorProvider(provider);
      PD_INITIALIZATION_WINDOW_SIZE = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_INITIALIZATION_WINDOW_SIZE);
  }



  // Build the "isolation-policy" property definition.
  static {
      EnumPropertyDefinition.Builder<IsolationPolicy> builder = EnumPropertyDefinition.createBuilder(INSTANCE, "isolation-policy");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "isolation-policy"));
      DefaultBehaviorProvider<IsolationPolicy> provider = new DefinedDefaultBehaviorProvider<IsolationPolicy>("reject-all-updates");
      builder.setDefaultBehaviorProvider(provider);
      builder.setEnumClass(IsolationPolicy.class);
      PD_ISOLATION_POLICY = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_ISOLATION_POLICY);
  }



  // Build the "log-changenumber" property definition.
  static {
      BooleanPropertyDefinition.Builder builder = BooleanPropertyDefinition.createBuilder(INSTANCE, "log-changenumber");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "log-changenumber"));
      DefaultBehaviorProvider<Boolean> provider = new DefinedDefaultBehaviorProvider<Boolean>("false");
      builder.setDefaultBehaviorProvider(provider);
      PD_LOG_CHANGENUMBER = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_LOG_CHANGENUMBER);
  }



  // Build the "referrals-url" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "referrals-url");
      builder.setOption(PropertyOption.MULTI_VALUED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "referrals-url"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<String>());
      builder.setPattern("^[lL][dD][aA][pP][sS]?://.+$", "LDAP URL");
      PD_REFERRALS_URL = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_REFERRALS_URL);
  }



  // Build the "replication-server" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "replication-server");
      builder.setOption(PropertyOption.MULTI_VALUED);
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "replication-server"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<String>());
      builder.setPattern("^.+:[0-9]+$", "HOST:PORT");
      PD_REPLICATION_SERVER = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_REPLICATION_SERVER);
  }



  // Build the "server-id" property definition.
  static {
      IntegerPropertyDefinition.Builder builder = IntegerPropertyDefinition.createBuilder(INSTANCE, "server-id");
      builder.setOption(PropertyOption.READ_ONLY);
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "server-id"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<Integer>());
      builder.setUpperLimit(65535);
      builder.setLowerLimit(1);
      PD_SERVER_ID = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_SERVER_ID);
  }



  // Build the "solve-conflicts" property definition.
  static {
      BooleanPropertyDefinition.Builder builder = BooleanPropertyDefinition.createBuilder(INSTANCE, "solve-conflicts");
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "solve-conflicts"));
      DefaultBehaviorProvider<Boolean> provider = new DefinedDefaultBehaviorProvider<Boolean>("true");
      builder.setDefaultBehaviorProvider(provider);
      PD_SOLVE_CONFLICTS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_SOLVE_CONFLICTS);
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



  // Build the "external-changelog-domain" relation definition.
  static {
    SingletonRelationDefinition.Builder<ExternalChangelogDomainCfgClient, ExternalChangelogDomainCfg> builder =
      new SingletonRelationDefinition.Builder<ExternalChangelogDomainCfgClient, ExternalChangelogDomainCfg>(INSTANCE, "external-changelog-domain", ExternalChangelogDomainCfgDefn.getInstance());
    RD_EXTERNAL_CHANGELOG_DOMAIN = builder.getInstance();
    INSTANCE.registerRelationDefinition(RD_EXTERNAL_CHANGELOG_DOMAIN);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("replication"));
  }



  /**
   * Get the Replication Domain configuration definition singleton.
   *
   * @return Returns the Replication Domain configuration definition
   *         singleton.
   */
  public static ReplicationDomainCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private ReplicationDomainCfgDefn() {
    super("replication-domain", TopCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public ReplicationDomainCfgClient createClientConfiguration(
      ManagedObject<? extends ReplicationDomainCfgClient> impl) {
    return new ReplicationDomainCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public ReplicationDomainCfg createServerConfiguration(
      ServerManagedObject<? extends ReplicationDomainCfg> impl) {
    return new ReplicationDomainCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<ReplicationDomainCfg> getServerConfigurationClass() {
    return ReplicationDomainCfg.class;
  }



  /**
   * Get the "assured-sd-level" property definition.
   * <p>
   * The level of acknowledgment for Safe Data assured sub mode.
   * <p>
   * When assured replication is configured in Safe Data mode, this
   * value defines the number of replication servers (with the same
   * group ID of the local server) that should acknowledge the sent
   * update before the LDAP client call can return.
   *
   * @return Returns the "assured-sd-level" property definition.
   */
  public IntegerPropertyDefinition getAssuredSdLevelPropertyDefinition() {
    return PD_ASSURED_SD_LEVEL;
  }



  /**
   * Get the "assured-timeout" property definition.
   * <p>
   * The timeout value when waiting for assured replication
   * acknowledgments.
   * <p>
   * Defines the amount of milliseconds the server will wait for
   * assured acknowledgments (in either Safe Data or Safe Read assured
   * replication modes) before returning anyway the LDAP client call.
   *
   * @return Returns the "assured-timeout" property definition.
   */
  public DurationPropertyDefinition getAssuredTimeoutPropertyDefinition() {
    return PD_ASSURED_TIMEOUT;
  }



  /**
   * Get the "assured-type" property definition.
   * <p>
   * Defines the assured replication mode of the replicated domain.
   * <p>
   * The assured replication can be disabled or enabled. When enabled,
   * two modes are available: Safe Data or Safe Read modes.
   *
   * @return Returns the "assured-type" property definition.
   */
  public EnumPropertyDefinition<AssuredType> getAssuredTypePropertyDefinition() {
    return PD_ASSURED_TYPE;
  }



  /**
   * Get the "base-dn" property definition.
   * <p>
   * Specifies the base DN of the replicated data.
   *
   * @return Returns the "base-dn" property definition.
   */
  public DNPropertyDefinition getBaseDNPropertyDefinition() {
    return PD_BASE_DN;
  }



  /**
   * Get the "changetime-heartbeat-interval" property definition.
   * <p>
   * Specifies the heart-beat interval that the Directory Server will
   * use when sending its local change time to the Replication Server.
   * <p>
   * The Directory Server sends a regular heart-beat to the
   * Replication within the specified interval. The heart-beat
   * indicates the change time of the Directory Server to the
   * Replication Server.
   *
   * @return Returns the "changetime-heartbeat-interval" property definition.
   */
  public DurationPropertyDefinition getChangetimeHeartbeatIntervalPropertyDefinition() {
    return PD_CHANGETIME_HEARTBEAT_INTERVAL;
  }



  /**
   * Get the "conflicts-historical-purge-delay" property definition.
   * <p>
   * This delay indicates the time (in minutes) the domain keeps the
   * historical information necessary to solve conflicts.When a change
   * stored in the historical part of the user entry has a date (from
   * its replication ChangeNumber) older than this delay, it is
   * candidate to be purged. The purge is applied on 2 events: modify
   * of the entry, dedicated purge task.
   *
   * @return Returns the "conflicts-historical-purge-delay" property definition.
   */
  public DurationPropertyDefinition getConflictsHistoricalPurgeDelayPropertyDefinition() {
    return PD_CONFLICTS_HISTORICAL_PURGE_DELAY;
  }



  /**
   * Get the "fractional-exclude" property definition.
   * <p>
   * Allows to exclude some attributes to replicate to this server.
   * <p>
   * If fractional-exclude configuration attribute is used, attributes
   * specified in this attribute will be ignored (not
   * added/modified/deleted) when an operation performed from another
   * directory server is being replayed in the local server. Note that
   * the usage of this configuration attribute is mutually exclusive
   * with the usage of the fractional-include attribute.
   *
   * @return Returns the "fractional-exclude" property definition.
   */
  public StringPropertyDefinition getFractionalExcludePropertyDefinition() {
    return PD_FRACTIONAL_EXCLUDE;
  }



  /**
   * Get the "fractional-include" property definition.
   * <p>
   * Allows to include some attributes to replicate to this server.
   * <p>
   * If fractional-include configuration attribute is used, only
   * attributes specified in this attribute will be
   * added/modified/deleted when an operation performed from another
   * directory server is being replayed in the local server. Note that
   * the usage of this configuration attribute is mutually exclusive
   * with the usage of the fractional-exclude attribute.
   *
   * @return Returns the "fractional-include" property definition.
   */
  public StringPropertyDefinition getFractionalIncludePropertyDefinition() {
    return PD_FRACTIONAL_INCLUDE;
  }



  /**
   * Get the "group-id" property definition.
   * <p>
   * The group ID associated with this replicated domain.
   * <p>
   * This value defines the group ID of the replicated domain. The
   * replication system will preferably connect and send updates to
   * replicate to a replication server with the same group ID as its
   * own one (the local server group ID).
   *
   * @return Returns the "group-id" property definition.
   */
  public IntegerPropertyDefinition getGroupIdPropertyDefinition() {
    return PD_GROUP_ID;
  }



  /**
   * Get the "heartbeat-interval" property definition.
   * <p>
   * Specifies the heart-beat interval that the Directory Server will
   * use when communicating with Replication Servers.
   * <p>
   * The Directory Server expects a regular heart-beat coming from the
   * Replication Server within the specified interval. If a heartbeat
   * is not received within the interval, the Directory Server closes
   * its connection and connects to another Replication Server.
   *
   * @return Returns the "heartbeat-interval" property definition.
   */
  public DurationPropertyDefinition getHeartbeatIntervalPropertyDefinition() {
    return PD_HEARTBEAT_INTERVAL;
  }



  /**
   * Get the "initialization-window-size" property definition.
   * <p>
   * Specifies the window size that this Directory Server may use when
   * communicating with remote Directory Servers for initialization.
   *
   * @return Returns the "initialization-window-size" property definition.
   */
  public IntegerPropertyDefinition getInitializationWindowSizePropertyDefinition() {
    return PD_INITIALIZATION_WINDOW_SIZE;
  }



  /**
   * Get the "isolation-policy" property definition.
   * <p>
   * Specifies the behavior of the Directory Server if a write
   * operation is attempted on the data within the Replication Domain
   * when none of the configured Replication Servers are available.
   *
   * @return Returns the "isolation-policy" property definition.
   */
  public EnumPropertyDefinition<IsolationPolicy> getIsolationPolicyPropertyDefinition() {
    return PD_ISOLATION_POLICY;
  }



  /**
   * Get the "log-changenumber" property definition.
   * <p>
   * Indicates if this server logs the ChangeNumber in access log.
   * <p>
   * This boolean indicates if the domain should log the ChangeNumber
   * of replicated operations in the access log.
   *
   * @return Returns the "log-changenumber" property definition.
   */
  public BooleanPropertyDefinition getLogChangenumberPropertyDefinition() {
    return PD_LOG_CHANGENUMBER;
  }



  /**
   * Get the "referrals-url" property definition.
   * <p>
   * The URLs other LDAP servers should use to refer to the local
   * server.
   * <p>
   * URLs used by peer servers in the topology to refer to the local
   * server through LDAP referrals. If this attribute is not defined,
   * every URLs available to access this server will be used. If
   * defined, only URLs specified here will be used.
   *
   * @return Returns the "referrals-url" property definition.
   */
  public StringPropertyDefinition getReferralsUrlPropertyDefinition() {
    return PD_REFERRALS_URL;
  }



  /**
   * Get the "replication-server" property definition.
   * <p>
   * Specifies the addresses of the Replication Servers within the
   * Replication Domain to which the Directory Server should try to
   * connect at startup time.
   * <p>
   * Addresses must be specified using the syntax: hostname:port
   *
   * @return Returns the "replication-server" property definition.
   */
  public StringPropertyDefinition getReplicationServerPropertyDefinition() {
    return PD_REPLICATION_SERVER;
  }



  /**
   * Get the "server-id" property definition.
   * <p>
   * Specifies a unique identifier for the Directory Server within the
   * Replication Domain.
   * <p>
   * Each Directory Server within the same Replication Domain must
   * have a different server ID. A Directory Server which is a member
   * of multiple Replication Domains may use the same server ID for
   * each of its Replication Domain configurations.
   *
   * @return Returns the "server-id" property definition.
   */
  public IntegerPropertyDefinition getServerIdPropertyDefinition() {
    return PD_SERVER_ID;
  }



  /**
   * Get the "solve-conflicts" property definition.
   * <p>
   * Indicates if this server solves conflict.
   * <p>
   * This boolean indicates if this domain keeps the historical
   * information necessary to solve conflicts. When set to false the
   * server will not maintain historical information and will therefore
   * not be able to solve conflict. This should therefore be done only
   * if the replication is used in a single master type of deployment.
   *
   * @return Returns the "solve-conflicts" property definition.
   */
  public BooleanPropertyDefinition getSolveConflictsPropertyDefinition() {
    return PD_SOLVE_CONFLICTS;
  }



  /**
   * Get the "window-size" property definition.
   * <p>
   * Specifies the window size that the Directory Server will use when
   * communicating with Replication Servers.
   *
   * @return Returns the "window-size" property definition.
   */
  public IntegerPropertyDefinition getWindowSizePropertyDefinition() {
    return PD_WINDOW_SIZE;
  }



  /**
   * Get the "external-changelog-domain" relation definition.
   *
   * @return Returns the "external-changelog-domain" relation definition.
   */
  public SingletonRelationDefinition<ExternalChangelogDomainCfgClient,ExternalChangelogDomainCfg> getExternalChangelogDomainRelationDefinition() {
    return RD_EXTERNAL_CHANGELOG_DOMAIN;
  }



  /**
   * Managed object client implementation.
   */
  private static class ReplicationDomainCfgClientImpl implements
    ReplicationDomainCfgClient {

    // Private implementation.
    private ManagedObject<? extends ReplicationDomainCfgClient> impl;



    // Private constructor.
    private ReplicationDomainCfgClientImpl(
        ManagedObject<? extends ReplicationDomainCfgClient> impl) {
      this.impl = impl;
    }



    /**
     * {@inheritDoc}
     */
    public int getAssuredSdLevel() {
      return impl.getPropertyValue(INSTANCE.getAssuredSdLevelPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setAssuredSdLevel(Integer value) {
      impl.setPropertyValue(INSTANCE.getAssuredSdLevelPropertyDefinition(), value);
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
    public AssuredType getAssuredType() {
      return impl.getPropertyValue(INSTANCE.getAssuredTypePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setAssuredType(AssuredType value) {
      impl.setPropertyValue(INSTANCE.getAssuredTypePropertyDefinition(), value);
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
    public long getChangetimeHeartbeatInterval() {
      return impl.getPropertyValue(INSTANCE.getChangetimeHeartbeatIntervalPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setChangetimeHeartbeatInterval(Long value) {
      impl.setPropertyValue(INSTANCE.getChangetimeHeartbeatIntervalPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public long getConflictsHistoricalPurgeDelay() {
      return impl.getPropertyValue(INSTANCE.getConflictsHistoricalPurgeDelayPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setConflictsHistoricalPurgeDelay(Long value) {
      impl.setPropertyValue(INSTANCE.getConflictsHistoricalPurgeDelayPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<String> getFractionalExclude() {
      return impl.getPropertyValues(INSTANCE.getFractionalExcludePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setFractionalExclude(Collection<String> values) {
      impl.setPropertyValues(INSTANCE.getFractionalExcludePropertyDefinition(), values);
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<String> getFractionalInclude() {
      return impl.getPropertyValues(INSTANCE.getFractionalIncludePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setFractionalInclude(Collection<String> values) {
      impl.setPropertyValues(INSTANCE.getFractionalIncludePropertyDefinition(), values);
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
    public long getHeartbeatInterval() {
      return impl.getPropertyValue(INSTANCE.getHeartbeatIntervalPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setHeartbeatInterval(Long value) {
      impl.setPropertyValue(INSTANCE.getHeartbeatIntervalPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public int getInitializationWindowSize() {
      return impl.getPropertyValue(INSTANCE.getInitializationWindowSizePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setInitializationWindowSize(Integer value) {
      impl.setPropertyValue(INSTANCE.getInitializationWindowSizePropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public IsolationPolicy getIsolationPolicy() {
      return impl.getPropertyValue(INSTANCE.getIsolationPolicyPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setIsolationPolicy(IsolationPolicy value) {
      impl.setPropertyValue(INSTANCE.getIsolationPolicyPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public boolean isLogChangenumber() {
      return impl.getPropertyValue(INSTANCE.getLogChangenumberPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setLogChangenumber(Boolean value) {
      impl.setPropertyValue(INSTANCE.getLogChangenumberPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<String> getReferralsUrl() {
      return impl.getPropertyValues(INSTANCE.getReferralsUrlPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setReferralsUrl(Collection<String> values) {
      impl.setPropertyValues(INSTANCE.getReferralsUrlPropertyDefinition(), values);
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
    public Integer getServerId() {
      return impl.getPropertyValue(INSTANCE.getServerIdPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setServerId(int value) throws PropertyIsReadOnlyException {
      impl.setPropertyValue(INSTANCE.getServerIdPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public boolean isSolveConflicts() {
      return impl.getPropertyValue(INSTANCE.getSolveConflictsPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setSolveConflicts(Boolean value) {
      impl.setPropertyValue(INSTANCE.getSolveConflictsPropertyDefinition(), value);
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
    public ExternalChangelogDomainCfgClient getExternalChangelogDomain()
        throws DefinitionDecodingException, ManagedObjectDecodingException,
        ManagedObjectNotFoundException, ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.getChild(INSTANCE.getExternalChangelogDomainRelationDefinition()).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public ManagedObjectDefinition<? extends ReplicationDomainCfgClient, ? extends ReplicationDomainCfg> definition() {
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
  private static class ReplicationDomainCfgServerImpl implements
    ReplicationDomainCfg {

    // Private implementation.
    private ServerManagedObject<? extends ReplicationDomainCfg> impl;

    // The value of the "assured-sd-level" property.
    private final int pAssuredSdLevel;

    // The value of the "assured-timeout" property.
    private final long pAssuredTimeout;

    // The value of the "assured-type" property.
    private final AssuredType pAssuredType;

    // The value of the "base-dn" property.
    private final DN pBaseDN;

    // The value of the "changetime-heartbeat-interval" property.
    private final long pChangetimeHeartbeatInterval;

    // The value of the "conflicts-historical-purge-delay" property.
    private final long pConflictsHistoricalPurgeDelay;

    // The value of the "fractional-exclude" property.
    private final SortedSet<String> pFractionalExclude;

    // The value of the "fractional-include" property.
    private final SortedSet<String> pFractionalInclude;

    // The value of the "group-id" property.
    private final int pGroupId;

    // The value of the "heartbeat-interval" property.
    private final long pHeartbeatInterval;

    // The value of the "initialization-window-size" property.
    private final int pInitializationWindowSize;

    // The value of the "isolation-policy" property.
    private final IsolationPolicy pIsolationPolicy;

    // The value of the "log-changenumber" property.
    private final boolean pLogChangenumber;

    // The value of the "referrals-url" property.
    private final SortedSet<String> pReferralsUrl;

    // The value of the "replication-server" property.
    private final SortedSet<String> pReplicationServer;

    // The value of the "server-id" property.
    private final int pServerId;

    // The value of the "solve-conflicts" property.
    private final boolean pSolveConflicts;

    // The value of the "window-size" property.
    private final int pWindowSize;



    // Private constructor.
    private ReplicationDomainCfgServerImpl(ServerManagedObject<? extends ReplicationDomainCfg> impl) {
      this.impl = impl;
      this.pAssuredSdLevel = impl.getPropertyValue(INSTANCE.getAssuredSdLevelPropertyDefinition());
      this.pAssuredTimeout = impl.getPropertyValue(INSTANCE.getAssuredTimeoutPropertyDefinition());
      this.pAssuredType = impl.getPropertyValue(INSTANCE.getAssuredTypePropertyDefinition());
      this.pBaseDN = impl.getPropertyValue(INSTANCE.getBaseDNPropertyDefinition());
      this.pChangetimeHeartbeatInterval = impl.getPropertyValue(INSTANCE.getChangetimeHeartbeatIntervalPropertyDefinition());
      this.pConflictsHistoricalPurgeDelay = impl.getPropertyValue(INSTANCE.getConflictsHistoricalPurgeDelayPropertyDefinition());
      this.pFractionalExclude = impl.getPropertyValues(INSTANCE.getFractionalExcludePropertyDefinition());
      this.pFractionalInclude = impl.getPropertyValues(INSTANCE.getFractionalIncludePropertyDefinition());
      this.pGroupId = impl.getPropertyValue(INSTANCE.getGroupIdPropertyDefinition());
      this.pHeartbeatInterval = impl.getPropertyValue(INSTANCE.getHeartbeatIntervalPropertyDefinition());
      this.pInitializationWindowSize = impl.getPropertyValue(INSTANCE.getInitializationWindowSizePropertyDefinition());
      this.pIsolationPolicy = impl.getPropertyValue(INSTANCE.getIsolationPolicyPropertyDefinition());
      this.pLogChangenumber = impl.getPropertyValue(INSTANCE.getLogChangenumberPropertyDefinition());
      this.pReferralsUrl = impl.getPropertyValues(INSTANCE.getReferralsUrlPropertyDefinition());
      this.pReplicationServer = impl.getPropertyValues(INSTANCE.getReplicationServerPropertyDefinition());
      this.pServerId = impl.getPropertyValue(INSTANCE.getServerIdPropertyDefinition());
      this.pSolveConflicts = impl.getPropertyValue(INSTANCE.getSolveConflictsPropertyDefinition());
      this.pWindowSize = impl.getPropertyValue(INSTANCE.getWindowSizePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addChangeListener(
        ConfigurationChangeListener<ReplicationDomainCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeChangeListener(
        ConfigurationChangeListener<ReplicationDomainCfg> listener) {
      impl.deregisterChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public int getAssuredSdLevel() {
      return pAssuredSdLevel;
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
    public AssuredType getAssuredType() {
      return pAssuredType;
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
    public long getChangetimeHeartbeatInterval() {
      return pChangetimeHeartbeatInterval;
    }



    /**
     * {@inheritDoc}
     */
    public long getConflictsHistoricalPurgeDelay() {
      return pConflictsHistoricalPurgeDelay;
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<String> getFractionalExclude() {
      return pFractionalExclude;
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<String> getFractionalInclude() {
      return pFractionalInclude;
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
    public long getHeartbeatInterval() {
      return pHeartbeatInterval;
    }



    /**
     * {@inheritDoc}
     */
    public int getInitializationWindowSize() {
      return pInitializationWindowSize;
    }



    /**
     * {@inheritDoc}
     */
    public IsolationPolicy getIsolationPolicy() {
      return pIsolationPolicy;
    }



    /**
     * {@inheritDoc}
     */
    public boolean isLogChangenumber() {
      return pLogChangenumber;
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<String> getReferralsUrl() {
      return pReferralsUrl;
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
    public int getServerId() {
      return pServerId;
    }



    /**
     * {@inheritDoc}
     */
    public boolean isSolveConflicts() {
      return pSolveConflicts;
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
    public ExternalChangelogDomainCfg getExternalChangelogDomain() throws ConfigException {
      return impl.getChild(INSTANCE.getExternalChangelogDomainRelationDefinition()).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public Class<? extends ReplicationDomainCfg> configurationClass() {
      return ReplicationDomainCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
