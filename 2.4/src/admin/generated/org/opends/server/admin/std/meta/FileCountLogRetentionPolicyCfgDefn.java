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
import org.opends.server.admin.IntegerPropertyDefinition;
import org.opends.server.admin.ManagedObjectAlreadyExistsException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.PropertyOption;
import org.opends.server.admin.PropertyProvider;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.server.ServerManagedObject;
import org.opends.server.admin.std.client.FileCountLogRetentionPolicyCfgClient;
import org.opends.server.admin.std.server.FileCountLogRetentionPolicyCfg;
import org.opends.server.admin.std.server.LogRetentionPolicyCfg;
import org.opends.server.admin.Tag;
import org.opends.server.admin.UndefinedDefaultBehaviorProvider;
import org.opends.server.types.DN;



/**
 * An interface for querying the File Count Log Retention Policy
 * managed object definition meta information.
 * <p>
 * Retention policy based on the number of rotated log files on disk.
 */
public final class FileCountLogRetentionPolicyCfgDefn extends ManagedObjectDefinition<FileCountLogRetentionPolicyCfgClient, FileCountLogRetentionPolicyCfg> {

  // The singleton configuration definition instance.
  private static final FileCountLogRetentionPolicyCfgDefn INSTANCE = new FileCountLogRetentionPolicyCfgDefn();



  // The "java-class" property definition.
  private static final ClassPropertyDefinition PD_JAVA_CLASS;



  // The "number-of-files" property definition.
  private static final IntegerPropertyDefinition PD_NUMBER_OF_FILES;



  // Build the "java-class" property definition.
  static {
      ClassPropertyDefinition.Builder builder = ClassPropertyDefinition.createBuilder(INSTANCE, "java-class");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "java-class"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("org.opends.server.loggers.FileNumberRetentionPolicy");
      builder.setDefaultBehaviorProvider(provider);
      builder.addInstanceOf("org.opends.server.loggers.RetentionPolicy");
      PD_JAVA_CLASS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_JAVA_CLASS);
  }



  // Build the "number-of-files" property definition.
  static {
      IntegerPropertyDefinition.Builder builder = IntegerPropertyDefinition.createBuilder(INSTANCE, "number-of-files");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "number-of-files"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<Integer>());
      builder.setLowerLimit(1);
      PD_NUMBER_OF_FILES = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_NUMBER_OF_FILES);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("logging"));
  }



  /**
   * Get the File Count Log Retention Policy configuration definition
   * singleton.
   *
   * @return Returns the File Count Log Retention Policy configuration
   *         definition singleton.
   */
  public static FileCountLogRetentionPolicyCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private FileCountLogRetentionPolicyCfgDefn() {
    super("file-count-log-retention-policy", LogRetentionPolicyCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public FileCountLogRetentionPolicyCfgClient createClientConfiguration(
      ManagedObject<? extends FileCountLogRetentionPolicyCfgClient> impl) {
    return new FileCountLogRetentionPolicyCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public FileCountLogRetentionPolicyCfg createServerConfiguration(
      ServerManagedObject<? extends FileCountLogRetentionPolicyCfg> impl) {
    return new FileCountLogRetentionPolicyCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<FileCountLogRetentionPolicyCfg> getServerConfigurationClass() {
    return FileCountLogRetentionPolicyCfg.class;
  }



  /**
   * Get the "java-class" property definition.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the File Count Log Retention Policy implementation.
   *
   * @return Returns the "java-class" property definition.
   */
  public ClassPropertyDefinition getJavaClassPropertyDefinition() {
    return PD_JAVA_CLASS;
  }



  /**
   * Get the "number-of-files" property definition.
   * <p>
   * Specifies the number of archived log files to retain before the
   * oldest ones are cleaned.
   *
   * @return Returns the "number-of-files" property definition.
   */
  public IntegerPropertyDefinition getNumberOfFilesPropertyDefinition() {
    return PD_NUMBER_OF_FILES;
  }



  /**
   * Managed object client implementation.
   */
  private static class FileCountLogRetentionPolicyCfgClientImpl implements
    FileCountLogRetentionPolicyCfgClient {

    // Private implementation.
    private ManagedObject<? extends FileCountLogRetentionPolicyCfgClient> impl;



    // Private constructor.
    private FileCountLogRetentionPolicyCfgClientImpl(
        ManagedObject<? extends FileCountLogRetentionPolicyCfgClient> impl) {
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
    public Integer getNumberOfFiles() {
      return impl.getPropertyValue(INSTANCE.getNumberOfFilesPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setNumberOfFiles(int value) {
      impl.setPropertyValue(INSTANCE.getNumberOfFilesPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public ManagedObjectDefinition<? extends FileCountLogRetentionPolicyCfgClient, ? extends FileCountLogRetentionPolicyCfg> definition() {
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
  private static class FileCountLogRetentionPolicyCfgServerImpl implements
    FileCountLogRetentionPolicyCfg {

    // Private implementation.
    private ServerManagedObject<? extends FileCountLogRetentionPolicyCfg> impl;

    // The value of the "java-class" property.
    private final String pJavaClass;

    // The value of the "number-of-files" property.
    private final int pNumberOfFiles;



    // Private constructor.
    private FileCountLogRetentionPolicyCfgServerImpl(ServerManagedObject<? extends FileCountLogRetentionPolicyCfg> impl) {
      this.impl = impl;
      this.pJavaClass = impl.getPropertyValue(INSTANCE.getJavaClassPropertyDefinition());
      this.pNumberOfFiles = impl.getPropertyValue(INSTANCE.getNumberOfFilesPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addFileCountChangeListener(
        ConfigurationChangeListener<FileCountLogRetentionPolicyCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeFileCountChangeListener(
        ConfigurationChangeListener<FileCountLogRetentionPolicyCfg> listener) {
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
    public String getJavaClass() {
      return pJavaClass;
    }



    /**
     * {@inheritDoc}
     */
    public int getNumberOfFiles() {
      return pNumberOfFiles;
    }



    /**
     * {@inheritDoc}
     */
    public Class<? extends FileCountLogRetentionPolicyCfg> configurationClass() {
      return FileCountLogRetentionPolicyCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
