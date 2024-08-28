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
import org.opends.server.admin.ConfigurationClient;
import org.opends.server.admin.IllegalPropertyValueException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.PropertyIsReadOnlyException;
import org.opends.server.admin.std.meta.DebugTargetCfgDefn.DebugCategory;
import org.opends.server.admin.std.meta.DebugTargetCfgDefn.DebugLevel;
import org.opends.server.admin.std.server.DebugTargetCfg;



/**
 * A client-side interface for reading and modifying Debug Target
 * settings.
 * <p>
 * Debug Targets define the types of messages logged by the debug
 * logPublisher.
 */
public interface DebugTargetCfgClient extends ConfigurationClient {

  /**
   * Get the configuration definition associated with this Debug Target.
   *
   * @return Returns the configuration definition associated with this Debug Target.
   */
  ManagedObjectDefinition<? extends DebugTargetCfgClient, ? extends DebugTargetCfg> definition();



  /**
   * Gets the "debug-category" property.
   * <p>
   * Specifies the debug message categories to be logged.
   *
   * @return Returns the values of the "debug-category" property.
   */
  SortedSet<DebugCategory> getDebugCategory();



  /**
   * Sets the "debug-category" property.
   * <p>
   * Specifies the debug message categories to be logged.
   *
   * @param values The values of the "debug-category" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setDebugCategory(Collection<DebugCategory> values) throws IllegalPropertyValueException;



  /**
   * Gets the "debug-level" property.
   * <p>
   * Specifies the lowest severity level of debug messages to log.
   *
   * @return Returns the value of the "debug-level" property.
   */
  DebugLevel getDebugLevel();



  /**
   * Sets the "debug-level" property.
   * <p>
   * Specifies the lowest severity level of debug messages to log.
   *
   * @param value The value of the "debug-level" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setDebugLevel(DebugLevel value) throws IllegalPropertyValueException;



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
   * Sets the "debug-scope" property.
   * <p>
   * Specifies the fully-qualified OpenDS Java package, class, or
   * method affected by the settings in this target definition. Use the
   * number character (#) to separate the class name and the method
   * name (that is, org.opends.server.core.DirectoryServer#startUp).
   * <p>
   * This property is read-only and can only be modified during
   * creation of a Debug Target.
   *
   * @param value The value of the "debug-scope" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   * @throws PropertyIsReadOnlyException
   *           If this Debug Target is not being initialized.
   */
  void setDebugScope(String value) throws IllegalPropertyValueException, PropertyIsReadOnlyException;



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
   * Sets the "include-throwable-cause" property.
   * <p>
   * Specifies the property to indicate whether to include the cause
   * of exceptions in exception thrown and caught messages.
   *
   * @param value The value of the "include-throwable-cause" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setIncludeThrowableCause(Boolean value) throws IllegalPropertyValueException;



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
   * Sets the "omit-method-entry-arguments" property.
   * <p>
   * Specifies the property to indicate whether to include method
   * arguments in debug messages.
   *
   * @param value The value of the "omit-method-entry-arguments" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setOmitMethodEntryArguments(Boolean value) throws IllegalPropertyValueException;



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
   * Sets the "omit-method-return-value" property.
   * <p>
   * Specifies the property to indicate whether to include the return
   * value in debug messages.
   *
   * @param value The value of the "omit-method-return-value" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setOmitMethodReturnValue(Boolean value) throws IllegalPropertyValueException;



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



  /**
   * Sets the "throwable-stack-frames" property.
   * <p>
   * Specifies the property to indicate the number of stack frames to
   * include in the stack trace for method entry and exception thrown
   * messages.
   *
   * @param value The value of the "throwable-stack-frames" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setThrowableStackFrames(Integer value) throws IllegalPropertyValueException;

}
