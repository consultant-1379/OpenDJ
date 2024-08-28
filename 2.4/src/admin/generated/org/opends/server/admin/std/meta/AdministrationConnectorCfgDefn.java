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



import java.net.InetAddress;
import java.util.Collection;
import java.util.SortedSet;
import org.opends.server.admin.AdministratorAction;
import org.opends.server.admin.AggregationPropertyDefinition;
import org.opends.server.admin.AliasDefaultBehaviorProvider;
import org.opends.server.admin.client.AuthorizationException;
import org.opends.server.admin.client.CommunicationException;
import org.opends.server.admin.client.ConcurrentModificationException;
import org.opends.server.admin.client.ManagedObject;
import org.opends.server.admin.client.MissingMandatoryPropertiesException;
import org.opends.server.admin.client.OperationRejectedException;
import org.opends.server.admin.condition.Conditions;
import org.opends.server.admin.DefaultBehaviorProvider;
import org.opends.server.admin.DefinedDefaultBehaviorProvider;
import org.opends.server.admin.IntegerPropertyDefinition;
import org.opends.server.admin.IPAddressPropertyDefinition;
import org.opends.server.admin.ManagedObjectAlreadyExistsException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.PropertyOption;
import org.opends.server.admin.PropertyProvider;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.server.ServerManagedObject;
import org.opends.server.admin.std.client.AdministrationConnectorCfgClient;
import org.opends.server.admin.std.client.KeyManagerProviderCfgClient;
import org.opends.server.admin.std.client.TrustManagerProviderCfgClient;
import org.opends.server.admin.std.server.AdministrationConnectorCfg;
import org.opends.server.admin.std.server.KeyManagerProviderCfg;
import org.opends.server.admin.std.server.TrustManagerProviderCfg;
import org.opends.server.admin.StringPropertyDefinition;
import org.opends.server.admin.Tag;
import org.opends.server.admin.TopCfgDefn;
import org.opends.server.admin.UndefinedDefaultBehaviorProvider;
import org.opends.server.types.DN;



/**
 * An interface for querying the Administration Connector managed
 * object definition meta information.
 * <p>
 * The Administration Connector is used to interact with
 * administration tools using LDAP.
 */
public final class AdministrationConnectorCfgDefn extends ManagedObjectDefinition<AdministrationConnectorCfgClient, AdministrationConnectorCfg> {

  // The singleton configuration definition instance.
  private static final AdministrationConnectorCfgDefn INSTANCE = new AdministrationConnectorCfgDefn();



  // The "key-manager-provider" property definition.
  private static final AggregationPropertyDefinition<KeyManagerProviderCfgClient, KeyManagerProviderCfg> PD_KEY_MANAGER_PROVIDER;



  // The "listen-address" property definition.
  private static final IPAddressPropertyDefinition PD_LISTEN_ADDRESS;



  // The "listen-port" property definition.
  private static final IntegerPropertyDefinition PD_LISTEN_PORT;



  // The "ssl-cert-nickname" property definition.
  private static final StringPropertyDefinition PD_SSL_CERT_NICKNAME;



  // The "trust-manager-provider" property definition.
  private static final AggregationPropertyDefinition<TrustManagerProviderCfgClient, TrustManagerProviderCfg> PD_TRUST_MANAGER_PROVIDER;



  // Build the "key-manager-provider" property definition.
  static {
      AggregationPropertyDefinition.Builder<KeyManagerProviderCfgClient, KeyManagerProviderCfg> builder = AggregationPropertyDefinition.createBuilder(INSTANCE, "key-manager-provider");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.SERVER_RESTART, INSTANCE, "key-manager-provider"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<String>());
      builder.setParentPath("/");
      builder.setRelationDefinition("key-manager-provider");
      builder.setTargetIsEnabledCondition(Conditions.contains("enabled", "true"));
      PD_KEY_MANAGER_PROVIDER = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_KEY_MANAGER_PROVIDER);
      INSTANCE.registerConstraint(PD_KEY_MANAGER_PROVIDER.getSourceConstraint());
  }



  // Build the "listen-address" property definition.
  static {
      IPAddressPropertyDefinition.Builder builder = IPAddressPropertyDefinition.createBuilder(INSTANCE, "listen-address");
      builder.setOption(PropertyOption.MULTI_VALUED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.SERVER_RESTART, INSTANCE, "listen-address"));
      DefaultBehaviorProvider<InetAddress> provider = new DefinedDefaultBehaviorProvider<InetAddress>("0.0.0.0");
      builder.setDefaultBehaviorProvider(provider);
      PD_LISTEN_ADDRESS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_LISTEN_ADDRESS);
  }



  // Build the "listen-port" property definition.
  static {
      IntegerPropertyDefinition.Builder builder = IntegerPropertyDefinition.createBuilder(INSTANCE, "listen-port");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.COMPONENT_RESTART, INSTANCE, "listen-port"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<Integer>());
      builder.setUpperLimit(65535);
      builder.setLowerLimit(1);
      PD_LISTEN_PORT = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_LISTEN_PORT);
  }



  // Build the "ssl-cert-nickname" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "ssl-cert-nickname");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.SERVER_RESTART, INSTANCE, "ssl-cert-nickname"));
      builder.setDefaultBehaviorProvider(new AliasDefaultBehaviorProvider<String>(INSTANCE, "ssl-cert-nickname"));
      PD_SSL_CERT_NICKNAME = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_SSL_CERT_NICKNAME);
  }



  // Build the "trust-manager-provider" property definition.
  static {
      AggregationPropertyDefinition.Builder<TrustManagerProviderCfgClient, TrustManagerProviderCfg> builder = AggregationPropertyDefinition.createBuilder(INSTANCE, "trust-manager-provider");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.SERVER_RESTART, INSTANCE, "trust-manager-provider"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<String>());
      builder.setParentPath("/");
      builder.setRelationDefinition("trust-manager-provider");
      builder.setTargetIsEnabledCondition(Conditions.contains("enabled", "true"));
      PD_TRUST_MANAGER_PROVIDER = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_TRUST_MANAGER_PROVIDER);
      INSTANCE.registerConstraint(PD_TRUST_MANAGER_PROVIDER.getSourceConstraint());
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("core-server"));
  }



  /**
   * Get the Administration Connector configuration definition
   * singleton.
   *
   * @return Returns the Administration Connector configuration
   *         definition singleton.
   */
  public static AdministrationConnectorCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private AdministrationConnectorCfgDefn() {
    super("administration-connector", TopCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public AdministrationConnectorCfgClient createClientConfiguration(
      ManagedObject<? extends AdministrationConnectorCfgClient> impl) {
    return new AdministrationConnectorCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public AdministrationConnectorCfg createServerConfiguration(
      ServerManagedObject<? extends AdministrationConnectorCfg> impl) {
    return new AdministrationConnectorCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<AdministrationConnectorCfg> getServerConfigurationClass() {
    return AdministrationConnectorCfg.class;
  }



  /**
   * Get the "key-manager-provider" property definition.
   * <p>
   * Specifies the name of the key manager that is used with the
   * Administration Connector .
   *
   * @return Returns the "key-manager-provider" property definition.
   */
  public AggregationPropertyDefinition<KeyManagerProviderCfgClient, KeyManagerProviderCfg> getKeyManagerProviderPropertyDefinition() {
    return PD_KEY_MANAGER_PROVIDER;
  }



  /**
   * Get the "listen-address" property definition.
   * <p>
   * Specifies the address or set of addresses on which this
   * Administration Connector should listen for connections from LDAP
   * clients.
   * <p>
   * Multiple addresses may be provided as separate values for this
   * attribute. If no values are provided, then the Administration
   * Connector listens on all interfaces.
   *
   * @return Returns the "listen-address" property definition.
   */
  public IPAddressPropertyDefinition getListenAddressPropertyDefinition() {
    return PD_LISTEN_ADDRESS;
  }



  /**
   * Get the "listen-port" property definition.
   * <p>
   * Specifies the port number on which the Administration Connector
   * will listen for connections from clients.
   * <p>
   * Only a single port number may be provided.
   *
   * @return Returns the "listen-port" property definition.
   */
  public IntegerPropertyDefinition getListenPortPropertyDefinition() {
    return PD_LISTEN_PORT;
  }



  /**
   * Get the "ssl-cert-nickname" property definition.
   * <p>
   * Specifies the nickname (also called the alias) of the certificate
   * that the Administration Connector will use when performing SSL
   * communication.
   *
   * @return Returns the "ssl-cert-nickname" property definition.
   */
  public StringPropertyDefinition getSSLCertNicknamePropertyDefinition() {
    return PD_SSL_CERT_NICKNAME;
  }



  /**
   * Get the "trust-manager-provider" property definition.
   * <p>
   * Specifies the name of the trust manager that is used with the
   * Administration Connector .
   *
   * @return Returns the "trust-manager-provider" property definition.
   */
  public AggregationPropertyDefinition<TrustManagerProviderCfgClient, TrustManagerProviderCfg> getTrustManagerProviderPropertyDefinition() {
    return PD_TRUST_MANAGER_PROVIDER;
  }



  /**
   * Managed object client implementation.
   */
  private static class AdministrationConnectorCfgClientImpl implements
    AdministrationConnectorCfgClient {

    // Private implementation.
    private ManagedObject<? extends AdministrationConnectorCfgClient> impl;



    // Private constructor.
    private AdministrationConnectorCfgClientImpl(
        ManagedObject<? extends AdministrationConnectorCfgClient> impl) {
      this.impl = impl;
    }



    /**
     * {@inheritDoc}
     */
    public String getKeyManagerProvider() {
      return impl.getPropertyValue(INSTANCE.getKeyManagerProviderPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setKeyManagerProvider(String value) {
      impl.setPropertyValue(INSTANCE.getKeyManagerProviderPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<InetAddress> getListenAddress() {
      return impl.getPropertyValues(INSTANCE.getListenAddressPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setListenAddress(Collection<InetAddress> values) {
      impl.setPropertyValues(INSTANCE.getListenAddressPropertyDefinition(), values);
    }



    /**
     * {@inheritDoc}
     */
    public Integer getListenPort() {
      return impl.getPropertyValue(INSTANCE.getListenPortPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setListenPort(int value) {
      impl.setPropertyValue(INSTANCE.getListenPortPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public String getSSLCertNickname() {
      return impl.getPropertyValue(INSTANCE.getSSLCertNicknamePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setSSLCertNickname(String value) {
      impl.setPropertyValue(INSTANCE.getSSLCertNicknamePropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public String getTrustManagerProvider() {
      return impl.getPropertyValue(INSTANCE.getTrustManagerProviderPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setTrustManagerProvider(String value) {
      impl.setPropertyValue(INSTANCE.getTrustManagerProviderPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public ManagedObjectDefinition<? extends AdministrationConnectorCfgClient, ? extends AdministrationConnectorCfg> definition() {
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
  private static class AdministrationConnectorCfgServerImpl implements
    AdministrationConnectorCfg {

    // Private implementation.
    private ServerManagedObject<? extends AdministrationConnectorCfg> impl;

    // The value of the "key-manager-provider" property.
    private final String pKeyManagerProvider;

    // The value of the "listen-address" property.
    private final SortedSet<InetAddress> pListenAddress;

    // The value of the "listen-port" property.
    private final int pListenPort;

    // The value of the "ssl-cert-nickname" property.
    private final String pSSLCertNickname;

    // The value of the "trust-manager-provider" property.
    private final String pTrustManagerProvider;



    // Private constructor.
    private AdministrationConnectorCfgServerImpl(ServerManagedObject<? extends AdministrationConnectorCfg> impl) {
      this.impl = impl;
      this.pKeyManagerProvider = impl.getPropertyValue(INSTANCE.getKeyManagerProviderPropertyDefinition());
      this.pListenAddress = impl.getPropertyValues(INSTANCE.getListenAddressPropertyDefinition());
      this.pListenPort = impl.getPropertyValue(INSTANCE.getListenPortPropertyDefinition());
      this.pSSLCertNickname = impl.getPropertyValue(INSTANCE.getSSLCertNicknamePropertyDefinition());
      this.pTrustManagerProvider = impl.getPropertyValue(INSTANCE.getTrustManagerProviderPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addChangeListener(
        ConfigurationChangeListener<AdministrationConnectorCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeChangeListener(
        ConfigurationChangeListener<AdministrationConnectorCfg> listener) {
      impl.deregisterChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public String getKeyManagerProvider() {
      return pKeyManagerProvider;
    }



    /**
     * {@inheritDoc}
     */
    public DN getKeyManagerProviderDN() {
      String value = getKeyManagerProvider();
      if (value == null) return null;
      return INSTANCE.getKeyManagerProviderPropertyDefinition().getChildDN(value);
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<InetAddress> getListenAddress() {
      return pListenAddress;
    }



    /**
     * {@inheritDoc}
     */
    public int getListenPort() {
      return pListenPort;
    }



    /**
     * {@inheritDoc}
     */
    public String getSSLCertNickname() {
      return pSSLCertNickname;
    }



    /**
     * {@inheritDoc}
     */
    public String getTrustManagerProvider() {
      return pTrustManagerProvider;
    }



    /**
     * {@inheritDoc}
     */
    public DN getTrustManagerProviderDN() {
      String value = getTrustManagerProvider();
      if (value == null) return null;
      return INSTANCE.getTrustManagerProviderPropertyDefinition().getChildDN(value);
    }



    /**
     * {@inheritDoc}
     */
    public Class<? extends AdministrationConnectorCfg> configurationClass() {
      return AdministrationConnectorCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
