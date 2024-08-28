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
public final class ConfigMessages {

  /** Base property for resource bundle containing messages */
  private static final String BASE = "messages/config";

  private static ClassLoader webstartClassLoader;

  // Prevent instantiation.
  private ConfigMessages() {
    // Do nothing.
  }

  /**
   * Configuration attribute %s is required to have at least one value but the resulted operation would have removed all values
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_ATTR_IS_REQUIRED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CONFIG_ATTR_IS_REQUIRED_1",CONFIG,MILD_ERROR,1, getClassLoader());

  /**
   * Provided value %s for configuration attribute %s was rejected.  The reason provided was:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_ATTR_REJECTED_VALUE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_ATTR_REJECTED_VALUE_2",CONFIG,MILD_ERROR,2, getClassLoader());

  /**
   * Configuration attribute %s is single-valued, but multiple values were provided
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_ATTR_SET_VALUES_IS_SINGLE_VALUED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CONFIG_ATTR_SET_VALUES_IS_SINGLE_VALUED_3",CONFIG,MILD_ERROR,3, getClassLoader());

  /**
   * Configuration attribute %s is single-valued, but adding the provided value(s) would have given it multiple values
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_ATTR_ADD_VALUES_IS_SINGLE_VALUED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CONFIG_ATTR_ADD_VALUES_IS_SINGLE_VALUED_4",CONFIG,MILD_ERROR,4, getClassLoader());

  /**
   * Configuration attribute %s already contains a value %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_ATTR_ADD_VALUES_ALREADY_EXISTS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_ATTR_ADD_VALUES_ALREADY_EXISTS_5",CONFIG,MILD_ERROR,5, getClassLoader());

  /**
   * Cannot remove value %s from configuration attribute %s because the specified value does not exist
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_ATTR_NO_SUCH_VALUE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_ATTR_NO_SUCH_VALUE_6",CONFIG,MILD_ERROR,6, getClassLoader());

  /**
   * Unable to set the value for Boolean configuration attribute %s because the provided value %s was not either 'true' or 'false'
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_ATTR_INVALID_BOOLEAN_VALUE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_ATTR_INVALID_BOOLEAN_VALUE_7",CONFIG,MILD_ERROR,7, getClassLoader());

  /**
   * Unable to retrieve the value for configuration attribute %s as an integer because that attribute does not have any values
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_ATTR_NO_INT_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CONFIG_ATTR_NO_INT_VALUE_8",CONFIG,MILD_ERROR,8, getClassLoader());

  /**
   * Unable to retrieve the value for configuration attribute %s as an integer because that attribute has multiple values
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_ATTR_MULTIPLE_INT_VALUES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CONFIG_ATTR_MULTIPLE_INT_VALUES_9",CONFIG,MILD_ERROR,9, getClassLoader());

  /**
   * Unable to retrieve the value for configuration attribute %s as a Java int because the value is outside the allowable range for an int
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_ATTR_VALUE_OUT_OF_INT_RANGE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CONFIG_ATTR_VALUE_OUT_OF_INT_RANGE_10",CONFIG,MILD_ERROR,10, getClassLoader());

  /**
   * Unable to set the value for integer configuration attribute %s because the provided value %s cannot be interpreted as an integer value:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_ATTR_INVALID_INT_VALUE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_ATTR_INVALID_INT_VALUE_11",CONFIG,MILD_ERROR,11, getClassLoader());

  /**
   * Unable to set the value for configuration attribute %s because the provided value %d is less than the lowest allowed value of %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,Number> ERR_CONFIG_ATTR_INT_BELOW_LOWER_BOUND =
          new MessageDescriptor.Arg3<CharSequence,Number,Number>(BASE,"MILD_ERR_CONFIG_ATTR_INT_BELOW_LOWER_BOUND_12",CONFIG,MILD_ERROR,12, getClassLoader());

  /**
   * Unable to set the value for configuration attribute %s because the provided value %d is greater than the largest allowed value of %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,Number> ERR_CONFIG_ATTR_INT_ABOVE_UPPER_BOUND =
          new MessageDescriptor.Arg3<CharSequence,Number,Number>(BASE,"MILD_ERR_CONFIG_ATTR_INT_ABOVE_UPPER_BOUND_13",CONFIG,MILD_ERROR,13, getClassLoader());

  /**
   * Unable to parse value %s for configuration attribute %s as an integer value:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_ATTR_INT_COULD_NOT_PARSE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_ATTR_INT_COULD_NOT_PARSE_14",CONFIG,MILD_ERROR,14, getClassLoader());

  /**
   * Unable to retrieve the value for configuration attribute %s as a string because that attribute does not have any values
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_ATTR_NO_STRING_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CONFIG_ATTR_NO_STRING_VALUE_15",CONFIG,MILD_ERROR,15, getClassLoader());

  /**
   * Unable to retrieve the value for configuration attribute %s as a string because that attribute has multiple values
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_ATTR_MULTIPLE_STRING_VALUES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CONFIG_ATTR_MULTIPLE_STRING_VALUES_16",CONFIG,MILD_ERROR,16, getClassLoader());

  /**
   * An empty value string was provided for configuration attribute %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_ATTR_EMPTY_STRING_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CONFIG_ATTR_EMPTY_STRING_VALUE_17",CONFIG,MILD_ERROR,17, getClassLoader());

  /**
   * The value %s is not included in the list of acceptable values for configuration attribute %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_ATTR_VALUE_NOT_ALLOWED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_ATTR_VALUE_NOT_ALLOWED_18",CONFIG,MILD_ERROR,18, getClassLoader());

  /**
   * '%s' is not a valid unit for configuration attribute %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_ATTR_INVALID_UNIT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_ATTR_INVALID_UNIT_19",CONFIG,MILD_ERROR,19, getClassLoader());

  /**
   * Cannot decode %s as an integer value and a unit for configuration attribute %s because no value/unit delimiter could be found
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_ATTR_NO_UNIT_DELIMITER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_ATTR_NO_UNIT_DELIMITER_20",CONFIG,MILD_ERROR,20, getClassLoader());

  /**
   * Could not decode the integer portion of value %s for configuration attribute %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_ATTR_COULD_NOT_PARSE_INT_COMPONENT =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_ATTR_COULD_NOT_PARSE_INT_COMPONENT_21",CONFIG,MILD_ERROR,21, getClassLoader());

  /**
   * The provided value %s for integer with unit attribute %s is not allowed:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_ATTR_INVALID_VALUE_WITH_UNIT =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_ATTR_INVALID_VALUE_WITH_UNIT_22",CONFIG,MILD_ERROR,22, getClassLoader());

  /**
   * Unable to add configuration entry %s as a child of configuration entry %s because a child entry was already found with that DN
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_ENTRY_CONFLICTING_CHILD =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_ENTRY_CONFLICTING_CHILD_23",CONFIG,MILD_ERROR,23, getClassLoader());

  /**
   * Unable to remove entry %s as a child of configuration entry %s because that entry did not have a child with the specified DN
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_ENTRY_NO_SUCH_CHILD =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_ENTRY_NO_SUCH_CHILD_24",CONFIG,MILD_ERROR,24, getClassLoader());

  /**
   * Unable to remove entry %s as a child of configuration entry %s because that entry had children of its own and non-leaf entries may not be removed
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_ENTRY_CANNOT_REMOVE_NONLEAF =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_ENTRY_CANNOT_REMOVE_NONLEAF_25",CONFIG,MILD_ERROR,25, getClassLoader());

  /**
   * The specified configuration file %s does not exist or is not readable
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_FILE_DOES_NOT_EXIST =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"FATAL_ERR_CONFIG_FILE_DOES_NOT_EXIST_26",CONFIG,FATAL_ERROR,26, getClassLoader());

  /**
   * An unexpected error occurred while attempting to determine whether configuration file %s exists:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_FILE_CANNOT_VERIFY_EXISTENCE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"FATAL_ERR_CONFIG_FILE_CANNOT_VERIFY_EXISTENCE_27",CONFIG,FATAL_ERROR,27, getClassLoader());

  /**
   * An error occurred while attempting to open the configuration file %s for reading:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_FILE_CANNOT_OPEN_FOR_READ =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"FATAL_ERR_CONFIG_FILE_CANNOT_OPEN_FOR_READ_28",CONFIG,FATAL_ERROR,28, getClassLoader());

  /**
   * An error occurred while attempting to read the contents of configuration file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_FILE_READ_ERROR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"FATAL_ERR_CONFIG_FILE_READ_ERROR_29",CONFIG,FATAL_ERROR,29, getClassLoader());

  /**
   * Invalid configuration attribute %s detected:  the only attribute option allowed in the Directory Server configuration is "pending" to indicate the set of pending values
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_ATTR_OPTIONS_NOT_ALLOWED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CONFIG_ATTR_OPTIONS_NOT_ALLOWED_30",CONFIG,MILD_ERROR,30, getClassLoader());

  /**
   * An error occurred at or near line %d while trying to parse the configuration from LDIF file %s:  %s
   */
  public static final MessageDescriptor.Arg3<Number,CharSequence,CharSequence> ERR_CONFIG_FILE_INVALID_LDIF_ENTRY =
          new MessageDescriptor.Arg3<Number,CharSequence,CharSequence>(BASE,"FATAL_ERR_CONFIG_FILE_INVALID_LDIF_ENTRY_31",CONFIG,FATAL_ERROR,31, getClassLoader());

  /**
   * The specified configuration file %s does not appear to contain any configuration entries
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_FILE_EMPTY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"FATAL_ERR_CONFIG_FILE_EMPTY_32",CONFIG,FATAL_ERROR,32, getClassLoader());

  /**
   * The first entry read from LDIF configuration file %s had a DN of "%s" rather than the expected "%s" which should be used as the Directory Server configuration root
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_FILE_INVALID_BASE_DN =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"FATAL_ERR_CONFIG_FILE_INVALID_BASE_DN_33",CONFIG,FATAL_ERROR,33, getClassLoader());

  /**
   * An unexpected error occurred while attempting to process the Directory Server configuration file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_FILE_GENERIC_ERROR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"FATAL_ERR_CONFIG_FILE_GENERIC_ERROR_34",CONFIG,FATAL_ERROR,34, getClassLoader());

  /**
   * Configuration entry %s starting at or near line %s in the LDIF configuration file %s has the same DN as another entry already read from that file
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_FILE_DUPLICATE_ENTRY =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"FATAL_ERR_CONFIG_FILE_DUPLICATE_ENTRY_35",CONFIG,FATAL_ERROR,35, getClassLoader());

  /**
   * Configuration entry %s starting at or near line %d in the configuration LDIF file %s does not appear to have a parent entry (expected parent DN was %s)
   */
  public static final MessageDescriptor.Arg4<CharSequence,Number,CharSequence,CharSequence> ERR_CONFIG_FILE_NO_PARENT =
          new MessageDescriptor.Arg4<CharSequence,Number,CharSequence,CharSequence>(BASE,"FATAL_ERR_CONFIG_FILE_NO_PARENT_36",CONFIG,FATAL_ERROR,36, getClassLoader());

  /**
   * The Directory Server was unable to determine the parent DN for configuration entry %s starting at or near line %d in the configuration LDIF file %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,CharSequence> ERR_CONFIG_FILE_UNKNOWN_PARENT =
          new MessageDescriptor.Arg3<CharSequence,Number,CharSequence>(BASE,"FATAL_ERR_CONFIG_FILE_UNKNOWN_PARENT_37",CONFIG,FATAL_ERROR,37, getClassLoader());

  /**
   * Unable to determine the Directory Server instance root from either an environment variable or based on the location of the configuration file.  Please set an environment variable named %s with a value containing the absolute path to the server installation root
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_CANNOT_DETERMINE_SERVER_ROOT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"FATAL_ERR_CONFIG_CANNOT_DETERMINE_SERVER_ROOT_38",CONFIG,FATAL_ERROR,38, getClassLoader());

  /**
   * An unexpected error occurred while trying to write configuration entry %s to LDIF:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_FILE_WRITE_ERROR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_FILE_WRITE_ERROR_39",CONFIG,SEVERE_ERROR,39, getClassLoader());

  /**
   * An unexpected error occurred while trying to close the LDIF writer:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_FILE_CLOSE_ERROR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_FILE_CLOSE_ERROR_40",CONFIG,SEVERE_ERROR,40, getClassLoader());

  /**
   * The Directory Server configuration may not be altered by importing a new configuration from LDIF
   */
  public static final MessageDescriptor.Arg0 ERR_CONFIG_FILE_UNWILLING_TO_IMPORT =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CONFIG_FILE_UNWILLING_TO_IMPORT_41",CONFIG,SEVERE_ERROR,41, getClassLoader());

  /**
   * An error occurred while attempting to retrieve the base logger entry cn=Loggers,cn=config from the Directory Server configuration:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_LOGGER_CANNOT_GET_BASE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"FATAL_ERR_CONFIG_LOGGER_CANNOT_GET_BASE_42",CONFIG,FATAL_ERROR,42, getClassLoader());

  /**
   * The logger configuration base cn=Loggers,cn=config does not exist in the Directory Server configuration.  Logging facilities will not be available until this entry is created and the Directory Server is restarted
   */
  public static final MessageDescriptor.Arg0 WARN_CONFIG_LOGGER_BASE_DOES_NOT_EXIST =
          new MessageDescriptor.Arg0(BASE,"SEVERE_WARN_CONFIG_LOGGER_BASE_DOES_NOT_EXIST_43",CONFIG,SEVERE_WARNING,43, getClassLoader());

  /**
   * There are no active access loggers defined in the Directory Server configuration.  No access logging will be performed
   */
  public static final MessageDescriptor.Arg0 WARN_CONFIG_LOGGER_NO_ACTIVE_ACCESS_LOGGERS =
          new MessageDescriptor.Arg0(BASE,"SEVERE_WARN_CONFIG_LOGGER_NO_ACTIVE_ACCESS_LOGGERS_44",CONFIG,SEVERE_WARNING,44, getClassLoader());

  /**
   * There are no active error loggers defined in the Directory Server configuration.  No error logging will be performed
   */
  public static final MessageDescriptor.Arg0 WARN_CONFIG_LOGGER_NO_ACTIVE_ERROR_LOGGERS =
          new MessageDescriptor.Arg0(BASE,"SEVERE_WARN_CONFIG_LOGGER_NO_ACTIVE_ERROR_LOGGERS_45",CONFIG,SEVERE_WARNING,45, getClassLoader());

  /**
   * There are no active debug loggers defined in the Directory Server configuration.  No debug logging will be performed
   */
  public static final MessageDescriptor.Arg0 WARN_CONFIG_LOGGER_NO_ACTIVE_DEBUG_LOGGERS =
          new MessageDescriptor.Arg0(BASE,"MILD_WARN_CONFIG_LOGGER_NO_ACTIVE_DEBUG_LOGGERS_46",CONFIG,MILD_WARNING,46, getClassLoader());

  /**
   * Configuration entry %s does not contain a valid logger configuration:  %s.  It will be ignored
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_LOGGER_ENTRY_UNACCEPTABLE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_LOGGER_ENTRY_UNACCEPTABLE_47",CONFIG,SEVERE_ERROR,47, getClassLoader());

  /**
   * Unknown unacceptable reason
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_UNKNOWN_UNACCEPTABLE_REASON =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_UNKNOWN_UNACCEPTABLE_REASON_48",CONFIG,INFORMATION,48, getClassLoader());

  /**
   * An error occurred while attempting to create a Directory Server logger from the information in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_LOGGER_CANNOT_CREATE_LOGGER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_LOGGER_CANNOT_CREATE_LOGGER_49",CONFIG,SEVERE_ERROR,49, getClassLoader());

  /**
   * Configuration entry %s does not contain a valid objectclass for a Directory Server access, error, or debug logger definition
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_LOGGER_INVALID_OBJECTCLASS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_LOGGER_INVALID_OBJECTCLASS_50",CONFIG,SEVERE_ERROR,50, getClassLoader());

  /**
   * The fully-qualified name of the Java class that defines the Directory Server logger.  If this is altered while the associated logger is enabled, then that logger must be disabled and re-enabled for the change to take effect
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_LOGGER_DESCRIPTION_CLASS_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_LOGGER_DESCRIPTION_CLASS_NAME_51",CONFIG,INFORMATION,51, getClassLoader());

  /**
   * Configuration entry %s does not contain a valid value for configuration attribute ds-cfg-java-class which specifies the fully-qualified class name for the associated logger
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_LOGGER_NO_CLASS_NAME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_LOGGER_NO_CLASS_NAME_52",CONFIG,SEVERE_ERROR,52, getClassLoader());

  /**
   * Configuration entry %s has an invalid value for attribute ds-cfg-java-class:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_LOGGER_INVALID_CLASS_NAME =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_LOGGER_INVALID_CLASS_NAME_53",CONFIG,SEVERE_ERROR,53, getClassLoader());

  /**
   * Class %s specified in attribute ds-cfg-java-class of configuration entry %s cannot be instantiated as a Directory Server access logger:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_LOGGER_INVALID_ACCESS_LOGGER_CLASS =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_LOGGER_INVALID_ACCESS_LOGGER_CLASS_54",CONFIG,SEVERE_ERROR,54, getClassLoader());

  /**
   * Class %s specified in attribute ds-cfg-java-class of configuration entry %s cannot be instantiated as a Directory Server error logger:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_LOGGER_INVALID_ERROR_LOGGER_CLASS =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_LOGGER_INVALID_ERROR_LOGGER_CLASS_55",CONFIG,SEVERE_ERROR,55, getClassLoader());

  /**
   * Class %s specified in attribute ds-cfg-java-class of configuration entry %s cannot be instantiated as a Directory Server debug logger:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_LOGGER_INVALID_DEBUG_LOGGER_CLASS =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_LOGGER_INVALID_DEBUG_LOGGER_CLASS_56",CONFIG,SEVERE_ERROR,56, getClassLoader());

  /**
   * Indicates whether this Directory Server logger should be enabled.  Changes to this attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_LOGGER_DESCRIPTION_ENABLED =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_LOGGER_DESCRIPTION_ENABLED_57",CONFIG,INFORMATION,57, getClassLoader());

  /**
   * Configuration entry %s does not contain a valid value for configuration attribute ds-cfg-enabled which indicates whether the logger should be enabled for use in the Directory Server
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_LOGGER_NO_ENABLED_ATTR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_LOGGER_NO_ENABLED_ATTR_58",CONFIG,SEVERE_ERROR,58, getClassLoader());

  /**
   * Configuration entry %s has an invalid value for attribute ds-cfg-enabled:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_LOGGER_INVALID_ENABLED_VALUE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_LOGGER_INVALID_ENABLED_VALUE_59",CONFIG,SEVERE_ERROR,59, getClassLoader());

  /**
   * Indicates whether to allow some flexibility in the characters that may be used in attribute names. By default, attribute names may only contain ASCII alphabetic letters, numeric digits, and dashes, and they must begin with a letter.  If attribute name exceptions are enabled, then the underscore character will also be allowed and the attribute name may also start with a digit.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_CORE_DESCRIPTION_ALLOW_ATTR_EXCEPTIONS =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_CORE_DESCRIPTION_ALLOW_ATTR_EXCEPTIONS_60",CONFIG,INFORMATION,60, getClassLoader());

  /**
   * Configuration entry %s has an invalid value for configuration attribute ds-cfg-allow-attribute-name-exceptions (it should be a Boolean value of true or false):  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_CORE_INVALID_ALLOW_EXCEPTIONS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_CORE_INVALID_ALLOW_EXCEPTIONS_61",CONFIG,SEVERE_ERROR,61, getClassLoader());

  /**
   * Behavior that the Directory Server should exhibit if it discovers an attribute whose value does not conform to the syntax for that attribute. Acceptable values for this attribute are "reject" to reject the invalid value, "warn" to accept the invalid value but log a warning message, or "accept" to accept the invalid value with no warning.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_CORE_DESCRIPTION_INVALID_SYNTAX_BEHAVIOR =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_CORE_DESCRIPTION_INVALID_SYNTAX_BEHAVIOR_62",CONFIG,INFORMATION,62, getClassLoader());

  /**
   * Configuration entry %s has an invalid value for configuration attribute ds-cfg-invalid-attribute-syntax-behavior (it should be one of "accept", "reject", or "warn" ):  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_CORE_INVALID_ENFORCE_STRICT_SYNTAX =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_CORE_INVALID_ENFORCE_STRICT_SYNTAX_63",CONFIG,SEVERE_ERROR,63, getClassLoader());

  /**
   * Configuration attribute %s appears to contain multiple pending value sets
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_ATTR_MULTIPLE_PENDING_VALUE_SETS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CONFIG_ATTR_MULTIPLE_PENDING_VALUE_SETS_64",CONFIG,MILD_ERROR,64, getClassLoader());

  /**
   * Configuration attribute %s appears to contain multiple active value sets
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_ATTR_MULTIPLE_ACTIVE_VALUE_SETS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CONFIG_ATTR_MULTIPLE_ACTIVE_VALUE_SETS_65",CONFIG,MILD_ERROR,65, getClassLoader());

  /**
   * Configuration attribute %s does not contain an active value set
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_ATTR_NO_ACTIVE_VALUE_SET =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CONFIG_ATTR_NO_ACTIVE_VALUE_SET_66",CONFIG,MILD_ERROR,66, getClassLoader());

  /**
   * Unable to parse value %s for configuration attribute %s as an integer value because the element was of an invalid type (%s)
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_ATTR_INT_INVALID_TYPE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_ATTR_INT_INVALID_TYPE_67",CONFIG,MILD_ERROR,67, getClassLoader());

  /**
   * Unable to parse value for configuration attribute %s as a set of integer values because the array contained elements of an invalid type (%s)
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_ATTR_INT_INVALID_ARRAY_TYPE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_ATTR_INT_INVALID_ARRAY_TYPE_68",CONFIG,MILD_ERROR,68, getClassLoader());

  /**
   * Unable to parse value %s for configuration attribute %s as a string value:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_ATTR_INVALID_STRING_VALUE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_ATTR_INVALID_STRING_VALUE_69",CONFIG,MILD_ERROR,69, getClassLoader());

  /**
   * Unable to parse value %s for configuration attribute %s as a string value because the element was of an invalid type (%s)
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_ATTR_STRING_INVALID_TYPE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_ATTR_STRING_INVALID_TYPE_70",CONFIG,MILD_ERROR,70, getClassLoader());

  /**
   * Unable to parse value for configuration attribute %s as a set of string values because the array contained elements of an invalid type (%s)
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_ATTR_STRING_INVALID_ARRAY_TYPE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_ATTR_STRING_INVALID_ARRAY_TYPE_71",CONFIG,MILD_ERROR,71, getClassLoader());

  /**
   * Unable to parse value %s for configuration attribute %s as an integer with unit value because the element was of an invalid type (%s)
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_ATTR_INT_WITH_UNIT_INVALID_TYPE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_ATTR_INT_WITH_UNIT_INVALID_TYPE_72",CONFIG,MILD_ERROR,72, getClassLoader());

  /**
   * Configuration entry %s does not contain a value for attribute %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_JMX_ATTR_NO_VALUE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_JMX_ATTR_NO_VALUE_73",CONFIG,MILD_ERROR,73, getClassLoader());

  /**
   * Configuration entry %s does not contain attribute %s (or that attribute exists but is not accessible using JMX)
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_JMX_ATTR_NO_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_JMX_ATTR_NO_ATTR_74",CONFIG,MILD_ERROR,74, getClassLoader());

  /**
   * Unable to retrieve configuration entry %s for access through JMX:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_JMX_CANNOT_GET_CONFIG_ENTRY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_JMX_CANNOT_GET_CONFIG_ENTRY_75",CONFIG,MILD_ERROR,75, getClassLoader());

  /**
   * Attempted update to attribute %s of configuration entry %s over JMX would have resulted in an invalid value:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_JMX_ATTR_INVALID_VALUE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_JMX_ATTR_INVALID_VALUE_76",CONFIG,MILD_ERROR,76, getClassLoader());

  /**
   * Update to configuration entry %s over JMX would have resulted in an invalid configuration:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_JMX_UNACCEPTABLE_CONFIG =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_JMX_UNACCEPTABLE_CONFIG_77",CONFIG,MILD_ERROR,77, getClassLoader());

  /**
   * There is no method %s for any invokable component registered with configuration entry %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_JMX_NO_METHOD =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_JMX_NO_METHOD_78",CONFIG,MILD_ERROR,78, getClassLoader());

  /**
   * An error occurred while attempting to retrieve configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_CANNOT_GET_CONFIG_ENTRY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_CANNOT_GET_CONFIG_ENTRY_79",CONFIG,MILD_ERROR,79, getClassLoader());

  /**
   * The value of configuration attribute %s has been set to %s in configuration entry %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> INFO_CONFIG_SET_ATTRIBUTE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"INFO_CONFIG_SET_ATTRIBUTE_80",CONFIG,INFORMATION,80, getClassLoader());

  /**
   * The attempt to update configuration entry %s was not successful and one or more problems were encountered:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_CHANGE_NOT_SUCCESSFUL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_CHANGE_NOT_SUCCESSFUL_81",CONFIG,MILD_ERROR,81, getClassLoader());

  /**
   * Configuration entry %s does not contain a valid value for configuration attribute ds-cfg-log-file which specifies the log file name for the associated logger
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_LOGGER_NO_FILE_NAME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_LOGGER_NO_FILE_NAME_82",CONFIG,SEVERE_ERROR,82, getClassLoader());

  /**
   * The Directory Server could not register a JMX MBean for the component associated with configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_JMX_CANNOT_REGISTER_MBEAN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_JMX_CANNOT_REGISTER_MBEAN_83",CONFIG,SEVERE_ERROR,83, getClassLoader());

  /**
   * An unexpected error occurred while trying to export the Directory Server configuration to LDIF:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_LDIF_WRITE_ERROR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_LDIF_WRITE_ERROR_84",CONFIG,SEVERE_ERROR,84, getClassLoader());

  /**
   * Number of worker threads that should be used to process requests, which controls the number of operations that the server may process concurrently.  The optimal value depends on the type of system on which the server is running and the workload it needs to handle, and may best be determined by performance testing.  Changes to this attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_WORK_QUEUE_DESCRIPTION_NUM_THREADS =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_WORK_QUEUE_DESCRIPTION_NUM_THREADS_85",CONFIG,INFORMATION,85, getClassLoader());

  /**
   * Maximum number of pending requests that may be held in the work queue at any one time while all worker threads are busy processing other operations.  If this limit is reached, then any new requests will be rejected.  A value of 0 indicates that there is no limit.  Changes to this attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_WORK_QUEUE_DESCRIPTION_MAX_CAPACITY =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_WORK_QUEUE_DESCRIPTION_MAX_CAPACITY_86",CONFIG,INFORMATION,86, getClassLoader());

  /**
   * An error occurred while attempting to retrieve the value of the ds-cfg-num-worker-threads attribute from the %s entry, which is used to specify the number of worker threads to service the work queue:  %s.  The Directory Server will use the default value of 24
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_WORK_QUEUE_CANNOT_DETERMINE_NUM_WORKER_THREADS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_WORK_QUEUE_CANNOT_DETERMINE_NUM_WORKER_THREADS_87",CONFIG,SEVERE_ERROR,87, getClassLoader());

  /**
   * An error occurred while attempting to retrieve the value of the ds-cfg-max-work-queue-capacity attribute from the %s entry, which is used to specify the maximum number of pending operations that may be held in the work queue:  %s.  The Directory Server will use the default value of 0
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_WORK_QUEUE_CANNOT_DETERMINE_QUEUE_CAPACITY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_WORK_QUEUE_CANNOT_DETERMINE_QUEUE_CAPACITY_88",CONFIG,SEVERE_ERROR,88, getClassLoader());

  /**
   * The value of configuration attribute ds-cfg-num-worker-threads in configuration entry %s has an invalid value (%d).  This attribute requires an integer value greater than zero
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> WARN_CONFIG_WORK_QUEUE_NUM_THREADS_INVALID_VALUE =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"SEVERE_WARN_CONFIG_WORK_QUEUE_NUM_THREADS_INVALID_VALUE_89",CONFIG,SEVERE_WARNING,89, getClassLoader());

  /**
   * The value of configuration attribute ds-cfg-max-work-queue-capacity in configuration entry %s has an invalid value (%d).  This attribute requires an integer value greater than or equal to zero
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> WARN_CONFIG_WORK_QUEUE_CAPACITY_INVALID_VALUE =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"SEVERE_WARN_CONFIG_WORK_QUEUE_CAPACITY_INVALID_VALUE_90",CONFIG,SEVERE_WARNING,90, getClassLoader());

  /**
   * %d additional worker threads have been created to bring the total number of available threads to %d
   */
  public static final MessageDescriptor.Arg2<Number,Number> INFO_CONFIG_WORK_QUEUE_CREATED_THREADS =
          new MessageDescriptor.Arg2<Number,Number>(BASE,"INFO_CONFIG_WORK_QUEUE_CREATED_THREADS_91",CONFIG,INFORMATION,91, getClassLoader());

  /**
   * %d worker threads will terminate as soon as it is convenient to do so (it may take a couple of seconds for the threads to actually exit) to bring the total number of available threads to %d
   */
  public static final MessageDescriptor.Arg2<Number,Number> INFO_CONFIG_WORK_QUEUE_DESTROYING_THREADS =
          new MessageDescriptor.Arg2<Number,Number>(BASE,"INFO_CONFIG_WORK_QUEUE_DESTROYING_THREADS_92",CONFIG,INFORMATION,92, getClassLoader());

  /**
   * The work queue capacity has been updated to use a new value of %d
   */
  public static final MessageDescriptor.Arg1<Number> INFO_CONFIG_WORK_QUEUE_NEW_CAPACITY =
          new MessageDescriptor.Arg1<Number>(BASE,"INFO_CONFIG_WORK_QUEUE_NEW_CAPACITY_93",CONFIG,INFORMATION,93, getClassLoader());

  /**
   * Worker thread "%s" has experienced too many repeated failures while attempting to retrieve the next operation from the work queue (%d failures experienced, maximum of %d failures allowed).  This worker thread will be destroyed
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,Number> ERR_CONFIG_WORK_QUEUE_TOO_MANY_FAILURES =
          new MessageDescriptor.Arg3<CharSequence,Number,Number>(BASE,"SEVERE_ERR_CONFIG_WORK_QUEUE_TOO_MANY_FAILURES_94",CONFIG,SEVERE_ERROR,94, getClassLoader());

  /**
   * A problem occurred while trying to create and start an instance of class %s to use as a monitor provider for the Directory Server work queue:  %s.  No monitor information will be available for the work queue
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_WORK_QUEUE_CANNOT_CREATE_MONITOR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_WORK_QUEUE_CANNOT_CREATE_MONITOR_95",CONFIG,SEVERE_ERROR,95, getClassLoader());

  /**
   * The name of the directory in which backend database files are stored
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_DESCRIPTION_BACKEND_DIRECTORY =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_DESCRIPTION_BACKEND_DIRECTORY_96",CONFIG,INFORMATION,96, getClassLoader());

  /**
   * Configuration entry %s does not contain a valid value for configuration attribute ds-cfg-db-directory
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_BACKEND_NO_DIRECTORY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_BACKEND_NO_DIRECTORY_97",CONFIG,SEVERE_ERROR,97, getClassLoader());

  /**
   * A null value was provided for DN configuration attribute %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_ATTR_DN_NULL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CONFIG_ATTR_DN_NULL_98",CONFIG,MILD_ERROR,98, getClassLoader());

  /**
   * An error occurred while trying to parse value "%s" of attribute %s as a DN:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_ATTR_DN_CANNOT_PARSE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_ATTR_DN_CANNOT_PARSE_99",CONFIG,MILD_ERROR,99, getClassLoader());

  /**
   * Unable to parse value %s for configuration attribute %s as a DN:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_ATTR_INVALID_DN_VALUE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_ATTR_INVALID_DN_VALUE_100",CONFIG,MILD_ERROR,100, getClassLoader());

  /**
   * Unable to parse value %s for configuration attribute %s as a DN because the element was of an invalid type (%s)
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_ATTR_DN_INVALID_TYPE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_ATTR_DN_INVALID_TYPE_101",CONFIG,MILD_ERROR,101, getClassLoader());

  /**
   * Unable to parse value for configuration attribute %s as a set of DN values because the array contained elements of an invalid type (%s)
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_ATTR_DN_INVALID_ARRAY_TYPE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_ATTR_DN_INVALID_ARRAY_TYPE_102",CONFIG,MILD_ERROR,102, getClassLoader());

  /**
   * An unexpected error occurred while trying to register the configuration handler base DN "%s" as a private suffix with the Directory Server:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_CANNOT_REGISTER_AS_PRIVATE_SUFFIX =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"FATAL_ERR_CONFIG_CANNOT_REGISTER_AS_PRIVATE_SUFFIX_103",CONFIG,FATAL_ERROR,103, getClassLoader());

  /**
   * An error occurred while trying to retrieve configuration entry cn=Backends,cn=config in order to initialize the Directory Server backends:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_BACKEND_CANNOT_GET_CONFIG_BASE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_BACKEND_CANNOT_GET_CONFIG_BASE_104",CONFIG,SEVERE_ERROR,104, getClassLoader());

  /**
   * The entry cn=Backends,cn=config does not appear to exist in the Directory Server configuration.  This is a required entry
   */
  public static final MessageDescriptor.Arg0 ERR_CONFIG_BACKEND_BASE_DOES_NOT_EXIST =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CONFIG_BACKEND_BASE_DOES_NOT_EXIST_105",CONFIG,SEVERE_ERROR,105, getClassLoader());

  /**
   * Configuration entry %s exists below the backend configuration root of cn=Backends,cn=config but does not have objectclass ds-cfg-backend that is required for a Directory Server backend.  This configuration entry will be ignored
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_CONFIG_BACKEND_ENTRY_DOES_NOT_HAVE_BACKEND_CONFIG =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_CONFIG_BACKEND_ENTRY_DOES_NOT_HAVE_BACKEND_CONFIG_106",CONFIG,SEVERE_WARNING,106, getClassLoader());

  /**
   * An unexpected error occurred while interacting with backend configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_BACKEND_ERROR_INTERACTING_WITH_BACKEND_ENTRY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_BACKEND_ERROR_INTERACTING_WITH_BACKEND_ENTRY_107",CONFIG,SEVERE_ERROR,107, getClassLoader());

  /**
   * Indicates whether this backend should be enabled for use in the Directory Server.  This may be altered while the Directory Server is online, but if a backend is disabled, then it will not be available for use
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_BACKEND_ATTR_DESCRIPTION_ENABLED =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_BACKEND_ATTR_DESCRIPTION_ENABLED_108",CONFIG,INFORMATION,108, getClassLoader());

  /**
   * Fully-qualified name of the Java class that should provide the core logic for this backend implementation.  Changes to this configuration attribute will not take effect until the backend is disabled and re-enabled or the server is restarted
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_BACKEND_ATTR_DESCRIPTION_CLASS =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_BACKEND_ATTR_DESCRIPTION_CLASS_109",CONFIG,INFORMATION,109, getClassLoader());

  /**
   * Backend configuration entry %s does not contain attribute ds-cfg-enabled, which is used to indicate whether the backend should be enabled or disabled.  Without this attribute, it will default to being disabled
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_CONFIG_BACKEND_NO_ENABLED_ATTR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_CONFIG_BACKEND_NO_ENABLED_ATTR_110",CONFIG,SEVERE_WARNING,110, getClassLoader());

  /**
   * The backend defined in configuration entry %s is marked as disabled and therefore will not be used
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CONFIG_BACKEND_DISABLED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CONFIG_BACKEND_DISABLED_111",CONFIG,INFORMATION,111, getClassLoader());

  /**
   * An unexpected error occurred while attempting to determine whether the backend associated with configuration entry %s should be enabled or disabled:  %s.  It will be disabled
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_BACKEND_UNABLE_TO_DETERMINE_ENABLED_STATE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_BACKEND_UNABLE_TO_DETERMINE_ENABLED_STATE_112",CONFIG,SEVERE_ERROR,112, getClassLoader());

  /**
   * Backend configuration entry %s does not contain attribute ds-cfg-java-class, which is used to specify the name of the class used to provide the backend implementation.  The backend associated with this configuration entry will be disabled
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_BACKEND_NO_CLASS_ATTR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_BACKEND_NO_CLASS_ATTR_113",CONFIG,SEVERE_ERROR,113, getClassLoader());

  /**
   * An unexpected error occurred while trying to determine the name of the Java class that contains the implementation for backend %s:  %s.  This backend will be disabled
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_BACKEND_CANNOT_GET_CLASS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_BACKEND_CANNOT_GET_CLASS_114",CONFIG,SEVERE_ERROR,114, getClassLoader());

  /**
   * The Directory Server was unable to load class %s and use it to create a backend instance as defined in configuration entry %s.  The error that occurred was:  %s.  This backend will be disabled
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_BACKEND_CANNOT_INSTANTIATE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_BACKEND_CANNOT_INSTANTIATE_115",CONFIG,SEVERE_ERROR,115, getClassLoader());

  /**
   * An error occurred while trying to initialize a backend loaded from class %s with the information in configuration entry %s:  %s.  This backend will be disabled
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_BACKEND_CANNOT_INITIALIZE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_BACKEND_CANNOT_INITIALIZE_116",CONFIG,SEVERE_ERROR,116, getClassLoader());

  /**
   * The class %s specified in configuration entry %s does not contain a valid Directory Server backend implementation
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_BACKEND_CLASS_NOT_BACKEND =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_BACKEND_CLASS_NOT_BACKEND_117",CONFIG,SEVERE_ERROR,117, getClassLoader());

  /**
   * The requested change to configuration entry %s would cause the class for the associated backend to change from %s to %s.  This change will not take effect until the backend is disabled and re-enabled, or until the Directory Server is restarted
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> NOTE_CONFIG_BACKEND_ACTION_REQUIRED_TO_CHANGE_CLASS =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"NOTICE_CONFIG_BACKEND_ACTION_REQUIRED_TO_CHANGE_CLASS_118",CONFIG,NOTICE,118, getClassLoader());

  /**
   * The backend defined in configuration entry %s has one or more subordinate backends.  A backend may not be removed if it has subordinate backends
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_CONFIG_BACKEND_CANNOT_REMOVE_BACKEND_WITH_SUBORDINATES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_CONFIG_BACKEND_CANNOT_REMOVE_BACKEND_WITH_SUBORDINATES_119",CONFIG,NOTICE,119, getClassLoader());

  /**
   * The maximum number of client connections that may be established to the Directory Server at any given time.  a value that is less than or equal to zero indicates that there should be no limit.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_CORE_DESCRIPTION_MAX_ALLOWED_CONNECTIONS =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_CORE_DESCRIPTION_MAX_ALLOWED_CONNECTIONS_120",CONFIG,INFORMATION,120, getClassLoader());

  /**
   * The requested change in the logger class name from %s to %s in configuration entry %s cannot be dynamically applied.  This change will not take effect until the logger is disabled and re-enabled or the Directory Server is restarted
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> INFO_CONFIG_LOGGER_CLASS_ACTION_REQUIRED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"INFO_CONFIG_LOGGER_CLASS_ACTION_REQUIRED_122",CONFIG,INFORMATION,122, getClassLoader());

  /**
   * Unable to add a new logger entry with DN %s because there is already a logger registered with that DN
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_LOGGER_EXISTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CONFIG_LOGGER_EXISTS_123",CONFIG,MILD_ERROR,123, getClassLoader());

  /**
   * An error occurred while trying to initialize an instance of class %s as an access logger as defined in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_LOGGER_ACCESS_INITIALIZATION_FAILED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_LOGGER_ACCESS_INITIALIZATION_FAILED_124",CONFIG,MILD_ERROR,124, getClassLoader());

  /**
   * An error occurred while trying to initialize an instance of class %s as an error logger as defined in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_LOGGER_ERROR_INITIALIZATION_FAILED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_LOGGER_ERROR_INITIALIZATION_FAILED_125",CONFIG,MILD_ERROR,125, getClassLoader());

  /**
   * An error occurred while trying to initialize an instance of class %s as a debug logger as defined in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_LOGGER_DEBUG_INITIALIZATION_FAILED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_LOGGER_DEBUG_INITIALIZATION_FAILED_126",CONFIG,MILD_ERROR,126, getClassLoader());

  /**
   * An error occurred while attempting to retrieve the base monitor entry cn=Monitor Providers,cn=config from the Directory Server configuration:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_MONITOR_CANNOT_GET_BASE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"FATAL_ERR_CONFIG_MONITOR_CANNOT_GET_BASE_127",CONFIG,FATAL_ERROR,127, getClassLoader());

  /**
   * The monitor configuration base cn=Monitor Providers,cn=config does not exist in the Directory Server configuration.  Only limited monitoring information will be available
   */
  public static final MessageDescriptor.Arg0 WARN_CONFIG_MONITOR_BASE_DOES_NOT_EXIST =
          new MessageDescriptor.Arg0(BASE,"SEVERE_WARN_CONFIG_MONITOR_BASE_DOES_NOT_EXIST_128",CONFIG,SEVERE_WARNING,128, getClassLoader());

  /**
   * Configuration entry %s does not contain a valid monitor provider configuration:  %s.  It will be ignored
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_MONITOR_ENTRY_UNACCEPTABLE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_MONITOR_ENTRY_UNACCEPTABLE_129",CONFIG,SEVERE_ERROR,129, getClassLoader());

  /**
   * An error occurred while attempting to create a Directory Server monitor provider from the information in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_MONITOR_CANNOT_CREATE_MONITOR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_MONITOR_CANNOT_CREATE_MONITOR_130",CONFIG,SEVERE_ERROR,130, getClassLoader());

  /**
   * Configuration entry %s does not contain the ds-cfg-monitor-provider objectclass, which is required for monitor provider definitions
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_MONITOR_INVALID_OBJECTCLASS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_MONITOR_INVALID_OBJECTCLASS_131",CONFIG,SEVERE_ERROR,131, getClassLoader());

  /**
   * The fully-qualified name of the Java class that defines the Directory Server monitor provider.  If this is altered while the associated monitor is enabled, then that monitor must be disabled and re-enabled for the change to take effect
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_MONITOR_DESCRIPTION_CLASS_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_MONITOR_DESCRIPTION_CLASS_NAME_132",CONFIG,INFORMATION,132, getClassLoader());

  /**
   * Configuration entry %s does not contain a valid value for configuration attribute ds-cfg-java-class which specifies the fully-qualified class name for the associated monitor provider
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_MONITOR_NO_CLASS_NAME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_MONITOR_NO_CLASS_NAME_133",CONFIG,SEVERE_ERROR,133, getClassLoader());

  /**
   * Configuration entry %s has an invalid value for attribute ds-cfg-java-class:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_MONITOR_INVALID_CLASS_NAME =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_MONITOR_INVALID_CLASS_NAME_134",CONFIG,SEVERE_ERROR,134, getClassLoader());

  /**
   * Class %s specified in configuration entry %s does not contain a valid monitor provider implementation:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_MONITOR_INVALID_CLASS =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_MONITOR_INVALID_CLASS_135",CONFIG,SEVERE_ERROR,135, getClassLoader());

  /**
   * Indicates whether this Directory Server monitor provider should be enabled.  Changes to this attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_MONITOR_DESCRIPTION_ENABLED =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_MONITOR_DESCRIPTION_ENABLED_136",CONFIG,INFORMATION,136, getClassLoader());

  /**
   * Configuration entry %s does not contain a valid value for configuration attribute ds-cfg-enabled which indicates whether the monitor provider should be enabled for use in the Directory Server
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_MONITOR_NO_ENABLED_ATTR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_MONITOR_NO_ENABLED_ATTR_137",CONFIG,SEVERE_ERROR,137, getClassLoader());

  /**
   * Configuration entry %s has an invalid value for attribute ds-cfg-enabled:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_MONITOR_INVALID_ENABLED_VALUE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_MONITOR_INVALID_ENABLED_VALUE_138",CONFIG,SEVERE_ERROR,138, getClassLoader());

  /**
   * The requested change in the monitor class name from %s to %s in configuration entry %s cannot be dynamically applied.  This change will not take effect until the monitor provider is disabled and re-enabled or the Directory Server is restarted
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> INFO_CONFIG_MONITOR_CLASS_ACTION_REQUIRED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"INFO_CONFIG_MONITOR_CLASS_ACTION_REQUIRED_139",CONFIG,INFORMATION,139, getClassLoader());

  /**
   * An error occurred while trying to initialize an instance of class %s as a monitor provider as defined in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_MONITOR_INITIALIZATION_FAILED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_MONITOR_INITIALIZATION_FAILED_140",CONFIG,MILD_ERROR,140, getClassLoader());

  /**
   * Unable to add a new monitor provider entry with DN %s because there is already a monitor provider registered with that DN
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_MONITOR_EXISTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CONFIG_MONITOR_EXISTS_141",CONFIG,MILD_ERROR,141, getClassLoader());

  /**
   * An error occurred while trying to retrieve configuration entry cn=Connection Handlers,cn=config in order to initialize the Directory Server backends:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_CONNHANDLER_CANNOT_GET_CONFIG_BASE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_CONNHANDLER_CANNOT_GET_CONFIG_BASE_142",CONFIG,SEVERE_ERROR,142, getClassLoader());

  /**
   * The entry cn=Connection Handlers,cn=config does not appear to exist in the Directory Server configuration.  This is a required entry
   */
  public static final MessageDescriptor.Arg0 ERR_CONFIG_CONNHANDLER_BASE_DOES_NOT_EXIST =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CONFIG_CONNHANDLER_BASE_DOES_NOT_EXIST_143",CONFIG,SEVERE_ERROR,143, getClassLoader());

  /**
   * Configuration entry %s exists below the connection handler configuration root of cn=Connection Handlers,cn=config but does not have objectclass ds-cfg-connection-handler that is required for a Directory Server connection handler.  This configuration entry will be ignored
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_CONFIG_CONNHANDLER_ENTRY_DOES_NOT_HAVE_CONNHANDLER_CONFIG =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_CONFIG_CONNHANDLER_ENTRY_DOES_NOT_HAVE_CONNHANDLER_CONFIG_144",CONFIG,SEVERE_WARNING,144, getClassLoader());

  /**
   * An unexpected error occurred while interacting with connection handler configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_CONNHANDLER_ERROR_INTERACTING_WITH_CONNHANDLER_ENTRY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_CONNHANDLER_ERROR_INTERACTING_WITH_CONNHANDLER_ENTRY_145",CONFIG,SEVERE_ERROR,145, getClassLoader());

  /**
   * Indicates whether this connection handler should be enabled for use in the Directory Server.  This may be altered while the Directory Server is online, but if a connection handler is disabled, then it will not be available for use
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_CONNHANDLER_ATTR_DESCRIPTION_ENABLED =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_CONNHANDLER_ATTR_DESCRIPTION_ENABLED_146",CONFIG,INFORMATION,146, getClassLoader());

  /**
   * Fully-qualified name of the Java class that should provide the core logic for this connection handler implementation.  Changes to this configuration attribute will not take effect until the connection handler is disabled and re-enabled or the server is restarted
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_CONNHANDLER_ATTR_DESCRIPTION_CLASS =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_CONNHANDLER_ATTR_DESCRIPTION_CLASS_147",CONFIG,INFORMATION,147, getClassLoader());

  /**
   * Connection handler configuration entry %s does not contain attribute ds-cfg-enabled, which is used to indicate whether the connection handler should be enabled or disabled.  Without this attribute, it will default to being disabled
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_CONFIG_CONNHANDLER_NO_ENABLED_ATTR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_CONFIG_CONNHANDLER_NO_ENABLED_ATTR_148",CONFIG,SEVERE_WARNING,148, getClassLoader());

  /**
   * The connection handler defined in configuration entry %s is marked as disabled and therefore will not be used
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CONFIG_CONNHANDLER_DISABLED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CONFIG_CONNHANDLER_DISABLED_149",CONFIG,INFORMATION,149, getClassLoader());

  /**
   * An unexpected error occurred while attempting to determine whether the connection handler associated with configuration entry %s should be enabled or disabled:  %s.  It will be disabled
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_CONNHANDLER_UNABLE_TO_DETERMINE_ENABLED_STATE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_CONNHANDLER_UNABLE_TO_DETERMINE_ENABLED_STATE_150",CONFIG,SEVERE_ERROR,150, getClassLoader());

  /**
   * Connection handler configuration entry %s does not contain attribute ds-cfg-java-class, which is used to specify the name of the class used to provide the connection handler implementation.  The connection handler associated with this configuration entry will be disabled
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_CONNHANDLER_NO_CLASS_ATTR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_CONNHANDLER_NO_CLASS_ATTR_151",CONFIG,SEVERE_ERROR,151, getClassLoader());

  /**
   * An unexpected error occurred while trying to determine the name of the Java class that contains the implementation for connection handler %s:  %s.  This connection handler will be disabled
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_CONNHANDLER_CANNOT_GET_CLASS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_CONNHANDLER_CANNOT_GET_CLASS_152",CONFIG,SEVERE_ERROR,152, getClassLoader());

  /**
   * The Directory Server was unable to load class %s and use it to create a connection handler instance as defined in configuration entry %s.  The error that occurred was:  %s.  This connection handler will be disabled
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_CONNHANDLER_CANNOT_INSTANTIATE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_CONNHANDLER_CANNOT_INSTANTIATE_153",CONFIG,SEVERE_ERROR,153, getClassLoader());

  /**
   * An error occurred while trying to initialize a connection handler loaded from class %s with the information in configuration entry %s:  %s.  This connection handler will be disabled
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_CONNHANDLER_CANNOT_INITIALIZE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_CONNHANDLER_CANNOT_INITIALIZE_154",CONFIG,SEVERE_ERROR,154, getClassLoader());

  /**
   * The configuration for the connection handler defined in configuration entry %s was not acceptable according to its internal validation.  However, no specific information is available regarding the problem(s) with the entry
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_CONNHANDLER_UNACCEPTABLE_CONFIG =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_CONNHANDLER_UNACCEPTABLE_CONFIG_155",CONFIG,SEVERE_ERROR,155, getClassLoader());

  /**
   * The configuration for the backend defined in configuration entry %s was not acceptable according to its internal validation.  However, no specific information is available regarding the problem(s) with the entry
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_BACKEND_UNACCEPTABLE_CONFIG =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_BACKEND_UNACCEPTABLE_CONFIG_156",CONFIG,SEVERE_ERROR,156, getClassLoader());

  /**
   * The configuration for the monitor provider defined in configuration entry %s was not acceptable according to its internal validation.  However, no specific information is available regarding the problem(s) with the entry
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_MONITOR_UNACCEPTABLE_CONFIG =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_MONITOR_UNACCEPTABLE_CONFIG_157",CONFIG,SEVERE_ERROR,157, getClassLoader());

  /**
   * The configuration for the logger defined in configuration entry %s was not acceptable according to its internal validation.  However, no specific information is available regarding the problem(s) with the entry
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_LOGGER_UNACCEPTABLE_CONFIG =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_LOGGER_UNACCEPTABLE_CONFIG_158",CONFIG,SEVERE_ERROR,158, getClassLoader());

  /**
   * The class %s specified in configuration entry %s does not contain a valid Directory Server connection handler implementation
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_CONNHANDLER_CLASS_NOT_CONNHANDLER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_CONNHANDLER_CLASS_NOT_CONNHANDLER_159",CONFIG,SEVERE_ERROR,159, getClassLoader());

  /**
   * An error occurred while trying to retrieve configuration entry cn=Matching Rules,cn=config in order to initialize the Directory Server matching rules:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_SCHEMA_CANNOT_GET_MR_BASE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_SCHEMA_CANNOT_GET_MR_BASE_160",CONFIG,SEVERE_ERROR,160, getClassLoader());

  /**
   * The entry cn=Matching Rules,cn=config does not appear to exist in the Directory Server configuration.  This is a required entry
   */
  public static final MessageDescriptor.Arg0 ERR_CONFIG_SCHEMA_MR_BASE_DOES_NOT_EXIST =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CONFIG_SCHEMA_MR_BASE_DOES_NOT_EXIST_161",CONFIG,SEVERE_ERROR,161, getClassLoader());

  /**
   * No child entries were found below the entry cn=Matching Rules,cn=config to define the matching rules for use in the Directory Server.  This is an error, because the Directory Server must have matching rules defined to function properly
   */
  public static final MessageDescriptor.Arg0 ERR_CONFIG_SCHEMA_NO_MATCHING_RULES =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CONFIG_SCHEMA_NO_MATCHING_RULES_162",CONFIG,SEVERE_ERROR,162, getClassLoader());

  /**
   * Configuration entry %s exists below the matching rule configuration root of cn=Matching Rules,cn=config but does not have objectclass ds-cfg-matching-rule that is required for a Directory Server matching rule.  This configuration entry will be ignored
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_CONFIG_SCHEMA_ENTRY_DOES_NOT_HAVE_MR_CONFIG =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_CONFIG_SCHEMA_ENTRY_DOES_NOT_HAVE_MR_CONFIG_163",CONFIG,SEVERE_WARNING,163, getClassLoader());

  /**
   * Indicates whether this matching rule should be enabled for use in the Directory Server.  This may be altered while the Directory Server is online, but if a matching rule is disabled, after it has been used for one or more attributes then matching may no longer function as expected for those attributes
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_SCHEMA_MR_ATTR_DESCRIPTION_ENABLED =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_SCHEMA_MR_ATTR_DESCRIPTION_ENABLED_164",CONFIG,INFORMATION,164, getClassLoader());

  /**
   * Fully-qualified name of the Java class that should provide the core logic for this matching rule implementation.  Changes to this configuration attribute will not take effect until the matching rule is disabled and re-enabled or the server is restarted.  Also, changes to the matching rule class for matching rules that have already been used for one or more attributes may cause unexpected results when performing matching for those attributes
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_SCHEMA_MR_ATTR_DESCRIPTION_CLASS =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_SCHEMA_MR_ATTR_DESCRIPTION_CLASS_165",CONFIG,INFORMATION,165, getClassLoader());

  /**
   * Matching rule configuration entry %s does not contain attribute ds-cfg-enabled, which is used to indicate whether the matching rule should be enabled or disabled. Without this attribute, it will default to being disabled
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_CONFIG_SCHEMA_MR_NO_ENABLED_ATTR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_CONFIG_SCHEMA_MR_NO_ENABLED_ATTR_166",CONFIG,SEVERE_WARNING,166, getClassLoader());

  /**
   * The matching rule defined in configuration entry %s is marked as disabled and therefore will not be used.  If it has been used in the past for one or more attributes, then matching may no longer function for values of those attributes
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CONFIG_SCHEMA_MR_DISABLED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CONFIG_SCHEMA_MR_DISABLED_167",CONFIG,INFORMATION,167, getClassLoader());

  /**
   * An unexpected error occurred while attempting to determine whether the matching rule associated with configuration entry %s should be enabled or disabled: %s.  It will be disabled
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_SCHEMA_MR_UNABLE_TO_DETERMINE_ENABLED_STATE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_SCHEMA_MR_UNABLE_TO_DETERMINE_ENABLED_STATE_168",CONFIG,SEVERE_ERROR,168, getClassLoader());

  /**
   * Matching rule configuration entry %s does not contain attribute ds-cfg-java-class, which is used to specify the name of the class used to provide the matching rule implementation.  The matching rule associated with this configuration entry will be disabled
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_SCHEMA_MR_NO_CLASS_ATTR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_SCHEMA_MR_NO_CLASS_ATTR_169",CONFIG,SEVERE_ERROR,169, getClassLoader());

  /**
   * An unexpected error occurred while trying to determine the name of the Java class that contains the implementation for matching rule %s:  %s.  This matching rule will be disabled
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_SCHEMA_MR_CANNOT_GET_CLASS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_SCHEMA_MR_CANNOT_GET_CLASS_170",CONFIG,SEVERE_ERROR,170, getClassLoader());

  /**
   * The Directory Server was unable to load class %s and use it to create a matching rule instance as defined in configuration entry %s.  The error that occurred was:  %s.  This matching rule will be disabled
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_SCHEMA_MR_CANNOT_INSTANTIATE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_SCHEMA_MR_CANNOT_INSTANTIATE_171",CONFIG,SEVERE_ERROR,171, getClassLoader());

  /**
   * An error occurred while trying to initialize a matching rule loaded from class %s with the information in configuration entry %s:  %s.  This matching rule will be disabled
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_SCHEMA_MR_CANNOT_INITIALIZE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_SCHEMA_MR_CANNOT_INITIALIZE_172",CONFIG,SEVERE_ERROR,172, getClassLoader());

  /**
   * The matching rule defined in configuration entry %s conflicts with another matching rule defined in the server configuration:  %s.  This matching rule will not be used
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_CONFIG_SCHEMA_MR_CONFLICTING_MR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_CONFIG_SCHEMA_MR_CONFLICTING_MR_173",CONFIG,SEVERE_WARNING,173, getClassLoader());

  /**
   * An error occurred while trying to retrieve configuration entry cn=Syntaxes,cn=config in order to initialize the Directory Server attribute syntaxes:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_SCHEMA_CANNOT_GET_SYNTAX_BASE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_SCHEMA_CANNOT_GET_SYNTAX_BASE_174",CONFIG,SEVERE_ERROR,174, getClassLoader());

  /**
   * The entry cn=Syntaxes,cn=config does not appear to exist in the Directory Server configuration.  This is a required entry
   */
  public static final MessageDescriptor.Arg0 ERR_CONFIG_SCHEMA_SYNTAX_BASE_DOES_NOT_EXIST =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CONFIG_SCHEMA_SYNTAX_BASE_DOES_NOT_EXIST_175",CONFIG,SEVERE_ERROR,175, getClassLoader());

  /**
   * No child entries were found below the entry cn=Syntaxes,cn=config to define the attribute syntaxes for use in the Directory Server.  This is an error, because the Directory Server must have syntaxes defined to function properly
   */
  public static final MessageDescriptor.Arg0 ERR_CONFIG_SCHEMA_NO_SYNTAXES =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CONFIG_SCHEMA_NO_SYNTAXES_176",CONFIG,SEVERE_ERROR,176, getClassLoader());

  /**
   * Configuration entry %s exists below the attribute syntax configuration root of cn=Syntaxes,cn=config but does not have objectclass ds-cfg-attribute-syntax that is required for a Directory Server attribute syntax.  This configuration entry will be ignored
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_CONFIG_SCHEMA_ENTRY_DOES_NOT_HAVE_SYNTAX_CONFIG =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_CONFIG_SCHEMA_ENTRY_DOES_NOT_HAVE_SYNTAX_CONFIG_177",CONFIG,SEVERE_WARNING,177, getClassLoader());

  /**
   * Indicates whether this attribute syntax should be enabled for use in the Directory Server.  This may be altered while the Directory Server is online, but if a syntax is disabled, after it has been used for one or more attributes then matching may no longer function as expected for those attributes
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_SCHEMA_SYNTAX_ATTR_DESCRIPTION_ENABLED =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_SCHEMA_SYNTAX_ATTR_DESCRIPTION_ENABLED_178",CONFIG,INFORMATION,178, getClassLoader());

  /**
   * Fully-qualified name of the Java class that should provide the core logic for this attribute syntax implementation.  Changes to this configuration attribute will not take effect until the syntax is disabled and re-enabled or the server is restarted.  Also, changes to the syntax class for attribute syntaxes that have already been used for one or more attributes may cause unexpected results when performing matching for those attributes
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_SCHEMA_SYNTAX_ATTR_DESCRIPTION_CLASS =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_SCHEMA_SYNTAX_ATTR_DESCRIPTION_CLASS_179",CONFIG,INFORMATION,179, getClassLoader());

  /**
   * Attribute syntax configuration entry %s does not contain attribute ds-cfg-enabled, which is used to indicate whether the syntax should be enabled or disabled. Without this attribute, it will default to being disabled
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_CONFIG_SCHEMA_SYNTAX_NO_ENABLED_ATTR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_CONFIG_SCHEMA_SYNTAX_NO_ENABLED_ATTR_180",CONFIG,SEVERE_WARNING,180, getClassLoader());

  /**
   * The attribute syntax defined in configuration entry %s is marked as disabled and therefore will not be used. If it has been used in the past for one or more attributes, then matching may no longer function for values of those attributes
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CONFIG_SCHEMA_SYNTAX_DISABLED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CONFIG_SCHEMA_SYNTAX_DISABLED_181",CONFIG,INFORMATION,181, getClassLoader());

  /**
   * An unexpected error occurred while attempting to determine whether the attribute syntax associated with configuration entry %s should be enabled or disabled: %s.  It will be disabled
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_SCHEMA_SYNTAX_UNABLE_TO_DETERMINE_ENABLED_STATE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_SCHEMA_SYNTAX_UNABLE_TO_DETERMINE_ENABLED_STATE_182",CONFIG,SEVERE_ERROR,182, getClassLoader());

  /**
   * Matching rule configuration entry %s does not contain attribute ds-cfg-java-class, which is used to specify the name of the class that provides the attribute syntax implementation.  The syntax associated with this configuration entry will be disabled
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_SCHEMA_SYNTAX_NO_CLASS_ATTR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_SCHEMA_SYNTAX_NO_CLASS_ATTR_183",CONFIG,SEVERE_ERROR,183, getClassLoader());

  /**
   * An unexpected error occurred while trying to determine the name of the Java class that contains the implementation for attribute syntax %s:  %s.  This syntax will be disabled
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_SCHEMA_SYNTAX_CANNOT_GET_CLASS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_SCHEMA_SYNTAX_CANNOT_GET_CLASS_184",CONFIG,SEVERE_ERROR,184, getClassLoader());

  /**
   * The Directory Server was unable to load class %s and use it to create an attribute syntax instance as defined in configuration entry %s.  The error that occurred was:  %s. This syntax will be disabled
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_SCHEMA_SYNTAX_CANNOT_INSTANTIATE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_SCHEMA_SYNTAX_CANNOT_INSTANTIATE_185",CONFIG,SEVERE_ERROR,185, getClassLoader());

  /**
   * An error occurred while trying to initialize an attribute syntax loaded from class %s with the information in configuration entry %s:  %s.  This syntax will be disabled
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_SCHEMA_SYNTAX_CANNOT_INITIALIZE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_SCHEMA_SYNTAX_CANNOT_INITIALIZE_186",CONFIG,SEVERE_ERROR,186, getClassLoader());

  /**
   * The attribute syntax defined in configuration entry %s conflicts with another syntax defined in the server configuration:  %s.  This attribute syntax will not be used
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_CONFIG_SCHEMA_SYNTAX_CONFLICTING_SYNTAX =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_CONFIG_SCHEMA_SYNTAX_CONFLICTING_SYNTAX_187",CONFIG,SEVERE_WARNING,187, getClassLoader());

  /**
   * Unable to read the Directory Server schema definitions because the schema directory %s does not exist
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_SCHEMA_NO_SCHEMA_DIR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_SCHEMA_NO_SCHEMA_DIR_188",CONFIG,SEVERE_ERROR,188, getClassLoader());

  /**
   * Unable to read the Directory Server schema definitions because the schema directory %s exists but is not a directory
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_SCHEMA_DIR_NOT_DIRECTORY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_SCHEMA_DIR_NOT_DIRECTORY_189",CONFIG,SEVERE_ERROR,189, getClassLoader());

  /**
   * Unable to read the Directory Server schema definitions from directory %s or %s because an unexpected error occurred while trying to list the files in that directory:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_SCHEMA_CANNOT_LIST_FILES =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_SCHEMA_CANNOT_LIST_FILES_190",CONFIG,SEVERE_ERROR,190, getClassLoader());

  /**
   * Schema configuration file %s in directory %s cannot be parsed because an unexpected error occurred while trying to open the file for reading:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> WARN_CONFIG_SCHEMA_CANNOT_OPEN_FILE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_WARN_CONFIG_SCHEMA_CANNOT_OPEN_FILE_191",CONFIG,SEVERE_WARNING,191, getClassLoader());

  /**
   * Schema configuration file %s in directory %s cannot be parsed because an unexpected error occurred while trying to read its contents as an LDIF entry:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> WARN_CONFIG_SCHEMA_CANNOT_READ_LDIF_ENTRY =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_WARN_CONFIG_SCHEMA_CANNOT_READ_LDIF_ENTRY_192",CONFIG,SEVERE_WARNING,192, getClassLoader());

  /**
   * Unable to parse an attribute type definition from schema configuration file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_CONFIG_SCHEMA_CANNOT_PARSE_ATTR_TYPE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_CONFIG_SCHEMA_CANNOT_PARSE_ATTR_TYPE_193",CONFIG,SEVERE_WARNING,193, getClassLoader());

  /**
   * An attribute type read from schema configuration file %s conflicts with another attribute type already read into the schema:  %s.  The later attribute type definition will be used
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_CONFIG_SCHEMA_CONFLICTING_ATTR_TYPE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_CONFIG_SCHEMA_CONFLICTING_ATTR_TYPE_194",CONFIG,SEVERE_WARNING,194, getClassLoader());

  /**
   * An objectclass read from schema configuration file %s conflicts with another objectclass already read into the schema:  %s.  The later objectclass definition will be used
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_CONFIG_SCHEMA_CONFLICTING_OC =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_CONFIG_SCHEMA_CONFLICTING_OC_195",CONFIG,SEVERE_WARNING,195, getClassLoader());

  /**
   * An objectclass read from schema configuration file %s could not be parsed:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_CONFIG_SCHEMA_CANNOT_PARSE_OC =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_CONFIG_SCHEMA_CANNOT_PARSE_OC_196",CONFIG,SEVERE_WARNING,196, getClassLoader());

  /**
   * Configuration entry %s has an invalid value for configuration attribute ds-cfg-single-structural-objectclass-behavior (it should be one of "accept", "reject", or "warn" ):  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_CORE_INVALID_STRUCTURAL_CLASS_BEHAVIOR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_CORE_INVALID_STRUCTURAL_CLASS_BEHAVIOR_197",CONFIG,SEVERE_ERROR,197, getClassLoader());

  /**
   * Indicates whether the Directory Server should perform schema checking for update operations to ensure that entries are valid according to the server's schema configuration (e.g., all required attributes are included and no prohibited attributes are present). Disabling schema checking is generally not recommended because it may allow invalid entries to be included in the server.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_CORE_DESCRIPTION_CHECK_SCHEMA =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_CORE_DESCRIPTION_CHECK_SCHEMA_198",CONFIG,INFORMATION,198, getClassLoader());

  /**
   * Configuration entry %s has an invalid value for configuration attribute ds-cfg-check-schema (it should be a Boolean value of true or false):  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_CORE_INVALID_CHECK_SCHEMA =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_CORE_INVALID_CHECK_SCHEMA_199",CONFIG,SEVERE_ERROR,199, getClassLoader());

  /**
   * An unexpected error occurred that prevented the server from installing its default entry cache framework:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_ENTRYCACHE_CANNOT_INSTALL_DEFAULT_CACHE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_ENTRYCACHE_CANNOT_INSTALL_DEFAULT_CACHE_200",CONFIG,SEVERE_ERROR,200, getClassLoader());

  /**
   * The entry cache configuration entry "cn=Entry Caches,cn=config" does not exist in the Directory Server configuration.  No entry cache will be available until this entry is created with a valid entry cache configuration
   */
  public static final MessageDescriptor.Arg0 WARN_CONFIG_ENTRYCACHE_NO_CONFIG_ENTRY =
          new MessageDescriptor.Arg0(BASE,"SEVERE_WARN_CONFIG_ENTRYCACHE_NO_CONFIG_ENTRY_201",CONFIG,SEVERE_WARNING,201, getClassLoader());

  /**
   * An error occurred while attempting to initialize an instance of class %s for use as the Directory Server entry cache:  %s.  As a result, the entry cache will be disabled
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_ENTRYCACHE_CANNOT_INITIALIZE_CACHE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_ENTRYCACHE_CANNOT_INITIALIZE_CACHE_202",CONFIG,SEVERE_ERROR,202, getClassLoader());

  /**
   * The configuration for the entry cache defined in configuration entry %s was not acceptable:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_ENTRYCACHE_CONFIG_NOT_ACCEPTABLE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_ENTRYCACHE_CONFIG_NOT_ACCEPTABLE_203",CONFIG,SEVERE_ERROR,203, getClassLoader());

  /**
   * The configuration for the entry cache defined in configuration entry %s was not acceptable:  the entry cache level %d is already in use
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_CONFIG_ENTRYCACHE_CONFIG_LEVEL_NOT_ACCEPTABLE =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"SEVERE_ERR_CONFIG_ENTRYCACHE_CONFIG_LEVEL_NOT_ACCEPTABLE_204",CONFIG,SEVERE_ERROR,204, getClassLoader());

  /**
   * The configuration for the entry cache %s monitor provider was not available. As a result this monitor provider %s will not be enabled
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_WARN_CONFIG_ENTRYCACHE_NO_MONITOR_CONFIG_ENTRY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_WARN_CONFIG_ENTRYCACHE_NO_MONITOR_CONFIG_ENTRY_205",CONFIG,INFORMATION,205, getClassLoader());

  /**
   * The configuration for the entry cache %s monitor provider was disabled. As a result the monitor provider %s will not be enabled
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_WARN_CONFIG_ENTRYCACHE_MONITOR_CONFIG_DISABLED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_WARN_CONFIG_ENTRYCACHE_MONITOR_CONFIG_DISABLED_206",CONFIG,INFORMATION,206, getClassLoader());

  /**
   * An unexpected error occurred while attempting to remove entry %s as a child of configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_ENTRY_CANNOT_REMOVE_CHILD =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_ENTRY_CANNOT_REMOVE_CHILD_215",CONFIG,MILD_ERROR,215, getClassLoader());

  /**
   * Unable to parse a name form definition from schema configuration file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_CONFIG_SCHEMA_CANNOT_PARSE_NAME_FORM =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_CONFIG_SCHEMA_CANNOT_PARSE_NAME_FORM_216",CONFIG,SEVERE_WARNING,216, getClassLoader());

  /**
   * A name form read from schema configuration file %s conflicts with another name form already read into the schema:  %s.  The later name form definition will be used
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_CONFIG_SCHEMA_CONFLICTING_NAME_FORM =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_CONFIG_SCHEMA_CONFLICTING_NAME_FORM_217",CONFIG,SEVERE_WARNING,217, getClassLoader());

  /**
   * Unable to parse a DIT content rule definition from schema configuration file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_CONFIG_SCHEMA_CANNOT_PARSE_DCR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_CONFIG_SCHEMA_CANNOT_PARSE_DCR_218",CONFIG,SEVERE_WARNING,218, getClassLoader());

  /**
   * A DIT content rule read from schema configuration file %s conflicts with another DIT content rule already read into the schema:  %s.  The later DIT content rule definition will be used
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_CONFIG_SCHEMA_CONFLICTING_DCR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_CONFIG_SCHEMA_CONFLICTING_DCR_219",CONFIG,SEVERE_WARNING,219, getClassLoader());

  /**
   * Unable to parse a DIT structure rule definition from schema configuration file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_CONFIG_SCHEMA_CANNOT_PARSE_DSR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_CONFIG_SCHEMA_CANNOT_PARSE_DSR_220",CONFIG,SEVERE_WARNING,220, getClassLoader());

  /**
   * A DIT structure rule read from schema configuration file %s conflicts with another DIT structure rule already read into the schema:  %s.  The later DIT structure rule definition will be used
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_CONFIG_SCHEMA_CONFLICTING_DSR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_CONFIG_SCHEMA_CONFLICTING_DSR_221",CONFIG,SEVERE_WARNING,221, getClassLoader());

  /**
   * Unable to parse a matching rule use definition from schema configuration file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_CONFIG_SCHEMA_CANNOT_PARSE_MRU =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_CONFIG_SCHEMA_CANNOT_PARSE_MRU_222",CONFIG,SEVERE_WARNING,222, getClassLoader());

  /**
   * A matching rule use read from schema configuration file %s conflicts with another matching rule use already read into the schema:  %s.  The later matching rule use definition will be used
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_CONFIG_SCHEMA_CONFLICTING_MRU =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_CONFIG_SCHEMA_CONFLICTING_MRU_223",CONFIG,SEVERE_WARNING,223, getClassLoader());

  /**
   * No file rotation policy has been defined in configuration entry %s. No log rotation will take place
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_CONFIG_LOGGER_NO_ROTATION_POLICY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_CONFIG_LOGGER_NO_ROTATION_POLICY_224",CONFIG,SEVERE_WARNING,224, getClassLoader());

  /**
   * No size limit has been defined for the size based file rotation policy in the configuration entry %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_LOGGER_NO_SIZE_LIMIT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_LOGGER_NO_SIZE_LIMIT_225",CONFIG,SEVERE_ERROR,225, getClassLoader());

  /**
   * No time limit has been defined for the time based file rotation policy in the configuration entry %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_LOGGER_NO_TIME_LIMIT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_LOGGER_NO_TIME_LIMIT_226",CONFIG,SEVERE_ERROR,226, getClassLoader());

  /**
   * An invalid file rotation policy %s has been defined in configuration entry %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_LOGGER_INVALID_ROTATION_POLICY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_LOGGER_INVALID_ROTATION_POLICY_227",CONFIG,SEVERE_ERROR,227, getClassLoader());

  /**
   * Configuration attribute %s is read-only and its values may not be altered
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_ATTR_READ_ONLY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CONFIG_ATTR_READ_ONLY_228",CONFIG,MILD_ERROR,228, getClassLoader());

  /**
   * An error occurred while trying to retrieve configuration entry cn=Plugins,cn=config in order to initialize the Directory Server plugins:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_PLUGIN_CANNOT_GET_CONFIG_BASE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_PLUGIN_CANNOT_GET_CONFIG_BASE_229",CONFIG,SEVERE_ERROR,229, getClassLoader());

  /**
   * The entry cn=Plugins,cn=config does not appear to exist in the Directory Server configuration.  This is a required entry
   */
  public static final MessageDescriptor.Arg0 ERR_CONFIG_PLUGIN_BASE_DOES_NOT_EXIST =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CONFIG_PLUGIN_BASE_DOES_NOT_EXIST_230",CONFIG,SEVERE_ERROR,230, getClassLoader());

  /**
   * Configuration entry %s exists below the plugin configuration root of cn=Plugins,cn=config but does not have objectclass ds-cfg-backend that is required for a Directory Server plugin.  This configuration entry will be ignored
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_CONFIG_PLUGIN_ENTRY_DOES_NOT_HAVE_PLUGIN_CONFIG =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_CONFIG_PLUGIN_ENTRY_DOES_NOT_HAVE_PLUGIN_CONFIG_231",CONFIG,SEVERE_WARNING,231, getClassLoader());

  /**
   * An unexpected error occurred while interacting with backend configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_PLUGIN_ERROR_INTERACTING_WITH_PLUGIN_ENTRY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_PLUGIN_ERROR_INTERACTING_WITH_PLUGIN_ENTRY_232",CONFIG,SEVERE_ERROR,232, getClassLoader());

  /**
   * Indicates whether this plugin should be enabled for use in the Directory Server.  This may be altered while the Directory Server is online, and will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_PLUGIN_ATTR_DESCRIPTION_ENABLED =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_PLUGIN_ATTR_DESCRIPTION_ENABLED_233",CONFIG,INFORMATION,233, getClassLoader());

  /**
   * Plugin configuration entry %s does not contain attribute ds-cfg-enabled, which is used to indicate whether the plugin should be enabled or disabled.  Without this attribute, it will default to being disabled
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_CONFIG_PLUGIN_NO_ENABLED_ATTR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_CONFIG_PLUGIN_NO_ENABLED_ATTR_234",CONFIG,SEVERE_WARNING,234, getClassLoader());

  /**
   * The plugin defined in configuration entry %s is marked as disabled and therefore will not be used
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CONFIG_PLUGIN_DISABLED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CONFIG_PLUGIN_DISABLED_235",CONFIG,INFORMATION,235, getClassLoader());

  /**
   * An unexpected error occurred while attempting to determine whether the plugin associated with configuration entry %s should be enabled or disabled:  %s.  It will be disabled
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_PLUGIN_UNABLE_TO_DETERMINE_ENABLED_STATE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_PLUGIN_UNABLE_TO_DETERMINE_ENABLED_STATE_236",CONFIG,SEVERE_ERROR,236, getClassLoader());

  /**
   * Plugin type(s) for this plugin, which control the times when this plugin will be invoked during processing.  This value is only read when the plugin is loaded and initialized, so changes to this attribute will not take effect until the plugin is disabled and re-enabled, or until the server is restarted
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_PLUGIN_ATTR_DESCRIPTION_PLUGIN_TYPE =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_PLUGIN_ATTR_DESCRIPTION_PLUGIN_TYPE_237",CONFIG,INFORMATION,237, getClassLoader());

  /**
   * Fully-qualified name of the Java class that should provide the core logic for this plugin implementation.  Changes to this configuration attribute will not take effect until the plugin is disabled and re-enabled or the server is restarted
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_PLUGIN_ATTR_DESCRIPTION_CLASS =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_PLUGIN_ATTR_DESCRIPTION_CLASS_238",CONFIG,INFORMATION,238, getClassLoader());

  /**
   * Plugin configuration entry %s does not contain attribute ds-cfg-plugin-type, which is used to specify the name(s) of the plugin type(s) for the plugin.  This is a required attribute, so this plugin will be disabled
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_PLUGIN_NO_PLUGIN_TYPES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_PLUGIN_NO_PLUGIN_TYPES_239",CONFIG,SEVERE_ERROR,239, getClassLoader());

  /**
   * Plugin configuration entry %s has an invalid value %s for attribute ds-cfg-plugin-type that does not name a valid plugin type.  This plugin will be disabled
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_PLUGIN_INVALID_PLUGIN_TYPE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_PLUGIN_INVALID_PLUGIN_TYPE_240",CONFIG,SEVERE_ERROR,240, getClassLoader());

  /**
   * An unexpected error occurred while trying to determine the set of plugin types for the plugin defined in configuration entry %s:  %s.  This plugin will be disabled
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_PLUGIN_CANNOT_GET_PLUGIN_TYPES =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_PLUGIN_CANNOT_GET_PLUGIN_TYPES_241",CONFIG,SEVERE_ERROR,241, getClassLoader());

  /**
   * Plugin configuration entry %s does not contain attribute ds-cfg-java-class, which is used to specify the name of the class used to provide the plugin implementation.  The plugin associated with this configuration entry will be disabled
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_PLUGIN_NO_CLASS_ATTR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_PLUGIN_NO_CLASS_ATTR_242",CONFIG,SEVERE_ERROR,242, getClassLoader());

  /**
   * An unexpected error occurred while trying to determine the name of the Java class that contains the implementation for plugin %s:  %s.  This plugin will be disabled
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_PLUGIN_CANNOT_GET_CLASS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_PLUGIN_CANNOT_GET_CLASS_243",CONFIG,SEVERE_ERROR,243, getClassLoader());

  /**
   * The Directory Server was unable to load class %s and use it to create a plugin instance as defined in configuration entry %s.  The error that occurred was:  %s.  This plugin will be disabled
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_PLUGIN_CANNOT_INSTANTIATE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_PLUGIN_CANNOT_INSTANTIATE_244",CONFIG,SEVERE_ERROR,244, getClassLoader());

  /**
   * An error occurred while attempting to initialize an instance of class %s as a Directory Server plugin using the information in configuration entry %s:  %s.  This plugin will be disabled
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_PLUGIN_CANNOT_INITIALIZE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_PLUGIN_CANNOT_INITIALIZE_245",CONFIG,SEVERE_ERROR,245, getClassLoader());

  /**
   * Indicates whether the Directory Server should send a response to operations that have been abandoned to the client to know that the server has completed processing on them.  The LDAP specification prohibits sending a response in such cases, but some clients may not behave properly if they are waiting on a response for an operation when there will not be one because it has been abandoned. Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_CORE_DESCRIPTION_NOTIFY_ABANDONED_OPERATIONS =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_CORE_DESCRIPTION_NOTIFY_ABANDONED_OPERATIONS_246",CONFIG,INFORMATION,246, getClassLoader());

  /**
   * Configuration entry %s has an invalid value for configuration attribute ds-cfg-notify-abandoned-operations (it should be a Boolean value of true or false):  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_CORE_INVALID_NOTIFY_ABANDONED_OPERATIONS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_CORE_INVALID_NOTIFY_ABANDONED_OPERATIONS_247",CONFIG,SEVERE_ERROR,247, getClassLoader());

  /**
   * Class %s specified in configuration entry %s does not contain a valid extended operation handler implementation: %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_EXTOP_INVALID_CLASS =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_EXTOP_INVALID_CLASS_256",CONFIG,SEVERE_ERROR,256, getClassLoader());

  /**
   * An error occurred while trying to initialize an instance of class %s as an extended operation handler as defined in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_EXTOP_INITIALIZATION_FAILED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_EXTOP_INITIALIZATION_FAILED_261",CONFIG,MILD_ERROR,261, getClassLoader());

  /**
   * An error occurred while attempting to retrieve the SASL mechanism handler base entry cn=SASL Mechanisms,cn=config from the Directory Server configuration:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_SASL_CANNOT_GET_BASE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"FATAL_ERR_CONFIG_SASL_CANNOT_GET_BASE_264",CONFIG,FATAL_ERROR,264, getClassLoader());

  /**
   * The SASL mechanism configuration base cn=SASL Mechanisms,cn=config does not exist in the Directory Server configuration.  This entry must be present for the server to function properly
   */
  public static final MessageDescriptor.Arg0 WARN_CONFIG_SASL_BASE_DOES_NOT_EXIST =
          new MessageDescriptor.Arg0(BASE,"SEVERE_WARN_CONFIG_SASL_BASE_DOES_NOT_EXIST_265",CONFIG,SEVERE_WARNING,265, getClassLoader());

  /**
   * Configuration entry %s does not contain a valid SASL mechanism handler configuration:  %s.  It will be ignored
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_SASL_ENTRY_UNACCEPTABLE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_SASL_ENTRY_UNACCEPTABLE_266",CONFIG,SEVERE_ERROR,266, getClassLoader());

  /**
   * An error occurred while attempting to create a Directory Server SASL mechanism handler from the information in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_SASL_CANNOT_CREATE_HANDLER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_SASL_CANNOT_CREATE_HANDLER_267",CONFIG,SEVERE_ERROR,267, getClassLoader());

  /**
   * Configuration entry %s does not contain the ds-cfg-sasl-mechanism-handler objectclass, which is required for SASL mechanism handler definitions
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_SASL_INVALID_OBJECTCLASS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_SASL_INVALID_OBJECTCLASS_268",CONFIG,SEVERE_ERROR,268, getClassLoader());

  /**
   * The fully-qualified name of the Java class that defines the Directory Server SASL mechanism handler.  If this is altered while the associated handler is enabled, then that handler must be disabled and re-enabled for the change to take effect
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_SASL_DESCRIPTION_CLASS_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_SASL_DESCRIPTION_CLASS_NAME_269",CONFIG,INFORMATION,269, getClassLoader());

  /**
   * Configuration entry %s does not contain a valid value for configuration attribute ds-cfg-java-class which specifies the fully-qualified class name for the associated SASL mechanism handler
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_SASL_NO_CLASS_NAME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_SASL_NO_CLASS_NAME_270",CONFIG,SEVERE_ERROR,270, getClassLoader());

  /**
   * Configuration entry %s has an invalid value for attribute ds-cfg-java-class:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_SASL_INVALID_CLASS_NAME =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_SASL_INVALID_CLASS_NAME_271",CONFIG,SEVERE_ERROR,271, getClassLoader());

  /**
   * Class %s specified in configuration entry %s does not contain a valid SASL mechanism handler implementation:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_SASL_INVALID_CLASS =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_SASL_INVALID_CLASS_272",CONFIG,SEVERE_ERROR,272, getClassLoader());

  /**
   * Indicates whether this Directory Server SASL mechanism handler should be enabled.  Changes to this attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_SASL_DESCRIPTION_ENABLED =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_SASL_DESCRIPTION_ENABLED_273",CONFIG,INFORMATION,273, getClassLoader());

  /**
   * Configuration entry %s does not contain a valid value for configuration attribute ds-cfg-enabled which indicates whether the SASL mechanism handler should be enabled for use in the Directory Server
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_SASL_NO_ENABLED_ATTR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_SASL_NO_ENABLED_ATTR_274",CONFIG,SEVERE_ERROR,274, getClassLoader());

  /**
   * Configuration entry %s has an invalid value for attribute ds-cfg-enabled:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_SASL_INVALID_ENABLED_VALUE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_SASL_INVALID_ENABLED_VALUE_275",CONFIG,SEVERE_ERROR,275, getClassLoader());

  /**
   * The requested change in the SASL mechanism handler class name from %s to %s in configuration entry %s cannot be dynamically applied.  This change will not take effect until the handler is disabled and re-enabled or the Directory Server is restarted
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> INFO_CONFIG_SASL_CLASS_ACTION_REQUIRED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"INFO_CONFIG_SASL_CLASS_ACTION_REQUIRED_276",CONFIG,INFORMATION,276, getClassLoader());

  /**
   * An error occurred while trying to initialize an instance of class %s as a SASL mechanism handler as defined in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_SASL_INITIALIZATION_FAILED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_SASL_INITIALIZATION_FAILED_277",CONFIG,MILD_ERROR,277, getClassLoader());

  /**
   * Unable to add a new SASL mechanism handler entry with DN %s because there is already a handler registered with that DN
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_SASL_EXISTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CONFIG_SASL_EXISTS_278",CONFIG,MILD_ERROR,278, getClassLoader());

  /**
   * The configuration for the SASL mechanism handler defined in configuration entry %s was not acceptable according to its internal validation.  However, no specific information is available regarding the problem(s) with the entry
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_SASL_UNACCEPTABLE_CONFIG =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_SASL_UNACCEPTABLE_CONFIG_279",CONFIG,SEVERE_ERROR,279, getClassLoader());

  /**
   * Entry %s cannot be added to the Directory Server configuration because another configuration entry already exists with that DN
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_FILE_ADD_ALREADY_EXISTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CONFIG_FILE_ADD_ALREADY_EXISTS_280",CONFIG,MILD_ERROR,280, getClassLoader());

  /**
   * Entry %s cannot be added to the Directory Server configuration because that DN does not have a parent
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_FILE_ADD_NO_PARENT_DN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CONFIG_FILE_ADD_NO_PARENT_DN_281",CONFIG,MILD_ERROR,281, getClassLoader());

  /**
   * Entry %s cannot be added to the Directory Server configuration because its parent entry %s does not exist
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_FILE_ADD_NO_PARENT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_FILE_ADD_NO_PARENT_282",CONFIG,MILD_ERROR,282, getClassLoader());

  /**
   * The Directory Server is unwilling to add configuration entry %s because one of the add listeners registered with the parent entry %s rejected this change with the message: %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_FILE_ADD_REJECTED_BY_LISTENER =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_FILE_ADD_REJECTED_BY_LISTENER_283",CONFIG,MILD_ERROR,283, getClassLoader());

  /**
   * An unexpected error occurred while attempting to add configuration entry %s as a child of entry %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_FILE_ADD_FAILED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_FILE_ADD_FAILED_284",CONFIG,MILD_ERROR,284, getClassLoader());

  /**
   * Entry %s cannot be removed from the Directory Server configuration because the specified entry does not exist
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_FILE_DELETE_NO_SUCH_ENTRY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CONFIG_FILE_DELETE_NO_SUCH_ENTRY_285",CONFIG,MILD_ERROR,285, getClassLoader());

  /**
   * Entry %s cannot be removed from the Directory Server configuration because the specified entry has one or more subordinate entries
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_FILE_DELETE_HAS_CHILDREN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CONFIG_FILE_DELETE_HAS_CHILDREN_286",CONFIG,MILD_ERROR,286, getClassLoader());

  /**
   * Entry %s cannot be removed from the Directory Server configuration because the entry does not have a parent and removing the configuration root entry is not allowed
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_FILE_DELETE_NO_PARENT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CONFIG_FILE_DELETE_NO_PARENT_287",CONFIG,MILD_ERROR,287, getClassLoader());

  /**
   * Entry %s cannot be removed from the Directory Server configuration because one of the delete listeners registered with the parent entry %s rejected this change with the message:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_FILE_DELETE_REJECTED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_FILE_DELETE_REJECTED_288",CONFIG,MILD_ERROR,288, getClassLoader());

  /**
   * An unexpected error occurred while attempting to remove configuration entry %s as a child of entry %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_FILE_DELETE_FAILED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_FILE_DELETE_FAILED_289",CONFIG,MILD_ERROR,289, getClassLoader());

  /**
   * Entry %s cannot be modified because the specified entry does not exist
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_FILE_MODIFY_NO_SUCH_ENTRY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CONFIG_FILE_MODIFY_NO_SUCH_ENTRY_290",CONFIG,MILD_ERROR,290, getClassLoader());

  /**
   * Entry %s cannot be modified because one of the configuration change listeners registered for that entry rejected the change:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_FILE_MODIFY_REJECTED_BY_CHANGE_LISTENER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_FILE_MODIFY_REJECTED_BY_CHANGE_LISTENER_291",CONFIG,MILD_ERROR,291, getClassLoader());

  /**
   * Entry %s cannot be modified because one of the configurable components registered for that entry rejected the change:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_FILE_MODIFY_REJECTED_BY_COMPONENT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_FILE_MODIFY_REJECTED_BY_COMPONENT_292",CONFIG,MILD_ERROR,292, getClassLoader());

  /**
   * The search operation cannot be processed because base entry %s does not exist
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_FILE_SEARCH_NO_SUCH_BASE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CONFIG_FILE_SEARCH_NO_SUCH_BASE_293",CONFIG,MILD_ERROR,293, getClassLoader());

  /**
   * The search operation cannot be processed because the specified search scope %s is invalid
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_FILE_SEARCH_INVALID_SCOPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CONFIG_FILE_SEARCH_INVALID_SCOPE_294",CONFIG,MILD_ERROR,294, getClassLoader());

  /**
   * An error occurred while attempting to create a temporary file %s to hold the archived versions of previous Directory Server configurations as a result of a configuration change:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_FILE_WRITE_CANNOT_CREATE_TEMP_ARCHIVE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_FILE_WRITE_CANNOT_CREATE_TEMP_ARCHIVE_295",CONFIG,MILD_ERROR,295, getClassLoader());

  /**
   * An error occurred while attempting to copy the archived configurations from %s to temporary file %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_FILE_WRITE_CANNOT_COPY_EXISTING_ARCHIVE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_FILE_WRITE_CANNOT_COPY_EXISTING_ARCHIVE_296",CONFIG,MILD_ERROR,296, getClassLoader());

  /**
   * An error occurred while attempting to update the archived configurations in file %s to include the running configuration from file %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_FILE_WRITE_CANNOT_COPY_CURRENT_CONFIG =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_FILE_WRITE_CANNOT_COPY_CURRENT_CONFIG_297",CONFIG,MILD_ERROR,297, getClassLoader());

  /**
   * The attempt to rename the archived configuration data from %s to %s failed, but the underlying reason for the failure could not be determined
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_FILE_WRITE_CANNOT_RENAME_TEMP_ARCHIVE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_FILE_WRITE_CANNOT_RENAME_TEMP_ARCHIVE_298",CONFIG,MILD_ERROR,298, getClassLoader());

  /**
   * The updated archive containing previous Directory Server configurations could not be renamed from %s to %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_FILE_WRITE_CANNOT_REPLACE_ARCHIVE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_FILE_WRITE_CANNOT_REPLACE_ARCHIVE_299",CONFIG,MILD_ERROR,299, getClassLoader());

  /**
   * An error occurred while attempting to export the new Directory Server configuration to file %s: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_FILE_WRITE_CANNOT_EXPORT_NEW_CONFIG =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_FILE_WRITE_CANNOT_EXPORT_NEW_CONFIG_300",CONFIG,MILD_ERROR,300, getClassLoader());

  /**
   * An error occurred while attempting to rename the new Directory Server configuration from file %s to %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_FILE_WRITE_CANNOT_RENAME_NEW_CONFIG =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_FILE_WRITE_CANNOT_RENAME_NEW_CONFIG_301",CONFIG,MILD_ERROR,301, getClassLoader());

  /**
   * Modify DN operations are not allowed in the Directory Server configuration
   */
  public static final MessageDescriptor.Arg0 ERR_CONFIG_FILE_MODDN_NOT_ALLOWED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CONFIG_FILE_MODDN_NOT_ALLOWED_302",CONFIG,MILD_ERROR,302, getClassLoader());

  /**
   * Indicates whether messages for internal operations should be excluded from the access log file
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_LOGGER_SUPPRESS_INTERNAL_OPERATIONS =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_LOGGER_SUPPRESS_INTERNAL_OPERATIONS_303",CONFIG,INFORMATION,303, getClassLoader());

  /**
   * Invalid value specified for attribute %s. Allowed values are true or false
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_LOGGER_INVALID_SUPPRESS_INT_OPERATION_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_LOGGER_INVALID_SUPPRESS_INT_OPERATION_VALUE_304",CONFIG,SEVERE_ERROR,304, getClassLoader());

  /**
   * Set of base DNs that should be used for this backend.  It is up to the backend implementation as to whether changes to this attribute will automatically take effect
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_BACKEND_ATTR_DESCRIPTION_BASE_DNS =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_BACKEND_ATTR_DESCRIPTION_BASE_DNS_305",CONFIG,INFORMATION,305, getClassLoader());

  /**
   * Backend configuration entry %s does not contain attribute ds-cfg-base-dn, which is used to specify the set of base DNs for the backend.  This is a required attribute, and therefore the backend will be disabled
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_BACKEND_NO_BASE_DNS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_BACKEND_NO_BASE_DNS_306",CONFIG,SEVERE_ERROR,306, getClassLoader());

  /**
   * An unexpected error occurred while attempting to determine the set of base DNs associated with the backend defined in configuration entry %s:  %s.  This backend will be disabled
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_BACKEND_UNABLE_TO_DETERMINE_BASE_DNS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_BACKEND_UNABLE_TO_DETERMINE_BASE_DNS_307",CONFIG,SEVERE_ERROR,307, getClassLoader());

  /**
   * Indicates whether the Directory Server key manager provider should be enabled.  A key manager provider is required for operations that require access to a key manager (e.g., communication over SSL).  Changes to this configuration attribute will take effect immediately, but will only impact future attempts to access the key manager
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_KEYMANAGER_DESCRIPTION_ENABLED =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_KEYMANAGER_DESCRIPTION_ENABLED_313",CONFIG,INFORMATION,313, getClassLoader());

  /**
   * Configuration entry "%s" does not contain a value for attribute ds-cfg-enabled, which indicates whether the key manager provider is enabled for use in the server
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_KEYMANAGER_NO_ENABLED_ATTR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_KEYMANAGER_NO_ENABLED_ATTR_314",CONFIG,SEVERE_ERROR,314, getClassLoader());

  /**
   * Fully-qualified name of the Java class that includes the key manager provider implementation.  Changes to this configuration attribute will not take effect until the key manager provider has been disabled and then re-enabled, or until the server is restarted
   */
  public static final MessageDescriptor.Arg0 ERR_CONFIG_KEYMANAGER_DESCRIPTION_CLASS =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CONFIG_KEYMANAGER_DESCRIPTION_CLASS_317",CONFIG,SEVERE_ERROR,317, getClassLoader());

  /**
   * Indicates whether the Directory Server trust manager provider should be enabled.  A trust manager provider is required for operations that require access to a trust manager (e.g., communication over SSL).  Changes to this configuration attribute will take effect immediately, but will only impact future attempts to access the trust manager
   */
  public static final MessageDescriptor.Arg0 ERR_CONFIG_TRUSTMANAGER_DESCRIPTION_ENABLED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CONFIG_TRUSTMANAGER_DESCRIPTION_ENABLED_328",CONFIG,SEVERE_ERROR,328, getClassLoader());

  /**
   * Configuration entry "%s" does not contain a value for attribute ds-cfg-enabled, which indicates whether the trust manager provider is enabled for use in the server
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_TRUSTMANAGER_NO_ENABLED_ATTR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_TRUSTMANAGER_NO_ENABLED_ATTR_329",CONFIG,SEVERE_ERROR,329, getClassLoader());

  /**
   * Fully-qualified name of the Java class that includes the trust manager provider implementation.  Changes to this configuration attribute will not take effect until the trust manager provider has been disabled and then re-enabled, or until the server is restarted
   */
  public static final MessageDescriptor.Arg0 ERR_CONFIG_TRUSTMANAGER_DESCRIPTION_CLASS =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CONFIG_TRUSTMANAGER_DESCRIPTION_CLASS_332",CONFIG,SEVERE_ERROR,332, getClassLoader());

  /**
   * Indicates whether the Directory Server certificate mapper should be enabled.  A certificate mapper is used to establish a mapping between a client certificate chain and a user entry in the Directory Server for SASL EXTERNAL authentication and similar purposes.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 ERR_CONFIG_CERTMAPPER_DESCRIPTION_ENABLED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CONFIG_CERTMAPPER_DESCRIPTION_ENABLED_347",CONFIG,SEVERE_ERROR,347, getClassLoader());

  /**
   * Configuration entry "%s" does not contain a value for attribute ds-cfg-enabled, which indicates whether the certificate mapper is enabled for use in the server
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_CERTMAPPER_NO_ENABLED_ATTR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_CERTMAPPER_NO_ENABLED_ATTR_348",CONFIG,SEVERE_ERROR,348, getClassLoader());

  /**
   * Fully-qualified name of the Java class that includes the certificate mapper implementation.  Changes to this configuration attribute will not take effect until the certificate mapper has been disabled and then re-enabled, or until the server is restarted
   */
  public static final MessageDescriptor.Arg0 ERR_CONFIG_CERTMAPPER_DESCRIPTION_CLASS =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CONFIG_CERTMAPPER_DESCRIPTION_CLASS_351",CONFIG,SEVERE_ERROR,351, getClassLoader());

  /**
   * No file retention policy has been defined in configuration entry %s. No log files will be deleted
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_CONFIG_LOGGER_NO_RETENTION_POLICY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_WARN_CONFIG_LOGGER_NO_RETENTION_POLICY_357",CONFIG,MILD_WARNING,357, getClassLoader());

  /**
   * An invalid file retention policy %s has been defined in configuration entry %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_CONFIG_LOGGER_INVALID_RETENTION_POLICY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_CONFIG_LOGGER_INVALID_RETENTION_POLICY_358",CONFIG,SEVERE_WARNING,358, getClassLoader());

  /**
   * No file number limit has been defined for the retention policy in the configuration entry %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_CONFIG_LOGGER_NO_NUMBER_OF_FILES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_CONFIG_LOGGER_NO_NUMBER_OF_FILES_359",CONFIG,SEVERE_WARNING,359, getClassLoader());

  /**
   * No disk space limit has been defined for the retention policy in the configuration entry %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_CONFIG_LOGGER_NO_DISK_SPACE_USED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_CONFIG_LOGGER_NO_DISK_SPACE_USED_360",CONFIG,SEVERE_WARNING,360, getClassLoader());

  /**
   * An error occurred while attempting to retrieve the password storage scheme base entry cn=Password Storage Schemes,cn=config from the Directory Server configuration:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_PWSCHEME_CANNOT_GET_BASE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"FATAL_ERR_CONFIG_PWSCHEME_CANNOT_GET_BASE_363",CONFIG,FATAL_ERROR,363, getClassLoader());

  /**
   * The password storage scheme configuration base cn=Password Storage Schemes,cn=config does not exist in the Directory Server configuration.  This entry must be present for the server to function properly
   */
  public static final MessageDescriptor.Arg0 WARN_CONFIG_PWSCHEME_BASE_DOES_NOT_EXIST =
          new MessageDescriptor.Arg0(BASE,"SEVERE_WARN_CONFIG_PWSCHEME_BASE_DOES_NOT_EXIST_364",CONFIG,SEVERE_WARNING,364, getClassLoader());

  /**
   * Configuration entry %s does not contain a valid password storage scheme configuration:  %s.  It will be ignored
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_PWSCHEME_ENTRY_UNACCEPTABLE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_PWSCHEME_ENTRY_UNACCEPTABLE_365",CONFIG,SEVERE_ERROR,365, getClassLoader());

  /**
   * An error occurred while attempting to create a Directory Server password storage scheme from the information in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_PWSCHEME_CANNOT_CREATE_SCHEME =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_PWSCHEME_CANNOT_CREATE_SCHEME_366",CONFIG,SEVERE_ERROR,366, getClassLoader());

  /**
   * Configuration entry %s does not contain the ds-cfg-password-storage-scheme objectclass, which is required for password storage scheme definitions
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_PWSCHEME_INVALID_OBJECTCLASS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_PWSCHEME_INVALID_OBJECTCLASS_367",CONFIG,SEVERE_ERROR,367, getClassLoader());

  /**
   * The fully-qualified name of the Java class that defines the Directory Server password storage scheme.  If this is altered while the associated scheme is enabled, then that storage scheme must be disabled and re-enabled for the change to take effect
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_PWSCHEME_DESCRIPTION_CLASS_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_PWSCHEME_DESCRIPTION_CLASS_NAME_368",CONFIG,INFORMATION,368, getClassLoader());

  /**
   * Configuration entry %s does not contain a valid value for configuration attribute ds-cfg-java-class which specifies the fully-qualified class name for the associated password storage scheme
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_PWSCHEME_NO_CLASS_NAME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_PWSCHEME_NO_CLASS_NAME_369",CONFIG,SEVERE_ERROR,369, getClassLoader());

  /**
   * Configuration entry %s has an invalid value for attribute ds-cfg-java-class:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_PWSCHEME_INVALID_CLASS_NAME =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_PWSCHEME_INVALID_CLASS_NAME_370",CONFIG,SEVERE_ERROR,370, getClassLoader());

  /**
   * Class %s specified in configuration entry %s does not contain a valid password storage scheme implementation:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_PWSCHEME_INVALID_CLASS =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_PWSCHEME_INVALID_CLASS_371",CONFIG,SEVERE_ERROR,371, getClassLoader());

  /**
   * Indicates whether this Directory Server password storage scheme should be enabled.  Changes to this attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_PWSCHEME_DESCRIPTION_ENABLED =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_PWSCHEME_DESCRIPTION_ENABLED_372",CONFIG,INFORMATION,372, getClassLoader());

  /**
   * Configuration entry %s does not contain a valid value for configuration attribute ds-cfg-enabled which indicates whether the password storage scheme should be enabled for use in the Directory Server
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_PWSCHEME_NO_ENABLED_ATTR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_PWSCHEME_NO_ENABLED_ATTR_373",CONFIG,SEVERE_ERROR,373, getClassLoader());

  /**
   * Configuration entry %s has an invalid value for attribute ds-cfg-enabled: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_PWSCHEME_INVALID_ENABLED_VALUE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_PWSCHEME_INVALID_ENABLED_VALUE_374",CONFIG,SEVERE_ERROR,374, getClassLoader());

  /**
   * The requested change in the password storage scheme class name from %s to %s in configuration entry %s cannot be dynamically applied.  This change will not take effect until the storage scheme is disabled and re-enabled or the Directory Server is restarted
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> INFO_CONFIG_PWSCHEME_CLASS_ACTION_REQUIRED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"INFO_CONFIG_PWSCHEME_CLASS_ACTION_REQUIRED_375",CONFIG,INFORMATION,375, getClassLoader());

  /**
   * An error occurred while trying to initialize an instance of class %s as a password storage scheme as defined in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_PWSCHEME_INITIALIZATION_FAILED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_PWSCHEME_INITIALIZATION_FAILED_376",CONFIG,MILD_ERROR,376, getClassLoader());

  /**
   * Unable to add a new password storage scheme entry with DN %s because there is already a storage scheme registered with that DN
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_PWSCHEME_EXISTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CONFIG_PWSCHEME_EXISTS_377",CONFIG,MILD_ERROR,377, getClassLoader());

  /**
   * The configuration for the password storage scheme defined in configuration entry %s was not acceptable according to its internal validation.  However, no specific information is available regarding the problem(s) with the entry
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_PWSCHEME_UNACCEPTABLE_CONFIG =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_PWSCHEME_UNACCEPTABLE_CONFIG_378",CONFIG,SEVERE_ERROR,378, getClassLoader());

  /**
   * The requested change in the plugin class name from %s to %s in configuration entry %s cannot be dynamically applied.  This change will not take effect until the plugin is disabled and re-enabled or the Directory Server is restarted
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> INFO_CONFIG_PLUGIN_CLASS_ACTION_REQUIRED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"INFO_CONFIG_PLUGIN_CLASS_ACTION_REQUIRED_379",CONFIG,INFORMATION,379, getClassLoader());

  /**
   * No disk space limit has been defined for the retention policy in the configuration entry %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_LOGGER_NO_FREE_DISK_SPACE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_LOGGER_NO_FREE_DISK_SPACE_380",CONFIG,SEVERE_ERROR,380, getClassLoader());

  /**
   * The free disk space based retention policy in the configuration entry %s. is not allowed for the Directory Server when running on pre Java 6 VMs
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_LOGGER_INVALID_JAVA5_POLICY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_LOGGER_INVALID_JAVA5_POLICY_381",CONFIG,SEVERE_ERROR,381, getClassLoader());

  /**
   * Unique identifier for this backend.  Changes to this configuration attribute will not take effect until the backend is disabled and re-enabled or the server is restarted
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_BACKEND_ATTR_DESCRIPTION_BACKEND_ID =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_BACKEND_ATTR_DESCRIPTION_BACKEND_ID_382",CONFIG,INFORMATION,382, getClassLoader());

  /**
   * Backend configuration entry %s does not contain attribute ds-cfg-backend-id, which is used to provide a unique identifier for the backend.  The backend will be disabled
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_CONFIG_BACKEND_NO_BACKEND_ID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_CONFIG_BACKEND_NO_BACKEND_ID_383",CONFIG,SEVERE_WARNING,383, getClassLoader());

  /**
   * The backend defined in configuration entry %s has a backend ID of %s that conflicts with the backend ID for another backend in the server.  The backend will be disabled
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_CONFIG_BACKEND_DUPLICATE_BACKEND_ID =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_CONFIG_BACKEND_DUPLICATE_BACKEND_ID_384",CONFIG,SEVERE_WARNING,384, getClassLoader());

  /**
   * An unexpected error occurred while attempting to determine the backend ID for the backend defined in configuration entry %s:  %s.  The backend will be disabled
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_BACKEND_UNABLE_TO_DETERMINE_BACKEND_ID =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_BACKEND_UNABLE_TO_DETERMINE_BACKEND_ID_385",CONFIG,SEVERE_ERROR,385, getClassLoader());

  /**
   * An error occurred while attempting to obtain the %s MAC provider to create the signed hash for the backup:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_BACKUP_CANNOT_GET_MAC =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_BACKUP_CANNOT_GET_MAC_386",CONFIG,SEVERE_ERROR,386, getClassLoader());

  /**
   * An error occurred while attempting to obtain the %s message digest to create the hash for the backup: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_BACKUP_CANNOT_GET_DIGEST =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_BACKUP_CANNOT_GET_DIGEST_387",CONFIG,SEVERE_ERROR,387, getClassLoader());

  /**
   * An error occurred while trying to create the config archive file %s in directory %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_BACKUP_CANNOT_CREATE_ARCHIVE_FILE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_BACKUP_CANNOT_CREATE_ARCHIVE_FILE_388",CONFIG,SEVERE_ERROR,388, getClassLoader());

  /**
   * An error occurred while attempting to obtain the cipher to use to encrypt the backup:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_BACKUP_CANNOT_GET_CIPHER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_BACKUP_CANNOT_GET_CIPHER_389",CONFIG,SEVERE_ERROR,389, getClassLoader());

  /**
   * %s config backup %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_BACKUP_ZIP_COMMENT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_BACKUP_ZIP_COMMENT_390",CONFIG,SEVERE_ERROR,390, getClassLoader());

  /**
   * An error occurred while attempting to determine the path to the Directory Server configuration file so that it could be archived:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_BACKUP_CANNOT_DETERMINE_CONFIG_FILE_LOCATION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_BACKUP_CANNOT_DETERMINE_CONFIG_FILE_LOCATION_391",CONFIG,SEVERE_ERROR,391, getClassLoader());

  /**
   * An error occurred while attempting to back up configuration file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_BACKUP_CANNOT_BACKUP_CONFIG_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_BACKUP_CANNOT_BACKUP_CONFIG_FILE_392",CONFIG,SEVERE_ERROR,392, getClassLoader());

  /**
   * An error occurred while attempting to back up the archived previous configurations from file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_BACKUP_CANNOT_BACKUP_ARCHIVED_CONFIGS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_BACKUP_CANNOT_BACKUP_ARCHIVED_CONFIGS_393",CONFIG,SEVERE_ERROR,393, getClassLoader());

  /**
   * An error occurred while trying to close the config archive file %s in directory %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_BACKUP_CANNOT_CLOSE_ZIP_STREAM =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_BACKUP_CANNOT_CLOSE_ZIP_STREAM_394",CONFIG,SEVERE_ERROR,394, getClassLoader());

  /**
   * An error occurred while attempting to update the backup descriptor file %s with information about the configuration backup:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_BACKUP_CANNOT_UPDATE_BACKUP_DESCRIPTOR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_BACKUP_CANNOT_UPDATE_BACKUP_DESCRIPTOR_395",CONFIG,SEVERE_ERROR,395, getClassLoader());

  /**
   * Unable to restore or verify configuration backup %s in directory %s because no such backup exists
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_RESTORE_NO_SUCH_BACKUP =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_RESTORE_NO_SUCH_BACKUP_396",CONFIG,SEVERE_ERROR,396, getClassLoader());

  /**
   * Unable to restore or verify configuration backup %s in directory %s because the archive filename could not be determined
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_RESTORE_NO_BACKUP_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_RESTORE_NO_BACKUP_FILE_397",CONFIG,SEVERE_ERROR,397, getClassLoader());

  /**
   * Unable to restore or verify configuration backup %s because the specified archive file %s does not exist
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_RESTORE_NO_SUCH_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_RESTORE_NO_SUCH_FILE_398",CONFIG,SEVERE_ERROR,398, getClassLoader());

  /**
   * Unable to restore or verify configuration backup %s because an error occurred while trying to determine whether backup archive %s exists:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_RESTORE_CANNOT_CHECK_FOR_ARCHIVE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_RESTORE_CANNOT_CHECK_FOR_ARCHIVE_399",CONFIG,SEVERE_ERROR,399, getClassLoader());

  /**
   * Unable to restore or verify configuration backup %s because an unsigned hash of this backup is available but the server cannot determine the digest algorithm used to generate this hash
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_RESTORE_UNKNOWN_DIGEST =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_RESTORE_UNKNOWN_DIGEST_400",CONFIG,SEVERE_ERROR,400, getClassLoader());

  /**
   * Unable to restore or verify configuration backup %s because it has an unsigned hash that uses an unknown or unsupported digest algorithm of %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_RESTORE_CANNOT_GET_DIGEST =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_RESTORE_CANNOT_GET_DIGEST_401",CONFIG,SEVERE_ERROR,401, getClassLoader());

  /**
   * Unable to restore or verify configuration backup %s because a signed hash of this backup is available but the server cannot determine the MAC algorithm used to generate this hash
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_RESTORE_UNKNOWN_MAC =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_RESTORE_UNKNOWN_MAC_402",CONFIG,SEVERE_ERROR,402, getClassLoader());

  /**
   * Unable to restore or verify configuration backup %s because it has a signed hash that uses an unknown or unsupported MAC algorithm of %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_RESTORE_CANNOT_GET_MAC =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_RESTORE_CANNOT_GET_MAC_403",CONFIG,SEVERE_ERROR,403, getClassLoader());

  /**
   * Unable to restore or verify configuration backup %s because an error occurred while attempting to open the backup archive file %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_RESTORE_CANNOT_OPEN_BACKUP_FILE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_RESTORE_CANNOT_OPEN_BACKUP_FILE_404",CONFIG,SEVERE_ERROR,404, getClassLoader());

  /**
   * Unable to restore or verify configuration backup %s because it is encrypted using an unknown or unsupported cipher:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_RESTORE_CANNOT_GET_CIPHER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_RESTORE_CANNOT_GET_CIPHER_406",CONFIG,SEVERE_ERROR,406, getClassLoader());

  /**
   * Unable to restore configuration backup %s because an error occurred while attempting to temporarily back up the current configuration files from %s to %s:  %s
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> ERR_CONFIG_RESTORE_CANNOT_BACKUP_EXISTING_CONFIG =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_RESTORE_CANNOT_BACKUP_EXISTING_CONFIG_407",CONFIG,SEVERE_ERROR,407, getClassLoader());

  /**
   * An error occurred that prevented the configuration backup from being properly restored.  However, the original configuration files that were in place before the start of the restore process have been preserved and are now in their original location of %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_CONFIG_RESTORE_RESTORED_OLD_CONFIG =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_CONFIG_RESTORE_RESTORED_OLD_CONFIG_408",CONFIG,NOTICE,408, getClassLoader());

  /**
   * An error occurred that prevented the configuration backup from being properly restored.  The original configuration files that were in place before the start of the restore process have been preserved and are contained in the %s directory
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_RESTORE_CANNOT_RESTORE_OLD_CONFIG =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_RESTORE_CANNOT_RESTORE_OLD_CONFIG_409",CONFIG,SEVERE_ERROR,409, getClassLoader());

  /**
   * Unable to restore configuration backup %s because an error occurred while attempting to create a new empty directory %s into which the files should be restored:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_RESTORE_CANNOT_CREATE_CONFIG_DIRECTORY =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_RESTORE_CANNOT_CREATE_CONFIG_DIRECTORY_410",CONFIG,SEVERE_ERROR,410, getClassLoader());

  /**
   * An error occurred that prevented the configuration backup from being properly restored.  The original configuration files that were in place before the start of the restore process have been preserved in the %s directory
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_RESTORE_OLD_CONFIG_SAVED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_RESTORE_OLD_CONFIG_SAVED_411",CONFIG,SEVERE_ERROR,411, getClassLoader());

  /**
   * Unable to restore or verify configuration backup %s because an error occurred while trying to read the next entry from the archive file %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_RESTORE_CANNOT_GET_ZIP_ENTRY =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_RESTORE_CANNOT_GET_ZIP_ENTRY_412",CONFIG,SEVERE_ERROR,412, getClassLoader());

  /**
   * Unable to restore configuration backup %s because an error occurred while trying to recreate file %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_RESTORE_CANNOT_CREATE_FILE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_RESTORE_CANNOT_CREATE_FILE_413",CONFIG,SEVERE_ERROR,413, getClassLoader());

  /**
   * Unable to restore or verify configuration backup %s because an error occurred while processing archived file %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_RESTORE_CANNOT_PROCESS_ARCHIVE_FILE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_RESTORE_CANNOT_PROCESS_ARCHIVE_FILE_414",CONFIG,SEVERE_ERROR,414, getClassLoader());

  /**
   * Unable to restore or verify configuration backup %s because an unexpected error occurred while trying to close the archive file %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_RESTORE_ERROR_ON_ZIP_STREAM_CLOSE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_RESTORE_ERROR_ON_ZIP_STREAM_CLOSE_415",CONFIG,SEVERE_ERROR,415, getClassLoader());

  /**
   * The message digest calculated from the backup archive matches the digest stored with the backup information
   */
  public static final MessageDescriptor.Arg0 NOTE_CONFIG_RESTORE_UNSIGNED_HASH_VALID =
          new MessageDescriptor.Arg0(BASE,"NOTICE_CONFIG_RESTORE_UNSIGNED_HASH_VALID_416",CONFIG,NOTICE,416, getClassLoader());

  /**
   * Unable to restore or verify configuration backup %s because the message digest calculated from the backup archive does not match the digest stored with the backup information
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_RESTORE_UNSIGNED_HASH_INVALID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_RESTORE_UNSIGNED_HASH_INVALID_417",CONFIG,SEVERE_ERROR,417, getClassLoader());

  /**
   * The signed digest calculated from the backup archive matches the signature stored with the backup information
   */
  public static final MessageDescriptor.Arg0 NOTE_CONFIG_RESTORE_SIGNED_HASH_VALID =
          new MessageDescriptor.Arg0(BASE,"NOTICE_CONFIG_RESTORE_SIGNED_HASH_VALID_418",CONFIG,NOTICE,418, getClassLoader());

  /**
   * Unable to restore or verify configuration backup %s because the signed digest calculated from the backup archive does not match the signature stored with the backup information
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_RESTORE_SIGNED_HASH_INVALID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_RESTORE_SIGNED_HASH_INVALID_419",CONFIG,SEVERE_ERROR,419, getClassLoader());

  /**
   * All tests performed on configuration backup %s from directory %s show that the archive appears to be valid
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> NOTE_CONFIG_RESTORE_VERIFY_SUCCESSFUL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"NOTICE_CONFIG_RESTORE_VERIFY_SUCCESSFUL_420",CONFIG,NOTICE,420, getClassLoader());

  /**
   * Configuration backup %s was successfully restored from the archive in directory %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> NOTE_CONFIG_RESTORE_SUCCESSFUL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"NOTICE_CONFIG_RESTORE_SUCCESSFUL_421",CONFIG,NOTICE,421, getClassLoader());

  /**
   * The Directory Server was unable to acquire a shared lock for backend %s:  %s.  This generally means that the backend is in use by a process that requires an exclusive lock (e.g., importing from LDIF or restoring a backup).  This backend will be disabled
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_BACKEND_CANNOT_ACQUIRE_SHARED_LOCK =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_BACKEND_CANNOT_ACQUIRE_SHARED_LOCK_422",CONFIG,SEVERE_ERROR,422, getClassLoader());

  /**
   * An error occurred while attempting to release a shared lock for backend %s:  %s.  This may interfere with operations that require exclusive access, including LDIF import and restoring a backup
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_CONFIG_BACKEND_CANNOT_RELEASE_SHARED_LOCK =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_CONFIG_BACKEND_CANNOT_RELEASE_SHARED_LOCK_423",CONFIG,SEVERE_WARNING,423, getClassLoader());

  /**
   * This file contains the primary Directory Server configuration.  It must not be directly edited while the server is online. The server configuration should only be managed using the administration utilities provided with the Directory Server
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_FILE_HEADER =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_FILE_HEADER_424",CONFIG,INFORMATION,424, getClassLoader());

  /**
   * Indicates whether the Directory Server should automatically add missing RDN attributes to an entry when it is added.  By default, entries added that do not contain the RDN attribute values in their attribute lists will be rejected because they are in violation of the LDAP specification.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_CORE_DESCRIPTION_ADD_MISSING_RDN_ATTRS =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_CORE_DESCRIPTION_ADD_MISSING_RDN_ATTRS_425",CONFIG,INFORMATION,425, getClassLoader());

  /**
   * Configuration entry %s has an invalid value for configuration attribute ds-cfg-add-missing-rdn-attributes (it should be a Boolean value of true or false):  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_CORE_INVALID_ADD_MISSING_RDN_ATTRS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_CORE_INVALID_ADD_MISSING_RDN_ATTRS_426",CONFIG,SEVERE_ERROR,426, getClassLoader());

  /**
   * Result code that should be used for responses in which the operation fails because of an internal server error.  The value should be the integer equivalent of the corresponding LDAP result code.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_CORE_DESCRIPTION_SERVER_ERROR_RESULT_CODE =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_CORE_DESCRIPTION_SERVER_ERROR_RESULT_CODE_427",CONFIG,INFORMATION,427, getClassLoader());

  /**
   * Configuration entry %s has an invalid value for configuration attribute ds-cfg-server-error-result-code (it should be an integer value greater than or equal to 1):  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_CORE_INVALID_SERVER_ERROR_RESULT_CODE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_CORE_INVALID_SERVER_ERROR_RESULT_CODE_428",CONFIG,SEVERE_ERROR,428, getClassLoader());

  /**
   * An error occurred while attempting to retrieve the identity mapper base entry cn=Identity Mappers,cn=config from the Directory Server configuration:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_IDMAPPER_CANNOT_GET_BASE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"FATAL_ERR_CONFIG_IDMAPPER_CANNOT_GET_BASE_429",CONFIG,FATAL_ERROR,429, getClassLoader());

  /**
   * The identity mapper configuration base cn=Identity Mappers,cn=config does not exist in the Directory Server configuration.  This entry must be present for the server to function properly
   */
  public static final MessageDescriptor.Arg0 WARN_CONFIG_IDMAPPER_BASE_DOES_NOT_EXIST =
          new MessageDescriptor.Arg0(BASE,"SEVERE_WARN_CONFIG_IDMAPPER_BASE_DOES_NOT_EXIST_430",CONFIG,SEVERE_WARNING,430, getClassLoader());

  /**
   * Configuration entry %s does not contain a valid identity mapper configuration:  %s.  It will be ignored
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_IDMAPPER_ENTRY_UNACCEPTABLE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_IDMAPPER_ENTRY_UNACCEPTABLE_431",CONFIG,SEVERE_ERROR,431, getClassLoader());

  /**
   * An error occurred while attempting to create a Directory Server identity mapper from the information in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_IDMAPPER_CANNOT_CREATE_MAPPER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_IDMAPPER_CANNOT_CREATE_MAPPER_432",CONFIG,SEVERE_ERROR,432, getClassLoader());

  /**
   * Configuration entry %s does not contain the ds-cfg-identity-mapper objectclass, which is required for identity mapper definitions
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_IDMAPPER_INVALID_OBJECTCLASS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_IDMAPPER_INVALID_OBJECTCLASS_433",CONFIG,SEVERE_ERROR,433, getClassLoader());

  /**
   * The fully-qualified name of the Java class that defines a Directory Server identity mapper.  If this is altered while the associated identity mapper is enabled, then that mapper must be disabled and re-enabled for the change to take effect
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_IDMAPPER_DESCRIPTION_CLASS_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_IDMAPPER_DESCRIPTION_CLASS_NAME_434",CONFIG,INFORMATION,434, getClassLoader());

  /**
   * Configuration entry %s does not contain a valid value for configuration attribute ds-cfg-java-class which specifies the fully-qualified class name for the associated identity mapper
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_IDMAPPER_NO_CLASS_NAME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_IDMAPPER_NO_CLASS_NAME_435",CONFIG,SEVERE_ERROR,435, getClassLoader());

  /**
   * Configuration entry %s has an invalid value for attribute ds-cfg-java-class:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_IDMAPPER_INVALID_CLASS_NAME =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_IDMAPPER_INVALID_CLASS_NAME_436",CONFIG,SEVERE_ERROR,436, getClassLoader());

  /**
   * Class %s specified in configuration entry %s does not contain a valid identity mapper implementation:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_IDMAPPER_INVALID_CLASS =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_IDMAPPER_INVALID_CLASS_437",CONFIG,SEVERE_ERROR,437, getClassLoader());

  /**
   * Indicates whether this Directory Server identity mapper should be enabled.  Changes to this attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_IDMAPPER_DESCRIPTION_ENABLED =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_IDMAPPER_DESCRIPTION_ENABLED_438",CONFIG,INFORMATION,438, getClassLoader());

  /**
   * Configuration entry %s does not contain a valid value for configuration attribute ds-cfg-enabled which indicates whether the identity mapper should be enabled for use in the Directory Server
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_IDMAPPER_NO_ENABLED_ATTR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_IDMAPPER_NO_ENABLED_ATTR_439",CONFIG,SEVERE_ERROR,439, getClassLoader());

  /**
   * Configuration entry %s has an invalid value for attribute ds-cfg-enabled:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_IDMAPPER_INVALID_ENABLED_VALUE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_IDMAPPER_INVALID_ENABLED_VALUE_440",CONFIG,SEVERE_ERROR,440, getClassLoader());

  /**
   * The requested change in the identity mapper class name from %s to %s in configuration entry %s cannot be dynamically applied.  This change will not take effect until the identity mapper is disabled and re-enabled or the Directory Server is restarted
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> INFO_CONFIG_IDMAPPER_CLASS_ACTION_REQUIRED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"INFO_CONFIG_IDMAPPER_CLASS_ACTION_REQUIRED_441",CONFIG,INFORMATION,441, getClassLoader());

  /**
   * An error occurred while trying to initialize an instance of class %s as an identity mapper as defined in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_IDMAPPER_INITIALIZATION_FAILED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_IDMAPPER_INITIALIZATION_FAILED_442",CONFIG,MILD_ERROR,442, getClassLoader());

  /**
   * Unable to add a new identity mapper entry with DN %s because there is already an identity mapper registered with that DN
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_IDMAPPER_EXISTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CONFIG_IDMAPPER_EXISTS_443",CONFIG,MILD_ERROR,443, getClassLoader());

  /**
   * The configuration for the identity mapper defined in configuration entry %s was not acceptable according to its internal validation.  However, no specific information is available regarding the problem(s) with the entry
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_IDMAPPER_UNACCEPTABLE_CONFIG =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_IDMAPPER_UNACCEPTABLE_CONFIG_444",CONFIG,SEVERE_ERROR,444, getClassLoader());

  /**
   * DN of the configuration entry for the identity mapper that the Directory Server should use in conjunction with the proxied authorization V2 control.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_CORE_DESCRIPTION_PROXY_MAPPER_DN =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_CORE_DESCRIPTION_PROXY_MAPPER_DN_445",CONFIG,INFORMATION,445, getClassLoader());

  /**
   * Configuration entry %s has an invalid value for configuration attribute ds-cfg-proxied-authorization-identity-mapper (it should be the DN of a valid identity mapper configuration entry):  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_CORE_INVALID_PROXY_MAPPER_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_CORE_INVALID_PROXY_MAPPER_DN_446",CONFIG,SEVERE_ERROR,446, getClassLoader());

  /**
   * The proxied authorization identity mapper DN %s specified in configuration entry %s does not refer to a valid identity mapper configuration entry
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_CORE_NO_PROXY_MAPPER_FOR_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_CORE_NO_PROXY_MAPPER_FOR_DN_447",CONFIG,SEVERE_ERROR,447, getClassLoader());

  /**
   * The Directory Server does not have any identity mapper configured for use in conjunction with proxied authorization V2 operations.  The Directory Server will not be able to process requests containing the proxied authorization control with a username-based authorization ID
   */
  public static final MessageDescriptor.Arg0 ERR_CONFIG_IDMAPPER_NO_PROXY_MAPPER_DN =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CONFIG_IDMAPPER_NO_PROXY_MAPPER_DN_448",CONFIG,SEVERE_ERROR,448, getClassLoader());

  /**
   * The configured proxied authorization identity mapper DN %s does not refer to an active identity mapper.  The Directory Server will not be able to process requests containing the proxied authorization control with a username-based authorization ID
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_IDMAPPER_INVALID_PROXY_MAPPER_DN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_IDMAPPER_INVALID_PROXY_MAPPER_DN_449",CONFIG,SEVERE_ERROR,449, getClassLoader());

  /**
   * Default maximum number of entries that should be returned to a client when processing a search operation.  This may be overridden on a per-user basis by including the ds-rlim-size-limit operational attribute in the user's entry.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_CORE_DESCRIPTION_SIZE_LIMIT =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_CORE_DESCRIPTION_SIZE_LIMIT_450",CONFIG,INFORMATION,450, getClassLoader());

  /**
   * Configuration entry %s has an invalid value for configuration attribute ds-cfg-size-limit (It should be a positive integer value specifying the size limit to use, or a value of 0 or -1 to indicate that no limit should be enforced):  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_CORE_INVALID_SIZE_LIMIT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_CORE_INVALID_SIZE_LIMIT_451",CONFIG,SEVERE_ERROR,451, getClassLoader());

  /**
   * An error occurred while attempting to retrieve the Directory Server synchronization provider configuration base entry cn=Synchronization Providers,cn=config:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_SYNCH_CANNOT_GET_CONFIG_BASE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"FATAL_ERR_CONFIG_SYNCH_CANNOT_GET_CONFIG_BASE_452",CONFIG,FATAL_ERROR,452, getClassLoader());

  /**
   * The Directory Server synchronization provider base entry cn=Synchronization Providers,cn=config does not exist.  This entry must be  present in the Directory Server configuration
   */
  public static final MessageDescriptor.Arg0 ERR_CONFIG_SYNCH_BASE_DOES_NOT_EXIST =
          new MessageDescriptor.Arg0(BASE,"FATAL_ERR_CONFIG_SYNCH_BASE_DOES_NOT_EXIST_453",CONFIG,FATAL_ERROR,453, getClassLoader());

  /**
   * Configuration entry %s exists below the Directory Server synchronization provider root but does not contain attribute ds-cfg-synchronization-provider which must be present in all synchronization provider configuration entries
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_SYNCH_ENTRY_DOES_NOT_HAVE_PROVIDER_CONFIG =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"FATAL_ERR_CONFIG_SYNCH_ENTRY_DOES_NOT_HAVE_PROVIDER_CONFIG_454",CONFIG,FATAL_ERROR,454, getClassLoader());

  /**
   * An error occurred while attempting to determine whether configuration entry %s was a valid Directory Server synchronization provider:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_SYNCH_CANNOT_CHECK_FOR_PROVIDER_CONFIG_OC =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"FATAL_ERR_CONFIG_SYNCH_CANNOT_CHECK_FOR_PROVIDER_CONFIG_OC_455",CONFIG,FATAL_ERROR,455, getClassLoader());

  /**
   * Indicates whether the associated Directory Server synchronization provider is enabled and should be used by the server.  This attribute must be present in all synchronization provider entries and may not be changed while the Directory Server is running
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_SYNCH_DESCRIPTION_PROVIDER_ENABLED =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_SYNCH_DESCRIPTION_PROVIDER_ENABLED_456",CONFIG,INFORMATION,456, getClassLoader());

  /**
   * Synchronization provider configuration entry %s does not contain attribute ds-cfg-enabled which indicates whether the synchronization provider is enabled for use
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_SYNCH_PROVIDER_NO_ENABLED_ATTR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"FATAL_ERR_CONFIG_SYNCH_PROVIDER_NO_ENABLED_ATTR_457",CONFIG,FATAL_ERROR,457, getClassLoader());

  /**
   * The Directory Server synchronization provider defined in configuration entry %s is disabled.  This provider will not be used
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_CONFIG_SYNCH_PROVIDER_DISABLED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_CONFIG_SYNCH_PROVIDER_DISABLED_458",CONFIG,SEVERE_WARNING,458, getClassLoader());

  /**
   * An error occurred while attempting to determine whether the Directory Server synchronization provider defined in configuration entry %s should be enabled: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_SYNCH_UNABLE_TO_DETERMINE_ENABLED_STATE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"FATAL_ERR_CONFIG_SYNCH_UNABLE_TO_DETERMINE_ENABLED_STATE_459",CONFIG,FATAL_ERROR,459, getClassLoader());

  /**
   * Fully-qualified name of the Java class that will provide the logic for the Directory Server synchronization provider.  This attribute must be present in all synchronization provider entries and may not be changed while the Directory Server is running
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_SYNCH_DESCRIPTION_PROVIDER_CLASS =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_SYNCH_DESCRIPTION_PROVIDER_CLASS_460",CONFIG,INFORMATION,460, getClassLoader());

  /**
   * Synchronization provider configuration entry %s does not contain attribute ds-cfg-java-class which specifies the name of the class that implements the synchronization provider logic
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_SYNCH_NO_CLASS_ATTR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"FATAL_ERR_CONFIG_SYNCH_NO_CLASS_ATTR_461",CONFIG,FATAL_ERROR,461, getClassLoader());

  /**
   * An error occurred while attempting to determine the name of the class used to provide the Directory Server synchronization provider logic from configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_SYNCH_UNABLE_TO_DETERMINE_CLASS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"FATAL_ERR_CONFIG_SYNCH_UNABLE_TO_DETERMINE_CLASS_462",CONFIG,FATAL_ERROR,462, getClassLoader());

  /**
   * An error occurred while attempting to load class %s referenced in synchronization provider configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_SYNCH_UNABLE_TO_LOAD_PROVIDER_CLASS =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"FATAL_ERR_CONFIG_SYNCH_UNABLE_TO_LOAD_PROVIDER_CLASS_463",CONFIG,FATAL_ERROR,463, getClassLoader());

  /**
   * An error occurred while attempting to instantiate class %s referenced in synchronization provider configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_SYNCH_UNABLE_TO_INSTANTIATE_PROVIDER =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"FATAL_ERR_CONFIG_SYNCH_UNABLE_TO_INSTANTIATE_PROVIDER_464",CONFIG,FATAL_ERROR,464, getClassLoader());

  /**
   * An error occurred while attempting to initialize the Directory Server synchronization provider referenced in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_SYNCH_ERROR_INITIALIZING_PROVIDER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"FATAL_ERR_CONFIG_SYNCH_ERROR_INITIALIZING_PROVIDER_465",CONFIG,FATAL_ERROR,465, getClassLoader());

  /**
   * The synchronization provider defined in configuration entry %s is currently enabled but the configuration has changed so that it should be disabled.  This will not take effect until the Directory Server is restarted
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CONFIG_SYNCH_PROVIDER_HAS_BEEN_DISABLED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CONFIG_SYNCH_PROVIDER_HAS_BEEN_DISABLED_466",CONFIG,INFORMATION,466, getClassLoader());

  /**
   * The Java class providing the logic for the synchronization provider defined in configuration entry %s has changed from %s to %s.  This will not take effect until the Directory Server is restarted
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_SYNCH_PROVIDER_CLASS_CHANGED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"FATAL_ERR_CONFIG_SYNCH_PROVIDER_CLASS_CHANGED_467",CONFIG,FATAL_ERROR,467, getClassLoader());

  /**
   * Writability mode for this backend.  The value may be "enabled" if all write operations will be allowed, "disabled" if all write operations will be rejected, or "internal-only" if only internal write operations and synchronization updates will be allowed.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_BACKEND_ATTR_DESCRIPTION_WRITABILITY =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_BACKEND_ATTR_DESCRIPTION_WRITABILITY_468",CONFIG,INFORMATION,468, getClassLoader());

  /**
   * The backend defined in configuration entry %s does not have a value for configuration attribute ds-cfg-writability-mode which indicates the writability mode for that backend.  The backend will be disabled
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_BACKEND_NO_WRITABILITY_MODE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_BACKEND_NO_WRITABILITY_MODE_469",CONFIG,SEVERE_ERROR,469, getClassLoader());

  /**
   * The backend defined in configuration entry %s has an invalid writability mode of %s.  The backend will be disabled
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_BACKEND_INVALID_WRITABILITY_MODE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_BACKEND_INVALID_WRITABILITY_MODE_470",CONFIG,SEVERE_ERROR,470, getClassLoader());

  /**
   * An unexpected error occurred while attempting to determine the writability mode for the backend defined in configuration entry %s:  %s.  The backend will be disabled
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_BACKEND_UNABLE_TO_DETERMINE_WRITABILITY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_BACKEND_UNABLE_TO_DETERMINE_WRITABILITY_471",CONFIG,SEVERE_ERROR,471, getClassLoader());

  /**
   * Writability mode for the Directory Server.  The value may be one of "enabled", "disabled", or "internal-only".  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_CORE_DESCRIPTION_WRITABILITY_MODE =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_CORE_DESCRIPTION_WRITABILITY_MODE_472",CONFIG,INFORMATION,472, getClassLoader());

  /**
   * Configuration entry %s has an invalid value for configuration attribute ds-cfg-writability-mode (the value should be one of "enabled", "disabled", or "internal-only"):  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_CORE_INVALID_WRITABILITY_MODE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_CORE_INVALID_WRITABILITY_MODE_473",CONFIG,SEVERE_ERROR,473, getClassLoader());

  /**
   * Indicates whether simple binds that contain a DN will also be required to contain a password. If this is disabled, then binds with no password will always be treated as anonymous, even if they contain a bind DN, which can create a security hole for some kinds of applications.  With this option enabled, then any simple bind request that contains a DN but no password will be rejected rather than defaulting to anonymous authentication.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_CORE_DESCRIPTION_BIND_WITH_DN_REQUIRES_PW =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_CORE_DESCRIPTION_BIND_WITH_DN_REQUIRES_PW_474",CONFIG,INFORMATION,474, getClassLoader());

  /**
   * Configuration entry %s has an invalid value for configuration attribute ds-cfg-bind-with-dn-requires-password (the value should be either "TRUE" or "FALSE"):  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_CORE_INVALID_BIND_WITH_DN_REQUIRES_PW =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_CORE_INVALID_BIND_WITH_DN_REQUIRES_PW_475",CONFIG,SEVERE_ERROR,475, getClassLoader());

  /**
   * An error occurred while attempting to retrieve the password validator base entry cn=Password Validators,cn=config from the Directory Server configuration:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_PWVALIDATOR_CANNOT_GET_BASE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"FATAL_ERR_CONFIG_PWVALIDATOR_CANNOT_GET_BASE_476",CONFIG,FATAL_ERROR,476, getClassLoader());

  /**
   * The password validator configuration base cn=Password Validators,cn=config does not exist in the Directory Server configuration.  This entry must be present for the server to function properly
   */
  public static final MessageDescriptor.Arg0 WARN_CONFIG_PWVALIDATOR_BASE_DOES_NOT_EXIST =
          new MessageDescriptor.Arg0(BASE,"SEVERE_WARN_CONFIG_PWVALIDATOR_BASE_DOES_NOT_EXIST_477",CONFIG,SEVERE_WARNING,477, getClassLoader());

  /**
   * Configuration entry %s does not contain a valid password validator configuration:  %s.  It will be ignored
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_PWVALIDATOR_ENTRY_UNACCEPTABLE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_PWVALIDATOR_ENTRY_UNACCEPTABLE_478",CONFIG,SEVERE_ERROR,478, getClassLoader());

  /**
   * An error occurred while attempting to create a Directory Server password validator from the information in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_PWVALIDATOR_CANNOT_CREATE_VALIDATOR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_PWVALIDATOR_CANNOT_CREATE_VALIDATOR_479",CONFIG,SEVERE_ERROR,479, getClassLoader());

  /**
   * Configuration entry %s does not contain the ds-cfg-password-validator objectclass, which is required for password validator definitions
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_PWVALIDATOR_INVALID_OBJECTCLASS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_PWVALIDATOR_INVALID_OBJECTCLASS_480",CONFIG,SEVERE_ERROR,480, getClassLoader());

  /**
   * The fully-qualified name of the Java class that defines the Directory Server password validator.  If this is altered while the associated validator is enabled, then that validator must be disabled and re-enabled for the change to take effect
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_PWVALIDATOR_DESCRIPTION_CLASS_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_PWVALIDATOR_DESCRIPTION_CLASS_NAME_481",CONFIG,INFORMATION,481, getClassLoader());

  /**
   * Configuration entry %s does not contain a valid value for configuration attribute ds-cfg-java-class which specifies the fully-qualified class name for the associated password validator
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_PWVALIDATOR_NO_CLASS_NAME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_PWVALIDATOR_NO_CLASS_NAME_482",CONFIG,SEVERE_ERROR,482, getClassLoader());

  /**
   * Configuration entry %s has an invalid value for attribute ds-cfg-java-class:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_PWVALIDATOR_INVALID_CLASS_NAME =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_PWVALIDATOR_INVALID_CLASS_NAME_483",CONFIG,SEVERE_ERROR,483, getClassLoader());

  /**
   * Class %s specified in configuration entry %s does not contain a valid password validator implementation:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_PWVALIDATOR_INVALID_CLASS =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_PWVALIDATOR_INVALID_CLASS_484",CONFIG,SEVERE_ERROR,484, getClassLoader());

  /**
   * Indicates whether this Directory Server password validator should be enabled.  Changes to this attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_PWVALIDATOR_DESCRIPTION_ENABLED =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_PWVALIDATOR_DESCRIPTION_ENABLED_485",CONFIG,INFORMATION,485, getClassLoader());

  /**
   * Configuration entry %s does not contain a valid value for configuration attribute ds-cfg-enabled which indicates whether the password validator should be enabled for use in the Directory Server
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_PWVALIDATOR_NO_ENABLED_ATTR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_PWVALIDATOR_NO_ENABLED_ATTR_486",CONFIG,SEVERE_ERROR,486, getClassLoader());

  /**
   * Configuration entry %s has an invalid value for attribute ds-cfg-enabled:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_PWVALIDATOR_INVALID_ENABLED_VALUE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_PWVALIDATOR_INVALID_ENABLED_VALUE_487",CONFIG,SEVERE_ERROR,487, getClassLoader());

  /**
   * The requested change in the password validator class name from %s to %s in configuration entry %s cannot be dynamically applied.  This change will not take effect until the validator is disabled and re-enabled or the Directory Server is restarted
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> INFO_CONFIG_PWVALIDATOR_CLASS_ACTION_REQUIRED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"INFO_CONFIG_PWVALIDATOR_CLASS_ACTION_REQUIRED_488",CONFIG,INFORMATION,488, getClassLoader());

  /**
   * An error occurred while trying to initialize an instance of class %s as a password validator as defined in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_PWVALIDATOR_INITIALIZATION_FAILED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_PWVALIDATOR_INITIALIZATION_FAILED_489",CONFIG,MILD_ERROR,489, getClassLoader());

  /**
   * Unable to add a new password validator entry with DN %s because there is already a validator registered with that DN
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_PWVALIDATOR_EXISTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CONFIG_PWVALIDATOR_EXISTS_490",CONFIG,MILD_ERROR,490, getClassLoader());

  /**
   * The configuration for the password validator defined in configuration entry %s was not acceptable according to its internal validation.  However, no specific information is available regarding the problem(s) with the entry
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_PWVALIDATOR_UNACCEPTABLE_CONFIG =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_PWVALIDATOR_UNACCEPTABLE_CONFIG_491",CONFIG,SEVERE_ERROR,491, getClassLoader());

  /**
   * An error occurred while attempting to retrieve the password generator base entry cn=Password Generators,cn=config from the Directory Server configuration:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_PWGENERATOR_CANNOT_GET_BASE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"FATAL_ERR_CONFIG_PWGENERATOR_CANNOT_GET_BASE_492",CONFIG,FATAL_ERROR,492, getClassLoader());

  /**
   * The password generator configuration base cn=Password Generators,cn=config does not exist in the Directory Server configuration.  This entry must be present for the server to function properly
   */
  public static final MessageDescriptor.Arg0 WARN_CONFIG_PWGENERATOR_BASE_DOES_NOT_EXIST =
          new MessageDescriptor.Arg0(BASE,"SEVERE_WARN_CONFIG_PWGENERATOR_BASE_DOES_NOT_EXIST_493",CONFIG,SEVERE_WARNING,493, getClassLoader());

  /**
   * Configuration entry %s does not contain a valid password generator configuration:  %s.  It will be ignored
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_PWGENERATOR_ENTRY_UNACCEPTABLE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_PWGENERATOR_ENTRY_UNACCEPTABLE_494",CONFIG,SEVERE_ERROR,494, getClassLoader());

  /**
   * An error occurred while attempting to create a Directory Server password generator from the information in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_PWGENERATOR_CANNOT_CREATE_GENERATOR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_PWGENERATOR_CANNOT_CREATE_GENERATOR_495",CONFIG,SEVERE_ERROR,495, getClassLoader());

  /**
   * Configuration entry %s does not contain the ds-cfg-password-generator objectclass, which is required for password generator definitions
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_PWGENERATOR_INVALID_OBJECTCLASS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_PWGENERATOR_INVALID_OBJECTCLASS_496",CONFIG,SEVERE_ERROR,496, getClassLoader());

  /**
   * The fully-qualified name of the Java class that defines the Directory Server password generator.  If this is altered while the associated generator is enabled, then that generator must be disabled and re-enabled for the change to take effect
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_PWGENERATOR_DESCRIPTION_CLASS_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_PWGENERATOR_DESCRIPTION_CLASS_NAME_497",CONFIG,INFORMATION,497, getClassLoader());

  /**
   * Configuration entry %s does not contain a valid value for configuration attribute ds-cfg-java-class which specifies the fully-qualified class name for the associated password generator
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_PWGENERATOR_NO_CLASS_NAME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_PWGENERATOR_NO_CLASS_NAME_498",CONFIG,SEVERE_ERROR,498, getClassLoader());

  /**
   * Configuration entry %s has an invalid value for attribute ds-cfg-java-class:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_PWGENERATOR_INVALID_CLASS_NAME =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_PWGENERATOR_INVALID_CLASS_NAME_499",CONFIG,SEVERE_ERROR,499, getClassLoader());

  /**
   * Class %s specified in configuration entry %s does not contain a valid password generator implementation:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_PWGENERATOR_INVALID_CLASS =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_PWGENERATOR_INVALID_CLASS_500",CONFIG,SEVERE_ERROR,500, getClassLoader());

  /**
   * Indicates whether this Directory Server password generator should be enabled.  Changes to this attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_PWGENERATOR_DESCRIPTION_ENABLED =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_PWGENERATOR_DESCRIPTION_ENABLED_501",CONFIG,INFORMATION,501, getClassLoader());

  /**
   * Configuration entry %s does not contain a valid value for configuration attribute ds-cfg-enabled which indicates whether the password generator should be enabled for use in the Directory Server
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_PWGENERATOR_NO_ENABLED_ATTR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_PWGENERATOR_NO_ENABLED_ATTR_502",CONFIG,SEVERE_ERROR,502, getClassLoader());

  /**
   * Configuration entry %s has an invalid value for attribute ds-cfg-enabled:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_PWGENERATOR_INVALID_ENABLED_VALUE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_PWGENERATOR_INVALID_ENABLED_VALUE_503",CONFIG,SEVERE_ERROR,503, getClassLoader());

  /**
   * The requested change in the password generator class name from %s to %s in configuration entry %s cannot be dynamically applied.  This change will not take effect until the generator is disabled and re-enabled or the Directory Server is restarted
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> INFO_CONFIG_PWGENERATOR_CLASS_ACTION_REQUIRED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"INFO_CONFIG_PWGENERATOR_CLASS_ACTION_REQUIRED_504",CONFIG,INFORMATION,504, getClassLoader());

  /**
   * An error occurred while trying to initialize an instance of class %s as a password generator as defined in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_PWGENERATOR_INITIALIZATION_FAILED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_PWGENERATOR_INITIALIZATION_FAILED_505",CONFIG,MILD_ERROR,505, getClassLoader());

  /**
   * Unable to add a new password generator entry with DN %s because there is already a generator registered with that DN
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_PWGENERATOR_EXISTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CONFIG_PWGENERATOR_EXISTS_506",CONFIG,MILD_ERROR,506, getClassLoader());

  /**
   * The configuration for the password generator defined in configuration entry %s was not acceptable according to its internal validation.  However, no specific information is available regarding the problem(s) with the entry
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_PWGENERATOR_UNACCEPTABLE_CONFIG =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_PWGENERATOR_UNACCEPTABLE_CONFIG_507",CONFIG,SEVERE_ERROR,507, getClassLoader());

  /**
   * DN of the configuration entry that defines the default password policy for the Directory Server, which will be applied for all users for which a custom password policy is not defined.  This entry must exist and must specify a valid password policy configuration.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_CORE_DESCRIPTION_DEFAULT_PWPOLICY_DN =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_CORE_DESCRIPTION_DEFAULT_PWPOLICY_DN_508",CONFIG,INFORMATION,508, getClassLoader());

  /**
   * No default password policy was configured for the Directory Server.  This must be specified by the ds-cfg-default-password-policy attribute in configuration entry %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_CORE_NO_DEFAULT_PWPOLICY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_CORE_NO_DEFAULT_PWPOLICY_509",CONFIG,SEVERE_ERROR,509, getClassLoader());

  /**
   * Configuration entry %s has an invalid value for configuration attribute ds-cfg-default-password-policy (the value should a DN specifying the default password policy configuration entry):  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_CORE_INVALID_DEFAULT_PWPOLICY_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_CORE_INVALID_DEFAULT_PWPOLICY_DN_510",CONFIG,SEVERE_ERROR,510, getClassLoader());

  /**
   * The value %s for configuration attribute ds-cfg-default-password-policy does not refer to a valid password policy configuration entry
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_CORE_NO_SUCH_PWPOLICY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_CORE_NO_SUCH_PWPOLICY_511",CONFIG,SEVERE_ERROR,511, getClassLoader());

  /**
   * An error occurred while attempting to retrieve the password policy base entry cn=Password Policies,cn=config from the Directory Server configuration:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_PWPOLICY_CANNOT_GET_BASE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"FATAL_ERR_CONFIG_PWPOLICY_CANNOT_GET_BASE_512",CONFIG,FATAL_ERROR,512, getClassLoader());

  /**
   * The password policy configuration base cn=Password Policies,cn=config does not exist in the Directory Server configuration.  This entry must be present for the server to function properly
   */
  public static final MessageDescriptor.Arg0 ERR_CONFIG_PWPOLICY_BASE_DOES_NOT_EXIST =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CONFIG_PWPOLICY_BASE_DOES_NOT_EXIST_513",CONFIG,SEVERE_ERROR,513, getClassLoader());

  /**
   * No password policies have been defined below the cn=Password Policies,cn=config entry in the Directory Server configuration.  At least one password policy configuration must be defined
   */
  public static final MessageDescriptor.Arg0 ERR_CONFIG_PWPOLICY_NO_POLICIES =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CONFIG_PWPOLICY_NO_POLICIES_514",CONFIG,SEVERE_ERROR,514, getClassLoader());

  /**
   * The password policy defined in configuration entry %s is invalid:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_PWPOLICY_INVALID_POLICY_CONFIG =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_PWPOLICY_INVALID_POLICY_CONFIG_515",CONFIG,SEVERE_ERROR,515, getClassLoader());

  /**
   * The Directory Server default password policy is defined as %s, but that entry does not exist or is not below the password policy configuration base cn=Password Policies,cn=config
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_PWPOLICY_MISSING_DEFAULT_POLICY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_PWPOLICY_MISSING_DEFAULT_POLICY_516",CONFIG,SEVERE_ERROR,516, getClassLoader());

  /**
   * The specified entry %s is currently defined as the configuration entry for the default password policy.  The default password policy configuration entry may not be removed
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_CONFIG_PWPOLICY_CANNOT_DELETE_DEFAULT_POLICY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_CONFIG_PWPOLICY_CANNOT_DELETE_DEFAULT_POLICY_517",CONFIG,SEVERE_WARNING,517, getClassLoader());

  /**
   * Password policy entry %s has been removed from the Directory Server configuration.  Any user entries that explicitly reference this password policy will no longer be allowed to authenticate
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CONFIG_PWPOLICY_REMOVED_POLICY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CONFIG_PWPOLICY_REMOVED_POLICY_518",CONFIG,INFORMATION,518, getClassLoader());

  /**
   * An error occurred while attempting to retrieve the Directory Server access control configuration entry cn=Access Control Handler,cn=config:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_AUTHZ_CANNOT_GET_ENTRY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"FATAL_ERR_CONFIG_AUTHZ_CANNOT_GET_ENTRY_519",CONFIG,FATAL_ERROR,519, getClassLoader());

  /**
   * The Directory Server access control configuration entry cn=Access Control Handler,cn=config does not exist.  This entry must be present in the Directory Server configuration
   */
  public static final MessageDescriptor.Arg0 ERR_CONFIG_AUTHZ_ENTRY_DOES_NOT_EXIST =
          new MessageDescriptor.Arg0(BASE,"FATAL_ERR_CONFIG_AUTHZ_ENTRY_DOES_NOT_EXIST_520",CONFIG,FATAL_ERROR,520, getClassLoader());

  /**
   * The Directory Server access control configuration entry cn=Access Control Handler,cn=config does not have the correct object class.  This entry must have the object class ds-cfg-access-control-handler in order to be valid
   */
  public static final MessageDescriptor.Arg0 ERR_CONFIG_AUTHZ_ENTRY_DOES_NOT_HAVE_OBJECT_CLASS =
          new MessageDescriptor.Arg0(BASE,"FATAL_ERR_CONFIG_AUTHZ_ENTRY_DOES_NOT_HAVE_OBJECT_CLASS_521",CONFIG,FATAL_ERROR,521, getClassLoader());

  /**
   * Indicates whether access control is enabled and should be used by the server.  This attribute is mandatory
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_AUTHZ_DESCRIPTION_ENABLED =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_AUTHZ_DESCRIPTION_ENABLED_523",CONFIG,INFORMATION,523, getClassLoader());

  /**
   * The access control configuration entry %s does not contain attribute ds-cfg-enabled which indicates whether the access control is enabled for use
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_AUTHZ_NO_ENABLED_ATTR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"FATAL_ERR_CONFIG_AUTHZ_NO_ENABLED_ATTR_524",CONFIG,FATAL_ERROR,524, getClassLoader());

  /**
   * Access control has been disabled
   */
  public static final MessageDescriptor.Arg0 WARN_CONFIG_AUTHZ_DISABLED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_WARN_CONFIG_AUTHZ_DISABLED_525",CONFIG,SEVERE_WARNING,525, getClassLoader());

  /**
   * Access control has been enabled and will use the %s implementation
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_CONFIG_AUTHZ_ENABLED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_CONFIG_AUTHZ_ENABLED_526",CONFIG,NOTICE,526, getClassLoader());

  /**
   * An error occurred while attempting to determine whether the Directory Server access control as defined in configuration entry %s should be enabled:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_AUTHZ_UNABLE_TO_DETERMINE_ENABLED_STATE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"FATAL_ERR_CONFIG_AUTHZ_UNABLE_TO_DETERMINE_ENABLED_STATE_527",CONFIG,FATAL_ERROR,527, getClassLoader());

  /**
   * Fully-qualified name of the Java class that will provide the access control implementation for the Directory Server. This attribute is mandatory
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_AUTHZ_DESCRIPTION_CLASS =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_AUTHZ_DESCRIPTION_CLASS_528",CONFIG,INFORMATION,528, getClassLoader());

  /**
   * The access control configuration entry %s does not contain attribute ds-cfg-java-class which specifies the name of the Java class providing the access control implementation for the Directory Server
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_AUTHZ_NO_CLASS_ATTR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"FATAL_ERR_CONFIG_AUTHZ_NO_CLASS_ATTR_529",CONFIG,FATAL_ERROR,529, getClassLoader());

  /**
   * An error occurred while attempting to determine the name of the class used to provide the Directory Server access control implementation from configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_AUTHZ_UNABLE_TO_DETERMINE_CLASS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"FATAL_ERR_CONFIG_AUTHZ_UNABLE_TO_DETERMINE_CLASS_530",CONFIG,FATAL_ERROR,530, getClassLoader());

  /**
   * An error occurred while attempting to load class %s referenced in the access control configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_AUTHZ_UNABLE_TO_LOAD_CLASS =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"FATAL_ERR_CONFIG_AUTHZ_UNABLE_TO_LOAD_CLASS_531",CONFIG,FATAL_ERROR,531, getClassLoader());

  /**
   * The access control implementation class %s referenced in the access control configuration entry %s does not implement the %s interface:  %s
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> ERR_CONFIG_AUTHZ_BAD_CLASS =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"FATAL_ERR_CONFIG_AUTHZ_BAD_CLASS_532",CONFIG,FATAL_ERROR,532, getClassLoader());

  /**
   * An error occurred while attempting to instantiate class %s referenced in the access control configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_AUTHZ_UNABLE_TO_INSTANTIATE_HANDLER =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"FATAL_ERR_CONFIG_AUTHZ_UNABLE_TO_INSTANTIATE_HANDLER_533",CONFIG,FATAL_ERROR,533, getClassLoader());

  /**
   * An error occurred while attempting to initialize the Directory Server access control implementation referenced in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_AUTHZ_ERROR_INITIALIZING_HANDLER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"FATAL_ERR_CONFIG_AUTHZ_ERROR_INITIALIZING_HANDLER_534",CONFIG,FATAL_ERROR,534, getClassLoader());

  /**
   * An error occurred while attempting to retrieve the root DN base entry cn=Root DNs,cn=config from the Directory Server configuration:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_ROOTDN_CANNOT_GET_BASE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"FATAL_ERR_CONFIG_ROOTDN_CANNOT_GET_BASE_535",CONFIG,FATAL_ERROR,535, getClassLoader());

  /**
   * The password policy configuration base cn=Root DNs,cn=config does not exist in the Directory Server configuration.  This entry must be present for the server to function properly
   */
  public static final MessageDescriptor.Arg0 ERR_CONFIG_ROOTDN_BASE_DOES_NOT_EXIST =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CONFIG_ROOTDN_BASE_DOES_NOT_EXIST_536",CONFIG,SEVERE_ERROR,536, getClassLoader());

  /**
   * Configuration entry %s does not contain a valid root DN configuration:  %s.  It will be ignored
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_ROOTDN_ENTRY_UNACCEPTABLE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_ROOTDN_ENTRY_UNACCEPTABLE_537",CONFIG,SEVERE_ERROR,537, getClassLoader());

  /**
   * An error occurred while attempting to create a Directory Server root DN from the information in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_ROOTDN_CANNOT_CREATE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_ROOTDN_CANNOT_CREATE_538",CONFIG,SEVERE_ERROR,538, getClassLoader());

  /**
   * Configuration entry %s does not contain the ds-cfg-root-dn-user objectclass, which is required for Directory Server root DN definitions
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_ROOTDN_INVALID_OBJECTCLASS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_ROOTDN_INVALID_OBJECTCLASS_539",CONFIG,SEVERE_ERROR,539, getClassLoader());

  /**
   * Specifies one or more alternate bind DNs that may be used to authenticate as the associated root DN, in addition to the actual DN of the root DN configuration entry. Alternate bind DNs must not conflict with the DNs of any other entries in the directory, nor can they conflict with other alternate bind DNs configured for other root DNs.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_ROOTDN_DESCRIPTION_ALTERNATE_BIND_DN =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_ROOTDN_DESCRIPTION_ALTERNATE_BIND_DN_540",CONFIG,INFORMATION,540, getClassLoader());

  /**
   * Unable to register "%s" as an alternate bind DN for user "%s" because it is already registered as an alternate bind DN for root user "%s"
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_ROOTDN_CONFLICTING_MAPPING =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_ROOTDN_CONFLICTING_MAPPING_541",CONFIG,SEVERE_ERROR,541, getClassLoader());

  /**
   * An error occurred while trying to parse the set of alternate bind DNs for root user %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_ROOTDN_CANNOT_PARSE_ALTERNATE_BIND_DNS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_ROOTDN_CANNOT_PARSE_ALTERNATE_BIND_DNS_542",CONFIG,SEVERE_ERROR,542, getClassLoader());

  /**
   * An error occurred while trying to register"%s" as an alternate bind DN for root user "%s":  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_ROOTDN_CANNOT_REGISTER_ALTERNATE_BIND_DN =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_ROOTDN_CANNOT_REGISTER_ALTERNATE_BIND_DN_543",CONFIG,SEVERE_ERROR,543, getClassLoader());

  /**
   * Unable to add root DN entry %s because another root user is already registered with that DN
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_ROOTDN_EXISTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_ROOTDN_EXISTS_544",CONFIG,SEVERE_ERROR,544, getClassLoader());

  /**
   * An error occurred while attempting to retrieve the account status notification handler base entry cn=Account Status Notification Handlers,cn=config from the Directory Server configuration:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_ACCTNOTHANDLER_CANNOT_GET_BASE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"FATAL_ERR_CONFIG_ACCTNOTHANDLER_CANNOT_GET_BASE_545",CONFIG,FATAL_ERROR,545, getClassLoader());

  /**
   * The account status notification handler configuration base cn=Account Status Notification Handlers,cn=config does not exist in the Directory Server configuration. This entry must be present for the server to function properly
   */
  public static final MessageDescriptor.Arg0 WARN_CONFIG_ACCTNOTHANDLER_BASE_DOES_NOT_EXIST =
          new MessageDescriptor.Arg0(BASE,"SEVERE_WARN_CONFIG_ACCTNOTHANDLER_BASE_DOES_NOT_EXIST_546",CONFIG,SEVERE_WARNING,546, getClassLoader());

  /**
   * Configuration entry %s does not contain a valid account status notification handler configuration:  %s.  It will be ignored
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_ACCTNOTHANDLER_ENTRY_UNACCEPTABLE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_ACCTNOTHANDLER_ENTRY_UNACCEPTABLE_547",CONFIG,SEVERE_ERROR,547, getClassLoader());

  /**
   * An error occurred while attempting to create a Directory Server account status notification handler from the information in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_ACCTNOTHANDLER_CANNOT_CREATE_HANDLER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_ACCTNOTHANDLER_CANNOT_CREATE_HANDLER_548",CONFIG,SEVERE_ERROR,548, getClassLoader());

  /**
   * Configuration entry %s does not contain the ds-cfg-account-status-notification-handler objectclass, which is required for account status notification handler definitions
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_ACCTNOTHANDLER_INVALID_OBJECTCLASS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_ACCTNOTHANDLER_INVALID_OBJECTCLASS_549",CONFIG,SEVERE_ERROR,549, getClassLoader());

  /**
   * The fully-qualified name of the Java class that defines the Directory Server account status notification handler.  If this is altered while the associated notification handler is enabled, then that handler must be disabled and re-enabled for the change to take effect
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_ACCTNOTHANDLER_DESCRIPTION_CLASS_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_ACCTNOTHANDLER_DESCRIPTION_CLASS_NAME_550",CONFIG,INFORMATION,550, getClassLoader());

  /**
   * Configuration entry %s does not contain a valid value for configuration attribute ds-cfg-java-class which specifies the fully-qualified class name for the associated account status notification handler
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_ACCTNOTHANDLER_NO_CLASS_NAME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_ACCTNOTHANDLER_NO_CLASS_NAME_551",CONFIG,SEVERE_ERROR,551, getClassLoader());

  /**
   * Configuration entry %s has an invalid value for attribute ds-cfg-java-class:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_ACCTNOTHANDLER_INVALID_CLASS_NAME =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_ACCTNOTHANDLER_INVALID_CLASS_NAME_552",CONFIG,SEVERE_ERROR,552, getClassLoader());

  /**
   * Class %s specified in configuration entry %s does not contain a valid account status notification handler implementation:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_ACCTNOTHANDLER_INVALID_CLASS =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_ACCTNOTHANDLER_INVALID_CLASS_553",CONFIG,SEVERE_ERROR,553, getClassLoader());

  /**
   * Indicates whether this Directory Server account status notification handler should be enabled. Changes to this attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_ACCTNOTHANDLER_DESCRIPTION_ENABLED =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_ACCTNOTHANDLER_DESCRIPTION_ENABLED_554",CONFIG,INFORMATION,554, getClassLoader());

  /**
   * Configuration entry %s does not contain a valid value for configuration attribute ds-cfg-enabled which indicates whether the account status notification handler should be enabled for use in the Directory Server
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_ACCTNOTHANDLER_NO_ENABLED_ATTR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_ACCTNOTHANDLER_NO_ENABLED_ATTR_555",CONFIG,SEVERE_ERROR,555, getClassLoader());

  /**
   * Configuration entry %s has an invalid value for attribute ds-cfg-enabled:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_ACCTNOTHANDLER_INVALID_ENABLED_VALUE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_ACCTNOTHANDLER_INVALID_ENABLED_VALUE_556",CONFIG,SEVERE_ERROR,556, getClassLoader());

  /**
   * The requested change in the account status notification handler class name from %s to %s in configuration entry %s cannot be dynamically applied.  This change will not take effect until the notification handler is disabled and re-enabled or the Directory Server is restarted
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> INFO_CONFIG_ACCTNOTHANDLER_CLASS_ACTION_REQUIRED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"INFO_CONFIG_ACCTNOTHANDLER_CLASS_ACTION_REQUIRED_557",CONFIG,INFORMATION,557, getClassLoader());

  /**
   * An error occurred while trying to initialize an instance of class %s as an account status notification handler as defined in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_ACCTNOTHANDLER_INITIALIZATION_FAILED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_ACCTNOTHANDLER_INITIALIZATION_FAILED_558",CONFIG,MILD_ERROR,558, getClassLoader());

  /**
   * Unable to add a new account status notification handler entry with DN %s because there is already a notification handler registered with that DN
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_ACCTNOTHANDLER_EXISTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CONFIG_ACCTNOTHANDLER_EXISTS_559",CONFIG,MILD_ERROR,559, getClassLoader());

  /**
   * The configuration for the account status notification handler defined in configuration entry %s was not acceptable according to its internal validation.  However, no specific information is available regarding the problem(s) with the entry
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_ACCTNOTHANDLER_UNACCEPTABLE_CONFIG =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_ACCTNOTHANDLER_UNACCEPTABLE_CONFIG_560",CONFIG,SEVERE_ERROR,560, getClassLoader());

  /**
   * Default maximum number of candidate entries checked for matches when processing a search operation.  This may be overridden on a per-user basis by including the ds-rlim-lookthrough-limit operational attribute in the user's entry. Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_CORE_DESCRIPTION_LOOKTHROUGH_LIMIT =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_CORE_DESCRIPTION_LOOKTHROUGH_LIMIT_561",CONFIG,INFORMATION,561, getClassLoader());

  /**
   * Configuration entry %s has an invalid value for configuration attribute ds-cfg-lookthrough-limit (It should be a positive integer value specifying the lookthrough limit to use, or a value of 0 or -1 to indicate that no limit should be enforced):  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_CORE_INVALID_LOOKTHROUGH_LIMIT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_CORE_INVALID_LOOKTHROUGH_LIMIT_562",CONFIG,SEVERE_ERROR,562, getClassLoader());

  /**
   * An error occurred while attempting to apply the changes contained in file %s to the server configuration at startup:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_UNABLE_TO_APPLY_STARTUP_CHANGES =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"FATAL_ERR_CONFIG_UNABLE_TO_APPLY_STARTUP_CHANGES_563",CONFIG,FATAL_ERROR,563, getClassLoader());

  /**
   * Unable to apply a change at server startup:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_ERROR_APPLYING_STARTUP_CHANGE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"FATAL_ERR_CONFIG_ERROR_APPLYING_STARTUP_CHANGE_564",CONFIG,FATAL_ERROR,564, getClassLoader());

  /**
   * One or more errors occurred while applying changes on server startup
   */
  public static final MessageDescriptor.Arg0 ERR_CONFIG_UNABLE_TO_APPLY_CHANGES_FILE =
          new MessageDescriptor.Arg0(BASE,"FATAL_ERR_CONFIG_UNABLE_TO_APPLY_CHANGES_FILE_565",CONFIG,FATAL_ERROR,565, getClassLoader());

  /**
   * The permissions used for the directory containing the backend database files
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_DESCRIPTION_BACKEND_MODE =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_DESCRIPTION_BACKEND_MODE_566",CONFIG,INFORMATION,566, getClassLoader());

  /**
   * Configuration entry %s does not contain a valid value for configuration attribute ds-cfg-db-directory-permissions (It should be an UNIX permission mode in three-digit octal notation.)
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_BACKEND_MODE_INVALID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_BACKEND_MODE_INVALID_567",CONFIG,SEVERE_ERROR,567, getClassLoader());

  /**
   * Invalid UNIX file permissions %s does not allow read and write access to the backend database directory by the backend
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_BACKEND_INSANE_MODE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_BACKEND_INSANE_MODE_568",CONFIG,SEVERE_ERROR,568, getClassLoader());

  /**
   * Default maximum length of time that should be allowed when processing a search operation. This may be overridden on a per-user basis by including the ds-rlim-time-limit operational attribute in the user's entry.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_CORE_DESCRIPTION_TIME_LIMIT =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_CORE_DESCRIPTION_TIME_LIMIT_569",CONFIG,INFORMATION,569, getClassLoader());

  /**
   * Configuration entry %s has an invalid value for configuration attribute ds-cfg-time-limit (it should be an integer value followed by a space and a time unit of seconds, minutes, hours, days, or weeks):  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_CORE_INVALID_TIME_LIMIT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_CORE_INVALID_TIME_LIMIT_570",CONFIG,SEVERE_ERROR,570, getClassLoader());

  /**
   * No default password policy is configured for the Directory Server.  The default password policy must be specified by the ds-cfg-default-password-policy attribute in the cn=config entry
   */
  public static final MessageDescriptor.Arg0 ERR_CONFIG_PWPOLICY_NO_DEFAULT_POLICY =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CONFIG_PWPOLICY_NO_DEFAULT_POLICY_571",CONFIG,SEVERE_ERROR,571, getClassLoader());

  /**
   * An error occurred while attempting to register backend %s with the Directory Server:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_CONFIG_BACKEND_CANNOT_REGISTER_BACKEND =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_CONFIG_BACKEND_CANNOT_REGISTER_BACKEND_572",CONFIG,SEVERE_WARNING,572, getClassLoader());

  /**
   * An error occurred while trying to create the configuration archive directory %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_FILE_CANNOT_CREATE_ARCHIVE_DIR_NO_REASON =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_FILE_CANNOT_CREATE_ARCHIVE_DIR_NO_REASON_573",CONFIG,SEVERE_ERROR,573, getClassLoader());

  /**
   * An error occurred while trying to create the configuration archive directory %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_FILE_CANNOT_CREATE_ARCHIVE_DIR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_FILE_CANNOT_CREATE_ARCHIVE_DIR_574",CONFIG,SEVERE_ERROR,574, getClassLoader());

  /**
   * An error occurred while trying to write the current configuration to the configuration archive: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_FILE_CANNOT_WRITE_CONFIG_ARCHIVE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_FILE_CANNOT_WRITE_CONFIG_ARCHIVE_575",CONFIG,SEVERE_ERROR,575, getClassLoader());

  /**
   * Indicates whether the Directory Server should reject  requests from unauthenticated clients. If this is set to "true", then unauthenticated clients will only be allowed to send bind and StartTLS requests. Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_CORE_DESCRIPTION_REJECT_UNAUTHENTICATED_REQUESTS =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_CORE_DESCRIPTION_REJECT_UNAUTHENTICATED_REQUESTS_576",CONFIG,INFORMATION,576, getClassLoader());

  /**
   * Configuration entry %s has an invalid value for configuration attribute ds-cfg-reject-unauthenticated-requests(the value should be either true or false)
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_CORE_REJECT_UNAUTHENTICATED_REQUESTS_INVALID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_CORE_REJECT_UNAUTHENTICATED_REQUESTS_INVALID_577",CONFIG,SEVERE_ERROR,577, getClassLoader());

  /**
   * An error occurred while attempting to retrieve the group implementation base entry cn=Group Implementations,cn=config from the Directory Server configuration:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_GROUP_CANNOT_GET_BASE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"FATAL_ERR_CONFIG_GROUP_CANNOT_GET_BASE_578",CONFIG,FATAL_ERROR,578, getClassLoader());

  /**
   * The group implementation configuration base cn=Group Implementations,cn=config does not exist in the Directory Server configuration.  This entry must be present for the server to function properly
   */
  public static final MessageDescriptor.Arg0 WARN_CONFIG_GROUP_BASE_DOES_NOT_EXIST =
          new MessageDescriptor.Arg0(BASE,"SEVERE_WARN_CONFIG_GROUP_BASE_DOES_NOT_EXIST_579",CONFIG,SEVERE_WARNING,579, getClassLoader());

  /**
   * Configuration entry %s does not contain a valid group implementation configuration:  %s.  It will be ignored
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_GROUP_ENTRY_UNACCEPTABLE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_GROUP_ENTRY_UNACCEPTABLE_580",CONFIG,SEVERE_ERROR,580, getClassLoader());

  /**
   * An error occurred while attempting to create a Directory Server group implementation from the information in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_GROUP_CANNOT_CREATE_IMPLEMENTATION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_GROUP_CANNOT_CREATE_IMPLEMENTATION_581",CONFIG,SEVERE_ERROR,581, getClassLoader());

  /**
   * Configuration entry %s does not contain the ds-cfg-group-implementation objectclass, which is required for group implementation definitions
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_GROUP_INVALID_OBJECTCLASS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_GROUP_INVALID_OBJECTCLASS_582",CONFIG,SEVERE_ERROR,582, getClassLoader());

  /**
   * The fully-qualified name of the Java class that defines the Directory Server group implementation.  If this is while the associated implementation is enabled, then that group implementation must be disabled and re-enabled for the change to take effect
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_GROUP_DESCRIPTION_CLASS_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_GROUP_DESCRIPTION_CLASS_NAME_583",CONFIG,INFORMATION,583, getClassLoader());

  /**
   * Configuration entry %s does not contain a valid value for configuration attribute ds-cfg-java-class which specifies the fully-qualified class name for the associated group implementation
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_GROUP_NO_CLASS_NAME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_GROUP_NO_CLASS_NAME_584",CONFIG,SEVERE_ERROR,584, getClassLoader());

  /**
   * Configuration entry %s has an invalid value for attribute ds-cfg-java-class:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_GROUP_INVALID_CLASS_NAME =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_GROUP_INVALID_CLASS_NAME_585",CONFIG,SEVERE_ERROR,585, getClassLoader());

  /**
   * Class %s specified in configuration entry %s does not contain a valid group implementation:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_GROUP_INVALID_CLASS =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_GROUP_INVALID_CLASS_586",CONFIG,SEVERE_ERROR,586, getClassLoader());

  /**
   * Indicates whether this Directory Server group implementation should be enabled.  Changes to this attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_GROUP_DESCRIPTION_ENABLED =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_GROUP_DESCRIPTION_ENABLED_587",CONFIG,INFORMATION,587, getClassLoader());

  /**
   * Configuration entry %s does not contain a valid value for configuration attribute ds-cfg-enabled which indicates whether the group implementation should be enabled for use in the Directory Server
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_GROUP_NO_ENABLED_ATTR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_GROUP_NO_ENABLED_ATTR_588",CONFIG,SEVERE_ERROR,588, getClassLoader());

  /**
   * Configuration entry %s has an invalid value for attribute ds-cfg-enabled:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_GROUP_INVALID_ENABLED_VALUE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_GROUP_INVALID_ENABLED_VALUE_589",CONFIG,SEVERE_ERROR,589, getClassLoader());

  /**
   * The requested change in the group implementation class name from %s to %s in configuration entry %s cannot be dynamically applied.  This change will not take effect until the group implementation is disabled and re-enabled or the Directory Server is restarted
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> INFO_CONFIG_GROUP_CLASS_ACTION_REQUIRED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"INFO_CONFIG_GROUP_CLASS_ACTION_REQUIRED_590",CONFIG,INFORMATION,590, getClassLoader());

  /**
   * An error occurred while trying to initialize an instance of class %s as a group implementation as in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_GROUP_INITIALIZATION_FAILED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_GROUP_INITIALIZATION_FAILED_591",CONFIG,MILD_ERROR,591, getClassLoader());

  /**
   * Unable to add a new group implementation entry with DN %s because there is already a group implementation registered with that DN
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_GROUP_EXISTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CONFIG_GROUP_EXISTS_592",CONFIG,MILD_ERROR,592, getClassLoader());

  /**
   * The configuration for the group implementation defined in configuration entry %s was not acceptable according to its internal validation.  However, no specific information is available regarding the problem(s) with the entry
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_GROUP_UNACCEPTABLE_CONFIG =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_GROUP_UNACCEPTABLE_CONFIG_593",CONFIG,SEVERE_ERROR,593, getClassLoader());

  /**
   * Set of privileges that should automatically be assigned to root users when they authenticate to the server
   */
  public static final MessageDescriptor.Arg0 ERR_CONFIG_ROOTDN_DESCRIPTION_ROOT_PRIVILEGE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CONFIG_ROOTDN_DESCRIPTION_ROOT_PRIVILEGE_594",CONFIG,SEVERE_ERROR,594, getClassLoader());

  /**
   * The set of default root privileges contained in configuration attribute %s of entry %s contains an unrecognized privilege %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> WARN_CONFIG_ROOTDN_UNRECOGNIZED_PRIVILEGE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_WARN_CONFIG_ROOTDN_UNRECOGNIZED_PRIVILEGE_595",CONFIG,SEVERE_WARNING,595, getClassLoader());

  /**
   * An error occurred while attempting to determine the set of privileges that root users should be granted by default:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_ROOTDN_ERROR_DETERMINING_ROOT_PRIVILEGES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_ROOTDN_ERROR_DETERMINING_ROOT_PRIVILEGES_596",CONFIG,SEVERE_ERROR,596, getClassLoader());

  /**
   * The set of privileges that will automatically be assigned to root users has been updated.  This new privilege set will not apply to any existing connection already authenticated as a root user, but will used for any subsequent root user authentications
   */
  public static final MessageDescriptor.Arg0 INFO_CONFIG_ROOTDN_UPDATED_PRIVILEGES =
          new MessageDescriptor.Arg0(BASE,"INFO_CONFIG_ROOTDN_UPDATED_PRIVILEGES_597",CONFIG,INFORMATION,597, getClassLoader());

  /**
   * You do not have sufficient privileges to perform add operations in the Directory Server configuration
   */
  public static final MessageDescriptor.Arg0 ERR_CONFIG_FILE_ADD_INSUFFICIENT_PRIVILEGES =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CONFIG_FILE_ADD_INSUFFICIENT_PRIVILEGES_598",CONFIG,MILD_ERROR,598, getClassLoader());

  /**
   * You do not have sufficient privileges to perform delete operations in the Directory Server configuration
   */
  public static final MessageDescriptor.Arg0 ERR_CONFIG_FILE_DELETE_INSUFFICIENT_PRIVILEGES =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CONFIG_FILE_DELETE_INSUFFICIENT_PRIVILEGES_599",CONFIG,MILD_ERROR,599, getClassLoader());

  /**
   * You do not have sufficient privileges to perform modify operations in the Directory Server configuration
   */
  public static final MessageDescriptor.Arg0 ERR_CONFIG_FILE_MODIFY_INSUFFICIENT_PRIVILEGES =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CONFIG_FILE_MODIFY_INSUFFICIENT_PRIVILEGES_600",CONFIG,MILD_ERROR,600, getClassLoader());

  /**
   * You do not have sufficient privileges to perform modify DN operations in the Directory Server configuration
   */
  public static final MessageDescriptor.Arg0 ERR_CONFIG_FILE_MODDN_INSUFFICIENT_PRIVILEGES =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CONFIG_FILE_MODDN_INSUFFICIENT_PRIVILEGES_601",CONFIG,MILD_ERROR,601, getClassLoader());

  /**
   * You do not have sufficient privileges to perform search operations in the Directory Server configuration
   */
  public static final MessageDescriptor.Arg0 ERR_CONFIG_FILE_SEARCH_INSUFFICIENT_PRIVILEGES =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CONFIG_FILE_SEARCH_INSUFFICIENT_PRIVILEGES_602",CONFIG,MILD_ERROR,602, getClassLoader());

  /**
   * You do not have sufficient privileges to change the set of default root privileges
   */
  public static final MessageDescriptor.Arg0 ERR_CONFIG_FILE_MODIFY_PRIVS_INSUFFICIENT_PRIVILEGES =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CONFIG_FILE_MODIFY_PRIVS_INSUFFICIENT_PRIVILEGES_603",CONFIG,MILD_ERROR,603, getClassLoader());

  /**
   * An error occurred while attempting to retrieve the certificate mapper base entry cn=Certificate Mappers,cn=config from the Directory Server configuration:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_CERTMAPPER_CANNOT_GET_BASE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"FATAL_ERR_CONFIG_CERTMAPPER_CANNOT_GET_BASE_604",CONFIG,FATAL_ERROR,604, getClassLoader());

  /**
   * The certificate mapper configuration base cn=Certificate Mappers,cn=config does not exist in the Directory Server configuration.  This entry must be present for the server to function properly
   */
  public static final MessageDescriptor.Arg0 WARN_CONFIG_CERTMAPPER_BASE_DOES_NOT_EXIST =
          new MessageDescriptor.Arg0(BASE,"SEVERE_WARN_CONFIG_CERTMAPPER_BASE_DOES_NOT_EXIST_605",CONFIG,SEVERE_WARNING,605, getClassLoader());

  /**
   * Configuration entry %s does not contain a valid certificate mapper configuration:  %s.  It will be ignored
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_CERTMAPPER_ENTRY_UNACCEPTABLE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_CERTMAPPER_ENTRY_UNACCEPTABLE_606",CONFIG,SEVERE_ERROR,606, getClassLoader());

  /**
   * An error occurred while attempting to create a Directory Server certificate mapper from the information in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_CERTMAPPER_CANNOT_CREATE_MAPPER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_CERTMAPPER_CANNOT_CREATE_MAPPER_607",CONFIG,SEVERE_ERROR,607, getClassLoader());

  /**
   * Configuration entry %s does not contain the ds-cfg-certificate-mapper objectclass, which is required for certificate mapper definitions
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_CERTMAPPER_INVALID_OBJECTCLASS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_CERTMAPPER_INVALID_OBJECTCLASS_608",CONFIG,SEVERE_ERROR,608, getClassLoader());

  /**
   * Configuration entry %s does not contain a valid value for configuration attribute ds-cfg-java-class which specifies the fully-qualified class name for the associated certificate mapper
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_CERTMAPPER_NO_CLASS_NAME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_CERTMAPPER_NO_CLASS_NAME_609",CONFIG,SEVERE_ERROR,609, getClassLoader());

  /**
   * Configuration entry %s has an invalid value for attribute ds-cfg-java-class:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_CERTMAPPER_INVALID_CLASS_NAME =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_CERTMAPPER_INVALID_CLASS_NAME_610",CONFIG,SEVERE_ERROR,610, getClassLoader());

  /**
   * Class %s specified in configuration entry %s does not contain a valid certificate mapper implementation:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_CERTMAPPER_INVALID_CLASS =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_CERTMAPPER_INVALID_CLASS_611",CONFIG,SEVERE_ERROR,611, getClassLoader());

  /**
   * Configuration entry %s has an invalid value for attribute ds-cfg-enabled:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_CERTMAPPER_INVALID_ENABLED_VALUE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_CERTMAPPER_INVALID_ENABLED_VALUE_612",CONFIG,SEVERE_ERROR,612, getClassLoader());

  /**
   * The requested change in the certificate mapper class name from %s to %s in configuration entry %s cannot be dynamically applied.  This change will not take effect until the mapper is disabled and re-enabled or the Directory Server is restarted
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> INFO_CONFIG_CERTMAPPER_CLASS_ACTION_REQUIRED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"INFO_CONFIG_CERTMAPPER_CLASS_ACTION_REQUIRED_613",CONFIG,INFORMATION,613, getClassLoader());

  /**
   * An error occurred while trying to initialize an instance of class %s as a certificate mapper as defined in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_CERTMAPPER_INITIALIZATION_FAILED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_CERTMAPPER_INITIALIZATION_FAILED_614",CONFIG,MILD_ERROR,614, getClassLoader());

  /**
   * Unable to add a new certificate mapper entry with DN %s because there is already a mapper registered with that DN
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_CERTMAPPER_EXISTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CONFIG_CERTMAPPER_EXISTS_615",CONFIG,MILD_ERROR,615, getClassLoader());

  /**
   * The configuration for the certificate mapper defined in configuration entry %s was not acceptable according to its internal validation.  However, no specific information is available regarding the problem(s) with the entry
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_CERTMAPPER_UNACCEPTABLE_CONFIG =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_CERTMAPPER_UNACCEPTABLE_CONFIG_616",CONFIG,SEVERE_ERROR,616, getClassLoader());

  /**
   * An error occurred while attempting to retrieve the key manager provider base entry cn=Key Manager Providers,cn=config from the Directory Server configuration:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_KEYMANAGER_CANNOT_GET_BASE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"FATAL_ERR_CONFIG_KEYMANAGER_CANNOT_GET_BASE_617",CONFIG,FATAL_ERROR,617, getClassLoader());

  /**
   * The key manager provider configuration base cn=Key Manager Providers,cn=config does not exist in the Directory Server configuration.  This entry must be present for the server to function properly
   */
  public static final MessageDescriptor.Arg0 WARN_CONFIG_KEYMANAGER_BASE_DOES_NOT_EXIST =
          new MessageDescriptor.Arg0(BASE,"SEVERE_WARN_CONFIG_KEYMANAGER_BASE_DOES_NOT_EXIST_618",CONFIG,SEVERE_WARNING,618, getClassLoader());

  /**
   * Configuration entry %s does not contain a valid key manager provider configuration:  %s.  It will be ignored
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_KEYMANAGER_ENTRY_UNACCEPTABLE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_KEYMANAGER_ENTRY_UNACCEPTABLE_619",CONFIG,SEVERE_ERROR,619, getClassLoader());

  /**
   * An error occurred while attempting to create a Directory Server key manager provider from the information in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_KEYMANAGER_CANNOT_CREATE_PROVIDER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_KEYMANAGER_CANNOT_CREATE_PROVIDER_620",CONFIG,SEVERE_ERROR,620, getClassLoader());

  /**
   * Configuration entry %s does not contain the ds-cfg-key-manager-provider objectclass, which is required for key manager provider definitions
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_KEYMANAGER_INVALID_OBJECTCLASS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_KEYMANAGER_INVALID_OBJECTCLASS_621",CONFIG,SEVERE_ERROR,621, getClassLoader());

  /**
   * Configuration entry %s does not contain a valid value for configuration attribute ds-cfg-java-class which specifies the fully-qualified class name for the associated key manager provider
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_KEYMANAGER_NO_CLASS_NAME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_KEYMANAGER_NO_CLASS_NAME_622",CONFIG,SEVERE_ERROR,622, getClassLoader());

  /**
   * Configuration entry %s has an invalid value for attribute ds-cfg-java-class:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_KEYMANAGER_INVALID_CLASS_NAME =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_KEYMANAGER_INVALID_CLASS_NAME_623",CONFIG,SEVERE_ERROR,623, getClassLoader());

  /**
   * Class %s specified in configuration entry %s does not contain a valid key manager provider implementation:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_KEYMANAGER_INVALID_CLASS =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_KEYMANAGER_INVALID_CLASS_624",CONFIG,SEVERE_ERROR,624, getClassLoader());

  /**
   * Configuration entry %s has an invalid value for attribute ds-cfg-enabled:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_KEYMANAGER_INVALID_ENABLED_VALUE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_KEYMANAGER_INVALID_ENABLED_VALUE_625",CONFIG,SEVERE_ERROR,625, getClassLoader());

  /**
   * The requested change in the key manager provider class name from %s to %s in configuration entry %s cannot be dynamically applied.  This change will not take effect until the provider is disabled and re-enabled or the Directory Server is restarted
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> INFO_CONFIG_KEYMANAGER_CLASS_ACTION_REQUIRED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"INFO_CONFIG_KEYMANAGER_CLASS_ACTION_REQUIRED_626",CONFIG,INFORMATION,626, getClassLoader());

  /**
   * An error occurred while trying to initialize an instance of class %s as a key manager provider as defined in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_KEYMANAGER_INITIALIZATION_FAILED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_KEYMANAGER_INITIALIZATION_FAILED_627",CONFIG,MILD_ERROR,627, getClassLoader());

  /**
   * Unable to add a new key manager provider entry with DN %s because there is already a provider registered with that DN
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_KEYMANAGER_EXISTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CONFIG_KEYMANAGER_EXISTS_628",CONFIG,MILD_ERROR,628, getClassLoader());

  /**
   * The configuration for the key manager provider defined in configuration entry %s was not acceptable according to its internal validation.  However, no specific information is available regarding the problem(s) with the entry
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_KEYMANAGER_UNACCEPTABLE_CONFIG =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_KEYMANAGER_UNACCEPTABLE_CONFIG_629",CONFIG,SEVERE_ERROR,629, getClassLoader());

  /**
   * An error occurred while attempting to retrieve the trust manager provider base entry cn=Trust Manager Providers,cn=config from the Directory Server configuration:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_TRUSTMANAGER_CANNOT_GET_BASE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"FATAL_ERR_CONFIG_TRUSTMANAGER_CANNOT_GET_BASE_630",CONFIG,FATAL_ERROR,630, getClassLoader());

  /**
   * The trust manager provider configuration base cn=Trust Manager Providers,cn=config does not exist in the Directory Server configuration.  This entry must be present for the server to function properly
   */
  public static final MessageDescriptor.Arg0 WARN_CONFIG_TRUSTMANAGER_BASE_DOES_NOT_EXIST =
          new MessageDescriptor.Arg0(BASE,"SEVERE_WARN_CONFIG_TRUSTMANAGER_BASE_DOES_NOT_EXIST_631",CONFIG,SEVERE_WARNING,631, getClassLoader());

  /**
   * Configuration entry %s does not contain a valid trust manager provider configuration:  %s.  It will be ignored
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_TRUSTMANAGER_ENTRY_UNACCEPTABLE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_TRUSTMANAGER_ENTRY_UNACCEPTABLE_632",CONFIG,SEVERE_ERROR,632, getClassLoader());

  /**
   * An error occurred while attempting to create a Directory Server trust manager provider from the information in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_TRUSTMANAGER_CANNOT_CREATE_PROVIDER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_TRUSTMANAGER_CANNOT_CREATE_PROVIDER_633",CONFIG,SEVERE_ERROR,633, getClassLoader());

  /**
   * Configuration entry %s does not contain the ds-cfg-trust-manager-provider objectclass, which is required for trust manager provider definitions
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_TRUSTMANAGER_INVALID_OBJECTCLASS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_TRUSTMANAGER_INVALID_OBJECTCLASS_634",CONFIG,SEVERE_ERROR,634, getClassLoader());

  /**
   * Configuration entry %s does not contain a valid value for configuration attribute ds-cfg-java-class which specifies the fully-qualified class name for the associated trust manager provider
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_TRUSTMANAGER_NO_CLASS_NAME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_TRUSTMANAGER_NO_CLASS_NAME_635",CONFIG,SEVERE_ERROR,635, getClassLoader());

  /**
   * Configuration entry %s has an invalid value for attribute ds-cfg-java-class:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_TRUSTMANAGER_INVALID_CLASS_NAME =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_TRUSTMANAGER_INVALID_CLASS_NAME_636",CONFIG,SEVERE_ERROR,636, getClassLoader());

  /**
   * Class %s specified in configuration entry %s does not contain a valid trust manager provider implementation:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_TRUSTMANAGER_INVALID_CLASS =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_TRUSTMANAGER_INVALID_CLASS_637",CONFIG,SEVERE_ERROR,637, getClassLoader());

  /**
   * Configuration entry %s has an invalid value for attribute ds-cfg-enabled: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_TRUSTMANAGER_INVALID_ENABLED_VALUE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_TRUSTMANAGER_INVALID_ENABLED_VALUE_638",CONFIG,SEVERE_ERROR,638, getClassLoader());

  /**
   * The requested change in the trust manager provider class name from %s to %s in configuration entry %s cannot be dynamically applied.  This change will not take effect until the provider is disabled and re-enabled or the Directory Server is restarted
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> INFO_CONFIG_TRUSTMANAGER_CLASS_ACTION_REQUIRED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"INFO_CONFIG_TRUSTMANAGER_CLASS_ACTION_REQUIRED_639",CONFIG,INFORMATION,639, getClassLoader());

  /**
   * An error occurred while trying to initialize an instance of class %s as a trust manager provider as defined in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_TRUSTMANAGER_INITIALIZATION_FAILED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_TRUSTMANAGER_INITIALIZATION_FAILED_640",CONFIG,MILD_ERROR,640, getClassLoader());

  /**
   * Unable to add a new trust manager provider entry with DN %s because there is already a provider registered with that DN
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_TRUSTMANAGER_EXISTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CONFIG_TRUSTMANAGER_EXISTS_641",CONFIG,MILD_ERROR,641, getClassLoader());

  /**
   * The configuration for the trust manager provider defined in configuration entry %s was not acceptable according to its internal validation.  However, no specific information is available regarding the problem(s) with the entry
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_TRUSTMANAGER_UNACCEPTABLE_CONFIG =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_TRUSTMANAGER_UNACCEPTABLE_CONFIG_642",CONFIG,SEVERE_ERROR,642, getClassLoader());

  /**
   * Unable to retrieve JMX attribute %s associated with configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_JMX_CANNOT_GET_ATTRIBUTE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_JMX_CANNOT_GET_ATTRIBUTE_643",CONFIG,SEVERE_ERROR,643, getClassLoader());

  /**
   * Unable to set the value of JMX attribute %s associated with configuration entry %s because no JMX connection is available
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_JMX_SET_ATTR_NO_CONNECTION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_JMX_SET_ATTR_NO_CONNECTION_644",CONFIG,SEVERE_ERROR,644, getClassLoader());

  /**
   * %s.%s returned a result of null for entry %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_CHANGE_NO_RESULT =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_CHANGE_NO_RESULT_645",CONFIG,SEVERE_ERROR,645, getClassLoader());

  /**
   * %s.%s failed for entry %s:  result code=%s, admin action required=%b, messages="%s"
   */
  public static final MessageDescriptor.Arg6<CharSequence,CharSequence,CharSequence,CharSequence,Boolean,CharSequence> ERR_CONFIG_CHANGE_RESULT_ERROR =
          new MessageDescriptor.Arg6<CharSequence,CharSequence,CharSequence,CharSequence,Boolean,CharSequence>(BASE,"SEVERE_ERR_CONFIG_CHANGE_RESULT_ERROR_646",CONFIG,SEVERE_ERROR,646, getClassLoader());

  /**
   * %s.%s indicated that administrative action is required for entry %s:  messages="%s"
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> WARN_CONFIG_CHANGE_RESULT_ACTION_REQUIRED =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_WARN_CONFIG_CHANGE_RESULT_ACTION_REQUIRED_647",CONFIG,SEVERE_WARNING,647, getClassLoader());

  /**
   * %s.%s succeeded but generated the following messages for entry %s:  %s
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> INFO_CONFIG_CHANGE_RESULT_MESSAGES =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"INFO_CONFIG_CHANGE_RESULT_MESSAGES_648",CONFIG,INFORMATION,648, getClassLoader());

  /**
   * Unable to parse value "%s" from config entry "%s" as a valid search filter:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_VATTR_INVALID_SEARCH_FILTER =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_VATTR_INVALID_SEARCH_FILTER_649",CONFIG,SEVERE_ERROR,649, getClassLoader());

  /**
   * An error occurred while trying to load an instance of class %s referenced in configuration entry %s as a virtual attribute provider:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_VATTR_INITIALIZATION_FAILED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_VATTR_INITIALIZATION_FAILED_650",CONFIG,SEVERE_ERROR,650, getClassLoader());

  /**
   * The virtual attribute configuration in entry "%s" is not valid because attribute type %s is single-valued but provider %s may generate multiple values
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_VATTR_SV_TYPE_WITH_MV_PROVIDER =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_VATTR_SV_TYPE_WITH_MV_PROVIDER_651",CONFIG,SEVERE_ERROR,651, getClassLoader());

  /**
   * The virtual attribute configuration in entry "%s" is not valid because attribute type %s is single-valued but the conflict behavior is configured to merge real and virtual values
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_VATTR_SV_TYPE_WITH_MERGE_VALUES =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_VATTR_SV_TYPE_WITH_MERGE_VALUES_652",CONFIG,SEVERE_ERROR,652, getClassLoader());

  /**
   * Configuration entry %s cannot be modified because the change would alter its structural object class
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_FILE_MODIFY_STRUCTURAL_CHANGE_NOT_ALLOWED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CONFIG_FILE_MODIFY_STRUCTURAL_CHANGE_NOT_ALLOWED_653",CONFIG,MILD_ERROR,653, getClassLoader());

  /**
   * An error occurred while attempting to calculate a SHA-1 digest of file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_CANNOT_CALCULATE_DIGEST =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"FATAL_ERR_CONFIG_CANNOT_CALCULATE_DIGEST_654",CONFIG,FATAL_ERROR,654, getClassLoader());

  /**
   * The Directory Server has detected that one or more external changes have been made to the configuration file %s while the server was online, but another change has caused the server configuration to be overwritten.  The manual changes have not been applied, but they have been preserved in file %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_CONFIG_MANUAL_CHANGES_DETECTED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_CONFIG_MANUAL_CHANGES_DETECTED_655",CONFIG,SEVERE_WARNING,655, getClassLoader());

  /**
   * The Directory Server encountered an error while attempting to determine whether the configuration file %s has been externally edited with the server online, and/or trying to preserve such changes:  %s.  Any manual changes made to that file may have been lost
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_MANUAL_CHANGES_LOST =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_MANUAL_CHANGES_LOST_656",CONFIG,SEVERE_ERROR,656, getClassLoader());

  /**
   * Class %s specified in attribute ds-cfg-java-class of configuration entry %s cannot be instantiated as a Directory Server log rotation policy:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_ROTATION_POLICY_INVALID_CLASS =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_ROTATION_POLICY_INVALID_CLASS_657",CONFIG,SEVERE_ERROR,657, getClassLoader());

  /**
   * Class %s specified in attribute ds-cfg-java-class of configuration entry %s cannot be instantiated as a Directory Server log retention policy:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_RETENTION_POLICY_INVALID_CLASS =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_RETENTION_POLICY_INVALID_CLASS_658",CONFIG,SEVERE_ERROR,658, getClassLoader());

  /**
   * An error occurred while attempting to create a Directory Server log rotation policy from the information in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_ROTATION_POLICY_CANNOT_CREATE_POLICY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_ROTATION_POLICY_CANNOT_CREATE_POLICY_659",CONFIG,SEVERE_ERROR,659, getClassLoader());

  /**
   * An error occurred while attempting to create a Directory Server log retention policy from the information in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_RETENTION_POLICY_CANNOT_CREATE_POLICY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_RETENTION_POLICY_CANNOT_CREATE_POLICY_660",CONFIG,SEVERE_ERROR,660, getClassLoader());

  /**
   * An error occurred while attempting to create a text writer for a Directory Server logger from the information in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_LOGGING_CANNOT_CREATE_WRITER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_LOGGING_CANNOT_CREATE_WRITER_661",CONFIG,SEVERE_ERROR,661, getClassLoader());

  /**
   * Schema configuration file %s in directory %s contains more than one entry.  Only the first entry will be examined, and the additional entries will be ignored
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_CONFIG_SCHEMA_MULTIPLE_ENTRIES_IN_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_CONFIG_SCHEMA_MULTIPLE_ENTRIES_IN_FILE_662",CONFIG,SEVERE_WARNING,662, getClassLoader());

  /**
   * Schema configuration file %s in directory %s contains additional data after the schema entry that cannot be parsed by the LDIF reader:  %s.  The first entry will be processed, but the remaining data will be ignored
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> WARN_CONFIG_SCHEMA_UNPARSEABLE_EXTRA_DATA_IN_FILE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_WARN_CONFIG_SCHEMA_UNPARSEABLE_EXTRA_DATA_IN_FILE_663",CONFIG,SEVERE_WARNING,663, getClassLoader());

  /**
   * The plugin order definition for plugins of type %s contains an empty element.  This may cause the plugin order to be evaluated incorrectly
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_CONFIG_PLUGIN_EMPTY_ELEMENT_IN_ORDER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_CONFIG_PLUGIN_EMPTY_ELEMENT_IN_ORDER_664",CONFIG,SEVERE_WARNING,664, getClassLoader());

  /**
   * The plugin order definition for plugins of type %s contains multiple wildcard characters.  All plugin definitions should contain exactly one wildcard element to indicate where unmatched plugins should be included in the order, and including multiple wildcards may cause the plugin order to be evaluated incorrectly
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_CONFIG_PLUGIN_MULTIPLE_WILDCARDS_IN_ORDER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_CONFIG_PLUGIN_MULTIPLE_WILDCARDS_IN_ORDER_665",CONFIG,SEVERE_WARNING,665, getClassLoader());

  /**
   * The plugin order definition for plugins of type %s includes multiple references to the '%s' plugin.  This may cause the plugin order to be evaluated incorrectly
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_CONFIG_PLUGIN_LISTED_MULTIPLE_TIMES =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_CONFIG_PLUGIN_LISTED_MULTIPLE_TIMES_666",CONFIG,SEVERE_WARNING,666, getClassLoader());

  /**
   * The plugin order definition for plugins of type %s does not include a wildcard element to indicate where unmatched plugins should be included in the order.  The server will default to invoking all unnamed plugins after set of named plugins
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_CONFIG_PLUGIN_ORDER_NO_WILDCARD =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_CONFIG_PLUGIN_ORDER_NO_WILDCARD_667",CONFIG,SEVERE_WARNING,667, getClassLoader());

  /**
   * Attribute syntax %s cannot be deleted from the server because it is in use by attribute type %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_CONFIG_SCHEMA_CANNOT_DELETE_SYNTAX_IN_USE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_CONFIG_SCHEMA_CANNOT_DELETE_SYNTAX_IN_USE_668",CONFIG,SEVERE_WARNING,668, getClassLoader());

  /**
   * Attribute syntax %s cannot be disabled because it is in use by attribute type %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_CONFIG_SCHEMA_CANNOT_DISABLE_SYNTAX_IN_USE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_CONFIG_SCHEMA_CANNOT_DISABLE_SYNTAX_IN_USE_669",CONFIG,SEVERE_WARNING,669, getClassLoader());

  /**
   * Matching rule %s cannot be deleted from the server because it is in use by attribute type %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_CONFIG_SCHEMA_CANNOT_DELETE_MR_IN_USE_BY_AT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_CONFIG_SCHEMA_CANNOT_DELETE_MR_IN_USE_BY_AT_670",CONFIG,SEVERE_WARNING,670, getClassLoader());

  /**
   * Matching rule %s cannot be deleted from the server because it is in use by matching rule use %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_CONFIG_SCHEMA_CANNOT_DELETE_MR_IN_USE_BY_MRU =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_CONFIG_SCHEMA_CANNOT_DELETE_MR_IN_USE_BY_MRU_671",CONFIG,SEVERE_WARNING,671, getClassLoader());

  /**
   * Matching rule %s cannot be disabled because it is in use by attribute type %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_CONFIG_SCHEMA_CANNOT_DISABLE_MR_IN_USE_BY_AT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_CONFIG_SCHEMA_CANNOT_DISABLE_MR_IN_USE_BY_AT_672",CONFIG,SEVERE_WARNING,672, getClassLoader());

  /**
   * Matching rule %s cannot be disabled because it is in use by matching rule use %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_CONFIG_SCHEMA_CANNOT_DISABLE_MR_IN_USE_BY_MRU =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_CONFIG_SCHEMA_CANNOT_DISABLE_MR_IN_USE_BY_MRU_673",CONFIG,SEVERE_WARNING,673, getClassLoader());

  /**
   * Unable to initialize an instance of class %s as a work queue as specified in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_WORK_QUEUE_INITIALIZATION_FAILED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_WORK_QUEUE_INITIALIZATION_FAILED_674",CONFIG,SEVERE_ERROR,674, getClassLoader());

  /**
   * The class used to provide the Directory Server work queue implementation has been changed from %s to %s, but this change will not take effect until the server is restarted
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_CONFIG_WORK_QUEUE_CLASS_CHANGE_REQUIRES_RESTART =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_CONFIG_WORK_QUEUE_CLASS_CHANGE_REQUIRES_RESTART_675",CONFIG,INFORMATION,675, getClassLoader());

  /**
   * The attempt to apply the configuration add failed.  The preliminary checks were all successful and the entry was added to the server configuration, but at least one of the configuration add listeners reported an error when attempting to apply the change:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_FILE_ADD_APPLY_FAILED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_FILE_ADD_APPLY_FAILED_676",CONFIG,SEVERE_ERROR,676, getClassLoader());

  /**
   * The attempt to apply the configuration delete failed.  The preliminary checks were all successful and the entry was removed from the server configuration, but at least one of the configuration delete listeners reported an error when attempting to apply the change:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_FILE_DELETE_APPLY_FAILED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_FILE_DELETE_APPLY_FAILED_677",CONFIG,SEVERE_ERROR,677, getClassLoader());

  /**
   * The attempt to apply the configuration modification failed.  The preliminary checks were all successful and the modified entry was written to the server configuration, but at least one of the configuration change listeners reported an error when attempting to apply the change:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_FILE_MODIFY_APPLY_FAILED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_FILE_MODIFY_APPLY_FAILED_678",CONFIG,SEVERE_ERROR,678, getClassLoader());

  /**
   * The configuration for the key manager provider defined in configuration entry %s was not acceptable:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_KEYMANAGER_CONFIG_NOT_ACCEPTABLE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_KEYMANAGER_CONFIG_NOT_ACCEPTABLE_679",CONFIG,MILD_ERROR,679, getClassLoader());

  /**
   * The configuration for the trust manager provider defined in configuration entry %s was not acceptable:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_TRUSTMANAGER_CONFIG_NOT_ACCEPTABLE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_TRUSTMANAGER_CONFIG_NOT_ACCEPTABLE_680",CONFIG,MILD_ERROR,680, getClassLoader());

  /**
   * The configuration for the trust manager provider defined in configuration entry %s was not acceptable: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_AUTHZ_CONFIG_NOT_ACCEPTABLE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_AUTHZ_CONFIG_NOT_ACCEPTABLE_681",CONFIG,MILD_ERROR,681, getClassLoader());

  /**
   * The configuration for the account status notification handler defined in configuration entry %s was not acceptable:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_ACCTNOTHANDLER_CONFIG_NOT_ACCEPTABLE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_ACCTNOTHANDLER_CONFIG_NOT_ACCEPTABLE_682",CONFIG,MILD_ERROR,682, getClassLoader());

  /**
   * The configuration for the attribute syntax defined in configuration entry %s was not acceptable: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_SCHEMA_SYNTAX_CONFIG_NOT_ACCEPTABLE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_SCHEMA_SYNTAX_CONFIG_NOT_ACCEPTABLE_683",CONFIG,MILD_ERROR,683, getClassLoader());

  /**
   * The configuration for the certificate mapper defined in configuration entry %s was not acceptable: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_CERTMAPPER_CONFIG_NOT_ACCEPTABLE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_CERTMAPPER_CONFIG_NOT_ACCEPTABLE_684",CONFIG,MILD_ERROR,684, getClassLoader());

  /**
   * The configuration for the group implementation defined in configuration entry %s was not acceptable: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_GROUP_CONFIG_NOT_ACCEPTABLE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_GROUP_CONFIG_NOT_ACCEPTABLE_686",CONFIG,MILD_ERROR,686, getClassLoader());

  /**
   * The configuration for the identity mapper defined in configuration entry %s was not acceptable:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_IDMAPPER_CONFIG_NOT_ACCEPTABLE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_IDMAPPER_CONFIG_NOT_ACCEPTABLE_687",CONFIG,MILD_ERROR,687, getClassLoader());

  /**
   * The configuration for the matching rule defined in configuration entry %s was not acceptable:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_SCHEMA_MR_CONFIG_NOT_ACCEPTABLE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_SCHEMA_MR_CONFIG_NOT_ACCEPTABLE_688",CONFIG,MILD_ERROR,688, getClassLoader());

  /**
   * The configuration for the password generator defined in configuration entry %s was not acceptable: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_PWGENERATOR_CONFIG_NOT_ACCEPTABLE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_PWGENERATOR_CONFIG_NOT_ACCEPTABLE_689",CONFIG,MILD_ERROR,689, getClassLoader());

  /**
   * The configuration for the password storage scheme defined in configuration entry %s was not acceptable: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_PWSCHEME_CONFIG_NOT_ACCEPTABLE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_PWSCHEME_CONFIG_NOT_ACCEPTABLE_690",CONFIG,MILD_ERROR,690, getClassLoader());

  /**
   * The configuration for the password validator defined in configuration entry %s was not acceptable: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_PWVALIDATOR_CONFIG_NOT_ACCEPTABLE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_PWVALIDATOR_CONFIG_NOT_ACCEPTABLE_691",CONFIG,MILD_ERROR,691, getClassLoader());

  /**
   * The configuration for the plugin defined in configuration entry %s was not acceptable:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_PLUGIN_CONFIG_NOT_ACCEPTABLE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_PLUGIN_CONFIG_NOT_ACCEPTABLE_692",CONFIG,MILD_ERROR,692, getClassLoader());

  /**
   * The configuration for the SASL mechanism handler defined in configuration entry %s was not acceptable:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_SASL_CONFIG_NOT_ACCEPTABLE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_SASL_CONFIG_NOT_ACCEPTABLE_693",CONFIG,MILD_ERROR,693, getClassLoader());

  /**
   * The configuration for the virtual attribute provider defined in configuration entry %s was not acceptable:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_VATTR_CONFIG_NOT_ACCEPTABLE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_VATTR_CONFIG_NOT_ACCEPTABLE_694",CONFIG,MILD_ERROR,694, getClassLoader());

  /**
   * The configuration for the alert handler defined in configuration entry %s was not acceptable:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_ALERTHANDLER_CONFIG_NOT_ACCEPTABLE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_ALERTHANDLER_CONFIG_NOT_ACCEPTABLE_695",CONFIG,MILD_ERROR,695, getClassLoader());

  /**
   * An error occurred while trying to initialize an instance of class %s as an alert handler as defined in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_ALERTHANDLER_INITIALIZATION_FAILED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_ALERTHANDLER_INITIALIZATION_FAILED_696",CONFIG,MILD_ERROR,696, getClassLoader());

  /**
   * The provided SMTP server value '%s' is invalid.  An SMTP server value must have an IP address or a resolvable name, and it may optionally be followed by a colon and an integer value between 1 and 65535 to specify the server port number
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_CORE_INVALID_SMTP_SERVER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_CORE_INVALID_SMTP_SERVER_697",CONFIG,SEVERE_ERROR,697, getClassLoader());

  /**
   * An error occurred while attempting to open the current configuration file %s for reading in order to copy it to the ".startok" file:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_STARTOK_CANNOT_OPEN_FOR_READING =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_STARTOK_CANNOT_OPEN_FOR_READING_698",CONFIG,SEVERE_ERROR,698, getClassLoader());

  /**
   * An error occurred while attempting to open file %s in order to write the ".startok" configuration file:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_STARTOK_CANNOT_OPEN_FOR_WRITING =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_STARTOK_CANNOT_OPEN_FOR_WRITING_699",CONFIG,SEVERE_ERROR,699, getClassLoader());

  /**
   * An error occurred while attempting to copy the current configuration from file %s into temporary file %s for use as the ".startok" configuration file:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_STARTOK_CANNOT_WRITE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_STARTOK_CANNOT_WRITE_700",CONFIG,SEVERE_ERROR,700, getClassLoader());

  /**
   * An error occurred while attempting to rename file %s to %s for use as the ".startok" configuration file:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_STARTOK_CANNOT_RENAME =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_STARTOK_CANNOT_RENAME_701",CONFIG,SEVERE_ERROR,701, getClassLoader());

  /**
   * The Directory Server is starting using the last known good configuration file %s rather than the active configuration file %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> NOTE_CONFIG_FILE_USING_STARTOK_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"NOTICE_CONFIG_FILE_USING_STARTOK_FILE_702",CONFIG,NOTICE,702, getClassLoader());

  /**
   * No last known good configuration file %s exists.  The server will attempt to start using the active configuration file %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_CONFIG_FILE_NO_STARTOK_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_CONFIG_FILE_NO_STARTOK_FILE_703",CONFIG,SEVERE_WARNING,703, getClassLoader());

  /**
   * An error occurred while trying to parse and validate Berkeley DB JE property %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_JE_PROPERTY_INVALID =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_JE_PROPERTY_INVALID_704",CONFIG,SEVERE_ERROR,704, getClassLoader());

  /**
   * An error occurred while trying to parse and validate Berkeley DB JE property %s: the property does not follow a singular property=value form
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_JE_PROPERTY_INVALID_FORM =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_JE_PROPERTY_INVALID_FORM_705",CONFIG,SEVERE_ERROR,705, getClassLoader());

  /**
   * An error occurred while trying to parse and validate Berkeley DB JE property %s: the property shadows configuration attribute %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_JE_PROPERTY_SHADOWS_CONFIG =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_JE_PROPERTY_SHADOWS_CONFIG_706",CONFIG,SEVERE_ERROR,706, getClassLoader());

  /**
   * An error occurred while trying to parse and validate Berkeley DB JE property %s: the property is already defined for this component
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_JE_DUPLICATE_PROPERTY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_JE_DUPLICATE_PROPERTY_707",CONFIG,SEVERE_ERROR,707, getClassLoader());

  /**
   * Setting Berkeley DB JE property %s will not take effect until the component for which it is set is restarted
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_CONFIG_JE_PROPERTY_REQUIRES_RESTART =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_CONFIG_JE_PROPERTY_REQUIRES_RESTART_708",CONFIG,INFORMATION,708, getClassLoader());

  /**
   * An error occurred while attempting to open the configured log file %s for logger %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_LOGGING_CANNOT_OPEN_FILE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_LOGGING_CANNOT_OPEN_FILE_709",CONFIG,SEVERE_ERROR,709, getClassLoader());

  /**
   * The configuration for the workflow element defined in configuration entry %s was not acceptable: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_WORKFLOW_ELEMENT_CONFIG_NOT_ACCEPTABLE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_WORKFLOW_ELEMENT_CONFIG_NOT_ACCEPTABLE_710",CONFIG,SEVERE_ERROR,710, getClassLoader());

  /**
   * An error occurred while trying to initialize a workflow element from class %s with the information in configuration entry %s:  %s.  This workflow element will be disabled
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_WORKFLOW_ELEMENT_CANNOT_INITIALIZE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_WORKFLOW_ELEMENT_CANNOT_INITIALIZE_711",CONFIG,SEVERE_ERROR,711, getClassLoader());

  /**
   * The workflow element %s is already registered with the Directory Server. This workflow element will be ignored
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_WORKFLOW_ELEMENT_ALREADY_REGISTERED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CONFIG_WORKFLOW_ELEMENT_ALREADY_REGISTERED_712",CONFIG,MILD_ERROR,712, getClassLoader());

  /**
   * An error occurred while trying to configure in manual mode the workflows in the Directory Server, and rollback to automatic configuration mode has failed too. If the server is in an unstable state restart it with the last valid configuration
   */
  public static final MessageDescriptor.Arg0 ERR_CONFIG_WORKFLOW_CANNOT_CONFIGURE_MANUAL =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CONFIG_WORKFLOW_CANNOT_CONFIGURE_MANUAL_713",CONFIG,SEVERE_ERROR,713, getClassLoader());

  /**
   * An error occurred while trying to configure in automatic mode the workflows in the Directory Server, and rollback to manual configuration mode has failed too. If the server is in an unstable state restart it with the last valid configuration
   */
  public static final MessageDescriptor.Arg0 ERR_CONFIG_WORKFLOW_CANNOT_CONFIGURE_AUTO =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CONFIG_WORKFLOW_CANNOT_CONFIGURE_AUTO_714",CONFIG,SEVERE_ERROR,714, getClassLoader());

  /**
   * Invalid UNIX file permissions %s does not allow write access to the log file by the log publisher
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONFIG_LOGGING_INSANE_MODE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONFIG_LOGGING_INSANE_MODE_715",CONFIG,SEVERE_ERROR,715, getClassLoader());

  /**
   * Invalid UNIX file permissions %s: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_LOGGING_MODE_INVALID =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_LOGGING_MODE_INVALID_716",CONFIG,SEVERE_ERROR,716, getClassLoader());

  /**
   * The configuration for the extension defined in configuration entry %s was not acceptable:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_EXTENSION_CONFIG_NOT_ACCEPTABLE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_EXTENSION_CONFIG_NOT_ACCEPTABLE_717",CONFIG,MILD_ERROR,717, getClassLoader());

  /**
   * An error occurred while trying to initialize an instance of class %s as an extension as defined in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_EXTENSION_INITIALIZATION_FAILED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_CONFIG_EXTENSION_INITIALIZATION_FAILED_718",CONFIG,MILD_ERROR,718, getClassLoader());

  /**
   * The allowed attribute %s specified in configuration entry %s is also defined as a prohibited attribute
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_NETWORKGROUPREQUESTFILTERINGPOLICY_INVALID_ATTRIBUTE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_NETWORKGROUPREQUESTFILTERINGPOLICY_INVALID_ATTRIBUTE_719",CONFIG,SEVERE_ERROR,719, getClassLoader());

  /**
   * The allowed subtree %s specified in configuration entry %s is also defined as a prohibited subtree
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_NETWORKGROUPREQUESTFILTERINGPOLICY_INVALID_SUBTREE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_NETWORKGROUPREQUESTFILTERINGPOLICY_INVALID_SUBTREE_720",CONFIG,SEVERE_ERROR,720, getClassLoader());

  /**
   * The configuration for the network group defined in configuration entry %s was not acceptable:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONFIG_NETWORK_GROUP_CONFIG_NOT_ACCEPTABLE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_NETWORK_GROUP_CONFIG_NOT_ACCEPTABLE_721",CONFIG,SEVERE_ERROR,721, getClassLoader());

  /**
   * An error occurred while trying to initialize a network group policy loaded from class %s with the information in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CONFIG_NETWORK_GROUP_POLICY_CANNOT_INITIALIZE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONFIG_NETWORK_GROUP_POLICY_CANNOT_INITIALIZE_722",CONFIG,SEVERE_ERROR,722, getClassLoader());

  /**
   * An ldapSyntaxes attribute read from schema configuration file %s could not be parsed:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_CONFIG_SCHEMA_CANNOT_PARSE_LDAP_SYNTAX =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_CONFIG_SCHEMA_CANNOT_PARSE_LDAP_SYNTAX_723",CONFIG,SEVERE_WARNING,723, getClassLoader());

  /**
   * An ldap syntax read from schema configuration file %s conflicts with another ldap syntax already read into the schema:  %s.  The later ldap syntax description will be used
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_CONFIG_SCHEMA_CONFLICTING_LDAP_SYNTAX =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_CONFIG_SCHEMA_CONFLICTING_LDAP_SYNTAX_724",CONFIG,SEVERE_WARNING,724, getClassLoader());

  /**
   * The provided maximum allowed simultaneous persistent searches '%d' is invalid.  The maximum allowed value must be between 0 and '%d' where '%d' is the number of worker threads
   */
  public static final MessageDescriptor.Arg3<Number,Number,Number> ERR_CONFIG_CORE_INVALID_MAX_PSEARCH_LIMIT =
          new MessageDescriptor.Arg3<Number,Number,Number>(BASE,"MILD_ERR_CONFIG_CORE_INVALID_MAX_PSEARCH_LIMIT_725",CONFIG,MILD_ERROR,725, getClassLoader());


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
            Class<?> c = Class.forName("org.opends.messages.ConfigMessages");

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
      cl = ConfigMessages.class.getClassLoader();
    }
    return cl;
  }
}
