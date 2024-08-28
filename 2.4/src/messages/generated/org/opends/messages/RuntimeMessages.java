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
public final class RuntimeMessages {

  /** Base property for resource bundle containing messages */
  private static final String BASE = "messages/runtime_information";

  private static ClassLoader webstartClassLoader;

  // Prevent instantiation.
  private RuntimeMessages() {
    // Do nothing.
  }

  /**
   * JAVA Version:            %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_JAVA_VERSION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_JAVA_VERSION_1",RUNTIME_INFORMATION,NOTICE,1, getClassLoader());

  /**
   * JAVA Vendor:             %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_JAVA_VENDOR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_JAVA_VENDOR_2",RUNTIME_INFORMATION,NOTICE,2, getClassLoader());

  /**
   * JVM Version:             %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_JVM_VERSION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_JVM_VERSION_3",RUNTIME_INFORMATION,NOTICE,3, getClassLoader());

  /**
   * JVM Vendor:              %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_JVM_VENDOR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_JVM_VENDOR_4",RUNTIME_INFORMATION,NOTICE,4, getClassLoader());

  /**
   * JAVA Home:               %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_JAVA_HOME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_JAVA_HOME_5",RUNTIME_INFORMATION,NOTICE,5, getClassLoader());

  /**
   * Class Path:              %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_JAVA_CLASSPATH =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_JAVA_CLASSPATH_6",RUNTIME_INFORMATION,NOTICE,6, getClassLoader());

  /**
   * JE Version:              %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_JE_VERSION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_JE_VERSION_7",RUNTIME_INFORMATION,NOTICE,7, getClassLoader());

  /**
   * Current Directory:       %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_CURRENT_DIRECTORY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_CURRENT_DIRECTORY_8",RUNTIME_INFORMATION,NOTICE,8, getClassLoader());

  /**
   * Operating System:        %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_OPERATING_SYSTEM =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_OPERATING_SYSTEM_9",RUNTIME_INFORMATION,NOTICE,9, getClassLoader());

  /**
   * JVM Architecture:        %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_JVM_ARCH =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_JVM_ARCH_10",RUNTIME_INFORMATION,NOTICE,10, getClassLoader());

  /**
   * System Name:             %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_SYSTEM_NAME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_SYSTEM_NAME_11",RUNTIME_INFORMATION,NOTICE,11, getClassLoader());

  /**
   * Available Processors:    %d
   */
  public static final MessageDescriptor.Arg1<Number> NOTE_AVAILABLE_PROCESSORS =
          new MessageDescriptor.Arg1<Number>(BASE,"NOTICE_AVAILABLE_PROCESSORS_12",RUNTIME_INFORMATION,NOTICE,12, getClassLoader());

  /**
   * Max Available Memory:    %d
   */
  public static final MessageDescriptor.Arg1<Number> NOTE_MAX_MEMORY =
          new MessageDescriptor.Arg1<Number>(BASE,"NOTICE_MAX_MEMORY_13",RUNTIME_INFORMATION,NOTICE,13, getClassLoader());

  /**
   * Currently Used Memory:   %d
   */
  public static final MessageDescriptor.Arg1<Number> NOTE_TOTAL_MEMORY =
          new MessageDescriptor.Arg1<Number>(BASE,"NOTICE_TOTAL_MEMORY_14",RUNTIME_INFORMATION,NOTICE,14, getClassLoader());

  /**
   * Currently Free Memory:   %d
   */
  public static final MessageDescriptor.Arg1<Number> NOTE_FREE_MEMORY =
          new MessageDescriptor.Arg1<Number>(BASE,"NOTICE_FREE_MEMORY_15",RUNTIME_INFORMATION,NOTICE,15, getClassLoader());

  /**
   * JVM Input Arguments:     %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_JVM_INPUT_ARGUMENTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_JVM_INPUT_ARGUMENTS_16",RUNTIME_INFORMATION,NOTICE,16, getClassLoader());

  /**
   * JVM Information: %s by %s, %s architecture, %d bytes heap size
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,Number> NOTE_JVM_INFO =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,Number>(BASE,"NOTICE_JVM_INFO_17",RUNTIME_INFORMATION,NOTICE,17, getClassLoader());

  /**
   * JVM Host: %s, running %s, %d bytes physical memory size, number of processors available %d
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,Number,Number> NOTE_JVM_HOST =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,Number,Number>(BASE,"NOTICE_JVM_HOST_18",RUNTIME_INFORMATION,NOTICE,18, getClassLoader());

  /**
   * JVM Arguments: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_JVM_ARGS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_JVM_ARGS_19",RUNTIME_INFORMATION,NOTICE,19, getClassLoader());

  /**
   * JVM Host: %s, running %s, unknown physical memory size, number of processors available %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> NOTE_JVM_HOST_WITH_UNKNOWN_PHYSICAL_MEM =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"NOTICE_JVM_HOST_WITH_UNKNOWN_PHYSICAL_MEM_20",RUNTIME_INFORMATION,NOTICE,20, getClassLoader());

  /**
   * Installation Directory:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_INSTALL_DIRECTORY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_INSTALL_DIRECTORY_21",RUNTIME_INFORMATION,NOTICE,21, getClassLoader());

  /**
   * Installation Directory:  unknown
   */
  public static final MessageDescriptor.Arg0 NOTE_UNKNOWN_INSTALL_DIRECTORY =
          new MessageDescriptor.Arg0(BASE,"NOTICE_UNKNOWN_INSTALL_DIRECTORY_22",RUNTIME_INFORMATION,NOTICE,22, getClassLoader());

  /**
   * Instance Directory:      %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_INSTANCE_DIRECTORY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_INSTANCE_DIRECTORY_23",RUNTIME_INFORMATION,NOTICE,23, getClassLoader());

  /**
   * Instance Directory:      unknown
   */
  public static final MessageDescriptor.Arg0 NOTE_UNKNOWN_INSTANCE_DIRECTORY =
          new MessageDescriptor.Arg0(BASE,"NOTICE_UNKNOWN_INSTANCE_DIRECTORY_24",RUNTIME_INFORMATION,NOTICE,24, getClassLoader());


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
            Class<?> c = Class.forName("org.opends.messages.RuntimeMessages");

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
      cl = RuntimeMessages.class.getClassLoader();
    }
    return cl;
  }
}
