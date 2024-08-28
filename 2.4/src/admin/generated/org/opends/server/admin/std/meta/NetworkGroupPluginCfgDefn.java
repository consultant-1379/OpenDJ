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
import org.opends.server.admin.EnumPropertyDefinition;
import org.opends.server.admin.ManagedObjectAlreadyExistsException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.ManagedObjectOption;
import org.opends.server.admin.PropertyOption;
import org.opends.server.admin.PropertyProvider;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.server.ServerManagedObject;
import org.opends.server.admin.std.client.NetworkGroupPluginCfgClient;
import org.opends.server.admin.std.meta.PluginCfgDefn.PluginType;
import org.opends.server.admin.std.server.NetworkGroupPluginCfg;
import org.opends.server.admin.std.server.PluginCfg;
import org.opends.server.admin.Tag;
import org.opends.server.types.DN;



/**
 * An interface for querying the Network Group Plugin managed object
 * definition meta information.
 * <p>
 * The Network Group Plugin allows to group connections into different
 * network groups and enforce specific resource limit policies for each
 * network group.
 */
public final class NetworkGroupPluginCfgDefn extends ManagedObjectDefinition<NetworkGroupPluginCfgClient, NetworkGroupPluginCfg> {

  // The singleton configuration definition instance.
  private static final NetworkGroupPluginCfgDefn INSTANCE = new NetworkGroupPluginCfgDefn();



  // The "java-class" property definition.
  private static final ClassPropertyDefinition PD_JAVA_CLASS;



  // The "plugin-type" property definition.
  private static final EnumPropertyDefinition<PluginType> PD_PLUGIN_TYPE;



  // Build the "java-class" property definition.
  static {
      ClassPropertyDefinition.Builder builder = ClassPropertyDefinition.createBuilder(INSTANCE, "java-class");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "java-class"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("org.opends.server.core.networkgroups.NetworkGroupPlugin");
      builder.setDefaultBehaviorProvider(provider);
      builder.addInstanceOf("org.opends.server.api.plugin.DirectoryServerPlugin");
      PD_JAVA_CLASS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_JAVA_CLASS);
  }



  // Build the "plugin-type" property definition.
  static {
      EnumPropertyDefinition.Builder<PluginType> builder = EnumPropertyDefinition.createBuilder(INSTANCE, "plugin-type");
      builder.setOption(PropertyOption.MULTI_VALUED);
      builder.setOption(PropertyOption.MANDATORY);
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.COMPONENT_RESTART, INSTANCE, "plugin-type"));
      DefaultBehaviorProvider<PluginType> provider = new DefinedDefaultBehaviorProvider<PluginType>("postconnect", "preparseadd", "preparsebind", "preparsecompare", "preparsedelete", "preparseextended", "preparsemodify", "preparsemodifydn", "preparsesearch", "preparseunbind", "postresponsebind", "postresponseextended");
      builder.setDefaultBehaviorProvider(provider);
      builder.setEnumClass(PluginType.class);
      PD_PLUGIN_TYPE = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_PLUGIN_TYPE);
  }



  // Register the options associated with this managed object definition.
  static {
    INSTANCE.registerOption(ManagedObjectOption.HIDDEN);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("core-server"));
  }



  /**
   * Get the Network Group Plugin configuration definition singleton.
   *
   * @return Returns the Network Group Plugin configuration definition
   *         singleton.
   */
  public static NetworkGroupPluginCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private NetworkGroupPluginCfgDefn() {
    super("network-group-plugin", PluginCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public NetworkGroupPluginCfgClient createClientConfiguration(
      ManagedObject<? extends NetworkGroupPluginCfgClient> impl) {
    return new NetworkGroupPluginCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public NetworkGroupPluginCfg createServerConfiguration(
      ServerManagedObject<? extends NetworkGroupPluginCfg> impl) {
    return new NetworkGroupPluginCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<NetworkGroupPluginCfg> getServerConfigurationClass() {
    return NetworkGroupPluginCfg.class;
  }



  /**
   * Get the "enabled" property definition.
   * <p>
   * Indicates whether the plug-in is enabled for use.
   *
   * @return Returns the "enabled" property definition.
   */
  public BooleanPropertyDefinition getEnabledPropertyDefinition() {
    return PluginCfgDefn.getInstance().getEnabledPropertyDefinition();
  }



  /**
   * Get the "invoke-for-internal-operations" property definition.
   * <p>
   * Indicates whether the plug-in should be invoked for internal
   * operations.
   * <p>
   * Any plug-in that can be invoked for internal operations must
   * ensure that it does not create any new internal operatons that can
   * cause the same plug-in to be re-invoked.
   *
   * @return Returns the "invoke-for-internal-operations" property definition.
   */
  public BooleanPropertyDefinition getInvokeForInternalOperationsPropertyDefinition() {
    return PluginCfgDefn.getInstance().getInvokeForInternalOperationsPropertyDefinition();
  }



  /**
   * Get the "java-class" property definition.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the plug-in implementation.
   *
   * @return Returns the "java-class" property definition.
   */
  public ClassPropertyDefinition getJavaClassPropertyDefinition() {
    return PD_JAVA_CLASS;
  }



  /**
   * Get the "plugin-type" property definition.
   * <p>
   * Specifies the set of plug-in types for the plug-in, which
   * specifies the times at which the plug-in is invoked.
   *
   * @return Returns the "plugin-type" property definition.
   */
  public EnumPropertyDefinition<PluginType> getPluginTypePropertyDefinition() {
    return PD_PLUGIN_TYPE;
  }



  /**
   * Managed object client implementation.
   */
  private static class NetworkGroupPluginCfgClientImpl implements
    NetworkGroupPluginCfgClient {

    // Private implementation.
    private ManagedObject<? extends NetworkGroupPluginCfgClient> impl;



    // Private constructor.
    private NetworkGroupPluginCfgClientImpl(
        ManagedObject<? extends NetworkGroupPluginCfgClient> impl) {
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
    public boolean isInvokeForInternalOperations() {
      return impl.getPropertyValue(INSTANCE.getInvokeForInternalOperationsPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setInvokeForInternalOperations(Boolean value) {
      impl.setPropertyValue(INSTANCE.getInvokeForInternalOperationsPropertyDefinition(), value);
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
    public SortedSet<PluginType> getPluginType() {
      return impl.getPropertyValues(INSTANCE.getPluginTypePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setPluginType(Collection<PluginType> values) {
      impl.setPropertyValues(INSTANCE.getPluginTypePropertyDefinition(), values);
    }



    /**
     * {@inheritDoc}
     */
    public ManagedObjectDefinition<? extends NetworkGroupPluginCfgClient, ? extends NetworkGroupPluginCfg> definition() {
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
  private static class NetworkGroupPluginCfgServerImpl implements
    NetworkGroupPluginCfg {

    // Private implementation.
    private ServerManagedObject<? extends NetworkGroupPluginCfg> impl;

    // The value of the "enabled" property.
    private final boolean pEnabled;

    // The value of the "invoke-for-internal-operations" property.
    private final boolean pInvokeForInternalOperations;

    // The value of the "java-class" property.
    private final String pJavaClass;

    // The value of the "plugin-type" property.
    private final SortedSet<PluginType> pPluginType;



    // Private constructor.
    private NetworkGroupPluginCfgServerImpl(ServerManagedObject<? extends NetworkGroupPluginCfg> impl) {
      this.impl = impl;
      this.pEnabled = impl.getPropertyValue(INSTANCE.getEnabledPropertyDefinition());
      this.pInvokeForInternalOperations = impl.getPropertyValue(INSTANCE.getInvokeForInternalOperationsPropertyDefinition());
      this.pJavaClass = impl.getPropertyValue(INSTANCE.getJavaClassPropertyDefinition());
      this.pPluginType = impl.getPropertyValues(INSTANCE.getPluginTypePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addNetworkGroupChangeListener(
        ConfigurationChangeListener<NetworkGroupPluginCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeNetworkGroupChangeListener(
        ConfigurationChangeListener<NetworkGroupPluginCfg> listener) {
      impl.deregisterChangeListener(listener);
    }
    /**
     * {@inheritDoc}
     */
    public void addChangeListener(
        ConfigurationChangeListener<PluginCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeChangeListener(
        ConfigurationChangeListener<PluginCfg> listener) {
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
    public boolean isInvokeForInternalOperations() {
      return pInvokeForInternalOperations;
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
    public SortedSet<PluginType> getPluginType() {
      return pPluginType;
    }



    /**
     * {@inheritDoc}
     */
    public Class<? extends NetworkGroupPluginCfg> configurationClass() {
      return NetworkGroupPluginCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
