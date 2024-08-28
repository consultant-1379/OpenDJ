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
public final class ExtensionMessages {

  /** Base property for resource bundle containing messages */
  private static final String BASE = "messages/extension";

  private static ClassLoader webstartClassLoader;

  // Prevent instantiation.
  private ExtensionMessages() {
    // Do nothing.
  }

  /**
   * An error occurred while attempting to initialize the message digest generator for the %s algorithm:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWSCHEME_CANNOT_INITIALIZE_MESSAGE_DIGEST =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWSCHEME_CANNOT_INITIALIZE_MESSAGE_DIGEST_1",EXTENSIONS,SEVERE_ERROR,1, getClassLoader());

  /**
   * An error occurred while attempting to base64-decode the password value %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWSCHEME_CANNOT_BASE64_DECODE_STORED_PASSWORD =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_PWSCHEME_CANNOT_BASE64_DECODE_STORED_PASSWORD_2",EXTENSIONS,MILD_ERROR,2, getClassLoader());

  /**
   * The %s password storage scheme is not reversible, so it is impossible to recover the plaintext version of an encoded password
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PWSCHEME_NOT_REVERSIBLE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_PWSCHEME_NOT_REVERSIBLE_3",EXTENSIONS,MILD_ERROR,3, getClassLoader());

  /**
   * An error occurred while trying to register the JMX alert handler with the MBean server:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JMX_ALERT_HANDLER_CANNOT_REGISTER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_JMX_ALERT_HANDLER_CANNOT_REGISTER_4",EXTENSIONS,MILD_ERROR,4, getClassLoader());

  /**
   * An unexpected error occurred while attempting to encode a password using the storage scheme defined in class %s: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWSCHEME_CANNOT_ENCODE_PASSWORD =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_PWSCHEME_CANNOT_ENCODE_PASSWORD_5",EXTENSIONS,MILD_ERROR,5, getClassLoader());

  /**
   * The ds-cfg-include-filter attribute of configuration entry %s, which specifies a set of search filters that may be used to control which entries are included in the cache, has an invalid value of "%s":  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CACHE_INVALID_INCLUDE_FILTER =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CACHE_INVALID_INCLUDE_FILTER_6",EXTENSIONS,SEVERE_ERROR,6, getClassLoader());

  /**
   * The ds-cfg-exclude-filter attribute of configuration entry %s, which specifies a set of search filters that may be used to control which entries are excluded from the cache, has an invalid value of "%s":  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CACHE_INVALID_EXCLUDE_FILTER =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CACHE_INVALID_EXCLUDE_FILTER_7",EXTENSIONS,SEVERE_ERROR,7, getClassLoader());

  /**
   * A fatal error occurred while trying to initialize fifo entry cache:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_FIFOCACHE_CANNOT_INITIALIZE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"FATAL_ERR_FIFOCACHE_CANNOT_INITIALIZE_8",EXTENSIONS,FATAL_ERROR,8, getClassLoader());

  /**
   * A fatal error occurred while trying to initialize soft reference entry cache:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SOFTREFCACHE_CANNOT_INITIALIZE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"FATAL_ERR_SOFTREFCACHE_CANNOT_INITIALIZE_9",EXTENSIONS,FATAL_ERROR,9, getClassLoader());

  /**
   * Starting the entry cache preload for %s backend
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_CACHE_PRELOAD_PROGRESS_START =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_CACHE_PRELOAD_PROGRESS_START_10",EXTENSIONS,NOTICE,10, getClassLoader());

  /**
   * The entry cache preload for %s backend has processed %d entries, %d MB free heap memory available
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,Number> NOTE_CACHE_PRELOAD_PROGRESS_REPORT =
          new MessageDescriptor.Arg3<CharSequence,Number,Number>(BASE,"NOTICE_CACHE_PRELOAD_PROGRESS_REPORT_11",EXTENSIONS,NOTICE,11, getClassLoader());

  /**
   * The entry cache preload for %s backend is complete with the total of %d entries processed
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> NOTE_CACHE_PRELOAD_PROGRESS_DONE =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"NOTICE_CACHE_PRELOAD_PROGRESS_DONE_12",EXTENSIONS,NOTICE,12, getClassLoader());

  /**
   * The entry cache preload for %s backend has been interrupted
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_CACHE_PRELOAD_INTERRUPTED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_CACHE_PRELOAD_INTERRUPTED_13",EXTENSIONS,SEVERE_WARNING,13, getClassLoader());

  /**
   * The entry cache preload is not supported by %s backend, and as a result no entries from this backend will be preloaded into the entry cache
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_CACHE_PRELOAD_BACKEND_FAILED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_CACHE_PRELOAD_BACKEND_FAILED_14",EXTENSIONS,SEVERE_WARNING,14, getClassLoader());

  /**
   * Failed to preload %s entry into the entry cache:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CACHE_PRELOAD_ENTRY_FAILED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CACHE_PRELOAD_ENTRY_FAILED_15",EXTENSIONS,SEVERE_ERROR,15, getClassLoader());

  /**
   * The password modify extended request sequence included an ASN.1 element of an invalid type:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_EXTOP_PASSMOD_ILLEGAL_REQUEST_ELEMENT_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_EXTOP_PASSMOD_ILLEGAL_REQUEST_ELEMENT_TYPE_32",EXTENSIONS,MILD_ERROR,32, getClassLoader());

  /**
   * An unexpected error occurred while attempting to decode the password modify extended request sequence:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_EXTOP_PASSMOD_CANNOT_DECODE_REQUEST =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_EXTOP_PASSMOD_CANNOT_DECODE_REQUEST_33",EXTENSIONS,MILD_ERROR,33, getClassLoader());

  /**
   * The password modify extended request cannot be processed because it does not contain an authorization ID and the underlying connection is not authenticated
   */
  public static final MessageDescriptor.Arg0 ERR_EXTOP_PASSMOD_NO_AUTH_OR_USERID =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_EXTOP_PASSMOD_NO_AUTH_OR_USERID_34",EXTENSIONS,MILD_ERROR,34, getClassLoader());

  /**
   * The password modify extended request cannot be processed because the server was unable to obtain a write lock on user entry %s after multiple attempts
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_EXTOP_PASSMOD_CANNOT_LOCK_USER_ENTRY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_EXTOP_PASSMOD_CANNOT_LOCK_USER_ENTRY_35",EXTENSIONS,SEVERE_ERROR,35, getClassLoader());

  /**
   * The password modify extended request cannot be processed because the server cannot decode "%s" as a valid DN for use in the authorization ID for the operation
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_EXTOP_PASSMOD_CANNOT_DECODE_AUTHZ_DN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_EXTOP_PASSMOD_CANNOT_DECODE_AUTHZ_DN_36",EXTENSIONS,MILD_ERROR,36, getClassLoader());

  /**
   * The password modify extended request cannot be processed because it contained an invalid userIdentity field.  The provided userIdentity string was "%s"
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_EXTOP_PASSMOD_INVALID_AUTHZID_STRING =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_EXTOP_PASSMOD_INVALID_AUTHZID_STRING_37",EXTENSIONS,MILD_ERROR,37, getClassLoader());

  /**
   * The password modify extended request cannot be processed because it was not possible to identify the user entry to update based on the authorization DN of "%s"
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_EXTOP_PASSMOD_NO_USER_ENTRY_BY_AUTHZID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_EXTOP_PASSMOD_NO_USER_ENTRY_BY_AUTHZID_38",EXTENSIONS,MILD_ERROR,38, getClassLoader());

  /**
   * The password modify extended request cannot be processed because the provided authorization UID of "%s" did not match any entries in the directory
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_EXTOP_PASSMOD_NO_DN_BY_AUTHZID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_EXTOP_PASSMOD_NO_DN_BY_AUTHZID_39",EXTENSIONS,MILD_ERROR,39, getClassLoader());

  /**
   * The password modify extended request cannot be processed because the provided authorization UID of "%s" matched more than one entry in the directory
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_EXTOP_PASSMOD_MULTIPLE_ENTRIES_BY_AUTHZID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_EXTOP_PASSMOD_MULTIPLE_ENTRIES_BY_AUTHZID_40",EXTENSIONS,MILD_ERROR,40, getClassLoader());

  /**
   * The password modify extended operation cannot be processed because the current password provided for the user is invalid
   */
  public static final MessageDescriptor.Arg0 ERR_EXTOP_PASSMOD_INVALID_OLD_PASSWORD =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_EXTOP_PASSMOD_INVALID_OLD_PASSWORD_41",EXTENSIONS,MILD_ERROR,41, getClassLoader());

  /**
   * Path to the file containing the Directory Server keystore information.  Changes to this configuration attribute will take effect the next time that the key manager is accessed
   */
  public static final MessageDescriptor.Arg0 INFO_FILE_KEYMANAGER_DESCRIPTION_FILE =
          new MessageDescriptor.Arg0(BASE,"INFO_FILE_KEYMANAGER_DESCRIPTION_FILE_43",EXTENSIONS,INFORMATION,43, getClassLoader());

  /**
   * The configuration entry %s that defines a file-based key manager does not contain attribute ds-cfg-key-store-file that should hold the path to the keystore file
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_FILE_KEYMANAGER_NO_FILE_ATTR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_FILE_KEYMANAGER_NO_FILE_ATTR_44",EXTENSIONS,SEVERE_ERROR,44, getClassLoader());

  /**
   * The keystore file %s specified in attribute ds-cfg-key-store-file of configuration entry %s does  not exist
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_FILE_KEYMANAGER_NO_SUCH_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_FILE_KEYMANAGER_NO_SUCH_FILE_45",EXTENSIONS,SEVERE_ERROR,45, getClassLoader());

  /**
   * An unexpected error occurred while trying to determine the value of configuration attribute ds-cfg-key-store-file in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_FILE_KEYMANAGER_CANNOT_DETERMINE_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_FILE_KEYMANAGER_CANNOT_DETERMINE_FILE_46",EXTENSIONS,SEVERE_ERROR,46, getClassLoader());

  /**
   * Keystore type for the Directory Server keystore.  Valid values should always include 'JKS' and 'PKCS12', but different implementations may allow other values as well.  If no value is provided, then the JVM-default value will be used.  Changes to this configuration attribute will take effect the next time that the key manager is accessed
   */
  public static final MessageDescriptor.Arg0 INFO_FILE_KEYMANAGER_DESCRIPTION_TYPE =
          new MessageDescriptor.Arg0(BASE,"INFO_FILE_KEYMANAGER_DESCRIPTION_TYPE_47",EXTENSIONS,INFORMATION,47, getClassLoader());

  /**
   * An unexpected error occurred while trying to determine the value of configuration attribute ds-cfg-key-store-type in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_FILE_KEYMANAGER_CANNOT_DETERMINE_TYPE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_FILE_KEYMANAGER_CANNOT_DETERMINE_TYPE_48",EXTENSIONS,SEVERE_ERROR,48, getClassLoader());

  /**
   * Name of the Java property that contains the clear-text PIN needed to access the file-based key manager.  Changes to this configuration attribute will take effect the next time that the key manager is accessed
   */
  public static final MessageDescriptor.Arg0 INFO_FILE_KEYMANAGER_DESCRIPTION_PIN_PROPERTY =
          new MessageDescriptor.Arg0(BASE,"INFO_FILE_KEYMANAGER_DESCRIPTION_PIN_PROPERTY_49",EXTENSIONS,INFORMATION,49, getClassLoader());

  /**
   * Java property %s which is specified in attribute ds-cfg-key-store-pin-property of configuration entry %s should contain the PIN needed to access the file-based key manager, but this property is not set
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_FILE_KEYMANAGER_PIN_PROPERTY_NOT_SET =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_FILE_KEYMANAGER_PIN_PROPERTY_NOT_SET_50",EXTENSIONS,SEVERE_ERROR,50, getClassLoader());

  /**
   * An unexpected error occurred while trying to determine the value of configuration attribute ds-cfg-key-store-pin-property in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_FILE_KEYMANAGER_CANNOT_DETERMINE_PIN_PROPERTY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_FILE_KEYMANAGER_CANNOT_DETERMINE_PIN_PROPERTY_51",EXTENSIONS,SEVERE_ERROR,51, getClassLoader());

  /**
   * Name of the environment variable that contains the clear-text PIN needed to access the file-based key manager.  Changes to this configuration attribute will take effect the next time that the key manager is accessed
   */
  public static final MessageDescriptor.Arg0 INFO_FILE_KEYMANAGER_DESCRIPTION_PIN_ENVAR =
          new MessageDescriptor.Arg0(BASE,"INFO_FILE_KEYMANAGER_DESCRIPTION_PIN_ENVAR_52",EXTENSIONS,INFORMATION,52, getClassLoader());

  /**
   * Environment variable %s which is specified in attribute ds-cfg-key-store-pin-environment-variable of configuration entry %s should contain the PIN needed to access the file-based key manager, but this property is not set
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_FILE_KEYMANAGER_PIN_ENVAR_NOT_SET =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_FILE_KEYMANAGER_PIN_ENVAR_NOT_SET_53",EXTENSIONS,SEVERE_ERROR,53, getClassLoader());

  /**
   * An unexpected error occurred while trying to determine the value of configuration attribute ds-cfg-key-store-pin-environment-variable in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_FILE_KEYMANAGER_CANNOT_DETERMINE_PIN_ENVAR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_FILE_KEYMANAGER_CANNOT_DETERMINE_PIN_ENVAR_54",EXTENSIONS,SEVERE_ERROR,54, getClassLoader());

  /**
   * Path to the text file whose only contents should be a single line containing the clear-text PIN needed to access the file-based key manager.  Changes to this configuration attribute will take effect the next time that the key manager is accessed
   */
  public static final MessageDescriptor.Arg0 INFO_FILE_KEYMANAGER_DESCRIPTION_PIN_FILE =
          new MessageDescriptor.Arg0(BASE,"INFO_FILE_KEYMANAGER_DESCRIPTION_PIN_FILE_55",EXTENSIONS,INFORMATION,55, getClassLoader());

  /**
   * File %s specified in attribute ds-cfg-key-store-pin-file of configuration entry %s should contain the PIN needed to access the file-based key manager, but this file does not exist
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_FILE_KEYMANAGER_PIN_NO_SUCH_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_FILE_KEYMANAGER_PIN_NO_SUCH_FILE_56",EXTENSIONS,SEVERE_ERROR,56, getClassLoader());

  /**
   * An error occurred while trying to read the keystore PIN from file %s specified in configuration attribute ds-cfg-key-store-pin-file of configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_FILE_KEYMANAGER_PIN_FILE_CANNOT_READ =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_FILE_KEYMANAGER_PIN_FILE_CANNOT_READ_57",EXTENSIONS,SEVERE_ERROR,57, getClassLoader());

  /**
   * File %s specified in attribute ds-cfg-key-store-pin-file of configuration entry %s should contain the PIN needed to access the file-based key manager, but this file is empty
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_FILE_KEYMANAGER_PIN_FILE_EMPTY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_FILE_KEYMANAGER_PIN_FILE_EMPTY_58",EXTENSIONS,SEVERE_ERROR,58, getClassLoader());

  /**
   * An unexpected error occurred while trying to determine the value of configuration attribute ds-cfg-key-store-pin-file in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_FILE_KEYMANAGER_CANNOT_DETERMINE_PIN_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_FILE_KEYMANAGER_CANNOT_DETERMINE_PIN_FILE_59",EXTENSIONS,SEVERE_ERROR,59, getClassLoader());

  /**
   * An unexpected error occurred while trying to determine the value of configuration attribute ds-cfg-key-store-pin in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_FILE_KEYMANAGER_CANNOT_DETERMINE_PIN_FROM_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_FILE_KEYMANAGER_CANNOT_DETERMINE_PIN_FROM_ATTR_60",EXTENSIONS,SEVERE_ERROR,60, getClassLoader());

  /**
   * Configuration entry %s does not specify a means of determining the PIN needed to access the contents of the file-based key manager.  The PIN may be specified in a Java property (named by attribute ds-cfg-key-store-pin-property), an environment variable (named by attribute ds-cfg-key-store-pin-environment-variable), a text file (named by attribute ds-cfg-key-store-pin-file), or directly in the entry using attribute ds-cfg-key-store-pin
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_FILE_KEYMANAGER_NO_PIN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_FILE_KEYMANAGER_NO_PIN_61",EXTENSIONS,SEVERE_ERROR,61, getClassLoader());

  /**
   * An error occurred while trying to load the keystore contents from file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_FILE_KEYMANAGER_CANNOT_LOAD =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_FILE_KEYMANAGER_CANNOT_LOAD_62",EXTENSIONS,SEVERE_ERROR,62, getClassLoader());

  /**
   * The keystore type %s specified in attribute ds-cfg-key-store-type of configuration entry %s is not valid:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_FILE_KEYMANAGER_INVALID_TYPE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_FILE_KEYMANAGER_INVALID_TYPE_63",EXTENSIONS,SEVERE_ERROR,63, getClassLoader());

  /**
   * The value of the ds-cfg-key-store-file attribute in configuration entry %s has been updated to %s.  The new value will take effect the next time the key manager is accessed
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_FILE_KEYMANAGER_UPDATED_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_FILE_KEYMANAGER_UPDATED_FILE_64",EXTENSIONS,INFORMATION,64, getClassLoader());

  /**
   * The value of the ds-cfg-key-store-type attribute in configuration entry %s has been updated to %s.  The new value will take effect the next time the key manager is accessed
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_FILE_KEYMANAGER_UPDATED_TYPE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_FILE_KEYMANAGER_UPDATED_TYPE_65",EXTENSIONS,INFORMATION,65, getClassLoader());

  /**
   * The PIN to use to access the file-based key manager has been updated.  The new value will take effect the next time the key manager is accessed
   */
  public static final MessageDescriptor.Arg0 INFO_FILE_KEYMANAGER_UPDATED_PIN =
          new MessageDescriptor.Arg0(BASE,"INFO_FILE_KEYMANAGER_UPDATED_PIN_66",EXTENSIONS,INFORMATION,66, getClassLoader());

  /**
   * Name of the Java property that contains the clear-text PIN needed to access the PKCS#11 key manager.  Changes to this configuration attribute will take effect the next time that the key manager is accessed
   */
  public static final MessageDescriptor.Arg0 INFO_PKCS11_KEYMANAGER_DESCRIPTION_PIN_PROPERTY =
          new MessageDescriptor.Arg0(BASE,"INFO_PKCS11_KEYMANAGER_DESCRIPTION_PIN_PROPERTY_67",EXTENSIONS,INFORMATION,67, getClassLoader());

  /**
   * Java property %s which is specified in attribute ds-cfg-key-store-pin-property of configuration entry %s should contain the PIN needed to access the PKCS#11 key manager, but this property is not set
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PKCS11_KEYMANAGER_PIN_PROPERTY_NOT_SET =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PKCS11_KEYMANAGER_PIN_PROPERTY_NOT_SET_68",EXTENSIONS,SEVERE_ERROR,68, getClassLoader());

  /**
   * An unexpected error occurred while trying to determine the value of configuration attribute ds-cfg-key-store-pin-property in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PKCS11_KEYMANAGER_CANNOT_DETERMINE_PIN_PROPERTY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PKCS11_KEYMANAGER_CANNOT_DETERMINE_PIN_PROPERTY_69",EXTENSIONS,SEVERE_ERROR,69, getClassLoader());

  /**
   * Name of the environment variable that contains the clear-text PIN needed to access the PKCS#11 key manager.  Changes to this configuration attribute will take effect the next time that the key manager is accessed
   */
  public static final MessageDescriptor.Arg0 INFO_PKCS11_KEYMANAGER_DESCRIPTION_PIN_ENVAR =
          new MessageDescriptor.Arg0(BASE,"INFO_PKCS11_KEYMANAGER_DESCRIPTION_PIN_ENVAR_70",EXTENSIONS,INFORMATION,70, getClassLoader());

  /**
   * Environment variable %s which is specified in attribute ds-cfg-key-store-pin-environment-variable of configuration entry %s should contain the PIN needed to access the PKCS#11 key manager, but this property is not set
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PKCS11_KEYMANAGER_PIN_ENVAR_NOT_SET =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PKCS11_KEYMANAGER_PIN_ENVAR_NOT_SET_71",EXTENSIONS,SEVERE_ERROR,71, getClassLoader());

  /**
   * An unexpected error occurred while trying to determine the value of configuration attribute ds-cfg-key-store-pin-environment-variable in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PKCS11_KEYMANAGER_CANNOT_DETERMINE_PIN_ENVAR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PKCS11_KEYMANAGER_CANNOT_DETERMINE_PIN_ENVAR_72",EXTENSIONS,SEVERE_ERROR,72, getClassLoader());

  /**
   * Path to the text file whose only contents should be a single line containing the clear-text PIN needed to access the PKCS#11 key manager.  Changes to this configuration attribute will take effect the next time that the key manager is accessed
   */
  public static final MessageDescriptor.Arg0 INFO_PKCS11_KEYMANAGER_DESCRIPTION_PIN_FILE =
          new MessageDescriptor.Arg0(BASE,"INFO_PKCS11_KEYMANAGER_DESCRIPTION_PIN_FILE_73",EXTENSIONS,INFORMATION,73, getClassLoader());

  /**
   * File %s specified in attribute ds-cfg-key-store-pin-file of configuration entry %s should contain the PIN needed to access the PKCS#11 key manager, but this file does not exist
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PKCS11_KEYMANAGER_PIN_NO_SUCH_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PKCS11_KEYMANAGER_PIN_NO_SUCH_FILE_74",EXTENSIONS,SEVERE_ERROR,74, getClassLoader());

  /**
   * An error occurred while trying to read the keystore PIN from file %s specified in configuration attribute ds-cfg-key-store-pin-file of configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_PKCS11_KEYMANAGER_PIN_FILE_CANNOT_READ =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_PKCS11_KEYMANAGER_PIN_FILE_CANNOT_READ_75",EXTENSIONS,SEVERE_ERROR,75, getClassLoader());

  /**
   * File %s specified in attribute ds-cfg-key-store-pin-file of configuration entry %s should contain the PIN needed to access the PKCS#11 key manager, but this file is empty
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PKCS11_KEYMANAGER_PIN_FILE_EMPTY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PKCS11_KEYMANAGER_PIN_FILE_EMPTY_76",EXTENSIONS,SEVERE_ERROR,76, getClassLoader());

  /**
   * An unexpected error occurred while trying to determine the value of configuration attribute ds-cfg-key-store-pin-file in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PKCS11_KEYMANAGER_CANNOT_DETERMINE_PIN_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PKCS11_KEYMANAGER_CANNOT_DETERMINE_PIN_FILE_77",EXTENSIONS,SEVERE_ERROR,77, getClassLoader());

  /**
   * Clear-text PIN needed to access the PKCS#11 key manager.  Changes to this configuration attribute will take effect the next time that the key manager is accessed
   */
  public static final MessageDescriptor.Arg0 INFO_PKCS11_KEYMANAGER_DESCRIPTION_PIN_ATTR =
          new MessageDescriptor.Arg0(BASE,"INFO_PKCS11_KEYMANAGER_DESCRIPTION_PIN_ATTR_78",EXTENSIONS,INFORMATION,78, getClassLoader());

  /**
   * An unexpected error occurred while trying to determine the value of configuration attribute ds-cfg-key-store-pin in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PKCS11_KEYMANAGER_CANNOT_DETERMINE_PIN_FROM_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PKCS11_KEYMANAGER_CANNOT_DETERMINE_PIN_FROM_ATTR_79",EXTENSIONS,SEVERE_ERROR,79, getClassLoader());

  /**
   * Configuration entry %s does not specify a means of determining the PIN needed to access the contents of the PKCS#11 key manager.  The PIN may be specified in a Java property (named by attribute ds-cfg-key-store-pin-property), an environment variable (named by attribute ds-cfg-key-store-pin-environment-variable), a text file (named by attribute ds-cfg-key-store-pin-file), or directly in the entry using attribute ds-cfg-key-store-pin
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PKCS11_KEYMANAGER_NO_PIN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PKCS11_KEYMANAGER_NO_PIN_80",EXTENSIONS,SEVERE_ERROR,80, getClassLoader());

  /**
   * An error occurred while trying to access the PKCS#11 key manager:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PKCS11_KEYMANAGER_CANNOT_LOAD =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PKCS11_KEYMANAGER_CANNOT_LOAD_81",EXTENSIONS,SEVERE_ERROR,81, getClassLoader());

  /**
   * The PIN to use to access the PKCS#11 key manager has been updated.  The new value will take effect the next time the key manager is accessed
   */
  public static final MessageDescriptor.Arg0 INFO_PKCS11_KEYMANAGER_UPDATED_PIN =
          new MessageDescriptor.Arg0(BASE,"INFO_PKCS11_KEYMANAGER_UPDATED_PIN_82",EXTENSIONS,INFORMATION,82, getClassLoader());

  /**
   * An error occurred while trying to create a key manager factory to access the contents of keystore file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_FILE_KEYMANAGER_CANNOT_CREATE_FACTORY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_FILE_KEYMANAGER_CANNOT_CREATE_FACTORY_83",EXTENSIONS,SEVERE_ERROR,83, getClassLoader());

  /**
   * An error occurred while trying to create a key manager factory to access the contents of the PKCS#11 keystore:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PKCS11_KEYMANAGER_CANNOT_CREATE_FACTORY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PKCS11_KEYMANAGER_CANNOT_CREATE_FACTORY_84",EXTENSIONS,SEVERE_ERROR,84, getClassLoader());

  /**
   * Path to the file containing the Directory Server trust store information.  Changes to this configuration attribute will take effect the next time that the trust manager is accessed
   */
  public static final MessageDescriptor.Arg0 INFO_FILE_TRUSTMANAGER_DESCRIPTION_FILE =
          new MessageDescriptor.Arg0(BASE,"INFO_FILE_TRUSTMANAGER_DESCRIPTION_FILE_85",EXTENSIONS,INFORMATION,85, getClassLoader());

  /**
   * The configuration entry %s that defines a file-based trust manager does not contain attribute ds-cfg-trust-store-file that should hold the path to the trust store file
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_FILE_TRUSTMANAGER_NO_FILE_ATTR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_FILE_TRUSTMANAGER_NO_FILE_ATTR_86",EXTENSIONS,SEVERE_ERROR,86, getClassLoader());

  /**
   * The trust store file %s specified in attribute ds-cfg-trust-store-file of configuration entry %s does not exist
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_FILE_TRUSTMANAGER_NO_SUCH_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_FILE_TRUSTMANAGER_NO_SUCH_FILE_87",EXTENSIONS,SEVERE_ERROR,87, getClassLoader());

  /**
   * An unexpected error occurred while trying to determine the value of configuration attribute ds-cfg-trust-store-file in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_FILE_TRUSTMANAGER_CANNOT_DETERMINE_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_FILE_TRUSTMANAGER_CANNOT_DETERMINE_FILE_88",EXTENSIONS,SEVERE_ERROR,88, getClassLoader());

  /**
   * Keystore type for the Directory Server trust store.  Valid values should always include 'JKS' and 'PKCS12', but different implementations may allow other values as well. If no value is provided, then the JVM-default value will be used.  Changes to this configuration attribute will take effect the next time that the trust manager is accessed
   */
  public static final MessageDescriptor.Arg0 INFO_FILE_TRUSTMANAGER_DESCRIPTION_TYPE =
          new MessageDescriptor.Arg0(BASE,"INFO_FILE_TRUSTMANAGER_DESCRIPTION_TYPE_89",EXTENSIONS,INFORMATION,89, getClassLoader());

  /**
   * An unexpected error occurred while trying to determine the value of configuration attribute ds-cfg-trust-store-type in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_FILE_TRUSTMANAGER_CANNOT_DETERMINE_TYPE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_FILE_TRUSTMANAGER_CANNOT_DETERMINE_TYPE_90",EXTENSIONS,SEVERE_ERROR,90, getClassLoader());

  /**
   * Name of the Java property that contains the clear-text PIN needed to access the file-based trust manager.  Changes to this configuration attribute will take effect the next time that the trust manager is accessed
   */
  public static final MessageDescriptor.Arg0 INFO_FILE_TRUSTMANAGER_DESCRIPTION_PIN_PROPERTY =
          new MessageDescriptor.Arg0(BASE,"INFO_FILE_TRUSTMANAGER_DESCRIPTION_PIN_PROPERTY_91",EXTENSIONS,INFORMATION,91, getClassLoader());

  /**
   * Java property %s which is specified in attribute ds-cfg-trust-store-pin-property of configuration entry %s should contain the PIN needed to access the file-based trust manager, but this property is not set
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_FILE_TRUSTMANAGER_PIN_PROPERTY_NOT_SET =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_FILE_TRUSTMANAGER_PIN_PROPERTY_NOT_SET_92",EXTENSIONS,SEVERE_ERROR,92, getClassLoader());

  /**
   * An unexpected error occurred while trying to determine the value of configuration attribute ds-cfg-trust-store-pin-property in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_FILE_TRUSTMANAGER_CANNOT_DETERMINE_PIN_PROPERTY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_FILE_TRUSTMANAGER_CANNOT_DETERMINE_PIN_PROPERTY_93",EXTENSIONS,SEVERE_ERROR,93, getClassLoader());

  /**
   * Name of the environment variable that contains the clear-text PIN needed to access the file-based trust manager.  Changes to this configuration attribute will take effect the next time that the trust manager is accessed
   */
  public static final MessageDescriptor.Arg0 INFO_FILE_TRUSTMANAGER_DESCRIPTION_PIN_ENVAR =
          new MessageDescriptor.Arg0(BASE,"INFO_FILE_TRUSTMANAGER_DESCRIPTION_PIN_ENVAR_94",EXTENSIONS,INFORMATION,94, getClassLoader());

  /**
   * Environment variable %s which is specified in attribute ds-cfg-trust-store-pin-environment-variable of configuration entry %s should contain the PIN needed to access the file-based trust manager, but this property is not set
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_FILE_TRUSTMANAGER_PIN_ENVAR_NOT_SET =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_FILE_TRUSTMANAGER_PIN_ENVAR_NOT_SET_95",EXTENSIONS,SEVERE_ERROR,95, getClassLoader());

  /**
   * An unexpected error occurred while trying to determine the value of configuration attribute ds-cfg-trust-store-pin-environment-variable in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_FILE_TRUSTMANAGER_CANNOT_DETERMINE_PIN_ENVAR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_FILE_TRUSTMANAGER_CANNOT_DETERMINE_PIN_ENVAR_96",EXTENSIONS,SEVERE_ERROR,96, getClassLoader());

  /**
   * Path to the text file whose only contents should be a single line containing the clear-text PIN needed to access the file-based trust manager.  Changes to this configuration attribute will take effect the next time that the trust manager is accessed
   */
  public static final MessageDescriptor.Arg0 INFO_FILE_TRUSTMANAGER_DESCRIPTION_PIN_FILE =
          new MessageDescriptor.Arg0(BASE,"INFO_FILE_TRUSTMANAGER_DESCRIPTION_PIN_FILE_97",EXTENSIONS,INFORMATION,97, getClassLoader());

  /**
   * File %s specified in attribute ds-cfg-trust-store-pin-file of configuration entry %s should contain the PIN needed to access the file-based trust manager, but this file does not exist
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_FILE_TRUSTMANAGER_PIN_NO_SUCH_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_FILE_TRUSTMANAGER_PIN_NO_SUCH_FILE_98",EXTENSIONS,SEVERE_ERROR,98, getClassLoader());

  /**
   * An error occurred while trying to read the trust store PIN from file %s specified in configuration attribute ds-cfg-trust-store-pin-file of configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_FILE_TRUSTMANAGER_PIN_FILE_CANNOT_READ =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_FILE_TRUSTMANAGER_PIN_FILE_CANNOT_READ_99",EXTENSIONS,SEVERE_ERROR,99, getClassLoader());

  /**
   * File %s specified in attribute ds-cfg-trust-store-pin-file of configuration entry %s should contain the PIN needed to access the file-based trust manager, but this file is empty
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_FILE_TRUSTMANAGER_PIN_FILE_EMPTY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_FILE_TRUSTMANAGER_PIN_FILE_EMPTY_100",EXTENSIONS,SEVERE_ERROR,100, getClassLoader());

  /**
   * An unexpected error occurred while trying to determine the value of configuration attribute ds-cfg-trust-store-pin-file in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_FILE_TRUSTMANAGER_CANNOT_DETERMINE_PIN_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_FILE_TRUSTMANAGER_CANNOT_DETERMINE_PIN_FILE_101",EXTENSIONS,SEVERE_ERROR,101, getClassLoader());

  /**
   * Clear-text PIN needed to access the file-based trust manager.  Changes to this configuration attribute will take effect the next time that the trust manager is accessed
   */
  public static final MessageDescriptor.Arg0 INFO_FILE_TRUSTMANAGER_DESCRIPTION_PIN_ATTR =
          new MessageDescriptor.Arg0(BASE,"INFO_FILE_TRUSTMANAGER_DESCRIPTION_PIN_ATTR_102",EXTENSIONS,INFORMATION,102, getClassLoader());

  /**
   * An unexpected error occurred while trying to determine the value of configuration attribute ds-cfg-trust-store-pin in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_FILE_TRUSTMANAGER_CANNOT_DETERMINE_PIN_FROM_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_FILE_TRUSTMANAGER_CANNOT_DETERMINE_PIN_FROM_ATTR_103",EXTENSIONS,SEVERE_ERROR,103, getClassLoader());

  /**
   * An error occurred while trying to load the trust store contents from file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_FILE_TRUSTMANAGER_CANNOT_LOAD =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_FILE_TRUSTMANAGER_CANNOT_LOAD_104",EXTENSIONS,SEVERE_ERROR,104, getClassLoader());

  /**
   * An error occurred while trying to create a trust manager factory to access the contents of trust store file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_FILE_TRUSTMANAGER_CANNOT_CREATE_FACTORY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_FILE_TRUSTMANAGER_CANNOT_CREATE_FACTORY_105",EXTENSIONS,SEVERE_ERROR,105, getClassLoader());

  /**
   * The trust store type %s specified in attribute ds-cfg-trust-store-type of configuration entry %s is not valid:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_FILE_TRUSTMANAGER_INVALID_TYPE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_FILE_TRUSTMANAGER_INVALID_TYPE_106",EXTENSIONS,SEVERE_ERROR,106, getClassLoader());

  /**
   * The value of the ds-cfg-trust-store-file attribute in configuration entry %s has been updated to %s.  The new value will take effect the next time the trust manager is accessed
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_FILE_TRUSTMANAGER_UPDATED_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_FILE_TRUSTMANAGER_UPDATED_FILE_107",EXTENSIONS,INFORMATION,107, getClassLoader());

  /**
   * The value of the ds-cfg-trust-store-type attribute in configuration entry %s has been updated to %s.  The new value will take effect the next time the trust manager is accessed
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_FILE_TRUSTMANAGER_UPDATED_TYPE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_FILE_TRUSTMANAGER_UPDATED_TYPE_108",EXTENSIONS,INFORMATION,108, getClassLoader());

  /**
   * The PIN to use to access the file-based trust manager has been updated.  The new value will take effect the next time the trust manager is accessed
   */
  public static final MessageDescriptor.Arg0 INFO_FILE_TRUSTMANAGER_UPDATED_PIN =
          new MessageDescriptor.Arg0(BASE,"INFO_FILE_TRUSTMANAGER_UPDATED_PIN_109",EXTENSIONS,INFORMATION,109, getClassLoader());

  /**
   * Could not map the provided certificate chain to a user entry because no peer certificate was available
   */
  public static final MessageDescriptor.Arg0 ERR_SEDCM_NO_PEER_CERTIFICATE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_SEDCM_NO_PEER_CERTIFICATE_118",EXTENSIONS,MILD_ERROR,118, getClassLoader());

  /**
   * Could not map the provided certificate chain to a user because the peer certificate was not an X.509 certificate (peer certificate format was %s)
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SEDCM_PEER_CERT_NOT_X509 =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SEDCM_PEER_CERT_NOT_X509_119",EXTENSIONS,MILD_ERROR,119, getClassLoader());

  /**
   * Could not map the provided certificate chain to a user because the peer certificate subject "%s" could not be decoded as an LDAP DN:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SEDCM_CANNOT_DECODE_SUBJECT_AS_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SEDCM_CANNOT_DECODE_SUBJECT_AS_DN_120",EXTENSIONS,MILD_ERROR,120, getClassLoader());

  /**
   * Could not map the provided certificate chain to a user because an error occurred while attempting to retrieve the user entry with DN "%s":  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SEDCM_CANNOT_GET_ENTRY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SEDCM_CANNOT_GET_ENTRY_121",EXTENSIONS,MILD_ERROR,121, getClassLoader());

  /**
   * Could not map the provided certificate chain to a user because no user entry exists with a DN of %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SEDCM_NO_USER_FOR_DN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SEDCM_NO_USER_FOR_DN_122",EXTENSIONS,MILD_ERROR,122, getClassLoader());

  /**
   * The SASL EXTERNAL bind request could not be processed because the associated bind request does not have a reference to the client connection
   */
  public static final MessageDescriptor.Arg0 ERR_SASLEXTERNAL_NO_CLIENT_CONNECTION =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_SASLEXTERNAL_NO_CLIENT_CONNECTION_123",EXTENSIONS,MILD_ERROR,123, getClassLoader());

  /**
   * The SASL EXTERNAL bind request could not be processed because the associated client connection instance is not an instance of LDAPClientConnection
   */
  public static final MessageDescriptor.Arg0 ERR_SASLEXTERNAL_NOT_LDAP_CLIENT_INSTANCE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_SASLEXTERNAL_NOT_LDAP_CLIENT_INSTANCE_124",EXTENSIONS,MILD_ERROR,124, getClassLoader());

  /**
   * The SASL EXTERNAL bind request could not be processed because the client connection is not using the TLS security provider (client security provider is %s).  The TLS security provider is required for clients that wish to use SASL EXTERNAL authentication
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SASLEXTERNAL_CLIENT_NOT_USING_TLS_PROVIDER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SASLEXTERNAL_CLIENT_NOT_USING_TLS_PROVIDER_125",EXTENSIONS,MILD_ERROR,125, getClassLoader());

  /**
   * The SASL EXTERNAL bind request could not be processed because the client did not present a certificate chain during SSL/TLS negotiation
   */
  public static final MessageDescriptor.Arg0 ERR_SASLEXTERNAL_NO_CLIENT_CERT =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_SASLEXTERNAL_NO_CLIENT_CERT_126",EXTENSIONS,MILD_ERROR,126, getClassLoader());

  /**
   * The SASL EXTERNAL bind request failed because the certificate chain presented by the client during SSL/TLS negotiation could not be mapped to a user entry in the Directory Server
   */
  public static final MessageDescriptor.Arg0 ERR_SASLEXTERNAL_NO_MAPPING =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_SASLEXTERNAL_NO_MAPPING_127",EXTENSIONS,MILD_ERROR,127, getClassLoader());

  /**
   * StartTLS cannot be used on this connection because the underlying client connection is not available
   */
  public static final MessageDescriptor.Arg0 ERR_STARTTLS_NO_CLIENT_CONNECTION =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_STARTTLS_NO_CLIENT_CONNECTION_128",EXTENSIONS,MILD_ERROR,128, getClassLoader());

  /**
   * StartTLS cannot be used on this client connection because this connection type is not capable of using StartTLS to protect its communication
   */
  public static final MessageDescriptor.Arg0 ERR_STARTTLS_NOT_TLS_CAPABLE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_STARTTLS_NOT_TLS_CAPABLE_129",EXTENSIONS,MILD_ERROR,129, getClassLoader());

  /**
   * An unexpected error occurred while attempting to enable the TLS connection security manager on the client connection for the purpose of StartTLS:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_STARTTLS_ERROR_ON_ENABLE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_STARTTLS_ERROR_ON_ENABLE_130",EXTENSIONS,MILD_ERROR,130, getClassLoader());

  /**
   * Indicates whether the SASL EXTERNAL mechanism handler should attempt to validate the peer certificate against a certificate in the corresponding user's entry.  The value must be one of "true" (which will always attempt to validate the certificate and will fail if no certificates are present), "false" (which will never attempt to validate the peer certificate), and "ifpresent" (which will validate the peer certificate if there are one or more certificates in the user's entry, but will not fail if there are no certificates in the entry.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_SASLEXTERNAL_DESCRIPTION_VALIDATION_POLICY =
          new MessageDescriptor.Arg0(BASE,"INFO_SASLEXTERNAL_DESCRIPTION_VALIDATION_POLICY_131",EXTENSIONS,INFORMATION,131, getClassLoader());

  /**
   * Configuration entry %s has an invalid value %s for attribute ds-cfg-certificate-validation-policy.  The value must be one of "always", "never", or "ifpresent"
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASLEXTERNAL_INVALID_VALIDATION_VALUE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_SASLEXTERNAL_INVALID_VALIDATION_VALUE_132",EXTENSIONS,SEVERE_ERROR,132, getClassLoader());

  /**
   * An unexpected error occurred while attempting to determine the value of the ds-cfg-certificate-validation-policy attribute in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASLEXTERNAL_CANNOT_GET_VALIDATION_POLICY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_SASLEXTERNAL_CANNOT_GET_VALIDATION_POLICY_133",EXTENSIONS,SEVERE_ERROR,133, getClassLoader());

  /**
   * Name of the attribute that will be used to hold the certificate information in user entries for the purpose of validation.  This must specify the name of a valid attribute type defined in the server schema.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_SASLEXTERNAL_DESCRIPTION_CERTIFICATE_ATTRIBUTE =
          new MessageDescriptor.Arg0(BASE,"INFO_SASLEXTERNAL_DESCRIPTION_CERTIFICATE_ATTRIBUTE_134",EXTENSIONS,INFORMATION,134, getClassLoader());

  /**
   * An unexpected error occurred while attempting to determine the value of the ds-cfg-certificate-attribute attribute in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASLEXTERNAL_CANNOT_GET_CERT_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_SASLEXTERNAL_CANNOT_GET_CERT_ATTR_135",EXTENSIONS,SEVERE_ERROR,135, getClassLoader());

  /**
   * The attribute %s referenced in configuration attribute ds-cfg-certificate-attribute in configuration entry %s does not exist in the Directory Server schema.  The attribute that is to be used for certificate validation during SASL EXTERNAL authentication must be defined in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASLEXTERNAL_UNKNOWN_CERT_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_SASLEXTERNAL_UNKNOWN_CERT_ATTR_136",EXTENSIONS,SEVERE_ERROR,136, getClassLoader());

  /**
   * Unable to authenticate via SASL EXTERNAL because the mapped user entry %s does not have any certificates with which to verify the presented peer certificate
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SASLEXTERNAL_NO_CERT_IN_ENTRY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SASLEXTERNAL_NO_CERT_IN_ENTRY_137",EXTENSIONS,MILD_ERROR,137, getClassLoader());

  /**
   * Unable to authenticate via SASL EXTERNAL because the mapped user entry %s did not contain the peer certificate presented by the client
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SASLEXTERNAL_PEER_CERT_NOT_FOUND =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SASLEXTERNAL_PEER_CERT_NOT_FOUND_138",EXTENSIONS,MILD_ERROR,138, getClassLoader());

  /**
   * An error occurred while attempting to validate the peer certificate presented by the client with a certificate from the user's entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASLEXTERNAL_CANNOT_VALIDATE_CERT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SASLEXTERNAL_CANNOT_VALIDATE_CERT_139",EXTENSIONS,MILD_ERROR,139, getClassLoader());

  /**
   * Attribute ds-cfg-certificate-validation-policy in configuration entry %s has been updated.  The new client certificate validation policy is %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_SASLEXTERNAL_UPDATED_VALIDATION_POLICY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_SASLEXTERNAL_UPDATED_VALIDATION_POLICY_140",EXTENSIONS,INFORMATION,140, getClassLoader());

  /**
   * Attribute ds-cfg-certificate-attribute in configuration entry %s has been updated.  The %s attribute will now be used when validating peer certificates
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_SASLEXTERNAL_UPDATED_CERT_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_SASLEXTERNAL_UPDATED_CERT_ATTR_141",EXTENSIONS,INFORMATION,141, getClassLoader());

  /**
   * Name of the attribute that will be used to identify user entries based on the authcID/authzID provided during SASL PLAIN authentication.  This must specify the name of a valid attribute type defined in the server schema.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_SASLPLAIN_DESCRIPTION_USERNAME_ATTRIBUTE =
          new MessageDescriptor.Arg0(BASE,"INFO_SASLPLAIN_DESCRIPTION_USERNAME_ATTRIBUTE_142",EXTENSIONS,INFORMATION,142, getClassLoader());

  /**
   * An unexpected error occurred while attempting to determine the value of the ds-cfg-user-name-attribute attribute in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASLPLAIN_CANNOT_GET_USERNAME_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_SASLPLAIN_CANNOT_GET_USERNAME_ATTR_143",EXTENSIONS,SEVERE_ERROR,143, getClassLoader());

  /**
   * The attribute %s referenced in configuration attribute ds-cfg-user-name-attribute in configuration entry %s does not exist in the Directory Server schema.  The attribute that is to be used for username lookups during SASL PLAIN authentication must be defined in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASLPLAIN_UNKNOWN_USERNAME_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_SASLPLAIN_UNKNOWN_USERNAME_ATTR_144",EXTENSIONS,SEVERE_ERROR,144, getClassLoader());

  /**
   * Base DN that should be used when searching for entries based on the authcID/authzID provided during SASL PLAIN authentication.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_SASLPLAIN_DESCRIPTION_USER_BASE_DN =
          new MessageDescriptor.Arg0(BASE,"INFO_SASLPLAIN_DESCRIPTION_USER_BASE_DN_145",EXTENSIONS,INFORMATION,145, getClassLoader());

  /**
   * An unexpected error occurred while attempting to determine the value of the ds-cfg-user-base-dn attribute in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASLPLAIN_CANNOT_GET_USER_BASE_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_SASLPLAIN_CANNOT_GET_USER_BASE_DN_146",EXTENSIONS,SEVERE_ERROR,146, getClassLoader());

  /**
   * SASL PLAIN authentication requires that SASL credentials be provided but none were included in the bind request
   */
  public static final MessageDescriptor.Arg0 ERR_SASLPLAIN_NO_SASL_CREDENTIALS =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_SASLPLAIN_NO_SASL_CREDENTIALS_147",EXTENSIONS,MILD_ERROR,147, getClassLoader());

  /**
   * The SASL PLAIN bind request did not include any NULL characters.  NULL characters are required as delimiters between the authorization ID and authentication ID, and also between the authentication ID and the password
   */
  public static final MessageDescriptor.Arg0 ERR_SASLPLAIN_NO_NULLS_IN_CREDENTIALS =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_SASLPLAIN_NO_NULLS_IN_CREDENTIALS_148",EXTENSIONS,MILD_ERROR,148, getClassLoader());

  /**
   * The SASL PLAIN bind request did not include a second NULL character in the credentials, which is required as a delimiter between the authentication ID and the password
   */
  public static final MessageDescriptor.Arg0 ERR_SASLPLAIN_NO_SECOND_NULL =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_SASLPLAIN_NO_SECOND_NULL_149",EXTENSIONS,MILD_ERROR,149, getClassLoader());

  /**
   * The authentication ID contained in the SASL PLAIN bind request had a length of zero characters, which is not allowed.  SASL PLAIN authentication does not allow an empty string for use as the authentication ID
   */
  public static final MessageDescriptor.Arg0 ERR_SASLPLAIN_ZERO_LENGTH_AUTHCID =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_SASLPLAIN_ZERO_LENGTH_AUTHCID_150",EXTENSIONS,MILD_ERROR,150, getClassLoader());

  /**
   * The password contained in the SASL PLAIN bind request had a length of zero characters, which is not allowed.  SASL PLAIN authentication does not allow an empty string for use as the password
   */
  public static final MessageDescriptor.Arg0 ERR_SASLPLAIN_ZERO_LENGTH_PASSWORD =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_SASLPLAIN_ZERO_LENGTH_PASSWORD_151",EXTENSIONS,MILD_ERROR,151, getClassLoader());

  /**
   * An error occurred while attempting to decode the SASL PLAIN authentication ID "%s" because it appeared to contain a DN but DN decoding failed:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASLPLAIN_CANNOT_DECODE_AUTHCID_AS_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SASLPLAIN_CANNOT_DECODE_AUTHCID_AS_DN_152",EXTENSIONS,MILD_ERROR,152, getClassLoader());

  /**
   * The authentication ID in the SASL PLAIN bind request appears to be an empty DN.  This is not allowed
   */
  public static final MessageDescriptor.Arg0 ERR_SASLPLAIN_AUTHCID_IS_NULL_DN =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_SASLPLAIN_AUTHCID_IS_NULL_DN_153",EXTENSIONS,MILD_ERROR,153, getClassLoader());

  /**
   * An error occurred while attempting to retrieve user entry %s as specified in the DN-based authentication ID of a SASL PLAIN bind request:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASLPLAIN_CANNOT_GET_ENTRY_BY_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SASLPLAIN_CANNOT_GET_ENTRY_BY_DN_154",EXTENSIONS,MILD_ERROR,154, getClassLoader());

  /**
   * An error occurred while trying to perform an internal search to retrieve the user entry associated with the SASL PLAIN authentication ID %s.  The result of that search was %s with a message of %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SASLPLAIN_CANNOT_PERFORM_INTERNAL_SEARCH =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_SASLPLAIN_CANNOT_PERFORM_INTERNAL_SEARCH_155",EXTENSIONS,MILD_ERROR,155, getClassLoader());

  /**
   * The internal search attempting to resolve SASL PLAIN authentication ID %s matched multiple entries.  Authentication cannot succeed unless the authentication ID is mapped to exactly one user entry
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SASLPLAIN_MULTIPLE_MATCHING_ENTRIES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SASLPLAIN_MULTIPLE_MATCHING_ENTRIES_156",EXTENSIONS,MILD_ERROR,156, getClassLoader());

  /**
   * The server was not able to find any user entries for the provided authentication ID of %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SASLPLAIN_NO_MATCHING_ENTRIES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SASLPLAIN_NO_MATCHING_ENTRIES_157",EXTENSIONS,MILD_ERROR,157, getClassLoader());

  /**
   * The SASL PLAIN authentication failed because the mapped user entry did not contain any values for the %s attribute
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SASLPLAIN_NO_PW_ATTR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SASLPLAIN_NO_PW_ATTR_158",EXTENSIONS,MILD_ERROR,158, getClassLoader());

  /**
   * A password in the target user entry %s could not be processed via SASL PLAIN because that password has an unknown storage scheme of %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASLPLAIN_UNKNOWN_STORAGE_SCHEME =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SASLPLAIN_UNKNOWN_STORAGE_SCHEME_159",EXTENSIONS,MILD_ERROR,159, getClassLoader());

  /**
   * The provided password is invalid
   */
  public static final MessageDescriptor.Arg0 ERR_SASLPLAIN_INVALID_PASSWORD =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_SASLPLAIN_INVALID_PASSWORD_160",EXTENSIONS,MILD_ERROR,160, getClassLoader());

  /**
   * Attribute ds-cfg-user-name-attribute in configuration entry %s has been updated.  The %s attribute will now be used when looking up user entries based on their authcID/authzID
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_SASLPLAIN_UPDATED_USERNAME_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_SASLPLAIN_UPDATED_USERNAME_ATTR_161",EXTENSIONS,INFORMATION,161, getClassLoader());

  /**
   * Attribute ds-cfg-user-base-dn in configuration entry %s has been updated.  The DN %s will now be used as the search base when looking up user entries based on their authcID/authzID
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_SASLPLAIN_UPDATED_USER_BASE_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_SASLPLAIN_UPDATED_USER_BASE_DN_162",EXTENSIONS,INFORMATION,162, getClassLoader());

  /**
   * The Directory Server was unable to obtain a read lock on user entry %s in order to retrieve that entry
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_SASLPLAIN_CANNOT_LOCK_ENTRY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_SASLPLAIN_CANNOT_LOCK_ENTRY_163",EXTENSIONS,INFORMATION,163, getClassLoader());

  /**
   * The Directory Server was unable to obtain a read lock on user entry %s in order to retrieve that entry
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SEDCM_CANNOT_LOCK_ENTRY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SEDCM_CANNOT_LOCK_ENTRY_164",EXTENSIONS,MILD_ERROR,164, getClassLoader());

  /**
   * SASL ANONYMOUS bind operation (conn=%d, op=%d) provided trace information:  %s
   */
  public static final MessageDescriptor.Arg3<Number,Number,CharSequence> INFO_SASLANONYMOUS_TRACE =
          new MessageDescriptor.Arg3<Number,Number,CharSequence>(BASE,"INFO_SASLANONYMOUS_TRACE_165",EXTENSIONS,INFORMATION,165, getClassLoader());

  /**
   * An unexpected error occurred while attempting to obtain an MD5 digest engine for use by the CRAM-MD5 SASL handler:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SASLCRAMMD5_CANNOT_GET_MESSAGE_DIGEST =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_SASLCRAMMD5_CANNOT_GET_MESSAGE_DIGEST_166",EXTENSIONS,SEVERE_ERROR,166, getClassLoader());

  /**
   * Name of the attribute that will be used to identify user entries based on the username provided during SASL CRAM-MD5 authentication.  This must specify the name of a valid attribute type defined in the server schema.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_SASLCRAMMD5_DESCRIPTION_USERNAME_ATTRIBUTE =
          new MessageDescriptor.Arg0(BASE,"INFO_SASLCRAMMD5_DESCRIPTION_USERNAME_ATTRIBUTE_167",EXTENSIONS,INFORMATION,167, getClassLoader());

  /**
   * An unexpected error occurred while attempting to determine the value of the ds-cfg-user-name-attribute attribute in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASLCRAMMD5_CANNOT_GET_USERNAME_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_SASLCRAMMD5_CANNOT_GET_USERNAME_ATTR_168",EXTENSIONS,SEVERE_ERROR,168, getClassLoader());

  /**
   * The attribute %s referenced in configuration attribute ds-cfg-user-name-attribute in configuration entry %s does not exist in the Directory Server schema.  The attribute that is to be used for username lookups during SASL CRAM-MD5 authentication must be defined in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASLCRAMMD5_UNKNOWN_USERNAME_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_SASLCRAMMD5_UNKNOWN_USERNAME_ATTR_169",EXTENSIONS,SEVERE_ERROR,169, getClassLoader());

  /**
   * Base DN that should be used when searching for entries based on the username provided during SASL CRAM-MD5 authentication.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_SASLCRAMMD5_DESCRIPTION_USER_BASE_DN =
          new MessageDescriptor.Arg0(BASE,"INFO_SASLCRAMMD5_DESCRIPTION_USER_BASE_DN_170",EXTENSIONS,INFORMATION,170, getClassLoader());

  /**
   * An unexpected error occurred while attempting to determine the value of the ds-cfg-user-base-dn attribute in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASLCRAMMD5_CANNOT_GET_USER_BASE_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_SASLCRAMMD5_CANNOT_GET_USER_BASE_DN_171",EXTENSIONS,SEVERE_ERROR,171, getClassLoader());

  /**
   * The SASL CRAM-MD5 bind request contained SASL credentials but there is no stored challenge for this client connection.  The first CRAM-MD5 bind request in the two-stage process must not contain client SASL credentials
   */
  public static final MessageDescriptor.Arg0 ERR_SASLCRAMMD5_NO_STORED_CHALLENGE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_SASLCRAMMD5_NO_STORED_CHALLENGE_172",EXTENSIONS,MILD_ERROR,172, getClassLoader());

  /**
   * The SASL CRAM-MD5 bind request contained SASL credentials, but the stored SASL state information for this client connection is not in an appropriate form for the challenge
   */
  public static final MessageDescriptor.Arg0 ERR_SASLCRAMMD5_INVALID_STORED_CHALLENGE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_SASLCRAMMD5_INVALID_STORED_CHALLENGE_173",EXTENSIONS,MILD_ERROR,173, getClassLoader());

  /**
   * The SASL CRAM-MD5 bind request from the client included SASL credentials but there was no space to separate the username from the authentication digest
   */
  public static final MessageDescriptor.Arg0 ERR_SASLCRAMMD5_NO_SPACE_IN_CREDENTIALS =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_SASLCRAMMD5_NO_SPACE_IN_CREDENTIALS_174",EXTENSIONS,MILD_ERROR,174, getClassLoader());

  /**
   * The SASL CRAM-MD5 bind request included SASL credentials, but the decoded digest string had an invalid length of %d bytes rather than the %d bytes expected for a hex representation of an MD5 digest
   */
  public static final MessageDescriptor.Arg2<Number,Number> ERR_SASLCRAMMD5_INVALID_DIGEST_LENGTH =
          new MessageDescriptor.Arg2<Number,Number>(BASE,"MILD_ERR_SASLCRAMMD5_INVALID_DIGEST_LENGTH_175",EXTENSIONS,MILD_ERROR,175, getClassLoader());

  /**
   * The SASL CRAM-MD5 bind request included SASL credentials, but the decoded digest was not comprised of only hexadecimal digits:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SASLCRAMMD5_INVALID_DIGEST_CONTENT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SASLCRAMMD5_INVALID_DIGEST_CONTENT_176",EXTENSIONS,MILD_ERROR,176, getClassLoader());

  /**
   * An error occurred while attempting to decode the SASL CRAM-MD5 username "%s" because it appeared to contain a DN but DN decoding failed:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASLCRAMMD5_CANNOT_DECODE_USERNAME_AS_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SASLCRAMMD5_CANNOT_DECODE_USERNAME_AS_DN_177",EXTENSIONS,MILD_ERROR,177, getClassLoader());

  /**
   * The username in the SASL CRAM-MD5 bind request appears to be an empty DN.  This is not allowed
   */
  public static final MessageDescriptor.Arg0 ERR_SASLCRAMMD5_USERNAME_IS_NULL_DN =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_SASLCRAMMD5_USERNAME_IS_NULL_DN_178",EXTENSIONS,MILD_ERROR,178, getClassLoader());

  /**
   * The Directory Server was unable to obtain a read lock on user entry %s in order to retrieve that entry
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_SASLCRAMMD5_CANNOT_LOCK_ENTRY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_SASLCRAMMD5_CANNOT_LOCK_ENTRY_179",EXTENSIONS,INFORMATION,179, getClassLoader());

  /**
   * An error occurred while attempting to retrieve user entry %s as specified in the DN-based username of a SASL CRAM-MD5 bind request:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASLCRAMMD5_CANNOT_GET_ENTRY_BY_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SASLCRAMMD5_CANNOT_GET_ENTRY_BY_DN_180",EXTENSIONS,MILD_ERROR,180, getClassLoader());

  /**
   * The username contained in the SASL CRAM-MD5 bind request had a length of zero characters, which is not allowed.  CRAM-MD5 authentication does not allow an empty string for use as the username
   */
  public static final MessageDescriptor.Arg0 ERR_SASLCRAMMD5_ZERO_LENGTH_USERNAME =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_SASLCRAMMD5_ZERO_LENGTH_USERNAME_181",EXTENSIONS,MILD_ERROR,181, getClassLoader());

  /**
   * An error occurred while trying to perform an internal search to retrieve the user entry associated with the SASL CRAM-MD5 username %s.  The result of that search was %s with a message of %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SASLCRAMMD5_CANNOT_PERFORM_INTERNAL_SEARCH =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_SASLCRAMMD5_CANNOT_PERFORM_INTERNAL_SEARCH_182",EXTENSIONS,MILD_ERROR,182, getClassLoader());

  /**
   * The internal search attempting to resolve SASL CRAM-MD5 username %s matched multiple entries. Authentication cannot succeed unless the username is mapped to exactly one user entry
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SASLCRAMMD5_MULTIPLE_MATCHING_ENTRIES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SASLCRAMMD5_MULTIPLE_MATCHING_ENTRIES_183",EXTENSIONS,MILD_ERROR,183, getClassLoader());

  /**
   * The server was not able to find any user entries for the provided username of %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SASLCRAMMD5_NO_MATCHING_ENTRIES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SASLCRAMMD5_NO_MATCHING_ENTRIES_184",EXTENSIONS,MILD_ERROR,184, getClassLoader());

  /**
   * The SASL CRAM-MD5 authentication failed because the mapped user entry did not contain any values for the %s attribute
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SASLCRAMMD5_NO_PW_ATTR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SASLCRAMMD5_NO_PW_ATTR_185",EXTENSIONS,MILD_ERROR,185, getClassLoader());

  /**
   * A password in the target user entry %s could not be processed via SASL CRAM-MD5 because that password has an unknown storage scheme of %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASLCRAMMD5_UNKNOWN_STORAGE_SCHEME =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SASLCRAMMD5_UNKNOWN_STORAGE_SCHEME_186",EXTENSIONS,MILD_ERROR,186, getClassLoader());

  /**
   * An error occurred while attempting to obtain the clear-text password for user %s from the value with storage scheme %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SASLCRAMMD5_CANNOT_GET_CLEAR_PASSWORD =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_SASLCRAMMD5_CANNOT_GET_CLEAR_PASSWORD_187",EXTENSIONS,MILD_ERROR,187, getClassLoader());

  /**
   * The provided password is invalid
   */
  public static final MessageDescriptor.Arg0 ERR_SASLCRAMMD5_INVALID_PASSWORD =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_SASLCRAMMD5_INVALID_PASSWORD_188",EXTENSIONS,MILD_ERROR,188, getClassLoader());

  /**
   * SASL CRAM-MD5 authentication is not possible for user %s because none of the passwords in the user entry are stored in a reversible form
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SASLCRAMMD5_NO_REVERSIBLE_PASSWORDS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SASLCRAMMD5_NO_REVERSIBLE_PASSWORDS_189",EXTENSIONS,MILD_ERROR,189, getClassLoader());

  /**
   * Attribute ds-cfg-user-name-attribute in configuration entry %s has been updated.  The %s attribute will now be used when looking up user entries based on their username
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_SASLCRAMMD5_UPDATED_USERNAME_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_SASLCRAMMD5_UPDATED_USERNAME_ATTR_190",EXTENSIONS,INFORMATION,190, getClassLoader());

  /**
   * Attribute ds-cfg-user-base-dn in configuration entry %s has been updated.  The DN %s will now be used as the search base when looking up user entries based on their username
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_SASLCRAMMD5_UPDATED_USER_BASE_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_SASLCRAMMD5_UPDATED_USER_BASE_DN_191",EXTENSIONS,INFORMATION,191, getClassLoader());

  /**
   * An unsupported or unexpected callback was provided to the SASL server for use during %s authentication:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_SASL_UNSUPPORTED_CALLBACK =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_SASL_UNSUPPORTED_CALLBACK_192",EXTENSIONS,INFORMATION,192, getClassLoader());

  /**
   * The client connection included %s state information, indicating that the client was in the process of performing a %s bind, but the bind request did not include any credentials
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASL_NO_CREDENTIALS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SASL_NO_CREDENTIALS_193",EXTENSIONS,MILD_ERROR,193, getClassLoader());

  /**
   * An unexpected error occurred while attempting to determine the value of the ds-cfg-server-fqdn attribute in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASL_CANNOT_GET_SERVER_FQDN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_SASL_CANNOT_GET_SERVER_FQDN_194",EXTENSIONS,SEVERE_ERROR,194, getClassLoader());

  /**
   * An unexpected error occurred while trying to create an %s context: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASL_CONTEXT_CREATE_ERROR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_SASL_CONTEXT_CREATE_ERROR_195",EXTENSIONS,SEVERE_ERROR,195, getClassLoader());

  /**
   * An error occurred while attempting to decode the SASL %s username "%s" because it appeared to contain a DN but DN decoding failed:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SASL_CANNOT_DECODE_USERNAME_AS_DN =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_SASL_CANNOT_DECODE_USERNAME_AS_DN_196",EXTENSIONS,MILD_ERROR,196, getClassLoader());

  /**
   * The username in the SASL %s bind request appears to be an empty DN.  This is not allowed
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SASL_USERNAME_IS_NULL_DN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SASL_USERNAME_IS_NULL_DN_197",EXTENSIONS,MILD_ERROR,197, getClassLoader());

  /**
   * The Directory Server was unable to obtain a read lock on user entry %s in order to retrieve that entry
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_SASL_CANNOT_LOCK_ENTRY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_SASL_CANNOT_LOCK_ENTRY_198",EXTENSIONS,INFORMATION,198, getClassLoader());

  /**
   * An error occurred while attempting to retrieve user entry %s as specified in the DN-based username of a SASL %s bind request:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SASL_CANNOT_GET_ENTRY_BY_DN =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_SASL_CANNOT_GET_ENTRY_BY_DN_199",EXTENSIONS,MILD_ERROR,199, getClassLoader());

  /**
   * The username contained in the SASL %s bind request had a length of zero characters, which is not allowed.  %s authentication does not allow an empty string for use as the username
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASL_ZERO_LENGTH_USERNAME =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SASL_ZERO_LENGTH_USERNAME_200",EXTENSIONS,MILD_ERROR,200, getClassLoader());

  /**
   * The server was not able to find any user entries for the provided username of %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SASL_NO_MATCHING_ENTRIES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SASL_NO_MATCHING_ENTRIES_201",EXTENSIONS,MILD_ERROR,201, getClassLoader());

  /**
   * The provided authorization ID %s contained an invalid DN:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASL_AUTHZID_INVALID_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SASL_AUTHZID_INVALID_DN_202",EXTENSIONS,MILD_ERROR,202, getClassLoader());

  /**
   * The entry %s specified as the authorization identity does not exist
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SASL_AUTHZID_NO_SUCH_ENTRY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SASL_AUTHZID_NO_SUCH_ENTRY_203",EXTENSIONS,MILD_ERROR,203, getClassLoader());

  /**
   * The entry %s specified as the authorization identity could not be retrieved:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASL_AUTHZID_CANNOT_GET_ENTRY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SASL_AUTHZID_CANNOT_GET_ENTRY_204",EXTENSIONS,MILD_ERROR,204, getClassLoader());

  /**
   * The server was unable to find any entry corresponding to authorization ID %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SASL_AUTHZID_NO_MAPPED_ENTRY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SASL_AUTHZID_NO_MAPPED_ENTRY_205",EXTENSIONS,MILD_ERROR,205, getClassLoader());

  /**
   * An error occurred while attempting to map authorization ID %s to a user entry:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASL_CANNOT_MAP_AUTHZID =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SASL_CANNOT_MAP_AUTHZID_206",EXTENSIONS,MILD_ERROR,206, getClassLoader());

  /**
   * An error occurred while attempting to retrieve the clear-text password(s) for user %s in order to perform SASL %s authentication:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SASL_CANNOT_GET_REVERSIBLE_PASSWORDS =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_SASL_CANNOT_GET_REVERSIBLE_PASSWORDS_207",EXTENSIONS,MILD_ERROR,207, getClassLoader());

  /**
   * SASL %s authentication is not possible for user %s because none of the passwords in the user entry are stored in a reversible form
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASL_NO_REVERSIBLE_PASSWORDS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SASL_NO_REVERSIBLE_PASSWORDS_208",EXTENSIONS,MILD_ERROR,208, getClassLoader());

  /**
   * SASL %s protocol error: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASL_PROTOCOL_ERROR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_SASL_PROTOCOL_ERROR_209",EXTENSIONS,SEVERE_ERROR,209, getClassLoader());

  /**
   * The authenticating user %s does not have sufficient privileges to assume a different authorization identity
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SASL_AUTHZID_INSUFFICIENT_PRIVILEGES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SASL_AUTHZID_INSUFFICIENT_PRIVILEGES_210",EXTENSIONS,MILD_ERROR,210, getClassLoader());

  /**
   * The authenticating user %s does not have sufficient access to assume a different authorization identity
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SASL_AUTHZID_INSUFFICIENT_ACCESS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SASL_AUTHZID_INSUFFICIENT_ACCESS_211",EXTENSIONS,MILD_ERROR,211, getClassLoader());

  /**
   * The server was unable to find any entry corresponding to authentication ID %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SASL_AUTHENTRY_NO_MAPPED_ENTRY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SASL_AUTHENTRY_NO_MAPPED_ENTRY_212",EXTENSIONS,MILD_ERROR,212, getClassLoader());

  /**
   * The server was unable to because both the ds-cfg-kdc-address and ds-cfg-realm attributes must be defined or neither defined
   */
  public static final MessageDescriptor.Arg0 ERR_SASLGSSAPI_KDC_REALM_NOT_DEFINED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_SASLGSSAPI_KDC_REALM_NOT_DEFINED_213",EXTENSIONS,SEVERE_ERROR,213, getClassLoader());

  /**
   * An error occurred while attempting to map authorization ID %s to a user entry:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASL_CANNOT_MAP_AUTHENTRY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SASL_CANNOT_MAP_AUTHENTRY_214",EXTENSIONS,MILD_ERROR,214, getClassLoader());

  /**
   * An error occurred while attempting to write a temporary JAAS configuration file for use during GSSAPI processing:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SASLGSSAPI_CANNOT_CREATE_JAAS_CONFIG =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_SASLGSSAPI_CANNOT_CREATE_JAAS_CONFIG_215",EXTENSIONS,SEVERE_ERROR,215, getClassLoader());

  /**
   * An error occurred while attempting to create the JAAS login context for GSSAPI authentication:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SASLGSSAPI_CANNOT_CREATE_LOGIN_CONTEXT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_SASLGSSAPI_CANNOT_CREATE_LOGIN_CONTEXT_216",EXTENSIONS,SEVERE_ERROR,216, getClassLoader());

  /**
   * No client connection was available for use in processing the GSSAPI bind request
   */
  public static final MessageDescriptor.Arg0 ERR_SASLGSSAPI_NO_CLIENT_CONNECTION =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_SASLGSSAPI_NO_CLIENT_CONNECTION_217",EXTENSIONS,MILD_ERROR,217, getClassLoader());

  /**
   * GSSAPI mechanism using a principal name of: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_GSSAPI_PRINCIPAL_NAME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_GSSAPI_PRINCIPAL_NAME_218",EXTENSIONS,INFORMATION,218, getClassLoader());

  /**
   * GSSAPI SASL mechanism using a server fully qualified domain name of: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_GSSAPI_SERVER_FQDN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_GSSAPI_SERVER_FQDN_219",EXTENSIONS,INFORMATION,219, getClassLoader());

  /**
   * DIGEST-MD5 SASL mechanism using a realm of: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DIGEST_MD5_REALM =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DIGEST_MD5_REALM_220",EXTENSIONS,INFORMATION,220, getClassLoader());

  /**
   * DIGEST-MD5 SASL mechanism using a server fully qualified domain name of: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DIGEST_MD5_SERVER_FQDN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DIGEST_MD5_SERVER_FQDN_221",EXTENSIONS,INFORMATION,221, getClassLoader());

  /**
   * You do not have sufficient privileges to use the proxied authorization control
   */
  public static final MessageDescriptor.Arg0 ERR_EXTOP_WHOAMI_PROXYAUTH_INSUFFICIENT_PRIVILEGES =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_EXTOP_WHOAMI_PROXYAUTH_INSUFFICIENT_PRIVILEGES_277",EXTENSIONS,SEVERE_ERROR,277, getClassLoader());

  /**
   * Name or OID of the attribute whose value should exactly match the ID string provided to this identity mapper.  At least one value must be provided.  All values must refer to the name or OID of an attribute type defined in the Directory Server schema.  If multiple attribute type names or OIDs are provided, then at least one of those attributes must contain the provided ID string value in exactly one entry
   */
  public static final MessageDescriptor.Arg0 INFO_EXACTMAP_DESCRIPTION_MATCH_ATTR =
          new MessageDescriptor.Arg0(BASE,"INFO_EXACTMAP_DESCRIPTION_MATCH_ATTR_298",EXTENSIONS,INFORMATION,298, getClassLoader());

  /**
   * Configuration entry %s does not have any values for attribute ds-cfg-match-attribute, which is used to specify which attribute(s) may be used to map a given ID string to a user entry
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_EXACTMAP_NO_MATCH_ATTR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_EXACTMAP_NO_MATCH_ATTR_299",EXTENSIONS,MILD_ERROR,299, getClassLoader());

  /**
   * Configuration entry %s contains value %s for attribute ds-cfg-match-attribute but that is not a valid name or OID for any attribute type defined in the Directory Server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_EXACTMAP_UNKNOWN_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_EXACTMAP_UNKNOWN_ATTR_300",EXTENSIONS,MILD_ERROR,300, getClassLoader());

  /**
   * An error occurred while attempting to process the value(s) of attribute ds-cfg-match-attribute in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_EXACTMAP_CANNOT_DETERMINE_MATCH_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_EXACTMAP_CANNOT_DETERMINE_MATCH_ATTR_301",EXTENSIONS,MILD_ERROR,301, getClassLoader());

  /**
   * Base DN(s) that should be used when performing searches to map the provided ID string to a user entry.  If no values are provided, then the root DSE will be used as the search base
   */
  public static final MessageDescriptor.Arg0 INFO_EXACTMAP_DESCRIPTION_SEARCH_BASE =
          new MessageDescriptor.Arg0(BASE,"INFO_EXACTMAP_DESCRIPTION_SEARCH_BASE_302",EXTENSIONS,INFORMATION,302, getClassLoader());

  /**
   * An error occurred while attempting to process the value(s) of attribute ds-cfg-match-base-dn in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_EXACTMAP_CANNOT_DETERMINE_MATCH_BASE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_EXACTMAP_CANNOT_DETERMINE_MATCH_BASE_303",EXTENSIONS,MILD_ERROR,303, getClassLoader());

  /**
   * The set of attributes to use when matching ID strings to user entries contained in attribute ds-cfg-match-attribute of configuration entry %s has been updated
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_EXACTMAP_UPDATED_MATCH_ATTRS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_EXACTMAP_UPDATED_MATCH_ATTRS_304",EXTENSIONS,INFORMATION,304, getClassLoader());

  /**
   * The set of search base DNs to use when matching ID strings to user entries contained in attribute ds-cfg-match-base-dn of configuration entry %s has been updated
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_EXACTMAP_UPDATED_MATCH_BASES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_EXACTMAP_UPDATED_MATCH_BASES_305",EXTENSIONS,INFORMATION,305, getClassLoader());

  /**
   * ID string %s mapped to multiple users
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_EXACTMAP_MULTIPLE_MATCHING_ENTRIES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_EXACTMAP_MULTIPLE_MATCHING_ENTRIES_306",EXTENSIONS,MILD_ERROR,306, getClassLoader());

  /**
   * The internal search based on ID string %s could not be processed efficiently:  %s.  Check the server configuration to ensure that all associated backends are properly configured for these types of searches
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_EXACTMAP_INEFFICIENT_SEARCH =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_EXACTMAP_INEFFICIENT_SEARCH_307",EXTENSIONS,MILD_ERROR,307, getClassLoader());

  /**
   * An internal failure occurred while attempting to resolve ID string %s to a user entry:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_EXACTMAP_SEARCH_FAILED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_EXACTMAP_SEARCH_FAILED_308",EXTENSIONS,MILD_ERROR,308, getClassLoader());

  /**
   * DN of the configuration entry that holds the configuration for the identity mapper that should be used to map the CRAM-MD5 username to a Directory Server user entry. Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_SASLCRAMMD5_DESCRIPTION_IDENTITY_MAPPER_DN =
          new MessageDescriptor.Arg0(BASE,"INFO_SASLCRAMMD5_DESCRIPTION_IDENTITY_MAPPER_DN_309",EXTENSIONS,INFORMATION,309, getClassLoader());

  /**
   * Configuration entry %s does not contain attribute ds-cfg-identity-mapper which specifies the DN of the identity mapper to use in conjunction with the CRAM-MD5 SASL mechanism.  This is a required attribute
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SASLCRAMMD5_NO_IDENTITY_MAPPER_ATTR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SASLCRAMMD5_NO_IDENTITY_MAPPER_ATTR_310",EXTENSIONS,MILD_ERROR,310, getClassLoader());

  /**
   * The identity mapper %s specified in attribute ds-cfg-identity-mapper of configuration entry %s does not reference a valid identity mapper configuration that is enabled for use in the Directory Server
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASLCRAMMD5_NO_SUCH_IDENTITY_MAPPER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SASLCRAMMD5_NO_SUCH_IDENTITY_MAPPER_311",EXTENSIONS,MILD_ERROR,311, getClassLoader());

  /**
   * An error occurred while trying to process the value of the ds-cfg-identity-mapper attribute in configuration entry %s to determine which identity mapper should be used in conjunction with the CRAM-MD5 SASL mechanism:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASLCRAMMD5_CANNOT_GET_IDENTITY_MAPPER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SASLCRAMMD5_CANNOT_GET_IDENTITY_MAPPER_312",EXTENSIONS,MILD_ERROR,312, getClassLoader());

  /**
   * An error occurred while attempting to map username %s to a Directory Server entry:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASLCRAMMD5_CANNOT_MAP_USERNAME =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SASLCRAMMD5_CANNOT_MAP_USERNAME_313",EXTENSIONS,MILD_ERROR,313, getClassLoader());

  /**
   * Attribute ds-cfg-identity-mapper in configuration entry %s has been updated.  The identity mapper defined in configuration entry %s will now be used to map usernames to entries when processing SASL CRAM-MD5 bind requests
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_SASLCRAMMD5_UPDATED_IDENTITY_MAPPER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_SASLCRAMMD5_UPDATED_IDENTITY_MAPPER_314",EXTENSIONS,INFORMATION,314, getClassLoader());

  /**
   * DN of the configuration entry that holds the configuration for the identity mapper that should be used to map the DIGEST-MD5 username to a Directory Server user entry.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_SASLDIGESTMD5_DESCRIPTION_IDENTITY_MAPPER_DN =
          new MessageDescriptor.Arg0(BASE,"INFO_SASLDIGESTMD5_DESCRIPTION_IDENTITY_MAPPER_DN_315",EXTENSIONS,INFORMATION,315, getClassLoader());

  /**
   * Configuration entry %s does not contain attribute ds-cfg-identity-mapper which specifies the DN of the identity mapper to use in conjunction with the DIGEST-MD5 SASL mechanism.  This is a required attribute
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SASLDIGESTMD5_NO_IDENTITY_MAPPER_ATTR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SASLDIGESTMD5_NO_IDENTITY_MAPPER_ATTR_316",EXTENSIONS,MILD_ERROR,316, getClassLoader());

  /**
   * The identity mapper %s specified in attribute ds-cfg-identity-mapper of configuration entry %s does not reference a valid identity mapper configuration that is enabled for use in the Directory Server
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASLDIGESTMD5_NO_SUCH_IDENTITY_MAPPER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SASLDIGESTMD5_NO_SUCH_IDENTITY_MAPPER_317",EXTENSIONS,MILD_ERROR,317, getClassLoader());

  /**
   * An error occurred while trying to process the value of the ds-cfg-identity-mapper attribute in configuration entry %s to determine which identity mapper should be used in conjunction with the DIGEST-MD5 SASL mechanism:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASLDIGESTMD5_CANNOT_GET_IDENTITY_MAPPER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SASLDIGESTMD5_CANNOT_GET_IDENTITY_MAPPER_318",EXTENSIONS,MILD_ERROR,318, getClassLoader());

  /**
   * An error occurred while attempting to map username %s to a Directory Server entry:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASLDIGESTMD5_CANNOT_MAP_USERNAME =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SASLDIGESTMD5_CANNOT_MAP_USERNAME_319",EXTENSIONS,MILD_ERROR,319, getClassLoader());

  /**
   * Attribute ds-cfg-identity-mapper in configuration entry %s has been updated.  The identity mapper defined in configuration entry %s will now be used to map usernames to entries when processing SASL DIGEST-MD5 bind requests
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_SASLDIGESTMD5_UPDATED_IDENTITY_MAPPER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_SASLDIGESTMD5_UPDATED_IDENTITY_MAPPER_320",EXTENSIONS,INFORMATION,320, getClassLoader());

  /**
   * DN of the configuration entry that holds the configuration for the identity mapper that should be used to map the provided username to a Directory Server user entry. Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_SASLPLAIN_DESCRIPTION_IDENTITY_MAPPER_DN =
          new MessageDescriptor.Arg0(BASE,"INFO_SASLPLAIN_DESCRIPTION_IDENTITY_MAPPER_DN_321",EXTENSIONS,INFORMATION,321, getClassLoader());

  /**
   * Configuration entry %s does not contain attribute ds-cfg-identity-mapper which specifies the DN of the identity mapper to use in conjunction with the PLAIN SASL mechanism.  This is a required attribute
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SASLPLAIN_NO_IDENTITY_MAPPER_ATTR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SASLPLAIN_NO_IDENTITY_MAPPER_ATTR_322",EXTENSIONS,MILD_ERROR,322, getClassLoader());

  /**
   * The identity mapper %s specified in attribute ds-cfg-identity-mapper of configuration entry %s does not reference a valid identity mapper configuration that is enabled for use in the Directory Server
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASLPLAIN_NO_SUCH_IDENTITY_MAPPER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SASLPLAIN_NO_SUCH_IDENTITY_MAPPER_323",EXTENSIONS,MILD_ERROR,323, getClassLoader());

  /**
   * An error occurred while trying to process the value of the ds-cfg-identity-mapper attribute in configuration entry %s to determine which identity mapper should be used in conjunction with the PLAIN SASL mechanism:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASLPLAIN_CANNOT_GET_IDENTITY_MAPPER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SASLPLAIN_CANNOT_GET_IDENTITY_MAPPER_324",EXTENSIONS,MILD_ERROR,324, getClassLoader());

  /**
   * An error occurred while attempting to map username %s to a Directory Server entry:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASLPLAIN_CANNOT_MAP_USERNAME =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SASLPLAIN_CANNOT_MAP_USERNAME_325",EXTENSIONS,MILD_ERROR,325, getClassLoader());

  /**
   * Attribute ds-cfg-identity-mapper in configuration entry %s has been updated.  The identity mapper defined in configuration entry %s will now be used to map usernames to entries when processing SASL PLAIN bind requests
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_SASLPLAIN_UPDATED_IDENTITY_MAPPER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_SASLPLAIN_UPDATED_IDENTITY_MAPPER_326",EXTENSIONS,INFORMATION,326, getClassLoader());

  /**
   * Unable to process the cancel request because the extended operation did not include a request value
   */
  public static final MessageDescriptor.Arg0 ERR_EXTOP_CANCEL_NO_REQUEST_VALUE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_EXTOP_CANCEL_NO_REQUEST_VALUE_327",EXTENSIONS,MILD_ERROR,327, getClassLoader());

  /**
   * An error occurred while attempting to decode the value of the cancel extended request:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_EXTOP_CANCEL_CANNOT_DECODE_REQUEST_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_EXTOP_CANCEL_CANNOT_DECODE_REQUEST_VALUE_328",EXTENSIONS,MILD_ERROR,328, getClassLoader());

  /**
   * Processing on this operation was terminated as a result of receiving a cancel request (message ID %d)
   */
  public static final MessageDescriptor.Arg1<Number> INFO_EXTOP_CANCEL_REASON =
          new MessageDescriptor.Arg1<Number>(BASE,"INFO_EXTOP_CANCEL_REASON_329",EXTENSIONS,INFORMATION,329, getClassLoader());

  /**
   * Password storage scheme %s does not support use with the authentication password attribute syntax
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PWSCHEME_DOES_NOT_SUPPORT_AUTH_PASSWORD =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_PWSCHEME_DOES_NOT_SUPPORT_AUTH_PASSWORD_330",EXTENSIONS,MILD_ERROR,330, getClassLoader());

  /**
   * Minimum number of characters that a password will be allowed to have.  A value of zero indicates that there is no minimum length.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_PWLENGTHVALIDATOR_DESCRIPTION_MIN_LENGTH =
          new MessageDescriptor.Arg0(BASE,"INFO_PWLENGTHVALIDATOR_DESCRIPTION_MIN_LENGTH_331",EXTENSIONS,INFORMATION,331, getClassLoader());

  /**
   * An error occurred while attempting to determine the minimum allowed password length from the ds-cfg-min-password-length attribute:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PWLENGTHVALIDATOR_CANNOT_DETERMINE_MIN_LENGTH =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_PWLENGTHVALIDATOR_CANNOT_DETERMINE_MIN_LENGTH_332",EXTENSIONS,MILD_ERROR,332, getClassLoader());

  /**
   * Maximum number of characters that a password will be allowed to have.  A value of zero indicates that there is no maximum length.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_PWLENGTHVALIDATOR_DESCRIPTION_MAX_LENGTH =
          new MessageDescriptor.Arg0(BASE,"INFO_PWLENGTHVALIDATOR_DESCRIPTION_MAX_LENGTH_333",EXTENSIONS,INFORMATION,333, getClassLoader());

  /**
   * An error occurred while attempting to determine the maximum allowed password length from the ds-cfg-max-password-length attribute:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PWLENGTHVALIDATOR_CANNOT_DETERMINE_MAX_LENGTH =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_PWLENGTHVALIDATOR_CANNOT_DETERMINE_MAX_LENGTH_334",EXTENSIONS,MILD_ERROR,334, getClassLoader());

  /**
   * The configured minimum password length of %d characters is greater than the configured maximum password length of %d
   */
  public static final MessageDescriptor.Arg2<Number,Number> ERR_PWLENGTHVALIDATOR_MIN_GREATER_THAN_MAX =
          new MessageDescriptor.Arg2<Number,Number>(BASE,"MILD_ERR_PWLENGTHVALIDATOR_MIN_GREATER_THAN_MAX_335",EXTENSIONS,MILD_ERROR,335, getClassLoader());

  /**
   * The provided password is shorter than the minimum required length of %d characters
   */
  public static final MessageDescriptor.Arg1<Number> ERR_PWLENGTHVALIDATOR_TOO_SHORT =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_PWLENGTHVALIDATOR_TOO_SHORT_336",EXTENSIONS,MILD_ERROR,336, getClassLoader());

  /**
   * The provided password is longer than the maximum allowed length of %d characters
   */
  public static final MessageDescriptor.Arg1<Number> ERR_PWLENGTHVALIDATOR_TOO_LONG =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_PWLENGTHVALIDATOR_TOO_LONG_337",EXTENSIONS,MILD_ERROR,337, getClassLoader());

  /**
   * The minimum password length has been updated to %d
   */
  public static final MessageDescriptor.Arg1<Number> INFO_PWLENGTHVALIDATOR_UPDATED_MIN_LENGTH =
          new MessageDescriptor.Arg1<Number>(BASE,"INFO_PWLENGTHVALIDATOR_UPDATED_MIN_LENGTH_338",EXTENSIONS,INFORMATION,338, getClassLoader());

  /**
   * The maximum password length has been updated to %d
   */
  public static final MessageDescriptor.Arg1<Number> INFO_PWLENGTHVALIDATOR_UPDATED_MAX_LENGTH =
          new MessageDescriptor.Arg1<Number>(BASE,"INFO_PWLENGTHVALIDATOR_UPDATED_MAX_LENGTH_339",EXTENSIONS,INFORMATION,339, getClassLoader());

  /**
   * Character set(s) that should be used to generate the passwords.  Each character set should be given a name (consisting of only ASCII alphabetic characters) followed immediately by a colon and the set of characters that should be included in that character set.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_RANDOMPWGEN_DESCRIPTION_CHARSET =
          new MessageDescriptor.Arg0(BASE,"INFO_RANDOMPWGEN_DESCRIPTION_CHARSET_340",EXTENSIONS,INFORMATION,340, getClassLoader());

  /**
   * Configuration entry "%s" does not contain attribute ds-cfg-password-character-set which specifies the sets of characters that should be used when generating the password.  This is a required attribute
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_RANDOMPWGEN_NO_CHARSETS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_RANDOMPWGEN_NO_CHARSETS_341",EXTENSIONS,MILD_ERROR,341, getClassLoader());

  /**
   * Configuration entry "%s" contains multiple definitions for the %s character set
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_RANDOMPWGEN_CHARSET_NAME_CONFLICT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_RANDOMPWGEN_CHARSET_NAME_CONFLICT_342",EXTENSIONS,MILD_ERROR,342, getClassLoader());

  /**
   * An error occurred while attempting to decode the value(s) of the configuration attribute ds-cfg-password-character-set, which is used to hold the character set(s) for use in generating the password:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_RANDOMPWGEN_CANNOT_DETERMINE_CHARSETS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_RANDOMPWGEN_CANNOT_DETERMINE_CHARSETS_343",EXTENSIONS,MILD_ERROR,343, getClassLoader());

  /**
   * Format that should be used for passwords constructed by this password generator.  The value should be a comma-delimited sequence of elements, where each element is the name of a character set followed by a colon and the number of characters to choose at random from that character set.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_RANDOMPWGEN_DESCRIPTION_PWFORMAT =
          new MessageDescriptor.Arg0(BASE,"INFO_RANDOMPWGEN_DESCRIPTION_PWFORMAT_344",EXTENSIONS,INFORMATION,344, getClassLoader());

  /**
   * Configuration entry "%s" does not contain attribute ds-cfg-password-format which specifies the format to use for the generated password.  This is a required attribute
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_RANDOMPWGEN_NO_PWFORMAT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_RANDOMPWGEN_NO_PWFORMAT_345",EXTENSIONS,MILD_ERROR,345, getClassLoader());

  /**
   * The password format string "%s" references an undefined character set "%s"
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_RANDOMPWGEN_UNKNOWN_CHARSET =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_RANDOMPWGEN_UNKNOWN_CHARSET_346",EXTENSIONS,MILD_ERROR,346, getClassLoader());

  /**
   * The password format string "%s" contains an invalid syntax.  This value should be a comma-delimited sequence of elements, where each element is the name of a character set followed by a colon and the number of characters to choose at random from that character set
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_RANDOMPWGEN_INVALID_PWFORMAT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_RANDOMPWGEN_INVALID_PWFORMAT_347",EXTENSIONS,MILD_ERROR,347, getClassLoader());

  /**
   * An error occurred while attempting to decode the value for configuration attribute ds-cfg-password-format, which is used to specify the format for the generated passwords:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_RANDOMPWGEN_CANNOT_DETERMINE_PWFORMAT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_RANDOMPWGEN_CANNOT_DETERMINE_PWFORMAT_348",EXTENSIONS,MILD_ERROR,348, getClassLoader());

  /**
   * DN of the configuration entry that holds the configuration for the identity mapper that should be used to map the GSSAPI principal to a Directory Server user entry. Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_SASLGSSAPI_DESCRIPTION_IDENTITY_MAPPER_DN =
          new MessageDescriptor.Arg0(BASE,"INFO_SASLGSSAPI_DESCRIPTION_IDENTITY_MAPPER_DN_349",EXTENSIONS,INFORMATION,349, getClassLoader());

  /**
   * Configuration entry %s does not contain attribute ds-cfg-identity-mapper which specifies the DN of the identity mapper to use in conjunction with the GSSAPI SASL mechanism.  This is a required attribute
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SASLGSSAPI_NO_IDENTITY_MAPPER_ATTR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SASLGSSAPI_NO_IDENTITY_MAPPER_ATTR_350",EXTENSIONS,MILD_ERROR,350, getClassLoader());

  /**
   * The identity mapper %s specified in attribute ds-cfg-identity-mapper of configuration entry %s does not reference a valid identity mapper configuration that is enabled for use in the Directory Server
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASLGSSAPI_NO_SUCH_IDENTITY_MAPPER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SASLGSSAPI_NO_SUCH_IDENTITY_MAPPER_351",EXTENSIONS,MILD_ERROR,351, getClassLoader());

  /**
   * An error occurred while trying to process the value of the ds-cfg-identity-mapper attribute in configuration entry %s to determine which identity mapper should be used in conjunction with the GSSAPI SASL mechanism:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASLGSSAPI_CANNOT_GET_IDENTITY_MAPPER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SASLGSSAPI_CANNOT_GET_IDENTITY_MAPPER_352",EXTENSIONS,MILD_ERROR,352, getClassLoader());

  /**
   * Attribute ds-cfg-identity-mapper in configuration entry %s has been updated.  The value "%s" will now be used as the DN of the identity mapper configuration entry for GSSAPI authentication
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_SASLGSSAPI_UPDATED_IDENTITY_MAPPER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_SASLGSSAPI_UPDATED_IDENTITY_MAPPER_353",EXTENSIONS,INFORMATION,353, getClassLoader());

  /**
   * An error occurred while attempting to get the password policy for user %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_EXTOP_PASSMOD_CANNOT_GET_PW_POLICY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_EXTOP_PASSMOD_CANNOT_GET_PW_POLICY_354",EXTENSIONS,MILD_ERROR,354, getClassLoader());

  /**
   * The current password must be provided for self password changes
   */
  public static final MessageDescriptor.Arg0 ERR_EXTOP_PASSMOD_REQUIRE_CURRENT_PW =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_EXTOP_PASSMOD_REQUIRE_CURRENT_PW_355",EXTENSIONS,MILD_ERROR,355, getClassLoader());

  /**
   * Password modify operations that supply the user's current password must be performed over a secure communication channel
   */
  public static final MessageDescriptor.Arg0 ERR_EXTOP_PASSMOD_SECURE_AUTH_REQUIRED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_EXTOP_PASSMOD_SECURE_AUTH_REQUIRED_356",EXTENSIONS,MILD_ERROR,356, getClassLoader());

  /**
   * End users are not allowed to change their passwords
   */
  public static final MessageDescriptor.Arg0 ERR_EXTOP_PASSMOD_USER_PW_CHANGES_NOT_ALLOWED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_EXTOP_PASSMOD_USER_PW_CHANGES_NOT_ALLOWED_357",EXTENSIONS,MILD_ERROR,357, getClassLoader());

  /**
   * Password changes must be performed over a secure communication channel
   */
  public static final MessageDescriptor.Arg0 ERR_EXTOP_PASSMOD_SECURE_CHANGES_REQUIRED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_EXTOP_PASSMOD_SECURE_CHANGES_REQUIRED_358",EXTENSIONS,MILD_ERROR,358, getClassLoader());

  /**
   * The password cannot be changed because the previous password change was too recent
   */
  public static final MessageDescriptor.Arg0 ERR_EXTOP_PASSMOD_IN_MIN_AGE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_EXTOP_PASSMOD_IN_MIN_AGE_359",EXTENSIONS,MILD_ERROR,359, getClassLoader());

  /**
   * The password cannot be changed because it is expired
   */
  public static final MessageDescriptor.Arg0 ERR_EXTOP_PASSMOD_PASSWORD_IS_EXPIRED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_EXTOP_PASSMOD_PASSWORD_IS_EXPIRED_360",EXTENSIONS,MILD_ERROR,360, getClassLoader());

  /**
   * No new password was provided, and no password generator has been defined that may be used to automatically create a new password
   */
  public static final MessageDescriptor.Arg0 ERR_EXTOP_PASSMOD_NO_PW_GENERATOR =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_EXTOP_PASSMOD_NO_PW_GENERATOR_361",EXTENSIONS,MILD_ERROR,361, getClassLoader());

  /**
   * An error occurred while attempting to create a new password using the password generator:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_EXTOP_PASSMOD_CANNOT_GENERATE_PW =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_EXTOP_PASSMOD_CANNOT_GENERATE_PW_362",EXTENSIONS,MILD_ERROR,362, getClassLoader());

  /**
   * The password policy does not allow users to supply pre-encoded passwords
   */
  public static final MessageDescriptor.Arg0 ERR_EXTOP_PASSMOD_PRE_ENCODED_NOT_ALLOWED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_EXTOP_PASSMOD_PRE_ENCODED_NOT_ALLOWED_363",EXTENSIONS,MILD_ERROR,363, getClassLoader());

  /**
   * The provided new password failed the validation checks defined in the server:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_EXTOP_PASSMOD_UNACCEPTABLE_PW =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_EXTOP_PASSMOD_UNACCEPTABLE_PW_364",EXTENSIONS,MILD_ERROR,364, getClassLoader());

  /**
   * Unable to encode the provided password using the default scheme(s):  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_EXTOP_PASSMOD_CANNOT_ENCODE_PASSWORD =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_EXTOP_PASSMOD_CANNOT_ENCODE_PASSWORD_365",EXTENSIONS,MILD_ERROR,365, getClassLoader());

  /**
   * The identity mapper with configuration entry DN %s as specified for use with the password modify extended operation defined in entry %s either does not exist or is not enabled.  The identity mapper is a required component, and the password modify extended operation will not be enabled
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_EXTOP_PASSMOD_NO_SUCH_ID_MAPPER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_EXTOP_PASSMOD_NO_SUCH_ID_MAPPER_368",EXTENSIONS,MILD_ERROR,368, getClassLoader());

  /**
   * An error occurred while attempting to determine the identity mapper to use in conjunction with the password modify extended operation defined in configuration entry %s:  %s. The password modify extended operation will not be enabled for use in the server
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_EXTOP_PASSMOD_CANNOT_DETERMINE_ID_MAPPER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_EXTOP_PASSMOD_CANNOT_DETERMINE_ID_MAPPER_369",EXTENSIONS,MILD_ERROR,369, getClassLoader());

  /**
   * The provided authorization ID string "%s" could not be mapped to any user in the directory
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_EXTOP_PASSMOD_CANNOT_MAP_USER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_EXTOP_PASSMOD_CANNOT_MAP_USER_370",EXTENSIONS,MILD_ERROR,370, getClassLoader());

  /**
   * An error occurred while attempting to map authorization ID string "%s" to a user entry:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_EXTOP_PASSMOD_ERROR_MAPPING_USER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_EXTOP_PASSMOD_ERROR_MAPPING_USER_371",EXTENSIONS,MILD_ERROR,371, getClassLoader());

  /**
   * Status notification types for which log messages should be generated.  It is a multivalued attribute, and changes will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_ERRORLOG_ACCTNOTHANDLER_DESCRIPTION_NOTIFICATION_TYPES =
          new MessageDescriptor.Arg0(BASE,"INFO_ERRORLOG_ACCTNOTHANDLER_DESCRIPTION_NOTIFICATION_TYPES_372",EXTENSIONS,INFORMATION,372, getClassLoader());

  /**
   * Configuration entry %s contains unrecognized account status notification type %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ERRORLOG_ACCTNOTHANDLER_INVALID_TYPE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ERRORLOG_ACCTNOTHANDLER_INVALID_TYPE_373",EXTENSIONS,MILD_ERROR,373, getClassLoader());

  /**
   * An error occurred while attempting to determine the account status notification types from configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ERRORLOG_ACCTNOTHANDLER_CANNOT_GET_NOTIFICATION_TYPES =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ERRORLOG_ACCTNOTHANDLER_CANNOT_GET_NOTIFICATION_TYPES_374",EXTENSIONS,MILD_ERROR,374, getClassLoader());

  /**
   * Account-Status-Notification type='%s' userdn='%s' id=%d msg='%s'
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,Number,CharSequence> NOTE_ERRORLOG_ACCTNOTHANDLER_NOTIFICATION =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,Number,CharSequence>(BASE,"NOTICE_ERRORLOG_ACCTNOTHANDLER_NOTIFICATION_375",EXTENSIONS,NOTICE,375, getClassLoader());

  /**
   * An error occurred while attempting to retrieve the clear-text password(s) for user %s in order to perform SASL CRAM-MD5 authentication:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASLCRAMMD5_CANNOT_GET_REVERSIBLE_PASSWORDS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SASLCRAMMD5_CANNOT_GET_REVERSIBLE_PASSWORDS_377",EXTENSIONS,MILD_ERROR,377, getClassLoader());

  /**
   * An error occurred while attempting to verify the password for user %s during SASL PLAIN authentication:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASLPLAIN_CANNOT_CHECK_PASSWORD_VALIDITY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SASLPLAIN_CANNOT_CHECK_PASSWORD_VALIDITY_378",EXTENSIONS,MILD_ERROR,378, getClassLoader());

  /**
   * An unexpected error occurred while attempting to send the clear-text response to the client after starting TLS negotiation:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_STARTTLS_ERROR_SENDING_CLEAR_RESPONSE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_STARTTLS_ERROR_SENDING_CLEAR_RESPONSE_379",EXTENSIONS,MILD_ERROR,379, getClassLoader());

  /**
   * The password modify operation was not actually performed in the Directory Server because the LDAP no-op control was present in the request
   */
  public static final MessageDescriptor.Arg0 WARN_EXTOP_PASSMOD_NOOP =
          new MessageDescriptor.Arg0(BASE,"MILD_WARN_EXTOP_PASSMOD_NOOP_380",EXTENSIONS,MILD_WARNING,380, getClassLoader());

  /**
   * The user account has been administratively disabled
   */
  public static final MessageDescriptor.Arg0 ERR_EXTOP_PASSMOD_ACCOUNT_DISABLED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_EXTOP_PASSMOD_ACCOUNT_DISABLED_381",EXTENSIONS,MILD_ERROR,381, getClassLoader());

  /**
   * The user account is locked
   */
  public static final MessageDescriptor.Arg0 ERR_EXTOP_PASSMOD_ACCOUNT_LOCKED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_EXTOP_PASSMOD_ACCOUNT_LOCKED_382",EXTENSIONS,MILD_ERROR,382, getClassLoader());

  /**
   * Unable to examine entry %s as a potential member of static group %s because that entry does not exist in the Directory Server
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_STATICMEMBERS_NO_SUCH_ENTRY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_STATICMEMBERS_NO_SUCH_ENTRY_383",EXTENSIONS,MILD_ERROR,383, getClassLoader());

  /**
   * An error occurred while attempting to retrieve entry %s as a potential member of static group %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_STATICMEMBERS_CANNOT_GET_ENTRY =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_STATICMEMBERS_CANNOT_GET_ENTRY_384",EXTENSIONS,MILD_ERROR,384, getClassLoader());

  /**
   * Entry %s cannot be parsed as a valid static group because static groups are not allowed to have both the %s and %s object classes
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_STATICGROUP_INVALID_OC_COMBINATION =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_STATICGROUP_INVALID_OC_COMBINATION_385",EXTENSIONS,MILD_ERROR,385, getClassLoader());

  /**
   * Entry %s cannot be parsed as a valid static group because it does not contain exactly one of the %s or the %s object classes
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_STATICGROUP_NO_VALID_OC =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_STATICGROUP_NO_VALID_OC_386",EXTENSIONS,MILD_ERROR,386, getClassLoader());

  /**
   * Value %s for attribute %s in entry %s cannot be parsed as a valid DN:  %s.  It will be excluded from the set of group members
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> ERR_STATICGROUP_CANNOT_DECODE_MEMBER_VALUE_AS_DN =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_STATICGROUP_CANNOT_DECODE_MEMBER_VALUE_AS_DN_387",EXTENSIONS,MILD_ERROR,387, getClassLoader());

  /**
   * Cannot add user %s as a new member of static group %s because that user is already in the member list for the group
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_STATICGROUP_ADD_MEMBER_ALREADY_EXISTS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_STATICGROUP_ADD_MEMBER_ALREADY_EXISTS_388",EXTENSIONS,MILD_ERROR,388, getClassLoader());

  /**
   * Cannot remove user %s as a member of static group %s because that user is not included in the member list for the group
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_STATICGROUP_REMOVE_MEMBER_NO_SUCH_MEMBER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_STATICGROUP_REMOVE_MEMBER_NO_SUCH_MEMBER_389",EXTENSIONS,MILD_ERROR,389, getClassLoader());

  /**
   * Cannot add user %s as a new member of static group %s because an error occurred while attempting to perform an internal modification to update the group:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_STATICGROUP_ADD_MEMBER_UPDATE_FAILED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_STATICGROUP_ADD_MEMBER_UPDATE_FAILED_390",EXTENSIONS,MILD_ERROR,390, getClassLoader());

  /**
   * Cannot remove user %s as a member of static group %s because an error occurred while attempting to perform an internal modification to update the group:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_STATICGROUP_REMOVE_MEMBER_UPDATE_FAILED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_STATICGROUP_REMOVE_MEMBER_UPDATE_FAILED_391",EXTENSIONS,MILD_ERROR,391, getClassLoader());

  /**
   * You do not have sufficient privileges to perform password reset operations
   */
  public static final MessageDescriptor.Arg0 ERR_EXTOP_PASSMOD_INSUFFICIENT_PRIVILEGES =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_EXTOP_PASSMOD_INSUFFICIENT_PRIVILEGES_392",EXTENSIONS,MILD_ERROR,392, getClassLoader());

  /**
   * The provided authorization ID was empty, which is not allowed for DIGEST-MD5 authentication
   */
  public static final MessageDescriptor.Arg0 ERR_SASLDIGESTMD5_EMPTY_AUTHZID =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_SASLDIGESTMD5_EMPTY_AUTHZID_393",EXTENSIONS,MILD_ERROR,393, getClassLoader());

  /**
   * The provided authorization ID %s contained an invalid DN:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASLDIGESTMD5_AUTHZID_INVALID_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SASLDIGESTMD5_AUTHZID_INVALID_DN_394",EXTENSIONS,MILD_ERROR,394, getClassLoader());

  /**
   * The entry %s specified as the authorization identity does not exist
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SASLDIGESTMD5_AUTHZID_NO_SUCH_ENTRY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SASLDIGESTMD5_AUTHZID_NO_SUCH_ENTRY_396",EXTENSIONS,MILD_ERROR,396, getClassLoader());

  /**
   * The entry %s specified as the authorization identity could not be retrieved:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASLDIGESTMD5_AUTHZID_CANNOT_GET_ENTRY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SASLDIGESTMD5_AUTHZID_CANNOT_GET_ENTRY_397",EXTENSIONS,MILD_ERROR,397, getClassLoader());

  /**
   * The server was unable to find any entry corresponding to authorization ID %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SASLDIGESTMD5_AUTHZID_NO_MAPPED_ENTRY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SASLDIGESTMD5_AUTHZID_NO_MAPPED_ENTRY_398",EXTENSIONS,MILD_ERROR,398, getClassLoader());

  /**
   * An error occurred while attempting to map authorization ID %s to a user entry:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASLDIGESTMD5_CANNOT_MAP_AUTHZID =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SASLDIGESTMD5_CANNOT_MAP_AUTHZID_399",EXTENSIONS,MILD_ERROR,399, getClassLoader());

  /**
   * The provided authorization ID %s contained an invalid DN:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASLPLAIN_AUTHZID_INVALID_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SASLPLAIN_AUTHZID_INVALID_DN_400",EXTENSIONS,MILD_ERROR,400, getClassLoader());

  /**
   * The authenticating user %s does not have sufficient privileges to specify an alternate authorization ID
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SASLPLAIN_AUTHZID_INSUFFICIENT_PRIVILEGES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SASLPLAIN_AUTHZID_INSUFFICIENT_PRIVILEGES_401",EXTENSIONS,MILD_ERROR,401, getClassLoader());

  /**
   * The entry corresponding to authorization DN %s does not exist in the Directory Server
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SASLPLAIN_AUTHZID_NO_SUCH_ENTRY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SASLPLAIN_AUTHZID_NO_SUCH_ENTRY_402",EXTENSIONS,MILD_ERROR,402, getClassLoader());

  /**
   * An error occurred while attempting to retrieve entry %s specified as the authorization ID:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASLPLAIN_AUTHZID_CANNOT_GET_ENTRY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SASLPLAIN_AUTHZID_CANNOT_GET_ENTRY_403",EXTENSIONS,MILD_ERROR,403, getClassLoader());

  /**
   * No entry corresponding to authorization ID %s was found in the server
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SASLPLAIN_AUTHZID_NO_MAPPED_ENTRY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SASLPLAIN_AUTHZID_NO_MAPPED_ENTRY_404",EXTENSIONS,MILD_ERROR,404, getClassLoader());

  /**
   * An error occurred while attempting to map authorization ID %s to a user entry:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASLPLAIN_AUTHZID_CANNOT_MAP_AUTHZID =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SASLPLAIN_AUTHZID_CANNOT_MAP_AUTHZID_405",EXTENSIONS,MILD_ERROR,405, getClassLoader());

  /**
   * DN of the configuration entry that defines the certificate mapper to use when mapping a certificate to a user entry.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_SASLEXTERNAL_DESCRIPTION_CERT_MAPPER_DN =
          new MessageDescriptor.Arg0(BASE,"INFO_SASLEXTERNAL_DESCRIPTION_CERT_MAPPER_DN_406",EXTENSIONS,INFORMATION,406, getClassLoader());

  /**
   * Configuration entry %s does not contain attribute ds-cfg-certificate-mapper which is required to specify which certificate mapper should be used to map certificates to user entries
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SASLEXTERNAL_NO_CERTIFICATE_MAPPER_DN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SASLEXTERNAL_NO_CERTIFICATE_MAPPER_DN_407",EXTENSIONS,MILD_ERROR,407, getClassLoader());

  /**
   * Configuration entry %s contains a certificate mapper DN of %s, but no such certificate mapper is enabled for use in the Directory Server
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASLEXTERNAL_INVALID_CERTIFICATE_MAPPER_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SASLEXTERNAL_INVALID_CERTIFICATE_MAPPER_DN_408",EXTENSIONS,MILD_ERROR,408, getClassLoader());

  /**
   * An error occurred while attempting to retrieve the certificate mapper DN from configuration entry %s: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASLEXTERNAL_CANNOT_GET_CERT_MAPPER_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SASLEXTERNAL_CANNOT_GET_CERT_MAPPER_DN_409",EXTENSIONS,MILD_ERROR,409, getClassLoader());

  /**
   * Attribute ds-cfg-certificate-mapper in configuration entry %s has been updated. Certificate mapper %s will now be used to map certificates to user entries
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_SASLEXTERNAL_UPDATED_CERT_MAPPER_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_SASLEXTERNAL_UPDATED_CERT_MAPPER_DN_410",EXTENSIONS,INFORMATION,410, getClassLoader());

  /**
   * Name of the attribute type in user entries that contains the subjects of the certificates held by that user.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_SDTUACM_DESCRIPTION_SUBJECT_ATTR =
          new MessageDescriptor.Arg0(BASE,"INFO_SDTUACM_DESCRIPTION_SUBJECT_ATTR_411",EXTENSIONS,INFORMATION,411, getClassLoader());

  /**
   * Configuration entry %s does not contain required attribute %s, which is used to specify which attribute should contain the subjects of the certificates held by users
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SDTUACM_NO_SUBJECT_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_SDTUACM_NO_SUBJECT_ATTR_412",EXTENSIONS,SEVERE_ERROR,412, getClassLoader());

  /**
   * Configuration entry %s indicates that certificate subjects should be held in attribute %s, but this attribute is not defined in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SDTUACM_NO_SUCH_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_SDTUACM_NO_SUCH_ATTR_413",EXTENSIONS,SEVERE_ERROR,413, getClassLoader());

  /**
   * An error occurred while attempting to determine which attribute type should be used to hold certificate subjects from configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SDTUACM_CANNOT_GET_SUBJECT_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_SDTUACM_CANNOT_GET_SUBJECT_ATTR_414",EXTENSIONS,SEVERE_ERROR,414, getClassLoader());

  /**
   * Base DNs below which the searches to find matching user entries will be performed.  If no base DN(s) are provided, then the server will search below all public naming contexts. Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_SDTUACM_DESCRIPTION_BASE_DN =
          new MessageDescriptor.Arg0(BASE,"INFO_SDTUACM_DESCRIPTION_BASE_DN_415",EXTENSIONS,INFORMATION,415, getClassLoader());

  /**
   * An error occurred while attempting to determine the search base DN(s) from configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SDTUACM_CANNOT_GET_BASE_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_SDTUACM_CANNOT_GET_BASE_DN_416",EXTENSIONS,SEVERE_ERROR,416, getClassLoader());

  /**
   * Could not map the provided certificate chain to a user entry because no peer certificate was available
   */
  public static final MessageDescriptor.Arg0 ERR_SDTUACM_NO_PEER_CERTIFICATE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_SDTUACM_NO_PEER_CERTIFICATE_417",EXTENSIONS,SEVERE_ERROR,417, getClassLoader());

  /**
   * Could not map the provided certificate chain to a user because the peer certificate was not an X.509 certificate (peer certificate format was %s)
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SDTUACM_PEER_CERT_NOT_X509 =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_SDTUACM_PEER_CERT_NOT_X509_418",EXTENSIONS,SEVERE_ERROR,418, getClassLoader());

  /**
   * The certificate with subject %s could not be mapped to exactly one user.  It maps to both %s and %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SDTUACM_MULTIPLE_MATCHING_ENTRIES =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_SDTUACM_MULTIPLE_MATCHING_ENTRIES_419",EXTENSIONS,SEVERE_ERROR,419, getClassLoader());

  /**
   * Name of the attribute type in user entries that defines the mapping between attributes in certificate subjects and attributes in user entries.  Values should be in the form 'certattr:userattr'.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_SATUACM_DESCRIPTION_ATTR_MAP =
          new MessageDescriptor.Arg0(BASE,"INFO_SATUACM_DESCRIPTION_ATTR_MAP_420",EXTENSIONS,INFORMATION,420, getClassLoader());

  /**
   * Configuration entry %s does not contain required attribute %s, which is used to specify the mappings between attributes in certificate subjects and attributes in user entries
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SATUACM_NO_MAP_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_SATUACM_NO_MAP_ATTR_421",EXTENSIONS,SEVERE_ERROR,421, getClassLoader());

  /**
   * Configuration entry %s has value '%s' which violates the format required for attribute mappings.  The expected format is 'certattr:userattr'
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SATUACM_INVALID_MAP_FORMAT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_SATUACM_INVALID_MAP_FORMAT_422",EXTENSIONS,SEVERE_ERROR,422, getClassLoader());

  /**
   * Configuration entry %s contains multiple mappings for certificate attribute %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SATUACM_DUPLICATE_CERT_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_SATUACM_DUPLICATE_CERT_ATTR_423",EXTENSIONS,SEVERE_ERROR,423, getClassLoader());

  /**
   * Mapping %s in configuration entry %s references attribute %s which is not defined in the server schema
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SATUACM_NO_SUCH_ATTR =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_SATUACM_NO_SUCH_ATTR_424",EXTENSIONS,SEVERE_ERROR,424, getClassLoader());

  /**
   * Configuration entry %s contains multiple mappings for user attribute %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SATUACM_DUPLICATE_USER_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_SATUACM_DUPLICATE_USER_ATTR_425",EXTENSIONS,SEVERE_ERROR,425, getClassLoader());

  /**
   * An error occurred while attempting to determine the set of attribute mappings from configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SATUACM_CANNOT_GET_ATTR_MAP =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_SATUACM_CANNOT_GET_ATTR_MAP_426",EXTENSIONS,SEVERE_ERROR,426, getClassLoader());

  /**
   * Base DNs below which the searches to find matching user entries will be performed.  If no base DN(s) are provided, then the server will search below all public naming contexts. Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_SATUACM_DESCRIPTION_BASE_DN =
          new MessageDescriptor.Arg0(BASE,"INFO_SATUACM_DESCRIPTION_BASE_DN_427",EXTENSIONS,INFORMATION,427, getClassLoader());

  /**
   * An error occurred while attempting to determine the search base DN(s) from configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SATUACM_CANNOT_GET_BASE_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_SATUACM_CANNOT_GET_BASE_DN_428",EXTENSIONS,SEVERE_ERROR,428, getClassLoader());

  /**
   * Could not map the provided certificate chain to a user entry because no peer certificate was available
   */
  public static final MessageDescriptor.Arg0 ERR_SATUACM_NO_PEER_CERTIFICATE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_SATUACM_NO_PEER_CERTIFICATE_429",EXTENSIONS,SEVERE_ERROR,429, getClassLoader());

  /**
   * Could not map the provided certificate chain to a user because the peer certificate was not an X.509 certificate (peer certificate format was %s)
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SATUACM_PEER_CERT_NOT_X509 =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_SATUACM_PEER_CERT_NOT_X509_430",EXTENSIONS,SEVERE_ERROR,430, getClassLoader());

  /**
   * Unable to decode peer certificate subject %s as a DN:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SATUACM_CANNOT_DECODE_SUBJECT_AS_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_SATUACM_CANNOT_DECODE_SUBJECT_AS_DN_431",EXTENSIONS,SEVERE_ERROR,431, getClassLoader());

  /**
   * Peer certificate subject %s does not contain any attributes for which a mapping has been established
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SATUACM_NO_MAPPABLE_ATTRIBUTES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_SATUACM_NO_MAPPABLE_ATTRIBUTES_432",EXTENSIONS,SEVERE_ERROR,432, getClassLoader());

  /**
   * The certificate with subject %s could not be mapped to exactly one user.  It maps to both %s and %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SATUACM_MULTIPLE_MATCHING_ENTRIES =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_SATUACM_MULTIPLE_MATCHING_ENTRIES_433",EXTENSIONS,SEVERE_ERROR,433, getClassLoader());

  /**
   * Name of the attribute type in user entries that contains the fingerprints of the certificates held by that user.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_FCM_DESCRIPTION_FINGERPRINT_ATTR =
          new MessageDescriptor.Arg0(BASE,"INFO_FCM_DESCRIPTION_FINGERPRINT_ATTR_434",EXTENSIONS,INFORMATION,434, getClassLoader());

  /**
   * Configuration entry %s does not contain required attribute %s, which is used to specify which attribute should contain the fingerprints of the certificates held by users
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_FCM_NO_FINGERPRINT_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_FCM_NO_FINGERPRINT_ATTR_435",EXTENSIONS,SEVERE_ERROR,435, getClassLoader());

  /**
   * Configuration entry %s indicates that certificate fingerprints should be held in attribute %s, but this attribute is not defined in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_FCM_NO_SUCH_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_FCM_NO_SUCH_ATTR_436",EXTENSIONS,SEVERE_ERROR,436, getClassLoader());

  /**
   * An error occurred while attempting to determine which attribute type should be used to hold certificate fingerprints from configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_FCM_CANNOT_GET_FINGERPRINT_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_FCM_CANNOT_GET_FINGERPRINT_ATTR_437",EXTENSIONS,SEVERE_ERROR,437, getClassLoader());

  /**
   * Name of the digest algorithm used for the certificate fingerprints.  The value should be either 'MD5' or 'SHA1'.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_FCM_DESCRIPTION_FINGERPRINT_ALGORITHM =
          new MessageDescriptor.Arg0(BASE,"INFO_FCM_DESCRIPTION_FINGERPRINT_ALGORITHM_438",EXTENSIONS,INFORMATION,438, getClassLoader());

  /**
   * Configuration entry %s does not contain required attribute %s, which is used to specify which digest algorithm should be used to compute certificate fingerprints
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_FCM_NO_FINGERPRINT_ALGORITHM =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_FCM_NO_FINGERPRINT_ALGORITHM_439",EXTENSIONS,SEVERE_ERROR,439, getClassLoader());

  /**
   * An error occurred while attempting to determine the digest algorithm from configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_FCM_CANNOT_GET_FINGERPRINT_ALGORITHM =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_FCM_CANNOT_GET_FINGERPRINT_ALGORITHM_440",EXTENSIONS,SEVERE_ERROR,440, getClassLoader());

  /**
   * Base DNs below which the searches to find matching user entries will be performed.  If no base DN(s) are provided, then the server will search below all public naming contexts. Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_FCM_DESCRIPTION_BASE_DN =
          new MessageDescriptor.Arg0(BASE,"INFO_FCM_DESCRIPTION_BASE_DN_441",EXTENSIONS,INFORMATION,441, getClassLoader());

  /**
   * An error occurred while attempting to determine the search base DN(s) from configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_FCM_CANNOT_GET_BASE_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_FCM_CANNOT_GET_BASE_DN_442",EXTENSIONS,SEVERE_ERROR,442, getClassLoader());

  /**
   * Could not map the provided certificate chain to a user entry because no peer certificate was available
   */
  public static final MessageDescriptor.Arg0 ERR_FCM_NO_PEER_CERTIFICATE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_FCM_NO_PEER_CERTIFICATE_443",EXTENSIONS,SEVERE_ERROR,443, getClassLoader());

  /**
   * Could not map the provided certificate chain to a user because the peer certificate was not an X.509 certificate (peer certificate format was %s)
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_FCM_PEER_CERT_NOT_X509 =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_FCM_PEER_CERT_NOT_X509_444",EXTENSIONS,SEVERE_ERROR,444, getClassLoader());

  /**
   * An error occurred while attempting to calculate the fingerprint for the peer certificate with subject %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_FCM_CANNOT_CALCULATE_FINGERPRINT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_FCM_CANNOT_CALCULATE_FINGERPRINT_445",EXTENSIONS,SEVERE_ERROR,445, getClassLoader());

  /**
   * The certificate with fingerprint %s could not be mapped to exactly one user.  It maps to both %s and %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_FCM_MULTIPLE_MATCHING_ENTRIES =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_FCM_MULTIPLE_MATCHING_ENTRIES_446",EXTENSIONS,SEVERE_ERROR,446, getClassLoader());

  /**
   * Unable to decode value "%s" in entry "%s" as an LDAP URL:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_DYNAMICGROUP_CANNOT_DECODE_MEMBERURL =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_DYNAMICGROUP_CANNOT_DECODE_MEMBERURL_447",EXTENSIONS,MILD_ERROR,447, getClassLoader());

  /**
   * Dynamic groups do not support nested groups
   */
  public static final MessageDescriptor.Arg0 ERR_DYNAMICGROUP_NESTING_NOT_SUPPORTED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_DYNAMICGROUP_NESTING_NOT_SUPPORTED_448",EXTENSIONS,MILD_ERROR,448, getClassLoader());

  /**
   * Dynamic groups do not support explicitly altering their membership
   */
  public static final MessageDescriptor.Arg0 ERR_DYNAMICGROUP_ALTERING_MEMBERS_NOT_SUPPORTED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_DYNAMICGROUP_ALTERING_MEMBERS_NOT_SUPPORTED_449",EXTENSIONS,MILD_ERROR,449, getClassLoader());

  /**
   * Base DN %s specified in dynamic group %s does not exist in the server
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_DYNAMICGROUP_NONEXISTENT_BASE_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_WARN_DYNAMICGROUP_NONEXISTENT_BASE_DN_450",EXTENSIONS,MILD_WARNING,450, getClassLoader());

  /**
   * An error occurred while attempting perform an internal search with base DN %s and filter %s to resolve the member list for dynamic group %s:  result code %s, error message %s
   */
  public static final MessageDescriptor.Arg5<CharSequence,CharSequence,CharSequence,CharSequence,CharSequence> ERR_DYNAMICGROUP_INTERNAL_SEARCH_FAILED =
          new MessageDescriptor.Arg5<CharSequence,CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_DYNAMICGROUP_INTERNAL_SEARCH_FAILED_451",EXTENSIONS,SEVERE_ERROR,451, getClassLoader());

  /**
   * The server encountered a timeout while attempting to add user %s to the member list for dynamic group %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_DYNAMICGROUP_CANNOT_RETURN_ENTRY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_DYNAMICGROUP_CANNOT_RETURN_ENTRY_452",EXTENSIONS,SEVERE_ERROR,452, getClassLoader());

  /**
   * Minimum difference that a password will be allowed to have.  A value of zero indicates that there is no minimum difference.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_PWDIFFERENCEVALIDATOR_DESCRIPTION_MIN_DIFFERENCE =
          new MessageDescriptor.Arg0(BASE,"INFO_PWDIFFERENCEVALIDATOR_DESCRIPTION_MIN_DIFFERENCE_453",EXTENSIONS,INFORMATION,453, getClassLoader());

  /**
   * An error occurred while attempting to determine the minimum allowed password difference from the ds-cfg-min-password-difference attribute:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PWDIFFERENCEVALIDATOR_CANNOT_DETERMINE_MIN_DIFFERENCE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_PWDIFFERENCEVALIDATOR_CANNOT_DETERMINE_MIN_DIFFERENCE_454",EXTENSIONS,MILD_ERROR,454, getClassLoader());

  /**
   * The minimum password difference has been updated to %d
   */
  public static final MessageDescriptor.Arg1<Number> INFO_PWDIFFERENCEVALIDATOR_UPDATED_MIN_DIFFERENCE =
          new MessageDescriptor.Arg1<Number>(BASE,"INFO_PWDIFFERENCEVALIDATOR_UPDATED_MIN_DIFFERENCE_455",EXTENSIONS,INFORMATION,455, getClassLoader());

  /**
   * The provided password differs less than the minimum required difference of %d characters
   */
  public static final MessageDescriptor.Arg1<Number> ERR_PWDIFFERENCEVALIDATOR_TOO_SMALL =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_PWDIFFERENCEVALIDATOR_TOO_SMALL_456",EXTENSIONS,MILD_ERROR,456, getClassLoader());

  /**
   * The provided password contained too many instances of the same character appearing consecutively.  The maximum number of times the same character may appear consecutively in a password is %d
   */
  public static final MessageDescriptor.Arg1<Number> ERR_REPEATEDCHARS_VALIDATOR_TOO_MANY_CONSECUTIVE =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_REPEATEDCHARS_VALIDATOR_TOO_MANY_CONSECUTIVE_457",EXTENSIONS,MILD_ERROR,457, getClassLoader());

  /**
   * The provided password does not contain enough unique characters.  The minimum number of unique characters that may appear in a user password is %d
   */
  public static final MessageDescriptor.Arg1<Number> ERR_UNIQUECHARS_VALIDATOR_NOT_ENOUGH_UNIQUE_CHARS =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_UNIQUECHARS_VALIDATOR_NOT_ENOUGH_UNIQUE_CHARS_458",EXTENSIONS,MILD_ERROR,458, getClassLoader());

  /**
   * The %s attribute is not searchable and should not be included in otherwise unindexed search filters
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_VATTR_NOT_SEARCHABLE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_VATTR_NOT_SEARCHABLE_459",EXTENSIONS,MILD_ERROR,459, getClassLoader());

  /**
   * The provided password was found in the server's dictionary
   */
  public static final MessageDescriptor.Arg0 ERR_DICTIONARY_VALIDATOR_PASSWORD_IN_DICTIONARY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_DICTIONARY_VALIDATOR_PASSWORD_IN_DICTIONARY_460",EXTENSIONS,MILD_ERROR,460, getClassLoader());

  /**
   * The specified dictionary file %s does not exist
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DICTIONARY_VALIDATOR_NO_SUCH_FILE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_DICTIONARY_VALIDATOR_NO_SUCH_FILE_461",EXTENSIONS,MILD_ERROR,461, getClassLoader());

  /**
   * An error occurred while attempting to load the dictionary from file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_DICTIONARY_VALIDATOR_CANNOT_READ_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_DICTIONARY_VALIDATOR_CANNOT_READ_FILE_462",EXTENSIONS,MILD_ERROR,462, getClassLoader());

  /**
   * The provided password was found in another attribute in the user entry
   */
  public static final MessageDescriptor.Arg0 ERR_ATTRVALUE_VALIDATOR_PASSWORD_IN_ENTRY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_ATTRVALUE_VALIDATOR_PASSWORD_IN_ENTRY_463",EXTENSIONS,MILD_ERROR,463, getClassLoader());

  /**
   * The provided password contained character '%s' which is not allowed for use in passwords
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CHARSET_VALIDATOR_ILLEGAL_CHARACTER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CHARSET_VALIDATOR_ILLEGAL_CHARACTER_464",EXTENSIONS,MILD_ERROR,464, getClassLoader());

  /**
   * The provided password did not contain enough characters from the character set '%s'.  The minimum number of characters from that set that must be present in user passwords is %d
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_CHARSET_VALIDATOR_TOO_FEW_CHARS_FROM_SET =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_ERR_CHARSET_VALIDATOR_TOO_FEW_CHARS_FROM_SET_465",EXTENSIONS,MILD_ERROR,465, getClassLoader());

  /**
   * The provided character set definition '%s' is invalid because it does not contain a colon to separate the minimum count from the character set
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CHARSET_VALIDATOR_NO_COLON =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CHARSET_VALIDATOR_NO_COLON_466",EXTENSIONS,MILD_ERROR,466, getClassLoader());

  /**
   * The provided character set definition '%s' is invalid because the provided character set is empty
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CHARSET_VALIDATOR_NO_CHARS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CHARSET_VALIDATOR_NO_CHARS_467",EXTENSIONS,MILD_ERROR,467, getClassLoader());

  /**
   * The provided character set definition '%s' is invalid because the value before the colon must be an integer greater than zero
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CHARSET_VALIDATOR_INVALID_COUNT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CHARSET_VALIDATOR_INVALID_COUNT_468",EXTENSIONS,MILD_ERROR,468, getClassLoader());

  /**
   * The provided character set definition '%s' is invalid because it contains character '%s' which has already been used
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CHARSET_VALIDATOR_DUPLICATE_CHAR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CHARSET_VALIDATOR_DUPLICATE_CHAR_469",EXTENSIONS,MILD_ERROR,469, getClassLoader());

  /**
   * The virtual static group defined in entry %s contains multiple target group DNs, but only one is allowed
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_VIRTUAL_STATIC_GROUP_MULTIPLE_TARGETS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_VIRTUAL_STATIC_GROUP_MULTIPLE_TARGETS_470",EXTENSIONS,MILD_ERROR,470, getClassLoader());

  /**
   * Unable to decode "%s" as the target DN for group %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_VIRTUAL_STATIC_GROUP_CANNOT_DECODE_TARGET =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_VIRTUAL_STATIC_GROUP_CANNOT_DECODE_TARGET_471",EXTENSIONS,MILD_ERROR,471, getClassLoader());

  /**
   * The virtual static group defined in entry %s does not contain a target group definition
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_VIRTUAL_STATIC_GROUP_NO_TARGET =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_VIRTUAL_STATIC_GROUP_NO_TARGET_472",EXTENSIONS,MILD_ERROR,472, getClassLoader());

  /**
   * Virtual static groups do not support nesting
   */
  public static final MessageDescriptor.Arg0 ERR_VIRTUAL_STATIC_GROUP_NESTING_NOT_SUPPORTED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_VIRTUAL_STATIC_GROUP_NESTING_NOT_SUPPORTED_473",EXTENSIONS,MILD_ERROR,473, getClassLoader());

  /**
   * Target group %s referenced by virtual static group %s does not exist
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_VIRTUAL_STATIC_GROUP_NO_TARGET_GROUP =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_VIRTUAL_STATIC_GROUP_NO_TARGET_GROUP_474",EXTENSIONS,MILD_ERROR,474, getClassLoader());

  /**
   * Altering membership for virtual static group %s is not allowed
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_VIRTUAL_STATIC_GROUP_ALTERING_MEMBERS_NOT_SUPPORTED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_VIRTUAL_STATIC_GROUP_ALTERING_MEMBERS_NOT_SUPPORTED_475",EXTENSIONS,MILD_ERROR,475, getClassLoader());

  /**
   * Virtual static group %s references target group %s which is itself a virtual static group. One virtual static group is not allowed to reference another as its target group
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_VIRTUAL_STATIC_GROUP_TARGET_CANNOT_BE_VIRTUAL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_VIRTUAL_STATIC_GROUP_TARGET_CANNOT_BE_VIRTUAL_476",EXTENSIONS,MILD_ERROR,476, getClassLoader());

  /**
   * Staring persistent entry cache state restoration, this may take awhile
   */
  public static final MessageDescriptor.Arg0 NOTE_FSCACHE_RESTORE =
          new MessageDescriptor.Arg0(BASE,"NOTICE_FSCACHE_RESTORE_484",EXTENSIONS,NOTICE,484, getClassLoader());

  /**
   * Making the entry cache state persistent, this may take awhile
   */
  public static final MessageDescriptor.Arg0 NOTE_FSCACHE_SAVE =
          new MessageDescriptor.Arg0(BASE,"NOTICE_FSCACHE_SAVE_485",EXTENSIONS,NOTICE,485, getClassLoader());

  /**
   * A fatal error occurred while trying to initialize file system entry cache:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_FSCACHE_CANNOT_INITIALIZE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"FATAL_ERR_FSCACHE_CANNOT_INITIALIZE_486",EXTENSIONS,FATAL_ERROR,486, getClassLoader());

  /**
   * An error occurred while trying to load persistent cache. Persistent cache will be flushed now
   */
  public static final MessageDescriptor.Arg0 ERR_FSCACHE_CANNOT_LOAD_PERSISTENT_DATA =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_FSCACHE_CANNOT_LOAD_PERSISTENT_DATA_487",EXTENSIONS,SEVERE_ERROR,487, getClassLoader());

  /**
   * An error occurred while trying to store persistent cache. Persistent cache will be flushed now
   */
  public static final MessageDescriptor.Arg0 ERR_FSCACHE_CANNOT_STORE_PERSISTENT_DATA =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_FSCACHE_CANNOT_STORE_PERSISTENT_DATA_488",EXTENSIONS,SEVERE_ERROR,488, getClassLoader());

  /**
   * Unable to store new cache entry in the file system entry cache
   */
  public static final MessageDescriptor.Arg0 ERR_FSCACHE_CANNOT_STORE_ENTRY =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_FSCACHE_CANNOT_STORE_ENTRY_489",EXTENSIONS,SEVERE_ERROR,489, getClassLoader());

  /**
   * Unable to retrieve an existing cache entry from the file system entry cache
   */
  public static final MessageDescriptor.Arg0 ERR_FSCACHE_CANNOT_RETRIEVE_ENTRY =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_FSCACHE_CANNOT_RETRIEVE_ENTRY_490",EXTENSIONS,SEVERE_ERROR,490, getClassLoader());

  /**
   * Internal error occurred while trying to set the entry cache backend internal cache size as percentage. The previous or default value will be used instead
   */
  public static final MessageDescriptor.Arg0 ERR_FSCACHE_CANNOT_SET_JE_MEMORY_PCT =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_FSCACHE_CANNOT_SET_JE_MEMORY_PCT_491",EXTENSIONS,SEVERE_ERROR,491, getClassLoader());

  /**
   * Internal error occurred while trying to set the entry cache backend internal cache size in bytes. The previous or default value will be used instead
   */
  public static final MessageDescriptor.Arg0 ERR_FSCACHE_CANNOT_SET_JE_MEMORY_SIZE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_FSCACHE_CANNOT_SET_JE_MEMORY_SIZE_492",EXTENSIONS,SEVERE_ERROR,492, getClassLoader());

  /**
   * Internal error occurred while trying to set the entry cache backend Berkeley DB JE properties:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_FSCACHE_CANNOT_SET_JE_PROPERTIES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_FSCACHE_CANNOT_SET_JE_PROPERTIES_493",EXTENSIONS,SEVERE_ERROR,493, getClassLoader());

  /**
   * A fatal error occurred while trying to setup file system entry cache home. No suitable path can be found to host the cache home
   */
  public static final MessageDescriptor.Arg0 ERR_FSCACHE_HOMELESS =
          new MessageDescriptor.Arg0(BASE,"FATAL_ERR_FSCACHE_HOMELESS_494",EXTENSIONS,FATAL_ERROR,494, getClassLoader());

  /**
   * Unable to set file permissions for the file system entry cache backend database directory %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_FSCACHE_SET_PERMISSIONS_FAILED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_FSCACHE_SET_PERMISSIONS_FAILED_495",EXTENSIONS,SEVERE_WARNING,495, getClassLoader());

  /**
   * %s backend current offline state does not match persistent cache last recorded offline state. All cached data for this backend is now discarded
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_FSCACHE_OFFLINE_STATE_FAIL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_FSCACHE_OFFLINE_STATE_FAIL_496",EXTENSIONS,SEVERE_WARNING,496, getClassLoader());

  /**
   * Restored %d persistent cache entries into the entry cache
   */
  public static final MessageDescriptor.Arg1<Number> NOTE_FSCACHE_RESTORE_REPORT =
          new MessageDescriptor.Arg1<Number>(BASE,"NOTICE_FSCACHE_RESTORE_REPORT_497",EXTENSIONS,NOTICE,497, getClassLoader());

  /**
   * Made persistent %d cache entries
   */
  public static final MessageDescriptor.Arg1<Number> NOTE_FSCACHE_SAVE_REPORT =
          new MessageDescriptor.Arg1<Number>(BASE,"NOTICE_FSCACHE_SAVE_REPORT_498",EXTENSIONS,NOTICE,498, getClassLoader());

  /**
   * No previous persistent cache state can be found. Starting with an empty cache
   */
  public static final MessageDescriptor.Arg0 NOTE_FSCACHE_INDEX_NOT_FOUND =
          new MessageDescriptor.Arg0(BASE,"NOTICE_FSCACHE_INDEX_NOT_FOUND_499",EXTENSIONS,NOTICE,499, getClassLoader());

  /**
   * The persistent cache index is inconsistent or damaged. Persistent cache will be flushed now
   */
  public static final MessageDescriptor.Arg0 ERR_FSCACHE_INDEX_IMPAIRED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_FSCACHE_INDEX_IMPAIRED_500",EXTENSIONS,SEVERE_ERROR,500, getClassLoader());

  /**
   * The %s attribute is not searchable and should not be included in otherwise unindexed search filters
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ENTRYUUID_VATTR_NOT_SEARCHABLE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ENTRYUUID_VATTR_NOT_SEARCHABLE_501",EXTENSIONS,MILD_ERROR,501, getClassLoader());

  /**
   * You do not have sufficient privileges to use the password policy state extended operation
   */
  public static final MessageDescriptor.Arg0 ERR_PWPSTATE_EXTOP_NO_PRIVILEGE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_PWPSTATE_EXTOP_NO_PRIVILEGE_502",EXTENSIONS,SEVERE_ERROR,502, getClassLoader());

  /**
   * The provided password policy state extended request did not include a request value
   */
  public static final MessageDescriptor.Arg0 ERR_PWPSTATE_EXTOP_NO_REQUEST_VALUE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_PWPSTATE_EXTOP_NO_REQUEST_VALUE_503",EXTENSIONS,SEVERE_ERROR,503, getClassLoader());

  /**
   * An unexpected error occurred while attempting to decode password policy state extended request value:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PWPSTATE_EXTOP_DECODE_FAILURE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PWPSTATE_EXTOP_DECODE_FAILURE_504",EXTENSIONS,SEVERE_ERROR,504, getClassLoader());

  /**
   * Multiple entries were found with DN %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PWPSTATE_EXTOP_MULTIPLE_ENTRIES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PWPSTATE_EXTOP_MULTIPLE_ENTRIES_505",EXTENSIONS,SEVERE_ERROR,505, getClassLoader());

  /**
   * An unexpected error occurred while attempting to decode an operation from the password policy state extended request:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PWPSTATE_EXTOP_INVALID_OP_ENCODING =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PWPSTATE_EXTOP_INVALID_OP_ENCODING_506",EXTENSIONS,SEVERE_ERROR,506, getClassLoader());

  /**
   * No value was provided for the password policy state operation intended to set the disabled state for the user.  Exactly one value (either 'true' or 'false') must be given
   */
  public static final MessageDescriptor.Arg0 ERR_PWPSTATE_EXTOP_NO_DISABLED_VALUE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_PWPSTATE_EXTOP_NO_DISABLED_VALUE_507",EXTENSIONS,SEVERE_ERROR,507, getClassLoader());

  /**
   * Multiple values were provided for the password policy state operation intended to set the disabled state for the user.  Exactly one value (either 'true' or 'false') must be given
   */
  public static final MessageDescriptor.Arg0 ERR_PWPSTATE_EXTOP_BAD_DISABLED_VALUE_COUNT =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_PWPSTATE_EXTOP_BAD_DISABLED_VALUE_COUNT_508",EXTENSIONS,SEVERE_ERROR,508, getClassLoader());

  /**
   * The value provided for the password policy state operation  intended to set the disabled state for the user was invalid.  The value must be either 'true' or 'false'
   */
  public static final MessageDescriptor.Arg0 ERR_PWPSTATE_EXTOP_BAD_DISABLED_VALUE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_PWPSTATE_EXTOP_BAD_DISABLED_VALUE_509",EXTENSIONS,SEVERE_ERROR,509, getClassLoader());

  /**
   * Multiple values were provided for the password policy state operation intended to set the account expiration time for the user.  Exactly one value must be given
   */
  public static final MessageDescriptor.Arg0 ERR_PWPSTATE_EXTOP_BAD_ACCT_EXP_VALUE_COUNT =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_PWPSTATE_EXTOP_BAD_ACCT_EXP_VALUE_COUNT_510",EXTENSIONS,SEVERE_ERROR,510, getClassLoader());

  /**
   * The value %s provided for the password policy state operation used to set the account expiration time was invalid:  %s.  The value should be specified using the generalized time format
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPSTATE_EXTOP_BAD_ACCT_EXP_VALUE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPSTATE_EXTOP_BAD_ACCT_EXP_VALUE_511",EXTENSIONS,SEVERE_ERROR,511, getClassLoader());

  /**
   * Multiple values were provided for the password policy state operation intended to set the password changed time for the user.  Exactly one value must be given
   */
  public static final MessageDescriptor.Arg0 ERR_PWPSTATE_EXTOP_BAD_PWCHANGETIME_VALUE_COUNT =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_PWPSTATE_EXTOP_BAD_PWCHANGETIME_VALUE_COUNT_512",EXTENSIONS,SEVERE_ERROR,512, getClassLoader());

  /**
   * The value %s provided for the password policy state operation used to set the password changed time was invalid:  %s.  The value should be specified using the generalized time format
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPSTATE_EXTOP_BAD_PWCHANGETIME_VALUE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPSTATE_EXTOP_BAD_PWCHANGETIME_VALUE_513",EXTENSIONS,SEVERE_ERROR,513, getClassLoader());

  /**
   * Multiple values were provided for the password policy state operation intended to set the password warned time for the user.  Exactly one value must be given
   */
  public static final MessageDescriptor.Arg0 ERR_PWPSTATE_EXTOP_BAD_PWWARNEDTIME_VALUE_COUNT =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_PWPSTATE_EXTOP_BAD_PWWARNEDTIME_VALUE_COUNT_514",EXTENSIONS,SEVERE_ERROR,514, getClassLoader());

  /**
   * The value %s provided for the password policy state operation used to set the password warned time was invalid:  %s.  The value should be specified using the generalized time format
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPSTATE_EXTOP_BAD_PWWARNEDTIME_VALUE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPSTATE_EXTOP_BAD_PWWARNEDTIME_VALUE_515",EXTENSIONS,SEVERE_ERROR,515, getClassLoader());

  /**
   * Multiple values were provided for the password policy state operation intended to add an authentication failure time for the user.  Exactly one value must be given
   */
  public static final MessageDescriptor.Arg0 ERR_PWPSTATE_EXTOP_BAD_ADD_FAILURE_TIME_COUNT =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_PWPSTATE_EXTOP_BAD_ADD_FAILURE_TIME_COUNT_516",EXTENSIONS,SEVERE_ERROR,516, getClassLoader());

  /**
   * The value %s provided for the password policy state operation used to update the authentication failure times was invalid:  %s.  The value should be specified using the generalized time format
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPSTATE_EXTOP_BAD_AUTH_FAILURE_TIME =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPSTATE_EXTOP_BAD_AUTH_FAILURE_TIME_517",EXTENSIONS,SEVERE_ERROR,517, getClassLoader());

  /**
   * Multiple values were provided for the password policy state operation intended to set the last login time for the user.  Exactly one value must be given
   */
  public static final MessageDescriptor.Arg0 ERR_PWPSTATE_EXTOP_BAD_LAST_LOGIN_TIME_COUNT =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_PWPSTATE_EXTOP_BAD_LAST_LOGIN_TIME_COUNT_518",EXTENSIONS,SEVERE_ERROR,518, getClassLoader());

  /**
   * The value %s provided for the password policy state operation used to set the last login time was invalid:  %s.  The value should be specified using the generalized time format
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPSTATE_EXTOP_BAD_LAST_LOGIN_TIME =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPSTATE_EXTOP_BAD_LAST_LOGIN_TIME_519",EXTENSIONS,SEVERE_ERROR,519, getClassLoader());

  /**
   * No value was provided for the password policy state operation intended to set the reset state for the user.  Exactly one value (either 'true' or 'false') must be given
   */
  public static final MessageDescriptor.Arg0 ERR_PWPSTATE_EXTOP_NO_RESET_STATE_VALUE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_PWPSTATE_EXTOP_NO_RESET_STATE_VALUE_520",EXTENSIONS,SEVERE_ERROR,520, getClassLoader());

  /**
   * Multiple values were provided for the password policy state operation intended to set the reset state for the user.  Exactly one value (either 'true' or 'false') must be given
   */
  public static final MessageDescriptor.Arg0 ERR_PWPSTATE_EXTOP_BAD_RESET_STATE_VALUE_COUNT =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_PWPSTATE_EXTOP_BAD_RESET_STATE_VALUE_COUNT_521",EXTENSIONS,SEVERE_ERROR,521, getClassLoader());

  /**
   * The value provided for the password policy state operation  intended to set the reset state for the user was invalid.  The value must be either 'true' or 'false'
   */
  public static final MessageDescriptor.Arg0 ERR_PWPSTATE_EXTOP_BAD_RESET_STATE_VALUE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_PWPSTATE_EXTOP_BAD_RESET_STATE_VALUE_522",EXTENSIONS,SEVERE_ERROR,522, getClassLoader());

  /**
   * Multiple values were provided for the password policy state operation intended to add a grace login use time for the user.  Exactly one value must be given
   */
  public static final MessageDescriptor.Arg0 ERR_PWPSTATE_EXTOP_BAD_ADD_GRACE_LOGIN_TIME_COUNT =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_PWPSTATE_EXTOP_BAD_ADD_GRACE_LOGIN_TIME_COUNT_523",EXTENSIONS,SEVERE_ERROR,523, getClassLoader());

  /**
   * The value %s provided for the password policy state operation used to update the grace login use times was invalid:  %s.  The value should be specified using the generalized time format
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPSTATE_EXTOP_BAD_GRACE_LOGIN_TIME =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPSTATE_EXTOP_BAD_GRACE_LOGIN_TIME_524",EXTENSIONS,SEVERE_ERROR,524, getClassLoader());

  /**
   * Multiple values were provided for the password policy state operation intended to set the required change time for the user.  Exactly one value must be given
   */
  public static final MessageDescriptor.Arg0 ERR_PWPSTATE_EXTOP_BAD_REQUIRED_CHANGE_TIME_COUNT =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_PWPSTATE_EXTOP_BAD_REQUIRED_CHANGE_TIME_COUNT_525",EXTENSIONS,SEVERE_ERROR,525, getClassLoader());

  /**
   * The value %s provided for the password policy state operation used to set the required change time was invalid:  %s.  The value should be specified using the generalized time format
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPSTATE_EXTOP_BAD_REQUIRED_CHANGE_TIME =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPSTATE_EXTOP_BAD_REQUIRED_CHANGE_TIME_526",EXTENSIONS,SEVERE_ERROR,526, getClassLoader());

  /**
   * The password policy state extended request included an operation with an invalid or unsupported operation type of %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PWPSTATE_EXTOP_UNKNOWN_OP_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PWPSTATE_EXTOP_UNKNOWN_OP_TYPE_527",EXTENSIONS,SEVERE_ERROR,527, getClassLoader());

  /**
   * An error occurred while attempting to update the password policy state information for user %s as part of a password modify extended operation (result code='%s', error message='%s')
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> WARN_EXTOP_PASSMOD_CANNOT_UPDATE_PWP_STATE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_WARN_EXTOP_PASSMOD_CANNOT_UPDATE_PWP_STATE_528",EXTENSIONS,MILD_WARNING,528, getClassLoader());

  /**
   * The DIGEST-MD5 credentials provided by the client requested an invalid digest URI of %s.  The expected digest URI was %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASLDIGESTMD5_INVALID_DIGEST_URI =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SASLDIGESTMD5_INVALID_DIGEST_URI_529",EXTENSIONS,MILD_ERROR,529, getClassLoader());

  /**
   * The provided new password was already contained in the password history
   */
  public static final MessageDescriptor.Arg0 ERR_EXTOP_PASSMOD_PW_IN_HISTORY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_EXTOP_PASSMOD_PW_IN_HISTORY_530",EXTENSIONS,MILD_ERROR,530, getClassLoader());

  /**
   * The Directory Server is not configured with any SMTP servers.  The SMTP alert handler cannot be used unless the Directory Server is configured with information about at least one SMTP server
   */
  public static final MessageDescriptor.Arg0 ERR_SMTPALERTHANDLER_NO_SMTP_SERVERS =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_SMTPALERTHANDLER_NO_SMTP_SERVERS_531",EXTENSIONS,MILD_ERROR,531, getClassLoader());

  /**
   * An error occurred when trying to send an e-mail message for administrative alert with type %s and message %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> WARN_SMTPALERTHANDLER_ERROR_SENDING_MESSAGE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_WARN_SMTPALERTHANDLER_ERROR_SENDING_MESSAGE_532",EXTENSIONS,SEVERE_WARNING,532, getClassLoader());

  /**
   * The provided match pattern "%s" could not be parsed as a regular expression:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_REGEXMAP_INVALID_MATCH_PATTERN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_REGEXMAP_INVALID_MATCH_PATTERN_533",EXTENSIONS,MILD_ERROR,533, getClassLoader());

  /**
   * Configuration entry %s contains value %s for attribute ds-cfg-match-attribute but that is not a valid name or OID for any attribute type defined in the Directory Server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_REGEXMAP_UNKNOWN_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_REGEXMAP_UNKNOWN_ATTR_534",EXTENSIONS,MILD_ERROR,534, getClassLoader());

  /**
   * The processed ID string %s mapped to multiple users
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_REGEXMAP_MULTIPLE_MATCHING_ENTRIES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_REGEXMAP_MULTIPLE_MATCHING_ENTRIES_535",EXTENSIONS,MILD_ERROR,535, getClassLoader());

  /**
   * The internal search based on processed ID string %s could not be processed efficiently:  %s.  Check the server configuration to ensure that all associated backends are properly configured for these types of searches
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_REGEXMAP_INEFFICIENT_SEARCH =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_REGEXMAP_INEFFICIENT_SEARCH_536",EXTENSIONS,MILD_ERROR,536, getClassLoader());

  /**
   * An internal failure occurred while attempting to resolve processed ID string %s to a user entry:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_REGEXMAP_SEARCH_FAILED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_REGEXMAP_SEARCH_FAILED_537",EXTENSIONS,MILD_ERROR,537, getClassLoader());

  /**
   * Cannot add group %s as a new nested group of static group %s because that group is already in the nested group list for the group
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_STATICGROUP_ADD_NESTED_GROUP_ALREADY_EXISTS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_STATICGROUP_ADD_NESTED_GROUP_ALREADY_EXISTS_538",EXTENSIONS,MILD_ERROR,538, getClassLoader());

  /**
   * Cannot remove group %s as a nested group of static group %s because that group is not included in the nested group list for the group
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_STATICGROUP_REMOVE_NESTED_GROUP_NO_SUCH_GROUP =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_STATICGROUP_REMOVE_NESTED_GROUP_NO_SUCH_GROUP_539",EXTENSIONS,MILD_ERROR,539, getClassLoader());

  /**
   * Group instance with DN %s has been deleted and is no longer valid
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_STATICGROUP_GROUP_INSTANCE_INVALID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_STATICGROUP_GROUP_INSTANCE_INVALID_540",EXTENSIONS,MILD_ERROR,540, getClassLoader());

  /**
   * The %s attribute is not searchable and should not be included in otherwise unindexed search filters
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_NUMSUBORDINATES_VATTR_NOT_SEARCHABLE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_NUMSUBORDINATES_VATTR_NOT_SEARCHABLE_541",EXTENSIONS,MILD_ERROR,541, getClassLoader());

  /**
   * The %s attribute is not searchable and should not be included in otherwise unindexed search filters
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_HASSUBORDINATES_VATTR_NOT_SEARCHABLE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_HASSUBORDINATES_VATTR_NOT_SEARCHABLE_542",EXTENSIONS,MILD_ERROR,542, getClassLoader());

  /**
   * The SMTP account status notification handler defined in configuration entry %s cannot be enabled unless the Directory Server is with information about one or more SMTP servers
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SMTP_ASNH_NO_MAIL_SERVERS_CONFIGURED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SMTP_ASNH_NO_MAIL_SERVERS_CONFIGURED_543",EXTENSIONS,MILD_ERROR,543, getClassLoader());

  /**
   * SMTP account status notification handler configuration entry '%s' does not include any email address attribute types or recipient addresses.  At least one of these must be provided
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SMTP_ASNH_NO_RECIPIENTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SMTP_ASNH_NO_RECIPIENTS_544",EXTENSIONS,MILD_ERROR,544, getClassLoader());

  /**
   * Unable to parse message subject value '%s' from configuration entry '%s' because the value does not contain a colon to separate the notification type from the subject
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SMTP_ASNH_SUBJECT_NO_COLON =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SMTP_ASNH_SUBJECT_NO_COLON_545",EXTENSIONS,MILD_ERROR,545, getClassLoader());

  /**
   * Unable to parse message subject value '%s' from configuration entry '%s' because '%s' is not a valid account status notification type
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SMTP_ASNH_SUBJECT_INVALID_NOTIFICATION_TYPE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_SMTP_ASNH_SUBJECT_INVALID_NOTIFICATION_TYPE_546",EXTENSIONS,MILD_ERROR,546, getClassLoader());

  /**
   * The message subject definitions contained in configuration entry '%s' have multiple subjects defined for notification type %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SMTP_ASNH_SUBJECT_DUPLICATE_TYPE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SMTP_ASNH_SUBJECT_DUPLICATE_TYPE_547",EXTENSIONS,MILD_ERROR,547, getClassLoader());

  /**
   * Unable to parse message template file path value '%s' from configuration entry '%s' because the value does not contain a colon to separate the notification type from the template file path
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SMTP_ASNH_TEMPLATE_NO_COLON =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SMTP_ASNH_TEMPLATE_NO_COLON_548",EXTENSIONS,MILD_ERROR,548, getClassLoader());

  /**
   * Unable to parse message template file path value '%s' from configuration entry '%s' because '%s' is not a valid account status notification type
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SMTP_ASNH_TEMPLATE_INVALID_NOTIFICATION_TYPE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_SMTP_ASNH_TEMPLATE_INVALID_NOTIFICATION_TYPE_549",EXTENSIONS,MILD_ERROR,549, getClassLoader());

  /**
   * The message template file path definitions contained in configuration entry '%s' have multiple template file paths defined for notification type %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SMTP_ASNH_TEMPLATE_DUPLICATE_TYPE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SMTP_ASNH_TEMPLATE_DUPLICATE_TYPE_550",EXTENSIONS,MILD_ERROR,550, getClassLoader());

  /**
   * The message template file '%s' referenced in configuration entry '%s' does not exist
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SMTP_ASNH_TEMPLATE_NO_SUCH_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SMTP_ASNH_TEMPLATE_NO_SUCH_FILE_551",EXTENSIONS,MILD_ERROR,551, getClassLoader());

  /**
   * An unclosed token was found starting at column %d of line %d
   */
  public static final MessageDescriptor.Arg2<Number,Number> ERR_SMTP_ASNH_TEMPLATE_UNCLOSED_TOKEN =
          new MessageDescriptor.Arg2<Number,Number>(BASE,"MILD_ERR_SMTP_ASNH_TEMPLATE_UNCLOSED_TOKEN_552",EXTENSIONS,MILD_ERROR,552, getClassLoader());

  /**
   * The notification-user-attr token starting at column %d of line %d references undefined attribute type %s
   */
  public static final MessageDescriptor.Arg3<Number,Number,CharSequence> ERR_SMTP_ASNH_TEMPLATE_UNDEFINED_ATTR_TYPE =
          new MessageDescriptor.Arg3<Number,Number,CharSequence>(BASE,"MILD_ERR_SMTP_ASNH_TEMPLATE_UNDEFINED_ATTR_TYPE_553",EXTENSIONS,MILD_ERROR,553, getClassLoader());

  /**
   * The notification-property token starting at column %d of line %d references undefined notification property %s
   */
  public static final MessageDescriptor.Arg3<Number,Number,CharSequence> ERR_SMTP_ASNH_TEMPLATE_UNDEFINED_PROPERTY =
          new MessageDescriptor.Arg3<Number,Number,CharSequence>(BASE,"MILD_ERR_SMTP_ASNH_TEMPLATE_UNDEFINED_PROPERTY_554",EXTENSIONS,MILD_ERROR,554, getClassLoader());

  /**
   * An unrecognized token %s was found at column %d of line %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,Number> ERR_SMTP_ASNH_TEMPLATE_UNRECOGNIZED_TOKEN =
          new MessageDescriptor.Arg3<CharSequence,Number,Number>(BASE,"MILD_ERR_SMTP_ASNH_TEMPLATE_UNRECOGNIZED_TOKEN_555",EXTENSIONS,MILD_ERROR,555, getClassLoader());

  /**
   * An error occurred while attempting to parse message template file '%s' referenced in configuration entry '%s':  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SMTP_ASNH_TEMPLATE_CANNOT_PARSE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_SMTP_ASNH_TEMPLATE_CANNOT_PARSE_556",EXTENSIONS,MILD_ERROR,556, getClassLoader());

  /**
   * Directory Account Status Notification
   */
  public static final MessageDescriptor.Arg0 INFO_SMTP_ASNH_DEFAULT_SUBJECT =
          new MessageDescriptor.Arg0(BASE,"INFO_SMTP_ASNH_DEFAULT_SUBJECT_557",EXTENSIONS,INFORMATION,557, getClassLoader());

  /**
   * An error occurred while attempting to send an account status notification message for notification type %s for user entry %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SMTP_ASNH_CANNOT_SEND_MESSAGE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_SMTP_ASNH_CANNOT_SEND_MESSAGE_558",EXTENSIONS,SEVERE_ERROR,558, getClassLoader());

  /**
   * An error occurred while trying to encrypt a value using password storage scheme %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWSCHEME_CANNOT_ENCRYPT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWSCHEME_CANNOT_ENCRYPT_559",EXTENSIONS,SEVERE_ERROR,559, getClassLoader());

  /**
   * An error occurred while trying to decrypt a value using password storage scheme %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWSCHEME_CANNOT_DECRYPT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWSCHEME_CANNOT_DECRYPT_560",EXTENSIONS,SEVERE_ERROR,560, getClassLoader());

  /**
   * Cannot decode the provided symmetric key extended operation because it does not have a value
   */
  public static final MessageDescriptor.Arg0 ERR_GET_SYMMETRIC_KEY_NO_VALUE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_GET_SYMMETRIC_KEY_NO_VALUE_561",EXTENSIONS,MILD_ERROR,561, getClassLoader());

  /**
   * Cannot decode the provided symmetric key extended operation because the value sequence has an element with an invalid type of %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_GET_SYMMETRIC_KEY_INVALID_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_GET_SYMMETRIC_KEY_INVALID_TYPE_562",EXTENSIONS,MILD_ERROR,562, getClassLoader());

  /**
   * Cannot decode the provided symmetric key extended request: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_GET_SYMMETRIC_KEY_ASN1_DECODE_EXCEPTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_GET_SYMMETRIC_KEY_ASN1_DECODE_EXCEPTION_563",EXTENSIONS,MILD_ERROR,563, getClassLoader());

  /**
   * An unexpected error occurred while attempting to decode the symmetric key extended request sequence: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_GET_SYMMETRIC_KEY_DECODE_EXCEPTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_GET_SYMMETRIC_KEY_DECODE_EXCEPTION_564",EXTENSIONS,MILD_ERROR,564, getClassLoader());

  /**
   * The exact match identity mapper defined in configuration entry %s references attribute type %s which is does not have an equality index defined in backend %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_EXACTMAP_ATTR_UNINDEXED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_EXACTMAP_ATTR_UNINDEXED_565",EXTENSIONS,SEVERE_ERROR,565, getClassLoader());

  /**
   * The regular expression identity mapper defined in configuration entry %s references attribute type %s which is does not have an equality index defined in backend %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_REGEXMAP_ATTR_UNINDEXED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_REGEXMAP_ATTR_UNINDEXED_566",EXTENSIONS,SEVERE_ERROR,566, getClassLoader());

  /**
   * The fingerprint certificate mapper defined in configuration entry %s references attribute type %s which is does not have an equality index defined in backend %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_FCM_ATTR_UNINDEXED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_FCM_ATTR_UNINDEXED_567",EXTENSIONS,SEVERE_ERROR,567, getClassLoader());

  /**
   * The subject attribute to user attribute certificate mapper defined in configuration entry %s references attribute type %s which is does not have an equality index defined in backend %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> WARN_SATUACM_ATTR_UNINDEXED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_WARN_SATUACM_ATTR_UNINDEXED_568",EXTENSIONS,SEVERE_WARNING,568, getClassLoader());

  /**
   * The subject DN to user attribute certificate mapper defined in configuration entry %s references attribute type %s which is does not have an equality index defined in backend %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SDTUACM_ATTR_UNINDEXED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_SDTUACM_ATTR_UNINDEXED_569",EXTENSIONS,SEVERE_ERROR,569, getClassLoader());

  /**
   * SASL DIGEST MD5 protocol error: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SASLDIGESTMD5_PROTOCOL_ERROR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_SASLDIGESTMD5_PROTOCOL_ERROR_570",EXTENSIONS,SEVERE_ERROR,570, getClassLoader());

  /**
   * Loaded extension from file '%s' (build %s, revision %s)
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> INFO_LOG_EXTENSION_INFORMATION =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"INFO_LOG_EXTENSION_INFORMATION_571",EXTENSIONS,INFORMATION,571, getClassLoader());

  /**
   * Failed to create a SASL server for SASL mechanism %s using a server FQDN of %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SASL_CREATE_SASL_SERVER_FAILED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_SASL_CREATE_SASL_SERVER_FAILED_572",EXTENSIONS,SEVERE_ERROR,572, getClassLoader());

  /**
   * GSSAPI SASL mechanism handler initalization failed because the keytab file %s does not exist
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SASL_GSSAPI_KEYTAB_INVALID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_SASL_GSSAPI_KEYTAB_INVALID_573",EXTENSIONS,SEVERE_ERROR,573, getClassLoader());

  /**
   * The GSSAPI SASL mechanism handler initialization was successful
   */
  public static final MessageDescriptor.Arg0 INFO_GSSAPI_STARTED =
          new MessageDescriptor.Arg0(BASE,"INFO_GSSAPI_STARTED_574",EXTENSIONS,INFORMATION,574, getClassLoader());

  /**
   * The GSSAPI SASL mechanism handler has been stopped
   */
  public static final MessageDescriptor.Arg0 INFO_GSSAPI_STOPPED =
          new MessageDescriptor.Arg0(BASE,"INFO_GSSAPI_STOPPED_575",EXTENSIONS,INFORMATION,575, getClassLoader());

  /**
   * The %s attribute is not searchable and should not be included in otherwise unindexed search filters
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_COLLECTIVEATTRIBUTESUBENTRIES_VATTR_NOT_SEARCHABLE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_COLLECTIVEATTRIBUTESUBENTRIES_VATTR_NOT_SEARCHABLE_576",EXTENSIONS,MILD_ERROR,576, getClassLoader());

  /**
   * The %s attribute is not searchable and should not be included in otherwise unindexed search filters
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PASSWORDPOLICYSUBENTRY_VATTR_NOT_SEARCHABLE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_PASSWORDPOLICYSUBENTRY_VATTR_NOT_SEARCHABLE_577",EXTENSIONS,MILD_ERROR,577, getClassLoader());

  /**
   * The password value %s has been base64-decoded but is too short to be valid
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PWSCHEME_INVALID_BASE64_DECODED_STORED_PASSWORD =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_PWSCHEME_INVALID_BASE64_DECODED_STORED_PASSWORD_578",EXTENSIONS,MILD_ERROR,578, getClassLoader());


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
            Class<?> c = Class.forName("org.opends.messages.ExtensionMessages");

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
      cl = ExtensionMessages.class.getClassLoader();
    }
    return cl;
  }
}
