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
import org.opends.server.admin.client.AuthorizationException;
import org.opends.server.admin.client.CommunicationException;
import org.opends.server.admin.client.ConcurrentModificationException;
import org.opends.server.admin.client.IllegalManagedObjectNameException;
import org.opends.server.admin.client.ManagedObjectDecodingException;
import org.opends.server.admin.client.OperationRejectedException;
import org.opends.server.admin.ConfigurationClient;
import org.opends.server.admin.DefaultBehaviorException;
import org.opends.server.admin.DefinitionDecodingException;
import org.opends.server.admin.IllegalPropertyValueException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.ManagedObjectNotFoundException;
import org.opends.server.admin.std.meta.RootDNCfgDefn.DefaultRootPrivilegeName;
import org.opends.server.admin.std.server.RootDNCfg;
import org.opends.server.admin.std.server.RootDNUserCfg;



/**
 * A client-side interface for reading and modifying Root DN settings.
 * <p>
 * The Root DN configuration contains all the Root DN Users defined in
 * the Directory Server. In addition, it also defines the default set
 * of privileges that Root DN Users automatically inherit.
 */
public interface RootDNCfgClient extends ConfigurationClient {

  /**
   * Get the configuration definition associated with this Root DN.
   *
   * @return Returns the configuration definition associated with this Root DN.
   */
  ManagedObjectDefinition<? extends RootDNCfgClient, ? extends RootDNCfg> definition();



  /**
   * Gets the "default-root-privilege-name" property.
   * <p>
   * Specifies the names of the privileges that root users will be
   * granted by default.
   *
   * @return Returns the values of the "default-root-privilege-name" property.
   */
  SortedSet<DefaultRootPrivilegeName> getDefaultRootPrivilegeName();



  /**
   * Sets the "default-root-privilege-name" property.
   * <p>
   * Specifies the names of the privileges that root users will be
   * granted by default.
   *
   * @param values The values of the "default-root-privilege-name" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setDefaultRootPrivilegeName(Collection<DefaultRootPrivilegeName> values) throws IllegalPropertyValueException;



  /**
   * Lists the Root DN Users.
   *
   * @return Returns an array containing the names of the Root DN
   *         Users.
   * @throws ConcurrentModificationException
   *           If this Root DN has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to list the Root DN Users because
   *           the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  String[] listRootDNUsers() throws ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Gets the named Root DN User.
   *
   * @param name
   *           The name of the Root DN User to retrieve.
   * @return Returns the named Root DN User.
   * @throws DefinitionDecodingException
   *           If the named Root DN User was found but its type could
   *           not be determined.
   * @throws ManagedObjectDecodingException
   *           If the named Root DN User was found but one or more of
   *           its properties could not be decoded.
   * @throws ManagedObjectNotFoundException
   *           If the named Root DN User was not found on the server.
   * @throws ConcurrentModificationException
   *           If this Root DN has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to retrieve the named Root DN
   *           User because the client does not have the correct
   *           privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  RootDNUserCfgClient getRootDNUser(String name)
      throws DefinitionDecodingException, ManagedObjectDecodingException,
      ManagedObjectNotFoundException, ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Creates a new Root DN User. The new Root DN User will initially
   * not contain any property values (including mandatory properties).
   * Once the Root DN User has been configured it can be added to the
   * server using the {@link #commit()} method.
   *
   * @param <C>
   *          The type of the Root DN User being created.
   * @param d
   *          The definition of the Root DN User to be created.
   * @param name
   *          The name of the new Root DN User.
   * @param exceptions
   *          An optional collection in which to place any {@link
   *          DefaultBehaviorException}s that occurred whilst
   *          attempting to determine the default values of the Root DN
   *          User. This argument can be <code>null<code>.
   * @return Returns a new Root DN User configuration instance.
   * @throws IllegalManagedObjectNameException
   *          If the name of the new Root DN User is invalid.
   */
  <C extends RootDNUserCfgClient> C createRootDNUser(
      ManagedObjectDefinition<C, ? extends RootDNUserCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException;



  /**
   * Removes the named Root DN User.
   *
   * @param name
   *          The name of the Root DN User to remove.
   * @throws ManagedObjectNotFoundException
   *           If the Root DN User does not exist.
   * @throws OperationRejectedException
   *           If the server refuses to remove the Root DN User due to
   *           some server-side constraint which cannot be satisfied
   *           (for example, if it is referenced by another managed
   *           object).
   * @throws ConcurrentModificationException
   *           If this Root DN has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to remove the Root DN User
   *           because the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  void removeRootDNUser(String name)
      throws ManagedObjectNotFoundException, OperationRejectedException,
      ConcurrentModificationException, AuthorizationException,
      CommunicationException;

}
