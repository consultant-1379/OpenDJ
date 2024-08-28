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
import org.opends.server.admin.std.client.SizeLimitLogRotationPolicyCfgClient;
import org.opends.server.admin.std.server.LogRotationPolicyCfg;
import org.opends.server.admin.std.server.SizeLimitLogRotationPolicyCfg;
import org.opends.server.admin.Tag;
import org.opends.server.admin.UndefinedDefaultBehaviorProvider;
import org.opends.server.types.DN;



/**
 * An interface for querying the Size Limit Log Rotation Policy
 * managed object definition meta information.
 * <p>
 * Rotation policy based on the size of the log file.
 */
public final class SizeLimitLogRotationPolicyCfgDefn extends ManagedObjectDefinition<SizeLimitLogRotationPolicyCfgClient, SizeLimitLogRotationPolicyCfg> {

  // The singleton configuration definition instance.
  private static final SizeLimitLogRotationPolicyCfgDefn INSTANCE = new SizeLimitLogRotationPolicyCfgDefn();



  // The "file-size-limit" property definition.
  private static final SizePropertyDefinition PD_FILE_SIZE_LIMIT;



  // The "java-class" property definition.
  private static final ClassPropertyDefinition PD_JAVA_CLASS;



  // Build the "file-size-limit" property definition.
  static {
      SizePropertyDefinition.Builder builder = SizePropertyDefinition.createBuilder(INSTANCE, "file-size-limit");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "file-size-limit"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<Long>());
      builder.setLowerLimit("1");
      PD_FILE_SIZE_LIMIT = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_FILE_SIZE_LIMIT);
  }



  // Build the "java-class" property definition.
  static {
      ClassPropertyDefinition.Builder builder = ClassPropertyDefinition.createBuilder(INSTANCE, "java-class");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "java-class"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("org.opends.server.loggers.SizeBasedRotationPolicy");
      builder.setDefaultBehaviorProvider(provider);
      builder.addInstanceOf("org.opends.server.loggers.RotationPolicy");
      PD_JAVA_CLASS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_JAVA_CLASS);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("logging"));
  }



  /**
   * Get the Size Limit Log Rotation Policy configuration definition
   * singleton.
   *
   * @return Returns the Size Limit Log Rotation Policy configuration
   *         definition singleton.
   */
  public static SizeLimitLogRotationPolicyCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private SizeLimitLogRotationPolicyCfgDefn() {
    super("size-limit-log-rotation-policy", LogRotationPolicyCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public SizeLimitLogRotationPolicyCfgClient createClientConfiguration(
      ManagedObject<? extends SizeLimitLogRotationPolicyCfgClient> impl) {
    return new SizeLimitLogRotationPolicyCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public SizeLimitLogRotationPolicyCfg createServerConfiguration(
      ServerManagedObject<? extends SizeLimitLogRotationPolicyCfg> impl) {
    return new SizeLimitLogRotationPolicyCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<SizeLimitLogRotationPolicyCfg> getServerConfigurationClass() {
    return SizeLimitLogRotationPolicyCfg.class;
  }



  /**
   * Get the "file-size-limit" property definition.
   * <p>
   * Specifies the maximum size that a log file can reach before it is
   * rotated.
   *
   * @return Returns the "file-size-limit" property definition.
   */
  public SizePropertyDefinition getFileSizeLimitPropertyDefinition() {
    return PD_FILE_SIZE_LIMIT;
  }



  /**
   * Get the "java-class" property definition.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Size Limit Log Rotation Policy implementation.
   *
   * @return Returns the "java-class" property definition.
   */
  public ClassPropertyDefinition getJavaClassPropertyDefinition() {
    return PD_JAVA_CLASS;
  }



  /**
   * Managed object client implementation.
   */
  private static class SizeLimitLogRotationPolicyCfgClientImpl implements
    SizeLimitLogRotationPolicyCfgClient {

    // Private implementation.
    private ManagedObject<? extends SizeLimitLogRotationPolicyCfgClient> impl;



    // Private constructor.
    private SizeLimitLogRotationPolicyCfgClientImpl(
        ManagedObject<? extends SizeLimitLogRotationPolicyCfgClient> impl) {
      this.impl = impl;
    }



    /**
     * {@inheritDoc}
     */
    public Long getFileSizeLimit() {
      return impl.getPropertyValue(INSTANCE.getFileSizeLimitPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setFileSizeLimit(long value) {
      impl.setPropertyValue(INSTANCE.getFileSizeLimitPropertyDefinition(), value);
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
    public ManagedObjectDefinition<? extends SizeLimitLogRotationPolicyCfgClient, ? extends SizeLimitLogRotationPolicyCfg> definition() {
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
  private static class SizeLimitLogRotationPolicyCfgServerImpl implements
    SizeLimitLogRotationPolicyCfg {

    // Private implementation.
    private ServerManagedObject<? extends SizeLimitLogRotationPolicyCfg> impl;

    // The value of the "file-size-limit" property.
    private final long pFileSizeLimit;

    // The value of the "java-class" property.
    private final String pJavaClass;



    // Private constructor.
    private SizeLimitLogRotationPolicyCfgServerImpl(ServerManagedObject<? extends SizeLimitLogRotationPolicyCfg> impl) {
      this.impl = impl;
      this.pFileSizeLimit = impl.getPropertyValue(INSTANCE.getFileSizeLimitPropertyDefinition());
      this.pJavaClass = impl.getPropertyValue(INSTANCE.getJavaClassPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addSizeLimitChangeListener(
        ConfigurationChangeListener<SizeLimitLogRotationPolicyCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeSizeLimitChangeListener(
        ConfigurationChangeListener<SizeLimitLogRotationPolicyCfg> listener) {
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
    public long getFileSizeLimit() {
      return pFileSizeLimit;
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
    public Class<? extends SizeLimitLogRotationPolicyCfg> configurationClass() {
      return SizeLimitLogRotationPolicyCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
