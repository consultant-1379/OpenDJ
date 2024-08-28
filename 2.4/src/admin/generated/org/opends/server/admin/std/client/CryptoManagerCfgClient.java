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
package org.opends.server.admin.std.client;



import java.util.Collection;
import java.util.SortedSet;
import org.opends.server.admin.ConfigurationClient;
import org.opends.server.admin.IllegalPropertyValueException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.std.server.CryptoManagerCfg;



/**
 * A client-side interface for reading and modifying Crypto Manager
 * settings.
 * <p>
 * The Crypto Manager provides a common interface for performing
 * compression, decompression, hashing, encryption and other kinds of
 * cryptographic operations.
 */
public interface CryptoManagerCfgClient extends ConfigurationClient {

  /**
   * Get the configuration definition associated with this Crypto Manager.
   *
   * @return Returns the configuration definition associated with this Crypto Manager.
   */
  ManagedObjectDefinition<? extends CryptoManagerCfgClient, ? extends CryptoManagerCfg> definition();



  /**
   * Gets the "cipher-key-length" property.
   * <p>
   * Specifies the key length in bits for the preferred cipher.
   *
   * @return Returns the value of the "cipher-key-length" property.
   */
  int getCipherKeyLength();



  /**
   * Sets the "cipher-key-length" property.
   * <p>
   * Specifies the key length in bits for the preferred cipher.
   *
   * @param value The value of the "cipher-key-length" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setCipherKeyLength(Integer value) throws IllegalPropertyValueException;



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
   * Sets the "cipher-transformation" property.
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
   * @param value The value of the "cipher-transformation" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setCipherTransformation(String value) throws IllegalPropertyValueException;



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
   * Sets the "digest-algorithm" property.
   * <p>
   * Specifies the preferred message digest algorithm for the
   * Directory Server.
   *
   * @param value The value of the "digest-algorithm" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setDigestAlgorithm(String value) throws IllegalPropertyValueException;



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
   * Sets the "key-wrapping-transformation" property.
   * <p>
   * The preferred key wrapping transformation for the Directory
   * Server. This value must be the same for all server instances in a
   * replication topology.
   *
   * @param value The value of the "key-wrapping-transformation" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setKeyWrappingTransformation(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "mac-algorithm" property.
   * <p>
   * Specifies the preferred MAC algorithm for the Directory Server.
   *
   * @return Returns the value of the "mac-algorithm" property.
   */
  String getMacAlgorithm();



  /**
   * Sets the "mac-algorithm" property.
   * <p>
   * Specifies the preferred MAC algorithm for the Directory Server.
   *
   * @param value The value of the "mac-algorithm" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setMacAlgorithm(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "mac-key-length" property.
   * <p>
   * Specifies the key length in bits for the preferred MAC algorithm.
   *
   * @return Returns the value of the "mac-key-length" property.
   */
  int getMacKeyLength();



  /**
   * Sets the "mac-key-length" property.
   * <p>
   * Specifies the key length in bits for the preferred MAC algorithm.
   *
   * @param value The value of the "mac-key-length" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setMacKeyLength(Integer value) throws IllegalPropertyValueException;



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
   * Sets the "ssl-cert-nickname" property.
   * <p>
   * Specifies the nickname (also called the alias) of the certificate
   * that the Crypto Manager should use when performing SSL
   * communication.
   * <p>
   * This is only applicable when the Crypto Manager is configured to
   * use SSL.
   *
   * @param value The value of the "ssl-cert-nickname" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setSSLCertNickname(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "ssl-cipher-suite" property.
   * <p>
   * Specifies the names of the SSL cipher suites that are allowed for
   * use in SSL or TLS communication.
   *
   * @return Returns the values of the "ssl-cipher-suite" property.
   */
  SortedSet<String> getSSLCipherSuite();



  /**
   * Sets the "ssl-cipher-suite" property.
   * <p>
   * Specifies the names of the SSL cipher suites that are allowed for
   * use in SSL or TLS communication.
   *
   * @param values The values of the "ssl-cipher-suite" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setSSLCipherSuite(Collection<String> values) throws IllegalPropertyValueException;



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
   * Sets the "ssl-encryption" property.
   * <p>
   * Specifies whether SSL/TLS is used to provide encrypted
   * communication between two OpenDS server components.
   *
   * @param value The value of the "ssl-encryption" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setSSLEncryption(Boolean value) throws IllegalPropertyValueException;



  /**
   * Gets the "ssl-protocol" property.
   * <p>
   * Specifies the names of the SSL protocols that are allowed for use
   * in SSL or TLS communication.
   *
   * @return Returns the values of the "ssl-protocol" property.
   */
  SortedSet<String> getSSLProtocol();



  /**
   * Sets the "ssl-protocol" property.
   * <p>
   * Specifies the names of the SSL protocols that are allowed for use
   * in SSL or TLS communication.
   *
   * @param values The values of the "ssl-protocol" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setSSLProtocol(Collection<String> values) throws IllegalPropertyValueException;

}
