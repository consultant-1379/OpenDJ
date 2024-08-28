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
public final class SchemaMessages {

  /** Base property for resource bundle containing messages */
  private static final String BASE = "messages/schema";

  private static ClassLoader webstartClassLoader;

  // Prevent instantiation.
  private SchemaMessages() {
    // Do nothing.
  }

  /**
   * Unable to retrieve approximate matching rule %s used as the default for the %s attribute syntax. Approximate matching will not be allowed by default for attributes with this syntax
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ATTR_SYNTAX_UNKNOWN_APPROXIMATE_MATCHING_RULE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_ATTR_SYNTAX_UNKNOWN_APPROXIMATE_MATCHING_RULE_1",SCHEMA,SEVERE_ERROR,1, getClassLoader());

  /**
   * Unable to retrieve equality matching rule %s used as the default for the %s attribute syntax. Equality matching will not be allowed by default for attributes with this syntax
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ATTR_SYNTAX_UNKNOWN_EQUALITY_MATCHING_RULE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_ATTR_SYNTAX_UNKNOWN_EQUALITY_MATCHING_RULE_2",SCHEMA,SEVERE_ERROR,2, getClassLoader());

  /**
   * Unable to retrieve ordering matching rule %s used as the default for the %s attribute syntax. Ordering matches will not be allowed by default for attributes with this syntax
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ATTR_SYNTAX_UNKNOWN_ORDERING_MATCHING_RULE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_ATTR_SYNTAX_UNKNOWN_ORDERING_MATCHING_RULE_3",SCHEMA,SEVERE_ERROR,3, getClassLoader());

  /**
   * Unable to retrieve substring matching rule %s used as the default for the %s attribute syntax. Substring matching will not be allowed by default for attributes with this syntax
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ATTR_SYNTAX_UNKNOWN_SUBSTRING_MATCHING_RULE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_ATTR_SYNTAX_UNKNOWN_SUBSTRING_MATCHING_RULE_4",SCHEMA,SEVERE_ERROR,4, getClassLoader());

  /**
   * The provided value "%s" is not allowed for attributes with a Boolean syntax.  The only allowed values are 'TRUE' and 'FALSE'
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ATTR_SYNTAX_ILLEGAL_BOOLEAN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ATTR_SYNTAX_ILLEGAL_BOOLEAN_5",SCHEMA,SEVERE_WARNING,5, getClassLoader());

  /**
   * The provided value "%s" is too short to be a valid bit string.  A bit string must be a series of binary digits surrounded by single quotes and followed by a capital letter B
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ATTR_SYNTAX_BIT_STRING_TOO_SHORT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ATTR_SYNTAX_BIT_STRING_TOO_SHORT_6",SCHEMA,SEVERE_WARNING,6, getClassLoader());

  /**
   * The provided value "%s" is not a valid bit string because it is not surrounded by single quotes and followed by a capital letter B
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ATTR_SYNTAX_BIT_STRING_NOT_QUOTED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ATTR_SYNTAX_BIT_STRING_NOT_QUOTED_7",SCHEMA,SEVERE_WARNING,7, getClassLoader());

  /**
   * The provided value "%s" is not a valid bit string because '%s' is not a valid binary digit
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_ATTR_SYNTAX_BIT_STRING_INVALID_BIT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_ATTR_SYNTAX_BIT_STRING_INVALID_BIT_8",SCHEMA,SEVERE_WARNING,8, getClassLoader());

  /**
   * The provided value "%s" is not a valid country string because the length is not exactly two characters
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ATTR_SYNTAX_COUNTRY_STRING_INVALID_LENGTH =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_COUNTRY_STRING_INVALID_LENGTH_9",SCHEMA,MILD_ERROR,9, getClassLoader());

  /**
   * The provided value "%s" is not a valid country string because it contains one or more non-printable characters
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ATTR_SYNTAX_COUNTRY_STRING_NOT_PRINTABLE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_COUNTRY_STRING_NOT_PRINTABLE_10",SCHEMA,MILD_ERROR,10, getClassLoader());

  /**
   * The provided value "%s" is not a valid delivery method value because it does not contain any elements
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ATTR_SYNTAX_DELIVERY_METHOD_NO_ELEMENTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_DELIVERY_METHOD_NO_ELEMENTS_11",SCHEMA,MILD_ERROR,11, getClassLoader());

  /**
   * The provided value "%s" is not a valid delivery method value because "%s" is not a valid method
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ATTR_SYNTAX_DELIVERY_METHOD_INVALID_ELEMENT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_DELIVERY_METHOD_INVALID_ELEMENT_12",SCHEMA,MILD_ERROR,12, getClassLoader());

  /**
   * The provided value "%s" is too short to be a valid generalized time value
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ATTR_SYNTAX_GENERALIZED_TIME_TOO_SHORT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ATTR_SYNTAX_GENERALIZED_TIME_TOO_SHORT_13",SCHEMA,SEVERE_WARNING,13, getClassLoader());

  /**
   * The provided value "%s" is not a valid generalized time value because the '%s' character is not allowed in the century or year specification
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_ATTR_SYNTAX_GENERALIZED_TIME_INVALID_YEAR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_ATTR_SYNTAX_GENERALIZED_TIME_INVALID_YEAR_14",SCHEMA,SEVERE_WARNING,14, getClassLoader());

  /**
   * The provided value "%s" is not a valid generalized time value because "%s" is not a valid month specification
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_ATTR_SYNTAX_GENERALIZED_TIME_INVALID_MONTH =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_ATTR_SYNTAX_GENERALIZED_TIME_INVALID_MONTH_15",SCHEMA,SEVERE_WARNING,15, getClassLoader());

  /**
   * The provided value "%s" is not a valid generalized time value because "%s" is not a valid day specification
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_ATTR_SYNTAX_GENERALIZED_TIME_INVALID_DAY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_ATTR_SYNTAX_GENERALIZED_TIME_INVALID_DAY_16",SCHEMA,SEVERE_WARNING,16, getClassLoader());

  /**
   * The provided value "%s" is not a valid generalized time value because "%s" is not a valid hour specification
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_ATTR_SYNTAX_GENERALIZED_TIME_INVALID_HOUR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_ATTR_SYNTAX_GENERALIZED_TIME_INVALID_HOUR_17",SCHEMA,SEVERE_WARNING,17, getClassLoader());

  /**
   * The provided value "%s" is not a valid generalized time value because "%s" is not a valid minute specification
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_ATTR_SYNTAX_GENERALIZED_TIME_INVALID_MINUTE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_ATTR_SYNTAX_GENERALIZED_TIME_INVALID_MINUTE_18",SCHEMA,SEVERE_WARNING,18, getClassLoader());

  /**
   * The provided value "%s" is not a valid generalized time value because "%s" is not a valid second specification
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_ATTR_SYNTAX_GENERALIZED_TIME_INVALID_SECOND =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_ATTR_SYNTAX_GENERALIZED_TIME_INVALID_SECOND_19",SCHEMA,SEVERE_WARNING,19, getClassLoader());

  /**
   * The provided value "%s" is not a valid generalized time value because the sub-second component is not valid (between 1 and 3 numeric digits)
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ATTR_SYNTAX_GENERALIZED_TIME_INVALID_SUBSECOND =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ATTR_SYNTAX_GENERALIZED_TIME_INVALID_SUBSECOND_20",SCHEMA,SEVERE_WARNING,20, getClassLoader());

  /**
   * The provided value "%s" is not a valid generalized time value because the sub-second value may not contain more than three digits
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ATTR_SYNTAX_GENERALIZED_TIME_LONG_SUBSECOND =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ATTR_SYNTAX_GENERALIZED_TIME_LONG_SUBSECOND_21",SCHEMA,SEVERE_WARNING,21, getClassLoader());

  /**
   * The provided value "%s" is not a valid generalized time value because "%s" is not a valid GMT offset
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_ATTR_SYNTAX_GENERALIZED_TIME_INVALID_OFFSET =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_ATTR_SYNTAX_GENERALIZED_TIME_INVALID_OFFSET_22",SCHEMA,SEVERE_WARNING,22, getClassLoader());

  /**
   * The provided value "%s" is not a valid generalized time value because it contains an invalid character '%s' at position %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> WARN_ATTR_SYNTAX_GENERALIZED_TIME_INVALID_CHAR =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"SEVERE_WARN_ATTR_SYNTAX_GENERALIZED_TIME_INVALID_CHAR_23",SCHEMA,SEVERE_WARNING,23, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid generalized time:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_ATTR_SYNTAX_GENERALIZED_TIME_CANNOT_PARSE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_ATTR_SYNTAX_GENERALIZED_TIME_CANNOT_PARSE_24",SCHEMA,SEVERE_WARNING,24, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid distinguished name:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ATTR_SYNTAX_DN_INVALID =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_DN_INVALID_25",SCHEMA,MILD_ERROR,25, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid distinguished name because the last non-space character was a comma or semicolon
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ATTR_SYNTAX_DN_END_WITH_COMMA =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_DN_END_WITH_COMMA_26",SCHEMA,MILD_ERROR,26, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid distinguished name because numeric digit '%s' is not allowed as the first character in an attribute name
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ATTR_SYNTAX_DN_ATTR_START_WITH_DIGIT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_DN_ATTR_START_WITH_DIGIT_27",SCHEMA,MILD_ERROR,27, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid distinguished name because character '%c' at position %d is not allowed in an attribute name
   */
  public static final MessageDescriptor.Arg3<CharSequence,Character,Number> ERR_ATTR_SYNTAX_DN_ATTR_ILLEGAL_CHAR =
          new MessageDescriptor.Arg3<CharSequence,Character,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_DN_ATTR_ILLEGAL_CHAR_28",SCHEMA,MILD_ERROR,28, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid distinguished name because the underscore character is not allowed in an attribute name unless the %s configuration option is enabled
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ATTR_SYNTAX_DN_ATTR_ILLEGAL_UNDERSCORE_CHAR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_DN_ATTR_ILLEGAL_UNDERSCORE_CHAR_29",SCHEMA,MILD_ERROR,29, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid distinguished name because the hyphen character is not allowed as the first character of an attribute name
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ATTR_SYNTAX_DN_ATTR_ILLEGAL_INITIAL_DASH =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_DN_ATTR_ILLEGAL_INITIAL_DASH_30",SCHEMA,MILD_ERROR,30, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid distinguished name because the underscore character is not allowed as the first character of an attribute name even if the %s configuration option is enabled
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ATTR_SYNTAX_DN_ATTR_ILLEGAL_INITIAL_UNDERSCORE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_DN_ATTR_ILLEGAL_INITIAL_UNDERSCORE_31",SCHEMA,MILD_ERROR,31, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid distinguished name because the digit '%c' is not allowed as the first character of an attribute name unless the name is specified as an OID or the %s configuration option is enabled
   */
  public static final MessageDescriptor.Arg3<CharSequence,Character,CharSequence> ERR_ATTR_SYNTAX_DN_ATTR_ILLEGAL_INITIAL_DIGIT =
          new MessageDescriptor.Arg3<CharSequence,Character,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_DN_ATTR_ILLEGAL_INITIAL_DIGIT_32",SCHEMA,MILD_ERROR,32, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid distinguished name because it contained an RDN containing an empty attribute name
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ATTR_SYNTAX_DN_ATTR_NO_NAME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_DN_ATTR_NO_NAME_33",SCHEMA,MILD_ERROR,33, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid distinguished name because the parsed attribute name %s included a period but that name did not appear to be a valid OID
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ATTR_SYNTAX_DN_ATTR_ILLEGAL_PERIOD =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_DN_ATTR_ILLEGAL_PERIOD_34",SCHEMA,MILD_ERROR,34, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid distinguished name because the last non-space character was part of the attribute name '%s'
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ATTR_SYNTAX_DN_END_WITH_ATTR_NAME =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_DN_END_WITH_ATTR_NAME_35",SCHEMA,MILD_ERROR,35, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid distinguished name because the next non-space character after attribute name "%s" should have been an equal sign but instead was '%c'
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Character> ERR_ATTR_SYNTAX_DN_NO_EQUAL =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Character>(BASE,"MILD_ERR_ATTR_SYNTAX_DN_NO_EQUAL_36",SCHEMA,MILD_ERROR,36, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid distinguished name because character '%c' at position %d is not valid
   */
  public static final MessageDescriptor.Arg3<CharSequence,Character,Number> ERR_ATTR_SYNTAX_DN_INVALID_CHAR =
          new MessageDescriptor.Arg3<CharSequence,Character,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_DN_INVALID_CHAR_37",SCHEMA,MILD_ERROR,37, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid distinguished name because an attribute value started with an octothorpe (#) but was not followed by a positive multiple of two hexadecimal digits
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ATTR_SYNTAX_DN_HEX_VALUE_TOO_SHORT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_DN_HEX_VALUE_TOO_SHORT_38",SCHEMA,MILD_ERROR,38, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid distinguished name because an attribute value started with an octothorpe (#) but contained a character %c that was not a valid hexadecimal digit
   */
  public static final MessageDescriptor.Arg2<CharSequence,Character> ERR_ATTR_SYNTAX_DN_INVALID_HEX_DIGIT =
          new MessageDescriptor.Arg2<CharSequence,Character>(BASE,"MILD_ERR_ATTR_SYNTAX_DN_INVALID_HEX_DIGIT_39",SCHEMA,MILD_ERROR,39, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid distinguished name because an unexpected failure occurred while attempting to parse an attribute value from one of the RDN components:  "%s"
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ATTR_SYNTAX_DN_ATTR_VALUE_DECODE_FAILURE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_DN_ATTR_VALUE_DECODE_FAILURE_40",SCHEMA,MILD_ERROR,40, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid distinguished name because one of the RDN components included a quoted value that did not have a corresponding closing quotation mark
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ATTR_SYNTAX_DN_UNMATCHED_QUOTE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_DN_UNMATCHED_QUOTE_41",SCHEMA,MILD_ERROR,41, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid distinguished name because one of the RDN components included a value with an escaped hexadecimal digit that was not followed by a second hexadecimal digit
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ATTR_SYNTAX_DN_ESCAPED_HEX_VALUE_INVALID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_DN_ESCAPED_HEX_VALUE_INVALID_42",SCHEMA,MILD_ERROR,42, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid integer because the first digit may not be zero unless it is the only digit
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ATTR_SYNTAX_INTEGER_INITIAL_ZERO =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ATTR_SYNTAX_INTEGER_INITIAL_ZERO_43",SCHEMA,SEVERE_WARNING,43, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid integer because the dash may only appear if it is the first character of the value followed by one or more digits
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ATTR_SYNTAX_INTEGER_MISPLACED_DASH =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ATTR_SYNTAX_INTEGER_MISPLACED_DASH_44",SCHEMA,SEVERE_WARNING,44, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid integer because character '%c' at position %d is not allowed in an integer value
   */
  public static final MessageDescriptor.Arg3<CharSequence,Character,Number> WARN_ATTR_SYNTAX_INTEGER_INVALID_CHARACTER =
          new MessageDescriptor.Arg3<CharSequence,Character,Number>(BASE,"SEVERE_WARN_ATTR_SYNTAX_INTEGER_INVALID_CHARACTER_45",SCHEMA,SEVERE_WARNING,45, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid integer because it did not contain any digits
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ATTR_SYNTAX_INTEGER_EMPTY_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ATTR_SYNTAX_INTEGER_EMPTY_VALUE_46",SCHEMA,SEVERE_WARNING,46, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid integer because it contained only a dash not followed by an integer value
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ATTR_SYNTAX_INTEGER_DASH_NEEDS_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ATTR_SYNTAX_INTEGER_DASH_NEEDS_VALUE_47",SCHEMA,SEVERE_WARNING,47, getClassLoader());

  /**
   * The provided value could not be parsed as a valid OID because it did not contain any characters
   */
  public static final MessageDescriptor.Arg0 ERR_ATTR_SYNTAX_OID_NO_VALUE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_ATTR_SYNTAX_OID_NO_VALUE_48",SCHEMA,MILD_ERROR,48, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid OID because it had an illegal character at position %d
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_ATTR_SYNTAX_OID_ILLEGAL_CHARACTER =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_OID_ILLEGAL_CHARACTER_49",SCHEMA,MILD_ERROR,49, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid OID because it had two consecutive periods at or near position %d
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_ATTR_SYNTAX_OID_CONSECUTIVE_PERIODS =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_OID_CONSECUTIVE_PERIODS_50",SCHEMA,MILD_ERROR,50, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid OID because it ends with a period
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ATTR_SYNTAX_OID_ENDS_WITH_PERIOD =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_OID_ENDS_WITH_PERIOD_51",SCHEMA,MILD_ERROR,51, getClassLoader());

  /**
   * The provided value could not be parsed as a valid attribute type description because it was empty or contained only whitespace
   */
  public static final MessageDescriptor.Arg0 ERR_ATTR_SYNTAX_ATTRTYPE_EMPTY_VALUE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_ATTR_SYNTAX_ATTRTYPE_EMPTY_VALUE_52",SCHEMA,MILD_ERROR,52, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an attribute type description because an open parenthesis was expected at position %d but instead a '%s' character was found
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,CharSequence> ERR_ATTR_SYNTAX_ATTRTYPE_EXPECTED_OPEN_PARENTHESIS =
          new MessageDescriptor.Arg3<CharSequence,Number,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_ATTRTYPE_EXPECTED_OPEN_PARENTHESIS_53",SCHEMA,MILD_ERROR,53, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an attribute type description because the end of the value was encountered while the Directory Server expected more data to be provided
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ATTR_SYNTAX_ATTRTYPE_TRUNCATED_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_ATTRTYPE_TRUNCATED_VALUE_54",SCHEMA,MILD_ERROR,54, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an attribute type description because the numeric OID contained two consecutive periods at position %d
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_ATTR_SYNTAX_ATTRTYPE_DOUBLE_PERIOD_IN_NUMERIC_OID =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_ATTRTYPE_DOUBLE_PERIOD_IN_NUMERIC_OID_55",SCHEMA,MILD_ERROR,55, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an attribute type description because the numeric OID contained an illegal character %s at position %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> ERR_ATTR_SYNTAX_ATTRTYPE_ILLEGAL_CHAR_IN_NUMERIC_OID =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_ATTRTYPE_ILLEGAL_CHAR_IN_NUMERIC_OID_56",SCHEMA,MILD_ERROR,56, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an attribute type description because the non-numeric OID contained an illegal character %s at position %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> ERR_ATTR_SYNTAX_ATTRTYPE_ILLEGAL_CHAR_IN_STRING_OID =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_ATTRTYPE_ILLEGAL_CHAR_IN_STRING_OID_57",SCHEMA,MILD_ERROR,57, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an attribute type description because it contained an illegal character %s at position %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> ERR_ATTR_SYNTAX_ATTRTYPE_ILLEGAL_CHAR =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_ATTRTYPE_ILLEGAL_CHAR_58",SCHEMA,MILD_ERROR,58, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an attribute type description because it contained an unexpected closing parenthesis at position %d
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_ATTR_SYNTAX_ATTRTYPE_UNEXPECTED_CLOSE_PARENTHESIS =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_ATTRTYPE_UNEXPECTED_CLOSE_PARENTHESIS_59",SCHEMA,MILD_ERROR,59, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an attribute type description because a single quote was expected as the first non-blank character following token %s.  However, the character %s was found instead
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_ATTR_SYNTAX_ATTRTYPE_EXPECTED_QUOTE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_ATTRTYPE_EXPECTED_QUOTE_60",SCHEMA,MILD_ERROR,60, getClassLoader());

  /**
   * The definition for the attribute type with OID %s declared a superior type with an OID of %s. No attribute type with this OID exists in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_ATTR_SYNTAX_ATTRTYPE_UNKNOWN_SUPERIOR_TYPE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_ATTR_SYNTAX_ATTRTYPE_UNKNOWN_SUPERIOR_TYPE_61",SCHEMA,SEVERE_WARNING,61, getClassLoader());

  /**
   * The definition for the attribute type with OID %s declared that approximate matching should be performed using the matching rule "%s".  No such approximate matching rule is configured for use in the Directory Server
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_ATTR_SYNTAX_ATTRTYPE_UNKNOWN_APPROXIMATE_MR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_ATTR_SYNTAX_ATTRTYPE_UNKNOWN_APPROXIMATE_MR_62",SCHEMA,SEVERE_WARNING,62, getClassLoader());

  /**
   * The definition for the attribute type with OID %s declared that equality matching should be performed using the matching rule "%s".  No such equality matching rule is configured for use in the Directory Server
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_ATTR_SYNTAX_ATTRTYPE_UNKNOWN_EQUALITY_MR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_ATTR_SYNTAX_ATTRTYPE_UNKNOWN_EQUALITY_MR_63",SCHEMA,SEVERE_WARNING,63, getClassLoader());

  /**
   * The definition for the attribute type with OID %s declared that ordering matching should be performed using the matching rule "%s".  No such ordering matching rule is configured for use in the Directory Server
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_ATTR_SYNTAX_ATTRTYPE_UNKNOWN_ORDERING_MR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_ATTR_SYNTAX_ATTRTYPE_UNKNOWN_ORDERING_MR_64",SCHEMA,SEVERE_WARNING,64, getClassLoader());

  /**
   * The definition for the attribute type with OID %s declared that substring matching should be performed using the matching rule "%s".  No such substring matching rule is configured for use in the Directory Server
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_ATTR_SYNTAX_ATTRTYPE_UNKNOWN_SUBSTRING_MR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_ATTR_SYNTAX_ATTRTYPE_UNKNOWN_SUBSTRING_MR_65",SCHEMA,SEVERE_WARNING,65, getClassLoader());

  /**
   * The definition for the attribute type with OID %s declared that it should have a syntax with OID %s. No such syntax is configured for use in the Directory Server
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_ATTR_SYNTAX_ATTRTYPE_UNKNOWN_SYNTAX =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_ATTR_SYNTAX_ATTRTYPE_UNKNOWN_SYNTAX_66",SCHEMA,SEVERE_WARNING,66, getClassLoader());

  /**
   * The definition for the attribute type with OID %s declared that it should have an attribute usage of %s.  This is an invalid usage
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_ATTR_SYNTAX_ATTRTYPE_INVALID_ATTRIBUTE_USAGE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_ATTR_SYNTAX_ATTRTYPE_INVALID_ATTRIBUTE_USAGE_67",SCHEMA,SEVERE_WARNING,67, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an attribute type description because a single quote was expected at position %d but the character %s was found instead
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,CharSequence> WARN_ATTR_SYNTAX_ATTRTYPE_EXPECTED_QUOTE_AT_POS =
          new MessageDescriptor.Arg3<CharSequence,Number,CharSequence>(BASE,"SEVERE_WARN_ATTR_SYNTAX_ATTRTYPE_EXPECTED_QUOTE_AT_POS_68",SCHEMA,SEVERE_WARNING,68, getClassLoader());

  /**
   * The provided value could not be parsed as a valid objectclass description because it was empty or contained only whitespace
   */
  public static final MessageDescriptor.Arg0 ERR_ATTR_SYNTAX_OBJECTCLASS_EMPTY_VALUE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_ATTR_SYNTAX_OBJECTCLASS_EMPTY_VALUE_69",SCHEMA,MILD_ERROR,69, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an objectclass description because an open parenthesis was expected at position %d but instead a '%s' character was found
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,CharSequence> ERR_ATTR_SYNTAX_OBJECTCLASS_EXPECTED_OPEN_PARENTHESIS =
          new MessageDescriptor.Arg3<CharSequence,Number,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_OBJECTCLASS_EXPECTED_OPEN_PARENTHESIS_70",SCHEMA,MILD_ERROR,70, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an objectclass description because the end of the value was encountered while the Directory Server expected more data to be provided
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ATTR_SYNTAX_OBJECTCLASS_TRUNCATED_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_OBJECTCLASS_TRUNCATED_VALUE_71",SCHEMA,MILD_ERROR,71, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an objectclass description because the numeric OID contained two consecutive periods at position %d
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_ATTR_SYNTAX_OBJECTCLASS_DOUBLE_PERIOD_IN_NUMERIC_OID =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_OBJECTCLASS_DOUBLE_PERIOD_IN_NUMERIC_OID_72",SCHEMA,MILD_ERROR,72, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an objectclass description because the numeric OID contained an illegal character %s at position %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> ERR_ATTR_SYNTAX_OBJECTCLASS_ILLEGAL_CHAR_IN_NUMERIC_OID =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_OBJECTCLASS_ILLEGAL_CHAR_IN_NUMERIC_OID_73",SCHEMA,MILD_ERROR,73, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an objectclass description because the non-numeric OID contained an illegal character %s at position %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> ERR_ATTR_SYNTAX_OBJECTCLASS_ILLEGAL_CHAR_IN_STRING_OID =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_OBJECTCLASS_ILLEGAL_CHAR_IN_STRING_OID_74",SCHEMA,MILD_ERROR,74, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an objectclass description because it contained an illegal character %s at position %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> ERR_ATTR_SYNTAX_OBJECTCLASS_ILLEGAL_CHAR =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_OBJECTCLASS_ILLEGAL_CHAR_75",SCHEMA,MILD_ERROR,75, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an objectclass description because it contained an unexpected closing parenthesis at position %d
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_ATTR_SYNTAX_OBJECTCLASS_UNEXPECTED_CLOSE_PARENTHESIS =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_OBJECTCLASS_UNEXPECTED_CLOSE_PARENTHESIS_76",SCHEMA,MILD_ERROR,76, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an objectclass description because a single quote was expected as the first non-blank character following token %s.  However, the character %s was found instead
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_ATTR_SYNTAX_OBJECTCLASS_EXPECTED_QUOTE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_OBJECTCLASS_EXPECTED_QUOTE_77",SCHEMA,MILD_ERROR,77, getClassLoader());

  /**
   * The definition for the objectclass with OID %s declared a superior objectclass with an OID of %s.  No objectclass with this OID exists in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_ATTR_SYNTAX_OBJECTCLASS_UNKNOWN_SUPERIOR_CLASS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_ATTR_SYNTAX_OBJECTCLASS_UNKNOWN_SUPERIOR_CLASS_78",SCHEMA,SEVERE_WARNING,78, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an objectclass description because a single quote was expected at position %d but the character %s was found instead
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,CharSequence> WARN_ATTR_SYNTAX_OBJECTCLASS_EXPECTED_QUOTE_AT_POS =
          new MessageDescriptor.Arg3<CharSequence,Number,CharSequence>(BASE,"SEVERE_WARN_ATTR_SYNTAX_OBJECTCLASS_EXPECTED_QUOTE_AT_POS_79",SCHEMA,SEVERE_WARNING,79, getClassLoader());

  /**
   * The definition for the objectclass with OID %s declared that it should include required attribute "%s".  No attribute type matching this name or OID exists in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_ATTR_SYNTAX_OBJECTCLASS_UNKNOWN_REQUIRED_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_ATTR_SYNTAX_OBJECTCLASS_UNKNOWN_REQUIRED_ATTR_80",SCHEMA,SEVERE_WARNING,80, getClassLoader());

  /**
   * The definition for the objectclass with OID %s declared that it should include optional attribute "%s".  No attribute type matching this name or OID exists in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_ATTR_SYNTAX_OBJECTCLASS_UNKNOWN_OPTIONAL_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_ATTR_SYNTAX_OBJECTCLASS_UNKNOWN_OPTIONAL_ATTR_81",SCHEMA,SEVERE_WARNING,81, getClassLoader());

  /**
   * The provided value "%s" cannot be parsed as a valid IA5 string because it contains an illegal character "%s" that is not allowed in the IA5 (ASCII) character set
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_ATTR_SYNTAX_IA5_ILLEGAL_CHARACTER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_ATTR_SYNTAX_IA5_ILLEGAL_CHARACTER_82",SCHEMA,SEVERE_WARNING,82, getClassLoader());

  /**
   * This indicates whether the telephone number attribute syntax should use a strict mode in which it will only accept values in the ITU-T E.123 format.  If this is enabled, then any value not in this format will be rejected.  If this is disabled, then any value will be accepted, but only the digits will be considered when performing matching
   */
  public static final MessageDescriptor.Arg0 INFO_ATTR_SYNTAX_TELEPHONE_DESCRIPTION_STRICT_MODE =
          new MessageDescriptor.Arg0(BASE,"INFO_ATTR_SYNTAX_TELEPHONE_DESCRIPTION_STRICT_MODE_83",SCHEMA,INFORMATION,83, getClassLoader());

  /**
   * An error occurred while trying to retrieve attribute ds-cfg-strict-format from configuration entry %s:  %s.  The Directory Server will not enforce strict compliance to the ITU-T E.123 format for telephone number values
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_ATTR_SYNTAX_TELEPHONE_CANNOT_DETERMINE_STRICT_MODE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_ATTR_SYNTAX_TELEPHONE_CANNOT_DETERMINE_STRICT_MODE_84",SCHEMA,SEVERE_WARNING,84, getClassLoader());

  /**
   * The provided value is not a valid telephone number because it is empty or null
   */
  public static final MessageDescriptor.Arg0 ERR_ATTR_SYNTAX_TELEPHONE_EMPTY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_ATTR_SYNTAX_TELEPHONE_EMPTY_85",SCHEMA,MILD_ERROR,85, getClassLoader());

  /**
   * The provided value "%s" is not a valid telephone number because strict telephone number checking is enabled and the value does not start with a plus sign in compliance with the ITU-T E.123 specification
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ATTR_SYNTAX_TELEPHONE_NO_PLUS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_TELEPHONE_NO_PLUS_86",SCHEMA,MILD_ERROR,86, getClassLoader());

  /**
   * The provided value "%s" is not a valid telephone number because strict telephone number checking is enabled and the character %s at position %d is not allowed by the ITU-T E.123 specification
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> ERR_ATTR_SYNTAX_TELEPHONE_ILLEGAL_CHAR =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_TELEPHONE_ILLEGAL_CHAR_87",SCHEMA,MILD_ERROR,87, getClassLoader());

  /**
   * The provided value "%s" is not a valid telephone number because it does not contain any numeric digits
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ATTR_SYNTAX_TELEPHONE_NO_DIGITS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_TELEPHONE_NO_DIGITS_88",SCHEMA,MILD_ERROR,88, getClassLoader());

  /**
   * The value of configuration attribute ds-cfg-strict-format, which indicates whether to use strict telephone number syntax checking, has been updated to %s in configuration entry %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_ATTR_SYNTAX_TELEPHONE_UPDATED_STRICT_MODE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_ATTR_SYNTAX_TELEPHONE_UPDATED_STRICT_MODE_89",SCHEMA,INFORMATION,89, getClassLoader());

  /**
   * The provided value "%s" is not a valid numeric string because it contained character %s at position %d that was neither a digit nor a space
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> WARN_ATTR_SYNTAX_NUMERIC_STRING_ILLEGAL_CHAR =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"SEVERE_WARN_ATTR_SYNTAX_NUMERIC_STRING_ILLEGAL_CHAR_90",SCHEMA,SEVERE_WARNING,90, getClassLoader());

  /**
   * The provided value is not a valid numeric string because it did not contain any characters.  A numeric string value must contain at least one numeric digit or space
   */
  public static final MessageDescriptor.Arg0 ERR_ATTR_SYNTAX_NUMERIC_STRING_EMPTY_VALUE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_ATTR_SYNTAX_NUMERIC_STRING_EMPTY_VALUE_91",SCHEMA,MILD_ERROR,91, getClassLoader());

  /**
   * The provided value could not be parsed as a valid attribute syntax description because it was empty or contained only whitespace
   */
  public static final MessageDescriptor.Arg0 ERR_ATTR_SYNTAX_ATTRSYNTAX_EMPTY_VALUE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_ATTR_SYNTAX_ATTRSYNTAX_EMPTY_VALUE_92",SCHEMA,MILD_ERROR,92, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an attribute syntax description because an open parenthesis was expected at position %d but instead a '%s' character was found
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,CharSequence> ERR_ATTR_SYNTAX_ATTRSYNTAX_EXPECTED_OPEN_PARENTHESIS =
          new MessageDescriptor.Arg3<CharSequence,Number,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_ATTRSYNTAX_EXPECTED_OPEN_PARENTHESIS_93",SCHEMA,MILD_ERROR,93, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an attribute syntax description because the end of the value was encountered while the Directory Server expected more data to be provided
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ATTR_SYNTAX_ATTRSYNTAX_TRUNCATED_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_ATTRSYNTAX_TRUNCATED_VALUE_94",SCHEMA,MILD_ERROR,94, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an attribute syntax description because the numeric OID contained two consecutive periods at position %d
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_ATTR_SYNTAX_ATTRSYNTAX_DOUBLE_PERIOD_IN_NUMERIC_OID =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_ATTRSYNTAX_DOUBLE_PERIOD_IN_NUMERIC_OID_95",SCHEMA,MILD_ERROR,95, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an attribute syntax description because the numeric OID contained an illegal character %s at position %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> ERR_ATTR_SYNTAX_ATTRSYNTAX_ILLEGAL_CHAR_IN_NUMERIC_OID =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_ATTRSYNTAX_ILLEGAL_CHAR_IN_NUMERIC_OID_96",SCHEMA,MILD_ERROR,96, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an attribute syntax description because the non-numeric OID contained an illegal character %s at position %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> ERR_ATTR_SYNTAX_ATTRSYNTAX_ILLEGAL_CHAR_IN_STRING_OID =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_ATTRSYNTAX_ILLEGAL_CHAR_IN_STRING_OID_97",SCHEMA,MILD_ERROR,97, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an attribute syntax description because it contained an unexpected closing parenthesis at position %d
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_ATTR_SYNTAX_ATTRSYNTAX_UNEXPECTED_CLOSE_PARENTHESIS =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_ATTRSYNTAX_UNEXPECTED_CLOSE_PARENTHESIS_98",SCHEMA,MILD_ERROR,98, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an attribute syntax description because an unexpected error occurred while trying to read the "DESC" token from the string at or near position %d:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,CharSequence> ERR_ATTR_SYNTAX_ATTRSYNTAX_CANNOT_READ_DESC_TOKEN =
          new MessageDescriptor.Arg3<CharSequence,Number,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_ATTRSYNTAX_CANNOT_READ_DESC_TOKEN_99",SCHEMA,MILD_ERROR,99, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an attribute syntax description because the "DESC" token was expected but the string "%s" was found instead
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ATTR_SYNTAX_ATTRSYNTAX_TOKEN_NOT_DESC =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_ATTRSYNTAX_TOKEN_NOT_DESC_100",SCHEMA,MILD_ERROR,100, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an attribute syntax description because an unexpected error occurred while trying to read the value of the "DESC" token from the string at or near position %d:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,CharSequence> ERR_ATTR_SYNTAX_ATTRSYNTAX_CANNOT_READ_DESC_VALUE =
          new MessageDescriptor.Arg3<CharSequence,Number,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_ATTRSYNTAX_CANNOT_READ_DESC_VALUE_101",SCHEMA,MILD_ERROR,101, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an attribute syntax description because a close parenthesis was expected at position %d but instead a '%s' character was found
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,CharSequence> ERR_ATTR_SYNTAX_ATTRSYNTAX_EXPECTED_CLOSE_PARENTHESIS =
          new MessageDescriptor.Arg3<CharSequence,Number,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_ATTRSYNTAX_EXPECTED_CLOSE_PARENTHESIS_102",SCHEMA,MILD_ERROR,102, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an attribute syntax description because an illegal character %s was found at position %d after the close parenthesis
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> ERR_ATTR_SYNTAX_ATTRSYNTAX_ILLEGAL_CHAR_AFTER_CLOSE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_ATTRSYNTAX_ILLEGAL_CHAR_AFTER_CLOSE_103",SCHEMA,MILD_ERROR,103, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an attribute syntax description because a single quote was expected at position %d but the character %s was found instead
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,CharSequence> WARN_ATTR_SYNTAX_ATTRSYNTAX_EXPECTED_QUOTE_AT_POS =
          new MessageDescriptor.Arg3<CharSequence,Number,CharSequence>(BASE,"SEVERE_WARN_ATTR_SYNTAX_ATTRSYNTAX_EXPECTED_QUOTE_AT_POS_104",SCHEMA,SEVERE_WARNING,104, getClassLoader());

  /**
   * The provided value could not be parsed as a printable string because it was null or empty.  A printable string must contain at least one character
   */
  public static final MessageDescriptor.Arg0 WARN_ATTR_SYNTAX_PRINTABLE_STRING_EMPTY_VALUE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_WARN_ATTR_SYNTAX_PRINTABLE_STRING_EMPTY_VALUE_105",SCHEMA,SEVERE_WARNING,105, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a printable string because it contained an invalid character %s at position %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> WARN_ATTR_SYNTAX_PRINTABLE_STRING_ILLEGAL_CHARACTER =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"SEVERE_WARN_ATTR_SYNTAX_PRINTABLE_STRING_ILLEGAL_CHARACTER_106",SCHEMA,SEVERE_WARNING,106, getClassLoader());

  /**
   * The provided value "*" could not be parsed as a substring assertion because it consists only of a wildcard character and zero-length substrings are not allowed
   */
  public static final MessageDescriptor.Arg0 WARN_ATTR_SYNTAX_SUBSTRING_ONLY_WILDCARD =
          new MessageDescriptor.Arg0(BASE,"SEVERE_WARN_ATTR_SYNTAX_SUBSTRING_ONLY_WILDCARD_107",SCHEMA,SEVERE_WARNING,107, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a substring assertion because it contains consecutive wildcard characters at position %d and zero-length substrings are not allowed
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> WARN_ATTR_SYNTAX_SUBSTRING_CONSECUTIVE_WILDCARDS =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"SEVERE_WARN_ATTR_SYNTAX_SUBSTRING_CONSECUTIVE_WILDCARDS_108",SCHEMA,SEVERE_WARNING,108, getClassLoader());

  /**
   * The provided value %s is too short to be a valid UTC time value
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ATTR_SYNTAX_UTC_TIME_TOO_SHORT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_UTC_TIME_TOO_SHORT_109",SCHEMA,MILD_ERROR,109, getClassLoader());

  /**
   * The provided value %s is not a valid UTC time value because the %s character is not allowed in the century or year specification
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ATTR_SYNTAX_UTC_TIME_INVALID_YEAR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_UTC_TIME_INVALID_YEAR_110",SCHEMA,MILD_ERROR,110, getClassLoader());

  /**
   * The provided value %s is not a valid UTC time value because %s is not a valid month specification
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ATTR_SYNTAX_UTC_TIME_INVALID_MONTH =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_UTC_TIME_INVALID_MONTH_111",SCHEMA,MILD_ERROR,111, getClassLoader());

  /**
   * The provided value %s is not a valid UTC time value because %s is not a valid day specification
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ATTR_SYNTAX_UTC_TIME_INVALID_DAY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_UTC_TIME_INVALID_DAY_112",SCHEMA,MILD_ERROR,112, getClassLoader());

  /**
   * The provided value %s is not a valid UTC time value because %s is not a valid hour specification
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ATTR_SYNTAX_UTC_TIME_INVALID_HOUR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_UTC_TIME_INVALID_HOUR_113",SCHEMA,MILD_ERROR,113, getClassLoader());

  /**
   * The provided value %s is not a valid UTC time value because %s is not a valid minute specification
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ATTR_SYNTAX_UTC_TIME_INVALID_MINUTE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_UTC_TIME_INVALID_MINUTE_114",SCHEMA,MILD_ERROR,114, getClassLoader());

  /**
   * The provided value %s is not a valid UTC time value because it contains an invalid character %s at position %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> ERR_ATTR_SYNTAX_UTC_TIME_INVALID_CHAR =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_UTC_TIME_INVALID_CHAR_115",SCHEMA,MILD_ERROR,115, getClassLoader());

  /**
   * The provided value %s is not a valid UTC time value because %s is not a valid second specification
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ATTR_SYNTAX_UTC_TIME_INVALID_SECOND =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_UTC_TIME_INVALID_SECOND_116",SCHEMA,MILD_ERROR,116, getClassLoader());

  /**
   * The provided value %s is not a valid UTC time value because %s is not a valid GMT offset
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ATTR_SYNTAX_UTC_TIME_INVALID_OFFSET =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_UTC_TIME_INVALID_OFFSET_117",SCHEMA,MILD_ERROR,117, getClassLoader());

  /**
   * The provided value %s could not be parsed as a valid UTC time:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ATTR_SYNTAX_UTC_TIME_CANNOT_PARSE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_UTC_TIME_CANNOT_PARSE_118",SCHEMA,MILD_ERROR,118, getClassLoader());

  /**
   * The provided value could not be parsed as a valid DIT content rule description because it was empty or contained only whitespace
   */
  public static final MessageDescriptor.Arg0 ERR_ATTR_SYNTAX_DCR_EMPTY_VALUE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_ATTR_SYNTAX_DCR_EMPTY_VALUE_119",SCHEMA,MILD_ERROR,119, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a DIT content rule description because an open parenthesis was expected at position %d but instead a '%s' character was found
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,CharSequence> ERR_ATTR_SYNTAX_DCR_EXPECTED_OPEN_PARENTHESIS =
          new MessageDescriptor.Arg3<CharSequence,Number,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_DCR_EXPECTED_OPEN_PARENTHESIS_120",SCHEMA,MILD_ERROR,120, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a DIT content rule description because the end of the value was encountered while the Directory Server expected more data to be provided
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ATTR_SYNTAX_DCR_TRUNCATED_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_DCR_TRUNCATED_VALUE_121",SCHEMA,MILD_ERROR,121, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a DIT content rule description because the numeric OID contained two consecutive periods at position %d
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_ATTR_SYNTAX_DCR_DOUBLE_PERIOD_IN_NUMERIC_OID =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_DCR_DOUBLE_PERIOD_IN_NUMERIC_OID_122",SCHEMA,MILD_ERROR,122, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a DIT content rule description because the numeric OID contained an illegal character %s at position %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> ERR_ATTR_SYNTAX_DCR_ILLEGAL_CHAR_IN_NUMERIC_OID =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_DCR_ILLEGAL_CHAR_IN_NUMERIC_OID_123",SCHEMA,MILD_ERROR,123, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a DIT content rule description because the non-numeric OID contained an illegal character %s at position %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> ERR_ATTR_SYNTAX_DCR_ILLEGAL_CHAR_IN_STRING_OID =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_DCR_ILLEGAL_CHAR_IN_STRING_OID_124",SCHEMA,MILD_ERROR,124, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a DIT content rule description because it contained an unexpected closing parenthesis at position %d
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_ATTR_SYNTAX_DCR_UNEXPECTED_CLOSE_PARENTHESIS =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_DCR_UNEXPECTED_CLOSE_PARENTHESIS_125",SCHEMA,MILD_ERROR,125, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a DIT content rule description because it contained an illegal character %s at position %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> ERR_ATTR_SYNTAX_DCR_ILLEGAL_CHAR =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_DCR_ILLEGAL_CHAR_126",SCHEMA,MILD_ERROR,126, getClassLoader());

  /**
   * The DIT content rule "%s" is associated with a structural objectclass %s that is not defined in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ATTR_SYNTAX_DCR_UNKNOWN_STRUCTURAL_CLASS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_DCR_UNKNOWN_STRUCTURAL_CLASS_127",SCHEMA,MILD_ERROR,127, getClassLoader());

  /**
   * The DIT content rule "%s" is associated with the objectclass with OID %s (%s).  This objectclass exists in the server schema but is defined as %s rather than structural
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> ERR_ATTR_SYNTAX_DCR_STRUCTURAL_CLASS_NOT_STRUCTURAL =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_DCR_STRUCTURAL_CLASS_NOT_STRUCTURAL_128",SCHEMA,MILD_ERROR,128, getClassLoader());

  /**
   * The DIT content rule "%s" is associated with an auxiliary objectclass %s that is not defined in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ATTR_SYNTAX_DCR_UNKNOWN_AUXILIARY_CLASS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_DCR_UNKNOWN_AUXILIARY_CLASS_129",SCHEMA,MILD_ERROR,129, getClassLoader());

  /**
   * The DIT content rule "%s" is associated with an auxiliary objectclass %s.  This objectclass exists in the server schema but is defined as %s rather than auxiliary
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_ATTR_SYNTAX_DCR_AUXILIARY_CLASS_NOT_AUXILIARY =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_DCR_AUXILIARY_CLASS_NOT_AUXILIARY_130",SCHEMA,MILD_ERROR,130, getClassLoader());

  /**
   * The DIT content rule "%s" is associated with a required attribute type %s that is not defined in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ATTR_SYNTAX_DCR_UNKNOWN_REQUIRED_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_DCR_UNKNOWN_REQUIRED_ATTR_131",SCHEMA,MILD_ERROR,131, getClassLoader());

  /**
   * The DIT content rule "%s" is associated with an optional attribute type %s that is not defined in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ATTR_SYNTAX_DCR_UNKNOWN_OPTIONAL_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_DCR_UNKNOWN_OPTIONAL_ATTR_132",SCHEMA,MILD_ERROR,132, getClassLoader());

  /**
   * The DIT content rule "%s" is associated with a prohibited attribute type %s that is not defined in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ATTR_SYNTAX_DCR_UNKNOWN_PROHIBITED_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_DCR_UNKNOWN_PROHIBITED_ATTR_133",SCHEMA,MILD_ERROR,133, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a DIT content rule description because a single quote was expected at position %d but the %s character was found instead
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,CharSequence> ERR_ATTR_SYNTAX_DCR_EXPECTED_QUOTE_AT_POS =
          new MessageDescriptor.Arg3<CharSequence,Number,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_DCR_EXPECTED_QUOTE_AT_POS_134",SCHEMA,MILD_ERROR,134, getClassLoader());

  /**
   * The provided value could not be parsed as a valid name form description because it was empty or contained only whitespace
   */
  public static final MessageDescriptor.Arg0 ERR_ATTR_SYNTAX_NAME_FORM_EMPTY_VALUE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_ATTR_SYNTAX_NAME_FORM_EMPTY_VALUE_135",SCHEMA,MILD_ERROR,135, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a name form description because an open parenthesis was expected at position %d but instead a '%c' character was found
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,Character> ERR_ATTR_SYNTAX_NAME_FORM_EXPECTED_OPEN_PARENTHESIS =
          new MessageDescriptor.Arg3<CharSequence,Number,Character>(BASE,"MILD_ERR_ATTR_SYNTAX_NAME_FORM_EXPECTED_OPEN_PARENTHESIS_136",SCHEMA,MILD_ERROR,136, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a name form description because the end of the value was encountered while the Directory Server expected more data to be provided
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ATTR_SYNTAX_NAME_FORM_TRUNCATED_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_NAME_FORM_TRUNCATED_VALUE_137",SCHEMA,MILD_ERROR,137, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a name form description because the numeric OID contained two consecutive periods at position %d
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_ATTR_SYNTAX_NAME_FORM_DOUBLE_PERIOD_IN_NUMERIC_OID =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_NAME_FORM_DOUBLE_PERIOD_IN_NUMERIC_OID_138",SCHEMA,MILD_ERROR,138, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a name form description because the numeric OID contained an illegal character %c at position %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,Character,Number> ERR_ATTR_SYNTAX_NAME_FORM_ILLEGAL_CHAR_IN_NUMERIC_OID =
          new MessageDescriptor.Arg3<CharSequence,Character,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_NAME_FORM_ILLEGAL_CHAR_IN_NUMERIC_OID_139",SCHEMA,MILD_ERROR,139, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a name form description because the non-numeric OID contained an illegal character %c at position %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,Character,Number> ERR_ATTR_SYNTAX_NAME_FORM_ILLEGAL_CHAR_IN_STRING_OID =
          new MessageDescriptor.Arg3<CharSequence,Character,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_NAME_FORM_ILLEGAL_CHAR_IN_STRING_OID_140",SCHEMA,MILD_ERROR,140, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a name form description because it contained an unexpected closing parenthesis at position %d
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_ATTR_SYNTAX_NAME_FORM_UNEXPECTED_CLOSE_PARENTHESIS =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_NAME_FORM_UNEXPECTED_CLOSE_PARENTHESIS_141",SCHEMA,MILD_ERROR,141, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a name form description because it contained an illegal character %c at position %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,Character,Number> ERR_ATTR_SYNTAX_NAME_FORM_ILLEGAL_CHAR =
          new MessageDescriptor.Arg3<CharSequence,Character,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_NAME_FORM_ILLEGAL_CHAR_142",SCHEMA,MILD_ERROR,142, getClassLoader());

  /**
   * The name form description "%s" is associated with a structural objectclass %s that is not defined in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ATTR_SYNTAX_NAME_FORM_UNKNOWN_STRUCTURAL_CLASS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_NAME_FORM_UNKNOWN_STRUCTURAL_CLASS_143",SCHEMA,MILD_ERROR,143, getClassLoader());

  /**
   * The name form description "%s" is associated with the objectclass with OID %s (%s). This objectclass exists in the server schema but is defined as %s rather than structural
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> ERR_ATTR_SYNTAX_NAME_FORM_STRUCTURAL_CLASS_NOT_STRUCTURAL =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_NAME_FORM_STRUCTURAL_CLASS_NOT_STRUCTURAL_144",SCHEMA,MILD_ERROR,144, getClassLoader());

  /**
   * The definition for the name form with OID %s declared that it should include required attribute "%s".  No attribute type matching this name or OID exists in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ATTR_SYNTAX_NAME_FORM_UNKNOWN_REQUIRED_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_NAME_FORM_UNKNOWN_REQUIRED_ATTR_145",SCHEMA,MILD_ERROR,145, getClassLoader());

  /**
   * The definition for the name form with OID %s declared that it should include optional attribute "%s".  No attribute type matching this name or OID exists in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ATTR_SYNTAX_NAME_FORM_UNKNOWN_OPTIONAL_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_NAME_FORM_UNKNOWN_OPTIONAL_ATTR_146",SCHEMA,MILD_ERROR,146, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a name form description because it does not specify the structural objectclass with which it is associated
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ATTR_SYNTAX_NAME_FORM_NO_STRUCTURAL_CLASS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_NAME_FORM_NO_STRUCTURAL_CLASS_147",SCHEMA,MILD_ERROR,147, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a name form description because a single quote was expected at position %d but the %c character was found instead
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,Character> ERR_ATTR_SYNTAX_NAME_FORM_EXPECTED_QUOTE_AT_POS =
          new MessageDescriptor.Arg3<CharSequence,Number,Character>(BASE,"MILD_ERR_ATTR_SYNTAX_NAME_FORM_EXPECTED_QUOTE_AT_POS_148",SCHEMA,MILD_ERROR,148, getClassLoader());

  /**
   * The provided value could not be parsed as a valid matching rule description because it was empty or contained only whitespace
   */
  public static final MessageDescriptor.Arg0 ERR_ATTR_SYNTAX_MR_EMPTY_VALUE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_ATTR_SYNTAX_MR_EMPTY_VALUE_149",SCHEMA,MILD_ERROR,149, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a matching rule description because an open parenthesis was expected at position %d but instead a '%s' character was found
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,CharSequence> ERR_ATTR_SYNTAX_MR_EXPECTED_OPEN_PARENTHESIS =
          new MessageDescriptor.Arg3<CharSequence,Number,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_MR_EXPECTED_OPEN_PARENTHESIS_150",SCHEMA,MILD_ERROR,150, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a matching rule description because the end of the value was encountered while the Directory Server expected more data to be provided
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ATTR_SYNTAX_MR_TRUNCATED_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_MR_TRUNCATED_VALUE_151",SCHEMA,MILD_ERROR,151, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a matching rule description because the numeric OID contained two consecutive periods at position %d
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_ATTR_SYNTAX_MR_DOUBLE_PERIOD_IN_NUMERIC_OID =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_MR_DOUBLE_PERIOD_IN_NUMERIC_OID_152",SCHEMA,MILD_ERROR,152, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a matching rule description because the numeric OID contained an illegal character %s at position %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> ERR_ATTR_SYNTAX_MR_ILLEGAL_CHAR_IN_NUMERIC_OID =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_MR_ILLEGAL_CHAR_IN_NUMERIC_OID_153",SCHEMA,MILD_ERROR,153, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a matching rule description because the non-numeric OID contained an illegal character %s at position %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> ERR_ATTR_SYNTAX_MR_ILLEGAL_CHAR_IN_STRING_OID =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_MR_ILLEGAL_CHAR_IN_STRING_OID_154",SCHEMA,MILD_ERROR,154, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a matching rule description because it contained an unexpected closing parenthesis at position %d
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_ATTR_SYNTAX_MR_UNEXPECTED_CLOSE_PARENTHESIS =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_MR_UNEXPECTED_CLOSE_PARENTHESIS_155",SCHEMA,MILD_ERROR,155, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a matching rule description because it contained an illegal character %s at position %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> ERR_ATTR_SYNTAX_MR_ILLEGAL_CHAR =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_MR_ILLEGAL_CHAR_156",SCHEMA,MILD_ERROR,156, getClassLoader());

  /**
   * The matching rule description "%s" is associated with attribute syntax %s that is not defined in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ATTR_SYNTAX_MR_UNKNOWN_SYNTAX =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_MR_UNKNOWN_SYNTAX_157",SCHEMA,MILD_ERROR,157, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a matching rule description because it does not specify the attribute syntax with which it is associated
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ATTR_SYNTAX_MR_NO_SYNTAX =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_MR_NO_SYNTAX_158",SCHEMA,MILD_ERROR,158, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a matching rule description because a single quote was expected at position %d but the %s character was found instead
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,CharSequence> ERR_ATTR_SYNTAX_MR_EXPECTED_QUOTE_AT_POS =
          new MessageDescriptor.Arg3<CharSequence,Number,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_MR_EXPECTED_QUOTE_AT_POS_159",SCHEMA,MILD_ERROR,159, getClassLoader());

  /**
   * The provided value could not be parsed as a valid matching rule use description because it was empty or contained only whitespace
   */
  public static final MessageDescriptor.Arg0 ERR_ATTR_SYNTAX_MRUSE_EMPTY_VALUE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_ATTR_SYNTAX_MRUSE_EMPTY_VALUE_160",SCHEMA,MILD_ERROR,160, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a matching rule use description because an open parenthesis was expected at position %d but instead a '%s' character was found
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,CharSequence> ERR_ATTR_SYNTAX_MRUSE_EXPECTED_OPEN_PARENTHESIS =
          new MessageDescriptor.Arg3<CharSequence,Number,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_MRUSE_EXPECTED_OPEN_PARENTHESIS_161",SCHEMA,MILD_ERROR,161, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a matching rule use description because the end of the value was encountered while the Directory Server expected more data to be provided
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ATTR_SYNTAX_MRUSE_TRUNCATED_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_MRUSE_TRUNCATED_VALUE_162",SCHEMA,MILD_ERROR,162, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a matching rule use description because the numeric OID contained two consecutive periods at position %d
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_ATTR_SYNTAX_MRUSE_DOUBLE_PERIOD_IN_NUMERIC_OID =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_MRUSE_DOUBLE_PERIOD_IN_NUMERIC_OID_163",SCHEMA,MILD_ERROR,163, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a matching rule use description because the numeric OID contained an illegal character %s at position %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> ERR_ATTR_SYNTAX_MRUSE_ILLEGAL_CHAR_IN_NUMERIC_OID =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_MRUSE_ILLEGAL_CHAR_IN_NUMERIC_OID_164",SCHEMA,MILD_ERROR,164, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a matching rule use description because the non-numeric OID contained an illegal character %s at position %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> ERR_ATTR_SYNTAX_MRUSE_ILLEGAL_CHAR_IN_STRING_OID =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_MRUSE_ILLEGAL_CHAR_IN_STRING_OID_165",SCHEMA,MILD_ERROR,165, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a matching rule use description because the specified matching rule %s is unknown
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ATTR_SYNTAX_MRUSE_UNKNOWN_MATCHING_RULE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_MRUSE_UNKNOWN_MATCHING_RULE_166",SCHEMA,MILD_ERROR,166, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a matching rule use description because it contained an unexpected closing parenthesis at position %d
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_ATTR_SYNTAX_MRUSE_UNEXPECTED_CLOSE_PARENTHESIS =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_MRUSE_UNEXPECTED_CLOSE_PARENTHESIS_167",SCHEMA,MILD_ERROR,167, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a matching rule use description because it contained an illegal character %s at position %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> ERR_ATTR_SYNTAX_MRUSE_ILLEGAL_CHAR =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_MRUSE_ILLEGAL_CHAR_168",SCHEMA,MILD_ERROR,168, getClassLoader());

  /**
   * The matching rule use description "%s" is associated with attribute type %s that is not defined in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ATTR_SYNTAX_MRUSE_UNKNOWN_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_MRUSE_UNKNOWN_ATTR_169",SCHEMA,MILD_ERROR,169, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a matching rule description because it does not specify the set of attribute types that may be used with the associated OID
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ATTR_SYNTAX_MRUSE_NO_ATTR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_MRUSE_NO_ATTR_170",SCHEMA,MILD_ERROR,170, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a matching rule use description because a single quote was expected at position %d but the %s character was found instead
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,CharSequence> ERR_ATTR_SYNTAX_MRUSE_EXPECTED_QUOTE_AT_POS =
          new MessageDescriptor.Arg3<CharSequence,Number,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_MRUSE_EXPECTED_QUOTE_AT_POS_171",SCHEMA,MILD_ERROR,171, getClassLoader());

  /**
   * The provided value could not be parsed as a valid DIT structure rule description because it was empty or contained only whitespace
   */
  public static final MessageDescriptor.Arg0 ERR_ATTR_SYNTAX_DSR_EMPTY_VALUE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_ATTR_SYNTAX_DSR_EMPTY_VALUE_172",SCHEMA,MILD_ERROR,172, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a DIT structure rule description because an open parenthesis was expected at position %d but instead a '%s' character was found
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,CharSequence> ERR_ATTR_SYNTAX_DSR_EXPECTED_OPEN_PARENTHESIS =
          new MessageDescriptor.Arg3<CharSequence,Number,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_DSR_EXPECTED_OPEN_PARENTHESIS_173",SCHEMA,MILD_ERROR,173, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a DIT structure rule description because the end of the value was encountered while the Directory Server expected more data to be provided
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ATTR_SYNTAX_DSR_TRUNCATED_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_DSR_TRUNCATED_VALUE_174",SCHEMA,MILD_ERROR,174, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a DIT structure rule description because the rule ID contained an illegal character %s at position %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> ERR_ATTR_SYNTAX_DSR_ILLEGAL_CHAR_IN_RULE_ID =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_DSR_ILLEGAL_CHAR_IN_RULE_ID_175",SCHEMA,MILD_ERROR,175, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a DIT structure rule description because it contained an unexpected closing parenthesis at position %d
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_ATTR_SYNTAX_DSR_UNEXPECTED_CLOSE_PARENTHESIS =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_DSR_UNEXPECTED_CLOSE_PARENTHESIS_176",SCHEMA,MILD_ERROR,176, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a DIT structure rule description because it contained an illegal character %s at position %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> ERR_ATTR_SYNTAX_DSR_ILLEGAL_CHAR =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_DSR_ILLEGAL_CHAR_177",SCHEMA,MILD_ERROR,177, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a DIT structure rule description because it referenced an unknown name form %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ATTR_SYNTAX_DSR_UNKNOWN_NAME_FORM =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_DSR_UNKNOWN_NAME_FORM_178",SCHEMA,MILD_ERROR,178, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a DIT structure rule description because it referenced an unknown rule ID %d for a superior DIT structure rule
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_ATTR_SYNTAX_DSR_UNKNOWN_RULE_ID =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_DSR_UNKNOWN_RULE_ID_179",SCHEMA,MILD_ERROR,179, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a DIT structure rule description because it did not specify the name form for the rule
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ATTR_SYNTAX_DSR_NO_NAME_FORM =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_DSR_NO_NAME_FORM_180",SCHEMA,MILD_ERROR,180, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a DIT structure rule description because a single quote was expected at position %d but the %s character was found instead
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,CharSequence> ERR_ATTR_SYNTAX_DSR_EXPECTED_QUOTE_AT_POS =
          new MessageDescriptor.Arg3<CharSequence,Number,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_DSR_EXPECTED_QUOTE_AT_POS_181",SCHEMA,MILD_ERROR,181, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a DIT structure rule description because the numeric OID contained two consecutive periods at position %d
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_ATTR_SYNTAX_DSR_DOUBLE_PERIOD_IN_NUMERIC_OID =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_DSR_DOUBLE_PERIOD_IN_NUMERIC_OID_182",SCHEMA,MILD_ERROR,182, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a DIT structure rule description because the numeric OID contained an illegal character %s at position %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> ERR_ATTR_SYNTAX_DSR_ILLEGAL_CHAR_IN_NUMERIC_OID =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_DSR_ILLEGAL_CHAR_IN_NUMERIC_OID_183",SCHEMA,MILD_ERROR,183, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a DIT structure rule description because the non-numeric OID contained an illegal character %s at position %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> ERR_ATTR_SYNTAX_DSR_ILLEGAL_CHAR_IN_STRING_OID =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_DSR_ILLEGAL_CHAR_IN_STRING_OID_184",SCHEMA,MILD_ERROR,184, getClassLoader());

  /**
   * The provided value "%s" is too short to be a valid telex number value
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ATTR_SYNTAX_TELEX_TOO_SHORT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_TELEX_TOO_SHORT_185",SCHEMA,MILD_ERROR,185, getClassLoader());

  /**
   * The provided value "%s" does not hold a valid telex number because a character %s at position %d was not a valid printable string character
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> ERR_ATTR_SYNTAX_TELEX_NOT_PRINTABLE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_TELEX_NOT_PRINTABLE_186",SCHEMA,MILD_ERROR,186, getClassLoader());

  /**
   * The provided value "%s" does not hold a valid telex number because character %s at position %d was neither a valid printable string character nor a dollar sign to separate the telex number components
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> ERR_ATTR_SYNTAX_TELEX_ILLEGAL_CHAR =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_TELEX_ILLEGAL_CHAR_187",SCHEMA,MILD_ERROR,187, getClassLoader());

  /**
   * The provided value "%s" does not hold a valid telex number because the end of the value was found before three dollar-delimited printable strings could be read
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ATTR_SYNTAX_TELEX_TRUNCATED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_TELEX_TRUNCATED_188",SCHEMA,MILD_ERROR,188, getClassLoader());

  /**
   * The provided value could not be parsed as a valid facsimile telephone number because it was empty
   */
  public static final MessageDescriptor.Arg0 ERR_ATTR_SYNTAX_FAXNUMBER_EMPTY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_ATTR_SYNTAX_FAXNUMBER_EMPTY_189",SCHEMA,MILD_ERROR,189, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid facsimile telephone number because character %s at position %d was not a valid printable string character
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> ERR_ATTR_SYNTAX_FAXNUMBER_NOT_PRINTABLE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_FAXNUMBER_NOT_PRINTABLE_190",SCHEMA,MILD_ERROR,190, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid facsimile telephone number because it ends with a dollar sign, but that dollar sign should have been followed by a fax parameter
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ATTR_SYNTAX_FAXNUMBER_END_WITH_DOLLAR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_FAXNUMBER_END_WITH_DOLLAR_191",SCHEMA,MILD_ERROR,191, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid facsimile telephone number because the string "%s" between positions %d and %d was not a valid fax parameter
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,Number,Number> ERR_ATTR_SYNTAX_FAXNUMBER_ILLEGAL_PARAMETER =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,Number,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_FAXNUMBER_ILLEGAL_PARAMETER_192",SCHEMA,MILD_ERROR,192, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid name and optional UID value because an error occurred while trying to parse the DN portion:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ATTR_SYNTAX_NAMEANDUID_INVALID_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_NAMEANDUID_INVALID_DN_193",SCHEMA,MILD_ERROR,193, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid name and optional UID value because the UID portion contained an illegal binary digit %s at position %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> ERR_ATTR_SYNTAX_NAMEANDUID_ILLEGAL_BINARY_DIGIT =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_NAMEANDUID_ILLEGAL_BINARY_DIGIT_194",SCHEMA,MILD_ERROR,194, getClassLoader());

  /**
   * The provided value could not be parsed as a valid teletex terminal identifier because it was empty
   */
  public static final MessageDescriptor.Arg0 ERR_ATTR_SYNTAX_TELETEXID_EMPTY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_ATTR_SYNTAX_TELETEXID_EMPTY_195",SCHEMA,MILD_ERROR,195, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid teletex terminal identifier because character %s at position %d was not a valid printable string character
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> ERR_ATTR_SYNTAX_TELETEXID_NOT_PRINTABLE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_TELETEXID_NOT_PRINTABLE_196",SCHEMA,MILD_ERROR,196, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid teletex terminal identifier because it ends with a dollar sign, but that dollar sign should have been followed by a TTX parameter
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ATTR_SYNTAX_TELETEXID_END_WITH_DOLLAR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_TELETEXID_END_WITH_DOLLAR_197",SCHEMA,MILD_ERROR,197, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid teletex terminal identifier because the parameter string does not contain a colon to separate the name from the value
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ATTR_SYNTAX_TELETEXID_PARAM_NO_COLON =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_TELETEXID_PARAM_NO_COLON_198",SCHEMA,MILD_ERROR,198, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid teletex terminal identifier because the string "%s" is not a valid TTX parameter name
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ATTR_SYNTAX_TELETEXID_ILLEGAL_PARAMETER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_TELETEXID_ILLEGAL_PARAMETER_199",SCHEMA,MILD_ERROR,199, getClassLoader());

  /**
   * The provided value could not be parsed as an other mailbox value because it was empty
   */
  public static final MessageDescriptor.Arg0 ERR_ATTR_SYNTAX_OTHER_MAILBOX_EMPTY_VALUE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_ATTR_SYNTAX_OTHER_MAILBOX_EMPTY_VALUE_200",SCHEMA,MILD_ERROR,200, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an other mailbox value because there was no mailbox type before the dollar sign
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ATTR_SYNTAX_OTHER_MAILBOX_NO_MBTYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_OTHER_MAILBOX_NO_MBTYPE_201",SCHEMA,MILD_ERROR,201, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an other mailbox value because the mailbox type contained an illegal character %s at position %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> ERR_ATTR_SYNTAX_OTHER_MAILBOX_ILLEGAL_MBTYPE_CHAR =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_OTHER_MAILBOX_ILLEGAL_MBTYPE_CHAR_202",SCHEMA,MILD_ERROR,202, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an other mailbox value because there was no mailbox after the dollar sign
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ATTR_SYNTAX_OTHER_MAILBOX_NO_MAILBOX =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_OTHER_MAILBOX_NO_MAILBOX_203",SCHEMA,MILD_ERROR,203, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an other mailbox value because the mailbox contained an illegal character %s at position %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> ERR_ATTR_SYNTAX_OTHER_MAILBOX_ILLEGAL_MB_CHAR =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_OTHER_MAILBOX_ILLEGAL_MB_CHAR_204",SCHEMA,MILD_ERROR,204, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a guide value because it did not contain an objectclass name or OID before the octothorpe (#) character
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ATTR_SYNTAX_GUIDE_NO_OC =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_GUIDE_NO_OC_205",SCHEMA,MILD_ERROR,205, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a guide value because the criteria portion %s contained an illegal character %c at position %d
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,Character,Number> ERR_ATTR_SYNTAX_GUIDE_ILLEGAL_CHAR =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,Character,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_GUIDE_ILLEGAL_CHAR_206",SCHEMA,MILD_ERROR,206, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a guide value because the criteria portion %s did not contain a close parenthesis that corresponded to the initial open parenthesis
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ATTR_SYNTAX_GUIDE_MISSING_CLOSE_PAREN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_GUIDE_MISSING_CLOSE_PAREN_207",SCHEMA,MILD_ERROR,207, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a guide value because the criteria portion %s started with a question mark but was not followed by the string "true" or "false"
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ATTR_SYNTAX_GUIDE_INVALID_QUESTION_MARK =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_GUIDE_INVALID_QUESTION_MARK_208",SCHEMA,MILD_ERROR,208, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a guide value because the criteria portion %s did not contain a dollar sign to separate the attribute type from the match type
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ATTR_SYNTAX_GUIDE_NO_DOLLAR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_GUIDE_NO_DOLLAR_209",SCHEMA,MILD_ERROR,209, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a guide value because the criteria portion %s did not specify an attribute type before the dollar sign
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ATTR_SYNTAX_GUIDE_NO_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_GUIDE_NO_ATTR_210",SCHEMA,MILD_ERROR,210, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a guide value because the criteria portion %s did not specify a match type after the dollar sign
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ATTR_SYNTAX_GUIDE_NO_MATCH_TYPE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_GUIDE_NO_MATCH_TYPE_211",SCHEMA,MILD_ERROR,211, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a guide value because the criteria portion %s had an invalid match type starting at position %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> ERR_ATTR_SYNTAX_GUIDE_INVALID_MATCH_TYPE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_GUIDE_INVALID_MATCH_TYPE_212",SCHEMA,MILD_ERROR,212, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an enhanced guide value because it did not contain an octothorpe (#) character to separate the objectclass from the criteria
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ATTR_SYNTAX_ENHANCEDGUIDE_NO_SHARP =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_ENHANCEDGUIDE_NO_SHARP_213",SCHEMA,MILD_ERROR,213, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an enhanced guide value because it did not contain an objectclass name or OID before the octothorpe (#) character
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ATTR_SYNTAX_ENHANCEDGUIDE_NO_OC =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_ENHANCEDGUIDE_NO_OC_214",SCHEMA,MILD_ERROR,214, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an enhanced guide value because the numeric OID %s specifying the objectclass contained two consecutive periods at position %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> ERR_ATTR_SYNTAX_ENHANCEDGUIDE_DOUBLE_PERIOD_IN_OC_OID =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_ENHANCEDGUIDE_DOUBLE_PERIOD_IN_OC_OID_215",SCHEMA,MILD_ERROR,215, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an enhanced guide value because the numeric OID %s specifying the objectclass contained an illegal character %s at position %d
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,Number> ERR_ATTR_SYNTAX_ENHANCEDGUIDE_ILLEGAL_CHAR_IN_OC_OID =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_ENHANCEDGUIDE_ILLEGAL_CHAR_IN_OC_OID_216",SCHEMA,MILD_ERROR,216, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an enhanced guide value because the objectclass name %s contained an illegal character %s at position %d
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,Number> ERR_ATTR_SYNTAX_ENHANCEDGUIDE_ILLEGAL_CHAR_IN_OC_NAME =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_ENHANCEDGUIDE_ILLEGAL_CHAR_IN_OC_NAME_217",SCHEMA,MILD_ERROR,217, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an enhanced guide value because it did not have an octothorpe (#) character to separate the criteria from the scope
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ATTR_SYNTAX_ENHANCEDGUIDE_NO_FINAL_SHARP =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_ENHANCEDGUIDE_NO_FINAL_SHARP_218",SCHEMA,MILD_ERROR,218, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an enhanced guide value because no scope was provided after the final octothorpe (#) character
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ATTR_SYNTAX_ENHANCEDGUIDE_NO_SCOPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_ENHANCEDGUIDE_NO_SCOPE_219",SCHEMA,MILD_ERROR,219, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an enhanced guide value because the specified scope %s was invalid
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ATTR_SYNTAX_ENHANCEDGUIDE_INVALID_SCOPE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_ENHANCEDGUIDE_INVALID_SCOPE_220",SCHEMA,MILD_ERROR,220, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an enhanced guide value because it did not specify any criteria between the octothorpe (#) characters
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ATTR_SYNTAX_ENHANCEDGUIDE_NO_CRITERIA =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_ENHANCEDGUIDE_NO_CRITERIA_221",SCHEMA,MILD_ERROR,221, getClassLoader());

  /**
   * The provided value %s could not be parsed as a valid OID:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ATTR_SYNTAX_OID_INVALID_VALUE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_OID_INVALID_VALUE_222",SCHEMA,MILD_ERROR,222, getClassLoader());

  /**
   * An unexpected error occurred while trying to normalize value %s as a generalized time value:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_ATTR_SYNTAX_GENERALIZED_TIME_NORMALIZE_FAILURE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_ATTR_SYNTAX_GENERALIZED_TIME_NORMALIZE_FAILURE_223",SCHEMA,SEVERE_WARNING,223, getClassLoader());

  /**
   * An error occurred while attempting to compare two AttributeValue objects using the caseExactOrderingMatch matching rule because the normalized form of one of those values could not be retrieved:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_OMR_CASE_EXACT_COMPARE_CANNOT_NORMALIZE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_OMR_CASE_EXACT_COMPARE_CANNOT_NORMALIZE_224",SCHEMA,SEVERE_WARNING,224, getClassLoader());

  /**
   * An error occurred while attempting to compare two objects using the caseExactOrderingMatch matching rule because the objects were of an unsupported type %s.  Only byte arrays, ASN.1 octet strings, and attribute value objects may be compared
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_OMR_CASE_EXACT_COMPARE_INVALID_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_OMR_CASE_EXACT_COMPARE_INVALID_TYPE_225",SCHEMA,SEVERE_WARNING,225, getClassLoader());

  /**
   * An error occurred while attempting to compare two AttributeValue objects using the caseIgnoreOrderingMatch matching rule because the normalized form of one of those values could not be retrieved:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_OMR_CASE_IGNORE_COMPARE_CANNOT_NORMALIZE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_OMR_CASE_IGNORE_COMPARE_CANNOT_NORMALIZE_226",SCHEMA,SEVERE_WARNING,226, getClassLoader());

  /**
   * An error occurred while attempting to compare two objects using the caseIgnoreOrderingMatch matching rule because the objects were of an unsupported type %s.  Only byte arrays, ASN.1 octet strings, and attribute value objects may be compared
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_OMR_CASE_IGNORE_COMPARE_INVALID_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_OMR_CASE_IGNORE_COMPARE_INVALID_TYPE_227",SCHEMA,SEVERE_WARNING,227, getClassLoader());

  /**
   * An error occurred while attempting to compare two AttributeValue objects using the generalizedTimeOrderingMatch matching rule because the normalized form of one of those values could not be retrieved:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_OMR_GENERALIZED_TIME_COMPARE_CANNOT_NORMALIZE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_OMR_GENERALIZED_TIME_COMPARE_CANNOT_NORMALIZE_228",SCHEMA,SEVERE_WARNING,228, getClassLoader());

  /**
   * An error occurred while attempting to compare two objects using the generalizedTimeOrderingMatch matching rule because the objects were of an unsupported type %s.  Only byte arrays, ASN.1 octet strings, and attribute value objects may be compared
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_OMR_GENERALIZED_TIME_COMPARE_INVALID_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_OMR_GENERALIZED_TIME_COMPARE_INVALID_TYPE_229",SCHEMA,SEVERE_WARNING,229, getClassLoader());

  /**
   * An error occurred while attempting to compare two AttributeValue objects using the integerOrderingMatch matching rule because the normalized form of one of those values could not be retrieved:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_OMR_INTEGER_COMPARE_CANNOT_NORMALIZE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_OMR_INTEGER_COMPARE_CANNOT_NORMALIZE_230",SCHEMA,SEVERE_WARNING,230, getClassLoader());

  /**
   * An error occurred while attempting to compare two objects using the integerOrderingMatch matching rule because the objects were of an unsupported type %s.  Only byte arrays, ASN.1 octet strings, and attribute value objects may be compared
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_OMR_INTEGER_COMPARE_INVALID_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_OMR_INTEGER_COMPARE_INVALID_TYPE_231",SCHEMA,SEVERE_WARNING,231, getClassLoader());

  /**
   * An error occurred while attempting to compare two AttributeValue objects using the numericStringOrderingMatch matching rule because the normalized form of one of those values could not be retrieved:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_OMR_NUMERIC_STRING_COMPARE_CANNOT_NORMALIZE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_OMR_NUMERIC_STRING_COMPARE_CANNOT_NORMALIZE_232",SCHEMA,SEVERE_WARNING,232, getClassLoader());

  /**
   * An error occurred while attempting to compare two objects using the numericStringOrderingMatch matching rule because the objects were of an unsupported type %s.  Only byte arrays, ASN.1 octet strings, and attribute value objects may be compared
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_OMR_NUMERIC_STRING_COMPARE_INVALID_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_OMR_NUMERIC_STRING_COMPARE_INVALID_TYPE_233",SCHEMA,SEVERE_WARNING,233, getClassLoader());

  /**
   * An error occurred while attempting to compare two AttributeValue objects using the octetStringOrderingMatch matching rule because the normalized form of one of those values could not be retrieved:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_OMR_OCTET_STRING_COMPARE_CANNOT_NORMALIZE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_OMR_OCTET_STRING_COMPARE_CANNOT_NORMALIZE_234",SCHEMA,SEVERE_WARNING,234, getClassLoader());

  /**
   * An error occurred while attempting to compare two objects using the octetStringOrderingMatch matching rule because the objects were of an unsupported type %s.  Only byte arrays, ASN.1 octet strings, and attribute value objects may be compared
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_OMR_OCTET_STRING_COMPARE_INVALID_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_OMR_OCTET_STRING_COMPARE_INVALID_TYPE_235",SCHEMA,SEVERE_WARNING,235, getClassLoader());

  /**
   * The provided value "%s" has an invalid length for a UUID.  All UUID values must have a length of exactly 36 bytes, but the provided value had a length of %d bytes
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> WARN_ATTR_SYNTAX_UUID_INVALID_LENGTH =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"SEVERE_WARN_ATTR_SYNTAX_UUID_INVALID_LENGTH_236",SCHEMA,SEVERE_WARNING,236, getClassLoader());

  /**
   * The provided value "%s" should have had a dash at position %d, but the character '%s' was found instead
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,CharSequence> WARN_ATTR_SYNTAX_UUID_EXPECTED_DASH =
          new MessageDescriptor.Arg3<CharSequence,Number,CharSequence>(BASE,"SEVERE_WARN_ATTR_SYNTAX_UUID_EXPECTED_DASH_237",SCHEMA,SEVERE_WARNING,237, getClassLoader());

  /**
   * The provided value "%s" should have had a hexadecimal digit at position %d, but the character '%s' was found instead
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,CharSequence> WARN_ATTR_SYNTAX_UUID_EXPECTED_HEX =
          new MessageDescriptor.Arg3<CharSequence,Number,CharSequence>(BASE,"SEVERE_WARN_ATTR_SYNTAX_UUID_EXPECTED_HEX_238",SCHEMA,SEVERE_WARNING,238, getClassLoader());

  /**
   * Indicates whether attributes with the directory string syntax will be allowed to have zero-length values.  This is technically not allowed by the LDAP specifications, but it may be useful for backward compatibility with previous Directory Server releases
   */
  public static final MessageDescriptor.Arg0 INFO_ATTR_SYNTAX_DIRECTORYSTRING_DESCRIPTION_ALLOW_ZEROLENGTH =
          new MessageDescriptor.Arg0(BASE,"INFO_ATTR_SYNTAX_DIRECTORYSTRING_DESCRIPTION_ALLOW_ZEROLENGTH_239",SCHEMA,INFORMATION,239, getClassLoader());

  /**
   * An error occurred while trying to determine the value of the %s configuration attribute, which indicates whether directory string attributes should be allowed to have zero-length values:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ATTR_SYNTAX_DIRECTORYSTRING_CANNOT_DETERMINE_ZEROLENGTH =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_ATTR_SYNTAX_DIRECTORYSTRING_CANNOT_DETERMINE_ZEROLENGTH_240",SCHEMA,SEVERE_ERROR,240, getClassLoader());

  /**
   * The operation attempted to assign a zero-length value to an attribute with the directory string syntax
   */
  public static final MessageDescriptor.Arg0 ERR_ATTR_SYNTAX_DIRECTORYSTRING_INVALID_ZEROLENGTH_VALUE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_ATTR_SYNTAX_DIRECTORYSTRING_INVALID_ZEROLENGTH_VALUE_241",SCHEMA,SEVERE_ERROR,241, getClassLoader());

  /**
   * The %s attribute in configuration entry %s has been updated with a new value of %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> INFO_ATTR_SYNTAX_DIRECTORYSTRING_UPDATED_ALLOW_ZEROLENGTH =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"INFO_ATTR_SYNTAX_DIRECTORYSTRING_UPDATED_ALLOW_ZEROLENGTH_242",SCHEMA,INFORMATION,242, getClassLoader());

  /**
   * The provided authPassword value had an invalid scheme character at position %d
   */
  public static final MessageDescriptor.Arg1<Number> ERR_ATTR_SYNTAX_AUTHPW_INVALID_SCHEME_CHAR =
          new MessageDescriptor.Arg1<Number>(BASE,"SEVERE_ERR_ATTR_SYNTAX_AUTHPW_INVALID_SCHEME_CHAR_243",SCHEMA,SEVERE_ERROR,243, getClassLoader());

  /**
   * The provided authPassword value had a zero-length scheme element
   */
  public static final MessageDescriptor.Arg0 ERR_ATTR_SYNTAX_AUTHPW_NO_SCHEME =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_ATTR_SYNTAX_AUTHPW_NO_SCHEME_244",SCHEMA,SEVERE_ERROR,244, getClassLoader());

  /**
   * The provided authPassword value was missing the separator character or had an illegal character between the scheme and authInfo elements
   */
  public static final MessageDescriptor.Arg0 ERR_ATTR_SYNTAX_AUTHPW_NO_SCHEME_SEPARATOR =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_ATTR_SYNTAX_AUTHPW_NO_SCHEME_SEPARATOR_245",SCHEMA,SEVERE_ERROR,245, getClassLoader());

  /**
   * The provided authPassword value had an invalid authInfo character at position %d
   */
  public static final MessageDescriptor.Arg1<Number> ERR_ATTR_SYNTAX_AUTHPW_INVALID_AUTH_INFO_CHAR =
          new MessageDescriptor.Arg1<Number>(BASE,"SEVERE_ERR_ATTR_SYNTAX_AUTHPW_INVALID_AUTH_INFO_CHAR_246",SCHEMA,SEVERE_ERROR,246, getClassLoader());

  /**
   * The provided authPassword value had a zero-length authInfo element
   */
  public static final MessageDescriptor.Arg0 ERR_ATTR_SYNTAX_AUTHPW_NO_AUTH_INFO =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_ATTR_SYNTAX_AUTHPW_NO_AUTH_INFO_247",SCHEMA,SEVERE_ERROR,247, getClassLoader());

  /**
   * The provided authPassword value was missing the separator character or had an illegal character between the authInfo and authValue elements
   */
  public static final MessageDescriptor.Arg0 ERR_ATTR_SYNTAX_AUTHPW_NO_AUTH_INFO_SEPARATOR =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_ATTR_SYNTAX_AUTHPW_NO_AUTH_INFO_SEPARATOR_248",SCHEMA,SEVERE_ERROR,248, getClassLoader());

  /**
   * The provided value "%s" could not be parsed by the integer first component matching rule because it did not start with a parenthesis
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_EMR_INTFIRSTCOMP_NO_INITIAL_PARENTHESIS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_EMR_INTFIRSTCOMP_NO_INITIAL_PARENTHESIS_249",SCHEMA,SEVERE_ERROR,249, getClassLoader());

  /**
   * The provided value "%s" could not be parsed by the integer first component matching rule because it did not have any non-space characters after the opening parenthesis
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_EMR_INTFIRSTCOMP_NO_NONSPACE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_EMR_INTFIRSTCOMP_NO_NONSPACE_250",SCHEMA,SEVERE_ERROR,250, getClassLoader());

  /**
   * The provided value "%s" could not be parsed by the integer first component matching rule because it did not have any space characters after the first component
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_EMR_INTFIRSTCOMP_NO_SPACE_AFTER_INT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_EMR_INTFIRSTCOMP_NO_SPACE_AFTER_INT_251",SCHEMA,SEVERE_ERROR,251, getClassLoader());

  /**
   * The provided value "%s" could not be parsed by the integer first component matching rule because the first component does not appear to be an integer value
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_EMR_INTFIRSTCOMP_FIRST_COMPONENT_NOT_INT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_EMR_INTFIRSTCOMP_FIRST_COMPONENT_NOT_INT_252",SCHEMA,SEVERE_ERROR,252, getClassLoader());

  /**
   * No value was given to decode by the user password attribute syntax
   */
  public static final MessageDescriptor.Arg0 ERR_ATTR_SYNTAX_USERPW_NO_VALUE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_ATTR_SYNTAX_USERPW_NO_VALUE_253",SCHEMA,SEVERE_ERROR,253, getClassLoader());

  /**
   * Unable to decode the provided value according to the user password syntax because the value does not start with the opening curly brace ("{") character
   */
  public static final MessageDescriptor.Arg0 ERR_ATTR_SYNTAX_USERPW_NO_OPENING_BRACE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_ATTR_SYNTAX_USERPW_NO_OPENING_BRACE_254",SCHEMA,SEVERE_ERROR,254, getClassLoader());

  /**
   * Unable to decode the provided value according to the user password syntax because the value does not contain a closing curly brace ("}") character
   */
  public static final MessageDescriptor.Arg0 ERR_ATTR_SYNTAX_USERPW_NO_CLOSING_BRACE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_ATTR_SYNTAX_USERPW_NO_CLOSING_BRACE_255",SCHEMA,SEVERE_ERROR,255, getClassLoader());

  /**
   * Unable to decode the provided value according to the user password syntax because the value does not contain a storage scheme name
   */
  public static final MessageDescriptor.Arg0 ERR_ATTR_SYNTAX_USERPW_NO_SCHEME =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_ATTR_SYNTAX_USERPW_NO_SCHEME_256",SCHEMA,SEVERE_ERROR,256, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid RFC 3672 subtree specification
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ATTR_SYNTAX_RFC3672_SUBTREE_SPECIFICATION_INVALID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_RFC3672_SUBTREE_SPECIFICATION_INVALID_257",SCHEMA,MILD_ERROR,257, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid absolute subtree specification
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ATTR_SYNTAX_ABSOLUTE_SUBTREE_SPECIFICATION_INVALID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_ABSOLUTE_SUBTREE_SPECIFICATION_INVALID_258",SCHEMA,MILD_ERROR,258, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid relative subtree specification
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ATTR_SYNTAX_RELATIVE_SUBTREE_SPECIFICATION_INVALID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_RELATIVE_SUBTREE_SPECIFICATION_INVALID_259",SCHEMA,MILD_ERROR,259, getClassLoader());

  /**
   * The provided value %s is not allowed for attributes with a Integer syntax
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ATTR_SYNTAX_ILLEGAL_INTEGER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ATTR_SYNTAX_ILLEGAL_INTEGER_260",SCHEMA,SEVERE_WARNING,260, getClassLoader());

  /**
   * The provided authPassword value had an invalid authValue character at position %d
   */
  public static final MessageDescriptor.Arg1<Number> ERR_ATTR_SYNTAX_AUTHPW_INVALID_AUTH_VALUE_CHAR =
          new MessageDescriptor.Arg1<Number>(BASE,"SEVERE_ERR_ATTR_SYNTAX_AUTHPW_INVALID_AUTH_VALUE_CHAR_261",SCHEMA,SEVERE_ERROR,261, getClassLoader());

  /**
   * The provided authPassword value had a zero-length authValue element
   */
  public static final MessageDescriptor.Arg0 ERR_ATTR_SYNTAX_AUTHPW_NO_AUTH_VALUE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_ATTR_SYNTAX_AUTHPW_NO_AUTH_VALUE_262",SCHEMA,SEVERE_ERROR,262, getClassLoader());

  /**
   * The provided authPassword value had an invalid trailing character at position %d
   */
  public static final MessageDescriptor.Arg1<Number> ERR_ATTR_SYNTAX_AUTHPW_INVALID_TRAILING_CHAR =
          new MessageDescriptor.Arg1<Number>(BASE,"SEVERE_ERR_ATTR_SYNTAX_AUTHPW_INVALID_TRAILING_CHAR_263",SCHEMA,SEVERE_ERROR,263, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an attribute syntax extension because an invalid character was found at position %d
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_ATTR_SYNTAX_ATTRSYNTAX_EXTENSION_INVALID_CHARACTER =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_ATTRSYNTAX_EXTENSION_INVALID_CHARACTER_264",SCHEMA,MILD_ERROR,264, getClassLoader());

  /**
   * The attribute syntax could not be parsed because of an invalid extension.%s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ATTR_SYNTAX_ATTRSYNTAX_INVALID_EXTENSION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_ATTRSYNTAX_INVALID_EXTENSION_265",SCHEMA,MILD_ERROR,265, getClassLoader());

  /**
   * The definition for objectclass %s is invalid because it has an objectclass type of %s but this is incompatible with the objectclass type %s for the superior class %s
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> WARN_ATTR_SYNTAX_OBJECTCLASS_INVALID_SUPERIOR_TYPE =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_WARN_ATTR_SYNTAX_OBJECTCLASS_INVALID_SUPERIOR_TYPE_266",SCHEMA,SEVERE_WARNING,266, getClassLoader());

  /**
   * The definition for objectclass %s is invalid because it is defined as a structural class but its superior chain does not include the "top" objectclass
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ATTR_SYNTAX_OBJECTCLASS_STRUCTURAL_SUPERIOR_NOT_TOP =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ATTR_SYNTAX_OBJECTCLASS_STRUCTURAL_SUPERIOR_NOT_TOP_267",SCHEMA,SEVERE_WARNING,267, getClassLoader());

  /**
   * The definition for attribute type %s is invalid because its attribute usage %s is not the same as the usage for its superior type %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> WARN_ATTR_SYNTAX_ATTRTYPE_INVALID_SUPERIOR_USAGE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_WARN_ATTR_SYNTAX_ATTRTYPE_INVALID_SUPERIOR_USAGE_268",SCHEMA,SEVERE_WARNING,268, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid subtree specification
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ATTR_SYNTAX_SUBTREE_SPECIFICATION_INVALID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_SUBTREE_SPECIFICATION_INVALID_269",SCHEMA,MILD_ERROR,269, getClassLoader());

  /**
   * The definition for attribute type %s is invalid because it is not defined as a collective type but the superior type %s is collective
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_ATTR_SYNTAX_ATTRTYPE_NONCOLLECTIVE_FROM_COLLECTIVE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_ATTR_SYNTAX_ATTRTYPE_NONCOLLECTIVE_FROM_COLLECTIVE_270",SCHEMA,SEVERE_WARNING,270, getClassLoader());

  /**
   * The DIT content rule "%s" is not valid because it prohibits the use of attribute type %s which is required by the associated structural object class %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_ATTR_SYNTAX_DCR_PROHIBITED_REQUIRED_BY_STRUCTURAL =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_DCR_PROHIBITED_REQUIRED_BY_STRUCTURAL_271",SCHEMA,MILD_ERROR,271, getClassLoader());

  /**
   * The DIT content rule "%s" is not valid because it prohibits the use of attribute type %s which is required by the associated auxiliary object class %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_ATTR_SYNTAX_DCR_PROHIBITED_REQUIRED_BY_AUXILIARY =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_DCR_PROHIBITED_REQUIRED_BY_AUXILIARY_272",SCHEMA,MILD_ERROR,272, getClassLoader());

  /**
   * The definition for attribute type %s is invalid because it is declared NO-USER-MODIFICATION but does not have an operational usage
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ATTR_SYNTAX_ATTRTYPE_NO_USER_MOD_NOT_OPERATIONAL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ATTR_SYNTAX_ATTRTYPE_NO_USER_MOD_NOT_OPERATIONAL_274",SCHEMA,SEVERE_WARNING,274, getClassLoader());

  /**
   * The provided value %s is not a valid generalized time value because it contains illegal character %s in the fraction component
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_ATTR_SYNTAX_GENERALIZED_TIME_ILLEGAL_FRACTION_CHAR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_ATTR_SYNTAX_GENERALIZED_TIME_ILLEGAL_FRACTION_CHAR_275",SCHEMA,SEVERE_WARNING,275, getClassLoader());

  /**
   * The provided value %s is not a valid generalized time value because it does not contain at least one digit after the period to use as the fractional component
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ATTR_SYNTAX_GENERALIZED_TIME_EMPTY_FRACTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ATTR_SYNTAX_GENERALIZED_TIME_EMPTY_FRACTION_276",SCHEMA,SEVERE_WARNING,276, getClassLoader());

  /**
   * The provided value %s is not a valid generalized time value because it does not end with 'Z' or a time zone offset
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ATTR_SYNTAX_GENERALIZED_TIME_NO_TIME_ZONE_INFO =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ATTR_SYNTAX_GENERALIZED_TIME_NO_TIME_ZONE_INFO_277",SCHEMA,SEVERE_WARNING,277, getClassLoader());

  /**
   * The provided value %s is not a valid generalized time value because it represents an invalid time (e.g., a date that does not exist):  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_ATTR_SYNTAX_GENERALIZED_TIME_ILLEGAL_TIME =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_ATTR_SYNTAX_GENERALIZED_TIME_ILLEGAL_TIME_278",SCHEMA,SEVERE_WARNING,278, getClassLoader());

  /**
   * A schema element could not be imported: %s, %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> NOTE_SCHEMA_IMPORT_FAILED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"NOTICE_SCHEMA_IMPORT_FAILED_279",SCHEMA,NOTICE,279, getClassLoader());

  /**
   * The collation rule %s under matching rule entry %s is invalid as the locale %s is not supported by JVM
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> WARN_ATTR_INVALID_COLLATION_MATCHING_RULE_LOCALE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_WARN_ATTR_INVALID_COLLATION_MATCHING_RULE_LOCALE_280",SCHEMA,MILD_WARNING,280, getClassLoader());

  /**
   * The provided collation rule %s does not contain a valid format of OID:LOCALE
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ATTR_INVALID_COLLATION_MATCHING_RULE_FORMAT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_WARN_ATTR_INVALID_COLLATION_MATCHING_RULE_FORMAT_281",SCHEMA,MILD_WARNING,281, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid distinguished name because an attribute value started with a character at position %d that needs to be escaped
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_ATTR_SYNTAX_DN_INVALID_REQUIRES_ESCAPE_CHAR =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_DN_INVALID_REQUIRES_ESCAPE_CHAR_282",SCHEMA,MILD_ERROR,282, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid attribute type definition because character '%c' at position %d is not allowed in an attribute type name
   */
  public static final MessageDescriptor.Arg3<CharSequence,Character,Number> ERR_ATTR_SYNTAX_ATTR_ILLEGAL_CHAR =
          new MessageDescriptor.Arg3<CharSequence,Character,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_ATTR_ILLEGAL_CHAR_283",SCHEMA,MILD_ERROR,283, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid attribute type definition because the underscore character is not allowed in an attribute type name unless the %s configuration option is enabled
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ATTR_SYNTAX_ATTR_ILLEGAL_UNDERSCORE_CHAR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_ATTR_ILLEGAL_UNDERSCORE_CHAR_284",SCHEMA,MILD_ERROR,284, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid attribute type definition because the hyphen character is not allowed as the first character of an attribute type name
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ATTR_SYNTAX_ATTR_ILLEGAL_INITIAL_DASH =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_ATTR_ILLEGAL_INITIAL_DASH_285",SCHEMA,MILD_ERROR,285, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid attribute type definition because the underscore character is not allowed as the first character of an attribute type name even if the %s configuration option is enabled
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ATTR_SYNTAX_ATTR_ILLEGAL_INITIAL_UNDERSCORE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_ATTR_ILLEGAL_INITIAL_UNDERSCORE_286",SCHEMA,MILD_ERROR,286, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid attribute type definition because the digit '%c' is not allowed as the first character of an attribute type name unless the name is specified as an OID or the %s configuration option is enabled
   */
  public static final MessageDescriptor.Arg3<CharSequence,Character,CharSequence> ERR_ATTR_SYNTAX_ATTR_ILLEGAL_INITIAL_DIGIT =
          new MessageDescriptor.Arg3<CharSequence,Character,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_ATTR_ILLEGAL_INITIAL_DIGIT_287",SCHEMA,MILD_ERROR,287, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid object class definition because character '%c' at position %d is not allowed in an object class name
   */
  public static final MessageDescriptor.Arg3<CharSequence,Character,Number> ERR_OC_SYNTAX_ATTR_ILLEGAL_CHAR =
          new MessageDescriptor.Arg3<CharSequence,Character,Number>(BASE,"MILD_ERR_OC_SYNTAX_ATTR_ILLEGAL_CHAR_288",SCHEMA,MILD_ERROR,288, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid object class definition because the underscore character is not allowed in an object class name unless the %s configuration option is enabled
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_OC_SYNTAX_ATTR_ILLEGAL_UNDERSCORE_CHAR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_OC_SYNTAX_ATTR_ILLEGAL_UNDERSCORE_CHAR_289",SCHEMA,MILD_ERROR,289, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid object class definition because the hyphen character is not allowed as the first character of an object class name
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_OC_SYNTAX_ATTR_ILLEGAL_INITIAL_DASH =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_OC_SYNTAX_ATTR_ILLEGAL_INITIAL_DASH_290",SCHEMA,MILD_ERROR,290, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid object class definition because the underscore character is not allowed as the first character of an object class name even if the %s configuration option is enabled
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_OC_SYNTAX_ATTR_ILLEGAL_INITIAL_UNDERSCORE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_OC_SYNTAX_ATTR_ILLEGAL_INITIAL_UNDERSCORE_291",SCHEMA,MILD_ERROR,291, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid object class definition because the digit '%c' is not allowed as the first character of an object class name unless the name is specified as an OID or the %s configuration option is enabled
   */
  public static final MessageDescriptor.Arg3<CharSequence,Character,CharSequence> ERR_OC_SYNTAX_ATTR_ILLEGAL_INITIAL_DIGIT =
          new MessageDescriptor.Arg3<CharSequence,Character,CharSequence>(BASE,"MILD_ERR_OC_SYNTAX_ATTR_ILLEGAL_INITIAL_DIGIT_292",SCHEMA,MILD_ERROR,292, getClassLoader());

  /**
   * The provided "%s" value could not be parsed as a valid superior object class definition because definition for the objectclass with OID %s has already  declared a superior objectclass with an OID of %s. Multiple inheritance of objectclasses is not yet supported
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_ATTR_SYNTAX_OBJECTCLASS_MULTIPLE_SUPERIOR_CLASS =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_OBJECTCLASS_MULTIPLE_SUPERIOR_CLASS_293",SCHEMA,MILD_ERROR,293, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid assertion value because the character '%c' is not allowed. The acceptable values are s(second),m(minute), ,h(hour),d(day) and w(week)
   */
  public static final MessageDescriptor.Arg2<CharSequence,Character> WARN_ATTR_INVALID_RELATIVE_TIME_ASSERTION_FORMAT =
          new MessageDescriptor.Arg2<CharSequence,Character>(BASE,"MILD_WARN_ATTR_INVALID_RELATIVE_TIME_ASSERTION_FORMAT_294",SCHEMA,MILD_WARNING,294, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid assertion value because the character '%c' is not allowed. The acceptable values are s(second), m (minute), h (hour), D (date), M(month) and Y(year)
   */
  public static final MessageDescriptor.Arg2<CharSequence,Character> WARN_ATTR_INVALID_PARTIAL_TIME_ASSERTION_FORMAT =
          new MessageDescriptor.Arg2<CharSequence,Character>(BASE,"MILD_WARN_ATTR_INVALID_PARTIAL_TIME_ASSERTION_FORMAT_295",SCHEMA,MILD_WARNING,295, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid assertion value because "%d" is not a valid second specification
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> WARN_ATTR_INVALID_SECOND_ASSERTION_FORMAT =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_WARN_ATTR_INVALID_SECOND_ASSERTION_FORMAT_296",SCHEMA,MILD_WARNING,296, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid assertion value because "%d" is not a valid date specification
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> WARN_ATTR_INVALID_DATE_ASSERTION_FORMAT =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_WARN_ATTR_INVALID_DATE_ASSERTION_FORMAT_297",SCHEMA,MILD_WARNING,297, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid assertion value because "%d" is not a valid month specification
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> WARN_ATTR_INVALID_MONTH_ASSERTION_FORMAT =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_WARN_ATTR_INVALID_MONTH_ASSERTION_FORMAT_298",SCHEMA,MILD_WARNING,298, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid assertion value because "%d" is not a valid year specification
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> WARN_ATTR_INVALID_YEAR_ASSERTION_FORMAT =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_WARN_ATTR_INVALID_YEAR_ASSERTION_FORMAT_299",SCHEMA,MILD_WARNING,299, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid assertion value because there is  conflicting  value "%d" for DD(Date) specification
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> WARN_ATTR_DUPLICATE_DATE_ASSERTION_FORMAT =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_WARN_ATTR_DUPLICATE_DATE_ASSERTION_FORMAT_300",SCHEMA,MILD_WARNING,300, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid assertion value because there is  conflicting  value "%d" for MM(Month) specification
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> WARN_ATTR_DUPLICATE_MONTH_ASSERTION_FORMAT =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_WARN_ATTR_DUPLICATE_MONTH_ASSERTION_FORMAT_301",SCHEMA,MILD_WARNING,301, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid assertion value because there is  conflicting  value "%d" for YYYY(Year) specification
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> WARN_ATTR_DUPLICATE_YEAR_ASSERTION_FORMAT =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_WARN_ATTR_DUPLICATE_YEAR_ASSERTION_FORMAT_302",SCHEMA,MILD_WARNING,302, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid assertion value because it does not contain year in YYYY format
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ATTR_MISSING_YEAR_PARTIAL_TIME_ASSERTION_FORMAT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_WARN_ATTR_MISSING_YEAR_PARTIAL_TIME_ASSERTION_FORMAT_303",SCHEMA,MILD_WARNING,303, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid assertion value because more than  one time units are not allowed
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ATTR_CONFLICTING_ASSERTION_FORMAT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_WARN_ATTR_CONFLICTING_ASSERTION_FORMAT_304",SCHEMA,MILD_WARNING,304, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an ldap syntax because the OID contained an illegal character %s at position %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> WARN_ATTR_LDAP_SYNTAX_ILLEGAL_CHAR_IN_OID =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"MILD_WARN_ATTR_LDAP_SYNTAX_ILLEGAL_CHAR_IN_OID_305",SCHEMA,MILD_WARNING,305, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an ldap syntax because it contains an unrecognized extension %s at position %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> ERR_ATTR_SYNTAX_LDAPSYNTAX_UNKNOWN_EXT =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_LDAPSYNTAX_UNKNOWN_EXT_306",SCHEMA,MILD_ERROR,306, getClassLoader());

  /**
   * The provided value "%s" cannot be parsed as a valid regex syntax because it does not match  the pattern "%s"
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_ATTR_SYNTAX_LDAPSYNTAX_REGEX_INVALID_VALUE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_WARN_ATTR_SYNTAX_LDAPSYNTAX_REGEX_INVALID_VALUE_307",SCHEMA,MILD_WARNING,307, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a regex syntax because it does not contain a regex pattern
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ATTR_SYNTAX_LDAPSYNTAX_REGEX_NO_PATTERN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_WARN_ATTR_SYNTAX_LDAPSYNTAX_REGEX_NO_PATTERN_308",SCHEMA,MILD_WARNING,308, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a regex syntax because the provided regex pattern "%s" is invalid
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_ATTR_SYNTAX_LDAPSYNTAX_REGEX_INVALID_PATTERN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_WARN_ATTR_SYNTAX_LDAPSYNTAX_REGEX_INVALID_PATTERN_309",SCHEMA,MILD_WARNING,309, getClassLoader());

  /**
   * The provided value "%s" cannot be parsed because it is not allowed by enumeration syntax with OID "%s"
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_ATTR_SYNTAX_LDAPSYNTAX_ENUM_INVALID_VALUE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_WARN_ATTR_SYNTAX_LDAPSYNTAX_ENUM_INVALID_VALUE_310",SCHEMA,MILD_WARNING,310, getClassLoader());

  /**
   * The provided value "%s" cannot be parsed as an enumeration syntax  because it contains a duplicate value "%s" at position %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> WARN_ATTR_SYNTAX_LDAPSYNTAX_ENUM_DUPLICATE_VALUE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"MILD_WARN_ATTR_SYNTAX_LDAPSYNTAX_ENUM_DUPLICATE_VALUE_311",SCHEMA,MILD_WARNING,311, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid assertion value because "%d" is not a valid minute specification
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> WARN_ATTR_INVALID_MINUTE_ASSERTION_FORMAT =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_WARN_ATTR_INVALID_MINUTE_ASSERTION_FORMAT_312",SCHEMA,MILD_WARNING,312, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid assertion value because "%d" is not a valid hour specification
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> WARN_ATTR_INVALID_HOUR_ASSERTION_FORMAT =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_WARN_ATTR_INVALID_HOUR_ASSERTION_FORMAT_313",SCHEMA,MILD_WARNING,313, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid assertion value because there is  conflicting  value "%d" for s(Second) specification
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> WARN_ATTR_DUPLICATE_SECOND_ASSERTION_FORMAT =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_WARN_ATTR_DUPLICATE_SECOND_ASSERTION_FORMAT_314",SCHEMA,MILD_WARNING,314, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid assertion value because there is  conflicting  value "%d" for m(Minute) specification
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> WARN_ATTR_DUPLICATE_MINUTE_ASSERTION_FORMAT =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_WARN_ATTR_DUPLICATE_MINUTE_ASSERTION_FORMAT_315",SCHEMA,MILD_WARNING,315, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as a valid assertion value because there is  conflicting  value "%d" for h(Hour) specification
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> WARN_ATTR_DUPLICATE_HOUR_ASSERTION_FORMAT =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_WARN_ATTR_DUPLICATE_HOUR_ASSERTION_FORMAT_316",SCHEMA,MILD_WARNING,316, getClassLoader());

  /**
   * The provided value could not be parsed as a valid ldap syntax description because it was empty or contained only whitespace
   */
  public static final MessageDescriptor.Arg0 ERR_ATTR_SYNTAX_LDAPSYNTAX_EMPTY_VALUE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_ATTR_SYNTAX_LDAPSYNTAX_EMPTY_VALUE_317",SCHEMA,MILD_ERROR,317, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an ldap syntax description because an open parenthesis was expected at position %d but instead a '%s' character was found
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,CharSequence> ERR_ATTR_SYNTAX_LDAPSYNTAX_EXPECTED_OPEN_PARENTHESIS =
          new MessageDescriptor.Arg3<CharSequence,Number,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_LDAPSYNTAX_EXPECTED_OPEN_PARENTHESIS_318",SCHEMA,MILD_ERROR,318, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an ldap syntax description because the end of the value was encountered while the Directory Server expected more data to be provided
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ATTR_SYNTAX_LDAPSYNTAX_TRUNCATED_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_LDAPSYNTAX_TRUNCATED_VALUE_319",SCHEMA,MILD_ERROR,319, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an ldap syntax description because the numeric OID contained two consecutive periods at position %d
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_ATTR_SYNTAX_LDAPSYNTAX_DOUBLE_PERIOD_IN_NUMERIC_OID =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_LDAPSYNTAX_DOUBLE_PERIOD_IN_NUMERIC_OID_320",SCHEMA,MILD_ERROR,320, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an ldap syntax description because the numeric OID contained an illegal character %s at position %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> ERR_ATTR_SYNTAX_LDAPSYNTAX_ILLEGAL_CHAR_IN_NUMERIC_OID =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_LDAPSYNTAX_ILLEGAL_CHAR_IN_NUMERIC_OID_321",SCHEMA,MILD_ERROR,321, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an ldap syntax description because the non-numeric OID contained an illegal character %s at position %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> ERR_ATTR_SYNTAX_LDAPSYNTAX_ILLEGAL_CHAR_IN_STRING_OID =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_LDAPSYNTAX_ILLEGAL_CHAR_IN_STRING_OID_322",SCHEMA,MILD_ERROR,322, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an ldap syntax description because it contained an unexpected closing parenthesis at position %d
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_ATTR_SYNTAX_LDAPSYNTAX_UNEXPECTED_CLOSE_PARENTHESIS =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_LDAPSYNTAX_UNEXPECTED_CLOSE_PARENTHESIS_323",SCHEMA,MILD_ERROR,323, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an ldap syntax description because it contains more than one form of constructor
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ATTR_SYNTAX_LDAPSYNTAX_TOO_MANY_EXTENSIONS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_LDAPSYNTAX_TOO_MANY_EXTENSIONS_324",SCHEMA,MILD_ERROR,324, getClassLoader());

  /**
   * The definition for the ldap syntax with OID %s declared that it's a substitute for a syntax with OID %s. No such syntax is configured for use in the Directory Server
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ATTR_SYNTAX_LDAPSYNTAX_UNKNOWN_SYNTAX =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_LDAPSYNTAX_UNKNOWN_SYNTAX_325",SCHEMA,MILD_ERROR,325, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an enumeration syntax, because there is no value
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ATTR_SYNTAX_LDAPSYNTAX_ENUM_NO_VALUES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_LDAPSYNTAX_ENUM_NO_VALUES_326",SCHEMA,MILD_ERROR,326, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an ldap syntax extension because an invalid character was found at position %d
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_ATTR_SYNTAX_LDAPSYNTAX_EXTENSION_INVALID_CHARACTER =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_ERR_ATTR_SYNTAX_LDAPSYNTAX_EXTENSION_INVALID_CHARACTER_327",SCHEMA,MILD_ERROR,327, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an ldap syntax description because a close parenthesis was expected at position %d but instead a '%s' character was found
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,CharSequence> ERR_ATTR_SYNTAX_LDAPSYNTAX_EXPECTED_CLOSE_PARENTHESIS =
          new MessageDescriptor.Arg3<CharSequence,Number,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_LDAPSYNTAX_EXPECTED_CLOSE_PARENTHESIS_328",SCHEMA,MILD_ERROR,328, getClassLoader());

  /**
   * The provided value "%s" could not be parsed as an ldap syntax description because a single quote was expected at position %d but the character %s was found instead
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,CharSequence> ERR_ATTR_SYNTAX_LDAPSYNTAX_EXPECTED_QUOTE_AT_POS =
          new MessageDescriptor.Arg3<CharSequence,Number,CharSequence>(BASE,"MILD_ERR_ATTR_SYNTAX_LDAPSYNTAX_EXPECTED_QUOTE_AT_POS_329",SCHEMA,MILD_ERROR,329, getClassLoader());


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
            Class<?> c = Class.forName("org.opends.messages.SchemaMessages");

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
      cl = SchemaMessages.class.getClassLoader();
    }
    return cl;
  }
}
