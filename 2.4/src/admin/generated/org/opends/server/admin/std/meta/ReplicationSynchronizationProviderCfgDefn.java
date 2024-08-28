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
import org.opends.server.admin.AdministratorAction;
import org.opends.server.admin.BooleanPropertyDefinition;
import org.opends.server.admin.ClassPropertyDefinition;
import org.opends.server.admin.client.AuthorizationException;
import org.opends.server.admin.client.CommunicationException;
import org.opends.server.admin.client.ConcurrentModificationException;
import org.opends.server.admin.client.IllegalManagedObjectNameException;
import org.opends.server.admin.client.ManagedObject;
import org.opends.server.admin.client.ManagedObjectDecodingException;
import org.opends.server.admin.client.MissingMandatoryPropertiesException;
import org.opends.server.admin.client.OperationRejectedException;
import org.opends.server.admin.DefaultBehaviorException;
import org.opends.server.admin.DefaultBehaviorProvider;
import org.opends.server.admin.DefinedDefaultBehaviorProvider;
import org.opends.server.admin.DefinitionDecodingException;
import org.opends.server.admin.InstantiableRelationDefinition;
import org.opends.server.admin.IntegerPropertyDefinition;
import org.opends.server.admin.ManagedObjectAlreadyExistsException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.ManagedObjectNotFoundException;
import org.opends.server.admin.OptionalRelationDefinition;
import org.opends.server.admin.PropertyOption;
import org.opends.server.admin.PropertyProvider;
import org.opends.server.admin.server.ConfigurationAddListener;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.server.ConfigurationDeleteListener;
import org.opends.server.admin.server.ServerManagedObject;
import org.opends.server.admin.std.client.ReplicationDomainCfgClient;
import org.opends.server.admin.std.client.ReplicationServerCfgClient;
import org.opends.server.admin.std.client.ReplicationSynchronizationProviderCfgClient;
import org.opends.server.admin.std.server.ReplicationDomainCfg;
import org.opends.server.admin.std.server.ReplicationServerCfg;
import org.opends.server.admin.std.server.ReplicationSynchronizationProviderCfg;
import org.opends.server.admin.std.server.SynchronizationProviderCfg;
import org.opends.server.admin.Tag;
import org.opends.server.config.ConfigException;
import org.opends.server.types.DN;



/**
 * An interface for querying the Replication Synchronization Provider
 * managed object definition meta information.
 * <p>
 * The Replication Synchronization Provider provides multi-master
 * replication of data across multiple Directory Server instances.
 */
public final class ReplicationSynchronizationProviderCfgDefn extends ManagedObjectDefinition<ReplicationSynchronizationProviderCfgClient, ReplicationSynchronizationProviderCfg> {

  // The singleton configuration definition instance.
  private static final ReplicationSynchronizationProviderCfgDefn INSTANCE = new ReplicationSynchronizationProviderCfgDefn();



  // The "java-class" property definition.
  private static final ClassPropertyDefinition PD_JAVA_CLASS;



  // The "num-update-replay-threads" property definition.
  private static final IntegerPropertyDefinition PD_NUM_UPDATE_REPLAY_THREADS;



  // The "replication-domains" relation definition.
  private static final InstantiableRelationDefinition<ReplicationDomainCfgClient, ReplicationDomainCfg> RD_REPLICATION_DOMAINS;



  // The "replication-server" relation definition.
  private static final OptionalRelationDefinition<ReplicationServerCfgClient, ReplicationServerCfg> RD_REPLICATION_SERVER;



  // Build the "java-class" property definition.
  static {
      ClassPropertyDefinition.Builder builder = ClassPropertyDefinition.createBuilder(INSTANCE, "java-class");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "java-class"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("org.opends.server.replication.plugin.MultimasterReplication");
      builder.setDefaultBehaviorProvider(provider);
      builder.addInstanceOf("org.opends.server.api.SynchronizationProvider");
      PD_JAVA_CLASS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_JAVA_CLASS);
  }



  // Build the "num-update-replay-threads" property definition.
  static {
      IntegerPropertyDefinition.Builder builder = IntegerPropertyDefinition.createBuilder(INSTANCE, "num-update-replay-threads");
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "num-update-replay-threads"));
      DefaultBehaviorProvider<Integer> provider = new DefinedDefaultBehaviorProvider<Integer>("10");
      builder.setDefaultBehaviorProvider(provider);
      builder.setUpperLimit(65535);
      builder.setLowerLimit(1);
      PD_NUM_UPDATE_REPLAY_THREADS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_NUM_UPDATE_REPLAY_THREADS);
  }



  // Build the "replication-domains" relation definition.
  static {
    InstantiableRelationDefinition.Builder<ReplicationDomainCfgClient, ReplicationDomainCfg> builder =
      new InstantiableRelationDefinition.Builder<ReplicationDomainCfgClient, ReplicationDomainCfg>(INSTANCE, "replication-domain", "replication-domains", ReplicationDomainCfgDefn.getInstance());
    RD_REPLICATION_DOMAINS = builder.getInstance();
    INSTANCE.registerRelationDefinition(RD_REPLICATION_DOMAINS);
  }



  // Build the "replication-server" relation definition.
  static {
    OptionalRelationDefinition.Builder<ReplicationServerCfgClient, ReplicationServerCfg> builder =
      new OptionalRelationDefinition.Builder<ReplicationServerCfgClient, ReplicationServerCfg>(INSTANCE, "replication-server", ReplicationServerCfgDefn.getInstance());
    RD_REPLICATION_SERVER = builder.getInstance();
    INSTANCE.registerRelationDefinition(RD_REPLICATION_SERVER);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("replication"));
  }



  /**
   * Get the Replication Synchronization Provider configuration
   * definition singleton.
   *
   * @return Returns the Replication Synchronization Provider
   *         configuration definition singleton.
   */
  public static ReplicationSynchronizationProviderCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private ReplicationSynchronizationProviderCfgDefn() {
    super("replication-synchronization-provider", SynchronizationProviderCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public ReplicationSynchronizationProviderCfgClient createClientConfiguration(
      ManagedObject<? extends ReplicationSynchronizationProviderCfgClient> impl) {
    return new ReplicationSynchronizationProviderCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public ReplicationSynchronizationProviderCfg createServerConfiguration(
      ServerManagedObject<? extends ReplicationSynchronizationProviderCfg> impl) {
    return new ReplicationSynchronizationProviderCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<ReplicationSynchronizationProviderCfg> getServerConfigurationClass() {
    return ReplicationSynchronizationProviderCfg.class;
  }



  /**
   * Get the "enabled" property definition.
   * <p>
   * Indicates whether the Replication Synchronization Provider is
   * enabled for use.
   *
   * @return Returns the "enabled" property definition.
   */
  public BooleanPropertyDefinition getEnabledPropertyDefinition() {
    return SynchronizationProviderCfgDefn.getInstance().getEnabledPropertyDefinition();
  }



  /**
   * Get the "java-class" property definition.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Replication Synchronization Provider implementation.
   *
   * @return Returns the "java-class" property definition.
   */
  public ClassPropertyDefinition getJavaClassPropertyDefinition() {
    return PD_JAVA_CLASS;
  }



  /**
   * Get the "num-update-replay-threads" property definition.
   * <p>
   * Specifies the number of update replay threads.
   * <p>
   * This value is the number of threads created for replaying every
   * updates received for all the replication domains.
   *
   * @return Returns the "num-update-replay-threads" property definition.
   */
  public IntegerPropertyDefinition getNumUpdateReplayThreadsPropertyDefinition() {
    return PD_NUM_UPDATE_REPLAY_THREADS;
  }



  /**
   * Get the "replication-domains" relation definition.
   *
   * @return Returns the "replication-domains" relation definition.
   */
  public InstantiableRelationDefinition<ReplicationDomainCfgClient,ReplicationDomainCfg> getReplicationDomainsRelationDefinition() {
    return RD_REPLICATION_DOMAINS;
  }



  /**
   * Get the "replication-server" relation definition.
   *
   * @return Returns the "replication-server" relation definition.
   */
  public OptionalRelationDefinition<ReplicationServerCfgClient,ReplicationServerCfg> getReplicationServerRelationDefinition() {
    return RD_REPLICATION_SERVER;
  }



  /**
   * Managed object client implementation.
   */
  private static class ReplicationSynchronizationProviderCfgClientImpl implements
    ReplicationSynchronizationProviderCfgClient {

    // Private implementation.
    private ManagedObject<? extends ReplicationSynchronizationProviderCfgClient> impl;



    // Private constructor.
    private ReplicationSynchronizationProviderCfgClientImpl(
        ManagedObject<? extends ReplicationSynchronizationProviderCfgClient> impl) {
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
    public int getNumUpdateReplayThreads() {
      return impl.getPropertyValue(INSTANCE.getNumUpdateReplayThreadsPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setNumUpdateReplayThreads(Integer value) {
      impl.setPropertyValue(INSTANCE.getNumUpdateReplayThreadsPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listReplicationDomains() throws ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.listChildren(INSTANCE.getReplicationDomainsRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public ReplicationDomainCfgClient getReplicationDomain(String name)
        throws DefinitionDecodingException, ManagedObjectDecodingException,
        ManagedObjectNotFoundException, ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.getChild(INSTANCE.getReplicationDomainsRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public <M extends ReplicationDomainCfgClient> M createReplicationDomain(
        ManagedObjectDefinition<M, ? extends ReplicationDomainCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException {
      return impl.createChild(INSTANCE.getReplicationDomainsRelationDefinition(), d, name, exceptions).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void removeReplicationDomain(String name)
        throws ManagedObjectNotFoundException, ConcurrentModificationException,
        OperationRejectedException, AuthorizationException, CommunicationException {
      impl.removeChild(INSTANCE.getReplicationDomainsRelationDefinition(), name);
    }



    /**
     * {@inheritDoc}
     */
    public boolean hasReplicationServer() throws ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.hasChild(INSTANCE.getReplicationServerRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public ReplicationServerCfgClient getReplicationServer()
        throws DefinitionDecodingException, ManagedObjectDecodingException,
        ManagedObjectNotFoundException, ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.getChild(INSTANCE.getReplicationServerRelationDefinition()).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public <M extends ReplicationServerCfgClient> M createReplicationServer(
        ManagedObjectDefinition<M, ? extends ReplicationServerCfg> d, Collection<DefaultBehaviorException> exceptions) {
      return impl.createChild(INSTANCE.getReplicationServerRelationDefinition(), d, exceptions).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void removeReplicationServer()
        throws ManagedObjectNotFoundException, ConcurrentModificationException,
        OperationRejectedException, AuthorizationException, CommunicationException {
      impl.removeChild(INSTANCE.getReplicationServerRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public ManagedObjectDefinition<? extends ReplicationSynchronizationProviderCfgClient, ? extends ReplicationSynchronizationProviderCfg> definition() {
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
  private static class ReplicationSynchronizationProviderCfgServerImpl implements
    ReplicationSynchronizationProviderCfg {

    // Private implementation.
    private ServerManagedObject<? extends ReplicationSynchronizationProviderCfg> impl;

    // The value of the "enabled" property.
    private final boolean pEnabled;

    // The value of the "java-class" property.
    private final String pJavaClass;

    // The value of the "num-update-replay-threads" property.
    private final int pNumUpdateReplayThreads;



    // Private constructor.
    private ReplicationSynchronizationProviderCfgServerImpl(ServerManagedObject<? extends ReplicationSynchronizationProviderCfg> impl) {
      this.impl = impl;
      this.pEnabled = impl.getPropertyValue(INSTANCE.getEnabledPropertyDefinition());
      this.pJavaClass = impl.getPropertyValue(INSTANCE.getJavaClassPropertyDefinition());
      this.pNumUpdateReplayThreads = impl.getPropertyValue(INSTANCE.getNumUpdateReplayThreadsPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addReplicationChangeListener(
        ConfigurationChangeListener<ReplicationSynchronizationProviderCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeReplicationChangeListener(
        ConfigurationChangeListener<ReplicationSynchronizationProviderCfg> listener) {
      impl.deregisterChangeListener(listener);
    }
    /**
     * {@inheritDoc}
     */
    public void addChangeListener(
        ConfigurationChangeListener<SynchronizationProviderCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeChangeListener(
        ConfigurationChangeListener<SynchronizationProviderCfg> listener) {
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
    public int getNumUpdateReplayThreads() {
      return pNumUpdateReplayThreads;
    }



    /**
     * {@inheritDoc}
     */
    public String[] listReplicationDomains() {
      return impl.listChildren(INSTANCE.getReplicationDomainsRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public ReplicationDomainCfg getReplicationDomain(String name) throws ConfigException {
      return impl.getChild(INSTANCE.getReplicationDomainsRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void addReplicationDomainAddListener(
        ConfigurationAddListener<ReplicationDomainCfg> listener) throws ConfigException {
      impl.registerAddListener(INSTANCE.getReplicationDomainsRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeReplicationDomainAddListener(
        ConfigurationAddListener<ReplicationDomainCfg> listener) {
      impl.deregisterAddListener(INSTANCE.getReplicationDomainsRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void addReplicationDomainDeleteListener(
        ConfigurationDeleteListener<ReplicationDomainCfg> listener) throws ConfigException {
      impl.registerDeleteListener(INSTANCE.getReplicationDomainsRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeReplicationDomainDeleteListener(
        ConfigurationDeleteListener<ReplicationDomainCfg> listener) {
      impl.deregisterDeleteListener(INSTANCE.getReplicationDomainsRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public boolean hasReplicationServer() {
      return impl.hasChild(INSTANCE.getReplicationServerRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public ReplicationServerCfg getReplicationServer() throws ConfigException {
      return impl.getChild(INSTANCE.getReplicationServerRelationDefinition()).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void addReplicationServerAddListener(
        ConfigurationAddListener<ReplicationServerCfg> listener) throws ConfigException {
      impl.registerAddListener(INSTANCE.getReplicationServerRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeReplicationServerAddListener(
        ConfigurationAddListener<ReplicationServerCfg> listener) {
      impl.deregisterAddListener(INSTANCE.getReplicationServerRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void addReplicationServerDeleteListener(
        ConfigurationDeleteListener<ReplicationServerCfg> listener) throws ConfigException {
      impl.registerDeleteListener(INSTANCE.getReplicationServerRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeReplicationServerDeleteListener(
        ConfigurationDeleteListener<ReplicationServerCfg> listener) {
      impl.deregisterDeleteListener(INSTANCE.getReplicationServerRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public Class<? extends ReplicationSynchronizationProviderCfg> configurationClass() {
      return ReplicationSynchronizationProviderCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
