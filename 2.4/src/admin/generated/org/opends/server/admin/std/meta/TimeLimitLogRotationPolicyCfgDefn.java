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
import org.opends.server.admin.ManagedObjectAlreadyExistsException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.PropertyOption;
import org.opends.server.admin.PropertyProvider;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.server.ServerManagedObject;
import org.opends.server.admin.std.client.TimeLimitLogRotationPolicyCfgClient;
import org.opends.server.admin.std.server.LogRotationPolicyCfg;
import org.opends.server.admin.std.server.TimeLimitLogRotationPolicyCfg;
import org.opends.server.admin.Tag;
import org.opends.server.admin.UndefinedDefaultBehaviorProvider;
import org.opends.server.types.DN;



/**
 * An interface for querying the Time Limit Log Rotation Policy
 * managed object definition meta information.
 * <p>
 * Rotation policy based on the time since last rotation.
 */
public final class TimeLimitLogRotationPolicyCfgDefn extends ManagedObjectDefinition<TimeLimitLogRotationPolicyCfgClient, TimeLimitLogRotationPolicyCfg> {

  // The singleton configuration definition instance.
  private static final TimeLimitLogRotationPolicyCfgDefn INSTANCE = new TimeLimitLogRotationPolicyCfgDefn();



  // The "java-class" property definition.
  private static final ClassPropertyDefinition PD_JAVA_CLASS;



  // The "rotation-interval" property definition.
  private static final DurationPropertyDefinition PD_ROTATION_INTERVAL;



  // Build the "java-class" property definition.
  static {
      ClassPropertyDefinition.Builder builder = ClassPropertyDefinition.createBuilder(INSTANCE, "java-class");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "java-class"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("org.opends.server.loggers.TimeLimitRotationPolicy");
      builder.setDefaultBehaviorProvider(provider);
      builder.addInstanceOf("org.opends.server.loggers.RotationPolicy");
      PD_JAVA_CLASS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_JAVA_CLASS);
  }



  // Build the "rotation-interval" property definition.
  static {
      DurationPropertyDefinition.Builder builder = DurationPropertyDefinition.createBuilder(INSTANCE, "rotation-interval");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "rotation-interval"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<Long>());
      builder.setBaseUnit("ms");
      builder.setLowerLimit("1");
      PD_ROTATION_INTERVAL = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_ROTATION_INTERVAL);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("logging"));
  }



  /**
   * Get the Time Limit Log Rotation Policy configuration definition
   * singleton.
   *
   * @return Returns the Time Limit Log Rotation Policy configuration
   *         definition singleton.
   */
  public static TimeLimitLogRotationPolicyCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private TimeLimitLogRotationPolicyCfgDefn() {
    super("time-limit-log-rotation-policy", LogRotationPolicyCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public TimeLimitLogRotationPolicyCfgClient createClientConfiguration(
      ManagedObject<? extends TimeLimitLogRotationPolicyCfgClient> impl) {
    return new TimeLimitLogRotationPolicyCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public TimeLimitLogRotationPolicyCfg createServerConfiguration(
      ServerManagedObject<? extends TimeLimitLogRotationPolicyCfg> impl) {
    return new TimeLimitLogRotationPolicyCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<TimeLimitLogRotationPolicyCfg> getServerConfigurationClass() {
    return TimeLimitLogRotationPolicyCfg.class;
  }



  /**
   * Get the "java-class" property definition.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Time Limit Log Rotation Policy implementation.
   *
   * @return Returns the "java-class" property definition.
   */
  public ClassPropertyDefinition getJavaClassPropertyDefinition() {
    return PD_JAVA_CLASS;
  }



  /**
   * Get the "rotation-interval" property definition.
   * <p>
   * Specifies the time interval between rotations.
   *
   * @return Returns the "rotation-interval" property definition.
   */
  public DurationPropertyDefinition getRotationIntervalPropertyDefinition() {
    return PD_ROTATION_INTERVAL;
  }



  /**
   * Managed object client implementation.
   */
  private static class TimeLimitLogRotationPolicyCfgClientImpl implements
    TimeLimitLogRotationPolicyCfgClient {

    // Private implementation.
    private ManagedObject<? extends TimeLimitLogRotationPolicyCfgClient> impl;



    // Private constructor.
    private TimeLimitLogRotationPolicyCfgClientImpl(
        ManagedObject<? extends TimeLimitLogRotationPolicyCfgClient> impl) {
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
    public Long getRotationInterval() {
      return impl.getPropertyValue(INSTANCE.getRotationIntervalPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setRotationInterval(long value) {
      impl.setPropertyValue(INSTANCE.getRotationIntervalPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public ManagedObjectDefinition<? extends TimeLimitLogRotationPolicyCfgClient, ? extends TimeLimitLogRotationPolicyCfg> definition() {
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
  private static class TimeLimitLogRotationPolicyCfgServerImpl implements
    TimeLimitLogRotationPolicyCfg {

    // Private implementation.
    private ServerManagedObject<? extends TimeLimitLogRotationPolicyCfg> impl;

    // The value of the "java-class" property.
    private final String pJavaClass;

    // The value of the "rotation-interval" property.
    private final long pRotationInterval;



    // Private constructor.
    private TimeLimitLogRotationPolicyCfgServerImpl(ServerManagedObject<? extends TimeLimitLogRotationPolicyCfg> impl) {
      this.impl = impl;
      this.pJavaClass = impl.getPropertyValue(INSTANCE.getJavaClassPropertyDefinition());
      this.pRotationInterval = impl.getPropertyValue(INSTANCE.getRotationIntervalPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addTimeLimitChangeListener(
        ConfigurationChangeListener<TimeLimitLogRotationPolicyCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeTimeLimitChangeListener(
        ConfigurationChangeListener<TimeLimitLogRotationPolicyCfg> listener) {
      impl.deregisterChangeListener(listener);
    }
    /**
     * {@inheritDoc}
     */
    public void addChangeListener(
        ConfigurationChangeListener<LogRotationPolicyCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeChangeListener(
        ConfigurationChangeListener<LogRotationPolicyCfg> listener) {
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
    public long getRotationInterval() {
      return pRotationInterval;
    }



    /**
     * {@inheritDoc}
     */
    public Class<? extends TimeLimitLogRotationPolicyCfg> configurationClass() {
      return TimeLimitLogRotationPolicyCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
