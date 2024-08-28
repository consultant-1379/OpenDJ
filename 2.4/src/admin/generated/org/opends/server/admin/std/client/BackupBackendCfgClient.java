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
package org.opends.server.admin.std.client;



import java.util.Collection;
import java.util.SortedSet;
import org.opends.server.admin.IllegalPropertyValueException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.std.meta.BackendCfgDefn.WritabilityMode;
import org.opends.server.admin.std.server.BackupBackendCfg;



/**
 * A client-side interface for reading and modifying Backup Backend
 * settings.
 * <p>
 * The Backup Backend provides read-only access to the set of backups
 * that are available for the OpenDS Directory Server.
 */
public interface BackupBackendCfgClient extends BackendCfgClient {

  /**
   * Get the configuration definition associated with this Backup Backend.
   *
   * @return Returns the configuration definition associated with this Backup Backend.
   */
  ManagedObjectDefinition<? extends BackupBackendCfgClient, ? extends BackupBackendCfg> definition();



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
   * @return Returns the values of the "backup-directory" property.
   */
  SortedSet<String> getBackupDirectory();



  /**
   * Sets the "backup-directory" property.
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
   * @param values The values of the "backup-directory" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setBackupDirectory(Collection<String> values) throws IllegalPropertyValueException;



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
   * Sets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the backend implementation.
   *
   * @param value The value of the "java-class" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setJavaClass(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "writability-mode" property.
   * <p>
   * Specifies the behavior that the backend should use when
   * processing write operations.
   *
   * @return Returns the value of the "writability-mode" property.
   */
  WritabilityMode getWritabilityMode();



  /**
   * Sets the "writability-mode" property.
   * <p>
   * Specifies the behavior that the backend should use when
   * processing write operations.
   *
   * @param value The value of the "writability-mode" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setWritabilityMode(WritabilityMode value) throws IllegalPropertyValueException;

}
