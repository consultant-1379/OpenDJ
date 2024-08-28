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
public final class JebMessages {

  /** Base property for resource bundle containing messages */
  private static final String BASE = "messages/jeb";

  private static ClassLoader webstartClassLoader;

  // Prevent instantiation.
  private JebMessages() {
    // Do nothing.
  }

  /**
   * The backend does not contain that part of the Directory Information Tree pertaining to the entry '%s'
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_INCORRECT_ROUTING =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_JEB_INCORRECT_ROUTING_1",JEB,MILD_ERROR,1, getClassLoader());

  /**
   * The database could not be opened: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_OPEN_DATABASE_FAIL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_JEB_OPEN_DATABASE_FAIL_2",JEB,SEVERE_ERROR,2, getClassLoader());

  /**
   * The database environment could not be opened: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_OPEN_ENV_FAIL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_JEB_OPEN_ENV_FAIL_3",JEB,SEVERE_ERROR,3, getClassLoader());

  /**
   * The database highest entry identifier could not be determined
   */
  public static final MessageDescriptor.Arg0 ERR_JEB_HIGHEST_ID_FAIL =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_JEB_HIGHEST_ID_FAIL_5",JEB,SEVERE_ERROR,5, getClassLoader());

  /**
   * The requested operation is not supported by this backend
   */
  public static final MessageDescriptor.Arg0 WARN_JEB_FUNCTION_NOT_SUPPORTED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_WARN_JEB_FUNCTION_NOT_SUPPORTED_6",JEB,SEVERE_WARNING,6, getClassLoader());

  /**
   * The backend database directory could not be created: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_CREATE_FAIL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_JEB_CREATE_FAIL_7",JEB,SEVERE_ERROR,7, getClassLoader());

  /**
   * The backend database files could not be removed: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_REMOVE_FAIL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_JEB_REMOVE_FAIL_8",JEB,SEVERE_ERROR,8, getClassLoader());

  /**
   * The backend database directory '%s' is not a valid directory
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_DIRECTORY_INVALID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_JEB_DIRECTORY_INVALID_9",JEB,SEVERE_ERROR,9, getClassLoader());

  /**
   * The DN database does not contain a record for '%s'
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_MISSING_DN2ID_RECORD =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_JEB_MISSING_DN2ID_RECORD_10",JEB,SEVERE_ERROR,10, getClassLoader());

  /**
   * The entry database does not contain a record for ID %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_MISSING_ID2ENTRY_RECORD =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_JEB_MISSING_ID2ENTRY_RECORD_11",JEB,SEVERE_ERROR,11, getClassLoader());

  /**
   * The entry database does not contain a valid record for ID %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_ENTRY_DATABASE_CORRUPT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_JEB_ENTRY_DATABASE_CORRUPT_12",JEB,SEVERE_ERROR,12, getClassLoader());

  /**
   * Database exception: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_DATABASE_EXCEPTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_JEB_DATABASE_EXCEPTION_14",JEB,SEVERE_ERROR,14, getClassLoader());

  /**
   * An entry container named '%s' is alreadly registered for base DN '%s'
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_JEB_ENTRY_CONTAINER_ALREADY_REGISTERED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_JEB_ENTRY_CONTAINER_ALREADY_REGISTERED_15",JEB,SEVERE_ERROR,15, getClassLoader());

  /**
   * The attribute '%s' cannot have indexing of type '%s' because it does not have a corresponding matching rule
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_INDEX_TYPE_NEEDS_MATCHING_RULE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_INDEX_TYPE_NEEDS_MATCHING_RULE_26",JEB,SEVERE_ERROR,26, getClassLoader());

  /**
   * Unchecked exception during database transaction: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_UNCHECKED_EXCEPTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_JEB_UNCHECKED_EXCEPTION_28",JEB,MILD_ERROR,28, getClassLoader());

  /**
   * Starting database cleaning on %d log file(s) in '%s'
   */
  public static final MessageDescriptor.Arg2<Number,CharSequence> NOTE_JEB_CLEAN_DATABASE_START =
          new MessageDescriptor.Arg2<Number,CharSequence>(BASE,"NOTICE_JEB_CLEAN_DATABASE_START_29",JEB,NOTICE,29, getClassLoader());

  /**
   * Marked %d log file(s) for cleaning
   */
  public static final MessageDescriptor.Arg1<Number> NOTE_JEB_CLEAN_DATABASE_MARKED =
          new MessageDescriptor.Arg1<Number>(BASE,"NOTICE_JEB_CLEAN_DATABASE_MARKED_30",JEB,NOTICE,30, getClassLoader());

  /**
   * Finished database cleaning; now %d log file(s) remaining
   */
  public static final MessageDescriptor.Arg1<Number> NOTE_JEB_CLEAN_DATABASE_FINISH =
          new MessageDescriptor.Arg1<Number>(BASE,"NOTICE_JEB_CLEAN_DATABASE_FINISH_31",JEB,NOTICE,31, getClassLoader());

  /**
   * The number of entries deleted was %d
   */
  public static final MessageDescriptor.Arg1<Number> NOTE_JEB_DELETED_ENTRY_COUNT =
          new MessageDescriptor.Arg1<Number>(BASE,"NOTICE_JEB_DELETED_ENTRY_COUNT_33",JEB,NOTICE,33, getClassLoader());

  /**
   * The configuration entry '%s' will be ignored. Only one configuration entry with object class '%s' is allowed
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_JEB_DUPLICATE_CONFIG_ENTRY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_JEB_DUPLICATE_CONFIG_ENTRY_36",JEB,MILD_ERROR,36, getClassLoader());

  /**
   * The configuration entry '%s' will be ignored because it is not recognized
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_CONFIG_ENTRY_NOT_RECOGNIZED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_JEB_CONFIG_ENTRY_NOT_RECOGNIZED_37",JEB,MILD_ERROR,37, getClassLoader());

  /**
   * The index configuration entry '%s' will be ignored because it specifies an unknown attribute type '%s'
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_JEB_INDEX_ATTRIBUTE_TYPE_NOT_FOUND =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_JEB_INDEX_ATTRIBUTE_TYPE_NOT_FOUND_38",JEB,MILD_ERROR,38, getClassLoader());

  /**
   * The index configuration entry '%s' will be ignored because it specifies the attribute type '%s', which has already been defined in another index configuration entry
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_JEB_DUPLICATE_INDEX_CONFIG =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_JEB_DUPLICATE_INDEX_CONFIG_39",JEB,MILD_ERROR,39, getClassLoader());

  /**
   * The database backend %s containing %d entries has started
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> NOTE_JEB_BACKEND_STARTED =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"NOTICE_JEB_BACKEND_STARTED_42",JEB,NOTICE,42, getClassLoader());

  /**
   * The parent entry '%s' does not exist
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_IMPORT_PARENT_NOT_FOUND =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_JEB_IMPORT_PARENT_NOT_FOUND_43",JEB,MILD_ERROR,43, getClassLoader());

  /**
   * The entry exists and the import options do not allow it to be replaced
   */
  public static final MessageDescriptor.Arg0 WARN_JEB_IMPORT_ENTRY_EXISTS =
          new MessageDescriptor.Arg0(BASE,"SEVERE_WARN_JEB_IMPORT_ENTRY_EXISTS_44",JEB,SEVERE_WARNING,44, getClassLoader());

  /**
   * There is no index configured for attribute type '%s'
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_ATTRIBUTE_INDEX_NOT_CONFIGURED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_JEB_ATTRIBUTE_INDEX_NOT_CONFIGURED_45",JEB,MILD_ERROR,45, getClassLoader());

  /**
   * The search base entry '%s' does not exist
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_SEARCH_NO_SUCH_OBJECT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_JEB_SEARCH_NO_SUCH_OBJECT_46",JEB,MILD_ERROR,46, getClassLoader());

  /**
   * The entry '%s' cannot be added because its parent entry does not exist
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_ADD_NO_SUCH_OBJECT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_JEB_ADD_NO_SUCH_OBJECT_47",JEB,MILD_ERROR,47, getClassLoader());

  /**
   * The entry '%s' cannot be removed because it does not exist
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_DELETE_NO_SUCH_OBJECT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_JEB_DELETE_NO_SUCH_OBJECT_48",JEB,MILD_ERROR,48, getClassLoader());

  /**
   * The entry '%s' cannot be modified because it does not exist
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_MODIFY_NO_SUCH_OBJECT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_JEB_MODIFY_NO_SUCH_OBJECT_49",JEB,MILD_ERROR,49, getClassLoader());

  /**
   * The entry '%s' cannot be renamed because it does not exist
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_MODIFYDN_NO_SUCH_OBJECT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_JEB_MODIFYDN_NO_SUCH_OBJECT_50",JEB,MILD_ERROR,50, getClassLoader());

  /**
   * The entry '%s' cannot be added because an entry with that name already exists
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_ADD_ENTRY_ALREADY_EXISTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_JEB_ADD_ENTRY_ALREADY_EXISTS_51",JEB,MILD_ERROR,51, getClassLoader());

  /**
   * The entry '%s' cannot be removed because it has subordinate entries
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_DELETE_NOT_ALLOWED_ON_NONLEAF =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_JEB_DELETE_NOT_ALLOWED_ON_NONLEAF_52",JEB,MILD_ERROR,52, getClassLoader());

  /**
   * The entry cannot be renamed to '%s' because an entry with that name already exists
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_MODIFYDN_ALREADY_EXISTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_JEB_MODIFYDN_ALREADY_EXISTS_53",JEB,MILD_ERROR,53, getClassLoader());

  /**
   * The entry cannot be moved because the new parent entry '%s' does not exist
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_NEW_SUPERIOR_NO_SUCH_OBJECT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_JEB_NEW_SUPERIOR_NO_SUCH_OBJECT_54",JEB,MILD_ERROR,54, getClassLoader());

  /**
   * The database cache preload for backend %s has started
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_JEB_CACHE_PRELOAD_STARTED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_JEB_CACHE_PRELOAD_STARTED_55",JEB,NOTICE,55, getClassLoader());

  /**
   * The database cache preload for database %s is complete
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_JEB_CACHE_DB_PRELOADED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_JEB_CACHE_DB_PRELOADED_56",JEB,NOTICE,56, getClassLoader());

  /**
   * The database cache preload for backend %s has been interrupted while preloading database %s due to time limit
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> NOTE_JEB_CACHE_PRELOAD_INTERRUPTED_BY_TIME =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"NOTICE_JEB_CACHE_PRELOAD_INTERRUPTED_BY_TIME_57",JEB,NOTICE,57, getClassLoader());

  /**
   * The database cache preload for backend %s has been interrupted while preloading database %s due to size limit
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> NOTE_JEB_CACHE_PRELOAD_INTERRUPTED_BY_SIZE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"NOTICE_JEB_CACHE_PRELOAD_INTERRUPTED_BY_SIZE_58",JEB,NOTICE,58, getClassLoader());

  /**
   * The database cache preload for backend %s has been interrupted while preloading database %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> NOTE_JEB_CACHE_PRELOAD_INTERRUPTED_UNKNOWN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"NOTICE_JEB_CACHE_PRELOAD_INTERRUPTED_UNKNOWN_59",JEB,NOTICE,59, getClassLoader());

  /**
   * The database cache preload for backend %s is complete
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_JEB_CACHE_PRELOAD_DONE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_JEB_CACHE_PRELOAD_DONE_60",JEB,NOTICE,60, getClassLoader());

  /**
   * The database cache is %d MB after pre-loading
   */
  public static final MessageDescriptor.Arg1<Number> NOTE_JEB_CACHE_SIZE_AFTER_PRELOAD =
          new MessageDescriptor.Arg1<Number>(BASE,"NOTICE_JEB_CACHE_SIZE_AFTER_PRELOAD_61",JEB,NOTICE,61, getClassLoader());

  /**
   * An error occurred while preloading the database cache for backend %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_JEB_CACHE_PRELOAD =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_JEB_CACHE_PRELOAD_62",JEB,SEVERE_ERROR,62, getClassLoader());

  /**
   * An error occurred while attempting to obtain the %s MAC provider to create the signed hash for the backup:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_JEB_BACKUP_CANNOT_GET_MAC =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_JEB_BACKUP_CANNOT_GET_MAC_63",JEB,SEVERE_ERROR,63, getClassLoader());

  /**
   * An error occurred while attempting to obtain the %s message digest to create the hash for the backup:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_JEB_BACKUP_CANNOT_GET_DIGEST =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_JEB_BACKUP_CANNOT_GET_DIGEST_64",JEB,SEVERE_ERROR,64, getClassLoader());

  /**
   * An error occurred while trying to create the database archive file %s in directory %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_JEB_BACKUP_CANNOT_CREATE_ARCHIVE_FILE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_JEB_BACKUP_CANNOT_CREATE_ARCHIVE_FILE_65",JEB,SEVERE_ERROR,65, getClassLoader());

  /**
   * An error occurred while attempting to obtain the cipher to use to encrypt the backup:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_BACKUP_CANNOT_GET_CIPHER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_JEB_BACKUP_CANNOT_GET_CIPHER_66",JEB,SEVERE_ERROR,66, getClassLoader());

  /**
   * %s backup %s of backend %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_JEB_BACKUP_ZIP_COMMENT =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_JEB_BACKUP_ZIP_COMMENT_67",JEB,SEVERE_ERROR,67, getClassLoader());

  /**
   * An error occurred while attempting to obtain a list of the files in directory %s to include in the database backup:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_JEB_BACKUP_CANNOT_LIST_LOG_FILES =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_JEB_BACKUP_CANNOT_LIST_LOG_FILES_68",JEB,SEVERE_ERROR,68, getClassLoader());

  /**
   * An error occurred while attempting to back up database file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_JEB_BACKUP_CANNOT_WRITE_ARCHIVE_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_JEB_BACKUP_CANNOT_WRITE_ARCHIVE_FILE_69",JEB,SEVERE_ERROR,69, getClassLoader());

  /**
   * An error occurred while trying to close the database archive file %s in directory %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_JEB_BACKUP_CANNOT_CLOSE_ZIP_STREAM =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_JEB_BACKUP_CANNOT_CLOSE_ZIP_STREAM_70",JEB,SEVERE_ERROR,70, getClassLoader());

  /**
   * An error occurred while attempting to update the backup descriptor file %s with information about the database backup:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_JEB_BACKUP_CANNOT_UPDATE_BACKUP_DESCRIPTOR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_JEB_BACKUP_CANNOT_UPDATE_BACKUP_DESCRIPTOR_71",JEB,SEVERE_ERROR,71, getClassLoader());

  /**
   * The computed hash of backup %s is different to the value computed at time of backup
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_BACKUP_UNSIGNED_HASH_ERROR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_JEB_BACKUP_UNSIGNED_HASH_ERROR_72",JEB,SEVERE_ERROR,72, getClassLoader());

  /**
   * The computed signed hash of backup %s is different to the value computed at time of backup
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_BACKUP_SIGNED_HASH_ERROR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_JEB_BACKUP_SIGNED_HASH_ERROR_73",JEB,SEVERE_ERROR,73, getClassLoader());

  /**
   * A full backup must be taken before an incremental backup can be taken
   */
  public static final MessageDescriptor.Arg0 ERR_JEB_INCR_BACKUP_REQUIRES_FULL =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_JEB_INCR_BACKUP_REQUIRES_FULL_74",JEB,SEVERE_ERROR,74, getClassLoader());

  /**
   * The directory %s, containing the files restored from backup, could not be renamed to the backend directory %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_JEB_CANNOT_RENAME_RESTORE_DIRECTORY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_JEB_CANNOT_RENAME_RESTORE_DIRECTORY_75",JEB,SEVERE_ERROR,75, getClassLoader());

  /**
   * One of the following base backup IDs must be specified for the incremental backup: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_INCR_BACKUP_FROM_WRONG_BASE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_JEB_INCR_BACKUP_FROM_WRONG_BASE_76",JEB,SEVERE_ERROR,76, getClassLoader());

  /**
   * The backup tag file %s could not be created in %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_JEB_CANNOT_CREATE_BACKUP_TAG_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_JEB_CANNOT_CREATE_BACKUP_TAG_FILE_77",JEB,SEVERE_ERROR,77, getClassLoader());

  /**
   * An error occurred while attempting to restore the files from backup %s: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_JEB_BACKUP_CANNOT_RESTORE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_JEB_BACKUP_CANNOT_RESTORE_78",JEB,SEVERE_ERROR,78, getClassLoader());

  /**
   * The information for backup %s could not be found in the backup directory %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_JEB_BACKUP_MISSING_BACKUPID =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_JEB_BACKUP_MISSING_BACKUPID_79",JEB,SEVERE_ERROR,79, getClassLoader());

  /**
   * Not changed: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_JEB_BACKUP_FILE_UNCHANGED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_JEB_BACKUP_FILE_UNCHANGED_82",JEB,NOTICE,82, getClassLoader());

  /**
   * Including %s additional log file(s) due to cleaner activity
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_JEB_BACKUP_CLEANER_ACTIVITY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_JEB_BACKUP_CLEANER_ACTIVITY_83",JEB,NOTICE,83, getClassLoader());

  /**
   * Verifying: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_JEB_BACKUP_VERIFY_FILE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_JEB_BACKUP_VERIFY_FILE_84",JEB,NOTICE,84, getClassLoader());

  /**
   * Restored: %s (size %d)
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> NOTE_JEB_BACKUP_RESTORED_FILE =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"NOTICE_JEB_BACKUP_RESTORED_FILE_85",JEB,NOTICE,85, getClassLoader());

  /**
   * Archived: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_JEB_BACKUP_ARCHIVED_FILE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_JEB_BACKUP_ARCHIVED_FILE_86",JEB,NOTICE,86, getClassLoader());

  /**
   * Exported %d entries and skipped %d in %d seconds (average rate %.1f/sec)
   */
  public static final MessageDescriptor.Arg4<Number,Number,Number,Number> NOTE_JEB_EXPORT_FINAL_STATUS =
          new MessageDescriptor.Arg4<Number,Number,Number,Number>(BASE,"NOTICE_JEB_EXPORT_FINAL_STATUS_87",JEB,NOTICE,87, getClassLoader());

  /**
   * Exported %d records and skipped %d (recent rate %.1f/sec)
   */
  public static final MessageDescriptor.Arg3<Number,Number,Number> NOTE_JEB_EXPORT_PROGRESS_REPORT =
          new MessageDescriptor.Arg3<Number,Number,Number>(BASE,"NOTICE_JEB_EXPORT_PROGRESS_REPORT_88",JEB,NOTICE,88, getClassLoader());

  /**
   * Import Thread Count: %d threads
   */
  public static final MessageDescriptor.Arg1<Number> NOTE_JEB_IMPORT_THREAD_COUNT =
          new MessageDescriptor.Arg1<Number>(BASE,"NOTICE_JEB_IMPORT_THREAD_COUNT_89",JEB,NOTICE,89, getClassLoader());

  /**
   * Insufficient free memory (%d bytes) to perform import. At least %d bytes of free memory is required
   */
  public static final MessageDescriptor.Arg2<Number,Number> ERR_IMPORT_LDIF_LACK_MEM =
          new MessageDescriptor.Arg2<Number,Number>(BASE,"SEVERE_ERR_IMPORT_LDIF_LACK_MEM_90",JEB,SEVERE_ERROR,90, getClassLoader());

  /**
   * LDIF processing took %d seconds
   */
  public static final MessageDescriptor.Arg1<Number> INFO_JEB_IMPORT_LDIF_PROCESSING_TIME =
          new MessageDescriptor.Arg1<Number>(BASE,"INFO_JEB_IMPORT_LDIF_PROCESSING_TIME_91",JEB,INFORMATION,91, getClassLoader());

  /**
   * Index processing took %d seconds
   */
  public static final MessageDescriptor.Arg1<Number> INFO_JEB_IMPORT_INDEX_PROCESSING_TIME =
          new MessageDescriptor.Arg1<Number>(BASE,"INFO_JEB_IMPORT_INDEX_PROCESSING_TIME_92",JEB,INFORMATION,92, getClassLoader());

  /**
   * Flushing data to disk
   */
  public static final MessageDescriptor.Arg0 NOTE_JEB_IMPORT_CLOSING_DATABASE =
          new MessageDescriptor.Arg0(BASE,"NOTICE_JEB_IMPORT_CLOSING_DATABASE_93",JEB,NOTICE,93, getClassLoader());

  /**
   * Processed %d entries, imported %d, skipped %d, rejected %d and migrated %d in %d seconds (average rate %.1f/sec)
   */
  public static final MessageDescriptor.Arg7<Number,Number,Number,Number,Number,Number,Number> NOTE_JEB_IMPORT_FINAL_STATUS =
          new MessageDescriptor.Arg7<Number,Number,Number,Number,Number,Number,Number>(BASE,"NOTICE_JEB_IMPORT_FINAL_STATUS_94",JEB,NOTICE,94, getClassLoader());

  /**
   * Number of index values that exceeded the entry limit: %d
   */
  public static final MessageDescriptor.Arg1<Number> NOTE_JEB_IMPORT_ENTRY_LIMIT_EXCEEDED_COUNT =
          new MessageDescriptor.Arg1<Number>(BASE,"NOTICE_JEB_IMPORT_ENTRY_LIMIT_EXCEEDED_COUNT_95",JEB,NOTICE,95, getClassLoader());

  /**
   * Processed %d entries, skipped %d, rejected %d, and migrated %d (recent rate %.1f/sec)
   */
  public static final MessageDescriptor.Arg5<Number,Number,Number,Number,Number> NOTE_JEB_IMPORT_PROGRESS_REPORT =
          new MessageDescriptor.Arg5<Number,Number,Number,Number,Number>(BASE,"NOTICE_JEB_IMPORT_PROGRESS_REPORT_96",JEB,NOTICE,96, getClassLoader());

  /**
   * Free memory = %d MB, Cache miss rate = %.1f/entry
   */
  public static final MessageDescriptor.Arg2<Number,Number> NOTE_JEB_IMPORT_CACHE_AND_MEMORY_REPORT =
          new MessageDescriptor.Arg2<Number,Number>(BASE,"NOTICE_JEB_IMPORT_CACHE_AND_MEMORY_REPORT_97",JEB,NOTICE,97, getClassLoader());

  /**
   * Checked %d records and found %d error(s) in %d seconds (average rate %.1f/sec)
   */
  public static final MessageDescriptor.Arg4<Number,Number,Number,Number> NOTE_JEB_VERIFY_CLEAN_FINAL_STATUS =
          new MessageDescriptor.Arg4<Number,Number,Number,Number>(BASE,"NOTICE_JEB_VERIFY_CLEAN_FINAL_STATUS_101",JEB,NOTICE,101, getClassLoader());

  /**
   * Number of records referencing more than one entry: %d
   */
  public static final MessageDescriptor.Arg1<Number> INFO_JEB_VERIFY_MULTIPLE_REFERENCE_COUNT =
          new MessageDescriptor.Arg1<Number>(BASE,"INFO_JEB_VERIFY_MULTIPLE_REFERENCE_COUNT_102",JEB,INFORMATION,102, getClassLoader());

  /**
   * Number of records that exceed the entry limit: %d
   */
  public static final MessageDescriptor.Arg1<Number> INFO_JEB_VERIFY_ENTRY_LIMIT_EXCEEDED_COUNT =
          new MessageDescriptor.Arg1<Number>(BASE,"INFO_JEB_VERIFY_ENTRY_LIMIT_EXCEEDED_COUNT_103",JEB,INFORMATION,103, getClassLoader());

  /**
   * Average number of entries referenced is %.2f/record
   */
  public static final MessageDescriptor.Arg1<Number> INFO_JEB_VERIFY_AVERAGE_REFERENCE_COUNT =
          new MessageDescriptor.Arg1<Number>(BASE,"INFO_JEB_VERIFY_AVERAGE_REFERENCE_COUNT_104",JEB,INFORMATION,104, getClassLoader());

  /**
   * Maximum number of entries referenced by any record is %d
   */
  public static final MessageDescriptor.Arg1<Number> INFO_JEB_VERIFY_MAX_REFERENCE_COUNT =
          new MessageDescriptor.Arg1<Number>(BASE,"INFO_JEB_VERIFY_MAX_REFERENCE_COUNT_105",JEB,INFORMATION,105, getClassLoader());

  /**
   * Checked %d entries and found %d error(s) in %d seconds (average rate %.1f/sec)
   */
  public static final MessageDescriptor.Arg4<Number,Number,Number,Number> NOTE_JEB_VERIFY_FINAL_STATUS =
          new MessageDescriptor.Arg4<Number,Number,Number,Number>(BASE,"NOTICE_JEB_VERIFY_FINAL_STATUS_106",JEB,NOTICE,106, getClassLoader());

  /**
   * Statistics for records that have exceeded the entry limit:
   */
  public static final MessageDescriptor.Arg0 INFO_JEB_VERIFY_ENTRY_LIMIT_STATS_HEADER =
          new MessageDescriptor.Arg0(BASE,"INFO_JEB_VERIFY_ENTRY_LIMIT_STATS_HEADER_107",JEB,INFORMATION,107, getClassLoader());

  /**
   * File %s has %d such record(s) min=%d max=%d median=%d
   */
  public static final MessageDescriptor.Arg5<CharSequence,Number,Number,Number,Number> INFO_JEB_VERIFY_ENTRY_LIMIT_STATS_ROW =
          new MessageDescriptor.Arg5<CharSequence,Number,Number,Number,Number>(BASE,"INFO_JEB_VERIFY_ENTRY_LIMIT_STATS_ROW_108",JEB,INFORMATION,108, getClassLoader());

  /**
   * Processed %d out of %d records and found %d error(s) (recent rate %.1f/sec)
   */
  public static final MessageDescriptor.Arg4<Number,Number,Number,Number> NOTE_JEB_VERIFY_PROGRESS_REPORT =
          new MessageDescriptor.Arg4<Number,Number,Number,Number>(BASE,"NOTICE_JEB_VERIFY_PROGRESS_REPORT_109",JEB,NOTICE,109, getClassLoader());

  /**
   * Free memory = %d MB, Cache miss rate = %.1f/record
   */
  public static final MessageDescriptor.Arg2<Number,Number> INFO_JEB_VERIFY_CACHE_AND_MEMORY_REPORT =
          new MessageDescriptor.Arg2<Number,Number>(BASE,"INFO_JEB_VERIFY_CACHE_AND_MEMORY_REPORT_110",JEB,INFORMATION,110, getClassLoader());

  /**
   * The following paged results control cookie value was not recognized: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_INVALID_PAGED_RESULTS_COOKIE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_JEB_INVALID_PAGED_RESULTS_COOKIE_111",JEB,MILD_ERROR,111, getClassLoader());

  /**
   * A referral entry %s indicates that the operation must be processed at a different server
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_JEB_REFERRAL_RESULT_MESSAGE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_JEB_REFERRAL_RESULT_MESSAGE_112",JEB,NOTICE,112, getClassLoader());

  /**
   * Database environment properties: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_JEB_IMPORT_ENVIRONMENT_CONFIG =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_JEB_IMPORT_ENVIRONMENT_CONFIG_119",JEB,INFORMATION,119, getClassLoader());

  /**
   * Entry record is not compatible with this version of the backend database. Entry version: %x
   */
  public static final MessageDescriptor.Arg1<Number> ERR_JEB_INCOMPATIBLE_ENTRY_VERSION =
          new MessageDescriptor.Arg1<Number>(BASE,"SEVERE_ERR_JEB_INCOMPATIBLE_ENTRY_VERSION_126",JEB,SEVERE_ERROR,126, getClassLoader());

  /**
   * This search operation has checked the maximum of %d entries for matches
   */
  public static final MessageDescriptor.Arg1<Number> NOTE_JEB_LOOKTHROUGH_LIMIT_EXCEEDED =
          new MessageDescriptor.Arg1<Number>(BASE,"NOTICE_JEB_LOOKTHROUGH_LIMIT_EXCEEDED_127",JEB,NOTICE,127, getClassLoader());

  /**
   * An error occurred while setting file permissions for the backend database directory %s: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_JEB_SET_PERMISSIONS_FAILED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_JEB_SET_PERMISSIONS_FAILED_128",JEB,SEVERE_WARNING,128, getClassLoader());

  /**
   * Unable to determine the total number of entries in the container: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_JEB_GET_ENTRY_COUNT_FAILED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_JEB_GET_ENTRY_COUNT_FAILED_129",JEB,SEVERE_WARNING,129, getClassLoader());

  /**
   * The change to the %s attribute will not take effect until the backend is restarted
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_JEB_CONFIG_ATTR_REQUIRES_RESTART =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_JEB_CONFIG_ATTR_REQUIRES_RESTART_130",JEB,NOTICE,130, getClassLoader());

  /**
   * %.1f%% Completed. Processed %d/%d entries. (recent rate %.1f/sec)
   */
  public static final MessageDescriptor.Arg4<Number,Number,Number,Number> NOTE_JEB_REBUILD_PROGRESS_REPORT =
          new MessageDescriptor.Arg4<Number,Number,Number,Number>(BASE,"NOTICE_JEB_REBUILD_PROGRESS_REPORT_131",JEB,NOTICE,131, getClassLoader());

  /**
   * Free memory = %d MB, Cache miss rate = %.1f/entries
   */
  public static final MessageDescriptor.Arg2<Number,Number> NOTE_JEB_REBUILD_CACHE_AND_MEMORY_REPORT =
          new MessageDescriptor.Arg2<Number,Number>(BASE,"NOTICE_JEB_REBUILD_CACHE_AND_MEMORY_REPORT_132",JEB,NOTICE,132, getClassLoader());

  /**
   * Rebuild complete. Processed %d entries in %d seconds (average rate %.1f/sec)
   */
  public static final MessageDescriptor.Arg3<Number,Number,Number> NOTE_JEB_REBUILD_FINAL_STATUS =
          new MessageDescriptor.Arg3<Number,Number,Number>(BASE,"NOTICE_JEB_REBUILD_FINAL_STATUS_133",JEB,NOTICE,133, getClassLoader());

  /**
   * An error occurred while rebuilding index %s: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_JEB_REBUILD_INDEX_FAILED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_JEB_REBUILD_INDEX_FAILED_134",JEB,SEVERE_ERROR,134, getClassLoader());

  /**
   * An error occurred while inserting entry into the %s database/index: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_JEB_REBUILD_INSERT_ENTRY_FAILED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_JEB_REBUILD_INSERT_ENTRY_FAILED_135",JEB,MILD_ERROR,135, getClassLoader());

  /**
   * Another rebuild of index %s is already in progress
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_REBUILD_INDEX_CONFLICT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_JEB_REBUILD_INDEX_CONFLICT_136",JEB,SEVERE_ERROR,136, getClassLoader());

  /**
   * Rebuild of index(es) %s started with %d total entries to process
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> NOTE_JEB_REBUILD_START =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"NOTICE_JEB_REBUILD_START_137",JEB,NOTICE,137, getClassLoader());

  /**
   * Rebuilding system index(es) must be done with the backend containing the base DN disabled
   */
  public static final MessageDescriptor.Arg0 ERR_JEB_REBUILD_BACKEND_ONLINE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_JEB_REBUILD_BACKEND_ONLINE_138",JEB,SEVERE_ERROR,138, getClassLoader());

  /**
   * Unable to examine the entry with ID %s for sorting purposes:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ENTRYIDSORTER_CANNOT_EXAMINE_ENTRY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_ENTRYIDSORTER_CANNOT_EXAMINE_ENTRY_139",JEB,SEVERE_ERROR,139, getClassLoader());

  /**
   * The search results cannot be sorted because the given search request is not indexed
   */
  public static final MessageDescriptor.Arg0 ERR_JEB_SEARCH_CANNOT_SORT_UNINDEXED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_JEB_SEARCH_CANNOT_SORT_UNINDEXED_140",JEB,MILD_ERROR,140, getClassLoader());

  /**
   * Unable to process the virtual list view request because the target start position was before the beginning of the result set
   */
  public static final MessageDescriptor.Arg0 ERR_ENTRYIDSORTER_NEGATIVE_START_POS =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_ENTRYIDSORTER_NEGATIVE_START_POS_141",JEB,MILD_ERROR,141, getClassLoader());

  /**
   * Unable to process the virtual list view request because the target offset %d was greater than the total number of results in the list (%d)
   */
  public static final MessageDescriptor.Arg2<Number,Number> ERR_ENTRYIDSORTER_OFFSET_TOO_LARGE =
          new MessageDescriptor.Arg2<Number,Number>(BASE,"MILD_ERR_ENTRYIDSORTER_OFFSET_TOO_LARGE_142",JEB,MILD_ERROR,142, getClassLoader());

  /**
   * Unable to process the virtual list view request because no entry was found in the result set with a sort value greater than or equal to the provided assertion value
   */
  public static final MessageDescriptor.Arg0 ERR_ENTRYIDSORTER_TARGET_VALUE_NOT_FOUND =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_ENTRYIDSORTER_TARGET_VALUE_NOT_FOUND_143",JEB,MILD_ERROR,143, getClassLoader());

  /**
   * The requested search operation included both the simple paged results control and the virtual list view control.  These controls are mutually exclusive and cannot be used together
   */
  public static final MessageDescriptor.Arg0 ERR_JEB_SEARCH_CANNOT_MIX_PAGEDRESULTS_AND_VLV =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_JEB_SEARCH_CANNOT_MIX_PAGEDRESULTS_AND_VLV_144",JEB,MILD_ERROR,144, getClassLoader());

  /**
   * You do not have sufficient privileges to perform an unindexed search
   */
  public static final MessageDescriptor.Arg0 ERR_JEB_SEARCH_UNINDEXED_INSUFFICIENT_PRIVILEGES =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_JEB_SEARCH_UNINDEXED_INSUFFICIENT_PRIVILEGES_145",JEB,MILD_ERROR,145, getClassLoader());

  /**
   * This platform does not support setting file permissions %s to the database directory %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_JEB_UNABLE_SET_PERMISSIONS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_JEB_UNABLE_SET_PERMISSIONS_146",JEB,SEVERE_WARNING,146, getClassLoader());

  /**
   * Some index keys have already exceeded the previous index entry limit in index %s. This index must be rebuilt before it can use the new limit
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_JEB_CONFIG_INDEX_ENTRY_LIMIT_REQUIRES_REBUILD =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_JEB_CONFIG_INDEX_ENTRY_LIMIT_REQUIRES_REBUILD_148",JEB,NOTICE,148, getClassLoader());

  /**
   * Due to changes in the configuration, index %s is currently operating in a degraded state and must be rebuilt before it can be used
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_JEB_INDEX_ADD_REQUIRES_REBUILD =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_JEB_INDEX_ADD_REQUIRES_REBUILD_150",JEB,NOTICE,150, getClassLoader());

  /**
   * An error occurred while reading from index %s. The index seems to be corrupt and is now operating in a degraded state. The index must be rebuilt before it can return to normal operation
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_INDEX_CORRUPT_REQUIRES_REBUILD =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_JEB_INDEX_CORRUPT_REQUIRES_REBUILD_151",JEB,SEVERE_ERROR,151, getClassLoader());

  /**
   * The backend must be disabled before the import process can start
   */
  public static final MessageDescriptor.Arg0 ERR_JEB_IMPORT_BACKEND_ONLINE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_JEB_IMPORT_BACKEND_ONLINE_152",JEB,SEVERE_ERROR,152, getClassLoader());

  /**
   * An error occurred in import thread %s: %s. The thread can not continue
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_JEB_IMPORT_THREAD_EXCEPTION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_JEB_IMPORT_THREAD_EXCEPTION_153",JEB,SEVERE_ERROR,153, getClassLoader());

  /**
   * Index %s %d%% complete: remaining = %d kb, rate = %d kb/s; batch %d/%d
   */
  public static final MessageDescriptor.Arg6<CharSequence,Number,Number,Number,Number,Number> NOTE_JEB_IMPORT_LDIF_PHASE_TWO_REPORT =
          new MessageDescriptor.Arg6<CharSequence,Number,Number,Number,Number,Number>(BASE,"NOTICE_JEB_IMPORT_LDIF_PHASE_TWO_REPORT_154",JEB,NOTICE,154, getClassLoader());

  /**
   * Unable to create the temporary directory %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_IMPORT_CREATE_TMPDIR_ERROR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_JEB_IMPORT_CREATE_TMPDIR_ERROR_155",JEB,SEVERE_ERROR,155, getClassLoader());

  /**
   * The database logging level string '%s' provided for configuration entry '%s' is invalid.  The value must be one of OFF, SEVERE, WARNING, INFO, CONFIG, FINE, FINER, FINEST, or ALL.  Note that these values are case sensitive
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_JEB_INVALID_LOGGING_LEVEL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_JEB_INVALID_LOGGING_LEVEL_156",JEB,SEVERE_ERROR,156, getClassLoader());

  /**
   * Migrating %s entries for base DN %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> NOTE_JEB_IMPORT_MIGRATION_START =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"NOTICE_JEB_IMPORT_MIGRATION_START_157",JEB,NOTICE,157, getClassLoader());

  /**
   * Processing LDIF
   */
  public static final MessageDescriptor.Arg0 NOTE_JEB_IMPORT_LDIF_START =
          new MessageDescriptor.Arg0(BASE,"NOTICE_JEB_IMPORT_LDIF_START_158",JEB,NOTICE,158, getClassLoader());

  /**
   * End of LDIF reached
   */
  public static final MessageDescriptor.Arg0 NOTE_JEB_IMPORT_LDIF_END =
          new MessageDescriptor.Arg0(BASE,"NOTICE_JEB_IMPORT_LDIF_END_159",JEB,NOTICE,159, getClassLoader());

  /**
   * Sort attribute %s for VLV index %s is not defined in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_JEB_CONFIG_VLV_INDEX_UNDEFINED_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_JEB_CONFIG_VLV_INDEX_UNDEFINED_ATTR_160",JEB,SEVERE_ERROR,160, getClassLoader());

  /**
   * An error occurred while parsing the search filter %s defined for VLV index %s: %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_JEB_CONFIG_VLV_INDEX_BAD_FILTER =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_JEB_CONFIG_VLV_INDEX_BAD_FILTER_161",JEB,SEVERE_ERROR,161, getClassLoader());

  /**
   * There is no VLV index configured with name '%s'
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_VLV_INDEX_NOT_CONFIGURED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_JEB_VLV_INDEX_NOT_CONFIGURED_162",JEB,MILD_ERROR,162, getClassLoader());

  /**
   * A plugin caused the modify DN operation to be aborted while moving and/or renaming an entry from %s to %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_JEB_MODIFYDN_ABORTED_BY_SUBORDINATE_PLUGIN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_JEB_MODIFYDN_ABORTED_BY_SUBORDINATE_PLUGIN_163",JEB,MILD_ERROR,163, getClassLoader());

  /**
   * A plugin caused the modify DN operation to be aborted while moving and/or renaming an entry from %s to %s because the change to that entry violated the server schema configuration:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_JEB_MODIFYDN_ABORTED_BY_SUBORDINATE_SCHEMA_ERROR =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_JEB_MODIFYDN_ABORTED_BY_SUBORDINATE_SCHEMA_ERROR_164",JEB,MILD_ERROR,164, getClassLoader());

  /**
   * An error occurred while attempting to decode an object class set token from the JE compressed schema definitions:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_COMPSCHEMA_CANNOT_DECODE_OC_TOKEN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_JEB_COMPSCHEMA_CANNOT_DECODE_OC_TOKEN_165",JEB,SEVERE_ERROR,165, getClassLoader());

  /**
   * An error occurred while attempting to decode an attribute description token from the JE compressed schema definitions:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_COMPSCHEMA_CANNOT_DECODE_AD_TOKEN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_JEB_COMPSCHEMA_CANNOT_DECODE_AD_TOKEN_166",JEB,SEVERE_ERROR,166, getClassLoader());

  /**
   * An error occurred while attempting to store compressed schema information in the database.  The result returned was:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_COMPSCHEMA_CANNOT_STORE_STATUS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_JEB_COMPSCHEMA_CANNOT_STORE_STATUS_167",JEB,SEVERE_ERROR,167, getClassLoader());

  /**
   * An error occurred while attempting to store compressed schema information in the database:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_COMPSCHEMA_CANNOT_STORE_EX =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_JEB_COMPSCHEMA_CANNOT_STORE_EX_168",JEB,SEVERE_ERROR,168, getClassLoader());

  /**
   * The server was unable to store compressed schema information in the database after multiple attempts
   */
  public static final MessageDescriptor.Arg0 ERR_JEB_COMPSCHEMA_CANNOT_STORE_MULTIPLE_FAILURES =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_JEB_COMPSCHEMA_CANNOT_STORE_MULTIPLE_FAILURES_169",JEB,SEVERE_ERROR,169, getClassLoader());

  /**
   * Unable to decode the provided object class set because it used an undefined token %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_COMPSCHEMA_UNKNOWN_OC_TOKEN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_JEB_COMPSCHEMA_UNKNOWN_OC_TOKEN_170",JEB,SEVERE_ERROR,170, getClassLoader());

  /**
   * Unable to decode the provided attribute because it used an undefined attribute description token %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_COMPSCHEMA_UNRECOGNIZED_AD_TOKEN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_JEB_COMPSCHEMA_UNRECOGNIZED_AD_TOKEN_171",JEB,SEVERE_ERROR,171, getClassLoader());

  /**
   * The change to the DB directory will not take effect until the backend is restarted. The DB files from the previous directory %s must be moved to the new directory %s after shutting down the backend to retain the existing data
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> NOTE_JEB_CONFIG_DB_DIR_REQUIRES_RESTART =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"NOTICE_JEB_CONFIG_DB_DIR_REQUIRES_RESTART_172",JEB,NOTICE,172, getClassLoader());

  /**
   * %s starting import (build %s, R%d)
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> NOTE_JEB_IMPORT_STARTING =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"NOTICE_JEB_IMPORT_STARTING_173",JEB,NOTICE,173, getClassLoader());

  /**
   * The backend database directory '%s' does not exist
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_DIRECTORY_DOES_NOT_EXIST =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_JEB_DIRECTORY_DOES_NOT_EXIST_174",JEB,SEVERE_ERROR,174, getClassLoader());

  /**
   * The following I/O error was received while writing the %s index scratch file in the temporary directory: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_JEB_IMPORT_LDIF_INDEX_FILEWRITER_ERR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_JEB_IMPORT_LDIF_INDEX_FILEWRITER_ERR_175",JEB,SEVERE_ERROR,175, getClassLoader());

  /**
   * Import LDIF environment close took %d seconds
   */
  public static final MessageDescriptor.Arg1<Number> NOTE_JEB_IMPORT_LDIF_ROOTCONTAINER_CLOSE =
          new MessageDescriptor.Arg1<Number>(BASE,"NOTICE_JEB_IMPORT_LDIF_ROOTCONTAINER_CLOSE_176",JEB,NOTICE,176, getClassLoader());

  /**
   * The DN %s was found to be missing a parent during the phase two parent check
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_JEB_IMPORT_LDIF_DN_NO_PARENT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_JEB_IMPORT_LDIF_DN_NO_PARENT_177",JEB,NOTICE,177, getClassLoader());

  /**
   * DN phase two processing completed. Processed %d DNs
   */
  public static final MessageDescriptor.Arg1<Number> NOTE_JEB_IMPORT_LDIF_DN_CLOSE =
          new MessageDescriptor.Arg1<Number>(BASE,"NOTICE_JEB_IMPORT_LDIF_DN_CLOSE_178",JEB,NOTICE,178, getClassLoader());

  /**
   * Index %s phase two processing completed
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_JEB_IMPORT_LDIF_INDEX_CLOSE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_JEB_IMPORT_LDIF_INDEX_CLOSE_179",JEB,NOTICE,179, getClassLoader());

  /**
   * Execution error during backend operation: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_EXECUTION_ERROR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_EXECUTION_ERROR_180",JEB,SEVERE_ERROR,180, getClassLoader());

  /**
   * Interrupted error during backend operation: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_INTERRUPTED_ERROR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_INTERRUPTED_ERROR_181",JEB,SEVERE_ERROR,181, getClassLoader());

  /**
   * Setting indexes trusted failed for the following reason: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_JEB_IMPORT_LDIF_TRUSTED_FAILED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_JEB_IMPORT_LDIF_TRUSTED_FAILED_182",JEB,NOTICE,182, getClassLoader());

  /**
   * Setting DB log byte size to %d bytes
   */
  public static final MessageDescriptor.Arg1<Number> NOTE_JEB_IMPORT_LDIF_LOG_BYTES =
          new MessageDescriptor.Arg1<Number>(BASE,"NOTICE_JEB_IMPORT_LDIF_LOG_BYTES_184",JEB,NOTICE,184, getClassLoader());

  /**
   * Setting DB cache size to %d bytes and phase one buffer size to to %d bytes
   */
  public static final MessageDescriptor.Arg2<Number,Number> NOTE_JEB_IMPORT_LDIF_DB_MEM_BUF_INFO =
          new MessageDescriptor.Arg2<Number,Number>(BASE,"NOTICE_JEB_IMPORT_LDIF_DB_MEM_BUF_INFO_185",JEB,NOTICE,185, getClassLoader());

  /**
   * The amount of free memory available to the import task is %d bytes. The number of phase one buffers required is %d buffers
   */
  public static final MessageDescriptor.Arg2<Number,Number> NOTE_JEB_IMPORT_LDIF_TOT_MEM_BUF =
          new MessageDescriptor.Arg2<Number,Number>(BASE,"NOTICE_JEB_IMPORT_LDIF_TOT_MEM_BUF_186",JEB,NOTICE,186, getClassLoader());

  /**
   * Checkpoints performed: %d
   */
  public static final MessageDescriptor.Arg1<Number> NOTE_JEB_IMPORT_LDIF_BUFFER_CHECKPOINTS =
          new MessageDescriptor.Arg1<Number>(BASE,"NOTICE_JEB_IMPORT_LDIF_BUFFER_CHECKPOINTS_187",JEB,NOTICE,187, getClassLoader());

  /**
   * Cleaner runs: %d files deleted: %d entries read: %d IN nodes cleaned: %d
   */
  public static final MessageDescriptor.Arg4<Number,Number,Number,Number> NOTE_JEB_IMPORT_LDIF_CLEANER_STATS =
          new MessageDescriptor.Arg4<Number,Number,Number,Number>(BASE,"NOTICE_JEB_IMPORT_LDIF_CLEANER_STATS_188",JEB,NOTICE,188, getClassLoader());

  /**
   * Eviction in progress. Passes: %d nodes evicted: %d BIN nodes stripped: %d
   */
  public static final MessageDescriptor.Arg3<Number,Number,Number> NOTE_JEB_IMPORT_LDIF_EVICTION_DETECTED_STATS =
          new MessageDescriptor.Arg3<Number,Number,Number>(BASE,"NOTICE_JEB_IMPORT_LDIF_EVICTION_DETECTED_STATS_189",JEB,NOTICE,189, getClassLoader());

  /**
   * Eviction detected after importing %d entries
   */
  public static final MessageDescriptor.Arg1<Number> NOTE_JEB_IMPORT_LDIF_EVICTION_DETECTED =
          new MessageDescriptor.Arg1<Number>(BASE,"NOTICE_JEB_IMPORT_LDIF_EVICTION_DETECTED_190",JEB,NOTICE,190, getClassLoader());

  /**
   * Could not find any backup in '%s'.  A full backup will be executed
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_BACKUPDB_INCREMENTAL_NOT_FOUND_DOING_NORMAL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_WARN_BACKUPDB_INCREMENTAL_NOT_FOUND_DOING_NORMAL_191",JEB,MILD_WARNING,191, getClassLoader());

  /**
   * The attribute '%s' cannot have extensible index type for invalid matching rule name '%s'
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_INDEX_TYPE_NEEDS_VALID_MATCHING_RULE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_INDEX_TYPE_NEEDS_VALID_MATCHING_RULE_192",JEB,SEVERE_ERROR,192, getClassLoader());

  /**
   * Configuration attribute ds-cfg-db-cache-size has a value of %d but the JVM is only configured for %d. Consider using ds-cfg-db-cache-percent
   */
  public static final MessageDescriptor.Arg2<Number,Number> ERR_CONFIG_JEB_CACHE_SIZE_GREATER_THAN_JVM_HEAP =
          new MessageDescriptor.Arg2<Number,Number>(BASE,"SEVERE_ERR_CONFIG_JEB_CACHE_SIZE_GREATER_THAN_JVM_HEAP_193",JEB,SEVERE_ERROR,193, getClassLoader());

  /**
   * Configuration attribute ds-cfg-db-cache-size has a value of %d which is less than the minimum: %d
   */
  public static final MessageDescriptor.Arg2<Number,Number> ERR_CONFIG_JEB_CACHE_SIZE_TOO_SMALL =
          new MessageDescriptor.Arg2<Number,Number>(BASE,"SEVERE_ERR_CONFIG_JEB_CACHE_SIZE_TOO_SMALL_194",JEB,SEVERE_ERROR,194, getClassLoader());

  /**
   * A plugin caused the delete operation to be aborted while deleting a subordinate entry %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_DELETE_ABORTED_BY_SUBORDINATE_PLUGIN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_JEB_DELETE_ABORTED_BY_SUBORDINATE_PLUGIN_195",JEB,MILD_ERROR,195, getClassLoader());

  /**
   * The available memory for phase two processing is %d bytes. The read ahead cache size is %d bytes calculated using %d buffers
   */
  public static final MessageDescriptor.Arg3<Number,Number,Number> NOTE_JEB_IMPORT_LDIF_PHASE_TWO_MEM_REPORT =
          new MessageDescriptor.Arg3<Number,Number,Number>(BASE,"NOTICE_JEB_IMPORT_LDIF_PHASE_TWO_MEM_REPORT_196",JEB,NOTICE,196, getClassLoader());

  /**
   * Setting phase one buffer size to minimal %d bytes and proceeding
   */
  public static final MessageDescriptor.Arg1<Number> NOTE_JEB_IMPORT_LDIF_BUFF_SIZE_LESS_DEFAULT =
          new MessageDescriptor.Arg1<Number>(BASE,"NOTICE_JEB_IMPORT_LDIF_BUFF_SIZE_LESS_DEFAULT_197",JEB,NOTICE,197, getClassLoader());

  /**
   * Database error during backend operation: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DATABASE_ERROR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DATABASE_ERROR_198",JEB,SEVERE_ERROR,198, getClassLoader());

  /**
   * The following error was received while processing the %s index: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_JEB_IMPORT_LDIF_INDEX_WRITE_DB_ERR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_JEB_IMPORT_LDIF_INDEX_WRITE_DB_ERR_199",JEB,SEVERE_ERROR,199, getClassLoader());

  /**
   * The following error was received while processing the import task: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_IMPORT_LDIF_IMPORT_TASK_ERR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_JEB_IMPORT_LDIF_IMPORT_TASK_ERR_200",JEB,SEVERE_ERROR,200, getClassLoader());

  /**
   * The following error was received while processing the migrate excluded task: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_IMPORT_LDIF_MIGRATE_EXCLUDED_TASK_ERR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_JEB_IMPORT_LDIF_MIGRATE_EXCLUDED_TASK_ERR_201",JEB,SEVERE_ERROR,201, getClassLoader());

  /**
   * The following error was received while processing the migrate existing task: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_IMPORT_LDIF_MIGRATE_EXISTING_TASK_ERR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_JEB_IMPORT_LDIF_MIGRATE_EXISTING_TASK_ERR_202",JEB,SEVERE_ERROR,202, getClassLoader());

  /**
   * The following error was received while processing the append and replace task: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_IMPORT_LDIF_APPEND_REPLACE_TASK_ERR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_JEB_IMPORT_LDIF_APPEND_REPLACE_TASK_ERR_203",JEB,SEVERE_ERROR,203, getClassLoader());

  /**
   * Rebuild of all indexes started with %d total entries to process
   */
  public static final MessageDescriptor.Arg1<Number> NOTE_JEB_REBUILD_ALL_START =
          new MessageDescriptor.Arg1<Number>(BASE,"NOTICE_JEB_REBUILD_ALL_START_204",JEB,NOTICE,204, getClassLoader());

  /**
   * Rebuild of base DN %s failed because it not available
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_REBUILD_SUFFIX_ERROR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_JEB_REBUILD_SUFFIX_ERROR_205",JEB,SEVERE_ERROR,205, getClassLoader());

  /**
   * Configuration attributes ds-cfg-db-txn-no-sync and ds-cfg-db-txn-write-no-sync are mutually exclusive and cannot be both set at the same time
   */
  public static final MessageDescriptor.Arg0 ERR_CONFIG_JEB_DURABILITY_CONFLICT =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CONFIG_JEB_DURABILITY_CONFLICT_206",JEB,SEVERE_ERROR,206, getClassLoader());

  /**
   * The following error was received while performing a pending DN check: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_IMPORT_LDIF_PENDING_ERR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_JEB_IMPORT_LDIF_PENDING_ERR_207",JEB,SEVERE_ERROR,207, getClassLoader());

  /**
   * The amount memory available to the temporary DN cache environment is %d bytes
   */
  public static final MessageDescriptor.Arg1<Number> NOTE_JEB_IMPORT_LDIF_TMP_ENV_MEM =
          new MessageDescriptor.Arg1<Number>(BASE,"NOTICE_JEB_IMPORT_LDIF_TMP_ENV_MEM_208",JEB,NOTICE,208, getClassLoader());

  /**
   * Total import time was %d seconds. Phase one processing completed in %d seconds, phase two processing completed in %d seconds
   */
  public static final MessageDescriptor.Arg3<Number,Number,Number> NOTE_JEB_IMPORT_PHASE_STATS =
          new MessageDescriptor.Arg3<Number,Number,Number>(BASE,"NOTICE_JEB_IMPORT_PHASE_STATS_209",JEB,NOTICE,209, getClassLoader());

  /**
   * The following error was received by the uncaught exception handler: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_IMPORT_UNCAUGHT_EXCEPTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_JEB_IMPORT_UNCAUGHT_EXCEPTION_210",JEB,SEVERE_ERROR,210, getClassLoader());

  /**
   * Index %s phase two started processing %d buffers in %d batches
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,Number> NOTE_JEB_IMPORT_LDIF_INDEX_STARTED =
          new MessageDescriptor.Arg3<CharSequence,Number,Number>(BASE,"NOTICE_JEB_IMPORT_LDIF_INDEX_STARTED_211",JEB,NOTICE,211, getClassLoader());

  /**
   * The following error was received while processing the rebuild index task: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_IMPORT_LDIF_REBUILD_INDEX_TASK_ERR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_JEB_IMPORT_LDIF_REBUILD_INDEX_TASK_ERR_212",JEB,SEVERE_ERROR,212, getClassLoader());

  /**
   * Insufficient memory to allocate enough phase one buffers for use by %d threads. Lowering the number of threads used to %d
   */
  public static final MessageDescriptor.Arg2<Number,Number> NOTE_JEB_IMPORT_ADJUST_THREAD_COUNT =
          new MessageDescriptor.Arg2<Number,Number>(BASE,"NOTICE_JEB_IMPORT_ADJUST_THREAD_COUNT_213",JEB,NOTICE,213, getClassLoader());

  /**
   * I/O error occurred while exporting entry: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_EXPORT_IO_ERROR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_JEB_EXPORT_IO_ERROR_214",JEB,SEVERE_ERROR,214, getClassLoader());

  /**
   * I/O error occurred while opening the LDIF stream
   */
  public static final MessageDescriptor.Arg0 ERR_JEB_IMPORT_LDIF_READER_IO_ERROR =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_JEB_IMPORT_LDIF_READER_IO_ERROR_215",JEB,SEVERE_ERROR,215, getClassLoader());

  /**
   * I/O error occurred while reading the index scratch file %s in the temporary directory
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JEB_IMPORT_BUFFER_IO_ERROR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_JEB_IMPORT_BUFFER_IO_ERROR_216",JEB,SEVERE_ERROR,216, getClassLoader());

  /**
   * The disk containing directory %s used by the database backend %s is low on free space (%d bytes free). Write operations to the backend are only permitted by a user with the BYPASS_LOCKDOWN privilege until the free space rises above the threshold (%d bytes)
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,Number,Number> ERR_JEB_DISK_LOW_THRESHOLD_REACHED =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,Number,Number>(BASE,"SEVERE_ERR_JEB_DISK_LOW_THRESHOLD_REACHED_217",JEB,SEVERE_ERROR,217, getClassLoader());

  /**
   * The disk containing directory %s used by the database backend %s is full (%d bytes free). Write operations to the backend will fail until the free space rises above the threshold (%d bytes)
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,Number,Number> ERR_JEB_DISK_FULL_THRESHOLD_REACHED =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,Number,Number>(BASE,"SEVERE_ERR_JEB_DISK_FULL_THRESHOLD_REACHED_218",JEB,SEVERE_ERROR,218, getClassLoader());

  /**
   * The free space (%d bytes) on the disk containing directory %s used by the database backend %s is now above the threshold (%d bytes)
   */
  public static final MessageDescriptor.Arg4<Number,CharSequence,CharSequence,Number> NOTE_JEB_DISK_SPACE_RESTORED =
          new MessageDescriptor.Arg4<Number,CharSequence,CharSequence,Number>(BASE,"NOTICE_JEB_DISK_SPACE_RESTORED_219",JEB,NOTICE,219, getClassLoader());

  /**
   * There is not enough space on the disk for the database to perform the write operation
   */
  public static final MessageDescriptor.Arg0 WARN_JEB_OUT_OF_DISK_SPACE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_WARN_JEB_OUT_OF_DISK_SPACE_220",JEB,SEVERE_WARNING,220, getClassLoader());

  /**
   * Insufficient free memory (%d bytes) to perform import phase 2 in a single batch. Some indexes will be imported using several batches which may result in reduced performance
   */
  public static final MessageDescriptor.Arg1<Number> WARN_IMPORT_LDIF_LACK_MEM_PHASE_TWO =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_WARN_IMPORT_LDIF_LACK_MEM_PHASE_TWO_221",JEB,MILD_WARNING,221, getClassLoader());

  /**
   * The disk containing directory %s is full (%d bytes free). After freeing more than %d bytes on the disk, import can continue in append and replace mode to load the rest of the entries
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,Number> ERR_IMPORT_LDIF_LACK_DISK_PHASE_ONE =
          new MessageDescriptor.Arg3<CharSequence,Number,Number>(BASE,"SEVERE_ERR_IMPORT_LDIF_LACK_DISK_PHASE_ONE_222",JEB,SEVERE_ERROR,222, getClassLoader());

  /**
   * The disk containing directory %s is full (%d bytes free). After freeing more than %d bytes on the disk, a rebuild of all the indexes is needed to complete the import
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,Number> ERR_IMPORT_LDIF_LACK_DISK_PHASE_TWO =
          new MessageDescriptor.Arg3<CharSequence,Number,Number>(BASE,"SEVERE_ERR_IMPORT_LDIF_LACK_DISK_PHASE_TWO_223",JEB,SEVERE_ERROR,223, getClassLoader());

  /**
   * The disk containing directory %s is full (%d bytes free). Rebuild index can not continue until the free space rises above the threshold (%d bytes)
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,Number> ERR_REBUILD_INDEX_LACK_DISK =
          new MessageDescriptor.Arg3<CharSequence,Number,Number>(BASE,"SEVERE_ERR_REBUILD_INDEX_LACK_DISK_224",JEB,SEVERE_ERROR,224, getClassLoader());

  /**
   * %s index type is disabled for the %s attribute
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_JEB_INDEX_FILTER_INDEX_TYPE_DISABLED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_JEB_INDEX_FILTER_INDEX_TYPE_DISABLED_225",JEB,INFORMATION,225, getClassLoader());

  /**
   * %s index is invalid and needs to be rebuilt
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_JEB_INDEX_FILTER_INDEX_NOT_TRUSTED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_JEB_INDEX_FILTER_INDEX_NOT_TRUSTED_226",JEB,INFORMATION,226, getClassLoader());

  /**
   * %s index is being rebuilt
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_JEB_INDEX_FILTER_INDEX_REBUILD_IN_PROGRESS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_JEB_INDEX_FILTER_INDEX_REBUILD_IN_PROGRESS_227",JEB,INFORMATION,227, getClassLoader());

  /**
   * The filter value exceeded the index entry limit for the %s index
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_JEB_INDEX_FILTER_INDEX_LIMIT_EXCEEDED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_JEB_INDEX_FILTER_INDEX_LIMIT_EXCEEDED_228",JEB,INFORMATION,228, getClassLoader());

  /**
   * Matching rule %s is disabled for the extensible index of the %s attribute
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_JEB_INDEX_FILTER_MATCHING_RULE_NOT_INDEXED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_JEB_INDEX_FILTER_MATCHING_RULE_NOT_INDEXED_229",JEB,INFORMATION,229, getClassLoader());


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
            Class<?> c = Class.forName("org.opends.messages.JebMessages");

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
      cl = JebMessages.class.getClassLoader();
    }
    return cl;
  }
}
