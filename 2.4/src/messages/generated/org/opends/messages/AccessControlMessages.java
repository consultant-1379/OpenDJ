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
public final class AccessControlMessages {

  /** Base property for resource bundle containing messages */
  private static final String BASE = "messages/access_control";

  private static ClassLoader webstartClassLoader;

  // Prevent instantiation.
  private AccessControlMessages() {
    // Do nothing.
  }

  /**
   * The provided string  "%s" could not be parsed as a valid Access Control Instruction (ACI) because it failed general ACI syntax evaluation
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_GENERAL_PARSE_FAILED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_GENERAL_PARSE_FAILED_1",ACCESS_CONTROL,SEVERE_WARNING,1, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) version value  "%s" is invalid, only the version 3.0 is supported
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVAILD_VERSION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVAILD_VERSION_2",ACCESS_CONTROL,SEVERE_WARNING,2, getClassLoader());

  /**
   * The provided Access Control Instruction access type value  "%s" is invalid. A valid access type value is either allow or deny
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVALID_ACCESS_TYPE_VERSION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_ACCESS_TYPE_VERSION_3",ACCESS_CONTROL,SEVERE_WARNING,3, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) rights values "%s" are invalid. The rights must be a list of 1 to 6 comma-separated keywords enclosed in parentheses
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVALID_RIGHTS_SYNTAX =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_RIGHTS_SYNTAX_4",ACCESS_CONTROL,SEVERE_WARNING,4, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) rights keyword values "%s" are invalid. The valid rights keyword values are one or more of the following: read, write, add, delete, search, compare or the single value all
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVALID_RIGHTS_KEYWORD =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_RIGHTS_KEYWORD_5",ACCESS_CONTROL,SEVERE_WARNING,5, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) bind rule value "%s" is invalid because it is missing a close parenthesis that corresponded to the initial open parenthesis
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ACI_SYNTAX_BIND_RULE_MISSING_CLOSE_PAREN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ACI_SYNTAX_BIND_RULE_MISSING_CLOSE_PAREN_6",ACCESS_CONTROL,MILD_ERROR,6, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) bind rule value "%s" is invalid. A valid bind rule value must be in the following form: keyword operator "expression"
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ACI_SYNTAX_INVALID_BIND_RULE_SYNTAX =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ACI_SYNTAX_INVALID_BIND_RULE_SYNTAX_7",ACCESS_CONTROL,MILD_ERROR,7, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) bind rule keyword value "%s" is invalid. A valid keyword value is one of the following: userdn, groupdn, roledn, userattr,ip, dns, dayofweek, timeofday or authmethod
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVALID_BIND_RULE_KEYWORD =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_BIND_RULE_KEYWORD_8",ACCESS_CONTROL,SEVERE_WARNING,8, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) bind rule operator value  "%s" is invalid. A valid bind rule operator value is either '=' or "!="
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVALID_BIND_RULE_OPERATOR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_BIND_RULE_OPERATOR_9",ACCESS_CONTROL,SEVERE_WARNING,9, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) bind rule expression value corresponding to the keyword value "%s" is missing an expression. A valid bind rule value must be in the following form: keyword operator "expression"
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_MISSING_BIND_RULE_EXPRESSION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_MISSING_BIND_RULE_EXPRESSION_10",ACCESS_CONTROL,SEVERE_WARNING,10, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) bind rule boolean operator value "%s" is invalid. A valid bind rule boolean operator value is either "OR" or "AND"
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVALID_BIND_RULE_BOOLEAN_OPERATOR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_BIND_RULE_BOOLEAN_OPERATOR_11",ACCESS_CONTROL,SEVERE_WARNING,11, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) bind rule keyword string  "%s" is invalid for the bind rule operator string "%s"
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_ACI_SYNTAX_INVALID_BIND_RULE_KEYWORD_OPERATOR_COMBO =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_BIND_RULE_KEYWORD_OPERATOR_COMBO_12",ACCESS_CONTROL,SEVERE_WARNING,12, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) bind rule userdn expression failed to URL decode for the following reason: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVALID_USERDN_URL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_USERDN_URL_13",ACCESS_CONTROL,SEVERE_WARNING,13, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) bind rule roledn expression value "%s" is invalid. A valid roledn keyword expression value requires one or more LDAP URLs in the following format: ldap:///dn [|| ldap:///dn] ... [|| ldap:///dn]
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVALID_ROLEDN_EXPRESSION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_ROLEDN_EXPRESSION_14",ACCESS_CONTROL,SEVERE_WARNING,14, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) bind rule roledn expression failed to URL decode for the following reason: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVALID_ROLEDN_URL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_ROLEDN_URL_15",ACCESS_CONTROL,SEVERE_WARNING,15, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) bind rule groupdn expression value "%s" is invalid. A valid groupdn keyword expression  value requires one or more LDAP URLs in the following format: ldap:///groupdn [|| ldap:///groupdn] ... [|| ldap:///groupdn]
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVALID_GROUPDN_EXPRESSION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_GROUPDN_EXPRESSION_16",ACCESS_CONTROL,SEVERE_WARNING,16, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) bind rule groupdn expression value failed to URL decode for the following reason: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVALID_GROUPDN_URL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_GROUPDN_URL_17",ACCESS_CONTROL,SEVERE_WARNING,17, getClassLoader());

  /**
   * The network mask value "%s" is not valid for the ip expression network address "%s"
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_ACI_SYNTAX_ADDRESS_FAMILY_MISMATCH =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_ADDRESS_FAMILY_MISMATCH_18",ACCESS_CONTROL,SEVERE_WARNING,18, getClassLoader());

  /**
   * The bit mask for address type value "%s" is not valid.%s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_ACI_SYNTAX_INVALID_NETWORK_BIT_MATCH =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_NETWORK_BIT_MATCH_19",ACCESS_CONTROL,SEVERE_WARNING,19, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) bind rule ip expression value failed to decode for the following reason: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVALID_IP_CRITERIA_DECODE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_IP_CRITERIA_DECODE_20",ACCESS_CONTROL,SEVERE_WARNING,20, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) bind rule ip expression value "%s" is invalid. A valid ip keyword expression requires one or more comma-separated elements of a valid IP address list expression
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVALID_IP_EXPRESSION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_IP_EXPRESSION_21",ACCESS_CONTROL,SEVERE_WARNING,21, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) bind rule dns expression value "%s" is invalid. A valid dns keyword expression value requires a valid fully qualified DNS domain name
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVALID_DNS_EXPRESSION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_DNS_EXPRESSION_22",ACCESS_CONTROL,SEVERE_WARNING,22, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) bind rule dns expression value "%s" is invalid, because a wild-card pattern was found in the wrong position. A valid dns keyword wild-card expression value requires the '*' character only be in the leftmost position of the domain name
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVALID_DNS_WILDCARD =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_DNS_WILDCARD_23",ACCESS_CONTROL,SEVERE_WARNING,23, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) bind rule dayofweek expression value "%s" is invalid, because of an invalid day of week value. A valid dayofweek value is one of the following English three-letter abbreviations for the days of the week: sun, mon, tue, wed, thu, fri, or sat
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVALID_DAYOFWEEK =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_DAYOFWEEK_24",ACCESS_CONTROL,SEVERE_WARNING,24, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) bind rule timeofday expression value "%s" is invalid. A valid timeofday value is expressed as four digits representing hours and minutes in the 24-hour clock (0 to 2359)
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVALID_TIMEOFDAY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_TIMEOFDAY_25",ACCESS_CONTROL,SEVERE_WARNING,25, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) bind rule timeofday expression value "%s" is not in the valid range. A valid timeofday value is expressed as four digits representing hours and minutes in the 24-hour clock (0 to 2359)
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVALID_TIMEOFDAY_RANGE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_TIMEOFDAY_RANGE_26",ACCESS_CONTROL,SEVERE_WARNING,26, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) bind rule authmethod expression value "%s" is invalid. A valid authmethod value is one of the following: none, simple,SSL, or "sasl mechanism", where mechanism is one of the supported SASL mechanisms including CRAM-MD5, DIGEST-MD5, and GSSAPI
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVALID_AUTHMETHOD_EXPRESSION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_AUTHMETHOD_EXPRESSION_27",ACCESS_CONTROL,SEVERE_WARNING,27, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) bind rule userattr expression value "%s" is invalid
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVALID_USERATTR_EXPRESSION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_USERATTR_EXPRESSION_28",ACCESS_CONTROL,SEVERE_WARNING,28, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) bind rule userattr expression value "%s" is not supported
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVALID_USERATTR_KEYWORD =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_USERATTR_KEYWORD_29",ACCESS_CONTROL,SEVERE_WARNING,29, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) bind rule userattr expression inheritance pattern value "%s" is invalid. A valid inheritance pattern value must have the following format: parent[inheritance_level].attribute#bindType
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVALID_USERATTR_INHERITANCE_PATTERN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_USERATTR_INHERITANCE_PATTERN_30",ACCESS_CONTROL,SEVERE_WARNING,30, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) bind rule userattr expression inheritance pattern value "%s" is invalid. The inheritance level value cannot exceed the max level limit of %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_ACI_SYNTAX_MAX_USERATTR_INHERITANCE_LEVEL_EXCEEDED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_MAX_USERATTR_INHERITANCE_LEVEL_EXCEEDED_31",ACCESS_CONTROL,SEVERE_WARNING,31, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) bind rule userattr expression inheritance pattern value "%s" is invalid because it is non-numeric
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVALID_INHERITANCE_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_INHERITANCE_VALUE_32",ACCESS_CONTROL,SEVERE_WARNING,32, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) target rule value "%s" is invalid. A valid target rule value must be in the following form: keyword operator "expression"
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVALID_TARGET_SYNTAX =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_TARGET_SYNTAX_33",ACCESS_CONTROL,SEVERE_WARNING,33, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) target keyword value "%s" is invalid. A valid target keyword value is one of the following: target, targetscope, targetfilter, targetattr or targattrfilters
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVALID_TARGET_KEYWORD =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_TARGET_KEYWORD_34",ACCESS_CONTROL,SEVERE_WARNING,34, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) target operator value "%s" is invalid. The only valid target operator value for the "%s" keyword is '='
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_ACI_SYNTAX_INVALID_TARGET_NOT_OPERATOR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_TARGET_NOT_OPERATOR_35",ACCESS_CONTROL,SEVERE_WARNING,35, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) target keyword value "%s" is not supported at this time
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_TARGET_KEYWORD_NOT_SUPPORTED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_TARGET_KEYWORD_NOT_SUPPORTED_36",ACCESS_CONTROL,SEVERE_WARNING,36, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) target keyword value "%s" was seen multiple times in the ACI "%s"
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_ACI_SYNTAX_INVALID_TARGET_DUPLICATE_KEYWORDS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_TARGET_DUPLICATE_KEYWORDS_37",ACCESS_CONTROL,SEVERE_WARNING,37, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) target keyword operator value  "%s" is invalid. A valid target keyword operator value is either '=' or "!="
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVALID_TARGETS_OPERATOR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_TARGETS_OPERATOR_38",ACCESS_CONTROL,SEVERE_WARNING,38, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) targetscope expression operator value  "%s" is invalid. A valid targetscope expression value is one of the following: one, onelevel, subtree or subordinate
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVALID_TARGETSCOPE_EXPRESSION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_TARGETSCOPE_EXPRESSION_39",ACCESS_CONTROL,SEVERE_WARNING,39, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) target expression value "%s" is invalid. A valid target keyword expression  value requires a LDAP URL in the following format: ldap:///distinguished_name_pattern
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVALID_TARGETKEYWORD_EXPRESSION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_TARGETKEYWORD_EXPRESSION_40",ACCESS_CONTROL,SEVERE_WARNING,40, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) target expression DN value "%s" is invalid. The target expression DN value must be a descendant of the ACI entry DN "%s", if no wild-card is specified in the target expression DN
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_ACI_SYNTAX_TARGET_DN_NOT_DESCENDENTOF =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_TARGET_DN_NOT_DESCENDENTOF_41",ACCESS_CONTROL,SEVERE_WARNING,41, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) targetattr expression value "%s" is invalid. A valid targetattr keyword expression value requires one or more valid attribute type names in the following format: attribute1 [|| attribute1] ... [|| attributeN]
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVALID_TARGETATTRKEYWORD_EXPRESSION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_TARGETATTRKEYWORD_EXPRESSION_42",ACCESS_CONTROL,SEVERE_WARNING,42, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) targetfilter expression value "%s" is invalid because it is not a valid LDAP filter
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVALID_TARGETFILTERKEYWORD_EXPRESSION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_TARGETFILTERKEYWORD_EXPRESSION_43",ACCESS_CONTROL,SEVERE_WARNING,43, getClassLoader());

  /**
   * An attempt to add the entry "%s" containing an aci attribute type failed, because the authorization DN "%s" lacked modify-acl privileges
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_ACI_ADD_FAILED_PRIVILEGE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_ACI_ADD_FAILED_PRIVILEGE_44",ACCESS_CONTROL,INFORMATION,44, getClassLoader());

  /**
   * An attempt to modify an aci attribute type in the entry "%s" failed, because the authorization DN "%s" lacked modify-acl privileges
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_ACI_MODIFY_FAILED_PRIVILEGE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_ACI_MODIFY_FAILED_PRIVILEGE_45",ACCESS_CONTROL,INFORMATION,45, getClassLoader());

  /**
   * An attempt to add the entry "%s" containing an aci attribute type failed because of the following reason: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_ACI_ADD_FAILED_DECODE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_ACI_ADD_FAILED_DECODE_46",ACCESS_CONTROL,SEVERE_WARNING,46, getClassLoader());

  /**
   * An attempt to modify an aci attribute type in the entry "%s" failed because of the following reason: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_ACI_MODIFY_FAILED_DECODE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_ACI_MODIFY_FAILED_DECODE_47",ACCESS_CONTROL,SEVERE_WARNING,47, getClassLoader());

  /**
   * "%s", located in the entry "%s", because of the following reason: %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> WARN_ACI_ADD_LIST_FAILED_DECODE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_WARN_ACI_ADD_LIST_FAILED_DECODE_48",ACCESS_CONTROL,SEVERE_WARNING,48, getClassLoader());

  /**
   * No Access Control Instruction (ACI) attribute types were found in context "%s"
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ACI_ADD_LIST_NO_ACIS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ACI_ADD_LIST_NO_ACIS_49",ACCESS_CONTROL,INFORMATION,49, getClassLoader());

  /**
   * Added %s Access Control Instruction (ACI) attribute types found in context "%s" to the access control evaluation engine
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_ACI_ADD_LIST_ACIS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_ACI_ADD_LIST_ACIS_50",ACCESS_CONTROL,INFORMATION,50, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) bind rule userattr expression inheritance pattern value "%s" is invalid for the roledn keyword because it starts with the string "parent["
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVALID_USERATTR_ROLEDN_INHERITANCE_PATTERN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_USERATTR_ROLEDN_INHERITANCE_PATTERN_51",ACCESS_CONTROL,SEVERE_WARNING,51, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) targattrfilter expression value %s is invalid because %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_ACI_SYNTAX_INVALID_TARGATTRFILTERS_OPERATION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_TARGATTRFILTERS_OPERATION_52",ACCESS_CONTROL,SEVERE_WARNING,52, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) targattrfilter expression value %s is invalid because it is not in the correct format.A valid targattrsfilters expression value must be in the following format: "add=attr1: F1 && attr2: F2 ... && attrN: FN,del= attr1: F1 && attr2: F2 ... && attrN: FN"
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVALID_TARGATTRFILTERS_EXPRESSION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_TARGATTRFILTERS_EXPRESSION_53",ACCESS_CONTROL,SEVERE_WARNING,53, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) targattrfilter expression value %s is invalid because the both operation tokens match in the two filter lists
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVALID_TARGATTRFILTERS_OPS_MATCH =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_TARGATTRFILTERS_OPS_MATCH_54",ACCESS_CONTROL,SEVERE_WARNING,54, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) targattrfilters expression value %s is invalid because there are more than two filter list statements
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVALID_TARGATTRFILTERS_MAX_FILTER_LISTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_TARGATTRFILTERS_MAX_FILTER_LISTS_55",ACCESS_CONTROL,SEVERE_WARNING,55, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) targattrfilters expression value %s is invalid because the provided filter list string is in the wrong format. A valid targattrfilters filter list must be in the following format: add=attr1: F1 && attr2: F2 ... && attrN: FN
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVALID_TARGATTRFILTERS_FILTER_LIST_FORMAT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_TARGATTRFILTERS_FILTER_LIST_FORMAT_56",ACCESS_CONTROL,SEVERE_WARNING,56, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) targattrfilters expression value %s is invalid because one or more of the specified filters are invalid for the following reason: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_ACI_SYNTAX_INVALID_TARGATTRFILTERS_FILTER_LISTS_FILTER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_TARGATTRFILTERS_FILTER_LISTS_FILTER_57",ACCESS_CONTROL,SEVERE_WARNING,57, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) targattrfilters expression value %s is invalid because one or more of the specified filters are invalid because of non-matching attribute type names in the filter
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVALID_TARGATTRFILTERS_FILTER_LISTS_ATTR_FILTER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_TARGATTRFILTERS_FILTER_LISTS_ATTR_FILTER_58",ACCESS_CONTROL,SEVERE_WARNING,58, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) attribute name value %s is invalid. A valid attribute type name must begin with an ASCII letter and must contain only ASCII letters,digits or the "-" character
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVALID_ATTRIBUTE_TYPE_NAME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_ATTRIBUTE_TYPE_NAME_59",ACCESS_CONTROL,SEVERE_WARNING,59, getClassLoader());

  /**
   * The SASL mechanism "%s" provided in the Access Control Instruction (ACI) bind rule authmethod expression is not one of the currently registered mechanisms in the server
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_ACI_SYNTAX_DUBIOUS_AUTHMETHOD_SASL_MECHANISM =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_ACI_SYNTAX_DUBIOUS_AUTHMETHOD_SASL_MECHANISM_60",ACCESS_CONTROL,NOTICE,60, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) bind rule dns expression value "%s" references hostname %s, but the canonical representation for that hostname is configured to be %s.  The server will attempt to automatically interpret the correct localhost value
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> WARN_ACI_LOCALHOST_DOESNT_MATCH_CANONICAL_VALUE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_WARN_ACI_LOCALHOST_DOESNT_MATCH_CANONICAL_VALUE_61",ACCESS_CONTROL,SEVERE_WARNING,61, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) bind rule dns expression value "%s" references hostname %s, which resolves to IP address %s, but the canonical hostname for that IP address is %s.  This likely means that the provided hostname will never match any clients
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> WARN_ACI_HOSTNAME_DOESNT_MATCH_CANONICAL_VALUE =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_WARN_ACI_HOSTNAME_DOESNT_MATCH_CANONICAL_VALUE_62",ACCESS_CONTROL,SEVERE_WARNING,62, getClassLoader());

  /**
   * An error occurred while attempting to determine whether hostname %s referenced in dns expression bind rule "%s" used the correct canonical representation:  %s.  This likely means that the provided hostname will never match any clients
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> WARN_ACI_ERROR_CHECKING_CANONICAL_HOSTNAME =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_WARN_ACI_ERROR_CHECKING_CANONICAL_HOSTNAME_63",ACCESS_CONTROL,SEVERE_WARNING,63, getClassLoader());

  /**
   * Specifies a global Access Control Instruction (ACI) attribute type that can be used to defined ACIs that have global scope across naming contexts
   */
  public static final MessageDescriptor.Arg0 INFO_ACI_DESCRIPTION_GLOBAL_ACI =
          new MessageDescriptor.Arg0(BASE,"INFO_ACI_DESCRIPTION_GLOBAL_ACI_64",ACCESS_CONTROL,INFORMATION,64, getClassLoader());

  /**
   * No Global Access Control Instruction (ACI) attribute types were found
   */
  public static final MessageDescriptor.Arg0 INFO_ACI_ADD_LIST_NO_GLOBAL_ACIS =
          new MessageDescriptor.Arg0(BASE,"INFO_ACI_ADD_LIST_NO_GLOBAL_ACIS_65",ACCESS_CONTROL,INFORMATION,65, getClassLoader());

  /**
   * Added %s Global Access Control Instruction (ACI) attribute types to the access control evaluation engine
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ACI_ADD_LIST_GLOBAL_ACIS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ACI_ADD_LIST_GLOBAL_ACIS_66",ACCESS_CONTROL,INFORMATION,66, getClassLoader());

  /**
   * An unexpected error occurred while processing the ds-cfg-global-aci attribute in configuration entry %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_ACI_HANDLER_FAIL_PROCESS_GLOBAL_ACI =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_ACI_HANDLER_FAIL_PROCESS_GLOBAL_ACI_67",ACCESS_CONTROL,INFORMATION,67, getClassLoader());

  /**
   * An unexpected error occurred while processing the  aci attributes in the configuration system
   */
  public static final MessageDescriptor.Arg0 INFO_ACI_HANDLER_FAIL_PROCESS_ACI =
          new MessageDescriptor.Arg0(BASE,"INFO_ACI_HANDLER_FAIL_PROCESS_ACI_68",ACCESS_CONTROL,INFORMATION,68, getClassLoader());

  /**
   * The pattern DN %s is not valid because it contains two consecutive wildcards in an attribute value
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_PATTERN_DN_CONSECUTIVE_WILDCARDS_IN_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_PATTERN_DN_CONSECUTIVE_WILDCARDS_IN_VALUE_69",ACCESS_CONTROL,SEVERE_WARNING,69, getClassLoader());

  /**
   * The pattern DN %s is not valid because it uses wildcards for substring matching on an attribute type. A single wildcard is allowed in place of an attribute type
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_PATTERN_DN_TYPE_CONTAINS_SUBSTRINGS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_PATTERN_DN_TYPE_CONTAINS_SUBSTRINGS_70",ACCESS_CONTROL,SEVERE_WARNING,70, getClassLoader());

  /**
   * The pattern DN %s is not valid because it contains a wildcard in an attribute type in a multi-valued RDN
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_PATTERN_DN_TYPE_WILDCARD_IN_MULTIVALUED_RDN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_PATTERN_DN_TYPE_WILDCARD_IN_MULTIVALUED_RDN_71",ACCESS_CONTROL,SEVERE_WARNING,71, getClassLoader());

  /**
   * Unable to obtain a lock on the ModifyDN new superior entry %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_HANDLER_CANNOT_LOCK_NEW_SUPERIOR_USER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_HANDLER_CANNOT_LOCK_NEW_SUPERIOR_USER_72",ACCESS_CONTROL,SEVERE_WARNING,72, getClassLoader());

  /**
   * Selfwrite check skipped because an attribute "%s" with a distinguished name syntax was not a valid DN
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_NOT_VALID_DN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_NOT_VALID_DN_73",ACCESS_CONTROL,SEVERE_WARNING,73, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) targetattr expression value "%s" is invalid because the expression contains invalid or duplicate tokens
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_TARGETATTR_INVALID_ATTR_TOKEN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_TARGETATTR_INVALID_ATTR_TOKEN_74",ACCESS_CONTROL,SEVERE_WARNING,74, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) expression value "%s" is invalid because it contains the roledn keyword, which is not supported,  replace it with the groupdn keyword
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_ROLEDN_NOT_SUPPORTED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_ROLEDN_NOT_SUPPORTED_75",ACCESS_CONTROL,SEVERE_WARNING,75, getClassLoader());

  /**
   * Failed to decode the Access Control Instruction (ACI)%s
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SERVER_DECODE_FAILED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SERVER_DECODE_FAILED_76",ACCESS_CONTROL,SEVERE_WARNING,76, getClassLoader());

  /**
   * The server is being put into lockdown mode because invalid ACIs rules were detected either when the server was started or during a backend initialization
   */
  public static final MessageDescriptor.Arg0 WARN_ACI_ENTER_LOCKDOWN_MODE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_WARN_ACI_ENTER_LOCKDOWN_MODE_77",ACCESS_CONTROL,SEVERE_WARNING,77, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) bind rule userattr expression value failed to URL decode for the following reason: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVALID_USERATTR_URL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_USERATTR_URL_78",ACCESS_CONTROL,SEVERE_WARNING,78, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) bind rule userattr expression value failed to parse because the ldap URL "%s" contains an empty base DN
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVALID_USERATTR_BASEDN_URL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_USERATTR_BASEDN_URL_79",ACCESS_CONTROL,SEVERE_WARNING,79, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) bind rule userattr expression value failed to parse because the attribute field of the ldap URL "%s" either contains more than one description or the field is empty
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVALID_USERATTR_ATTR_URL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_USERATTR_ATTR_URL_80",ACCESS_CONTROL,SEVERE_WARNING,80, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) bind rule IP address expression failed to parse because the prefix part of the expression "%s" has an invalid format
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVALID_PREFIX_FORMAT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_PREFIX_FORMAT_81",ACCESS_CONTROL,SEVERE_WARNING,81, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) bind rule IP address expression failed to parse because the prefix value of the expression "%s" was an invalid value. All values must greater than or equal to 0 and either less than or equal 32 for IPV4 addresses or less than or equal to 128 for IPV6 addresses
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVALID_PREFIX_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_PREFIX_VALUE_82",ACCESS_CONTROL,SEVERE_WARNING,82, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) bind rule IP address expression failed to parse because the prefix part of the expression "%s" has an non-numeric value
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_PREFIX_NOT_NUMERIC =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_PREFIX_NOT_NUMERIC_83",ACCESS_CONTROL,SEVERE_WARNING,83, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) bind rule IP address expression failed to parse because the the IPv4 address expression "%s" format was invalid
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVALID_IPV4_FORMAT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_IPV4_FORMAT_84",ACCESS_CONTROL,SEVERE_WARNING,84, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) bind rule IP address expression failed to parse because the IPv4 address expression "%s" contains an invalid value.  All values of the address must be between 0 and 255
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVALID_IPV4_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_IPV4_VALUE_85",ACCESS_CONTROL,SEVERE_WARNING,85, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) bind rule IP address expression failed to parse because the the IPv4 address expression "%s" contains a non-numeric value
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_IPV4_NOT_NUMERIC =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_IPV4_NOT_NUMERIC_86",ACCESS_CONTROL,SEVERE_WARNING,86, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) bind rule IP address expression failed to parse because the the IPv6 address expression "%s" contains an illegal wildcard character. Wildcards are not supported when using IPv6 addresses in a IP bind rule expression
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_IPV6_WILDCARD_INVALID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_IPV6_WILDCARD_INVALID_87",ACCESS_CONTROL,SEVERE_WARNING,87, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) bind rule IP address expression "%s" failed to parse for the following reason: "%s"
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_ACI_SYNTAX_INVALID_IPV6_FORMAT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_IPV6_FORMAT_88",ACCESS_CONTROL,SEVERE_WARNING,88, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) bind rule IP address expression failed to parse because the netmask part of the expression "%s" has an invalid format
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVALID_NETMASK_FORMAT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_NETMASK_FORMAT_89",ACCESS_CONTROL,SEVERE_WARNING,89, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) bind rule IP address expression failed to parse because the netmask part of the expression "%s" has an invalid value
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVALID_NETMASK =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_NETMASK_90",ACCESS_CONTROL,SEVERE_WARNING,90, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) targetcontrol expression value "%s" is invalid. A valid targetcontrol keyword expression value requires one or more valid control OID strings in the following format: oid [|| oid1] ... [|| oidN]
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVALID_TARGETCONTROL_EXPRESSION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_TARGETCONTROL_EXPRESSION_91",ACCESS_CONTROL,SEVERE_WARNING,91, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) targetcontrol OID value "%s" could not be parsed because the value contained an illegal character %c at position %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,Character,Number> WARN_ACI_SYNTAX_ILLEGAL_CHAR_IN_NUMERIC_OID =
          new MessageDescriptor.Arg3<CharSequence,Character,Number>(BASE,"SEVERE_WARN_ACI_SYNTAX_ILLEGAL_CHAR_IN_NUMERIC_OID_92",ACCESS_CONTROL,SEVERE_WARNING,92, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) targetcontrol OID value "%s" could not be parsed because the numeric OID contained two consecutive periods at position %d
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> WARN_ACI_SYNTAX_DOUBLE_PERIOD_IN_NUMERIC_OID =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"SEVERE_WARN_ACI_SYNTAX_DOUBLE_PERIOD_IN_NUMERIC_OID_93",ACCESS_CONTROL,SEVERE_WARNING,93, getClassLoader());

  /**
   * The access control check failed because a geteffectiverights control could not be decoded because of the following reason: "%s"
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_DECODE_EFFECTIVERIGHTS_FAIL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_DECODE_EFFECTIVERIGHTS_FAIL_94",ACCESS_CONTROL,SEVERE_WARNING,94, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) extop expression value "%s" is invalid. A valid extop keyword expression value requires one or more valid extended operation request OID strings in the following format: oid [|| oid1] ... [|| oidN]
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVALID_TARGEXTOP_EXPRESSION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_TARGEXTOP_EXPRESSION_95",ACCESS_CONTROL,SEVERE_WARNING,95, getClassLoader());

  /**
   * Backend %s does not have a presence index defined for attribute type %s.  Access control initialization may take a very long time to complete in this backend
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_ACI_ATTRIBUTE_NOT_INDEXED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_ACI_ATTRIBUTE_NOT_INDEXED_96",ACCESS_CONTROL,SEVERE_WARNING,96, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) bind rule SSF expression "%s" failed to parse for the following reason: "%s"
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_ACI_SYNTAX_INVALID_SSF_FORMAT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_SSF_FORMAT_97",ACCESS_CONTROL,SEVERE_WARNING,97, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) bind rule ssf expression value "%s" is not in the valid range. A valid ssf value is in the range of 1 to 1024
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_ACI_SYNTAX_INVALID_SSF_RANGE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_SSF_RANGE_98",ACCESS_CONTROL,SEVERE_WARNING,98, getClassLoader());

  /**
   * The provided Access Control Instruction (ACI) bind rule timeofday expression "%s" failed to parse for the following reason: "%s"
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_ACI_SYNTAX_INVALID_TIMEOFDAY_FORMAT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_ACI_SYNTAX_INVALID_TIMEOFDAY_FORMAT_99",ACCESS_CONTROL,SEVERE_WARNING,99, getClassLoader());


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
            Class<?> c = Class.forName("org.opends.messages.AccessControlMessages");

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
      cl = AccessControlMessages.class.getClassLoader();
    }
    return cl;
  }
}
