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
 * A server-side interface for querying Triple DES Password Storage
 * Scheme settings.
 * <p>
 * The Triple DES Password Storage Scheme provides a mechanism for
 * encoding user passwords using the triple-DES (DES/EDE) reversible
 * encryption mechanism.
 */
public interface TripleDESPasswordStorageSchemeCfg extends PasswordStorageSchemeCfg {

  /**
   * Gets the configuration class associated with this Triple DES Password Storage Scheme.
   *
   * @return Returns the configuration class associated with this Triple DES Password Storage Scheme.
   */
  Class<? extends TripleDESPasswordStorageSchemeCfg> configurationClass();



  /**
   * Register to be notified when this Triple DES Password Storage Scheme is changed.
   *
   * @param listener
   *          The Triple DES Password Storage Scheme configuration change listener.
   */
  void addTripleDESChangeListener(ConfigurationChangeListener<TripleDESPasswordStorageSchemeCfg> listener);



  /**
   * Deregister an existing Triple DES Password Storage Scheme configuration change listener.
   *
   * @param listener
   *          The Triple DES Password Storage Scheme configuration change listener.
   */
  void removeTripleDESChangeListener(ConfigurationChangeListener<TripleDESPasswordStorageSchemeCfg> listener);



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Triple DES Password Storage Scheme implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();

}
