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



/**
 * A server-side interface for querying Soft Reference Entry Cache
 * settings.
 * <p>
 * The Soft Reference Entry Cache is a Directory Server entry cache
 * implementation that uses soft references to manage objects to allow
 * them to be freed if the JVM is running low on memory.
 */
public interface SoftReferenceEntryCacheCfg extends EntryCacheCfg {

  /**
   * Gets the configuration class associated with this Soft Reference Entry Cache.
   *
   * @return Returns the configuration class associated with this Soft Reference Entry Cache.
   */
  Class<? extends SoftReferenceEntryCacheCfg> configurationClass();



  /**
   * Register to be notified when this Soft Reference Entry Cache is changed.
   *
   * @param listener
   *          The Soft Reference Entry Cache configuration change listener.
   */
  void addSoftReferenceChangeListener(ConfigurationChangeListener<SoftReferenceEntryCacheCfg> listener);



  /**
   * Deregister an existing Soft Reference Entry Cache configuration change listener.
   *
   * @param listener
   *          The Soft Reference Entry Cache configuration change listener.
   */
  void removeSoftReferenceChangeListener(ConfigurationChangeListener<SoftReferenceEntryCacheCfg> listener);



  /**
   * Gets the "exclude-filter" property.
   * <p>
   * The set of filters that define the entries that should be
   * excluded from the cache.
   *
   * @return Returns an unmodifiable set containing the values of the "exclude-filter" property.
   */
  SortedSet<String> getExcludeFilter();



  /**
   * Gets the "include-filter" property.
   * <p>
   * The set of filters that define the entries that should be
   * included in the cache.
   *
   * @return Returns an unmodifiable set containing the values of the "include-filter" property.
   */
  SortedSet<String> getIncludeFilter();



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Soft Reference Entry Cache implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();



  /**
   * Gets the "lock-timeout" property.
   * <p>
   * Specifies the length of time in milliseconds to wait while
   * attempting to acquire a read or write lock.
   *
   * @return Returns the value of the "lock-timeout" property.
   */
  long getLockTimeout();

}
