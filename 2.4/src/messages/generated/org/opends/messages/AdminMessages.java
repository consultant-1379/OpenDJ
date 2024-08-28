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
public final class AdminMessages {

  /** Base property for resource bundle containing messages */
  private static final String BASE = "messages/admin";

  private static ClassLoader webstartClassLoader;

  // Prevent instantiation.
  private AdminMessages() {
    // Do nothing.
  }

  /**
   * An error occurred while trying to retrieve relation configuration entry %s: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ADMIN_CANNOT_GET_LISTENER_BASE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_ADMIN_CANNOT_GET_LISTENER_BASE_1",ADMIN,SEVERE_ERROR,1, getClassLoader());

  /**
   * The relation entry %s does not appear to exist in the Directory Server configuration. This is a required entry
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ADMIN_LISTENER_BASE_DOES_NOT_EXIST =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_ADMIN_LISTENER_BASE_DOES_NOT_EXIST_2",ADMIN,SEVERE_ERROR,2, getClassLoader());

  /**
   * An error occurred while trying to retrieve the managed object configuration entry %s: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ADMIN_CANNOT_GET_MANAGED_OBJECT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_ADMIN_CANNOT_GET_MANAGED_OBJECT_3",ADMIN,SEVERE_ERROR,3, getClassLoader());

  /**
   * The managed object configuration entry %s does not appear to exist in the Directory Server configuration. This is a required entry
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ADMIN_MANAGED_OBJECT_DOES_NOT_EXIST =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_ADMIN_MANAGED_OBJECT_DOES_NOT_EXIST_4",ADMIN,SEVERE_ERROR,4, getClassLoader());

  /**
   * An error occurred while trying to decode the managed object configuration entry %s: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ADMIN_MANAGED_OBJECT_DECODING_PROBLEM =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_ADMIN_MANAGED_OBJECT_DECODING_PROBLEM_5",ADMIN,SEVERE_ERROR,5, getClassLoader());

  /**
   * The Directory Server was unable to load class %s and use it to create a component instance as defined in configuration entry %s.  The error that occurred was:  %s.  This component will be disabled
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_ADMIN_CANNOT_INSTANTIATE_CLASS =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_ADMIN_CANNOT_INSTANTIATE_CLASS_6",ADMIN,SEVERE_ERROR,6, getClassLoader());

  /**
   * An error occurred while trying to initialize a component instance loaded from class %s with the information in configuration entry %s:  %s.  This component will be disabled
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_ADMIN_CANNOT_INITIALIZE_COMPONENT =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_ADMIN_CANNOT_INITIALIZE_COMPONENT_7",ADMIN,SEVERE_ERROR,7, getClassLoader());

  /**
   * The Directory Server component configured in entry %s has been disabled
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ADMIN_COMPONENT_DISABLED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_WARN_ADMIN_COMPONENT_DISABLED_8",ADMIN,MILD_WARNING,8, getClassLoader());

  /**
   * The Directory Server jar file %s in directory %s cannot be loaded because an unexpected error occurred while trying to open the file for reading:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_ADMIN_CANNOT_OPEN_JAR_FILE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_ADMIN_CANNOT_OPEN_JAR_FILE_9",ADMIN,SEVERE_ERROR,9, getClassLoader());

  /**
   * A core configuration definition class could not be loaded from the core manifest file %s because an unexpected error occurred while trying to initialize it:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ADMIN_CANNOT_LOAD_CLASS_FROM_CORE_MANIFEST =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"FATAL_ERR_ADMIN_CANNOT_LOAD_CLASS_FROM_CORE_MANIFEST_10",ADMIN,FATAL_ERROR,10, getClassLoader());

  /**
   * A configuration definition class could not be loaded from the extension manifest file %s in extensions %s because an unexpected error occurred while trying to initialize it:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_ADMIN_CANNOT_LOAD_CLASS_FROM_EXTENSION_MANIFEST =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_ADMIN_CANNOT_LOAD_CLASS_FROM_EXTENSION_MANIFEST_11",ADMIN,SEVERE_ERROR,11, getClassLoader());

  /**
   * The extensions directory %s does not exist, therefore no extensions will be loaded
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ADMIN_NO_EXTENSIONS_DIR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ADMIN_NO_EXTENSIONS_DIR_12",ADMIN,MILD_ERROR,12, getClassLoader());

  /**
   * Unable to read the Directory Server extensions because the extensions directory %s exists but is not a directory
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ADMIN_EXTENSIONS_DIR_NOT_DIRECTORY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_ADMIN_EXTENSIONS_DIR_NOT_DIRECTORY_13",ADMIN,SEVERE_ERROR,13, getClassLoader());

  /**
   * Unable to read the Directory Server extensions from directory %s because an unexpected error occurred while trying to list the files in that directory:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ADMIN_EXTENSIONS_CANNOT_LIST_FILES =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_ADMIN_EXTENSIONS_CANNOT_LIST_FILES_14",ADMIN,SEVERE_ERROR,14, getClassLoader());

  /**
   * The core administration manifest file %s cannot be located
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ADMIN_CANNOT_FIND_CORE_MANIFEST =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"FATAL_ERR_ADMIN_CANNOT_FIND_CORE_MANIFEST_15",ADMIN,FATAL_ERROR,15, getClassLoader());

  /**
   * The core administration manifest file %s cannot be loaded because an unexpected error occurred while trying to read it:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ADMIN_CANNOT_READ_CORE_MANIFEST =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"FATAL_ERR_ADMIN_CANNOT_READ_CORE_MANIFEST_16",ADMIN,FATAL_ERROR,16, getClassLoader());

  /**
   * The administration manifest file %s associated with the extension %s cannot be loaded because an unexpected error occurred while trying to read it:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_ADMIN_CANNOT_READ_EXTENSION_MANIFEST =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_ADMIN_CANNOT_READ_EXTENSION_MANIFEST_17",ADMIN,SEVERE_ERROR,17, getClassLoader());

  /**
   * This utility can be used to perform operations in the Directory Server administration framework
   */
  public static final MessageDescriptor.Arg0 INFO_ADMIN_TOOL_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_ADMIN_TOOL_DESCRIPTION_18",ADMIN,INFORMATION,18, getClassLoader());

  /**
   * Create a new server group
   */
  public static final MessageDescriptor.Arg0 INFO_ADMIN_SUBCMD_CREATE_GROUP_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_ADMIN_SUBCMD_CREATE_GROUP_DESCRIPTION_19",ADMIN,INFORMATION,19, getClassLoader());

  /**
   * The server group description. If not specified, the description will be empty
   */
  public static final MessageDescriptor.Arg0 INFO_ADMIN_ARG_DESCRIPTION_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_ADMIN_ARG_DESCRIPTION_DESCRIPTION_20",ADMIN,INFORMATION,20, getClassLoader());

  /**
   * Modify a server group's properties
   */
  public static final MessageDescriptor.Arg0 INFO_ADMIN_SUBCMD_MODIFY_GROUP_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_ADMIN_SUBCMD_MODIFY_GROUP_DESCRIPTION_21",ADMIN,INFORMATION,21, getClassLoader());

  /**
   * If specified, the new description
   */
  public static final MessageDescriptor.Arg0 INFO_ADMIN_ARG_NEW_DESCRIPTION_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_ADMIN_ARG_NEW_DESCRIPTION_DESCRIPTION_22",ADMIN,INFORMATION,22, getClassLoader());

  /**
   * If specified, the new server group's identifier
   */
  public static final MessageDescriptor.Arg0 INFO_ADMIN_ARG_NEW_GROUPNAME_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_ADMIN_ARG_NEW_GROUPNAME_DESCRIPTION_23",ADMIN,INFORMATION,23, getClassLoader());

  /**
   * Delete an existing server group
   */
  public static final MessageDescriptor.Arg0 INFO_ADMIN_SUBCMD_DELETE_GROUP_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_ADMIN_SUBCMD_DELETE_GROUP_DESCRIPTION_24",ADMIN,INFORMATION,24, getClassLoader());

  /**
   * List server groups that have been defined
   */
  public static final MessageDescriptor.Arg0 INFO_ADMIN_SUBCMD_LIST_GROUPS_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_ADMIN_SUBCMD_LIST_GROUPS_DESCRIPTION_25",ADMIN,INFORMATION,25, getClassLoader());

  /**
   * Add a server to a server group
   */
  public static final MessageDescriptor.Arg0 INFO_ADMIN_SUBCMD_ADD_TO_GROUP_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_ADMIN_SUBCMD_ADD_TO_GROUP_DESCRIPTION_26",ADMIN,INFORMATION,26, getClassLoader());

  /**
   * The server to add. This is a required argument
   */
  public static final MessageDescriptor.Arg0 INFO_ADMIN_ARG_ADD_MEMBERNAME_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_ADMIN_ARG_ADD_MEMBERNAME_DESCRIPTION_27",ADMIN,INFORMATION,27, getClassLoader());

  /**
   * Remove a server from a server group
   */
  public static final MessageDescriptor.Arg0 INFO_ADMIN_SUBCMD_REMOVE_FROM_GROUP_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_ADMIN_SUBCMD_REMOVE_FROM_GROUP_DESCRIPTION_28",ADMIN,INFORMATION,28, getClassLoader());

  /**
   * The server to remove. This is a required argument
   */
  public static final MessageDescriptor.Arg0 INFO_ADMIN_ARG_REMOVE_MEMBERNAME_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_ADMIN_ARG_REMOVE_MEMBERNAME_DESCRIPTION_29",ADMIN,INFORMATION,29, getClassLoader());

  /**
   * List servers of the specified server group
   */
  public static final MessageDescriptor.Arg0 INFO_ADMIN_SUBCMD_LIST_MEMBERS_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_ADMIN_SUBCMD_LIST_MEMBERS_DESCRIPTION_30",ADMIN,INFORMATION,30, getClassLoader());

  /**
   * List server groups in which the specified server is a member
   */
  public static final MessageDescriptor.Arg0 INFO_ADMIN_SUBCMD_LIST_MEMBERSHIP_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_ADMIN_SUBCMD_LIST_MEMBERSHIP_DESCRIPTION_31",ADMIN,INFORMATION,31, getClassLoader());

  /**
   * Could not connect to %s. Check that the server is running and that the provided credentials are valid
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ADMIN_CANNOT_CONNECT_TO_ADS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"FATAL_ERR_ADMIN_CANNOT_CONNECT_TO_ADS_32",ADMIN,FATAL_ERROR,32, getClassLoader());

  /**
   * Create a new ADS DN
   */
  public static final MessageDescriptor.Arg0 INFO_ADMIN_SUBCMD_CREATE_ADS_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_ADMIN_SUBCMD_CREATE_ADS_DESCRIPTION_33",ADMIN,INFORMATION,33, getClassLoader());

  /**
   * Delete an existing ADS DN
   */
  public static final MessageDescriptor.Arg0 INFO_ADMIN_SUBCMD_DELETE_ADS_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_ADMIN_SUBCMD_DELETE_ADS_DESCRIPTION_34",ADMIN,INFORMATION,34, getClassLoader());

  /**
   * The host name is missing
   */
  public static final MessageDescriptor.Arg0 ERR_ADMIN_MISSING_HOSTNAME =
          new MessageDescriptor.Arg0(BASE,"FATAL_ERR_ADMIN_MISSING_HOSTNAME_35",ADMIN,FATAL_ERROR,35, getClassLoader());

  /**
   * The host name is not valid
   */
  public static final MessageDescriptor.Arg0 ERR_ADMIN_NOVALID_HOSTNAME =
          new MessageDescriptor.Arg0(BASE,"FATAL_ERR_ADMIN_NOVALID_HOSTNAME_36",ADMIN,FATAL_ERROR,36, getClassLoader());

  /**
   * The installation path is missing
   */
  public static final MessageDescriptor.Arg0 ERR_ADMIN_MISSING_IPATH =
          new MessageDescriptor.Arg0(BASE,"FATAL_ERR_ADMIN_MISSING_IPATH_37",ADMIN,FATAL_ERROR,37, getClassLoader());

  /**
   * The installation path is not valid
   */
  public static final MessageDescriptor.Arg0 ERR_ADMIN_NOVALID_IPATH =
          new MessageDescriptor.Arg0(BASE,"FATAL_ERR_ADMIN_NOVALID_IPATH_38",ADMIN,FATAL_ERROR,38, getClassLoader());

  /**
   * An access permission error occurs
   */
  public static final MessageDescriptor.Arg0 ERR_ADMIN_ACCESS_PERMISSION =
          new MessageDescriptor.Arg0(BASE,"FATAL_ERR_ADMIN_ACCESS_PERMISSION_39",ADMIN,FATAL_ERROR,39, getClassLoader());

  /**
   * The entity is already registered
   */
  public static final MessageDescriptor.Arg0 ERR_ADMIN_ALREADY_REGISTERED =
          new MessageDescriptor.Arg0(BASE,"FATAL_ERR_ADMIN_ALREADY_REGISTERED_40",ADMIN,FATAL_ERROR,40, getClassLoader());

  /**
   * The administrative repository is broken
   */
  public static final MessageDescriptor.Arg0 ERR_ADMIN_BROKEN_INSTALL =
          new MessageDescriptor.Arg0(BASE,"FATAL_ERR_ADMIN_BROKEN_INSTALL_41",ADMIN,FATAL_ERROR,41, getClassLoader());

  /**
   * The entity is not yet registered
   */
  public static final MessageDescriptor.Arg0 ERR_ADMIN_NOT_YET_REGISTERED =
          new MessageDescriptor.Arg0(BASE,"FATAL_ERR_ADMIN_NOT_YET_REGISTERED_42",ADMIN,FATAL_ERROR,42, getClassLoader());

  /**
   * The port is missing
   */
  public static final MessageDescriptor.Arg0 ERR_ADMIN_MISSING_PORT =
          new MessageDescriptor.Arg0(BASE,"FATAL_ERR_ADMIN_MISSING_PORT_43",ADMIN,FATAL_ERROR,43, getClassLoader());

  /**
   * The port is not valid
   */
  public static final MessageDescriptor.Arg0 ERR_ADMIN_NOVALID_PORT =
          new MessageDescriptor.Arg0(BASE,"FATAL_ERR_ADMIN_NOVALID_PORT_44",ADMIN,FATAL_ERROR,44, getClassLoader());

  /**
   * The name is missing
   */
  public static final MessageDescriptor.Arg0 ERR_ADMIN_MISSING_NAME =
          new MessageDescriptor.Arg0(BASE,"FATAL_ERR_ADMIN_MISSING_NAME_45",ADMIN,FATAL_ERROR,45, getClassLoader());

  /**
   * The administration UID is missing
   */
  public static final MessageDescriptor.Arg0 ERR_ADMIN_MISSING_ADMIN_UID =
          new MessageDescriptor.Arg0(BASE,"FATAL_ERR_ADMIN_MISSING_ADMIN_UID_46",ADMIN,FATAL_ERROR,46, getClassLoader());

  /**
   * The administrator password is missing
   */
  public static final MessageDescriptor.Arg0 ERR_ADMIN_MISSING_ADMIN_PASSWORD =
          new MessageDescriptor.Arg0(BASE,"FATAL_ERR_ADMIN_MISSING_ADMIN_PASSWORD_47",ADMIN,FATAL_ERROR,47, getClassLoader());

  /**
   * An unexpected error occurs
   */
  public static final MessageDescriptor.Arg0 ERR_ADMIN_ERROR_UNEXPECTED =
          new MessageDescriptor.Arg0(BASE,"FATAL_ERR_ADMIN_ERROR_UNEXPECTED_48",ADMIN,FATAL_ERROR,48, getClassLoader());

  /**
   * [error]
   */
  public static final MessageDescriptor.Arg0 INFO_ADMIN_ERROR =
          new MessageDescriptor.Arg0(BASE,"INFO_ADMIN_ERROR_49",ADMIN,INFORMATION,49, getClassLoader());

  /**
   * The operation has been successfully completed
   */
  public static final MessageDescriptor.Arg0 INFO_ADMIN_SUCCESSFUL =
          new MessageDescriptor.Arg0(BASE,"INFO_ADMIN_SUCCESSFUL_50",ADMIN,INFORMATION,50, getClassLoader());

  /**
   * The operation has been successfully completed, but no action was required
   */
  public static final MessageDescriptor.Arg0 INFO_ADMIN_SUCCESSFUL_NOP =
          new MessageDescriptor.Arg0(BASE,"INFO_ADMIN_SUCCESSFUL_NOP_51",ADMIN,INFORMATION,51, getClassLoader());

  /**
   * 
   */
  public static final MessageDescriptor.Arg0 ERR_ADMIN_NO_MESSAGE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_ADMIN_NO_MESSAGE_52",ADMIN,SEVERE_ERROR,52, getClassLoader());

  /**
   * The new group's identifier. This is a required argument
   */
  public static final MessageDescriptor.Arg0 INFO_ADMIN_ARG_CREATE_GROUP_GROUPNAME_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_ADMIN_ARG_CREATE_GROUP_GROUPNAME_DESCRIPTION_53",ADMIN,INFORMATION,53, getClassLoader());

  /**
   * The group's identifier. This is a required argument
   */
  public static final MessageDescriptor.Arg0 INFO_ADMIN_ARG_GROUPNAME_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_ADMIN_ARG_GROUPNAME_DESCRIPTION_54",ADMIN,INFORMATION,54, getClassLoader());

  /**
   * The member's identifier. This is a required argument
   */
  public static final MessageDescriptor.Arg0 INFO_ADMIN_ARG_MEMBERNAME_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_ADMIN_ARG_MEMBERNAME_DESCRIPTION_55",ADMIN,INFORMATION,55, getClassLoader());

  /**
   * The name of the backend in which the admin data will be stored
   */
  public static final MessageDescriptor.Arg0 INFO_ADMIN_ARG_BACKENDNAME_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_ADMIN_ARG_BACKENDNAME_DESCRIPTION_56",ADMIN,INFORMATION,56, getClassLoader());

  /**
   * Unable to register an add/delete listener against the entry "%s" because it does not exist in the configuration
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ADMIN_UNABLE_TO_REGISTER_LISTENER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_ADMIN_UNABLE_TO_REGISTER_LISTENER_57",ADMIN,SEVERE_ERROR,57, getClassLoader());

  /**
   * Register a server into the administrative domain
   */
  public static final MessageDescriptor.Arg0 INFO_ADMIN_SUBCMD_REGISTER_SERVER_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_ADMIN_SUBCMD_REGISTER_SERVER_DESCRIPTION_58",ADMIN,INFORMATION,58, getClassLoader());

  /**
   * Unregister a server from the administrative domain
   */
  public static final MessageDescriptor.Arg0 INFO_ADMIN_SUBCMD_UNREGISTER_SERVER_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_ADMIN_SUBCMD_UNREGISTER_SERVER_DESCRIPTION_59",ADMIN,INFORMATION,59, getClassLoader());

  /**
   * The server's identifier. This is a required argument
   */
  public static final MessageDescriptor.Arg0 INFO_ADMIN_ARG_SERVERNAME_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_ADMIN_ARG_SERVERNAME_DESCRIPTION_60",ADMIN,INFORMATION,60, getClassLoader());

  /**
   * Describes server properties
   */
  public static final MessageDescriptor.Arg0 INFO_ADMIN_SUBCMD_LIST_SERVER_PROPS_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_ADMIN_SUBCMD_LIST_SERVER_PROPS_DESCRIPTION_61",ADMIN,INFORMATION,61, getClassLoader());

  /**
   * List servers that have been defined
   */
  public static final MessageDescriptor.Arg0 INFO_ADMIN_SUBCMD_LIST_SERVERS_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_ADMIN_SUBCMD_LIST_SERVERS_DESCRIPTION_62",ADMIN,INFORMATION,62, getClassLoader());

  /**
   * Shows server properties
   */
  public static final MessageDescriptor.Arg0 INFO_ADMIN_SUBCMD_GET_SERVER_PROPERTIES_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_ADMIN_SUBCMD_GET_SERVER_PROPERTIES_DESCRIPTION_63",ADMIN,INFORMATION,63, getClassLoader());

  /**
   * Modifies server properties
   */
  public static final MessageDescriptor.Arg0 INFO_ADMIN_SUBCMD_SET_SERVER_PROPERTIES_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_ADMIN_SUBCMD_SET_SERVER_PROPERTIES_DESCRIPTION_64",ADMIN,INFORMATION,64, getClassLoader());

  /**
   * The registered server's unique identifier. This is a required argument
   */
  public static final MessageDescriptor.Arg0 INFO_ADMIN_ARG_SERVERID_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_ADMIN_ARG_SERVERID_DESCRIPTION_65",ADMIN,INFORMATION,65, getClassLoader());

  /**
   * The provided serverId is not registered
   */
  public static final MessageDescriptor.Arg0 ERR_ADMIN_SERVER_NOT_REGISTERED =
          new MessageDescriptor.Arg0(BASE,"FATAL_ERR_ADMIN_SERVER_NOT_REGISTERED_66",ADMIN,FATAL_ERROR,66, getClassLoader());

  /**
   * Creates a new administrator
   */
  public static final MessageDescriptor.Arg0 INFO_ADMIN_SUBCMD_CREATE_ADMIN_USER_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_ADMIN_SUBCMD_CREATE_ADMIN_USER_DESCRIPTION_67",ADMIN,INFORMATION,67, getClassLoader());

  /**
   * Deletes an existing administrator
   */
  public static final MessageDescriptor.Arg0 INFO_ADMIN_SUBCMD_DELETE_ADMIN_USER_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_ADMIN_SUBCMD_DELETE_ADMIN_USER_DESCRIPTION_68",ADMIN,INFORMATION,68, getClassLoader());

  /**
   * Lists administrators that have been defined
   */
  public static final MessageDescriptor.Arg0 INFO_ADMIN_SUBCMD_LIST_ADMIN_USER_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_ADMIN_SUBCMD_LIST_ADMIN_USER_DESCRIPTION_69",ADMIN,INFORMATION,69, getClassLoader());

  /**
   * Shows administrator's properties
   */
  public static final MessageDescriptor.Arg0 INFO_ADMIN_SUBCMD_GET_ADMIN_USER_PROPERTIES_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_ADMIN_SUBCMD_GET_ADMIN_USER_PROPERTIES_DESCRIPTION_70",ADMIN,INFORMATION,70, getClassLoader());

  /**
   * Modifies administrator's properties
   */
  public static final MessageDescriptor.Arg0 INFO_ADMIN_SUBCMD_SET_ADMIN_USER_PROPERTIES_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_ADMIN_SUBCMD_SET_ADMIN_USER_PROPERTIES_DESCRIPTION_71",ADMIN,INFORMATION,71, getClassLoader());

  /**
   * Describes administrator's properties
   */
  public static final MessageDescriptor.Arg0 INFO_ADMIN_SUBCMD_LIST_ADMIN_USER_PROPERTIES_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_ADMIN_SUBCMD_LIST_ADMIN_USER_PROPERTIES_DESCRIPTION_72",ADMIN,INFORMATION,72, getClassLoader());

  /**
   * The administrator's unique identifier. This is a required argument
   */
  public static final MessageDescriptor.Arg0 INFO_ADMIN_ARG_USERID_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_ADMIN_ARG_USERID_DESCRIPTION_73",ADMIN,INFORMATION,73, getClassLoader());

  /**
   * Reason unknown
   */
  public static final MessageDescriptor.Arg0 ERR_OPERATION_REJECTED_DEFAULT =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_OPERATION_REJECTED_DEFAULT_74",ADMIN,SEVERE_ERROR,74, getClassLoader());

  /**
   * A configuration exception occurred while evaluating a constraint: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SERVER_CONSTRAINT_EXCEPTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_SERVER_CONSTRAINT_EXCEPTION_75",ADMIN,SEVERE_ERROR,75, getClassLoader());

  /**
   * The %s could be found but did not contain any type information (e.g. missing object classes in LDAP)
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DECODING_EXCEPTION_NO_TYPE_INFO =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DECODING_EXCEPTION_NO_TYPE_INFO_82",ADMIN,SEVERE_ERROR,82, getClassLoader());

  /**
   * The %s could be found but did not contain the expected type information (e.g. incorrect object classes in LDAP)
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DECODING_EXCEPTION_WRONG_TYPE_INFO =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DECODING_EXCEPTION_WRONG_TYPE_INFO_83",ADMIN,SEVERE_ERROR,83, getClassLoader());

  /**
   * The %s could be found but its type resolved to an abstract managed object definition
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DECODING_EXCEPTION_ABSTRACT_TYPE_INFO =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DECODING_EXCEPTION_ABSTRACT_TYPE_INFO_84",ADMIN,SEVERE_ERROR,84, getClassLoader());

  /**
   * The managed object could not be decoded due to an unspecified reason
   */
  public static final MessageDescriptor.Arg0 ERR_DECODING_EXCEPTION_UNKNOWN =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_DECODING_EXCEPTION_UNKNOWN_85",ADMIN,SEVERE_ERROR,85, getClassLoader());

  /**
   * The default values for the "%s" property could not be determined
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DEFAULT_BEHAVIOR_PROPERTY_EXCEPTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DEFAULT_BEHAVIOR_PROPERTY_EXCEPTION_86",ADMIN,SEVERE_ERROR,86, getClassLoader());

  /**
   * The value "%s" is not a valid value for the "%s" property, which must have the following syntax: %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_ILLEGAL_PROPERTY_VALUE_EXCEPTION =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_ILLEGAL_PROPERTY_VALUE_EXCEPTION_87",ADMIN,SEVERE_ERROR,87, getClassLoader());

  /**
   * The string value "%s" is not a valid value for the "%s" property, which must have the following syntax: %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_ILLEGAL_PROPERTY_VALUE_STRING_EXCEPTION =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_ILLEGAL_PROPERTY_VALUE_STRING_EXCEPTION_88",ADMIN,SEVERE_ERROR,88, getClassLoader());

  /**
   * The "%s" property must be specified as it is mandatory
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PROPERTY_IS_MANDATORY_EXCEPTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PROPERTY_IS_MANDATORY_EXCEPTION_89",ADMIN,SEVERE_ERROR,89, getClassLoader());

  /**
   * The "%s" property must not be modified as it is read-only
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PROPERTY_IS_READ_ONLY_EXCEPTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PROPERTY_IS_READ_ONLY_EXCEPTION_90",ADMIN,SEVERE_ERROR,90, getClassLoader());

  /**
   * The "%s" property must not contain more than one value
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PROPERTY_IS_SINGLE_VALUED_EXCEPTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PROPERTY_IS_SINGLE_VALUED_EXCEPTION_91",ADMIN,SEVERE_ERROR,91, getClassLoader());

  /**
   * An internal error occurred while processing property "%s": unknown property type "%s"
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_UNKNOWN_PROPERTY_DEFINITION_EXCEPTION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_UNKNOWN_PROPERTY_DEFINITION_EXCEPTION_92",ADMIN,SEVERE_ERROR,92, getClassLoader());

  /**
   * Authentication failure
   */
  public static final MessageDescriptor.Arg0 ERR_AUTHENTICATION_EXCEPTION_DEFAULT =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_AUTHENTICATION_EXCEPTION_DEFAULT_93",ADMIN,SEVERE_ERROR,93, getClassLoader());

  /**
   * The requested authentication mechanism is not supported by the server
   */
  public static final MessageDescriptor.Arg0 ERR_AUTHENTICATION_NOT_SUPPORTED_EXCEPTION_DEFAULT =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_AUTHENTICATION_NOT_SUPPORTED_EXCEPTION_DEFAULT_94",ADMIN,SEVERE_ERROR,94, getClassLoader());

  /**
   * Authorization failure
   */
  public static final MessageDescriptor.Arg0 ERR_AUTHORIZATION_EXCEPTION_DEFAULT =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_AUTHORIZATION_EXCEPTION_DEFAULT_95",ADMIN,SEVERE_ERROR,95, getClassLoader());

  /**
   * A communication problem occurred while contacting the server
   */
  public static final MessageDescriptor.Arg0 ERR_COMMUNICATION_EXCEPTION_DEFAULT =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_COMMUNICATION_EXCEPTION_DEFAULT_96",ADMIN,SEVERE_ERROR,96, getClassLoader());

  /**
   * The operation was rejected for the following reason: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_OPERATION_REJECTED_EXCEPTION_SINGLE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_OPERATION_REJECTED_EXCEPTION_SINGLE_97",ADMIN,SEVERE_ERROR,97, getClassLoader());

  /**
   * The operation was rejected for the following reasons: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_OPERATION_REJECTED_EXCEPTION_PLURAL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_OPERATION_REJECTED_EXCEPTION_PLURAL_98",ADMIN,SEVERE_ERROR,98, getClassLoader());

  /**
   * The operation could not be performed because a conflicting change has already occurred. There may be another client administration tool in use
   */
  public static final MessageDescriptor.Arg0 ERR_CONCURRENT_MODIFICATION_EXCEPTION_DEFAULT =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CONCURRENT_MODIFICATION_EXCEPTION_DEFAULT_99",ADMIN,SEVERE_ERROR,99, getClassLoader());

  /**
   * The %s could not be decoded due to the following reason: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MANAGED_OBJECT_DECODING_EXCEPTION_SINGLE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_MANAGED_OBJECT_DECODING_EXCEPTION_SINGLE_100",ADMIN,SEVERE_ERROR,100, getClassLoader());

  /**
   * The %s could not be decoded due to the following reasons: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MANAGED_OBJECT_DECODING_EXCEPTION_PLURAL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_MANAGED_OBJECT_DECODING_EXCEPTION_PLURAL_101",ADMIN,SEVERE_ERROR,101, getClassLoader());

  /**
   * Empty managed object names are not permitted
   */
  public static final MessageDescriptor.Arg0 ERR_ILLEGAL_MANAGED_OBJECT_NAME_EXCEPTION_EMPTY =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_ILLEGAL_MANAGED_OBJECT_NAME_EXCEPTION_EMPTY_102",ADMIN,SEVERE_ERROR,102, getClassLoader());

  /**
   * Blank managed object names are not permitted
   */
  public static final MessageDescriptor.Arg0 ERR_ILLEGAL_MANAGED_OBJECT_NAME_EXCEPTION_BLANK =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_ILLEGAL_MANAGED_OBJECT_NAME_EXCEPTION_BLANK_103",ADMIN,SEVERE_ERROR,103, getClassLoader());

  /**
   * The managed object name "%s" is not a valid value for the naming property "%s", which must have the following syntax: %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_ILLEGAL_MANAGED_OBJECT_NAME_EXCEPTION_SYNTAX =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_ILLEGAL_MANAGED_OBJECT_NAME_EXCEPTION_SYNTAX_104",ADMIN,SEVERE_ERROR,104, getClassLoader());

  /**
   * The managed object name "%s" is not permitted
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ILLEGAL_MANAGED_OBJECT_NAME_EXCEPTION_OTHER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_ILLEGAL_MANAGED_OBJECT_NAME_EXCEPTION_OTHER_105",ADMIN,SEVERE_ERROR,105, getClassLoader());

  /**
   * The managed object could not be created because there is an existing managed object with the same name
   */
  public static final MessageDescriptor.Arg0 ERR_MANAGED_OBJECT_ALREADY_EXISTS_EXCEPTION =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_MANAGED_OBJECT_ALREADY_EXISTS_EXCEPTION_106",ADMIN,SEVERE_ERROR,106, getClassLoader());

  /**
   * The requested managed object could not be found
   */
  public static final MessageDescriptor.Arg0 ERR_MANAGED_OBJECT_NOT_FOUND_EXCEPTION =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_MANAGED_OBJECT_NOT_FOUND_EXCEPTION_107",ADMIN,SEVERE_ERROR,107, getClassLoader());

  /**
   * The "%s" property is mandatory
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MISSING_MANDATORY_PROPERTIES_EXCEPTION_SINGLE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_MISSING_MANDATORY_PROPERTIES_EXCEPTION_SINGLE_108",ADMIN,SEVERE_ERROR,108, getClassLoader());

  /**
   * The following properties are mandatory: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MISSING_MANDATORY_PROPERTIES_EXCEPTION_PLURAL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_MISSING_MANDATORY_PROPERTIES_EXCEPTION_PLURAL_109",ADMIN,SEVERE_ERROR,109, getClassLoader());

  /**
   * The property "%s" was not recognized
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PROPERTY_NOT_FOUND_EXCEPTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PROPERTY_NOT_FOUND_EXCEPTION_110",ADMIN,SEVERE_ERROR,110, getClassLoader());

  /**
   * A communication problem occurred while contacting the server: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_COMMUNICATION_EXCEPTION_DEFAULT_CAUSE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_COMMUNICATION_EXCEPTION_DEFAULT_CAUSE_111",ADMIN,SEVERE_ERROR,111, getClassLoader());

  /**
   * The following constraint violation occurred: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONSTRAINT_VIOLATION_EXCEPTION_SINGLE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONSTRAINT_VIOLATION_EXCEPTION_SINGLE_112",ADMIN,SEVERE_ERROR,112, getClassLoader());

  /**
   * The following constraint violations occurred: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONSTRAINT_VIOLATION_EXCEPTION_PLURAL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONSTRAINT_VIOLATION_EXCEPTION_PLURAL_113",ADMIN,SEVERE_ERROR,113, getClassLoader());

  /**
   * The value "%s" in property "%s" in the %s in entry "%s" refers to a non-existent %s in entry "%s"
   */
  public static final MessageDescriptor.Arg6<CharSequence,CharSequence,CharSequence,CharSequence,CharSequence,CharSequence> ERR_SERVER_REFINT_DANGLING_REFERENCE =
          new MessageDescriptor.Arg6<CharSequence,CharSequence,CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_SERVER_REFINT_DANGLING_REFERENCE_114",ADMIN,SEVERE_ERROR,114, getClassLoader());

  /**
   * The value "%s" in property "%s" in the enabled %s in entry "%s" refers to a disabled %s in entry "%s"
   */
  public static final MessageDescriptor.Arg6<CharSequence,CharSequence,CharSequence,CharSequence,CharSequence,CharSequence> ERR_SERVER_REFINT_SOURCE_ENABLED_TARGET_DISABLED =
          new MessageDescriptor.Arg6<CharSequence,CharSequence,CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_SERVER_REFINT_SOURCE_ENABLED_TARGET_DISABLED_115",ADMIN,SEVERE_ERROR,115, getClassLoader());

  /**
   * The value "%s" in property "%s" in the %s in entry "%s" refers to a disabled %s in entry "%s"
   */
  public static final MessageDescriptor.Arg6<CharSequence,CharSequence,CharSequence,CharSequence,CharSequence,CharSequence> ERR_SERVER_REFINT_TARGET_DISABLED =
          new MessageDescriptor.Arg6<CharSequence,CharSequence,CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_SERVER_REFINT_TARGET_DISABLED_116",ADMIN,SEVERE_ERROR,116, getClassLoader());

  /**
   * The %s in entry "%s" cannot be deleted because it is referenced by the "%s" property of the %s in entry "%s"
   */
  public static final MessageDescriptor.Arg5<CharSequence,CharSequence,CharSequence,CharSequence,CharSequence> ERR_SERVER_REFINT_CANNOT_DELETE =
          new MessageDescriptor.Arg5<CharSequence,CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_SERVER_REFINT_CANNOT_DELETE_117",ADMIN,SEVERE_ERROR,117, getClassLoader());

  /**
   * The %s in entry "%s" cannot be disabled because it is referenced by the "%s" property of the %s in entry "%s"
   */
  public static final MessageDescriptor.Arg5<CharSequence,CharSequence,CharSequence,CharSequence,CharSequence> ERR_SERVER_REFINT_CANNOT_DISABLE =
          new MessageDescriptor.Arg5<CharSequence,CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_SERVER_REFINT_CANNOT_DISABLE_118",ADMIN,SEVERE_ERROR,118, getClassLoader());

  /**
   * The administration framework could not be initialized due to the following exception: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CANNOT_INITIALIZE_ADMIN_FRAMEWORK =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"FATAL_ERR_CANNOT_INITIALIZE_ADMIN_FRAMEWORK_119",ADMIN,FATAL_ERROR,119, getClassLoader());

  /**
   * An unexpected error occurred while reading the manifest file: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CLASS_LOADER_CANNOT_READ_MANIFEST_FILE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CLASS_LOADER_CANNOT_READ_MANIFEST_FILE_120",ADMIN,SEVERE_ERROR,120, getClassLoader());

  /**
   * An error occurred while attempting to load class "%s": %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CLASS_LOADER_CANNOT_LOAD_CLASS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CLASS_LOADER_CANNOT_LOAD_CLASS_121",ADMIN,SEVERE_ERROR,121, getClassLoader());

  /**
   * Unable to to find the getInstance() method in the managed object definition class "%s": %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CLASS_LOADER_CANNOT_FIND_GET_INSTANCE_METHOD =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CLASS_LOADER_CANNOT_FIND_GET_INSTANCE_METHOD_122",ADMIN,SEVERE_ERROR,122, getClassLoader());

  /**
   * Unable to to invoke the getInstance() method in the managed object definition class "%s": %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CLASS_LOADER_CANNOT_INVOKE_GET_INSTANCE_METHOD =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CLASS_LOADER_CANNOT_INVOKE_GET_INSTANCE_METHOD_123",ADMIN,SEVERE_ERROR,123, getClassLoader());

  /**
   * Unable initialize the "%s" managed object definition in class "%s": %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CLASS_LOADER_CANNOT_INITIALIZE_DEFN =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CLASS_LOADER_CANNOT_INITIALIZE_DEFN_124",ADMIN,SEVERE_ERROR,124, getClassLoader());

  /**
   * The extension "%s" with manifest file %s cannot be loaded because an unexpected error occurred while trying to initialize it: %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CLASS_LOADER_CANNOT_LOAD_EXTENSION =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CLASS_LOADER_CANNOT_LOAD_EXTENSION_125",ADMIN,SEVERE_ERROR,125, getClassLoader());

  /**
   * The core administration classes could not be loaded from manifest file %s because an unexpected error occurred: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CLASS_LOADER_CANNOT_LOAD_CORE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"FATAL_ERR_CLASS_LOADER_CANNOT_LOAD_CORE_126",ADMIN,FATAL_ERROR,126, getClassLoader());

  /**
   * The %s "%s" referenced in property "%s" does not exist
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CLIENT_REFINT_TARGET_DANGLING_REFERENCE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CLIENT_REFINT_TARGET_DANGLING_REFERENCE_127",ADMIN,SEVERE_ERROR,127, getClassLoader());

  /**
   * The %s "%s" referenced in property "%s" exists but has an invalid configuration: %s
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> ERR_CLIENT_REFINT_TARGET_INVALID =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CLIENT_REFINT_TARGET_INVALID_128",ADMIN,SEVERE_ERROR,128, getClassLoader());

  /**
   * The %s "%s" referenced in property "%s" is disabled
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CLIENT_REFINT_TARGET_DISABLED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CLIENT_REFINT_TARGET_DISABLED_129",ADMIN,SEVERE_ERROR,129, getClassLoader());

  /**
   * The "%s" property in the %s called "%s" references this %s
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> ERR_CLIENT_REFINT_CANNOT_DELETE_WITH_NAME =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CLIENT_REFINT_CANNOT_DELETE_WITH_NAME_130",ADMIN,SEVERE_ERROR,130, getClassLoader());

  /**
   * The "%s" property in the %s references this %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CLIENT_REFINT_CANNOT_DELETE_WITHOUT_NAME =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CLIENT_REFINT_CANNOT_DELETE_WITHOUT_NAME_131",ADMIN,SEVERE_ERROR,131, getClassLoader());

  /**
   * This %s cannot be disabled because it is referenced by the "%s" property in the %s called "%s"
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> ERR_CLIENT_REFINT_CANNOT_DISABLE_WITH_NAME =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CLIENT_REFINT_CANNOT_DISABLE_WITH_NAME_132",ADMIN,SEVERE_ERROR,132, getClassLoader());

  /**
   * This %s cannot be disabled because it is referenced by the "%s" property in the %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CLIENT_REFINT_CANNOT_DISABLE_WITHOUT_NAME =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CLIENT_REFINT_CANNOT_DISABLE_WITHOUT_NAME_133",ADMIN,SEVERE_ERROR,133, getClassLoader());

  /**
   * An error occurred while attempting to determine if the %s in entry %s is enabled: %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_REFINT_UNABLE_TO_EVALUATE_TARGET_CONDITION =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_REFINT_UNABLE_TO_EVALUATE_TARGET_CONDITION_134",ADMIN,SEVERE_ERROR,134, getClassLoader());

  /**
   * The administration connector self-signed certificate cannot be generated because the following error occurred: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ADMIN_CERTIFICATE_GENERATION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_ADMIN_CERTIFICATE_GENERATION_135",ADMIN,SEVERE_ERROR,135, getClassLoader());

  /**
   * The administration connector self-signed certificate cannot be generated because the following files are missing: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ADMIN_CERTIFICATE_GENERATION_MISSING_FILES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_ADMIN_CERTIFICATE_GENERATION_MISSING_FILES_136",ADMIN,SEVERE_ERROR,136, getClassLoader());

  /**
   * Failed to set permissions on file %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ADMIN_SET_PERMISSIONS_FAILED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ADMIN_SET_PERMISSIONS_FAILED_137",ADMIN,SEVERE_WARNING,137, getClassLoader());

  /**
   * The registry information of the servers could not be merged
   */
  public static final MessageDescriptor.Arg0 ERR_ADMIN_MERGING =
          new MessageDescriptor.Arg0(BASE,"FATAL_ERR_ADMIN_MERGING_138",ADMIN,FATAL_ERROR,138, getClassLoader());


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
            Class<?> c = Class.forName("org.opends.messages.AdminMessages");

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
      cl = AdminMessages.class.getClassLoader();
    }
    return cl;
  }
}
