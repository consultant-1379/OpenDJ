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
import org.opends.server.admin.ManagedObjectAlreadyExistsException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.PropertyOption;
import org.opends.server.admin.PropertyProvider;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.server.ServerManagedObject;
import org.opends.server.admin.std.client.MatchingRuleCfgClient;
import org.opends.server.admin.std.server.MatchingRuleCfg;
import org.opends.server.admin.Tag;
import org.opends.server.admin.TopCfgDefn;
import org.opends.server.admin.UndefinedDefaultBehaviorProvider;
import org.opends.server.types.DN;



/**
 * An interface for querying the Matching Rule managed object
 * definition meta information.
 * <p>
 * Matching Rules define a set of rules for performing matching
 * operations against assertion values.
 */
public final class MatchingRuleCfgDefn extends ManagedObjectDefinition<MatchingRuleCfgClient, MatchingRuleCfg> {

  // The singleton configuration definition instance.
  private static final MatchingRuleCfgDefn INSTANCE = new MatchingRuleCfgDefn();



  // The "enabled" property definition.
  private static final BooleanPropertyDefinition PD_ENABLED;



  // The "java-class" property definition.
  private static final ClassPropertyDefinition PD_JAVA_CLASS;



  // Build the "enabled" property definition.
  static {
      BooleanPropertyDefinition.Builder builder = BooleanPropertyDefinition.createBuilder(INSTANCE, "enabled");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "enabled"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<Boolean>());
      PD_ENABLED = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_ENABLED);
  }



  // Build the "java-class" property definition.
  static {
      ClassPropertyDefinition.Builder builder = ClassPropertyDefinition.createBuilder(INSTANCE, "java-class");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "java-class"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<String>());
      builder.addInstanceOf("org.opends.server.api.MatchingRuleFactory");
      PD_JAVA_CLASS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_JAVA_CLASS);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("core-server"));
  }



  /**
   * Get the Matching Rule configuration definition singleton.
   *
   * @return Returns the Matching Rule configuration definition
   *         singleton.
   */
  public static MatchingRuleCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private MatchingRuleCfgDefn() {
    super("matching-rule", TopCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public MatchingRuleCfgClient createClientConfiguration(
      ManagedObject<? extends MatchingRuleCfgClient> impl) {
    return new MatchingRuleCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public MatchingRuleCfg createServerConfiguration(
      ServerManagedObject<? extends MatchingRuleCfg> impl) {
    return new MatchingRuleCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<MatchingRuleCfg> getServerConfigurationClass() {
    return MatchingRuleCfg.class;
  }



  /**
   * Get the "enabled" property definition.
   * <p>
   * Indicates whether the Matching Rule is enabled for use.
   *
   * @return Returns the "enabled" property definition.
   */
  public BooleanPropertyDefinition getEnabledPropertyDefinition() {
    return PD_ENABLED;
  }



  /**
   * Get the "java-class" property definition.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Matching Rule implementation.
   *
   * @return Returns the "java-class" property definition.
   */
  public ClassPropertyDefinition getJavaClassPropertyDefinition() {
    return PD_JAVA_CLASS;
  }



  /**
   * Managed object client implementation.
   */
  private static class MatchingRuleCfgClientImpl implements
    MatchingRuleCfgClient {

    // Private implementation.
    private ManagedObject<? extends MatchingRuleCfgClient> impl;



    // Private constructor.
    private MatchingRuleCfgClientImpl(
        ManagedObject<? extends MatchingRuleCfgClient> impl) {
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
    public ManagedObjectDefinition<? extends MatchingRuleCfgClient, ? extends MatchingRuleCfg> definition() {
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
  private static class MatchingRuleCfgServerImpl implements
    MatchingRuleCfg {

    // Private implementation.
    private ServerManagedObject<? extends MatchingRuleCfg> impl;

    // The value of the "enabled" property.
    private final boolean pEnabled;

    // The value of the "java-class" property.
    private final String pJavaClass;



    // Private constructor.
    private MatchingRuleCfgServerImpl(ServerManagedObject<? extends MatchingRuleCfg> impl) {
      this.impl = impl;
      this.pEnabled = impl.getPropertyValue(INSTANCE.getEnabledPropertyDefinition());
      this.pJavaClass = impl.getPropertyValue(INSTANCE.getJavaClassPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addChangeListener(
        ConfigurationChangeListener<MatchingRuleCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeChangeListener(
        ConfigurationChangeListener<MatchingRuleCfg> listener) {
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
    public Class<? extends MatchingRuleCfg> configurationClass() {
      return MatchingRuleCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
