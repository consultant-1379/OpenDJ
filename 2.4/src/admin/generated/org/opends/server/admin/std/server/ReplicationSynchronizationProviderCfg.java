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



import org.opends.server.admin.server.ConfigurationAddListener;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.server.ConfigurationDeleteListener;
import org.opends.server.config.ConfigException;



/**
 * A server-side interface for querying Replication Synchronization
 * Provider settings.
 * <p>
 * The Replication Synchronization Provider provides multi-master
 * replication of data across multiple Directory Server instances.
 */
public interface ReplicationSynchronizationProviderCfg extends SynchronizationProviderCfg {

  /**
   * Gets the configuration class associated with this Replication Synchronization Provider.
   *
   * @return Returns the configuration class associated with this Replication Synchronization Provider.
   */
  Class<? extends ReplicationSynchronizationProviderCfg> configurationClass();



  /**
   * Register to be notified when this Replication Synchronization Provider is changed.
   *
   * @param listener
   *          The Replication Synchronization Provider configuration change listener.
   */
  void addReplicationChangeListener(ConfigurationChangeListener<ReplicationSynchronizationProviderCfg> listener);



  /**
   * Deregister an existing Replication Synchronization Provider configuration change listener.
   *
   * @param listener
   *          The Replication Synchronization Provider configuration change listener.
   */
  void removeReplicationChangeListener(ConfigurationChangeListener<ReplicationSynchronizationProviderCfg> listener);



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Replication Synchronization Provider implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();



  /**
   * Gets the "num-update-replay-threads" property.
   * <p>
   * Specifies the number of update replay threads.
   * <p>
   * This value is the number of threads created for replaying every
   * updates received for all the replication domains.
   *
   * @return Returns the value of the "num-update-replay-threads" property.
   */
  int getNumUpdateReplayThreads();



  /**
   * Lists the Replication Domains.
   *
   * @return Returns an array containing the names of the
   *         Replication Domains.
   */
  String[] listReplicationDomains();



  /**
   * Gets the named Replication Domain.
   *
   * @param name
   *          The name of the Replication Domain to retrieve.
   * @return Returns the named Replication Domain.
   * @throws ConfigException
   *           If the Replication Domain could not be found or it
   *           could not be successfully decoded.
   */
  ReplicationDomainCfg getReplicationDomain(String name) throws ConfigException;



  /**
   * Registers to be notified when new Replication Domains are added.
   *
   * @param listener
   *          The Replication Domain configuration add listener.
   * @throws ConfigException
   *          If the add listener could not be registered.
   */
  void addReplicationDomainAddListener(ConfigurationAddListener<ReplicationDomainCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Replication Domain configuration add listener.
   *
   * @param listener
   *          The Replication Domain configuration add listener.
   */
  void removeReplicationDomainAddListener(ConfigurationAddListener<ReplicationDomainCfg> listener);



  /**
   * Registers to be notified when existing Replication Domains are deleted.
   *
   * @param listener
   *          The Replication Domain configuration delete listener.
   * @throws ConfigException
   *          If the delete listener could not be registered.
   */
  void addReplicationDomainDeleteListener(ConfigurationDeleteListener<ReplicationDomainCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Replication Domain configuration delete listener.
   *
   * @param listener
   *          The Replication Domain configuration delete listener.
   */
  void removeReplicationDomainDeleteListener(ConfigurationDeleteListener<ReplicationDomainCfg> listener);



  /**
   * Determines whether or not the Replication Server exists.
   *
   * @return Returns <true> if the Replication Server exists.
   */
  boolean hasReplicationServer();



  /**
   * Gets the Replication Server if it is present.
   *
   * @return Returns the Replication Server if it is present.
   * @throws ConfigException
   *           If the Replication Server does not exist or it could not
   *           be successfully decoded.
   */
  ReplicationServerCfg getReplicationServer() throws ConfigException;



  /**
   * Registers to be notified when the Replication Server is added.
   *
   * @param listener
   *          The Replication Server configuration add listener.
   * @throws ConfigException
   *          If the add listener could not be registered.
   */
  void addReplicationServerAddListener(ConfigurationAddListener<ReplicationServerCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Replication Server configuration add listener.
   *
   * @param listener
   *          The Replication Server configuration add listener.
   */
  void removeReplicationServerAddListener(ConfigurationAddListener<ReplicationServerCfg> listener);



  /**
   * Registers to be notified the Replication Server is deleted.
   *
   * @param listener
   *          The Replication Server configuration delete listener.
   * @throws ConfigException
   *          If the delete listener could not be registered.
   */
  void addReplicationServerDeleteListener(ConfigurationDeleteListener<ReplicationServerCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Replication Server configuration delete listener.
   *
   * @param listener
   *          The Replication Server configuration delete listener.
   */
  void removeReplicationServerDeleteListener(ConfigurationDeleteListener<ReplicationServerCfg> listener);

}
