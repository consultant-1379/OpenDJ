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



import org.opends.server.admin.IllegalPropertyValueException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.std.server.TimeLimitLogRotationPolicyCfg;



/**
 * A client-side interface for reading and modifying Time Limit Log
 * Rotation Policy settings.
 * <p>
 * Rotation policy based on the time since last rotation.
 */
public interface TimeLimitLogRotationPolicyCfgClient extends LogRotationPolicyCfgClient {

  /**
   * Get the configuration definition associated with this Time Limit Log Rotation Policy.
   *
   * @return Returns the configuration definition associated with this Time Limit Log Rotation Policy.
   */
  ManagedObjectDefinition<? extends TimeLimitLogRotationPolicyCfgClient, ? extends TimeLimitLogRotationPolicyCfg> definition();



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
   * Sets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Time Limit Log Rotation Policy implementation.
   *
   * @param value The value of the "java-class" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setJavaClass(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "rotation-interval" property.
   * <p>
   * Specifies the time interval between rotations.
   *
   * @return Returns the value of the "rotation-interval" property.
   */
  Long getRotationInterval();



  /**
   * Sets the "rotation-interval" property.
   * <p>
   * Specifies the time interval between rotations.
   *
   * @param value The value of the "rotation-interval" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setRotationInterval(long value) throws IllegalPropertyValueException;

}
