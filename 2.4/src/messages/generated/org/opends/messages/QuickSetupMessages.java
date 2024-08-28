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
public final class QuickSetupMessages {

  /** Base property for resource bundle containing messages */
  private static final String BASE = "messages/quicksetup";

  private static ClassLoader webstartClassLoader;

  // Prevent instantiation.
  private QuickSetupMessages() {
    // Do nothing.
  }

  /**
   * Java arguments: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ADDITIONAL_ARGUMENTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ADDITIONAL_ARGUMENTS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Administrator already registered.
   */
  public static final MessageDescriptor.Arg0 INFO_ADMINISTRATOR_ALREADY_REGISTERED =
          new MessageDescriptor.Arg0(BASE,"INFO_ADMINISTRATOR_ALREADY_REGISTERED",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Administration Connector Port:
   */
  public static final MessageDescriptor.Arg0 INFO_ADMIN_CONNECTOR_PORT_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_ADMIN_CONNECTOR_PORT_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Enter the port number that the administration connector will use.
   */
  public static final MessageDescriptor.Arg0 INFO_ADMIN_CONNECTOR_PORT_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_ADMIN_CONNECTOR_PORT_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * You must specify different ports for the Administration Connector Port and the other listeners.
   */
  public static final MessageDescriptor.Arg0 INFO_ADMIN_CONNECTOR_VALUE_SEVERAL_TIMES =
          new MessageDescriptor.Arg0(BASE,"INFO_ADMIN_CONNECTOR_VALUE_SEVERAL_TIMES",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The following administrators are defined in server %s but not in server %s:%n%s%nThe merge can only be performed if these administrators are defined in server %s.  Use the command-line dsframework to do so.
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> ERR_ADS_ADMINISTRATOR_MERGE =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"FATAL_ERR_ADS_ADMINISTRATOR_MERGE",QUICKSETUP,FATAL_ERROR,-1, getClassLoader());

  /**
   * Registration information error.  Error type: '%s'.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ADS_CONTEXT_EXCEPTION_MSG =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ADS_CONTEXT_EXCEPTION_MSG",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Registration information error.  Error type: '%s'.  Details: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_ADS_CONTEXT_EXCEPTION_WITH_DETAILS_MSG =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_ADS_CONTEXT_EXCEPTION_WITH_DETAILS_MSG",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * An unexpected error occurred managing the registration information.%nThe error is: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ADS_EXCEPTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ADS_EXCEPTION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The registration information of server %s and server %s could not be merged.  Reasons:%n%s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_ADS_MERGE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"FATAL_ERR_ADS_MERGE",QUICKSETUP,FATAL_ERROR,-1, getClassLoader());

  /**
   * Considering the number of entries that will be automatically generated and imported to the server, the default runtime settings might not be enough to be able to manage that volume of data.  It is recommended to increase the maximum memory allowed for both the server runtime and the import.<br><br>Check the documentation for more information about how to tune the server.
   */
  public static final MessageDescriptor.Arg0 INFO_AUTOMATICALLY_GENERATED_DATA_WARNING_UPDATE_RUNTIME_ARGS =
          new MessageDescriptor.Arg0(BASE,"INFO_AUTOMATICALLY_GENERATED_DATA_WARNING_UPDATE_RUNTIME_ARGS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * images/opendsbackground.png
   */
  public static final MessageDescriptor.Arg0 INFO_BACKGROUND_ICON =
          new MessageDescriptor.Arg0(BASE,"INFO_BACKGROUND_ICON",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * QuickSetup.
   */
  public static final MessageDescriptor.Arg0 INFO_BACKGROUND_ICON_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_BACKGROUND_ICON_DESCRIPTION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * QuickSetup
   */
  public static final MessageDescriptor.Arg0 INFO_BACKGROUND_ICON_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_BACKGROUND_ICON_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The provided Directory Base DN is used for storing the server configuration data. You must specify a different DN.
   */
  public static final MessageDescriptor.Arg0 INFO_BASE_DN_IS_CONFIGURATION_DN =
          new MessageDescriptor.Arg0(BASE,"INFO_BASE_DN_IS_CONFIGURATION_DN",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Directory Base DN:
   */
  public static final MessageDescriptor.Arg0 INFO_BASE_DN_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_BASE_DN_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Enter the DN of the top entry where your data will be stored
   */
  public static final MessageDescriptor.Arg0 INFO_BASE_DN_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_BASE_DN_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Browse...
   */
  public static final MessageDescriptor.Arg0 INFO_BROWSE_BUTTON_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_BROWSE_BUTTON_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Click to display a file system browser
   */
  public static final MessageDescriptor.Arg0 INFO_BROWSE_BUTTON_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_BROWSE_BUTTON_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * An unexpected error occurred.
   */
  public static final MessageDescriptor.Arg0 INFO_BUG_MSG =
          new MessageDescriptor.Arg0(BASE,"INFO_BUG_MSG",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Failed to extract build: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_BUILD_EXTRACTOR_ERROR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_BUILD_EXTRACTOR_ERROR",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * File %s is not a .zip file.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_BUILD_EXTRACTOR_ERROR_FILE_NOT_ZIP =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_BUILD_EXTRACTOR_ERROR_FILE_NOT_ZIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * File %s does not exist.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_BUILD_EXTRACTOR_ERROR_FILE_NO_EXIST =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_BUILD_EXTRACTOR_ERROR_FILE_NO_EXIST",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Could not extract a valid server installation from %s because: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_BUILD_EXTRACTOR_FILE_INVALID =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_BUILD_EXTRACTOR_FILE_INVALID",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Downloading Build...
   */
  public static final MessageDescriptor.Arg0 INFO_BUILD_MANAGER_DOWNLOADING_BUILD =
          new MessageDescriptor.Arg0(BASE,"INFO_BUILD_MANAGER_DOWNLOADING_BUILD",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Finished Downloading Build
   */
  public static final MessageDescriptor.Arg0 INFO_BUILD_MANAGER_DOWNLOADING_BUILD_DONE =
          new MessageDescriptor.Arg0(BASE,"INFO_BUILD_MANAGER_DOWNLOADING_BUILD_DONE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Downloading Build: %s%% Completed
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_BUILD_MANAGER_DOWNLOADING_BUILD_PROGRESS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_BUILD_MANAGER_DOWNLOADING_BUILD_PROGRESS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Cancel
   */
  public static final MessageDescriptor.Arg0 INFO_CANCEL_BUTTON_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CANCEL_BUTTON_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Cancel the currently running operation
   */
  public static final MessageDescriptor.Arg0 INFO_CANCEL_BUTTON_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_CANCEL_BUTTON_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Cannot bind to port %s.%n%nThe port could be already in use by another application or maybe you do not have the rights to access it.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CANNOT_BIND_PORT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CANNOT_BIND_PORT",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Cannot bind to privileged port %s.%n%nThe port could be already in use by another application or maybe you do not have the rights to access it.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CANNOT_BIND_PRIVILEDGED_PORT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CANNOT_BIND_PRIVILEDGED_PORT",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The provided credentials are not valid.  Details: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CANNOT_CONNECT_TO_LOCAL_AUTHENTICATION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CANNOT_CONNECT_TO_LOCAL_AUTHENTICATION",QUICKSETUP,SEVERE_ERROR,-1, getClassLoader());

  /**
   * Could not connect to the server.  Check that the server is running.  Details: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CANNOT_CONNECT_TO_LOCAL_COMMUNICATION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CANNOT_CONNECT_TO_LOCAL_COMMUNICATION",QUICKSETUP,SEVERE_ERROR,-1, getClassLoader());

  /**
   * Could not connect to the server.  Check that the server is running and that the provided credentials are valid.%nError details:%n%s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CANNOT_CONNECT_TO_LOCAL_GENERIC =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CANNOT_CONNECT_TO_LOCAL_GENERIC",QUICKSETUP,SEVERE_ERROR,-1, getClassLoader());

  /**
   * You do not have enough access rights to read the configuration in the server. %nProvide credentials with enough rights.  Details: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CANNOT_CONNECT_TO_LOCAL_PERMISSIONS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CANNOT_CONNECT_TO_LOCAL_PERMISSIONS",QUICKSETUP,SEVERE_ERROR,-1, getClassLoader());

  /**
   * The provided credentials are not valid in server %s.  Details: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_CANNOT_CONNECT_TO_REMOTE_AUTHENTICATION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_CANNOT_CONNECT_TO_REMOTE_AUTHENTICATION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Could not connect to the remote server %s.  Check that the server is running and that is accessible from the local machine.  Details: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CANNOT_CONNECT_TO_REMOTE_COMMUNICATION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CANNOT_CONNECT_TO_REMOTE_COMMUNICATION",QUICKSETUP,SEVERE_ERROR,-1, getClassLoader());

  /**
   * Could not connect to %s.  Check that the server is running and that the provided credentials are valid.%nError details:%n%s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_CANNOT_CONNECT_TO_REMOTE_GENERIC =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_CANNOT_CONNECT_TO_REMOTE_GENERIC",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * You do not have enough access rights to read the configuration in %s. %nProvide credentials with enough rights.  Details: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_CANNOT_CONNECT_TO_REMOTE_PERMISSIONS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_CANNOT_CONNECT_TO_REMOTE_PERMISSIONS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Could not connect to the Directory Server with the provided credentials.%nCheck that the Administrative User DN and password are valid.
   */
  public static final MessageDescriptor.Arg0 INFO_CANNOT_CONNECT_TO_SHUTDOWN_WITHOUT_CAUSE =
          new MessageDescriptor.Arg0(BASE,"INFO_CANNOT_CONNECT_TO_SHUTDOWN_WITHOUT_CAUSE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Could not connect to the Directory Server with the provided credentials.  The possible causes for this are:%n%s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CANNOT_CONNECT_TO_SHUTDOWN_WITH_CAUSE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CANNOT_CONNECT_TO_SHUTDOWN_WITH_CAUSE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Disabled.  A valid keytool command could not be found.
   */
  public static final MessageDescriptor.Arg0 INFO_CANNOT_UPDATE_SECURITY_WARNING =
          new MessageDescriptor.Arg0(BASE,"INFO_CANNOT_UPDATE_SECURITY_WARNING",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Could not use 4444. Port in use or user not authorized.
   */
  public static final MessageDescriptor.Arg0 INFO_CANNOT_USE_DEFAULT_ADMIN_CONNECTOR_PORT =
          new MessageDescriptor.Arg0(BASE,"INFO_CANNOT_USE_DEFAULT_ADMIN_CONNECTOR_PORT",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Could not use 389. Port in use or user not authorized.
   */
  public static final MessageDescriptor.Arg0 INFO_CANNOT_USE_DEFAULT_PORT =
          new MessageDescriptor.Arg0(BASE,"INFO_CANNOT_USE_DEFAULT_PORT",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Could not use 636. Port in use or user not authorized.
   */
  public static final MessageDescriptor.Arg0 INFO_CANNOT_USE_DEFAULT_SECURE_PORT =
          new MessageDescriptor.Arg0(BASE,"INFO_CANNOT_USE_DEFAULT_SECURE_PORT",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * To view the details of a given certificate select it.
   */
  public static final MessageDescriptor.Arg0 INFO_CERTIFICATE_CHAIN_COMBO_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_CERTIFICATE_CHAIN_COMBO_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Certificate Chain:
   */
  public static final MessageDescriptor.Arg0 INFO_CERTIFICATE_CHAIN_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CERTIFICATE_CHAIN_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Accept for this Session
   */
  public static final MessageDescriptor.Arg0 INFO_CERTIFICATE_DIALOG_ACCEPT_FOR_SESSION_BUTTON_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CERTIFICATE_DIALOG_ACCEPT_FOR_SESSION_BUTTON_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Close this dialog and accept the certificate only for this session.
   */
  public static final MessageDescriptor.Arg0 INFO_CERTIFICATE_DIALOG_ACCEPT_FOR_SESSION_BUTTON_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_CERTIFICATE_DIALOG_ACCEPT_FOR_SESSION_BUTTON_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Accept permanently
   */
  public static final MessageDescriptor.Arg0 INFO_CERTIFICATE_DIALOG_ACCEPT_PERMANENTLY_BUTTON_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CERTIFICATE_DIALOG_ACCEPT_PERMANENTLY_BUTTON_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Close this dialog and accept the certificate permanently.
   */
  public static final MessageDescriptor.Arg0 INFO_CERTIFICATE_DIALOG_ACCEPT_PERMANENTLY_BUTTON_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_CERTIFICATE_DIALOG_ACCEPT_PERMANENTLY_BUTTON_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Do not Accept
   */
  public static final MessageDescriptor.Arg0 INFO_CERTIFICATE_DIALOG_DO_NOT_ACCEPT_BUTTON_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CERTIFICATE_DIALOG_DO_NOT_ACCEPT_BUTTON_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Close this dialog and do not accept the certificate.
   */
  public static final MessageDescriptor.Arg0 INFO_CERTIFICATE_DIALOG_DO_NOT_ACCEPT_BUTTON_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_CERTIFICATE_DIALOG_DO_NOT_ACCEPT_BUTTON_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Certificate Not Trusted
   */
  public static final MessageDescriptor.Arg0 INFO_CERTIFICATE_DIALOG_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CERTIFICATE_DIALOG_TITLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * You must accept the certificate presented by %s:%s.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_CERTIFICATE_EXCEPTION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_CERTIFICATE_EXCEPTION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * %s - Expired
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CERTIFICATE_EXPIRED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CERTIFICATE_EXPIRED",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Expires On:
   */
  public static final MessageDescriptor.Arg0 INFO_CERTIFICATE_EXPIRES_ON_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CERTIFICATE_EXPIRES_ON_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * <br><br><a href="">Hide Certificate Details</a>
   */
  public static final MessageDescriptor.Arg0 INFO_CERTIFICATE_HIDE_DETAILS_TEXT =
          new MessageDescriptor.Arg0(BASE,"INFO_CERTIFICATE_HIDE_DETAILS_TEXT",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Issued By:
   */
  public static final MessageDescriptor.Arg0 INFO_CERTIFICATE_ISSUED_BY_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CERTIFICATE_ISSUED_BY_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Certificate:
   */
  public static final MessageDescriptor.Arg0 INFO_CERTIFICATE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CERTIFICATE_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * MD5 Fingerprint:
   */
  public static final MessageDescriptor.Arg0 INFO_CERTIFICATE_MD5_FINGERPRINT_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CERTIFICATE_MD5_FINGERPRINT_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The Certificate presented by the server %s:%s could not be trusted.<br><br>There is a name mismatch between the name of the server (%s) and the subject DN of the certificate.<br>This could be caused because you are connected to a server pretending to be %s:%s.<br><br>Before accepting this certificate, you should examine the server's certificate carefully.<br><br>Are you willing to accept this certificate for the purpose of identifying the server %s:%s?
   */
  public static final MessageDescriptor.Arg7<CharSequence,CharSequence,CharSequence,CharSequence,CharSequence,CharSequence,CharSequence> INFO_CERTIFICATE_NAME_MISMATCH_TEXT =
          new MessageDescriptor.Arg7<CharSequence,CharSequence,CharSequence,CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"INFO_CERTIFICATE_NAME_MISMATCH_TEXT",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The Certificate presented by the server %s:%s could not be trusted.
   * There is a name mismatch between the name of the server (%s) and the subject DN of the certificate.  This could be caused because you are connected to a server pretending to be %s:%s.
   * Before accepting this certificate, you should examine the server's certificate carefully.
   */
  public static final MessageDescriptor.Arg5<CharSequence,CharSequence,CharSequence,CharSequence,CharSequence> INFO_CERTIFICATE_NAME_MISMATCH_TEXT_CLI =
          new MessageDescriptor.Arg5<CharSequence,CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"INFO_CERTIFICATE_NAME_MISMATCH_TEXT_CLI",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The Certificate presented by the server %s:%s could not be trusted.<br><br>Possible reasons for this error:<br>&nbsp;&nbsp;&nbsp;&nbsp;-The Certificate Authority that issued the certificate is not recognized (this is the case of the self-signed certificates).<br>&nbsp;&nbsp;&nbsp;&nbsp;-The server's certificate is incomplete due to a misconfiguration.<br>&nbsp;&nbsp;&nbsp;&nbsp;-The server's certificate has expired.<br>&nbsp;&nbsp;&nbsp;&nbsp;-There is a time difference between the server machine clock and the local machine clock.<br>Before accepting this certificate, you should examine the server's certificate carefully.<br><br>Are you willing to accept this certificate for the purpose of identifying the server %s:%s?
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> INFO_CERTIFICATE_NOT_TRUSTED_TEXT =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"INFO_CERTIFICATE_NOT_TRUSTED_TEXT",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The Certificate presented by the server %s:%s could not be trusted.
   * Possible reasons for this error:
   * -The Certificate Authority that issued the certificate is not recognized (this is the case of the self-signed certificates).
   * -The server's certificate is incomplete due to a misconfiguration.
   * -The server's certificate has expired.
   * -There is a time difference between the server machine clock and the local machine clock.
   * Before accepting this certificate, you should examine the server's certificate carefully.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_CERTIFICATE_NOT_TRUSTED_TEXT_CLI =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_CERTIFICATE_NOT_TRUSTED_TEXT_CLI",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * %s - Not valid yet
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CERTIFICATE_NOT_VALID_YET =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CERTIFICATE_NOT_VALID_YET",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Serial Number:
   */
  public static final MessageDescriptor.Arg0 INFO_CERTIFICATE_SERIAL_NUMBER_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CERTIFICATE_SERIAL_NUMBER_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * SHA1 Fingerprint:
   */
  public static final MessageDescriptor.Arg0 INFO_CERTIFICATE_SHA1_FINGERPRINT_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CERTIFICATE_SHA1_FINGERPRINT_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * <br><br><a href="">Show Certificate Details</a>
   */
  public static final MessageDescriptor.Arg0 INFO_CERTIFICATE_SHOW_DETAILS_TEXT =
          new MessageDescriptor.Arg0(BASE,"INFO_CERTIFICATE_SHOW_DETAILS_TEXT",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Subject:
   */
  public static final MessageDescriptor.Arg0 INFO_CERTIFICATE_SUBJECT_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CERTIFICATE_SUBJECT_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Certificate Not Trusted
   */
  public static final MessageDescriptor.Arg0 INFO_CERTIFICATE_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CERTIFICATE_TITLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Type:
   */
  public static final MessageDescriptor.Arg0 INFO_CERTIFICATE_TYPE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CERTIFICATE_TYPE_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Valid From:
   */
  public static final MessageDescriptor.Arg0 INFO_CERTIFICATE_VALID_FROM_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CERTIFICATE_VALID_FROM_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * 000,000,000
   */
  public static final MessageDescriptor.Arg0 INFO_CHECKBOX_COLOR =
          new MessageDescriptor.Arg0(BASE,"INFO_CHECKBOX_COLOR",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Unknown argument %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CLI_UPGRADE_UNKNOWN_ARGUMENT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CLI_UPGRADE_UNKNOWN_ARGUMENT",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Close Setup Window
   */
  public static final MessageDescriptor.Arg0 INFO_CLOSE_BUTTON_INSTALL_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_CLOSE_BUTTON_INSTALL_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Close
   */
  public static final MessageDescriptor.Arg0 INFO_CLOSE_BUTTON_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CLOSE_BUTTON_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Close Setup Window
   */
  public static final MessageDescriptor.Arg0 INFO_CLOSE_BUTTON_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_CLOSE_BUTTON_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Close Progress Dialog
   */
  public static final MessageDescriptor.Arg0 INFO_CLOSE_PROGRESS_BUTTON_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_CLOSE_PROGRESS_BUTTON_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * 255,255,255
   */
  public static final MessageDescriptor.Arg0 INFO_COMBOBOX_BACKGROUND_COLOR =
          new MessageDescriptor.Arg0(BASE,"INFO_COMBOBOX_BACKGROUND_COLOR",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Confirmation Required
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIRMATION_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIRMATION_TITLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Are you sure you want to cancel QuickSetup?%nIf you click 'Yes' nothing will be installed on your system.
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIRM_CANCEL_INSTALL_MSG =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIRM_CANCEL_INSTALL_MSG",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Confirmation Required
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIRM_CANCEL_INSTALL_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIRM_CANCEL_INSTALL_TITLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Cancel the running operation?
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIRM_CANCEL_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIRM_CANCEL_PROMPT",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Confirmation Required
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIRM_CANCEL_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIRM_CANCEL_TITLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * QuickUpgrade has not yet completed.%nIf you click 'Yes' any changes that have been made to the server being upgraded will be backed out.%n%nAre you sure you want to close the QuickUpgrade Window?%n
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIRM_CANCEL_UPGRADE_MSG =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIRM_CANCEL_UPGRADE_MSG",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Confirmation Required
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIRM_CANCEL_UPGRADE_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIRM_CANCEL_UPGRADE_TITLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * QuickSetup has not yet completed.%nAre you sure you want to close the QuickSetup Window?
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIRM_CLOSE_INSTALL_MSG =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIRM_CLOSE_INSTALL_MSG",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Confirmation Required
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIRM_CLOSE_INSTALL_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIRM_CLOSE_INSTALL_TITLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Are you sure you want to quit QuickSetup?%nIf you click 'Yes' nothing will be installed on your system.
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIRM_QUIT_INSTALL_MSG =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIRM_QUIT_INSTALL_MSG",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Confirmation Required
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIRM_QUIT_INSTALL_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIRM_QUIT_INSTALL_TITLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Are you sure you want to quit QuickUpgrade?%nIf you click 'Yes' nothing will be upgraded on your system.
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIRM_QUIT_UPGRADE_MSG =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIRM_QUIT_UPGRADE_MSG",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Confirmation Required
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIRM_QUIT_UPGRADE_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIRM_QUIT_UPGRADE_TITLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Uninstall Options
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIRM_UNINSTALL_STEP =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIRM_UNINSTALL_STEP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Contacting server...
   */
  public static final MessageDescriptor.Arg0 INFO_CONTACTING_SERVER_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CONTACTING_SERVER_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Continue with Setup
   */
  public static final MessageDescriptor.Arg0 INFO_CONTINUE_BUTTON_INSTALL_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_CONTINUE_BUTTON_INSTALL_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Continue
   */
  public static final MessageDescriptor.Arg0 INFO_CONTINUE_BUTTON_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CONTINUE_BUTTON_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Could not find a remote peer to initialize the contents of local base DN: %s.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_COULD_NOT_FIND_REPLICATIONID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_COULD_NOT_FIND_REPLICATIONID",QUICKSETUP,SEVERE_ERROR,-1, getClassLoader());

  /**
   * An unexpected error occurred launching the Control Panel.
   */
  public static final MessageDescriptor.Arg0 INFO_COULD_NOT_LAUNCH_CONTROL_PANEL_MSG =
          new MessageDescriptor.Arg0(BASE,"INFO_COULD_NOT_LAUNCH_CONTROL_PANEL_MSG",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Only Create Base Entry (%s)
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CREATE_BASE_ENTRY_LABEL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CREATE_BASE_ENTRY_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Only create the top entry for the Directory Base DN
   */
  public static final MessageDescriptor.Arg0 INFO_CREATE_BASE_ENTRY_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_CREATE_BASE_ENTRY_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Global Administrator
   */
  public static final MessageDescriptor.Arg0 INFO_CREATE_GLOBAL_ADMINISTRATOR_STEP =
          new MessageDescriptor.Arg0(BASE,"INFO_CREATE_GLOBAL_ADMINISTRATOR_STEP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * images/currentstep.png
   */
  public static final MessageDescriptor.Arg0 INFO_CURRENT_STEP_ICON =
          new MessageDescriptor.Arg0(BASE,"INFO_CURRENT_STEP_ICON",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Current Step Indicator.
   */
  public static final MessageDescriptor.Arg0 INFO_CURRENT_STEP_ICON_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_CURRENT_STEP_ICON_DESCRIPTION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Current Step Indicator
   */
  public static final MessageDescriptor.Arg0 INFO_CURRENT_STEP_ICON_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_CURRENT_STEP_ICON_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * 255,255,255
   */
  public static final MessageDescriptor.Arg0 INFO_CURRENT_STEP_PANEL_BACKGROUND_COLOR =
          new MessageDescriptor.Arg0(BASE,"INFO_CURRENT_STEP_PANEL_BACKGROUND_COLOR",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Choose options for the LDAP data to be hosted by the server.
   */
  public static final MessageDescriptor.Arg0 INFO_DATA_OPTIONS_PANEL_INSTRUCTIONS =
          new MessageDescriptor.Arg0(BASE,"INFO_DATA_OPTIONS_PANEL_INSTRUCTIONS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Directory Data
   */
  public static final MessageDescriptor.Arg0 INFO_DATA_OPTIONS_PANEL_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_DATA_OPTIONS_PANEL_TITLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Directory Data
   */
  public static final MessageDescriptor.Arg0 INFO_DATA_OPTIONS_STEP =
          new MessageDescriptor.Arg0(BASE,"INFO_DATA_OPTIONS_STEP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Choose the Data Replication Options.
   */
  public static final MessageDescriptor.Arg0 INFO_DATA_REPLICATION_OPTIONS_PANEL_INSTRUCTIONS =
          new MessageDescriptor.Arg0(BASE,"INFO_DATA_REPLICATION_OPTIONS_PANEL_INSTRUCTIONS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Topology Options
   */
  public static final MessageDescriptor.Arg0 INFO_DATA_REPLICATION_OPTIONS_PANEL_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_DATA_REPLICATION_OPTIONS_PANEL_TITLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Topology Options
   */
  public static final MessageDescriptor.Arg0 INFO_DATA_REPLICATION_STEP =
          new MessageDescriptor.Arg0(BASE,"INFO_DATA_REPLICATION_STEP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * 236,236,236
   */
  public static final MessageDescriptor.Arg0 INFO_DEFAULT_BACKGROUND_COLOR =
          new MessageDescriptor.Arg0(BASE,"INFO_DEFAULT_BACKGROUND_COLOR",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Use Default
   */
  public static final MessageDescriptor.Arg0 INFO_DEFAULT_JAVA_ARGUMENTS =
          new MessageDescriptor.Arg0(BASE,"INFO_DEFAULT_JAVA_ARGUMENTS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * 000,000,000
   */
  public static final MessageDescriptor.Arg0 INFO_DEFAULT_LABEL_COLOR =
          new MessageDescriptor.Arg0(BASE,"INFO_DEFAULT_LABEL_COLOR",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Details:
   */
  public static final MessageDescriptor.Arg0 INFO_DETAILS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_DETAILS_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Directory Data:
   */
  public static final MessageDescriptor.Arg0 INFO_DIRECTORY_DATA_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_DIRECTORY_DATA_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The directory %s is not empty.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DIRECTORY_EXISTS_NOT_EMPTY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DIRECTORY_EXISTS_NOT_EMPTY",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The provided Root User DN is used for the configuration of the Directory Server.
   */
  public static final MessageDescriptor.Arg0 INFO_DIRECTORY_MANAGER_DN_IS_CONFIG_DN =
          new MessageDescriptor.Arg0(BASE,"INFO_DIRECTORY_MANAGER_DN_IS_CONFIG_DN",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * You do not have write access on the directory %s. You must have file right access on the Installation directory.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DIRECTORY_NOT_WRITABLE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DIRECTORY_NOT_WRITABLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * 000000
   */
  public static final MessageDescriptor.Arg0 INFO_DIV_OPEN_ERROR_BACKGROUND_1_COLOR =
          new MessageDescriptor.Arg0(BASE,"INFO_DIV_OPEN_ERROR_BACKGROUND_1_COLOR",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * FFFFCC
   */
  public static final MessageDescriptor.Arg0 INFO_DIV_OPEN_ERROR_BACKGROUND_2_COLOR =
          new MessageDescriptor.Arg0(BASE,"INFO_DIV_OPEN_ERROR_BACKGROUND_2_COLOR",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * E1E1A7
   */
  public static final MessageDescriptor.Arg0 INFO_DIV_OPEN_ERROR_BACKGROUND_3_COLOR =
          new MessageDescriptor.Arg0(BASE,"INFO_DIV_OPEN_ERROR_BACKGROUND_3_COLOR",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * 000000
   */
  public static final MessageDescriptor.Arg0 INFO_DIV_OPEN_SUCCESSFUL_BACKGROUND_1_COLOR =
          new MessageDescriptor.Arg0(BASE,"INFO_DIV_OPEN_SUCCESSFUL_BACKGROUND_1_COLOR",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * FFFFCC
   */
  public static final MessageDescriptor.Arg0 INFO_DIV_OPEN_SUCCESSFUL_BACKGROUND_2_COLOR =
          new MessageDescriptor.Arg0(BASE,"INFO_DIV_OPEN_SUCCESSFUL_BACKGROUND_2_COLOR",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * E1E1A7
   */
  public static final MessageDescriptor.Arg0 INFO_DIV_OPEN_SUCCESSFUL_BACKGROUND_3_COLOR =
          new MessageDescriptor.Arg0(BASE,"INFO_DIV_OPEN_SUCCESSFUL_BACKGROUND_3_COLOR",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Downloading...
   */
  public static final MessageDescriptor.Arg0 INFO_DOWNLOADING =
          new MessageDescriptor.Arg0(BASE,"INFO_DOWNLOADING",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * An error occurred downloading remote file(s) %s.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DOWNLOADING_ERROR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DOWNLOADING_ERROR",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * An error occurred.  Could not find service '%s'.   Setup using JNLP is not supported with your JDK installation.  Download a ZIP installation, un-zip it and run script %s to install the server.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_DOWNLOADING_ERROR_NO_SERVICE_FOUND =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_DOWNLOADING_ERROR_NO_SERVICE_FOUND",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Downloading: %s%% Completed.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DOWNLOADING_RATIO =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DOWNLOADING_RATIO",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Before launching the command-lines described below, edit the file '%s' and add the following line:%n%s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_EDIT_JAVA_PROPERTIES_LINE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_EDIT_JAVA_PROPERTIES_LINE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Before launching the command-lines described below, edit the file '%s' and add the following lines:%n%s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_EDIT_JAVA_PROPERTIES_LINES =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_EDIT_JAVA_PROPERTIES_LINES",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * You must provide a Global Administrative User Password.
   */
  public static final MessageDescriptor.Arg0 INFO_EMPTY_ADMINISTRATOR_PWD =
          new MessageDescriptor.Arg0(BASE,"INFO_EMPTY_ADMINISTRATOR_PWD",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * You must provide a Global Administrative User ID.
   */
  public static final MessageDescriptor.Arg0 INFO_EMPTY_ADMINISTRATOR_UID =
          new MessageDescriptor.Arg0(BASE,"INFO_EMPTY_ADMINISTRATOR_UID",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * You must provide a Directory Base DN.
   */
  public static final MessageDescriptor.Arg0 INFO_EMPTY_BASE_DN =
          new MessageDescriptor.Arg0(BASE,"INFO_EMPTY_BASE_DN",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * You must provide an Root User DN.
   */
  public static final MessageDescriptor.Arg0 INFO_EMPTY_DIRECTORY_MANAGER_DN =
          new MessageDescriptor.Arg0(BASE,"INFO_EMPTY_DIRECTORY_MANAGER_DN",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * You must provide the name of the host.
   */
  public static final MessageDescriptor.Arg0 INFO_EMPTY_HOST_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_EMPTY_HOST_NAME",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * You must provide the password of the Root User.
   */
  public static final MessageDescriptor.Arg0 INFO_EMPTY_PWD =
          new MessageDescriptor.Arg0(BASE,"INFO_EMPTY_PWD",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * You must provide a value for the Administrative User.
   */
  public static final MessageDescriptor.Arg0 INFO_EMPTY_REMOTE_DN =
          new MessageDescriptor.Arg0(BASE,"INFO_EMPTY_REMOTE_DN",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * You must provide the fully qualified name of the host.
   */
  public static final MessageDescriptor.Arg0 INFO_EMPTY_REMOTE_HOST =
          new MessageDescriptor.Arg0(BASE,"INFO_EMPTY_REMOTE_HOST",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * You must provide an Admin User password.
   */
  public static final MessageDescriptor.Arg0 INFO_EMPTY_REMOTE_PWD =
          new MessageDescriptor.Arg0(BASE,"INFO_EMPTY_REMOTE_PWD",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Invalid Directory Selected.  You must provide a valid server root installation directory.
   */
  public static final MessageDescriptor.Arg0 INFO_EMPTY_SERVER_LOCATION =
          new MessageDescriptor.Arg0(BASE,"INFO_EMPTY_SERVER_LOCATION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Enable SSL on LDAP Port %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ENABLE_SSL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ENABLE_SSL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Enable SSL on Port:
   */
  public static final MessageDescriptor.Arg0 INFO_ENABLE_SSL_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_ENABLE_SSL_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Enables SSL on the specified port.
   */
  public static final MessageDescriptor.Arg0 INFO_ENABLE_SSL_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_ENABLE_SSL_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Enable StartTLS
   */
  public static final MessageDescriptor.Arg0 INFO_ENABLE_STARTTLS =
          new MessageDescriptor.Arg0(BASE,"INFO_ENABLE_STARTTLS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Enable StartTLS for LDAP
   */
  public static final MessageDescriptor.Arg0 INFO_ENABLE_STARTTLS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_ENABLE_STARTTLS_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Allows encrypted communication over the standard LDAP port.
   */
  public static final MessageDescriptor.Arg0 INFO_ENABLE_STARTTLS_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_ENABLE_STARTTLS_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Run the server as a Windows Service
   */
  public static final MessageDescriptor.Arg0 INFO_ENABLE_WINDOWS_SERVICE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_ENABLE_WINDOWS_SERVICE_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Check this check box if you want the server to run as a Windows Service.
   */
  public static final MessageDescriptor.Arg0 INFO_ENABLE_WINDOWS_SERVICE_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_ENABLE_WINDOWS_SERVICE_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * You must specify different ports for LDAP and LDAPS communication.
   */
  public static final MessageDescriptor.Arg0 INFO_EQUAL_PORTS =
          new MessageDescriptor.Arg0(BASE,"INFO_EQUAL_PORTS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Could not access the JCEKS key store.  Check that the running Java installation supports JCEKS, that the contents of the file correspond to a valid JCEKS key store, that you have access rights to it and that the provided PIN is valid.
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_ACCESSING_JCEKS_KEYSTORE =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_ACCESSING_JCEKS_KEYSTORE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Could not access the JKS key store.  Check that the contents of the file correspond to a valid JKS key store, that you have access rights to it and that the provided PIN is valid.
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_ACCESSING_JKS_KEYSTORE =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_ACCESSING_JKS_KEYSTORE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Could not access the PKCS#11 key store. Check that is installed and that the provided PIN is valid.
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_ACCESSING_PKCS11_KEYSTORE =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_ACCESSING_PKCS11_KEYSTORE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Could not access the PKCS#12 key store. Check that the contents of the file correspond to a valid PKCS#12 key store, that you have access rights to it and that the provided PIN is valid.
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_ACCESSING_PKCS12_KEYSTORE =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_ACCESSING_PKCS12_KEYSTORE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error applying configuration customizations to server.
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_APPLYING_CUSTOM_CONFIG =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_APPLYING_CUSTOM_CONFIG",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error applying schema customizations to server.
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_APPLYING_CUSTOM_SCHEMA =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_APPLYING_CUSTOM_SCHEMA",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error processing add operation of %s: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_ERROR_APPLY_LDIF_ADD =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_ERROR_APPLY_LDIF_ADD",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error processing delete operation of %s: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_ERROR_APPLY_LDIF_DELETE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_ERROR_APPLY_LDIF_DELETE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error processing modification operation of %s: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_ERROR_APPLY_LDIF_MODIFY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_ERROR_APPLY_LDIF_MODIFY",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Artificial error.
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_ARTIFICIAL =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_ARTIFICIAL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error backing up databases.
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_BACKUP_DB =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_BACKUP_DB",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The backup tool returned error code %s.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ERROR_BACKUP_DB_TOOL_RETURN_CODE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ERROR_BACKUP_DB_TOOL_RETURN_CODE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error backing up files.
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_BACKUP_FILESYSTEM =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_BACKUP_FILESYSTEM",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Directory %s does not contain a staged installation of the server as was expected.  Verify that the new installation package (.zip) is a server installation file and that you have write access permission for this directory.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ERROR_BAD_STAGE_DIRECTORY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ERROR_BAD_STAGE_DIRECTORY",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Close this window
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_BROWSER_CLOSE_BUTTON_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_BROWSER_CLOSE_BUTTON_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Copy URL
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_BROWSER_COPY_BUTTON_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_BROWSER_COPY_BUTTON_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Copies the URL to the system clipboard
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_BROWSER_COPY_BUTTON_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_BROWSER_COPY_BUTTON_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Could not launch the web browser.<br>You can copy and paste the following URL manually into your web browser:<br><span style="font-style:italic">%s</span>
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ERROR_BROWSER_DISPLAY_MSG =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ERROR_BROWSER_DISPLAY_MSG",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_BROWSER_DISPLAY_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_BROWSER_DISPLAY_TITLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error Configuring Directory Server.
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_CONFIGURING =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_CONFIGURING",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error Configuring Certificates.
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_CONFIGURING_CERTIFICATE =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_CONFIGURING_CERTIFICATE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * An unexpected error occurred configuring server %s.%nThe error is: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_ERROR_CONFIGURING_REMOTE_GENERIC =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_ERROR_CONFIGURING_REMOTE_GENERIC",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The connection with the server timed out.
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_CONNECTING_TIMEOUT =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_CONNECTING_TIMEOUT",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * An error occurred connecting to the server.
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_CONNECTING_TO_LOCAL =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_CONNECTING_TO_LOCAL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * An unexpected error occurred extracting file %s.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ERROR_COPYING =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ERROR_COPYING",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error copying file %s to %s.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_ERROR_COPYING_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_ERROR_COPYING_FILE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Could not create parent directory %s. Check that you have file system access rights.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ERROR_COULD_NOT_CREATE_PARENT_DIR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ERROR_COULD_NOT_CREATE_PARENT_DIR",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error Creating Base Entry.
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_CREATING_BASE_ENTRY =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_CREATING_BASE_ENTRY",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error determining the server build information.
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_CREATING_BUILD_INFO =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_CREATING_BUILD_INFO",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error determining the server build information.  Details: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ERROR_CREATING_BUILD_INFO_MSG =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ERROR_CREATING_BUILD_INFO_MSG",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error updating scripts with java properties.  Error code: %d
   */
  public static final MessageDescriptor.Arg1<Number> ERR_ERROR_CREATING_JAVA_HOME_SCRIPTS =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_ERROR_CREATING_JAVA_HOME_SCRIPTS",QUICKSETUP,MILD_ERROR,-1, getClassLoader());

  /**
   * An error occurred creating the temporary file.
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_CREATING_TEMP_FILE =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_CREATING_TEMP_FILE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error deleting directory %s.  Check that you have the rights to delete this directory and that there is no other application using it.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ERROR_DELETING_DIRECTORY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ERROR_DELETING_DIRECTORY",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error deleting file %s.  Check that you have the rights to delete this file and that there is no other application using it.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ERROR_DELETING_FILE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ERROR_DELETING_FILE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error deleting stage directory %s.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ERROR_DELETING_STAGE_DIRECTORY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ERROR_DELETING_STAGE_DIRECTORY",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error determining current build information.
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_DETERMINING_CURRENT_BUILD =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_DETERMINING_CURRENT_BUILD",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error determining configuration customizations.
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_DETERMINING_CUSTOM_CONFIG =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_DETERMINING_CUSTOM_CONFIG",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error determining schema customizations.
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_DETERMINING_CUSTOM_SCHEMA =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_DETERMINING_CUSTOM_SCHEMA",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error determining upgrade build information.
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_DETERMINING_REVERSION_BUILD =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_DETERMINING_REVERSION_BUILD",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Failed to determine the server's state.
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_DETERMINING_SERVER_STATE =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_DETERMINING_SERVER_STATE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error determining installation's Subversion revision number.
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_DETERMINING_SVN_REV =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_DETERMINING_SVN_REV",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error determining upgrade build information.
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_DETERMINING_UPGRADE_BUILD =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_DETERMINING_UPGRADE_BUILD",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error Disabling Windows service.  Try to kill the process opends_service.exe and then running the %sbatwindows-service.bat -d command-line to disable the service manually.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ERROR_DISABLING_WINDOWS_SERVICE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ERROR_DISABLING_WINDOWS_SERVICE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error during the initialization with contents from server %s.  Last log details: %s.  Task state: %s.  Check the error logs of %s for more information.
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> INFO_ERROR_DURING_INITIALIZATION_LOG =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"INFO_ERROR_DURING_INITIALIZATION_LOG",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error during the initialization with contents from server %s.  Task state: %s.  Check the error logs of %s for more information.
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> INFO_ERROR_DURING_INITIALIZATION_NO_LOG =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"INFO_ERROR_DURING_INITIALIZATION_NO_LOG",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The provided PIN of the keystore is empty.
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_EMPTY_KEYSTORE_PASSWORD =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_EMPTY_KEYSTORE_PASSWORD",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * ERROR:  The response value may not be an empty string
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_EMPTY_RESPONSE =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_EMPTY_RESPONSE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error Enabling Windows service.
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_ENABLING_WINDOWS_SERVICE =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_ENABLING_WINDOWS_SERVICE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Failed to move file %s to %s.  Make sure this file is not currently locked by another application.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_ERROR_FAILED_MOVING_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_ERROR_FAILED_MOVING_FILE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Failed to create staging directory %s.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ERROR_FAILED_TO_CREATE_STAGE_DIRECTORY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ERROR_FAILED_TO_CREATE_STAGE_DIRECTORY",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * images/error_small.gif
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_ICON =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_ICON",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error.
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_ICON_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_ICON_DESCRIPTION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_ICON_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_ICON_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error Importing LDIF File.
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_IMPORTING_LDIF =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_IMPORTING_LDIF",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error Importing Automatically-Generated Data when invoked with arguments %s:  %s.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_ERROR_IMPORT_AUTOMATICALLY_GENERATED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_ERROR_IMPORT_AUTOMATICALLY_GENERATED",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The import LDIF tool returned error code %s.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ERROR_IMPORT_LDIF_TOOL_RETURN_CODE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ERROR_IMPORT_LDIF_TOOL_RETURN_CODE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error initializing log.
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_INITIALIZING_LOG =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_INITIALIZING_LOG",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error initializing upgrade.
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_INITIALIZING_UPGRADE =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_INITIALIZING_UPGRADE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Directory %s is either empty or you lack permissions to access its contents.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ERROR_INSTALL_ROOT_DIR_EMPTY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ERROR_INSTALL_ROOT_DIR_EMPTY",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * File %s is not a server installation root.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ERROR_INSTALL_ROOT_DIR_NOT_DIR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ERROR_INSTALL_ROOT_DIR_NOT_DIR",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Directory %s does not contain directory %s.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_ERROR_INSTALL_ROOT_DIR_NO_DIR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_ERROR_INSTALL_ROOT_DIR_NO_DIR",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Directory %s does not exist.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ERROR_INSTALL_ROOT_DIR_NO_EXIST =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ERROR_INSTALL_ROOT_DIR_NO_EXIST",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The root directory is null.
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_INSTALL_ROOT_DIR_NULL =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_INSTALL_ROOT_DIR_NULL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Invalid port value %s.  A port number must be an integer between 1 and 65535.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ERROR_INVALID_PORT_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ERROR_INVALID_PORT_VALUE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Invalid Directory Selected: %s%nEither the selected directory is not a valid server root installation%ndirectory or you do not have access permissions for this directory.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ERROR_INVALID_SERVER_LOCATION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ERROR_INVALID_SERVER_LOCATION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * images/error_large.gif
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_LARGE_ICON =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_LARGE_ICON",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error launching initialization with contents from server %s.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ERROR_LAUNCHING_INITIALIZATION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ERROR_LAUNCHING_INITIALIZATION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The LDIF diff tool returned error code %s.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ERROR_LDIF_DIFF_TOOL_RETURN_CODE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ERROR_LDIF_DIFF_TOOL_RETURN_CODE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error writting operation details to log.
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_LOGGING_OPERATION =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_LOGGING_OPERATION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * You must provide the PIN of the keystore to retrieve the certificate to be used by the server.
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_NO_KEYSTORE_PASSWORD =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_NO_KEYSTORE_PASSWORD",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Additional options are required when invoking this command in non-prompting mode.  See the usage statement.
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_OPTIONS_REQUIRED_OR_INTERACTIVE =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_OPTIONS_REQUIRED_OR_INTERACTIVE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Option %s is required.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ERROR_OPTION_REQUIRED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ERROR_OPTION_REQUIRED",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Option %s is required when invoking this command in non-prompting mode.  See the usage statement.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ERROR_OPTION_REQUIRED_OR_INTERACTIVE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ERROR_OPTION_REQUIRED_OR_INTERACTIVE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error parsing options.
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_PARSING_OPTIONS =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_PARSING_OPTIONS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error reading the progress of the initialization with contents from server %s.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ERROR_POOLING_INITIALIZATION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ERROR_POOLING_INITIALIZATION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The server can not be started as another application is using port %s.  Check that you have access to this port before restarting the server.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ERROR_PORT_IN_USE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ERROR_PORT_IN_USE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The value of property %s could not be determined.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ERROR_PROP_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ERROR_PROP_VALUE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error reading data from server.  There is an error with the certificate presented by the server.
   * Details: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ERROR_READING_CONFIG_LDAP_CERTIFICATE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ERROR_READING_CONFIG_LDAP_CERTIFICATE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error reading data from server %s.  There is an error with the certificate presented by the server.
   * Details: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_ERROR_READING_CONFIG_LDAP_CERTIFICATE_SERVER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_ERROR_READING_CONFIG_LDAP_CERTIFICATE_SERVER",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error Reading error output.
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_READING_ERROROUTPUT =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_READING_ERROROUTPUT",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error Reading output.
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_READING_OUTPUT =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_READING_OUTPUT",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The following errors were encountered reading the configuration of the existing servers:%n%s%n%nDo you want to continue?
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ERROR_READING_REGISTERED_SERVERS_CONFIRM =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ERROR_READING_REGISTERED_SERVERS_CONFIRM",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error reading configuration. Details:%n%s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ERROR_READING_SERVER_CONFIGURATION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ERROR_READING_SERVER_CONFIGURATION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * An unexpected error occurred while loading classes.
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_REFLECTION =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_REFLECTION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error renaming file %s to %s.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_ERROR_RENAMING_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_ERROR_RENAMING_FILE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The following could not be restored after the failed upgrade attempt.  You should restore this file/directory manually: %s to %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_ERROR_RESTORING_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_ERROR_RESTORING_FILE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Server health check failed.
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_SERVER_HEALTH_CHECK_FAILURE =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_SERVER_HEALTH_CHECK_FAILURE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error determining the server's status.
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_SERVER_STATUS =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_SERVER_STATUS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error Starting Directory Server.
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_STARTING_SERVER =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_STARTING_SERVER",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error Starting Directory Server.  Error code: %s.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ERROR_STARTING_SERVER_CODE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ERROR_STARTING_SERVER_CODE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Could not connect to the server after after requesting start.  Verify that the server has access rights to port %s.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ERROR_STARTING_SERVER_IN_UNIX =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ERROR_STARTING_SERVER_IN_UNIX",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Could not connect to the server after requesting start.  If you have a firewall configured check that it allows connections to port %s.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ERROR_STARTING_SERVER_IN_WINDOWS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ERROR_STARTING_SERVER_IN_WINDOWS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error Starting Server with no connection handlers: %s.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ERROR_STARTING_SERVER_WITH_NO_CONNECTION_HANDLERS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ERROR_STARTING_SERVER_WITH_NO_CONNECTION_HANDLERS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error Stopping Directory Server.
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_STOPPING_SERVER =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_STOPPING_SERVER",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error Stopping Directory Server.  Error code: %s.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ERROR_STOPPING_SERVER_CODE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ERROR_STOPPING_SERVER_CODE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_TITLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The upgraded server starts with errors: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ERROR_UPGRADED_SERVER_STARTS_WITH_ERRORS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ERROR_UPGRADED_SERVER_STARTS_WITH_ERRORS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Migration Error
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_UPGRADE_MIGRATION =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_UPGRADE_MIGRATION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * An attempt to add entry <b>%s</b> to the newly upgraded server was unsuccessful.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ERROR_UPGRADE_MIGRATION_ADD =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ERROR_UPGRADE_MIGRATION_ADD",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * An attempt to add entry %s to the newly upgraded server was unsuccessful.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ERROR_UPGRADE_MIGRATION_ADD_CLI =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ERROR_UPGRADE_MIGRATION_ADD_CLI",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Configuration Migration Error
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_UPGRADE_MIGRATION_CONFIG =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_UPGRADE_MIGRATION_CONFIG",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * An attempt to delete entry <b>%s</b> to the newly upgraded server was unsuccessful.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ERROR_UPGRADE_MIGRATION_DELETE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ERROR_UPGRADE_MIGRATION_DELETE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * An attempt to delete entry %s to the newly upgraded server was unsuccessful.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ERROR_UPGRADE_MIGRATION_DELETE_CLI =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ERROR_UPGRADE_MIGRATION_DELETE_CLI",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * An attempt to modify entry <b>%s</b> to the newly upgraded server was unsuccessful.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ERROR_UPGRADE_MIGRATION_MODIFY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ERROR_UPGRADE_MIGRATION_MODIFY",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * An attempt to modify entry %s to the newly upgraded server was unsuccessful.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ERROR_UPGRADE_MIGRATION_MODIFY_CLI =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ERROR_UPGRADE_MIGRATION_MODIFY_CLI",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * You can cancel this upgrade altogether, continue anyway or retry this operation.  If you cancel the server will be restored to the state it was in before the upgrade was attempted.  If you continue you should be aware that the server may not be configured as it was before this upgrade.  A copy of the original installation files will be kept in <i>%s</i>.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ERROR_UPGRADE_MIGRATION_NOTE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ERROR_UPGRADE_MIGRATION_NOTE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * You can cancel this upgrade altogether, continue anyway or retry this operation.  If you cancel the server will be restored to the state it was in before the upgrade was attempted.  If you continue you should be aware that the server may not configured as it was before this upgrade.  A copy of the original installation files will be kept in %s.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ERROR_UPGRADE_MIGRATION_NOTE_CLI =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ERROR_UPGRADE_MIGRATION_NOTE_CLI",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Schema Migration Error
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_UPGRADE_MIGRATION_SCHEMA =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_UPGRADE_MIGRATION_SCHEMA",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * An unexpected error occurred while processing entry <b>%s</b>.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ERROR_UPGRADE_MIGRATION_UNEXPECTED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ERROR_UPGRADE_MIGRATION_UNEXPECTED",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * An unexpected error occurred while processing entry %s.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ERROR_UPGRADE_MIGRATION_UNEXPECTED_CLI =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ERROR_UPGRADE_MIGRATION_UNEXPECTED_CLI",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error upgrading components.
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_UPGRADING_COMPONENTS =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_UPGRADING_COMPONENTS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * An error occurred writing to temporary file %s.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ERROR_WRITING_TO_TEMP_FILE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ERROR_WRITING_TO_TEMP_FILE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Could not retrieve zip file %s.  The input stream is null.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ERROR_ZIPINPUTSTREAMNULL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ERROR_ZIPINPUTSTREAMNULL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * An unexpected error occurred reading the zip file %s.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ERROR_ZIP_STREAM =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ERROR_ZIP_STREAM",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Details: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_EXCEPTION_DETAILS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_EXCEPTION_DETAILS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Not enough memory to perform the operation.  Details: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_EXCEPTION_OUT_OF_MEMORY_DETAILS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_EXCEPTION_OUT_OF_MEMORY_DETAILS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Root Cause:
   */
  public static final MessageDescriptor.Arg0 INFO_EXCEPTION_ROOT_CAUSE =
          new MessageDescriptor.Arg0(BASE,"INFO_EXCEPTION_ROOT_CAUSE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * 255,000,000
   */
  public static final MessageDescriptor.Arg0 INFO_FIELD_INVALID_COLOR =
          new MessageDescriptor.Arg0(BASE,"INFO_FIELD_INVALID_COLOR",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * 000,000,000
   */
  public static final MessageDescriptor.Arg0 INFO_FIELD_VALID_COLOR =
          new MessageDescriptor.Arg0(BASE,"INFO_FIELD_VALID_COLOR",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Path %s does not exist.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_FILE_DOES_NOT_EXIST =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_FILE_DOES_NOT_EXIST",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The file %s already exists.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_FILE_EXISTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_FILE_EXISTS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Finished
   */
  public static final MessageDescriptor.Arg0 INFO_FINISHED_PANEL_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_FINISHED_PANEL_TITLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Finished
   */
  public static final MessageDescriptor.Arg0 INFO_FINISHED_STEP =
          new MessageDescriptor.Arg0(BASE,"INFO_FINISHED_STEP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Finish
   */
  public static final MessageDescriptor.Arg0 INFO_FINISH_BUTTON_INSTALL_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_FINISH_BUTTON_INSTALL_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Finish Installation and Setup
   */
  public static final MessageDescriptor.Arg0 INFO_FINISH_BUTTON_INSTALL_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_FINISH_BUTTON_INSTALL_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Finish
   */
  public static final MessageDescriptor.Arg0 INFO_FINISH_BUTTON_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_FINISH_BUTTON_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Finish Setup
   */
  public static final MessageDescriptor.Arg0 INFO_FINISH_BUTTON_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_FINISH_BUTTON_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Finish Upgrade
   */
  public static final MessageDescriptor.Arg0 INFO_FINISH_BUTTON_UPGRADE_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_FINISH_BUTTON_UPGRADE_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * %s QuickSetup
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_FRAME_INSTALL_TITLE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_FRAME_INSTALL_TITLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * %s QuickUpgrade
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_FRAME_UPGRADE_TITLE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_FRAME_UPGRADE_TITLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Action Required
   */
  public static final MessageDescriptor.Arg0 INFO_GENERAL_ACTION_REQUIRED =
          new MessageDescriptor.Arg0(BASE,"INFO_GENERAL_ACTION_REQUIRED",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Build ID
   */
  public static final MessageDescriptor.Arg0 INFO_GENERAL_BUILD_ID =
          new MessageDescriptor.Arg0(BASE,"INFO_GENERAL_BUILD_ID",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Checking Data...
   */
  public static final MessageDescriptor.Arg0 INFO_GENERAL_CHECKING_DATA =
          new MessageDescriptor.Arg0(BASE,"INFO_GENERAL_CHECKING_DATA",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Information
   */
  public static final MessageDescriptor.Arg0 INFO_GENERAL_INFO =
          new MessageDescriptor.Arg0(BASE,"INFO_GENERAL_INFO",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Loading...
   */
  public static final MessageDescriptor.Arg0 INFO_GENERAL_LOADING =
          new MessageDescriptor.Arg0(BASE,"INFO_GENERAL_LOADING",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * None
   */
  public static final MessageDescriptor.Arg0 INFO_GENERAL_NONE =
          new MessageDescriptor.Arg0(BASE,"INFO_GENERAL_NONE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * If you want to report this error, provide the contents of file %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_GENERAL_PROVIDE_LOG_IN_ERROR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_GENERAL_PROVIDE_LOG_IN_ERROR",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * See %s for a detailed log of this operation.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_GENERAL_SEE_FOR_DETAILS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_GENERAL_SEE_FOR_DETAILS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * See %s for a detailed installation history.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_GENERAL_SEE_FOR_HISTORY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_GENERAL_SEE_FOR_HISTORY",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * started
   */
  public static final MessageDescriptor.Arg0 INFO_GENERAL_SERVER_STARTED =
          new MessageDescriptor.Arg0(BASE,"INFO_GENERAL_SERVER_STARTED",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * stopped
   */
  public static final MessageDescriptor.Arg0 INFO_GENERAL_SERVER_STOPPED =
          new MessageDescriptor.Arg0(BASE,"INFO_GENERAL_SERVER_STOPPED",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Unknown
   */
  public static final MessageDescriptor.Arg0 INFO_GENERAL_UNKNOWN =
          new MessageDescriptor.Arg0(BASE,"INFO_GENERAL_UNKNOWN",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Unset
   */
  public static final MessageDescriptor.Arg0 INFO_GENERAL_UNSET =
          new MessageDescriptor.Arg0(BASE,"INFO_GENERAL_UNSET",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Unspecified
   */
  public static final MessageDescriptor.Arg0 INFO_GENERAL_UNSPECIFIED =
          new MessageDescriptor.Arg0(BASE,"INFO_GENERAL_UNSPECIFIED",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Unsupported
   */
  public static final MessageDescriptor.Arg0 INFO_GENERAL_UNSUPPORTED =
          new MessageDescriptor.Arg0(BASE,"INFO_GENERAL_UNSUPPORTED",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Warning
   */
  public static final MessageDescriptor.Arg0 INFO_GENERAL_WARNING =
          new MessageDescriptor.Arg0(BASE,"INFO_GENERAL_WARNING",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Could not use the arguments '%s' using the running Java virtual machine.   Check that the Java virtual machine supports this argument.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_GENERIC_JAVA_ARGUMENT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_GENERIC_JAVA_ARGUMENT",QUICKSETUP,MILD_ERROR,-1, getClassLoader());

  /**
   * The Administrator that can manage all the server instances.
   */
  public static final MessageDescriptor.Arg0 INFO_GLOBAL_ADMINISTRATOR_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_GLOBAL_ADMINISTRATOR_DESCRIPTION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Provide the informaton to create a Global Administrator that will able to manage your whole replication topology.
   */
  public static final MessageDescriptor.Arg0 INFO_GLOBAL_ADMINISTRATOR_PANEL_INSTRUCTIONS =
          new MessageDescriptor.Arg0(BASE,"INFO_GLOBAL_ADMINISTRATOR_PANEL_INSTRUCTIONS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Create Global Administrator
   */
  public static final MessageDescriptor.Arg0 INFO_GLOBAL_ADMINISTRATOR_PANEL_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_GLOBAL_ADMINISTRATOR_PANEL_TITLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Global Administrator Password (confirm):
   */
  public static final MessageDescriptor.Arg0 INFO_GLOBAL_ADMINISTRATOR_PWD_CONFIRM_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_GLOBAL_ADMINISTRATOR_PWD_CONFIRM_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Confirm the password of the Global Administrator.
   */
  public static final MessageDescriptor.Arg0 INFO_GLOBAL_ADMINISTRATOR_PWD_CONFIRM_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_GLOBAL_ADMINISTRATOR_PWD_CONFIRM_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Global Administrator Password:
   */
  public static final MessageDescriptor.Arg0 INFO_GLOBAL_ADMINISTRATOR_PWD_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_GLOBAL_ADMINISTRATOR_PWD_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The Global Administrator Password.
   */
  public static final MessageDescriptor.Arg0 INFO_GLOBAL_ADMINISTRATOR_PWD_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_GLOBAL_ADMINISTRATOR_PWD_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Global Administrator ID:
   */
  public static final MessageDescriptor.Arg0 INFO_GLOBAL_ADMINISTRATOR_UID_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_GLOBAL_ADMINISTRATOR_UID_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The Global Administrator ID.
   */
  public static final MessageDescriptor.Arg0 INFO_GLOBAL_ADMINISTRATOR_UID_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_GLOBAL_ADMINISTRATOR_UID_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * images/help_small.gif
   */
  public static final MessageDescriptor.Arg0 INFO_HELP_SMALL_ICON =
          new MessageDescriptor.Arg0(BASE,"INFO_HELP_SMALL_ICON",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Help icon.
   */
  public static final MessageDescriptor.Arg0 INFO_HELP_SMALL_ICON_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_HELP_SMALL_ICON_DESCRIPTION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Busy, please wait.
   */
  public static final MessageDescriptor.Arg0 INFO_HELP_WAIT_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_HELP_WAIT_DESCRIPTION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Hide Details
   */
  public static final MessageDescriptor.Arg0 INFO_HIDE_DETAILS_BUTTON_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_HIDE_DETAILS_BUTTON_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Hide Details
   */
  public static final MessageDescriptor.Arg0 INFO_HIDE_EXCEPTION_DETAILS =
          new MessageDescriptor.Arg0(BASE,"INFO_HIDE_EXCEPTION_DETAILS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Host Name:
   */
  public static final MessageDescriptor.Arg0 INFO_HOST_NAME_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_HOST_NAME_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Enter the fully qualified name of the local host.
   */
  public static final MessageDescriptor.Arg0 INFO_HOST_NAME_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_HOST_NAME_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * 666666
   */
  public static final MessageDescriptor.Arg0 INFO_HTML_SEPARATOR_COLOR =
          new MessageDescriptor.Arg0(BASE,"INFO_HTML_SEPARATOR_COLOR",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Import Automatically-Generated Sample Data
   */
  public static final MessageDescriptor.Arg0 INFO_IMPORT_AUTOMATICALLY_GENERATED_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_IMPORT_AUTOMATICALLY_GENERATED_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Populate the base DN with automatically-generated LDAP data
   */
  public static final MessageDescriptor.Arg0 INFO_IMPORT_AUTOMATICALLY_GENERATED_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_IMPORT_AUTOMATICALLY_GENERATED_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Import Data from LDIF File
   */
  public static final MessageDescriptor.Arg0 INFO_IMPORT_DATA_FROM_LDIF_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_IMPORT_DATA_FROM_LDIF_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Use the contents of an LDIF file to populate the base DN with data
   */
  public static final MessageDescriptor.Arg0 INFO_IMPORT_DATA_FROM_LDIF_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_IMPORT_DATA_FROM_LDIF_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Considering the size of the provided LDIF file, the default runtime settings might not be enough to be able to manage that volume of data.  It is recommended to increase the maximum memory allowed for both the server runtime and the import.<br><br>Check the documentation for more information about how to tune the server.
   */
  public static final MessageDescriptor.Arg0 INFO_IMPORT_FILE_WARNING_UPDATE_RUNTIME_ARGS =
          new MessageDescriptor.Arg0(BASE,"INFO_IMPORT_FILE_WARNING_UPDATE_RUNTIME_ARGS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Specify the memory and java arguments that will be used when importing data to the server.
   */
  public static final MessageDescriptor.Arg0 INFO_IMPORT_JAVA_ARGUMENTS_MSG =
          new MessageDescriptor.Arg0(BASE,"INFO_IMPORT_JAVA_ARGUMENTS_MSG",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Import Runtime Settings
   */
  public static final MessageDescriptor.Arg0 INFO_IMPORT_JAVA_ARGUMENTS_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_IMPORT_JAVA_ARGUMENTS_TITLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Path:
   */
  public static final MessageDescriptor.Arg0 INFO_IMPORT_PATH_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_IMPORT_PATH_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Enter the full path of the LDIF file containing the data to be imported
   */
  public static final MessageDescriptor.Arg0 INFO_IMPORT_PATH_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_IMPORT_PATH_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Import Runtime Settings:
   */
  public static final MessageDescriptor.Arg0 INFO_IMPORT_RUNTIME_ARGS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_IMPORT_RUNTIME_ARGS_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The minimum Java version required is %s.%n%nThe detected version is %s.%nThe binary detected is %s%n%nPlease set OPENDS_JAVA_HOME to the root of a compatible Java installation or edit the java.properties file and then run the dsjavaproperties script to specify the java version to be used.
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_INCOMPATIBLE_VERSION =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_INCOMPATIBLE_VERSION",QUICKSETUP,SEVERE_ERROR,-1, getClassLoader());

  /**
   * images/info_small.gif
   */
  public static final MessageDescriptor.Arg0 INFO_INFORMATION_ICON =
          new MessageDescriptor.Arg0(BASE,"INFO_INFORMATION_ICON",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Information.
   */
  public static final MessageDescriptor.Arg0 INFO_INFORMATION_ICON_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_INFORMATION_ICON_DESCRIPTION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Information
   */
  public static final MessageDescriptor.Arg0 INFO_INFORMATION_ICON_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_INFORMATION_ICON_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * images/info_large.gif
   */
  public static final MessageDescriptor.Arg0 INFO_INFORMATION_LARGE_ICON =
          new MessageDescriptor.Arg0(BASE,"INFO_INFORMATION_LARGE_ICON",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Ignoring %s since %s exists.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_INFO_IGNORING_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_INFO_IGNORING_FILE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * %s entries processed (%s %% complete).
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_INITIALIZE_PROGRESS_WITH_PERCENTAGE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_INITIALIZE_PROGRESS_WITH_PERCENTAGE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * %s entries processed.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_INITIALIZE_PROGRESS_WITH_PROCESSED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_INITIALIZE_PROGRESS_WITH_PROCESSED",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * %s remaining to be processed.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_INITIALIZE_PROGRESS_WITH_UNPROCESSED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_INITIALIZE_PROGRESS_WITH_UNPROCESSED",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * %d MB Initial Memory
   */
  public static final MessageDescriptor.Arg1<Number> INFO_INITIAL_MEMORY =
          new MessageDescriptor.Arg1<Number>(BASE,"INFO_INITIAL_MEMORY",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Initial Memory:
   */
  public static final MessageDescriptor.Arg0 INFO_INITIAL_MEMORY_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_INITIAL_MEMORY_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Provide the initial memory in megabytes that the Java process will use.
   */
  public static final MessageDescriptor.Arg0 INFO_INITIAL_MEMORY_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_INITIAL_MEMORY_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The initial memory value must be a positive integer.
   */
  public static final MessageDescriptor.Arg0 ERR_INITIAL_MEMORY_VALUE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_INITIAL_MEMORY_VALUE",QUICKSETUP,MILD_ERROR,-1, getClassLoader());

  /**
   * Could not use the provided initial memory value.  Check that the running Java virtual machine supports to specify the %s argument and that there is enough memory in the machine to use the provided value.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_INITIAL_MEMORY_VALUE_EXTENDED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_INITIAL_MEMORY_VALUE_EXTENDED",QUICKSETUP,MILD_ERROR,-1, getClassLoader());

  /**
   * 000,000,000
   */
  public static final MessageDescriptor.Arg0 INFO_INLINE_HELP_COLOR =
          new MessageDescriptor.Arg0(BASE,"INFO_INLINE_HELP_COLOR",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Install New Server Instance
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLANDUPGRADER_RBINSTALL_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLANDUPGRADER_RBINSTALL_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Select to install a new server instance.
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLANDUPGRADER_RBINSTALL_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLANDUPGRADER_RBINSTALL_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Upgrade Existing Server Instance
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLANDUPGRADER_RBUPGRADE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLANDUPGRADER_RBUPGRADE_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Select to upgrade an existing server instance.
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLANDUPGRADER_RBUPGRADE_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLANDUPGRADER_RBUPGRADE_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The %s QuickSetup tool can either install and configure a new server instance or upgrade an existing server instance. <br><br> %s requires a Java SE 6.0 or higher runtime.<br><br> Additional information on QuickSetup is available on the <a href="%s"> %s documentation site</a>.
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> INFO_INSTALLANDUPGRADE_WELCOME_PANEL_INSTRUCTIONS =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"INFO_INSTALLANDUPGRADE_WELCOME_PANEL_INSTRUCTIONS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Welcome
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLANDUPGRADE_WELCOME_PANEL_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLANDUPGRADE_WELCOME_PANEL_TITLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The server contains some database files.<br>If you continue with the setup the contents of these database files will be deleted.
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLSTATUS_CANOVERWRITECURRENTINSTALL_MSG =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLSTATUS_CANOVERWRITECURRENTINSTALL_MSG",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The server contains some database files.%nThe setup will delete the contents of these database files.
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLSTATUS_CANOVERWRITECURRENTINSTALL_MSG_CLI =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLSTATUS_CANOVERWRITECURRENTINSTALL_MSG_CLI",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Has already been configured
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLSTATUS_CONFIGFILEMODIFIED =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLSTATUS_CONFIGFILEMODIFIED",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Contains data
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLSTATUS_DBFILEEXIST =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLSTATUS_DBFILEEXIST",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Server Already Configured<br> The setup can only be used with servers that have not yet been configured.  The current server:%s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_INSTALLSTATUS_INSTALLED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_INSTALLSTATUS_INSTALLED",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Server Already Configured%n %s command-line can only be used with servers that have not yet been configured.  The current server:%s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_INSTALLSTATUS_INSTALLED_CLI =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_INSTALLSTATUS_INSTALLED_CLI",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The Directory Server is not installed.
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLSTATUS_NOT_INSTALLED =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLSTATUS_NOT_INSTALLED",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Is currently running on port %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_INSTALLSTATUS_SERVERRUNNING =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_INSTALLSTATUS_SERVERRUNNING",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Setup canceled.
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALL_CANCELED =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALL_CANCELED",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Equivalent non-interactive command-line to enable replication:
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALL_ENABLE_REPLICATION_EQUIVALENT_COMMAND_LINE =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALL_ENABLE_REPLICATION_EQUIVALENT_COMMAND_LINE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Equivalent non-interactive command-lines to enable replication:
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALL_ENABLE_REPLICATION_EQUIVALENT_COMMAND_LINES =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALL_ENABLE_REPLICATION_EQUIVALENT_COMMAND_LINES",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Equivalent non-interactive command-line to initialize replication:
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALL_INITIALIZE_REPLICATION_EQUIVALENT_COMMAND_LINE =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALL_INITIALIZE_REPLICATION_EQUIVALENT_COMMAND_LINE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Equivalent non-interactive command-lines to initialize replication:
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALL_INITIALIZE_REPLICATION_EQUIVALENT_COMMAND_LINES =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALL_INITIALIZE_REPLICATION_EQUIVALENT_COMMAND_LINES",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The Server will be temporarily started.
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALL_SERVER_MUST_BE_TEMPORARILY_STARTED =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALL_SERVER_MUST_BE_TEMPORARILY_STARTED",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Equivalent non-interactive command-line to setup server:
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALL_SETUP_EQUIVALENT_COMMAND_LINE =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALL_SETUP_EQUIVALENT_COMMAND_LINE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Equivalent command-line to stop the server:
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALL_STOP_SERVER_EQUIVALENT_COMMAND_LINE =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALL_STOP_SERVER_EQUIVALENT_COMMAND_LINE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * 000,000,000
   */
  public static final MessageDescriptor.Arg0 INFO_INSTRUCTIONS_COLOR =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTRUCTIONS_COLOR",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The path contains the character "%s" which is not allowed to install the server.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_INVALID_CHAR_IN_PATH =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_INVALID_CHAR_IN_PATH",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The java arguments used in the server installation in '%s' do not seem to be compatible with the Java virtual machine used to run the upgrader (%s).%n%nTo fix this problem delete the file %s and click on 'Next' again.%nOnce the upgrader finishes you will have to set again the java arguments by running the command-line %s.
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> ERR_INVALID_JAVA_ARGS =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_INVALID_JAVA_ARGS",QUICKSETUP,SEVERE_ERROR,-1, getClassLoader());

  /**
   * The number of user entries to generate automatically must be an integer between %s and %s.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_INVALID_NUMBER_ENTRIES_RANGE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_INVALID_NUMBER_ENTRIES_RANGE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The LDAP Listener Port must be an integer between %s and %s.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_INVALID_PORT_VALUE_RANGE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_INVALID_PORT_VALUE_RANGE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The provided port is not valid.
   */
  public static final MessageDescriptor.Arg0 INFO_INVALID_REMOTE_PORT =
          new MessageDescriptor.Arg0(BASE,"INFO_INVALID_REMOTE_PORT",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The Replication Port on %s must be an integer between %s and %s.
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> INFO_INVALID_REMOTE_REPLICATION_PORT_VALUE_RANGE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"INFO_INVALID_REMOTE_REPLICATION_PORT_VALUE_RANGE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The Replication Port must be an integer between %s and %s.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_INVALID_REPLICATION_PORT_VALUE_RANGE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_INVALID_REPLICATION_PORT_VALUE_RANGE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The LDAPS Listener Port must be an integer between %s and %s.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_INVALID_SECURE_PORT_VALUE_RANGE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_INVALID_SECURE_PORT_VALUE_RANGE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Close this dialog and discard the provide java arguments.
   */
  public static final MessageDescriptor.Arg0 INFO_JAVA_ARGUMENTS_CANCEL_BUTTON_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_JAVA_ARGUMENTS_CANCEL_BUTTON_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * In the Java Webstart setup, the provided Java arguments are not thoroughly tested till the server is actually configured.
   * If the provided arguments cannot be used, the default java arguments will be used to configure.
   * 
   * Do you want to continue?
   */
  public static final MessageDescriptor.Arg0 INFO_JAVA_ARGUMENTS_CANNOT_BE_CHECKED_IN_WEBSTART =
          new MessageDescriptor.Arg0(BASE,"INFO_JAVA_ARGUMENTS_CANNOT_BE_CHECKED_IN_WEBSTART",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Leave empty to use the default value of the Java virtual machine.
   */
  public static final MessageDescriptor.Arg0 INFO_JAVA_ARGUMENTS_LEAVE_EMPTY =
          new MessageDescriptor.Arg0(BASE,"INFO_JAVA_ARGUMENTS_LEAVE_EMPTY",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Close this dialog and accept the provided java arguments.
   */
  public static final MessageDescriptor.Arg0 INFO_JAVA_ARGUMENTS_OK_BUTTON_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_JAVA_ARGUMENTS_OK_BUTTON_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Click to configure the runtime options that will be used to run the import utility.
   */
  public static final MessageDescriptor.Arg0 INFO_JAVA_RUNTIME_CHANGE_IMPORT_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_JAVA_RUNTIME_CHANGE_IMPORT_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Change...
   */
  public static final MessageDescriptor.Arg0 INFO_JAVA_RUNTIME_CHANGE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_JAVA_RUNTIME_CHANGE_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Click to configure the runtime options that will be used to run the server.
   */
  public static final MessageDescriptor.Arg0 INFO_JAVA_RUNTIME_CHANGE_SERVER_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_JAVA_RUNTIME_CHANGE_SERVER_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Specify the runtime options that the Java virtual machine will use to run the server and the import tool.
   */
  public static final MessageDescriptor.Arg0 INFO_JAVA_RUNTIME_OPTIONS_PANEL_INSTRUCTIONS =
          new MessageDescriptor.Arg0(BASE,"INFO_JAVA_RUNTIME_OPTIONS_PANEL_INSTRUCTIONS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Runtime Options
   */
  public static final MessageDescriptor.Arg0 INFO_JAVA_RUNTIME_OPTIONS_PANEL_STEP =
          new MessageDescriptor.Arg0(BASE,"INFO_JAVA_RUNTIME_OPTIONS_PANEL_STEP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Runtime Options
   */
  public static final MessageDescriptor.Arg0 INFO_JAVA_RUNTIME_OPTIONS_PANEL_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_JAVA_RUNTIME_OPTIONS_PANEL_TITLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Java Runtime Settings
   */
  public static final MessageDescriptor.Arg0 INFO_JAVA_RUNTIME_SETTINGS_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_JAVA_RUNTIME_SETTINGS_TITLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Use existing JCEKS File
   */
  public static final MessageDescriptor.Arg0 INFO_JCEKS_CERTIFICATE =
          new MessageDescriptor.Arg0(BASE,"INFO_JCEKS_CERTIFICATE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * JCEKS File
   */
  public static final MessageDescriptor.Arg0 INFO_JCEKS_CERTIFICATE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_JCEKS_CERTIFICATE_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Select this option if you have a JCEKS certificate.
   */
  public static final MessageDescriptor.Arg0 INFO_JCEKS_CERTIFICATE_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_JCEKS_CERTIFICATE_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * No certificates for the Java Key Store could be found.  Check that the provided path is valid.
   */
  public static final MessageDescriptor.Arg0 INFO_JCEKS_KEYSTORE_DOES_NOT_EXIST =
          new MessageDescriptor.Arg0(BASE,"INFO_JCEKS_KEYSTORE_DOES_NOT_EXIST",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Use existing Java Key Store File
   */
  public static final MessageDescriptor.Arg0 INFO_JKS_CERTIFICATE =
          new MessageDescriptor.Arg0(BASE,"INFO_JKS_CERTIFICATE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Java Key Store (JKS) File
   */
  public static final MessageDescriptor.Arg0 INFO_JKS_CERTIFICATE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_JKS_CERTIFICATE_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Select this option if you have a JKS certificate.
   */
  public static final MessageDescriptor.Arg0 INFO_JKS_CERTIFICATE_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_JKS_CERTIFICATE_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * No certificates for the Java Key Store could be found.  Check that the provided path is valid.
   */
  public static final MessageDescriptor.Arg0 INFO_JKS_KEYSTORE_DOES_NOT_EXIST =
          new MessageDescriptor.Arg0(BASE,"INFO_JKS_KEYSTORE_DOES_NOT_EXIST",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The provided key store path does not exist.
   */
  public static final MessageDescriptor.Arg0 INFO_KEYSTORE_PATH_DOES_NOT_EXIST =
          new MessageDescriptor.Arg0(BASE,"INFO_KEYSTORE_PATH_DOES_NOT_EXIST",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Key Store Path:
   */
  public static final MessageDescriptor.Arg0 INFO_KEYSTORE_PATH_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_KEYSTORE_PATH_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The provided key store path is not a file.
   */
  public static final MessageDescriptor.Arg0 INFO_KEYSTORE_PATH_NOT_A_FILE =
          new MessageDescriptor.Arg0(BASE,"INFO_KEYSTORE_PATH_NOT_A_FILE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * You must provide the path of the key store.
   */
  public static final MessageDescriptor.Arg0 INFO_KEYSTORE_PATH_NOT_PROVIDED =
          new MessageDescriptor.Arg0(BASE,"INFO_KEYSTORE_PATH_NOT_PROVIDED",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Absolute path to the keystore.
   */
  public static final MessageDescriptor.Arg0 INFO_KEYSTORE_PATH_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_KEYSTORE_PATH_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * You must provide the PIN of the key store.
   */
  public static final MessageDescriptor.Arg0 INFO_KEYSTORE_PWD_EMPTY =
          new MessageDescriptor.Arg0(BASE,"INFO_KEYSTORE_PWD_EMPTY",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Key Store PIN:
   */
  public static final MessageDescriptor.Arg0 INFO_KEYSTORE_PWD_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_KEYSTORE_PWD_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Provide the PIN (password) required to access the existing key store.
   */
  public static final MessageDescriptor.Arg0 INFO_KEYSTORE_PWD_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_KEYSTORE_PWD_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Key Store Type:
   */
  public static final MessageDescriptor.Arg0 INFO_KEYSTORE_TYPE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_KEYSTORE_TYPE_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * LDAP Data Interchange Format (*.ldif)
   */
  public static final MessageDescriptor.Arg0 INFO_LDIF_FILES_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIF_FILES_DESCRIPTION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The provided LDIF file does not exist.
   */
  public static final MessageDescriptor.Arg0 INFO_LDIF_FILE_DOES_NOT_EXIST =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIF_FILE_DOES_NOT_EXIST",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Leave Database Empty
   */
  public static final MessageDescriptor.Arg0 INFO_LEAVE_DATABASE_EMPTY_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_LEAVE_DATABASE_EMPTY_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Do not create any entry for the Directory Base DN
   */
  public static final MessageDescriptor.Arg0 INFO_LEAVE_DATABASE_EMPTY_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_LEAVE_DATABASE_EMPTY_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Click to accept
   */
  public static final MessageDescriptor.Arg0 INFO_LICENSE_CLICK_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_LICENSE_CLICK_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Invalid response
   */
  public static final MessageDescriptor.Arg0 INFO_LICENSE_CLI_ACCEPT_INVALID_RESPONSE =
          new MessageDescriptor.Arg0(BASE,"INFO_LICENSE_CLI_ACCEPT_INVALID_RESPONSE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * No
   */
  public static final MessageDescriptor.Arg0 INFO_LICENSE_CLI_ACCEPT_NO =
          new MessageDescriptor.Arg0(BASE,"INFO_LICENSE_CLI_ACCEPT_NO",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Accept the license (%s/%s) [%s]:
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> INFO_LICENSE_CLI_ACCEPT_QUESTION =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"INFO_LICENSE_CLI_ACCEPT_QUESTION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Yes
   */
  public static final MessageDescriptor.Arg0 INFO_LICENSE_CLI_ACCEPT_YES =
          new MessageDescriptor.Arg0(BASE,"INFO_LICENSE_CLI_ACCEPT_YES",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Please read the License Agreement above.%nYou must accept the terms of the agreement before continuing with the installation.
   */
  public static final MessageDescriptor.Arg0 INFO_LICENSE_DETAILS_CLI_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_LICENSE_DETAILS_CLI_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * <html>Please read the following License Agreement.<br>You must accept the terms of the agreement before continuing with the installation.
   */
  public static final MessageDescriptor.Arg0 INFO_LICENSE_DETAILS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_LICENSE_DETAILS_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * License
   */
  public static final MessageDescriptor.Arg0 INFO_LICENSE_PANEL_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_LICENSE_PANEL_TITLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * bla bla
   */
  public static final MessageDescriptor.Arg0 INFO_LICENSE_PANEL_WEBSTART_INSTRUCTIONS =
          new MessageDescriptor.Arg0(BASE,"INFO_LICENSE_PANEL_WEBSTART_INSTRUCTIONS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * License
   */
  public static final MessageDescriptor.Arg0 INFO_LICENSE_STEP =
          new MessageDescriptor.Arg0(BASE,"INFO_LICENSE_STEP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * %d MB Max Memory
   */
  public static final MessageDescriptor.Arg1<Number> INFO_MAXIMUM_MEMORY =
          new MessageDescriptor.Arg1<Number>(BASE,"INFO_MAXIMUM_MEMORY",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The maximum memory value must be higher than the initial memory value.
   */
  public static final MessageDescriptor.Arg0 ERR_MAX_MEMORY_BIGGER_THAN_INITIAL_MEMORY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_MAX_MEMORY_BIGGER_THAN_INITIAL_MEMORY",QUICKSETUP,MILD_ERROR,-1, getClassLoader());

  /**
   * Maximum Memory:
   */
  public static final MessageDescriptor.Arg0 INFO_MAX_MEMORY_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_MAX_MEMORY_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Provide the maximum memory in megabytes that the Java process will be allowed to use.
   */
  public static final MessageDescriptor.Arg0 INFO_MAX_MEMORY_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_MAX_MEMORY_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The maximum memory value must be a positive integer.
   */
  public static final MessageDescriptor.Arg0 ERR_MAX_MEMORY_VALUE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_MAX_MEMORY_VALUE",QUICKSETUP,MILD_ERROR,-1, getClassLoader());

  /**
   * Could not use the provided maximum memory value.  Check that the running Java virtual machine supports to specify the %s argument and that there is enough memory in the machine to use the provided value.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MAX_MEMORY_VALUE_EXTENDED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_MAX_MEMORY_VALUE_EXTENDED",QUICKSETUP,MILD_ERROR,-1, getClassLoader());

  /**
   * Megabytes
   */
  public static final MessageDescriptor.Arg0 INFO_MEGABYTE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_MEGABYTE_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Note that 32-bit Java virtual machines do not support memory values higher than 2 gigabytes.
   */
  public static final MessageDescriptor.Arg0 ERR_MEMORY_32_BIT_LIMIT =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_MEMORY_32_BIT_LIMIT",QUICKSETUP,MILD_ERROR,-1, getClassLoader());

  /**
   * The provided memory arguments and the 'Other Java Arguments' were checked successfully separately.  However there was an error running them simultaneously.  Check that the provided arguments are compatible with the memory values.
   */
  public static final MessageDescriptor.Arg0 ERR_MEMORY_AND_OTHER_ARGUMENTS_NOT_COMPATIBLE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_MEMORY_AND_OTHER_ARGUMENTS_NOT_COMPATIBLE",QUICKSETUP,MILD_ERROR,-1, getClassLoader());

  /**
   * memorySizeInMB
   */
  public static final MessageDescriptor.Arg0 INFO_MEMORY_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_MEMORY_PLACEHOLDER",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Could not use the provided memory values.  Check that the running Java virtual machine supports to specify the %s and %s arguments and that there is enough memory in the machine to use the provided values.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MEMORY_VALUE_EXTENDED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_MEMORY_VALUE_EXTENDED",QUICKSETUP,MILD_ERROR,-1, getClassLoader());

  /**
   * images/opendsminimized.gif
   */
  public static final MessageDescriptor.Arg0 INFO_MINIMIZED_ICON =
          new MessageDescriptor.Arg0(BASE,"INFO_MINIMIZED_ICON",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * QuickSetup minimized.
   */
  public static final MessageDescriptor.Arg0 INFO_MINIMIZED_ICON_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_MINIMIZED_ICON_DESCRIPTION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * QuickSetup
   */
  public static final MessageDescriptor.Arg0 INFO_MINIMIZED_ICON_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_MINIMIZED_ICON_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * images/opendsminimizedmac.png
   */
  public static final MessageDescriptor.Arg0 INFO_MINIMIZED_MAC_ICON =
          new MessageDescriptor.Arg0(BASE,"INFO_MINIMIZED_MAC_ICON",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Network Error
   */
  public static final MessageDescriptor.Arg0 INFO_NETWORK_ERROR_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_NETWORK_ERROR_TITLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * A new version of '%s' has been made available.  After this operation you should delete this script and rename '%s' to '%1$s'.
   */
  public static final MessageDescriptor.ArgN INFO_NEW_UPGRADE_SCRIPT_AVAILABLE =
          new MessageDescriptor.ArgN(BASE,"INFO_NEW_UPGRADE_SCRIPT_AVAILABLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Next >
   */
  public static final MessageDescriptor.Arg0 INFO_NEXT_BUTTON_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_NEXT_BUTTON_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Go to Next Step
   */
  public static final MessageDescriptor.Arg0 INFO_NEXT_BUTTON_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_NEXT_BUTTON_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * <not available>
   */
  public static final MessageDescriptor.Arg0 INFO_NOT_AVAILABLE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_NOT_AVAILABLE_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The provided Directory Base DN is not a valid DN.
   */
  public static final MessageDescriptor.Arg0 INFO_NOT_A_BASE_DN =
          new MessageDescriptor.Arg0(BASE,"INFO_NOT_A_BASE_DN",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The provided Root User DN is not a valid DN.
   */
  public static final MessageDescriptor.Arg0 INFO_NOT_A_DIRECTORY_MANAGER_DN =
          new MessageDescriptor.Arg0(BASE,"INFO_NOT_A_DIRECTORY_MANAGER_DN",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The provided DN is not one of the Root User DN.
   */
  public static final MessageDescriptor.Arg0 INFO_NOT_A_DIRECTORY_MANAGER_IN_CONFIG =
          new MessageDescriptor.Arg0(BASE,"INFO_NOT_A_DIRECTORY_MANAGER_IN_CONFIG",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * There is not enough free disk space under %s.%nAt least %s megabytes of free disk space are required to install the server.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_NOT_ENOUGH_DISK_SPACE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_NOT_ENOUGH_DISK_SPACE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The passwords you have provided do not match.
   */
  public static final MessageDescriptor.Arg0 INFO_NOT_EQUAL_PWD =
          new MessageDescriptor.Arg0(BASE,"INFO_NOT_EQUAL_PWD",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * You must provide the Global Administrator ID to be able to access the configuration of all the remote servers that have been previously installed.
   */
  public static final MessageDescriptor.Arg0 INFO_NOT_GLOBAL_ADMINISTRATOR_PROVIDED =
          new MessageDescriptor.Arg0(BASE,"INFO_NOT_GLOBAL_ADMINISTRATOR_PROVIDED",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Leave empty if you do not want to create a base DN.
   */
  public static final MessageDescriptor.Arg0 INFO_NO_BASE_DN_INLINE_HELP =
          new MessageDescriptor.Arg0(BASE,"INFO_NO_BASE_DN_INLINE_HELP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * No entries found to initialize.
   */
  public static final MessageDescriptor.Arg0 INFO_NO_ENTRIES_TO_INITIALIZE =
          new MessageDescriptor.Arg0(BASE,"INFO_NO_ENTRIES_TO_INITIALIZE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * You must provide the path of the LDIF file to import.
   */
  public static final MessageDescriptor.Arg0 INFO_NO_LDIF_PATH =
          new MessageDescriptor.Arg0(BASE,"INFO_NO_LDIF_PATH",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * You must provide the number of user entries to generate automatically.
   */
  public static final MessageDescriptor.Arg0 INFO_NO_NUMBER_ENTRIES =
          new MessageDescriptor.Arg0(BASE,"INFO_NO_NUMBER_ENTRIES",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * disabled
   */
  public static final MessageDescriptor.Arg0 INFO_NO_SECURITY =
          new MessageDescriptor.Arg0(BASE,"INFO_NO_SECURITY",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * You must select at least one base DN to replicate contents with.
   */
  public static final MessageDescriptor.Arg0 INFO_NO_SUFFIXES_CHOSEN_TO_REPLICATE =
          new MessageDescriptor.Arg0(BASE,"INFO_NO_SUFFIXES_CHOSEN_TO_REPLICATE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Number of User Entries:
   */
  public static final MessageDescriptor.Arg0 INFO_NUMBER_ENTRIES_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_NUMBER_ENTRIES_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Enter the number of user entries to be generated
   */
  public static final MessageDescriptor.Arg0 INFO_NUMBER_ENTRIES_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_NUMBER_ENTRIES_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * OK
   */
  public static final MessageDescriptor.Arg0 INFO_OK_BUTTON_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_OK_BUTTON_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Choose a File
   */
  public static final MessageDescriptor.Arg0 INFO_OPEN_GENERIC_FILE_DIALOG_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_OPEN_GENERIC_FILE_DIALOG_TITLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Choose an LDIF File
   */
  public static final MessageDescriptor.Arg0 INFO_OPEN_LDIF_FILE_DIALOG_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_OPEN_LDIF_FILE_DIALOG_TITLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Choose Installation Path
   */
  public static final MessageDescriptor.Arg0 INFO_OPEN_SERVER_LOCATION_DIALOG_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_OPEN_SERVER_LOCATION_DIALOG_TITLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Choose a Server Installation Package (.zip)
   */
  public static final MessageDescriptor.Arg0 INFO_OPEN_ZIP_FILE_DIALOG_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_OPEN_ZIP_FILE_DIALOG_TITLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * 255,255,255
   */
  public static final MessageDescriptor.Arg0 INFO_OPTIONPANE_BACKGROUND_COLOR =
          new MessageDescriptor.Arg0(BASE,"INFO_OPTIONPANE_BACKGROUND_COLOR",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Have you performed the tasks described?
   */
  public static final MessageDescriptor.Arg0 INFO_ORACLE_ACTION_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_ORACLE_ACTION_PROMPT",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * No, Cancel
   */
  public static final MessageDescriptor.Arg0 INFO_ORACLE_ACTION_PROMPT_CANCEL =
          new MessageDescriptor.Arg0(BASE,"INFO_ORACLE_ACTION_PROMPT_CANCEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Yes, Continue
   */
  public static final MessageDescriptor.Arg0 INFO_ORACLE_ACTION_PROMPT_CONTINUE =
          new MessageDescriptor.Arg0(BASE,"INFO_ORACLE_ACTION_PROMPT_CONTINUE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * This operation requires that you perform specific tasks described in the details section before continuing.
   */
  public static final MessageDescriptor.Arg0 INFO_ORACLE_DESC_ACTION =
          new MessageDescriptor.Arg0(BASE,"INFO_ORACLE_DESC_ACTION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Before starting the operation you should export the entire data set for this server to LDIF format.  <b>If you have not completed this step you should cancel this operation now</b>.
   */
  public static final MessageDescriptor.Arg0 INFO_ORACLE_EI_ACTION_STEP1 =
          new MessageDescriptor.Arg0(BASE,"INFO_ORACLE_EI_ACTION_STEP1",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Before starting the operation you should export the entire data set for this server to LDIF format.  If you have not completed this step you should cancel this operation now.
   */
  public static final MessageDescriptor.Arg0 INFO_ORACLE_EI_ACTION_STEP1_CLI =
          new MessageDescriptor.Arg0(BASE,"INFO_ORACLE_EI_ACTION_STEP1_CLI",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Continue with this operation until this tool has finished.
   */
  public static final MessageDescriptor.Arg0 INFO_ORACLE_EI_ACTION_STEP2 =
          new MessageDescriptor.Arg0(BASE,"INFO_ORACLE_EI_ACTION_STEP2",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * When this operation is complete, manually delete the files in the 'db' directory.
   */
  public static final MessageDescriptor.Arg0 INFO_ORACLE_EI_ACTION_STEP3 =
          new MessageDescriptor.Arg0(BASE,"INFO_ORACLE_EI_ACTION_STEP3",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Reimport that data from the LDIF file that you had created in the first step.
   */
  public static final MessageDescriptor.Arg0 INFO_ORACLE_EI_ACTION_STEP4 =
          new MessageDescriptor.Arg0(BASE,"INFO_ORACLE_EI_ACTION_STEP4",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Would you like to continue with this operation?
   */
  public static final MessageDescriptor.Arg0 INFO_ORACLE_INFO_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_ORACLE_INFO_PROMPT",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * This operation includes specific instructions and/or questions that you must follow.  Silent mode is not supported for this version.
   */
  public static final MessageDescriptor.Arg0 INFO_ORACLE_NO_SILENT =
          new MessageDescriptor.Arg0(BASE,"INFO_ORACLE_NO_SILENT",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Other Java Arguments:
   */
  public static final MessageDescriptor.Arg0 INFO_OTHER_JAVA_ARGUMENTS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_OTHER_JAVA_ARGUMENTS_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Provide other java arguments that will be used by the Java process.
   */
  public static final MessageDescriptor.Arg0 INFO_OTHER_JAVA_ARGUMENTS_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_OTHER_JAVA_ARGUMENTS_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * 255,255,255
   */
  public static final MessageDescriptor.Arg0 INFO_PANEL_BACKGROUND_COLOR =
          new MessageDescriptor.Arg0(BASE,"INFO_PANEL_BACKGROUND_COLOR",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * 204,204,204
   */
  public static final MessageDescriptor.Arg0 INFO_PANEL_BORDER_COLOR =
          new MessageDescriptor.Arg0(BASE,"INFO_PANEL_BORDER_COLOR",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Could not find a parent directory for %s.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_PARENT_DIRECTORY_COULD_NOT_BE_FOUND =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_PARENT_DIRECTORY_COULD_NOT_BE_FOUND",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The parent directory of %s does not exist.%nWould you like to create this directory?
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_PARENT_DIRECTORY_DOES_NOT_EXIST_CONFIRMATION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_PARENT_DIRECTORY_DOES_NOT_EXIST_CONFIRMATION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * 000,000,000
   */
  public static final MessageDescriptor.Arg0 INFO_PASSWORDFIELD_COLOR =
          new MessageDescriptor.Arg0(BASE,"INFO_PASSWORDFIELD_COLOR",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Use existing PKCS#11 Token
   */
  public static final MessageDescriptor.Arg0 INFO_PKCS11_CERTIFICATE =
          new MessageDescriptor.Arg0(BASE,"INFO_PKCS11_CERTIFICATE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * PKCS#11 Token
   */
  public static final MessageDescriptor.Arg0 INFO_PKCS11_CERTIFICATE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_PKCS11_CERTIFICATE_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Select this option if you have a PKCS#11 token.
   */
  public static final MessageDescriptor.Arg0 INFO_PKCS11_CERTIFICATE_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_PKCS11_CERTIFICATE_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * No certificates for the PCKS#11 key store could be found.  Check that is installed, that you have access rights to it and that the key store contains certificates.
   */
  public static final MessageDescriptor.Arg0 INFO_PKCS11_KEYSTORE_DOES_NOT_EXIST =
          new MessageDescriptor.Arg0(BASE,"INFO_PKCS11_KEYSTORE_DOES_NOT_EXIST",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Use existing PKCS#12 File
   */
  public static final MessageDescriptor.Arg0 INFO_PKCS12_CERTIFICATE =
          new MessageDescriptor.Arg0(BASE,"INFO_PKCS12_CERTIFICATE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * PKCS#12 File
   */
  public static final MessageDescriptor.Arg0 INFO_PKCS12_CERTIFICATE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_PKCS12_CERTIFICATE_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Select this option if you have a PKCS#12 certificate.
   */
  public static final MessageDescriptor.Arg0 INFO_PKCS12_CERTIFICATE_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_PKCS12_CERTIFICATE_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * No certificates for the PCKS#12 key store could be found.  Check that the provided path and PIN are valid and that the key store contains certificates.
   */
  public static final MessageDescriptor.Arg0 INFO_PKCS12_KEYSTORE_DOES_NOT_EXIST =
          new MessageDescriptor.Arg0(BASE,"INFO_PKCS12_KEYSTORE_DOES_NOT_EXIST",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * < Previous
   */
  public static final MessageDescriptor.Arg0 INFO_PREVIOUS_BUTTON_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_PREVIOUS_BUTTON_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Go to Previous Step
   */
  public static final MessageDescriptor.Arg0 INFO_PREVIOUS_BUTTON_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_PREVIOUS_BUTTON_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Starting...
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESSBAR_INITIAL_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESSBAR_INITIAL_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Progress Bar
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESSBAR_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESSBAR_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Canceling
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_CANCELING =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_CANCELING",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * 000,000,000
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_COLOR =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_COLOR",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Configuring Directory Server
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_CONFIGURING =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_CONFIGURING",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Configuring Replication
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_CONFIGURING_REPLICATION =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_CONFIGURING_REPLICATION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Configuring Replication on %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_PROGRESS_CONFIGURING_REPLICATION_REMOTE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_PROGRESS_CONFIGURING_REPLICATION_REMOTE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Copying file %s to %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_PROGRESS_COPYING_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_PROGRESS_COPYING_FILE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Creating Global Administrator
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_CREATING_ADMINISTRATOR =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_CREATING_ADMINISTRATOR",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Creating Registration Configuration
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_CREATING_ADS =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_CREATING_ADS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Creating Registration Configuration on %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_PROGRESS_CREATING_ADS_ON_REMOTE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_PROGRESS_CREATING_ADS_ON_REMOTE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Creating Base Entry for the base DNs
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_CREATING_BASE_ENTRIES =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_CREATING_BASE_ENTRIES",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Creating Base Entry %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_PROGRESS_CREATING_BASE_ENTRY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_PROGRESS_CREATING_BASE_ENTRY",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Creating Replicated Base DNs
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_CREATING_REPLICATED_BACKENDS =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_CREATING_REPLICATED_BACKENDS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Deleting directory %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_PROGRESS_DELETING_DIRECTORY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_PROGRESS_DELETING_DIRECTORY",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Deleting Database Files outside the Installation Path:
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_DELETING_EXTERNAL_DB_FILES =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_DELETING_EXTERNAL_DB_FILES",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Deleting Database Files outside the Installation Path
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_DELETING_EXTERNAL_DB_FILES_NON_VERBOSE =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_DELETING_EXTERNAL_DB_FILES_NON_VERBOSE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Deleting Log Files outside the Installation Path:
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_DELETING_EXTERNAL_LOG_FILES =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_DELETING_EXTERNAL_LOG_FILES",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Deleting Log Files outside the Installation Path
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_DELETING_EXTERNAL_LOG_FILES_NON_VERBOSE =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_DELETING_EXTERNAL_LOG_FILES_NON_VERBOSE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Deleting file %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_PROGRESS_DELETING_FILE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_PROGRESS_DELETING_FILE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Ignoring file %s since it does not exist.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_PROGRESS_DELETING_FILE_DOES_NOT_EXIST =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_PROGRESS_DELETING_FILE_DOES_NOT_EXIST",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Deleting Files under the Installation Path:
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_DELETING_INSTALLATION_FILES =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_DELETING_INSTALLATION_FILES",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Deleting Files under the Installation Path
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_DELETING_INSTALLATION_FILES_NON_VERBOSE =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_DELETING_INSTALLATION_FILES_NON_VERBOSE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Details:
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_DETAILS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_DETAILS_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Progress
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_DIALOG_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_DIALOG_TITLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Disabling Windows Service
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_DISABLING_WINDOWS_SERVICE =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_DISABLING_WINDOWS_SERVICE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Done.
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_DONE =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_DONE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Downloading
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_DOWNLOADING =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_DOWNLOADING",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Enabling Windows Service
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_ENABLING_WINDOWS_SERVICE =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_ENABLING_WINDOWS_SERVICE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error.
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_ERROR =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_ERROR",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Extracting %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_PROGRESS_EXTRACTING =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_PROGRESS_EXTRACTING",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Importing LDIF file %s:
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_PROGRESS_IMPORTING_LDIF =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_PROGRESS_IMPORTING_LDIF",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Importing LDIF files %s:
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_PROGRESS_IMPORTING_LDIFS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_PROGRESS_IMPORTING_LDIFS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Importing LDIF files %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_PROGRESS_IMPORTING_LDIFS_NON_VERBOSE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_PROGRESS_IMPORTING_LDIFS_NON_VERBOSE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Importing LDIF file %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_PROGRESS_IMPORTING_LDIF_NON_VERBOSE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_PROGRESS_IMPORTING_LDIF_NON_VERBOSE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Importing Automatically-Generated Data (%s Entries):
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_PROGRESS_IMPORT_AUTOMATICALLY_GENERATED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_PROGRESS_IMPORT_AUTOMATICALLY_GENERATED",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Importing Automatically-Generated Data (%s Entries)
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_PROGRESS_IMPORT_AUTOMATICALLY_GENERATED_NON_VERBOSE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_PROGRESS_IMPORT_AUTOMATICALLY_GENERATED_NON_VERBOSE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Initializing Registration information
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_INITIALIZING_ADS =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_INITIALIZING_ADS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Initializing schema information
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_INITIALIZING_SCHEMA =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_INITIALIZING_SCHEMA",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Initializing base DN %s with the contents from %s:
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_PROGRESS_INITIALIZING_SUFFIX =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_PROGRESS_INITIALIZING_SUFFIX",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Progress
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_PANEL_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_PANEL_TITLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * .....
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_POINTS =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_POINTS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Canceling Reversion
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_REVERT_ABORT =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_REVERT_ABORT",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Cleaning Up
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_REVERT_CLEANUP =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_REVERT_CLEANUP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Recording Reversion History
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_REVERT_HISTORY =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_REVERT_HISTORY",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Initializing Reversion
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_REVERT_INITIALIZING =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_REVERT_INITIALIZING",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Reverting Components
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_REVERT_REVERTING_COMPONENTS =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_REVERT_REVERTING_COMPONENTS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Verifying revert
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_REVERT_VERIFYING =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_REVERT_VERIFYING",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The Directory Server is already stopped.
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_SERVER_ALREADY_STOPPED =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_SERVER_ALREADY_STOPPED",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Server stopped.
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_SERVER_STOPPED =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_SERVER_STOPPED",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Waiting for Server to stop...
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_SERVER_WAITING_TO_STOP =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_SERVER_WAITING_TO_STOP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Starting Directory Server:
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_STARTING =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_STARTING",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Starting Directory Server
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_STARTING_NON_VERBOSE =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_STARTING_NON_VERBOSE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Progress
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_STEP =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_STEP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Stopping Directory Server:
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_STOPPING =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_STOPPING",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Stopping Directory Server
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_STOPPING_NON_VERBOSE =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_STOPPING_NON_VERBOSE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Progress
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_TITLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Reverting Registration Configuration on %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_PROGRESS_UNCONFIGURING_ADS_ON_REMOTE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_PROGRESS_UNCONFIGURING_ADS_ON_REMOTE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Unconfiguring Replication on %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_PROGRESS_UNCONFIGURING_REPLICATION_REMOTE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_PROGRESS_UNCONFIGURING_REPLICATION_REMOTE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Configuring Certificates
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_UPDATING_CERTIFICATES =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_UPDATING_CERTIFICATES",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Canceling Upgrade
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_UPGRADE_ABORT =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_UPGRADE_ABORT",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Applying Registration Customizations
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_UPGRADE_APPLYING_ADS_CUSTOMIZATION =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_UPGRADE_APPLYING_ADS_CUSTOMIZATION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Applying Configuration Customizations
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_UPGRADE_APPLYING_CONFIG_CUSTOMIZATION =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_UPGRADE_APPLYING_CONFIG_CUSTOMIZATION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Applying Schema Customizations
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_UPGRADE_APPLYING_SCHEMA_CUSTOMIZATION =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_UPGRADE_APPLYING_SCHEMA_CUSTOMIZATION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Backing Up Data
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_UPGRADE_BACKING_UP_DB =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_UPGRADE_BACKING_UP_DB",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Backing Up Files
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_UPGRADE_BACKING_UP_FILES =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_UPGRADE_BACKING_UP_FILES",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Calculating Configuration Customizations
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_UPGRADE_CALCULATING_CONFIG_CUSTOMIZATION =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_UPGRADE_CALCULATING_CONFIG_CUSTOMIZATION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Calculating Schema Customizations
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_UPGRADE_CALCULATING_SCHEMA_CUSTOMIZATION =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_UPGRADE_CALCULATING_SCHEMA_CUSTOMIZATION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Cleaning Up
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_UPGRADE_CLEANUP =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_UPGRADE_CLEANUP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Downloading Build
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_UPGRADE_DOWNLOADING =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_UPGRADE_DOWNLOADING",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Extracting Build
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_UPGRADE_EXTRACTING =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_UPGRADE_EXTRACTING",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Extracting Build:
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_UPGRADE_EXTRACTING_VERBOSE =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_UPGRADE_EXTRACTING_VERBOSE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Recording Upgrade History
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_UPGRADE_HISTORY =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_UPGRADE_HISTORY",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Initializing Upgrade
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_UPGRADE_INITIALIZING =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_UPGRADE_INITIALIZING",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Closing internal connection handlers
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_UPGRADE_INTERNAL_STOP =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_UPGRADE_INTERNAL_STOP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Preparing Customizations
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_UPGRADE_PREPARING_CUSTOMIZATIONS =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_UPGRADE_PREPARING_CUSTOMIZATIONS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Upgrading Components
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_UPGRADE_UPGRADING_COMPONENTS =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_UPGRADE_UPGRADING_COMPONENTS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Verifying Upgrade
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_UPGRADE_VERIFYING =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_UPGRADE_VERIFYING",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The minimum length required for the Root User password is %s characters.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_PWD_TOO_SHORT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_PWD_TOO_SHORT",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Quit Setup
   */
  public static final MessageDescriptor.Arg0 INFO_QUIT_BUTTON_INSTALL_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_QUIT_BUTTON_INSTALL_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Quit
   */
  public static final MessageDescriptor.Arg0 INFO_QUIT_BUTTON_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_QUIT_BUTTON_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Quit Upgrade
   */
  public static final MessageDescriptor.Arg0 INFO_QUIT_BUTTON_UPGRADE_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_QUIT_BUTTON_UPGRADE_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * 000,000,000
   */
  public static final MessageDescriptor.Arg0 INFO_READ_ONLY_COLOR =
          new MessageDescriptor.Arg0(BASE,"INFO_READ_ONLY_COLOR",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * An unexpected error occurred managing the registration information in %s.%nThe error is: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_REMOTE_ADS_EXCEPTION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_REMOTE_ADS_EXCEPTION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Replication Port
   */
  public static final MessageDescriptor.Arg0 INFO_REMOTE_REPLICATION_PORTS_STEP =
          new MessageDescriptor.Arg0(BASE,"INFO_REMOTE_REPLICATION_PORTS_STEP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * You must specify a different Replication port for existing server %s.  The specified port has already been chosen to configure the new server.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_REMOTE_REPLICATION_PORT_ALREADY_CHOSEN_FOR_OTHER_PROTOCOL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_REMOTE_REPLICATION_PORT_ALREADY_CHOSEN_FOR_OTHER_PROTOCOL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * You must provide the ports that will be used to replicate data for the remote servers specified below.<br>The specified ports must be free on the remote hosts and the user that is being used to run the Directory Servers must have access rights to them.
   */
  public static final MessageDescriptor.Arg0 INFO_REMOTE_REPLICATION_PORT_INSTRUCTIONS =
          new MessageDescriptor.Arg0(BASE,"INFO_REMOTE_REPLICATION_PORT_INSTRUCTIONS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Replication Port of Remote Servers
   */
  public static final MessageDescriptor.Arg0 INFO_REMOTE_REPLICATION_PORT_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_REMOTE_REPLICATION_PORT_TITLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Admin User:
   */
  public static final MessageDescriptor.Arg0 INFO_REMOTE_SERVER_DN_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_REMOTE_SERVER_DN_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The DN or the UID of an administrator in the server you want to replicate data with.
   */
  public static final MessageDescriptor.Arg0 INFO_REMOTE_SERVER_DN_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_REMOTE_SERVER_DN_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Host Name:
   */
  public static final MessageDescriptor.Arg0 INFO_REMOTE_SERVER_HOST_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_REMOTE_SERVER_HOST_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The fully qualified name of the host where the server you want to replicate data with is located.
   */
  public static final MessageDescriptor.Arg0 INFO_REMOTE_SERVER_HOST_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_REMOTE_SERVER_HOST_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Administration Connector Port:
   */
  public static final MessageDescriptor.Arg0 INFO_REMOTE_SERVER_PORT_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_REMOTE_SERVER_PORT_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The administration connector port of the server you want to replicate data with.
   */
  public static final MessageDescriptor.Arg0 INFO_REMOTE_SERVER_PORT_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_REMOTE_SERVER_PORT_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Admin Password:
   */
  public static final MessageDescriptor.Arg0 INFO_REMOTE_SERVER_PWD_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_REMOTE_SERVER_PWD_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The password of an administrator in the server you want to replicate data with.
   */
  public static final MessageDescriptor.Arg0 INFO_REMOTE_SERVER_PWD_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_REMOTE_SERVER_PWD_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * %s - To be configured on remote server %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_REMOTE_SERVER_REPLICATION_PORT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_REMOTE_SERVER_REPLICATION_PORT",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Considering the number of entries defined in the suffixes of the replicated remote servers, the default runtime settings might not be enough to be able to manage that volume of data.  It is recommended to increase the maximum memory allowed for the server runtime.<br><br>Check the documentation for more information about how to tune the server.
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATED_ENTRIES_WARNING_UPDATE_RUNTIME_ARGS =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATED_ENTRIES_WARNING_UPDATE_RUNTIME_ARGS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * This server will be part of a replication topology
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATED_SERVER_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATED_SERVER_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Check this if you want to replicate the data on the server that you are creating with other servers.
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATED_SERVER_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATED_SERVER_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * You must specify a different Replication port than those you chose for LDAP and LDAPS communication.
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_PORT_ALREADY_CHOSEN_FOR_OTHER_PROTOCOL =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_PORT_ALREADY_CHOSEN_FOR_OTHER_PROTOCOL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Replication Port:
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_PORT_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_PORT_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The port that will be used to send and receive replication updates between this server and the other servers.
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_PORT_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_PORT_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Retry
   */
  public static final MessageDescriptor.Arg0 INFO_RETRY_BUTTON_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_RETRY_BUTTON_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Reversion canceled.
   */
  public static final MessageDescriptor.Arg0 INFO_REVERSION_CANCELED =
          new MessageDescriptor.Arg0(BASE,"INFO_REVERSION_CANCELED",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * %s archived on %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_REVERSION_DIR_FROM_UPGRADE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_REVERSION_DIR_FROM_UPGRADE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Select a reversion archive directory:
   */
  public static final MessageDescriptor.Arg0 INFO_REVERSION_DIR_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_REVERSION_DIR_PROMPT",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Initializing archives
   */
  public static final MessageDescriptor.Arg0 INFO_REVERSION_DIR_WAIT =
          new MessageDescriptor.Arg0(BASE,"INFO_REVERSION_DIR_WAIT",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Upgrade requires manual action
   */
  public static final MessageDescriptor.Arg0 INFO_REVERSION_ORACLE_ACTION =
          new MessageDescriptor.Arg0(BASE,"INFO_REVERSION_ORACLE_ACTION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Reversion from version %s to version %s requires further action.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_REVERSION_ORACLE_EI_ACTION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_REVERSION_ORACLE_EI_ACTION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Reversion from version %s to version %s is not supported.  To revert you must uninstall the current server, install the new server, and manually migrate your data.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_REVERSION_ORACLE_FAILURE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_REVERSION_ORACLE_FAILURE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Upgrade information
   */
  public static final MessageDescriptor.Arg0 INFO_REVERSION_ORACLE_INFO =
          new MessageDescriptor.Arg0(BASE,"INFO_REVERSION_ORACLE_INFO",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Reversion from version %s to version %s is supported.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_REVERSION_ORACLE_SUCCESS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_REVERSION_ORACLE_SUCCESS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Reversion not supported from version %s to version %s. To revert you must uninstall the current server, install the new server, and manually migrate your data: %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> INFO_REVERSION_ORACLE_UNSUPPORTED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"INFO_REVERSION_ORACLE_UNSUPPORTED",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Reversion warning
   */
  public static final MessageDescriptor.Arg0 INFO_REVERSION_ORACLE_WARNING =
          new MessageDescriptor.Arg0(BASE,"INFO_REVERSION_ORACLE_WARNING",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * How would you like to specify the archive used to revert this instance?
   */
  public static final MessageDescriptor.Arg0 INFO_REVERSION_TYPE_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_REVERSION_TYPE_PROMPT",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Manually specify a reversion archive directory
   */
  public static final MessageDescriptor.Arg0 INFO_REVERSION_TYPE_PROMPT_FILE =
          new MessageDescriptor.Arg0(BASE,"INFO_REVERSION_TYPE_PROMPT_FILE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Use the most recent versioned archive
   */
  public static final MessageDescriptor.Arg0 INFO_REVERSION_TYPE_PROMPT_RECENT =
          new MessageDescriptor.Arg0(BASE,"INFO_REVERSION_TYPE_PROMPT_RECENT",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * This installation will be reverted to version %s using the files in %s.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_REVERT_CONFIRM_PROMPT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_REVERT_CONFIRM_PROMPT",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Confirm Reversion
   */
  public static final MessageDescriptor.Arg0 INFO_REVERT_CONFIRM_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_REVERT_CONFIRM_TITLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * There are no existing backup locations from prior upgrades.  The 'history' directory is empty.
   */
  public static final MessageDescriptor.Arg0 INFO_REVERT_ERROR_EMPTY_HISTORY_DIR =
          new MessageDescriptor.Arg0(BASE,"INFO_REVERT_ERROR_EMPTY_HISTORY_DIR",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The specified reversion archive directory does not appear to contain files backed up from an invocation of the upgrade tool.
   */
  public static final MessageDescriptor.Arg0 INFO_REVERT_ERROR_INVALID_FILES_DIR =
          new MessageDescriptor.Arg0(BASE,"INFO_REVERT_ERROR_INVALID_FILES_DIR",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * There are no valid existing backup locations from prior upgrades.
   */
  public static final MessageDescriptor.Arg0 INFO_REVERT_ERROR_INVALID_HISTORY_DIR =
          new MessageDescriptor.Arg0(BASE,"INFO_REVERT_ERROR_INVALID_HISTORY_DIR",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The specified reversion archive directory is not a directory.
   */
  public static final MessageDescriptor.Arg0 INFO_REVERT_ERROR_NOT_DIR_FILES_DIR =
          new MessageDescriptor.Arg0(BASE,"INFO_REVERT_ERROR_NOT_DIR_FILES_DIR",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * ERROR:  No reversion archive directory specified.  You must specify one of %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_REVERT_ERROR_NO_DIR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_REVERT_ERROR_NO_DIR",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * There are no existing backup locations from prior upgrades.  The 'history' directory does not exist.
   */
  public static final MessageDescriptor.Arg0 INFO_REVERT_ERROR_NO_HISTORY_DIR =
          new MessageDescriptor.Arg0(BASE,"INFO_REVERT_ERROR_NO_HISTORY_DIR",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The specified reversion archive directory is invalid or could not be determined.
   */
  public static final MessageDescriptor.Arg0 INFO_REVERT_ERROR_NULL_FILES_DIR =
          new MessageDescriptor.Arg0(BASE,"INFO_REVERT_ERROR_NULL_FILES_DIR",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * This utility reverts the current installation of the Directory Server to a version prior to running the upgrade utility.
   */
  public static final MessageDescriptor.Arg0 INFO_REVERT_LAUNCHER_USAGE_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_REVERT_LAUNCHER_USAGE_DESCRIPTION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Only Create Base Entry (%s)
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_REVIEW_CREATE_BASE_ENTRY_LABEL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_REVIEW_CREATE_BASE_ENTRY_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Do not Create a Base DN
   */
  public static final MessageDescriptor.Arg0 INFO_REVIEW_CREATE_NO_SUFFIX =
          new MessageDescriptor.Arg0(BASE,"INFO_REVIEW_CREATE_NO_SUFFIX",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Create New Base DN %s.%nBase DN Data: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_REVIEW_CREATE_SUFFIX =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_REVIEW_CREATE_SUFFIX",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Create New Base DNs:%n%s.%nBase DN Data: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_REVIEW_CREATE_SUFFIXES =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_REVIEW_CREATE_SUFFIXES",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Show Equivalent Command-Line
   */
  public static final MessageDescriptor.Arg0 INFO_REVIEW_DISPLAY_EQUIVALENT_COMMAND =
          new MessageDescriptor.Arg0(BASE,"INFO_REVIEW_DISPLAY_EQUIVALENT_COMMAND",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Show Summary
   */
  public static final MessageDescriptor.Arg0 INFO_REVIEW_DISPLAY_TEXT =
          new MessageDescriptor.Arg0(BASE,"INFO_REVIEW_DISPLAY_TEXT",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Import Automatically-Generated Data (%s Entries)
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_REVIEW_IMPORT_AUTOMATICALLY_GENERATED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_REVIEW_IMPORT_AUTOMATICALLY_GENERATED",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Import Data from LDIF File (%s)
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_REVIEW_IMPORT_LDIF =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_REVIEW_IMPORT_LDIF",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Leave Database Empty
   */
  public static final MessageDescriptor.Arg0 INFO_REVIEW_LEAVE_DATABASE_EMPTY_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_REVIEW_LEAVE_DATABASE_EMPTY_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Review your settings and click Finish if they are correct.
   */
  public static final MessageDescriptor.Arg0 INFO_REVIEW_PANEL_INSTRUCTIONS =
          new MessageDescriptor.Arg0(BASE,"INFO_REVIEW_PANEL_INSTRUCTIONS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Review
   */
  public static final MessageDescriptor.Arg0 INFO_REVIEW_PANEL_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_REVIEW_PANEL_TITLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Replicate contents with base DNs:%n%s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_REVIEW_REPLICATE_SUFFIX =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_REVIEW_REPLICATE_SUFFIX",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Review
   */
  public static final MessageDescriptor.Arg0 INFO_REVIEW_STEP =
          new MessageDescriptor.Arg0(BASE,"INFO_REVIEW_STEP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Runtime Options:
   */
  public static final MessageDescriptor.Arg0 INFO_RUNTIME_OPTIONS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_RUNTIME_OPTIONS_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Configure as Secure
   */
  public static final MessageDescriptor.Arg0 INFO_SECURE_REPLICATION_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_SECURE_REPLICATION_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * %s (Secure)
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_SECURE_REPLICATION_PORT_LABEL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_SECURE_REPLICATION_PORT_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Check this if you want to encrypt the communication when other servers connect to this replication port.
   */
  public static final MessageDescriptor.Arg0 INFO_SECURE_REPLICATION_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_SECURE_REPLICATION_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Close this dialog and discard configuration.
   */
  public static final MessageDescriptor.Arg0 INFO_SECURITY_OPTIONS_CANCEL_BUTTON_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_SECURITY_OPTIONS_CANCEL_BUTTON_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Security Options
   */
  public static final MessageDescriptor.Arg0 INFO_SECURITY_OPTIONS_DIALOG_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_SECURITY_OPTIONS_DIALOG_TITLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Specify the options for enabling secure access to the server.
   */
  public static final MessageDescriptor.Arg0 INFO_SECURITY_OPTIONS_INSTRUCTIONS =
          new MessageDescriptor.Arg0(BASE,"INFO_SECURITY_OPTIONS_INSTRUCTIONS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Close this dialog and accept configuration.
   */
  public static final MessageDescriptor.Arg0 INFO_SECURITY_OPTIONS_OK_BUTTON_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_SECURITY_OPTIONS_OK_BUTTON_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Configure Secure Access
   */
  public static final MessageDescriptor.Arg0 INFO_SECURITY_OPTIONS_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_SECURITY_OPTIONS_TITLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Close this dialog and discard selected alias.
   */
  public static final MessageDescriptor.Arg0 INFO_SELECT_ALIAS_CANCEL_BUTTON_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_SELECT_ALIAS_CANCEL_BUTTON_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The provided Key Store contains multiple certificates.<br>Select the alias of the certificate that you want to be used as Server Certificate:
   */
  public static final MessageDescriptor.Arg0 INFO_SELECT_ALIAS_MSG =
          new MessageDescriptor.Arg0(BASE,"INFO_SELECT_ALIAS_MSG",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Close this dialog and accept selected alias.
   */
  public static final MessageDescriptor.Arg0 INFO_SELECT_ALIAS_OK_BUTTON_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_SELECT_ALIAS_OK_BUTTON_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Select Alias
   */
  public static final MessageDescriptor.Arg0 INFO_SELECT_ALIAS_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_SELECT_ALIAS_TITLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Create a new Self-Signed Certificate
   */
  public static final MessageDescriptor.Arg0 INFO_SELF_SIGNED_CERTIFICATE =
          new MessageDescriptor.Arg0(BASE,"INFO_SELF_SIGNED_CERTIFICATE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Root User DN:
   */
  public static final MessageDescriptor.Arg0 INFO_SERVER_DIRECTORY_MANAGER_DN_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_SERVER_DIRECTORY_MANAGER_DN_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Enter the distinguished name (DN) of the inital Root User account that will used for managing the server
   */
  public static final MessageDescriptor.Arg0 INFO_SERVER_DIRECTORY_MANAGER_DN_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_SERVER_DIRECTORY_MANAGER_DN_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Password (confirm):
   */
  public static final MessageDescriptor.Arg0 INFO_SERVER_DIRECTORY_MANAGER_PWD_CONFIRM_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_SERVER_DIRECTORY_MANAGER_PWD_CONFIRM_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Re-enter the password for the server initial Root User account
   */
  public static final MessageDescriptor.Arg0 INFO_SERVER_DIRECTORY_MANAGER_PWD_CONFIRM_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_SERVER_DIRECTORY_MANAGER_PWD_CONFIRM_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Password:
   */
  public static final MessageDescriptor.Arg0 INFO_SERVER_DIRECTORY_MANAGER_PWD_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_SERVER_DIRECTORY_MANAGER_PWD_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Enter a password for the server initial Root User account
   */
  public static final MessageDescriptor.Arg0 INFO_SERVER_DIRECTORY_MANAGER_PWD_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_SERVER_DIRECTORY_MANAGER_PWD_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Error on %s:
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_SERVER_ERROR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_SERVER_ERROR",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Specify the memory and java arguments that will be used to run the server.
   */
  public static final MessageDescriptor.Arg0 INFO_SERVER_JAVA_ARGUMENTS_MSG =
          new MessageDescriptor.Arg0(BASE,"INFO_SERVER_JAVA_ARGUMENTS_MSG",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Server Runtime Settings
   */
  public static final MessageDescriptor.Arg0 INFO_SERVER_JAVA_ARGUMENTS_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_SERVER_JAVA_ARGUMENTS_TITLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Installation Path:
   */
  public static final MessageDescriptor.Arg0 INFO_SERVER_LOCATION_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_SERVER_LOCATION_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Enter the full path to the parent location where the server files will be stored
   */
  public static final MessageDescriptor.Arg0 INFO_SERVER_LOCATION_PARENT_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_SERVER_LOCATION_PARENT_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Enter the relative path to the location where the server files will be stored
   */
  public static final MessageDescriptor.Arg0 INFO_SERVER_LOCATION_RELATIVE_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_SERVER_LOCATION_RELATIVE_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The Directory Server is not running.  Click 'Yes' to continue the uninstall.
   */
  public static final MessageDescriptor.Arg0 INFO_SERVER_NOT_RUNNING_MSG =
          new MessageDescriptor.Arg0(BASE,"INFO_SERVER_NOT_RUNNING_MSG",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Directory Server not Running
   */
  public static final MessageDescriptor.Arg0 INFO_SERVER_NOT_RUNNING_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_SERVER_NOT_RUNNING_TITLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * LDAP Listener Port:
   */
  public static final MessageDescriptor.Arg0 INFO_SERVER_PORT_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_SERVER_PORT_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Enter the port number that the server will use to listen for LDAP requests
   */
  public static final MessageDescriptor.Arg0 INFO_SERVER_PORT_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_SERVER_PORT_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Server Runtime Settings:
   */
  public static final MessageDescriptor.Arg0 INFO_SERVER_RUNTIME_ARGS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_SERVER_RUNTIME_ARGS_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Configure...
   */
  public static final MessageDescriptor.Arg0 INFO_SERVER_SECURITY_BUTTON_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_SERVER_SECURITY_BUTTON_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Click to configure the LDAP Secure Access.
   */
  public static final MessageDescriptor.Arg0 INFO_SERVER_SECURITY_BUTTON_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_SERVER_SECURITY_BUTTON_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * LDAP Secure Access:
   */
  public static final MessageDescriptor.Arg0 INFO_SERVER_SECURITY_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_SERVER_SECURITY_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The LDAP Secure Access Configuration for the new server.
   */
  public static final MessageDescriptor.Arg0 INFO_SERVER_SECURITY_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_SERVER_SECURITY_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Enter a port to listen for LDAP requests and enter a password for the server initial Root user.
   */
  public static final MessageDescriptor.Arg0 INFO_SERVER_SETTINGS_PANEL_INSTRUCTIONS =
          new MessageDescriptor.Arg0(BASE,"INFO_SERVER_SETTINGS_PANEL_INSTRUCTIONS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Choose a location for the server files and enter a password for the server administrative user.
   */
  public static final MessageDescriptor.Arg0 INFO_SERVER_SETTINGS_PANEL_INSTRUCTIONS_WEBSTART =
          new MessageDescriptor.Arg0(BASE,"INFO_SERVER_SETTINGS_PANEL_INSTRUCTIONS_WEBSTART",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Server Settings
   */
  public static final MessageDescriptor.Arg0 INFO_SERVER_SETTINGS_PANEL_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_SERVER_SETTINGS_PANEL_TITLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Server Settings
   */
  public static final MessageDescriptor.Arg0 INFO_SERVER_SETTINGS_STEP =
          new MessageDescriptor.Arg0(BASE,"INFO_SERVER_SETTINGS_STEP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * %n%nThe graphical Setup launch failed.%n%nLaunching command line setup...
   */
  public static final MessageDescriptor.Arg0 INFO_SETUP_LAUNCHER_GUI_LAUNCHED_FAILED =
          new MessageDescriptor.Arg0(BASE,"INFO_SETUP_LAUNCHER_GUI_LAUNCHED_FAILED",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * %n%nThe graphical Setup launch failed.  Check file %s for more details.%n%nLaunching command line setup...
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_SETUP_LAUNCHER_GUI_LAUNCHED_FAILED_DETAILS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_SETUP_LAUNCHER_GUI_LAUNCHED_FAILED_DETAILS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Launching graphical setup...
   */
  public static final MessageDescriptor.Arg0 INFO_SETUP_LAUNCHER_LAUNCHING_GUI =
          new MessageDescriptor.Arg0(BASE,"INFO_SETUP_LAUNCHER_LAUNCHING_GUI",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * This utility can be used to set up the Directory Server.
   */
  public static final MessageDescriptor.Arg0 INFO_SETUP_LAUNCHER_USAGE_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_SETUP_LAUNCHER_USAGE_DESCRIPTION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Show Details
   */
  public static final MessageDescriptor.Arg0 INFO_SHOW_DETAILS_BUTTON_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_SHOW_DETAILS_BUTTON_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Show Details
   */
  public static final MessageDescriptor.Arg0 INFO_SHOW_EXCEPTION_DETAILS =
          new MessageDescriptor.Arg0(BASE,"INFO_SHOW_EXCEPTION_DETAILS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Shutdown
   */
  public static final MessageDescriptor.Arg0 INFO_SHUTDOWN_BUTTON_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_SHUTDOWN_BUTTON_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Close this window
   */
  public static final MessageDescriptor.Arg0 INFO_SHUTDOWN_DIRECTORY_MANAGER_CANCEL_BUTTON_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_SHUTDOWN_DIRECTORY_MANAGER_CANCEL_BUTTON_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * <b>Directory Server is Running</b><br>The server is currently running and must be stopped before uninstall can continue.  Provide the information below to allow the uninstaller to shut it down. You can also click Cancel and then shut the server down yourself.
   */
  public static final MessageDescriptor.Arg0 INFO_SHUTDOWN_DIRECTORY_MANAGER_DIALOG_MSG =
          new MessageDescriptor.Arg0(BASE,"INFO_SHUTDOWN_DIRECTORY_MANAGER_DIALOG_MSG",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Authentication Required
   */
  public static final MessageDescriptor.Arg0 INFO_SHUTDOWN_DIRECTORY_MANAGER_DIALOG_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_SHUTDOWN_DIRECTORY_MANAGER_DIALOG_TITLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Administrative User DN:
   */
  public static final MessageDescriptor.Arg0 INFO_SHUTDOWN_DIRECTORY_MANAGER_DN_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_SHUTDOWN_DIRECTORY_MANAGER_DN_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Enter the distinguished name (DN) of the Administrative User account that will used to shutdown the server
   */
  public static final MessageDescriptor.Arg0 INFO_SHUTDOWN_DIRECTORY_MANAGER_DN_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_SHUTDOWN_DIRECTORY_MANAGER_DN_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Password:
   */
  public static final MessageDescriptor.Arg0 INFO_SHUTDOWN_DIRECTORY_MANAGER_PWD_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_SHUTDOWN_DIRECTORY_MANAGER_PWD_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Enter the password of the server Administrative User account
   */
  public static final MessageDescriptor.Arg0 INFO_SHUTDOWN_DIRECTORY_MANAGER_PWD_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_SHUTDOWN_DIRECTORY_MANAGER_PWD_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Click here to shutdown the server with the provided authentication
   */
  public static final MessageDescriptor.Arg0 INFO_SHUTDOWN_DIRECTORY_MANAGER_SHUTDOWN_BUTTON_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_SHUTDOWN_DIRECTORY_MANAGER_SHUTDOWN_BUTTON_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * images/opendssplash.png
   */
  public static final MessageDescriptor.Arg0 INFO_SPLASH_ICON =
          new MessageDescriptor.Arg0(BASE,"INFO_SPLASH_ICON",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * QuickSetup Launching.
   */
  public static final MessageDescriptor.Arg0 INFO_SPLASH_ICON_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_SPLASH_ICON_DESCRIPTION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * QuickSetup Launching
   */
  public static final MessageDescriptor.Arg0 INFO_SPLASH_ICON_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_SPLASH_ICON_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * SSL Access:
   */
  public static final MessageDescriptor.Arg0 INFO_SSL_ACCESS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_SSL_ACCESS_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The LDAPS port.
   */
  public static final MessageDescriptor.Arg0 INFO_SSL_PORT_TEXTFIELD_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_SSL_PORT_TEXTFIELD_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * This will be a stand alone server
   */
  public static final MessageDescriptor.Arg0 INFO_STANDALONE_SERVER_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_STANDALONE_SERVER_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Check this if you do not want to replicate the data on the server that you are creating with other servers.
   */
  public static final MessageDescriptor.Arg0 INFO_STANDALONE_SERVER_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_STANDALONE_SERVER_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * StartTLS Access:
   */
  public static final MessageDescriptor.Arg0 INFO_STARTTLS_ACCESS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_STARTTLS_ACCESS_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Start Server when Configuration has Completed
   */
  public static final MessageDescriptor.Arg0 INFO_START_SERVER_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_START_SERVER_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Check this check box if you want to start the server once the installation and configuration has completed
   */
  public static final MessageDescriptor.Arg0 INFO_START_SERVER_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_START_SERVER_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Choose Version
   */
  public static final MessageDescriptor.Arg0 INFO_STEP_UPGRADE_CHOOSE_VERSION =
          new MessageDescriptor.Arg0(BASE,"INFO_STEP_UPGRADE_CHOOSE_VERSION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * images/divider-left.png
   */
  public static final MessageDescriptor.Arg0 INFO_SUBSECTION_LEFT_ICON =
          new MessageDescriptor.Arg0(BASE,"INFO_SUBSECTION_LEFT_ICON",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Decoration icon.
   */
  public static final MessageDescriptor.Arg0 INFO_SUBSECTION_LEFT_ICON_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_SUBSECTION_LEFT_ICON_DESCRIPTION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * images/divider-right.png
   */
  public static final MessageDescriptor.Arg0 INFO_SUBSECTION_RIGHT_ICON =
          new MessageDescriptor.Arg0(BASE,"INFO_SUBSECTION_RIGHT_ICON",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Decoration icon.
   */
  public static final MessageDescriptor.Arg0 INFO_SUBSECTION_RIGHT_ICON_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_SUBSECTION_RIGHT_ICON_DESCRIPTION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Data Replication
   */
  public static final MessageDescriptor.Arg0 INFO_SUFFIXES_STEP =
          new MessageDescriptor.Arg0(BASE,"INFO_SUFFIXES_STEP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The Distinguished Name (DN) of the base DN to replicate.
   */
  public static final MessageDescriptor.Arg0 INFO_SUFFIXES_TO_REPLICATE_DN_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_SUFFIXES_TO_REPLICATE_DN_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Choose the base DNs that you want to create and whose contents will be replicated with the remote servers.
   */
  public static final MessageDescriptor.Arg0 INFO_SUFFIXES_TO_REPLICATE_PANEL_INSTRUCTIONS =
          new MessageDescriptor.Arg0(BASE,"INFO_SUFFIXES_TO_REPLICATE_PANEL_INSTRUCTIONS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Data Replication
   */
  public static final MessageDescriptor.Arg0 INFO_SUFFIXES_TO_REPLICATE_PANEL_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_SUFFIXES_TO_REPLICATE_PANEL_TITLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Base DN initialized successfully.
   */
  public static final MessageDescriptor.Arg0 INFO_SUFFIX_INITIALIZED_SUCCESSFULLY =
          new MessageDescriptor.Arg0(BASE,"INFO_SUFFIX_INITIALIZED_SUCCESSFULLY",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * -No Base DNs Found-
   */
  public static final MessageDescriptor.Arg0 INFO_SUFFIX_LIST_EMPTY =
          new MessageDescriptor.Arg0(BASE,"INFO_SUFFIX_LIST_EMPTY",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * %s  (%s entries)
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_SUFFIX_LIST_REPLICA_DISPLAY_ENTRIES =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_SUFFIX_LIST_REPLICA_DISPLAY_ENTRIES",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * %s (number of entries not available)
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_SUFFIX_LIST_REPLICA_DISPLAY_ENTRIES_NOT_AVAILABLE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_SUFFIX_LIST_REPLICA_DISPLAY_ENTRIES_NOT_AVAILABLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * %s  (no entries)
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_SUFFIX_LIST_REPLICA_DISPLAY_NO_ENTRIES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_SUFFIX_LIST_REPLICA_DISPLAY_NO_ENTRIES",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * <unknown>
   */
  public static final MessageDescriptor.Arg0 INFO_SUFFIX_LIST_UNKNOWN_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_SUFFIX_LIST_UNKNOWN_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Canceling...
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_CANCELING =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_CANCELING",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Configuring Directory Server...
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_CONFIGURING =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_CONFIGURING",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Creating Registration Configuration...
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_CONFIGURING_ADS =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_CONFIGURING_ADS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Configuring Replication...
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_CONFIGURING_REPLICATION =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_CONFIGURING_REPLICATION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Creating Base Entry...
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_CREATING_BASE_ENTRY =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_CREATING_BASE_ENTRY",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Downloading Binary Files...
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_DOWNLOADING =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_DOWNLOADING",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Enabling Windows Service...
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_ENABLING_WINDOWS_SERVICE =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_ENABLING_WINDOWS_SERVICE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Extracting Binary Files...
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_EXTRACTING =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_EXTRACTING",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Importing Automatically-Generated Data...
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_IMPORTING_AUTOMATICALLY_GENERATED =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_IMPORTING_AUTOMATICALLY_GENERATED",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Importing LDIF File...
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_IMPORTING_LDIF =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_IMPORTING_LDIF",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Initializing Contents of Replicated Base DNs...
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_INITIALIZE_REPLICATED_SUFFIXES =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_INITIALIZE_REPLICATED_SUFFIXES",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * <b>QuickSetup Canceled.</b> <br>The setup was canceled and any files installed to your system during this operation have been removed.
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_INSTALL_FINISHED_CANCELED =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_INSTALL_FINISHED_CANCELED",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * <b>%s QuickSetup Completed Successfully.</b><br>%s is now installed in %s.<br>The server is %s.<br><br>Visit the <a href="%s"> %s Administration Guide</a> for an overview of server management and configuration.<br>To see server configuration status and to perform some basic administration tasks on the server, click Launch Control Panel.  Note that you can launch this tool later using %s.<br><INPUT type="submit" value="Launch Control Panel"></INPUT>
   */
  public static final MessageDescriptor.Arg7<CharSequence,CharSequence,CharSequence,CharSequence,CharSequence,CharSequence,CharSequence> INFO_SUMMARY_INSTALL_FINISHED_SUCCESSFULLY =
          new MessageDescriptor.Arg7<CharSequence,CharSequence,CharSequence,CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"INFO_SUMMARY_INSTALL_FINISHED_SUCCESSFULLY",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * <b>Error</b><br>An error occurred.  Check 'Details' text area for more information.<br>The server is %s.<br>To see server configuration status and to perform basic administration tasks on the server, click Launch Control Panel.  Note that you can launch this tool later using %s.<br><INPUT type="submit" value="Launch Control Panel"></INPUT>
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_SUMMARY_INSTALL_FINISHED_WITH_ERROR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_SUMMARY_INSTALL_FINISHED_WITH_ERROR",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Starting QuickSetup...
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_INSTALL_NOT_STARTED =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_INSTALL_NOT_STARTED",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Canceling Reversion...
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_REVERT_ABORT =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_REVERT_ABORT",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Cleaning Up...
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_REVERT_CLEANUP =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_REVERT_CLEANUP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Reversion Canceled. The upgrade operation was canceled and the installation has been restored to the state it was in before the reversion operation.
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_REVERT_FINISHED_CANCELED_CLI =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_REVERT_FINISHED_CANCELED_CLI",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Reversion Completed Successfully.  The server installation at %s has now been reverted to version %s.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_SUMMARY_REVERT_FINISHED_SUCCESSFULLY_CLI =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_SUMMARY_REVERT_FINISHED_SUCCESSFULLY_CLI",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Reversion Failed. The reversion operation could not complete successfully due to errors and the installation has been restored to the state it was in before the reversion operation.  See the logs for details on why the reversion operation failed.
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_REVERT_FINISHED_WITH_ERRORS_CLI =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_REVERT_FINISHED_WITH_ERRORS_CLI",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Reversion Succeeded With Warnings. The reversion operation completed successfully but the reverter had problems that require attention. See the logs for details on the problems.
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_REVERT_FINISHED_WITH_WARNINGS_CLI =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_REVERT_FINISHED_WITH_WARNINGS_CLI",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Recording Reversion History...
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_REVERT_HISTORY =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_REVERT_HISTORY",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Initializing Reversion...
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_REVERT_INITIALIZING =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_REVERT_INITIALIZING",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Starting Reversion...
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_REVERT_NOT_STARTED =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_REVERT_NOT_STARTED",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Reverting Components...
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_REVERT_REVERTING_COMPONENTS =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_REVERT_REVERTING_COMPONENTS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Verifying revert...
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_REVERT_VERIFYING =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_REVERT_VERIFYING",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Starting Server...
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_STARTING =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_STARTING",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * An error occurred Starting Server.  Check 'Details' text area for more information.
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_START_ERROR =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_START_ERROR",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Server Started Successfully.
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_START_SUCCESS =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_START_SUCCESS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Stopping Server...
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_STOPPING =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_STOPPING",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * An error occurred Stopping Server.  Check 'Details' text area for more information.
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_STOP_ERROR =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_STOP_ERROR",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Server Stopped Successfully.
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_STOP_SUCCESS =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_STOP_SUCCESS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Canceling Upgrade...
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_UPGRADE_ABORT =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_UPGRADE_ABORT",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Applying Registration Customizations...
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_UPGRADE_APPLYING_ADS_CUSTOMIZATION =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_UPGRADE_APPLYING_ADS_CUSTOMIZATION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Applying Configuration Customizations...
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_UPGRADE_APPLYING_CONFIG_CUSTOMIZATION =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_UPGRADE_APPLYING_CONFIG_CUSTOMIZATION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Applying Schema Customizations...
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_UPGRADE_APPLYING_SCHEMA_CUSTOMIZATION =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_UPGRADE_APPLYING_SCHEMA_CUSTOMIZATION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Backing Up Data...
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_UPGRADE_BACKING_UP_DB =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_UPGRADE_BACKING_UP_DB",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Backing Up Files...
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_UPGRADE_BACKING_UP_FILES =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_UPGRADE_BACKING_UP_FILES",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Calculating Configuration Customizations...
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_UPGRADE_CALCULATING_CONFIG_CUSTOMIZATION =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_UPGRADE_CALCULATING_CONFIG_CUSTOMIZATION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Calculating Schema Customizations...
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_UPGRADE_CALCULATING_SCHEMA_CUSTOMIZATION =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_UPGRADE_CALCULATING_SCHEMA_CUSTOMIZATION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Cleaning Up...
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_UPGRADE_CLEANUP =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_UPGRADE_CLEANUP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Downloading Build...
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_UPGRADE_DOWNLOADING =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_UPGRADE_DOWNLOADING",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Extracting Build...
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_UPGRADE_EXTRACTING =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_UPGRADE_EXTRACTING",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * <b>QuickUpgrade Canceled.</b> <br>The upgrade operation was canceled and the installation has been restored to the state it was in before the upgrade operation.<br><br><INPUT type="submit" value="Launch Control Panel"></INPUT>
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_UPGRADE_FINISHED_CANCELED =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_UPGRADE_FINISHED_CANCELED",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * QuickUpgrade Canceled. The upgrade operation was canceled and the installation has been restored to the state it was in before the upgrade operation.
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_UPGRADE_FINISHED_CANCELED_CLI =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_UPGRADE_FINISHED_CANCELED_CLI",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * <b>QuickUpgrade Completed Successfully.</b><br>The server installation at %s has now been upgraded to version %s.<br><br><INPUT type="submit" value="Launch Control Panel"></INPUT>
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_SUMMARY_UPGRADE_FINISHED_SUCCESSFULLY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_SUMMARY_UPGRADE_FINISHED_SUCCESSFULLY",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * QuickUpgrade Completed Successfully.  The %s installation at %s has now been upgraded to version %s.
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> INFO_SUMMARY_UPGRADE_FINISHED_SUCCESSFULLY_CLI =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"INFO_SUMMARY_UPGRADE_FINISHED_SUCCESSFULLY_CLI",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * <b>QuickUpgrade Failed</b><br>The upgrade operation could not complete successfully due to errors and the installation has been restored to the state it was in before the upgrade operation.  See the 'Details' text for more information on why the upgrade operation failed.<br><br><INPUT type="submit" value="Launch Control Panel"></INPUT>
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_UPGRADE_FINISHED_WITH_ERRORS =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_UPGRADE_FINISHED_WITH_ERRORS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * QuickUpgrade Failed. The upgrade operation could not complete successfully due to errors and the installation has been restored to the state it was in before the upgrade operation.  See the logs for details on why the upgrade operation failed.
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_UPGRADE_FINISHED_WITH_ERRORS_CLI =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_UPGRADE_FINISHED_WITH_ERRORS_CLI",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * <b>QuickUpgrade Succeeded With Warnings</b><br>The upgrade operation completed successfully but the upgrader had problems that require attention. See the 'Details' text for more information on the problems.<br><br><INPUT type="submit" value="Launch Control Panel"></INPUT>
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_UPGRADE_FINISHED_WITH_WARNINGS =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_UPGRADE_FINISHED_WITH_WARNINGS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * QuickUpgrade Succeeded With Warnings. The upgrade operation completed successfully but the upgrader had problems that require attention. See the logs for details on the problems.
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_UPGRADE_FINISHED_WITH_WARNINGS_CLI =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_UPGRADE_FINISHED_WITH_WARNINGS_CLI",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Recording Upgrade History...
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_UPGRADE_HISTORY =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_UPGRADE_HISTORY",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Initializing Upgrade...
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_UPGRADE_INITIALIZING =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_UPGRADE_INITIALIZING",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Starting Upgrade...
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_UPGRADE_NOT_STARTED =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_UPGRADE_NOT_STARTED",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Preparing Customizations...
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_UPGRADE_PREPARING_CUSTOMIZATIONS =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_UPGRADE_PREPARING_CUSTOMIZATIONS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Upgrading Components...
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_UPGRADE_UPGRADING_COMPONENTS =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_UPGRADE_UPGRADING_COMPONENTS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Verifying Upgrade...
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_UPGRADE_VERIFYING =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_UPGRADE_VERIFYING",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Waiting to Cancel...
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_WAITING_TO_CANCEL =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_WAITING_TO_CANCEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * 000,000,000
   */
  public static final MessageDescriptor.Arg0 INFO_TEXTFIELD_COLOR =
          new MessageDescriptor.Arg0(BASE,"INFO_TEXTFIELD_COLOR",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * 000,000,000
   */
  public static final MessageDescriptor.Arg0 INFO_TEXT_AREA_BORDER_COLOR =
          new MessageDescriptor.Arg0(BASE,"INFO_TEXT_AREA_BORDER_COLOR",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * There is already a server in the topology
   */
  public static final MessageDescriptor.Arg0 INFO_TOPOLOGY_EXISTS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_TOPOLOGY_EXISTS_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Check this if you already created a server that you want to replicate data with.
   */
  public static final MessageDescriptor.Arg0 INFO_TOPOLOGY_EXISTS_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_TOPOLOGY_EXISTS_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Build Version:
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_BUILD_ID_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_BUILD_ID_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The ID of the build version installed in the above location
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_BUILD_ID_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_BUILD_ID_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Unknown
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_BUILD_ID_UNKNOWN =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_BUILD_ID_UNKNOWN",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Upgrade canceled.
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_CANCELED =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_CANCELED",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * <b>Error Accessing Build Information.</b><br>Unable to retrieve the list of builds from %s due to: %s.<br>Possible Causes:<br><ul><li>Need to specify a proxy.<br><table><tr><td><input value="Specify Proxy" type="submit"></input></td><td>Current Proxy: %s<td></tr></table><br></li><li>%s is down or experiencing difficulty.</li></ul><br>You can still continue with upgrade but will need to download a build separately and then point to it in the wizard.
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> INFO_UPGRADE_CHOOSE_VERSION_BUILD_LIST_ERROR =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"INFO_UPGRADE_CHOOSE_VERSION_BUILD_LIST_ERROR",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Loading remote build information...
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_CHOOSE_VERSION_LOADING_BUILD_INFO =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_CHOOSE_VERSION_LOADING_BUILD_INFO",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Upgrade Based on Downloaded Weekly Build (.zip)
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_CHOOSE_VERSION_LOCAL_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_CHOOSE_VERSION_LOCAL_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Path:
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_CHOOSE_VERSION_LOCAL_PATH =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_CHOOSE_VERSION_LOCAL_PATH",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Upgrade to a build whose .zip file you have already downloaded.
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_CHOOSE_VERSION_LOCAL_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_CHOOSE_VERSION_LOCAL_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Choose a new version or reference build to use for the upgrading.
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_CHOOSE_VERSION_PANEL_INSTRUCTIONS =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_CHOOSE_VERSION_PANEL_INSTRUCTIONS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Choose New Version
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_CHOOSE_VERSION_PANEL_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_CHOOSE_VERSION_PANEL_TITLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Reading remote build information...
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_CHOOSE_VERSION_READING_BUILD_INFO =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_CHOOSE_VERSION_READING_BUILD_INFO",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Choose New Version from forgerock.com/downloads-opendj.html
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_CHOOSE_VERSION_REMOTE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_CHOOSE_VERSION_REMOTE_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Nightly Builds
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_CHOOSE_VERSION_REMOTE_NIGHTLY =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_CHOOSE_VERSION_REMOTE_NIGHTLY",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Download and upgrade to a build publicly available on the OpenDJ website.
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_CHOOSE_VERSION_REMOTE_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_CHOOSE_VERSION_REMOTE_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Weekly Builds
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_CHOOSE_VERSION_REMOTE_WEEKLY =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_CHOOSE_VERSION_REMOTE_WEEKLY",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Unable to access remote build information.
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_CHOOSE_VERSION_UNABLE_TO_ACCESS_BUILD_INFO =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_CHOOSE_VERSION_UNABLE_TO_ACCESS_BUILD_INFO",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * This installation will be upgraded using the zip file %s.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_UPGRADE_CONFIRM_PROMPT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_UPGRADE_CONFIRM_PROMPT",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Confirm Upgrade
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_CONFIRM_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_CONFIRM_TITLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Enter the name and path of the server install file (.zip):
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_FILE_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_FILE_PROMPT",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * This utility can be used to upgrade the Directory Server to a newer version.
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_LAUNCHER_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_LAUNCHER_DESCRIPTION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * %n%nThe graphical upgrade launch failed.%n%nLaunching command line upgrade...
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_LAUNCHER_GUI_LAUNCHED_FAILED =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_LAUNCHER_GUI_LAUNCHED_FAILED",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * %n%nThe graphical upgrade launch failed.  Check file %s for more details.%n%nLaunching command line upgrade...
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_UPGRADE_LAUNCHER_GUI_LAUNCHED_FAILED_DETAILS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_UPGRADE_LAUNCHER_GUI_LAUNCHED_FAILED_DETAILS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Launching command line upgrade...
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_LAUNCHER_LAUNCHING_CLI =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_LAUNCHER_LAUNCHING_CLI",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Launching graphical upgrade...
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_LAUNCHER_LAUNCHING_GUI =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_LAUNCHER_LAUNCHING_GUI",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * This utility can be used to upgrade the Directory Server to a newer version or revert to a previous version.%n%nWhen using this tool to upgrade the server you should first downloaded an OpenDJ install package (.zip) file and specify its location using the -f/--file option.  You can also upgrade your server using the Java Web Start version of this tool by visiting the OpenDJ web site at www.forgerock.org/downloads-opendj.html.%n%nWhen using the tool to revert to a previous version you must either indicate that you want to revert to the version before the most recent upgrade using the -r/--revertMostRecent option or specify the location of a reversion archive using the -a/--reversionArchive option.%n
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_LAUNCHER_USAGE_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_LAUNCHER_USAGE_DESCRIPTION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Server to Upgrade:
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_LOCATION_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_LOCATION_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * File system location of the build that will be upgraded
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_LOCATION_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_LOCATION_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * From:
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_LOG_FIELD_FROM =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_LOG_FIELD_FROM",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Note:
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_LOG_FIELD_NOTE =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_LOG_FIELD_NOTE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Operation:
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_LOG_FIELD_OP =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_LOG_FIELD_OP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Status:
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_LOG_FIELD_STATUS =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_LOG_FIELD_STATUS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Time:
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_LOG_FIELD_TIME =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_LOG_FIELD_TIME",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * To:
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_LOG_FIELD_TO =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_LOG_FIELD_TO",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Canceled
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_LOG_STATUS_CANCEL =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_LOG_STATUS_CANCEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Failure
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_LOG_STATUS_FAILURE =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_LOG_STATUS_FAILURE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Started
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_LOG_STATUS_STARTED =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_LOG_STATUS_STARTED",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Success
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_LOG_STATUS_SUCCESS =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_LOG_STATUS_SUCCESS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Processed server modifications: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_UPGRADE_MOD =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_UPGRADE_MOD",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Attribute or value already exists: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_UPGRADE_MOD_IGNORE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_UPGRADE_MOD_IGNORE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Processed server modifications (schema checking disabled): %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_UPGRADE_MOD_NO_SCHEMA =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_UPGRADE_MOD_NO_SCHEMA",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Would you like to upgrade this installation to a newer version or revert to an older version?
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_OPERATION_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_OPERATION_PROMPT",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Revert to a previous version
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_OPERATION_REVERSION =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_OPERATION_REVERSION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Please rerun this command specifying options that indicate a reversion operation.  See the usage guide for details.
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_OPERATION_REVERSION_RESPONSE =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_OPERATION_REVERSION_RESPONSE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Upgrade to a newer version
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_OPERATION_UPGRADE =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_OPERATION_UPGRADE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Upgrade requires manual action
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_ORACLE_ACTION =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_ORACLE_ACTION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Upgrade information
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_ORACLE_INFO =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_ORACLE_INFO",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The current version and the version of the binaries to upgrade to are the same (%s)
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_UPGRADE_ORACLE_SAME_VERSION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_UPGRADE_ORACLE_SAME_VERSION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Upgrade from version %s to version %s is supported.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_UPGRADE_ORACLE_SUCCESS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_UPGRADE_ORACLE_SUCCESS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Upgrade not supported from version %s to version %s is not supported.  To upgrade you must uninstall the current server, install the new server, and manually migrate your data: %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> INFO_UPGRADE_ORACLE_UNSUPPORTED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"INFO_UPGRADE_ORACLE_UNSUPPORTED",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Upgrade warning
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_ORACLE_WARNING =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_ORACLE_WARNING",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Review your settings and click Finish if they are correct.
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_REVIEW_PANEL_INSTRUCTIONS =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_REVIEW_PANEL_INSTRUCTIONS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * New Version:
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_REVIEW_PANEL_NEW_VERSION_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_REVIEW_PANEL_NEW_VERSION_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The target version of the server
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_REVIEW_PANEL_NEW_VERSION_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_REVIEW_PANEL_NEW_VERSION_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Current Version:
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_REVIEW_PANEL_OLD_VERSION_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_REVIEW_PANEL_OLD_VERSION_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The current version of the server
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_REVIEW_PANEL_OLD_VERSION_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_REVIEW_PANEL_OLD_VERSION_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Server to Upgrade:
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_REVIEW_PANEL_SERVER_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_REVIEW_PANEL_SERVER_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * File system location of the build that will be upgraded
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_REVIEW_PANEL_SERVER_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_REVIEW_PANEL_SERVER_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Start Server when the Upgrade has Completed
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_REVIEW_PANEL_START_SERVER =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_REVIEW_PANEL_START_SERVER",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Check this check box if you want to start the server once the upgrade has completed
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_REVIEW_PANEL_START_SERVER_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_REVIEW_PANEL_START_SERVER_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Review
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_REVIEW_PANEL_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_REVIEW_PANEL_TITLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Cancel Upgrade
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_VERIFICATION_FAILURE_CANCEL =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_VERIFICATION_FAILURE_CANCEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The upgraded server returned errors on startup.  Would you like to cancel the upgrade?  If you cancel, any changes made to the server by this upgrade will be backed out.
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_VERIFICATION_FAILURE_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_VERIFICATION_FAILURE_PROMPT",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Upgrade Verification Failed
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_VERIFICATION_FAILURE_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_VERIFICATION_FAILURE_TITLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * View Error Details
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_VERIFICATION_FAILURE_VIEW_DETAILS =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_VERIFICATION_FAILURE_VIEW_DETAILS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Welcome
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_WELCOME_PANEL_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_WELCOME_PANEL_TITLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The OpenDJ QuickUpgrade tool will upgrade an existing build in place.<br><br>This instance of QuickUpgrade will upgrade the server you specify below to the following OpenDJ build: %s (Build ID: %s) .<br><br> Additional information on this tool is available on the <a href="https://wikis.forgerock.org/confluence/display/opendj/Home"> OpenDJ documentation wiki</a>.<br><br><b>Note:</b> The upgrade tool will need to stop and start the OpenDJ server
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_UPGRADE_WELCOME_PANEL_WEBSTART_INSTRUCTIONS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_UPGRADE_WELCOME_PANEL_WEBSTART_INSTRUCTIONS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Downloading: %s%% Completed - Upgrading file: %s %% Completed.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_UPGRADING_RATIO =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_UPGRADING_RATIO",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Use Custom Values for Import (%s)
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_USE_CUSTOM_IMPORT_RUNTIME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_USE_CUSTOM_IMPORT_RUNTIME",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Use Custom Values for Server Runtime (%s)
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_USE_CUSTOM_SERVER_RUNTIME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_USE_CUSTOM_SERVER_RUNTIME",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Use an Existing Certificate:
   */
  public static final MessageDescriptor.Arg0 INFO_USE_EXISTING_CERTIFICATE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_USE_EXISTING_CERTIFICATE_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Select this if you have already a certificate you want the new server to use.
   */
  public static final MessageDescriptor.Arg0 INFO_USE_EXISTING_CERTIFICATE_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_USE_EXISTING_CERTIFICATE_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Use Default JVM Settings
   */
  public static final MessageDescriptor.Arg0 INFO_USE_JVM_DEFAULT_SETTINGS =
          new MessageDescriptor.Arg0(BASE,"INFO_USE_JVM_DEFAULT_SETTINGS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Generate Self-Signed Certificate (recommended for testing only)
   */
  public static final MessageDescriptor.Arg0 INFO_USE_SELF_SIGNED_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_USE_SELF_SIGNED_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Create a new Self-Signed Certificate to encrypt communication.
   */
  public static final MessageDescriptor.Arg0 INFO_USE_SELF_SIGNED_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_USE_SELF_SIGNED_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Downloading: %s%% Completed - Validating file: %s %% Completed.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_VALIDATING_RATIO =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_VALIDATING_RATIO",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * images/wait.gif
   */
  public static final MessageDescriptor.Arg0 INFO_WAIT =
          new MessageDescriptor.Arg0(BASE,"INFO_WAIT",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * images/wait_tiny.png
   */
  public static final MessageDescriptor.Arg0 INFO_WAIT_TINY =
          new MessageDescriptor.Arg0(BASE,"INFO_WAIT_TINY",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * images/warning_small.gif
   */
  public static final MessageDescriptor.Arg0 INFO_WARNING_ICON =
          new MessageDescriptor.Arg0(BASE,"INFO_WARNING_ICON",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Warning.
   */
  public static final MessageDescriptor.Arg0 INFO_WARNING_ICON_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_WARNING_ICON_DESCRIPTION",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Warning
   */
  public static final MessageDescriptor.Arg0 INFO_WARNING_ICON_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_WARNING_ICON_TOOLTIP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * images/warning_large.gif
   */
  public static final MessageDescriptor.Arg0 INFO_WARNING_LARGE_ICON =
          new MessageDescriptor.Arg0(BASE,"INFO_WARNING_LARGE_ICON",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The clocks of servers %s and %s have a difference superior to %s minutes.  Replication does not require clocks to be synchronized but monitoring of replication updates between servers can be difficult.
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> INFO_WARNING_SERVERS_CLOCK_DIFFERENCE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"INFO_WARNING_SERVERS_CLOCK_DIFFERENCE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Authentication:
   */
  public static final MessageDescriptor.Arg0 INFO_WEB_PROXY_DLG_AUTH_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_WEB_PROXY_DLG_AUTH_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Required by proxy
   */
  public static final MessageDescriptor.Arg0 INFO_WEB_PROXY_DLG_AUTH_REQ_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_WEB_PROXY_DLG_AUTH_REQ_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Host:
   */
  public static final MessageDescriptor.Arg0 INFO_WEB_PROXY_DLG_HOST_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_WEB_PROXY_DLG_HOST_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Password:
   */
  public static final MessageDescriptor.Arg0 INFO_WEB_PROXY_DLG_PASSWORD_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_WEB_PROXY_DLG_PASSWORD_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Port:
   */
  public static final MessageDescriptor.Arg0 INFO_WEB_PROXY_DLG_PORT_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_WEB_PROXY_DLG_PORT_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Web Proxy Configuration
   */
  public static final MessageDescriptor.Arg0 INFO_WEB_PROXY_DLG_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_WEB_PROXY_DLG_TITLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * User:
   */
  public static final MessageDescriptor.Arg0 INFO_WEB_PROXY_DLG_USER_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_WEB_PROXY_DLG_USER_LABEL",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The %s QuickSetup tool will ask you for some basic server and data configuration settings and will get your server up and running quickly.<br><br> %s requires a Java SE 6.0 or higher runtime.<br><br> Additional information on QuickSetup is available on the <a href="%s"> %s documentation site</a>.
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> INFO_WELCOME_PANEL_OFFLINE_INSTRUCTIONS =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"INFO_WELCOME_PANEL_OFFLINE_INSTRUCTIONS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Welcome
   */
  public static final MessageDescriptor.Arg0 INFO_WELCOME_PANEL_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_WELCOME_PANEL_TITLE",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * The OpenDJ QuickSetup tool will ask you for some basic server and data configuration settings and will get your server up and running quickly.<br><br>QuickSetup will install and configure the latest weekly build. You can also use QuickSetup to set up a weekly build you have downloaded manually. To run QuickSetup in this case, use the %s command at the top level of the OpenDJ directory.  This instance of QuickSetup will use the following OpenDJ build: %s (Build ID: %s) <br><br> OpenDJ requires a Java SE 6.0 or higher runtime.<br><br> Additional information on QuickSetup is available on the <a href="https://www.opends.org/wiki/page/OverviewOfTheQuickSetupTool"> OpenDS documentation wiki</a>.
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> INFO_WELCOME_PANEL_WEBSTART_INSTRUCTIONS =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"INFO_WELCOME_PANEL_WEBSTART_INSTRUCTIONS",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Welcome
   */
  public static final MessageDescriptor.Arg0 INFO_WELCOME_STEP =
          new MessageDescriptor.Arg0(BASE,"INFO_WELCOME_STEP",QUICKSETUP,INFORMATION,-1, getClassLoader());

  /**
   * Server Installation Package (.zip)
   */
  public static final MessageDescriptor.Arg0 INFO_ZIP_FILES_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_ZIP_FILES_DESCRIPTION",QUICKSETUP,INFORMATION,-1, getClassLoader());


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
    if (true)
    {
      if (org.opends.server.util.SetupUtils.isWebStart())
      {
        if (webstartClassLoader == null)
        {
          try
          {
            Class<?> c = Class.forName("org.opends.messages.QuickSetupMessages");

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
      cl = QuickSetupMessages.class.getClassLoader();
    }
    return cl;
  }
}
