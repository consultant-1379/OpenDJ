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
import org.opends.server.admin.IPAddressMaskPropertyDefinition;
import org.opends.server.admin.ManagedObjectAlreadyExistsException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.PropertyOption;
import org.opends.server.admin.PropertyProvider;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.server.ServerManagedObject;
import org.opends.server.admin.std.client.LDIFConnectionHandlerCfgClient;
import org.opends.server.admin.std.server.ConnectionHandlerCfg;
import org.opends.server.admin.std.server.LDIFConnectionHandlerCfg;
import org.opends.server.admin.StringPropertyDefinition;
import org.opends.server.admin.Tag;
import org.opends.server.types.AddressMask;
import org.opends.server.types.DN;



/**
 * An interface for querying the LDIF Connection Handler managed
 * object definition meta information.
 * <p>
 * The LDIF Connection Handler is used to process changes in the
 * server using internal operations, where the changes to process are
 * read from an LDIF file.
 */
public final class LDIFConnectionHandlerCfgDefn extends ManagedObjectDefinition<LDIFConnectionHandlerCfgClient, LDIFConnectionHandlerCfg> {

  // The singleton configuration definition instance.
  private static final LDIFConnectionHandlerCfgDefn INSTANCE = new LDIFConnectionHandlerCfgDefn();



  // The "java-class" property definition.
  private static final ClassPropertyDefinition PD_JAVA_CLASS;



  // The "ldif-directory" property definition.
  private static final StringPropertyDefinition PD_LDIF_DIRECTORY;



  // The "poll-interval" property definition.
  private static final DurationPropertyDefinition PD_POLL_INTERVAL;



  // Build the "java-class" property definition.
  static {
      ClassPropertyDefinition.Builder builder = ClassPropertyDefinition.createBuilder(INSTANCE, "java-class");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.COMPONENT_RESTART, INSTANCE, "java-class"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("org.opends.server.protocols.LDIFConnectionHandler");
      builder.setDefaultBehaviorProvider(provider);
      builder.addInstanceOf("org.opends.server.api.ConnectionHandler");
      PD_JAVA_CLASS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_JAVA_CLASS);
  }



  // Build the "ldif-directory" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "ldif-directory");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "ldif-directory"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("config/auto-process-ldif");
      builder.setDefaultBehaviorProvider(provider);
      PD_LDIF_DIRECTORY = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_LDIF_DIRECTORY);
  }



  // Build the "poll-interval" property definition.
  static {
      DurationPropertyDefinition.Builder builder = DurationPropertyDefinition.createBuilder(INSTANCE, "poll-interval");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "poll-interval"));
      DefaultBehaviorProvider<Long> provider = new DefinedDefaultBehaviorProvider<Long>("5 seconds");
      builder.setDefaultBehaviorProvider(provider);
      builder.setBaseUnit("ms");
      builder.setLowerLimit("1");
      PD_POLL_INTERVAL = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_POLL_INTERVAL);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("core-server"));
  }



  /**
   * Get the LDIF Connection Handler configuration definition
   * singleton.
   *
   * @return Returns the LDIF Connection Handler configuration
   *         definition singleton.
   */
  public static LDIFConnectionHandlerCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private LDIFConnectionHandlerCfgDefn() {
    super("ldif-connection-handler", ConnectionHandlerCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public LDIFConnectionHandlerCfgClient createClientConfiguration(
      ManagedObject<? extends LDIFConnectionHandlerCfgClient> impl) {
    return new LDIFConnectionHandlerCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public LDIFConnectionHandlerCfg createServerConfiguration(
      ServerManagedObject<? extends LDIFConnectionHandlerCfg> impl) {
    return new LDIFConnectionHandlerCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<LDIFConnectionHandlerCfg> getServerConfigurationClass() {
    return LDIFConnectionHandlerCfg.class;
  }



  /**
   * Get the "allowed-client" property definition.
   * <p>
   * Specifies a set of host names or address masks that determine the
   * clients that are allowed to establish connections to this LDIF
   * Connection Handler.
   * <p>
   * Valid values include a host name, a fully qualified domain name,
   * a domain name, an IP address, or a subnetwork with subnetwork
   * mask.
   *
   * @return Returns the "allowed-client" property definition.
   */
  public IPAddressMaskPropertyDefinition getAllowedClientPropertyDefinition() {
    return ConnectionHandlerCfgDefn.getInstance().getAllowedClientPropertyDefinition();
  }



  /**
   * Get the "denied-client" property definition.
   * <p>
   * Specifies a set of host names or address masks that determine the
   * clients that are not allowed to establish connections to this LDIF
   * Connection Handler.
   * <p>
   * Valid values include a host name, a fully qualified domain name,
   * a domain name, an IP address, or a subnetwork with subnetwork
   * mask. If both allowed and denied client masks are defined and a
   * client connection matches one or more masks in both lists, then
   * the connection is denied. If only a denied list is specified, then
   * any client not matching a mask in that list is allowed.
   *
   * @return Returns the "denied-client" property definition.
   */
  public IPAddressMaskPropertyDefinition getDeniedClientPropertyDefinition() {
    return ConnectionHandlerCfgDefn.getInstance().getDeniedClientPropertyDefinition();
  }



  /**
   * Get the "enabled" property definition.
   * <p>
   * Indicates whether the LDIF Connection Handler is enabled.
   *
   * @return Returns the "enabled" property definition.
   */
  public BooleanPropertyDefinition getEnabledPropertyDefinition() {
    return ConnectionHandlerCfgDefn.getInstance().getEnabledPropertyDefinition();
  }



  /**
   * Get the "java-class" property definition.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the LDIF Connection Handler implementation.
   *
   * @return Returns the "java-class" property definition.
   */
  public ClassPropertyDefinition getJavaClassPropertyDefinition() {
    return PD_JAVA_CLASS;
  }



  /**
   * Get the "ldif-directory" property definition.
   * <p>
   * Specifies the path to the directory in which the LDIF files
   * should be placed.
   *
   * @return Returns the "ldif-directory" property definition.
   */
  public StringPropertyDefinition getLDIFDirectoryPropertyDefinition() {
    return PD_LDIF_DIRECTORY;
  }



  /**
   * Get the "poll-interval" property definition.
   * <p>
   * Specifies how frequently the LDIF connection handler should check
   * the LDIF directory to determine whether a new LDIF file has been
   * added.
   *
   * @return Returns the "poll-interval" property definition.
   */
  public DurationPropertyDefinition getPollIntervalPropertyDefinition() {
    return PD_POLL_INTERVAL;
  }



  /**
   * Managed object client implementation.
   */
  private static class LDIFConnectionHandlerCfgClientImpl implements
    LDIFConnectionHandlerCfgClient {

    // Private implementation.
    private ManagedObject<? extends LDIFConnectionHandlerCfgClient> impl;



    // Private constructor.
    private LDIFConnectionHandlerCfgClientImpl(
        ManagedObject<? extends LDIFConnectionHandlerCfgClient> impl) {
      this.impl = impl;
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<AddressMask> getAllowedClient() {
      return impl.getPropertyValues(INSTANCE.getAllowedClientPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setAllowedClient(Collection<AddressMask> values) {
      impl.setPropertyValues(INSTANCE.getAllowedClientPropertyDefinition(), values);
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<AddressMask> getDeniedClient() {
      return impl.getPropertyValues(INSTANCE.getDeniedClientPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setDeniedClient(Collection<AddressMask> values) {
      impl.setPropertyValues(INSTANCE.getDeniedClientPropertyDefinition(), values);
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
    public String getLDIFDirectory() {
      return impl.getPropertyValue(INSTANCE.getLDIFDirectoryPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setLDIFDirectory(String value) {
      impl.setPropertyValue(INSTANCE.getLDIFDirectoryPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public long getPollInterval() {
      return impl.getPropertyValue(INSTANCE.getPollIntervalPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setPollInterval(long value) {
      impl.setPropertyValue(INSTANCE.getPollIntervalPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public ManagedObjectDefinition<? extends LDIFConnectionHandlerCfgClient, ? extends LDIFConnectionHandlerCfg> definition() {
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
  private static class LDIFConnectionHandlerCfgServerImpl implements
    LDIFConnectionHandlerCfg {

    // Private implementation.
    private ServerManagedObject<? extends LDIFConnectionHandlerCfg> impl;

    // The value of the "allowed-client" property.
    private final SortedSet<AddressMask> pAllowedClient;

    // The value of the "denied-client" property.
    private final SortedSet<AddressMask> pDeniedClient;

    // The value of the "enabled" property.
    private final boolean pEnabled;

    // The value of the "java-class" property.
    private final String pJavaClass;

    // The value of the "ldif-directory" property.
    private final String pLDIFDirectory;

    // The value of the "poll-interval" property.
    private final long pPollInterval;



    // Private constructor.
    private LDIFConnectionHandlerCfgServerImpl(ServerManagedObject<? extends LDIFConnectionHandlerCfg> impl) {
      this.impl = impl;
      this.pAllowedClient = impl.getPropertyValues(INSTANCE.getAllowedClientPropertyDefinition());
      this.pDeniedClient = impl.getPropertyValues(INSTANCE.getDeniedClientPropertyDefinition());
      this.pEnabled = impl.getPropertyValue(INSTANCE.getEnabledPropertyDefinition());
      this.pJavaClass = impl.getPropertyValue(INSTANCE.getJavaClassPropertyDefinition());
      this.pLDIFDirectory = impl.getPropertyValue(INSTANCE.getLDIFDirectoryPropertyDefinition());
      this.pPollInterval = impl.getPropertyValue(INSTANCE.getPollIntervalPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addLDIFChangeListener(
        ConfigurationChangeListener<LDIFConnectionHandlerCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeLDIFChangeListener(
        ConfigurationChangeListener<LDIFConnectionHandlerCfg> listener) {
      impl.deregisterChangeListener(listener);
    }
    /**
     * {@inheritDoc}
     */
    public void addChangeListener(
        ConfigurationChangeListener<ConnectionHandlerCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeChangeListener(
        ConfigurationChangeListener<ConnectionHandlerCfg> listener) {
      impl.deregisterChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<AddressMask> getAllowedClient() {
      return pAllowedClient;
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<AddressMask> getDeniedClient() {
      return pDeniedClient;
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
    public String getLDIFDirectory() {
      return pLDIFDirectory;
    }



    /**
     * {@inheritDoc}
     */
    public long getPollInterval() {
      return pPollInterval;
    }



    /**
     * {@inheritDoc}
     */
    public Class<? extends LDIFConnectionHandlerCfg> configurationClass() {
      return LDIFConnectionHandlerCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
