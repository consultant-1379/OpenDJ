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
import org.opends.server.admin.Configuration;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.std.meta.DebugTargetCfgDefn.DebugCategory;
import org.opends.server.admin.std.meta.DebugTargetCfgDefn.DebugLevel;



/**
 * A server-side interface for querying Debug Target settings.
 * <p>
 * Debug Targets define the types of messages logged by the debug
 * logPublisher.
 */
public interface DebugTargetCfg extends Configuration {

  /**
   * Gets the configuration class associated with this Debug Target.
   *
   * @return Returns the configuration class associated with this Debug Target.
   */
  Class<? extends DebugTargetCfg> configurationClass();



  /**
   * Register to be notified when this Debug Target is changed.
   *
   * @param listener
   *          The Debug Target configuration change listener.
   */
  void addChangeListener(ConfigurationChangeListener<DebugTargetCfg> listener);



  /**
   * Deregister an existing Debug Target configuration change listener.
   *
   * @param listener
   *          The Debug Target configuration change listener.
   */
  void removeChangeListener(ConfigurationChangeListener<DebugTargetCfg> listener);



  /**
   * Gets the "debug-category" property.
   * <p>
   * Specifies the debug message categories to be logged.
   *
   * @return Returns an unmodifiable set containing the values of the "debug-category" property.
   */
  SortedSet<DebugCategory> getDebugCategory();



  /**
   * Gets the "debug-level" property.
   * <p>
   * Specifies the lowest severity level of debug messages to log.
   *
   * @return Returns the value of the "debug-level" property.
   */
  DebugLevel getDebugLevel();



  /**
   * Gets the "debug-scope" property.
   * <p>
   * Specifies the fully-qualified OpenDS Java package, class, or
   * method affected by the settings in this target definition. Use the
   * number character (#) to separate the class name and the method
   * name (that is, org.opends.server.core.DirectoryServer#startUp).
   *
   * @return Returns the value of the "debug-scope" property.
   */
  String getDebugScope();



  /**
   * Gets the "include-throwable-cause" property.
   * <p>
   * Specifies the property to indicate whether to include the cause
   * of exceptions in exception thrown and caught messages.
   *
   * @return Returns the value of the "include-throwable-cause" property.
   */
  boolean isIncludeThrowableCause();



  /**
   * Gets the "omit-method-entry-arguments" property.
   * <p>
   * Specifies the property to indicate whether to include method
   * arguments in debug messages.
   *
   * @return Returns the value of the "omit-method-entry-arguments" property.
   */
  boolean isOmitMethodEntryArguments();



  /**
   * Gets the "omit-method-return-value" property.
   * <p>
   * Specifies the property to indicate whether to include the return
   * value in debug messages.
   *
   * @return Returns the value of the "omit-method-return-value" property.
   */
  boolean isOmitMethodReturnValue();



  /**
   * Gets the "throwable-stack-frames" property.
   * <p>
   * Specifies the property to indicate the number of stack frames to
   * include in the stack trace for method entry and exception thrown
   * messages.
   *
   * @return Returns the value of the "throwable-stack-frames" property.
   */
  int getThrowableStackFrames();

}
