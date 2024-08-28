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
import org.opends.server.admin.std.client.CryptoManagerCfgClient;
import org.opends.server.admin.std.server.CryptoManagerCfg;
import org.opends.server.admin.StringPropertyDefinition;
import org.opends.server.admin.Tag;
import org.opends.server.admin.TopCfgDefn;
import org.opends.server.types.DN;



/**
 * An interface for querying the Crypto Manager managed object
 * definition meta information.
 * <p>
 * The Crypto Manager provides a common interface for performing
 * compression, decompression, hashing, encryption and other kinds of
 * cryptographic operations.
 */
public final class CryptoManagerCfgDefn extends ManagedObjectDefinition<CryptoManagerCfgClient, CryptoManagerCfg> {

  // The singleton configuration definition instance.
  private static final CryptoManagerCfgDefn INSTANCE = new CryptoManagerCfgDefn();



  // The "cipher-key-length" property definition.
  private static final IntegerPropertyDefinition PD_CIPHER_KEY_LENGTH;



  // The "cipher-transformation" property definition.
  private static final StringPropertyDefinition PD_CIPHER_TRANSFORMATION;



  // The "digest-algorithm" property definition.
  private static final StringPropertyDefinition PD_DIGEST_ALGORITHM;



  // The "key-wrapping-transformation" property definition.
  private static final StringPropertyDefinition PD_KEY_WRAPPING_TRANSFORMATION;



  // The "mac-algorithm" property definition.
  private static final StringPropertyDefinition PD_MAC_ALGORITHM;



  // The "mac-key-length" property definition.
  private static final IntegerPropertyDefinition PD_MAC_KEY_LENGTH;



  // The "ssl-cert-nickname" property definition.
  private static final StringPropertyDefinition PD_SSL_CERT_NICKNAME;



  // The "ssl-cipher-suite" property definition.
  private static final StringPropertyDefinition PD_SSL_CIPHER_SUITE;



  // The "ssl-encryption" property definition.
  private static final BooleanPropertyDefinition PD_SSL_ENCRYPTION;



  // The "ssl-protocol" property definition.
  private static final StringPropertyDefinition PD_SSL_PROTOCOL;



  // Build the "cipher-key-length" property definition.
  static {
      IntegerPropertyDefinition.Builder builder = IntegerPropertyDefinition.createBuilder(INSTANCE, "cipher-key-length");
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "cipher-key-length"));
      DefaultBehaviorProvider<Integer> provider = new DefinedDefaultBehaviorProvider<Integer>("128");
      builder.setDefaultBehaviorProvider(provider);
      PD_CIPHER_KEY_LENGTH = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_CIPHER_KEY_LENGTH);
  }



  // Build the "cipher-transformation" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "cipher-transformation");
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "cipher-transformation"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("AES/CBC/PKCS5Padding");
      builder.setDefaultBehaviorProvider(provider);
      PD_CIPHER_TRANSFORMATION = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_CIPHER_TRANSFORMATION);
  }



  // Build the "digest-algorithm" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "digest-algorithm");
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "digest-algorithm"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("SHA-1");
      builder.setDefaultBehaviorProvider(provider);
      PD_DIGEST_ALGORITHM = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_DIGEST_ALGORITHM);
  }



  // Build the "key-wrapping-transformation" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "key-wrapping-transformation");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "key-wrapping-transformation"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("RSA/ECB/OAEPWITHSHA-1ANDMGF1PADDING");
      builder.setDefaultBehaviorProvider(provider);
      PD_KEY_WRAPPING_TRANSFORMATION = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_KEY_WRAPPING_TRANSFORMATION);
  }



  // Build the "mac-algorithm" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "mac-algorithm");
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "mac-algorithm"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("HmacSHA1");
      builder.setDefaultBehaviorProvider(provider);
      PD_MAC_ALGORITHM = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_MAC_ALGORITHM);
  }



  // Build the "mac-key-length" property definition.
  static {
      IntegerPropertyDefinition.Builder builder = IntegerPropertyDefinition.createBuilder(INSTANCE, "mac-key-length");
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "mac-key-length"));
      DefaultBehaviorProvider<Integer> provider = new DefinedDefaultBehaviorProvider<Integer>("128");
      builder.setDefaultBehaviorProvider(provider);
      PD_MAC_KEY_LENGTH = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_MAC_KEY_LENGTH);
  }



  // Build the "ssl-cert-nickname" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "ssl-cert-nickname");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.COMPONENT_RESTART, INSTANCE, "ssl-cert-nickname"));
      builder.setDefaultBehaviorProvider(new AliasDefaultBehaviorProvider<String>(INSTANCE, "ssl-cert-nickname"));
      PD_SSL_CERT_NICKNAME = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_SSL_CERT_NICKNAME);
  }



  // Build the "ssl-cipher-suite" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "ssl-cipher-suite");
      builder.setOption(PropertyOption.MULTI_VALUED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "ssl-cipher-suite"));
      builder.setDefaultBehaviorProvider(new AliasDefaultBehaviorProvider<String>(INSTANCE, "ssl-cipher-suite"));
      PD_SSL_CIPHER_SUITE = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_SSL_CIPHER_SUITE);
  }



  // Build the "ssl-encryption" property definition.
  static {
      BooleanPropertyDefinition.Builder builder = BooleanPropertyDefinition.createBuilder(INSTANCE, "ssl-encryption");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "ssl-encryption"));
      DefaultBehaviorProvider<Boolean> provider = new DefinedDefaultBehaviorProvider<Boolean>("false");
      builder.setDefaultBehaviorProvider(provider);
      PD_SSL_ENCRYPTION = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_SSL_ENCRYPTION);
  }



  // Build the "ssl-protocol" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "ssl-protocol");
      builder.setOption(PropertyOption.MULTI_VALUED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "ssl-protocol"));
      builder.setDefaultBehaviorProvider(new AliasDefaultBehaviorProvider<String>(INSTANCE, "ssl-protocol"));
      PD_SSL_PROTOCOL = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_SSL_PROTOCOL);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("security"));
  }



  /**
   * Get the Crypto Manager configuration definition singleton.
   *
   * @return Returns the Crypto Manager configuration definition
   *         singleton.
   */
  public static CryptoManagerCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private CryptoManagerCfgDefn() {
    super("crypto-manager", TopCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public CryptoManagerCfgClient createClientConfiguration(
      ManagedObject<? extends CryptoManagerCfgClient> impl) {
    return new CryptoManagerCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public CryptoManagerCfg createServerConfiguration(
      ServerManagedObject<? extends CryptoManagerCfg> impl) {
    return new CryptoManagerCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<CryptoManagerCfg> getServerConfigurationClass() {
    return CryptoManagerCfg.class;
  }



  /**
   * Get the "cipher-key-length" property definition.
   * <p>
   * Specifies the key length in bits for the preferred cipher.
   *
   * @return Returns the "cipher-key-length" property definition.
   */
  public IntegerPropertyDefinition getCipherKeyLengthPropertyDefinition() {
    return PD_CIPHER_KEY_LENGTH;
  }



  /**
   * Get the "cipher-transformation" property definition.
   * <p>
   * Specifies the cipher for the Directory Server using the syntax
   * algorithm/mode/padding.
   * <p>
   * The full transformation is required: specifying only an algorithm
   * and allowing the cipher provider to supply the default mode and
   * padding is not supported, because there is no guarantee these
   * default values are the same among different implementations. Some
   * cipher algorithms, including RC4 and ARCFOUR, do not have a mode
   * or padding, and hence must be specified using NONE for the mode
   * field and NoPadding for the padding field. For example,
   * RC4/NONE/NoPadding.
   *
   * @return Returns the "cipher-transformation" property definition.
   */
  public StringPropertyDefinition getCipherTransformationPropertyDefinition() {
    return PD_CIPHER_TRANSFORMATION;
  }



  /**
   * Get the "digest-algorithm" property definition.
   * <p>
   * Specifies the preferred message digest algorithm for the
   * Directory Server.
   *
   * @return Returns the "digest-algorithm" property definition.
   */
  public StringPropertyDefinition getDigestAlgorithmPropertyDefinition() {
    return PD_DIGEST_ALGORITHM;
  }



  /**
   * Get the "key-wrapping-transformation" property definition.
   * <p>
   * The preferred key wrapping transformation for the Directory
   * Server. This value must be the same for all server instances in a
   * replication topology.
   *
   * @return Returns the "key-wrapping-transformation" property definition.
   */
  public StringPropertyDefinition getKeyWrappingTransformationPropertyDefinition() {
    return PD_KEY_WRAPPING_TRANSFORMATION;
  }



  /**
   * Get the "mac-algorithm" property definition.
   * <p>
   * Specifies the preferred MAC algorithm for the Directory Server.
   *
   * @return Returns the "mac-algorithm" property definition.
   */
  public StringPropertyDefinition getMacAlgorithmPropertyDefinition() {
    return PD_MAC_ALGORITHM;
  }



  /**
   * Get the "mac-key-length" property definition.
   * <p>
   * Specifies the key length in bits for the preferred MAC algorithm.
   *
   * @return Returns the "mac-key-length" property definition.
   */
  public IntegerPropertyDefinition getMacKeyLengthPropertyDefinition() {
    return PD_MAC_KEY_LENGTH;
  }



  /**
   * Get the "ssl-cert-nickname" property definition.
   * <p>
   * Specifies the nickname (also called the alias) of the certificate
   * that the Crypto Manager should use when performing SSL
   * communication.
   * <p>
   * This is only applicable when the Crypto Manager is configured to
   * use SSL.
   *
   * @return Returns the "ssl-cert-nickname" property definition.
   */
  public StringPropertyDefinition getSSLCertNicknamePropertyDefinition() {
    return PD_SSL_CERT_NICKNAME;
  }



  /**
   * Get the "ssl-cipher-suite" property definition.
   * <p>
   * Specifies the names of the SSL cipher suites that are allowed for
   * use in SSL or TLS communication.
   *
   * @return Returns the "ssl-cipher-suite" property definition.
   */
  public StringPropertyDefinition getSSLCipherSuitePropertyDefinition() {
    return PD_SSL_CIPHER_SUITE;
  }



  /**
   * Get the "ssl-encryption" property definition.
   * <p>
   * Specifies whether SSL/TLS is used to provide encrypted
   * communication between two OpenDS server components.
   *
   * @return Returns the "ssl-encryption" property definition.
   */
  public BooleanPropertyDefinition getSSLEncryptionPropertyDefinition() {
    return PD_SSL_ENCRYPTION;
  }



  /**
   * Get the "ssl-protocol" property definition.
   * <p>
   * Specifies the names of the SSL protocols that are allowed for use
   * in SSL or TLS communication.
   *
   * @return Returns the "ssl-protocol" property definition.
   */
  public StringPropertyDefinition getSSLProtocolPropertyDefinition() {
    return PD_SSL_PROTOCOL;
  }



  /**
   * Managed object client implementation.
   */
  private static class CryptoManagerCfgClientImpl implements
    CryptoManagerCfgClient {

    // Private implementation.
    private ManagedObject<? extends CryptoManagerCfgClient> impl;



    // Private constructor.
    private CryptoManagerCfgClientImpl(
        ManagedObject<? extends CryptoManagerCfgClient> impl) {
      this.impl = impl;
    }



    /**
     * {@inheritDoc}
     */
    public int getCipherKeyLength() {
      return impl.getPropertyValue(INSTANCE.getCipherKeyLengthPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setCipherKeyLength(Integer value) {
      impl.setPropertyValue(INSTANCE.getCipherKeyLengthPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public String getCipherTransformation() {
      return impl.getPropertyValue(INSTANCE.getCipherTransformationPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setCipherTransformation(String value) {
      impl.setPropertyValue(INSTANCE.getCipherTransformationPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public String getDigestAlgorithm() {
      return impl.getPropertyValue(INSTANCE.getDigestAlgorithmPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setDigestAlgorithm(String value) {
      impl.setPropertyValue(INSTANCE.getDigestAlgorithmPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public String getKeyWrappingTransformation() {
      return impl.getPropertyValue(INSTANCE.getKeyWrappingTransformationPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setKeyWrappingTransformation(String value) {
      impl.setPropertyValue(INSTANCE.getKeyWrappingTransformationPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public String getMacAlgorithm() {
      return impl.getPropertyValue(INSTANCE.getMacAlgorithmPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setMacAlgorithm(String value) {
      impl.setPropertyValue(INSTANCE.getMacAlgorithmPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public int getMacKeyLength() {
      return impl.getPropertyValue(INSTANCE.getMacKeyLengthPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setMacKeyLength(Integer value) {
      impl.setPropertyValue(INSTANCE.getMacKeyLengthPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public String getSSLCertNickname() {
      return impl.getPropertyValue(INSTANCE.getSSLCertNicknamePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setSSLCertNickname(String value) {
      impl.setPropertyValue(INSTANCE.getSSLCertNicknamePropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<String> getSSLCipherSuite() {
      return impl.getPropertyValues(INSTANCE.getSSLCipherSuitePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setSSLCipherSuite(Collection<String> values) {
      impl.setPropertyValues(INSTANCE.getSSLCipherSuitePropertyDefinition(), values);
    }



    /**
     * {@inheritDoc}
     */
    public boolean isSSLEncryption() {
      return impl.getPropertyValue(INSTANCE.getSSLEncryptionPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setSSLEncryption(Boolean value) {
      impl.setPropertyValue(INSTANCE.getSSLEncryptionPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<String> getSSLProtocol() {
      return impl.getPropertyValues(INSTANCE.getSSLProtocolPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setSSLProtocol(Collection<String> values) {
      impl.setPropertyValues(INSTANCE.getSSLProtocolPropertyDefinition(), values);
    }



    /**
     * {@inheritDoc}
     */
    public ManagedObjectDefinition<? extends CryptoManagerCfgClient, ? extends CryptoManagerCfg> definition() {
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
  private static class CryptoManagerCfgServerImpl implements
    CryptoManagerCfg {

    // Private implementation.
    private ServerManagedObject<? extends CryptoManagerCfg> impl;

    // The value of the "cipher-key-length" property.
    private final int pCipherKeyLength;

    // The value of the "cipher-transformation" property.
    private final String pCipherTransformation;

    // The value of the "digest-algorithm" property.
    private final String pDigestAlgorithm;

    // The value of the "key-wrapping-transformation" property.
    private final String pKeyWrappingTransformation;

    // The value of the "mac-algorithm" property.
    private final String pMacAlgorithm;

    // The value of the "mac-key-length" property.
    private final int pMacKeyLength;

    // The value of the "ssl-cert-nickname" property.
    private final String pSSLCertNickname;

    // The value of the "ssl-cipher-suite" property.
    private final SortedSet<String> pSSLCipherSuite;

    // The value of the "ssl-encryption" property.
    private final boolean pSSLEncryption;

    // The value of the "ssl-protocol" property.
    private final SortedSet<String> pSSLProtocol;



    // Private constructor.
    private CryptoManagerCfgServerImpl(ServerManagedObject<? extends CryptoManagerCfg> impl) {
      this.impl = impl;
      this.pCipherKeyLength = impl.getPropertyValue(INSTANCE.getCipherKeyLengthPropertyDefinition());
      this.pCipherTransformation = impl.getPropertyValue(INSTANCE.getCipherTransformationPropertyDefinition());
      this.pDigestAlgorithm = impl.getPropertyValue(INSTANCE.getDigestAlgorithmPropertyDefinition());
      this.pKeyWrappingTransformation = impl.getPropertyValue(INSTANCE.getKeyWrappingTransformationPropertyDefinition());
      this.pMacAlgorithm = impl.getPropertyValue(INSTANCE.getMacAlgorithmPropertyDefinition());
      this.pMacKeyLength = impl.getPropertyValue(INSTANCE.getMacKeyLengthPropertyDefinition());
      this.pSSLCertNickname = impl.getPropertyValue(INSTANCE.getSSLCertNicknamePropertyDefinition());
      this.pSSLCipherSuite = impl.getPropertyValues(INSTANCE.getSSLCipherSuitePropertyDefinition());
      this.pSSLEncryption = impl.getPropertyValue(INSTANCE.getSSLEncryptionPropertyDefinition());
      this.pSSLProtocol = impl.getPropertyValues(INSTANCE.getSSLProtocolPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addChangeListener(
        ConfigurationChangeListener<CryptoManagerCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeChangeListener(
        ConfigurationChangeListener<CryptoManagerCfg> listener) {
      impl.deregisterChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public int getCipherKeyLength() {
      return pCipherKeyLength;
    }



    /**
     * {@inheritDoc}
     */
    public String getCipherTransformation() {
      return pCipherTransformation;
    }



    /**
     * {@inheritDoc}
     */
    public String getDigestAlgorithm() {
      return pDigestAlgorithm;
    }



    /**
     * {@inheritDoc}
     */
    public String getKeyWrappingTransformation() {
      return pKeyWrappingTransformation;
    }



    /**
     * {@inheritDoc}
     */
    public String getMacAlgorithm() {
      return pMacAlgorithm;
    }



    /**
     * {@inheritDoc}
     */
    public int getMacKeyLength() {
      return pMacKeyLength;
    }



    /**
     * {@inheritDoc}
     */
    public String getSSLCertNickname() {
      return pSSLCertNickname;
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<String> getSSLCipherSuite() {
      return pSSLCipherSuite;
    }



    /**
     * {@inheritDoc}
     */
    public boolean isSSLEncryption() {
      return pSSLEncryption;
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<String> getSSLProtocol() {
      return pSSLProtocol;
    }



    /**
     * {@inheritDoc}
     */
    public Class<? extends CryptoManagerCfg> configurationClass() {
      return CryptoManagerCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
