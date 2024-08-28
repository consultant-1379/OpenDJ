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
public final class ProtocolMessages {

  /** Base property for resource bundle containing messages */
  private static final String BASE = "messages/protocol";

  private static ClassLoader webstartClassLoader;

  // Prevent instantiation.
  private ProtocolMessages() {
    // Do nothing.
  }

  /**
   * Cannot decode the ASN.1 element because an unexpected end of file was reached while reading the type byte
   */
  public static final MessageDescriptor.Arg0 ERR_ASN1_TRUCATED_TYPE_BYTE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_ASN1_TRUCATED_TYPE_BYTE_1",PROTOCOL,MILD_ERROR,1, getClassLoader());

  /**
   * Cannot decode the ASN.1 element because an unexpected end of file was reached while reading the first length byte
   */
  public static final MessageDescriptor.Arg0 ERR_ASN1_TRUNCATED_LENGTH_BYTE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_ASN1_TRUNCATED_LENGTH_BYTE_2",PROTOCOL,MILD_ERROR,2, getClassLoader());

  /**
   * Cannot decode the ASN.1 element because it contained a multi-byte length with an invalid number of bytes (%d)
   */
  public static final MessageDescriptor.Arg1<Number> ERR_ASN1_INVALID_NUM_LENGTH_BYTES =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_ASN1_INVALID_NUM_LENGTH_BYTES_3",PROTOCOL,MILD_ERROR,3, getClassLoader());

  /**
   * Cannot decode the ASN.1 element because an unexpected end of file was reached while reading a multi-byte length of %d bytes
   */
  public static final MessageDescriptor.Arg1<Number> ERR_ASN1_TRUNCATED_LENGTH_BYTES =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_ASN1_TRUNCATED_LENGTH_BYTES_4",PROTOCOL,MILD_ERROR,4, getClassLoader());

  /**
   * Cannot decode the ASN.1 boolean element of because an unexpected end of file was reached while reading value bytes (%d)
   */
  public static final MessageDescriptor.Arg1<Number> ERR_ASN1_BOOLEAN_TRUNCATED_VALUE =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_ASN1_BOOLEAN_TRUNCATED_VALUE_5",PROTOCOL,MILD_ERROR,5, getClassLoader());

  /**
   * Cannot decode the ASN.1 boolean element because the decoded value length was not exactly one byte (decoded length was %d)
   */
  public static final MessageDescriptor.Arg1<Number> ERR_ASN1_BOOLEAN_INVALID_LENGTH =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_ASN1_BOOLEAN_INVALID_LENGTH_6",PROTOCOL,MILD_ERROR,6, getClassLoader());

  /**
   * Cannot decode the ASN.1 null element of because an unexpected end of file was reached while reading value bytes (%d)
   */
  public static final MessageDescriptor.Arg1<Number> ERR_ASN1_NULL_TRUNCATED_VALUE =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_ASN1_NULL_TRUNCATED_VALUE_7",PROTOCOL,MILD_ERROR,7, getClassLoader());

  /**
   * Cannot decode the ASN.1 null element because the decoded value length was not exactly zero bytes (decoded length was %d)
   */
  public static final MessageDescriptor.Arg1<Number> ERR_ASN1_NULL_INVALID_LENGTH =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_ASN1_NULL_INVALID_LENGTH_8",PROTOCOL,MILD_ERROR,8, getClassLoader());

  /**
   * Cannot decode the ASN.1 octet string element of because an unexpected end of file was reached while reading value bytes (%d)
   */
  public static final MessageDescriptor.Arg1<Number> ERR_ASN1_OCTET_STRING_TRUNCATED_VALUE =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_ASN1_OCTET_STRING_TRUNCATED_VALUE_9",PROTOCOL,MILD_ERROR,9, getClassLoader());

  /**
   * Cannot decode the ASN.1 integer element of because an unexpected end of file was reached while reading value bytes (%d)
   */
  public static final MessageDescriptor.Arg1<Number> ERR_ASN1_INTEGER_TRUNCATED_VALUE =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_ASN1_INTEGER_TRUNCATED_VALUE_10",PROTOCOL,MILD_ERROR,10, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 integer element because the length of the element value was not between one and four bytes (actual length was %d)
   */
  public static final MessageDescriptor.Arg1<Number> ERR_ASN1_INTEGER_INVALID_LENGTH =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_ASN1_INTEGER_INVALID_LENGTH_11",PROTOCOL,MILD_ERROR,11, getClassLoader());

  /**
   * Cannot decode the end of the ASN.1 sequence or set because the start of the sequence was not read
   */
  public static final MessageDescriptor.Arg0 ERR_ASN1_SEQUENCE_READ_NOT_STARTED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_ASN1_SEQUENCE_READ_NOT_STARTED_12",PROTOCOL,MILD_ERROR,12, getClassLoader());

  /**
   * Cannot decode the end of the ASN.1 sequence or set because %d bytes are not read from the sequence of %d bytes in length
   */
  public static final MessageDescriptor.Arg2<Number,Number> ERR_ASN1_SEQUENCE_READ_NOT_ENDED =
          new MessageDescriptor.Arg2<Number,Number>(BASE,"MILD_ERR_ASN1_SEQUENCE_READ_NOT_ENDED_13",PROTOCOL,MILD_ERROR,13, getClassLoader());

  /**
   * Cannot skip the ASN.1 element of because an unexpected end of file was reached while reading value bytes (%d)
   */
  public static final MessageDescriptor.Arg1<Number> ERR_ASN1_SKIP_TRUNCATED_VALUE =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_ASN1_SKIP_TRUNCATED_VALUE_14",PROTOCOL,MILD_ERROR,14, getClassLoader());

  /**
   * Cannot decode the ASN.1 sequence or set element of because an unexpected end of file was reached while reading value bytes (%d)
   */
  public static final MessageDescriptor.Arg1<Number> ERR_ASN1_SEQUENCE_SET_TRUNCATED_VALUE =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_ASN1_SEQUENCE_SET_TRUNCATED_VALUE_15",PROTOCOL,MILD_ERROR,15, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 sequence as an LDAP message because the sequence was null
   */
  public static final MessageDescriptor.Arg0 ERR_LDAP_MESSAGE_DECODE_NULL =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_LDAP_MESSAGE_DECODE_NULL_45",PROTOCOL,MILD_ERROR,45, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 sequence as an LDAP message because the sequence contained an invalid number of elements (expected 2 or 3, got %d)
   */
  public static final MessageDescriptor.Arg1<Number> ERR_LDAP_MESSAGE_DECODE_INVALID_ELEMENT_COUNT =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_LDAP_MESSAGE_DECODE_INVALID_ELEMENT_COUNT_46",PROTOCOL,MILD_ERROR,46, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 sequence as an LDAP message because the first element of the sequence could not be decoded as an integer message ID:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_MESSAGE_DECODE_MESSAGE_ID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_MESSAGE_DECODE_MESSAGE_ID_47",PROTOCOL,MILD_ERROR,47, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 sequence as an LDAP message because the second element of the sequence could not be decoded as the protocol op:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_MESSAGE_DECODE_PROTOCOL_OP =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_MESSAGE_DECODE_PROTOCOL_OP_48",PROTOCOL,MILD_ERROR,48, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 sequence as an LDAP message because the third element of the sequence could not be decoded as the set of controls:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_MESSAGE_DECODE_CONTROLS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_MESSAGE_DECODE_CONTROLS_49",PROTOCOL,MILD_ERROR,49, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP control because the element was null
   */
  public static final MessageDescriptor.Arg0 ERR_LDAP_CONTROL_DECODE_NULL =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_LDAP_CONTROL_DECODE_NULL_50",PROTOCOL,MILD_ERROR,50, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP control because the element could not be decoded as a sequence:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_CONTROL_DECODE_SEQUENCE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_CONTROL_DECODE_SEQUENCE_51",PROTOCOL,MILD_ERROR,51, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP control because the control sequence contained an invalid number of elements (expected 1 to 3, got %d)
   */
  public static final MessageDescriptor.Arg1<Number> ERR_LDAP_CONTROL_DECODE_INVALID_ELEMENT_COUNT =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_LDAP_CONTROL_DECODE_INVALID_ELEMENT_COUNT_52",PROTOCOL,MILD_ERROR,52, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP control because the OID could not be decoded as a string:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_CONTROL_DECODE_OID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_CONTROL_DECODE_OID_53",PROTOCOL,MILD_ERROR,53, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP control because the criticality could not be decoded as Boolean value:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_CONTROL_DECODE_CRITICALITY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_CONTROL_DECODE_CRITICALITY_54",PROTOCOL,MILD_ERROR,54, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP control because the value could not be decoded as an octet string:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_CONTROL_DECODE_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_CONTROL_DECODE_VALUE_55",PROTOCOL,MILD_ERROR,55, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP control because the BER type for the second element in the sequence was invalid (expected 01 or 04, got %x)
   */
  public static final MessageDescriptor.Arg1<Number> ERR_LDAP_CONTROL_DECODE_INVALID_TYPE =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_LDAP_CONTROL_DECODE_INVALID_TYPE_56",PROTOCOL,MILD_ERROR,56, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as a set of LDAP controls because the element was null
   */
  public static final MessageDescriptor.Arg0 ERR_LDAP_CONTROL_DECODE_CONTROLS_NULL =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_LDAP_CONTROL_DECODE_CONTROLS_NULL_57",PROTOCOL,MILD_ERROR,57, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as a set of LDAP controls because the element could not be decoded as a sequence:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_CONTROL_DECODE_CONTROLS_SEQUENCE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_CONTROL_DECODE_CONTROLS_SEQUENCE_58",PROTOCOL,MILD_ERROR,58, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP abandon request protocol op because a problem occurred while trying to obtain the message ID of the operation to abandon:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_ABANDON_REQUEST_DECODE_ID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_ABANDON_REQUEST_DECODE_ID_59",PROTOCOL,MILD_ERROR,59, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP result protocol op because a problem occurred while trying to parse the result sequence:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_RESULT_DECODE_SEQUENCE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_RESULT_DECODE_SEQUENCE_60",PROTOCOL,MILD_ERROR,60, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP result protocol op because the result sequence did not contain a valid number of elements (expected 3 or 4, got %d)
   */
  public static final MessageDescriptor.Arg1<Number> ERR_LDAP_RESULT_DECODE_INVALID_ELEMENT_COUNT =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_LDAP_RESULT_DECODE_INVALID_ELEMENT_COUNT_61",PROTOCOL,MILD_ERROR,61, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP result protocol op because the first element in the result sequence could not be decoded as an integer result code:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_RESULT_DECODE_RESULT_CODE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_RESULT_DECODE_RESULT_CODE_62",PROTOCOL,MILD_ERROR,62, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP result protocol op because the second element in the result sequence could not be decoded as the matched DN:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_RESULT_DECODE_MATCHED_DN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_RESULT_DECODE_MATCHED_DN_63",PROTOCOL,MILD_ERROR,63, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP result protocol op because the third element in the result sequence could not be decoded as the error message:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_RESULT_DECODE_ERROR_MESSAGE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_RESULT_DECODE_ERROR_MESSAGE_64",PROTOCOL,MILD_ERROR,64, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP result protocol op because the fourth element in the result sequence could not be decoded as a set of referral URLs:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_RESULT_DECODE_REFERRALS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_RESULT_DECODE_REFERRALS_65",PROTOCOL,MILD_ERROR,65, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP bind response protocol op because the result sequence did not contain a valid number of elements (expected 3 to 5, got %d)
   */
  public static final MessageDescriptor.Arg1<Number> ERR_LDAP_BIND_RESULT_DECODE_INVALID_ELEMENT_COUNT =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_LDAP_BIND_RESULT_DECODE_INVALID_ELEMENT_COUNT_66",PROTOCOL,MILD_ERROR,66, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP bind response protocol op because the final element in the result sequence could not be decoded as the server SASL credentials:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_BIND_RESULT_DECODE_SERVER_SASL_CREDENTIALS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_BIND_RESULT_DECODE_SERVER_SASL_CREDENTIALS_67",PROTOCOL,MILD_ERROR,67, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP bind response protocol op because the BER type for the fourth element in the sequence was invalid (expected A3 or 87, got %x)
   */
  public static final MessageDescriptor.Arg1<Number> ERR_LDAP_BIND_RESULT_DECODE_INVALID_TYPE =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_LDAP_BIND_RESULT_DECODE_INVALID_TYPE_68",PROTOCOL,MILD_ERROR,68, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP bind response protocol op because the result sequence did not contain a valid number of elements (expected 3 to 6, got %d)
   */
  public static final MessageDescriptor.Arg1<Number> ERR_LDAP_EXTENDED_RESULT_DECODE_INVALID_ELEMENT_COUNT =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_LDAP_EXTENDED_RESULT_DECODE_INVALID_ELEMENT_COUNT_69",PROTOCOL,MILD_ERROR,69, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP bind response protocol op because the set of referral URLs could not be decoded:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_EXTENDED_RESULT_DECODE_REFERRALS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_EXTENDED_RESULT_DECODE_REFERRALS_70",PROTOCOL,MILD_ERROR,70, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP bind response protocol op because the response OID could not be decoded:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_EXTENDED_RESULT_DECODE_OID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_EXTENDED_RESULT_DECODE_OID_71",PROTOCOL,MILD_ERROR,71, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP bind response protocol op because the response value could not be decoded:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_EXTENDED_RESULT_DECODE_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_EXTENDED_RESULT_DECODE_VALUE_72",PROTOCOL,MILD_ERROR,72, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP extended response protocol op because one of the elements it contained had an invalid BER type (expected A3, 8A, or 8B, got %x)
   */
  public static final MessageDescriptor.Arg1<Number> ERR_LDAP_EXTENDED_RESULT_DECODE_INVALID_TYPE =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_LDAP_EXTENDED_RESULT_DECODE_INVALID_TYPE_73",PROTOCOL,MILD_ERROR,73, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP unbind request protocol op:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_UNBIND_DECODE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_UNBIND_DECODE_74",PROTOCOL,MILD_ERROR,74, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP bind request protocol op because the element could not be decoded as a sequence:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_BIND_REQUEST_DECODE_SEQUENCE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_BIND_REQUEST_DECODE_SEQUENCE_75",PROTOCOL,MILD_ERROR,75, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP bind request protocol op because the request sequence had an invalid number of elements (expected 3, got %d)
   */
  public static final MessageDescriptor.Arg1<Number> ERR_LDAP_BIND_REQUEST_DECODE_INVALID_ELEMENT_COUNT =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_LDAP_BIND_REQUEST_DECODE_INVALID_ELEMENT_COUNT_76",PROTOCOL,MILD_ERROR,76, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP bind request protocol op because the protocol version could not be decoded as an integer:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_BIND_REQUEST_DECODE_VERSION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_BIND_REQUEST_DECODE_VERSION_77",PROTOCOL,MILD_ERROR,77, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP bind request protocol op because the bind DN could not be properly decoded:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_BIND_REQUEST_DECODE_DN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_BIND_REQUEST_DECODE_DN_78",PROTOCOL,MILD_ERROR,78, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP bind request protocol op because the password to use for simple authentication could not be decoded:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_BIND_REQUEST_DECODE_PASSWORD =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_BIND_REQUEST_DECODE_PASSWORD_79",PROTOCOL,MILD_ERROR,79, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP bind request protocol op because the SASL authentication information could not be decoded:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_BIND_REQUEST_DECODE_SASL_INFO =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_BIND_REQUEST_DECODE_SASL_INFO_80",PROTOCOL,MILD_ERROR,80, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP bind request protocol op because the authentication info element had an invalid BER type (expected 80 or A3, got %x)
   */
  public static final MessageDescriptor.Arg1<Number> ERR_LDAP_BIND_REQUEST_DECODE_INVALID_CRED_TYPE =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_LDAP_BIND_REQUEST_DECODE_INVALID_CRED_TYPE_81",PROTOCOL,MILD_ERROR,81, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP bind request protocol op because an unexpected error occurred while trying to decode the authentication info element:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_BIND_REQUEST_DECODE_CREDENTIALS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_BIND_REQUEST_DECODE_CREDENTIALS_82",PROTOCOL,MILD_ERROR,82, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP compare request protocol op because the element could not be decoded as a sequence:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_COMPARE_REQUEST_DECODE_SEQUENCE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_COMPARE_REQUEST_DECODE_SEQUENCE_83",PROTOCOL,MILD_ERROR,83, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP compare request protocol op because the request sequence had an invalid number of elements (expected 2, got %d)
   */
  public static final MessageDescriptor.Arg1<Number> ERR_LDAP_COMPARE_REQUEST_DECODE_INVALID_ELEMENT_COUNT =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_LDAP_COMPARE_REQUEST_DECODE_INVALID_ELEMENT_COUNT_84",PROTOCOL,MILD_ERROR,84, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP compare request protocol op because the target DN could not be properly decoded:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_COMPARE_REQUEST_DECODE_DN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_COMPARE_REQUEST_DECODE_DN_85",PROTOCOL,MILD_ERROR,85, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP compare request protocol op because the attribute value assertion could not be decoded as a sequence:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_COMPARE_REQUEST_DECODE_AVA =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_COMPARE_REQUEST_DECODE_AVA_86",PROTOCOL,MILD_ERROR,86, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP compare request protocol op because the attribute value assertion sequence had an invalid number of elements (expected 2, got %d)
   */
  public static final MessageDescriptor.Arg1<Number> ERR_LDAP_COMPARE_REQUEST_DECODE_AVA_COUNT =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_LDAP_COMPARE_REQUEST_DECODE_AVA_COUNT_87",PROTOCOL,MILD_ERROR,87, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP compare request protocol op because the attribute type could not be properly decoded:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_COMPARE_REQUEST_DECODE_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_COMPARE_REQUEST_DECODE_TYPE_88",PROTOCOL,MILD_ERROR,88, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP compare request protocol op because the assertion value could not be properly decoded:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_COMPARE_REQUEST_DECODE_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_COMPARE_REQUEST_DECODE_VALUE_89",PROTOCOL,MILD_ERROR,89, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP delete request protocol op because the target DN could not be properly decoded:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_DELETE_REQUEST_DECODE_DN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_DELETE_REQUEST_DECODE_DN_90",PROTOCOL,MILD_ERROR,90, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP extended request protocol op because the element could not be decoded as a sequence:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_EXTENDED_REQUEST_DECODE_SEQUENCE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_EXTENDED_REQUEST_DECODE_SEQUENCE_91",PROTOCOL,MILD_ERROR,91, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP extended request protocol op because the request sequence had an invalid number of elements (expected 1 or 2, got %d)
   */
  public static final MessageDescriptor.Arg1<Number> ERR_LDAP_EXTENDED_REQUEST_DECODE_INVALID_ELEMENT_COUNT =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_LDAP_EXTENDED_REQUEST_DECODE_INVALID_ELEMENT_COUNT_92",PROTOCOL,MILD_ERROR,92, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP extended request protocol op because the OID could not be properly decoded:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_EXTENDED_REQUEST_DECODE_OID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_EXTENDED_REQUEST_DECODE_OID_93",PROTOCOL,MILD_ERROR,93, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP extended request protocol op because the value could not be properly decoded:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_EXTENDED_REQUEST_DECODE_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_EXTENDED_REQUEST_DECODE_VALUE_94",PROTOCOL,MILD_ERROR,94, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP modify DN request protocol op because the element could not be decoded as a sequence:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_MODIFY_DN_REQUEST_DECODE_SEQUENCE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_MODIFY_DN_REQUEST_DECODE_SEQUENCE_95",PROTOCOL,MILD_ERROR,95, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP modify DN request protocol op because the request sequence had an invalid number of elements (expected 3 or 4, got %d)
   */
  public static final MessageDescriptor.Arg1<Number> ERR_LDAP_MODIFY_DN_REQUEST_DECODE_INVALID_ELEMENT_COUNT =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_LDAP_MODIFY_DN_REQUEST_DECODE_INVALID_ELEMENT_COUNT_96",PROTOCOL,MILD_ERROR,96, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP modify DN request protocol op because the entry DN could not be properly decoded:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_MODIFY_DN_REQUEST_DECODE_DN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_MODIFY_DN_REQUEST_DECODE_DN_97",PROTOCOL,MILD_ERROR,97, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP modify DN request protocol op because the new RDN could not be properly decoded:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_MODIFY_DN_REQUEST_DECODE_NEW_RDN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_MODIFY_DN_REQUEST_DECODE_NEW_RDN_98",PROTOCOL,MILD_ERROR,98, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP modify DN request protocol op because the deleteOldRDN flag could not be properly decoded:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_MODIFY_DN_REQUEST_DECODE_DELETE_OLD_RDN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_MODIFY_DN_REQUEST_DECODE_DELETE_OLD_RDN_99",PROTOCOL,MILD_ERROR,99, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP modify DN request protocol op because the new superior DN could not be properly decoded:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_MODIFY_DN_REQUEST_DECODE_NEW_SUPERIOR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_MODIFY_DN_REQUEST_DECODE_NEW_SUPERIOR_100",PROTOCOL,MILD_ERROR,100, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP attribute because the element could not be decoded as a sequence:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_ATTRIBUTE_DECODE_SEQUENCE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_ATTRIBUTE_DECODE_SEQUENCE_101",PROTOCOL,MILD_ERROR,101, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP attribute because the request sequence had an invalid number of elements (expected 2, got %d)
   */
  public static final MessageDescriptor.Arg1<Number> ERR_LDAP_ATTRIBUTE_DECODE_INVALID_ELEMENT_COUNT =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_LDAP_ATTRIBUTE_DECODE_INVALID_ELEMENT_COUNT_102",PROTOCOL,MILD_ERROR,102, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP attribute because the attribute type could not be decoded: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_ATTRIBUTE_DECODE_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_ATTRIBUTE_DECODE_TYPE_103",PROTOCOL,MILD_ERROR,103, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP attribute because the set of values could not be decoded: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_ATTRIBUTE_DECODE_VALUES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_ATTRIBUTE_DECODE_VALUES_104",PROTOCOL,MILD_ERROR,104, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP add request protocol op because the element could not be decoded as a sequence:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_ADD_REQUEST_DECODE_SEQUENCE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_ADD_REQUEST_DECODE_SEQUENCE_105",PROTOCOL,MILD_ERROR,105, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP add request protocol op because the request sequence had an invalid number of elements (expected 2, got %d)
   */
  public static final MessageDescriptor.Arg1<Number> ERR_LDAP_ADD_REQUEST_DECODE_INVALID_ELEMENT_COUNT =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_LDAP_ADD_REQUEST_DECODE_INVALID_ELEMENT_COUNT_106",PROTOCOL,MILD_ERROR,106, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP add request protocol op because the entry DN could not be decoded:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_ADD_REQUEST_DECODE_DN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_ADD_REQUEST_DECODE_DN_107",PROTOCOL,MILD_ERROR,107, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP add request protocol op because the set of attributes could not be decoded:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_ADD_REQUEST_DECODE_ATTRS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_ADD_REQUEST_DECODE_ATTRS_108",PROTOCOL,MILD_ERROR,108, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP modification because the element could not be decoded as a sequence:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_MODIFICATION_DECODE_SEQUENCE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_MODIFICATION_DECODE_SEQUENCE_109",PROTOCOL,MILD_ERROR,109, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP modification because the request sequence had an invalid number of elements (expected 2, got %d)
   */
  public static final MessageDescriptor.Arg1<Number> ERR_LDAP_MODIFICATION_DECODE_INVALID_ELEMENT_COUNT =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_LDAP_MODIFICATION_DECODE_INVALID_ELEMENT_COUNT_110",PROTOCOL,MILD_ERROR,110, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP modification because it contained an invalid modification type (%d)
   */
  public static final MessageDescriptor.Arg1<Number> ERR_LDAP_MODIFICATION_DECODE_INVALID_MOD_TYPE =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_LDAP_MODIFICATION_DECODE_INVALID_MOD_TYPE_111",PROTOCOL,MILD_ERROR,111, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP modification because the modification type could not be decoded:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_MODIFICATION_DECODE_MOD_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_MODIFICATION_DECODE_MOD_TYPE_112",PROTOCOL,MILD_ERROR,112, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP modification because the attribute could not be decoded: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_MODIFICATION_DECODE_ATTR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_MODIFICATION_DECODE_ATTR_113",PROTOCOL,MILD_ERROR,113, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP modify request protocol op because the element could not be decoded as a sequence:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_MODIFY_REQUEST_DECODE_SEQUENCE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_MODIFY_REQUEST_DECODE_SEQUENCE_114",PROTOCOL,MILD_ERROR,114, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP modify request protocol op because the request sequence had an invalid number of elements (expected 2, got %d)
   */
  public static final MessageDescriptor.Arg1<Number> ERR_LDAP_MODIFY_REQUEST_DECODE_INVALID_ELEMENT_COUNT =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_LDAP_MODIFY_REQUEST_DECODE_INVALID_ELEMENT_COUNT_115",PROTOCOL,MILD_ERROR,115, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP modify request protocol op because the entry DN could not be decoded:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_MODIFY_REQUEST_DECODE_DN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_MODIFY_REQUEST_DECODE_DN_116",PROTOCOL,MILD_ERROR,116, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP modify request protocol op because the set of modifications could not be decoded:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_MODIFY_REQUEST_DECODE_MODS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_MODIFY_REQUEST_DECODE_MODS_117",PROTOCOL,MILD_ERROR,117, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP search result entry protocol op because the element could not be decoded as a sequence:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_SEARCH_ENTRY_DECODE_SEQUENCE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_SEARCH_ENTRY_DECODE_SEQUENCE_118",PROTOCOL,MILD_ERROR,118, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP search result entry protocol op because the request sequence had an invalid number of elements (expected 2, got %d)
   */
  public static final MessageDescriptor.Arg1<Number> ERR_LDAP_SEARCH_ENTRY_DECODE_INVALID_ELEMENT_COUNT =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_LDAP_SEARCH_ENTRY_DECODE_INVALID_ELEMENT_COUNT_119",PROTOCOL,MILD_ERROR,119, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP search result entry protocol op because the entry DN could not be decoded:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_SEARCH_ENTRY_DECODE_DN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_SEARCH_ENTRY_DECODE_DN_120",PROTOCOL,MILD_ERROR,120, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP search result entry protocol op because the set of attributes could not be decoded:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_SEARCH_ENTRY_DECODE_ATTRS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_SEARCH_ENTRY_DECODE_ATTRS_121",PROTOCOL,MILD_ERROR,121, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP search result reference protocol op because the element could not be decoded as a sequence:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_SEARCH_REFERENCE_DECODE_SEQUENCE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_SEARCH_REFERENCE_DECODE_SEQUENCE_122",PROTOCOL,MILD_ERROR,122, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP search result reference protocol op because a problem occurred while trying to decode the sequence elements as referral URLs:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_SEARCH_REFERENCE_DECODE_URLS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_SEARCH_REFERENCE_DECODE_URLS_123",PROTOCOL,MILD_ERROR,123, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP search request protocol op because the element could not be decoded as a sequence:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_SEARCH_REQUEST_DECODE_SEQUENCE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_SEARCH_REQUEST_DECODE_SEQUENCE_124",PROTOCOL,MILD_ERROR,124, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP search request protocol op because the request sequence had an invalid number of elements (expected 8, got %d)
   */
  public static final MessageDescriptor.Arg1<Number> ERR_LDAP_SEARCH_REQUEST_DECODE_INVALID_ELEMENT_COUNT =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_LDAP_SEARCH_REQUEST_DECODE_INVALID_ELEMENT_COUNT_125",PROTOCOL,MILD_ERROR,125, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP search request protocol op because the base DN could not be decoded:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_SEARCH_REQUEST_DECODE_BASE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_SEARCH_REQUEST_DECODE_BASE_126",PROTOCOL,MILD_ERROR,126, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP search request protocol op because the provided scope value (%d) is invalid
   */
  public static final MessageDescriptor.Arg1<Number> ERR_LDAP_SEARCH_REQUEST_DECODE_INVALID_SCOPE =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_LDAP_SEARCH_REQUEST_DECODE_INVALID_SCOPE_127",PROTOCOL,MILD_ERROR,127, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP search request protocol op because the scope could not be decoded:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_SEARCH_REQUEST_DECODE_SCOPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_SEARCH_REQUEST_DECODE_SCOPE_128",PROTOCOL,MILD_ERROR,128, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP search request protocol op because the provided alias dereferencing policy value (%d) is invalid
   */
  public static final MessageDescriptor.Arg1<Number> ERR_LDAP_SEARCH_REQUEST_DECODE_INVALID_DEREF =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_LDAP_SEARCH_REQUEST_DECODE_INVALID_DEREF_129",PROTOCOL,MILD_ERROR,129, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP search request protocol op because the alias dereferencing policy could not be decoded:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_SEARCH_REQUEST_DECODE_DEREF =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_SEARCH_REQUEST_DECODE_DEREF_130",PROTOCOL,MILD_ERROR,130, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP search request protocol op because the size limit could not be decoded:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_SEARCH_REQUEST_DECODE_SIZE_LIMIT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_SEARCH_REQUEST_DECODE_SIZE_LIMIT_131",PROTOCOL,MILD_ERROR,131, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP search request protocol op because the time limit could not be decoded:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_SEARCH_REQUEST_DECODE_TIME_LIMIT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_SEARCH_REQUEST_DECODE_TIME_LIMIT_132",PROTOCOL,MILD_ERROR,132, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP search request protocol op because the typesOnly flag could not be decoded:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_SEARCH_REQUEST_DECODE_TYPES_ONLY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_SEARCH_REQUEST_DECODE_TYPES_ONLY_133",PROTOCOL,MILD_ERROR,133, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP search request protocol op because the filter could not be decoded:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_SEARCH_REQUEST_DECODE_FILTER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_SEARCH_REQUEST_DECODE_FILTER_134",PROTOCOL,MILD_ERROR,134, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP search request protocol op because the requested attribute set could not be decoded:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_SEARCH_REQUEST_DECODE_ATTRIBUTES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_SEARCH_REQUEST_DECODE_ATTRIBUTES_135",PROTOCOL,MILD_ERROR,135, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP protocol op because the element was null
   */
  public static final MessageDescriptor.Arg0 ERR_LDAP_PROTOCOL_OP_DECODE_NULL =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_LDAP_PROTOCOL_OP_DECODE_NULL_136",PROTOCOL,MILD_ERROR,136, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP protocol op because the element had an invalid BER type (%x) for an LDAP protocol op
   */
  public static final MessageDescriptor.Arg1<Number> ERR_LDAP_PROTOCOL_OP_DECODE_INVALID_TYPE =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_LDAP_PROTOCOL_OP_DECODE_INVALID_TYPE_137",PROTOCOL,MILD_ERROR,137, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP search filter because the element was null
   */
  public static final MessageDescriptor.Arg0 ERR_LDAP_FILTER_DECODE_NULL =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_LDAP_FILTER_DECODE_NULL_138",PROTOCOL,MILD_ERROR,138, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP search filter because the element had an invalid BER type (%x) for a search filter
   */
  public static final MessageDescriptor.Arg1<Number> ERR_LDAP_FILTER_DECODE_INVALID_TYPE =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_LDAP_FILTER_DECODE_INVALID_TYPE_139",PROTOCOL,MILD_ERROR,139, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP search filter because the compound filter set could not be decoded:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_FILTER_DECODE_COMPOUND_SET =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_FILTER_DECODE_COMPOUND_SET_140",PROTOCOL,MILD_ERROR,140, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP search filter because an unexpected error occurred while trying to decode one of the compound filter components:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_FILTER_DECODE_COMPOUND_COMPONENTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_FILTER_DECODE_COMPOUND_COMPONENTS_141",PROTOCOL,MILD_ERROR,141, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP search filter because the value of the element cannot itself be decoded as an ASN.1 element for a NOT filter component:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_FILTER_DECODE_NOT_ELEMENT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_FILTER_DECODE_NOT_ELEMENT_142",PROTOCOL,MILD_ERROR,142, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP search filter because the NOT component element could not be decoded as an LDAP filter:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_FILTER_DECODE_NOT_COMPONENT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_FILTER_DECODE_NOT_COMPONENT_143",PROTOCOL,MILD_ERROR,143, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP search filter because the element could not be decoded as a type-and-value sequence:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_FILTER_DECODE_TV_SEQUENCE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_FILTER_DECODE_TV_SEQUENCE_144",PROTOCOL,MILD_ERROR,144, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP search filter because the type-and-value sequence had an invalid number of elements (expected 2, got %d)
   */
  public static final MessageDescriptor.Arg1<Number> ERR_LDAP_FILTER_DECODE_TV_INVALID_ELEMENT_COUNT =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_LDAP_FILTER_DECODE_TV_INVALID_ELEMENT_COUNT_145",PROTOCOL,MILD_ERROR,145, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP search filter because the attribute type could not be decoded from the type-and-value sequence:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_FILTER_DECODE_TV_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_FILTER_DECODE_TV_TYPE_146",PROTOCOL,MILD_ERROR,146, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP search filter because the assertion value could not be decoded from the type-and-value sequence:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_FILTER_DECODE_TV_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_FILTER_DECODE_TV_VALUE_147",PROTOCOL,MILD_ERROR,147, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP search filter because the element could not be decoded as a substring sequence:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_FILTER_DECODE_SUBSTRING_SEQUENCE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_FILTER_DECODE_SUBSTRING_SEQUENCE_148",PROTOCOL,MILD_ERROR,148, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP search filter because the substring sequence had an invalid number of elements (expected 2, got %d)
   */
  public static final MessageDescriptor.Arg1<Number> ERR_LDAP_FILTER_DECODE_SUBSTRING_INVALID_ELEMENT_COUNT =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_LDAP_FILTER_DECODE_SUBSTRING_INVALID_ELEMENT_COUNT_149",PROTOCOL,MILD_ERROR,149, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP search filter because the attribute type could not be decoded from the substring sequence:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_FILTER_DECODE_SUBSTRING_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_FILTER_DECODE_SUBSTRING_TYPE_150",PROTOCOL,MILD_ERROR,150, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP search filter because the substring value sequence could not be decoded:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_FILTER_DECODE_SUBSTRING_ELEMENTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_FILTER_DECODE_SUBSTRING_ELEMENTS_151",PROTOCOL,MILD_ERROR,151, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP search filter because the substring value sequence did not contain any elements
   */
  public static final MessageDescriptor.Arg0 ERR_LDAP_FILTER_DECODE_SUBSTRING_NO_SUBELEMENTS =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_LDAP_FILTER_DECODE_SUBSTRING_NO_SUBELEMENTS_152",PROTOCOL,MILD_ERROR,152, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP search filter because the substring value sequence had an element with an invalid BER type (%x)
   */
  public static final MessageDescriptor.Arg1<Number> ERR_LDAP_FILTER_DECODE_SUBSTRING_INVALID_SUBTYPE =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_LDAP_FILTER_DECODE_SUBSTRING_INVALID_SUBTYPE_153",PROTOCOL,MILD_ERROR,153, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP search filter because a problem occurred while trying to parse the substring value elements:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_FILTER_DECODE_SUBSTRING_VALUES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_FILTER_DECODE_SUBSTRING_VALUES_154",PROTOCOL,MILD_ERROR,154, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP search filter because the element could not be decoded as the presence attribute type:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_FILTER_DECODE_PRESENCE_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_FILTER_DECODE_PRESENCE_TYPE_155",PROTOCOL,MILD_ERROR,155, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP search filter because the element could not be decoded as an extensible matching sequence:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_FILTER_DECODE_EXTENSIBLE_SEQUENCE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_FILTER_DECODE_EXTENSIBLE_SEQUENCE_156",PROTOCOL,MILD_ERROR,156, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP search filter because the extensible matching sequence had an element with an invalid BER type (%x)
   */
  public static final MessageDescriptor.Arg1<Number> ERR_LDAP_FILTER_DECODE_EXTENSIBLE_INVALID_TYPE =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_LDAP_FILTER_DECODE_EXTENSIBLE_INVALID_TYPE_157",PROTOCOL,MILD_ERROR,157, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP search filter because a problem occurred while trying to parse the extensible match sequence elements:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_FILTER_DECODE_EXTENSIBLE_ELEMENTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_FILTER_DECODE_EXTENSIBLE_ELEMENTS_158",PROTOCOL,MILD_ERROR,158, getClassLoader());

  /**
   * The server attempted to send a response to the %s operation (conn=%d, op=%d), but the operation did not have a result code.  This could indicate that the operation did not complete properly or that it is one that is not allowed to have a response. Using a generic 'Operations Error' response
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,Number> ERR_LDAP_CLIENT_SEND_RESPONSE_NO_RESULT_CODE =
          new MessageDescriptor.Arg3<CharSequence,Number,Number>(BASE,"MILD_ERR_LDAP_CLIENT_SEND_RESPONSE_NO_RESULT_CODE_159",PROTOCOL,MILD_ERROR,159, getClassLoader());

  /**
   * The server attempted to send a response to the %s operation (conn=%d, op=%d), but this type of operation is not allowed to have responses.  Backtrace:  %s
   */
  public static final MessageDescriptor.Arg4<CharSequence,Number,Number,CharSequence> ERR_LDAP_CLIENT_SEND_RESPONSE_INVALID_OP =
          new MessageDescriptor.Arg4<CharSequence,Number,Number,CharSequence>(BASE,"MILD_ERR_LDAP_CLIENT_SEND_RESPONSE_INVALID_OP_160",PROTOCOL,MILD_ERROR,160, getClassLoader());

  /**
   * The server was unable to encode the provided LDAP message %s (conn=%d, op=%d) into an ASN.1 element: %s
   */
  public static final MessageDescriptor.Arg4<CharSequence,Number,Number,CharSequence> ERR_LDAP_CLIENT_SEND_MESSAGE_ENCODE_ASN1 =
          new MessageDescriptor.Arg4<CharSequence,Number,Number,CharSequence>(BASE,"MILD_ERR_LDAP_CLIENT_SEND_MESSAGE_ENCODE_ASN1_161",PROTOCOL,MILD_ERROR,161, getClassLoader());

  /**
   * The server was unable to encode the ASN.1 element generated from LDAP message %s (conn=%d, op=%d) into a byte array:  %s
   */
  public static final MessageDescriptor.Arg4<CharSequence,Number,Number,CharSequence> ERR_LDAP_CLIENT_SEND_MESSAGE_ENCODE_BYTES =
          new MessageDescriptor.Arg4<CharSequence,Number,Number,CharSequence>(BASE,"MILD_ERR_LDAP_CLIENT_SEND_MESSAGE_ENCODE_BYTES_162",PROTOCOL,MILD_ERROR,162, getClassLoader());

  /**
   * The server was unable to send the LDAP message %s (conn=%d, op=%d) to the client because an I/O problem was encountered:  %s
   */
  public static final MessageDescriptor.Arg4<CharSequence,Number,Number,CharSequence> ERR_LDAP_CLIENT_SEND_MESSAGE_IO_PROBLEM =
          new MessageDescriptor.Arg4<CharSequence,Number,Number,CharSequence>(BASE,"MILD_ERR_LDAP_CLIENT_SEND_MESSAGE_IO_PROBLEM_163",PROTOCOL,MILD_ERROR,163, getClassLoader());

  /**
   * The server was unable to send the LDAP message %s (conn=%d, op=%d) to the client because an unexpected problem was encountered:  %s
   */
  public static final MessageDescriptor.Arg4<CharSequence,Number,Number,CharSequence> ERR_LDAP_CLIENT_SEND_MESSAGE_UNEXPECTED_PROBLEM =
          new MessageDescriptor.Arg4<CharSequence,Number,Number,CharSequence>(BASE,"MILD_ERR_LDAP_CLIENT_SEND_MESSAGE_UNEXPECTED_PROBLEM_164",PROTOCOL,MILD_ERROR,164, getClassLoader());

  /**
   * The Directory Server is closing the connection to this client
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CLIENT_GENERIC_NOTICE_OF_DISCONNECTION =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CLIENT_GENERIC_NOTICE_OF_DISCONNECTION_165",PROTOCOL,INFORMATION,165, getClassLoader());

  /**
   * The Directory Server is currently in the process of closing this client connection
   */
  public static final MessageDescriptor.Arg0 WARN_LDAP_CLIENT_DISCONNECT_IN_PROGRESS =
          new MessageDescriptor.Arg0(BASE,"MILD_WARN_LDAP_CLIENT_DISCONNECT_IN_PROGRESS_166",PROTOCOL,MILD_WARNING,166, getClassLoader());

  /**
   * The client sent a request to the Directory Server that was an ASN.1 element with a zero-byte value.  This cannot possibly be a valid LDAP message
   */
  public static final MessageDescriptor.Arg0 ERR_LDAP_CLIENT_DECODE_ZERO_BYTE_VALUE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_LDAP_CLIENT_DECODE_ZERO_BYTE_VALUE_167",PROTOCOL,MILD_ERROR,167, getClassLoader());

  /**
   * The client sent a request to the Directory Server with an ASN.1 element value length of %d bytes.  This exceeds the maximum allowed request size of %d bytes, so processing cannot continue on this connection
   */
  public static final MessageDescriptor.Arg2<Number,Number> ERR_LDAP_CLIENT_DECODE_MAX_REQUEST_SIZE_EXCEEDED =
          new MessageDescriptor.Arg2<Number,Number>(BASE,"MILD_ERR_LDAP_CLIENT_DECODE_MAX_REQUEST_SIZE_EXCEEDED_168",PROTOCOL,MILD_ERROR,168, getClassLoader());

  /**
   * The client sent a request to the Directory Server with an ASN.1 element using multiple bytes to express the value length.  The request indicated that %d bytes were needed to express the length, but this exceeds the maximum allowed limit of four bytes
   */
  public static final MessageDescriptor.Arg1<Number> ERR_LDAP_CLIENT_DECODE_INVALID_MULTIBYTE_LENGTH =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_LDAP_CLIENT_DECODE_INVALID_MULTIBYTE_LENGTH_169",PROTOCOL,MILD_ERROR,169, getClassLoader());

  /**
   * The client sent a request to the Directory Server that could not be properly decoded as an ASN.1 element:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_CLIENT_DECODE_ASN1_FAILED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_CLIENT_DECODE_ASN1_FAILED_170",PROTOCOL,MILD_ERROR,170, getClassLoader());

  /**
   * The client sent a request to the Directory Server that could not be properly decoded as an LDAP message:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_CLIENT_DECODE_LDAP_MESSAGE_FAILED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_CLIENT_DECODE_LDAP_MESSAGE_FAILED_171",PROTOCOL,MILD_ERROR,171, getClassLoader());

  /**
   * An internal error has occurred within the Directory Server to cause it to lose track of where it is in decoding requests on this client connection.  It had an invalid decode state of %d, and this connection must be terminated
   */
  public static final MessageDescriptor.Arg1<Number> ERR_LDAP_CLIENT_INVALID_DECODE_STATE =
          new MessageDescriptor.Arg1<Number>(BASE,"SEVERE_ERR_LDAP_CLIENT_INVALID_DECODE_STATE_172",PROTOCOL,SEVERE_ERROR,172, getClassLoader());

  /**
   * The client sent an LDAP message to the Directory Server that was not a valid message for a client request:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_CLIENT_DECODE_INVALID_REQUEST_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_CLIENT_DECODE_INVALID_REQUEST_TYPE_173",PROTOCOL,MILD_ERROR,173, getClassLoader());

  /**
   * The Directory Server was unable to convert the LDAP message read from the client (%s) to an internal operation for processing:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAP_CLIENT_CANNOT_CONVERT_MESSAGE_TO_OPERATION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_LDAP_CLIENT_CANNOT_CONVERT_MESSAGE_TO_OPERATION_174",PROTOCOL,MILD_ERROR,174, getClassLoader());

  /**
   * Cannot convert the provided LDAP message (%s) to an abandon operation:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAP_ABANDON_INVALID_MESSAGE_TYPE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_LDAP_ABANDON_INVALID_MESSAGE_TYPE_175",PROTOCOL,MILD_ERROR,175, getClassLoader());

  /**
   * Cannot convert the provided LDAP message (%s) to an unbind operation:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAP_UNBIND_INVALID_MESSAGE_TYPE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_LDAP_UNBIND_INVALID_MESSAGE_TYPE_176",PROTOCOL,MILD_ERROR,176, getClassLoader());

  /**
   * The LDAP connection handler defined in configuration entry %s was unable to open a selector to allow it to multiplex the associated accept sockets:  %s.  This connection handler will be disabled
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAP_CONNHANDLER_OPEN_SELECTOR_FAILED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"FATAL_ERR_LDAP_CONNHANDLER_OPEN_SELECTOR_FAILED_177",PROTOCOL,FATAL_ERROR,177, getClassLoader());

  /**
   * The LDAP connection handler defined in configuration entry %s was unable to create a server socket channel to accept connections on %s:%d:  %s.  The Directory Server will not listen for new connections on that address
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,Number,CharSequence> ERR_LDAP_CONNHANDLER_CREATE_CHANNEL_FAILED =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,Number,CharSequence>(BASE,"SEVERE_ERR_LDAP_CONNHANDLER_CREATE_CHANNEL_FAILED_178",PROTOCOL,SEVERE_ERROR,178, getClassLoader());

  /**
   * The LDAP connection handler defined in configuration entry %s was unable to create any of the socket channels on any of the configured addresses.  This connection handler will be disabled
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_CONNHANDLER_NO_ACCEPTORS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"FATAL_ERR_LDAP_CONNHANDLER_NO_ACCEPTORS_179",PROTOCOL,FATAL_ERROR,179, getClassLoader());

  /**
   * The connection attempt from client %s to %s has been rejected because the client was included in one of the denied address ranges
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAP_CONNHANDLER_DENIED_CLIENT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_LDAP_CONNHANDLER_DENIED_CLIENT_180",PROTOCOL,MILD_ERROR,180, getClassLoader());

  /**
   * The connection attempt from client %s to %s has been rejected because the client was not included in one of the allowed address ranges
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAP_CONNHANDLER_DISALLOWED_CLIENT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_LDAP_CONNHANDLER_DISALLOWED_CLIENT_181",PROTOCOL,MILD_ERROR,181, getClassLoader());

  /**
   * An internal error prevented the Directory Server from properly registering the client connection from %s to %s with an appropriate request handler:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> INFO_LDAP_CONNHANDLER_UNABLE_TO_REGISTER_CLIENT =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"INFO_LDAP_CONNHANDLER_UNABLE_TO_REGISTER_CLIENT_182",PROTOCOL,INFORMATION,182, getClassLoader());

  /**
   * The LDAP connection handler defined in configuration entry %s was unable to accept a new client connection:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAP_CONNHANDLER_CANNOT_ACCEPT_CONNECTION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_LDAP_CONNHANDLER_CANNOT_ACCEPT_CONNECTION_183",PROTOCOL,MILD_ERROR,183, getClassLoader());

  /**
   * The LDAP connection handler defined in configuration entry %s has experienced consecutive failures while trying to accept client connections:  %s.  This connection handler will be disabled
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAP_CONNHANDLER_CONSECUTIVE_ACCEPT_FAILURES =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"FATAL_ERR_LDAP_CONNHANDLER_CONSECUTIVE_ACCEPT_FAILURES_184",PROTOCOL,FATAL_ERROR,184, getClassLoader());

  /**
   * The LDAP connection handler defined in configuration entry %s caught an unexpected error while trying to listen for new connections:  %s.  This connection handler will be disabled
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAP_CONNHANDLER_UNCAUGHT_ERROR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"FATAL_ERR_LDAP_CONNHANDLER_UNCAUGHT_ERROR_185",PROTOCOL,FATAL_ERROR,185, getClassLoader());

  /**
   * %s was unable to open a selector to multiplex reads from clients:  %s.  This request handler cannot continue processing
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAP_REQHANDLER_OPEN_SELECTOR_FAILED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"FATAL_ERR_LDAP_REQHANDLER_OPEN_SELECTOR_FAILED_186",PROTOCOL,FATAL_ERROR,186, getClassLoader());

  /**
   * %s was unable to register this client connection with the selector:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAP_REQHANDLER_CANNOT_REGISTER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"FATAL_ERR_LDAP_REQHANDLER_CANNOT_REGISTER_187",PROTOCOL,FATAL_ERROR,187, getClassLoader());

  /**
   * This connection could not be registered with a request handler because the Directory Server is shutting down
   */
  public static final MessageDescriptor.Arg0 ERR_LDAP_REQHANDLER_REJECT_DUE_TO_SHUTDOWN =
          new MessageDescriptor.Arg0(BASE,"FATAL_ERR_LDAP_REQHANDLER_REJECT_DUE_TO_SHUTDOWN_188",PROTOCOL,FATAL_ERROR,188, getClassLoader());

  /**
   * This connection could not be registered with a request handler because the pending queue associated with %s is too full
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_REQHANDLER_REJECT_DUE_TO_QUEUE_FULL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"FATAL_ERR_LDAP_REQHANDLER_REJECT_DUE_TO_QUEUE_FULL_189",PROTOCOL,FATAL_ERROR,189, getClassLoader());

  /**
   * This client connection is being deregistered from the associated request handler because the Directory Server is shutting down
   */
  public static final MessageDescriptor.Arg0 ERR_LDAP_REQHANDLER_DEREGISTER_DUE_TO_SHUTDOWN =
          new MessageDescriptor.Arg0(BASE,"FATAL_ERR_LDAP_REQHANDLER_DEREGISTER_DUE_TO_SHUTDOWN_190",PROTOCOL,FATAL_ERROR,190, getClassLoader());

  /**
   * Cannot decode the data read as an ASN.1 element because the decoded element length of %d bytes was larger than the maximum allowed element length of %d bytes.  The underlying input stream has been closed and this reader can no longer be used
   */
  public static final MessageDescriptor.Arg2<Number,Number> ERR_ASN1_READER_MAX_SIZE_EXCEEDED =
          new MessageDescriptor.Arg2<Number,Number>(BASE,"MILD_ERR_ASN1_READER_MAX_SIZE_EXCEEDED_191",PROTOCOL,MILD_ERROR,191, getClassLoader());

  /**
   * Cannot decode the provided string as an LDAP search filter because the string was null
   */
  public static final MessageDescriptor.Arg0 ERR_LDAP_FILTER_STRING_NULL =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_LDAP_FILTER_STRING_NULL_192",PROTOCOL,MILD_ERROR,192, getClassLoader());

  /**
   * Cannot decode the provided string %s as an LDAP search filter because an unexpected exception was thrown during processing:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAP_FILTER_UNCAUGHT_EXCEPTION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_LDAP_FILTER_UNCAUGHT_EXCEPTION_193",PROTOCOL,MILD_ERROR,193, getClassLoader());

  /**
   * The provided search filter "%s" had mismatched parentheses around the portion between positions %d and %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,Number> ERR_LDAP_FILTER_MISMATCHED_PARENTHESES =
          new MessageDescriptor.Arg3<CharSequence,Number,Number>(BASE,"MILD_ERR_LDAP_FILTER_MISMATCHED_PARENTHESES_194",PROTOCOL,MILD_ERROR,194, getClassLoader());

  /**
   * The provided search filter "%s" was missing an equal sign in the suspected simple filter component between positions %d and %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,Number> ERR_LDAP_FILTER_NO_EQUAL_SIGN =
          new MessageDescriptor.Arg3<CharSequence,Number,Number>(BASE,"MILD_ERR_LDAP_FILTER_NO_EQUAL_SIGN_195",PROTOCOL,MILD_ERROR,195, getClassLoader());

  /**
   * The provided search filter "%s" had an invalid escaped byte value at position %d.  A backslash in a value must be followed by two hexadecimal characters that define the byte that has been encoded
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_LDAP_FILTER_INVALID_ESCAPED_BYTE =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_ERR_LDAP_FILTER_INVALID_ESCAPED_BYTE_196",PROTOCOL,MILD_ERROR,196, getClassLoader());

  /**
   * The provided search filter "%s" could not be decoded because the compound filter between positions %d and %d did not start with an open parenthesis and end with a close parenthesis (they might be parentheses for different filter components)
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,Number> ERR_LDAP_FILTER_COMPOUND_MISSING_PARENTHESES =
          new MessageDescriptor.Arg3<CharSequence,Number,Number>(BASE,"MILD_ERR_LDAP_FILTER_COMPOUND_MISSING_PARENTHESES_197",PROTOCOL,MILD_ERROR,197, getClassLoader());

  /**
   * The provided search filter "%s" could not be decoded because the closing parenthesis at position %d did not have a corresponding open parenthesis
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_LDAP_FILTER_NO_CORRESPONDING_OPEN_PARENTHESIS =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_ERR_LDAP_FILTER_NO_CORRESPONDING_OPEN_PARENTHESIS_198",PROTOCOL,MILD_ERROR,198, getClassLoader());

  /**
   * The provided search filter "%s" could not be decoded because the opening parenthesis at position %d did not have a corresponding close parenthesis
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_LDAP_FILTER_NO_CORRESPONDING_CLOSE_PARENTHESIS =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_ERR_LDAP_FILTER_NO_CORRESPONDING_CLOSE_PARENTHESIS_199",PROTOCOL,MILD_ERROR,199, getClassLoader());

  /**
   * The provided search filter "%s" could not be decoded because the assumed substring filter value between positions %d and %d did not have any asterisk wildcard characters
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,Number> ERR_LDAP_FILTER_SUBSTRING_NO_ASTERISKS =
          new MessageDescriptor.Arg3<CharSequence,Number,Number>(BASE,"MILD_ERR_LDAP_FILTER_SUBSTRING_NO_ASTERISKS_200",PROTOCOL,MILD_ERROR,200, getClassLoader());

  /**
   * The provided search filter "%s" could not be decoded because the extensible match component starting at position %d did not have a colon to denote the end of the attribute type name
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_LDAP_FILTER_EXTENSIBLE_MATCH_NO_COLON =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_ERR_LDAP_FILTER_EXTENSIBLE_MATCH_NO_COLON_201",PROTOCOL,MILD_ERROR,201, getClassLoader());

  /**
   * Terminating this connection because the client sent an invalid message of type %s (LDAP message ID %d) that is not allowed for request messages
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_LDAP_DISCONNECT_DUE_TO_INVALID_REQUEST_TYPE =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_ERR_LDAP_DISCONNECT_DUE_TO_INVALID_REQUEST_TYPE_202",PROTOCOL,MILD_ERROR,202, getClassLoader());

  /**
   * An unexpected failure occurred while trying to process a request of type %s (LDAP message ID %d):  %s.  The client connection will be terminated
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,CharSequence> ERR_LDAP_DISCONNECT_DUE_TO_PROCESSING_FAILURE =
          new MessageDescriptor.Arg3<CharSequence,Number,CharSequence>(BASE,"SEVERE_ERR_LDAP_DISCONNECT_DUE_TO_PROCESSING_FAILURE_203",PROTOCOL,SEVERE_ERROR,203, getClassLoader());

  /**
   * The bind request message (LDAP message ID %d) included an invalid authentication type of %s.  This is a protocol error, and this connection will be terminated as per RFC 2251 section 4.2.3
   */
  public static final MessageDescriptor.Arg2<Number,CharSequence> ERR_LDAP_INVALID_BIND_AUTH_TYPE =
          new MessageDescriptor.Arg2<Number,CharSequence>(BASE,"MILD_ERR_LDAP_INVALID_BIND_AUTH_TYPE_204",PROTOCOL,MILD_ERROR,204, getClassLoader());

  /**
   * This client connection is being terminated because a protocol error occurred while trying to process a bind request.  The LDAP message ID was %d and the error message for the bind response was %s
   */
  public static final MessageDescriptor.Arg2<Number,CharSequence> ERR_LDAP_DISCONNECT_DUE_TO_BIND_PROTOCOL_ERROR =
          new MessageDescriptor.Arg2<Number,CharSequence>(BASE,"MILD_ERR_LDAP_DISCONNECT_DUE_TO_BIND_PROTOCOL_ERROR_205",PROTOCOL,MILD_ERROR,205, getClassLoader());

  /**
   * An extended response message would have been sent to an LDAPv2 client (connection ID=%d, operation ID=%d): %s.  LDAPv2 does not allow extended operations, so this response will not be sent
   */
  public static final MessageDescriptor.Arg3<Number,Number,CharSequence> ERR_LDAPV2_SKIPPING_EXTENDED_RESPONSE =
          new MessageDescriptor.Arg3<Number,Number,CharSequence>(BASE,"MILD_ERR_LDAPV2_SKIPPING_EXTENDED_RESPONSE_206",PROTOCOL,MILD_ERROR,206, getClassLoader());

  /**
   * A search performed by an LDAPv2 client (connection ID=%d, operation ID=%d) would have included a search result reference %s.  Referrals are not allowed for LDAPv2 clients, so this search reference will not be sent
   */
  public static final MessageDescriptor.Arg3<Number,Number,CharSequence> ERR_LDAPV2_SKIPPING_SEARCH_REFERENCE =
          new MessageDescriptor.Arg3<Number,Number,CharSequence>(BASE,"MILD_ERR_LDAPV2_SKIPPING_SEARCH_REFERENCE_207",PROTOCOL,MILD_ERROR,207, getClassLoader());

  /**
   * The original result code for this message was 10 but this result is not allowed for LDAPv2 clients
   */
  public static final MessageDescriptor.Arg0 ERR_LDAPV2_REFERRAL_RESULT_CHANGED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_LDAPV2_REFERRAL_RESULT_CHANGED_208",PROTOCOL,MILD_ERROR,208, getClassLoader());

  /**
   * The response included one or more referrals, which are not allowed for LDAPv2 clients.  The referrals included were:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAPV2_REFERRALS_OMITTED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAPV2_REFERRALS_OMITTED_209",PROTOCOL,MILD_ERROR,209, getClassLoader());

  /**
   * The Directory Server has been configured to deny access to LDAPv2 clients.  This connection will be closed
   */
  public static final MessageDescriptor.Arg0 ERR_LDAPV2_CLIENTS_NOT_ALLOWED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_LDAPV2_CLIENTS_NOT_ALLOWED_210",PROTOCOL,MILD_ERROR,210, getClassLoader());

  /**
   * The client with connection ID %d authenticated to the Directory Server using LDAPv2, but attempted to send an extended operation request (LDAP message ID %d), which is not allowed for LDAPv2 clients.  The connection will be terminated
   */
  public static final MessageDescriptor.Arg2<Number,Number> ERR_LDAPV2_EXTENDED_REQUEST_NOT_ALLOWED =
          new MessageDescriptor.Arg2<Number,Number>(BASE,"MILD_ERR_LDAPV2_EXTENDED_REQUEST_NOT_ALLOWED_211",PROTOCOL,MILD_ERROR,211, getClassLoader());

  /**
   * An attempt was made to initialize the LDAP statistics monitor provider as defined in configuration entry %s.  This monitor provider should only be dynamically created within the Directory Server itself and not from within the configuration
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_STATS_INVALID_MONITOR_INITIALIZATION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_STATS_INVALID_MONITOR_INITIALIZATION_212",PROTOCOL,MILD_ERROR,212, getClassLoader());

  /**
   * The LDAP request handler thread "%s" encountered an unexpected error that would have caused the thread to die:  %s.  The error has been caught and the request handler should continue operating as normal
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAP_REQHANDLER_UNEXPECTED_SELECT_EXCEPTION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDAP_REQHANDLER_UNEXPECTED_SELECT_EXCEPTION_213",PROTOCOL,SEVERE_ERROR,213, getClassLoader());

  /**
   * The attempt to register this connection with the Directory Server was rejected.  This might indicate that the server already has the maximum allowed number of concurrent connections established, or that it is in a restricted access mode
   */
  public static final MessageDescriptor.Arg0 ERR_LDAP_CONNHANDLER_REJECTED_BY_SERVER =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_LDAP_CONNHANDLER_REJECTED_BY_SERVER_214",PROTOCOL,MILD_ERROR,214, getClassLoader());

  /**
   * Address or set of addresses on which this connection handler can accept client connections.  If no value is specified, then the server will accept connections on all active addresses.  Changes to this configuration attribute will not take effect until the connection handler is disabled and re-enabled, or until the Directory Server is restarted
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONNHANDLER_DESCRIPTION_LISTEN_ADDRESS =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONNHANDLER_DESCRIPTION_LISTEN_ADDRESS_215",PROTOCOL,INFORMATION,215, getClassLoader());

  /**
   * TCP port on which this connection handler can accept client connections.  Changes to this configuration attribute will not take effect until the connection handler is disabled and re-enabled, or until the Directory Server is restarted
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONNHANDLER_DESCRIPTION_LISTEN_PORT =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONNHANDLER_DESCRIPTION_LISTEN_PORT_216",PROTOCOL,INFORMATION,216, getClassLoader());

  /**
   * Specifies a set of address masks that can be used to determine the addresses of the clients that are allowed to establish connections to this connection handler.  If no values are specified, then all clients with addresses that do not match an address on the deny list will be allowed.  Changes to this configuration attribute will take effect immediately but will not interfere with connections that might already be established
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONNHANDLER_DESCRIPTION_ALLOWED_CLIENTS =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONNHANDLER_DESCRIPTION_ALLOWED_CLIENTS_217",PROTOCOL,INFORMATION,217, getClassLoader());

  /**
   * Specifies a set of address masks that can be used to determine the set of addresses of the clients that are not allowed to establish connections to this connection handler.  If both allowed and denied client masks are defined and a client connection matches one or more masks in both lists, then the connection will be denied.  If only a denied list is specified, then any client not matching a mask in that list will be allowed.  Changes to this configuration attribute will take effect immediately but will not interfere with connections that might already be established
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONNHANDLER_DESCRIPTION_DENIED_CLIENTS =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONNHANDLER_DESCRIPTION_DENIED_CLIENTS_218",PROTOCOL,INFORMATION,218, getClassLoader());

  /**
   * Indicates whether to allow communication with LDAPv2 clients.  LDAPv2 is considered an obsolete protocol, and clients using it will not be allowed to take advantage of all features offered by the server.  Changes to this configuration attribute will take effect immediately, but will not interfere with connections that might already be established
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONNHANDLER_DESCRIPTION_ALLOW_LDAPV2 =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONNHANDLER_DESCRIPTION_ALLOW_LDAPV2_219",PROTOCOL,INFORMATION,219, getClassLoader());

  /**
   * Number of threads that should be used to read requests from clients and place them in the work queue for processing.  On large systems accepting many concurrent requests, it might be more efficient to have multiple threads reading requests from clients.  Changes to this configuration attribute will not take effect until the connection handler is disabled and re-enabled, or until the Directory Server is restarted
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONNHANDLER_DESCRIPTION_NUM_REQUEST_HANDLERS =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONNHANDLER_DESCRIPTION_NUM_REQUEST_HANDLERS_220",PROTOCOL,INFORMATION,220, getClassLoader());

  /**
   * Indicates whether to send an LDAPv3 notice of disconnection message to client connections that are rejected before closing the connection.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONNHANDLER_DESCRIPTION_SEND_REJECTION_NOTICE =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONNHANDLER_DESCRIPTION_SEND_REJECTION_NOTICE_221",PROTOCOL,INFORMATION,221, getClassLoader());

  /**
   * Indicates whether to use the TCP KeepAlive feature for client connections established through this connection handler.  This is recommended because it might help the server detect client connections that are no longer valid, and might help prevent intermediate network devices from closing connections due to a lack of communication.  Changes to this configuration attribute will take effect immediately but will only be applied to connections established after the change
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONNHANDLER_DESCRIPTION_USE_TCP_KEEPALIVE =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONNHANDLER_DESCRIPTION_USE_TCP_KEEPALIVE_222",PROTOCOL,INFORMATION,222, getClassLoader());

  /**
   * Indicates whether to use the TCP NoDelay feature for client connections established through this connection handler.  This is recommended because it will generally allow faster responses to clients, although directories that frequently process searches that match multiple entries might be able to achieve higher throughput if it is disabled.  Changes to this configuration attribute will take effect immediately but will only be applied to connections established after the change
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONNHANDLER_DESCRIPTION_USE_TCP_NODELAY =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONNHANDLER_DESCRIPTION_USE_TCP_NODELAY_223",PROTOCOL,INFORMATION,223, getClassLoader());

  /**
   * Indicates whether to use the SO_REUSEADDR socket option for the socket accepting connections for this connection handler.  It should generally be enabled unless you have been instructed to disable it by support engineers.  Changes to this configuration attribute will not take effect until the connection handler is disabled and re-enabled, or until the Directory Server is restarted
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONNHANDLER_DESCRIPTION_ALLOW_REUSE_ADDRESS =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONNHANDLER_DESCRIPTION_ALLOW_REUSE_ADDRESS_224",PROTOCOL,INFORMATION,224, getClassLoader());

  /**
   * Maximum size in bytes that will be allowed when reading requests from clients.  This can be used to prevent denial of service attacks from clients that send extremely large requests.  A value of zero indicates that no limit should be imposed.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONNHANDLER_DESCRIPTION_MAX_REQUEST_SIZE =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONNHANDLER_DESCRIPTION_MAX_REQUEST_SIZE_225",PROTOCOL,INFORMATION,225, getClassLoader());

  /**
   * Indicates whether this connection handler should use SSL when accepting connections from clients. Changes to this configuration attribute will not take effect until the connection handler is disabled and re-enabled, or until the Directory Server is restarted
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONNHANDLER_DESCRIPTION_USE_SSL =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONNHANDLER_DESCRIPTION_USE_SSL_226",PROTOCOL,INFORMATION,226, getClassLoader());

  /**
   * Indicates whether this connection handler should allow clients to use the StartTLS extended operation to initiate secure communication over a non-SSL LDAP connection. This can not be used if SSL is enabled for the connection handler.  Changes to this configuration attribute will take effect immediately for LDAP clients
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONNHANDLER_DESCRIPTION_ALLOW_STARTTLS =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONNHANDLER_DESCRIPTION_ALLOW_STARTTLS_227",PROTOCOL,INFORMATION,227, getClassLoader());

  /**
   * Policy that should be used regarding requesting or requiring the client to present its own certificate when establishing an SSL-based connection or using StartTLS to initiate a secure channel in an established connection. Changes to this configuration attribute will not take effect until the connection handler is disabled and re-enabled, or until the Directory Server is restarted
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONNHANDLER_DESCRIPTION_SSL_CLIENT_AUTH_POLICY =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONNHANDLER_DESCRIPTION_SSL_CLIENT_AUTH_POLICY_228",PROTOCOL,INFORMATION,228, getClassLoader());

  /**
   * Nickname of the certificate that the connection handler should use when accepting SSL-based connections or performing StartTLS negotiation.  Changes to this configuration attribute will not take effect until the connection handler is disabled and re-enabled, or until the Directory Server is restarted
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONNHANDLER_DESCRIPTION_SSL_CERT_NICKNAME =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONNHANDLER_DESCRIPTION_SSL_CERT_NICKNAME_229",PROTOCOL,INFORMATION,229, getClassLoader());

  /**
   * The specified listen address "%s" in configuration entry "%s" could not be resolved:  %s.  Please make sure that name resolution is properly configured on this system
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_LDAP_CONNHANDLER_UNKNOWN_LISTEN_ADDRESS =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDAP_CONNHANDLER_UNKNOWN_LISTEN_ADDRESS_230",PROTOCOL,SEVERE_ERROR,230, getClassLoader());

  /**
   * An unexpected error occurred while processing the ds-cfg-listen-address attribute in configuration entry %s, which is used to specify the address or set of addresses on which to listen for client connections:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAP_CONNHANDLER_CANNOT_DETERMINE_LISTEN_ADDRESS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDAP_CONNHANDLER_CANNOT_DETERMINE_LISTEN_ADDRESS_231",PROTOCOL,SEVERE_ERROR,231, getClassLoader());

  /**
   * No listen port was defined using configuration ds-cfg-listen-port in configuration entry %s.  This is a required attribute
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_CONNHANDLER_NO_LISTEN_PORT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDAP_CONNHANDLER_NO_LISTEN_PORT_232",PROTOCOL,SEVERE_ERROR,232, getClassLoader());

  /**
   * An unexpected error occurred while processing the ds-cfg-listen-port attribute in configuration entry %s, which is used to specify the port on which to listen for client connections:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAP_CONNHANDLER_CANNOT_DETERMINE_LISTEN_PORT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDAP_CONNHANDLER_CANNOT_DETERMINE_LISTEN_PORT_233",PROTOCOL,SEVERE_ERROR,233, getClassLoader());

  /**
   * An unexpected error occurred while processing the ds-cfg-allowed-client attribute in configuration entry %s, which is used to specify the address mask(s) of the clients that are allowed to establish connections to this connection handler:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAP_CONNHANDLER_CANNOT_DETERMINE_ALLOWED_CLIENTS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDAP_CONNHANDLER_CANNOT_DETERMINE_ALLOWED_CLIENTS_234",PROTOCOL,SEVERE_ERROR,234, getClassLoader());

  /**
   * An unexpected error occurred while processing the ds-cfg-denied-client attribute in configuration entry %s, which is used to specify the address mask(s) of the clients that are not allowed to establish connections to this connection handler:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAP_CONNHANDLER_CANNOT_DETERMINE_DENIED_CLIENTS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDAP_CONNHANDLER_CANNOT_DETERMINE_DENIED_CLIENTS_235",PROTOCOL,SEVERE_ERROR,235, getClassLoader());

  /**
   * An unexpected error occurred while processing the ds-cfg-allow-ldap-v2 attribute in configuration entry %s, which is used to indicate whether LDAPv2 clients will be allowed to access this connection handler:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAP_CONNHANDLER_CANNOT_DETERMINE_ALLOW_LDAPV2 =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDAP_CONNHANDLER_CANNOT_DETERMINE_ALLOW_LDAPV2_236",PROTOCOL,SEVERE_ERROR,236, getClassLoader());

  /**
   * An unexpected error occurred while processing the ds-cfg-num-request-handlers attribute in configuration entry %s, which is used to specify the number of request handlers to use to read requests from clients: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAP_CONNHANDLER_CANNOT_DETERMINE_NUM_REQUEST_HANDLERS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDAP_CONNHANDLER_CANNOT_DETERMINE_NUM_REQUEST_HANDLERS_237",PROTOCOL,SEVERE_ERROR,237, getClassLoader());

  /**
   * An unexpected error occurred while processing the ds-cfg-send-rejection-notice attribute in configuration entry %s, which is used to indicate whether to send a notice of disconnection message to rejected client connections: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAP_CONNHANDLER_CANNOT_DETERMINE_SEND_REJECTION_NOTICE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDAP_CONNHANDLER_CANNOT_DETERMINE_SEND_REJECTION_NOTICE_238",PROTOCOL,SEVERE_ERROR,238, getClassLoader());

  /**
   * An unexpected error occurred while processing the ds-cfg-use-tcp-keep-alive attribute in configuration entry %s, which is used to periodically send TCP Keep-Alive messages over idle connections:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAP_CONNHANDLER_CANNOT_DETERMINE_USE_TCP_KEEPALIVE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDAP_CONNHANDLER_CANNOT_DETERMINE_USE_TCP_KEEPALIVE_239",PROTOCOL,SEVERE_ERROR,239, getClassLoader());

  /**
   * An unexpected error occurred while processing the ds-cfg-use-tcp-no-delay attribute in configuration entry %s, which is used to determine whether to immediately flush responses to clients:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAP_CONNHANDLER_CANNOT_DETERMINE_USE_TCP_NODELAY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDAP_CONNHANDLER_CANNOT_DETERMINE_USE_TCP_NODELAY_240",PROTOCOL,SEVERE_ERROR,240, getClassLoader());

  /**
   * An unexpected error occurred while processing the ds-cfg-allow-tcp-reuse-address attribute in configuration entry %s, which is used to determine whether to set the SO_REUSEADDR option on the listen socket:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAP_CONNHANDLER_CANNOT_DETERMINE_ALLOW_REUSE_ADDRESS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDAP_CONNHANDLER_CANNOT_DETERMINE_ALLOW_REUSE_ADDRESS_241",PROTOCOL,SEVERE_ERROR,241, getClassLoader());

  /**
   * An unexpected error occurred while processing the ds-cfg-max-request-size attribute in configuration entry %s, which is used to determine the maximum size in bytes that can be used for a client request:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAP_CONNHANDLER_CANNOT_DETERMINE_MAX_REQUEST_SIZE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDAP_CONNHANDLER_CANNOT_DETERMINE_MAX_REQUEST_SIZE_242",PROTOCOL,SEVERE_ERROR,242, getClassLoader());

  /**
   * An unexpected error occurred while processing the ds-cfg-use-ssl attribute in configuration entry %s, which is used to indicate whether to use SSL when accepting client connections:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAP_CONNHANDLER_CANNOT_DETERMINE_USE_SSL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDAP_CONNHANDLER_CANNOT_DETERMINE_USE_SSL_243",PROTOCOL,SEVERE_ERROR,243, getClassLoader());

  /**
   * The LDAP connection handler defined in configuration entry %s is configured to communicate over SSL and also to allow clients to use the StartTLS extended operation.  These options can not be used at the same time, so clients will not be allowed to use the StartTLS operation
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_CONNHANDLER_CANNOT_HAVE_SSL_AND_STARTTLS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDAP_CONNHANDLER_CANNOT_HAVE_SSL_AND_STARTTLS_244",PROTOCOL,SEVERE_ERROR,244, getClassLoader());

  /**
   * An unexpected error occurred while processing the ds-cfg-allow-start-tls attribute in configuration entry %s, which is used to indicate whether clients can use the StartTLS extended operation:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAP_CONNHANDLER_CANNOT_DETERMINE_ALLOW_STARTTLS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDAP_CONNHANDLER_CANNOT_DETERMINE_ALLOW_STARTTLS_245",PROTOCOL,SEVERE_ERROR,245, getClassLoader());

  /**
   * The SSL client authentication policy "%s" specified in attribute ds-cfg-ssl-client-auth-policy of configuration entry %s is invalid.  The value must be one of "disabled", "optional", or "required"
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAP_CONNHANDLER_INVALID_SSL_CLIENT_AUTH_POLICY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDAP_CONNHANDLER_INVALID_SSL_CLIENT_AUTH_POLICY_246",PROTOCOL,SEVERE_ERROR,246, getClassLoader());

  /**
   * An unexpected error occurred while processing the ds-cfg-ssl-client-auth-policy attribute in configuration entry %s, which is used to specify the policy that should be used for requesting/requiring SSL client authentication:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAP_CONNHANDLER_CANNOT_DETERMINE_SSL_CLIENT_AUTH_POLICY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDAP_CONNHANDLER_CANNOT_DETERMINE_SSL_CLIENT_AUTH_POLICY_247",PROTOCOL,SEVERE_ERROR,247, getClassLoader());

  /**
   * An unexpected error occurred while processing the ds-cfg-ssl-cert-nickname attribute in configuration entry %s, which is used to specify the nickname of the certificate to use for accepting SSL/TLS connections:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAP_CONNHANDLER_CANNOT_DETERMINE_SSL_CERT_NICKNAME =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDAP_CONNHANDLER_CANNOT_DETERMINE_SSL_CERT_NICKNAME_248",PROTOCOL,SEVERE_ERROR,248, getClassLoader());

  /**
   * The string %s defined in attribute %s of configuration entry %s could not be decoded as a valid address mask:  %s
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> ERR_LDAP_CONNHANDLER_INVALID_ADDRESS_MASK =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDAP_CONNHANDLER_INVALID_ADDRESS_MASK_249",PROTOCOL,SEVERE_ERROR,249, getClassLoader());

  /**
   * A new set of allowed client address masks has been applied for configuration entry %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_LDAP_CONNHANDLER_NEW_ALLOWED_CLIENTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_LDAP_CONNHANDLER_NEW_ALLOWED_CLIENTS_250",PROTOCOL,INFORMATION,250, getClassLoader());

  /**
   * A new set of denied client address masks has been applied for configuration entry %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_LDAP_CONNHANDLER_NEW_DENIED_CLIENTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_LDAP_CONNHANDLER_NEW_DENIED_CLIENTS_251",PROTOCOL,INFORMATION,251, getClassLoader());

  /**
   * The value of the ds-cfg-allow-ldap-v2 attribute has been updated to %s in configuration entry %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_LDAP_CONNHANDLER_NEW_ALLOW_LDAPV2 =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_LDAP_CONNHANDLER_NEW_ALLOW_LDAPV2_252",PROTOCOL,INFORMATION,252, getClassLoader());

  /**
   * The value of the ds-cfg-send-rejection-notice attribute has been updated to %s in configuration entry %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_LDAP_CONNHANDLER_NEW_SEND_REJECTION_NOTICE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_LDAP_CONNHANDLER_NEW_SEND_REJECTION_NOTICE_253",PROTOCOL,INFORMATION,253, getClassLoader());

  /**
   * The value of the ds-cfg-use-tcp-keep-alive attribute has been updated to %s in configuration entry %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_LDAP_CONNHANDLER_NEW_USE_KEEPALIVE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_LDAP_CONNHANDLER_NEW_USE_KEEPALIVE_254",PROTOCOL,INFORMATION,254, getClassLoader());

  /**
   * The value of the ds-cfg-use-tcp-no-delay attribute has been updated to %s in configuration entry %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_LDAP_CONNHANDLER_NEW_USE_TCP_NODELAY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_LDAP_CONNHANDLER_NEW_USE_TCP_NODELAY_255",PROTOCOL,INFORMATION,255, getClassLoader());

  /**
   * The value of the ds-cfg-max-request-size attribute has been updated to %s in configuration entry %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_LDAP_CONNHANDLER_NEW_MAX_REQUEST_SIZE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_LDAP_CONNHANDLER_NEW_MAX_REQUEST_SIZE_256",PROTOCOL,INFORMATION,256, getClassLoader());

  /**
   * The value of the ds-cfg-allow-start-tls attribute has been updated to %s in configuration entry %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_LDAP_CONNHANDLER_NEW_ALLOW_STARTTLS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_LDAP_CONNHANDLER_NEW_ALLOW_STARTTLS_257",PROTOCOL,INFORMATION,257, getClassLoader());

  /**
   * Indicates whether the connection handler should keep statistics regarding LDAP client communication.  Maintaining this information can cause a slight decrease in performance, but can be useful for understanding client usage patterns. Changes to this configuration attribute will take effect immediately, but will only apply for new connections and will have the side effect of clearing any existing statistical data that might have been collected
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONNHANDLER_DESCRIPTION_KEEP_STATS =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONNHANDLER_DESCRIPTION_KEEP_STATS_258",PROTOCOL,INFORMATION,258, getClassLoader());

  /**
   * An unexpected error occurred while processing the ds-cfg-keep-stats attribute in configuration entry %s, which is used to indicate whether LDAP usage statistics should be enabled for this connection handler:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAP_CONNHANDLER_CANNOT_DETERMINE_KEEP_STATS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDAP_CONNHANDLER_CANNOT_DETERMINE_KEEP_STATS_259",PROTOCOL,SEVERE_ERROR,259, getClassLoader());

  /**
   * The value of the ds-cfg-keep-stats attribute has been updated to %s in configuration entry %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_LDAP_CONNHANDLER_NEW_KEEP_STATS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_LDAP_CONNHANDLER_NEW_KEEP_STATS_260",PROTOCOL,INFORMATION,260, getClassLoader());

  /**
   * Cannot decode the provided byte array as the value of an ASN.1 long element because the array did not have a length between 1 and 8 bytes (provided length was %d)
   */
  public static final MessageDescriptor.Arg1<Number> ERR_ASN1_LONG_SET_VALUE_INVALID_LENGTH =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_ASN1_LONG_SET_VALUE_INVALID_LENGTH_261",PROTOCOL,MILD_ERROR,261, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as a long element because the length of the element value was not between one and eight bytes (actual length was %d)
   */
  public static final MessageDescriptor.Arg1<Number> ERR_ASN1_LONG_DECODE_ELEMENT_INVALID_LENGTH =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_ASN1_LONG_DECODE_ELEMENT_INVALID_LENGTH_262",PROTOCOL,MILD_ERROR,262, getClassLoader());

  /**
   * Cannot decode the provided byte array as an ASN.1 long element because the decoded value length was not between 1 and 8 bytes (decoded length was %d)
   */
  public static final MessageDescriptor.Arg1<Number> ERR_ASN1_LONG_DECODE_ARRAY_INVALID_LENGTH =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_ASN1_LONG_DECODE_ARRAY_INVALID_LENGTH_263",PROTOCOL,MILD_ERROR,263, getClassLoader());

  /**
   * An unexpected error occurred while trying to decode the DN %s used for internal operations as a root user:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_INTERNAL_CANNOT_DECODE_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_INTERNAL_CANNOT_DECODE_DN_264",PROTOCOL,SEVERE_ERROR,264, getClassLoader());

  /**
   * Names of the SSL protocols that will be allowed for use in SSL or StartTLS communication.  Changes to this configuration attribute will take effect immediately but will only impact new SSL/TLS-based sessions created after the change
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONNHANDLER_DESCRIPTION_SSL_ENABLED_PROTOCOLS =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONNHANDLER_DESCRIPTION_SSL_ENABLED_PROTOCOLS_265",PROTOCOL,INFORMATION,265, getClassLoader());

  /**
   * An unexpected error occurred while processing the ds-cfg-ssl-protocol attribute in configuration entry %s, which is used to specify the names of the SSL protocols to allow for SSL/TLS sessions:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAP_CONNHANDLER_CANNOT_DETERMINE_SSL_PROTOCOLS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDAP_CONNHANDLER_CANNOT_DETERMINE_SSL_PROTOCOLS_266",PROTOCOL,SEVERE_ERROR,266, getClassLoader());

  /**
   * Names of the SSL cipher suites that will be allowed for use in SSL or StartTLS communication.  Changes to this configuration attribute will take immediately but will only impact new SSL/TLS-based sessions created after the change
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONNHANDLER_DESCRIPTION_SSL_ENABLED_CIPHERS =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONNHANDLER_DESCRIPTION_SSL_ENABLED_CIPHERS_267",PROTOCOL,INFORMATION,267, getClassLoader());

  /**
   * An unexpected error occurred while processing the ds-cfg-ssl-protocol attribute in configuration entry %s, which is used to specify the names of the SSL cipher suites to allow for SSL/TLS sessions:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAP_CONNHANDLER_CANNOT_DETERMINE_SSL_CIPHERS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDAP_CONNHANDLER_CANNOT_DETERMINE_SSL_CIPHERS_268",PROTOCOL,SEVERE_ERROR,268, getClassLoader());

  /**
   * The value of the ds-cfg-ssl-protocol attribute has been updated to %s in configuration entry %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_LDAP_CONNHANDLER_NEW_SSL_PROTOCOLS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_LDAP_CONNHANDLER_NEW_SSL_PROTOCOLS_269",PROTOCOL,INFORMATION,269, getClassLoader());

  /**
   * The value of the ds-cfg-ssl-cipher-suite attribute has been updated to %s in configuration entry %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_LDAP_CONNHANDLER_NEW_SSL_CIPHERS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_LDAP_CONNHANDLER_NEW_SSL_CIPHERS_270",PROTOCOL,INFORMATION,270, getClassLoader());

  /**
   * The TLS connection security provider cannot be enabled on this client connection because it is already using the %s provider.  StartTLS can only be used on clear-text connections
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_TLS_EXISTING_SECURITY_PROVIDER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_TLS_EXISTING_SECURITY_PROVIDER_271",PROTOCOL,MILD_ERROR,271, getClassLoader());

  /**
   * StartTLS cannot be enabled on this LDAP client connection because the corresponding LDAP connection handler is configured to reject StartTLS requests.  The use of StartTLS can be enabled using the ds-cfg-allow-start-tls configuration attribute
   */
  public static final MessageDescriptor.Arg0 ERR_LDAP_TLS_STARTTLS_NOT_ALLOWED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_LDAP_TLS_STARTTLS_NOT_ALLOWED_272",PROTOCOL,MILD_ERROR,272, getClassLoader());

  /**
   * An error occurred while attempting to create a TLS connection security provider for this client connection for use with StartTLS:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_TLS_CANNOT_CREATE_TLS_PROVIDER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_TLS_CANNOT_CREATE_TLS_PROVIDER_273",PROTOCOL,MILD_ERROR,273, getClassLoader());

  /**
   * StartTLS is not available on this client connection because the connection does not have access to a TLS connection security provider
   */
  public static final MessageDescriptor.Arg0 ERR_LDAP_TLS_NO_PROVIDER =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_LDAP_TLS_NO_PROVIDER_274",PROTOCOL,MILD_ERROR,274, getClassLoader());

  /**
   * The LDAP connection handler does not allow clients to close a StartTLS session on a client connection while leaving the underlying TCP connection active.  The TCP connection will be closed
   */
  public static final MessageDescriptor.Arg0 ERR_LDAP_TLS_CLOSURE_NOT_ALLOWED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_LDAP_TLS_CLOSURE_NOT_ALLOWED_275",PROTOCOL,MILD_ERROR,275, getClassLoader());

  /**
   * Started listening for new connections on %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_LDAP_CONNHANDLER_STARTED_LISTENING =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_LDAP_CONNHANDLER_STARTED_LISTENING_276",PROTOCOL,NOTICE,276, getClassLoader());

  /**
   * Stopped listening for new connections on %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_LDAP_CONNHANDLER_STOPPED_LISTENING =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_LDAP_CONNHANDLER_STOPPED_LISTENING_277",PROTOCOL,NOTICE,277, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP paged results control value because the element is null
   */
  public static final MessageDescriptor.Arg0 ERR_LDAP_PAGED_RESULTS_DECODE_NULL =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_LDAP_PAGED_RESULTS_DECODE_NULL_278",PROTOCOL,MILD_ERROR,278, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP paged results control value because the element could not be decoded as a sequence:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_PAGED_RESULTS_DECODE_SEQUENCE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_PAGED_RESULTS_DECODE_SEQUENCE_279",PROTOCOL,MILD_ERROR,279, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP paged results control value because the request sequence has an invalid number of elements (expected 2, got %d)
   */
  public static final MessageDescriptor.Arg1<Number> ERR_LDAP_PAGED_RESULTS_DECODE_INVALID_ELEMENT_COUNT =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_LDAP_PAGED_RESULTS_DECODE_INVALID_ELEMENT_COUNT_280",PROTOCOL,MILD_ERROR,280, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP paged results control value because the size element could not be properly decoded:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_PAGED_RESULTS_DECODE_SIZE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_PAGED_RESULTS_DECODE_SIZE_281",PROTOCOL,MILD_ERROR,281, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP paged results control value because the cookie could not be properly decoded:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_PAGED_RESULTS_DECODE_COOKIE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_PAGED_RESULTS_DECODE_COOKIE_282",PROTOCOL,MILD_ERROR,282, getClassLoader());

  /**
   * Cannot decode the provided LDAP assertion control because the control does not have a value
   */
  public static final MessageDescriptor.Arg0 ERR_LDAPASSERT_NO_CONTROL_VALUE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_LDAPASSERT_NO_CONTROL_VALUE_283",PROTOCOL,MILD_ERROR,283, getClassLoader());

  /**
   * Cannot decode the provided LDAP assertion control because the control value cannot be decoded as an ASN.1 element:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAPASSERT_INVALID_CONTROL_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAPASSERT_INVALID_CONTROL_VALUE_284",PROTOCOL,MILD_ERROR,284, getClassLoader());

  /**
   * Cannot decode the provided LDAP pre-read request control because the control does not have a value
   */
  public static final MessageDescriptor.Arg0 ERR_PREREADREQ_NO_CONTROL_VALUE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_PREREADREQ_NO_CONTROL_VALUE_285",PROTOCOL,MILD_ERROR,285, getClassLoader());

  /**
   * Cannot decode the provided LDAP pre-read request control because an error occurred while trying to decode the control value:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PREREADREQ_CANNOT_DECODE_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_PREREADREQ_CANNOT_DECODE_VALUE_286",PROTOCOL,MILD_ERROR,286, getClassLoader());

  /**
   * Cannot decode the provided LDAP post-read request control because the control does not have a value
   */
  public static final MessageDescriptor.Arg0 ERR_POSTREADREQ_NO_CONTROL_VALUE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_POSTREADREQ_NO_CONTROL_VALUE_287",PROTOCOL,MILD_ERROR,287, getClassLoader());

  /**
   * Cannot decode the provided LDAP post-read request control because an error occurred while trying to decode the control value:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_POSTREADREQ_CANNOT_DECODE_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_POSTREADREQ_CANNOT_DECODE_VALUE_288",PROTOCOL,MILD_ERROR,288, getClassLoader());

  /**
   * Cannot decode the provided LDAP pre-read response control because the control does not have a value
   */
  public static final MessageDescriptor.Arg0 ERR_PREREADRESP_NO_CONTROL_VALUE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_PREREADRESP_NO_CONTROL_VALUE_289",PROTOCOL,MILD_ERROR,289, getClassLoader());

  /**
   * Cannot decode the provided LDAP pre-read response control because an error occurred while trying to decode the control value:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PREREADRESP_CANNOT_DECODE_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_PREREADRESP_CANNOT_DECODE_VALUE_290",PROTOCOL,MILD_ERROR,290, getClassLoader());

  /**
   * Cannot decode the provided LDAP post-read response control because the control does not have a value
   */
  public static final MessageDescriptor.Arg0 ERR_POSTREADRESP_NO_CONTROL_VALUE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_POSTREADRESP_NO_CONTROL_VALUE_291",PROTOCOL,MILD_ERROR,291, getClassLoader());

  /**
   * Cannot decode the provided LDAP post-read response control because an error occurred while trying to decode the control value:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_POSTREADRESP_CANNOT_DECODE_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_POSTREADRESP_CANNOT_DECODE_VALUE_292",PROTOCOL,MILD_ERROR,292, getClassLoader());

  /**
   * Cannot decode the provided proxied authorization V1 control because it does not have a value
   */
  public static final MessageDescriptor.Arg0 ERR_PROXYAUTH1_NO_CONTROL_VALUE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_PROXYAUTH1_NO_CONTROL_VALUE_293",PROTOCOL,MILD_ERROR,293, getClassLoader());

  /**
   * Cannot decode the provided proxied authorization V1 control because the ASN.1 sequence in the control value has an invalid number of elements (expected 1, got %d)
   */
  public static final MessageDescriptor.Arg1<Number> ERR_PROXYAUTH1_INVALID_ELEMENT_COUNT =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_PROXYAUTH1_INVALID_ELEMENT_COUNT_294",PROTOCOL,MILD_ERROR,294, getClassLoader());

  /**
   * Cannot decode the provided proxied authorization V1 control because an error occurred while attempting to decode the control value:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PROXYAUTH1_CANNOT_DECODE_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_PROXYAUTH1_CANNOT_DECODE_VALUE_295",PROTOCOL,MILD_ERROR,295, getClassLoader());

  /**
   * User %s specified in the proxied authorization V1 control does not exist in the Directory Server
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PROXYAUTH1_NO_SUCH_USER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_PROXYAUTH1_NO_SUCH_USER_296",PROTOCOL,MILD_ERROR,296, getClassLoader());

  /**
   * Cannot decode the provided proxied authorization V2 control because it does not have a value
   */
  public static final MessageDescriptor.Arg0 ERR_PROXYAUTH2_NO_CONTROL_VALUE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_PROXYAUTH2_NO_CONTROL_VALUE_297",PROTOCOL,MILD_ERROR,297, getClassLoader());

  /**
   * Cannot decode the provided proxied authorization V2 control because an error occurred while attempting to decode the control value:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PROXYAUTH2_CANNOT_DECODE_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_PROXYAUTH2_CANNOT_DECODE_VALUE_298",PROTOCOL,MILD_ERROR,298, getClassLoader());

  /**
   * Unable to process proxied authorization V2 control because it contains an authorization ID based on a username and no proxied authorization identity mapper is configured in the Directory Server
   */
  public static final MessageDescriptor.Arg0 ERR_PROXYAUTH2_NO_IDENTITY_MAPPER =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_PROXYAUTH2_NO_IDENTITY_MAPPER_299",PROTOCOL,MILD_ERROR,299, getClassLoader());

  /**
   * The authorization ID "%s" contained in the proxied authorization V2 control is invalid because it does not start with "dn:" to indicate a user DN or "u:" to indicate a username
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PROXYAUTH2_INVALID_AUTHZID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_PROXYAUTH2_INVALID_AUTHZID_300",PROTOCOL,MILD_ERROR,300, getClassLoader());

  /**
   * User %s specified in the proxied authorization V2 control does not exist in the Directory Server
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PROXYAUTH2_NO_SUCH_USER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_PROXYAUTH2_NO_SUCH_USER_301",PROTOCOL,MILD_ERROR,301, getClassLoader());

  /**
   * The provided integer value %d does not correspond to any persistent search change type
   */
  public static final MessageDescriptor.Arg1<Number> ERR_PSEARCH_CHANGETYPES_INVALID_TYPE =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_PSEARCH_CHANGETYPES_INVALID_TYPE_302",PROTOCOL,MILD_ERROR,302, getClassLoader());

  /**
   * The provided integer value indicated that there were no persistent search change types, which is not allowed
   */
  public static final MessageDescriptor.Arg0 ERR_PSEARCH_CHANGETYPES_NO_TYPES =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_PSEARCH_CHANGETYPES_NO_TYPES_303",PROTOCOL,MILD_ERROR,303, getClassLoader());

  /**
   * The provided integer value %d was outside the range of acceptable values for an encoded change type set
   */
  public static final MessageDescriptor.Arg1<Number> ERR_PSEARCH_CHANGETYPES_INVALID_TYPES =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_PSEARCH_CHANGETYPES_INVALID_TYPES_304",PROTOCOL,MILD_ERROR,304, getClassLoader());

  /**
   * Cannot decode the provided persistent search control because it does not have a value
   */
  public static final MessageDescriptor.Arg0 ERR_PSEARCH_NO_CONTROL_VALUE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_PSEARCH_NO_CONTROL_VALUE_305",PROTOCOL,MILD_ERROR,305, getClassLoader());

  /**
   * Cannot decode the provided persistent search control because the value sequence has an invalid number of elements (expected 3, got %d)
   */
  public static final MessageDescriptor.Arg1<Number> ERR_PSEARCH_INVALID_ELEMENT_COUNT =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_PSEARCH_INVALID_ELEMENT_COUNT_306",PROTOCOL,MILD_ERROR,306, getClassLoader());

  /**
   * Cannot decode the provided persistent search control because an error occurred while attempting to decode the control value:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PSEARCH_CANNOT_DECODE_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_PSEARCH_CANNOT_DECODE_VALUE_307",PROTOCOL,MILD_ERROR,307, getClassLoader());

  /**
   * Cannot decode the provided entry change notification control because it does not have a value
   */
  public static final MessageDescriptor.Arg0 ERR_ECN_NO_CONTROL_VALUE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_ECN_NO_CONTROL_VALUE_308",PROTOCOL,MILD_ERROR,308, getClassLoader());

  /**
   * Cannot decode the provided entry change notification control because the value sequence has an invalid number of elements (expected between 1 and 3, got %d)
   */
  public static final MessageDescriptor.Arg1<Number> ERR_ECN_INVALID_ELEMENT_COUNT =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_ECN_INVALID_ELEMENT_COUNT_309",PROTOCOL,MILD_ERROR,309, getClassLoader());

  /**
   * Cannot decode the provided entry change notification control because it contains a previous DN element but had a change type of %s.  The previous DN element can only be provided with the modify DN change type
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ECN_ILLEGAL_PREVIOUS_DN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ECN_ILLEGAL_PREVIOUS_DN_310",PROTOCOL,MILD_ERROR,310, getClassLoader());

  /**
   * Cannot decode the provided entry change notification control because the second element in the value sequence has an invalid type of %s that is not appropriate for either a previous DN or a change number
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ECN_INVALID_ELEMENT_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ECN_INVALID_ELEMENT_TYPE_311",PROTOCOL,MILD_ERROR,311, getClassLoader());

  /**
   * Cannot decode the provided entry change notification control because an error occurred while attempting to decode the control value:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ECN_CANNOT_DECODE_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ECN_CANNOT_DECODE_VALUE_312",PROTOCOL,MILD_ERROR,312, getClassLoader());

  /**
   * Cannot decode the provided authorization identity response control because it does not have a value
   */
  public static final MessageDescriptor.Arg0 ERR_AUTHZIDRESP_NO_CONTROL_VALUE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_AUTHZIDRESP_NO_CONTROL_VALUE_313",PROTOCOL,MILD_ERROR,313, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP intermediate response protocol op because the element could not be decoded as a sequence:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_INTERMEDIATE_RESPONSE_DECODE_SEQUENCE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_INTERMEDIATE_RESPONSE_DECODE_SEQUENCE_314",PROTOCOL,MILD_ERROR,314, getClassLoader());

  /**
   * Cannot decode the provided ASN.1 element as an LDAP intermediate response protocol op because the request sequence had an invalid number of elements (expected 0, 1, or 2, got %d)
   */
  public static final MessageDescriptor.Arg1<Number> ERR_LDAP_INTERMEDIATE_RESPONSE_DECODE_INVALID_ELEMENT_COUNT =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_LDAP_INTERMEDIATE_RESPONSE_DECODE_INVALID_ELEMENT_COUNT_315",PROTOCOL,MILD_ERROR,315, getClassLoader());

  /**
   * An error occurred while attempting to decode the intermediate response OID:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_INTERMEDIATE_RESPONSE_CANNOT_DECODE_OID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_INTERMEDIATE_RESPONSE_CANNOT_DECODE_OID_316",PROTOCOL,MILD_ERROR,316, getClassLoader());

  /**
   * An error occurred while attempting to decode the intermediate response value:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_INTERMEDIATE_RESPONSE_CANNOT_DECODE_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_INTERMEDIATE_RESPONSE_CANNOT_DECODE_VALUE_317",PROTOCOL,MILD_ERROR,317, getClassLoader());

  /**
   * The intermediate response sequence element contained an invalid BER type %s that was not appropriate for either the OID or the value
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_INTERMEDIATE_RESPONSE_INVALID_ELEMENT_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_INTERMEDIATE_RESPONSE_INVALID_ELEMENT_TYPE_318",PROTOCOL,MILD_ERROR,318, getClassLoader());

  /**
   * Accept queue size, which controls the number of new connection attempts that may be allowed to queue up in the backlog before being rejected.  This should only need to be changed if it is expected that the Directory Server will receive large numbers of new connection attempts at the same time.  Changes to this configuration attribute will not take effect until the connection handler is disabled and re-enabled, or until the Directory Server is restarted
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONNHANDLER_DESCRIPTION_BACKLOG =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONNHANDLER_DESCRIPTION_BACKLOG_319",PROTOCOL,INFORMATION,319, getClassLoader());

  /**
   * An unexpected error occurred while processing the ds-cfg-accept-backlog attribute in configuration entry %s, which is used to specify the accept backlog size:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAP_CONNHANDLER_CANNOT_DETERMINE_BACKLOG =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDAP_CONNHANDLER_CANNOT_DETERMINE_BACKLOG_320",PROTOCOL,SEVERE_ERROR,320, getClassLoader());

  /**
   * The provided LDAP filter "%s" cannot be used as a matched values filter because filters of type %s are not allowed for use in matched values filters
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MVFILTER_INVALID_LDAP_FILTER_TYPE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_MVFILTER_INVALID_LDAP_FILTER_TYPE_321",PROTOCOL,SEVERE_ERROR,321, getClassLoader());

  /**
   * The provided LDAP filter "%s" cannot be used as a matched values filter because it is an extensible match filter that contains the dnAttributes flag, which is not allowed for matched values filters
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MVFILTER_INVALID_DN_ATTRIBUTES_FLAG =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_MVFILTER_INVALID_DN_ATTRIBUTES_FLAG_322",PROTOCOL,SEVERE_ERROR,322, getClassLoader());

  /**
   * The provided matched values filter could not be decoded because there were an invalid number of elements in the attribute value assertion (expected 2, got %d)
   */
  public static final MessageDescriptor.Arg1<Number> ERR_MVFILTER_INVALID_AVA_SEQUENCE_SIZE =
          new MessageDescriptor.Arg1<Number>(BASE,"SEVERE_ERR_MVFILTER_INVALID_AVA_SEQUENCE_SIZE_323",PROTOCOL,SEVERE_ERROR,323, getClassLoader());

  /**
   * An error occurred while attempting to decode the attribute value assertion in the provided matched values filter:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MVFILTER_CANNOT_DECODE_AVA =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_MVFILTER_CANNOT_DECODE_AVA_324",PROTOCOL,SEVERE_ERROR,324, getClassLoader());

  /**
   * The provided matched values filter could not be decoded because there were an invalid number of elements in the substring sequence (expected 2, got %d)
   */
  public static final MessageDescriptor.Arg1<Number> ERR_MVFILTER_INVALID_SUBSTRING_SEQUENCE_SIZE =
          new MessageDescriptor.Arg1<Number>(BASE,"SEVERE_ERR_MVFILTER_INVALID_SUBSTRING_SEQUENCE_SIZE_325",PROTOCOL,SEVERE_ERROR,325, getClassLoader());

  /**
   * The provided matched values filter could not be decoded because there were no subInitial, subAny, or subFinal components in the substring filter
   */
  public static final MessageDescriptor.Arg0 ERR_MVFILTER_NO_SUBSTRING_ELEMENTS =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_MVFILTER_NO_SUBSTRING_ELEMENTS_326",PROTOCOL,SEVERE_ERROR,326, getClassLoader());

  /**
   * The provided matched values filter could not be decoded because there were multiple subInitial components in the substring filter
   */
  public static final MessageDescriptor.Arg0 ERR_MVFILTER_MULTIPLE_SUBINITIALS =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_MVFILTER_MULTIPLE_SUBINITIALS_327",PROTOCOL,SEVERE_ERROR,327, getClassLoader());

  /**
   * The provided matched values filter could not be decoded because there were multiple subFinal components in the substring filter
   */
  public static final MessageDescriptor.Arg0 ERR_MVFILTER_MULTIPLE_SUBFINALS =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_MVFILTER_MULTIPLE_SUBFINALS_328",PROTOCOL,SEVERE_ERROR,328, getClassLoader());

  /**
   * The provided matched values filter could not be decoded because there was an invalid element of type %s in the substring filter
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MVFILTER_INVALID_SUBSTRING_ELEMENT_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_MVFILTER_INVALID_SUBSTRING_ELEMENT_TYPE_329",PROTOCOL,SEVERE_ERROR,329, getClassLoader());

  /**
   * The provided matched values filter could not be decoded because an error occurred while decoding the substring filter component:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MVFILTER_CANNOT_DECODE_SUBSTRINGS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_MVFILTER_CANNOT_DECODE_SUBSTRINGS_330",PROTOCOL,SEVERE_ERROR,330, getClassLoader());

  /**
   * The provided matched values filter could not be decoded because an error occurred while decoding the presence filter component:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MVFILTER_CANNOT_DECODE_PRESENT_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_MVFILTER_CANNOT_DECODE_PRESENT_TYPE_331",PROTOCOL,SEVERE_ERROR,331, getClassLoader());

  /**
   * The provided matched values filter could not be decoded because there were an invalid number of elements in the extensible match sequence (expected 2 or 3, found %d)
   */
  public static final MessageDescriptor.Arg1<Number> ERR_MVFILTER_INVALID_EXTENSIBLE_SEQUENCE_SIZE =
          new MessageDescriptor.Arg1<Number>(BASE,"SEVERE_ERR_MVFILTER_INVALID_EXTENSIBLE_SEQUENCE_SIZE_332",PROTOCOL,SEVERE_ERROR,332, getClassLoader());

  /**
   * The provided matched values filter could not be decoded because there were multiple matching rule ID elements found in the extensible match filter sequence
   */
  public static final MessageDescriptor.Arg0 ERR_MVFILTER_MULTIPLE_MATCHING_RULE_IDS =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_MVFILTER_MULTIPLE_MATCHING_RULE_IDS_333",PROTOCOL,SEVERE_ERROR,333, getClassLoader());

  /**
   * The provided matched values filter could not be decoded because there were multiple attribute type elements found in the extensible match filter sequence
   */
  public static final MessageDescriptor.Arg0 ERR_MVFILTER_MULTIPLE_ATTRIBUTE_TYPES =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_MVFILTER_MULTIPLE_ATTRIBUTE_TYPES_334",PROTOCOL,SEVERE_ERROR,334, getClassLoader());

  /**
   * The provided matched values filter could not be decoded because there were multiple assertion value elements found in the extensible match filter sequence
   */
  public static final MessageDescriptor.Arg0 ERR_MVFILTER_MULTIPLE_ASSERTION_VALUES =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_MVFILTER_MULTIPLE_ASSERTION_VALUES_335",PROTOCOL,SEVERE_ERROR,335, getClassLoader());

  /**
   * The provided matched values filter could not be decoded because there was an invalid element of type %s in the extensible match filter
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MVFILTER_INVALID_EXTENSIBLE_ELEMENT_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_MVFILTER_INVALID_EXTENSIBLE_ELEMENT_TYPE_336",PROTOCOL,SEVERE_ERROR,336, getClassLoader());

  /**
   * The provided matched values filter could not be decoded because an error occurred while decoding the extensible match filter component:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MVFILTER_CANNOT_DECODE_EXTENSIBLE_MATCH =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_MVFILTER_CANNOT_DECODE_EXTENSIBLE_MATCH_337",PROTOCOL,SEVERE_ERROR,337, getClassLoader());

  /**
   * The provided matched values filter could not be decoded because it had an invalid BER type of %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MVFILTER_INVALID_ELEMENT_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_MVFILTER_INVALID_ELEMENT_TYPE_338",PROTOCOL,SEVERE_ERROR,338, getClassLoader());

  /**
   * Cannot decode the provided matched values control because it does not have a value
   */
  public static final MessageDescriptor.Arg0 ERR_MATCHEDVALUES_NO_CONTROL_VALUE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_MATCHEDVALUES_NO_CONTROL_VALUE_339",PROTOCOL,SEVERE_ERROR,339, getClassLoader());

  /**
   * Cannot decode the provided matched values control because an error occurred while attempting to decode the value as an ASN.1 sequence:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MATCHEDVALUES_CANNOT_DECODE_VALUE_AS_SEQUENCE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_MATCHEDVALUES_CANNOT_DECODE_VALUE_AS_SEQUENCE_340",PROTOCOL,SEVERE_ERROR,340, getClassLoader());

  /**
   * Cannot decode the provided matched values control because the control value does not specify any filters for use in matching attribute values
   */
  public static final MessageDescriptor.Arg0 ERR_MATCHEDVALUES_NO_FILTERS =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_MATCHEDVALUES_NO_FILTERS_341",PROTOCOL,SEVERE_ERROR,341, getClassLoader());

  /**
   * Cannot decode the provided control as a password expired control because the provided control had a value that could not be parsed as an integer
   */
  public static final MessageDescriptor.Arg0 ERR_PWEXPIRED_CONTROL_INVALID_VALUE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_PWEXPIRED_CONTROL_INVALID_VALUE_342",PROTOCOL,SEVERE_ERROR,342, getClassLoader());

  /**
   * Cannot decode the provided password expiring control because it does not have a value
   */
  public static final MessageDescriptor.Arg0 ERR_PWEXPIRING_NO_CONTROL_VALUE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_PWEXPIRING_NO_CONTROL_VALUE_343",PROTOCOL,SEVERE_ERROR,343, getClassLoader());

  /**
   * Cannot decode the provided control as a password expiring control because an error occurred while attempting to decode the number of seconds until expiration: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PWEXPIRING_CANNOT_DECODE_SECONDS_UNTIL_EXPIRATION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PWEXPIRING_CANNOT_DECODE_SECONDS_UNTIL_EXPIRATION_344",PROTOCOL,SEVERE_ERROR,344, getClassLoader());

  /**
   * The Directory Server is already processing another request on the same client connection with the same message ID of %d
   */
  public static final MessageDescriptor.Arg1<Number> WARN_LDAP_CLIENT_DUPLICATE_MESSAGE_ID =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_WARN_LDAP_CLIENT_DUPLICATE_MESSAGE_ID_345",PROTOCOL,MILD_WARNING,345, getClassLoader());

  /**
   * The Directory Server encountered an unexpected error while attempting to add the client request to the work queue:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_LDAP_CLIENT_CANNOT_ENQUEUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_WARN_LDAP_CLIENT_CANNOT_ENQUEUE_346",PROTOCOL,MILD_WARNING,346, getClassLoader());

  /**
   * TCP port on which this connection handler may accept administrative connections.  Changes to this configuration attribute will not take effect until the connection handler is disabled and re-enabled, or until the Directory Server is restarted
   */
  public static final MessageDescriptor.Arg0 INFO_JMX_CONNHANDLER_DESCRIPTION_LISTEN_PORT =
          new MessageDescriptor.Arg0(BASE,"INFO_JMX_CONNHANDLER_DESCRIPTION_LISTEN_PORT_347",PROTOCOL,INFORMATION,347, getClassLoader());

  /**
   * No listen port was defined using configuration ds-cfg-listen-port in configuration entry %s.  This is a required attribute
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_JMX_CONNHANDLER_NO_LISTEN_PORT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_JMX_CONNHANDLER_NO_LISTEN_PORT_348",PROTOCOL,SEVERE_ERROR,348, getClassLoader());

  /**
   * An unexpected error occurred while processing the ds-cfg-listen-port attribute in configuration entry %s, which is used to specify the port on which to listen for client connections:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_JMX_CONNHANDLER_CANNOT_DETERMINE_LISTEN_PORT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_JMX_CONNHANDLER_CANNOT_DETERMINE_LISTEN_PORT_349",PROTOCOL,SEVERE_ERROR,349, getClassLoader());

  /**
   * Indicates whether this connection handler should use SSL when accepting connections from clients. Changes to this configuration attribute will not take effect until the connection handler is disabled and re-enabled, or until the Directory Server is restarted
   */
  public static final MessageDescriptor.Arg0 INFO_JMX_CONNHANDLER_DESCRIPTION_USE_SSL =
          new MessageDescriptor.Arg0(BASE,"INFO_JMX_CONNHANDLER_DESCRIPTION_USE_SSL_350",PROTOCOL,INFORMATION,350, getClassLoader());

  /**
   * An unexpected error occurred while processing the ds-cfg-use-ssl attribute in configuration entry %s, which is used to indicate whether to use SSL when accepting client connections:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_JMX_CONNHANDLER_CANNOT_DETERMINE_USE_SSL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_JMX_CONNHANDLER_CANNOT_DETERMINE_USE_SSL_351",PROTOCOL,SEVERE_ERROR,351, getClassLoader());

  /**
   * Nickname of the certificate that the connection handler should use when accepting SSL-based connections or performing StartTLS negotiation.  Changes to this configuration attribute will not take effect until the connection handler is disabled and re-enabled, or until the Directory Server is restarted
   */
  public static final MessageDescriptor.Arg0 INFO_JMX_CONNHANDLER_DESCRIPTION_SSL_CERT_NICKNAME =
          new MessageDescriptor.Arg0(BASE,"INFO_JMX_CONNHANDLER_DESCRIPTION_SSL_CERT_NICKNAME_352",PROTOCOL,INFORMATION,352, getClassLoader());

  /**
   * An unexpected error occurred while processing the ds-cfg-ssl-cert-nickname attribute in configuration entry %s, which is used to specify the nickname of the certificate to use for accepting SSL/TLS connections:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_JMX_CONNHANDLER_CANNOT_DETERMINE_SSL_CERT_NICKNAME =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_JMX_CONNHANDLER_CANNOT_DETERMINE_SSL_CERT_NICKNAME_353",PROTOCOL,SEVERE_ERROR,353, getClassLoader());

  /**
   * Cannot decode the provided control as a password policy request control because the provided control had a value but the password policy request control should not have a value
   */
  public static final MessageDescriptor.Arg0 ERR_PWPOLICYREQ_CONTROL_HAS_VALUE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_PWPOLICYREQ_CONTROL_HAS_VALUE_354",PROTOCOL,SEVERE_ERROR,354, getClassLoader());

  /**
   * Cannot decode the provided password policy response control because it does not have a value
   */
  public static final MessageDescriptor.Arg0 ERR_PWPOLICYRES_NO_CONTROL_VALUE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_PWPOLICYRES_NO_CONTROL_VALUE_355",PROTOCOL,SEVERE_ERROR,355, getClassLoader());

  /**
   * Cannot decode the provided password policy response control because the warning element has an invalid type of %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PWPOLICYRES_INVALID_WARNING_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PWPOLICYRES_INVALID_WARNING_TYPE_356",PROTOCOL,SEVERE_ERROR,356, getClassLoader());

  /**
   * Cannot decode the provided password policy response control because the error element has an invalid type of %d
   */
  public static final MessageDescriptor.Arg1<Number> ERR_PWPOLICYRES_INVALID_ERROR_TYPE =
          new MessageDescriptor.Arg1<Number>(BASE,"SEVERE_ERR_PWPOLICYRES_INVALID_ERROR_TYPE_357",PROTOCOL,SEVERE_ERROR,357, getClassLoader());

  /**
   * Cannot decode the provided password policy response control because the value sequence has an element with an invalid type of %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PWPOLICYRES_INVALID_ELEMENT_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PWPOLICYRES_INVALID_ELEMENT_TYPE_358",PROTOCOL,SEVERE_ERROR,358, getClassLoader());

  /**
   * Cannot decode the provided password policy response control:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PWPOLICYRES_DECODE_ERROR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PWPOLICYRES_DECODE_ERROR_359",PROTOCOL,SEVERE_ERROR,359, getClassLoader());

  /**
   * passwordExpired
   */
  public static final MessageDescriptor.Arg0 INFO_PWPERRTYPE_DESCRIPTION_PASSWORD_EXPIRED =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPERRTYPE_DESCRIPTION_PASSWORD_EXPIRED_360",PROTOCOL,INFORMATION,360, getClassLoader());

  /**
   * accountLocked
   */
  public static final MessageDescriptor.Arg0 INFO_PWPERRTYPE_DESCRIPTION_ACCOUNT_LOCKED =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPERRTYPE_DESCRIPTION_ACCOUNT_LOCKED_361",PROTOCOL,INFORMATION,361, getClassLoader());

  /**
   * changeAfterReset
   */
  public static final MessageDescriptor.Arg0 INFO_PWPERRTYPE_DESCRIPTION_CHANGE_AFTER_RESET =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPERRTYPE_DESCRIPTION_CHANGE_AFTER_RESET_362",PROTOCOL,INFORMATION,362, getClassLoader());

  /**
   * passwordModNotAllowed
   */
  public static final MessageDescriptor.Arg0 INFO_PWPERRTYPE_DESCRIPTION_PASSWORD_MOD_NOT_ALLOWED =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPERRTYPE_DESCRIPTION_PASSWORD_MOD_NOT_ALLOWED_363",PROTOCOL,INFORMATION,363, getClassLoader());

  /**
   * mustSupplyOldPassword
   */
  public static final MessageDescriptor.Arg0 INFO_PWPERRTYPE_DESCRIPTION_MUST_SUPPLY_OLD_PASSWORD =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPERRTYPE_DESCRIPTION_MUST_SUPPLY_OLD_PASSWORD_364",PROTOCOL,INFORMATION,364, getClassLoader());

  /**
   * insufficientPasswordQuality
   */
  public static final MessageDescriptor.Arg0 INFO_PWPERRTYPE_DESCRIPTION_INSUFFICIENT_PASSWORD_QUALITY =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPERRTYPE_DESCRIPTION_INSUFFICIENT_PASSWORD_QUALITY_365",PROTOCOL,INFORMATION,365, getClassLoader());

  /**
   * passwordTooShort
   */
  public static final MessageDescriptor.Arg0 INFO_PWPERRTYPE_DESCRIPTION_PASSWORD_TOO_SHORT =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPERRTYPE_DESCRIPTION_PASSWORD_TOO_SHORT_366",PROTOCOL,INFORMATION,366, getClassLoader());

  /**
   * passwordTooYoung
   */
  public static final MessageDescriptor.Arg0 INFO_PWPERRTYPE_DESCRIPTION_PASSWORD_TOO_YOUNG =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPERRTYPE_DESCRIPTION_PASSWORD_TOO_YOUNG_367",PROTOCOL,INFORMATION,367, getClassLoader());

  /**
   * passwordInHistory
   */
  public static final MessageDescriptor.Arg0 INFO_PWPERRTYPE_DESCRIPTION_PASSWORD_IN_HISTORY =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPERRTYPE_DESCRIPTION_PASSWORD_IN_HISTORY_368",PROTOCOL,INFORMATION,368, getClassLoader());

  /**
   * timeBeforeExpiration
   */
  public static final MessageDescriptor.Arg0 INFO_PWPWARNTYPE_DESCRIPTION_TIME_BEFORE_EXPIRATION =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPWARNTYPE_DESCRIPTION_TIME_BEFORE_EXPIRATION_369",PROTOCOL,INFORMATION,369, getClassLoader());

  /**
   * graceAuthNsRemaining
   */
  public static final MessageDescriptor.Arg0 INFO_PWPWARNTYPE_DESCRIPTION_GRACE_LOGINS_REMAINING =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPWARNTYPE_DESCRIPTION_GRACE_LOGINS_REMAINING_370",PROTOCOL,INFORMATION,370, getClassLoader());

  /**
   * Unable to obtain a lock on user entry %s for the proxied authorization V1 control validation
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PROXYAUTH1_CANNOT_LOCK_USER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_PROXYAUTH1_CANNOT_LOCK_USER_371",PROTOCOL,MILD_ERROR,371, getClassLoader());

  /**
   * Use of the proxied authorization V1 control for user %s is not allowed by the password policy configuration
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PROXYAUTH1_UNUSABLE_ACCOUNT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_PROXYAUTH1_UNUSABLE_ACCOUNT_372",PROTOCOL,MILD_ERROR,372, getClassLoader());

  /**
   * Unable to obtain a lock on user entry %s for the proxied authorization V2 control validation
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PROXYAUTH2_CANNOT_LOCK_USER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_PROXYAUTH2_CANNOT_LOCK_USER_373",PROTOCOL,MILD_ERROR,373, getClassLoader());

  /**
   * Use of the proxied authorization V2 control for user %s is not allowed by the password policy configuration
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PROXYAUTH2_UNUSABLE_ACCOUNT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_PROXYAUTH2_UNUSABLE_ACCOUNT_374",PROTOCOL,MILD_ERROR,374, getClassLoader());

  /**
   * Cannot decode the provided control as an account availability request control because the provided control had a value but the account availability request control should not have a value
   */
  public static final MessageDescriptor.Arg0 ERR_ACCTUSABLEREQ_CONTROL_HAS_VALUE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_ACCTUSABLEREQ_CONTROL_HAS_VALUE_375",PROTOCOL,SEVERE_ERROR,375, getClassLoader());

  /**
   * Cannot decode the provided account availability response control because it does not have a value
   */
  public static final MessageDescriptor.Arg0 ERR_ACCTUSABLERES_NO_CONTROL_VALUE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_ACCTUSABLERES_NO_CONTROL_VALUE_376",PROTOCOL,SEVERE_ERROR,376, getClassLoader());

  /**
   * The account availability response control indicated that the account was unavailable but had an unknown unavailable element type of %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ACCTUSABLERES_UNKNOWN_UNAVAILABLE_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_ACCTUSABLERES_UNKNOWN_UNAVAILABLE_TYPE_377",PROTOCOL,SEVERE_ERROR,377, getClassLoader());

  /**
   * The account availability response control had an unknown ACCOUNT_USABLE_RESPONSE element type of %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ACCTUSABLERES_UNKNOWN_VALUE_ELEMENT_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_ACCTUSABLERES_UNKNOWN_VALUE_ELEMENT_TYPE_378",PROTOCOL,SEVERE_ERROR,378, getClassLoader());

  /**
   * Cannot decode the provided account availability response control:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ACCTUSABLERES_DECODE_ERROR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_ACCTUSABLERES_DECODE_ERROR_379",PROTOCOL,SEVERE_ERROR,379, getClassLoader());

  /**
   * Cannot decode the provided address mask prefix because an invalid value was specified. The permitted values for IPv4are 0 to32 and for IPv6 0 to128
   */
  public static final MessageDescriptor.Arg0 ERR_ADDRESSMASK_PREFIX_DECODE_ERROR =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_ADDRESSMASK_PREFIX_DECODE_ERROR_380",PROTOCOL,SEVERE_ERROR,380, getClassLoader());

  /**
   * Cannot decode the provided address mask because an prefix mask was specified with an wild card "*" match character
   */
  public static final MessageDescriptor.Arg0 ERR_ADDRESSMASK_WILDCARD_DECODE_ERROR =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_ADDRESSMASK_WILDCARD_DECODE_ERROR_381",PROTOCOL,SEVERE_ERROR,381, getClassLoader());

  /**
   * Cannot decode the provided address mask because the it has an invalid format
   */
  public static final MessageDescriptor.Arg0 ERR_ADDRESSMASK_FORMAT_DECODE_ERROR =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_ADDRESSMASK_FORMAT_DECODE_ERROR_382",PROTOCOL,SEVERE_ERROR,382, getClassLoader());

  /**
   * LDAP connection handler %s could not send a clear-text response to the client because it does not have a reference to a clear connection security provider
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_NO_CLEAR_SECURITY_PROVIDER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_NO_CLEAR_SECURITY_PROVIDER_383",PROTOCOL,MILD_ERROR,383, getClassLoader());

  /**
   * The provided LDAP attribute %s contains duplicate values
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_ATTRIBUTE_DUPLICATE_VALUES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_ATTRIBUTE_DUPLICATE_VALUES_384",PROTOCOL,MILD_ERROR,384, getClassLoader());

  /**
   * The provided LDAP search filter references unknown matching rule %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_FILTER_UNKNOWN_MATCHING_RULE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_FILTER_UNKNOWN_MATCHING_RULE_385",PROTOCOL,MILD_ERROR,385, getClassLoader());

  /**
   * The provided LDAP search filter has an assertion value but does not include either an attribute type or a matching rule ID
   */
  public static final MessageDescriptor.Arg0 ERR_LDAP_FILTER_VALUE_WITH_NO_ATTR_OR_MR =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_LDAP_FILTER_VALUE_WITH_NO_ATTR_OR_MR_386",PROTOCOL,MILD_ERROR,386, getClassLoader());

  /**
   * Unable to call select() in the LDAP connection handler:  %s.  It appears that your JVM may be susceptible to the issue described at http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=6322825, and it is unable to handle LDAP requests in its current configuration.  Please upgrade to a newer JVM that does not exhibit this behavior (Java 5.0 Update 8 or higher) or set the number of available file descriptors to a value greater than or equal to 8193 (e.g., by issuing the command 'ulimit -n 8193') before starting the Directory Server
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_REQHANDLER_DETECTED_JVM_ISSUE_CR6322825 =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"FATAL_ERR_LDAP_REQHANDLER_DETECTED_JVM_ISSUE_CR6322825_387",PROTOCOL,FATAL_ERROR,387, getClassLoader());

  /**
   * Unwilling to process the request because it contains a proxied authorization V1 control which is not marked critical.  The proxied authorization control must always have a criticality of "true"
   */
  public static final MessageDescriptor.Arg0 ERR_PROXYAUTH1_CONTROL_NOT_CRITICAL =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_PROXYAUTH1_CONTROL_NOT_CRITICAL_388",PROTOCOL,MILD_ERROR,388, getClassLoader());

  /**
   * Unwilling to process the request because it contains a proxied authorization V2 control which is not marked critical.  The proxied authorization control must always have a criticality of "true"
   */
  public static final MessageDescriptor.Arg0 ERR_PROXYAUTH2_CONTROL_NOT_CRITICAL =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_PROXYAUTH2_CONTROL_NOT_CRITICAL_389",PROTOCOL,MILD_ERROR,389, getClassLoader());

  /**
   * DN of the configuration entry for the key manager provider that should be used with this LDAP connection handler.  Changes to this attribute will take effect immediately, but only for subsequent attempts to access the key manager provider for associated client connections
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONNHANDLER_DESCRIPTION_KEYMANAGER_DN =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONNHANDLER_DESCRIPTION_KEYMANAGER_DN_390",PROTOCOL,INFORMATION,390, getClassLoader());

  /**
   * Configuration attribute ds-cfg-key-manager-provider of configuration entry %s has an invalid value %s which does not reference an enabled key manager provider
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAP_CONNHANDLER_INVALID_KEYMANAGER_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDAP_CONNHANDLER_INVALID_KEYMANAGER_DN_391",PROTOCOL,SEVERE_ERROR,391, getClassLoader());

  /**
   * An error occurred while processing the ds-cfg-key-manager-provider attribute in configuration entry %s, which is used to specify the key manager provider for use with the LDAP connection handler:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAP_CONNHANDLER_CANNOT_DETERMINE_KEYMANAGER_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDAP_CONNHANDLER_CANNOT_DETERMINE_KEYMANAGER_DN_392",PROTOCOL,SEVERE_ERROR,392, getClassLoader());

  /**
   * DN of the configuration entry for the trust manager provider that should be used with this LDAP connection handler.  Changes to this attribute will take effect immediately, but only for subsequent attempts to access the trust manager provider for associated client connections
   */
  public static final MessageDescriptor.Arg0 INFO_LDAP_CONNHANDLER_DESCRIPTION_TRUSTMANAGER_DN =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAP_CONNHANDLER_DESCRIPTION_TRUSTMANAGER_DN_393",PROTOCOL,INFORMATION,393, getClassLoader());

  /**
   * Configuration attribute ds-cfg-trust-manager-provider of configuration entry %s has an invalid value %s which does not reference an enabled trust manager provider
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAP_CONNHANDLER_INVALID_TRUSTMANAGER_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDAP_CONNHANDLER_INVALID_TRUSTMANAGER_DN_394",PROTOCOL,SEVERE_ERROR,394, getClassLoader());

  /**
   * An error occurred while processing the ds-cfg-trust-manager-provider attribute in configuration entry %s, which is used to specify the trust manager provider for use with the LDAP connection handler:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDAP_CONNHANDLER_CANNOT_DETERMINE_TRUSTMANAGER_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDAP_CONNHANDLER_CANNOT_DETERMINE_TRUSTMANAGER_DN_395",PROTOCOL,SEVERE_ERROR,395, getClassLoader());

  /**
   * The value of the ds-cfg-key-manager-provider attribute has been updated to %s in configuration entry %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_LDAP_CONNHANDLER_NEW_KEYMANAGER_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_LDAP_CONNHANDLER_NEW_KEYMANAGER_DN_396",PROTOCOL,INFORMATION,396, getClassLoader());

  /**
   * The value of the ds-cfg-trust-manager-provider attribute has been updated to %s in configuration entry %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_LDAP_CONNHANDLER_NEW_TRUSTMANAGER_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_LDAP_CONNHANDLER_NEW_TRUSTMANAGER_DN_397",PROTOCOL,INFORMATION,397, getClassLoader());

  /**
   * DN of the key manager provider that the connection handler should use when accepting SSL-based connections or performing StartTLS negotiation.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_JMX_CONNHANDLER_DESCRIPTION_KEYMANAGER_DN =
          new MessageDescriptor.Arg0(BASE,"INFO_JMX_CONNHANDLER_DESCRIPTION_KEYMANAGER_DN_398",PROTOCOL,INFORMATION,398, getClassLoader());

  /**
   * An error occurred while processing the ds-cfg-key-manager-provider attribute in configuration entry %s, because the provided key manager DN %s does not refer to an enabled key manager provider
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_JMX_CONNHANDLER_INVALID_KEYMANAGER_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_JMX_CONNHANDLER_INVALID_KEYMANAGER_DN_399",PROTOCOL,SEVERE_ERROR,399, getClassLoader());

  /**
   * An unexpected error occurred while processing the ds-cfg-key-manager-provider attribute in configuration entry %s, which is used to specify the DN of the key manager provider to use for accepting SSL/TLS connections:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_JMX_CONNHANDLER_CANNOT_DETERMINE_KEYMANAGER_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_JMX_CONNHANDLER_CANNOT_DETERMINE_KEYMANAGER_DN_400",PROTOCOL,SEVERE_ERROR,400, getClassLoader());

  /**
   * An error occurred while attempting to configure the connection security provider for the client connection:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_CONNHANDLER_CANNOT_SET_SECURITY_PROVIDER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_CONNHANDLER_CANNOT_SET_SECURITY_PROVIDER_401",PROTOCOL,MILD_ERROR,401, getClassLoader());

  /**
   * The LDAP connection handler defined in configuration entry %s is configured to use either SSL or StartTLS, but does not specify which key manager provider should be used
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_CONNHANDLER_NO_KEYMANAGER_DN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDAP_CONNHANDLER_NO_KEYMANAGER_DN_402",PROTOCOL,SEVERE_ERROR,402, getClassLoader());

  /**
   * The LDAP connection handler defined in configuration entry %s is configured to use either SSL or StartTLS, but does not specify which trust manager provider should be used
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_CONNHANDLER_NO_TRUSTMANAGER_DN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_LDAP_CONNHANDLER_NO_TRUSTMANAGER_DN_403",PROTOCOL,SEVERE_ERROR,403, getClassLoader());

  /**
   * Specifies whether to enable the LDAPS connection handler
   */
  public static final MessageDescriptor.Arg0 INFO_LDAPS_CONNHANDLER_DESCRIPTION_ENABLE =
          new MessageDescriptor.Arg0(BASE,"INFO_LDAPS_CONNHANDLER_DESCRIPTION_ENABLE_404",PROTOCOL,INFORMATION,404, getClassLoader());

  /**
   * The provided search filter "%s" could not be decoded because the NOT filter between positions %d and %d did not contain exactly one filter component
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,Number> ERR_LDAP_FILTER_NOT_EXACTLY_ONE =
          new MessageDescriptor.Arg3<CharSequence,Number,Number>(BASE,"MILD_ERR_LDAP_FILTER_NOT_EXACTLY_ONE_405",PROTOCOL,MILD_ERROR,405, getClassLoader());

  /**
   * Unable to decode the provided control as a server-side sort request control because it does not include a control value
   */
  public static final MessageDescriptor.Arg0 INFO_SORTREQ_CONTROL_NO_VALUE =
          new MessageDescriptor.Arg0(BASE,"INFO_SORTREQ_CONTROL_NO_VALUE_406",PROTOCOL,INFORMATION,406, getClassLoader());

  /**
   * Unable to process the provided server-side sort request control because it references attribute type %s which is not defined in the server schema
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_SORTREQ_CONTROL_UNDEFINED_ATTR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_SORTREQ_CONTROL_UNDEFINED_ATTR_407",PROTOCOL,INFORMATION,407, getClassLoader());

  /**
   * Unable to process the provided server-side sort request control because it references undefined ordering matching rule %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_SORTREQ_CONTROL_UNDEFINED_ORDERING_RULE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_SORTREQ_CONTROL_UNDEFINED_ORDERING_RULE_408",PROTOCOL,INFORMATION,408, getClassLoader());

  /**
   * Unable to process the provided server-side sort request control because the value sequence contains an element with an unsupported type of %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_SORTREQ_CONTROL_INVALID_SEQ_ELEMENT_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_SORTREQ_CONTROL_INVALID_SEQ_ELEMENT_TYPE_409",PROTOCOL,INFORMATION,409, getClassLoader());

  /**
   * Unable to process the provided server-side sort request control because an error occurred while attempting to decode the control value:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_SORTREQ_CONTROL_CANNOT_DECODE_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_SORTREQ_CONTROL_CANNOT_DECODE_VALUE_410",PROTOCOL,INFORMATION,410, getClassLoader());

  /**
   * Unable to decode the provided control as a server-side sort response control because it does not include a control value
   */
  public static final MessageDescriptor.Arg0 INFO_SORTRES_CONTROL_NO_VALUE =
          new MessageDescriptor.Arg0(BASE,"INFO_SORTRES_CONTROL_NO_VALUE_411",PROTOCOL,INFORMATION,411, getClassLoader());

  /**
   * Unable to process the provided server-side sort response control because an error occurred while attempting to decode the control value:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_SORTRES_CONTROL_CANNOT_DECODE_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_SORTRES_CONTROL_CANNOT_DECODE_VALUE_412",PROTOCOL,INFORMATION,412, getClassLoader());

  /**
   * Unable to process the provided server-side sort request control because the sort order string "%s" included a sort key with no attribute name
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_SORTREQ_CONTROL_NO_ATTR_NAME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_SORTREQ_CONTROL_NO_ATTR_NAME_413",PROTOCOL,INFORMATION,413, getClassLoader());

  /**
   * Unable to process the provided server-side sort request control because the sort order string "%s" included a sort key with a colon but no matching rule name
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_SORTREQ_CONTROL_NO_MATCHING_RULE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_SORTREQ_CONTROL_NO_MATCHING_RULE_414",PROTOCOL,INFORMATION,414, getClassLoader());

  /**
   * Unable to process the provided server-side sort request control because it did not contain any sort keys
   */
  public static final MessageDescriptor.Arg0 INFO_SORTREQ_CONTROL_NO_SORT_KEYS =
          new MessageDescriptor.Arg0(BASE,"INFO_SORTREQ_CONTROL_NO_SORT_KEYS_415",PROTOCOL,INFORMATION,415, getClassLoader());

  /**
   * Unable to process the provided server-side sort request control because it included attribute %s which does not have a default ordering matching rule and no ordering rule was specified in the sort key
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_SORTREQ_CONTROL_NO_ORDERING_RULE_FOR_ATTR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_SORTREQ_CONTROL_NO_ORDERING_RULE_FOR_ATTR_416",PROTOCOL,INFORMATION,416, getClassLoader());

  /**
   * Unable to decode the provided control as a VLV request control because it does not include a control value
   */
  public static final MessageDescriptor.Arg0 INFO_VLVREQ_CONTROL_NO_VALUE =
          new MessageDescriptor.Arg0(BASE,"INFO_VLVREQ_CONTROL_NO_VALUE_417",PROTOCOL,INFORMATION,417, getClassLoader());

  /**
   * Unable to decode the provided control as a VLV request control because it contains an invalid number of elements:  %d
   */
  public static final MessageDescriptor.Arg1<Number> INFO_VLVREQ_CONTROL_INVALID_ELEMENT_COUNT =
          new MessageDescriptor.Arg1<Number>(BASE,"INFO_VLVREQ_CONTROL_INVALID_ELEMENT_COUNT_418",PROTOCOL,INFORMATION,418, getClassLoader());

  /**
   * Unable to decode the provided control as a VLV request control because the target element type %s is invalid
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_VLVREQ_CONTROL_INVALID_TARGET_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_VLVREQ_CONTROL_INVALID_TARGET_TYPE_419",PROTOCOL,INFORMATION,419, getClassLoader());

  /**
   * Unable to process the provided VLV request control because an error occurred while attempting to decode the control value:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_VLVREQ_CONTROL_CANNOT_DECODE_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_VLVREQ_CONTROL_CANNOT_DECODE_VALUE_420",PROTOCOL,INFORMATION,420, getClassLoader());

  /**
   * Unable to decode the provided control as a VLV response control because it does not include a control value
   */
  public static final MessageDescriptor.Arg0 INFO_VLVRES_CONTROL_NO_VALUE =
          new MessageDescriptor.Arg0(BASE,"INFO_VLVRES_CONTROL_NO_VALUE_421",PROTOCOL,INFORMATION,421, getClassLoader());

  /**
   * Unable to decode the provided control as a VLV response control because it contains an invalid number of elements:  %d
   */
  public static final MessageDescriptor.Arg1<Number> INFO_VLVRES_CONTROL_INVALID_ELEMENT_COUNT =
          new MessageDescriptor.Arg1<Number>(BASE,"INFO_VLVRES_CONTROL_INVALID_ELEMENT_COUNT_422",PROTOCOL,INFORMATION,422, getClassLoader());

  /**
   * Unable to process the provided VLV response control because an error occurred while attempting to decode the control value:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_VLVRES_CONTROL_CANNOT_DECODE_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_VLVRES_CONTROL_CANNOT_DECODE_VALUE_423",PROTOCOL,INFORMATION,423, getClassLoader());

  /**
   * The authorization ID "%s" contained in the geteffectiverights control is invalid because it does not start with "dn:" to indicate a user DN
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_GETEFFECTIVERIGHTS_INVALID_AUTHZID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_GETEFFECTIVERIGHTS_INVALID_AUTHZID_424",PROTOCOL,INFORMATION,424, getClassLoader());

  /**
   * Cannot decode the provided geteffectiverights request control:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_GETEFFECTIVERIGHTS_DECODE_ERROR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_GETEFFECTIVERIGHTS_DECODE_ERROR_425",PROTOCOL,INFORMATION,425, getClassLoader());

  /**
   * Unable to decode authzid DN string "%s" as a valid distinguished name:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_CANNOT_DECODE_GETEFFECTIVERIGHTS_AUTHZID_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_CANNOT_DECODE_GETEFFECTIVERIGHTS_AUTHZID_DN_426",PROTOCOL,INFORMATION,426, getClassLoader());

  /**
   * An LDAP filter enclosed in apostrophes is invalid:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDAP_FILTER_ENCLOSED_IN_APOSTROPHES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDAP_FILTER_ENCLOSED_IN_APOSTROPHES_427",PROTOCOL,MILD_ERROR,427, getClassLoader());

  /**
   * Specifies whether to enable the JMX connection handler
   */
  public static final MessageDescriptor.Arg0 INFO_JMX_CONNHANDLER_DESCRIPTION_ENABLE =
          new MessageDescriptor.Arg0(BASE,"INFO_JMX_CONNHANDLER_DESCRIPTION_ENABLE_428",PROTOCOL,INFORMATION,428, getClassLoader());

  /**
   * The provided search filter contains an invalid attribute type '%s' with invalid character '%s' at position %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> ERR_LDAP_FILTER_INVALID_CHAR_IN_ATTR_TYPE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"MILD_ERR_LDAP_FILTER_INVALID_CHAR_IN_ATTR_TYPE_429",PROTOCOL,MILD_ERROR,429, getClassLoader());

  /**
   * The provided search filter "%s" could not be decoded because the extensible match component starting at position %d did not include either an attribute description or a matching rule ID.  At least one of them must be provided
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_LDAP_FILTER_EXTENSIBLE_MATCH_NO_AD_OR_MR =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_ERR_LDAP_FILTER_EXTENSIBLE_MATCH_NO_AD_OR_MR_430",PROTOCOL,MILD_ERROR,430, getClassLoader());

  /**
   * LDAPv2 clients are not allowed to use request controls
   */
  public static final MessageDescriptor.Arg0 ERR_LDAPV2_CONTROLS_NOT_ALLOWED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_LDAPV2_CONTROLS_NOT_ALLOWED_431",PROTOCOL,MILD_ERROR,431, getClassLoader());

  /**
   * The LDAP connection handler defined in configuration entry %s was unable to bind to %s:%d:  %s
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,Number,CharSequence> ERR_LDAP_CONNHANDLER_CANNOT_BIND =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,Number,CharSequence>(BASE,"SEVERE_ERR_LDAP_CONNHANDLER_CANNOT_BIND_432",PROTOCOL,SEVERE_ERROR,432, getClassLoader());

  /**
   * The JMX connection handler defined in configuration entry %s was unable to bind to port %d:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,CharSequence> ERR_JMX_CONNHANDLER_CANNOT_BIND =
          new MessageDescriptor.Arg3<CharSequence,Number,CharSequence>(BASE,"SEVERE_ERR_JMX_CONNHANDLER_CANNOT_BIND_433",PROTOCOL,SEVERE_ERROR,433, getClassLoader());

  /**
   * You do not have sufficient privileges to perform add operations through JMX
   */
  public static final MessageDescriptor.Arg0 ERR_JMX_ADD_INSUFFICIENT_PRIVILEGES =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_JMX_ADD_INSUFFICIENT_PRIVILEGES_434",PROTOCOL,MILD_ERROR,434, getClassLoader());

  /**
   * You do not have sufficient privileges to perform delete operations through JMX
   */
  public static final MessageDescriptor.Arg0 ERR_JMX_DELETE_INSUFFICIENT_PRIVILEGES =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_JMX_DELETE_INSUFFICIENT_PRIVILEGES_435",PROTOCOL,MILD_ERROR,435, getClassLoader());

  /**
   * You do not have sufficient privileges to perform modify operations through JMX
   */
  public static final MessageDescriptor.Arg0 ERR_JMX_MODIFY_INSUFFICIENT_PRIVILEGES =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_JMX_MODIFY_INSUFFICIENT_PRIVILEGES_436",PROTOCOL,MILD_ERROR,436, getClassLoader());

  /**
   * You do not have sufficient privileges to perform modify DN operations through JMX
   */
  public static final MessageDescriptor.Arg0 ERR_JMX_MODDN_INSUFFICIENT_PRIVILEGES =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_JMX_MODDN_INSUFFICIENT_PRIVILEGES_437",PROTOCOL,MILD_ERROR,437, getClassLoader());

  /**
   * You do not have sufficient privileges to perform search operations through JMX
   */
  public static final MessageDescriptor.Arg0 ERR_JMX_SEARCH_INSUFFICIENT_PRIVILEGES =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_JMX_SEARCH_INSUFFICIENT_PRIVILEGES_438",PROTOCOL,MILD_ERROR,438, getClassLoader());

  /**
   * You do not have sufficient privileges to establish the connection through JMX. At least JMX_READ privilege is required
   */
  public static final MessageDescriptor.Arg0 ERR_JMX_INSUFFICIENT_PRIVILEGES =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_JMX_INSUFFICIENT_PRIVILEGES_439",PROTOCOL,MILD_ERROR,439, getClassLoader());

  /**
   * User %s does not exist in the directory
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_INTERNALCONN_NO_SUCH_USER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_INTERNALCONN_NO_SUCH_USER_440",PROTOCOL,MILD_ERROR,440, getClassLoader());

  /**
   * This output stream has been closed
   */
  public static final MessageDescriptor.Arg0 ERR_INTERNALOS_CLOSED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_INTERNALOS_CLOSED_441",PROTOCOL,MILD_ERROR,441, getClassLoader());

  /**
   * The provided LDAP message had an invalid operation type (%s) for a request
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_INTERNALOS_INVALID_REQUEST =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_INTERNALOS_INVALID_REQUEST_442",PROTOCOL,MILD_ERROR,442, getClassLoader());

  /**
   * SASL bind operations are not supported over internal LDAP sockets
   */
  public static final MessageDescriptor.Arg0 ERR_INTERNALOS_SASL_BIND_NOT_SUPPORTED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_INTERNALOS_SASL_BIND_NOT_SUPPORTED_443",PROTOCOL,MILD_ERROR,443, getClassLoader());

  /**
   * StartTLS operations are not supported over internal LDAP sockets
   */
  public static final MessageDescriptor.Arg0 ERR_INTERNALOS_STARTTLS_NOT_SUPPORTED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_INTERNALOS_STARTTLS_NOT_SUPPORTED_444",PROTOCOL,MILD_ERROR,444, getClassLoader());

  /**
   * The value %s specified as the LDIF directory path for the LDIF connection handler defined in configuration entry %s exists but is not a directory.  The specified path must be a directory.  The LDIF connection handler will start, but will not be able to proces any changes until this path is changed to a directory
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_LDIF_CONNHANDLER_LDIF_DIRECTORY_NOT_DIRECTORY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_LDIF_CONNHANDLER_LDIF_DIRECTORY_NOT_DIRECTORY_445",PROTOCOL,SEVERE_WARNING,445, getClassLoader());

  /**
   * The directory %s referenced by the LDIF connection handler defined in configuration entry %s does not exist.  The LDIF connection handler will start, but will not be able to process any changes until this directory is created
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_LDIF_CONNHANDLER_LDIF_DIRECTORY_MISSING =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_WARN_LDIF_CONNHANDLER_LDIF_DIRECTORY_MISSING_446",PROTOCOL,MILD_WARNING,446, getClassLoader());

  /**
   * An error occurred while trying to read a change record from the LDIF file:  %s.  This change will be skipped but processing on the LDIF file will continue
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIF_CONNHANDLER_CANNOT_READ_CHANGE_RECORD_NONFATAL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDIF_CONNHANDLER_CANNOT_READ_CHANGE_RECORD_NONFATAL_447",PROTOCOL,MILD_ERROR,447, getClassLoader());

  /**
   * An error occurred while trying to read a change record from the LDIF file:  %s.  No further processing on this LDIF file can be performed
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_LDIF_CONNHANDLER_CANNOT_READ_CHANGE_RECORD_FATAL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_LDIF_CONNHANDLER_CANNOT_READ_CHANGE_RECORD_FATAL_448",PROTOCOL,MILD_ERROR,448, getClassLoader());

  /**
   * Unsupported change type %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_LDIF_CONNHANDLER_UNKNOWN_CHANGETYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_LDIF_CONNHANDLER_UNKNOWN_CHANGETYPE_449",PROTOCOL,INFORMATION,449, getClassLoader());

  /**
   * Result Code:  %d (%s)
   */
  public static final MessageDescriptor.Arg2<Number,CharSequence> INFO_LDIF_CONNHANDLER_RESULT_CODE =
          new MessageDescriptor.Arg2<Number,CharSequence>(BASE,"INFO_LDIF_CONNHANDLER_RESULT_CODE_450",PROTOCOL,INFORMATION,450, getClassLoader());

  /**
   * Additional Info:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_LDIF_CONNHANDLER_ERROR_MESSAGE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_LDIF_CONNHANDLER_ERROR_MESSAGE_451",PROTOCOL,INFORMATION,451, getClassLoader());

  /**
   * Matched DN:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_LDIF_CONNHANDLER_MATCHED_DN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_LDIF_CONNHANDLER_MATCHED_DN_452",PROTOCOL,INFORMATION,452, getClassLoader());

  /**
   * Referral URL:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_LDIF_CONNHANDLER_REFERRAL_URL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_LDIF_CONNHANDLER_REFERRAL_URL_453",PROTOCOL,INFORMATION,453, getClassLoader());

  /**
   * An I/O error occurred while the LDIF connection handler was processing LDIF file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIF_CONNHANDLER_IO_ERROR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIF_CONNHANDLER_IO_ERROR_454",PROTOCOL,SEVERE_ERROR,454, getClassLoader());

  /**
   * An error occurred while the LDIF connection handler was attempting to rename partially-processed file from %s to %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_LDIF_CONNHANDLER_CANNOT_RENAME =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIF_CONNHANDLER_CANNOT_RENAME_455",PROTOCOL,SEVERE_ERROR,455, getClassLoader());

  /**
   * An error occurred while the LDIF connection handler was attempting to delete processed file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LDIF_CONNHANDLER_CANNOT_DELETE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LDIF_CONNHANDLER_CANNOT_DELETE_456",PROTOCOL,SEVERE_ERROR,456, getClassLoader());

  /**
   * Address already in use
   */
  public static final MessageDescriptor.Arg0 ERR_CONNHANDLER_ADDRESS_INUSE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CONNHANDLER_ADDRESS_INUSE_457",PROTOCOL,SEVERE_ERROR,457, getClassLoader());

  /**
   * Cannot decode the provided subentries control because it does not have a value
   */
  public static final MessageDescriptor.Arg0 ERR_SUBENTRIES_NO_CONTROL_VALUE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_SUBENTRIES_NO_CONTROL_VALUE_458",PROTOCOL,MILD_ERROR,458, getClassLoader());

  /**
   * Cannot decode the provided subentries control because an error occurred while attempting to decode the control value:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SUBENTRIES_CANNOT_DECODE_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SUBENTRIES_CANNOT_DECODE_VALUE_459",PROTOCOL,MILD_ERROR,459, getClassLoader());

  /**
   * SNMP port on which this connection handler accepts SNMP requests.  Changes to this configuration attribute will not take effect until the connection handler is disabled and re-enabled, or until the Directory Server is restarted
   */
  public static final MessageDescriptor.Arg0 INFO_SNMP_CONNHANDLER_DESCRIPTION_LISTEN_PORT =
          new MessageDescriptor.Arg0(BASE,"INFO_SNMP_CONNHANDLER_DESCRIPTION_LISTEN_PORT_1458",PROTOCOL,INFORMATION,1458, getClassLoader());

  /**
   * No listen port was defined using configuration ds-cfg-listen-port in configuration entry %s.  This is a required attribute
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SNMP_CONNHANDLER_NO_LISTEN_PORT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_SNMP_CONNHANDLER_NO_LISTEN_PORT_1459",PROTOCOL,SEVERE_ERROR,1459, getClassLoader());

  /**
   * An unexpected error occurred while processing the ds-cfg-listen-port attribute in configuration entry %s, which is used to specify the port on which to listen for client connections:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SNMP_CONNHANDLER_CANNOT_DETERMINE_LISTEN_PORT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_SNMP_CONNHANDLER_CANNOT_DETERMINE_LISTEN_PORT_1460",PROTOCOL,SEVERE_ERROR,1460, getClassLoader());

  /**
   * An unexpected error occurred when this connection handler started
   */
  public static final MessageDescriptor.Arg0 ERR_SNMP_CONNHANDLER_CANNOT_BE_STARTED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_SNMP_CONNHANDLER_CANNOT_BE_STARTED_1461",PROTOCOL,SEVERE_ERROR,1461, getClassLoader());

  /**
   * No Configuration was defined for this connection handler. The configuration parameters ds-cfg-listen-port and ds-cfg-trap-port are required by the connection handler to start
   */
  public static final MessageDescriptor.Arg0 ERR_SNMP_CONNHANDLER_NO_CONFIGURATION =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_SNMP_CONNHANDLER_NO_CONFIGURATION_1462",PROTOCOL,SEVERE_ERROR,1462, getClassLoader());

  /**
   * Traps Destination %s is an unknown host. Traps will not be sent to this destination
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SNMP_CONNHANDLER_TRAPS_DESTINATION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_SNMP_CONNHANDLER_TRAPS_DESTINATION_1463",PROTOCOL,SEVERE_ERROR,1463, getClassLoader());

  /**
   * You do not have the appropriate OpenDMK jar files to enable the SNMP Connection Handler. Please go under http://opendmk.dev.java.net and set the opendmk-jarfile configuration parameter to set the full path of the required jdmkrt.jar file. The SNMP connection Handler didn't started
   */
  public static final MessageDescriptor.Arg0 ERR_SNMP_CONNHANDLER_NO_OPENDMK_JARFILES =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_SNMP_CONNHANDLER_NO_OPENDMK_JARFILES_1464",PROTOCOL,SEVERE_ERROR,1464, getClassLoader());

  /**
   * Cannot initialize the SNMP Connection Handler. Please check the configuration attributes
   */
  public static final MessageDescriptor.Arg0 ERR_SNMP_CONNHANDLER_BAD_CONFIGURATION =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_SNMP_CONNHANDLER_BAD_CONFIGURATION_1465",PROTOCOL,SEVERE_ERROR,1465, getClassLoader());

  /**
   * No valid trap destinations has been found. No trap will be sent
   */
  public static final MessageDescriptor.Arg0 ERR_SNMP_CONNHANDLER_NO_VALID_TRAP_DESTINATIONS =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_SNMP_CONNHANDLER_NO_VALID_TRAP_DESTINATIONS_1466",PROTOCOL,SEVERE_ERROR,1466, getClassLoader());

  /**
   * An error occured while accessing the underlying data source: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ASN1_READ_ERROR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_ASN1_READ_ERROR_1500",PROTOCOL,SEVERE_ERROR,1500, getClassLoader());

  /**
   * An unexpected end of file reached while trying to read %d bytes from the underlying data source
   */
  public static final MessageDescriptor.Arg1<Number> ERR_ASN1_EOF_ERROR =
          new MessageDescriptor.Arg1<Number>(BASE,"SEVERE_ERR_ASN1_EOF_ERROR_1501",PROTOCOL,SEVERE_ERROR,1501, getClassLoader());

  /**
   * Invalid reader state: %d
   */
  public static final MessageDescriptor.Arg1<Number> ERR_ASN1_INVALID_STATE =
          new MessageDescriptor.Arg1<Number>(BASE,"SEVERE_ERR_ASN1_INVALID_STATE_1502",PROTOCOL,SEVERE_ERROR,1502, getClassLoader());

  /**
   * Cannot decode the provided subtree delete control because it contains a value
   */
  public static final MessageDescriptor.Arg0 ERR_SUBTREE_DELETE_INVALID_CONTROL_VALUE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_SUBTREE_DELETE_INVALID_CONTROL_VALUE_1503",PROTOCOL,SEVERE_ERROR,1503, getClassLoader());

  /**
   * An error occurred while attempting to initialize the SSL context for use in the LDAP Connection Handler:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONNHANDLER_SSL_CANNOT_INITIALIZE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONNHANDLER_SSL_CANNOT_INITIALIZE_1504",PROTOCOL,SEVERE_ERROR,1504, getClassLoader());

  /**
   * The Directory Server does not support LDAP protocol version %d.  This connection will be closed
   */
  public static final MessageDescriptor.Arg1<Number> ERR_LDAP_UNSUPPORTED_PROTOCOL_VERSION =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_LDAP_UNSUPPORTED_PROTOCOL_VERSION_1505",PROTOCOL,MILD_ERROR,1505, getClassLoader());

  /**
   * The specified OpenDMK jar file '%s' could not be found.  Verify that the value set in the opendmk-jarfile configuration parameter of the SNMP connection handler is the valid path to the jdmkrt.jar file and that the file is accessible
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SNMP_CONNHANDLER_OPENDMK_JARFILES_DOES_NOT_EXIST =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_SNMP_CONNHANDLER_OPENDMK_JARFILES_DOES_NOT_EXIST_1506",PROTOCOL,SEVERE_ERROR,1506, getClassLoader());

  /**
   * The required classes could not be loaded using jar file '%s'.  Verify that the jar file is not corrupted
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SNMP_CONNHANDLER_OPENDMK_JARFILES_NOT_OPERATIONAL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_SNMP_CONNHANDLER_OPENDMK_JARFILES_NOT_OPERATIONAL_1507",PROTOCOL,SEVERE_ERROR,1507, getClassLoader());

  /**
   * Cannot decode the provided control %s because an error occurred while attempting to decode the control value:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CANNOT_DECODE_CONTROL_VALUE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CANNOT_DECODE_CONTROL_VALUE_1508",PROTOCOL,MILD_ERROR,1508, getClassLoader());

  /**
   * Cannot decode the provided entry changelog notification control because it does not have a value
   */
  public static final MessageDescriptor.Arg0 ERR_ECLN_NO_CONTROL_VALUE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_ECLN_NO_CONTROL_VALUE_1509",PROTOCOL,MILD_ERROR,1509, getClassLoader());

  /**
   * Cannot decode the provided entry changelog notification control because an error occurred while attempting to decode the control value:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ECLN_CANNOT_DECODE_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ECLN_CANNOT_DECODE_VALUE_1510",PROTOCOL,MILD_ERROR,1510, getClassLoader());

  /**
   * The connection to the Directory Server was closed while waiting for a response
   */
  public static final MessageDescriptor.Arg0 ERR_UNEXPECTED_CONNECTION_CLOSURE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_UNEXPECTED_CONNECTION_CLOSURE_1511",PROTOCOL,SEVERE_ERROR,1511, getClassLoader());


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
            Class<?> c = Class.forName("org.opends.messages.ProtocolMessages");

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
      cl = ProtocolMessages.class.getClassLoader();
    }
    return cl;
  }
}
