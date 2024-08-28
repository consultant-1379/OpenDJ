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



import org.opends.server.admin.server.ConfigurationChangeListener;



/**
 * A server-side interface for querying PKCS11 Key Manager Provider
 * settings.
 * <p>
 * The PKCS11 Key Manager Provider enables the server to access the
 * private key information through the PKCS11 interface.
 */
public interface PKCS11KeyManagerProviderCfg extends KeyManagerProviderCfg {

  /**
   * Gets the configuration class associated with this PKCS11 Key Manager Provider.
   *
   * @return Returns the configuration class associated with this PKCS11 Key Manager Provider.
   */
  Class<? extends PKCS11KeyManagerProviderCfg> configurationClass();



  /**
   * Register to be notified when this PKCS11 Key Manager Provider is changed.
   *
   * @param listener
   *          The PKCS11 Key Manager Provider configuration change listener.
   */
  void addPKCS11ChangeListener(ConfigurationChangeListener<PKCS11KeyManagerProviderCfg> listener);



  /**
   * Deregister an existing PKCS11 Key Manager Provider configuration change listener.
   *
   * @param listener
   *          The PKCS11 Key Manager Provider configuration change listener.
   */
  void removePKCS11ChangeListener(ConfigurationChangeListener<PKCS11KeyManagerProviderCfg> listener);



  /**
   * Gets the "java-class" property.
   * <p>
   * The fully-qualified name of the Java class that provides the
   * PKCS11 Key Manager Provider implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();



  /**
   * Gets the "key-store-pin" property.
   * <p>
   * Specifies the clear-text PIN needed to access the PKCS11 Key
   * Manager Provider .
   *
   * @return Returns the value of the "key-store-pin" property.
   */
  String getKeyStorePin();



  /**
   * Gets the "key-store-pin-environment-variable" property.
   * <p>
   * Specifies the name of the environment variable that contains the
   * clear-text PIN needed to access the PKCS11 Key Manager Provider .
   *
   * @return Returns the value of the "key-store-pin-environment-variable" property.
   */
  String getKeyStorePinEnvironmentVariable();



  /**
   * Gets the "key-store-pin-file" property.
   * <p>
   * Specifies the path to the text file whose only contents should be
   * a single line containing the clear-text PIN needed to access the
   * PKCS11 Key Manager Provider .
   *
   * @return Returns the value of the "key-store-pin-file" property.
   */
  String getKeyStorePinFile();



  /**
   * Gets the "key-store-pin-property" property.
   * <p>
   * Specifies the name of the Java property that contains the
   * clear-text PIN needed to access the PKCS11 Key Manager Provider .
   *
   * @return Returns the value of the "key-store-pin-property" property.
   */
  String getKeyStorePinProperty();

}
