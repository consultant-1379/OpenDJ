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
import org.opends.server.admin.BooleanPropertyDefinition;
import org.opends.server.admin.ClassPropertyDefinition;
import org.opends.server.admin.client.AuthorizationException;
import org.opends.server.admin.client.CommunicationException;
import org.opends.server.admin.client.ConcurrentModificationException;
import org.opends.server.admin.client.ManagedObject;
import org.opends.server.admin.client.MissingMandatoryPropertiesException;
import org.opends.server.admin.client.OperationRejectedException;
import org.opends.server.admin.DefaultBehaviorProvider;
import org.opends.server.admin.DefinedDefaultBehaviorProvider;
import org.opends.server.admin.EnumPropertyDefinition;
import org.opends.server.admin.ManagedObjectAlreadyExistsException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.PropertyOption;
import org.opends.server.admin.PropertyProvider;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.server.ServerManagedObject;
import org.opends.server.admin.std.client.ErrorLogAccountStatusNotificationHandlerCfgClient;
import org.opends.server.admin.std.server.AccountStatusNotificationHandlerCfg;
import org.opends.server.admin.std.server.ErrorLogAccountStatusNotificationHandlerCfg;
import org.opends.server.admin.Tag;
import org.opends.server.admin.UndefinedDefaultBehaviorProvider;
import org.opends.server.types.DN;



/**
 * An interface for querying the Error Log Account Status Notification
 * Handler managed object definition meta information.
 * <p>
 * The Error Log Account Status Notification Handler is a notification
 * handler that writes information to the server error log whenever an
 * appropriate account status event occurs.
 */
public final class ErrorLogAccountStatusNotificationHandlerCfgDefn extends ManagedObjectDefinition<ErrorLogAccountStatusNotificationHandlerCfgClient, ErrorLogAccountStatusNotificationHandlerCfg> {

  // The singleton configuration definition instance.
  private static final ErrorLogAccountStatusNotificationHandlerCfgDefn INSTANCE = new ErrorLogAccountStatusNotificationHandlerCfgDefn();



  /**
   * Defines the set of permissable values for the "account-status-notification-type" property.
   * <p>
   * Indicates which types of event can trigger an account status
   * notification.
   */
  public static enum AccountStatusNotificationType {

    /**
     * Generate a notification whenever a user account has been
     * disabled by an administrator.
     */
    ACCOUNT_DISABLED("account-disabled"),



    /**
     * Generate a notification whenever a user account has been
     * enabled by an administrator.
     */
    ACCOUNT_ENABLED("account-enabled"),



    /**
     * Generate a notification whenever a user authentication has
     * failed because the account has expired.
     */
    ACCOUNT_EXPIRED("account-expired"),



    /**
     * Generate a notification whenever a user account has been locked
     * because it was idle for too long.
     */
    ACCOUNT_IDLE_LOCKED("account-idle-locked"),



    /**
     * Generate a notification whenever a user account has been
     * permanently locked after too many failed attempts.
     */
    ACCOUNT_PERMANENTLY_LOCKED("account-permanently-locked"),



    /**
     * Generate a notification whenever a user account has been
     * locked, because the password had been reset by an administrator
     * but not changed by the user within the required interval.
     */
    ACCOUNT_RESET_LOCKED("account-reset-locked"),



    /**
     * Generate a notification whenever a user account has been
     * temporarily locked after too many failed attempts.
     */
    ACCOUNT_TEMPORARILY_LOCKED("account-temporarily-locked"),



    /**
     * Generate a notification whenever a user account has been
     * unlocked by an administrator.
     */
    ACCOUNT_UNLOCKED("account-unlocked"),



    /**
     * Generate a notification whenever a user changes his/her own
     * password.
     */
    PASSWORD_CHANGED("password-changed"),



    /**
     * Generate a notification whenever a user authentication has
     * failed because the password has expired.
     */
    PASSWORD_EXPIRED("password-expired"),



    /**
     * Generate a notification whenever a password expiration warning
     * is encountered for a user password for the first time.
     */
    PASSWORD_EXPIRING("password-expiring"),



    /**
     * Generate a notification whenever a user's password is reset by
     * an administrator.
     */
    PASSWORD_RESET("password-reset");



    // String representation of the value.
    private final String name;



    // Private constructor.
    private AccountStatusNotificationType(String name) { this.name = name; }



    /**
     * {@inheritDoc}
     */
    public String toString() { return name; }

  }



  // The "account-status-notification-type" property definition.
  private static final EnumPropertyDefinition<AccountStatusNotificationType> PD_ACCOUNT_STATUS_NOTIFICATION_TYPE;



  // The "java-class" property definition.
  private static final ClassPropertyDefinition PD_JAVA_CLASS;



  // Build the "account-status-notification-type" property definition.
  static {
      EnumPropertyDefinition.Builder<AccountStatusNotificationType> builder = EnumPropertyDefinition.createBuilder(INSTANCE, "account-status-notification-type");
      builder.setOption(PropertyOption.MULTI_VALUED);
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "account-status-notification-type"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<AccountStatusNotificationType>());
      builder.setEnumClass(AccountStatusNotificationType.class);
      PD_ACCOUNT_STATUS_NOTIFICATION_TYPE = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_ACCOUNT_STATUS_NOTIFICATION_TYPE);
  }



  // Build the "java-class" property definition.
  static {
      ClassPropertyDefinition.Builder builder = ClassPropertyDefinition.createBuilder(INSTANCE, "java-class");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.COMPONENT_RESTART, INSTANCE, "java-class"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("org.opends.server.extensions.ErrorLogAccountStatusNotificationHandler");
      builder.setDefaultBehaviorProvider(provider);
      builder.addInstanceOf("org.opends.server.api.AccountStatusNotificationHandler");
      PD_JAVA_CLASS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_JAVA_CLASS);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("user-management"));
  }



  /**
   * Get the Error Log Account Status Notification Handler
   * configuration definition singleton.
   *
   * @return Returns the Error Log Account Status Notification Handler
   *         configuration definition singleton.
   */
  public static ErrorLogAccountStatusNotificationHandlerCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private ErrorLogAccountStatusNotificationHandlerCfgDefn() {
    super("error-log-account-status-notification-handler", AccountStatusNotificationHandlerCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public ErrorLogAccountStatusNotificationHandlerCfgClient createClientConfiguration(
      ManagedObject<? extends ErrorLogAccountStatusNotificationHandlerCfgClient> impl) {
    return new ErrorLogAccountStatusNotificationHandlerCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public ErrorLogAccountStatusNotificationHandlerCfg createServerConfiguration(
      ServerManagedObject<? extends ErrorLogAccountStatusNotificationHandlerCfg> impl) {
    return new ErrorLogAccountStatusNotificationHandlerCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<ErrorLogAccountStatusNotificationHandlerCfg> getServerConfigurationClass() {
    return ErrorLogAccountStatusNotificationHandlerCfg.class;
  }



  /**
   * Get the "account-status-notification-type" property definition.
   * <p>
   * Indicates which types of event can trigger an account status
   * notification.
   *
   * @return Returns the "account-status-notification-type" property definition.
   */
  public EnumPropertyDefinition<AccountStatusNotificationType> getAccountStatusNotificationTypePropertyDefinition() {
    return PD_ACCOUNT_STATUS_NOTIFICATION_TYPE;
  }



  /**
   * Get the "enabled" property definition.
   * <p>
   * Indicates whether the Error Log Account Status Notification
   * Handler is enabled. Only enabled handlers are invoked whenever a
   * related event occurs in the server.
   *
   * @return Returns the "enabled" property definition.
   */
  public BooleanPropertyDefinition getEnabledPropertyDefinition() {
    return AccountStatusNotificationHandlerCfgDefn.getInstance().getEnabledPropertyDefinition();
  }



  /**
   * Get the "java-class" property definition.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Error Log Account Status Notification Handler
   * implementation.
   *
   * @return Returns the "java-class" property definition.
   */
  public ClassPropertyDefinition getJavaClassPropertyDefinition() {
    return PD_JAVA_CLASS;
  }



  /**
   * Managed object client implementation.
   */
  private static class ErrorLogAccountStatusNotificationHandlerCfgClientImpl implements
    ErrorLogAccountStatusNotificationHandlerCfgClient {

    // Private implementation.
    private ManagedObject<? extends ErrorLogAccountStatusNotificationHandlerCfgClient> impl;



    // Private constructor.
    private ErrorLogAccountStatusNotificationHandlerCfgClientImpl(
        ManagedObject<? extends ErrorLogAccountStatusNotificationHandlerCfgClient> impl) {
      this.impl = impl;
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<AccountStatusNotificationType> getAccountStatusNotificationType() {
      return impl.getPropertyValues(INSTANCE.getAccountStatusNotificationTypePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setAccountStatusNotificationType(Collection<AccountStatusNotificationType> values) {
      impl.setPropertyValues(INSTANCE.getAccountStatusNotificationTypePropertyDefinition(), values);
    }



    /**
     * {@inheritDoc}
     */
    public Boolean isEnabled() {
      return impl.getPropertyValue(INSTANCE.getEnabledPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setEnabled(boolean value) {
      impl.setPropertyValue(INSTANCE.getEnabledPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public String getJavaClass() {
      return impl.getPropertyValue(INSTANCE.getJavaClassPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setJavaClass(String value) {
      impl.setPropertyValue(INSTANCE.getJavaClassPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public ManagedObjectDefinition<? extends ErrorLogAccountStatusNotificationHandlerCfgClient, ? extends ErrorLogAccountStatusNotificationHandlerCfg> definition() {
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
  private static class ErrorLogAccountStatusNotificationHandlerCfgServerImpl implements
    ErrorLogAccountStatusNotificationHandlerCfg {

    // Private implementation.
    private ServerManagedObject<? extends ErrorLogAccountStatusNotificationHandlerCfg> impl;

    // The value of the "account-status-notification-type" property.
    private final SortedSet<AccountStatusNotificationType> pAccountStatusNotificationType;

    // The value of the "enabled" property.
    private final boolean pEnabled;

    // The value of the "java-class" property.
    private final String pJavaClass;



    // Private constructor.
    private ErrorLogAccountStatusNotificationHandlerCfgServerImpl(ServerManagedObject<? extends ErrorLogAccountStatusNotificationHandlerCfg> impl) {
      this.impl = impl;
      this.pAccountStatusNotificationType = impl.getPropertyValues(INSTANCE.getAccountStatusNotificationTypePropertyDefinition());
      this.pEnabled = impl.getPropertyValue(INSTANCE.getEnabledPropertyDefinition());
      this.pJavaClass = impl.getPropertyValue(INSTANCE.getJavaClassPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addErrorLogChangeListener(
        ConfigurationChangeListener<ErrorLogAccountStatusNotificationHandlerCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeErrorLogChangeListener(
        ConfigurationChangeListener<ErrorLogAccountStatusNotificationHandlerCfg> listener) {
      impl.deregisterChangeListener(listener);
    }
    /**
     * {@inheritDoc}
     */
    public void addChangeListener(
        ConfigurationChangeListener<AccountStatusNotificationHandlerCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeChangeListener(
        ConfigurationChangeListener<AccountStatusNotificationHandlerCfg> listener) {
      impl.deregisterChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<AccountStatusNotificationType> getAccountStatusNotificationType() {
      return pAccountStatusNotificationType;
    }



    /**
     * {@inheritDoc}
     */
    public boolean isEnabled() {
      return pEnabled;
    }



    /**
     * {@inheritDoc}
     */
    public String getJavaClass() {
      return pJavaClass;
    }



    /**
     * {@inheritDoc}
     */
    public Class<? extends ErrorLogAccountStatusNotificationHandlerCfg> configurationClass() {
      return ErrorLogAccountStatusNotificationHandlerCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
