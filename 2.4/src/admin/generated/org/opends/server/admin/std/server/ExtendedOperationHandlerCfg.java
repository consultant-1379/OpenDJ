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
 * A server-side interface for querying Extended Operation Handler
 * settings.
 * <p>
 * Extended Operation Handlers processes the different types of
 * extended operations in the server.
 */
public interface ExtendedOperationHandlerCfg extends Configuration {

  /**
   * Gets the configuration class associated with this Extended Operation Handler.
   *
   * @return Returns the configuration class associated with this Extended Operation Handler.
   */
  Class<? extends ExtendedOperationHandlerCfg> configurationClass();



  /**
   * Register to be notified when this Extended Operation Handler is changed.
   *
   * @param listener
   *          The Extended Operation Handler configuration change listener.
   */
  void addChangeListener(ConfigurationChangeListener<ExtendedOperationHandlerCfg> listener);



  /**
   * Deregister an existing Extended Operation Handler configuration change listener.
   *
   * @param listener
   *          The Extended Operation Handler configuration change listener.
   */
  void removeChangeListener(ConfigurationChangeListener<ExtendedOperationHandlerCfg> listener);



  /**
   * Gets the "enabled" property.
   * <p>
   * Indicates whether the Extended Operation Handler is enabled (that
   * is, whether the types of extended operations are allowed in the
   * server).
   *
   * @return Returns the value of the "enabled" property.
   */
  boolean isEnabled();



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Extended Operation Handler implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();

}
