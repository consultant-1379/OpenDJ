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
package org.opends.server.admin.std.server;



import java.util.SortedSet;
import org.opends.server.admin.Configuration;
import org.opends.server.admin.server.ConfigurationChangeListener;



/**
 * A server-side interface for querying Crypto Manager settings.
 * <p>
 * The Crypto Manager provides a common interface for performing
 * compression, decompression, hashing, encryption and other kinds of
 * cryptographic operations.
 */
public interface CryptoManagerCfg extends Configuration {

  /**
   * Gets the configuration class associated with this Crypto Manager.
   *
   * @return Returns the configuration class associated with this Crypto Manager.
   */
  Class<? extends CryptoManagerCfg> configurationClass();



  /**
   * Register to be notified when this Crypto Manager is changed.
   *
   * @param listener
   *          The Crypto Manager configuration change listener.
   */
  void addChangeListener(ConfigurationChangeListener<CryptoManagerCfg> listener);



  /**
   * Deregister an existing Crypto Manager configuration change listener.
   *
   * @param listener
   *          The Crypto Manager configuration change listener.
   */
  void removeChangeListener(ConfigurationChangeListener<CryptoManagerCfg> listener);



  /**
   * Gets the "cipher-key-length" property.
   * <p>
   * Specifies the key length in bits for the preferred cipher.
   *
   * @return Returns the value of the "cipher-key-length" property.
   */
  int getCipherKeyLength();



  /**
   * Gets the "cipher-transformation" property.
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
   * @return Returns the value of the "cipher-transformation" property.
   */
  String getCipherTransformation();



  /**
   * Gets the "digest-algorithm" property.
   * <p>
   * Specifies the preferred message digest algorithm for the
   * Directory Server.
   *
   * @return Returns the value of the "digest-algorithm" property.
   */
  String getDigestAlgorithm();



  /**
   * Gets the "key-wrapping-transformation" property.
   * <p>
   * The preferred key wrapping transformation for the Directory
   * Server. This value must be the same for all server instances in a
   * replication topology.
   *
   * @return Returns the value of the "key-wrapping-transformation" property.
   */
  String getKeyWrappingTransformation();



  /**
   * Gets the "mac-algorithm" property.
   * <p>
   * Specifies the preferred MAC algorithm for the Directory Server.
   *
   * @return Returns the value of the "mac-algorithm" property.
   */
  String getMacAlgorithm();



  /**
   * Gets the "mac-key-length" property.
   * <p>
   * Specifies the key length in bits for the preferred MAC algorithm.
   *
   * @return Returns the value of the "mac-key-length" property.
   */
  int getMacKeyLength();



  /**
   * Gets the "ssl-cert-nickname" property.
   * <p>
   * Specifies the nickname (also called the alias) of the certificate
   * that the Crypto Manager should use when performing SSL
   * communication.
   * <p>
   * This is only applicable when the Crypto Manager is configured to
   * use SSL.
   *
   * @return Returns the value of the "ssl-cert-nickname" property.
   */
  String getSSLCertNickname();



  /**
   * Gets the "ssl-cipher-suite" property.
   * <p>
   * Specifies the names of the SSL cipher suites that are allowed for
   * use in SSL or TLS communication.
   *
   * @return Returns an unmodifiable set containing the values of the "ssl-cipher-suite" property.
   */
  SortedSet<String> getSSLCipherSuite();



  /**
   * Gets the "ssl-encryption" property.
   * <p>
   * Specifies whether SSL/TLS is used to provide encrypted
   * communication between two OpenDS server components.
   *
   * @return Returns the value of the "ssl-encryption" property.
   */
  boolean isSSLEncryption();



  /**
   * Gets the "ssl-protocol" property.
   * <p>
   * Specifies the names of the SSL protocols that are allowed for use
   * in SSL or TLS communication.
   *
   * @return Returns an unmodifiable set containing the values of the "ssl-protocol" property.
   */
  SortedSet<String> getSSLProtocol();

}
