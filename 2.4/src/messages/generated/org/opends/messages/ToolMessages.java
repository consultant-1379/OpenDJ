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
public final class ToolMessages {

  /** Base property for resource bundle containing messages */
  private static final String BASE = "messages/tools";

  private static ClassLoader webstartClassLoader;

  // Prevent instantiation.
  private ToolMessages() {
    // Do nothing.
  }

  /**
   * Unable to create an SSL connection to the server: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TOOLS_CANNOT_CREATE_SSL_CONNECTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TOOLS_CANNOT_CREATE_SSL_CONNECTION_1",TOOLS,SEVERE_ERROR,1, getClassLoader());

  /**
   * Unable to create an SSL connection to the server because the connection factory has not been initialized
   */
  public static final MessageDescriptor.Arg0 ERR_TOOLS_SSL_CONNECTION_NOT_INITIALIZED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_TOOLS_SSL_CONNECTION_NOT_INITIALIZED_2",TOOLS,SEVERE_ERROR,2, getClassLoader());

  /**
   * Cannot load the key store file: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TOOLS_CANNOT_LOAD_KEYSTORE_FILE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TOOLS_CANNOT_LOAD_KEYSTORE_FILE_3",TOOLS,SEVERE_ERROR,3, getClassLoader());

  /**
   * Cannot initialize the key manager for the key store:%s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TOOLS_CANNOT_INIT_KEYMANAGER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TOOLS_CANNOT_INIT_KEYMANAGER_4",TOOLS,SEVERE_ERROR,4, getClassLoader());

  /**
   * Cannot load the key store file: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TOOLS_CANNOT_LOAD_TRUSTSTORE_FILE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TOOLS_CANNOT_LOAD_TRUSTSTORE_FILE_5",TOOLS,SEVERE_ERROR,5, getClassLoader());

  /**
   * Cannot initialize the key manager for the key store:%s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TOOLS_CANNOT_INIT_TRUSTMANAGER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TOOLS_CANNOT_INIT_TRUSTMANAGER_6",TOOLS,SEVERE_ERROR,6, getClassLoader());

  /**
   * List available password storage schemes
   */
  public static final MessageDescriptor.Arg0 INFO_ENCPW_DESCRIPTION_LISTSCHEMES =
          new MessageDescriptor.Arg0(BASE,"INFO_ENCPW_DESCRIPTION_LISTSCHEMES_7",TOOLS,INFORMATION,7, getClassLoader());

  /**
   * Clear-text password to encode or to compare against an encoded password
   */
  public static final MessageDescriptor.Arg0 INFO_ENCPW_DESCRIPTION_CLEAR_PW =
          new MessageDescriptor.Arg0(BASE,"INFO_ENCPW_DESCRIPTION_CLEAR_PW_8",TOOLS,INFORMATION,8, getClassLoader());

  /**
   * Clear-text password file
   */
  public static final MessageDescriptor.Arg0 INFO_ENCPW_DESCRIPTION_CLEAR_PW_FILE =
          new MessageDescriptor.Arg0(BASE,"INFO_ENCPW_DESCRIPTION_CLEAR_PW_FILE_9",TOOLS,INFORMATION,9, getClassLoader());

  /**
   * Encoded password to compare against the clear-text password
   */
  public static final MessageDescriptor.Arg0 INFO_ENCPW_DESCRIPTION_ENCODED_PW =
          new MessageDescriptor.Arg0(BASE,"INFO_ENCPW_DESCRIPTION_ENCODED_PW_10",TOOLS,INFORMATION,10, getClassLoader());

  /**
   * Encoded password file
   */
  public static final MessageDescriptor.Arg0 INFO_ENCPW_DESCRIPTION_ENCODED_PW_FILE =
          new MessageDescriptor.Arg0(BASE,"INFO_ENCPW_DESCRIPTION_ENCODED_PW_FILE_11",TOOLS,INFORMATION,11, getClassLoader());

  /**
   * The fully-qualified name of the Java class to use as the Directory Server configuration handler.  If this is not provided, then a default of org.opends.server.extensions.ConfigFileHandler will be used
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_CONFIG_CLASS =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_CONFIG_CLASS_12",TOOLS,INFORMATION,12, getClassLoader());

  /**
   * Path to the Directory Server configuration file
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_CONFIG_FILE =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_CONFIG_FILE_13",TOOLS,INFORMATION,13, getClassLoader());

  /**
   * Scheme to use for the encoded password
   */
  public static final MessageDescriptor.Arg0 INFO_ENCPW_DESCRIPTION_SCHEME =
          new MessageDescriptor.Arg0(BASE,"INFO_ENCPW_DESCRIPTION_SCHEME_14",TOOLS,INFORMATION,14, getClassLoader());

  /**
   * Displays this usage information
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_USAGE =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_USAGE_15",TOOLS,INFORMATION,15, getClassLoader());

  /**
   * An unexpected error occurred while attempting to initialize the command-line arguments:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CANNOT_INITIALIZE_ARGS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CANNOT_INITIALIZE_ARGS_16",TOOLS,SEVERE_ERROR,16, getClassLoader());

  /**
   * An error occurred while parsing the command-line arguments:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ERROR_PARSING_ARGS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_ERROR_PARSING_ARGS_17",TOOLS,SEVERE_ERROR,17, getClassLoader());

  /**
   * No clear-text password was specified.  Use --%s, --%s or --%s to specify the password to encode
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_ENCPW_NO_CLEAR_PW =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_ENCPW_NO_CLEAR_PW_18",TOOLS,SEVERE_ERROR,18, getClassLoader());

  /**
   * No password storage scheme was specified.  Use the --%s argument to specify the storage scheme
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ENCPW_NO_SCHEME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_ENCPW_NO_SCHEME_19",TOOLS,SEVERE_ERROR,19, getClassLoader());

  /**
   * An unexpected error occurred while attempting to bootstrap the Directory Server client-side code:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SERVER_BOOTSTRAP_ERROR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_SERVER_BOOTSTRAP_ERROR_20",TOOLS,SEVERE_ERROR,20, getClassLoader());

  /**
   * An error occurred while trying to load the Directory Server configuration:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CANNOT_LOAD_CONFIG =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CANNOT_LOAD_CONFIG_21",TOOLS,SEVERE_ERROR,21, getClassLoader());

  /**
   * An error occurred while trying to load the Directory Server schema:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CANNOT_LOAD_SCHEMA =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CANNOT_LOAD_SCHEMA_22",TOOLS,SEVERE_ERROR,22, getClassLoader());

  /**
   * An error occurred while trying to initialize the core Directory Server configuration:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CANNOT_INITIALIZE_CORE_CONFIG =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CANNOT_INITIALIZE_CORE_CONFIG_23",TOOLS,SEVERE_ERROR,23, getClassLoader());

  /**
   * An error occurred while trying to initialize the Directory Server password storage schemes:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ENCPW_CANNOT_INITIALIZE_STORAGE_SCHEMES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_ENCPW_CANNOT_INITIALIZE_STORAGE_SCHEMES_24",TOOLS,SEVERE_ERROR,24, getClassLoader());

  /**
   * No password storage schemes have been configured for use in the Directory Server
   */
  public static final MessageDescriptor.Arg0 ERR_ENCPW_NO_STORAGE_SCHEMES =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_ENCPW_NO_STORAGE_SCHEMES_25",TOOLS,SEVERE_ERROR,25, getClassLoader());

  /**
   * Password storage scheme "%s" is not configured for use in the Directory Server
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ENCPW_NO_SUCH_SCHEME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_ENCPW_NO_SUCH_SCHEME_26",TOOLS,SEVERE_ERROR,26, getClassLoader());

  /**
   * The provided clear-text and encoded passwords match
   */
  public static final MessageDescriptor.Arg0 INFO_ENCPW_PASSWORDS_MATCH =
          new MessageDescriptor.Arg0(BASE,"INFO_ENCPW_PASSWORDS_MATCH_27",TOOLS,INFORMATION,27, getClassLoader());

  /**
   * The provided clear-text and encoded passwords do not match
   */
  public static final MessageDescriptor.Arg0 INFO_ENCPW_PASSWORDS_DO_NOT_MATCH =
          new MessageDescriptor.Arg0(BASE,"INFO_ENCPW_PASSWORDS_DO_NOT_MATCH_28",TOOLS,INFORMATION,28, getClassLoader());

  /**
   * Encoded Password:  "%s"
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ENCPW_ENCODED_PASSWORD =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_ENCPW_ENCODED_PASSWORD_29",TOOLS,SEVERE_ERROR,29, getClassLoader());

  /**
   * An error occurred while attempting to encode the clear-text password:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ENCPW_CANNOT_ENCODE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_ENCPW_CANNOT_ENCODE_30",TOOLS,SEVERE_ERROR,30, getClassLoader());

  /**
   * Path to the LDIF file to be written
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFEXPORT_DESCRIPTION_LDIF_FILE =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFEXPORT_DESCRIPTION_LDIF_FILE_33",TOOLS,INFORMATION,33, getClassLoader());

  /**
   * Append an existing LDIF file rather than overwriting it
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFEXPORT_DESCRIPTION_APPEND_TO_LDIF =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFEXPORT_DESCRIPTION_APPEND_TO_LDIF_34",TOOLS,INFORMATION,34, getClassLoader());

  /**
   * Backend ID for the backend to export
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFEXPORT_DESCRIPTION_BACKEND_ID =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFEXPORT_DESCRIPTION_BACKEND_ID_35",TOOLS,INFORMATION,35, getClassLoader());

  /**
   * Base DN of a branch to exclude from the LDIF export
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFEXPORT_DESCRIPTION_EXCLUDE_BRANCH =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFEXPORT_DESCRIPTION_EXCLUDE_BRANCH_36",TOOLS,INFORMATION,36, getClassLoader());

  /**
   * Attribute to include in the LDIF export
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFEXPORT_DESCRIPTION_INCLUDE_ATTRIBUTE =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFEXPORT_DESCRIPTION_INCLUDE_ATTRIBUTE_37",TOOLS,INFORMATION,37, getClassLoader());

  /**
   * Attribute to exclude from the LDIF export
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFEXPORT_DESCRIPTION_EXCLUDE_ATTRIBUTE =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFEXPORT_DESCRIPTION_EXCLUDE_ATTRIBUTE_38",TOOLS,INFORMATION,38, getClassLoader());

  /**
   * Filter to identify entries to include in the LDIF export
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFEXPORT_DESCRIPTION_INCLUDE_FILTER =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFEXPORT_DESCRIPTION_INCLUDE_FILTER_39",TOOLS,INFORMATION,39, getClassLoader());

  /**
   * Filter to identify entries to exclude from the LDIF export
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFEXPORT_DESCRIPTION_EXCLUDE_FILTER =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFEXPORT_DESCRIPTION_EXCLUDE_FILTER_40",TOOLS,INFORMATION,40, getClassLoader());

  /**
   * Column at which to wrap long lines (0 for no wrapping)
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFEXPORT_DESCRIPTION_WRAP_COLUMN =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFEXPORT_DESCRIPTION_WRAP_COLUMN_41",TOOLS,INFORMATION,41, getClassLoader());

  /**
   * Compress the LDIF data as it is exported
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFEXPORT_DESCRIPTION_COMPRESS_LDIF =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFEXPORT_DESCRIPTION_COMPRESS_LDIF_42",TOOLS,INFORMATION,42, getClassLoader());

  /**
   * Encrypt the LDIF data as it is exported
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFEXPORT_DESCRIPTION_ENCRYPT_LDIF =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFEXPORT_DESCRIPTION_ENCRYPT_LDIF_43",TOOLS,INFORMATION,43, getClassLoader());

  /**
   * Generate a signed hash of the export data
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFEXPORT_DESCRIPTION_SIGN_HASH =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFEXPORT_DESCRIPTION_SIGN_HASH_44",TOOLS,INFORMATION,44, getClassLoader());

  /**
   * Unable to decode exclude filter string "%s" as a valid search filter:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIFEXPORT_CANNOT_PARSE_EXCLUDE_FILTER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIFEXPORT_CANNOT_PARSE_EXCLUDE_FILTER_52",TOOLS,SEVERE_ERROR,52, getClassLoader());

  /**
   * Unable to decode include filter string "%s" as a valid search filter:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIFEXPORT_CANNOT_PARSE_INCLUDE_FILTER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIFEXPORT_CANNOT_PARSE_INCLUDE_FILTER_53",TOOLS,SEVERE_ERROR,53, getClassLoader());

  /**
   * Unable to decode base DN string "%s" as a valid distinguished name:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CANNOT_DECODE_BASE_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CANNOT_DECODE_BASE_DN_54",TOOLS,SEVERE_ERROR,54, getClassLoader());

  /**
   * Multiple Directory Server backends are configured with the requested backend ID "%s"
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIFEXPORT_MULTIPLE_BACKENDS_FOR_ID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDIFEXPORT_MULTIPLE_BACKENDS_FOR_ID_55",TOOLS,SEVERE_ERROR,55, getClassLoader());

  /**
   * None of the Directory Server backends are configured with the requested backend ID "%s"
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIFEXPORT_NO_BACKENDS_FOR_ID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDIFEXPORT_NO_BACKENDS_FOR_ID_56",TOOLS,SEVERE_ERROR,56, getClassLoader());

  /**
   * Unable to decode exclude branch string "%s" as a valid distinguished name:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIFEXPORT_CANNOT_DECODE_EXCLUDE_BASE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIFEXPORT_CANNOT_DECODE_EXCLUDE_BASE_57",TOOLS,SEVERE_ERROR,57, getClassLoader());

  /**
   * Unable to decode wrap column value "%s" as an integer
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIFEXPORT_CANNOT_DECODE_WRAP_COLUMN_AS_INTEGER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDIFEXPORT_CANNOT_DECODE_WRAP_COLUMN_AS_INTEGER_58",TOOLS,SEVERE_ERROR,58, getClassLoader());

  /**
   * An error occurred while attempting to process the LDIF export:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIFEXPORT_ERROR_DURING_EXPORT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDIFEXPORT_ERROR_DURING_EXPORT_59",TOOLS,SEVERE_ERROR,59, getClassLoader());

  /**
   * Unable to decode the backend configuration base DN string "%s" as a valid DN:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CANNOT_DECODE_BACKEND_BASE_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CANNOT_DECODE_BACKEND_BASE_DN_60",TOOLS,SEVERE_ERROR,60, getClassLoader());

  /**
   * Unable to retrieve the backend configuration base entry "%s" from the server configuration:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CANNOT_RETRIEVE_BACKEND_BASE_ENTRY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CANNOT_RETRIEVE_BACKEND_BASE_ENTRY_61",TOOLS,SEVERE_ERROR,61, getClassLoader());

  /**
   * Cannot determine the name of the Java class providing the logic for the backend defined in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CANNOT_DETERMINE_BACKEND_CLASS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CANNOT_DETERMINE_BACKEND_CLASS_62",TOOLS,SEVERE_ERROR,62, getClassLoader());

  /**
   * Unable to load class %s referenced in configuration entry %s for use as a Directory Server backend:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CANNOT_LOAD_BACKEND_CLASS =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CANNOT_LOAD_BACKEND_CLASS_63",TOOLS,SEVERE_ERROR,63, getClassLoader());

  /**
   * Unable to create an instance of class %s referenced in configuration entry %s as a Directory Server backend:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CANNOT_INSTANTIATE_BACKEND_CLASS =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CANNOT_INSTANTIATE_BACKEND_CLASS_64",TOOLS,SEVERE_ERROR,64, getClassLoader());

  /**
   * No base DNs have been defined in backend configuration entry %s.  This backend will not be evaluated
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_NO_BASES_FOR_BACKEND =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_NO_BASES_FOR_BACKEND_65",TOOLS,SEVERE_ERROR,65, getClassLoader());

  /**
   * Unable to determine the set of base DNs defined in backend configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CANNOT_DETERMINE_BASES_FOR_BACKEND =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CANNOT_DETERMINE_BASES_FOR_BACKEND_66",TOOLS,SEVERE_ERROR,66, getClassLoader());

  /**
   * Path to the LDIF file to be imported
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFIMPORT_DESCRIPTION_LDIF_FILE =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFIMPORT_DESCRIPTION_LDIF_FILE_69",TOOLS,INFORMATION,69, getClassLoader());

  /**
   * Append to an existing database rather than overwriting it
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFIMPORT_DESCRIPTION_APPEND =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFIMPORT_DESCRIPTION_APPEND_70",TOOLS,INFORMATION,70, getClassLoader());

  /**
   * Replace existing entries when appending to the database
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFIMPORT_DESCRIPTION_REPLACE_EXISTING =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFIMPORT_DESCRIPTION_REPLACE_EXISTING_71",TOOLS,INFORMATION,71, getClassLoader());

  /**
   * Backend ID for the backend to import
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFIMPORT_DESCRIPTION_BACKEND_ID =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFIMPORT_DESCRIPTION_BACKEND_ID_72",TOOLS,INFORMATION,72, getClassLoader());

  /**
   * Base DN of a branch to exclude from the LDIF import
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFIMPORT_DESCRIPTION_EXCLUDE_BRANCH =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFIMPORT_DESCRIPTION_EXCLUDE_BRANCH_73",TOOLS,INFORMATION,73, getClassLoader());

  /**
   * Attribute to include in the LDIF import
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFIMPORT_DESCRIPTION_INCLUDE_ATTRIBUTE =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFIMPORT_DESCRIPTION_INCLUDE_ATTRIBUTE_74",TOOLS,INFORMATION,74, getClassLoader());

  /**
   * Attribute to exclude from the LDIF import
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFIMPORT_DESCRIPTION_EXCLUDE_ATTRIBUTE =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFIMPORT_DESCRIPTION_EXCLUDE_ATTRIBUTE_75",TOOLS,INFORMATION,75, getClassLoader());

  /**
   * Filter to identify entries to include in the LDIF import
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFIMPORT_DESCRIPTION_INCLUDE_FILTER =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFIMPORT_DESCRIPTION_INCLUDE_FILTER_76",TOOLS,INFORMATION,76, getClassLoader());

  /**
   * Filter to identify entries to exclude from the LDIF import
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFIMPORT_DESCRIPTION_EXCLUDE_FILTER =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFIMPORT_DESCRIPTION_EXCLUDE_FILTER_77",TOOLS,INFORMATION,77, getClassLoader());

  /**
   * Write rejected entries to the specified file
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFIMPORT_DESCRIPTION_REJECT_FILE =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFIMPORT_DESCRIPTION_REJECT_FILE_78",TOOLS,INFORMATION,78, getClassLoader());

  /**
   * Overwrite an existing rejects and/or skip file rather than appending to it
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFIMPORT_DESCRIPTION_OVERWRITE =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFIMPORT_DESCRIPTION_OVERWRITE_79",TOOLS,INFORMATION,79, getClassLoader());

  /**
   * LDIF file is compressed
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFIMPORT_DESCRIPTION_IS_COMPRESSED =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFIMPORT_DESCRIPTION_IS_COMPRESSED_80",TOOLS,INFORMATION,80, getClassLoader());

  /**
   * LDIF file is encrypted
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFIMPORT_DESCRIPTION_IS_ENCRYPTED =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFIMPORT_DESCRIPTION_IS_ENCRYPTED_81",TOOLS,INFORMATION,81, getClassLoader());

  /**
   * Unable to decode exclude filter string "%s" as a valid search filter:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIFIMPORT_CANNOT_PARSE_EXCLUDE_FILTER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIFIMPORT_CANNOT_PARSE_EXCLUDE_FILTER_89",TOOLS,SEVERE_ERROR,89, getClassLoader());

  /**
   * Unable to decode include filter string "%s" as a valid search filter:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIFIMPORT_CANNOT_PARSE_INCLUDE_FILTER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIFIMPORT_CANNOT_PARSE_INCLUDE_FILTER_90",TOOLS,SEVERE_ERROR,90, getClassLoader());

  /**
   * Imported branches or backend IDs can not span across multiple Directory Server backends
   */
  public static final MessageDescriptor.Arg0 ERR_LDIFIMPORT_MULTIPLE_BACKENDS_FOR_ID =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_LDIFIMPORT_MULTIPLE_BACKENDS_FOR_ID_92",TOOLS,SEVERE_ERROR,92, getClassLoader());

  /**
   * None of the Directory Server backends are configured with the requested backend ID or base DNs that include the specified branches
   */
  public static final MessageDescriptor.Arg0 ERR_LDIFIMPORT_NO_BACKENDS_FOR_ID =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_LDIFIMPORT_NO_BACKENDS_FOR_ID_93",TOOLS,SEVERE_ERROR,93, getClassLoader());

  /**
   * Unable to decode exclude branch string "%s" as a valid distinguished name:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIFIMPORT_CANNOT_DECODE_EXCLUDE_BASE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIFIMPORT_CANNOT_DECODE_EXCLUDE_BASE_94",TOOLS,SEVERE_ERROR,94, getClassLoader());

  /**
   * An error occurred while trying to open the rejects file %s for writing:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIFIMPORT_CANNOT_OPEN_REJECTS_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIFIMPORT_CANNOT_OPEN_REJECTS_FILE_95",TOOLS,SEVERE_ERROR,95, getClassLoader());

  /**
   * An error occurred while attempting to process the LDIF import:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIFIMPORT_ERROR_DURING_IMPORT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDIFIMPORT_ERROR_DURING_IMPORT_96",TOOLS,SEVERE_ERROR,96, getClassLoader());

  /**
   * Processing %s request for %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_PROCESSING_OPERATION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_PROCESSING_OPERATION_104",TOOLS,INFORMATION,104, getClassLoader());

  /**
   * %s operation failed
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_OPERATION_FAILED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_OPERATION_FAILED_105",TOOLS,INFORMATION,105, getClassLoader());

  /**
   * %s operation successful for DN %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_OPERATION_SUCCESSFUL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_OPERATION_SUCCESSFUL_106",TOOLS,INFORMATION,106, getClassLoader());

  /**
   * Comparing type %s with value %s in entry %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> INFO_PROCESSING_COMPARE_OPERATION =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"INFO_PROCESSING_COMPARE_OPERATION_107",TOOLS,INFORMATION,107, getClassLoader());

  /**
   * Compare operation returned false for entry %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_COMPARE_OPERATION_RESULT_FALSE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_COMPARE_OPERATION_RESULT_FALSE_108",TOOLS,INFORMATION,108, getClassLoader());

  /**
   * Compare operation returned true for entry %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_COMPARE_OPERATION_RESULT_TRUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_COMPARE_OPERATION_RESULT_TRUE_109",TOOLS,INFORMATION,109, getClassLoader());

  /**
   * Invalid operation type returned in search result %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_SEARCH_OPERATION_INVALID_PROTOCOL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_SEARCH_OPERATION_INVALID_PROTOCOL_110",TOOLS,INFORMATION,110, getClassLoader());

  /**
   * Trust all server SSL certificates
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_TRUSTALL =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_TRUSTALL_111",TOOLS,INFORMATION,111, getClassLoader());

  /**
   * DN to use to bind to the server
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_BINDDN =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_BINDDN_112",TOOLS,INFORMATION,112, getClassLoader());

  /**
   * Password to use to bind to the server
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_BINDPASSWORD =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_BINDPASSWORD_113",TOOLS,INFORMATION,113, getClassLoader());

  /**
   * Bind password file
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_BINDPASSWORDFILE =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_BINDPASSWORDFILE_114",TOOLS,INFORMATION,114, getClassLoader());

  /**
   * Use the specified character set for command-line input
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_ENCODING =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_ENCODING_115",TOOLS,INFORMATION,115, getClassLoader());

  /**
   * Use verbose mode
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_VERBOSE =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_VERBOSE_116",TOOLS,INFORMATION,116, getClassLoader());

  /**
   * Certificate key store path
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_KEYSTOREPATH =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_KEYSTOREPATH_117",TOOLS,INFORMATION,117, getClassLoader());

  /**
   * Certificate trust store path
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_TRUSTSTOREPATH =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_TRUSTSTOREPATH_118",TOOLS,INFORMATION,118, getClassLoader());

  /**
   * Certificate key store PIN
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_KEYSTOREPASSWORD =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_KEYSTOREPASSWORD_119",TOOLS,INFORMATION,119, getClassLoader());

  /**
   * Directory server hostname or IP address
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_HOST =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_HOST_120",TOOLS,INFORMATION,120, getClassLoader());

  /**
   * Directory server port number
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PORT =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PORT_121",TOOLS,INFORMATION,121, getClassLoader());

  /**
   * Display this usage information
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_SHOWUSAGE =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_SHOWUSAGE_122",TOOLS,INFORMATION,122, getClassLoader());

  /**
   * Use a request control with the provided information
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_CONTROLS =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_CONTROLS_123",TOOLS,INFORMATION,123, getClassLoader());

  /**
   * Continue processing even if there are errors
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_CONTINUE_ON_ERROR =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_CONTINUE_ON_ERROR_124",TOOLS,INFORMATION,124, getClassLoader());

  /**
   * Use SSL for secure communication with the server
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_USE_SSL =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_USE_SSL_125",TOOLS,INFORMATION,125, getClassLoader());

  /**
   * Use StartTLS to secure communication with the server
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_START_TLS =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_START_TLS_126",TOOLS,INFORMATION,126, getClassLoader());

  /**
   * Use the SASL EXTERNAL authentication mechanism
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_USE_SASL_EXTERNAL =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_USE_SASL_EXTERNAL_127",TOOLS,INFORMATION,127, getClassLoader());

  /**
   * File containing the DNs of the entries to delete
   */
  public static final MessageDescriptor.Arg0 INFO_DELETE_DESCRIPTION_FILENAME =
          new MessageDescriptor.Arg0(BASE,"INFO_DELETE_DESCRIPTION_FILENAME_128",TOOLS,INFORMATION,128, getClassLoader());

  /**
   * Delete the specified entry and all entries below it
   */
  public static final MessageDescriptor.Arg0 INFO_DELETE_DESCRIPTION_DELETE_SUBTREE =
          new MessageDescriptor.Arg0(BASE,"INFO_DELETE_DESCRIPTION_DELETE_SUBTREE_129",TOOLS,INFORMATION,129, getClassLoader());

  /**
   * Treat records with no changetype as add operations
   */
  public static final MessageDescriptor.Arg0 INFO_MODIFY_DESCRIPTION_DEFAULT_ADD =
          new MessageDescriptor.Arg0(BASE,"INFO_MODIFY_DESCRIPTION_DEFAULT_ADD_130",TOOLS,INFORMATION,130, getClassLoader());

  /**
   * Search base DN
   */
  public static final MessageDescriptor.Arg0 INFO_SEARCH_DESCRIPTION_BASEDN =
          new MessageDescriptor.Arg0(BASE,"INFO_SEARCH_DESCRIPTION_BASEDN_131",TOOLS,INFORMATION,131, getClassLoader());

  /**
   * Maximum number of entries to return from the search
   */
  public static final MessageDescriptor.Arg0 INFO_SEARCH_DESCRIPTION_SIZE_LIMIT =
          new MessageDescriptor.Arg0(BASE,"INFO_SEARCH_DESCRIPTION_SIZE_LIMIT_132",TOOLS,INFORMATION,132, getClassLoader());

  /**
   * Maximum length of time in seconds to allow for the search
   */
  public static final MessageDescriptor.Arg0 INFO_SEARCH_DESCRIPTION_TIME_LIMIT =
          new MessageDescriptor.Arg0(BASE,"INFO_SEARCH_DESCRIPTION_TIME_LIMIT_133",TOOLS,INFORMATION,133, getClassLoader());

  /**
   * Search scope ('base', 'one', 'sub', or 'subordinate')
   */
  public static final MessageDescriptor.Arg0 INFO_SEARCH_DESCRIPTION_SEARCH_SCOPE =
          new MessageDescriptor.Arg0(BASE,"INFO_SEARCH_DESCRIPTION_SEARCH_SCOPE_134",TOOLS,INFORMATION,134, getClassLoader());

  /**
   * Alias dereference policy ('never', 'always', 'search', or 'find')
   */
  public static final MessageDescriptor.Arg0 INFO_SEARCH_DESCRIPTION_DEREFERENCE_POLICY =
          new MessageDescriptor.Arg0(BASE,"INFO_SEARCH_DESCRIPTION_DEREFERENCE_POLICY_135",TOOLS,INFORMATION,135, getClassLoader());

  /**
   * Cannot send the simple bind request:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAPAUTH_CANNOT_SEND_SIMPLE_BIND =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDAPAUTH_CANNOT_SEND_SIMPLE_BIND_136",TOOLS,SEVERE_ERROR,136, getClassLoader());

  /**
   * Cannot read the bind response from the server. The port you are using may require a secured communication (--useSSL). %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAPAUTH_CANNOT_READ_BIND_RESPONSE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDAPAUTH_CANNOT_READ_BIND_RESPONSE_137",TOOLS,SEVERE_ERROR,137, getClassLoader());

  /**
   * The Directory Server indicated that it was closing the connection to the client (result code %d, message "%s"
   */
  public static final MessageDescriptor.Arg2<Number,CharSequence> ERR_LDAPAUTH_SERVER_DISCONNECT =
          new MessageDescriptor.Arg2<Number,CharSequence>(BASE,"SEVERE_ERR_LDAPAUTH_SERVER_DISCONNECT_138",TOOLS,SEVERE_ERROR,138, getClassLoader());

  /**
   * The Directory Server sent an unexpected extended response message to the client:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAPAUTH_UNEXPECTED_EXTENDED_RESPONSE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDAPAUTH_UNEXPECTED_EXTENDED_RESPONSE_139",TOOLS,SEVERE_ERROR,139, getClassLoader());

  /**
   * The Directory Server sent an unexpected response message to the client:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAPAUTH_UNEXPECTED_RESPONSE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDAPAUTH_UNEXPECTED_RESPONSE_140",TOOLS,SEVERE_ERROR,140, getClassLoader());

  /**
   * The simple bind attempt failed
   */
  public static final MessageDescriptor.Arg0 ERR_LDAPAUTH_SIMPLE_BIND_FAILED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_LDAPAUTH_SIMPLE_BIND_FAILED_141",TOOLS,MILD_ERROR,141, getClassLoader());

  /**
   * A SASL bind was requested but no SASL mechanism was specified
   */
  public static final MessageDescriptor.Arg0 ERR_LDAPAUTH_NO_SASL_MECHANISM =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_LDAPAUTH_NO_SASL_MECHANISM_142",TOOLS,SEVERE_ERROR,142, getClassLoader());

  /**
   * The requested SASL mechanism "%s" is not supported by this client
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAPAUTH_UNSUPPORTED_SASL_MECHANISM =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAPAUTH_UNSUPPORTED_SASL_MECHANISM_143",TOOLS,MILD_ERROR,143, getClassLoader());

  /**
   * The trace SASL property may only be given a single value
   */
  public static final MessageDescriptor.Arg0 ERR_LDAPAUTH_TRACE_SINGLE_VALUED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_LDAPAUTH_TRACE_SINGLE_VALUED_144",TOOLS,MILD_ERROR,144, getClassLoader());

  /**
   * Property "%s" is not allowed for the %s SASL mechanism
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAPAUTH_INVALID_SASL_PROPERTY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_LDAPAUTH_INVALID_SASL_PROPERTY_145",TOOLS,MILD_ERROR,145, getClassLoader());

  /**
   * Cannot send the SASL %S bind request:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAPAUTH_CANNOT_SEND_SASL_BIND =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDAPAUTH_CANNOT_SEND_SASL_BIND_146",TOOLS,SEVERE_ERROR,146, getClassLoader());

  /**
   * The SASL %s bind attempt failed
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAPAUTH_SASL_BIND_FAILED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAPAUTH_SASL_BIND_FAILED_147",TOOLS,MILD_ERROR,147, getClassLoader());

  /**
   * No SASL properties were provided for use with the %s mechanism
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAPAUTH_NO_SASL_PROPERTIES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAPAUTH_NO_SASL_PROPERTIES_148",TOOLS,MILD_ERROR,148, getClassLoader());

  /**
   * The "authid" SASL property only accepts a single value
   */
  public static final MessageDescriptor.Arg0 ERR_LDAPAUTH_AUTHID_SINGLE_VALUED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_LDAPAUTH_AUTHID_SINGLE_VALUED_149",TOOLS,MILD_ERROR,149, getClassLoader());

  /**
   * The "authid" SASL property is required for use with the %s mechanism
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAPAUTH_SASL_AUTHID_REQUIRED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAPAUTH_SASL_AUTHID_REQUIRED_150",TOOLS,MILD_ERROR,150, getClassLoader());

  /**
   * Cannot send the initial bind request in the multi-stage %s bind to the server:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAPAUTH_CANNOT_SEND_INITIAL_SASL_BIND =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_LDAPAUTH_CANNOT_SEND_INITIAL_SASL_BIND_151",TOOLS,MILD_ERROR,151, getClassLoader());

  /**
   * Cannot read the initial %s bind response from the server:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAPAUTH_CANNOT_READ_INITIAL_BIND_RESPONSE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_LDAPAUTH_CANNOT_READ_INITIAL_BIND_RESPONSE_152",TOOLS,MILD_ERROR,152, getClassLoader());

  /**
   * The client received an unexpected intermediate bind response.  The "SASL bind in progress" result was expected for the first response in the multi-stage %s bind process, but the bind response had a result code of %d (%s) and an error message of "%s"
   */
  public static final MessageDescriptor.Arg4<CharSequence,Number,CharSequence,CharSequence> ERR_LDAPAUTH_UNEXPECTED_INITIAL_BIND_RESPONSE =
          new MessageDescriptor.Arg4<CharSequence,Number,CharSequence,CharSequence>(BASE,"MILD_ERR_LDAPAUTH_UNEXPECTED_INITIAL_BIND_RESPONSE_153",TOOLS,MILD_ERROR,153, getClassLoader());

  /**
   * The initial bind response from the server did not include any server SASL credentials containing the challenge information needed to complete the CRAM-MD5 authentication
   */
  public static final MessageDescriptor.Arg0 ERR_LDAPAUTH_NO_CRAMMD5_SERVER_CREDENTIALS =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_LDAPAUTH_NO_CRAMMD5_SERVER_CREDENTIALS_154",TOOLS,MILD_ERROR,154, getClassLoader());

  /**
   * An unexpected error occurred while trying to initialize the MD5 digest generator:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAPAUTH_CANNOT_INITIALIZE_MD5_DIGEST =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAPAUTH_CANNOT_INITIALIZE_MD5_DIGEST_155",TOOLS,MILD_ERROR,155, getClassLoader());

  /**
   * Cannot send the second bind request in the multi-stage %s bind to the server:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAPAUTH_CANNOT_SEND_SECOND_SASL_BIND =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_LDAPAUTH_CANNOT_SEND_SECOND_SASL_BIND_156",TOOLS,MILD_ERROR,156, getClassLoader());

  /**
   * Cannot read the second %s bind response from the server:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAPAUTH_CANNOT_READ_SECOND_BIND_RESPONSE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_LDAPAUTH_CANNOT_READ_SECOND_BIND_RESPONSE_157",TOOLS,MILD_ERROR,157, getClassLoader());

  /**
   * One or more SASL properties were provided, but the %s mechanism does not take any SASL properties
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAPAUTH_NO_ALLOWED_SASL_PROPERTIES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAPAUTH_NO_ALLOWED_SASL_PROPERTIES_158",TOOLS,MILD_ERROR,158, getClassLoader());

  /**
   * The "authzid" SASL property only accepts a single value
   */
  public static final MessageDescriptor.Arg0 ERR_LDAPAUTH_AUTHZID_SINGLE_VALUED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_LDAPAUTH_AUTHZID_SINGLE_VALUED_159",TOOLS,MILD_ERROR,159, getClassLoader());

  /**
   * The "realm" SASL property only accepts a single value
   */
  public static final MessageDescriptor.Arg0 ERR_LDAPAUTH_REALM_SINGLE_VALUED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_LDAPAUTH_REALM_SINGLE_VALUED_160",TOOLS,MILD_ERROR,160, getClassLoader());

  /**
   * The "qop" SASL property only accepts a single value
   */
  public static final MessageDescriptor.Arg0 ERR_LDAPAUTH_QOP_SINGLE_VALUED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_LDAPAUTH_QOP_SINGLE_VALUED_161",TOOLS,MILD_ERROR,161, getClassLoader());

  /**
   * The "%s" QoP mode is not supported by this client.  Only the "auth" mode is currently available for use
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAPAUTH_DIGESTMD5_QOP_NOT_SUPPORTED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAPAUTH_DIGESTMD5_QOP_NOT_SUPPORTED_162",TOOLS,MILD_ERROR,162, getClassLoader());

  /**
   * The specified DIGEST-MD5 quality of protection mode "%s" is not valid.  The only QoP mode currently supported is "auth"
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAPAUTH_DIGESTMD5_INVALID_QOP =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAPAUTH_DIGESTMD5_INVALID_QOP_163",TOOLS,MILD_ERROR,163, getClassLoader());

  /**
   * The "digest-uri" SASL property only accepts a single value
   */
  public static final MessageDescriptor.Arg0 ERR_LDAPAUTH_DIGEST_URI_SINGLE_VALUED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_LDAPAUTH_DIGEST_URI_SINGLE_VALUED_164",TOOLS,MILD_ERROR,164, getClassLoader());

  /**
   * The initial bind response from the server did not include any server SASL credentials containing the challenge information needed to complete the DIGEST-MD5 authentication
   */
  public static final MessageDescriptor.Arg0 ERR_LDAPAUTH_NO_DIGESTMD5_SERVER_CREDENTIALS =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_LDAPAUTH_NO_DIGESTMD5_SERVER_CREDENTIALS_165",TOOLS,MILD_ERROR,165, getClassLoader());

  /**
   * The DIGEST-MD5 credentials provided by the server contained an invalid token of "%s" starting at position %d
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_LDAPAUTH_DIGESTMD5_INVALID_TOKEN_IN_CREDENTIALS =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_ERR_LDAPAUTH_DIGESTMD5_INVALID_TOKEN_IN_CREDENTIALS_166",TOOLS,MILD_ERROR,166, getClassLoader());

  /**
   * The DIGEST-MD5 credentials provided by the server specified the use of the "%s" character set.  The character set that may be specified in the DIGEST-MD5 credentials is "utf-8"
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAPAUTH_DIGESTMD5_INVALID_CHARSET =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAPAUTH_DIGESTMD5_INVALID_CHARSET_167",TOOLS,MILD_ERROR,167, getClassLoader());

  /**
   * The requested QoP mode of "%s" is not listed as supported by the Directory Server.  The Directory Server's list of supported QoP modes is:  "%s"
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAPAUTH_REQUESTED_QOP_NOT_SUPPORTED_BY_SERVER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_LDAPAUTH_REQUESTED_QOP_NOT_SUPPORTED_BY_SERVER_168",TOOLS,MILD_ERROR,168, getClassLoader());

  /**
   * The server SASL credentials provided in response to the initial DIGEST-MD5 bind request did not include the nonce to use to generate the authentication digests
   */
  public static final MessageDescriptor.Arg0 ERR_LDAPAUTH_DIGESTMD5_NO_NONCE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_LDAPAUTH_DIGESTMD5_NO_NONCE_169",TOOLS,MILD_ERROR,169, getClassLoader());

  /**
   * An error occurred while attempting to generate the response digest for the DIGEST-MD5 bind request:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAPAUTH_DIGESTMD5_CANNOT_CREATE_RESPONSE_DIGEST =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAPAUTH_DIGESTMD5_CANNOT_CREATE_RESPONSE_DIGEST_170",TOOLS,MILD_ERROR,170, getClassLoader());

  /**
   * The DIGEST-MD5 bind response from the server did not include the "rspauth" element to provide a digest of the response authentication information
   */
  public static final MessageDescriptor.Arg0 ERR_LDAPAUTH_DIGESTMD5_NO_RSPAUTH_CREDS =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_LDAPAUTH_DIGESTMD5_NO_RSPAUTH_CREDS_171",TOOLS,MILD_ERROR,171, getClassLoader());

  /**
   * An error occurred while trying to decode the rspauth element of the DIGEST-MD5 bind response from the server as a hexadecimal string:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAPAUTH_DIGESTMD5_COULD_NOT_DECODE_RSPAUTH =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAPAUTH_DIGESTMD5_COULD_NOT_DECODE_RSPAUTH_172",TOOLS,MILD_ERROR,172, getClassLoader());

  /**
   * An error occurred while trying to calculate the expected rspauth element to compare against the value included in the DIGEST-MD5 response from the server:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAPAUTH_DIGESTMD5_COULD_NOT_CALCULATE_RSPAUTH =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAPAUTH_DIGESTMD5_COULD_NOT_CALCULATE_RSPAUTH_173",TOOLS,MILD_ERROR,173, getClassLoader());

  /**
   * The rpsauth element included in the DIGEST-MD5 bind response from the Directory Server was different from the expected value calculated by the client
   */
  public static final MessageDescriptor.Arg0 ERR_LDAPAUTH_DIGESTMD5_RSPAUTH_MISMATCH =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_LDAPAUTH_DIGESTMD5_RSPAUTH_MISMATCH_174",TOOLS,MILD_ERROR,174, getClassLoader());

  /**
   * The DIGEST-MD5 response challenge could not be parsed because it had an invalid quotation mark at position %d
   */
  public static final MessageDescriptor.Arg1<Number> ERR_LDAPAUTH_DIGESTMD5_INVALID_CLOSING_QUOTE_POS =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_LDAPAUTH_DIGESTMD5_INVALID_CLOSING_QUOTE_POS_175",TOOLS,MILD_ERROR,175, getClassLoader());

  /**
   * Text string that may be written to the Directory Server error log as trace information for the bind
   */
  public static final MessageDescriptor.Arg0 INFO_LDAPAUTH_PROPERTY_DESCRIPTION_TRACE =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAPAUTH_PROPERTY_DESCRIPTION_TRACE_176",TOOLS,INFORMATION,176, getClassLoader());

  /**
   * Authentication ID for the bind
   */
  public static final MessageDescriptor.Arg0 INFO_LDAPAUTH_PROPERTY_DESCRIPTION_AUTHID =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAPAUTH_PROPERTY_DESCRIPTION_AUTHID_177",TOOLS,INFORMATION,177, getClassLoader());

  /**
   * Realm into which the authentication is to be performed
   */
  public static final MessageDescriptor.Arg0 INFO_LDAPAUTH_PROPERTY_DESCRIPTION_REALM =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAPAUTH_PROPERTY_DESCRIPTION_REALM_178",TOOLS,INFORMATION,178, getClassLoader());

  /**
   * Quality of protection to use for the bind
   */
  public static final MessageDescriptor.Arg0 INFO_LDAPAUTH_PROPERTY_DESCRIPTION_QOP =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAPAUTH_PROPERTY_DESCRIPTION_QOP_179",TOOLS,INFORMATION,179, getClassLoader());

  /**
   * Digest URI to use for the bind
   */
  public static final MessageDescriptor.Arg0 INFO_LDAPAUTH_PROPERTY_DESCRIPTION_DIGEST_URI =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAPAUTH_PROPERTY_DESCRIPTION_DIGEST_URI_180",TOOLS,INFORMATION,180, getClassLoader());

  /**
   * Authorization ID to use for the bind
   */
  public static final MessageDescriptor.Arg0 INFO_LDAPAUTH_PROPERTY_DESCRIPTION_AUTHZID =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAPAUTH_PROPERTY_DESCRIPTION_AUTHZID_181",TOOLS,INFORMATION,181, getClassLoader());

  /**
   * SASL bind options
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_SASL_PROPERTIES =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_SASL_PROPERTIES_182",TOOLS,INFORMATION,182, getClassLoader());

  /**
   * KDC to use for the Kerberos authentication
   */
  public static final MessageDescriptor.Arg0 INFO_LDAPAUTH_PROPERTY_DESCRIPTION_KDC =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAPAUTH_PROPERTY_DESCRIPTION_KDC_183",TOOLS,INFORMATION,183, getClassLoader());

  /**
   * The "kdc" SASL property only accepts a single value
   */
  public static final MessageDescriptor.Arg0 ERR_LDAPAUTH_KDC_SINGLE_VALUED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_LDAPAUTH_KDC_SINGLE_VALUED_184",TOOLS,MILD_ERROR,184, getClassLoader());

  /**
   * The specified GSSAPI quality of protection mode "%s" is not valid.  The only QoP mode currently supported is "auth"
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAPAUTH_GSSAPI_INVALID_QOP =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAPAUTH_GSSAPI_INVALID_QOP_185",TOOLS,MILD_ERROR,185, getClassLoader());

  /**
   * An error occurred while trying to create the temporary JAAS configuration for GSSAPI authentication:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAPAUTH_GSSAPI_CANNOT_CREATE_JAAS_CONFIG =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDAPAUTH_GSSAPI_CANNOT_CREATE_JAAS_CONFIG_186",TOOLS,SEVERE_ERROR,186, getClassLoader());

  /**
   * An error occurred while attempting to perform local authentication to the Kerberos realm:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAPAUTH_GSSAPI_LOCAL_AUTHENTICATION_FAILED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAPAUTH_GSSAPI_LOCAL_AUTHENTICATION_FAILED_187",TOOLS,MILD_ERROR,187, getClassLoader());

  /**
   * An error occurred while attempting to perform GSSAPI authentication to the Directory Server: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAPAUTH_GSSAPI_REMOTE_AUTHENTICATION_FAILED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAPAUTH_GSSAPI_REMOTE_AUTHENTICATION_FAILED_188",TOOLS,MILD_ERROR,188, getClassLoader());

  /**
   * The LDAPAuthenticationHandler.run() method was called for a non-SASL bind.  The backtrace for this call is %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAPAUTH_NONSASL_RUN_INVOCATION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDAPAUTH_NONSASL_RUN_INVOCATION_189",TOOLS,SEVERE_ERROR,189, getClassLoader());

  /**
   * The LDAPAuthenticationHandler.run() method was called for a SASL bind with an unexpected mechanism of "%s".  The backtrace for this call is %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAPAUTH_UNEXPECTED_RUN_INVOCATION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDAPAUTH_UNEXPECTED_RUN_INVOCATION_190",TOOLS,SEVERE_ERROR,190, getClassLoader());

  /**
   * An error occurred while attempting to create a SASL client to process the GSSAPI authentication:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAPAUTH_GSSAPI_CANNOT_CREATE_SASL_CLIENT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDAPAUTH_GSSAPI_CANNOT_CREATE_SASL_CLIENT_191",TOOLS,SEVERE_ERROR,191, getClassLoader());

  /**
   * An error occurred while attempting to create the initial challenge for GSSAPI authentication:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAPAUTH_GSSAPI_CANNOT_CREATE_INITIAL_CHALLENGE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDAPAUTH_GSSAPI_CANNOT_CREATE_INITIAL_CHALLENGE_192",TOOLS,SEVERE_ERROR,192, getClassLoader());

  /**
   * An error occurred while trying to validate the SASL credentials provided by the Directory Server in the GSSAPI bind response:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAPAUTH_GSSAPI_CANNOT_VALIDATE_SERVER_CREDS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAPAUTH_GSSAPI_CANNOT_VALIDATE_SERVER_CREDS_193",TOOLS,MILD_ERROR,193, getClassLoader());

  /**
   * The Directory Server unexpectedly returned a success response to the client even though the client does not believe that the GSSAPI negotiation is complete
   */
  public static final MessageDescriptor.Arg0 ERR_LDAPAUTH_GSSAPI_UNEXPECTED_SUCCESS_RESPONSE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_LDAPAUTH_GSSAPI_UNEXPECTED_SUCCESS_RESPONSE_194",TOOLS,MILD_ERROR,194, getClassLoader());

  /**
   * The GSSAPI bind attempt failed
   */
  public static final MessageDescriptor.Arg0 ERR_LDAPAUTH_GSSAPI_BIND_FAILED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_LDAPAUTH_GSSAPI_BIND_FAILED_195",TOOLS,MILD_ERROR,195, getClassLoader());

  /**
   * The LDAPAuthenticationHandler.handle() method was called for a non-SASL bind. The backtrace for this call is %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAPAUTH_NONSASL_CALLBACK_INVOCATION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDAPAUTH_NONSASL_CALLBACK_INVOCATION_196",TOOLS,SEVERE_ERROR,196, getClassLoader());

  /**
   * The LDAPAuthenticationHandler.handle() method was called during a GSSAPI bind attempt with an unexpected callback type of %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAPAUTH_UNEXPECTED_GSSAPI_CALLBACK =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDAPAUTH_UNEXPECTED_GSSAPI_CALLBACK_197",TOOLS,SEVERE_ERROR,197, getClassLoader());

  /**
   * The LDAPAuthenticationHandler.handle() method was called for an unexpected SASL mechanism of %s.  The backtrace for this call is %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAPAUTH_UNEXPECTED_CALLBACK_INVOCATION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDAPAUTH_UNEXPECTED_CALLBACK_INVOCATION_198",TOOLS,SEVERE_ERROR,198, getClassLoader());

  /**
   * Password for user '%s':
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_LDAPAUTH_PASSWORD_PROMPT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_LDAPAUTH_PASSWORD_PROMPT_199",TOOLS,INFORMATION,199, getClassLoader());

  /**
   * LDAP protocol version number
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_VERSION =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_VERSION_200",TOOLS,INFORMATION,200, getClassLoader());

  /**
   * Invalid LDAP version number '%s'. Allowed values are 2 and 3
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DESCRIPTION_INVALID_VERSION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_DESCRIPTION_INVALID_VERSION_201",TOOLS,MILD_ERROR,201, getClassLoader());

  /**
   * Cannot send the 'Who Am I?' request to the Directory Server:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAPAUTH_CANNOT_SEND_WHOAMI_REQUEST =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDAPAUTH_CANNOT_SEND_WHOAMI_REQUEST_202",TOOLS,SEVERE_ERROR,202, getClassLoader());

  /**
   * Cannot read the 'Who Am I?' response from the Directory Server:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAPAUTH_CANNOT_READ_WHOAMI_RESPONSE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDAPAUTH_CANNOT_READ_WHOAMI_RESPONSE_203",TOOLS,SEVERE_ERROR,203, getClassLoader());

  /**
   * The 'Who Am I?' request was rejected by the Directory Server
   */
  public static final MessageDescriptor.Arg0 ERR_LDAPAUTH_WHOAMI_FAILED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_LDAPAUTH_WHOAMI_FAILED_204",TOOLS,MILD_ERROR,204, getClassLoader());

  /**
   * Invalid scope '%s' specified for the search request
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SEARCH_INVALID_SEARCH_SCOPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_SEARCH_INVALID_SEARCH_SCOPE_205",TOOLS,SEVERE_ERROR,205, getClassLoader());

  /**
   * No filters specified for the search request
   */
  public static final MessageDescriptor.Arg0 ERR_SEARCH_NO_FILTERS =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_SEARCH_NO_FILTERS_206",TOOLS,SEVERE_ERROR,206, getClassLoader());

  /**
   * Base DN of a backend supporting indexing. Verification is performed on indexes within the scope of the given base DN
   */
  public static final MessageDescriptor.Arg0 INFO_VERIFYINDEX_DESCRIPTION_BASE_DN =
          new MessageDescriptor.Arg0(BASE,"INFO_VERIFYINDEX_DESCRIPTION_BASE_DN_207",TOOLS,INFORMATION,207, getClassLoader());

  /**
   * Name of an index to be verified. For an attribute index this is simply an attribute name. Multiple indexes may be verified for completeness, or all indexes if no indexes are specified.  An index is complete if each index value references all entries containing that value
   */
  public static final MessageDescriptor.Arg0 INFO_VERIFYINDEX_DESCRIPTION_INDEX_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_VERIFYINDEX_DESCRIPTION_INDEX_NAME_208",TOOLS,INFORMATION,208, getClassLoader());

  /**
   * Specifies that a single index should be verified to ensure it is clean.  An index is clean if each index value references only entries containing that value.  Only one index at a time may be verified in this way
   */
  public static final MessageDescriptor.Arg0 INFO_VERIFYINDEX_DESCRIPTION_VERIFY_CLEAN =
          new MessageDescriptor.Arg0(BASE,"INFO_VERIFYINDEX_DESCRIPTION_VERIFY_CLEAN_209",TOOLS,INFORMATION,209, getClassLoader());

  /**
   * An error occurred while attempting to perform index verification:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_VERIFYINDEX_ERROR_DURING_VERIFY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_VERIFYINDEX_ERROR_DURING_VERIFY_210",TOOLS,SEVERE_ERROR,210, getClassLoader());

  /**
   * Only one index at a time may be verified for cleanliness
   */
  public static final MessageDescriptor.Arg0 ERR_VERIFYINDEX_VERIFY_CLEAN_REQUIRES_SINGLE_INDEX =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_VERIFYINDEX_VERIFY_CLEAN_REQUIRES_SINGLE_INDEX_211",TOOLS,SEVERE_ERROR,211, getClassLoader());

  /**
   * The backend does not support indexing
   */
  public static final MessageDescriptor.Arg0 ERR_BACKEND_NO_INDEXING_SUPPORT =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_BACKEND_NO_INDEXING_SUPPORT_212",TOOLS,SEVERE_ERROR,212, getClassLoader());

  /**
   * The Directory Server backend with backend ID "%s" does not provide a mechanism for performing LDIF exports
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIFEXPORT_CANNOT_EXPORT_BACKEND =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDIFEXPORT_CANNOT_EXPORT_BACKEND_213",TOOLS,SEVERE_ERROR,213, getClassLoader());

  /**
   * The Directory Server backend with backend ID %s does not provide a mechanism for performing LDIF imports
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIFIMPORT_CANNOT_IMPORT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDIFIMPORT_CANNOT_IMPORT_214",TOOLS,SEVERE_ERROR,214, getClassLoader());

  /**
   * Do not wrap long lines
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_DONT_WRAP =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_DONT_WRAP_215",TOOLS,INFORMATION,215, getClassLoader());

  /**
   * Base DN of a branch to include in the LDIF import
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFIMPORT_DESCRIPTION_INCLUDE_BRANCH =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFIMPORT_DESCRIPTION_INCLUDE_BRANCH_216",TOOLS,INFORMATION,216, getClassLoader());

  /**
   * Cannot determine the backend ID for the backend defined in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CANNOT_DETERMINE_BACKEND_ID =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CANNOT_DETERMINE_BACKEND_ID_217",TOOLS,SEVERE_ERROR,217, getClassLoader());

  /**
   * Unable to decode include branch string "%s" as a valid distinguished name:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIFIMPORT_CANNOT_DECODE_INCLUDE_BASE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIFIMPORT_CANNOT_DECODE_INCLUDE_BASE_218",TOOLS,SEVERE_ERROR,218, getClassLoader());

  /**
   * Provided include base DN "%s" is not handled by the backend with backend ID %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIFIMPORT_INVALID_INCLUDE_BASE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIFIMPORT_INVALID_INCLUDE_BASE_219",TOOLS,SEVERE_ERROR,219, getClassLoader());

  /**
   * Multiple Directory Server backends are configured to support base DN "%s"
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MULTIPLE_BACKENDS_FOR_BASE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_MULTIPLE_BACKENDS_FOR_BASE_230",TOOLS,SEVERE_ERROR,230, getClassLoader());

  /**
   * None of the Directory Server backends are configured to support the requested base DN "%s"
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_NO_BACKENDS_FOR_BASE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_NO_BACKENDS_FOR_BASE_231",TOOLS,SEVERE_ERROR,231, getClassLoader());

  /**
   * Base DN of a branch to include in the LDIF export
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFEXPORT_DESCRIPTION_INCLUDE_BRANCH =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFEXPORT_DESCRIPTION_INCLUDE_BRANCH_240",TOOLS,INFORMATION,240, getClassLoader());

  /**
   * Unable to decode include branch string "%s" as a valid distinguished name:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIFEXPORT_CANNOT_DECODE_INCLUDE_BASE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIFEXPORT_CANNOT_DECODE_INCLUDE_BASE_241",TOOLS,SEVERE_ERROR,241, getClassLoader());

  /**
   * Provided include base DN "%s" is not handled by the backend with backend ID %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIFEXPORT_INVALID_INCLUDE_BASE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIFEXPORT_INVALID_INCLUDE_BASE_242",TOOLS,SEVERE_ERROR,242, getClassLoader());

  /**
   * Backend ID for the backend to archive
   */
  public static final MessageDescriptor.Arg0 INFO_BACKUPDB_DESCRIPTION_BACKEND_ID =
          new MessageDescriptor.Arg0(BASE,"INFO_BACKUPDB_DESCRIPTION_BACKEND_ID_245",TOOLS,INFORMATION,245, getClassLoader());

  /**
   * Use the provided identifier for the backup
   */
  public static final MessageDescriptor.Arg0 INFO_BACKUPDB_DESCRIPTION_BACKUP_ID =
          new MessageDescriptor.Arg0(BASE,"INFO_BACKUPDB_DESCRIPTION_BACKUP_ID_246",TOOLS,INFORMATION,246, getClassLoader());

  /**
   * Path to the target directory for the backup file(s)
   */
  public static final MessageDescriptor.Arg0 INFO_BACKUPDB_DESCRIPTION_BACKUP_DIR =
          new MessageDescriptor.Arg0(BASE,"INFO_BACKUPDB_DESCRIPTION_BACKUP_DIR_247",TOOLS,INFORMATION,247, getClassLoader());

  /**
   * Perform an incremental backup rather than a full backup
   */
  public static final MessageDescriptor.Arg0 INFO_BACKUPDB_DESCRIPTION_INCREMENTAL =
          new MessageDescriptor.Arg0(BASE,"INFO_BACKUPDB_DESCRIPTION_INCREMENTAL_248",TOOLS,INFORMATION,248, getClassLoader());

  /**
   * Compress the backup contents
   */
  public static final MessageDescriptor.Arg0 INFO_BACKUPDB_DESCRIPTION_COMPRESS =
          new MessageDescriptor.Arg0(BASE,"INFO_BACKUPDB_DESCRIPTION_COMPRESS_249",TOOLS,INFORMATION,249, getClassLoader());

  /**
   * Encrypt the backup contents
   */
  public static final MessageDescriptor.Arg0 INFO_BACKUPDB_DESCRIPTION_ENCRYPT =
          new MessageDescriptor.Arg0(BASE,"INFO_BACKUPDB_DESCRIPTION_ENCRYPT_250",TOOLS,INFORMATION,250, getClassLoader());

  /**
   * Generate a hash of the backup contents
   */
  public static final MessageDescriptor.Arg0 INFO_BACKUPDB_DESCRIPTION_HASH =
          new MessageDescriptor.Arg0(BASE,"INFO_BACKUPDB_DESCRIPTION_HASH_251",TOOLS,INFORMATION,251, getClassLoader());

  /**
   * Sign the hash of the backup contents
   */
  public static final MessageDescriptor.Arg0 INFO_BACKUPDB_DESCRIPTION_SIGN_HASH =
          new MessageDescriptor.Arg0(BASE,"INFO_BACKUPDB_DESCRIPTION_SIGN_HASH_252",TOOLS,INFORMATION,252, getClassLoader());

  /**
   * Multiple Directory Server backends are configured with the requested backend ID "%s"
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_BACKUPDB_MULTIPLE_BACKENDS_FOR_ID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_BACKUPDB_MULTIPLE_BACKENDS_FOR_ID_260",TOOLS,SEVERE_ERROR,260, getClassLoader());

  /**
   * None of the Directory Server backends are configured with the requested backend ID "%s"
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_BACKUPDB_NO_BACKENDS_FOR_ID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_BACKUPDB_NO_BACKENDS_FOR_ID_261",TOOLS,SEVERE_ERROR,261, getClassLoader());

  /**
   * The configuration for the backend with backend ID %s is held in entry "%s", but other backups in the target backup directory %s were generated from a backend whose configuration was held in configuration entry "%s"
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> ERR_BACKUPDB_CONFIG_ENTRY_MISMATCH =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_BACKUPDB_CONFIG_ENTRY_MISMATCH_262",TOOLS,SEVERE_ERROR,262, getClassLoader());

  /**
   * An error occurred while attempting to use the specified path "%s" as the target directory for the backup:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_BACKUPDB_INVALID_BACKUP_DIR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_BACKUPDB_INVALID_BACKUP_DIR_263",TOOLS,SEVERE_ERROR,263, getClassLoader());

  /**
   * The target backend %s cannot be backed up using the requested configuration:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_BACKUPDB_CANNOT_BACKUP =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_BACKUPDB_CANNOT_BACKUP_264",TOOLS,SEVERE_ERROR,264, getClassLoader());

  /**
   * An error occurred while attempting to back up backend %s with the requested configuration:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_BACKUPDB_ERROR_DURING_BACKUP =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_BACKUPDB_ERROR_DURING_BACKUP_265",TOOLS,SEVERE_ERROR,265, getClassLoader());

  /**
   * Back up all backends in the server
   */
  public static final MessageDescriptor.Arg0 INFO_BACKUPDB_DESCRIPTION_BACKUP_ALL =
          new MessageDescriptor.Arg0(BASE,"INFO_BACKUPDB_DESCRIPTION_BACKUP_ALL_274",TOOLS,INFORMATION,274, getClassLoader());

  /**
   * The %s and %s arguments may not be used together.  Exactly one of them must be provided
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_BACKUPDB_CANNOT_MIX_BACKUP_ALL_AND_BACKEND_ID =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_BACKUPDB_CANNOT_MIX_BACKUP_ALL_AND_BACKEND_ID_275",TOOLS,SEVERE_ERROR,275, getClassLoader());

  /**
   * Neither the %s argument nor the %s argument was provided.  Exactly one of them is required
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_BACKUPDB_NEED_BACKUP_ALL_OR_BACKEND_ID =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_BACKUPDB_NEED_BACKUP_ALL_OR_BACKEND_ID_276",TOOLS,SEVERE_ERROR,276, getClassLoader());

  /**
   * An error occurred while attempting to create the backup directory %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_BACKUPDB_CANNOT_CREATE_BACKUP_DIR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_BACKUPDB_CANNOT_CREATE_BACKUP_DIR_277",TOOLS,SEVERE_ERROR,277, getClassLoader());

  /**
   * Backend ID %s was included in the set of backends to archive, but this backend does not provide support for a backup mechanism.  It will be skipped
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_BACKUPDB_BACKUP_NOT_SUPPORTED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_BACKUPDB_BACKUP_NOT_SUPPORTED_278",TOOLS,SEVERE_WARNING,278, getClassLoader());

  /**
   * None of the target backends provide a backup mechanism.  The backup operation has been aborted
   */
  public static final MessageDescriptor.Arg0 WARN_BACKUPDB_NO_BACKENDS_TO_ARCHIVE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_WARN_BACKUPDB_NO_BACKENDS_TO_ARCHIVE_279",TOOLS,SEVERE_WARNING,279, getClassLoader());

  /**
   * Starting backup for backend %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_BACKUPDB_STARTING_BACKUP =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_BACKUPDB_STARTING_BACKUP_280",TOOLS,NOTICE,280, getClassLoader());

  /**
   * An error occurred while attempting to parse the backup descriptor file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_BACKUPDB_CANNOT_PARSE_BACKUP_DESCRIPTOR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_BACKUPDB_CANNOT_PARSE_BACKUP_DESCRIPTOR_281",TOOLS,SEVERE_ERROR,281, getClassLoader());

  /**
   * The backup process completed with one or more errors
   */
  public static final MessageDescriptor.Arg0 NOTE_BACKUPDB_COMPLETED_WITH_ERRORS =
          new MessageDescriptor.Arg0(BASE,"NOTICE_BACKUPDB_COMPLETED_WITH_ERRORS_282",TOOLS,NOTICE,282, getClassLoader());

  /**
   * The backup process completed successfully
   */
  public static final MessageDescriptor.Arg0 NOTE_BACKUPDB_COMPLETED_SUCCESSFULLY =
          new MessageDescriptor.Arg0(BASE,"NOTICE_BACKUPDB_COMPLETED_SUCCESSFULLY_283",TOOLS,NOTICE,283, getClassLoader());

  /**
   * An error occurred while attempting to initialize the crypto manager:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CANNOT_INITIALIZE_CRYPTO_MANAGER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CANNOT_INITIALIZE_CRYPTO_MANAGER_284",TOOLS,SEVERE_ERROR,284, getClassLoader());

  /**
   * An error occurred while attempting to initialize the subentry manager:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CANNOT_INITIALIZE_SUBENTRY_MANAGER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CANNOT_INITIALIZE_SUBENTRY_MANAGER_285",TOOLS,SEVERE_ERROR,285, getClassLoader());

  /**
   * An error occurred while attempting to initialize the root DN manager:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CANNOT_INITIALIZE_ROOTDN_MANAGER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CANNOT_INITIALIZE_ROOTDN_MANAGER_286",TOOLS,SEVERE_ERROR,286, getClassLoader());

  /**
   * Backup ID of the source archive for an incremental backup
   */
  public static final MessageDescriptor.Arg0 INFO_BACKUPDB_DESCRIPTION_INCREMENTAL_BASE_ID =
          new MessageDescriptor.Arg0(BASE,"INFO_BACKUPDB_DESCRIPTION_INCREMENTAL_BASE_ID_287",TOOLS,INFORMATION,287, getClassLoader());

  /**
   * The use of the %s argument requires that the %s argument is also provided
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_BACKUPDB_INCREMENTAL_BASE_REQUIRES_INCREMENTAL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_BACKUPDB_INCREMENTAL_BASE_REQUIRES_INCREMENTAL_288",TOOLS,SEVERE_ERROR,288, getClassLoader());

  /**
   * Backend ID for the backend to restore
   */
  public static final MessageDescriptor.Arg0 INFO_RESTOREDB_DESCRIPTION_BACKEND_ID =
          new MessageDescriptor.Arg0(BASE,"INFO_RESTOREDB_DESCRIPTION_BACKEND_ID_291",TOOLS,INFORMATION,291, getClassLoader());

  /**
   * Backup ID of the backup to restore
   */
  public static final MessageDescriptor.Arg0 INFO_RESTOREDB_DESCRIPTION_BACKUP_ID =
          new MessageDescriptor.Arg0(BASE,"INFO_RESTOREDB_DESCRIPTION_BACKUP_ID_292",TOOLS,INFORMATION,292, getClassLoader());

  /**
   * Path to the directory containing the backup file(s)
   */
  public static final MessageDescriptor.Arg0 INFO_RESTOREDB_DESCRIPTION_BACKUP_DIR =
          new MessageDescriptor.Arg0(BASE,"INFO_RESTOREDB_DESCRIPTION_BACKUP_DIR_293",TOOLS,INFORMATION,293, getClassLoader());

  /**
   * List available backups in the backup directory
   */
  public static final MessageDescriptor.Arg0 INFO_RESTOREDB_DESCRIPTION_LIST_BACKUPS =
          new MessageDescriptor.Arg0(BASE,"INFO_RESTOREDB_DESCRIPTION_LIST_BACKUPS_294",TOOLS,INFORMATION,294, getClassLoader());

  /**
   * Verify the contents of the backup but do not restore it
   */
  public static final MessageDescriptor.Arg0 INFO_RESTOREDB_DESCRIPTION_VERIFY_ONLY =
          new MessageDescriptor.Arg0(BASE,"INFO_RESTOREDB_DESCRIPTION_VERIFY_ONLY_295",TOOLS,INFORMATION,295, getClassLoader());

  /**
   * An error occurred while attempting to examine the set of backups contained in backup directory %s: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_RESTOREDB_CANNOT_READ_BACKUP_DIRECTORY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_RESTOREDB_CANNOT_READ_BACKUP_DIRECTORY_304",TOOLS,SEVERE_ERROR,304, getClassLoader());

  /**
   * Backup ID:          %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_RESTOREDB_LIST_BACKUP_ID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_RESTOREDB_LIST_BACKUP_ID_305",TOOLS,INFORMATION,305, getClassLoader());

  /**
   * Backup Date:        %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_RESTOREDB_LIST_BACKUP_DATE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_RESTOREDB_LIST_BACKUP_DATE_306",TOOLS,INFORMATION,306, getClassLoader());

  /**
   * Is Incremental:     %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_RESTOREDB_LIST_INCREMENTAL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_RESTOREDB_LIST_INCREMENTAL_307",TOOLS,INFORMATION,307, getClassLoader());

  /**
   * Is Compressed:      %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_RESTOREDB_LIST_COMPRESSED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_RESTOREDB_LIST_COMPRESSED_308",TOOLS,INFORMATION,308, getClassLoader());

  /**
   * Is Encrypted:       %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_RESTOREDB_LIST_ENCRYPTED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_RESTOREDB_LIST_ENCRYPTED_309",TOOLS,INFORMATION,309, getClassLoader());

  /**
   * Has Unsigned Hash:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_RESTOREDB_LIST_HASHED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_RESTOREDB_LIST_HASHED_310",TOOLS,INFORMATION,310, getClassLoader());

  /**
   * Has Signed Hash:    %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_RESTOREDB_LIST_SIGNED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_RESTOREDB_LIST_SIGNED_311",TOOLS,INFORMATION,311, getClassLoader());

  /**
   * Dependent Upon:     %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_RESTOREDB_LIST_DEPENDENCIES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_RESTOREDB_LIST_DEPENDENCIES_312",TOOLS,INFORMATION,312, getClassLoader());

  /**
   * The requested backup ID %s does not exist in %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_RESTOREDB_INVALID_BACKUP_ID =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_RESTOREDB_INVALID_BACKUP_ID_313",TOOLS,SEVERE_ERROR,313, getClassLoader());

  /**
   * There are no Directory Server backups contained in %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_RESTOREDB_NO_BACKUPS_IN_DIRECTORY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_RESTOREDB_NO_BACKUPS_IN_DIRECTORY_314",TOOLS,SEVERE_ERROR,314, getClassLoader());

  /**
   * The backups contained in directory %s were taken from a Directory Server backend defined in configuration entry %s but no such backend is available
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_RESTOREDB_NO_BACKENDS_FOR_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_RESTOREDB_NO_BACKENDS_FOR_DN_315",TOOLS,SEVERE_ERROR,315, getClassLoader());

  /**
   * The Directory Server backend configured with backend ID %s does not provide a mechanism for restoring backups
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_RESTOREDB_CANNOT_RESTORE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_RESTOREDB_CANNOT_RESTORE_316",TOOLS,SEVERE_ERROR,316, getClassLoader());

  /**
   * An unexpected error occurred while attempting to restore backup %s from %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_RESTOREDB_ERROR_DURING_BACKUP =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_RESTOREDB_ERROR_DURING_BACKUP_317",TOOLS,SEVERE_ERROR,317, getClassLoader());

  /**
   * Restoring an encrypted or signed backup requires a connection to an online server
   */
  public static final MessageDescriptor.Arg0 ERR_RESTOREDB_ENCRYPT_OR_SIGN_REQUIRES_ONLINE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_RESTOREDB_ENCRYPT_OR_SIGN_REQUIRES_ONLINE_318",TOOLS,SEVERE_ERROR,318, getClassLoader());

  /**
   * The use of the %s argument or the %s argument requires a connection to an online server instance
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_BACKUPDB_ENCRYPT_OR_SIGN_REQUIRES_ONLINE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_BACKUPDB_ENCRYPT_OR_SIGN_REQUIRES_ONLINE_325",TOOLS,SEVERE_ERROR,325, getClassLoader());

  /**
   * The use of the %s argument requires that the %s argument is also provided
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_BACKUPDB_SIGN_REQUIRES_HASH =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_BACKUPDB_SIGN_REQUIRES_HASH_326",TOOLS,SEVERE_ERROR,326, getClassLoader());

  /**
   * Show what would be done but do not perform any operation
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_NOOP =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_NOOP_327",TOOLS,INFORMATION,327, getClassLoader());

  /**
   * An error occurred while attempting to acquire a shared lock for backend %s:  %s.  This generally means that some other process has exclusive access to this backend (e.g., a restore or an LDIF import).  This backend will not be archived
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_BACKUPDB_CANNOT_LOCK_BACKEND =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_BACKUPDB_CANNOT_LOCK_BACKEND_328",TOOLS,SEVERE_ERROR,328, getClassLoader());

  /**
   * An error occurred while attempting to release the shared lock for backend %s:  %s.  This lock should automatically be cleared when the backup process exits, so no further action should be required
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_BACKUPDB_CANNOT_UNLOCK_BACKEND =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_BACKUPDB_CANNOT_UNLOCK_BACKEND_329",TOOLS,SEVERE_WARNING,329, getClassLoader());

  /**
   * An error occurred while attempting to acquire an exclusive lock for backend %s:  %s.  This generally means some other process is still using this backend (e.g., it is in use by the Directory Server or a backup or LDIF export is in progress).  The restore cannot continue
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_RESTOREDB_CANNOT_LOCK_BACKEND =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_RESTOREDB_CANNOT_LOCK_BACKEND_330",TOOLS,SEVERE_ERROR,330, getClassLoader());

  /**
   * An error occurred while attempting to release the exclusive lock for backend %s:  %s.  This lock should automatically be cleared when the restore process exits, so no further action should be required
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_RESTOREDB_CANNOT_UNLOCK_BACKEND =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_RESTOREDB_CANNOT_UNLOCK_BACKEND_331",TOOLS,SEVERE_WARNING,331, getClassLoader());

  /**
   * An error occurred while attempting to acquire an exclusive lock for backend %s:  %s.  This generally means some other process is still using this backend (e.g., it is in use by the Directory Server or a backup or LDIF export is in progress).  The LDIF import cannot continue
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIFIMPORT_CANNOT_LOCK_BACKEND =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIFIMPORT_CANNOT_LOCK_BACKEND_332",TOOLS,SEVERE_ERROR,332, getClassLoader());

  /**
   * An error occurred while attempting to release the exclusive lock for backend %s:  %s.  This lock should automatically be cleared when the import process exits, so no further action should be required
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_LDIFIMPORT_CANNOT_UNLOCK_BACKEND =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_LDIFIMPORT_CANNOT_UNLOCK_BACKEND_333",TOOLS,SEVERE_WARNING,333, getClassLoader());

  /**
   * An error occurred while attempting to acquire a shared lock for backend %s:  %s.  This generally means that some other process has an exclusive lock on this backend (e.g., an LDIF import or a restore).  The LDIF export cannot continue
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIFEXPORT_CANNOT_LOCK_BACKEND =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIFEXPORT_CANNOT_LOCK_BACKEND_334",TOOLS,SEVERE_ERROR,334, getClassLoader());

  /**
   * An error occurred while attempting to release the shared lock for backend %s:  %s.  This lock should automatically be cleared when the export process exits, so no further action should be required
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_LDIFEXPORT_CANNOT_UNLOCK_BACKEND =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_LDIFEXPORT_CANNOT_UNLOCK_BACKEND_335",TOOLS,SEVERE_WARNING,335, getClassLoader());

  /**
   * An error occurred while attempting to acquire a shared lock for backend %s:  %s.  This generally means that some other process has an exclusive lock on this backend (e.g., an LDIF import or a restore).  The index verification cannot continue
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_VERIFYINDEX_CANNOT_LOCK_BACKEND =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_VERIFYINDEX_CANNOT_LOCK_BACKEND_336",TOOLS,SEVERE_ERROR,336, getClassLoader());

  /**
   * An error occurred while attempting to release the shared lock for backend %s:  %s.  This lock should automatically be cleared when the verification process exits, so no further action should be required
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_VERIFYINDEX_CANNOT_UNLOCK_BACKEND =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_VERIFYINDEX_CANNOT_UNLOCK_BACKEND_337",TOOLS,SEVERE_WARNING,337, getClassLoader());

  /**
   * Only retrieve attribute names but not their values
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_TYPES_ONLY =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_TYPES_ONLY_338",TOOLS,INFORMATION,338, getClassLoader());

  /**
   * Skip schema validation during the LDIF import
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFIMPORT_DESCRIPTION_SKIP_SCHEMA_VALIDATION =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFIMPORT_DESCRIPTION_SKIP_SCHEMA_VALIDATION_339",TOOLS,INFORMATION,339, getClassLoader());

  /**
   * An error occurred while attempting to initialize the LDIF export plugins:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIFEXPORT_CANNOT_INITIALIZE_PLUGINS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDIFEXPORT_CANNOT_INITIALIZE_PLUGINS_340",TOOLS,SEVERE_ERROR,340, getClassLoader());

  /**
   * An error occurred while attempting to initialize the LDIF import plugins:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIFIMPORT_CANNOT_INITIALIZE_PLUGINS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDIFIMPORT_CANNOT_INITIALIZE_PLUGINS_341",TOOLS,SEVERE_ERROR,341, getClassLoader());

  /**
   * Use the LDAP assertion control with the provided filter
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_ASSERTION_FILTER =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_ASSERTION_FILTER_342",TOOLS,INFORMATION,342, getClassLoader());

  /**
   * The search filter provided for the LDAP assertion control was invalid:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_ASSERTION_INVALID_FILTER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_ASSERTION_INVALID_FILTER_343",TOOLS,MILD_ERROR,343, getClassLoader());

  /**
   * Use the LDAP ReadEntry pre-read control
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PREREAD_ATTRS =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PREREAD_ATTRS_346",TOOLS,INFORMATION,346, getClassLoader());

  /**
   * Use the LDAP ReadEntry post-read control
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_POSTREAD_ATTRS =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_POSTREAD_ATTRS_347",TOOLS,INFORMATION,347, getClassLoader());

  /**
   * The pre-read response control did not include a value
   */
  public static final MessageDescriptor.Arg0 ERR_LDAPMODIFY_PREREAD_NO_VALUE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_LDAPMODIFY_PREREAD_NO_VALUE_348",TOOLS,MILD_ERROR,348, getClassLoader());

  /**
   * An error occurred while trying to decode the entry contained in the value of the pre-read response control:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAPMODIFY_PREREAD_CANNOT_DECODE_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAPMODIFY_PREREAD_CANNOT_DECODE_VALUE_349",TOOLS,MILD_ERROR,349, getClassLoader());

  /**
   * Target entry before the operation:
   */
  public static final MessageDescriptor.Arg0 INFO_LDAPMODIFY_PREREAD_ENTRY =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAPMODIFY_PREREAD_ENTRY_350",TOOLS,INFORMATION,350, getClassLoader());

  /**
   * The post-read response control did not include a value
   */
  public static final MessageDescriptor.Arg0 ERR_LDAPMODIFY_POSTREAD_NO_VALUE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_LDAPMODIFY_POSTREAD_NO_VALUE_351",TOOLS,MILD_ERROR,351, getClassLoader());

  /**
   * An error occurred while trying to decode the entry contained in the value of the post-read response control:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAPMODIFY_POSTREAD_CANNOT_DECODE_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAPMODIFY_POSTREAD_CANNOT_DECODE_VALUE_352",TOOLS,MILD_ERROR,352, getClassLoader());

  /**
   * Target entry after the operation:
   */
  public static final MessageDescriptor.Arg0 INFO_LDAPMODIFY_POSTREAD_ENTRY =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAPMODIFY_POSTREAD_ENTRY_353",TOOLS,INFORMATION,353, getClassLoader());

  /**
   * Use the proxied authorization control with the given authorization ID
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PROXY_AUTHZID =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PROXY_AUTHZID_354",TOOLS,INFORMATION,354, getClassLoader());

  /**
   * Use the persistent search control
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PSEARCH_INFO =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PSEARCH_INFO_355",TOOLS,INFORMATION,355, getClassLoader());

  /**
   * The request to use the persistent search control did not include a descriptor that indicates the options to use with that control
   */
  public static final MessageDescriptor.Arg0 ERR_PSEARCH_MISSING_DESCRIPTOR =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_PSEARCH_MISSING_DESCRIPTOR_356",TOOLS,MILD_ERROR,356, getClassLoader());

  /**
   * The persistent search descriptor %s did not start with the required 'ps' string
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PSEARCH_DOESNT_START_WITH_PS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_PSEARCH_DOESNT_START_WITH_PS_357",TOOLS,MILD_ERROR,357, getClassLoader());

  /**
   * The provided change type value %s is invalid.  The recognized change types are add, delete, modify, modifydn, and any
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PSEARCH_INVALID_CHANGE_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_PSEARCH_INVALID_CHANGE_TYPE_358",TOOLS,MILD_ERROR,358, getClassLoader());

  /**
   * The provided changesOnly value %s is invalid.  Allowed values are 1 to only return matching entries that have changed since the beginning of the search, or 0 to also include existing entries that match the search criteria
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PSEARCH_INVALID_CHANGESONLY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_PSEARCH_INVALID_CHANGESONLY_359",TOOLS,MILD_ERROR,359, getClassLoader());

  /**
   * The provided returnECs value %s is invalid.  Allowed values are 1 to request that the entry change notification control be included in updated entries, or 0 to exclude the control from matching entries
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PSEARCH_INVALID_RETURN_ECS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_PSEARCH_INVALID_RETURN_ECS_360",TOOLS,MILD_ERROR,360, getClassLoader());

  /**
   * Use the authorization identity control
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_REPORT_AUTHZID =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_REPORT_AUTHZID_361",TOOLS,INFORMATION,361, getClassLoader());

  /**
   * # Bound with authorization ID %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_BIND_AUTHZID_RETURNED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_BIND_AUTHZID_RETURNED_362",TOOLS,INFORMATION,362, getClassLoader());

  /**
   * File containing a list of search filter strings
   */
  public static final MessageDescriptor.Arg0 INFO_SEARCH_DESCRIPTION_FILENAME =
          new MessageDescriptor.Arg0(BASE,"INFO_SEARCH_DESCRIPTION_FILENAME_363",TOOLS,INFORMATION,363, getClassLoader());

  /**
   * Use the LDAP matched values control with the provided filter
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_MATCHED_VALUES_FILTER =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_MATCHED_VALUES_FILTER_364",TOOLS,INFORMATION,364, getClassLoader());

  /**
   * The provided matched values filter was invalid:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_MATCHEDVALUES_INVALID_FILTER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_MATCHEDVALUES_INVALID_FILTER_365",TOOLS,MILD_ERROR,365, getClassLoader());

  /**
   * An error occurred while attempting to open the LDIF file %s for reading:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIF_FILE_CANNOT_OPEN_FOR_READ =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"FATAL_ERR_LDIF_FILE_CANNOT_OPEN_FOR_READ_366",TOOLS,FATAL_ERROR,366, getClassLoader());

  /**
   * An error occurred while attempting to read the contents of LDIF file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIF_FILE_READ_ERROR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"FATAL_ERR_LDIF_FILE_READ_ERROR_367",TOOLS,FATAL_ERROR,367, getClassLoader());

  /**
   * Error at or near line %d in LDIF file %s:  %s
   */
  public static final MessageDescriptor.Arg3<Number,CharSequence,CharSequence> ERR_LDIF_FILE_INVALID_LDIF_ENTRY =
          new MessageDescriptor.Arg3<Number,CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIF_FILE_INVALID_LDIF_ENTRY_368",TOOLS,SEVERE_ERROR,368, getClassLoader());

  /**
   * Use the authentication password syntax rather than the user password syntax
   */
  public static final MessageDescriptor.Arg0 INFO_ENCPW_DESCRIPTION_AUTHPW =
          new MessageDescriptor.Arg0(BASE,"INFO_ENCPW_DESCRIPTION_AUTHPW_369",TOOLS,INFORMATION,369, getClassLoader());

  /**
   * No authentication password storage schemes have been configured for use in the Directory Server
   */
  public static final MessageDescriptor.Arg0 ERR_ENCPW_NO_AUTH_STORAGE_SCHEMES =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_ENCPW_NO_AUTH_STORAGE_SCHEMES_370",TOOLS,SEVERE_ERROR,370, getClassLoader());

  /**
   * Authentication password storage scheme "%s" is not configured for use in the Directory Server
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ENCPW_NO_SUCH_AUTH_SCHEME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_ENCPW_NO_SUCH_AUTH_SCHEME_371",TOOLS,SEVERE_ERROR,371, getClassLoader());

  /**
   * The provided password is not a valid encoded authentication password value:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ENCPW_INVALID_ENCODED_AUTHPW =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_ENCPW_INVALID_ENCODED_AUTHPW_372",TOOLS,SEVERE_ERROR,372, getClassLoader());

  /**
   * An error occurred while attempting to initialize the password policy components:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIFIMPORT_CANNOT_INITIALIZE_PWPOLICY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDIFIMPORT_CANNOT_INITIALIZE_PWPOLICY_373",TOOLS,SEVERE_ERROR,373, getClassLoader());

  /**
   * Directory server hostname or IP address
   */
  public static final MessageDescriptor.Arg0 INFO_STOPDS_DESCRIPTION_HOST =
          new MessageDescriptor.Arg0(BASE,"INFO_STOPDS_DESCRIPTION_HOST_374",TOOLS,INFORMATION,374, getClassLoader());

  /**
   * Directory server administration port number
   */
  public static final MessageDescriptor.Arg0 INFO_STOPDS_DESCRIPTION_PORT =
          new MessageDescriptor.Arg0(BASE,"INFO_STOPDS_DESCRIPTION_PORT_375",TOOLS,INFORMATION,375, getClassLoader());

  /**
   * Use SSL for secure communication with the server
   */
  public static final MessageDescriptor.Arg0 INFO_STOPDS_DESCRIPTION_USESSL =
          new MessageDescriptor.Arg0(BASE,"INFO_STOPDS_DESCRIPTION_USESSL_376",TOOLS,INFORMATION,376, getClassLoader());

  /**
   * Use StartTLS for secure communication with the server
   */
  public static final MessageDescriptor.Arg0 INFO_STOPDS_DESCRIPTION_USESTARTTLS =
          new MessageDescriptor.Arg0(BASE,"INFO_STOPDS_DESCRIPTION_USESTARTTLS_377",TOOLS,INFORMATION,377, getClassLoader());

  /**
   * DN to use to bind to the server
   */
  public static final MessageDescriptor.Arg0 INFO_STOPDS_DESCRIPTION_BINDDN =
          new MessageDescriptor.Arg0(BASE,"INFO_STOPDS_DESCRIPTION_BINDDN_378",TOOLS,INFORMATION,378, getClassLoader());

  /**
   * Password to use to bind to the server
   */
  public static final MessageDescriptor.Arg0 INFO_STOPDS_DESCRIPTION_BINDPW =
          new MessageDescriptor.Arg0(BASE,"INFO_STOPDS_DESCRIPTION_BINDPW_379",TOOLS,INFORMATION,379, getClassLoader());

  /**
   * Bind password file
   */
  public static final MessageDescriptor.Arg0 INFO_STOPDS_DESCRIPTION_BINDPWFILE =
          new MessageDescriptor.Arg0(BASE,"INFO_STOPDS_DESCRIPTION_BINDPWFILE_380",TOOLS,INFORMATION,380, getClassLoader());

  /**
   * SASL bind options
   */
  public static final MessageDescriptor.Arg0 INFO_STOPDS_DESCRIPTION_SASLOPTIONS =
          new MessageDescriptor.Arg0(BASE,"INFO_STOPDS_DESCRIPTION_SASLOPTIONS_381",TOOLS,INFORMATION,381, getClassLoader());

  /**
   * Use the proxied authorization control with the given authorization ID
   */
  public static final MessageDescriptor.Arg0 INFO_STOPDS_DESCRIPTION_PROXYAUTHZID =
          new MessageDescriptor.Arg0(BASE,"INFO_STOPDS_DESCRIPTION_PROXYAUTHZID_382",TOOLS,INFORMATION,382, getClassLoader());

  /**
   * Reason the server is being stopped or restarted
   */
  public static final MessageDescriptor.Arg0 INFO_STOPDS_DESCRIPTION_STOP_REASON =
          new MessageDescriptor.Arg0(BASE,"INFO_STOPDS_DESCRIPTION_STOP_REASON_383",TOOLS,INFORMATION,383, getClassLoader());

  /**
   * Indicates the date/time at which the shutdown operation will begin as a server task expressed in format YYYYMMDDhhmmssZ for UTC time or YYYYMMDDhhmmss for local time.  A value of '0' will cause the shutdown to be scheduled for immediate execution.  When this option is specified the operation will be scheduled to start at the specified time after which this utility will exit immediately
   */
  public static final MessageDescriptor.Arg0 INFO_STOPDS_DESCRIPTION_STOP_TIME =
          new MessageDescriptor.Arg0(BASE,"INFO_STOPDS_DESCRIPTION_STOP_TIME_384",TOOLS,INFORMATION,384, getClassLoader());

  /**
   * Trust all server SSL certificates
   */
  public static final MessageDescriptor.Arg0 INFO_STOPDS_DESCRIPTION_TRUST_ALL =
          new MessageDescriptor.Arg0(BASE,"INFO_STOPDS_DESCRIPTION_TRUST_ALL_385",TOOLS,INFORMATION,385, getClassLoader());

  /**
   * Certificate key store path
   */
  public static final MessageDescriptor.Arg0 INFO_STOPDS_DESCRIPTION_KSFILE =
          new MessageDescriptor.Arg0(BASE,"INFO_STOPDS_DESCRIPTION_KSFILE_386",TOOLS,INFORMATION,386, getClassLoader());

  /**
   * Certificate key store PIN
   */
  public static final MessageDescriptor.Arg0 INFO_STOPDS_DESCRIPTION_KSPW =
          new MessageDescriptor.Arg0(BASE,"INFO_STOPDS_DESCRIPTION_KSPW_387",TOOLS,INFORMATION,387, getClassLoader());

  /**
   * Certificate key store PIN file
   */
  public static final MessageDescriptor.Arg0 INFO_STOPDS_DESCRIPTION_KSPWFILE =
          new MessageDescriptor.Arg0(BASE,"INFO_STOPDS_DESCRIPTION_KSPWFILE_388",TOOLS,INFORMATION,388, getClassLoader());

  /**
   * Certificate trust store path
   */
  public static final MessageDescriptor.Arg0 INFO_STOPDS_DESCRIPTION_TSFILE =
          new MessageDescriptor.Arg0(BASE,"INFO_STOPDS_DESCRIPTION_TSFILE_389",TOOLS,INFORMATION,389, getClassLoader());

  /**
   * Certificate trust store PIN
   */
  public static final MessageDescriptor.Arg0 INFO_STOPDS_DESCRIPTION_TSPW =
          new MessageDescriptor.Arg0(BASE,"INFO_STOPDS_DESCRIPTION_TSPW_390",TOOLS,INFORMATION,390, getClassLoader());

  /**
   * Certificate trust store PIN file
   */
  public static final MessageDescriptor.Arg0 INFO_STOPDS_DESCRIPTION_TSPWFILE =
          new MessageDescriptor.Arg0(BASE,"INFO_STOPDS_DESCRIPTION_TSPWFILE_391",TOOLS,INFORMATION,391, getClassLoader());

  /**
   * Display this usage information
   */
  public static final MessageDescriptor.Arg0 INFO_STOPDS_DESCRIPTION_SHOWUSAGE =
          new MessageDescriptor.Arg0(BASE,"INFO_STOPDS_DESCRIPTION_SHOWUSAGE_392",TOOLS,INFORMATION,392, getClassLoader());

  /**
   * ERROR:  You may not provide both the %s and the %s arguments
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_STOPDS_MUTUALLY_EXCLUSIVE_ARGUMENTS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_STOPDS_MUTUALLY_EXCLUSIVE_ARGUMENTS_395",TOOLS,SEVERE_ERROR,395, getClassLoader());

  /**
   * ERROR:  Unable to decode the provided stop time.  It should be in the form YYYYMMDDhhmmssZ for UTC time or YYYYMMDDhhmmss for local time
   */
  public static final MessageDescriptor.Arg0 ERR_STOPDS_CANNOT_DECODE_STOP_TIME =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_STOPDS_CANNOT_DECODE_STOP_TIME_396",TOOLS,SEVERE_ERROR,396, getClassLoader());

  /**
   * ERROR:  Unable to perform SSL initialization:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_STOPDS_CANNOT_INITIALIZE_SSL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_STOPDS_CANNOT_INITIALIZE_SSL_397",TOOLS,SEVERE_ERROR,397, getClassLoader());

  /**
   * ERROR:  The provided SASL option string "%s" could not be parsed in the form "name=value"
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_STOPDS_CANNOT_PARSE_SASL_OPTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_STOPDS_CANNOT_PARSE_SASL_OPTION_398",TOOLS,SEVERE_ERROR,398, getClassLoader());

  /**
   * ERROR:  One or more SASL options were provided, but none of them were the "mech" option to specify which SASL mechanism should be used
   */
  public static final MessageDescriptor.Arg0 ERR_STOPDS_NO_SASL_MECHANISM =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_STOPDS_NO_SASL_MECHANISM_399",TOOLS,SEVERE_ERROR,399, getClassLoader());

  /**
   * ERROR:  Cannot parse the value of the %s argument as an integer value between 1 and 65535:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_STOPDS_CANNOT_DETERMINE_PORT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_STOPDS_CANNOT_DETERMINE_PORT_400",TOOLS,SEVERE_ERROR,400, getClassLoader());

  /**
   * ERROR:  Cannot establish a connection to the Directory Server %s.  Verify that the server is running and that the provided credentials are valid.  Details:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_STOPDS_CANNOT_CONNECT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_STOPDS_CANNOT_CONNECT_401",TOOLS,SEVERE_ERROR,401, getClassLoader());

  /**
   * NOTICE:  The connection to the Directory Server was closed while waiting for a response to the shutdown request.  This likely means that the server has started the shutdown process
   */
  public static final MessageDescriptor.Arg0 ERR_STOPDS_UNEXPECTED_CONNECTION_CLOSURE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_STOPDS_UNEXPECTED_CONNECTION_CLOSURE_402",TOOLS,SEVERE_ERROR,402, getClassLoader());

  /**
   * ERROR:  An I/O error occurred while attempting to communicate with the Directory Server:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_STOPDS_IO_ERROR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_STOPDS_IO_ERROR_403",TOOLS,SEVERE_ERROR,403, getClassLoader());

  /**
   * ERROR:  An error occurred while trying to decode the response from the server:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_STOPDS_DECODE_ERROR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_STOPDS_DECODE_ERROR_404",TOOLS,SEVERE_ERROR,404, getClassLoader());

  /**
   * ERROR:  Expected an add response message but got a %s message instead
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_STOPDS_INVALID_RESPONSE_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_STOPDS_INVALID_RESPONSE_TYPE_405",TOOLS,SEVERE_ERROR,405, getClassLoader());

  /**
   * # Your password has expired
   */
  public static final MessageDescriptor.Arg0 INFO_BIND_PASSWORD_EXPIRED =
          new MessageDescriptor.Arg0(BASE,"INFO_BIND_PASSWORD_EXPIRED_406",TOOLS,INFORMATION,406, getClassLoader());

  /**
   * # Your password will expire in %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_BIND_PASSWORD_EXPIRING =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_BIND_PASSWORD_EXPIRING_407",TOOLS,INFORMATION,407, getClassLoader());

  /**
   * # Your account has been locked
   */
  public static final MessageDescriptor.Arg0 INFO_BIND_ACCOUNT_LOCKED =
          new MessageDescriptor.Arg0(BASE,"INFO_BIND_ACCOUNT_LOCKED_408",TOOLS,INFORMATION,408, getClassLoader());

  /**
   * # You must change your password before any other operations will be allowed
   */
  public static final MessageDescriptor.Arg0 INFO_BIND_MUST_CHANGE_PASSWORD =
          new MessageDescriptor.Arg0(BASE,"INFO_BIND_MUST_CHANGE_PASSWORD_409",TOOLS,INFORMATION,409, getClassLoader());

  /**
   * # You have %d grace logins remaining
   */
  public static final MessageDescriptor.Arg1<Number> INFO_BIND_GRACE_LOGINS_REMAINING =
          new MessageDescriptor.Arg1<Number>(BASE,"INFO_BIND_GRACE_LOGINS_REMAINING_410",TOOLS,INFORMATION,410, getClassLoader());

  /**
   * Use the password policy request control
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_USE_PWP_CONTROL =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_USE_PWP_CONTROL_411",TOOLS,INFORMATION,411, getClassLoader());

  /**
   * Attempt to automatically restart the server once it has stopped
   */
  public static final MessageDescriptor.Arg0 INFO_STOPDS_DESCRIPTION_RESTART =
          new MessageDescriptor.Arg0(BASE,"INFO_STOPDS_DESCRIPTION_RESTART_412",TOOLS,INFORMATION,412, getClassLoader());

  /**
   * File containing the DNs of the entries to compare
   */
  public static final MessageDescriptor.Arg0 INFO_COMPARE_DESCRIPTION_FILENAME =
          new MessageDescriptor.Arg0(BASE,"INFO_COMPARE_DESCRIPTION_FILENAME_413",TOOLS,INFORMATION,413, getClassLoader());

  /**
   * LDIF file containing the data to search.  Multiple files may be specified by providing the option multiple times.  If no files are provided, the data will be read from standard input
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFSEARCH_DESCRIPTION_LDIF_FILE =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFSEARCH_DESCRIPTION_LDIF_FILE_414",TOOLS,INFORMATION,414, getClassLoader());

  /**
   * The base DN for the search.  Multiple base DNs may be specified by providing the option multiple times.  If no base DN is provided, then the root DSE will be used
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFSEARCH_DESCRIPTION_BASEDN =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFSEARCH_DESCRIPTION_BASEDN_415",TOOLS,INFORMATION,415, getClassLoader());

  /**
   * The scope for the search.  It must be one of 'base', 'one', 'sub', or 'subordinate'.  If it is not provided, then 'sub' will be used
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFSEARCH_DESCRIPTION_SCOPE =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFSEARCH_DESCRIPTION_SCOPE_416",TOOLS,INFORMATION,416, getClassLoader());

  /**
   * The path to the file containing the search filter(s) to use.  If this is not provided, then the filter must be provided on the command line after all configuration options
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFSEARCH_DESCRIPTION_FILTER_FILE =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFSEARCH_DESCRIPTION_FILTER_FILE_419",TOOLS,INFORMATION,419, getClassLoader());

  /**
   * The path to the output file to which the matching entries should be written.  If this is not provided, then the data will be written to standard output
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFSEARCH_DESCRIPTION_OUTPUT_FILE =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFSEARCH_DESCRIPTION_OUTPUT_FILE_420",TOOLS,INFORMATION,420, getClassLoader());

  /**
   * Any existing output file should be overwritten rather than appending to it
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFSEARCH_DESCRIPTION_OVERWRITE_EXISTING =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFSEARCH_DESCRIPTION_OVERWRITE_EXISTING_421",TOOLS,INFORMATION,421, getClassLoader());

  /**
   * Long lines should not be wrapped
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFSEARCH_DESCRIPTION_DONT_WRAP =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFSEARCH_DESCRIPTION_DONT_WRAP_422",TOOLS,INFORMATION,422, getClassLoader());

  /**
   * Maximum number of matching entries to return
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFSEARCH_DESCRIPTION_SIZE_LIMIT =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFSEARCH_DESCRIPTION_SIZE_LIMIT_423",TOOLS,INFORMATION,423, getClassLoader());

  /**
   * Maximum length of time (in seconds) to spend processing
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFSEARCH_DESCRIPTION_TIME_LIMIT =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFSEARCH_DESCRIPTION_TIME_LIMIT_424",TOOLS,INFORMATION,424, getClassLoader());

  /**
   * No search filter was specified.  Either a filter file or an individual search filter must be provided
   */
  public static final MessageDescriptor.Arg0 ERR_LDIFSEARCH_NO_FILTER =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_LDIFSEARCH_NO_FILTER_428",TOOLS,SEVERE_ERROR,428, getClassLoader());

  /**
   * An error occurred while attempting to process the Directory Server configuration file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIFSEARCH_CANNOT_INITIALIZE_CONFIG =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIFSEARCH_CANNOT_INITIALIZE_CONFIG_429",TOOLS,SEVERE_ERROR,429, getClassLoader());

  /**
   * An error occurred while attempting to initialize the Directory Server schema based on the information in configuration file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIFSEARCH_CANNOT_INITIALIZE_SCHEMA =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIFSEARCH_CANNOT_INITIALIZE_SCHEMA_430",TOOLS,SEVERE_ERROR,430, getClassLoader());

  /**
   * An error occurred while attempting to parse search filter '%s':  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIFSEARCH_CANNOT_PARSE_FILTER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIFSEARCH_CANNOT_PARSE_FILTER_431",TOOLS,SEVERE_ERROR,431, getClassLoader());

  /**
   * An error occurred while attempting to parse base DN '%s':  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIFSEARCH_CANNOT_PARSE_BASE_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIFSEARCH_CANNOT_PARSE_BASE_DN_432",TOOLS,SEVERE_ERROR,432, getClassLoader());

  /**
   * An error occurred while attempting to parse the time limit as an integer:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIFSEARCH_CANNOT_PARSE_TIME_LIMIT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDIFSEARCH_CANNOT_PARSE_TIME_LIMIT_433",TOOLS,SEVERE_ERROR,433, getClassLoader());

  /**
   * An error occurred while attempting to parse the size limit as an integer:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIFSEARCH_CANNOT_PARSE_SIZE_LIMIT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDIFSEARCH_CANNOT_PARSE_SIZE_LIMIT_434",TOOLS,SEVERE_ERROR,434, getClassLoader());

  /**
   * An error occurred while attempting to create the LDIF reader:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIFSEARCH_CANNOT_CREATE_READER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDIFSEARCH_CANNOT_CREATE_READER_435",TOOLS,SEVERE_ERROR,435, getClassLoader());

  /**
   * An error occurred while attempting to create the LDIF writer used to return matching entries:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIFSEARCH_CANNOT_CREATE_WRITER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDIFSEARCH_CANNOT_CREATE_WRITER_436",TOOLS,SEVERE_ERROR,436, getClassLoader());

  /**
   * The specified time limit has been exceeded during search processing
   */
  public static final MessageDescriptor.Arg0 WARN_LDIFSEARCH_TIME_LIMIT_EXCEEDED =
          new MessageDescriptor.Arg0(BASE,"MILD_WARN_LDIFSEARCH_TIME_LIMIT_EXCEEDED_437",TOOLS,MILD_WARNING,437, getClassLoader());

  /**
   * The specified size limit has been exceeded during search processing
   */
  public static final MessageDescriptor.Arg0 WARN_LDIFSEARCH_SIZE_LIMIT_EXCEEDED =
          new MessageDescriptor.Arg0(BASE,"MILD_WARN_LDIFSEARCH_SIZE_LIMIT_EXCEEDED_438",TOOLS,MILD_WARNING,438, getClassLoader());

  /**
   * An error occurred while attempting to read an entry from the LDIF content:  %s.  Skipping this entry and continuing processing
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIFSEARCH_CANNOT_READ_ENTRY_RECOVERABLE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDIFSEARCH_CANNOT_READ_ENTRY_RECOVERABLE_439",TOOLS,SEVERE_ERROR,439, getClassLoader());

  /**
   * An error occurred while attempting to read an entry from the LDIF content:  %s.  Unable to continue processing
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIFSEARCH_CANNOT_READ_ENTRY_FATAL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDIFSEARCH_CANNOT_READ_ENTRY_FATAL_440",TOOLS,SEVERE_ERROR,440, getClassLoader());

  /**
   * An unexpected error occurred during search processing:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIFSEARCH_ERROR_DURING_PROCESSING =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDIFSEARCH_ERROR_DURING_PROCESSING_441",TOOLS,SEVERE_ERROR,441, getClassLoader());

  /**
   * An error occurred while attempting to initialize the Directory Server JMX subsystem based on the information in configuration file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIFSEARCH_CANNOT_INITIALIZE_JMX =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIFSEARCH_CANNOT_INITIALIZE_JMX_442",TOOLS,SEVERE_ERROR,442, getClassLoader());

  /**
   * LDIF file to use as the source data
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFDIFF_DESCRIPTION_SOURCE_LDIF =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFDIFF_DESCRIPTION_SOURCE_LDIF_443",TOOLS,INFORMATION,443, getClassLoader());

  /**
   * LDIF file to use as the target data
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFDIFF_DESCRIPTION_TARGET_LDIF =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFDIFF_DESCRIPTION_TARGET_LDIF_444",TOOLS,INFORMATION,444, getClassLoader());

  /**
   * File to which the output should be written
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFDIFF_DESCRIPTION_OUTPUT_LDIF =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFDIFF_DESCRIPTION_OUTPUT_LDIF_445",TOOLS,INFORMATION,445, getClassLoader());

  /**
   * Any existing output file should be overwritten rather than appending to it
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFDIFF_DESCRIPTION_OVERWRITE_EXISTING =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFDIFF_DESCRIPTION_OVERWRITE_EXISTING_446",TOOLS,INFORMATION,446, getClassLoader());

  /**
   * An error occurred while attempting to initialize the Directory Server JMX subsystem based on the information in configuration file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIFDIFF_CANNOT_INITIALIZE_JMX =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIFDIFF_CANNOT_INITIALIZE_JMX_452",TOOLS,SEVERE_ERROR,452, getClassLoader());

  /**
   * An error occurred while attempting to process the Directory Server configuration file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIFDIFF_CANNOT_INITIALIZE_CONFIG =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIFDIFF_CANNOT_INITIALIZE_CONFIG_453",TOOLS,SEVERE_ERROR,453, getClassLoader());

  /**
   * An error occurred while attempting to initialize the Directory Server schema based on the information in configuration file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIFDIFF_CANNOT_INITIALIZE_SCHEMA =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIFDIFF_CANNOT_INITIALIZE_SCHEMA_454",TOOLS,SEVERE_ERROR,454, getClassLoader());

  /**
   * An error occurred while attempting to open source LDIF %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIFDIFF_CANNOT_OPEN_SOURCE_LDIF =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIFDIFF_CANNOT_OPEN_SOURCE_LDIF_455",TOOLS,SEVERE_ERROR,455, getClassLoader());

  /**
   * An error occurred while reading the contents of source LDIF %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIFDIFF_ERROR_READING_SOURCE_LDIF =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIFDIFF_ERROR_READING_SOURCE_LDIF_456",TOOLS,SEVERE_ERROR,456, getClassLoader());

  /**
   * An error occurred while attempting to open target LDIF %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIFDIFF_CANNOT_OPEN_TARGET_LDIF =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIFDIFF_CANNOT_OPEN_TARGET_LDIF_457",TOOLS,SEVERE_ERROR,457, getClassLoader());

  /**
   * An error occurred while reading the contents of target LDIF %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIFDIFF_ERROR_READING_TARGET_LDIF =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIFDIFF_ERROR_READING_TARGET_LDIF_458",TOOLS,SEVERE_ERROR,458, getClassLoader());

  /**
   * An error occurred while attempting to open the LDIF writer for the diff output:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIFDIFF_CANNOT_OPEN_OUTPUT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDIFDIFF_CANNOT_OPEN_OUTPUT_459",TOOLS,SEVERE_ERROR,459, getClassLoader());

  /**
   * No differences were detected between the source and target LDIF files
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFDIFF_NO_DIFFERENCES =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFDIFF_NO_DIFFERENCES_460",TOOLS,INFORMATION,460, getClassLoader());

  /**
   * An error occurred while attempting to write the diff output:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIFDIFF_ERROR_WRITING_OUTPUT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDIFDIFF_ERROR_WRITING_OUTPUT_461",TOOLS,SEVERE_ERROR,461, getClassLoader());

  /**
   * Port on which the Directory Server should listen for LDAP communication
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIGDS_DESCRIPTION_LDAP_PORT =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIGDS_DESCRIPTION_LDAP_PORT_464",TOOLS,INFORMATION,464, getClassLoader());

  /**
   * Base DN for user information in the Directory Server.  Multiple base DNs may be provided by using this option multiple times
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIGDS_DESCRIPTION_BASE_DN =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIGDS_DESCRIPTION_BASE_DN_465",TOOLS,INFORMATION,465, getClassLoader());

  /**
   * DN for the initial root user for the Directory Server
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIGDS_DESCRIPTION_ROOT_DN =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIGDS_DESCRIPTION_ROOT_DN_466",TOOLS,INFORMATION,466, getClassLoader());

  /**
   * Password for the initial root user for the Directory Server
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIGDS_DESCRIPTION_ROOT_PW =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIGDS_DESCRIPTION_ROOT_PW_467",TOOLS,INFORMATION,467, getClassLoader());

  /**
   * Path to a file containing the password for the initial root user for the Directory Server
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIGDS_DESCRIPTION_ROOT_PW_FILE =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIGDS_DESCRIPTION_ROOT_PW_FILE_468",TOOLS,INFORMATION,468, getClassLoader());

  /**
   * An error occurred while attempting to acquire the server-wide lock file %s:  %s.  This generally means that the Directory Server is running, or another tool that requires exclusive access to the server is in use
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIGDS_CANNOT_ACQUIRE_SERVER_LOCK =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIGDS_CANNOT_ACQUIRE_SERVER_LOCK_472",TOOLS,SEVERE_ERROR,472, getClassLoader());

  /**
   * An error occurred while attempting to initialize the Directory Server JMX subsystem based on the information in configuration file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIGDS_CANNOT_INITIALIZE_JMX =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIGDS_CANNOT_INITIALIZE_JMX_473",TOOLS,SEVERE_ERROR,473, getClassLoader());

  /**
   * An error occurred while attempting to process the Directory Server configuration file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIGDS_CANNOT_INITIALIZE_CONFIG =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIGDS_CANNOT_INITIALIZE_CONFIG_474",TOOLS,SEVERE_ERROR,474, getClassLoader());

  /**
   * An error occurred while attempting to initialize the Directory Server schema based on the information in configuration file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIGDS_CANNOT_INITIALIZE_SCHEMA =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIGDS_CANNOT_INITIALIZE_SCHEMA_475",TOOLS,SEVERE_ERROR,475, getClassLoader());

  /**
   * An error occurred while attempting to parse base DN value "%s" as a DN:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIGDS_CANNOT_PARSE_BASE_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIGDS_CANNOT_PARSE_BASE_DN_476",TOOLS,SEVERE_ERROR,476, getClassLoader());

  /**
   * An error occurred while attempting to parse root DN value "%s" as a DN:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIGDS_CANNOT_PARSE_ROOT_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIGDS_CANNOT_PARSE_ROOT_DN_477",TOOLS,SEVERE_ERROR,477, getClassLoader());

  /**
   * The DN for the initial root user was provided, but no corresponding password was given.  If the root DN is specified then the password must also be provided
   */
  public static final MessageDescriptor.Arg0 ERR_CONFIGDS_NO_ROOT_PW =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CONFIGDS_NO_ROOT_PW_478",TOOLS,SEVERE_ERROR,478, getClassLoader());

  /**
   * An error occurred while attempting to update the base DN(s) for user data in the Directory Server: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIGDS_CANNOT_UPDATE_BASE_DN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIGDS_CANNOT_UPDATE_BASE_DN_479",TOOLS,SEVERE_ERROR,479, getClassLoader());

  /**
   * An error occurred while attempting to update the port on which to listen for LDAP communication:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIGDS_CANNOT_UPDATE_LDAP_PORT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIGDS_CANNOT_UPDATE_LDAP_PORT_480",TOOLS,SEVERE_ERROR,480, getClassLoader());

  /**
   * An error occurred while attempting to update the entry for the initial Directory Server root user: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIGDS_CANNOT_UPDATE_ROOT_USER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIGDS_CANNOT_UPDATE_ROOT_USER_481",TOOLS,SEVERE_ERROR,481, getClassLoader());

  /**
   * An error occurred while writing the updated Directory Server configuration:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIGDS_CANNOT_WRITE_UPDATED_CONFIG =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIGDS_CANNOT_WRITE_UPDATED_CONFIG_482",TOOLS,SEVERE_ERROR,482, getClassLoader());

  /**
   * ERROR:  No configuration changes were specified
   */
  public static final MessageDescriptor.Arg0 ERR_CONFIGDS_NO_CONFIG_CHANGES =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CONFIGDS_NO_CONFIG_CHANGES_483",TOOLS,SEVERE_ERROR,483, getClassLoader());

  /**
   * Successfully wrote the updated Directory Server configuration
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIGDS_WROTE_UPDATED_CONFIG =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIGDS_WROTE_UPDATED_CONFIG_484",TOOLS,INFORMATION,484, getClassLoader());

  /**
   * Just verify that the JVM can be started properly
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_DESCRIPTION_TESTONLY =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_DESCRIPTION_TESTONLY_485",TOOLS,INFORMATION,485, getClassLoader());

  /**
   * The setup command used to invoke this program
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_DESCRIPTION_PROGNAME =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_DESCRIPTION_PROGNAME_486",TOOLS,INFORMATION,486, getClassLoader());

  /**
   * Run setup in quiet mode.  Quiet mode will not output progress information to standard output
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_DESCRIPTION_SILENT =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_DESCRIPTION_SILENT_489",TOOLS,INFORMATION,489, getClassLoader());

  /**
   * Base DN for user information in the Directory Server.  Multiple base DNs may be provided by using this option multiple times
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_DESCRIPTION_BASEDN =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_DESCRIPTION_BASEDN_490",TOOLS,INFORMATION,490, getClassLoader());

  /**
   * Indicates whether to create the base entry in the Directory Server database
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_DESCRIPTION_ADDBASE =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_DESCRIPTION_ADDBASE_491",TOOLS,INFORMATION,491, getClassLoader());

  /**
   * Path to an LDIF file containing data that should be added to the Directory Server database. Multiple LDIF files may be provided by using this option multiple times
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_DESCRIPTION_IMPORTLDIF =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_DESCRIPTION_IMPORTLDIF_492",TOOLS,INFORMATION,492, getClassLoader());

  /**
   * Port on which the Directory Server should listen for LDAP communication
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_DESCRIPTION_LDAPPORT =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_DESCRIPTION_LDAPPORT_493",TOOLS,INFORMATION,493, getClassLoader());

  /**
   * Skip the check to determine whether the specified ports are usable
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_DESCRIPTION_SKIPPORT =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_DESCRIPTION_SKIPPORT_494",TOOLS,INFORMATION,494, getClassLoader());

  /**
   * DN for the initial root user for the Directory Server
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_DESCRIPTION_ROOTDN =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_DESCRIPTION_ROOTDN_495",TOOLS,INFORMATION,495, getClassLoader());

  /**
   * Password for the initial root user for the Directory Server
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_DESCRIPTION_ROOTPW =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_DESCRIPTION_ROOTPW_496",TOOLS,INFORMATION,496, getClassLoader());

  /**
   * Path to a file containing the password for the initial root user for the Directory Server
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_DESCRIPTION_ROOTPWFILE =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_DESCRIPTION_ROOTPWFILE_497",TOOLS,INFORMATION,497, getClassLoader());

  /**
   * Display this usage information
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_DESCRIPTION_HELP =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_DESCRIPTION_HELP_498",TOOLS,INFORMATION,498, getClassLoader());

  /**
   * ERROR:  No configuration file path was provided (use the %s argument)
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_INSTALLDS_NO_CONFIG_FILE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_INSTALLDS_NO_CONFIG_FILE_499",TOOLS,SEVERE_ERROR,499, getClassLoader());

  /**
   * An error occurred while attempting to initialize the Directory Server JMX subsystem based on the information in configuration file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_INSTALLDS_CANNOT_INITIALIZE_JMX =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_INSTALLDS_CANNOT_INITIALIZE_JMX_500",TOOLS,SEVERE_ERROR,500, getClassLoader());

  /**
   * An error occurred while attempting to process the Directory Server configuration file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_INSTALLDS_CANNOT_INITIALIZE_CONFIG =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_INSTALLDS_CANNOT_INITIALIZE_CONFIG_501",TOOLS,SEVERE_ERROR,501, getClassLoader());

  /**
   * An error occurred while attempting to initialize the Directory Server schema based on the information in configuration file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_INSTALLDS_CANNOT_INITIALIZE_SCHEMA =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_INSTALLDS_CANNOT_INITIALIZE_SCHEMA_502",TOOLS,SEVERE_ERROR,502, getClassLoader());

  /**
   * An error occurred while attempting to parse the string "%s" as a valid DN:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_INSTALLDS_CANNOT_PARSE_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_INSTALLDS_CANNOT_PARSE_DN_503",TOOLS,SEVERE_ERROR,503, getClassLoader());

  /**
   * Provide the base DN for the directory data:
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_PROMPT_BASEDN =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_PROMPT_BASEDN_504",TOOLS,INFORMATION,504, getClassLoader());

  /**
   * Do you wish to populate the directory database with information from an existing LDIF file?
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_PROMPT_IMPORT =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_PROMPT_IMPORT_505",TOOLS,INFORMATION,505, getClassLoader());

  /**
   * Please specify the path to the LDIF file containing the data to import:
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_PROMPT_IMPORT_FILE =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_PROMPT_IMPORT_FILE_506",TOOLS,INFORMATION,506, getClassLoader());

  /**
   * ERROR:  You may not provide both the %s and the %s arguments at the same time
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_INSTALLDS_TWO_CONFLICTING_ARGUMENTS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_INSTALLDS_TWO_CONFLICTING_ARGUMENTS_507",TOOLS,SEVERE_ERROR,507, getClassLoader());

  /**
   * Would you like to have the base %s entry automatically created in the directory database?
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_INSTALLDS_PROMPT_ADDBASE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_INSTALLDS_PROMPT_ADDBASE_508",TOOLS,INFORMATION,508, getClassLoader());

  /**
   * On which port would you like the Directory Server to accept connections from LDAP clients?
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_PROMPT_LDAPPORT =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_PROMPT_LDAPPORT_509",TOOLS,INFORMATION,509, getClassLoader());

  /**
   * ERROR:  Unable to bind to port %d.  This port may already be in use, or you may not have permission to bind to it.  On UNIX-based operating systems, non-root users may not be allowed to bind to ports 1 through 1024
   */
  public static final MessageDescriptor.Arg1<Number> ERR_INSTALLDS_CANNOT_BIND_TO_PRIVILEGED_PORT =
          new MessageDescriptor.Arg1<Number>(BASE,"SEVERE_ERR_INSTALLDS_CANNOT_BIND_TO_PRIVILEGED_PORT_510",TOOLS,SEVERE_ERROR,510, getClassLoader());

  /**
   * ERROR:  Unable to bind to port %d.  This port may already be in use, or you may not have permission to bind to it
   */
  public static final MessageDescriptor.Arg1<Number> ERR_INSTALLDS_CANNOT_BIND_TO_PORT =
          new MessageDescriptor.Arg1<Number>(BASE,"SEVERE_ERR_INSTALLDS_CANNOT_BIND_TO_PORT_511",TOOLS,SEVERE_ERROR,511, getClassLoader());

  /**
   * What would you like to use as the initial root user DN for the Directory Server?
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_PROMPT_ROOT_DN =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_PROMPT_ROOT_DN_512",TOOLS,INFORMATION,512, getClassLoader());

  /**
   * ERROR:  No password was provided for the initial root user.  When performing a non-interactive installation, this must be provided using either the %s or the %s argument
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_INSTALLDS_NO_ROOT_PASSWORD =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_INSTALLDS_NO_ROOT_PASSWORD_513",TOOLS,SEVERE_ERROR,513, getClassLoader());

  /**
   * Please provide the password to use for the initial root user:
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_PROMPT_ROOT_PASSWORD =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_PROMPT_ROOT_PASSWORD_514",TOOLS,INFORMATION,514, getClassLoader());

  /**
   * Please re-enter the password for confirmation:
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_PROMPT_CONFIRM_ROOT_PASSWORD =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_PROMPT_CONFIRM_ROOT_PASSWORD_515",TOOLS,INFORMATION,515, getClassLoader());

  /**
   * Applying the requested configuration to the Directory Server...
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_STATUS_CONFIGURING_DS =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_STATUS_CONFIGURING_DS_516",TOOLS,INFORMATION,516, getClassLoader());

  /**
   * Creating a temporary LDIF file with the initial base entry contents...
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_STATUS_CREATING_BASE_LDIF =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_STATUS_CREATING_BASE_LDIF_517",TOOLS,INFORMATION,517, getClassLoader());

  /**
   * An error occurred while attempting to create the base LDIF file:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_INSTALLDS_CANNOT_CREATE_BASE_ENTRY_LDIF =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_INSTALLDS_CANNOT_CREATE_BASE_ENTRY_LDIF_518",TOOLS,SEVERE_ERROR,518, getClassLoader());

  /**
   * Importing the LDIF data into the Directory Server database...
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_STATUS_IMPORTING_LDIF =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_STATUS_IMPORTING_LDIF_519",TOOLS,INFORMATION,519, getClassLoader());

  /**
   * The server setup process has completed successfully
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_STATUS_SUCCESS =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_STATUS_SUCCESS_520",TOOLS,INFORMATION,520, getClassLoader());

  /**
   * yes
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_PROMPT_VALUE_YES =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_PROMPT_VALUE_YES_521",TOOLS,INFORMATION,521, getClassLoader());

  /**
   * no
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_PROMPT_VALUE_NO =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_PROMPT_VALUE_NO_522",TOOLS,INFORMATION,522, getClassLoader());

  /**
   * ERROR:  The provided value could not be interpreted as a yes or no response.  Please enter a response of either "yes" or "no"
   */
  public static final MessageDescriptor.Arg0 ERR_INSTALLDS_INVALID_YESNO_RESPONSE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_INSTALLDS_INVALID_YESNO_RESPONSE_523",TOOLS,MILD_ERROR,523, getClassLoader());

  /**
   * ERROR:  The provided response could not be interpreted as an integer.  Please provide the response as an integer value
   */
  public static final MessageDescriptor.Arg0 ERR_INSTALLDS_INVALID_INTEGER_RESPONSE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_INSTALLDS_INVALID_INTEGER_RESPONSE_524",TOOLS,MILD_ERROR,524, getClassLoader());

  /**
   * ERROR:  The provided value is less than the lowest allowed value of %d
   */
  public static final MessageDescriptor.Arg1<Number> ERR_INSTALLDS_INTEGER_BELOW_LOWER_BOUND =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_INSTALLDS_INTEGER_BELOW_LOWER_BOUND_525",TOOLS,MILD_ERROR,525, getClassLoader());

  /**
   * ERROR:  The provided value is greater than the largest allowed value of %d
   */
  public static final MessageDescriptor.Arg1<Number> ERR_INSTALLDS_INTEGER_ABOVE_UPPER_BOUND =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_INSTALLDS_INTEGER_ABOVE_UPPER_BOUND_526",TOOLS,MILD_ERROR,526, getClassLoader());

  /**
   * ERROR:  The provided response could not be interpreted as an LDAP DN
   */
  public static final MessageDescriptor.Arg0 ERR_INSTALLDS_INVALID_DN_RESPONSE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_INSTALLDS_INVALID_DN_RESPONSE_527",TOOLS,MILD_ERROR,527, getClassLoader());

  /**
   * ERROR:  The response value may not be an empty string
   */
  public static final MessageDescriptor.Arg0 ERR_INSTALLDS_INVALID_STRING_RESPONSE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_INSTALLDS_INVALID_STRING_RESPONSE_528",TOOLS,MILD_ERROR,528, getClassLoader());

  /**
   * ERROR:  The password value may not be an empty string
   */
  public static final MessageDescriptor.Arg0 ERR_INSTALLDS_INVALID_PASSWORD_RESPONSE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_INSTALLDS_INVALID_PASSWORD_RESPONSE_529",TOOLS,MILD_ERROR,529, getClassLoader());

  /**
   * ERROR:  The provided password values do not match
   */
  public static final MessageDescriptor.Arg0 ERR_INSTALLDS_PASSWORDS_DONT_MATCH =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_INSTALLDS_PASSWORDS_DONT_MATCH_530",TOOLS,MILD_ERROR,530, getClassLoader());

  /**
   * ERROR:  Unexpected failure while reading from standard input:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_INSTALLDS_ERROR_READING_FROM_STDIN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_INSTALLDS_ERROR_READING_FROM_STDIN_531",TOOLS,MILD_ERROR,531, getClassLoader());

  /**
   * Use quiet mode (no output)
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFIMPORT_DESCRIPTION_QUIET =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFIMPORT_DESCRIPTION_QUIET_532",TOOLS,INFORMATION,532, getClassLoader());

  /**
   * Import complete
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_IMPORT_SUCCESSFUL =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_IMPORT_SUCCESSFUL_533",TOOLS,INFORMATION,533, getClassLoader());

  /**
   * Please wait while the setup program initializes...
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_INITIALIZING =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_INITIALIZING_534",TOOLS,INFORMATION,534, getClassLoader());

  /**
   * Invalid number of arguments provided for tag %s on line number %d of the template file:  expected %d, got %d
   */
  public static final MessageDescriptor.Arg4<CharSequence,Number,Number,Number> ERR_MAKELDIF_TAG_INVALID_ARGUMENT_COUNT =
          new MessageDescriptor.Arg4<CharSequence,Number,Number,Number>(BASE,"MILD_ERR_MAKELDIF_TAG_INVALID_ARGUMENT_COUNT_535",TOOLS,MILD_ERROR,535, getClassLoader());

  /**
   * Invalid number of arguments provided for tag %s on line number %d of the template file: expected between %d and %d, got %d
   */
  public static final MessageDescriptor.Arg5<CharSequence,Number,Number,Number,Number> ERR_MAKELDIF_TAG_INVALID_ARGUMENT_RANGE_COUNT =
          new MessageDescriptor.Arg5<CharSequence,Number,Number,Number,Number>(BASE,"MILD_ERR_MAKELDIF_TAG_INVALID_ARGUMENT_RANGE_COUNT_536",TOOLS,MILD_ERROR,536, getClassLoader());

  /**
   * Undefined attribute %s referenced on line %d of the template file
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_MAKELDIF_TAG_UNDEFINED_ATTRIBUTE =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_ERR_MAKELDIF_TAG_UNDEFINED_ATTRIBUTE_537",TOOLS,MILD_ERROR,537, getClassLoader());

  /**
   * Value %d is below the lowest allowed value of %d for tag %s on line %d of the template file
   */
  public static final MessageDescriptor.Arg4<Number,Number,CharSequence,Number> ERR_MAKELDIF_TAG_INTEGER_BELOW_LOWER_BOUND =
          new MessageDescriptor.Arg4<Number,Number,CharSequence,Number>(BASE,"MILD_ERR_MAKELDIF_TAG_INTEGER_BELOW_LOWER_BOUND_538",TOOLS,MILD_ERROR,538, getClassLoader());

  /**
   * Cannot parse value "%s" as an integer for tag %s on line %d of the template file
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> ERR_MAKELDIF_TAG_CANNOT_PARSE_AS_INTEGER =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"MILD_ERR_MAKELDIF_TAG_CANNOT_PARSE_AS_INTEGER_539",TOOLS,MILD_ERROR,539, getClassLoader());

  /**
   * Value %d is above the largest allowed value of %d for tag %s on line %d of the template file
   */
  public static final MessageDescriptor.Arg4<Number,Number,CharSequence,Number> ERR_MAKELDIF_TAG_INTEGER_ABOVE_UPPER_BOUND =
          new MessageDescriptor.Arg4<Number,Number,CharSequence,Number>(BASE,"MILD_ERR_MAKELDIF_TAG_INTEGER_ABOVE_UPPER_BOUND_540",TOOLS,MILD_ERROR,540, getClassLoader());

  /**
   * Argument %d for tag %s on line number %d may not be an empty string
   */
  public static final MessageDescriptor.Arg3<Number,CharSequence,Number> ERR_MAKELDIF_TAG_INVALID_EMPTY_STRING_ARGUMENT =
          new MessageDescriptor.Arg3<Number,CharSequence,Number>(BASE,"MILD_ERR_MAKELDIF_TAG_INVALID_EMPTY_STRING_ARGUMENT_541",TOOLS,MILD_ERROR,541, getClassLoader());

  /**
   * Cannot parse value "%s" as a Boolean value for tag %s on line %d of the template file.  The value must be either 'true' or 'false'
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> ERR_MAKELDIF_TAG_CANNOT_PARSE_AS_BOOLEAN =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"MILD_ERR_MAKELDIF_TAG_CANNOT_PARSE_AS_BOOLEAN_542",TOOLS,MILD_ERROR,542, getClassLoader());

  /**
   * The branch with entry DN '%s' references a subordinate template named '%s' which is not defined in the template file
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MAKELDIF_UNDEFINED_BRANCH_SUBORDINATE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_MAKELDIF_UNDEFINED_BRANCH_SUBORDINATE_543",TOOLS,MILD_ERROR,543, getClassLoader());

  /**
   * Unable to load class %s for use as a MakeLDIF tag
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MAKELDIF_CANNOT_LOAD_TAG_CLASS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_MAKELDIF_CANNOT_LOAD_TAG_CLASS_544",TOOLS,MILD_ERROR,544, getClassLoader());

  /**
   * Cannot instantiate class %s as a MakeLDIF tag
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MAKELDIF_CANNOT_INSTANTIATE_TAG =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_MAKELDIF_CANNOT_INSTANTIATE_TAG_545",TOOLS,MILD_ERROR,545, getClassLoader());

  /**
   * Cannot register the tag defined in class %s because the tag name %s conflicts with the name of another tag that has already been registered
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MAKELDIF_CONFLICTING_TAG_NAME =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_MAKELDIF_CONFLICTING_TAG_NAME_546",TOOLS,MILD_ERROR,546, getClassLoader());

  /**
   * Possible reference to an undefined constant %s on line %d
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> WARN_MAKELDIF_WARNING_UNDEFINED_CONSTANT =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_WARN_MAKELDIF_WARNING_UNDEFINED_CONSTANT_547",TOOLS,MILD_WARNING,547, getClassLoader());

  /**
   * The constant definition on line %d is missing an equal sign to delimit the constant name from the value
   */
  public static final MessageDescriptor.Arg1<Number> ERR_MAKELDIF_DEFINE_MISSING_EQUALS =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_MAKELDIF_DEFINE_MISSING_EQUALS_548",TOOLS,MILD_ERROR,548, getClassLoader());

  /**
   * The constant definition on line %d does not include a name for the constant
   */
  public static final MessageDescriptor.Arg1<Number> ERR_MAKELDIF_DEFINE_NAME_EMPTY =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_MAKELDIF_DEFINE_NAME_EMPTY_549",TOOLS,MILD_ERROR,549, getClassLoader());

  /**
   * The definition for constant %s on line %d conflicts with an earlier constant definition included in the template
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_MAKELDIF_CONFLICTING_CONSTANT_NAME =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_ERR_MAKELDIF_CONFLICTING_CONSTANT_NAME_550",TOOLS,MILD_ERROR,550, getClassLoader());

  /**
   * Constant %s defined on line %d has not been assigned a value
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_MAKELDIF_WARNING_DEFINE_VALUE_EMPTY =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_ERR_MAKELDIF_WARNING_DEFINE_VALUE_EMPTY_551",TOOLS,MILD_ERROR,551, getClassLoader());

  /**
   * The branch definition %s starting on line %d conflicts with an earlier branch definition contained in the template file
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_MAKELDIF_CONFLICTING_BRANCH_DN =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_ERR_MAKELDIF_CONFLICTING_BRANCH_DN_552",TOOLS,MILD_ERROR,552, getClassLoader());

  /**
   * The template definition %s starting on line %d conflicts with an earlier template definition contained in the template file
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_MAKELDIF_CONFLICTING_TEMPLATE_NAME =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_ERR_MAKELDIF_CONFLICTING_TEMPLATE_NAME_553",TOOLS,MILD_ERROR,553, getClassLoader());

  /**
   * Unexpected template line "%s" encountered on line %d of the template file
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_MAKELDIF_UNEXPECTED_TEMPLATE_FILE_LINE =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_ERR_MAKELDIF_UNEXPECTED_TEMPLATE_FILE_LINE_554",TOOLS,MILD_ERROR,554, getClassLoader());

  /**
   * The template named %s references a subordinate template named %s which is not defined in the template file
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MAKELDIF_UNDEFINED_TEMPLATE_SUBORDINATE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_MAKELDIF_UNDEFINED_TEMPLATE_SUBORDINATE_555",TOOLS,MILD_ERROR,555, getClassLoader());

  /**
   * Unable to decode branch DN "%s" on line %d of the template file
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_MAKELDIF_CANNOT_DECODE_BRANCH_DN =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_ERR_MAKELDIF_CANNOT_DECODE_BRANCH_DN_556",TOOLS,MILD_ERROR,556, getClassLoader());

  /**
   * Subordinate template definition on line %d for branch %s is missing a colon to separate the template name from the number of entries
   */
  public static final MessageDescriptor.Arg2<Number,CharSequence> ERR_MAKELDIF_BRANCH_SUBORDINATE_TEMPLATE_NO_COLON =
          new MessageDescriptor.Arg2<Number,CharSequence>(BASE,"MILD_ERR_MAKELDIF_BRANCH_SUBORDINATE_TEMPLATE_NO_COLON_557",TOOLS,MILD_ERROR,557, getClassLoader());

  /**
   * Subordinate template definition on line %d for branch %s specified invalid number of entries %d for template %s
   */
  public static final MessageDescriptor.Arg4<Number,CharSequence,Number,CharSequence> ERR_MAKELDIF_BRANCH_SUBORDINATE_INVALID_NUM_ENTRIES =
          new MessageDescriptor.Arg4<Number,CharSequence,Number,CharSequence>(BASE,"MILD_ERR_MAKELDIF_BRANCH_SUBORDINATE_INVALID_NUM_ENTRIES_558",TOOLS,MILD_ERROR,558, getClassLoader());

  /**
   * Subordinate template definition on line %d for branch %s specifies that zero entries of type %s should be generated
   */
  public static final MessageDescriptor.Arg3<Number,CharSequence,CharSequence> WARN_MAKELDIF_BRANCH_SUBORDINATE_ZERO_ENTRIES =
          new MessageDescriptor.Arg3<Number,CharSequence,CharSequence>(BASE,"MILD_WARN_MAKELDIF_BRANCH_SUBORDINATE_ZERO_ENTRIES_559",TOOLS,MILD_WARNING,559, getClassLoader());

  /**
   * Unable to parse the number of entries for template %s as an integer for the subordinate template definition on line %d for branch %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,CharSequence> ERR_MAKELDIF_BRANCH_SUBORDINATE_CANT_PARSE_NUMENTRIES =
          new MessageDescriptor.Arg3<CharSequence,Number,CharSequence>(BASE,"MILD_ERR_MAKELDIF_BRANCH_SUBORDINATE_CANT_PARSE_NUMENTRIES_560",TOOLS,MILD_ERROR,560, getClassLoader());

  /**
   * Subordinate template definition on line %d for template %s is missing a colon to separate the template name from the number of entries
   */
  public static final MessageDescriptor.Arg2<Number,CharSequence> ERR_MAKELDIF_TEMPLATE_SUBORDINATE_TEMPLATE_NO_COLON =
          new MessageDescriptor.Arg2<Number,CharSequence>(BASE,"MILD_ERR_MAKELDIF_TEMPLATE_SUBORDINATE_TEMPLATE_NO_COLON_561",TOOLS,MILD_ERROR,561, getClassLoader());

  /**
   * Subordinate template definition on line %d for template %s specified invalid number of entries %d for subordinate template %s
   */
  public static final MessageDescriptor.Arg4<Number,CharSequence,Number,CharSequence> ERR_MAKELDIF_TEMPLATE_SUBORDINATE_INVALID_NUM_ENTRIES =
          new MessageDescriptor.Arg4<Number,CharSequence,Number,CharSequence>(BASE,"MILD_ERR_MAKELDIF_TEMPLATE_SUBORDINATE_INVALID_NUM_ENTRIES_562",TOOLS,MILD_ERROR,562, getClassLoader());

  /**
   * Subordinate template definition on line %d for template %s specifies that zero entries of type %s should be generated
   */
  public static final MessageDescriptor.Arg3<Number,CharSequence,CharSequence> WARN_MAKELDIF_TEMPLATE_SUBORDINATE_ZERO_ENTRIES =
          new MessageDescriptor.Arg3<Number,CharSequence,CharSequence>(BASE,"MILD_WARN_MAKELDIF_TEMPLATE_SUBORDINATE_ZERO_ENTRIES_563",TOOLS,MILD_WARNING,563, getClassLoader());

  /**
   * Unable to parse the number of entries for template %s as an integer for the subordinate template definition on line %d for template %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,CharSequence> ERR_MAKELDIF_TEMPLATE_SUBORDINATE_CANT_PARSE_NUMENTRIES =
          new MessageDescriptor.Arg3<CharSequence,Number,CharSequence>(BASE,"MILD_ERR_MAKELDIF_TEMPLATE_SUBORDINATE_CANT_PARSE_NUMENTRIES_564",TOOLS,MILD_ERROR,564, getClassLoader());

  /**
   * The template named %s includes RDN attribute %s that is not assigned a value in that template
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MAKELDIF_TEMPLATE_MISSING_RDN_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_MAKELDIF_TEMPLATE_MISSING_RDN_ATTR_565",TOOLS,MILD_ERROR,565, getClassLoader());

  /**
   * There is no colon to separate the attribute name from the value pattern on line %d of the template file in the definition for branch %s
   */
  public static final MessageDescriptor.Arg2<Number,CharSequence> ERR_MAKELDIF_NO_COLON_IN_BRANCH_EXTRA_LINE =
          new MessageDescriptor.Arg2<Number,CharSequence>(BASE,"MILD_ERR_MAKELDIF_NO_COLON_IN_BRANCH_EXTRA_LINE_566",TOOLS,MILD_ERROR,566, getClassLoader());

  /**
   * There is no attribute name before the colon on line %d of the template file in the definition for branch %s
   */
  public static final MessageDescriptor.Arg2<Number,CharSequence> ERR_MAKELDIF_NO_ATTR_IN_BRANCH_EXTRA_LINE =
          new MessageDescriptor.Arg2<Number,CharSequence>(BASE,"MILD_ERR_MAKELDIF_NO_ATTR_IN_BRANCH_EXTRA_LINE_567",TOOLS,MILD_ERROR,567, getClassLoader());

  /**
   * The value pattern for line %d of the template file in the definition for branch %s is empty
   */
  public static final MessageDescriptor.Arg2<Number,CharSequence> WARN_MAKELDIF_NO_VALUE_IN_BRANCH_EXTRA_LINE =
          new MessageDescriptor.Arg2<Number,CharSequence>(BASE,"MILD_WARN_MAKELDIF_NO_VALUE_IN_BRANCH_EXTRA_LINE_568",TOOLS,MILD_WARNING,568, getClassLoader());

  /**
   * There is no colon to separate the attribute name from the value pattern on line %d of the template file in the definition for template %s
   */
  public static final MessageDescriptor.Arg2<Number,CharSequence> ERR_MAKELDIF_NO_COLON_IN_TEMPLATE_LINE =
          new MessageDescriptor.Arg2<Number,CharSequence>(BASE,"MILD_ERR_MAKELDIF_NO_COLON_IN_TEMPLATE_LINE_569",TOOLS,MILD_ERROR,569, getClassLoader());

  /**
   * There is no attribute name before the colon on line %d of the template file in the definition for template %s
   */
  public static final MessageDescriptor.Arg2<Number,CharSequence> ERR_MAKELDIF_NO_ATTR_IN_TEMPLATE_LINE =
          new MessageDescriptor.Arg2<Number,CharSequence>(BASE,"MILD_ERR_MAKELDIF_NO_ATTR_IN_TEMPLATE_LINE_570",TOOLS,MILD_ERROR,570, getClassLoader());

  /**
   * The value pattern for line %d of the template file in the definition for template %s is empty
   */
  public static final MessageDescriptor.Arg2<Number,CharSequence> WARN_MAKELDIF_NO_VALUE_IN_TEMPLATE_LINE =
          new MessageDescriptor.Arg2<Number,CharSequence>(BASE,"MILD_WARN_MAKELDIF_NO_VALUE_IN_TEMPLATE_LINE_571",TOOLS,MILD_WARNING,571, getClassLoader());

  /**
   * An undefined tag %s is referenced on line %d of the template file
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_MAKELDIF_NO_SUCH_TAG =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_ERR_MAKELDIF_NO_SUCH_TAG_572",TOOLS,MILD_ERROR,572, getClassLoader());

  /**
   * An unexpected error occurred while trying to create a new instance of tag %s referenced on line %d of the template file:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,CharSequence> ERR_MAKELDIF_CANNOT_INSTANTIATE_NEW_TAG =
          new MessageDescriptor.Arg3<CharSequence,Number,CharSequence>(BASE,"MILD_ERR_MAKELDIF_CANNOT_INSTANTIATE_NEW_TAG_573",TOOLS,MILD_ERROR,573, getClassLoader());

  /**
   * The path to the template file with information about the LDIF data to generate
   */
  public static final MessageDescriptor.Arg0 INFO_MAKELDIF_DESCRIPTION_TEMPLATE =
          new MessageDescriptor.Arg0(BASE,"INFO_MAKELDIF_DESCRIPTION_TEMPLATE_576",TOOLS,INFORMATION,576, getClassLoader());

  /**
   * The path to the LDIF file to be written
   */
  public static final MessageDescriptor.Arg0 INFO_MAKELDIF_DESCRIPTION_LDIF =
          new MessageDescriptor.Arg0(BASE,"INFO_MAKELDIF_DESCRIPTION_LDIF_577",TOOLS,INFORMATION,577, getClassLoader());

  /**
   * The seed to use to initialize the random number generator
   */
  public static final MessageDescriptor.Arg0 INFO_MAKELDIF_DESCRIPTION_SEED =
          new MessageDescriptor.Arg0(BASE,"INFO_MAKELDIF_DESCRIPTION_SEED_578",TOOLS,INFORMATION,578, getClassLoader());

  /**
   * Show this usage information
   */
  public static final MessageDescriptor.Arg0 INFO_MAKELDIF_DESCRIPTION_HELP =
          new MessageDescriptor.Arg0(BASE,"INFO_MAKELDIF_DESCRIPTION_HELP_579",TOOLS,INFORMATION,579, getClassLoader());

  /**
   * An error occurred while attempting to initialize the Directory Server JMX subsystem based on the information in configuration file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MAKELDIF_CANNOT_INITIALIZE_JMX =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_MAKELDIF_CANNOT_INITIALIZE_JMX_582",TOOLS,SEVERE_ERROR,582, getClassLoader());

  /**
   * An error occurred while attempting to process the Directory Server configuration file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MAKELDIF_CANNOT_INITIALIZE_CONFIG =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_MAKELDIF_CANNOT_INITIALIZE_CONFIG_583",TOOLS,SEVERE_ERROR,583, getClassLoader());

  /**
   * An error occurred while attempting to initialize the Directory Server schema based on the information in configuration file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MAKELDIF_CANNOT_INITIALIZE_SCHEMA =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_MAKELDIF_CANNOT_INITIALIZE_SCHEMA_584",TOOLS,SEVERE_ERROR,584, getClassLoader());

  /**
   * An error occurred while attempting to read the template file:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MAKELDIF_IOEXCEPTION_DURING_PARSE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_MAKELDIF_IOEXCEPTION_DURING_PARSE_585",TOOLS,SEVERE_ERROR,585, getClassLoader());

  /**
   * An error occurred while attempting to parse the template file:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MAKELDIF_EXCEPTION_DURING_PARSE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_MAKELDIF_EXCEPTION_DURING_PARSE_586",TOOLS,SEVERE_ERROR,586, getClassLoader());

  /**
   * Cannot parse value "%s" as an valid format string for tag %s on line %d of the template file
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> ERR_MAKELDIF_TAG_INVALID_FORMAT_STRING =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"MILD_ERR_MAKELDIF_TAG_INVALID_FORMAT_STRING_587",TOOLS,MILD_ERROR,587, getClassLoader());

  /**
   * The random tag on line %d of the template file does not include an argument to specify the type of random value that should be generated
   */
  public static final MessageDescriptor.Arg1<Number> ERR_MAKELDIF_TAG_NO_RANDOM_TYPE_ARGUMENT =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_MAKELDIF_TAG_NO_RANDOM_TYPE_ARGUMENT_588",TOOLS,MILD_ERROR,588, getClassLoader());

  /**
   * The value generated from the random tag on line %d of the template file will always be an empty string
   */
  public static final MessageDescriptor.Arg1<Number> WARN_MAKELDIF_TAG_WARNING_EMPTY_VALUE =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_WARN_MAKELDIF_TAG_WARNING_EMPTY_VALUE_589",TOOLS,MILD_WARNING,589, getClassLoader());

  /**
   * The random tag on line %d of the template file references an unknown random type of %s
   */
  public static final MessageDescriptor.Arg2<Number,CharSequence> ERR_MAKELDIF_TAG_UNKNOWN_RANDOM_TYPE =
          new MessageDescriptor.Arg2<Number,CharSequence>(BASE,"MILD_ERR_MAKELDIF_TAG_UNKNOWN_RANDOM_TYPE_590",TOOLS,MILD_ERROR,590, getClassLoader());

  /**
   * Path to look for MakeLDIF resources (e.g., data files) not found in the current working directory or template directory path
   */
  public static final MessageDescriptor.Arg0 INFO_MAKELDIF_DESCRIPTION_RESOURCE_PATH =
          new MessageDescriptor.Arg0(BASE,"INFO_MAKELDIF_DESCRIPTION_RESOURCE_PATH_591",TOOLS,INFORMATION,591, getClassLoader());

  /**
   * Could not find template file %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MAKELDIF_COULD_NOT_FIND_TEMPLATE_FILE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_MAKELDIF_COULD_NOT_FIND_TEMPLATE_FILE_592",TOOLS,MILD_ERROR,592, getClassLoader());

  /**
   * The specified resource directory %s could not be found
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MAKELDIF_NO_SUCH_RESOURCE_DIRECTORY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_MAKELDIF_NO_SUCH_RESOURCE_DIRECTORY_593",TOOLS,MILD_ERROR,593, getClassLoader());

  /**
   * The specified resource directory %s exists but is not a directory
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MAKELDIF_RESOURCE_DIRECTORY_NOT_DIRECTORY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_MAKELDIF_RESOURCE_DIRECTORY_NOT_DIRECTORY_594",TOOLS,MILD_ERROR,594, getClassLoader());

  /**
   * Cannot find file %s referenced by tag %s on line %d of the template file
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> ERR_MAKELDIF_TAG_CANNOT_FIND_FILE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"MILD_ERR_MAKELDIF_TAG_CANNOT_FIND_FILE_595",TOOLS,MILD_ERROR,595, getClassLoader());

  /**
   * Invalid file access mode %s for tag %s on line %d of the template file.  It must be either "sequential" or "random"
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> ERR_MAKELDIF_TAG_INVALID_FILE_ACCESS_MODE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"MILD_ERR_MAKELDIF_TAG_INVALID_FILE_ACCESS_MODE_596",TOOLS,MILD_ERROR,596, getClassLoader());

  /**
   * An error occurred while trying to read file %s referenced by tag %s on line %d of the template file:  %s
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,Number,CharSequence> ERR_MAKELDIF_TAG_CANNOT_READ_FILE =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,Number,CharSequence>(BASE,"MILD_ERR_MAKELDIF_TAG_CANNOT_READ_FILE_597",TOOLS,MILD_ERROR,597, getClassLoader());

  /**
   * An error occurred while attempting to open LDIF file %s for writing:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MAKELDIF_UNABLE_TO_CREATE_LDIF =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_MAKELDIF_UNABLE_TO_CREATE_LDIF_598",TOOLS,MILD_ERROR,598, getClassLoader());

  /**
   * An error occurred while writing data to LDIF file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MAKELDIF_ERROR_WRITING_LDIF =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_MAKELDIF_ERROR_WRITING_LDIF_599",TOOLS,MILD_ERROR,599, getClassLoader());

  /**
   * Processed %d entries
   */
  public static final MessageDescriptor.Arg1<Number> INFO_MAKELDIF_PROCESSED_N_ENTRIES =
          new MessageDescriptor.Arg1<Number>(BASE,"INFO_MAKELDIF_PROCESSED_N_ENTRIES_600",TOOLS,INFORMATION,600, getClassLoader());

  /**
   * An error occurred while attempting to write entry %s to LDIF:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MAKELDIF_CANNOT_WRITE_ENTRY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_MAKELDIF_CANNOT_WRITE_ENTRY_601",TOOLS,MILD_ERROR,601, getClassLoader());

  /**
   * LDIF processing complete.  %d entries written
   */
  public static final MessageDescriptor.Arg1<Number> INFO_MAKELDIF_PROCESSING_COMPLETE =
          new MessageDescriptor.Arg1<Number>(BASE,"INFO_MAKELDIF_PROCESSING_COMPLETE_602",TOOLS,INFORMATION,602, getClassLoader());

  /**
   * Path to a MakeLDIF template to use to generate the import data
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFIMPORT_DESCRIPTION_TEMPLATE_FILE =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFIMPORT_DESCRIPTION_TEMPLATE_FILE_603",TOOLS,INFORMATION,603, getClassLoader());

  /**
   * The %s and %s arguments are incompatible and may not be used together
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIFIMPORT_CONFLICTING_OPTIONS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIFIMPORT_CONFLICTING_OPTIONS_604",TOOLS,SEVERE_ERROR,604, getClassLoader());

  /**
   * Neither the %s or the %s argument was provided.  One of these arguments must be given to specify the source for the LDIF data to be imported
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIFIMPORT_MISSING_REQUIRED_ARGUMENT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIFIMPORT_MISSING_REQUIRED_ARGUMENT_605",TOOLS,SEVERE_ERROR,605, getClassLoader());

  /**
   * Unable to parse the specified file %s as a MakeLDIF template file:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIFIMPORT_CANNOT_PARSE_TEMPLATE_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIFIMPORT_CANNOT_PARSE_TEMPLATE_FILE_606",TOOLS,SEVERE_ERROR,606, getClassLoader());

  /**
   * Line %d of the template file contains an incomplete tag that starts with either '<' or '{' but does get closed
   */
  public static final MessageDescriptor.Arg1<Number> ERR_MAKELDIF_INCOMPLETE_TAG =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_MAKELDIF_INCOMPLETE_TAG_607",TOOLS,MILD_ERROR,607, getClassLoader());

  /**
   * Tag %s referenced on line %d of the template file is not allowed for use in branch definitions
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_MAKELDIF_TAG_NOT_ALLOWED_IN_BRANCH =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_ERR_MAKELDIF_TAG_NOT_ALLOWED_IN_BRANCH_608",TOOLS,MILD_ERROR,608, getClassLoader());

  /**
   * Seed for the MakeLDIF random number generator
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFIMPORT_DESCRIPTION_RANDOM_SEED =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFIMPORT_DESCRIPTION_RANDOM_SEED_609",TOOLS,INFORMATION,609, getClassLoader());

  /**
   * Entry %s is added twice in the set of changes to apply, which is not supported by the LDIF modify tool
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIFMODIFY_CANNOT_ADD_ENTRY_TWICE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDIFMODIFY_CANNOT_ADD_ENTRY_TWICE_610",TOOLS,MILD_ERROR,610, getClassLoader());

  /**
   * Entry %s cannot be deleted because it was previously added in the set of changes.  This is not supported by the LDIF modify tool
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIFMODIFY_CANNOT_DELETE_AFTER_ADD =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDIFMODIFY_CANNOT_DELETE_AFTER_ADD_611",TOOLS,MILD_ERROR,611, getClassLoader());

  /**
   * Cannot modify entry %s because it was previously added or deleted in the set of changes.  This is not supported by the LDIF modify tool
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIFMODIFY_CANNOT_MODIFY_ADDED_OR_DELETED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDIFMODIFY_CANNOT_MODIFY_ADDED_OR_DELETED_612",TOOLS,MILD_ERROR,612, getClassLoader());

  /**
   * The modify DN operation targeted at entry %s cannot be processed because modify DN operations are not supported by the LDIF modify tool
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIFMODIFY_MODDN_NOT_SUPPORTED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDIFMODIFY_MODDN_NOT_SUPPORTED_613",TOOLS,MILD_ERROR,613, getClassLoader());

  /**
   * Entry %s has an unknown changetype of %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIFMODIFY_UNKNOWN_CHANGETYPE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_LDIFMODIFY_UNKNOWN_CHANGETYPE_614",TOOLS,MILD_ERROR,614, getClassLoader());

  /**
   * Unable to add entry %s because it already exists in the data set
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIFMODIFY_ADD_ALREADY_EXISTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDIFMODIFY_ADD_ALREADY_EXISTS_615",TOOLS,MILD_ERROR,615, getClassLoader());

  /**
   * Unable to delete entry %s because it does not exist in the data set
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIFMODIFY_DELETE_NO_SUCH_ENTRY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDIFMODIFY_DELETE_NO_SUCH_ENTRY_616",TOOLS,MILD_ERROR,616, getClassLoader());

  /**
   * Unable to modify entry %s because it does not exist in the data set
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIFMODIFY_MODIFY_NO_SUCH_ENTRY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDIFMODIFY_MODIFY_NO_SUCH_ENTRY_617",TOOLS,MILD_ERROR,617, getClassLoader());

  /**
   * LDIF file containing the data to be updated
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFMODIFY_DESCRIPTION_SOURCE =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFMODIFY_DESCRIPTION_SOURCE_620",TOOLS,INFORMATION,620, getClassLoader());

  /**
   * LDIF file containing the changes to apply
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFMODIFY_DESCRIPTION_CHANGES =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFMODIFY_DESCRIPTION_CHANGES_621",TOOLS,INFORMATION,621, getClassLoader());

  /**
   * File to which the updated data should be written
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFMODIFY_DESCRIPTION_TARGET =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFMODIFY_DESCRIPTION_TARGET_622",TOOLS,INFORMATION,622, getClassLoader());

  /**
   * Displays this usage information
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFMODIFY_DESCRIPTION_HELP =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFMODIFY_DESCRIPTION_HELP_623",TOOLS,INFORMATION,623, getClassLoader());

  /**
   * An error occurred while attempting to initialize the Directory Server JMX subsystem based on the information in configuration file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIFMODIFY_CANNOT_INITIALIZE_JMX =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIFMODIFY_CANNOT_INITIALIZE_JMX_626",TOOLS,SEVERE_ERROR,626, getClassLoader());

  /**
   * An error occurred while attempting to process the Directory Server configuration file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIFMODIFY_CANNOT_INITIALIZE_CONFIG =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIFMODIFY_CANNOT_INITIALIZE_CONFIG_627",TOOLS,SEVERE_ERROR,627, getClassLoader());

  /**
   * An error occurred while attempting to initialize the Directory Server schema based on the information in configuration file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIFMODIFY_CANNOT_INITIALIZE_SCHEMA =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIFMODIFY_CANNOT_INITIALIZE_SCHEMA_628",TOOLS,SEVERE_ERROR,628, getClassLoader());

  /**
   * The source LDIF file %s does not exist
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIFMODIFY_SOURCE_DOES_NOT_EXIST =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDIFMODIFY_SOURCE_DOES_NOT_EXIST_629",TOOLS,SEVERE_ERROR,629, getClassLoader());

  /**
   * Unable to open the source LDIF file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIFMODIFY_CANNOT_OPEN_SOURCE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIFMODIFY_CANNOT_OPEN_SOURCE_630",TOOLS,SEVERE_ERROR,630, getClassLoader());

  /**
   * The changes LDIF file %s does not exist
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIFMODIFY_CHANGES_DOES_NOT_EXIST =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDIFMODIFY_CHANGES_DOES_NOT_EXIST_631",TOOLS,SEVERE_ERROR,631, getClassLoader());

  /**
   * Unable to open the changes LDIF file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIFMODIFY_CANNOT_OPEN_CHANGES =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIFMODIFY_CANNOT_OPEN_CHANGES_632",TOOLS,SEVERE_ERROR,632, getClassLoader());

  /**
   * Unable to open the target LDIF file %s for writing:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIFMODIFY_CANNOT_OPEN_TARGET =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIFMODIFY_CANNOT_OPEN_TARGET_633",TOOLS,SEVERE_ERROR,633, getClassLoader());

  /**
   * An error occurred while processing the requested changes:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIFMODIFY_ERROR_PROCESSING_LDIF =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDIFMODIFY_ERROR_PROCESSING_LDIF_634",TOOLS,SEVERE_ERROR,634, getClassLoader());

  /**
   * Address of the Directory Server system
   */
  public static final MessageDescriptor.Arg0 INFO_LDAPPWMOD_DESCRIPTION_HOST =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAPPWMOD_DESCRIPTION_HOST_635",TOOLS,INFORMATION,635, getClassLoader());

  /**
   * Port on which the Directory Server listens for LDAP client connections
   */
  public static final MessageDescriptor.Arg0 INFO_LDAPPWMOD_DESCRIPTION_PORT =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAPPWMOD_DESCRIPTION_PORT_636",TOOLS,INFORMATION,636, getClassLoader());

  /**
   * DN to use to bind to the server
   */
  public static final MessageDescriptor.Arg0 INFO_LDAPPWMOD_DESCRIPTION_BIND_DN =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAPPWMOD_DESCRIPTION_BIND_DN_637",TOOLS,INFORMATION,637, getClassLoader());

  /**
   * Password to use to bind to the server
   */
  public static final MessageDescriptor.Arg0 INFO_LDAPPWMOD_DESCRIPTION_BIND_PW =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAPPWMOD_DESCRIPTION_BIND_PW_638",TOOLS,INFORMATION,638, getClassLoader());

  /**
   * Path to a file containing the password to use to bind to the server
   */
  public static final MessageDescriptor.Arg0 INFO_LDAPPWMOD_DESCRIPTION_BIND_PW_FILE =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAPPWMOD_DESCRIPTION_BIND_PW_FILE_639",TOOLS,INFORMATION,639, getClassLoader());

  /**
   * Authorization ID for the user entry whose password should be changed
   */
  public static final MessageDescriptor.Arg0 INFO_LDAPPWMOD_DESCRIPTION_AUTHZID =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAPPWMOD_DESCRIPTION_AUTHZID_640",TOOLS,INFORMATION,640, getClassLoader());

  /**
   * Use the bind DN as the authorization ID for the password modify operation
   */
  public static final MessageDescriptor.Arg0 INFO_LDAPPWMOD_DESCRIPTION_PROVIDE_DN_FOR_AUTHZID =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAPPWMOD_DESCRIPTION_PROVIDE_DN_FOR_AUTHZID_641",TOOLS,INFORMATION,641, getClassLoader());

  /**
   * New password to provide for the target user
   */
  public static final MessageDescriptor.Arg0 INFO_LDAPPWMOD_DESCRIPTION_NEWPW =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAPPWMOD_DESCRIPTION_NEWPW_642",TOOLS,INFORMATION,642, getClassLoader());

  /**
   * Path to a file containing the new password to provide for the target user
   */
  public static final MessageDescriptor.Arg0 INFO_LDAPPWMOD_DESCRIPTION_NEWPWFILE =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAPPWMOD_DESCRIPTION_NEWPWFILE_643",TOOLS,INFORMATION,643, getClassLoader());

  /**
   * Current password for the target user
   */
  public static final MessageDescriptor.Arg0 INFO_LDAPPWMOD_DESCRIPTION_CURRENTPW =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAPPWMOD_DESCRIPTION_CURRENTPW_644",TOOLS,INFORMATION,644, getClassLoader());

  /**
   * Path to a file containing the current password for the target user
   */
  public static final MessageDescriptor.Arg0 INFO_LDAPPWMOD_DESCRIPTION_CURRENTPWFILE =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAPPWMOD_DESCRIPTION_CURRENTPWFILE_645",TOOLS,INFORMATION,645, getClassLoader());

  /**
   * Use SSL to secure the communication with the Directory Server
   */
  public static final MessageDescriptor.Arg0 INFO_LDAPPWMOD_DESCRIPTION_USE_SSL =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAPPWMOD_DESCRIPTION_USE_SSL_646",TOOLS,INFORMATION,646, getClassLoader());

  /**
   * Use StartTLS to secure the communication with the Directory Server
   */
  public static final MessageDescriptor.Arg0 INFO_LDAPPWMOD_DESCRIPTION_USE_STARTTLS =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAPPWMOD_DESCRIPTION_USE_STARTTLS_647",TOOLS,INFORMATION,647, getClassLoader());

  /**
   * Blindly trust any SSL certificate presented by the server
   */
  public static final MessageDescriptor.Arg0 INFO_LDAPPWMOD_DESCRIPTION_BLIND_TRUST =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAPPWMOD_DESCRIPTION_BLIND_TRUST_648",TOOLS,INFORMATION,648, getClassLoader());

  /**
   * Path to the key store to use when establishing SSL/TLS communication with the server
   */
  public static final MessageDescriptor.Arg0 INFO_LDAPPWMOD_DESCRIPTION_KEYSTORE =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAPPWMOD_DESCRIPTION_KEYSTORE_649",TOOLS,INFORMATION,649, getClassLoader());

  /**
   * Path to a file containing the PIN needed to access the contents of the key store
   */
  public static final MessageDescriptor.Arg0 INFO_LDAPPWMOD_DESCRIPTION_KEYSTORE_PINFILE =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAPPWMOD_DESCRIPTION_KEYSTORE_PINFILE_650",TOOLS,INFORMATION,650, getClassLoader());

  /**
   * Path to the trust store to use when establishing SSL/TLS communication with the server
   */
  public static final MessageDescriptor.Arg0 INFO_LDAPPWMOD_DESCRIPTION_TRUSTSTORE =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAPPWMOD_DESCRIPTION_TRUSTSTORE_651",TOOLS,INFORMATION,651, getClassLoader());

  /**
   * Path to a file containing the PIN needed to access the contents of the trust store
   */
  public static final MessageDescriptor.Arg0 INFO_LDAPPWMOD_DESCRIPTION_TRUSTSTORE_PINFILE =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAPPWMOD_DESCRIPTION_TRUSTSTORE_PINFILE_652",TOOLS,INFORMATION,652, getClassLoader());

  /**
   * The %s and %s arguments may not be provided together
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAPPWMOD_CONFLICTING_ARGS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDAPPWMOD_CONFLICTING_ARGS_656",TOOLS,SEVERE_ERROR,656, getClassLoader());

  /**
   * If either a bind DN or bind password is provided, then the other must be given as well
   */
  public static final MessageDescriptor.Arg0 ERR_LDAPPWMOD_BIND_DN_AND_PW_MUST_BE_TOGETHER =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_LDAPPWMOD_BIND_DN_AND_PW_MUST_BE_TOGETHER_657",TOOLS,SEVERE_ERROR,657, getClassLoader());

  /**
   * If a bind DN and password are not provided, then an authorization ID and current password must be given
   */
  public static final MessageDescriptor.Arg0 ERR_LDAPPWMOD_ANON_REQUIRES_AUTHZID_AND_CURRENTPW =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_LDAPPWMOD_ANON_REQUIRES_AUTHZID_AND_CURRENTPW_658",TOOLS,SEVERE_ERROR,658, getClassLoader());

  /**
   * If the %s argument is provided, then the  %s argument must also be given
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAPPWMOD_DEPENDENT_ARGS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDAPPWMOD_DEPENDENT_ARGS_659",TOOLS,SEVERE_ERROR,659, getClassLoader());

  /**
   * Unable to initialize SSL/TLS support:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAPPWMOD_ERROR_INITIALIZING_SSL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDAPPWMOD_ERROR_INITIALIZING_SSL_660",TOOLS,SEVERE_ERROR,660, getClassLoader());

  /**
   * An error occurred while attempting to connect to the Directory Server:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAPPWMOD_CANNOT_CONNECT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDAPPWMOD_CANNOT_CONNECT_661",TOOLS,SEVERE_ERROR,661, getClassLoader());

  /**
   * Unable to send the LDAP password modify request:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAPPWMOD_CANNOT_SEND_PWMOD_REQUEST =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDAPPWMOD_CANNOT_SEND_PWMOD_REQUEST_662",TOOLS,SEVERE_ERROR,662, getClassLoader());

  /**
   * Unable to read the LDAP password modify response:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAPPWMOD_CANNOT_READ_PWMOD_RESPONSE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDAPPWMOD_CANNOT_READ_PWMOD_RESPONSE_663",TOOLS,SEVERE_ERROR,663, getClassLoader());

  /**
   * The LDAP password modify operation failed with result code %d
   */
  public static final MessageDescriptor.Arg1<Number> ERR_LDAPPWMOD_FAILED =
          new MessageDescriptor.Arg1<Number>(BASE,"SEVERE_ERR_LDAPPWMOD_FAILED_664",TOOLS,SEVERE_ERROR,664, getClassLoader());

  /**
   * Error Message:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAPPWMOD_FAILURE_ERROR_MESSAGE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDAPPWMOD_FAILURE_ERROR_MESSAGE_665",TOOLS,SEVERE_ERROR,665, getClassLoader());

  /**
   * Matched DN:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAPPWMOD_FAILURE_MATCHED_DN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDAPPWMOD_FAILURE_MATCHED_DN_666",TOOLS,SEVERE_ERROR,666, getClassLoader());

  /**
   * The LDAP password modify operation was successful
   */
  public static final MessageDescriptor.Arg0 INFO_LDAPPWMOD_SUCCESSFUL =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAPPWMOD_SUCCESSFUL_667",TOOLS,INFORMATION,667, getClassLoader());

  /**
   * Additional Info:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_LDAPPWMOD_ADDITIONAL_INFO =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_LDAPPWMOD_ADDITIONAL_INFO_668",TOOLS,INFORMATION,668, getClassLoader());

  /**
   * Generated Password:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_LDAPPWMOD_GENERATED_PASSWORD =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_LDAPPWMOD_GENERATED_PASSWORD_669",TOOLS,INFORMATION,669, getClassLoader());

  /**
   * Unable to decode the password modify response value because it contained an invalid element type of %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAPPWMOD_UNRECOGNIZED_VALUE_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDAPPWMOD_UNRECOGNIZED_VALUE_TYPE_670",TOOLS,SEVERE_ERROR,670, getClassLoader());

  /**
   * Unable to decode the password modify response value:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAPPWMOD_COULD_NOT_DECODE_RESPONSE_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDAPPWMOD_COULD_NOT_DECODE_RESPONSE_VALUE_671",TOOLS,SEVERE_ERROR,671, getClassLoader());

  /**
   * Import failed
   */
  public static final MessageDescriptor.Arg0 ERR_INSTALLDS_IMPORT_UNSUCCESSFUL =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_INSTALLDS_IMPORT_UNSUCCESSFUL_672",TOOLS,SEVERE_ERROR,672, getClassLoader());

  /**
   * The assertion value was indicated to be base64-encoded, but an error occurred while trying to decode the value
   */
  public static final MessageDescriptor.Arg0 INFO_COMPARE_CANNOT_BASE64_DECODE_ASSERTION_VALUE =
          new MessageDescriptor.Arg0(BASE,"INFO_COMPARE_CANNOT_BASE64_DECODE_ASSERTION_VALUE_673",TOOLS,INFORMATION,673, getClassLoader());

  /**
   * Unable to read the assertion value from the specified file:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_COMPARE_CANNOT_READ_ASSERTION_VALUE_FROM_FILE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_COMPARE_CANNOT_READ_ASSERTION_VALUE_FROM_FILE_674",TOOLS,INFORMATION,674, getClassLoader());

  /**
   * Path to the file to watch for deletion
   */
  public static final MessageDescriptor.Arg0 INFO_WAIT4DEL_DESCRIPTION_TARGET_FILE =
          new MessageDescriptor.Arg0(BASE,"INFO_WAIT4DEL_DESCRIPTION_TARGET_FILE_675",TOOLS,INFORMATION,675, getClassLoader());

  /**
   * Path to a file containing log output to monitor
   */
  public static final MessageDescriptor.Arg0 INFO_WAIT4DEL_DESCRIPTION_LOG_FILE =
          new MessageDescriptor.Arg0(BASE,"INFO_WAIT4DEL_DESCRIPTION_LOG_FILE_676",TOOLS,INFORMATION,676, getClassLoader());

  /**
   * Maximum length of time in seconds to wait for the target file to be deleted before exiting
   */
  public static final MessageDescriptor.Arg0 INFO_WAIT4DEL_DESCRIPTION_TIMEOUT =
          new MessageDescriptor.Arg0(BASE,"INFO_WAIT4DEL_DESCRIPTION_TIMEOUT_677",TOOLS,INFORMATION,677, getClassLoader());

  /**
   * Displays this usage information
   */
  public static final MessageDescriptor.Arg0 INFO_WAIT4DEL_DESCRIPTION_HELP =
          new MessageDescriptor.Arg0(BASE,"INFO_WAIT4DEL_DESCRIPTION_HELP_678",TOOLS,INFORMATION,678, getClassLoader());

  /**
   * WARNING:  Unable to open log file %s for reading:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_WAIT4DEL_CANNOT_OPEN_LOG_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_WAIT4DEL_CANNOT_OPEN_LOG_FILE_681",TOOLS,SEVERE_WARNING,681, getClassLoader());

  /**
   * No entry DNs provided for the compare operation
   */
  public static final MessageDescriptor.Arg0 ERR_LDAPCOMPARE_NO_DNS =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_LDAPCOMPARE_NO_DNS_682",TOOLS,SEVERE_ERROR,682, getClassLoader());

  /**
   * This utility can be used to back up one or more Directory Server backends
   */
  public static final MessageDescriptor.Arg0 INFO_BACKUPDB_TOOL_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_BACKUPDB_TOOL_DESCRIPTION_683",TOOLS,INFORMATION,683, getClassLoader());

  /**
   * This utility can be used to define a base configuration for the Directory Server
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIGDS_TOOL_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIGDS_TOOL_DESCRIPTION_684",TOOLS,INFORMATION,684, getClassLoader());

  /**
   * This utility can be used to encode user passwords with a specified storage scheme, or to determine whether a given clear-text value matches a provided encoded password
   */
  public static final MessageDescriptor.Arg0 INFO_ENCPW_TOOL_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_ENCPW_TOOL_DESCRIPTION_685",TOOLS,INFORMATION,685, getClassLoader());

  /**
   * This utility can be used to export data from a Directory Server backend in LDIF form
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFEXPORT_TOOL_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFEXPORT_TOOL_DESCRIPTION_686",TOOLS,INFORMATION,686, getClassLoader());

  /**
   * This utility can be used to import LDIF data into a Directory Server backend
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFIMPORT_TOOL_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFIMPORT_TOOL_DESCRIPTION_687",TOOLS,INFORMATION,687, getClassLoader());

  /**
   * This utility can be used to setup the Directory Server
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_TOOL_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_TOOL_DESCRIPTION_688",TOOLS,INFORMATION,688, getClassLoader());

  /**
   * This utility can be used to perform LDAP compare operations in the Directory Server
   */
  public static final MessageDescriptor.Arg0 INFO_LDAPCOMPARE_TOOL_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAPCOMPARE_TOOL_DESCRIPTION_689",TOOLS,INFORMATION,689, getClassLoader());

  /**
   * This utility can be used to perform LDAP delete operations in the Directory Server
   */
  public static final MessageDescriptor.Arg0 INFO_LDAPDELETE_TOOL_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAPDELETE_TOOL_DESCRIPTION_690",TOOLS,INFORMATION,690, getClassLoader());

  /**
   * This utility can be used to perform LDAP modify, add, delete, and modify DN operations in the Directory Server
   */
  public static final MessageDescriptor.Arg0 INFO_LDAPMODIFY_TOOL_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAPMODIFY_TOOL_DESCRIPTION_691",TOOLS,INFORMATION,691, getClassLoader());

  /**
   * This utility can be used to perform LDAP password modify operations in the Directory Server
   */
  public static final MessageDescriptor.Arg0 INFO_LDAPPWMOD_TOOL_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAPPWMOD_TOOL_DESCRIPTION_692",TOOLS,INFORMATION,692, getClassLoader());

  /**
   * This utility can be used to perform LDAP search operations in the Directory Server
   */
  public static final MessageDescriptor.Arg0 INFO_LDAPSEARCH_TOOL_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAPSEARCH_TOOL_DESCRIPTION_693",TOOLS,INFORMATION,693, getClassLoader());

  /**
   * This utility can be used to compare two LDIF files and report the differences in LDIF format
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFDIFF_TOOL_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFDIFF_TOOL_DESCRIPTION_694",TOOLS,INFORMATION,694, getClassLoader());

  /**
   * This utility can be used to apply a set of modify, add, and delete operations against data in an LDIF file
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFMODIFY_TOOL_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFMODIFY_TOOL_DESCRIPTION_695",TOOLS,INFORMATION,695, getClassLoader());

  /**
   * This utility can be used to perform search operations against data in an LDIF file
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFSEARCH_TOOL_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFSEARCH_TOOL_DESCRIPTION_696",TOOLS,INFORMATION,696, getClassLoader());

  /**
   * This utility can be used to generate LDIF data based on a definition in a template file
   */
  public static final MessageDescriptor.Arg0 INFO_MAKELDIF_TOOL_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_MAKELDIF_TOOL_DESCRIPTION_697",TOOLS,INFORMATION,697, getClassLoader());

  /**
   * This utility can be used to restore a backup of a Directory Server backend
   */
  public static final MessageDescriptor.Arg0 INFO_RESTOREDB_TOOL_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_RESTOREDB_TOOL_DESCRIPTION_698",TOOLS,INFORMATION,698, getClassLoader());

  /**
   * This utility can be used to request that the Directory Server stop running or perform a restart
   */
  public static final MessageDescriptor.Arg0 INFO_STOPDS_TOOL_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_STOPDS_TOOL_DESCRIPTION_699",TOOLS,INFORMATION,699, getClassLoader());

  /**
   * This utility can be used to ensure that index data is consistent within a backend based on the Berkeley DB Java Edition
   */
  public static final MessageDescriptor.Arg0 INFO_VERIFYINDEX_TOOL_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_VERIFYINDEX_TOOL_DESCRIPTION_700",TOOLS,INFORMATION,700, getClassLoader());

  /**
   * This utility can be used to wait for a file to be removed from the filesystem
   */
  public static final MessageDescriptor.Arg0 INFO_WAIT4DEL_TOOL_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_WAIT4DEL_TOOL_DESCRIPTION_701",TOOLS,INFORMATION,701, getClassLoader());

  /**
   * You may not provide both the --%s and the --%s arguments
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TOOL_CONFLICTING_ARGS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TOOL_CONFLICTING_ARGS_702",TOOLS,SEVERE_ERROR,702, getClassLoader());

  /**
   * No attribute was specified to use as the target for the comparison
   */
  public static final MessageDescriptor.Arg0 ERR_LDAPCOMPARE_NO_ATTR =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_LDAPCOMPARE_NO_ATTR_703",TOOLS,SEVERE_ERROR,703, getClassLoader());

  /**
   * Invalid attribute string '%s'. The attribute string must be in one of the following forms: 'attribute:value', 'attribute::base64value', or 'attribute:<valueFilePath'
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAPCOMPARE_INVALID_ATTR_STRING =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDAPCOMPARE_INVALID_ATTR_STRING_704",TOOLS,SEVERE_ERROR,704, getClassLoader());

  /**
   * Invalid control specification '%s'
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TOOL_INVALID_CONTROL_STRING =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TOOL_INVALID_CONTROL_STRING_705",TOOLS,SEVERE_ERROR,705, getClassLoader());

  /**
   * SASL EXTERNAL authentication may only be requested if SSL or StartTLS is used
   */
  public static final MessageDescriptor.Arg0 ERR_TOOL_SASLEXTERNAL_NEEDS_SSL_OR_TLS =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_TOOL_SASLEXTERNAL_NEEDS_SSL_OR_TLS_706",TOOLS,SEVERE_ERROR,706, getClassLoader());

  /**
   * SASL EXTERNAL authentication may only be used if a client certificate key store is specified
   */
  public static final MessageDescriptor.Arg0 ERR_TOOL_SASLEXTERNAL_NEEDS_KEYSTORE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_TOOL_SASLEXTERNAL_NEEDS_KEYSTORE_707",TOOLS,SEVERE_ERROR,707, getClassLoader());

  /**
   * # Persistent search change type:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_LDAPSEARCH_PSEARCH_CHANGE_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_LDAPSEARCH_PSEARCH_CHANGE_TYPE_708",TOOLS,INFORMATION,708, getClassLoader());

  /**
   * # Persistent search previous entry DN:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_LDAPSEARCH_PSEARCH_PREVIOUS_DN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_LDAPSEARCH_PSEARCH_PREVIOUS_DN_709",TOOLS,INFORMATION,709, getClassLoader());

  /**
   * # Account Usability Response Control
   */
  public static final MessageDescriptor.Arg0 INFO_LDAPSEARCH_ACCTUSABLE_HEADER =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAPSEARCH_ACCTUSABLE_HEADER_710",TOOLS,INFORMATION,710, getClassLoader());

  /**
   * #   The account is usable
   */
  public static final MessageDescriptor.Arg0 INFO_LDAPSEARCH_ACCTUSABLE_IS_USABLE =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAPSEARCH_ACCTUSABLE_IS_USABLE_711",TOOLS,INFORMATION,711, getClassLoader());

  /**
   * #   Time until password expiration:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_LDAPSEARCH_ACCTUSABLE_TIME_UNTIL_EXPIRATION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_LDAPSEARCH_ACCTUSABLE_TIME_UNTIL_EXPIRATION_712",TOOLS,INFORMATION,712, getClassLoader());

  /**
   * #   The account is not usable
   */
  public static final MessageDescriptor.Arg0 INFO_LDAPSEARCH_ACCTUSABLE_NOT_USABLE =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAPSEARCH_ACCTUSABLE_NOT_USABLE_713",TOOLS,INFORMATION,713, getClassLoader());

  /**
   * #   The account has been deactivated
   */
  public static final MessageDescriptor.Arg0 INFO_LDAPSEARCH_ACCTUSABLE_ACCT_INACTIVE =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAPSEARCH_ACCTUSABLE_ACCT_INACTIVE_714",TOOLS,INFORMATION,714, getClassLoader());

  /**
   * #   The password has been reset
   */
  public static final MessageDescriptor.Arg0 INFO_LDAPSEARCH_ACCTUSABLE_PW_RESET =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAPSEARCH_ACCTUSABLE_PW_RESET_715",TOOLS,INFORMATION,715, getClassLoader());

  /**
   * #   The password has expired
   */
  public static final MessageDescriptor.Arg0 INFO_LDAPSEARCH_ACCTUSABLE_PW_EXPIRED =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAPSEARCH_ACCTUSABLE_PW_EXPIRED_716",TOOLS,INFORMATION,716, getClassLoader());

  /**
   * #   Number of grace logins remaining:  %d
   */
  public static final MessageDescriptor.Arg1<Number> INFO_LDAPSEARCH_ACCTUSABLE_REMAINING_GRACE =
          new MessageDescriptor.Arg1<Number>(BASE,"INFO_LDAPSEARCH_ACCTUSABLE_REMAINING_GRACE_717",TOOLS,INFORMATION,717, getClassLoader());

  /**
   * #   The account is locked
   */
  public static final MessageDescriptor.Arg0 INFO_LDAPSEARCH_ACCTUSABLE_LOCKED =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAPSEARCH_ACCTUSABLE_LOCKED_718",TOOLS,INFORMATION,718, getClassLoader());

  /**
   * #   Time until the account is unlocked:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_LDAPSEARCH_ACCTUSABLE_TIME_UNTIL_UNLOCK =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_LDAPSEARCH_ACCTUSABLE_TIME_UNTIL_UNLOCK_719",TOOLS,INFORMATION,719, getClassLoader());

  /**
   * Certificate key store PIN file
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_KEYSTOREPASSWORD_FILE =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_KEYSTOREPASSWORD_FILE_720",TOOLS,INFORMATION,720, getClassLoader());

  /**
   * Certificate trust store PIN
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_TRUSTSTOREPASSWORD =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_TRUSTSTOREPASSWORD_721",TOOLS,INFORMATION,721, getClassLoader());

  /**
   * Certificate trust store PIN file
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_TRUSTSTOREPASSWORD_FILE =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_TRUSTSTOREPASSWORD_FILE_722",TOOLS,INFORMATION,722, getClassLoader());

  /**
   * This utility can be used to list the backends and base DNs configured in the Directory Server
   */
  public static final MessageDescriptor.Arg0 INFO_LISTBACKENDS_TOOL_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_LISTBACKENDS_TOOL_DESCRIPTION_723",TOOLS,INFORMATION,723, getClassLoader());

  /**
   * Backend ID of the backend for which to list the base DNs
   */
  public static final MessageDescriptor.Arg0 INFO_LISTBACKENDS_DESCRIPTION_BACKEND_ID =
          new MessageDescriptor.Arg0(BASE,"INFO_LISTBACKENDS_DESCRIPTION_BACKEND_ID_726",TOOLS,INFORMATION,726, getClassLoader());

  /**
   * Base DN for which to list the backend ID
   */
  public static final MessageDescriptor.Arg0 INFO_LISTBACKENDS_DESCRIPTION_BASE_DN =
          new MessageDescriptor.Arg0(BASE,"INFO_LISTBACKENDS_DESCRIPTION_BASE_DN_727",TOOLS,INFORMATION,727, getClassLoader());

  /**
   * Display this usage information
   */
  public static final MessageDescriptor.Arg0 INFO_LISTBACKENDS_DESCRIPTION_HELP =
          new MessageDescriptor.Arg0(BASE,"INFO_LISTBACKENDS_DESCRIPTION_HELP_728",TOOLS,INFORMATION,728, getClassLoader());

  /**
   * An error occurred while trying to read backend information from the server configuration:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LISTBACKENDS_CANNOT_GET_BACKENDS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LISTBACKENDS_CANNOT_GET_BACKENDS_734",TOOLS,SEVERE_ERROR,734, getClassLoader());

  /**
   * The provided base DN value '%s' could not be parsed as a valid DN:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LISTBACKENDS_INVALID_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LISTBACKENDS_INVALID_DN_735",TOOLS,SEVERE_ERROR,735, getClassLoader());

  /**
   * The provided DN '%s' is not a base DN for any backend configured in the Directory Server
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_LISTBACKENDS_NOT_BASE_DN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_LISTBACKENDS_NOT_BASE_DN_736",TOOLS,INFORMATION,736, getClassLoader());

  /**
   * The provided DN '%s' is not below any base DN for any of the backends configured in the Directory Server
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_LISTBACKENDS_NO_BACKEND_FOR_DN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_LISTBACKENDS_NO_BACKEND_FOR_DN_737",TOOLS,INFORMATION,737, getClassLoader());

  /**
   * The provided DN '%s' is below '%s' which is configured as a base DN for backend '%s'
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> INFO_LISTBACKENDS_DN_BELOW_BASE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"INFO_LISTBACKENDS_DN_BELOW_BASE_738",TOOLS,INFORMATION,738, getClassLoader());

  /**
   * The provided DN '%s' is a base DN for backend '%s'
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_LISTBACKENDS_BASE_FOR_ID =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_LISTBACKENDS_BASE_FOR_ID_739",TOOLS,INFORMATION,739, getClassLoader());

  /**
   * Backend ID
   */
  public static final MessageDescriptor.Arg0 INFO_LISTBACKENDS_LABEL_BACKEND_ID =
          new MessageDescriptor.Arg0(BASE,"INFO_LISTBACKENDS_LABEL_BACKEND_ID_740",TOOLS,INFORMATION,740, getClassLoader());

  /**
   * Base DN
   */
  public static final MessageDescriptor.Arg0 INFO_LISTBACKENDS_LABEL_BASE_DN =
          new MessageDescriptor.Arg0(BASE,"INFO_LISTBACKENDS_LABEL_BASE_DN_741",TOOLS,INFORMATION,741, getClassLoader());

  /**
   * There is no backend with ID '%s' in the server configuration
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LISTBACKENDS_NO_SUCH_BACKEND =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LISTBACKENDS_NO_SUCH_BACKEND_742",TOOLS,SEVERE_ERROR,742, getClassLoader());

  /**
   * None of the provided backend IDs exist in the server configuration
   */
  public static final MessageDescriptor.Arg0 ERR_LISTBACKENDS_NO_VALID_BACKENDS =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_LISTBACKENDS_NO_VALID_BACKENDS_743",TOOLS,SEVERE_ERROR,743, getClassLoader());

  /**
   * The provided password is not a valid encoded user password value:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ENCPW_INVALID_ENCODED_USERPW =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_ENCPW_INVALID_ENCODED_USERPW_748",TOOLS,SEVERE_ERROR,748, getClassLoader());

  /**
   * Use the LDAP compare result as an exit code for the password comparison
   */
  public static final MessageDescriptor.Arg0 INFO_ENCPW_DESCRIPTION_USE_COMPARE_RESULT =
          new MessageDescriptor.Arg0(BASE,"INFO_ENCPW_DESCRIPTION_USE_COMPARE_RESULT_749",TOOLS,INFORMATION,749, getClassLoader());

  /**
   * Count the number of entries returned by the server
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_COUNT_ENTRIES =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_COUNT_ENTRIES_750",TOOLS,INFORMATION,750, getClassLoader());

  /**
   * # Total number of matching entries: %d
   */
  public static final MessageDescriptor.Arg1<Number> INFO_LDAPSEARCH_MATCHING_ENTRY_COUNT =
          new MessageDescriptor.Arg1<Number>(BASE,"INFO_LDAPSEARCH_MATCHING_ENTRY_COUNT_751",TOOLS,INFORMATION,751, getClassLoader());

  /**
   * Use the command line install. If not specified the graphical interface will be launched.  The rest of the options (excluding help and version) will only be taken into account if this option is specified
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_DESCRIPTION_CLI =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_DESCRIPTION_CLI_752",TOOLS,INFORMATION,752, getClassLoader());

  /**
   * Specifies that the database should be populated with the specified number of sample entries
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_DESCRIPTION_SAMPLE_DATA =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_DESCRIPTION_SAMPLE_DATA_753",TOOLS,INFORMATION,753, getClassLoader());

  /**
   * Options for populating the database:
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_HEADER_POPULATE_TYPE =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_HEADER_POPULATE_TYPE_754",TOOLS,INFORMATION,754, getClassLoader());

  /**
   * Only create the base entry
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_POPULATE_OPTION_BASE_ONLY =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_POPULATE_OPTION_BASE_ONLY_755",TOOLS,INFORMATION,755, getClassLoader());

  /**
   * Leave the database empty
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_POPULATE_OPTION_LEAVE_EMPTY =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_POPULATE_OPTION_LEAVE_EMPTY_756",TOOLS,INFORMATION,756, getClassLoader());

  /**
   * Import data from an LDIF file
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_POPULATE_OPTION_IMPORT_LDIF =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_POPULATE_OPTION_IMPORT_LDIF_757",TOOLS,INFORMATION,757, getClassLoader());

  /**
   * Load automatically-generated sample data
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_POPULATE_OPTION_GENERATE_SAMPLE =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_POPULATE_OPTION_GENERATE_SAMPLE_758",TOOLS,INFORMATION,758, getClassLoader());

  /**
   * Database population selection:
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_PROMPT_POPULATE_CHOICE =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_PROMPT_POPULATE_CHOICE_759",TOOLS,INFORMATION,759, getClassLoader());

  /**
   * ERROR:  The specified LDIF file %s does not exist
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_INSTALLDS_NO_SUCH_LDIF_FILE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_INSTALLDS_NO_SUCH_LDIF_FILE_780",TOOLS,SEVERE_ERROR,780, getClassLoader());

  /**
   * Please specify the number of user entries to generate:
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_PROMPT_NUM_ENTRIES =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_PROMPT_NUM_ENTRIES_781",TOOLS,INFORMATION,781, getClassLoader());

  /**
   * ERROR:  Cannot create the template file for generating sample data:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_INSTALLDS_CANNOT_CREATE_TEMPLATE_FILE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_INSTALLDS_CANNOT_CREATE_TEMPLATE_FILE_782",TOOLS,SEVERE_ERROR,782, getClassLoader());

  /**
   * The PIN needed to access the contents of the key store
   */
  public static final MessageDescriptor.Arg0 INFO_LDAPPWMOD_DESCRIPTION_KEYSTORE_PIN =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAPPWMOD_DESCRIPTION_KEYSTORE_PIN_783",TOOLS,INFORMATION,783, getClassLoader());

  /**
   * The PIN needed to access the contents of the trust store
   */
  public static final MessageDescriptor.Arg0 INFO_LDAPPWMOD_DESCRIPTION_TRUSTSTORE_PIN =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAPPWMOD_DESCRIPTION_TRUSTSTORE_PIN_784",TOOLS,INFORMATION,784, getClassLoader());

  /**
   * Exclude operational attributes from the LDIF export
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFEXPORT_DESCRIPTION_EXCLUDE_OPERATIONAL =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFEXPORT_DESCRIPTION_EXCLUDE_OPERATIONAL_785",TOOLS,INFORMATION,785, getClassLoader());

  /**
   * Password Policy Warning:  %s = %d
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> INFO_LDAPPWMOD_PWPOLICY_WARNING =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"INFO_LDAPPWMOD_PWPOLICY_WARNING_786",TOOLS,INFORMATION,786, getClassLoader());

  /**
   * Password Policy Error:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_LDAPPWMOD_PWPOLICY_ERROR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_LDAPPWMOD_PWPOLICY_ERROR_787",TOOLS,INFORMATION,787, getClassLoader());

  /**
   * Unable to decode the password policy response control:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAPPWMOD_CANNOT_DECODE_PWPOLICY_CONTROL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAPPWMOD_CANNOT_DECODE_PWPOLICY_CONTROL_788",TOOLS,MILD_ERROR,788, getClassLoader());

  /**
   * The connection to the Directory Server was closed before the bind response could be read
   */
  public static final MessageDescriptor.Arg0 ERR_LDAPAUTH_CONNECTION_CLOSED_WITHOUT_BIND_RESPONSE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_LDAPAUTH_CONNECTION_CLOSED_WITHOUT_BIND_RESPONSE_789",TOOLS,SEVERE_ERROR,789, getClassLoader());

  /**
   * Use the simple paged results control with the given page size
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_SIMPLE_PAGE_SIZE =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_SIMPLE_PAGE_SIZE_790",TOOLS,INFORMATION,790, getClassLoader());

  /**
   * The simple paged results control may only be used with a single search filter
   */
  public static final MessageDescriptor.Arg0 ERR_PAGED_RESULTS_REQUIRES_SINGLE_FILTER =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_PAGED_RESULTS_REQUIRES_SINGLE_FILTER_791",TOOLS,SEVERE_ERROR,791, getClassLoader());

  /**
   * Unable to decode the simple paged results control from the search response:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PAGED_RESULTS_CANNOT_DECODE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PAGED_RESULTS_CANNOT_DECODE_792",TOOLS,SEVERE_ERROR,792, getClassLoader());

  /**
   * The simple paged results response control was not found in the search result done message from the server
   */
  public static final MessageDescriptor.Arg0 ERR_PAGED_RESULTS_RESPONSE_NOT_FOUND =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_PAGED_RESULTS_RESPONSE_NOT_FOUND_793",TOOLS,SEVERE_ERROR,793, getClassLoader());

  /**
   * Each attribute-level change should be written as a separate modification per attribute value rather than one modification per entry
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFDIFF_DESCRIPTION_SINGLE_VALUE_CHANGES =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFDIFF_DESCRIPTION_SINGLE_VALUE_CHANGES_794",TOOLS,INFORMATION,794, getClassLoader());

  /**
   * Rejecting client certificate chain because the prompt trust manager may only be used to trust server certificates
   */
  public static final MessageDescriptor.Arg0 ERR_PROMPTTM_REJECTING_CLIENT_CERT =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_PROMPTTM_REJECTING_CLIENT_CERT_795",TOOLS,SEVERE_ERROR,795, getClassLoader());

  /**
   * WARNING:  The server did not present a certificate chain.  Do you still wish to attempt connecting to the target server?
   */
  public static final MessageDescriptor.Arg0 WARN_PROMPTTM_NO_SERVER_CERT_CHAIN =
          new MessageDescriptor.Arg0(BASE,"SEVERE_WARN_PROMPTTM_NO_SERVER_CERT_CHAIN_796",TOOLS,SEVERE_WARNING,796, getClassLoader());

  /**
   * WARNING:  The server certificate is expired (expiration time:  %s)
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_PROMPTTM_CERT_EXPIRED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_PROMPTTM_CERT_EXPIRED_797",TOOLS,SEVERE_WARNING,797, getClassLoader());

  /**
   * WARNING:  The server certificate will not be valid until %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_PROMPTTM_CERT_NOT_YET_VALID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_PROMPTTM_CERT_NOT_YET_VALID_798",TOOLS,SEVERE_WARNING,798, getClassLoader());

  /**
   * The server is using the following certificate: 
   *     Subject DN:  %s
   *     Issuer DN:  %s
   *     Validity:  %s through %s
   * Do you wish to trust this certificate and continue connecting to the server?
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> INFO_PROMPTTM_SERVER_CERT =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"INFO_PROMPTTM_SERVER_CERT_799",TOOLS,INFORMATION,799, getClassLoader());

  /**
   * Please enter "yes" or "no":
   */
  public static final MessageDescriptor.Arg0 INFO_PROMPTTM_YESNO_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_PROMPTTM_YESNO_PROMPT_800",TOOLS,INFORMATION,800, getClassLoader());

  /**
   * The server certificate has been rejected by the user
   */
  public static final MessageDescriptor.Arg0 ERR_PROMPTTM_USER_REJECTED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_PROMPTTM_USER_REJECTED_801",TOOLS,SEVERE_ERROR,801, getClassLoader());

  /**
   * Server already stopped
   */
  public static final MessageDescriptor.Arg0 INFO_STOPDS_SERVER_ALREADY_STOPPED =
          new MessageDescriptor.Arg0(BASE,"INFO_STOPDS_SERVER_ALREADY_STOPPED_802",TOOLS,INFORMATION,802, getClassLoader());

  /**
   * Stopping Server...
   */
  public static final MessageDescriptor.Arg0 INFO_STOPDS_GOING_TO_STOP =
          new MessageDescriptor.Arg0(BASE,"INFO_STOPDS_GOING_TO_STOP_803",TOOLS,INFORMATION,803, getClassLoader());

  /**
   * Used to determine whether the server can be stopped or not and the mode to be used to stop it
   */
  public static final MessageDescriptor.Arg0 INFO_STOPDS_CHECK_STOPPABILITY =
          new MessageDescriptor.Arg0(BASE,"INFO_STOPDS_CHECK_STOPPABILITY_804",TOOLS,INFORMATION,804, getClassLoader());

  /**
   * Nickname of certificate for SSL client authentication
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_CERT_NICKNAME =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_CERT_NICKNAME_805",TOOLS,INFORMATION,805, getClassLoader());

  /**
   * Port on which the Directory Server should listen for JMX communication
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIGDS_DESCRIPTION_JMX_PORT =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIGDS_DESCRIPTION_JMX_PORT_806",TOOLS,INFORMATION,806, getClassLoader());

  /**
   * An error occurred while attempting to update the port on which to listen for JMX communication:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIGDS_CANNOT_UPDATE_JMX_PORT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIGDS_CANNOT_UPDATE_JMX_PORT_807",TOOLS,SEVERE_ERROR,807, getClassLoader());

  /**
   * Port on which the Directory Server should listen for JMX communication
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_DESCRIPTION_JMXPORT =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_DESCRIPTION_JMXPORT_808",TOOLS,INFORMATION,808, getClassLoader());

  /**
   * On which port would you like the Directory Server to accept connections from JMX clients?
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_PROMPT_JMXPORT =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_PROMPT_JMXPORT_809",TOOLS,INFORMATION,809, getClassLoader());

  /**
   * Result Code:  %d (%s)
   */
  public static final MessageDescriptor.Arg2<Number,CharSequence> ERR_TOOL_RESULT_CODE =
          new MessageDescriptor.Arg2<Number,CharSequence>(BASE,"SEVERE_ERR_TOOL_RESULT_CODE_810",TOOLS,SEVERE_ERROR,810, getClassLoader());

  /**
   * Additional Information:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TOOL_ERROR_MESSAGE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TOOL_ERROR_MESSAGE_811",TOOLS,SEVERE_ERROR,811, getClassLoader());

  /**
   * Matched DN:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TOOL_MATCHED_DN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TOOL_MATCHED_DN_812",TOOLS,SEVERE_ERROR,812, getClassLoader());

  /**
   * Could not find the service name for the server
   */
  public static final MessageDescriptor.Arg0 ERR_WINDOWS_SERVICE_NOT_FOUND =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_WINDOWS_SERVICE_NOT_FOUND_813",TOOLS,SEVERE_ERROR,813, getClassLoader());

  /**
   * An unexpected error occurred starting the server as a windows service
   */
  public static final MessageDescriptor.Arg0 ERR_WINDOWS_SERVICE_START_ERROR =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_WINDOWS_SERVICE_START_ERROR_814",TOOLS,SEVERE_ERROR,814, getClassLoader());

  /**
   * An unexpected error occurred stopping the server windows service
   */
  public static final MessageDescriptor.Arg0 ERR_WINDOWS_SERVICE_STOP_ERROR =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_WINDOWS_SERVICE_STOP_ERROR_815",TOOLS,SEVERE_ERROR,815, getClassLoader());

  /**
   * This utility can be used to configure the server as a Windows service
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIGURE_WINDOWS_SERVICE_TOOL_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIGURE_WINDOWS_SERVICE_TOOL_DESCRIPTION_816",TOOLS,INFORMATION,816, getClassLoader());

  /**
   * Display this usage information
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIGURE_WINDOWS_SERVICE_DESCRIPTION_SHOWUSAGE =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIGURE_WINDOWS_SERVICE_DESCRIPTION_SHOWUSAGE_817",TOOLS,INFORMATION,817, getClassLoader());

  /**
   * Enables the server as a Windows service
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIGURE_WINDOWS_SERVICE_DESCRIPTION_ENABLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIGURE_WINDOWS_SERVICE_DESCRIPTION_ENABLE_818",TOOLS,INFORMATION,818, getClassLoader());

  /**
   * Disables the server as a Windows service and stops the server
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIGURE_WINDOWS_SERVICE_DESCRIPTION_DISABLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIGURE_WINDOWS_SERVICE_DESCRIPTION_DISABLE_819",TOOLS,INFORMATION,819, getClassLoader());

  /**
   * Provides information about the state of the server as a Windows service
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIGURE_WINDOWS_SERVICE_DESCRIPTION_STATE =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIGURE_WINDOWS_SERVICE_DESCRIPTION_STATE_820",TOOLS,INFORMATION,820, getClassLoader());

  /**
   * You can only provide one of the following arguments:
   * enableService, disableService, serviceState or cleanupService
   */
  public static final MessageDescriptor.Arg0 ERR_CONFIGURE_WINDOWS_SERVICE_TOO_MANY_ARGS =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CONFIGURE_WINDOWS_SERVICE_TOO_MANY_ARGS_823",TOOLS,SEVERE_ERROR,823, getClassLoader());

  /**
   * You must provide at least one of the following arguments:
   * enableService, disableService or serviceState or cleanupService
   */
  public static final MessageDescriptor.Arg0 ERR_CONFIGURE_WINDOWS_SERVICE_TOO_FEW_ARGS =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CONFIGURE_WINDOWS_SERVICE_TOO_FEW_ARGS_824",TOOLS,SEVERE_ERROR,824, getClassLoader());

  /**
   * %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_WINDOWS_SERVICE_NAME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_WINDOWS_SERVICE_NAME_825",TOOLS,INFORMATION,825, getClassLoader());

  /**
   * Next Generation Directory Server.  Installation path: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_WINDOWS_SERVICE_DESCRIPTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_WINDOWS_SERVICE_DESCRIPTION_826",TOOLS,INFORMATION,826, getClassLoader());

  /**
   * The server was successfully enabled to run as a Windows service
   */
  public static final MessageDescriptor.Arg0 INFO_WINDOWS_SERVICE_SUCCESSULLY_ENABLED =
          new MessageDescriptor.Arg0(BASE,"INFO_WINDOWS_SERVICE_SUCCESSULLY_ENABLED_827",TOOLS,INFORMATION,827, getClassLoader());

  /**
   * The server was already enabled to run as a Windows service
   */
  public static final MessageDescriptor.Arg0 INFO_WINDOWS_SERVICE_ALREADY_ENABLED =
          new MessageDescriptor.Arg0(BASE,"INFO_WINDOWS_SERVICE_ALREADY_ENABLED_828",TOOLS,INFORMATION,828, getClassLoader());

  /**
   * The server could not be enabled to run as a Windows service.  The service name is already in use
   */
  public static final MessageDescriptor.Arg0 ERR_WINDOWS_SERVICE_NAME_ALREADY_IN_USE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_WINDOWS_SERVICE_NAME_ALREADY_IN_USE_829",TOOLS,SEVERE_ERROR,829, getClassLoader());

  /**
   * An unexpected error occurred trying to enable the server as a Windows service.%nCheck that you have administrator rights (only Administrators can enable the server to run as a Windows Service)
   */
  public static final MessageDescriptor.Arg0 ERR_WINDOWS_SERVICE_ENABLE_ERROR =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_WINDOWS_SERVICE_ENABLE_ERROR_830",TOOLS,SEVERE_ERROR,830, getClassLoader());

  /**
   * The server was successfully disabled as a Windows service
   */
  public static final MessageDescriptor.Arg0 INFO_WINDOWS_SERVICE_SUCCESSULLY_DISABLED =
          new MessageDescriptor.Arg0(BASE,"INFO_WINDOWS_SERVICE_SUCCESSULLY_DISABLED_831",TOOLS,INFORMATION,831, getClassLoader());

  /**
   * The server was already disabled as a Windows service
   */
  public static final MessageDescriptor.Arg0 INFO_WINDOWS_SERVICE_ALREADY_DISABLED =
          new MessageDescriptor.Arg0(BASE,"INFO_WINDOWS_SERVICE_ALREADY_DISABLED_832",TOOLS,INFORMATION,832, getClassLoader());

  /**
   * The server has been marked for deletion as a Windows Service
   */
  public static final MessageDescriptor.Arg0 WARN_WINDOWS_SERVICE_MARKED_FOR_DELETION =
          new MessageDescriptor.Arg0(BASE,"SEVERE_WARN_WINDOWS_SERVICE_MARKED_FOR_DELETION_833",TOOLS,SEVERE_WARNING,833, getClassLoader());

  /**
   * An unexpected error occurred trying to disable the server as a Windows service%nCheck that you have administrator rights (only Administrators can disable the server as a Windows Service)
   */
  public static final MessageDescriptor.Arg0 ERR_WINDOWS_SERVICE_DISABLE_ERROR =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_WINDOWS_SERVICE_DISABLE_ERROR_834",TOOLS,SEVERE_ERROR,834, getClassLoader());

  /**
   * The server is enabled as a Windows service.  The service name for the server is: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_WINDOWS_SERVICE_ENABLED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_WINDOWS_SERVICE_ENABLED_835",TOOLS,INFORMATION,835, getClassLoader());

  /**
   * The server is disabled as a Windows service
   */
  public static final MessageDescriptor.Arg0 INFO_WINDOWS_SERVICE_DISABLED =
          new MessageDescriptor.Arg0(BASE,"INFO_WINDOWS_SERVICE_DISABLED_836",TOOLS,INFORMATION,836, getClassLoader());

  /**
   * An unexpected error occurred trying to retrieve the state of the server as a Windows service
   */
  public static final MessageDescriptor.Arg0 ERR_WINDOWS_SERVICE_STATE_ERROR =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_WINDOWS_SERVICE_STATE_ERROR_837",TOOLS,SEVERE_ERROR,837, getClassLoader());

  /**
   * Used by the window service code to inform that stop-ds is being called from the window services after a call to net stop
   */
  public static final MessageDescriptor.Arg0 INFO_STOPDS_DESCRIPTION_WINDOWS_NET_STOP =
          new MessageDescriptor.Arg0(BASE,"INFO_STOPDS_DESCRIPTION_WINDOWS_NET_STOP_838",TOOLS,INFORMATION,838, getClassLoader());

  /**
   * Path to a file to which the command will write the output
   */
  public static final MessageDescriptor.Arg0 INFO_WAIT4DEL_DESCRIPTION_OUTPUT_FILE =
          new MessageDescriptor.Arg0(BASE,"INFO_WAIT4DEL_DESCRIPTION_OUTPUT_FILE_839",TOOLS,INFORMATION,839, getClassLoader());

  /**
   * WARNING:  Unable to open output file %s for writing:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_WAIT4DEL_CANNOT_OPEN_OUTPUT_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_WAIT4DEL_CANNOT_OPEN_OUTPUT_FILE_840",TOOLS,SEVERE_WARNING,840, getClassLoader());

  /**
   * Enabling the server as a Windows service...
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_ENABLING_WINDOWS_SERVICE =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_ENABLING_WINDOWS_SERVICE_841",TOOLS,INFORMATION,841, getClassLoader());

  /**
   * Enable the server to run as a Windows Service?
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_PROMPT_ENABLE_SERVICE =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_PROMPT_ENABLE_SERVICE_842",TOOLS,INFORMATION,842, getClassLoader());

  /**
   * Enable the server to run as a Windows Service
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_DESCRIPTION_ENABLE_WINDOWS_SERVICE =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_DESCRIPTION_ENABLE_WINDOWS_SERVICE_843",TOOLS,INFORMATION,843, getClassLoader());

  /**
   * Allows to disable the server service and to clean up the windows registry information associated with the provided service name
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIGURE_WINDOWS_SERVICE_DESCRIPTION_CLEANUP =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIGURE_WINDOWS_SERVICE_DESCRIPTION_CLEANUP_844",TOOLS,INFORMATION,844, getClassLoader());

  /**
   * Clean up of service %s was successful
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_WINDOWS_SERVICE_CLEANUP_SUCCESS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_WINDOWS_SERVICE_CLEANUP_SUCCESS_845",TOOLS,INFORMATION,845, getClassLoader());

  /**
   * Could not find the service with name %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_WINDOWS_SERVICE_CLEANUP_NOT_FOUND =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_WINDOWS_SERVICE_CLEANUP_NOT_FOUND_846",TOOLS,SEVERE_ERROR,846, getClassLoader());

  /**
   * Service %s has been marked for deletion
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_WINDOWS_SERVICE_CLEANUP_MARKED_FOR_DELETION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_WINDOWS_SERVICE_CLEANUP_MARKED_FOR_DELETION_847",TOOLS,SEVERE_WARNING,847, getClassLoader());

  /**
   * An unexpected error occurred cleaning up the service %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_WINDOWS_SERVICE_CLEANUP_ERROR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_WINDOWS_SERVICE_CLEANUP_ERROR_848",TOOLS,SEVERE_ERROR,848, getClassLoader());

  /**
   * This utility can be used to rebuild index data within a backend based on the Berkeley DB Java Edition
   */
  public static final MessageDescriptor.Arg0 INFO_REBUILDINDEX_TOOL_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_REBUILDINDEX_TOOL_DESCRIPTION_849",TOOLS,INFORMATION,849, getClassLoader());

  /**
   * Base DN of a backend supporting indexing. Rebuild is performed on indexes within the scope of the given base DN
   */
  public static final MessageDescriptor.Arg0 INFO_REBUILDINDEX_DESCRIPTION_BASE_DN =
          new MessageDescriptor.Arg0(BASE,"INFO_REBUILDINDEX_DESCRIPTION_BASE_DN_850",TOOLS,INFORMATION,850, getClassLoader());

  /**
   * Names of index(es) to rebuild. For an attribute index this is simply an attribute name.  At least one index must be specified for rebuild. Cannot be used with the "--rebuildAll" option
   */
  public static final MessageDescriptor.Arg0 INFO_REBUILDINDEX_DESCRIPTION_INDEX_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_REBUILDINDEX_DESCRIPTION_INDEX_NAME_851",TOOLS,INFORMATION,851, getClassLoader());

  /**
   * An error occurred while attempting to perform index rebuild:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_REBUILDINDEX_ERROR_DURING_REBUILD =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_REBUILDINDEX_ERROR_DURING_REBUILD_852",TOOLS,SEVERE_ERROR,852, getClassLoader());

  /**
   * The backend does not support rebuilding of indexes
   */
  public static final MessageDescriptor.Arg0 ERR_REBUILDINDEX_WRONG_BACKEND_TYPE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_REBUILDINDEX_WRONG_BACKEND_TYPE_853",TOOLS,SEVERE_ERROR,853, getClassLoader());

  /**
   * At least one index must be specified for the rebuild process
   */
  public static final MessageDescriptor.Arg0 ERR_REBUILDINDEX_REQUIRES_AT_LEAST_ONE_INDEX =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_REBUILDINDEX_REQUIRES_AT_LEAST_ONE_INDEX_854",TOOLS,SEVERE_ERROR,854, getClassLoader());

  /**
   * An error occurred while attempting to acquire a exclusive lock for backend %s:  %s.  This generally means that some other process has an lock on this backend or the server is running with this backend online. The rebuild process cannot continue
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_REBUILDINDEX_CANNOT_EXCLUSIVE_LOCK_BACKEND =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_REBUILDINDEX_CANNOT_EXCLUSIVE_LOCK_BACKEND_855",TOOLS,SEVERE_ERROR,855, getClassLoader());

  /**
   * An error occurred while attempting to release the shared lock for backend %s:  %s.  This lock should automatically be cleared when the rebuild process exits, so no further action should be required
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_REBUILDINDEX_CANNOT_UNLOCK_BACKEND =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_REBUILDINDEX_CANNOT_UNLOCK_BACKEND_856",TOOLS,SEVERE_WARNING,856, getClassLoader());

  /**
   * An error occurred while attempting to acquire a shared lock for backend %s:  %s.  This generally means that some other process has an exclusive lock on this backend (e.g., an LDIF import or a restore). The rebuild process cannot continue
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_REBUILDINDEX_CANNOT_SHARED_LOCK_BACKEND =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_REBUILDINDEX_CANNOT_SHARED_LOCK_BACKEND_857",TOOLS,SEVERE_ERROR,857, getClassLoader());

  /**
   * Port on which the Directory Server should listen for LDAPS communication
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIGDS_DESCRIPTION_LDAPS_PORT =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIGDS_DESCRIPTION_LDAPS_PORT_858",TOOLS,INFORMATION,858, getClassLoader());

  /**
   * An error occurred while attempting to update the port on which to listen for LDAPS communication:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIGDS_CANNOT_UPDATE_LDAPS_PORT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIGDS_CANNOT_UPDATE_LDAPS_PORT_859",TOOLS,SEVERE_ERROR,859, getClassLoader());

  /**
   * Specifies whether to enable or not StartTLS
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIGDS_DESCRIPTION_ENABLE_START_TLS =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIGDS_DESCRIPTION_ENABLE_START_TLS_860",TOOLS,INFORMATION,860, getClassLoader());

  /**
   * DN of the key manager provider to use for SSL and/or StartTLS
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIGDS_DESCRIPTION_KEYMANAGER_PROVIDER_DN =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIGDS_DESCRIPTION_KEYMANAGER_PROVIDER_DN_861",TOOLS,INFORMATION,861, getClassLoader());

  /**
   * DN of the trust manager provider to use for SSL and/or StartTLS
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIGDS_DESCRIPTION_TRUSTMANAGER_PROVIDER_DN =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIGDS_DESCRIPTION_TRUSTMANAGER_PROVIDER_DN_862",TOOLS,INFORMATION,862, getClassLoader());

  /**
   * An error occurred while attempting to parse key manager provider DN value "%s" as a DN:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIGDS_CANNOT_PARSE_KEYMANAGER_PROVIDER_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIGDS_CANNOT_PARSE_KEYMANAGER_PROVIDER_DN_863",TOOLS,SEVERE_ERROR,863, getClassLoader());

  /**
   * An error occurred while attempting to parse trust manager provider DN value "%s" as a DN:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIGDS_CANNOT_PARSE_TRUSTMANAGER_PROVIDER_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIGDS_CANNOT_PARSE_TRUSTMANAGER_PROVIDER_DN_864",TOOLS,SEVERE_ERROR,864, getClassLoader());

  /**
   * An error occurred while attempting to enable StartTLS: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIGDS_CANNOT_ENABLE_STARTTLS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIGDS_CANNOT_ENABLE_STARTTLS_865",TOOLS,SEVERE_ERROR,865, getClassLoader());

  /**
   * An error occurred while attempting to enable key manager provider entry: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIGDS_CANNOT_ENABLE_KEYMANAGER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIGDS_CANNOT_ENABLE_KEYMANAGER_866",TOOLS,SEVERE_ERROR,866, getClassLoader());

  /**
   * An error occurred while attempting to enable trust manager provider entry: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIGDS_CANNOT_ENABLE_TRUSTMANAGER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIGDS_CANNOT_ENABLE_TRUSTMANAGER_867",TOOLS,SEVERE_ERROR,867, getClassLoader());

  /**
   * An error occurred while attempting to update the key manager provider DN used for LDAPS communication: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIGDS_CANNOT_UPDATE_KEYMANAGER_REFERENCE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIGDS_CANNOT_UPDATE_KEYMANAGER_REFERENCE_868",TOOLS,SEVERE_ERROR,868, getClassLoader());

  /**
   * An error occurred while attempting to update the trust manager provider DN used for LDAPS communication: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIGDS_CANNOT_UPDATE_TRUSTMANAGER_REFERENCE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIGDS_CANNOT_UPDATE_TRUSTMANAGER_REFERENCE_869",TOOLS,SEVERE_ERROR,869, getClassLoader());

  /**
   * Path of the key store to be used by the key manager provider
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIGDS_DESCRIPTION_KEYMANAGER_PATH =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIGDS_DESCRIPTION_KEYMANAGER_PATH_870",TOOLS,INFORMATION,870, getClassLoader());

  /**
   * Nickname of the certificate that the connection handler should use when accepting SSL-based connections or performing StartTLS negotiation
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIGDS_DESCRIPTION_CERTNICKNAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIGDS_DESCRIPTION_CERTNICKNAME_871",TOOLS,INFORMATION,871, getClassLoader());

  /**
   * ERROR:  You must provide the %s argument when providing the %s argument
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIGDS_KEYMANAGER_PROVIDER_DN_REQUIRED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIGDS_KEYMANAGER_PROVIDER_DN_REQUIRED_872",TOOLS,SEVERE_ERROR,872, getClassLoader());

  /**
   * An error occurred while attempting to update the nickname of the certificate that the connection handler should use when accepting SSL-based connections or performing StartTLS negotiation: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIGDS_CANNOT_UPDATE_CERT_NICKNAME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIGDS_CANNOT_UPDATE_CERT_NICKNAME_873",TOOLS,SEVERE_ERROR,873, getClassLoader());

  /**
   * LDIF file containing the changes to apply
   */
  public static final MessageDescriptor.Arg0 INFO_LDAPMODIFY_DESCRIPTION_FILENAME =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAPMODIFY_DESCRIPTION_FILENAME_874",TOOLS,INFORMATION,874, getClassLoader());

  /**
   * The parent template %s referenced on line %d for template %s is invalid because the referenced parent template is not defined before the template that extends it
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,CharSequence> ERR_MAKELDIF_TEMPLATE_INVALID_PARENT_TEMPLATE =
          new MessageDescriptor.Arg3<CharSequence,Number,CharSequence>(BASE,"MILD_ERR_MAKELDIF_TEMPLATE_INVALID_PARENT_TEMPLATE_875",TOOLS,MILD_ERROR,875, getClassLoader());

  /**
   * Sort the results using the provided sort order
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_SORT_ORDER =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_SORT_ORDER_876",TOOLS,INFORMATION,876, getClassLoader());

  /**
   * The provided sort order was invalid:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_SORTCONTROL_INVALID_ORDER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_SORTCONTROL_INVALID_ORDER_877",TOOLS,MILD_ERROR,877, getClassLoader());

  /**
   * Use the virtual list view control to retrieve the specified results page
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_VLV =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_VLV_878",TOOLS,INFORMATION,878, getClassLoader());

  /**
   * If the --%s argument is provided, then the --%s argument must also be given
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAPSEARCH_VLV_REQUIRES_SORT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_LDAPSEARCH_VLV_REQUIRES_SORT_879",TOOLS,MILD_ERROR,879, getClassLoader());

  /**
   * The provided virtual list view descriptor was invalid.  It must be a value in the form 'beforeCount:afterCount:offset:contentCount' (where offset specifies the index of the target entry and contentCount specifies the estimated total number of results or zero if it is not known), or 'beforeCount:afterCount:assertionValue' (where the entry should be the first entry whose primary sort value is greater than or equal to the provided assertionValue).  In either case, beforeCount is the number of entries to return before the target value and afterCount is the number of entries to return after the target value
   */
  public static final MessageDescriptor.Arg0 ERR_LDAPSEARCH_VLV_INVALID_DESCRIPTOR =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_LDAPSEARCH_VLV_INVALID_DESCRIPTOR_880",TOOLS,MILD_ERROR,880, getClassLoader());

  /**
   * # Server-side sort failed:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_LDAPSEARCH_SORT_ERROR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_LDAPSEARCH_SORT_ERROR_881",TOOLS,SEVERE_WARNING,881, getClassLoader());

  /**
   * # Unable to decode the server-side sort response:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_LDAPSEARCH_CANNOT_DECODE_SORT_RESPONSE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_LDAPSEARCH_CANNOT_DECODE_SORT_RESPONSE_882",TOOLS,SEVERE_WARNING,882, getClassLoader());

  /**
   * # VLV Target Offset:  %d
   */
  public static final MessageDescriptor.Arg1<Number> INFO_LDAPSEARCH_VLV_TARGET_OFFSET =
          new MessageDescriptor.Arg1<Number>(BASE,"INFO_LDAPSEARCH_VLV_TARGET_OFFSET_883",TOOLS,INFORMATION,883, getClassLoader());

  /**
   * # VLV Content Count:  %d
   */
  public static final MessageDescriptor.Arg1<Number> INFO_LDAPSEARCH_VLV_CONTENT_COUNT =
          new MessageDescriptor.Arg1<Number>(BASE,"INFO_LDAPSEARCH_VLV_CONTENT_COUNT_884",TOOLS,INFORMATION,884, getClassLoader());

  /**
   * # Virtual list view processing failed: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_LDAPSEARCH_VLV_ERROR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_LDAPSEARCH_VLV_ERROR_885",TOOLS,SEVERE_WARNING,885, getClassLoader());

  /**
   * # Unable to decode the virtual list view response:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_LDAPSEARCH_CANNOT_DECODE_VLV_RESPONSE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_LDAPSEARCH_CANNOT_DECODE_VLV_RESPONSE_886",TOOLS,SEVERE_WARNING,886, getClassLoader());

  /**
   * The specified LDIF file %s cannot be read
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIFIMPORT_CANNOT_READ_FILE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDIFIMPORT_CANNOT_READ_FILE_887",TOOLS,SEVERE_ERROR,887, getClassLoader());

  /**
   * Use geteffectiverights control with the provided authzid
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_EFFECTIVERIGHTS_USER =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_EFFECTIVERIGHTS_USER_888",TOOLS,INFORMATION,888, getClassLoader());

  /**
   * Specifies geteffectiverights control specific attribute list
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_EFFECTIVERIGHTS_ATTR =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_EFFECTIVERIGHTS_ATTR_889",TOOLS,INFORMATION,889, getClassLoader());

  /**
   * The authorization ID "%s" contained in the geteffectiverights control is invalid because it does not start with "dn:" to indicate a user DN
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_EFFECTIVERIGHTS_INVALID_AUTHZID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_EFFECTIVERIGHTS_INVALID_AUTHZID_890",TOOLS,MILD_ERROR,890, getClassLoader());

  /**
   * Display Directory Server version information
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PRODUCT_VERSION =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PRODUCT_VERSION_891",TOOLS,INFORMATION,891, getClassLoader());

  /**
   * Use quiet mode
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_QUIET =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_QUIET_1075",TOOLS,INFORMATION,1075, getClassLoader());

  /**
   * Use script-friendly mode
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_SCRIPT_FRIENDLY =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_SCRIPT_FRIENDLY_1076",TOOLS,INFORMATION,1076, getClassLoader());

  /**
   * Use non-interactive mode.  If data in the command is missing, the user is not prompted and the tool will fail
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_NO_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_NO_PROMPT_1077",TOOLS,INFORMATION,1077, getClassLoader());

  /**
   * This utility can be used to retrieve and manipulate the values of password policy state variables
   */
  public static final MessageDescriptor.Arg0 INFO_PWPSTATE_TOOL_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPSTATE_TOOL_DESCRIPTION_1094",TOOLS,INFORMATION,1094, getClassLoader());

  /**
   * Directory server hostname or IP address
   */
  public static final MessageDescriptor.Arg0 INFO_PWPSTATE_DESCRIPTION_HOST =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPSTATE_DESCRIPTION_HOST_1095",TOOLS,INFORMATION,1095, getClassLoader());

  /**
   * Directory server administration port number
   */
  public static final MessageDescriptor.Arg0 INFO_PWPSTATE_DESCRIPTION_PORT =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPSTATE_DESCRIPTION_PORT_1096",TOOLS,INFORMATION,1096, getClassLoader());

  /**
   * Use SSL for secure communication with the server
   */
  public static final MessageDescriptor.Arg0 INFO_PWPSTATE_DESCRIPTION_USESSL =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPSTATE_DESCRIPTION_USESSL_1097",TOOLS,INFORMATION,1097, getClassLoader());

  /**
   * Use StartTLS to secure communication with the server
   */
  public static final MessageDescriptor.Arg0 INFO_PWPSTATE_DESCRIPTION_USESTARTTLS =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPSTATE_DESCRIPTION_USESTARTTLS_1098",TOOLS,INFORMATION,1098, getClassLoader());

  /**
   * The DN to use to bind to the server
   */
  public static final MessageDescriptor.Arg0 INFO_PWPSTATE_DESCRIPTION_BINDDN =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPSTATE_DESCRIPTION_BINDDN_1099",TOOLS,INFORMATION,1099, getClassLoader());

  /**
   * The password to use to bind to the server
   */
  public static final MessageDescriptor.Arg0 INFO_PWPSTATE_DESCRIPTION_BINDPW =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPSTATE_DESCRIPTION_BINDPW_1100",TOOLS,INFORMATION,1100, getClassLoader());

  /**
   * The path to the file containing the bind password
   */
  public static final MessageDescriptor.Arg0 INFO_PWPSTATE_DESCRIPTION_BINDPWFILE =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPSTATE_DESCRIPTION_BINDPWFILE_1101",TOOLS,INFORMATION,1101, getClassLoader());

  /**
   * The DN of the user entry for which to get and set password policy state information
   */
  public static final MessageDescriptor.Arg0 INFO_PWPSTATE_DESCRIPTION_TARGETDN =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPSTATE_DESCRIPTION_TARGETDN_1102",TOOLS,INFORMATION,1102, getClassLoader());

  /**
   * SASL bind options
   */
  public static final MessageDescriptor.Arg0 INFO_PWPSTATE_DESCRIPTION_SASLOPTIONS =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPSTATE_DESCRIPTION_SASLOPTIONS_1103",TOOLS,INFORMATION,1103, getClassLoader());

  /**
   * Trust all server SSL certificates
   */
  public static final MessageDescriptor.Arg0 INFO_PWPSTATE_DESCRIPTION_TRUST_ALL =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPSTATE_DESCRIPTION_TRUST_ALL_1104",TOOLS,INFORMATION,1104, getClassLoader());

  /**
   * Certificate key store path
   */
  public static final MessageDescriptor.Arg0 INFO_PWPSTATE_DESCRIPTION_KSFILE =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPSTATE_DESCRIPTION_KSFILE_1105",TOOLS,INFORMATION,1105, getClassLoader());

  /**
   * Certificate key store PIN
   */
  public static final MessageDescriptor.Arg0 INFO_PWPSTATE_DESCRIPTION_KSPW =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPSTATE_DESCRIPTION_KSPW_1106",TOOLS,INFORMATION,1106, getClassLoader());

  /**
   * Certificate key store PIN file
   */
  public static final MessageDescriptor.Arg0 INFO_PWPSTATE_DESCRIPTION_KSPWFILE =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPSTATE_DESCRIPTION_KSPWFILE_1107",TOOLS,INFORMATION,1107, getClassLoader());

  /**
   * Certificate trust store path
   */
  public static final MessageDescriptor.Arg0 INFO_PWPSTATE_DESCRIPTION_TSFILE =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPSTATE_DESCRIPTION_TSFILE_1108",TOOLS,INFORMATION,1108, getClassLoader());

  /**
   * Certificate trust store PIN
   */
  public static final MessageDescriptor.Arg0 INFO_PWPSTATE_DESCRIPTION_TSPW =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPSTATE_DESCRIPTION_TSPW_1109",TOOLS,INFORMATION,1109, getClassLoader());

  /**
   * Certificate trust store PIN file
   */
  public static final MessageDescriptor.Arg0 INFO_PWPSTATE_DESCRIPTION_TSPWFILE =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPSTATE_DESCRIPTION_TSPWFILE_1110",TOOLS,INFORMATION,1110, getClassLoader());

  /**
   * Display this usage information
   */
  public static final MessageDescriptor.Arg0 INFO_PWPSTATE_DESCRIPTION_SHOWUSAGE =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPSTATE_DESCRIPTION_SHOWUSAGE_1111",TOOLS,INFORMATION,1111, getClassLoader());

  /**
   * Display all password policy state information for the user
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PWPSTATE_GET_ALL =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PWPSTATE_GET_ALL_1112",TOOLS,INFORMATION,1112, getClassLoader());

  /**
   * Display the DN of the password policy for the user
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PWPSTATE_GET_PASSWORD_POLICY_DN =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PWPSTATE_GET_PASSWORD_POLICY_DN_1113",TOOLS,INFORMATION,1113, getClassLoader());

  /**
   * Display information about whether the user account has been administratively disabled
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PWPSTATE_GET_ACCOUNT_DISABLED_STATE =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PWPSTATE_GET_ACCOUNT_DISABLED_STATE_1114",TOOLS,INFORMATION,1114, getClassLoader());

  /**
   * Specify whether the user account has been administratively disabled
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PWPSTATE_SET_ACCOUNT_DISABLED_STATE =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PWPSTATE_SET_ACCOUNT_DISABLED_STATE_1115",TOOLS,INFORMATION,1115, getClassLoader());

  /**
   * 'true' to indicate that the account is disabled, or 'false' to indicate that it is not disabled
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_OPERATION_BOOLEAN_VALUE =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_OPERATION_BOOLEAN_VALUE_1116",TOOLS,INFORMATION,1116, getClassLoader());

  /**
   * Clear account disabled state information from the user account
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PWPSTATE_CLEAR_ACCOUNT_DISABLED_STATE =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PWPSTATE_CLEAR_ACCOUNT_DISABLED_STATE_1117",TOOLS,INFORMATION,1117, getClassLoader());

  /**
   * Display when the user account will expire
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PWPSTATE_GET_ACCOUNT_EXPIRATION_TIME =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PWPSTATE_GET_ACCOUNT_EXPIRATION_TIME_1118",TOOLS,INFORMATION,1118, getClassLoader());

  /**
   * Specify when the user account will expire
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PWPSTATE_SET_ACCOUNT_EXPIRATION_TIME =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PWPSTATE_SET_ACCOUNT_EXPIRATION_TIME_1119",TOOLS,INFORMATION,1119, getClassLoader());

  /**
   * A timestamp value using the generalized time syntax
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_OPERATION_TIME_VALUE =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_OPERATION_TIME_VALUE_1120",TOOLS,INFORMATION,1120, getClassLoader());

  /**
   * Clear account expiration time information from the user account
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PWPSTATE_CLEAR_ACCOUNT_EXPIRATION_TIME =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PWPSTATE_CLEAR_ACCOUNT_EXPIRATION_TIME_1121",TOOLS,INFORMATION,1121, getClassLoader());

  /**
   * Display the length of time in seconds until the user account expires
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PWPSTATE_GET_SECONDS_UNTIL_ACCOUNT_EXPIRATION =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PWPSTATE_GET_SECONDS_UNTIL_ACCOUNT_EXPIRATION_1122",TOOLS,INFORMATION,1122, getClassLoader());

  /**
   * Display the time that the user's password was last changed
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PWPSTATE_GET_PASSWORD_CHANGED_TIME =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PWPSTATE_GET_PASSWORD_CHANGED_TIME_1123",TOOLS,INFORMATION,1123, getClassLoader());

  /**
   * Specify the time that the user's password was last changed.  This should be used only for testing purposes
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PWPSTATE_SET_PASSWORD_CHANGED_TIME =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PWPSTATE_SET_PASSWORD_CHANGED_TIME_1124",TOOLS,INFORMATION,1124, getClassLoader());

  /**
   * Clear information about the time that the user's password was last changed.  This should be used only for testing purposes
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PWPSTATE_CLEAR_PASSWORD_CHANGED_TIME =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PWPSTATE_CLEAR_PASSWORD_CHANGED_TIME_1125",TOOLS,INFORMATION,1125, getClassLoader());

  /**
   * Display the time that the user first received an expiration warning notice
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PWPSTATE_GET_PASSWORD_EXPIRATION_WARNED_TIME =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PWPSTATE_GET_PASSWORD_EXPIRATION_WARNED_TIME_1126",TOOLS,INFORMATION,1126, getClassLoader());

  /**
   * Specify the time that the user first received an expiration warning notice.  This should be used only for testing purposes
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PWPSTATE_SET_PASSWORD_EXPIRATION_WARNED_TIME =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PWPSTATE_SET_PASSWORD_EXPIRATION_WARNED_TIME_1127",TOOLS,INFORMATION,1127, getClassLoader());

  /**
   * Clear information about the time that the user first received an expiration warning notice.  This should be used only for testing purposes
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PWPSTATE_CLEAR_PASSWORD_EXPIRATION_WARNED_TIME =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PWPSTATE_CLEAR_PASSWORD_EXPIRATION_WARNED_TIME_1128",TOOLS,INFORMATION,1128, getClassLoader());

  /**
   * Display length of time in seconds until the user's password expires
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PWPSTATE_GET_SECONDS_UNTIL_PASSWORD_EXP =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PWPSTATE_GET_SECONDS_UNTIL_PASSWORD_EXP_1129",TOOLS,INFORMATION,1129, getClassLoader());

  /**
   * Display the length of time in seconds until the user should start receiving password expiration warning notices
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PWPSTATE_GET_SECONDS_UNTIL_PASSWORD_EXP_WARNING =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PWPSTATE_GET_SECONDS_UNTIL_PASSWORD_EXP_WARNING_1130",TOOLS,INFORMATION,1130, getClassLoader());

  /**
   * Display the authentication failure times for the user
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PWPSTATE_GET_AUTH_FAILURE_TIMES =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PWPSTATE_GET_AUTH_FAILURE_TIMES_1131",TOOLS,INFORMATION,1131, getClassLoader());

  /**
   * Add an authentication failure time to the user account.  This should be used only for testing purposes
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PWPSTATE_ADD_AUTH_FAILURE_TIME =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PWPSTATE_ADD_AUTH_FAILURE_TIME_1132",TOOLS,INFORMATION,1132, getClassLoader());

  /**
   * Specify the authentication failure times for the user.  This should be used only for testing purposes
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PWPSTATE_SET_AUTH_FAILURE_TIMES =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PWPSTATE_SET_AUTH_FAILURE_TIMES_1133",TOOLS,INFORMATION,1133, getClassLoader());

  /**
   * A timestamp value using the generalized time syntax.  Multiple timestamp values may be given by providing this argument multiple times
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_OPERATION_TIME_VALUES =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_OPERATION_TIME_VALUES_1134",TOOLS,INFORMATION,1134, getClassLoader());

  /**
   * Clear authentication failure time information from the user's account.  This should be used only for testing purposes
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PWPSTATE_CLEAR_AUTH_FAILURE_TIMES =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PWPSTATE_CLEAR_AUTH_FAILURE_TIMES_1135",TOOLS,INFORMATION,1135, getClassLoader());

  /**
   * Display the length of time in seconds until the authentication failure lockout expires
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PWPSTATE_GET_SECONDS_UNTIL_AUTH_FAILURE_UNLOCK =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PWPSTATE_GET_SECONDS_UNTIL_AUTH_FAILURE_UNLOCK_1136",TOOLS,INFORMATION,1136, getClassLoader());

  /**
   * Display the number of remaining authentication failures until the user's account is locked
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PWPSTATE_GET_REMAINING_AUTH_FAILURE_COUNT =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PWPSTATE_GET_REMAINING_AUTH_FAILURE_COUNT_1137",TOOLS,INFORMATION,1137, getClassLoader());

  /**
   * Display the time that the user last authenticated to the server
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PWPSTATE_GET_LAST_LOGIN_TIME =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PWPSTATE_GET_LAST_LOGIN_TIME_1138",TOOLS,INFORMATION,1138, getClassLoader());

  /**
   * Specify the time that the user last authenticated to the server.  This should be used only for testing purposes
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PWPSTATE_SET_LAST_LOGIN_TIME =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PWPSTATE_SET_LAST_LOGIN_TIME_1139",TOOLS,INFORMATION,1139, getClassLoader());

  /**
   * Clear the time that the user last authenticated to the server.  This should be used only for testing purposes
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PWPSTATE_CLEAR_LAST_LOGIN_TIME =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PWPSTATE_CLEAR_LAST_LOGIN_TIME_1140",TOOLS,INFORMATION,1140, getClassLoader());

  /**
   * Display the length of time in seconds until user's account is locked because it has remained idle for too long
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PWPSTATE_GET_SECONDS_UNTIL_IDLE_LOCKOUT =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PWPSTATE_GET_SECONDS_UNTIL_IDLE_LOCKOUT_1141",TOOLS,INFORMATION,1141, getClassLoader());

  /**
   * Display information about whether the user will be required to change his or her password on the next successful authentication
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PWPSTATE_GET_PASSWORD_RESET_STATE =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PWPSTATE_GET_PASSWORD_RESET_STATE_1142",TOOLS,INFORMATION,1142, getClassLoader());

  /**
   * Specify whether the user will be required to change his or her password on the next successful authentication.  This should be used only for testing purposes
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PWPSTATE_SET_PASSWORD_RESET_STATE =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PWPSTATE_SET_PASSWORD_RESET_STATE_1143",TOOLS,INFORMATION,1143, getClassLoader());

  /**
   * Clear information about whether the user will be required to change his or her password on the next successful authentication.  This should be used only for testing purposes
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PWPSTATE_CLEAR_PASSWORD_RESET_STATE =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PWPSTATE_CLEAR_PASSWORD_RESET_STATE_1144",TOOLS,INFORMATION,1144, getClassLoader());

  /**
   * Display the length of time in seconds until user's account is locked because the user failed to change the password in a timely manner after an administrative reset
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PWPSTATE_GET_SECONDS_UNTIL_RESET_LOCKOUT =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PWPSTATE_GET_SECONDS_UNTIL_RESET_LOCKOUT_1145",TOOLS,INFORMATION,1145, getClassLoader());

  /**
   * Display the grace login use times for the user
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PWPSTATE_GET_GRACE_LOGIN_USE_TIMES =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PWPSTATE_GET_GRACE_LOGIN_USE_TIMES_1146",TOOLS,INFORMATION,1146, getClassLoader());

  /**
   * Add a grace login use time to the user account.  This should be used only for testing purposes
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PWPSTATE_ADD_GRACE_LOGIN_USE_TIME =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PWPSTATE_ADD_GRACE_LOGIN_USE_TIME_1147",TOOLS,INFORMATION,1147, getClassLoader());

  /**
   * Specify the grace login use times for the user.  This should be used only for testing purposes
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PWPSTATE_SET_GRACE_LOGIN_USE_TIMES =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PWPSTATE_SET_GRACE_LOGIN_USE_TIMES_1148",TOOLS,INFORMATION,1148, getClassLoader());

  /**
   * Clear the set of grace login use times for the user.  This should be used only for testing purposes
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PWPSTATE_CLEAR_GRACE_LOGIN_USE_TIMES =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PWPSTATE_CLEAR_GRACE_LOGIN_USE_TIMES_1149",TOOLS,INFORMATION,1149, getClassLoader());

  /**
   * Display the number of grace logins remaining for the user
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PWPSTATE_GET_REMAINING_GRACE_LOGIN_COUNT =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PWPSTATE_GET_REMAINING_GRACE_LOGIN_COUNT_1150",TOOLS,INFORMATION,1150, getClassLoader());

  /**
   * Display the required password change time with which the user last complied
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PWPSTATE_GET_PW_CHANGED_BY_REQUIRED_TIME =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PWPSTATE_GET_PW_CHANGED_BY_REQUIRED_TIME_1151",TOOLS,INFORMATION,1151, getClassLoader());

  /**
   * Specify the required password change time with which the user last complied.  This should be used only for testing purposes
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PWPSTATE_SET_PW_CHANGED_BY_REQUIRED_TIME =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PWPSTATE_SET_PW_CHANGED_BY_REQUIRED_TIME_1152",TOOLS,INFORMATION,1152, getClassLoader());

  /**
   * Clear information about the required password change time with which the user last complied.  This should be used only for testing purposes
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PWPSTATE_CLEAR_PW_CHANGED_BY_REQUIRED_TIME =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PWPSTATE_CLEAR_PW_CHANGED_BY_REQUIRED_TIME_1153",TOOLS,INFORMATION,1153, getClassLoader());

  /**
   * Display the length of time in seconds that the user has remaining to change his or her password before the account becomes locked due to the required change time
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PWPSTATE_GET_SECONDS_UNTIL_REQUIRED_CHANGE_TIME =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PWPSTATE_GET_SECONDS_UNTIL_REQUIRED_CHANGE_TIME_1154",TOOLS,INFORMATION,1154, getClassLoader());

  /**
   * No subcommand was provided to indicate which password policy state operation should be performed
   */
  public static final MessageDescriptor.Arg0 ERR_PWPSTATE_NO_SUBCOMMAND =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_PWPSTATE_NO_SUBCOMMAND_1155",TOOLS,SEVERE_ERROR,1155, getClassLoader());

  /**
   * The provided value '%s' was invalid for the requested operation.  A Boolean value of either 'true' or 'false' was expected
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PWPSTATE_INVALID_BOOLEAN_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PWPSTATE_INVALID_BOOLEAN_VALUE_1156",TOOLS,SEVERE_ERROR,1156, getClassLoader());

  /**
   * No value was specified, but the requested operation requires a Boolean value of either 'true' or 'false'
   */
  public static final MessageDescriptor.Arg0 ERR_PWPSTATE_NO_BOOLEAN_VALUE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_PWPSTATE_NO_BOOLEAN_VALUE_1157",TOOLS,SEVERE_ERROR,1157, getClassLoader());

  /**
   * Unrecognized subcommand '%s'
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PWPSTATE_INVALID_SUBCOMMAND =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PWPSTATE_INVALID_SUBCOMMAND_1158",TOOLS,SEVERE_ERROR,1158, getClassLoader());

  /**
   * An error occurred while attempting to send the request to the server:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PWPSTATE_CANNOT_SEND_REQUEST_EXTOP =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PWPSTATE_CANNOT_SEND_REQUEST_EXTOP_1159",TOOLS,SEVERE_ERROR,1159, getClassLoader());

  /**
   * The Directory Server closed the connection before the response could be read
   */
  public static final MessageDescriptor.Arg0 ERR_PWPSTATE_CONNECTION_CLOSED_READING_RESPONSE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_PWPSTATE_CONNECTION_CLOSED_READING_RESPONSE_1160",TOOLS,SEVERE_ERROR,1160, getClassLoader());

  /**
   * The server was unable to process the request:  result code %d (%s), error message '%s'
   */
  public static final MessageDescriptor.Arg3<Number,CharSequence,CharSequence> ERR_PWPSTATE_REQUEST_FAILED =
          new MessageDescriptor.Arg3<Number,CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPSTATE_REQUEST_FAILED_1161",TOOLS,SEVERE_ERROR,1161, getClassLoader());

  /**
   * The server was unable to decode the response message from the server:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PWPSTATE_CANNOT_DECODE_RESPONSE_MESSAGE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PWPSTATE_CANNOT_DECODE_RESPONSE_MESSAGE_1162",TOOLS,SEVERE_ERROR,1162, getClassLoader());

  /**
   * Unable to decode information about an operation contained in the response:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PWPSTATE_CANNOT_DECODE_RESPONSE_OP =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PWPSTATE_CANNOT_DECODE_RESPONSE_OP_1163",TOOLS,SEVERE_ERROR,1163, getClassLoader());

  /**
   * Password Policy DN
   */
  public static final MessageDescriptor.Arg0 INFO_PWPSTATE_LABEL_PASSWORD_POLICY_DN =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPSTATE_LABEL_PASSWORD_POLICY_DN_1164",TOOLS,INFORMATION,1164, getClassLoader());

  /**
   * Account Is Disabled
   */
  public static final MessageDescriptor.Arg0 INFO_PWPSTATE_LABEL_ACCOUNT_DISABLED_STATE =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPSTATE_LABEL_ACCOUNT_DISABLED_STATE_1165",TOOLS,INFORMATION,1165, getClassLoader());

  /**
   * Account Expiration Time
   */
  public static final MessageDescriptor.Arg0 INFO_PWPSTATE_LABEL_ACCOUNT_EXPIRATION_TIME =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPSTATE_LABEL_ACCOUNT_EXPIRATION_TIME_1166",TOOLS,INFORMATION,1166, getClassLoader());

  /**
   * Seconds Until Account Expiration
   */
  public static final MessageDescriptor.Arg0 INFO_PWPSTATE_LABEL_SECONDS_UNTIL_ACCOUNT_EXPIRATION =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPSTATE_LABEL_SECONDS_UNTIL_ACCOUNT_EXPIRATION_1167",TOOLS,INFORMATION,1167, getClassLoader());

  /**
   * Password Changed Time
   */
  public static final MessageDescriptor.Arg0 INFO_PWPSTATE_LABEL_PASSWORD_CHANGED_TIME =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPSTATE_LABEL_PASSWORD_CHANGED_TIME_1168",TOOLS,INFORMATION,1168, getClassLoader());

  /**
   * Password Expiration Warned Time
   */
  public static final MessageDescriptor.Arg0 INFO_PWPSTATE_LABEL_PASSWORD_EXPIRATION_WARNED_TIME =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPSTATE_LABEL_PASSWORD_EXPIRATION_WARNED_TIME_1169",TOOLS,INFORMATION,1169, getClassLoader());

  /**
   * Seconds Until Password Expiration
   */
  public static final MessageDescriptor.Arg0 INFO_PWPSTATE_LABEL_SECONDS_UNTIL_PASSWORD_EXPIRATION =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPSTATE_LABEL_SECONDS_UNTIL_PASSWORD_EXPIRATION_1170",TOOLS,INFORMATION,1170, getClassLoader());

  /**
   * Seconds Until Password Expiration Warning
   */
  public static final MessageDescriptor.Arg0 INFO_PWPSTATE_LABEL_SECONDS_UNTIL_PASSWORD_EXPIRATION_WARNING =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPSTATE_LABEL_SECONDS_UNTIL_PASSWORD_EXPIRATION_WARNING_1171",TOOLS,INFORMATION,1171, getClassLoader());

  /**
   * Authentication Failure Times
   */
  public static final MessageDescriptor.Arg0 INFO_PWPSTATE_LABEL_AUTH_FAILURE_TIMES =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPSTATE_LABEL_AUTH_FAILURE_TIMES_1172",TOOLS,INFORMATION,1172, getClassLoader());

  /**
   * Seconds Until Authentication Failure Unlock
   */
  public static final MessageDescriptor.Arg0 INFO_PWPSTATE_LABEL_SECONDS_UNTIL_AUTH_FAILURE_UNLOCK =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPSTATE_LABEL_SECONDS_UNTIL_AUTH_FAILURE_UNLOCK_1173",TOOLS,INFORMATION,1173, getClassLoader());

  /**
   * Remaining Authentication Failure Count
   */
  public static final MessageDescriptor.Arg0 INFO_PWPSTATE_LABEL_REMAINING_AUTH_FAILURE_COUNT =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPSTATE_LABEL_REMAINING_AUTH_FAILURE_COUNT_1174",TOOLS,INFORMATION,1174, getClassLoader());

  /**
   * Last Login Time
   */
  public static final MessageDescriptor.Arg0 INFO_PWPSTATE_LABEL_LAST_LOGIN_TIME =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPSTATE_LABEL_LAST_LOGIN_TIME_1175",TOOLS,INFORMATION,1175, getClassLoader());

  /**
   * Seconds Until Idle Account Lockout
   */
  public static final MessageDescriptor.Arg0 INFO_PWPSTATE_LABEL_SECONDS_UNTIL_IDLE_LOCKOUT =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPSTATE_LABEL_SECONDS_UNTIL_IDLE_LOCKOUT_1176",TOOLS,INFORMATION,1176, getClassLoader());

  /**
   * Password Is Reset
   */
  public static final MessageDescriptor.Arg0 INFO_PWPSTATE_LABEL_PASSWORD_RESET_STATE =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPSTATE_LABEL_PASSWORD_RESET_STATE_1177",TOOLS,INFORMATION,1177, getClassLoader());

  /**
   * Seconds Until Password Reset Lockout
   */
  public static final MessageDescriptor.Arg0 INFO_PWPSTATE_LABEL_SECONDS_UNTIL_PASSWORD_RESET_LOCKOUT =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPSTATE_LABEL_SECONDS_UNTIL_PASSWORD_RESET_LOCKOUT_1178",TOOLS,INFORMATION,1178, getClassLoader());

  /**
   * Grace Login Use Times
   */
  public static final MessageDescriptor.Arg0 INFO_PWPSTATE_LABEL_GRACE_LOGIN_USE_TIMES =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPSTATE_LABEL_GRACE_LOGIN_USE_TIMES_1179",TOOLS,INFORMATION,1179, getClassLoader());

  /**
   * Remaining Grace Login Count
   */
  public static final MessageDescriptor.Arg0 INFO_PWPSTATE_LABEL_REMAINING_GRACE_LOGIN_COUNT =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPSTATE_LABEL_REMAINING_GRACE_LOGIN_COUNT_1180",TOOLS,INFORMATION,1180, getClassLoader());

  /**
   * Password Changed by Required Time
   */
  public static final MessageDescriptor.Arg0 INFO_PWPSTATE_LABEL_PASSWORD_CHANGED_BY_REQUIRED_TIME =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPSTATE_LABEL_PASSWORD_CHANGED_BY_REQUIRED_TIME_1181",TOOLS,INFORMATION,1181, getClassLoader());

  /**
   * Seconds Until Required Change Time
   */
  public static final MessageDescriptor.Arg0 INFO_PWPSTATE_LABEL_SECONDS_UNTIL_REQUIRED_CHANGE_TIME =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPSTATE_LABEL_SECONDS_UNTIL_REQUIRED_CHANGE_TIME_1182",TOOLS,INFORMATION,1182, getClassLoader());

  /**
   * Unrecognized or invalid operation type:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PWPSTATE_INVALID_RESPONSE_OP_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PWPSTATE_INVALID_RESPONSE_OP_TYPE_1183",TOOLS,SEVERE_ERROR,1183, getClassLoader());

  /**
   * ERROR:  You may not provide both the %s and the %s arguments
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPSTATE_MUTUALLY_EXCLUSIVE_ARGUMENTS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPSTATE_MUTUALLY_EXCLUSIVE_ARGUMENTS_1184",TOOLS,SEVERE_ERROR,1184, getClassLoader());

  /**
   * ERROR:  Unable to perform SSL initialization:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PWPSTATE_CANNOT_INITIALIZE_SSL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PWPSTATE_CANNOT_INITIALIZE_SSL_1185",TOOLS,SEVERE_ERROR,1185, getClassLoader());

  /**
   * ERROR:  The provided SASL option string "%s" could not be parsed in the form "name=value"
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PWPSTATE_CANNOT_PARSE_SASL_OPTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PWPSTATE_CANNOT_PARSE_SASL_OPTION_1186",TOOLS,SEVERE_ERROR,1186, getClassLoader());

  /**
   * ERROR:  One or more SASL options were provided, but none of them were the "mech" option to specify which SASL mechanism should be used
   */
  public static final MessageDescriptor.Arg0 ERR_PWPSTATE_NO_SASL_MECHANISM =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_PWPSTATE_NO_SASL_MECHANISM_1187",TOOLS,SEVERE_ERROR,1187, getClassLoader());

  /**
   * ERROR:  Cannot parse the value of the %s argument as an integer value between 1 and 65535:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPSTATE_CANNOT_DETERMINE_PORT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPSTATE_CANNOT_DETERMINE_PORT_1188",TOOLS,SEVERE_ERROR,1188, getClassLoader());

  /**
   * ERROR:  Cannot establish a connection to the Directory Server %s.  Verify that the server is running and that the provided credentials are valid.  Details:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPSTATE_CANNOT_CONNECT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPSTATE_CANNOT_CONNECT_1189",TOOLS,SEVERE_ERROR,1189, getClassLoader());

  /**
   * Specifies an existing server package (.zip) file to which the current build will be upgraded using the command line version of this tool
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_DESCRIPTION_FILE =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_DESCRIPTION_FILE_1190",TOOLS,INFORMATION,1190, getClassLoader());

  /**
   * Use non-interactive mode.  Prompt for any required information rather than fail
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_DESCRIPTION_NO_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_DESCRIPTION_NO_PROMPT_1191",TOOLS,INFORMATION,1191, getClassLoader());

  /**
   * Perform a quiet upgrade or reversion
   */
  public static final MessageDescriptor.Arg0 INFO_UPGRADE_DESCRIPTION_SILENT =
          new MessageDescriptor.Arg0(BASE,"INFO_UPGRADE_DESCRIPTION_SILENT_1192",TOOLS,INFORMATION,1192, getClassLoader());

  /**
   * Count the number of entries rejected by the server and return that value as the exit code (values > 255 will be reduced to 255 due to exit code restrictions)
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFIMPORT_DESCRIPTION_COUNT_REJECTS =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFIMPORT_DESCRIPTION_COUNT_REJECTS_1195",TOOLS,INFORMATION,1195, getClassLoader());

  /**
   * Write skipped entries to the specified file
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFIMPORT_DESCRIPTION_SKIP_FILE =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFIMPORT_DESCRIPTION_SKIP_FILE_1197",TOOLS,INFORMATION,1197, getClassLoader());

  /**
   * An error occurred while trying to open the skip file %s for writing:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIFIMPORT_CANNOT_OPEN_SKIP_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIFIMPORT_CANNOT_OPEN_SKIP_FILE_1198",TOOLS,SEVERE_ERROR,1198, getClassLoader());

  /**
   * Count the number of errors found during the verification and return that value as the exit code (values > 255 will be reduced to 255 due to exit code restrictions)
   */
  public static final MessageDescriptor.Arg0 INFO_VERIFYINDEX_DESCRIPTION_COUNT_ERRORS =
          new MessageDescriptor.Arg0(BASE,"INFO_VERIFYINDEX_DESCRIPTION_COUNT_ERRORS_1199",TOOLS,INFORMATION,1199, getClassLoader());

  /**
   * Password History
   */
  public static final MessageDescriptor.Arg0 INFO_PWPSTATE_LABEL_PASSWORD_HISTORY =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPSTATE_LABEL_PASSWORD_HISTORY_1201",TOOLS,INFORMATION,1201, getClassLoader());

  /**
   * Display password history state values for the user
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PWPSTATE_GET_PASSWORD_HISTORY =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PWPSTATE_GET_PASSWORD_HISTORY_1202",TOOLS,INFORMATION,1202, getClassLoader());

  /**
   * Clear password history state values for the user.  This should be used only for testing purposes
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PWPSTATE_CLEAR_PASSWORD_HISTORY =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PWPSTATE_CLEAR_PASSWORD_HISTORY_1203",TOOLS,INFORMATION,1203, getClassLoader());

  /**
   * ERROR:  You have specified the value %s for different ports
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIGDS_PORT_ALREADY_SPECIFIED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIGDS_PORT_ALREADY_SPECIFIED_1211",TOOLS,SEVERE_ERROR,1211, getClassLoader());

  /**
   * The property "%s" is not a recognized property
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CLI_ERROR_PROPERTY_UNRECOGNIZED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CLI_ERROR_PROPERTY_UNRECOGNIZED_1212",TOOLS,SEVERE_ERROR,1212, getClassLoader());

  /**
   * The mandatory property "%s" is missing
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CLI_ERROR_MISSING_PROPERTY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CLI_ERROR_MISSING_PROPERTY_1213",TOOLS,SEVERE_ERROR,1213, getClassLoader());

  /**
   * The value "%s" specified for the property "%s" is invalid
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CLI_ERROR_INVALID_PROPERTY_VALUE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CLI_ERROR_INVALID_PROPERTY_VALUE_1214",TOOLS,SEVERE_ERROR,1214, getClassLoader());

  /**
   * Default value
   */
  public static final MessageDescriptor.Arg0 INFO_CLI_HEADING_PROPERTY_DEFAULT_VALUE =
          new MessageDescriptor.Arg0(BASE,"INFO_CLI_HEADING_PROPERTY_DEFAULT_VALUE_1215",TOOLS,INFORMATION,1215, getClassLoader());

  /**
   * Directory where reversion files are stored.  This should be one of the child directories of the 'history' directory that is created when the upgrade tool is run
   */
  public static final MessageDescriptor.Arg0 INFO_REVERT_DESCRIPTION_DIRECTORY =
          new MessageDescriptor.Arg0(BASE,"INFO_REVERT_DESCRIPTION_DIRECTORY_1219",TOOLS,INFORMATION,1219, getClassLoader());

  /**
   * The installation will be reverted to the state before the most recent upgrade
   */
  public static final MessageDescriptor.Arg0 INFO_REVERT_DESCRIPTION_RECENT =
          new MessageDescriptor.Arg0(BASE,"INFO_REVERT_DESCRIPTION_RECENT_1220",TOOLS,INFORMATION,1220, getClassLoader());

  /**
   * Prompt for any required information rather than fail
   */
  public static final MessageDescriptor.Arg0 INFO_REVERT_DESCRIPTION_INTERACTIVE =
          new MessageDescriptor.Arg0(BASE,"INFO_REVERT_DESCRIPTION_INTERACTIVE_1221",TOOLS,INFORMATION,1221, getClassLoader());

  /**
   * Perform a quiet reversion
   */
  public static final MessageDescriptor.Arg0 INFO_REVERT_DESCRIPTION_SILENT =
          new MessageDescriptor.Arg0(BASE,"INFO_REVERT_DESCRIPTION_SILENT_1222",TOOLS,INFORMATION,1222, getClassLoader());

  /**
   * Remove all entries for all base DNs in the backend before importing
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFIMPORT_DESCRIPTION_CLEAR_BACKEND =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFIMPORT_DESCRIPTION_CLEAR_BACKEND_1251",TOOLS,INFORMATION,1251, getClassLoader());

  /**
   * Neither the %s or the %s argument was provided.  One of these arguments must be given to specify the backend for the LDIF data to be imported to
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIFIMPORT_MISSING_BACKEND_ARGUMENT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIFIMPORT_MISSING_BACKEND_ARGUMENT_1252",TOOLS,SEVERE_ERROR,1252, getClassLoader());

  /**
   * Importing to a backend without the append argument will remove all entries for all base DNs (%s) in the backend. The %s argument must be given to continue with import
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIFIMPORT_MISSING_CLEAR_BACKEND =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIFIMPORT_MISSING_CLEAR_BACKEND_1253",TOOLS,SEVERE_ERROR,1253, getClassLoader());

  /**
   * The list tag on line %d of the template file does not contain any arguments to specify the list values.  At least one list value must be provided
   */
  public static final MessageDescriptor.Arg1<Number> ERR_MAKELDIF_TAG_LIST_NO_ARGUMENTS =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_MAKELDIF_TAG_LIST_NO_ARGUMENTS_1291",TOOLS,MILD_ERROR,1291, getClassLoader());

  /**
   * The list tag on line %d of the template file contains item '%s' that includes a semicolon but that semicolon is not followed by an integer.  The semicolon will be assumed to be part of the value and not a delimiter to separate the value from its relative weight
   */
  public static final MessageDescriptor.Arg2<Number,CharSequence> WARN_MAKELDIF_TAG_LIST_INVALID_WEIGHT =
          new MessageDescriptor.Arg2<Number,CharSequence>(BASE,"MILD_WARN_MAKELDIF_TAG_LIST_INVALID_WEIGHT_1292",TOOLS,MILD_WARNING,1292, getClassLoader());

  /**
   * An unexpected error occurred attempting to set the server's root directory to %s: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_INITIALIZE_SERVER_ROOT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"FATAL_ERR_INITIALIZE_SERVER_ROOT_1293",TOOLS,FATAL_ERROR,1293, getClassLoader());

  /**
   * ERROR:  You may not provide both the %s and the %s arguments
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAP_CONN_MUTUALLY_EXCLUSIVE_ARGUMENTS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDAP_CONN_MUTUALLY_EXCLUSIVE_ARGUMENTS_1294",TOOLS,SEVERE_ERROR,1294, getClassLoader());

  /**
   * ERROR:  Unable to perform SSL initialization:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_CONN_CANNOT_INITIALIZE_SSL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDAP_CONN_CANNOT_INITIALIZE_SSL_1295",TOOLS,SEVERE_ERROR,1295, getClassLoader());

  /**
   * ERROR:  The provided SASL option string "%s" could not be parsed in the form "name=value"
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_CONN_CANNOT_PARSE_SASL_OPTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDAP_CONN_CANNOT_PARSE_SASL_OPTION_1296",TOOLS,SEVERE_ERROR,1296, getClassLoader());

  /**
   * ERROR:  One or more SASL options were provided, but none of them were the "mech" option to specify which SASL mechanism should be used
   */
  public static final MessageDescriptor.Arg0 ERR_LDAP_CONN_NO_SASL_MECHANISM =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_LDAP_CONN_NO_SASL_MECHANISM_1297",TOOLS,SEVERE_ERROR,1297, getClassLoader());

  /**
   * ERROR:  Cannot parse the value of the %s argument as an integer value between 1 and 65535:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAP_CONN_CANNOT_DETERMINE_PORT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDAP_CONN_CANNOT_DETERMINE_PORT_1298",TOOLS,SEVERE_ERROR,1298, getClassLoader());

  /**
   * ERROR:  Cannot establish a connection to the Directory Server %s.  Verify that the server is running and that the provided credentials are valid.  Details:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAP_CONN_CANNOT_CONNECT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDAP_CONN_CANNOT_CONNECT_1299",TOOLS,SEVERE_ERROR,1299, getClassLoader());

  /**
   * Directory server hostname or IP address
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONN_DESCRIPTION_HOST =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONN_DESCRIPTION_HOST_1300",TOOLS,INFORMATION,1300, getClassLoader());

  /**
   * Directory server port number
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONN_DESCRIPTION_PORT =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONN_DESCRIPTION_PORT_1301",TOOLS,INFORMATION,1301, getClassLoader());

  /**
   * Use SSL for secure communication with the server
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONN_DESCRIPTION_USESSL =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONN_DESCRIPTION_USESSL_1302",TOOLS,INFORMATION,1302, getClassLoader());

  /**
   * Use StartTLS for secure communication with the server
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONN_DESCRIPTION_USESTARTTLS =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONN_DESCRIPTION_USESTARTTLS_1303",TOOLS,INFORMATION,1303, getClassLoader());

  /**
   * DN to use to bind to the server
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONN_DESCRIPTION_BINDDN =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONN_DESCRIPTION_BINDDN_1304",TOOLS,INFORMATION,1304, getClassLoader());

  /**
   * Password to use to bind to the server
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONN_DESCRIPTION_BINDPW =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONN_DESCRIPTION_BINDPW_1305",TOOLS,INFORMATION,1305, getClassLoader());

  /**
   * Bind password file
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONN_DESCRIPTION_BINDPWFILE =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONN_DESCRIPTION_BINDPWFILE_1306",TOOLS,INFORMATION,1306, getClassLoader());

  /**
   * SASL bind options
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONN_DESCRIPTION_SASLOPTIONS =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONN_DESCRIPTION_SASLOPTIONS_1307",TOOLS,INFORMATION,1307, getClassLoader());

  /**
   * Trust all server SSL certificates
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONN_DESCRIPTION_TRUST_ALL =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONN_DESCRIPTION_TRUST_ALL_1308",TOOLS,INFORMATION,1308, getClassLoader());

  /**
   * Certificate key store path
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONN_DESCRIPTION_KSFILE =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONN_DESCRIPTION_KSFILE_1309",TOOLS,INFORMATION,1309, getClassLoader());

  /**
   * Certificate key store PIN
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONN_DESCRIPTION_KSPW =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONN_DESCRIPTION_KSPW_1310",TOOLS,INFORMATION,1310, getClassLoader());

  /**
   * Certificate key store PIN file
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONN_DESCRIPTION_KSPWFILE =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONN_DESCRIPTION_KSPWFILE_1311",TOOLS,INFORMATION,1311, getClassLoader());

  /**
   * Certificate trust store path
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONN_DESCRIPTION_TSFILE =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONN_DESCRIPTION_TSFILE_1312",TOOLS,INFORMATION,1312, getClassLoader());

  /**
   * Certificate trust store PIN
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONN_DESCRIPTION_TSPW =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONN_DESCRIPTION_TSPW_1313",TOOLS,INFORMATION,1313, getClassLoader());

  /**
   * Certificate trust store PIN file
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONN_DESCRIPTION_TSPWFILE =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONN_DESCRIPTION_TSPWFILE_1314",TOOLS,INFORMATION,1314, getClassLoader());

  /**
   * NOTICE:  The connection to the Directory Server was closed while waiting for a response to the shutdown request.  This likely means that the server has started the shutdown process
   */
  public static final MessageDescriptor.Arg0 ERR_TASK_CLIENT_UNEXPECTED_CONNECTION_CLOSURE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_TASK_CLIENT_UNEXPECTED_CONNECTION_CLOSURE_1315",TOOLS,SEVERE_ERROR,1315, getClassLoader());

  /**
   * ERROR:  An I/O error occurred while attempting to communicate with the Directory Server:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASK_TOOL_IO_ERROR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASK_TOOL_IO_ERROR_1316",TOOLS,SEVERE_ERROR,1316, getClassLoader());

  /**
   * ERROR:  An error occurred while trying to decode the response from the server:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASK_TOOL_DECODE_ERROR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASK_TOOL_DECODE_ERROR_1317",TOOLS,SEVERE_ERROR,1317, getClassLoader());

  /**
   * ERROR:  Expected an add response message but got a %s message instead
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASK_CLIENT_INVALID_RESPONSE_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASK_CLIENT_INVALID_RESPONSE_TYPE_1318",TOOLS,SEVERE_ERROR,1318, getClassLoader());

  /**
   * %s task %s scheduled to start immediately
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_TASK_TOOL_TASK_SCHEDULED_NOW =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_TASK_TOOL_TASK_SCHEDULED_NOW_1319",TOOLS,INFORMATION,1319, getClassLoader());

  /**
   * ERROR:  argument %s is incompatible with use of this tool to interact with the directory as a client
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_CONN_INCOMPATIBLE_ARGS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDAP_CONN_INCOMPATIBLE_ARGS_1320",TOOLS,SEVERE_ERROR,1320, getClassLoader());

  /**
   * This tool may only be used on UNIX-based systems
   */
  public static final MessageDescriptor.Arg0 ERR_CREATERC_ONLY_RUNS_ON_UNIX =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CREATERC_ONLY_RUNS_ON_UNIX_1321",TOOLS,SEVERE_ERROR,1321, getClassLoader());

  /**
   * Create an RC script that may be used to start, stop, and restart the Directory Server on UNIX-based systems
   */
  public static final MessageDescriptor.Arg0 INFO_CREATERC_TOOL_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_CREATERC_TOOL_DESCRIPTION_1322",TOOLS,INFORMATION,1322, getClassLoader());

  /**
   * The path to the output file to create
   */
  public static final MessageDescriptor.Arg0 INFO_CREATERC_OUTFILE_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_CREATERC_OUTFILE_DESCRIPTION_1323",TOOLS,INFORMATION,1323, getClassLoader());

  /**
   * Unable to determine the path to the server root directory.  Please ensure that the %s system property or the %s environment variable is set to the path of the server root directory
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CREATERC_UNABLE_TO_DETERMINE_SERVER_ROOT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CREATERC_UNABLE_TO_DETERMINE_SERVER_ROOT_1324",TOOLS,SEVERE_ERROR,1324, getClassLoader());

  /**
   * An error occurred while attempting to generate the RC script:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CREATERC_CANNOT_WRITE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CREATERC_CANNOT_WRITE_1325",TOOLS,SEVERE_ERROR,1325, getClassLoader());

  /**
   * If you specify the {%s} argument you must also specify {%s}
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_DSCFG_ERROR_QUIET_AND_INTERACTIVE_INCOMPATIBLE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_QUIET_AND_INTERACTIVE_INCOMPATIBLE_1326",TOOLS,SEVERE_ERROR,1326, getClassLoader());

  /**
   * This utility can be used to debug the JE database
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_DBTEST_TOOL =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_DBTEST_TOOL_1327",TOOLS,INFORMATION,1327, getClassLoader());

  /**
   * List the root containers used by all JE backends
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_DBTEST_SUBCMD_LIST_ROOT_CONTAINERS =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_DBTEST_SUBCMD_LIST_ROOT_CONTAINERS_1328",TOOLS,INFORMATION,1328, getClassLoader());

  /**
   * List the entry containers for a root container
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_DBTEST_SUBCMD_LIST_ENTRY_CONTAINERS =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_DBTEST_SUBCMD_LIST_ENTRY_CONTAINERS_1329",TOOLS,INFORMATION,1329, getClassLoader());

  /**
   * Dump records from a database container
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_DBTEST_SUBCMD_DUMP_DATABASE_CONTAINER =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_DBTEST_SUBCMD_DUMP_DATABASE_CONTAINER_1330",TOOLS,INFORMATION,1330, getClassLoader());

  /**
   * The backend ID of the JE backend to debug
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_DBTEST_BACKEND_ID =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_DBTEST_BACKEND_ID_1331",TOOLS,INFORMATION,1331, getClassLoader());

  /**
   * The base DN of the entry container to debug
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_DBTEST_BASE_DN =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_DBTEST_BASE_DN_1332",TOOLS,INFORMATION,1332, getClassLoader());

  /**
   * The name of the database container to debug
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_DBTEST_DATABASE_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_DBTEST_DATABASE_NAME_1333",TOOLS,INFORMATION,1333, getClassLoader());

  /**
   * Do not try to decode the JE data to their appropriate types
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_DBTEST_SKIP_DECODE =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_DBTEST_SKIP_DECODE_1334",TOOLS,INFORMATION,1334, getClassLoader());

  /**
   * An error occurred while decoding data: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DBTEST_DECODE_FAIL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_DBTEST_DECODE_FAIL_1335",TOOLS,MILD_ERROR,1335, getClassLoader());

  /**
   * List the status of indexes in an entry container
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_DBTEST_SUBCMD_LIST_INDEX_STATUS =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_DBTEST_SUBCMD_LIST_INDEX_STATUS_1336",TOOLS,INFORMATION,1336, getClassLoader());

  /**
   * Only show records with keys that should be ordered before the provided value using the comparator for the database container
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_DBTEST_MAX_KEY_VALUE =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_DBTEST_MAX_KEY_VALUE_1337",TOOLS,INFORMATION,1337, getClassLoader());

  /**
   * Only show records with keys that should be ordered after the provided value using the comparator for the database container
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_DBTEST_MIN_KEY_VALUE =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_DBTEST_MIN_KEY_VALUE_1338",TOOLS,INFORMATION,1338, getClassLoader());

  /**
   * Only show records whose data is no larger than the provided value
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_DBTEST_MAX_DATA_SIZE =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_DBTEST_MAX_DATA_SIZE_1339",TOOLS,INFORMATION,1339, getClassLoader());

  /**
   * Only show records whose data is no smaller than the provided value
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_DBTEST_MIN_DATA_SIZE =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_DBTEST_MIN_DATA_SIZE_1340",TOOLS,INFORMATION,1340, getClassLoader());

  /**
   * List the database containers for an entry container
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_DBTEST_SUBCMD_LIST_DATABASE_CONTAINERS =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_DBTEST_SUBCMD_LIST_DATABASE_CONTAINERS_1341",TOOLS,INFORMATION,1341, getClassLoader());

  /**
   * Backend ID
   */
  public static final MessageDescriptor.Arg0 INFO_LABEL_DBTEST_BACKEND_ID =
          new MessageDescriptor.Arg0(BASE,"INFO_LABEL_DBTEST_BACKEND_ID_1342",TOOLS,INFORMATION,1342, getClassLoader());

  /**
   * Database Directory
   */
  public static final MessageDescriptor.Arg0 INFO_LABEL_DBTEST_DB_DIRECTORY =
          new MessageDescriptor.Arg0(BASE,"INFO_LABEL_DBTEST_DB_DIRECTORY_1343",TOOLS,INFORMATION,1343, getClassLoader());

  /**
   * Base DN
   */
  public static final MessageDescriptor.Arg0 INFO_LABEL_DBTEST_BASE_DN =
          new MessageDescriptor.Arg0(BASE,"INFO_LABEL_DBTEST_BASE_DN_1344",TOOLS,INFORMATION,1344, getClassLoader());

  /**
   * JE Database Prefix
   */
  public static final MessageDescriptor.Arg0 INFO_LABEL_DBTEST_JE_DATABASE_PREFIX =
          new MessageDescriptor.Arg0(BASE,"INFO_LABEL_DBTEST_JE_DATABASE_PREFIX_1345",TOOLS,INFORMATION,1345, getClassLoader());

  /**
   * Entry Count
   */
  public static final MessageDescriptor.Arg0 INFO_LABEL_DBTEST_ENTRY_COUNT =
          new MessageDescriptor.Arg0(BASE,"INFO_LABEL_DBTEST_ENTRY_COUNT_1346",TOOLS,INFORMATION,1346, getClassLoader());

  /**
   * None of the Directory Server backends are configured with the requested backend ID %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DBTEST_NO_BACKENDS_FOR_ID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DBTEST_NO_BACKENDS_FOR_ID_1347",TOOLS,SEVERE_ERROR,1347, getClassLoader());

  /**
   * None of the entry containers are configured with the requested base DN %s in backend %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_DBTEST_NO_ENTRY_CONTAINERS_FOR_BASE_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_DBTEST_NO_ENTRY_CONTAINERS_FOR_BASE_DN_1348",TOOLS,SEVERE_ERROR,1348, getClassLoader());

  /**
   * No database container exists with the requested name %s in entry container %s and backend %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_DBTEST_NO_DATABASE_CONTAINERS_FOR_NAME =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_DBTEST_NO_DATABASE_CONTAINERS_FOR_NAME_1349",TOOLS,SEVERE_ERROR,1349, getClassLoader());

  /**
   * An unexpected error occurred while attempting to initialize the JE backend %s: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_DBTEST_ERROR_INITIALIZING_BACKEND =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_DBTEST_ERROR_INITIALIZING_BACKEND_1350",TOOLS,SEVERE_ERROR,1350, getClassLoader());

  /**
   * An unexpected error occurred while attempting to read and/or decode records from the database: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DBTEST_ERROR_READING_DATABASE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DBTEST_ERROR_READING_DATABASE_1351",TOOLS,SEVERE_ERROR,1351, getClassLoader());

  /**
   * Unable to decode base DN string "%s" as a valid distinguished name:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_DBTEST_DECODE_BASE_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_DBTEST_DECODE_BASE_DN_1352",TOOLS,SEVERE_ERROR,1352, getClassLoader());

  /**
   * Database Name
   */
  public static final MessageDescriptor.Arg0 INFO_LABEL_DBTEST_DATABASE_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_LABEL_DBTEST_DATABASE_NAME_1353",TOOLS,INFORMATION,1353, getClassLoader());

  /**
   * Database Type
   */
  public static final MessageDescriptor.Arg0 INFO_LABEL_DBTEST_DATABASE_TYPE =
          new MessageDescriptor.Arg0(BASE,"INFO_LABEL_DBTEST_DATABASE_TYPE_1354",TOOLS,INFORMATION,1354, getClassLoader());

  /**
   * JE Database Name
   */
  public static final MessageDescriptor.Arg0 INFO_LABEL_DBTEST_JE_DATABASE_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_LABEL_DBTEST_JE_DATABASE_NAME_1355",TOOLS,INFORMATION,1355, getClassLoader());

  /**
   * Record Count
   */
  public static final MessageDescriptor.Arg0 INFO_LABEL_DBTEST_JE_RECORD_COUNT =
          new MessageDescriptor.Arg0(BASE,"INFO_LABEL_DBTEST_JE_RECORD_COUNT_1356",TOOLS,INFORMATION,1356, getClassLoader());

  /**
   * Index Name
   */
  public static final MessageDescriptor.Arg0 INFO_LABEL_DBTEST_INDEX_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_LABEL_DBTEST_INDEX_NAME_1357",TOOLS,INFORMATION,1357, getClassLoader());

  /**
   * Index Type
   */
  public static final MessageDescriptor.Arg0 INFO_LABEL_DBTEST_INDEX_TYPE =
          new MessageDescriptor.Arg0(BASE,"INFO_LABEL_DBTEST_INDEX_TYPE_1358",TOOLS,INFORMATION,1358, getClassLoader());

  /**
   * Index Valid
   */
  public static final MessageDescriptor.Arg0 INFO_LABEL_DBTEST_INDEX_STATUS =
          new MessageDescriptor.Arg0(BASE,"INFO_LABEL_DBTEST_INDEX_STATUS_1359",TOOLS,INFORMATION,1359, getClassLoader());

  /**
   * Key
   */
  public static final MessageDescriptor.Arg0 INFO_LABEL_DBTEST_KEY =
          new MessageDescriptor.Arg0(BASE,"INFO_LABEL_DBTEST_KEY_1360",TOOLS,INFORMATION,1360, getClassLoader());

  /**
   * Data
   */
  public static final MessageDescriptor.Arg0 INFO_LABEL_DBTEST_DATA =
          new MessageDescriptor.Arg0(BASE,"INFO_LABEL_DBTEST_DATA_1361",TOOLS,INFORMATION,1361, getClassLoader());

  /**
   * An error occurred while attempting to release the shared lock for backend %s:  %s.  This lock should automatically be cleared when the process exits, so no further action should be required
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_DBTEST_CANNOT_UNLOCK_BACKEND =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_DBTEST_CANNOT_UNLOCK_BACKEND_1362",TOOLS,SEVERE_WARNING,1362, getClassLoader());

  /**
   * An error occurred while attempting to acquire a shared lock for backend %s:  %s.  This generally means that some other process has exclusive access to this backend (e.g., a restore or an LDIF import)
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_DBTEST_CANNOT_LOCK_BACKEND =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_DBTEST_CANNOT_LOCK_BACKEND_1363",TOOLS,SEVERE_ERROR,1363, getClassLoader());

  /**
   * An error occurred while decoding the min/max key value %s: %s. Values prefixed with "0x" will be decoded as raw bytes in hex. When dumping the DN2ID database, the value must be a valid distinguished name. When dumping the ID2Entry database, the value will be decoded as a entry ID. When dumping all other databases, the value will be decoded as a string
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_DBTEST_CANNOT_DECODE_KEY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_DBTEST_CANNOT_DECODE_KEY_1364",TOOLS,SEVERE_ERROR,1364, getClassLoader());

  /**
   * Entry
   */
  public static final MessageDescriptor.Arg0 INFO_LABEL_DBTEST_ENTRY =
          new MessageDescriptor.Arg0(BASE,"INFO_LABEL_DBTEST_ENTRY_1365",TOOLS,INFORMATION,1365, getClassLoader());

  /**
   * Entry ID
   */
  public static final MessageDescriptor.Arg0 INFO_LABEL_DBTEST_ENTRY_ID =
          new MessageDescriptor.Arg0(BASE,"INFO_LABEL_DBTEST_ENTRY_ID_1366",TOOLS,INFORMATION,1366, getClassLoader());

  /**
   * Entry DN
   */
  public static final MessageDescriptor.Arg0 INFO_LABEL_DBTEST_ENTRY_DN =
          new MessageDescriptor.Arg0(BASE,"INFO_LABEL_DBTEST_ENTRY_DN_1367",TOOLS,INFORMATION,1367, getClassLoader());

  /**
   * URI
   */
  public static final MessageDescriptor.Arg0 INFO_LABEL_DBTEST_URI =
          new MessageDescriptor.Arg0(BASE,"INFO_LABEL_DBTEST_URI_1368",TOOLS,INFORMATION,1368, getClassLoader());

  /**
   * Indexed Value
   */
  public static final MessageDescriptor.Arg0 INFO_LABEL_DBTEST_INDEX_VALUE =
          new MessageDescriptor.Arg0(BASE,"INFO_LABEL_DBTEST_INDEX_VALUE_1369",TOOLS,INFORMATION,1369, getClassLoader());

  /**
   * Entry ID List
   */
  public static final MessageDescriptor.Arg0 INFO_LABEL_DBTEST_INDEX_ENTRY_ID_LIST =
          new MessageDescriptor.Arg0(BASE,"INFO_LABEL_DBTEST_INDEX_ENTRY_ID_LIST_1370",TOOLS,INFORMATION,1370, getClassLoader());

  /**
   * Last Sort Keys
   */
  public static final MessageDescriptor.Arg0 INFO_LABEL_DBTEST_VLV_INDEX_LAST_SORT_KEYS =
          new MessageDescriptor.Arg0(BASE,"INFO_LABEL_DBTEST_VLV_INDEX_LAST_SORT_KEYS_1371",TOOLS,INFORMATION,1371, getClassLoader());

  /**
   * An error occurred while parsing the min/max data size %s as a integer: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_DBTEST_CANNOT_DECODE_SIZE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_DBTEST_CANNOT_DECODE_SIZE_1372",TOOLS,SEVERE_ERROR,1372, getClassLoader());

  /**
   * An error occurred while attempting to enable the ADS trust store: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIGDS_CANNOT_ENABLE_ADS_TRUST_STORE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIGDS_CANNOT_ENABLE_ADS_TRUST_STORE_1373",TOOLS,SEVERE_ERROR,1373, getClassLoader());

  /**
   * A sub-command must be specified
   */
  public static final MessageDescriptor.Arg0 ERR_DBTEST_MISSING_SUBCOMMAND =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_DBTEST_MISSING_SUBCOMMAND_1374",TOOLS,SEVERE_ERROR,1374, getClassLoader());

  /**
   * The name of the user account under which the server should run
   */
  public static final MessageDescriptor.Arg0 INFO_CREATERC_USER_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_CREATERC_USER_DESCRIPTION_1375",TOOLS,INFORMATION,1375, getClassLoader());

  /**
   * The path to the Java installation that should be used to run the server
   */
  public static final MessageDescriptor.Arg0 INFO_CREATERC_JAVA_HOME_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_CREATERC_JAVA_HOME_DESCRIPTION_1376",TOOLS,INFORMATION,1376, getClassLoader());

  /**
   * A set of arguments that should be passed to the JVM when running the server
   */
  public static final MessageDescriptor.Arg0 INFO_CREATERC_JAVA_ARGS_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_CREATERC_JAVA_ARGS_DESCRIPTION_1377",TOOLS,INFORMATION,1377, getClassLoader());

  /**
   * The directory %s specified as the OPENDS_JAVA_HOME path does not exist or is not a directory
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CREATERC_JAVA_HOME_DOESNT_EXIST =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CREATERC_JAVA_HOME_DOESNT_EXIST_1378",TOOLS,SEVERE_ERROR,1378, getClassLoader());

  /**
   * To see basic server configuration status and configuration you can launch %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_INSTALLDS_STATUS_COMMAND_LINE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_INSTALLDS_STATUS_COMMAND_LINE_1379",TOOLS,INFORMATION,1379, getClassLoader());

  /**
   * Do you want to enable SSL?
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_PROMPT_ENABLE_SSL =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_PROMPT_ENABLE_SSL_1380",TOOLS,INFORMATION,1380, getClassLoader());

  /**
   * On which port would you like the Directory Server to accept connections from LDAPS clients?
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_PROMPT_LDAPSPORT =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_PROMPT_LDAPSPORT_1381",TOOLS,INFORMATION,1381, getClassLoader());

  /**
   * Do you want to enable Start TLS?
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_ENABLE_STARTTLS =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_ENABLE_STARTTLS_1382",TOOLS,INFORMATION,1382, getClassLoader());

  /**
   * Java Key Store (JKS) path:
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_PROMPT_JKS_PATH =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_PROMPT_JKS_PATH_1383",TOOLS,INFORMATION,1383, getClassLoader());

  /**
   * PKCS#12 key Store path:
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_PROMPT_PKCS12_PATH =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_PROMPT_PKCS12_PATH_1384",TOOLS,INFORMATION,1384, getClassLoader());

  /**
   * Key store PIN:
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_PROMPT_KEYSTORE_PASSWORD =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_PROMPT_KEYSTORE_PASSWORD_1385",TOOLS,INFORMATION,1385, getClassLoader());

  /**
   * Use nickname %s?
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_INSTALLDS_PROMPT_CERTNICKNAME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_INSTALLDS_PROMPT_CERTNICKNAME_1386",TOOLS,INFORMATION,1386, getClassLoader());

  /**
   * Certificate server options:
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_HEADER_CERT_TYPE =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_HEADER_CERT_TYPE_1387",TOOLS,INFORMATION,1387, getClassLoader());

  /**
   * Generate self-signed certificate (recommended for testing purposes only)
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_CERT_OPTION_SELF_SIGNED =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_CERT_OPTION_SELF_SIGNED_1388",TOOLS,INFORMATION,1388, getClassLoader());

  /**
   * Use an existing certificate located on a Java Key Store (JKS)
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_CERT_OPTION_JKS =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_CERT_OPTION_JKS_1389",TOOLS,INFORMATION,1389, getClassLoader());

  /**
   * Use an existing certificate located on a PKCS#12 key store
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_CERT_OPTION_PKCS12 =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_CERT_OPTION_PKCS12_1390",TOOLS,INFORMATION,1390, getClassLoader());

  /**
   * Use an existing certificate on a PKCS#11 token
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_CERT_OPTION_PKCS11 =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_CERT_OPTION_PKCS11_1391",TOOLS,INFORMATION,1391, getClassLoader());

  /**
   * Certificate type selection:
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_PROMPT_CERT_TYPE_CHOICE =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_PROMPT_CERT_TYPE_CHOICE_1392",TOOLS,INFORMATION,1392, getClassLoader());

  /**
   * Do you want to start the server when the configuration is completed?
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_PROMPT_START_SERVER =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_PROMPT_START_SERVER_1393",TOOLS,INFORMATION,1393, getClassLoader());

  /**
   * The provided certificate nickname could not be found.  The key store contains the following certificate nicknames: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_INSTALLDS_CERTNICKNAME_NOT_FOUND =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_INSTALLDS_CERTNICKNAME_NOT_FOUND_1394",TOOLS,SEVERE_ERROR,1394, getClassLoader());

  /**
   * The key store contains the following certificate nicknames: %s.%nYou have to provide the nickname of the certificate you want to use
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_INSTALLDS_MUST_PROVIDE_CERTNICKNAME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_INSTALLDS_MUST_PROVIDE_CERTNICKNAME_1395",TOOLS,SEVERE_ERROR,1395, getClassLoader());

  /**
   * Do not start the server when the configuration is completed
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_DESCRIPTION_DO_NOT_START =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_DESCRIPTION_DO_NOT_START_1396",TOOLS,INFORMATION,1396, getClassLoader());

  /**
   * Enable StartTLS to allow secure communication with the server using the LDAP port
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_DESCRIPTION_ENABLE_STARTTLS =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_DESCRIPTION_ENABLE_STARTTLS_1397",TOOLS,INFORMATION,1397, getClassLoader());

  /**
   * Port on which the Directory Server should listen for LDAPS communication.  The LDAPS port will be configured and SSL will be enabled only if this argument is explicitly specified
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_DESCRIPTION_LDAPSPORT =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_DESCRIPTION_LDAPSPORT_1398",TOOLS,INFORMATION,1398, getClassLoader());

  /**
   * Generate a self-signed certificate that the server should use when accepting SSL-based connections or performing StartTLS negotiation
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_DESCRIPTION_USE_SELF_SIGNED =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_DESCRIPTION_USE_SELF_SIGNED_1399",TOOLS,INFORMATION,1399, getClassLoader());

  /**
   * Use a certificate in a PKCS#11 token that the server should use when accepting SSL-based connections or performing StartTLS negotiation
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_DESCRIPTION_USE_PKCS11 =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_DESCRIPTION_USE_PKCS11_1400",TOOLS,INFORMATION,1400, getClassLoader());

  /**
   * Path of a Java Key Store (JKS) containing a certificate to be used as the server certificate
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_DESCRIPTION_USE_JAVAKEYSTORE =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_DESCRIPTION_USE_JAVAKEYSTORE_1401",TOOLS,INFORMATION,1401, getClassLoader());

  /**
   * Path of a PKCS#12 key store containing the certificate that the server should use when accepting SSL-based connections or performing StartTLS negotiation
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_DESCRIPTION_USE_PKCS12 =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_DESCRIPTION_USE_PKCS12_1402",TOOLS,INFORMATION,1402, getClassLoader());

  /**
   * Certificate key store PIN.  A PIN is required when you specify to use an existing certificate (JKS, JCEKS, PKCS#12 or PKCS#11) as server certificate
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_DESCRIPTION_KEYSTOREPASSWORD =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_DESCRIPTION_KEYSTOREPASSWORD_1403",TOOLS,INFORMATION,1403, getClassLoader());

  /**
   * Certificate key store PIN file.  A PIN is required when you specify to use an existing certificate (JKS, JCEKS, PKCS#12 or PKCS#11) as server certificate
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_DESCRIPTION_KEYSTOREPASSWORD_FILE =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_DESCRIPTION_KEYSTOREPASSWORD_FILE_1404",TOOLS,INFORMATION,1404, getClassLoader());

  /**
   * Nickname of the certificate that the server should use when accepting SSL-based connections or performing StartTLS negotiation
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_DESCRIPTION_CERT_NICKNAME =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_DESCRIPTION_CERT_NICKNAME_1405",TOOLS,INFORMATION,1405, getClassLoader());

  /**
   * You have specified several certificate types to be used.  Only one certificate type (self-signed, JKS, JCEKS, PKCS#12 or PCKS#11) is allowed
   */
  public static final MessageDescriptor.Arg0 ERR_INSTALLDS_SEVERAL_CERTIFICATE_TYPE_SPECIFIED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_INSTALLDS_SEVERAL_CERTIFICATE_TYPE_SPECIFIED_1406",TOOLS,SEVERE_ERROR,1406, getClassLoader());

  /**
   * You have chosen to enable SSL or StartTLS.  You must specify which type of certificate you want the server to use
   */
  public static final MessageDescriptor.Arg0 ERR_INSTALLDS_CERTIFICATE_REQUIRED_FOR_SSL_OR_STARTTLS =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_INSTALLDS_CERTIFICATE_REQUIRED_FOR_SSL_OR_STARTTLS_1407",TOOLS,SEVERE_ERROR,1407, getClassLoader());

  /**
   * You must provide the PIN of the keystore to retrieve the certificate to be used by the server.  You can use {%s} or {%s}
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_INSTALLDS_NO_KEYSTORE_PASSWORD =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_INSTALLDS_NO_KEYSTORE_PASSWORD_1408",TOOLS,SEVERE_ERROR,1408, getClassLoader());

  /**
   * Perform an installation in non-interactive mode.  If some data in the command is missing the user will not be prompted and the tool will fail
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_DESCRIPTION_NO_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_DESCRIPTION_NO_PROMPT_1409",TOOLS,INFORMATION,1409, getClassLoader());

  /**
   * You have specified to use a certificate as server certificate.  You must enable SSL (using option {%s}) or Start TLS (using option %s)
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_INSTALLDS_SSL_OR_STARTTLS_REQUIRED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_INSTALLDS_SSL_OR_STARTTLS_REQUIRED_1410",TOOLS,SEVERE_ERROR,1410, getClassLoader());

  /**
   * The argument '%s' is incompatible with '%s'
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_UPGRADE_INCOMPATIBLE_ARGS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_UPGRADE_INCOMPATIBLE_ARGS_1411",TOOLS,SEVERE_ERROR,1411, getClassLoader());

  /**
   * This utility can be used to obtain a list of tasks scheduled to run within the Directory Server as well as information about individual tasks
   */
  public static final MessageDescriptor.Arg0 INFO_TASKINFO_TOOL_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_TASKINFO_TOOL_DESCRIPTION_1412",TOOLS,INFORMATION,1412, getClassLoader());

  /**
   * Print a summary of tasks
   */
  public static final MessageDescriptor.Arg0 INFO_TASKINFO_SUMMARY_ARG_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_TASKINFO_SUMMARY_ARG_DESCRIPTION_1413",TOOLS,INFORMATION,1413, getClassLoader());

  /**
   * ID of a particular task about which this tool will display information
   */
  public static final MessageDescriptor.Arg0 INFO_TASKINFO_TASK_ARG_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_TASKINFO_TASK_ARG_DESCRIPTION_1414",TOOLS,INFORMATION,1414, getClassLoader());

  /**
   * refresh
   */
  public static final MessageDescriptor.Arg0 INFO_TASKINFO_CMD_REFRESH =
          new MessageDescriptor.Arg0(BASE,"INFO_TASKINFO_CMD_REFRESH_1415",TOOLS,INFORMATION,1415, getClassLoader());

  /**
   * cancel task
   */
  public static final MessageDescriptor.Arg0 INFO_TASKINFO_CMD_CANCEL =
          new MessageDescriptor.Arg0(BASE,"INFO_TASKINFO_CMD_CANCEL_1416",TOOLS,INFORMATION,1416, getClassLoader());

  /**
   * view logs
   */
  public static final MessageDescriptor.Arg0 INFO_TASKINFO_CMD_VIEW_LOGS =
          new MessageDescriptor.Arg0(BASE,"INFO_TASKINFO_CMD_VIEW_LOGS_1417",TOOLS,INFORMATION,1417, getClassLoader());

  /**
   * Enter a menu item or task number
   */
  public static final MessageDescriptor.Arg0 INFO_TASKINFO_MENU_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_TASKINFO_MENU_PROMPT_1418",TOOLS,INFORMATION,1418, getClassLoader());

  /**
   * Enter the number of a task to cancel [%d]
   */
  public static final MessageDescriptor.Arg1<Number> INFO_TASKINFO_CMD_CANCEL_NUMBER_PROMPT =
          new MessageDescriptor.Arg1<Number>(BASE,"INFO_TASKINFO_CMD_CANCEL_NUMBER_PROMPT_1419",TOOLS,INFORMATION,1419, getClassLoader());

  /**
   * Menu
   */
  public static final MessageDescriptor.Arg0 INFO_TASKINFO_MENU =
          new MessageDescriptor.Arg0(BASE,"INFO_TASKINFO_MENU_1420",TOOLS,INFORMATION,1420, getClassLoader());

  /**
   * Task number must be between 1 and %d
   */
  public static final MessageDescriptor.Arg1<Number> ERR_TASKINFO_INVALID_TASK_NUMBER =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_TASKINFO_INVALID_TASK_NUMBER_1421",TOOLS,MILD_ERROR,1421, getClassLoader());

  /**
   * Invalid menu item or task number '%s'
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASKINFO_INVALID_MENU_KEY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_TASKINFO_INVALID_MENU_KEY_1422",TOOLS,MILD_ERROR,1422, getClassLoader());

  /**
   * ID
   */
  public static final MessageDescriptor.Arg0 INFO_TASKINFO_FIELD_ID =
          new MessageDescriptor.Arg0(BASE,"INFO_TASKINFO_FIELD_ID_1423",TOOLS,INFORMATION,1423, getClassLoader());

  /**
   * Type
   */
  public static final MessageDescriptor.Arg0 INFO_TASKINFO_FIELD_TYPE =
          new MessageDescriptor.Arg0(BASE,"INFO_TASKINFO_FIELD_TYPE_1424",TOOLS,INFORMATION,1424, getClassLoader());

  /**
   * Status
   */
  public static final MessageDescriptor.Arg0 INFO_TASKINFO_FIELD_STATUS =
          new MessageDescriptor.Arg0(BASE,"INFO_TASKINFO_FIELD_STATUS_1425",TOOLS,INFORMATION,1425, getClassLoader());

  /**
   * Scheduled Start Time
   */
  public static final MessageDescriptor.Arg0 INFO_TASKINFO_FIELD_SCHEDULED_START =
          new MessageDescriptor.Arg0(BASE,"INFO_TASKINFO_FIELD_SCHEDULED_START_1426",TOOLS,INFORMATION,1426, getClassLoader());

  /**
   * Actual Start Time
   */
  public static final MessageDescriptor.Arg0 INFO_TASKINFO_FIELD_ACTUAL_START =
          new MessageDescriptor.Arg0(BASE,"INFO_TASKINFO_FIELD_ACTUAL_START_1427",TOOLS,INFORMATION,1427, getClassLoader());

  /**
   * Completion Time
   */
  public static final MessageDescriptor.Arg0 INFO_TASKINFO_FIELD_COMPLETION_TIME =
          new MessageDescriptor.Arg0(BASE,"INFO_TASKINFO_FIELD_COMPLETION_TIME_1428",TOOLS,INFORMATION,1428, getClassLoader());

  /**
   * Dependencies
   */
  public static final MessageDescriptor.Arg0 INFO_TASKINFO_FIELD_DEPENDENCY =
          new MessageDescriptor.Arg0(BASE,"INFO_TASKINFO_FIELD_DEPENDENCY_1429",TOOLS,INFORMATION,1429, getClassLoader());

  /**
   * Failed Dependency Action
   */
  public static final MessageDescriptor.Arg0 INFO_TASKINFO_FIELD_FAILED_DEPENDENCY_ACTION =
          new MessageDescriptor.Arg0(BASE,"INFO_TASKINFO_FIELD_FAILED_DEPENDENCY_ACTION_1430",TOOLS,INFORMATION,1430, getClassLoader());

  /**
   * Log Message(s)
   */
  public static final MessageDescriptor.Arg0 INFO_TASKINFO_FIELD_LOG =
          new MessageDescriptor.Arg0(BASE,"INFO_TASKINFO_FIELD_LOG_1431",TOOLS,INFORMATION,1431, getClassLoader());

  /**
   * Last Log Message
   */
  public static final MessageDescriptor.Arg0 INFO_TASKINFO_FIELD_LAST_LOG =
          new MessageDescriptor.Arg0(BASE,"INFO_TASKINFO_FIELD_LAST_LOG_1432",TOOLS,INFORMATION,1432, getClassLoader());

  /**
   * Email Upon Completion
   */
  public static final MessageDescriptor.Arg0 INFO_TASKINFO_FIELD_NOTIFY_ON_COMPLETION =
          new MessageDescriptor.Arg0(BASE,"INFO_TASKINFO_FIELD_NOTIFY_ON_COMPLETION_1433",TOOLS,INFORMATION,1433, getClassLoader());

  /**
   * Email Upon Error
   */
  public static final MessageDescriptor.Arg0 INFO_TASKINFO_FIELD_NOTIFY_ON_ERROR =
          new MessageDescriptor.Arg0(BASE,"INFO_TASKINFO_FIELD_NOTIFY_ON_ERROR_1434",TOOLS,INFORMATION,1434, getClassLoader());

  /**
   * Task %s canceled
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_TASKINFO_CMD_CANCEL_SUCCESS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_TASKINFO_CMD_CANCEL_SUCCESS_1435",TOOLS,INFORMATION,1435, getClassLoader());

  /**
   * Error canceling task %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TASKINFO_CMD_CANCEL_ERROR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASKINFO_CMD_CANCEL_ERROR_1436",TOOLS,SEVERE_ERROR,1436, getClassLoader());

  /**
   * Error retrieving task entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TASKINFO_RETRIEVING_TASK_ENTRY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASKINFO_RETRIEVING_TASK_ENTRY_1437",TOOLS,SEVERE_ERROR,1437, getClassLoader());

  /**
   * There are no tasks with ID %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASKINFO_UNKNOWN_TASK_ENTRY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_TASKINFO_UNKNOWN_TASK_ENTRY_1438",TOOLS,MILD_ERROR,1438, getClassLoader());

  /**
   * Task Details
   */
  public static final MessageDescriptor.Arg0 INFO_TASKINFO_DETAILS =
          new MessageDescriptor.Arg0(BASE,"INFO_TASKINFO_DETAILS_1439",TOOLS,INFORMATION,1439, getClassLoader());

  /**
   * %s Options
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_TASKINFO_OPTIONS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_TASKINFO_OPTIONS_1440",TOOLS,INFORMATION,1440, getClassLoader());

  /**
   * No tasks exist
   */
  public static final MessageDescriptor.Arg0 INFO_TASKINFO_NO_TASKS =
          new MessageDescriptor.Arg0(BASE,"INFO_TASKINFO_NO_TASKS_1441",TOOLS,INFORMATION,1441, getClassLoader());

  /**
   * None
   */
  public static final MessageDescriptor.Arg0 INFO_TASKINFO_NONE =
          new MessageDescriptor.Arg0(BASE,"INFO_TASKINFO_NONE_1442",TOOLS,INFORMATION,1442, getClassLoader());

  /**
   * None Specified
   */
  public static final MessageDescriptor.Arg0 INFO_TASKINFO_NONE_SPECIFIED =
          new MessageDescriptor.Arg0(BASE,"INFO_TASKINFO_NONE_SPECIFIED_1443",TOOLS,INFORMATION,1443, getClassLoader());

  /**
   * Immediate execution
   */
  public static final MessageDescriptor.Arg0 INFO_TASKINFO_IMMEDIATE_EXECUTION =
          new MessageDescriptor.Arg0(BASE,"INFO_TASKINFO_IMMEDIATE_EXECUTION_1444",TOOLS,INFORMATION,1444, getClassLoader());

  /**
   * Error connecting to the directory server: '%s'. Verify that the connection options are correct and that the server is running
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_TASKINFO_LDAP_EXCEPTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_TASKINFO_LDAP_EXCEPTION_1445",TOOLS,INFORMATION,1445, getClassLoader());

  /**
   * Options '%s' and '%s' are incompatible with each other and cannot be used together
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_INCOMPATIBLE_ARGUMENTS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_INCOMPATIBLE_ARGUMENTS_1446",TOOLS,SEVERE_ERROR,1446, getClassLoader());

  /**
   * ID of a particular task to cancel
   */
  public static final MessageDescriptor.Arg0 INFO_TASKINFO_TASK_ARG_CANCEL =
          new MessageDescriptor.Arg0(BASE,"INFO_TASKINFO_TASK_ARG_CANCEL_1447",TOOLS,INFORMATION,1447, getClassLoader());

  /**
   * Error canceling task '%s': %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TASKINFO_CANCELING_TASK =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASKINFO_CANCELING_TASK_1448",TOOLS,SEVERE_ERROR,1448, getClassLoader());

  /**
   * Error accessing logs for task '%s': %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TASKINFO_ACCESSING_LOGS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASKINFO_ACCESSING_LOGS_1449",TOOLS,SEVERE_ERROR,1449, getClassLoader());

  /**
   * Task at index %d is not cancelable
   */
  public static final MessageDescriptor.Arg1<Number> ERR_TASKINFO_NOT_CANCELABLE_TASK_INDEX =
          new MessageDescriptor.Arg1<Number>(BASE,"SEVERE_ERR_TASKINFO_NOT_CANCELABLE_TASK_INDEX_1450",TOOLS,SEVERE_ERROR,1450, getClassLoader());

  /**
   * Task %s has finished and cannot be canceled
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASKINFO_NOT_CANCELABLE_TASK =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASKINFO_NOT_CANCELABLE_TASK_1451",TOOLS,SEVERE_ERROR,1451, getClassLoader());

  /**
   * There are currently no cancelable tasks
   */
  public static final MessageDescriptor.Arg0 INFO_TASKINFO_NO_CANCELABLE_TASKS =
          new MessageDescriptor.Arg0(BASE,"INFO_TASKINFO_NO_CANCELABLE_TASKS_1452",TOOLS,INFORMATION,1452, getClassLoader());

  /**
   * There are no tasks defined with ID '%s'
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASK_CLIENT_UNKNOWN_TASK =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASK_CLIENT_UNKNOWN_TASK_1453",TOOLS,SEVERE_ERROR,1453, getClassLoader());

  /**
   * Task '%s' has finished and cannot be canceled
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASK_CLIENT_UNCANCELABLE_TASK =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASK_CLIENT_UNCANCELABLE_TASK_1454",TOOLS,SEVERE_ERROR,1454, getClassLoader());

  /**
   * State for task '%s' cannot be determined
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASK_CLIENT_TASK_STATE_UNKNOWN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASK_CLIENT_TASK_STATE_UNKNOWN_1455",TOOLS,SEVERE_ERROR,1455, getClassLoader());

  /**
   * Indicates the date/time at which this operation will start when scheduled as a server task expressed in YYYYMMDDhhmmssZ format for UTC time or YYYYMMDDhhmmss for local time.  A value of '0' will cause the task to be scheduled for immediate execution.  When this option is specified the operation will be scheduled to start at the specified time after which this utility will exit immediately
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_START_DATETIME =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_START_DATETIME_1456",TOOLS,INFORMATION,1456, getClassLoader());

  /**
   * The start date/time must in YYYYMMDDhhmmssZ format for UTC time or YYYYMMDDhhmmss for local time
   */
  public static final MessageDescriptor.Arg0 ERR_START_DATETIME_FORMAT =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_START_DATETIME_FORMAT_1457",TOOLS,SEVERE_ERROR,1457, getClassLoader());

  /**
   * %s task %s scheduled to start %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> INFO_TASK_TOOL_TASK_SCHEDULED_FUTURE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"INFO_TASK_TOOL_TASK_SCHEDULED_FUTURE_1458",TOOLS,INFORMATION,1458, getClassLoader());

  /**
   * You have provided options for scheduling this operation as a task but options provided for connecting to the server's tasks backend resulted in the following error: '%s'
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASK_TOOL_START_TIME_NO_LDAP =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASK_TOOL_START_TIME_NO_LDAP_1459",TOOLS,SEVERE_ERROR,1459, getClassLoader());

  /**
   * You have provided options for scheduling this operation as a task but options provided for connecting to the server's tasks backend are invalid or missing
   */
  public static final MessageDescriptor.Arg0 ERR_TASK_TOOL_NO_VALID_LDAP_OPTIONS =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_TASK_TOOL_NO_VALID_LDAP_OPTIONS_1460",TOOLS,SEVERE_ERROR,1460, getClassLoader());

  /**
   * Path to the file containing default property values used for command line arguments
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PROP_FILE_PATH =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PROP_FILE_PATH_1461",TOOLS,INFORMATION,1461, getClassLoader());

  /**
   * No properties file will be used to get default command line argument values
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_NO_PROP_FILE =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_NO_PROP_FILE_1462",TOOLS,INFORMATION,1462, getClassLoader());

  /**
   * Task Scheduling Options
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_TASK_TASK_ARGS =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_TASK_TASK_ARGS_1463",TOOLS,INFORMATION,1463, getClassLoader());

  /**
   * Task Backend Connection Options
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_TASK_LDAP_ARGS =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_TASK_LDAP_ARGS_1464",TOOLS,INFORMATION,1464, getClassLoader());

  /**
   * General Options
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_GENERAL_ARGS =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_GENERAL_ARGS_1465",TOOLS,INFORMATION,1465, getClassLoader());

  /**
   * Utility Input/Output Options
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_IO_ARGS =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_IO_ARGS_1466",TOOLS,INFORMATION,1466, getClassLoader());

  /**
   * LDAP Connection Options
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_LDAP_CONNECTION_ARGS =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_LDAP_CONNECTION_ARGS_1467",TOOLS,INFORMATION,1467, getClassLoader());

  /**
   * Configuration Options
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_CONFIG_OPTIONS_ARGS =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_CONFIG_OPTIONS_ARGS_1468",TOOLS,INFORMATION,1468, getClassLoader());

  /**
   * Email address of a recipient to be notified when the task completes.  This option may be specified more than once
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_TASK_COMPLETION_NOTIFICATION =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_TASK_COMPLETION_NOTIFICATION_1469",TOOLS,INFORMATION,1469, getClassLoader());

  /**
   * Email address of a recipient to be notified if an error occurs when this task executes.  This option may be specified more than once
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_TASK_ERROR_NOTIFICATION =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_TASK_ERROR_NOTIFICATION_1470",TOOLS,INFORMATION,1470, getClassLoader());

  /**
   * ID of a task upon which this task depends.  A task will not start execution until all its dependencies have completed execution
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_TASK_DEPENDENCY_ID =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_TASK_DEPENDENCY_ID_1471",TOOLS,INFORMATION,1471, getClassLoader());

  /**
   * Action this task will take should one if its dependent tasks fail.  The value must be one of %s.  If not specified defaults to %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_DESCRIPTION_TASK_FAILED_DEPENDENCY_ACTION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_DESCRIPTION_TASK_FAILED_DEPENDENCY_ACTION_1472",TOOLS,INFORMATION,1472, getClassLoader());

  /**
   * The option %s is only applicable when scheduling this operation as a task
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASKTOOL_OPTIONS_FOR_TASK_ONLY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASKTOOL_OPTIONS_FOR_TASK_ONLY_1473",TOOLS,SEVERE_ERROR,1473, getClassLoader());

  /**
   * The value %s for option %s is not a valid email address
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TASKTOOL_INVALID_EMAIL_ADDRESS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASKTOOL_INVALID_EMAIL_ADDRESS_1474",TOOLS,SEVERE_ERROR,1474, getClassLoader());

  /**
   * The failed dependency action value %s is invalid.  The value must be one of %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TASKTOOL_INVALID_FDA =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASKTOOL_INVALID_FDA_1475",TOOLS,SEVERE_ERROR,1475, getClassLoader());

  /**
   * The failed dependency action option is to be used in conjunction with one or more dependencies
   */
  public static final MessageDescriptor.Arg0 ERR_TASKTOOL_FDA_WITH_NO_DEPENDENCY =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_TASKTOOL_FDA_WITH_NO_DEPENDENCY_1476",TOOLS,SEVERE_ERROR,1476, getClassLoader());

  /**
   * Error:  task %s is not in a cancelable state
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TASKINFO_TASK_NOT_CANCELABLE_TASK =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TASKINFO_TASK_NOT_CANCELABLE_TASK_1477",TOOLS,SEVERE_ERROR,1477, getClassLoader());

  /**
   * The backup process was cancelled
   */
  public static final MessageDescriptor.Arg0 NOTE_BACKUPDB_CANCELLED =
          new MessageDescriptor.Arg0(BASE,"NOTICE_BACKUPDB_CANCELLED_1478",TOOLS,NOTICE,1478, getClassLoader());

  /**
   * Write rejected entries to the specified file
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_DESCRIPTION_REJECTED_FILE =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_DESCRIPTION_REJECTED_FILE_1479",TOOLS,INFORMATION,1479, getClassLoader());

  /**
   * Cannot write to rejected entries file %s.  Verify that you have enough write rights on the file
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_INSTALLDS_CANNOT_WRITE_REJECTED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_INSTALLDS_CANNOT_WRITE_REJECTED_1480",TOOLS,MILD_ERROR,1480, getClassLoader());

  /**
   * Write rejected entries to file:
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_PROMPT_REJECTED_FILE =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_PROMPT_REJECTED_FILE_1481",TOOLS,INFORMATION,1481, getClassLoader());

  /**
   * Write skipped entries to the specified file
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_DESCRIPTION_SKIPPED_FILE =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_DESCRIPTION_SKIPPED_FILE_1482",TOOLS,INFORMATION,1482, getClassLoader());

  /**
   * Cannot write to skipped entries file %s.  Verify that you have enough write rights on the file
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_INSTALLDS_CANNOT_WRITE_SKIPPED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_INSTALLDS_CANNOT_WRITE_SKIPPED_1483",TOOLS,MILD_ERROR,1483, getClassLoader());

  /**
   * Write skipped entries to file:
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_PROMPT_SKIPPED_FILE =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_PROMPT_SKIPPED_FILE_1484",TOOLS,INFORMATION,1484, getClassLoader());

  /**
   * The maximum number of tries to provide the certificate key store PIN is %s.  Install canceled
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_INSTALLDS_TOO_MANY_KEYSTORE_PASSWORD_TRIES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_INSTALLDS_TOO_MANY_KEYSTORE_PASSWORD_TRIES_1485",TOOLS,SEVERE_ERROR,1485, getClassLoader());

  /**
   * This utility can be used to change the java arguments and java home that are used by the different server commands.%n%nBefore launching the command, edit the properties file located in %s to specify the java arguments and java home. When you have edited the properties file, run this command for the changes to be taken into account.%n%nNote that the changes will only apply to this server installation. No modifications will be made to your environment variables
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_JAVAPROPERTIES_TOOL_DESCRIPTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_JAVAPROPERTIES_TOOL_DESCRIPTION_1486",TOOLS,INFORMATION,1486, getClassLoader());

  /**
   * Run the tool in quiet mode.  Quiet mode will not output progress information to standard output
   */
  public static final MessageDescriptor.Arg0 INFO_JAVAPROPERTIES_DESCRIPTION_SILENT =
          new MessageDescriptor.Arg0(BASE,"INFO_JAVAPROPERTIES_DESCRIPTION_SILENT_1487",TOOLS,INFORMATION,1487, getClassLoader());

  /**
   * The properties file to be used to generate the scripts.  If this attribute is not specified %s will be used
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_JAVAPROPERTIES_DESCRIPTION_PROPERTIES_FILE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_JAVAPROPERTIES_DESCRIPTION_PROPERTIES_FILE_1488",TOOLS,INFORMATION,1488, getClassLoader());

  /**
   * The script file that will be written.  If not specified %s will be written
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_JAVAPROPERTIES_DESCRIPTION_DESTINATION_FILE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_JAVAPROPERTIES_DESCRIPTION_DESTINATION_FILE_1489",TOOLS,INFORMATION,1489, getClassLoader());

  /**
   * Display this usage information
   */
  public static final MessageDescriptor.Arg0 INFO_JAVAPROPERTIES_DESCRIPTION_HELP =
          new MessageDescriptor.Arg0(BASE,"INFO_JAVAPROPERTIES_DESCRIPTION_HELP_1490",TOOLS,INFORMATION,1490, getClassLoader());

  /**
   * The file properties "%s" cannot be read.  Check that it exists and that you have read rights to it
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JAVAPROPERTIES_WITH_PROPERTIES_FILE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_JAVAPROPERTIES_WITH_PROPERTIES_FILE_1491",TOOLS,SEVERE_ERROR,1491, getClassLoader());

  /**
   * The destination file "%s" cannot be written.  Check that you have write rights to it
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JAVAPROPERTIES_WITH_DESTINATION_FILE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_JAVAPROPERTIES_WITH_DESTINATION_FILE_1492",TOOLS,SEVERE_ERROR,1492, getClassLoader());

  /**
   * The destination file "%s" cannot be written.  Check that you have right reads to it
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JAVAPROPERTIES_WRITING_DESTINATION_FILE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_JAVAPROPERTIES_WRITING_DESTINATION_FILE_1493",TOOLS,SEVERE_ERROR,1493, getClassLoader());

  /**
   * The script file %s was successfully created.  For the command-lines to use the java properties specified on %s you must copy the created script file to %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> INFO_JAVAPROPERTIES_SUCCESSFUL_NON_DEFAULT =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"INFO_JAVAPROPERTIES_SUCCESSFUL_NON_DEFAULT_1494",TOOLS,INFORMATION,1494, getClassLoader());

  /**
   * The operation was successful.  The server commands will use the java arguments and java home specified in the properties file located in %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_JAVAPROPERTIES_SUCCESSFUL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_JAVAPROPERTIES_SUCCESSFUL_1495",TOOLS,INFORMATION,1495, getClassLoader());

  /**
   * When this is set test if the command must be run in offline or online mode, returning the appropriate error code
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_TEST_IF_OFFLINE =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_TEST_IF_OFFLINE_1496",TOOLS,INFORMATION,1496, getClassLoader());

  /**
   * The backend ID '%s' has been specified several times
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_BACKUPDB_REPEATED_BACKEND_ID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_BACKUPDB_REPEATED_BACKEND_ID_1497",TOOLS,SEVERE_ERROR,1497, getClassLoader());

  /**
   * ERROR:  The empty LDAP DN is not a valid value
   */
  public static final MessageDescriptor.Arg0 ERR_INSTALLDS_EMPTY_DN_RESPONSE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_INSTALLDS_EMPTY_DN_RESPONSE_1498",TOOLS,MILD_ERROR,1498, getClassLoader());

  /**
   * {file}
   */
  public static final MessageDescriptor.Arg0 INFO_FILE_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_FILE_PLACEHOLDER_1499",TOOLS,INFORMATION,1499, getClassLoader());

  /**
   * {directory}
   */
  public static final MessageDescriptor.Arg0 INFO_DIRECTORY_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_DIRECTORY_PLACEHOLDER_1500",TOOLS,INFORMATION,1500, getClassLoader());

  /**
   * {configFile}
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIGFILE_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIGFILE_PLACEHOLDER_1501",TOOLS,INFORMATION,1501, getClassLoader());

  /**
   * {ldifFile}
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFFILE_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFFILE_PLACEHOLDER_1502",TOOLS,INFORMATION,1502, getClassLoader());

  /**
   * {seed}
   */
  public static final MessageDescriptor.Arg0 INFO_SEED_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_SEED_PLACEHOLDER_1503",TOOLS,INFORMATION,1503, getClassLoader());

  /**
   * {keyStorePath}
   */
  public static final MessageDescriptor.Arg0 INFO_KEYSTOREPATH_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_KEYSTOREPATH_PLACEHOLDER_1504",TOOLS,INFORMATION,1504, getClassLoader());

  /**
   * {trustStorePath}
   */
  public static final MessageDescriptor.Arg0 INFO_TRUSTSTOREPATH_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_TRUSTSTOREPATH_PLACEHOLDER_1505",TOOLS,INFORMATION,1505, getClassLoader());

  /**
   * {bindPasswordFile}
   */
  public static final MessageDescriptor.Arg0 INFO_BINDPWD_FILE_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_BINDPWD_FILE_PLACEHOLDER_1506",TOOLS,INFORMATION,1506, getClassLoader());

  /**
   * {configClass}
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIGCLASS_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIGCLASS_PLACEHOLDER_1507",TOOLS,INFORMATION,1507, getClassLoader());

  /**
   * {host}
   */
  public static final MessageDescriptor.Arg0 INFO_HOST_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_HOST_PLACEHOLDER_1508",TOOLS,INFORMATION,1508, getClassLoader());

  /**
   * {port}
   */
  public static final MessageDescriptor.Arg0 INFO_PORT_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_PORT_PLACEHOLDER_1509",TOOLS,INFORMATION,1509, getClassLoader());

  /**
   * {baseDN}
   */
  public static final MessageDescriptor.Arg0 INFO_BASEDN_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_BASEDN_PLACEHOLDER_1510",TOOLS,INFORMATION,1510, getClassLoader());

  /**
   * {rootUserDN}
   */
  public static final MessageDescriptor.Arg0 INFO_ROOT_USER_DN_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_ROOT_USER_DN_PLACEHOLDER_1511",TOOLS,INFORMATION,1511, getClassLoader());

  /**
   * {bindDN}
   */
  public static final MessageDescriptor.Arg0 INFO_BINDDN_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_BINDDN_PLACEHOLDER_1512",TOOLS,INFORMATION,1512, getClassLoader());

  /**
   * {bindPassword}
   */
  public static final MessageDescriptor.Arg0 INFO_BINDPWD_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_BINDPWD_PLACEHOLDER_1513",TOOLS,INFORMATION,1513, getClassLoader());

  /**
   * {keyStorePassword}
   */
  public static final MessageDescriptor.Arg0 INFO_KEYSTORE_PWD_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_KEYSTORE_PWD_PLACEHOLDER_1514",TOOLS,INFORMATION,1514, getClassLoader());

  /**
   * {path}
   */
  public static final MessageDescriptor.Arg0 INFO_PATH_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_PATH_PLACEHOLDER_1515",TOOLS,INFORMATION,1515, getClassLoader());

  /**
   * {path}
   */
  public static final MessageDescriptor.Arg0 INFO_TRUSTSTORE_PWD_FILE_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_TRUSTSTORE_PWD_FILE_PLACEHOLDER_1516",TOOLS,INFORMATION,1516, getClassLoader());

  /**
   * {trustStorePassword}
   */
  public static final MessageDescriptor.Arg0 INFO_TRUSTSTORE_PWD_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_TRUSTSTORE_PWD_PLACEHOLDER_1517",TOOLS,INFORMATION,1517, getClassLoader());

  /**
   * {nickname}
   */
  public static final MessageDescriptor.Arg0 INFO_NICKNAME_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_NICKNAME_PLACEHOLDER_1518",TOOLS,INFORMATION,1518, getClassLoader());

  /**
   * {filter}
   */
  public static final MessageDescriptor.Arg0 INFO_ASSERTION_FILTER_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_ASSERTION_FILTER_PLACEHOLDER_1519",TOOLS,INFORMATION,1519, getClassLoader());

  /**
   * {filter}
   */
  public static final MessageDescriptor.Arg0 INFO_FILTER_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_FILTER_PLACEHOLDER_1520",TOOLS,INFORMATION,1520, getClassLoader());

  /**
   * {authzID}
   */
  public static final MessageDescriptor.Arg0 INFO_PROXYAUTHID_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_PROXYAUTHID_PLACEHOLDER_1521",TOOLS,INFORMATION,1521, getClassLoader());

  /**
   * {name=value}
   */
  public static final MessageDescriptor.Arg0 INFO_SASL_OPTION_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_SASL_OPTION_PLACEHOLDER_1522",TOOLS,INFORMATION,1522, getClassLoader());

  /**
   * {version}
   */
  public static final MessageDescriptor.Arg0 INFO_PROTOCOL_VERSION_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_PROTOCOL_VERSION_PLACEHOLDER_1523",TOOLS,INFORMATION,1523, getClassLoader());

  /**
   * {description}
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PLACEHOLDER_1524",TOOLS,INFORMATION,1524, getClassLoader());

  /**
   * {groupName}
   */
  public static final MessageDescriptor.Arg0 INFO_GROUPNAME_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_GROUPNAME_PLACEHOLDER_1525",TOOLS,INFORMATION,1525, getClassLoader());

  /**
   * {memberName}
   */
  public static final MessageDescriptor.Arg0 INFO_MEMBERNAME_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_MEMBERNAME_PLACEHOLDER_1526",TOOLS,INFORMATION,1526, getClassLoader());

  /**
   * {backendName}
   */
  public static final MessageDescriptor.Arg0 INFO_BACKENDNAME_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_BACKENDNAME_PLACEHOLDER_1527",TOOLS,INFORMATION,1527, getClassLoader());

  /**
   * {serverID}
   */
  public static final MessageDescriptor.Arg0 INFO_SERVERID_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_SERVERID_PLACEHOLDER_1528",TOOLS,INFORMATION,1528, getClassLoader());

  /**
   * {userID}
   */
  public static final MessageDescriptor.Arg0 INFO_USERID_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_USERID_PLACEHOLDER_1529",TOOLS,INFORMATION,1529, getClassLoader());

  /**
   * {PROP:VALUE}
   */
  public static final MessageDescriptor.Arg0 INFO_VALUE_SET_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_VALUE_SET_PLACEHOLDER_1530",TOOLS,INFORMATION,1530, getClassLoader());

  /**
   * {startTime}
   */
  public static final MessageDescriptor.Arg0 INFO_START_DATETIME_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_START_DATETIME_PLACEHOLDER_1531",TOOLS,INFORMATION,1531, getClassLoader());

  /**
   * {propertiesFilePath}
   */
  public static final MessageDescriptor.Arg0 INFO_PROP_FILE_PATH_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_PROP_FILE_PATH_PLACEHOLDER_1532",TOOLS,INFORMATION,1532, getClassLoader());

  /**
   * {emailAddress}
   */
  public static final MessageDescriptor.Arg0 INFO_EMAIL_ADDRESS_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_EMAIL_ADDRESS_PLACEHOLDER_1533",TOOLS,INFORMATION,1533, getClassLoader());

  /**
   * {taskID}
   */
  public static final MessageDescriptor.Arg0 INFO_TASK_ID_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_TASK_ID_PLACEHOLDER_1534",TOOLS,INFORMATION,1534, getClassLoader());

  /**
   * {action}
   */
  public static final MessageDescriptor.Arg0 INFO_ACTION_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_ACTION_PLACEHOLDER_1535",TOOLS,INFORMATION,1535, getClassLoader());

  /**
   * {type}
   */
  public static final MessageDescriptor.Arg0 INFO_TYPE_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_TYPE_PLACEHOLDER_1536",TOOLS,INFORMATION,1536, getClassLoader());

  /**
   * {category}
   */
  public static final MessageDescriptor.Arg0 INFO_CATEGORY_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_CATEGORY_PLACEHOLDER_1537",TOOLS,INFORMATION,1537, getClassLoader());

  /**
   * {property}
   */
  public static final MessageDescriptor.Arg0 INFO_PROPERTY_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_PROPERTY_PLACEHOLDER_1538",TOOLS,INFORMATION,1538, getClassLoader());

  /**
   * {name}
   */
  public static final MessageDescriptor.Arg0 INFO_NAME_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_NAME_PLACEHOLDER_1539",TOOLS,INFORMATION,1539, getClassLoader());

  /**
   * {unit}
   */
  public static final MessageDescriptor.Arg0 INFO_UNIT_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_UNIT_PLACEHOLDER_1540",TOOLS,INFORMATION,1540, getClassLoader());

  /**
   * {backupID}
   */
  public static final MessageDescriptor.Arg0 INFO_BACKUPID_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_BACKUPID_PLACEHOLDER_1541",TOOLS,INFORMATION,1541, getClassLoader());

  /**
   * {backupDir}
   */
  public static final MessageDescriptor.Arg0 INFO_BACKUPDIR_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_BACKUPDIR_PLACEHOLDER_1542",TOOLS,INFORMATION,1542, getClassLoader());

  /**
   * {ldapPort}
   */
  public static final MessageDescriptor.Arg0 INFO_LDAPPORT_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAPPORT_PLACEHOLDER_1543",TOOLS,INFORMATION,1543, getClassLoader());

  /**
   * {jmxPort}
   */
  public static final MessageDescriptor.Arg0 INFO_JMXPORT_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_JMXPORT_PLACEHOLDER_1544",TOOLS,INFORMATION,1544, getClassLoader());

  /**
   * {keyManagerProviderDN}
   */
  public static final MessageDescriptor.Arg0 INFO_KEY_MANAGER_PROVIDER_DN_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_KEY_MANAGER_PROVIDER_DN_PLACEHOLDER_1545",TOOLS,INFORMATION,1545, getClassLoader());

  /**
   * {trustManagerProviderDN}
   */
  public static final MessageDescriptor.Arg0 INFO_TRUST_MANAGER_PROVIDER_DN_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_TRUST_MANAGER_PROVIDER_DN_PLACEHOLDER_1546",TOOLS,INFORMATION,1546, getClassLoader());

  /**
   * {keyManagerPath}
   */
  public static final MessageDescriptor.Arg0 INFO_KEY_MANAGER_PATH_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_KEY_MANAGER_PATH_PLACEHOLDER_1547",TOOLS,INFORMATION,1547, getClassLoader());

  /**
   * {rootUserPassword}
   */
  public static final MessageDescriptor.Arg0 INFO_ROOT_USER_PWD_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_ROOT_USER_PWD_PLACEHOLDER_1548",TOOLS,INFORMATION,1548, getClassLoader());

  /**
   * {serverRootDir}
   */
  public static final MessageDescriptor.Arg0 INFO_SERVER_ROOT_DIR_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_SERVER_ROOT_DIR_PLACEHOLDER_1549",TOOLS,INFORMATION,1549, getClassLoader());

  /**
   * {serviceName}
   */
  public static final MessageDescriptor.Arg0 INFO_SERVICE_NAME_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_SERVICE_NAME_PLACEHOLDER_1550",TOOLS,INFORMATION,1550, getClassLoader());

  /**
   * {userName}
   */
  public static final MessageDescriptor.Arg0 INFO_USER_NAME_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_USER_NAME_PLACEHOLDER_1551",TOOLS,INFORMATION,1551, getClassLoader());

  /**
   * {args}
   */
  public static final MessageDescriptor.Arg0 INFO_ARGS_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_ARGS_PLACEHOLDER_1552",TOOLS,INFORMATION,1552, getClassLoader());

  /**
   * {databaseName}
   */
  public static final MessageDescriptor.Arg0 INFO_DATABASE_NAME_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_DATABASE_NAME_PLACEHOLDER_1553",TOOLS,INFORMATION,1553, getClassLoader());

  /**
   * {maxKeyValue}
   */
  public static final MessageDescriptor.Arg0 INFO_MAX_KEY_VALUE_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_MAX_KEY_VALUE_PLACEHOLDER_1554",TOOLS,INFORMATION,1554, getClassLoader());

  /**
   * {minKeyValue}
   */
  public static final MessageDescriptor.Arg0 INFO_MIN_KEY_VALUE_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_MIN_KEY_VALUE_PLACEHOLDER_1555",TOOLS,INFORMATION,1555, getClassLoader());

  /**
   * {maxDataSize}
   */
  public static final MessageDescriptor.Arg0 INFO_MAX_DATA_SIZE_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_MAX_DATA_SIZE_PLACEHOLDER_1556",TOOLS,INFORMATION,1556, getClassLoader());

  /**
   * {minDataSize}
   */
  public static final MessageDescriptor.Arg0 INFO_MIN_DATA_SIZE_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_MIN_DATA_SIZE_PLACEHOLDER_1557",TOOLS,INFORMATION,1557, getClassLoader());

  /**
   * {clearPW}
   */
  public static final MessageDescriptor.Arg0 INFO_CLEAR_PWD =
          new MessageDescriptor.Arg0(BASE,"INFO_CLEAR_PWD_1558",TOOLS,INFORMATION,1558, getClassLoader());

  /**
   * {encodedPW}
   */
  public static final MessageDescriptor.Arg0 INFO_ENCODED_PWD_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_ENCODED_PWD_PLACEHOLDER_1559",TOOLS,INFORMATION,1559, getClassLoader());

  /**
   * {scheme}
   */
  public static final MessageDescriptor.Arg0 INFO_STORAGE_SCHEME_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_STORAGE_SCHEME_PLACEHOLDER_1560",TOOLS,INFORMATION,1560, getClassLoader());

  /**
   * {branchDN}
   */
  public static final MessageDescriptor.Arg0 INFO_BRANCH_DN_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_BRANCH_DN_PLACEHOLDER_1561",TOOLS,INFORMATION,1561, getClassLoader());

  /**
   * {attribute}
   */
  public static final MessageDescriptor.Arg0 INFO_ATTRIBUTE_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_ATTRIBUTE_PLACEHOLDER_1562",TOOLS,INFORMATION,1562, getClassLoader());

  /**
   * {wrapColumn}
   */
  public static final MessageDescriptor.Arg0 INFO_WRAP_COLUMN_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_WRAP_COLUMN_PLACEHOLDER_1563",TOOLS,INFORMATION,1563, getClassLoader());

  /**
   * {templateFile}
   */
  public static final MessageDescriptor.Arg0 INFO_TEMPLATE_FILE_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_TEMPLATE_FILE_PLACEHOLDER_1564",TOOLS,INFORMATION,1564, getClassLoader());

  /**
   * {rejectFile}
   */
  public static final MessageDescriptor.Arg0 INFO_REJECT_FILE_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_REJECT_FILE_PLACEHOLDER_1565",TOOLS,INFORMATION,1565, getClassLoader());

  /**
   * {skipFile}
   */
  public static final MessageDescriptor.Arg0 INFO_SKIP_FILE_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_SKIP_FILE_PLACEHOLDER_1566",TOOLS,INFORMATION,1566, getClassLoader());

  /**
   * {programName}
   */
  public static final MessageDescriptor.Arg0 INFO_PROGRAM_NAME_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_PROGRAM_NAME_PLACEHOLDER_1567",TOOLS,INFORMATION,1567, getClassLoader());

  /**
   * {numEntries}
   */
  public static final MessageDescriptor.Arg0 INFO_NUM_ENTRIES_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_NUM_ENTRIES_PLACEHOLDER_1568",TOOLS,INFORMATION,1568, getClassLoader());

  /**
   * {rootUserPasswordFile}
   */
  public static final MessageDescriptor.Arg0 INFO_ROOT_USER_PWD_FILE_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_ROOT_USER_PWD_FILE_PLACEHOLDER_1569",TOOLS,INFORMATION,1569, getClassLoader());

  /**
   * {controloid[:criticality[:value|::b64value|:<filePath]]}
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONTROL_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONTROL_PLACEHOLDER_1570",TOOLS,INFORMATION,1570, getClassLoader());

  /**
   * {encoding}
   */
  public static final MessageDescriptor.Arg0 INFO_ENCODING_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_ENCODING_PLACEHOLDER_1571",TOOLS,INFORMATION,1571, getClassLoader());

  /**
   * {attrList}
   */
  public static final MessageDescriptor.Arg0 INFO_ATTRIBUTE_LIST_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_ATTRIBUTE_LIST_PLACEHOLDER_1572",TOOLS,INFORMATION,1572, getClassLoader());

  /**
   * {newPassword}
   */
  public static final MessageDescriptor.Arg0 INFO_NEW_PASSWORD_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_NEW_PASSWORD_PLACEHOLDER_1573",TOOLS,INFORMATION,1573, getClassLoader());

  /**
   * {currentPassword}
   */
  public static final MessageDescriptor.Arg0 INFO_CURRENT_PASSWORD_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_CURRENT_PASSWORD_PLACEHOLDER_1574",TOOLS,INFORMATION,1574, getClassLoader());

  /**
   * {searchScope}
   */
  public static final MessageDescriptor.Arg0 INFO_SEARCH_SCOPE_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_SEARCH_SCOPE_PLACEHOLDER_1575",TOOLS,INFORMATION,1575, getClassLoader());

  /**
   * {sortOrder}
   */
  public static final MessageDescriptor.Arg0 INFO_SORT_ORDER_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_SORT_ORDER_PLACEHOLDER_1576",TOOLS,INFORMATION,1576, getClassLoader());

  /**
   * {before:after:index:count | before:after:value}
   */
  public static final MessageDescriptor.Arg0 INFO_VLV_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_VLV_PLACEHOLDER_1577",TOOLS,INFORMATION,1577, getClassLoader());

  /**
   * {dereferencePolicy}
   */
  public static final MessageDescriptor.Arg0 INFO_DEREFERENCE_POLICE_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_DEREFERENCE_POLICE_PLACEHOLDER_1578",TOOLS,INFORMATION,1578, getClassLoader());

  /**
   * {sizeLimit}
   */
  public static final MessageDescriptor.Arg0 INFO_SIZE_LIMIT_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_SIZE_LIMIT_PLACEHOLDER_1579",TOOLS,INFORMATION,1579, getClassLoader());

  /**
   * {timeLimit}
   */
  public static final MessageDescriptor.Arg0 INFO_TIME_LIMIT_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_TIME_LIMIT_PLACEHOLDER_1580",TOOLS,INFORMATION,1580, getClassLoader());

  /**
   * {scope}
   */
  public static final MessageDescriptor.Arg0 INFO_SCOPE_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_SCOPE_PLACEHOLDER_1581",TOOLS,INFORMATION,1581, getClassLoader());

  /**
   * {filterFile}
   */
  public static final MessageDescriptor.Arg0 INFO_FILTER_FILE_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_FILTER_FILE_PLACEHOLDER_1582",TOOLS,INFORMATION,1582, getClassLoader());

  /**
   * {outputFile}
   */
  public static final MessageDescriptor.Arg0 INFO_OUTPUT_FILE_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_OUTPUT_FILE_PLACEHOLDER_1583",TOOLS,INFORMATION,1583, getClassLoader());

  /**
   * {targetDN}
   */
  public static final MessageDescriptor.Arg0 INFO_TARGETDN_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_TARGETDN_PLACEHOLDER_1584",TOOLS,INFORMATION,1584, getClassLoader());

  /**
   * {time}
   */
  public static final MessageDescriptor.Arg0 INFO_TIME_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_TIME_PLACEHOLDER_1585",TOOLS,INFORMATION,1585, getClassLoader());

  /**
   * {true|false}
   */
  public static final MessageDescriptor.Arg0 INFO_TRUE_FALSE_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_TRUE_FALSE_PLACEHOLDER_1586",TOOLS,INFORMATION,1586, getClassLoader());

  /**
   * {index}
   */
  public static final MessageDescriptor.Arg0 INFO_INDEX_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_INDEX_PLACEHOLDER_1587",TOOLS,INFORMATION,1587, getClassLoader());

  /**
   * {stopReason}
   */
  public static final MessageDescriptor.Arg0 INFO_STOP_REASON_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_STOP_REASON_PLACEHOLDER_1588",TOOLS,INFORMATION,1588, getClassLoader());

  /**
   * {stopTime}
   */
  public static final MessageDescriptor.Arg0 INFO_STOP_TIME_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_STOP_TIME_PLACEHOLDER_1589",TOOLS,INFORMATION,1589, getClassLoader());

  /**
   * {seconds}
   */
  public static final MessageDescriptor.Arg0 INFO_SECONDS_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_SECONDS_PLACEHOLDER_1590",TOOLS,INFORMATION,1590, getClassLoader());

  /**
   * {data}
   */
  public static final MessageDescriptor.Arg0 INFO_DATA_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_DATA_PLACEHOLDER_1591",TOOLS,INFORMATION,1591, getClassLoader());

  /**
   * {address}
   */
  public static final MessageDescriptor.Arg0 INFO_ADDRESS_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_ADDRESS_PLACEHOLDER_1592",TOOLS,INFORMATION,1592, getClassLoader());

  /**
   * {subject}
   */
  public static final MessageDescriptor.Arg0 INFO_SUBJECT_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_SUBJECT_PLACEHOLDER_1593",TOOLS,INFORMATION,1593, getClassLoader());

  /**
   * {adminUID}
   */
  public static final MessageDescriptor.Arg0 INFO_ADMINUID_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_ADMINUID_PLACEHOLDER_1594",TOOLS,INFORMATION,1594, getClassLoader());

  /**
   * {keyStorePasswordFile}
   */
  public static final MessageDescriptor.Arg0 INFO_KEYSTORE_PWD_FILE_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_KEYSTORE_PWD_FILE_PLACEHOLDER_1595",TOOLS,INFORMATION,1595, getClassLoader());

  /**
   * ps[:changetype[:changesonly[:entrychgcontrols]]]
   */
  public static final MessageDescriptor.Arg0 INFO_PSEARCH_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_PSEARCH_PLACEHOLDER_1596",TOOLS,INFORMATION,1596, getClassLoader());

  /**
   * true
   */
  public static final MessageDescriptor.Arg0 INFO_MULTICHOICE_TRUE_VALUE =
          new MessageDescriptor.Arg0(BASE,"INFO_MULTICHOICE_TRUE_VALUE_1597",TOOLS,INFORMATION,1597, getClassLoader());

  /**
   * false
   */
  public static final MessageDescriptor.Arg0 INFO_MULTICHOICE_FALSE_VALUE =
          new MessageDescriptor.Arg0(BASE,"INFO_MULTICHOICE_FALSE_VALUE_1598",TOOLS,INFORMATION,1598, getClassLoader());

  /**
   * JMX Listener Port:
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_SERVER_JMXPORT_LABEL =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_SERVER_JMXPORT_LABEL_1599",TOOLS,INFORMATION,1599, getClassLoader());

  /**
   * Start Server when the configuration is completed
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_START_SERVER =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_START_SERVER_1600",TOOLS,INFORMATION,1600, getClassLoader());

  /**
   * Do not start Server when the configuration is completed
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_DO_NOT_START_SERVER =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_DO_NOT_START_SERVER_1601",TOOLS,INFORMATION,1601, getClassLoader());

  /**
   * Setup Summary%n=============
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_SUMMARY_1602",TOOLS,INFORMATION,1602, getClassLoader());

  /**
   * What would you like to do?
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_CONFIRM_INSTALL_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_CONFIRM_INSTALL_PROMPT_1603",TOOLS,INFORMATION,1603, getClassLoader());

  /**
   * Set up the server with the parameters above
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_CONFIRM_INSTALL =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_CONFIRM_INSTALL_1604",TOOLS,INFORMATION,1604, getClassLoader());

  /**
   * Provide the setup parameters again
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_PROVIDE_DATA_AGAIN =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_PROVIDE_DATA_AGAIN_1605",TOOLS,INFORMATION,1605, getClassLoader());

  /**
   * Cancel and exit
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_CANCEL =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_CANCEL_1606",TOOLS,INFORMATION,1606, getClassLoader());

  /**
   * An error occurred while attempting to update the crypto manager in the Directory Server: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIGDS_CANNOT_UPDATE_CRYPTO_MANAGER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIGDS_CANNOT_UPDATE_CRYPTO_MANAGER_1607",TOOLS,SEVERE_ERROR,1607, getClassLoader());

  /**
   * %s task %s has been successfully completed
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_TASK_TOOL_TASK_SUCESSFULL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_TASK_TOOL_TASK_SUCESSFULL_1608",TOOLS,INFORMATION,1608, getClassLoader());

  /**
   * %s task %s did not complete successfully
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_TASK_TOOL_TASK_NOT_SUCESSFULL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_TASK_TOOL_TASK_NOT_SUCESSFULL_1609",TOOLS,INFORMATION,1609, getClassLoader());

  /**
   * Cannot access trust store '%s'.  Verify that the provided trust store exists and that you have read access rights to it
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CANNOT_READ_TRUSTSTORE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CANNOT_READ_TRUSTSTORE_1610",TOOLS,SEVERE_ERROR,1610, getClassLoader());

  /**
   * Cannot access key store '%s'.  Verify that the provided key store exists and that you have read access rights to it
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CANNOT_READ_KEYSTORE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CANNOT_READ_KEYSTORE_1611",TOOLS,SEVERE_ERROR,1611, getClassLoader());

  /**
   * File containing a list of attributes to ignore when computing the difference
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFDIFF_DESCRIPTION_IGNORE_ATTRS =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFDIFF_DESCRIPTION_IGNORE_ATTRS_1612",TOOLS,INFORMATION,1612, getClassLoader());

  /**
   * File containing a list of entries (DN) to ignore when computing the difference
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFDIFF_DESCRIPTION_IGNORE_ENTRIES =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFDIFF_DESCRIPTION_IGNORE_ENTRIES_1613",TOOLS,INFORMATION,1613, getClassLoader());

  /**
   * An error occurred while attempting to read the file '%s' containing the list of ignored entries: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIFDIFF_CANNOT_READ_FILE_IGNORE_ENTRIES =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIFDIFF_CANNOT_READ_FILE_IGNORE_ENTRIES_1614",TOOLS,SEVERE_ERROR,1614, getClassLoader());

  /**
   * An error occurred while attempting to read the file '%s' containing the list of ignored attributes: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIFDIFF_CANNOT_READ_FILE_IGNORE_ATTRIBS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIFDIFF_CANNOT_READ_FILE_IGNORE_ATTRIBS_1615",TOOLS,SEVERE_ERROR,1615, getClassLoader());

  /**
   * The string '%s' from file '%s' could not be parsed as a dn
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_LDIFDIFF_CANNOT_PARSE_STRING_AS_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_LDIFDIFF_CANNOT_PARSE_STRING_AS_DN_1616",TOOLS,INFORMATION,1616, getClassLoader());

  /**
   * The %s operation change number is %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_CHANGE_NUMBER_CONTROL_RESULT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_CHANGE_NUMBER_CONTROL_RESULT_1617",TOOLS,INFORMATION,1617, getClassLoader());

  /**
   * On which port would you like the Administration Connector to accept connections?
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_PROMPT_ADMINCONNECTORPORT =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_PROMPT_ADMINCONNECTORPORT_1618",TOOLS,INFORMATION,1618, getClassLoader());

  /**
   * Port on which the Administration Connector should listen for communication
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_DESCRIPTION_ADMINCONNECTORPORT =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_DESCRIPTION_ADMINCONNECTORPORT_1619",TOOLS,INFORMATION,1619, getClassLoader());

  /**
   * An error occurred while attempting to update the administration connector port:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIGDS_CANNOT_UPDATE_ADMIN_CONNECTOR_PORT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIGDS_CANNOT_UPDATE_ADMIN_CONNECTOR_PORT_1620",TOOLS,SEVERE_ERROR,1620, getClassLoader());

  /**
   * Error connecting to the directory server at %s on %s. Check this port is an administration port
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_TASKINFO_LDAP_EXCEPTION_SSL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_TASKINFO_LDAP_EXCEPTION_SSL_1621",TOOLS,SEVERE_ERROR,1621, getClassLoader());

  /**
   * Directory server administration port number
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_ADMIN_PORT =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_ADMIN_PORT_1622",TOOLS,INFORMATION,1622, getClassLoader());

  /**
   * Path of a JCEKS containing a certificate to be used as the server certificate
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_DESCRIPTION_USE_JCEKS =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_DESCRIPTION_USE_JCEKS_1623",TOOLS,INFORMATION,1623, getClassLoader());

  /**
   * Use an existing certificate located on a JCEKS key store
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_CERT_OPTION_JCEKS =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_CERT_OPTION_JCEKS_1624",TOOLS,INFORMATION,1624, getClassLoader());

  /**
   * JCEKS Key Store path:
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_PROMPT_JCEKS_PATH =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_PROMPT_JCEKS_PATH_1625",TOOLS,INFORMATION,1625, getClassLoader());

  /**
   * Error creating JCEKS Key Provider configuration:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_KEYMANAGER_CANNOT_CREATE_JCEKS_PROVIDER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_KEYMANAGER_CANNOT_CREATE_JCEKS_PROVIDER_1626",TOOLS,SEVERE_ERROR,1626, getClassLoader());

  /**
   * Error creating JCEKS Trust Manager configuration:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_KEYMANAGER_CANNOT_CREATE_JCEKS_TRUST_MANAGER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_KEYMANAGER_CANNOT_CREATE_JCEKS_TRUST_MANAGER_1627",TOOLS,SEVERE_ERROR,1627, getClassLoader());

  /**
   * ERROR:  Cannot establish a connection to the Directory Server at %s on port %s. Check this port is an administration port
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_STOPDS_CANNOT_CONNECT_SSL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_STOPDS_CANNOT_CONNECT_SSL_1628",TOOLS,SEVERE_ERROR,1628, getClassLoader());

  /**
   * ERROR:  Cannot establish a connection to the Directory Server at %s on port %s. Check this port is an administration port
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPSTATE_CANNOT_CONNECT_SSL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPSTATE_CANNOT_CONNECT_SSL_1629",TOOLS,SEVERE_ERROR,1629, getClassLoader());

  /**
   * {instancePath}
   */
  public static final MessageDescriptor.Arg0 INFO_IPATH_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_IPATH_PLACEHOLDER_1630",TOOLS,INFORMATION,1630, getClassLoader());

  /**
   * {currentUser}
   */
  public static final MessageDescriptor.Arg0 INFO_CURRENT_USER_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_CURRENT_USER_PLACEHOLDER_1631",TOOLS,INFORMATION,1631, getClassLoader());

  /**
   * Path where the instance will be located
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIGURE_DESCRIPTION_IPATH =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIGURE_DESCRIPTION_IPATH_1632",TOOLS,INFORMATION,1632, getClassLoader());

  /**
   * User name of the owner of the instance
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIGURE_DESCRIPTION_USERNAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIGURE_DESCRIPTION_USERNAME_1633",TOOLS,INFORMATION,1633, getClassLoader());

  /**
   * Group name of the owner of the instance
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIGURE_DESCRIPTION_GROUPNAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIGURE_DESCRIPTION_GROUPNAME_1634",TOOLS,INFORMATION,1634, getClassLoader());

  /**
   * This utility sets the instance location
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIGURE_USAGE_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIGURE_USAGE_DESCRIPTION_1635",TOOLS,INFORMATION,1635, getClassLoader());

  /**
   * [%s] is not a directory. Only directories can be used as {instancePath}
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIGURE_NOT_DIRECTORY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIGURE_NOT_DIRECTORY_1636",TOOLS,SEVERE_ERROR,1636, getClassLoader());

  /**
   * [%s] is not empty. Only empty directories can be used as {instancePath}
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIGURE_DIRECTORY_NOT_EMPTY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIGURE_DIRECTORY_NOT_EMPTY_1637",TOOLS,SEVERE_ERROR,1637, getClassLoader());

  /**
   * [%s] is not writable. Cannot create Directory Server instance
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIGURE_DIRECTORY_NOT_WRITABLE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIGURE_DIRECTORY_NOT_WRITABLE_1638",TOOLS,SEVERE_ERROR,1638, getClassLoader());

  /**
   * [%s] does not start with a letter. Cannot be specified as {userName}
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIGURE_BAD_USER_NAME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIGURE_BAD_USER_NAME_1639",TOOLS,SEVERE_ERROR,1639, getClassLoader());

  /**
   * Unable to retrieve group for [%s]. Check that [%s] exists
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIGURE_GET_GROUP_ERROR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIGURE_GET_GROUP_ERROR_1640",TOOLS,SEVERE_ERROR,1640, getClassLoader());

  /**
   * Unable to use [%s]/[%s] as {userName}/{groupName}. Check that %s exists and belongs to %s
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> ERR_CONFIGURE_CHMOD_ERROR =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIGURE_CHMOD_ERROR_1641",TOOLS,SEVERE_ERROR,1641, getClassLoader());

  /**
   * Unauthorized user. Only user that can write [%s] can use this command
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIGURE_CURRENT_USER_ERROR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIGURE_CURRENT_USER_ERROR_1642",TOOLS,SEVERE_ERROR,1642, getClassLoader());

  /**
   * This utility checks version and owner of the instance
   */
  public static final MessageDescriptor.Arg0 INFO_CHECK_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_CHECK_DESCRIPTION_1643",TOOLS,INFORMATION,1643, getClassLoader());

  /**
   * Current user
   */
  public static final MessageDescriptor.Arg0 INFO_CHECK_DESCRIPTION_CURRENT_USER =
          new MessageDescriptor.Arg0(BASE,"INFO_CHECK_DESCRIPTION_CURRENT_USER_1644",TOOLS,INFORMATION,1644, getClassLoader());

  /**
   * Specifies that check on version should be done
   */
  public static final MessageDescriptor.Arg0 INFO_CHECK_DESCRIPTION_CHECK_VERSION =
          new MessageDescriptor.Arg0(BASE,"INFO_CHECK_DESCRIPTION_CHECK_VERSION_1645",TOOLS,INFORMATION,1645, getClassLoader());

  /**
   * Current user is not owner of the instance. Only [%s] can run this command
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CHECK_USER_ERROR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CHECK_USER_ERROR_1646",TOOLS,SEVERE_ERROR,1646, getClassLoader());

  /**
   * Data version does not match binaries. Run upgrade script to solve this
   */
  public static final MessageDescriptor.Arg0 ERR_CHECK_VERSION_NOT_MATCH =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CHECK_VERSION_NOT_MATCH_1647",TOOLS,SEVERE_ERROR,1647, getClassLoader());

  /**
   * User [%s] does not exist
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIGURE_USER_NOT_EXIST =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIGURE_USER_NOT_EXIST_1648",TOOLS,SEVERE_ERROR,1648, getClassLoader());

  /**
   * User/role [%s] does not exist. Create it or use --userName option to specify another user
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIGURE_LDAPUSER_NOT_EXIST =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIGURE_LDAPUSER_NOT_EXIST_1649",TOOLS,SEVERE_ERROR,1649, getClassLoader());

  /**
   * The target backend %s cannot be backed up to the backup directory %s: this directory is already a backup location for backend %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_BACKUPDB_CANNOT_BACKUP_IN_DIRECTORY =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_BACKUPDB_CANNOT_BACKUP_IN_DIRECTORY_1650",TOOLS,SEVERE_ERROR,1650, getClassLoader());

  /**
   * {schedulePattern}
   */
  public static final MessageDescriptor.Arg0 INFO_RECURRING_TASK_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_RECURRING_TASK_PLACEHOLDER_1651",TOOLS,INFORMATION,1651, getClassLoader());

  /**
   * An error occurred while attempting to initialize server components to run the encode password tool:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ENCPW_CANNOT_INITIALIZE_SERVER_COMPONENTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_ENCPW_CANNOT_INITIALIZE_SERVER_COMPONENTS_1652",TOOLS,SEVERE_ERROR,1652, getClassLoader());

  /**
   * The %s argument is not supported for online imports
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIFIMPORT_COUNT_REJECTS_REQUIRES_OFFLINE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDIFIMPORT_COUNT_REJECTS_REQUIRES_OFFLINE_1653",TOOLS,SEVERE_ERROR,1653, getClassLoader());

  /**
   * Indicates the task is recurring and will be scheduled according to the value argument expressed in crontab(5) compatible time/date pattern
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_RECURRING_TASK =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_RECURRING_TASK_1654",TOOLS,INFORMATION,1654, getClassLoader());

  /**
   * Recurring %s task %s scheduled successfully
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_TASK_TOOL_RECURRING_TASK_SCHEDULED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_TASK_TOOL_RECURRING_TASK_SCHEDULED_1655",TOOLS,INFORMATION,1655, getClassLoader());

  /**
   * This utility unsets the instance location
   */
  public static final MessageDescriptor.Arg0 INFO_UNCONFIGURE_USAGE_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_UNCONFIGURE_USAGE_DESCRIPTION_1656",TOOLS,INFORMATION,1656, getClassLoader());

  /**
   * Checks options are valid
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_CHECK_OPTIONS =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_CHECK_OPTIONS_1657",TOOLS,INFORMATION,1657, getClassLoader());

  /**
   * Internal Error: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_INTERNAL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"FATAL_ERR_INTERNAL_1658",TOOLS,FATAL_ERROR,1658, getClassLoader());

  /**
   * INSTALL_ROOT property not specified
   */
  public static final MessageDescriptor.Arg0 ERR_INSTALL_ROOT_NOT_SPECIFIED =
          new MessageDescriptor.Arg0(BASE,"FATAL_ERR_INSTALL_ROOT_NOT_SPECIFIED_1659",TOOLS,FATAL_ERROR,1659, getClassLoader());

  /**
   * INSTANCE_ROOT property not specified
   */
  public static final MessageDescriptor.Arg0 ERR_INSTANCE_ROOT_NOT_SPECIFIED =
          new MessageDescriptor.Arg0(BASE,"FATAL_ERR_INSTANCE_ROOT_NOT_SPECIFIED_1660",TOOLS,FATAL_ERROR,1660, getClassLoader());

  /**
   * The "config.ldif" file is not present in the instance directory %s.
   * Instance directory is referenced by %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_LDIF_NOT_FOUND =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"FATAL_ERR_CONFIG_LDIF_NOT_FOUND_1661",TOOLS,FATAL_ERROR,1661, getClassLoader());

  /**
   * Exporting to %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_LDIFEXPORT_PATH_TO_LDIF_FILE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_LDIFEXPORT_PATH_TO_LDIF_FILE_1662",TOOLS,INFORMATION,1662, getClassLoader());

  /**
   * yes
   */
  public static final MessageDescriptor.Arg0 INFO_PROMPT_YES_COMPLETE_ANSWER =
          new MessageDescriptor.Arg0(BASE,"INFO_PROMPT_YES_COMPLETE_ANSWER_1663",TOOLS,INFORMATION,1663, getClassLoader());

  /**
   * y
   */
  public static final MessageDescriptor.Arg0 INFO_PROMPT_YES_FIRST_LETTER_ANSWER =
          new MessageDescriptor.Arg0(BASE,"INFO_PROMPT_YES_FIRST_LETTER_ANSWER_1664",TOOLS,INFORMATION,1664, getClassLoader());

  /**
   * no
   */
  public static final MessageDescriptor.Arg0 INFO_PROMPT_NO_COMPLETE_ANSWER =
          new MessageDescriptor.Arg0(BASE,"INFO_PROMPT_NO_COMPLETE_ANSWER_1665",TOOLS,INFORMATION,1665, getClassLoader());

  /**
   * n
   */
  public static final MessageDescriptor.Arg0 INFO_PROMPT_NO_FIRST_LETTER_ANSWER =
          new MessageDescriptor.Arg0(BASE,"INFO_PROMPT_NO_FIRST_LETTER_ANSWER_1666",TOOLS,INFORMATION,1666, getClassLoader());

  /**
   * The specified start time '%s' has already passed
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_START_DATETIME_ALREADY_PASSED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_START_DATETIME_ALREADY_PASSED_1667",TOOLS,SEVERE_ERROR,1667, getClassLoader());

  /**
   * An error occurred reading file '%s'.  Check that the file exists and that you have read access rights to it.  Details: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAPCOMPARE_ERROR_READING_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDAPCOMPARE_ERROR_READING_FILE_1668",TOOLS,SEVERE_ERROR,1668, getClassLoader());

  /**
   * The specified stop time '%s' has already passed
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_STOPDS_DATETIME_ALREADY_PASSED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_STOPDS_DATETIME_ALREADY_PASSED_1669",TOOLS,SEVERE_ERROR,1669, getClassLoader());

  /**
   * Both entry DNs and a file name were provided for the compare operation.  These arguments are not compatible
   */
  public static final MessageDescriptor.Arg0 ERR_LDAPCOMPARE_FILENAME_AND_DNS =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_LDAPCOMPARE_FILENAME_AND_DNS_1670",TOOLS,SEVERE_ERROR,1670, getClassLoader());

  /**
   * r
   */
  public static final MessageDescriptor.Arg0 INFO_TASKINFO_CMD_REFRESH_CHAR =
          new MessageDescriptor.Arg0(BASE,"INFO_TASKINFO_CMD_REFRESH_CHAR_1671",TOOLS,INFORMATION,1671, getClassLoader());

  /**
   * c
   */
  public static final MessageDescriptor.Arg0 INFO_TASKINFO_CMD_CANCEL_CHAR =
          new MessageDescriptor.Arg0(BASE,"INFO_TASKINFO_CMD_CANCEL_CHAR_1672",TOOLS,INFORMATION,1672, getClassLoader());

  /**
   * l
   */
  public static final MessageDescriptor.Arg0 INFO_TASKINFO_CMD_VIEW_LOGS_CHAR =
          new MessageDescriptor.Arg0(BASE,"INFO_TASKINFO_CMD_VIEW_LOGS_CHAR_1673",TOOLS,INFORMATION,1673, getClassLoader());

  /**
   * Takes into account the syntax of the attributes as defined in the schema to make the value comparison.  The provided LDIF files must be conform to the server schema
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFDIFF_DESCRIPTION_CHECK_SCHEMA =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFDIFF_DESCRIPTION_CHECK_SCHEMA_1674",TOOLS,INFORMATION,1674, getClassLoader());

  /**
   * WARNING:  no configuration file was provided as argument.  No schema check will be performed.  If this is being called throught the '%s' command-line, verify that the script has not been modified
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_LDIFDIFF_NO_CONFIG_FILE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_LDIFDIFF_NO_CONFIG_FILE_1675",TOOLS,SEVERE_WARNING,1675, getClassLoader());

  /**
   * You must provide a non-empty password to continue
   */
  public static final MessageDescriptor.Arg0 INFO_LDAPAUTH_NON_EMPTY_PASSWORD =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAPAUTH_NON_EMPTY_PASSWORD_1676",TOOLS,INFORMATION,1676, getClassLoader());

  /**
   * {batchFilePath}
   */
  public static final MessageDescriptor.Arg0 INFO_BATCH_FILE_PATH_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_BATCH_FILE_PATH_PLACEHOLDER_1677",TOOLS,INFORMATION,1677, getClassLoader());

  /**
   * Path to a batch file containing a set of dsconfig commands to be executed
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_BATCH_FILE_PATH =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_BATCH_FILE_PATH_1678",TOOLS,INFORMATION,1678, getClassLoader());

  /**
   * If you specify the {%s} argument you must also specify {%s}
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_DSCFG_ERROR_BATCH_FILE_AND_INTERACTIVE_INCOMPATIBLE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_BATCH_FILE_AND_INTERACTIVE_INCOMPATIBLE_1679",TOOLS,SEVERE_ERROR,1679, getClassLoader());

  /**
   * The timeout of '%d' seconds to start the server has been reached.  You can use the argument '--%s' to increase this timeout
   */
  public static final MessageDescriptor.Arg2<Number,CharSequence> ERR_TIMEOUT_DURING_STARTUP =
          new MessageDescriptor.Arg2<Number,CharSequence>(BASE,"SEVERE_ERR_TIMEOUT_DURING_STARTUP_1680",TOOLS,SEVERE_ERROR,1680, getClassLoader());

  /**
   * Enable the server to run as a Windows Service
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_ENABLE_WINDOWS_SERVICE =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_ENABLE_WINDOWS_SERVICE_1681",TOOLS,INFORMATION,1681, getClassLoader());

  /**
   * Do not enable the server to run as a Windows Service
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_DO_NOT_ENABLE_WINDOWS_SERVICE =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_DO_NOT_ENABLE_WINDOWS_SERVICE_1682",TOOLS,INFORMATION,1682, getClassLoader());

  /**
   * Path to temporary directory for index scratch files during LDIF import
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFIMPORT_DESCRIPTION_TEMP_DIRECTORY =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFIMPORT_DESCRIPTION_TEMP_DIRECTORY_1683",TOOLS,INFORMATION,1683, getClassLoader());

  /**
   * {directory}
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFIMPORT_TEMP_DIR_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFIMPORT_TEMP_DIR_PLACEHOLDER_1684",TOOLS,INFORMATION,1684, getClassLoader());

  /**
   * Perform DN validation during later part of LDIF import
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFIMPORT_DESCRIPTION_DN_VALIDATION =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFIMPORT_DESCRIPTION_DN_VALIDATION_1685",TOOLS,INFORMATION,1685, getClassLoader());

  /**
   * Number of threads used to read LDIF file during import. Default value (0) equals: 2 x (number of CPUs)
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFIMPORT_DESCRIPTION_THREAD_COUNT =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFIMPORT_DESCRIPTION_THREAD_COUNT_1686",TOOLS,INFORMATION,1686, getClassLoader());

  /**
   * {count}
   */
  public static final MessageDescriptor.Arg0 INFO_LDIFIMPORT_THREAD_COUNT_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_LDIFIMPORT_THREAD_COUNT_PLACEHOLDER_1687",TOOLS,INFORMATION,1687, getClassLoader());

  /**
   * The value %s for threadCount cannot be parsed: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIFIMPORT_CANNOT_PARSE_THREAD_COUNT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIFIMPORT_CANNOT_PARSE_THREAD_COUNT_1688",TOOLS,SEVERE_ERROR,1688, getClassLoader());

  /**
   * # Public changelog exchange control(%s): %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_LDAPSEARCH_PUBLIC_CHANGELOG_COOKIE_EXC =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_LDAPSEARCH_PUBLIC_CHANGELOG_COOKIE_EXC_1689",TOOLS,INFORMATION,1689, getClassLoader());

  /**
   * The password to encode or to compare against an encoded password is interactively asked to the user
   */
  public static final MessageDescriptor.Arg0 INFO_ENCPW_DESCRIPTION_INPUT_PW =
          new MessageDescriptor.Arg0(BASE,"INFO_ENCPW_DESCRIPTION_INPUT_PW_1690",TOOLS,INFORMATION,1690, getClassLoader());

  /**
   * Please enter the password :
   */
  public static final MessageDescriptor.Arg0 INFO_ENCPW_INPUT_PWD_1 =
          new MessageDescriptor.Arg0(BASE,"INFO_ENCPW_INPUT_PWD_1_1691",TOOLS,INFORMATION,1691, getClassLoader());

  /**
   * Please renter the password:
   */
  public static final MessageDescriptor.Arg0 INFO_ENCPW_INPUT_PWD_2 =
          new MessageDescriptor.Arg0(BASE,"INFO_ENCPW_INPUT_PWD_2_1692",TOOLS,INFORMATION,1692, getClassLoader());

  /**
   * Provided passwords don't matched
   */
  public static final MessageDescriptor.Arg0 ERR_ENCPW_NOT_SAME_PW =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_ENCPW_NOT_SAME_PW_1693",TOOLS,SEVERE_ERROR,1693, getClassLoader());

  /**
   * Cannot read password from the input: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ENCPW_CANNOT_READ_PW =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_ENCPW_CANNOT_READ_PW_1694",TOOLS,SEVERE_ERROR,1694, getClassLoader());

  /**
   * Rebuild all indexes, including any DN2ID, DN2URI, VLV and extensible indexes. Cannot be used with the "-i" option
   */
  public static final MessageDescriptor.Arg0 INFO_REBUILDINDEX_DESCRIPTION_REBUILD_ALL =
          new MessageDescriptor.Arg0(BASE,"INFO_REBUILDINDEX_DESCRIPTION_REBUILD_ALL_1695",TOOLS,INFORMATION,1695, getClassLoader());

  /**
   * {directory}
   */
  public static final MessageDescriptor.Arg0 INFO_REBUILDINDEX_TEMP_DIR_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_REBUILDINDEX_TEMP_DIR_PLACEHOLDER_1697",TOOLS,INFORMATION,1697, getClassLoader());

  /**
   * Path to temporary directory for index scratch files during index rebuilding
   */
  public static final MessageDescriptor.Arg0 INFO_REBUILDINDEX_DESCRIPTION_TEMP_DIRECTORY =
          new MessageDescriptor.Arg0(BASE,"INFO_REBUILDINDEX_DESCRIPTION_TEMP_DIRECTORY_1698",TOOLS,INFORMATION,1698, getClassLoader());

  /**
   * Index "-i" option cannot be specified with the "--rebuildAll" option
   */
  public static final MessageDescriptor.Arg0 ERR_REBUILDINDEX_REBUILD_ALL_ERROR =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_REBUILDINDEX_REBUILD_ALL_ERROR_1699",TOOLS,SEVERE_ERROR,1699, getClassLoader());

  /**
   * Do you want to create base DNs in the server?
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_PROVIDE_BASE_DN_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_PROVIDE_BASE_DN_PROMPT_1700",TOOLS,INFORMATION,1700, getClassLoader());

  /**
   * You have specified not to create a base DN.  If no base DN is to be created you cannot specify argument '%s'
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_INSTALLDS_NO_BASE_DN_AND_CONFLICTING_ARG =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_INSTALLDS_NO_BASE_DN_AND_CONFLICTING_ARG_1701",TOOLS,SEVERE_ERROR,1701, getClassLoader());

  /**
   * Use subentries control to specify that subentries are visible and normal entries are not
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_SUBENTRIES =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_SUBENTRIES_1702",TOOLS,INFORMATION,1702, getClassLoader());

  /**
   * Directory server host name or IP address that will be used to generate the self-signed certificate.  This argument will be taken into account only if the self-signed certificate argument %s is specified
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_INSTALLDS_DESCRIPTION_HOST_NAME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_INSTALLDS_DESCRIPTION_HOST_NAME_1703",TOOLS,INFORMATION,1703, getClassLoader());

  /**
   * Provide the fully-qualified host name or IP address that will be used to generate the self-signed certificate
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_PROMPT_HOST_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_PROMPT_HOST_NAME_1704",TOOLS,INFORMATION,1704, getClassLoader());

  /**
   * {period}
   */
  public static final MessageDescriptor.Arg0 INFO_PERIOD_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_PERIOD_PLACEHOLDER_1705",TOOLS,INFORMATION,1705, getClassLoader());

  /**
   * When this argument is specified, the status command will display its contents periodically.  Used to specify the period (in seconds) between two displays of the status
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_REFRESH_PERIOD =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_REFRESH_PERIOD_1706",TOOLS,INFORMATION,1706, getClassLoader());

  /**
   * Print equivalent non-interactive command-line
   */
  public static final MessageDescriptor.Arg0 INFO_INSTALLDS_PRINT_EQUIVALENT_COMMAND_LINE =
          new MessageDescriptor.Arg0(BASE,"INFO_INSTALLDS_PRINT_EQUIVALENT_COMMAND_LINE_1708",TOOLS,INFORMATION,1708, getClassLoader());

  /**
   * The Windows Service was successfully configured but there was an error starting it.  Error code starting Windows Service: %d
   */
  public static final MessageDescriptor.Arg1<Number> ERR_WINDOWS_SERVICE_ENABLING_ERROR_STARTING_SERVER =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_WINDOWS_SERVICE_ENABLING_ERROR_STARTING_SERVER_1709",TOOLS,MILD_ERROR,1709, getClassLoader());

  /**
   * Do not display the JE data, just statistics
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_DBTEST_STATS_ONLY =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_DBTEST_STATS_ONLY_1710",TOOLS,INFORMATION,1710, getClassLoader());

  /**
   * {timeout}
   */
  public static final MessageDescriptor.Arg0 INFO_TIMEOUT_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_TIMEOUT_PLACEHOLDER_1711",TOOLS,INFORMATION,1711, getClassLoader());

  /**
   * Maximum length of time (in milliseconds) that can be taken to establish a connection.  Use '0' to specify no time out
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_CONNECTION_TIMEOUT =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_CONNECTION_TIMEOUT_1712",TOOLS,INFORMATION,1712, getClassLoader());

  /**
   * An error occurred while attempting to write entry to LDIF:  Could not calculate the DN for the entry (no value found for the RDN attribute %s)
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MAKELDIF_CANNOT_WRITE_ENTRY_WITHOUT_DN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_MAKELDIF_CANNOT_WRITE_ENTRY_WITHOUT_DN_1713",TOOLS,MILD_ERROR,1713, getClassLoader());

  /**
   * A client side timeout occurred.%nAdditional Information:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CLIENT_SIDE_TIMEOUT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CLIENT_SIDE_TIMEOUT_1714",TOOLS,SEVERE_ERROR,1714, getClassLoader());

  /**
   * Undefined
   */
  public static final MessageDescriptor.Arg0 INFO_LABEL_DBTEST_INDEX_UNDEFINED_RECORD_COUNT =
          new MessageDescriptor.Arg0(BASE,"INFO_LABEL_DBTEST_INDEX_UNDEFINED_RECORD_COUNT_1715",TOOLS,INFORMATION,1715, getClassLoader());

  /**
   * {maximum duration}
   */
  public static final MessageDescriptor.Arg0 INFO_MAXIMUM_DURATION_PLACEHOLDER =
          new MessageDescriptor.Arg0(BASE,"INFO_MAXIMUM_DURATION_PLACEHOLDER_1716",TOOLS,INFORMATION,1716, getClassLoader());

  /**
   * This argument specifies the maximum duration the purge processing must last expressed in seconds
   */
  public static final MessageDescriptor.Arg0 INFO_DESCRIPTION_PURGE_HISTORICAL_MAXIMUM_DURATION =
          new MessageDescriptor.Arg0(BASE,"INFO_DESCRIPTION_PURGE_HISTORICAL_MAXIMUM_DURATION_1717",TOOLS,INFORMATION,1717, getClassLoader());

  /**
   * The provided schedule value has an invalid format.  The schedule must be expressed using a crontab(5) format.  Error details: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_RECURRING_SCHEDULE_FORMAT_ERROR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_RECURRING_SCHEDULE_FORMAT_ERROR_1718",TOOLS,SEVERE_ERROR,1718, getClassLoader());


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
            Class<?> c = Class.forName("org.opends.messages.ToolMessages");

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
      cl = ToolMessages.class.getClassLoader();
    }
    return cl;
  }
}
