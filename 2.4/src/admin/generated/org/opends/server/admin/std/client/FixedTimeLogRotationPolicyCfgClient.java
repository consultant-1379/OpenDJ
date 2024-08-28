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
import org.opends.server.admin.std.server.FixedTimeLogRotationPolicyCfg;



/**
 * A client-side interface for reading and modifying Fixed Time Log
 * Rotation Policy settings.
 * <p>
 * Rotation policy based on a fixed time of day.
 */
public interface FixedTimeLogRotationPolicyCfgClient extends LogRotationPolicyCfgClient {

  /**
   * Get the configuration definition associated with this Fixed Time Log Rotation Policy.
   *
   * @return Returns the configuration definition associated with this Fixed Time Log Rotation Policy.
   */
  ManagedObjectDefinition<? extends FixedTimeLogRotationPolicyCfgClient, ? extends FixedTimeLogRotationPolicyCfg> definition();



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
   * Sets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Fixed Time Log Rotation Policy implementation.
   *
   * @param value The value of the "java-class" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setJavaClass(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "time-of-day" property.
   * <p>
   * Specifies the time of day at which log rotation should occur.
   *
   * @return Returns the values of the "time-of-day" property.
   */
  SortedSet<String> getTimeOfDay();



  /**
   * Sets the "time-of-day" property.
   * <p>
   * Specifies the time of day at which log rotation should occur.
   *
   * @param values The values of the "time-of-day" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setTimeOfDay(Collection<String> values) throws IllegalPropertyValueException;

}
