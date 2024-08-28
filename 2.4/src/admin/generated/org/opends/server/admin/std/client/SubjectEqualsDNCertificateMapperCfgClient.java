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
import org.opends.server.admin.std.server.SubjectEqualsDNCertificateMapperCfg;



/**
 * A client-side interface for reading and modifying Subject Equals DN
 * Certificate Mapper settings.
 * <p>
 * The Subject Equals DN Certificate Mapper maps client certificates
 * to user entries based on the assumption that the certificate subject
 * is the same as the DN of the target user entry.
 */
public interface SubjectEqualsDNCertificateMapperCfgClient extends CertificateMapperCfgClient {

  /**
   * Get the configuration definition associated with this Subject Equals DN Certificate Mapper.
   *
   * @return Returns the configuration definition associated with this Subject Equals DN Certificate Mapper.
   */
  ManagedObjectDefinition<? extends SubjectEqualsDNCertificateMapperCfgClient, ? extends SubjectEqualsDNCertificateMapperCfg> definition();



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Subject Equals DN Certificate Mapper implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();



  /**
   * Sets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Subject Equals DN Certificate Mapper implementation.
   *
   * @param value The value of the "java-class" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setJavaClass(String value) throws IllegalPropertyValueException;

}
