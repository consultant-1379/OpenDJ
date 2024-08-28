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
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.types.AttributeType;
import org.opends.server.types.DN;



/**
 * A server-side interface for querying Subject DN To User Attribute
 * Certificate Mapper settings.
 * <p>
 * The Subject DN To User Attribute Certificate Mapper maps client
 * certificates to user entries by looking for the certificate subject
 * DN in a specified attribute of user entries.
 */
public interface SubjectDNToUserAttributeCertificateMapperCfg extends CertificateMapperCfg {

  /**
   * Gets the configuration class associated with this Subject DN To User Attribute Certificate Mapper.
   *
   * @return Returns the configuration class associated with this Subject DN To User Attribute Certificate Mapper.
   */
  Class<? extends SubjectDNToUserAttributeCertificateMapperCfg> configurationClass();



  /**
   * Register to be notified when this Subject DN To User Attribute Certificate Mapper is changed.
   *
   * @param listener
   *          The Subject DN To User Attribute Certificate Mapper configuration change listener.
   */
  void addSubjectDNToUserAttributeChangeListener(ConfigurationChangeListener<SubjectDNToUserAttributeCertificateMapperCfg> listener);



  /**
   * Deregister an existing Subject DN To User Attribute Certificate Mapper configuration change listener.
   *
   * @param listener
   *          The Subject DN To User Attribute Certificate Mapper configuration change listener.
   */
  void removeSubjectDNToUserAttributeChangeListener(ConfigurationChangeListener<SubjectDNToUserAttributeCertificateMapperCfg> listener);



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Subject DN To User Attribute Certificate Mapper
   * implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();



  /**
   * Gets the "subject-attribute" property.
   * <p>
   * Specifies the name or OID of the attribute whose value should
   * exactly match the certificate subject DN.
   *
   * @return Returns the value of the "subject-attribute" property.
   */
  AttributeType getSubjectAttribute();



  /**
   * Gets the "user-base-dn" property.
   * <p>
   * Specifies the base DNs that should be used when performing
   * searches to map the client certificate to a user entry.
   *
   * @return Returns an unmodifiable set containing the values of the "user-base-dn" property.
   */
  SortedSet<DN> getUserBaseDN();

}
