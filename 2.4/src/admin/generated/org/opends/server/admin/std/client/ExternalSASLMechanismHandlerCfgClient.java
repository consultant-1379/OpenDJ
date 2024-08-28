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
import org.opends.server.admin.std.meta.ExternalSASLMechanismHandlerCfgDefn.CertificateValidationPolicy;
import org.opends.server.admin.std.server.ExternalSASLMechanismHandlerCfg;
import org.opends.server.types.AttributeType;



/**
 * A client-side interface for reading and modifying External SASL
 * Mechanism Handler settings.
 * <p>
 * The External SASL Mechanism Handler performs all processing related
 * to SASL EXTERNAL authentication.
 */
public interface ExternalSASLMechanismHandlerCfgClient extends SASLMechanismHandlerCfgClient {

  /**
   * Get the configuration definition associated with this External SASL Mechanism Handler.
   *
   * @return Returns the configuration definition associated with this External SASL Mechanism Handler.
   */
  ManagedObjectDefinition<? extends ExternalSASLMechanismHandlerCfgClient, ? extends ExternalSASLMechanismHandlerCfg> definition();



  /**
   * Gets the "certificate-attribute" property.
   * <p>
   * Specifies the name of the attribute to hold user certificates.
   * <p>
   * This property must specify the name of a valid attribute type
   * defined in the server schema.
   *
   * @return Returns the value of the "certificate-attribute" property.
   */
  AttributeType getCertificateAttribute();



  /**
   * Sets the "certificate-attribute" property.
   * <p>
   * Specifies the name of the attribute to hold user certificates.
   * <p>
   * This property must specify the name of a valid attribute type
   * defined in the server schema.
   *
   * @param value The value of the "certificate-attribute" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setCertificateAttribute(AttributeType value) throws IllegalPropertyValueException;



  /**
   * Gets the "certificate-mapper" property.
   * <p>
   * Specifies the name of the certificate mapper that should be used
   * to match client certificates to user entries.
   *
   * @return Returns the value of the "certificate-mapper" property.
   */
  String getCertificateMapper();



  /**
   * Sets the "certificate-mapper" property.
   * <p>
   * Specifies the name of the certificate mapper that should be used
   * to match client certificates to user entries.
   *
   * @param value The value of the "certificate-mapper" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setCertificateMapper(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "certificate-validation-policy" property.
   * <p>
   * Indicates whether to attempt to validate the peer certificate
   * against a certificate held in the user's entry.
   *
   * @return Returns the value of the "certificate-validation-policy" property.
   */
  CertificateValidationPolicy getCertificateValidationPolicy();



  /**
   * Sets the "certificate-validation-policy" property.
   * <p>
   * Indicates whether to attempt to validate the peer certificate
   * against a certificate held in the user's entry.
   *
   * @param value The value of the "certificate-validation-policy" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setCertificateValidationPolicy(CertificateValidationPolicy value) throws IllegalPropertyValueException;



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

}
