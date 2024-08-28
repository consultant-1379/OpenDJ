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
import org.opends.server.admin.AggregationPropertyDefinition;
import org.opends.server.admin.AttributeTypePropertyDefinition;
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
import org.opends.server.admin.EnumPropertyDefinition;
import org.opends.server.admin.ManagedObjectAlreadyExistsException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.PropertyOption;
import org.opends.server.admin.PropertyProvider;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.server.ServerManagedObject;
import org.opends.server.admin.std.client.CertificateMapperCfgClient;
import org.opends.server.admin.std.client.ExternalSASLMechanismHandlerCfgClient;
import org.opends.server.admin.std.server.CertificateMapperCfg;
import org.opends.server.admin.std.server.ExternalSASLMechanismHandlerCfg;
import org.opends.server.admin.std.server.SASLMechanismHandlerCfg;
import org.opends.server.admin.Tag;
import org.opends.server.admin.UndefinedDefaultBehaviorProvider;
import org.opends.server.types.AttributeType;
import org.opends.server.types.DN;



/**
 * An interface for querying the External SASL Mechanism Handler
 * managed object definition meta information.
 * <p>
 * The External SASL Mechanism Handler performs all processing related
 * to SASL EXTERNAL authentication.
 */
public final class ExternalSASLMechanismHandlerCfgDefn extends ManagedObjectDefinition<ExternalSASLMechanismHandlerCfgClient, ExternalSASLMechanismHandlerCfg> {

  // The singleton configuration definition instance.
  private static final ExternalSASLMechanismHandlerCfgDefn INSTANCE = new ExternalSASLMechanismHandlerCfgDefn();



  /**
   * Defines the set of permissable values for the "certificate-validation-policy" property.
   * <p>
   * Indicates whether to attempt to validate the peer certificate
   * against a certificate held in the user's entry.
   */
  public static enum CertificateValidationPolicy {

    /**
     * Always require the peer certificate to be present in the user's
     * entry.
     */
    ALWAYS("always"),



    /**
     * If the user's entry contains one or more certificates, require
     * that one of them match the peer certificate.
     */
    IFPRESENT("ifpresent"),



    /**
     * Do not look for the peer certificate to be present in the
     * user's entry.
     */
    NEVER("never");



    // String representation of the value.
    private final String name;



    // Private constructor.
    private CertificateValidationPolicy(String name) { this.name = name; }



    /**
     * {@inheritDoc}
     */
    public String toString() { return name; }

  }



  // The "certificate-attribute" property definition.
  private static final AttributeTypePropertyDefinition PD_CERTIFICATE_ATTRIBUTE;



  // The "certificate-mapper" property definition.
  private static final AggregationPropertyDefinition<CertificateMapperCfgClient, CertificateMapperCfg> PD_CERTIFICATE_MAPPER;



  // The "certificate-validation-policy" property definition.
  private static final EnumPropertyDefinition<CertificateValidationPolicy> PD_CERTIFICATE_VALIDATION_POLICY;



  // The "java-class" property definition.
  private static final ClassPropertyDefinition PD_JAVA_CLASS;



  // Build the "certificate-attribute" property definition.
  static {
      AttributeTypePropertyDefinition.Builder builder = AttributeTypePropertyDefinition.createBuilder(INSTANCE, "certificate-attribute");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "certificate-attribute"));
      DefaultBehaviorProvider<AttributeType> provider = new DefinedDefaultBehaviorProvider<AttributeType>("userCertificate");
      builder.setDefaultBehaviorProvider(provider);
      PD_CERTIFICATE_ATTRIBUTE = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_CERTIFICATE_ATTRIBUTE);
  }



  // Build the "certificate-mapper" property definition.
  static {
      AggregationPropertyDefinition.Builder<CertificateMapperCfgClient, CertificateMapperCfg> builder = AggregationPropertyDefinition.createBuilder(INSTANCE, "certificate-mapper");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "certificate-mapper"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<String>());
      builder.setParentPath("/");
      builder.setRelationDefinition("certificate-mapper");
      builder.setTargetNeedsEnablingCondition(Conditions.contains("enabled", "true"));
      builder.setTargetIsEnabledCondition(Conditions.contains("enabled", "true"));
      PD_CERTIFICATE_MAPPER = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_CERTIFICATE_MAPPER);
      INSTANCE.registerConstraint(PD_CERTIFICATE_MAPPER.getSourceConstraint());
  }



  // Build the "certificate-validation-policy" property definition.
  static {
      EnumPropertyDefinition.Builder<CertificateValidationPolicy> builder = EnumPropertyDefinition.createBuilder(INSTANCE, "certificate-validation-policy");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "certificate-validation-policy"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<CertificateValidationPolicy>());
      builder.setEnumClass(CertificateValidationPolicy.class);
      PD_CERTIFICATE_VALIDATION_POLICY = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_CERTIFICATE_VALIDATION_POLICY);
  }



  // Build the "java-class" property definition.
  static {
      ClassPropertyDefinition.Builder builder = ClassPropertyDefinition.createBuilder(INSTANCE, "java-class");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.COMPONENT_RESTART, INSTANCE, "java-class"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("org.opends.server.extensions.ExternalSASLMechanismHandler");
      builder.setDefaultBehaviorProvider(provider);
      builder.addInstanceOf("org.opends.server.api.SASLMechanismHandler");
      PD_JAVA_CLASS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_JAVA_CLASS);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("security"));
  }



  /**
   * Get the External SASL Mechanism Handler configuration definition
   * singleton.
   *
   * @return Returns the External SASL Mechanism Handler configuration
   *         definition singleton.
   */
  public static ExternalSASLMechanismHandlerCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private ExternalSASLMechanismHandlerCfgDefn() {
    super("external-sasl-mechanism-handler", SASLMechanismHandlerCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public ExternalSASLMechanismHandlerCfgClient createClientConfiguration(
      ManagedObject<? extends ExternalSASLMechanismHandlerCfgClient> impl) {
    return new ExternalSASLMechanismHandlerCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public ExternalSASLMechanismHandlerCfg createServerConfiguration(
      ServerManagedObject<? extends ExternalSASLMechanismHandlerCfg> impl) {
    return new ExternalSASLMechanismHandlerCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<ExternalSASLMechanismHandlerCfg> getServerConfigurationClass() {
    return ExternalSASLMechanismHandlerCfg.class;
  }



  /**
   * Get the "certificate-attribute" property definition.
   * <p>
   * Specifies the name of the attribute to hold user certificates.
   * <p>
   * This property must specify the name of a valid attribute type
   * defined in the server schema.
   *
   * @return Returns the "certificate-attribute" property definition.
   */
  public AttributeTypePropertyDefinition getCertificateAttributePropertyDefinition() {
    return PD_CERTIFICATE_ATTRIBUTE;
  }



  /**
   * Get the "certificate-mapper" property definition.
   * <p>
   * Specifies the name of the certificate mapper that should be used
   * to match client certificates to user entries.
   *
   * @return Returns the "certificate-mapper" property definition.
   */
  public AggregationPropertyDefinition<CertificateMapperCfgClient, CertificateMapperCfg> getCertificateMapperPropertyDefinition() {
    return PD_CERTIFICATE_MAPPER;
  }



  /**
   * Get the "certificate-validation-policy" property definition.
   * <p>
   * Indicates whether to attempt to validate the peer certificate
   * against a certificate held in the user's entry.
   *
   * @return Returns the "certificate-validation-policy" property definition.
   */
  public EnumPropertyDefinition<CertificateValidationPolicy> getCertificateValidationPolicyPropertyDefinition() {
    return PD_CERTIFICATE_VALIDATION_POLICY;
  }



  /**
   * Get the "enabled" property definition.
   * <p>
   * Indicates whether the SASL mechanism handler is enabled for use.
   *
   * @return Returns the "enabled" property definition.
   */
  public BooleanPropertyDefinition getEnabledPropertyDefinition() {
    return SASLMechanismHandlerCfgDefn.getInstance().getEnabledPropertyDefinition();
  }



  /**
   * Get the "java-class" property definition.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the SASL mechanism handler implementation.
   *
   * @return Returns the "java-class" property definition.
   */
  public ClassPropertyDefinition getJavaClassPropertyDefinition() {
    return PD_JAVA_CLASS;
  }



  /**
   * Managed object client implementation.
   */
  private static class ExternalSASLMechanismHandlerCfgClientImpl implements
    ExternalSASLMechanismHandlerCfgClient {

    // Private implementation.
    private ManagedObject<? extends ExternalSASLMechanismHandlerCfgClient> impl;



    // Private constructor.
    private ExternalSASLMechanismHandlerCfgClientImpl(
        ManagedObject<? extends ExternalSASLMechanismHandlerCfgClient> impl) {
      this.impl = impl;
    }



    /**
     * {@inheritDoc}
     */
    public AttributeType getCertificateAttribute() {
      return impl.getPropertyValue(INSTANCE.getCertificateAttributePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setCertificateAttribute(AttributeType value) {
      impl.setPropertyValue(INSTANCE.getCertificateAttributePropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public String getCertificateMapper() {
      return impl.getPropertyValue(INSTANCE.getCertificateMapperPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setCertificateMapper(String value) {
      impl.setPropertyValue(INSTANCE.getCertificateMapperPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public CertificateValidationPolicy getCertificateValidationPolicy() {
      return impl.getPropertyValue(INSTANCE.getCertificateValidationPolicyPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setCertificateValidationPolicy(CertificateValidationPolicy value) {
      impl.setPropertyValue(INSTANCE.getCertificateValidationPolicyPropertyDefinition(), value);
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
    public ManagedObjectDefinition<? extends ExternalSASLMechanismHandlerCfgClient, ? extends ExternalSASLMechanismHandlerCfg> definition() {
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
  private static class ExternalSASLMechanismHandlerCfgServerImpl implements
    ExternalSASLMechanismHandlerCfg {

    // Private implementation.
    private ServerManagedObject<? extends ExternalSASLMechanismHandlerCfg> impl;

    // The value of the "certificate-attribute" property.
    private final AttributeType pCertificateAttribute;

    // The value of the "certificate-mapper" property.
    private final String pCertificateMapper;

    // The value of the "certificate-validation-policy" property.
    private final CertificateValidationPolicy pCertificateValidationPolicy;

    // The value of the "enabled" property.
    private final boolean pEnabled;

    // The value of the "java-class" property.
    private final String pJavaClass;



    // Private constructor.
    private ExternalSASLMechanismHandlerCfgServerImpl(ServerManagedObject<? extends ExternalSASLMechanismHandlerCfg> impl) {
      this.impl = impl;
      this.pCertificateAttribute = impl.getPropertyValue(INSTANCE.getCertificateAttributePropertyDefinition());
      this.pCertificateMapper = impl.getPropertyValue(INSTANCE.getCertificateMapperPropertyDefinition());
      this.pCertificateValidationPolicy = impl.getPropertyValue(INSTANCE.getCertificateValidationPolicyPropertyDefinition());
      this.pEnabled = impl.getPropertyValue(INSTANCE.getEnabledPropertyDefinition());
      this.pJavaClass = impl.getPropertyValue(INSTANCE.getJavaClassPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addExternalChangeListener(
        ConfigurationChangeListener<ExternalSASLMechanismHandlerCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeExternalChangeListener(
        ConfigurationChangeListener<ExternalSASLMechanismHandlerCfg> listener) {
      impl.deregisterChangeListener(listener);
    }
    /**
     * {@inheritDoc}
     */
    public void addChangeListener(
        ConfigurationChangeListener<SASLMechanismHandlerCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeChangeListener(
        ConfigurationChangeListener<SASLMechanismHandlerCfg> listener) {
      impl.deregisterChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public AttributeType getCertificateAttribute() {
      return pCertificateAttribute;
    }



    /**
     * {@inheritDoc}
     */
    public String getCertificateMapper() {
      return pCertificateMapper;
    }



    /**
     * {@inheritDoc}
     */
    public DN getCertificateMapperDN() {
      String value = getCertificateMapper();
      if (value == null) return null;
      return INSTANCE.getCertificateMapperPropertyDefinition().getChildDN(value);
    }



    /**
     * {@inheritDoc}
     */
    public CertificateValidationPolicy getCertificateValidationPolicy() {
      return pCertificateValidationPolicy;
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
    public Class<? extends ExternalSASLMechanismHandlerCfg> configurationClass() {
      return ExternalSASLMechanismHandlerCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
