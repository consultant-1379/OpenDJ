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
 * A server-side interface for querying Time Limit Log Rotation Policy
 * settings.
 * <p>
 * Rotation policy based on the time since last rotation.
 */
public interface TimeLimitLogRotationPolicyCfg extends LogRotationPolicyCfg {

  /**
   * Gets the configuration class associated with this Time Limit Log Rotation Policy.
   *
   * @return Returns the configuration class associated with this Time Limit Log Rotation Policy.
   */
  Class<? extends TimeLimitLogRotationPolicyCfg> configurationClass();



  /**
   * Register to be notified when this Time Limit Log Rotation Policy is changed.
   *
   * @param listener
   *          The Time Limit Log Rotation Policy configuration change listener.
   */
  void addTimeLimitChangeListener(ConfigurationChangeListener<TimeLimitLogRotationPolicyCfg> listener);



  /**
   * Deregister an existing Time Limit Log Rotation Policy configuration change listener.
   *
   * @param listener
   *          The Time Limit Log Rotation Policy configuration change listener.
   */
  void removeTimeLimitChangeListener(ConfigurationChangeListener<TimeLimitLogRotationPolicyCfg> listener);



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Time Limit Log Rotation Policy implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();



  /**
   * Gets the "rotation-interval" property.
   * <p>
   * Specifies the time interval between rotations.
   *
   * @return Returns the value of the "rotation-interval" property.
   */
  long getRotationInterval();

}
