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
import org.opends.server.admin.condition.Conditions;
import org.opends.server.admin.DefaultBehaviorProvider;
import org.opends.server.admin.DefinedDefaultBehaviorProvider;
import org.opends.server.admin.GenericConstraint;
import org.opends.server.admin.ManagedObjectAlreadyExistsException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.PropertyOption;
import org.opends.server.admin.PropertyProvider;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.server.ServerManagedObject;
import org.opends.server.admin.std.client.FileBasedKeyManagerProviderCfgClient;
import org.opends.server.admin.std.server.FileBasedKeyManagerProviderCfg;
import org.opends.server.admin.std.server.KeyManagerProviderCfg;
import org.opends.server.admin.StringPropertyDefinition;
import org.opends.server.admin.Tag;
import org.opends.server.admin.UndefinedDefaultBehaviorProvider;
import org.opends.server.types.DN;



/**
 * An interface for querying the File Based Key Manager Provider
 * managed object definition meta information.
 * <p>
 * The File Based Key Manager Provider can be used to obtain the
 * server certificate from a key store file on the local file system.
 */
public final class FileBasedKeyManagerProviderCfgDefn extends ManagedObjectDefinition<FileBasedKeyManagerProviderCfgClient, FileBasedKeyManagerProviderCfg> {

  // The singleton configuration definition instance.
  private static final FileBasedKeyManagerProviderCfgDefn INSTANCE = new FileBasedKeyManagerProviderCfgDefn();



  // The "java-class" property definition.
  private static final ClassPropertyDefinition PD_JAVA_CLASS;



  // The "key-store-file" property definition.
  private static final StringPropertyDefinition PD_KEY_STORE_FILE;



  // The "key-store-pin" property definition.
  private static final StringPropertyDefinition PD_KEY_STORE_PIN;



  // The "key-store-pin-environment-variable" property definition.
  private static final StringPropertyDefinition PD_KEY_STORE_PIN_ENVIRONMENT_VARIABLE;



  // The "key-store-pin-file" property definition.
  private static final StringPropertyDefinition PD_KEY_STORE_PIN_FILE;



  // The "key-store-pin-property" property definition.
  private static final StringPropertyDefinition PD_KEY_STORE_PIN_PROPERTY;



  // The "key-store-type" property definition.
  private static final StringPropertyDefinition PD_KEY_STORE_TYPE;



  // Build the "java-class" property definition.
  static {
      ClassPropertyDefinition.Builder builder = ClassPropertyDefinition.createBuilder(INSTANCE, "java-class");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.COMPONENT_RESTART, INSTANCE, "java-class"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("org.opends.server.extensions.FileBasedKeyManagerProvider");
      builder.setDefaultBehaviorProvider(provider);
      builder.addInstanceOf("org.opends.server.api.KeyManagerProvider");
      PD_JAVA_CLASS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_JAVA_CLASS);
  }



  // Build the "key-store-file" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "key-store-file");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "key-store-file"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<String>());
      builder.setPattern(".*", "FILE");
      PD_KEY_STORE_FILE = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_KEY_STORE_FILE);
  }



  // Build the "key-store-pin" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "key-store-pin");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "key-store-pin"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<String>());
      PD_KEY_STORE_PIN = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_KEY_STORE_PIN);
  }



  // Build the "key-store-pin-environment-variable" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "key-store-pin-environment-variable");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "key-store-pin-environment-variable"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<String>());
      builder.setPattern(".*", "STRING");
      PD_KEY_STORE_PIN_ENVIRONMENT_VARIABLE = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_KEY_STORE_PIN_ENVIRONMENT_VARIABLE);
  }



  // Build the "key-store-pin-file" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "key-store-pin-file");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "key-store-pin-file"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<String>());
      builder.setPattern(".*", "FILE");
      PD_KEY_STORE_PIN_FILE = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_KEY_STORE_PIN_FILE);
  }



  // Build the "key-store-pin-property" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "key-store-pin-property");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "key-store-pin-property"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<String>());
      builder.setPattern(".*", "STRING");
      PD_KEY_STORE_PIN_PROPERTY = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_KEY_STORE_PIN_PROPERTY);
  }



  // Build the "key-store-type" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "key-store-type");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "key-store-type"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<String>());
      builder.setPattern(".*", "STRING");
      PD_KEY_STORE_TYPE = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_KEY_STORE_TYPE);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("security"));
  }



  // Register the constraints associated with this managed object definition.
  static {
    INSTANCE.registerConstraint(new GenericConstraint(INSTANCE, 1, Conditions.implies(Conditions.contains("enabled", "true"), Conditions.or(Conditions.isPresent("key-store-pin-property"), Conditions.isPresent("key-store-pin-environment-variable"), Conditions.isPresent("key-store-pin-file"), Conditions.isPresent("key-store-pin")))));
  }



  /**
   * Get the File Based Key Manager Provider configuration definition
   * singleton.
   *
   * @return Returns the File Based Key Manager Provider configuration
   *         definition singleton.
   */
  public static FileBasedKeyManagerProviderCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private FileBasedKeyManagerProviderCfgDefn() {
    super("file-based-key-manager-provider", KeyManagerProviderCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public FileBasedKeyManagerProviderCfgClient createClientConfiguration(
      ManagedObject<? extends FileBasedKeyManagerProviderCfgClient> impl) {
    return new FileBasedKeyManagerProviderCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public FileBasedKeyManagerProviderCfg createServerConfiguration(
      ServerManagedObject<? extends FileBasedKeyManagerProviderCfg> impl) {
    return new FileBasedKeyManagerProviderCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<FileBasedKeyManagerProviderCfg> getServerConfigurationClass() {
    return FileBasedKeyManagerProviderCfg.class;
  }



  /**
   * Get the "enabled" property definition.
   * <p>
   * Indicates whether the File Based Key Manager Provider is enabled
   * for use.
   *
   * @return Returns the "enabled" property definition.
   */
  public BooleanPropertyDefinition getEnabledPropertyDefinition() {
    return KeyManagerProviderCfgDefn.getInstance().getEnabledPropertyDefinition();
  }



  /**
   * Get the "java-class" property definition.
   * <p>
   * The fully-qualified name of the Java class that provides the File
   * Based Key Manager Provider implementation.
   *
   * @return Returns the "java-class" property definition.
   */
  public ClassPropertyDefinition getJavaClassPropertyDefinition() {
    return PD_JAVA_CLASS;
  }



  /**
   * Get the "key-store-file" property definition.
   * <p>
   * Specifies the path to the file that contains the private key
   * information. This may be an absolute path, or a path that is
   * relative to the OpenDS Directory Server instance root.
   * <p>
   * Changes to this property will take effect the next time that the
   * key manager is accessed.
   *
   * @return Returns the "key-store-file" property definition.
   */
  public StringPropertyDefinition getKeyStoreFilePropertyDefinition() {
    return PD_KEY_STORE_FILE;
  }



  /**
   * Get the "key-store-pin" property definition.
   * <p>
   * Specifies the clear-text PIN needed to access the File Based Key
   * Manager Provider .
   *
   * @return Returns the "key-store-pin" property definition.
   */
  public StringPropertyDefinition getKeyStorePinPropertyDefinition() {
    return PD_KEY_STORE_PIN;
  }



  /**
   * Get the "key-store-pin-environment-variable" property definition.
   * <p>
   * Specifies the name of the environment variable that contains the
   * clear-text PIN needed to access the File Based Key Manager
   * Provider .
   *
   * @return Returns the "key-store-pin-environment-variable" property definition.
   */
  public StringPropertyDefinition getKeyStorePinEnvironmentVariablePropertyDefinition() {
    return PD_KEY_STORE_PIN_ENVIRONMENT_VARIABLE;
  }



  /**
   * Get the "key-store-pin-file" property definition.
   * <p>
   * Specifies the path to the text file whose only contents should be
   * a single line containing the clear-text PIN needed to access the
   * File Based Key Manager Provider .
   *
   * @return Returns the "key-store-pin-file" property definition.
   */
  public StringPropertyDefinition getKeyStorePinFilePropertyDefinition() {
    return PD_KEY_STORE_PIN_FILE;
  }



  /**
   * Get the "key-store-pin-property" property definition.
   * <p>
   * Specifies the name of the Java property that contains the
   * clear-text PIN needed to access the File Based Key Manager
   * Provider .
   *
   * @return Returns the "key-store-pin-property" property definition.
   */
  public StringPropertyDefinition getKeyStorePinPropertyPropertyDefinition() {
    return PD_KEY_STORE_PIN_PROPERTY;
  }



  /**
   * Get the "key-store-type" property definition.
   * <p>
   * Specifies the format for the data in the key store file.
   * <p>
   * Valid values should always include 'JKS' and 'PKCS12', but
   * different implementations may allow other values as well. If no
   * value is provided, the JVM-default value is used. Changes to this
   * configuration attribute will take effect the next time that the
   * key manager is accessed.
   *
   * @return Returns the "key-store-type" property definition.
   */
  public StringPropertyDefinition getKeyStoreTypePropertyDefinition() {
    return PD_KEY_STORE_TYPE;
  }



  /**
   * Managed object client implementation.
   */
  private static class FileBasedKeyManagerProviderCfgClientImpl implements
    FileBasedKeyManagerProviderCfgClient {

    // Private implementation.
    private ManagedObject<? extends FileBasedKeyManagerProviderCfgClient> impl;



    // Private constructor.
    private FileBasedKeyManagerProviderCfgClientImpl(
        ManagedObject<? extends FileBasedKeyManagerProviderCfgClient> impl) {
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
    public String getKeyStoreFile() {
      return impl.getPropertyValue(INSTANCE.getKeyStoreFilePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setKeyStoreFile(String value) {
      impl.setPropertyValue(INSTANCE.getKeyStoreFilePropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public String getKeyStorePin() {
      return impl.getPropertyValue(INSTANCE.getKeyStorePinPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setKeyStorePin(String value) {
      impl.setPropertyValue(INSTANCE.getKeyStorePinPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public String getKeyStorePinEnvironmentVariable() {
      return impl.getPropertyValue(INSTANCE.getKeyStorePinEnvironmentVariablePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setKeyStorePinEnvironmentVariable(String value) {
      impl.setPropertyValue(INSTANCE.getKeyStorePinEnvironmentVariablePropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public String getKeyStorePinFile() {
      return impl.getPropertyValue(INSTANCE.getKeyStorePinFilePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setKeyStorePinFile(String value) {
      impl.setPropertyValue(INSTANCE.getKeyStorePinFilePropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public String getKeyStorePinProperty() {
      return impl.getPropertyValue(INSTANCE.getKeyStorePinPropertyPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setKeyStorePinProperty(String value) {
      impl.setPropertyValue(INSTANCE.getKeyStorePinPropertyPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public String getKeyStoreType() {
      return impl.getPropertyValue(INSTANCE.getKeyStoreTypePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setKeyStoreType(String value) {
      impl.setPropertyValue(INSTANCE.getKeyStoreTypePropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public ManagedObjectDefinition<? extends FileBasedKeyManagerProviderCfgClient, ? extends FileBasedKeyManagerProviderCfg> definition() {
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
  private static class FileBasedKeyManagerProviderCfgServerImpl implements
    FileBasedKeyManagerProviderCfg {

    // Private implementation.
    private ServerManagedObject<? extends FileBasedKeyManagerProviderCfg> impl;

    // The value of the "enabled" property.
    private final boolean pEnabled;

    // The value of the "java-class" property.
    private final String pJavaClass;

    // The value of the "key-store-file" property.
    private final String pKeyStoreFile;

    // The value of the "key-store-pin" property.
    private final String pKeyStorePin;

    // The value of the "key-store-pin-environment-variable" property.
    private final String pKeyStorePinEnvironmentVariable;

    // The value of the "key-store-pin-file" property.
    private final String pKeyStorePinFile;

    // The value of the "key-store-pin-property" property.
    private final String pKeyStorePinProperty;

    // The value of the "key-store-type" property.
    private final String pKeyStoreType;



    // Private constructor.
    private FileBasedKeyManagerProviderCfgServerImpl(ServerManagedObject<? extends FileBasedKeyManagerProviderCfg> impl) {
      this.impl = impl;
      this.pEnabled = impl.getPropertyValue(INSTANCE.getEnabledPropertyDefinition());
      this.pJavaClass = impl.getPropertyValue(INSTANCE.getJavaClassPropertyDefinition());
      this.pKeyStoreFile = impl.getPropertyValue(INSTANCE.getKeyStoreFilePropertyDefinition());
      this.pKeyStorePin = impl.getPropertyValue(INSTANCE.getKeyStorePinPropertyDefinition());
      this.pKeyStorePinEnvironmentVariable = impl.getPropertyValue(INSTANCE.getKeyStorePinEnvironmentVariablePropertyDefinition());
      this.pKeyStorePinFile = impl.getPropertyValue(INSTANCE.getKeyStorePinFilePropertyDefinition());
      this.pKeyStorePinProperty = impl.getPropertyValue(INSTANCE.getKeyStorePinPropertyPropertyDefinition());
      this.pKeyStoreType = impl.getPropertyValue(INSTANCE.getKeyStoreTypePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addFileBasedChangeListener(
        ConfigurationChangeListener<FileBasedKeyManagerProviderCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeFileBasedChangeListener(
        ConfigurationChangeListener<FileBasedKeyManagerProviderCfg> listener) {
      impl.deregisterChangeListener(listener);
    }
    /**
     * {@inheritDoc}
     */
    public void addChangeListener(
        ConfigurationChangeListener<KeyManagerProviderCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeChangeListener(
        ConfigurationChangeListener<KeyManagerProviderCfg> listener) {
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
    public String getKeyStoreFile() {
      return pKeyStoreFile;
    }



    /**
     * {@inheritDoc}
     */
    public String getKeyStorePin() {
      return pKeyStorePin;
    }



    /**
     * {@inheritDoc}
     */
    public String getKeyStorePinEnvironmentVariable() {
      return pKeyStorePinEnvironmentVariable;
    }



    /**
     * {@inheritDoc}
     */
    public String getKeyStorePinFile() {
      return pKeyStorePinFile;
    }



    /**
     * {@inheritDoc}
     */
    public String getKeyStorePinProperty() {
      return pKeyStorePinProperty;
    }



    /**
     * {@inheritDoc}
     */
    public String getKeyStoreType() {
      return pKeyStoreType;
    }



    /**
     * {@inheritDoc}
     */
    public Class<? extends FileBasedKeyManagerProviderCfg> configurationClass() {
      return FileBasedKeyManagerProviderCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
