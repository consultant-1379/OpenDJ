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
import org.opends.server.admin.AttributeTypePropertyDefinition;
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
import org.opends.server.admin.PropertyOption;
import org.opends.server.admin.PropertyProvider;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.server.ServerManagedObject;
import org.opends.server.admin.std.client.FingerprintCertificateMapperCfgClient;
import org.opends.server.admin.std.server.CertificateMapperCfg;
import org.opends.server.admin.std.server.FingerprintCertificateMapperCfg;
import org.opends.server.admin.Tag;
import org.opends.server.admin.UndefinedDefaultBehaviorProvider;
import org.opends.server.types.AttributeType;
import org.opends.server.types.DN;



/**
 * An interface for querying the Fingerprint Certificate Mapper
 * managed object definition meta information.
 * <p>
 * The Fingerprint Certificate Mapper maps client certificates to user
 * entries by looking for the MD5 or SHA1 fingerprint in a specified
 * attribute of user entries.
 */
public final class FingerprintCertificateMapperCfgDefn extends ManagedObjectDefinition<FingerprintCertificateMapperCfgClient, FingerprintCertificateMapperCfg> {

  // The singleton configuration definition instance.
  private static final FingerprintCertificateMapperCfgDefn INSTANCE = new FingerprintCertificateMapperCfgDefn();



  /**
   * Defines the set of permissable values for the "fingerprint-algorithm" property.
   * <p>
   * Specifies the name of the digest algorithm to compute the
   * fingerprint of client certificates.
   */
  public static enum FingerprintAlgorithm {

    /**
     * Use the MD5 digest algorithm to compute certificate
     * fingerprints.
     */
    MD5("md5"),



    /**
     * Use the SHA-1 digest algorithm to compute certificate
     * fingerprints.
     */
    SHA1("sha1");



    // String representation of the value.
    private final String name;



    // Private constructor.
    private FingerprintAlgorithm(String name) { this.name = name; }



    /**
     * {@inheritDoc}
     */
    public String toString() { return name; }

  }



  // The "fingerprint-algorithm" property definition.
  private static final EnumPropertyDefinition<FingerprintAlgorithm> PD_FINGERPRINT_ALGORITHM;



  // The "fingerprint-attribute" property definition.
  private static final AttributeTypePropertyDefinition PD_FINGERPRINT_ATTRIBUTE;



  // The "java-class" property definition.
  private static final ClassPropertyDefinition PD_JAVA_CLASS;



  // The "user-base-dn" property definition.
  private static final DNPropertyDefinition PD_USER_BASE_DN;



  // Build the "fingerprint-algorithm" property definition.
  static {
      EnumPropertyDefinition.Builder<FingerprintAlgorithm> builder = EnumPropertyDefinition.createBuilder(INSTANCE, "fingerprint-algorithm");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "fingerprint-algorithm"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<FingerprintAlgorithm>());
      builder.setEnumClass(FingerprintAlgorithm.class);
      PD_FINGERPRINT_ALGORITHM = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_FINGERPRINT_ALGORITHM);
  }



  // Build the "fingerprint-attribute" property definition.
  static {
      AttributeTypePropertyDefinition.Builder builder = AttributeTypePropertyDefinition.createBuilder(INSTANCE, "fingerprint-attribute");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "fingerprint-attribute"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<AttributeType>());
      PD_FINGERPRINT_ATTRIBUTE = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_FINGERPRINT_ATTRIBUTE);
  }



  // Build the "java-class" property definition.
  static {
      ClassPropertyDefinition.Builder builder = ClassPropertyDefinition.createBuilder(INSTANCE, "java-class");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.COMPONENT_RESTART, INSTANCE, "java-class"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("org.opends.server.extensions.FingerprintCertificateMapper");
      builder.setDefaultBehaviorProvider(provider);
      builder.addInstanceOf("org.opends.server.api.CertificateMapper");
      PD_JAVA_CLASS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_JAVA_CLASS);
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
   * Get the Fingerprint Certificate Mapper configuration definition
   * singleton.
   *
   * @return Returns the Fingerprint Certificate Mapper configuration
   *         definition singleton.
   */
  public static FingerprintCertificateMapperCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private FingerprintCertificateMapperCfgDefn() {
    super("fingerprint-certificate-mapper", CertificateMapperCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public FingerprintCertificateMapperCfgClient createClientConfiguration(
      ManagedObject<? extends FingerprintCertificateMapperCfgClient> impl) {
    return new FingerprintCertificateMapperCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public FingerprintCertificateMapperCfg createServerConfiguration(
      ServerManagedObject<? extends FingerprintCertificateMapperCfg> impl) {
    return new FingerprintCertificateMapperCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<FingerprintCertificateMapperCfg> getServerConfigurationClass() {
    return FingerprintCertificateMapperCfg.class;
  }



  /**
   * Get the "enabled" property definition.
   * <p>
   * Indicates whether the Fingerprint Certificate Mapper is enabled.
   *
   * @return Returns the "enabled" property definition.
   */
  public BooleanPropertyDefinition getEnabledPropertyDefinition() {
    return CertificateMapperCfgDefn.getInstance().getEnabledPropertyDefinition();
  }



  /**
   * Get the "fingerprint-algorithm" property definition.
   * <p>
   * Specifies the name of the digest algorithm to compute the
   * fingerprint of client certificates.
   *
   * @return Returns the "fingerprint-algorithm" property definition.
   */
  public EnumPropertyDefinition<FingerprintAlgorithm> getFingerprintAlgorithmPropertyDefinition() {
    return PD_FINGERPRINT_ALGORITHM;
  }



  /**
   * Get the "fingerprint-attribute" property definition.
   * <p>
   * Specifies the attribute in which to look for the fingerprint.
   * <p>
   * Values of the fingerprint attribute should exactly match the MD5
   * or SHA1 representation of the certificate fingerprint.
   *
   * @return Returns the "fingerprint-attribute" property definition.
   */
  public AttributeTypePropertyDefinition getFingerprintAttributePropertyDefinition() {
    return PD_FINGERPRINT_ATTRIBUTE;
  }



  /**
   * Get the "java-class" property definition.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Fingerprint Certificate Mapper implementation.
   *
   * @return Returns the "java-class" property definition.
   */
  public ClassPropertyDefinition getJavaClassPropertyDefinition() {
    return PD_JAVA_CLASS;
  }



  /**
   * Get the "user-base-dn" property definition.
   * <p>
   * Specifies the set of base DNs below which to search for users.
   * <p>
   * The base DNs are used when performing searches to map the client
   * certificates to a user entry.
   *
   * @return Returns the "user-base-dn" property definition.
   */
  public DNPropertyDefinition getUserBaseDNPropertyDefinition() {
    return PD_USER_BASE_DN;
  }



  /**
   * Managed object client implementation.
   */
  private static class FingerprintCertificateMapperCfgClientImpl implements
    FingerprintCertificateMapperCfgClient {

    // Private implementation.
    private ManagedObject<? extends FingerprintCertificateMapperCfgClient> impl;



    // Private constructor.
    private FingerprintCertificateMapperCfgClientImpl(
        ManagedObject<? extends FingerprintCertificateMapperCfgClient> impl) {
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
    public FingerprintAlgorithm getFingerprintAlgorithm() {
      return impl.getPropertyValue(INSTANCE.getFingerprintAlgorithmPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setFingerprintAlgorithm(FingerprintAlgorithm value) {
      impl.setPropertyValue(INSTANCE.getFingerprintAlgorithmPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public AttributeType getFingerprintAttribute() {
      return impl.getPropertyValue(INSTANCE.getFingerprintAttributePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setFingerprintAttribute(AttributeType value) {
      impl.setPropertyValue(INSTANCE.getFingerprintAttributePropertyDefinition(), value);
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
    public ManagedObjectDefinition<? extends FingerprintCertificateMapperCfgClient, ? extends FingerprintCertificateMapperCfg> definition() {
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
  private static class FingerprintCertificateMapperCfgServerImpl implements
    FingerprintCertificateMapperCfg {

    // Private implementation.
    private ServerManagedObject<? extends FingerprintCertificateMapperCfg> impl;

    // The value of the "enabled" property.
    private final boolean pEnabled;

    // The value of the "fingerprint-algorithm" property.
    private final FingerprintAlgorithm pFingerprintAlgorithm;

    // The value of the "fingerprint-attribute" property.
    private final AttributeType pFingerprintAttribute;

    // The value of the "java-class" property.
    private final String pJavaClass;

    // The value of the "user-base-dn" property.
    private final SortedSet<DN> pUserBaseDN;



    // Private constructor.
    private FingerprintCertificateMapperCfgServerImpl(ServerManagedObject<? extends FingerprintCertificateMapperCfg> impl) {
      this.impl = impl;
      this.pEnabled = impl.getPropertyValue(INSTANCE.getEnabledPropertyDefinition());
      this.pFingerprintAlgorithm = impl.getPropertyValue(INSTANCE.getFingerprintAlgorithmPropertyDefinition());
      this.pFingerprintAttribute = impl.getPropertyValue(INSTANCE.getFingerprintAttributePropertyDefinition());
      this.pJavaClass = impl.getPropertyValue(INSTANCE.getJavaClassPropertyDefinition());
      this.pUserBaseDN = impl.getPropertyValues(INSTANCE.getUserBaseDNPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addFingerprintChangeListener(
        ConfigurationChangeListener<FingerprintCertificateMapperCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeFingerprintChangeListener(
        ConfigurationChangeListener<FingerprintCertificateMapperCfg> listener) {
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
    public FingerprintAlgorithm getFingerprintAlgorithm() {
      return pFingerprintAlgorithm;
    }



    /**
     * {@inheritDoc}
     */
    public AttributeType getFingerprintAttribute() {
      return pFingerprintAttribute;
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
    public SortedSet<DN> getUserBaseDN() {
      return pUserBaseDN;
    }



    /**
     * {@inheritDoc}
     */
    public Class<? extends FingerprintCertificateMapperCfg> configurationClass() {
      return FingerprintCertificateMapperCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
