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
import java.util.SortedSet;
import org.opends.server.admin.AdministratorAction;
import org.opends.server.admin.client.AuthorizationException;
import org.opends.server.admin.client.CommunicationException;
import org.opends.server.admin.client.ConcurrentModificationException;
import org.opends.server.admin.client.IllegalManagedObjectNameException;
import org.opends.server.admin.client.ManagedObject;
import org.opends.server.admin.client.ManagedObjectDecodingException;
import org.opends.server.admin.client.MissingMandatoryPropertiesException;
import org.opends.server.admin.client.OperationRejectedException;
import org.opends.server.admin.DefaultBehaviorException;
import org.opends.server.admin.DefaultBehaviorProvider;
import org.opends.server.admin.DefinedDefaultBehaviorProvider;
import org.opends.server.admin.DefinitionDecodingException;
import org.opends.server.admin.EnumPropertyDefinition;
import org.opends.server.admin.InstantiableRelationDefinition;
import org.opends.server.admin.ManagedObjectAlreadyExistsException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.ManagedObjectNotFoundException;
import org.opends.server.admin.PropertyOption;
import org.opends.server.admin.PropertyProvider;
import org.opends.server.admin.RelationOption;
import org.opends.server.admin.server.ConfigurationAddListener;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.server.ConfigurationDeleteListener;
import org.opends.server.admin.server.ServerManagedObject;
import org.opends.server.admin.std.client.RootDNCfgClient;
import org.opends.server.admin.std.client.RootDNUserCfgClient;
import org.opends.server.admin.std.server.RootDNCfg;
import org.opends.server.admin.std.server.RootDNUserCfg;
import org.opends.server.admin.Tag;
import org.opends.server.admin.TopCfgDefn;
import org.opends.server.config.ConfigException;
import org.opends.server.types.DN;



/**
 * An interface for querying the Root DN managed object definition
 * meta information.
 * <p>
 * The Root DN configuration contains all the Root DN Users defined in
 * the Directory Server. In addition, it also defines the default set
 * of privileges that Root DN Users automatically inherit.
 */
public final class RootDNCfgDefn extends ManagedObjectDefinition<RootDNCfgClient, RootDNCfg> {

  // The singleton configuration definition instance.
  private static final RootDNCfgDefn INSTANCE = new RootDNCfgDefn();



  /**
   * Defines the set of permissable values for the "default-root-privilege-name" property.
   * <p>
   * Specifies the names of the privileges that root users will be
   * granted by default.
   */
  public static enum DefaultRootPrivilegeName {

    /**
     * Allows the user to request that the server process backup
     * tasks.
     */
    BACKEND_BACKUP("backend-backup"),



    /**
     * Allows the user to request that the server process restore
     * tasks.
     */
    BACKEND_RESTORE("backend-restore"),



    /**
     * Allows the associated user to bypass access control checks
     * performed by the server.
     */
    BYPASS_ACL("bypass-acl"),



    /**
     * Allows the associated user to bypass server lockdown mode.
     */
    BYPASS_LOCKDOWN("bypass-lockdown"),



    /**
     * Allows the user to cancel operations in progress on other
     * client connections.
     */
    CANCEL_REQUEST("cancel-request"),



    /**
     * Allows the associated user to read the server configuration.
     */
    CONFIG_READ("config-read"),



    /**
     * Allows the associated user to update the server configuration.
     * The config-read privilege is also required.
     */
    CONFIG_WRITE("config-write"),



    /**
     * Allows the user to participate in data synchronization.
     */
    DATA_SYNC("data-sync"),



    /**
     * Allows the user to terminate other client connections.
     */
    DISCONNECT_CLIENT("disconnect-client"),



    /**
     * Allows the associated user to subscribe to receive JMX
     * notifications.
     */
    JMX_NOTIFY("jmx-notify"),



    /**
     * Allows the associated user to perform JMX read operations.
     */
    JMX_READ("jmx-read"),



    /**
     * Allows the associated user to perform JMX write operations.
     */
    JMX_WRITE("jmx-write"),



    /**
     * Allows the user to request that the server process LDIF export
     * tasks.
     */
    LDIF_EXPORT("ldif-export"),



    /**
     * Allows the user to request that the server process LDIF import
     * tasks.
     */
    LDIF_IMPORT("ldif-import"),



    /**
     * Allows the associated user to modify the server's access
     * control configuration.
     */
    MODIFY_ACL("modify-acl"),



    /**
     * Allows the user to reset user passwords.
     */
    PASSWORD_RESET("password-reset"),



    /**
     * Allows the user to make changes to the set of defined root
     * privileges, as well as to grant and revoke privileges for users.
     */
    PRIVILEGE_CHANGE("privilege-change"),



    /**
     * Allows the user to use the proxied authorization control, or to
     * perform a bind that specifies an alternate authorization
     * identity.
     */
    PROXIED_AUTH("proxied-auth"),



    /**
     * Allows the user to place and bring the server of lockdown mode.
     */
    SERVER_LOCKDOWN("server-lockdown"),



    /**
     * Allows the user to request that the server perform an in-core
     * restart.
     */
    SERVER_RESTART("server-restart"),



    /**
     * Allows the user to request that the server shut down.
     */
    SERVER_SHUTDOWN("server-shutdown"),



    /**
     * Allows the associated user to perform LDAP subentry write
     * operations.
     */
    SUBENTRY_WRITE("subentry-write"),



    /**
     * Allows the user to request that the server process a search
     * that cannot be optimized using server indexes.
     */
    UNINDEXED_SEARCH("unindexed-search"),



    /**
     * Allows the user to make changes to the server schema.
     */
    UPDATE_SCHEMA("update-schema");



    // String representation of the value.
    private final String name;



    // Private constructor.
    private DefaultRootPrivilegeName(String name) { this.name = name; }



    /**
     * {@inheritDoc}
     */
    public String toString() { return name; }

  }



  // The "default-root-privilege-name" property definition.
  private static final EnumPropertyDefinition<DefaultRootPrivilegeName> PD_DEFAULT_ROOT_PRIVILEGE_NAME;



  // The "root-dn-users" relation definition.
  private static final InstantiableRelationDefinition<RootDNUserCfgClient, RootDNUserCfg> RD_ROOT_DN_USERS;



  // Build the "default-root-privilege-name" property definition.
  static {
      EnumPropertyDefinition.Builder<DefaultRootPrivilegeName> builder = EnumPropertyDefinition.createBuilder(INSTANCE, "default-root-privilege-name");
      builder.setOption(PropertyOption.MULTI_VALUED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "default-root-privilege-name"));
      DefaultBehaviorProvider<DefaultRootPrivilegeName> provider = new DefinedDefaultBehaviorProvider<DefaultRootPrivilegeName>("bypass-lockdown", "bypass-acl", "modify-acl", "config-read", "config-write", "ldif-import", "ldif-export", "backend-backup", "backend-restore", "server-lockdown", "server-shutdown", "server-restart", "disconnect-client", "cancel-request", "password-reset", "update-schema", "privilege-change", "unindexed-search", "subentry-write");
      builder.setDefaultBehaviorProvider(provider);
      builder.setEnumClass(DefaultRootPrivilegeName.class);
      PD_DEFAULT_ROOT_PRIVILEGE_NAME = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_DEFAULT_ROOT_PRIVILEGE_NAME);
  }



  // Build the "root-dn-users" relation definition.
  static {
    InstantiableRelationDefinition.Builder<RootDNUserCfgClient, RootDNUserCfg> builder =
      new InstantiableRelationDefinition.Builder<RootDNUserCfgClient, RootDNUserCfg>(INSTANCE, "root-dn-user", "root-dn-users", RootDNUserCfgDefn.getInstance());
    builder.setOption(RelationOption.HIDDEN);
    RD_ROOT_DN_USERS = builder.getInstance();
    INSTANCE.registerRelationDefinition(RD_ROOT_DN_USERS);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("core-server"));
  }



  /**
   * Get the Root DN configuration definition singleton.
   *
   * @return Returns the Root DN configuration definition singleton.
   */
  public static RootDNCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private RootDNCfgDefn() {
    super("root-dn", TopCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public RootDNCfgClient createClientConfiguration(
      ManagedObject<? extends RootDNCfgClient> impl) {
    return new RootDNCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public RootDNCfg createServerConfiguration(
      ServerManagedObject<? extends RootDNCfg> impl) {
    return new RootDNCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<RootDNCfg> getServerConfigurationClass() {
    return RootDNCfg.class;
  }



  /**
   * Get the "default-root-privilege-name" property definition.
   * <p>
   * Specifies the names of the privileges that root users will be
   * granted by default.
   *
   * @return Returns the "default-root-privilege-name" property definition.
   */
  public EnumPropertyDefinition<DefaultRootPrivilegeName> getDefaultRootPrivilegeNamePropertyDefinition() {
    return PD_DEFAULT_ROOT_PRIVILEGE_NAME;
  }



  /**
   * Get the "root-dn-users" relation definition.
   *
   * @return Returns the "root-dn-users" relation definition.
   */
  public InstantiableRelationDefinition<RootDNUserCfgClient,RootDNUserCfg> getRootDNUsersRelationDefinition() {
    return RD_ROOT_DN_USERS;
  }



  /**
   * Managed object client implementation.
   */
  private static class RootDNCfgClientImpl implements
    RootDNCfgClient {

    // Private implementation.
    private ManagedObject<? extends RootDNCfgClient> impl;



    // Private constructor.
    private RootDNCfgClientImpl(
        ManagedObject<? extends RootDNCfgClient> impl) {
      this.impl = impl;
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<DefaultRootPrivilegeName> getDefaultRootPrivilegeName() {
      return impl.getPropertyValues(INSTANCE.getDefaultRootPrivilegeNamePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setDefaultRootPrivilegeName(Collection<DefaultRootPrivilegeName> values) {
      impl.setPropertyValues(INSTANCE.getDefaultRootPrivilegeNamePropertyDefinition(), values);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listRootDNUsers() throws ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.listChildren(INSTANCE.getRootDNUsersRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public RootDNUserCfgClient getRootDNUser(String name)
        throws DefinitionDecodingException, ManagedObjectDecodingException,
        ManagedObjectNotFoundException, ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.getChild(INSTANCE.getRootDNUsersRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public <M extends RootDNUserCfgClient> M createRootDNUser(
        ManagedObjectDefinition<M, ? extends RootDNUserCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException {
      return impl.createChild(INSTANCE.getRootDNUsersRelationDefinition(), d, name, exceptions).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void removeRootDNUser(String name)
        throws ManagedObjectNotFoundException, ConcurrentModificationException,
        OperationRejectedException, AuthorizationException, CommunicationException {
      impl.removeChild(INSTANCE.getRootDNUsersRelationDefinition(), name);
    }



    /**
     * {@inheritDoc}
     */
    public ManagedObjectDefinition<? extends RootDNCfgClient, ? extends RootDNCfg> definition() {
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
  private static class RootDNCfgServerImpl implements
    RootDNCfg {

    // Private implementation.
    private ServerManagedObject<? extends RootDNCfg> impl;

    // The value of the "default-root-privilege-name" property.
    private final SortedSet<DefaultRootPrivilegeName> pDefaultRootPrivilegeName;



    // Private constructor.
    private RootDNCfgServerImpl(ServerManagedObject<? extends RootDNCfg> impl) {
      this.impl = impl;
      this.pDefaultRootPrivilegeName = impl.getPropertyValues(INSTANCE.getDefaultRootPrivilegeNamePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addChangeListener(
        ConfigurationChangeListener<RootDNCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeChangeListener(
        ConfigurationChangeListener<RootDNCfg> listener) {
      impl.deregisterChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<DefaultRootPrivilegeName> getDefaultRootPrivilegeName() {
      return pDefaultRootPrivilegeName;
    }



    /**
     * {@inheritDoc}
     */
    public String[] listRootDNUsers() {
      return impl.listChildren(INSTANCE.getRootDNUsersRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public RootDNUserCfg getRootDNUser(String name) throws ConfigException {
      return impl.getChild(INSTANCE.getRootDNUsersRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void addRootDNUserAddListener(
        ConfigurationAddListener<RootDNUserCfg> listener) throws ConfigException {
      impl.registerAddListener(INSTANCE.getRootDNUsersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeRootDNUserAddListener(
        ConfigurationAddListener<RootDNUserCfg> listener) {
      impl.deregisterAddListener(INSTANCE.getRootDNUsersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void addRootDNUserDeleteListener(
        ConfigurationDeleteListener<RootDNUserCfg> listener) throws ConfigException {
      impl.registerDeleteListener(INSTANCE.getRootDNUsersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeRootDNUserDeleteListener(
        ConfigurationDeleteListener<RootDNUserCfg> listener) {
      impl.deregisterDeleteListener(INSTANCE.getRootDNUsersRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public Class<? extends RootDNCfg> configurationClass() {
      return RootDNCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
