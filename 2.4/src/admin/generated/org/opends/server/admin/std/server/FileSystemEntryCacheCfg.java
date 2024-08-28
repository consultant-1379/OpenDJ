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
import org.opends.server.admin.std.meta.FileSystemEntryCacheCfgDefn.CacheType;



/**
 * A server-side interface for querying File System Entry Cache
 * settings.
 * <p>
 * The File System Entry Cache is an entry cache implementation which
 * uses a JE database to keep track of the entries.
 */
public interface FileSystemEntryCacheCfg extends EntryCacheCfg {

  /**
   * Gets the configuration class associated with this File System Entry Cache.
   *
   * @return Returns the configuration class associated with this File System Entry Cache.
   */
  Class<? extends FileSystemEntryCacheCfg> configurationClass();



  /**
   * Register to be notified when this File System Entry Cache is changed.
   *
   * @param listener
   *          The File System Entry Cache configuration change listener.
   */
  void addFileSystemChangeListener(ConfigurationChangeListener<FileSystemEntryCacheCfg> listener);



  /**
   * Deregister an existing File System Entry Cache configuration change listener.
   *
   * @param listener
   *          The File System Entry Cache configuration change listener.
   */
  void removeFileSystemChangeListener(ConfigurationChangeListener<FileSystemEntryCacheCfg> listener);



  /**
   * Gets the "cache-directory" property.
   * <p>
   * Specifies the directory in which the JE environment should store
   * the cache.
   *
   * @return Returns the value of the "cache-directory" property.
   */
  String getCacheDirectory();



  /**
   * Gets the "cache-type" property.
   * <p>
   * Specifies the policy which should be used for purging entries
   * from the cache.
   *
   * @return Returns the value of the "cache-type" property.
   */
  CacheType getCacheType();



  /**
   * Gets the "compact-encoding" property.
   * <p>
   * Indicates whether the cache should use a compact form when
   * encoding cache entries by compressing the attribute descriptions
   * and object class sets.
   * <p>
   * Note that compression does not preserve user-supplied
   * capitalization in the object class and attribute type names.
   *
   * @return Returns the value of the "compact-encoding" property.
   */
  boolean isCompactEncoding();



  /**
   * Gets the "db-cache-percent" property.
   * <p>
   * Specifies the maximum memory usage for the internal JE cache as a
   * percentage of the total JVM memory.
   *
   * @return Returns the value of the "db-cache-percent" property.
   */
  int getDBCachePercent();



  /**
   * Gets the "db-cache-size" property.
   * <p>
   * Specifies the maximum JVM memory usage in bytes for the internal
   * JE cache.
   *
   * @return Returns the value of the "db-cache-size" property.
   */
  long getDBCacheSize();



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
   * provides the File System Entry Cache implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();



  /**
   * Gets the "je-property" property.
   * <p>
   * Specifies the environment properties for the Berkeley DB Java
   * Edition database providing the backend for this entry cache.
   * <p>
   * Any Berkeley DB Java Edition property can be specified using the
   * following form: property-name=property-value. Refer to the OpenDS
   * documentation for further information on related properties, their
   * implications and range values. The definitive identification of
   * all the property parameters available in the example.properties
   * file in the Berkeley DB Java Edition distribution.
   *
   * @return Returns an unmodifiable set containing the values of the "je-property" property.
   */
  SortedSet<String> getJEProperty();



  /**
   * Gets the "lock-timeout" property.
   * <p>
   * The length of time to wait while attempting to acquire a read or
   * write lock.
   *
   * @return Returns the value of the "lock-timeout" property.
   */
  long getLockTimeout();



  /**
   * Gets the "max-entries" property.
   * <p>
   * The maximum number of entries allowed in the cache.
   *
   * @return Returns the value of the "max-entries" property.
   */
  int getMaxEntries();



  /**
   * Gets the "max-memory-size" property.
   * <p>
   * The maximum size of the entry cache in bytes.
   *
   * @return Returns the value of the "max-memory-size" property.
   */
  long getMaxMemorySize();



  /**
   * Gets the "persistent-cache" property.
   * <p>
   * Specifies whether the cache should persist across restarts.
   *
   * @return Returns the value of the "persistent-cache" property.
   */
  boolean isPersistentCache();

}
