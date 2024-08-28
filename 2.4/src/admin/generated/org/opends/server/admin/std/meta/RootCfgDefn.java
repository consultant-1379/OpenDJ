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
package org.opends.server.admin.std.meta;



import java.util.Collection;
import org.opends.server.admin.client.AuthorizationException;
import org.opends.server.admin.client.CommunicationException;
import org.opends.server.admin.client.ConcurrentModificationException;
import org.opends.server.admin.client.IllegalManagedObjectNameException;
import org.opends.server.admin.client.ManagedObject;
import org.opends.server.admin.client.ManagedObjectDecodingException;
import org.opends.server.admin.client.MissingMandatoryPropertiesException;
import org.opends.server.admin.client.OperationRejectedException;
import org.opends.server.admin.DefaultBehaviorException;
import org.opends.server.admin.DefinitionDecodingException;
import org.opends.server.admin.InstantiableRelationDefinition;
import org.opends.server.admin.ManagedObjectAlreadyExistsException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.ManagedObjectNotFoundException;
import org.opends.server.admin.PropertyProvider;
import org.opends.server.admin.server.ConfigurationAddListener;
import org.opends.server.admin.server.ConfigurationDeleteListener;
import org.opends.server.admin.server.ServerManagedObject;
import org.opends.server.admin.SingletonRelationDefinition;
import org.opends.server.admin.std.client.AccessControlHandlerCfgClient;
import org.opends.server.admin.std.client.AccountStatusNotificationHandlerCfgClient;
import org.opends.server.admin.std.client.AdministrationConnectorCfgClient;
import org.opends.server.admin.std.client.AlertHandlerCfgClient;
import org.opends.server.admin.std.client.AttributeSyntaxCfgClient;
import org.opends.server.admin.std.client.BackendCfgClient;
import org.opends.server.admin.std.client.CertificateMapperCfgClient;
import org.opends.server.admin.std.client.ConnectionHandlerCfgClient;
import org.opends.server.admin.std.client.CryptoManagerCfgClient;
import org.opends.server.admin.std.client.EntryCacheCfgClient;
import org.opends.server.admin.std.client.ExtendedOperationHandlerCfgClient;
import org.opends.server.admin.std.client.ExtensionCfgClient;
import org.opends.server.admin.std.client.GlobalCfgClient;
import org.opends.server.admin.std.client.GroupImplementationCfgClient;
import org.opends.server.admin.std.client.IdentityMapperCfgClient;
import org.opends.server.admin.std.client.KeyManagerProviderCfgClient;
import org.opends.server.admin.std.client.LogPublisherCfgClient;
import org.opends.server.admin.std.client.LogRetentionPolicyCfgClient;
import org.opends.server.admin.std.client.LogRotationPolicyCfgClient;
import org.opends.server.admin.std.client.MatchingRuleCfgClient;
import org.opends.server.admin.std.client.MonitorProviderCfgClient;
import org.opends.server.admin.std.client.NetworkGroupCfgClient;
import org.opends.server.admin.std.client.PasswordGeneratorCfgClient;
import org.opends.server.admin.std.client.PasswordPolicyCfgClient;
import org.opends.server.admin.std.client.PasswordStorageSchemeCfgClient;
import org.opends.server.admin.std.client.PasswordValidatorCfgClient;
import org.opends.server.admin.std.client.PluginRootCfgClient;
import org.opends.server.admin.std.client.RootCfgClient;
import org.opends.server.admin.std.client.RootDNCfgClient;
import org.opends.server.admin.std.client.RootDSEBackendCfgClient;
import org.opends.server.admin.std.client.SASLMechanismHandlerCfgClient;
import org.opends.server.admin.std.client.SynchronizationProviderCfgClient;
import org.opends.server.admin.std.client.TrustManagerProviderCfgClient;
import org.opends.server.admin.std.client.VirtualAttributeCfgClient;
import org.opends.server.admin.std.client.WorkflowCfgClient;
import org.opends.server.admin.std.client.WorkflowElementCfgClient;
import org.opends.server.admin.std.client.WorkQueueCfgClient;
import org.opends.server.admin.std.server.AccessControlHandlerCfg;
import org.opends.server.admin.std.server.AccountStatusNotificationHandlerCfg;
import org.opends.server.admin.std.server.AdministrationConnectorCfg;
import org.opends.server.admin.std.server.AlertHandlerCfg;
import org.opends.server.admin.std.server.AttributeSyntaxCfg;
import org.opends.server.admin.std.server.BackendCfg;
import org.opends.server.admin.std.server.CertificateMapperCfg;
import org.opends.server.admin.std.server.ConnectionHandlerCfg;
import org.opends.server.admin.std.server.CryptoManagerCfg;
import org.opends.server.admin.std.server.EntryCacheCfg;
import org.opends.server.admin.std.server.ExtendedOperationHandlerCfg;
import org.opends.server.admin.std.server.ExtensionCfg;
import org.opends.server.admin.std.server.GlobalCfg;
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
import org.opends.server.admin.std.server.PluginRootCfg;
import org.opends.server.admin.std.server.RootCfg;
import org.opends.server.admin.std.server.RootDNCfg;
import org.opends.server.admin.std.server.RootDSEBackendCfg;
import org.opends.server.admin.std.server.SASLMechanismHandlerCfg;
import org.opends.server.admin.std.server.SynchronizationProviderCfg;
import org.opends.server.admin.std.server.TrustManagerProviderCfg;
import org.opends.server.admin.std.server.VirtualAttributeCfg;
import org.opends.server.admin.std.server.WorkflowCfg;
import org.opends.server.admin.std.server.WorkflowElementCfg;
import org.opends.server.admin.std.server.WorkQueueCfg;
import org.opends.server.admin.Tag;
import org.opends.server.admin.TopCfgDefn;
import org.opends.server.config.ConfigException;
import org.opends.server.types.DN;



/**
 * An interface for querying the Root managed object definition meta
 * information.
 * <p>
 * The root configuration provides an entry point to the rest of the
 * OpenDS Directory Server configuration.
 */
public final class RootCfgDefn extends ManagedObjectDefinition<RootCfgClient, RootCfg> {

  // The singleton configuration definition instance.
  private static final RootCfgDefn INSTANCE = new RootCfgDefn();



  // Define managed object tags.
  static {
    Tag.define("core-server");
    Tag.define("database");
    Tag.define("logging");
    Tag.define("replication");
    Tag.define("security");
    Tag.define("user-management");
  }



  // The "access-control-handler" relation definition.
  private static final SingletonRelationDefinition<AccessControlHandlerCfgClient, AccessControlHandlerCfg> RD_ACCESS_CONTROL_HANDLER;



  // The "account-status-notification-handlers" relation definition.
  private static final InstantiableRelationDefinition<AccountStatusNotificationHandlerCfgClient, AccountStatusNotificationHandlerCfg> RD_ACCOUNT_STATUS_NOTIFICATION_HANDLERS;



  // The "administration-connector" relation definition.
  private static final SingletonRelationDefinition<AdministrationConnectorCfgClient, AdministrationConnectorCfg> RD_ADMINISTRATION_CONNECTOR;



  // The "alert-handlers" relation definition.
  private static final InstantiableRelationDefinition<AlertHandlerCfgClient, AlertHandlerCfg> RD_ALERT_HANDLERS;



  // The "attribute-syntaxes" relation definition.
  private static final InstantiableRelationDefinition<AttributeSyntaxCfgClient, AttributeSyntaxCfg> RD_ATTRIBUTE_SYNTAXES;



  // The "backends" relation definition.
  private static final InstantiableRelationDefinition<BackendCfgClient, BackendCfg> RD_BACKENDS;



  // The "certificate-mappers" relation definition.
  private static final InstantiableRelationDefinition<CertificateMapperCfgClient, CertificateMapperCfg> RD_CERTIFICATE_MAPPERS;



  // The "connection-handlers" relation definition.
  private static final InstantiableRelationDefinition<ConnectionHandlerCfgClient, ConnectionHandlerCfg> RD_CONNECTION_HANDLERS;



  // The "crypto-manager" relation definition.
  private static final SingletonRelationDefinition<CryptoManagerCfgClient, CryptoManagerCfg> RD_CRYPTO_MANAGER;



  // The "entry-caches" relation definition.
  private static final InstantiableRelationDefinition<EntryCacheCfgClient, EntryCacheCfg> RD_ENTRY_CACHES;



  // The "extended-operation-handlers" relation definition.
  private static final InstantiableRelationDefinition<ExtendedOperationHandlerCfgClient, ExtendedOperationHandlerCfg> RD_EXTENDED_OPERATION_HANDLERS;



  // The "extensions" relation definition.
  private static final InstantiableRelationDefinition<ExtensionCfgClient, ExtensionCfg> RD_EXTENSIONS;



  // The "global-configuration" relation definition.
  private static final SingletonRelationDefinition<GlobalCfgClient, GlobalCfg> RD_GLOBAL_CONFIGURATION;



  // The "group-implementations" relation definition.
  private static final InstantiableRelationDefinition<GroupImplementationCfgClient, GroupImplementationCfg> RD_GROUP_IMPLEMENTATIONS;



  // The "identity-mappers" relation definition.
  private static final InstantiableRelationDefinition<IdentityMapperCfgClient, IdentityMapperCfg> RD_IDENTITY_MAPPERS;



  // The "key-manager-providers" relation definition.
  private static final InstantiableRelationDefinition<KeyManagerProviderCfgClient, KeyManagerProviderCfg> RD_KEY_MANAGER_PROVIDERS;



  // The "log-publishers" relation definition.
  private static final InstantiableRelationDefinition<LogPublisherCfgClient, LogPublisherCfg> RD_LOG_PUBLISHERS;



  // The "log-retention-policies" relation definition.
  private static final InstantiableRelationDefinition<LogRetentionPolicyCfgClient, LogRetentionPolicyCfg> RD_LOG_RETENTION_POLICIES;



  // The "log-rotation-policies" relation definition.
  private static final InstantiableRelationDefinition<LogRotationPolicyCfgClient, LogRotationPolicyCfg> RD_LOG_ROTATION_POLICIES;



  // The "matching-rules" relation definition.
  private static final InstantiableRelationDefinition<MatchingRuleCfgClient, MatchingRuleCfg> RD_MATCHING_RULES;



  // The "monitor-providers" relation definition.
  private static final InstantiableRelationDefinition<MonitorProviderCfgClient, MonitorProviderCfg> RD_MONITOR_PROVIDERS;



  // The "network-groups" relation definition.
  private static final InstantiableRelationDefinition<NetworkGroupCfgClient, NetworkGroupCfg> RD_NETWORK_GROUPS;



  // The "password-generators" relation definition.
  private static final InstantiableRelationDefinition<PasswordGeneratorCfgClient, PasswordGeneratorCfg> RD_PASSWORD_GENERATORS;



  // The "password-policies" relation definition.
  private static final InstantiableRelationDefinition<PasswordPolicyCfgClient, PasswordPolicyCfg> RD_PASSWORD_POLICIES;



  // The "password-storage-schemes" relation definition.
  private static final InstantiableRelationDefinition<PasswordStorageSchemeCfgClient, PasswordStorageSchemeCfg> RD_PASSWORD_STORAGE_SCHEMES;



  // The "password-validators" relation definition.
  private static final InstantiableRelationDefinition<PasswordValidatorCfgClient, PasswordValidatorCfg> RD_PASSWORD_VALIDATORS;



  // The "plugin-root" relation definition.
  private static final SingletonRelationDefinition<PluginRootCfgClient, PluginRootCfg> RD_PLUGIN_ROOT;



  // The "root-dn" relation definition.
  private static final SingletonRelationDefinition<RootDNCfgClient, RootDNCfg> RD_ROOT_DN;



  // The "root-dse-backend" relation definition.
  private static final SingletonRelationDefinition<RootDSEBackendCfgClient, RootDSEBackendCfg> RD_ROOT_DSE_BACKEND;



  // The "sasl-mechanism-handlers" relation definition.
  private static final InstantiableRelationDefinition<SASLMechanismHandlerCfgClient, SASLMechanismHandlerCfg> RD_SASL_MECHANISM_HANDLERS;



  // The "synchronization-providers" relation definition.
  private static final InstantiableRelationDefinition<SynchronizationProviderCfgClient, SynchronizationProviderCfg> RD_SYNCHRONIZATION_PROVIDERS;



  // The "trust-manager-providers" relation definition.
  private static final InstantiableRelationDefinition<TrustManagerProviderCfgClient, TrustManagerProviderCfg> RD_TRUST_MANAGER_PROVIDERS;



  // The "virtual-attributes" relation definition.
  private static final InstantiableRelationDefinition<VirtualAttributeCfgClient, VirtualAttributeCfg> RD_VIRTUAL_ATTRIBUTES;



  // The "workflows" relation definition.
  private static final InstantiableRelationDefinition<WorkflowCfgClient, WorkflowCfg> RD_WORKFLOWS;



  // The "workflow-elements" relation definition.
  private static final InstantiableRelationDefinition<WorkflowElementCfgClient, WorkflowElementCfg> RD_WORKFLOW_ELEMENTS;



  // The "work-queue" relation definition.
  private static final SingletonRelationDefinition<WorkQueueCfgClient, WorkQueueCfg> RD_WORK_QUEUE;



  // Build the "access-control-handler" relation definition.
  static {
    SingletonRelationDefinition.Builder<AccessControlHandlerCfgClient, AccessControlHandlerCfg> builder =
      new SingletonRelationDefinition.Builder<AccessControlHandlerCfgClient, AccessControlHandlerCfg>(INSTANCE, "access-control-handler", AccessControlHandlerCfgDefn.getInstance());
    RD_ACCESS_CONTROL_HANDLER = builder.getInstance();
    INSTANCE.registerRelationDefinition(RD_ACCESS_CONTROL_HANDLER);
  }



  // Build the "account-status-notification-handlers" relation definition.
  static {
    InstantiableRelationDefinition.Builder<AccountStatusNotificationHandlerCfgClient, AccountStatusNotificationHandlerCfg> builder =
      new InstantiableRelationDefinition.Builder<AccountStatusNotificationHandlerCfgClient, AccountStatusNotificationHandlerCfg>(INSTANCE, "account-status-notification-handler", "account-status-notification-handlers", AccountStatusNotificationHandlerCfgDefn.getInstance());
    RD_ACCOUNT_STATUS_NOTIFICATION_HANDLERS = builder.getInstance();
    INSTANCE.registerRelationDefinition(RD_ACCOUNT_STATUS_NOTIFICATION_HANDLERS);
  }



  // Build the "administration-connector" relation definition.
  static {
    SingletonRelationDefinition.Builder<AdministrationConnectorCfgClient, AdministrationConnectorCfg> builder =
      new SingletonRelationDefinition.Builder<AdministrationConnectorCfgClient, AdministrationConnectorCfg>(INSTANCE, "administration-connector", AdministrationConnectorCfgDefn.getInstance());
    RD_ADMINISTRATION_CONNECTOR = builder.getInstance();
    INSTANCE.registerRelationDefinition(RD_ADMINISTRATION_CONNECTOR);
  }



  // Build the "alert-handlers" relation definition.
  static {
    InstantiableRelationDefinition.Builder<AlertHandlerCfgClient, AlertHandlerCfg> builder =
      new InstantiableRelationDefinition.Builder<AlertHandlerCfgClient, AlertHandlerCfg>(INSTANCE, "alert-handler", "alert-handlers", AlertHandlerCfgDefn.getInstance());
    RD_ALERT_HANDLERS = builder.getInstance();
    INSTANCE.registerRelationDefinition(RD_ALERT_HANDLERS);
  }



  // Build the "attribute-syntaxes" relation definition.
  static {
    InstantiableRelationDefinition.Builder<AttributeSyntaxCfgClient, AttributeSyntaxCfg> builder =
      new InstantiableRelationDefinition.Builder<AttributeSyntaxCfgClient, AttributeSyntaxCfg>(INSTANCE, "attribute-syntax", "attribute-syntaxes", AttributeSyntaxCfgDefn.getInstance());
    RD_ATTRIBUTE_SYNTAXES = builder.getInstance();
    INSTANCE.registerRelationDefinition(RD_ATTRIBUTE_SYNTAXES);
  }



  // Build the "backends" relation definition.
  static {
    InstantiableRelationDefinition.Builder<BackendCfgClient, BackendCfg> builder =
      new InstantiableRelationDefinition.Builder<BackendCfgClient, BackendCfg>(INSTANCE, "backend", "backends", BackendCfgDefn.getInstance());
    builder.setNamingProperty(BackendCfgDefn.getInstance().getBackendIdPropertyDefinition());
    RD_BACKENDS = builder.getInstance();
    INSTANCE.registerRelationDefinition(RD_BACKENDS);
  }



  // Build the "certificate-mappers" relation definition.
  static {
    InstantiableRelationDefinition.Builder<CertificateMapperCfgClient, CertificateMapperCfg> builder =
      new InstantiableRelationDefinition.Builder<CertificateMapperCfgClient, CertificateMapperCfg>(INSTANCE, "certificate-mapper", "certificate-mappers", CertificateMapperCfgDefn.getInstance());
    RD_CERTIFICATE_MAPPERS = builder.getInstance();
    INSTANCE.registerRelationDefinition(RD_CERTIFICATE_MAPPERS);
  }



  // Build the "connection-handlers" relation definition.
  static {
    InstantiableRelationDefinition.Builder<ConnectionHandlerCfgClient, ConnectionHandlerCfg> builder =
      new InstantiableRelationDefinition.Builder<ConnectionHandlerCfgClient, ConnectionHandlerCfg>(INSTANCE, "connection-handler", "connection-handlers", ConnectionHandlerCfgDefn.getInstance());
    RD_CONNECTION_HANDLERS = builder.getInstance();
    INSTANCE.registerRelationDefinition(RD_CONNECTION_HANDLERS);
  }



  // Build the "crypto-manager" relation definition.
  static {
    SingletonRelationDefinition.Builder<CryptoManagerCfgClient, CryptoManagerCfg> builder =
      new SingletonRelationDefinition.Builder<CryptoManagerCfgClient, CryptoManagerCfg>(INSTANCE, "crypto-manager", CryptoManagerCfgDefn.getInstance());
    RD_CRYPTO_MANAGER = builder.getInstance();
    INSTANCE.registerRelationDefinition(RD_CRYPTO_MANAGER);
  }



  // Build the "entry-caches" relation definition.
  static {
    InstantiableRelationDefinition.Builder<EntryCacheCfgClient, EntryCacheCfg> builder =
      new InstantiableRelationDefinition.Builder<EntryCacheCfgClient, EntryCacheCfg>(INSTANCE, "entry-cache", "entry-caches", EntryCacheCfgDefn.getInstance());
    RD_ENTRY_CACHES = builder.getInstance();
    INSTANCE.registerRelationDefinition(RD_ENTRY_CACHES);
  }



  // Build the "extended-operation-handlers" relation definition.
  static {
    InstantiableRelationDefinition.Builder<ExtendedOperationHandlerCfgClient, ExtendedOperationHandlerCfg> builder =
      new InstantiableRelationDefinition.Builder<ExtendedOperationHandlerCfgClient, ExtendedOperationHandlerCfg>(INSTANCE, "extended-operation-handler", "extended-operation-handlers", ExtendedOperationHandlerCfgDefn.getInstance());
    RD_EXTENDED_OPERATION_HANDLERS = builder.getInstance();
    INSTANCE.registerRelationDefinition(RD_EXTENDED_OPERATION_HANDLERS);
  }



  // Build the "extensions" relation definition.
  static {
    InstantiableRelationDefinition.Builder<ExtensionCfgClient, ExtensionCfg> builder =
      new InstantiableRelationDefinition.Builder<ExtensionCfgClient, ExtensionCfg>(INSTANCE, "extension", "extensions", ExtensionCfgDefn.getInstance());
    RD_EXTENSIONS = builder.getInstance();
    INSTANCE.registerRelationDefinition(RD_EXTENSIONS);
  }



  // Build the "global-configuration" relation definition.
  static {
    SingletonRelationDefinition.Builder<GlobalCfgClient, GlobalCfg> builder =
      new SingletonRelationDefinition.Builder<GlobalCfgClient, GlobalCfg>(INSTANCE, "global-configuration", GlobalCfgDefn.getInstance());
    RD_GLOBAL_CONFIGURATION = builder.getInstance();
    INSTANCE.registerRelationDefinition(RD_GLOBAL_CONFIGURATION);
  }



  // Build the "group-implementations" relation definition.
  static {
    InstantiableRelationDefinition.Builder<GroupImplementationCfgClient, GroupImplementationCfg> builder =
      new InstantiableRelationDefinition.Builder<GroupImplementationCfgClient, GroupImplementationCfg>(INSTANCE, "group-implementation", "group-implementations", GroupImplementationCfgDefn.getInstance());
    RD_GROUP_IMPLEMENTATIONS = builder.getInstance();
    INSTANCE.registerRelationDefinition(RD_GROUP_IMPLEMENTATIONS);
  }



  // Build the "identity-mappers" relation definition.
  static {
    InstantiableRelationDefinition.Builder<IdentityMapperCfgClient, IdentityMapperCfg> builder =
      new InstantiableRelationDefinition.Builder<IdentityMapperCfgClient, IdentityMapperCfg>(INSTANCE, "identity-mapper", "identity-mappers", IdentityMapperCfgDefn.getInstance());
    RD_IDENTITY_MAPPERS = builder.getInstance();
    INSTANCE.registerRelationDefinition(RD_IDENTITY_MAPPERS);
  }



  // Build the "key-manager-providers" relation definition.
  static {
    InstantiableRelationDefinition.Builder<KeyManagerProviderCfgClient, KeyManagerProviderCfg> builder =
      new InstantiableRelationDefinition.Builder<KeyManagerProviderCfgClient, KeyManagerProviderCfg>(INSTANCE, "key-manager-provider", "key-manager-providers", KeyManagerProviderCfgDefn.getInstance());
    RD_KEY_MANAGER_PROVIDERS = builder.getInstance();
    INSTANCE.registerRelationDefinition(RD_KEY_MANAGER_PROVIDERS);
  }



  // Build the "log-publishers" relation definition.
  static {
    InstantiableRelationDefinition.Builder<LogPublisherCfgClient, LogPublisherCfg> builder =
      new InstantiableRelationDefinition.Builder<LogPublisherCfgClient, LogPublisherCfg>(INSTANCE, "log-publisher", "log-publishers", LogPublisherCfgDefn.getInstance());
    RD_LOG_PUBLISHERS = builder.getInstance();
    INSTANCE.registerRelationDefinition(RD_LOG_PUBLISHERS);
  }



  // Build the "log-retention-policies" relation definition.
  static {
    InstantiableRelationDefinition.Builder<LogRetentionPolicyCfgClient, LogRetentionPolicyCfg> builder =
      new InstantiableRelationDefinition.Builder<LogRetentionPolicyCfgClient, LogRetentionPolicyCfg>(INSTANCE, "log-retention-policy", "log-retention-policies", LogRetentionPolicyCfgDefn.getInstance());
    RD_LOG_RETENTION_POLICIES = builder.getInstance();
    INSTANCE.registerRelationDefinition(RD_LOG_RETENTION_POLICIES);
  }



  // Build the "log-rotation-policies" relation definition.
  static {
    InstantiableRelationDefinition.Builder<LogRotationPolicyCfgClient, LogRotationPolicyCfg> builder =
      new InstantiableRelationDefinition.Builder<LogRotationPolicyCfgClient, LogRotationPolicyCfg>(INSTANCE, "log-rotation-policy", "log-rotation-policies", LogRotationPolicyCfgDefn.getInstance());
    RD_LOG_ROTATION_POLICIES = builder.getInstance();
    INSTANCE.registerRelationDefinition(RD_LOG_ROTATION_POLICIES);
  }



  // Build the "matching-rules" relation definition.
  static {
    InstantiableRelationDefinition.Builder<MatchingRuleCfgClient, MatchingRuleCfg> builder =
      new InstantiableRelationDefinition.Builder<MatchingRuleCfgClient, MatchingRuleCfg>(INSTANCE, "matching-rule", "matching-rules", MatchingRuleCfgDefn.getInstance());
    RD_MATCHING_RULES = builder.getInstance();
    INSTANCE.registerRelationDefinition(RD_MATCHING_RULES);
  }



  // Build the "monitor-providers" relation definition.
  static {
    InstantiableRelationDefinition.Builder<MonitorProviderCfgClient, MonitorProviderCfg> builder =
      new InstantiableRelationDefinition.Builder<MonitorProviderCfgClient, MonitorProviderCfg>(INSTANCE, "monitor-provider", "monitor-providers", MonitorProviderCfgDefn.getInstance());
    RD_MONITOR_PROVIDERS = builder.getInstance();
    INSTANCE.registerRelationDefinition(RD_MONITOR_PROVIDERS);
  }



  // Build the "network-groups" relation definition.
  static {
    InstantiableRelationDefinition.Builder<NetworkGroupCfgClient, NetworkGroupCfg> builder =
      new InstantiableRelationDefinition.Builder<NetworkGroupCfgClient, NetworkGroupCfg>(INSTANCE, "network-group", "network-groups", NetworkGroupCfgDefn.getInstance());
    RD_NETWORK_GROUPS = builder.getInstance();
    INSTANCE.registerRelationDefinition(RD_NETWORK_GROUPS);
  }



  // Build the "password-generators" relation definition.
  static {
    InstantiableRelationDefinition.Builder<PasswordGeneratorCfgClient, PasswordGeneratorCfg> builder =
      new InstantiableRelationDefinition.Builder<PasswordGeneratorCfgClient, PasswordGeneratorCfg>(INSTANCE, "password-generator", "password-generators", PasswordGeneratorCfgDefn.getInstance());
    RD_PASSWORD_GENERATORS = builder.getInstance();
    INSTANCE.registerRelationDefinition(RD_PASSWORD_GENERATORS);
  }



  // Build the "password-policies" relation definition.
  static {
    InstantiableRelationDefinition.Builder<PasswordPolicyCfgClient, PasswordPolicyCfg> builder =
      new InstantiableRelationDefinition.Builder<PasswordPolicyCfgClient, PasswordPolicyCfg>(INSTANCE, "password-policy", "password-policies", PasswordPolicyCfgDefn.getInstance());
    RD_PASSWORD_POLICIES = builder.getInstance();
    INSTANCE.registerRelationDefinition(RD_PASSWORD_POLICIES);
  }



  // Build the "password-storage-schemes" relation definition.
  static {
    InstantiableRelationDefinition.Builder<PasswordStorageSchemeCfgClient, PasswordStorageSchemeCfg> builder =
      new InstantiableRelationDefinition.Builder<PasswordStorageSchemeCfgClient, PasswordStorageSchemeCfg>(INSTANCE, "password-storage-scheme", "password-storage-schemes", PasswordStorageSchemeCfgDefn.getInstance());
    RD_PASSWORD_STORAGE_SCHEMES = builder.getInstance();
    INSTANCE.registerRelationDefinition(RD_PASSWORD_STORAGE_SCHEMES);
  }



  // Build the "password-validators" relation definition.
  static {
    InstantiableRelationDefinition.Builder<PasswordValidatorCfgClient, PasswordValidatorCfg> builder =
      new InstantiableRelationDefinition.Builder<PasswordValidatorCfgClient, PasswordValidatorCfg>(INSTANCE, "password-validator", "password-validators", PasswordValidatorCfgDefn.getInstance());
    RD_PASSWORD_VALIDATORS = builder.getInstance();
    INSTANCE.registerRelationDefinition(RD_PASSWORD_VALIDATORS);
  }



  // Build the "plugin-root" relation definition.
  static {
    SingletonRelationDefinition.Builder<PluginRootCfgClient, PluginRootCfg> builder =
      new SingletonRelationDefinition.Builder<PluginRootCfgClient, PluginRootCfg>(INSTANCE, "plugin-root", PluginRootCfgDefn.getInstance());
    RD_PLUGIN_ROOT = builder.getInstance();
    INSTANCE.registerRelationDefinition(RD_PLUGIN_ROOT);
  }



  // Build the "root-dn" relation definition.
  static {
    SingletonRelationDefinition.Builder<RootDNCfgClient, RootDNCfg> builder =
      new SingletonRelationDefinition.Builder<RootDNCfgClient, RootDNCfg>(INSTANCE, "root-dn", RootDNCfgDefn.getInstance());
    RD_ROOT_DN = builder.getInstance();
    INSTANCE.registerRelationDefinition(RD_ROOT_DN);
  }



  // Build the "root-dse-backend" relation definition.
  static {
    SingletonRelationDefinition.Builder<RootDSEBackendCfgClient, RootDSEBackendCfg> builder =
      new SingletonRelationDefinition.Builder<RootDSEBackendCfgClient, RootDSEBackendCfg>(INSTANCE, "root-dse-backend", RootDSEBackendCfgDefn.getInstance());
    RD_ROOT_DSE_BACKEND = builder.getInstance();
    INSTANCE.registerRelationDefinition(RD_ROOT_DSE_BACKEND);
  }



  // Build the "sasl-mechanism-handlers" relation definition.
  static {
    InstantiableRelationDefinition.Builder<SASLMechanismHandlerCfgClient, SASLMechanismHandlerCfg> builder =
      new InstantiableRelationDefinition.Builder<SASLMechanismHandlerCfgClient, SASLMechanismHandlerCfg>(INSTANCE, "sasl-mechanism-handler", "sasl-mechanism-handlers", SASLMechanismHandlerCfgDefn.getInstance());
    RD_SASL_MECHANISM_HANDLERS = builder.getInstance();
    INSTANCE.registerRelationDefinition(RD_SASL_MECHANISM_HANDLERS);
  }



  // Build the "synchronization-providers" relation definition.
  static {
    InstantiableRelationDefinition.Builder<SynchronizationProviderCfgClient, SynchronizationProviderCfg> builder =
      new InstantiableRelationDefinition.Builder<SynchronizationProviderCfgClient, SynchronizationProviderCfg>(INSTANCE, "synchronization-provider", "synchronization-providers", SynchronizationProviderCfgDefn.getInstance());
    RD_SYNCHRONIZATION_PROVIDERS = builder.getInstance();
    INSTANCE.registerRelationDefinition(RD_SYNCHRONIZATION_PROVIDERS);
  }



  // Build the "trust-manager-providers" relation definition.
  static {
    InstantiableRelationDefinition.Builder<TrustManagerProviderCfgClient, TrustManagerProviderCfg> builder =
      new InstantiableRelationDefinition.Builder<TrustManagerProviderCfgClient, TrustManagerProviderCfg>(INSTANCE, "trust-manager-provider", "trust-manager-providers", TrustManagerProviderCfgDefn.getInstance());
    RD_TRUST_MANAGER_PROVIDERS = builder.getInstance();
    INSTANCE.registerRelationDefinition(RD_TRUST_MANAGER_PROVIDERS);
  }



  // Build the "virtual-attributes" relation definition.
  static {
    InstantiableRelationDefinition.Builder<VirtualAttributeCfgClient, VirtualAttributeCfg> builder =
      new InstantiableRelationDefinition.Builder<VirtualAttributeCfgClient, VirtualAttributeCfg>(INSTANCE, "virtual-attribute", "virtual-attributes", VirtualAttributeCfgDefn.getInstance());
    RD_VIRTUAL_ATTRIBUTES = builder.getInstance();
    INSTANCE.registerRelationDefinition(RD_VIRTUAL_ATTRIBUTES);
  }



  // Build the "workflows" relation definition.
  static {
    InstantiableRelationDefinition.Builder<WorkflowCfgClient, WorkflowCfg> builder =
      new InstantiableRelationDefinition.Builder<WorkflowCfgClient, WorkflowCfg>(INSTANCE, "workflow", "workflows", WorkflowCfgDefn.getInstance());
    RD_WORKFLOWS = builder.getInstance();
    INSTANCE.registerRelationDefinition(RD_WORKFLOWS);
  }



  // Build the "workflow-elements" relation definition.
  static {
    InstantiableRelationDefinition.Builder<WorkflowElementCfgClient, WorkflowElementCfg> builder =
      new InstantiableRelationDefinition.Builder<WorkflowElementCfgClient, WorkflowElementCfg>(INSTANCE, "workflow-element", "workflow-elements", WorkflowElementCfgDefn.getInstance());
    RD_WORKFLOW_ELEMENTS = builder.getInstance();
    INSTANCE.registerRelationDefinition(RD_WORKFLOW_ELEMENTS);
  }



  // Build the "work-queue" relation definition.
  static {
    SingletonRelationDefinition.Builder<WorkQueueCfgClient, WorkQueueCfg> builder =
      new SingletonRelationDefinition.Builder<WorkQueueCfgClient, WorkQueueCfg>(INSTANCE, "work-queue", WorkQueueCfgDefn.getInstance());
    RD_WORK_QUEUE = builder.getInstance();
    INSTANCE.registerRelationDefinition(RD_WORK_QUEUE);
  }



  /**
   * Get the Root configuration definition singleton.
   *
   * @return Returns the Root configuration definition singleton.
   */
  public static RootCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private RootCfgDefn() {
    super("", TopCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public RootCfgClient createClientConfiguration(
      ManagedObject<? extends RootCfgClient> impl) {
    return new RootCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public RootCfg createServerConfiguration(
      ServerManagedObject<? extends RootCfg> impl) {
    return new RootCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<RootCfg> getServerConfigurationClass() {
    return RootCfg.class;
  }



  /**
   * Get the "access-control-handler" relation definition.
   *
   * @return Returns the "access-control-handler" relation definition.
   */
  public SingletonRelationDefinition<AccessControlHandlerCfgClient,AccessControlHandlerCfg> getAccessControlHandlerRelationDefinition() {
    return RD_ACCESS_CONTROL_HANDLER;
  }



  /**
   * Get the "account-status-notification-handlers" relation definition.
   *
   * @return Returns the "account-status-notification-handlers" relation definition.
   */
  public InstantiableRelationDefinition<AccountStatusNotificationHandlerCfgClient,AccountStatusNotificationHandlerCfg> getAccountStatusNotificationHandlersRelationDefinition() {
    return RD_ACCOUNT_STATUS_NOTIFICATION_HANDLERS;
  }



  /**
   * Get the "administration-connector" relation definition.
   *
   * @return Returns the "administration-connector" relation definition.
   */
  public SingletonRelationDefinition<AdministrationConnectorCfgClient,AdministrationConnectorCfg> getAdministrationConnectorRelationDefinition() {
    return RD_ADMINISTRATION_CONNECTOR;
  }



  /**
   * Get the "alert-handlers" relation definition.
   *
   * @return Returns the "alert-handlers" relation definition.
   */
  public InstantiableRelationDefinition<AlertHandlerCfgClient,AlertHandlerCfg> getAlertHandlersRelationDefinition() {
    return RD_ALERT_HANDLERS;
  }



  /**
   * Get the "attribute-syntaxes" relation definition.
   *
   * @return Returns the "attribute-syntaxes" relation definition.
   */
  public InstantiableRelationDefinition<AttributeSyntaxCfgClient,AttributeSyntaxCfg> getAttributeSyntaxesRelationDefinition() {
    return RD_ATTRIBUTE_SYNTAXES;
  }



  /**
   * Get the "backends" relation definition.
   *
   * @return Returns the "backends" relation definition.
   */
  public InstantiableRelationDefinition<BackendCfgClient,BackendCfg> getBackendsRelationDefinition() {
    return RD_BACKENDS;
  }



  /**
   * Get the "certificate-mappers" relation definition.
   *
   * @return Returns the "certificate-mappers" relation definition.
   */
  public InstantiableRelationDefinition<CertificateMapperCfgClient,CertificateMapperCfg> getCertificateMappersRelationDefinition() {
    return RD_CERTIFICATE_MAPPERS;
  }



  /**
   * Get the "connection-handlers" relation definition.
   *
   * @return Returns the "connection-handlers" relation definition.
   */
  public InstantiableRelationDefinition<ConnectionHandlerCfgClient,ConnectionHandlerCfg> getConnectionHandlersRelationDefinition() {
    return RD_CONNECTION_HANDLERS;
  }



  /**
   * Get the "crypto-manager" relation definition.
   *
   * @return Returns the "crypto-manager" relation definition.
   */
  public SingletonRelationDefinition<CryptoManagerCfgClient,CryptoManagerCfg> getCryptoManagerRelationDefinition() {
    return RD_CRYPTO_MANAGER;
  }



  /**
   * Get the "entry-caches" relation definition.
   *
   * @return Returns the "entry-caches" relation definition.
   */
  public InstantiableRelationDefinition<EntryCacheCfgClient,EntryCacheCfg> getEntryCachesRelationDefinition() {
    return RD_ENTRY_CACHES;
  }



  /**
   * Get the "extended-operation-handlers" relation definition.
   *
   * @return Returns the "extended-operation-handlers" relation definition.
   */
  public InstantiableRelationDefinition<ExtendedOperationHandlerCfgClient,ExtendedOperationHandlerCfg> getExtendedOperationHandlersRelationDefinition() {
    return RD_EXTENDED_OPERATION_HANDLERS;
  }



  /**
   * Get the "extensions" relation definition.
   *
   * @return Returns the "extensions" relation definition.
   */
  public InstantiableRelationDefinition<ExtensionCfgClient,ExtensionCfg> getExtensionsRelationDefinition() {
    return RD_EXTENSIONS;
  }



  /**
   * Get the "global-configuration" relation definition.
   *
   * @return Returns the "global-configuration" relation definition.
   */
  public SingletonRelationDefinition<GlobalCfgClient,GlobalCfg> getGlobalConfigurationRelationDefinition() {
    return RD_GLOBAL_CONFIGURATION;
  }



  /**
   * Get the "group-implementations" relation definition.
   *
   * @return Returns the "group-implementations" relation definition.
   */
  public InstantiableRelationDefinition<GroupImplementationCfgClient,GroupImplementationCfg> getGroupImplementationsRelationDefinition() {
    return RD_GROUP_IMPLEMENTATIONS;
  }



  /**
   * Get the "identity-mappers" relation definition.
   *
   * @return Returns the "identity-mappers" relation definition.
   */
  public InstantiableRelationDefinition<IdentityMapperCfgClient,IdentityMapperCfg> getIdentityMappersRelationDefinition() {
    return RD_IDENTITY_MAPPERS;
  }



  /**
   * Get the "key-manager-providers" relation definition.
   *
   * @return Returns the "key-manager-providers" relation definition.
   */
  public InstantiableRelationDefinition<KeyManagerProviderCfgClient,KeyManagerProviderCfg> getKeyManagerProvidersRelationDefinition() {
    return RD_KEY_MANAGER_PROVIDERS;
  }



  /**
   * Get the "log-publishers" relation definition.
   *
   * @return Returns the "log-publishers" relation definition.
   */
  public InstantiableRelationDefinition<LogPublisherCfgClient,LogPublisherCfg> getLogPublishersRelationDefinition() {
    return RD_LOG_PUBLISHERS;
  }



  /**
   * Get the "log-retention-policies" relation definition.
   *
   * @return Returns the "log-retention-policies" relation definition.
   */
  public InstantiableRelationDefinition<LogRetentionPolicyCfgClient,LogRetentionPolicyCfg> getLogRetentionPoliciesRelationDefinition() {
    return RD_LOG_RETENTION_POLICIES;
  }



  /**
   * Get the "log-rotation-policies" relation definition.
   *
   * @return Returns the "log-rotation-policies" relation definition.
   */
  public InstantiableRelationDefinition<LogRotationPolicyCfgClient,LogRotationPolicyCfg> getLogRotationPoliciesRelationDefinition() {
    return RD_LOG_ROTATION_POLICIES;
  }



  /**
   * Get the "matching-rules" relation definition.
   *
   * @return Returns the "matching-rules" relation definition.
   */
  public InstantiableRelationDefinition<MatchingRuleCfgClient,MatchingRuleCfg> getMatchingRulesRelationDefinition() {
    return RD_MATCHING_RULES;
  }



  /**
   * Get the "monitor-providers" relation definition.
   *
   * @return Returns the "monitor-providers" relation definition.
   */
  public InstantiableRelationDefinition<MonitorProviderCfgClient,MonitorProviderCfg> getMonitorProvidersRelationDefinition() {
    return RD_MONITOR_PROVIDERS;
  }



  /**
   * Get the "network-groups" relation definition.
   *
   * @return Returns the "network-groups" relation definition.
   */
  public InstantiableRelationDefinition<NetworkGroupCfgClient,NetworkGroupCfg> getNetworkGroupsRelationDefinition() {
    return RD_NETWORK_GROUPS;
  }



  /**
   * Get the "password-generators" relation definition.
   *
   * @return Returns the "password-generators" relation definition.
   */
  public InstantiableRelationDefinition<PasswordGeneratorCfgClient,PasswordGeneratorCfg> getPasswordGeneratorsRelationDefinition() {
    return RD_PASSWORD_GENERATORS;
  }



  /**
   * Get the "password-policies" relation definition.
   *
   * @return Returns the "password-policies" relation definition.
   */
  public InstantiableRelationDefinition<PasswordPolicyCfgClient,PasswordPolicyCfg> getPasswordPoliciesRelationDefinition() {
    return RD_PASSWORD_POLICIES;
  }



  /**
   * Get the "password-storage-schemes" relation definition.
   *
   * @return Returns the "password-storage-schemes" relation definition.
   */
  public InstantiableRelationDefinition<PasswordStorageSchemeCfgClient,PasswordStorageSchemeCfg> getPasswordStorageSchemesRelationDefinition() {
    return RD_PASSWORD_STORAGE_SCHEMES;
  }



  /**
   * Get the "password-validators" relation definition.
   *
   * @return Returns the "password-validators" relation definition.
   */
  public InstantiableRelationDefinition<PasswordValidatorCfgClient,PasswordValidatorCfg> getPasswordValidatorsRelationDefinition() {
    return RD_PASSWORD_VALIDATORS;
  }



  /**
   * Get the "plugin-root" relation definition.
   *
   * @return Returns the "plugin-root" relation definition.
   */
  public SingletonRelationDefinition<PluginRootCfgClient,PluginRootCfg> getPluginRootRelationDefinition() {
    return RD_PLUGIN_ROOT;
  }



  /**
   * Get the "root-dn" relation definition.
   *
   * @return Returns the "root-dn" relation definition.
   */
  public SingletonRelationDefinition<RootDNCfgClient,RootDNCfg> getRootDNRelationDefinition() {
    return RD_ROOT_DN;
  }



  /**
   * Get the "root-dse-backend" relation definition.
   *
   * @return Returns the "root-dse-backend" relation definition.
   */
  public SingletonRelationDefinition<RootDSEBackendCfgClient,RootDSEBackendCfg> getRootDSEBackendRelationDefinition() {
    return RD_ROOT_DSE_BACKEND;
  }



  /**
   * Get the "sasl-mechanism-handlers" relation definition.
   *
   * @return Returns the "sasl-mechanism-handlers" relation definition.
   */
  public InstantiableRelationDefinition<SASLMechanismHandlerCfgClient,SASLMechanismHandlerCfg> getSASLMechanismHandlersRelationDefinition() {
    return RD_SASL_MECHANISM_HANDLERS;
  }



  /**
   * Get the "synchronization-providers" relation definition.
   *
   * @return Returns the "synchronization-providers" relation definition.
   */
  public InstantiableRelationDefinition<SynchronizationProviderCfgClient,SynchronizationProviderCfg> getSynchronizationProvidersRelationDefinition() {
    return RD_SYNCHRONIZATION_PROVIDERS;
  }



  /**
   * Get the "trust-manager-providers" relation definition.
   *
   * @return Returns the "trust-manager-providers" relation definition.
   */
  public InstantiableRelationDefinition<TrustManagerProviderCfgClient,TrustManagerProviderCfg> getTrustManagerProvidersRelationDefinition() {
    return RD_TRUST_MANAGER_PROVIDERS;
  }



  /**
   * Get the "virtual-attributes" relation definition.
   *
   * @return Returns the "virtual-attributes" relation definition.
   */
  public InstantiableRelationDefinition<VirtualAttributeCfgClient,VirtualAttributeCfg> getVirtualAttributesRelationDefinition() {
    return RD_VIRTUAL_ATTRIBUTES;
  }



  /**
   * Get the "workflows" relation definition.
   *
   * @return Returns the "workflows" relation definition.
   */
  public InstantiableRelationDefinition<WorkflowCfgClient,WorkflowCfg> getWorkflowsRelationDefinition() {
    return RD_WORKFLOWS;
  }



  /**
   * Get the "workflow-elements" relation definition.
   *
   * @return Returns the "workflow-elements" relation definition.
   */
  public InstantiableRelationDefinition<WorkflowElementCfgClient,WorkflowElementCfg> getWorkflowElementsRelationDefinition() {
    return RD_WORKFLOW_ELEMENTS;
  }



  /**
   * Get the "work-queue" relation definition.
   *
   * @return Returns the "work-queue" relation definition.
   */
  public SingletonRelationDefinition<WorkQueueCfgClient,WorkQueueCfg> getWorkQueueRelationDefinition() {
    return RD_WORK_QUEUE;
  }



  /**
   * Managed object client implementation.
   */
  private static class RootCfgClientImpl implements
    RootCfgClient {

    // Private implementation.
    private ManagedObject<? extends RootCfgClient> impl;



    // Private constructor.
    private RootCfgClientImpl(
        ManagedObject<? extends RootCfgClient> impl) {
      this.impl = impl;
    }



    /**
     * {@inheritDoc}
     */
    public AccessControlHandlerCfgClient getAccessControlHandler()
        throws DefinitionDecodingException, ManagedObjectDecodingException,
        ManagedObjectNotFoundException, ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.getChild(INSTANCE.getAccessControlHandlerRelationDefinition()).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public String[] listAccountStatusNotificationHandlers() throws ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.listChildren(INSTANCE.getAccountStatusNotificationHandlersRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public AccountStatusNotificationHandlerCfgClient getAccountStatusNotificationHandler(String name)
        throws DefinitionDecodingException, ManagedObjectDecodingException,
        ManagedObjectNotFoundException, ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.getChild(INSTANCE.getAccountStatusNotificationHandlersRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public <M extends AccountStatusNotificationHandlerCfgClient> M createAccountStatusNotificationHandler(
        ManagedObjectDefinition<M, ? extends AccountStatusNotificationHandlerCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException {
      return impl.createChild(INSTANCE.getAccountStatusNotificationHandlersRelationDefinition(), d, name, exceptions).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void removeAccountStatusNotificationHandler(String name)
        throws ManagedObjectNotFoundException, ConcurrentModificationException,
        OperationRejectedException, AuthorizationException, CommunicationException {
      impl.removeChild(INSTANCE.getAccountStatusNotificationHandlersRelationDefinition(), name);
    }



    /**
     * {@inheritDoc}
     */
    public AdministrationConnectorCfgClient getAdministrationConnector()
        throws DefinitionDecodingException, ManagedObjectDecodingException,
        ManagedObjectNotFoundException, ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.getChild(INSTANCE.getAdministrationConnectorRelationDefinition()).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public String[] listAlertHandlers() throws ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.listChildren(INSTANCE.getAlertHandlersRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public AlertHandlerCfgClient getAlertHandler(String name)
        throws DefinitionDecodingException, ManagedObjectDecodingException,
        ManagedObjectNotFoundException, ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.getChild(INSTANCE.getAlertHandlersRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public <M extends AlertHandlerCfgClient> M createAlertHandler(
        ManagedObjectDefinition<M, ? extends AlertHandlerCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException {
      return impl.createChild(INSTANCE.getAlertHandlersRelationDefinition(), d, name, exceptions).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void removeAlertHandler(String name)
        throws ManagedObjectNotFoundException, ConcurrentModificationException,
        OperationRejectedException, AuthorizationException, CommunicationException {
      impl.removeChild(INSTANCE.getAlertHandlersRelationDefinition(), name);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listAttributeSyntaxes() throws ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.listChildren(INSTANCE.getAttributeSyntaxesRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public AttributeSyntaxCfgClient getAttributeSyntax(String name)
        throws DefinitionDecodingException, ManagedObjectDecodingException,
        ManagedObjectNotFoundException, ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.getChild(INSTANCE.getAttributeSyntaxesRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public <M extends AttributeSyntaxCfgClient> M createAttributeSyntax(
        ManagedObjectDefinition<M, ? extends AttributeSyntaxCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException {
      return impl.createChild(INSTANCE.getAttributeSyntaxesRelationDefinition(), d, name, exceptions).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void removeAttributeSyntax(String name)
        throws ManagedObjectNotFoundException, ConcurrentModificationException,
        OperationRejectedException, AuthorizationException, CommunicationException {
      impl.removeChild(INSTANCE.getAttributeSyntaxesRelationDefinition(), name);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listBackends() throws ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.listChildren(INSTANCE.getBackendsRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public BackendCfgClient getBackend(String name)
        throws DefinitionDecodingException, ManagedObjectDecodingException,
        ManagedObjectNotFoundException, ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.getChild(INSTANCE.getBackendsRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public <M extends BackendCfgClient> M createBackend(
        ManagedObjectDefinition<M, ? extends BackendCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException {
      return impl.createChild(INSTANCE.getBackendsRelationDefinition(), d, name, exceptions).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void removeBackend(String name)
        throws ManagedObjectNotFoundException, ConcurrentModificationException,
        OperationRejectedException, AuthorizationException, CommunicationException {
      impl.removeChild(INSTANCE.getBackendsRelationDefinition(), name);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listCertificateMappers() throws ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.listChildren(INSTANCE.getCertificateMappersRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public CertificateMapperCfgClient getCertificateMapper(String name)
        throws DefinitionDecodingException, ManagedObjectDecodingException,
        ManagedObjectNotFoundException, ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.getChild(INSTANCE.getCertificateMappersRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public <M extends CertificateMapperCfgClient> M createCertificateMapper(
        ManagedObjectDefinition<M, ? extends CertificateMapperCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException {
      return impl.createChild(INSTANCE.getCertificateMappersRelationDefinition(), d, name, exceptions).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void removeCertificateMapper(String name)
        throws ManagedObjectNotFoundException, ConcurrentModificationException,
        OperationRejectedException, AuthorizationException, CommunicationException {
      impl.removeChild(INSTANCE.getCertificateMappersRelationDefinition(), name);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listConnectionHandlers() throws ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.listChildren(INSTANCE.getConnectionHandlersRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public ConnectionHandlerCfgClient getConnectionHandler(String name)
        throws DefinitionDecodingException, ManagedObjectDecodingException,
        ManagedObjectNotFoundException, ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.getChild(INSTANCE.getConnectionHandlersRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public <M extends ConnectionHandlerCfgClient> M createConnectionHandler(
        ManagedObjectDefinition<M, ? extends ConnectionHandlerCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException {
      return impl.createChild(INSTANCE.getConnectionHandlersRelationDefinition(), d, name, exceptions).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void removeConnectionHandler(String name)
        throws ManagedObjectNotFoundException, ConcurrentModificationException,
        OperationRejectedException, AuthorizationException, CommunicationException {
      impl.removeChild(INSTANCE.getConnectionHandlersRelationDefinition(), name);
    }



    /**
     * {@inheritDoc}
     */
    public CryptoManagerCfgClient getCryptoManager()
        throws DefinitionDecodingException, ManagedObjectDecodingException,
        ManagedObjectNotFoundException, ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.getChild(INSTANCE.getCryptoManagerRelationDefinition()).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public String[] listEntryCaches() throws ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.listChildren(INSTANCE.getEntryCachesRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public EntryCacheCfgClient getEntryCache(String name)
        throws DefinitionDecodingException, ManagedObjectDecodingException,
        ManagedObjectNotFoundException, ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.getChild(INSTANCE.getEntryCachesRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public <M extends EntryCacheCfgClient> M createEntryCache(
        ManagedObjectDefinition<M, ? extends EntryCacheCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException {
      return impl.createChild(INSTANCE.getEntryCachesRelationDefinition(), d, name, exceptions).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void removeEntryCache(String name)
        throws ManagedObjectNotFoundException, ConcurrentModificationException,
        OperationRejectedException, AuthorizationException, CommunicationException {
      impl.removeChild(INSTANCE.getEntryCachesRelationDefinition(), name);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listExtendedOperationHandlers() throws ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.listChildren(INSTANCE.getExtendedOperationHandlersRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public ExtendedOperationHandlerCfgClient getExtendedOperationHandler(String name)
        throws DefinitionDecodingException, ManagedObjectDecodingException,
        ManagedObjectNotFoundException, ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.getChild(INSTANCE.getExtendedOperationHandlersRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public <M extends ExtendedOperationHandlerCfgClient> M createExtendedOperationHandler(
        ManagedObjectDefinition<M, ? extends ExtendedOperationHandlerCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException {
      return impl.createChild(INSTANCE.getExtendedOperationHandlersRelationDefinition(), d, name, exceptions).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void removeExtendedOperationHandler(String name)
        throws ManagedObjectNotFoundException, ConcurrentModificationException,
        OperationRejectedException, AuthorizationException, CommunicationException {
      impl.removeChild(INSTANCE.getExtendedOperationHandlersRelationDefinition(), name);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listExtensions() throws ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.listChildren(INSTANCE.getExtensionsRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public ExtensionCfgClient getExtension(String name)
        throws DefinitionDecodingException, ManagedObjectDecodingException,
        ManagedObjectNotFoundException, ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.getChild(INSTANCE.getExtensionsRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public <M extends ExtensionCfgClient> M createExtension(
        ManagedObjectDefinition<M, ? extends ExtensionCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException {
      return impl.createChild(INSTANCE.getExtensionsRelationDefinition(), d, name, exceptions).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void removeExtension(String name)
        throws ManagedObjectNotFoundException, ConcurrentModificationException,
        OperationRejectedException, AuthorizationException, CommunicationException {
      impl.removeChild(INSTANCE.getExtensionsRelationDefinition(), name);
    }



    /**
     * {@inheritDoc}
     */
    public GlobalCfgClient getGlobalConfiguration()
        throws DefinitionDecodingException, ManagedObjectDecodingException,
        ManagedObjectNotFoundException, ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.getChild(INSTANCE.getGlobalConfigurationRelationDefinition()).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public String[] listGroupImplementations() throws ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.listChildren(INSTANCE.getGroupImplementationsRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public GroupImplementationCfgClient getGroupImplementation(String name)
        throws DefinitionDecodingException, ManagedObjectDecodingException,
        ManagedObjectNotFoundException, ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.getChild(INSTANCE.getGroupImplementationsRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public <M extends GroupImplementationCfgClient> M createGroupImplementation(
        ManagedObjectDefinition<M, ? extends GroupImplementationCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException {
      return impl.createChild(INSTANCE.getGroupImplementationsRelationDefinition(), d, name, exceptions).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void removeGroupImplementation(String name)
        throws ManagedObjectNotFoundException, ConcurrentModificationException,
        OperationRejectedException, AuthorizationException, CommunicationException {
      impl.removeChild(INSTANCE.getGroupImplementationsRelationDefinition(), name);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listIdentityMappers() throws ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.listChildren(INSTANCE.getIdentityMappersRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public IdentityMapperCfgClient getIdentityMapper(String name)
        throws DefinitionDecodingException, ManagedObjectDecodingException,
        ManagedObjectNotFoundException, ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.getChild(INSTANCE.getIdentityMappersRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public <M extends IdentityMapperCfgClient> M createIdentityMapper(
        ManagedObjectDefinition<M, ? extends IdentityMapperCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException {
      return impl.createChild(INSTANCE.getIdentityMappersRelationDefinition(), d, name, exceptions).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void removeIdentityMapper(String name)
        throws ManagedObjectNotFoundException, ConcurrentModificationException,
        OperationRejectedException, AuthorizationException, CommunicationException {
      impl.removeChild(INSTANCE.getIdentityMappersRelationDefinition(), name);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listKeyManagerProviders() throws ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.listChildren(INSTANCE.getKeyManagerProvidersRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public KeyManagerProviderCfgClient getKeyManagerProvider(String name)
        throws DefinitionDecodingException, ManagedObjectDecodingException,
        ManagedObjectNotFoundException, ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.getChild(INSTANCE.getKeyManagerProvidersRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public <M extends KeyManagerProviderCfgClient> M createKeyManagerProvider(
        ManagedObjectDefinition<M, ? extends KeyManagerProviderCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException {
      return impl.createChild(INSTANCE.getKeyManagerProvidersRelationDefinition(), d, name, exceptions).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void removeKeyManagerProvider(String name)
        throws ManagedObjectNotFoundException, ConcurrentModificationException,
        OperationRejectedException, AuthorizationException, CommunicationException {
      impl.removeChild(INSTANCE.getKeyManagerProvidersRelationDefinition(), name);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listLogPublishers() throws ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.listChildren(INSTANCE.getLogPublishersRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public LogPublisherCfgClient getLogPublisher(String name)
        throws DefinitionDecodingException, ManagedObjectDecodingException,
        ManagedObjectNotFoundException, ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.getChild(INSTANCE.getLogPublishersRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public <M extends LogPublisherCfgClient> M createLogPublisher(
        ManagedObjectDefinition<M, ? extends LogPublisherCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException {
      return impl.createChild(INSTANCE.getLogPublishersRelationDefinition(), d, name, exceptions).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void removeLogPublisher(String name)
        throws ManagedObjectNotFoundException, ConcurrentModificationException,
        OperationRejectedException, AuthorizationException, CommunicationException {
      impl.removeChild(INSTANCE.getLogPublishersRelationDefinition(), name);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listLogRetentionPolicies() throws ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.listChildren(INSTANCE.getLogRetentionPoliciesRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public LogRetentionPolicyCfgClient getLogRetentionPolicy(String name)
        throws DefinitionDecodingException, ManagedObjectDecodingException,
        ManagedObjectNotFoundException, ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.getChild(INSTANCE.getLogRetentionPoliciesRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public <M extends LogRetentionPolicyCfgClient> M createLogRetentionPolicy(
        ManagedObjectDefinition<M, ? extends LogRetentionPolicyCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException {
      return impl.createChild(INSTANCE.getLogRetentionPoliciesRelationDefinition(), d, name, exceptions).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void removeLogRetentionPolicy(String name)
        throws ManagedObjectNotFoundException, ConcurrentModificationException,
        OperationRejectedException, AuthorizationException, CommunicationException {
      impl.removeChild(INSTANCE.getLogRetentionPoliciesRelationDefinition(), name);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listLogRotationPolicies() throws ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.listChildren(INSTANCE.getLogRotationPoliciesRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public LogRotationPolicyCfgClient getLogRotationPolicy(String name)
        throws DefinitionDecodingException, ManagedObjectDecodingException,
        ManagedObjectNotFoundException, ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.getChild(INSTANCE.getLogRotationPoliciesRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public <M extends LogRotationPolicyCfgClient> M createLogRotationPolicy(
        ManagedObjectDefinition<M, ? extends LogRotationPolicyCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException {
      return impl.createChild(INSTANCE.getLogRotationPoliciesRelationDefinition(), d, name, exceptions).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void removeLogRotationPolicy(String name)
        throws ManagedObjectNotFoundException, ConcurrentModificationException,
        OperationRejectedException, AuthorizationException, CommunicationException {
      impl.removeChild(INSTANCE.getLogRotationPoliciesRelationDefinition(), name);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listMatchingRules() throws ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.listChildren(INSTANCE.getMatchingRulesRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public MatchingRuleCfgClient getMatchingRule(String name)
        throws DefinitionDecodingException, ManagedObjectDecodingException,
        ManagedObjectNotFoundException, ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.getChild(INSTANCE.getMatchingRulesRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public <M extends MatchingRuleCfgClient> M createMatchingRule(
        ManagedObjectDefinition<M, ? extends MatchingRuleCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException {
      return impl.createChild(INSTANCE.getMatchingRulesRelationDefinition(), d, name, exceptions).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void removeMatchingRule(String name)
        throws ManagedObjectNotFoundException, ConcurrentModificationException,
        OperationRejectedException, AuthorizationException, CommunicationException {
      impl.removeChild(INSTANCE.getMatchingRulesRelationDefinition(), name);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listMonitorProviders() throws ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.listChildren(INSTANCE.getMonitorProvidersRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public MonitorProviderCfgClient getMonitorProvider(String name)
        throws DefinitionDecodingException, ManagedObjectDecodingException,
        ManagedObjectNotFoundException, ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.getChild(INSTANCE.getMonitorProvidersRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public <M extends MonitorProviderCfgClient> M createMonitorProvider(
        ManagedObjectDefinition<M, ? extends MonitorProviderCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException {
      return impl.createChild(INSTANCE.getMonitorProvidersRelationDefinition(), d, name, exceptions).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void removeMonitorProvider(String name)
        throws ManagedObjectNotFoundException, ConcurrentModificationException,
        OperationRejectedException, AuthorizationException, CommunicationException {
      impl.removeChild(INSTANCE.getMonitorProvidersRelationDefinition(), name);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listNetworkGroups() throws ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.listChildren(INSTANCE.getNetworkGroupsRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public NetworkGroupCfgClient getNetworkGroup(String name)
        throws DefinitionDecodingException, ManagedObjectDecodingException,
        ManagedObjectNotFoundException, ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.getChild(INSTANCE.getNetworkGroupsRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public <M extends NetworkGroupCfgClient> M createNetworkGroup(
        ManagedObjectDefinition<M, ? extends NetworkGroupCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException {
      return impl.createChild(INSTANCE.getNetworkGroupsRelationDefinition(), d, name, exceptions).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void removeNetworkGroup(String name)
        throws ManagedObjectNotFoundException, ConcurrentModificationException,
        OperationRejectedException, AuthorizationException, CommunicationException {
      impl.removeChild(INSTANCE.getNetworkGroupsRelationDefinition(), name);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listPasswordGenerators() throws ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.listChildren(INSTANCE.getPasswordGeneratorsRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public PasswordGeneratorCfgClient getPasswordGenerator(String name)
        throws DefinitionDecodingException, ManagedObjectDecodingException,
        ManagedObjectNotFoundException, ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.getChild(INSTANCE.getPasswordGeneratorsRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public <M extends PasswordGeneratorCfgClient> M createPasswordGenerator(
        ManagedObjectDefinition<M, ? extends PasswordGeneratorCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException {
      return impl.createChild(INSTANCE.getPasswordGeneratorsRelationDefinition(), d, name, exceptions).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void removePasswordGenerator(String name)
        throws ManagedObjectNotFoundException, ConcurrentModificationException,
        OperationRejectedException, AuthorizationException, CommunicationException {
      impl.removeChild(INSTANCE.getPasswordGeneratorsRelationDefinition(), name);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listPasswordPolicies() throws ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.listChildren(INSTANCE.getPasswordPoliciesRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public PasswordPolicyCfgClient getPasswordPolicy(String name)
        throws DefinitionDecodingException, ManagedObjectDecodingException,
        ManagedObjectNotFoundException, ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.getChild(INSTANCE.getPasswordPoliciesRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public <M extends PasswordPolicyCfgClient> M createPasswordPolicy(
        ManagedObjectDefinition<M, ? extends PasswordPolicyCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException {
      return impl.createChild(INSTANCE.getPasswordPoliciesRelationDefinition(), d, name, exceptions).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void removePasswordPolicy(String name)
        throws ManagedObjectNotFoundException, ConcurrentModificationException,
        OperationRejectedException, AuthorizationException, CommunicationException {
      impl.removeChild(INSTANCE.getPasswordPoliciesRelationDefinition(), name);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listPasswordStorageSchemes() throws ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.listChildren(INSTANCE.getPasswordStorageSchemesRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public PasswordStorageSchemeCfgClient getPasswordStorageScheme(String name)
        throws DefinitionDecodingException, ManagedObjectDecodingException,
        ManagedObjectNotFoundException, ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.getChild(INSTANCE.getPasswordStorageSchemesRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public <M extends PasswordStorageSchemeCfgClient> M createPasswordStorageScheme(
        ManagedObjectDefinition<M, ? extends PasswordStorageSchemeCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException {
      return impl.createChild(INSTANCE.getPasswordStorageSchemesRelationDefinition(), d, name, exceptions).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void removePasswordStorageScheme(String name)
        throws ManagedObjectNotFoundException, ConcurrentModificationException,
        OperationRejectedException, AuthorizationException, CommunicationException {
      impl.removeChild(INSTANCE.getPasswordStorageSchemesRelationDefinition(), name);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listPasswordValidators() throws ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.listChildren(INSTANCE.getPasswordValidatorsRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public PasswordValidatorCfgClient getPasswordValidator(String name)
        throws DefinitionDecodingException, ManagedObjectDecodingException,
        ManagedObjectNotFoundException, ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.getChild(INSTANCE.getPasswordValidatorsRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public <M extends PasswordValidatorCfgClient> M createPasswordValidator(
        ManagedObjectDefinition<M, ? extends PasswordValidatorCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException {
      return impl.createChild(INSTANCE.getPasswordValidatorsRelationDefinition(), d, name, exceptions).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void removePasswordValidator(String name)
        throws ManagedObjectNotFoundException, ConcurrentModificationException,
        OperationRejectedException, AuthorizationException, CommunicationException {
      impl.removeChild(INSTANCE.getPasswordValidatorsRelationDefinition(), name);
    }



    /**
     * {@inheritDoc}
     */
    public PluginRootCfgClient getPluginRoot()
        throws DefinitionDecodingException, ManagedObjectDecodingException,
        ManagedObjectNotFoundException, ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.getChild(INSTANCE.getPluginRootRelationDefinition()).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public RootDNCfgClient getRootDN()
        throws DefinitionDecodingException, ManagedObjectDecodingException,
        ManagedObjectNotFoundException, ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.getChild(INSTANCE.getRootDNRelationDefinition()).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public RootDSEBackendCfgClient getRootDSEBackend()
        throws DefinitionDecodingException, ManagedObjectDecodingException,
        ManagedObjectNotFoundException, ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.getChild(INSTANCE.getRootDSEBackendRelationDefinition()).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public String[] listSASLMechanismHandlers() throws ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.listChildren(INSTANCE.getSASLMechanismHandlersRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public SASLMechanismHandlerCfgClient getSASLMechanismHandler(String name)
        throws DefinitionDecodingException, ManagedObjectDecodingException,
        ManagedObjectNotFoundException, ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.getChild(INSTANCE.getSASLMechanismHandlersRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public <M extends SASLMechanismHandlerCfgClient> M createSASLMechanismHandler(
        ManagedObjectDefinition<M, ? extends SASLMechanismHandlerCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException {
      return impl.createChild(INSTANCE.getSASLMechanismHandlersRelationDefinition(), d, name, exceptions).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void removeSASLMechanismHandler(String name)
        throws ManagedObjectNotFoundException, ConcurrentModificationException,
        OperationRejectedException, AuthorizationException, CommunicationException {
      impl.removeChild(INSTANCE.getSASLMechanismHandlersRelationDefinition(), name);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listSynchronizationProviders() throws ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.listChildren(INSTANCE.getSynchronizationProvidersRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public SynchronizationProviderCfgClient getSynchronizationProvider(String name)
        throws DefinitionDecodingException, ManagedObjectDecodingException,
        ManagedObjectNotFoundException, ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.getChild(INSTANCE.getSynchronizationProvidersRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public <M extends SynchronizationProviderCfgClient> M createSynchronizationProvider(
        ManagedObjectDefinition<M, ? extends SynchronizationProviderCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException {
      return impl.createChild(INSTANCE.getSynchronizationProvidersRelationDefinition(), d, name, exceptions).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void removeSynchronizationProvider(String name)
        throws ManagedObjectNotFoundException, ConcurrentModificationException,
        OperationRejectedException, AuthorizationException, CommunicationException {
      impl.removeChild(INSTANCE.getSynchronizationProvidersRelationDefinition(), name);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listTrustManagerProviders() throws ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.listChildren(INSTANCE.getTrustManagerProvidersRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public TrustManagerProviderCfgClient getTrustManagerProvider(String name)
        throws DefinitionDecodingException, ManagedObjectDecodingException,
        ManagedObjectNotFoundException, ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.getChild(INSTANCE.getTrustManagerProvidersRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public <M extends TrustManagerProviderCfgClient> M createTrustManagerProvider(
        ManagedObjectDefinition<M, ? extends TrustManagerProviderCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException {
      return impl.createChild(INSTANCE.getTrustManagerProvidersRelationDefinition(), d, name, exceptions).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void removeTrustManagerProvider(String name)
        throws ManagedObjectNotFoundException, ConcurrentModificationException,
        OperationRejectedException, AuthorizationException, CommunicationException {
      impl.removeChild(INSTANCE.getTrustManagerProvidersRelationDefinition(), name);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listVirtualAttributes() throws ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.listChildren(INSTANCE.getVirtualAttributesRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public VirtualAttributeCfgClient getVirtualAttribute(String name)
        throws DefinitionDecodingException, ManagedObjectDecodingException,
        ManagedObjectNotFoundException, ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.getChild(INSTANCE.getVirtualAttributesRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public <M extends VirtualAttributeCfgClient> M createVirtualAttribute(
        ManagedObjectDefinition<M, ? extends VirtualAttributeCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException {
      return impl.createChild(INSTANCE.getVirtualAttributesRelationDefinition(), d, name, exceptions).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void removeVirtualAttribute(String name)
        throws ManagedObjectNotFoundException, ConcurrentModificationException,
        OperationRejectedException, AuthorizationException, CommunicationException {
      impl.removeChild(INSTANCE.getVirtualAttributesRelationDefinition(), name);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listWorkflows() throws ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.listChildren(INSTANCE.getWorkflowsRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public WorkflowCfgClient getWorkflow(String name)
        throws DefinitionDecodingException, ManagedObjectDecodingException,
        ManagedObjectNotFoundException, ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.getChild(INSTANCE.getWorkflowsRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public <M extends WorkflowCfgClient> M createWorkflow(
        ManagedObjectDefinition<M, ? extends WorkflowCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException {
      return impl.createChild(INSTANCE.getWorkflowsRelationDefinition(), d, name, exceptions).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void removeWorkflow(String name)
        throws ManagedObjectNotFoundException, ConcurrentModificationException,
        OperationRejectedException, AuthorizationException, CommunicationException {
      impl.removeChild(INSTANCE.getWorkflowsRelationDefinition(), name);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listWorkflowElements() throws ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.listChildren(INSTANCE.getWorkflowElementsRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public WorkflowElementCfgClient getWorkflowElement(String name)
        throws DefinitionDecodingException, ManagedObjectDecodingException,
        ManagedObjectNotFoundException, ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.getChild(INSTANCE.getWorkflowElementsRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public <M extends WorkflowElementCfgClient> M createWorkflowElement(
        ManagedObjectDefinition<M, ? extends WorkflowElementCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException {
      return impl.createChild(INSTANCE.getWorkflowElementsRelationDefinition(), d, name, exceptions).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void removeWorkflowElement(String name)
        throws ManagedObjectNotFoundException, ConcurrentModificationException,
        OperationRejectedException, AuthorizationException, CommunicationException {
      impl.removeChild(INSTANCE.getWorkflowElementsRelationDefinition(), name);
    }



    /**
     * {@inheritDoc}
     */
    public WorkQueueCfgClient getWorkQueue()
        throws DefinitionDecodingException, ManagedObjectDecodingException,
        ManagedObjectNotFoundException, ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.getChild(INSTANCE.getWorkQueueRelationDefinition()).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public ManagedObjectDefinition<? extends RootCfgClient, ? extends RootCfg> definition() {
      return INSTANCE;
    }



    /**
     * {@inheritDoc}
     */
    public PropertyProvider properties() {
      return impl;
    }



    /**
     * {@inheritDoc}
     */
    public void commit() throws ManagedObjectAlreadyExistsException,
        MissingMandatoryPropertiesException, ConcurrentModificationException,
        OperationRejectedException, AuthorizationException,
        CommunicationException {
      impl.commit();
    }

  }



  /**
   * Managed object server implementation.
   */
  private static class RootCfgServerImpl implements
    RootCfg {

    // Private implementation.
    private ServerManagedObject<? extends RootCfg> impl;



    // Private constructor.
    private RootCfgServerImpl(ServerManagedObject<? extends RootCfg> impl) {
      this.impl = impl;
    }



    /**
     * {@inheritDoc}
     */
    public AccessControlHandlerCfg getAccessControlHandler() throws ConfigException {
      return impl.getChild(INSTANCE.getAccessControlHandlerRelationDefinition()).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public String[] listAccountStatusNotificationHandlers() {
      return impl.listChildren(INSTANCE.getAccountStatusNotificationHandlersRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public AccountStatusNotificationHandlerCfg getAccountStatusNotificationHandler(String name) throws ConfigException {
      return impl.getChild(INSTANCE.getAccountStatusNotificationHandlersRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void addAccountStatusNotificationHandlerAddListener(
        ConfigurationAddListener<AccountStatusNotificationHandlerCfg> listener) throws ConfigException {
      impl.registerAddListener(INSTANCE.getAccountStatusNotificationHandlersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeAccountStatusNotificationHandlerAddListener(
        ConfigurationAddListener<AccountStatusNotificationHandlerCfg> listener) {
      impl.deregisterAddListener(INSTANCE.getAccountStatusNotificationHandlersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void addAccountStatusNotificationHandlerDeleteListener(
        ConfigurationDeleteListener<AccountStatusNotificationHandlerCfg> listener) throws ConfigException {
      impl.registerDeleteListener(INSTANCE.getAccountStatusNotificationHandlersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeAccountStatusNotificationHandlerDeleteListener(
        ConfigurationDeleteListener<AccountStatusNotificationHandlerCfg> listener) {
      impl.deregisterDeleteListener(INSTANCE.getAccountStatusNotificationHandlersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public AdministrationConnectorCfg getAdministrationConnector() throws ConfigException {
      return impl.getChild(INSTANCE.getAdministrationConnectorRelationDefinition()).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public String[] listAlertHandlers() {
      return impl.listChildren(INSTANCE.getAlertHandlersRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public AlertHandlerCfg getAlertHandler(String name) throws ConfigException {
      return impl.getChild(INSTANCE.getAlertHandlersRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void addAlertHandlerAddListener(
        ConfigurationAddListener<AlertHandlerCfg> listener) throws ConfigException {
      impl.registerAddListener(INSTANCE.getAlertHandlersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeAlertHandlerAddListener(
        ConfigurationAddListener<AlertHandlerCfg> listener) {
      impl.deregisterAddListener(INSTANCE.getAlertHandlersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void addAlertHandlerDeleteListener(
        ConfigurationDeleteListener<AlertHandlerCfg> listener) throws ConfigException {
      impl.registerDeleteListener(INSTANCE.getAlertHandlersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeAlertHandlerDeleteListener(
        ConfigurationDeleteListener<AlertHandlerCfg> listener) {
      impl.deregisterDeleteListener(INSTANCE.getAlertHandlersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listAttributeSyntaxes() {
      return impl.listChildren(INSTANCE.getAttributeSyntaxesRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public AttributeSyntaxCfg getAttributeSyntax(String name) throws ConfigException {
      return impl.getChild(INSTANCE.getAttributeSyntaxesRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void addAttributeSyntaxAddListener(
        ConfigurationAddListener<AttributeSyntaxCfg> listener) throws ConfigException {
      impl.registerAddListener(INSTANCE.getAttributeSyntaxesRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeAttributeSyntaxAddListener(
        ConfigurationAddListener<AttributeSyntaxCfg> listener) {
      impl.deregisterAddListener(INSTANCE.getAttributeSyntaxesRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void addAttributeSyntaxDeleteListener(
        ConfigurationDeleteListener<AttributeSyntaxCfg> listener) throws ConfigException {
      impl.registerDeleteListener(INSTANCE.getAttributeSyntaxesRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeAttributeSyntaxDeleteListener(
        ConfigurationDeleteListener<AttributeSyntaxCfg> listener) {
      impl.deregisterDeleteListener(INSTANCE.getAttributeSyntaxesRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listBackends() {
      return impl.listChildren(INSTANCE.getBackendsRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public BackendCfg getBackend(String name) throws ConfigException {
      return impl.getChild(INSTANCE.getBackendsRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void addBackendAddListener(
        ConfigurationAddListener<BackendCfg> listener) throws ConfigException {
      impl.registerAddListener(INSTANCE.getBackendsRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeBackendAddListener(
        ConfigurationAddListener<BackendCfg> listener) {
      impl.deregisterAddListener(INSTANCE.getBackendsRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void addBackendDeleteListener(
        ConfigurationDeleteListener<BackendCfg> listener) throws ConfigException {
      impl.registerDeleteListener(INSTANCE.getBackendsRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeBackendDeleteListener(
        ConfigurationDeleteListener<BackendCfg> listener) {
      impl.deregisterDeleteListener(INSTANCE.getBackendsRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listCertificateMappers() {
      return impl.listChildren(INSTANCE.getCertificateMappersRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public CertificateMapperCfg getCertificateMapper(String name) throws ConfigException {
      return impl.getChild(INSTANCE.getCertificateMappersRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void addCertificateMapperAddListener(
        ConfigurationAddListener<CertificateMapperCfg> listener) throws ConfigException {
      impl.registerAddListener(INSTANCE.getCertificateMappersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeCertificateMapperAddListener(
        ConfigurationAddListener<CertificateMapperCfg> listener) {
      impl.deregisterAddListener(INSTANCE.getCertificateMappersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void addCertificateMapperDeleteListener(
        ConfigurationDeleteListener<CertificateMapperCfg> listener) throws ConfigException {
      impl.registerDeleteListener(INSTANCE.getCertificateMappersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeCertificateMapperDeleteListener(
        ConfigurationDeleteListener<CertificateMapperCfg> listener) {
      impl.deregisterDeleteListener(INSTANCE.getCertificateMappersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listConnectionHandlers() {
      return impl.listChildren(INSTANCE.getConnectionHandlersRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public ConnectionHandlerCfg getConnectionHandler(String name) throws ConfigException {
      return impl.getChild(INSTANCE.getConnectionHandlersRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void addConnectionHandlerAddListener(
        ConfigurationAddListener<ConnectionHandlerCfg> listener) throws ConfigException {
      impl.registerAddListener(INSTANCE.getConnectionHandlersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeConnectionHandlerAddListener(
        ConfigurationAddListener<ConnectionHandlerCfg> listener) {
      impl.deregisterAddListener(INSTANCE.getConnectionHandlersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void addConnectionHandlerDeleteListener(
        ConfigurationDeleteListener<ConnectionHandlerCfg> listener) throws ConfigException {
      impl.registerDeleteListener(INSTANCE.getConnectionHandlersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeConnectionHandlerDeleteListener(
        ConfigurationDeleteListener<ConnectionHandlerCfg> listener) {
      impl.deregisterDeleteListener(INSTANCE.getConnectionHandlersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public CryptoManagerCfg getCryptoManager() throws ConfigException {
      return impl.getChild(INSTANCE.getCryptoManagerRelationDefinition()).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public String[] listEntryCaches() {
      return impl.listChildren(INSTANCE.getEntryCachesRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public EntryCacheCfg getEntryCache(String name) throws ConfigException {
      return impl.getChild(INSTANCE.getEntryCachesRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void addEntryCacheAddListener(
        ConfigurationAddListener<EntryCacheCfg> listener) throws ConfigException {
      impl.registerAddListener(INSTANCE.getEntryCachesRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeEntryCacheAddListener(
        ConfigurationAddListener<EntryCacheCfg> listener) {
      impl.deregisterAddListener(INSTANCE.getEntryCachesRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void addEntryCacheDeleteListener(
        ConfigurationDeleteListener<EntryCacheCfg> listener) throws ConfigException {
      impl.registerDeleteListener(INSTANCE.getEntryCachesRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeEntryCacheDeleteListener(
        ConfigurationDeleteListener<EntryCacheCfg> listener) {
      impl.deregisterDeleteListener(INSTANCE.getEntryCachesRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listExtendedOperationHandlers() {
      return impl.listChildren(INSTANCE.getExtendedOperationHandlersRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public ExtendedOperationHandlerCfg getExtendedOperationHandler(String name) throws ConfigException {
      return impl.getChild(INSTANCE.getExtendedOperationHandlersRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void addExtendedOperationHandlerAddListener(
        ConfigurationAddListener<ExtendedOperationHandlerCfg> listener) throws ConfigException {
      impl.registerAddListener(INSTANCE.getExtendedOperationHandlersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeExtendedOperationHandlerAddListener(
        ConfigurationAddListener<ExtendedOperationHandlerCfg> listener) {
      impl.deregisterAddListener(INSTANCE.getExtendedOperationHandlersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void addExtendedOperationHandlerDeleteListener(
        ConfigurationDeleteListener<ExtendedOperationHandlerCfg> listener) throws ConfigException {
      impl.registerDeleteListener(INSTANCE.getExtendedOperationHandlersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeExtendedOperationHandlerDeleteListener(
        ConfigurationDeleteListener<ExtendedOperationHandlerCfg> listener) {
      impl.deregisterDeleteListener(INSTANCE.getExtendedOperationHandlersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listExtensions() {
      return impl.listChildren(INSTANCE.getExtensionsRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public ExtensionCfg getExtension(String name) throws ConfigException {
      return impl.getChild(INSTANCE.getExtensionsRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void addExtensionAddListener(
        ConfigurationAddListener<ExtensionCfg> listener) throws ConfigException {
      impl.registerAddListener(INSTANCE.getExtensionsRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeExtensionAddListener(
        ConfigurationAddListener<ExtensionCfg> listener) {
      impl.deregisterAddListener(INSTANCE.getExtensionsRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void addExtensionDeleteListener(
        ConfigurationDeleteListener<ExtensionCfg> listener) throws ConfigException {
      impl.registerDeleteListener(INSTANCE.getExtensionsRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeExtensionDeleteListener(
        ConfigurationDeleteListener<ExtensionCfg> listener) {
      impl.deregisterDeleteListener(INSTANCE.getExtensionsRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public GlobalCfg getGlobalConfiguration() throws ConfigException {
      return impl.getChild(INSTANCE.getGlobalConfigurationRelationDefinition()).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public String[] listGroupImplementations() {
      return impl.listChildren(INSTANCE.getGroupImplementationsRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public GroupImplementationCfg getGroupImplementation(String name) throws ConfigException {
      return impl.getChild(INSTANCE.getGroupImplementationsRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void addGroupImplementationAddListener(
        ConfigurationAddListener<GroupImplementationCfg> listener) throws ConfigException {
      impl.registerAddListener(INSTANCE.getGroupImplementationsRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeGroupImplementationAddListener(
        ConfigurationAddListener<GroupImplementationCfg> listener) {
      impl.deregisterAddListener(INSTANCE.getGroupImplementationsRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void addGroupImplementationDeleteListener(
        ConfigurationDeleteListener<GroupImplementationCfg> listener) throws ConfigException {
      impl.registerDeleteListener(INSTANCE.getGroupImplementationsRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeGroupImplementationDeleteListener(
        ConfigurationDeleteListener<GroupImplementationCfg> listener) {
      impl.deregisterDeleteListener(INSTANCE.getGroupImplementationsRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listIdentityMappers() {
      return impl.listChildren(INSTANCE.getIdentityMappersRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public IdentityMapperCfg getIdentityMapper(String name) throws ConfigException {
      return impl.getChild(INSTANCE.getIdentityMappersRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void addIdentityMapperAddListener(
        ConfigurationAddListener<IdentityMapperCfg> listener) throws ConfigException {
      impl.registerAddListener(INSTANCE.getIdentityMappersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeIdentityMapperAddListener(
        ConfigurationAddListener<IdentityMapperCfg> listener) {
      impl.deregisterAddListener(INSTANCE.getIdentityMappersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void addIdentityMapperDeleteListener(
        ConfigurationDeleteListener<IdentityMapperCfg> listener) throws ConfigException {
      impl.registerDeleteListener(INSTANCE.getIdentityMappersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeIdentityMapperDeleteListener(
        ConfigurationDeleteListener<IdentityMapperCfg> listener) {
      impl.deregisterDeleteListener(INSTANCE.getIdentityMappersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listKeyManagerProviders() {
      return impl.listChildren(INSTANCE.getKeyManagerProvidersRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public KeyManagerProviderCfg getKeyManagerProvider(String name) throws ConfigException {
      return impl.getChild(INSTANCE.getKeyManagerProvidersRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void addKeyManagerProviderAddListener(
        ConfigurationAddListener<KeyManagerProviderCfg> listener) throws ConfigException {
      impl.registerAddListener(INSTANCE.getKeyManagerProvidersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeKeyManagerProviderAddListener(
        ConfigurationAddListener<KeyManagerProviderCfg> listener) {
      impl.deregisterAddListener(INSTANCE.getKeyManagerProvidersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void addKeyManagerProviderDeleteListener(
        ConfigurationDeleteListener<KeyManagerProviderCfg> listener) throws ConfigException {
      impl.registerDeleteListener(INSTANCE.getKeyManagerProvidersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeKeyManagerProviderDeleteListener(
        ConfigurationDeleteListener<KeyManagerProviderCfg> listener) {
      impl.deregisterDeleteListener(INSTANCE.getKeyManagerProvidersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listLogPublishers() {
      return impl.listChildren(INSTANCE.getLogPublishersRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public LogPublisherCfg getLogPublisher(String name) throws ConfigException {
      return impl.getChild(INSTANCE.getLogPublishersRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void addLogPublisherAddListener(
        ConfigurationAddListener<LogPublisherCfg> listener) throws ConfigException {
      impl.registerAddListener(INSTANCE.getLogPublishersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeLogPublisherAddListener(
        ConfigurationAddListener<LogPublisherCfg> listener) {
      impl.deregisterAddListener(INSTANCE.getLogPublishersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void addLogPublisherDeleteListener(
        ConfigurationDeleteListener<LogPublisherCfg> listener) throws ConfigException {
      impl.registerDeleteListener(INSTANCE.getLogPublishersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeLogPublisherDeleteListener(
        ConfigurationDeleteListener<LogPublisherCfg> listener) {
      impl.deregisterDeleteListener(INSTANCE.getLogPublishersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listLogRetentionPolicies() {
      return impl.listChildren(INSTANCE.getLogRetentionPoliciesRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public LogRetentionPolicyCfg getLogRetentionPolicy(String name) throws ConfigException {
      return impl.getChild(INSTANCE.getLogRetentionPoliciesRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void addLogRetentionPolicyAddListener(
        ConfigurationAddListener<LogRetentionPolicyCfg> listener) throws ConfigException {
      impl.registerAddListener(INSTANCE.getLogRetentionPoliciesRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeLogRetentionPolicyAddListener(
        ConfigurationAddListener<LogRetentionPolicyCfg> listener) {
      impl.deregisterAddListener(INSTANCE.getLogRetentionPoliciesRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void addLogRetentionPolicyDeleteListener(
        ConfigurationDeleteListener<LogRetentionPolicyCfg> listener) throws ConfigException {
      impl.registerDeleteListener(INSTANCE.getLogRetentionPoliciesRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeLogRetentionPolicyDeleteListener(
        ConfigurationDeleteListener<LogRetentionPolicyCfg> listener) {
      impl.deregisterDeleteListener(INSTANCE.getLogRetentionPoliciesRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listLogRotationPolicies() {
      return impl.listChildren(INSTANCE.getLogRotationPoliciesRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public LogRotationPolicyCfg getLogRotationPolicy(String name) throws ConfigException {
      return impl.getChild(INSTANCE.getLogRotationPoliciesRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void addLogRotationPolicyAddListener(
        ConfigurationAddListener<LogRotationPolicyCfg> listener) throws ConfigException {
      impl.registerAddListener(INSTANCE.getLogRotationPoliciesRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeLogRotationPolicyAddListener(
        ConfigurationAddListener<LogRotationPolicyCfg> listener) {
      impl.deregisterAddListener(INSTANCE.getLogRotationPoliciesRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void addLogRotationPolicyDeleteListener(
        ConfigurationDeleteListener<LogRotationPolicyCfg> listener) throws ConfigException {
      impl.registerDeleteListener(INSTANCE.getLogRotationPoliciesRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeLogRotationPolicyDeleteListener(
        ConfigurationDeleteListener<LogRotationPolicyCfg> listener) {
      impl.deregisterDeleteListener(INSTANCE.getLogRotationPoliciesRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listMatchingRules() {
      return impl.listChildren(INSTANCE.getMatchingRulesRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public MatchingRuleCfg getMatchingRule(String name) throws ConfigException {
      return impl.getChild(INSTANCE.getMatchingRulesRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void addMatchingRuleAddListener(
        ConfigurationAddListener<MatchingRuleCfg> listener) throws ConfigException {
      impl.registerAddListener(INSTANCE.getMatchingRulesRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeMatchingRuleAddListener(
        ConfigurationAddListener<MatchingRuleCfg> listener) {
      impl.deregisterAddListener(INSTANCE.getMatchingRulesRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void addMatchingRuleDeleteListener(
        ConfigurationDeleteListener<MatchingRuleCfg> listener) throws ConfigException {
      impl.registerDeleteListener(INSTANCE.getMatchingRulesRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeMatchingRuleDeleteListener(
        ConfigurationDeleteListener<MatchingRuleCfg> listener) {
      impl.deregisterDeleteListener(INSTANCE.getMatchingRulesRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listMonitorProviders() {
      return impl.listChildren(INSTANCE.getMonitorProvidersRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public MonitorProviderCfg getMonitorProvider(String name) throws ConfigException {
      return impl.getChild(INSTANCE.getMonitorProvidersRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void addMonitorProviderAddListener(
        ConfigurationAddListener<MonitorProviderCfg> listener) throws ConfigException {
      impl.registerAddListener(INSTANCE.getMonitorProvidersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeMonitorProviderAddListener(
        ConfigurationAddListener<MonitorProviderCfg> listener) {
      impl.deregisterAddListener(INSTANCE.getMonitorProvidersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void addMonitorProviderDeleteListener(
        ConfigurationDeleteListener<MonitorProviderCfg> listener) throws ConfigException {
      impl.registerDeleteListener(INSTANCE.getMonitorProvidersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeMonitorProviderDeleteListener(
        ConfigurationDeleteListener<MonitorProviderCfg> listener) {
      impl.deregisterDeleteListener(INSTANCE.getMonitorProvidersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listNetworkGroups() {
      return impl.listChildren(INSTANCE.getNetworkGroupsRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public NetworkGroupCfg getNetworkGroup(String name) throws ConfigException {
      return impl.getChild(INSTANCE.getNetworkGroupsRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void addNetworkGroupAddListener(
        ConfigurationAddListener<NetworkGroupCfg> listener) throws ConfigException {
      impl.registerAddListener(INSTANCE.getNetworkGroupsRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeNetworkGroupAddListener(
        ConfigurationAddListener<NetworkGroupCfg> listener) {
      impl.deregisterAddListener(INSTANCE.getNetworkGroupsRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void addNetworkGroupDeleteListener(
        ConfigurationDeleteListener<NetworkGroupCfg> listener) throws ConfigException {
      impl.registerDeleteListener(INSTANCE.getNetworkGroupsRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeNetworkGroupDeleteListener(
        ConfigurationDeleteListener<NetworkGroupCfg> listener) {
      impl.deregisterDeleteListener(INSTANCE.getNetworkGroupsRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listPasswordGenerators() {
      return impl.listChildren(INSTANCE.getPasswordGeneratorsRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public PasswordGeneratorCfg getPasswordGenerator(String name) throws ConfigException {
      return impl.getChild(INSTANCE.getPasswordGeneratorsRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void addPasswordGeneratorAddListener(
        ConfigurationAddListener<PasswordGeneratorCfg> listener) throws ConfigException {
      impl.registerAddListener(INSTANCE.getPasswordGeneratorsRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removePasswordGeneratorAddListener(
        ConfigurationAddListener<PasswordGeneratorCfg> listener) {
      impl.deregisterAddListener(INSTANCE.getPasswordGeneratorsRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void addPasswordGeneratorDeleteListener(
        ConfigurationDeleteListener<PasswordGeneratorCfg> listener) throws ConfigException {
      impl.registerDeleteListener(INSTANCE.getPasswordGeneratorsRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removePasswordGeneratorDeleteListener(
        ConfigurationDeleteListener<PasswordGeneratorCfg> listener) {
      impl.deregisterDeleteListener(INSTANCE.getPasswordGeneratorsRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listPasswordPolicies() {
      return impl.listChildren(INSTANCE.getPasswordPoliciesRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public PasswordPolicyCfg getPasswordPolicy(String name) throws ConfigException {
      return impl.getChild(INSTANCE.getPasswordPoliciesRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void addPasswordPolicyAddListener(
        ConfigurationAddListener<PasswordPolicyCfg> listener) throws ConfigException {
      impl.registerAddListener(INSTANCE.getPasswordPoliciesRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removePasswordPolicyAddListener(
        ConfigurationAddListener<PasswordPolicyCfg> listener) {
      impl.deregisterAddListener(INSTANCE.getPasswordPoliciesRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void addPasswordPolicyDeleteListener(
        ConfigurationDeleteListener<PasswordPolicyCfg> listener) throws ConfigException {
      impl.registerDeleteListener(INSTANCE.getPasswordPoliciesRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removePasswordPolicyDeleteListener(
        ConfigurationDeleteListener<PasswordPolicyCfg> listener) {
      impl.deregisterDeleteListener(INSTANCE.getPasswordPoliciesRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listPasswordStorageSchemes() {
      return impl.listChildren(INSTANCE.getPasswordStorageSchemesRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public PasswordStorageSchemeCfg getPasswordStorageScheme(String name) throws ConfigException {
      return impl.getChild(INSTANCE.getPasswordStorageSchemesRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void addPasswordStorageSchemeAddListener(
        ConfigurationAddListener<PasswordStorageSchemeCfg> listener) throws ConfigException {
      impl.registerAddListener(INSTANCE.getPasswordStorageSchemesRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removePasswordStorageSchemeAddListener(
        ConfigurationAddListener<PasswordStorageSchemeCfg> listener) {
      impl.deregisterAddListener(INSTANCE.getPasswordStorageSchemesRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void addPasswordStorageSchemeDeleteListener(
        ConfigurationDeleteListener<PasswordStorageSchemeCfg> listener) throws ConfigException {
      impl.registerDeleteListener(INSTANCE.getPasswordStorageSchemesRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removePasswordStorageSchemeDeleteListener(
        ConfigurationDeleteListener<PasswordStorageSchemeCfg> listener) {
      impl.deregisterDeleteListener(INSTANCE.getPasswordStorageSchemesRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listPasswordValidators() {
      return impl.listChildren(INSTANCE.getPasswordValidatorsRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public PasswordValidatorCfg getPasswordValidator(String name) throws ConfigException {
      return impl.getChild(INSTANCE.getPasswordValidatorsRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void addPasswordValidatorAddListener(
        ConfigurationAddListener<PasswordValidatorCfg> listener) throws ConfigException {
      impl.registerAddListener(INSTANCE.getPasswordValidatorsRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removePasswordValidatorAddListener(
        ConfigurationAddListener<PasswordValidatorCfg> listener) {
      impl.deregisterAddListener(INSTANCE.getPasswordValidatorsRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void addPasswordValidatorDeleteListener(
        ConfigurationDeleteListener<PasswordValidatorCfg> listener) throws ConfigException {
      impl.registerDeleteListener(INSTANCE.getPasswordValidatorsRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removePasswordValidatorDeleteListener(
        ConfigurationDeleteListener<PasswordValidatorCfg> listener) {
      impl.deregisterDeleteListener(INSTANCE.getPasswordValidatorsRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public PluginRootCfg getPluginRoot() throws ConfigException {
      return impl.getChild(INSTANCE.getPluginRootRelationDefinition()).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public RootDNCfg getRootDN() throws ConfigException {
      return impl.getChild(INSTANCE.getRootDNRelationDefinition()).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public RootDSEBackendCfg getRootDSEBackend() throws ConfigException {
      return impl.getChild(INSTANCE.getRootDSEBackendRelationDefinition()).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public String[] listSASLMechanismHandlers() {
      return impl.listChildren(INSTANCE.getSASLMechanismHandlersRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public SASLMechanismHandlerCfg getSASLMechanismHandler(String name) throws ConfigException {
      return impl.getChild(INSTANCE.getSASLMechanismHandlersRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void addSASLMechanismHandlerAddListener(
        ConfigurationAddListener<SASLMechanismHandlerCfg> listener) throws ConfigException {
      impl.registerAddListener(INSTANCE.getSASLMechanismHandlersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeSASLMechanismHandlerAddListener(
        ConfigurationAddListener<SASLMechanismHandlerCfg> listener) {
      impl.deregisterAddListener(INSTANCE.getSASLMechanismHandlersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void addSASLMechanismHandlerDeleteListener(
        ConfigurationDeleteListener<SASLMechanismHandlerCfg> listener) throws ConfigException {
      impl.registerDeleteListener(INSTANCE.getSASLMechanismHandlersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeSASLMechanismHandlerDeleteListener(
        ConfigurationDeleteListener<SASLMechanismHandlerCfg> listener) {
      impl.deregisterDeleteListener(INSTANCE.getSASLMechanismHandlersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listSynchronizationProviders() {
      return impl.listChildren(INSTANCE.getSynchronizationProvidersRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public SynchronizationProviderCfg getSynchronizationProvider(String name) throws ConfigException {
      return impl.getChild(INSTANCE.getSynchronizationProvidersRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void addSynchronizationProviderAddListener(
        ConfigurationAddListener<SynchronizationProviderCfg> listener) throws ConfigException {
      impl.registerAddListener(INSTANCE.getSynchronizationProvidersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeSynchronizationProviderAddListener(
        ConfigurationAddListener<SynchronizationProviderCfg> listener) {
      impl.deregisterAddListener(INSTANCE.getSynchronizationProvidersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void addSynchronizationProviderDeleteListener(
        ConfigurationDeleteListener<SynchronizationProviderCfg> listener) throws ConfigException {
      impl.registerDeleteListener(INSTANCE.getSynchronizationProvidersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeSynchronizationProviderDeleteListener(
        ConfigurationDeleteListener<SynchronizationProviderCfg> listener) {
      impl.deregisterDeleteListener(INSTANCE.getSynchronizationProvidersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listTrustManagerProviders() {
      return impl.listChildren(INSTANCE.getTrustManagerProvidersRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public TrustManagerProviderCfg getTrustManagerProvider(String name) throws ConfigException {
      return impl.getChild(INSTANCE.getTrustManagerProvidersRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void addTrustManagerProviderAddListener(
        ConfigurationAddListener<TrustManagerProviderCfg> listener) throws ConfigException {
      impl.registerAddListener(INSTANCE.getTrustManagerProvidersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeTrustManagerProviderAddListener(
        ConfigurationAddListener<TrustManagerProviderCfg> listener) {
      impl.deregisterAddListener(INSTANCE.getTrustManagerProvidersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void addTrustManagerProviderDeleteListener(
        ConfigurationDeleteListener<TrustManagerProviderCfg> listener) throws ConfigException {
      impl.registerDeleteListener(INSTANCE.getTrustManagerProvidersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeTrustManagerProviderDeleteListener(
        ConfigurationDeleteListener<TrustManagerProviderCfg> listener) {
      impl.deregisterDeleteListener(INSTANCE.getTrustManagerProvidersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listVirtualAttributes() {
      return impl.listChildren(INSTANCE.getVirtualAttributesRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public VirtualAttributeCfg getVirtualAttribute(String name) throws ConfigException {
      return impl.getChild(INSTANCE.getVirtualAttributesRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void addVirtualAttributeAddListener(
        ConfigurationAddListener<VirtualAttributeCfg> listener) throws ConfigException {
      impl.registerAddListener(INSTANCE.getVirtualAttributesRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeVirtualAttributeAddListener(
        ConfigurationAddListener<VirtualAttributeCfg> listener) {
      impl.deregisterAddListener(INSTANCE.getVirtualAttributesRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void addVirtualAttributeDeleteListener(
        ConfigurationDeleteListener<VirtualAttributeCfg> listener) throws ConfigException {
      impl.registerDeleteListener(INSTANCE.getVirtualAttributesRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeVirtualAttributeDeleteListener(
        ConfigurationDeleteListener<VirtualAttributeCfg> listener) {
      impl.deregisterDeleteListener(INSTANCE.getVirtualAttributesRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listWorkflows() {
      return impl.listChildren(INSTANCE.getWorkflowsRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public WorkflowCfg getWorkflow(String name) throws ConfigException {
      return impl.getChild(INSTANCE.getWorkflowsRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void addWorkflowAddListener(
        ConfigurationAddListener<WorkflowCfg> listener) throws ConfigException {
      impl.registerAddListener(INSTANCE.getWorkflowsRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeWorkflowAddListener(
        ConfigurationAddListener<WorkflowCfg> listener) {
      impl.deregisterAddListener(INSTANCE.getWorkflowsRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void addWorkflowDeleteListener(
        ConfigurationDeleteListener<WorkflowCfg> listener) throws ConfigException {
      impl.registerDeleteListener(INSTANCE.getWorkflowsRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeWorkflowDeleteListener(
        ConfigurationDeleteListener<WorkflowCfg> listener) {
      impl.deregisterDeleteListener(INSTANCE.getWorkflowsRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listWorkflowElements() {
      return impl.listChildren(INSTANCE.getWorkflowElementsRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public WorkflowElementCfg getWorkflowElement(String name) throws ConfigException {
      return impl.getChild(INSTANCE.getWorkflowElementsRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void addWorkflowElementAddListener(
        ConfigurationAddListener<WorkflowElementCfg> listener) throws ConfigException {
      impl.registerAddListener(INSTANCE.getWorkflowElementsRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeWorkflowElementAddListener(
        ConfigurationAddListener<WorkflowElementCfg> listener) {
      impl.deregisterAddListener(INSTANCE.getWorkflowElementsRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void addWorkflowElementDeleteListener(
        ConfigurationDeleteListener<WorkflowElementCfg> listener) throws ConfigException {
      impl.registerDeleteListener(INSTANCE.getWorkflowElementsRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeWorkflowElementDeleteListener(
        ConfigurationDeleteListener<WorkflowElementCfg> listener) {
      impl.deregisterDeleteListener(INSTANCE.getWorkflowElementsRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public WorkQueueCfg getWorkQueue() throws ConfigException {
      return impl.getChild(INSTANCE.getWorkQueueRelationDefinition()).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public Class<? extends RootCfg> configurationClass() {
      return RootCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
