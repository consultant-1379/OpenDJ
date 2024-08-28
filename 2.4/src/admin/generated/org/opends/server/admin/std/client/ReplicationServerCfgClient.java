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
import org.opends.server.admin.ConfigurationClient;
import org.opends.server.admin.IllegalPropertyValueException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.PropertyIsReadOnlyException;
import org.opends.server.admin.std.server.ReplicationServerCfg;



/**
 * A client-side interface for reading and modifying Replication
 * Server settings.
 * <p>
 * Replication Servers publish updates to Directory Servers within a
 * Replication Domain.
 */
public interface ReplicationServerCfgClient extends ConfigurationClient {

  /**
   * Get the configuration definition associated with this Replication Server.
   *
   * @return Returns the configuration definition associated with this Replication Server.
   */
  ManagedObjectDefinition<? extends ReplicationServerCfgClient, ? extends ReplicationServerCfg> definition();



  /**
   * Gets the "assured-timeout" property.
   * <p>
   * The timeout value when waiting for assured mode acknowledgments.
   * <p>
   * Defines the number of milliseconds that the replication server
   * will wait for assured acknowledgments (in either Safe Data or Safe
   * Read assured sub modes) before forgetting them and answer to the
   * entity that sent an update and is waiting for acknowledgment.
   *
   * @return Returns the value of the "assured-timeout" property.
   */
  long getAssuredTimeout();



  /**
   * Sets the "assured-timeout" property.
   * <p>
   * The timeout value when waiting for assured mode acknowledgments.
   * <p>
   * Defines the number of milliseconds that the replication server
   * will wait for assured acknowledgments (in either Safe Data or Safe
   * Read assured sub modes) before forgetting them and answer to the
   * entity that sent an update and is waiting for acknowledgment.
   *
   * @param value The value of the "assured-timeout" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setAssuredTimeout(Long value) throws IllegalPropertyValueException;



  /**
   * Gets the "degraded-status-threshold" property.
   * <p>
   * The number of pending changes as threshold value for putting a
   * directory server in degraded status.
   * <p>
   * This value represents a number of pending changes a replication
   * server has in queue for sending to a directory server. Once this
   * value is crossed, the matching directory server goes in degraded
   * status. When number of pending changes goes back under this value,
   * the directory server is put back in normal status. 0 means status
   * analyzer is disabled and directory servers are never put in
   * degraded status.
   *
   * @return Returns the value of the "degraded-status-threshold" property.
   */
  int getDegradedStatusThreshold();



  /**
   * Sets the "degraded-status-threshold" property.
   * <p>
   * The number of pending changes as threshold value for putting a
   * directory server in degraded status.
   * <p>
   * This value represents a number of pending changes a replication
   * server has in queue for sending to a directory server. Once this
   * value is crossed, the matching directory server goes in degraded
   * status. When number of pending changes goes back under this value,
   * the directory server is put back in normal status. 0 means status
   * analyzer is disabled and directory servers are never put in
   * degraded status.
   *
   * @param value The value of the "degraded-status-threshold" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setDegradedStatusThreshold(Integer value) throws IllegalPropertyValueException;



  /**
   * Gets the "group-id" property.
   * <p>
   * The group id for the replication server.
   * <p>
   * This value defines the group id of the replication server. The
   * replication system of a LDAP server uses the group id of the
   * replicated domain and tries to connect, if possible, to a
   * replication with the same group id.
   *
   * @return Returns the value of the "group-id" property.
   */
  int getGroupId();



  /**
   * Sets the "group-id" property.
   * <p>
   * The group id for the replication server.
   * <p>
   * This value defines the group id of the replication server. The
   * replication system of a LDAP server uses the group id of the
   * replicated domain and tries to connect, if possible, to a
   * replication with the same group id.
   *
   * @param value The value of the "group-id" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setGroupId(Integer value) throws IllegalPropertyValueException;



  /**
   * Gets the "monitoring-period" property.
   * <p>
   * The period between sending of monitoring messages.
   * <p>
   * Defines the number of milliseconds that the replication server
   * will wait before sending new monitoring messages to its peers
   * (replication servers and directory servers).
   *
   * @return Returns the value of the "monitoring-period" property.
   */
  long getMonitoringPeriod();



  /**
   * Sets the "monitoring-period" property.
   * <p>
   * The period between sending of monitoring messages.
   * <p>
   * Defines the number of milliseconds that the replication server
   * will wait before sending new monitoring messages to its peers
   * (replication servers and directory servers).
   *
   * @param value The value of the "monitoring-period" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setMonitoringPeriod(Long value) throws IllegalPropertyValueException;



  /**
   * Gets the "queue-size" property.
   * <p>
   * Specifies the number of changes that are kept in memory for each
   * Directory Server in the Replication Domain.
   *
   * @return Returns the value of the "queue-size" property.
   */
  int getQueueSize();



  /**
   * Sets the "queue-size" property.
   * <p>
   * Specifies the number of changes that are kept in memory for each
   * Directory Server in the Replication Domain.
   *
   * @param value The value of the "queue-size" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setQueueSize(Integer value) throws IllegalPropertyValueException;



  /**
   * Gets the "replication-db-directory" property.
   * <p>
   * The path where the Replication Server stores all persistent
   * information.
   *
   * @return Returns the value of the "replication-db-directory" property.
   */
  String getReplicationDBDirectory();



  /**
   * Sets the "replication-db-directory" property.
   * <p>
   * The path where the Replication Server stores all persistent
   * information.
   * <p>
   * This property is read-only and can only be modified during
   * creation of a Replication Server.
   *
   * @param value The value of the "replication-db-directory" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   * @throws PropertyIsReadOnlyException
   *           If this Replication Server is not being initialized.
   */
  void setReplicationDBDirectory(String value) throws IllegalPropertyValueException, PropertyIsReadOnlyException;



  /**
   * Gets the "replication-port" property.
   * <p>
   * The port on which this Replication Server waits for connections
   * from other Replication Servers or Directory Servers.
   *
   * @return Returns the value of the "replication-port" property.
   */
  Integer getReplicationPort();



  /**
   * Sets the "replication-port" property.
   * <p>
   * The port on which this Replication Server waits for connections
   * from other Replication Servers or Directory Servers.
   *
   * @param value The value of the "replication-port" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setReplicationPort(int value) throws IllegalPropertyValueException;



  /**
   * Gets the "replication-purge-delay" property.
   * <p>
   * The time (in seconds) after which the Replication Server erases
   * all persistent information.
   *
   * @return Returns the value of the "replication-purge-delay" property.
   */
  long getReplicationPurgeDelay();



  /**
   * Sets the "replication-purge-delay" property.
   * <p>
   * The time (in seconds) after which the Replication Server erases
   * all persistent information.
   *
   * @param value The value of the "replication-purge-delay" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setReplicationPurgeDelay(Long value) throws IllegalPropertyValueException;



  /**
   * Gets the "replication-server" property.
   * <p>
   * Specifies the addresses of other Replication Servers to which
   * this Replication Server tries to connect at startup time.
   * <p>
   * Addresses must be specified using the syntax: hostname:port
   *
   * @return Returns the values of the "replication-server" property.
   */
  SortedSet<String> getReplicationServer();



  /**
   * Sets the "replication-server" property.
   * <p>
   * Specifies the addresses of other Replication Servers to which
   * this Replication Server tries to connect at startup time.
   * <p>
   * Addresses must be specified using the syntax: hostname:port
   *
   * @param values The values of the "replication-server" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setReplicationServer(Collection<String> values) throws IllegalPropertyValueException;



  /**
   * Gets the "replication-server-id" property.
   * <p>
   * Specifies a unique identifier for the Replication Server.
   * <p>
   * Each Replication Server must have a different server ID.
   *
   * @return Returns the value of the "replication-server-id" property.
   */
  Integer getReplicationServerId();



  /**
   * Sets the "replication-server-id" property.
   * <p>
   * Specifies a unique identifier for the Replication Server.
   * <p>
   * Each Replication Server must have a different server ID.
   * <p>
   * This property is read-only and can only be modified during
   * creation of a Replication Server.
   *
   * @param value The value of the "replication-server-id" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   * @throws PropertyIsReadOnlyException
   *           If this Replication Server is not being initialized.
   */
  void setReplicationServerId(int value) throws IllegalPropertyValueException, PropertyIsReadOnlyException;



  /**
   * Gets the "weight" property.
   * <p>
   * The weight of the replication server.
   * <p>
   * The weight affected to the replication server. Each replication
   * server of the topology has a weight. When combined together, the
   * weights of the replication servers of a same group can be
   * translated to a percentage that determines the quantity of
   * directory servers of the topology that should be connected to a
   * replication server. For instance imagine a topology with 3
   * replication servers (with the same group id) with the following
   * weights: RS1=1, RS2=1, RS3=2. This means that RS1 should have 25%
   * of the directory servers connected in the topology, RS2 25%, and
   * RS3 50%. This may be useful if the replication servers of the
   * topology have a different power and one wants to spread the load
   * between the replication servers according to their power.
   *
   * @return Returns the value of the "weight" property.
   */
  int getWeight();



  /**
   * Sets the "weight" property.
   * <p>
   * The weight of the replication server.
   * <p>
   * The weight affected to the replication server. Each replication
   * server of the topology has a weight. When combined together, the
   * weights of the replication servers of a same group can be
   * translated to a percentage that determines the quantity of
   * directory servers of the topology that should be connected to a
   * replication server. For instance imagine a topology with 3
   * replication servers (with the same group id) with the following
   * weights: RS1=1, RS2=1, RS3=2. This means that RS1 should have 25%
   * of the directory servers connected in the topology, RS2 25%, and
   * RS3 50%. This may be useful if the replication servers of the
   * topology have a different power and one wants to spread the load
   * between the replication servers according to their power.
   *
   * @param value The value of the "weight" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setWeight(Integer value) throws IllegalPropertyValueException;



  /**
   * Gets the "window-size" property.
   * <p>
   * Specifies the window size that the Replication Server uses when
   * communicating with other Replication Servers.
   *
   * @return Returns the value of the "window-size" property.
   */
  int getWindowSize();



  /**
   * Sets the "window-size" property.
   * <p>
   * Specifies the window size that the Replication Server uses when
   * communicating with other Replication Servers.
   *
   * @param value The value of the "window-size" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setWindowSize(Integer value) throws IllegalPropertyValueException;

}
