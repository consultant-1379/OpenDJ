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
 * A server-side interface for querying Task Backend settings.
 * <p>
 * The Task Backend provides a mechanism for scheduling tasks in the
 * OpenDS Directory Server. Tasks are intended to provide access to
 * certain types of administrative functions in the server that may not
 * be convenient to perform remotely.
 */
public interface TaskBackendCfg extends BackendCfg {

  /**
   * Gets the configuration class associated with this Task Backend.
   *
   * @return Returns the configuration class associated with this Task Backend.
   */
  Class<? extends TaskBackendCfg> configurationClass();



  /**
   * Register to be notified when this Task Backend is changed.
   *
   * @param listener
   *          The Task Backend configuration change listener.
   */
  void addTaskChangeListener(ConfigurationChangeListener<TaskBackendCfg> listener);



  /**
   * Deregister an existing Task Backend configuration change listener.
   *
   * @param listener
   *          The Task Backend configuration change listener.
   */
  void removeTaskChangeListener(ConfigurationChangeListener<TaskBackendCfg> listener);



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
   * Gets the "notification-sender-address" property.
   * <p>
   * Specifies the email address to use as the sender (that is, the
   * "From:" address) address for notification mail messages generated
   * when a task completes execution.
   *
   * @return Returns the value of the "notification-sender-address" property.
   */
  String getNotificationSenderAddress();



  /**
   * Gets the "task-backing-file" property.
   * <p>
   * Specifies the path to the backing file for storing information
   * about the tasks configured in the server.
   * <p>
   * It may be either an absolute path or a relative path to the base
   * of the OpenDS Directory Server instance.
   *
   * @return Returns the value of the "task-backing-file" property.
   */
  String getTaskBackingFile();



  /**
   * Gets the "task-retention-time" property.
   * <p>
   * Specifies the length of time that task entries should be retained
   * after processing on the associated task has been completed.
   *
   * @return Returns the value of the "task-retention-time" property.
   */
  long getTaskRetentionTime();



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
