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
import org.opends.server.admin.Configuration;
import org.opends.server.admin.server.ConfigurationChangeListener;



/**
 * A server-side interface for querying Alert Handler settings.
 * <p>
 * Alert Handlers are used to notify administrators of significant
 * problems or notable events that occur in the Directory Server.
 */
public interface AlertHandlerCfg extends Configuration {

  /**
   * Gets the configuration class associated with this Alert Handler.
   *
   * @return Returns the configuration class associated with this Alert Handler.
   */
  Class<? extends AlertHandlerCfg> configurationClass();



  /**
   * Register to be notified when this Alert Handler is changed.
   *
   * @param listener
   *          The Alert Handler configuration change listener.
   */
  void addChangeListener(ConfigurationChangeListener<AlertHandlerCfg> listener);



  /**
   * Deregister an existing Alert Handler configuration change listener.
   *
   * @param listener
   *          The Alert Handler configuration change listener.
   */
  void removeChangeListener(ConfigurationChangeListener<AlertHandlerCfg> listener);



  /**
   * Gets the "disabled-alert-type" property.
   * <p>
   * Specifies the names of the alert types that are disabled for this
   * alert handler.
   * <p>
   * If there are any values for this attribute, then no alerts with
   * any of the specified types are allowed. If there are no values for
   * this attribute, then only alerts with a type included in the set
   * of enabled alert types are allowed, or if there are no values for
   * the enabled alert types option, then all alert types are allowed.
   *
   * @return Returns an unmodifiable set containing the values of the "disabled-alert-type" property.
   */
  SortedSet<String> getDisabledAlertType();



  /**
   * Gets the "enabled" property.
   * <p>
   * Indicates whether the Alert Handler is enabled.
   *
   * @return Returns the value of the "enabled" property.
   */
  boolean isEnabled();



  /**
   * Gets the "enabled-alert-type" property.
   * <p>
   * Specifies the names of the alert types that are enabled for this
   * alert handler.
   * <p>
   * If there are any values for this attribute, then only alerts with
   * one of the specified types are allowed (unless they are also
   * included in the disabled alert types). If there are no values for
   * this attribute, then any alert with a type not included in the
   * list of disabled alert types is allowed.
   *
   * @return Returns an unmodifiable set containing the values of the "enabled-alert-type" property.
   */
  SortedSet<String> getEnabledAlertType();



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Alert Handler implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();

}
