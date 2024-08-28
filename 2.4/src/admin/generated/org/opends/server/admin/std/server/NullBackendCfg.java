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
 * A server-side interface for querying Null Backend settings.
 * <p>
 * The Null Backend provides a Directory Server backend that
 * implements a /dev/null like behavior for development and testing.
 */
public interface NullBackendCfg extends BackendCfg {

  /**
   * Gets the configuration class associated with this Null Backend.
   *
   * @return Returns the configuration class associated with this Null Backend.
   */
  Class<? extends NullBackendCfg> configurationClass();



  /**
   * Register to be notified when this Null Backend is changed.
   *
   * @param listener
   *          The Null Backend configuration change listener.
   */
  void addNullChangeListener(ConfigurationChangeListener<NullBackendCfg> listener);



  /**
   * Deregister an existing Null Backend configuration change listener.
   *
   * @param listener
   *          The Null Backend configuration change listener.
   */
  void removeNullChangeListener(ConfigurationChangeListener<NullBackendCfg> listener);



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
