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
import org.opends.server.admin.server.ConfigurationChangeListener;



/**
 * A server-side interface for querying Account Status Notification
 * Handler settings.
 * <p>
 * Account Status Notification Handlers are invoked to provide
 * notification to users in some form (for example, by an email
 * message) when the status of a user's account has changed in some
 * way. The Account Status Notification Handler can be used to notify
 * the user and/or administrators of the change.
 */
public interface AccountStatusNotificationHandlerCfg extends Configuration {

  /**
   * Gets the configuration class associated with this Account Status Notification Handler.
   *
   * @return Returns the configuration class associated with this Account Status Notification Handler.
   */
  Class<? extends AccountStatusNotificationHandlerCfg> configurationClass();



  /**
   * Register to be notified when this Account Status Notification Handler is changed.
   *
   * @param listener
   *          The Account Status Notification Handler configuration change listener.
   */
  void addChangeListener(ConfigurationChangeListener<AccountStatusNotificationHandlerCfg> listener);



  /**
   * Deregister an existing Account Status Notification Handler configuration change listener.
   *
   * @param listener
   *          The Account Status Notification Handler configuration change listener.
   */
  void removeChangeListener(ConfigurationChangeListener<AccountStatusNotificationHandlerCfg> listener);



  /**
   * Gets the "enabled" property.
   * <p>
   * Indicates whether the Account Status Notification Handler is
   * enabled. Only enabled handlers are invoked whenever a related
   * event occurs in the server.
   *
   * @return Returns the value of the "enabled" property.
   */
  boolean isEnabled();



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Account Status Notification Handler implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();

}
