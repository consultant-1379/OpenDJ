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
import org.opends.server.admin.AliasDefaultBehaviorProvider;
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
import org.opends.server.admin.ManagedObjectAlreadyExistsException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.PropertyOption;
import org.opends.server.admin.PropertyProvider;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.server.ServerManagedObject;
import org.opends.server.admin.std.client.SubjectAttributeToUserAttributeCertificateMapperCfgClient;
import org.opends.server.admin.std.server.CertificateMapperCfg;
import org.opends.server.admin.std.server.SubjectAttributeToUserAttributeCertificateMapperCfg;
import org.opends.server.admin.StringPropertyDefinition;
import org.opends.server.admin.Tag;
import org.opends.server.admin.UndefinedDefaultBehaviorProvider;
import org.opends.server.types.DN;



/**
 * An interface for querying the Subject Attribute To User Attribute
 * Certificate Mapper managed object definition meta information.
 * <p>
 * The Subject Attribute To User Attribute Certificate Mapper maps
 * client certificates to user entries by mapping the values of
 * attributes contained in the certificate subject to attributes
 * contained in user entries.
 */
public final class SubjectAttributeToUserAttributeCertificateMapperCfgDefn extends ManagedObjectDefinition<SubjectAttributeToUserAttributeCertificateMapperCfgClient, SubjectAttributeToUserAttributeCertificateMapperCfg> {

  // The singleton configuration definition instance.
  private static final SubjectAttributeToUserAttributeCertificateMapperCfgDefn INSTANCE = new SubjectAttributeToUserAttributeCertificateMapperCfgDefn();



  // The "java-class" property definition.
  private static final ClassPropertyDefinition PD_JAVA_CLASS;



  // The "subject-attribute-mapping" property definition.
  private static final StringPropertyDefinition PD_SUBJECT_ATTRIBUTE_MAPPING;



  // The "user-base-dn" property definition.
  private static final DNPropertyDefinition PD_USER_BASE_DN;



  // Build the "java-class" property definition.
  static {
      ClassPropertyDefinition.Builder builder = ClassPropertyDefinition.createBuilder(INSTANCE, "java-class");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.COMPONENT_RESTART, INSTANCE, "java-class"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("org.opends.server.extensions.SubjectAttributeToUserAttributeCertificateMapper");
      builder.setDefaultBehaviorProvider(provider);
      builder.addInstanceOf("org.opends.server.api.CertificateMapper");
      PD_JAVA_CLASS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_JAVA_CLASS);
  }



  // Build the "subject-attribute-mapping" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "subject-attribute-mapping");
      builder.setOption(PropertyOption.MULTI_VALUED);
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "subject-attribute-mapping"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<String>());
      PD_SUBJECT_ATTRIBUTE_MAPPING = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_SUBJECT_ATTRIBUTE_MAPPING);
  }



  // Build the "user-base-dn" property definition.
  static {
      DNPropertyDefinition.Builder builder = DNPropertyDefinition.createBuilder(INSTANCE, "user-base-dn");
      builder.setOption(PropertyOption.MULTI_VALUED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "user-base-dn"));
      builder.setDefaultBehaviorProvider(new AliasDefaultBehaviorProvider<DN>(INSTANCE, "user-base-dn"));
      PD_USER_BASE_DN = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_USER_BASE_DN);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("security"));
    INSTANCE.registerTag(Tag.valueOf("user-management"));
  }



  /**
   * Get the Subject Attribute To User Attribute Certificate Mapper
   * configuration definition singleton.
   *
   * @return Returns the Subject Attribute To User Attribute
   *         Certificate Mapper configuration definition singleton.
   */
  public static SubjectAttributeToUserAttributeCertificateMapperCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private SubjectAttributeToUserAttributeCertificateMapperCfgDefn() {
    super("subject-attribute-to-user-attribute-certificate-mapper", CertificateMapperCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public SubjectAttributeToUserAttributeCertificateMapperCfgClient createClientConfiguration(
      ManagedObject<? extends SubjectAttributeToUserAttributeCertificateMapperCfgClient> impl) {
    return new SubjectAttributeToUserAttributeCertificateMapperCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public SubjectAttributeToUserAttributeCertificateMapperCfg createServerConfiguration(
      ServerManagedObject<? extends SubjectAttributeToUserAttributeCertificateMapperCfg> impl) {
    return new SubjectAttributeToUserAttributeCertificateMapperCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<SubjectAttributeToUserAttributeCertificateMapperCfg> getServerConfigurationClass() {
    return SubjectAttributeToUserAttributeCertificateMapperCfg.class;
  }



  /**
   * Get the "enabled" property definition.
   * <p>
   * Indicates whether the Subject Attribute To User Attribute
   * Certificate Mapper is enabled.
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
   * provides the Subject Attribute To User Attribute Certificate
   * Mapper implementation.
   *
   * @return Returns the "java-class" property definition.
   */
  public ClassPropertyDefinition getJavaClassPropertyDefinition() {
    return PD_JAVA_CLASS;
  }



  /**
   * Get the "subject-attribute-mapping" property definition.
   * <p>
   * Specifies a mapping between certificate attributes and user
   * attributes.
   * <p>
   * Each value should be in the form "certattr:userattr" where
   * certattr is the name of the attribute in the certificate subject
   * and userattr is the name of the corresponding attribute in user
   * entries. There may be multiple mappings defined, and when
   * performing the mapping values for all attributes present in the
   * certificate subject that have mappings defined must be present in
   * the corresponding user entries.
   *
   * @return Returns the "subject-attribute-mapping" property definition.
   */
  public StringPropertyDefinition getSubjectAttributeMappingPropertyDefinition() {
    return PD_SUBJECT_ATTRIBUTE_MAPPING;
  }



  /**
   * Get the "user-base-dn" property definition.
   * <p>
   * Specifies the base DNs that should be used when performing
   * searches to map the client certificate to a user entry.
   *
   * @return Returns the "user-base-dn" property definition.
   */
  public DNPropertyDefinition getUserBaseDNPropertyDefinition() {
    return PD_USER_BASE_DN;
  }



  /**
   * Managed object client implementation.
   */
  private static class SubjectAttributeToUserAttributeCertificateMapperCfgClientImpl implements
    SubjectAttributeToUserAttributeCertificateMapperCfgClient {

    // Private implementation.
    private ManagedObject<? extends SubjectAttributeToUserAttributeCertificateMapperCfgClient> impl;



    // Private constructor.
    private SubjectAttributeToUserAttributeCertificateMapperCfgClientImpl(
        ManagedObject<? extends SubjectAttributeToUserAttributeCertificateMapperCfgClient> impl) {
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
    public SortedSet<String> getSubjectAttributeMapping() {
      return impl.getPropertyValues(INSTANCE.getSubjectAttributeMappingPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setSubjectAttributeMapping(Collection<String> values) {
      impl.setPropertyValues(INSTANCE.getSubjectAttributeMappingPropertyDefinition(), values);
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<DN> getUserBaseDN() {
      return impl.getPropertyValues(INSTANCE.getUserBaseDNPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setUserBaseDN(Collection<DN> values) {
      impl.setPropertyValues(INSTANCE.getUserBaseDNPropertyDefinition(), values);
    }



    /**
     * {@inheritDoc}
     */
    public ManagedObjectDefinition<? extends SubjectAttributeToUserAttributeCertificateMapperCfgClient, ? extends SubjectAttributeToUserAttributeCertificateMapperCfg> definition() {
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
  private static class SubjectAttributeToUserAttributeCertificateMapperCfgServerImpl implements
    SubjectAttributeToUserAttributeCertificateMapperCfg {

    // Private implementation.
    private ServerManagedObject<? extends SubjectAttributeToUserAttributeCertificateMapperCfg> impl;

    // The value of the "enabled" property.
    private final boolean pEnabled;

    // The value of the "java-class" property.
    private final String pJavaClass;

    // The value of the "subject-attribute-mapping" property.
    private final SortedSet<String> pSubjectAttributeMapping;

    // The value of the "user-base-dn" property.
    private final SortedSet<DN> pUserBaseDN;



    // Private constructor.
    private SubjectAttributeToUserAttributeCertificateMapperCfgServerImpl(ServerManagedObject<? extends SubjectAttributeToUserAttributeCertificateMapperCfg> impl) {
      this.impl = impl;
      this.pEnabled = impl.getPropertyValue(INSTANCE.getEnabledPropertyDefinition());
      this.pJavaClass = impl.getPropertyValue(INSTANCE.getJavaClassPropertyDefinition());
      this.pSubjectAttributeMapping = impl.getPropertyValues(INSTANCE.getSubjectAttributeMappingPropertyDefinition());
      this.pUserBaseDN = impl.getPropertyValues(INSTANCE.getUserBaseDNPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addSubjectAttributeToUserAttributeChangeListener(
        ConfigurationChangeListener<SubjectAttributeToUserAttributeCertificateMapperCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeSubjectAttributeToUserAttributeChangeListener(
        ConfigurationChangeListener<SubjectAttributeToUserAttributeCertificateMapperCfg> listener) {
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
    public SortedSet<String> getSubjectAttributeMapping() {
      return pSubjectAttributeMapping;
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<DN> getUserBaseDN() {
      return pUserBaseDN;
    }



    /**
     * {@inheritDoc}
     */
    public Class<? extends SubjectAttributeToUserAttributeCertificateMapperCfg> configurationClass() {
      return SubjectAttributeToUserAttributeCertificateMapperCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
