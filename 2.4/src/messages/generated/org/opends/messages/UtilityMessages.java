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
public final class UtilityMessages {

  /** Base property for resource bundle containing messages */
  private static final String BASE = "messages/utility";

  private static ClassLoader webstartClassLoader;

  // Prevent instantiation.
  private UtilityMessages() {
    // Do nothing.
  }

  /**
   * The value %s cannot be base64-decoded because it does not have a length that is a multiple of four bytes
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_BASE64_DECODE_INVALID_LENGTH =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_BASE64_DECODE_INVALID_LENGTH_1",UTIL,MILD_ERROR,1, getClassLoader());

  /**
   * The value %s cannot be base64-decoded because it contains an illegal character %c that is not allowed in base64-encoded values
   */
  public static final MessageDescriptor.Arg2<CharSequence,Character> ERR_BASE64_DECODE_INVALID_CHARACTER =
          new MessageDescriptor.Arg2<CharSequence,Character>(BASE,"MILD_ERR_BASE64_DECODE_INVALID_CHARACTER_2",UTIL,MILD_ERROR,2, getClassLoader());

  /**
   * The value %s cannot be decoded as a hexadecimal string because it does not have a length that is a multiple of two bytes
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_HEX_DECODE_INVALID_LENGTH =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_HEX_DECODE_INVALID_LENGTH_3",UTIL,MILD_ERROR,3, getClassLoader());

  /**
   * The value %s cannot be decoded as a hexadecimal string because it contains an illegal character %c that is not a valid hexadecimal digit
   */
  public static final MessageDescriptor.Arg2<CharSequence,Character> ERR_HEX_DECODE_INVALID_CHARACTER =
          new MessageDescriptor.Arg2<CharSequence,Character>(BASE,"MILD_ERR_HEX_DECODE_INVALID_CHARACTER_4",UTIL,MILD_ERROR,4, getClassLoader());

  /**
   * Unable to parse line %d ("%s") from the LDIF source because the line started with a space but there were no previous lines in the entry to which this line could be appended
   */
  public static final MessageDescriptor.Arg2<Number,CharSequence> ERR_LDIF_INVALID_LEADING_SPACE =
          new MessageDescriptor.Arg2<Number,CharSequence>(BASE,"MILD_ERR_LDIF_INVALID_LEADING_SPACE_5",UTIL,MILD_ERROR,5, getClassLoader());

  /**
   * Unable to parse LDIF entry starting at line %d because the line "%s" does not include an attribute name
   */
  public static final MessageDescriptor.Arg2<Number,CharSequence> ERR_LDIF_NO_ATTR_NAME =
          new MessageDescriptor.Arg2<Number,CharSequence>(BASE,"MILD_ERR_LDIF_NO_ATTR_NAME_6",UTIL,MILD_ERROR,6, getClassLoader());

  /**
   * Unable to parse LDIF entry starting at line %d because the first line does not contain a DN (the first line was "%s"
   */
  public static final MessageDescriptor.Arg2<Number,CharSequence> ERR_LDIF_NO_DN =
          new MessageDescriptor.Arg2<Number,CharSequence>(BASE,"MILD_ERR_LDIF_NO_DN_7",UTIL,MILD_ERROR,7, getClassLoader());

  /**
   * Unable to parse LDIF entry starting at line %d because line "%s" contained an invalid separator between the "dn" prefix and the actual distinguished name
   */
  public static final MessageDescriptor.Arg2<Number,CharSequence> ERR_LDIF_INVALID_DN_SEPARATOR =
          new MessageDescriptor.Arg2<Number,CharSequence>(BASE,"MILD_ERR_LDIF_INVALID_DN_SEPARATOR_8",UTIL,MILD_ERROR,8, getClassLoader());

  /**
   * Unable to parse LDIF entry starting at line %d because an error occurred while trying to parse the value of line "%s" as a distinguished name:  %s
   */
  public static final MessageDescriptor.Arg3<Number,CharSequence,CharSequence> ERR_LDIF_INVALID_DN =
          new MessageDescriptor.Arg3<Number,CharSequence,CharSequence>(BASE,"MILD_ERR_LDIF_INVALID_DN_9",UTIL,MILD_ERROR,9, getClassLoader());

  /**
   * Unable to parse LDIF entry %s starting at line %d because line "%s" contained an invalid separator between the attribute name and value
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,CharSequence> ERR_LDIF_INVALID_ATTR_SEPARATOR =
          new MessageDescriptor.Arg3<CharSequence,Number,CharSequence>(BASE,"MILD_ERR_LDIF_INVALID_ATTR_SEPARATOR_10",UTIL,MILD_ERROR,10, getClassLoader());

  /**
   * Unable to parse LDIF entry starting at line %d because it was not possible to base64-decode the DN on line "%s":  %s
   */
  public static final MessageDescriptor.Arg3<Number,CharSequence,CharSequence> ERR_LDIF_COULD_NOT_BASE64_DECODE_DN =
          new MessageDescriptor.Arg3<Number,CharSequence,CharSequence>(BASE,"MILD_ERR_LDIF_COULD_NOT_BASE64_DECODE_DN_11",UTIL,MILD_ERROR,11, getClassLoader());

  /**
   * Unable to parse LDIF entry %s starting at line %d because it was not possible to base64-decode the attribute on line "%s":  %s
   */
  public static final MessageDescriptor.Arg4<CharSequence,Number,CharSequence,CharSequence> ERR_LDIF_COULD_NOT_BASE64_DECODE_ATTR =
          new MessageDescriptor.Arg4<CharSequence,Number,CharSequence,CharSequence>(BASE,"MILD_ERR_LDIF_COULD_NOT_BASE64_DECODE_ATTR_12",UTIL,MILD_ERROR,12, getClassLoader());

  /**
   * Entry %s read from LDIF starting at line %d includes a duplicate objectclass value %s.  The second occurrence of that objectclass has been skipped
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,CharSequence> WARN_LDIF_DUPLICATE_OBJECTCLASS =
          new MessageDescriptor.Arg3<CharSequence,Number,CharSequence>(BASE,"MILD_WARN_LDIF_DUPLICATE_OBJECTCLASS_13",UTIL,MILD_WARNING,13, getClassLoader());

  /**
   * Entry %s read from LDIF starting at line %d includes a duplicate attribute %s with value %s.  The second occurrence of that attribute value has been skipped
   */
  public static final MessageDescriptor.Arg4<CharSequence,Number,CharSequence,CharSequence> WARN_LDIF_DUPLICATE_ATTR =
          new MessageDescriptor.Arg4<CharSequence,Number,CharSequence,CharSequence>(BASE,"MILD_WARN_LDIF_DUPLICATE_ATTR_14",UTIL,MILD_WARNING,14, getClassLoader());

  /**
   * Entry %s starting at line %d includes multiple values for single-valued attribute %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,CharSequence> ERR_LDIF_MULTIPLE_VALUES_FOR_SINGLE_VALUED_ATTR =
          new MessageDescriptor.Arg3<CharSequence,Number,CharSequence>(BASE,"MILD_ERR_LDIF_MULTIPLE_VALUES_FOR_SINGLE_VALUED_ATTR_15",UTIL,MILD_ERROR,15, getClassLoader());

  /**
   * Unable to parse LDIF entry %s starting at line %d because it has an invalid value "%s" for attribute %s:  %s
   */
  public static final MessageDescriptor.Arg5<CharSequence,Number,CharSequence,CharSequence,CharSequence> ERR_LDIF_INVALID_ATTR_SYNTAX =
          new MessageDescriptor.Arg5<CharSequence,Number,CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_LDIF_INVALID_ATTR_SYNTAX_16",UTIL,MILD_ERROR,16, getClassLoader());

  /**
   * Entry %s read from LDIF starting at line %d is not valid because it violates the server's schema configuration:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,CharSequence> ERR_LDIF_SCHEMA_VIOLATION =
          new MessageDescriptor.Arg3<CharSequence,Number,CharSequence>(BASE,"MILD_ERR_LDIF_SCHEMA_VIOLATION_17",UTIL,MILD_ERROR,17, getClassLoader());

  /**
   * The specified LDIF file %s already exists and the export configuration indicates that no attempt should be made to append to or replace the file
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIF_FILE_EXISTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDIF_FILE_EXISTS_18",UTIL,SEVERE_ERROR,18, getClassLoader());

  /**
   * Unable to parse LDIF entry %s starting at line %d because the value of attribute %s was to be read from a URL but the URL was invalid:  %s
   */
  public static final MessageDescriptor.Arg4<CharSequence,Number,CharSequence,CharSequence> ERR_LDIF_INVALID_URL =
          new MessageDescriptor.Arg4<CharSequence,Number,CharSequence,CharSequence>(BASE,"MILD_ERR_LDIF_INVALID_URL_19",UTIL,MILD_ERROR,19, getClassLoader());

  /**
   * Unable to parse LDIF entry %s starting at line %d because the value of attribute %s was to be read from URL %s but an error occurred while trying to read that content:  %s
   */
  public static final MessageDescriptor.Arg5<CharSequence,Number,CharSequence,CharSequence,CharSequence> ERR_LDIF_URL_IO_ERROR =
          new MessageDescriptor.Arg5<CharSequence,Number,CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_LDIF_URL_IO_ERROR_20",UTIL,MILD_ERROR,20, getClassLoader());

  /**
   * The specified reject file %s already exists and the import configuration indicates that no attempt should be made to append to or replace the file
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_REJECT_FILE_EXISTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_REJECT_FILE_EXISTS_21",UTIL,SEVERE_ERROR,21, getClassLoader());

  /**
   * An error occurred while attempting to determine whether LDIF entry "%s" starting at line %d should be imported as a result of the include and exclude filter configuration:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,CharSequence> ERR_LDIF_COULD_NOT_EVALUATE_FILTERS_FOR_IMPORT =
          new MessageDescriptor.Arg3<CharSequence,Number,CharSequence>(BASE,"SEVERE_ERR_LDIF_COULD_NOT_EVALUATE_FILTERS_FOR_IMPORT_22",UTIL,SEVERE_ERROR,22, getClassLoader());

  /**
   * An error occurred while attempting to determine whether LDIF entry "%s" should be exported as a result of the include and exclude filter configuration:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIF_COULD_NOT_EVALUATE_FILTERS_FOR_EXPORT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIF_COULD_NOT_EVALUATE_FILTERS_FOR_EXPORT_23",UTIL,SEVERE_ERROR,23, getClassLoader());

  /**
   * Error in the LDIF change record entry. Invalid attributes specified for the delete operation
   */
  public static final MessageDescriptor.Arg0 ERR_LDIF_INVALID_DELETE_ATTRIBUTES =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_LDIF_INVALID_DELETE_ATTRIBUTES_24",UTIL,SEVERE_ERROR,24, getClassLoader());

  /**
   * Error in the LDIF change record entry. No attributes specified for the mod DN operation
   */
  public static final MessageDescriptor.Arg0 ERR_LDIF_NO_MOD_DN_ATTRIBUTES =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_LDIF_NO_MOD_DN_ATTRIBUTES_25",UTIL,SEVERE_ERROR,25, getClassLoader());

  /**
   * Error in the LDIF change record entry. No delete old RDN attribute specified for the mod DN operation
   */
  public static final MessageDescriptor.Arg0 ERR_LDIF_NO_DELETE_OLDRDN_ATTRIBUTE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_LDIF_NO_DELETE_OLDRDN_ATTRIBUTE_26",UTIL,SEVERE_ERROR,26, getClassLoader());

  /**
   * Error in the LDIF change record entry. Invalid value "%s" for the delete old RDN attribute specified for the mod DN operation
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIF_INVALID_DELETE_OLDRDN_ATTRIBUTE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDIF_INVALID_DELETE_OLDRDN_ATTRIBUTE_27",UTIL,SEVERE_ERROR,27, getClassLoader());

  /**
   * Error in the LDIF change record entry. Invalid attribute "%s" specified. Expecting attribute "%s"
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIF_INVALID_CHANGERECORD_ATTRIBUTE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIF_INVALID_CHANGERECORD_ATTRIBUTE_28",UTIL,SEVERE_ERROR,28, getClassLoader());

  /**
   * Error in the LDIF change record entry. Invalid attribute "%s" specified. Expecting one of the following attributes "%s"
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIF_INVALID_MODIFY_ATTRIBUTE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIF_INVALID_MODIFY_ATTRIBUTE_29",UTIL,SEVERE_ERROR,29, getClassLoader());

  /**
   * Error in the LDIF change record entry. Invalid value "%s" for the changetype specified. Expecting one of the following values "%s"
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIF_INVALID_CHANGETYPE_ATTRIBUTE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIF_INVALID_CHANGETYPE_ATTRIBUTE_30",UTIL,SEVERE_ERROR,30, getClassLoader());

  /**
   * Error in the LDIF change record entry. Invalid value for the "%s" attribute specified
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIF_INVALID_MODIFY_ATTRIBUTE_VAL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDIF_INVALID_MODIFY_ATTRIBUTE_VAL_31",UTIL,SEVERE_ERROR,31, getClassLoader());

  /**
   * The provided value could not be parsed to determine whether it contained a valid schema element name or OID because it was null or empty
   */
  public static final MessageDescriptor.Arg0 ERR_SCHEMANAME_EMPTY_VALUE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_SCHEMANAME_EMPTY_VALUE_32",UTIL,SEVERE_ERROR,32, getClassLoader());

  /**
   * The provided value "%s" does not contain a valid schema element name or OID because it contains an illegal character %c at position %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,Character,Number> ERR_SCHEMANAME_ILLEGAL_CHAR =
          new MessageDescriptor.Arg3<CharSequence,Character,Number>(BASE,"SEVERE_ERR_SCHEMANAME_ILLEGAL_CHAR_33",UTIL,SEVERE_ERROR,33, getClassLoader());

  /**
   * The provided value "%s" does not contain a valid schema element name or OID because the numeric OID contains two consecutive periods at position %d
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_SCHEMANAME_CONSECUTIVE_PERIODS =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"SEVERE_ERR_SCHEMANAME_CONSECUTIVE_PERIODS_34",UTIL,SEVERE_ERROR,34, getClassLoader());

  /**
   * The %s argument does not have either a single-character or a long identifier that may be used to specify it.  At least one of these must be specified for each argument
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ARG_NO_IDENTIFIER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_ARG_NO_IDENTIFIER_35",UTIL,SEVERE_ERROR,35, getClassLoader());

  /**
   * The %s argument is configured to take a value but no value placeholder has been defined for it
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ARG_NO_VALUE_PLACEHOLDER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_ARG_NO_VALUE_PLACEHOLDER_36",UTIL,SEVERE_ERROR,36, getClassLoader());

  /**
   * The %s argument does not have any value that may be retrieved as an integer
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ARG_NO_INT_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_ARG_NO_INT_VALUE_37",UTIL,SEVERE_ERROR,37, getClassLoader());

  /**
   * The provided value "%s" for the %s argument cannot be decoded as an integer
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ARG_CANNOT_DECODE_AS_INT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_ARG_CANNOT_DECODE_AS_INT_38",UTIL,SEVERE_ERROR,38, getClassLoader());

  /**
   * The %s argument has multiple values and therefore cannot be decoded as a single integer value
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ARG_INT_MULTIPLE_VALUES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_ARG_INT_MULTIPLE_VALUES_39",UTIL,SEVERE_ERROR,39, getClassLoader());

  /**
   * The %s argument does not have any value that may be retrieved as a Boolean
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ARG_NO_BOOLEAN_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_ARG_NO_BOOLEAN_VALUE_40",UTIL,SEVERE_ERROR,40, getClassLoader());

  /**
   * The provided value "%s" for the %s argument cannot be decoded as a Boolean
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ARG_CANNOT_DECODE_AS_BOOLEAN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_ARG_CANNOT_DECODE_AS_BOOLEAN_41",UTIL,SEVERE_ERROR,41, getClassLoader());

  /**
   * The %s argument has multiple values and therefore cannot be decoded as a single Boolean value
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ARG_BOOLEAN_MULTIPLE_VALUES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_ARG_BOOLEAN_MULTIPLE_VALUES_42",UTIL,SEVERE_ERROR,42, getClassLoader());

  /**
   * The %s argument configuration is invalid because the lower bound of %d is greater than the upper bound of %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,Number> ERR_INTARG_LOWER_BOUND_ABOVE_UPPER_BOUND =
          new MessageDescriptor.Arg3<CharSequence,Number,Number>(BASE,"SEVERE_ERR_INTARG_LOWER_BOUND_ABOVE_UPPER_BOUND_43",UTIL,SEVERE_ERROR,43, getClassLoader());

  /**
   * The provided %s value %d is unacceptable because it is below the lower bound of %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,Number> ERR_INTARG_VALUE_BELOW_LOWER_BOUND =
          new MessageDescriptor.Arg3<CharSequence,Number,Number>(BASE,"SEVERE_ERR_INTARG_VALUE_BELOW_LOWER_BOUND_44",UTIL,SEVERE_ERROR,44, getClassLoader());

  /**
   * The provided %s value %d is unacceptable because it is above the upper bound of %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,Number> ERR_INTARG_VALUE_ABOVE_UPPER_BOUND =
          new MessageDescriptor.Arg3<CharSequence,Number,Number>(BASE,"SEVERE_ERR_INTARG_VALUE_ABOVE_UPPER_BOUND_45",UTIL,SEVERE_ERROR,45, getClassLoader());

  /**
   * The provided %s value is unacceptable because Boolean arguments are never allowed to have values
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_BOOLEANARG_NO_VALUE_ALLOWED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_BOOLEANARG_NO_VALUE_ALLOWED_46",UTIL,SEVERE_ERROR,46, getClassLoader());

  /**
   * The provided %s value %s is unacceptable because it is not included in the set of allowed values for that argument
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MCARG_VALUE_NOT_ALLOWED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_MCARG_VALUE_NOT_ALLOWED_47",UTIL,SEVERE_ERROR,47, getClassLoader());

  /**
   * The file %s specified for argument %s does not exist
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_FILEARG_NO_SUCH_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_FILEARG_NO_SUCH_FILE_48",UTIL,SEVERE_ERROR,48, getClassLoader());

  /**
   * An error occurred while trying to verify the existence of file %s specified for argument %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_FILEARG_CANNOT_VERIFY_FILE_EXISTENCE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_FILEARG_CANNOT_VERIFY_FILE_EXISTENCE_49",UTIL,SEVERE_ERROR,49, getClassLoader());

  /**
   * An error occurred while trying to open file %s specified for argument %s for reading:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_FILEARG_CANNOT_OPEN_FILE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_FILEARG_CANNOT_OPEN_FILE_50",UTIL,SEVERE_ERROR,50, getClassLoader());

  /**
   * An error occurred while trying to read from file %s specified for argument %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_FILEARG_CANNOT_READ_FILE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_FILEARG_CANNOT_READ_FILE_51",UTIL,SEVERE_ERROR,51, getClassLoader());

  /**
   * The file %s specified for argument %s exists but is empty
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_FILEARG_EMPTY_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_FILEARG_EMPTY_FILE_52",UTIL,SEVERE_ERROR,52, getClassLoader());

  /**
   * Cannot add argument %s to the argument list because its short identifier -%s conflicts with the %s argument that has already been defined
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_ARGPARSER_DUPLICATE_SHORT_ID =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_ARGPARSER_DUPLICATE_SHORT_ID_53",UTIL,SEVERE_ERROR,53, getClassLoader());

  /**
   * Cannot add argument %s to the argument list because its long identifier --%s conflicts with the %s argument that has already been defined
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_ARGPARSER_DUPLICATE_LONG_ID =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_ARGPARSER_DUPLICATE_LONG_ID_54",UTIL,SEVERE_ERROR,54, getClassLoader());

  /**
   * An error occurred while attempting to read the contents of the argument properties file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ARGPARSER_CANNOT_READ_PROPERTIES_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_ARGPARSER_CANNOT_READ_PROPERTIES_FILE_55",UTIL,SEVERE_ERROR,55, getClassLoader());

  /**
   * The provided set of command-line arguments contained too many unnamed trailing arguments.  The maximum number of allowed trailing arguments is %d
   */
  public static final MessageDescriptor.Arg1<Number> ERR_ARGPARSER_TOO_MANY_TRAILING_ARGS =
          new MessageDescriptor.Arg1<Number>(BASE,"SEVERE_ERR_ARGPARSER_TOO_MANY_TRAILING_ARGS_56",UTIL,SEVERE_ERROR,56, getClassLoader());

  /**
   * The provided argument "%s" is invalid because it does not include the argument name
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ARGPARSER_LONG_ARG_WITHOUT_NAME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_ARGPARSER_LONG_ARG_WITHOUT_NAME_57",UTIL,SEVERE_ERROR,57, getClassLoader());

  /**
   * Argument --%s is not allowed for use with this program
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ARGPARSER_NO_ARGUMENT_WITH_LONG_ID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_ARGPARSER_NO_ARGUMENT_WITH_LONG_ID_58",UTIL,SEVERE_ERROR,58, getClassLoader());

  /**
   * Argument --%s requires a value but none was provided
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ARGPARSER_NO_VALUE_FOR_ARGUMENT_WITH_LONG_ID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_ARGPARSER_NO_VALUE_FOR_ARGUMENT_WITH_LONG_ID_59",UTIL,SEVERE_ERROR,59, getClassLoader());

  /**
   * The provided value "%s" for argument --%s is not acceptable:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_ARGPARSER_VALUE_UNACCEPTABLE_FOR_LONG_ID =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_ARGPARSER_VALUE_UNACCEPTABLE_FOR_LONG_ID_60",UTIL,SEVERE_ERROR,60, getClassLoader());

  /**
   * The argument --%s was included multiple times in the provided set of arguments but it does not allow multiple values
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ARGPARSER_NOT_MULTIVALUED_FOR_LONG_ID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_ARGPARSER_NOT_MULTIVALUED_FOR_LONG_ID_61",UTIL,SEVERE_ERROR,61, getClassLoader());

  /**
   * A value was provided for argument --%s but that argument does not take a value
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ARGPARSER_ARG_FOR_LONG_ID_DOESNT_TAKE_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_ARGPARSER_ARG_FOR_LONG_ID_DOESNT_TAKE_VALUE_62",UTIL,SEVERE_ERROR,62, getClassLoader());

  /**
   * The dash character by itself is invalid for use as an argument name
   */
  public static final MessageDescriptor.Arg0 ERR_ARGPARSER_INVALID_DASH_AS_ARGUMENT =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_ARGPARSER_INVALID_DASH_AS_ARGUMENT_63",UTIL,SEVERE_ERROR,63, getClassLoader());

  /**
   * Argument -%s is not allowed for use with this program
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ARGPARSER_NO_ARGUMENT_WITH_SHORT_ID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_ARGPARSER_NO_ARGUMENT_WITH_SHORT_ID_64",UTIL,SEVERE_ERROR,64, getClassLoader());

  /**
   * Argument -%s requires a value but none was provided
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ARGPARSER_NO_VALUE_FOR_ARGUMENT_WITH_SHORT_ID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_ARGPARSER_NO_VALUE_FOR_ARGUMENT_WITH_SHORT_ID_65",UTIL,SEVERE_ERROR,65, getClassLoader());

  /**
   * The provided value "%s" for argument -%s is not acceptable:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_ARGPARSER_VALUE_UNACCEPTABLE_FOR_SHORT_ID =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_ARGPARSER_VALUE_UNACCEPTABLE_FOR_SHORT_ID_66",UTIL,SEVERE_ERROR,66, getClassLoader());

  /**
   * The argument -%s was included multiple times in the provided set of arguments but it does not allow multiple values
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ARGPARSER_NOT_MULTIVALUED_FOR_SHORT_ID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_ARGPARSER_NOT_MULTIVALUED_FOR_SHORT_ID_67",UTIL,SEVERE_ERROR,67, getClassLoader());

  /**
   * The provided argument block '-%s%s' is illegal because the '%s' argument requires a value but is in the same block as at least one other argument that doesn't require a value
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_ARGPARSER_CANT_MIX_ARGS_WITH_VALUES =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_ARGPARSER_CANT_MIX_ARGS_WITH_VALUES_68",UTIL,SEVERE_ERROR,68, getClassLoader());

  /**
   * Argument "%s" does not start with one or two dashes and unnamed trailing arguments are not allowed
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ARGPARSER_DISALLOWED_TRAILING_ARGUMENT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_ARGPARSER_DISALLOWED_TRAILING_ARGUMENT_69",UTIL,SEVERE_ERROR,69, getClassLoader());

  /**
   * At least %d unnamed trailing arguments are required in the argument list, but too few were provided
   */
  public static final MessageDescriptor.Arg1<Number> ERR_ARGPARSER_TOO_FEW_TRAILING_ARGUMENTS =
          new MessageDescriptor.Arg1<Number>(BASE,"SEVERE_ERR_ARGPARSER_TOO_FEW_TRAILING_ARGUMENTS_70",UTIL,SEVERE_ERROR,70, getClassLoader());

  /**
   * The argument %s is required to have a value but none was provided in the argument list and no default value is available
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ARGPARSER_NO_VALUE_FOR_REQUIRED_ARG =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_ARGPARSER_NO_VALUE_FOR_REQUIRED_ARG_71",UTIL,SEVERE_ERROR,71, getClassLoader());

  /**
   * The file to move %s does not exist
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MOVEFILE_NO_SUCH_FILE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_MOVEFILE_NO_SUCH_FILE_72",UTIL,SEVERE_ERROR,72, getClassLoader());

  /**
   * The file to move %s exists but is not a file
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MOVEFILE_NOT_FILE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_MOVEFILE_NOT_FILE_73",UTIL,SEVERE_ERROR,73, getClassLoader());

  /**
   * The target directory %s does not exist
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MOVEFILE_NO_SUCH_DIRECTORY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_MOVEFILE_NO_SUCH_DIRECTORY_74",UTIL,SEVERE_ERROR,74, getClassLoader());

  /**
   * The target directory %s exists but is not a directory
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MOVEFILE_NOT_DIRECTORY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_MOVEFILE_NOT_DIRECTORY_75",UTIL,SEVERE_ERROR,75, getClassLoader());

  /**
   * The provided sender address %s is invalid:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_EMAILMSG_INVALID_SENDER_ADDRESS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_EMAILMSG_INVALID_SENDER_ADDRESS_76",UTIL,SEVERE_ERROR,76, getClassLoader());

  /**
   * The provided recipient address %s is invalid:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_EMAILMSG_INVALID_RECIPIENT_ADDRESS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_EMAILMSG_INVALID_RECIPIENT_ADDRESS_77",UTIL,SEVERE_ERROR,77, getClassLoader());

  /**
   * The specified e-mail message could not be sent using any of the configured mail servers
   */
  public static final MessageDescriptor.Arg0 ERR_EMAILMSG_CANNOT_SEND =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_EMAILMSG_CANNOT_SEND_78",UTIL,SEVERE_ERROR,78, getClassLoader());

  /**
   * The argument parser already has a %s subcommand
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ARG_SUBCOMMAND_DUPLICATE_SUBCOMMAND =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_ARG_SUBCOMMAND_DUPLICATE_SUBCOMMAND_79",UTIL,SEVERE_ERROR,79, getClassLoader());

  /**
   * There are multiple arguments for subcommand %s with name %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ARG_SUBCOMMAND_DUPLICATE_ARGUMENT_NAME =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_ARG_SUBCOMMAND_DUPLICATE_ARGUMENT_NAME_80",UTIL,SEVERE_ERROR,80, getClassLoader());

  /**
   * Argument %s for subcommand %s conflicts with a global argument with the same name
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ARG_SUBCOMMAND_ARGUMENT_GLOBAL_CONFLICT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_ARG_SUBCOMMAND_ARGUMENT_GLOBAL_CONFLICT_81",UTIL,SEVERE_ERROR,81, getClassLoader());

  /**
   * Argument %s for subcommand %s has a short identifier -%s that conflicts with that of argument %s
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> ERR_ARG_SUBCOMMAND_DUPLICATE_SHORT_ID =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_ARG_SUBCOMMAND_DUPLICATE_SHORT_ID_82",UTIL,SEVERE_ERROR,82, getClassLoader());

  /**
   * Argument %s for subcommand %s has a short ID -%s that conflicts with that of global argument %s
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> ERR_ARG_SUBCOMMAND_ARGUMENT_SHORT_ID_GLOBAL_CONFLICT =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_ARG_SUBCOMMAND_ARGUMENT_SHORT_ID_GLOBAL_CONFLICT_83",UTIL,SEVERE_ERROR,83, getClassLoader());

  /**
   * Argument %s for subcommand %s has a long identifier --%s that conflicts with that of argument %s
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> ERR_ARG_SUBCOMMAND_DUPLICATE_LONG_ID =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_ARG_SUBCOMMAND_DUPLICATE_LONG_ID_84",UTIL,SEVERE_ERROR,84, getClassLoader());

  /**
   * Argument %s for subcommand %s has a long ID --%s that conflicts with that of global argument %s
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> ERR_ARG_SUBCOMMAND_ARGUMENT_LONG_ID_GLOBAL_CONFLICT =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_ARG_SUBCOMMAND_ARGUMENT_LONG_ID_GLOBAL_CONFLICT_85",UTIL,SEVERE_ERROR,85, getClassLoader());

  /**
   * There is already another global argument named "%s"
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SUBCMDPARSER_DUPLICATE_GLOBAL_ARG_NAME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_SUBCMDPARSER_DUPLICATE_GLOBAL_ARG_NAME_86",UTIL,SEVERE_ERROR,86, getClassLoader());

  /**
   * The argument name %s conflicts with the name of another argument associated with the %s subcommand
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SUBCMDPARSER_GLOBAL_ARG_NAME_SUBCMD_CONFLICT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_SUBCMDPARSER_GLOBAL_ARG_NAME_SUBCMD_CONFLICT_87",UTIL,SEVERE_ERROR,87, getClassLoader());

  /**
   * Short ID -%s for global argument %s conflicts with the short ID of another global argument %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SUBCMDPARSER_DUPLICATE_GLOBAL_ARG_SHORT_ID =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_SUBCMDPARSER_DUPLICATE_GLOBAL_ARG_SHORT_ID_88",UTIL,SEVERE_ERROR,88, getClassLoader());

  /**
   * Short ID -%s for global argument %s conflicts with the short ID for the %s argument associated with subcommand %s
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> ERR_SUBCMDPARSER_GLOBAL_ARG_SHORT_ID_CONFLICT =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_SUBCMDPARSER_GLOBAL_ARG_SHORT_ID_CONFLICT_89",UTIL,SEVERE_ERROR,89, getClassLoader());

  /**
   * Long ID --%s for global argument %s conflicts with the long ID of another global argument %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SUBCMDPARSER_DUPLICATE_GLOBAL_ARG_LONG_ID =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_SUBCMDPARSER_DUPLICATE_GLOBAL_ARG_LONG_ID_90",UTIL,SEVERE_ERROR,90, getClassLoader());

  /**
   * Long ID --%s for global argument %s conflicts with the long ID for the %s argument associated with subcommand %s
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> ERR_SUBCMDPARSER_GLOBAL_ARG_LONG_ID_CONFLICT =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_SUBCMDPARSER_GLOBAL_ARG_LONG_ID_CONFLICT_91",UTIL,SEVERE_ERROR,91, getClassLoader());

  /**
   * An error occurred while attempting to read the contents of the argument properties file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SUBCMDPARSER_CANNOT_READ_PROPERTIES_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_SUBCMDPARSER_CANNOT_READ_PROPERTIES_FILE_92",UTIL,SEVERE_ERROR,92, getClassLoader());

  /**
   * The provided command-line argument %s does not contain an argument name
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SUBCMDPARSER_LONG_ARG_WITHOUT_NAME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_SUBCMDPARSER_LONG_ARG_WITHOUT_NAME_93",UTIL,SEVERE_ERROR,93, getClassLoader());

  /**
   * The provided argument --%s is not a valid global argument identifier
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SUBCMDPARSER_NO_GLOBAL_ARGUMENT_FOR_LONG_ID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_SUBCMDPARSER_NO_GLOBAL_ARGUMENT_FOR_LONG_ID_94",UTIL,SEVERE_ERROR,94, getClassLoader());

  /**
   * The provided argument --%s is not a valid global or subcommand argument identifier
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SUBCMDPARSER_NO_ARGUMENT_FOR_LONG_ID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_SUBCMDPARSER_NO_ARGUMENT_FOR_LONG_ID_95",UTIL,SEVERE_ERROR,95, getClassLoader());

  /**
   * Command-line argument --%s requires a value but none was given
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SUBCMDPARSER_NO_VALUE_FOR_ARGUMENT_WITH_LONG_ID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_SUBCMDPARSER_NO_VALUE_FOR_ARGUMENT_WITH_LONG_ID_96",UTIL,SEVERE_ERROR,96, getClassLoader());

  /**
   * The provided value "%s" for argument --%s is not acceptable:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SUBCMDPARSER_VALUE_UNACCEPTABLE_FOR_LONG_ID =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_SUBCMDPARSER_VALUE_UNACCEPTABLE_FOR_LONG_ID_97",UTIL,SEVERE_ERROR,97, getClassLoader());

  /**
   * The argument --%s was included multiple times in the provided set of arguments but it does not allow multiple values
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SUBCMDPARSER_NOT_MULTIVALUED_FOR_LONG_ID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_SUBCMDPARSER_NOT_MULTIVALUED_FOR_LONG_ID_98",UTIL,SEVERE_ERROR,98, getClassLoader());

  /**
   * A value was provided for argument --%s but that argument does not take a value
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SUBCMDPARSER_ARG_FOR_LONG_ID_DOESNT_TAKE_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_SUBCMDPARSER_ARG_FOR_LONG_ID_DOESNT_TAKE_VALUE_99",UTIL,SEVERE_ERROR,99, getClassLoader());

  /**
   * The dash character by itself is invalid for use as an argument name
   */
  public static final MessageDescriptor.Arg0 ERR_SUBCMDPARSER_INVALID_DASH_AS_ARGUMENT =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_SUBCMDPARSER_INVALID_DASH_AS_ARGUMENT_100",UTIL,SEVERE_ERROR,100, getClassLoader());

  /**
   * The provided argument -%s is not a valid global argument identifier
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SUBCMDPARSER_NO_GLOBAL_ARGUMENT_FOR_SHORT_ID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_SUBCMDPARSER_NO_GLOBAL_ARGUMENT_FOR_SHORT_ID_101",UTIL,SEVERE_ERROR,101, getClassLoader());

  /**
   * The provided argument -%s is not a valid global or subcommand argument identifier
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SUBCMDPARSER_NO_ARGUMENT_FOR_SHORT_ID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_SUBCMDPARSER_NO_ARGUMENT_FOR_SHORT_ID_102",UTIL,SEVERE_ERROR,102, getClassLoader());

  /**
   * Argument -%s requires a value but none was provided
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SUBCMDPARSER_NO_VALUE_FOR_ARGUMENT_WITH_SHORT_ID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_SUBCMDPARSER_NO_VALUE_FOR_ARGUMENT_WITH_SHORT_ID_103",UTIL,SEVERE_ERROR,103, getClassLoader());

  /**
   * The provided value "%s" for argument -%s is not acceptable:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SUBCMDPARSER_VALUE_UNACCEPTABLE_FOR_SHORT_ID =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_SUBCMDPARSER_VALUE_UNACCEPTABLE_FOR_SHORT_ID_104",UTIL,SEVERE_ERROR,104, getClassLoader());

  /**
   * The argument -%s was included multiple times in the provided set of arguments but it does not allow multiple values
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SUBCMDPARSER_NOT_MULTIVALUED_FOR_SHORT_ID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_SUBCMDPARSER_NOT_MULTIVALUED_FOR_SHORT_ID_105",UTIL,SEVERE_ERROR,105, getClassLoader());

  /**
   * The provided argument block '-%s%s' is illegal because the '%s' argument requires a value but is in the same block as at least one other argument that doesn't require a value
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SUBCMDPARSER_CANT_MIX_ARGS_WITH_VALUES =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_SUBCMDPARSER_CANT_MIX_ARGS_WITH_VALUES_106",UTIL,SEVERE_ERROR,106, getClassLoader());

  /**
   * The provided argument "%s" is not recognized
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SUBCMDPARSER_INVALID_ARGUMENT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_SUBCMDPARSER_INVALID_ARGUMENT_107",UTIL,SEVERE_ERROR,107, getClassLoader());

  /**
   * The provided argument %s specifies a valid subcommand, but another subcommand %s was also given.  Only a single subcommand may be provided
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SUBCMDPARSER_MULTIPLE_SUBCOMMANDS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_SUBCMDPARSER_MULTIPLE_SUBCOMMANDS_108",UTIL,SEVERE_ERROR,108, getClassLoader());

  /**
   * The argument %s is required to have a value but none was provided in the argument list and no default value is available
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SUBCMDPARSER_NO_VALUE_FOR_REQUIRED_ARG =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_SUBCMDPARSER_NO_VALUE_FOR_REQUIRED_ARG_109",UTIL,SEVERE_ERROR,109, getClassLoader());

  /**
   * The provided string "%s" cannot be decoded as an LDAP URL because it does not contain the necessary :// component to separate the scheme from the rest of the URL
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAPURL_NO_COLON_SLASH_SLASH =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDAPURL_NO_COLON_SLASH_SLASH_110",UTIL,SEVERE_ERROR,110, getClassLoader());

  /**
   * The provided string "%s" cannot be decoded as an LDAP URL because it does not contain a protocol scheme
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAPURL_NO_SCHEME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDAPURL_NO_SCHEME_111",UTIL,SEVERE_ERROR,111, getClassLoader());

  /**
   * The provided string "%s" cannot be decoded as an LDAP URL because it does not contain a host before the colon to specify the port number
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAPURL_NO_HOST =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDAPURL_NO_HOST_112",UTIL,SEVERE_ERROR,112, getClassLoader());

  /**
   * The provided string "%s" cannot be decoded as an LDAP URL because it does not contain a port number after the colon following the host
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAPURL_NO_PORT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDAPURL_NO_PORT_113",UTIL,SEVERE_ERROR,113, getClassLoader());

  /**
   * The provided string "%s" cannot be decoded as an LDAP URL because the port number portion %s cannot be decoded as an integer
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAPURL_CANNOT_DECODE_PORT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDAPURL_CANNOT_DECODE_PORT_114",UTIL,SEVERE_ERROR,114, getClassLoader());

  /**
   * The provided string "%s" cannot be decoded as an LDAP URL because the provided port number %d is not within the valid range between 1 and 65535
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_LDAPURL_INVALID_PORT =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"SEVERE_ERR_LDAPURL_INVALID_PORT_115",UTIL,SEVERE_ERROR,115, getClassLoader());

  /**
   * The provided string "%s" cannot be decoded as an LDAP URL because the scope string %s was not one of the allowed values of base, one, sub, or subordinate
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAPURL_INVALID_SCOPE_STRING =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDAPURL_INVALID_SCOPE_STRING_116",UTIL,SEVERE_ERROR,116, getClassLoader());

  /**
   * The provided URL component "%s" could not be decoded because the percent character at byte %d was not followed by two hexadecimal digits
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_LDAPURL_PERCENT_TOO_CLOSE_TO_END =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"SEVERE_ERR_LDAPURL_PERCENT_TOO_CLOSE_TO_END_117",UTIL,SEVERE_ERROR,117, getClassLoader());

  /**
   * The provided URL component "%s" could not be decoded because the character at byte %d was not a valid hexadecimal digit
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_LDAPURL_INVALID_HEX_BYTE =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"SEVERE_ERR_LDAPURL_INVALID_HEX_BYTE_118",UTIL,SEVERE_ERROR,118, getClassLoader());

  /**
   * An error occurred while attempting to represent a byte array as a UTF-8 string during the course of decoding a portion of an LDAP URL:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAPURL_CANNOT_CREATE_UTF8_STRING =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDAPURL_CANNOT_CREATE_UTF8_STRING_119",UTIL,SEVERE_ERROR,119, getClassLoader());

  /**
   * Cannot decode value "%s" as a named character set because it does not contain a colon to separate the name from the set of characters
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CHARSET_NO_COLON =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CHARSET_NO_COLON_120",UTIL,MILD_ERROR,120, getClassLoader());

  /**
   * The named character set is invalid because it does not contain a name
   */
  public static final MessageDescriptor.Arg0 ERR_CHARSET_CONSTRUCTOR_NO_NAME =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CHARSET_CONSTRUCTOR_NO_NAME_121",UTIL,MILD_ERROR,121, getClassLoader());

  /**
   * The named character set is invalid because the provide name "%s" has an invalid character at position %d.  Only ASCII alphabetic characters are allowed in the name
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_CHARSET_CONSTRUCTOR_INVALID_NAME_CHAR =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_ERR_CHARSET_CONSTRUCTOR_INVALID_NAME_CHAR_122",UTIL,MILD_ERROR,122, getClassLoader());

  /**
   * Cannot decode value "%s" as a named character set because it does not contain a name to use for the character set
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CHARSET_NO_NAME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CHARSET_NO_NAME_123",UTIL,MILD_ERROR,123, getClassLoader());

  /**
   * Cannot decode value "%s" as a named character set because there are no characters to include in the set
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CHARSET_NO_CHARS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CHARSET_NO_CHARS_124",UTIL,MILD_ERROR,124, getClassLoader());

  /**
   * %d seconds
   */
  public static final MessageDescriptor.Arg1<Number> INFO_TIME_IN_SECONDS =
          new MessageDescriptor.Arg1<Number>(BASE,"INFO_TIME_IN_SECONDS_125",UTIL,INFORMATION,125, getClassLoader());

  /**
   * %d minutes, %d seconds
   */
  public static final MessageDescriptor.Arg2<Number,Number> INFO_TIME_IN_MINUTES_SECONDS =
          new MessageDescriptor.Arg2<Number,Number>(BASE,"INFO_TIME_IN_MINUTES_SECONDS_126",UTIL,INFORMATION,126, getClassLoader());

  /**
   * %d hours, %d minutes, %d seconds
   */
  public static final MessageDescriptor.Arg3<Number,Number,Number> INFO_TIME_IN_HOURS_MINUTES_SECONDS =
          new MessageDescriptor.Arg3<Number,Number,Number>(BASE,"INFO_TIME_IN_HOURS_MINUTES_SECONDS_127",UTIL,INFORMATION,127, getClassLoader());

  /**
   * %d days, %d hours, %d minutes, %d seconds
   */
  public static final MessageDescriptor.Arg4<Number,Number,Number,Number> INFO_TIME_IN_DAYS_HOURS_MINUTES_SECONDS =
          new MessageDescriptor.Arg4<Number,Number,Number,Number>(BASE,"INFO_TIME_IN_DAYS_HOURS_MINUTES_SECONDS_128",UTIL,INFORMATION,128, getClassLoader());

  /**
   * account-temporarily-locked
   */
  public static final MessageDescriptor.Arg0 INFO_ACCTNOTTYPE_ACCOUNT_TEMPORARILY_LOCKED =
          new MessageDescriptor.Arg0(BASE,"INFO_ACCTNOTTYPE_ACCOUNT_TEMPORARILY_LOCKED_129",UTIL,INFORMATION,129, getClassLoader());

  /**
   * account-permanently-locked
   */
  public static final MessageDescriptor.Arg0 INFO_ACCTNOTTYPE_ACCOUNT_PERMANENTLY_LOCKED =
          new MessageDescriptor.Arg0(BASE,"INFO_ACCTNOTTYPE_ACCOUNT_PERMANENTLY_LOCKED_130",UTIL,INFORMATION,130, getClassLoader());

  /**
   * account-unlocked
   */
  public static final MessageDescriptor.Arg0 INFO_ACCTNOTTYPE_ACCOUNT_UNLOCKED =
          new MessageDescriptor.Arg0(BASE,"INFO_ACCTNOTTYPE_ACCOUNT_UNLOCKED_131",UTIL,INFORMATION,131, getClassLoader());

  /**
   * account-idle-locked
   */
  public static final MessageDescriptor.Arg0 INFO_ACCTNOTTYPE_ACCOUNT_IDLE_LOCKED =
          new MessageDescriptor.Arg0(BASE,"INFO_ACCTNOTTYPE_ACCOUNT_IDLE_LOCKED_132",UTIL,INFORMATION,132, getClassLoader());

  /**
   * account-reset-locked
   */
  public static final MessageDescriptor.Arg0 INFO_ACCTNOTTYPE_ACCOUNT_RESET_LOCKED =
          new MessageDescriptor.Arg0(BASE,"INFO_ACCTNOTTYPE_ACCOUNT_RESET_LOCKED_133",UTIL,INFORMATION,133, getClassLoader());

  /**
   * account-disabled
   */
  public static final MessageDescriptor.Arg0 INFO_ACCTNOTTYPE_ACCOUNT_DISABLED =
          new MessageDescriptor.Arg0(BASE,"INFO_ACCTNOTTYPE_ACCOUNT_DISABLED_134",UTIL,INFORMATION,134, getClassLoader());

  /**
   * account-enabled
   */
  public static final MessageDescriptor.Arg0 INFO_ACCTNOTTYPE_ACCOUNT_ENABLED =
          new MessageDescriptor.Arg0(BASE,"INFO_ACCTNOTTYPE_ACCOUNT_ENABLED_135",UTIL,INFORMATION,135, getClassLoader());

  /**
   * account-expired
   */
  public static final MessageDescriptor.Arg0 INFO_ACCTNOTTYPE_ACCOUNT_EXPIRED =
          new MessageDescriptor.Arg0(BASE,"INFO_ACCTNOTTYPE_ACCOUNT_EXPIRED_136",UTIL,INFORMATION,136, getClassLoader());

  /**
   * password-expired
   */
  public static final MessageDescriptor.Arg0 INFO_ACCTNOTTYPE_PASSWORD_EXPIRED =
          new MessageDescriptor.Arg0(BASE,"INFO_ACCTNOTTYPE_PASSWORD_EXPIRED_137",UTIL,INFORMATION,137, getClassLoader());

  /**
   * password-expiring
   */
  public static final MessageDescriptor.Arg0 INFO_ACCTNOTTYPE_PASSWORD_EXPIRING =
          new MessageDescriptor.Arg0(BASE,"INFO_ACCTNOTTYPE_PASSWORD_EXPIRING_138",UTIL,INFORMATION,138, getClassLoader());

  /**
   * password-reset
   */
  public static final MessageDescriptor.Arg0 INFO_ACCTNOTTYPE_PASSWORD_RESET =
          new MessageDescriptor.Arg0(BASE,"INFO_ACCTNOTTYPE_PASSWORD_RESET_139",UTIL,INFORMATION,139, getClassLoader());

  /**
   * password-changed
   */
  public static final MessageDescriptor.Arg0 INFO_ACCTNOTTYPE_PASSWORD_CHANGED =
          new MessageDescriptor.Arg0(BASE,"INFO_ACCTNOTTYPE_PASSWORD_CHANGED_140",UTIL,INFORMATION,140, getClassLoader());

  /**
   * Unable to set permissions for file %s because it does not exist
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_FILEPERM_SET_NO_SUCH_FILE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_FILEPERM_SET_NO_SUCH_FILE_141",UTIL,MILD_ERROR,141, getClassLoader());

  /**
   * Unable to execute the chmod command to set file permissions on %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_FILEPERM_CANNOT_EXEC_CHMOD =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_FILEPERM_CANNOT_EXEC_CHMOD_142",UTIL,MILD_ERROR,142, getClassLoader());

  /**
   * One or more exceptions were thrown in the process of updating the file permissions for %s.  Some of the permissions for the file may have been altered
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_FILEPERM_SET_JAVA_EXCEPTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_FILEPERM_SET_JAVA_EXCEPTION_143",UTIL,SEVERE_ERROR,143, getClassLoader());

  /**
   * One or more updates to the file permissions for %s failed, but at least one update was successful.  Some of the permissions for the file may have been altered
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_FILEPERM_SET_JAVA_FAILED_ALTERED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_FILEPERM_SET_JAVA_FAILED_ALTERED_144",UTIL,SEVERE_ERROR,144, getClassLoader());

  /**
   * All of the attempts to update the file permissions for %s failed.  The file should be left with its original permissions
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_FILEPERM_SET_JAVA_FAILED_UNALTERED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_FILEPERM_SET_JAVA_FAILED_UNALTERED_145",UTIL,SEVERE_ERROR,145, getClassLoader());

  /**
   * The provided string %s does not represent a valid UNIX file mode.  UNIX file modes must be a three-character string in which each character is a numeric digit between zero and seven
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_FILEPERM_INVALID_UNIX_MODE_STRING =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_FILEPERM_INVALID_UNIX_MODE_STRING_146",UTIL,MILD_ERROR,146, getClassLoader());

  /**
   * The %s command will not be allowed because the Directory Server has been configured to refuse the use of the exec method
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_EXEC_DISABLED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_EXEC_DISABLED_147",UTIL,MILD_ERROR,147, getClassLoader());

  /**
   * A precondition of the invoked method was not met.  This This usually means there is a defect somewhere in the call stack.  Details: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_VALIDATOR_PRECONDITION_NOT_MET =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_VALIDATOR_PRECONDITION_NOT_MET_148",UTIL,SEVERE_ERROR,148, getClassLoader());

  /**
   * Global Options:
   */
  public static final MessageDescriptor.Arg0 INFO_GLOBAL_OPTIONS =
          new MessageDescriptor.Arg0(BASE,"INFO_GLOBAL_OPTIONS_149",UTIL,INFORMATION,149, getClassLoader());

  /**
   * See "%s --help"
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_GLOBAL_OPTIONS_REFERENCE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_GLOBAL_OPTIONS_REFERENCE_150",UTIL,INFORMATION,150, getClassLoader());

  /**
   * SubCommand Options:
   */
  public static final MessageDescriptor.Arg0 INFO_SUBCMD_OPTIONS =
          new MessageDescriptor.Arg0(BASE,"INFO_SUBCMD_OPTIONS_151",UTIL,INFORMATION,151, getClassLoader());

  /**
   * Usage:
   */
  public static final MessageDescriptor.Arg0 INFO_ARGPARSER_USAGE =
          new MessageDescriptor.Arg0(BASE,"INFO_ARGPARSER_USAGE_152",UTIL,INFORMATION,152, getClassLoader());

  /**
   * Available subcommands:
   */
  public static final MessageDescriptor.Arg0 INFO_SUBCMDPARSER_SUBCMD_HEADING =
          new MessageDescriptor.Arg0(BASE,"INFO_SUBCMDPARSER_SUBCMD_HEADING_153",UTIL,INFORMATION,153, getClassLoader());

  /**
   * See "%s --help-{category}"
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_SUBCMDPARSER_SUBCMD_REFERENCE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_SUBCMDPARSER_SUBCMD_REFERENCE_154",UTIL,INFORMATION,154, getClassLoader());

  /**
   * The global options are:
   */
  public static final MessageDescriptor.Arg0 INFO_SUBCMDPARSER_GLOBAL_HEADING =
          new MessageDescriptor.Arg0(BASE,"INFO_SUBCMDPARSER_GLOBAL_HEADING_155",UTIL,INFORMATION,155, getClassLoader());

  /**
   * See "%s --help" to get more usage help
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_GLOBAL_HELP_REFERENCE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_GLOBAL_HELP_REFERENCE_156",UTIL,INFORMATION,156, getClassLoader());

  /**
   * Failed to rename file %s to %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_RENAMEFILE_CANNOT_RENAME =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_RENAMEFILE_CANNOT_RENAME_157",UTIL,SEVERE_ERROR,157, getClassLoader());

  /**
   * Failed to delete target file %s.  Make sure the file is not currently in use by this or another application
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_RENAMEFILE_CANNOT_DELETE_TARGET =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_RENAMEFILE_CANNOT_DELETE_TARGET_158",UTIL,SEVERE_ERROR,158, getClassLoader());

  /**
   * Refusing to trust client or issuer certificate '%s' because it expired on %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_EXPCHECK_TRUSTMGR_CLIENT_CERT_EXPIRED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_EXPCHECK_TRUSTMGR_CLIENT_CERT_EXPIRED_159",UTIL,SEVERE_ERROR,159, getClassLoader());

  /**
   * Refusing to trust client or issuer certificate '%s' because it is not valid until %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_EXPCHECK_TRUSTMGR_CLIENT_CERT_NOT_YET_VALID =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_EXPCHECK_TRUSTMGR_CLIENT_CERT_NOT_YET_VALID_160",UTIL,SEVERE_ERROR,160, getClassLoader());

  /**
   * Refusing to trust server or issuer certificate '%s' because it expired on %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_EXPCHECK_TRUSTMGR_SERVER_CERT_EXPIRED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_EXPCHECK_TRUSTMGR_SERVER_CERT_EXPIRED_161",UTIL,SEVERE_ERROR,161, getClassLoader());

  /**
   * Refusing to trust server or issuer certificate '%s' because it is not valid until %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_EXPCHECK_TRUSTMGR_SERVER_CERT_NOT_YET_VALID =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_EXPCHECK_TRUSTMGR_SERVER_CERT_NOT_YET_VALID_162",UTIL,SEVERE_ERROR,162, getClassLoader());

  /**
   * Entry %s read from LDIF starting at line %d includes value "%s" for attribute %s that is invalid according to the associated syntax:  %s
   */
  public static final MessageDescriptor.Arg5<CharSequence,Number,CharSequence,CharSequence,CharSequence> WARN_LDIF_VALUE_VIOLATES_SYNTAX =
          new MessageDescriptor.Arg5<CharSequence,Number,CharSequence,CharSequence,CharSequence>(BASE,"MILD_WARN_LDIF_VALUE_VIOLATES_SYNTAX_163",UTIL,MILD_WARNING,163, getClassLoader());

  /**
   * The specified skip file %s already exists and the import configuration indicates that no attempt should be made to append to or replace the file
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SKIP_FILE_EXISTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_SKIP_FILE_EXISTS_164",UTIL,SEVERE_ERROR,164, getClassLoader());

  /**
   * Skipping entry %s because the DN is not one that should be included based on the include and exclude branches
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIF_SKIP =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDIF_SKIP_165",UTIL,MILD_ERROR,165, getClassLoader());

  /**
   * To get the list of subcommands use:
   */
  public static final MessageDescriptor.Arg0 INFO_SUBCMDPARSER_SUBCMD_HELP_HEADING =
          new MessageDescriptor.Arg0(BASE,"INFO_SUBCMDPARSER_SUBCMD_HELP_HEADING_166",UTIL,INFORMATION,166, getClassLoader());

  /**
   * The Directory Server cannot be started because it is already running
   */
  public static final MessageDescriptor.Arg0 ERR_EMBEDUTILS_SERVER_ALREADY_RUNNING =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_EMBEDUTILS_SERVER_ALREADY_RUNNING_167",UTIL,SEVERE_ERROR,167, getClassLoader());

  /**
   * {options}
   */
  public static final MessageDescriptor.Arg0 INFO_SUBCMDPARSER_OPTIONS =
          new MessageDescriptor.Arg0(BASE,"INFO_SUBCMDPARSER_OPTIONS_168",UTIL,INFORMATION,168, getClassLoader());

  /**
   * {subcommand} {options}
   */
  public static final MessageDescriptor.Arg0 INFO_SUBCMDPARSER_SUBCMD_AND_OPTIONS =
          new MessageDescriptor.Arg0(BASE,"INFO_SUBCMDPARSER_SUBCMD_AND_OPTIONS_169",UTIL,INFORMATION,169, getClassLoader());

  /**
   *         where {options} include:
   */
  public static final MessageDescriptor.Arg0 INFO_SUBCMDPARSER_WHERE_OPTIONS_INCLUDE =
          new MessageDescriptor.Arg0(BASE,"INFO_SUBCMDPARSER_WHERE_OPTIONS_INCLUDE_170",UTIL,INFORMATION,170, getClassLoader());

  /**
   * Send an e-mail message via SMTP
   */
  public static final MessageDescriptor.Arg0 INFO_EMAIL_TOOL_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_EMAIL_TOOL_DESCRIPTION_171",UTIL,INFORMATION,171, getClassLoader());

  /**
   * The address of the SMTP server to use to send the message
   */
  public static final MessageDescriptor.Arg0 INFO_EMAIL_HOST_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_EMAIL_HOST_DESCRIPTION_172",UTIL,INFORMATION,172, getClassLoader());

  /**
   * The address to use for the message sender
   */
  public static final MessageDescriptor.Arg0 INFO_EMAIL_FROM_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_EMAIL_FROM_DESCRIPTION_173",UTIL,INFORMATION,173, getClassLoader());

  /**
   * The address to use for the message recipient
   */
  public static final MessageDescriptor.Arg0 INFO_EMAIL_TO_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_EMAIL_TO_DESCRIPTION_174",UTIL,INFORMATION,174, getClassLoader());

  /**
   * The subject to use for the e-mail message
   */
  public static final MessageDescriptor.Arg0 INFO_EMAIL_SUBJECT_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_EMAIL_SUBJECT_DESCRIPTION_175",UTIL,INFORMATION,175, getClassLoader());

  /**
   * The path to the file containing the text for the message body
   */
  public static final MessageDescriptor.Arg0 INFO_EMAIL_BODY_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_EMAIL_BODY_DESCRIPTION_176",UTIL,INFORMATION,176, getClassLoader());

  /**
   * The path to a file to attach to the e-mail message
   */
  public static final MessageDescriptor.Arg0 INFO_EMAIL_ATTACH_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_EMAIL_ATTACH_DESCRIPTION_177",UTIL,INFORMATION,177, getClassLoader());

  /**
   * Display this usage information
   */
  public static final MessageDescriptor.Arg0 INFO_EMAIL_HELP_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_EMAIL_HELP_DESCRIPTION_178",UTIL,INFORMATION,178, getClassLoader());

  /**
   * The file %s specified as the body file for the e-mail message does not exist
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_EMAIL_NO_SUCH_BODY_FILE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_EMAIL_NO_SUCH_BODY_FILE_181",UTIL,SEVERE_ERROR,181, getClassLoader());

  /**
   * An error occurred while attempting to process message body file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_EMAIL_CANNOT_PROCESS_BODY_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_EMAIL_CANNOT_PROCESS_BODY_FILE_182",UTIL,SEVERE_ERROR,182, getClassLoader());

  /**
   * The attachment file %s does not exist
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_EMAIL_NO_SUCH_ATTACHMENT_FILE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_EMAIL_NO_SUCH_ATTACHMENT_FILE_183",UTIL,SEVERE_ERROR,183, getClassLoader());

  /**
   * An error occurred while trying to attach file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_EMAIL_CANNOT_ATTACH_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_EMAIL_CANNOT_ATTACH_FILE_184",UTIL,SEVERE_ERROR,184, getClassLoader());

  /**
   * An error occurred while trying to send the e-mail message:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_EMAIL_CANNOT_SEND_MESSAGE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_EMAIL_CANNOT_SEND_MESSAGE_185",UTIL,SEVERE_ERROR,185, getClassLoader());

  /**
   * This utility can be used to encode and decode information using base64
   */
  public static final MessageDescriptor.Arg0 INFO_BASE64_TOOL_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_BASE64_TOOL_DESCRIPTION_186",UTIL,INFORMATION,186, getClassLoader());

  /**
   * Display this usage information
   */
  public static final MessageDescriptor.Arg0 INFO_BASE64_HELP_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_BASE64_HELP_DESCRIPTION_187",UTIL,INFORMATION,187, getClassLoader());

  /**
   * Decode base64-encoded information into raw data
   */
  public static final MessageDescriptor.Arg0 INFO_BASE64_DECODE_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_BASE64_DECODE_DESCRIPTION_188",UTIL,INFORMATION,188, getClassLoader());

  /**
   * Encode raw data using base64
   */
  public static final MessageDescriptor.Arg0 INFO_BASE64_ENCODE_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_BASE64_ENCODE_DESCRIPTION_189",UTIL,INFORMATION,189, getClassLoader());

  /**
   * The base64-encoded data to be decoded
   */
  public static final MessageDescriptor.Arg0 INFO_BASE64_ENCODED_DATA_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_BASE64_ENCODED_DATA_DESCRIPTION_190",UTIL,INFORMATION,190, getClassLoader());

  /**
   * The path to a file containing the base64-encoded data to be decoded
   */
  public static final MessageDescriptor.Arg0 INFO_BASE64_ENCODED_FILE_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_BASE64_ENCODED_FILE_DESCRIPTION_191",UTIL,INFORMATION,191, getClassLoader());

  /**
   * The raw data to be base64 encoded
   */
  public static final MessageDescriptor.Arg0 INFO_BASE64_RAW_DATA_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_BASE64_RAW_DATA_DESCRIPTION_192",UTIL,INFORMATION,192, getClassLoader());

  /**
   * The path to a file containing the raw data to be base64 encoded
   */
  public static final MessageDescriptor.Arg0 INFO_BASE64_RAW_FILE_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_BASE64_RAW_FILE_DESCRIPTION_193",UTIL,INFORMATION,193, getClassLoader());

  /**
   * The path to a file to which the base64-encoded data should be written
   */
  public static final MessageDescriptor.Arg0 INFO_BASE64_TO_ENCODED_FILE_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_BASE64_TO_ENCODED_FILE_DESCRIPTION_194",UTIL,INFORMATION,194, getClassLoader());

  /**
   * The path to a file to which the raw base64-decoded data should be written
   */
  public static final MessageDescriptor.Arg0 INFO_BASE64_TO_RAW_FILE_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_BASE64_TO_RAW_FILE_DESCRIPTION_195",UTIL,INFORMATION,195, getClassLoader());

  /**
   * An error occurred while attempting to read the raw data to encode:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_BASE64_CANNOT_READ_RAW_DATA =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_BASE64_CANNOT_READ_RAW_DATA_196",UTIL,SEVERE_ERROR,196, getClassLoader());

  /**
   * An error occurred while attempting to write the encoded data:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_BASE64_CANNOT_WRITE_ENCODED_DATA =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_BASE64_CANNOT_WRITE_ENCODED_DATA_197",UTIL,SEVERE_ERROR,197, getClassLoader());

  /**
   * An error occurred while attempting to read the base64-encoded data:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_BASE64_CANNOT_READ_ENCODED_DATA =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_BASE64_CANNOT_READ_ENCODED_DATA_198",UTIL,SEVERE_ERROR,198, getClassLoader());

  /**
   * An error occurred while attempting to write the decoded data:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_BASE64_CANNOT_WRITE_RAW_DATA =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_BASE64_CANNOT_WRITE_RAW_DATA_199",UTIL,SEVERE_ERROR,199, getClassLoader());

  /**
   * Unknown subcommand %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_BASE64_UNKNOWN_SUBCOMMAND =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_BASE64_UNKNOWN_SUBCOMMAND_200",UTIL,SEVERE_ERROR,200, getClassLoader());

  /**
   * no
   */
  public static final MessageDescriptor.Arg0 INFO_GENERAL_NO =
          new MessageDescriptor.Arg0(BASE,"INFO_GENERAL_NO_201",UTIL,INFORMATION,201, getClassLoader());

  /**
   * yes
   */
  public static final MessageDescriptor.Arg0 INFO_GENERAL_YES =
          new MessageDescriptor.Arg0(BASE,"INFO_GENERAL_YES_202",UTIL,INFORMATION,202, getClassLoader());

  /**
   * Invalid response. Please enter "%s" or "%s"
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CONSOLE_APP_CONFIRM =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CONSOLE_APP_CONFIRM_203",UTIL,SEVERE_ERROR,203, getClassLoader());

  /**
   * help
   */
  public static final MessageDescriptor.Arg0 INFO_MENU_OPTION_HELP =
          new MessageDescriptor.Arg0(BASE,"INFO_MENU_OPTION_HELP_204",UTIL,INFORMATION,204, getClassLoader());

  /**
   * ?
   */
  public static final MessageDescriptor.Arg0 INFO_MENU_OPTION_HELP_KEY =
          new MessageDescriptor.Arg0(BASE,"INFO_MENU_OPTION_HELP_KEY_205",UTIL,INFORMATION,205, getClassLoader());

  /**
   * cancel
   */
  public static final MessageDescriptor.Arg0 INFO_MENU_OPTION_CANCEL =
          new MessageDescriptor.Arg0(BASE,"INFO_MENU_OPTION_CANCEL_206",UTIL,INFORMATION,206, getClassLoader());

  /**
   * c
   */
  public static final MessageDescriptor.Arg0 INFO_MENU_OPTION_CANCEL_KEY =
          new MessageDescriptor.Arg0(BASE,"INFO_MENU_OPTION_CANCEL_KEY_207",UTIL,INFORMATION,207, getClassLoader());

  /**
   * quit
   */
  public static final MessageDescriptor.Arg0 INFO_MENU_OPTION_QUIT =
          new MessageDescriptor.Arg0(BASE,"INFO_MENU_OPTION_QUIT_208",UTIL,INFORMATION,208, getClassLoader());

  /**
   * q
   */
  public static final MessageDescriptor.Arg0 INFO_MENU_OPTION_QUIT_KEY =
          new MessageDescriptor.Arg0(BASE,"INFO_MENU_OPTION_QUIT_KEY_209",UTIL,INFORMATION,209, getClassLoader());

  /**
   * %d)
   */
  public static final MessageDescriptor.Arg1<Number> INFO_MENU_NUMERIC_OPTION =
          new MessageDescriptor.Arg1<Number>(BASE,"INFO_MENU_NUMERIC_OPTION_210",UTIL,INFORMATION,210, getClassLoader());

  /**
   * %c)
   */
  public static final MessageDescriptor.Arg1<Character> INFO_MENU_CHAR_OPTION =
          new MessageDescriptor.Arg1<Character>(BASE,"INFO_MENU_CHAR_OPTION_211",UTIL,INFORMATION,211, getClassLoader());

  /**
   * Invalid response. Please enter one or more valid menu options
   */
  public static final MessageDescriptor.Arg0 ERR_MENU_BAD_CHOICE_MULTI =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_MENU_BAD_CHOICE_MULTI_212",UTIL,SEVERE_ERROR,212, getClassLoader());

  /**
   * Invalid response. Please enter a valid menu option
   */
  public static final MessageDescriptor.Arg0 ERR_MENU_BAD_CHOICE_SINGLE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_MENU_BAD_CHOICE_SINGLE_213",UTIL,SEVERE_ERROR,213, getClassLoader());

  /**
   * The option "%s" was specified more than once. Please enter one or more valid menu options
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MENU_BAD_CHOICE_MULTI_DUPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_MENU_BAD_CHOICE_MULTI_DUPE_214",UTIL,SEVERE_ERROR,214, getClassLoader());

  /**
   * Enter choice:
   */
  public static final MessageDescriptor.Arg0 INFO_MENU_PROMPT_SINGLE =
          new MessageDescriptor.Arg0(BASE,"INFO_MENU_PROMPT_SINGLE_215",UTIL,INFORMATION,215, getClassLoader());

  /**
   * Enter choice [%s]:
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_MENU_PROMPT_SINGLE_DEFAULT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_MENU_PROMPT_SINGLE_DEFAULT_216",UTIL,INFORMATION,216, getClassLoader());

  /**
   * Enter one or more choices separated by commas:
   */
  public static final MessageDescriptor.Arg0 INFO_MENU_PROMPT_MULTI =
          new MessageDescriptor.Arg0(BASE,"INFO_MENU_PROMPT_MULTI_217",UTIL,INFORMATION,217, getClassLoader());

  /**
   * Enter one or more choices separated by commas [%s]:
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_MENU_PROMPT_MULTI_DEFAULT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_MENU_PROMPT_MULTI_DEFAULT_218",UTIL,INFORMATION,218, getClassLoader());

  /**
   * Press RETURN to continue
   */
  public static final MessageDescriptor.Arg0 INFO_MENU_PROMPT_RETURN_TO_CONTINUE =
          new MessageDescriptor.Arg0(BASE,"INFO_MENU_PROMPT_RETURN_TO_CONTINUE_219",UTIL,INFORMATION,219, getClassLoader());

  /**
   * %s (%s / %s) [%s]:
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> INFO_MENU_PROMPT_CONFIRM =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"INFO_MENU_PROMPT_CONFIRM_220",UTIL,INFORMATION,220, getClassLoader());

  /**
   * The response could not be read from the console due to the following error: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONSOLE_INPUT_ERROR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONSOLE_INPUT_ERROR_221",UTIL,SEVERE_ERROR,221, getClassLoader());

  /**
   * back
   */
  public static final MessageDescriptor.Arg0 INFO_MENU_OPTION_BACK =
          new MessageDescriptor.Arg0(BASE,"INFO_MENU_OPTION_BACK_222",UTIL,INFORMATION,222, getClassLoader());

  /**
   * b
   */
  public static final MessageDescriptor.Arg0 INFO_MENU_OPTION_BACK_KEY =
          new MessageDescriptor.Arg0(BASE,"INFO_MENU_OPTION_BACK_KEY_223",UTIL,INFORMATION,223, getClassLoader());

  /**
   * Rejecting entry %s because it was rejected by a plugin
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIF_REJECTED_BY_PLUGIN_NOMESSAGE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDIF_REJECTED_BY_PLUGIN_NOMESSAGE_224",UTIL,SEVERE_ERROR,224, getClassLoader());

  /**
   * Rejecting entry %s because it was rejected by a plugin:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIF_REJECTED_BY_PLUGIN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIF_REJECTED_BY_PLUGIN_225",UTIL,SEVERE_ERROR,225, getClassLoader());

  /**
   * LDAP
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONN_PROMPT_SECURITY_LDAP =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONN_PROMPT_SECURITY_LDAP_226",UTIL,INFORMATION,226, getClassLoader());

  /**
   * LDAP with SSL
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONN_PROMPT_SECURITY_USE_SSL =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONN_PROMPT_SECURITY_USE_SSL_227",UTIL,INFORMATION,227, getClassLoader());

  /**
   * LDAP with StartTLS
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONN_PROMPT_SECURITY_USE_START_TLS =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONN_PROMPT_SECURITY_USE_START_TLS_228",UTIL,INFORMATION,228, getClassLoader());

  /**
   * Automatically trust
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONN_PROMPT_SECURITY_USE_TRUST_ALL =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONN_PROMPT_SECURITY_USE_TRUST_ALL_229",UTIL,INFORMATION,229, getClassLoader());

  /**
   * Truststore path:
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONN_PROMPT_SECURITY_TRUSTSTORE_PATH =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONN_PROMPT_SECURITY_TRUSTSTORE_PATH_230",UTIL,INFORMATION,230, getClassLoader());

  /**
   * Password for truststore '%s':
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_LDAP_CONN_PROMPT_SECURITY_TRUSTSTORE_PASSWORD =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_LDAP_CONN_PROMPT_SECURITY_TRUSTSTORE_PASSWORD_231",UTIL,INFORMATION,231, getClassLoader());

  /**
   * Do you want to perform secure authentication (client side authentication)?
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONN_PROMPT_SECURITY_KEYSTORE_NEEDED =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONN_PROMPT_SECURITY_KEYSTORE_NEEDED_232",UTIL,INFORMATION,232, getClassLoader());

  /**
   * Keystore path:
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONN_PROMPT_SECURITY_KEYSTORE_PATH =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONN_PROMPT_SECURITY_KEYSTORE_PATH_233",UTIL,INFORMATION,233, getClassLoader());

  /**
   * Password for keystore '%s':
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_LDAP_CONN_PROMPT_SECURITY_KEYSTORE_PASSWORD =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_LDAP_CONN_PROMPT_SECURITY_KEYSTORE_PASSWORD_234",UTIL,INFORMATION,234, getClassLoader());

  /**
   * Certificate nickname:
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONN_PROMPT_SECURITY_CERTIFICATE_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONN_PROMPT_SECURITY_CERTIFICATE_NAME_235",UTIL,INFORMATION,235, getClassLoader());

  /**
   * >>>> Specify OpenDS LDAP connection parameters
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONN_HEADING_CONNECTION_PARAMETERS =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONN_HEADING_CONNECTION_PARAMETERS_236",UTIL,INFORMATION,236, getClassLoader());

  /**
   * The hostname "%s" could not be resolved. Please check you have provided the correct address
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_CONN_BAD_HOST_NAME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDAP_CONN_BAD_HOST_NAME_237",UTIL,SEVERE_ERROR,237, getClassLoader());

  /**
   * Invalid port number "%s". Please enter a valid port number between 1 and 65535
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_CONN_BAD_PORT_NUMBER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDAP_CONN_BAD_PORT_NUMBER_238",UTIL,SEVERE_ERROR,238, getClassLoader());

  /**
   * Directory server hostname or IP address [%s]:
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_LDAP_CONN_PROMPT_HOST_NAME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_LDAP_CONN_PROMPT_HOST_NAME_239",UTIL,INFORMATION,239, getClassLoader());

  /**
   * Directory server port number [%d]:
   */
  public static final MessageDescriptor.Arg1<Number> INFO_LDAP_CONN_PROMPT_PORT_NUMBER =
          new MessageDescriptor.Arg1<Number>(BASE,"INFO_LDAP_CONN_PROMPT_PORT_NUMBER_240",UTIL,INFORMATION,240, getClassLoader());

  /**
   * Administrator user bind DN [%s]:
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_LDAP_CONN_PROMPT_BIND_DN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_LDAP_CONN_PROMPT_BIND_DN_241",UTIL,INFORMATION,241, getClassLoader());

  /**
   * How do you want to connect?
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONN_PROMPT_SECURITY_USE_SECURE_CTX =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONN_PROMPT_SECURITY_USE_SECURE_CTX_242",UTIL,INFORMATION,242, getClassLoader());

  /**
   * %d
   */
  public static final MessageDescriptor.Arg1<Number> INFO_LDAP_CONN_PROMPT_SECURITY_PROTOCOL_DEFAULT_CHOICE =
          new MessageDescriptor.Arg1<Number>(BASE,"INFO_LDAP_CONN_PROMPT_SECURITY_PROTOCOL_DEFAULT_CHOICE_243",UTIL,INFORMATION,243, getClassLoader());

  /**
   * The provided path is not valid
   */
  public static final MessageDescriptor.Arg0 ERR_LDAP_CONN_PROMPT_SECURITY_INVALID_FILE_PATH =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_LDAP_CONN_PROMPT_SECURITY_INVALID_FILE_PATH_244",UTIL,SEVERE_ERROR,244, getClassLoader());

  /**
   * How do you want to trust the server certificate?
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONN_PROMPT_SECURITY_TRUST_METHOD =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONN_PROMPT_SECURITY_TRUST_METHOD_245",UTIL,INFORMATION,245, getClassLoader());

  /**
   * Use a truststore
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONN_PROMPT_SECURITY_TRUSTSTORE =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONN_PROMPT_SECURITY_TRUSTSTORE_246",UTIL,INFORMATION,246, getClassLoader());

  /**
   * Manually validate
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONN_PROMPT_SECURITY_MANUAL_CHECK =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONN_PROMPT_SECURITY_MANUAL_CHECK_247",UTIL,INFORMATION,247, getClassLoader());

  /**
   * Server Certificate:
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONN_PROMPT_SECURITY_SERVER_CERTIFICATE =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONN_PROMPT_SECURITY_SERVER_CERTIFICATE_248",UTIL,INFORMATION,248, getClassLoader());

  /**
   * %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_LDAP_CONN_SECURITY_SERVER_CERTIFICATE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_LDAP_CONN_SECURITY_SERVER_CERTIFICATE_249",UTIL,INFORMATION,249, getClassLoader());

  /**
   * Do you trust this server certificate?
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONN_PROMPT_SECURITY_TRUST_OPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONN_PROMPT_SECURITY_TRUST_OPTION_250",UTIL,INFORMATION,250, getClassLoader());

  /**
   * No
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONN_PROMPT_SECURITY_TRUST_OPTION_NO =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONN_PROMPT_SECURITY_TRUST_OPTION_NO_251",UTIL,INFORMATION,251, getClassLoader());

  /**
   * Yes, for this session only
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONN_PROMPT_SECURITY_TRUST_OPTION_SESSION =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONN_PROMPT_SECURITY_TRUST_OPTION_SESSION_252",UTIL,INFORMATION,252, getClassLoader());

  /**
   * Yes, also add it to a truststore
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONN_PROMPT_SECURITY_TRUST_OPTION_ALWAYS =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONN_PROMPT_SECURITY_TRUST_OPTION_ALWAYS_253",UTIL,INFORMATION,253, getClassLoader());

  /**
   * View certificate details
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONN_PROMPT_SECURITY_CERTIFICATE_DETAILS =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONN_PROMPT_SECURITY_CERTIFICATE_DETAILS_254",UTIL,INFORMATION,254, getClassLoader());

  /**
   * User DN  : %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_LDAP_CONN_SECURITY_SERVER_CERTIFICATE_USER_DN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_LDAP_CONN_SECURITY_SERVER_CERTIFICATE_USER_DN_255",UTIL,INFORMATION,255, getClassLoader());

  /**
   * Validity : From '%s'%n             To '%s'
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_LDAP_CONN_SECURITY_SERVER_CERTIFICATE_VALIDITY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_LDAP_CONN_SECURITY_SERVER_CERTIFICATE_VALIDITY_256",UTIL,INFORMATION,256, getClassLoader());

  /**
   * Issuer   : %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_LDAP_CONN_SECURITY_SERVER_CERTIFICATE_ISSUER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_LDAP_CONN_SECURITY_SERVER_CERTIFICATE_ISSUER_257",UTIL,INFORMATION,257, getClassLoader());

  /**
   * Which certificate do you want to use?
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONN_PROMPT_SECURITY_CERTIFICATE_ALIASES =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONN_PROMPT_SECURITY_CERTIFICATE_ALIASES_258",UTIL,INFORMATION,258, getClassLoader());

  /**
   * %s (%s)
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_LDAP_CONN_PROMPT_SECURITY_CERTIFICATE_ALIAS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_LDAP_CONN_PROMPT_SECURITY_CERTIFICATE_ALIAS_259",UTIL,INFORMATION,259, getClassLoader());

  /**
   * Global %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_SUBCMDPARSER_GLOBAL_HEADING_PREFIX =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_SUBCMDPARSER_GLOBAL_HEADING_PREFIX_260",UTIL,INFORMATION,260, getClassLoader());

  /**
   * %s [%s]:
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_PROMPT_SINGLE_DEFAULT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_PROMPT_SINGLE_DEFAULT_261",UTIL,INFORMATION,261, getClassLoader());

  /**
   * Global Administrator User ID [%s]:
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_LDAP_CONN_PROMPT_ADMINISTRATOR_UID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_LDAP_CONN_PROMPT_ADMINISTRATOR_UID_262",UTIL,INFORMATION,262, getClassLoader());

  /**
   * Global Administrator User ID, or bind DN if no Global Administrator is defined [%s]:
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_LDAP_CONN_GLOBAL_ADMINISTRATOR_OR_BINDDN_PROMPT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_LDAP_CONN_GLOBAL_ADMINISTRATOR_OR_BINDDN_PROMPT_263",UTIL,INFORMATION,263, getClassLoader());

  /**
   * Usage:  java %s  {options}
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ARGPARSER_USAGE_JAVA_CLASSNAME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ARGPARSER_USAGE_JAVA_CLASSNAME_264",UTIL,INFORMATION,264, getClassLoader());

  /**
   * Usage:  %s  {options}
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ARGPARSER_USAGE_JAVA_SCRIPTNAME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ARGPARSER_USAGE_JAVA_SCRIPTNAME_265",UTIL,INFORMATION,265, getClassLoader());

  /**
   * {trailing-arguments}
   */
  public static final MessageDescriptor.Arg0 INFO_ARGPARSER_USAGE_TRAILINGARGS =
          new MessageDescriptor.Arg0(BASE,"INFO_ARGPARSER_USAGE_TRAILINGARGS_266",UTIL,INFORMATION,266, getClassLoader());

  /**
   * Confirmation tries limit reached (%d)
   */
  public static final MessageDescriptor.Arg1<Number> ERR_CONFIRMATION_TRIES_LIMIT_REACHED =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_CONFIRMATION_TRIES_LIMIT_REACHED_267",UTIL,MILD_ERROR,267, getClassLoader());

  /**
   * Unexpected error.  Details: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_UNEXPECTED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_UNEXPECTED_268",UTIL,SEVERE_ERROR,268, getClassLoader());

  /**
   * Input tries limit reached (%d)
   */
  public static final MessageDescriptor.Arg1<Number> ERR_TRIES_LIMIT_REACHED =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_TRIES_LIMIT_REACHED_269",UTIL,MILD_ERROR,269, getClassLoader());

  /**
   * Directory server administration port number [%d]:
   */
  public static final MessageDescriptor.Arg1<Number> INFO_ADMIN_CONN_PROMPT_PORT_NUMBER =
          new MessageDescriptor.Arg1<Number>(BASE,"INFO_ADMIN_CONN_PROMPT_PORT_NUMBER_270",UTIL,INFORMATION,270, getClassLoader());

  /**
   * Unable to parse LDIF entry %s starting at line %d because it has an invalid binary option for attribute %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,CharSequence> ERR_LDIF_INVALID_ATTR_OPTION =
          new MessageDescriptor.Arg3<CharSequence,Number,CharSequence>(BASE,"MILD_ERR_LDIF_INVALID_ATTR_OPTION_271",UTIL,MILD_ERROR,271, getClassLoader());

  /**
   * Invalid key store path for PKCS11 keystore, it must be %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CERTMGR_INVALID_PKCS11_PATH =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CERTMGR_INVALID_PKCS11_PATH_272",UTIL,SEVERE_ERROR,272, getClassLoader());

  /**
   * Key store path %s exists but is not a file
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CERTMGR_INVALID_KEYSTORE_PATH =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CERTMGR_INVALID_KEYSTORE_PATH_273",UTIL,SEVERE_ERROR,273, getClassLoader());

  /**
   * Parent directory for key store path %s does not exist or is not a directory
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CERTMGR_INVALID_PARENT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CERTMGR_INVALID_PARENT_274",UTIL,SEVERE_ERROR,274, getClassLoader());

  /**
   * Invalid key store type, it must be one of the following: %s, %s, %s or %s
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> ERR_CERTMGR_INVALID_STORETYPE =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_CERTMGR_INVALID_STORETYPE_275",UTIL,SEVERE_ERROR,275, getClassLoader());

  /**
   * Keystore does not exist, it must exist to retrieve an alias, delete an alias or generate a certificate request
   */
  public static final MessageDescriptor.Arg0 ERR_CERTMGR_KEYSTORE_NONEXISTANT =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CERTMGR_KEYSTORE_NONEXISTANT_276",UTIL,SEVERE_ERROR,276, getClassLoader());

  /**
   * Validity value %d is invalid, it must be a positive integer
   */
  public static final MessageDescriptor.Arg1<Number> ERR_CERTMGR_VALIDITY =
          new MessageDescriptor.Arg1<Number>(BASE,"SEVERE_ERR_CERTMGR_VALIDITY_277",UTIL,SEVERE_ERROR,277, getClassLoader());

  /**
   * A certificate with the alias %s already exists in the key store
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CERTMGR_ALIAS_ALREADY_EXISTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CERTMGR_ALIAS_ALREADY_EXISTS_278",UTIL,SEVERE_ERROR,278, getClassLoader());

  /**
   * The following error occured when adding a certificate with alias %s to the keystore: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CERTMGR_ADD_CERT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CERTMGR_ADD_CERT_279",UTIL,SEVERE_ERROR,279, getClassLoader());

  /**
   * The alias %s is cannot be added to the keystore for one of the following reasons: it already exists in the keystore, or, it is not an instance of a trusted certificate class
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CERTMGR_ALIAS_INVALID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CERTMGR_ALIAS_INVALID_280",UTIL,SEVERE_ERROR,280, getClassLoader());

  /**
   * The alias %s is an instance of a private key entry, which is not supported being added to the keystore at this time
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CERTMGR_CERT_REPLIES_INVALID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CERTMGR_CERT_REPLIES_INVALID_281",UTIL,SEVERE_ERROR,281, getClassLoader());

  /**
   * The following error occured when deleting a certificate with alias %s from the keystore: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CERTMGR_DELETE_ALIAS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CERTMGR_DELETE_ALIAS_282",UTIL,SEVERE_ERROR,282, getClassLoader());

  /**
   * The following error occured when generating a certificate request with alias %s: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CERTMGR_CERT_REQUEST =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CERTMGR_CERT_REQUEST_283",UTIL,SEVERE_ERROR,283, getClassLoader());

  /**
   * The following error occured when generating a self-signed certificate using the alias %s: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CERTMGR_GEN_SELF_SIGNED_CERT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CERTMGR_GEN_SELF_SIGNED_CERT_284",UTIL,SEVERE_ERROR,284, getClassLoader());

  /**
   * The certificate file %s is invalid because it does not exists, or exists, but is not a file
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CERTMGR_INVALID_CERT_FILE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CERTMGR_INVALID_CERT_FILE_285",UTIL,SEVERE_ERROR,285, getClassLoader());

  /**
   * The alias %s cannot be deleted from the keystore because it does not exist
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CERTMGR_ALIAS_CAN_NOT_DELETE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CERTMGR_ALIAS_CAN_NOT_DELETE_286",UTIL,SEVERE_ERROR,286, getClassLoader());

  /**
   * The alias %s does not exist in the keystore so its key information cannot be retrieved
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CERTMGR_ALIAS_DOES_NOT_EXIST =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CERTMGR_ALIAS_DOES_NOT_EXIST_287",UTIL,SEVERE_ERROR,287, getClassLoader());

  /**
   * The alias %s is not a valid keystore entry type, so its key information cannot be retrieved
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CERTMGR_ALIAS_INVALID_ENTRY_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CERTMGR_ALIAS_INVALID_ENTRY_TYPE_288",UTIL,SEVERE_ERROR,288, getClassLoader());

  /**
   * The key information for alias %s cannot be retrieved because of the following reason: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CERTMGR_GET_KEY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CERTMGR_GET_KEY_289",UTIL,SEVERE_ERROR,289, getClassLoader());

  /**
   * The private key for alias %s could not be retrieved because it was not a key related entry
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CERTMGR_PRIVATE_KEY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CERTMGR_PRIVATE_KEY_290",UTIL,SEVERE_ERROR,290, getClassLoader());

  /**
   * The alias %s does not does not have a certificate associated with it
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CERTMGR_ALIAS_NO_CERTIFICATE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CERTMGR_ALIAS_NO_CERTIFICATE_291",UTIL,SEVERE_ERROR,291, getClassLoader());

  /**
   * The trusted certificate associated with alias %s could not be added to keystore because of the following reason: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CERTMGR_TRUSTED_CERT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CERTMGR_TRUSTED_CERT_292",UTIL,SEVERE_ERROR,292, getClassLoader());

  /**
   * The %s is invalid because it is null
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CERTMGR_FILE_NAME_INVALID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CERTMGR_FILE_NAME_INVALID_293",UTIL,SEVERE_ERROR,293, getClassLoader());

  /**
   * The argument %s is invalid because it is either null, or has zero length
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CERTMGR_VALUE_INVALID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CERTMGR_VALUE_INVALID_294",UTIL,SEVERE_ERROR,294, getClassLoader());

  /**
   * A security class cannot be found in this JVM because of the following reason: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CERTMGR_CLASS_NOT_FOUND =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CERTMGR_CLASS_NOT_FOUND_295",UTIL,SEVERE_ERROR,295, getClassLoader());

  /**
   * The security classes could not be initialized because of the following reason: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CERTMGR_SECURITY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CERTMGR_SECURITY_296",UTIL,SEVERE_ERROR,296, getClassLoader());

  /**
   * A method needed in the security classes could not be located because of the following reason: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CERTMGR_NO_METHOD =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CERTMGR_NO_METHOD_297",UTIL,SEVERE_ERROR,297, getClassLoader());

  /**
   * Certificate signing request generation is not supported on JVM supplied by this vendor: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CERTMGR_CERT_SIGN_REQ_NOT_SUPPORTED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CERTMGR_CERT_SIGN_REQ_NOT_SUPPORTED_298",UTIL,SEVERE_ERROR,298, getClassLoader());

  /**
   * Default value: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ARGPARSER_USAGE_DEFAULT_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ARGPARSER_USAGE_DEFAULT_VALUE_299",UTIL,INFORMATION,299, getClassLoader());

  /**
   * An error occurred while setting file permissions for the LDIF file %s: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_EXPORT_LDIF_SET_PERMISSION_FAILED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_EXPORT_LDIF_SET_PERMISSION_FAILED_300",UTIL,SEVERE_WARNING,300, getClassLoader());

  /**
   * Skipping entry %s because the following error was received when reading its attributes: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIF_READ_ATTR_SKIP =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_LDIF_READ_ATTR_SKIP_301",UTIL,MILD_ERROR,301, getClassLoader());

  /**
   * Invalid integer number "%s". Please enter a valid integer
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_CONN_BAD_INTEGER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDAP_CONN_BAD_INTEGER_302",UTIL,SEVERE_ERROR,302, getClassLoader());


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
            Class<?> c = Class.forName("org.opends.messages.UtilityMessages");

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
      cl = UtilityMessages.class.getClassLoader();
    }
    return cl;
  }
}
