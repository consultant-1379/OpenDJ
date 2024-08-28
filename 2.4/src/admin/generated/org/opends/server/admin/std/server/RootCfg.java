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



import org.opends.server.admin.Configuration;
import org.opends.server.admin.server.ConfigurationAddListener;
import org.opends.server.admin.server.ConfigurationDeleteListener;
import org.opends.server.config.ConfigException;



/**
 * A server-side interface for querying Root settings.
 * <p>
 * The root configuration provides an entry point to the rest of the
 * OpenDS Directory Server configuration.
 */
public interface RootCfg extends Configuration {

  /**
   * Gets the configuration class associated with this Root.
   *
   * @return Returns the configuration class associated with this Root.
   */
  Class<? extends RootCfg> configurationClass();



  /**
   * Gets the Access Control Handler.
   *
   * @return Returns the Access Control Handler.
   * @throws ConfigException
   *           If the Access Control Handler could not be found or it could not
   *           be successfully decoded.
   */
  AccessControlHandlerCfg getAccessControlHandler() throws ConfigException;



  /**
   * Lists the Account Status Notification Handlers.
   *
   * @return Returns an array containing the names of the
   *         Account Status Notification Handlers.
   */
  String[] listAccountStatusNotificationHandlers();



  /**
   * Gets the named Account Status Notification Handler.
   *
   * @param name
   *          The name of the Account Status Notification Handler to retrieve.
   * @return Returns the named Account Status Notification Handler.
   * @throws ConfigException
   *           If the Account Status Notification Handler could not be found or it
   *           could not be successfully decoded.
   */
  AccountStatusNotificationHandlerCfg getAccountStatusNotificationHandler(String name) throws ConfigException;



  /**
   * Registers to be notified when new Account Status Notification Handlers are added.
   *
   * @param listener
   *          The Account Status Notification Handler configuration add listener.
   * @throws ConfigException
   *          If the add listener could not be registered.
   */
  void addAccountStatusNotificationHandlerAddListener(ConfigurationAddListener<AccountStatusNotificationHandlerCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Account Status Notification Handler configuration add listener.
   *
   * @param listener
   *          The Account Status Notification Handler configuration add listener.
   */
  void removeAccountStatusNotificationHandlerAddListener(ConfigurationAddListener<AccountStatusNotificationHandlerCfg> listener);



  /**
   * Registers to be notified when existing Account Status Notification Handlers are deleted.
   *
   * @param listener
   *          The Account Status Notification Handler configuration delete listener.
   * @throws ConfigException
   *          If the delete listener could not be registered.
   */
  void addAccountStatusNotificationHandlerDeleteListener(ConfigurationDeleteListener<AccountStatusNotificationHandlerCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Account Status Notification Handler configuration delete listener.
   *
   * @param listener
   *          The Account Status Notification Handler configuration delete listener.
   */
  void removeAccountStatusNotificationHandlerDeleteListener(ConfigurationDeleteListener<AccountStatusNotificationHandlerCfg> listener);



  /**
   * Gets the Administration Connector.
   *
   * @return Returns the Administration Connector.
   * @throws ConfigException
   *           If the Administration Connector could not be found or it could not
   *           be successfully decoded.
   */
  AdministrationConnectorCfg getAdministrationConnector() throws ConfigException;



  /**
   * Lists the Alert Handlers.
   *
   * @return Returns an array containing the names of the
   *         Alert Handlers.
   */
  String[] listAlertHandlers();



  /**
   * Gets the named Alert Handler.
   *
   * @param name
   *          The name of the Alert Handler to retrieve.
   * @return Returns the named Alert Handler.
   * @throws ConfigException
   *           If the Alert Handler could not be found or it
   *           could not be successfully decoded.
   */
  AlertHandlerCfg getAlertHandler(String name) throws ConfigException;



  /**
   * Registers to be notified when new Alert Handlers are added.
   *
   * @param listener
   *          The Alert Handler configuration add listener.
   * @throws ConfigException
   *          If the add listener could not be registered.
   */
  void addAlertHandlerAddListener(ConfigurationAddListener<AlertHandlerCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Alert Handler configuration add listener.
   *
   * @param listener
   *          The Alert Handler configuration add listener.
   */
  void removeAlertHandlerAddListener(ConfigurationAddListener<AlertHandlerCfg> listener);



  /**
   * Registers to be notified when existing Alert Handlers are deleted.
   *
   * @param listener
   *          The Alert Handler configuration delete listener.
   * @throws ConfigException
   *          If the delete listener could not be registered.
   */
  void addAlertHandlerDeleteListener(ConfigurationDeleteListener<AlertHandlerCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Alert Handler configuration delete listener.
   *
   * @param listener
   *          The Alert Handler configuration delete listener.
   */
  void removeAlertHandlerDeleteListener(ConfigurationDeleteListener<AlertHandlerCfg> listener);



  /**
   * Lists the Attribute Syntaxes.
   *
   * @return Returns an array containing the names of the
   *         Attribute Syntaxes.
   */
  String[] listAttributeSyntaxes();



  /**
   * Gets the named Attribute Syntax.
   *
   * @param name
   *          The name of the Attribute Syntax to retrieve.
   * @return Returns the named Attribute Syntax.
   * @throws ConfigException
   *           If the Attribute Syntax could not be found or it
   *           could not be successfully decoded.
   */
  AttributeSyntaxCfg getAttributeSyntax(String name) throws ConfigException;



  /**
   * Registers to be notified when new Attribute Syntaxes are added.
   *
   * @param listener
   *          The Attribute Syntax configuration add listener.
   * @throws ConfigException
   *          If the add listener could not be registered.
   */
  void addAttributeSyntaxAddListener(ConfigurationAddListener<AttributeSyntaxCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Attribute Syntax configuration add listener.
   *
   * @param listener
   *          The Attribute Syntax configuration add listener.
   */
  void removeAttributeSyntaxAddListener(ConfigurationAddListener<AttributeSyntaxCfg> listener);



  /**
   * Registers to be notified when existing Attribute Syntaxes are deleted.
   *
   * @param listener
   *          The Attribute Syntax configuration delete listener.
   * @throws ConfigException
   *          If the delete listener could not be registered.
   */
  void addAttributeSyntaxDeleteListener(ConfigurationDeleteListener<AttributeSyntaxCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Attribute Syntax configuration delete listener.
   *
   * @param listener
   *          The Attribute Syntax configuration delete listener.
   */
  void removeAttributeSyntaxDeleteListener(ConfigurationDeleteListener<AttributeSyntaxCfg> listener);



  /**
   * Lists the Backends.
   *
   * @return Returns an array containing the names of the
   *         Backends.
   */
  String[] listBackends();



  /**
   * Gets the named Backend.
   *
   * @param name
   *          The name of the Backend to retrieve.
   * @return Returns the named Backend.
   * @throws ConfigException
   *           If the Backend could not be found or it
   *           could not be successfully decoded.
   */
  BackendCfg getBackend(String name) throws ConfigException;



  /**
   * Registers to be notified when new Backends are added.
   *
   * @param listener
   *          The Backend configuration add listener.
   * @throws ConfigException
   *          If the add listener could not be registered.
   */
  void addBackendAddListener(ConfigurationAddListener<BackendCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Backend configuration add listener.
   *
   * @param listener
   *          The Backend configuration add listener.
   */
  void removeBackendAddListener(ConfigurationAddListener<BackendCfg> listener);



  /**
   * Registers to be notified when existing Backends are deleted.
   *
   * @param listener
   *          The Backend configuration delete listener.
   * @throws ConfigException
   *          If the delete listener could not be registered.
   */
  void addBackendDeleteListener(ConfigurationDeleteListener<BackendCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Backend configuration delete listener.
   *
   * @param listener
   *          The Backend configuration delete listener.
   */
  void removeBackendDeleteListener(ConfigurationDeleteListener<BackendCfg> listener);



  /**
   * Lists the Certificate Mappers.
   *
   * @return Returns an array containing the names of the
   *         Certificate Mappers.
   */
  String[] listCertificateMappers();



  /**
   * Gets the named Certificate Mapper.
   *
   * @param name
   *          The name of the Certificate Mapper to retrieve.
   * @return Returns the named Certificate Mapper.
   * @throws ConfigException
   *           If the Certificate Mapper could not be found or it
   *           could not be successfully decoded.
   */
  CertificateMapperCfg getCertificateMapper(String name) throws ConfigException;



  /**
   * Registers to be notified when new Certificate Mappers are added.
   *
   * @param listener
   *          The Certificate Mapper configuration add listener.
   * @throws ConfigException
   *          If the add listener could not be registered.
   */
  void addCertificateMapperAddListener(ConfigurationAddListener<CertificateMapperCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Certificate Mapper configuration add listener.
   *
   * @param listener
   *          The Certificate Mapper configuration add listener.
   */
  void removeCertificateMapperAddListener(ConfigurationAddListener<CertificateMapperCfg> listener);



  /**
   * Registers to be notified when existing Certificate Mappers are deleted.
   *
   * @param listener
   *          The Certificate Mapper configuration delete listener.
   * @throws ConfigException
   *          If the delete listener could not be registered.
   */
  void addCertificateMapperDeleteListener(ConfigurationDeleteListener<CertificateMapperCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Certificate Mapper configuration delete listener.
   *
   * @param listener
   *          The Certificate Mapper configuration delete listener.
   */
  void removeCertificateMapperDeleteListener(ConfigurationDeleteListener<CertificateMapperCfg> listener);



  /**
   * Lists the Connection Handlers.
   *
   * @return Returns an array containing the names of the
   *         Connection Handlers.
   */
  String[] listConnectionHandlers();



  /**
   * Gets the named Connection Handler.
   *
   * @param name
   *          The name of the Connection Handler to retrieve.
   * @return Returns the named Connection Handler.
   * @throws ConfigException
   *           If the Connection Handler could not be found or it
   *           could not be successfully decoded.
   */
  ConnectionHandlerCfg getConnectionHandler(String name) throws ConfigException;



  /**
   * Registers to be notified when new Connection Handlers are added.
   *
   * @param listener
   *          The Connection Handler configuration add listener.
   * @throws ConfigException
   *          If the add listener could not be registered.
   */
  void addConnectionHandlerAddListener(ConfigurationAddListener<ConnectionHandlerCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Connection Handler configuration add listener.
   *
   * @param listener
   *          The Connection Handler configuration add listener.
   */
  void removeConnectionHandlerAddListener(ConfigurationAddListener<ConnectionHandlerCfg> listener);



  /**
   * Registers to be notified when existing Connection Handlers are deleted.
   *
   * @param listener
   *          The Connection Handler configuration delete listener.
   * @throws ConfigException
   *          If the delete listener could not be registered.
   */
  void addConnectionHandlerDeleteListener(ConfigurationDeleteListener<ConnectionHandlerCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Connection Handler configuration delete listener.
   *
   * @param listener
   *          The Connection Handler configuration delete listener.
   */
  void removeConnectionHandlerDeleteListener(ConfigurationDeleteListener<ConnectionHandlerCfg> listener);



  /**
   * Gets the Crypto Manager.
   *
   * @return Returns the Crypto Manager.
   * @throws ConfigException
   *           If the Crypto Manager could not be found or it could not
   *           be successfully decoded.
   */
  CryptoManagerCfg getCryptoManager() throws ConfigException;



  /**
   * Lists the Entry Caches.
   *
   * @return Returns an array containing the names of the
   *         Entry Caches.
   */
  String[] listEntryCaches();



  /**
   * Gets the named Entry Cache.
   *
   * @param name
   *          The name of the Entry Cache to retrieve.
   * @return Returns the named Entry Cache.
   * @throws ConfigException
   *           If the Entry Cache could not be found or it
   *           could not be successfully decoded.
   */
  EntryCacheCfg getEntryCache(String name) throws ConfigException;



  /**
   * Registers to be notified when new Entry Caches are added.
   *
   * @param listener
   *          The Entry Cache configuration add listener.
   * @throws ConfigException
   *          If the add listener could not be registered.
   */
  void addEntryCacheAddListener(ConfigurationAddListener<EntryCacheCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Entry Cache configuration add listener.
   *
   * @param listener
   *          The Entry Cache configuration add listener.
   */
  void removeEntryCacheAddListener(ConfigurationAddListener<EntryCacheCfg> listener);



  /**
   * Registers to be notified when existing Entry Caches are deleted.
   *
   * @param listener
   *          The Entry Cache configuration delete listener.
   * @throws ConfigException
   *          If the delete listener could not be registered.
   */
  void addEntryCacheDeleteListener(ConfigurationDeleteListener<EntryCacheCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Entry Cache configuration delete listener.
   *
   * @param listener
   *          The Entry Cache configuration delete listener.
   */
  void removeEntryCacheDeleteListener(ConfigurationDeleteListener<EntryCacheCfg> listener);



  /**
   * Lists the Extended Operation Handlers.
   *
   * @return Returns an array containing the names of the
   *         Extended Operation Handlers.
   */
  String[] listExtendedOperationHandlers();



  /**
   * Gets the named Extended Operation Handler.
   *
   * @param name
   *          The name of the Extended Operation Handler to retrieve.
   * @return Returns the named Extended Operation Handler.
   * @throws ConfigException
   *           If the Extended Operation Handler could not be found or it
   *           could not be successfully decoded.
   */
  ExtendedOperationHandlerCfg getExtendedOperationHandler(String name) throws ConfigException;



  /**
   * Registers to be notified when new Extended Operation Handlers are added.
   *
   * @param listener
   *          The Extended Operation Handler configuration add listener.
   * @throws ConfigException
   *          If the add listener could not be registered.
   */
  void addExtendedOperationHandlerAddListener(ConfigurationAddListener<ExtendedOperationHandlerCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Extended Operation Handler configuration add listener.
   *
   * @param listener
   *          The Extended Operation Handler configuration add listener.
   */
  void removeExtendedOperationHandlerAddListener(ConfigurationAddListener<ExtendedOperationHandlerCfg> listener);



  /**
   * Registers to be notified when existing Extended Operation Handlers are deleted.
   *
   * @param listener
   *          The Extended Operation Handler configuration delete listener.
   * @throws ConfigException
   *          If the delete listener could not be registered.
   */
  void addExtendedOperationHandlerDeleteListener(ConfigurationDeleteListener<ExtendedOperationHandlerCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Extended Operation Handler configuration delete listener.
   *
   * @param listener
   *          The Extended Operation Handler configuration delete listener.
   */
  void removeExtendedOperationHandlerDeleteListener(ConfigurationDeleteListener<ExtendedOperationHandlerCfg> listener);



  /**
   * Lists the Extensions.
   *
   * @return Returns an array containing the names of the
   *         Extensions.
   */
  String[] listExtensions();



  /**
   * Gets the named Extension.
   *
   * @param name
   *          The name of the Extension to retrieve.
   * @return Returns the named Extension.
   * @throws ConfigException
   *           If the Extension could not be found or it
   *           could not be successfully decoded.
   */
  ExtensionCfg getExtension(String name) throws ConfigException;



  /**
   * Registers to be notified when new Extensions are added.
   *
   * @param listener
   *          The Extension configuration add listener.
   * @throws ConfigException
   *          If the add listener could not be registered.
   */
  void addExtensionAddListener(ConfigurationAddListener<ExtensionCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Extension configuration add listener.
   *
   * @param listener
   *          The Extension configuration add listener.
   */
  void removeExtensionAddListener(ConfigurationAddListener<ExtensionCfg> listener);



  /**
   * Registers to be notified when existing Extensions are deleted.
   *
   * @param listener
   *          The Extension configuration delete listener.
   * @throws ConfigException
   *          If the delete listener could not be registered.
   */
  void addExtensionDeleteListener(ConfigurationDeleteListener<ExtensionCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Extension configuration delete listener.
   *
   * @param listener
   *          The Extension configuration delete listener.
   */
  void removeExtensionDeleteListener(ConfigurationDeleteListener<ExtensionCfg> listener);



  /**
   * Gets the Global Configuration.
   *
   * @return Returns the Global Configuration.
   * @throws ConfigException
   *           If the Global Configuration could not be found or it could not
   *           be successfully decoded.
   */
  GlobalCfg getGlobalConfiguration() throws ConfigException;



  /**
   * Lists the Group Implementations.
   *
   * @return Returns an array containing the names of the
   *         Group Implementations.
   */
  String[] listGroupImplementations();



  /**
   * Gets the named Group Implementation.
   *
   * @param name
   *          The name of the Group Implementation to retrieve.
   * @return Returns the named Group Implementation.
   * @throws ConfigException
   *           If the Group Implementation could not be found or it
   *           could not be successfully decoded.
   */
  GroupImplementationCfg getGroupImplementation(String name) throws ConfigException;



  /**
   * Registers to be notified when new Group Implementations are added.
   *
   * @param listener
   *          The Group Implementation configuration add listener.
   * @throws ConfigException
   *          If the add listener could not be registered.
   */
  void addGroupImplementationAddListener(ConfigurationAddListener<GroupImplementationCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Group Implementation configuration add listener.
   *
   * @param listener
   *          The Group Implementation configuration add listener.
   */
  void removeGroupImplementationAddListener(ConfigurationAddListener<GroupImplementationCfg> listener);



  /**
   * Registers to be notified when existing Group Implementations are deleted.
   *
   * @param listener
   *          The Group Implementation configuration delete listener.
   * @throws ConfigException
   *          If the delete listener could not be registered.
   */
  void addGroupImplementationDeleteListener(ConfigurationDeleteListener<GroupImplementationCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Group Implementation configuration delete listener.
   *
   * @param listener
   *          The Group Implementation configuration delete listener.
   */
  void removeGroupImplementationDeleteListener(ConfigurationDeleteListener<GroupImplementationCfg> listener);



  /**
   * Lists the Identity Mappers.
   *
   * @return Returns an array containing the names of the
   *         Identity Mappers.
   */
  String[] listIdentityMappers();



  /**
   * Gets the named Identity Mapper.
   *
   * @param name
   *          The name of the Identity Mapper to retrieve.
   * @return Returns the named Identity Mapper.
   * @throws ConfigException
   *           If the Identity Mapper could not be found or it
   *           could not be successfully decoded.
   */
  IdentityMapperCfg getIdentityMapper(String name) throws ConfigException;



  /**
   * Registers to be notified when new Identity Mappers are added.
   *
   * @param listener
   *          The Identity Mapper configuration add listener.
   * @throws ConfigException
   *          If the add listener could not be registered.
   */
  void addIdentityMapperAddListener(ConfigurationAddListener<IdentityMapperCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Identity Mapper configuration add listener.
   *
   * @param listener
   *          The Identity Mapper configuration add listener.
   */
  void removeIdentityMapperAddListener(ConfigurationAddListener<IdentityMapperCfg> listener);



  /**
   * Registers to be notified when existing Identity Mappers are deleted.
   *
   * @param listener
   *          The Identity Mapper configuration delete listener.
   * @throws ConfigException
   *          If the delete listener could not be registered.
   */
  void addIdentityMapperDeleteListener(ConfigurationDeleteListener<IdentityMapperCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Identity Mapper configuration delete listener.
   *
   * @param listener
   *          The Identity Mapper configuration delete listener.
   */
  void removeIdentityMapperDeleteListener(ConfigurationDeleteListener<IdentityMapperCfg> listener);



  /**
   * Lists the Key Manager Providers.
   *
   * @return Returns an array containing the names of the
   *         Key Manager Providers.
   */
  String[] listKeyManagerProviders();



  /**
   * Gets the named Key Manager Provider.
   *
   * @param name
   *          The name of the Key Manager Provider to retrieve.
   * @return Returns the named Key Manager Provider.
   * @throws ConfigException
   *           If the Key Manager Provider could not be found or it
   *           could not be successfully decoded.
   */
  KeyManagerProviderCfg getKeyManagerProvider(String name) throws ConfigException;



  /**
   * Registers to be notified when new Key Manager Providers are added.
   *
   * @param listener
   *          The Key Manager Provider configuration add listener.
   * @throws ConfigException
   *          If the add listener could not be registered.
   */
  void addKeyManagerProviderAddListener(ConfigurationAddListener<KeyManagerProviderCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Key Manager Provider configuration add listener.
   *
   * @param listener
   *          The Key Manager Provider configuration add listener.
   */
  void removeKeyManagerProviderAddListener(ConfigurationAddListener<KeyManagerProviderCfg> listener);



  /**
   * Registers to be notified when existing Key Manager Providers are deleted.
   *
   * @param listener
   *          The Key Manager Provider configuration delete listener.
   * @throws ConfigException
   *          If the delete listener could not be registered.
   */
  void addKeyManagerProviderDeleteListener(ConfigurationDeleteListener<KeyManagerProviderCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Key Manager Provider configuration delete listener.
   *
   * @param listener
   *          The Key Manager Provider configuration delete listener.
   */
  void removeKeyManagerProviderDeleteListener(ConfigurationDeleteListener<KeyManagerProviderCfg> listener);



  /**
   * Lists the Log Publishers.
   *
   * @return Returns an array containing the names of the
   *         Log Publishers.
   */
  String[] listLogPublishers();



  /**
   * Gets the named Log Publisher.
   *
   * @param name
   *          The name of the Log Publisher to retrieve.
   * @return Returns the named Log Publisher.
   * @throws ConfigException
   *           If the Log Publisher could not be found or it
   *           could not be successfully decoded.
   */
  LogPublisherCfg getLogPublisher(String name) throws ConfigException;



  /**
   * Registers to be notified when new Log Publishers are added.
   *
   * @param listener
   *          The Log Publisher configuration add listener.
   * @throws ConfigException
   *          If the add listener could not be registered.
   */
  void addLogPublisherAddListener(ConfigurationAddListener<LogPublisherCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Log Publisher configuration add listener.
   *
   * @param listener
   *          The Log Publisher configuration add listener.
   */
  void removeLogPublisherAddListener(ConfigurationAddListener<LogPublisherCfg> listener);



  /**
   * Registers to be notified when existing Log Publishers are deleted.
   *
   * @param listener
   *          The Log Publisher configuration delete listener.
   * @throws ConfigException
   *          If the delete listener could not be registered.
   */
  void addLogPublisherDeleteListener(ConfigurationDeleteListener<LogPublisherCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Log Publisher configuration delete listener.
   *
   * @param listener
   *          The Log Publisher configuration delete listener.
   */
  void removeLogPublisherDeleteListener(ConfigurationDeleteListener<LogPublisherCfg> listener);



  /**
   * Lists the Log Retention Policies.
   *
   * @return Returns an array containing the names of the
   *         Log Retention Policies.
   */
  String[] listLogRetentionPolicies();



  /**
   * Gets the named Log Retention Policy.
   *
   * @param name
   *          The name of the Log Retention Policy to retrieve.
   * @return Returns the named Log Retention Policy.
   * @throws ConfigException
   *           If the Log Retention Policy could not be found or it
   *           could not be successfully decoded.
   */
  LogRetentionPolicyCfg getLogRetentionPolicy(String name) throws ConfigException;



  /**
   * Registers to be notified when new Log Retention Policies are added.
   *
   * @param listener
   *          The Log Retention Policy configuration add listener.
   * @throws ConfigException
   *          If the add listener could not be registered.
   */
  void addLogRetentionPolicyAddListener(ConfigurationAddListener<LogRetentionPolicyCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Log Retention Policy configuration add listener.
   *
   * @param listener
   *          The Log Retention Policy configuration add listener.
   */
  void removeLogRetentionPolicyAddListener(ConfigurationAddListener<LogRetentionPolicyCfg> listener);



  /**
   * Registers to be notified when existing Log Retention Policies are deleted.
   *
   * @param listener
   *          The Log Retention Policy configuration delete listener.
   * @throws ConfigException
   *          If the delete listener could not be registered.
   */
  void addLogRetentionPolicyDeleteListener(ConfigurationDeleteListener<LogRetentionPolicyCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Log Retention Policy configuration delete listener.
   *
   * @param listener
   *          The Log Retention Policy configuration delete listener.
   */
  void removeLogRetentionPolicyDeleteListener(ConfigurationDeleteListener<LogRetentionPolicyCfg> listener);



  /**
   * Lists the Log Rotation Policies.
   *
   * @return Returns an array containing the names of the
   *         Log Rotation Policies.
   */
  String[] listLogRotationPolicies();



  /**
   * Gets the named Log Rotation Policy.
   *
   * @param name
   *          The name of the Log Rotation Policy to retrieve.
   * @return Returns the named Log Rotation Policy.
   * @throws ConfigException
   *           If the Log Rotation Policy could not be found or it
   *           could not be successfully decoded.
   */
  LogRotationPolicyCfg getLogRotationPolicy(String name) throws ConfigException;



  /**
   * Registers to be notified when new Log Rotation Policies are added.
   *
   * @param listener
   *          The Log Rotation Policy configuration add listener.
   * @throws ConfigException
   *          If the add listener could not be registered.
   */
  void addLogRotationPolicyAddListener(ConfigurationAddListener<LogRotationPolicyCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Log Rotation Policy configuration add listener.
   *
   * @param listener
   *          The Log Rotation Policy configuration add listener.
   */
  void removeLogRotationPolicyAddListener(ConfigurationAddListener<LogRotationPolicyCfg> listener);



  /**
   * Registers to be notified when existing Log Rotation Policies are deleted.
   *
   * @param listener
   *          The Log Rotation Policy configuration delete listener.
   * @throws ConfigException
   *          If the delete listener could not be registered.
   */
  void addLogRotationPolicyDeleteListener(ConfigurationDeleteListener<LogRotationPolicyCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Log Rotation Policy configuration delete listener.
   *
   * @param listener
   *          The Log Rotation Policy configuration delete listener.
   */
  void removeLogRotationPolicyDeleteListener(ConfigurationDeleteListener<LogRotationPolicyCfg> listener);



  /**
   * Lists the Matching Rules.
   *
   * @return Returns an array containing the names of the
   *         Matching Rules.
   */
  String[] listMatchingRules();



  /**
   * Gets the named Matching Rule.
   *
   * @param name
   *          The name of the Matching Rule to retrieve.
   * @return Returns the named Matching Rule.
   * @throws ConfigException
   *           If the Matching Rule could not be found or it
   *           could not be successfully decoded.
   */
  MatchingRuleCfg getMatchingRule(String name) throws ConfigException;



  /**
   * Registers to be notified when new Matching Rules are added.
   *
   * @param listener
   *          The Matching Rule configuration add listener.
   * @throws ConfigException
   *          If the add listener could not be registered.
   */
  void addMatchingRuleAddListener(ConfigurationAddListener<MatchingRuleCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Matching Rule configuration add listener.
   *
   * @param listener
   *          The Matching Rule configuration add listener.
   */
  void removeMatchingRuleAddListener(ConfigurationAddListener<MatchingRuleCfg> listener);



  /**
   * Registers to be notified when existing Matching Rules are deleted.
   *
   * @param listener
   *          The Matching Rule configuration delete listener.
   * @throws ConfigException
   *          If the delete listener could not be registered.
   */
  void addMatchingRuleDeleteListener(ConfigurationDeleteListener<MatchingRuleCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Matching Rule configuration delete listener.
   *
   * @param listener
   *          The Matching Rule configuration delete listener.
   */
  void removeMatchingRuleDeleteListener(ConfigurationDeleteListener<MatchingRuleCfg> listener);



  /**
   * Lists the Monitor Providers.
   *
   * @return Returns an array containing the names of the
   *         Monitor Providers.
   */
  String[] listMonitorProviders();



  /**
   * Gets the named Monitor Provider.
   *
   * @param name
   *          The name of the Monitor Provider to retrieve.
   * @return Returns the named Monitor Provider.
   * @throws ConfigException
   *           If the Monitor Provider could not be found or it
   *           could not be successfully decoded.
   */
  MonitorProviderCfg getMonitorProvider(String name) throws ConfigException;



  /**
   * Registers to be notified when new Monitor Providers are added.
   *
   * @param listener
   *          The Monitor Provider configuration add listener.
   * @throws ConfigException
   *          If the add listener could not be registered.
   */
  void addMonitorProviderAddListener(ConfigurationAddListener<MonitorProviderCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Monitor Provider configuration add listener.
   *
   * @param listener
   *          The Monitor Provider configuration add listener.
   */
  void removeMonitorProviderAddListener(ConfigurationAddListener<MonitorProviderCfg> listener);



  /**
   * Registers to be notified when existing Monitor Providers are deleted.
   *
   * @param listener
   *          The Monitor Provider configuration delete listener.
   * @throws ConfigException
   *          If the delete listener could not be registered.
   */
  void addMonitorProviderDeleteListener(ConfigurationDeleteListener<MonitorProviderCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Monitor Provider configuration delete listener.
   *
   * @param listener
   *          The Monitor Provider configuration delete listener.
   */
  void removeMonitorProviderDeleteListener(ConfigurationDeleteListener<MonitorProviderCfg> listener);



  /**
   * Lists the Network Groups.
   *
   * @return Returns an array containing the names of the
   *         Network Groups.
   */
  String[] listNetworkGroups();



  /**
   * Gets the named Network Group.
   *
   * @param name
   *          The name of the Network Group to retrieve.
   * @return Returns the named Network Group.
   * @throws ConfigException
   *           If the Network Group could not be found or it
   *           could not be successfully decoded.
   */
  NetworkGroupCfg getNetworkGroup(String name) throws ConfigException;



  /**
   * Registers to be notified when new Network Groups are added.
   *
   * @param listener
   *          The Network Group configuration add listener.
   * @throws ConfigException
   *          If the add listener could not be registered.
   */
  void addNetworkGroupAddListener(ConfigurationAddListener<NetworkGroupCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Network Group configuration add listener.
   *
   * @param listener
   *          The Network Group configuration add listener.
   */
  void removeNetworkGroupAddListener(ConfigurationAddListener<NetworkGroupCfg> listener);



  /**
   * Registers to be notified when existing Network Groups are deleted.
   *
   * @param listener
   *          The Network Group configuration delete listener.
   * @throws ConfigException
   *          If the delete listener could not be registered.
   */
  void addNetworkGroupDeleteListener(ConfigurationDeleteListener<NetworkGroupCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Network Group configuration delete listener.
   *
   * @param listener
   *          The Network Group configuration delete listener.
   */
  void removeNetworkGroupDeleteListener(ConfigurationDeleteListener<NetworkGroupCfg> listener);



  /**
   * Lists the Password Generators.
   *
   * @return Returns an array containing the names of the
   *         Password Generators.
   */
  String[] listPasswordGenerators();



  /**
   * Gets the named Password Generator.
   *
   * @param name
   *          The name of the Password Generator to retrieve.
   * @return Returns the named Password Generator.
   * @throws ConfigException
   *           If the Password Generator could not be found or it
   *           could not be successfully decoded.
   */
  PasswordGeneratorCfg getPasswordGenerator(String name) throws ConfigException;



  /**
   * Registers to be notified when new Password Generators are added.
   *
   * @param listener
   *          The Password Generator configuration add listener.
   * @throws ConfigException
   *          If the add listener could not be registered.
   */
  void addPasswordGeneratorAddListener(ConfigurationAddListener<PasswordGeneratorCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Password Generator configuration add listener.
   *
   * @param listener
   *          The Password Generator configuration add listener.
   */
  void removePasswordGeneratorAddListener(ConfigurationAddListener<PasswordGeneratorCfg> listener);



  /**
   * Registers to be notified when existing Password Generators are deleted.
   *
   * @param listener
   *          The Password Generator configuration delete listener.
   * @throws ConfigException
   *          If the delete listener could not be registered.
   */
  void addPasswordGeneratorDeleteListener(ConfigurationDeleteListener<PasswordGeneratorCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Password Generator configuration delete listener.
   *
   * @param listener
   *          The Password Generator configuration delete listener.
   */
  void removePasswordGeneratorDeleteListener(ConfigurationDeleteListener<PasswordGeneratorCfg> listener);



  /**
   * Lists the Password Policies.
   *
   * @return Returns an array containing the names of the
   *         Password Policies.
   */
  String[] listPasswordPolicies();



  /**
   * Gets the named Password Policy.
   *
   * @param name
   *          The name of the Password Policy to retrieve.
   * @return Returns the named Password Policy.
   * @throws ConfigException
   *           If the Password Policy could not be found or it
   *           could not be successfully decoded.
   */
  PasswordPolicyCfg getPasswordPolicy(String name) throws ConfigException;



  /**
   * Registers to be notified when new Password Policies are added.
   *
   * @param listener
   *          The Password Policy configuration add listener.
   * @throws ConfigException
   *          If the add listener could not be registered.
   */
  void addPasswordPolicyAddListener(ConfigurationAddListener<PasswordPolicyCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Password Policy configuration add listener.
   *
   * @param listener
   *          The Password Policy configuration add listener.
   */
  void removePasswordPolicyAddListener(ConfigurationAddListener<PasswordPolicyCfg> listener);



  /**
   * Registers to be notified when existing Password Policies are deleted.
   *
   * @param listener
   *          The Password Policy configuration delete listener.
   * @throws ConfigException
   *          If the delete listener could not be registered.
   */
  void addPasswordPolicyDeleteListener(ConfigurationDeleteListener<PasswordPolicyCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Password Policy configuration delete listener.
   *
   * @param listener
   *          The Password Policy configuration delete listener.
   */
  void removePasswordPolicyDeleteListener(ConfigurationDeleteListener<PasswordPolicyCfg> listener);



  /**
   * Lists the Password Storage Schemes.
   *
   * @return Returns an array containing the names of the
   *         Password Storage Schemes.
   */
  String[] listPasswordStorageSchemes();



  /**
   * Gets the named Password Storage Scheme.
   *
   * @param name
   *          The name of the Password Storage Scheme to retrieve.
   * @return Returns the named Password Storage Scheme.
   * @throws ConfigException
   *           If the Password Storage Scheme could not be found or it
   *           could not be successfully decoded.
   */
  PasswordStorageSchemeCfg getPasswordStorageScheme(String name) throws ConfigException;



  /**
   * Registers to be notified when new Password Storage Schemes are added.
   *
   * @param listener
   *          The Password Storage Scheme configuration add listener.
   * @throws ConfigException
   *          If the add listener could not be registered.
   */
  void addPasswordStorageSchemeAddListener(ConfigurationAddListener<PasswordStorageSchemeCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Password Storage Scheme configuration add listener.
   *
   * @param listener
   *          The Password Storage Scheme configuration add listener.
   */
  void removePasswordStorageSchemeAddListener(ConfigurationAddListener<PasswordStorageSchemeCfg> listener);



  /**
   * Registers to be notified when existing Password Storage Schemes are deleted.
   *
   * @param listener
   *          The Password Storage Scheme configuration delete listener.
   * @throws ConfigException
   *          If the delete listener could not be registered.
   */
  void addPasswordStorageSchemeDeleteListener(ConfigurationDeleteListener<PasswordStorageSchemeCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Password Storage Scheme configuration delete listener.
   *
   * @param listener
   *          The Password Storage Scheme configuration delete listener.
   */
  void removePasswordStorageSchemeDeleteListener(ConfigurationDeleteListener<PasswordStorageSchemeCfg> listener);



  /**
   * Lists the Password Validators.
   *
   * @return Returns an array containing the names of the
   *         Password Validators.
   */
  String[] listPasswordValidators();



  /**
   * Gets the named Password Validator.
   *
   * @param name
   *          The name of the Password Validator to retrieve.
   * @return Returns the named Password Validator.
   * @throws ConfigException
   *           If the Password Validator could not be found or it
   *           could not be successfully decoded.
   */
  PasswordValidatorCfg getPasswordValidator(String name) throws ConfigException;



  /**
   * Registers to be notified when new Password Validators are added.
   *
   * @param listener
   *          The Password Validator configuration add listener.
   * @throws ConfigException
   *          If the add listener could not be registered.
   */
  void addPasswordValidatorAddListener(ConfigurationAddListener<PasswordValidatorCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Password Validator configuration add listener.
   *
   * @param listener
   *          The Password Validator configuration add listener.
   */
  void removePasswordValidatorAddListener(ConfigurationAddListener<PasswordValidatorCfg> listener);



  /**
   * Registers to be notified when existing Password Validators are deleted.
   *
   * @param listener
   *          The Password Validator configuration delete listener.
   * @throws ConfigException
   *          If the delete listener could not be registered.
   */
  void addPasswordValidatorDeleteListener(ConfigurationDeleteListener<PasswordValidatorCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Password Validator configuration delete listener.
   *
   * @param listener
   *          The Password Validator configuration delete listener.
   */
  void removePasswordValidatorDeleteListener(ConfigurationDeleteListener<PasswordValidatorCfg> listener);



  /**
   * Gets the Plugin Root.
   *
   * @return Returns the Plugin Root.
   * @throws ConfigException
   *           If the Plugin Root could not be found or it could not
   *           be successfully decoded.
   */
  PluginRootCfg getPluginRoot() throws ConfigException;



  /**
   * Gets the Root DN.
   *
   * @return Returns the Root DN.
   * @throws ConfigException
   *           If the Root DN could not be found or it could not
   *           be successfully decoded.
   */
  RootDNCfg getRootDN() throws ConfigException;



  /**
   * Gets the Root DSE Backend.
   *
   * @return Returns the Root DSE Backend.
   * @throws ConfigException
   *           If the Root DSE Backend could not be found or it could not
   *           be successfully decoded.
   */
  RootDSEBackendCfg getRootDSEBackend() throws ConfigException;



  /**
   * Lists the SASL Mechanism Handlers.
   *
   * @return Returns an array containing the names of the
   *         SASL Mechanism Handlers.
   */
  String[] listSASLMechanismHandlers();



  /**
   * Gets the named SASL Mechanism Handler.
   *
   * @param name
   *          The name of the SASL Mechanism Handler to retrieve.
   * @return Returns the named SASL Mechanism Handler.
   * @throws ConfigException
   *           If the SASL Mechanism Handler could not be found or it
   *           could not be successfully decoded.
   */
  SASLMechanismHandlerCfg getSASLMechanismHandler(String name) throws ConfigException;



  /**
   * Registers to be notified when new SASL Mechanism Handlers are added.
   *
   * @param listener
   *          The SASL Mechanism Handler configuration add listener.
   * @throws ConfigException
   *          If the add listener could not be registered.
   */
  void addSASLMechanismHandlerAddListener(ConfigurationAddListener<SASLMechanismHandlerCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing SASL Mechanism Handler configuration add listener.
   *
   * @param listener
   *          The SASL Mechanism Handler configuration add listener.
   */
  void removeSASLMechanismHandlerAddListener(ConfigurationAddListener<SASLMechanismHandlerCfg> listener);



  /**
   * Registers to be notified when existing SASL Mechanism Handlers are deleted.
   *
   * @param listener
   *          The SASL Mechanism Handler configuration delete listener.
   * @throws ConfigException
   *          If the delete listener could not be registered.
   */
  void addSASLMechanismHandlerDeleteListener(ConfigurationDeleteListener<SASLMechanismHandlerCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing SASL Mechanism Handler configuration delete listener.
   *
   * @param listener
   *          The SASL Mechanism Handler configuration delete listener.
   */
  void removeSASLMechanismHandlerDeleteListener(ConfigurationDeleteListener<SASLMechanismHandlerCfg> listener);



  /**
   * Lists the Synchronization Providers.
   *
   * @return Returns an array containing the names of the
   *         Synchronization Providers.
   */
  String[] listSynchronizationProviders();



  /**
   * Gets the named Synchronization Provider.
   *
   * @param name
   *          The name of the Synchronization Provider to retrieve.
   * @return Returns the named Synchronization Provider.
   * @throws ConfigException
   *           If the Synchronization Provider could not be found or it
   *           could not be successfully decoded.
   */
  SynchronizationProviderCfg getSynchronizationProvider(String name) throws ConfigException;



  /**
   * Registers to be notified when new Synchronization Providers are added.
   *
   * @param listener
   *          The Synchronization Provider configuration add listener.
   * @throws ConfigException
   *          If the add listener could not be registered.
   */
  void addSynchronizationProviderAddListener(ConfigurationAddListener<SynchronizationProviderCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Synchronization Provider configuration add listener.
   *
   * @param listener
   *          The Synchronization Provider configuration add listener.
   */
  void removeSynchronizationProviderAddListener(ConfigurationAddListener<SynchronizationProviderCfg> listener);



  /**
   * Registers to be notified when existing Synchronization Providers are deleted.
   *
   * @param listener
   *          The Synchronization Provider configuration delete listener.
   * @throws ConfigException
   *          If the delete listener could not be registered.
   */
  void addSynchronizationProviderDeleteListener(ConfigurationDeleteListener<SynchronizationProviderCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Synchronization Provider configuration delete listener.
   *
   * @param listener
   *          The Synchronization Provider configuration delete listener.
   */
  void removeSynchronizationProviderDeleteListener(ConfigurationDeleteListener<SynchronizationProviderCfg> listener);



  /**
   * Lists the Trust Manager Providers.
   *
   * @return Returns an array containing the names of the
   *         Trust Manager Providers.
   */
  String[] listTrustManagerProviders();



  /**
   * Gets the named Trust Manager Provider.
   *
   * @param name
   *          The name of the Trust Manager Provider to retrieve.
   * @return Returns the named Trust Manager Provider.
   * @throws ConfigException
   *           If the Trust Manager Provider could not be found or it
   *           could not be successfully decoded.
   */
  TrustManagerProviderCfg getTrustManagerProvider(String name) throws ConfigException;



  /**
   * Registers to be notified when new Trust Manager Providers are added.
   *
   * @param listener
   *          The Trust Manager Provider configuration add listener.
   * @throws ConfigException
   *          If the add listener could not be registered.
   */
  void addTrustManagerProviderAddListener(ConfigurationAddListener<TrustManagerProviderCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Trust Manager Provider configuration add listener.
   *
   * @param listener
   *          The Trust Manager Provider configuration add listener.
   */
  void removeTrustManagerProviderAddListener(ConfigurationAddListener<TrustManagerProviderCfg> listener);



  /**
   * Registers to be notified when existing Trust Manager Providers are deleted.
   *
   * @param listener
   *          The Trust Manager Provider configuration delete listener.
   * @throws ConfigException
   *          If the delete listener could not be registered.
   */
  void addTrustManagerProviderDeleteListener(ConfigurationDeleteListener<TrustManagerProviderCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Trust Manager Provider configuration delete listener.
   *
   * @param listener
   *          The Trust Manager Provider configuration delete listener.
   */
  void removeTrustManagerProviderDeleteListener(ConfigurationDeleteListener<TrustManagerProviderCfg> listener);



  /**
   * Lists the Virtual Attributes.
   *
   * @return Returns an array containing the names of the
   *         Virtual Attributes.
   */
  String[] listVirtualAttributes();



  /**
   * Gets the named Virtual Attribute.
   *
   * @param name
   *          The name of the Virtual Attribute to retrieve.
   * @return Returns the named Virtual Attribute.
   * @throws ConfigException
   *           If the Virtual Attribute could not be found or it
   *           could not be successfully decoded.
   */
  VirtualAttributeCfg getVirtualAttribute(String name) throws ConfigException;



  /**
   * Registers to be notified when new Virtual Attributes are added.
   *
   * @param listener
   *          The Virtual Attribute configuration add listener.
   * @throws ConfigException
   *          If the add listener could not be registered.
   */
  void addVirtualAttributeAddListener(ConfigurationAddListener<VirtualAttributeCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Virtual Attribute configuration add listener.
   *
   * @param listener
   *          The Virtual Attribute configuration add listener.
   */
  void removeVirtualAttributeAddListener(ConfigurationAddListener<VirtualAttributeCfg> listener);



  /**
   * Registers to be notified when existing Virtual Attributes are deleted.
   *
   * @param listener
   *          The Virtual Attribute configuration delete listener.
   * @throws ConfigException
   *          If the delete listener could not be registered.
   */
  void addVirtualAttributeDeleteListener(ConfigurationDeleteListener<VirtualAttributeCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Virtual Attribute configuration delete listener.
   *
   * @param listener
   *          The Virtual Attribute configuration delete listener.
   */
  void removeVirtualAttributeDeleteListener(ConfigurationDeleteListener<VirtualAttributeCfg> listener);



  /**
   * Lists the Workflows.
   *
   * @return Returns an array containing the names of the
   *         Workflows.
   */
  String[] listWorkflows();



  /**
   * Gets the named Workflow.
   *
   * @param name
   *          The name of the Workflow to retrieve.
   * @return Returns the named Workflow.
   * @throws ConfigException
   *           If the Workflow could not be found or it
   *           could not be successfully decoded.
   */
  WorkflowCfg getWorkflow(String name) throws ConfigException;



  /**
   * Registers to be notified when new Workflows are added.
   *
   * @param listener
   *          The Workflow configuration add listener.
   * @throws ConfigException
   *          If the add listener could not be registered.
   */
  void addWorkflowAddListener(ConfigurationAddListener<WorkflowCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Workflow configuration add listener.
   *
   * @param listener
   *          The Workflow configuration add listener.
   */
  void removeWorkflowAddListener(ConfigurationAddListener<WorkflowCfg> listener);



  /**
   * Registers to be notified when existing Workflows are deleted.
   *
   * @param listener
   *          The Workflow configuration delete listener.
   * @throws ConfigException
   *          If the delete listener could not be registered.
   */
  void addWorkflowDeleteListener(ConfigurationDeleteListener<WorkflowCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Workflow configuration delete listener.
   *
   * @param listener
   *          The Workflow configuration delete listener.
   */
  void removeWorkflowDeleteListener(ConfigurationDeleteListener<WorkflowCfg> listener);



  /**
   * Lists the Workflow Elements.
   *
   * @return Returns an array containing the names of the
   *         Workflow Elements.
   */
  String[] listWorkflowElements();



  /**
   * Gets the named Workflow Element.
   *
   * @param name
   *          The name of the Workflow Element to retrieve.
   * @return Returns the named Workflow Element.
   * @throws ConfigException
   *           If the Workflow Element could not be found or it
   *           could not be successfully decoded.
   */
  WorkflowElementCfg getWorkflowElement(String name) throws ConfigException;



  /**
   * Registers to be notified when new Workflow Elements are added.
   *
   * @param listener
   *          The Workflow Element configuration add listener.
   * @throws ConfigException
   *          If the add listener could not be registered.
   */
  void addWorkflowElementAddListener(ConfigurationAddListener<WorkflowElementCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Workflow Element configuration add listener.
   *
   * @param listener
   *          The Workflow Element configuration add listener.
   */
  void removeWorkflowElementAddListener(ConfigurationAddListener<WorkflowElementCfg> listener);



  /**
   * Registers to be notified when existing Workflow Elements are deleted.
   *
   * @param listener
   *          The Workflow Element configuration delete listener.
   * @throws ConfigException
   *          If the delete listener could not be registered.
   */
  void addWorkflowElementDeleteListener(ConfigurationDeleteListener<WorkflowElementCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Workflow Element configuration delete listener.
   *
   * @param listener
   *          The Workflow Element configuration delete listener.
   */
  void removeWorkflowElementDeleteListener(ConfigurationDeleteListener<WorkflowElementCfg> listener);



  /**
   * Gets the Work Queue.
   *
   * @return Returns the Work Queue.
   * @throws ConfigException
   *           If the Work Queue could not be found or it could not
   *           be successfully decoded.
   */
  WorkQueueCfg getWorkQueue() throws ConfigException;

}
