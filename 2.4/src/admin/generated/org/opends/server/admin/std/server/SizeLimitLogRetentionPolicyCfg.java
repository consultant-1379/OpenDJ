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
 * A server-side interface for querying Size Limit Log Retention
 * Policy settings.
 * <p>
 * Retention policy based on the amount of space taken by all the log
 * files on disk.
 */
public interface SizeLimitLogRetentionPolicyCfg extends LogRetentionPolicyCfg {

  /**
   * Gets the configuration class associated with this Size Limit Log Retention Policy.
   *
   * @return Returns the configuration class associated with this Size Limit Log Retention Policy.
   */
  Class<? extends SizeLimitLogRetentionPolicyCfg> configurationClass();



  /**
   * Register to be notified when this Size Limit Log Retention Policy is changed.
   *
   * @param listener
   *          The Size Limit Log Retention Policy configuration change listener.
   */
  void addSizeLimitChangeListener(ConfigurationChangeListener<SizeLimitLogRetentionPolicyCfg> listener);



  /**
   * Deregister an existing Size Limit Log Retention Policy configuration change listener.
   *
   * @param listener
   *          The Size Limit Log Retention Policy configuration change listener.
   */
  void removeSizeLimitChangeListener(ConfigurationChangeListener<SizeLimitLogRetentionPolicyCfg> listener);



  /**
   * Gets the "disk-space-used" property.
   * <p>
   * Specifies the maximum total disk space used by the log files.
   *
   * @return Returns the value of the "disk-space-used" property.
   */
  long getDiskSpaceUsed();



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Size Limit Log Retention Policy implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();

}
