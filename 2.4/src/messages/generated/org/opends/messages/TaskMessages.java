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
public final class TaskMessages {

  /** Base property for resource bundle containing messages */
  private static final String BASE = "messages/task";

  private static ClassLoader webstartClassLoader;

  // Prevent instantiation.
  private TaskMessages() {
    // Do nothing.
  }

  /**
   * The task could not enable a backend: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASK_CANNOT_ENABLE_BACKEND =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASK_CANNOT_ENABLE_BACKEND_1",TASK,SEVERE_ERROR,1, getClassLoader());

  /**
   * The task could not disable a backend: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASK_CANNOT_DISABLE_BACKEND =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASK_CANNOT_DISABLE_BACKEND_2",TASK,SEVERE_ERROR,2, getClassLoader());

  /**
   * The Directory Server shutdown process has been initiated by task %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_TASK_SHUTDOWN_DEFAULT_MESSAGE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_TASK_SHUTDOWN_DEFAULT_MESSAGE_3",TASK,INFORMATION,3, getClassLoader());

  /**
   * The Directory Server shutdown process has been initiated by task %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_TASK_SHUTDOWN_CUSTOM_MESSAGE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_TASK_SHUTDOWN_CUSTOM_MESSAGE_4",TASK,INFORMATION,4, getClassLoader());

  /**
   * Unable to add one or more files to the server schema because no schema file names were provided in attribute %s of task entry %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TASK_ADDSCHEMAFILE_NO_FILENAME =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASK_ADDSCHEMAFILE_NO_FILENAME_5",TASK,SEVERE_ERROR,5, getClassLoader());

  /**
   * Unable to add one or more files to the server schema because the specified schema file %s does not exist in schema directories %s or %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_TASK_ADDSCHEMAFILE_NO_SUCH_FILE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASK_ADDSCHEMAFILE_NO_SUCH_FILE_6",TASK,SEVERE_ERROR,6, getClassLoader());

  /**
   * Unable to add one or more files to the server schema because an error occurred while attempting to determine whether file %s exists in schema directory %s or %s:  %s
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> ERR_TASK_ADDSCHEMAFILE_ERROR_CHECKING_FOR_FILE =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASK_ADDSCHEMAFILE_ERROR_CHECKING_FOR_FILE_7",TASK,SEVERE_ERROR,7, getClassLoader());

  /**
   * An error occurred while attempting to load the contents of schema file %s into the server schema:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TASK_ADDSCHEMAFILE_ERROR_LOADING_SCHEMA_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASK_ADDSCHEMAFILE_ERROR_LOADING_SCHEMA_FILE_8",TASK,SEVERE_ERROR,8, getClassLoader());

  /**
   * Unable to add one or more files to the server schema because the server was unable to obtain a write lock on the schema entry %s after multiple attempts
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASK_ADDSCHEMAFILE_CANNOT_LOCK_SCHEMA =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASK_ADDSCHEMAFILE_CANNOT_LOCK_SCHEMA_9",TASK,SEVERE_ERROR,9, getClassLoader());

  /**
   * You do not have sufficient privileges to modify the server schema
   */
  public static final MessageDescriptor.Arg0 ERR_TASK_ADDSCHEMAFILE_INSUFFICIENT_PRIVILEGES =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_TASK_ADDSCHEMAFILE_INSUFFICIENT_PRIVILEGES_10",TASK,SEVERE_ERROR,10, getClassLoader());

  /**
   * You do not have sufficient privileges to initiate a Directory Server backup
   */
  public static final MessageDescriptor.Arg0 ERR_TASK_BACKUP_INSUFFICIENT_PRIVILEGES =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_TASK_BACKUP_INSUFFICIENT_PRIVILEGES_11",TASK,SEVERE_ERROR,11, getClassLoader());

  /**
   * You do not have sufficient privileges to initiate a Directory Server restore
   */
  public static final MessageDescriptor.Arg0 ERR_TASK_RESTORE_INSUFFICIENT_PRIVILEGES =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_TASK_RESTORE_INSUFFICIENT_PRIVILEGES_12",TASK,SEVERE_ERROR,12, getClassLoader());

  /**
   * You do not have sufficient privileges to initiate an LDIF import
   */
  public static final MessageDescriptor.Arg0 ERR_TASK_LDIFIMPORT_INSUFFICIENT_PRIVILEGES =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_TASK_LDIFIMPORT_INSUFFICIENT_PRIVILEGES_13",TASK,SEVERE_ERROR,13, getClassLoader());

  /**
   * You do not have sufficient privileges to initiate an LDIF export
   */
  public static final MessageDescriptor.Arg0 ERR_TASK_LDIFEXPORT_INSUFFICIENT_PRIVILEGES =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_TASK_LDIFEXPORT_INSUFFICIENT_PRIVILEGES_14",TASK,SEVERE_ERROR,14, getClassLoader());

  /**
   * You do not have sufficient privileges to initiate a Directory Server restart
   */
  public static final MessageDescriptor.Arg0 ERR_TASK_SHUTDOWN_INSUFFICIENT_RESTART_PRIVILEGES =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_TASK_SHUTDOWN_INSUFFICIENT_RESTART_PRIVILEGES_15",TASK,SEVERE_ERROR,15, getClassLoader());

  /**
   * You do not have sufficient privileges to initiate a Directory Server shutdown
   */
  public static final MessageDescriptor.Arg0 ERR_TASK_SHUTDOWN_INSUFFICIENT_SHUTDOWN_PRIVILEGES =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_TASK_SHUTDOWN_INSUFFICIENT_SHUTDOWN_PRIVILEGES_16",TASK,SEVERE_ERROR,16, getClassLoader());

  /**
   * An error occurred while attempting to notify a synchronization provider of type %s about the schema changes made by the add schema file task:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TASK_ADDSCHEMAFILE_CANNOT_NOTIFY_SYNC_PROVIDER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASK_ADDSCHEMAFILE_CANNOT_NOTIFY_SYNC_PROVIDER_17",TASK,SEVERE_ERROR,17, getClassLoader());

  /**
   * You do not have sufficient privileges to initiate an index rebuild
   */
  public static final MessageDescriptor.Arg0 ERR_TASK_INDEXREBUILD_INSUFFICIENT_PRIVILEGES =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_TASK_INDEXREBUILD_INSUFFICIENT_PRIVILEGES_18",TASK,SEVERE_ERROR,18, getClassLoader());

  /**
   * Invalid DN provided with the Initialize Target task
   */
  public static final MessageDescriptor.Arg0 ERR_TASK_INITIALIZE_TARGET_INVALID_DN =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_TASK_INITIALIZE_TARGET_INVALID_DN_19",TASK,SEVERE_ERROR,19, getClassLoader());

  /**
   * Invalid DN provided with the Initialize task
   */
  public static final MessageDescriptor.Arg0 ERR_TASK_INITIALIZE_INVALID_DN =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_TASK_INITIALIZE_INVALID_DN_20",TASK,SEVERE_ERROR,20, getClassLoader());

  /**
   * Only users with the SERVER_LOCKDOWN privilege may place the server in lockdown mode
   */
  public static final MessageDescriptor.Arg0 ERR_TASK_ENTERLOCKDOWN_NOT_ROOT =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_TASK_ENTERLOCKDOWN_NOT_ROOT_21",TASK,SEVERE_ERROR,21, getClassLoader());

  /**
   * Only users with the SERVER_LOCKDOWN privilege connected from a loopback address may place the server in lockdown mode
   */
  public static final MessageDescriptor.Arg0 ERR_TASK_ENTERLOCKDOWN_NOT_LOOPBACK =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_TASK_ENTERLOCKDOWN_NOT_LOOPBACK_22",TASK,SEVERE_ERROR,22, getClassLoader());

  /**
   * Only users with the SERVER_LOCKDOWN privilege may cause the server to leave lockdown mode
   */
  public static final MessageDescriptor.Arg0 ERR_TASK_LEAVELOCKDOWN_NOT_ROOT =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_TASK_LEAVELOCKDOWN_NOT_ROOT_23",TASK,SEVERE_ERROR,23, getClassLoader());

  /**
   * Only users with the SERVER_LOCKDOWN privilege connected from a loopback address may cause the server to leave lockdown mode
   */
  public static final MessageDescriptor.Arg0 ERR_TASK_LEAVELOCKDOWN_NOT_LOOPBACK =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_TASK_LEAVELOCKDOWN_NOT_LOOPBACK_24",TASK,SEVERE_ERROR,24, getClassLoader());

  /**
   * You do not have sufficient privileges to terminate client connections
   */
  public static final MessageDescriptor.Arg0 ERR_TASK_DISCONNECT_NO_PRIVILEGE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_TASK_DISCONNECT_NO_PRIVILEGE_25",TASK,SEVERE_ERROR,25, getClassLoader());

  /**
   * Unable to decode value %s as an integer connection ID
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASK_DISCONNECT_INVALID_CONN_ID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASK_DISCONNECT_INVALID_CONN_ID_26",TASK,SEVERE_ERROR,26, getClassLoader());

  /**
   * Attribute %s must be provided to specify the connection ID for the client to disconnect
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASK_DISCONNECT_NO_CONN_ID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASK_DISCONNECT_NO_CONN_ID_27",TASK,SEVERE_ERROR,27, getClassLoader());

  /**
   * Unable to decode value %s as an indication of whether to notify the client before disconnecting it. The provided value should be either 'true' or 'false'
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASK_DISCONNECT_INVALID_NOTIFY_CLIENT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASK_DISCONNECT_INVALID_NOTIFY_CLIENT_28",TASK,SEVERE_ERROR,28, getClassLoader());

  /**
   * An administrator has terminated this client connection
   */
  public static final MessageDescriptor.Arg0 INFO_TASK_DISCONNECT_GENERIC_MESSAGE =
          new MessageDescriptor.Arg0(BASE,"INFO_TASK_DISCONNECT_GENERIC_MESSAGE_29",TASK,INFORMATION,29, getClassLoader());

  /**
   * There is no client connection with connection ID %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASK_DISCONNECT_NO_SUCH_CONNECTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASK_DISCONNECT_NO_SUCH_CONNECTION_30",TASK,SEVERE_ERROR,30, getClassLoader());

  /**
   * An administrator has terminated this client connection
   */
  public static final MessageDescriptor.Arg0 INFO_TASK_DISCONNECT_MESSAGE =
          new MessageDescriptor.Arg0(BASE,"INFO_TASK_DISCONNECT_MESSAGE_31",TASK,INFORMATION,31, getClassLoader());

  /**
   * Add Schema File
   */
  public static final MessageDescriptor.Arg0 INFO_TASK_ADD_SCHEMA_FILE_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_TASK_ADD_SCHEMA_FILE_NAME_32",TASK,INFORMATION,32, getClassLoader());

  /**
   * Backup
   */
  public static final MessageDescriptor.Arg0 INFO_TASK_BACKUP_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_TASK_BACKUP_NAME_33",TASK,INFORMATION,33, getClassLoader());

  /**
   * Disconnect Client
   */
  public static final MessageDescriptor.Arg0 INFO_TASK_DISCONNECT_CLIENT_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_TASK_DISCONNECT_CLIENT_NAME_34",TASK,INFORMATION,34, getClassLoader());

  /**
   * Lockdown
   */
  public static final MessageDescriptor.Arg0 INFO_TASK_ENTER_LOCKDOWN_MODE_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_TASK_ENTER_LOCKDOWN_MODE_NAME_35",TASK,INFORMATION,35, getClassLoader());

  /**
   * Export
   */
  public static final MessageDescriptor.Arg0 INFO_TASK_EXPORT_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_TASK_EXPORT_NAME_36",TASK,INFORMATION,36, getClassLoader());

  /**
   * Import
   */
  public static final MessageDescriptor.Arg0 INFO_TASK_IMPORT_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_TASK_IMPORT_NAME_37",TASK,INFORMATION,37, getClassLoader());

  /**
   * Initialize Backend
   */
  public static final MessageDescriptor.Arg0 INFO_TASK_INITIALIZE_TARGET_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_TASK_INITIALIZE_TARGET_NAME_38",TASK,INFORMATION,38, getClassLoader());

  /**
   * Initialize From Replica
   */
  public static final MessageDescriptor.Arg0 INFO_TASK_INITIALIZE_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_TASK_INITIALIZE_NAME_39",TASK,INFORMATION,39, getClassLoader());

  /**
   * Leave Lockdown
   */
  public static final MessageDescriptor.Arg0 INFO_TASK_LEAVE_LOCKDOWN_MODE_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_TASK_LEAVE_LOCKDOWN_MODE_NAME_40",TASK,INFORMATION,40, getClassLoader());

  /**
   * Rebuild Index
   */
  public static final MessageDescriptor.Arg0 INFO_TASK_REBUILD_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_TASK_REBUILD_NAME_41",TASK,INFORMATION,41, getClassLoader());

  /**
   * Restore
   */
  public static final MessageDescriptor.Arg0 INFO_TASK_RESTORE_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_TASK_RESTORE_NAME_42",TASK,INFORMATION,42, getClassLoader());

  /**
   * Set Generation ID
   */
  public static final MessageDescriptor.Arg0 INFO_TASK_SET_GENERATION_ID_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_TASK_SET_GENERATION_ID_NAME_43",TASK,INFORMATION,43, getClassLoader());

  /**
   * Shutdown
   */
  public static final MessageDescriptor.Arg0 INFO_TASK_SHUTDOWN_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_TASK_SHUTDOWN_NAME_44",TASK,INFORMATION,44, getClassLoader());

  /**
   * Unscheduled
   */
  public static final MessageDescriptor.Arg0 INFO_TASK_STATE_UNSCHEDULED =
          new MessageDescriptor.Arg0(BASE,"INFO_TASK_STATE_UNSCHEDULED_45",TASK,INFORMATION,45, getClassLoader());

  /**
   * Disabled
   */
  public static final MessageDescriptor.Arg0 INFO_TASK_STATE_DISABLED =
          new MessageDescriptor.Arg0(BASE,"INFO_TASK_STATE_DISABLED_46",TASK,INFORMATION,46, getClassLoader());

  /**
   * Waiting on start time
   */
  public static final MessageDescriptor.Arg0 INFO_TASK_STATE_WAITING_ON_START_TIME =
          new MessageDescriptor.Arg0(BASE,"INFO_TASK_STATE_WAITING_ON_START_TIME_47",TASK,INFORMATION,47, getClassLoader());

  /**
   * Waiting on dependency
   */
  public static final MessageDescriptor.Arg0 INFO_TASK_STATE_WAITING_ON_DEPENDENCY =
          new MessageDescriptor.Arg0(BASE,"INFO_TASK_STATE_WAITING_ON_DEPENDENCY_48",TASK,INFORMATION,48, getClassLoader());

  /**
   * Running
   */
  public static final MessageDescriptor.Arg0 INFO_TASK_STATE_RUNNING =
          new MessageDescriptor.Arg0(BASE,"INFO_TASK_STATE_RUNNING_49",TASK,INFORMATION,49, getClassLoader());

  /**
   * Completed successfully
   */
  public static final MessageDescriptor.Arg0 INFO_TASK_STATE_COMPLETED_SUCCESSFULLY =
          new MessageDescriptor.Arg0(BASE,"INFO_TASK_STATE_COMPLETED_SUCCESSFULLY_50",TASK,INFORMATION,50, getClassLoader());

  /**
   * Completed with errors
   */
  public static final MessageDescriptor.Arg0 INFO_TASK_STATE_COMPLETED_WITH_ERRORS =
          new MessageDescriptor.Arg0(BASE,"INFO_TASK_STATE_COMPLETED_WITH_ERRORS_51",TASK,INFORMATION,51, getClassLoader());

  /**
   * Stopped by shutdown
   */
  public static final MessageDescriptor.Arg0 INFO_TASK_STATE_STOPPED_BY_SHUTDOWN =
          new MessageDescriptor.Arg0(BASE,"INFO_TASK_STATE_STOPPED_BY_SHUTDOWN_52",TASK,INFORMATION,52, getClassLoader());

  /**
   * Stopped by error
   */
  public static final MessageDescriptor.Arg0 INFO_TASK_STATE_STOPPED_BY_ERROR =
          new MessageDescriptor.Arg0(BASE,"INFO_TASK_STATE_STOPPED_BY_ERROR_53",TASK,INFORMATION,53, getClassLoader());

  /**
   * Stopped by administrator
   */
  public static final MessageDescriptor.Arg0 INFO_TASK_STATE_STOPPED_BY_ADMINISTRATOR =
          new MessageDescriptor.Arg0(BASE,"INFO_TASK_STATE_STOPPED_BY_ADMINISTRATOR_54",TASK,INFORMATION,54, getClassLoader());

  /**
   * Canceled before starting
   */
  public static final MessageDescriptor.Arg0 INFO_TASK_STATE_CANCELED_BEFORE_STARTING =
          new MessageDescriptor.Arg0(BASE,"INFO_TASK_STATE_CANCELED_BEFORE_STARTING_55",TASK,INFORMATION,55, getClassLoader());

  /**
   * Backup All
   */
  public static final MessageDescriptor.Arg0 INFO_BACKUP_ARG_BACKUPALL =
          new MessageDescriptor.Arg0(BASE,"INFO_BACKUP_ARG_BACKUPALL_56",TASK,INFORMATION,56, getClassLoader());

  /**
   * Compress
   */
  public static final MessageDescriptor.Arg0 INFO_BACKUP_ARG_COMPRESS =
          new MessageDescriptor.Arg0(BASE,"INFO_BACKUP_ARG_COMPRESS_57",TASK,INFORMATION,57, getClassLoader());

  /**
   * Encrypt
   */
  public static final MessageDescriptor.Arg0 INFO_BACKUP_ARG_ENCRYPT =
          new MessageDescriptor.Arg0(BASE,"INFO_BACKUP_ARG_ENCRYPT_58",TASK,INFORMATION,58, getClassLoader());

  /**
   * Hash
   */
  public static final MessageDescriptor.Arg0 INFO_BACKUP_ARG_HASH =
          new MessageDescriptor.Arg0(BASE,"INFO_BACKUP_ARG_HASH_59",TASK,INFORMATION,59, getClassLoader());

  /**
   * Incremental
   */
  public static final MessageDescriptor.Arg0 INFO_BACKUP_ARG_INCREMENTAL =
          new MessageDescriptor.Arg0(BASE,"INFO_BACKUP_ARG_INCREMENTAL_60",TASK,INFORMATION,60, getClassLoader());

  /**
   * Sign Hash
   */
  public static final MessageDescriptor.Arg0 INFO_BACKUP_ARG_SIGN_HASH =
          new MessageDescriptor.Arg0(BASE,"INFO_BACKUP_ARG_SIGN_HASH_61",TASK,INFORMATION,61, getClassLoader());

  /**
   * Backend ID(s)
   */
  public static final MessageDescriptor.Arg0 INFO_BACKUP_ARG_BACKEND_IDS =
          new MessageDescriptor.Arg0(BASE,"INFO_BACKUP_ARG_BACKEND_IDS_62",TASK,INFORMATION,62, getClassLoader());

  /**
   * Backup Directory
   */
  public static final MessageDescriptor.Arg0 INFO_BACKUP_ARG_BACKUP_DIR =
          new MessageDescriptor.Arg0(BASE,"INFO_BACKUP_ARG_BACKUP_DIR_63",TASK,INFORMATION,63, getClassLoader());

  /**
   * Backup ID
   */
  public static final MessageDescriptor.Arg0 INFO_BACKUP_ARG_BACKUP_ID =
          new MessageDescriptor.Arg0(BASE,"INFO_BACKUP_ARG_BACKUP_ID_64",TASK,INFORMATION,64, getClassLoader());

  /**
   * Incremental Base ID
   */
  public static final MessageDescriptor.Arg0 INFO_BACKUP_ARG_INC_BASE_ID =
          new MessageDescriptor.Arg0(BASE,"INFO_BACKUP_ARG_INC_BASE_ID_65",TASK,INFORMATION,65, getClassLoader());

  /**
   * LDIF File
   */
  public static final MessageDescriptor.Arg0 INFO_EXPORT_ARG_LDIF_FILE =
          new MessageDescriptor.Arg0(BASE,"INFO_EXPORT_ARG_LDIF_FILE_66",TASK,INFORMATION,66, getClassLoader());

  /**
   * Backend ID
   */
  public static final MessageDescriptor.Arg0 INFO_EXPORT_ARG_BACKEND_ID =
          new MessageDescriptor.Arg0(BASE,"INFO_EXPORT_ARG_BACKEND_ID_67",TASK,INFORMATION,67, getClassLoader());

  /**
   * Append To LDIF
   */
  public static final MessageDescriptor.Arg0 INFO_EXPORT_ARG_APPEND_TO_LDIF =
          new MessageDescriptor.Arg0(BASE,"INFO_EXPORT_ARG_APPEND_TO_LDIF_68",TASK,INFORMATION,68, getClassLoader());

  /**
   * Compress LDIF
   */
  public static final MessageDescriptor.Arg0 INFO_EXPORT_ARG_COMPRESS_LDIF =
          new MessageDescriptor.Arg0(BASE,"INFO_EXPORT_ARG_COMPRESS_LDIF_69",TASK,INFORMATION,69, getClassLoader());

  /**
   * Encrypt LDIF
   */
  public static final MessageDescriptor.Arg0 INFO_EXPORT_ARG_ENCRYPT_LDIF =
          new MessageDescriptor.Arg0(BASE,"INFO_EXPORT_ARG_ENCRYPT_LDIF_70",TASK,INFORMATION,70, getClassLoader());

  /**
   * Sign Hash
   */
  public static final MessageDescriptor.Arg0 INFO_EXPORT_ARG_SIGN_HASH =
          new MessageDescriptor.Arg0(BASE,"INFO_EXPORT_ARG_SIGN_HASH_71",TASK,INFORMATION,71, getClassLoader());

  /**
   * Include Attribute
   */
  public static final MessageDescriptor.Arg0 INFO_EXPORT_ARG_INCL_ATTR =
          new MessageDescriptor.Arg0(BASE,"INFO_EXPORT_ARG_INCL_ATTR_72",TASK,INFORMATION,72, getClassLoader());

  /**
   * Exclude Attribute
   */
  public static final MessageDescriptor.Arg0 INFO_EXPORT_ARG_EXCL_ATTR =
          new MessageDescriptor.Arg0(BASE,"INFO_EXPORT_ARG_EXCL_ATTR_73",TASK,INFORMATION,73, getClassLoader());

  /**
   * Include Filter
   */
  public static final MessageDescriptor.Arg0 INFO_EXPORT_ARG_INCL_FILTER =
          new MessageDescriptor.Arg0(BASE,"INFO_EXPORT_ARG_INCL_FILTER_74",TASK,INFORMATION,74, getClassLoader());

  /**
   * Exclude Filter
   */
  public static final MessageDescriptor.Arg0 INFO_EXPORT_ARG_EXCL_FILTER =
          new MessageDescriptor.Arg0(BASE,"INFO_EXPORT_ARG_EXCL_FILTER_75",TASK,INFORMATION,75, getClassLoader());

  /**
   * Include Branch
   */
  public static final MessageDescriptor.Arg0 INFO_EXPORT_ARG_INCL_BRANCH =
          new MessageDescriptor.Arg0(BASE,"INFO_EXPORT_ARG_INCL_BRANCH_76",TASK,INFORMATION,76, getClassLoader());

  /**
   * Exclude Branch
   */
  public static final MessageDescriptor.Arg0 INFO_EXPORT_ARG_EXCL_BRANCH =
          new MessageDescriptor.Arg0(BASE,"INFO_EXPORT_ARG_EXCL_BRANCH_77",TASK,INFORMATION,77, getClassLoader());

  /**
   * Wrap Column
   */
  public static final MessageDescriptor.Arg0 INFO_EXPORT_ARG_WRAP_COLUMN =
          new MessageDescriptor.Arg0(BASE,"INFO_EXPORT_ARG_WRAP_COLUMN_78",TASK,INFORMATION,78, getClassLoader());

  /**
   * Backup Directory
   */
  public static final MessageDescriptor.Arg0 INFO_RESTORE_ARG_BACKUP_DIR =
          new MessageDescriptor.Arg0(BASE,"INFO_RESTORE_ARG_BACKUP_DIR_79",TASK,INFORMATION,79, getClassLoader());

  /**
   * Backup ID
   */
  public static final MessageDescriptor.Arg0 INFO_RESTORE_ARG_BACKUP_ID =
          new MessageDescriptor.Arg0(BASE,"INFO_RESTORE_ARG_BACKUP_ID_80",TASK,INFORMATION,80, getClassLoader());

  /**
   * Verify Only
   */
  public static final MessageDescriptor.Arg0 INFO_RESTORE_ARG_VERIFY_ONLY =
          new MessageDescriptor.Arg0(BASE,"INFO_RESTORE_ARG_VERIFY_ONLY_81",TASK,INFORMATION,81, getClassLoader());

  /**
   * LDIF File
   */
  public static final MessageDescriptor.Arg0 INFO_IMPORT_ARG_LDIF_FILE =
          new MessageDescriptor.Arg0(BASE,"INFO_IMPORT_ARG_LDIF_FILE_82",TASK,INFORMATION,82, getClassLoader());

  /**
   * Append
   */
  public static final MessageDescriptor.Arg0 INFO_IMPORT_ARG_APPEND =
          new MessageDescriptor.Arg0(BASE,"INFO_IMPORT_ARG_APPEND_83",TASK,INFORMATION,83, getClassLoader());

  /**
   * Replace Existing
   */
  public static final MessageDescriptor.Arg0 INFO_IMPORT_ARG_REPLACE_EXISTING =
          new MessageDescriptor.Arg0(BASE,"INFO_IMPORT_ARG_REPLACE_EXISTING_84",TASK,INFORMATION,84, getClassLoader());

  /**
   * Backend ID
   */
  public static final MessageDescriptor.Arg0 INFO_IMPORT_ARG_BACKEND_ID =
          new MessageDescriptor.Arg0(BASE,"INFO_IMPORT_ARG_BACKEND_ID_85",TASK,INFORMATION,85, getClassLoader());

  /**
   * Include Attribute
   */
  public static final MessageDescriptor.Arg0 INFO_IMPORT_ARG_INCL_ATTR =
          new MessageDescriptor.Arg0(BASE,"INFO_IMPORT_ARG_INCL_ATTR_86",TASK,INFORMATION,86, getClassLoader());

  /**
   * Exclude Attribute
   */
  public static final MessageDescriptor.Arg0 INFO_IMPORT_ARG_EXCL_ATTR =
          new MessageDescriptor.Arg0(BASE,"INFO_IMPORT_ARG_EXCL_ATTR_87",TASK,INFORMATION,87, getClassLoader());

  /**
   * Include Filter
   */
  public static final MessageDescriptor.Arg0 INFO_IMPORT_ARG_INCL_FILTER =
          new MessageDescriptor.Arg0(BASE,"INFO_IMPORT_ARG_INCL_FILTER_88",TASK,INFORMATION,88, getClassLoader());

  /**
   * Exclude Filter
   */
  public static final MessageDescriptor.Arg0 INFO_IMPORT_ARG_EXCL_FILTER =
          new MessageDescriptor.Arg0(BASE,"INFO_IMPORT_ARG_EXCL_FILTER_89",TASK,INFORMATION,89, getClassLoader());

  /**
   * Include Branch
   */
  public static final MessageDescriptor.Arg0 INFO_IMPORT_ARG_INCL_BRANCH =
          new MessageDescriptor.Arg0(BASE,"INFO_IMPORT_ARG_INCL_BRANCH_90",TASK,INFORMATION,90, getClassLoader());

  /**
   * Exclude Branch
   */
  public static final MessageDescriptor.Arg0 INFO_IMPORT_ARG_EXCL_BRANCH =
          new MessageDescriptor.Arg0(BASE,"INFO_IMPORT_ARG_EXCL_BRANCH_91",TASK,INFORMATION,91, getClassLoader());

  /**
   * Reject File
   */
  public static final MessageDescriptor.Arg0 INFO_IMPORT_ARG_REJECT_FILE =
          new MessageDescriptor.Arg0(BASE,"INFO_IMPORT_ARG_REJECT_FILE_92",TASK,INFORMATION,92, getClassLoader());

  /**
   * Skip File
   */
  public static final MessageDescriptor.Arg0 INFO_IMPORT_ARG_SKIP_FILE =
          new MessageDescriptor.Arg0(BASE,"INFO_IMPORT_ARG_SKIP_FILE_93",TASK,INFORMATION,93, getClassLoader());

  /**
   * Overwrite
   */
  public static final MessageDescriptor.Arg0 INFO_IMPORT_ARG_OVERWRITE =
          new MessageDescriptor.Arg0(BASE,"INFO_IMPORT_ARG_OVERWRITE_94",TASK,INFORMATION,94, getClassLoader());

  /**
   * Skip Schema Validation
   */
  public static final MessageDescriptor.Arg0 INFO_IMPORT_ARG_SKIP_SCHEMA_VALIDATION =
          new MessageDescriptor.Arg0(BASE,"INFO_IMPORT_ARG_SKIP_SCHEMA_VALIDATION_95",TASK,INFORMATION,95, getClassLoader());

  /**
   * Is Compressed
   */
  public static final MessageDescriptor.Arg0 INFO_IMPORT_ARG_IS_COMPRESSED =
          new MessageDescriptor.Arg0(BASE,"INFO_IMPORT_ARG_IS_COMPRESSED_96",TASK,INFORMATION,96, getClassLoader());

  /**
   * Is Encrypted
   */
  public static final MessageDescriptor.Arg0 INFO_IMPORT_ARG_IS_ENCRYPTED =
          new MessageDescriptor.Arg0(BASE,"INFO_IMPORT_ARG_IS_ENCRYPTED_97",TASK,INFORMATION,97, getClassLoader());

  /**
   * Clear Backend
   */
  public static final MessageDescriptor.Arg0 INFO_IMPORT_ARG_CLEAR_BACKEND =
          new MessageDescriptor.Arg0(BASE,"INFO_IMPORT_ARG_CLEAR_BACKEND_98",TASK,INFORMATION,98, getClassLoader());

  /**
   * Process
   */
  public static final MessageDescriptor.Arg0 INFO_FAILED_DEPENDENCY_ACTION_PROCESS =
          new MessageDescriptor.Arg0(BASE,"INFO_FAILED_DEPENDENCY_ACTION_PROCESS_99",TASK,INFORMATION,99, getClassLoader());

  /**
   * Cancel
   */
  public static final MessageDescriptor.Arg0 INFO_FAILED_DEPENDENCY_ACTION_CANCEL =
          new MessageDescriptor.Arg0(BASE,"INFO_FAILED_DEPENDENCY_ACTION_CANCEL_100",TASK,INFORMATION,100, getClassLoader());

  /**
   * Disable
   */
  public static final MessageDescriptor.Arg0 INFO_FAILED_DEPENDENCY_ACTION_DISABLE =
          new MessageDescriptor.Arg0(BASE,"INFO_FAILED_DEPENDENCY_ACTION_DISABLE_101",TASK,INFORMATION,101, getClassLoader());

  /**
   * Task was stopped by an administrator:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_TASK_STOPPED_BY_ADMIN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_TASK_STOPPED_BY_ADMIN_102",TASK,INFORMATION,102, getClassLoader());

  /**
   * Invalid generation ID provided with the task
   */
  public static final MessageDescriptor.Arg0 ERR_TASK_INITIALIZE_INVALID_GENERATION_ID =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_TASK_INITIALIZE_INVALID_GENERATION_ID_103",TASK,SEVERE_ERROR,103, getClassLoader());

  /**
   * Template File
   */
  public static final MessageDescriptor.Arg0 INFO_IMPORT_ARG_TEMPLATE_FILE =
          new MessageDescriptor.Arg0(BASE,"INFO_IMPORT_ARG_TEMPLATE_FILE_104",TASK,INFORMATION,104, getClassLoader());

  /**
   * Random Seed
   */
  public static final MessageDescriptor.Arg0 INFO_IMPORT_ARG_RANDOM_SEED =
          new MessageDescriptor.Arg0(BASE,"INFO_IMPORT_ARG_RANDOM_SEED_105",TASK,INFORMATION,105, getClassLoader());

  /**
   * Unable to connect to the server at %s on port %s. Check this port is an administration port
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TASK_LDAP_FAILED_TO_CONNECT_WRONG_PORT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASK_LDAP_FAILED_TO_CONNECT_WRONG_PORT_106",TASK,SEVERE_ERROR,106, getClassLoader());

  /**
   * Recurring
   */
  public static final MessageDescriptor.Arg0 INFO_TASK_STATE_RECURRING =
          new MessageDescriptor.Arg0(BASE,"INFO_TASK_STATE_RECURRING_107",TASK,INFORMATION,107, getClassLoader());

  /**
   * Index option cannot be specified when the rebuildAll option is used
   */
  public static final MessageDescriptor.Arg0 ERR_TASK_INDEXREBUILD_ALL_ERROR =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_TASK_INDEXREBUILD_ALL_ERROR_108",TASK,SEVERE_ERROR,108, getClassLoader());

  /**
   * Purge conflicts historical
   */
  public static final MessageDescriptor.Arg0 INFO_TASK_PURGE_CONFLICTS_HIST_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_TASK_PURGE_CONFLICTS_HIST_NAME_109",TASK,INFORMATION,109, getClassLoader());

  /**
   * Attribute %s has an invalid value. Reason: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TASK_INVALID_ATTRIBUTE_VALUE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASK_INVALID_ATTRIBUTE_VALUE_110",TASK,SEVERE_ERROR,110, getClassLoader());


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
            Class<?> c = Class.forName("org.opends.messages.TaskMessages");

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
      cl = TaskMessages.class.getClassLoader();
    }
    return cl;
  }
}
