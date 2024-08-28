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



/**
 * A server-side interface for querying File Count Log Retention
 * Policy settings.
 * <p>
 * Retention policy based on the number of rotated log files on disk.
 */
public interface FileCountLogRetentionPolicyCfg extends LogRetentionPolicyCfg {

  /**
   * Gets the configuration class associated with this File Count Log Retention Policy.
   *
   * @return Returns the configuration class associated with this File Count Log Retention Policy.
   */
  Class<? extends FileCountLogRetentionPolicyCfg> configurationClass();



  /**
   * Register to be notified when this File Count Log Retention Policy is changed.
   *
   * @param listener
   *          The File Count Log Retention Policy configuration change listener.
   */
  void addFileCountChangeListener(ConfigurationChangeListener<FileCountLogRetentionPolicyCfg> listener);



  /**
   * Deregister an existing File Count Log Retention Policy configuration change listener.
   *
   * @param listener
   *          The File Count Log Retention Policy configuration change listener.
   */
  void removeFileCountChangeListener(ConfigurationChangeListener<FileCountLogRetentionPolicyCfg> listener);



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the File Count Log Retention Policy implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();



  /**
   * Gets the "number-of-files" property.
   * <p>
   * Specifies the number of archived log files to retain before the
   * oldest ones are cleaned.
   *
   * @return Returns the value of the "number-of-files" property.
   */
  int getNumberOfFiles();

}
