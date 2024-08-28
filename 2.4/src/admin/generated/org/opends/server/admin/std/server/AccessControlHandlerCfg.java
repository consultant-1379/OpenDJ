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
 * A server-side interface for querying Access Control Handler
 * settings.
 * <p>
 * Access Control Handlers manage the application-wide access control.
 * The OpenDS access control handler is defined through an extensible
 * interface, so that alternate implementations can be created. Only
 * one access control handler may be active in the server at any given
 * time.
 */
public interface AccessControlHandlerCfg extends Configuration {

  /**
   * Gets the configuration class associated with this Access Control Handler.
   *
   * @return Returns the configuration class associated with this Access Control Handler.
   */
  Class<? extends AccessControlHandlerCfg> configurationClass();



  /**
   * Register to be notified when this Access Control Handler is changed.
   *
   * @param listener
   *          The Access Control Handler configuration change listener.
   */
  void addChangeListener(ConfigurationChangeListener<AccessControlHandlerCfg> listener);



  /**
   * Deregister an existing Access Control Handler configuration change listener.
   *
   * @param listener
   *          The Access Control Handler configuration change listener.
   */
  void removeChangeListener(ConfigurationChangeListener<AccessControlHandlerCfg> listener);



  /**
   * Gets the "enabled" property.
   * <p>
   * Indicates whether the Access Control Handler is enabled. If set
   * to FALSE, then no access control is enforced, and any client
   * (including unauthenticated or anonymous clients) could be allowed
   * to perform any operation if not subject to other restrictions,
   * such as those enforced by the privilege subsystem.
   *
   * @return Returns the value of the "enabled" property.
   */
  boolean isEnabled();



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Access Control Handler implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();

}
