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
public final class BackendMessages {

  /** Base property for resource bundle containing messages */
  private static final String BASE = "messages/backend";

  private static ClassLoader webstartClassLoader;

  // Prevent instantiation.
  private BackendMessages() {
    // Do nothing.
  }

  /**
   * An attempt was made to de-register sub-suffix "%s" from the backend with suffix "%s".  However, the subordinate backend containing that sub-suffix also contains additional sub-suffixes and may not be de-registered.  It may be possible to remove this sub-suffix by editing the configuration for the subordinate backend with which it is associated
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_BACKEND_CANNOT_REMOVE_MULTIBASE_SUB_SUFFIX =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"FATAL_ERR_BACKEND_CANNOT_REMOVE_MULTIBASE_SUB_SUFFIX_1",BACKEND,FATAL_ERROR,1, getClassLoader());

  /**
   * An attempt was made to configure the root DSE backend without providing a configuration entry.  This is not allowed
   */
  public static final MessageDescriptor.Arg0 ERR_ROOTDSE_CONFIG_ENTRY_NULL =
          new MessageDescriptor.Arg0(BASE,"FATAL_ERR_ROOTDSE_CONFIG_ENTRY_NULL_2",BACKEND,FATAL_ERROR,2, getClassLoader());

  /**
   * Set of base DNs that will be used for singleLevel, wholeSubtree, and subordinateSubtree searches based at the root DSE.  If this is not provided, then the set of all user-defined suffixes will be used
   */
  public static final MessageDescriptor.Arg0 INFO_ROOTDSE_SUBORDINATE_BASE_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_ROOTDSE_SUBORDINATE_BASE_DESCRIPTION_3",BACKEND,INFORMATION,3, getClassLoader());

  /**
   * Base DN "%s" is configured as one of the subordinate base DNs to use for searches below the root DSE.  However, this base DN is not handled by any suffix registered with the Directory Server and will therefore not be used
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ROOTDSE_NO_BACKEND_FOR_SUBORDINATE_BASE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ROOTDSE_NO_BACKEND_FOR_SUBORDINATE_BASE_4",BACKEND,SEVERE_WARNING,4, getClassLoader());

  /**
   * An unexpected problem occurred while trying to determine the set of subordinate base DNs to use for searches below the root DSE:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ROOTDSE_SUBORDINATE_BASE_EXCEPTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ROOTDSE_SUBORDINATE_BASE_EXCEPTION_5",BACKEND,SEVERE_WARNING,5, getClassLoader());

  /**
   * The root DSE backend was asked to retrieve entry with DN "%s".  This backend should only be asked to retrieve the root DSE itself.  However, it will check with the defined subordinate backends and see if it can find the requested entry
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ROOTDSE_GET_ENTRY_NONROOT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_WARN_ROOTDSE_GET_ENTRY_NONROOT_6",BACKEND,MILD_WARNING,6, getClassLoader());

  /**
   * Unwilling to add entry "%s" because add operations are not supported in the root DSE backend
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ROOTDSE_ADD_NOT_SUPPORTED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ROOTDSE_ADD_NOT_SUPPORTED_7",BACKEND,MILD_ERROR,7, getClassLoader());

  /**
   * Unwilling to remove entry "%s" because delete operations are not supported in the root DSE backend
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ROOTDSE_DELETE_NOT_SUPPORTED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ROOTDSE_DELETE_NOT_SUPPORTED_8",BACKEND,MILD_ERROR,8, getClassLoader());

  /**
   * Unwilling to update entry "%s" because modify operations are not supported in the root DSE backend.  If you wish to alter the contents of the root DSE itself, then it may be possible to do so by modifying the "%s" entry in the configuration
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ROOTDSE_MODIFY_NOT_SUPPORTED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ROOTDSE_MODIFY_NOT_SUPPORTED_9",BACKEND,MILD_ERROR,9, getClassLoader());

  /**
   * Unwilling to rename entry "%s" because modify DN operations are not supported in the root DSE backend
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ROOTDSE_MODIFY_DN_NOT_SUPPORTED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ROOTDSE_MODIFY_DN_NOT_SUPPORTED_10",BACKEND,MILD_ERROR,10, getClassLoader());

  /**
   * Unwilling to perform a search (connection ID %d, operation ID %d) with a base DN of "%s" in the root DSE backend.  The base DN for searches in this backend must be the DN of the root DSE itself
   */
  public static final MessageDescriptor.Arg3<Number,Number,CharSequence> ERR_ROOTDSE_INVALID_SEARCH_BASE =
          new MessageDescriptor.Arg3<Number,Number,CharSequence>(BASE,"MILD_ERR_ROOTDSE_INVALID_SEARCH_BASE_11",BACKEND,MILD_ERROR,11, getClassLoader());

  /**
   * An unexpected failure occurred while trying to process a search operation (connection ID %d, operation ID %d) in the root DSE backend:  %s
   */
  public static final MessageDescriptor.Arg3<Number,Number,CharSequence> ERR_ROOTDSE_UNEXPECTED_SEARCH_FAILURE =
          new MessageDescriptor.Arg3<Number,Number,CharSequence>(BASE,"SEVERE_ERR_ROOTDSE_UNEXPECTED_SEARCH_FAILURE_12",BACKEND,SEVERE_ERROR,12, getClassLoader());

  /**
   * Unable to process the search with connection ID %d and operation ID %d because it had an invalid scope of %s
   */
  public static final MessageDescriptor.Arg3<Number,Number,CharSequence> ERR_ROOTDSE_INVALID_SEARCH_SCOPE =
          new MessageDescriptor.Arg3<Number,Number,CharSequence>(BASE,"SEVERE_ERR_ROOTDSE_INVALID_SEARCH_SCOPE_13",BACKEND,SEVERE_ERROR,13, getClassLoader());

  /**
   * An unexpected error occurred while trying to open the LDIF writer for the root DSE backend:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ROOTDSE_UNABLE_TO_CREATE_LDIF_WRITER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_ROOTDSE_UNABLE_TO_CREATE_LDIF_WRITER_14",BACKEND,SEVERE_ERROR,14, getClassLoader());

  /**
   * An unexpected error occurred while trying to export the root DSE entry to the specified LDIF target: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ROOTDSE_UNABLE_TO_EXPORT_DSE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_ROOTDSE_UNABLE_TO_EXPORT_DSE_15",BACKEND,SEVERE_ERROR,15, getClassLoader());

  /**
   * The root DSE backend does not support LDIF import operations
   */
  public static final MessageDescriptor.Arg0 ERR_ROOTDSE_IMPORT_NOT_SUPPORTED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_ROOTDSE_IMPORT_NOT_SUPPORTED_16",BACKEND,SEVERE_ERROR,16, getClassLoader());

  /**
   * The root DSE backend does not provide a facility for backup and restore operations.  The contents of the root DSE should be backed up as part of the Directory Server configuration
   */
  public static final MessageDescriptor.Arg0 ERR_ROOTDSE_BACKUP_AND_RESTORE_NOT_SUPPORTED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_ROOTDSE_BACKUP_AND_RESTORE_NOT_SUPPORTED_17",BACKEND,SEVERE_ERROR,17, getClassLoader());

  /**
   * The root DSE configuration has been updated so that it will now use the defined set of Directory Server suffixes when performing searches below the root DSE
   */
  public static final MessageDescriptor.Arg0 INFO_ROOTDSE_USING_SUFFIXES_AS_BASE_DNS =
          new MessageDescriptor.Arg0(BASE,"INFO_ROOTDSE_USING_SUFFIXES_AS_BASE_DNS_18",BACKEND,INFORMATION,18, getClassLoader());

  /**
   * The root DSE configuration has been updated so that it will now use the base DN set %s when performing below the root DSE
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ROOTDSE_USING_NEW_SUBORDINATE_BASE_DNS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ROOTDSE_USING_NEW_SUBORDINATE_BASE_DNS_19",BACKEND,INFORMATION,19, getClassLoader());

  /**
   * The root DSE configuration has been updated so that it will now use a new set of user-defined attributes
   */
  public static final MessageDescriptor.Arg0 INFO_ROOTDSE_USING_NEW_USER_ATTRS =
          new MessageDescriptor.Arg0(BASE,"INFO_ROOTDSE_USING_NEW_USER_ATTRS_20",BACKEND,INFORMATION,20, getClassLoader());

  /**
   * An attempt was made to configure the monitor backend without providing a configuration entry.  This is not allowed, and no monitor information will be available over protocol
   */
  public static final MessageDescriptor.Arg0 ERR_MONITOR_CONFIG_ENTRY_NULL =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_MONITOR_CONFIG_ENTRY_NULL_21",BACKEND,SEVERE_ERROR,21, getClassLoader());

  /**
   * An unexpected error occurred while attempting to decode cn=monitor as the base DN for the Directory Server monitor information:  %s.  No monitor information will be available over protocol
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MONITOR_CANNOT_DECODE_MONITOR_ROOT_DN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_MONITOR_CANNOT_DECODE_MONITOR_ROOT_DN_22",BACKEND,SEVERE_ERROR,22, getClassLoader());

  /**
   * Unwilling to add entry "%s" because add operations are not supported in the monitor backend
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MONITOR_ADD_NOT_SUPPORTED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_MONITOR_ADD_NOT_SUPPORTED_23",BACKEND,MILD_ERROR,23, getClassLoader());

  /**
   * Unwilling to remove entry "%s" because delete operations are not supported in the monitor backend
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MONITOR_DELETE_NOT_SUPPORTED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_MONITOR_DELETE_NOT_SUPPORTED_24",BACKEND,MILD_ERROR,24, getClassLoader());

  /**
   * Unwilling to update entry "%s" because modify operations are not supported in the monitor backend.  If you wish to alter the contents of the base monitor entry itself, then it may be possible to do so by modifying the "%s" entry in the configuration
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MONITOR_MODIFY_NOT_SUPPORTED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_MONITOR_MODIFY_NOT_SUPPORTED_25",BACKEND,MILD_ERROR,25, getClassLoader());

  /**
   * Unwilling to rename entry "%s" because modify DN operations are not supported in the monitor backend
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MONITOR_MODIFY_DN_NOT_SUPPORTED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_MONITOR_MODIFY_DN_NOT_SUPPORTED_26",BACKEND,MILD_ERROR,26, getClassLoader());

  /**
   * An error occurred while attempting to export the base monitor entry:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MONITOR_UNABLE_TO_EXPORT_BASE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_MONITOR_UNABLE_TO_EXPORT_BASE_27",BACKEND,SEVERE_ERROR,27, getClassLoader());

  /**
   * An error occurred while attempting to export the monitor entry for monitor provider %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MONITOR_UNABLE_TO_EXPORT_PROVIDER_ENTRY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_MONITOR_UNABLE_TO_EXPORT_PROVIDER_ENTRY_28",BACKEND,SEVERE_ERROR,28, getClassLoader());

  /**
   * The monitor backend does not support LDIF import operations
   */
  public static final MessageDescriptor.Arg0 ERR_MONITOR_IMPORT_NOT_SUPPORTED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_MONITOR_IMPORT_NOT_SUPPORTED_29",BACKEND,SEVERE_ERROR,29, getClassLoader());

  /**
   * The monitor backend does not provide a facility for backup and restore operations
   */
  public static final MessageDescriptor.Arg0 ERR_MONITOR_BACKUP_AND_RESTORE_NOT_SUPPORTED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_MONITOR_BACKUP_AND_RESTORE_NOT_SUPPORTED_30",BACKEND,SEVERE_ERROR,30, getClassLoader());

  /**
   * The monitor configuration has been updated so that it will now use a new set of user-defined attributes
   */
  public static final MessageDescriptor.Arg0 INFO_MONITOR_USING_NEW_USER_ATTRS =
          new MessageDescriptor.Arg0(BASE,"INFO_MONITOR_USING_NEW_USER_ATTRS_31",BACKEND,INFORMATION,31, getClassLoader());

  /**
   * Unable to retrieve the requested entry from the monitor backend because the provided DN was null
   */
  public static final MessageDescriptor.Arg0 ERR_MONITOR_GET_ENTRY_NULL =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_MONITOR_GET_ENTRY_NULL_32",BACKEND,MILD_ERROR,32, getClassLoader());

  /**
   * Unable to retrieve the requested entry %s from the monitor backend because the DN is too deep.  Monitor entries may not be more than one level below %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MONITOR_BASE_TOO_DEEP =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_MONITOR_BASE_TOO_DEEP_33",BACKEND,MILD_ERROR,33, getClassLoader());

  /**
   * Unable to retrieve the requested entry %s from the monitor backend because the DN is not below the monitor base of %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MONITOR_INVALID_BASE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_MONITOR_INVALID_BASE_34",BACKEND,MILD_ERROR,34, getClassLoader());

  /**
   * Unable to retrieve the requested entry %s from the monitor backend because monitor entries may not contain multivalued RDNs
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MONITOR_MULTIVALUED_RDN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_MONITOR_MULTIVALUED_RDN_35",BACKEND,MILD_ERROR,35, getClassLoader());

  /**
   * Unable to retrieve the requested entry from the monitor backend because there is no monitor provider "%s" registered with the Directory Server
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MONITOR_NO_SUCH_PROVIDER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_MONITOR_NO_SUCH_PROVIDER_36",BACKEND,MILD_ERROR,36, getClassLoader());

  /**
   * %d days %d hours %d minutes %d seconds
   */
  public static final MessageDescriptor.Arg4<Number,Number,Number,Number> INFO_MONITOR_UPTIME =
          new MessageDescriptor.Arg4<Number,Number,Number,Number>(BASE,"INFO_MONITOR_UPTIME_37",BACKEND,INFORMATION,37, getClassLoader());

  /**
   * An attempt was made to configure the schema backend without providing a configuration entry.  This is not allowed, and no schema information will be available over protocol
   */
  public static final MessageDescriptor.Arg0 ERR_SCHEMA_CONFIG_ENTRY_NULL =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_SCHEMA_CONFIG_ENTRY_NULL_38",BACKEND,SEVERE_ERROR,38, getClassLoader());

  /**
   * DN or set of DNs for the entries that may be retrieved in order to retrieve the Directory Server schema information.  Multiple values may be provided if the schema is to be available in multiple locations for compatibility purposes.  If no value is provided, a default of "cn=schema" will be used
   */
  public static final MessageDescriptor.Arg0 INFO_SCHEMA_DESCRIPTION_ENTRY_DN =
          new MessageDescriptor.Arg0(BASE,"INFO_SCHEMA_DESCRIPTION_ENTRY_DN_39",BACKEND,INFORMATION,39, getClassLoader());

  /**
   * An error occurred while trying to determine the base DNs to use when publishing the Directory Server schema information, as specified in the ds-cfg-schema-entry-dn attribute of configuration entry %s:  %s.  The default schema base DN of cn=schema will be used
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_CANNOT_DETERMINE_BASE_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_SCHEMA_CANNOT_DETERMINE_BASE_DN_40",BACKEND,SEVERE_ERROR,40, getClassLoader());

  /**
   * Unwilling to add entry "%s" because add operations are not supported in the schema backend
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SCHEMA_ADD_NOT_SUPPORTED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SCHEMA_ADD_NOT_SUPPORTED_41",BACKEND,MILD_ERROR,41, getClassLoader());

  /**
   * Unwilling to remove entry "%s" because delete operations are not supported in the schema backend
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SCHEMA_DELETE_NOT_SUPPORTED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SCHEMA_DELETE_NOT_SUPPORTED_42",BACKEND,MILD_ERROR,42, getClassLoader());

  /**
   * Unwilling to update entry "%s" because modify operations are not yet supported in the schema backend.  If you wish to alter the contents of the base schema entry itself, then it may be possible to do so by modifying the "%s" entry in the configuration
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_NOT_SUPPORTED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_NOT_SUPPORTED_43",BACKEND,MILD_ERROR,43, getClassLoader());

  /**
   * Unwilling to rename entry "%s" because modify DN operations are not supported in the schema backend
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SCHEMA_MODIFY_DN_NOT_SUPPORTED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_DN_NOT_SUPPORTED_44",BACKEND,MILD_ERROR,44, getClassLoader());

  /**
   * An error occurred while attempting to export the base schema entry:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SCHEMA_UNABLE_TO_EXPORT_BASE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_SCHEMA_UNABLE_TO_EXPORT_BASE_45",BACKEND,SEVERE_ERROR,45, getClassLoader());

  /**
   * The schema backend does not support LDIF import operations
   */
  public static final MessageDescriptor.Arg0 ERR_SCHEMA_IMPORT_NOT_SUPPORTED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_SCHEMA_IMPORT_NOT_SUPPORTED_46",BACKEND,SEVERE_ERROR,46, getClassLoader());

  /**
   * The schema backend does not yet provide a facility for backup and restore operations
   */
  public static final MessageDescriptor.Arg0 ERR_SCHEMA_BACKUP_AND_RESTORE_NOT_SUPPORTED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_SCHEMA_BACKUP_AND_RESTORE_NOT_SUPPORTED_47",BACKEND,SEVERE_ERROR,47, getClassLoader());

  /**
   * Unable to retrieve the requested entry %s from the schema backend because the DN is equal to one of the schema entry DNs
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SCHEMA_INVALID_BASE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SCHEMA_INVALID_BASE_48",BACKEND,MILD_ERROR,48, getClassLoader());

  /**
   * An unexpected error occurred while trying to open the LDIF writer for the schema backend:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SCHEMA_UNABLE_TO_CREATE_LDIF_WRITER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_SCHEMA_UNABLE_TO_CREATE_LDIF_WRITER_49",BACKEND,SEVERE_ERROR,49, getClassLoader());

  /**
   * Successfully deregistered DN %s so that it will no longer be available as a schema entry DN
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_SCHEMA_DEREGISTERED_BASE_DN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_SCHEMA_DEREGISTERED_BASE_DN_50",BACKEND,INFORMATION,50, getClassLoader());

  /**
   * An error occurred while trying to deregister %s as a schema entry DN:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_CANNOT_DEREGISTER_BASE_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_SCHEMA_CANNOT_DEREGISTER_BASE_DN_51",BACKEND,SEVERE_ERROR,51, getClassLoader());

  /**
   * Successfully registered DN %s as a new schema entry DN
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_SCHEMA_REGISTERED_BASE_DN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_SCHEMA_REGISTERED_BASE_DN_52",BACKEND,INFORMATION,52, getClassLoader());

  /**
   * An error occurred while trying to register %s as a schema entry DN:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_CANNOT_REGISTER_BASE_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_SCHEMA_CANNOT_REGISTER_BASE_DN_53",BACKEND,SEVERE_ERROR,53, getClassLoader());

  /**
   * The schema configuration has been updated so that it will now use a new set of user-defined attributes
   */
  public static final MessageDescriptor.Arg0 INFO_SCHEMA_USING_NEW_USER_ATTRS =
          new MessageDescriptor.Arg0(BASE,"INFO_SCHEMA_USING_NEW_USER_ATTRS_54",BACKEND,INFORMATION,54, getClassLoader());

  /**
   * The Directory Server was unable to obtain a lock on entry %s after multiple attempts.  This could mean that the entry is already locked by a long-running operation or that the entry has previously been locked but was not properly unlocked
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_BACKEND_CANNOT_LOCK_ENTRY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"FATAL_ERR_BACKEND_CANNOT_LOCK_ENTRY_55",BACKEND,FATAL_ERROR,55, getClassLoader());

  /**
   * An error occurred while attempting to obtain the %s MAC provider to create the signed hash for the backup:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_BACKUP_CANNOT_GET_MAC =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_SCHEMA_BACKUP_CANNOT_GET_MAC_56",BACKEND,SEVERE_ERROR,56, getClassLoader());

  /**
   * An error occurred while attempting to obtain the %s message digest to create the hash for the backup: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_BACKUP_CANNOT_GET_DIGEST =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_SCHEMA_BACKUP_CANNOT_GET_DIGEST_57",BACKEND,SEVERE_ERROR,57, getClassLoader());

  /**
   * An error occurred while trying to create the schema archive file %s in directory %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SCHEMA_BACKUP_CANNOT_CREATE_ARCHIVE_FILE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_SCHEMA_BACKUP_CANNOT_CREATE_ARCHIVE_FILE_58",BACKEND,SEVERE_ERROR,58, getClassLoader());

  /**
   * An error occurred while attempting to obtain the cipher to use to encrypt the backup:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SCHEMA_BACKUP_CANNOT_GET_CIPHER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_SCHEMA_BACKUP_CANNOT_GET_CIPHER_59",BACKEND,SEVERE_ERROR,59, getClassLoader());

  /**
   * %s schema backup %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_BACKUP_ZIP_COMMENT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_SCHEMA_BACKUP_ZIP_COMMENT_60",BACKEND,SEVERE_ERROR,60, getClassLoader());

  /**
   * An error occurred while attempting to obtain a list of the files in directory %s to include in the schema backup:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_BACKUP_CANNOT_LIST_SCHEMA_FILES =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_SCHEMA_BACKUP_CANNOT_LIST_SCHEMA_FILES_61",BACKEND,SEVERE_ERROR,61, getClassLoader());

  /**
   * An error occurred while attempting to back up schema file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_BACKUP_CANNOT_BACKUP_SCHEMA_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_SCHEMA_BACKUP_CANNOT_BACKUP_SCHEMA_FILE_62",BACKEND,SEVERE_ERROR,62, getClassLoader());

  /**
   * An error occurred while trying to close the schema archive file %s in directory %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SCHEMA_BACKUP_CANNOT_CLOSE_ZIP_STREAM =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_SCHEMA_BACKUP_CANNOT_CLOSE_ZIP_STREAM_63",BACKEND,SEVERE_ERROR,63, getClassLoader());

  /**
   * An error occurred while attempting to update the backup descriptor file %s with information about the schema backup:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_BACKUP_CANNOT_UPDATE_BACKUP_DESCRIPTOR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_SCHEMA_BACKUP_CANNOT_UPDATE_BACKUP_DESCRIPTOR_64",BACKEND,SEVERE_ERROR,64, getClassLoader());

  /**
   * Unable to restore or verify schema backup %s in directory %s because no such backup exists
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_RESTORE_NO_SUCH_BACKUP =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_SCHEMA_RESTORE_NO_SUCH_BACKUP_65",BACKEND,SEVERE_ERROR,65, getClassLoader());

  /**
   * Unable to restore or verify schema backup %s in directory %s because the archive filename could not be determined
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_RESTORE_NO_BACKUP_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_SCHEMA_RESTORE_NO_BACKUP_FILE_66",BACKEND,SEVERE_ERROR,66, getClassLoader());

  /**
   * Unable to restore or verify schema backup %s because the specified archive file %s does not exist
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_RESTORE_NO_SUCH_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_SCHEMA_RESTORE_NO_SUCH_FILE_67",BACKEND,SEVERE_ERROR,67, getClassLoader());

  /**
   * Unable to restore or verify schema backup %s because an error occurred while trying to determine whether backup archive %s exists:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SCHEMA_RESTORE_CANNOT_CHECK_FOR_ARCHIVE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_SCHEMA_RESTORE_CANNOT_CHECK_FOR_ARCHIVE_68",BACKEND,SEVERE_ERROR,68, getClassLoader());

  /**
   * Unable to restore or verify schema backup %s because an unsigned hash of this backup is available but the server cannot determine the digest algorithm used to generate this hash
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SCHEMA_RESTORE_UNKNOWN_DIGEST =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_SCHEMA_RESTORE_UNKNOWN_DIGEST_69",BACKEND,SEVERE_ERROR,69, getClassLoader());

  /**
   * Unable to restore or verify schema backup %s because it has an unsigned hash that uses an unknown or unsupported digest algorithm of %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_RESTORE_CANNOT_GET_DIGEST =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_SCHEMA_RESTORE_CANNOT_GET_DIGEST_70",BACKEND,SEVERE_ERROR,70, getClassLoader());

  /**
   * Unable to restore or verify schema backup %s because a signed hash of this backup is available but the server cannot determine the MAC algorithm used to generate this hash
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SCHEMA_RESTORE_UNKNOWN_MAC =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_SCHEMA_RESTORE_UNKNOWN_MAC_71",BACKEND,SEVERE_ERROR,71, getClassLoader());

  /**
   * Unable to restore or verify schema backup %s because it has a signed hash that uses an unknown or unsupported MAC algorithm of %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_RESTORE_CANNOT_GET_MAC =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_SCHEMA_RESTORE_CANNOT_GET_MAC_72",BACKEND,SEVERE_ERROR,72, getClassLoader());

  /**
   * Unable to restore or verify schema backup %s because an error occurred while attempting to open the backup archive file %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SCHEMA_RESTORE_CANNOT_OPEN_BACKUP_FILE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_SCHEMA_RESTORE_CANNOT_OPEN_BACKUP_FILE_73",BACKEND,SEVERE_ERROR,73, getClassLoader());

  /**
   * Unable to restore or verify schema backup %s because it is encrypted using an unknown or unsupported cipher:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_RESTORE_CANNOT_GET_CIPHER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_SCHEMA_RESTORE_CANNOT_GET_CIPHER_75",BACKEND,SEVERE_ERROR,75, getClassLoader());

  /**
   * Unable to restore schema backup %s because an error occurred while attempting to rename the current schema directory from %s to %s:  %s
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> ERR_SCHEMA_RESTORE_CANNOT_RENAME_CURRENT_DIRECTORY =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_SCHEMA_RESTORE_CANNOT_RENAME_CURRENT_DIRECTORY_76",BACKEND,SEVERE_ERROR,76, getClassLoader());

  /**
   * An error occurred that prevented the schema backup from being properly restored.  However, the original schema files that were in place before the start of the restore process have been preserved and are now in their original location of %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_SCHEMA_RESTORE_RESTORED_OLD_SCHEMA =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_SCHEMA_RESTORE_RESTORED_OLD_SCHEMA_77",BACKEND,NOTICE,77, getClassLoader());

  /**
   * An error occurred that prevented the schema backup from being properly restored.  The original schema files that were in place before the start of the restore process have been preserved and are contained in the %s directory
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SCHEMA_RESTORE_CANNOT_RESTORE_OLD_SCHEMA =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_SCHEMA_RESTORE_CANNOT_RESTORE_OLD_SCHEMA_78",BACKEND,SEVERE_ERROR,78, getClassLoader());

  /**
   * Unable to restore schema backup %s because an error occurred while attempting to create a new empty directory %s into which the files should be restored:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SCHEMA_RESTORE_CANNOT_CREATE_SCHEMA_DIRECTORY =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_SCHEMA_RESTORE_CANNOT_CREATE_SCHEMA_DIRECTORY_79",BACKEND,SEVERE_ERROR,79, getClassLoader());

  /**
   * An error occurred that prevented the schema backup from being properly restored.  The original schema files that were in place before the start of the restore process have been preserved in the %s directory
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SCHEMA_RESTORE_OLD_SCHEMA_SAVED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_SCHEMA_RESTORE_OLD_SCHEMA_SAVED_80",BACKEND,SEVERE_ERROR,80, getClassLoader());

  /**
   * Unable to restore or verify schema backup %s because an error occurred while trying to read the next entry from the archive file %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SCHEMA_RESTORE_CANNOT_GET_ZIP_ENTRY =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_SCHEMA_RESTORE_CANNOT_GET_ZIP_ENTRY_81",BACKEND,SEVERE_ERROR,81, getClassLoader());

  /**
   * Unable to restore schema backup %s because an error occurred while trying to recreate file %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SCHEMA_RESTORE_CANNOT_CREATE_FILE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_SCHEMA_RESTORE_CANNOT_CREATE_FILE_82",BACKEND,SEVERE_ERROR,82, getClassLoader());

  /**
   * Unable to restore or verify schema backup %s because an error occurred while processing archived file %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SCHEMA_RESTORE_CANNOT_PROCESS_ARCHIVE_FILE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_SCHEMA_RESTORE_CANNOT_PROCESS_ARCHIVE_FILE_83",BACKEND,SEVERE_ERROR,83, getClassLoader());

  /**
   * Unable to restore or verify schema backup %s because an unexpected error occurred while trying to close the archive file %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SCHEMA_RESTORE_ERROR_ON_ZIP_STREAM_CLOSE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_SCHEMA_RESTORE_ERROR_ON_ZIP_STREAM_CLOSE_84",BACKEND,SEVERE_ERROR,84, getClassLoader());

  /**
   * The message digest calculated from the backup archive matches the digest stored with the backup information
   */
  public static final MessageDescriptor.Arg0 NOTE_SCHEMA_RESTORE_UNSIGNED_HASH_VALID =
          new MessageDescriptor.Arg0(BASE,"NOTICE_SCHEMA_RESTORE_UNSIGNED_HASH_VALID_85",BACKEND,NOTICE,85, getClassLoader());

  /**
   * Unable to restore or verify schema backup %s because the message digest calculated from the backup archive does not match the digest stored with the backup information
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SCHEMA_RESTORE_UNSIGNED_HASH_INVALID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_SCHEMA_RESTORE_UNSIGNED_HASH_INVALID_86",BACKEND,SEVERE_ERROR,86, getClassLoader());

  /**
   * The signed digest calculated from the backup archive matches the signature stored with the backup information
   */
  public static final MessageDescriptor.Arg0 NOTE_SCHEMA_RESTORE_SIGNED_HASH_VALID =
          new MessageDescriptor.Arg0(BASE,"NOTICE_SCHEMA_RESTORE_SIGNED_HASH_VALID_87",BACKEND,NOTICE,87, getClassLoader());

  /**
   * Unable to restore or verify schema backup %s because the signed digest calculated from the backup archive does not match the signature stored with the backup information
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SCHEMA_RESTORE_SIGNED_HASH_INVALID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_SCHEMA_RESTORE_SIGNED_HASH_INVALID_88",BACKEND,SEVERE_ERROR,88, getClassLoader());

  /**
   * All tests performed on schema backup %s from directory %s show that the archive appears to be valid
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> NOTE_SCHEMA_RESTORE_VERIFY_SUCCESSFUL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"NOTICE_SCHEMA_RESTORE_VERIFY_SUCCESSFUL_89",BACKEND,NOTICE,89, getClassLoader());

  /**
   * Schema backup %s was successfully restored from the archive in directory %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> NOTE_SCHEMA_RESTORE_SUCCESSFUL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"NOTICE_SCHEMA_RESTORE_SUCCESSFUL_90",BACKEND,NOTICE,90, getClassLoader());

  /**
   * The task defined in entry %s is invalid because it has an invalid state %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TASK_INVALID_STATE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASK_INVALID_STATE_91",BACKEND,SEVERE_ERROR,91, getClassLoader());

  /**
   * An error occurred while trying to parse the scheduled start time value %s from task entry %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TASK_CANNOT_PARSE_SCHEDULED_START_TIME =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASK_CANNOT_PARSE_SCHEDULED_START_TIME_92",BACKEND,SEVERE_ERROR,92, getClassLoader());

  /**
   * An error occurred while trying to parse the actual start time value %s from task entry %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TASK_CANNOT_PARSE_ACTUAL_START_TIME =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASK_CANNOT_PARSE_ACTUAL_START_TIME_93",BACKEND,SEVERE_ERROR,93, getClassLoader());

  /**
   * An error occurred while trying to parse the completion time value %s from task entry %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TASK_CANNOT_PARSE_COMPLETION_TIME =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASK_CANNOT_PARSE_COMPLETION_TIME_94",BACKEND,SEVERE_ERROR,94, getClassLoader());

  /**
   * Task entry %s is missing required attribute %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TASK_MISSING_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASK_MISSING_ATTR_95",BACKEND,SEVERE_ERROR,95, getClassLoader());

  /**
   * There are multiple instances of attribute %s in task entry %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TASK_MULTIPLE_ATTRS_FOR_TYPE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASK_MULTIPLE_ATTRS_FOR_TYPE_96",BACKEND,SEVERE_ERROR,96, getClassLoader());

  /**
   * There are no values for attribute %s in task entry %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TASK_NO_VALUES_FOR_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASK_NO_VALUES_FOR_ATTR_97",BACKEND,SEVERE_ERROR,97, getClassLoader());

  /**
   * There are multiple values for attribute %s in task entry %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TASK_MULTIPLE_VALUES_FOR_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASK_MULTIPLE_VALUES_FOR_ATTR_98",BACKEND,SEVERE_ERROR,98, getClassLoader());

  /**
   * An error occurred while executing the task defined in entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TASK_EXECUTE_FAILED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASK_EXECUTE_FAILED_99",BACKEND,SEVERE_ERROR,99, getClassLoader());

  /**
   * The provided recurring task entry does not contain attribute %s which is needed to hold the recurring task ID
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_RECURRINGTASK_NO_ID_ATTRIBUTE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_RECURRINGTASK_NO_ID_ATTRIBUTE_100",BACKEND,SEVERE_ERROR,100, getClassLoader());

  /**
   * The provided recurring task entry contains multiple attributes with type %s, which is used to hold the recurring task ID, but only a single instance is allowed
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_RECURRINGTASK_MULTIPLE_ID_TYPES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_RECURRINGTASK_MULTIPLE_ID_TYPES_101",BACKEND,SEVERE_ERROR,101, getClassLoader());

  /**
   * The provided recurring task entry does not contain any values for the %s attribute, which is used to specify the recurring task ID
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_RECURRINGTASK_NO_ID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_RECURRINGTASK_NO_ID_102",BACKEND,SEVERE_ERROR,102, getClassLoader());

  /**
   * The provided recurring task entry contains multiple values for the %s attribute, which is used to specify the recurring task ID, but only a single value is allowed
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_RECURRINGTASK_MULTIPLE_ID_VALUES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_RECURRINGTASK_MULTIPLE_ID_VALUES_103",BACKEND,SEVERE_ERROR,103, getClassLoader());

  /**
   * The provided recurring task entry does not contain attribute %s which is needed to specify recurring task schedule
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_RECURRINGTASK_NO_SCHEDULE_ATTRIBUTE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_RECURRINGTASK_NO_SCHEDULE_ATTRIBUTE_104",BACKEND,SEVERE_ERROR,104, getClassLoader());

  /**
   * The provided recurring task entry contains multiple attributes with type %s, which is used to hold recurring task schedule, but only a single instance is allowed
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_RECURRINGTASK_MULTIPLE_SCHEDULE_TYPES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_RECURRINGTASK_MULTIPLE_SCHEDULE_TYPES_105",BACKEND,SEVERE_ERROR,105, getClassLoader());

  /**
   * The provided recurring task entry does not contain any values for the %s attribute, which is used to specify recurring task schedule
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_RECURRINGTASK_NO_SCHEDULE_VALUES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_RECURRINGTASK_NO_SCHEDULE_VALUES_106",BACKEND,SEVERE_ERROR,106, getClassLoader());

  /**
   * The provided recurring task entry contains multiple values for the %s attribute, which is used to specify recurring task schedule, but only a single value is allowed
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_RECURRINGTASK_MULTIPLE_SCHEDULE_VALUES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_RECURRINGTASK_MULTIPLE_SCHEDULE_VALUES_107",BACKEND,SEVERE_ERROR,107, getClassLoader());

  /**
   * An error occurred while attempting to load class %s specified in attribute %s of the provided recurring task entry:  %s.  Does this class exist in the Directory Server classpath?
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_RECURRINGTASK_CANNOT_LOAD_CLASS =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_RECURRINGTASK_CANNOT_LOAD_CLASS_108",BACKEND,SEVERE_ERROR,108, getClassLoader());

  /**
   * An error occurred while trying to create an instance of class %s as a Directory Server task.  Is this class a subclass of %s?
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_RECURRINGTASK_CANNOT_INSTANTIATE_CLASS_AS_TASK =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_RECURRINGTASK_CANNOT_INSTANTIATE_CLASS_AS_TASK_109",BACKEND,SEVERE_ERROR,109, getClassLoader());

  /**
   * An error occurred while attempting to perform internal initialization on an instance of class %s with the information contained in the provided entry:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_RECURRINGTASK_CANNOT_INITIALIZE_INTERNAL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_RECURRINGTASK_CANNOT_INITIALIZE_INTERNAL_110",BACKEND,SEVERE_ERROR,110, getClassLoader());

  /**
   * The configuration entry provided when attempting to initialize the task backend was null
   */
  public static final MessageDescriptor.Arg0 ERR_TASKBE_CONFIG_ENTRY_NULL =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_TASKBE_CONFIG_ENTRY_NULL_111",BACKEND,SEVERE_ERROR,111, getClassLoader());

  /**
   * The task backend configuration entry does not contain any base DNs.  There must be exactly one base DN for task information in the Directory Server
   */
  public static final MessageDescriptor.Arg0 ERR_TASKBE_NO_BASE_DNS =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_TASKBE_NO_BASE_DNS_112",BACKEND,SEVERE_ERROR,112, getClassLoader());

  /**
   * The task backend configuration entry contains multiple base DNs.  There must be exactly one base DN for task information in the Directory Server
   */
  public static final MessageDescriptor.Arg0 ERR_TASKBE_MULTIPLE_BASE_DNS =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_TASKBE_MULTIPLE_BASE_DNS_113",BACKEND,SEVERE_ERROR,113, getClassLoader());

  /**
   * An error occurred while attempting to decode recurring task base %s as a DN:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TASKBE_CANNOT_DECODE_RECURRING_TASK_BASE_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASKBE_CANNOT_DECODE_RECURRING_TASK_BASE_DN_114",BACKEND,SEVERE_ERROR,114, getClassLoader());

  /**
   * An error occurred while attempting to decode scheduled task base %s as a DN:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TASKBE_CANNOT_DECODE_SCHEDULED_TASK_BASE_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASKBE_CANNOT_DECODE_SCHEDULED_TASK_BASE_DN_115",BACKEND,SEVERE_ERROR,115, getClassLoader());

  /**
   * Length of time in seconds that task information should be retained after processing on that task has completed.  Once this period has passed, the task information will be automatically removed to conserve memory and disk space
   */
  public static final MessageDescriptor.Arg0 INFO_TASKBE_DESCRIPTION_RETENTION_TIME =
          new MessageDescriptor.Arg0(BASE,"INFO_TASKBE_DESCRIPTION_RETENTION_TIME_116",BACKEND,INFORMATION,116, getClassLoader());

  /**
   * An unexpected error occurred while attempting to initialize the task retention time configuration:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASKBE_CANNOT_INITIALIZE_RETENTION_TIME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASKBE_CANNOT_INITIALIZE_RETENTION_TIME_117",BACKEND,SEVERE_ERROR,117, getClassLoader());

  /**
   * Path to the backing file for the task backend.  This LDIF file will hold all the configuration for the defined scheduled tasks and recurring tasks
   */
  public static final MessageDescriptor.Arg0 INFO_TASKBE_DESCRIPTION_BACKING_FILE =
          new MessageDescriptor.Arg0(BASE,"INFO_TASKBE_DESCRIPTION_BACKING_FILE_118",BACKEND,INFORMATION,118, getClassLoader());

  /**
   * An unexpected error occurred while attempting to initialize the task backing file configuration: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASKBE_CANNOT_INITIALIZE_BACKING_FILE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASKBE_CANNOT_INITIALIZE_BACKING_FILE_119",BACKEND,SEVERE_ERROR,119, getClassLoader());

  /**
   * The updated configuration entry does not have a value for the required %s attribute, which specifies the path to the task data backing file
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASKBE_NO_BACKING_FILE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASKBE_NO_BACKING_FILE_120",BACKEND,SEVERE_ERROR,120, getClassLoader());

  /**
   * The specified task data backing file %s already exists and the Directory Server will not attempt to overwrite it.  Please delete or rename the existing file before attempting to use that path for the new backing file, or choose a new path
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASKBE_BACKING_FILE_EXISTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASKBE_BACKING_FILE_EXISTS_121",BACKEND,SEVERE_ERROR,121, getClassLoader());

  /**
   * The specified path %s for the new task data backing file appears to be an invalid path.  Please choose a new path for the task data backing file
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASKBE_INVALID_BACKING_FILE_PATH =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASKBE_INVALID_BACKING_FILE_PATH_122",BACKEND,SEVERE_ERROR,122, getClassLoader());

  /**
   * The parent directory %s for the new task data backing file %s does not exist.  Please create this directory before attempting to use this path for the new backing file or choose a new path
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TASKBE_BACKING_FILE_MISSING_PARENT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASKBE_BACKING_FILE_MISSING_PARENT_123",BACKEND,SEVERE_ERROR,123, getClassLoader());

  /**
   * The parent directory %s for the new task data backing file %s exists but is not a directory. Please choose a new path for the task data backing file
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TASKBE_BACKING_FILE_PARENT_NOT_DIRECTORY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASKBE_BACKING_FILE_PARENT_NOT_DIRECTORY_124",BACKEND,SEVERE_ERROR,124, getClassLoader());

  /**
   * An error occurred while attempting to determine the new path to the task data backing file:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASKBE_ERROR_GETTING_BACKING_FILE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASKBE_ERROR_GETTING_BACKING_FILE_125",BACKEND,SEVERE_ERROR,125, getClassLoader());

  /**
   * The updated configuration entry does not have a value for the required %s attribute, which specifies the length of time in seconds that information about completed tasks should be retained before they are cleaned up
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASKBE_NO_RETENTION_TIME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASKBE_NO_RETENTION_TIME_126",BACKEND,SEVERE_ERROR,126, getClassLoader());

  /**
   * An error occurred while attempting to determine the completed task retention time:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASKBE_ERROR_GETTING_RETENTION_TIME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASKBE_ERROR_GETTING_RETENTION_TIME_127",BACKEND,SEVERE_ERROR,127, getClassLoader());

  /**
   * The completed task retention time has been updated to %d seconds.  This will take effect immediately
   */
  public static final MessageDescriptor.Arg1<Number> INFO_TASKBE_UPDATED_RETENTION_TIME =
          new MessageDescriptor.Arg1<Number>(BASE,"INFO_TASKBE_UPDATED_RETENTION_TIME_128",BACKEND,INFORMATION,128, getClassLoader());

  /**
   * The path to the task data backing file has been changed to %s.  A snapshot of the current task configuration has been written to that file and it will continue to be used for future updates
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_TASKBE_UPDATED_BACKING_FILE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_TASKBE_UPDATED_BACKING_FILE_129",BACKEND,INFORMATION,129, getClassLoader());

  /**
   * New entries in the task backend may only be added immediately below %s for scheduled tasks or immediately below %s for recurring tasks
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TASKBE_ADD_DISALLOWED_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASKBE_ADD_DISALLOWED_DN_130",BACKEND,SEVERE_ERROR,130, getClassLoader());

  /**
   * Modify DN operations are not supported in the task backend
   */
  public static final MessageDescriptor.Arg0 ERR_TASKBE_MODIFY_DN_NOT_SUPPORTED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_TASKBE_MODIFY_DN_NOT_SUPPORTED_131",BACKEND,SEVERE_ERROR,131, getClassLoader());

  /**
   * This file contains the data used by the Directory Server task scheduler backend.  Do not edit this file directly, as there is a risk that those changes will be lost.  Scheduled and recurring task definitions should only be edited using the administration utilities provided with the Directory Server
   */
  public static final MessageDescriptor.Arg0 INFO_TASKBE_BACKING_FILE_HEADER =
          new MessageDescriptor.Arg0(BASE,"INFO_TASKBE_BACKING_FILE_HEADER_132",BACKEND,INFORMATION,132, getClassLoader());

  /**
   * Unable to add recurring task %s to the task scheduler because another recurring task already exists with the same ID
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASKSCHED_DUPLICATE_RECURRING_ID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASKSCHED_DUPLICATE_RECURRING_ID_133",BACKEND,SEVERE_ERROR,133, getClassLoader());

  /**
   * Unable to schedule task %s because another task already exists with the same ID
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASKSCHED_DUPLICATE_TASK_ID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASKSCHED_DUPLICATE_TASK_ID_134",BACKEND,SEVERE_ERROR,134, getClassLoader());

  /**
   * Unable to add completed task %s to the task scheduler because another task already exists with the same ID
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_TASKSCHED_DUPLICATE_TASK_ID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_WARN_TASKSCHED_DUPLICATE_TASK_ID_135",BACKEND,MILD_WARNING,135, getClassLoader());

  /**
   * An error occurred while attempting to schedule the next iteration of recurring task %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TASKSCHED_ERROR_SCHEDULING_RECURRING_ITERATION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASKSCHED_ERROR_SCHEDULING_RECURRING_ITERATION_136",BACKEND,SEVERE_ERROR,136, getClassLoader());

  /**
   * An error occurred while attempting to read an entry from the tasks backing file %s on or near line %d:  %s.  This is not a fatal error, so the task scheduler will attempt to continue parsing the file and schedule any additional tasks that it contains
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,CharSequence> ERR_TASKSCHED_CANNOT_PARSE_ENTRY_RECOVERABLE =
          new MessageDescriptor.Arg3<CharSequence,Number,CharSequence>(BASE,"SEVERE_ERR_TASKSCHED_CANNOT_PARSE_ENTRY_RECOVERABLE_137",BACKEND,SEVERE_ERROR,137, getClassLoader());

  /**
   * An error occurred while attempting to read an entry from the tasks backing file %s on or near line %d:  %s.  This is an unrecoverable error, and parsing cannot continue
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,CharSequence> ERR_TASKSCHED_CANNOT_PARSE_ENTRY_FATAL =
          new MessageDescriptor.Arg3<CharSequence,Number,CharSequence>(BASE,"FATAL_ERR_TASKSCHED_CANNOT_PARSE_ENTRY_FATAL_138",BACKEND,FATAL_ERROR,138, getClassLoader());

  /**
   * Entry %s read from the tasks backing file is invalid because it has no parent and does not match the task root DN of %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TASKSCHED_ENTRY_HAS_NO_PARENT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASKSCHED_ENTRY_HAS_NO_PARENT_139",BACKEND,SEVERE_ERROR,139, getClassLoader());

  /**
   * An error occurred while attempting to parse entry %s as a recurring task and add it to the scheduler:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TASKSCHED_CANNOT_SCHEDULE_RECURRING_TASK_FROM_ENTRY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASKSCHED_CANNOT_SCHEDULE_RECURRING_TASK_FROM_ENTRY_140",BACKEND,SEVERE_ERROR,140, getClassLoader());

  /**
   * An error occurred while attempting to parse entry %s as a task and add it to the scheduler:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TASKSCHED_CANNOT_SCHEDULE_TASK_FROM_ENTRY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASKSCHED_CANNOT_SCHEDULE_TASK_FROM_ENTRY_141",BACKEND,SEVERE_ERROR,141, getClassLoader());

  /**
   * Entry %s read from the tasks backing file %s has a DN which is not valid for a task or recurring task definition and will be ignored
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TASKSCHED_INVALID_TASK_ENTRY_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASKSCHED_INVALID_TASK_ENTRY_DN_142",BACKEND,SEVERE_ERROR,142, getClassLoader());

  /**
   * An error occurred while attempting to read from the tasks data backing file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TASKSCHED_ERROR_READING_TASK_BACKING_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASKSCHED_ERROR_READING_TASK_BACKING_FILE_143",BACKEND,SEVERE_ERROR,143, getClassLoader());

  /**
   * An error occurred while attempting to create a new tasks backing file %s for use with the task scheduler:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TASKSCHED_CANNOT_CREATE_BACKING_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASKSCHED_CANNOT_CREATE_BACKING_FILE_144",BACKEND,SEVERE_ERROR,144, getClassLoader());

  /**
   * The provided task entry does not contain attribute %s which is needed to specify the fully-qualified name of the class providing the task logic
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASKSCHED_NO_CLASS_ATTRIBUTE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASKSCHED_NO_CLASS_ATTRIBUTE_145",BACKEND,SEVERE_ERROR,145, getClassLoader());

  /**
   * The provided task entry contains multiple attributes with type %s, which is used to hold the task class name, but only a single instance is allowed
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASKSCHED_MULTIPLE_CLASS_TYPES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASKSCHED_MULTIPLE_CLASS_TYPES_146",BACKEND,SEVERE_ERROR,146, getClassLoader());

  /**
   * The provided task entry does not contain any values for the %s attribute, which is used to specify the fully-qualified name of the class providing the task logic
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASKSCHED_NO_CLASS_VALUES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASKSCHED_NO_CLASS_VALUES_147",BACKEND,SEVERE_ERROR,147, getClassLoader());

  /**
   * The provided task entry contains multiple values for the %s attribute, which is used to specify the task class name, but only a single value is allowed
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASKSCHED_MULTIPLE_CLASS_VALUES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASKSCHED_MULTIPLE_CLASS_VALUES_148",BACKEND,SEVERE_ERROR,148, getClassLoader());

  /**
   * An error occurred while attempting to load class %s specified in attribute %s of the provided task entry:  %s. Does this class exist in the Directory Server classpath?
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_TASKSCHED_CANNOT_LOAD_CLASS =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASKSCHED_CANNOT_LOAD_CLASS_149",BACKEND,SEVERE_ERROR,149, getClassLoader());

  /**
   * An error occurred while trying to create an instance of class %s as a Directory Server task. Is this class a subclass of %s?
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TASKSCHED_CANNOT_INSTANTIATE_CLASS_AS_TASK =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASKSCHED_CANNOT_INSTANTIATE_CLASS_AS_TASK_150",BACKEND,SEVERE_ERROR,150, getClassLoader());

  /**
   * An error occurred while attempting to perform internal initialization on an instance of class %s with the information contained in the provided entry:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TASKSCHED_CANNOT_INITIALIZE_INTERNAL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASKSCHED_CANNOT_INITIALIZE_INTERNAL_151",BACKEND,SEVERE_ERROR,151, getClassLoader());

  /**
   * An error occurred while attempting to rename the current tasks backing file from %s to %s:  %s.  The previous task configuration (which does not reflect the latest update) may be lost
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> WARN_TASKSCHED_CANNOT_RENAME_CURRENT_BACKING_FILE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_WARN_TASKSCHED_CANNOT_RENAME_CURRENT_BACKING_FILE_152",BACKEND,SEVERE_WARNING,152, getClassLoader());

  /**
   * An error occurred while attempting to rename the new tasks backing file from %s to %s:  %s. If the Directory Server is restarted, then the task scheduler may not work as expected
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_TASKSCHED_CANNOT_RENAME_NEW_BACKING_FILE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASKSCHED_CANNOT_RENAME_NEW_BACKING_FILE_153",BACKEND,SEVERE_ERROR,153, getClassLoader());

  /**
   * An error occurred while attempting to write the new tasks data backing file %s:  %s.  Configuration information reflecting the latest update may be lost
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TASKSCHED_CANNOT_WRITE_BACKING_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASKSCHED_CANNOT_WRITE_BACKING_FILE_154",BACKEND,SEVERE_ERROR,154, getClassLoader());

  /**
   * The task backend does not support LDIF import operations
   */
  public static final MessageDescriptor.Arg0 ERR_TASKBE_IMPORT_NOT_SUPPORTED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_TASKBE_IMPORT_NOT_SUPPORTED_155",BACKEND,SEVERE_ERROR,155, getClassLoader());

  /**
   * The tasks backend is being shut down
   */
  public static final MessageDescriptor.Arg0 INFO_TASKBE_INTERRUPTED_BY_SHUTDOWN =
          new MessageDescriptor.Arg0(BASE,"INFO_TASKBE_INTERRUPTED_BY_SHUTDOWN_156",BACKEND,INFORMATION,156, getClassLoader());

  /**
   * Indicates whether all attributes in the root DSE should be treated like user attributes (and therefore returned to clients by default) regardless of the Directory Server schema configuration
   */
  public static final MessageDescriptor.Arg0 INFO_ROOTDSE_DESCRIPTION_SHOW_ALL_ATTRIBUTES =
          new MessageDescriptor.Arg0(BASE,"INFO_ROOTDSE_DESCRIPTION_SHOW_ALL_ATTRIBUTES_157",BACKEND,INFORMATION,157, getClassLoader());

  /**
   * An error occurred while trying to determine the value of the %s configuration attribute, which controls whether to treat all root DSE attributes like user attributes:  %s. The attributes in the root DSE will be treated based on their definition in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ROOTDSE_CANNOT_DETERMINE_ALL_USER_ATTRIBUTES =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_ROOTDSE_CANNOT_DETERMINE_ALL_USER_ATTRIBUTES_158",BACKEND,SEVERE_ERROR,158, getClassLoader());

  /**
   * The root DSE configuration has been updated so that configuration attribute %s will now use a value of %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_ROOTDSE_UPDATED_SHOW_ALL_ATTRS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_ROOTDSE_UPDATED_SHOW_ALL_ATTRS_159",BACKEND,INFORMATION,159, getClassLoader());

  /**
   * Unable to remove recurring task %s because there is already a scheduled iteration of that task with ID %s that must be removed first
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TASKSCHED_REMOVE_RECURRING_EXISTING_ITERATION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASKSCHED_REMOVE_RECURRING_EXISTING_ITERATION_160",BACKEND,SEVERE_ERROR,160, getClassLoader());

  /**
   * Unable to remove pending task %s because no such task exists
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASKSCHED_REMOVE_PENDING_NO_SUCH_TASK =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASKSCHED_REMOVE_PENDING_NO_SUCH_TASK_161",BACKEND,SEVERE_ERROR,161, getClassLoader());

  /**
   * Unable to remove pending task %s because the task is no longer pending
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASKSCHED_REMOVE_PENDING_NOT_PENDING =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASKSCHED_REMOVE_PENDING_NOT_PENDING_162",BACKEND,SEVERE_ERROR,162, getClassLoader());

  /**
   * Unable to remove completed task %s because no such task exists in the list of completed tasks
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASKSCHED_REMOVE_COMPLETED_NO_SUCH_TASK =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASKSCHED_REMOVE_COMPLETED_NO_SUCH_TASK_163",BACKEND,SEVERE_ERROR,163, getClassLoader());

  /**
   * Unable to remove entry %s from the task backend because its DN is either not appropriate for that backend or it is not below the scheduled or recurring tasks base entry
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASKBE_DELETE_INVALID_ENTRY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASKBE_DELETE_INVALID_ENTRY_164",BACKEND,SEVERE_ERROR,164, getClassLoader());

  /**
   * Unable to remove entry %s from the task backend because there is no scheduled task associated with that entry DN
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASKBE_DELETE_NO_SUCH_TASK =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASKBE_DELETE_NO_SUCH_TASK_165",BACKEND,SEVERE_ERROR,165, getClassLoader());

  /**
   * Unable to delete entry %s from the task backend because the associated task is currently running
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASKBE_DELETE_RUNNING =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASKBE_DELETE_RUNNING_166",BACKEND,SEVERE_ERROR,166, getClassLoader());

  /**
   * Unable to remove entry %s from the task backend because there is no recurring task associated with that entry DN
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASKBE_DELETE_NO_SUCH_RECURRING_TASK =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASKBE_DELETE_NO_SUCH_RECURRING_TASK_167",BACKEND,SEVERE_ERROR,167, getClassLoader());

  /**
   * Unable to process the search operation in the task backend because the provided base DN %s is not valid for entries in the task backend
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASKBE_SEARCH_INVALID_BASE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASKBE_SEARCH_INVALID_BASE_168",BACKEND,SEVERE_ERROR,168, getClassLoader());

  /**
   * Unable to process the search operation in the task backend because there is no scheduled task associated with the provided search base entry %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASKBE_SEARCH_NO_SUCH_TASK =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASKBE_SEARCH_NO_SUCH_TASK_169",BACKEND,SEVERE_ERROR,169, getClassLoader());

  /**
   * Unable to process the search operation in the task backend because there is no recurring task associated with the provided search base entry %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASKBE_SEARCH_NO_SUCH_RECURRING_TASK =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASKBE_SEARCH_NO_SUCH_RECURRING_TASK_170",BACKEND,SEVERE_ERROR,170, getClassLoader());

  /**
   * Unable to initialize the backup backend because the provided configuration entry is null
   */
  public static final MessageDescriptor.Arg0 ERR_BACKUP_CONFIG_ENTRY_NULL =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_BACKUP_CONFIG_ENTRY_NULL_171",BACKEND,SEVERE_ERROR,171, getClassLoader());

  /**
   * Unable to initialize the backup backend because an error occurred while attempting to decode the base DN for the backend:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_BACKUP_CANNOT_DECODE_BACKUP_ROOT_DN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_BACKUP_CANNOT_DECODE_BACKUP_ROOT_DN_172",BACKEND,SEVERE_ERROR,172, getClassLoader());

  /**
   * Set of directories that will be accessed by default for search operations in the backup backend. Backup directories not in this list may still be accessed by directly specifying the backup directory in the search base DN.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_BACKUP_DESCRIPTION_BACKUP_DIR_LIST =
          new MessageDescriptor.Arg0(BASE,"INFO_BACKUP_DESCRIPTION_BACKUP_DIR_LIST_173",BACKEND,INFORMATION,173, getClassLoader());

  /**
   * An error occurred while attempting to determine the backup directory list:  %s.  Initialization of the backup backend cannot continue
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_BACKUP_CANNOT_DETERMINE_BACKUP_DIR_LIST =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_BACKUP_CANNOT_DETERMINE_BACKUP_DIR_LIST_174",BACKEND,SEVERE_ERROR,174, getClassLoader());

  /**
   * Unable to retrieve an entry from the backup backend because the requested entry was null
   */
  public static final MessageDescriptor.Arg0 ERR_BACKUP_GET_ENTRY_NULL =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_BACKUP_GET_ENTRY_NULL_175",BACKEND,SEVERE_ERROR,175, getClassLoader());

  /**
   * Requested entry %s does not exist in the backup backend
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_BACKUP_INVALID_BASE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_BACKUP_INVALID_BASE_176",BACKEND,SEVERE_ERROR,176, getClassLoader());

  /**
   * Unable to retrieve entry %s from the backup backend because the requested DN is one level below the base DN but does not specify a backup directory
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_BACKUP_DN_DOES_NOT_SPECIFY_DIRECTORY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_BACKUP_DN_DOES_NOT_SPECIFY_DIRECTORY_177",BACKEND,SEVERE_ERROR,177, getClassLoader());

  /**
   * Unable to retrieve entry %s from the backup backend because the requested backup directory is invalid: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_BACKUP_INVALID_BACKUP_DIRECTORY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_BACKUP_INVALID_BACKUP_DIRECTORY_178",BACKEND,SEVERE_ERROR,178, getClassLoader());

  /**
   * An error occurred while attempting to examine the requested backup directory:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_BACKUP_ERROR_GETTING_BACKUP_DIRECTORY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_BACKUP_ERROR_GETTING_BACKUP_DIRECTORY_179",BACKEND,SEVERE_ERROR,179, getClassLoader());

  /**
   * Unable to retrieve entry %s from the backup backend because the requested DN is two levels below the base DN but does not specify a backup ID
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_BACKUP_NO_BACKUP_ID_IN_DN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_BACKUP_NO_BACKUP_ID_IN_DN_180",BACKEND,SEVERE_ERROR,180, getClassLoader());

  /**
   * Unable to retrieve entry %s from the backup backend because it does not have a parent
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_BACKUP_NO_BACKUP_PARENT_DN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_BACKUP_NO_BACKUP_PARENT_DN_181",BACKEND,SEVERE_ERROR,181, getClassLoader());

  /**
   * Unable to retrieve entry %s from the backup backend because the DN does not contain the backup directory in which the requested backup should reside
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_BACKUP_NO_BACKUP_DIR_IN_DN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_BACKUP_NO_BACKUP_DIR_IN_DN_182",BACKEND,SEVERE_ERROR,182, getClassLoader());

  /**
   * Backup %s does not exist in backup directory %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_BACKUP_NO_SUCH_BACKUP =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_BACKUP_NO_SUCH_BACKUP_183",BACKEND,SEVERE_ERROR,183, getClassLoader());

  /**
   * Add operations are not supported in the backup backend
   */
  public static final MessageDescriptor.Arg0 ERR_BACKUP_ADD_NOT_SUPPORTED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_BACKUP_ADD_NOT_SUPPORTED_184",BACKEND,SEVERE_ERROR,184, getClassLoader());

  /**
   * Delete operations are not supported in the backup backend
   */
  public static final MessageDescriptor.Arg0 ERR_BACKUP_DELETE_NOT_SUPPORTED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_BACKUP_DELETE_NOT_SUPPORTED_185",BACKEND,SEVERE_ERROR,185, getClassLoader());

  /**
   * Modify operations are not supported in the backup backend
   */
  public static final MessageDescriptor.Arg0 ERR_BACKUP_MODIFY_NOT_SUPPORTED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_BACKUP_MODIFY_NOT_SUPPORTED_186",BACKEND,SEVERE_ERROR,186, getClassLoader());

  /**
   * Modify DN operations are not supported in the backup backend
   */
  public static final MessageDescriptor.Arg0 ERR_BACKUP_MODIFY_DN_NOT_SUPPORTED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_BACKUP_MODIFY_DN_NOT_SUPPORTED_187",BACKEND,SEVERE_ERROR,187, getClassLoader());

  /**
   * The requested entry %s does not exist in the backup backend
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_BACKUP_NO_SUCH_ENTRY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_BACKUP_NO_SUCH_ENTRY_188",BACKEND,SEVERE_ERROR,188, getClassLoader());

  /**
   * LDIF export operations are not supported in the backup backend
   */
  public static final MessageDescriptor.Arg0 ERR_BACKUP_EXPORT_NOT_SUPPORTED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_BACKUP_EXPORT_NOT_SUPPORTED_189",BACKEND,SEVERE_ERROR,189, getClassLoader());

  /**
   * LDIF import operations are not supported in the backup backend
   */
  public static final MessageDescriptor.Arg0 ERR_BACKUP_IMPORT_NOT_SUPPORTED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_BACKUP_IMPORT_NOT_SUPPORTED_190",BACKEND,SEVERE_ERROR,190, getClassLoader());

  /**
   * Backup and restore operations are not supported in the backup backend
   */
  public static final MessageDescriptor.Arg0 ERR_BACKUP_BACKUP_AND_RESTORE_NOT_SUPPORTED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_BACKUP_BACKUP_AND_RESTORE_NOT_SUPPORTED_191",BACKEND,SEVERE_ERROR,191, getClassLoader());

  /**
   * Exactly one base DN must be provided for use with the memory-based backend
   */
  public static final MessageDescriptor.Arg0 ERR_MEMORYBACKEND_REQUIRE_EXACTLY_ONE_BASE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_MEMORYBACKEND_REQUIRE_EXACTLY_ONE_BASE_192",BACKEND,SEVERE_ERROR,192, getClassLoader());

  /**
   * Entry %s already exists in the memory-based backend
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MEMORYBACKEND_ENTRY_ALREADY_EXISTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_MEMORYBACKEND_ENTRY_ALREADY_EXISTS_193",BACKEND,SEVERE_ERROR,193, getClassLoader());

  /**
   * Entry %s does not belong in the memory-based backend
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MEMORYBACKEND_ENTRY_DOESNT_BELONG =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_MEMORYBACKEND_ENTRY_DOESNT_BELONG_194",BACKEND,SEVERE_ERROR,194, getClassLoader());

  /**
   * Unable to add entry %s because its parent entry %s does not exist in the memory-based backend
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MEMORYBACKEND_PARENT_DOESNT_EXIST =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_MEMORYBACKEND_PARENT_DOESNT_EXIST_195",BACKEND,SEVERE_ERROR,195, getClassLoader());

  /**
   * Entry %s does not exist in the memory-based backend
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MEMORYBACKEND_ENTRY_DOESNT_EXIST =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_MEMORYBACKEND_ENTRY_DOESNT_EXIST_196",BACKEND,SEVERE_ERROR,196, getClassLoader());

  /**
   * Cannot delete entry %s because it has one or more subordinate entries
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MEMORYBACKEND_CANNOT_DELETE_ENTRY_WITH_CHILDREN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_MEMORYBACKEND_CANNOT_DELETE_ENTRY_WITH_CHILDREN_197",BACKEND,SEVERE_ERROR,197, getClassLoader());

  /**
   * Modify DN operations are not supported in the memory-based backend
   */
  public static final MessageDescriptor.Arg0 ERR_MEMORYBACKEND_MODDN_NOT_SUPPORTED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_MEMORYBACKEND_MODDN_NOT_SUPPORTED_198",BACKEND,SEVERE_ERROR,198, getClassLoader());

  /**
   * Unable to create an LDIF writer:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MEMORYBACKEND_CANNOT_CREATE_LDIF_WRITER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_MEMORYBACKEND_CANNOT_CREATE_LDIF_WRITER_199",BACKEND,SEVERE_ERROR,199, getClassLoader());

  /**
   * Cannot write entry %s to LDIF:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MEMORYBACKEND_CANNOT_WRITE_ENTRY_TO_LDIF =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_MEMORYBACKEND_CANNOT_WRITE_ENTRY_TO_LDIF_200",BACKEND,SEVERE_ERROR,200, getClassLoader());

  /**
   * Unable to create an LDIF reader:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MEMORYBACKEND_CANNOT_CREATE_LDIF_READER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_MEMORYBACKEND_CANNOT_CREATE_LDIF_READER_201",BACKEND,SEVERE_ERROR,201, getClassLoader());

  /**
   * An unrecoverable error occurred while reading from LDIF:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MEMORYBACKEND_ERROR_READING_LDIF =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_MEMORYBACKEND_ERROR_READING_LDIF_202",BACKEND,SEVERE_ERROR,202, getClassLoader());

  /**
   * An unexpected error occurred while processing the import:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MEMORYBACKEND_ERROR_DURING_IMPORT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_MEMORYBACKEND_ERROR_DURING_IMPORT_203",BACKEND,SEVERE_ERROR,203, getClassLoader());

  /**
   * The memory-based backend does not support backup or restore operations
   */
  public static final MessageDescriptor.Arg0 ERR_MEMORYBACKEND_BACKUP_RESTORE_NOT_SUPPORTED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_MEMORYBACKEND_BACKUP_RESTORE_NOT_SUPPORTED_204",BACKEND,SEVERE_ERROR,204, getClassLoader());

  /**
   * Cannot rename entry %s because it has one or more subordinate entries
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MEMORYBACKEND_CANNOT_RENAME_ENRY_WITH_CHILDREN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_MEMORYBACKEND_CANNOT_RENAME_ENRY_WITH_CHILDREN_205",BACKEND,SEVERE_ERROR,205, getClassLoader());

  /**
   * Cannot rename entry %s because the target entry is in a different backend
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MEMORYBACKEND_CANNOT_RENAME_TO_ANOTHER_BACKEND =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_MEMORYBACKEND_CANNOT_RENAME_TO_ANOTHER_BACKEND_206",BACKEND,SEVERE_ERROR,206, getClassLoader());

  /**
   * Cannot rename entry %s because the new parent entry %s doesn't exist
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MEMORYBACKEND_RENAME_PARENT_DOESNT_EXIST =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_MEMORYBACKEND_RENAME_PARENT_DOESNT_EXIST_207",BACKEND,SEVERE_ERROR,207, getClassLoader());

  /**
   * Indicates whether to treat attributes in the subschema entry as user attributes even if they are marked operational.  This may provide compatibility with some applications that expect schema attributes like attributeType and objectClasses to be included by default even if they are not requested.  Note that the ldapSyntaxes attribute will always be treated as operational in order to avoid problems with attempts to modify the schema over protocol
   */
  public static final MessageDescriptor.Arg0 INFO_SCHEMA_DESCRIPTION_SHOW_ALL_ATTRIBUTES =
          new MessageDescriptor.Arg0(BASE,"INFO_SCHEMA_DESCRIPTION_SHOW_ALL_ATTRIBUTES_208",BACKEND,INFORMATION,208, getClassLoader());

  /**
   * An error occurred while trying to determine whether to treat all subschema entry attributes as user attributes regardless of the way they are defined in the schema, as specified in the ds-cfg-show-all-attributes attribute of configuration entry %s:  %s. The default behavior, which is to treat the attribute types as defined in the server schema, will be used
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_CANNOT_DETERMINE_SHOW_ALL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_SCHEMA_CANNOT_DETERMINE_SHOW_ALL_209",BACKEND,SEVERE_ERROR,209, getClassLoader());

  /**
   * An error occurred while attempting to register base DN %s in the Directory Server:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_BACKEND_CANNOT_REGISTER_BASEDN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"FATAL_ERR_BACKEND_CANNOT_REGISTER_BASEDN_210",BACKEND,FATAL_ERROR,210, getClassLoader());

  /**
   * The schema backend does not currently support removing existing schema elements
   */
  public static final MessageDescriptor.Arg0 ERR_SCHEMA_DELETE_MODTYPE_NOT_SUPPORTED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_SCHEMA_DELETE_MODTYPE_NOT_SUPPORTED_211",BACKEND,MILD_ERROR,211, getClassLoader());

  /**
   * The schema backend does not support the %s modification type
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SCHEMA_INVALID_MODIFICATION_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SCHEMA_INVALID_MODIFICATION_TYPE_212",BACKEND,MILD_ERROR,212, getClassLoader());

  /**
   * The schema backend does not support the modification of the %s attribute type.  Only attribute types, object classes, ldap syntaxes, name forms, DIT content rules, DIT structure rules, and matching rule uses may be modified
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SCHEMA_MODIFY_UNSUPPORTED_ATTRIBUTE_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_UNSUPPORTED_ATTRIBUTE_TYPE_213",BACKEND,MILD_ERROR,213, getClassLoader());

  /**
   * An error occurred while attempting to decode the attribute type "%s":  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_CANNOT_DECODE_ATTRTYPE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_CANNOT_DECODE_ATTRTYPE_214",BACKEND,MILD_ERROR,214, getClassLoader());

  /**
   * Unable to add attribute type  %s to the server schema because there is an existing attribute type with a conflicting name or OID:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_ATTRTYPE_ALREADY_EXISTS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_ATTRTYPE_ALREADY_EXISTS_215",BACKEND,MILD_ERROR,215, getClassLoader());

  /**
   * An error occurred while attempting to decode the object class "%s":  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_CANNOT_DECODE_OBJECTCLASS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_CANNOT_DECODE_OBJECTCLASS_216",BACKEND,MILD_ERROR,216, getClassLoader());

  /**
   * Unable to add objectclass %s because its superior class of %s is not defined in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_UNDEFINED_SUPERIOR_OBJECTCLASS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_UNDEFINED_SUPERIOR_OBJECTCLASS_217",BACKEND,MILD_ERROR,217, getClassLoader());

  /**
   * Unable to add objectclass %s because it requires attribute %s which is not defined in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_OC_UNDEFINED_REQUIRED_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_OC_UNDEFINED_REQUIRED_ATTR_218",BACKEND,MILD_ERROR,218, getClassLoader());

  /**
   * Unable to add objectclass %s because it allows attribute %s which is not defined in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_OC_UNDEFINED_OPTIONAL_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_OC_UNDEFINED_OPTIONAL_ATTR_219",BACKEND,MILD_ERROR,219, getClassLoader());

  /**
   * Unable to add objectclass %s to the server schema because there is an existing objectclass with a conflicting name or OID:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_OBJECTCLASS_ALREADY_EXISTS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_OBJECTCLASS_ALREADY_EXISTS_220",BACKEND,MILD_ERROR,220, getClassLoader());

  /**
   * An error occurred while attempting to read the contents of schema file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_CANNOT_READ_EXISTING_USER_SCHEMA =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_CANNOT_READ_EXISTING_USER_SCHEMA_221",BACKEND,MILD_ERROR,221, getClassLoader());

  /**
   * An error occurred while attempting to write the updated schema:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SCHEMA_MODIFY_CANNOT_WRITE_NEW_SCHEMA =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_CANNOT_WRITE_NEW_SCHEMA_222",BACKEND,MILD_ERROR,222, getClassLoader());

  /**
   * An error occurred while attempting to decode the name form "%s":  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_CANNOT_DECODE_NAME_FORM =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_CANNOT_DECODE_NAME_FORM_223",BACKEND,MILD_ERROR,223, getClassLoader());

  /**
   * An error occurred while attempting to decode the DIT content rule "%s":  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_CANNOT_DECODE_DCR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_CANNOT_DECODE_DCR_224",BACKEND,MILD_ERROR,224, getClassLoader());

  /**
   * An error occurred while attempting to decode the DIT structure rule "%s":  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_CANNOT_DECODE_DSR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_CANNOT_DECODE_DSR_225",BACKEND,MILD_ERROR,225, getClassLoader());

  /**
   * An error occurred while attempting to decode the matching rule use "%s":  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_CANNOT_DECODE_MR_USE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_CANNOT_DECODE_MR_USE_226",BACKEND,MILD_ERROR,226, getClassLoader());

  /**
   * The server will not allow removing all values for the %s attribute type in the server schema
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SCHEMA_MODIFY_DELETE_NO_VALUES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_DELETE_NO_VALUES_227",BACKEND,MILD_ERROR,227, getClassLoader());

  /**
   * Unable to add attribute type %s because it conflicts with multiple existing attribute types (%s and %s)
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SCHEMA_MODIFY_MULTIPLE_CONFLICTS_FOR_ADD_ATTRTYPE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_MULTIPLE_CONFLICTS_FOR_ADD_ATTRTYPE_228",BACKEND,MILD_ERROR,228, getClassLoader());

  /**
   * Unable to add attribute type %s because it references superior attribute type %s which is not defined in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_UNDEFINED_SUPERIOR_ATTRIBUTE_TYPE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_UNDEFINED_SUPERIOR_ATTRIBUTE_TYPE_229",BACKEND,MILD_ERROR,229, getClassLoader());

  /**
   * Unable to add objectclass %s because it conflicts with multiple existing objectclasses (%s and %s)
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SCHEMA_MODIFY_MULTIPLE_CONFLICTS_FOR_ADD_OBJECTCLASS =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_MULTIPLE_CONFLICTS_FOR_ADD_OBJECTCLASS_230",BACKEND,MILD_ERROR,230, getClassLoader());

  /**
   * Unable to add name form %s because it conflicts with multiple existing name forms (%s and %s)
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SCHEMA_MODIFY_MULTIPLE_CONFLICTS_FOR_ADD_NAME_FORM =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_MULTIPLE_CONFLICTS_FOR_ADD_NAME_FORM_231",BACKEND,MILD_ERROR,231, getClassLoader());

  /**
   * Unable to add name form %s because it references structural objectclass %s which is not defined in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_NF_UNDEFINED_STRUCTURAL_OC =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_NF_UNDEFINED_STRUCTURAL_OC_232",BACKEND,MILD_ERROR,232, getClassLoader());

  /**
   * Unable to add name form %s because it references required attribute type %s which is not defined in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_NF_UNDEFINED_REQUIRED_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_NF_UNDEFINED_REQUIRED_ATTR_233",BACKEND,MILD_ERROR,233, getClassLoader());

  /**
   * Unable to add name form %s because it references optional attribute type %s which is not defined in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_NF_UNDEFINED_OPTIONAL_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_NF_UNDEFINED_OPTIONAL_ATTR_234",BACKEND,MILD_ERROR,234, getClassLoader());

  /**
   * Unable to add DIT content rule %s because it conflicts with multiple existing DIT content rules (%s and %s)
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SCHEMA_MODIFY_MULTIPLE_CONFLICTS_FOR_ADD_DCR =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_MULTIPLE_CONFLICTS_FOR_ADD_DCR_235",BACKEND,MILD_ERROR,235, getClassLoader());

  /**
   * Unable to add DIT content rule %s because it references structural objectclass %s which is already associated with another DIT content rule %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SCHEMA_MODIFY_STRUCTURAL_OC_CONFLICT_FOR_ADD_DCR =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_STRUCTURAL_OC_CONFLICT_FOR_ADD_DCR_236",BACKEND,MILD_ERROR,236, getClassLoader());

  /**
   * Unable to add DIT content rule %s because it references structural objectclass %s which is not defined in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_DCR_UNDEFINED_STRUCTURAL_OC =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_DCR_UNDEFINED_STRUCTURAL_OC_237",BACKEND,MILD_ERROR,237, getClassLoader());

  /**
   * Unable to add DIT content rule %s because it references auxiliary objectclass %s which is not defined in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_DCR_UNDEFINED_AUXILIARY_OC =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_DCR_UNDEFINED_AUXILIARY_OC_238",BACKEND,MILD_ERROR,238, getClassLoader());

  /**
   * Unable to add DIT content rule %s because it references required attribute type %s which is not defined in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_DCR_UNDEFINED_REQUIRED_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_DCR_UNDEFINED_REQUIRED_ATTR_239",BACKEND,MILD_ERROR,239, getClassLoader());

  /**
   * Unable to add DIT content rule %s because it references optional attribute type %s which is not defined in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_DCR_UNDEFINED_OPTIONAL_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_DCR_UNDEFINED_OPTIONAL_ATTR_240",BACKEND,MILD_ERROR,240, getClassLoader());

  /**
   * Unable to add DIT content rule %s because it references prohibited attribute type %s which is not defined in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_DCR_UNDEFINED_PROHIBITED_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_DCR_UNDEFINED_PROHIBITED_ATTR_241",BACKEND,MILD_ERROR,241, getClassLoader());

  /**
   * Unable to add DIT structure rule %s because it conflicts with multiple existing DIT structure rules (%s and %s)
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SCHEMA_MODIFY_MULTIPLE_CONFLICTS_FOR_ADD_DSR =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_MULTIPLE_CONFLICTS_FOR_ADD_DSR_242",BACKEND,MILD_ERROR,242, getClassLoader());

  /**
   * Unable to add DIT structure rule %s because it references name form %s which is already associated with another DIT structure rule %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SCHEMA_MODIFY_NAME_FORM_CONFLICT_FOR_ADD_DSR =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_NAME_FORM_CONFLICT_FOR_ADD_DSR_243",BACKEND,MILD_ERROR,243, getClassLoader());

  /**
   * Unable to add DIT structure rule %s because it references name form %s which is not defined in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_DSR_UNDEFINED_NAME_FORM =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_DSR_UNDEFINED_NAME_FORM_244",BACKEND,MILD_ERROR,244, getClassLoader());

  /**
   * Unable to add matching rule use %s because it conflicts with multiple existing matching rule uses (%s and %s)
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SCHEMA_MODIFY_MULTIPLE_CONFLICTS_FOR_ADD_MR_USE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_MULTIPLE_CONFLICTS_FOR_ADD_MR_USE_245",BACKEND,MILD_ERROR,245, getClassLoader());

  /**
   * Unable to add matching rule use %s because it references matching rule %s which is already associated with another matching rule use %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SCHEMA_MODIFY_MR_CONFLICT_FOR_ADD_MR_USE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_MR_CONFLICT_FOR_ADD_MR_USE_246",BACKEND,MILD_ERROR,246, getClassLoader());

  /**
   * Unable to add matching rule use %s because it references attribute type %s which is not defined in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_MRU_UNDEFINED_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_MRU_UNDEFINED_ATTR_247",BACKEND,MILD_ERROR,247, getClassLoader());

  /**
   * Circular reference detected for attribute type %s in which the superior type chain references the attribute type itself
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SCHEMA_MODIFY_CIRCULAR_REFERENCE_AT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_CIRCULAR_REFERENCE_AT_248",BACKEND,MILD_ERROR,248, getClassLoader());

  /**
   * Circular reference detected for objectclass %s in which the superior class chain references the objectclass itself
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SCHEMA_MODIFY_CIRCULAR_REFERENCE_OC =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_CIRCULAR_REFERENCE_OC_249",BACKEND,MILD_ERROR,249, getClassLoader());

  /**
   * Circular reference detected for DIT structure rule %s in which the superior rule chain references the DIT structure rule itself
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SCHEMA_MODIFY_CIRCULAR_REFERENCE_DSR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_CIRCULAR_REFERENCE_DSR_250",BACKEND,MILD_ERROR,250, getClassLoader());

  /**
   * An error occurred while attempting to create copies of the existing schema files before applying the updates:  %s.  The server was able to restore the original schema configuration, so no additional cleanup should be required
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SCHEMA_MODIFY_CANNOT_WRITE_ORIG_FILES_CLEANED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_CANNOT_WRITE_ORIG_FILES_CLEANED_251",BACKEND,MILD_ERROR,251, getClassLoader());

  /**
   * An error occurred while attempting to create copies of the existing schema files before applying the updates:  %s.  A problem also occurred when attempting to restore the original schema configuration, so the server may be left in an inconsistent state and could require manual cleanup
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SCHEMA_MODIFY_CANNOT_WRITE_ORIG_FILES_NOT_CLEANED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_CANNOT_WRITE_ORIG_FILES_NOT_CLEANED_252",BACKEND,MILD_ERROR,252, getClassLoader());

  /**
   * An error occurred while attempting to write new versions of the server schema files:  %s.   The server was able to restore the original schema configuration, so no additional cleanup should be required
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SCHEMA_MODIFY_CANNOT_WRITE_NEW_FILES_RESTORED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_CANNOT_WRITE_NEW_FILES_RESTORED_253",BACKEND,MILD_ERROR,253, getClassLoader());

  /**
   * An error occurred while attempting to write new versions of the server schema files: %s.  A problem also occurred when attempting to restore the original schema configuration, so the server may be left in an inconsistent state and could require manual cleanup
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SCHEMA_MODIFY_CANNOT_WRITE_NEW_FILES_NOT_RESTORED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_CANNOT_WRITE_NEW_FILES_NOT_RESTORED_254",BACKEND,MILD_ERROR,254, getClassLoader());

  /**
   * Unable to remove attribute type %s from the server schema because no such attribute type is defined
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SCHEMA_MODIFY_REMOVE_NO_SUCH_ATTRIBUTE_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_REMOVE_NO_SUCH_ATTRIBUTE_TYPE_255",BACKEND,MILD_ERROR,255, getClassLoader());

  /**
   * Unable to remove attribute type %s from the server schema because it is referenced as the superior type for attribute type %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_REMOVE_AT_SUPERIOR_TYPE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_REMOVE_AT_SUPERIOR_TYPE_256",BACKEND,MILD_ERROR,256, getClassLoader());

  /**
   * Unable to remove attribute type %s from the server schema because it is referenced as a required or optional attribute type in objectclass %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_REMOVE_AT_IN_OC =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_REMOVE_AT_IN_OC_257",BACKEND,MILD_ERROR,257, getClassLoader());

  /**
   * Unable to remove attribute type %s from the server schema because it is referenced as a required or optional attribute type in name form %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_REMOVE_AT_IN_NF =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_REMOVE_AT_IN_NF_258",BACKEND,MILD_ERROR,258, getClassLoader());

  /**
   * Unable to remove attribute type %s from the server schema because it is referenced as a required, optional, or prohibited attribute type in DIT content rule %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_REMOVE_AT_IN_DCR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_REMOVE_AT_IN_DCR_259",BACKEND,MILD_ERROR,259, getClassLoader());

  /**
   * Unable to remove attribute type %s from the server schema because it is referenced by matching rule use %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_REMOVE_AT_IN_MR_USE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_REMOVE_AT_IN_MR_USE_260",BACKEND,MILD_ERROR,260, getClassLoader());

  /**
   * Unable to remove objectclass %s from the server schema because no such objectclass is defined
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SCHEMA_MODIFY_REMOVE_NO_SUCH_OBJECTCLASS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_REMOVE_NO_SUCH_OBJECTCLASS_261",BACKEND,MILD_ERROR,261, getClassLoader());

  /**
   * Unable to remove objectclass %s from the server schema because it is referenced as the superior class for objectclass %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_REMOVE_OC_SUPERIOR_CLASS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_REMOVE_OC_SUPERIOR_CLASS_262",BACKEND,MILD_ERROR,262, getClassLoader());

  /**
   * Unable to remove objectclass %s from the server schema because it is referenced as the structural class for name form %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_REMOVE_OC_IN_NF =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_REMOVE_OC_IN_NF_263",BACKEND,MILD_ERROR,263, getClassLoader());

  /**
   * Unable to remove objectclass %s from the server schema because it is referenced as a structural or auxiliary class for DIT content rule %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_REMOVE_OC_IN_DCR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_REMOVE_OC_IN_DCR_264",BACKEND,MILD_ERROR,264, getClassLoader());

  /**
   * Unable to remove name form %s from the server schema because no such name form is defined
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SCHEMA_MODIFY_REMOVE_NO_SUCH_NAME_FORM =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_REMOVE_NO_SUCH_NAME_FORM_265",BACKEND,MILD_ERROR,265, getClassLoader());

  /**
   * Unable to remove name form %s from the server schema because it is referenced by DIT structure rule %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_REMOVE_NF_IN_DSR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_REMOVE_NF_IN_DSR_266",BACKEND,MILD_ERROR,266, getClassLoader());

  /**
   * Unable to remove DIT content rule %s from the server schema because no such DIT content rule is defined
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SCHEMA_MODIFY_REMOVE_NO_SUCH_DCR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_REMOVE_NO_SUCH_DCR_267",BACKEND,MILD_ERROR,267, getClassLoader());

  /**
   * Unable to remove DIT structure rule %s from the server schema because no such DIT structure rule is defined
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SCHEMA_MODIFY_REMOVE_NO_SUCH_DSR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_REMOVE_NO_SUCH_DSR_268",BACKEND,MILD_ERROR,268, getClassLoader());

  /**
   * Unable to remove DIT structure rule %s from the server schema because it is referenced as a superior rule for DIT structure rule %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_REMOVE_DSR_SUPERIOR_RULE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_REMOVE_DSR_SUPERIOR_RULE_269",BACKEND,MILD_ERROR,269, getClassLoader());

  /**
   * Unable to remove matching rule use %s from the server schema because no such matching rule use is defined
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SCHEMA_MODIFY_REMOVE_NO_SUCH_MR_USE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_REMOVE_NO_SUCH_MR_USE_270",BACKEND,MILD_ERROR,270, getClassLoader());

  /**
   * Unable to add name form %s because it references objectclass %s which is defined in the server schema but is not a structural objectclass
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_NF_OC_NOT_STRUCTURAL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_NF_OC_NOT_STRUCTURAL_271",BACKEND,MILD_ERROR,271, getClassLoader());

  /**
   * Unable to add DIT content rule %s because it references structural objectclass %s which is defined in the server schema but is not structural
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_DCR_OC_NOT_STRUCTURAL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_DCR_OC_NOT_STRUCTURAL_272",BACKEND,MILD_ERROR,272, getClassLoader());

  /**
   * Unable to add name form %s because it references structural objectclass %s which is already associated with another name form %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SCHEMA_MODIFY_STRUCTURAL_OC_CONFLICT_FOR_ADD_NF =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_STRUCTURAL_OC_CONFLICT_FOR_ADD_NF_273",BACKEND,MILD_ERROR,273, getClassLoader());

  /**
   * Unable to add attribute type %s because the superior type %s is marked as OBSOLETE in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_OBSOLETE_SUPERIOR_ATTRIBUTE_TYPE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_OBSOLETE_SUPERIOR_ATTRIBUTE_TYPE_274",BACKEND,MILD_ERROR,274, getClassLoader());

  /**
   * Unable to add attribute type %s because the associated matching rule %s is marked as OBSOLETE in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_ATTRTYPE_OBSOLETE_MR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_ATTRTYPE_OBSOLETE_MR_275",BACKEND,MILD_ERROR,275, getClassLoader());

  /**
   * Unable to add object class %s because the superior class %s is marked as OBSOLETE in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_OBSOLETE_SUPERIOR_OBJECTCLASS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_OBSOLETE_SUPERIOR_OBJECTCLASS_276",BACKEND,MILD_ERROR,276, getClassLoader());

  /**
   * Unable to add object class %s because required attribute %s is marked as OBSOLETE in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_OC_OBSOLETE_REQUIRED_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_OC_OBSOLETE_REQUIRED_ATTR_277",BACKEND,MILD_ERROR,277, getClassLoader());

  /**
   * Unable to add object class %s because optional attribute %s is marked as OBSOLETE in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_OC_OBSOLETE_OPTIONAL_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_OC_OBSOLETE_OPTIONAL_ATTR_278",BACKEND,MILD_ERROR,278, getClassLoader());

  /**
   * Unable to add name form %s because its structural object class %s is marked as OBSOLETE in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_NF_OC_OBSOLETE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_NF_OC_OBSOLETE_279",BACKEND,MILD_ERROR,279, getClassLoader());

  /**
   * Unable to add name form %s because it requires attribute type %s which is marked as OBSOLETE in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_NF_OBSOLETE_REQUIRED_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_NF_OBSOLETE_REQUIRED_ATTR_280",BACKEND,MILD_ERROR,280, getClassLoader());

  /**
   * Unable to add name form %s because it allows attribute type %s which is marked as OBSOLETE in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_NF_OBSOLETE_OPTIONAL_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_NF_OBSOLETE_OPTIONAL_ATTR_281",BACKEND,MILD_ERROR,281, getClassLoader());

  /**
   * Unable to add DIT content rule %s because its structural object class %s is marked as OBSOLETE in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_DCR_STRUCTURAL_OC_OBSOLETE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_DCR_STRUCTURAL_OC_OBSOLETE_282",BACKEND,MILD_ERROR,282, getClassLoader());

  /**
   * Unable to add DIT content rule %s because it references auxiliary object class %s which is defined in the server schema but is not an auxiliary class
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_DCR_OC_NOT_AUXILIARY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_DCR_OC_NOT_AUXILIARY_283",BACKEND,MILD_ERROR,283, getClassLoader());

  /**
   * Unable to add DIT content rule %s because it allows auxiliary object class %s which is marked as OBSOLETE in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_DCR_AUXILIARY_OC_OBSOLETE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_DCR_AUXILIARY_OC_OBSOLETE_284",BACKEND,MILD_ERROR,284, getClassLoader());

  /**
   * Unable to add DIT content rule %s because it requires attribute type %s which is marked as OBSOLETE in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_DCR_OBSOLETE_REQUIRED_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_DCR_OBSOLETE_REQUIRED_ATTR_285",BACKEND,MILD_ERROR,285, getClassLoader());

  /**
   * Unable to add DIT content rule %s because it allows attribute type %s which is marked as OBSOLETE in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_DCR_OBSOLETE_OPTIONAL_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_DCR_OBSOLETE_OPTIONAL_ATTR_286",BACKEND,MILD_ERROR,286, getClassLoader());

  /**
   * Unable to add DIT content rule %s because it prohibits attribute type %s which is marked as OBSOLETE in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_DCR_OBSOLETE_PROHIBITED_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_DCR_OBSOLETE_PROHIBITED_ATTR_287",BACKEND,MILD_ERROR,287, getClassLoader());

  /**
   * Unable to add DIT structure rule %s because its name form %s is marked OBSOLETE in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_DSR_OBSOLETE_NAME_FORM =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_DSR_OBSOLETE_NAME_FORM_288",BACKEND,MILD_ERROR,288, getClassLoader());

  /**
   * Unable to add DIT structure rule %s because it references superior rule %s which is marked as OBSOLETE in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_DSR_OBSOLETE_SUPERIOR_RULE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_DSR_OBSOLETE_SUPERIOR_RULE_289",BACKEND,MILD_ERROR,289, getClassLoader());

  /**
   * Unable to add matching rule use %s because its matching rule %s is marked OBSOLETE in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_MRU_OBSOLETE_MR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_MRU_OBSOLETE_MR_290",BACKEND,MILD_ERROR,290, getClassLoader());

  /**
   * Unable to add matching rule use %s because it references attribute type %s which is marked as OBSOLETE in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_MRU_OBSOLETE_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_MRU_OBSOLETE_ATTR_291",BACKEND,MILD_ERROR,291, getClassLoader());

  /**
   * Unable to add DIT content rule %s because it references auxiliary object class %s which is marked as OBSOLETE in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_DCR_OBSOLETE_AUXILIARY_OC =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_DCR_OBSOLETE_AUXILIARY_OC_292",BACKEND,MILD_ERROR,292, getClassLoader());

  /**
   * You do not have sufficient privileges to modify the Directory Server schema
   */
  public static final MessageDescriptor.Arg0 ERR_SCHEMA_MODIFY_INSUFFICIENT_PRIVILEGES =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_SCHEMA_MODIFY_INSUFFICIENT_PRIVILEGES_293",BACKEND,MILD_ERROR,293, getClassLoader());

  /**
   * Unable to find a file containing concatenated schema element definitions in order to determine if any schema changes were made with the server offline.  The file was expected in the %s directory and should have been named either %s or %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SCHEMA_CANNOT_FIND_CONCAT_FILE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_SCHEMA_CANNOT_FIND_CONCAT_FILE_294",BACKEND,SEVERE_ERROR,294, getClassLoader());

  /**
   * An error occurred while attempting to determine whether any schema changes had been made by directly editing the schema files with the server offline:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SCHEMA_ERROR_DETERMINING_SCHEMA_CHANGES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_SCHEMA_ERROR_DETERMINING_SCHEMA_CHANGES_295",BACKEND,SEVERE_ERROR,295, getClassLoader());

  /**
   * An error occurred while attempting to write file %s containing a concatenated list of all server schema elements:  %s.  The server may not be able to accurately identify any schema changes made with the server offline
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_CANNOT_WRITE_CONCAT_SCHEMA_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_SCHEMA_CANNOT_WRITE_CONCAT_SCHEMA_FILE_296",BACKEND,SEVERE_ERROR,296, getClassLoader());

  /**
   * JE Database Environment corresponding to backend id %s is corrupt. Restart the Directory Server to reopen the Environment
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_BACKEND_ENVIRONMENT_UNUSABLE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_BACKEND_ENVIRONMENT_UNUSABLE_297",BACKEND,NOTICE,297, getClassLoader());

  /**
   * The Directory Server is not configured to allow task %s to be invoked
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASKSCHED_NOT_ALLOWED_TASK =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASKSCHED_NOT_ALLOWED_TASK_298",BACKEND,SEVERE_ERROR,298, getClassLoader());

  /**
   * Task ID:  %s
   * Task State:  %s
   * Scheduled Start Time:  %s
   * Actual Start Time:  %s
   * Completion Time:  %s
   * 
   * Log Messages:
   */
  public static final MessageDescriptor.Arg5<CharSequence,CharSequence,CharSequence,CharSequence,CharSequence> INFO_TASK_COMPLETION_BODY =
          new MessageDescriptor.Arg5<CharSequence,CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"INFO_TASK_COMPLETION_BODY_299",BACKEND,INFORMATION,299, getClassLoader());

  /**
   * Unable to retrieve an entry from the trust store backend because the requested entry was null
   */
  public static final MessageDescriptor.Arg0 ERR_TRUSTSTORE_GET_ENTRY_NULL =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_TRUSTSTORE_GET_ENTRY_NULL_300",BACKEND,SEVERE_ERROR,300, getClassLoader());

  /**
   * Requested entry %s does not exist in the trust store backend
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TRUSTSTORE_INVALID_BASE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TRUSTSTORE_INVALID_BASE_301",BACKEND,SEVERE_ERROR,301, getClassLoader());

  /**
   * Unable to process entry %s in the trust store backend because the requested DN is one level below the base DN but does not specify a certificate name
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TRUSTSTORE_DN_DOES_NOT_SPECIFY_CERTIFICATE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TRUSTSTORE_DN_DOES_NOT_SPECIFY_CERTIFICATE_302",BACKEND,SEVERE_ERROR,302, getClassLoader());

  /**
   * Error while trying to retrieve certificate %s from the trust store file %s: %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_TRUSTSTORE_CANNOT_RETRIEVE_CERT =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_TRUSTSTORE_CANNOT_RETRIEVE_CERT_303",BACKEND,SEVERE_ERROR,303, getClassLoader());

  /**
   * Modify operations are not supported in the trust store backend
   */
  public static final MessageDescriptor.Arg0 ERR_TRUSTSTORE_MODIFY_NOT_SUPPORTED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_TRUSTSTORE_MODIFY_NOT_SUPPORTED_304",BACKEND,SEVERE_ERROR,304, getClassLoader());

  /**
   * Modify DN operations are not supported in the trust store backend
   */
  public static final MessageDescriptor.Arg0 ERR_TRUSTSTORE_MODIFY_DN_NOT_SUPPORTED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_TRUSTSTORE_MODIFY_DN_NOT_SUPPORTED_305",BACKEND,SEVERE_ERROR,305, getClassLoader());

  /**
   * Unable to initialize the trust store backend from configuration entry %s because it does not contain exactly one base DN
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TRUSTSTORE_REQUIRES_ONE_BASE_DN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TRUSTSTORE_REQUIRES_ONE_BASE_DN_306",BACKEND,SEVERE_ERROR,306, getClassLoader());

  /**
   * LDIF import and export operations are not supported in the trust store backend
   */
  public static final MessageDescriptor.Arg0 ERR_TRUSTSTORE_IMPORT_AND_EXPORT_NOT_SUPPORTED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_TRUSTSTORE_IMPORT_AND_EXPORT_NOT_SUPPORTED_307",BACKEND,SEVERE_ERROR,307, getClassLoader());

  /**
   * Backup and restore operations are not supported in the trust store backend
   */
  public static final MessageDescriptor.Arg0 ERR_TRUSTSTORE_BACKUP_AND_RESTORE_NOT_SUPPORTED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_TRUSTSTORE_BACKUP_AND_RESTORE_NOT_SUPPORTED_308",BACKEND,SEVERE_ERROR,308, getClassLoader());

  /**
   * The trust store file %s specified in attribute ds-cfg-trust-store-file of configuration entry %s does not exist
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TRUSTSTORE_NO_SUCH_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TRUSTSTORE_NO_SUCH_FILE_309",BACKEND,SEVERE_ERROR,309, getClassLoader());

  /**
   * The trust store type %s specified in attribute ds-cfg-trust-store-type of configuration entry %s is not valid:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_TRUSTSTORE_INVALID_TYPE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_TRUSTSTORE_INVALID_TYPE_310",BACKEND,SEVERE_ERROR,310, getClassLoader());

  /**
   * An error occurred while trying to create the PIN file %s specified in attribute ds-cfg-trust-store-pin-file of configuration entry %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TRUSTSTORE_PIN_FILE_CANNOT_CREATE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TRUSTSTORE_PIN_FILE_CANNOT_CREATE_311",BACKEND,SEVERE_ERROR,311, getClassLoader());

  /**
   * An error occurred while trying to read the trust store PIN from file %s specified in configuration attribute ds-cfg-trust-store-pin-file of configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_TRUSTSTORE_PIN_FILE_CANNOT_READ =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_TRUSTSTORE_PIN_FILE_CANNOT_READ_312",BACKEND,SEVERE_ERROR,312, getClassLoader());

  /**
   * File %s specified in attribute ds-cfg-trust-store-pin-file of configuration entry %s should contain the PIN needed to access the trust store, but this file is empty
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TRUSTSTORE_PIN_FILE_EMPTY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TRUSTSTORE_PIN_FILE_EMPTY_313",BACKEND,SEVERE_ERROR,313, getClassLoader());

  /**
   * Environment variable %s which is specified in attribute ds-cfg-trust-store-pin-environment-variable of configuration entry %s should contain the PIN needed to access the trust store, but this property is not set
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TRUSTSTORE_PIN_ENVAR_NOT_SET =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TRUSTSTORE_PIN_ENVAR_NOT_SET_314",BACKEND,SEVERE_ERROR,314, getClassLoader());

  /**
   * Java property %s which is specified in attribute ds-cfg-trust-store-pin-property of configuration entry %s should contain the PIN needed to access the file-based trust manager, but this property is not set
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TRUSTSTORE_PIN_PROPERTY_NOT_SET =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TRUSTSTORE_PIN_PROPERTY_NOT_SET_315",BACKEND,SEVERE_ERROR,315, getClassLoader());

  /**
   * An unexpected error occurred while trying to determine the value of configuration attribute ds-cfg-trust-store-file in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TRUSTSTORE_CANNOT_DETERMINE_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TRUSTSTORE_CANNOT_DETERMINE_FILE_316",BACKEND,SEVERE_ERROR,316, getClassLoader());

  /**
   * An error occurred while trying to load the trust store contents from file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TRUSTSTORE_CANNOT_LOAD =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TRUSTSTORE_CANNOT_LOAD_317",BACKEND,SEVERE_ERROR,317, getClassLoader());

  /**
   * An error occurred while trying to create a trust manager factory to access the contents of trust store file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TRUSTSTORE_CANNOT_CREATE_FACTORY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TRUSTSTORE_CANNOT_CREATE_FACTORY_318",BACKEND,SEVERE_ERROR,318, getClassLoader());

  /**
   * The certificate entry %s already exists
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TRUSTSTORE_ALIAS_IN_USE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TRUSTSTORE_ALIAS_IN_USE_319",BACKEND,SEVERE_ERROR,319, getClassLoader());

  /**
   * Error while attempting to generate a self-signed certificate %s in the trust store file %s: %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_TRUSTSTORE_CANNOT_GENERATE_CERT =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_TRUSTSTORE_CANNOT_GENERATE_CERT_320",BACKEND,SEVERE_ERROR,320, getClassLoader());

  /**
   * Error while trying to add certificate %s to the trust store file %s: %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_TRUSTSTORE_CANNOT_ADD_CERT =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_TRUSTSTORE_CANNOT_ADD_CERT_321",BACKEND,SEVERE_ERROR,321, getClassLoader());

  /**
   * Delete operations are not supported in the trust store backend
   */
  public static final MessageDescriptor.Arg0 ERR_TRUSTSTORE_DELETE_NOT_SUPPORTED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_TRUSTSTORE_DELETE_NOT_SUPPORTED_322",BACKEND,SEVERE_ERROR,322, getClassLoader());

  /**
   * The entry %s could not be added because it does not contain a certificate attribute %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TRUSTSTORE_ENTRY_MISSING_CERT_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TRUSTSTORE_ENTRY_MISSING_CERT_ATTR_323",BACKEND,SEVERE_ERROR,323, getClassLoader());

  /**
   * The entry %s could not be added because it contains multiple certificate attributes %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TRUSTSTORE_ENTRY_HAS_MULTIPLE_CERT_ATTRS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TRUSTSTORE_ENTRY_HAS_MULTIPLE_CERT_ATTRS_324",BACKEND,SEVERE_ERROR,324, getClassLoader());

  /**
   * The entry %s could not be added because it does not contain a value of certificate attribute %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TRUSTSTORE_ENTRY_MISSING_CERT_VALUE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TRUSTSTORE_ENTRY_MISSING_CERT_VALUE_325",BACKEND,SEVERE_ERROR,325, getClassLoader());

  /**
   * The entry %s could not be added because it contains multiple values of certificate attribute %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TRUSTSTORE_ENTRY_HAS_MULTIPLE_CERT_VALUES =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TRUSTSTORE_ENTRY_HAS_MULTIPLE_CERT_VALUES_326",BACKEND,SEVERE_ERROR,326, getClassLoader());

  /**
   * Error while writing certificate %s to a file: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TRUSTSTORE_CANNOT_WRITE_CERT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TRUSTSTORE_CANNOT_WRITE_CERT_327",BACKEND,SEVERE_ERROR,327, getClassLoader());

  /**
   * Failed to set permissions on trust store file %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_TRUSTSTORE_SET_PERMISSIONS_FAILED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_TRUSTSTORE_SET_PERMISSIONS_FAILED_328",BACKEND,SEVERE_WARNING,328, getClassLoader());

  /**
   * The root container for backend %s has not been initialized preventing this backend from processing the requested operation
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ROOT_CONTAINER_NOT_INITIALIZED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_ROOT_CONTAINER_NOT_INITIALIZED_329",BACKEND,SEVERE_ERROR,329, getClassLoader());

  /**
   * Unable to obtain a write lock on entry %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASKBE_MODIFY_CANNOT_LOCK_ENTRY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASKBE_MODIFY_CANNOT_LOCK_ENTRY_330",BACKEND,SEVERE_ERROR,330, getClassLoader());

  /**
   * Entry %s cannot be modified because it does not represent a task entry.  Only task entries may be modified in the task backend
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASKBE_MODIFY_INVALID_ENTRY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASKBE_MODIFY_INVALID_ENTRY_331",BACKEND,SEVERE_ERROR,331, getClassLoader());

  /**
   * Entry %s cannot be modified because it does not represent a valid task in the server
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASKBE_MODIFY_NO_SUCH_TASK =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASKBE_MODIFY_NO_SUCH_TASK_332",BACKEND,SEVERE_ERROR,332, getClassLoader());

  /**
   * Entry %s cannot be modified because the assoicated task has completed running.  Completed tasks cannot be modified
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASKBE_MODIFY_COMPLETED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASKBE_MODIFY_COMPLETED_333",BACKEND,SEVERE_ERROR,333, getClassLoader());

  /**
   * Entry %s cannot be modified because the server does not currently support modifying recurring task entries
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASKBE_MODIFY_RECURRING =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASKBE_MODIFY_RECURRING_334",BACKEND,SEVERE_ERROR,334, getClassLoader());

  /**
   * The task associated with entry %s is currently running.  The only modification allowed for running tasks is to replace the value of the ds-task-state attribute with "cancel"
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASKBE_MODIFY_RUNNING =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASKBE_MODIFY_RUNNING_335",BACKEND,SEVERE_ERROR,335, getClassLoader());

  /**
   * Task processing was interrupted by a modify request to cancel the task
   */
  public static final MessageDescriptor.Arg0 INFO_TASKBE_RUNNING_TASK_CANCELLED =
          new MessageDescriptor.Arg0(BASE,"INFO_TASKBE_RUNNING_TASK_CANCELLED_336",BACKEND,INFORMATION,336, getClassLoader());

  /**
   * Error while trying to delete certificate %s from the trust store file %s: %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_TRUSTSTORE_CANNOT_DELETE_CERT =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_TRUSTSTORE_CANNOT_DELETE_CERT_337",BACKEND,SEVERE_ERROR,337, getClassLoader());

  /**
   * Unable to retrieve entry %s from the trust store backend because the certificate %s does not exist
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TRUSTSTORE_CERTIFICATE_NOT_FOUND =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TRUSTSTORE_CERTIFICATE_NOT_FOUND_338",BACKEND,SEVERE_ERROR,338, getClassLoader());

  /**
   * The LDIF backend defined in configuration entry %s only supports a single base DN, but was configured for use with multiple base DNs
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIF_BACKEND_MULTIPLE_BASE_DNS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDIF_BACKEND_MULTIPLE_BASE_DNS_339",BACKEND,SEVERE_ERROR,339, getClassLoader());

  /**
   * An error occurred while attempting to open LDIF file %s for use by the LDIF backend defined in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_LDIF_BACKEND_ERROR_OPENING_FILE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIF_BACKEND_ERROR_OPENING_FILE_340",BACKEND,SEVERE_ERROR,340, getClassLoader());

  /**
   * An error occurred while attempting to read data from LDIF file %s into the LDIF backend defined in configuration entry %s: %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_LDIF_BACKEND_ERROR_READING_ENTRY =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIF_BACKEND_ERROR_READING_ENTRY_341",BACKEND,SEVERE_ERROR,341, getClassLoader());

  /**
   * LDIF file %s configured for use with the LDIF backend defined in configuration entry %s has multiple entries with a DN of %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_LDIF_BACKEND_DUPLICATE_ENTRY =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_LDIF_BACKEND_DUPLICATE_ENTRY_342",BACKEND,MILD_ERROR,342, getClassLoader());

  /**
   * LDIF file %s configured for use with the LDIF backend defined in configuration entry %s includes entry %s which is not below the base DN defined for that backend
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_LDIF_BACKEND_ENTRY_OUT_OF_SCOPE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_LDIF_BACKEND_ENTRY_OUT_OF_SCOPE_343",BACKEND,MILD_ERROR,343, getClassLoader());

  /**
   * LDIF file %s configured for use with the LDIF backend defined in configuration entry %s contains entry %s but its parent entry has not yet been read
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_LDIF_BACKEND_MISSING_PARENT =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_LDIF_BACKEND_MISSING_PARENT_344",BACKEND,MILD_ERROR,344, getClassLoader());

  /**
   * An error occurred while trying to create file %s to write an updated version of the data for the LDIF backend defined in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_LDIF_BACKEND_ERROR_CREATING_FILE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIF_BACKEND_ERROR_CREATING_FILE_345",BACKEND,SEVERE_ERROR,345, getClassLoader());

  /**
   * An error occurred while trying to write updated data to file %s for the LDIF backend defined in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_LDIF_BACKEND_ERROR_WRITING_FILE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIF_BACKEND_ERROR_WRITING_FILE_346",BACKEND,SEVERE_ERROR,346, getClassLoader());

  /**
   * An error occurred while attempting to rename file %s to %s while writing updated data for the LDIF backend defined in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> ERR_LDIF_BACKEND_ERROR_RENAMING_FILE =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIF_BACKEND_ERROR_RENAMING_FILE_347",BACKEND,SEVERE_ERROR,347, getClassLoader());

  /**
   * Entry %s already exists in the LDIF backend
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIF_BACKEND_ADD_ALREADY_EXISTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDIF_BACKEND_ADD_ALREADY_EXISTS_348",BACKEND,MILD_ERROR,348, getClassLoader());

  /**
   * The parent for entry %s does not exist
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIF_BACKEND_ADD_MISSING_PARENT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDIF_BACKEND_ADD_MISSING_PARENT_349",BACKEND,MILD_ERROR,349, getClassLoader());

  /**
   * Entry %s does not exist
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIF_BACKEND_DELETE_NO_SUCH_ENTRY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDIF_BACKEND_DELETE_NO_SUCH_ENTRY_350",BACKEND,MILD_ERROR,350, getClassLoader());

  /**
   * Entry %s has one or more subordinate entries and cannot be deleted until all of its subordinate entries are removed first
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIF_BACKEND_DELETE_NONLEAF =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDIF_BACKEND_DELETE_NONLEAF_351",BACKEND,MILD_ERROR,351, getClassLoader());

  /**
   * Entry %s does not exist
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIF_BACKEND_MODIFY_NO_SUCH_ENTRY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDIF_BACKEND_MODIFY_NO_SUCH_ENTRY_352",BACKEND,MILD_ERROR,352, getClassLoader());

  /**
   * Source entry %s does not exist
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIF_BACKEND_MODDN_NO_SUCH_SOURCE_ENTRY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDIF_BACKEND_MODDN_NO_SUCH_SOURCE_ENTRY_353",BACKEND,MILD_ERROR,353, getClassLoader());

  /**
   * Target entry %s already exists
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIF_BACKEND_MODDN_TARGET_ENTRY_ALREADY_EXISTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDIF_BACKEND_MODDN_TARGET_ENTRY_ALREADY_EXISTS_354",BACKEND,MILD_ERROR,354, getClassLoader());

  /**
   * The new parent DN %s does not exist
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIF_BACKEND_MODDN_NEW_PARENT_DOESNT_EXIST =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDIF_BACKEND_MODDN_NEW_PARENT_DOESNT_EXIST_355",BACKEND,MILD_ERROR,355, getClassLoader());

  /**
   * Entry %s specified as the search base DN does not exist
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIF_BACKEND_SEARCH_NO_SUCH_BASE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDIF_BACKEND_SEARCH_NO_SUCH_BASE_356",BACKEND,MILD_ERROR,356, getClassLoader());

  /**
   * An error occurred while trying to create the writer for the LDIF export operation:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIF_BACKEND_CANNOT_CREATE_LDIF_WRITER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDIF_BACKEND_CANNOT_CREATE_LDIF_WRITER_357",BACKEND,SEVERE_ERROR,357, getClassLoader());

  /**
   * An error occurred while trying to write entry %s during the LDIF export:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIF_BACKEND_CANNOT_WRITE_ENTRY_TO_LDIF =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIF_BACKEND_CANNOT_WRITE_ENTRY_TO_LDIF_358",BACKEND,SEVERE_ERROR,358, getClassLoader());

  /**
   * An error occurred while trying to create the reader for the LDIF import operation:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIF_BACKEND_CANNOT_CREATE_LDIF_READER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDIF_BACKEND_CANNOT_CREATE_LDIF_READER_359",BACKEND,SEVERE_ERROR,359, getClassLoader());

  /**
   * An unrecoverable error occurred while attempting to read data from the import file:  %s.  The LDIF import cannot continue
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIF_BACKEND_ERROR_READING_LDIF =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDIF_BACKEND_ERROR_READING_LDIF_360",BACKEND,SEVERE_ERROR,360, getClassLoader());

  /**
   * The LDIF backend currently does not provide a backup or restore mechanism.  Use LDIF import and export operations instead
   */
  public static final MessageDescriptor.Arg0 ERR_LDIF_BACKEND_BACKUP_RESTORE_NOT_SUPPORTED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_LDIF_BACKEND_BACKUP_RESTORE_NOT_SUPPORTED_361",BACKEND,MILD_ERROR,361, getClassLoader());

  /**
   * LDIF file %s referenced in LDIF backend configuration entry %s does not exist
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIF_BACKEND_LDIF_DOESNT_EXIST =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_LDIF_BACKEND_LDIF_DOESNT_EXIST_362",BACKEND,MILD_ERROR,362, getClassLoader());

  /**
   * The change to the LDIF file path will not take effect until the backend is disabled and re-enabled
   */
  public static final MessageDescriptor.Arg0 INFO_LDIF_BACKEND_LDIF_FILE_CHANGED =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIF_BACKEND_LDIF_FILE_CHANGED_363",BACKEND,INFORMATION,363, getClassLoader());

  /**
   * The change to the LDIF backend base DN will not take effect until the backend is disabled and re-enabled
   */
  public static final MessageDescriptor.Arg0 INFO_LDIF_BACKEND_BASE_DN_CHANGED =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIF_BACKEND_BASE_DN_CHANGED_364",BACKEND,INFORMATION,364, getClassLoader());

  /**
   * The target entry %s does not exist
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIF_BACKEND_HAS_SUBORDINATES_NO_SUCH_ENTRY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDIF_BACKEND_HAS_SUBORDINATES_NO_SUCH_ENTRY_365",BACKEND,MILD_ERROR,365, getClassLoader());

  /**
   * The target entry %s does not exist
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIF_BACKEND_NUM_SUBORDINATES_NO_SUCH_ENTRY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDIF_BACKEND_NUM_SUBORDINATES_NO_SUCH_ENTRY_366",BACKEND,MILD_ERROR,366, getClassLoader());

  /**
   * Error reading key %s from key store %s: %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_TRUSTSTORE_ERROR_READING_KEY =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_TRUSTSTORE_ERROR_READING_KEY_367",BACKEND,SEVERE_ERROR,367, getClassLoader());

  /**
   * This backend does not provide support for the hasSubordinates operational attribute
   */
  public static final MessageDescriptor.Arg0 ERR_HAS_SUBORDINATES_NOT_SUPPORTED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_HAS_SUBORDINATES_NOT_SUPPORTED_368",BACKEND,MILD_ERROR,368, getClassLoader());

  /**
   * This backend does not provide support for the numSubordinates operational attribute
   */
  public static final MessageDescriptor.Arg0 ERR_NUM_SUBORDINATES_NOT_SUPPORTED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_NUM_SUBORDINATES_NOT_SUPPORTED_369",BACKEND,MILD_ERROR,369, getClassLoader());

  /**
   * The backend %s is now taken offline
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_BACKEND_OFFLINE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_BACKEND_OFFLINE_370",BACKEND,NOTICE,370, getClassLoader());

  /**
   * The provided recurring task entry attribute %s holding the recurring task schedule has invalid number of tokens
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_RECURRINGTASK_INVALID_N_TOKENS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_RECURRINGTASK_INVALID_N_TOKENS_371",BACKEND,SEVERE_ERROR,371, getClassLoader());

  /**
   * The provided recurring task entry attribute %s holding the recurring task schedule has invalid minute token
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_RECURRINGTASK_INVALID_MINUTE_TOKEN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_RECURRINGTASK_INVALID_MINUTE_TOKEN_372",BACKEND,SEVERE_ERROR,372, getClassLoader());

  /**
   * The provided recurring task entry attribute %s holding the recurring task schedule has invalid hour token
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_RECURRINGTASK_INVALID_HOUR_TOKEN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_RECURRINGTASK_INVALID_HOUR_TOKEN_373",BACKEND,SEVERE_ERROR,373, getClassLoader());

  /**
   * The provided recurring task entry attribute %s holding the recurring task schedule has invalid day of the month token
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_RECURRINGTASK_INVALID_DAY_TOKEN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_RECURRINGTASK_INVALID_DAY_TOKEN_374",BACKEND,SEVERE_ERROR,374, getClassLoader());

  /**
   * The provided recurring task entry attribute %s holding the recurring task schedule has invalid month of the year token
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_RECURRINGTASK_INVALID_MONTH_TOKEN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_RECURRINGTASK_INVALID_MONTH_TOKEN_375",BACKEND,SEVERE_ERROR,375, getClassLoader());

  /**
   * The provided recurring task entry attribute %s holding the recurring task schedule has invalid day of the week token
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_RECURRINGTASK_INVALID_WEEKDAY_TOKEN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_RECURRINGTASK_INVALID_WEEKDAY_TOKEN_376",BACKEND,SEVERE_ERROR,376, getClassLoader());

  /**
   * The provided recurring task entry attribute %s holding the recurring task schedule has invalid tokens combination yielding a nonexistent calendar date
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_RECURRINGTASK_INVALID_TOKENS_COMBO =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_RECURRINGTASK_INVALID_TOKENS_COMBO_377",BACKEND,SEVERE_ERROR,377, getClassLoader());

  /**
   * An error occurred while attempting to export task backend data:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASKS_CANNOT_EXPORT_TO_FILE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASKS_CANNOT_EXPORT_TO_FILE_378",BACKEND,SEVERE_ERROR,378, getClassLoader());

  /**
   * An error occurred while attempting to obtain the %s MAC provider to create the signed hash for the backup:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TASKS_BACKUP_CANNOT_GET_MAC =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASKS_BACKUP_CANNOT_GET_MAC_379",BACKEND,SEVERE_ERROR,379, getClassLoader());

  /**
   * An error occurred while attempting to obtain the %s message digest to create the hash for the backup: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TASKS_BACKUP_CANNOT_GET_DIGEST =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASKS_BACKUP_CANNOT_GET_DIGEST_380",BACKEND,SEVERE_ERROR,380, getClassLoader());

  /**
   * An error occurred while trying to create the tasks archive file %s in directory %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_TASKS_BACKUP_CANNOT_CREATE_ARCHIVE_FILE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASKS_BACKUP_CANNOT_CREATE_ARCHIVE_FILE_381",BACKEND,SEVERE_ERROR,381, getClassLoader());

  /**
   * An error occurred while attempting to obtain the cipher to use to encrypt the backup:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASKS_BACKUP_CANNOT_GET_CIPHER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASKS_BACKUP_CANNOT_GET_CIPHER_382",BACKEND,SEVERE_ERROR,382, getClassLoader());

  /**
   * %s tasks backup %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TASKS_BACKUP_ZIP_COMMENT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASKS_BACKUP_ZIP_COMMENT_383",BACKEND,SEVERE_ERROR,383, getClassLoader());

  /**
   * An error occurred while attempting to back up tasks file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TASKS_BACKUP_CANNOT_BACKUP_TASKS_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASKS_BACKUP_CANNOT_BACKUP_TASKS_FILE_384",BACKEND,SEVERE_ERROR,384, getClassLoader());

  /**
   * An error occurred while trying to close the tasks archive file %s in directory %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_TASKS_BACKUP_CANNOT_CLOSE_ZIP_STREAM =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASKS_BACKUP_CANNOT_CLOSE_ZIP_STREAM_385",BACKEND,SEVERE_ERROR,385, getClassLoader());

  /**
   * An error occurred while attempting to update the backup descriptor file %s with information about the tasks backup:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TASKS_BACKUP_CANNOT_UPDATE_BACKUP_DESCRIPTOR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASKS_BACKUP_CANNOT_UPDATE_BACKUP_DESCRIPTOR_386",BACKEND,SEVERE_ERROR,386, getClassLoader());

  /**
   * Unable to restore or verify tasks backup %s in directory %s because no such backup exists
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TASKS_RESTORE_NO_SUCH_BACKUP =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASKS_RESTORE_NO_SUCH_BACKUP_387",BACKEND,SEVERE_ERROR,387, getClassLoader());

  /**
   * Unable to restore or verify tasks backup %s in directory %s because the archive filename could not be determined
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TASKS_RESTORE_NO_BACKUP_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASKS_RESTORE_NO_BACKUP_FILE_388",BACKEND,SEVERE_ERROR,388, getClassLoader());

  /**
   * Unable to restore or verify tasks backup %s because the specified archive file %s does not exist
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TASKS_RESTORE_NO_SUCH_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASKS_RESTORE_NO_SUCH_FILE_389",BACKEND,SEVERE_ERROR,389, getClassLoader());

  /**
   * Unable to restore or verify tasks backup %s because an error occurred while trying to determine whether backup archive %s exists:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_TASKS_RESTORE_CANNOT_CHECK_FOR_ARCHIVE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASKS_RESTORE_CANNOT_CHECK_FOR_ARCHIVE_390",BACKEND,SEVERE_ERROR,390, getClassLoader());

  /**
   * Unable to restore or verify tasks backup %s because an unsigned hash of this backup is available but the server cannot determine the digest algorithm used to generate this hash
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASKS_RESTORE_UNKNOWN_DIGEST =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASKS_RESTORE_UNKNOWN_DIGEST_391",BACKEND,SEVERE_ERROR,391, getClassLoader());

  /**
   * Unable to restore or verify tasks backup %s because it has an unsigned hash that uses an unknown or unsupported digest algorithm of %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TASKS_RESTORE_CANNOT_GET_DIGEST =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASKS_RESTORE_CANNOT_GET_DIGEST_392",BACKEND,SEVERE_ERROR,392, getClassLoader());

  /**
   * Unable to restore or verify tasks backup %s because a signed hash of this backup is available but the server cannot determine the MAC algorithm used to generate this hash
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASKS_RESTORE_UNKNOWN_MAC =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASKS_RESTORE_UNKNOWN_MAC_393",BACKEND,SEVERE_ERROR,393, getClassLoader());

  /**
   * Unable to restore or verify tasks backup %s because it has a signed hash that uses an unknown or unsupported MAC algorithm of %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TASKS_RESTORE_CANNOT_GET_MAC =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASKS_RESTORE_CANNOT_GET_MAC_394",BACKEND,SEVERE_ERROR,394, getClassLoader());

  /**
   * Unable to restore or verify tasks backup %s because an error occurred while attempting to open the backup archive file %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_TASKS_RESTORE_CANNOT_OPEN_BACKUP_FILE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASKS_RESTORE_CANNOT_OPEN_BACKUP_FILE_395",BACKEND,SEVERE_ERROR,395, getClassLoader());

  /**
   * Unable to restore or verify tasks backup %s because it is encrypted using an unknown or unsupported cipher:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TASKS_RESTORE_CANNOT_GET_CIPHER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASKS_RESTORE_CANNOT_GET_CIPHER_396",BACKEND,SEVERE_ERROR,396, getClassLoader());

  /**
   * Unable to restore or verify tasks backup %s because an error occurred while trying to read the next entry from the archive file %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_TASKS_RESTORE_CANNOT_GET_ZIP_ENTRY =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASKS_RESTORE_CANNOT_GET_ZIP_ENTRY_397",BACKEND,SEVERE_ERROR,397, getClassLoader());

  /**
   * Unable to restore tasks backup %s because an error occurred while trying to recreate file %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_TASKS_RESTORE_CANNOT_CREATE_FILE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASKS_RESTORE_CANNOT_CREATE_FILE_398",BACKEND,SEVERE_ERROR,398, getClassLoader());

  /**
   * Unable to restore or verify tasks backup %s because an error occurred while processing archived file %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_TASKS_RESTORE_CANNOT_PROCESS_ARCHIVE_FILE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASKS_RESTORE_CANNOT_PROCESS_ARCHIVE_FILE_399",BACKEND,SEVERE_ERROR,399, getClassLoader());

  /**
   * Unable to restore or verify tasks backup %s because an unexpected error occurred while trying to close the archive file %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_TASKS_RESTORE_ERROR_ON_ZIP_STREAM_CLOSE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASKS_RESTORE_ERROR_ON_ZIP_STREAM_CLOSE_400",BACKEND,SEVERE_ERROR,400, getClassLoader());

  /**
   * The message digest calculated from the backup archive matches the digest stored with the backup information
   */
  public static final MessageDescriptor.Arg0 NOTE_TASKS_RESTORE_UNSIGNED_HASH_VALID =
          new MessageDescriptor.Arg0(BASE,"NOTICE_TASKS_RESTORE_UNSIGNED_HASH_VALID_401",BACKEND,NOTICE,401, getClassLoader());

  /**
   * Unable to restore or verify tasks backup %s because the message digest calculated from the backup archive does not match the digest stored with the backup information
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASKS_RESTORE_UNSIGNED_HASH_INVALID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASKS_RESTORE_UNSIGNED_HASH_INVALID_402",BACKEND,SEVERE_ERROR,402, getClassLoader());

  /**
   * The signed digest calculated from the backup archive matches the signature stored with the backup information
   */
  public static final MessageDescriptor.Arg0 NOTE_TASKS_RESTORE_SIGNED_HASH_VALID =
          new MessageDescriptor.Arg0(BASE,"NOTICE_TASKS_RESTORE_SIGNED_HASH_VALID_403",BACKEND,NOTICE,403, getClassLoader());

  /**
   * Unable to restore or verify tasks backup %s because the signed digest calculated from the backup archive does not match the signature stored with the backup information
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASKS_RESTORE_SIGNED_HASH_INVALID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASKS_RESTORE_SIGNED_HASH_INVALID_404",BACKEND,SEVERE_ERROR,404, getClassLoader());

  /**
   * All tests performed on tasks backup %s from directory %s show that the archive appears to be valid
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> NOTE_TASKS_RESTORE_VERIFY_SUCCESSFUL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"NOTICE_TASKS_RESTORE_VERIFY_SUCCESSFUL_405",BACKEND,NOTICE,405, getClassLoader());

  /**
   * Tasks backup %s was successfully restored from the archive in directory %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> NOTE_TASKS_RESTORE_SUCCESSFUL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"NOTICE_TASKS_RESTORE_SUCCESSFUL_406",BACKEND,NOTICE,406, getClassLoader());

  /**
   * The information for backup %s could not be found in the backup directory %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_BACKUP_MISSING_BACKUPID =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_BACKUP_MISSING_BACKUPID_407",BACKEND,SEVERE_ERROR,407, getClassLoader());

  /**
   * An error occurred while attempting to update the backup descriptor file %s with information about the backup:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_BACKUP_CANNOT_UPDATE_BACKUP_DESCRIPTOR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_BACKUP_CANNOT_UPDATE_BACKUP_DESCRIPTOR_408",BACKEND,SEVERE_ERROR,408, getClassLoader());

  /**
   * Unable to add DIT structure rule %s because its rule identifier conflicts with existing DIT structure rule (%s)
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_RULEID_CONFLICTS_FOR_ADD_DSR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_RULEID_CONFLICTS_FOR_ADD_DSR_409",BACKEND,MILD_ERROR,409, getClassLoader());

  /**
   * Local DB backend %s does not specify the number of cleaner threads: defaulting to %d threads
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> INFO_ERGONOMIC_SIZING_OF_JE_CLEANER_THREADS =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"INFO_ERGONOMIC_SIZING_OF_JE_CLEANER_THREADS_410",BACKEND,INFORMATION,410, getClassLoader());

  /**
   * Local DB backend %s does not specify the number of lock tables: defaulting to %d
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> INFO_ERGONOMIC_SIZING_OF_JE_LOCK_TABLES =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"INFO_ERGONOMIC_SIZING_OF_JE_LOCK_TABLES_411",BACKEND,INFORMATION,411, getClassLoader());

  /**
   * Unable to schedule task %s because its dependency task %s is missing
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TASKSCHED_DEPENDENCY_MISSING =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASKSCHED_DEPENDENCY_MISSING_412",BACKEND,SEVERE_ERROR,412, getClassLoader());

  /**
   * %s task %s started execution
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> NOTE_TASK_STARTED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"NOTICE_TASK_STARTED_413",BACKEND,NOTICE,413, getClassLoader());

  /**
   * %s task %s finished execution
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> NOTE_TASK_FINISHED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"NOTICE_TASK_FINISHED_414",BACKEND,NOTICE,414, getClassLoader());

  /**
   * Unable to add ldap syntax description with OID %s because it conflicts with an existing ldap syntax description
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SCHEMA_MODIFY_MULTIPLE_CONFLICTS_FOR_ADD_LDAP_SYNTAX =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_MULTIPLE_CONFLICTS_FOR_ADD_LDAP_SYNTAX_415",BACKEND,MILD_ERROR,415, getClassLoader());

  /**
   * Unable to remove ldap syntax description %s from the server schema because no such ldap syntax description  is defined
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SCHEMA_MODIFY_REMOVE_NO_SUCH_LSD =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_REMOVE_NO_SUCH_LSD_416",BACKEND,MILD_ERROR,416, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an ldap syntax because its OID %s corresponds to an attribute syntax that is already implemented
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ATTR_SYNTAX_INVALID_LDAP_SYNTAX =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_INVALID_LDAP_SYNTAX_417",BACKEND,MILD_ERROR,417, getClassLoader());

  /**
   * An error occurred while attempting to decode the ldapsyntax description "%s":  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SCHEMA_MODIFY_CANNOT_DECODE_LDAP_SYNTAX =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_MODIFY_CANNOT_DECODE_LDAP_SYNTAX_418",BACKEND,MILD_ERROR,418, getClassLoader());

  /**
   * The provided recurring task schedule value has an invalid number of tokens
   */
  public static final MessageDescriptor.Arg0 ERR_RECURRINGTASK_INVALID_N_TOKENS_SIMPLE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_RECURRINGTASK_INVALID_N_TOKENS_SIMPLE_419",BACKEND,SEVERE_ERROR,419, getClassLoader());

  /**
   * The provided recurring task schedule value has an invalid minute token
   */
  public static final MessageDescriptor.Arg0 ERR_RECURRINGTASK_INVALID_MINUTE_TOKEN_SIMPLE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_RECURRINGTASK_INVALID_MINUTE_TOKEN_SIMPLE_420",BACKEND,SEVERE_ERROR,420, getClassLoader());

  /**
   * The provided recurring task schedule value has an invalid hour token
   */
  public static final MessageDescriptor.Arg0 ERR_RECURRINGTASK_INVALID_HOUR_TOKEN_SIMPLE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_RECURRINGTASK_INVALID_HOUR_TOKEN_SIMPLE_421",BACKEND,SEVERE_ERROR,421, getClassLoader());

  /**
   * The provided recurring task schedule value has an invalid day of the month token
   */
  public static final MessageDescriptor.Arg0 ERR_RECURRINGTASK_INVALID_DAY_TOKEN_SIMPLE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_RECURRINGTASK_INVALID_DAY_TOKEN_SIMPLE_422",BACKEND,SEVERE_ERROR,422, getClassLoader());

  /**
   * The provided recurring task schedule value has an invalid month of the year token
   */
  public static final MessageDescriptor.Arg0 ERR_RECURRINGTASK_INVALID_MONTH_TOKEN_SIMPLE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_RECURRINGTASK_INVALID_MONTH_TOKEN_SIMPLE_423",BACKEND,SEVERE_ERROR,423, getClassLoader());

  /**
   * The provided recurring task schedule value has an invalid day of the week token
   */
  public static final MessageDescriptor.Arg0 ERR_RECURRINGTASK_INVALID_WEEKDAY_TOKEN_SIMPLE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_RECURRINGTASK_INVALID_WEEKDAY_TOKEN_SIMPLE_424",BACKEND,SEVERE_ERROR,424, getClassLoader());

  /**
   * The schema backend does not support the Replace modification type for the %s attribute type
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SCHEMA_INVALID_REPLACE_MODIFICATION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SCHEMA_INVALID_REPLACE_MODIFICATION_425",BACKEND,MILD_ERROR,425, getClassLoader());


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
            Class<?> c = Class.forName("org.opends.messages.BackendMessages");

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
      cl = BackendMessages.class.getClassLoader();
    }
    return cl;
  }
}
