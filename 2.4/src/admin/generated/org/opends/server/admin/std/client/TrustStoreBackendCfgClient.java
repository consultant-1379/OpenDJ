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
import org.opends.server.admin.std.meta.BackendCfgDefn.WritabilityMode;
import org.opends.server.admin.std.server.TrustStoreBackendCfg;



/**
 * A client-side interface for reading and modifying Trust Store
 * Backend settings.
 * <p>
 * The Trust Store Backend provides an LDAP view of a file-based trust
 * store. It is used by the administrative cryptographic framework.
 */
public interface TrustStoreBackendCfgClient extends BackendCfgClient {

  /**
   * Get the configuration definition associated with this Trust Store Backend.
   *
   * @return Returns the configuration definition associated with this Trust Store Backend.
   */
  ManagedObjectDefinition<? extends TrustStoreBackendCfgClient, ? extends TrustStoreBackendCfg> definition();



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the backend implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();



  /**
   * Sets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the backend implementation.
   *
   * @param value The value of the "java-class" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setJavaClass(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "trust-store-file" property.
   * <p>
   * Specifies the path to the file that stores the trust information.
   * <p>
   * It may be an absolute path, or a path that is relative to the
   * OpenDS Directory Server instance root.
   *
   * @return Returns the value of the "trust-store-file" property.
   */
  String getTrustStoreFile();



  /**
   * Sets the "trust-store-file" property.
   * <p>
   * Specifies the path to the file that stores the trust information.
   * <p>
   * It may be an absolute path, or a path that is relative to the
   * OpenDS Directory Server instance root.
   *
   * @param value The value of the "trust-store-file" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setTrustStoreFile(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "trust-store-pin" property.
   * <p>
   * Specifies the clear-text PIN needed to access the Trust Store
   * Backend .
   *
   * @return Returns the value of the "trust-store-pin" property.
   */
  String getTrustStorePin();



  /**
   * Sets the "trust-store-pin" property.
   * <p>
   * Specifies the clear-text PIN needed to access the Trust Store
   * Backend .
   *
   * @param value The value of the "trust-store-pin" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setTrustStorePin(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "trust-store-pin-environment-variable" property.
   * <p>
   * Specifies the name of the environment variable that contains the
   * clear-text PIN needed to access the Trust Store Backend .
   *
   * @return Returns the value of the "trust-store-pin-environment-variable" property.
   */
  String getTrustStorePinEnvironmentVariable();



  /**
   * Sets the "trust-store-pin-environment-variable" property.
   * <p>
   * Specifies the name of the environment variable that contains the
   * clear-text PIN needed to access the Trust Store Backend .
   *
   * @param value The value of the "trust-store-pin-environment-variable" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setTrustStorePinEnvironmentVariable(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "trust-store-pin-file" property.
   * <p>
   * Specifies the path to the text file whose only contents should be
   * a single line containing the clear-text PIN needed to access the
   * Trust Store Backend .
   *
   * @return Returns the value of the "trust-store-pin-file" property.
   */
  String getTrustStorePinFile();



  /**
   * Sets the "trust-store-pin-file" property.
   * <p>
   * Specifies the path to the text file whose only contents should be
   * a single line containing the clear-text PIN needed to access the
   * Trust Store Backend .
   *
   * @param value The value of the "trust-store-pin-file" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setTrustStorePinFile(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "trust-store-pin-property" property.
   * <p>
   * Specifies the name of the Java property that contains the
   * clear-text PIN needed to access the Trust Store Backend .
   *
   * @return Returns the value of the "trust-store-pin-property" property.
   */
  String getTrustStorePinProperty();



  /**
   * Sets the "trust-store-pin-property" property.
   * <p>
   * Specifies the name of the Java property that contains the
   * clear-text PIN needed to access the Trust Store Backend .
   *
   * @param value The value of the "trust-store-pin-property" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setTrustStorePinProperty(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "trust-store-type" property.
   * <p>
   * Specifies the format for the data in the key store file.
   * <p>
   * Valid values should always include 'JKS' and 'PKCS12', but
   * different implementations may allow other values as well.
   *
   * @return Returns the value of the "trust-store-type" property.
   */
  String getTrustStoreType();



  /**
   * Sets the "trust-store-type" property.
   * <p>
   * Specifies the format for the data in the key store file.
   * <p>
   * Valid values should always include 'JKS' and 'PKCS12', but
   * different implementations may allow other values as well.
   *
   * @param value The value of the "trust-store-type" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setTrustStoreType(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "writability-mode" property.
   * <p>
   * Specifies the behavior that the backend should use when
   * processing write operations.
   *
   * @return Returns the value of the "writability-mode" property.
   */
  WritabilityMode getWritabilityMode();



  /**
   * Sets the "writability-mode" property.
   * <p>
   * Specifies the behavior that the backend should use when
   * processing write operations.
   *
   * @param value The value of the "writability-mode" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setWritabilityMode(WritabilityMode value) throws IllegalPropertyValueException;

}
