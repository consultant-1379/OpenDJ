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
import org.opends.server.admin.std.meta.BackendCfgDefn.WritabilityMode;



/**
 * A server-side interface for querying Backup Backend settings.
 * <p>
 * The Backup Backend provides read-only access to the set of backups
 * that are available for the OpenDS Directory Server.
 */
public interface BackupBackendCfg extends BackendCfg {

  /**
   * Gets the configuration class associated with this Backup Backend.
   *
   * @return Returns the configuration class associated with this Backup Backend.
   */
  Class<? extends BackupBackendCfg> configurationClass();



  /**
   * Register to be notified when this Backup Backend is changed.
   *
   * @param listener
   *          The Backup Backend configuration change listener.
   */
  void addBackupChangeListener(ConfigurationChangeListener<BackupBackendCfg> listener);



  /**
   * Deregister an existing Backup Backend configuration change listener.
   *
   * @param listener
   *          The Backup Backend configuration change listener.
   */
  void removeBackupChangeListener(ConfigurationChangeListener<BackupBackendCfg> listener);



  /**
   * Gets the "backup-directory" property.
   * <p>
   * Specifies the path to a backup directory containing one or more
   * backups for a particular backend.
   * <p>
   * This is a multivalued property. Each value may specify a
   * different backup directory if desired (one for each backend for
   * which backups are taken). Values may be either absolute paths or
   * paths that are relative to the base of the OpenDS Directory Server
   * installation.
   *
   * @return Returns an unmodifiable set containing the values of the "backup-directory" property.
   */
  SortedSet<String> getBackupDirectory();



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
