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



/**
 * A server-side interface for querying Fixed Time Log Rotation Policy
 * settings.
 * <p>
 * Rotation policy based on a fixed time of day.
 */
public interface FixedTimeLogRotationPolicyCfg extends LogRotationPolicyCfg {

  /**
   * Gets the configuration class associated with this Fixed Time Log Rotation Policy.
   *
   * @return Returns the configuration class associated with this Fixed Time Log Rotation Policy.
   */
  Class<? extends FixedTimeLogRotationPolicyCfg> configurationClass();



  /**
   * Register to be notified when this Fixed Time Log Rotation Policy is changed.
   *
   * @param listener
   *          The Fixed Time Log Rotation Policy configuration change listener.
   */
  void addFixedTimeChangeListener(ConfigurationChangeListener<FixedTimeLogRotationPolicyCfg> listener);



  /**
   * Deregister an existing Fixed Time Log Rotation Policy configuration change listener.
   *
   * @param listener
   *          The Fixed Time Log Rotation Policy configuration change listener.
   */
  void removeFixedTimeChangeListener(ConfigurationChangeListener<FixedTimeLogRotationPolicyCfg> listener);



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Fixed Time Log Rotation Policy implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();



  /**
   * Gets the "time-of-day" property.
   * <p>
   * Specifies the time of day at which log rotation should occur.
   *
   * @return Returns an unmodifiable set containing the values of the "time-of-day" property.
   */
  SortedSet<String> getTimeOfDay();

}
