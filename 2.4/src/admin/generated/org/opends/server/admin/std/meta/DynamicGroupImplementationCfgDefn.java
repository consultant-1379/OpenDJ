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
import org.opends.server.admin.ManagedObjectAlreadyExistsException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.PropertyOption;
import org.opends.server.admin.PropertyProvider;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.server.ServerManagedObject;
import org.opends.server.admin.std.client.DynamicGroupImplementationCfgClient;
import org.opends.server.admin.std.server.DynamicGroupImplementationCfg;
import org.opends.server.admin.std.server.GroupImplementationCfg;
import org.opends.server.admin.Tag;
import org.opends.server.types.DN;



/**
 * An interface for querying the Dynamic Group Implementation managed
 * object definition meta information.
 * <p>
 * The Dynamic Group Implementation provides a grouping mechanism in
 * which the group membership is determined based on criteria defined
 * in one or more LDAP URLs.
 */
public final class DynamicGroupImplementationCfgDefn extends ManagedObjectDefinition<DynamicGroupImplementationCfgClient, DynamicGroupImplementationCfg> {

  // The singleton configuration definition instance.
  private static final DynamicGroupImplementationCfgDefn INSTANCE = new DynamicGroupImplementationCfgDefn();



  // The "java-class" property definition.
  private static final ClassPropertyDefinition PD_JAVA_CLASS;



  // Build the "java-class" property definition.
  static {
      ClassPropertyDefinition.Builder builder = ClassPropertyDefinition.createBuilder(INSTANCE, "java-class");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.COMPONENT_RESTART, INSTANCE, "java-class"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("org.opends.server.extensions.DynamicGroup");
      builder.setDefaultBehaviorProvider(provider);
      builder.addInstanceOf("org.opends.server.api.Group");
      PD_JAVA_CLASS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_JAVA_CLASS);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("core-server"));
  }



  /**
   * Get the Dynamic Group Implementation configuration definition
   * singleton.
   *
   * @return Returns the Dynamic Group Implementation configuration
   *         definition singleton.
   */
  public static DynamicGroupImplementationCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private DynamicGroupImplementationCfgDefn() {
    super("dynamic-group-implementation", GroupImplementationCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public DynamicGroupImplementationCfgClient createClientConfiguration(
      ManagedObject<? extends DynamicGroupImplementationCfgClient> impl) {
    return new DynamicGroupImplementationCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public DynamicGroupImplementationCfg createServerConfiguration(
      ServerManagedObject<? extends DynamicGroupImplementationCfg> impl) {
    return new DynamicGroupImplementationCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<DynamicGroupImplementationCfg> getServerConfigurationClass() {
    return DynamicGroupImplementationCfg.class;
  }



  /**
   * Get the "enabled" property definition.
   * <p>
   * Indicates whether the Dynamic Group Implementation is enabled.
   *
   * @return Returns the "enabled" property definition.
   */
  public BooleanPropertyDefinition getEnabledPropertyDefinition() {
    return GroupImplementationCfgDefn.getInstance().getEnabledPropertyDefinition();
  }



  /**
   * Get the "java-class" property definition.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Dynamic Group Implementation implementation.
   *
   * @return Returns the "java-class" property definition.
   */
  public ClassPropertyDefinition getJavaClassPropertyDefinition() {
    return PD_JAVA_CLASS;
  }



  /**
   * Managed object client implementation.
   */
  private static class DynamicGroupImplementationCfgClientImpl implements
    DynamicGroupImplementationCfgClient {

    // Private implementation.
    private ManagedObject<? extends DynamicGroupImplementationCfgClient> impl;



    // Private constructor.
    private DynamicGroupImplementationCfgClientImpl(
        ManagedObject<? extends DynamicGroupImplementationCfgClient> impl) {
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
    public ManagedObjectDefinition<? extends DynamicGroupImplementationCfgClient, ? extends DynamicGroupImplementationCfg> definition() {
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
  private static class DynamicGroupImplementationCfgServerImpl implements
    DynamicGroupImplementationCfg {

    // Private implementation.
    private ServerManagedObject<? extends DynamicGroupImplementationCfg> impl;

    // The value of the "enabled" property.
    private final boolean pEnabled;

    // The value of the "java-class" property.
    private final String pJavaClass;



    // Private constructor.
    private DynamicGroupImplementationCfgServerImpl(ServerManagedObject<? extends DynamicGroupImplementationCfg> impl) {
      this.impl = impl;
      this.pEnabled = impl.getPropertyValue(INSTANCE.getEnabledPropertyDefinition());
      this.pJavaClass = impl.getPropertyValue(INSTANCE.getJavaClassPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addDynamicChangeListener(
        ConfigurationChangeListener<DynamicGroupImplementationCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeDynamicChangeListener(
        ConfigurationChangeListener<DynamicGroupImplementationCfg> listener) {
      impl.deregisterChangeListener(listener);
    }
    /**
     * {@inheritDoc}
     */
    public void addChangeListener(
        ConfigurationChangeListener<GroupImplementationCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeChangeListener(
        ConfigurationChangeListener<GroupImplementationCfg> listener) {
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
    public Class<? extends DynamicGroupImplementationCfg> configurationClass() {
      return DynamicGroupImplementationCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
