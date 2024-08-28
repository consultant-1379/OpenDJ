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
import org.opends.server.admin.std.meta.FileSystemEntryCacheCfgDefn.CacheType;
import org.opends.server.admin.std.server.FileSystemEntryCacheCfg;



/**
 * A client-side interface for reading and modifying File System Entry
 * Cache settings.
 * <p>
 * The File System Entry Cache is an entry cache implementation which
 * uses a JE database to keep track of the entries.
 */
public interface FileSystemEntryCacheCfgClient extends EntryCacheCfgClient {

  /**
   * Get the configuration definition associated with this File System Entry Cache.
   *
   * @return Returns the configuration definition associated with this File System Entry Cache.
   */
  ManagedObjectDefinition<? extends FileSystemEntryCacheCfgClient, ? extends FileSystemEntryCacheCfg> definition();



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
   * Sets the "cache-directory" property.
   * <p>
   * Specifies the directory in which the JE environment should store
   * the cache.
   *
   * @param value The value of the "cache-directory" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setCacheDirectory(String value) throws IllegalPropertyValueException;



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
   * Sets the "cache-type" property.
   * <p>
   * Specifies the policy which should be used for purging entries
   * from the cache.
   *
   * @param value The value of the "cache-type" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setCacheType(CacheType value) throws IllegalPropertyValueException;



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
   * Sets the "compact-encoding" property.
   * <p>
   * Indicates whether the cache should use a compact form when
   * encoding cache entries by compressing the attribute descriptions
   * and object class sets.
   * <p>
   * Note that compression does not preserve user-supplied
   * capitalization in the object class and attribute type names.
   *
   * @param value The value of the "compact-encoding" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setCompactEncoding(Boolean value) throws IllegalPropertyValueException;



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
   * Sets the "db-cache-percent" property.
   * <p>
   * Specifies the maximum memory usage for the internal JE cache as a
   * percentage of the total JVM memory.
   *
   * @param value The value of the "db-cache-percent" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setDBCachePercent(Integer value) throws IllegalPropertyValueException;



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
   * Sets the "db-cache-size" property.
   * <p>
   * Specifies the maximum JVM memory usage in bytes for the internal
   * JE cache.
   *
   * @param value The value of the "db-cache-size" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setDBCacheSize(Long value) throws IllegalPropertyValueException;



  /**
   * Gets the "exclude-filter" property.
   * <p>
   * The set of filters that define the entries that should be
   * excluded from the cache.
   *
   * @return Returns the values of the "exclude-filter" property.
   */
  SortedSet<String> getExcludeFilter();



  /**
   * Sets the "exclude-filter" property.
   * <p>
   * The set of filters that define the entries that should be
   * excluded from the cache.
   *
   * @param values The values of the "exclude-filter" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setExcludeFilter(Collection<String> values) throws IllegalPropertyValueException;



  /**
   * Gets the "include-filter" property.
   * <p>
   * The set of filters that define the entries that should be
   * included in the cache.
   *
   * @return Returns the values of the "include-filter" property.
   */
  SortedSet<String> getIncludeFilter();



  /**
   * Sets the "include-filter" property.
   * <p>
   * The set of filters that define the entries that should be
   * included in the cache.
   *
   * @param values The values of the "include-filter" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setIncludeFilter(Collection<String> values) throws IllegalPropertyValueException;



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
   * Sets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the File System Entry Cache implementation.
   *
   * @param value The value of the "java-class" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setJavaClass(String value) throws IllegalPropertyValueException;



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
   * @return Returns the values of the "je-property" property.
   */
  SortedSet<String> getJEProperty();



  /**
   * Sets the "je-property" property.
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
   * @param values The values of the "je-property" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setJEProperty(Collection<String> values) throws IllegalPropertyValueException;



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
   * Sets the "lock-timeout" property.
   * <p>
   * The length of time to wait while attempting to acquire a read or
   * write lock.
   *
   * @param value The value of the "lock-timeout" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setLockTimeout(Long value) throws IllegalPropertyValueException;



  /**
   * Gets the "max-entries" property.
   * <p>
   * The maximum number of entries allowed in the cache.
   *
   * @return Returns the value of the "max-entries" property.
   */
  int getMaxEntries();



  /**
   * Sets the "max-entries" property.
   * <p>
   * The maximum number of entries allowed in the cache.
   *
   * @param value The value of the "max-entries" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setMaxEntries(Integer value) throws IllegalPropertyValueException;



  /**
   * Gets the "max-memory-size" property.
   * <p>
   * The maximum size of the entry cache in bytes.
   *
   * @return Returns the value of the "max-memory-size" property.
   */
  long getMaxMemorySize();



  /**
   * Sets the "max-memory-size" property.
   * <p>
   * The maximum size of the entry cache in bytes.
   *
   * @param value The value of the "max-memory-size" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setMaxMemorySize(Long value) throws IllegalPropertyValueException;



  /**
   * Gets the "persistent-cache" property.
   * <p>
   * Specifies whether the cache should persist across restarts.
   *
   * @return Returns the value of the "persistent-cache" property.
   */
  boolean isPersistentCache();



  /**
   * Sets the "persistent-cache" property.
   * <p>
   * Specifies whether the cache should persist across restarts.
   *
   * @param value The value of the "persistent-cache" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setPersistentCache(Boolean value) throws IllegalPropertyValueException;

}
