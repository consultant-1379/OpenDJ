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



import org.opends.server.admin.IllegalPropertyValueException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.std.meta.CryptPasswordStorageSchemeCfgDefn.CryptPasswordStorageEncryptionAlgorithm;
import org.opends.server.admin.std.server.CryptPasswordStorageSchemeCfg;



/**
 * A client-side interface for reading and modifying Crypt Password
 * Storage Scheme settings.
 * <p>
 * The Crypt Password Storage Scheme provides a mechanism for encoding
 * user passwords like Unix crypt does. Like on most Unix systems, the
 * password mq be encrypted using different algorithm, either UNIX
 * crypt or md5 (bsd).
 */
public interface CryptPasswordStorageSchemeCfgClient extends PasswordStorageSchemeCfgClient {

  /**
   * Get the configuration definition associated with this Crypt Password Storage Scheme.
   *
   * @return Returns the configuration definition associated with this Crypt Password Storage Scheme.
   */
  ManagedObjectDefinition<? extends CryptPasswordStorageSchemeCfgClient, ? extends CryptPasswordStorageSchemeCfg> definition();



  /**
   * Gets the "crypt-password-storage-encryption-algorithm" property.
   * <p>
   * Specifies the algorithm to use to encrypt new passwords.
   * <p>
   * Select the crypt algorithm to use to encrypt new passwords. The
   * value can either be "unix", which means the password is encrypted
   * with the UNIX crypt algorithm, or md5 which means the password is
   * encrypted with BSD MD5 algorithm and has a $1$ prefix.
   *
   * @return Returns the value of the "crypt-password-storage-encryption-algorithm" property.
   */
  CryptPasswordStorageEncryptionAlgorithm getCryptPasswordStorageEncryptionAlgorithm();



  /**
   * Sets the "crypt-password-storage-encryption-algorithm" property.
   * <p>
   * Specifies the algorithm to use to encrypt new passwords.
   * <p>
   * Select the crypt algorithm to use to encrypt new passwords. The
   * value can either be "unix", which means the password is encrypted
   * with the UNIX crypt algorithm, or md5 which means the password is
   * encrypted with BSD MD5 algorithm and has a $1$ prefix.
   *
   * @param value The value of the "crypt-password-storage-encryption-algorithm" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setCryptPasswordStorageEncryptionAlgorithm(CryptPasswordStorageEncryptionAlgorithm value) throws IllegalPropertyValueException;



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Crypt Password Storage Scheme implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();



  /**
   * Sets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Crypt Password Storage Scheme implementation.
   *
   * @param value The value of the "java-class" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setJavaClass(String value) throws IllegalPropertyValueException;

}
