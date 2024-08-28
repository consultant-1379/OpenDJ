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
import org.opends.server.admin.ManagedObjectAlreadyExistsException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.PropertyOption;
import org.opends.server.admin.PropertyProvider;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.server.ServerManagedObject;
import org.opends.server.admin.SizePropertyDefinition;
import org.opends.server.admin.std.client.FreeDiskSpaceLogRetentionPolicyCfgClient;
import org.opends.server.admin.std.server.FreeDiskSpaceLogRetentionPolicyCfg;
import org.opends.server.admin.std.server.LogRetentionPolicyCfg;
import org.opends.server.admin.Tag;
import org.opends.server.admin.UndefinedDefaultBehaviorProvider;
import org.opends.server.types.DN;



/**
 * An interface for querying the Free Disk Space Log Retention Policy
 * managed object definition meta information.
 * <p>
 * Retention policy based on the free disk space available.
 */
public final class FreeDiskSpaceLogRetentionPolicyCfgDefn extends ManagedObjectDefinition<FreeDiskSpaceLogRetentionPolicyCfgClient, FreeDiskSpaceLogRetentionPolicyCfg> {

  // The singleton configuration definition instance.
  private static final FreeDiskSpaceLogRetentionPolicyCfgDefn INSTANCE = new FreeDiskSpaceLogRetentionPolicyCfgDefn();



  // The "free-disk-space" property definition.
  private static final SizePropertyDefinition PD_FREE_DISK_SPACE;



  // The "java-class" property definition.
  private static final ClassPropertyDefinition PD_JAVA_CLASS;



  // Build the "free-disk-space" property definition.
  static {
      SizePropertyDefinition.Builder builder = SizePropertyDefinition.createBuilder(INSTANCE, "free-disk-space");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "free-disk-space"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<Long>());
      builder.setLowerLimit("1");
      PD_FREE_DISK_SPACE = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_FREE_DISK_SPACE);
  }



  // Build the "java-class" property definition.
  static {
      ClassPropertyDefinition.Builder builder = ClassPropertyDefinition.createBuilder(INSTANCE, "java-class");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "java-class"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("org.opends.server.loggers.FreeDiskSpaceRetentionPolicy");
      builder.setDefaultBehaviorProvider(provider);
      builder.addInstanceOf("org.opends.server.loggers.RetentionPolicy");
      PD_JAVA_CLASS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_JAVA_CLASS);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("logging"));
  }



  /**
   * Get the Free Disk Space Log Retention Policy configuration
   * definition singleton.
   *
   * @return Returns the Free Disk Space Log Retention Policy
   *         configuration definition singleton.
   */
  public static FreeDiskSpaceLogRetentionPolicyCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private FreeDiskSpaceLogRetentionPolicyCfgDefn() {
    super("free-disk-space-log-retention-policy", LogRetentionPolicyCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public FreeDiskSpaceLogRetentionPolicyCfgClient createClientConfiguration(
      ManagedObject<? extends FreeDiskSpaceLogRetentionPolicyCfgClient> impl) {
    return new FreeDiskSpaceLogRetentionPolicyCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public FreeDiskSpaceLogRetentionPolicyCfg createServerConfiguration(
      ServerManagedObject<? extends FreeDiskSpaceLogRetentionPolicyCfg> impl) {
    return new FreeDiskSpaceLogRetentionPolicyCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<FreeDiskSpaceLogRetentionPolicyCfg> getServerConfigurationClass() {
    return FreeDiskSpaceLogRetentionPolicyCfg.class;
  }



  /**
   * Get the "free-disk-space" property definition.
   * <p>
   * Specifies the minimum amount of free disk space that should be
   * available on the file system on which the archived log files are
   * stored.
   *
   * @return Returns the "free-disk-space" property definition.
   */
  public SizePropertyDefinition getFreeDiskSpacePropertyDefinition() {
    return PD_FREE_DISK_SPACE;
  }



  /**
   * Get the "java-class" property definition.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Free Disk Space Log Retention Policy implementation.
   *
   * @return Returns the "java-class" property definition.
   */
  public ClassPropertyDefinition getJavaClassPropertyDefinition() {
    return PD_JAVA_CLASS;
  }



  /**
   * Managed object client implementation.
   */
  private static class FreeDiskSpaceLogRetentionPolicyCfgClientImpl implements
    FreeDiskSpaceLogRetentionPolicyCfgClient {

    // Private implementation.
    private ManagedObject<? extends FreeDiskSpaceLogRetentionPolicyCfgClient> impl;



    // Private constructor.
    private FreeDiskSpaceLogRetentionPolicyCfgClientImpl(
        ManagedObject<? extends FreeDiskSpaceLogRetentionPolicyCfgClient> impl) {
      this.impl = impl;
    }



    /**
     * {@inheritDoc}
     */
    public Long getFreeDiskSpace() {
      return impl.getPropertyValue(INSTANCE.getFreeDiskSpacePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setFreeDiskSpace(long value) {
      impl.setPropertyValue(INSTANCE.getFreeDiskSpacePropertyDefinition(), value);
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
    public ManagedObjectDefinition<? extends FreeDiskSpaceLogRetentionPolicyCfgClient, ? extends FreeDiskSpaceLogRetentionPolicyCfg> definition() {
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
  private static class FreeDiskSpaceLogRetentionPolicyCfgServerImpl implements
    FreeDiskSpaceLogRetentionPolicyCfg {

    // Private implementation.
    private ServerManagedObject<? extends FreeDiskSpaceLogRetentionPolicyCfg> impl;

    // The value of the "free-disk-space" property.
    private final long pFreeDiskSpace;

    // The value of the "java-class" property.
    private final String pJavaClass;



    // Private constructor.
    private FreeDiskSpaceLogRetentionPolicyCfgServerImpl(ServerManagedObject<? extends FreeDiskSpaceLogRetentionPolicyCfg> impl) {
      this.impl = impl;
      this.pFreeDiskSpace = impl.getPropertyValue(INSTANCE.getFreeDiskSpacePropertyDefinition());
      this.pJavaClass = impl.getPropertyValue(INSTANCE.getJavaClassPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addFreeDiskSpaceChangeListener(
        ConfigurationChangeListener<FreeDiskSpaceLogRetentionPolicyCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeFreeDiskSpaceChangeListener(
        ConfigurationChangeListener<FreeDiskSpaceLogRetentionPolicyCfg> listener) {
      impl.deregisterChangeListener(listener);
    }
    /**
     * {@inheritDoc}
     */
    public void addChangeListener(
        ConfigurationChangeListener<LogRetentionPolicyCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeChangeListener(
        ConfigurationChangeListener<LogRetentionPolicyCfg> listener) {
      impl.deregisterChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public long getFreeDiskSpace() {
      return pFreeDiskSpace;
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
    public Class<? extends FreeDiskSpaceLogRetentionPolicyCfg> configurationClass() {
      return FreeDiskSpaceLogRetentionPolicyCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
