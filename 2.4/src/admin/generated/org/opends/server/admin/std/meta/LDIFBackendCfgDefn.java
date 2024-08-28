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
import org.opends.server.admin.DNPropertyDefinition;
import org.opends.server.admin.EnumPropertyDefinition;
import org.opends.server.admin.ManagedObjectAlreadyExistsException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.PropertyIsReadOnlyException;
import org.opends.server.admin.PropertyOption;
import org.opends.server.admin.PropertyProvider;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.server.ServerManagedObject;
import org.opends.server.admin.std.client.LDIFBackendCfgClient;
import org.opends.server.admin.std.meta.BackendCfgDefn.WritabilityMode;
import org.opends.server.admin.std.server.BackendCfg;
import org.opends.server.admin.std.server.LDIFBackendCfg;
import org.opends.server.admin.StringPropertyDefinition;
import org.opends.server.admin.Tag;
import org.opends.server.admin.UndefinedDefaultBehaviorProvider;
import org.opends.server.types.DN;



/**
 * An interface for querying the LDIF Backend managed object
 * definition meta information.
 * <p>
 * The LDIF Backend provides a mechanism for interacting with data
 * stored in an LDIF file.
 */
public final class LDIFBackendCfgDefn extends ManagedObjectDefinition<LDIFBackendCfgClient, LDIFBackendCfg> {

  // The singleton configuration definition instance.
  private static final LDIFBackendCfgDefn INSTANCE = new LDIFBackendCfgDefn();



  // The "is-private-backend" property definition.
  private static final BooleanPropertyDefinition PD_IS_PRIVATE_BACKEND;



  // The "java-class" property definition.
  private static final ClassPropertyDefinition PD_JAVA_CLASS;



  // The "ldif-file" property definition.
  private static final StringPropertyDefinition PD_LDIF_FILE;



  // The "writability-mode" property definition.
  private static final EnumPropertyDefinition<WritabilityMode> PD_WRITABILITY_MODE;



  // Build the "is-private-backend" property definition.
  static {
      BooleanPropertyDefinition.Builder builder = BooleanPropertyDefinition.createBuilder(INSTANCE, "is-private-backend");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.COMPONENT_RESTART, INSTANCE, "is-private-backend"));
      DefaultBehaviorProvider<Boolean> provider = new DefinedDefaultBehaviorProvider<Boolean>("false");
      builder.setDefaultBehaviorProvider(provider);
      PD_IS_PRIVATE_BACKEND = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_IS_PRIVATE_BACKEND);
  }



  // Build the "java-class" property definition.
  static {
      ClassPropertyDefinition.Builder builder = ClassPropertyDefinition.createBuilder(INSTANCE, "java-class");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.COMPONENT_RESTART, INSTANCE, "java-class"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("org.opends.server.backends.LDIFBackend");
      builder.setDefaultBehaviorProvider(provider);
      builder.addInstanceOf("org.opends.server.api.Backend");
      PD_JAVA_CLASS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_JAVA_CLASS);
  }



  // Build the "ldif-file" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "ldif-file");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.COMPONENT_RESTART, INSTANCE, "ldif-file"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<String>());
      PD_LDIF_FILE = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_LDIF_FILE);
  }



  // Build the "writability-mode" property definition.
  static {
      EnumPropertyDefinition.Builder<WritabilityMode> builder = EnumPropertyDefinition.createBuilder(INSTANCE, "writability-mode");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "writability-mode"));
      DefaultBehaviorProvider<WritabilityMode> provider = new DefinedDefaultBehaviorProvider<WritabilityMode>("enabled");
      builder.setDefaultBehaviorProvider(provider);
      builder.setEnumClass(WritabilityMode.class);
      PD_WRITABILITY_MODE = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_WRITABILITY_MODE);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("database"));
  }



  /**
   * Get the LDIF Backend configuration definition singleton.
   *
   * @return Returns the LDIF Backend configuration definition
   *         singleton.
   */
  public static LDIFBackendCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private LDIFBackendCfgDefn() {
    super("ldif-backend", BackendCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public LDIFBackendCfgClient createClientConfiguration(
      ManagedObject<? extends LDIFBackendCfgClient> impl) {
    return new LDIFBackendCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public LDIFBackendCfg createServerConfiguration(
      ServerManagedObject<? extends LDIFBackendCfg> impl) {
    return new LDIFBackendCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<LDIFBackendCfg> getServerConfigurationClass() {
    return LDIFBackendCfg.class;
  }



  /**
   * Get the "backend-id" property definition.
   * <p>
   * Specifies a name to identify the associated backend.
   * <p>
   * The name must be unique among all backends in the server. The
   * backend ID may not be altered after the backend is created in the
   * server.
   *
   * @return Returns the "backend-id" property definition.
   */
  public StringPropertyDefinition getBackendIdPropertyDefinition() {
    return BackendCfgDefn.getInstance().getBackendIdPropertyDefinition();
  }



  /**
   * Get the "base-dn" property definition.
   * <p>
   * Specifies the base DN(s) for the data that the backend handles.
   * <p>
   * A single backend may be responsible for one or more base DNs.
   * Note that no two backends may have the same base DN although one
   * backend may have a base DN that is below a base DN provided by
   * another backend (similar to the use of sub-suffixes in the Sun
   * Java System Directory Server). If any of the base DNs is
   * subordinate to a base DN for another backend, then all base DNs
   * for that backend must be subordinate to that same base DN.
   *
   * @return Returns the "base-dn" property definition.
   */
  public DNPropertyDefinition getBaseDNPropertyDefinition() {
    return BackendCfgDefn.getInstance().getBaseDNPropertyDefinition();
  }



  /**
   * Get the "enabled" property definition.
   * <p>
   * Indicates whether the backend is enabled in the server.
   * <p>
   * If a backend is not enabled, then its contents are not accessible
   * when processing operations.
   *
   * @return Returns the "enabled" property definition.
   */
  public BooleanPropertyDefinition getEnabledPropertyDefinition() {
    return BackendCfgDefn.getInstance().getEnabledPropertyDefinition();
  }



  /**
   * Get the "is-private-backend" property definition.
   * <p>
   * Indicates whether the backend should be considered a private
   * backend, which indicates that it is used for storing operational
   * data rather than user-defined information.
   *
   * @return Returns the "is-private-backend" property definition.
   */
  public BooleanPropertyDefinition getIsPrivateBackendPropertyDefinition() {
    return PD_IS_PRIVATE_BACKEND;
  }



  /**
   * Get the "java-class" property definition.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the backend implementation.
   *
   * @return Returns the "java-class" property definition.
   */
  public ClassPropertyDefinition getJavaClassPropertyDefinition() {
    return PD_JAVA_CLASS;
  }



  /**
   * Get the "ldif-file" property definition.
   * <p>
   * Specifies the path to the LDIF file containing the data for this
   * backend.
   *
   * @return Returns the "ldif-file" property definition.
   */
  public StringPropertyDefinition getLDIFFilePropertyDefinition() {
    return PD_LDIF_FILE;
  }



  /**
   * Get the "writability-mode" property definition.
   * <p>
   * Specifies the behavior that the backend should use when
   * processing write operations.
   *
   * @return Returns the "writability-mode" property definition.
   */
  public EnumPropertyDefinition<WritabilityMode> getWritabilityModePropertyDefinition() {
    return PD_WRITABILITY_MODE;
  }



  /**
   * Managed object client implementation.
   */
  private static class LDIFBackendCfgClientImpl implements
    LDIFBackendCfgClient {

    // Private implementation.
    private ManagedObject<? extends LDIFBackendCfgClient> impl;



    // Private constructor.
    private LDIFBackendCfgClientImpl(
        ManagedObject<? extends LDIFBackendCfgClient> impl) {
      this.impl = impl;
    }



    /**
     * {@inheritDoc}
     */
    public String getBackendId() {
      return impl.getPropertyValue(INSTANCE.getBackendIdPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setBackendId(String value) throws PropertyIsReadOnlyException {
      impl.setPropertyValue(INSTANCE.getBackendIdPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<DN> getBaseDN() {
      return impl.getPropertyValues(INSTANCE.getBaseDNPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setBaseDN(Collection<DN> values) {
      impl.setPropertyValues(INSTANCE.getBaseDNPropertyDefinition(), values);
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
    public boolean isIsPrivateBackend() {
      return impl.getPropertyValue(INSTANCE.getIsPrivateBackendPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setIsPrivateBackend(Boolean value) {
      impl.setPropertyValue(INSTANCE.getIsPrivateBackendPropertyDefinition(), value);
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
    public String getLDIFFile() {
      return impl.getPropertyValue(INSTANCE.getLDIFFilePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setLDIFFile(String value) {
      impl.setPropertyValue(INSTANCE.getLDIFFilePropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public WritabilityMode getWritabilityMode() {
      return impl.getPropertyValue(INSTANCE.getWritabilityModePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setWritabilityMode(WritabilityMode value) {
      impl.setPropertyValue(INSTANCE.getWritabilityModePropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public ManagedObjectDefinition<? extends LDIFBackendCfgClient, ? extends LDIFBackendCfg> definition() {
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
  private static class LDIFBackendCfgServerImpl implements
    LDIFBackendCfg {

    // Private implementation.
    private ServerManagedObject<? extends LDIFBackendCfg> impl;

    // The value of the "backend-id" property.
    private final String pBackendId;

    // The value of the "base-dn" property.
    private final SortedSet<DN> pBaseDN;

    // The value of the "enabled" property.
    private final boolean pEnabled;

    // The value of the "is-private-backend" property.
    private final boolean pIsPrivateBackend;

    // The value of the "java-class" property.
    private final String pJavaClass;

    // The value of the "ldif-file" property.
    private final String pLDIFFile;

    // The value of the "writability-mode" property.
    private final WritabilityMode pWritabilityMode;



    // Private constructor.
    private LDIFBackendCfgServerImpl(ServerManagedObject<? extends LDIFBackendCfg> impl) {
      this.impl = impl;
      this.pBackendId = impl.getPropertyValue(INSTANCE.getBackendIdPropertyDefinition());
      this.pBaseDN = impl.getPropertyValues(INSTANCE.getBaseDNPropertyDefinition());
      this.pEnabled = impl.getPropertyValue(INSTANCE.getEnabledPropertyDefinition());
      this.pIsPrivateBackend = impl.getPropertyValue(INSTANCE.getIsPrivateBackendPropertyDefinition());
      this.pJavaClass = impl.getPropertyValue(INSTANCE.getJavaClassPropertyDefinition());
      this.pLDIFFile = impl.getPropertyValue(INSTANCE.getLDIFFilePropertyDefinition());
      this.pWritabilityMode = impl.getPropertyValue(INSTANCE.getWritabilityModePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addLDIFChangeListener(
        ConfigurationChangeListener<LDIFBackendCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeLDIFChangeListener(
        ConfigurationChangeListener<LDIFBackendCfg> listener) {
      impl.deregisterChangeListener(listener);
    }
    /**
     * {@inheritDoc}
     */
    public void addChangeListener(
        ConfigurationChangeListener<BackendCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeChangeListener(
        ConfigurationChangeListener<BackendCfg> listener) {
      impl.deregisterChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public String getBackendId() {
      return pBackendId;
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<DN> getBaseDN() {
      return pBaseDN;
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
    public boolean isIsPrivateBackend() {
      return pIsPrivateBackend;
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
    public String getLDIFFile() {
      return pLDIFFile;
    }



    /**
     * {@inheritDoc}
     */
    public WritabilityMode getWritabilityMode() {
      return pWritabilityMode;
    }



    /**
     * {@inheritDoc}
     */
    public Class<? extends LDIFBackendCfg> configurationClass() {
      return LDIFBackendCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
