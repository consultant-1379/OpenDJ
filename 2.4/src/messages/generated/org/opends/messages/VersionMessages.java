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
public final class VersionMessages {

  /** Base property for resource bundle containing messages */
  private static final String BASE = "messages/version";

  private static ClassLoader webstartClassLoader;

  // Prevent instantiation.
  private VersionMessages() {
    // Do nothing.
  }

  /**
   * With this upgrade, the Berkeley DB Java Edition JAR will be upgraded to version 3.2.13 which introduces incompatibilities to the data format.  Consequently if at a later time you wish to revert this installation to its prior version you will have to export the data from this server and reimport it once the reversion has finished
   */
  public static final MessageDescriptor.Arg0 INFO_890_UPGRADE =
          new MessageDescriptor.Arg0(BASE,"INFO_890_UPGRADE_1",VERSION,INFORMATION,1, getClassLoader());

  /**
   * With this reversion, the Berkeley DB Java Edition JAR will be downgraded to an older version which uses a different data format than the current version.  In order to revert this server you will have to export the data from this server and reimport it after the reversion has finished
   */
  public static final MessageDescriptor.Arg0 INFO_890_REVERSION =
          new MessageDescriptor.Arg0(BASE,"INFO_890_REVERSION_2",VERSION,INFORMATION,2, getClassLoader());

  /**
   * This upgrade introduces improvements to the data format which are not backward compatible with the current version.  Consequently if at a later time you wish to revert this installation to its prior version you will have to export the data from this server and reimport it once the reversion has finished
   */
  public static final MessageDescriptor.Arg0 INFO_1582_UPGRADE =
          new MessageDescriptor.Arg0(BASE,"INFO_1582_UPGRADE_3",VERSION,INFORMATION,3, getClassLoader());

  /**
   * With this reversion the data format used to store data by the server will be reverted to a prior version.  In order to revert this server you will have to export the data from this server and reimport it after the reversion has finished
   */
  public static final MessageDescriptor.Arg0 INFO_1582_REVERSION =
          new MessageDescriptor.Arg0(BASE,"INFO_1582_REVERSION_4",VERSION,INFORMATION,4, getClassLoader());

  /**
   * This upgrade introduces improvements to the data format which are not backward compatible with the current version.  Consequently if at a later time you wish to revert this installation to its prior version you will have to export the data from this server and reimport it once the reversion has finished
   */
  public static final MessageDescriptor.Arg0 INFO_2049_UPGRADE =
          new MessageDescriptor.Arg0(BASE,"INFO_2049_UPGRADE_5",VERSION,INFORMATION,5, getClassLoader());

  /**
   * With this reversion the data format used to store data by the server will be reverted to a prior version.  In order to revert this server you will have to export the data from this server and reimport it after the reversion has finished
   */
  public static final MessageDescriptor.Arg0 INFO_2049_REVERSION =
          new MessageDescriptor.Arg0(BASE,"INFO_2049_REVERSION_6",VERSION,INFORMATION,6, getClassLoader());

  /**
   * This upgrade introduces an incompatible property change for the default password storage scheme and deprecated password storage schemes associated with a password policy.  The schemes are now referenced by DN rather than by name.  Upgrade is not possible because the scheme name cannot be automatically translated into a DN
   */
  public static final MessageDescriptor.Arg0 INFO_2974_UPGRADE =
          new MessageDescriptor.Arg0(BASE,"INFO_2974_UPGRADE_7",VERSION,INFORMATION,7, getClassLoader());

  /**
   * It is not possible to revert to a revision before 2974 because the default password storage scheme and deprecated password storage scheme references in the password policy have been converted from names to DNs, and it is not possible to revert from the DN back to the scheme name
   */
  public static final MessageDescriptor.Arg0 INFO_2974_REVERSION =
          new MessageDescriptor.Arg0(BASE,"INFO_2974_REVERSION_8",VERSION,INFORMATION,8, getClassLoader());

  /**
   * This upgrade introduces a new security framework that is not backwards compatible.  Upgrade is not possible
   */
  public static final MessageDescriptor.Arg0 INFO_3294_UPGRADE =
          new MessageDescriptor.Arg0(BASE,"INFO_3294_UPGRADE_9",VERSION,INFORMATION,9, getClassLoader());

  /**
   * The revision 3294 introduces a new security framework.  Revert is not possible
   */
  public static final MessageDescriptor.Arg0 INFO_3294_REVERSION =
          new MessageDescriptor.Arg0(BASE,"INFO_3294_REVERSION_10",VERSION,INFORMATION,10, getClassLoader());

  /**
   * This upgrade introduces a change in the backend configuration that is not backwards compatible.  Upgrade is not possible
   */
  public static final MessageDescriptor.Arg0 INFO_3708_UPGRADE =
          new MessageDescriptor.Arg0(BASE,"INFO_3708_UPGRADE_11",VERSION,INFORMATION,11, getClassLoader());

  /**
   * The revision 3294 introduces a change in the backend configuration.  Revert is not possible
   */
  public static final MessageDescriptor.Arg0 INFO_3708_REVERSION =
          new MessageDescriptor.Arg0(BASE,"INFO_3708_REVERSION_12",VERSION,INFORMATION,12, getClassLoader());

  /**
   * This change introduces a change to the way in which distinguished names are normalized.  In order to upgrade this server you will have to export the data from this server and reimport it after the upgrade has finished
   */
  public static final MessageDescriptor.Arg0 INFO_3873_UPGRADE =
          new MessageDescriptor.Arg0(BASE,"INFO_3873_UPGRADE_13",VERSION,INFORMATION,13, getClassLoader());

  /**
   * With this reversion the normalized form of distinguished names will be reverted to a prior version.  In order to revert this server you will have to export the data from this server and reimport it after the reversion has finished
   */
  public static final MessageDescriptor.Arg0 INFO_3873_REVERSION =
          new MessageDescriptor.Arg0(BASE,"INFO_3873_REVERSION_14",VERSION,INFORMATION,14, getClassLoader());

  /**
   * The revision 5134 introduces a change to the way in which certain matching rules normalize an attribute or assertion value. In order to upgrade this server you will have to export the data from this server and reimport it after the upgrade has finished
   */
  public static final MessageDescriptor.Arg0 INFO_5134_UPGRADE =
          new MessageDescriptor.Arg0(BASE,"INFO_5134_UPGRADE_15",VERSION,INFORMATION,15, getClassLoader());

  /**
   * With this reversion the normalization of attribute or assertion value will be reverted to a prior version.  In order to revert this server you will have to export the data from this server and reimport it after the reversion has finished
   */
  public static final MessageDescriptor.Arg0 INFO_5134_REVERSION =
          new MessageDescriptor.Arg0(BASE,"INFO_5134_REVERSION_16",VERSION,INFORMATION,16, getClassLoader());

  /**
   * Reversion from version 2.0 to a previous version is not supported
   */
  public static final MessageDescriptor.Arg0 INFO_5278_REVERSION =
          new MessageDescriptor.Arg0(BASE,"INFO_5278_REVERSION_17",VERSION,INFORMATION,17, getClassLoader());


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
            Class<?> c = Class.forName("org.opends.messages.VersionMessages");

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
      cl = VersionMessages.class.getClassLoader();
    }
    return cl;
  }
}
