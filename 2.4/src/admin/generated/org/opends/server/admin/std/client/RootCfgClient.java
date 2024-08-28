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
import org.opends.server.admin.ConfigurationClient;
import org.opends.server.admin.DefaultBehaviorException;
import org.opends.server.admin.DefinitionDecodingException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.ManagedObjectNotFoundException;
import org.opends.server.admin.std.server.AccountStatusNotificationHandlerCfg;
import org.opends.server.admin.std.server.AlertHandlerCfg;
import org.opends.server.admin.std.server.AttributeSyntaxCfg;
import org.opends.server.admin.std.server.BackendCfg;
import org.opends.server.admin.std.server.CertificateMapperCfg;
import org.opends.server.admin.std.server.ConnectionHandlerCfg;
import org.opends.server.admin.std.server.EntryCacheCfg;
import org.opends.server.admin.std.server.ExtendedOperationHandlerCfg;
import org.opends.server.admin.std.server.ExtensionCfg;
import org.opends.server.admin.std.server.GroupImplementationCfg;
import org.opends.server.admin.std.server.IdentityMapperCfg;
import org.opends.server.admin.std.server.KeyManagerProviderCfg;
import org.opends.server.admin.std.server.LogPublisherCfg;
import org.opends.server.admin.std.server.LogRetentionPolicyCfg;
import org.opends.server.admin.std.server.LogRotationPolicyCfg;
import org.opends.server.admin.std.server.MatchingRuleCfg;
import org.opends.server.admin.std.server.MonitorProviderCfg;
import org.opends.server.admin.std.server.NetworkGroupCfg;
import org.opends.server.admin.std.server.PasswordGeneratorCfg;
import org.opends.server.admin.std.server.PasswordPolicyCfg;
import org.opends.server.admin.std.server.PasswordStorageSchemeCfg;
import org.opends.server.admin.std.server.PasswordValidatorCfg;
import org.opends.server.admin.std.server.RootCfg;
import org.opends.server.admin.std.server.SASLMechanismHandlerCfg;
import org.opends.server.admin.std.server.SynchronizationProviderCfg;
import org.opends.server.admin.std.server.TrustManagerProviderCfg;
import org.opends.server.admin.std.server.VirtualAttributeCfg;
import org.opends.server.admin.std.server.WorkflowCfg;
import org.opends.server.admin.std.server.WorkflowElementCfg;



/**
 * A client-side interface for reading and modifying Root settings.
 * <p>
 * The root configuration provides an entry point to the rest of the
 * OpenDS Directory Server configuration.
 */
public interface RootCfgClient extends ConfigurationClient {

  /**
   * Get the configuration definition associated with this Root.
   *
   * @return Returns the configuration definition associated with this Root.
   */
  ManagedObjectDefinition<? extends RootCfgClient, ? extends RootCfg> definition();



  /**
   * Gets the Access Control Handler.
   *
   * @return Returns the Access Control Handler.
   * @throws DefinitionDecodingException
   *           If the Access Control Handler was found but its type
   *           could not be determined.
   * @throws ManagedObjectDecodingException
   *           If the Access Control Handler was found but one or more
   *           of its properties could not be decoded.
   * @throws ManagedObjectNotFoundException
   *           If the Access Control Handler could not be found on the
   *           server.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to retrieve the Access Control
   *           Handler because the client does not have the correct
   *           privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  AccessControlHandlerCfgClient getAccessControlHandler()
      throws DefinitionDecodingException, ManagedObjectDecodingException,
      ManagedObjectNotFoundException, ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Lists the Account Status Notification Handlers.
   *
   * @return Returns an array containing the names of the Account
   *         Status Notification Handlers.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to list the Account Status
   *           Notification Handlers because the client does not have
   *           the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  String[] listAccountStatusNotificationHandlers() throws ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Gets the named Account Status Notification Handler.
   *
   * @param name
   *           The name of the Account Status Notification Handler to
   *           retrieve.
   * @return Returns the named Account Status Notification Handler.
   * @throws DefinitionDecodingException
   *           If the named Account Status Notification Handler was
   *           found but its type could not be determined.
   * @throws ManagedObjectDecodingException
   *           If the named Account Status Notification Handler was
   *           found but one or more of its properties could not be
   *           decoded.
   * @throws ManagedObjectNotFoundException
   *           If the named Account Status Notification Handler was
   *           not found on the server.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to retrieve the named Account
   *           Status Notification Handler because the client does not
   *           have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  AccountStatusNotificationHandlerCfgClient getAccountStatusNotificationHandler(String name)
      throws DefinitionDecodingException, ManagedObjectDecodingException,
      ManagedObjectNotFoundException, ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Creates a new Account Status Notification Handler. The new
   * Account Status Notification Handler will initially not contain any
   * property values (including mandatory properties). Once the Account
   * Status Notification Handler has been configured it can be added to
   * the server using the {@link #commit()} method.
   *
   * @param <C>
   *          The type of the Account Status Notification Handler
   *          being created.
   * @param d
   *          The definition of the Account Status Notification
   *          Handler to be created.
   * @param name
   *          The name of the new Account Status Notification Handler.
   * @param exceptions
   *          An optional collection in which to place any {@link
   *          DefaultBehaviorException}s that occurred whilst
   *          attempting to determine the default values of the Account
   *          Status Notification Handler. This argument can be
   *          <code>null<code>.
   * @return Returns a new Account Status Notification Handler
   *         configuration instance.
   * @throws IllegalManagedObjectNameException
   *          If the name of the new Account Status Notification
   *          Handler is invalid.
   */
  <C extends AccountStatusNotificationHandlerCfgClient> C createAccountStatusNotificationHandler(
      ManagedObjectDefinition<C, ? extends AccountStatusNotificationHandlerCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException;



  /**
   * Removes the named Account Status Notification Handler.
   *
   * @param name
   *          The name of the Account Status Notification Handler to
   *          remove.
   * @throws ManagedObjectNotFoundException
   *           If the Account Status Notification Handler does not
   *           exist.
   * @throws OperationRejectedException
   *           If the server refuses to remove the Account Status
   *           Notification Handler due to some server-side constraint
   *           which cannot be satisfied (for example, if it is
   *           referenced by another managed object).
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to remove the Account Status
   *           Notification Handler because the client does not have
   *           the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  void removeAccountStatusNotificationHandler(String name)
      throws ManagedObjectNotFoundException, OperationRejectedException,
      ConcurrentModificationException, AuthorizationException,
      CommunicationException;



  /**
   * Gets the Administration Connector.
   *
   * @return Returns the Administration Connector.
   * @throws DefinitionDecodingException
   *           If the Administration Connector was found but its type
   *           could not be determined.
   * @throws ManagedObjectDecodingException
   *           If the Administration Connector was found but one or
   *           more of its properties could not be decoded.
   * @throws ManagedObjectNotFoundException
   *           If the Administration Connector could not be found on
   *           the server.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to retrieve the Administration
   *           Connector because the client does not have the correct
   *           privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  AdministrationConnectorCfgClient getAdministrationConnector()
      throws DefinitionDecodingException, ManagedObjectDecodingException,
      ManagedObjectNotFoundException, ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Lists the Alert Handlers.
   *
   * @return Returns an array containing the names of the Alert
   *         Handlers.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to list the Alert Handlers
   *           because the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  String[] listAlertHandlers() throws ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Gets the named Alert Handler.
   *
   * @param name
   *           The name of the Alert Handler to retrieve.
   * @return Returns the named Alert Handler.
   * @throws DefinitionDecodingException
   *           If the named Alert Handler was found but its type could
   *           not be determined.
   * @throws ManagedObjectDecodingException
   *           If the named Alert Handler was found but one or more of
   *           its properties could not be decoded.
   * @throws ManagedObjectNotFoundException
   *           If the named Alert Handler was not found on the server.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to retrieve the named Alert
   *           Handler because the client does not have the correct
   *           privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  AlertHandlerCfgClient getAlertHandler(String name)
      throws DefinitionDecodingException, ManagedObjectDecodingException,
      ManagedObjectNotFoundException, ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Creates a new Alert Handler. The new Alert Handler will initially
   * not contain any property values (including mandatory properties).
   * Once the Alert Handler has been configured it can be added to the
   * server using the {@link #commit()} method.
   *
   * @param <C>
   *          The type of the Alert Handler being created.
   * @param d
   *          The definition of the Alert Handler to be created.
   * @param name
   *          The name of the new Alert Handler.
   * @param exceptions
   *          An optional collection in which to place any {@link
   *          DefaultBehaviorException}s that occurred whilst
   *          attempting to determine the default values of the Alert
   *          Handler. This argument can be <code>null<code>.
   * @return Returns a new Alert Handler configuration instance.
   * @throws IllegalManagedObjectNameException
   *          If the name of the new Alert Handler is invalid.
   */
  <C extends AlertHandlerCfgClient> C createAlertHandler(
      ManagedObjectDefinition<C, ? extends AlertHandlerCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException;



  /**
   * Removes the named Alert Handler.
   *
   * @param name
   *          The name of the Alert Handler to remove.
   * @throws ManagedObjectNotFoundException
   *           If the Alert Handler does not exist.
   * @throws OperationRejectedException
   *           If the server refuses to remove the Alert Handler due
   *           to some server-side constraint which cannot be satisfied
   *           (for example, if it is referenced by another managed
   *           object).
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to remove the Alert Handler
   *           because the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  void removeAlertHandler(String name)
      throws ManagedObjectNotFoundException, OperationRejectedException,
      ConcurrentModificationException, AuthorizationException,
      CommunicationException;



  /**
   * Lists the Attribute Syntaxes.
   *
   * @return Returns an array containing the names of the Attribute
   *         Syntaxes.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to list the Attribute Syntaxes
   *           because the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  String[] listAttributeSyntaxes() throws ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Gets the named Attribute Syntax.
   *
   * @param name
   *           The name of the Attribute Syntax to retrieve.
   * @return Returns the named Attribute Syntax.
   * @throws DefinitionDecodingException
   *           If the named Attribute Syntax was found but its type
   *           could not be determined.
   * @throws ManagedObjectDecodingException
   *           If the named Attribute Syntax was found but one or more
   *           of its properties could not be decoded.
   * @throws ManagedObjectNotFoundException
   *           If the named Attribute Syntax was not found on the
   *           server.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to retrieve the named Attribute
   *           Syntax because the client does not have the correct
   *           privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  AttributeSyntaxCfgClient getAttributeSyntax(String name)
      throws DefinitionDecodingException, ManagedObjectDecodingException,
      ManagedObjectNotFoundException, ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Creates a new Attribute Syntax. The new Attribute Syntax will
   * initially not contain any property values (including mandatory
   * properties). Once the Attribute Syntax has been configured it can
   * be added to the server using the {@link #commit()} method.
   *
   * @param <C>
   *          The type of the Attribute Syntax being created.
   * @param d
   *          The definition of the Attribute Syntax to be created.
   * @param name
   *          The name of the new Attribute Syntax.
   * @param exceptions
   *          An optional collection in which to place any {@link
   *          DefaultBehaviorException}s that occurred whilst
   *          attempting to determine the default values of the
   *          Attribute Syntax. This argument can be <code>null<code>.
   * @return Returns a new Attribute Syntax configuration instance.
   * @throws IllegalManagedObjectNameException
   *          If the name of the new Attribute Syntax is invalid.
   */
  <C extends AttributeSyntaxCfgClient> C createAttributeSyntax(
      ManagedObjectDefinition<C, ? extends AttributeSyntaxCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException;



  /**
   * Removes the named Attribute Syntax.
   *
   * @param name
   *          The name of the Attribute Syntax to remove.
   * @throws ManagedObjectNotFoundException
   *           If the Attribute Syntax does not exist.
   * @throws OperationRejectedException
   *           If the server refuses to remove the Attribute Syntax
   *           due to some server-side constraint which cannot be
   *           satisfied (for example, if it is referenced by another
   *           managed object).
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to remove the Attribute Syntax
   *           because the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  void removeAttributeSyntax(String name)
      throws ManagedObjectNotFoundException, OperationRejectedException,
      ConcurrentModificationException, AuthorizationException,
      CommunicationException;



  /**
   * Lists the Backends.
   *
   * @return Returns an array containing the names of the Backends.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to list the Backends because the
   *           client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  String[] listBackends() throws ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Gets the named Backend.
   *
   * @param name
   *           The name of the Backend to retrieve.
   * @return Returns the named Backend.
   * @throws DefinitionDecodingException
   *           If the named Backend was found but its type could not
   *           be determined.
   * @throws ManagedObjectDecodingException
   *           If the named Backend was found but one or more of its
   *           properties could not be decoded.
   * @throws ManagedObjectNotFoundException
   *           If the named Backend was not found on the server.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to retrieve the named Backend
   *           because the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  BackendCfgClient getBackend(String name)
      throws DefinitionDecodingException, ManagedObjectDecodingException,
      ManagedObjectNotFoundException, ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Creates a new Backend. The new Backend will initially not contain
   * any property values (including mandatory properties). Once the
   * Backend has been configured it can be added to the server using
   * the {@link #commit()} method.
   *
   * @param <C>
   *          The type of the Backend being created.
   * @param d
   *          The definition of the Backend to be created.
   * @param name
   *          The name of the new Backend.
   * @param exceptions
   *          An optional collection in which to place any {@link
   *          DefaultBehaviorException}s that occurred whilst
   *          attempting to determine the default values of the
   *          Backend. This argument can be <code>null<code>.
   * @return Returns a new Backend configuration instance.
   * @throws IllegalManagedObjectNameException
   *          If the name of the new Backend is invalid.
   */
  <C extends BackendCfgClient> C createBackend(
      ManagedObjectDefinition<C, ? extends BackendCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException;



  /**
   * Removes the named Backend.
   *
   * @param name
   *          The name of the Backend to remove.
   * @throws ManagedObjectNotFoundException
   *           If the Backend does not exist.
   * @throws OperationRejectedException
   *           If the server refuses to remove the Backend due to some
   *           server-side constraint which cannot be satisfied (for
   *           example, if it is referenced by another managed object).
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to remove the Backend because the
   *           client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  void removeBackend(String name)
      throws ManagedObjectNotFoundException, OperationRejectedException,
      ConcurrentModificationException, AuthorizationException,
      CommunicationException;



  /**
   * Lists the Certificate Mappers.
   *
   * @return Returns an array containing the names of the Certificate
   *         Mappers.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to list the Certificate Mappers
   *           because the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  String[] listCertificateMappers() throws ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Gets the named Certificate Mapper.
   *
   * @param name
   *           The name of the Certificate Mapper to retrieve.
   * @return Returns the named Certificate Mapper.
   * @throws DefinitionDecodingException
   *           If the named Certificate Mapper was found but its type
   *           could not be determined.
   * @throws ManagedObjectDecodingException
   *           If the named Certificate Mapper was found but one or
   *           more of its properties could not be decoded.
   * @throws ManagedObjectNotFoundException
   *           If the named Certificate Mapper was not found on the
   *           server.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to retrieve the named Certificate
   *           Mapper because the client does not have the correct
   *           privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  CertificateMapperCfgClient getCertificateMapper(String name)
      throws DefinitionDecodingException, ManagedObjectDecodingException,
      ManagedObjectNotFoundException, ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Creates a new Certificate Mapper. The new Certificate Mapper will
   * initially not contain any property values (including mandatory
   * properties). Once the Certificate Mapper has been configured it
   * can be added to the server using the {@link #commit()} method.
   *
   * @param <C>
   *          The type of the Certificate Mapper being created.
   * @param d
   *          The definition of the Certificate Mapper to be created.
   * @param name
   *          The name of the new Certificate Mapper.
   * @param exceptions
   *          An optional collection in which to place any {@link
   *          DefaultBehaviorException}s that occurred whilst
   *          attempting to determine the default values of the
   *          Certificate Mapper. This argument can be
   *          <code>null<code>.
   * @return Returns a new Certificate Mapper configuration instance.
   * @throws IllegalManagedObjectNameException
   *          If the name of the new Certificate Mapper is invalid.
   */
  <C extends CertificateMapperCfgClient> C createCertificateMapper(
      ManagedObjectDefinition<C, ? extends CertificateMapperCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException;



  /**
   * Removes the named Certificate Mapper.
   *
   * @param name
   *          The name of the Certificate Mapper to remove.
   * @throws ManagedObjectNotFoundException
   *           If the Certificate Mapper does not exist.
   * @throws OperationRejectedException
   *           If the server refuses to remove the Certificate Mapper
   *           due to some server-side constraint which cannot be
   *           satisfied (for example, if it is referenced by another
   *           managed object).
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to remove the Certificate Mapper
   *           because the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  void removeCertificateMapper(String name)
      throws ManagedObjectNotFoundException, OperationRejectedException,
      ConcurrentModificationException, AuthorizationException,
      CommunicationException;



  /**
   * Lists the Connection Handlers.
   *
   * @return Returns an array containing the names of the Connection
   *         Handlers.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to list the Connection Handlers
   *           because the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  String[] listConnectionHandlers() throws ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Gets the named Connection Handler.
   *
   * @param name
   *           The name of the Connection Handler to retrieve.
   * @return Returns the named Connection Handler.
   * @throws DefinitionDecodingException
   *           If the named Connection Handler was found but its type
   *           could not be determined.
   * @throws ManagedObjectDecodingException
   *           If the named Connection Handler was found but one or
   *           more of its properties could not be decoded.
   * @throws ManagedObjectNotFoundException
   *           If the named Connection Handler was not found on the
   *           server.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to retrieve the named Connection
   *           Handler because the client does not have the correct
   *           privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  ConnectionHandlerCfgClient getConnectionHandler(String name)
      throws DefinitionDecodingException, ManagedObjectDecodingException,
      ManagedObjectNotFoundException, ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Creates a new Connection Handler. The new Connection Handler will
   * initially not contain any property values (including mandatory
   * properties). Once the Connection Handler has been configured it
   * can be added to the server using the {@link #commit()} method.
   *
   * @param <C>
   *          The type of the Connection Handler being created.
   * @param d
   *          The definition of the Connection Handler to be created.
   * @param name
   *          The name of the new Connection Handler.
   * @param exceptions
   *          An optional collection in which to place any {@link
   *          DefaultBehaviorException}s that occurred whilst
   *          attempting to determine the default values of the
   *          Connection Handler. This argument can be
   *          <code>null<code>.
   * @return Returns a new Connection Handler configuration instance.
   * @throws IllegalManagedObjectNameException
   *          If the name of the new Connection Handler is invalid.
   */
  <C extends ConnectionHandlerCfgClient> C createConnectionHandler(
      ManagedObjectDefinition<C, ? extends ConnectionHandlerCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException;



  /**
   * Removes the named Connection Handler.
   *
   * @param name
   *          The name of the Connection Handler to remove.
   * @throws ManagedObjectNotFoundException
   *           If the Connection Handler does not exist.
   * @throws OperationRejectedException
   *           If the server refuses to remove the Connection Handler
   *           due to some server-side constraint which cannot be
   *           satisfied (for example, if it is referenced by another
   *           managed object).
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to remove the Connection Handler
   *           because the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  void removeConnectionHandler(String name)
      throws ManagedObjectNotFoundException, OperationRejectedException,
      ConcurrentModificationException, AuthorizationException,
      CommunicationException;



  /**
   * Gets the Crypto Manager.
   *
   * @return Returns the Crypto Manager.
   * @throws DefinitionDecodingException
   *           If the Crypto Manager was found but its type could not
   *           be determined.
   * @throws ManagedObjectDecodingException
   *           If the Crypto Manager was found but one or more of its
   *           properties could not be decoded.
   * @throws ManagedObjectNotFoundException
   *           If the Crypto Manager could not be found on the server.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to retrieve the Crypto Manager
   *           because the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  CryptoManagerCfgClient getCryptoManager()
      throws DefinitionDecodingException, ManagedObjectDecodingException,
      ManagedObjectNotFoundException, ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Lists the Entry Caches.
   *
   * @return Returns an array containing the names of the Entry
   *         Caches.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to list the Entry Caches because
   *           the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  String[] listEntryCaches() throws ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Gets the named Entry Cache.
   *
   * @param name
   *           The name of the Entry Cache to retrieve.
   * @return Returns the named Entry Cache.
   * @throws DefinitionDecodingException
   *           If the named Entry Cache was found but its type could
   *           not be determined.
   * @throws ManagedObjectDecodingException
   *           If the named Entry Cache was found but one or more of
   *           its properties could not be decoded.
   * @throws ManagedObjectNotFoundException
   *           If the named Entry Cache was not found on the server.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to retrieve the named Entry Cache
   *           because the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  EntryCacheCfgClient getEntryCache(String name)
      throws DefinitionDecodingException, ManagedObjectDecodingException,
      ManagedObjectNotFoundException, ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Creates a new Entry Cache. The new Entry Cache will initially not
   * contain any property values (including mandatory properties). Once
   * the Entry Cache has been configured it can be added to the server
   * using the {@link #commit()} method.
   *
   * @param <C>
   *          The type of the Entry Cache being created.
   * @param d
   *          The definition of the Entry Cache to be created.
   * @param name
   *          The name of the new Entry Cache.
   * @param exceptions
   *          An optional collection in which to place any {@link
   *          DefaultBehaviorException}s that occurred whilst
   *          attempting to determine the default values of the Entry
   *          Cache. This argument can be <code>null<code>.
   * @return Returns a new Entry Cache configuration instance.
   * @throws IllegalManagedObjectNameException
   *          If the name of the new Entry Cache is invalid.
   */
  <C extends EntryCacheCfgClient> C createEntryCache(
      ManagedObjectDefinition<C, ? extends EntryCacheCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException;



  /**
   * Removes the named Entry Cache.
   *
   * @param name
   *          The name of the Entry Cache to remove.
   * @throws ManagedObjectNotFoundException
   *           If the Entry Cache does not exist.
   * @throws OperationRejectedException
   *           If the server refuses to remove the Entry Cache due to
   *           some server-side constraint which cannot be satisfied
   *           (for example, if it is referenced by another managed
   *           object).
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to remove the Entry Cache because
   *           the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  void removeEntryCache(String name)
      throws ManagedObjectNotFoundException, OperationRejectedException,
      ConcurrentModificationException, AuthorizationException,
      CommunicationException;



  /**
   * Lists the Extended Operation Handlers.
   *
   * @return Returns an array containing the names of the Extended
   *         Operation Handlers.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to list the Extended Operation
   *           Handlers because the client does not have the correct
   *           privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  String[] listExtendedOperationHandlers() throws ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Gets the named Extended Operation Handler.
   *
   * @param name
   *           The name of the Extended Operation Handler to retrieve.
   * @return Returns the named Extended Operation Handler.
   * @throws DefinitionDecodingException
   *           If the named Extended Operation Handler was found but
   *           its type could not be determined.
   * @throws ManagedObjectDecodingException
   *           If the named Extended Operation Handler was found but
   *           one or more of its properties could not be decoded.
   * @throws ManagedObjectNotFoundException
   *           If the named Extended Operation Handler was not found
   *           on the server.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to retrieve the named Extended
   *           Operation Handler because the client does not have the
   *           correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  ExtendedOperationHandlerCfgClient getExtendedOperationHandler(String name)
      throws DefinitionDecodingException, ManagedObjectDecodingException,
      ManagedObjectNotFoundException, ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Creates a new Extended Operation Handler. The new Extended
   * Operation Handler will initially not contain any property values
   * (including mandatory properties). Once the Extended Operation
   * Handler has been configured it can be added to the server using
   * the {@link #commit()} method.
   *
   * @param <C>
   *          The type of the Extended Operation Handler being
   *          created.
   * @param d
   *          The definition of the Extended Operation Handler to be
   *          created.
   * @param name
   *          The name of the new Extended Operation Handler.
   * @param exceptions
   *          An optional collection in which to place any {@link
   *          DefaultBehaviorException}s that occurred whilst
   *          attempting to determine the default values of the
   *          Extended Operation Handler. This argument can be
   *          <code>null<code>.
   * @return Returns a new Extended Operation Handler configuration
   *         instance.
   * @throws IllegalManagedObjectNameException
   *          If the name of the new Extended Operation Handler is
   *          invalid.
   */
  <C extends ExtendedOperationHandlerCfgClient> C createExtendedOperationHandler(
      ManagedObjectDefinition<C, ? extends ExtendedOperationHandlerCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException;



  /**
   * Removes the named Extended Operation Handler.
   *
   * @param name
   *          The name of the Extended Operation Handler to remove.
   * @throws ManagedObjectNotFoundException
   *           If the Extended Operation Handler does not exist.
   * @throws OperationRejectedException
   *           If the server refuses to remove the Extended Operation
   *           Handler due to some server-side constraint which cannot
   *           be satisfied (for example, if it is referenced by
   *           another managed object).
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to remove the Extended Operation
   *           Handler because the client does not have the correct
   *           privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  void removeExtendedOperationHandler(String name)
      throws ManagedObjectNotFoundException, OperationRejectedException,
      ConcurrentModificationException, AuthorizationException,
      CommunicationException;



  /**
   * Lists the Extensions.
   *
   * @return Returns an array containing the names of the Extensions.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to list the Extensions because
   *           the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  String[] listExtensions() throws ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Gets the named Extension.
   *
   * @param name
   *           The name of the Extension to retrieve.
   * @return Returns the named Extension.
   * @throws DefinitionDecodingException
   *           If the named Extension was found but its type could not
   *           be determined.
   * @throws ManagedObjectDecodingException
   *           If the named Extension was found but one or more of its
   *           properties could not be decoded.
   * @throws ManagedObjectNotFoundException
   *           If the named Extension was not found on the server.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to retrieve the named Extension
   *           because the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  ExtensionCfgClient getExtension(String name)
      throws DefinitionDecodingException, ManagedObjectDecodingException,
      ManagedObjectNotFoundException, ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Creates a new Extension. The new Extension will initially not
   * contain any property values (including mandatory properties). Once
   * the Extension has been configured it can be added to the server
   * using the {@link #commit()} method.
   *
   * @param <C>
   *          The type of the Extension being created.
   * @param d
   *          The definition of the Extension to be created.
   * @param name
   *          The name of the new Extension.
   * @param exceptions
   *          An optional collection in which to place any {@link
   *          DefaultBehaviorException}s that occurred whilst
   *          attempting to determine the default values of the
   *          Extension. This argument can be <code>null<code>.
   * @return Returns a new Extension configuration instance.
   * @throws IllegalManagedObjectNameException
   *          If the name of the new Extension is invalid.
   */
  <C extends ExtensionCfgClient> C createExtension(
      ManagedObjectDefinition<C, ? extends ExtensionCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException;



  /**
   * Removes the named Extension.
   *
   * @param name
   *          The name of the Extension to remove.
   * @throws ManagedObjectNotFoundException
   *           If the Extension does not exist.
   * @throws OperationRejectedException
   *           If the server refuses to remove the Extension due to
   *           some server-side constraint which cannot be satisfied
   *           (for example, if it is referenced by another managed
   *           object).
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to remove the Extension because
   *           the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  void removeExtension(String name)
      throws ManagedObjectNotFoundException, OperationRejectedException,
      ConcurrentModificationException, AuthorizationException,
      CommunicationException;



  /**
   * Gets the Global Configuration.
   *
   * @return Returns the Global Configuration.
   * @throws DefinitionDecodingException
   *           If the Global Configuration was found but its type
   *           could not be determined.
   * @throws ManagedObjectDecodingException
   *           If the Global Configuration was found but one or more
   *           of its properties could not be decoded.
   * @throws ManagedObjectNotFoundException
   *           If the Global Configuration could not be found on the
   *           server.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to retrieve the Global
   *           Configuration because the client does not have the
   *           correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  GlobalCfgClient getGlobalConfiguration()
      throws DefinitionDecodingException, ManagedObjectDecodingException,
      ManagedObjectNotFoundException, ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Lists the Group Implementations.
   *
   * @return Returns an array containing the names of the Group
   *         Implementations.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to list the Group Implementations
   *           because the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  String[] listGroupImplementations() throws ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Gets the named Group Implementation.
   *
   * @param name
   *           The name of the Group Implementation to retrieve.
   * @return Returns the named Group Implementation.
   * @throws DefinitionDecodingException
   *           If the named Group Implementation was found but its
   *           type could not be determined.
   * @throws ManagedObjectDecodingException
   *           If the named Group Implementation was found but one or
   *           more of its properties could not be decoded.
   * @throws ManagedObjectNotFoundException
   *           If the named Group Implementation was not found on the
   *           server.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to retrieve the named Group
   *           Implementation because the client does not have the
   *           correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  GroupImplementationCfgClient getGroupImplementation(String name)
      throws DefinitionDecodingException, ManagedObjectDecodingException,
      ManagedObjectNotFoundException, ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Creates a new Group Implementation. The new Group Implementation
   * will initially not contain any property values (including
   * mandatory properties). Once the Group Implementation has been
   * configured it can be added to the server using the {@link
   * #commit()} method.
   *
   * @param <C>
   *          The type of the Group Implementation being created.
   * @param d
   *          The definition of the Group Implementation to be
   *          created.
   * @param name
   *          The name of the new Group Implementation.
   * @param exceptions
   *          An optional collection in which to place any {@link
   *          DefaultBehaviorException}s that occurred whilst
   *          attempting to determine the default values of the Group
   *          Implementation. This argument can be <code>null<code>.
   * @return Returns a new Group Implementation configuration
   *         instance.
   * @throws IllegalManagedObjectNameException
   *          If the name of the new Group Implementation is invalid.
   */
  <C extends GroupImplementationCfgClient> C createGroupImplementation(
      ManagedObjectDefinition<C, ? extends GroupImplementationCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException;



  /**
   * Removes the named Group Implementation.
   *
   * @param name
   *          The name of the Group Implementation to remove.
   * @throws ManagedObjectNotFoundException
   *           If the Group Implementation does not exist.
   * @throws OperationRejectedException
   *           If the server refuses to remove the Group
   *           Implementation due to some server-side constraint which
   *           cannot be satisfied (for example, if it is referenced by
   *           another managed object).
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to remove the Group
   *           Implementation because the client does not have the
   *           correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  void removeGroupImplementation(String name)
      throws ManagedObjectNotFoundException, OperationRejectedException,
      ConcurrentModificationException, AuthorizationException,
      CommunicationException;



  /**
   * Lists the Identity Mappers.
   *
   * @return Returns an array containing the names of the Identity
   *         Mappers.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to list the Identity Mappers
   *           because the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  String[] listIdentityMappers() throws ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Gets the named Identity Mapper.
   *
   * @param name
   *           The name of the Identity Mapper to retrieve.
   * @return Returns the named Identity Mapper.
   * @throws DefinitionDecodingException
   *           If the named Identity Mapper was found but its type
   *           could not be determined.
   * @throws ManagedObjectDecodingException
   *           If the named Identity Mapper was found but one or more
   *           of its properties could not be decoded.
   * @throws ManagedObjectNotFoundException
   *           If the named Identity Mapper was not found on the
   *           server.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to retrieve the named Identity
   *           Mapper because the client does not have the correct
   *           privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  IdentityMapperCfgClient getIdentityMapper(String name)
      throws DefinitionDecodingException, ManagedObjectDecodingException,
      ManagedObjectNotFoundException, ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Creates a new Identity Mapper. The new Identity Mapper will
   * initially not contain any property values (including mandatory
   * properties). Once the Identity Mapper has been configured it can
   * be added to the server using the {@link #commit()} method.
   *
   * @param <C>
   *          The type of the Identity Mapper being created.
   * @param d
   *          The definition of the Identity Mapper to be created.
   * @param name
   *          The name of the new Identity Mapper.
   * @param exceptions
   *          An optional collection in which to place any {@link
   *          DefaultBehaviorException}s that occurred whilst
   *          attempting to determine the default values of the
   *          Identity Mapper. This argument can be <code>null<code>.
   * @return Returns a new Identity Mapper configuration instance.
   * @throws IllegalManagedObjectNameException
   *          If the name of the new Identity Mapper is invalid.
   */
  <C extends IdentityMapperCfgClient> C createIdentityMapper(
      ManagedObjectDefinition<C, ? extends IdentityMapperCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException;



  /**
   * Removes the named Identity Mapper.
   *
   * @param name
   *          The name of the Identity Mapper to remove.
   * @throws ManagedObjectNotFoundException
   *           If the Identity Mapper does not exist.
   * @throws OperationRejectedException
   *           If the server refuses to remove the Identity Mapper due
   *           to some server-side constraint which cannot be satisfied
   *           (for example, if it is referenced by another managed
   *           object).
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to remove the Identity Mapper
   *           because the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  void removeIdentityMapper(String name)
      throws ManagedObjectNotFoundException, OperationRejectedException,
      ConcurrentModificationException, AuthorizationException,
      CommunicationException;



  /**
   * Lists the Key Manager Providers.
   *
   * @return Returns an array containing the names of the Key Manager
   *         Providers.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to list the Key Manager Providers
   *           because the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  String[] listKeyManagerProviders() throws ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Gets the named Key Manager Provider.
   *
   * @param name
   *           The name of the Key Manager Provider to retrieve.
   * @return Returns the named Key Manager Provider.
   * @throws DefinitionDecodingException
   *           If the named Key Manager Provider was found but its
   *           type could not be determined.
   * @throws ManagedObjectDecodingException
   *           If the named Key Manager Provider was found but one or
   *           more of its properties could not be decoded.
   * @throws ManagedObjectNotFoundException
   *           If the named Key Manager Provider was not found on the
   *           server.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to retrieve the named Key Manager
   *           Provider because the client does not have the correct
   *           privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  KeyManagerProviderCfgClient getKeyManagerProvider(String name)
      throws DefinitionDecodingException, ManagedObjectDecodingException,
      ManagedObjectNotFoundException, ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Creates a new Key Manager Provider. The new Key Manager Provider
   * will initially not contain any property values (including
   * mandatory properties). Once the Key Manager Provider has been
   * configured it can be added to the server using the {@link
   * #commit()} method.
   *
   * @param <C>
   *          The type of the Key Manager Provider being created.
   * @param d
   *          The definition of the Key Manager Provider to be
   *          created.
   * @param name
   *          The name of the new Key Manager Provider.
   * @param exceptions
   *          An optional collection in which to place any {@link
   *          DefaultBehaviorException}s that occurred whilst
   *          attempting to determine the default values of the Key
   *          Manager Provider. This argument can be <code>null<code>.
   * @return Returns a new Key Manager Provider configuration
   *         instance.
   * @throws IllegalManagedObjectNameException
   *          If the name of the new Key Manager Provider is invalid.
   */
  <C extends KeyManagerProviderCfgClient> C createKeyManagerProvider(
      ManagedObjectDefinition<C, ? extends KeyManagerProviderCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException;



  /**
   * Removes the named Key Manager Provider.
   *
   * @param name
   *          The name of the Key Manager Provider to remove.
   * @throws ManagedObjectNotFoundException
   *           If the Key Manager Provider does not exist.
   * @throws OperationRejectedException
   *           If the server refuses to remove the Key Manager
   *           Provider due to some server-side constraint which cannot
   *           be satisfied (for example, if it is referenced by
   *           another managed object).
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to remove the Key Manager
   *           Provider because the client does not have the correct
   *           privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  void removeKeyManagerProvider(String name)
      throws ManagedObjectNotFoundException, OperationRejectedException,
      ConcurrentModificationException, AuthorizationException,
      CommunicationException;



  /**
   * Lists the Log Publishers.
   *
   * @return Returns an array containing the names of the Log
   *         Publishers.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to list the Log Publishers
   *           because the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  String[] listLogPublishers() throws ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Gets the named Log Publisher.
   *
   * @param name
   *           The name of the Log Publisher to retrieve.
   * @return Returns the named Log Publisher.
   * @throws DefinitionDecodingException
   *           If the named Log Publisher was found but its type could
   *           not be determined.
   * @throws ManagedObjectDecodingException
   *           If the named Log Publisher was found but one or more of
   *           its properties could not be decoded.
   * @throws ManagedObjectNotFoundException
   *           If the named Log Publisher was not found on the server.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to retrieve the named Log
   *           Publisher because the client does not have the correct
   *           privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  LogPublisherCfgClient getLogPublisher(String name)
      throws DefinitionDecodingException, ManagedObjectDecodingException,
      ManagedObjectNotFoundException, ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Creates a new Log Publisher. The new Log Publisher will initially
   * not contain any property values (including mandatory properties).
   * Once the Log Publisher has been configured it can be added to the
   * server using the {@link #commit()} method.
   *
   * @param <C>
   *          The type of the Log Publisher being created.
   * @param d
   *          The definition of the Log Publisher to be created.
   * @param name
   *          The name of the new Log Publisher.
   * @param exceptions
   *          An optional collection in which to place any {@link
   *          DefaultBehaviorException}s that occurred whilst
   *          attempting to determine the default values of the Log
   *          Publisher. This argument can be <code>null<code>.
   * @return Returns a new Log Publisher configuration instance.
   * @throws IllegalManagedObjectNameException
   *          If the name of the new Log Publisher is invalid.
   */
  <C extends LogPublisherCfgClient> C createLogPublisher(
      ManagedObjectDefinition<C, ? extends LogPublisherCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException;



  /**
   * Removes the named Log Publisher.
   *
   * @param name
   *          The name of the Log Publisher to remove.
   * @throws ManagedObjectNotFoundException
   *           If the Log Publisher does not exist.
   * @throws OperationRejectedException
   *           If the server refuses to remove the Log Publisher due
   *           to some server-side constraint which cannot be satisfied
   *           (for example, if it is referenced by another managed
   *           object).
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to remove the Log Publisher
   *           because the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  void removeLogPublisher(String name)
      throws ManagedObjectNotFoundException, OperationRejectedException,
      ConcurrentModificationException, AuthorizationException,
      CommunicationException;



  /**
   * Lists the Log Retention Policies.
   *
   * @return Returns an array containing the names of the Log
   *         Retention Policies.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to list the Log Retention
   *           Policies because the client does not have the correct
   *           privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  String[] listLogRetentionPolicies() throws ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Gets the named Log Retention Policy.
   *
   * @param name
   *           The name of the Log Retention Policy to retrieve.
   * @return Returns the named Log Retention Policy.
   * @throws DefinitionDecodingException
   *           If the named Log Retention Policy was found but its
   *           type could not be determined.
   * @throws ManagedObjectDecodingException
   *           If the named Log Retention Policy was found but one or
   *           more of its properties could not be decoded.
   * @throws ManagedObjectNotFoundException
   *           If the named Log Retention Policy was not found on the
   *           server.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to retrieve the named Log
   *           Retention Policy because the client does not have the
   *           correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  LogRetentionPolicyCfgClient getLogRetentionPolicy(String name)
      throws DefinitionDecodingException, ManagedObjectDecodingException,
      ManagedObjectNotFoundException, ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Creates a new Log Retention Policy. The new Log Retention Policy
   * will initially not contain any property values (including
   * mandatory properties). Once the Log Retention Policy has been
   * configured it can be added to the server using the {@link
   * #commit()} method.
   *
   * @param <C>
   *          The type of the Log Retention Policy being created.
   * @param d
   *          The definition of the Log Retention Policy to be
   *          created.
   * @param name
   *          The name of the new Log Retention Policy.
   * @param exceptions
   *          An optional collection in which to place any {@link
   *          DefaultBehaviorException}s that occurred whilst
   *          attempting to determine the default values of the Log
   *          Retention Policy. This argument can be <code>null<code>.
   * @return Returns a new Log Retention Policy configuration
   *         instance.
   * @throws IllegalManagedObjectNameException
   *          If the name of the new Log Retention Policy is invalid.
   */
  <C extends LogRetentionPolicyCfgClient> C createLogRetentionPolicy(
      ManagedObjectDefinition<C, ? extends LogRetentionPolicyCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException;



  /**
   * Removes the named Log Retention Policy.
   *
   * @param name
   *          The name of the Log Retention Policy to remove.
   * @throws ManagedObjectNotFoundException
   *           If the Log Retention Policy does not exist.
   * @throws OperationRejectedException
   *           If the server refuses to remove the Log Retention
   *           Policy due to some server-side constraint which cannot
   *           be satisfied (for example, if it is referenced by
   *           another managed object).
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to remove the Log Retention
   *           Policy because the client does not have the correct
   *           privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  void removeLogRetentionPolicy(String name)
      throws ManagedObjectNotFoundException, OperationRejectedException,
      ConcurrentModificationException, AuthorizationException,
      CommunicationException;



  /**
   * Lists the Log Rotation Policies.
   *
   * @return Returns an array containing the names of the Log Rotation
   *         Policies.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to list the Log Rotation Policies
   *           because the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  String[] listLogRotationPolicies() throws ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Gets the named Log Rotation Policy.
   *
   * @param name
   *           The name of the Log Rotation Policy to retrieve.
   * @return Returns the named Log Rotation Policy.
   * @throws DefinitionDecodingException
   *           If the named Log Rotation Policy was found but its type
   *           could not be determined.
   * @throws ManagedObjectDecodingException
   *           If the named Log Rotation Policy was found but one or
   *           more of its properties could not be decoded.
   * @throws ManagedObjectNotFoundException
   *           If the named Log Rotation Policy was not found on the
   *           server.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to retrieve the named Log
   *           Rotation Policy because the client does not have the
   *           correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  LogRotationPolicyCfgClient getLogRotationPolicy(String name)
      throws DefinitionDecodingException, ManagedObjectDecodingException,
      ManagedObjectNotFoundException, ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Creates a new Log Rotation Policy. The new Log Rotation Policy
   * will initially not contain any property values (including
   * mandatory properties). Once the Log Rotation Policy has been
   * configured it can be added to the server using the {@link
   * #commit()} method.
   *
   * @param <C>
   *          The type of the Log Rotation Policy being created.
   * @param d
   *          The definition of the Log Rotation Policy to be created.
   * @param name
   *          The name of the new Log Rotation Policy.
   * @param exceptions
   *          An optional collection in which to place any {@link
   *          DefaultBehaviorException}s that occurred whilst
   *          attempting to determine the default values of the Log
   *          Rotation Policy. This argument can be <code>null<code>.
   * @return Returns a new Log Rotation Policy configuration instance.
   * @throws IllegalManagedObjectNameException
   *          If the name of the new Log Rotation Policy is invalid.
   */
  <C extends LogRotationPolicyCfgClient> C createLogRotationPolicy(
      ManagedObjectDefinition<C, ? extends LogRotationPolicyCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException;



  /**
   * Removes the named Log Rotation Policy.
   *
   * @param name
   *          The name of the Log Rotation Policy to remove.
   * @throws ManagedObjectNotFoundException
   *           If the Log Rotation Policy does not exist.
   * @throws OperationRejectedException
   *           If the server refuses to remove the Log Rotation Policy
   *           due to some server-side constraint which cannot be
   *           satisfied (for example, if it is referenced by another
   *           managed object).
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to remove the Log Rotation Policy
   *           because the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  void removeLogRotationPolicy(String name)
      throws ManagedObjectNotFoundException, OperationRejectedException,
      ConcurrentModificationException, AuthorizationException,
      CommunicationException;



  /**
   * Lists the Matching Rules.
   *
   * @return Returns an array containing the names of the Matching
   *         Rules.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to list the Matching Rules
   *           because the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  String[] listMatchingRules() throws ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Gets the named Matching Rule.
   *
   * @param name
   *           The name of the Matching Rule to retrieve.
   * @return Returns the named Matching Rule.
   * @throws DefinitionDecodingException
   *           If the named Matching Rule was found but its type could
   *           not be determined.
   * @throws ManagedObjectDecodingException
   *           If the named Matching Rule was found but one or more of
   *           its properties could not be decoded.
   * @throws ManagedObjectNotFoundException
   *           If the named Matching Rule was not found on the server.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to retrieve the named Matching
   *           Rule because the client does not have the correct
   *           privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  MatchingRuleCfgClient getMatchingRule(String name)
      throws DefinitionDecodingException, ManagedObjectDecodingException,
      ManagedObjectNotFoundException, ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Creates a new Matching Rule. The new Matching Rule will initially
   * not contain any property values (including mandatory properties).
   * Once the Matching Rule has been configured it can be added to the
   * server using the {@link #commit()} method.
   *
   * @param <C>
   *          The type of the Matching Rule being created.
   * @param d
   *          The definition of the Matching Rule to be created.
   * @param name
   *          The name of the new Matching Rule.
   * @param exceptions
   *          An optional collection in which to place any {@link
   *          DefaultBehaviorException}s that occurred whilst
   *          attempting to determine the default values of the
   *          Matching Rule. This argument can be <code>null<code>.
   * @return Returns a new Matching Rule configuration instance.
   * @throws IllegalManagedObjectNameException
   *          If the name of the new Matching Rule is invalid.
   */
  <C extends MatchingRuleCfgClient> C createMatchingRule(
      ManagedObjectDefinition<C, ? extends MatchingRuleCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException;



  /**
   * Removes the named Matching Rule.
   *
   * @param name
   *          The name of the Matching Rule to remove.
   * @throws ManagedObjectNotFoundException
   *           If the Matching Rule does not exist.
   * @throws OperationRejectedException
   *           If the server refuses to remove the Matching Rule due
   *           to some server-side constraint which cannot be satisfied
   *           (for example, if it is referenced by another managed
   *           object).
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to remove the Matching Rule
   *           because the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  void removeMatchingRule(String name)
      throws ManagedObjectNotFoundException, OperationRejectedException,
      ConcurrentModificationException, AuthorizationException,
      CommunicationException;



  /**
   * Lists the Monitor Providers.
   *
   * @return Returns an array containing the names of the Monitor
   *         Providers.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to list the Monitor Providers
   *           because the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  String[] listMonitorProviders() throws ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Gets the named Monitor Provider.
   *
   * @param name
   *           The name of the Monitor Provider to retrieve.
   * @return Returns the named Monitor Provider.
   * @throws DefinitionDecodingException
   *           If the named Monitor Provider was found but its type
   *           could not be determined.
   * @throws ManagedObjectDecodingException
   *           If the named Monitor Provider was found but one or more
   *           of its properties could not be decoded.
   * @throws ManagedObjectNotFoundException
   *           If the named Monitor Provider was not found on the
   *           server.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to retrieve the named Monitor
   *           Provider because the client does not have the correct
   *           privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  MonitorProviderCfgClient getMonitorProvider(String name)
      throws DefinitionDecodingException, ManagedObjectDecodingException,
      ManagedObjectNotFoundException, ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Creates a new Monitor Provider. The new Monitor Provider will
   * initially not contain any property values (including mandatory
   * properties). Once the Monitor Provider has been configured it can
   * be added to the server using the {@link #commit()} method.
   *
   * @param <C>
   *          The type of the Monitor Provider being created.
   * @param d
   *          The definition of the Monitor Provider to be created.
   * @param name
   *          The name of the new Monitor Provider.
   * @param exceptions
   *          An optional collection in which to place any {@link
   *          DefaultBehaviorException}s that occurred whilst
   *          attempting to determine the default values of the Monitor
   *          Provider. This argument can be <code>null<code>.
   * @return Returns a new Monitor Provider configuration instance.
   * @throws IllegalManagedObjectNameException
   *          If the name of the new Monitor Provider is invalid.
   */
  <C extends MonitorProviderCfgClient> C createMonitorProvider(
      ManagedObjectDefinition<C, ? extends MonitorProviderCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException;



  /**
   * Removes the named Monitor Provider.
   *
   * @param name
   *          The name of the Monitor Provider to remove.
   * @throws ManagedObjectNotFoundException
   *           If the Monitor Provider does not exist.
   * @throws OperationRejectedException
   *           If the server refuses to remove the Monitor Provider
   *           due to some server-side constraint which cannot be
   *           satisfied (for example, if it is referenced by another
   *           managed object).
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to remove the Monitor Provider
   *           because the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  void removeMonitorProvider(String name)
      throws ManagedObjectNotFoundException, OperationRejectedException,
      ConcurrentModificationException, AuthorizationException,
      CommunicationException;



  /**
   * Lists the Network Groups.
   *
   * @return Returns an array containing the names of the Network
   *         Groups.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to list the Network Groups
   *           because the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  String[] listNetworkGroups() throws ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Gets the named Network Group.
   *
   * @param name
   *           The name of the Network Group to retrieve.
   * @return Returns the named Network Group.
   * @throws DefinitionDecodingException
   *           If the named Network Group was found but its type could
   *           not be determined.
   * @throws ManagedObjectDecodingException
   *           If the named Network Group was found but one or more of
   *           its properties could not be decoded.
   * @throws ManagedObjectNotFoundException
   *           If the named Network Group was not found on the server.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to retrieve the named Network
   *           Group because the client does not have the correct
   *           privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  NetworkGroupCfgClient getNetworkGroup(String name)
      throws DefinitionDecodingException, ManagedObjectDecodingException,
      ManagedObjectNotFoundException, ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Creates a new Network Group. The new Network Group will initially
   * not contain any property values (including mandatory properties).
   * Once the Network Group has been configured it can be added to the
   * server using the {@link #commit()} method.
   *
   * @param <C>
   *          The type of the Network Group being created.
   * @param d
   *          The definition of the Network Group to be created.
   * @param name
   *          The name of the new Network Group.
   * @param exceptions
   *          An optional collection in which to place any {@link
   *          DefaultBehaviorException}s that occurred whilst
   *          attempting to determine the default values of the Network
   *          Group. This argument can be <code>null<code>.
   * @return Returns a new Network Group configuration instance.
   * @throws IllegalManagedObjectNameException
   *          If the name of the new Network Group is invalid.
   */
  <C extends NetworkGroupCfgClient> C createNetworkGroup(
      ManagedObjectDefinition<C, ? extends NetworkGroupCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException;



  /**
   * Removes the named Network Group.
   *
   * @param name
   *          The name of the Network Group to remove.
   * @throws ManagedObjectNotFoundException
   *           If the Network Group does not exist.
   * @throws OperationRejectedException
   *           If the server refuses to remove the Network Group due
   *           to some server-side constraint which cannot be satisfied
   *           (for example, if it is referenced by another managed
   *           object).
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to remove the Network Group
   *           because the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  void removeNetworkGroup(String name)
      throws ManagedObjectNotFoundException, OperationRejectedException,
      ConcurrentModificationException, AuthorizationException,
      CommunicationException;



  /**
   * Lists the Password Generators.
   *
   * @return Returns an array containing the names of the Password
   *         Generators.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to list the Password Generators
   *           because the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  String[] listPasswordGenerators() throws ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Gets the named Password Generator.
   *
   * @param name
   *           The name of the Password Generator to retrieve.
   * @return Returns the named Password Generator.
   * @throws DefinitionDecodingException
   *           If the named Password Generator was found but its type
   *           could not be determined.
   * @throws ManagedObjectDecodingException
   *           If the named Password Generator was found but one or
   *           more of its properties could not be decoded.
   * @throws ManagedObjectNotFoundException
   *           If the named Password Generator was not found on the
   *           server.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to retrieve the named Password
   *           Generator because the client does not have the correct
   *           privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  PasswordGeneratorCfgClient getPasswordGenerator(String name)
      throws DefinitionDecodingException, ManagedObjectDecodingException,
      ManagedObjectNotFoundException, ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Creates a new Password Generator. The new Password Generator will
   * initially not contain any property values (including mandatory
   * properties). Once the Password Generator has been configured it
   * can be added to the server using the {@link #commit()} method.
   *
   * @param <C>
   *          The type of the Password Generator being created.
   * @param d
   *          The definition of the Password Generator to be created.
   * @param name
   *          The name of the new Password Generator.
   * @param exceptions
   *          An optional collection in which to place any {@link
   *          DefaultBehaviorException}s that occurred whilst
   *          attempting to determine the default values of the
   *          Password Generator. This argument can be
   *          <code>null<code>.
   * @return Returns a new Password Generator configuration instance.
   * @throws IllegalManagedObjectNameException
   *          If the name of the new Password Generator is invalid.
   */
  <C extends PasswordGeneratorCfgClient> C createPasswordGenerator(
      ManagedObjectDefinition<C, ? extends PasswordGeneratorCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException;



  /**
   * Removes the named Password Generator.
   *
   * @param name
   *          The name of the Password Generator to remove.
   * @throws ManagedObjectNotFoundException
   *           If the Password Generator does not exist.
   * @throws OperationRejectedException
   *           If the server refuses to remove the Password Generator
   *           due to some server-side constraint which cannot be
   *           satisfied (for example, if it is referenced by another
   *           managed object).
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to remove the Password Generator
   *           because the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  void removePasswordGenerator(String name)
      throws ManagedObjectNotFoundException, OperationRejectedException,
      ConcurrentModificationException, AuthorizationException,
      CommunicationException;



  /**
   * Lists the Password Policies.
   *
   * @return Returns an array containing the names of the Password
   *         Policies.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to list the Password Policies
   *           because the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  String[] listPasswordPolicies() throws ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Gets the named Password Policy.
   *
   * @param name
   *           The name of the Password Policy to retrieve.
   * @return Returns the named Password Policy.
   * @throws DefinitionDecodingException
   *           If the named Password Policy was found but its type
   *           could not be determined.
   * @throws ManagedObjectDecodingException
   *           If the named Password Policy was found but one or more
   *           of its properties could not be decoded.
   * @throws ManagedObjectNotFoundException
   *           If the named Password Policy was not found on the
   *           server.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to retrieve the named Password
   *           Policy because the client does not have the correct
   *           privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  PasswordPolicyCfgClient getPasswordPolicy(String name)
      throws DefinitionDecodingException, ManagedObjectDecodingException,
      ManagedObjectNotFoundException, ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Creates a new Password Policy. The new Password Policy will
   * initially not contain any property values (including mandatory
   * properties). Once the Password Policy has been configured it can
   * be added to the server using the {@link #commit()} method.
   *
   * @param <C>
   *          The type of the Password Policy being created.
   * @param d
   *          The definition of the Password Policy to be created.
   * @param name
   *          The name of the new Password Policy.
   * @param exceptions
   *          An optional collection in which to place any {@link
   *          DefaultBehaviorException}s that occurred whilst
   *          attempting to determine the default values of the
   *          Password Policy. This argument can be <code>null<code>.
   * @return Returns a new Password Policy configuration instance.
   * @throws IllegalManagedObjectNameException
   *          If the name of the new Password Policy is invalid.
   */
  <C extends PasswordPolicyCfgClient> C createPasswordPolicy(
      ManagedObjectDefinition<C, ? extends PasswordPolicyCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException;



  /**
   * Removes the named Password Policy.
   *
   * @param name
   *          The name of the Password Policy to remove.
   * @throws ManagedObjectNotFoundException
   *           If the Password Policy does not exist.
   * @throws OperationRejectedException
   *           If the server refuses to remove the Password Policy due
   *           to some server-side constraint which cannot be satisfied
   *           (for example, if it is referenced by another managed
   *           object).
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to remove the Password Policy
   *           because the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  void removePasswordPolicy(String name)
      throws ManagedObjectNotFoundException, OperationRejectedException,
      ConcurrentModificationException, AuthorizationException,
      CommunicationException;



  /**
   * Lists the Password Storage Schemes.
   *
   * @return Returns an array containing the names of the Password
   *         Storage Schemes.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to list the Password Storage
   *           Schemes because the client does not have the correct
   *           privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  String[] listPasswordStorageSchemes() throws ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Gets the named Password Storage Scheme.
   *
   * @param name
   *           The name of the Password Storage Scheme to retrieve.
   * @return Returns the named Password Storage Scheme.
   * @throws DefinitionDecodingException
   *           If the named Password Storage Scheme was found but its
   *           type could not be determined.
   * @throws ManagedObjectDecodingException
   *           If the named Password Storage Scheme was found but one
   *           or more of its properties could not be decoded.
   * @throws ManagedObjectNotFoundException
   *           If the named Password Storage Scheme was not found on
   *           the server.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to retrieve the named Password
   *           Storage Scheme because the client does not have the
   *           correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  PasswordStorageSchemeCfgClient getPasswordStorageScheme(String name)
      throws DefinitionDecodingException, ManagedObjectDecodingException,
      ManagedObjectNotFoundException, ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Creates a new Password Storage Scheme. The new Password Storage
   * Scheme will initially not contain any property values (including
   * mandatory properties). Once the Password Storage Scheme has been
   * configured it can be added to the server using the {@link
   * #commit()} method.
   *
   * @param <C>
   *          The type of the Password Storage Scheme being created.
   * @param d
   *          The definition of the Password Storage Scheme to be
   *          created.
   * @param name
   *          The name of the new Password Storage Scheme.
   * @param exceptions
   *          An optional collection in which to place any {@link
   *          DefaultBehaviorException}s that occurred whilst
   *          attempting to determine the default values of the
   *          Password Storage Scheme. This argument can be
   *          <code>null<code>.
   * @return Returns a new Password Storage Scheme configuration
   *         instance.
   * @throws IllegalManagedObjectNameException
   *          If the name of the new Password Storage Scheme is
   *          invalid.
   */
  <C extends PasswordStorageSchemeCfgClient> C createPasswordStorageScheme(
      ManagedObjectDefinition<C, ? extends PasswordStorageSchemeCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException;



  /**
   * Removes the named Password Storage Scheme.
   *
   * @param name
   *          The name of the Password Storage Scheme to remove.
   * @throws ManagedObjectNotFoundException
   *           If the Password Storage Scheme does not exist.
   * @throws OperationRejectedException
   *           If the server refuses to remove the Password Storage
   *           Scheme due to some server-side constraint which cannot
   *           be satisfied (for example, if it is referenced by
   *           another managed object).
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to remove the Password Storage
   *           Scheme because the client does not have the correct
   *           privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  void removePasswordStorageScheme(String name)
      throws ManagedObjectNotFoundException, OperationRejectedException,
      ConcurrentModificationException, AuthorizationException,
      CommunicationException;



  /**
   * Lists the Password Validators.
   *
   * @return Returns an array containing the names of the Password
   *         Validators.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to list the Password Validators
   *           because the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  String[] listPasswordValidators() throws ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Gets the named Password Validator.
   *
   * @param name
   *           The name of the Password Validator to retrieve.
   * @return Returns the named Password Validator.
   * @throws DefinitionDecodingException
   *           If the named Password Validator was found but its type
   *           could not be determined.
   * @throws ManagedObjectDecodingException
   *           If the named Password Validator was found but one or
   *           more of its properties could not be decoded.
   * @throws ManagedObjectNotFoundException
   *           If the named Password Validator was not found on the
   *           server.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to retrieve the named Password
   *           Validator because the client does not have the correct
   *           privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  PasswordValidatorCfgClient getPasswordValidator(String name)
      throws DefinitionDecodingException, ManagedObjectDecodingException,
      ManagedObjectNotFoundException, ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Creates a new Password Validator. The new Password Validator will
   * initially not contain any property values (including mandatory
   * properties). Once the Password Validator has been configured it
   * can be added to the server using the {@link #commit()} method.
   *
   * @param <C>
   *          The type of the Password Validator being created.
   * @param d
   *          The definition of the Password Validator to be created.
   * @param name
   *          The name of the new Password Validator.
   * @param exceptions
   *          An optional collection in which to place any {@link
   *          DefaultBehaviorException}s that occurred whilst
   *          attempting to determine the default values of the
   *          Password Validator. This argument can be
   *          <code>null<code>.
   * @return Returns a new Password Validator configuration instance.
   * @throws IllegalManagedObjectNameException
   *          If the name of the new Password Validator is invalid.
   */
  <C extends PasswordValidatorCfgClient> C createPasswordValidator(
      ManagedObjectDefinition<C, ? extends PasswordValidatorCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException;



  /**
   * Removes the named Password Validator.
   *
   * @param name
   *          The name of the Password Validator to remove.
   * @throws ManagedObjectNotFoundException
   *           If the Password Validator does not exist.
   * @throws OperationRejectedException
   *           If the server refuses to remove the Password Validator
   *           due to some server-side constraint which cannot be
   *           satisfied (for example, if it is referenced by another
   *           managed object).
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to remove the Password Validator
   *           because the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  void removePasswordValidator(String name)
      throws ManagedObjectNotFoundException, OperationRejectedException,
      ConcurrentModificationException, AuthorizationException,
      CommunicationException;



  /**
   * Gets the Plugin Root.
   *
   * @return Returns the Plugin Root.
   * @throws DefinitionDecodingException
   *           If the Plugin Root was found but its type could not be
   *           determined.
   * @throws ManagedObjectDecodingException
   *           If the Plugin Root was found but one or more of its
   *           properties could not be decoded.
   * @throws ManagedObjectNotFoundException
   *           If the Plugin Root could not be found on the server.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to retrieve the Plugin Root
   *           because the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  PluginRootCfgClient getPluginRoot()
      throws DefinitionDecodingException, ManagedObjectDecodingException,
      ManagedObjectNotFoundException, ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Gets the Root DN.
   *
   * @return Returns the Root DN.
   * @throws DefinitionDecodingException
   *           If the Root DN was found but its type could not be
   *           determined.
   * @throws ManagedObjectDecodingException
   *           If the Root DN was found but one or more of its
   *           properties could not be decoded.
   * @throws ManagedObjectNotFoundException
   *           If the Root DN could not be found on the server.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to retrieve the Root DN because
   *           the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  RootDNCfgClient getRootDN()
      throws DefinitionDecodingException, ManagedObjectDecodingException,
      ManagedObjectNotFoundException, ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Gets the Root DSE Backend.
   *
   * @return Returns the Root DSE Backend.
   * @throws DefinitionDecodingException
   *           If the Root DSE Backend was found but its type could
   *           not be determined.
   * @throws ManagedObjectDecodingException
   *           If the Root DSE Backend was found but one or more of
   *           its properties could not be decoded.
   * @throws ManagedObjectNotFoundException
   *           If the Root DSE Backend could not be found on the
   *           server.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to retrieve the Root DSE Backend
   *           because the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  RootDSEBackendCfgClient getRootDSEBackend()
      throws DefinitionDecodingException, ManagedObjectDecodingException,
      ManagedObjectNotFoundException, ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Lists the SASL Mechanism Handlers.
   *
   * @return Returns an array containing the names of the SASL
   *         Mechanism Handlers.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to list the SASL Mechanism
   *           Handlers because the client does not have the correct
   *           privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  String[] listSASLMechanismHandlers() throws ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Gets the named SASL Mechanism Handler.
   *
   * @param name
   *           The name of the SASL Mechanism Handler to retrieve.
   * @return Returns the named SASL Mechanism Handler.
   * @throws DefinitionDecodingException
   *           If the named SASL Mechanism Handler was found but its
   *           type could not be determined.
   * @throws ManagedObjectDecodingException
   *           If the named SASL Mechanism Handler was found but one
   *           or more of its properties could not be decoded.
   * @throws ManagedObjectNotFoundException
   *           If the named SASL Mechanism Handler was not found on
   *           the server.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to retrieve the named SASL
   *           Mechanism Handler because the client does not have the
   *           correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  SASLMechanismHandlerCfgClient getSASLMechanismHandler(String name)
      throws DefinitionDecodingException, ManagedObjectDecodingException,
      ManagedObjectNotFoundException, ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Creates a new SASL Mechanism Handler. The new SASL Mechanism
   * Handler will initially not contain any property values (including
   * mandatory properties). Once the SASL Mechanism Handler has been
   * configured it can be added to the server using the {@link
   * #commit()} method.
   *
   * @param <C>
   *          The type of the SASL Mechanism Handler being created.
   * @param d
   *          The definition of the SASL Mechanism Handler to be
   *          created.
   * @param name
   *          The name of the new SASL Mechanism Handler.
   * @param exceptions
   *          An optional collection in which to place any {@link
   *          DefaultBehaviorException}s that occurred whilst
   *          attempting to determine the default values of the SASL
   *          Mechanism Handler. This argument can be <code>null<code>.
   * @return Returns a new SASL Mechanism Handler configuration
   *         instance.
   * @throws IllegalManagedObjectNameException
   *          If the name of the new SASL Mechanism Handler is
   *          invalid.
   */
  <C extends SASLMechanismHandlerCfgClient> C createSASLMechanismHandler(
      ManagedObjectDefinition<C, ? extends SASLMechanismHandlerCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException;



  /**
   * Removes the named SASL Mechanism Handler.
   *
   * @param name
   *          The name of the SASL Mechanism Handler to remove.
   * @throws ManagedObjectNotFoundException
   *           If the SASL Mechanism Handler does not exist.
   * @throws OperationRejectedException
   *           If the server refuses to remove the SASL Mechanism
   *           Handler due to some server-side constraint which cannot
   *           be satisfied (for example, if it is referenced by
   *           another managed object).
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to remove the SASL Mechanism
   *           Handler because the client does not have the correct
   *           privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  void removeSASLMechanismHandler(String name)
      throws ManagedObjectNotFoundException, OperationRejectedException,
      ConcurrentModificationException, AuthorizationException,
      CommunicationException;



  /**
   * Lists the Synchronization Providers.
   *
   * @return Returns an array containing the names of the
   *         Synchronization Providers.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to list the Synchronization
   *           Providers because the client does not have the correct
   *           privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  String[] listSynchronizationProviders() throws ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Gets the named Synchronization Provider.
   *
   * @param name
   *           The name of the Synchronization Provider to retrieve.
   * @return Returns the named Synchronization Provider.
   * @throws DefinitionDecodingException
   *           If the named Synchronization Provider was found but its
   *           type could not be determined.
   * @throws ManagedObjectDecodingException
   *           If the named Synchronization Provider was found but one
   *           or more of its properties could not be decoded.
   * @throws ManagedObjectNotFoundException
   *           If the named Synchronization Provider was not found on
   *           the server.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to retrieve the named
   *           Synchronization Provider because the client does not
   *           have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  SynchronizationProviderCfgClient getSynchronizationProvider(String name)
      throws DefinitionDecodingException, ManagedObjectDecodingException,
      ManagedObjectNotFoundException, ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Creates a new Synchronization Provider. The new Synchronization
   * Provider will initially not contain any property values (including
   * mandatory properties). Once the Synchronization Provider has been
   * configured it can be added to the server using the {@link
   * #commit()} method.
   *
   * @param <C>
   *          The type of the Synchronization Provider being created.
   * @param d
   *          The definition of the Synchronization Provider to be
   *          created.
   * @param name
   *          The name of the new Synchronization Provider.
   * @param exceptions
   *          An optional collection in which to place any {@link
   *          DefaultBehaviorException}s that occurred whilst
   *          attempting to determine the default values of the
   *          Synchronization Provider. This argument can be
   *          <code>null<code>.
   * @return Returns a new Synchronization Provider configuration
   *         instance.
   * @throws IllegalManagedObjectNameException
   *          If the name of the new Synchronization Provider is
   *          invalid.
   */
  <C extends SynchronizationProviderCfgClient> C createSynchronizationProvider(
      ManagedObjectDefinition<C, ? extends SynchronizationProviderCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException;



  /**
   * Removes the named Synchronization Provider.
   *
   * @param name
   *          The name of the Synchronization Provider to remove.
   * @throws ManagedObjectNotFoundException
   *           If the Synchronization Provider does not exist.
   * @throws OperationRejectedException
   *           If the server refuses to remove the Synchronization
   *           Provider due to some server-side constraint which cannot
   *           be satisfied (for example, if it is referenced by
   *           another managed object).
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to remove the Synchronization
   *           Provider because the client does not have the correct
   *           privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  void removeSynchronizationProvider(String name)
      throws ManagedObjectNotFoundException, OperationRejectedException,
      ConcurrentModificationException, AuthorizationException,
      CommunicationException;



  /**
   * Lists the Trust Manager Providers.
   *
   * @return Returns an array containing the names of the Trust
   *         Manager Providers.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to list the Trust Manager
   *           Providers because the client does not have the correct
   *           privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  String[] listTrustManagerProviders() throws ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Gets the named Trust Manager Provider.
   *
   * @param name
   *           The name of the Trust Manager Provider to retrieve.
   * @return Returns the named Trust Manager Provider.
   * @throws DefinitionDecodingException
   *           If the named Trust Manager Provider was found but its
   *           type could not be determined.
   * @throws ManagedObjectDecodingException
   *           If the named Trust Manager Provider was found but one
   *           or more of its properties could not be decoded.
   * @throws ManagedObjectNotFoundException
   *           If the named Trust Manager Provider was not found on
   *           the server.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to retrieve the named Trust
   *           Manager Provider because the client does not have the
   *           correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  TrustManagerProviderCfgClient getTrustManagerProvider(String name)
      throws DefinitionDecodingException, ManagedObjectDecodingException,
      ManagedObjectNotFoundException, ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Creates a new Trust Manager Provider. The new Trust Manager
   * Provider will initially not contain any property values (including
   * mandatory properties). Once the Trust Manager Provider has been
   * configured it can be added to the server using the {@link
   * #commit()} method.
   *
   * @param <C>
   *          The type of the Trust Manager Provider being created.
   * @param d
   *          The definition of the Trust Manager Provider to be
   *          created.
   * @param name
   *          The name of the new Trust Manager Provider.
   * @param exceptions
   *          An optional collection in which to place any {@link
   *          DefaultBehaviorException}s that occurred whilst
   *          attempting to determine the default values of the Trust
   *          Manager Provider. This argument can be <code>null<code>.
   * @return Returns a new Trust Manager Provider configuration
   *         instance.
   * @throws IllegalManagedObjectNameException
   *          If the name of the new Trust Manager Provider is
   *          invalid.
   */
  <C extends TrustManagerProviderCfgClient> C createTrustManagerProvider(
      ManagedObjectDefinition<C, ? extends TrustManagerProviderCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException;



  /**
   * Removes the named Trust Manager Provider.
   *
   * @param name
   *          The name of the Trust Manager Provider to remove.
   * @throws ManagedObjectNotFoundException
   *           If the Trust Manager Provider does not exist.
   * @throws OperationRejectedException
   *           If the server refuses to remove the Trust Manager
   *           Provider due to some server-side constraint which cannot
   *           be satisfied (for example, if it is referenced by
   *           another managed object).
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to remove the Trust Manager
   *           Provider because the client does not have the correct
   *           privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  void removeTrustManagerProvider(String name)
      throws ManagedObjectNotFoundException, OperationRejectedException,
      ConcurrentModificationException, AuthorizationException,
      CommunicationException;



  /**
   * Lists the Virtual Attributes.
   *
   * @return Returns an array containing the names of the Virtual
   *         Attributes.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to list the Virtual Attributes
   *           because the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  String[] listVirtualAttributes() throws ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Gets the named Virtual Attribute.
   *
   * @param name
   *           The name of the Virtual Attribute to retrieve.
   * @return Returns the named Virtual Attribute.
   * @throws DefinitionDecodingException
   *           If the named Virtual Attribute was found but its type
   *           could not be determined.
   * @throws ManagedObjectDecodingException
   *           If the named Virtual Attribute was found but one or
   *           more of its properties could not be decoded.
   * @throws ManagedObjectNotFoundException
   *           If the named Virtual Attribute was not found on the
   *           server.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to retrieve the named Virtual
   *           Attribute because the client does not have the correct
   *           privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  VirtualAttributeCfgClient getVirtualAttribute(String name)
      throws DefinitionDecodingException, ManagedObjectDecodingException,
      ManagedObjectNotFoundException, ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Creates a new Virtual Attribute. The new Virtual Attribute will
   * initially not contain any property values (including mandatory
   * properties). Once the Virtual Attribute has been configured it can
   * be added to the server using the {@link #commit()} method.
   *
   * @param <C>
   *          The type of the Virtual Attribute being created.
   * @param d
   *          The definition of the Virtual Attribute to be created.
   * @param name
   *          The name of the new Virtual Attribute.
   * @param exceptions
   *          An optional collection in which to place any {@link
   *          DefaultBehaviorException}s that occurred whilst
   *          attempting to determine the default values of the Virtual
   *          Attribute. This argument can be <code>null<code>.
   * @return Returns a new Virtual Attribute configuration instance.
   * @throws IllegalManagedObjectNameException
   *          If the name of the new Virtual Attribute is invalid.
   */
  <C extends VirtualAttributeCfgClient> C createVirtualAttribute(
      ManagedObjectDefinition<C, ? extends VirtualAttributeCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException;



  /**
   * Removes the named Virtual Attribute.
   *
   * @param name
   *          The name of the Virtual Attribute to remove.
   * @throws ManagedObjectNotFoundException
   *           If the Virtual Attribute does not exist.
   * @throws OperationRejectedException
   *           If the server refuses to remove the Virtual Attribute
   *           due to some server-side constraint which cannot be
   *           satisfied (for example, if it is referenced by another
   *           managed object).
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to remove the Virtual Attribute
   *           because the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  void removeVirtualAttribute(String name)
      throws ManagedObjectNotFoundException, OperationRejectedException,
      ConcurrentModificationException, AuthorizationException,
      CommunicationException;



  /**
   * Lists the Workflows.
   *
   * @return Returns an array containing the names of the Workflows.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to list the Workflows because the
   *           client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  String[] listWorkflows() throws ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Gets the named Workflow.
   *
   * @param name
   *           The name of the Workflow to retrieve.
   * @return Returns the named Workflow.
   * @throws DefinitionDecodingException
   *           If the named Workflow was found but its type could not
   *           be determined.
   * @throws ManagedObjectDecodingException
   *           If the named Workflow was found but one or more of its
   *           properties could not be decoded.
   * @throws ManagedObjectNotFoundException
   *           If the named Workflow was not found on the server.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to retrieve the named Workflow
   *           because the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  WorkflowCfgClient getWorkflow(String name)
      throws DefinitionDecodingException, ManagedObjectDecodingException,
      ManagedObjectNotFoundException, ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Creates a new Workflow. The new Workflow will initially not
   * contain any property values (including mandatory properties). Once
   * the Workflow has been configured it can be added to the server
   * using the {@link #commit()} method.
   *
   * @param <C>
   *          The type of the Workflow being created.
   * @param d
   *          The definition of the Workflow to be created.
   * @param name
   *          The name of the new Workflow.
   * @param exceptions
   *          An optional collection in which to place any {@link
   *          DefaultBehaviorException}s that occurred whilst
   *          attempting to determine the default values of the
   *          Workflow. This argument can be <code>null<code>.
   * @return Returns a new Workflow configuration instance.
   * @throws IllegalManagedObjectNameException
   *          If the name of the new Workflow is invalid.
   */
  <C extends WorkflowCfgClient> C createWorkflow(
      ManagedObjectDefinition<C, ? extends WorkflowCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException;



  /**
   * Removes the named Workflow.
   *
   * @param name
   *          The name of the Workflow to remove.
   * @throws ManagedObjectNotFoundException
   *           If the Workflow does not exist.
   * @throws OperationRejectedException
   *           If the server refuses to remove the Workflow due to
   *           some server-side constraint which cannot be satisfied
   *           (for example, if it is referenced by another managed
   *           object).
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to remove the Workflow because
   *           the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  void removeWorkflow(String name)
      throws ManagedObjectNotFoundException, OperationRejectedException,
      ConcurrentModificationException, AuthorizationException,
      CommunicationException;



  /**
   * Lists the Workflow Elements.
   *
   * @return Returns an array containing the names of the Workflow
   *         Elements.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to list the Workflow Elements
   *           because the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  String[] listWorkflowElements() throws ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Gets the named Workflow Element.
   *
   * @param name
   *           The name of the Workflow Element to retrieve.
   * @return Returns the named Workflow Element.
   * @throws DefinitionDecodingException
   *           If the named Workflow Element was found but its type
   *           could not be determined.
   * @throws ManagedObjectDecodingException
   *           If the named Workflow Element was found but one or more
   *           of its properties could not be decoded.
   * @throws ManagedObjectNotFoundException
   *           If the named Workflow Element was not found on the
   *           server.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to retrieve the named Workflow
   *           Element because the client does not have the correct
   *           privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  WorkflowElementCfgClient getWorkflowElement(String name)
      throws DefinitionDecodingException, ManagedObjectDecodingException,
      ManagedObjectNotFoundException, ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Creates a new Workflow Element. The new Workflow Element will
   * initially not contain any property values (including mandatory
   * properties). Once the Workflow Element has been configured it can
   * be added to the server using the {@link #commit()} method.
   *
   * @param <C>
   *          The type of the Workflow Element being created.
   * @param d
   *          The definition of the Workflow Element to be created.
   * @param name
   *          The name of the new Workflow Element.
   * @param exceptions
   *          An optional collection in which to place any {@link
   *          DefaultBehaviorException}s that occurred whilst
   *          attempting to determine the default values of the
   *          Workflow Element. This argument can be <code>null<code>.
   * @return Returns a new Workflow Element configuration instance.
   * @throws IllegalManagedObjectNameException
   *          If the name of the new Workflow Element is invalid.
   */
  <C extends WorkflowElementCfgClient> C createWorkflowElement(
      ManagedObjectDefinition<C, ? extends WorkflowElementCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException;



  /**
   * Removes the named Workflow Element.
   *
   * @param name
   *          The name of the Workflow Element to remove.
   * @throws ManagedObjectNotFoundException
   *           If the Workflow Element does not exist.
   * @throws OperationRejectedException
   *           If the server refuses to remove the Workflow Element
   *           due to some server-side constraint which cannot be
   *           satisfied (for example, if it is referenced by another
   *           managed object).
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to remove the Workflow Element
   *           because the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  void removeWorkflowElement(String name)
      throws ManagedObjectNotFoundException, OperationRejectedException,
      ConcurrentModificationException, AuthorizationException,
      CommunicationException;



  /**
   * Gets the Work Queue.
   *
   * @return Returns the Work Queue.
   * @throws DefinitionDecodingException
   *           If the Work Queue was found but its type could not be
   *           determined.
   * @throws ManagedObjectDecodingException
   *           If the Work Queue was found but one or more of its
   *           properties could not be decoded.
   * @throws ManagedObjectNotFoundException
   *           If the Work Queue could not be found on the server.
   * @throws ConcurrentModificationException
   *           If this Root has been removed from the server by
   *           another client.
   * @throws AuthorizationException
   *           If the server refuses to retrieve the Work Queue
   *           because the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  WorkQueueCfgClient getWorkQueue()
      throws DefinitionDecodingException, ManagedObjectDecodingException,
      ManagedObjectNotFoundException, ConcurrentModificationException,
      AuthorizationException, CommunicationException;

}
