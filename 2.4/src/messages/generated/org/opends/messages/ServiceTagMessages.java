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
public final class ServiceTagMessages {

  /** Base property for resource bundle containing messages */
  private static final String BASE = "messages/servicetag";

  private static ClassLoader webstartClassLoader;

  // Prevent instantiation.
  private ServiceTagMessages() {
    // Do nothing.
  }

  /**
   * ServiceTag already exists
   */
  public static final MessageDescriptor.Arg0 WARN_SERVICETAG_ALREADY_EXIST =
          new MessageDescriptor.Arg0(BASE,"SEVERE_WARN_SERVICETAG_ALREADY_EXIST_1",SERVICETAG,SEVERE_WARNING,1, getClassLoader());

  /**
   * ServiceTag does not exist
   */
  public static final MessageDescriptor.Arg0 WARN_SERVICETAG_DOESNOT_EXIST =
          new MessageDescriptor.Arg0(BASE,"SEVERE_WARN_SERVICETAG_DOESNOT_EXIST_2",SERVICETAG,SEVERE_WARNING,2, getClassLoader());

  /**
   * Common Registration is not supported
   */
  public static final MessageDescriptor.Arg0 WARN_REGISTRY_NOT_SUPPORTED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_WARN_REGISTRY_NOT_SUPPORTED_3",SERVICETAG,SEVERE_WARNING,3, getClassLoader());

  /**
   * Parameter %s cannot be null or empty
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_PARAMETER_CANNOT_BE_NULL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_PARAMETER_CANNOT_BE_NULL_4",SERVICETAG,SEVERE_WARNING,4, getClassLoader());

  /**
   * ServiceTag cannot be registered for product name %s, product urn %s, installed location %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> WARN_SERVICETAG_CANNOT_BE_REGISTERED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_WARN_SERVICETAG_CANNOT_BE_REGISTERED_5",SERVICETAG,SEVERE_WARNING,5, getClassLoader());

  /**
   * ServiceTag cannot be removed
   */
  public static final MessageDescriptor.Arg0 WARN_SERVICETAG_CANNOT_BE_REMOVED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_WARN_SERVICETAG_CANNOT_BE_REMOVED_6",SERVICETAG,SEVERE_WARNING,6, getClassLoader());

  /**
   * No ServiceTag to remove
   */
  public static final MessageDescriptor.Arg0 WARN_NO_SERVICETAG_TO_REMOVE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_WARN_NO_SERVICETAG_TO_REMOVE_7",SERVICETAG,SEVERE_WARNING,7, getClassLoader());

  /**
   * No ServiceTag to register
   */
  public static final MessageDescriptor.Arg0 WARN_NO_SERVICETAG_TO_REGISTER =
          new MessageDescriptor.Arg0(BASE,"SEVERE_WARN_NO_SERVICETAG_TO_REGISTER_8",SERVICETAG,SEVERE_WARNING,8, getClassLoader());

  /**
   * Properties parameter does not contain %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_BAD_PROPERTIES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_BAD_PROPERTIES_9",SERVICETAG,SEVERE_WARNING,9, getClassLoader());

  /**
   * ServiceTag cannot be registered : %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_SERVICETAG_REGISTRATION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_SERVICETAG_REGISTRATION_10",SERVICETAG,SEVERE_WARNING,10, getClassLoader());


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
            Class<?> c = Class.forName("org.opends.messages.ServiceTagMessages");

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
      cl = ServiceTagMessages.class.getClassLoader();
    }
    return cl;
  }
}
