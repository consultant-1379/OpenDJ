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
import org.opends.server.admin.std.client.SubjectEqualsDNCertificateMapperCfgClient;
import org.opends.server.admin.std.server.CertificateMapperCfg;
import org.opends.server.admin.std.server.SubjectEqualsDNCertificateMapperCfg;
import org.opends.server.admin.Tag;
import org.opends.server.types.DN;



/**
 * An interface for querying the Subject Equals DN Certificate Mapper
 * managed object definition meta information.
 * <p>
 * The Subject Equals DN Certificate Mapper maps client certificates
 * to user entries based on the assumption that the certificate subject
 * is the same as the DN of the target user entry.
 */
public final class SubjectEqualsDNCertificateMapperCfgDefn extends ManagedObjectDefinition<SubjectEqualsDNCertificateMapperCfgClient, SubjectEqualsDNCertificateMapperCfg> {

  // The singleton configuration definition instance.
  private static final SubjectEqualsDNCertificateMapperCfgDefn INSTANCE = new SubjectEqualsDNCertificateMapperCfgDefn();



  // The "java-class" property definition.
  private static final ClassPropertyDefinition PD_JAVA_CLASS;



  // Build the "java-class" property definition.
  static {
      ClassPropertyDefinition.Builder builder = ClassPropertyDefinition.createBuilder(INSTANCE, "java-class");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.COMPONENT_RESTART, INSTANCE, "java-class"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("org.opends.server.extensions.SubjectEqualsDNCertificateMapper");
      builder.setDefaultBehaviorProvider(provider);
      builder.addInstanceOf("org.opends.server.api.CertificateMapper");
      PD_JAVA_CLASS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_JAVA_CLASS);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("security"));
    INSTANCE.registerTag(Tag.valueOf("user-management"));
  }



  /**
   * Get the Subject Equals DN Certificate Mapper configuration
   * definition singleton.
   *
   * @return Returns the Subject Equals DN Certificate Mapper
   *         configuration definition singleton.
   */
  public static SubjectEqualsDNCertificateMapperCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private SubjectEqualsDNCertificateMapperCfgDefn() {
    super("subject-equals-dn-certificate-mapper", CertificateMapperCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public SubjectEqualsDNCertificateMapperCfgClient createClientConfiguration(
      ManagedObject<? extends SubjectEqualsDNCertificateMapperCfgClient> impl) {
    return new SubjectEqualsDNCertificateMapperCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public SubjectEqualsDNCertificateMapperCfg createServerConfiguration(
      ServerManagedObject<? extends SubjectEqualsDNCertificateMapperCfg> impl) {
    return new SubjectEqualsDNCertificateMapperCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<SubjectEqualsDNCertificateMapperCfg> getServerConfigurationClass() {
    return SubjectEqualsDNCertificateMapperCfg.class;
  }



  /**
   * Get the "enabled" property definition.
   * <p>
   * Indicates whether the Subject Equals DN Certificate Mapper is
   * enabled.
   *
   * @return Returns the "enabled" property definition.
   */
  public BooleanPropertyDefinition getEnabledPropertyDefinition() {
    return CertificateMapperCfgDefn.getInstance().getEnabledPropertyDefinition();
  }



  /**
   * Get the "java-class" property definition.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Subject Equals DN Certificate Mapper implementation.
   *
   * @return Returns the "java-class" property definition.
   */
  public ClassPropertyDefinition getJavaClassPropertyDefinition() {
    return PD_JAVA_CLASS;
  }



  /**
   * Managed object client implementation.
   */
  private static class SubjectEqualsDNCertificateMapperCfgClientImpl implements
    SubjectEqualsDNCertificateMapperCfgClient {

    // Private implementation.
    private ManagedObject<? extends SubjectEqualsDNCertificateMapperCfgClient> impl;



    // Private constructor.
    private SubjectEqualsDNCertificateMapperCfgClientImpl(
        ManagedObject<? extends SubjectEqualsDNCertificateMapperCfgClient> impl) {
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
    public ManagedObjectDefinition<? extends SubjectEqualsDNCertificateMapperCfgClient, ? extends SubjectEqualsDNCertificateMapperCfg> definition() {
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
  private static class SubjectEqualsDNCertificateMapperCfgServerImpl implements
    SubjectEqualsDNCertificateMapperCfg {

    // Private implementation.
    private ServerManagedObject<? extends SubjectEqualsDNCertificateMapperCfg> impl;

    // The value of the "enabled" property.
    private final boolean pEnabled;

    // The value of the "java-class" property.
    private final String pJavaClass;



    // Private constructor.
    private SubjectEqualsDNCertificateMapperCfgServerImpl(ServerManagedObject<? extends SubjectEqualsDNCertificateMapperCfg> impl) {
      this.impl = impl;
      this.pEnabled = impl.getPropertyValue(INSTANCE.getEnabledPropertyDefinition());
      this.pJavaClass = impl.getPropertyValue(INSTANCE.getJavaClassPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addSubjectEqualsDNChangeListener(
        ConfigurationChangeListener<SubjectEqualsDNCertificateMapperCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeSubjectEqualsDNChangeListener(
        ConfigurationChangeListener<SubjectEqualsDNCertificateMapperCfg> listener) {
      impl.deregisterChangeListener(listener);
    }
    /**
     * {@inheritDoc}
     */
    public void addChangeListener(
        ConfigurationChangeListener<CertificateMapperCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeChangeListener(
        ConfigurationChangeListener<CertificateMapperCfg> listener) {
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
    public Class<? extends SubjectEqualsDNCertificateMapperCfg> configurationClass() {
      return SubjectEqualsDNCertificateMapperCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
