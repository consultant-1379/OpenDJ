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
import org.opends.server.admin.server.ConfigurationAddListener;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.server.ConfigurationDeleteListener;
import org.opends.server.admin.std.meta.DebugLogPublisherCfgDefn.DefaultDebugCategory;
import org.opends.server.admin.std.meta.DebugLogPublisherCfgDefn.DefaultDebugLevel;
import org.opends.server.config.ConfigException;



/**
 * A server-side interface for querying Debug Log Publisher settings.
 * <p>
 * Debug Log Publishers are responsible for distributing debug log
 * messages from the debug logger to a destination.
 */
public interface DebugLogPublisherCfg extends LogPublisherCfg {

  /**
   * Gets the configuration class associated with this Debug Log Publisher.
   *
   * @return Returns the configuration class associated with this Debug Log Publisher.
   */
  Class<? extends DebugLogPublisherCfg> configurationClass();



  /**
   * Register to be notified when this Debug Log Publisher is changed.
   *
   * @param listener
   *          The Debug Log Publisher configuration change listener.
   */
  void addDebugChangeListener(ConfigurationChangeListener<DebugLogPublisherCfg> listener);



  /**
   * Deregister an existing Debug Log Publisher configuration change listener.
   *
   * @param listener
   *          The Debug Log Publisher configuration change listener.
   */
  void removeDebugChangeListener(ConfigurationChangeListener<DebugLogPublisherCfg> listener);



  /**
   * Gets the "default-debug-category" property.
   * <p>
   * The debug message categories to be logged when none of the
   * defined targets match the message.
   *
   * @return Returns an unmodifiable set containing the values of the "default-debug-category" property.
   */
  SortedSet<DefaultDebugCategory> getDefaultDebugCategory();



  /**
   * Gets the "default-debug-level" property.
   * <p>
   * The lowest severity level of debug messages to log when none of
   * the defined targets match the message.
   *
   * @return Returns the value of the "default-debug-level" property.
   */
  DefaultDebugLevel getDefaultDebugLevel();



  /**
   * Gets the "default-include-throwable-cause" property.
   * <p>
   * Indicates whether to include the cause of exceptions in exception
   * thrown and caught messages logged by default.
   *
   * @return Returns the value of the "default-include-throwable-cause" property.
   */
  boolean isDefaultIncludeThrowableCause();



  /**
   * Gets the "default-omit-method-entry-arguments" property.
   * <p>
   * Indicates whether to include method arguments in debug messages
   * logged by default.
   *
   * @return Returns the value of the "default-omit-method-entry-arguments" property.
   */
  boolean isDefaultOmitMethodEntryArguments();



  /**
   * Gets the "default-omit-method-return-value" property.
   * <p>
   * Indicates whether to include the return value in debug messages
   * logged by default.
   *
   * @return Returns the value of the "default-omit-method-return-value" property.
   */
  boolean isDefaultOmitMethodReturnValue();



  /**
   * Gets the "default-throwable-stack-frames" property.
   * <p>
   * Indicates the number of stack frames to include in the stack
   * trace for method entry and exception thrown messages.
   *
   * @return Returns the value of the "default-throwable-stack-frames" property.
   */
  int getDefaultThrowableStackFrames();



  /**
   * Gets the "java-class" property.
   * <p>
   * The fully-qualified name of the Java class that provides the
   * Debug Log Publisher implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();



  /**
   * Lists the Debug Targets.
   *
   * @return Returns an array containing the names of the
   *         Debug Targets.
   */
  String[] listDebugTargets();



  /**
   * Gets the named Debug Target.
   *
   * @param name
   *          The name of the Debug Target to retrieve.
   * @return Returns the named Debug Target.
   * @throws ConfigException
   *           If the Debug Target could not be found or it
   *           could not be successfully decoded.
   */
  DebugTargetCfg getDebugTarget(String name) throws ConfigException;



  /**
   * Registers to be notified when new Debug Targets are added.
   *
   * @param listener
   *          The Debug Target configuration add listener.
   * @throws ConfigException
   *          If the add listener could not be registered.
   */
  void addDebugTargetAddListener(ConfigurationAddListener<DebugTargetCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Debug Target configuration add listener.
   *
   * @param listener
   *          The Debug Target configuration add listener.
   */
  void removeDebugTargetAddListener(ConfigurationAddListener<DebugTargetCfg> listener);



  /**
   * Registers to be notified when existing Debug Targets are deleted.
   *
   * @param listener
   *          The Debug Target configuration delete listener.
   * @throws ConfigException
   *          If the delete listener could not be registered.
   */
  void addDebugTargetDeleteListener(ConfigurationDeleteListener<DebugTargetCfg> listener) throws ConfigException;



  /**
   * Deregisters an existing Debug Target configuration delete listener.
   *
   * @param listener
   *          The Debug Target configuration delete listener.
   */
  void removeDebugTargetDeleteListener(ConfigurationDeleteListener<DebugTargetCfg> listener);

}
