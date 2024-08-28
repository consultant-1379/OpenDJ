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
public final class AdminToolMessages {

  /** Base property for resource bundle containing messages */
  private static final String BASE = "messages/admin_tool";

  private static ClassLoader webstartClassLoader;

  // Prevent instantiation.
  private AdminToolMessages() {
    // Do nothing.
  }

  /**
   * %s - Column %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_ACCESSIBLE_TABLE_CELL_NAME =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_ACCESSIBLE_TABLE_CELL_NAME",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Address:Port
   */
  public static final MessageDescriptor.Arg0 INFO_ADDRESS_PORT_COLUMN =
          new MessageDescriptor.Arg0(BASE,"INFO_ADDRESS_PORT_COLUMN",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Administrative Users:
   */
  public static final MessageDescriptor.Arg0 INFO_ADMINISTRATIVE_USERS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_ADMINISTRATIVE_USERS_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Confirm Password:
   */
  public static final MessageDescriptor.Arg0 INFO_ADMINISTRATOR_PWD_CONFIRM_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_ADMINISTRATOR_PWD_CONFIRM_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The provided passwords do not match.
   */
  public static final MessageDescriptor.Arg0 ERR_ADMINISTRATOR_PWD_DO_NOT_MATCH =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_ADMINISTRATOR_PWD_DO_NOT_MATCH",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Global Administrator Password:
   */
  public static final MessageDescriptor.Arg0 INFO_ADMINISTRATOR_PWD_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_ADMINISTRATOR_PWD_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Global Administrator User ID
   */
  public static final MessageDescriptor.Arg0 INFO_ADMINISTRATOR_UID_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_ADMINISTRATOR_UID_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Administration Connector
   */
  public static final MessageDescriptor.Arg0 INFO_ADMIN_LISTENER_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_ADMIN_LISTENER_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Age of Oldest Missing Change
   */
  public static final MessageDescriptor.Arg0 INFO_AGE_OF_OLDEST_MISSING_CHANGE_COLUMN =
          new MessageDescriptor.Arg0(BASE,"INFO_AGE_OF_OLDEST_MISSING_CHANGE_COLUMN",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The following base DN's are not replicated:%n%s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ALREADY_NOT_REPLICATED_SUFFIXES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ALREADY_NOT_REPLICATED_SUFFIXES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The following base DN's are already replicated between the two servers:%n%s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ALREADY_REPLICATED_SUFFIXES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ALREADY_REPLICATED_SUFFIXES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The selected attributes are superior of the following attributes: %s.  If you continue, these attributes will be updated with a new superior.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ATTRIBUTES_ARE_SUPERIOR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ATTRIBUTES_ARE_SUPERIOR",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The selected attributes are optional or required by the following object classes: %s.  If you continue, the definition of the object classes will be modified.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ATTRIBUTES_WITH_DEPENDENCIES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ATTRIBUTES_WITH_DEPENDENCIES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Attribute '%s' is superior of the following attributes: %s.  If you continue, these attributes will be updated with a new superior.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_ATTRIBUTE_IS_SUPERIOR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_ATTRIBUTE_IS_SUPERIOR",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Attribute '%s' is optional or required by the following object classes: %s.  If you continue, the definition of the object classes will be modified.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_ATTRIBUTE_WITH_DEPENDENCIES =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_ATTRIBUTE_WITH_DEPENDENCIES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Authenticate
   */
  public static final MessageDescriptor.Arg0 INFO_AUTHENTICATE_BUTTON_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_AUTHENTICATE_BUTTON_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Authenticate as an administrative user to view all monitoring information
   */
  public static final MessageDescriptor.Arg0 INFO_AUTHENTICATE_CONTROL_PANEL_BUTTON_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_AUTHENTICATE_CONTROL_PANEL_BUTTON_TOOLTIP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The available defined tasks are:%s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_AVAILABLE_DEFINED_TASKS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_AVAILABLE_DEFINED_TASKS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Backend ID
   */
  public static final MessageDescriptor.Arg0 INFO_BACKENDID_COLUMN =
          new MessageDescriptor.Arg0(BASE,"INFO_BACKENDID_COLUMN",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * There is already an existing backend with name: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_BACKEND_ALREADY_EXISTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_BACKEND_ALREADY_EXISTS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Base DN
   */
  public static final MessageDescriptor.Arg0 INFO_BASEDN_COLUMN =
          new MessageDescriptor.Arg0(BASE,"INFO_BASEDN_COLUMN",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Disabled
   */
  public static final MessageDescriptor.Arg0 INFO_BASEDN_NOT_REPLICATED_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_BASEDN_NOT_REPLICATED_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Enabled
   */
  public static final MessageDescriptor.Arg0 INFO_BASEDN_REPLICATED_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_BASEDN_REPLICATED_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The base DN '%s' is already defined.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_BASE_DN_ALREADY_EXISTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_BASE_DN_ALREADY_EXISTS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The backend already contains another base DN that is within the same hierarchical path (%s is an ancestor of the provided base DN).
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_BASE_DN_ANCESTOR_EXISTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_BASE_DN_ANCESTOR_EXISTS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The backend already contains another base DN that is within the same hierarchical path (%s is a descendant of the provided base DN).
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_BASE_DN_DN_IS_ANCESTOR_OF =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_BASE_DN_DN_IS_ANCESTOR_OF",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Cancel Uninstall
   */
  public static final MessageDescriptor.Arg0 INFO_CANCEL_BUTTON_UNINSTALL_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_CANCEL_BUTTON_UNINSTALL_TOOLTIP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Could not connect to the Directory Server with the provided credentials.  The possible causes for this are:%n%s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CANNOT_CONNECT_TO_LOGIN_WITH_CAUSE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CANNOT_CONNECT_TO_LOGIN_WITH_CAUSE",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Could not connect to server '%s' on port '%s'.  Verify that the provided information is valid and that the server is running.  Details: %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CANNOT_CONNECT_TO_REMOTE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_CANNOT_CONNECT_TO_REMOTE",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Cannot modify the objectclass and rename the entry.
   */
  public static final MessageDescriptor.Arg0 ERR_CANNOT_MODIFY_OBJECTCLASS_AND_RENAME =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CANNOT_MODIFY_OBJECTCLASS_AND_RENAME",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Do you want to continue?
   */
  public static final MessageDescriptor.Arg0 INFO_CLI_DO_YOU_WANT_TO_CONTINUE =
          new MessageDescriptor.Arg0(BASE,"INFO_CLI_DO_YOU_WANT_TO_CONTINUE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Invalid response
   */
  public static final MessageDescriptor.Arg0 INFO_CLI_INVALID_RESPONSE =
          new MessageDescriptor.Arg0(BASE,"INFO_CLI_INVALID_RESPONSE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Enter a number or press Enter to accept the default
   */
  public static final MessageDescriptor.Arg0 INFO_CLI_NUMBER_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_CLI_NUMBER_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Remove Backup Files Contained in bak Directory?
   */
  public static final MessageDescriptor.Arg0 INFO_CLI_UNINSTALL_CONFIRM_BACKUPS =
          new MessageDescriptor.Arg0(BASE,"INFO_CLI_UNINSTALL_CONFIRM_BACKUPS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Remove Configuration and Schema Files?
   */
  public static final MessageDescriptor.Arg0 INFO_CLI_UNINSTALL_CONFIRM_CONFIGURATION_SCHEMA =
          new MessageDescriptor.Arg0(BASE,"INFO_CLI_UNINSTALL_CONFIRM_CONFIGURATION_SCHEMA",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Remove Database Contents?
   */
  public static final MessageDescriptor.Arg0 INFO_CLI_UNINSTALL_CONFIRM_DATABASES =
          new MessageDescriptor.Arg0(BASE,"INFO_CLI_UNINSTALL_CONFIRM_DATABASES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The files will be permanently deleted, are you sure you want to continue?
   */
  public static final MessageDescriptor.Arg0 INFO_CLI_UNINSTALL_CONFIRM_DELETE_FILES =
          new MessageDescriptor.Arg0(BASE,"INFO_CLI_UNINSTALL_CONFIRM_DELETE_FILES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Remove LDIF Export Files Contained in ldif Directory?
   */
  public static final MessageDescriptor.Arg0 INFO_CLI_UNINSTALL_CONFIRM_LDIFS =
          new MessageDescriptor.Arg0(BASE,"INFO_CLI_UNINSTALL_CONFIRM_LDIFS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Remove Server Libraries and Administrative Tools?
   */
  public static final MessageDescriptor.Arg0 INFO_CLI_UNINSTALL_CONFIRM_LIBRARIES_BINARIES =
          new MessageDescriptor.Arg0(BASE,"INFO_CLI_UNINSTALL_CONFIRM_LIBRARIES_BINARIES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Remove Log Files?
   */
  public static final MessageDescriptor.Arg0 INFO_CLI_UNINSTALL_CONFIRM_LOGS =
          new MessageDescriptor.Arg0(BASE,"INFO_CLI_UNINSTALL_CONFIRM_LOGS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The Directory Server contains database files in the following locations outside the server path:%n%s%nRemove these files?
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CLI_UNINSTALL_CONFIRM_OUTSIDEDBS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CLI_UNINSTALL_CONFIRM_OUTSIDEDBS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The Directory Server contains log files in the following locations outside the server path:%n%s%nRemove these files?
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CLI_UNINSTALL_CONFIRM_OUTSIDELOGS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CLI_UNINSTALL_CONFIRM_OUTSIDELOGS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The server is currently running and must be stopped before uninstallation can continue.%nStop the Server and permanently delete the files?
   */
  public static final MessageDescriptor.Arg0 INFO_CLI_UNINSTALL_CONFIRM_STOP =
          new MessageDescriptor.Arg0(BASE,"INFO_CLI_UNINSTALL_CONFIRM_STOP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * This server is configured to do replication.%nIf the server is actually replicating contents with other servers you must provide administrator authentication to remove references to this server in the replicating servers.%n%nType 'Yes' to provide authentication to remove the remote references.%nType 'No' to continue the uninstall without updating remote references.%nProvide authentication?
   */
  public static final MessageDescriptor.Arg0 INFO_CLI_UNINSTALL_CONFIRM_UPDATE_REMOTE =
          new MessageDescriptor.Arg0(BASE,"INFO_CLI_UNINSTALL_CONFIRM_UPDATE_REMOTE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * This server is configured to do replication.%nIf the server is actually replicating contents with other servers it must be started and you must provide administrator authentication to remove references to this server in the replicating servers.%n%nType 'Yes' to start the server and then provide authentication to remove the remote references.%nType 'No' to continue the uninstall without updating remote references.%nStart the server and provide authentication?
   */
  public static final MessageDescriptor.Arg0 INFO_CLI_UNINSTALL_CONFIRM_UPDATE_REMOTE_AND_START =
          new MessageDescriptor.Arg0(BASE,"INFO_CLI_UNINSTALL_CONFIRM_UPDATE_REMOTE_AND_START",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * You must select something to be uninstalled.
   */
  public static final MessageDescriptor.Arg0 ERR_CLI_UNINSTALL_NOTHING_TO_BE_UNINSTALLED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CLI_UNINSTALL_NOTHING_TO_BE_UNINSTALLED",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * You must select the elements to uninstall.  Use the options described in the usage to specify what must be uninstalled.
   */
  public static final MessageDescriptor.Arg0 ERR_CLI_UNINSTALL_NOTHING_TO_BE_UNINSTALLED_NON_INTERACTIVE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CLI_UNINSTALL_NOTHING_TO_BE_UNINSTALLED_NON_INTERACTIVE",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * Remove all components
   */
  public static final MessageDescriptor.Arg0 INFO_CLI_UNINSTALL_REMOVE_ALL =
          new MessageDescriptor.Arg0(BASE,"INFO_CLI_UNINSTALL_REMOVE_ALL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The Server is Stopped.
   */
  public static final MessageDescriptor.Arg0 INFO_CLI_UNINSTALL_SERVER_STOPPED =
          new MessageDescriptor.Arg0(BASE,"INFO_CLI_UNINSTALL_SERVER_STOPPED",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Select the components to be removed
   */
  public static final MessageDescriptor.Arg0 INFO_CLI_UNINSTALL_SPECIFY_WHAT_REMOVE =
          new MessageDescriptor.Arg0(BASE,"INFO_CLI_UNINSTALL_SPECIFY_WHAT_REMOVE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Do you want to remove all components of the server or select the components to remove?
   */
  public static final MessageDescriptor.Arg0 INFO_CLI_UNINSTALL_WHAT_TO_DELETE =
          new MessageDescriptor.Arg0(BASE,"INFO_CLI_UNINSTALL_WHAT_TO_DELETE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * View Details
   */
  public static final MessageDescriptor.Arg0 INFO_CLI_VIEW_DETAILS =
          new MessageDescriptor.Arg0(BASE,"INFO_CLI_VIEW_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Close Uninstall Window
   */
  public static final MessageDescriptor.Arg0 INFO_CLOSE_BUTTON_UNINSTALL_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_CLOSE_BUTTON_UNINSTALL_TOOLTIP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Email addresses to send the completion notification to [continue]:
   */
  public static final MessageDescriptor.Arg0 INFO_COMPLETION_NOTIFICATION_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_COMPLETION_NOTIFICATION_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The Uninstall has not yet completed.%nAre you sure you want to close the Uninstall Window?
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIRM_CLOSE_UNINSTALL_MSG =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIRM_CLOSE_UNINSTALL_MSG",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Confirmation Required
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIRM_CLOSE_UNINSTALL_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIRM_CLOSE_UNINSTALL_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Are you sure you want to Restart the Directory Server?
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIRM_RESTART_MESSAGE =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIRM_RESTART_MESSAGE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Confirmation Required
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIRM_RESTART_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIRM_RESTART_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Are you sure you want to Stop the Directory Server?
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIRM_STOP_MESSAGE =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIRM_STOP_MESSAGE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Confirmation Required
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIRM_STOP_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIRM_STOP_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The Uninstall tool will remove all parts of the server you have selected below from your system. If all are selected, the server will be removed entirely.
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIRM_UNINSTALL_PANEL_INSTRUCTIONS =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIRM_UNINSTALL_PANEL_INSTRUCTIONS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Uninstall Options
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIRM_UNINSTALL_PANEL_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIRM_UNINSTALL_PANEL_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * This server is configured to do replication.%nIf the server is actually replicating contents with other servers it must be started and then you must provide administrator authentication to remove references to this server in the replicating servers.%n%nClick on 'Yes' to start the server and then provide authentication to remove the remote references.%nClick on 'No' to continue the uninstall without updating remote references.
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIRM_UNINSTALL_REPLICATION_SERVER_NOT_RUNNING_MSG =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIRM_UNINSTALL_REPLICATION_SERVER_NOT_RUNNING_MSG",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Confirmation Required
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIRM_UNINSTALL_REPLICATION_SERVER_NOT_RUNNING_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIRM_UNINSTALL_REPLICATION_SERVER_NOT_RUNNING_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * This server is configured to do replication.%nIf the server is actually replicating contents with other servers you must provide administrator authentication to remove references to this server in the replicating servers.%n%nClick on 'Yes' to provide authentication to remove the remote references.%nClick on 'No' to continue the uninstall without updating remote references.
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIRM_UNINSTALL_REPLICATION_SERVER_RUNNING_MSG =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIRM_UNINSTALL_REPLICATION_SERVER_RUNNING_MSG",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Confirmation Required
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIRM_UNINSTALL_REPLICATION_SERVER_RUNNING_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIRM_UNINSTALL_REPLICATION_SERVER_RUNNING_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Confirm Uninstall%nAll selected files will be permanently deleted, are you sure you want to continue?
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIRM_UNINSTALL_SERVER_NOT_RUNNING_MSG =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIRM_UNINSTALL_SERVER_NOT_RUNNING_MSG",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Confirm Uninstall
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIRM_UNINSTALL_SERVER_NOT_RUNNING_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIRM_UNINSTALL_SERVER_NOT_RUNNING_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Server is Running%nThe server is currently running and must be stopped before uninstallation can continue. Do you want the uninstaller to stop the server for you and continue with the uninstall? If you click No, you will need to stop the server manually to continue.
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIRM_UNINSTALL_SERVER_RUNNING_MSG =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIRM_UNINSTALL_SERVER_RUNNING_MSG",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Server is Running
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIRM_UNINSTALL_SERVER_RUNNING_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIRM_UNINSTALL_SERVER_RUNNING_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Open Connections:
   */
  public static final MessageDescriptor.Arg0 INFO_CONNECTIONS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CONNECTIONS_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Could not launch Control Panel.  Check that you have access to the display.
   */
  public static final MessageDescriptor.Arg0 ERR_CONTROL_PANEL_LAUNCHER_GUI_LAUNCH_FAILED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CONTROL_PANEL_LAUNCHER_GUI_LAUNCH_FAILED",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * Could not launch Control Panel.  Check that you have access to the display.   Check file %s for details.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONTROL_PANEL_LAUNCHER_GUI_LAUNCH_FAILED_DETAILS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONTROL_PANEL_LAUNCHER_GUI_LAUNCH_FAILED_DETAILS",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * This utility can be used to display the Control Panel window which displays basic server information and allows to do some basic administration tasks on the server.%n%nIf no host name or port is provided, the tool will try to connect to the local server.
   */
  public static final MessageDescriptor.Arg0 INFO_CONTROL_PANEL_LAUNCHER_USAGE_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_CONTROL_PANEL_LAUNCHER_USAGE_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * %s Control Panel
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CONTROL_PANEL_TITLE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CONTROL_PANEL_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Error reading the configuration file.%nThis could be caused because there is not an enabled LDAP port for the specified connection parameters or because you do not have read rights on the configuration file.
   */
  public static final MessageDescriptor.Arg0 ERR_COULD_NOT_FIND_VALID_LDAPURL =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_COULD_NOT_FIND_VALID_LDAPURL",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Auxiliary objectclasses: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_AUXILIARY_OBJECTCLASS_DESCRIPTOR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_AUXILIARY_OBJECTCLASS_DESCRIPTOR",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Number of Entries: %d
   */
  public static final MessageDescriptor.Arg1<Number> INFO_CTRL_BROWSER_NUMBER_OF_ENTRIES =
          new MessageDescriptor.Arg1<Number>(BASE,"INFO_CTRL_BROWSER_NUMBER_OF_ENTRIES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * New Domain
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_NEW_DOMAIN_PANEL_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_NEW_DOMAIN_PANEL_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * New Organization
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_NEW_ORGANIZATION_PANEL_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_NEW_ORGANIZATION_PANEL_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Objectclass: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_OBJECTCLASS_DESCRIPTOR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_OBJECTCLASS_DESCRIPTOR",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Backup...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ACTION_BACKUP =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ACTION_BACKUP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Export LDIF...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ACTION_EXPORT_LDIF =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ACTION_EXPORT_LDIF",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Import LDIF...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ACTION_IMPORT_LDIF =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ACTION_IMPORT_LDIF",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Java Settings
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ACTION_JAVA_SETTINGS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ACTION_JAVA_SETTINGS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Action:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ACTION_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ACTION_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Manage Entries
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ACTION_MANAGE_ENTRIES =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ACTION_MANAGE_ENTRIES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Manage Indexes
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ACTION_MANAGE_INDEXES =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ACTION_MANAGE_INDEXES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Manage Schema
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ACTION_MANAGE_SCHEMA =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ACTION_MANAGE_SCHEMA",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * New Base DN...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ACTION_NEW_BASEDN =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ACTION_NEW_BASEDN",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Rebuild Indexes...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ACTION_REBUILD_INDEXES =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ACTION_REBUILD_INDEXES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Restore...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ACTION_RESTORE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ACTION_RESTORE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Verify Indexes...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ACTION_VERIFY_INDEXES =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ACTION_VERIFY_INDEXES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Windows Service
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ACTION_WINDOWS_SERVICE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ACTION_WINDOWS_SERVICE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Updating group '%s'
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_ADDING_TO_GROUP =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_ADDING_TO_GROUP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * An error occurred adding to groups.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_ADDING_TO_GROUP_ERROR_DETAILS =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_ADDING_TO_GROUP_ERROR_DETAILS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Error adding to groups
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_ADDING_TO_GROUP_ERROR_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_ADDING_TO_GROUP_ERROR_SUMMARY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The entries were successfully added.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ADDING_TO_GROUP_SUCCESSFUL_DETAILS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ADDING_TO_GROUP_SUCCESSFUL_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Entries added to groups
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ADDING_TO_GROUP_SUCCESSFUL_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ADDING_TO_GROUP_SUCCESSFUL_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Adding to Group...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ADDING_TO_GROUP_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ADDING_TO_GROUP_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Add All >
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ADDREMOVE_ADD_ALL_BUTTON =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ADDREMOVE_ADD_ALL_BUTTON",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Add >
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ADDREMOVE_ADD_BUTTON =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ADDREMOVE_ADD_BUTTON",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Available Attributes:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ADDREMOVE_AVAILABLE_ATTRIBUTES =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ADDREMOVE_AVAILABLE_ATTRIBUTES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Available Object Classes:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ADDREMOVE_AVAILABLE_OBJECTCLASSES =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ADDREMOVE_AVAILABLE_OBJECTCLASSES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Optional Attributes:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ADDREMOVE_OPTIONAL_ATTRIBUTES =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ADDREMOVE_OPTIONAL_ATTRIBUTES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * < Remove All
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ADDREMOVE_REMOVE_ALL_BUTTON =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ADDREMOVE_REMOVE_ALL_BUTTON",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * < Remove
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ADDREMOVE_REMOVE_BUTTON =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ADDREMOVE_REMOVE_BUTTON",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Required Attributes:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ADDREMOVE_REQUIRED_ATTRIBUTES =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ADDREMOVE_REQUIRED_ATTRIBUTES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Selected Object Classes:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ADDREMOVE_SELECTED_OBJECTCLASSES =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ADDREMOVE_SELECTED_OBJECTCLASSES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Add Groups...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ADD_GROUPS_BUTTON_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ADD_GROUPS_BUTTON_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Add Members...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ADD_MEMBERS_BUTTON =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ADD_MEMBERS_BUTTON",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Add Members
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ADD_MEMBERS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ADD_MEMBERS_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Add Requests
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ADD_REQUESTS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ADD_REQUESTS_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Add Responses
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ADD_RESPONSES_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ADD_RESPONSES_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Entries to be added:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ADD_TO_GROUP_ENTRIES_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ADD_TO_GROUP_ENTRIES_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Groups:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ADD_TO_GROUP_GROUPS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ADD_TO_GROUP_GROUPS_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Add to Group...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ADD_TO_GROUP_MENU =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ADD_TO_GROUP_MENU",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Add entries to groups.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ADD_TO_GROUP_TASK_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ADD_TO_GROUP_TASK_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Add to Group
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ADD_TO_GROUP_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ADD_TO_GROUP_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * %d - Administration Connector
   */
  public static final MessageDescriptor.Arg1<Number> INFO_CTRL_PANEL_ADMINISTRATION_CONNECTOR_NAME =
          new MessageDescriptor.Arg1<Number>(BASE,"INFO_CTRL_PANEL_ADMINISTRATION_CONNECTOR_NAME",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Administration Guide
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ADMINISTRATION_GUIDE_MENU =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ADMINISTRATION_GUIDE_MENU",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Administration Port:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ADMINISTRATION_PORT =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ADMINISTRATION_PORT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Administrative Users:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ADMINISTRATIVE_USERS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ADMINISTRATIVE_USERS_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Port %d (LDAPS)
   */
  public static final MessageDescriptor.Arg1<Number> INFO_CTRL_PANEL_ADMIN_CONNECTOR_DESCRIPTION =
          new MessageDescriptor.Arg1<Number>(BASE,"INFO_CTRL_PANEL_ADMIN_CONNECTOR_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Administration Connector:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ADMIN_CONNECTOR_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ADMIN_CONNECTOR_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The provided alias '%s' already exists in the schema (defined as %s).
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CTRL_PANEL_ALIAS_ALREADY_IN_USE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_ALIAS_ALREADY_IN_USE",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Allowed By:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ALLOWED_BY_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ALLOWED_BY_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * All Base DN's
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ALL_BASE_DNS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ALL_BASE_DNS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * All
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ALL_CONNECTION_HANDLERS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ALL_CONNECTION_HANDLERS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Apply
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_APPLY_BUTTON_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_APPLY_BUTTON_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Approximate
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_APPROXIMATE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_APPROXIMATE_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * April
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_APRIL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_APRIL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Attributes
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ATTRIBUTES_CATEGORY_NODE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ATTRIBUTES_CATEGORY_NODE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Attributes to Exclude:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ATTRIBUTES_TO_EXCLUDE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ATTRIBUTES_TO_EXCLUDE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Attributes to Include:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ATTRIBUTES_TO_INCLUDE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ATTRIBUTES_TO_INCLUDE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Aliases:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ATTRIBUTE_ALIASES_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ATTRIBUTE_ALIASES_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Approximate Matching Rule:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ATTRIBUTE_APPROXIMATE_MATCHING_RULE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ATTRIBUTE_APPROXIMATE_MATCHING_RULE_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * An attribute cannot be its own superior.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_ATTRIBUTE_CANNOT_BE_ITS_SUPERIOR =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_ATTRIBUTE_CANNOT_BE_ITS_SUPERIOR",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Collective
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ATTRIBUTE_COLLECTIVE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ATTRIBUTE_COLLECTIVE_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Description:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ATTRIBUTE_DESCRIPTION_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ATTRIBUTE_DESCRIPTION_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Attribute Details
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ATTRIBUTE_DETAILS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ATTRIBUTE_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Equality Matching Rule:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ATTRIBUTE_EQUALITY_MATCHING_RULE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ATTRIBUTE_EQUALITY_MATCHING_RULE_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * File:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ATTRIBUTE_FILE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ATTRIBUTE_FILE_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Attribute Indexes
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ATTRIBUTE_INDEXES =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ATTRIBUTE_INDEXES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The attribute is superior (directly or indirectly) of '%s'.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_ATTRIBUTE_IS_SUPERIOR_OF_SUPERIOR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_ATTRIBUTE_IS_SUPERIOR_OF_SUPERIOR",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Attribute:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ATTRIBUTE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ATTRIBUTE_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Multivalued
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ATTRIBUTE_MULTI_VALUED_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ATTRIBUTE_MULTI_VALUED_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The provided name '%s' already exists in the schema (defined as %s).
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CTRL_PANEL_ATTRIBUTE_NAME_ALREADY_IN_USE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_ATTRIBUTE_NAME_ALREADY_IN_USE",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Name:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ATTRIBUTE_NAME_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ATTRIBUTE_NAME_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * You must provide a name for the attribute.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_ATTRIBUTE_NAME_REQUIRED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_ATTRIBUTE_NAME_REQUIRED",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Non Modifiable
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ATTRIBUTE_NON_MODIFIABLE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ATTRIBUTE_NON_MODIFIABLE_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Obsolete
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ATTRIBUTE_OBSOLETE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ATTRIBUTE_OBSOLETE_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * OID:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ATTRIBUTE_OID_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ATTRIBUTE_OID_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Operational
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ATTRIBUTE_OPERATIONAL_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ATTRIBUTE_OPERATIONAL_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Ordering Matching Rule:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ATTRIBUTE_ORDERING_MATCHING_RULE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ATTRIBUTE_ORDERING_MATCHING_RULE_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Origin:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ATTRIBUTE_ORIGIN_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ATTRIBUTE_ORIGIN_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Superior:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ATTRIBUTE_PARENT_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ATTRIBUTE_PARENT_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * You must provide a value for attribute %s.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_ATTRIBUTE_REQUIRED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_ATTRIBUTE_REQUIRED",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Single Valued
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ATTRIBUTE_SINGLE_VALUED_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ATTRIBUTE_SINGLE_VALUED_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Substring Matching Rule:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ATTRIBUTE_SUBSTRING_MATCHING_RULE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ATTRIBUTE_SUBSTRING_MATCHING_RULE_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Attribute Syntaxes
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ATTRIBUTE_SYNTAXES_CATEGORY_NODE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ATTRIBUTE_SYNTAXES_CATEGORY_NODE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Description:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ATTRIBUTE_SYNTAX_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ATTRIBUTE_SYNTAX_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Attribute Syntax Details
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ATTRIBUTE_SYNTAX_DETAILS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ATTRIBUTE_SYNTAX_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Syntax:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ATTRIBUTE_SYNTAX_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ATTRIBUTE_SYNTAX_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Name:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ATTRIBUTE_SYNTAX_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ATTRIBUTE_SYNTAX_NAME",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * OID:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ATTRIBUTE_SYNTAX_OID =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ATTRIBUTE_SYNTAX_OID",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Attribute Syntax
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ATTRIBUTE_SYNTAX_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ATTRIBUTE_SYNTAX_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Type:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ATTRIBUTE_TYPE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ATTRIBUTE_TYPE_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Attribute Type Options
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ATTRIBUTE_TYPE_OPTIONS_EXPANDER =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ATTRIBUTE_TYPE_OPTIONS_EXPANDER",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Usage:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ATTRIBUTE_USAGE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ATTRIBUTE_USAGE_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * %s (operational)
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_ATTRIBUTE_USAGE_OPERATIONAL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_ATTRIBUTE_USAGE_OPERATIONAL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Attribute View
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ATTRIBUTE_VIEW_MENU =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ATTRIBUTE_VIEW_MENU",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Attribute View Options
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ATTRIBUTE_VIEW_OPTIONS_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ATTRIBUTE_VIEW_OPTIONS_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * August
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_AUGUST =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_AUGUST",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Authenticated as '%s'
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_AUTHENTICATED_AS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_AUTHENTICATED_AS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The server is running.  You must provide authentication to delete the attribute.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_AUTHENTICATION_REQUIRED_FOR_ATTRIBUTE_DELETE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_AUTHENTICATION_REQUIRED_FOR_ATTRIBUTE_DELETE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The server is running.  You must provide authentication to delete a backend.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_AUTHENTICATION_REQUIRED_FOR_BACKEND_DELETE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_AUTHENTICATION_REQUIRED_FOR_BACKEND_DELETE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The server is running.  You must provide authentication to perform the backup.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_AUTHENTICATION_REQUIRED_FOR_BACKUP =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_AUTHENTICATION_REQUIRED_FOR_BACKUP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The server is running.  You must provide authentication to delete a base DN.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_AUTHENTICATION_REQUIRED_FOR_BASE_DN_DELETE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_AUTHENTICATION_REQUIRED_FOR_BASE_DN_DELETE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The server is running.  You must provide authentication to create a new base DN.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_AUTHENTICATION_REQUIRED_FOR_CREATE_BASE_DN =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_AUTHENTICATION_REQUIRED_FOR_CREATE_BASE_DN",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The server is running.  You must provide authentication to disable the backend before rebuilding the indexes.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_AUTHENTICATION_REQUIRED_FOR_DISABLE_BACKEND =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_AUTHENTICATION_REQUIRED_FOR_DISABLE_BACKEND",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The server is running.  You must provide authentication to perform the export.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_AUTHENTICATION_REQUIRED_FOR_EXPORT =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_AUTHENTICATION_REQUIRED_FOR_EXPORT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The server is running.  You must provide authentication to perform the import.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_AUTHENTICATION_REQUIRED_FOR_IMPORT =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_AUTHENTICATION_REQUIRED_FOR_IMPORT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The server is running.  You must provide authentication to edit the index.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_AUTHENTICATION_REQUIRED_FOR_INDEX_EDITING =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_AUTHENTICATION_REQUIRED_FOR_INDEX_EDITING",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The server is running.  You must provide authentication to create an index.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_AUTHENTICATION_REQUIRED_FOR_NEW_INDEX =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_AUTHENTICATION_REQUIRED_FOR_NEW_INDEX",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The server is running.  You must provide authentication to create a VLV index.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_AUTHENTICATION_REQUIRED_FOR_NEW_VLV =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_AUTHENTICATION_REQUIRED_FOR_NEW_VLV",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The server is running.  You must provide authentication to edit the object class.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_AUTHENTICATION_REQUIRED_FOR_OBJECTCLASS_EDIT =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_AUTHENTICATION_REQUIRED_FOR_OBJECTCLASS_EDIT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The server is running.  You must provide authentication to restore from backup.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_AUTHENTICATION_REQUIRED_FOR_RESTORE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_AUTHENTICATION_REQUIRED_FOR_RESTORE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The server is running.  You must provide authentication to edit the VLV index.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_AUTHENTICATION_REQUIRED_FOR_VLV_INDEX_EDITING =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_AUTHENTICATION_REQUIRED_FOR_VLV_INDEX_EDITING",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Authentication Required
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_AUTHENTICATION_REQUIRED_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_AUTHENTICATION_REQUIRED_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The server is running.  You must provide authentication to browse data.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_AUTHENTICATION_REQUIRED_TO_BROWSE_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_AUTHENTICATION_REQUIRED_TO_BROWSE_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The server is running.  You must provide authentication to create an attribute in the schema.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_AUTHENTICATION_REQUIRED_TO_CREATE_ATTRIBUTE_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_AUTHENTICATION_REQUIRED_TO_CREATE_ATTRIBUTE_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The server is running.  You must provide authentication to create an attribute in the schema.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_AUTHENTICATION_REQUIRED_TO_CREATE_OBJECTCLASS_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_AUTHENTICATION_REQUIRED_TO_CREATE_OBJECTCLASS_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * To browse data the server must be running and you must provide authentication.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_AUTHENTICATION_SERVER_MUST_RUN_TO_BROWSE_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_AUTHENTICATION_SERVER_MUST_RUN_TO_BROWSE_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Auth Password
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_AUTHPASSWORD_FRIENDLY_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_AUTHPASSWORD_FRIENDLY_NAME",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The server is running.  You must provide authentication to see the monitoring data.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_AUTH_REQUIRED_TO_BROWSE_MONITORING_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_AUTH_REQUIRED_TO_BROWSE_MONITORING_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The server is running.  You must provide authentication to see the monitoring data.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_AUTH_REQUIRED_TO_SEE_TRAFFIC_MONITORING_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_AUTH_REQUIRED_TO_SEE_TRAFFIC_MONITORING_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Auxiliary Object Classes:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_AUXILIARY_OBJECTCLASS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_AUXILIARY_OBJECTCLASS_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Available Backups:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_AVAILABLE_BACKUPS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_AVAILABLE_BACKUPS_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Available CPUs
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_AVAILABLE_CPUS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_AVAILABLE_CPUS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Available Indexes:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_AVAILABLE_INDEXES_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_AVAILABLE_INDEXES_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Available:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_AVAILABLE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_AVAILABLE_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Available Parent Backups:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_AVAILABLE_PARENT_BACKUPS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_AVAILABLE_PARENT_BACKUPS_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * %s Avg per second
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_AVERAGE_HEADER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_AVERAGE_HEADER",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Average Request Backlog
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_AVERAGE_REQUEST_BACKLOG =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_AVERAGE_REQUEST_BACKLOG",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Backend Indexes
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_BACKEND_INDEXES_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_BACKEND_INDEXES_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Backend:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_BACKEND_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_BACKEND_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The backend '%s' could not be found.  Check main panel for more information.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_BACKEND_NOT_FOUND_DETAILS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_BACKEND_NOT_FOUND_DETAILS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Could not find backend
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_BACKEND_NOT_FOUND_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_BACKEND_NOT_FOUND_SUMMARY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Backend VLV Indexes
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_BACKEND_VLV_INDEXES_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_BACKEND_VLV_INDEXES_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * All Backends
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_BACKUP_ALL_BACKENDS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_BACKUP_ALL_BACKENDS_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * A backup with ID '%s' is already defined under '%s'.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CTRL_PANEL_BACKUP_ID_ALREADY_EXIST =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_BACKUP_ID_ALREADY_EXIST",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Backup ID:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_BACKUP_ID_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_BACKUP_ID_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Backup Options:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_BACKUP_OPTIONS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_BACKUP_OPTIONS_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The backup path '%s' does not exist.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_BACKUP_PATH_DOES_NOT_EXIST =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_BACKUP_PATH_DOES_NOT_EXIST",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The file '%s' exists.  You must provide a directory to do the new backup.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_BACKUP_PATH_EXISTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_BACKUP_PATH_EXISTS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The backup path '%s" exists and is a file.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_BACKUP_PATH_IS_A_FILE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_BACKUP_PATH_IS_A_FILE",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Backup Path:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_BACKUP_PATH_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_BACKUP_PATH_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Backup contents of  '%s' to directory '%s'.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_CTRL_PANEL_BACKUP_TASK_DESCRIPTION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_CTRL_PANEL_BACKUP_TASK_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Backup
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_BACKUP_TASK_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_BACKUP_TASK_NAME",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Run Backup
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_BACKUP_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_BACKUP_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Backup Type:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_BACKUP_TYPE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_BACKUP_TYPE_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * For example: dc=example,dc=com
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_BASE_DN_EXAMPLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_BASE_DN_EXAMPLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Base DN:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_BASE_DN_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_BASE_DN_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * - Binary Value -
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_BINARY_VALUE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_BINARY_VALUE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Bind DN:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_BIND_DN_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_BIND_DN_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Password:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_BIND_PASSWORD_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_BIND_PASSWORD_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Bind Requests
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_BIND_REQUESTS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_BIND_REQUESTS_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Bind Responses
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_BIND_RESPONSES_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_BIND_RESPONSES_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Browse...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_BROWSE_BUTTON_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_BROWSE_BUTTON_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * General Information
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_BROWSE_GENERAL_MONITORING =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_BROWSE_GENERAL_MONITORING",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The tasks were successfully canceled.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CANCELING_TASK_COMPLETE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CANCELING_TASK_COMPLETE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * An error occurred canceling the selected tasks.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_CANCELING_TASK_ERROR_DETAILS =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_CANCELING_TASK_ERROR_DETAILS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Error canceling task
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_CANCELING_TASK_ERROR_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_CANCELING_TASK_ERROR_SUMMARY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The tasks were successfully canceled.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CANCELING_TASK_SUCCESSFUL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CANCELING_TASK_SUCCESSFUL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Canceling Tasks...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CANCELING_TASK_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CANCELING_TASK_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Cancel
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CANCEL_BUTTON_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CANCEL_BUTTON_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Cancel Task
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CANCEL_TASK_BUTTON_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CANCEL_TASK_BUTTON_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Cancel Selected Tasks.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CANCEL_TASK_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CANCEL_TASK_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Are you sure you want to cancel the selected tasks?
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CANCEL_TASK_MSG =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CANCEL_TASK_MSG",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Cancel Tasks
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CANCEL_TASK_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CANCEL_TASK_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The remote server '%s' might be down or the provided authentication is no longer valid.  To be able to manage a server remotely it must be running and you must provide authentication.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_CANNOT_CONNECT_TO_REMOTE_DETAILS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_CANNOT_CONNECT_TO_REMOTE_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Could not connect to remote server
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CANNOT_CONNECT_TO_REMOTE_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CANNOT_CONNECT_TO_REMOTE_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Cannot read file '%s'.  Check that you have read rights to it.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_CANNOT_READ_FILE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_CANNOT_READ_FILE",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Directory Data
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CATEGORY_DIRECTORY_DATA =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CATEGORY_DIRECTORY_DATA",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Indexes
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CATEGORY_INDEXES =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CATEGORY_INDEXES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Category Item Selected
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CATEGORY_ITEM_SELECTED =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CATEGORY_ITEM_SELECTED",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Monitoring
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CATEGORY_MONITORING =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CATEGORY_MONITORING",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Runtime Options
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CATEGORY_RUNTIME_OPTIONS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CATEGORY_RUNTIME_OPTIONS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Schema
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CATEGORY_SCHEMA =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CATEGORY_SCHEMA",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Change...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CHANGE_SCHEDULE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CHANGE_SCHEDULE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Checking provided Java options...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CHECKING_JAVA_OPTIONS_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CHECKING_JAVA_OPTIONS_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Checking...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CHECKING_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CHECKING_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Check Syntax
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CHECK_SYNTAX_BUTTON =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CHECK_SYNTAX_BUTTON",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Child Class
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CHILD_CLASS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CHILD_CLASS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Choose Entries
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CHOOSE_ENTRIES =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CHOOSE_ENTRIES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Choose Groups
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CHOOSE_GROUP_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CHOOSE_GROUP_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Choose Parent DN
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CHOOSE_PARENT_ENTRY_DN =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CHOOSE_PARENT_ENTRY_DN",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Choose Reference Group
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CHOOSE_REFERENCE_GROUP =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CHOOSE_REFERENCE_GROUP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Class Path
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CLASS_PATH =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CLASS_PATH",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Deselect All
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CLEAR_SELECTION_BUTTON =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CLEAR_SELECTION_BUTTON",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Close
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CLOSE_BUTTON_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CLOSE_BUTTON_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Close
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CLOSE_MENU =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CLOSE_MENU",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Close window when operation completes
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CLOSE_WINDOW_WHEN_OPERATION_COMPLETES_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CLOSE_WINDOW_WHEN_OPERATION_COMPLETES_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Common Name
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CN_FRIENDLY_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CN_FRIENDLY_NAME",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Command-Line Name
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_COMMAND_LINE_NAME_COLUMN =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_COMMAND_LINE_NAME_COLUMN",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Compare Requests
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_COMPARE_REQUESTS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_COMPARE_REQUESTS_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Compare Responses
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_COMPARE_RESPONSES_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_COMPARE_RESPONSES_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Compress Data
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_COMPRESS_DATA_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_COMPRESS_DATA_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Server Configuration
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CONFIGURATION_ATTRIBUTES_CATEGORY_NODE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CONFIGURATION_ATTRIBUTES_CATEGORY_NODE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Configuration Attribute
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CONFIGURATION_ATTRIBUTE_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CONFIGURATION_ATTRIBUTE_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Server Configuration
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CONFIGURATION_OBJECTCLASSES_CATEGORY_NODE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CONFIGURATION_OBJECTCLASSES_CATEGORY_NODE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Configuration Object Class
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CONFIGURATION_OBJECTCLASS_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CONFIGURATION_OBJECTCLASS_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Are you sure you want to delete the attribute '%s' defined in the schema?
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_CONFIRMATION_DELETE_ATTRIBUTE_DETAILS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_CONFIRMATION_DELETE_ATTRIBUTE_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The following backends will be deleted.  All the entries defined on all the base DN's of the backend and all the index configuration will be deleted.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CONFIRMATION_DELETE_BACKENDS_DETAILS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CONFIRMATION_DELETE_BACKENDS_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The following base DN's will be deleted.  All the entries defined on the base DN's will be deleted.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CONFIRMATION_DELETE_BASE_DNS_DETAILS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CONFIRMATION_DELETE_BASE_DNS_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The following backends will be deleted and all the configuration lost:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CONFIRMATION_DELETE_BASE_DNS_INDIRECT_DETAILS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CONFIRMATION_DELETE_BASE_DNS_INDIRECT_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Are you sure you want to delete the object class '%s' defined in the schema?
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_CONFIRMATION_DELETE_OBJECTCLASS_DETAILS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_CONFIRMATION_DELETE_OBJECTCLASS_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Are you sure you want to delete the elements '%s' defined in the schema?
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_CONFIRMATION_DELETE_SCHEMA_ELEMENTS_MSG =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_CONFIRMATION_DELETE_SCHEMA_ELEMENTS_MSG",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * File '%s' exists and its contents will be overwritten.<br><br>Do you want to continue?
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_CONFIRMATION_EXPORT_LDIF_DETAILS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_CONFIRMATION_EXPORT_LDIF_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * All the data in backend '%s' will be overwritten.<br><br>Do you want to continue?
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_CONFIRMATION_IMPORT_LDIF_DETAILS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_CONFIRMATION_IMPORT_LDIF_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Are you sure you want to delete the indexes '%s' defined in backend '%s'?
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_CTRL_PANEL_CONFIRMATION_INDEXES_DELETE_DETAILS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_CTRL_PANEL_CONFIRMATION_INDEXES_DELETE_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Are you sure you want to delete the index '%s' defined in backend '%s'?
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_CTRL_PANEL_CONFIRMATION_INDEX_DELETE_DETAILS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_CTRL_PANEL_CONFIRMATION_INDEX_DELETE_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * All the data in backend '%s' will be overwritten.<br><br>The following base DNs are replicated:<br>%s<br><br>In order replication to work, these base DNs must be initialized once the import of the LDIF is finished.<br><br>You can choose to initialize automatically the contents of the replicated base DNs in the remote servers once the import LDIF has finished.  Note that if you choose to initialize all the data in the remote server base DNs will be overwritten.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_CTRL_PANEL_CONFIRMATION_INITIALIZE_ALL_AND_OVERWRITE_DETAILS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_CTRL_PANEL_CONFIRMATION_INITIALIZE_ALL_AND_OVERWRITE_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The following base DNs are replicated:<br>%s<br><br>In order replication to work, these base DNs must be initialized once the import of the LDIF is finished.<br><br>Do you want to initialize automatically the contents of the replicated base DNs in the remote servers once the import LDIF has finished?  Note that if you click 'Yes' all the data in the remote server base DNs will be overwritten.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_CONFIRMATION_INITIALIZE_ALL_DETAILS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_CONFIRMATION_INITIALIZE_ALL_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Confirmation Required
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CONFIRMATION_REQUIRED_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CONFIRMATION_REQUIRED_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Are you sure you want to delete the VLV index '%s' defined in backend '%s'?
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_CTRL_PANEL_CONFIRMATION_VLV_INDEX_DELETE_DETAILS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_CTRL_PANEL_CONFIRMATION_VLV_INDEX_DELETE_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Confirmation Required
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CONFIRM_INITIALIZE_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CONFIRM_INITIALIZE_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The following Java arguments could not be used with binary '%s':<br>%s<br><br>The command-lines associated with those Java arguments may not work.<br>Do you want to continue?
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_CTRL_PANEL_CONFIRM_NOT_WORKING_ARGUMENTS_DETAILS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_CTRL_PANEL_CONFIRM_NOT_WORKING_ARGUMENTS_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The following Java arguments could not be used with binary '%s':<br>%s<br><br>These arguments will be used as fall back when OPENDS_JAVA_ARGS is not defined.  If you do not want to specify a fall back, leave those arguments empty.<br><br>The command-lines associated with those Java arguments may not work.<br>Do you want to continue?
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_CTRL_PANEL_CONFIRM_NOT_WORKING_FALLBACK_ARGUMENTS_DETAILS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_CTRL_PANEL_CONFIRM_NOT_WORKING_FALLBACK_ARGUMENTS_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * During the rebuilding of the indexes the backend '%s' will be disabled and none of its suffixes will be accessible.<br><br>Do you want to continue?
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_CONFIRM_REBUILD_INDEX_DETAILS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_CONFIRM_REBUILD_INDEX_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * During the restart process all the open connections to the server will be closed and the server will be not available.<br><br>Do you want to continue?
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CONFIRM_RESTART_SERVER_DETAILS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CONFIRM_RESTART_SERVER_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * If you continue with the restore the contents on the server will be overwritten.<br><br>Do you want to continue?
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CONFIRM_RESTORE_DETAILS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CONFIRM_RESTORE_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * If the server is stopped all the open connections to the server will be closed and the server will be not available.<br><br>Do you want to continue?
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CONFIRM_STOP_SERVER_DETAILS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CONFIRM_STOP_SERVER_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Connection Handlers
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CONNECTION_HANDLERS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CONNECTION_HANDLERS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Connection Handlers:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CONNECTION_HANDLERS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CONNECTION_HANDLERS_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Connection Handler
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CONNECTION_HANDLER_HEADER =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CONNECTION_HANDLER_HEADER",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Connection Handler
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CONNECTION_HANDLER_MONITORING =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CONNECTION_HANDLER_MONITORING",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Connection Handler Monitoring
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CONNECTION_HANDLER_MONITORING_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CONNECTION_HANDLER_MONITORING_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * View
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CONNECTION_HANDLER_VIEW_MENU =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CONNECTION_HANDLER_VIEW_MENU",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * View options for the Connection Handler Monitoring
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CONNECTION_HANDLER_VIEW_MENU_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CONNECTION_HANDLER_VIEW_MENU_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Server to Administer...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CONNECT_TO_SERVER_MENU =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CONNECT_TO_SERVER_MENU",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Administration Connector
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CONN_HANDLER_ADMINISTRATION =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CONN_HANDLER_ADMINISTRATION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * JMX
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CONN_HANDLER_JMX =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CONN_HANDLER_JMX",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * JMX (secure)
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CONN_HANDLER_JMXS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CONN_HANDLER_JMXS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * LDAP
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CONN_HANDLER_LDAP =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CONN_HANDLER_LDAP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * LDAPS
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CONN_HANDLER_LDAPS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CONN_HANDLER_LDAPS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * LDAP (allows StartTLS)
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CONN_HANDLER_LDAP_STARTTLS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CONN_HANDLER_LDAP_STARTTLS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * LDIF
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CONN_HANDLER_LDIF =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CONN_HANDLER_LDIF",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Other
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CONN_HANDLER_OTHER =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CONN_HANDLER_OTHER",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Replication
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CONN_HANDLER_REPLICATION =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CONN_HANDLER_REPLICATION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Replication (secure)
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CONN_HANDLER_REPLICATION_SECURE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CONN_HANDLER_REPLICATION_SECURE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * SNMP
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CONN_HANDLER_SNMP =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CONN_HANDLER_SNMP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * - Contents of file '%s' -
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_CONTENTS_OF_FILE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_CONTENTS_OF_FILE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Copy DN
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_COPY_DN_MENU =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_COPY_DN_MENU",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Could not find entry specified in '%s'.  Check that the entry exists in server %s.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CTRL_PANEL_COULD_NOT_FIND_PROVIDED_ENTRY_IN_REFERRAL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_COULD_NOT_FIND_PROVIDED_ENTRY_IN_REFERRAL",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Could not find entry specified in '%s'.  Check that the entry exists in server.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_COULD_NOT_FIND_PROVIDED_ENTRY_IN_REFERRAL_NO_HOST =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_COULD_NOT_FIND_PROVIDED_ENTRY_IN_REFERRAL_NO_HOST",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Creating default indexes
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CREATING_ADDITIONAL_INDEXES_PROGRESS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CREATING_ADDITIONAL_INDEXES_PROGRESS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Attribute created in schema
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CREATING_ATTRIBUTE_COMPLETE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CREATING_ATTRIBUTE_COMPLETE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * An error occurred creating attribute '%s'.  Check details for more information.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_CREATING_ATTRIBUTE_ERROR_DETAILS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_CREATING_ATTRIBUTE_ERROR_DETAILS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Error creating attribute
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_CREATING_ATTRIBUTE_ERROR_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_CREATING_ATTRIBUTE_ERROR_SUMMARY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Creating attribute '%s'
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_CREATING_ATTRIBUTE_PROGRESS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_CREATING_ATTRIBUTE_PROGRESS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The attribute '%s' was successfully created.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_CREATING_ATTRIBUTE_SUCCESSFUL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_CREATING_ATTRIBUTE_SUCCESSFUL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Creating attribute '%s'...
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_CREATING_ATTRIBUTE_SUMMARY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_CREATING_ATTRIBUTE_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Creating backend '%s' containing base DN '%s'
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_CTRL_PANEL_CREATING_BACKEND_PROGRESS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_CTRL_PANEL_CREATING_BACKEND_PROGRESS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Base DN Created
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CREATING_BASE_DN_COMPLETE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CREATING_BASE_DN_COMPLETE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * An error occurred during the creation of the Base DN.  Error code: %d.
   */
  public static final MessageDescriptor.Arg1<Number> ERR_CTRL_PANEL_CREATING_BASE_DN_ERROR_DETAILS =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_CTRL_PANEL_CREATING_BASE_DN_ERROR_DETAILS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Error during creation of base DN '%s'.    Check 'Details' text area for more information.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_CREATING_BASE_DN_ERROR_SUMMARY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_CREATING_BASE_DN_ERROR_SUMMARY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Creating base DN '%s' in backend '%s'
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_CTRL_PANEL_CREATING_BASE_DN_PROGRESS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_CTRL_PANEL_CREATING_BASE_DN_PROGRESS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The base DN '%s' was successfully created.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_CREATING_BASE_DN_SUCCESSFUL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_CREATING_BASE_DN_SUCCESSFUL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Creating base DN  '%s'...
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_CREATING_BASE_DN_SUMMARY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_CREATING_BASE_DN_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Creating entry '%s'
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_CREATING_ENTRY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_CREATING_ENTRY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * An error occurred creating new entry.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_CREATING_NEW_ENTRY_ERROR_DETAILS =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_CREATING_NEW_ENTRY_ERROR_DETAILS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Error creating new entry
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_CREATING_NEW_ENTRY_ERROR_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_CREATING_NEW_ENTRY_ERROR_SUMMARY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The entry was successfully created.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CREATING_NEW_ENTRY_SUCCESSFUL_DETAILS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CREATING_NEW_ENTRY_SUCCESSFUL_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Entry created
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CREATING_NEW_ENTRY_SUCCESSFUL_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CREATING_NEW_ENTRY_SUCCESSFUL_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Creating new entry...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CREATING_NEW_ENTRY_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CREATING_NEW_ENTRY_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * An error occurred creating index.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_CREATING_NEW_INDEX_ERROR_DETAILS =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_CREATING_NEW_INDEX_ERROR_DETAILS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Error creating index
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_CREATING_NEW_INDEX_ERROR_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_CREATING_NEW_INDEX_ERROR_SUMMARY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Creating index '%s'
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_CREATING_NEW_INDEX_PROGRESS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_CREATING_NEW_INDEX_PROGRESS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The new index '%s' was successfully created.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_CREATING_NEW_INDEX_SUCCESSFUL_DETAILS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_CREATING_NEW_INDEX_SUCCESSFUL_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Index created
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CREATING_NEW_INDEX_SUCCESSFUL_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CREATING_NEW_INDEX_SUCCESSFUL_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Creating new index '%s'...
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_CREATING_NEW_INDEX_SUMMARY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_CREATING_NEW_INDEX_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * An error occurred creating VLV index.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_CREATING_NEW_VLV_INDEX_ERROR_DETAILS =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_CREATING_NEW_VLV_INDEX_ERROR_DETAILS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Error creating VLV index
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_CREATING_NEW_VLV_INDEX_ERROR_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_CREATING_NEW_VLV_INDEX_ERROR_SUMMARY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Creating VLV index '%s'
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_CREATING_NEW_VLV_INDEX_PROGRESS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_CREATING_NEW_VLV_INDEX_PROGRESS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The new VLV index '%s' was successfully created.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_CREATING_NEW_VLV_INDEX_SUCCESSFUL_DETAILS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_CREATING_NEW_VLV_INDEX_SUCCESSFUL_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * VLV Index created
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CREATING_NEW_VLV_INDEX_SUCCESSFUL_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CREATING_NEW_VLV_INDEX_SUCCESSFUL_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Creating new VLV index '%s'...
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_CREATING_NEW_VLV_INDEX_SUMMARY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_CREATING_NEW_VLV_INDEX_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Object class created in schema
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CREATING_OBJECTCLASS_COMPLETE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CREATING_OBJECTCLASS_COMPLETE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * An error occurred creating object class '%s'.  Check details for more information.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_CREATING_OBJECTCLASS_ERROR_DETAILS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_CREATING_OBJECTCLASS_ERROR_DETAILS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Error creating object class
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_CREATING_OBJECTCLASS_ERROR_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_CREATING_OBJECTCLASS_ERROR_SUMMARY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Creating object class '%s'
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_CREATING_OBJECTCLASS_PROGRESS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_CREATING_OBJECTCLASS_PROGRESS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The object class '%s' was successfully created.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_CREATING_OBJECTCLASS_SUCCESSFUL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_CREATING_OBJECTCLASS_SUCCESSFUL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Creating object class '%s'...
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_CREATING_OBJECTCLASS_SUMMARY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_CREATING_OBJECTCLASS_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Use ',' to separate values. For example: '1,4,5'.<br>Use '-' to indicate intervals.  For example '1-5'.<br>Use '*' to indicate any value.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CRON_HELP =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CRON_HELP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Valid values from 0 to 23
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CRON_HOUR_HELP =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CRON_HOUR_HELP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Valid values from 0 to 59
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CRON_MINUTE_HELP =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CRON_MINUTE_HELP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * From 1 to 31
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CRON_MONTH_DAY_HELP =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CRON_MONTH_DAY_HELP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Valid values from 1 to 12 (1 is January, 2 is February...)
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CRON_MONTH_HELP =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CRON_MONTH_HELP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Valid values from 0 to 6 (0 is Sunday, 1 is Monday...)
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CRON_WEEK_DAY_HELP =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CRON_WEEK_DAY_HELP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Entry Cache Count
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CURRENT_ENTRY_CACHE_COUNT =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CURRENT_ENTRY_CACHE_COUNT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Entry Cache Size
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CURRENT_ENTRY_CACHE_SIZE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CURRENT_ENTRY_CACHE_SIZE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Current Request Backlog
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CURRENT_REQUEST_BACKLOG =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CURRENT_REQUEST_BACKLOG",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Custom
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CUSTOM_ATTRIBUTES_CATEGORY_NODE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CUSTOM_ATTRIBUTES_CATEGORY_NODE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Custom Attributes
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CUSTOM_ATTRIBUTES_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CUSTOM_ATTRIBUTES_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Custom Attribute
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CUSTOM_ATTRIBUTE_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CUSTOM_ATTRIBUTE_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Custom
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CUSTOM_OBJECTCLASSES_CATEGORY_NODE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CUSTOM_OBJECTCLASSES_CATEGORY_NODE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Custom Object Class
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_CUSTOM_OBJECTCLASS_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_CUSTOM_OBJECTCLASS_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Country
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_C_FRIENDLY_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_C_FRIENDLY_NAME",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Database Indexes
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DATABASE_INDEXES =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DATABASE_INDEXES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Data Exclusion Options
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DATA_EXCLUSION_OPTIONS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DATA_EXCLUSION_OPTIONS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Data Inclusion Options
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DATA_INCLUSION_OPTIONS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DATA_INCLUSION_OPTIONS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Data in File is Compressed
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DATA_IN_FILE_COMPRESSED =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DATA_IN_FILE_COMPRESSED",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Data Sources
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DATA_SOURCES =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DATA_SOURCES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The provided date already passed.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_DATE_ALREADY_PASSED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CTRL_PANEL_DATE_ALREADY_PASSED",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * Days:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DAYS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DAYS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Database Environment
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DB_ENVIRONMENT =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DB_ENVIRONMENT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * ds-suffix.png
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DB_ENVIRONMENT_TREE_NODE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DB_ENVIRONMENT_TREE_NODE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Backend ID
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DB_HEADER =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DB_HEADER",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * December
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DECEMBER =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DECEMBER",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * - Default defined in syntax (%s) -
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_DEFAULT_DEFINED_IN_SYNTAX =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_DEFAULT_DEFINED_IN_SYNTAX",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Defined in file: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_DEFINED_IN_SCHEMA_FILE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_DEFINED_IN_SCHEMA_FILE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Delete Attributes
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DELETE_ATTRIBUTES_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DELETE_ATTRIBUTES_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Delete Attribute...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DELETE_ATTRIBUTE_BUTTON =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DELETE_ATTRIBUTE_BUTTON",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Delete Attribute
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DELETE_ATTRIBUTE_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DELETE_ATTRIBUTE_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Delete backends '%s'.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_DELETE_BACKENDS_DESCRIPTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_DELETE_BACKENDS_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Delete backend '%s'.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_DELETE_BACKEND_DESCRIPTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_DELETE_BACKEND_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Delete Backend...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DELETE_BACKEND_MENU =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DELETE_BACKEND_MENU",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Delete Backend
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DELETE_BACKEND_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DELETE_BACKEND_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Delete base DN's %s.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_DELETE_BASE_DNS_DESCRIPTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_DELETE_BASE_DNS_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Delete base DN '%s'.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_DELETE_BASE_DN_DESCRIPTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_DELETE_BASE_DN_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Delete Base DN...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DELETE_BASE_DN_MENU =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DELETE_BASE_DN_MENU",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Delete Base DN
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DELETE_BASE_DN_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DELETE_BASE_DN_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Delete...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DELETE_BUTTON_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DELETE_BUTTON_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Do you want to delete the selected entries (including all the entries below them on the tree)?
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DELETE_ENTRIES_CONFIRMATION_DETAILS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DELETE_ENTRIES_CONFIRMATION_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Delete Entry...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DELETE_ENTRY_BUTTON =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DELETE_ENTRY_BUTTON",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Do you want to delete entry '%s'?
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_DELETE_ENTRY_CONFIRMATION_DETAILS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_DELETE_ENTRY_CONFIRMATION_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Delete Entry...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DELETE_ENTRY_MENU =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DELETE_ENTRY_MENU",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Delete entries.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DELETE_ENTRY_TASK_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DELETE_ENTRY_TASK_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Delete Indexes
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DELETE_INDEXES_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DELETE_INDEXES_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Delete indexes in backends '%s'.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_DELETE_INDEX_IN_BACKENDS_TASK_DESCRIPTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_DELETE_INDEX_IN_BACKENDS_TASK_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Delete Index...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DELETE_INDEX_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DELETE_INDEX_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Delete Index...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DELETE_INDEX_MENU =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DELETE_INDEX_MENU",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Delete indexes in backend '%s'.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_DELETE_INDEX_TASK_DESCRIPTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_DELETE_INDEX_TASK_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Delete Index
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DELETE_INDEX_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DELETE_INDEX_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Delete Objectclasses and Attributes
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DELETE_OBJECTCLASSES_AND_ATTRIBUTES_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DELETE_OBJECTCLASSES_AND_ATTRIBUTES_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Delete Objectclasses
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DELETE_OBJECTCLASSES_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DELETE_OBJECTCLASSES_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Delete Object Class...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DELETE_OBJECTCLASS_BUTTON =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DELETE_OBJECTCLASS_BUTTON",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Delete Object Class
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DELETE_OBJECTCLASS_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DELETE_OBJECTCLASS_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Delete Requests
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DELETE_REQUESTS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DELETE_REQUESTS_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Delete Responses
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DELETE_RESPONSES_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DELETE_RESPONSES_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Delete...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DELETE_SCHEMA_ELEMENT_MENU =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DELETE_SCHEMA_ELEMENT_MENU",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Delete schema elements.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DELETE_SCHEMA_ELEMENT_TASK_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DELETE_SCHEMA_ELEMENT_TASK_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Delete Selected Entries
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DELETE_SELECTED_ENTRIES_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DELETE_SELECTED_ENTRIES_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Do you want to delete subtree '%s' (including all the entries below it on the tree)?
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_DELETE_SUBTREE_CONFIRMATION_DETAILS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_DELETE_SUBTREE_CONFIRMATION_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Delete VLV Index
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DELETE_VLV_INDEX_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DELETE_VLV_INDEX_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Deleting attribute '%s'
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_DELETING_ATTRIBUTE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_DELETING_ATTRIBUTE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Attribute Deleted
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DELETING_ATTRIBUTE_COMPLETE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DELETING_ATTRIBUTE_COMPLETE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * An error occurred deleting attribute '%s'.  Check details for more information.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_DELETING_ATTRIBUTE_ERROR_DETAILS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_DELETING_ATTRIBUTE_ERROR_DETAILS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Error deleting attribute
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_DELETING_ATTRIBUTE_ERROR_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_DELETING_ATTRIBUTE_ERROR_SUMMARY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The attribute '%s' was successfully deleted
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_DELETING_ATTRIBUTE_SUCCESSFUL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_DELETING_ATTRIBUTE_SUCCESSFUL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Deleting attribute '%s'...
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_DELETING_ATTRIBUTE_SUMMARY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_DELETING_ATTRIBUTE_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Deleting backend '%s'
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_DELETING_BACKEND =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_DELETING_BACKEND",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Backends Deleted
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DELETING_BACKENDS_COMPLETE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DELETING_BACKENDS_COMPLETE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * An error occurred deleting backends.  Check details for more information.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_DELETING_BACKENDS_ERROR_DETAILS =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_DELETING_BACKENDS_ERROR_DETAILS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Error deleting backends
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_DELETING_BACKENDS_ERROR_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_DELETING_BACKENDS_ERROR_SUMMARY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The backends were successfully deleted.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DELETING_BACKENDS_SUCCESSFUL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DELETING_BACKENDS_SUCCESSFUL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Deleting backends...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DELETING_BACKENDS_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DELETING_BACKENDS_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Deleting base DN '%s'
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_DELETING_BASE_DN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_DELETING_BASE_DN",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Deleting base DN's %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_DELETING_BASE_DNS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_DELETING_BASE_DNS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Base DN's Deleted
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DELETING_BASE_DNS_COMPLETE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DELETING_BASE_DNS_COMPLETE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * An error occurred deleting base DN's.  Check details for more information.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_DELETING_BASE_DNS_ERROR_DETAILS =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_DELETING_BASE_DNS_ERROR_DETAILS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Error deleting base DN's
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_DELETING_BASE_DNS_ERROR_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_DELETING_BASE_DNS_ERROR_SUMMARY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The base DN's were successfully deleted.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DELETING_BASE_DNS_SUCCESSFUL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DELETING_BASE_DNS_SUCCESSFUL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Deleting base DN's...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DELETING_BASE_DNS_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DELETING_BASE_DNS_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Disabling replication of base DN '%s'
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_DELETING_DOMAIN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_DELETING_DOMAIN",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Entries Deleted
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DELETING_ENTRIES_COMPLETE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DELETING_ENTRIES_COMPLETE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * An error occurred deleting entries
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_DELETING_ENTRIES_ERROR_DETAILS =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_DELETING_ENTRIES_ERROR_DETAILS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Error deleting entries
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_DELETING_ENTRIES_ERROR_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_DELETING_ENTRIES_ERROR_SUMMARY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The entries were successfully deleted.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DELETING_ENTRIES_SUCCESSFUL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DELETING_ENTRIES_SUCCESSFUL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Deleting entries...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DELETING_ENTRIES_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DELETING_ENTRIES_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Entry Deleted
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DELETING_ENTRY_COMPLETE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DELETING_ENTRY_COMPLETE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * An error occurred deleting entry '%s'.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_DELETING_ENTRY_ERROR_DETAILS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_DELETING_ENTRY_ERROR_DETAILS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Error deleting entry
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_DELETING_ENTRY_ERROR_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_DELETING_ENTRY_ERROR_SUMMARY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The entry '%s' was successfully deleted.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_DELETING_ENTRY_SUCCESSFUL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_DELETING_ENTRY_SUCCESSFUL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Deleting '%s'...
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_DELETING_ENTRY_SUMMARY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_DELETING_ENTRY_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Delete Entry
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DELETING_ENTRY_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DELETING_ENTRY_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Deleting index '%s'
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_DELETING_INDEX =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_DELETING_INDEX",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Indexes Deleted
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DELETING_INDEXES_COMPLETE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DELETING_INDEXES_COMPLETE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * An error occurred deleting indexes '%s'.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_DELETING_INDEXES_ERROR_DETAILS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_DELETING_INDEXES_ERROR_DETAILS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Error deleting indexes
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_DELETING_INDEXES_ERROR_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_DELETING_INDEXES_ERROR_SUMMARY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The indexes '%s' in backend '%s' were successfully deleted.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_CTRL_PANEL_DELETING_INDEXES_SUCCESSFUL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_CTRL_PANEL_DELETING_INDEXES_SUCCESSFUL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Deleting indexes...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DELETING_INDEXES_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DELETING_INDEXES_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Index Deleted
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DELETING_INDEX_COMPLETE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DELETING_INDEX_COMPLETE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * An error occurred deleting index '%s'.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_DELETING_INDEX_ERROR_DETAILS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_DELETING_INDEX_ERROR_DETAILS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Error deleting index
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_DELETING_INDEX_ERROR_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_DELETING_INDEX_ERROR_SUMMARY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The index '%s' in backend '%s' was successfully deleted.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_CTRL_PANEL_DELETING_INDEX_SUCCESSFUL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_CTRL_PANEL_DELETING_INDEX_SUCCESSFUL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Deleting index...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DELETING_INDEX_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DELETING_INDEX_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Deleting objectclass '%s'
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_DELETING_OBJECTCLASS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_DELETING_OBJECTCLASS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Object class Deleted
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DELETING_OBJECTCLASS_COMPLETE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DELETING_OBJECTCLASS_COMPLETE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * An error occurred deleting object class '%s'.  Check details for more information.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_DELETING_OBJECTCLASS_ERROR_DETAILS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_DELETING_OBJECTCLASS_ERROR_DETAILS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Error deleting object class
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_DELETING_OBJECTCLASS_ERROR_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_DELETING_OBJECTCLASS_ERROR_SUMMARY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The object class '%s' was successfully deleted
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_DELETING_OBJECTCLASS_SUCCESSFUL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_DELETING_OBJECTCLASS_SUCCESSFUL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Deleting object class '%s'...
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_DELETING_OBJECTCLASS_SUMMARY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_DELETING_OBJECTCLASS_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Schema Definitions Deleted
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DELETING_SCHEMA_ELEMENTS_COMPLETE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DELETING_SCHEMA_ELEMENTS_COMPLETE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * An error occurred deleting schema elements.  Check details for more information
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_DELETING_SCHEMA_ELEMENTS_ERROR_DETAILS =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_DELETING_SCHEMA_ELEMENTS_ERROR_DETAILS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Error deleting schema elements
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_DELETING_SCHEMA_ELEMENTS_ERROR_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_DELETING_SCHEMA_ELEMENTS_ERROR_SUMMARY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The schema elements '%s' were successfully deleted
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_DELETING_SCHEMA_ELEMENTS_SUCCESSFUL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_DELETING_SCHEMA_ELEMENTS_SUCCESSFUL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Deleting...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DELETING_SCHEMA_ELEMENTS_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DELETING_SCHEMA_ELEMENTS_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Subtree Deleted
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DELETING_SUBTREE_COMPLETE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DELETING_SUBTREE_COMPLETE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * An error occurred deleting subtree '%s'.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_DELETING_SUBTREE_ERROR_DETAILS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_DELETING_SUBTREE_ERROR_DETAILS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Error deleting subtree
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_DELETING_SUBTREE_ERROR_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_DELETING_SUBTREE_ERROR_SUMMARY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The subtree '%s' was successfully deleted.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_DELETING_SUBTREE_SUCCESSFUL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_DELETING_SUBTREE_SUCCESSFUL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Deleting subtree '%s'...
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_DELETING_SUBTREE_SUMMARY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_DELETING_SUBTREE_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Delete Subtree
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DELETING_SUBTREE_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DELETING_SUBTREE_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Deleting VLV index '%s'
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_DELETING_VLV_INDEX =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_DELETING_VLV_INDEX",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * VLV Index Deleted
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DELETING_VLV_INDEX_COMPLETE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DELETING_VLV_INDEX_COMPLETE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * An error occurred VLV deleting index '%s'.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_DELETING_VLV_INDEX_ERROR_DETAILS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_DELETING_VLV_INDEX_ERROR_DETAILS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Error deleting VLV index
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_DELETING_VLV_INDEX_ERROR_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_DELETING_VLV_INDEX_ERROR_SUMMARY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The VLV index '%s' in backend '%s' was successfully deleted.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_CTRL_PANEL_DELETING_VLV_INDEX_SUCCESSFUL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_CTRL_PANEL_DELETING_VLV_INDEX_SUCCESSFUL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Deleting VLV index...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DELETING_VLV_INDEX_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DELETING_VLV_INDEX_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Description
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DESCRIPTION_FRIENDLY_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DESCRIPTION_FRIENDLY_NAME",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Details: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_DETAILS_THROWABLE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_DETAILS_THROWABLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Directory Data:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DIRECTORY_DATA_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DIRECTORY_DATA_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Disable...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DISABLE_WINDOWS_SERVICE_BUTTON =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DISABLE_WINDOWS_SERVICE_BUTTON",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Disable Windows Service
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DISABLE_WINDOWS_SERVICE_TASK_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DISABLE_WINDOWS_SERVICE_TASK_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Disabling backend '%s'
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_DISABLING_BACKEND =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_DISABLING_BACKEND",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * An error occurred during the disabling of the Windows service.  Error code: %d.
   */
  public static final MessageDescriptor.Arg1<Number> ERR_CTRL_PANEL_DISABLING_WINDOWS_SERVICE_ERROR_DETAILS =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_CTRL_PANEL_DISABLING_WINDOWS_SERVICE_ERROR_DETAILS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Error during Disabling of Windows Service
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_DISABLING_WINDOWS_SERVICE_ERROR_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_DISABLING_WINDOWS_SERVICE_ERROR_SUMMARY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The Windows service was successfully disabled.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DISABLING_WINDOWS_SERVICE_SUCCESSFUL_DETAILS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DISABLING_WINDOWS_SERVICE_SUCCESSFUL_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Windows Service Disabled
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DISABLING_WINDOWS_SERVICE_SUCCESSFUL_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DISABLING_WINDOWS_SERVICE_SUCCESSFUL_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Disabling Windows Service...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DISABLING_WINDOWS_SERVICE_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DISABLING_WINDOWS_SERVICE_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Display All Command-lines
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DISPLAY_ALL_COMMAND_LINES =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DISPLAY_ALL_COMMAND_LINES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * DN's to Exclude:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DNS_TO_EXCLUDE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DNS_TO_EXCLUDE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * DN's to Include:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DNS_TO_INCLUDE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DNS_TO_INCLUDE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The DN is not valid.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_DN_NOT_VALID =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_DN_NOT_VALID",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Invalid dn value: '%s'.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_DN_NOT_VALID_WITH_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_DN_NOT_VALID_WITH_VALUE",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * DN Validation:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DN_VALIDATION_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DN_VALIDATION_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Documentation Wiki
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DOCUMENTATION_WIKI_MENU =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DOCUMENTATION_WIKI_MENU",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Perform DN Validation during Later Part of Import
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DO_DN_VALIDATION_LATER_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DO_DN_VALIDATION_LATER_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Do Not Save
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DO_NOT_SAVE_BUTTON_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DO_NOT_SAVE_BUTTON_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Do you want to continue?
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DO_YOU_WANT_TO_CONTINUE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DO_YOU_WANT_TO_CONTINUE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * <Binary Value>
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DS_SYNC_HIST_BINARY_VALUE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DS_SYNC_HIST_BINARY_VALUE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Dynamic Group Reference DN
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DS_TARGET_GROUP_DN_FRIENDLY_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DS_TARGET_GROUP_DN_FRIENDLY_NAME",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Entry DN:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DUPLICATE_ENTRY_DN =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DUPLICATE_ENTRY_DN",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Duplicate Entry...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DUPLICATE_ENTRY_MENU =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DUPLICATE_ENTRY_MENU",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * You must provide the name of the new entry.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_DUPLICATE_ENTRY_NAME_EMPTY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_DUPLICATE_ENTRY_NAME_EMPTY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * New Entry Name:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DUPLICATE_ENTRY_NAME_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DUPLICATE_ENTRY_NAME_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Parent Entry DN:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DUPLICATE_ENTRY_PARENT_DN_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DUPLICATE_ENTRY_PARENT_DN_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * You must provide a valid DN for the parent entry.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_DUPLICATE_ENTRY_PARENT_DN_NOT_VALID =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_DUPLICATE_ENTRY_PARENT_DN_NOT_VALID",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The parent entry does not exist.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_DUPLICATE_ENTRY_PARENT_DOES_NOT_EXIST =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_DUPLICATE_ENTRY_PARENT_DOES_NOT_EXIST",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Duplicate Entry
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DUPLICATE_ENTRY_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DUPLICATE_ENTRY_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Dynamic Group
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DYNAMIC_GROUP_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DYNAMIC_GROUP_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Dynamic Group Reference DN:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_DYNAMIC_GROUP_REFERENCE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_DYNAMIC_GROUP_REFERENCE_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Edit binary attribute
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_EDIT_BINARY_ATTRIBUTE_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_EDIT_BINARY_ATTRIBUTE_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Edit...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_EDIT_BUTTON_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_EDIT_BUTTON_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Edit LDAP Entry
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_EDIT_LDAP_ENTRY_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_EDIT_LDAP_ENTRY_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Edit Object Class
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_EDIT_OBJECTCLASS_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_EDIT_OBJECTCLASS_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Employee Number
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_EMPLOYEENUMBER_FRIENDLY_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_EMPLOYEENUMBER_FRIENDLY_NAME",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * You have provided an empty alias.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_EMPTY_ALIAS =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_EMPTY_ALIAS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Enable
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ENABLE_WINDOWS_SERVICE_BUTTON =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ENABLE_WINDOWS_SERVICE_BUTTON",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Enable Windows Service
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ENABLE_WINDOWS_SERVICE_TASK_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ENABLE_WINDOWS_SERVICE_TASK_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Enabling backend '%s'
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_ENABLING_BACKEND =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_ENABLING_BACKEND",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * An error occurred during the enabling of the Windows service.  Error code: %d.
   */
  public static final MessageDescriptor.Arg1<Number> ERR_CTRL_PANEL_ENABLING_WINDOWS_SERVICE_ERROR_DETAILS =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_CTRL_PANEL_ENABLING_WINDOWS_SERVICE_ERROR_DETAILS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Error during Enabling of Windows Service
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_ENABLING_WINDOWS_SERVICE_ERROR_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_ENABLING_WINDOWS_SERVICE_ERROR_SUMMARY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The Windows service was successfully enabled.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ENABLING_WINDOWS_SERVICE_SUCCESSFUL_DETAILS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ENABLING_WINDOWS_SERVICE_SUCCESSFUL_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Windows Service Enabled
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ENABLING_WINDOWS_SERVICE_SUCCESSFUL_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ENABLING_WINDOWS_SERVICE_SUCCESSFUL_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Enabling Windows Service...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ENABLING_WINDOWS_SERVICE_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ENABLING_WINDOWS_SERVICE_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Encrypt Data
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ENCRYPT_DATA_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ENCRYPT_DATA_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * %d entries deleted.
   */
  public static final MessageDescriptor.Arg1<Number> INFO_CTRL_PANEL_ENTRIES_DELETED =
          new MessageDescriptor.Arg1<Number>(BASE,"INFO_CTRL_PANEL_ENTRIES_DELETED",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Entries
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ENTRIES_MENU =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ENTRIES_MENU",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The entries edition menu
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ENTRIES_MENU_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ENTRIES_MENU_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Entry '%s' already exists.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_ENTRY_ALREADY_EXISTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_ENTRY_ALREADY_EXISTS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Entry Cache
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ENTRY_CACHES =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ENTRY_CACHES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * ds-generic.png
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ENTRY_CACHES_TREE_NODE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ENTRY_CACHES_TREE_NODE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Entry Cache Hits
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ENTRY_CACHE_HITS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ENTRY_CACHE_HITS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Entry Cache Hit Ratio
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ENTRY_CACHE_HIT_RATIO =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ENTRY_CACHE_HIT_RATIO",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Entry Cache Tries
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ENTRY_CACHE_TRIES =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ENTRY_CACHE_TRIES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Entry Limit:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ENTRY_LIMIT_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ENTRY_LIMIT_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The duplicated entry will contain a password with value '%s'
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_ENTRY_TO_DUPLICATE_HAS_PASSWORD_WARNING =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_ENTRY_TO_DUPLICATE_HAS_PASSWORD_WARNING",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Equality
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_EQUALITY_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_EQUALITY_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The equivalent procedure to update the Java settings from the command line is: <br> Edit the properties in file:<br><b>%s</b><br>Then run the following command-line:<br><b>%s</b><br><br>
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_CTRL_PANEL_EQUIVALENT_ACTION_TO_UPDATE_JAVA_PROPERTIES =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_CTRL_PANEL_EQUIVALENT_ACTION_TO_UPDATE_JAVA_PROPERTIES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Equivalent command line to add attribute '%s':
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_ADD_ATTRIBUTE_ONLINE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_ADD_ATTRIBUTE_ONLINE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Equivalent command line to add object class '%s':
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_ADD_OBJECTCLASS_ONLINE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_ADD_OBJECTCLASS_ONLINE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Adding the schema elements '%s' can also be done adding the following attributes to the schema definition entry (cn=schema) in file '%s':
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_ADD_SCHEMA_ELEMENT_OFFLINE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_ADD_SCHEMA_ELEMENT_OFFLINE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Adding the schema elements '%s' can also be done adding the following entry to the file '%s':
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_ADD_SCHEMA_ENTRY_OFFLINE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_ADD_SCHEMA_ENTRY_OFFLINE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Equivalent command-line to cancel task '%s':
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_CANCEL_TASK =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_CANCEL_TASK",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Equivalent command lines to generate default indexes:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_CREATE_ADDITIONAL_INDEXES =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_CREATE_ADDITIONAL_INDEXES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Equivalent command line to update the configuration:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_CREATE_BASE_DN =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_CREATE_BASE_DN",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Equivalent command line to create the entry:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_CREATE_ENTRY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_CREATE_ENTRY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Equivalent command line to create the index:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_CREATE_INDEX =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_CREATE_INDEX",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Equivalent command line to create the VLV index:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_CREATE_VLV_INDEX =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_CREATE_VLV_INDEX",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Deleting attribute '%s' can also be done removing the following attribute from the schema definition entry (cn=schema) in file '%s':
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_DELETE_ATTRIBUTE_OFFLINE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_DELETE_ATTRIBUTE_OFFLINE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Equivalent command line to delete attribute '%s':
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_DELETE_ATTRIBUTE_ONLINE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_DELETE_ATTRIBUTE_ONLINE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Equivalent command line to delete the backend:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_DELETE_BACKEND =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_DELETE_BACKEND",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Equivalent command line to delete the base DN:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_DELETE_BASE_DN =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_DELETE_BASE_DN",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Equivalent command line to disable replication on base DN '%s':
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_DELETE_DOMAIN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_DELETE_DOMAIN",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Equivalent command line to delete entry '%s':
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_DELETE_ENTRY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_DELETE_ENTRY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Equivalent command line to delete the index:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_DELETE_INDEX =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_DELETE_INDEX",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Deleting object class '%s' can also be done removing the following attribute from the schema definition entry (cn=schema) in file '%s':
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_DELETE_OBJECTCLASS_OFFLINE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_DELETE_OBJECTCLASS_OFFLINE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Equivalent command line to delete object class '%s':
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_DELETE_OBJECTCLASS_ONLINE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_DELETE_OBJECTCLASS_ONLINE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Equivalent command line to disable the backend '%s':
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_DISABLE_BACKEND =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_DISABLE_BACKEND",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Equivalent command line to enable the backend '%s':
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_ENABLE_BACKEND =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_ENABLE_BACKEND",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Equivalent command to initialize remote servers:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_INITIALIZE_ALL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_INITIALIZE_ALL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Equivalent command line to modify the entry:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_MODIFY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_MODIFY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Equivalent command line to modify the index:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_MODIFY_INDEX =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_MODIFY_INDEX",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Equivalent command line to modify the VLV index:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_MODIFY_VLV_INDEX =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_MODIFY_VLV_INDEX",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Equivalent command line to rebuild indexes in '%s':
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_REBUILD_INDEX =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_REBUILD_INDEX",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Equivalent command line to rename the entry:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_RENAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_RENAME",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Equivalent command line to reset the password:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_RESET_PASSWORD =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_RESET_PASSWORD",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Equivalent command line to start the server:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_START_SERVER =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_START_SERVER",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Equivalent command line to stop the server:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_STOP_SERVER =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_EQUIVALENT_CMD_TO_STOP_SERVER",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Equivalent command line:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_EQUIVALENT_COMMAND_LINE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_EQUIVALENT_COMMAND_LINE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Error checking entry.  Details: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_ERROR_CHECKING_ENTRY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_ERROR_CHECKING_ENTRY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * An unexpected error occurred checking the provided Java settings.  Details: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_ERROR_CHECKING_JAVA_SETTINGS_DETAILS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_ERROR_CHECKING_JAVA_SETTINGS_DETAILS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Error checking Java settings
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_ERROR_CHECKING_JAVA_SETTINGS_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_ERROR_CHECKING_JAVA_SETTINGS_SUMMARY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The following errors occurred connecting to the local server:<br>%s<br>If you continue without providing authentication no monitoring information will be displayed.<br><br>Do you want to continue?
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_ERROR_CONNECTING_TO_LOCAL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_ERROR_CONNECTING_TO_LOCAL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Connection Error
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ERROR_CONNECT_BROWSE_DETAILS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ERROR_CONNECT_BROWSE_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * An error occurred trying to connect to the server to read data.  Details: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_ERROR_CONNECT_BROWSE_SUMMARY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_ERROR_CONNECT_BROWSE_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Could not created local LDIF to populate new base DN with automatically generated data.  Error code: %d.
   */
  public static final MessageDescriptor.Arg1<Number> ERR_CTRL_PANEL_ERROR_CREATING_NEW_DATA_LDIF =
          new MessageDescriptor.Arg1<Number>(BASE,"SEVERE_ERR_CTRL_PANEL_ERROR_CREATING_NEW_DATA_LDIF",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * An error occurred decoding the provided base 64 string.  Details: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_ERROR_DECODING_BASE_64 =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_ERROR_DECODING_BASE_64",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Error
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ERROR_DIALOG_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ERROR_DIALOG_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * You must select at least one superior object class.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ERROR_NO_SUPERIOR_SELECTED =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ERROR_NO_SUPERIOR_SELECTED",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Error Reading Configuration
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_ERROR_READING_CONFIGURATION_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_ERROR_READING_CONFIGURATION_SUMMARY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * An error occurred reading the contents of the file.  Details: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_ERROR_READING_FILE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_ERROR_READING_FILE",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Could not resolve the referrals defined in entry '%s'.<br><br>The referrals of the entry are:<br>%s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_CTRL_PANEL_ERROR_RESOLVING_REFERRAL_MSG =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_CTRL_PANEL_ERROR_RESOLVING_REFERRAL_MSG",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Error resolving referral
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ERROR_RESOLVING_REFERRAL_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ERROR_RESOLVING_REFERRAL_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * An error occurred searching entry '%s'.  Details:<br>%s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CTRL_PANEL_ERROR_SEARCHING_ENTRY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_ERROR_SEARCHING_ENTRY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Error searching entry
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ERROR_SEARCHING_ENTRY_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ERROR_SEARCHING_ENTRY_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Error updating configuration.  Details: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_ERROR_UPDATING_CONFIGURATION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_ERROR_UPDATING_CONFIGURATION",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Error updating schema.  Details: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_ERROR_UPDATING_SCHEMA =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_ERROR_UPDATING_SCHEMA",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Error reading Java settings
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_ERR_READING_JAVA_SETTINGS_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_ERR_READING_JAVA_SETTINGS_SUMMARY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Exclude Operational Attributes
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_EXCLUDE_OPERATIONAL_ATTRIBUTES =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_EXCLUDE_OPERATIONAL_ATTRIBUTES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Exclusion Filter:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_EXCLUSION_FILTER =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_EXCLUSION_FILTER",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Exit
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_EXIT_MENU =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_EXIT_MENU",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * To modify references to the deleted attributes and object classes the schema elements that refer to them must be deleted and then added again.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_EXPLANATION_TO_DELETE_REFERENCED_ELEMENTS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_EXPLANATION_TO_DELETE_REFERENCED_ELEMENTS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * To modify attribute '%s' it will be deleted and then recreated.  The same applies to all the schema elements that have references to it.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_EXPLANATION_TO_MODIFY_ATTRIBUTE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_EXPLANATION_TO_MODIFY_ATTRIBUTE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * To modify object class '%s' it will be deleted and then recreated.  The same applies to all the schema elements that have references to it.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_EXPLANATION_TO_MODIFY_OBJECTCLASS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_EXPLANATION_TO_MODIFY_OBJECTCLASS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * An error occurred during the export.  Error code: %d.
   */
  public static final MessageDescriptor.Arg1<Number> ERR_CTRL_PANEL_EXPORTING_LDIF_ERROR_DETAILS =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_CTRL_PANEL_EXPORTING_LDIF_ERROR_DETAILS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Error during Export
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_EXPORTING_LDIF_ERROR_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_EXPORTING_LDIF_ERROR_SUMMARY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The export finished successfully.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_EXPORTING_LDIF_SUCCESSFUL_DETAILS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_EXPORTING_LDIF_SUCCESSFUL_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Export Complete
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_EXPORTING_LDIF_SUCCESSFUL_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_EXPORTING_LDIF_SUCCESSFUL_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Exporting from backend '%s'...
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_EXPORTING_LDIF_SUMMARY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_EXPORTING_LDIF_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The provided path '%s' exists and it is a directory.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_EXPORT_DIRECTORY_PROVIDED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_EXPORT_DIRECTORY_PROVIDED",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Generate a Signed Hash
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_EXPORT_GENERATE_SIGNED_HASH =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_EXPORT_GENERATE_SIGNED_HASH",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Export LDIF
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_EXPORT_LDIF_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_EXPORT_LDIF_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Export Options:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_EXPORT_OPTIONS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_EXPORT_OPTIONS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * If file exists, overwrite contents of file instead of appending.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_EXPORT_OVERWRITE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_EXPORT_OVERWRITE_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Export of backend '%s' to file '%s'.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_CTRL_PANEL_EXPORT_TASK_DESCRIPTION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_CTRL_PANEL_EXPORT_TASK_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Export to File:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_EXPORT_TO_FILE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_EXPORT_TO_FILE_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Wrap Text at Column
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_EXPORT_WRAP_TEXT =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_EXPORT_WRAP_TEXT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Extended Requests
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_EXTENDED_REQUESTS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_EXTENDED_REQUESTS_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Extended Responses
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_EXTENDED_RESPONSES_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_EXTENDED_RESPONSES_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Other Attributes
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_EXTRA_JAVA_ATTRIBUTES =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_EXTRA_JAVA_ATTRIBUTES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Extra Options
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_EXTRA_OPTIONS_EXPANDER =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_EXTRA_OPTIONS_EXPANDER",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Fax Number
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_FACSIMILETELEPHONENUMBER_FRIENDLY_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_FACSIMILETELEPHONENUMBER_FRIENDLY_NAME",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * February
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_FEBRUARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_FEBRUARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The file '%s' does not exist.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_FILE_DOES_NOT_EXIST =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_FILE_DOES_NOT_EXIST",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * File
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_FILE_MENU =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_FILE_MENU",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The file menu
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_FILE_MENU_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_FILE_MENU_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * You have to provide a value for the file.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_FILE_NOT_PROVIDED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_FILE_NOT_PROVIDED",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * File to Import:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_FILE_TO_IMPORT_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_FILE_TO_IMPORT_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * For example: (|(cn=*)(sn=*))
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_FILTER_INLINE_HELP_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_FILTER_INLINE_HELP_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Filter:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_FILTER_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_FILTER_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Follow Referrals
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_FOLLOW_REFERRALS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_FOLLOW_REFERRALS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Free Memory in JVM
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_FREE_USED_MEMORY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_FREE_USED_MEMORY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Full Backup
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_FULL_BACKUP_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_FULL_BACKUP_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * - No Item Selected -
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_GENERAL_MONITORING_NO_ITEM_SELECTED =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_GENERAL_MONITORING_NO_ITEM_SELECTED",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Monitoring Root
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_GENERAL_MONITORING_ROOT =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_GENERAL_MONITORING_ROOT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * ds-directory.png
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_GENERAL_MONITORING_ROOT_TREE_NODE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_GENERAL_MONITORING_ROOT_TREE_NODE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * General Information
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_GENERAL_MONITORING_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_GENERAL_MONITORING_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Generate Message Digest of Backup Contents to Use as Checksum
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_GENERATE_MESSAGE_DIGEST_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_GENERATE_MESSAGE_DIGEST_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The Java home value '%s' is not valid.  This value will be used as fall back when the OPENDS_JAVA_HOME environment variable is not defined.  If you do not want to specify a fall back, leave the Java Home text field empty or specify a valid Java home.<br>Error details:<br>%s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CTRL_PANEL_GENERIC_ERROR_FALLBACK_JAVAHOME =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CTRL_PANEL_GENERIC_ERROR_FALLBACK_JAVAHOME",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * %s Control Panel - %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_CTRL_PANEL_GENERIC_TITLE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_CTRL_PANEL_GENERIC_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * First Name
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_GIVENNAME_FRIENDLY_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_GIVENNAME_FRIENDLY_NAME",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Groups
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_GROUPS_FILTER =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_GROUPS_FILTER",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The group '%s' could not be found.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_GROUP_COULD_NOT_BE_FOUND =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_GROUP_COULD_NOT_BE_FOUND",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * LDAP URL:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_GROUP_FILTER_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_GROUP_FILTER_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The provided LDAP URL value is not valid.  Details: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_GROUP_FILTER_NOT_VALID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_GROUP_FILTER_NOT_VALID",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * You must provide an LDAP URL with a filter for the group.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_GROUP_FILTER_REQUIRED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_GROUP_FILTER_REQUIRED",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Member DNs:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_GROUP_MEMBER_DNS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_GROUP_MEMBER_DNS_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * You must specify a group.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_GROUP_NOT_PROVIDED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_GROUP_NOT_PROVIDED",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Help
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_HELP_MENU =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_HELP_MENU",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The help menu
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_HELP_MENU_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_HELP_MENU_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Global view options.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_HELP_VIEW_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_HELP_VIEW_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Home Telephone Number
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_HOMEPHONE_FRIENDLY_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_HOMEPHONE_FRIENDLY_NAME",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Host Name:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_HOST_NAME_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_HOST_NAME_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * To edit the referral in the entry, deselect the 'Follow Referrals' option in the 'View' menu.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_HOW_TO_EDIT_REFERRALS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_HOW_TO_EDIT_REFERRALS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Image of Attribute
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_IMAGE_OF_ATTRIBUTE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_IMAGE_OF_ATTRIBUTE_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Image Preview:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_IMAGE_PREVIEW_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_IMAGE_PREVIEW_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * An error occurred during the import.  Error code: %d.
   */
  public static final MessageDescriptor.Arg1<Number> ERR_CTRL_PANEL_IMPORTING_LDIF_ERROR_DETAILS =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_CTRL_PANEL_IMPORTING_LDIF_ERROR_DETAILS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Error during Import
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_IMPORTING_LDIF_ERROR_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_IMPORTING_LDIF_ERROR_SUMMARY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The import finished successfully.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_IMPORTING_LDIF_SUCCESSFUL_DETAILS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_IMPORTING_LDIF_SUCCESSFUL_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Import Complete
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_IMPORTING_LDIF_SUCCESSFUL_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_IMPORTING_LDIF_SUCCESSFUL_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Importing to backend '%s'...
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_IMPORTING_LDIF_SUMMARY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_IMPORTING_LDIF_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Append to Existing Data
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_IMPORT_APPEND_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_IMPORT_APPEND_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Import Automatically Generated Example Data
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_IMPORT_AUTOMATICALLY_GENERATED_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_IMPORT_AUTOMATICALLY_GENERATED_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Import Data From LDIF File
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_IMPORT_FROM_LDIF_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_IMPORT_FROM_LDIF_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Path:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_IMPORT_LDIF_PATH_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_IMPORT_LDIF_PATH_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Import LDIF
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_IMPORT_LDIF_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_IMPORT_LDIF_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Import Only
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_IMPORT_ONLY_BUTTON_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_IMPORT_ONLY_BUTTON_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Overwrite Any Existing Data
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_IMPORT_OVERWRITE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_IMPORT_OVERWRITE_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Replace Entries that have Matching DN's with Imported Values
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_IMPORT_REPLACE_ENTRIES =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_IMPORT_REPLACE_ENTRIES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Import the contents of file '%s' to backend '%s'.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_CTRL_PANEL_IMPORT_TASK_DESCRIPTION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_CTRL_PANEL_IMPORT_TASK_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * If left empty the number of threads will be equal to 2 x Number of CPUs on server machine.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_IMPORT_THREADS_HELP =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_IMPORT_THREADS_HELP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Thread Number:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_IMPORT_THREADS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_IMPORT_THREADS_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Number of threads used to read LDIF file during import.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_IMPORT_THREADS_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_IMPORT_THREADS_TOOLTIP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Import Type:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_IMPORT_TYPE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_IMPORT_TYPE_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Inclusion Filter:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_INCLUSION_FILTER =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_INCLUSION_FILTER",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * You are editing an abstract object class.  The following object classes are structural or auxiliary: %s.%nOnly auxiliary object classes can be used as superior object classes of an abstract object class.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_INCOMPATIBLE_SUPERIORS_WITH_ABSTRACT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CTRL_PANEL_INCOMPATIBLE_SUPERIORS_WITH_ABSTRACT",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * You are editing an auxiliary object class.  The following object classes are structural: %s.%nOnly auxiliary or abstract object classes can be used as superior object classes of an auxiliary object class.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_INCOMPATIBLE_SUPERIORS_WITH_AUXILIARY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CTRL_PANEL_INCOMPATIBLE_SUPERIORS_WITH_AUXILIARY",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * You are editing a structural object class.  The following object classes are auxiliary: %s.%nOnly structural or abstract object classes can be used as superior object classes of a structural object class.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_INCOMPATIBLE_SUPERIORS_WITH_STRUCTURAL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CTRL_PANEL_INCOMPATIBLE_SUPERIORS_WITH_STRUCTURAL",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * The following task is running: %s<br>It cannot run simultaneously with task %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_CTRL_PANEL_INCOMPATIBLE_TASKS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_CTRL_PANEL_INCOMPATIBLE_TASKS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Incremental Backup (Specify Parent Backup Below)
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_INCREMENTAL_BACKUP_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_INCREMENTAL_BACKUP_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Indexes
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_INDEXES_CATEGORY_NODE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_INDEXES_CATEGORY_NODE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Attribute
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_INDEXES_HEADER_ATTRIBUTE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_INDEXES_HEADER_ATTRIBUTE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Entry Limit
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_INDEXES_HEADER_ENTRY_LIMIT =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_INDEXES_HEADER_ENTRY_LIMIT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Index Types
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_INDEXES_HEADER_INDEX_TYPES =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_INDEXES_HEADER_INDEX_TYPES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Requires Rebuild
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_INDEXES_HEADER_REQUIRES_REBUILD =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_INDEXES_HEADER_REQUIRES_REBUILD",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Indexes:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_INDEXES_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_INDEXES_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Approximate
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_INDEX_APPROXIMATE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_INDEX_APPROXIMATE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * View Index Properties
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_INDEX_BROWSER_RIGHT_PANEL_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_INDEX_BROWSER_RIGHT_PANEL_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Index Details
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_INDEX_DETAILS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_INDEX_DETAILS_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Equality
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_INDEX_EQUALITY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_INDEX_EQUALITY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Index:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_INDEX_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_INDEX_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * <html>The index has been modified.<br>Rebuild of the indexes required (using 'Rebuild Index' or 'Import').
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_INDEX_MODIFIED_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_INDEX_MODIFIED_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * <html>The index has been modified.<br>Rebuild of the indexes required (using 'Rebuild Index' or 'Import').
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_INDEX_MODIFIED_MESSAGE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_INDEX_MODIFIED_MESSAGE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * You must select an index.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_INDEX_MUST_BE_SELECTED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_INDEX_MUST_BE_SELECTED",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Ordering
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_INDEX_ORDERING =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_INDEX_ORDERING",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Index Properties
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_INDEX_PANEL_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_INDEX_PANEL_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Presence
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_INDEX_PRESENCE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_INDEX_PRESENCE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The index configuration for '%s' was successfully modified.  For the configuration to be taken into account the database index files must be regenerated.  This can be done by using the 'Rebuild Indexes' tool or re-importing the contents of the backend '%s'.<br><br> Do you want to rebuild the index now?
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_CTRL_PANEL_INDEX_REBUILD_REQUIRED_OFFLINE_DETAILS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_CTRL_PANEL_INDEX_REBUILD_REQUIRED_OFFLINE_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The index configuration for '%s' was successfully modified.  For the configuration to be taken into account the database index files must be regenerated.  This can be done by using the 'Rebuild Indexes' tool or re-importing the contents of the backend '%s'.<br>During the rebuilding of the indexes the backend '%s' will be disabled and none of its suffixes will be accessible.<br><br>Do you want to rebuild the index now?
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> INFO_CTRL_PANEL_INDEX_REBUILD_REQUIRED_ONLINE_DETAILS =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"INFO_CTRL_PANEL_INDEX_REBUILD_REQUIRED_ONLINE_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The index configuration for '%s' was successfully modified.  For the configuration to be taken into account the database index files must be regenerated.  This can be done by using the 'rebuild-index' command-line on the remote server or re-importing the contents of the backend '%s'.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_CTRL_PANEL_INDEX_REBUILD_REQUIRED_REMOTE_DETAILS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_CTRL_PANEL_INDEX_REBUILD_REQUIRED_REMOTE_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Index Rebuild Required
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_INDEX_REBUILD_REQUIRED_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_INDEX_REBUILD_REQUIRED_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Substring
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_INDEX_SUBSTRING =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_INDEX_SUBSTRING",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * You must select at least one index to be verified.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_INDEX_TO_BE_VERIFIED_REQUIRED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_INDEX_TO_BE_VERIFIED_REQUIRED",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Index Type:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_INDEX_TYPE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_INDEX_TYPE_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Indicates Required Field
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_INDICATES_REQUIRED_FIELD_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_INDICATES_REQUIRED_FIELD_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * (*) Inherited Attribute
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_INHERITED_ATTRIBUTES_HELP =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_INHERITED_ATTRIBUTES_HELP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Import and Initialize
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_INITIALIZE_ALL_BUTTON_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_INITIALIZE_ALL_BUTTON_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Installation Path:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_INSTALLATION_PATH_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_INSTALLATION_PATH_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Instance Path:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_INSTANCE_PATH_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_INSTANCE_PATH_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The provided name is not valid.  Details: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_INVALID_ATTRIBUTE_NAME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_INVALID_ATTRIBUTE_NAME",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The provided base DN is not valid.  Details: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_INVALID_BASE_DN_FOR_VLV_PROVIDED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_INVALID_BASE_DN_FOR_VLV_PROVIDED",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The provided base DN is not valid.  Details: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_INVALID_BASE_DN_PROVIDED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_INVALID_BASE_DN_PROVIDED",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The provided day value is not valid.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_INVALID_DAY =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CTRL_PANEL_INVALID_DAY",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * The day '%d' does not exist in %s.
   */
  public static final MessageDescriptor.Arg2<Number,CharSequence> ERR_CTRL_PANEL_INVALID_DAY_IN_MONTH =
          new MessageDescriptor.Arg2<Number,CharSequence>(BASE,"SEVERE_ERR_CTRL_PANEL_INVALID_DAY_IN_MONTH",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * The value %s is not a valid DN.  Details: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_CTRL_PANEL_INVALID_DN_DETAILS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_CTRL_PANEL_INVALID_DN_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The entry is not correct.  Details: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_INVALID_ENTRY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_INVALID_ENTRY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The entry limit must be an integer between %d and %d.
   */
  public static final MessageDescriptor.Arg2<Number,Number> ERR_CTRL_PANEL_INVALID_ENTRY_LIMIT_LABEL =
          new MessageDescriptor.Arg2<Number,Number>(BASE,"MILD_ERR_CTRL_PANEL_INVALID_ENTRY_LIMIT_LABEL",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The provided filter is not valid.  Details: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_INVALID_FILTER_DETAILS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_INVALID_FILTER_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The provided value '%s' is not a valid filter.  Details: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CTRL_PANEL_INVALID_FILTER_DETAILS_WITH_VALUE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_INVALID_FILTER_DETAILS_WITH_VALUE",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The provided filter is not valid.  Details: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_INVALID_FILTER_FOR_VLV_PROVIDED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_INVALID_FILTER_FOR_VLV_PROVIDED",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The provided hour value is not valid.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_INVALID_HOUR =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CTRL_PANEL_INVALID_HOUR",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * The max block size must be an integer between %d and %d.
   */
  public static final MessageDescriptor.Arg2<Number,Number> ERR_CTRL_PANEL_INVALID_MAX_BLOCK_SIZE_FOR_VLV_PROVIDED =
          new MessageDescriptor.Arg2<Number,Number>(BASE,"MILD_ERR_CTRL_PANEL_INVALID_MAX_BLOCK_SIZE_FOR_VLV_PROVIDED",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The provided minute value is not valid.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_INVALID_MINUTE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CTRL_PANEL_INVALID_MINUTE",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * The provided name is not valid.  Details: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_INVALID_OBJECTCLASS_NAME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_INVALID_OBJECTCLASS_NAME",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The period time must be an integer positive value smaller than %d seconds.
   */
  public static final MessageDescriptor.Arg1<Number> INFO_CTRL_PANEL_INVALID_PERIOD_VALUE =
          new MessageDescriptor.Arg1<Number>(BASE,"INFO_CTRL_PANEL_INVALID_PERIOD_VALUE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The provided time value is not valid.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_INVALID_TIME =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CTRL_PANEL_INVALID_TIME",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * The value of the wrap column must be between %d and %d.
   */
  public static final MessageDescriptor.Arg2<Number,Number> ERR_CTRL_PANEL_INVALID_WRAP_COLUMN =
          new MessageDescriptor.Arg2<Number,Number>(BASE,"MILD_ERR_CTRL_PANEL_INVALID_WRAP_COLUMN",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * January
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_JANUARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_JANUARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Java Arguments
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_JAVA_ARGUMENTS_COLUMN =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_JAVA_ARGUMENTS_COLUMN",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Java Arguments:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_JAVA_ARGUMENTS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_JAVA_ARGUMENTS_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Could not find binary '%s'.  You must specify the path to the Java installation to be used.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_JAVA_BINARY_NOT_FOUND =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_JAVA_BINARY_NOT_FOUND",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Java Home:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_JAVA_HOME_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_JAVA_HOME_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Java Information
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_JAVA_INFORMATION =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_JAVA_INFORMATION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Memory Attributes
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_JAVA_MEMORY_ATTRIBUTES =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_JAVA_MEMORY_ATTRIBUTES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Path '%s' does not exist.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_JAVA_PATH_DOES_NOT_EXIST =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_JAVA_PATH_DOES_NOT_EXIST",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Path '%s' is not a directory.  You must specify the path to the Java installation to be used.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_JAVA_PATH_NOT_A_DIRECTORY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_JAVA_PATH_NOT_A_DIRECTORY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Java Settings
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_JAVA_PROPERTIES_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_JAVA_PROPERTIES_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Java Vendor
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_JAVA_VENDOR =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_JAVA_VENDOR",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Java Version
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_JAVA_VERSION =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_JAVA_VERSION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Java Version:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_JAVA_VERSION_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_JAVA_VERSION_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * JPEG Photograph
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_JPEGPHOTO_FRIENDLY_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_JPEGPHOTO_FRIENDLY_NAME",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * July
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_JULY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_JULY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * June
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_JUNE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_JUNE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * JVM Architecture
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_JVM_ARCHITECTURE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_JVM_ARCHITECTURE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * JVM Arguments
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_JVM_ARGUMENTS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_JVM_ARGUMENTS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * ds-generic.png
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_JVM_MEMORY_USAGE_TREE_NODE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_JVM_MEMORY_USAGE_TREE_NODE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * JVM Vendor
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_JVM_VENDOR =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_JVM_VENDOR",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * JVM Version
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_JVM_VERSION =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_JVM_VERSION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Launch Later
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_LAUNCH_LATER =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_LAUNCH_LATER",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * To be able to launch tasks on a future date, the server must be running.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_LAUNCH_LATER_REQUIRES_SERVER_RUNNING =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_LAUNCH_LATER_REQUIRES_SERVER_RUNNING",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Launch on %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_LAUNCH_LATER_SUMMARY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_LAUNCH_LATER_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Launch Now
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_LAUNCH_NOW =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_LAUNCH_NOW",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Launch now
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_LAUNCH_NOW_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_LAUNCH_NOW_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Launch periodically with CRON schedule '%s'
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_LAUNCH_PERIODICALLY_SUMMARY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_LAUNCH_PERIODICALLY_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * To be able to launch tasks periodically, the server must be running.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_LAUNCH_SCHEDULE_REQUIRES_SERVER_RUNNING =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_LAUNCH_SCHEDULE_REQUIRES_SERVER_RUNNING",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * LDAP Filter:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_LDAP_FILTER =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_LDAP_FILTER",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Enter LDIF syntax for the new entry:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_LDIF_SYNTAX_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_LDIF_SYNTAX_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * LDIF View
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_LDIF_VIEW_MENU =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_LDIF_VIEW_MENU",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Leave Database Empty
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_LEAVE_DATABASE_EMPTY_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_LEAVE_DATABASE_EMPTY_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Loading panel...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_LOADING_PANEL_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_LOADING_PANEL_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Select the server that you want to administer:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_LOCAL_OR_REMOTE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_LOCAL_OR_REMOTE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Choose the server to be administered:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_LOCAL_OR_REMOTE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_LOCAL_OR_REMOTE_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Server to Administer
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_LOCAL_OR_REMOTE_PANEL_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_LOCAL_OR_REMOTE_PANEL_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Local Server
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_LOCAL_SERVER =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_LOCAL_SERVER",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Not Running
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_LOCAL_SERVER_NOT_RUNNING =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_LOCAL_SERVER_NOT_RUNNING",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Authentication Required
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_LOGIN_PANEL_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_LOGIN_PANEL_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * City/Locality
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_L_FRIENDLY_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_L_FRIENDLY_NAME",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * E-Mail
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_MAIL_FRIENDLY_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_MAIL_FRIENDLY_NAME",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Manage Entries
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_MANAGE_ENTRIES_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_MANAGE_ENTRIES_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Manage Indexes
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_MANAGE_INDEXES_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_MANAGE_INDEXES_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Manage Schema
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_MANAGE_SCHEMA_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_MANAGE_SCHEMA_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Manage Tasks
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_MANAGE_TASKS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_MANAGE_TASKS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * March
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_MARCH =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_MARCH",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Matching Rules
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_MATCHING_RULES_CATEGORY_NODE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_MATCHING_RULES_CATEGORY_NODE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The matching rule to be used for approximate requests
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_MATCHING_RULE_APPROXIMATE_HELP =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_MATCHING_RULE_APPROXIMATE_HELP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Description:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_MATCHING_RULE_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_MATCHING_RULE_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Matching Rule Details
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_MATCHING_RULE_DETAILS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_MATCHING_RULE_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The matching rule to be used for equality requests
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_MATCHING_RULE_EQUALITY_HELP =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_MATCHING_RULE_EQUALITY_HELP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Name:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_MATCHING_RULE_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_MATCHING_RULE_NAME",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * OID:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_MATCHING_RULE_OID =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_MATCHING_RULE_OID",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Matching Rule Options
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_MATCHING_RULE_OPTIONS_EXPANDER =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_MATCHING_RULE_OPTIONS_EXPANDER",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The matching rule to be used for ordering requests
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_MATCHING_RULE_ORDERING_HELP =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_MATCHING_RULE_ORDERING_HELP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Matching Rule
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_MATCHING_RULE_PANEL_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_MATCHING_RULE_PANEL_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The matching rule to be used for substring requests
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_MATCHING_RULE_SUBSTRING_HELP =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_MATCHING_RULE_SUBSTRING_HELP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Syntax:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_MATCHING_RULE_SYNTAX =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_MATCHING_RULE_SYNTAX",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Type:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_MATCHING_RULE_TYPE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_MATCHING_RULE_TYPE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Used by Attributes:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_MATCHING_RULE_USED_BY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_MATCHING_RULE_USED_BY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Maximum %d Children Displayed.  Try Applying a Filter.
   */
  public static final MessageDescriptor.Arg1<Number> INFO_CTRL_PANEL_MAXIMUM_CHILDREN_DISPLAYED =
          new MessageDescriptor.Arg1<Number>(BASE,"INFO_CTRL_PANEL_MAXIMUM_CHILDREN_DISPLAYED",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Max Connections:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_MAX_CONNECTIONS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_MAX_CONNECTIONS_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Max Entry Cache Count
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_MAX_ENTRY_CACHE_COUNT =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_MAX_ENTRY_CACHE_COUNT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Max Entry Cache Size
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_MAX_ENTRY_CACHE_SIZE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_MAX_ENTRY_CACHE_SIZE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Max Memory in JVM
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_MAX_MEMORY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_MAX_MEMORY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Maximum Request Backlog
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_MAX_REQUEST_BACKLOG =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_MAX_REQUEST_BACKLOG",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * May
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_MAY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_MAY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * LDAP URL
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_MEMBERURL_FRIENDLY_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_MEMBERURL_FRIENDLY_NAME",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The entry '%s' could not be found.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_MEMBER_NOT_FOUND =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_MEMBER_NOT_FOUND",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * You must provide a member for the group.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_MEMBER_REQUIRED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_MEMBER_REQUIRED",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The provided value as member '%s' is not valid.  Details: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CTRL_PANEL_MEMBER_VALUE_NOT_VALID =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_MEMBER_VALUE_NOT_VALID",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * %d MB, %d KB
   */
  public static final MessageDescriptor.Arg2<Number,Number> INFO_CTRL_PANEL_MEMORY_VALUE =
          new MessageDescriptor.Arg2<Number,Number>(BASE,"INFO_CTRL_PANEL_MEMORY_VALUE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Mobile Number
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_MOBILE_FRIENDLY_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_MOBILE_FRIENDLY_NAME",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Attribute Modified
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_MODIFYING_ATTRIBUTE_COMPLETE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_MODIFYING_ATTRIBUTE_COMPLETE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * An error occurred modifying attribute '%s'.  Check details for more information.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_MODIFYING_ATTRIBUTE_ERROR_DETAILS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_MODIFYING_ATTRIBUTE_ERROR_DETAILS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Error modifying attribute
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_MODIFYING_ATTRIBUTE_ERROR_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_MODIFYING_ATTRIBUTE_ERROR_SUMMARY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The attribute '%s' was successfully modified
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_MODIFYING_ATTRIBUTE_SUCCESSFUL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_MODIFYING_ATTRIBUTE_SUCCESSFUL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Modifying attribute '%s'...
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_MODIFYING_ATTRIBUTE_SUMMARY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_MODIFYING_ATTRIBUTE_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Modifying entry '%s'
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_MODIFYING_ENTRY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_MODIFYING_ENTRY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Save Changes
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_MODIFYING_ENTRY_CHANGES_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_MODIFYING_ENTRY_CHANGES_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Entry Updated
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_MODIFYING_ENTRY_COMPLETE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_MODIFYING_ENTRY_COMPLETE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * An error occurred saving changes to entry '%s'.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_MODIFYING_ENTRY_ERROR_DETAILS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_MODIFYING_ENTRY_ERROR_DETAILS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Error saving changes
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_MODIFYING_ENTRY_ERROR_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_MODIFYING_ENTRY_ERROR_SUMMARY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The entry '%s' was successfully updated.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_MODIFYING_ENTRY_SUCCESSFUL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_MODIFYING_ENTRY_SUCCESSFUL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Saving changes of entry '%s'...
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_MODIFYING_ENTRY_SUMMARY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_MODIFYING_ENTRY_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Index Modified
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_MODIFYING_INDEX_COMPLETE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_MODIFYING_INDEX_COMPLETE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * An error occurred modifying index '%s'.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_MODIFYING_INDEX_ERROR_DETAILS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_MODIFYING_INDEX_ERROR_DETAILS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Error modifying index
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_MODIFYING_INDEX_ERROR_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_MODIFYING_INDEX_ERROR_SUMMARY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Modifying index '%s'
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_MODIFYING_INDEX_PROGRESS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_MODIFYING_INDEX_PROGRESS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The index '%s' in backend '%s' was successfully modified.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_CTRL_PANEL_MODIFYING_INDEX_SUCCESSFUL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_CTRL_PANEL_MODIFYING_INDEX_SUCCESSFUL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Modifying index %s...
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_MODIFYING_INDEX_SUMMARY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_MODIFYING_INDEX_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Modifying Index
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_MODIFYING_INDEX_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_MODIFYING_INDEX_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Object Class Modified
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_MODIFYING_OBJECTCLASS_COMPLETE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_MODIFYING_OBJECTCLASS_COMPLETE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * An error occurred modifying object class '%s'.  Check details for more information.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_MODIFYING_OBJECTCLASS_ERROR_DETAILS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_MODIFYING_OBJECTCLASS_ERROR_DETAILS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Error modifying object class
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_MODIFYING_OBJECTCLASS_ERROR_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_MODIFYING_OBJECTCLASS_ERROR_SUMMARY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The object class '%s' was successfully modified
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_MODIFYING_OBJECTCLASS_SUCCESSFUL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_MODIFYING_OBJECTCLASS_SUCCESSFUL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Modifying object class '%s'...
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_MODIFYING_OBJECTCLASS_SUMMARY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_MODIFYING_OBJECTCLASS_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * VLV Index Modified
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_MODIFYING_VLV_INDEX_COMPLETE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_MODIFYING_VLV_INDEX_COMPLETE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * An error occurred modifying VLV index '%s'.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_MODIFYING_VLV_INDEX_ERROR_DETAILS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_MODIFYING_VLV_INDEX_ERROR_DETAILS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Error modifying VLV index
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_MODIFYING_VLV_INDEX_ERROR_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_MODIFYING_VLV_INDEX_ERROR_SUMMARY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Modifying VLV index '%s'
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_MODIFYING_VLV_INDEX_PROGRESS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_MODIFYING_VLV_INDEX_PROGRESS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The VLV index '%s' in backend '%s' was successfully modified.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_CTRL_PANEL_MODIFYING_VLV_INDEX_SUCCESSFUL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_CTRL_PANEL_MODIFYING_VLV_INDEX_SUCCESSFUL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Modifying VLV index %s...
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_MODIFYING_VLV_INDEX_SUMMARY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_MODIFYING_VLV_INDEX_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Modifying VLV Index
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_MODIFYING_VLV_INDEX_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_MODIFYING_VLV_INDEX_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Modify attribute '%s' in schema
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_MODIFY_ATTRIBUTE_TASK_DESCRIPTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_MODIFY_ATTRIBUTE_TASK_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Modify Attribute
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_MODIFY_ATTRIBUTE_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_MODIFY_ATTRIBUTE_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Modify entry '%s'.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_MODIFY_ENTRY_TASK_DESCRIPTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_MODIFY_ENTRY_TASK_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Modify index '%s' in backend '%s'.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_CTRL_PANEL_MODIFY_INDEX_TASK_DESCRIPTION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_CTRL_PANEL_MODIFY_INDEX_TASK_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Modify object class '%s' in schema
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_MODIFY_OBJECTCLASS_TASK_DESCRIPTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_MODIFY_OBJECTCLASS_TASK_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Modify VLV index '%s' in backend '%s'.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_CTRL_PANEL_MODIFY_VLV_INDEX_TASK_DESCRIPTION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_CTRL_PANEL_MODIFY_VLV_INDEX_TASK_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Mod DN Requests
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_MOD_DN_REQUESTS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_MOD_DN_REQUESTS_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Mod DN Responses
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_MOD_DN_RESPONSES_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_MOD_DN_RESPONSES_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Modify Requests
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_MOD_REQUESTS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_MOD_REQUESTS_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Modify Responses
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_MOD_RESPONSES_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_MOD_RESPONSES_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * - Multiple Entries Selected -
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_MULTIPLE_ENTRIES_SELECTED_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_MULTIPLE_ENTRIES_SELECTED_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * - Multiple Items Selected -
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_MULTIPLE_ITEMS_SELECTED_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_MULTIPLE_ITEMS_SELECTED_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Multiple Schema Items Selected
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_MULTIPLE_SCHEMA_ITEMS_SELECTED =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_MULTIPLE_SCHEMA_ITEMS_SELECTED",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * -Multiple Tasks Selected-
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_MULTIPLE_TASKS_SELECTED =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_MULTIPLE_TASKS_SELECTED",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * You must define the index '%s'.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_MUST_DEFINE_INDEX =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_MUST_DEFINE_INDEX",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * You must define the index '%s' to be of type %s.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_CTRL_PANEL_MUST_DEFINE_INDEX_TYPE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_CTRL_PANEL_MUST_DEFINE_INDEX_TYPE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * You must select a Base DN.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_MUST_SELECT_BASE_DN =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_MUST_SELECT_BASE_DN",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * You must select at least one index to be rebuilt.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_MUST_SELECT_INDEX_TO_REBUILD =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_MUST_SELECT_INDEX_TO_REBUILD",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * You must update the definition of index '%s' to be of type %s.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_CTRL_PANEL_MUST_UPDATE_INDEX_DEFINITION_TYPE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_CTRL_PANEL_MUST_UPDATE_INDEX_DEFINITION_TYPE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Name
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NAME_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NAME_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * You must provide a value for the name of the domain.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_NAME_OF_DOMAIN_REQUIRED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_NAME_OF_DOMAIN_REQUIRED",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * You must provide a value for the name of the group.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_NAME_OF_GROUP_REQUIRED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_NAME_OF_GROUP_REQUIRED",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * You must provide a value for the name of the organization.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_NAME_OF_ORGANIZATION_REQUIRED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_NAME_OF_ORGANIZATION_REQUIRED",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * You must provide a value for the Name of the Organizational Unit.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_NAME_OF_OU_REQUIRED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_NAME_OF_OU_REQUIRED",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Naming Contexts
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NAMINGCONTEXTS_FRIENDLY_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NAMINGCONTEXTS_FRIENDLY_NAME",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Creating new attributes '%s' in schema.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_NEW_ATTRIBUTES_TASK_DESCRIPTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_NEW_ATTRIBUTES_TASK_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * New Attribute...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_ATTRIBUTE_BUTTON =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_ATTRIBUTE_BUTTON",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * New Attribute...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_ATTRIBUTE_MENU =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_ATTRIBUTE_MENU",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * New Attribute
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_ATTRIBUTE_PANEL_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_ATTRIBUTE_PANEL_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Create new attribute '%s' in schema.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_NEW_ATTRIBUTE_TASK_DESCRIPTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_NEW_ATTRIBUTE_TASK_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * New Backend:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_BACKEND_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_BACKEND_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Create new base DN '%s' in backend '%s'.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_CTRL_PANEL_NEW_BASE_DN_TASK_DESCRIPTION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_CTRL_PANEL_NEW_BASE_DN_TASK_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * New Base DN
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_BASE_DN_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_BASE_DN_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * New Window
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_BROWSER_WINDOW_MENU =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_BROWSER_WINDOW_MENU",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * New Domain...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_DOMAIN_MENU =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_DOMAIN_MENU",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * New Entry from LDIF
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_ENTRY_FROM_LDIF_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_ENTRY_FROM_LDIF_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * To create an entry you must provide authentication.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_ENTRY_REQUIRES_AUTHENTICATION =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_ENTRY_REQUIRES_AUTHENTICATION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * To create an entry the server must be running and you must provide authentication.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_ENTRY_REQUIRES_SERVER_RUNNING =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_ENTRY_REQUIRES_SERVER_RUNNING",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * New entry '%s'.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_NEW_ENTRY_TASK_DESCRIPTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_NEW_ENTRY_TASK_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * New from LDIF...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_FROM_LDIF_MENU =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_FROM_LDIF_MENU",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Description:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_GROUP_DESCRIPTION_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_GROUP_DESCRIPTION_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Entry DN:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_GROUP_ENTRY_DN_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_GROUP_ENTRY_DN_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Members:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_GROUP_MEMBERS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_GROUP_MEMBERS_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * New Group...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_GROUP_MENU =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_GROUP_MENU",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Name:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_GROUP_NAME_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_GROUP_NAME_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * New Group
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_GROUP_PANEL_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_GROUP_PANEL_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * New Index...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_INDEX_BUTTON_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_INDEX_BUTTON_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * New Index...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_INDEX_MENU =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_INDEX_MENU",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Create new index '%s' in backend '%s'.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_CTRL_PANEL_NEW_INDEX_TASK_DESCRIPTION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_CTRL_PANEL_NEW_INDEX_TASK_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * New Index
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_INDEX_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_INDEX_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Creating new object classes '%s' in schema.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_NEW_OBJECTCLASSES_TASK_DESCRIPTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_NEW_OBJECTCLASSES_TASK_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * New Object Class...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_OBJECTCLASS_BUTTON =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_OBJECTCLASS_BUTTON",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * New Object Class...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_OBJECTCLASS_MENU =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_OBJECTCLASS_MENU",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * New Object Class
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_OBJECTCLASS_PANEL_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_OBJECTCLASS_PANEL_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Create new object class '%s' in schema.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_NEW_OBJECTCLASS_TASK_DESCRIPTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_NEW_OBJECTCLASS_TASK_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * New Organizational Unit...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_ORGANIZATIONAL_UNIT_MENU =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_ORGANIZATIONAL_UNIT_MENU",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Description:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_ORGANIZATION_DESCRIPTION_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_ORGANIZATION_DESCRIPTION_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Entry DN:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_ORGANIZATION_ENTRY_DN_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_ORGANIZATION_ENTRY_DN_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * New Organization...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_ORGANIZATION_MENU =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_ORGANIZATION_MENU",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Name:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_ORGANIZATION_NAME_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_ORGANIZATION_NAME_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Address:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_OU_ADDRESS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_OU_ADDRESS_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Description:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_OU_DESCRIPTION_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_OU_DESCRIPTION_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Entry DN:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_OU_ENTRY_DN_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_OU_ENTRY_DN_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Fax Number:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_OU_FAX_NUMBER_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_OU_FAX_NUMBER_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Name:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_OU_NAME_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_OU_NAME_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * New Organizational Unit
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_OU_PANEL_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_OU_PANEL_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Telephone Number:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_OU_TELEPHONE_NUMBER_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_OU_TELEPHONE_NUMBER_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * You must provide a value for the new password.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_NEW_PASSWORD_REQUIRED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_NEW_PASSWORD_REQUIRED",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Creating attributes '%s' and object classes '%s' in schema.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_CTRL_PANEL_NEW_SCHEMA_ELEMENTS_TASK_DESCRIPTION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_CTRL_PANEL_NEW_SCHEMA_ELEMENTS_TASK_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Common Name:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_USER_COMMON_NAMES_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_USER_COMMON_NAMES_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Password (Confirm):
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_USER_CONFIRM_PASSWORD_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_USER_CONFIRM_PASSWORD_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * E-mail:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_USER_EMAIL_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_USER_EMAIL_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Entry DN:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_USER_ENTRY_DN_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_USER_ENTRY_DN_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Fax Number:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_USER_FAX_NUMBER_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_USER_FAX_NUMBER_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * First Name:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_USER_FIRST_NAME_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_USER_FIRST_NAME_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Last Name:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_USER_LAST_NAME_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_USER_LAST_NAME_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * New User...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_USER_MENU =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_USER_MENU",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Naming Attribute:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_USER_NAMING_ATTRIBUTE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_USER_NAMING_ATTRIBUTE_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * New User
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_USER_PANEL_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_USER_PANEL_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Password:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_USER_PASSWORD_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_USER_PASSWORD_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Telephone Number:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_USER_TELEPHONE_NUMBER_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_USER_TELEPHONE_NUMBER_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * User ID:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_USER_UID_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_USER_UID_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * New VLV Index...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_VLV_INDEX_BUTTON_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_VLV_INDEX_BUTTON_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * New VLV Index...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_VLV_INDEX_MENU =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_VLV_INDEX_MENU",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Create new VLV index '%s' in backend '%s'.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_CTRL_PANEL_NEW_VLV_INDEX_TASK_DESCRIPTION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_CTRL_PANEL_NEW_VLV_INDEX_TASK_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * New VLV Index
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NEW_VLV_INDEX_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NEW_VLV_INDEX_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * This is a non-configurable internal index
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NON_CONFIGURABLE_INDEX_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NON_CONFIGURABLE_INDEX_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Non-editable Attributes:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NON_EDITABLE_ATTRIBUTES =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NON_EDITABLE_ATTRIBUTES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * User Not Authenticated
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NOT_AUTHENTICATED =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NOT_AUTHENTICATED",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * User not authenticated (server not running)
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NOT_AUTHENTICATED_SERVER_NOT_RUNNING =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NOT_AUTHENTICATED_SERVER_NOT_RUNNING",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * User not authenticated (could not connect to server '%s')
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_NOT_AUTHENTICATED_SERVER_REMOTE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_NOT_AUTHENTICATED_SERVER_REMOTE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Not Available
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NOT_AVAILABLE_LONG_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NOT_AVAILABLE_LONG_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The base DN '%s' is not a descendant of any of the base DN's defined in backend '%s'.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CTRL_PANEL_NOT_A_DESCENDANT_OF_BASE_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_NOT_A_DESCENDANT_OF_BASE_DN",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The entry '%s' exists but it is not an static group.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_NOT_A_STATIC_GROUP =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_NOT_A_STATIC_GROUP",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Not Implemented
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NOT_IMPLEMENTED =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NOT_IMPLEMENTED",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The attribute '%s' has not a valid name.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_NOT_VALID_ATTRIBUTE_NAME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_NOT_VALID_ATTRIBUTE_NAME",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The hour value provided is not valid.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_NOT_VALID_CRON_HOUR_PROVIDED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CTRL_PANEL_NOT_VALID_CRON_HOUR_PROVIDED",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * The minute value provided is not valid.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_NOT_VALID_CRON_MINUTE_PROVIDED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CTRL_PANEL_NOT_VALID_CRON_MINUTE_PROVIDED",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * The day of month value provided is not valid.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_NOT_VALID_CRON_MONTH_DAY_PROVIDED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CTRL_PANEL_NOT_VALID_CRON_MONTH_DAY_PROVIDED",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * The month value provided is not valid.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_NOT_VALID_CRON_MONTH_PROVIDED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CTRL_PANEL_NOT_VALID_CRON_MONTH_PROVIDED",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * The day of week value provided is not valid.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_NOT_VALID_CRON_WEEK_DAY_PROVIDED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CTRL_PANEL_NOT_VALID_CRON_WEEK_DAY_PROVIDED",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * The Java binary '%s' could not be used to launch the server scripts.  This value will be used as fall back when the OPENDS_JAVA_HOME environment variable is not defined.  If you do not want to specify a fall back, leave the Java Home text field empty or specify a valid Java home.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_NOT_WORKING_FALLBACK_JVM_DETAILS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CTRL_PANEL_NOT_WORKING_FALLBACK_JVM_DETAILS",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * The Java binary '%s' could not be used to launch the server scripts.<br>The server cannot run using the provided Java Home.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_NOT_WORKING_JVM_DETAILS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CTRL_PANEL_NOT_WORKING_JVM_DETAILS",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * November
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NOVEMBER =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NOVEMBER",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * You must select at least one attribute for the sort order.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_NO_ATTRIBUTE_FOR_VLV_PROVIDED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_NO_ATTRIBUTE_FOR_VLV_PROVIDED",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * No backends available.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_NO_BACKENDS_AVAILABLE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_NO_BACKENDS_AVAILABLE",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * There are no backends defined.  To create and manage indexes, you must create a backend.  To create a new backend you can use the action "New Base DN".
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_NO_BACKENDS_FOUND_DETAILS =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_NO_BACKENDS_FOUND_DETAILS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * - No Backends Found -
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NO_BACKENDS_FOUND_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NO_BACKENDS_FOUND_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * No Backends Found
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_NO_BACKENDS_FOUND_TITLE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_NO_BACKENDS_FOUND_TITLE",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * No backends selected.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_NO_BACKENDS_SELECTED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_NO_BACKENDS_SELECTED",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * No backend selected.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_NO_BACKEND_SELECTED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_NO_BACKEND_SELECTED",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * - No Backups Found -
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NO_BACKUPS_FOUND =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NO_BACKUPS_FOUND",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * No backup ID provided.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_NO_BACKUP_ID_PROVIDED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_NO_BACKUP_ID_PROVIDED",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * No backup path provided.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_NO_BACKUP_PATH_PROVIDED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_NO_BACKUP_PATH_PROVIDED",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * No Base DN's defined.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_NO_BASE_DNS_DEFINED_LABEL =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_NO_BASE_DNS_DEFINED_LABEL",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * - No Base DN's Found -
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NO_BASE_DNS_FOUND_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NO_BASE_DNS_FOUND_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * You must provide a base DN.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_NO_BASE_DN_FOR_VLV_PROVIDED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_NO_BASE_DN_FOR_VLV_PROVIDED",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * You must provide a base DN.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_NO_BASE_DN_PROVIDED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_NO_BASE_DN_PROVIDED",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * No base DN selected.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NO_BASE_DN_SELECTED =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NO_BASE_DN_SELECTED",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * - No Connection Handlers Found -
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NO_CONNECTION_HANDLER_FOUND =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NO_CONNECTION_HANDLER_FOUND",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * No hour provided.  Use '*' to indicate any value.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_NO_CRON_HOUR_PROVIDED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CTRL_PANEL_NO_CRON_HOUR_PROVIDED",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * No minute provided.  Use '*' to indicate any value.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_NO_CRON_MINUTE_PROVIDED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CTRL_PANEL_NO_CRON_MINUTE_PROVIDED",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * No day of month provided.  Use '*' to indicate any value.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_NO_CRON_MONTH_DAY_PROVIDED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CTRL_PANEL_NO_CRON_MONTH_DAY_PROVIDED",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * No month provided.  Use '*' to indicate any value.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_NO_CRON_MONTH_PROVIDED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CTRL_PANEL_NO_CRON_MONTH_PROVIDED",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * No day of week provided.  Use '*' to indicate any value.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_NO_CRON_WEEK_DAY_PROVIDED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CTRL_PANEL_NO_CRON_WEEK_DAY_PROVIDED",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * - No Data Sources Found -
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NO_DATA_SOURCES_FOUND =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NO_DATA_SOURCES_FOUND",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * -No Databases Found-
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NO_DBS_FOUND =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NO_DBS_FOUND",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * -No Database Environment Data Found-
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NO_DB_MONITORING_FOUND =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NO_DB_MONITORING_FOUND",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * - No Entry Selected -
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NO_ENTRY_SELECTED_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NO_ENTRY_SELECTED_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * You must provide a filter for the index.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_NO_FILTER_FOR_VLV_PROVIDED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_NO_FILTER_FOR_VLV_PROVIDED",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * No indexes defined for base DN '%s'.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_NO_INDEXES_FOR_BASEDN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_NO_INDEXES_FOR_BASEDN",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * No index selected on the tree.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_NO_INDEX_SELECTED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_NO_INDEX_SELECTED",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * You must select at least one index type (approximate, equality, ordering, presence or substring).
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_NO_INDEX_TYPE_SELECTED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_NO_INDEX_TYPE_SELECTED",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * - No Item Selected -
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NO_ITEM_SELECTED_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NO_ITEM_SELECTED_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * No Matches Found
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NO_MATCHES_FOUND_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NO_MATCHES_FOUND_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * - No matching rule -
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NO_MATCHING_RULE_FOR_ATTRIBUTE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NO_MATCHING_RULE_FOR_ATTRIBUTE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * -
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NO_MONITORING_VALUE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NO_MONITORING_VALUE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * You must select at least one day of the month.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_NO_MONTH_DAY_SELECTED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CTRL_PANEL_NO_MONTH_DAY_SELECTED",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * You must select at least one operation.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NO_OPERATION_SELECTED =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NO_OPERATION_SELECTED",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * No parent backup ID provided.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_NO_PARENT_BACKUP_ID_PROVIDED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_NO_PARENT_BACKUP_ID_PROVIDED",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * You have chosen to run an incremental backup.  You must select the parent backup in the list of available parent backups.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_NO_PARENT_BACKUP_SELECTED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_NO_PARENT_BACKUP_SELECTED",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * You must provide the parent directory containing the backup files.  Then click on 'Refresh' to update the list of available backups.<br>Finally select a backup from the list.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_NO_PARENT_BACKUP_TO_VERIFY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_NO_PARENT_BACKUP_TO_VERIFY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * - No parent -
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NO_PARENT_FOR_ATTRIBUTE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NO_PARENT_FOR_ATTRIBUTE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * No Schema Item Selected
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NO_SCHEMA_ITEM_SELECTED =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NO_SCHEMA_ITEM_SELECTED",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * - No Schema Item Selected -
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NO_SCHEMA_ITEM_SELECTED_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NO_SCHEMA_ITEM_SELECTED_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * - No Tasks Found -
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NO_TASKS_FOUND =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NO_TASKS_FOUND",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * -No Task Selected-
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NO_TASK_SELECTED =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NO_TASK_SELECTED",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * -No Task Specific Details-
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NO_TASK_SPECIFIC_DETAILS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NO_TASK_SPECIFIC_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * - No Value Specified -
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NO_VALUE_SPECIFIED =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NO_VALUE_SPECIFIED",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * No VLV index name provided.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_NO_VLV_INDEX_NAME_PROVIDED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_NO_VLV_INDEX_NAME_PROVIDED",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * You must select at least one day of the week.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_NO_WEEK_DAY_SELECTED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CTRL_PANEL_NO_WEEK_DAY_SELECTED",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * Number of User Entries:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_NUMBER_OF_USER_ENTRIES_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_NUMBER_OF_USER_ENTRIES_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Object Classes
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_OBJECTCLASSES_CATEGORY_NODE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_OBJECTCLASSES_CATEGORY_NODE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Abstract
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_OBJECTCLASS_ABSTRACT_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_OBJECTCLASS_ABSTRACT_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Aliases:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_OBJECTCLASS_ALIASES_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_OBJECTCLASS_ALIASES_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Attributes:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_OBJECTCLASS_ATTRIBUTES_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_OBJECTCLASS_ATTRIBUTES_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Auxiliary
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_OBJECTCLASS_AUXILIARY_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_OBJECTCLASS_AUXILIARY_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * An object class cannot be its own superior.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_OBJECTCLASS_CANNOT_BE_ITS_SUPERIOR =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_OBJECTCLASS_CANNOT_BE_ITS_SUPERIOR",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Auxiliary: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_OBJECTCLASS_CELL_PANEL_AUXILIARY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_OBJECTCLASS_CELL_PANEL_AUXILIARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Description:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_OBJECTCLASS_DESCRIPTION_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_OBJECTCLASS_DESCRIPTION_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Object Class Details
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_OBJECTCLASS_DETAILS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_OBJECTCLASS_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * File:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_OBJECTCLASS_FILE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_OBJECTCLASS_FILE_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Object Class
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_OBJECTCLASS_FRIENDLY_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_OBJECTCLASS_FRIENDLY_NAME",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The object class is superior (directly or indirectly) of '%s'.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_OBJECTCLASS_IS_SUPERIOR_OF_SUPERIOR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_OBJECTCLASS_IS_SUPERIOR_OF_SUPERIOR",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The provided name '%s' already exists in the schema (defined as %s).
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CTRL_PANEL_OBJECTCLASS_NAME_ALREADY_IN_USE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_OBJECTCLASS_NAME_ALREADY_IN_USE",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Name:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_OBJECTCLASS_NAME_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_OBJECTCLASS_NAME_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * You must provide a name for the object class.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_OBJECTCLASS_NAME_REQUIRED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_OBJECTCLASS_NAME_REQUIRED",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Obsolete
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_OBJECTCLASS_OBSOLETE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_OBJECTCLASS_OBSOLETE_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * OID:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_OBJECTCLASS_OID_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_OBJECTCLASS_OID_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Origin:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_OBJECTCLASS_ORIGIN_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_OBJECTCLASS_ORIGIN_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Superiors:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_OBJECTCLASS_PARENTS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_OBJECTCLASS_PARENTS_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Superior:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_OBJECTCLASS_PARENT_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_OBJECTCLASS_PARENT_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Structural
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_OBJECTCLASS_STRUCTURAL_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_OBJECTCLASS_STRUCTURAL_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Type:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_OBJECTCLASS_TYPE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_OBJECTCLASS_TYPE_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * October
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_OCTOBER =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_OCTOBER",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * <html>(**)The operation is executed on its own process and could benefit from more memory allocation.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_OFFLINE_COMMAND_HELP =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_OFFLINE_COMMAND_HELP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * %s (Offline) (**)
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_OFFLINE_COMMAND_LINE_CELL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_OFFLINE_COMMAND_LINE_CELL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The provided OID '%s' already exists in the schema (defined as %s).
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CTRL_PANEL_OID_ALREADY_IN_USE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_OID_ALREADY_IN_USE",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The provided OID is not valid.  Details: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_OID_NOT_VALID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_OID_NOT_VALID",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * OK
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_OK_BUTTON_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_OK_BUTTON_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * <html>(*)The operation is executed on the server's process and the command-line does not require many resources.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ONLINE_COMMAND_HELP =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ONLINE_COMMAND_HELP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * %s (Online) (*)
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_ONLINE_COMMAND_LINE_CELL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_ONLINE_COMMAND_LINE_CELL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Only Create Base Entry
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ONLY_CREATE_BASE_ENTRY_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ONLY_CREATE_BASE_ENTRY_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Version:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_OPENDS_VERSION_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_OPENDS_VERSION_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Open Connections:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_OPEN_CONNECTIONS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_OPEN_CONNECTIONS_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Operating System
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_OPERATING_SYSTEM =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_OPERATING_SYSTEM",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Show Operations...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_OPERATIONS_VIEW =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_OPERATIONS_VIEW",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * %s:
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_OPERATION_NAME_AS_LABEL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_OPERATION_NAME_AS_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Show Columns
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_OPERATION_VIEW_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_OPERATION_VIEW_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Optional Attributes
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_OPTIONAL_ATTRIBUTES =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_OPTIONAL_ATTRIBUTES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Optional Attributes:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_OPTIONAL_ATTRIBUTES_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_OPTIONAL_ATTRIBUTES_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Ordering
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ORDERING_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ORDERING_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Other...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_OTHER_BASE_DN =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_OTHER_BASE_DN",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Other Base DN
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_OTHER_BASE_DN_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_OTHER_BASE_DN_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * If file exists, overwrite contents of file instead of appending
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_OVERWRITE_REJECTS_FILE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_OVERWRITE_REJECTS_FILE_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * If file exists, overwrite contents of file instead of appending
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_OVERWRITE_SKIPS_FILE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_OVERWRITE_SKIPS_FILE_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Pager
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_PAGER_FRIENDLY_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_PAGER_FRIENDLY_NAME",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Parent Backup ID:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_PARENT_BACKUP_ID_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_PARENT_BACKUP_ID_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Parent Backup Path:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_PARENT_BACKUP_PATH_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_PARENT_BACKUP_PATH_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Superior Class
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_PARENT_CLASS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_PARENT_CLASS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Password (confirm):
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_PASSWORD_CONFIRM_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_PASSWORD_CONFIRM_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The provided passwords do not match.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_PASSWORD_DO_NOT_MATCH =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_PASSWORD_DO_NOT_MATCH",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The path '%s' is a directory.  You must provide a file.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_PATH_IS_A_DIRECTORY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_PATH_IS_A_DIRECTORY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Please wait...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_PLEASE_WAIT_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_PLEASE_WAIT_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Address
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_POSTALADDRESS_FRIENDLY_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_POSTALADDRESS_FRIENDLY_NAME",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Postal Code
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_POSTALCODE_FRIENDLY_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_POSTALCODE_FRIENDLY_NAME",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Presence
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_PRESENCE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_PRESENCE_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Preview not available.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_PREVIEW_NOT_AVAILABLE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_PREVIEW_NOT_AVAILABLE_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Private Naming Contexts
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_PRIVATENAMINGCONTEXTS_FRIENDLY_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_PRIVATENAMINGCONTEXTS_FRIENDLY_NAME",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Details:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_PROGRESS_DIALOG_DETAILS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_PROGRESS_DIALOG_DETAILS_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Done
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_PROGRESS_DONE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_PROGRESS_DONE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Reading Configuration...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_READING_CONFIGURATION_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_READING_CONFIGURATION_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * An unexpected error occurred reading the Java settings.  Details: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_READING_JAVA_SETTINGS_DETAILS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_READING_JAVA_SETTINGS_DETAILS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Reading Java Settings...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_READING_JAVA_SETTINGS_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_READING_JAVA_SETTINGS_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Reading...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_READING_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_READING_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * An error occurred rebuilding index.  Error code: %d.
   */
  public static final MessageDescriptor.Arg1<Number> ERR_CTRL_PANEL_REBUILDING_INDEXES_ERROR_DETAILS =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_CTRL_PANEL_REBUILDING_INDEXES_ERROR_DETAILS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Error Rebuilding Indexes
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_REBUILDING_INDEXES_ERROR_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_REBUILDING_INDEXES_ERROR_SUMMARY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The indexes where successfully rebuilt.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_REBUILDING_INDEXES_SUCCESSFUL_DETAILS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_REBUILDING_INDEXES_SUCCESSFUL_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Index Rebuilding Complete
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_REBUILDING_INDEXES_SUCCESSFUL_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_REBUILDING_INDEXES_SUCCESSFUL_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Rebuilding indexes in backend '%s'...
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_REBUILDING_INDEXES_SUMMARY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_REBUILDING_INDEXES_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Rebuild Indexes
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_REBUILD_INDEXES_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_REBUILD_INDEXES_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Rebuild indexes in '%s'.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_REBUILD_INDEX_TASK_DESCRIPTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_REBUILD_INDEX_TASK_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The provided Reference Group exists but it is not a dynamic group.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_REFERENCE_GROUP_NOT_DYNAMIC =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_REFERENCE_GROUP_NOT_DYNAMIC",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The provided Reference Group could not be found.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_REFERENCE_GROUP_NOT_FOUND =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_REFERENCE_GROUP_NOT_FOUND",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The provided Dynamic Group Reference DN is not valid.  Details: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_REFERENCE_GROUP_NOT_VALID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_REFERENCE_GROUP_NOT_VALID",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The selected referral is defined in server %s and is referencing to an entry in the same server that is an ascentor of the entry.  This configuration generates a loop in the DIT structure that should be avoided.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_REFERRAL_LOOP =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_REFERRAL_LOOP",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Refreshing List...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_REFRESHING_LIST_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_REFRESHING_LIST_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Refresh
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_REFRESH_BUTTON_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_REFRESH_BUTTON_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Refresh Contents
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_REFRESH_DATA =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_REFRESH_DATA",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Refresh List
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_REFRESH_LIST_BUTTON_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_REFRESH_LIST_BUTTON_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Refresh options...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_REFRESH_MENU =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_REFRESH_MENU",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Refresh Period (sec):
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_REFRESH_OPTIONS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_REFRESH_OPTIONS_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Select the period (in seconds) used to refresh the monitoring and configuration information displayed.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_REFRESH_OPTIONS_PANEL_TEXT =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_REFRESH_OPTIONS_PANEL_TEXT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Refresh Options
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_REFRESH_PANEL_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_REFRESH_PANEL_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The rejects and skips file must have different values.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_REJECTS_AND_SKIPS_MUST_BE_DIFFERENT =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_REJECTS_AND_SKIPS_MUST_BE_DIFFERENT",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Rejects File:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_REJECTS_FILE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_REJECTS_FILE_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * You must provide a value for the rejects file.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_REJECTS_FILE_REQUIRED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_REJECTS_FILE_REQUIRED",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Reject Entries That are Not Schema-Compliant
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_REJECT_NOT_SCHEMA_COMPLIANT_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_REJECT_NOT_SCHEMA_COMPLIANT_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Remote Server:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_REMOTE_SERVER =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_REMOTE_SERVER",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The path must be accessible by the remote server.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_REMOTE_SERVER_PATH =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_REMOTE_SERVER_PATH",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Fully qualified host name of the remote server.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_REMOTE_SERVER_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_REMOTE_SERVER_TOOLTIP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Renaming entry '%s' to '%s'
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_CTRL_PANEL_RENAMING_ENTRY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_CTRL_PANEL_RENAMING_ENTRY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Requests Rejected Due To Full Queue
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_REQUESTS_REJECTED =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_REQUESTS_REJECTED",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Requests Submitted
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_REQUESTS_SUBMITTED =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_REQUESTS_SUBMITTED",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Required Attributes
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_REQUIRED_ATTRIBUTES =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_REQUIRED_ATTRIBUTES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Required Attributes:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_REQUIRED_ATTRIBUTES_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_REQUIRED_ATTRIBUTES_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * You must select a backup from the list of available backups.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_REQUIRED_BACKUP_TO_VERIFY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_REQUIRED_BACKUP_TO_VERIFY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Required By:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_REQUIRED_BY_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_REQUIRED_BY_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * (*) Requires Rebuild
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_REQUIRES_REBUILD_LEGEND =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_REQUIRES_REBUILD_LEGEND",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Updating password of entry '%s'
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_RESETTING_USER_PASSWORD =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_RESETTING_USER_PASSWORD",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * An error occurred updating user password.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_RESETTING_USER_PASSWORD_ERROR_DETAILS =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_RESETTING_USER_PASSWORD_ERROR_DETAILS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Error updating user password
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_RESETTING_USER_PASSWORD_ERROR_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_RESETTING_USER_PASSWORD_ERROR_SUMMARY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The user password was successfully updated.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_RESETTING_USER_PASSWORD_SUCCESSFUL_DETAILS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_RESETTING_USER_PASSWORD_SUCCESSFUL_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * User Password Updated
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_RESETTING_USER_PASSWORD_SUCCESSFUL_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_RESETTING_USER_PASSWORD_SUCCESSFUL_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Resetting user password...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_RESETTING_USER_PASSWORD_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_RESETTING_USER_PASSWORD_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Password (confirm):
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_RESET_USER_PASSWORD_CONFIRM_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_RESET_USER_PASSWORD_CONFIRM_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * DN:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_RESET_USER_PASSWORD_DN_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_RESET_USER_PASSWORD_DN_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Reset User Password...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_RESET_USER_PASSWORD_MENU =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_RESET_USER_PASSWORD_MENU",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Name:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_RESET_USER_PASSWORD_NAME_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_RESET_USER_PASSWORD_NAME_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * New User Password:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_RESET_USER_PASSWORD_PWD_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_RESET_USER_PASSWORD_PWD_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Reset password for entry '%s'.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_RESET_USER_PASSWORD_TASK_DESCRIPTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_RESET_USER_PASSWORD_TASK_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Reset User Password
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_RESET_USER_PASSWORD_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_RESET_USER_PASSWORD_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The error occurred solving referral '%s'.<br>Details: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CTRL_PANEL_RESOLVING_REFERRAL_DETAILS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_RESOLVING_REFERRAL_DETAILS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * An error occurred restarting the server.  Error code: %d
   */
  public static final MessageDescriptor.Arg1<Number> ERR_CTRL_PANEL_RESTARTING_SERVER_ERROR_DETAILS =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_CTRL_PANEL_RESTARTING_SERVER_ERROR_DETAILS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Error during server restart
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_RESTARTING_SERVER_ERROR_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_RESTARTING_SERVER_ERROR_SUMMARY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The server restarted successfully
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_RESTARTING_SERVER_SUCCESSFUL_DETAILS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_RESTARTING_SERVER_SUCCESSFUL_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Restart Complete
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_RESTARTING_SERVER_SUCCESSFUL_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_RESTARTING_SERVER_SUCCESSFUL_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Restart Server
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_RESTART_SERVER_PROGRESS_DLG_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_RESTART_SERVER_PROGRESS_DLG_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Restart Server.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_RESTART_SERVER_TASK_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_RESTART_SERVER_TASK_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Restore from Backup
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_RESTORE_PANEL_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_RESTORE_PANEL_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Restore the contents of backup '%s' located in directory '%s'.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_CTRL_PANEL_RESTORE_TASK_DESCRIPTION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_CTRL_PANEL_RESTORE_TASK_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * An error occurred during the restore.  Error code: %d.
   */
  public static final MessageDescriptor.Arg1<Number> ERR_CTRL_PANEL_RESTORING_ERROR_DETAILS =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_CTRL_PANEL_RESTORING_ERROR_DETAILS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Error during Restore
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_RESTORING_ERROR_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_RESTORING_ERROR_SUMMARY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The restore finished successfully
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_RESTORING_SUCCESSFUL_DETAILS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_RESTORING_SUCCESSFUL_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Restore Complete
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_RESTORING_SUCCESSFUL_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_RESTORING_SUCCESSFUL_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Restoring contents of backup '%s'...
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_RESTORING_SUMMARY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_RESTORING_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The following tasks are running:<br>%s<br><br>If you connect to another server the tasks will continue but you will have to check the log files to see if they complete successfully.<br><br>Do you want to continue?
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_RUNNING_TASKS_CHANGE_SERVER_CONFIRMATION_DETAILS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_RUNNING_TASKS_CHANGE_SERVER_CONFIRMATION_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The following tasks are running:<br>%s<br><br>If you exit the tasks will continue but you will have to check the log files to see if they complete successfully.<br><br>Do you want to continue?
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_RUNNING_TASKS_CONFIRMATION_DETAILS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_RUNNING_TASKS_CONFIRMATION_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Creating backup of all backends...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_RUN_BACKUP_ALL_BACKENDS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_RUN_BACKUP_ALL_BACKENDS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * An error occurred during the backup.  Error code: %d.
   */
  public static final MessageDescriptor.Arg1<Number> ERR_CTRL_PANEL_RUN_BACKUP_ERROR_DETAILS =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_CTRL_PANEL_RUN_BACKUP_ERROR_DETAILS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Error during Backup
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_RUN_BACKUP_ERROR_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_RUN_BACKUP_ERROR_SUMMARY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The backup finished successfully.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_RUN_BACKUP_SUCCESSFUL_DETAILS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_RUN_BACKUP_SUCCESSFUL_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Backup Complete
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_RUN_BACKUP_SUCCESSFUL_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_RUN_BACKUP_SUCCESSFUL_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Creating backup of backend '%s'...
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_RUN_BACKUP_SUMMARY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_RUN_BACKUP_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Save
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SAVE_BUTTON_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SAVE_BUTTON_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Save Changes
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SAVE_CHANGES_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SAVE_CHANGES_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * To see the list of scheduled tasks you must provide authentication.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SCHEDULED_TASK_LIST_AUTHENTICATION =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SCHEDULED_TASK_LIST_AUTHENTICATION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * To see the list of scheduled tasks the server must be running and you must provide authentication.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SCHEDULED_TASK_LIST_REQUIRES_SERVER_RUNNING =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SCHEDULED_TASK_LIST_REQUIRES_SERVER_RUNNING",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * View Schema Element
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SCHEMA_BROWSER_RIGHT_PANEL_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SCHEMA_BROWSER_RIGHT_PANEL_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Name
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SCHEMA_ELEMENT_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SCHEMA_ELEMENT_NAME",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Number of Elements: %d
   */
  public static final MessageDescriptor.Arg1<Number> INFO_CTRL_PANEL_SCHEMA_ELEMENT_NUMBER =
          new MessageDescriptor.Arg1<Number>(BASE,"INFO_CTRL_PANEL_SCHEMA_ELEMENT_NUMBER",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Type
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SCHEMA_ELEMENT_TYPE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SCHEMA_ELEMENT_TYPE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The file (under 'config%sschema') where the attribute definition will be stored.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_SCHEMA_FILE_ATTRIBUTE_HELP =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_SCHEMA_FILE_ATTRIBUTE_HELP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The file (under 'config%sschema') where the object class definition will be stored.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_SCHEMA_FILE_OBJECTCLASS_HELP =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_SCHEMA_FILE_OBJECTCLASS_HELP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The schema could not be found.  Check main panel for more information.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_SCHEMA_NOT_FOUND_DETAILS =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_SCHEMA_NOT_FOUND_DETAILS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Could not find schema
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_SCHEMA_NOT_FOUND_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_SCHEMA_NOT_FOUND_SUMMARY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Schema Validation:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SCHEMA_VALIDATION_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SCHEMA_VALIDATION_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Searches Done
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SEARCH_DONE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SEARCH_DONE_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Search Requests
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SEARCH_REQUESTS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SEARCH_REQUESTS_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Selected Indexes:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SELECTED_INDEXES_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SELECTED_INDEXES_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Selected:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SELECTED_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SELECTED_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Select All
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SELECT_ALL_BUTTON =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SELECT_ALL_BUTTON",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Select the Backends to Delete:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SELECT_BACKENDS_TO_DELETE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SELECT_BACKENDS_TO_DELETE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Select the Base DN's to Delete:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SELECT_BASE_DNS_TO_DELETE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SELECT_BASE_DNS_TO_DELETE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Separated with commas
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SEPARATED_WITH_COMMAS_HELP =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SEPARATED_WITH_COMMAS_HELP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Separate multiple attributes with a comma (,)
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SEPARATE_ATTRIBUTES_COMMA =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SEPARATE_ATTRIBUTES_COMMA",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Separate multiple DN's with a line break
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SEPARATE_DNS_LINE_BREAK =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SEPARATE_DNS_LINE_BREAK",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * September
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SEPTEMBER =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SEPTEMBER",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Server Details
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SERVER_DETAILS_TITLE_BORDER =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SERVER_DETAILS_TITLE_BORDER",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The Java Settings can only be updated when the managed server is the local server.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SERVER_MUST_BE_LOCAL_JAVA_PROPERTIES_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SERVER_MUST_BE_LOCAL_JAVA_PROPERTIES_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The indexes can only be rebuilt when the managed server is the local server.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SERVER_MUST_BE_LOCAL_REBUILD_INDEX_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SERVER_MUST_BE_LOCAL_REBUILD_INDEX_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The indexes can only be verified when the managed server is the local server.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SERVER_MUST_BE_LOCAL_VERIFY_INDEX_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SERVER_MUST_BE_LOCAL_VERIFY_INDEX_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The Windows Service configuration can only be viewed and updated when the managed server is the local server.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SERVER_MUST_BE_LOCAL_WINDOWS_SERVICE_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SERVER_MUST_BE_LOCAL_WINDOWS_SERVICE_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * To see the monitoring data the server must be running and you must provide authentication.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SERVER_MUST_RUN_TO_BROWSE_MONITORING_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SERVER_MUST_RUN_TO_BROWSE_MONITORING_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * To see the monitoring data the server must be running and you must provide authentication.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SERVER_MUST_RUN_TO_SEE_TRAFFIC_MONITORING_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SERVER_MUST_RUN_TO_SEE_TRAFFIC_MONITORING_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * To browse data the server must be running and you must provide authentication.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SERVER_NOT_RUNNING_DETAILS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SERVER_NOT_RUNNING_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Server Not Running
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SERVER_NOT_RUNNING_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SERVER_NOT_RUNNING_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Server is Remote
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SERVER_REMOTE_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SERVER_REMOTE_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * %s (Server Runtime)
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_SERVER_RUNTIME_CELL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_SERVER_RUNTIME_CELL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Server Status:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SERVER_STATUS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SERVER_STATUS_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Server Status
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SERVER_STATUS_TITLE_BORDER =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SERVER_STATUS_TITLE_BORDER",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Server Stopped
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SERVER_STOPPED =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SERVER_STOPPED",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Error setting environment: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_SETTING_ENVIRONMENT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CTRL_PANEL_SETTING_ENVIRONMENT",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * Only Show Attributes with Values
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SHOW_ATTRS_WITH_VALUES_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SHOW_ATTRS_WITH_VALUES_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Show Averages since Server Startup
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SHOW_AVERAGES =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SHOW_AVERAGES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Sign Message Digest Hash
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SIGN_MESSAGE_DIGEST_HASH_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SIGN_MESSAGE_DIGEST_HASH_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Simplified View
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SIMPLIFIED_VIEW_MENU =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SIMPLIFIED_VIEW_MENU",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Skips File:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SKIPS_FILE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SKIPS_FILE_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * You must provide a value for the skips file.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_SKIPS_FILE_REQUIRED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_SKIPS_FILE_REQUIRED",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Last Name
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SN_FRIENDLY_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SN_FRIENDLY_NAME",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Sort User Data
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SORT_USER_DATA =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SORT_USER_DATA",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * - Specify the value in Base 64 -
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SPECIFY_CONTENTS_IN_BASE_64 =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SPECIFY_CONTENTS_IN_BASE_64",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Multiple Superiors...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SPECIFY_MULTIPLE_SUPERIORS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SPECIFY_MULTIPLE_SUPERIORS_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Click on this button to specify multiple superiors for this object class.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SPECIFY_MULTIPLE_SUPERIORS_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SPECIFY_MULTIPLE_SUPERIORS_TOOLTIP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Standard
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_STANDARD_ATTRIBUTES_CATEGORY_NODE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_STANDARD_ATTRIBUTES_CATEGORY_NODE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Standard Attributes
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_STANDARD_ATTRIBUTES_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_STANDARD_ATTRIBUTES_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Standard Attribute
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_STANDARD_ATTRIBUTE_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_STANDARD_ATTRIBUTE_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Standard
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_STANDARD_OBJECTCLASSES_CATEGORY_NODE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_STANDARD_OBJECTCLASSES_CATEGORY_NODE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Standard Object Class
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_STANDARD_OBJECTCLASS_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_STANDARD_OBJECTCLASS_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * An error occurred starting the server.  Error code: %d
   */
  public static final MessageDescriptor.Arg1<Number> ERR_CTRL_PANEL_STARTING_SERVER_ERROR_DETAILS =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_CTRL_PANEL_STARTING_SERVER_ERROR_DETAILS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Error during server start
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_STARTING_SERVER_ERROR_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_STARTING_SERVER_ERROR_SUMMARY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The server started successfully
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_STARTING_SERVER_SUCCESSFUL_DETAILS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_STARTING_SERVER_SUCCESSFUL_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Start Complete
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_STARTING_SERVER_SUCCESSFUL_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_STARTING_SERVER_SUCCESSFUL_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Starting Server...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_STARTING_SERVER_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_STARTING_SERVER_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Start Server
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_START_SERVER_PROGRESS_DLG_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_START_SERVER_PROGRESS_DLG_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Start Server.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_START_SERVER_TASK_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_START_SERVER_TASK_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Start Time:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_START_TIME_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_START_TIME_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Static Group
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_STATIC_GROUP_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_STATIC_GROUP_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * General Status
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_STATUS_PANEL_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_STATUS_PANEL_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * An error occurred stopping the server.  Error code: %d
   */
  public static final MessageDescriptor.Arg1<Number> ERR_CTRL_PANEL_STOPPING_SERVER_ERROR_DETAILS =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_CTRL_PANEL_STOPPING_SERVER_ERROR_DETAILS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Error during Server Stop
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_STOPPING_SERVER_ERROR_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_STOPPING_SERVER_ERROR_SUMMARY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The command-line %s returned successfully but the server appears to be running.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_STOPPING_SERVER_POST_CMD_LINE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_STOPPING_SERVER_POST_CMD_LINE",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The server stopped successfully
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_STOPPING_SERVER_SUCCESSFUL_DETAILS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_STOPPING_SERVER_SUCCESSFUL_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Stop Complete
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_STOPPING_SERVER_SUCCESSFUL_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_STOPPING_SERVER_SUCCESSFUL_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Stopping Server...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_STOPPING_SERVER_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_STOPPING_SERVER_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Stop Server
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_STOP_SERVER_PROGRESS_DLG_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_STOP_SERVER_PROGRESS_DLG_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Stop Server.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_STOP_SERVER_TASK_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_STOP_SERVER_TASK_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Street Address
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_STREET_FRIENDLY_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_STREET_FRIENDLY_NAME",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Structural Object Class:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_STRUCTURAL_OBJECTCLASS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_STRUCTURAL_OBJECTCLASS_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * State
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_ST_FRIENDLY_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_ST_FRIENDLY_NAME",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Substring
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SUBSTRING_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SUBSTRING_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Use '*' for substring search.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SUBSTRING_SEARCH_INLINE_HELP =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SUBSTRING_SEARCH_INLINE_HELP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * For example: dc=subtree,dc=example,dc=com
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SUBTREE_INLINE_HELP_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SUBTREE_INLINE_HELP_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Specify the superior object classes.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SUPERIOR_OBJECTCLASSES_INSTRUCTIONS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SUPERIOR_OBJECTCLASSES_INSTRUCTIONS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Superior Object Classes
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SUPERIOR_OBJECTCLASSES_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SUPERIOR_OBJECTCLASSES_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Supported Controls
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SUPPORTEDCONTROLS_FRIENDLY_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SUPPORTEDCONTROLS_FRIENDLY_NAME",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Supported Extensions
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SUPPORTEDEXTENSIONS_FRIENDLY_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SUPPORTEDEXTENSIONS_FRIENDLY_NAME",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Supported Features
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SUPPORTEDFEATURES_FRIENDLY_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SUPPORTEDFEATURES_FRIENDLY_NAME",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Supported LDAP Versions
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SUPPORTEDLDAPVERSIONS_FRIENDLY_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SUPPORTEDLDAPVERSIONS_FRIENDLY_NAME",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Supported Password Schemes
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SUPPORTEDPWDSCHEMES_FRIENDLY_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SUPPORTEDPWDSCHEMES_FRIENDLY_NAME",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Entry syntax is correct
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SYNTAX_CORRECT_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SYNTAX_CORRECT_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The syntax defines the type of value of the attribute
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SYNTAX_INLINE_HELP =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SYNTAX_INLINE_HELP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * System Information
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SYSTEM_INFORMATION =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SYSTEM_INFORMATION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * ds-generic.png
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SYSTEM_INFORMATION_TREE_NODE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SYSTEM_INFORMATION_TREE_NODE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * System Name
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_SYSTEM_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_SYSTEM_NAME",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Show Task Attributes...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_TASK_ATTRIBUTES_VIEW =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_TASK_ATTRIBUTES_VIEW",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Is Cancelable
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_TASK_CANCELABLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_TASK_CANCELABLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Cancelable
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_TASK_IS_CANCELABLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_TASK_IS_CANCELABLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Not Cancelable
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_TASK_IS_NOT_CANCELABLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_TASK_IS_NOT_CANCELABLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Task Log Message(s)
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_TASK_LOG_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_TASK_LOG_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Task Specific Details
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_TASK_SPECIFIC_DETAILS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_TASK_SPECIFIC_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Launch Periodically using a CRON Schedule
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_TASK_TO_SCHEDULE_CRON =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_TASK_TO_SCHEDULE_CRON",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Hour:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_TASK_TO_SCHEDULE_CRON_HOUR =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_TASK_TO_SCHEDULE_CRON_HOUR",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Minute:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_TASK_TO_SCHEDULE_CRON_MINUTE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_TASK_TO_SCHEDULE_CRON_MINUTE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Month:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_TASK_TO_SCHEDULE_CRON_MONTH =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_TASK_TO_SCHEDULE_CRON_MONTH",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Day of Month:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_TASK_TO_SCHEDULE_CRON_MONTH_DAY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_TASK_TO_SCHEDULE_CRON_MONTH_DAY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Day of Week:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_TASK_TO_SCHEDULE_CRON_WEEK_DAY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_TASK_TO_SCHEDULE_CRON_WEEK_DAY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Launch Periodically using a Daily Schedule
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_TASK_TO_SCHEDULE_DAILY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_TASK_TO_SCHEDULE_DAILY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Day:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_TASK_TO_SCHEDULE_DAY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_TASK_TO_SCHEDULE_DAY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Fri
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_TASK_TO_SCHEDULE_FRIDAY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_TASK_TO_SCHEDULE_FRIDAY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Scheduled Tasks
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_TASK_TO_SCHEDULE_LIST_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_TASK_TO_SCHEDULE_LIST_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Mon
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_TASK_TO_SCHEDULE_MONDAY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_TASK_TO_SCHEDULE_MONDAY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Month:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_TASK_TO_SCHEDULE_MONTH =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_TASK_TO_SCHEDULE_MONTH",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Launch Periodically using a Monthly Schedule
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_TASK_TO_SCHEDULE_MONTHLY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_TASK_TO_SCHEDULE_MONTHLY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Sat
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_TASK_TO_SCHEDULE_SATURDAY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_TASK_TO_SCHEDULE_SATURDAY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Specify when the task '%s' will be launched.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_TASK_TO_SCHEDULE_SUMMARY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_TASK_TO_SCHEDULE_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Sun
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_TASK_TO_SCHEDULE_SUNDAY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_TASK_TO_SCHEDULE_SUNDAY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Thu
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_TASK_TO_SCHEDULE_THURSDAY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_TASK_TO_SCHEDULE_THURSDAY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Time:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_TASK_TO_SCHEDULE_TIME =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_TASK_TO_SCHEDULE_TIME",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Hour (from 00:00 to 23:59) in the time zone of the server host.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_TASK_TO_SCHEDULE_TIME_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_TASK_TO_SCHEDULE_TIME_TOOLTIP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * '%s' Task Schedule
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_TASK_TO_SCHEDULE_TITLE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_TASK_TO_SCHEDULE_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Tue
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_TASK_TO_SCHEDULE_TUESDAY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_TASK_TO_SCHEDULE_TUESDAY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Wed
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_TASK_TO_SCHEDULE_WEDNESDAY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_TASK_TO_SCHEDULE_WEDNESDAY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Launch Periodically using a Weekly Schedule
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_TASK_TO_SCHEDULE_WEEKLY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_TASK_TO_SCHEDULE_WEEKLY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Year:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_TASK_TO_SCHEDULE_YEAR =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_TASK_TO_SCHEDULE_YEAR",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Telephone Number
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_TELEPHONENUMBER_FRIENDLY_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_TELEPHONENUMBER_FRIENDLY_NAME",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Thumbnail
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_THUMBNAIL_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_THUMBNAIL_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Total Connections:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_TOTAL_CONNECTIONS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_TOTAL_CONNECTIONS_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * TOTAL
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_TOTAL_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_TOTAL_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * attribute
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_TYPE_ATTRIBUTE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_TYPE_ATTRIBUTE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * syntax
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_TYPE_ATTRIBUTE_SYNTAX =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_TYPE_ATTRIBUTE_SYNTAX",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * matching rule
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_TYPE_MATCHING_RULE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_TYPE_MATCHING_RULE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * object class
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_TYPE_OBJECT_CLASS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_TYPE_OBJECT_CLASS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * User ID
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_UID_FRIENDLY_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_UID_FRIENDLY_NAME",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Unbind Requests
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_UNBIND_REQUESTS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_UNBIND_REQUESTS_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Unexpected error. Details: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_UNEXPECTED_DETAILS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CTRL_PANEL_UNEXPECTED_DETAILS",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * Members of Group
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_UNIQUEMEMBER_FRIENDLY_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_UNIQUEMEMBER_FRIENDLY_NAME",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Save Changes to attribute: '%s'?
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_UNSAVED_ATTRIBUTE_CHANGES_DETAILS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_UNSAVED_ATTRIBUTE_CHANGES_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Unsaved Changes
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_UNSAVED_CHANGES_DIALOG_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_UNSAVED_CHANGES_DIALOG_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Unsaved Changes
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_UNSAVED_CHANGES_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_UNSAVED_CHANGES_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Save Changes to entry: '%s'?
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_UNSAVED_ENTRY_CHANGES_DETAILS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_UNSAVED_ENTRY_CHANGES_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Save Changes to index: '%s'?
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_UNSAVED_INDEX_CHANGES_DETAILS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_UNSAVED_INDEX_CHANGES_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Save Changes to object class: '%s'?
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_UNSAVED_OBJECTCLASS_CHANGES_DETAILS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_UNSAVED_OBJECTCLASS_CHANGES_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Update Java Settings.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_UPDATE_JAVA_SETTINGS_TASK_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_UPDATE_JAVA_SETTINGS_TASK_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Change...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_UPDATE_MULTIPLE_SUPERIORS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_UPDATE_MULTIPLE_SUPERIORS_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Click on this button to specify the superiors of this object class.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_UPDATE_MULTIPLE_SUPERIORS_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_UPDATE_MULTIPLE_SUPERIORS_TOOLTIP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Java Settings Updated
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_UPDATING_JAVA_SETTINGS_COMPLETE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_UPDATING_JAVA_SETTINGS_COMPLETE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * An error occurred updating Java settings.  Error code: %d
   */
  public static final MessageDescriptor.Arg1<Number> ERR_CTRL_PANEL_UPDATING_JAVA_SETTINGS_ERROR_CODE =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_CTRL_PANEL_UPDATING_JAVA_SETTINGS_ERROR_CODE",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * An error occurred updating Java settings.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_UPDATING_JAVA_SETTINGS_ERROR_DETAILS =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_UPDATING_JAVA_SETTINGS_ERROR_DETAILS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Error updating Java properties
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_UPDATING_JAVA_SETTINGS_ERROR_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_UPDATING_JAVA_SETTINGS_ERROR_SUMMARY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The Java settings were successfully updated.  When the command-lines are executed the new settings will be taken into account.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_UPDATING_JAVA_SETTINGS_SUCCESSFUL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_UPDATING_JAVA_SETTINGS_SUCCESSFUL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Updating Java settings...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_UPDATING_JAVA_SETTINGS_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_UPDATING_JAVA_SETTINGS_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Modifying Index
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_UPDATING_JAVA_SETTINGS_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_UPDATING_JAVA_SETTINGS_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Adding schema elements to schema file '%s'...
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_UPDATING_SCHEMA_FILE_PROGRESS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_UPDATING_SCHEMA_FILE_PROGRESS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Up Time:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_UP_TIME_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_UP_TIME_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Used by attributes:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_USED_BY_ATTRIBUTES =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_USED_BY_ATTRIBUTES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Used Memory in JVM
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_USED_MEMORY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_USED_MEMORY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * User Certificate
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_USERCERTIFICATE_FRIENDLY_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_USERCERTIFICATE_FRIENDLY_NAME",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * User Password
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_USERPASSWORD_FRIENDLY_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_USERPASSWORD_FRIENDLY_NAME",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Users
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_USERS_FILTER =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_USERS_FILTER",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * You must provide a value for 'Common Name'.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_USER_COMMON_NAME_REQUIRED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_USER_COMMON_NAME_REQUIRED",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * You must provide a value for 'Last Name'.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_USER_LAST_NAME_REQUIRED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_USER_LAST_NAME_REQUIRED",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * You must provide a value for the naming attribute '%s'.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CTRL_PANEL_USER_NAMING_ATTRIBUTE_REQUIRED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_USER_NAMING_ATTRIBUTE_REQUIRED",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Specify binary contents in base 64 format:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_USE_CONTENTS_IN_BASE_64 =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_USE_CONTENTS_IN_BASE_64",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Use contents of file:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_USE_CONTENTS_OF_FILE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_USE_CONTENTS_OF_FILE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Use the value of the environment variable OPENDS_JAVA_ARGS
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_USE_OPENDS_JAVA_ARGS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_USE_OPENDS_JAVA_ARGS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * If OPENDS_JAVA_ARGS is not defined the values specified below will be used as fallback.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_USE_OPENDS_JAVA_ARGS_HELP =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_USE_OPENDS_JAVA_ARGS_HELP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Use the value of the environment variable OPENDS_JAVA_HOME
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_USE_OPENDS_JAVA_HOME =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_USE_OPENDS_JAVA_HOME",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * If OPENDS_JAVA_HOME is not defined the value below will be used as fallback.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_USE_OPENDS_JAVA_HOME_HELP =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_USE_OPENDS_JAVA_HOME_HELP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Use the values specified below
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_USE_SPECIFIED_OPENDS_JAVA_ARGS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_USE_SPECIFIED_OPENDS_JAVA_ARGS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * If the value is not specified for a command-line the value of OPENDS_JAVA_ARGS will be used as fallback.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_USE_SPECIFIED_OPENDS_JAVA_ARGS_HELP =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_USE_SPECIFIED_OPENDS_JAVA_ARGS_HELP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Use the following value:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_USE_SPECIFIED_OPENDS_JAVA_HOME =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_USE_SPECIFIED_OPENDS_JAVA_HOME",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * If the value is not found launching the command-line the value of OPENDS_JAVA_HOME will be used as fallback.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_USE_SPECIFIED_OPENDS_JAVA_HOME_HELP =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_USE_SPECIFIED_OPENDS_JAVA_HOME_HELP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * - Value in Base64 -
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VALUE_IN_BASE64 =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VALUE_IN_BASE64",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Value in base 64 format:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VALUE_IN_BASE_64_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VALUE_IN_BASE_64_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * You must provide a value in Base 64 format.
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_VALUE_IN_BASE_64_REQUIRED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_VALUE_IN_BASE_64_REQUIRED",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Vendor Name
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VENDORNAME_FRIENDLY_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VENDORNAME_FRIENDLY_NAME",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Vendor Version
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VENDORVERSION_FRIENDLY_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VENDORVERSION_FRIENDLY_NAME",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Verifying Authentication...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VERIFYING_AUTHENTICATION_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VERIFYING_AUTHENTICATION_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * An error occurred during the backup verification.  Error code: %d.
   */
  public static final MessageDescriptor.Arg1<Number> ERR_CTRL_PANEL_VERIFYING_BACKUP_ERROR_DETAILS =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_CTRL_PANEL_VERIFYING_BACKUP_ERROR_DETAILS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Error during Backup Verification
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_VERIFYING_BACKUP_ERROR_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_VERIFYING_BACKUP_ERROR_SUMMARY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The verification of the backup finished successfully.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VERIFYING_BACKUP_SUCCESSFUL_DETAILS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VERIFYING_BACKUP_SUCCESSFUL_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Verify Complete
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VERIFYING_BACKUP_SUCCESSFUL_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VERIFYING_BACKUP_SUCCESSFUL_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Verifying contents of backup '%s'...
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_VERIFYING_BACKUP_SUMMARY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_VERIFYING_BACKUP_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * An error occurred during the index verification.  Error code: %d.
   */
  public static final MessageDescriptor.Arg1<Number> ERR_CTRL_PANEL_VERIFYING_INDEXES_ERROR_DETAILS =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_CTRL_PANEL_VERIFYING_INDEXES_ERROR_DETAILS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Error during Index Verification
   */
  public static final MessageDescriptor.Arg0 ERR_CTRL_PANEL_VERIFYING_INDEXES_ERROR_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CTRL_PANEL_VERIFYING_INDEXES_ERROR_SUMMARY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The indexes where successfully verified.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VERIFYING_INDEXES_SUCCESSFUL_DETAILS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VERIFYING_INDEXES_SUCCESSFUL_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Index Verification Complete
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VERIFYING_INDEXES_SUCCESSFUL_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VERIFYING_INDEXES_SUCCESSFUL_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Verifying contents of indexes in '%s'...
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_VERIFYING_INDEXES_SUMMARY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_VERIFYING_INDEXES_SUMMARY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Verify All Index Key Entry ID's are Clean and Refer to Existing Entries
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VERIFY_ALL_KEYS =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VERIFY_ALL_KEYS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Verify Backup
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VERIFY_BACKUP_BUTTON_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VERIFY_BACKUP_BUTTON_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Verify Backup
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VERIFY_BACKUP_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VERIFY_BACKUP_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Verify Entry Contents are Properly Indexed
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VERIFY_ENTRY_CONTEXT_ARE_INDEXES =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VERIFY_ENTRY_CONTEXT_ARE_INDEXES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Verify Indexes
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VERIFY_INDEXES_PANEL_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VERIFY_INDEXES_PANEL_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Verify indexes in '%s'.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_VERIFY_INDEX_TASK_DESCRIPTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_VERIFY_INDEX_TASK_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Verify the contents of  backup '%s' located in directory '%s'.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_CTRL_PANEL_VERIFY_TASK_DESCRIPTION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_CTRL_PANEL_VERIFY_TASK_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * View binary attribute
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VIEW_BINARY_ATTRIBUTE_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VIEW_BINARY_ATTRIBUTE_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * View...
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VIEW_BUTTON_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VIEW_BUTTON_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * View
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VIEW_MENU =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VIEW_MENU",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The view menu
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VIEW_MENU_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VIEW_MENU_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Virtual Static Group
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VIRTUAL_STATIC_GROUP_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VIRTUAL_STATIC_GROUP_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * (ascending)
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VLV_ASCENDING_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VLV_ASCENDING_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * %s (ascending)
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_VLV_ASCENDING_VLV_INDEX =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_VLV_ASCENDING_VLV_INDEX",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * (descending)
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VLV_DESCENDING_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VLV_DESCENDING_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * %s (descending)
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_VLV_DESCENDING_VLV_INDEX =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_VLV_DESCENDING_VLV_INDEX",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * VLV Indexes
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VLV_INDEXES =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VLV_INDEXES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * VLV Indexes
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VLV_INDEXES_CATEGORY_NODE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VLV_INDEXES_CATEGORY_NODE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Base DN
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VLV_INDEXES_HEADER_BASE_DN =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VLV_INDEXES_HEADER_BASE_DN",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Filter
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VLV_INDEXES_HEADER_FILTER =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VLV_INDEXES_HEADER_FILTER",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Name
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VLV_INDEXES_HEADER_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VLV_INDEXES_HEADER_NAME",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Requires Rebuild
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VLV_INDEXES_HEADER_REQUIRES_REBUILD =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VLV_INDEXES_HEADER_REQUIRES_REBUILD",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Scope
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VLV_INDEXES_HEADER_SCOPE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VLV_INDEXES_HEADER_SCOPE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Sort Order
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VLV_INDEXES_HEADER_SORT_ORDER =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VLV_INDEXES_HEADER_SORT_ORDER",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * In order this VLV index to be effective the following indexes must be configured in '%s':<br>%s <br><br>Do you want to continue?
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_CTRL_PANEL_VLV_INDEXES_NOT_DEFINED_CONFIRMATION_MSG =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_CTRL_PANEL_VLV_INDEXES_NOT_DEFINED_CONFIRMATION_MSG",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Indexes Not Defined
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VLV_INDEXES_NOT_DEFINED_CONFIRMATION_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VLV_INDEXES_NOT_DEFINED_CONFIRMATION_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Add
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VLV_INDEX_ADD_BUTTON_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VLV_INDEX_ADD_BUTTON_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * There is already a VLV index '%s' defined in backend '%s'.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CTRL_PANEL_VLV_INDEX_ALREADY_DEFINED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CTRL_PANEL_VLV_INDEX_ALREADY_DEFINED",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * approximate
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VLV_INDEX_APPROXIMATE_TYPE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VLV_INDEX_APPROXIMATE_TYPE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Base DN:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VLV_INDEX_BASE_DN_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VLV_INDEX_BASE_DN_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Base Object
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VLV_INDEX_BASE_OBJECT_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VLV_INDEX_BASE_OBJECT_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * %s - VLV Index
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CTRL_PANEL_VLV_INDEX_CELL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CTRL_PANEL_VLV_INDEX_CELL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * VLV Index Details
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VLV_INDEX_DETAILS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VLV_INDEX_DETAILS_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * equality
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VLV_INDEX_EQUALITY_TYPE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VLV_INDEX_EQUALITY_TYPE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Filter:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VLV_INDEX_FILTER_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VLV_INDEX_FILTER_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Max Block Size:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VLV_INDEX_MAX_BLOCK_SIZE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VLV_INDEX_MAX_BLOCK_SIZE_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Move Down
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VLV_INDEX_MOVE_DOWN_BUTTON_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VLV_INDEX_MOVE_DOWN_BUTTON_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Move Up
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VLV_INDEX_MOVE_UP_BUTTON_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VLV_INDEX_MOVE_UP_BUTTON_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Name:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VLV_INDEX_NAME_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VLV_INDEX_NAME_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * ordering
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VLV_INDEX_ORDERING_TYPE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VLV_INDEX_ORDERING_TYPE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * VLV Index Properties
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VLV_INDEX_PANEL_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VLV_INDEX_PANEL_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * presence
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VLV_INDEX_PRESENCE_TYPE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VLV_INDEX_PRESENCE_TYPE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Remove
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VLV_INDEX_REMOVE_BUTTON_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VLV_INDEX_REMOVE_BUTTON_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Search Filter:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VLV_INDEX_SEARCH_FILTER_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VLV_INDEX_SEARCH_FILTER_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Search Scope:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VLV_INDEX_SEARCH_SCOPE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VLV_INDEX_SEARCH_SCOPE_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Single Level
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VLV_INDEX_SINGLE_LEVEL_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VLV_INDEX_SINGLE_LEVEL_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Sort Order:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VLV_INDEX_SORT_ORDER_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VLV_INDEX_SORT_ORDER_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Subordinate Subtree
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VLV_INDEX_SUBORDINATE_SUBTREE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VLV_INDEX_SUBORDINATE_SUBTREE_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * substring
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VLV_INDEX_SUBSTRING_TYPE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VLV_INDEX_SUBSTRING_TYPE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Whole Subtree
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VLV_INDEX_WHOLE_SUBTREE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VLV_INDEX_WHOLE_SUBTREE_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Other:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_VLV_OTHER_BASE_DN_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_VLV_OTHER_BASE_DN_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Windows Service Integration:
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_WINDOWS_SERVICE_INTEGRATION_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_WINDOWS_SERVICE_INTEGRATION_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * This page indicates whether this server instance is configured to run as a Windows Service. To manage auto-start and other features, run the Windows Service Control Manager of the operating system.
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_WINDOWS_SERVICE_PANEL_TEXT =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_WINDOWS_SERVICE_PANEL_TEXT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Windows Service Configuration
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_WINDOWS_SERVICE_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_WINDOWS_SERVICE_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Work Queue
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_WORK_QUEUE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_WORK_QUEUE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * ds-generic.png
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_WORK_QUEUE_TREE_NODE =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_WORK_QUEUE_TREE_NODE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Write Rejected Entries to a File
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_WRITE_REJECTS_FILE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_WRITE_REJECTS_FILE_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Write Skipped Entries to a File
   */
  public static final MessageDescriptor.Arg0 INFO_CTRL_PANEL_WRITE_SKIPS_FILE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_CTRL_PANEL_WRITE_SKIPS_FILE_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Data Sources
   */
  public static final MessageDescriptor.Arg0 INFO_DATABASES_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_DATABASES_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Delete these Database Files
   */
  public static final MessageDescriptor.Arg0 INFO_DELETE_OUTSIDE_DBS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_DELETE_OUTSIDE_DBS_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The Directory Server contains database files in the following locations outside the server path:
   */
  public static final MessageDescriptor.Arg0 INFO_DELETE_OUTSIDE_DBS_MSG =
          new MessageDescriptor.Arg0(BASE,"INFO_DELETE_OUTSIDE_DBS_MSG",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Check this box to Delete the Database Files located outside the install directory
   */
  public static final MessageDescriptor.Arg0 INFO_DELETE_OUTSIDE_DBS_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_DELETE_OUTSIDE_DBS_TOOLTIP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Delete these Log Files
   */
  public static final MessageDescriptor.Arg0 INFO_DELETE_OUTSIDE_LOGS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_DELETE_OUTSIDE_LOGS_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The Directory Server contains log files in the following locations outside the server path:
   */
  public static final MessageDescriptor.Arg0 INFO_DELETE_OUTSIDE_LOGS_MSG =
          new MessageDescriptor.Arg0(BASE,"INFO_DELETE_OUTSIDE_LOGS_MSG",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Check this box to Delete the Log Files located outside the install directory
   */
  public static final MessageDescriptor.Arg0 INFO_DELETE_OUTSIDE_LOGS_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_DELETE_OUTSIDE_LOGS_TOOLTIP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * There is no task with ID '%s' in the server.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DEPENDENCY_TASK_NOT_DEFINED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DEPENDENCY_TASK_NOT_DEFINED",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * User ID of the Global Administrator to use to bind to the server
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_ADMIN_UID =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_ADMIN_UID",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Disable the replication configuration on the specified server.  The contents of the server are no longer replicated and the replication server (changelog and replication port) is disabled if it is configured
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_DISABLE_ALL =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_DISABLE_ALL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * DN to use to bind to the server where we want to disable replication.  This option must be used when no Global Administrator has been defined on the server or if the user does not want to remove references in the other replicated servers.  The password provided for the Global Administrator will be used when specifying this option
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_DISABLE_REPLICATION_BINDDN =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_DISABLE_REPLICATION_BINDDN",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Disable the replication server.  The replication port and change log are disabled on the specified server
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_DISABLE_REPLICATION_SERVER =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_DISABLE_REPLICATION_SERVER",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * DN to use to bind to the first server whose contents will be replicated.  If not specified the global administrator will be used to bind
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_ENABLE_REPLICATION_BINDDN1 =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_ENABLE_REPLICATION_BINDDN1",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * DN to use to bind to the second server whose contents will be replicated.  If not specified the global administrator will be used to bind
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_ENABLE_REPLICATION_BINDDN2 =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_ENABLE_REPLICATION_BINDDN2",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Password to use to bind to the first server whose contents will be replicated.  If no bind DN was specified for the first server the password of the global administrator will be used to bind
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_ENABLE_REPLICATION_BINDPASSWORD1 =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_ENABLE_REPLICATION_BINDPASSWORD1",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Password to use to bind to the second server whose contents will be replicated.  If no bind DN was specified for the second server the password of the global administrator will be used to bind
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_ENABLE_REPLICATION_BINDPASSWORD2 =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_ENABLE_REPLICATION_BINDPASSWORD2",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * File containing the password to use to bind to the first server whose contents will be replicated.  If no bind DN was specified for the first server the password of the global administrator will be used to bind
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_ENABLE_REPLICATION_BINDPASSWORDFILE1 =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_ENABLE_REPLICATION_BINDPASSWORDFILE1",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * File containing the password to use to bind to the second server whose contents will be replicated.  If no bind DN was specified for the second server the password of the global administrator will be used to bind
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_ENABLE_REPLICATION_BINDPASSWORDFILE2 =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_ENABLE_REPLICATION_BINDPASSWORDFILE2",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Fully qualified host name or IP address of the first server whose contents will be replicated
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_ENABLE_REPLICATION_HOST1 =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_ENABLE_REPLICATION_HOST1",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Fully qualified host name or IP address of the second server whose contents will be replicated
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_ENABLE_REPLICATION_HOST2 =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_ENABLE_REPLICATION_HOST2",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Do not configure a replication port or change log on the first server. The first server will contain replicated data but will not contain a change log of modifications made to the replicated data. Note that each replicated topology must contain at least two servers with a change log to avoid a single point of failure
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_ENABLE_REPLICATION_NO_REPLICATION_SERVER1 =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_ENABLE_REPLICATION_NO_REPLICATION_SERVER1",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Do not configure a replication port or change log on the second server. The second server will contain replicated data but will not contain a change log of modifications made to the replicated data. Note that each replicated topology must contain at least two servers with a change log to avoid a single point of failure
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_ENABLE_REPLICATION_NO_REPLICATION_SERVER2 =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_ENABLE_REPLICATION_NO_REPLICATION_SERVER2",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Do not replicate the schema between the servers
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_ENABLE_REPLICATION_NO_SCHEMA_REPLICATION =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_ENABLE_REPLICATION_NO_SCHEMA_REPLICATION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Configure only a change log and replication port on the first server.  The first server will not contain replicated data, but will contain a change log of the modifications made to the replicated data on other servers
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_ENABLE_REPLICATION_ONLY_REPLICATION_SERVER1 =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_ENABLE_REPLICATION_ONLY_REPLICATION_SERVER1",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Configure only a change log and replication port on the second server.  The second server will not contain replicated data, but will contain a change log of the modifications made to the replicated data on other servers
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_ENABLE_REPLICATION_ONLY_REPLICATION_SERVER2 =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_ENABLE_REPLICATION_ONLY_REPLICATION_SERVER2",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Port that will be used by the replication mechanism in the first server to communicate with the other servers.  You have to specify this option only if replication was not previously configured in the first server
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_ENABLE_REPLICATION_PORT1 =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_ENABLE_REPLICATION_PORT1",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Port that will be used by the replication mechanism in the second server to communicate with the other servers.  You have to specify this option only if replication was not previously configured in the second server
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_ENABLE_REPLICATION_PORT2 =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_ENABLE_REPLICATION_PORT2",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Directory server administration port number of the first server whose contents will be replicated
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_ENABLE_REPLICATION_SERVER_PORT1 =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_ENABLE_REPLICATION_SERVER_PORT1",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Directory server administration port number of the second server whose contents will be replicated
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_ENABLE_REPLICATION_SERVER_PORT2 =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_ENABLE_REPLICATION_SERVER_PORT2",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Skip the check to determine whether the specified replication ports are usable
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_ENABLE_REPLICATION_SKIPPORT =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_ENABLE_REPLICATION_SKIPPORT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Use StartTLS to secure communication with the second server
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_ENABLE_REPLICATION_STARTTLS2 =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_ENABLE_REPLICATION_STARTTLS2",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Use the second server to initialize the schema of the first server.  If this option nor option %s are specified the schema of the first server will be used to initialize the schema of the second server
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DESCRIPTION_ENABLE_REPLICATION_USE_SECOND_AS_SCHEMA_SOURCE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DESCRIPTION_ENABLE_REPLICATION_USE_SECOND_AS_SCHEMA_SOURCE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Specifies whether or not the communication through the replication port of the first server is encrypted or not.  This option will only be taken into account the first time replication is configured on the first server
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_ENABLE_SECURE_REPLICATION1 =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_ENABLE_SECURE_REPLICATION1",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Specifies whether or not the communication through the replication port of the second server is encrypted or not.  This option will only be taken into account the first time replication is configured on the second server
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_ENABLE_SECURE_REPLICATION2 =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_ENABLE_SECURE_REPLICATION2",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Fully qualified host name or IP address of the destination server whose contents will be initialized
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_INITIALIZE_REPLICATION_HOST_DESTINATION =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_INITIALIZE_REPLICATION_HOST_DESTINATION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Fully qualified host name or IP address of the source server whose contents will be used to initialize the destination server
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_INITIALIZE_REPLICATION_HOST_SOURCE =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_INITIALIZE_REPLICATION_HOST_SOURCE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Directory server administration port number of the destination server whose contents will be initialized
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_INITIALIZE_REPLICATION_SERVER_PORT_DESTINATION =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_INITIALIZE_REPLICATION_SERVER_PORT_DESTINATION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Directory server administration port number of the source server whose contents will be used to initialize the destination server
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_INITIALIZE_REPLICATION_SERVER_PORT_SOURCE =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_INITIALIZE_REPLICATION_SERVER_PORT_SOURCE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The name of this host (or IP address) as it is referenced in remote servers for replication
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_REFERENCED_HOST =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_REFERENCED_HOST",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The global administrator password
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_REPLICATION_ADMIN_BINDPASSWORD =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_REPLICATION_ADMIN_BINDPASSWORD",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The file containing the password of the global administrator
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_REPLICATION_ADMIN_BINDPASSWORDFILE =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_REPLICATION_ADMIN_BINDPASSWORDFILE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * User ID of the Global Administrator to use to bind to the server.  For the '%s' subcommand if no Global Administrator was defined previously for none of the server the Global Administrator will be created using the provided data.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DESCRIPTION_REPLICATION_ADMIN_UID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DESCRIPTION_REPLICATION_ADMIN_UID",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Base DN of the data to be replicated, initialized or for which we want to disable replication.  Multiple base DN's can be provided by using this option multiple times
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_REPLICATION_BASEDNS =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_REPLICATION_BASEDNS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Disables replication on the specified server for the provided Base DN and removes references in the other servers with which it is replicating data
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_SUBCMD_DISABLE_REPLICATION =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_SUBCMD_DISABLE_REPLICATION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Updates the configuration of the servers to replicate the data under the specified Base DN.  If one of the specified servers is already replicating the data under the Base DN with other servers, executing this subcommand will update the configuration of all the servers (so it is sufficient to execute the command line once for each server we add to the replication topology)
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_SUBCMD_ENABLE_REPLICATION =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_SUBCMD_ENABLE_REPLICATION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Initialize the contents of the data under the specified Base DN on all the servers whose contents are being replicated with the contents on the specified server.  This operation is required after enabling replication for replication to work ('%s' applied to each server can also be used for this purpose)
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DESCRIPTION_SUBCMD_INITIALIZE_ALL_REPLICATION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DESCRIPTION_SUBCMD_INITIALIZE_ALL_REPLICATION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Initialize the contents of the data under the specified Base DN on the destination server with the contents on the source server.  This operation is required after enabling replication in order replication to work ('%s' can also be used for this purpose)
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DESCRIPTION_SUBCMD_INITIALIZE_REPLICATION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DESCRIPTION_SUBCMD_INITIALIZE_REPLICATION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * This subcommand must be called after initializing the contents of all the replicated servers using the tool import-ldif or the binary copy method.  You must specify the list of Base DN's that have been initialized and you must provide the credentials of any of the servers that are being replicated.  See the usage of the subcommand '%s' for more information
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DESCRIPTION_SUBCMD_POST_EXTERNAL_INITIALIZATION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DESCRIPTION_SUBCMD_POST_EXTERNAL_INITIALIZATION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * This subcommand must be called before initializing the contents of all the replicated servers using the tool import-ldif or the binary copy method.  You must specify the list of Base DN's that will be initialized and you must provide the credentials of any of the servers that are being replicated.  After calling this subcommand, initialize the contents of all the servers in the topology (use the same LDIF file/binary copy on each of the servers), then call the subcommand '%s'
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DESCRIPTION_SUBCMD_PRE_EXTERNAL_INITIALIZATION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DESCRIPTION_SUBCMD_PRE_EXTERNAL_INITIALIZATION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Launches a purge processing of the historical informations stored in the user entries by replication. Since this processing may take a while, you must specify the maximum duration for this processing.
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_SUBCMD_PURGE_HISTORICAL =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_SUBCMD_PURGE_HISTORICAL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Displays a list with the basic replication configuration of the base DN's of the servers defined in the registration information.  If no base DN's are specified as parameter the information for all base DN's is displayed
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_SUBCMD_STATUS_REPLICATION =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_SUBCMD_STATUS_REPLICATION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Disabled
   */
  public static final MessageDescriptor.Arg0 INFO_DISABLED_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_DISABLED_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * You have decided to disable the replication server (replication changelog).  At least one replicaton server is required in a replication topology and this is the last replication server for the following suffixes:%n%s%nReplication will be disabled for these servers.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DISABLE_REPLICATION_DISABLE_IN_REMOTE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DISABLE_REPLICATION_DISABLE_IN_REMOTE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * You have decided to disable the replication server (replication changelog).  At least one replicaton server is required in a replication topology and this is the last replication server for the following suffixes:%n%s%nReplication will be disabled for these servers.%nDo you want to continue?
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DISABLE_REPLICATION_DISABLE_IN_REMOTE_PROMPT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DISABLE_REPLICATION_DISABLE_IN_REMOTE_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * You have decided to disable the replication server (replication changelog).  After disabling the replication server only one replication server will be configured for the following suffixes:%n%s%nTo avoid a single point of failure at least two replication servers must be configured.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DISABLE_REPLICATION_ONE_POINT_OF_FAILURE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DISABLE_REPLICATION_ONE_POINT_OF_FAILURE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * You have decided to disable the replication server (replication changelog).  After disabling the replication server only one replication server will be configured for the following suffixes:%n%s%nTo avoid a single point of failure at least two replication servers must be configured.%nDo you want to continue?
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DISABLE_REPLICATION_ONE_POINT_OF_FAILURE_PROMPT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DISABLE_REPLICATION_ONE_POINT_OF_FAILURE_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Dynamic group
   */
  public static final MessageDescriptor.Arg0 INFO_DYNAMIC_GROUP_ICON_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_DYNAMIC_GROUP_ICON_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * You must provide the name of the remote host name.
   */
  public static final MessageDescriptor.Arg0 INFO_EMPTY_REMOTE_HOST_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_EMPTY_REMOTE_HOST_NAME",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Enabled
   */
  public static final MessageDescriptor.Arg0 INFO_ENABLED_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_ENABLED_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Initializing registration information on server %s with the contents of server %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_ENABLE_REPLICATION_INITIALIZING_ADS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_ENABLE_REPLICATION_INITIALIZING_ADS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Initializing registration information with the contents of server %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ENABLE_REPLICATION_INITIALIZING_ADS_ALL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ENABLE_REPLICATION_INITIALIZING_ADS_ALL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Initializing schema on server %s with the contents of server %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_ENABLE_REPLICATION_INITIALIZING_SCHEMA =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_ENABLE_REPLICATION_INITIALIZING_SCHEMA",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Could not connect to the Directory Server %s with the provided credentials.%nError details: %s%n%nProvide again the required information to connect to the server:
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ERROR_CONNECTING_TO_SERVER_PROMPT_AGAIN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ERROR_CONNECTING_TO_SERVER_PROMPT_AGAIN",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Unexpected error during the operation.  Last log details: %s.  Task state: %s.  Check the error logs of %s for more information.
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> INFO_ERROR_DURING_POST_EXTERNAL_INITIALIZATION_LOG =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"INFO_ERROR_DURING_POST_EXTERNAL_INITIALIZATION_LOG",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Unexpected error during the operation.  Task state: %s.  Check the error logs of %s for more information.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_ERROR_DURING_POST_EXTERNAL_INITIALIZATION_NO_LOG =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_ERROR_DURING_POST_EXTERNAL_INITIALIZATION_NO_LOG",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Unexpected error during the operation.  Last log details: %s.  Task state: %s.  Check the error logs of %s for more information.
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> INFO_ERROR_DURING_PRE_EXTERNAL_INITIALIZATION_LOG =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"INFO_ERROR_DURING_PRE_EXTERNAL_INITIALIZATION_LOG",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Unexpected error during the operation.  Task state: %s.  Check the error logs of %s for more information.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_ERROR_DURING_PRE_EXTERNAL_INITIALIZATION_NO_LOG =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_ERROR_DURING_PRE_EXTERNAL_INITIALIZATION_NO_LOG",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Unexpected error during the operation.  Last log details: %s.  Task state: %s.  Check the error logs of %s for more information.
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> INFO_ERROR_DURING_PURGE_HISTORICAL_LOG =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"INFO_ERROR_DURING_PURGE_HISTORICAL_LOG",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Unexpected error during the operation.  Task state: %s.  Check the error logs of %s for more information.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_ERROR_DURING_PURGE_HISTORICAL_NO_LOG =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_ERROR_DURING_PURGE_HISTORICAL_NO_LOG",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Email addresses to send the error notification to [continue]:
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_NOTIFICATION_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_NOTIFICATION_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Error searching backups
   */
  public static final MessageDescriptor.Arg0 ERR_ERROR_SEARCHING_BACKUPS_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_ERROR_SEARCHING_BACKUPS_SUMMARY",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Uninstall
   */
  public static final MessageDescriptor.Arg0 INFO_FINISH_BUTTON_UNINSTALL_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_FINISH_BUTTON_UNINSTALL_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Finish Uninstall
   */
  public static final MessageDescriptor.Arg0 INFO_FINISH_BUTTON_UNINSTALL_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_FINISH_BUTTON_UNINSTALL_TOOLTIP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The first server is already configured with replication port '%d'.  The provided replication server port '%d' has been ignored.
   */
  public static final MessageDescriptor.Arg2<Number,Number> WARN_FIRST_REPLICATION_SERVER_ALREADY_CONFIGURED =
          new MessageDescriptor.Arg2<Number,Number>(BASE,"MILD_WARN_FIRST_REPLICATION_SERVER_ALREADY_CONFIGURED",ADMIN_TOOL,MILD_WARNING,-1, getClassLoader());

  /**
   * %s Uninstall
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_FRAME_UNINSTALL_TITLE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_FRAME_UNINSTALL_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Do you want to send an email notification when this task completes?
   */
  public static final MessageDescriptor.Arg0 INFO_HAS_COMPLETION_NOTIFICATION_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_HAS_COMPLETION_NOTIFICATION_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Do you want to send an email notification if this task fails?
   */
  public static final MessageDescriptor.Arg0 INFO_HAS_ERROR_NOTIFICATION_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_HAS_ERROR_NOTIFICATION_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The following base DN's cannot be purged because they are not replicated.
   */
  public static final MessageDescriptor.Arg0 ERR_HISTORICAL_CANNOT_BE_PURGED_ON_BASEDN =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_HISTORICAL_CANNOT_BE_PURGED_ON_BASEDN",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Host Name:
   */
  public static final MessageDescriptor.Arg0 INFO_HOSTNAME_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_HOSTNAME_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The thread number must be a positive integer.
   */
  public static final MessageDescriptor.Arg0 ERR_IMPORT_THREAD_NUMBER_INVALID =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_IMPORT_THREAD_NUMBER_INVALID",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The remote server in '%s' has not the same version as the control panel.  The remote server version is '%s.%s.%s' and the control panel version is '%d.%d.%d'.
   */
  public static final MessageDescriptor.Arg7<CharSequence,CharSequence,CharSequence,CharSequence,Number,Number,Number> ERR_INCOMPATIBLE_VERSION_IN_REMOTE_SERVER =
          new MessageDescriptor.Arg7<CharSequence,CharSequence,CharSequence,CharSequence,Number,Number,Number>(BASE,"SEVERE_ERR_INCOMPATIBLE_VERSION_IN_REMOTE_SERVER",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * Yes
   */
  public static final MessageDescriptor.Arg0 INFO_INDEX_MUST_BE_REBUILT_CELL_VALUE =
          new MessageDescriptor.Arg0(BASE,"INFO_INDEX_MUST_BE_REBUILT_CELL_VALUE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * No
   */
  public static final MessageDescriptor.Arg0 INFO_INDEX_MUST_NOT_BE_REBUILT_CELL_VALUE =
          new MessageDescriptor.Arg0(BASE,"INFO_INDEX_MUST_NOT_BE_REBUILT_CELL_VALUE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * No attribute name selected.
   */
  public static final MessageDescriptor.Arg0 ERR_INFO_CTRL_ATTRIBUTE_NAME_REQUIRED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_INFO_CTRL_ATTRIBUTE_NAME_REQUIRED",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The entry limit must be an integer between %d and %d.
   */
  public static final MessageDescriptor.Arg2<Number,Number> ERR_INFO_CTRL_PANEL_ENTRY_LIMIT_NOT_VALID =
          new MessageDescriptor.Arg2<Number,Number>(BASE,"MILD_ERR_INFO_CTRL_PANEL_ENTRY_LIMIT_NOT_VALID",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * You must select at least one index type (approximate, equality, ordering, presence or substring).
   */
  public static final MessageDescriptor.Arg0 ERR_INFO_ONE_INDEX_TYPE_MUST_BE_SELECTED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_INFO_ONE_INDEX_TYPE_MUST_BE_SELECTED",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Error initializing.  Could not find replication ID in the server %s for base DN %s.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_INITIALIZING_REPLICATIONID_NOT_FOUND =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_INITIALIZING_REPLICATIONID_NOT_FOUND",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * Installation Path:
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLATION_PATH_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLATION_PATH_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The value '%s' is not a valid email address.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_INVALID_EMAIL_ADDRESS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_INVALID_EMAIL_ADDRESS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The value of the remote server administrative port must be an integer value between %d and %d.
   */
  public static final MessageDescriptor.Arg2<Number,Number> INFO_INVALID_REMOTE_SERVER_PORT =
          new MessageDescriptor.Arg2<Number,Number>(BASE,"INFO_INVALID_REMOTE_SERVER_PORT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Java Version:
   */
  public static final MessageDescriptor.Arg0 INFO_JAVA_VERSION_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_JAVA_VERSION_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * JMX
   */
  public static final MessageDescriptor.Arg0 INFO_JMX_PROTOCOL_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_JMX_PROTOCOL_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * JMX (Secure)
   */
  public static final MessageDescriptor.Arg0 INFO_JMX_SECURE_PROTOCOL_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_JMX_SECURE_PROTOCOL_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Error launching the operation.
   */
  public static final MessageDescriptor.Arg0 ERR_LAUNCHING_POST_EXTERNAL_INITIALIZATION =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_LAUNCHING_POST_EXTERNAL_INITIALIZATION",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * Error launching the operation.
   */
  public static final MessageDescriptor.Arg0 ERR_LAUNCHING_PRE_EXTERNAL_INITIALIZATION =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_LAUNCHING_PRE_EXTERNAL_INITIALIZATION",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * Error launching the operation.
   */
  public static final MessageDescriptor.Arg0 ERR_LAUNCHING_PURGE_HISTORICAL =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_LAUNCHING_PURGE_HISTORICAL",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * LDAPS
   */
  public static final MessageDescriptor.Arg0 INFO_LDAPS_PROTOCOL_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAPS_PROTOCOL_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * LDAP
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_PROTOCOL_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_PROTOCOL_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * LDIF
   */
  public static final MessageDescriptor.Arg0 INFO_LDIF_PROTOCOL_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIF_PROTOCOL_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * You must provide the LDIF representation of the entry.
   */
  public static final MessageDescriptor.Arg0 ERR_LDIF_REPRESENTATION_REQUIRED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_LDIF_REPRESENTATION_REQUIRED",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Connection Handlers
   */
  public static final MessageDescriptor.Arg0 INFO_LISTENERS_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_LISTENERS_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Error loading image
   */
  public static final MessageDescriptor.Arg0 ERR_LOADING_IMAGE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_LOADING_IMAGE",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Close Login Dialog
   */
  public static final MessageDescriptor.Arg0 INFO_LOGIN_CANCEL_BUTTON_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_LOGIN_CANCEL_BUTTON_TOOLTIP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * You must provide an Administrative User DN and password to retrieve monitoring information.
   */
  public static final MessageDescriptor.Arg0 INFO_LOGIN_DIALOG_MSG =
          new MessageDescriptor.Arg0(BASE,"INFO_LOGIN_DIALOG_MSG",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The Directory Server is not running. Click OK to continue.
   */
  public static final MessageDescriptor.Arg0 INFO_LOGIN_DIALOG_SERVER_NOT_RUNNING_MSG =
          new MessageDescriptor.Arg0(BASE,"INFO_LOGIN_DIALOG_SERVER_NOT_RUNNING_MSG",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Directory Server not Running
   */
  public static final MessageDescriptor.Arg0 INFO_LOGIN_DIALOG_SERVER_NOT_RUNNING_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_LOGIN_DIALOG_SERVER_NOT_RUNNING_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Authentication Required
   */
  public static final MessageDescriptor.Arg0 INFO_LOGIN_DIALOG_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_LOGIN_DIALOG_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Administrative User DN:
   */
  public static final MessageDescriptor.Arg0 INFO_LOGIN_DN_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_LOGIN_DN_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Enter the distinguished name (DN) of the Administrative User account that will used to retrieve monitoring information
   */
  public static final MessageDescriptor.Arg0 INFO_LOGIN_DN_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_LOGIN_DN_TOOLTIP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Proceed with authentication
   */
  public static final MessageDescriptor.Arg0 INFO_LOGIN_OK_BUTTON_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_LOGIN_OK_BUTTON_TOOLTIP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Administrative User Password:
   */
  public static final MessageDescriptor.Arg0 INFO_LOGIN_PWD_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_LOGIN_PWD_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Enter the password of the Administrative User account that will used to retrieve monitoring information
   */
  public static final MessageDescriptor.Arg0 INFO_LOGIN_PWD_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_LOGIN_PWD_TOOLTIP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Missing Changes
   */
  public static final MessageDescriptor.Arg0 INFO_MISSING_CHANGES_COLUMN =
          new MessageDescriptor.Arg0(BASE,"INFO_MISSING_CHANGES_COLUMN",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * You must provide a name for the new backend.
   */
  public static final MessageDescriptor.Arg0 ERR_NEW_BACKEND_NAME_REQUIRED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_NEW_BACKEND_NAME_REQUIRED",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * You must provide a value for the Base DN.
   */
  public static final MessageDescriptor.Arg0 ERR_NEW_BASE_DN_VALUE_REQUIRED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_NEW_BASE_DN_VALUE_REQUIRED",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Non Modifiable attributes must have an operational usage.
   */
  public static final MessageDescriptor.Arg0 ERR_NON_MODIFIABLE_CANNOT_BE_USER_APPLICATIONS =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_NON_MODIFIABLE_CANNOT_BE_USER_APPLICATIONS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * You must select something to be uninstalled.
   */
  public static final MessageDescriptor.Arg0 INFO_NOTHING_SELECTED_TO_UNINSTALL =
          new MessageDescriptor.Arg0(BASE,"INFO_NOTHING_SELECTED_TO_UNINSTALL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * You do not have access rights to the configuration of the server.
   */
  public static final MessageDescriptor.Arg0 ERR_NOT_ADMINISTRATIVE_USER =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_NOT_ADMINISTRATIVE_USER",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * --
   */
  public static final MessageDescriptor.Arg0 INFO_NOT_APPLICABLE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_NOT_APPLICABLE_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * <not available> (*)
   */
  public static final MessageDescriptor.Arg0 INFO_NOT_AVAILABLE_AUTHENTICATION_REQUIRED_CLI_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_NOT_AVAILABLE_AUTHENTICATION_REQUIRED_CLI_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * * Information only available if you provide valid authentication information when launching the status command.
   */
  public static final MessageDescriptor.Arg0 INFO_NOT_AVAILABLE_AUTHENTICATION_REQUIRED_CLI_LEGEND =
          new MessageDescriptor.Arg0(BASE,"INFO_NOT_AVAILABLE_AUTHENTICATION_REQUIRED_CLI_LEGEND",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * <html>Information is only available if you are authenticated<br>as an administrative user.
   */
  public static final MessageDescriptor.Arg0 INFO_NOT_AVAILABLE_AUTHENTICATION_REQUIRED_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_NOT_AVAILABLE_AUTHENTICATION_REQUIRED_TOOLTIP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * <not available> (*)
   */
  public static final MessageDescriptor.Arg0 INFO_NOT_AVAILABLE_SERVER_DOWN_CLI_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_NOT_AVAILABLE_SERVER_DOWN_CLI_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * * Information only available if server is running and you provide valid authentication information when launching the status command.
   */
  public static final MessageDescriptor.Arg0 INFO_NOT_AVAILABLE_SERVER_DOWN_CLI_LEGEND =
          new MessageDescriptor.Arg0(BASE,"INFO_NOT_AVAILABLE_SERVER_DOWN_CLI_LEGEND",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * <html>Information is only available if server is running and you are authenticated<br>as an administrative user.
   */
  public static final MessageDescriptor.Arg0 INFO_NOT_AVAILABLE_SERVER_DOWN_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_NOT_AVAILABLE_SERVER_DOWN_TOOLTIP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * N/A
   */
  public static final MessageDescriptor.Arg0 INFO_NOT_AVAILABLE_SHORT_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_NOT_AVAILABLE_SHORT_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The remote server in '%s' is cannot be managed by this control panel.  The remote server product name is '%s' and the control panel product name is '%s'.
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_NOT_SAME_PRODUCT_IN_REMOTE_SERVER_NOT_FOUND =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_NOT_SAME_PRODUCT_IN_REMOTE_SERVER_NOT_FOUND",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * -No LDAP Databases Found-
   */
  public static final MessageDescriptor.Arg0 INFO_NO_DBS_FOUND =
          new MessageDescriptor.Arg0(BASE,"INFO_NO_DBS_FOUND",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * -No Listener Ports Found-
   */
  public static final MessageDescriptor.Arg0 INFO_NO_LISTENERS_FOUND =
          new MessageDescriptor.Arg0(BASE,"INFO_NO_LISTENERS_FOUND",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * There are no base DN's replicated in the server.
   */
  public static final MessageDescriptor.Arg0 ERR_NO_SUFFIXES_AVAILABLE_TO_DISABLE_REPLICATION =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_NO_SUFFIXES_AVAILABLE_TO_DISABLE_REPLICATION",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * There are no base DN's available to enable replication between the two servers.
   */
  public static final MessageDescriptor.Arg0 ERR_NO_SUFFIXES_AVAILABLE_TO_ENABLE_REPLICATION =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_NO_SUFFIXES_AVAILABLE_TO_ENABLE_REPLICATION",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * There are no base DN's available to enable replication between the two servers.  You must specify at least one server that will contain the replicated data, before configuring servers that will only contain the replication changelog (replication servers).
   */
  public static final MessageDescriptor.Arg0 ERR_NO_SUFFIXES_AVAILABLE_TO_ENABLE_REPLICATION_NO_DOMAIN =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_NO_SUFFIXES_AVAILABLE_TO_ENABLE_REPLICATION_NO_DOMAIN",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * There are no base DN's replicated in the server.  The base DN's must be replicated to be able to use their contents to initialize the base DN's on the other servers.
   */
  public static final MessageDescriptor.Arg0 ERR_NO_SUFFIXES_AVAILABLE_TO_INITIALIZE_ALL_REPLICATION =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_NO_SUFFIXES_AVAILABLE_TO_INITIALIZE_ALL_REPLICATION",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * There are no base DN's replicated in the server.
   */
  public static final MessageDescriptor.Arg0 ERR_NO_SUFFIXES_AVAILABLE_TO_INITIALIZE_LOCAL_REPLICATION =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_NO_SUFFIXES_AVAILABLE_TO_INITIALIZE_LOCAL_REPLICATION",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * There are no base DN's replicated between the two servers.
   */
  public static final MessageDescriptor.Arg0 ERR_NO_SUFFIXES_AVAILABLE_TO_INITIALIZE_REPLICATION =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_NO_SUFFIXES_AVAILABLE_TO_INITIALIZE_REPLICATION",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * There are no base DN's available to purge historical.
   */
  public static final MessageDescriptor.Arg0 ERR_NO_SUFFIXES_AVAILABLE_TO_PURGE_HISTORICAL =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_NO_SUFFIXES_AVAILABLE_TO_PURGE_HISTORICAL",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * You must choose at least one base DN to be disabled.
   */
  public static final MessageDescriptor.Arg0 ERR_NO_SUFFIXES_SELECTED_TO_DISABLE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_NO_SUFFIXES_SELECTED_TO_DISABLE",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * You must choose at least one base DN to be initialized.
   */
  public static final MessageDescriptor.Arg0 ERR_NO_SUFFIXES_SELECTED_TO_INITIALIZE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_NO_SUFFIXES_SELECTED_TO_INITIALIZE",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * You must choose at least one base DN to initialize.
   */
  public static final MessageDescriptor.Arg0 ERR_NO_SUFFIXES_SELECTED_TO_INITIALIZE_ALL =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_NO_SUFFIXES_SELECTED_TO_INITIALIZE_ALL",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * You must specify the base DN's that have been initialized using the import-ldif command or the binary copy.
   */
  public static final MessageDescriptor.Arg0 ERR_NO_SUFFIXES_SELECTED_TO_POST_EXTERNAL_INITIALIZATION =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_NO_SUFFIXES_SELECTED_TO_POST_EXTERNAL_INITIALIZATION",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * You must specify the base DN's that will be initialized using the import-ldif command or the binary copy.
   */
  public static final MessageDescriptor.Arg0 ERR_NO_SUFFIXES_SELECTED_TO_PRE_EXTERNAL_INITIALIZATION =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_NO_SUFFIXES_SELECTED_TO_PRE_EXTERNAL_INITIALIZATION",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * You must choose at least one base DN to be purged from historical.
   */
  public static final MessageDescriptor.Arg0 ERR_NO_SUFFIXES_SELECTED_TO_PURGE_HISTORICAL =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_NO_SUFFIXES_SELECTED_TO_PURGE_HISTORICAL",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * You must choose at least one base DN to be replicated.
   */
  public static final MessageDescriptor.Arg0 ERR_NO_SUFFIXES_SELECTED_TO_REPLICATE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_NO_SUFFIXES_SELECTED_TO_REPLICATE",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Entries
   */
  public static final MessageDescriptor.Arg0 INFO_NUMBER_ENTRIES_COLUMN =
          new MessageDescriptor.Arg0(BASE,"INFO_NUMBER_ENTRIES_COLUMN",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The number of user entries to generate must be between %d and %d.
   */
  public static final MessageDescriptor.Arg2<Number,Number> ERR_NUMBER_OF_ENTRIES_INVALID =
          new MessageDescriptor.Arg2<Number,Number>(BASE,"MILD_ERR_NUMBER_OF_ENTRIES_INVALID",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The selected object classes are superior of the following object classes: %s.  If you continue, these object classes will be updated with a new superior.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_OBJECTCLASSES_ARE_SUPERIOR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_OBJECTCLASSES_ARE_SUPERIOR",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * You must provide the objectclass values of the entry.
   */
  public static final MessageDescriptor.Arg0 ERR_OBJECTCLASS_FOR_ENTRY_REQUIRED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_OBJECTCLASS_FOR_ENTRY_REQUIRED",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Object class '%s' is superior of the following object classes: %s.  If you continue, these object classes will be updated with a new superior.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_OBJECTCLASS_IS_SUPERIOR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_OBJECTCLASS_IS_SUPERIOR",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Version:
   */
  public static final MessageDescriptor.Arg0 INFO_OPENDS_VERSION_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_OPENDS_VERSION_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Operation date: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_OPERATION_START_TIME_MESSAGE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_OPERATION_START_TIME_MESSAGE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Organizational unit
   */
  public static final MessageDescriptor.Arg0 INFO_ORGANIZATIONAL_UNIT_ICON_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_ORGANIZATIONAL_UNIT_ICON_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Organization
   */
  public static final MessageDescriptor.Arg0 INFO_ORGANIZATION_ICON_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_ORGANIZATION_ICON_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Password policy
   */
  public static final MessageDescriptor.Arg0 INFO_PASSWORD_POLICY_ICON_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_PASSWORD_POLICY_ICON_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Person object
   */
  public static final MessageDescriptor.Arg0 INFO_PERSON_ICON_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_PERSON_ICON_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Error reading the progress of the operation.
   */
  public static final MessageDescriptor.Arg0 ERR_POOLING_POST_EXTERNAL_INITIALIZATION =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_POOLING_POST_EXTERNAL_INITIALIZATION",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * Error reading the progress of the operation.
   */
  public static final MessageDescriptor.Arg0 ERR_POOLING_PRE_EXTERNAL_INITIALIZATION =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_POOLING_PRE_EXTERNAL_INITIALIZATION",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * Error reading the progress of the operation.
   */
  public static final MessageDescriptor.Arg0 ERR_POOLING_PURGE_HISTORICAL =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_POOLING_PURGE_HISTORICAL",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * Importing Automatically-Generated Data (%s Entries)
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_PROGRESS_IMPORT_AUTOMATICALLY_GENERATED_REMOTE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_PROGRESS_IMPORT_AUTOMATICALLY_GENERATED_REMOTE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Updating replication information on base DN %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_PROGRESS_POST_EXTERNAL_INITIALIZATION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_PROGRESS_POST_EXTERNAL_INITIALIZATION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Post initialization procedure completed successfully.
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_POST_INITIALIZATION_FINISHED_PROCEDURE =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_POST_INITIALIZATION_FINISHED_PROCEDURE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Preparing base DN %s to be initialized externally
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_PROGRESS_PRE_EXTERNAL_INITIALIZATION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_PROGRESS_PRE_EXTERNAL_INITIALIZATION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Now you can proceed to the initialization of the contents of the base DN's on all the replicated servers.  You can use the command import-ldif or the binary copy to do so.  You must use the same LDIF file or binary copy on each server.%n%nWhen the initialization is completed you must use the subcommand '%s' for replication to work with the new base DN's contents.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_PROGRESS_PRE_INITIALIZATION_FINISHED_PROCEDURE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_PROGRESS_PRE_INITIALIZATION_FINISHED_PROCEDURE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Purging historical on base DNs:%s%s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_PROGRESS_PURGE_HISTORICAL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_PROGRESS_PURGE_HISTORICAL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Purge of historical has been successfully completed
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRESS_PURGE_HISTORICAL_FINISHED_PROCEDURE =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRESS_PURGE_HISTORICAL_FINISHED_PROCEDURE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Removing references on %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_PROGRESS_REMOVING_REFERENCES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_PROGRESS_REMOVING_REFERENCES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Protocol
   */
  public static final MessageDescriptor.Arg0 INFO_PROTOCOL_COLUMN =
          new MessageDescriptor.Arg0(BASE,"INFO_PROTOCOL_COLUMN",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Purge historical
   */
  public static final MessageDescriptor.Arg0 INFO_PURGE_HISTORICAL_TASK_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_PURGE_HISTORICAL_TASK_NAME",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Error reading the configuration file.
   */
  public static final MessageDescriptor.Arg0 ERR_READING_CONFIG_FILE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_READING_CONFIG_FILE",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Error reading data from server.  Verify the authentication information provided.%nDetails: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_READING_CONFIG_LDAP =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_READING_CONFIG_LDAP",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Error reading schema from the remote server.%nDetails: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_READING_SCHEMA_LDAP =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_READING_SCHEMA_LDAP",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Referral limit (%d) reached.
   */
  public static final MessageDescriptor.Arg1<Number> ERR_REFERRAL_LIMIT_EXCEEDED =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_REFERRAL_LIMIT_EXCEEDED",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Backup Files Contained in bak Directory
   */
  public static final MessageDescriptor.Arg0 INFO_REMOVE_BACKUPS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_REMOVE_BACKUPS_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Remove Backup Files Contained in bak Directory
   */
  public static final MessageDescriptor.Arg0 INFO_REMOVE_BACKUPS_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_REMOVE_BACKUPS_TOOLTIP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Database Contents
   */
  public static final MessageDescriptor.Arg0 INFO_REMOVE_DATABASES_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_REMOVE_DATABASES_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Remove Database Contents
   */
  public static final MessageDescriptor.Arg0 INFO_REMOVE_DATABASES_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_REMOVE_DATABASES_TOOLTIP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Remove:
   */
  public static final MessageDescriptor.Arg0 INFO_REMOVE_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_REMOVE_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * LDIF Export Files Contained in ldif Directory
   */
  public static final MessageDescriptor.Arg0 INFO_REMOVE_LDIFS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_REMOVE_LDIFS_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Remove LDIF Export Files Contained in ldif Directory
   */
  public static final MessageDescriptor.Arg0 INFO_REMOVE_LDIFS_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_REMOVE_LDIFS_TOOLTIP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Server Libraries and Administrative Tools
   */
  public static final MessageDescriptor.Arg0 INFO_REMOVE_LIBRARIES_AND_TOOLS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_REMOVE_LIBRARIES_AND_TOOLS_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Remove Server Libraries and Administrative Tools
   */
  public static final MessageDescriptor.Arg0 INFO_REMOVE_LIBRARIES_AND_TOOLS_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_REMOVE_LIBRARIES_AND_TOOLS_TOOLTIP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Log Files
   */
  public static final MessageDescriptor.Arg0 INFO_REMOVE_LOGS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_REMOVE_LOGS_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Remove Log Files
   */
  public static final MessageDescriptor.Arg0 INFO_REMOVE_LOGS_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_REMOVE_LOGS_TOOLTIP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Configuration and Schema Files
   */
  public static final MessageDescriptor.Arg0 INFO_REMOVE_SCHEMA_AND_CONFIGURATION_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_REMOVE_SCHEMA_AND_CONFIGURATION_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Remove Configuration and Schema Files
   */
  public static final MessageDescriptor.Arg0 INFO_REMOVE_SCHEMA_AND_CONFIGURATION_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_REMOVE_SCHEMA_AND_CONFIGURATION_TOOLTIP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Replication
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATED_COLUMN =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATED_COLUMN",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The registry information found in servers %s and %s could not be merged.  Details: %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_REPLICATION_ADS_MERGE_NOT_SUPPORTED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_REPLICATION_ADS_MERGE_NOT_SUPPORTED",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * The errors reading the registry information on %s do not allow to do the merge between the replication topologies.  You will have to fix the following problems before merging the topologies:%n%s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_REPLICATION_CANNOT_MERGE_WITH_ERRORS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_REPLICATION_CANNOT_MERGE_WITH_ERRORS",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * Cannot write to file %s.  Verify that you have access rights to that file and that you provided the full path of the file
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_REPLICATION_CANNOT_WRITE_EQUIVALENT_COMMAND_LINE_FILE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_REPLICATION_CANNOT_WRITE_EQUIVALENT_COMMAND_LINE_FILE",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * Error updating replication configuration on base DN %s of server %s.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_REPLICATION_CONFIGURING_BASEDN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_REPLICATION_CONFIGURING_BASEDN",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * Error configuring replication port on server %s.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_REPLICATION_CONFIGURING_REPLICATIONSERVER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_REPLICATION_CONFIGURING_REPLICATIONSERVER",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * You chose to disable replication on base DN %s.  This base DN is used by the replication mechanism and by some administrative tools and it is not recommended to configure it directly.  Do you want to continue?
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_REPLICATION_CONFIRM_DISABLE_ADS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_REPLICATION_CONFIRM_DISABLE_ADS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Disabling all replication will make the data under the base DN's not to be synchronized with other servers any more.  The replication server (changelog and replicatin port) on the server will also be disabled.  Do you want to disable all replication?
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_CONFIRM_DISABLE_ALL =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_CONFIRM_DISABLE_ALL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Disabling replication will make the data under the selected base DN's not to be synchronized with other servers any more.  Do you want to continue?
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_CONFIRM_DISABLE_GENERIC =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_CONFIRM_DISABLE_GENERIC",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * You chose to disable replication of the schema.  Disabling schema replication is only recommended in specific scenarios.  Do you want to continue?
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_CONFIRM_DISABLE_SCHEMA =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_CONFIRM_DISABLE_SCHEMA",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * You chose to initialize the contents of base DN %s on server %s with the contents in server %s.  This base DN is used by the replication mechanism and by some administrative tools and it is not recommended to configure it directly.  Do you want to continue?
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> INFO_REPLICATION_CONFIRM_INITIALIZE_ADS =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"INFO_REPLICATION_CONFIRM_INITIALIZE_ADS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * You chose to initialize the contents of base DN %s with the contents in server %s.  This base DN is used by the replication mechanism and by some administrative tools and it is not recommended to configure it directly.  Do you want to continue?
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_REPLICATION_CONFIRM_INITIALIZE_ALL_ADS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_REPLICATION_CONFIRM_INITIALIZE_ALL_ADS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Initializing the contents of a base DN removes all the existing contents of that base DN.  Do you want to remove the contents of the selected base DN's on the replicated servers and replace them with the contents of server %s?
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_REPLICATION_CONFIRM_INITIALIZE_ALL_GENERIC =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_REPLICATION_CONFIRM_INITIALIZE_ALL_GENERIC",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Initializing the contents of a base DN removes all the existing contents of that base DN.  Do you want to remove the contents of the selected base DN's on server %s and replace them with the contents of server %s?
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_REPLICATION_CONFIRM_INITIALIZE_GENERIC =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_REPLICATION_CONFIRM_INITIALIZE_GENERIC",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Establishing connections
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_CONNECTING =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_CONNECTING",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Details: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_REPLICATION_CRITICAL_ERROR_DETAILS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_REPLICATION_CRITICAL_ERROR_DETAILS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Use this option to access advanced settings when running this command in interactive mode
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_DESCRIPTION_ADVANCED =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_DESCRIPTION_ADVANCED",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Display the equivalent non-interactive option in the standard output when this command is run in interactive mode
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_DESCRIPTION_DISPLAY_EQUIVALENT =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_DESCRIPTION_DISPLAY_EQUIVALENT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The full path to the file where the equivalent non-interactive commands will be written when this command is run in interactive mode
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_DESCRIPTION_EQUIVALENT_COMMAND_FILE_PATH =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_DESCRIPTION_EQUIVALENT_COMMAND_FILE_PATH",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Perform a quiet operation (no progress information is written to the standard output)
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_DESCRIPTION_QUIET =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_DESCRIPTION_QUIET",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * You have chosen to disable all the replicated base DN's in the server '%s'.  Do you want to disable also the replication port '%d'?
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> INFO_REPLICATION_DISABLE_ALL_SUFFIXES_DISABLE_REPLICATION_SERVER =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"INFO_REPLICATION_DISABLE_ALL_SUFFIXES_DISABLE_REPLICATION_SERVER",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * You have chosen to disable replication on all the replicated base DN's of '%s'.  If you want also the replication server (changelog and replication port) to be disabled you must also specify the '--%s' or '--%s' option.
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> INFO_REPLICATION_DISABLE_ALL_SUFFIXES_KEEP_REPLICATION_SERVER =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"INFO_REPLICATION_DISABLE_ALL_SUFFIXES_KEEP_REPLICATION_SERVER",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Disable Replication
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_DISABLE_MENU_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_DISABLE_MENU_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The following base DN's could not be found in the server:%n%s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_REPLICATION_DISABLE_SUFFIXES_NOT_FOUND =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_REPLICATION_DISABLE_SUFFIXES_NOT_FOUND",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Disable replication on base DN %s?
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_REPLICATION_DISABLE_SUFFIX_PROMPT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_REPLICATION_DISABLE_SUFFIX_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Disabling replication on base DN %s of server %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_REPLICATION_DISABLING_BASEDN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_REPLICATION_DISABLING_BASEDN",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Error disabling replication port on server %s.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_REPLICATION_DISABLING_REPLICATIONSERVER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_REPLICATION_DISABLING_REPLICATIONSERVER",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * Disabling replication port %s of server %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_REPLICATION_DISABLING_REPLICATION_SERVER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_REPLICATION_DISABLING_REPLICATION_SERVER",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Global Administrator must be created.%nYou must provide the credentials of the Global Administrator that will be created to manage the server instances that are being replicated.
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_ENABLE_ADMINISTRATOR_MUST_BE_CREATED =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_ENABLE_ADMINISTRATOR_MUST_BE_CREATED",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Bind DN for the first server
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_ENABLE_BINDDN1_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_ENABLE_BINDDN1_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Bind DN for the second server
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_ENABLE_BINDDN2_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_ENABLE_BINDDN2_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The following servers in the two topologies have the same domain ID%n%s%n%nThe replication topologies cannot be merged.  To fix this problem please refer to the documentation.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_REPLICATION_ENABLE_COMMON_DOMAIN_ID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_REPLICATION_ENABLE_COMMON_DOMAIN_ID",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * Server %s (base DN '%s') and server %s (base DN '%s') have the same domain ID: %d.
   */
  public static final MessageDescriptor.Arg5<CharSequence,CharSequence,CharSequence,CharSequence,Number> ERR_REPLICATION_ENABLE_COMMON_DOMAIN_ID_ARG =
          new MessageDescriptor.Arg5<CharSequence,CharSequence,CharSequence,CharSequence,Number>(BASE,"SEVERE_ERR_REPLICATION_ENABLE_COMMON_DOMAIN_ID_ARG",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * The following servers in the two topologies have the same replication server ID%n%s%n%nThe replication topologies cannot be merged.  To fix this problem please refer to the documentation.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_REPLICATION_ENABLE_COMMON_REPLICATION_SERVER_ID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_REPLICATION_ENABLE_COMMON_REPLICATION_SERVER_ID",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * Server %s and server %s have the same replication server ID: %d.
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> ERR_REPLICATION_ENABLE_COMMON_REPLICATION_SERVER_ID_ARG =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"SEVERE_ERR_REPLICATION_ENABLE_COMMON_REPLICATION_SERVER_ID_ARG",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * Updating registration configuration on server %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_REPLICATION_ENABLE_CONFIGURING_ADS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_REPLICATION_ENABLE_CONFIGURING_ADS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Updating replication configuration for baseDN %s on server %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_REPLICATION_ENABLE_CONFIGURING_BASEDN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_REPLICATION_ENABLE_CONFIGURING_BASEDN",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Configuring Replication port on server %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_REPLICATION_ENABLE_CONFIGURING_REPLICATION_SERVER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_REPLICATION_ENABLE_CONFIGURING_REPLICATION_SERVER",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * >>>> Specify server administration connection parameters for the first server
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_ENABLE_HOST1_CONNECTION_PARAMETERS =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_ENABLE_HOST1_CONNECTION_PARAMETERS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * >>>> Specify server administration connection parameters for the second server
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_ENABLE_HOST2_CONNECTION_PARAMETERS =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_ENABLE_HOST2_CONNECTION_PARAMETERS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Host name of the first server
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_ENABLE_HOSTNAME1_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_ENABLE_HOSTNAME1_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Host name of the second server
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_ENABLE_HOSTNAME2_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_ENABLE_HOSTNAME2_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Enable Replication
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_ENABLE_MENU_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_ENABLE_MENU_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Password for %s on the first server:
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_REPLICATION_ENABLE_PASSWORD1_PROMPT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_REPLICATION_ENABLE_PASSWORD1_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Password for %s on the second server:
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_REPLICATION_ENABLE_PASSWORD2_PROMPT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_REPLICATION_ENABLE_PASSWORD2_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Administration port of the first server
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_ENABLE_PORT1_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_ENABLE_PORT1_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Administration port of the second server
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_ENABLE_PORT2_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_ENABLE_PORT2_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * How do you want to connect to the first server?
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_ENABLE_PROTOCOL1 =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_ENABLE_PROTOCOL1",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * How do you want to connect to the second server?
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_ENABLE_PROTOCOL2 =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_ENABLE_PROTOCOL2",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Replication port for the first server (the port must be free)
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_ENABLE_REPLICATIONPORT1_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_ENABLE_REPLICATIONPORT1_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Replication port for the second server (the port must be free)
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_ENABLE_REPLICATIONPORT2_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_ENABLE_REPLICATIONPORT2_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Will this server contain the data that is going to be replicated?
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_ENABLE_REPLICATION_DOMAIN1_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_ENABLE_REPLICATION_DOMAIN1_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Will this server contain the data that is going to be replicated?
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_ENABLE_REPLICATION_DOMAIN2_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_ENABLE_REPLICATION_DOMAIN2_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * A replication server contains a changelog with the replication changes and requires a replication port to be configured.%nDo you want the first server to contain a changelog?
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_ENABLE_REPLICATION_SERVER1_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_ENABLE_REPLICATION_SERVER1_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * A replication server contains a changelog with the replication changes and requires a replication port to be configured.%nDo you want the second server to contain a changelog?
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_ENABLE_REPLICATION_SERVER2_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_ENABLE_REPLICATION_SERVER2_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * You have to provide two different servers to enable replication.  You have provided twice the server %s:%s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_REPLICATION_ENABLE_SAME_SERVER_PORT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_REPLICATION_ENABLE_SAME_SERVER_PORT",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * Do you want replication to use encrypted communication when connecting to replication port %s on the first server?
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_REPLICATION_ENABLE_SECURE1_PROMPT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_REPLICATION_ENABLE_SECURE1_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Do you want replication to use encrypted communication when connecting to replication port %s on the second server?
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_REPLICATION_ENABLE_SECURE2_PROMPT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_REPLICATION_ENABLE_SECURE2_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * An unexpected error occurred seeding the truststore contents of server %s with truststore of server %s.  Details: %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_REPLICATION_ENABLE_SEEDING_TRUSTSTORE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_REPLICATION_ENABLE_SEEDING_TRUSTSTORE",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * The following base DN's cannot be replicated between the two servers because they could not be found in at least one of the servers:%n%s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_REPLICATION_ENABLE_SUFFIXES_NOT_FOUND =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_REPLICATION_ENABLE_SUFFIXES_NOT_FOUND",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Replicate base DN %s?
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_REPLICATION_ENABLE_SUFFIX_PROMPT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_REPLICATION_ENABLE_SUFFIX_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Checking registration information
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_ENABLE_UPDATING_ADS_CONTENTS =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_ENABLE_UPDATING_ADS_CONTENTS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Updating remote references on server %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_REPLICATION_ENABLE_UPDATING_REPLICATION_SERVER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_REPLICATION_ENABLE_UPDATING_REPLICATION_SERVER",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The specified path %s to write the equivalent command is a directory.  You must specify a path to a file
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_REPLICATION_EQUIVALENT_COMMAND_LINE_FILE_DIRECTORY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_REPLICATION_EQUIVALENT_COMMAND_LINE_FILE_DIRECTORY",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * The option "--%s" must be specified when this application is used non-interactively
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_REPLICATION_ERROR_MISSING_NON_INTERACTIVE_ARG =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_REPLICATION_ERROR_MISSING_NON_INTERACTIVE_ARG",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * Error reading replication configuration of server %s.%nDetails: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_REPLICATION_ERROR_READING_CONFIGURATION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_REPLICATION_ERROR_READING_CONFIGURATION",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * An error occurred while attempting to write equivalent non-interactive command line to file %s.  Error details:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_REPLICATION_ERROR_WRITING_EQUIVALENT_COMMAND_LINE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_REPLICATION_ERROR_WRITING_EQUIVALENT_COMMAND_LINE",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Initialize All Servers
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_INITIALIZE_ALL_MENU_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_INITIALIZE_ALL_MENU_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Initialize base DN %s?
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_REPLICATION_INITIALIZE_ALL_SUFFIX_PROMPT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_REPLICATION_INITIALIZE_ALL_SUFFIX_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * >>>> Specify server administration connection parameters for the destination server
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_INITIALIZE_DESTINATION_CONNECTION_PARAMETERS =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_INITIALIZE_DESTINATION_CONNECTION_PARAMETERS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The following base DN's could not be found in the server:%n%s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_REPLICATION_INITIALIZE_LOCAL_SUFFIXES_NOT_FOUND =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_REPLICATION_INITIALIZE_LOCAL_SUFFIXES_NOT_FOUND",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Initialize Replication on one Server
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_INITIALIZE_MENU_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_INITIALIZE_MENU_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * You have to provide two different servers as source and destination of the initialization.  You have provided twice the server %s:%s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_REPLICATION_INITIALIZE_SAME_SERVER_PORT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_REPLICATION_INITIALIZE_SAME_SERVER_PORT",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * >>>> Specify server administration connection parameters for the source server
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_INITIALIZE_SOURCE_CONNECTION_PARAMETERS =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_INITIALIZE_SOURCE_CONNECTION_PARAMETERS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Initialize base DN %s?
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_REPLICATION_INITIALIZE_SUFFIX_PROMPT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_REPLICATION_INITIALIZE_SUFFIX_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Error initializing.  Could not find a peer to start the initialization after several tries.  Details: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_REPLICATION_INITIALIZING_TRIES_COMPLETED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_REPLICATION_INITIALIZING_TRIES_COMPLETED",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * To be able to configure replication the registration information of servers %s and %s must be merged.  If any conflict is detected, the information of server %s will be kept and the information of server %s overridden.%nDo you want to continue?
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> INFO_REPLICATION_MERGING_REGISTRIES_CONFIRMATION =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"INFO_REPLICATION_MERGING_REGISTRIES_CONFIRMATION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * To be able to configure replication the registration information of servers %s and %s must be merged.  If any conflict is detected, the information of server %s will be kept and the information of server %s overridden.
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> INFO_REPLICATION_MERGING_REGISTRIES_DESCRIPTION =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"INFO_REPLICATION_MERGING_REGISTRIES_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Merging registration information
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_MERGING_REGISTRIES_PROGRESS =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_MERGING_REGISTRIES_PROGRESS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The equivalent non-interactive command-line is:%n%s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_REPLICATION_NON_INTERACTIVE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_REPLICATION_NON_INTERACTIVE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The provided value %s is not a valid base DN.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_REPLICATION_NOT_A_VALID_BASEDN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_REPLICATION_NOT_A_VALID_BASEDN",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * You must provide the password of the global administrator in non interactive mode.  You can provide it using the %s or the %s options.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_REPLICATION_NO_ADMINISTRATOR_PASSWORD_PROVIDED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_REPLICATION_NO_ADMINISTRATOR_PASSWORD_PROVIDED",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * You must provide at least one base DN in no interactive mode.
   */
  public static final MessageDescriptor.Arg0 ERR_REPLICATION_NO_BASE_DN_PROVIDED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_REPLICATION_NO_BASE_DN_PROVIDED",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * 
   */
  public static final MessageDescriptor.Arg0 ERR_REPLICATION_NO_MESSAGE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_REPLICATION_NO_MESSAGE",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * No replication server is defined for the following base DN's:%n%s%nAt least one replication server (a changelog) is required in the replication topology.  It is recommended to have at least two replication servers (two changelogs) to avoid a single point of failure in the replication topology.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_REPLICATION_NO_REPLICATION_SERVER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_REPLICATION_NO_REPLICATION_SERVER",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * Only one replication server will be defined for the following base DN's:%n%s%nIt is recommended to have at least two replication servers (two changelogs) to avoid a single point of failure in the replication topology.%nDo you want to continue?
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_REPLICATION_ONLY_ONE_REPLICATION_SERVER_CONFIRM =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_REPLICATION_ONLY_ONE_REPLICATION_SERVER_CONFIRM",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Only one replication server will be defined for the following base DN's:%n%s%nIt is recommended to have at least two replication servers (two changelogs) to avoid a single point of failure in the replication topology.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_REPLICATION_ONLY_ONE_REPLICATION_SERVER_WARNING =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_REPLICATION_ONLY_ONE_REPLICATION_SERVER_WARNING",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The server administration port and the replication port have the same value in host %s.  You provided %s for both.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_REPLICATION_PORT_AND_REPLICATION_PORT_EQUAL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_REPLICATION_PORT_AND_REPLICATION_PORT_EQUAL",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * Replication has been successfully enabled.  Note that for replication to work you must initialize the contents of the base DN's that are being replicated (use %s %s to do so).
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_REPLICATION_POST_ENABLE_INFO =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_REPLICATION_POST_ENABLE_INFO",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Post External Initialization
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_POST_EXTERNAL_INITIALIZATION_MENU_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_POST_EXTERNAL_INITIALIZATION_MENU_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Have you initialized with import-ldif or binary copy base DN %s?
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_REPLICATION_POST_EXTERNAL_INITIALIZATION_SUFFIX_PROMPT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_REPLICATION_POST_EXTERNAL_INITIALIZATION_SUFFIX_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Pre External Initialization
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_PRE_EXTERNAL_INITIALIZATION_MENU_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_PRE_EXTERNAL_INITIALIZATION_MENU_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Are you going to initialize with import-ldif or binary copy base DN %s?
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_REPLICATION_PRE_EXTERNAL_INITIALIZATION_SUFFIX_PROMPT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_REPLICATION_PRE_EXTERNAL_INITIALIZATION_SUFFIX_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * You can choose to disable all the replication on the server.  If you choose 'yes' the changelog and the replication port (if defined) will be disabled; if this server contains replicated data, the data will not be replicated with other servers any more; all the registration information will be deleted.%nDo you want to disable all the replication configuration?
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_PROMPT_DISABLE_ALL =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_PROMPT_DISABLE_ALL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Do you want to disable the replication server (changelog and replicatin port '%d') on the server?
   */
  public static final MessageDescriptor.Arg1<Number> INFO_REPLICATION_PROMPT_DISABLE_REPLICATION_SERVER =
          new MessageDescriptor.Arg1<Number>(BASE,"INFO_REPLICATION_PROMPT_DISABLE_REPLICATION_SERVER",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * There is no replication server configured in '%s'.  Do you want to continue?
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_REPLICATION_PROMPT_NO_REPLICATION_SERVER_TO_DISABLE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_REPLICATION_PROMPT_NO_REPLICATION_SERVER_TO_DISABLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * An error occurred executing the purge historical.  Details: %s.%nYou can check the error logs of the local server for more information.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_REPLICATION_PURGE_HISTORICAL_EXECUTING =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_REPLICATION_PURGE_HISTORICAL_EXECUTING",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * Initializing environment for purge historical
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_PURGE_HISTORICAL_LOCAL_ENVIRONMENT =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_PURGE_HISTORICAL_LOCAL_ENVIRONMENT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Do you want to execute the purge on the local server (which is stopped)?
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_PURGE_HISTORICAL_LOCAL_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_PURGE_HISTORICAL_LOCAL_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Purging historical started.
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_PURGE_HISTORICAL_LOCAL_STARTING =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_PURGE_HISTORICAL_LOCAL_STARTING",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Maximum duration for the historical purge in seconds?
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_PURGE_HISTORICAL_MAXIMUM_DURATION_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_PURGE_HISTORICAL_MAXIMUM_DURATION_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Purge Historical
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_PURGE_HISTORICAL_MENU_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_PURGE_HISTORICAL_MENU_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Purge historical on base DN %s?
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_REPLICATION_PURGE_HISTORICAL_PROMPT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_REPLICATION_PURGE_HISTORICAL_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The specified maximum time of %d seconds was elapsed before the purge historical completed.
   */
  public static final MessageDescriptor.Arg1<Number> ERR_REPLICATION_PURGE_HISTORICAL_TIMEOUT =
          new MessageDescriptor.Arg1<Number>(BASE,"SEVERE_ERR_REPLICATION_PURGE_HISTORICAL_TIMEOUT",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * The following base DN's could not be found in the server:%n%s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_REPLICATION_PURGE_SUFFIXES_NOT_FOUND =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_REPLICATION_PURGE_SUFFIXES_NOT_FOUND",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Error reading registration information.  Details: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_REPLICATION_READING_ADS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_REPLICATION_READING_ADS",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * The following errors were encountered reading the configuration of the existing servers:%n%s%n%nIf you continue the replication tool will to try to update the configuration of all the servers in a best-effort mode.  However it cannot guarantee that the servers that are generating errors will be updated.  Do you want to continue?
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_REPLICATION_READING_REGISTERED_SERVERS_CONFIRM_UPDATE_REMOTE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_REPLICATION_READING_REGISTERED_SERVERS_CONFIRM_UPDATE_REMOTE",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The following errors were encountered reading the configuration of the existing servers:
   * %s
   * The replication tool will to try to update the configuration of all the servers in a best-effort mode.  However it cannot guarantee that the servers that are generating errors will be updated.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_REPLICATION_READING_REGISTERED_SERVERS_WARNING =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_REPLICATION_READING_REGISTERED_SERVERS_WARNING",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Removing registration information
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_REMOVE_ADS_CONTENTS =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_REMOVE_ADS_CONTENTS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Removing truststore information
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_REMOVE_TRUSTSTORE_CONTENTS =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_REMOVE_TRUSTSTORE_CONTENTS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Removing references on base DN %s of server %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_REPLICATION_REMOVING_REFERENCES_ON_REMOTE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_REPLICATION_REMOVING_REFERENCES_ON_REMOTE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * You have provided the same replication port (%s) for two servers located on the same machine (%s).
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_REPLICATION_SAME_REPLICATION_PORT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_REPLICATION_SAME_REPLICATION_PORT",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * You asked not to configure a replication server in '%s' but the server already has a replication server configured (with replication port '%d').
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> INFO_REPLICATION_SERVER_CONFIGURED_WARNING =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"INFO_REPLICATION_SERVER_CONFIGURED_WARNING",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * You asked not to configure a replication server in '%s' but the server already has a replication server configured (with replication port '%d').  Do you want to continue?
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> INFO_REPLICATION_SERVER_CONFIGURED_WARNING_PROMPT =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"INFO_REPLICATION_SERVER_CONFIGURED_WARNING_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Base DN
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_STATUS_BASEDN =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_STATUS_BASEDN",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * A.O.M.C. (2)
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_STATUS_HEADER_AGE_OF_OLDEST_MISSING_CHANGE =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_STATUS_HEADER_AGE_OF_OLDEST_MISSING_CHANGE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * M.C. (1)
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_STATUS_HEADER_MISSING_CHANGES =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_STATUS_HEADER_MISSING_CHANGES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Entries
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_STATUS_HEADER_NUMBER_ENTRIES =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_STATUS_HEADER_NUMBER_ENTRIES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Port (3)
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_STATUS_HEADER_REPLICATION_PORT =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_STATUS_HEADER_REPLICATION_PORT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Security (4)
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_STATUS_HEADER_SECURE =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_STATUS_HEADER_SECURE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Server
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_STATUS_HEADER_SERVERPORT =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_STATUS_HEADER_SERVERPORT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The following servers have a replication server (with changelog and a replication port) but are not linked to any server containing replicated data.
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_STATUS_INDEPENDENT_REPLICATION_SERVERS =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_STATUS_INDEPENDENT_REPLICATION_SERVERS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Replication
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_STATUS_IS_REPLICATED =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_STATUS_IS_REPLICATED",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Age of oldest missing change:
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_STATUS_LABEL_AGE_OF_OLDEST_MISSING_CHANGE =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_STATUS_LABEL_AGE_OF_OLDEST_MISSING_CHANGE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Missing Changes:
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_STATUS_LABEL_MISSING_CHANGES =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_STATUS_LABEL_MISSING_CHANGES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Entries:
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_STATUS_LABEL_NUMBER_ENTRIES =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_STATUS_LABEL_NUMBER_ENTRIES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Replication Port:
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_STATUS_LABEL_REPLICATION_PORT =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_STATUS_LABEL_REPLICATION_PORT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Security:
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_STATUS_LABEL_SECURE =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_STATUS_LABEL_SECURE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Server:
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_STATUS_LABEL_SERVERPORT =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_STATUS_LABEL_SERVERPORT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Display Replication Status
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_STATUS_MENU_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_STATUS_MENU_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * [6] Server does not contain replicated data for the suffix.
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_STATUS_NOT_A_REPLICATION_DOMAIN_LEGEND =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_STATUS_NOT_A_REPLICATION_DOMAIN_LEGEND",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Server does not contain replicated data for the suffix
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_STATUS_NOT_A_REPLICATION_DOMAIN_LONG =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_STATUS_NOT_A_REPLICATION_DOMAIN_LONG",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * -- (6)
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_STATUS_NOT_A_REPLICATION_DOMAIN_SHORT =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_STATUS_NOT_A_REPLICATION_DOMAIN_SHORT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * [5] Server not configured as a replication server (no replication changelog).
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_STATUS_NOT_A_REPLICATION_SERVER_LEGEND =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_STATUS_NOT_A_REPLICATION_SERVER_LEGEND",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Server not configured as a replication server (no changelog)
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_STATUS_NOT_A_REPLICATION_SERVER_LONG =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_STATUS_NOT_A_REPLICATION_SERVER_LONG",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * -- (5)
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_STATUS_NOT_A_REPLICATION_SERVER_SHORT =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_STATUS_NOT_A_REPLICATION_SERVER_SHORT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * %s - Replication Disabled
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_REPLICATION_STATUS_NOT_REPLICATED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_REPLICATION_STATUS_NOT_REPLICATED",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * No replication information for the base DN's found.
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_STATUS_NO_BASEDNS =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_STATUS_NO_BASEDNS",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * No replication information found.
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_STATUS_NO_REPLICATION_INFORMATION =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_STATUS_NO_REPLICATION_INFORMATION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The '%s' subcommand is not compatible with the %s option.
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_REPLICATION_STATUS_QUIET =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_REPLICATION_STATUS_QUIET",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * The displayed information might not be complete because the following errors were encountered reading the configuration of the existing servers:%n%s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_REPLICATION_STATUS_READING_REGISTERED_SERVERS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_REPLICATION_STATUS_READING_REGISTERED_SERVERS",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * %s - Replication Enabled
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_REPLICATION_STATUS_REPLICATED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_REPLICATION_STATUS_REPLICATED",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * [1] The number of changes that are still missing on this server (and that have been applied to at least one of the other servers).%n[2] Age of oldest missing change: the date on which the oldest change that has not arrived on this server was generated.%n[3] The port used to communicate between the servers whose contents are being replicated.%n[4] Whether the replication communication through the replication port is encrypted or not.
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_STATUS_REPLICATED_LEGEND =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_STATUS_REPLICATED_LEGEND",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Disabled
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_STATUS_SECURITY_DISABLED =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_STATUS_SECURITY_DISABLED",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Enabled
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_STATUS_SECURITY_ENABLED =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_STATUS_SECURITY_ENABLED",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * What do you want to do?
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_SUBCOMMAND_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_SUBCOMMAND_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The operation has been successfully completed
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_SUCCESSFUL =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_SUCCESSFUL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The operation has been successfully completed, but no action was required
   */
  public static final MessageDescriptor.Arg0 INFO_REPLICATION_SUCCESSFUL_NOP =
          new MessageDescriptor.Arg0(BASE,"INFO_REPLICATION_SUCCESSFUL_NOP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * This utility can be used to configure replication between servers so that the data of the servers is synchronized.  For replication to work you must first enable replication using the '%s' subcommand and then initialize the contents of one of the servers with the contents of the other using the '%s' subcommand
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_REPLICATION_TOOL_DESCRIPTION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_REPLICATION_TOOL_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Error updating registration information.  Details: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_REPLICATION_UPDATING_ADS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_REPLICATION_UPDATING_ADS",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * User cancelled the operation
   */
  public static final MessageDescriptor.Arg0 ERR_REPLICATION_USER_CANCELLED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_REPLICATION_USER_CANCELLED",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Could not find a valid subcommand.  You must specify a subcommand when using the option %s.
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_REPLICATION_VALID_SUBCOMMAND_NOT_FOUND =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_REPLICATION_VALID_SUBCOMMAND_NOT_FOUND",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * There is no replication server configured in '%s'.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_REPLICATION_WARNING_NO_REPLICATION_SERVER_TO_DISABLE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_REPLICATION_WARNING_NO_REPLICATION_SERVER_TO_DISABLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Required Icon.
   */
  public static final MessageDescriptor.Arg0 INFO_REQUIRED_ICON_ACCESSIBLE_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_REQUIRED_ICON_ACCESSIBLE_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Restart
   */
  public static final MessageDescriptor.Arg0 INFO_RESTART_BUTTON_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_RESTART_BUTTON_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Restarts the Directory Server
   */
  public static final MessageDescriptor.Arg0 INFO_RESTART_BUTTON_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_RESTART_BUTTON_TOOLTIP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Launch later
   */
  public static final MessageDescriptor.Arg0 INFO_RUN_TASK_LATER =
          new MessageDescriptor.Arg0(BASE,"INFO_RUN_TASK_LATER",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Launch now
   */
  public static final MessageDescriptor.Arg0 INFO_RUN_TASK_NOW =
          new MessageDescriptor.Arg0(BASE,"INFO_RUN_TASK_NOW",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Schedule to run the task periodically
   */
  public static final MessageDescriptor.Arg0 INFO_SCHEDULE_TASK =
          new MessageDescriptor.Arg0(BASE,"INFO_SCHEDULE_TASK",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The second server is already configured with replication port '%d'.  The provided replication server port '%d' has been ignored.
   */
  public static final MessageDescriptor.Arg2<Number,Number> WARN_SECOND_REPLICATION_SERVER_ALREADY_CONFIGURED =
          new MessageDescriptor.Arg2<Number,Number>(BASE,"MILD_WARN_SECOND_REPLICATION_SERVER_ALREADY_CONFIGURED",ADMIN_TOOL,MILD_WARNING,-1, getClassLoader());

  /**
   * Server Details
   */
  public static final MessageDescriptor.Arg0 INFO_SERVER_DETAILS_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_SERVER_DETAILS_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Not Connected to Remote
   */
  public static final MessageDescriptor.Arg0 INFO_SERVER_NOT_CONNECTED_TO_REMOTE_STATUS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_SERVER_NOT_CONNECTED_TO_REMOTE_STATUS_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Server Path:
   */
  public static final MessageDescriptor.Arg0 INFO_SERVER_PATH_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_SERVER_PATH_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Started
   */
  public static final MessageDescriptor.Arg0 INFO_SERVER_STARTED_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_SERVER_STARTED_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Starting
   */
  public static final MessageDescriptor.Arg0 INFO_SERVER_STARTING_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_SERVER_STARTING_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Server Run Status:
   */
  public static final MessageDescriptor.Arg0 INFO_SERVER_STATUS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_SERVER_STATUS_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Server Status
   */
  public static final MessageDescriptor.Arg0 INFO_SERVER_STATUS_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_SERVER_STATUS_TITLE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Stopped
   */
  public static final MessageDescriptor.Arg0 INFO_SERVER_STOPPED_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_SERVER_STOPPED_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Stopping
   */
  public static final MessageDescriptor.Arg0 INFO_SERVER_STOPPING_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_SERVER_STOPPING_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Unknown
   */
  public static final MessageDescriptor.Arg0 INFO_SERVER_UNKNOWN_STATUS_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_SERVER_UNKNOWN_STATUS_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * SNMP
   */
  public static final MessageDescriptor.Arg0 INFO_SNMP_PROTOCOL_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_SNMP_PROTOCOL_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Could not Start server.
   */
  public static final MessageDescriptor.Arg0 ERR_STARTING_SERVER_GENERIC =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_STARTING_SERVER_GENERIC",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * Start
   */
  public static final MessageDescriptor.Arg0 INFO_START_BUTTON_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_START_BUTTON_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Starts the Directory Server
   */
  public static final MessageDescriptor.Arg0 INFO_START_BUTTON_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_START_BUTTON_TOOLTIP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * State
   */
  public static final MessageDescriptor.Arg0 INFO_STATE_COLUMN =
          new MessageDescriptor.Arg0(BASE,"INFO_STATE_COLUMN",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Static group
   */
  public static final MessageDescriptor.Arg0 INFO_STATIC_GROUP_ICON_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_STATIC_GROUP_ICON_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * This utility can be used to display basic server information
   */
  public static final MessageDescriptor.Arg0 INFO_STATUS_CLI_USAGE_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_STATUS_CLI_USAGE_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Stop
   */
  public static final MessageDescriptor.Arg0 INFO_STOP_BUTTON_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_STOP_BUTTON_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Stops the Directory Server
   */
  public static final MessageDescriptor.Arg0 INFO_STOP_BUTTON_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_STOP_BUTTON_TOOLTIP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The following base DN's cannot be initialized because they are not replicated or they are not configured on both servers:%n%s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SUFFIXES_CANNOT_BE_INITIALIZED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SUFFIXES_CANNOT_BE_INITIALIZED",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * Deleting Database Files outside the Installation Path...
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_DELETING_EXTERNAL_DB_FILES =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_DELETING_EXTERNAL_DB_FILES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Deleting Log Files outside the Installation Path...
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_DELETING_EXTERNAL_LOG_FILES =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_DELETING_EXTERNAL_LOG_FILES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Deleting External References...
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_DELETING_EXTERNAL_REFERENCES =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_DELETING_EXTERNAL_REFERENCES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Deleting Files under the Installation Path...
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_DELETING_INSTALLATION_FILES =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_DELETING_INSTALLATION_FILES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Disabling Windows Service...
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_DISABLING_WINDOWS_SERVICE =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_DISABLING_WINDOWS_SERVICE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Removing references in remote servers...
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_UNCONFIGURING_REPLICATION =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_UNCONFIGURING_REPLICATION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * <b>Uninstall Completed Successfully.</b>
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_UNINSTALL_FINISHED_SUCCESSFULLY =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_UNINSTALL_FINISHED_SUCCESSFULLY",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Uninstall Completed Successfully.
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_UNINSTALL_FINISHED_SUCCESSFULLY_CLI =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_UNINSTALL_FINISHED_SUCCESSFULLY_CLI",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * <b>The Uninstall Completed Successfully.</b><br><br>To complete the uninstallation, you must delete manually the following files and directories:<br>%s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_SUMMARY_UNINSTALL_FINISHED_SUCCESSFULLY_REMOVE_JARFILES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_SUMMARY_UNINSTALL_FINISHED_SUCCESSFULLY_REMOVE_JARFILES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The Uninstall Completed Successfully.%nTo complete the uninstallation, you must delete manually the following files and directories:%n%s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_SUMMARY_UNINSTALL_FINISHED_SUCCESSFULLY_REMOVE_JARFILES_CLI =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_SUMMARY_UNINSTALL_FINISHED_SUCCESSFULLY_REMOVE_JARFILES_CLI",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * An error occurred.  Check 'Details' text area for more information.
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_UNINSTALL_FINISHED_WITH_ERROR =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_UNINSTALL_FINISHED_WITH_ERROR",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * <b>The Uninstall Succeeded With Warnings</b><br>The server was successfully uninstalled in the local machine but some error occurred deleting files.  Check 'Details' text area for more information about the files that caused the problem.<br><br>Verify that there is no other program using those files and delete them manually.
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_UNINSTALL_FINISHED_WITH_ERROR_DELETING =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_UNINSTALL_FINISHED_WITH_ERROR_DELETING",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The server was successfully uninstalled in the local machine but some error occurred deleting files.  Check 'Details' text area for more information about the files that caused the problem.%n%nVerify that there is no other program using those files and delete them manually.
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_UNINSTALL_FINISHED_WITH_ERROR_DELETING_CLI =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_UNINSTALL_FINISHED_WITH_ERROR_DELETING_CLI",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * <b>The Uninstall Succeeded With Warnings</b><br>The server was successfully uninstalled in the local machine but some error occurred updating remote servers.  Check 'Details' text area for more information.
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_UNINSTALL_FINISHED_WITH_ERROR_ON_REMOTE =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_UNINSTALL_FINISHED_WITH_ERROR_ON_REMOTE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The server was successfully uninstalled in the local machine but some error occurred updating remote servers.
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_UNINSTALL_FINISHED_WITH_ERROR_ON_REMOTE_CLI =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_UNINSTALL_FINISHED_WITH_ERROR_ON_REMOTE_CLI",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Starting Uninstallation...
   */
  public static final MessageDescriptor.Arg0 INFO_SUMMARY_UNINSTALL_NOT_STARTED =
          new MessageDescriptor.Arg0(BASE,"INFO_SUMMARY_UNINSTALL_NOT_STARTED",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * ID of the tasks this task depends on [continue]:
   */
  public static final MessageDescriptor.Arg0 INFO_TASK_DEPENDENCIES_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_TASK_DEPENDENCIES_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Which action must this task take if one if its dependent tasks fails?
   */
  public static final MessageDescriptor.Arg0 INFO_TASK_FAILED_DEPENDENCY_ACTION_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_TASK_FAILED_DEPENDENCY_ACTION_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Has this task a dependency on another task?
   */
  public static final MessageDescriptor.Arg0 INFO_TASK_HAS_DEPENDENCIES_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_TASK_HAS_DEPENDENCIES_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Periodical schedule when the task must run (in crontab(5) format):
   */
  public static final MessageDescriptor.Arg0 INFO_TASK_RECURRING_SCHEDULE_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_TASK_RECURRING_SCHEDULE_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Specify when the task '%s' will be launched.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_TASK_SCHEDULE_PROMPT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_TASK_SCHEDULE_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * >>>> Specify task scheduling parameters
   */
  public static final MessageDescriptor.Arg0 INFO_TASK_SCHEDULE_PROMPT_HEADER =
          new MessageDescriptor.Arg0(BASE,"INFO_TASK_SCHEDULE_PROMPT_HEADER",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Launch date (in YYYYMMDDhhmmssZ or YYYYMMDDhhmmss format):
   */
  public static final MessageDescriptor.Arg0 INFO_TASK_START_DATE_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_TASK_START_DATE_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * -Unknown-
   */
  public static final MessageDescriptor.Arg0 INFO_UNDEFINED_PROTOCOL_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_UNDEFINED_PROTOCOL_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Specifies to use the command line install.  If not specified the graphical interface will be launched.  The rest of the options (excluding help and version) will only be taken into account if this option is specified
   */
  public static final MessageDescriptor.Arg0 INFO_UNINSTALLDS_DESCRIPTION_CLI =
          new MessageDescriptor.Arg0(BASE,"INFO_UNINSTALLDS_DESCRIPTION_CLI",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Specifies whether the uninstall should continue if there is an error updating references to this server in remote server instances or not.  This option can only be used with the %s no prompt option.
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_UNINSTALLDS_DESCRIPTION_FORCE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_UNINSTALLDS_DESCRIPTION_FORCE",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Run uninstall in quiet mode.  Quiet mode will not output progress information to standard output
   */
  public static final MessageDescriptor.Arg0 INFO_UNINSTALLDS_DESCRIPTION_QUIET =
          new MessageDescriptor.Arg0(BASE,"INFO_UNINSTALLDS_DESCRIPTION_QUIET",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Remove all components of the server (this option is not compatible with the rest of remove options)
   */
  public static final MessageDescriptor.Arg0 INFO_UNINSTALLDS_DESCRIPTION_REMOVE_ALL =
          new MessageDescriptor.Arg0(BASE,"INFO_UNINSTALLDS_DESCRIPTION_REMOVE_ALL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Remove backup files
   */
  public static final MessageDescriptor.Arg0 INFO_UNINSTALLDS_DESCRIPTION_REMOVE_BACKUP_FILES =
          new MessageDescriptor.Arg0(BASE,"INFO_UNINSTALLDS_DESCRIPTION_REMOVE_BACKUP_FILES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Remove configuration files
   */
  public static final MessageDescriptor.Arg0 INFO_UNINSTALLDS_DESCRIPTION_REMOVE_CONFIGURATION_FILES =
          new MessageDescriptor.Arg0(BASE,"INFO_UNINSTALLDS_DESCRIPTION_REMOVE_CONFIGURATION_FILES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Remove database contents
   */
  public static final MessageDescriptor.Arg0 INFO_UNINSTALLDS_DESCRIPTION_REMOVE_DATABASES =
          new MessageDescriptor.Arg0(BASE,"INFO_UNINSTALLDS_DESCRIPTION_REMOVE_DATABASES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Remove LDIF files
   */
  public static final MessageDescriptor.Arg0 INFO_UNINSTALLDS_DESCRIPTION_REMOVE_LDIF_FILES =
          new MessageDescriptor.Arg0(BASE,"INFO_UNINSTALLDS_DESCRIPTION_REMOVE_LDIF_FILES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Remove log files
   */
  public static final MessageDescriptor.Arg0 INFO_UNINSTALLDS_DESCRIPTION_REMOVE_LOG_FILES =
          new MessageDescriptor.Arg0(BASE,"INFO_UNINSTALLDS_DESCRIPTION_REMOVE_LOG_FILES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Remove Server Libraries and Administrative Tools
   */
  public static final MessageDescriptor.Arg0 INFO_UNINSTALLDS_DESCRIPTION_REMOVE_SERVER_LIBRARIES =
          new MessageDescriptor.Arg0(BASE,"INFO_UNINSTALLDS_DESCRIPTION_REMOVE_SERVER_LIBRARIES",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The name of this host (or IP address) as it is referenced in remote servers for replication
   */
  public static final MessageDescriptor.Arg0 INFO_UNINSTALL_CLI_REFERENCED_HOSTNAME_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_UNINSTALL_CLI_REFERENCED_HOSTNAME_PROMPT",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Do you want to provide authentication again?  (If you say no, the references to this server in other servers will not be removed).
   */
  public static final MessageDescriptor.Arg0 INFO_UNINSTALL_CONFIRM_PROVIDE_AUTHENTICATION_AGAIN =
          new MessageDescriptor.Arg0(BASE,"INFO_UNINSTALL_CONFIRM_PROVIDE_AUTHENTICATION_AGAIN",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * This server is configured to replicate some of its Base DN's.  There was an error retrieving the references to it in the replicated servers.  Note that to be able to remove remote references you must provide Global Administrator credentials using the %s and %s (or %s) options.%nContinuing uninstall as we are on force on error mode.%n%nThe error found was:%n%s
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> ERR_UNINSTALL_ERROR_UPDATING_REMOTE_FORCE =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_UNINSTALL_ERROR_UPDATING_REMOTE_FORCE",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * This server is configured to replicate some of its Base DN's.  There was an error retrieving the references to it in the replicated servers.  Note that to be able to remove remote references you must provide Global Administrator credentials using the %s and %s (or %s) options.%nCheck that the connection parameters you provided are correct.%nIf you want to uninstall the server even when remote references cannot be removed, you can use the %s option.%n%nThe error found was:%n%s
   */
  public static final MessageDescriptor.Arg5<CharSequence,CharSequence,CharSequence,CharSequence,CharSequence> ERR_UNINSTALL_ERROR_UPDATING_REMOTE_NO_FORCE =
          new MessageDescriptor.Arg5<CharSequence,CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_UNINSTALL_ERROR_UPDATING_REMOTE_NO_FORCE",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * The %s option only can be used when %s has been specified
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_UNINSTALL_FORCE_REQUIRES_NO_PROMPT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_UNINSTALL_FORCE_REQUIRES_NO_PROMPT",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * %n%nThe graphical Uninstall launch failed.%n%nLaunching command line uninstall...
   */
  public static final MessageDescriptor.Arg0 ERR_UNINSTALL_LAUNCHER_GUI_LAUNCHED_FAILED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_UNINSTALL_LAUNCHER_GUI_LAUNCHED_FAILED",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * %n%nThe graphical Uninstall launch failed.  Check file %s for more details.%n%nLaunching command line uninstall...
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_UNINSTALL_LAUNCHER_GUI_LAUNCHED_FAILED_DETAILS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_UNINSTALL_LAUNCHER_GUI_LAUNCHED_FAILED_DETAILS",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * Launching command line uninstall...
   */
  public static final MessageDescriptor.Arg0 INFO_UNINSTALL_LAUNCHER_LAUNCHING_CLI =
          new MessageDescriptor.Arg0(BASE,"INFO_UNINSTALL_LAUNCHER_LAUNCHING_CLI",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Launching graphical uninstall...
   */
  public static final MessageDescriptor.Arg0 INFO_UNINSTALL_LAUNCHER_LAUNCHING_GUI =
          new MessageDescriptor.Arg0(BASE,"INFO_UNINSTALL_LAUNCHER_LAUNCHING_GUI",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * This utility can be used to uninstall the Directory Server.
   */
  public static final MessageDescriptor.Arg0 INFO_UNINSTALL_LAUNCHER_USAGE_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_UNINSTALL_LAUNCHER_USAGE_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Close this dialog and do not try to remove references of this server in other servers.
   */
  public static final MessageDescriptor.Arg0 INFO_UNINSTALL_LOGIN_CANCEL_BUTTON_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_UNINSTALL_LOGIN_CANCEL_BUTTON_TOOLTIP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * You must provide a Global Administrative User ID to be able to remove the references to this server in other servers.%nYou must also provide the name of this host (or IP address) as it is referenced in remote servers.
   */
  public static final MessageDescriptor.Arg0 INFO_UNINSTALL_LOGIN_DIALOG_MSG =
          new MessageDescriptor.Arg0(BASE,"INFO_UNINSTALL_LOGIN_DIALOG_MSG",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Host Name:
   */
  public static final MessageDescriptor.Arg0 INFO_UNINSTALL_LOGIN_HOST_NAME_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_UNINSTALL_LOGIN_HOST_NAME_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The name of this host (or IP address) as it is referenced in other servers.
   */
  public static final MessageDescriptor.Arg0 INFO_UNINSTALL_LOGIN_HOST_NAME_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_UNINSTALL_LOGIN_HOST_NAME_TOOLTIP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Try to connect with the provided authentication.
   */
  public static final MessageDescriptor.Arg0 INFO_UNINSTALL_LOGIN_OK_BUTTON_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_UNINSTALL_LOGIN_OK_BUTTON_TOOLTIP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The password of the Global Administrator to be used to read and update configuration in other servers.
   */
  public static final MessageDescriptor.Arg0 INFO_UNINSTALL_LOGIN_PWD_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_UNINSTALL_LOGIN_PWD_TOOLTIP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * The Global Administrator User ID to be used to read and update configuration in other servers.
   */
  public static final MessageDescriptor.Arg0 INFO_UNINSTALL_LOGIN_UID_TOOLTIP =
          new MessageDescriptor.Arg0(BASE,"INFO_UNINSTALL_LOGIN_UID_TOOLTIP",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * This server is configured to replicate some of its Base DN's.  There was an error retrieving the references to it in the replicated servers.%nDo you want to continue?
   */
  public static final MessageDescriptor.Arg0 ERR_UNINSTALL_NOT_UPDATE_REMOTE_PROMPT =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_UNINSTALL_NOT_UPDATE_REMOTE_PROMPT",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * The following errors were encountered reading the configuration of the existing servers:%n%s%nDo you want the uninstaller to try to remove the references to this server in a best-effort mode?
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_UNINSTALL_READING_REGISTERED_SERVERS_CONFIRM_UPDATE_REMOTE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_UNINSTALL_READING_REGISTERED_SERVERS_CONFIRM_UPDATE_REMOTE",ADMIN_TOOL,MILD_ERROR,-1, getClassLoader());

  /**
   * --
   */
  public static final MessageDescriptor.Arg0 INFO_UNKNOWN_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_UNKNOWN_LABEL",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Could not find version information in the remote server.  The remote LDAP server does not seem to be manageable remotely by the control panel.
   */
  public static final MessageDescriptor.Arg0 ERR_VERSION_IN_REMOTE_SERVER_NOT_FOUND =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_VERSION_IN_REMOTE_SERVER_NOT_FOUND",ADMIN_TOOL,SEVERE_ERROR,-1, getClassLoader());

  /**
   * Virtual static group
   */
  public static final MessageDescriptor.Arg0 INFO_VIRTUAL_STATIC_GROUP_ICON_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_VIRTUAL_STATIC_GROUP_ICON_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());

  /**
   * Warning Icon.
   */
  public static final MessageDescriptor.Arg0 INFO_WARNING_ICON_ACCESSIBLE_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_WARNING_ICON_ACCESSIBLE_DESCRIPTION",ADMIN_TOOL,INFORMATION,-1, getClassLoader());


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
            Class<?> c = Class.forName("org.opends.messages.AdminToolMessages");

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
      cl = AdminToolMessages.class.getClassLoader();
    }
    return cl;
  }
}
