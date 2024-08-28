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
import org.opends.server.admin.std.meta.GSSAPISASLMechanismHandlerCfgDefn.QualityOfProtection;
import org.opends.server.admin.std.server.GSSAPISASLMechanismHandlerCfg;



/**
 * A client-side interface for reading and modifying GSSAPI SASL
 * Mechanism Handler settings.
 * <p>
 * The GSSAPI SASL mechanism performs all processing related to SASL
 * GSSAPI authentication using Kerberos V5.
 */
public interface GSSAPISASLMechanismHandlerCfgClient extends SASLMechanismHandlerCfgClient {

  /**
   * Get the configuration definition associated with this GSSAPI SASL Mechanism Handler.
   *
   * @return Returns the configuration definition associated with this GSSAPI SASL Mechanism Handler.
   */
  ManagedObjectDefinition<? extends GSSAPISASLMechanismHandlerCfgClient, ? extends GSSAPISASLMechanismHandlerCfg> definition();



  /**
   * Gets the "identity-mapper" property.
   * <p>
   * Specifies the name of the identity mapper that is to be used with
   * this SASL mechanism handler to match the Kerberos principal
   * included in the SASL bind request to the corresponding user in the
   * directory.
   *
   * @return Returns the value of the "identity-mapper" property.
   */
  String getIdentityMapper();



  /**
   * Sets the "identity-mapper" property.
   * <p>
   * Specifies the name of the identity mapper that is to be used with
   * this SASL mechanism handler to match the Kerberos principal
   * included in the SASL bind request to the corresponding user in the
   * directory.
   *
   * @param value The value of the "identity-mapper" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setIdentityMapper(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the SASL mechanism handler implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();



  /**
   * Sets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the SASL mechanism handler implementation.
   *
   * @param value The value of the "java-class" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setJavaClass(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "kdc-address" property.
   * <p>
   * Specifies the address of the KDC that is to be used for Kerberos
   * processing.
   * <p>
   * If provided, this property must be a fully-qualified
   * DNS-resolvable name. If this property is not provided, then the
   * server attempts to determine it from the system-wide Kerberos
   * configuration.
   *
   * @return Returns the value of the "kdc-address" property.
   */
  String getKdcAddress();



  /**
   * Sets the "kdc-address" property.
   * <p>
   * Specifies the address of the KDC that is to be used for Kerberos
   * processing.
   * <p>
   * If provided, this property must be a fully-qualified
   * DNS-resolvable name. If this property is not provided, then the
   * server attempts to determine it from the system-wide Kerberos
   * configuration.
   *
   * @param value The value of the "kdc-address" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setKdcAddress(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "keytab" property.
   * <p>
   * Specifies the path to the keytab file that should be used for
   * Kerberos processing.
   * <p>
   * If provided, this is either an absolute path or one that is
   * relative to the server instance root.
   *
   * @return Returns the value of the "keytab" property.
   */
  String getKeytab();



  /**
   * Sets the "keytab" property.
   * <p>
   * Specifies the path to the keytab file that should be used for
   * Kerberos processing.
   * <p>
   * If provided, this is either an absolute path or one that is
   * relative to the server instance root.
   *
   * @param value The value of the "keytab" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setKeytab(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "principal-name" property.
   * <p>
   * Specifies the principal name.
   * <p>
   * It can either be a simple user name or a service name such as
   * host/example.com. If this property is not provided, then the
   * server attempts to build the principal name by appending the fully
   * qualified domain name to the string "ldap/".
   *
   * @return Returns the value of the "principal-name" property.
   */
  String getPrincipalName();



  /**
   * Sets the "principal-name" property.
   * <p>
   * Specifies the principal name.
   * <p>
   * It can either be a simple user name or a service name such as
   * host/example.com. If this property is not provided, then the
   * server attempts to build the principal name by appending the fully
   * qualified domain name to the string "ldap/".
   *
   * @param value The value of the "principal-name" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setPrincipalName(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "quality-of-protection" property.
   * <p>
   * The name of a property that specifies the quality of protection
   * the server will support.
   *
   * @return Returns the value of the "quality-of-protection" property.
   */
  QualityOfProtection getQualityOfProtection();



  /**
   * Sets the "quality-of-protection" property.
   * <p>
   * The name of a property that specifies the quality of protection
   * the server will support.
   *
   * @param value The value of the "quality-of-protection" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setQualityOfProtection(QualityOfProtection value) throws IllegalPropertyValueException;



  /**
   * Gets the "realm" property.
   * <p>
   * Specifies the realm to be used for GSSAPI authentication.
   *
   * @return Returns the value of the "realm" property.
   */
  String getRealm();



  /**
   * Sets the "realm" property.
   * <p>
   * Specifies the realm to be used for GSSAPI authentication.
   *
   * @param value The value of the "realm" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setRealm(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "server-fqdn" property.
   * <p>
   * Specifies the DNS-resolvable fully-qualified domain name for the
   * system.
   *
   * @return Returns the value of the "server-fqdn" property.
   */
  String getServerFqdn();



  /**
   * Sets the "server-fqdn" property.
   * <p>
   * Specifies the DNS-resolvable fully-qualified domain name for the
   * system.
   *
   * @param value The value of the "server-fqdn" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setServerFqdn(String value) throws IllegalPropertyValueException;

}
