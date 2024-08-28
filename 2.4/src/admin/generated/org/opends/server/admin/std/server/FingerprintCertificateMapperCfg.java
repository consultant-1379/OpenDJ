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
import org.opends.server.admin.std.meta.FingerprintCertificateMapperCfgDefn.FingerprintAlgorithm;
import org.opends.server.types.AttributeType;
import org.opends.server.types.DN;



/**
 * A server-side interface for querying Fingerprint Certificate Mapper
 * settings.
 * <p>
 * The Fingerprint Certificate Mapper maps client certificates to user
 * entries by looking for the MD5 or SHA1 fingerprint in a specified
 * attribute of user entries.
 */
public interface FingerprintCertificateMapperCfg extends CertificateMapperCfg {

  /**
   * Gets the configuration class associated with this Fingerprint Certificate Mapper.
   *
   * @return Returns the configuration class associated with this Fingerprint Certificate Mapper.
   */
  Class<? extends FingerprintCertificateMapperCfg> configurationClass();



  /**
   * Register to be notified when this Fingerprint Certificate Mapper is changed.
   *
   * @param listener
   *          The Fingerprint Certificate Mapper configuration change listener.
   */
  void addFingerprintChangeListener(ConfigurationChangeListener<FingerprintCertificateMapperCfg> listener);



  /**
   * Deregister an existing Fingerprint Certificate Mapper configuration change listener.
   *
   * @param listener
   *          The Fingerprint Certificate Mapper configuration change listener.
   */
  void removeFingerprintChangeListener(ConfigurationChangeListener<FingerprintCertificateMapperCfg> listener);



  /**
   * Gets the "fingerprint-algorithm" property.
   * <p>
   * Specifies the name of the digest algorithm to compute the
   * fingerprint of client certificates.
   *
   * @return Returns the value of the "fingerprint-algorithm" property.
   */
  FingerprintAlgorithm getFingerprintAlgorithm();



  /**
   * Gets the "fingerprint-attribute" property.
   * <p>
   * Specifies the attribute in which to look for the fingerprint.
   * <p>
   * Values of the fingerprint attribute should exactly match the MD5
   * or SHA1 representation of the certificate fingerprint.
   *
   * @return Returns the value of the "fingerprint-attribute" property.
   */
  AttributeType getFingerprintAttribute();



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Fingerprint Certificate Mapper implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();



  /**
   * Gets the "user-base-dn" property.
   * <p>
   * Specifies the set of base DNs below which to search for users.
   * <p>
   * The base DNs are used when performing searches to map the client
   * certificates to a user entry.
   *
   * @return Returns an unmodifiable set containing the values of the "user-base-dn" property.
   */
  SortedSet<DN> getUserBaseDN();

}
