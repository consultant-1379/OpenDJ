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
import org.opends.server.admin.AliasDefaultBehaviorProvider;
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
import org.opends.server.admin.std.client.GSSAPISASLMechanismHandlerCfgClient;
import org.opends.server.admin.std.client.IdentityMapperCfgClient;
import org.opends.server.admin.std.server.GSSAPISASLMechanismHandlerCfg;
import org.opends.server.admin.std.server.IdentityMapperCfg;
import org.opends.server.admin.std.server.SASLMechanismHandlerCfg;
import org.opends.server.admin.StringPropertyDefinition;
import org.opends.server.admin.Tag;
import org.opends.server.admin.UndefinedDefaultBehaviorProvider;
import org.opends.server.types.DN;



/**
 * An interface for querying the GSSAPI SASL Mechanism Handler managed
 * object definition meta information.
 * <p>
 * The GSSAPI SASL mechanism performs all processing related to SASL
 * GSSAPI authentication using Kerberos V5.
 */
public final class GSSAPISASLMechanismHandlerCfgDefn extends ManagedObjectDefinition<GSSAPISASLMechanismHandlerCfgClient, GSSAPISASLMechanismHandlerCfg> {

  // The singleton configuration definition instance.
  private static final GSSAPISASLMechanismHandlerCfgDefn INSTANCE = new GSSAPISASLMechanismHandlerCfgDefn();



  /**
   * Defines the set of permissable values for the "quality-of-protection" property.
   * <p>
   * The name of a property that specifies the quality of protection
   * the server will support.
   */
  public static enum QualityOfProtection {

    /**
     * Quality of protection equals authentication with integrity and
     * confidentiality protection.
     */
    CONFIDENTIALITY("confidentiality"),



    /**
     * Quality of protection equals authentication with integrity
     * protection.
     */
    INTEGRITY("integrity"),



    /**
     * QOP equals authentication only.
     */
    NONE("none");



    // String representation of the value.
    private final String name;



    // Private constructor.
    private QualityOfProtection(String name) { this.name = name; }



    /**
     * {@inheritDoc}
     */
    public String toString() { return name; }

  }



  // The "identity-mapper" property definition.
  private static final AggregationPropertyDefinition<IdentityMapperCfgClient, IdentityMapperCfg> PD_IDENTITY_MAPPER;



  // The "java-class" property definition.
  private static final ClassPropertyDefinition PD_JAVA_CLASS;



  // The "kdc-address" property definition.
  private static final StringPropertyDefinition PD_KDC_ADDRESS;



  // The "keytab" property definition.
  private static final StringPropertyDefinition PD_KEYTAB;



  // The "principal-name" property definition.
  private static final StringPropertyDefinition PD_PRINCIPAL_NAME;



  // The "quality-of-protection" property definition.
  private static final EnumPropertyDefinition<QualityOfProtection> PD_QUALITY_OF_PROTECTION;



  // The "realm" property definition.
  private static final StringPropertyDefinition PD_REALM;



  // The "server-fqdn" property definition.
  private static final StringPropertyDefinition PD_SERVER_FQDN;



  // Build the "identity-mapper" property definition.
  static {
      AggregationPropertyDefinition.Builder<IdentityMapperCfgClient, IdentityMapperCfg> builder = AggregationPropertyDefinition.createBuilder(INSTANCE, "identity-mapper");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "identity-mapper"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<String>());
      builder.setParentPath("/");
      builder.setRelationDefinition("identity-mapper");
      builder.setTargetNeedsEnablingCondition(Conditions.contains("enabled", "true"));
      builder.setTargetIsEnabledCondition(Conditions.contains("enabled", "true"));
      PD_IDENTITY_MAPPER = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_IDENTITY_MAPPER);
      INSTANCE.registerConstraint(PD_IDENTITY_MAPPER.getSourceConstraint());
  }



  // Build the "java-class" property definition.
  static {
      ClassPropertyDefinition.Builder builder = ClassPropertyDefinition.createBuilder(INSTANCE, "java-class");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.COMPONENT_RESTART, INSTANCE, "java-class"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("org.opends.server.extensions.GSSAPISASLMechanismHandler");
      builder.setDefaultBehaviorProvider(provider);
      builder.addInstanceOf("org.opends.server.api.SASLMechanismHandler");
      PD_JAVA_CLASS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_JAVA_CLASS);
  }



  // Build the "kdc-address" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "kdc-address");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "kdc-address"));
      builder.setDefaultBehaviorProvider(new AliasDefaultBehaviorProvider<String>(INSTANCE, "kdc-address"));
      PD_KDC_ADDRESS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_KDC_ADDRESS);
  }



  // Build the "keytab" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "keytab");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "keytab"));
      builder.setDefaultBehaviorProvider(new AliasDefaultBehaviorProvider<String>(INSTANCE, "keytab"));
      PD_KEYTAB = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_KEYTAB);
  }



  // Build the "principal-name" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "principal-name");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "principal-name"));
      builder.setDefaultBehaviorProvider(new AliasDefaultBehaviorProvider<String>(INSTANCE, "principal-name"));
      PD_PRINCIPAL_NAME = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_PRINCIPAL_NAME);
  }



  // Build the "quality-of-protection" property definition.
  static {
      EnumPropertyDefinition.Builder<QualityOfProtection> builder = EnumPropertyDefinition.createBuilder(INSTANCE, "quality-of-protection");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "quality-of-protection"));
      DefaultBehaviorProvider<QualityOfProtection> provider = new DefinedDefaultBehaviorProvider<QualityOfProtection>("none");
      builder.setDefaultBehaviorProvider(provider);
      builder.setEnumClass(QualityOfProtection.class);
      PD_QUALITY_OF_PROTECTION = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_QUALITY_OF_PROTECTION);
  }



  // Build the "realm" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "realm");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "realm"));
      builder.setDefaultBehaviorProvider(new AliasDefaultBehaviorProvider<String>(INSTANCE, "realm"));
      PD_REALM = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_REALM);
  }



  // Build the "server-fqdn" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "server-fqdn");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "server-fqdn"));
      builder.setDefaultBehaviorProvider(new AliasDefaultBehaviorProvider<String>(INSTANCE, "server-fqdn"));
      PD_SERVER_FQDN = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_SERVER_FQDN);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("security"));
  }



  /**
   * Get the GSSAPI SASL Mechanism Handler configuration definition
   * singleton.
   *
   * @return Returns the GSSAPI SASL Mechanism Handler configuration
   *         definition singleton.
   */
  public static GSSAPISASLMechanismHandlerCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private GSSAPISASLMechanismHandlerCfgDefn() {
    super("gssapi-sasl-mechanism-handler", SASLMechanismHandlerCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public GSSAPISASLMechanismHandlerCfgClient createClientConfiguration(
      ManagedObject<? extends GSSAPISASLMechanismHandlerCfgClient> impl) {
    return new GSSAPISASLMechanismHandlerCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public GSSAPISASLMechanismHandlerCfg createServerConfiguration(
      ServerManagedObject<? extends GSSAPISASLMechanismHandlerCfg> impl) {
    return new GSSAPISASLMechanismHandlerCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<GSSAPISASLMechanismHandlerCfg> getServerConfigurationClass() {
    return GSSAPISASLMechanismHandlerCfg.class;
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
   * Get the "identity-mapper" property definition.
   * <p>
   * Specifies the name of the identity mapper that is to be used with
   * this SASL mechanism handler to match the Kerberos principal
   * included in the SASL bind request to the corresponding user in the
   * directory.
   *
   * @return Returns the "identity-mapper" property definition.
   */
  public AggregationPropertyDefinition<IdentityMapperCfgClient, IdentityMapperCfg> getIdentityMapperPropertyDefinition() {
    return PD_IDENTITY_MAPPER;
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
   * Get the "kdc-address" property definition.
   * <p>
   * Specifies the address of the KDC that is to be used for Kerberos
   * processing.
   * <p>
   * If provided, this property must be a fully-qualified
   * DNS-resolvable name. If this property is not provided, then the
   * server attempts to determine it from the system-wide Kerberos
   * configuration.
   *
   * @return Returns the "kdc-address" property definition.
   */
  public StringPropertyDefinition getKdcAddressPropertyDefinition() {
    return PD_KDC_ADDRESS;
  }



  /**
   * Get the "keytab" property definition.
   * <p>
   * Specifies the path to the keytab file that should be used for
   * Kerberos processing.
   * <p>
   * If provided, this is either an absolute path or one that is
   * relative to the server instance root.
   *
   * @return Returns the "keytab" property definition.
   */
  public StringPropertyDefinition getKeytabPropertyDefinition() {
    return PD_KEYTAB;
  }



  /**
   * Get the "principal-name" property definition.
   * <p>
   * Specifies the principal name.
   * <p>
   * It can either be a simple user name or a service name such as
   * host/example.com. If this property is not provided, then the
   * server attempts to build the principal name by appending the fully
   * qualified domain name to the string "ldap/".
   *
   * @return Returns the "principal-name" property definition.
   */
  public StringPropertyDefinition getPrincipalNamePropertyDefinition() {
    return PD_PRINCIPAL_NAME;
  }



  /**
   * Get the "quality-of-protection" property definition.
   * <p>
   * The name of a property that specifies the quality of protection
   * the server will support.
   *
   * @return Returns the "quality-of-protection" property definition.
   */
  public EnumPropertyDefinition<QualityOfProtection> getQualityOfProtectionPropertyDefinition() {
    return PD_QUALITY_OF_PROTECTION;
  }



  /**
   * Get the "realm" property definition.
   * <p>
   * Specifies the realm to be used for GSSAPI authentication.
   *
   * @return Returns the "realm" property definition.
   */
  public StringPropertyDefinition getRealmPropertyDefinition() {
    return PD_REALM;
  }



  /**
   * Get the "server-fqdn" property definition.
   * <p>
   * Specifies the DNS-resolvable fully-qualified domain name for the
   * system.
   *
   * @return Returns the "server-fqdn" property definition.
   */
  public StringPropertyDefinition getServerFqdnPropertyDefinition() {
    return PD_SERVER_FQDN;
  }



  /**
   * Managed object client implementation.
   */
  private static class GSSAPISASLMechanismHandlerCfgClientImpl implements
    GSSAPISASLMechanismHandlerCfgClient {

    // Private implementation.
    private ManagedObject<? extends GSSAPISASLMechanismHandlerCfgClient> impl;



    // Private constructor.
    private GSSAPISASLMechanismHandlerCfgClientImpl(
        ManagedObject<? extends GSSAPISASLMechanismHandlerCfgClient> impl) {
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
    public String getIdentityMapper() {
      return impl.getPropertyValue(INSTANCE.getIdentityMapperPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setIdentityMapper(String value) {
      impl.setPropertyValue(INSTANCE.getIdentityMapperPropertyDefinition(), value);
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
    public String getKdcAddress() {
      return impl.getPropertyValue(INSTANCE.getKdcAddressPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setKdcAddress(String value) {
      impl.setPropertyValue(INSTANCE.getKdcAddressPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public String getKeytab() {
      return impl.getPropertyValue(INSTANCE.getKeytabPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setKeytab(String value) {
      impl.setPropertyValue(INSTANCE.getKeytabPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public String getPrincipalName() {
      return impl.getPropertyValue(INSTANCE.getPrincipalNamePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setPrincipalName(String value) {
      impl.setPropertyValue(INSTANCE.getPrincipalNamePropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public QualityOfProtection getQualityOfProtection() {
      return impl.getPropertyValue(INSTANCE.getQualityOfProtectionPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setQualityOfProtection(QualityOfProtection value) {
      impl.setPropertyValue(INSTANCE.getQualityOfProtectionPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public String getRealm() {
      return impl.getPropertyValue(INSTANCE.getRealmPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setRealm(String value) {
      impl.setPropertyValue(INSTANCE.getRealmPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public String getServerFqdn() {
      return impl.getPropertyValue(INSTANCE.getServerFqdnPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setServerFqdn(String value) {
      impl.setPropertyValue(INSTANCE.getServerFqdnPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public ManagedObjectDefinition<? extends GSSAPISASLMechanismHandlerCfgClient, ? extends GSSAPISASLMechanismHandlerCfg> definition() {
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
  private static class GSSAPISASLMechanismHandlerCfgServerImpl implements
    GSSAPISASLMechanismHandlerCfg {

    // Private implementation.
    private ServerManagedObject<? extends GSSAPISASLMechanismHandlerCfg> impl;

    // The value of the "enabled" property.
    private final boolean pEnabled;

    // The value of the "identity-mapper" property.
    private final String pIdentityMapper;

    // The value of the "java-class" property.
    private final String pJavaClass;

    // The value of the "kdc-address" property.
    private final String pKdcAddress;

    // The value of the "keytab" property.
    private final String pKeytab;

    // The value of the "principal-name" property.
    private final String pPrincipalName;

    // The value of the "quality-of-protection" property.
    private final QualityOfProtection pQualityOfProtection;

    // The value of the "realm" property.
    private final String pRealm;

    // The value of the "server-fqdn" property.
    private final String pServerFqdn;



    // Private constructor.
    private GSSAPISASLMechanismHandlerCfgServerImpl(ServerManagedObject<? extends GSSAPISASLMechanismHandlerCfg> impl) {
      this.impl = impl;
      this.pEnabled = impl.getPropertyValue(INSTANCE.getEnabledPropertyDefinition());
      this.pIdentityMapper = impl.getPropertyValue(INSTANCE.getIdentityMapperPropertyDefinition());
      this.pJavaClass = impl.getPropertyValue(INSTANCE.getJavaClassPropertyDefinition());
      this.pKdcAddress = impl.getPropertyValue(INSTANCE.getKdcAddressPropertyDefinition());
      this.pKeytab = impl.getPropertyValue(INSTANCE.getKeytabPropertyDefinition());
      this.pPrincipalName = impl.getPropertyValue(INSTANCE.getPrincipalNamePropertyDefinition());
      this.pQualityOfProtection = impl.getPropertyValue(INSTANCE.getQualityOfProtectionPropertyDefinition());
      this.pRealm = impl.getPropertyValue(INSTANCE.getRealmPropertyDefinition());
      this.pServerFqdn = impl.getPropertyValue(INSTANCE.getServerFqdnPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addGSSAPIChangeListener(
        ConfigurationChangeListener<GSSAPISASLMechanismHandlerCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeGSSAPIChangeListener(
        ConfigurationChangeListener<GSSAPISASLMechanismHandlerCfg> listener) {
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
    public boolean isEnabled() {
      return pEnabled;
    }



    /**
     * {@inheritDoc}
     */
    public String getIdentityMapper() {
      return pIdentityMapper;
    }



    /**
     * {@inheritDoc}
     */
    public DN getIdentityMapperDN() {
      String value = getIdentityMapper();
      if (value == null) return null;
      return INSTANCE.getIdentityMapperPropertyDefinition().getChildDN(value);
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
    public String getKdcAddress() {
      return pKdcAddress;
    }



    /**
     * {@inheritDoc}
     */
    public String getKeytab() {
      return pKeytab;
    }



    /**
     * {@inheritDoc}
     */
    public String getPrincipalName() {
      return pPrincipalName;
    }



    /**
     * {@inheritDoc}
     */
    public QualityOfProtection getQualityOfProtection() {
      return pQualityOfProtection;
    }



    /**
     * {@inheritDoc}
     */
    public String getRealm() {
      return pRealm;
    }



    /**
     * {@inheritDoc}
     */
    public String getServerFqdn() {
      return pServerFqdn;
    }



    /**
     * {@inheritDoc}
     */
    public Class<? extends GSSAPISASLMechanismHandlerCfg> configurationClass() {
      return GSSAPISASLMechanismHandlerCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
