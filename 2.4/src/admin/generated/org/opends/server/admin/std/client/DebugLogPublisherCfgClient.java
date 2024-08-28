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
import org.opends.server.admin.client.AuthorizationException;
import org.opends.server.admin.client.CommunicationException;
import org.opends.server.admin.client.ConcurrentModificationException;
import org.opends.server.admin.client.IllegalManagedObjectNameException;
import org.opends.server.admin.client.ManagedObjectDecodingException;
import org.opends.server.admin.client.OperationRejectedException;
import org.opends.server.admin.DefaultBehaviorException;
import org.opends.server.admin.DefinitionDecodingException;
import org.opends.server.admin.IllegalPropertyValueException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.ManagedObjectNotFoundException;
import org.opends.server.admin.std.meta.DebugLogPublisherCfgDefn.DefaultDebugCategory;
import org.opends.server.admin.std.meta.DebugLogPublisherCfgDefn.DefaultDebugLevel;
import org.opends.server.admin.std.server.DebugLogPublisherCfg;
import org.opends.server.admin.std.server.DebugTargetCfg;



/**
 * A client-side interface for reading and modifying Debug Log
 * Publisher settings.
 * <p>
 * Debug Log Publishers are responsible for distributing debug log
 * messages from the debug logger to a destination.
 */
public interface DebugLogPublisherCfgClient extends LogPublisherCfgClient {

  /**
   * Get the configuration definition associated with this Debug Log Publisher.
   *
   * @return Returns the configuration definition associated with this Debug Log Publisher.
   */
  ManagedObjectDefinition<? extends DebugLogPublisherCfgClient, ? extends DebugLogPublisherCfg> definition();



  /**
   * Gets the "default-debug-category" property.
   * <p>
   * The debug message categories to be logged when none of the
   * defined targets match the message.
   *
   * @return Returns the values of the "default-debug-category" property.
   */
  SortedSet<DefaultDebugCategory> getDefaultDebugCategory();



  /**
   * Sets the "default-debug-category" property.
   * <p>
   * The debug message categories to be logged when none of the
   * defined targets match the message.
   *
   * @param values The values of the "default-debug-category" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setDefaultDebugCategory(Collection<DefaultDebugCategory> values) throws IllegalPropertyValueException;



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
   * Sets the "default-debug-level" property.
   * <p>
   * The lowest severity level of debug messages to log when none of
   * the defined targets match the message.
   *
   * @param value The value of the "default-debug-level" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setDefaultDebugLevel(DefaultDebugLevel value) throws IllegalPropertyValueException;



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
   * Sets the "default-include-throwable-cause" property.
   * <p>
   * Indicates whether to include the cause of exceptions in exception
   * thrown and caught messages logged by default.
   *
   * @param value The value of the "default-include-throwable-cause" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setDefaultIncludeThrowableCause(Boolean value) throws IllegalPropertyValueException;



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
   * Sets the "default-omit-method-entry-arguments" property.
   * <p>
   * Indicates whether to include method arguments in debug messages
   * logged by default.
   *
   * @param value The value of the "default-omit-method-entry-arguments" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setDefaultOmitMethodEntryArguments(Boolean value) throws IllegalPropertyValueException;



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
   * Sets the "default-omit-method-return-value" property.
   * <p>
   * Indicates whether to include the return value in debug messages
   * logged by default.
   *
   * @param value The value of the "default-omit-method-return-value" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setDefaultOmitMethodReturnValue(Boolean value) throws IllegalPropertyValueException;



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
   * Sets the "default-throwable-stack-frames" property.
   * <p>
   * Indicates the number of stack frames to include in the stack
   * trace for method entry and exception thrown messages.
   *
   * @param value The value of the "default-throwable-stack-frames" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setDefaultThrowableStackFrames(Integer value) throws IllegalPropertyValueException;



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
   * Sets the "java-class" property.
   * <p>
   * The fully-qualified name of the Java class that provides the
   * Debug Log Publisher implementation.
   *
   * @param value The value of the "java-class" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setJavaClass(String value) throws IllegalPropertyValueException;



  /**
   * Lists the Debug Targets.
   *
   * @return Returns an array containing the names of the Debug
   *         Targets.
   * @throws ConcurrentModificationException
   *           If this Debug Log Publisher has been removed from the
   *           server by another client.
   * @throws AuthorizationException
   *           If the server refuses to list the Debug Targets because
   *           the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  String[] listDebugTargets() throws ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Gets the named Debug Target.
   *
   * @param name
   *           The name of the Debug Target to retrieve.
   * @return Returns the named Debug Target.
   * @throws DefinitionDecodingException
   *           If the named Debug Target was found but its type could
   *           not be determined.
   * @throws ManagedObjectDecodingException
   *           If the named Debug Target was found but one or more of
   *           its properties could not be decoded.
   * @throws ManagedObjectNotFoundException
   *           If the named Debug Target was not found on the server.
   * @throws ConcurrentModificationException
   *           If this Debug Log Publisher has been removed from the
   *           server by another client.
   * @throws AuthorizationException
   *           If the server refuses to retrieve the named Debug
   *           Target because the client does not have the correct
   *           privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  DebugTargetCfgClient getDebugTarget(String name)
      throws DefinitionDecodingException, ManagedObjectDecodingException,
      ManagedObjectNotFoundException, ConcurrentModificationException,
      AuthorizationException, CommunicationException;



  /**
   * Creates a new Debug Target. The new Debug Target will initially
   * not contain any property values (including mandatory properties).
   * Once the Debug Target has been configured it can be added to the
   * server using the {@link #commit()} method.
   *
   * @param <C>
   *          The type of the Debug Target being created.
   * @param d
   *          The definition of the Debug Target to be created.
   * @param name
   *          The name of the new Debug Target.
   * @param exceptions
   *          An optional collection in which to place any {@link
   *          DefaultBehaviorException}s that occurred whilst
   *          attempting to determine the default values of the Debug
   *          Target. This argument can be <code>null<code>.
   * @return Returns a new Debug Target configuration instance.
   * @throws IllegalManagedObjectNameException
   *          If the name of the new Debug Target is invalid.
   */
  <C extends DebugTargetCfgClient> C createDebugTarget(
      ManagedObjectDefinition<C, ? extends DebugTargetCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException;



  /**
   * Removes the named Debug Target.
   *
   * @param name
   *          The name of the Debug Target to remove.
   * @throws ManagedObjectNotFoundException
   *           If the Debug Target does not exist.
   * @throws OperationRejectedException
   *           If the server refuses to remove the Debug Target due to
   *           some server-side constraint which cannot be satisfied
   *           (for example, if it is referenced by another managed
   *           object).
   * @throws ConcurrentModificationException
   *           If this Debug Log Publisher has been removed from the
   *           server by another client.
   * @throws AuthorizationException
   *           If the server refuses to remove the Debug Target
   *           because the client does not have the correct privileges.
   * @throws CommunicationException
   *           If the client cannot contact the server due to an
   *           underlying communication problem.
   */
  void removeDebugTarget(String name)
      throws ManagedObjectNotFoundException, OperationRejectedException,
      ConcurrentModificationException, AuthorizationException,
      CommunicationException;

}
