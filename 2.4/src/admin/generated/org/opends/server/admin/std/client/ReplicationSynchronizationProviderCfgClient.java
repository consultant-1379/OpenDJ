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
import org.opends.server.admin.client.AuthorizationException;
import org.opends.server.admin.client.CommunicationException;
import org.opends.server.admin.client.ConcurrentModificationException;
import org.opends.server.admin.client.IllegalManagedObjectNameException;
import org.opends.server.admin.client.ManagedObjectDecodingException;
import org.opends.server.admin.client.OperationRejectedException;
import org.opends.server.admin.DefaultBehaviorException;
import org.opends.server.admin.DefinitionDecodingException;
import org.opends.server.admin.IllegalPropertyValueException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.ManagedObjectNotFoundException;
import org.opends.server.admin.std.server.ReplicationDomainCfg;
import org.opends.server.admin.std.server.ReplicationServerCfg;
import org.opends.server.admin.std.server.ReplicationSynchronizationProviderCfg;



/**
 * A client-side interface for reading and modifying Replication
 * Synchronization Provider settings.
 * <p>
 * The Replication Synchronization Provider provides multi-master
 * replication of data across multiple Directory Server instances.
 */
public interface ReplicationSynchronizationProviderCfgClient extends SynchronizationProviderCfgClient {

  /**
   * Get the configuration definition associated with this Replication Synchronization Provider.
   *
   * @return Returns the configuration definition associated with this Replication Synchronization Provider.
   */
  ManagedObjectDefinition<? extends ReplicationSynchronizationProviderCfgClient, ? extends ReplicationSynchronizationProviderCfg> definition();



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
   * Sets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Replication Synchronization Provider implementation.
   *
   * @param value The value of the "java-class" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setJavaClass(String value) throws IllegalPropertyValueException;



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
   * Sets the "num-update-replay-threads" property.
   * <p>
   * Specifies the number of update replay threads.
   * <p>
   * This value is the number of threads created for replaying every
   * updates received for all the replication domains.
   *
   * @param value The value of the "num-update-replay-threads" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setNumUpdateReplayThreads(Integer value) throws IllegalPropertyValueException;



  /**
   * Lists the Replication Domains.
   *
   * @return Returns an array containing the names of the Replication
   *         Domains.
   * @throws ConcurrentModificationException
   *           If this Replication Synchronization Provider has been
   *           removed from the server by another client.
   * @throws AuthorizationException
   *           If the server refuses to list the Replication Domains
   *           because the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  String[] listReplicationDomains() throws ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Gets the named Replication Domain.
   *
   * @param name
   *           The name of the Replication Domain to retrieve.
   * @return Returns the named Replication Domain.
   * @throws DefinitionDecodingException
   *           If the named Replication Domain was found but its type
   *           could not be determined.
   * @throws ManagedObjectDecodingException
   *           If the named Replication Domain was found but one or
   *           more of its properties could not be decoded.
   * @throws ManagedObjectNotFoundException
   *           If the named Replication Domain was not found on the
   *           server.
   * @throws ConcurrentModificationException
   *           If this Replication Synchronization Provider has been
   *           removed from the server by another client.
   * @throws AuthorizationException
   *           If the server refuses to retrieve the named Replication
   *           Domain because the client does not have the correct
   *           privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  ReplicationDomainCfgClient getReplicationDomain(String name)
      throws DefinitionDecodingException, ManagedObjectDecodingException,
      ManagedObjectNotFoundException, ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Creates a new Replication Domain. The new Replication Domain will
   * initially not contain any property values (including mandatory
   * properties). Once the Replication Domain has been configured it
   * can be added to the server using the {@link #commit()} method.
   *
   * @param <C>
   *          The type of the Replication Domain being created.
   * @param d
   *          The definition of the Replication Domain to be created.
   * @param name
   *          The name of the new Replication Domain.
   * @param exceptions
   *          An optional collection in which to place any {@link
   *          DefaultBehaviorException}s that occurred whilst
   *          attempting to determine the default values of the
   *          Replication Domain. This argument can be
   *          <code>null<code>.
   * @return Returns a new Replication Domain configuration instance.
   * @throws IllegalManagedObjectNameException
   *          If the name of the new Replication Domain is invalid.
   */
  <C extends ReplicationDomainCfgClient> C createReplicationDomain(
      ManagedObjectDefinition<C, ? extends ReplicationDomainCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException;



  /**
   * Removes the named Replication Domain.
   *
   * @param name
   *          The name of the Replication Domain to remove.
   * @throws ManagedObjectNotFoundException
   *           If the Replication Domain does not exist.
   * @throws OperationRejectedException
   *           If the server refuses to remove the Replication Domain
   *           due to some server-side constraint which cannot be
   *           satisfied (for example, if it is referenced by another
   *           managed object).
   * @throws ConcurrentModificationException
   *           If this Replication Synchronization Provider has been
   *           removed from the server by another client.
   * @throws AuthorizationException
   *           If the server refuses to remove the Replication Domain
   *           because the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  void removeReplicationDomain(String name)
      throws ManagedObjectNotFoundException, OperationRejectedException,
      ConcurrentModificationException, AuthorizationException,
      CommunicationException;



  /**
   * Determines whether or not the Replication Server exists.
   *
   * @return Returns <true> if the Replication Server exists.
   * @throws ConcurrentModificationException
   *           If this Replication Synchronization Provider has been
   *           removed from the server by another client.
   * @throws AuthorizationException
   *           If the server refuses to make the determination because
   *           the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  boolean hasReplicationServer() throws ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Gets the Replication Server if it is present.
   *
   * @return Returns the Replication Server if it is present.
   * @throws DefinitionDecodingException
   *           If the Replication Server was found but its type could
   *           not be determined.
   * @throws ManagedObjectDecodingException
   *           If the Replication Server was found but one or more of
   *           its properties could not be decoded.
   * @throws ManagedObjectNotFoundException
   *           If the Replication Server is not present.
   * @throws ConcurrentModificationException
   *           If this Replication Synchronization Provider has been
   *           removed from the server by another client.
   * @throws AuthorizationException
   *           If the server refuses to retrieve the Replication
   *           Server because the client does not have the correct
   *           privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  ReplicationServerCfgClient getReplicationServer()
      throws DefinitionDecodingException, ManagedObjectDecodingException,
      ManagedObjectNotFoundException, ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Creates a new Replication Server. The new Replication Server will
   * initially not contain any property values (including mandatory
   * properties). Once the Replication Server has been configured it
   * can be added to the server using the {@link #commit()} method.
   *
   * @param <C>
   *          The type of the Replication Server being created.
   * @param d
   *          The definition of the Replication Server to be created.
   * @param exceptions
   *          An optional collection in which to place any {@link
   *          DefaultBehaviorException}s that occurred whilst
   *          attempting to determine the default values of the
   *          Replication Server. This argument can be
   *          <code>null<code>.
   * @return Returns a new Replication Server configuration instance.
   */
  <C extends ReplicationServerCfgClient> C createReplicationServer(
      ManagedObjectDefinition<C, ? extends ReplicationServerCfg> d, Collection<DefaultBehaviorException> exceptions);



  /**
   * Removes the Replication Server if it exists.
   *
   * @throws ManagedObjectNotFoundException
   *           If the Replication Server does not exist.
   * @throws OperationRejectedException
   *           If the server refuses to remove the Replication Server
   *           due to some server-side constraint which cannot be
   *           satisfied (for example, if it is referenced by another
   *           managed object).
   * @throws ConcurrentModificationException
   *           If this Replication Synchronization Provider has been
   *           removed from the server by another client.
   * @throws AuthorizationException
   *           If the server refuses to remove the Replication Server
   *           because the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  void removeReplicationServer()
      throws ManagedObjectNotFoundException, OperationRejectedException,
      ConcurrentModificationException, AuthorizationException,
      CommunicationException;

}
