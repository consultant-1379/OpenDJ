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



import org.opends.server.admin.Configuration;
import org.opends.server.admin.server.ConfigurationChangeListener;



/**
 * A server-side interface for querying Entry Cache settings.
 * <p>
 * Entry Caches are responsible for caching entries which are likely
 * to be accessed by client applications in order to improve Directory
 * Server performance.
 */
public interface EntryCacheCfg extends Configuration {

  /**
   * Gets the configuration class associated with this Entry Cache.
   *
   * @return Returns the configuration class associated with this Entry Cache.
   */
  Class<? extends EntryCacheCfg> configurationClass();



  /**
   * Register to be notified when this Entry Cache is changed.
   *
   * @param listener
   *          The Entry Cache configuration change listener.
   */
  void addChangeListener(ConfigurationChangeListener<EntryCacheCfg> listener);



  /**
   * Deregister an existing Entry Cache configuration change listener.
   *
   * @param listener
   *          The Entry Cache configuration change listener.
   */
  void removeChangeListener(ConfigurationChangeListener<EntryCacheCfg> listener);



  /**
   * Gets the "cache-level" property.
   * <p>
   * Specifies the cache level in the cache order if more than one
   * instance of the cache is configured.
   *
   * @return Returns the value of the "cache-level" property.
   */
  int getCacheLevel();



  /**
   * Gets the "enabled" property.
   * <p>
   * Indicates whether the Entry Cache is enabled.
   *
   * @return Returns the value of the "enabled" property.
   */
  boolean isEnabled();



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Entry Cache implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();

}
