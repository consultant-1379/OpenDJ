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
import org.opends.server.admin.std.server.ResourceLimitsQOSPolicyCfg;



/**
 * A client-side interface for reading and modifying Resource Limits
 * QOS Policy settings.
 * <p>
 * The Resource Limits QOS Policy are used to define resource limits
 * enforced by the server.
 */
public interface ResourceLimitsQOSPolicyCfgClient extends QOSPolicyCfgClient {

  /**
   * Get the configuration definition associated with this Resource Limits QOS Policy.
   *
   * @return Returns the configuration definition associated with this Resource Limits QOS Policy.
   */
  ManagedObjectDefinition<? extends ResourceLimitsQOSPolicyCfgClient, ? extends ResourceLimitsQOSPolicyCfg> definition();



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Resource Limits QOS Policy implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();



  /**
   * Sets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Resource Limits QOS Policy implementation.
   *
   * @param value The value of the "java-class" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setJavaClass(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "max-concurrent-ops-per-connection" property.
   * <p>
   * Specifies the maximum number of concurrent operations per client
   * connection.
   * <p>
   * A value of 0 means that no limit is enforced.
   *
   * @return Returns the value of the "max-concurrent-ops-per-connection" property.
   */
  int getMaxConcurrentOpsPerConnection();



  /**
   * Sets the "max-concurrent-ops-per-connection" property.
   * <p>
   * Specifies the maximum number of concurrent operations per client
   * connection.
   * <p>
   * A value of 0 means that no limit is enforced.
   *
   * @param value The value of the "max-concurrent-ops-per-connection" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setMaxConcurrentOpsPerConnection(Integer value) throws IllegalPropertyValueException;



  /**
   * Gets the "max-connections" property.
   * <p>
   * Specifies the maximum number of concurrent client connections to
   * the server.
   * <p>
   * A value of 0 means that no limit is enforced.
   *
   * @return Returns the value of the "max-connections" property.
   */
  int getMaxConnections();



  /**
   * Sets the "max-connections" property.
   * <p>
   * Specifies the maximum number of concurrent client connections to
   * the server.
   * <p>
   * A value of 0 means that no limit is enforced.
   *
   * @param value The value of the "max-connections" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setMaxConnections(Integer value) throws IllegalPropertyValueException;



  /**
   * Gets the "max-connections-from-same-ip" property.
   * <p>
   * Specifies the maximum number of client connections from the same
   * source address.
   * <p>
   * A value of 0 means that no limit is enforced.
   *
   * @return Returns the value of the "max-connections-from-same-ip" property.
   */
  int getMaxConnectionsFromSameIP();



  /**
   * Sets the "max-connections-from-same-ip" property.
   * <p>
   * Specifies the maximum number of client connections from the same
   * source address.
   * <p>
   * A value of 0 means that no limit is enforced.
   *
   * @param value The value of the "max-connections-from-same-ip" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setMaxConnectionsFromSameIP(Integer value) throws IllegalPropertyValueException;



  /**
   * Gets the "max-ops-interval" property.
   * <p>
   * Specifies the interval during which the number of operations is
   * limited.
   * <p>
   * When the maximum number of operations per interval is reached,
   * all subsequent operations on the same network group are refused
   * until the end of the time interval. This parameter allows to limit
   * the throughput on the network group.
   *
   * @return Returns the value of the "max-ops-interval" property.
   */
  long getMaxOpsInterval();



  /**
   * Sets the "max-ops-interval" property.
   * <p>
   * Specifies the interval during which the number of operations is
   * limited.
   * <p>
   * When the maximum number of operations per interval is reached,
   * all subsequent operations on the same network group are refused
   * until the end of the time interval. This parameter allows to limit
   * the throughput on the network group.
   *
   * @param value The value of the "max-ops-interval" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setMaxOpsInterval(Long value) throws IllegalPropertyValueException;



  /**
   * Gets the "max-ops-per-connection" property.
   * <p>
   * Specifies the maximum number of operations per client connection.
   * <p>
   * A value of 0 means that no limit is enforced.
   *
   * @return Returns the value of the "max-ops-per-connection" property.
   */
  int getMaxOpsPerConnection();



  /**
   * Sets the "max-ops-per-connection" property.
   * <p>
   * Specifies the maximum number of operations per client connection.
   * <p>
   * A value of 0 means that no limit is enforced.
   *
   * @param value The value of the "max-ops-per-connection" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setMaxOpsPerConnection(Integer value) throws IllegalPropertyValueException;



  /**
   * Gets the "max-ops-per-interval" property.
   * <p>
   * Specifies the maximum number of operations that can take place on
   * the same network group during the specified interval.
   * <p>
   * When the maximum number of operations per interval is reached,
   * all subsequent operations on the same network group are refused
   * until the end of the time interval. This parameter allows to limit
   * the throughput on the network group. A value of 0 indicates that
   * no limit is enforced.
   *
   * @return Returns the value of the "max-ops-per-interval" property.
   */
  int getMaxOpsPerInterval();



  /**
   * Sets the "max-ops-per-interval" property.
   * <p>
   * Specifies the maximum number of operations that can take place on
   * the same network group during the specified interval.
   * <p>
   * When the maximum number of operations per interval is reached,
   * all subsequent operations on the same network group are refused
   * until the end of the time interval. This parameter allows to limit
   * the throughput on the network group. A value of 0 indicates that
   * no limit is enforced.
   *
   * @param value The value of the "max-ops-per-interval" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setMaxOpsPerInterval(Integer value) throws IllegalPropertyValueException;



  /**
   * Gets the "min-substring-length" property.
   * <p>
   * Specifies the minimum length for a search filter substring.
   * <p>
   * Search operations with short search filter substring are likely
   * to match a high number of entries and might degrade performance
   * overall. A value of 0 indicates that no limit is enforced.
   *
   * @return Returns the value of the "min-substring-length" property.
   */
  int getMinSubstringLength();



  /**
   * Sets the "min-substring-length" property.
   * <p>
   * Specifies the minimum length for a search filter substring.
   * <p>
   * Search operations with short search filter substring are likely
   * to match a high number of entries and might degrade performance
   * overall. A value of 0 indicates that no limit is enforced.
   *
   * @param value The value of the "min-substring-length" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setMinSubstringLength(Integer value) throws IllegalPropertyValueException;



  /**
   * Gets the "size-limit" property.
   * <p>
   * Specifies the maximum number of entries that can be returned to
   * the client during a single search operation.
   * <p>
   * A value of 0 indicates that no size limit is enforced. Note that
   * this is the default for the server, but it may be overridden on a
   * per-user basis using the ds-rlim-size-limit operational attribute.
   *
   * @return Returns the value of the "size-limit" property.
   */
  Integer getSizeLimit();



  /**
   * Sets the "size-limit" property.
   * <p>
   * Specifies the maximum number of entries that can be returned to
   * the client during a single search operation.
   * <p>
   * A value of 0 indicates that no size limit is enforced. Note that
   * this is the default for the server, but it may be overridden on a
   * per-user basis using the ds-rlim-size-limit operational attribute.
   *
   * @param value The value of the "size-limit" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setSizeLimit(Integer value) throws IllegalPropertyValueException;



  /**
   * Gets the "time-limit" property.
   * <p>
   * Specifies the maximum length of time that should be spent
   * processing a search operation.
   * <p>
   * A value of 0 seconds indicates that no time limit is enforced.
   * Note that this is the default for the server, but it may be
   * overridden on a per-user basis using the ds-rlim-time-limit
   * operational attribute.
   *
   * @return Returns the value of the "time-limit" property.
   */
  Long getTimeLimit();



  /**
   * Sets the "time-limit" property.
   * <p>
   * Specifies the maximum length of time that should be spent
   * processing a search operation.
   * <p>
   * A value of 0 seconds indicates that no time limit is enforced.
   * Note that this is the default for the server, but it may be
   * overridden on a per-user basis using the ds-rlim-time-limit
   * operational attribute.
   *
   * @param value The value of the "time-limit" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setTimeLimit(Long value) throws IllegalPropertyValueException;

}
