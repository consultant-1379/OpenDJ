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
import org.opends.server.admin.std.server.FIFOEntryCacheCfg;



/**
 * A client-side interface for reading and modifying FIFO Entry Cache
 * settings.
 * <p>
 * FIFO Entry Caches use a FIFO queue to keep track of the cached
 * entries.
 */
public interface FIFOEntryCacheCfgClient extends EntryCacheCfgClient {

  /**
   * Get the configuration definition associated with this FIFO Entry Cache.
   *
   * @return Returns the configuration definition associated with this FIFO Entry Cache.
   */
  ManagedObjectDefinition<? extends FIFOEntryCacheCfgClient, ? extends FIFOEntryCacheCfg> definition();



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
   * provides the FIFO Entry Cache implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();



  /**
   * Sets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the FIFO Entry Cache implementation.
   *
   * @param value The value of the "java-class" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setJavaClass(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "lock-timeout" property.
   * <p>
   * Specifies the length of time to wait while attempting to acquire
   * a read or write lock.
   *
   * @return Returns the value of the "lock-timeout" property.
   */
  long getLockTimeout();



  /**
   * Sets the "lock-timeout" property.
   * <p>
   * Specifies the length of time to wait while attempting to acquire
   * a read or write lock.
   *
   * @param value The value of the "lock-timeout" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setLockTimeout(Long value) throws IllegalPropertyValueException;



  /**
   * Gets the "max-entries" property.
   * <p>
   * Specifies the maximum number of entries that we will allow in the
   * cache.
   *
   * @return Returns the value of the "max-entries" property.
   */
  int getMaxEntries();



  /**
   * Sets the "max-entries" property.
   * <p>
   * Specifies the maximum number of entries that we will allow in the
   * cache.
   *
   * @param value The value of the "max-entries" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setMaxEntries(Integer value) throws IllegalPropertyValueException;



  /**
   * Gets the "max-memory-percent" property.
   * <p>
   * Specifies the maximum memory usage for the entry cache as a
   * percentage of the total JVM memory.
   *
   * @return Returns the value of the "max-memory-percent" property.
   */
  int getMaxMemoryPercent();



  /**
   * Sets the "max-memory-percent" property.
   * <p>
   * Specifies the maximum memory usage for the entry cache as a
   * percentage of the total JVM memory.
   *
   * @param value The value of the "max-memory-percent" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setMaxMemoryPercent(Integer value) throws IllegalPropertyValueException;

}
