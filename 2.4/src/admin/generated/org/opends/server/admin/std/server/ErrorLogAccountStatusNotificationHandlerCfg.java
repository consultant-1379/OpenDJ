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
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.std.meta.ErrorLogAccountStatusNotificationHandlerCfgDefn.AccountStatusNotificationType;



/**
 * A server-side interface for querying Error Log Account Status
 * Notification Handler settings.
 * <p>
 * The Error Log Account Status Notification Handler is a notification
 * handler that writes information to the server error log whenever an
 * appropriate account status event occurs.
 */
public interface ErrorLogAccountStatusNotificationHandlerCfg extends AccountStatusNotificationHandlerCfg {

  /**
   * Gets the configuration class associated with this Error Log Account Status Notification Handler.
   *
   * @return Returns the configuration class associated with this Error Log Account Status Notification Handler.
   */
  Class<? extends ErrorLogAccountStatusNotificationHandlerCfg> configurationClass();



  /**
   * Register to be notified when this Error Log Account Status Notification Handler is changed.
   *
   * @param listener
   *          The Error Log Account Status Notification Handler configuration change listener.
   */
  void addErrorLogChangeListener(ConfigurationChangeListener<ErrorLogAccountStatusNotificationHandlerCfg> listener);



  /**
   * Deregister an existing Error Log Account Status Notification Handler configuration change listener.
   *
   * @param listener
   *          The Error Log Account Status Notification Handler configuration change listener.
   */
  void removeErrorLogChangeListener(ConfigurationChangeListener<ErrorLogAccountStatusNotificationHandlerCfg> listener);



  /**
   * Gets the "account-status-notification-type" property.
   * <p>
   * Indicates which types of event can trigger an account status
   * notification.
   *
   * @return Returns an unmodifiable set containing the values of the "account-status-notification-type" property.
   */
  SortedSet<AccountStatusNotificationType> getAccountStatusNotificationType();



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Error Log Account Status Notification Handler
   * implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();

}
