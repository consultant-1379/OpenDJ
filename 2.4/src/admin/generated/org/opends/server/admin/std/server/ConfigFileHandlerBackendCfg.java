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



import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.std.meta.BackendCfgDefn.WritabilityMode;



/**
 * A server-side interface for querying Config File Handler Backend
 * settings.
 * <p>
 * The Config File Handler Backend allows clients to access the server
 * configuration over protocol, and allow both read and write
 * operations. Note: Modify DN operations are not supported for entries
 * in the server configuration.
 */
public interface ConfigFileHandlerBackendCfg extends BackendCfg {

  /**
   * Gets the configuration class associated with this Config File Handler Backend.
   *
   * @return Returns the configuration class associated with this Config File Handler Backend.
   */
  Class<? extends ConfigFileHandlerBackendCfg> configurationClass();



  /**
   * Register to be notified when this Config File Handler Backend is changed.
   *
   * @param listener
   *          The Config File Handler Backend configuration change listener.
   */
  void addConfigFileHandlerChangeListener(ConfigurationChangeListener<ConfigFileHandlerBackendCfg> listener);



  /**
   * Deregister an existing Config File Handler Backend configuration change listener.
   *
   * @param listener
   *          The Config File Handler Backend configuration change listener.
   */
  void removeConfigFileHandlerChangeListener(ConfigurationChangeListener<ConfigFileHandlerBackendCfg> listener);



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the backend implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();



  /**
   * Gets the "writability-mode" property.
   * <p>
   * Specifies the behavior that the backend should use when
   * processing write operations.
   *
   * @return Returns the value of the "writability-mode" property.
   */
  WritabilityMode getWritabilityMode();

}
