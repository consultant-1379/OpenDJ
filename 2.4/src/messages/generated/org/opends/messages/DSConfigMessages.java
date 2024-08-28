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
public final class DSConfigMessages {

  /** Base property for resource bundle containing messages */
  private static final String BASE = "messages/dsconfig";

  private static ClassLoader webstartClassLoader;

  // Prevent instantiation.
  private DSConfigMessages() {
    // Do nothing.
  }

  /**
   * Select one or more %s for the "%s" property:
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_EDITOR_PROMPT_SELECT_COMPONENT_MULTI =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_EDITOR_PROMPT_SELECT_COMPONENT_MULTI_127",DSCONFIG,INFORMATION,127, getClassLoader());

  /**
   * Select a %s for the "%s" property:
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_EDITOR_PROMPT_SELECT_COMPONENT_SINGLE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_EDITOR_PROMPT_SELECT_COMPONENT_SINGLE_128",DSCONFIG,INFORMATION,128, getClassLoader());

  /**
   * The "%s" property references the following %s:
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_EDITOR_HEADING_COMPONENT_SUMMARY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_EDITOR_HEADING_COMPONENT_SUMMARY_129",DSCONFIG,INFORMATION,129, getClassLoader());

  /**
   * Select the %s you wish to add:
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_EDITOR_PROMPT_SELECT_COMPONENTS_ADD =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_EDITOR_PROMPT_SELECT_COMPONENTS_ADD_130",DSCONFIG,INFORMATION,130, getClassLoader());

  /**
   * Add all %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_EDITOR_OPTION_ADD_ALL_COMPONENTS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_EDITOR_OPTION_ADD_ALL_COMPONENTS_131",DSCONFIG,INFORMATION,131, getClassLoader());

  /**
   * Select the %s you wish to remove:
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_EDITOR_PROMPT_SELECT_COMPONENTS_REMOVE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_EDITOR_PROMPT_SELECT_COMPONENTS_REMOVE_132",DSCONFIG,INFORMATION,132, getClassLoader());

  /**
   * Change it to the default %s: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_EDITOR_OPTION_CHANGE_TO_DEFAULT_COMPONENT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_EDITOR_OPTION_CHANGE_TO_DEFAULT_COMPONENT_133",DSCONFIG,INFORMATION,133, getClassLoader());

  /**
   * Change it to the %s: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_EDITOR_OPTION_CHANGE_TO_COMPONENT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_EDITOR_OPTION_CHANGE_TO_COMPONENT_134",DSCONFIG,INFORMATION,134, getClassLoader());

  /**
   * The referenced %s called "%s" must be enabled so that it can be used with this %s. Do you want to enable it?
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> INFO_EDITOR_PROMPT_ENABLED_REFERENCED_COMPONENT =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"INFO_EDITOR_PROMPT_ENABLED_REFERENCED_COMPONENT_135",DSCONFIG,INFORMATION,135, getClassLoader());

  /**
   * The modifications to the %s cannot be made because it contains a reference to a disabled %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SET_REFERENCED_COMPONENT_DISABLED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_SET_REFERENCED_COMPONENT_DISABLED_136",DSCONFIG,SEVERE_ERROR,136, getClassLoader());

  /**
   * The %s cannot be created because it contains a reference to a disabled %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_CREATE_REFERENCED_COMPONENT_DISABLED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_CREATE_REFERENCED_COMPONENT_DISABLED_137",DSCONFIG,SEVERE_ERROR,137, getClassLoader());

  /**
   * The %s could not be created because the following mandatory property was not defined:
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CREATE_HEADING_MMPE_SINGLE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CREATE_HEADING_MMPE_SINGLE_138",DSCONFIG,SEVERE_ERROR,138, getClassLoader());

  /**
   * The %s could not be created because the following mandatory properties were not defined:
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CREATE_HEADING_MMPE_PLURAL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CREATE_HEADING_MMPE_PLURAL_139",DSCONFIG,SEVERE_ERROR,139, getClassLoader());

  /**
   * The %s could not be modified because the following mandatory property was not defined:
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MODIFY_HEADING_MMPE_SINGLE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_MODIFY_HEADING_MMPE_SINGLE_140",DSCONFIG,SEVERE_ERROR,140, getClassLoader());

  /**
   * The %s could not be modified because the following mandatory properties were not defined:
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_MODIFY_HEADING_MMPE_PLURAL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_MODIFY_HEADING_MMPE_PLURAL_141",DSCONFIG,SEVERE_ERROR,141, getClassLoader());

  /**
   * Would you like to edit the properties of the %s in order to resolve this problem?
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DSCFG_PROMPT_EDIT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DSCFG_PROMPT_EDIT_142",DSCONFIG,INFORMATION,142, getClassLoader());

  /**
   * The %s could not be decoded due to the following reason:
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_GET_HEADING_MODE_SINGLE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_GET_HEADING_MODE_SINGLE_143",DSCONFIG,SEVERE_ERROR,143, getClassLoader());

  /**
   * The %s could not be decoded due to the following reasons:
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_GET_HEADING_MODE_PLURAL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_GET_HEADING_MODE_PLURAL_144",DSCONFIG,SEVERE_ERROR,144, getClassLoader());

  /**
   * Create a new %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_EDITOR_OPTION_CREATE_A_NEW_COMPONENT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_EDITOR_OPTION_CREATE_A_NEW_COMPONENT_145",DSCONFIG,INFORMATION,145, getClassLoader());

  /**
   * The referenced %s called "%s" must be enabled so that it can be used with this %s. Do you want to edit its properties in order to enable it?
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> INFO_DSCFG_PROMPT_EDIT_TO_ENABLE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"INFO_DSCFG_PROMPT_EDIT_TO_ENABLE_146",DSCONFIG,INFORMATION,146, getClassLoader());

  /**
   * Custom %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DSCFG_CUSTOM_TYPE_OPTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DSCFG_CUSTOM_TYPE_OPTION_147",DSCONFIG,INFORMATION,147, getClassLoader());

  /**
   * A Custom %s with a user-defined implementation class
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DSCFG_CUSTOM_TYPE_SYNOPSIS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DSCFG_CUSTOM_TYPE_SYNOPSIS_148",DSCONFIG,INFORMATION,148, getClassLoader());

  /**
   * A Generic %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DSCFG_GENERIC_TYPE_SYNOPSIS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DSCFG_GENERIC_TYPE_SYNOPSIS_149",DSCONFIG,INFORMATION,149, getClassLoader());

  /**
   * Help: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DSCFG_CREATE_TYPE_HELP_HEADING =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DSCFG_CREATE_TYPE_HELP_HEADING_150",DSCONFIG,INFORMATION,150, getClassLoader());

  /**
   * The equivalent non-interactive command-line is:%n%s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DSCFG_NON_INTERACTIVE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DSCFG_NON_INTERACTIVE_151",DSCONFIG,INFORMATION,151, getClassLoader());

  /**
   * Display the equivalent non-interactive argument in the standard output when this command is run in interactive mode
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_DESCRIPTION_DISPLAY_EQUIVALENT =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_DESCRIPTION_DISPLAY_EQUIVALENT_152",DSCONFIG,INFORMATION,152, getClassLoader());

  /**
   * The full path to the file where the equivalent non-interactive commands will be written when this command is run in interactive mode
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_DESCRIPTION_EQUIVALENT_COMMAND_FILE_PATH =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_DESCRIPTION_EQUIVALENT_COMMAND_FILE_PATH_153",DSCONFIG,INFORMATION,153, getClassLoader());

  /**
   * An error occurred while attempting to write equivalent non-interactive command line to file %s.  Error details:  %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_DSCFG_ERROR_WRITING_EQUIVALENT_COMMAND_LINE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_DSCFG_ERROR_WRITING_EQUIVALENT_COMMAND_LINE_154",DSCONFIG,MILD_ERROR,154, getClassLoader());

  /**
   * Cannot write to file %s.  Verify that you have access rights to that file and that you provided the full path of the file
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_CANNOT_WRITE_EQUIVALENT_COMMAND_LINE_FILE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_CANNOT_WRITE_EQUIVALENT_COMMAND_LINE_FILE_155",DSCONFIG,SEVERE_ERROR,155, getClassLoader());

  /**
   * The specified path %s to write the equivalent command is a directory.  You must specify a path to a file
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_EQUIVALENT_COMMAND_LINE_FILE_DIRECTORY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_EQUIVALENT_COMMAND_LINE_FILE_DIRECTORY_156",DSCONFIG,SEVERE_ERROR,156, getClassLoader());

  /**
   * Unable to connect to the server at %s on port %s. Check this port is an administration port
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_DSCFG_ERROR_LDAP_FAILED_TO_CONNECT_WRONG_PORT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_LDAP_FAILED_TO_CONNECT_WRONG_PORT_157",DSCONFIG,SEVERE_ERROR,157, getClassLoader());

  /**
   * Unable to connect to the server at %s on port %s. In non-interactive mode, if the trustStore related parameters are not used, you must use the '--trustAll' option for remote connections
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_DSCFG_ERROR_LDAP_FAILED_TO_CONNECT_NOT_TRUSTED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_LDAP_FAILED_TO_CONNECT_NOT_TRUSTED_158",DSCONFIG,SEVERE_ERROR,158, getClassLoader());

  /**
   * The value %s for the %s property does not exist
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_DSCFG_ERROR_VALUE_DOES_NOT_EXIST =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_VALUE_DOES_NOT_EXIST_159",DSCONFIG,SEVERE_ERROR,159, getClassLoader());

  /**
   * Unable to continue since there are no available types of %s to choose from
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_ERROR_NO_AVAILABLE_TYPES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_NO_AVAILABLE_TYPES_160",DSCONFIG,SEVERE_ERROR,160, getClassLoader());

  /**
   * >>>> There is only one type of %s available: "%s". Are you sure that this is the correct one?
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_DSCFG_TYPE_PROMPT_SINGLE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_DSCFG_TYPE_PROMPT_SINGLE_161",DSCONFIG,INFORMATION,161, getClassLoader());

  /**
   * An error occurred while attempting to read the batch file : %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_ERROR_READING_BATCH_FILE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_DSCFG_ERROR_READING_BATCH_FILE_162",DSCONFIG,MILD_ERROR,162, getClassLoader());

  /**
   * %s session start date: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_DSCFG_SESSION_START_TIME_MESSAGE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_DSCFG_SESSION_START_TIME_MESSAGE_163",DSCONFIG,INFORMATION,163, getClassLoader());

  /**
   * Session operation number: %d
   */
  public static final MessageDescriptor.Arg1<Number> INFO_DSCFG_EQUIVALENT_COMMAND_LINE_SESSION_OPERATION_NUMBER =
          new MessageDescriptor.Arg1<Number>(BASE,"INFO_DSCFG_EQUIVALENT_COMMAND_LINE_SESSION_OPERATION_NUMBER_164",DSCONFIG,INFORMATION,164, getClassLoader());

  /**
   * The connection parameters could not be read due to the following error: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_ERROR_CANNOT_READ_CONNECTION_PARAMETERS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_CANNOT_READ_CONNECTION_PARAMETERS_1000",DSCONFIG,SEVERE_ERROR,1000, getClassLoader());

  /**
   * Unable to authenticate to the server as "%s"
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_ERROR_LDAP_SIMPLE_BIND_FAILED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_LDAP_SIMPLE_BIND_FAILED_1001",DSCONFIG,SEVERE_ERROR,1001, getClassLoader());

  /**
   * Unable to connect to the server at "%s" on port %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_DSCFG_ERROR_LDAP_FAILED_TO_CONNECT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_LDAP_FAILED_TO_CONNECT_1002",DSCONFIG,SEVERE_ERROR,1002, getClassLoader());

  /**
   * Unable to authenticate using simple authentication
   */
  public static final MessageDescriptor.Arg0 ERR_DSCFG_ERROR_LDAP_SIMPLE_BIND_NOT_SUPPORTED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_DSCFG_ERROR_LDAP_SIMPLE_BIND_NOT_SUPPORTED_1003",DSCONFIG,SEVERE_ERROR,1003, getClassLoader());

  /**
   * Creates %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DSCFG_DESCRIPTION_SUBCMD_CREATE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DSCFG_DESCRIPTION_SUBCMD_CREATE_1004",DSCONFIG,INFORMATION,1004, getClassLoader());

  /**
   * Deletes %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DSCFG_DESCRIPTION_SUBCMD_DELETE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DSCFG_DESCRIPTION_SUBCMD_DELETE_1005",DSCONFIG,INFORMATION,1005, getClassLoader());

  /**
   * Lists existing %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DSCFG_DESCRIPTION_SUBCMD_LIST =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DSCFG_DESCRIPTION_SUBCMD_LIST_1006",DSCONFIG,INFORMATION,1006, getClassLoader());

  /**
   * Shows %s properties
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DSCFG_DESCRIPTION_SUBCMD_GETPROP =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DSCFG_DESCRIPTION_SUBCMD_GETPROP_1007",DSCONFIG,INFORMATION,1007, getClassLoader());

  /**
   * Modifies %s properties
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DSCFG_DESCRIPTION_SUBCMD_SETPROP =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DSCFG_DESCRIPTION_SUBCMD_SETPROP_1008",DSCONFIG,INFORMATION,1008, getClassLoader());

  /**
   * A sub-command must be specified
   */
  public static final MessageDescriptor.Arg0 ERR_DSCFG_ERROR_MISSING_SUBCOMMAND =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_DSCFG_ERROR_MISSING_SUBCOMMAND_1009",DSCONFIG,SEVERE_ERROR,1009, getClassLoader());

  /**
   * The type of %s which should be created. The value for TYPE can be one of: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_DSCFG_DESCRIPTION_TYPE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_DSCFG_DESCRIPTION_TYPE_1010",DSCONFIG,INFORMATION,1010, getClassLoader());

  /**
   * No password was specified for administrator "%s"
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_ERROR_NO_PASSWORD =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_NO_PASSWORD_1011",DSCONFIG,SEVERE_ERROR,1011, getClassLoader());

  /**
   * The property "%s" is not a recognized property of %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_DSCFG_ERROR_PROPERTY_UNRECOGNIZED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_PROPERTY_UNRECOGNIZED_1012",DSCONFIG,SEVERE_ERROR,1012, getClassLoader());

  /**
   * The value "%s" is not a valid value for the %s property "%s" which has the following syntax: %s
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> ERR_DSCFG_ERROR_PROPERTY_INVALID_VALUE =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_PROPERTY_INVALID_VALUE_1013",DSCONFIG,SEVERE_ERROR,1013, getClassLoader());

  /**
   * The %s property "%s" is read-only and cannot be modified
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_DSCFG_ERROR_PROPERTY_READ_ONLY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_PROPERTY_READ_ONLY_1014",DSCONFIG,SEVERE_ERROR,1014, getClassLoader());

  /**
   * The %s property "%s" is mandatory and must be specified
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_DSCFG_ERROR_PROPERTY_MANDATORY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_PROPERTY_MANDATORY_1015",DSCONFIG,SEVERE_ERROR,1015, getClassLoader());

  /**
   * It is not possible to specify multiple values for the %s property "%s" as it is single-valued
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_DSCFG_ERROR_PROPERTY_SINGLE_VALUED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_PROPERTY_SINGLE_VALUED_1016",DSCONFIG,SEVERE_ERROR,1016, getClassLoader());

  /**
   * Describes managed objects and their properties
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_DESCRIPTION_SUBCMD_HELPPROP =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_DESCRIPTION_SUBCMD_HELPPROP_1017",DSCONFIG,INFORMATION,1017, getClassLoader());

  /**
   * Component
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_HEADING_COMPONENT_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_HEADING_COMPONENT_NAME_1018",DSCONFIG,INFORMATION,1018, getClassLoader());

  /**
   * Property
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_HEADING_PROPERTY_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_HEADING_PROPERTY_NAME_1019",DSCONFIG,INFORMATION,1019, getClassLoader());

  /**
   * Value(s)
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_HEADING_PROPERTY_VALUE =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_HEADING_PROPERTY_VALUE_1020",DSCONFIG,INFORMATION,1020, getClassLoader());

  /**
   * Syntax
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_HEADING_PROPERTY_SYNTAX =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_HEADING_PROPERTY_SYNTAX_1021",DSCONFIG,INFORMATION,1021, getClassLoader());

  /**
   * Options
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_HEADING_PROPERTY_OPTIONS =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_HEADING_PROPERTY_OPTIONS_1022",DSCONFIG,INFORMATION,1022, getClassLoader());

  /**
   * Default
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_HEADING_PROPERTY_DEFAULT =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_HEADING_PROPERTY_DEFAULT_1023",DSCONFIG,INFORMATION,1023, getClassLoader());

  /**
   * Description
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_HEADING_PROPERTY_DESCRIPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_HEADING_PROPERTY_DESCRIPTION_1024",DSCONFIG,INFORMATION,1024, getClassLoader());

  /**
   * See detailed help
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_DESCRIPTION_PROPERTY_SYNTAX_HELP =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_DESCRIPTION_PROPERTY_SYNTAX_HELP_1025",DSCONFIG,INFORMATION,1025, getClassLoader());

  /**
   * The parent %s could not be retrieved because its type could not be determined. This is probably due to the %s having an invalid LDAP entry. Check that the %s has the correct object classes
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_DSCFG_ERROR_GET_PARENT_DDE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_GET_PARENT_DDE_1026",DSCONFIG,SEVERE_ERROR,1026, getClassLoader());

  /**
   * The parent %s could not be retrieved because of the reasons listed below:
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_ERROR_GET_PARENT_MODE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_GET_PARENT_MODE_1027",DSCONFIG,SEVERE_ERROR,1027, getClassLoader());

  /**
   * The parent %s does not exist
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_ERROR_GET_PARENT_MONFE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_GET_PARENT_MONFE_1028",DSCONFIG,SEVERE_ERROR,1028, getClassLoader());

  /**
   * The parent %s could not be retrieved because you do not have the correct authorization
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_ERROR_GET_PARENT_AUTHZ =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_GET_PARENT_AUTHZ_1029",DSCONFIG,SEVERE_ERROR,1029, getClassLoader());

  /**
   * The parent %s could not be retrieved due to a communications problem: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_DSCFG_ERROR_GET_PARENT_CE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_GET_PARENT_CE_1030",DSCONFIG,SEVERE_ERROR,1030, getClassLoader());

  /**
   * The parent %s could not be retrieved because another client is currently making conflicting configuration changes
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_ERROR_GET_PARENT_CME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_GET_PARENT_CME_1031",DSCONFIG,SEVERE_ERROR,1031, getClassLoader());

  /**
   * The %s could not be created because the following mandatory properties must be defined:
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_ERROR_CREATE_MMPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_CREATE_MMPE_1032",DSCONFIG,SEVERE_ERROR,1032, getClassLoader());

  /**
   * The %s could not be created because there is already an existing one with the same name
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_ERROR_CREATE_MOAEE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_CREATE_MOAEE_1033",DSCONFIG,SEVERE_ERROR,1033, getClassLoader());

  /**
   * The %s could not be created because you do not have the correct authorization
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_ERROR_CREATE_AUTHZ =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_CREATE_AUTHZ_1034",DSCONFIG,SEVERE_ERROR,1034, getClassLoader());

  /**
   * The %s could not be created due to a communications problem: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_DSCFG_ERROR_CREATE_CE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_CREATE_CE_1035",DSCONFIG,SEVERE_ERROR,1035, getClassLoader());

  /**
   * The %s could not be created because another client is currently making conflicting configuration changes
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_ERROR_CREATE_CME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_CREATE_CME_1036",DSCONFIG,SEVERE_ERROR,1036, getClassLoader());

  /**
   * The %s could not be deleted because it does not exist
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_ERROR_DELETE_MONFE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_DELETE_MONFE_1038",DSCONFIG,SEVERE_ERROR,1038, getClassLoader());

  /**
   * The %s could not be deleted because you do not have the correct authorization
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_ERROR_DELETE_AUTHZ =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_DELETE_AUTHZ_1039",DSCONFIG,SEVERE_ERROR,1039, getClassLoader());

  /**
   * The %s could not be deleted due to a communications problem: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_DSCFG_ERROR_DELETE_CE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_DELETE_CE_1041",DSCONFIG,SEVERE_ERROR,1041, getClassLoader());

  /**
   * The %s could not be deleted because another client is currently making conflicting configuration changes
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_ERROR_DELETE_CME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_DELETE_CME_1042",DSCONFIG,SEVERE_ERROR,1042, getClassLoader());

  /**
   * The %s could not be retrieved because its type could not be determined. This is probably due to the %s having an invalid LDAP entry. Check that the %s object classes are correct
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_DSCFG_ERROR_GET_CHILD_DDE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_GET_CHILD_DDE_1043",DSCONFIG,SEVERE_ERROR,1043, getClassLoader());

  /**
   * The %s could not be retrieved because of the reasons listed below:
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_ERROR_GET_CHILD_MODE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_GET_CHILD_MODE_1044",DSCONFIG,SEVERE_ERROR,1044, getClassLoader());

  /**
   * The %s does not exist
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_ERROR_GET_CHILD_MONFE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_GET_CHILD_MONFE_1045",DSCONFIG,SEVERE_ERROR,1045, getClassLoader());

  /**
   * The %s could not be accessed because you do not have the correct authorization
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_ERROR_GET_CHILD_AUTHZ =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_GET_CHILD_AUTHZ_1046",DSCONFIG,SEVERE_ERROR,1046, getClassLoader());

  /**
   * The %s could not be accessed due to a communications problem: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_DSCFG_ERROR_GET_CHILD_CE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_GET_CHILD_CE_1047",DSCONFIG,SEVERE_ERROR,1047, getClassLoader());

  /**
   * The %s could not be accessed because another client is currently making conflicting configuration changes
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_ERROR_GET_CHILD_CME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_GET_CHILD_CME_1048",DSCONFIG,SEVERE_ERROR,1048, getClassLoader());

  /**
   * The %s could not be modified because it does not exist
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_ERROR_MODIFY_MONFE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_MODIFY_MONFE_1049",DSCONFIG,SEVERE_ERROR,1049, getClassLoader());

  /**
   * The %s could not be modified because you do not have the correct authorization
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_ERROR_MODIFY_AUTHZ =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_MODIFY_AUTHZ_1050",DSCONFIG,SEVERE_ERROR,1050, getClassLoader());

  /**
   * The %s could not be modified due to a communications problem: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_DSCFG_ERROR_MODIFY_CE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_MODIFY_CE_1051",DSCONFIG,SEVERE_ERROR,1051, getClassLoader());

  /**
   * The %s could not be modified because another client is currently making conflicting configuration changes
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_ERROR_MODIFY_CME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_MODIFY_CME_1052",DSCONFIG,SEVERE_ERROR,1052, getClassLoader());

  /**
   * The %s could not be retrieved because its type could not be determined. This is probably due to the %s having an invalid LDAP entry. Check that the %s object classes are correct
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_DSCFG_ERROR_LIST_DDE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_LIST_DDE_1054",DSCONFIG,SEVERE_ERROR,1054, getClassLoader());

  /**
   * The %s could not be retrieved because of the reasons listed below:
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_ERROR_LIST_MODE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_LIST_MODE_1055",DSCONFIG,SEVERE_ERROR,1055, getClassLoader());

  /**
   * The %s does not exist
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_ERROR_LIST_MONFE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_LIST_MONFE_1056",DSCONFIG,SEVERE_ERROR,1056, getClassLoader());

  /**
   * The %s could not be listed because you do not have the correct authorization
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_ERROR_LIST_AUTHZ =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_LIST_AUTHZ_1057",DSCONFIG,SEVERE_ERROR,1057, getClassLoader());

  /**
   * The %s could not be listed due to a communications problem: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_DSCFG_ERROR_LIST_CE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_LIST_CE_1058",DSCONFIG,SEVERE_ERROR,1058, getClassLoader());

  /**
   * The %s could not be listed because another client is currently making conflicting configuration changes
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_ERROR_LIST_CME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_LIST_CME_1059",DSCONFIG,SEVERE_ERROR,1059, getClassLoader());

  /**
   * The value(s) of the %s property "%s" could not be determined due to an unknown error: %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_DSCFG_ERROR_PROPERTY_UNKNOWN_ERROR =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_PROPERTY_UNKNOWN_ERROR_1060",DSCONFIG,SEVERE_ERROR,1060, getClassLoader());

  /**
   * The default value(s) of the %s property "%s" could not be determined due to the following reason: %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_DSCFG_ERROR_PROPERTY_DEFAULT_BEHAVIOR =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_PROPERTY_DEFAULT_BEHAVIOR_1061",DSCONFIG,SEVERE_ERROR,1061, getClassLoader());

  /**
   * The inherited default value(s) of the %s property "%s" could not be determined
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_DSCFG_ERROR_PROPERTY_INHERITED_DEFAULT_BEHAVIOR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_PROPERTY_INHERITED_DEFAULT_BEHAVIOR_1062",DSCONFIG,SEVERE_ERROR,1062, getClassLoader());

  /**
   * The property argument "%s" does not contain a name/value separator. The argument should have the following syntax: property:value
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_ERROR_NO_SEPARATOR_IN_PROPERTY_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_NO_SEPARATOR_IN_PROPERTY_VALUE_1063",DSCONFIG,SEVERE_ERROR,1063, getClassLoader());

  /**
   * The property argument "%s" does not contain a property name. The argument should have the following syntax: property:value
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_ERROR_NO_NAME_IN_PROPERTY_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_NO_NAME_IN_PROPERTY_VALUE_1064",DSCONFIG,SEVERE_ERROR,1064, getClassLoader());

  /**
   * The property argument "%s" does not contain a property value. The argument should have the following syntax: property:value
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_ERROR_NO_VALUE_IN_PROPERTY_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_NO_VALUE_IN_PROPERTY_VALUE_1065",DSCONFIG,SEVERE_ERROR,1065, getClassLoader());

  /**
   * The sub-type "%s" is not a recognized type of %s. It should be one of: %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_DSCFG_ERROR_SUB_TYPE_UNRECOGNIZED =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_SUB_TYPE_UNRECOGNIZED_1066",DSCONFIG,SEVERE_ERROR,1066, getClassLoader());

  /**
   * "%s" component type that cannot be used with category "%s"
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_DSCFG_ERROR_TYPE_UNRECOGNIZED_FOR_CATEGORY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_TYPE_UNRECOGNIZED_FOR_CATEGORY_1067",DSCONFIG,SEVERE_ERROR,1067, getClassLoader());

  /**
   * The property modification "%s" does not contain a name/value separator. The argument should have the following syntax: property[+|-]:value
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_ERROR_NO_SEPARATOR_IN_PROPERTY_MOD =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_NO_SEPARATOR_IN_PROPERTY_MOD_1068",DSCONFIG,SEVERE_ERROR,1068, getClassLoader());

  /**
   * The property modification "%s" does not contain a property name. The argument should have the following syntax: property[+|-]:value
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_ERROR_NO_NAME_IN_PROPERTY_MOD =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_NO_NAME_IN_PROPERTY_MOD_1069",DSCONFIG,SEVERE_ERROR,1069, getClassLoader());

  /**
   * The property modification "%s" does not contain a property value. The argument should have the following syntax: property[+|-]:value
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_ERROR_NO_VALUE_IN_PROPERTY_MOD =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_NO_VALUE_IN_PROPERTY_MOD_1070",DSCONFIG,SEVERE_ERROR,1070, getClassLoader());

  /**
   * The property modification "%s" is incompatible with another modification to the same property
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_ERROR_INCOMPATIBLE_PROPERTY_MOD =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_INCOMPATIBLE_PROPERTY_MOD_1071",DSCONFIG,SEVERE_ERROR,1071, getClassLoader());

  /**
   * The %s could not be retrieved because it was the wrong type of managed object: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_DSCFG_ERROR_WRONG_MANAGED_OBJECT_TYPE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_WRONG_MANAGED_OBJECT_TYPE_1072",DSCONFIG,SEVERE_ERROR,1072, getClassLoader());

  /**
   * The type of %s which should be created (Default: %s). The value for TYPE can be one of: %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> INFO_DSCFG_DESCRIPTION_TYPE_DEFAULT =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"INFO_DSCFG_DESCRIPTION_TYPE_DEFAULT_1073",DSCONFIG,INFORMATION,1073, getClassLoader());

  /**
   * Modifies the display output to show one property value per line
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_DESCRIPTION_RECORD =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_DESCRIPTION_RECORD_1074",DSCONFIG,INFORMATION,1074, getClassLoader());

  /**
   * Display time data using the specified unit. The value for UNIT can be one of ms, s, m, h, d, or w (milliseconds, seconds, minutes, hours, days, or weeks)
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_DESCRIPTION_UNIT_TIME =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_DESCRIPTION_UNIT_TIME_1078",DSCONFIG,INFORMATION,1078, getClassLoader());

  /**
   * Display size data using the specified unit. The value for UNIT can be one of b, kb, mb, gb, or tb (bytes, kilobytes, megabytes, gigabytes, or terabytes)
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_DESCRIPTION_UNIT_SIZE =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_DESCRIPTION_UNIT_SIZE_1079",DSCONFIG,INFORMATION,1079, getClassLoader());

  /**
   * The time unit "%s" is invalid. The valid time units are ms, s, m, h, d, or w (milliseconds, seconds, minutes, hours, days, or weeks)
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DSCFG_ERROR_TIME_UNIT_UNRECOGNIZED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DSCFG_ERROR_TIME_UNIT_UNRECOGNIZED_1080",DSCONFIG,INFORMATION,1080, getClassLoader());

  /**
   * The size unit "%s" is invalid. The valid size units are b, kb, mb, gb, or tb (bytes, kilobytes, megabytes, gigabytes, or terabytes)
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DSCFG_ERROR_SIZE_UNIT_UNRECOGNIZED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DSCFG_ERROR_SIZE_UNIT_UNRECOGNIZED_1081",DSCONFIG,INFORMATION,1081, getClassLoader());

  /**
   * Type
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_HEADING_COMPONENT_TYPE =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_HEADING_COMPONENT_TYPE_1082",DSCONFIG,INFORMATION,1082, getClassLoader());

  /**
   * Display subcommands relating to %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DSCFG_DESCRIPTION_SHOW_GROUP_USAGE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DSCFG_DESCRIPTION_SHOW_GROUP_USAGE_1083",DSCONFIG,INFORMATION,1083, getClassLoader());

  /**
   * Display all subcommands
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_DESCRIPTION_SHOW_GROUP_USAGE_ALL =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_DESCRIPTION_SHOW_GROUP_USAGE_ALL_1084",DSCONFIG,INFORMATION,1084, getClassLoader());

  /**
   * Display summary usage information
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_DESCRIPTION_SHOW_GROUP_USAGE_SUMMARY =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_DESCRIPTION_SHOW_GROUP_USAGE_SUMMARY_1085",DSCONFIG,INFORMATION,1085, getClassLoader());

  /**
   * The name of the %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DSCFG_DESCRIPTION_NAME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DSCFG_DESCRIPTION_NAME_1086",DSCONFIG,INFORMATION,1086, getClassLoader());

  /**
   * The name of a property to be displayed
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_DESCRIPTION_PROP =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_DESCRIPTION_PROP_1087",DSCONFIG,INFORMATION,1087, getClassLoader());

  /**
   * Assigns a value to a property where PROP is the name of the property and VALUE is the single value to be assigned. Specify the same property multiple times in order to assign more than one value to it
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_DESCRIPTION_PROP_VAL =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_DESCRIPTION_PROP_VAL_1088",DSCONFIG,INFORMATION,1088, getClassLoader());

  /**
   * Adds a single value to a property where PROP is the name of the property and VALUE is the single value to be added
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_DESCRIPTION_ADD_PROP_VAL =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_DESCRIPTION_ADD_PROP_VAL_1089",DSCONFIG,INFORMATION,1089, getClassLoader());

  /**
   * Removes a single value from a property where PROP is the name of the property and VALUE is the single value to be removed
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_DESCRIPTION_REMOVE_PROP_VAL =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_DESCRIPTION_REMOVE_PROP_VAL_1090",DSCONFIG,INFORMATION,1090, getClassLoader());

  /**
   * Resets a property back to its default values where PROP is the name of the property to be reset
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_DESCRIPTION_RESET_PROP =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_DESCRIPTION_RESET_PROP_1091",DSCONFIG,INFORMATION,1091, getClassLoader());

  /**
   * The type of components whose properties should be described. The value for TYPE must be one of the component types associated with the CATEGORY specified using the "--category" option
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_DESCRIPTION_HELP_TYPE =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_DESCRIPTION_HELP_TYPE_1092",DSCONFIG,INFORMATION,1092, getClassLoader());

  /**
   * The LDAP bind password was not specified and cannot be read interactively
   */
  public static final MessageDescriptor.Arg0 ERR_DSCFG_ERROR_BIND_PASSWORD_NONINTERACTIVE =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_DSCFG_ERROR_BIND_PASSWORD_NONINTERACTIVE_1093",DSCONFIG,SEVERE_ERROR,1093, getClassLoader());

  /**
   * Ignore non-existent %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DSCFG_DESCRIPTION_FORCE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DSCFG_DESCRIPTION_FORCE_1196",DSCONFIG,INFORMATION,1196, getClassLoader());

  /**
   * The %s property "%s" is mandatory cannot be reset. Use the "%s" option to specify a new value
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_DSCFG_ERROR_UNABLE_TO_RESET_MANDATORY_PROPERTY =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_UNABLE_TO_RESET_MANDATORY_PROPERTY_1200",DSCONFIG,SEVERE_ERROR,1200, getClassLoader());

  /**
   * "--%s %s" : the argument "--%s" reset the property to the default value. It cannot be used to set a property to a given value
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_DSCFG_ERROR_UNABLE_TO_RESET_PROPERTY_WITH_VALUE =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_UNABLE_TO_RESET_PROPERTY_WITH_VALUE_1201",DSCONFIG,SEVERE_ERROR,1201, getClassLoader());

  /**
   * The name "%s" is not a valid name for the %s which has the following syntax: %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_DSCFG_ERROR_ILLEGAL_NAME_SYNTAX =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_ILLEGAL_NAME_SYNTAX_1204",DSCONFIG,SEVERE_ERROR,1204, getClassLoader());

  /**
   * Empty names are not permitted for %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_ERROR_ILLEGAL_NAME_EMPTY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_ILLEGAL_NAME_EMPTY_1205",DSCONFIG,SEVERE_ERROR,1205, getClassLoader());

  /**
   * Blank names are not permitted for %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_ERROR_ILLEGAL_NAME_BLANK =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_ILLEGAL_NAME_BLANK_1206",DSCONFIG,SEVERE_ERROR,1206, getClassLoader());

  /**
   * The name "%s" is not a valid name for the %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_DSCFG_ERROR_ILLEGAL_NAME_UNKNOWN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_ILLEGAL_NAME_UNKNOWN_1207",DSCONFIG,SEVERE_ERROR,1207, getClassLoader());

  /**
   * The name of the new %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DSCFG_DESCRIPTION_NAME_CREATE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DSCFG_DESCRIPTION_NAME_CREATE_1208",DSCONFIG,INFORMATION,1208, getClassLoader());

  /**
   * The name of the new %s which will also be used as the value of the "%s" property: %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> INFO_DSCFG_DESCRIPTION_NAME_CREATE_EXT =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"INFO_DSCFG_DESCRIPTION_NAME_CREATE_EXT_1209",DSCONFIG,INFORMATION,1209, getClassLoader());

  /**
   * The property "%s" cannot be set as it is defined implicitly by the name of the %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_DSCFG_ERROR_UNABLE_TO_SET_NAMING_PROPERTY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_UNABLE_TO_SET_NAMING_PROPERTY_1210",DSCONFIG,SEVERE_ERROR,1210, getClassLoader());

  /**
   * Allows the configuration of advanced components and properties
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_DESCRIPTION_ADVANCED =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_DESCRIPTION_ADVANCED_1216",DSCONFIG,INFORMATION,1216, getClassLoader());

  /**
   * The argument "--%s" must be specified when this application is used non-interactively
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_ERROR_MISSING_NON_INTERACTIVE_ARG =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_MISSING_NON_INTERACTIVE_ARG_1223",DSCONFIG,SEVERE_ERROR,1223, getClassLoader());

  /**
   * The response could not be read from the console due to the following error: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_ERROR_CANNOT_READ_CONSOLE_INPUT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_CANNOT_READ_CONSOLE_INPUT_1224",DSCONFIG,SEVERE_ERROR,1224, getClassLoader());

  /**
   * >>>> Select the type of %s that you want to create:
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DSCFG_CREATE_TYPE_PROMPT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DSCFG_CREATE_TYPE_PROMPT_1225",DSCONFIG,INFORMATION,1225, getClassLoader());

  /**
   * >>>> Enter a name for the %s that you want to create:
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DSCFG_CREATE_NAME_PROMPT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DSCFG_CREATE_NAME_PROMPT_1226",DSCONFIG,INFORMATION,1226, getClassLoader());

  /**
   * There is already another %s with the name "%s"
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_DSCFG_ERROR_CREATE_NAME_ALREADY_EXISTS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_CREATE_NAME_ALREADY_EXISTS_1227",DSCONFIG,SEVERE_ERROR,1227, getClassLoader());

  /**
   * Type
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_DESCRIPTION_CREATE_HELP_HEADING_TYPE =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_DESCRIPTION_CREATE_HELP_HEADING_TYPE_1228",DSCONFIG,INFORMATION,1228, getClassLoader());

  /**
   * Description
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_DESCRIPTION_CREATE_HELP_HEADING_DESCR =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_DESCRIPTION_CREATE_HELP_HEADING_DESCR_1229",DSCONFIG,INFORMATION,1229, getClassLoader());

  /**
   * Unable to continue since there are no %s currently configured on the server
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_ERROR_FINDER_NO_CHILDREN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_FINDER_NO_CHILDREN_1230",DSCONFIG,SEVERE_ERROR,1230, getClassLoader());

  /**
   * Unable to continue because the only available %s was not selected
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_ERROR_FINDER_SINGLE_CHILD_REJECTED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_FINDER_SINGLE_CHILD_REJECTED_1231",DSCONFIG,SEVERE_ERROR,1231, getClassLoader());

  /**
   * >>>> There is only one %s: "%s". Are you sure that this is the correct one?
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_DSCFG_FINDER_PROMPT_SINGLE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_DSCFG_FINDER_PROMPT_SINGLE_1232",DSCONFIG,INFORMATION,1232, getClassLoader());

  /**
   * >>>> Select the %s from the following list:
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DSCFG_FINDER_PROMPT_MANY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DSCFG_FINDER_PROMPT_MANY_1233",DSCONFIG,INFORMATION,1233, getClassLoader());

  /**
   * Unable to continue since there is no such an object currently configured on the server
   */
  public static final MessageDescriptor.Arg0 ERR_DSCFG_ERROR_FINDER_NO_CHILDREN_NULL =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_DSCFG_ERROR_FINDER_NO_CHILDREN_NULL_1234",DSCONFIG,SEVERE_ERROR,1234, getClassLoader());

  /**
   * Enter choice [1 - %d]:
   */
  public static final MessageDescriptor.Arg1<Number> INFO_DSCFG_GENERAL_CHOICE_PROMPT_NOHELP =
          new MessageDescriptor.Arg1<Number>(BASE,"INFO_DSCFG_GENERAL_CHOICE_PROMPT_NOHELP_1237",DSCONFIG,INFORMATION,1237, getClassLoader());

  /**
   * Enter choice [1 - %d,  ? - help]:
   */
  public static final MessageDescriptor.Arg1<Number> INFO_DSCFG_GENERAL_CHOICE_PROMPT_HELP =
          new MessageDescriptor.Arg1<Number>(BASE,"INFO_DSCFG_GENERAL_CHOICE_PROMPT_HELP_1238",DSCONFIG,INFORMATION,1238, getClassLoader());

  /**
   * Invalid response. Please enter a value between 1 and %d
   */
  public static final MessageDescriptor.Arg1<Number> ERR_DSCFG_ERROR_GENERAL_CHOICE =
          new MessageDescriptor.Arg1<Number>(BASE,"SEVERE_ERR_DSCFG_ERROR_GENERAL_CHOICE_1239",DSCONFIG,SEVERE_ERROR,1239, getClassLoader());

  /**
   * one of the following values:
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_HELP_FIELD_ENUM =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_HELP_FIELD_ENUM_1254",DSCONFIG,INFORMATION,1254, getClassLoader());

  /**
   * undefined
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_HELP_FIELD_UNDEFINED =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_HELP_FIELD_UNDEFINED_1255",DSCONFIG,INFORMATION,1255, getClassLoader());

  /**
   * inherits from the property "%s" in the %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_DSCFG_HELP_FIELD_INHERITED_ABS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_DSCFG_HELP_FIELD_INHERITED_ABS_1256",DSCONFIG,INFORMATION,1256, getClassLoader());

  /**
   * inherits from the property "%s" in the parent %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_DSCFG_HELP_FIELD_INHERITED_PARENT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_DSCFG_HELP_FIELD_INHERITED_PARENT_1257",DSCONFIG,INFORMATION,1257, getClassLoader());

  /**
   * inherits from the property "%s" in this %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_DSCFG_HELP_FIELD_INHERITED_THIS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_DSCFG_HELP_FIELD_INHERITED_THIS_1258",DSCONFIG,INFORMATION,1258, getClassLoader());

  /**
   * The server must be restarted in order for changes to this property to take effect
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_HELP_FIELD_SERVER_RESTART =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_HELP_FIELD_SERVER_RESTART_1259",DSCONFIG,INFORMATION,1259, getClassLoader());

  /**
   * The %s must be restarted in order for changes to this property to take effect
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DSCFG_HELP_FIELD_COMPONENT_RESTART =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DSCFG_HELP_FIELD_COMPONENT_RESTART_1260",DSCONFIG,INFORMATION,1260, getClassLoader());

  /**
   * read-only - this property can only be specified when the %s is created
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DSCFG_HELP_FIELD_READ_ONLY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DSCFG_HELP_FIELD_READ_ONLY_1261",DSCONFIG,INFORMATION,1261, getClassLoader());

  /**
   * monitoring - this property is automatically generated by the server
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_HELP_FIELD_MONITORING =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_HELP_FIELD_MONITORING_1262",DSCONFIG,INFORMATION,1262, getClassLoader());

  /**
   * Property: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DSCFG_HELP_HEADING_PROPERTY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DSCFG_HELP_HEADING_PROPERTY_1263",DSCONFIG,INFORMATION,1263, getClassLoader());

  /**
   * Component name: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DSCFG_HELP_HEADING_COMPONENT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DSCFG_HELP_HEADING_COMPONENT_1264",DSCONFIG,INFORMATION,1264, getClassLoader());

  /**
   * Default behavior
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_HELP_HEADING_DEFAULT =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_HELP_HEADING_DEFAULT_1265",DSCONFIG,INFORMATION,1265, getClassLoader());

  /**
   * Mandatory
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_HELP_HEADING_MANDATORY =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_HELP_HEADING_MANDATORY_1266",DSCONFIG,INFORMATION,1266, getClassLoader());

  /**
   * Advanced
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_HELP_HEADING_ADVANCED =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_HELP_HEADING_ADVANCED_1267",DSCONFIG,INFORMATION,1267, getClassLoader());

  /**
   * Multi-valued
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_HELP_HEADING_MULTI_VALUED =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_HELP_HEADING_MULTI_VALUED_1268",DSCONFIG,INFORMATION,1268, getClassLoader());

  /**
   * Read-only
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_HELP_HEADING_READ_ONLY =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_HELP_HEADING_READ_ONLY_1269",DSCONFIG,INFORMATION,1269, getClassLoader());

  /**
   * Syntax
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_HELP_HEADING_SYNTAX =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_HELP_HEADING_SYNTAX_1270",DSCONFIG,INFORMATION,1270, getClassLoader());

  /**
   * Option Types:
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_HELP_DESCRIPTION_OPTION =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_HELP_DESCRIPTION_OPTION_1271",DSCONFIG,INFORMATION,1271, getClassLoader());

  /**
   * Property value(s) are readable
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_HELP_DESCRIPTION_READ =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_HELP_DESCRIPTION_READ_1272",DSCONFIG,INFORMATION,1272, getClassLoader());

  /**
   * Property value(s) are writable
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_HELP_DESCRIPTION_WRITE =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_HELP_DESCRIPTION_WRITE_1273",DSCONFIG,INFORMATION,1273, getClassLoader());

  /**
   * The property is mandatory
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_HELP_DESCRIPTION_MANDATORY =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_HELP_DESCRIPTION_MANDATORY_1274",DSCONFIG,INFORMATION,1274, getClassLoader());

  /**
   * The property is single-valued
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_HELP_DESCRIPTION_SINGLE_VALUED =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_HELP_DESCRIPTION_SINGLE_VALUED_1275",DSCONFIG,INFORMATION,1275, getClassLoader());

  /**
   * Administrative action is required for changes to take effect
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_HELP_DESCRIPTION_ADMIN_ACTION =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_HELP_DESCRIPTION_ADMIN_ACTION_1276",DSCONFIG,INFORMATION,1276, getClassLoader());

  /**
   * Are you sure that you want to create the %s?
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DSCFG_CONFIRM_CREATE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DSCFG_CONFIRM_CREATE_1277",DSCONFIG,INFORMATION,1277, getClassLoader());

  /**
   * Are you sure that you want to delete the %s?
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DSCFG_CONFIRM_DELETE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DSCFG_CONFIRM_DELETE_1278",DSCONFIG,INFORMATION,1278, getClassLoader());

  /**
   * Are you sure that you want to modify the %s?
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DSCFG_CONFIRM_MODIFY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DSCFG_CONFIRM_MODIFY_1279",DSCONFIG,INFORMATION,1279, getClassLoader());

  /**
   * The %s was created successfully
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DSCFG_CONFIRM_CREATE_SUCCESS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DSCFG_CONFIRM_CREATE_SUCCESS_1280",DSCONFIG,INFORMATION,1280, getClassLoader());

  /**
   * The %s was deleted successfully
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DSCFG_CONFIRM_DELETE_SUCCESS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DSCFG_CONFIRM_DELETE_SUCCESS_1281",DSCONFIG,INFORMATION,1281, getClassLoader());

  /**
   * The %s was modified successfully
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DSCFG_CONFIRM_MODIFY_SUCCESS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DSCFG_CONFIRM_MODIFY_SUCCESS_1282",DSCONFIG,INFORMATION,1282, getClassLoader());

  /**
   * The %s was not created
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DSCFG_CONFIRM_CREATE_FAIL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DSCFG_CONFIRM_CREATE_FAIL_1283",DSCONFIG,INFORMATION,1283, getClassLoader());

  /**
   * The %s was not deleted
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DSCFG_CONFIRM_DELETE_FAIL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DSCFG_CONFIRM_DELETE_FAIL_1284",DSCONFIG,INFORMATION,1284, getClassLoader());

  /**
   * The %s was not modified
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DSCFG_CONFIRM_MODIFY_FAIL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DSCFG_CONFIRM_MODIFY_FAIL_1285",DSCONFIG,INFORMATION,1285, getClassLoader());

  /**
   * The category of components whose properties should be described
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_DESCRIPTION_HELP_CATEGORY =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_DESCRIPTION_HELP_CATEGORY_1286",DSCONFIG,INFORMATION,1286, getClassLoader());

  /**
   * "%s" is not a recognized component category
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_ERROR_CATEGORY_UNRECOGNIZED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_CATEGORY_UNRECOGNIZED_1287",DSCONFIG,SEVERE_ERROR,1287, getClassLoader());

  /**
   * "%s" is not a recognized component type in category "%s"
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_DSCFG_ERROR_CATEGORY_TYPE_UNRECOGNIZED =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_CATEGORY_TYPE_UNRECOGNIZED_1288",DSCONFIG,SEVERE_ERROR,1288, getClassLoader());

  /**
   * The property "%s" is not a recognized property
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_ERROR_PROPERTY_UNRECOGNIZED_NO_DEFN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_PROPERTY_UNRECOGNIZED_NO_DEFN_1289",DSCONFIG,SEVERE_ERROR,1289, getClassLoader());

  /**
   * Modifies the display output to show the inherited properties of components
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_DESCRIPTION_HELP_INHERITED =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_DESCRIPTION_HELP_INHERITED_1290",DSCONFIG,INFORMATION,1290, getClassLoader());

  /**
   * true
   */
  public static final MessageDescriptor.Arg0 INFO_VALUE_TRUE =
          new MessageDescriptor.Arg0(BASE,"INFO_VALUE_TRUE_1291",DSCONFIG,INFORMATION,1291, getClassLoader());

  /**
   * false
   */
  public static final MessageDescriptor.Arg0 INFO_VALUE_FALSE =
          new MessageDescriptor.Arg0(BASE,"INFO_VALUE_FALSE_1292",DSCONFIG,INFORMATION,1292, getClassLoader());

  /**
   * unlimited
   */
  public static final MessageDescriptor.Arg0 INFO_VALUE_UNLIMITED =
          new MessageDescriptor.Arg0(BASE,"INFO_VALUE_UNLIMITED_1293",DSCONFIG,INFORMATION,1293, getClassLoader());

  /**
   * Select a value for the "%s" property:
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_EDITOR_PROMPT_SELECT_VALUE_SINGLE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_EDITOR_PROMPT_SELECT_VALUE_SINGLE_1294",DSCONFIG,INFORMATION,1294, getClassLoader());

  /**
   * Select one or more values for the "%s" property:
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_EDITOR_PROMPT_SELECT_VALUE_MULTI =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_EDITOR_PROMPT_SELECT_VALUE_MULTI_1295",DSCONFIG,INFORMATION,1295, getClassLoader());

  /**
   * Syntax:
   */
  public static final MessageDescriptor.Arg0 INFO_EDITOR_HEADING_SYNTAX =
          new MessageDescriptor.Arg0(BASE,"INFO_EDITOR_HEADING_SYNTAX_1296",DSCONFIG,INFORMATION,1296, getClassLoader());

  /**
   * The "%s" property has the following values:
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_EDITOR_HEADING_VALUES_SUMMARY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_EDITOR_HEADING_VALUES_SUMMARY_1297",DSCONFIG,INFORMATION,1297, getClassLoader());

  /**
   * Select the values you wish to add:
   */
  public static final MessageDescriptor.Arg0 INFO_EDITOR_PROMPT_SELECT_VALUES_ADD =
          new MessageDescriptor.Arg0(BASE,"INFO_EDITOR_PROMPT_SELECT_VALUES_ADD_1299",DSCONFIG,INFORMATION,1299, getClassLoader());

  /**
   * Add all values
   */
  public static final MessageDescriptor.Arg0 INFO_EDITOR_OPTION_ADD_ALL_VALUES =
          new MessageDescriptor.Arg0(BASE,"INFO_EDITOR_OPTION_ADD_ALL_VALUES_1300",DSCONFIG,INFORMATION,1300, getClassLoader());

  /**
   * Select the values you wish to remove:
   */
  public static final MessageDescriptor.Arg0 INFO_EDITOR_PROMPT_SELECT_VALUES_REMOVE =
          new MessageDescriptor.Arg0(BASE,"INFO_EDITOR_PROMPT_SELECT_VALUES_REMOVE_1302",DSCONFIG,INFORMATION,1302, getClassLoader());

  /**
   * Do you want to modify the "%s" property?
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_EDITOR_PROMPT_MODIFY_MENU =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_EDITOR_PROMPT_MODIFY_MENU_1303",DSCONFIG,INFORMATION,1303, getClassLoader());

  /**
   * Add one or more values
   */
  public static final MessageDescriptor.Arg0 INFO_EDITOR_OPTION_ADD_ONE_OR_MORE_VALUES =
          new MessageDescriptor.Arg0(BASE,"INFO_EDITOR_OPTION_ADD_ONE_OR_MORE_VALUES_1304",DSCONFIG,INFORMATION,1304, getClassLoader());

  /**
   * Remove one or more values
   */
  public static final MessageDescriptor.Arg0 INFO_EDITOR_OPTION_REMOVE_ONE_OR_MORE_VALUES =
          new MessageDescriptor.Arg0(BASE,"INFO_EDITOR_OPTION_REMOVE_ONE_OR_MORE_VALUES_1305",DSCONFIG,INFORMATION,1305, getClassLoader());

  /**
   * Remove all values
   */
  public static final MessageDescriptor.Arg0 INFO_EDITOR_OPTION_REMOVE_ALL_VALUES =
          new MessageDescriptor.Arg0(BASE,"INFO_EDITOR_OPTION_REMOVE_ALL_VALUES_1306",DSCONFIG,INFORMATION,1306, getClassLoader());

  /**
   * Revert changes
   */
  public static final MessageDescriptor.Arg0 INFO_EDITOR_OPTION_REVERT_CHANGES =
          new MessageDescriptor.Arg0(BASE,"INFO_EDITOR_OPTION_REVERT_CHANGES_1307",DSCONFIG,INFORMATION,1307, getClassLoader());

  /**
   * Use the default behavior: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_EDITOR_OPTION_USE_DEFAULT_ALIAS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_EDITOR_OPTION_USE_DEFAULT_ALIAS_1308",DSCONFIG,INFORMATION,1308, getClassLoader());

  /**
   * Use the inherited default behavior: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_EDITOR_OPTION_USE_DEFAULT_INHERITED_ALIAS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_EDITOR_OPTION_USE_DEFAULT_INHERITED_ALIAS_1309",DSCONFIG,INFORMATION,1309, getClassLoader());

  /**
   * Use the inherited default behavior: undefined
   */
  public static final MessageDescriptor.Arg0 INFO_EDITOR_OPTION_USE_DEFAULT_INHERITED_ALIAS_UNDEFINED =
          new MessageDescriptor.Arg0(BASE,"INFO_EDITOR_OPTION_USE_DEFAULT_INHERITED_ALIAS_UNDEFINED_1310",DSCONFIG,INFORMATION,1310, getClassLoader());

  /**
   * Leave undefined
   */
  public static final MessageDescriptor.Arg0 INFO_EDITOR_OPTION_LEAVE_UNDEFINED =
          new MessageDescriptor.Arg0(BASE,"INFO_EDITOR_OPTION_LEAVE_UNDEFINED_1311",DSCONFIG,INFORMATION,1311, getClassLoader());

  /**
   * Use the value: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_EDITOR_OPTION_USE_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_EDITOR_OPTION_USE_VALUE_1312",DSCONFIG,INFORMATION,1312, getClassLoader());

  /**
   * Use the default value: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_EDITOR_OPTION_USE_DEFAULT_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_EDITOR_OPTION_USE_DEFAULT_VALUE_1313",DSCONFIG,INFORMATION,1313, getClassLoader());

  /**
   * Use the inherited default value: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_EDITOR_OPTION_USE_INHERITED_DEFAULT_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_EDITOR_OPTION_USE_INHERITED_DEFAULT_VALUE_1314",DSCONFIG,INFORMATION,1314, getClassLoader());

  /**
   * Use these values
   */
  public static final MessageDescriptor.Arg0 INFO_EDITOR_OPTION_USE_VALUES =
          new MessageDescriptor.Arg0(BASE,"INFO_EDITOR_OPTION_USE_VALUES_1315",DSCONFIG,INFORMATION,1315, getClassLoader());

  /**
   * Use these default values
   */
  public static final MessageDescriptor.Arg0 INFO_EDITOR_OPTION_USE_DEFAULT_VALUES =
          new MessageDescriptor.Arg0(BASE,"INFO_EDITOR_OPTION_USE_DEFAULT_VALUES_1316",DSCONFIG,INFORMATION,1316, getClassLoader());

  /**
   * Use these inherited default values
   */
  public static final MessageDescriptor.Arg0 INFO_EDITOR_OPTION_USE_INHERITED_DEFAULT_VALUES =
          new MessageDescriptor.Arg0(BASE,"INFO_EDITOR_OPTION_USE_INHERITED_DEFAULT_VALUES_1317",DSCONFIG,INFORMATION,1317, getClassLoader());

  /**
   * Keep the default behavior: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_EDITOR_OPTION_KEEP_DEFAULT_ALIAS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_EDITOR_OPTION_KEEP_DEFAULT_ALIAS_1318",DSCONFIG,INFORMATION,1318, getClassLoader());

  /**
   * Keep the inherited default behavior: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_EDITOR_OPTION_KEEP_DEFAULT_INHERITED_ALIAS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_EDITOR_OPTION_KEEP_DEFAULT_INHERITED_ALIAS_1319",DSCONFIG,INFORMATION,1319, getClassLoader());

  /**
   * Keep the inherited default behavior: undefined
   */
  public static final MessageDescriptor.Arg0 INFO_EDITOR_OPTION_KEEP_DEFAULT_INHERITED_ALIAS_UNDEFINED =
          new MessageDescriptor.Arg0(BASE,"INFO_EDITOR_OPTION_KEEP_DEFAULT_INHERITED_ALIAS_UNDEFINED_1320",DSCONFIG,INFORMATION,1320, getClassLoader());

  /**
   * Keep the value: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_EDITOR_OPTION_KEEP_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_EDITOR_OPTION_KEEP_VALUE_1321",DSCONFIG,INFORMATION,1321, getClassLoader());

  /**
   * Keep the default value: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_EDITOR_OPTION_KEEP_DEFAULT_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_EDITOR_OPTION_KEEP_DEFAULT_VALUE_1322",DSCONFIG,INFORMATION,1322, getClassLoader());

  /**
   * Keep the inherited default value: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_EDITOR_OPTION_KEEP_INHERITED_DEFAULT_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_EDITOR_OPTION_KEEP_INHERITED_DEFAULT_VALUE_1323",DSCONFIG,INFORMATION,1323, getClassLoader());

  /**
   * Keep these values
   */
  public static final MessageDescriptor.Arg0 INFO_EDITOR_OPTION_KEEP_VALUES =
          new MessageDescriptor.Arg0(BASE,"INFO_EDITOR_OPTION_KEEP_VALUES_1324",DSCONFIG,INFORMATION,1324, getClassLoader());

  /**
   * Keep these default values
   */
  public static final MessageDescriptor.Arg0 INFO_EDITOR_OPTION_KEEP_DEFAULT_VALUES =
          new MessageDescriptor.Arg0(BASE,"INFO_EDITOR_OPTION_KEEP_DEFAULT_VALUES_1325",DSCONFIG,INFORMATION,1325, getClassLoader());

  /**
   * Keep these inherited default values
   */
  public static final MessageDescriptor.Arg0 INFO_EDITOR_OPTION_KEEP_INHERITED_DEFAULT_VALUES =
          new MessageDescriptor.Arg0(BASE,"INFO_EDITOR_OPTION_KEEP_INHERITED_DEFAULT_VALUES_1326",DSCONFIG,INFORMATION,1326, getClassLoader());

  /**
   * Reset to the default behavior: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_EDITOR_OPTION_RESET_DEFAULT_ALIAS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_EDITOR_OPTION_RESET_DEFAULT_ALIAS_1327",DSCONFIG,INFORMATION,1327, getClassLoader());

  /**
   * Reset to the inherited default behavior: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_EDITOR_OPTION_RESET_DEFAULT_INHERITED_ALIAS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_EDITOR_OPTION_RESET_DEFAULT_INHERITED_ALIAS_1328",DSCONFIG,INFORMATION,1328, getClassLoader());

  /**
   * Reset to the inherited default behavior: undefined
   */
  public static final MessageDescriptor.Arg0 INFO_EDITOR_OPTION_RESET_DEFAULT_INHERITED_ALIAS_UNDEFINED =
          new MessageDescriptor.Arg0(BASE,"INFO_EDITOR_OPTION_RESET_DEFAULT_INHERITED_ALIAS_UNDEFINED_1329",DSCONFIG,INFORMATION,1329, getClassLoader());

  /**
   * Reset to the default value: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_EDITOR_OPTION_RESET_DEFAULT_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_EDITOR_OPTION_RESET_DEFAULT_VALUE_1331",DSCONFIG,INFORMATION,1331, getClassLoader());

  /**
   * Reset to the inherited default value: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_EDITOR_OPTION_RESET_INHERITED_DEFAULT_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_EDITOR_OPTION_RESET_INHERITED_DEFAULT_VALUE_1332",DSCONFIG,INFORMATION,1332, getClassLoader());

  /**
   * Reset to the default values: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_EDITOR_OPTION_RESET_DEFAULT_VALUES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_EDITOR_OPTION_RESET_DEFAULT_VALUES_1334",DSCONFIG,INFORMATION,1334, getClassLoader());

  /**
   * Reset to the inherited default values: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_EDITOR_OPTION_RESET_INHERITED_DEFAULT_VALUES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_EDITOR_OPTION_RESET_INHERITED_DEFAULT_VALUES_1335",DSCONFIG,INFORMATION,1335, getClassLoader());

  /**
   * The "%s" property is undefined
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_EDITOR_HEADING_READ_ONLY_ALIAS_UNDEFINED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_EDITOR_HEADING_READ_ONLY_ALIAS_UNDEFINED_1336",DSCONFIG,INFORMATION,1336, getClassLoader());

  /**
   * The "%s" property is undefined: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_EDITOR_HEADING_READ_ONLY_ALIAS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_EDITOR_HEADING_READ_ONLY_ALIAS_1337",DSCONFIG,INFORMATION,1337, getClassLoader());

  /**
   * The "%s" property has the following value: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_EDITOR_HEADING_READ_ONLY_VALUE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_EDITOR_HEADING_READ_ONLY_VALUE_1338",DSCONFIG,INFORMATION,1338, getClassLoader());

  /**
   * The "%s" property has the following values:
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_EDITOR_HEADING_READ_ONLY_VALUES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_EDITOR_HEADING_READ_ONLY_VALUES_1339",DSCONFIG,INFORMATION,1339, getClassLoader());

  /**
   * This property is read-only and cannot be modified. Would you like to view its help documentation?
   */
  public static final MessageDescriptor.Arg0 INFO_EDITOR_PROMPT_READ_ONLY =
          new MessageDescriptor.Arg0(BASE,"INFO_EDITOR_PROMPT_READ_ONLY_1340",DSCONFIG,INFORMATION,1340, getClassLoader());

  /**
   * Change it to the default value: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_EDITOR_OPTION_CHANGE_TO_DEFAULT_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_EDITOR_OPTION_CHANGE_TO_DEFAULT_VALUE_1341",DSCONFIG,INFORMATION,1341, getClassLoader());

  /**
   * Change it to the value: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_EDITOR_OPTION_CHANGE_TO_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_EDITOR_OPTION_CHANGE_TO_VALUE_1342",DSCONFIG,INFORMATION,1342, getClassLoader());

  /**
   * Change the value
   */
  public static final MessageDescriptor.Arg0 INFO_EDITOR_OPTION_CHANGE_VALUE =
          new MessageDescriptor.Arg0(BASE,"INFO_EDITOR_OPTION_CHANGE_VALUE_1343",DSCONFIG,INFORMATION,1343, getClassLoader());

  /**
   * >>>> Configuring the "%s" property
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_EDITOR_HEADING_CONFIGURE_PROPERTY =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_EDITOR_HEADING_CONFIGURE_PROPERTY_1344",DSCONFIG,INFORMATION,1344, getClassLoader());

  /**
   * Enter a value for the "%s" property:
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_EDITOR_PROMPT_READ_FIRST_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_EDITOR_PROMPT_READ_FIRST_VALUE_1345",DSCONFIG,INFORMATION,1345, getClassLoader());

  /**
   * Enter a value for the "%s" property [continue]:
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_EDITOR_PROMPT_READ_FIRST_VALUE_OPTIONAL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_EDITOR_PROMPT_READ_FIRST_VALUE_OPTIONAL_1346",DSCONFIG,INFORMATION,1346, getClassLoader());

  /**
   * Enter another value for the "%s" property [continue]:
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_EDITOR_PROMPT_READ_NEXT_VALUE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_EDITOR_PROMPT_READ_NEXT_VALUE_1347",DSCONFIG,INFORMATION,1347, getClassLoader());

  /**
   * This property already contains the value "%s". Please enter a different value
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_EDITOR_READ_FIRST_DUPLICATE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_EDITOR_READ_FIRST_DUPLICATE_1348",DSCONFIG,SEVERE_ERROR,1348, getClassLoader());

  /**
   * This property already contains the value "%s". Please enter a different value, or press RETURN to continue
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_EDITOR_READ_NEXT_DUPLICATE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_EDITOR_READ_NEXT_DUPLICATE_1349",DSCONFIG,SEVERE_ERROR,1349, getClassLoader());

  /**
   * >>>> Configure the properties of the %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_EDITOR_HEADING_CONFIGURE_COMPONENT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_EDITOR_HEADING_CONFIGURE_COMPONENT_1350",DSCONFIG,INFORMATION,1350, getClassLoader());

  /**
   * finish - create the new %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_EDITOR_OPTION_FINISH_CREATE_COMPONENT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_EDITOR_OPTION_FINISH_CREATE_COMPONENT_1351",DSCONFIG,INFORMATION,1351, getClassLoader());

  /**
   * finish - apply any changes to the %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_EDITOR_OPTION_FINISH_MODIFY_COMPONENT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_EDITOR_OPTION_FINISH_MODIFY_COMPONENT_1352",DSCONFIG,INFORMATION,1352, getClassLoader());

  /**
   * f
   */
  public static final MessageDescriptor.Arg0 INFO_EDITOR_OPTION_FINISH_KEY =
          new MessageDescriptor.Arg0(BASE,"INFO_EDITOR_OPTION_FINISH_KEY_1353",DSCONFIG,INFORMATION,1353, getClassLoader());

  /**
   * >>>> Configuring the "%s" property (Continued)
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_EDITOR_HEADING_CONFIGURE_PROPERTY_CONT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_EDITOR_HEADING_CONFIGURE_PROPERTY_CONT_1354",DSCONFIG,INFORMATION,1354, getClassLoader());

  /**
   * >>>> Specify a name for the %s. This name will be used as the value for the "%s" property which has the following description:
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> INFO_DSCFG_CREATE_NAME_PROMPT_NAMING =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"INFO_DSCFG_CREATE_NAME_PROMPT_NAMING_1355",DSCONFIG,INFORMATION,1355, getClassLoader());

  /**
   * Enter a name for the %s that you want to create:
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DSCFG_CREATE_NAME_PROMPT_NAMING_CONT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DSCFG_CREATE_NAME_PROMPT_NAMING_CONT_1356",DSCONFIG,INFORMATION,1356, getClassLoader());

  /**
   * >>>> OpenDS configuration console main menu
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_HEADING_MAIN_MENU_TITLE =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_HEADING_MAIN_MENU_TITLE_1357",DSCONFIG,INFORMATION,1357, getClassLoader());

  /**
   * What do you want to configure?
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_HEADING_MAIN_MENU_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_HEADING_MAIN_MENU_PROMPT_1358",DSCONFIG,INFORMATION,1358, getClassLoader());

  /**
   * >>>> %s management menu
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DSCFG_HEADING_COMPONENT_MENU_TITLE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DSCFG_HEADING_COMPONENT_MENU_TITLE_1359",DSCONFIG,INFORMATION,1359, getClassLoader());

  /**
   * What would you like to do?
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_HEADING_COMPONENT_MENU_PROMPT =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_HEADING_COMPONENT_MENU_PROMPT_1360",DSCONFIG,INFORMATION,1360, getClassLoader());

  /**
   * Create a new %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DSCFG_OPTION_COMPONENT_MENU_CREATE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DSCFG_OPTION_COMPONENT_MENU_CREATE_1361",DSCONFIG,INFORMATION,1361, getClassLoader());

  /**
   * View and edit the %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DSCFG_OPTION_COMPONENT_MENU_MODIFY_SINGULAR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DSCFG_OPTION_COMPONENT_MENU_MODIFY_SINGULAR_1362",DSCONFIG,INFORMATION,1362, getClassLoader());

  /**
   * View and edit an existing %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DSCFG_OPTION_COMPONENT_MENU_MODIFY_PLURAL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DSCFG_OPTION_COMPONENT_MENU_MODIFY_PLURAL_1363",DSCONFIG,INFORMATION,1363, getClassLoader());

  /**
   * Delete an existing %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DSCFG_OPTION_COMPONENT_MENU_DELETE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DSCFG_OPTION_COMPONENT_MENU_DELETE_1364",DSCONFIG,INFORMATION,1364, getClassLoader());

  /**
   * List existing %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DSCFG_OPTION_COMPONENT_MENU_LIST_PLURAL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DSCFG_OPTION_COMPONENT_MENU_LIST_PLURAL_1365",DSCONFIG,INFORMATION,1365, getClassLoader());

  /**
   * Show the %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DSCFG_OPTION_COMPONENT_MENU_LIST_SINGULAR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DSCFG_OPTION_COMPONENT_MENU_LIST_SINGULAR_1366",DSCONFIG,INFORMATION,1366, getClassLoader());

  /**
   * Directory server hostname or IP address [%s]:
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DSCFG_PROMPT_HOST_NAME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DSCFG_PROMPT_HOST_NAME_1367",DSCONFIG,INFORMATION,1367, getClassLoader());

  /**
   * Directory server administration port number [%d]:
   */
  public static final MessageDescriptor.Arg1<Number> INFO_DSCFG_PROMPT_PORT_NUMBER =
          new MessageDescriptor.Arg1<Number>(BASE,"INFO_DSCFG_PROMPT_PORT_NUMBER_1368",DSCONFIG,INFORMATION,1368, getClassLoader());

  /**
   * Administrator user bind DN [%s]:
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DSCFG_PROMPT_BIND_DN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DSCFG_PROMPT_BIND_DN_1369",DSCONFIG,INFORMATION,1369, getClassLoader());

  /**
   * The hostname "%s" could not be resolved. Please check you have provided the correct address
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_BAD_HOST_NAME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_BAD_HOST_NAME_1370",DSCONFIG,SEVERE_ERROR,1370, getClassLoader());

  /**
   * Invalid port number "%s". Please enter a valid port number between 1 and 65535
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_BAD_PORT_NUMBER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_BAD_PORT_NUMBER_1371",DSCONFIG,SEVERE_ERROR,1371, getClassLoader());

  /**
   * Generic %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DSCFG_GENERIC_TYPE_OPTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DSCFG_GENERIC_TYPE_OPTION_1372",DSCONFIG,INFORMATION,1372, getClassLoader());

  /**
   * >>>> Specify OpenDS LDAP connection parameters
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_HEADING_CONNECTION_PARAMETERS =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_HEADING_CONNECTION_PARAMETERS_1373",DSCONFIG,INFORMATION,1373, getClassLoader());

  /**
   * How do you want to connect?
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_PROMPT_SECURITY_USE_SECURE_CTX =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_PROMPT_SECURITY_USE_SECURE_CTX_1374",DSCONFIG,INFORMATION,1374, getClassLoader());

  /**
   * LDAP with SSL
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_PROMPT_SECURITY_USE_SSL =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_PROMPT_SECURITY_USE_SSL_1375",DSCONFIG,INFORMATION,1375, getClassLoader());

  /**
   * LDAP with StartTLS
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_PROMPT_SECURITY_USE_START_TLS =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_PROMPT_SECURITY_USE_START_TLS_1376",DSCONFIG,INFORMATION,1376, getClassLoader());

  /**
   * Do you want to automatically trust the server certificate?
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_PROMPT_SECURITY_USE_TRUST_ALL =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_PROMPT_SECURITY_USE_TRUST_ALL_1377",DSCONFIG,INFORMATION,1377, getClassLoader());

  /**
   * Truststore path:
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_PROMPT_SECURITY_TRUSTSTORE_PATH =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_PROMPT_SECURITY_TRUSTSTORE_PATH_1378",DSCONFIG,INFORMATION,1378, getClassLoader());

  /**
   * Password for truststore '%s':
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DSCFG_PROMPT_SECURITY_TRUSTSTORE_PASSWORD =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DSCFG_PROMPT_SECURITY_TRUSTSTORE_PASSWORD_1379",DSCONFIG,INFORMATION,1379, getClassLoader());

  /**
   * Do you want to perform secure authentication (client side authentication)?
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_PROMPT_SECURITY_KEYSTORE_NEEDED =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_PROMPT_SECURITY_KEYSTORE_NEEDED_1380",DSCONFIG,INFORMATION,1380, getClassLoader());

  /**
   * Keystore path:
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_PROMPT_SECURITY_KEYSTORE_PATH =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_PROMPT_SECURITY_KEYSTORE_PATH_1381",DSCONFIG,INFORMATION,1381, getClassLoader());

  /**
   * Password for keystore '%s':
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DSCFG_PROMPT_SECURITY_KEYSTORE_PASSWORD =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DSCFG_PROMPT_SECURITY_KEYSTORE_PASSWORD_1382",DSCONFIG,INFORMATION,1382, getClassLoader());

  /**
   * Certificate nickname:
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_PROMPT_SECURITY_CERTIFICATE_NAME =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_PROMPT_SECURITY_CERTIFICATE_NAME_1383",DSCONFIG,INFORMATION,1383, getClassLoader());

  /**
   * The %s could not be created because of the following reason:
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_ERROR_CREATE_ORE_SINGLE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_CREATE_ORE_SINGLE_1384",DSCONFIG,SEVERE_ERROR,1384, getClassLoader());

  /**
   * The %s could not be created because of the following reasons:
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_ERROR_CREATE_ORE_PLURAL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_CREATE_ORE_PLURAL_1385",DSCONFIG,SEVERE_ERROR,1385, getClassLoader());

  /**
   * The %s could not be deleted because of the following reason:
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_ERROR_DELETE_ORE_SINGLE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_DELETE_ORE_SINGLE_1386",DSCONFIG,SEVERE_ERROR,1386, getClassLoader());

  /**
   * The %s could not be deleted because of the following reasons:
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_ERROR_DELETE_ORE_PLURAL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_DELETE_ORE_PLURAL_1387",DSCONFIG,SEVERE_ERROR,1387, getClassLoader());

  /**
   * The %s could not be modified because of the following reason:
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_ERROR_MODIFY_ORE_SINGLE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_MODIFY_ORE_SINGLE_1388",DSCONFIG,SEVERE_ERROR,1388, getClassLoader());

  /**
   * The %s could not be modified because of the following reasons:
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DSCFG_ERROR_MODIFY_ORE_PLURAL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_MODIFY_ORE_PLURAL_1389",DSCONFIG,SEVERE_ERROR,1389, getClassLoader());

  /**
   * LDAP
   */
  public static final MessageDescriptor.Arg0 INFO_DSCFG_PROMPT_SECURITY_LDAP =
          new MessageDescriptor.Arg0(BASE,"INFO_DSCFG_PROMPT_SECURITY_LDAP_1390",DSCONFIG,INFORMATION,1390, getClassLoader());

  /**
   * %d
   */
  public static final MessageDescriptor.Arg1<Number> INFO_DSCFG_PROMPT_SECURITY_PROTOCOL_DEFAULT_CHOICE =
          new MessageDescriptor.Arg1<Number>(BASE,"INFO_DSCFG_PROMPT_SECURITY_PROTOCOL_DEFAULT_CHOICE_1391",DSCONFIG,INFORMATION,1391, getClassLoader());

  /**
   * The provided path is not valid
   */
  public static final MessageDescriptor.Arg0 ERR_DSCFG_PROMPT_SECURITY_INVALID_FILE_PATH =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_DSCFG_PROMPT_SECURITY_INVALID_FILE_PATH_1392",DSCONFIG,SEVERE_ERROR,1392, getClassLoader());

  /**
   * Would you like to edit the properties of the %s again in order to resolve this problem?
   */
  public static final MessageDescriptor.Arg1<CharSequence> INFO_DSCFG_PROMPT_EDIT_AGAIN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"INFO_DSCFG_PROMPT_EDIT_AGAIN_1393",DSCONFIG,INFORMATION,1393, getClassLoader());

  /**
   * "%s" component type cannot be used with subcommand {%s}
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_DSCFG_ERROR_TYPE_UNRECOGNIZED_FOR_SUBCOMMAND =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_DSCFG_ERROR_TYPE_UNRECOGNIZED_FOR_SUBCOMMAND_1394",DSCONFIG,SEVERE_ERROR,1394, getClassLoader());


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
            Class<?> c = Class.forName("org.opends.messages.DSConfigMessages");

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
      cl = DSConfigMessages.class.getClassLoader();
    }
    return cl;
  }
}
