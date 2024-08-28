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
public final class CoreMessages {

  /** Base property for resource bundle containing messages */
  private static final String BASE = "messages/core";

  private static ClassLoader webstartClassLoader;

  // Prevent instantiation.
  private CoreMessages() {
    // Do nothing.
  }

  /**
   * Abandon requests cannot be canceled
   */
  public static final MessageDescriptor.Arg0 ERR_CANNOT_CANCEL_ABANDON =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CANNOT_CANCEL_ABANDON_1",CORE,MILD_ERROR,1, getClassLoader());

  /**
   * Bind requests cannot be canceled
   */
  public static final MessageDescriptor.Arg0 ERR_CANNOT_CANCEL_BIND =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CANNOT_CANCEL_BIND_2",CORE,MILD_ERROR,2, getClassLoader());

  /**
   * Unbind requests cannot be canceled
   */
  public static final MessageDescriptor.Arg0 ERR_CANNOT_CANCEL_UNBIND =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CANNOT_CANCEL_UNBIND_3",CORE,MILD_ERROR,3, getClassLoader());

  /**
   * Client Unbind
   */
  public static final MessageDescriptor.Arg0 INFO_DISCONNECT_DUE_TO_UNBIND =
          new MessageDescriptor.Arg0(BASE,"INFO_DISCONNECT_DUE_TO_UNBIND_4",CORE,INFORMATION,4, getClassLoader());

  /**
   * Client Disconnect
   */
  public static final MessageDescriptor.Arg0 INFO_DISCONNECT_DUE_TO_CLIENT_CLOSURE =
          new MessageDescriptor.Arg0(BASE,"INFO_DISCONNECT_DUE_TO_CLIENT_CLOSURE_5",CORE,INFORMATION,5, getClassLoader());

  /**
   * Client Connection Rejected
   */
  public static final MessageDescriptor.Arg0 INFO_DISCONNECT_DUE_TO_REJECTED_CLIENT =
          new MessageDescriptor.Arg0(BASE,"INFO_DISCONNECT_DUE_TO_REJECTED_CLIENT_6",CORE,INFORMATION,6, getClassLoader());

  /**
   * I/O Error
   */
  public static final MessageDescriptor.Arg0 INFO_DISCONNECT_DUE_TO_IO_ERROR =
          new MessageDescriptor.Arg0(BASE,"INFO_DISCONNECT_DUE_TO_IO_ERROR_7",CORE,INFORMATION,7, getClassLoader());

  /**
   * Protocol Error
   */
  public static final MessageDescriptor.Arg0 INFO_DISCONNECT_DUE_TO_PROTOCOL_ERROR =
          new MessageDescriptor.Arg0(BASE,"INFO_DISCONNECT_DUE_TO_PROTOCOL_ERROR_8",CORE,INFORMATION,8, getClassLoader());

  /**
   * Server Shutdown
   */
  public static final MessageDescriptor.Arg0 INFO_DISCONNECT_DUE_TO_SERVER_SHUTDOWN =
          new MessageDescriptor.Arg0(BASE,"INFO_DISCONNECT_DUE_TO_SERVER_SHUTDOWN_9",CORE,INFORMATION,9, getClassLoader());

  /**
   * Administrative Termination
   */
  public static final MessageDescriptor.Arg0 INFO_DISCONNECT_BY_ADMINISTRATOR =
          new MessageDescriptor.Arg0(BASE,"INFO_DISCONNECT_BY_ADMINISTRATOR_10",CORE,INFORMATION,10, getClassLoader());

  /**
   * Security Problem
   */
  public static final MessageDescriptor.Arg0 INFO_DISCONNECT_DUE_TO_SECURITY_PROBLEM =
          new MessageDescriptor.Arg0(BASE,"INFO_DISCONNECT_DUE_TO_SECURITY_PROBLEM_11",CORE,INFORMATION,11, getClassLoader());

  /**
   * Maximum Request Size Exceeded
   */
  public static final MessageDescriptor.Arg0 INFO_DISCONNECT_DUE_TO_MAX_REQUEST_SIZE =
          new MessageDescriptor.Arg0(BASE,"INFO_DISCONNECT_DUE_TO_MAX_REQUEST_SIZE_12",CORE,INFORMATION,12, getClassLoader());

  /**
   * Administrative Limit Exceeded
   */
  public static final MessageDescriptor.Arg0 INFO_DISCONNECT_DUE_TO_ADMIN_LIMIT =
          new MessageDescriptor.Arg0(BASE,"INFO_DISCONNECT_DUE_TO_ADMIN_LIMIT_13",CORE,INFORMATION,13, getClassLoader());

  /**
   * Idle Time Limit Exceeded
   */
  public static final MessageDescriptor.Arg0 INFO_DISCONNECT_DUE_TO_IDLE_TIME_LIMIT =
          new MessageDescriptor.Arg0(BASE,"INFO_DISCONNECT_DUE_TO_IDLE_TIME_LIMIT_14",CORE,INFORMATION,14, getClassLoader());

  /**
   * I/O Timeout
   */
  public static final MessageDescriptor.Arg0 INFO_DISCONNECT_DUE_TO_IO_TIMEOUT =
          new MessageDescriptor.Arg0(BASE,"INFO_DISCONNECT_DUE_TO_IO_TIMEOUT_15",CORE,INFORMATION,15, getClassLoader());

  /**
   * Connection Closed by Plugin
   */
  public static final MessageDescriptor.Arg0 INFO_DISCONNECT_BY_PLUGIN =
          new MessageDescriptor.Arg0(BASE,"INFO_DISCONNECT_BY_PLUGIN_16",CORE,INFORMATION,16, getClassLoader());

  /**
   * Unknown Closure Reason
   */
  public static final MessageDescriptor.Arg0 INFO_DISCONNECT_OTHER =
          new MessageDescriptor.Arg0(BASE,"INFO_DISCONNECT_OTHER_17",CORE,INFORMATION,17, getClassLoader());

  /**
   * access-control
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_CATEGORY_ACCESS_CONTROL =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_CATEGORY_ACCESS_CONTROL_39",CORE,INFORMATION,39, getClassLoader());

  /**
   * backend
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_CATEGORY_BACKEND =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_CATEGORY_BACKEND_40",CORE,INFORMATION,40, getClassLoader());

  /**
   * config
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_CATEGORY_CONFIG =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_CATEGORY_CONFIG_41",CORE,INFORMATION,41, getClassLoader());

  /**
   * connection
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_CATEGORY_CONNECTION_HANDLING =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_CATEGORY_CONNECTION_HANDLING_42",CORE,INFORMATION,42, getClassLoader());

  /**
   * core
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_CATEGORY_CORE_SERVER =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_CATEGORY_CORE_SERVER_43",CORE,INFORMATION,43, getClassLoader());

  /**
   * extended-op
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_CATEGORY_EXTENDED_OPERATION =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_CATEGORY_EXTENDED_OPERATION_45",CORE,INFORMATION,45, getClassLoader());

  /**
   * plugin
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_CATEGORY_PLUGIN =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_CATEGORY_PLUGIN_46",CORE,INFORMATION,46, getClassLoader());

  /**
   * request
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_CATEGORY_REQUEST_HANDLING =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_CATEGORY_REQUEST_HANDLING_47",CORE,INFORMATION,47, getClassLoader());

  /**
   * sasl
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_CATEGORY_SASL_MECHANISM =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_CATEGORY_SASL_MECHANISM_48",CORE,INFORMATION,48, getClassLoader());

  /**
   * shutdown
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_CATEGORY_SHUTDOWN =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_CATEGORY_SHUTDOWN_49",CORE,INFORMATION,49, getClassLoader());

  /**
   * startup
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_CATEGORY_STARTUP =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_CATEGORY_STARTUP_50",CORE,INFORMATION,50, getClassLoader());

  /**
   * sync
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_CATEGORY_SYNCHRONIZATION =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_CATEGORY_SYNCHRONIZATION_51",CORE,INFORMATION,51, getClassLoader());

  /**
   * fatal-error
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_SEVERITY_FATAL_ERROR =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_SEVERITY_FATAL_ERROR_54",CORE,INFORMATION,54, getClassLoader());

  /**
   * info
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_SEVERITY_INFORMATIONAL =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_SEVERITY_INFORMATIONAL_56",CORE,INFORMATION,56, getClassLoader());

  /**
   * mild-error
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_SEVERITY_MILD_ERROR =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_SEVERITY_MILD_ERROR_57",CORE,INFORMATION,57, getClassLoader());

  /**
   * mild-warning
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_SEVERITY_MILD_WARNING =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_SEVERITY_MILD_WARNING_58",CORE,INFORMATION,58, getClassLoader());

  /**
   * severe-error
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_SEVERITY_SEVERE_ERROR =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_SEVERITY_SEVERE_ERROR_59",CORE,INFORMATION,59, getClassLoader());

  /**
   * severe-warning
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_SEVERITY_SEVERE_WARNING =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_SEVERITY_SEVERE_WARNING_60",CORE,INFORMATION,60, getClassLoader());

  /**
   * Success
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_SUCCESS =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_SUCCESS_63",CORE,INFORMATION,63, getClassLoader());

  /**
   * Operations Error
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_OPERATIONS_ERROR =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_OPERATIONS_ERROR_64",CORE,INFORMATION,64, getClassLoader());

  /**
   * Protocol Error
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_PROTOCOL_ERROR =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_PROTOCOL_ERROR_65",CORE,INFORMATION,65, getClassLoader());

  /**
   * Time Limit Exceeded
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_TIME_LIMIT_EXCEEDED =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_TIME_LIMIT_EXCEEDED_66",CORE,INFORMATION,66, getClassLoader());

  /**
   * Size Limit Exceeded
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_SIZE_LIMIT_EXCEEDED =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_SIZE_LIMIT_EXCEEDED_67",CORE,INFORMATION,67, getClassLoader());

  /**
   * Compare False
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_COMPARE_FALSE =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_COMPARE_FALSE_68",CORE,INFORMATION,68, getClassLoader());

  /**
   * Compare True
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_COMPARE_TRUE =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_COMPARE_TRUE_69",CORE,INFORMATION,69, getClassLoader());

  /**
   * Authentication Method Not Supported
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_AUTH_METHOD_NOT_SUPPORTED =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_AUTH_METHOD_NOT_SUPPORTED_70",CORE,INFORMATION,70, getClassLoader());

  /**
   * Strong Authentication Required
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_STRONG_AUTH_REQUIRED =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_STRONG_AUTH_REQUIRED_71",CORE,INFORMATION,71, getClassLoader());

  /**
   * Referral
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_REFERRAL =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_REFERRAL_72",CORE,INFORMATION,72, getClassLoader());

  /**
   * Administrative Limit Exceeded
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_ADMIN_LIMIT_EXCEEDED =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_ADMIN_LIMIT_EXCEEDED_73",CORE,INFORMATION,73, getClassLoader());

  /**
   * Unavailable Critical Extension
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_UNAVAILABLE_CRITICAL_EXTENSION =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_UNAVAILABLE_CRITICAL_EXTENSION_74",CORE,INFORMATION,74, getClassLoader());

  /**
   * Confidentiality Required
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_CONFIDENTIALITY_REQUIRED =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_CONFIDENTIALITY_REQUIRED_75",CORE,INFORMATION,75, getClassLoader());

  /**
   * SASL Bind in Progress
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_SASL_BIND_IN_PROGRESS =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_SASL_BIND_IN_PROGRESS_76",CORE,INFORMATION,76, getClassLoader());

  /**
   * No Such Attribute
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_NO_SUCH_ATTRIBUTE =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_NO_SUCH_ATTRIBUTE_77",CORE,INFORMATION,77, getClassLoader());

  /**
   * Undefined Attribute Type
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_UNDEFINED_ATTRIBUTE_TYPE =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_UNDEFINED_ATTRIBUTE_TYPE_78",CORE,INFORMATION,78, getClassLoader());

  /**
   * Inappropriate Matching
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_INAPPROPRIATE_MATCHING =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_INAPPROPRIATE_MATCHING_79",CORE,INFORMATION,79, getClassLoader());

  /**
   * Constraint Violation
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_CONSTRAINT_VIOLATION =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_CONSTRAINT_VIOLATION_80",CORE,INFORMATION,80, getClassLoader());

  /**
   * Attribute or Value Exists
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_ATTRIBUTE_OR_VALUE_EXISTS =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_ATTRIBUTE_OR_VALUE_EXISTS_81",CORE,INFORMATION,81, getClassLoader());

  /**
   * Invalid Attribute Syntax
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_INVALID_ATTRIBUTE_SYNTAX =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_INVALID_ATTRIBUTE_SYNTAX_82",CORE,INFORMATION,82, getClassLoader());

  /**
   * No Such Entry
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_NO_SUCH_OBJECT =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_NO_SUCH_OBJECT_83",CORE,INFORMATION,83, getClassLoader());

  /**
   * Alias Problem
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_ALIAS_PROBLEM =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_ALIAS_PROBLEM_84",CORE,INFORMATION,84, getClassLoader());

  /**
   * Invalid DN Syntax
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_INVALID_DN_SYNTAX =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_INVALID_DN_SYNTAX_85",CORE,INFORMATION,85, getClassLoader());

  /**
   * Alias Dereferencing Problem
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_ALIAS_DEREFERENCING_PROBLEM =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_ALIAS_DEREFERENCING_PROBLEM_86",CORE,INFORMATION,86, getClassLoader());

  /**
   * Inappropriate Authentication
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_INAPPROPRIATE_AUTHENTICATION =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_INAPPROPRIATE_AUTHENTICATION_87",CORE,INFORMATION,87, getClassLoader());

  /**
   * Invalid Credentials
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_INVALID_CREDENTIALS =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_INVALID_CREDENTIALS_88",CORE,INFORMATION,88, getClassLoader());

  /**
   * Insufficient Access Rights
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_INSUFFICIENT_ACCESS_RIGHTS =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_INSUFFICIENT_ACCESS_RIGHTS_89",CORE,INFORMATION,89, getClassLoader());

  /**
   * Busy
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_BUSY =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_BUSY_90",CORE,INFORMATION,90, getClassLoader());

  /**
   * Unavailable
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_UNAVAILABLE =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_UNAVAILABLE_91",CORE,INFORMATION,91, getClassLoader());

  /**
   * Unwilling to Perform
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_UNWILLING_TO_PERFORM =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_UNWILLING_TO_PERFORM_92",CORE,INFORMATION,92, getClassLoader());

  /**
   * Loop Detected
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_LOOP_DETECT =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_LOOP_DETECT_93",CORE,INFORMATION,93, getClassLoader());

  /**
   * Naming Violation
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_NAMING_VIOLATION =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_NAMING_VIOLATION_94",CORE,INFORMATION,94, getClassLoader());

  /**
   * Object Class Violation
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_OBJECTCLASS_VIOLATION =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_OBJECTCLASS_VIOLATION_95",CORE,INFORMATION,95, getClassLoader());

  /**
   * Not Allowed on Non-Leaf
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_NOT_ALLOWED_ON_NONLEAF =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_NOT_ALLOWED_ON_NONLEAF_96",CORE,INFORMATION,96, getClassLoader());

  /**
   * Not Allowed on RDN
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_NOT_ALLOWED_ON_RDN =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_NOT_ALLOWED_ON_RDN_97",CORE,INFORMATION,97, getClassLoader());

  /**
   * Entry Already Exists
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_ENTRY_ALREADY_EXISTS =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_ENTRY_ALREADY_EXISTS_98",CORE,INFORMATION,98, getClassLoader());

  /**
   * Object Class Modifications Prohibited
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_OBJECTCLASS_MODS_PROHIBITED =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_OBJECTCLASS_MODS_PROHIBITED_99",CORE,INFORMATION,99, getClassLoader());

  /**
   * Affects Multiple DSAs
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_AFFECTS_MULTIPLE_DSAS =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_AFFECTS_MULTIPLE_DSAS_100",CORE,INFORMATION,100, getClassLoader());

  /**
   * Canceled
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_CANCELED =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_CANCELED_101",CORE,INFORMATION,101, getClassLoader());

  /**
   * No Such Operation
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_NO_SUCH_OPERATION =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_NO_SUCH_OPERATION_102",CORE,INFORMATION,102, getClassLoader());

  /**
   * Too Late
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_TOO_LATE =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_TOO_LATE_103",CORE,INFORMATION,103, getClassLoader());

  /**
   * Cannot Cancel
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_CANNOT_CANCEL =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_CANNOT_CANCEL_104",CORE,INFORMATION,104, getClassLoader());

  /**
   * Other
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_OTHER =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_OTHER_105",CORE,INFORMATION,105, getClassLoader());

  /**
   * Unable to determine the attribute usage type for attribute %s.  The server will assume that it is user-defined
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_UNKNOWN_ATTRIBUTE_USAGE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_WARN_UNKNOWN_ATTRIBUTE_USAGE_106",CORE,MILD_WARNING,106, getClassLoader());

  /**
   * Processing on this operation has been canceled because the Directory Server is shutting down
   */
  public static final MessageDescriptor.Arg0 INFO_CANCELED_BY_SHUTDOWN =
          new MessageDescriptor.Arg0(BASE,"INFO_CANCELED_BY_SHUTDOWN_107",CORE,INFORMATION,107, getClassLoader());

  /**
   * %s encountered an uncaught exception while processing operation %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_UNCAUGHT_WORKER_THREAD_EXCEPTION =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_UNCAUGHT_WORKER_THREAD_EXCEPTION_108",CORE,MILD_ERROR,108, getClassLoader());

  /**
   * %s is unexpectedly exiting when the Directory Server is not in the process of shutting down.  This likely indicates that the thread encountered an unexpected error
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_UNEXPECTED_WORKER_THREAD_EXIT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_UNEXPECTED_WORKER_THREAD_EXIT_109",CORE,SEVERE_WARNING,109, getClassLoader());

  /**
   * An unexpected error occurred while trying to create a worker thread:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CANNOT_CREATE_WORKER_THREAD =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CANNOT_CREATE_WORKER_THREAD_110",CORE,SEVERE_ERROR,110, getClassLoader());

  /**
   * The request to process this operation has been rejected because the Directory Server has already started its shutdown process
   */
  public static final MessageDescriptor.Arg0 WARN_OP_REJECTED_BY_SHUTDOWN =
          new MessageDescriptor.Arg0(BASE,"MILD_WARN_OP_REJECTED_BY_SHUTDOWN_111",CORE,MILD_WARNING,111, getClassLoader());

  /**
   * The request to process this operation has been rejected because the work queue has already reached its maximum capacity of %d pending operations
   */
  public static final MessageDescriptor.Arg1<Number> WARN_OP_REJECTED_BY_QUEUE_FULL =
          new MessageDescriptor.Arg1<Number>(BASE,"SEVERE_WARN_OP_REJECTED_BY_QUEUE_FULL_112",CORE,SEVERE_WARNING,112, getClassLoader());

  /**
   * %s was interrupted while waiting for new work:  %s.  This should not happen, but the thread will resume waiting for new work so there should be no adverse effects
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_WORKER_INTERRUPTED_WITHOUT_SHUTDOWN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_WORKER_INTERRUPTED_WITHOUT_SHUTDOWN_113",CORE,SEVERE_WARNING,113, getClassLoader());

  /**
   * An unexpected exception was caught while %s was waiting for new work:  %s.  This should not happen, but the thread will resume waiting for new work so there should be no adverse effects
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_WORKER_WAITING_UNCAUGHT_EXCEPTION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_WORKER_WAITING_UNCAUGHT_EXCEPTION_114",CORE,SEVERE_WARNING,114, getClassLoader());

  /**
   * The work queue caught an exception while trying to cancel pending operation %s when the Directory Server was shutting down:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_QUEUE_UNABLE_TO_CANCEL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_WARN_QUEUE_UNABLE_TO_CANCEL_115",CORE,MILD_WARNING,115, getClassLoader());

  /**
   * The work queue caught an exception while trying to notify %s that the Directory Server was shutting down:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_QUEUE_UNABLE_TO_NOTIFY_THREAD =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_WARN_QUEUE_UNABLE_TO_NOTIFY_THREAD_116",CORE,MILD_WARNING,116, getClassLoader());

  /**
   * Server Error
   */
  public static final MessageDescriptor.Arg0 INFO_DISCONNECT_DUE_TO_SERVER_ERROR =
          new MessageDescriptor.Arg0(BASE,"INFO_DISCONNECT_DUE_TO_SERVER_ERROR_117",CORE,INFORMATION,117, getClassLoader());

  /**
   * The Directory Server is currently running.  The configuration may not be bootstrapped while the server is online
   */
  public static final MessageDescriptor.Arg0 ERR_CANNOT_BOOTSTRAP_WHILE_RUNNING =
          new MessageDescriptor.Arg0(BASE,"FATAL_ERR_CANNOT_BOOTSTRAP_WHILE_RUNNING_118",CORE,FATAL_ERROR,118, getClassLoader());

  /**
   * Unable to load class %s to serve as the Directory Server configuration handler:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CANNOT_LOAD_CONFIG_HANDLER_CLASS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"FATAL_ERR_CANNOT_LOAD_CONFIG_HANDLER_CLASS_119",CORE,FATAL_ERROR,119, getClassLoader());

  /**
   * Unable to create an instance of class %s to serve as the Directory Server configuration handler: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CANNOT_INSTANTIATE_CONFIG_HANDLER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"FATAL_ERR_CANNOT_INSTANTIATE_CONFIG_HANDLER_120",CORE,FATAL_ERROR,120, getClassLoader());

  /**
   * An error occurred while trying to initialize the configuration handler %s using configuration file %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_CANNOT_INITIALIZE_CONFIG_HANDLER =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"FATAL_ERR_CANNOT_INITIALIZE_CONFIG_HANDLER_121",CORE,FATAL_ERROR,121, getClassLoader());

  /**
   * The Directory Server may not be started before the configuration has been bootstrapped
   */
  public static final MessageDescriptor.Arg0 ERR_CANNOT_START_BEFORE_BOOTSTRAP =
          new MessageDescriptor.Arg0(BASE,"FATAL_ERR_CANNOT_START_BEFORE_BOOTSTRAP_122",CORE,FATAL_ERROR,122, getClassLoader());

  /**
   * The Directory Server may not be started while it is already running.   Please stop the running instance before attempting to start it again
   */
  public static final MessageDescriptor.Arg0 ERR_CANNOT_START_WHILE_RUNNING =
          new MessageDescriptor.Arg0(BASE,"FATAL_ERR_CANNOT_START_WHILE_RUNNING_123",CORE,FATAL_ERROR,123, getClassLoader());

  /**
   * schema
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_CATEGORY_SCHEMA =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_CATEGORY_SCHEMA_124",CORE,INFORMATION,124, getClassLoader());

  /**
   * Unable to normalize value %s for attribute type %s because no equality matching rule is defined for that attribute
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ATTR_TYPE_NORMALIZE_NO_MR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ATTR_TYPE_NORMALIZE_NO_MR_125",CORE,MILD_ERROR,125, getClassLoader());

  /**
   * Entry %s violates the Directory Server schema configuration because it is missing attribute %s which is required by objectclass %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_ENTRY_SCHEMA_MISSING_REQUIRED_ATTR_FOR_OC =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_ENTRY_SCHEMA_MISSING_REQUIRED_ATTR_FOR_OC_126",CORE,MILD_ERROR,126, getClassLoader());

  /**
   * Entry %s violates the Directory Server schema configuration because it includes attribute %s which is not allowed by any of the objectclasses defined in that entry
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ENTRY_SCHEMA_DISALLOWED_USER_ATTR_FOR_OC =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ENTRY_SCHEMA_DISALLOWED_USER_ATTR_FOR_OC_127",CORE,MILD_ERROR,127, getClassLoader());

  /**
   * An error occurred while attempting to bootstrap the matching rule defined in class %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CANNOT_BOOTSTRAP_MATCHING_RULE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CANNOT_BOOTSTRAP_MATCHING_RULE_129",CORE,SEVERE_ERROR,129, getClassLoader());

  /**
   * An error occurred while attempting to bootstrap the attribute syntax defined in class %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CANNOT_BOOTSTRAP_SYNTAX =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CANNOT_BOOTSTRAP_SYNTAX_130",CORE,SEVERE_ERROR,130, getClassLoader());

  /**
   * notice
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_SEVERITY_NOTICE =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_SEVERITY_NOTICE_131",CORE,INFORMATION,131, getClassLoader());

  /**
   * The Directory Server is beginning the configuration bootstrapping process
   */
  public static final MessageDescriptor.Arg0 INFO_DIRECTORY_BOOTSTRAPPING =
          new MessageDescriptor.Arg0(BASE,"INFO_DIRECTORY_BOOTSTRAPPING_132",CORE,INFORMATION,132, getClassLoader());

  /**
   * The Directory Server has completed the configuration bootstrapping process
   */
  public static final MessageDescriptor.Arg0 INFO_DIRECTORY_BOOTSTRAPPED =
          new MessageDescriptor.Arg0(BASE,"INFO_DIRECTORY_BOOTSTRAPPED_133",CORE,INFORMATION,133, getClassLoader());

  /**
   * %s (build %s, R%d) starting up
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> NOTE_DIRECTORY_SERVER_STARTING =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"NOTICE_DIRECTORY_SERVER_STARTING_134",CORE,NOTICE,134, getClassLoader());

  /**
   * The Directory Server has started successfully
   */
  public static final MessageDescriptor.Arg0 NOTE_DIRECTORY_SERVER_STARTED =
          new MessageDescriptor.Arg0(BASE,"NOTICE_DIRECTORY_SERVER_STARTED_135",CORE,NOTICE,135, getClassLoader());

  /**
   * extensions
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_CATEGORY_EXTENSIONS =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_CATEGORY_EXTENSIONS_137",CORE,INFORMATION,137, getClassLoader());

  /**
   * An error occurred while attempting to create the JMX MBean server that will be used for monitoring, notification, and configuration interaction within the Directory Server:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CANNOT_CREATE_MBEAN_SERVER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"FATAL_ERR_CANNOT_CREATE_MBEAN_SERVER_138",CORE,FATAL_ERROR,138, getClassLoader());

  /**
   * The Directory Server has sent an alert notification generated by class %s (alert type %s, alert ID %s):  %s
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> NOTE_SENT_ALERT_NOTIFICATION =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"NOTICE_SENT_ALERT_NOTIFICATION_139",CORE,NOTICE,139, getClassLoader());

  /**
   * An uncaught exception during processing for thread %s has caused it to terminate abnormally.  The stack trace for that exception is:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_UNCAUGHT_THREAD_EXCEPTION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"FATAL_ERR_UNCAUGHT_THREAD_EXCEPTION_140",CORE,FATAL_ERROR,140, getClassLoader());

  /**
   * The Directory Server has started the shutdown process.  The shutdown was initiated by an instance of class %s and the reason provided for the shutdown was %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> NOTE_SERVER_SHUTDOWN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"NOTICE_SERVER_SHUTDOWN_141",CORE,NOTICE,141, getClassLoader());

  /**
   * The Directory Server shutdown hook detected that the JVM is shutting down.  This generally indicates that JVM received an external request to stop (e.g., through a kill signal)
   */
  public static final MessageDescriptor.Arg0 ERR_SHUTDOWN_DUE_TO_SHUTDOWN_HOOK =
          new MessageDescriptor.Arg0(BASE,"FATAL_ERR_SHUTDOWN_DUE_TO_SHUTDOWN_HOOK_142",CORE,FATAL_ERROR,142, getClassLoader());

  /**
   * Unable to decode the provided filter string as a search filter because the provided string was empty or null
   */
  public static final MessageDescriptor.Arg0 ERR_SEARCH_FILTER_NULL =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_SEARCH_FILTER_NULL_143",CORE,MILD_ERROR,143, getClassLoader());

  /**
   * An unexpected error occurred while attempting to decode the string "%s" as a search filter:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SEARCH_FILTER_UNCAUGHT_EXCEPTION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SEARCH_FILTER_UNCAUGHT_EXCEPTION_144",CORE,MILD_ERROR,144, getClassLoader());

  /**
   * The provided search filter "%s" had mismatched parentheses around the portion between positions %d and %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,Number> ERR_SEARCH_FILTER_MISMATCHED_PARENTHESES =
          new MessageDescriptor.Arg3<CharSequence,Number,Number>(BASE,"MILD_ERR_SEARCH_FILTER_MISMATCHED_PARENTHESES_145",CORE,MILD_ERROR,145, getClassLoader());

  /**
   * The provided search filter "%s" was missing an equal sign in the suspected simple filter component between positions %d and %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,Number> ERR_SEARCH_FILTER_NO_EQUAL_SIGN =
          new MessageDescriptor.Arg3<CharSequence,Number,Number>(BASE,"MILD_ERR_SEARCH_FILTER_NO_EQUAL_SIGN_146",CORE,MILD_ERROR,146, getClassLoader());

  /**
   * The provided search filter "%s" had an invalid escaped byte value at position %d.  A backslash in a value must be followed by two hexadecimal characters that define the byte that has been encoded
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_SEARCH_FILTER_INVALID_ESCAPED_BYTE =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_ERR_SEARCH_FILTER_INVALID_ESCAPED_BYTE_147",CORE,MILD_ERROR,147, getClassLoader());

  /**
   * The provided search filter "%s" could not be decoded because the compound filter between positions %d and %d did not start with an open parenthesis and end with a close parenthesis (they may be parentheses for different filter components)
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,Number> ERR_SEARCH_FILTER_COMPOUND_MISSING_PARENTHESES =
          new MessageDescriptor.Arg3<CharSequence,Number,Number>(BASE,"MILD_ERR_SEARCH_FILTER_COMPOUND_MISSING_PARENTHESES_148",CORE,MILD_ERROR,148, getClassLoader());

  /**
   * The provided search filter "%s" could not be decoded because the closing parenthesis at position %d did not have a corresponding open parenthesis
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_SEARCH_FILTER_NO_CORRESPONDING_OPEN_PARENTHESIS =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_ERR_SEARCH_FILTER_NO_CORRESPONDING_OPEN_PARENTHESIS_149",CORE,MILD_ERROR,149, getClassLoader());

  /**
   * The provided search filter "%s" could not be decoded because the opening parenthesis at position %d did not have a corresponding close parenthesis
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_SEARCH_FILTER_NO_CORRESPONDING_CLOSE_PARENTHESIS =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_ERR_SEARCH_FILTER_NO_CORRESPONDING_CLOSE_PARENTHESIS_150",CORE,MILD_ERROR,150, getClassLoader());

  /**
   * The provided search filter "%s" could not be decoded because the assumed substring filter value between positions %d and %d did not have any asterisk wildcard characters
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,Number> ERR_SEARCH_FILTER_SUBSTRING_NO_ASTERISKS =
          new MessageDescriptor.Arg3<CharSequence,Number,Number>(BASE,"MILD_ERR_SEARCH_FILTER_SUBSTRING_NO_ASTERISKS_151",CORE,MILD_ERROR,151, getClassLoader());

  /**
   * The provided search filter "%s" could not be decoded because the extensible match component starting at position %d did not have a colon to denote the end of the attribute type name
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_SEARCH_FILTER_EXTENSIBLE_MATCH_NO_COLON =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_ERR_SEARCH_FILTER_EXTENSIBLE_MATCH_NO_COLON_152",CORE,MILD_ERROR,152, getClassLoader());

  /**
   * Unable to determine whether entry "%s" matches filter "%s" because it contained an unknown filter type %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SEARCH_FILTER_INVALID_FILTER_TYPE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_SEARCH_FILTER_INVALID_FILTER_TYPE_153",CORE,MILD_ERROR,153, getClassLoader());

  /**
   * Unable to determine whether entry "%s" matches filter "%s" because the internal check returned an unknown result type "%s"
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SEARCH_FILTER_INVALID_RESULT_TYPE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_SEARCH_FILTER_INVALID_RESULT_TYPE_154",CORE,MILD_ERROR,154, getClassLoader());

  /**
   * Unable to determine whether entry "%s" matches filter "%s" because the set of filter components for an %s component was NULL
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SEARCH_FILTER_COMPOUND_COMPONENTS_NULL =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_SEARCH_FILTER_COMPOUND_COMPONENTS_NULL_155",CORE,MILD_ERROR,155, getClassLoader());

  /**
   * Unable to determine whether entry "%s" matches filter "%s" because the filter was nested beyond the maximum allowed depth of 100 levels
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SEARCH_FILTER_NESTED_TOO_DEEP =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SEARCH_FILTER_NESTED_TOO_DEEP_156",CORE,MILD_ERROR,156, getClassLoader());

  /**
   * Unable to determine whether entry "%s" matches filter "%s" because the NOT filter component did not include a subcomponent
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SEARCH_FILTER_NOT_COMPONENT_NULL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SEARCH_FILTER_NOT_COMPONENT_NULL_157",CORE,MILD_ERROR,157, getClassLoader());

  /**
   * Unable to determine whether entry "%s" matches filter "%s" because an equality component had a NULL attribute type
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SEARCH_FILTER_EQUALITY_NO_ATTRIBUTE_TYPE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SEARCH_FILTER_EQUALITY_NO_ATTRIBUTE_TYPE_158",CORE,MILD_ERROR,158, getClassLoader());

  /**
   * Unable to determine whether entry "%s" matches filter "%s" because an equality component for attribute %s had a NULL assertion value
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SEARCH_FILTER_EQUALITY_NO_ASSERTION_VALUE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_SEARCH_FILTER_EQUALITY_NO_ASSERTION_VALUE_159",CORE,MILD_ERROR,159, getClassLoader());

  /**
   * Unable to determine whether entry "%s" matches filter "%s" because a substring component had a NULL attribute type
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SEARCH_FILTER_SUBSTRING_NO_ATTRIBUTE_TYPE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SEARCH_FILTER_SUBSTRING_NO_ATTRIBUTE_TYPE_160",CORE,MILD_ERROR,160, getClassLoader());

  /**
   * Unable to determine whether entry "%s" matches filter "%s" because a substring component for attribute %s did not have any subInitial, subAny, or subFinal elements
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SEARCH_FILTER_SUBSTRING_NO_SUBSTRING_COMPONENTS =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_SEARCH_FILTER_SUBSTRING_NO_SUBSTRING_COMPONENTS_161",CORE,MILD_ERROR,161, getClassLoader());

  /**
   * Unable to determine whether entry "%s" matches filter "%s" because a greater-or-equal component had a NULL attribute type
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SEARCH_FILTER_GREATER_OR_EQUAL_NO_ATTRIBUTE_TYPE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SEARCH_FILTER_GREATER_OR_EQUAL_NO_ATTRIBUTE_TYPE_162",CORE,MILD_ERROR,162, getClassLoader());

  /**
   * Unable to determine whether entry "%s" matches filter "%s" because a greater-or-equal component for attribute %s had a NULL assertion value
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SEARCH_FILTER_GREATER_OR_EQUAL_NO_VALUE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_SEARCH_FILTER_GREATER_OR_EQUAL_NO_VALUE_163",CORE,MILD_ERROR,163, getClassLoader());

  /**
   * Unable to determine whether entry "%s" matches filter "%s" because a less-or-equal component had a NULL attribute type
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SEARCH_FILTER_LESS_OR_EQUAL_NO_ATTRIBUTE_TYPE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SEARCH_FILTER_LESS_OR_EQUAL_NO_ATTRIBUTE_TYPE_164",CORE,MILD_ERROR,164, getClassLoader());

  /**
   * Unable to determine whether entry "%s" matches filter "%s" because a less-or-equal component for attribute %s had a NULL assertion value
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SEARCH_FILTER_LESS_OR_EQUAL_NO_ASSERTION_VALUE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_SEARCH_FILTER_LESS_OR_EQUAL_NO_ASSERTION_VALUE_165",CORE,MILD_ERROR,165, getClassLoader());

  /**
   * Unable to determine whether entry "%s" matches filter "%s" because a presence component had a NULL attribute type
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SEARCH_FILTER_PRESENCE_NO_ATTRIBUTE_TYPE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SEARCH_FILTER_PRESENCE_NO_ATTRIBUTE_TYPE_166",CORE,MILD_ERROR,166, getClassLoader());

  /**
   * Unable to determine whether entry "%s" matches filter "%s" because an approximate component had a NULL attribute type
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SEARCH_FILTER_APPROXIMATE_NO_ATTRIBUTE_TYPE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SEARCH_FILTER_APPROXIMATE_NO_ATTRIBUTE_TYPE_167",CORE,MILD_ERROR,167, getClassLoader());

  /**
   * Unable to determine whether entry "%s" matches filter "%s" because an approximate component for attribute %s had a NULL assertion value
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SEARCH_FILTER_APPROXIMATE_NO_ASSERTION_VALUE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_SEARCH_FILTER_APPROXIMATE_NO_ASSERTION_VALUE_168",CORE,MILD_ERROR,168, getClassLoader());

  /**
   * Unable to determine whether entry "%s" matches filter "%s" because a contained extensible match filter did not have an assertion value
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SEARCH_FILTER_EXTENSIBLE_MATCH_NO_ASSERTION_VALUE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SEARCH_FILTER_EXTENSIBLE_MATCH_NO_ASSERTION_VALUE_169",CORE,MILD_ERROR,169, getClassLoader());

  /**
   * Unable to determine whether entry "%s" matches filter "%s" because a contained extensible match filter did not have either an attribute type or a matching rule ID
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SEARCH_FILTER_EXTENSIBLE_MATCH_NO_RULE_OR_TYPE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SEARCH_FILTER_EXTENSIBLE_MATCH_NO_RULE_OR_TYPE_170",CORE,MILD_ERROR,170, getClassLoader());

  /**
   * Unable to decode the provided string as a relative distinguished name because the provided string was empty or null
   */
  public static final MessageDescriptor.Arg0 ERR_RDN_DECODE_NULL =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_RDN_DECODE_NULL_171",CORE,MILD_ERROR,171, getClassLoader());

  /**
   * Unable to decode the provided string "%s" as a relative distinguished name because the string ended with an attribute type name (%s)
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_RDN_END_WITH_ATTR_NAME =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_RDN_END_WITH_ATTR_NAME_172",CORE,MILD_ERROR,172, getClassLoader());

  /**
   * Unable to decode the provided string "%s" as a relative distinguished name because the first non-blank character after the attribute type %s was not an equal sign (character read was %c)
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Character> ERR_RDN_NO_EQUAL =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Character>(BASE,"MILD_ERR_RDN_NO_EQUAL_173",CORE,MILD_ERROR,173, getClassLoader());

  /**
   * Unable to decode the provided string "%s" as a relative distinguished name because it contained an unexpected plus, comma, or semicolon at position %d, which is not allowed in an RDN
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_RDN_UNEXPECTED_COMMA =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"MILD_ERR_RDN_UNEXPECTED_COMMA_174",CORE,MILD_ERROR,174, getClassLoader());

  /**
   * Unable to decode the provided string "%s" as a relative distinguished name because an illegal character %c was found at position %d, where either the end of the string or a '+' sign were expected
   */
  public static final MessageDescriptor.Arg3<CharSequence,Character,Number> ERR_RDN_ILLEGAL_CHARACTER =
          new MessageDescriptor.Arg3<CharSequence,Character,Number>(BASE,"MILD_ERR_RDN_ILLEGAL_CHARACTER_175",CORE,MILD_ERROR,175, getClassLoader());

  /**
   * An error occurred while trying to create the Directory Server work queue:  %s.  This is an unrecoverable error and the startup process will not be able to continue
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CANNOT_CREATE_WORK_QUEUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"FATAL_ERR_CANNOT_CREATE_WORK_QUEUE_176",CORE,FATAL_ERROR,176, getClassLoader());

  /**
   * The suffix "%s" is already registered with the Directory Server with a backend of type %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CANNOT_REGISTER_DUPLICATE_SUFFIX =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CANNOT_REGISTER_DUPLICATE_SUFFIX_180",CORE,SEVERE_ERROR,180, getClassLoader());

  /**
   * The suffix "%s" is already registered with the Directory Server as a sub-suffix of the backend for suffix "%s"
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CANNOT_REGISTER_DUPLICATE_SUBSUFFIX =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CANNOT_REGISTER_DUPLICATE_SUBSUFFIX_181",CORE,SEVERE_ERROR,181, getClassLoader());

  /**
   * The private suffix "%s" is below a non-private suffix defined with a base DN of "%s".  A private sub-suffix may not exist below a non-private suffix
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CANNOT_REGISTER_PRIVATE_SUFFIX_BELOW_USER_PARENT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CANNOT_REGISTER_PRIVATE_SUFFIX_BELOW_USER_PARENT_182",CORE,SEVERE_ERROR,182, getClassLoader());

  /**
   * An error occurred while trying to retrieve the root DSE configuration entry (cn=Root DSE,cn=config) from the Directory Server configuration:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CANNOT_GET_ROOT_DSE_CONFIG_ENTRY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CANNOT_GET_ROOT_DSE_CONFIG_ENTRY_183",CORE,SEVERE_ERROR,183, getClassLoader());

  /**
   * Unable to register attribute type %s with the server schema because its OID %s conflicts with the OID of an existing attribute type %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SCHEMA_CONFLICTING_ATTRIBUTE_OID =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_CONFLICTING_ATTRIBUTE_OID_184",CORE,MILD_ERROR,184, getClassLoader());

  /**
   * Unable to register attribute type %s with the server schema because its name %s conflicts with the name of an existing attribute type %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SCHEMA_CONFLICTING_ATTRIBUTE_NAME =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_CONFLICTING_ATTRIBUTE_NAME_185",CORE,MILD_ERROR,185, getClassLoader());

  /**
   * Unable to register objectclass %s with the server schema because its OID %s conflicts with the OID of an existing objectclass %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SCHEMA_CONFLICTING_OBJECTCLASS_OID =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_CONFLICTING_OBJECTCLASS_OID_186",CORE,MILD_ERROR,186, getClassLoader());

  /**
   * Unable to register objectclass %s with the server schema because its name %s conflicts with the name of an existing objectclass %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SCHEMA_CONFLICTING_OBJECTCLASS_NAME =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_CONFLICTING_OBJECTCLASS_NAME_187",CORE,MILD_ERROR,187, getClassLoader());

  /**
   * Unable to register attribute syntax %s with the server schema because its OID %s conflicts with the OID of an existing syntax %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SCHEMA_CONFLICTING_SYNTAX_OID =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_CONFLICTING_SYNTAX_OID_188",CORE,MILD_ERROR,188, getClassLoader());

  /**
   * Unable to register matching rule %s with the server schema because its OID %s conflicts with the OID of an existing matching rule %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SCHEMA_CONFLICTING_MR_OID =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_CONFLICTING_MR_OID_189",CORE,MILD_ERROR,189, getClassLoader());

  /**
   * Unable to register matching rule %s with the server schema because its name %s conflicts with the name of an existing matching rule %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SCHEMA_CONFLICTING_MR_NAME =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_CONFLICTING_MR_NAME_190",CORE,MILD_ERROR,190, getClassLoader());

  /**
   * Unable to register matching rule use %s with the server schema because its matching rule %s conflicts with the matching rule for an existing matching rule use %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SCHEMA_CONFLICTING_MATCHING_RULE_USE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_CONFLICTING_MATCHING_RULE_USE_191",CORE,MILD_ERROR,191, getClassLoader());

  /**
   * Unable to register DIT content rule %s with the server schema because its structural objectclass %s conflicts with the structural objectclass for an existing DIT content rule %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SCHEMA_CONFLICTING_DIT_CONTENT_RULE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_CONFLICTING_DIT_CONTENT_RULE_192",CORE,MILD_ERROR,192, getClassLoader());

  /**
   * Unable to register DIT structure rule %s with the server schema because its name form %s conflicts with the name form for an existing DIT structure rule %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SCHEMA_CONFLICTING_DIT_STRUCTURE_RULE_NAME_FORM =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_CONFLICTING_DIT_STRUCTURE_RULE_NAME_FORM_193",CORE,MILD_ERROR,193, getClassLoader());

  /**
   * Unable to register DIT structure rule %s with the server schema because its rule ID %d conflicts with the rule ID for an existing DIT structure rule %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,CharSequence> ERR_SCHEMA_CONFLICTING_DIT_STRUCTURE_RULE_ID =
          new MessageDescriptor.Arg3<CharSequence,Number,CharSequence>(BASE,"MILD_ERR_SCHEMA_CONFLICTING_DIT_STRUCTURE_RULE_ID_194",CORE,MILD_ERROR,194, getClassLoader());

  /**
   * Unable to register name form %s with the server schema because its structural objectclass %s conflicts with the structural objectclass for an existing name form %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SCHEMA_CONFLICTING_NAME_FORM_OC =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_CONFLICTING_NAME_FORM_OC_195",CORE,MILD_ERROR,195, getClassLoader());

  /**
   * Unable to register name form %s with the server schema because its OID %s conflicts with the OID for an existing name form %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SCHEMA_CONFLICTING_NAME_FORM_OID =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_CONFLICTING_NAME_FORM_OID_196",CORE,MILD_ERROR,196, getClassLoader());

  /**
   * Unable to register name form %s with the server schema because its name %s conflicts with the name for an existing name form %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_SCHEMA_CONFLICTING_NAME_FORM_NAME =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_SCHEMA_CONFLICTING_NAME_FORM_NAME_197",CORE,MILD_ERROR,197, getClassLoader());

  /**
   * Entry %s violates the Directory Server schema configuration because it includes multiple conflicting structural objectclasses %s and %s.  Only a single structural objectclass is allowed in an entry
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_ENTRY_SCHEMA_MULTIPLE_STRUCTURAL_CLASSES =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_ENTRY_SCHEMA_MULTIPLE_STRUCTURAL_CLASSES_198",CORE,MILD_ERROR,198, getClassLoader());

  /**
   * Entry %s violates the Directory Server schema configuration because it does not include a structural objectclass.  All entries must contain a structural objectclass
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ENTRY_SCHEMA_NO_STRUCTURAL_CLASS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ENTRY_SCHEMA_NO_STRUCTURAL_CLASS_199",CORE,MILD_ERROR,199, getClassLoader());

  /**
   * Entry "%s" contains a value "%s" for attribute %s that is invalid according to the syntax for that attribute:  %s
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> WARN_ADD_OP_INVALID_SYNTAX =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_WARN_ADD_OP_INVALID_SYNTAX_200",CORE,SEVERE_WARNING,200, getClassLoader());

  /**
   * Entry "%s" does not contain any values for attribute "%s"
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_COMPARE_OP_NO_SUCH_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_COMPARE_OP_NO_SUCH_ATTR_201",CORE,SEVERE_WARNING,201, getClassLoader());

  /**
   * Entry "%s" does not contain any values for attribute "%s" with the specified set of options
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_COMPARE_OP_NO_SUCH_ATTR_WITH_OPTIONS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_COMPARE_OP_NO_SUCH_ATTR_WITH_OPTIONS_202",CORE,SEVERE_WARNING,202, getClassLoader());

  /**
   * The Directory Server is now stopped
   */
  public static final MessageDescriptor.Arg0 NOTE_SERVER_STOPPED =
          new MessageDescriptor.Arg0(BASE,"NOTICE_SERVER_STOPPED_203",CORE,NOTICE,203, getClassLoader());

  /**
   * %s has been stopped because the total number of worker threads in the Directory Server was reduced
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_WORKER_STOPPED_BY_REDUCED_THREADNUMBER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_WORKER_STOPPED_BY_REDUCED_THREADNUMBER_204",CORE,INFORMATION,204, getClassLoader());

  /**
   * Entry %s violates the Directory Server schema configuration because it includes multiple values for attribute %s, which is defined as a single-valued attribute
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ENTRY_SCHEMA_ATTR_SINGLE_VALUED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ENTRY_SCHEMA_ATTR_SINGLE_VALUED_205",CORE,MILD_ERROR,205, getClassLoader());

  /**
   * Entry %s violates the Directory Server schema configuration because its RDN does not contain attribute %s that is required by name form %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_ENTRY_SCHEMA_RDN_MISSING_REQUIRED_ATTR =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_ENTRY_SCHEMA_RDN_MISSING_REQUIRED_ATTR_206",CORE,MILD_ERROR,206, getClassLoader());

  /**
   * Entry %s violates the Directory Server schema configuration because its RDN contains attribute %s that is not allowed by name form %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_ENTRY_SCHEMA_RDN_DISALLOWED_ATTR =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_ENTRY_SCHEMA_RDN_DISALLOWED_ATTR_207",CORE,MILD_ERROR,207, getClassLoader());

  /**
   * Entry %s violates the Directory Server schema configuration because it is missing attribute %s which is required by DIT content rule %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_ENTRY_SCHEMA_MISSING_REQUIRED_ATTR_FOR_DCR =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_ENTRY_SCHEMA_MISSING_REQUIRED_ATTR_FOR_DCR_208",CORE,MILD_ERROR,208, getClassLoader());

  /**
   * Entry %s violates the Directory Server schema configuration because it contains attribute %s which is prohibited by DIT content rule %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_ENTRY_SCHEMA_PROHIBITED_ATTR_FOR_DCR =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_ENTRY_SCHEMA_PROHIBITED_ATTR_FOR_DCR_209",CORE,MILD_ERROR,209, getClassLoader());

  /**
   * Entry %s violates the Directory Server schema configuration because it includes attribute %s which is not in the list of allowed or required attributes for DIT content rule %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_ENTRY_SCHEMA_DISALLOWED_USER_ATTR_FOR_DCR =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_ENTRY_SCHEMA_DISALLOWED_USER_ATTR_FOR_DCR_210",CORE,MILD_ERROR,210, getClassLoader());

  /**
   * Entry %s violates the Directory Server schema configuration because it includes auxiliary objectClass %s that is not allowed by DIT content rule %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_ENTRY_SCHEMA_DISALLOWED_AUXILIARY_CLASS =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_ENTRY_SCHEMA_DISALLOWED_AUXILIARY_CLASS_211",CORE,MILD_ERROR,211, getClassLoader());

  /**
   * The Directory Server was unable to evaluate entry %s to determine whether it was compliant with the DIT structure rule configuration because it was unable to obtain a read lock on parent entry %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ENTRY_SCHEMA_DSR_COULD_NOT_LOCK_PARENT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ENTRY_SCHEMA_DSR_COULD_NOT_LOCK_PARENT_212",CORE,MILD_ERROR,212, getClassLoader());

  /**
   * The Directory Server was unable to evaluate entry %s to determine whether it was compliant with the DIT structure rule configuration because parent entry %s either does not exist or could not be retrieved
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ENTRY_SCHEMA_DSR_NO_PARENT_ENTRY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ENTRY_SCHEMA_DSR_NO_PARENT_ENTRY_213",CORE,MILD_ERROR,213, getClassLoader());

  /**
   * The Directory Server was unable to evaluate entry %s to determine whether it was compliant with the DIT rule configuration because the parent entry %s does not appear to contain a valid structural objectclass
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ENTRY_SCHEMA_DSR_NO_PARENT_OC =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ENTRY_SCHEMA_DSR_NO_PARENT_OC_214",CORE,MILD_ERROR,214, getClassLoader());

  /**
   * Entry %s violates the Directory Server schema configuration because DIT structure rule %s does not allow entries of type %s to be placed immediately below entries of type %s
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> ERR_ENTRY_SCHEMA_DSR_DISALLOWED_SUPERIOR_OC =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_ENTRY_SCHEMA_DSR_DISALLOWED_SUPERIOR_OC_215",CORE,MILD_ERROR,215, getClassLoader());

  /**
   * An unexpected error occurred while attempting to check entry %s against DIT structure rule %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_ENTRY_SCHEMA_COULD_NOT_CHECK_DSR =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_ENTRY_SCHEMA_COULD_NOT_CHECK_DSR_216",CORE,MILD_ERROR,216, getClassLoader());

  /**
   * Processing on this operation has been canceled because the Directory Server received a bind request on this connection, which requires that all operations in progress to be abandoned
   */
  public static final MessageDescriptor.Arg0 INFO_CANCELED_BY_BIND_REQUEST =
          new MessageDescriptor.Arg0(BASE,"INFO_CANCELED_BY_BIND_REQUEST_217",CORE,INFORMATION,217, getClassLoader());

  /**
   * Unable to bind to the Directory Server as user %s because no such user exists in the server
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_BIND_OPERATION_UNKNOWN_USER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_BIND_OPERATION_UNKNOWN_USER_218",CORE,MILD_ERROR,218, getClassLoader());

  /**
   * Unable to process the bind because the server was unable to obtain a read lock on the entry %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_BIND_OPERATION_CANNOT_LOCK_USER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_BIND_OPERATION_CANNOT_LOCK_USER_219",CORE,SEVERE_ERROR,219, getClassLoader());

  /**
   * A fatal error occurred when executing one of the Directory Server startup plugins:  %s (error ID %d).  The Directory Server startup process has been aborted
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_STARTUP_PLUGIN_ERROR =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"FATAL_ERR_STARTUP_PLUGIN_ERROR_220",CORE,FATAL_ERROR,220, getClassLoader());

  /**
   * Unable to bind to the Directory Server as user %s using simple authentication because that user does not have a password
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_BIND_OPERATION_NO_PASSWORD =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_BIND_OPERATION_NO_PASSWORD_221",CORE,MILD_ERROR,221, getClassLoader());

  /**
   * Unable to process the bind request because it attempted to use an unknown SASL mechanism %s that is not available in the Directory Server
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_BIND_OPERATION_UNKNOWN_SASL_MECHANISM =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_BIND_OPERATION_UNKNOWN_SASL_MECHANISM_222",CORE,MILD_ERROR,222, getClassLoader());

  /**
   * Unable to abandon the operation with message ID %d because no information is available about that operation. This could mean that the target operation has already completed or was never requested
   */
  public static final MessageDescriptor.Arg1<Number> ERR_ABANDON_OP_NO_SUCH_OPERATION =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_ABANDON_OP_NO_SUCH_OPERATION_223",CORE,MILD_ERROR,223, getClassLoader());

  /**
   * The operation was canceled because the client connection was terminated by a pre-parse plugin
   */
  public static final MessageDescriptor.Arg0 ERR_CANCELED_BY_PREPARSE_DISCONNECT =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CANCELED_BY_PREPARSE_DISCONNECT_224",CORE,SEVERE_ERROR,224, getClassLoader());

  /**
   * The operation was canceled because the client connection was terminated by a pre-operation plugin
   */
  public static final MessageDescriptor.Arg0 ERR_CANCELED_BY_PREOP_DISCONNECT =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CANCELED_BY_PREOP_DISCONNECT_225",CORE,SEVERE_ERROR,225, getClassLoader());

  /**
   * The operation was canceled because the client connection was terminated by a post-operation plugin
   */
  public static final MessageDescriptor.Arg0 ERR_CANCELED_BY_POSTOP_DISCONNECT =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CANCELED_BY_POSTOP_DISCONNECT_226",CORE,SEVERE_ERROR,226, getClassLoader());

  /**
   * The Directory Server was unable to obtain a read lock on entry %s after multiple attempts.  Processing on this operation cannot continue
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_COMPARE_CANNOT_LOCK_ENTRY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_COMPARE_CANNOT_LOCK_ENTRY_227",CORE,SEVERE_ERROR,227, getClassLoader());

  /**
   * The specified entry %s does not exist in the Directory Server
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_COMPARE_NO_SUCH_ENTRY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_COMPARE_NO_SUCH_ENTRY_228",CORE,MILD_ERROR,228, getClassLoader());

  /**
   * The operation was canceled because the client issued an abandon request (message ID %d) for this operation
   */
  public static final MessageDescriptor.Arg1<Number> INFO_CANCELED_BY_ABANDON_REQUEST =
          new MessageDescriptor.Arg1<Number>(BASE,"INFO_CANCELED_BY_ABANDON_REQUEST_229",CORE,INFORMATION,229, getClassLoader());

  /**
   * The provided entry cannot be added because it contains a null DN.  This DN is reserved for the root DSE, and that entry may not be added over protocol
   */
  public static final MessageDescriptor.Arg0 ERR_ADD_CANNOT_ADD_ROOT_DSE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_ADD_CANNOT_ADD_ROOT_DSE_230",CORE,MILD_ERROR,230, getClassLoader());

  /**
   * The provided entry %s cannot be added because it does not have a parent and is not defined as one of the suffixes within the Directory Server
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ADD_ENTRY_NOT_SUFFIX =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ADD_ENTRY_NOT_SUFFIX_231",CORE,MILD_ERROR,231, getClassLoader());

  /**
   * Entry %s cannot be added because the server failed to obtain a read lock on the parent entry %s after multiple attempts
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ADD_CANNOT_LOCK_PARENT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_ADD_CANNOT_LOCK_PARENT_232",CORE,SEVERE_ERROR,232, getClassLoader());

  /**
   * Entry %s cannot be added because its parent entry %s does not exist in the server
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ADD_NO_PARENT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ADD_NO_PARENT_233",CORE,MILD_ERROR,233, getClassLoader());

  /**
   * Entry %s cannot be added because the server failed to obtain a write lock for this entry after multiple attempts
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ADD_CANNOT_LOCK_ENTRY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_ADD_CANNOT_LOCK_ENTRY_234",CORE,SEVERE_ERROR,234, getClassLoader());

  /**
   * Entry %s cannot be removed because the server failed to obtain a write lock for this entry after multiple attempts
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DELETE_CANNOT_LOCK_ENTRY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DELETE_CANNOT_LOCK_ENTRY_235",CORE,SEVERE_ERROR,235, getClassLoader());

  /**
   * The operation was canceled because the client connection was terminated by a search result entry plugin working on entry %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CANCELED_BY_SEARCH_ENTRY_DISCONNECT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CANCELED_BY_SEARCH_ENTRY_DISCONNECT_236",CORE,SEVERE_ERROR,236, getClassLoader());

  /**
   * The operation was canceled because the client connection was terminated by a search result reference plugin working on referral %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CANCELED_BY_SEARCH_REF_DISCONNECT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CANCELED_BY_SEARCH_REF_DISCONNECT_237",CORE,SEVERE_ERROR,237, getClassLoader());

  /**
   * The maximum time limit of %d seconds for processing this search operation has expired
   */
  public static final MessageDescriptor.Arg1<Number> ERR_SEARCH_TIME_LIMIT_EXCEEDED =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_SEARCH_TIME_LIMIT_EXCEEDED_238",CORE,MILD_ERROR,238, getClassLoader());

  /**
   * This search operation has sent the maximum of %d entries to the client
   */
  public static final MessageDescriptor.Arg1<Number> ERR_SEARCH_SIZE_LIMIT_EXCEEDED =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_SEARCH_SIZE_LIMIT_EXCEEDED_239",CORE,MILD_ERROR,239, getClassLoader());

  /**
   * The entry %s specified as the search base does not exist in the Directory Server
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SEARCH_BASE_DOESNT_EXIST =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SEARCH_BASE_DOESNT_EXIST_240",CORE,MILD_ERROR,240, getClassLoader());

  /**
   * Entry %s does not exist in the Directory Server
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DELETE_NO_SUCH_ENTRY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_DELETE_NO_SUCH_ENTRY_241",CORE,MILD_ERROR,241, getClassLoader());

  /**
   * Entry %s cannot be removed because the backend that should contain that entry has a subordinate backend with a base DN of %s that is below the target DN
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_DELETE_HAS_SUB_BACKEND =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_DELETE_HAS_SUB_BACKEND_242",CORE,MILD_ERROR,242, getClassLoader());

  /**
   * A modify DN operation cannot be performed on entry %s because the new RDN would not have a parent DN
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MODDN_NO_PARENT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_MODDN_NO_PARENT_243",CORE,MILD_ERROR,243, getClassLoader());

  /**
   * The modify DN operation for entry %s cannot be performed because no backend is registered to handle that DN
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MODDN_NO_BACKEND_FOR_CURRENT_ENTRY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_MODDN_NO_BACKEND_FOR_CURRENT_ENTRY_244",CORE,MILD_ERROR,244, getClassLoader());

  /**
   * The modify DN operation for entry %s cannot be performed because no backend is registered to handle the new DN %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MODDN_NO_BACKEND_FOR_NEW_ENTRY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_MODDN_NO_BACKEND_FOR_NEW_ENTRY_245",CORE,MILD_ERROR,245, getClassLoader());

  /**
   * The modify DN operation for entry %s cannot be performed because the backend holding the current entry is different from the backend used to handle the new DN %s.  Modify DN operations may not span multiple backends
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MODDN_DIFFERENT_BACKENDS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_MODDN_DIFFERENT_BACKENDS_246",CORE,MILD_ERROR,246, getClassLoader());

  /**
   * The modify DN operation for entry %s cannot be performed because the server was unable to obtain a write lock for that DN
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MODDN_CANNOT_LOCK_CURRENT_DN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_MODDN_CANNOT_LOCK_CURRENT_DN_247",CORE,SEVERE_ERROR,247, getClassLoader());

  /**
   * The modify DN operation for entry %s cannot be performed because an exception was caught while attempting to obtain a write lock for new DN %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_MODDN_EXCEPTION_LOCKING_NEW_DN =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_MODDN_EXCEPTION_LOCKING_NEW_DN_248",CORE,SEVERE_ERROR,248, getClassLoader());

  /**
   * The modify DN operation for entry %s cannot be performed because the server was unable to obtain a write lock for the new DN %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MODDN_CANNOT_LOCK_NEW_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_MODDN_CANNOT_LOCK_NEW_DN_249",CORE,SEVERE_ERROR,249, getClassLoader());

  /**
   * The modify DN operation for entry %s cannot be performed because that entry does not exist in the server
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MODDN_NO_CURRENT_ENTRY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_MODDN_NO_CURRENT_ENTRY_250",CORE,MILD_ERROR,250, getClassLoader());

  /**
   * Entry %s cannot be modified because the server failed to obtain a write lock for this entry after multiple attempts
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MODIFY_CANNOT_LOCK_ENTRY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_MODIFY_CANNOT_LOCK_ENTRY_251",CORE,SEVERE_ERROR,251, getClassLoader());

  /**
   * Entry %s cannot be modified because no such entry exists in the server
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MODIFY_NO_SUCH_ENTRY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_MODIFY_NO_SUCH_ENTRY_252",CORE,MILD_ERROR,252, getClassLoader());

  /**
   * Entry %s cannot be modified because the modification contained an add component for attribute %s but no values were provided
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MODIFY_ADD_NO_VALUES =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_MODIFY_ADD_NO_VALUES_253",CORE,MILD_ERROR,253, getClassLoader());

  /**
   * When attempting to modify entry %s to add one or more values for attribute %s, value "%s" was found to be invalid according to the associated syntax:  %s
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> ERR_MODIFY_ADD_INVALID_SYNTAX =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_MODIFY_ADD_INVALID_SYNTAX_254",CORE,MILD_ERROR,254, getClassLoader());

  /**
   * Entry %s cannot be modified because it would have resulted in one or more duplicate values for attribute %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_MODIFY_ADD_DUPLICATE_VALUE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_MODIFY_ADD_DUPLICATE_VALUE_255",CORE,MILD_ERROR,255, getClassLoader());

  /**
   * Entry %s cannot be modified because the change to attribute %s would have removed a value used in the RDN
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MODIFY_DELETE_RDN_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_MODIFY_DELETE_RDN_ATTR_256",CORE,MILD_ERROR,256, getClassLoader());

  /**
   * Entry %s cannot be modified because the attempt to update attribute %s would have removed one or more values from the attribute that were not present:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_MODIFY_DELETE_MISSING_VALUES =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_MODIFY_DELETE_MISSING_VALUES_257",CORE,MILD_ERROR,257, getClassLoader());

  /**
   * Entry %s cannot be modified because an attempt was made to remove one or more values from attribute %s but this attribute is not present in the entry
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MODIFY_DELETE_NO_SUCH_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_MODIFY_DELETE_NO_SUCH_ATTR_258",CORE,MILD_ERROR,258, getClassLoader());

  /**
   * When attempting to modify entry %s to replace the set of values for attribute %s, value "%s" was found to be invalid according to the associated syntax:  %s
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> ERR_MODIFY_REPLACE_INVALID_SYNTAX =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_MODIFY_REPLACE_INVALID_SYNTAX_259",CORE,MILD_ERROR,259, getClassLoader());

  /**
   * Entry %s cannot be modified because an attempt was made to increment the value of attribute %s which is used as an RDN attribute for the entry
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MODIFY_INCREMENT_RDN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_MODIFY_INCREMENT_RDN_260",CORE,MILD_ERROR,260, getClassLoader());

  /**
   * Entry %s cannot be modified because an attempt was made to increment the value of attribute %s but the request did not include a value for that attribute specifying the amount by which to increment the value
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MODIFY_INCREMENT_REQUIRES_VALUE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_MODIFY_INCREMENT_REQUIRES_VALUE_261",CORE,MILD_ERROR,261, getClassLoader());

  /**
   * Entry %s cannot be modified because an attempt was made to increment the value of attribute %s but the request contained multiple values, where only a single integer value is allowed
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MODIFY_INCREMENT_REQUIRES_SINGLE_VALUE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_MODIFY_INCREMENT_REQUIRES_SINGLE_VALUE_262",CORE,MILD_ERROR,262, getClassLoader());

  /**
   * Entry %s cannot be modified because an attempt was made to increment the value of attribute %s but the value "%s" contained in the request could not be parsed as an integer
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_MODIFY_INCREMENT_PROVIDED_VALUE_NOT_INTEGER =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_MODIFY_INCREMENT_PROVIDED_VALUE_NOT_INTEGER_263",CORE,MILD_ERROR,263, getClassLoader());

  /**
   * Entry %s cannot be modified because an attempt was made to increment the value of attribute %s but that attribute did not have any values in the target entry
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MODIFY_INCREMENT_REQUIRES_EXISTING_VALUE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_MODIFY_INCREMENT_REQUIRES_EXISTING_VALUE_264",CORE,MILD_ERROR,264, getClassLoader());

  /**
   * Entry %s cannot be modified because an attempt was made to increment the value of attribute %s but the value "%s" could not be parsed as an integer
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_MODIFY_INCREMENT_REQUIRES_INTEGER_VALUE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_MODIFY_INCREMENT_REQUIRES_INTEGER_VALUE_265",CORE,MILD_ERROR,265, getClassLoader());

  /**
   * Entry %s cannot not be modified because the resulting entry would have violated the server schema:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MODIFY_VIOLATES_SCHEMA =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_MODIFY_VIOLATES_SCHEMA_266",CORE,MILD_ERROR,266, getClassLoader());

  /**
   * Entry %s cannot be modified because there is no backend registered to handle operations for that entry
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MODIFY_NO_BACKEND_FOR_ENTRY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_MODIFY_NO_BACKEND_FOR_ENTRY_267",CORE,MILD_ERROR,267, getClassLoader());

  /**
   * There is no extended operation handler registered with the Directory Server for handling extended operations with a request OID of %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_EXTENDED_NO_HANDLER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_EXTENDED_NO_HANDLER_268",CORE,MILD_ERROR,268, getClassLoader());

  /**
   * Entry %s violates the Directory Server schema configuration because it contains an unknown objectclass %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ENTRY_SCHEMA_UNKNOWN_OC =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ENTRY_SCHEMA_UNKNOWN_OC_269",CORE,MILD_ERROR,269, getClassLoader());

  /**
   * An unexpected error was encountered while processing a search in one of the Directory Server backends:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SEARCH_BACKEND_EXCEPTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SEARCH_BACKEND_EXCEPTION_270",CORE,MILD_ERROR,270, getClassLoader());

  /**
   * The modify DN operation for entry %s cannot be performed because the change would have violated the server schema: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MODDN_VIOLATES_SCHEMA =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_MODDN_VIOLATES_SCHEMA_271",CORE,MILD_ERROR,271, getClassLoader());

  /**
   * The Directory Server is shutting down
   */
  public static final MessageDescriptor.Arg0 INFO_CONNHANDLER_CLOSED_BY_SHUTDOWN =
          new MessageDescriptor.Arg0(BASE,"INFO_CONNHANDLER_CLOSED_BY_SHUTDOWN_272",CORE,INFORMATION,272, getClassLoader());

  /**
   * The connection handler that accepted this connection has been disabled
   */
  public static final MessageDescriptor.Arg0 INFO_CONNHANDLER_CLOSED_BY_DISABLE =
          new MessageDescriptor.Arg0(BASE,"INFO_CONNHANDLER_CLOSED_BY_DISABLE_273",CORE,INFORMATION,273, getClassLoader());

  /**
   * The connection handler that accepted this connection has been removed from the server
   */
  public static final MessageDescriptor.Arg0 INFO_CONNHANDLER_CLOSED_BY_DELETE =
          new MessageDescriptor.Arg0(BASE,"INFO_CONNHANDLER_CLOSED_BY_DELETE_274",CORE,INFORMATION,274, getClassLoader());

  /**
   * Object class %s cannot be used in entry %s because that class is not defined in the Directory Server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ENTRY_SET_UNKNOWN_OC =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ENTRY_SET_UNKNOWN_OC_275",CORE,MILD_ERROR,275, getClassLoader());

  /**
   * Object class %s cannot be added to entry %s because that class is not defined in the Directory Server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ENTRY_ADD_UNKNOWN_OC =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ENTRY_ADD_UNKNOWN_OC_276",CORE,MILD_ERROR,276, getClassLoader());

  /**
   * Object class %s is already present in entry %s and cannot be added a second time
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ENTRY_ADD_DUPLICATE_OC =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ENTRY_ADD_DUPLICATE_OC_277",CORE,MILD_ERROR,277, getClassLoader());

  /**
   * Password with unknown storage scheme %s included in user entry %s will be ignored
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_BIND_OPERATION_UNKNOWN_STORAGE_SCHEME =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_BIND_OPERATION_UNKNOWN_STORAGE_SCHEME_278",CORE,MILD_ERROR,278, getClassLoader());

  /**
   * The password provided by the user did not match any password(s) stored in the user's entry
   */
  public static final MessageDescriptor.Arg0 ERR_BIND_OPERATION_WRONG_PASSWORD =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_BIND_OPERATION_WRONG_PASSWORD_279",CORE,MILD_ERROR,279, getClassLoader());

  /**
   * An unexpected error occurred while attempting to validate the provided password:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_BIND_OPERATION_PASSWORD_VALIDATION_EXCEPTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_BIND_OPERATION_PASSWORD_VALIDATION_EXCEPTION_280",CORE,MILD_ERROR,280, getClassLoader());

  /**
   * Fully-qualified name of the Java class to use as the Directory Server configuration handler
   */
  public static final MessageDescriptor.Arg0 INFO_DSCORE_DESCRIPTION_CONFIG_CLASS =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCORE_DESCRIPTION_CONFIG_CLASS_281",CORE,INFORMATION,281, getClassLoader());

  /**
   * Path to the file containing the information needed by the configuration handler to obtain the Directory Server configuration
   */
  public static final MessageDescriptor.Arg0 INFO_DSCORE_DESCRIPTION_CONFIG_FILE =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCORE_DESCRIPTION_CONFIG_FILE_282",CORE,INFORMATION,282, getClassLoader());

  /**
   * Display extended Directory Server version information
   */
  public static final MessageDescriptor.Arg0 INFO_DSCORE_DESCRIPTION_FULLVERSION =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCORE_DESCRIPTION_FULLVERSION_284",CORE,INFORMATION,284, getClassLoader());

  /**
   * Display general system information
   */
  public static final MessageDescriptor.Arg0 INFO_DSCORE_DESCRIPTION_SYSINFO =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCORE_DESCRIPTION_SYSINFO_285",CORE,INFORMATION,285, getClassLoader());

  /**
   * Dump a list of all defined messages
   */
  public static final MessageDescriptor.Arg0 INFO_DSCORE_DESCRIPTION_DUMPMESSAGES =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCORE_DESCRIPTION_DUMPMESSAGES_286",CORE,INFORMATION,286, getClassLoader());

  /**
   * Display this usage information
   */
  public static final MessageDescriptor.Arg0 INFO_DSCORE_DESCRIPTION_USAGE =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCORE_DESCRIPTION_USAGE_287",CORE,INFORMATION,287, getClassLoader());

  /**
   * An error occurred while attempting to initialize the command-line arguments:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCORE_CANNOT_INITIALIZE_ARGS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"FATAL_ERR_DSCORE_CANNOT_INITIALIZE_ARGS_288",CORE,FATAL_ERROR,288, getClassLoader());

  /**
   * An error occurred while attempting to parse the provided set of command line arguments:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCORE_ERROR_PARSING_ARGS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"FATAL_ERR_DSCORE_ERROR_PARSING_ARGS_289",CORE,FATAL_ERROR,289, getClassLoader());

  /**
   * An error occurred while attempting to bootstrap the Directory Server:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCORE_CANNOT_BOOTSTRAP =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"FATAL_ERR_DSCORE_CANNOT_BOOTSTRAP_290",CORE,FATAL_ERROR,290, getClassLoader());

  /**
   * An error occurred while trying to start the Directory Server:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCORE_CANNOT_START =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"FATAL_ERR_DSCORE_CANNOT_START_291",CORE,FATAL_ERROR,291, getClassLoader());

  /**
   * The line "%s" associated with the backup information in directory %s could not be parsed because it did not contain an equal sign to delimit the property name from the value
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_BACKUPINFO_NO_DELIMITER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_BACKUPINFO_NO_DELIMITER_292",CORE,SEVERE_ERROR,292, getClassLoader());

  /**
   * The line "%s" associated with the backup information in directory %s could not be parsed because it did not include a property name
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_BACKUPINFO_NO_NAME =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_BACKUPINFO_NO_NAME_293",CORE,SEVERE_ERROR,293, getClassLoader());

  /**
   * The backup information structure in directory %s could not be parsed because it contained multiple backup IDs (%s and %s)
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_BACKUPINFO_MULTIPLE_BACKUP_IDS =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_BACKUPINFO_MULTIPLE_BACKUP_IDS_294",CORE,SEVERE_ERROR,294, getClassLoader());

  /**
   * The backup information structure in directory %s could not be parsed because it contained an unknown property %s with value %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_BACKUPINFO_UNKNOWN_PROPERTY =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_BACKUPINFO_UNKNOWN_PROPERTY_295",CORE,SEVERE_ERROR,295, getClassLoader());

  /**
   * An unexpected error occurred while trying to decode a backup information structure in directory %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_BACKUPINFO_CANNOT_DECODE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_BACKUPINFO_CANNOT_DECODE_296",CORE,SEVERE_ERROR,296, getClassLoader());

  /**
   * Unable to decode a backup information structure in directory %s because the structure did not include a backup ID
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_BACKUPINFO_NO_BACKUP_ID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_BACKUPINFO_NO_BACKUP_ID_297",CORE,SEVERE_ERROR,297, getClassLoader());

  /**
   * The backup information structure with backup ID %s in directory %s was not valid because it did not contain the backup date
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_BACKUPINFO_NO_BACKUP_DATE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_BACKUPINFO_NO_BACKUP_DATE_298",CORE,SEVERE_ERROR,298, getClassLoader());

  /**
   * Cannot add a backup with ID %s to backup directory %s because another backup already exists with that ID
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_BACKUPDIRECTORY_ADD_DUPLICATE_ID =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_BACKUPDIRECTORY_ADD_DUPLICATE_ID_299",CORE,SEVERE_ERROR,299, getClassLoader());

  /**
   * Cannot remove backup %s from backup directory %s because no backup with that ID exists in that directory
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_BACKUPDIRECTORY_NO_SUCH_BACKUP =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_BACKUPDIRECTORY_NO_SUCH_BACKUP_300",CORE,SEVERE_ERROR,300, getClassLoader());

  /**
   * Cannot remove backup %s from backup directory %s because it is listed as a dependency for backup %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_BACKUPDIRECTORY_UNRESOLVED_DEPENDENCY =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_BACKUPDIRECTORY_UNRESOLVED_DEPENDENCY_301",CORE,SEVERE_ERROR,301, getClassLoader());

  /**
   * Backup directory %s does not exist and an error occurred while attempting to create it:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_BACKUPDIRECTORY_CANNOT_CREATE_DIRECTORY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_BACKUPDIRECTORY_CANNOT_CREATE_DIRECTORY_302",CORE,SEVERE_ERROR,302, getClassLoader());

  /**
   * The backup directory path %s exists but does not reference a directory
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_BACKUPDIRECTORY_NOT_DIRECTORY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_BACKUPDIRECTORY_NOT_DIRECTORY_303",CORE,SEVERE_ERROR,303, getClassLoader());

  /**
   * An error occurred while trying to remove saved backup descriptor file %s:  %s.  The new backup descriptor has been written to %s but will not be used until it is manually renamed to %s
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> ERR_BACKUPDIRECTORY_CANNOT_DELETE_SAVED_DESCRIPTOR =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_BACKUPDIRECTORY_CANNOT_DELETE_SAVED_DESCRIPTOR_304",CORE,SEVERE_ERROR,304, getClassLoader());

  /**
   * An error occurred while trying to rename the current backup descriptor file %s to %s: %s.  The new backup descriptor has been written to %s but will not be used until it is manually renamed to %s
   */
  public static final MessageDescriptor.Arg5<CharSequence,CharSequence,CharSequence,CharSequence,CharSequence> ERR_BACKUPDIRECTORY_CANNOT_RENAME_CURRENT_DESCRIPTOR =
          new MessageDescriptor.Arg5<CharSequence,CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_BACKUPDIRECTORY_CANNOT_RENAME_CURRENT_DESCRIPTOR_305",CORE,SEVERE_ERROR,305, getClassLoader());

  /**
   * An error occurred while trying to rename the new backup descriptor file %s to %s:  %s.  The new backup descriptor will not be used until it is manually renamed
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_BACKUPDIRECTORY_CANNOT_RENAME_NEW_DESCRIPTOR =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_BACKUPDIRECTORY_CANNOT_RENAME_NEW_DESCRIPTOR_306",CORE,SEVERE_ERROR,306, getClassLoader());

  /**
   * No backup directory descriptor file was found at %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_BACKUPDIRECTORY_NO_DESCRIPTOR_FILE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_BACKUPDIRECTORY_NO_DESCRIPTOR_FILE_307",CORE,SEVERE_ERROR,307, getClassLoader());

  /**
   * The backup descriptor file %s is invalid because the first line should have contained the DN of the backend configuration entry but was blank
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_BACKUPDIRECTORY_CANNOT_READ_CONFIG_ENTRY_DN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_BACKUPDIRECTORY_CANNOT_READ_CONFIG_ENTRY_DN_308",CORE,SEVERE_ERROR,308, getClassLoader());

  /**
   * The backup descriptor file %s is invalid because the first line of the file was "%s", but the DN of the backend configuration entry was expected
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_BACKUPDIRECTORY_FIRST_LINE_NOT_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_BACKUPDIRECTORY_FIRST_LINE_NOT_DN_309",CORE,SEVERE_ERROR,309, getClassLoader());

  /**
   * An error occurred while trying to decode the value "%s" read from the first line of %s as the DN of the backend configuration entry:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_BACKUPDIRECTORY_CANNOT_DECODE_DN =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_BACKUPDIRECTORY_CANNOT_DECODE_DN_310",CORE,SEVERE_ERROR,310, getClassLoader());

  /**
   * The attempt to obtain a shared lock on file %s was rejected because an exclusive lock was already held on that file
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_FILELOCKER_LOCK_SHARED_REJECTED_BY_EXCLUSIVE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_FILELOCKER_LOCK_SHARED_REJECTED_BY_EXCLUSIVE_311",CORE,MILD_ERROR,311, getClassLoader());

  /**
   * The attempt to obtain a shared lock on file %s was rejected because the attempt to create the lock file failed:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_FILELOCKER_LOCK_SHARED_FAILED_CREATE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_FILELOCKER_LOCK_SHARED_FAILED_CREATE_312",CORE,MILD_ERROR,312, getClassLoader());

  /**
   * The attempt to obtain a shared lock on file %s was rejected because the attempt to open the lock file failed:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_FILELOCKER_LOCK_SHARED_FAILED_OPEN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_FILELOCKER_LOCK_SHARED_FAILED_OPEN_313",CORE,MILD_ERROR,313, getClassLoader());

  /**
   * The attempt to obtain a shared lock on file %s was rejected because an error occurred while attempting to acquire the lock:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_FILELOCKER_LOCK_SHARED_FAILED_LOCK =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_FILELOCKER_LOCK_SHARED_FAILED_LOCK_314",CORE,MILD_ERROR,314, getClassLoader());

  /**
   * The shared lock requested for file %s was not granted, which indicates that another process already holds an exclusive lock on that file
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_FILELOCKER_LOCK_SHARED_NOT_GRANTED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_FILELOCKER_LOCK_SHARED_NOT_GRANTED_315",CORE,MILD_ERROR,315, getClassLoader());

  /**
   * The attempt to obtain an exclusive lock on file %s was rejected because an exclusive lock was already held on that file
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_FILELOCKER_LOCK_EXCLUSIVE_REJECTED_BY_EXCLUSIVE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_FILELOCKER_LOCK_EXCLUSIVE_REJECTED_BY_EXCLUSIVE_316",CORE,MILD_ERROR,316, getClassLoader());

  /**
   * The attempt to obtain an exclusive lock on file %s was rejected because a shared lock was already held on that file
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_FILELOCKER_LOCK_EXCLUSIVE_REJECTED_BY_SHARED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_FILELOCKER_LOCK_EXCLUSIVE_REJECTED_BY_SHARED_317",CORE,MILD_ERROR,317, getClassLoader());

  /**
   * The attempt to obtain an exclusive lock on file %s was rejected because the attempt to create the lock file failed:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_FILELOCKER_LOCK_EXCLUSIVE_FAILED_CREATE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_FILELOCKER_LOCK_EXCLUSIVE_FAILED_CREATE_318",CORE,MILD_ERROR,318, getClassLoader());

  /**
   * The attempt to obtain an exclusive lock on file %s was rejected because the attempt to open the lock file failed:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_FILELOCKER_LOCK_EXCLUSIVE_FAILED_OPEN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_FILELOCKER_LOCK_EXCLUSIVE_FAILED_OPEN_319",CORE,MILD_ERROR,319, getClassLoader());

  /**
   * The attempt to obtain an exclusive lock on file %s was rejected because an error occurred while attempting to acquire the lock:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_FILELOCKER_LOCK_EXCLUSIVE_FAILED_LOCK =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_FILELOCKER_LOCK_EXCLUSIVE_FAILED_LOCK_320",CORE,MILD_ERROR,320, getClassLoader());

  /**
   * The exclusive lock requested for file %s was not granted, which indicates that another process already holds a shared or exclusive lock on that file
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_FILELOCKER_LOCK_EXCLUSIVE_NOT_GRANTED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_FILELOCKER_LOCK_EXCLUSIVE_NOT_GRANTED_321",CORE,MILD_ERROR,321, getClassLoader());

  /**
   * The attempt to release the exclusive lock held on %s failed:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_FILELOCKER_UNLOCK_EXCLUSIVE_FAILED_RELEASE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_FILELOCKER_UNLOCK_EXCLUSIVE_FAILED_RELEASE_322",CORE,MILD_ERROR,322, getClassLoader());

  /**
   * The attempt to release the shared lock held on %s failed:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_FILELOCKER_UNLOCK_SHARED_FAILED_RELEASE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_FILELOCKER_UNLOCK_SHARED_FAILED_RELEASE_323",CORE,MILD_ERROR,323, getClassLoader());

  /**
   * The attempt to release the lock held on %s failed because no record of a lock on that file was found
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_FILELOCKER_UNLOCK_UNKNOWN_FILE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_FILELOCKER_UNLOCK_UNKNOWN_FILE_324",CORE,MILD_ERROR,324, getClassLoader());

  /**
   * Server Connection Closed
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_CLIENT_SIDE_SERVER_DOWN =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_CLIENT_SIDE_SERVER_DOWN_325",CORE,INFORMATION,325, getClassLoader());

  /**
   * Local Error
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_CLIENT_SIDE_LOCAL_ERROR =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_CLIENT_SIDE_LOCAL_ERROR_326",CORE,INFORMATION,326, getClassLoader());

  /**
   * Encoding Error
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_CLIENT_SIDE_ENCODING_ERROR =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_CLIENT_SIDE_ENCODING_ERROR_327",CORE,INFORMATION,327, getClassLoader());

  /**
   * Decoding Error
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_CLIENT_SIDE_DECODING_ERROR =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_CLIENT_SIDE_DECODING_ERROR_328",CORE,INFORMATION,328, getClassLoader());

  /**
   * Client-Side Timeout
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_CLIENT_SIDE_TIMEOUT =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_CLIENT_SIDE_TIMEOUT_329",CORE,INFORMATION,329, getClassLoader());

  /**
   * Unknown Authentication Mechanism
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_CLIENT_SIDE_AUTH_UNKNOWN =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_CLIENT_SIDE_AUTH_UNKNOWN_330",CORE,INFORMATION,330, getClassLoader());

  /**
   * Filter Error
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_CLIENT_SIDE_FILTER_ERROR =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_CLIENT_SIDE_FILTER_ERROR_331",CORE,INFORMATION,331, getClassLoader());

  /**
   * Cancelled by User
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_CLIENT_SIDE_USER_CANCELLED =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_CLIENT_SIDE_USER_CANCELLED_332",CORE,INFORMATION,332, getClassLoader());

  /**
   * Parameter Error
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_CLIENT_SIDE_PARAM_ERROR =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_CLIENT_SIDE_PARAM_ERROR_333",CORE,INFORMATION,333, getClassLoader());

  /**
   * Out of Memory
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_CLIENT_SIDE_NO_MEMORY =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_CLIENT_SIDE_NO_MEMORY_334",CORE,INFORMATION,334, getClassLoader());

  /**
   * Connect Error
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_CLIENT_SIDE_CONNECT_ERROR =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_CLIENT_SIDE_CONNECT_ERROR_335",CORE,INFORMATION,335, getClassLoader());

  /**
   * Operation Not Supported
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_CLIENT_SIDE_NOT_SUPPORTED =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_CLIENT_SIDE_NOT_SUPPORTED_336",CORE,INFORMATION,336, getClassLoader());

  /**
   * Control Not Found
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_CLIENT_SIDE_CONTROL_NOT_FOUND =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_CLIENT_SIDE_CONTROL_NOT_FOUND_337",CORE,INFORMATION,337, getClassLoader());

  /**
   * No Results Returned
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_CLIENT_SIDE_NO_RESULTS_RETURNED =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_CLIENT_SIDE_NO_RESULTS_RETURNED_338",CORE,INFORMATION,338, getClassLoader());

  /**
   * More Results to Return
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_CLIENT_SIDE_MORE_RESULTS_TO_RETURN =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_CLIENT_SIDE_MORE_RESULTS_TO_RETURN_339",CORE,INFORMATION,339, getClassLoader());

  /**
   * Referral Loop Detected
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_CLIENT_SIDE_CLIENT_LOOP =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_CLIENT_SIDE_CLIENT_LOOP_340",CORE,INFORMATION,340, getClassLoader());

  /**
   * Referral Hop Limit Exceeded
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_CLIENT_SIDE_REFERRAL_LIMIT_EXCEEDED =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_CLIENT_SIDE_REFERRAL_LIMIT_EXCEEDED_341",CORE,INFORMATION,341, getClassLoader());

  /**
   * An error occurred while attempting to release a shared lock for backend %s:  %s.  This lock should be automatically cleaned when the Directory Server process exits, so no additional action should be necessary
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_SHUTDOWN_CANNOT_RELEASE_SHARED_BACKEND_LOCK =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_SHUTDOWN_CANNOT_RELEASE_SHARED_BACKEND_LOCK_342",CORE,SEVERE_WARNING,342, getClassLoader());

  /**
   * The Directory Server could not acquire an exclusive lock on file %s:  %s.  This generally means that another instance of this server is already running
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CANNOT_ACQUIRE_EXCLUSIVE_SERVER_LOCK =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"FATAL_ERR_CANNOT_ACQUIRE_EXCLUSIVE_SERVER_LOCK_343",CORE,FATAL_ERROR,343, getClassLoader());

  /**
   * task
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_CATEGORY_TASK =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_CATEGORY_TASK_345",CORE,INFORMATION,345, getClassLoader());

  /**
   * Entry %s cannot be modified because the modification attempted to update attribute %s which is defined as NO-USER-MODIFICATION in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MODIFY_ATTR_IS_NO_USER_MOD =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_MODIFY_ATTR_IS_NO_USER_MOD_346",CORE,MILD_ERROR,346, getClassLoader());

  /**
   * Entry %s cannot be added because it includes attribute %s which is defined as NO-USER-MODIFICATION in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ADD_ATTR_IS_NO_USER_MOD =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ADD_ATTR_IS_NO_USER_MOD_347",CORE,MILD_ERROR,347, getClassLoader());

  /**
   * Entry %s cannot be renamed because the current DN includes attribute %s which is defined as NO-USER-MODIFICATION in the server schema and the deleteOldRDN flag was set in the modify DN request
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MODDN_OLD_RDN_ATTR_IS_NO_USER_MOD =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_MODDN_OLD_RDN_ATTR_IS_NO_USER_MOD_348",CORE,MILD_ERROR,348, getClassLoader());

  /**
   * Entry %s cannot be renamed because the new RDN includes attribute %s which is defined as NO-USER-MODIFICATION in the server schema, and the target value for that attribute is not already included in the entry
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MODDN_NEW_RDN_ATTR_IS_NO_USER_MOD =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_MODDN_NEW_RDN_ATTR_IS_NO_USER_MOD_349",CORE,MILD_ERROR,349, getClassLoader());

  /**
   * The modify DN operation for entry %s cannot be performed because a pre-operation plugin attempted to increment attribute %s but that attribute does not exist in the target entry
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MODDN_PREOP_INCREMENT_NO_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_MODDN_PREOP_INCREMENT_NO_ATTR_350",CORE,MILD_ERROR,350, getClassLoader());

  /**
   * The modify DN operation for entry %s cannot be performed because a pre-operation plugin attempted to increment attribute %s but that attribute has multiple values in the target entry
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MODDN_PREOP_INCREMENT_MULTIPLE_VALUES =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_MODDN_PREOP_INCREMENT_MULTIPLE_VALUES_351",CORE,MILD_ERROR,351, getClassLoader());

  /**
   * The modify DN operation for entry %s cannot be performed because a pre-operation plugin attempted to increment attribute %s but the value of that attribute is not an integer
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MODDN_PREOP_INCREMENT_VALUE_NOT_INTEGER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_MODDN_PREOP_INCREMENT_VALUE_NOT_INTEGER_352",CORE,MILD_ERROR,352, getClassLoader());

  /**
   * The modify DN operation for entry %s cannot be performed because a pre-operation plugin attempted to increment attribute %s but no increment amount was provided
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MODDN_PREOP_INCREMENT_NO_AMOUNT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_MODDN_PREOP_INCREMENT_NO_AMOUNT_353",CORE,MILD_ERROR,353, getClassLoader());

  /**
   * The modify DN operation for entry %s cannot be performed because a pre-operation plugin attempted to increment attribute %s but multiple increment amount values were provided
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MODDN_PREOP_INCREMENT_MULTIPLE_AMOUNTS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_MODDN_PREOP_INCREMENT_MULTIPLE_AMOUNTS_354",CORE,MILD_ERROR,354, getClassLoader());

  /**
   * The modify DN operation for entry %s cannot be performed because a pre-operation plugin attempted to increment attribute %s but the increment amount value was not an integer
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MODDN_PREOP_INCREMENT_AMOUNT_NOT_INTEGER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_MODDN_PREOP_INCREMENT_AMOUNT_NOT_INTEGER_355",CORE,MILD_ERROR,355, getClassLoader());

  /**
   * The modify DN operation for entry %s cannot be performed because a pre-operation plugin modified the entry in a way that caused it to violate the server schema:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MODDN_PREOP_VIOLATES_SCHEMA =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_MODDN_PREOP_VIOLATES_SCHEMA_356",CORE,MILD_ERROR,356, getClassLoader());

  /**
   * Entry %s cannot be modified because the request contained an LDAP assertion control and the associated filter did not match the contents of the that entry
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MODIFY_ASSERTION_FAILED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_MODIFY_ASSERTION_FAILED_357",CORE,MILD_ERROR,357, getClassLoader());

  /**
   * Entry %s cannot be modified because the request contained an LDAP assertion control, but an error occurred while attempting to compare the target entry against the filter contained in that control:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MODIFY_CANNOT_PROCESS_ASSERTION_FILTER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_MODIFY_CANNOT_PROCESS_ASSERTION_FILTER_358",CORE,MILD_ERROR,358, getClassLoader());

  /**
   * Entry %s cannot be modified because the request contained a critical control with OID %s that is not supported by the Directory Server for this type of operation
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MODIFY_UNSUPPORTED_CRITICAL_CONTROL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_MODIFY_UNSUPPORTED_CRITICAL_CONTROL_359",CORE,MILD_ERROR,359, getClassLoader());

  /**
   * Entry %s cannot be removed because the delete request contains an LDAP assertion control and an error occurred while trying to retrieve the target entry to compare it against the associated filter:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_DELETE_CANNOT_GET_ENTRY_FOR_ASSERTION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_DELETE_CANNOT_GET_ENTRY_FOR_ASSERTION_360",CORE,MILD_ERROR,360, getClassLoader());

  /**
   * Entry %s cannot be removed because it was determined that the target entry does not exist while attempting to process it against the LDAP assertion control contained in the request
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DELETE_NO_SUCH_ENTRY_FOR_ASSERTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_DELETE_NO_SUCH_ENTRY_FOR_ASSERTION_361",CORE,MILD_ERROR,361, getClassLoader());

  /**
   * Entry %s cannot be removed because the request contained an LDAP assertion control and the associated filter did not match the contents of the that entry
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DELETE_ASSERTION_FAILED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_DELETE_ASSERTION_FAILED_362",CORE,MILD_ERROR,362, getClassLoader());

  /**
   * Entry %s cannot be removed because the request contained an LDAP assertion control, but an error occurred while attempting to compare the target entry against the filter contained in that control:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_DELETE_CANNOT_PROCESS_ASSERTION_FILTER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_DELETE_CANNOT_PROCESS_ASSERTION_FILTER_363",CORE,MILD_ERROR,363, getClassLoader());

  /**
   * Entry %s cannot be removed because the request contained a critical control with OID %s that is not supported by the Directory Server for this type of operation
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_DELETE_UNSUPPORTED_CRITICAL_CONTROL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_DELETE_UNSUPPORTED_CRITICAL_CONTROL_364",CORE,MILD_ERROR,364, getClassLoader());

  /**
   * Entry %s cannot be renamed because the request contained an LDAP assertion control and the associated filter did not match the contents of the that entry
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MODDN_ASSERTION_FAILED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_MODDN_ASSERTION_FAILED_365",CORE,MILD_ERROR,365, getClassLoader());

  /**
   * Entry %s cannot be renamed because the request contained an LDAP assertion control, but an error occurred while attempting to compare the target entry against the filter contained in that control:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MODDN_CANNOT_PROCESS_ASSERTION_FILTER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_MODDN_CANNOT_PROCESS_ASSERTION_FILTER_366",CORE,MILD_ERROR,366, getClassLoader());

  /**
   * Entry %s cannot be renamed because the request contained a critical control with OID %s that is not supported by the Directory Server for this type of operation
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MODDN_UNSUPPORTED_CRITICAL_CONTROL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_MODDN_UNSUPPORTED_CRITICAL_CONTROL_367",CORE,MILD_ERROR,367, getClassLoader());

  /**
   * Entry %s cannot be added because the request contained an LDAP assertion control and the associated filter did not match the contents of the provided entry
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ADD_ASSERTION_FAILED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ADD_ASSERTION_FAILED_368",CORE,MILD_ERROR,368, getClassLoader());

  /**
   * Entry %s cannot be added because the request contained an LDAP assertion control, but an error occurred while attempting to compare the provided entry against the filter contained in that control:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ADD_CANNOT_PROCESS_ASSERTION_FILTER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ADD_CANNOT_PROCESS_ASSERTION_FILTER_369",CORE,MILD_ERROR,369, getClassLoader());

  /**
   * Entry %s cannot be added because the request contained a critical control with OID %s that is not supported by the Directory Server for this type of operation
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ADD_UNSUPPORTED_CRITICAL_CONTROL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ADD_UNSUPPORTED_CRITICAL_CONTROL_370",CORE,MILD_ERROR,370, getClassLoader());

  /**
   * The search request cannot be processed because it contains an LDAP assertion control and an error occurred while trying to retrieve the base entry to compare it against the assertion filter:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SEARCH_CANNOT_GET_ENTRY_FOR_ASSERTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SEARCH_CANNOT_GET_ENTRY_FOR_ASSERTION_371",CORE,MILD_ERROR,371, getClassLoader());

  /**
   * The search request cannot be processed because it contains an LDAP assertion control but the search base entry does not exist
   */
  public static final MessageDescriptor.Arg0 ERR_SEARCH_NO_SUCH_ENTRY_FOR_ASSERTION =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_SEARCH_NO_SUCH_ENTRY_FOR_ASSERTION_372",CORE,MILD_ERROR,372, getClassLoader());

  /**
   * The search request cannot be processed because it contains an LDAP assertion control and the assertion filter did not match the contents of the base entry
   */
  public static final MessageDescriptor.Arg0 ERR_SEARCH_ASSERTION_FAILED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_SEARCH_ASSERTION_FAILED_373",CORE,MILD_ERROR,373, getClassLoader());

  /**
   * The search request cannot be processed because it contains an LDAP assertion control, but an error occurred while attempting to compare the base entry against the assertion filter:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SEARCH_CANNOT_PROCESS_ASSERTION_FILTER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SEARCH_CANNOT_PROCESS_ASSERTION_FILTER_374",CORE,MILD_ERROR,374, getClassLoader());

  /**
   * The search request cannot be processed because it contains a critical control with OID %s that is not supported by the Directory Server for this type of operation
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SEARCH_UNSUPPORTED_CRITICAL_CONTROL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SEARCH_UNSUPPORTED_CRITICAL_CONTROL_375",CORE,MILD_ERROR,375, getClassLoader());

  /**
   * Cannot perform the compare operation on entry %s because the request contained an LDAP assertion control and the associated filter did not match the contents of the that entry
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_COMPARE_ASSERTION_FAILED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_COMPARE_ASSERTION_FAILED_376",CORE,MILD_ERROR,376, getClassLoader());

  /**
   * Cannot perform the compare operation on entry %s because the request contained an LDAP assertion control, but an error occurred while attempting to compare the target entry against the filter contained in that control:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_COMPARE_CANNOT_PROCESS_ASSERTION_FILTER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_COMPARE_CANNOT_PROCESS_ASSERTION_FILTER_377",CORE,MILD_ERROR,377, getClassLoader());

  /**
   * Cannot perform the compare operation on entry %s because the request contained a critical control with OID %s that is not supported by the Directory Server for this type of operation
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_COMPARE_UNSUPPORTED_CRITICAL_CONTROL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_COMPARE_UNSUPPORTED_CRITICAL_CONTROL_378",CORE,MILD_ERROR,378, getClassLoader());

  /**
   * The add operation was not actually performed in the Directory Server backend because the LDAP no-op control was present in the request
   */
  public static final MessageDescriptor.Arg0 INFO_ADD_NOOP =
          new MessageDescriptor.Arg0(BASE,"INFO_ADD_NOOP_379",CORE,INFORMATION,379, getClassLoader());

  /**
   * The delete operation was not actually performed in the Directory Server backend because the LDAP no-op control was present in the request
   */
  public static final MessageDescriptor.Arg0 INFO_DELETE_NOOP =
          new MessageDescriptor.Arg0(BASE,"INFO_DELETE_NOOP_380",CORE,INFORMATION,380, getClassLoader());

  /**
   * The modify operation was not actually performed in the Directory Server backend because the LDAP no-op control was present in the request
   */
  public static final MessageDescriptor.Arg0 INFO_MODIFY_NOOP =
          new MessageDescriptor.Arg0(BASE,"INFO_MODIFY_NOOP_381",CORE,INFORMATION,381, getClassLoader());

  /**
   * The modify DN operation was not actually performed in the Directory Server backend because the LDAP no-op control was present in the request
   */
  public static final MessageDescriptor.Arg0 INFO_MODDN_NOOP =
          new MessageDescriptor.Arg0(BASE,"INFO_MODDN_NOOP_382",CORE,INFORMATION,382, getClassLoader());

  /**
   * Entry %s cannot be removed because it was determined that the target entry does not exist while attempting to process it against the LDAP pre-read request control
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DELETE_PREREAD_NO_ENTRY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_DELETE_PREREAD_NO_ENTRY_383",CORE,MILD_ERROR,383, getClassLoader());

  /**
   * Authorization Denied
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_AUTHORIZATION_DENIED =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_AUTHORIZATION_DENIED_384",CORE,INFORMATION,384, getClassLoader());

  /**
   * Entry %s cannot be added because it is missing attribute %s that is contained in the entry's RDN.  All attributes used in the RDN must also be provided in the attribute list for the entry
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ADD_MISSING_RDN_ATTRIBUTE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_ADD_MISSING_RDN_ATTRIBUTE_385",CORE,SEVERE_ERROR,385, getClassLoader());

  /**
   * An unexpected error occurred while notifying a change notification listener of an add operation: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ADD_ERROR_NOTIFYING_CHANGE_LISTENER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_ADD_ERROR_NOTIFYING_CHANGE_LISTENER_386",CORE,SEVERE_ERROR,386, getClassLoader());

  /**
   * An unexpected error occurred while notifying persistent search %s of an add operation:  %s.  The persistent search has been terminated
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ADD_ERROR_NOTIFYING_PERSISTENT_SEARCH =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_ADD_ERROR_NOTIFYING_PERSISTENT_SEARCH_387",CORE,SEVERE_ERROR,387, getClassLoader());

  /**
   * An unexpected error occurred while notifying a change notification listener of a delete operation:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DELETE_ERROR_NOTIFYING_CHANGE_LISTENER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DELETE_ERROR_NOTIFYING_CHANGE_LISTENER_388",CORE,SEVERE_ERROR,388, getClassLoader());

  /**
   * An unexpected error occurred while notifying persistent search %s of a delete operation:  %s. The persistent search has been terminated
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_DELETE_ERROR_NOTIFYING_PERSISTENT_SEARCH =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_DELETE_ERROR_NOTIFYING_PERSISTENT_SEARCH_389",CORE,SEVERE_ERROR,389, getClassLoader());

  /**
   * An unexpected error occurred while notifying a change notification listener of a modify operation:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MODIFY_ERROR_NOTIFYING_CHANGE_LISTENER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_MODIFY_ERROR_NOTIFYING_CHANGE_LISTENER_390",CORE,SEVERE_ERROR,390, getClassLoader());

  /**
   * An unexpected error occurred while notifying persistent search %s of a modify operation:  %s. The persistent search has been terminated
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MODIFY_ERROR_NOTIFYING_PERSISTENT_SEARCH =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_MODIFY_ERROR_NOTIFYING_PERSISTENT_SEARCH_391",CORE,SEVERE_ERROR,391, getClassLoader());

  /**
   * An unexpected error occurred while notifying a change notification listener of a modify DN operation:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MODDN_ERROR_NOTIFYING_CHANGE_LISTENER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_MODDN_ERROR_NOTIFYING_CHANGE_LISTENER_392",CORE,SEVERE_ERROR,392, getClassLoader());

  /**
   * An unexpected error occurred while notifying persistent search %s of a modify DN operation:  %s. The persistent search has been terminated
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MODDN_ERROR_NOTIFYING_PERSISTENT_SEARCH =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_MODDN_ERROR_NOTIFYING_PERSISTENT_SEARCH_393",CORE,SEVERE_ERROR,393, getClassLoader());

  /**
   * Unable to process the bind request because it contained a control with OID %s that was marked critical but this control is not supported for the bind operation
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_BIND_UNSUPPORTED_CRITICAL_CONTROL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_BIND_UNSUPPORTED_CRITICAL_CONTROL_394",CORE,SEVERE_ERROR,394, getClassLoader());

  /**
   * There are multiple user-specific size limit values contained in user entry %s.  The default server size limit will be used
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_BIND_MULTIPLE_USER_SIZE_LIMITS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_BIND_MULTIPLE_USER_SIZE_LIMITS_395",CORE,SEVERE_WARNING,395, getClassLoader());

  /**
   * The user-specific size limit value %s contained in user entry %s could not be parsed as an integer. The default server size limit will be used
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_BIND_CANNOT_PROCESS_USER_SIZE_LIMIT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_BIND_CANNOT_PROCESS_USER_SIZE_LIMIT_396",CORE,SEVERE_WARNING,396, getClassLoader());

  /**
   * There are multiple user-specific time limit values contained in user entry %s.  The default server time limit will be used
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_BIND_MULTIPLE_USER_TIME_LIMITS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_BIND_MULTIPLE_USER_TIME_LIMITS_397",CORE,SEVERE_WARNING,397, getClassLoader());

  /**
   * The user-specific time limit value %s contained in user entry %s could not be parsed as an integer. The default server time limit will be used
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_BIND_CANNOT_PROCESS_USER_TIME_LIMIT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_BIND_CANNOT_PROCESS_USER_TIME_LIMIT_398",CORE,SEVERE_WARNING,398, getClassLoader());

  /**
   * Assertion Failed
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_ASSERTION_FAILED =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_ASSERTION_FAILED_399",CORE,INFORMATION,399, getClassLoader());

  /**
   * The entry %s cannot be added because an entry with that name already exists
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ADD_ENTRY_ALREADY_EXISTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_ADD_ENTRY_ALREADY_EXISTS_400",CORE,SEVERE_ERROR,400, getClassLoader());

  /**
   * An error occurred during preoperation synchronization processing for the add operation with connection ID %d and operation ID %d:  %s
   */
  public static final MessageDescriptor.Arg3<Number,Number,CharSequence> ERR_ADD_SYNCH_PREOP_FAILED =
          new MessageDescriptor.Arg3<Number,Number,CharSequence>(BASE,"SEVERE_ERR_ADD_SYNCH_PREOP_FAILED_401",CORE,SEVERE_ERROR,401, getClassLoader());

  /**
   * An error occurred during postoperation synchronization processing for the add operation with connection ID %d and operation ID %d:  %s
   */
  public static final MessageDescriptor.Arg3<Number,Number,CharSequence> ERR_ADD_SYNCH_POSTOP_FAILED =
          new MessageDescriptor.Arg3<Number,Number,CharSequence>(BASE,"SEVERE_ERR_ADD_SYNCH_POSTOP_FAILED_402",CORE,SEVERE_ERROR,402, getClassLoader());

  /**
   * An error occurred during preoperation synchronization processing for the delete operation with connection ID %d and operation ID %d:  %s
   */
  public static final MessageDescriptor.Arg3<Number,Number,CharSequence> ERR_DELETE_SYNCH_PREOP_FAILED =
          new MessageDescriptor.Arg3<Number,Number,CharSequence>(BASE,"SEVERE_ERR_DELETE_SYNCH_PREOP_FAILED_403",CORE,SEVERE_ERROR,403, getClassLoader());

  /**
   * An error occurred during postoperation synchronization processing for the delete operation with connection ID %d and operation ID %d:  %s
   */
  public static final MessageDescriptor.Arg3<Number,Number,CharSequence> ERR_DELETE_SYNCH_POSTOP_FAILED =
          new MessageDescriptor.Arg3<Number,Number,CharSequence>(BASE,"SEVERE_ERR_DELETE_SYNCH_POSTOP_FAILED_404",CORE,SEVERE_ERROR,404, getClassLoader());

  /**
   * An error occurred during preoperation synchronization processing for the modify operation with connection ID %d and operation ID %d:  %s
   */
  public static final MessageDescriptor.Arg3<Number,Number,CharSequence> ERR_MODIFY_SYNCH_PREOP_FAILED =
          new MessageDescriptor.Arg3<Number,Number,CharSequence>(BASE,"SEVERE_ERR_MODIFY_SYNCH_PREOP_FAILED_405",CORE,SEVERE_ERROR,405, getClassLoader());

  /**
   * An error occurred during postoperation synchronization processing for the modify operation with connection ID %d and operation ID %d:  %s
   */
  public static final MessageDescriptor.Arg3<Number,Number,CharSequence> ERR_MODIFY_SYNCH_POSTOP_FAILED =
          new MessageDescriptor.Arg3<Number,Number,CharSequence>(BASE,"SEVERE_ERR_MODIFY_SYNCH_POSTOP_FAILED_406",CORE,SEVERE_ERROR,406, getClassLoader());

  /**
   * An error occurred during preoperation synchronization processing for the modify DN operation with connection ID %d and operation ID %d:  %s
   */
  public static final MessageDescriptor.Arg3<Number,Number,CharSequence> ERR_MODDN_SYNCH_PREOP_FAILED =
          new MessageDescriptor.Arg3<Number,Number,CharSequence>(BASE,"SEVERE_ERR_MODDN_SYNCH_PREOP_FAILED_407",CORE,SEVERE_ERROR,407, getClassLoader());

  /**
   * An error occurred during postoperation synchronization processing for the modify DN operation with connection ID %d and operation ID %d:  %s
   */
  public static final MessageDescriptor.Arg3<Number,Number,CharSequence> ERR_MODDN_SYNCH_POSTOP_FAILED =
          new MessageDescriptor.Arg3<Number,Number,CharSequence>(BASE,"SEVERE_ERR_MODDN_SYNCH_POSTOP_FAILED_408",CORE,SEVERE_ERROR,408, getClassLoader());

  /**
   * An error occurred during conflict resolution synchronization processing for the add operation with connection ID %d and operation ID %d:  %s
   */
  public static final MessageDescriptor.Arg3<Number,Number,CharSequence> ERR_ADD_SYNCH_CONFLICT_RESOLUTION_FAILED =
          new MessageDescriptor.Arg3<Number,Number,CharSequence>(BASE,"SEVERE_ERR_ADD_SYNCH_CONFLICT_RESOLUTION_FAILED_409",CORE,SEVERE_ERROR,409, getClassLoader());

  /**
   * An error occurred during conflict resolution synchronization processing for the delete operation with connection ID %d and operation ID %d:  %s
   */
  public static final MessageDescriptor.Arg3<Number,Number,CharSequence> ERR_DELETE_SYNCH_CONFLICT_RESOLUTION_FAILED =
          new MessageDescriptor.Arg3<Number,Number,CharSequence>(BASE,"SEVERE_ERR_DELETE_SYNCH_CONFLICT_RESOLUTION_FAILED_410",CORE,SEVERE_ERROR,410, getClassLoader());

  /**
   * An error occurred during conflict resolution synchronization processing for the modify operation with connection ID %d and operation ID %d:  %s
   */
  public static final MessageDescriptor.Arg3<Number,Number,CharSequence> ERR_MODIFY_SYNCH_CONFLICT_RESOLUTION_FAILED =
          new MessageDescriptor.Arg3<Number,Number,CharSequence>(BASE,"SEVERE_ERR_MODIFY_SYNCH_CONFLICT_RESOLUTION_FAILED_411",CORE,SEVERE_ERROR,411, getClassLoader());

  /**
   * An error occurred during conflict resolution synchronization processing for the modify DN operation with connection ID %d and operation ID %d:  %s
   */
  public static final MessageDescriptor.Arg3<Number,Number,CharSequence> ERR_MODDN_SYNCH_CONFLICT_RESOLUTION_FAILED =
          new MessageDescriptor.Arg3<Number,Number,CharSequence>(BASE,"SEVERE_ERR_MODDN_SYNCH_CONFLICT_RESOLUTION_FAILED_412",CORE,SEVERE_ERROR,412, getClassLoader());

  /**
   * Unable to add entry %s because the Directory Server is configured in read-only mode
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ADD_SERVER_READONLY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_ADD_SERVER_READONLY_413",CORE,SEVERE_ERROR,413, getClassLoader());

  /**
   * Unable to add entry %s because the backend that should hold that entry is configured in read-only mode
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ADD_BACKEND_READONLY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_ADD_BACKEND_READONLY_414",CORE,SEVERE_ERROR,414, getClassLoader());

  /**
   * Unable to delete entry %s because the Directory Server is configured in read-only mode
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DELETE_SERVER_READONLY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DELETE_SERVER_READONLY_415",CORE,SEVERE_ERROR,415, getClassLoader());

  /**
   * Unable to delete entry %s because the backend that holds that entry is configured in read-only mode
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DELETE_BACKEND_READONLY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DELETE_BACKEND_READONLY_416",CORE,SEVERE_ERROR,416, getClassLoader());

  /**
   * Unable to modify entry %s because the Directory Server is configured in read-only mode
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MODIFY_SERVER_READONLY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_MODIFY_SERVER_READONLY_417",CORE,SEVERE_ERROR,417, getClassLoader());

  /**
   * Unable to modify entry %s because the backend that holds that entry is configured in read-only mode
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MODIFY_BACKEND_READONLY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_MODIFY_BACKEND_READONLY_418",CORE,SEVERE_ERROR,418, getClassLoader());

  /**
   * Unable to rename entry %s because the Directory Server is configured in read-only mode
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MODDN_SERVER_READONLY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_MODDN_SERVER_READONLY_419",CORE,SEVERE_ERROR,419, getClassLoader());

  /**
   * Unable to rename entry %s because the backend that holds that entry is configured in read-only mode
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MODDN_BACKEND_READONLY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_MODDN_BACKEND_READONLY_420",CORE,SEVERE_ERROR,420, getClassLoader());

  /**
   * Unable to process the simple bind request because it contained a bind DN but no password, which is forbidden by the server configuration
   */
  public static final MessageDescriptor.Arg0 ERR_BIND_DN_BUT_NO_PASSWORD =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_BIND_DN_BUT_NO_PASSWORD_421",CORE,SEVERE_ERROR,421, getClassLoader());

  /**
   * The password policy configuration entry "%s" does not contain a value for attribute ds-cfg-password-attribute, which specifies the attribute to hold user passwords
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PWPOLICY_NO_PASSWORD_ATTRIBUTE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PWPOLICY_NO_PASSWORD_ATTRIBUTE_422",CORE,SEVERE_ERROR,422, getClassLoader());

  /**
   * The password policy configuration entry "%s" does not contain any values for attribute ds-cfg-default-password-storage-scheme, which specifies the set of default password storage schemes
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PWPOLICY_NO_DEFAULT_STORAGE_SCHEMES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PWPOLICY_NO_DEFAULT_STORAGE_SCHEMES_423",CORE,SEVERE_ERROR,423, getClassLoader());

  /**
   * Attribute type used to hold user passwords.  This attribute type must be defined in the server schema.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_PWPOLICY_DESCRIPTION_PW_ATTR =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPOLICY_DESCRIPTION_PW_ATTR_424",CORE,INFORMATION,424, getClassLoader());

  /**
   * The password policy definition contained in configuration entry "%s" is invalid because the specified password attribute "%s" is not defined in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPOLICY_UNDEFINED_PASSWORD_ATTRIBUTE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPOLICY_UNDEFINED_PASSWORD_ATTRIBUTE_425",CORE,SEVERE_ERROR,425, getClassLoader());

  /**
   * The password policy definition contained in configuration entry "%s" is invalid because the specified password attribute "%s" has a syntax OID of %s.  The password attribute must have a syntax OID of either 1.3.6.1.4.1.26027.1.3.1 (for the user password syntax) or 1.3.6.1.4.1.4203.1.1.2 (for the authentication password syntax)
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_PWPOLICY_INVALID_PASSWORD_ATTRIBUTE_SYNTAX =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPOLICY_INVALID_PASSWORD_ATTRIBUTE_SYNTAX_426",CORE,SEVERE_ERROR,426, getClassLoader());

  /**
   * An error occurred while attempting to determine the value of attribute ds-cfg-password-attribute in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPOLICY_CANNOT_DETERMINE_PASSWORD_ATTRIBUTE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPOLICY_CANNOT_DETERMINE_PASSWORD_ATTRIBUTE_427",CORE,SEVERE_ERROR,427, getClassLoader());

  /**
   * Password storage scheme (or set of schemes) that will be used to encode clear-text passwords.  If multiple default storage schemes are defined for a password policy, then the same password will be encoded using all of those schemes. Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_PWPOLICY_DESCRIPTION_DEFAULT_STORAGE_SCHEMES =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPOLICY_DESCRIPTION_DEFAULT_STORAGE_SCHEMES_428",CORE,INFORMATION,428, getClassLoader());

  /**
   * The password policy definition contained in configuration entry "%s" is invalid because it references a default password storage scheme "%s" that is not defined in the server configuration
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPOLICY_NO_SUCH_DEFAULT_SCHEME =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPOLICY_NO_SUCH_DEFAULT_SCHEME_429",CORE,SEVERE_ERROR,429, getClassLoader());

  /**
   * An error occurred while attempting to determine the values for attribute ds-cfg-default-password-storage-scheme in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPOLICY_CANNOT_DETERMINE_DEFAULT_STORAGE_SCHEMES =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPOLICY_CANNOT_DETERMINE_DEFAULT_STORAGE_SCHEMES_430",CORE,SEVERE_ERROR,430, getClassLoader());

  /**
   * Password storage scheme (or set of schemes) that should be considered deprecated.  If an authenticating user has a password encoded with one of these schemes, those passwords will be removed and replaced with passwords encoded using the default schemes.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_PWPOLICY_DESCRIPTION_DEPRECATED_STORAGE_SCHEMES =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPOLICY_DESCRIPTION_DEPRECATED_STORAGE_SCHEMES_431",CORE,INFORMATION,431, getClassLoader());

  /**
   * An error occurred while attempting to determine the values for attribute ds-cfg-deprecated-password-storage-scheme in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPOLICY_CANNOT_DETERMINE_DEPRECATED_STORAGE_SCHEMES =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPOLICY_CANNOT_DETERMINE_DEPRECATED_STORAGE_SCHEMES_432",CORE,SEVERE_ERROR,432, getClassLoader());

  /**
   * DN(s) of the password validator(s) that should be used with the associated password storage scheme.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_PWPOLICY_DESCRIPTION_PASSWORD_VALIDATORS =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPOLICY_DESCRIPTION_PASSWORD_VALIDATORS_433",CORE,INFORMATION,433, getClassLoader());

  /**
   * The password policy definition contained in configuration entry "%s" is invalid because it references a password validator "%s" that is not defined in the server configuration
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPOLICY_NO_SUCH_VALIDATOR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPOLICY_NO_SUCH_VALIDATOR_434",CORE,SEVERE_ERROR,434, getClassLoader());

  /**
   * An error occurred while attempting to determine the values for attribute ds-cfg-password-validator in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPOLICY_CANNOT_DETERMINE_PASSWORD_VALIDATORS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPOLICY_CANNOT_DETERMINE_PASSWORD_VALIDATORS_435",CORE,SEVERE_ERROR,435, getClassLoader());

  /**
   * DN(s) of the account status notification handler(s) that should be used with the associated password storage scheme.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_PWPOLICY_DESCRIPTION_NOTIFICATION_HANDLERS =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPOLICY_DESCRIPTION_NOTIFICATION_HANDLERS_436",CORE,INFORMATION,436, getClassLoader());

  /**
   * The password policy definition contained in configuration entry "%s" is invalid because it references account status notification handler "%s" that is not defined in the server configuration
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPOLICY_NO_SUCH_NOTIFICATION_HANDLER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPOLICY_NO_SUCH_NOTIFICATION_HANDLER_437",CORE,SEVERE_ERROR,437, getClassLoader());

  /**
   * An error occurred while attempting to determine the values for attribute ds-cfg-account-status-notification-handler in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPOLICY_CANNOT_DETERMINE_NOTIFICATION_HANDLERS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPOLICY_CANNOT_DETERMINE_NOTIFICATION_HANDLERS_438",CORE,SEVERE_ERROR,438, getClassLoader());

  /**
   * Indicates whether users will be allowed to change their own passwords.  This check is made in addition to access control evaluation, and therefore both must allow the password change for it to occur.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_PWPOLICY_DESCRIPTION_ALLOW_USER_PW_CHANGES =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPOLICY_DESCRIPTION_ALLOW_USER_PW_CHANGES_439",CORE,INFORMATION,439, getClassLoader());

  /**
   * An error occurred while attempting to determine the value for attribute ds-cfg-allow-user-password-changes in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPOLICY_CANNOT_DETERMINE_ALLOW_USER_PW_CHANGES =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPOLICY_CANNOT_DETERMINE_ALLOW_USER_PW_CHANGES_440",CORE,SEVERE_ERROR,440, getClassLoader());

  /**
   * Indicates whether user password changes will be required to use the password modify extended operation and include the user's current password before the change will be allowed.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_PWPOLICY_DESCRIPTION_REQUIRE_CURRENT_PW =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPOLICY_DESCRIPTION_REQUIRE_CURRENT_PW_441",CORE,INFORMATION,441, getClassLoader());

  /**
   * An error occurred while attempting to determine the value for attribute ds-cfg-allow-user-password-changes in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPOLICY_CANNOT_DETERMINE_REQUIRE_CURRENT_PW =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPOLICY_CANNOT_DETERMINE_REQUIRE_CURRENT_PW_442",CORE,SEVERE_ERROR,442, getClassLoader());

  /**
   * Indicates whether users will be forced to change their passwords if they are reset by an administrator.  For this purpose, anyone with permission to change a given user's password other than that user will be considered an administrator. Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_PWPOLICY_DESCRIPTION_FORCE_CHANGE_ON_RESET =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPOLICY_DESCRIPTION_FORCE_CHANGE_ON_RESET_443",CORE,INFORMATION,443, getClassLoader());

  /**
   * An error occurred while attempting to determine the value for attribute ds-cfg-force-change-on-reset in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPOLICY_CANNOT_DETERMINE_FORCE_CHANGE_ON_RESET =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPOLICY_CANNOT_DETERMINE_FORCE_CHANGE_ON_RESET_444",CORE,SEVERE_ERROR,444, getClassLoader());

  /**
   * Indicates whether passwords set by administrators (in add, modify, or password modify operations) will be allowed to bypass the password validation process that will be required for user password changes.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_PWPOLICY_DESCRIPTION_SKIP_ADMIN_VALIDATION =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPOLICY_DESCRIPTION_SKIP_ADMIN_VALIDATION_445",CORE,INFORMATION,445, getClassLoader());

  /**
   * An error occurred while attempting to determine the value for attribute ds-cfg-skip-validation-for-administrators in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPOLICY_CANNOT_DETERMINE_SKIP_ADMIN_VALIDATION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPOLICY_CANNOT_DETERMINE_SKIP_ADMIN_VALIDATION_446",CORE,SEVERE_ERROR,446, getClassLoader());

  /**
   * DN of the configuration entry that references the password generator for use with the associated password policy.  This will be used in conjunction with the password modify extended operation to generate a new password for a user when none was provided in the request.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_PWPOLICY_DESCRIPTION_PASSWORD_GENERATOR =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPOLICY_DESCRIPTION_PASSWORD_GENERATOR_447",CORE,INFORMATION,447, getClassLoader());

  /**
   * The password policy definition contained in configuration entry "%s" is invalid because it references password generator "%s" that is not defined in the server configuration
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPOLICY_NO_SUCH_GENERATOR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPOLICY_NO_SUCH_GENERATOR_448",CORE,SEVERE_ERROR,448, getClassLoader());

  /**
   * An error occurred while attempting to determine the value for attribute ds-cfg-password-generator in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPOLICY_CANNOT_DETERMINE_PASSWORD_GENERATOR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPOLICY_CANNOT_DETERMINE_PASSWORD_GENERATOR_449",CORE,SEVERE_ERROR,449, getClassLoader());

  /**
   * Indicates whether users with the associated password policy will be required to authenticate in a secure manner.  This could mean either using a secure communication channel between the client and the server, or using a SASL mechanism that does not expose the credentials.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_PWPOLICY_DESCRIPTION_REQUIRE_SECURE_AUTH =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPOLICY_DESCRIPTION_REQUIRE_SECURE_AUTH_450",CORE,INFORMATION,450, getClassLoader());

  /**
   * An error occurred while attempting to determine the value for attribute ds-cfg-require-secure-authentication in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPOLICY_CANNOT_DETERMINE_REQUIRE_SECURE_AUTH =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPOLICY_CANNOT_DETERMINE_REQUIRE_SECURE_AUTH_451",CORE,SEVERE_ERROR,451, getClassLoader());

  /**
   * Indicates whether users with the associated password policy will be required to change their password in a secure manner that does not expose the credentials.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_PWPOLICY_DESCRIPTION_REQUIRE_SECURE_CHANGES =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPOLICY_DESCRIPTION_REQUIRE_SECURE_CHANGES_452",CORE,INFORMATION,452, getClassLoader());

  /**
   * An error occurred while attempting to determine the value for attribute ds-cfg-require-secure-password-changes in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPOLICY_CANNOT_DETERMINE_REQUIRE_SECURE_CHANGES =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPOLICY_CANNOT_DETERMINE_REQUIRE_SECURE_CHANGES_453",CORE,SEVERE_ERROR,453, getClassLoader());

  /**
   * Indicates whether users will be allowed to change their passwords by providing a pre-encoded value.  This can cause a security risk because the clear-text version of the password is not known and therefore validation checks cannot be applied to it.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_PWPOLICY_DESCRIPTION_ALLOW_PREENCODED =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPOLICY_DESCRIPTION_ALLOW_PREENCODED_454",CORE,INFORMATION,454, getClassLoader());

  /**
   * An error occurred while attempting to determine the value for attribute ds-cfg-allow-pre-encoded-passwords in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPOLICY_CANNOT_DETERMINE_ALLOW_PREENCODED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPOLICY_CANNOT_DETERMINE_ALLOW_PREENCODED_455",CORE,SEVERE_ERROR,455, getClassLoader());

  /**
   * Minimum length of time that must pass after a password change before the user will be allowed to change the password again.  The value of this attribute should be an integer followed by a unit of seconds, minutes, hours, days, or weeks.  This setting can be used to prevent users from changing their passwords repeatedly over a short period of time to flush and old password from the history so that it may be re-used.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_PWPOLICY_DESCRIPTION_MIN_AGE =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPOLICY_DESCRIPTION_MIN_AGE_456",CORE,INFORMATION,456, getClassLoader());

  /**
   * An error occurred while attempting to determine the value for attribute ds-cfg-min-password-age in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPOLICY_CANNOT_DETERMINE_MIN_AGE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPOLICY_CANNOT_DETERMINE_MIN_AGE_457",CORE,SEVERE_ERROR,457, getClassLoader());

  /**
   * Maximum length of time that a user may continue using the same password before it must be changed (i.e., the password expiration interval).  The value of this attribute should be an integer followed by a unit of seconds, minutes, hours, days, or weeks. A value of 0 seconds will disable password expiration.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_PWPOLICY_DESCRIPTION_MAX_AGE =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPOLICY_DESCRIPTION_MAX_AGE_458",CORE,INFORMATION,458, getClassLoader());

  /**
   * An error occurred while attempting to determine the value for attribute ds-cfg-max-password-age in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPOLICY_CANNOT_DETERMINE_MAX_AGE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPOLICY_CANNOT_DETERMINE_MAX_AGE_459",CORE,SEVERE_ERROR,459, getClassLoader());

  /**
   * Maximum length of time that users have to change passwords after they have been reset by an administrator before they become locked.  The value of this attribute should be an integer followed by a unit of seconds, minutes, hours, days, or weeks. A value of 0 seconds will disable this feature.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_PWPOLICY_DESCRIPTION_MAX_RESET_AGE =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPOLICY_DESCRIPTION_MAX_RESET_AGE_460",CORE,INFORMATION,460, getClassLoader());

  /**
   * An error occurred while attempting to determine the value for attribute ds-cfg-max-password-reset-age in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPOLICY_CANNOT_DETERMINE_MAX_RESET_AGE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPOLICY_CANNOT_DETERMINE_MAX_RESET_AGE_461",CORE,SEVERE_ERROR,461, getClassLoader());

  /**
   * Maximum length of time before a user's password actually expires that the server will begin to include warning notifications in bind responses for that user.  The value of this attribute should be an integer followed by a unit of seconds, minutes, hours, days, or weeks.  A value of 0 seconds will disable the warning interval.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_PWPOLICY_DESCRIPTION_WARNING_INTERVAL =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPOLICY_DESCRIPTION_WARNING_INTERVAL_462",CORE,INFORMATION,462, getClassLoader());

  /**
   * An error occurred while attempting to determine the value for attribute ds-cfg-password-expiration-warning-interval in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPOLICY_CANNOT_DETERMINE_WARNING_INTERVAL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPOLICY_CANNOT_DETERMINE_WARNING_INTERVAL_463",CORE,SEVERE_ERROR,463, getClassLoader());

  /**
   * Indicates whether the Directory Server should allow a user's password to expire even if that user has never seen an expiration warning notification.  If this setting is enabled, then accounts will always be expired when the expiration time arrives.  If it is disabled, then the user will always receive at least one warning notification, and the password expiration will be set to the warning time plus the warning interval.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_PWPOLICY_DESCRIPTION_EXPIRE_WITHOUT_WARNING =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPOLICY_DESCRIPTION_EXPIRE_WITHOUT_WARNING_464",CORE,INFORMATION,464, getClassLoader());

  /**
   * An error occurred while attempting to determine the value for attribute ds-cfg-expire-passwords-without-warning in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPOLICY_CANNOT_DETERMINE_EXPIRE_WITHOUT_WARNING =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPOLICY_CANNOT_DETERMINE_EXPIRE_WITHOUT_WARNING_465",CORE,SEVERE_ERROR,465, getClassLoader());

  /**
   * Indicates whether a user whose password is expired will still be allowed to change that password using the password modify extended operation.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_PWPOLICY_DESCRIPTION_ALLOW_EXPIRED_CHANGES =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPOLICY_DESCRIPTION_ALLOW_EXPIRED_CHANGES_466",CORE,INFORMATION,466, getClassLoader());

  /**
   * An error occurred while attempting to determine the value for attribute ds-cfg-allow-expired-password-changes in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPOLICY_CANNOT_DETERMINE_ALLOW_EXPIRED_CHANGES =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPOLICY_CANNOT_DETERMINE_ALLOW_EXPIRED_CHANGES_467",CORE,SEVERE_ERROR,467, getClassLoader());

  /**
   * Number of grace logins that a user will be allowed after the account has expired to allow that user to choose a new password.  A value of 0 indicates that no grace logins will be allowed.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_PWPOLICY_DESCRIPTION_GRACE_LOGIN_COUNT =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPOLICY_DESCRIPTION_GRACE_LOGIN_COUNT_468",CORE,INFORMATION,468, getClassLoader());

  /**
   * An error occurred while attempting to determine the value for attribute ds-cfg-grace-login-count in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPOLICY_CANNOT_DETERMINE_GRACE_LOGIN_COUNT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPOLICY_CANNOT_DETERMINE_GRACE_LOGIN_COUNT_469",CORE,SEVERE_ERROR,469, getClassLoader());

  /**
   * Maximum number of authentication failures that a user should be allowed before the account is locked out.  A value of 0 indicates that accounts should never be locked out due to failed attempts.  changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_PWPOLICY_DESCRIPTION_LOCKOUT_FAILURE_COUNT =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPOLICY_DESCRIPTION_LOCKOUT_FAILURE_COUNT_470",CORE,INFORMATION,470, getClassLoader());

  /**
   * An error occurred while attempting to determine the value for attribute ds-cfg-lockout-failure-count in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPOLICY_CANNOT_DETERMINE_LOCKOUT_FAILURE_COUNT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPOLICY_CANNOT_DETERMINE_LOCKOUT_FAILURE_COUNT_471",CORE,SEVERE_ERROR,471, getClassLoader());

  /**
   * Length of time that an account should be locked after too many authentication failures.  The value of this attribute should be an integer followed by a unit of seconds, minutes, hours, days, or weeks.  A value of 0 seconds indicates that the account should remain locked until an administrator resets the password. Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_PWPOLICY_DESCRIPTION_LOCKOUT_DURATION =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPOLICY_DESCRIPTION_LOCKOUT_DURATION_472",CORE,INFORMATION,472, getClassLoader());

  /**
   * An error occurred while attempting to determine the value for attribute ds-cfg-lockout-duration in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPOLICY_CANNOT_DETERMINE_LOCKOUT_DURATION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPOLICY_CANNOT_DETERMINE_LOCKOUT_DURATION_473",CORE,SEVERE_ERROR,473, getClassLoader());

  /**
   * Length of time that should pass before an authentication failure is no longer counted against a user for the purposes of account lockout.  The value of this attribute should be an integer followed by a unit of seconds, minutes, hours, days, or weeks.  A value of 0 seconds indicates that the authentication failures should never expire.  The failure count will always be cleared upon a successful authentication.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_PWPOLICY_DESCRIPTION_FAILURE_EXPIRATION =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPOLICY_DESCRIPTION_FAILURE_EXPIRATION_474",CORE,INFORMATION,474, getClassLoader());

  /**
   * An error occurred while attempting to determine the value for attribute ds-cfg-lockout-failure-expiration-interval in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPOLICY_CANNOT_DETERMINE_FAILURE_EXPIRATION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPOLICY_CANNOT_DETERMINE_FAILURE_EXPIRATION_475",CORE,SEVERE_ERROR,475, getClassLoader());

  /**
   * Time by which all users with the associated password policy must change their passwords.  The value should be expressed in a generalized time format.  If this time is equal to the current time or is in the past, then all users will be required to change their passwords immediately.  The behavior of the server in this mode will be identical to the behavior observed when users are forced to change their passwords after an administrative reset.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_PWPOLICY_DESCRIPTION_REQUIRE_CHANGE_BY_TIME =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPOLICY_DESCRIPTION_REQUIRE_CHANGE_BY_TIME_476",CORE,INFORMATION,476, getClassLoader());

  /**
   * An error occurred while attempting to determine the value for attribute ds-cfg-require-change-by-time in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPOLICY_CANNOT_DETERMINE_REQUIRE_CHANGE_BY_TIME =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPOLICY_CANNOT_DETERMINE_REQUIRE_CHANGE_BY_TIME_477",CORE,SEVERE_ERROR,477, getClassLoader());

  /**
   * Name or OID of the attribute type that should be used to hold the last login time for users with the associated password policy.   This attribute type must be defined in the Directory Server schema and must either be defined as an operational attribute or must be allowed by the set of object classes for all users with the associated password policy.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_PWPOLICY_DESCRIPTION_LAST_LOGIN_TIME_ATTR =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPOLICY_DESCRIPTION_LAST_LOGIN_TIME_ATTR_478",CORE,INFORMATION,478, getClassLoader());

  /**
   * The password policy definition contained in configuration entry "%s" is invalid because the specified last login time attribute "%s" is not defined in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPOLICY_UNDEFINED_LAST_LOGIN_TIME_ATTRIBUTE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPOLICY_UNDEFINED_LAST_LOGIN_TIME_ATTRIBUTE_479",CORE,SEVERE_ERROR,479, getClassLoader());

  /**
   * An error occurred while attempting to determine the value for attribute ds-cfg-last-login-time-attribute in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPOLICY_CANNOT_DETERMINE_LAST_LOGIN_TIME_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPOLICY_CANNOT_DETERMINE_LAST_LOGIN_TIME_ATTR_480",CORE,SEVERE_ERROR,480, getClassLoader());

  /**
   * Format string that should be used to generate the last login time value for users with the associated password policy.  This format string should conform to the syntax described in the API documentation for the <CODE>java.text.SimpleDateFormat</CODE> class.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_PWPOLICY_DESCRIPTION_LAST_LOGIN_TIME_FORMAT =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPOLICY_DESCRIPTION_LAST_LOGIN_TIME_FORMAT_481",CORE,INFORMATION,481, getClassLoader());

  /**
   * The password policy definition contained in configuration entry "%s" is invalid because the specified last login time format "%s" is not a valid format string  The last login time format string should conform to the syntax described in the API documentation for the <CODE>java.text.SimpleDateFormat</CODE> class
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPOLICY_INVALID_LAST_LOGIN_TIME_FORMAT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPOLICY_INVALID_LAST_LOGIN_TIME_FORMAT_482",CORE,SEVERE_ERROR,482, getClassLoader());

  /**
   * An error occurred while attempting to determine the value for attribute ds-cfg-last-login-time-format in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPOLICY_CANNOT_DETERMINE_LAST_LOGIN_TIME_FORMAT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPOLICY_CANNOT_DETERMINE_LAST_LOGIN_TIME_FORMAT_483",CORE,SEVERE_ERROR,483, getClassLoader());

  /**
   * Format string(s) that may have been used with the last login time at any point in the past for users associated with the password policy.  These values are used to make it possible to parse previous values, but will not be used to set new values.  These format strings should conform to the syntax described in the API documentation for the <CODE>java.text.SimpleDateFormat</CODE> class.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_PWPOLICY_DESCRIPTION_PREVIOUS_LAST_LOGIN_TIME_FORMAT =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPOLICY_DESCRIPTION_PREVIOUS_LAST_LOGIN_TIME_FORMAT_484",CORE,INFORMATION,484, getClassLoader());

  /**
   * The password policy definition contained in configuration entry "%s" is invalid because the specified previous last login time format "%s" is not a valid format string  The previous last login time format strings should conform to the syntax described in the API documentation for the <CODE>java.text.SimpleDateFormat</CODE> class
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPOLICY_INVALID_PREVIOUS_LAST_LOGIN_TIME_FORMAT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPOLICY_INVALID_PREVIOUS_LAST_LOGIN_TIME_FORMAT_485",CORE,SEVERE_ERROR,485, getClassLoader());

  /**
   * An error occurred while attempting to determine the values for attribute ds-cfg-previous-last-login-time-format in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPOLICY_CANNOT_DETERMINE_PREVIOUS_LAST_LOGIN_TIME_FORMAT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPOLICY_CANNOT_DETERMINE_PREVIOUS_LAST_LOGIN_TIME_FORMAT_486",CORE,SEVERE_ERROR,486, getClassLoader());

  /**
   * Maximum length of time that an account may remain idle (i.e., the associated user does not authenticate to the server) before that user is locked out.  The value of this attribute should be an integer followed by a unit of seconds, minutes, hours, days, or weeks.  A value of 0 seconds indicates that idle accounts should not automatically be locked out.  This feature will only be available if the last login time is maintained.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_PWPOLICY_DESCRIPTION_IDLE_LOCKOUT_INTERVAL =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPOLICY_DESCRIPTION_IDLE_LOCKOUT_INTERVAL_487",CORE,INFORMATION,487, getClassLoader());

  /**
   * An error occurred while attempting to determine the value for attribute ds-cfg-idle-lockout-interval in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPOLICY_CANNOT_DETERMINE_IDLE_LOCKOUT_INTERVAL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPOLICY_CANNOT_DETERMINE_IDLE_LOCKOUT_INTERVAL_488",CORE,SEVERE_ERROR,488, getClassLoader());

  /**
   * The password policy defined in configuration entry %s has been successfully updated
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_PWPOLICY_UPDATED_POLICY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_PWPOLICY_UPDATED_POLICY_489",CORE,INFORMATION,489, getClassLoader());

  /**
   * Entry "%s" cannot be added because it contains an invalid password policy subentry DN:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ADD_INVALID_PWPOLICY_DN_SYNTAX =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ADD_INVALID_PWPOLICY_DN_SYNTAX_490",CORE,MILD_ERROR,490, getClassLoader());

  /**
   * Entry "%s" cannot be added because it references password policy subentry %s that does not exist or does not contain a valid password policy subentry definition
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ADD_NO_SUCH_PWPOLICY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ADD_NO_SUCH_PWPOLICY_491",CORE,MILD_ERROR,491, getClassLoader());

  /**
   * Indicates whether users will be forced to change their passwords upon first authenticating to the Directory Server after their account has been created.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_PWPOLICY_DESCRIPTION_FORCE_CHANGE_ON_ADD =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPOLICY_DESCRIPTION_FORCE_CHANGE_ON_ADD_492",CORE,INFORMATION,492, getClassLoader());

  /**
   * An error occurred while attempting to determine the value for attribute ds-cfg-force-change-on-add in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPOLICY_CANNOT_DETERMINE_FORCE_CHANGE_ON_ADD =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPOLICY_CANNOT_DETERMINE_FORCE_CHANGE_ON_ADD_493",CORE,SEVERE_ERROR,493, getClassLoader());

  /**
   * Indicates whether user entries will be allowed to have multiple distinct values for the password attribute.  This is potentially dangerous because many mechanisms used to change the password do not work well with such a configuration.  If multiple password values are allowed, then any of them may be used to authenticate, and they will all be subject to the same policy constraints.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_PWPOLICY_DESCRIPTION_ALLOW_MULTIPLE_PW_VALUES =
          new MessageDescriptor.Arg0(BASE,"INFO_PWPOLICY_DESCRIPTION_ALLOW_MULTIPLE_PW_VALUES_494",CORE,INFORMATION,494, getClassLoader());

  /**
   * An error occurred while attempting to determine the value for attribute ds-cfg-allow-multiple-password-values in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPOLICY_CANNOT_DETERMINE_ALLOW_MULTIPLE_PW_VALUES =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPOLICY_CANNOT_DETERMINE_ALLOW_MULTIPLE_PW_VALUES_495",CORE,SEVERE_ERROR,495, getClassLoader());

  /**
   * Attribute options are not allowed for the password attribute %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PWPOLICY_ATTRIBUTE_OPTIONS_NOT_ALLOWED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_PWPOLICY_ATTRIBUTE_OPTIONS_NOT_ALLOWED_496",CORE,MILD_ERROR,496, getClassLoader());

  /**
   * Only a single value may be provided for the password attribute %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PWPOLICY_MULTIPLE_PW_VALUES_NOT_ALLOWED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_PWPOLICY_MULTIPLE_PW_VALUES_NOT_ALLOWED_497",CORE,MILD_ERROR,497, getClassLoader());

  /**
   * Pre-encoded passwords are not allowed for the password attribute %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PWPOLICY_PREENCODED_NOT_ALLOWED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_PWPOLICY_PREENCODED_NOT_ALLOWED_498",CORE,MILD_ERROR,498, getClassLoader());

  /**
   * The password value for attribute %s was found to be unacceptable:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPOLICY_VALIDATION_FAILED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_PWPOLICY_VALIDATION_FAILED_499",CORE,MILD_ERROR,499, getClassLoader());

  /**
   * The password policy defined in configuration entry %s is configured to always send at least one warning notification before the password is expired, but no warning interval has been set.  If configuration attribute ds-cfg-expire-passwords-without-warning is set to "false", then configuration attribute ds-cfg-password-expiration-warning-interval must have a positive value
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PWPOLICY_MUST_HAVE_WARNING_IF_NOT_EXPIRE_WITHOUT_WARNING =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PWPOLICY_MUST_HAVE_WARNING_IF_NOT_EXPIRE_WITHOUT_WARNING_500",CORE,SEVERE_ERROR,500, getClassLoader());

  /**
   * A bind operation is currently in progress on the associated client connection.  No other requests may be made on this client connection until the bind processing has completed
   */
  public static final MessageDescriptor.Arg0 ERR_ENQUEUE_BIND_IN_PROGRESS =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_ENQUEUE_BIND_IN_PROGRESS_501",CORE,MILD_ERROR,501, getClassLoader());

  /**
   * You must change your password before you will be allowed to request any other operations
   */
  public static final MessageDescriptor.Arg0 ERR_ENQUEUE_MUST_CHANGE_PASSWORD =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_ENQUEUE_MUST_CHANGE_PASSWORD_502",CORE,MILD_ERROR,502, getClassLoader());

  /**
   * An error occurred while attempting to decode the ds-pwp-password-policy-dn value "%s" in user entry "%s" as a DN:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_PWPSTATE_CANNOT_DECODE_SUBENTRY_VALUE_AS_DN =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_PWPSTATE_CANNOT_DECODE_SUBENTRY_VALUE_AS_DN_504",CORE,MILD_ERROR,504, getClassLoader());

  /**
   * User entry %s is configured to use a password policy subentry of %s but no such password policy has been defined in the server configuration
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPSTATE_NO_SUCH_POLICY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_PWPSTATE_NO_SUCH_POLICY_505",CORE,MILD_ERROR,505, getClassLoader());

  /**
   * An error occurred while attempting to decode value "%s" for attribute %s in user entry %s in accordance with the generalized time format:  %s
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> ERR_PWPSTATE_CANNOT_DECODE_GENERALIZED_TIME =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_PWPSTATE_CANNOT_DECODE_GENERALIZED_TIME_506",CORE,MILD_ERROR,506, getClassLoader());

  /**
   * Unable to decode value "%s" for attribute %s in user entry %s as a Boolean value
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_PWPSTATE_CANNOT_DECODE_BOOLEAN =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_PWPSTATE_CANNOT_DECODE_BOOLEAN_507",CORE,MILD_ERROR,507, getClassLoader());

  /**
   * The entry %s cannot be added due to insufficient access rights
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ADD_AUTHZ_INSUFFICIENT_ACCESS_RIGHTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_ADD_AUTHZ_INSUFFICIENT_ACCESS_RIGHTS_508",CORE,SEVERE_ERROR,508, getClassLoader());

  /**
   * The user %s cannot bind due to insufficient access rights
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_BIND_AUTHZ_INSUFFICIENT_ACCESS_RIGHTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_BIND_AUTHZ_INSUFFICIENT_ACCESS_RIGHTS_509",CORE,SEVERE_ERROR,509, getClassLoader());

  /**
   * The entry %s cannot be compared due to insufficient access rights
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_COMPARE_AUTHZ_INSUFFICIENT_ACCESS_RIGHTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_COMPARE_AUTHZ_INSUFFICIENT_ACCESS_RIGHTS_510",CORE,SEVERE_ERROR,510, getClassLoader());

  /**
   * The entry %s cannot be deleted due to insufficient access rights
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DELETE_AUTHZ_INSUFFICIENT_ACCESS_RIGHTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DELETE_AUTHZ_INSUFFICIENT_ACCESS_RIGHTS_511",CORE,SEVERE_ERROR,511, getClassLoader());

  /**
   * The extended operation %s cannot be performed due to insufficient access rights
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_EXTENDED_AUTHZ_INSUFFICIENT_ACCESS_RIGHTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_EXTENDED_AUTHZ_INSUFFICIENT_ACCESS_RIGHTS_512",CORE,SEVERE_ERROR,512, getClassLoader());

  /**
   * The entry %s cannot be renamed due to insufficient access rights
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MODDN_AUTHZ_INSUFFICIENT_ACCESS_RIGHTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_MODDN_AUTHZ_INSUFFICIENT_ACCESS_RIGHTS_513",CORE,SEVERE_ERROR,513, getClassLoader());

  /**
   * The entry %s cannot be modified due to insufficient access rights
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MODIFY_AUTHZ_INSUFFICIENT_ACCESS_RIGHTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_MODIFY_AUTHZ_INSUFFICIENT_ACCESS_RIGHTS_514",CORE,SEVERE_ERROR,514, getClassLoader());

  /**
   * The entry %s cannot be searched due to insufficient access rights
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SEARCH_AUTHZ_INSUFFICIENT_ACCESS_RIGHTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_SEARCH_AUTHZ_INSUFFICIENT_ACCESS_RIGHTS_515",CORE,SEVERE_ERROR,515, getClassLoader());

  /**
   * Rejecting a simple bind request for user %s because the password policy requires secure authentication
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_BIND_OPERATION_INSECURE_SIMPLE_BIND =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_BIND_OPERATION_INSECURE_SIMPLE_BIND_516",CORE,MILD_ERROR,516, getClassLoader());

  /**
   * Rejecting a bind request for user %s because the account has been administrative disabled
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_BIND_OPERATION_ACCOUNT_DISABLED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_BIND_OPERATION_ACCOUNT_DISABLED_517",CORE,MILD_ERROR,517, getClassLoader());

  /**
   * Rejecting a bind request for user %s because the account has been locked due to too many failed authentication attempts
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_BIND_OPERATION_ACCOUNT_FAILURE_LOCKED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_BIND_OPERATION_ACCOUNT_FAILURE_LOCKED_518",CORE,MILD_ERROR,518, getClassLoader());

  /**
   * Rejecting a bind request for user %s because the account has been locked after the user's password was not changed in a timely manner after an administrative reset
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_BIND_OPERATION_ACCOUNT_RESET_LOCKED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_BIND_OPERATION_ACCOUNT_RESET_LOCKED_519",CORE,MILD_ERROR,519, getClassLoader());

  /**
   * Rejecting a bind request for user %s because the account has been locked after remaining idle for too long
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_BIND_OPERATION_ACCOUNT_IDLE_LOCKED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_BIND_OPERATION_ACCOUNT_IDLE_LOCKED_520",CORE,MILD_ERROR,520, getClassLoader());

  /**
   * Rejecting a bind request for user %s because that user's password is expired
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_BIND_OPERATION_PASSWORD_EXPIRED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_BIND_OPERATION_PASSWORD_EXPIRED_521",CORE,MILD_ERROR,521, getClassLoader());

  /**
   * An error occurred while attempting to update password policy state information for user %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPSTATE_CANNOT_UPDATE_USER_ENTRY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_PWPSTATE_CANNOT_UPDATE_USER_ENTRY_522",CORE,MILD_ERROR,522, getClassLoader());

  /**
   * Rejecting a SASL %s bind request for user %s because the password policy requires secure authentication
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_BIND_OPERATION_INSECURE_SASL_BIND =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_BIND_OPERATION_INSECURE_SASL_BIND_523",CORE,MILD_ERROR,523, getClassLoader());

  /**
   * An error occurred while attempting to parse string %s as the DN of the work queue configuration entry:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_WORKQ_CANNOT_PARSE_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_WORKQ_CANNOT_PARSE_DN_524",CORE,SEVERE_ERROR,524, getClassLoader());

  /**
   * Work queue configuration entry %s does not exist in the server configuration
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_WORKQ_NO_CONFIG =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_WORKQ_NO_CONFIG_525",CORE,SEVERE_ERROR,525, getClassLoader());

  /**
   * Fully-qualified name of the Java class that provides the core work queue logic for the Directory Server. Changes to this configuration attribute require that the server be restarted for the change to take effect
   */
  public static final MessageDescriptor.Arg0 INFO_WORKQ_DESCRIPTION_CLASS =
          new MessageDescriptor.Arg0(BASE,"INFO_WORKQ_DESCRIPTION_CLASS_526",CORE,INFORMATION,526, getClassLoader());

  /**
   * Configuration entry %s does not contain required attribute %s that specifies the fully-qualified class name for the work queue implementation
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_WORKQ_NO_CLASS_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_WORKQ_NO_CLASS_ATTR_527",CORE,SEVERE_ERROR,527, getClassLoader());

  /**
   * An error occurred while trying to load class %s to use as the Directory Server work queue implementation:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_WORKQ_CANNOT_LOAD =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_WORKQ_CANNOT_LOAD_528",CORE,SEVERE_ERROR,528, getClassLoader());

  /**
   * An error occurred while trying to create an instance of class %s to use as the Directory Server work queue:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_WORKQ_CANNOT_INSTANTIATE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_WORKQ_CANNOT_INSTANTIATE_529",CORE,SEVERE_ERROR,529, getClassLoader());

  /**
   * The alternate root bind DN "%s" is already registered with the Directory Server for actual root entry DN "%s"
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CANNOT_REGISTER_DUPLICATE_ALTERNATE_ROOT_BIND_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CANNOT_REGISTER_DUPLICATE_ALTERNATE_ROOT_BIND_DN_530",CORE,SEVERE_ERROR,530, getClassLoader());

  /**
   * Rejecting a bind request for user %s because the account has expired
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_BIND_OPERATION_ACCOUNT_EXPIRED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_BIND_OPERATION_ACCOUNT_EXPIRED_531",CORE,MILD_ERROR,531, getClassLoader());

  /**
   * Attributes used to hold user passwords are not allowed to have any attribute options
   */
  public static final MessageDescriptor.Arg0 ERR_MODIFY_PASSWORDS_CANNOT_HAVE_OPTIONS =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_MODIFY_PASSWORDS_CANNOT_HAVE_OPTIONS_532",CORE,MILD_ERROR,532, getClassLoader());

  /**
   * Users are not allowed to change their own passwords
   */
  public static final MessageDescriptor.Arg0 ERR_MODIFY_NO_USER_PW_CHANGES =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_MODIFY_NO_USER_PW_CHANGES_533",CORE,MILD_ERROR,533, getClassLoader());

  /**
   * Password changes must be performed over a secure authentication channel
   */
  public static final MessageDescriptor.Arg0 ERR_MODIFY_REQUIRE_SECURE_CHANGES =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_MODIFY_REQUIRE_SECURE_CHANGES_534",CORE,MILD_ERROR,534, getClassLoader());

  /**
   * The password cannot be changed because it has not been long enough since the last password change
   */
  public static final MessageDescriptor.Arg0 ERR_MODIFY_WITHIN_MINIMUM_AGE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_MODIFY_WITHIN_MINIMUM_AGE_535",CORE,MILD_ERROR,535, getClassLoader());

  /**
   * Multiple password values are not allowed in user entries
   */
  public static final MessageDescriptor.Arg0 ERR_MODIFY_MULTIPLE_VALUES_NOT_ALLOWED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_MODIFY_MULTIPLE_VALUES_NOT_ALLOWED_536",CORE,MILD_ERROR,536, getClassLoader());

  /**
   * User passwords may not be provided in pre-encoded form
   */
  public static final MessageDescriptor.Arg0 ERR_MODIFY_NO_PREENCODED_PASSWORDS =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_MODIFY_NO_PREENCODED_PASSWORDS_537",CORE,MILD_ERROR,537, getClassLoader());

  /**
   * Invalid modification type %s attempted on password attribute %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MODIFY_INVALID_MOD_TYPE_FOR_PASSWORD =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_MODIFY_INVALID_MOD_TYPE_FOR_PASSWORD_538",CORE,MILD_ERROR,538, getClassLoader());

  /**
   * The user entry does not have any existing passwords to remove
   */
  public static final MessageDescriptor.Arg0 ERR_MODIFY_NO_EXISTING_VALUES =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_MODIFY_NO_EXISTING_VALUES_539",CORE,MILD_ERROR,539, getClassLoader());

  /**
   * An error occurred while attempting to decode an existing user password:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MODIFY_CANNOT_DECODE_PW =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_MODIFY_CANNOT_DECODE_PW_540",CORE,MILD_ERROR,540, getClassLoader());

  /**
   * The provided user password does not match any password in the user's entry
   */
  public static final MessageDescriptor.Arg0 ERR_MODIFY_INVALID_PASSWORD =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_MODIFY_INVALID_PASSWORD_541",CORE,MILD_ERROR,541, getClassLoader());

  /**
   * The password policy requires that user password changes include the current password in the request
   */
  public static final MessageDescriptor.Arg0 ERR_MODIFY_PW_CHANGE_REQUIRES_CURRENT_PW =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_MODIFY_PW_CHANGE_REQUIRES_CURRENT_PW_542",CORE,MILD_ERROR,542, getClassLoader());

  /**
   * The password change would result in multiple password values in the user entry, which is not allowed
   */
  public static final MessageDescriptor.Arg0 ERR_MODIFY_MULTIPLE_PASSWORDS_NOT_ALLOWED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_MODIFY_MULTIPLE_PASSWORDS_NOT_ALLOWED_543",CORE,MILD_ERROR,543, getClassLoader());

  /**
   * The provided password value was rejected by a password validator:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MODIFY_PW_VALIDATION_FAILED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_MODIFY_PW_VALIDATION_FAILED_544",CORE,MILD_ERROR,544, getClassLoader());

  /**
   * You must change your password before you will be allowed to perform any other operations
   */
  public static final MessageDescriptor.Arg0 ERR_MODIFY_MUST_CHANGE_PASSWORD =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_MODIFY_MUST_CHANGE_PASSWORD_545",CORE,MILD_ERROR,545, getClassLoader());

  /**
   * pw-policy
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_CATEGORY_PASSWORD_POLICY =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_CATEGORY_PASSWORD_POLICY_546",CORE,INFORMATION,546, getClassLoader());

  /**
   * The user password is about to expire (time to expiration:  %s)
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_BIND_PASSWORD_EXPIRING =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_WARN_BIND_PASSWORD_EXPIRING_547",CORE,MILD_WARNING,547, getClassLoader());

  /**
   * The account has been locked as a result of too many failed authentication attempts (time to unlock:  %s)
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_BIND_ACCOUNT_TEMPORARILY_LOCKED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_BIND_ACCOUNT_TEMPORARILY_LOCKED_548",CORE,MILD_ERROR,548, getClassLoader());

  /**
   * The account has been locked as a result of too many failed authentication attempts.  It may only be unlocked by an administrator
   */
  public static final MessageDescriptor.Arg0 ERR_BIND_ACCOUNT_PERMANENTLY_LOCKED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_BIND_ACCOUNT_PERMANENTLY_LOCKED_549",CORE,MILD_ERROR,549, getClassLoader());

  /**
   * Invalid value provided for operational attribute %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MODIFY_INVALID_DISABLED_VALUE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_MODIFY_INVALID_DISABLED_VALUE_550",CORE,MILD_ERROR,550, getClassLoader());

  /**
   * The user password has been changed
   */
  public static final MessageDescriptor.Arg0 INFO_MODIFY_PASSWORD_CHANGED =
          new MessageDescriptor.Arg0(BASE,"INFO_MODIFY_PASSWORD_CHANGED_551",CORE,INFORMATION,551, getClassLoader());

  /**
   * The user password has been administratively reset
   */
  public static final MessageDescriptor.Arg0 INFO_MODIFY_PASSWORD_RESET =
          new MessageDescriptor.Arg0(BASE,"INFO_MODIFY_PASSWORD_RESET_552",CORE,INFORMATION,552, getClassLoader());

  /**
   * The user account has been administratively enabled
   */
  public static final MessageDescriptor.Arg0 INFO_MODIFY_ACCOUNT_ENABLED =
          new MessageDescriptor.Arg0(BASE,"INFO_MODIFY_ACCOUNT_ENABLED_553",CORE,INFORMATION,553, getClassLoader());

  /**
   * The user account has been administratively disabled
   */
  public static final MessageDescriptor.Arg0 INFO_MODIFY_ACCOUNT_DISABLED =
          new MessageDescriptor.Arg0(BASE,"INFO_MODIFY_ACCOUNT_DISABLED_554",CORE,INFORMATION,554, getClassLoader());

  /**
   * The user account has been administratively unlocked
   */
  public static final MessageDescriptor.Arg0 INFO_MODIFY_ACCOUNT_UNLOCKED =
          new MessageDescriptor.Arg0(BASE,"INFO_MODIFY_ACCOUNT_UNLOCKED_555",CORE,INFORMATION,555, getClassLoader());

  /**
   * The specified password value already exists in the user entry
   */
  public static final MessageDescriptor.Arg0 ERR_MODIFY_PASSWORD_EXISTS =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_MODIFY_PASSWORD_EXISTS_556",CORE,MILD_ERROR,556, getClassLoader());

  /**
   * There are multiple user-specific lookthrough limit values contained in user entry %s.  The default server lookthrough limit will be used
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_BIND_MULTIPLE_USER_LOOKTHROUGH_LIMITS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_BIND_MULTIPLE_USER_LOOKTHROUGH_LIMITS_557",CORE,SEVERE_WARNING,557, getClassLoader());

  /**
   * The user-specific lookthrough limit value %s contained in user entry %s could not be parsed as an integer.  The default server lookthrough limit will be used
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_BIND_CANNOT_PROCESS_USER_LOOKTHROUGH_LIMIT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_BIND_CANNOT_PROCESS_USER_LOOKTHROUGH_LIMIT_558",CORE,SEVERE_WARNING,558, getClassLoader());

  /**
   * Unable to add one or more values to attribute %s because at least one of the values already exists
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ENTRY_DUPLICATE_VALUES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ENTRY_DUPLICATE_VALUES_559",CORE,MILD_ERROR,559, getClassLoader());

  /**
   * Unable to remove one or more values from attribute %s because at least one of the attributes does not exist in the entry
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ENTRY_NO_SUCH_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ENTRY_NO_SUCH_VALUE_560",CORE,MILD_ERROR,560, getClassLoader());

  /**
   * The increment operation is not supported for the objectClass attribute
   */
  public static final MessageDescriptor.Arg0 ERR_ENTRY_OC_INCREMENT_NOT_SUPPORTED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_ENTRY_OC_INCREMENT_NOT_SUPPORTED_561",CORE,MILD_ERROR,561, getClassLoader());

  /**
   * Unknown modification type %s requested
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ENTRY_UNKNOWN_MODIFICATION_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ENTRY_UNKNOWN_MODIFICATION_TYPE_562",CORE,MILD_ERROR,562, getClassLoader());

  /**
   * Unable to increment the value of attribute %s because there are multiple values for that attribute
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ENTRY_INCREMENT_MULTIPLE_VALUES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ENTRY_INCREMENT_MULTIPLE_VALUES_563",CORE,MILD_ERROR,563, getClassLoader());

  /**
   * Unable to increment the value of attribute %s because the provided modification did not have exactly one value to use as the increment
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ENTRY_INCREMENT_INVALID_VALUE_COUNT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ENTRY_INCREMENT_INVALID_VALUE_COUNT_564",CORE,MILD_ERROR,564, getClassLoader());

  /**
   * Unable to increment the value of attribute %s because either the current value or the increment could not be parsed as an integer
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ENTRY_INCREMENT_CANNOT_PARSE_AS_INT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ENTRY_INCREMENT_CANNOT_PARSE_AS_INT_565",CORE,MILD_ERROR,565, getClassLoader());

  /**
   * Entry %s cannot be updated because the request did not contain any modifications
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MODIFY_NO_MODIFICATIONS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_MODIFY_NO_MODIFICATIONS_566",CORE,SEVERE_ERROR,566, getClassLoader());

  /**
   * Do not detach from the terminal and continue running in the foreground. This option cannot be used with the -t, --timeout option
   */
  public static final MessageDescriptor.Arg0 INFO_DSCORE_DESCRIPTION_NODETACH =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCORE_DESCRIPTION_NODETACH_567",CORE,INFORMATION,567, getClassLoader());

  /**
   * Unable to increment the value of attribute %s because that attribute does not exist in the entry
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ENTRY_INCREMENT_NO_SUCH_ATTRIBUTE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ENTRY_INCREMENT_NO_SUCH_ATTRIBUTE_568",CORE,MILD_ERROR,568, getClassLoader());

  /**
   * This utility can be used to start the Directory Server, as well as to obtain the server version and other forms of general server information
   */
  public static final MessageDescriptor.Arg0 INFO_DSCORE_TOOL_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCORE_TOOL_DESCRIPTION_569",CORE,INFORMATION,569, getClassLoader());

  /**
   * Unable to process the request for extended operation %s because it contained an unsupported critical control with OID %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_EXTENDED_UNSUPPORTED_CRITICAL_CONTROL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_EXTENDED_UNSUPPORTED_CRITICAL_CONTROL_570",CORE,MILD_ERROR,570, getClassLoader());

  /**
   * Unable to register backend %s with the Directory Server because another backend with the same backend ID is already registered
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_REGISTER_BACKEND_ALREADY_EXISTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_REGISTER_BACKEND_ALREADY_EXISTS_571",CORE,SEVERE_ERROR,571, getClassLoader());

  /**
   * Unable to register base DN %s with the Directory Server for backend %s because that base DN is already registered for backend %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_REGISTER_BASEDN_ALREADY_EXISTS =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_REGISTER_BASEDN_ALREADY_EXISTS_572",CORE,SEVERE_ERROR,572, getClassLoader());

  /**
   * Unable to register base DN %s with the Directory Server for backend %s because that backend already contains another base DN %s that is within the same hierarchical path
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_REGISTER_BASEDN_HIERARCHY_CONFLICT =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_REGISTER_BASEDN_HIERARCHY_CONFLICT_573",CORE,SEVERE_ERROR,573, getClassLoader());

  /**
   * Unable to register base DN %s with the Directory Server for backend %s because that backend already contains another base DN %s that is not subordinate to the same base DN in the parent backend
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_REGISTER_BASEDN_DIFFERENT_PARENT_BASES =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_REGISTER_BASEDN_DIFFERENT_PARENT_BASES_574",CORE,SEVERE_ERROR,574, getClassLoader());

  /**
   * Unable to register base DN %s with the Directory Server for backend %s because that backend already contains one or more other base DNs that are subordinate to backend %s but the new base DN is not
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_REGISTER_BASEDN_NEW_BASE_NOT_SUBORDINATE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_REGISTER_BASEDN_NEW_BASE_NOT_SUBORDINATE_575",CORE,SEVERE_ERROR,575, getClassLoader());

  /**
   * Backend %s already contains entry %s which has just been registered as the base DN for backend %s.  These conflicting entries can cause unexpected or errant search results, and both backends should be reinitialized to ensure that each has the correct content
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> WARN_REGISTER_BASEDN_ENTRIES_IN_MULTIPLE_BACKENDS =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_WARN_REGISTER_BASEDN_ENTRIES_IN_MULTIPLE_BACKENDS_576",CORE,SEVERE_WARNING,576, getClassLoader());

  /**
   * Unable to de-register base DN %s with the Directory Server because that base DN is not registered for any active backend
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DEREGISTER_BASEDN_NOT_REGISTERED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DEREGISTER_BASEDN_NOT_REGISTERED_577",CORE,SEVERE_ERROR,577, getClassLoader());

  /**
   * Base DN %s has been deregistered from the Directory Server for backend %s.  This base DN had both superior and subordinate entries in other backends, and there might be inconsistent or unexpected behavior when accessing entries in this portion of the hierarchy because of the missing entries that had been held in the de-registered backend
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_DEREGISTER_BASEDN_MISSING_HIERARCHY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_DEREGISTER_BASEDN_MISSING_HIERARCHY_578",CORE,SEVERE_WARNING,578, getClassLoader());

  /**
   * Unable to update the schema element with definition "%s" because a circular reference was identified when attempting to rebuild other schema elements dependent upon it
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SCHEMA_CIRCULAR_DEPENDENCY_REFERENCE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SCHEMA_CIRCULAR_DEPENDENCY_REFERENCE_579",CORE,MILD_ERROR,579, getClassLoader());

  /**
   * Rejecting the requested operation  because the connection has not been authenticated
   */
  public static final MessageDescriptor.Arg0 ERR_REJECT_UNAUTHENTICATED_OPERATION =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_REJECT_UNAUTHENTICATED_OPERATION_580",CORE,MILD_ERROR,580, getClassLoader());

  /**
   * Entry "%s" cannot be added because it contains attribute type %s which is declared OBSOLETE in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_ADD_ATTR_IS_OBSOLETE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_ADD_ATTR_IS_OBSOLETE_581",CORE,SEVERE_WARNING,581, getClassLoader());

  /**
   * Entry "%s" cannot be added because it contains objectclass %s which is declared OBSOLETE in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_ADD_OC_IS_OBSOLETE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_ADD_OC_IS_OBSOLETE_582",CORE,SEVERE_WARNING,582, getClassLoader());

  /**
   * Entry %s cannot be modified because the modification attempted to set one or more new values for attribute %s which is marked OBSOLETE in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MODIFY_ATTR_IS_OBSOLETE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_MODIFY_ATTR_IS_OBSOLETE_583",CORE,MILD_ERROR,583, getClassLoader());

  /**
   * Object class %s added to entry %s is marked OBSOLETE in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ENTRY_ADD_OBSOLETE_OC =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ENTRY_ADD_OBSOLETE_OC_584",CORE,MILD_ERROR,584, getClassLoader());

  /**
   * The modify DN operation for entry %s cannot be performed because the new RDN includes attribute type %s which is declared OBSOLETE in the server schema
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MODDN_NEWRDN_ATTR_IS_OBSOLETE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_MODDN_NEWRDN_ATTR_IS_OBSOLETE_585",CORE,MILD_ERROR,585, getClassLoader());

  /**
   * Entry %s is invalid according to the server schema because there is no DIT structure rule that applies to that entry, but there is a DIT structure rule for the parent entry %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ENTRY_SCHEMA_VIOLATES_PARENT_DSR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ENTRY_SCHEMA_VIOLATES_PARENT_DSR_586",CORE,MILD_ERROR,586, getClassLoader());

  /**
   * An unexpected error occurred while attempting to perform DIT structure rule processing for the parent of entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ENTRY_SCHEMA_COULD_NOT_CHECK_PARENT_DSR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ENTRY_SCHEMA_COULD_NOT_CHECK_PARENT_DSR_587",CORE,MILD_ERROR,587, getClassLoader());

  /**
   * Terminating the client connection because its associated authentication or authorization entry %s has been deleted
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_CLIENTCONNECTION_DISCONNECT_DUE_TO_DELETE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_WARN_CLIENTCONNECTION_DISCONNECT_DUE_TO_DELETE_588",CORE,MILD_WARNING,588, getClassLoader());

  /**
   * You do not have sufficient privileges to reset user passwords
   */
  public static final MessageDescriptor.Arg0 ERR_MODIFY_PWRESET_INSUFFICIENT_PRIVILEGES =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_MODIFY_PWRESET_INSUFFICIENT_PRIVILEGES_589",CORE,MILD_ERROR,589, getClassLoader());

  /**
   * You do not have sufficient privileges to access the server configuration
   */
  public static final MessageDescriptor.Arg0 ERR_COMPARE_CONFIG_INSUFFICIENT_PRIVILEGES =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_COMPARE_CONFIG_INSUFFICIENT_PRIVILEGES_590",CORE,MILD_ERROR,590, getClassLoader());

  /**
   * You do not have sufficient privileges to add entries that include privileges
   */
  public static final MessageDescriptor.Arg0 ERR_ADD_CHANGE_PRIVILEGE_INSUFFICIENT_PRIVILEGES =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_ADD_CHANGE_PRIVILEGE_INSUFFICIENT_PRIVILEGES_591",CORE,SEVERE_ERROR,591, getClassLoader());

  /**
   * You do not have sufficient privileges to modify the set of privileges contained in an entry
   */
  public static final MessageDescriptor.Arg0 ERR_MODIFY_CHANGE_PRIVILEGE_INSUFFICIENT_PRIVILEGES =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_MODIFY_CHANGE_PRIVILEGE_INSUFFICIENT_PRIVILEGES_592",CORE,MILD_ERROR,592, getClassLoader());

  /**
   * hasPrivilege determination for connID=%d opID=%d requesterDN="%s" privilege="%s" result=%b
   */
  public static final MessageDescriptor.Arg5<Number,Number,CharSequence,CharSequence,Boolean> INFO_CLIENTCONNECTION_AUDIT_HASPRIVILEGE =
          new MessageDescriptor.Arg5<Number,Number,CharSequence,CharSequence,Boolean>(BASE,"INFO_CLIENTCONNECTION_AUDIT_HASPRIVILEGE_593",CORE,INFORMATION,593, getClassLoader());

  /**
   * hasPrivilege determination for connID=%d opID=%d requesterDN="%s" privilegeSet="%s" result=%b
   */
  public static final MessageDescriptor.Arg5<Number,Number,CharSequence,CharSequence,Boolean> INFO_CLIENTCONNECTION_AUDIT_HASPRIVILEGES =
          new MessageDescriptor.Arg5<Number,Number,CharSequence,CharSequence,Boolean>(BASE,"INFO_CLIENTCONNECTION_AUDIT_HASPRIVILEGES_594",CORE,INFORMATION,594, getClassLoader());

  /**
   * You do not have sufficient privileges to use the proxied authorization control
   */
  public static final MessageDescriptor.Arg0 ERR_PROXYAUTH_INSUFFICIENT_PRIVILEGES =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_PROXYAUTH_INSUFFICIENT_PRIVILEGES_595",CORE,MILD_ERROR,595, getClassLoader());

  /**
   * Used to determine whether a server can be started or not and the mode to be used to start it
   */
  public static final MessageDescriptor.Arg0 INFO_DSCORE_DESCRIPTION_CHECK_STARTABILITY =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCORE_DESCRIPTION_CHECK_STARTABILITY_596",CORE,INFORMATION,596, getClassLoader());

  /**
   * Entry %s violates the Directory Server schema configuration because it includes attribute %s without any values
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ENTRY_SCHEMA_ATTR_NO_VALUES =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ENTRY_SCHEMA_ATTR_NO_VALUES_597",CORE,MILD_ERROR,597, getClassLoader());

  /**
   * OpenDS is configured to run as a Windows service and it cannot run in no-detach mode
   */
  public static final MessageDescriptor.Arg0 ERR_DSCORE_ERROR_NODETACH_AND_WINDOW_SERVICE =
          new MessageDescriptor.Arg0(BASE,"FATAL_ERR_DSCORE_ERROR_NODETACH_AND_WINDOW_SERVICE_598",CORE,FATAL_ERROR,598, getClassLoader());

  /**
   * Used by the Windows service code to inform that start-ds is being called from the Windows services after a call to net start
   */
  public static final MessageDescriptor.Arg0 INFO_DSCORE_DESCRIPTION_WINDOWS_NET_START =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCORE_DESCRIPTION_WINDOWS_NET_START_599",CORE,INFORMATION,599, getClassLoader());

  /**
   * Unable to decode an entry because it had an unsupported entry version byte value of %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ENTRY_DECODE_UNRECOGNIZED_VERSION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ENTRY_DECODE_UNRECOGNIZED_VERSION_600",CORE,MILD_ERROR,600, getClassLoader());

  /**
   * Unable to decode an entry because an unexpected exception was caught during processing:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ENTRY_DECODE_EXCEPTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ENTRY_DECODE_EXCEPTION_601",CORE,MILD_ERROR,601, getClassLoader());

  /**
   * The provided search filter "%s" could not be decoded because the NOT filter between positions %d and %d did not contain exactly one filter component
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,Number> ERR_SEARCH_FILTER_NOT_EXACTLY_ONE =
          new MessageDescriptor.Arg3<CharSequence,Number,Number>(BASE,"MILD_ERR_SEARCH_FILTER_NOT_EXACTLY_ONE_602",CORE,MILD_ERROR,602, getClassLoader());

  /**
   * The provided sort key value %s is invalid because it does not start with either '+' (to indicate sorting in ascending order) or '-' (to indicate sorting in descending order)
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SORTKEY_INVALID_ORDER_INDICATOR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SORTKEY_INVALID_ORDER_INDICATOR_603",CORE,MILD_ERROR,603, getClassLoader());

  /**
   * The provided sort key value %s is invalid because it references undefined attribute type %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SORTKEY_UNDEFINED_TYPE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SORTKEY_UNDEFINED_TYPE_604",CORE,MILD_ERROR,604, getClassLoader());

  /**
   * The provided sort key value %s is invalid because attribute type %s does not have a default ordering matching rule and no specific rule was provided
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SORTKEY_NO_ORDERING_RULE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SORTKEY_NO_ORDERING_RULE_605",CORE,MILD_ERROR,605, getClassLoader());

  /**
   * The provided sort key value %s is invalid because it references undefined ordering matching rule %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SORTKEY_UNDEFINED_ORDERING_RULE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_SORTKEY_UNDEFINED_ORDERING_RULE_606",CORE,MILD_ERROR,606, getClassLoader());

  /**
   * The provided sort order string "%s" is invalid because it does not contain any sort keys
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SORTORDER_DECODE_NO_KEYS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_SORTORDER_DECODE_NO_KEYS_607",CORE,MILD_ERROR,607, getClassLoader());

  /**
   * Sort Control Missing
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_SORT_CONTROL_MISSING =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_SORT_CONTROL_MISSING_608",CORE,INFORMATION,608, getClassLoader());

  /**
   * Offset Range Error
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_OFFSET_RANGE_ERROR =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_OFFSET_RANGE_ERROR_609",CORE,INFORMATION,609, getClassLoader());

  /**
   * Virtual List View Error
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_VIRTUAL_LIST_VIEW_ERROR =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_VIRTUAL_LIST_VIEW_ERROR_610",CORE,INFORMATION,610, getClassLoader());

  /**
   * The request control with Object Identifier (OID) "%s" cannot be used due to insufficient access rights
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CONTROL_INSUFFICIENT_ACCESS_RIGHTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CONTROL_INSUFFICIENT_ACCESS_RIGHTS_611",CORE,SEVERE_ERROR,611, getClassLoader());

  /**
   * The connection handler %s is trying to use the listener %s which is already in use by another connection handler
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_HOST_PORT_ALREADY_SPECIFIED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_HOST_PORT_ALREADY_SPECIFIED_612",CORE,SEVERE_ERROR,612, getClassLoader());

  /**
   * The server cannot use the listener %s of connection handler %s because it is already being used by another process or because it does not have the rights to use it
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_HOST_PORT_CANNOT_BE_USED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_HOST_PORT_CANNOT_BE_USED_613",CORE,SEVERE_ERROR,613, getClassLoader());

  /**
   * No enabled connection handler available
   */
  public static final MessageDescriptor.Arg0 ERR_NOT_AVAILABLE_CONNECTION_HANDLERS =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_NOT_AVAILABLE_CONNECTION_HANDLERS_614",CORE,SEVERE_ERROR,614, getClassLoader());

  /**
   * Could not start connection handlers
   */
  public static final MessageDescriptor.Arg0 ERR_ERROR_STARTING_CONNECTION_HANDLERS =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_ERROR_STARTING_CONNECTION_HANDLERS_615",CORE,SEVERE_ERROR,615, getClassLoader());

  /**
   * Unable to process the non-root bind because the server is in lockdown mode
   */
  public static final MessageDescriptor.Arg0 ERR_BIND_REJECTED_LOCKDOWN_MODE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_BIND_REJECTED_LOCKDOWN_MODE_616",CORE,SEVERE_ERROR,616, getClassLoader());

  /**
   * The Directory Server is entering lockdown mode, in which clients will only be allowed to connect via a loopback address, and only root users will be allowed to process operations
   */
  public static final MessageDescriptor.Arg0 WARN_DIRECTORY_SERVER_ENTERING_LOCKDOWN_MODE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_WARN_DIRECTORY_SERVER_ENTERING_LOCKDOWN_MODE_617",CORE,SEVERE_WARNING,617, getClassLoader());

  /**
   * The Directory Server is leaving lockdown mode and will resume normal operation
   */
  public static final MessageDescriptor.Arg0 NOTE_DIRECTORY_SERVER_LEAVING_LOCKDOWN_MODE =
          new MessageDescriptor.Arg0(BASE,"NOTICE_DIRECTORY_SERVER_LEAVING_LOCKDOWN_MODE_618",CORE,NOTICE,618, getClassLoader());

  /**
   * Rejecting the requested operation because the server is in lockdown mode and will only accept requests from root users over loopback connections
   */
  public static final MessageDescriptor.Arg0 NOTE_REJECT_OPERATION_IN_LOCKDOWN_MODE =
          new MessageDescriptor.Arg0(BASE,"NOTICE_REJECT_OPERATION_IN_LOCKDOWN_MODE_619",CORE,NOTICE,619, getClassLoader());

  /**
   * Unable to decode the provided attribute because it used an undefined attribute description token %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_COMPRESSEDSCHEMA_UNRECOGNIZED_AD_TOKEN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_COMPRESSEDSCHEMA_UNRECOGNIZED_AD_TOKEN_620",CORE,SEVERE_ERROR,620, getClassLoader());

  /**
   * Unable to decode the provided object class set because it used an undefined token %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_COMPRESSEDSCHEMA_UNKNOWN_OC_TOKEN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_COMPRESSEDSCHEMA_UNKNOWN_OC_TOKEN_621",CORE,SEVERE_ERROR,621, getClassLoader());

  /**
   * Unable to write the updated compressed schema token data:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_COMPRESSEDSCHEMA_CANNOT_WRITE_UPDATED_DATA =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_COMPRESSEDSCHEMA_CANNOT_WRITE_UPDATED_DATA_622",CORE,SEVERE_ERROR,622, getClassLoader());

  /**
   * Unable to decode the provided entry encode configuration element because it has an invalid length
   */
  public static final MessageDescriptor.Arg0 ERR_ENTRYENCODECFG_INVALID_LENGTH =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_ENTRYENCODECFG_INVALID_LENGTH_623",CORE,SEVERE_ERROR,623, getClassLoader());

  /**
   * No Operation
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_NO_OPERATION =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_NO_OPERATION_624",CORE,INFORMATION,624, getClassLoader());

  /**
   * Unable to create an extensible match search filter using the provided information because it did not contain either an attribute type or a matching rule ID. At least one of these must be provided
   */
  public static final MessageDescriptor.Arg0 ERR_SEARCH_FILTER_CREATE_EXTENSIBLE_MATCH_NO_AT_OR_MR =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_SEARCH_FILTER_CREATE_EXTENSIBLE_MATCH_NO_AT_OR_MR_625",CORE,SEVERE_ERROR,625, getClassLoader());

  /**
   * The provided search filter "%s" could not be decoded because the extensible match component starting at position %d did not contain either an attribute description or a matching rule ID.  At least one of these must be provided
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> ERR_SEARCH_FILTER_EXTENSIBLE_MATCH_NO_AD_OR_MR =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"SEVERE_ERR_SEARCH_FILTER_EXTENSIBLE_MATCH_NO_AD_OR_MR_626",CORE,SEVERE_ERROR,626, getClassLoader());

  /**
   * The provided search filter "%s" could not be decoded because the extensible match component starting at position %d referenced an unknown matching rule %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,CharSequence> ERR_SEARCH_FILTER_EXTENSIBLE_MATCH_NO_SUCH_MR =
          new MessageDescriptor.Arg3<CharSequence,Number,CharSequence>(BASE,"SEVERE_ERR_SEARCH_FILTER_EXTENSIBLE_MATCH_NO_SUCH_MR_627",CORE,SEVERE_ERROR,627, getClassLoader());

  /**
   * Rejecting a bind request for user %s because either the entire server or the user's backend has a writability mode of 'disabled' and password policy state updates would not be allowed
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_BIND_OPERATION_WRITABILITY_DISABLED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_BIND_OPERATION_WRITABILITY_DISABLED_628",CORE,MILD_ERROR,628, getClassLoader());

  /**
   * The provided new password was found in the password history for the user
   */
  public static final MessageDescriptor.Arg0 ERR_MODIFY_PW_IN_HISTORY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_MODIFY_PW_IN_HISTORY_629",CORE,MILD_ERROR,629, getClassLoader());

  /**
   * There are multiple user-specific idle time limit values contained in user entry %s.  The default server idle time limit will be used
   */
  public static final MessageDescriptor.Arg1<CharSequence> WARN_BIND_MULTIPLE_USER_IDLE_TIME_LIMITS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_WARN_BIND_MULTIPLE_USER_IDLE_TIME_LIMITS_630",CORE,SEVERE_WARNING,630, getClassLoader());

  /**
   * The user-specific idle time limit value %s contained in user entry %s could not be parsed as an integer.  The default server idle time limit will be used
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_BIND_CANNOT_PROCESS_USER_IDLE_TIME_LIMIT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_BIND_CANNOT_PROCESS_USER_IDLE_TIME_LIMIT_631",CORE,SEVERE_WARNING,631, getClassLoader());

  /**
   * This connection has been terminated because it has remained idle for too long
   */
  public static final MessageDescriptor.Arg0 INFO_IDLETIME_LIMIT_EXCEEDED =
          new MessageDescriptor.Arg0(BASE,"INFO_IDLETIME_LIMIT_EXCEEDED_632",CORE,INFORMATION,632, getClassLoader());

  /**
   * The password policy configuration entry "%s" is invalid because if a maximum password age is configured, then the password expiration warning interval must be shorter than the maximum password age
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PWPOLICY_WARNING_INTERVAL_LARGER_THAN_MAX_AGE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PWPOLICY_WARNING_INTERVAL_LARGER_THAN_MAX_AGE_633",CORE,SEVERE_ERROR,633, getClassLoader());

  /**
   * The password policy configuration entry "%s" is invalid because if both a minimum password age and a maximum password age are configured, then the sum of the minimum password age and the password expiration warning interval must be shorter than the maximum password age
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PWPOLICY_MIN_AGE_PLUS_WARNING_GREATER_THAN_MAX_AGE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PWPOLICY_MIN_AGE_PLUS_WARNING_GREATER_THAN_MAX_AGE_634",CORE,SEVERE_ERROR,634, getClassLoader());

  /**
   * Unable to register workflow %s with the Directory Server because another workflow with the same workflow ID is already registered
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_REGISTER_WORKFLOW_ALREADY_EXISTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_REGISTER_WORKFLOW_ALREADY_EXISTS_635",CORE,SEVERE_ERROR,635, getClassLoader());

  /**
   * Unable to register workflow node %s with the network group %s because another workflow node with the same workflow node ID is already registered
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_REGISTER_WORKFLOW_NODE_ALREADY_EXISTS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_REGISTER_WORKFLOW_NODE_ALREADY_EXISTS_636",CORE,SEVERE_ERROR,636, getClassLoader());

  /**
   * Unable to register network group %s with the Directory Server because another network group with the same network group ID is already registered
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_REGISTER_NETWORK_GROUP_ALREADY_EXISTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_REGISTER_NETWORK_GROUP_ALREADY_EXISTS_637",CORE,SEVERE_ERROR,637, getClassLoader());

  /**
   * An error occurred while attempting to disconnect client connection %d:  %s
   */
  public static final MessageDescriptor.Arg2<Number,CharSequence> ERR_IDLETIME_DISCONNECT_ERROR =
          new MessageDescriptor.Arg2<Number,CharSequence>(BASE,"MILD_ERR_IDLETIME_DISCONNECT_ERROR_638",CORE,MILD_ERROR,638, getClassLoader());

  /**
   * An unexpected error occurred in the idle time limit thread:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_IDLETIME_UNEXPECTED_ERROR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_IDLETIME_UNEXPECTED_ERROR_639",CORE,SEVERE_ERROR,639, getClassLoader());

  /**
   * The Directory Server is currently running.  Environment configuration changes are not allowed with the server running
   */
  public static final MessageDescriptor.Arg0 ERR_DIRCFG_SERVER_ALREADY_RUNNING =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_DIRCFG_SERVER_ALREADY_RUNNING_640",CORE,SEVERE_ERROR,640, getClassLoader());

  /**
   * The specified server root directory '%s' is invalid.  The specified path must exist and must be a directory
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DIRCFG_INVALID_SERVER_ROOT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DIRCFG_INVALID_SERVER_ROOT_641",CORE,SEVERE_ERROR,641, getClassLoader());

  /**
   * The specified config file path '%s' is invalid.  The specified path must exist and must be a file
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DIRCFG_INVALID_CONFIG_FILE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DIRCFG_INVALID_CONFIG_FILE_642",CORE,SEVERE_ERROR,642, getClassLoader());

  /**
   * The specified config handler class '%s' is invalid.  The specified class must be a subclass of the org.opends.server.api.ConfigHandler superclass
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DIRCFG_INVALID_CONFIG_CLASS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DIRCFG_INVALID_CONFIG_CLASS_643",CORE,SEVERE_ERROR,643, getClassLoader());

  /**
   * The specified schema configuration directory '%s' is invalid.  The specified path must exist and must be a directory
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DIRCFG_INVALID_SCHEMA_DIRECTORY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DIRCFG_INVALID_SCHEMA_DIRECTORY_644",CORE,SEVERE_ERROR,644, getClassLoader());

  /**
   * The specified lock directory '%s' is invalid.  The specified path must exist and must be a directory
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DIRCFG_INVALID_LOCK_DIRECTORY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DIRCFG_INVALID_LOCK_DIRECTORY_645",CORE,SEVERE_ERROR,645, getClassLoader());

  /**
   * The specified lock table concurrency level %d is invalid.  It must be an integer value greater than zero
   */
  public static final MessageDescriptor.Arg1<Number> ERR_DIRCFG_INVALID_CONCURRENCY_LEVEL =
          new MessageDescriptor.Arg1<Number>(BASE,"SEVERE_ERR_DIRCFG_INVALID_CONCURRENCY_LEVEL_646",CORE,SEVERE_ERROR,646, getClassLoader());

  /**
   * The specified initial lock table size %d is invalid.  It must be an integer value greater than zero
   */
  public static final MessageDescriptor.Arg1<Number> ERR_DIRCFG_INVALID_LOCK_TABLE_SIZE =
          new MessageDescriptor.Arg1<Number>(BASE,"SEVERE_ERR_DIRCFG_INVALID_LOCK_TABLE_SIZE_647",CORE,SEVERE_ERROR,647, getClassLoader());

  /**
   * The Directory Server is currently running.  The environment configuration can not be altered while the server is online
   */
  public static final MessageDescriptor.Arg0 ERR_CANNOT_SET_ENVIRONMENT_CONFIG_WHILE_RUNNING =
          new MessageDescriptor.Arg0(BASE,"FATAL_ERR_CANNOT_SET_ENVIRONMENT_CONFIG_WHILE_RUNNING_648",CORE,FATAL_ERROR,648, getClassLoader());

  /**
   * An error occurred while attempting to initialize a SSL context for server to server communication:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CRYPTOMGR_SSL_CONTEXT_CANNOT_INITIALIZE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CRYPTOMGR_SSL_CONTEXT_CANNOT_INITIALIZE_649",CORE,SEVERE_ERROR,649, getClassLoader());

  /**
   * The ADS trust store backend %s is not enabled
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CRYPTOMGR_ADS_TRUST_STORE_BACKEND_NOT_ENABLED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CRYPTOMGR_ADS_TRUST_STORE_BACKEND_NOT_ENABLED_650",CORE,SEVERE_ERROR,650, getClassLoader());

  /**
   * The backend %s is not a trust store backend
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CRYPTOMGR_ADS_TRUST_STORE_BACKEND_WRONG_CLASS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CRYPTOMGR_ADS_TRUST_STORE_BACKEND_WRONG_CLASS_651",CORE,SEVERE_ERROR,651, getClassLoader());

  /**
   * Attempt to start using the configuration that was in place at the last successful startup (if it is available) rather than using the current active configuration
   */
  public static final MessageDescriptor.Arg0 INFO_DSCORE_DESCRIPTION_LASTKNOWNGOODCFG =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCORE_DESCRIPTION_LASTKNOWNGOODCFG_652",CORE,INFORMATION,652, getClassLoader());

  /**
   * Error while searching base %s to synchronize the trust store: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_TRUSTSTORESYNC_ADMIN_SUFFIX_SEARCH_FAILED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_TRUSTSTORESYNC_ADMIN_SUFFIX_SEARCH_FAILED_653",CORE,INFORMATION,653, getClassLoader());

  /**
   * An error occurred in the trust store synchronization thread: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_TRUSTSTORESYNC_EXCEPTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_TRUSTSTORESYNC_EXCEPTION_654",CORE,SEVERE_ERROR,654, getClassLoader());

  /**
   * Error while trying to add entry %s to the trust store: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_TRUSTSTORESYNC_ADD_FAILED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_TRUSTSTORESYNC_ADD_FAILED_655",CORE,INFORMATION,655, getClassLoader());

  /**
   * Error while trying to delete entry %s from the trust store: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_TRUSTSTORESYNC_DELETE_FAILED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_TRUSTSTORESYNC_DELETE_FAILED_656",CORE,INFORMATION,656, getClassLoader());

  /**
   * The password storage scheme defined in configuration entry %s does not support the auth password syntax, which is used by password attribute %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPOLICY_SCHEME_DOESNT_SUPPORT_AUTH =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPOLICY_SCHEME_DOESNT_SUPPORT_AUTH_657",CORE,SEVERE_ERROR,657, getClassLoader());

  /**
   * Password policy configuration entry %s references deprecated password storage scheme DN %s which is not available for use in the server
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPOLICY_NO_SUCH_DEPRECATED_SCHEME =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPOLICY_NO_SUCH_DEPRECATED_SCHEME_658",CORE,SEVERE_ERROR,658, getClassLoader());

  /**
   * Password policy configuration entry %s references deprecated password storage scheme DN %s which does not support the auth password syntax
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PWPOLICY_DEPRECATED_SCHEME_NOT_AUTH =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PWPOLICY_DEPRECATED_SCHEME_NOT_AUTH_659",CORE,SEVERE_ERROR,659, getClassLoader());

  /**
   * The search filter "%s" used by group implementation %s is not indexed in backend %s.  Backend initialization for this group implementation might take a very long time to complete
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> WARN_GROUP_FILTER_NOT_INDEXED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_WARN_GROUP_FILTER_NOT_INDEXED_660",CORE,SEVERE_WARNING,660, getClassLoader());

  /**
   * CryptoManager cannot get the requested digest %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CRYPTOMGR_CANNOT_GET_REQUESTED_DIGEST =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CRYPTOMGR_CANNOT_GET_REQUESTED_DIGEST_661",CORE,SEVERE_ERROR,661, getClassLoader());

  /**
   * CryptoManager cannot get the requested MAC engine %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CRYPTOMGR_CANNOT_GET_REQUESTED_MAC_ENGINE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CRYPTOMGR_CANNOT_GET_REQUESTED_MAC_ENGINE_662",CORE,SEVERE_ERROR,662, getClassLoader());

  /**
   * CryptoManager cannot get the requested encryption cipher %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CRYPTOMGR_CANNOT_GET_REQUESTED_ENCRYPTION_CIPHER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CRYPTOMGR_CANNOT_GET_REQUESTED_ENCRYPTION_CIPHER_663",CORE,SEVERE_ERROR,663, getClassLoader());

  /**
   * CryptoManager cannot get the preferred key wrapping cipher:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CRYPTOMGR_CANNOT_GET_PREFERRED_KEY_WRAPPING_CIPHER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CRYPTOMGR_CANNOT_GET_PREFERRED_KEY_WRAPPING_CIPHER_664",CORE,SEVERE_ERROR,664, getClassLoader());

  /**
   * CryptoManager failed to add entry "%s" to initiate instance key generation
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CRYPTOMGR_FAILED_TO_INITIATE_INSTANCE_KEY_GENERATION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CRYPTOMGR_FAILED_TO_INITIATE_INSTANCE_KEY_GENERATION_665",CORE,SEVERE_ERROR,665, getClassLoader());

  /**
   * CryptoManager failed to retrieve entry "%s" (the instance-key-pair public-key-certificate):  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CRYPTOMGR_FAILED_TO_RETRIEVE_INSTANCE_CERTIFICATE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CRYPTOMGR_FAILED_TO_RETRIEVE_INSTANCE_CERTIFICATE_666",CORE,SEVERE_ERROR,666, getClassLoader());

  /**
   * CryptoManager failed to compute an instance key identifier:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CRYPTOMGR_FAILED_TO_COMPUTE_INSTANCE_KEY_IDENTIFIER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CRYPTOMGR_FAILED_TO_COMPUTE_INSTANCE_KEY_IDENTIFIER_667",CORE,SEVERE_ERROR,667, getClassLoader());

  /**
   * Failed to add entry "%s"
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CRYPTOMGR_FAILED_TO_ADD_INSTANCE_KEY_ENTRY_TO_ADS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CRYPTOMGR_FAILED_TO_ADD_INSTANCE_KEY_ENTRY_TO_ADS_668",CORE,SEVERE_ERROR,668, getClassLoader());

  /**
   * CryptoManager failed to publish the instance-key-pair public-key-certificate entry in ADS:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CRYPTOMGR_FAILED_TO_PUBLISH_INSTANCE_KEY_ENTRY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CRYPTOMGR_FAILED_TO_PUBLISH_INSTANCE_KEY_ENTRY_669",CORE,SEVERE_ERROR,669, getClassLoader());

  /**
   * CryptoManager failed to retrieve the collection of instance-key-pair public-key-certificates from ADS container "%s":  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CRYPTOMGR_FAILED_TO_RETRIEVE_ADS_TRUSTSTORE_CERTS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CRYPTOMGR_FAILED_TO_RETRIEVE_ADS_TRUSTSTORE_CERTS_670",CORE,SEVERE_ERROR,670, getClassLoader());

  /**
   * CryptoManager failed to encode symmetric key attribute value:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CRYPTOMGR_FAILED_TO_ENCODE_SYMMETRIC_KEY_ATTRIBUTE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CRYPTOMGR_FAILED_TO_ENCODE_SYMMETRIC_KEY_ATTRIBUTE_671",CORE,SEVERE_ERROR,671, getClassLoader());

  /**
   * CryptoManager symmetric key attribute value "%s" syntax is invalid: incorrect number of fields
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CRYPTOMGR_DECODE_SYMMETRIC_KEY_ATTRIBUTE_FIELD_COUNT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CRYPTOMGR_DECODE_SYMMETRIC_KEY_ATTRIBUTE_FIELD_COUNT_672",CORE,SEVERE_ERROR,672, getClassLoader());

  /**
   * CryptoManager symmetric key attribute value "%s" syntax is invalid. Parsing failed in field "%s" at offset %d
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> ERR_CRYPTOMGR_DECODE_SYMMETRIC_KEY_ATTRIBUTE_SYNTAX =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"SEVERE_ERR_CRYPTOMGR_DECODE_SYMMETRIC_KEY_ATTRIBUTE_SYNTAX_673",CORE,SEVERE_ERROR,673, getClassLoader());

  /**
   * CryptoManager failed to retrieve the instance-key-pair private-key: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CRYPTOMGR_DECODE_SYMMETRIC_KEY_ATTRIBUTE_NO_PRIVATE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CRYPTOMGR_DECODE_SYMMETRIC_KEY_ATTRIBUTE_NO_PRIVATE_674",CORE,SEVERE_ERROR,674, getClassLoader());

  /**
   * CryptoManager failed to decipher the wrapped secret-key value:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CRYPTOMGR_DECODE_SYMMETRIC_KEY_ATTRIBUTE_DECIPHER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CRYPTOMGR_DECODE_SYMMETRIC_KEY_ATTRIBUTE_DECIPHER_675",CORE,SEVERE_ERROR,675, getClassLoader());

  /**
   * CryptoManager cannot find the public-key-certificate (identifier "%s") requested for symmetric key re-encoding
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CRYPTOMGR_REWRAP_SYMMETRIC_KEY_ATTRIBUTE_NO_WRAPPER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CRYPTOMGR_REWRAP_SYMMETRIC_KEY_ATTRIBUTE_NO_WRAPPER_676",CORE,MILD_ERROR,676, getClassLoader());

  /**
   * CryptoManager failed to decode the key entry identifier "%s":  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CRYPTOMGR_INVALID_KEY_IDENTIFIER_SYNTAX =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CRYPTOMGR_INVALID_KEY_IDENTIFIER_SYNTAX_677",CORE,MILD_ERROR,677, getClassLoader());

  /**
   * CrytpoManager passed invalid MAC algorithm "%s":  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CRYPTOMGR_GET_MAC_ENGINE_INVALID_MAC_ALGORITHM =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CRYPTOMGR_GET_MAC_ENGINE_INVALID_MAC_ALGORITHM_678",CORE,SEVERE_ERROR,678, getClassLoader());

  /**
   * CryptoManager failed to initialize MAC engine:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CRYPTOMGR_GET_MAC_ENGINE_CANNOT_INITIALIZE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CRYPTOMGR_GET_MAC_ENGINE_CANNOT_INITIALIZE_679",CORE,SEVERE_ERROR,679, getClassLoader());

  /**
   * CryptoManager passed invalid Cipher transformation "%s":  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CRYPTOMGR_GET_CIPHER_INVALID_CIPHER_TRANSFORMATION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CRYPTOMGR_GET_CIPHER_INVALID_CIPHER_TRANSFORMATION_680",CORE,SEVERE_ERROR,680, getClassLoader());

  /**
   * CryptoManager cannot initialize Cipher:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CRYPTOMGR_GET_CIPHER_CANNOT_INITIALIZE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CRYPTOMGR_GET_CIPHER_CANNOT_INITIALIZE_681",CORE,SEVERE_ERROR,681, getClassLoader());

  /**
   * CryptoManager failed to write the stream prologue:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CRYPTOMGR_GET_CIPHER_STREAM_PROLOGUE_WRITE_ERROR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CRYPTOMGR_GET_CIPHER_STREAM_PROLOGUE_WRITE_ERROR_682",CORE,SEVERE_ERROR,682, getClassLoader());

  /**
   * CryptoManager failed to decrypt the supplied data because it could not read the symmetric key identifier in the data prologue:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CRYPTOMGR_DECRYPT_FAILED_TO_READ_KEY_IDENTIFIER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CRYPTOMGR_DECRYPT_FAILED_TO_READ_KEY_IDENTIFIER_683",CORE,MILD_ERROR,683, getClassLoader());

  /**
   * CryptoManager failed to decrypt the supplied data because the symmetric key identifier in the data prologue does not match any known key entries
   */
  public static final MessageDescriptor.Arg0 ERR_CRYPTOMGR_DECRYPT_UNKNOWN_KEY_IDENTIFIER =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CRYPTOMGR_DECRYPT_UNKNOWN_KEY_IDENTIFIER_684",CORE,MILD_ERROR,684, getClassLoader());

  /**
   * CryptoManager failed to decrypt the supplied data because it could not read the cipher initialization vector in the data prologue
   */
  public static final MessageDescriptor.Arg0 ERR_CRYPTOMGR_DECRYPT_FAILED_TO_READ_IV =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CRYPTOMGR_DECRYPT_FAILED_TO_READ_IV_685",CORE,MILD_ERROR,685, getClassLoader());

  /**
   * CryptoManager failed to decrypt the supplied data because there was an error reading from the input stream:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CRYPTOMGR_DECRYPT_CIPHER_INPUT_STREAM_ERROR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CRYPTOMGR_DECRYPT_CIPHER_INPUT_STREAM_ERROR_686",CORE,MILD_ERROR,686, getClassLoader());

  /**
   * CryptoManager failed to import the symmetric key entry "%s" because it could not obtain a symmetric key attribute value that can be decoded by this instance
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CRYPTOMGR_IMPORT_KEY_ENTRY_FAILED_TO_DECODE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CRYPTOMGR_IMPORT_KEY_ENTRY_FAILED_TO_DECODE_687",CORE,SEVERE_ERROR,687, getClassLoader());

  /**
   * CryptoManager detected a field mismatch between the key entry to be imported and an entry in the key cache that share the key identifier "%s"
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CRYPTOMGR_IMPORT_KEY_ENTRY_FIELD_MISMATCH =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CRYPTOMGR_IMPORT_KEY_ENTRY_FIELD_MISMATCH_688",CORE,SEVERE_ERROR,688, getClassLoader());

  /**
   * CryptoManager failed to import the symmetric key entry "%s":  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CRYPTOMGR_IMPORT_KEY_ENTRY_FAILED_OTHER =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CRYPTOMGR_IMPORT_KEY_ENTRY_FAILED_OTHER_689",CORE,SEVERE_ERROR,689, getClassLoader());

  /**
   * CryptoManager failed to import the symmetric key entry "%s" because it could not add a symmetric key attribute value that can be decoded by this instance
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CRYPTOMGR_IMPORT_KEY_ENTRY_FAILED_TO_ADD_KEY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CRYPTOMGR_IMPORT_KEY_ENTRY_FAILED_TO_ADD_KEY_690",CORE,SEVERE_ERROR,690, getClassLoader());

  /**
   * CryptoManager failed to instantiate a KeyGenerator for algorithm "%s":  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CRYPTOMGR_INVALID_SYMMETRIC_KEY_ALGORITHM =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_CRYPTOMGR_INVALID_SYMMETRIC_KEY_ALGORITHM_691",CORE,MILD_ERROR,691, getClassLoader());

  /**
   * CryptoManager failed to add locally produced symmetric key entry "%s":  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CRYPTOMGR_SYMMETRIC_KEY_ENTRY_ADD_FAILED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CRYPTOMGR_SYMMETRIC_KEY_ENTRY_ADD_FAILED_692",CORE,SEVERE_ERROR,692, getClassLoader());

  /**
   * CryptoManager cipher transformation specification "%s" is invalid: it must be of the form "algorithm/mode/padding"
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CRYPTOMGR_FULL_CIPHER_TRANSFORMATION_REQUIRED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CRYPTOMGR_FULL_CIPHER_TRANSFORMATION_REQUIRED_693",CORE,SEVERE_ERROR,693, getClassLoader());

  /**
   * CryptoManager cipher transformation specification "%s" is invalid: it must be of the form "algorithm/mode/padding"
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CRYPTOMGR_FULL_KEY_WRAPPING_TRANSFORMATION_REQUIRED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CRYPTOMGR_FULL_KEY_WRAPPING_TRANSFORMATION_REQUIRED_694",CORE,SEVERE_ERROR,694, getClassLoader());

  /**
   * CryptoManager failed to decrypt the supplied data because it could not read the version number in the data prologue:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CRYPTOMGR_DECRYPT_FAILED_TO_READ_PROLOGUE_VERSION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CRYPTOMGR_DECRYPT_FAILED_TO_READ_PROLOGUE_VERSION_695",CORE,MILD_ERROR,695, getClassLoader());

  /**
   * CryptoManager failed to decrypt the supplied data because the version "%d" in the data prologue is unknown
   */
  public static final MessageDescriptor.Arg1<Number> ERR_CRYPTOMGR_DECRYPT_UNKNOWN_PROLOGUE_VERSION =
          new MessageDescriptor.Arg1<Number>(BASE,"MILD_ERR_CRYPTOMGR_DECRYPT_UNKNOWN_PROLOGUE_VERSION_696",CORE,MILD_ERROR,696, getClassLoader());

  /**
   * The provided entry %s cannot be added because its suffix is not defined as one of the suffixes within the Directory Server
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ADD_ENTRY_UNKNOWN_SUFFIX =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ADD_ENTRY_UNKNOWN_SUFFIX_697",CORE,MILD_ERROR,697, getClassLoader());

  /**
   * %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_VERSION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_VERSION_698",CORE,NOTICE,698, getClassLoader());

  /**
   * Build ID:                 %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_BUILD_ID =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_BUILD_ID_699",CORE,NOTICE,699, getClassLoader());

  /**
   * Start TLS extended operations cannot be canceled
   */
  public static final MessageDescriptor.Arg0 ERR_CANNOT_CANCEL_START_TLS =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CANNOT_CANCEL_START_TLS_700",CORE,MILD_ERROR,700, getClassLoader());

  /**
   * Cancel extended operations can not be canceled
   */
  public static final MessageDescriptor.Arg0 ERR_CANNOT_CANCEL_CANCEL =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CANNOT_CANCEL_CANCEL_701",CORE,MILD_ERROR,701, getClassLoader());

  /**
   * The modify DN operation for entry %s cannot be performed because the new superior entry %s is equal to or a subordinate of the entry to be moved
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_MODDN_NEW_SUPERIOR_IN_SUBTREE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_MODDN_NEW_SUPERIOR_IN_SUBTREE_702",CORE,MILD_ERROR,702, getClassLoader());

  /**
   * Unable to register workflow element %s with the Directory Server because another workflow element with the same ID is already registered
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_REGISTER_WORKFLOW_ELEMENT_ALREADY_EXISTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_REGISTER_WORKFLOW_ELEMENT_ALREADY_EXISTS_703",CORE,SEVERE_ERROR,703, getClassLoader());

  /**
   * Unable to process operation because the network group has already reached its maximum number of simultaneous connections
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_MAX_CONNECTIONS_LIMIT_EXCEEDED =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_MAX_CONNECTIONS_LIMIT_EXCEEDED_704",CORE,INFORMATION,704, getClassLoader());

  /**
   * Unable to process operation because the network group has already reached its maximum number of simultaneous connections from the same client
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_MAX_CONNECTIONS_FROM_SAME_IP_LIMIT_EXCEEDED =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_MAX_CONNECTIONS_FROM_SAME_IP_LIMIT_EXCEEDED_705",CORE,INFORMATION,705, getClassLoader());

  /**
   * Unable to process operation because the network group has already reached its maximum number of operations on this connection
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_MAX_OPERATIONS_PER_CONNECTION_LIMIT_EXCEEDED =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_MAX_OPERATIONS_PER_CONNECTION_LIMIT_EXCEEDED_706",CORE,INFORMATION,706, getClassLoader());

  /**
   * Unable to process operation because the network group has already reached its maximum number of concurrent operations on this connection
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_MAX_CONCURRENT_OPERATIONS_PER_CONNECTION_LIMIT_EXCEEDED =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_MAX_CONCURRENT_OPERATIONS_PER_CONNECTION_LIMIT_EXCEEDED_707",CORE,INFORMATION,707, getClassLoader());

  /**
   * Connection ConnID=%d moved from network group %s to %s
   */
  public static final MessageDescriptor.Arg3<Number,CharSequence,CharSequence> INFO_CHANGE_NETWORK_GROUP =
          new MessageDescriptor.Arg3<Number,CharSequence,CharSequence>(BASE,"INFO_CHANGE_NETWORK_GROUP_708",CORE,INFORMATION,708, getClassLoader());

  /**
   * Unable to process operation because the search substring length is less than the network group minimum search substring length
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_MIN_SEARCH_SUBSTRING_LENGTH_LIMIT_EXCEEDED =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_MIN_SEARCH_SUBSTRING_LENGTH_LIMIT_EXCEEDED_709",CORE,INFORMATION,709, getClassLoader());

  /**
   * Unable to process operation because this type of operation is not allowed in this network group
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_OPERATION_NOT_ALLOWED =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_OPERATION_NOT_ALLOWED_710",CORE,INFORMATION,710, getClassLoader());

  /**
   * Unable to process operation because this attribute is not allowed in this network group
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_ATTRIBUTE_NOT_ALLOWED =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_ATTRIBUTE_NOT_ALLOWED_711",CORE,INFORMATION,711, getClassLoader());

  /**
   * Unable to process operation because this search scope is not allowed in this network group
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_SEARCH_SCOPE_NOT_ALLOWED =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_SEARCH_SCOPE_NOT_ALLOWED_712",CORE,INFORMATION,712, getClassLoader());

  /**
   * Unable to process operation because this subtree is not allowed in this network group
   */
  public static final MessageDescriptor.Arg0 INFO_ERROR_SUBTREE_NOT_ALLOWED =
          new MessageDescriptor.Arg0(BASE,"INFO_ERROR_SUBTREE_NOT_ALLOWED_713",CORE,INFORMATION,713, getClassLoader());

  /**
   * The workflow %s cannot process the operation because no root workflow element has been registered with the workflow
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ROOT_WORKFLOW_ELEMENT_NOT_DEFINED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_ROOT_WORKFLOW_ELEMENT_NOT_DEFINED_714",CORE,SEVERE_ERROR,714, getClassLoader());

  /**
   * Entry %s can not be added because BER encoding of %s attribute is not supported
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ADD_ATTR_IS_INVALID_OPTION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_ADD_ATTR_IS_INVALID_OPTION_715",CORE,MILD_ERROR,715, getClassLoader());

  /**
   * Unable to register workflow node "%s" with the network group "%s" because another workflow node "%s" with the same base DN "%s" is already registered
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> ERR_REGISTER_WORKFLOW_BASE_DN_ALREADY_EXISTS =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_REGISTER_WORKFLOW_BASE_DN_ALREADY_EXISTS_716",CORE,SEVERE_ERROR,716, getClassLoader());

  /**
   * Unable to remove the workflow "%s" because the workflow is still in use (there are still %d reference(s) to the workflow)
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> INFO_ERR_WORKFLOW_IN_USE =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"INFO_ERR_WORKFLOW_IN_USE_717",CORE,INFORMATION,717, getClassLoader());

  /**
   * Unable to register the workflow "%s" with the network group %s because the workflow does not exist
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_ERR_WORKFLOW_DOES_NOT_EXIST =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_ERR_WORKFLOW_DOES_NOT_EXIST_718",CORE,INFORMATION,718, getClassLoader());

  /**
   * Unable to register the workflow because the base DN '%s' is already registered with the network group '%s'
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_WORKFLOW_BASE_DN_DUPLICATED_IN_NG =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_WORKFLOW_BASE_DN_DUPLICATED_IN_NG_719",CORE,SEVERE_ERROR,719, getClassLoader());

  /**
   * No worker queue thread pool size specified: sizing automatically to use %d threads
   */
  public static final MessageDescriptor.Arg1<Number> INFO_ERGONOMIC_SIZING_OF_WORKER_THREAD_POOL =
          new MessageDescriptor.Arg1<Number>(BASE,"INFO_ERGONOMIC_SIZING_OF_WORKER_THREAD_POOL_720",CORE,INFORMATION,720, getClassLoader());

  /**
   * The CryptoManager entry "%s" (the instance-key-pair public-key-certificate) does not contain a public-key certificate
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CRYPTOMGR_FAILED_INSTANCE_CERTIFICATE_NULL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CRYPTOMGR_FAILED_INSTANCE_CERTIFICATE_NULL_721",CORE,SEVERE_ERROR,721, getClassLoader());

  /**
   * Maximum time (in seconds) to wait before the command returns (the server continues the startup process, regardless). A value of '0' indicates an infinite timeout, which means that the command returns only when the server startup is completed. The default value is 60 seconds. This option cannot be used with the -N, --nodetach option
   */
  public static final MessageDescriptor.Arg0 INFO_DSCORE_DESCRIPTION_TIMEOUT =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCORE_DESCRIPTION_TIMEOUT_722",CORE,INFORMATION,722, getClassLoader());

  /**
   * In no-detach mode, the 'timeout' option cannot be used
   */
  public static final MessageDescriptor.Arg0 ERR_DSCORE_ERROR_NODETACH_TIMEOUT =
          new MessageDescriptor.Arg0(BASE,"FATAL_ERR_DSCORE_ERROR_NODETACH_TIMEOUT_723",CORE,FATAL_ERROR,723, getClassLoader());

  /**
   * The search filter "%s" used by subentry manager is not indexed in backend %s.  Backend initialization for subentry manager processing might take a very long time to complete
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_SUBENTRY_FILTER_NOT_INDEXED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_SUBENTRY_FILTER_NOT_INDEXED_724",CORE,SEVERE_WARNING,724, getClassLoader());

  /**
   * Undefined
   */
  public static final MessageDescriptor.Arg0 INFO_RESULT_UNDEFINED =
          new MessageDescriptor.Arg0(BASE,"INFO_RESULT_UNDEFINED_725",CORE,INFORMATION,725, getClassLoader());

  /**
   * The entry %s does not contain the pwdPolicy objectclass, which is required for Directory Server password policy
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PWPOLICY_NO_PWDPOLICY_OC =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PWPOLICY_NO_PWDPOLICY_OC_726",CORE,SEVERE_ERROR,726, getClassLoader());

  /**
   * Unable to decode the provided string "%s" as a relative distinguished name because it does not contain a value for attribute type %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_RDN_MISSING_ATTRIBUTE_VALUE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_RDN_MISSING_ATTRIBUTE_VALUE_727",CORE,MILD_ERROR,727, getClassLoader());

  /**
   * CryptoManager failed to initialize because the specified cipher key length "%d" is beyond the allowed cryptography strength "%d" in jurisdiction policy files
   */
  public static final MessageDescriptor.Arg2<Number,Number> ERR_CRYPTOMGR_INVALID_SYMMETRIC_KEY_LENGTH =
          new MessageDescriptor.Arg2<Number,Number>(BASE,"MILD_ERR_CRYPTOMGR_INVALID_SYMMETRIC_KEY_LENGTH_728",CORE,MILD_ERROR,728, getClassLoader());

  /**
   * Failed to update free disk space for directory %s: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_DISK_SPACE_MONITOR_UPDATE_FAILED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_DISK_SPACE_MONITOR_UPDATE_FAILED_729",CORE,MILD_ERROR,729, getClassLoader());

  /**
   * The directory server is not accepting  a new persistent search request because the server has already reached its limit
   */
  public static final MessageDescriptor.Arg0 ERR_MAX_PSEARCH_LIMIT_EXCEEDED =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_MAX_PSEARCH_LIMIT_EXCEEDED_730",CORE,MILD_ERROR,730, getClassLoader());

  /**
   * Unable to process operation because the network group has already reached its maximum throughput of %d operations each %d ms
   */
  public static final MessageDescriptor.Arg2<Number,Number> INFO_ERROR_MAX_THROUGHPUT_EXCEEDED =
          new MessageDescriptor.Arg2<Number,Number>(BASE,"INFO_ERROR_MAX_THROUGHPUT_EXCEEDED_735",CORE,INFORMATION,735, getClassLoader());

  /**
   * The value "%d" is not a valid value for the maximum number of operations per interval (must be positive)
   */
  public static final MessageDescriptor.Arg1<Number> ERR_MAX_OPS_PER_INTERVAL =
          new MessageDescriptor.Arg1<Number>(BASE,"SEVERE_ERR_MAX_OPS_PER_INTERVAL_738",CORE,SEVERE_ERROR,738, getClassLoader());

  /**
   * This operation involves LDAP subentries which you do not have sufficient privileges to administer
   */
  public static final MessageDescriptor.Arg0 ERR_SUBENTRY_WRITE_INSUFFICIENT_PRIVILEGES =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_SUBENTRY_WRITE_INSUFFICIENT_PRIVILEGES_739",CORE,MILD_ERROR,739, getClassLoader());

  /**
   * The request to process this operation has been rejected because request handler thread was interrupted while attempting to put the operation on the work queue
   */
  public static final MessageDescriptor.Arg0 WARN_OP_REJECTED_BY_QUEUE_INTERRUPT =
          new MessageDescriptor.Arg0(BASE,"SEVERE_WARN_OP_REJECTED_BY_QUEUE_INTERRUPT_740",CORE,SEVERE_WARNING,740, getClassLoader());


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
            Class<?> c = Class.forName("org.opends.messages.CoreMessages");

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
      cl = CoreMessages.class.getClassLoader();
    }
    return cl;
  }
}
