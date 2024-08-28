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
 *      Copyright 2006-2008 Sun Microsystems, Inc.
 */

package org.opends.messages;

import org.opends.messages.MessageDescriptor;
import static org.opends.messages.Category.*;
import static org.opends.messages.Severity.*;

/**
 * This file contains a number of constants that are used throughout the
 * Directory Server source.  It was dynamically generated as part of the
 * Directory Server build process and should not be edited directly.
 */
@org.opends.server.types.PublicAPI(
    stability=org.opends.server.types.StabilityLevel.PRIVATE,
    mayInstantiate=false,
    mayExtend=false,
    mayInvoke=true)
public final class LoggerMessages {

  /** Base property for resource bundle containing messages */
  private static final String BASE = "messages/log";

  private static ClassLoader webstartClassLoader;

  // Prevent instantiation.
  private LoggerMessages() {
    // Do nothing.
  }

  /**
   * Error occurred while writing log record for logger %s: %s. Any further write errors will be ignored
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LOGGER_ERROR_WRITING_RECORD =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LOGGER_ERROR_WRITING_RECORD_1",LOG,SEVERE_ERROR,1, getClassLoader());

  /**
   * Error occurred while opening log file %s for logger %s: %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_LOGGER_ERROR_OPENING_FILE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_LOGGER_ERROR_OPENING_FILE_2",LOG,SEVERE_ERROR,2, getClassLoader());

  /**
   * Error occurred while closing log file for logger %s: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LOGGER_ERROR_CLOSING_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LOGGER_ERROR_CLOSING_FILE_3",LOG,SEVERE_ERROR,3, getClassLoader());

  /**
   * Error occurred while flushing writer buffer for logger %s: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LOGGER_ERROR_FLUSHING_BUFFER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LOGGER_ERROR_FLUSHING_BUFFER_4",LOG,SEVERE_ERROR,4, getClassLoader());

  /**
   * Invalid error log severity "%s"
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ERROR_LOGGER_INVALID_SEVERITY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_WARN_ERROR_LOGGER_INVALID_SEVERITY_5",LOG,MILD_WARNING,5, getClassLoader());

  /**
   * Invalid error log category "%s"
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ERROR_LOGGER_INVALID_CATEGORY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_WARN_ERROR_LOGGER_INVALID_CATEGORY_6",LOG,MILD_WARNING,6, getClassLoader());

  /**
   * Invalid override of severity level "%s"
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ERROR_LOGGER_INVALID_OVERRIDE_SEVERITY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_WARN_ERROR_LOGGER_INVALID_OVERRIDE_SEVERITY_7",LOG,MILD_WARNING,7, getClassLoader());

  /**
   * Error occurred while setting file permissions for the log file %s: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_LOGGER_SET_PERMISSION_FAILED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_LOGGER_SET_PERMISSION_FAILED_8",LOG,SEVERE_WARNING,8, getClassLoader());

  /**
   * This platform does not support setting file permissions %s to the log file %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_LOGGER_UNABLE_SET_PERMISSIONS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_WARN_LOGGER_UNABLE_SET_PERMISSIONS_9",LOG,MILD_WARNING,9, getClassLoader());

  /**
   * Error occured while listing log files named by policy with initial file name %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LOGGER_ERROR_LISTING_FILES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LOGGER_ERROR_LISTING_FILES_10",LOG,SEVERE_ERROR,10, getClassLoader());

  /**
   * Error occured while obtaining free disk space in the partition containing log file %s: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LOGGER_ERROR_OBTAINING_FREE_SPACE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LOGGER_ERROR_OBTAINING_FREE_SPACE_11",LOG,SEVERE_ERROR,11, getClassLoader());

  /**
   * Error occured while enforcing retention policy %s for logger %s: %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_LOGGER_ERROR_ENFORCING_RETENTION_POLICY =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_LOGGER_ERROR_ENFORCING_RETENTION_POLICY_12",LOG,SEVERE_ERROR,12, getClassLoader());


 /**
  * Returns the Class Loader to be used to get the ResourceBundle,
  * it returns <CODE>null</CODE> if the default ClassLoader is to be
  * used.
  * @return the Class Loader to be used to get the ResourceBundle,
  * it returns <CODE>null</CODE> if the default ClassLoader is to be
  * used.
  */
  private static ClassLoader getClassLoader()
  {
    ClassLoader cl;
    if (false)
    {
      if (org.opends.server.util.SetupUtils.isWebStart())
      {
        if (webstartClassLoader == null)
        {
          try
          {
            Class<?> c = Class.forName("org.opends.messages.LoggerMessages");

            java.net.URL[] urls = new java.net.URL[] {
                c.getProtectionDomain().getCodeSource().getLocation()
            };
            webstartClassLoader = new java.net.URLClassLoader(urls);
          }
          catch (ClassNotFoundException cnfe)
          {
            // This cannot happen as we are looking for this class so it is
            // already found.
          }
        }
        cl = webstartClassLoader;
      }
      else
      {
        cl = null;
      }
    }
    else
    {
      cl = LoggerMessages.class.getClassLoader();
    }
    return cl;
  }
}
