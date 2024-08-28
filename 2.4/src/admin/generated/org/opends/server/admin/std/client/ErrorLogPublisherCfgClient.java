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
import org.opends.server.admin.std.meta.ErrorLogPublisherCfgDefn.DefaultSeverity;
import org.opends.server.admin.std.server.ErrorLogPublisherCfg;



/**
 * A client-side interface for reading and modifying Error Log
 * Publisher settings.
 * <p>
 * Error Log Publishers are responsible for distributing error log
 * messages from the error logger to a destination.
 */
public interface ErrorLogPublisherCfgClient extends LogPublisherCfgClient {

  /**
   * Get the configuration definition associated with this Error Log Publisher.
   *
   * @return Returns the configuration definition associated with this Error Log Publisher.
   */
  ManagedObjectDefinition<? extends ErrorLogPublisherCfgClient, ? extends ErrorLogPublisherCfg> definition();



  /**
   * Gets the "default-severity" property.
   * <p>
   * Specifies the default severity levels for the logger.
   *
   * @return Returns the values of the "default-severity" property.
   */
  SortedSet<DefaultSeverity> getDefaultSeverity();



  /**
   * Sets the "default-severity" property.
   * <p>
   * Specifies the default severity levels for the logger.
   *
   * @param values The values of the "default-severity" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setDefaultSeverity(Collection<DefaultSeverity> values) throws IllegalPropertyValueException;



  /**
   * Gets the "java-class" property.
   * <p>
   * The fully-qualified name of the Java class that provides the
   * Error Log Publisher implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();



  /**
   * Sets the "java-class" property.
   * <p>
   * The fully-qualified name of the Java class that provides the
   * Error Log Publisher implementation.
   *
   * @param value The value of the "java-class" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setJavaClass(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "override-severity" property.
   * <p>
   * Specifies the override severity levels for the logger based on
   * the category of the messages.
   * <p>
   * Each override severity level should include the category and the
   * severity levels to log for that category, for example,
   * core=mild-error,info,mild-warning. Valid categories are: core,
   * extensions, protocol, config, log, util, schema, plugin, jeb,
   * backend, tools, task, access-control, admin, sync, version,
   * quicksetup, admin-tool, dsconfig, user-defined. Valid severities
   * are: all, fatal-error, info, mild-error, mild-warning, notice,
   * severe-error, severe-warning, debug.
   *
   * @return Returns the values of the "override-severity" property.
   */
  SortedSet<String> getOverrideSeverity();



  /**
   * Sets the "override-severity" property.
   * <p>
   * Specifies the override severity levels for the logger based on
   * the category of the messages.
   * <p>
   * Each override severity level should include the category and the
   * severity levels to log for that category, for example,
   * core=mild-error,info,mild-warning. Valid categories are: core,
   * extensions, protocol, config, log, util, schema, plugin, jeb,
   * backend, tools, task, access-control, admin, sync, version,
   * quicksetup, admin-tool, dsconfig, user-defined. Valid severities
   * are: all, fatal-error, info, mild-error, mild-warning, notice,
   * severe-error, severe-warning, debug.
   *
   * @param values The values of the "override-severity" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setOverrideSeverity(Collection<String> values) throws IllegalPropertyValueException;

}
