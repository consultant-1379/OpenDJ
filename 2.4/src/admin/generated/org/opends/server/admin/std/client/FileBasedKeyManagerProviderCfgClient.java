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
import org.opends.server.admin.std.server.FileBasedKeyManagerProviderCfg;



/**
 * A client-side interface for reading and modifying File Based Key
 * Manager Provider settings.
 * <p>
 * The File Based Key Manager Provider can be used to obtain the
 * server certificate from a key store file on the local file system.
 */
public interface FileBasedKeyManagerProviderCfgClient extends KeyManagerProviderCfgClient {

  /**
   * Get the configuration definition associated with this File Based Key Manager Provider.
   *
   * @return Returns the configuration definition associated with this File Based Key Manager Provider.
   */
  ManagedObjectDefinition<? extends FileBasedKeyManagerProviderCfgClient, ? extends FileBasedKeyManagerProviderCfg> definition();



  /**
   * Gets the "java-class" property.
   * <p>
   * The fully-qualified name of the Java class that provides the File
   * Based Key Manager Provider implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();



  /**
   * Sets the "java-class" property.
   * <p>
   * The fully-qualified name of the Java class that provides the File
   * Based Key Manager Provider implementation.
   *
   * @param value The value of the "java-class" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setJavaClass(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "key-store-file" property.
   * <p>
   * Specifies the path to the file that contains the private key
   * information. This may be an absolute path, or a path that is
   * relative to the OpenDS Directory Server instance root.
   * <p>
   * Changes to this property will take effect the next time that the
   * key manager is accessed.
   *
   * @return Returns the value of the "key-store-file" property.
   */
  String getKeyStoreFile();



  /**
   * Sets the "key-store-file" property.
   * <p>
   * Specifies the path to the file that contains the private key
   * information. This may be an absolute path, or a path that is
   * relative to the OpenDS Directory Server instance root.
   * <p>
   * Changes to this property will take effect the next time that the
   * key manager is accessed.
   *
   * @param value The value of the "key-store-file" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setKeyStoreFile(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "key-store-pin" property.
   * <p>
   * Specifies the clear-text PIN needed to access the File Based Key
   * Manager Provider .
   *
   * @return Returns the value of the "key-store-pin" property.
   */
  String getKeyStorePin();



  /**
   * Sets the "key-store-pin" property.
   * <p>
   * Specifies the clear-text PIN needed to access the File Based Key
   * Manager Provider .
   *
   * @param value The value of the "key-store-pin" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setKeyStorePin(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "key-store-pin-environment-variable" property.
   * <p>
   * Specifies the name of the environment variable that contains the
   * clear-text PIN needed to access the File Based Key Manager
   * Provider .
   *
   * @return Returns the value of the "key-store-pin-environment-variable" property.
   */
  String getKeyStorePinEnvironmentVariable();



  /**
   * Sets the "key-store-pin-environment-variable" property.
   * <p>
   * Specifies the name of the environment variable that contains the
   * clear-text PIN needed to access the File Based Key Manager
   * Provider .
   *
   * @param value The value of the "key-store-pin-environment-variable" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setKeyStorePinEnvironmentVariable(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "key-store-pin-file" property.
   * <p>
   * Specifies the path to the text file whose only contents should be
   * a single line containing the clear-text PIN needed to access the
   * File Based Key Manager Provider .
   *
   * @return Returns the value of the "key-store-pin-file" property.
   */
  String getKeyStorePinFile();



  /**
   * Sets the "key-store-pin-file" property.
   * <p>
   * Specifies the path to the text file whose only contents should be
   * a single line containing the clear-text PIN needed to access the
   * File Based Key Manager Provider .
   *
   * @param value The value of the "key-store-pin-file" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setKeyStorePinFile(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "key-store-pin-property" property.
   * <p>
   * Specifies the name of the Java property that contains the
   * clear-text PIN needed to access the File Based Key Manager
   * Provider .
   *
   * @return Returns the value of the "key-store-pin-property" property.
   */
  String getKeyStorePinProperty();



  /**
   * Sets the "key-store-pin-property" property.
   * <p>
   * Specifies the name of the Java property that contains the
   * clear-text PIN needed to access the File Based Key Manager
   * Provider .
   *
   * @param value The value of the "key-store-pin-property" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setKeyStorePinProperty(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "key-store-type" property.
   * <p>
   * Specifies the format for the data in the key store file.
   * <p>
   * Valid values should always include 'JKS' and 'PKCS12', but
   * different implementations may allow other values as well. If no
   * value is provided, the JVM-default value is used. Changes to this
   * configuration attribute will take effect the next time that the
   * key manager is accessed.
   *
   * @return Returns the value of the "key-store-type" property.
   */
  String getKeyStoreType();



  /**
   * Sets the "key-store-type" property.
   * <p>
   * Specifies the format for the data in the key store file.
   * <p>
   * Valid values should always include 'JKS' and 'PKCS12', but
   * different implementations may allow other values as well. If no
   * value is provided, the JVM-default value is used. Changes to this
   * configuration attribute will take effect the next time that the
   * key manager is accessed.
   *
   * @param value The value of the "key-store-type" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setKeyStoreType(String value) throws IllegalPropertyValueException;

}
