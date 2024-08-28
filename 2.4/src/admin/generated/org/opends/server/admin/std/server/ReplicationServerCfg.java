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
import org.opends.server.admin.Configuration;
import org.opends.server.admin.server.ConfigurationChangeListener;



/**
 * A server-side interface for querying Replication Server settings.
 * <p>
 * Replication Servers publish updates to Directory Servers within a
 * Replication Domain.
 */
public interface ReplicationServerCfg extends Configuration {

  /**
   * Gets the configuration class associated with this Replication Server.
   *
   * @return Returns the configuration class associated with this Replication Server.
   */
  Class<? extends ReplicationServerCfg> configurationClass();



  /**
   * Register to be notified when this Replication Server is changed.
   *
   * @param listener
   *          The Replication Server configuration change listener.
   */
  void addChangeListener(ConfigurationChangeListener<ReplicationServerCfg> listener);



  /**
   * Deregister an existing Replication Server configuration change listener.
   *
   * @param listener
   *          The Replication Server configuration change listener.
   */
  void removeChangeListener(ConfigurationChangeListener<ReplicationServerCfg> listener);



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
   * Gets the "queue-size" property.
   * <p>
   * Specifies the number of changes that are kept in memory for each
   * Directory Server in the Replication Domain.
   *
   * @return Returns the value of the "queue-size" property.
   */
  int getQueueSize();



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
   * Gets the "replication-port" property.
   * <p>
   * The port on which this Replication Server waits for connections
   * from other Replication Servers or Directory Servers.
   *
   * @return Returns the value of the "replication-port" property.
   */
  int getReplicationPort();



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
   * Gets the "replication-server" property.
   * <p>
   * Specifies the addresses of other Replication Servers to which
   * this Replication Server tries to connect at startup time.
   * <p>
   * Addresses must be specified using the syntax: hostname:port
   *
   * @return Returns an unmodifiable set containing the values of the "replication-server" property.
   */
  SortedSet<String> getReplicationServer();



  /**
   * Gets the "replication-server-id" property.
   * <p>
   * Specifies a unique identifier for the Replication Server.
   * <p>
   * Each Replication Server must have a different server ID.
   *
   * @return Returns the value of the "replication-server-id" property.
   */
  int getReplicationServerId();



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
   * Gets the "window-size" property.
   * <p>
   * Specifies the window size that the Replication Server uses when
   * communicating with other Replication Servers.
   *
   * @return Returns the value of the "window-size" property.
   */
  int getWindowSize();

}
