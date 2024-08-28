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
 * A server-side interface for querying LDIF Backend settings.
 * <p>
 * The LDIF Backend provides a mechanism for interacting with data
 * stored in an LDIF file.
 */
public interface LDIFBackendCfg extends BackendCfg {

  /**
   * Gets the configuration class associated with this LDIF Backend.
   *
   * @return Returns the configuration class associated with this LDIF Backend.
   */
  Class<? extends LDIFBackendCfg> configurationClass();



  /**
   * Register to be notified when this LDIF Backend is changed.
   *
   * @param listener
   *          The LDIF Backend configuration change listener.
   */
  void addLDIFChangeListener(ConfigurationChangeListener<LDIFBackendCfg> listener);



  /**
   * Deregister an existing LDIF Backend configuration change listener.
   *
   * @param listener
   *          The LDIF Backend configuration change listener.
   */
  void removeLDIFChangeListener(ConfigurationChangeListener<LDIFBackendCfg> listener);



  /**
   * Gets the "is-private-backend" property.
   * <p>
   * Indicates whether the backend should be considered a private
   * backend, which indicates that it is used for storing operational
   * data rather than user-defined information.
   *
   * @return Returns the value of the "is-private-backend" property.
   */
  boolean isIsPrivateBackend();



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
   * Gets the "ldif-file" property.
   * <p>
   * Specifies the path to the LDIF file containing the data for this
   * backend.
   *
   * @return Returns the value of the "ldif-file" property.
   */
  String getLDIFFile();



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
