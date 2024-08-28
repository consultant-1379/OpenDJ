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
import org.opends.server.admin.std.server.FileBasedErrorLogPublisherCfg;



/**
 * A client-side interface for reading and modifying File Based Error
 * Log Publisher settings.
 * <p>
 * File Based Error Log Publishers publish error messages to the file
 * system.
 */
public interface FileBasedErrorLogPublisherCfgClient extends ErrorLogPublisherCfgClient {

  /**
   * Get the configuration definition associated with this File Based Error Log Publisher.
   *
   * @return Returns the configuration definition associated with this File Based Error Log Publisher.
   */
  ManagedObjectDefinition<? extends FileBasedErrorLogPublisherCfgClient, ? extends FileBasedErrorLogPublisherCfg> definition();



  /**
   * Gets the "append" property.
   * <p>
   * Specifies whether to append to existing log files.
   *
   * @return Returns the value of the "append" property.
   */
  boolean isAppend();



  /**
   * Sets the "append" property.
   * <p>
   * Specifies whether to append to existing log files.
   *
   * @param value The value of the "append" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setAppend(Boolean value) throws IllegalPropertyValueException;



  /**
   * Gets the "asynchronous" property.
   * <p>
   * Indicates whether the File Based Error Log Publisher will publish
   * records asynchronously.
   *
   * @return Returns the value of the "asynchronous" property.
   */
  boolean isAsynchronous();



  /**
   * Sets the "asynchronous" property.
   * <p>
   * Indicates whether the File Based Error Log Publisher will publish
   * records asynchronously.
   *
   * @param value The value of the "asynchronous" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setAsynchronous(boolean value) throws IllegalPropertyValueException;



  /**
   * Gets the "auto-flush" property.
   * <p>
   * Specifies whether to flush the writer after every log record.
   * <p>
   * If the asynchronous writes option is used, the writer will be
   * flushed after all the log records in the queue are written.
   *
   * @return Returns the value of the "auto-flush" property.
   */
  boolean isAutoFlush();



  /**
   * Sets the "auto-flush" property.
   * <p>
   * Specifies whether to flush the writer after every log record.
   * <p>
   * If the asynchronous writes option is used, the writer will be
   * flushed after all the log records in the queue are written.
   *
   * @param value The value of the "auto-flush" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setAutoFlush(Boolean value) throws IllegalPropertyValueException;



  /**
   * Gets the "buffer-size" property.
   * <p>
   * Specifies the log file buffer size.
   *
   * @return Returns the value of the "buffer-size" property.
   */
  long getBufferSize();



  /**
   * Sets the "buffer-size" property.
   * <p>
   * Specifies the log file buffer size.
   *
   * @param value The value of the "buffer-size" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setBufferSize(Long value) throws IllegalPropertyValueException;



  /**
   * Gets the "java-class" property.
   * <p>
   * The fully-qualified name of the Java class that provides the File
   * Based Error Log Publisher implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();



  /**
   * Sets the "java-class" property.
   * <p>
   * The fully-qualified name of the Java class that provides the File
   * Based Error Log Publisher implementation.
   *
   * @param value The value of the "java-class" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setJavaClass(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "log-file" property.
   * <p>
   * The file name to use for the log files generated by the File
   * Based Error Log Publisher .
   * <p>
   * The path to the file is relative to the server root.
   *
   * @return Returns the value of the "log-file" property.
   */
  String getLogFile();



  /**
   * Sets the "log-file" property.
   * <p>
   * The file name to use for the log files generated by the File
   * Based Error Log Publisher .
   * <p>
   * The path to the file is relative to the server root.
   *
   * @param value The value of the "log-file" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setLogFile(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "log-file-permissions" property.
   * <p>
   * The UNIX permissions of the log files created by this File Based
   * Error Log Publisher .
   *
   * @return Returns the value of the "log-file-permissions" property.
   */
  String getLogFilePermissions();



  /**
   * Sets the "log-file-permissions" property.
   * <p>
   * The UNIX permissions of the log files created by this File Based
   * Error Log Publisher .
   *
   * @param value The value of the "log-file-permissions" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setLogFilePermissions(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "queue-size" property.
   * <p>
   * The maximum number of log records that can be stored in the
   * asynchronous queue.
   *
   * @return Returns the value of the "queue-size" property.
   */
  int getQueueSize();



  /**
   * Sets the "queue-size" property.
   * <p>
   * The maximum number of log records that can be stored in the
   * asynchronous queue.
   *
   * @param value The value of the "queue-size" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setQueueSize(Integer value) throws IllegalPropertyValueException;



  /**
   * Gets the "retention-policy" property.
   * <p>
   * The retention policy to use for the File Based Error Log
   * Publisher .
   * <p>
   * When multiple policies are used, log files will be cleaned when
   * any of the policy's conditions are met.
   *
   * @return Returns the values of the "retention-policy" property.
   */
  SortedSet<String> getRetentionPolicy();



  /**
   * Sets the "retention-policy" property.
   * <p>
   * The retention policy to use for the File Based Error Log
   * Publisher .
   * <p>
   * When multiple policies are used, log files will be cleaned when
   * any of the policy's conditions are met.
   *
   * @param values The values of the "retention-policy" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setRetentionPolicy(Collection<String> values) throws IllegalPropertyValueException;



  /**
   * Gets the "rotation-policy" property.
   * <p>
   * The rotation policy to use for the File Based Error Log Publisher
   * .
   * <p>
   * When multiple policies are used, rotation will occur if any
   * policy's conditions are met.
   *
   * @return Returns the values of the "rotation-policy" property.
   */
  SortedSet<String> getRotationPolicy();



  /**
   * Sets the "rotation-policy" property.
   * <p>
   * The rotation policy to use for the File Based Error Log Publisher
   * .
   * <p>
   * When multiple policies are used, rotation will occur if any
   * policy's conditions are met.
   *
   * @param values The values of the "rotation-policy" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setRotationPolicy(Collection<String> values) throws IllegalPropertyValueException;



  /**
   * Gets the "time-interval" property.
   * <p>
   * Specifies the interval at which to check whether the log files
   * need to be rotated.
   *
   * @return Returns the value of the "time-interval" property.
   */
  long getTimeInterval();



  /**
   * Sets the "time-interval" property.
   * <p>
   * Specifies the interval at which to check whether the log files
   * need to be rotated.
   *
   * @param value The value of the "time-interval" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setTimeInterval(Long value) throws IllegalPropertyValueException;

}
