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
public final class PluginMessages {

  /** Base property for resource bundle containing messages */
  private static final String BASE = "messages/plugin";

  private static ClassLoader webstartClassLoader;

  // Prevent instantiation.
  private PluginMessages() {
    // Do nothing.
  }

  /**
   * Unable to initialize an instance of the plugin defined in class %s because the provided configuration entry was null
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PLUGIN_NULL_CONFIG_ENTRY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PLUGIN_NULL_CONFIG_ENTRY_1",PLUGIN,SEVERE_ERROR,1, getClassLoader());

  /**
   * Specifies an optional encoded password that will be required in order to be able to stop the Directory Server.  If this is not provided, then no password will be required (although it will still be necessary to authenticate to the server in order to be able to add necessary task entry).  Changes to this password will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_PLUGIN_DESCRIPTION_SHUTDOWN_PASSWORD =
          new MessageDescriptor.Arg0(BASE,"INFO_PLUGIN_DESCRIPTION_SHUTDOWN_PASSWORD_2",PLUGIN,INFORMATION,2, getClassLoader());

  /**
   * The LDAP attribute description list plugin instance defined in configuration entry %s does not list any plugin types.  This plugin must be configured to operate as a pre-parse search plugin
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PLUGIN_ADLIST_NO_PLUGIN_TYPES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PLUGIN_ADLIST_NO_PLUGIN_TYPES_3",PLUGIN,SEVERE_ERROR,3, getClassLoader());

  /**
   * The LDAP attribute description list plugin instance defined in configuration entry %s lists an invalid plugin type %s.  This plugin can only be used as a pre-parse search plugin
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PLUGIN_ADLIST_INVALID_PLUGIN_TYPE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PLUGIN_ADLIST_INVALID_PLUGIN_TYPE_4",PLUGIN,SEVERE_ERROR,4, getClassLoader());

  /**
   * The Directory Server profiler plugin instance defined in configuration entry %s does not list any plugin types.  This plugin must be configured to operate as a startup plugin
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PLUGIN_PROFILER_NO_PLUGIN_TYPES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PLUGIN_PROFILER_NO_PLUGIN_TYPES_5",PLUGIN,SEVERE_ERROR,5, getClassLoader());

  /**
   * The Directory Server profiler plugin instance defined in configuration entry %s lists an invalid plugin type %s.  This plugin can only be used as a startup plugin
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PLUGIN_PROFILER_INVALID_PLUGIN_TYPE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PLUGIN_PROFILER_INVALID_PLUGIN_TYPE_6",PLUGIN,SEVERE_ERROR,6, getClassLoader());

  /**
   * Path to the directory into which profile information will be written.  The directory must exist and the Directory Server must have permission to create new files in it.  Changes to this configuration attribute will take effect immediately
   */
  public static final MessageDescriptor.Arg0 INFO_PLUGIN_PROFILER_DESCRIPTION_PROFILE_DIR =
          new MessageDescriptor.Arg0(BASE,"INFO_PLUGIN_PROFILER_DESCRIPTION_PROFILE_DIR_7",PLUGIN,INFORMATION,7, getClassLoader());

  /**
   * An unexpected error occurred while attempting to determine the value of the ds-cfg-profile-directory attribute in the %s entry:  %s.  The default profile directory of %s will be used
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> WARN_PLUGIN_PROFILER_CANNOT_DETERMINE_PROFILE_DIR =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_WARN_PLUGIN_PROFILER_CANNOT_DETERMINE_PROFILE_DIR_8",PLUGIN,SEVERE_WARNING,8, getClassLoader());

  /**
   * An unexpected error occurred when the profiler plugin defined in configuration entry %s attempted to write the information captured to output file %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_PLUGIN_PROFILER_CANNOT_WRITE_PROFILE_DATA =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_PLUGIN_PROFILER_CANNOT_WRITE_PROFILE_DATA_9",PLUGIN,SEVERE_ERROR,9, getClassLoader());

  /**
   * Indicates whether the profiler plugin should start collecting data automatically when the Directory Server is started.  This will only be read when the server is started, and any changes will take effect on the next restart
   */
  public static final MessageDescriptor.Arg0 INFO_PLUGIN_PROFILER_DESCRIPTION_AUTOSTART =
          new MessageDescriptor.Arg0(BASE,"INFO_PLUGIN_PROFILER_DESCRIPTION_AUTOSTART_10",PLUGIN,INFORMATION,10, getClassLoader());

  /**
   * An unexpected error occurred while attempting to determine the value of the ds-cfg-enable-profiling-on-startup attribute in the %s entry:  %s.  Profiling information will not automatically be captured on startup and must be manually enabled
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_PLUGIN_PROFILER_CANNOT_DETERMINE_AUTOSTART =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_PLUGIN_PROFILER_CANNOT_DETERMINE_AUTOSTART_11",PLUGIN,SEVERE_WARNING,11, getClassLoader());

  /**
   * Sample interval that should be used when capturing profiling information in the server. Changes to this configuration attribute will take effect the next time the profiler is started
   */
  public static final MessageDescriptor.Arg0 INFO_PLUGIN_PROFILER_DESCRIPTION_INTERVAL =
          new MessageDescriptor.Arg0(BASE,"INFO_PLUGIN_PROFILER_DESCRIPTION_INTERVAL_12",PLUGIN,INFORMATION,12, getClassLoader());

  /**
   * An unexpected error occurred while attempting to determine the value of the ds-cfg-profile-sample-interval attribute in the %s entry:  %s.  The default sample interval of %d milliseconds will be used
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> WARN_PLUGIN_PROFILER_CANNOT_DETERMINE_INTERVAL =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"SEVERE_WARN_PLUGIN_PROFILER_CANNOT_DETERMINE_INTERVAL_13",PLUGIN,SEVERE_WARNING,13, getClassLoader());

  /**
   * Current state of the profiler.  It will be either "enabled" (which indicates that the profiler thread is actively collecting data) or "disabled".  This is a read-only attribute
   */
  public static final MessageDescriptor.Arg0 INFO_PLUGIN_PROFILER_DESCRIPTION_STATE =
          new MessageDescriptor.Arg0(BASE,"INFO_PLUGIN_PROFILER_DESCRIPTION_STATE_14",PLUGIN,INFORMATION,14, getClassLoader());

  /**
   * Action that should be taken by the profiler.  A value of "start" will cause the profiler thread to start collecting data if it is not already active.  A value of "stop" will cause the profiler thread to stop collecting data and write it do disk, and a value of "cancel" will cause the profiler thread to stop collecting data and discard anything that has been captured.  These operations will occur immediately
   */
  public static final MessageDescriptor.Arg0 INFO_PLUGIN_PROFILER_DESCRIPTION_ACTION =
          new MessageDescriptor.Arg0(BASE,"INFO_PLUGIN_PROFILER_DESCRIPTION_ACTION_15",PLUGIN,INFORMATION,15, getClassLoader());

  /**
   * The profile directory %s specified in attribute ds-cfg-profile-directory of configuration entry %s is invalid because the specified path does not exist or is not a directory
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_PLUGIN_PROFILER_INVALID_PROFILE_DIR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_PLUGIN_PROFILER_INVALID_PROFILE_DIR_16",PLUGIN,SEVERE_WARNING,16, getClassLoader());

  /**
   * An unexpected error occurred while attempting to determine the value of the ds-cfg-profile-action attribute in the %s entry:  %s.  No action will be taken
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_PLUGIN_PROFILER_CANNOT_DETERMINE_ACTION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_PLUGIN_PROFILER_CANNOT_DETERMINE_ACTION_17",PLUGIN,SEVERE_WARNING,17, getClassLoader());

  /**
   * The sample interval for the profiler plugin defined in configuration entry %s has been updated to %d milliseconds
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> INFO_PLUGIN_PROFILER_UPDATED_INTERVAL =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"INFO_PLUGIN_PROFILER_UPDATED_INTERVAL_18",PLUGIN,INFORMATION,18, getClassLoader());

  /**
   * An unexpected error occurred while attempting to update the sample interval for the profiler plugin defined in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PLUGIN_PROFILER_CANNOT_UPDATE_INTERVAL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PLUGIN_PROFILER_CANNOT_UPDATE_INTERVAL_19",PLUGIN,SEVERE_ERROR,19, getClassLoader());

  /**
   * The profile directory for the profiler plugin defined in configuration entry %s has been changed to %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_PLUGIN_PROFILER_UPDATED_DIRECTORY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_PLUGIN_PROFILER_UPDATED_DIRECTORY_20",PLUGIN,INFORMATION,20, getClassLoader());

  /**
   * An unexpected error occurred while attempting to update the profile directory for the profiler plugin defined in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PLUGIN_PROFILER_CANNOT_UPDATE_DIRECTORY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PLUGIN_PROFILER_CANNOT_UPDATE_DIRECTORY_21",PLUGIN,SEVERE_ERROR,21, getClassLoader());

  /**
   * The profiler plugin defined in configuration entry %s has been activated and has started capturing data
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_PLUGIN_PROFILER_STARTED_PROFILING =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_PLUGIN_PROFILER_STARTED_PROFILING_22",PLUGIN,INFORMATION,22, getClassLoader());

  /**
   * The profiler plugin defined in configuration entry %s is already active, and therefore the request to start profiling has been ignored
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_PLUGIN_PROFILER_ALREADY_PROFILING =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_PLUGIN_PROFILER_ALREADY_PROFILING_23",PLUGIN,INFORMATION,23, getClassLoader());

  /**
   * The profiler plugin defined in configuration entry %s received a request to stop capturing data but it was not active so no action has been taken
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_PLUGIN_PROFILER_NOT_RUNNING =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_PLUGIN_PROFILER_NOT_RUNNING_24",PLUGIN,INFORMATION,24, getClassLoader());

  /**
   * The profiler plugin defined in configuration entry %s has been stopped and is no longer capturing data
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_PLUGIN_PROFILER_STOPPED_PROFILING =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_PLUGIN_PROFILER_STOPPED_PROFILING_25",PLUGIN,INFORMATION,25, getClassLoader());

  /**
   * The data collected by the profiler plugin defined in configuration entry %s has been written to %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_PLUGIN_PROFILER_WROTE_PROFILE_DATA =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_PLUGIN_PROFILER_WROTE_PROFILE_DATA_26",PLUGIN,INFORMATION,26, getClassLoader());

  /**
   * The profiler plugin defined in configuration entry %s has been requested to perform an action %s that is not recognized by the server.  No action will be taken
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PLUGIN_PROFILER_UNKNOWN_ACTION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_PLUGIN_PROFILER_UNKNOWN_ACTION_27",PLUGIN,MILD_ERROR,27, getClassLoader());

  /**
   * A profiler action %s was requested for the profiler plugin defined in configuration entry %s, but one or more problems were encountered with the plugin configuration and therefore the requested action will be skipped
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_PLUGIN_PROFILER_SKIPPING_ACTION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_PLUGIN_PROFILER_SKIPPING_ACTION_28",PLUGIN,INFORMATION,28, getClassLoader());

  /**
   * An unexpected error occurred while attempting to process the requested action for the profiler plugin defined in configuration entry %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PLUGIN_PROFILER_CANNOT_PERFORM_ACTION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PLUGIN_PROFILER_CANNOT_PERFORM_ACTION_29",PLUGIN,SEVERE_ERROR,29, getClassLoader());

  /**
   * The startup plugin defined in configuration entry %s threw an exception when it was invoked during the Directory Server startup process:  %s.  The server startup process has been aborted
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PLUGIN_STARTUP_PLUGIN_EXCEPTION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"FATAL_ERR_PLUGIN_STARTUP_PLUGIN_EXCEPTION_30",PLUGIN,FATAL_ERROR,30, getClassLoader());

  /**
   * The startup plugin defined in configuration entry %s returned a null value when it was invoked during the Directory Server startup process.  This is an illegal return value, and the server startup process has been aborted
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PLUGIN_STARTUP_PLUGIN_RETURNED_NULL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"FATAL_ERR_PLUGIN_STARTUP_PLUGIN_RETURNED_NULL_31",PLUGIN,FATAL_ERROR,31, getClassLoader());

  /**
   * The startup plugin defined in configuration entry %s encountered an error when it was invoked during the Directory Server startup process:  %s (error ID %d).  The startup process will continue, but this failure might impact the operation of the server
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> ERR_PLUGIN_STARTUP_PLUGIN_FAIL_CONTINUE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"SEVERE_ERR_PLUGIN_STARTUP_PLUGIN_FAIL_CONTINUE_32",PLUGIN,SEVERE_ERROR,32, getClassLoader());

  /**
   * The startup plugin defined in configuration entry %s encountered an error when it was invoked during the Directory Server startup process:  %s (error ID %d).  The server startup process has been aborted
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,Number> ERR_PLUGIN_STARTUP_PLUGIN_FAIL_ABORT =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,Number>(BASE,"FATAL_ERR_PLUGIN_STARTUP_PLUGIN_FAIL_ABORT_33",PLUGIN,FATAL_ERROR,33, getClassLoader());

  /**
   * The shutdown plugin defined in configuration entry %s threw an exception when it was invoked during the Directory Server shutdown process:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PLUGIN_SHUTDOWN_PLUGIN_EXCEPTION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PLUGIN_SHUTDOWN_PLUGIN_EXCEPTION_34",PLUGIN,SEVERE_ERROR,34, getClassLoader());

  /**
   * The post-connect plugin defined in configuration entry %s threw an exception when it was invoked for connection %d from %s:  %s.  The connection will be terminated
   */
  public static final MessageDescriptor.Arg4<CharSequence,Number,CharSequence,CharSequence> ERR_PLUGIN_POST_CONNECT_PLUGIN_EXCEPTION =
          new MessageDescriptor.Arg4<CharSequence,Number,CharSequence,CharSequence>(BASE,"SEVERE_ERR_PLUGIN_POST_CONNECT_PLUGIN_EXCEPTION_35",PLUGIN,SEVERE_ERROR,35, getClassLoader());

  /**
   * The post-connect plugin defined in configuration entry %s returned null when invoked for connection %d from %s.  This is an illegal response, and the connection will be terminated
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,CharSequence> ERR_PLUGIN_POST_CONNECT_PLUGIN_RETURNED_NULL =
          new MessageDescriptor.Arg3<CharSequence,Number,CharSequence>(BASE,"SEVERE_ERR_PLUGIN_POST_CONNECT_PLUGIN_RETURNED_NULL_36",PLUGIN,SEVERE_ERROR,36, getClassLoader());

  /**
   * The post-disconnect plugin defined in configuration entry %s threw an exception when it was invoked for connection %d from %s:  %s
   */
  public static final MessageDescriptor.Arg4<CharSequence,Number,CharSequence,CharSequence> ERR_PLUGIN_POST_DISCONNECT_PLUGIN_EXCEPTION =
          new MessageDescriptor.Arg4<CharSequence,Number,CharSequence,CharSequence>(BASE,"SEVERE_ERR_PLUGIN_POST_DISCONNECT_PLUGIN_EXCEPTION_37",PLUGIN,SEVERE_ERROR,37, getClassLoader());

  /**
   * The post-disconnect plugin defined in configuration entry %s returned null when invoked for connection %d from %s.  This is an illegal response
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,CharSequence> ERR_PLUGIN_POST_DISCONNECT_PLUGIN_RETURNED_NULL =
          new MessageDescriptor.Arg3<CharSequence,Number,CharSequence>(BASE,"SEVERE_ERR_PLUGIN_POST_DISCONNECT_PLUGIN_RETURNED_NULL_38",PLUGIN,SEVERE_ERROR,38, getClassLoader());

  /**
   * The pre-parse %s plugin defined in configuration entry %s threw an exception when it was invoked for connection %d operation %d:  %s.  Processing on this operation will be terminated
   */
  public static final MessageDescriptor.Arg5<CharSequence,CharSequence,Number,Number,CharSequence> ERR_PLUGIN_PRE_PARSE_PLUGIN_EXCEPTION =
          new MessageDescriptor.Arg5<CharSequence,CharSequence,Number,Number,CharSequence>(BASE,"SEVERE_ERR_PLUGIN_PRE_PARSE_PLUGIN_EXCEPTION_39",PLUGIN,SEVERE_ERROR,39, getClassLoader());

  /**
   * The pre-parse %s plugin defined in configuration entry %s returned null when invoked for connection %d operation %s.  This is an illegal response, and processing on this operation will be terminated
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,Number,CharSequence> ERR_PLUGIN_PRE_PARSE_PLUGIN_RETURNED_NULL =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,Number,CharSequence>(BASE,"SEVERE_ERR_PLUGIN_PRE_PARSE_PLUGIN_RETURNED_NULL_40",PLUGIN,SEVERE_ERROR,40, getClassLoader());

  /**
   * The pre-operation %s plugin defined in configuration entry %s threw an exception when it was invoked for connection %d operation %d:  %s.  Processing on this operation will be terminated
   */
  public static final MessageDescriptor.Arg5<CharSequence,CharSequence,Number,Number,CharSequence> ERR_PLUGIN_PRE_OPERATION_PLUGIN_EXCEPTION =
          new MessageDescriptor.Arg5<CharSequence,CharSequence,Number,Number,CharSequence>(BASE,"SEVERE_ERR_PLUGIN_PRE_OPERATION_PLUGIN_EXCEPTION_41",PLUGIN,SEVERE_ERROR,41, getClassLoader());

  /**
   * The pre-operation %s plugin defined in configuration entry %s returned null when invoked for connection %d operation %d.  This is an illegal response, and processing on this operation will be terminated
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,Number,Number> ERR_PLUGIN_PRE_OPERATION_PLUGIN_RETURNED_NULL =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,Number,Number>(BASE,"SEVERE_ERR_PLUGIN_PRE_OPERATION_PLUGIN_RETURNED_NULL_42",PLUGIN,SEVERE_ERROR,42, getClassLoader());

  /**
   * The post-operation %s plugin defined in configuration entry %s threw an exception when it was invoked for connection %d operation %d:  %s.  Processing on this operation will be terminated
   */
  public static final MessageDescriptor.Arg5<CharSequence,CharSequence,Number,Number,CharSequence> ERR_PLUGIN_POST_OPERATION_PLUGIN_EXCEPTION =
          new MessageDescriptor.Arg5<CharSequence,CharSequence,Number,Number,CharSequence>(BASE,"SEVERE_ERR_PLUGIN_POST_OPERATION_PLUGIN_EXCEPTION_43",PLUGIN,SEVERE_ERROR,43, getClassLoader());

  /**
   * The post-operation %s plugin defined in configuration entry %s returned null when invoked for connection %d operation %d.  This is an illegal response, and processing on this operation will be terminated
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,Number,Number> ERR_PLUGIN_POST_OPERATION_PLUGIN_RETURNED_NULL =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,Number,Number>(BASE,"SEVERE_ERR_PLUGIN_POST_OPERATION_PLUGIN_RETURNED_NULL_44",PLUGIN,SEVERE_ERROR,44, getClassLoader());

  /**
   * The post-response %s plugin defined in configuration entry %s threw an exception when it was invoked for connection %d operation %d:  %s.  Processing on this operation will be terminated
   */
  public static final MessageDescriptor.Arg5<CharSequence,CharSequence,Number,Number,CharSequence> ERR_PLUGIN_POST_RESPONSE_PLUGIN_EXCEPTION =
          new MessageDescriptor.Arg5<CharSequence,CharSequence,Number,Number,CharSequence>(BASE,"SEVERE_ERR_PLUGIN_POST_RESPONSE_PLUGIN_EXCEPTION_45",PLUGIN,SEVERE_ERROR,45, getClassLoader());

  /**
   * The post-response %s plugin defined in configuration entry %s returned null when invoked for connection %d operation %d.  This is an illegal response, and processing on this operation will be terminated
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,Number,Number> ERR_PLUGIN_POST_RESPONSE_PLUGIN_RETURNED_NULL =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,Number,Number>(BASE,"SEVERE_ERR_PLUGIN_POST_RESPONSE_PLUGIN_RETURNED_NULL_46",PLUGIN,SEVERE_ERROR,46, getClassLoader());

  /**
   * The search result entry plugin defined in configuration entry %s threw an exception when it was invoked for connection %d operation %d with entry %s:  %s.  Processing on this search operation will be terminated
   */
  public static final MessageDescriptor.Arg5<CharSequence,Number,Number,CharSequence,CharSequence> ERR_PLUGIN_SEARCH_ENTRY_PLUGIN_EXCEPTION =
          new MessageDescriptor.Arg5<CharSequence,Number,Number,CharSequence,CharSequence>(BASE,"SEVERE_ERR_PLUGIN_SEARCH_ENTRY_PLUGIN_EXCEPTION_47",PLUGIN,SEVERE_ERROR,47, getClassLoader());

  /**
   * The search result entry plugin defined in configuration entry %s returned null when invoked for connection %d operation %d with entry %s.  This is an illegal response, and processing on this search operation will be terminated
   */
  public static final MessageDescriptor.Arg4<CharSequence,Number,Number,CharSequence> ERR_PLUGIN_SEARCH_ENTRY_PLUGIN_RETURNED_NULL =
          new MessageDescriptor.Arg4<CharSequence,Number,Number,CharSequence>(BASE,"SEVERE_ERR_PLUGIN_SEARCH_ENTRY_PLUGIN_RETURNED_NULL_48",PLUGIN,SEVERE_ERROR,48, getClassLoader());

  /**
   * The search result reference plugin defined in configuration entry %s threw an exception when it was invoked for connection %d operation %d with referral URL(s) %s:  %s. Processing on this search operation will be terminated
   */
  public static final MessageDescriptor.Arg5<CharSequence,Number,Number,CharSequence,CharSequence> ERR_PLUGIN_SEARCH_REFERENCE_PLUGIN_EXCEPTION =
          new MessageDescriptor.Arg5<CharSequence,Number,Number,CharSequence,CharSequence>(BASE,"SEVERE_ERR_PLUGIN_SEARCH_REFERENCE_PLUGIN_EXCEPTION_49",PLUGIN,SEVERE_ERROR,49, getClassLoader());

  /**
   * The search result reference plugin defined in configuration entry %s returned null when invoked for connection %d operation %d with referral URL(s) %s.  This is an illegal response, and processing on this search operation will be terminated
   */
  public static final MessageDescriptor.Arg4<CharSequence,Number,Number,CharSequence> ERR_PLUGIN_SEARCH_REFERENCE_PLUGIN_RETURNED_NULL =
          new MessageDescriptor.Arg4<CharSequence,Number,Number,CharSequence>(BASE,"SEVERE_ERR_PLUGIN_SEARCH_REFERENCE_PLUGIN_RETURNED_NULL_50",PLUGIN,SEVERE_ERROR,50, getClassLoader());

  /**
   * An attempt was made to register the LastMod plugin to be invoked as a %s plugin.  This plugin type is not allowed for this plugin
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PLUGIN_LASTMOD_INVALID_PLUGIN_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PLUGIN_LASTMOD_INVALID_PLUGIN_TYPE_51",PLUGIN,SEVERE_ERROR,51, getClassLoader());

  /**
   * Path to a profile data file.  This  argument can be provided more than once to analyze data from multiple data files
   */
  public static final MessageDescriptor.Arg0 INFO_PROFILEVIEWER_DESCRIPTION_FILENAMES =
          new MessageDescriptor.Arg0(BASE,"INFO_PROFILEVIEWER_DESCRIPTION_FILENAMES_52",PLUGIN,INFORMATION,52, getClassLoader());

  /**
   * Indicates whether to view the profile information in GUI mode or to write the resulting data to standard output
   */
  public static final MessageDescriptor.Arg0 INFO_PROFILEVIEWER_DESCRIPTION_USE_GUI =
          new MessageDescriptor.Arg0(BASE,"INFO_PROFILEVIEWER_DESCRIPTION_USE_GUI_53",PLUGIN,INFORMATION,53, getClassLoader());

  /**
   * Displays this usage information
   */
  public static final MessageDescriptor.Arg0 INFO_PROFILEVIEWER_DESCRIPTION_USAGE =
          new MessageDescriptor.Arg0(BASE,"INFO_PROFILEVIEWER_DESCRIPTION_USAGE_54",PLUGIN,INFORMATION,54, getClassLoader());

  /**
   * An unexpected error occurred while attempting to initialize the command-line arguments:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PROFILEVIEWER_CANNOT_INITIALIZE_ARGS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PROFILEVIEWER_CANNOT_INITIALIZE_ARGS_55",PLUGIN,SEVERE_ERROR,55, getClassLoader());

  /**
   * An error occurred while parsing the command-line arguments:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PROFILEVIEWER_ERROR_PARSING_ARGS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PROFILEVIEWER_ERROR_PARSING_ARGS_56",PLUGIN,SEVERE_ERROR,56, getClassLoader());

  /**
   * An error occurred while trying to process the profile data in file %s:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PROFILEVIEWER_CANNOT_PROCESS_DATA_FILE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PROFILEVIEWER_CANNOT_PROCESS_DATA_FILE_57",PLUGIN,SEVERE_ERROR,57, getClassLoader());

  /**
   * The LDIF import plugin defined in configuration entry %s threw an exception when it was invoked on entry %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_PLUGIN_LDIF_IMPORT_PLUGIN_EXCEPTION =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_PLUGIN_LDIF_IMPORT_PLUGIN_EXCEPTION_58",PLUGIN,SEVERE_ERROR,58, getClassLoader());

  /**
   * The LDIF import plugin defined in configuration entry %s returned null when invoked on entry %s. This is an illegal response
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PLUGIN_LDIF_IMPORT_PLUGIN_RETURNED_NULL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PLUGIN_LDIF_IMPORT_PLUGIN_RETURNED_NULL_59",PLUGIN,SEVERE_ERROR,59, getClassLoader());

  /**
   * The LDIF export plugin defined in configuration entry %s threw an exception when it was invoked on entry %s:  %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_PLUGIN_LDIF_EXPORT_PLUGIN_EXCEPTION =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_PLUGIN_LDIF_EXPORT_PLUGIN_EXCEPTION_60",PLUGIN,SEVERE_ERROR,60, getClassLoader());

  /**
   * The LDIF export plugin defined in configuration entry %s returned null when invoked on entry %s. This is an illegal response
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PLUGIN_LDIF_EXPORT_PLUGIN_RETURNED_NULL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PLUGIN_LDIF_EXPORT_PLUGIN_RETURNED_NULL_61",PLUGIN,SEVERE_ERROR,61, getClassLoader());

  /**
   * An attempt was made to register the EntryUUID plugin to be invoked as a %s plugin.  This plugin type is not allowed for this plugin
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PLUGIN_ENTRYUUID_INVALID_PLUGIN_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PLUGIN_ENTRYUUID_INVALID_PLUGIN_TYPE_62",PLUGIN,SEVERE_ERROR,62, getClassLoader());

  /**
   * The intermediate response plugin defined in configuration entry %s threw an exception when it was invoked for connection %d operation %d:  %s.  Processing on this operation will be terminated
   */
  public static final MessageDescriptor.Arg4<CharSequence,Number,Number,CharSequence> ERR_PLUGIN_INTERMEDIATE_RESPONSE_PLUGIN_EXCEPTION =
          new MessageDescriptor.Arg4<CharSequence,Number,Number,CharSequence>(BASE,"SEVERE_ERR_PLUGIN_INTERMEDIATE_RESPONSE_PLUGIN_EXCEPTION_63",PLUGIN,SEVERE_ERROR,63, getClassLoader());

  /**
   * The intermediate response plugin defined in configuration entry %s returned null when invoked for connection %d operation %d.  This is an illegal response, and processing on this operation will be terminated
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,Number> ERR_PLUGIN_INTERMEDIATE_RESPONSE_PLUGIN_RETURNED_NULL =
          new MessageDescriptor.Arg3<CharSequence,Number,Number>(BASE,"SEVERE_ERR_PLUGIN_INTERMEDIATE_RESPONSE_PLUGIN_RETURNED_NULL_64",PLUGIN,SEVERE_ERROR,64, getClassLoader());

  /**
   * An attempt was made to register the password policy import plugin to be invoked as a %s plugin. This plugin type is not allowed for this plugin
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PLUGIN_PWPIMPORT_INVALID_PLUGIN_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PLUGIN_PWPIMPORT_INVALID_PLUGIN_TYPE_65",PLUGIN,SEVERE_ERROR,65, getClassLoader());

  /**
   * An error occurred while attempting to encode a password value stored in attribute %s of user entry %s:  %s.  Password values for this user will not be encoded
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_PLUGIN_PWPIMPORT_ERROR_ENCODING_PASSWORD =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_PLUGIN_PWPIMPORT_ERROR_ENCODING_PASSWORD_66",PLUGIN,SEVERE_ERROR,66, getClassLoader());

  /**
   * The plugin defined in configuration entry %s does not support the %s plugin type
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PLUGIN_TYPE_NOT_SUPPORTED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PLUGIN_TYPE_NOT_SUPPORTED_67",PLUGIN,SEVERE_ERROR,67, getClassLoader());

  /**
   * This utility can be used to view information in data files captured by the Directory Server profiler
   */
  public static final MessageDescriptor.Arg0 INFO_PROFILEVIEWER_TOOL_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_PROFILEVIEWER_TOOL_DESCRIPTION_68",PLUGIN,INFORMATION,68, getClassLoader());

  /**
   * The password policy import plugin is not configured any default auth password schemes, and the server does not support the %s auth password scheme
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PLUGIN_PWIMPORT_NO_DEFAULT_AUTH_SCHEMES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PLUGIN_PWIMPORT_NO_DEFAULT_AUTH_SCHEMES_69",PLUGIN,SEVERE_ERROR,69, getClassLoader());

  /**
   * Auth password storage scheme %s referenced by the password policy import plugin is not configured for use in the server
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PLUGIN_PWIMPORT_INVALID_DEFAULT_AUTH_SCHEME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PLUGIN_PWIMPORT_INVALID_DEFAULT_AUTH_SCHEME_70",PLUGIN,SEVERE_ERROR,70, getClassLoader());

  /**
   * The password policy import plugin is not configured any default user password schemes, and the server does not support the %s auth password scheme
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PLUGIN_PWIMPORT_NO_DEFAULT_USER_SCHEMES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PLUGIN_PWIMPORT_NO_DEFAULT_USER_SCHEMES_71",PLUGIN,SEVERE_ERROR,71, getClassLoader());

  /**
   * User password storage scheme %s referenced by the password policy import plugin is not configured for use in the server
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PLUGIN_PWIMPORT_INVALID_DEFAULT_USER_SCHEME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PLUGIN_PWIMPORT_INVALID_DEFAULT_USER_SCHEME_72",PLUGIN,SEVERE_ERROR,72, getClassLoader());

  /**
   * Entry '%s' indicates that it uses custom password policy '%s', but no such policy is defined in the server.  Any passwords contained in the entry will be encoded using the default storage schemes, but authentication as this user might not be possible
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_PLUGIN_PWIMPORT_NO_SUCH_POLICY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_PLUGIN_PWIMPORT_NO_SUCH_POLICY_73",PLUGIN,SEVERE_WARNING,73, getClassLoader());

  /**
   * An error occurred while attempting to decode the value of the custom password policy attribute in entry '%s':  %s.  Any passwords contained in the entry will be encoded using the default storage schemes, but authentication as this user might not be possible
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> WARN_PLUGIN_PWIMPORT_CANNOT_DECODE_POLICY_DN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_WARN_PLUGIN_PWIMPORT_CANNOT_DECODE_POLICY_DN_74",PLUGIN,SEVERE_WARNING,74, getClassLoader());

  /**
   * The subordinate modify DN plugin defined in configuration entry %s threw an exception when it was invoked for connection %d operation %d:  %s.  Processing on this operation will be terminated
   */
  public static final MessageDescriptor.Arg4<CharSequence,Number,Number,CharSequence> ERR_PLUGIN_SUBORDINATE_MODIFY_DN_PLUGIN_EXCEPTION =
          new MessageDescriptor.Arg4<CharSequence,Number,Number,CharSequence>(BASE,"SEVERE_ERR_PLUGIN_SUBORDINATE_MODIFY_DN_PLUGIN_EXCEPTION_75",PLUGIN,SEVERE_ERROR,75, getClassLoader());

  /**
   * The subordinate modify DN plugin defined in configuration entry %s returned null when invoked for connection %d operation %s.  This is an illegal response, and processing on this operation will be terminated
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,CharSequence> ERR_PLUGIN_SUBORDINATE_MODIFY_DN_PLUGIN_RETURNED_NULL =
          new MessageDescriptor.Arg3<CharSequence,Number,CharSequence>(BASE,"SEVERE_ERR_PLUGIN_SUBORDINATE_MODIFY_DN_PLUGIN_RETURNED_NULL_76",PLUGIN,SEVERE_ERROR,76, getClassLoader());

  /**
   * An attempt was made to register the Unique Attribute plugin to be invoked as a %s plugin.  This plugin type is not allowed for this plugin
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PLUGIN_UNIQUEATTR_INVALID_PLUGIN_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PLUGIN_UNIQUEATTR_INVALID_PLUGIN_TYPE_77",PLUGIN,SEVERE_ERROR,77, getClassLoader());

  /**
   * An error occurred while attempting to modify an attribute value of entry %s because the proposed changes failed the attribute value uniqueness check
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PLUGIN_UNIQUEATTR_MOD_NOT_UNIQUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PLUGIN_UNIQUEATTR_MOD_NOT_UNIQUE_78",PLUGIN,SEVERE_ERROR,78, getClassLoader());

  /**
   * An error occurred while attempting to add the entry %s because one of the entry's attribute values failed the attribute value uniqueness check
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PLUGIN_UNIQUEATTR_ADD_NOT_UNIQUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PLUGIN_UNIQUEATTR_ADD_NOT_UNIQUE_79",PLUGIN,SEVERE_ERROR,79, getClassLoader());

  /**
   * An error occurred while attempting to perform a modify DN operation on entry %s because the proposed changes failed the attribute value uniqueness check
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PLUGIN_UNIQUEATTR_MODDN_NOT_UNIQUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PLUGIN_UNIQUEATTR_MODDN_NOT_UNIQUE_80",PLUGIN,SEVERE_ERROR,80, getClassLoader());

  /**
   * An attempt was made to register the Referential Integrity plugin to be invoked as a %s plugin.  This plugin type is not allowed for this plugin
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PLUGIN_REFERENT_INVALID_PLUGIN_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PLUGIN_REFERENT_INVALID_PLUGIN_TYPE_81",PLUGIN,SEVERE_ERROR,81, getClassLoader());

  /**
   * An error occurred during Referential Integity plugin initialization because log file creation failed:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PLUGIN_REFERENT_CREATE_LOGFILE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PLUGIN_REFERENT_CREATE_LOGFILE_82",PLUGIN,SEVERE_ERROR,82, getClassLoader());

  /**
   * An error occurred closing the Referential Integrity plugin update log file: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PLUGIN_REFERENT_CLOSE_LOGFILE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PLUGIN_REFERENT_CLOSE_LOGFILE_83",PLUGIN,SEVERE_ERROR,83, getClassLoader());

  /**
   * An error occurred replacing the Referential Integrity plugin update log file: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PLUGIN_REFERENT_REPLACE_LOGFILE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PLUGIN_REFERENT_REPLACE_LOGFILE_84",PLUGIN,SEVERE_ERROR,84, getClassLoader());

  /**
   * The file name that the Referential Integrity plugin logs changes to during background processing has been changed from %s to %s, but this change will not take effect until the server is restarted
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_PLUGIN_REFERENT_LOGFILE_CHANGE_REQUIRES_RESTART =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_PLUGIN_REFERENT_LOGFILE_CHANGE_REQUIRES_RESTART_85",PLUGIN,INFORMATION,85, getClassLoader());

  /**
   * The Referential Integrity plugin background processing update interval has been changed from %s to %s, the new value will now be during background processing
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_PLUGIN_REFERENT_BACKGROUND_PROCESSING_UPDATE_INTERVAL_CHANGED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_PLUGIN_REFERENT_BACKGROUND_PROCESSING_UPDATE_INTERVAL_CHANGED_86",PLUGIN,INFORMATION,86, getClassLoader());

  /**
   * The Referential Integrity plugin background processing has been stopped
   */
  public static final MessageDescriptor.Arg0 INFO_PLUGIN_REFERENT_BACKGROUND_PROCESSING_STOPPING =
          new MessageDescriptor.Arg0(BASE,"INFO_PLUGIN_REFERENT_BACKGROUND_PROCESSING_STOPPING_87",PLUGIN,INFORMATION,87, getClassLoader());

  /**
   * The Referential Integrity plugin has started background processing using the update interval %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_PLUGIN_REFERENT_BACKGROUND_PROCESSING_STARTING =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_PLUGIN_REFERENT_BACKGROUND_PROCESSING_STARTING_88",PLUGIN,INFORMATION,88, getClassLoader());

  /**
   * The Referential Integrity plugin failed when performaing an internal search: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PLUGIN_REFERENT_SEARCH_FAILED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PLUGIN_REFERENT_SEARCH_FAILED_89",PLUGIN,SEVERE_ERROR,89, getClassLoader());

  /**
   * The Referential Integrity plugin failed when performing an internal modify on entry %s: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PLUGIN_REFERENT_MODIFY_FAILED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PLUGIN_REFERENT_MODIFY_FAILED_90",PLUGIN,SEVERE_ERROR,90, getClassLoader());

  /**
   * The Referential Integrity plugin failed to decode a entry DN from the update log: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PLUGIN_REFERENT_CANNOT_DECODE_STRING_AS_DN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_PLUGIN_REFERENT_CANNOT_DECODE_STRING_AS_DN_91",PLUGIN,MILD_ERROR,91, getClassLoader());

  /**
   * The Referential Integrity plugin failed when performing a search because the base DN %s does not exist
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_PLUGIN_REFERENT_SEARCH_NO_SUCH_OBJECT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_PLUGIN_REFERENT_SEARCH_NO_SUCH_OBJECT_92",PLUGIN,INFORMATION,92, getClassLoader());

  /**
   * An error occurred in the Referential Integrity plugin while attempting to configure the attribute type %s which has a syntax OID of %s. A Referential Integrity attribute type must have a syntax OID of either 1.3.6.1.4.1.1466.115.121.1.12 (for the distinguished name syntax) or 1.3.6.1.4.1.1466.115.121.1.34 (for the name and optional uid syntax)
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PLUGIN_REFERENT_INVALID_ATTRIBUTE_SYNTAX =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PLUGIN_REFERENT_INVALID_ATTRIBUTE_SYNTAX_93",PLUGIN,SEVERE_ERROR,93, getClassLoader());

  /**
   * The Referential Integrity plugin will not process a post delete operation on entry %s because the core operation failed
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PLUGIN_REFERENT_SKIP_DELETE_PROCESSING =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PLUGIN_REFERENT_SKIP_DELETE_PROCESSING_94",PLUGIN,SEVERE_ERROR,94, getClassLoader());

  /**
   * The Referential Integrity plugin will not process a post modify DN operation on entry %s because the core operation failed
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PLUGIN_REFERENT_SKIP_MODIFY_DN_PROCESSING =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PLUGIN_REFERENT_SKIP_MODIFY_DN_PROCESSING_95",PLUGIN,SEVERE_ERROR,95, getClassLoader());

  /**
   * The 7-bit clean plugin is configured with invalid plugin type %s.  Only the ldifImport, preOperationAdd, preOperationModify, and preOperationModifyDN plugin types are allowed
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PLUGIN_7BIT_INVALID_PLUGIN_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_PLUGIN_7BIT_INVALID_PLUGIN_TYPE_96",PLUGIN,MILD_ERROR,96, getClassLoader());

  /**
   * An error occurred while trying to decode the DN of the target entry:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PLUGIN_7BIT_CANNOT_DECODE_DN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_PLUGIN_7BIT_CANNOT_DECODE_DN_97",PLUGIN,MILD_ERROR,97, getClassLoader());

  /**
   * An error occurred while trying to decode attribute %s in the target entry:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PLUGIN_7BIT_CANNOT_DECODE_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_PLUGIN_7BIT_CANNOT_DECODE_ATTR_98",PLUGIN,MILD_ERROR,98, getClassLoader());

  /**
   * An error occurred while trying to decode the new RDN:  %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PLUGIN_7BIT_CANNOT_DECODE_NEW_RDN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_PLUGIN_7BIT_CANNOT_DECODE_NEW_RDN_99",PLUGIN,MILD_ERROR,99, getClassLoader());

  /**
   * The entry to be added included a value for attribute %s that was not 7-bit clean
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PLUGIN_7BIT_ADD_ATTR_NOT_CLEAN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_PLUGIN_7BIT_ADD_ATTR_NOT_CLEAN_100",PLUGIN,MILD_ERROR,100, getClassLoader());

  /**
   * The modify operation would have resulted in a value for attribute %s that was not 7-bit clean
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PLUGIN_7BIT_MODIFY_ATTR_NOT_CLEAN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_PLUGIN_7BIT_MODIFY_ATTR_NOT_CLEAN_101",PLUGIN,MILD_ERROR,101, getClassLoader());

  /**
   * The modify DN operation would have resulted in a value for attribute %s that was not 7-bit clean
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PLUGIN_7BIT_MODIFYDN_ATTR_NOT_CLEAN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_PLUGIN_7BIT_MODIFYDN_ATTR_NOT_CLEAN_102",PLUGIN,MILD_ERROR,102, getClassLoader());

  /**
   * The entry included a value for attribute %s that was not 7-bit clean
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PLUGIN_7BIT_IMPORT_ATTR_NOT_CLEAN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_PLUGIN_7BIT_IMPORT_ATTR_NOT_CLEAN_103",PLUGIN,MILD_ERROR,103, getClassLoader());

  /**
   * The password policy import plugin references default auth password storage scheme %s which is not available for use in the server
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PLUGIN_PWIMPORT_NO_SUCH_DEFAULT_AUTH_SCHEME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PLUGIN_PWIMPORT_NO_SUCH_DEFAULT_AUTH_SCHEME_104",PLUGIN,SEVERE_ERROR,104, getClassLoader());

  /**
   * The post-synchronization %s plugin defined in configuration entry %s threw an exception when it was invoked for connection %d operation %d:  %s
   */
  public static final MessageDescriptor.Arg5<CharSequence,CharSequence,Number,Number,CharSequence> ERR_PLUGIN_POST_SYNCHRONIZATION_PLUGIN_EXCEPTION =
          new MessageDescriptor.Arg5<CharSequence,CharSequence,Number,Number,CharSequence>(BASE,"SEVERE_ERR_PLUGIN_POST_SYNCHRONIZATION_PLUGIN_EXCEPTION_105",PLUGIN,SEVERE_ERROR,105, getClassLoader());

  /**
   * A unique attribute conflict was detected for attribute %s:  value %s already exists in entry %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_PLUGIN_UNIQUEATTR_ATTR_NOT_UNIQUE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_PLUGIN_UNIQUEATTR_ATTR_NOT_UNIQUE_106",PLUGIN,SEVERE_ERROR,106, getClassLoader());

  /**
   * A unique attribute conflict was detected for attribute %s during synchronization (connID=%d, opID=%d):  value %s in entry %s conflicts with an existing value in entry %s.  Manual interaction is required to eliminate the conflict
   */
  public static final MessageDescriptor.Arg6<CharSequence,Number,Number,CharSequence,CharSequence,CharSequence> ERR_PLUGIN_UNIQUEATTR_SYNC_NOT_UNIQUE =
          new MessageDescriptor.Arg6<CharSequence,Number,Number,CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_PLUGIN_UNIQUEATTR_SYNC_NOT_UNIQUE_107",PLUGIN,SEVERE_ERROR,107, getClassLoader());

  /**
   * An internal error occurred while attempting to determine whether the operation would have resulted in a unique attribute conflict (result %s, message %s)
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PLUGIN_UNIQUEATTR_INTERNAL_ERROR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PLUGIN_UNIQUEATTR_INTERNAL_ERROR_108",PLUGIN,SEVERE_ERROR,108, getClassLoader());

  /**
   * An internal error occurred while attempting to determine whether the synchronization operation (connID=%d, opID=%d) for entry %s would have resulted in a unique attribute conflict (result %s, message %s)
   */
  public static final MessageDescriptor.Arg5<Number,Number,CharSequence,CharSequence,CharSequence> ERR_PLUGIN_UNIQUEATTR_INTERNAL_ERROR_SYNC =
          new MessageDescriptor.Arg5<Number,Number,CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_PLUGIN_UNIQUEATTR_INTERNAL_ERROR_SYNC_109",PLUGIN,SEVERE_ERROR,109, getClassLoader());

  /**
   * The referential integrity plugin defined in configuration entry %s is configured to operate on attribute %s but there is no equality index defined for this attribute in backend %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_PLUGIN_REFERENT_ATTR_UNINDEXED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_PLUGIN_REFERENT_ATTR_UNINDEXED_110",PLUGIN,SEVERE_ERROR,110, getClassLoader());

  /**
   * The unique attribute plugin defined in configuration entry %s is configured to operate on attribute %s but there is no equality index defined for this attribute in backend %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_PLUGIN_UNIQUEATTR_ATTR_UNINDEXED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_PLUGIN_UNIQUEATTR_ATTR_UNINDEXED_111",PLUGIN,SEVERE_ERROR,111, getClassLoader());

  /**
   * An attempt was made to register the NetworkGroup plugin to be invoked as a %s plugin.  This plugin type is not allowed for this plugin
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PLUGIN_NETWORKGROUP_INVALID_PLUGIN_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PLUGIN_NETWORKGROUP_INVALID_PLUGIN_TYPE_112",PLUGIN,SEVERE_ERROR,112, getClassLoader());

  /**
   * An attempt was made to register the Change Number Control plugin to be invoked as a %s plugin.  This plugin type is not allowed for this plugin
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PLUGIN_CHANGE_NUMBER_INVALID_PLUGIN_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PLUGIN_CHANGE_NUMBER_INVALID_PLUGIN_TYPE_113",PLUGIN,SEVERE_ERROR,113, getClassLoader());

  /**
   * An attempt was made to register the Change Number Control plugin with the following plugin types : %s. However this plugin must be configured with all of the following plugin types : %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PLUGIN_CHANGE_NUMBER_INVALID_PLUGIN_TYPE_LIST =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PLUGIN_CHANGE_NUMBER_INVALID_PLUGIN_TYPE_LIST_114",PLUGIN,SEVERE_ERROR,114, getClassLoader());

  /**
   * The subordinate delete plugin defined in configuration entry %s threw an exception when it was invoked for connection %d operation %d:  %s.  Processing on this operation will be terminated
   */
  public static final MessageDescriptor.Arg4<CharSequence,Number,Number,CharSequence> ERR_PLUGIN_SUBORDINATE_DELETE_PLUGIN_EXCEPTION =
          new MessageDescriptor.Arg4<CharSequence,Number,Number,CharSequence>(BASE,"SEVERE_ERR_PLUGIN_SUBORDINATE_DELETE_PLUGIN_EXCEPTION_115",PLUGIN,SEVERE_ERROR,115, getClassLoader());

  /**
   * The subordinate delete plugin defined in configuration entry %s returned null when invoked for connection %d operation %s.  This is an illegal response, and processing on this operation will be terminated
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,CharSequence> ERR_PLUGIN_SUBORDINATE_DELETE_PLUGIN_RETURNED_NULL =
          new MessageDescriptor.Arg3<CharSequence,Number,CharSequence>(BASE,"SEVERE_ERR_PLUGIN_SUBORDINATE_DELETE_PLUGIN_RETURNED_NULL_116",PLUGIN,SEVERE_ERROR,116, getClassLoader());


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
            Class<?> c = Class.forName("org.opends.messages.PluginMessages");

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
      cl = PluginMessages.class.getClassLoader();
    }
    return cl;
  }
}
