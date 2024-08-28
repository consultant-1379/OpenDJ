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
import org.opends.server.admin.IllegalPropertyValueException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.std.server.SubjectAttributeToUserAttributeCertificateMapperCfg;
import org.opends.server.types.DN;



/**
 * A client-side interface for reading and modifying Subject Attribute
 * To User Attribute Certificate Mapper settings.
 * <p>
 * The Subject Attribute To User Attribute Certificate Mapper maps
 * client certificates to user entries by mapping the values of
 * attributes contained in the certificate subject to attributes
 * contained in user entries.
 */
public interface SubjectAttributeToUserAttributeCertificateMapperCfgClient extends CertificateMapperCfgClient {

  /**
   * Get the configuration definition associated with this Subject Attribute To User Attribute Certificate Mapper.
   *
   * @return Returns the configuration definition associated with this Subject Attribute To User Attribute Certificate Mapper.
   */
  ManagedObjectDefinition<? extends SubjectAttributeToUserAttributeCertificateMapperCfgClient, ? extends SubjectAttributeToUserAttributeCertificateMapperCfg> definition();



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Subject Attribute To User Attribute Certificate
   * Mapper implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();



  /**
   * Sets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Subject Attribute To User Attribute Certificate
   * Mapper implementation.
   *
   * @param value The value of the "java-class" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setJavaClass(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "subject-attribute-mapping" property.
   * <p>
   * Specifies a mapping between certificate attributes and user
   * attributes.
   * <p>
   * Each value should be in the form "certattr:userattr" where
   * certattr is the name of the attribute in the certificate subject
   * and userattr is the name of the corresponding attribute in user
   * entries. There may be multiple mappings defined, and when
   * performing the mapping values for all attributes present in the
   * certificate subject that have mappings defined must be present in
   * the corresponding user entries.
   *
   * @return Returns the values of the "subject-attribute-mapping" property.
   */
  SortedSet<String> getSubjectAttributeMapping();



  /**
   * Sets the "subject-attribute-mapping" property.
   * <p>
   * Specifies a mapping between certificate attributes and user
   * attributes.
   * <p>
   * Each value should be in the form "certattr:userattr" where
   * certattr is the name of the attribute in the certificate subject
   * and userattr is the name of the corresponding attribute in user
   * entries. There may be multiple mappings defined, and when
   * performing the mapping values for all attributes present in the
   * certificate subject that have mappings defined must be present in
   * the corresponding user entries.
   *
   * @param values The values of the "subject-attribute-mapping" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setSubjectAttributeMapping(Collection<String> values) throws IllegalPropertyValueException;



  /**
   * Gets the "user-base-dn" property.
   * <p>
   * Specifies the base DNs that should be used when performing
   * searches to map the client certificate to a user entry.
   *
   * @return Returns the values of the "user-base-dn" property.
   */
  SortedSet<DN> getUserBaseDN();



  /**
   * Sets the "user-base-dn" property.
   * <p>
   * Specifies the base DNs that should be used when performing
   * searches to map the client certificate to a user entry.
   *
   * @param values The values of the "user-base-dn" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setUserBaseDN(Collection<DN> values) throws IllegalPropertyValueException;

}
