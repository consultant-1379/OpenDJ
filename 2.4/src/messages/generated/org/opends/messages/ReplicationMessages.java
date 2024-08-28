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
public final class ReplicationMessages {

  /** Base property for resource bundle containing messages */
  private static final String BASE = "messages/replication";

  private static ClassLoader webstartClassLoader;

  // Prevent instantiation.
  private ReplicationMessages() {
    // Do nothing.
  }

  /**
   * The configured DN is already used by another domain
   */
  public static final MessageDescriptor.Arg0 ERR_SYNC_INVALID_DN =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_SYNC_INVALID_DN_1",SYNC,MILD_ERROR,1, getClassLoader());

  /**
   * Invalid replication server configuration
   */
  public static final MessageDescriptor.Arg0 ERR_INVALID_CHANGELOG_SERVER =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_INVALID_CHANGELOG_SERVER_4",SYNC,MILD_ERROR,4, getClassLoader());

  /**
   * Replication Server failed to start because the hostname is unknown
   */
  public static final MessageDescriptor.Arg0 ERR_UNKNOWN_HOSTNAME =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_UNKNOWN_HOSTNAME_5",SYNC,MILD_ERROR,5, getClassLoader());

  /**
   * Replication Server failed to start : could not bind to the listen port : %d. Error : %s
   */
  public static final MessageDescriptor.Arg2<Number,CharSequence> ERR_COULD_NOT_BIND_CHANGELOG =
          new MessageDescriptor.Arg2<Number,CharSequence>(BASE,"MILD_ERR_COULD_NOT_BIND_CHANGELOG_6",SYNC,MILD_ERROR,6, getClassLoader());

  /**
   * Unknown operation type : %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_UNKNOWN_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_UNKNOWN_TYPE_7",SYNC,MILD_ERROR,7, getClassLoader());

  /**
   * Internal Error : Operation %s change number %s was not found in pending list
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_OPERATION_NOT_FOUND_IN_PENDING =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_OPERATION_NOT_FOUND_IN_PENDING_9",SYNC,MILD_ERROR,9, getClassLoader());

  /**
   * The replication server failed to start because the database %s could not be opened
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_COULD_NOT_INITIALIZE_DB =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_COULD_NOT_INITIALIZE_DB_10",SYNC,MILD_ERROR,10, getClassLoader());

  /**
   * The replication server failed to start because the database %s could not be read : %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_COULD_NOT_READ_DB =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_COULD_NOT_READ_DB_11",SYNC,MILD_ERROR,11, getClassLoader());

  /**
   * An Exception was caught while replaying operation %s : %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_EXCEPTION_REPLAYING_OPERATION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_EXCEPTION_REPLAYING_OPERATION_12",SYNC,MILD_ERROR,12, getClassLoader());

  /**
   * The replication server port must be defined
   */
  public static final MessageDescriptor.Arg0 ERR_NEED_CHANGELOG_PORT =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_NEED_CHANGELOG_PORT_13",SYNC,MILD_ERROR,13, getClassLoader());

  /**
   * Error %s when updating server state %s : %s base dn : %s
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> DEBUG_ERROR_UPDATING_RUV =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"DEBUG_ERROR_UPDATING_RUV_14",SYNC,DEBUG,14, getClassLoader());

  /**
   * Error %s when searching for server state %s : %s base dn : %s
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> ERR_ERROR_SEARCHING_RUV =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_ERROR_SEARCHING_RUV_15",SYNC,MILD_ERROR,15, getClassLoader());

  /**
   * Directory server DS(%d) was unable to connect to replication server %s for domain "%s". Please check that there is a replication server listening at this address
   */
  public static final MessageDescriptor.Arg3<Number,CharSequence,CharSequence> WARN_NO_CHANGELOG_SERVER_LISTENING =
          new MessageDescriptor.Arg3<Number,CharSequence,CharSequence>(BASE,"SEVERE_WARN_NO_CHANGELOG_SERVER_LISTENING_17",SYNC,SEVERE_WARNING,17, getClassLoader());

  /**
   * Found %d replication server(s) with up to date changes for suffix %s, in server id %s
   */
  public static final MessageDescriptor.Arg3<Number,CharSequence,CharSequence> NOTE_FOUND_CHANGELOGS_WITH_MY_CHANGES =
          new MessageDescriptor.Arg3<Number,CharSequence,CharSequence>(BASE,"NOTICE_FOUND_CHANGELOGS_WITH_MY_CHANGES_18",SYNC,NOTICE,18, getClassLoader());

  /**
   * More than one replication server should be configured
   */
  public static final MessageDescriptor.Arg0 NOTE_NEED_MORE_THAN_ONE_CHANGELOG_SERVER =
          new MessageDescriptor.Arg0(BASE,"NOTICE_NEED_MORE_THAN_ONE_CHANGELOG_SERVER_19",SYNC,NOTICE,19, getClassLoader());

  /**
   * Caught IOException while sending topology info (for update) on domain %s for %s server %s : %s
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> ERR_EXCEPTION_SENDING_TOPO_INFO =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_EXCEPTION_SENDING_TOPO_INFO_20",SYNC,SEVERE_ERROR,20, getClassLoader());

  /**
   * Error when searching old changes from the database for base DN %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CANNOT_RECOVER_CHANGES =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_CANNOT_RECOVER_CHANGES_21",SYNC,MILD_ERROR,21, getClassLoader());

  /**
   * Could not find a replication server that has seen all the local changes on suffix %s. Found %d replications server(s) not up to date. Going to replay changes
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> NOTE_COULD_NOT_FIND_CHANGELOG_WITH_MY_CHANGES =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"NOTICE_COULD_NOT_FIND_CHANGELOG_WITH_MY_CHANGES_22",SYNC,NOTICE,22, getClassLoader());

  /**
   * Directory server DS(%d) was unable to connect to any of the following replication servers for domain "%s": %s
   */
  public static final MessageDescriptor.Arg3<Number,CharSequence,CharSequence> WARN_COULD_NOT_FIND_CHANGELOG =
          new MessageDescriptor.Arg3<Number,CharSequence,CharSequence>(BASE,"SEVERE_WARN_COULD_NOT_FIND_CHANGELOG_23",SYNC,SEVERE_WARNING,23, getClassLoader());

  /**
   * Error closing Replication Server database %s :
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_EXCEPTION_CLOSING_DATABASE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_EXCEPTION_CLOSING_DATABASE_24",SYNC,NOTICE,24, getClassLoader());

  /**
   * Error trying to replay %s, operation could not be decoded :
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_EXCEPTION_DECODING_OPERATION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_EXCEPTION_DECODING_OPERATION_25",SYNC,SEVERE_ERROR,25, getClassLoader());

  /**
   * Error Trying to use the underlying database. The Replication Server is going to shut down
   */
  public static final MessageDescriptor.Arg0 ERR_CHANGELOG_SHUTDOWN_DATABASE_ERROR =
          new MessageDescriptor.Arg0(BASE,"FATAL_ERR_CHANGELOG_SHUTDOWN_DATABASE_ERROR_26",SYNC,FATAL_ERROR,26, getClassLoader());

  /**
   * A badly formatted DN was found in the list of database known by this Replication Server :%s. This Identifier will be ignored
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_IGNORE_BAD_DN_IN_DATABASE_IDENTIFIER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_IGNORE_BAD_DN_IN_DATABASE_IDENTIFIER_27",SYNC,SEVERE_ERROR,27, getClassLoader());

  /**
   * Error closing the Replication Server database :
   */
  public static final MessageDescriptor.Arg0 ERR_ERROR_CLOSING_CHANGELOG_ENV =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_ERROR_CLOSING_CHANGELOG_ENV_28",SYNC,SEVERE_ERROR,28, getClassLoader());

  /**
   * Error during the Replication Server database trimming or flush process. The Changelog service is going to shutdown
   */
  public static final MessageDescriptor.Arg0 ERR_EXCEPTION_CHANGELOG_TRIM_FLUSH =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_EXCEPTION_CHANGELOG_TRIM_FLUSH_29",SYNC,SEVERE_ERROR,29, getClassLoader());

  /**
   * Error in Replication Server handshake processing. Connection from/to %s is aborted
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_REPLICATION_SERVER_CONNECTION_ERROR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_REPLICATION_SERVER_CONNECTION_ERROR_30",SYNC,SEVERE_ERROR,30, getClassLoader());

  /**
   * %s has sent an unknown message. Closing the connection
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_UNKNOWN_MESSAGE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_UNKNOWN_MESSAGE_31",SYNC,SEVERE_ERROR,31, getClassLoader());

  /**
   * An unexpected error happened handling connection with %s.  This connection is going to be closed
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_WRITER_UNEXPECTED_EXCEPTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_WRITER_UNEXPECTED_EXCEPTION_32",SYNC,SEVERE_ERROR,32, getClassLoader());

  /**
   * In replication server %s: an unexpected error occurred while sending an ack to server id %s for change number %s in domain %s . This connection is going to be closed and reopened
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> ERR_RS_ERROR_SENDING_ACK =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_RS_ERROR_SENDING_ACK_33",SYNC,SEVERE_ERROR,33, getClassLoader());

  /**
   * An Exception was caught while receiving replication message : %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_EXCEPTION_RECEIVING_REPLICATION_MESSAGE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_EXCEPTION_RECEIVING_REPLICATION_MESSAGE_34",SYNC,SEVERE_ERROR,34, getClassLoader());

  /**
   * A loop was detected while replaying operation: %s error %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LOOP_REPLAYING_OPERATION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_LOOP_REPLAYING_OPERATION_35",SYNC,MILD_ERROR,35, getClassLoader());

  /**
   * An Exception was caught while testing existence or trying  to create the directory for the Replication Server database : %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_FILE_CHECK_CREATE_FAILED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_FILE_CHECK_CREATE_FAILED_36",SYNC,MILD_ERROR,36, getClassLoader());

  /**
   * List of replication servers to which this Replication Server should connect. Each value of this attribute should contain a values build with the hostname and the port number of the remote server separated with a ":"
   */
  public static final MessageDescriptor.Arg0 INFO_CHANGELOG_SERVER_ATTR =
          new MessageDescriptor.Arg0(BASE,"INFO_CHANGELOG_SERVER_ATTR_37",SYNC,INFORMATION,37, getClassLoader());

  /**
   * Server ID. Each Replication Server in the topology must be assigned a unique server ID in the topology
   */
  public static final MessageDescriptor.Arg0 INFO_SERVER_ID_ATTR =
          new MessageDescriptor.Arg0(BASE,"INFO_SERVER_ID_ATTR_38",SYNC,INFORMATION,38, getClassLoader());

  /**
   * Port number that the replication server will use to listen for connections from LDAP servers
   */
  public static final MessageDescriptor.Arg0 INFO_CHANGELOG_PORT_ATTR =
          new MessageDescriptor.Arg0(BASE,"INFO_CHANGELOG_PORT_ATTR_39",SYNC,INFORMATION,39, getClassLoader());

  /**
   * Receive window size of the replication server
   */
  public static final MessageDescriptor.Arg0 INFO_WINDOW_SIZE_ATTR =
          new MessageDescriptor.Arg0(BASE,"INFO_WINDOW_SIZE_ATTR_40",SYNC,INFORMATION,40, getClassLoader());

  /**
   * Receive queue size of the replication server. The replication servers will queue up to this number of messages in its memory queue and save the older messages to persistent storage. Using a larger size may improve performances when The replication delay is larger than this size but at the cost of using more memory
   */
  public static final MessageDescriptor.Arg0 INFO_QUEUE_SIZE_ATTR =
          new MessageDescriptor.Arg0(BASE,"INFO_QUEUE_SIZE_ATTR_41",SYNC,INFORMATION,41, getClassLoader());

  /**
   * Replication Server directory. The replication server will create all persistent storage below this path
   */
  public static final MessageDescriptor.Arg0 INFO_CHANGELOG_DIR_PATH_ATTR =
          new MessageDescriptor.Arg0(BASE,"INFO_CHANGELOG_DIR_PATH_ATTR_42",SYNC,INFORMATION,42, getClassLoader());

  /**
   * Replication Server Purge Delay, The replication Servers will keep all changes up to this amount of time before deleting them. This value defines the maximum age of a backup that can be restored because replication servers would not be able to refresh LDAP servers with older versions of the data. A zero value can be used to specify an infinite delay (or never purge)
   */
  public static final MessageDescriptor.Arg0 INFO_PURGE_DELAY_ATTR =
          new MessageDescriptor.Arg0(BASE,"INFO_PURGE_DELAY_ATTR_43",SYNC,INFORMATION,43, getClassLoader());

  /**
   * The current request is rejected due to an import or an export already in progress for the same data
   */
  public static final MessageDescriptor.Arg0 ERR_SIMULTANEOUS_IMPORT_EXPORT_REJECTED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_SIMULTANEOUS_IMPORT_EXPORT_REJECTED_44",SYNC,SEVERE_ERROR,44, getClassLoader());

  /**
   * On domain %s, initialization of server with serverId:%s has been requested from a server with an invalid serverId:%s. %s
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> ERR_INVALID_IMPORT_SOURCE =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_INVALID_IMPORT_SOURCE_45",SYNC,SEVERE_ERROR,45, getClassLoader());

  /**
   * Invalid target for the export
   */
  public static final MessageDescriptor.Arg0 ERR_INVALID_EXPORT_TARGET =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_INVALID_EXPORT_TARGET_46",SYNC,SEVERE_ERROR,46, getClassLoader());

  /**
   * Domain %s: the server with serverId=%s is unreachable
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_NO_REACHABLE_PEER_IN_THE_DOMAIN =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_NO_REACHABLE_PEER_IN_THE_DOMAIN_47",SYNC,SEVERE_ERROR,47, getClassLoader());

  /**
   * No domain matches the provided base DN '%s'
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_NO_MATCHING_DOMAIN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_NO_MATCHING_DOMAIN_48",SYNC,SEVERE_ERROR,48, getClassLoader());

  /**
   * Multiple domains match the base DN provided
   */
  public static final MessageDescriptor.Arg0 ERR_MULTIPLE_MATCHING_DOMAIN =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_MULTIPLE_MATCHING_DOMAIN_49",SYNC,SEVERE_ERROR,49, getClassLoader());

  /**
   * The provider class does not allow the operation requested
   */
  public static final MessageDescriptor.Arg0 ERR_INVALID_PROVIDER =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_INVALID_PROVIDER_50",SYNC,SEVERE_ERROR,50, getClassLoader());

  /**
   * The hostname %s could not be resolved as an IP address
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_COULD_NOT_SOLVE_HOSTNAME =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_COULD_NOT_SOLVE_HOSTNAME_51",SYNC,SEVERE_ERROR,51, getClassLoader());

  /**
   * Received a Null Msg from %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_READER_NULL_MSG =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_READER_NULL_MSG_52",SYNC,NOTICE,52, getClassLoader());

  /**
   * Exception when reading messages from %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_READER_EXCEPTION =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_READER_EXCEPTION_53",SYNC,NOTICE,53, getClassLoader());

  /**
   * In Replication server %s: servers %s and %s have the same ServerId : %d
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,Number> ERR_DUPLICATE_SERVER_ID =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,Number>(BASE,"SEVERE_ERR_DUPLICATE_SERVER_ID_54",SYNC,SEVERE_ERROR,54, getClassLoader());

  /**
   * In Replication server %s: replication servers %s and %s have the same ServerId : %d
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,Number> ERR_DUPLICATE_REPLICATION_SERVER_ID =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,Number>(BASE,"SEVERE_ERR_DUPLICATE_REPLICATION_SERVER_ID_55",SYNC,SEVERE_ERROR,55, getClassLoader());

  /**
   * Entry %s was containing some unknown historical information, This may cause some inconsistency for this entry
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_BAD_HISTORICAL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_BAD_HISTORICAL_56",SYNC,SEVERE_ERROR,56, getClassLoader());

  /**
   * A conflict was detected but the conflict information could not be added. Operation :
   */
  public static final MessageDescriptor.Arg0 ERR_CANNOT_ADD_CONFLICT_ATTRIBUTE =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CANNOT_ADD_CONFLICT_ATTRIBUTE_57",SYNC,MILD_ERROR,57, getClassLoader());

  /**
   * An error happened trying to rename a conflicting entry :
   */
  public static final MessageDescriptor.Arg0 ERR_CANNOT_RENAME_CONFLICT_ENTRY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_CANNOT_RENAME_CONFLICT_ENTRY_58",SYNC,MILD_ERROR,58, getClassLoader());

  /**
   * An Exception happened when trying to rename a conflicting entry :
   */
  public static final MessageDescriptor.Arg0 ERR_EXCEPTION_RENAME_CONFLICT_ENTRY =
          new MessageDescriptor.Arg0(BASE,"MILD_ERR_EXCEPTION_RENAME_CONFLICT_ENTRY_59",SYNC,MILD_ERROR,59, getClassLoader());

  /**
   * The JVM does not support UTF-8. This is required to be able to encode the changes in the database. This replication server will now shutdown
   */
  public static final MessageDescriptor.Arg0 ERR_CHANGELOG_UNSUPPORTED_UTF8_ENCODING =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_CHANGELOG_UNSUPPORTED_UTF8_ENCODING_60",SYNC,SEVERE_ERROR,60, getClassLoader());

  /**
   * The Replication is configured for suffix %s but was not able to connect to any Replication Server
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_REPLICATION_COULD_NOT_CONNECT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_REPLICATION_COULD_NOT_CONNECT_61",SYNC,SEVERE_ERROR,61, getClassLoader());

  /**
   * Directory server DS(%d) has connected to replication server RS(%d) for domain "%s" at %s with generation ID %d
   */
  public static final MessageDescriptor.Arg5<Number,Number,CharSequence,CharSequence,Number> NOTE_NOW_FOUND_SAME_GENERATION_CHANGELOG =
          new MessageDescriptor.Arg5<Number,Number,CharSequence,CharSequence,Number>(BASE,"NOTICE_NOW_FOUND_SAME_GENERATION_CHANGELOG_62",SYNC,NOTICE,62, getClassLoader());

  /**
   * Replication server RS(%d) at %s has closed the connection to this directory server DS(%d). This directory server will now try to connect to another replication server in order to receive changes for the domain "%s"
   */
  public static final MessageDescriptor.Arg4<Number,CharSequence,Number,CharSequence> WARN_REPLICATION_SERVER_PROPERLY_DISCONNECTED =
          new MessageDescriptor.Arg4<Number,CharSequence,Number,CharSequence>(BASE,"MILD_WARN_REPLICATION_SERVER_PROPERLY_DISCONNECTED_63",SYNC,MILD_WARNING,63, getClassLoader());

  /**
   * An unexpected error occurred while sending an Error Message to %s. This connection is going to be closed and reopened
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CHANGELOG_ERROR_SENDING_ERROR =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CHANGELOG_ERROR_SENDING_ERROR_65",SYNC,SEVERE_ERROR,65, getClassLoader());

  /**
   * An unexpected error occurred while sending a Message to %s. This connection is going to be closed and reopened
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CHANGELOG_ERROR_SENDING_MSG =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CHANGELOG_ERROR_SENDING_MSG_66",SYNC,SEVERE_ERROR,66, getClassLoader());

  /**
   * Could not replay operation %s with ChangeNumber %s error %s %s
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> ERR_ERROR_REPLAYING_OPERATION =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_ERROR_REPLAYING_OPERATION_67",SYNC,MILD_ERROR,67, getClassLoader());

  /**
   * The entry %s has historical information for attribute %s which is not defined in the schema. This information will be ignored
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_UNKNOWN_ATTRIBUTE_IN_HISTORICAL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"MILD_ERR_UNKNOWN_ATTRIBUTE_IN_HISTORICAL_68",SYNC,MILD_ERROR,68, getClassLoader());

  /**
   * An unresolved conflict was detected for DN %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_UNRESOLVED_CONFLICT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_UNRESOLVED_CONFLICT_69",SYNC,NOTICE,69, getClassLoader());

  /**
   * The Replication Server socket could not be closed : %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_COULD_NOT_CLOSE_THE_SOCKET =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_COULD_NOT_CLOSE_THE_SOCKET_70",SYNC,SEVERE_ERROR,70, getClassLoader());

  /**
   * The thread listening on the replication server port could not be stopped : %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_COULD_NOT_STOP_LISTEN_THREAD =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_COULD_NOT_STOP_LISTEN_THREAD_71",SYNC,SEVERE_ERROR,71, getClassLoader());

  /**
   * An IOException was caught while listening on the replication port
   */
  public static final MessageDescriptor.Arg0 DEBUG_REPLICATION_PORT_IOEXCEPTION =
          new MessageDescriptor.Arg0(BASE,"DEBUG_REPLICATION_PORT_IOEXCEPTION_72",SYNC,DEBUG,72, getClassLoader());

  /**
   * An unexpected error %s occurred when searching for generation id for domain : %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SEARCHING_GENERATION_ID =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_SEARCHING_GENERATION_ID_73",SYNC,SEVERE_ERROR,73, getClassLoader());

  /**
   * An unexpected error occurred when looking for the replicated backend : %s. It may be not configured or disabled
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_SEARCHING_DOMAIN_BACKEND =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_SEARCHING_DOMAIN_BACKEND_74",SYNC,SEVERE_ERROR,74, getClassLoader());

  /**
   * An unexpected error occurred when searching in %s for the generation ID  : %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_LOADING_GENERATION_ID =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_LOADING_GENERATION_ID_75",SYNC,SEVERE_ERROR,75, getClassLoader());

  /**
   * An unexpected error %s occurred  when updating generation ID for the domain : %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_UPDATING_GENERATION_ID =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_UPDATING_GENERATION_ID_76",SYNC,SEVERE_ERROR,76, getClassLoader());

  /**
   * Replication server RS(%d) at %s presented generation ID %d for domain "%s", but the generation ID of this replication server RS(%d) is %d. This usually indicates that one or more directory servers in the replication topology have not been initialized with the same data, and re-initialization is required
   */
  public static final MessageDescriptor.Arg6<Number,CharSequence,Number,CharSequence,Number,Number> WARN_BAD_GENERATION_ID_FROM_RS =
          new MessageDescriptor.Arg6<Number,CharSequence,Number,CharSequence,Number,Number>(BASE,"SEVERE_WARN_BAD_GENERATION_ID_FROM_RS_77",SYNC,SEVERE_WARNING,77, getClassLoader());

  /**
   * The generation ID for domain "%s" has been reset to %d
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> NOTE_RESET_GENERATION_ID =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"NOTICE_RESET_GENERATION_ID_78",SYNC,NOTICE,78, getClassLoader());

  /**
   * The following error has been received : %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ERROR_MSG_RECEIVED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ERROR_MSG_RECEIVED_79",SYNC,MILD_ERROR,79, getClassLoader());

  /**
   * Replication server RS(%d) ignoring update %s for domain "%s" from replication server RS(%d) at %s because its generation ID %d is different to the local generation ID %d
   */
  public static final MessageDescriptor.Arg7<Number,CharSequence,CharSequence,Number,CharSequence,Number,Number> WARN_IGNORING_UPDATE_FROM_RS =
          new MessageDescriptor.Arg7<Number,CharSequence,CharSequence,Number,CharSequence,Number,Number>(BASE,"SEVERE_WARN_IGNORING_UPDATE_FROM_RS_80",SYNC,SEVERE_WARNING,80, getClassLoader());

  /**
   * Replication server RS(%d) not sending update %s for domain "%s" to replication server RS(%d) at %s because its generation ID %d is different to the local generation ID %d
   */
  public static final MessageDescriptor.Arg7<Number,CharSequence,CharSequence,Number,CharSequence,Number,Number> WARN_IGNORING_UPDATE_TO_RS =
          new MessageDescriptor.Arg7<Number,CharSequence,CharSequence,Number,CharSequence,Number,Number>(BASE,"SEVERE_WARN_IGNORING_UPDATE_TO_RS_81",SYNC,SEVERE_WARNING,81, getClassLoader());

  /**
   * Initialization cannot be done because import is not supported by the backend %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_INIT_IMPORT_NOT_SUPPORTED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_INIT_IMPORT_NOT_SUPPORTED_82",SYNC,SEVERE_ERROR,82, getClassLoader());

  /**
   * Initialization cannot be done because export is not supported by the backend %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_INIT_EXPORT_NOT_SUPPORTED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_INIT_EXPORT_NOT_SUPPORTED_83",SYNC,SEVERE_ERROR,83, getClassLoader());

  /**
   * Initialization cannot be done because the following error occurred while locking the backend %s : %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_INIT_CANNOT_LOCK_BACKEND =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_INIT_CANNOT_LOCK_BACKEND_84",SYNC,SEVERE_ERROR,84, getClassLoader());

  /**
   * Caught Exception during reinitialization of communication on domain %s : %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> NOTE_EXCEPTION_RESTARTING_SESSION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"NOTICE_EXCEPTION_RESTARTING_SESSION_85",SYNC,NOTICE,85, getClassLoader());

  /**
   * Replication server caught exception while listening for client connections %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_EXCEPTION_LISTENING =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_EXCEPTION_LISTENING_86",SYNC,SEVERE_ERROR,86, getClassLoader());

  /**
   * While clearing the database %s , the following error happened: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_ERROR_CLEARING_DB =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_ERROR_CLEARING_DB_87",SYNC,SEVERE_ERROR,87, getClassLoader());

  /**
   * Protocol error : a replication server is not expected to be the destination of a message of type %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_ERR_ROUTING_TO_SERVER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_ERR_ROUTING_TO_SERVER_88",SYNC,NOTICE,88, getClassLoader());

  /**
   * An unexpected error occurred when testing existence or creating the replication backend : %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_CHECK_CREATE_REPL_BACKEND_FAILED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_CHECK_CREATE_REPL_BACKEND_FAILED_89",SYNC,SEVERE_ERROR,89, getClassLoader());

  /**
   * An unexpected error occurred when deleting the replication backend : %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DELETE_REPL_BACKEND_FAILED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_DELETE_REPL_BACKEND_FAILED_90",SYNC,SEVERE_ERROR,90, getClassLoader());

  /**
   * An error occurred when exporting the entry %s : %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_BACKEND_EXPORT_ENTRY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_BACKEND_EXPORT_ENTRY_91",SYNC,SEVERE_ERROR,91, getClassLoader());

  /**
   * An error occurred when creating the LDIF writer to export backend : %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_BACKEND_CANNOT_CREATE_LDIF_WRITER =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_BACKEND_CANNOT_CREATE_LDIF_WRITER_92",SYNC,SEVERE_ERROR,92, getClassLoader());

  /**
   * An error occurred when searching for %s : %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_BACKEND_SEARCH_ENTRY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_BACKEND_SEARCH_ENTRY_93",SYNC,SEVERE_ERROR,93, getClassLoader());

  /**
   * Entry %s does not exist in the replication server backend
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_REPLICATIONBACKEND_ENTRY_DOESNT_EXIST =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_REPLICATIONBACKEND_ENTRY_DOESNT_EXIST_94",SYNC,SEVERE_ERROR,94, getClassLoader());

  /**
   * The base DN %s is not stored by any of the Directory Server backend
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_UNKNOWN_DN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_UNKNOWN_DN_95",SYNC,SEVERE_ERROR,95, getClassLoader());

  /**
   * Directory server DS(%d) has connected to replication server RS(%d) for domain "%s" at %s, but the generation IDs do not match, indicating that a full re-initialization is required. The local (DS) generation ID is %d and the remote (RS) generation ID is %d
   */
  public static final MessageDescriptor.Arg6<Number,Number,CharSequence,CharSequence,Number,Number> WARN_NOW_FOUND_BAD_GENERATION_CHANGELOG =
          new MessageDescriptor.Arg6<Number,Number,CharSequence,CharSequence,Number,Number>(BASE,"SEVERE_WARN_NOW_FOUND_BAD_GENERATION_CHANGELOG_96",SYNC,SEVERE_WARNING,96, getClassLoader());

  /**
   * Directory server DS(%d) is closing its connection to replication server RS(%d) at %s for domain "%s" because it could not detect a heart beat
   */
  public static final MessageDescriptor.Arg4<Number,Number,CharSequence,CharSequence> WARN_HEARTBEAT_FAILURE =
          new MessageDescriptor.Arg4<Number,Number,CharSequence,CharSequence>(BASE,"SEVERE_WARN_HEARTBEAT_FAILURE_97",SYNC,SEVERE_WARNING,97, getClassLoader());

  /**
   * The replication server backend does not support the import ldif function
   */
  public static final MessageDescriptor.Arg0 ERR_REPLICATONBACKEND_IMPORT_LDIF_NOT_SUPPORTED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_REPLICATONBACKEND_IMPORT_LDIF_NOT_SUPPORTED_98",SYNC,SEVERE_ERROR,98, getClassLoader());

  /**
   * The replication server backend cannot export its entries in LDIF format because the export-ldif command must be run as a task
   */
  public static final MessageDescriptor.Arg0 ERR_REPLICATONBACKEND_EXPORT_LDIF_FAILED =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_REPLICATONBACKEND_EXPORT_LDIF_FAILED_99",SYNC,SEVERE_ERROR,99, getClassLoader());

  /**
   * Replication server accepted a connection from %s to local address %s but the SSL handshake failed. This is probably benign, but may indicate a transient network outage or a misconfigured client application connecting to this replication server. The error was: %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> INFO_SSL_SERVER_CON_ATTEMPT_ERROR =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"INFO_SSL_SERVER_CON_ATTEMPT_ERROR_105",SYNC,INFORMATION,105, getClassLoader());

  /**
   * Timed out waiting for monitor data for the domain "%s" from replication server RS(%d)
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> WARN_MISSING_REMOTE_MONITOR_DATA =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"SEVERE_WARN_MISSING_REMOTE_MONITOR_DATA_106",SYNC,SEVERE_WARNING,106, getClassLoader());

  /**
   * Monitor data of remote servers are missing due to a processing error : %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PROCESSING_REMOTE_MONITOR_DATA =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_PROCESSING_REMOTE_MONITOR_DATA_107",SYNC,SEVERE_ERROR,107, getClassLoader());

  /**
   * Unable to send monitor data request for domain "%s" to replication server RS(%d) due to the following error: %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,CharSequence> ERR_SENDING_REMOTE_MONITOR_DATA_REQUEST =
          new MessageDescriptor.Arg3<CharSequence,Number,CharSequence>(BASE,"SEVERE_ERR_SENDING_REMOTE_MONITOR_DATA_REQUEST_108",SYNC,SEVERE_ERROR,108, getClassLoader());

  /**
   * An Exception was caught while replaying replication message : %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_EXCEPTION_REPLAYING_REPLICATION_MESSAGE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_EXCEPTION_REPLAYING_REPLICATION_MESSAGE_109",SYNC,SEVERE_ERROR,109, getClassLoader());

  /**
   * The replication server configuration could not be found
   */
  public static final MessageDescriptor.Arg0 ERR_REPLICATION_SERVER_CONFIG_NOT_FOUND =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_REPLICATION_SERVER_CONFIG_NOT_FOUND_110",SYNC,SEVERE_ERROR,110, getClassLoader());

  /**
   * The replication server is late regarding our changes: going to send missing ones
   */
  public static final MessageDescriptor.Arg0 DEBUG_GOING_TO_SEARCH_FOR_CHANGES =
          new MessageDescriptor.Arg0(BASE,"DEBUG_GOING_TO_SEARCH_FOR_CHANGES_111",SYNC,DEBUG,111, getClassLoader());

  /**
   * Sending change number: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> DEBUG_SENDING_CHANGE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"DEBUG_SENDING_CHANGE_112",SYNC,DEBUG,112, getClassLoader());

  /**
   * All missing changes sent to replication server
   */
  public static final MessageDescriptor.Arg0 DEBUG_CHANGES_SENT =
          new MessageDescriptor.Arg0(BASE,"DEBUG_CHANGES_SENT_113",SYNC,DEBUG,113, getClassLoader());

  /**
   * Caught exception publishing fake operations for domain %s : %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_PUBLISHING_FAKE_OPS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_PUBLISHING_FAKE_OPS_114",SYNC,SEVERE_ERROR,114, getClassLoader());

  /**
   * Caught exception computing fake operations for domain %s for replication server %s : %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_COMPUTING_FAKE_OPS =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_COMPUTING_FAKE_OPS_115",SYNC,SEVERE_ERROR,115, getClassLoader());

  /**
   * Late monitor data received for domain "%s" from replication server RS(%d), and will be ignored
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> INFO_IGNORING_REMOTE_MONITOR_DATA =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"INFO_IGNORING_REMOTE_MONITOR_DATA_116",SYNC,INFORMATION,116, getClassLoader());

  /**
   * ServerState recovery for domain %s, updated with changeNumber %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> NOTE_SERVER_STATE_RECOVERY =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"NOTICE_SERVER_STATE_RECOVERY_117",SYNC,NOTICE,117, getClassLoader());

  /**
   * For replicated domain %s, in server with serverId=%s, the generation ID could not be set to value %s in the rest of the topology because this server is NOT connected to any replication server. You should check in the configuration that the domain is enabled and that there is one replication server up and running
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_RESET_GENERATION_CONN_ERR_ID =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_RESET_GENERATION_CONN_ERR_ID_118",SYNC,SEVERE_ERROR,118, getClassLoader());

  /**
   * Directory server DS(%d) encountered an unexpected error while connecting to replication server %s for domain "%s": %s
   */
  public static final MessageDescriptor.Arg4<Number,CharSequence,CharSequence,CharSequence> WARN_EXCEPTION_STARTING_SESSION_PHASE =
          new MessageDescriptor.Arg4<Number,CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_WARN_EXCEPTION_STARTING_SESSION_PHASE_119",SYNC,SEVERE_WARNING,119, getClassLoader());

  /**
   * Disconnecting from replication server as a new one with our group id (%s) just arrived in topology. This is for domain %s and we have server id %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> NOTE_NEW_SERVER_WITH_SAME_GROUP_ID =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"NOTICE_NEW_SERVER_WITH_SAME_GROUP_ID_120",SYNC,NOTICE,120, getClassLoader());

  /**
   * DN sent by remote replication server: %s does not match local replication server one: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_RS_DN_DOES_NOT_MATCH =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_RS_DN_DOES_NOT_MATCH_121",SYNC,SEVERE_ERROR,121, getClassLoader());

  /**
   * DN sent by replication server: %s does not match local directory server one: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_DS_DN_DOES_NOT_MATCH =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_DS_DN_DOES_NOT_MATCH_122",SYNC,SEVERE_ERROR,122, getClassLoader());

  /**
   * Caught IOException while forwarding ResetGenerationIdMsg to peer replication servers for domain %s : %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_EXCEPTION_FORWARDING_RESET_GEN_ID =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_EXCEPTION_FORWARDING_RESET_GEN_ID_123",SYNC,SEVERE_ERROR,123, getClassLoader());

  /**
   * Computed invalid initial status: %s in DS replication domain %s with server id %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_DS_INVALID_INIT_STATUS =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_DS_INVALID_INIT_STATUS_124",SYNC,SEVERE_ERROR,124, getClassLoader());

  /**
   * Replication server received invalid initial status: %s for replication domain %s from server id %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_RS_INVALID_INIT_STATUS =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_RS_INVALID_INIT_STATUS_125",SYNC,SEVERE_ERROR,125, getClassLoader());

  /**
   * Received invalid requested status %s in DS replication domain %s with server id %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_DS_INVALID_REQUESTED_STATUS =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_DS_INVALID_REQUESTED_STATUS_126",SYNC,SEVERE_ERROR,126, getClassLoader());

  /**
   * Could not compute new status in RS replication domain %s for server id %s. Was in %s status and received %s event
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> ERR_RS_CANNOT_CHANGE_STATUS =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_RS_CANNOT_CHANGE_STATUS_127",SYNC,SEVERE_ERROR,127, getClassLoader());

  /**
   * Could not compute new status in DS replication domain %s with server id %s. Was in %s status and received %s event
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> ERR_DS_CANNOT_CHANGE_STATUS =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_DS_CANNOT_CHANGE_STATUS_128",SYNC,SEVERE_ERROR,128, getClassLoader());

  /**
   * Caught IOException while changing status for domain %s and serverId: %s after reset for generation id: %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_EXCEPTION_CHANGING_STATUS_AFTER_RESET_GEN_ID =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_EXCEPTION_CHANGING_STATUS_AFTER_RESET_GEN_ID_129",SYNC,SEVERE_ERROR,129, getClassLoader());

  /**
   * Received change status message does not come from a directory server (dn: %s, server id: %s, msg: %s)
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_RECEIVED_CHANGE_STATUS_NOT_FROM_DS =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_RECEIVED_CHANGE_STATUS_NOT_FROM_DS_130",SYNC,SEVERE_ERROR,130, getClassLoader());

  /**
   * Directory server DS(%d) for domain "%s" has changed its status to %s
   */
  public static final MessageDescriptor.Arg3<Number,CharSequence,CharSequence> NOTE_DIRECTORY_SERVER_CHANGED_STATUS =
          new MessageDescriptor.Arg3<Number,CharSequence,CharSequence>(BASE,"NOTICE_DIRECTORY_SERVER_CHANGED_STATUS_131",SYNC,NOTICE,131, getClassLoader());

  /**
   * Received invalid new status %s in RS for replication domain %s and directory server id %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_RS_INVALID_NEW_STATUS =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_RS_INVALID_NEW_STATUS_132",SYNC,SEVERE_ERROR,132, getClassLoader());

  /**
   * Connected to a replication server with wrong group id. We have group id %s and replication server id %s %s has group id %s. This is for domain %s in directory server %s
   */
  public static final MessageDescriptor.Arg6<CharSequence,CharSequence,CharSequence,CharSequence,CharSequence,CharSequence> WARN_CONNECTED_TO_SERVER_WITH_WRONG_GROUP_ID =
          new MessageDescriptor.Arg6<CharSequence,CharSequence,CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_WARN_CONNECTED_TO_SERVER_WITH_WRONG_GROUP_ID_133",SYNC,SEVERE_WARNING,133, getClassLoader());

  /**
   * Replication broker with dn %s and server id %s failed to signal status change because of: %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_EXCEPTION_SENDING_CS =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_EXCEPTION_SENDING_CS_134",SYNC,SEVERE_ERROR,134, getClassLoader());

  /**
   * Replication server RS(%d) ignoring update %s for domain "%s" from directory server DS(%d) at %s because its generation ID %d is different to the local generation ID %d
   */
  public static final MessageDescriptor.Arg7<Number,CharSequence,CharSequence,Number,CharSequence,Number,Number> WARN_IGNORING_UPDATE_FROM_DS_BADGENID =
          new MessageDescriptor.Arg7<Number,CharSequence,CharSequence,Number,CharSequence,Number,Number>(BASE,"SEVERE_WARN_IGNORING_UPDATE_FROM_DS_BADGENID_135",SYNC,SEVERE_WARNING,135, getClassLoader());

  /**
   * Replication server RS(%d) not sending update %s for domain "%s" to directory server DS(%d) at %s because its generation ID %d is different to the local generation ID %d
   */
  public static final MessageDescriptor.Arg7<Number,CharSequence,CharSequence,Number,CharSequence,Number,Number> WARN_IGNORING_UPDATE_TO_DS_BADGENID =
          new MessageDescriptor.Arg7<Number,CharSequence,CharSequence,Number,CharSequence,Number,Number>(BASE,"SEVERE_WARN_IGNORING_UPDATE_TO_DS_BADGENID_136",SYNC,SEVERE_WARNING,136, getClassLoader());

  /**
   * Replication server RS(%d) ignoring update %s for domain "%s" from directory server DS(%d) at %s because it is currently performing a full update
   */
  public static final MessageDescriptor.Arg5<Number,CharSequence,CharSequence,Number,CharSequence> WARN_IGNORING_UPDATE_FROM_DS_FULLUP =
          new MessageDescriptor.Arg5<Number,CharSequence,CharSequence,Number,CharSequence>(BASE,"SEVERE_WARN_IGNORING_UPDATE_FROM_DS_FULLUP_137",SYNC,SEVERE_WARNING,137, getClassLoader());

  /**
   * Replication server RS(%d) not sending update %s for domain "%s" to directory server DS(%d) at %s because it is currently performing a full update
   */
  public static final MessageDescriptor.Arg5<Number,CharSequence,CharSequence,Number,CharSequence> WARN_IGNORING_UPDATE_TO_DS_FULLUP =
          new MessageDescriptor.Arg5<Number,CharSequence,CharSequence,Number,CharSequence>(BASE,"SEVERE_WARN_IGNORING_UPDATE_TO_DS_FULLUP_138",SYNC,SEVERE_WARNING,138, getClassLoader());

  /**
   * Caught IOException while changing status for domain %s and serverId: %s from status analyzer: %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_EXCEPTION_CHANGING_STATUS_FROM_STATUS_ANALYZER =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_EXCEPTION_CHANGING_STATUS_FROM_STATUS_ANALYZER_139",SYNC,SEVERE_ERROR,139, getClassLoader());

  /**
   * Replication server %s for dn %s: directory server %s must stay in full update although a generation id reset has been ordered (from %s to %s)
   */
  public static final MessageDescriptor.Arg5<CharSequence,CharSequence,CharSequence,CharSequence,CharSequence> NOTE_BAD_GEN_ID_IN_FULL_UPDATE =
          new MessageDescriptor.Arg5<CharSequence,CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"NOTICE_BAD_GEN_ID_IN_FULL_UPDATE_140",SYNC,NOTICE,140, getClassLoader());

  /**
   * Starting total update: importing domain "%s" from remote directory server DS(%d) to this directory server DS(%d)
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,Number> NOTE_FULL_UPDATE_ENGAGED_FROM_REMOTE_START =
          new MessageDescriptor.Arg3<CharSequence,Number,Number>(BASE,"NOTICE_FULL_UPDATE_ENGAGED_FROM_REMOTE_START_141",SYNC,NOTICE,141, getClassLoader());

  /**
   * Finished total update: imported domain "%s" from remote directory server DS(%d) to this directory server DS(%d). %s
   */
  public static final MessageDescriptor.Arg4<CharSequence,Number,Number,CharSequence> NOTE_FULL_UPDATE_ENGAGED_FROM_REMOTE_END =
          new MessageDescriptor.Arg4<CharSequence,Number,Number,CharSequence>(BASE,"NOTICE_FULL_UPDATE_ENGAGED_FROM_REMOTE_END_142",SYNC,NOTICE,142, getClassLoader());

  /**
   * Starting total update: exporting %d entries in domain "%s" from this directory server DS(%d) to remote directory server DS(%d)
   */
  public static final MessageDescriptor.Arg4<Number,CharSequence,Number,Number> NOTE_FULL_UPDATE_ENGAGED_FOR_REMOTE_START =
          new MessageDescriptor.Arg4<Number,CharSequence,Number,Number>(BASE,"NOTICE_FULL_UPDATE_ENGAGED_FOR_REMOTE_START_143",SYNC,NOTICE,143, getClassLoader());

  /**
   * Finished total update: exported domain "%s" from this directory server DS(%d) to remote directory server DS(%d). %s
   */
  public static final MessageDescriptor.Arg4<CharSequence,Number,Number,CharSequence> NOTE_FULL_UPDATE_ENGAGED_FOR_REMOTE_END =
          new MessageDescriptor.Arg4<CharSequence,Number,Number,CharSequence>(BASE,"NOTICE_FULL_UPDATE_ENGAGED_FOR_REMOTE_END_144",SYNC,NOTICE,144, getClassLoader());

  /**
   * Timed out while trying to acquire the domain lock for domain "%s". The connection attempt from replication server RS(%d) at %s to this replication server RS(%d) will be aborted. This is probably benign and a result of a simultaneous cross connection attempt
   */
  public static final MessageDescriptor.Arg4<CharSequence,Number,CharSequence,Number> WARN_TIMEOUT_WHEN_CROSS_CONNECTION =
          new MessageDescriptor.Arg4<CharSequence,Number,CharSequence,Number>(BASE,"SEVERE_WARN_TIMEOUT_WHEN_CROSS_CONNECTION_145",SYNC,SEVERE_WARNING,145, getClassLoader());

  /**
   * Directory server DS(%d) at %s presented generation ID %d for domain "%s", but the generation ID of this replication server RS(%d) is %d. This usually indicates that one or more directory servers in the replication topology have not been initialized with the same data, and re-initialization is required
   */
  public static final MessageDescriptor.Arg6<Number,CharSequence,Number,CharSequence,Number,Number> WARN_BAD_GENERATION_ID_FROM_DS =
          new MessageDescriptor.Arg6<Number,CharSequence,Number,CharSequence,Number,Number>(BASE,"MILD_WARN_BAD_GENERATION_ID_FROM_DS_146",SYNC,MILD_WARNING,146, getClassLoader());

  /**
   * In replication service %s and server id %s, the assured update message %s was acknowledged with the following errors: %s
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> NOTE_DS_RECEIVED_ACK_ERROR =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"NOTICE_DS_RECEIVED_ACK_ERROR_147",SYNC,NOTICE,147, getClassLoader());

  /**
   * In replication service %s, timeout after %s ms waiting for the acknowledgement of the assured update message: %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> NOTE_DS_ACK_TIMEOUT =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"NOTICE_DS_ACK_TIMEOUT_148",SYNC,NOTICE,148, getClassLoader());

  /**
   * In directory server %s, received unknown assured update mode: %s, for domain %s. Message: %s
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> ERR_DS_UNKNOWN_ASSURED_MODE =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_DS_UNKNOWN_ASSURED_MODE_149",SYNC,SEVERE_ERROR,149, getClassLoader());

  /**
   * In replication server %s, received unknown assured update mode: %s, for domain %s. Message: %s
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> ERR_RS_UNKNOWN_ASSURED_MODE =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_RS_UNKNOWN_ASSURED_MODE_150",SYNC,SEVERE_ERROR,150, getClassLoader());

  /**
   * In replication server %s, received a safe data assured update message with incoherent level: %s, this is for domain %s. Message: %s
   */
  public static final MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence> ERR_UNKNOWN_ASSURED_SAFE_DATA_LEVEL =
          new MessageDescriptor.Arg4<CharSequence,CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_UNKNOWN_ASSURED_SAFE_DATA_LEVEL_151",SYNC,SEVERE_ERROR,151, getClassLoader());

  /**
   * The generation ID could not be reset for domain %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_RESET_GENERATION_ID_FAILED =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_RESET_GENERATION_ID_FAILED_152",SYNC,SEVERE_ERROR,152, getClassLoader());

  /**
   * Cannot change the configuration while a total update is in progress
   */
  public static final MessageDescriptor.Arg0 NOTE_ERR_CANNOT_CHANGE_CONFIG_DURING_TOTAL_UPDATE =
          new MessageDescriptor.Arg0(BASE,"NOTICE_ERR_CANNOT_CHANGE_CONFIG_DURING_TOTAL_UPDATE_153",SYNC,NOTICE,153, getClassLoader());

  /**
   * The Replication was not started on base-dn %s : %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_COULD_NOT_START_REPLICATION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_COULD_NOT_START_REPLICATION_154",SYNC,SEVERE_ERROR,154, getClassLoader());

  /**
   * Error retrieving monitoring data: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_ERROR_RETRIEVING_MONITOR_DATA =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_ERROR_RETRIEVING_MONITOR_DATA_155",SYNC,MILD_ERROR,155, getClassLoader());

  /**
   * Caught exception when locking the replication server domain: %s 
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_EXCEPTION_LOCKING_RS_DOMAIN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_EXCEPTION_LOCKING_RS_DOMAIN_156",SYNC,SEVERE_ERROR,156, getClassLoader());

  /**
   * Replication protocol error. Bad message type. %s received, %s required  
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_REPLICATION_PROTOCOL_MESSAGE_TYPE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_REPLICATION_PROTOCOL_MESSAGE_TYPE_157",SYNC,SEVERE_ERROR,157, getClassLoader());

  /**
   * Full resync required because the provided cookie is missing the replicated domain(s) %s. The following cookie value can be used to retrieve the missing changes, including the COMPLETE record of changes for the missing domain(s) : %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_RESYNC_REQUIRED_MISSING_DOMAIN_IN_PROVIDED_COOKIE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_RESYNC_REQUIRED_MISSING_DOMAIN_IN_PROVIDED_COOKIE_158",SYNC,SEVERE_ERROR,158, getClassLoader());

  /**
   * The Server Handler byte count is not correct Byte Count=%s (Fixed)
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_BYTE_COUNT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_BYTE_COUNT_159",SYNC,SEVERE_ERROR,159, getClassLoader());

  /**
   * Wrong fractional replication configuration: could not find object class definition for %s in schema
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_ERR_FRACTIONAL_CONFIG_UNKNOWN_OBJECT_CLASS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_ERR_FRACTIONAL_CONFIG_UNKNOWN_OBJECT_CLASS_160",SYNC,NOTICE,160, getClassLoader());

  /**
   * Wrong fractional replication configuration : could not find attribute type definition for %s in schema
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_ERR_FRACTIONAL_CONFIG_UNKNOWN_ATTRIBUTE_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_ERR_FRACTIONAL_CONFIG_UNKNOWN_ATTRIBUTE_TYPE_161",SYNC,NOTICE,161, getClassLoader());

  /**
   * Wrong fractional replication configuration : attribute %s is not optional in class %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> NOTE_ERR_FRACTIONAL_CONFIG_NOT_OPTIONAL_ATTRIBUTE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"NOTICE_ERR_FRACTIONAL_CONFIG_NOT_OPTIONAL_ATTRIBUTE_162",SYNC,NOTICE,162, getClassLoader());

  /**
   * Wrong fractional replication configuration : wrong format : %s (need at least [<className>|*],attributeName)
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_ERR_FRACTIONAL_CONFIG_WRONG_FORMAT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_ERR_FRACTIONAL_CONFIG_WRONG_FORMAT_163",SYNC,NOTICE,163, getClassLoader());

  /**
   * Wrong fractional replication configuration : cannot use both exclusive and inclusive modes
   */
  public static final MessageDescriptor.Arg0 NOTE_ERR_FRACTIONAL_CONFIG_BOTH_MODES =
          new MessageDescriptor.Arg0(BASE,"NOTICE_ERR_FRACTIONAL_CONFIG_BOTH_MODES_164",SYNC,NOTICE,164, getClassLoader());

  /**
   * Wrong fractional replication configuration : prohibited attribute %s usage
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_ERR_FRACTIONAL_CONFIG_PROHIBITED_ATTRIBUTE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_ERR_FRACTIONAL_CONFIG_PROHIBITED_ATTRIBUTE_165",SYNC,NOTICE,165, getClassLoader());

  /**
   * Fractional replication : exception for domain : %s : %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> NOTE_ERR_FRACTIONAL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"NOTICE_ERR_FRACTIONAL_166",SYNC,NOTICE,166, getClassLoader());

  /**
   * Warning : domain %s fractional replication configuration is inconsistent with backend data set : need resynchronization or fractional configuration to be changed
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_FRACTIONAL_BAD_DATA_SET_NEED_RESYNC =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_FRACTIONAL_BAD_DATA_SET_NEED_RESYNC_167",SYNC,NOTICE,167, getClassLoader());

  /**
   * The fractional replication ldif import plugin is configured with invalid plugin type %s. Only the ldifImport plugin type is allowed
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_PLUGIN_FRACTIONAL_LDIF_IMPORT_INVALID_PLUGIN_TYPE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_PLUGIN_FRACTIONAL_LDIF_IMPORT_INVALID_PLUGIN_TYPE_168",SYNC,MILD_ERROR,168, getClassLoader());

  /**
   * The online full update for importing suffix %s data from remote directory server %s has been stopped due to fractional configuration inconsistency between destination and source server : imported data set has not the same fractional configuration
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> NOTE_ERR_FULL_UPDATE_IMPORT_FRACTIONAL_BAD_REMOTE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"NOTICE_ERR_FULL_UPDATE_IMPORT_FRACTIONAL_BAD_REMOTE_169",SYNC,NOTICE,169, getClassLoader());

  /**
   * The online full update for importing suffix %s data from remote directory server %s has been stopped due to fractional configuration inconsistency between destination and source server : imported data set has some fractional configuration but not destination server
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> NOTE_ERR_FULL_UPDATE_IMPORT_FRACTIONAL_REMOTE_IS_FRACTIONAL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"NOTICE_ERR_FULL_UPDATE_IMPORT_FRACTIONAL_REMOTE_IS_FRACTIONAL_170",SYNC,NOTICE,170, getClassLoader());

  /**
   * The following operation has been forbidden in suffix %s due to inconsistency with the fractional replication configuration : %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> NOTE_ERR_FRACTIONAL_FORBIDDEN_OPERATION =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"NOTICE_ERR_FRACTIONAL_FORBIDDEN_OPERATION_171",SYNC,NOTICE,171, getClassLoader());

  /**
   * The export of domain %s from server %s to all other servers of the topology is forbidden as the source server has some fractional configuration : only fractional servers in a replicated topology does not make sense
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> NOTE_ERR_FRACTIONAL_FORBIDDEN_FULL_UPDATE_FRACTIONAL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"NOTICE_ERR_FRACTIONAL_FORBIDDEN_FULL_UPDATE_FRACTIONAL_172",SYNC,NOTICE,172, getClassLoader());

  /**
   * An error occurred when accessing the database of the draft change number : %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_DRAFT_CHANGENUMBER_DATABASE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"MILD_ERR_DRAFT_CHANGENUMBER_DATABASE_173",SYNC,MILD_ERROR,173, getClassLoader());

  /**
   * The initialization failed because the domain %s is not connected to a replication server
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_INITIALIZATION_FAILED_NOCONN =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_INITIALIZATION_FAILED_NOCONN_174",SYNC,SEVERE_ERROR,174, getClassLoader());

  /**
   * Could not retrieve the configuration for a replication domain matching the entry %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_FRACTIONAL_COULD_NOT_RETRIEVE_CONFIG =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_FRACTIONAL_COULD_NOT_RETRIEVE_CONFIG_175",SYNC,SEVERE_ERROR,175, getClassLoader());

  /**
   * The LDIF import for importing suffix %s data has been stopped due to fractional configuration inconsistency : imported data set has not the same fractional configuration as local server
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_ERR_LDIF_IMPORT_FRACTIONAL_BAD_DATA_SET =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_ERR_LDIF_IMPORT_FRACTIONAL_BAD_DATA_SET_176",SYNC,NOTICE,176, getClassLoader());

  /**
   * The LDIF import for importing suffix %s data has been stopped due to fractional configuration inconsistency : imported data set has some fractional configuration but not local server
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_ERR_LDIF_IMPORT_FRACTIONAL_DATA_SET_IS_FRACTIONAL =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_ERR_LDIF_IMPORT_FRACTIONAL_DATA_SET_IS_FRACTIONAL_177",SYNC,NOTICE,177, getClassLoader());

  /**
   * Directory server %s was attempting to connect to replication server %s but has disconnected in handshake phase
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_DS_DISCONNECTED_DURING_HANDSHAKE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_DS_DISCONNECTED_DURING_HANDSHAKE_178",SYNC,SEVERE_ERROR,178, getClassLoader());

  /**
   * Replication server %s was attempting to connect to replication server %s but has disconnected in handshake phase
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_RS_DISCONNECTED_DURING_HANDSHAKE =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_RS_DISCONNECTED_DURING_HANDSHAKE_179",SYNC,SEVERE_ERROR,179, getClassLoader());

  /**
   * Directory server DS(%d) encountered an error while receiving changes for domain "%s" from replication server RS(%d) at %s. The connection will be closed, and this directory server will now try to connect to another replication server
   */
  public static final MessageDescriptor.Arg4<Number,CharSequence,Number,CharSequence> WARN_REPLICATION_SERVER_BADLY_DISCONNECTED =
          new MessageDescriptor.Arg4<Number,CharSequence,Number,CharSequence>(BASE,"SEVERE_WARN_REPLICATION_SERVER_BADLY_DISCONNECTED_180",SYNC,SEVERE_WARNING,180, getClassLoader());

  /**
   * The connection from this replication server RS(%d) to replication server RS(%d) at %s for domain "%s" has failed
   */
  public static final MessageDescriptor.Arg4<Number,Number,CharSequence,CharSequence> ERR_RS_BADLY_DISCONNECTED =
          new MessageDescriptor.Arg4<Number,Number,CharSequence,CharSequence>(BASE,"SEVERE_ERR_RS_BADLY_DISCONNECTED_181",SYNC,SEVERE_ERROR,181, getClassLoader());

  /**
   * Error when loading a virtual attribute for external change log: Attribute: %s , Error: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> NOTE_ERR_UNABLE_TO_ENABLE_ECL_VIRTUAL_ATTR =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"NOTICE_ERR_UNABLE_TO_ENABLE_ECL_VIRTUAL_ATTR_182",SYNC,NOTICE,182, getClassLoader());

  /**
   * Error in %s when enabling the external change log: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> NOTE_ERR_UNABLE_TO_ENABLE_ECL =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"NOTICE_ERR_UNABLE_TO_ENABLE_ECL_183",SYNC,NOTICE,183, getClassLoader());

  /**
   * Error for entry %s when mapping entry UIDattribute to DSEE NsUniqueID attribute. Value to be mapped: %s Error : %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> NOTE_ERR_ENTRY_UID_DSEE_MAPPING =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"NOTICE_ERR_ENTRY_UID_DSEE_MAPPING_184",SYNC,NOTICE,184, getClassLoader());

  /**
   * Full resync required. Reason: The provided cookie contains unknown replicated domain %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_RESYNC_REQUIRED_UNKNOWN_DOMAIN_IN_PROVIDED_COOKIE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_RESYNC_REQUIRED_UNKNOWN_DOMAIN_IN_PROVIDED_COOKIE_185",SYNC,SEVERE_ERROR,185, getClassLoader());

  /**
   * Full resync required. Reason: The provided cookie is older than the start of historical in the server for the replicated domain : %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_RESYNC_REQUIRED_TOO_OLD_DOMAIN_IN_PROVIDED_COOKIE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_RESYNC_REQUIRED_TOO_OLD_DOMAIN_IN_PROVIDED_COOKIE_186",SYNC,SEVERE_ERROR,186, getClassLoader());

  /**
   * Invalid syntax of the provided cookie
   */
  public static final MessageDescriptor.Arg0 ERR_INVALID_COOKIE_SYNTAX =
          new MessageDescriptor.Arg0(BASE,"SEVERE_ERR_INVALID_COOKIE_SYNTAX_187",SYNC,SEVERE_ERROR,187, getClassLoader());

  /**
   * Directory Server DS(%d) is switching from replication server RS(%d) at %s to RS(%d) for domain "%s" because it is more suitable
   */
  public static final MessageDescriptor.Arg5<Number,Number,CharSequence,Number,CharSequence> NOTE_NEW_BEST_REPLICATION_SERVER =
          new MessageDescriptor.Arg5<Number,Number,CharSequence,Number,CharSequence>(BASE,"NOTICE_NEW_BEST_REPLICATION_SERVER_188",SYNC,NOTICE,188, getClassLoader());

  /**
   * Domain %s (server id: %s) : remote exporter server disconnection (server id: %s ) detected during initialization
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_INIT_EXPORTER_DISCONNECTION =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"MILD_ERR_INIT_EXPORTER_DISCONNECTION_189",SYNC,MILD_ERROR,189, getClassLoader());

  /**
   * During initialization from a remote server, the following error occurred : %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_INIT_IMPORT_FAILURE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_INIT_IMPORT_FAILURE_190",SYNC,SEVERE_ERROR,190, getClassLoader());

  /**
   * Connection failure with Replication Server %s during import
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_INIT_RS_DISCONNECTION_DURING_IMPORT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_INIT_RS_DISCONNECTION_DURING_IMPORT_191",SYNC,SEVERE_ERROR,191, getClassLoader());

  /**
   * Bad msg id sequence during import. Expected:%s Actual:%s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_INIT_BAD_MSG_ID_SEQ_DURING_IMPORT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_INIT_BAD_MSG_ID_SEQ_DURING_IMPORT_192",SYNC,SEVERE_ERROR,192, getClassLoader());

  /**
   * The following servers did not acknowledged initialization in the expected time. They are potentially down or too slow. Servers list: %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_INIT_NO_SUCCESS_START_FROM_SERVERS =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_INIT_NO_SUCCESS_START_FROM_SERVERS_193",SYNC,SEVERE_ERROR,193, getClassLoader());

  /**
   * The following servers did not end initialization being connected with the right generation (%s). They are potentially stopped or too slow. Servers list: %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_INIT_NO_SUCCESS_END_FROM_SERVERS =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_INIT_NO_SUCCESS_END_FROM_SERVERS_194",SYNC,SEVERE_ERROR,194, getClassLoader());

  /**
   * When initializing remote server(s), connection to Replication Server with serverId=%s is lost
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_INIT_RS_DISCONNECTION_DURING_EXPORT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_INIT_RS_DISCONNECTION_DURING_EXPORT_195",SYNC,SEVERE_ERROR,195, getClassLoader());

  /**
   * When initializing remote server(s), the initialized server with serverId=%s is potentially stopped or too slow
   */
  public static final MessageDescriptor.Arg1<CharSequence> ERR_INIT_HEARTBEAT_LOST_DURING_EXPORT =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"SEVERE_ERR_INIT_HEARTBEAT_LOST_DURING_EXPORT_196",SYNC,SEVERE_ERROR,196, getClassLoader());

  /**
   * When sending a new initialization request for an initialization from a remote server, the following error occured %s. The initial error was : %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_SENDING_NEW_ATTEMPT_INIT_REQUEST =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_SENDING_NEW_ATTEMPT_INIT_REQUEST_197",SYNC,SEVERE_ERROR,197, getClassLoader());

  /**
   * Resending a new initialization request for an initialization from a remote server due to the root error : %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_RESENDING_INIT_FROM_REMOTE_REQUEST =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_RESENDING_INIT_FROM_REMOTE_REQUEST_198",SYNC,NOTICE,198, getClassLoader());

  /**
   * Resending a new initialization start for an initialization of a remote server due to the root error : %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_RESENDING_INIT_TARGET =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_RESENDING_INIT_TARGET_199",SYNC,NOTICE,199, getClassLoader());

  /**
   * Error while trying to translate RUV into state for suffix %s
   */
  public static final MessageDescriptor.Arg1<CharSequence> NOTE_ERR_WHILE_TRYING_TO_DECODE_RUV_IN_STATE =
          new MessageDescriptor.Arg1<CharSequence>(BASE,"NOTICE_ERR_WHILE_TRYING_TO_DECODE_RUV_IN_STATE_200",SYNC,NOTICE,200, getClassLoader());

  /**
   * Processing two different changes with same changeNumber=%s. Previous msg=<%s>, New msg=<%s>
   */
  public static final MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence> ERR_RSQUEUE_DIFFERENT_MSGS_WITH_SAME_CN =
          new MessageDescriptor.Arg3<CharSequence,CharSequence,CharSequence>(BASE,"SEVERE_ERR_RSQUEUE_DIFFERENT_MSGS_WITH_SAME_CN_201",SYNC,SEVERE_ERROR,201, getClassLoader());

  /**
   * Error while trying to solve conflict with DN : %s ERROR : %s
   */
  public static final MessageDescriptor.Arg2<CharSequence,CharSequence> ERR_COULD_NOT_SOLVE_CONFLICT =
          new MessageDescriptor.Arg2<CharSequence,CharSequence>(BASE,"SEVERE_ERR_COULD_NOT_SOLVE_CONFLICT_202",SYNC,SEVERE_ERROR,202, getClassLoader());

  /**
   * Monitor data for the domain "%s" has been received from replication server RS(%d)
   */
  public static final MessageDescriptor.Arg2<CharSequence,Number> NOTE_MONITOR_DATA_RECEIVED =
          new MessageDescriptor.Arg2<CharSequence,Number>(BASE,"NOTICE_MONITOR_DATA_RECEIVED_203",SYNC,NOTICE,203, getClassLoader());

  /**
   * Replication server RS(%d) started listening for new connections on address %s port %d
   */
  public static final MessageDescriptor.Arg3<Number,CharSequence,Number> NOTE_REPLICATION_SERVER_LISTENING =
          new MessageDescriptor.Arg3<Number,CharSequence,Number>(BASE,"NOTICE_REPLICATION_SERVER_LISTENING_204",SYNC,NOTICE,204, getClassLoader());

  /**
   * Replication server RS(%d) has connected to replication server RS(%d) for domain "%s" at %s
   */
  public static final MessageDescriptor.Arg4<Number,Number,CharSequence,CharSequence> INFO_REPLICATION_SERVER_CONNECTION_TO_RS =
          new MessageDescriptor.Arg4<Number,Number,CharSequence,CharSequence>(BASE,"INFO_REPLICATION_SERVER_CONNECTION_TO_RS_205",SYNC,INFORMATION,205, getClassLoader());

  /**
   * Replication server RS(%d) has accepted a connection from replication server RS(%d) for domain "%s" at %s
   */
  public static final MessageDescriptor.Arg4<Number,Number,CharSequence,CharSequence> INFO_REPLICATION_SERVER_CONNECTION_FROM_RS =
          new MessageDescriptor.Arg4<Number,Number,CharSequence,CharSequence>(BASE,"INFO_REPLICATION_SERVER_CONNECTION_FROM_RS_206",SYNC,INFORMATION,206, getClassLoader());

  /**
   * Replication server RS(%d) has accepted a connection from directory server DS(%d) for domain "%s" at %s
   */
  public static final MessageDescriptor.Arg4<Number,Number,CharSequence,CharSequence> INFO_REPLICATION_SERVER_CONNECTION_FROM_DS =
          new MessageDescriptor.Arg4<Number,Number,CharSequence,CharSequence>(BASE,"INFO_REPLICATION_SERVER_CONNECTION_FROM_DS_207",SYNC,INFORMATION,207, getClassLoader());

  /**
   * Directory server DS(%d) was unable to connect to any replication servers for domain "%s"
   */
  public static final MessageDescriptor.Arg2<Number,CharSequence> WARN_NO_AVAILABLE_CHANGELOGS =
          new MessageDescriptor.Arg2<Number,CharSequence>(BASE,"SEVERE_WARN_NO_AVAILABLE_CHANGELOGS_208",SYNC,SEVERE_WARNING,208, getClassLoader());

  /**
   * Starting total update: exporting %d entries in domain "%s" from this directory server DS(%d) to all remote directory servers
   */
  public static final MessageDescriptor.Arg3<Number,CharSequence,Number> NOTE_FULL_UPDATE_ENGAGED_FOR_REMOTE_START_ALL =
          new MessageDescriptor.Arg3<Number,CharSequence,Number>(BASE,"NOTICE_FULL_UPDATE_ENGAGED_FOR_REMOTE_START_ALL_209",SYNC,NOTICE,209, getClassLoader());

  /**
   * Finished total update: exported domain "%s" from this directory server DS(%d) to all remote directory servers. %s
   */
  public static final MessageDescriptor.Arg3<CharSequence,Number,CharSequence> NOTE_FULL_UPDATE_ENGAGED_FOR_REMOTE_END_ALL =
          new MessageDescriptor.Arg3<CharSequence,Number,CharSequence>(BASE,"NOTICE_FULL_UPDATE_ENGAGED_FOR_REMOTE_END_ALL_210",SYNC,NOTICE,210, getClassLoader());

  /**
   * The connection from this replication server RS(%d) to directory server DS(%d) at %s for domain "%s" has failed
   */
  public static final MessageDescriptor.Arg4<Number,Number,CharSequence,CharSequence> ERR_DS_BADLY_DISCONNECTED =
          new MessageDescriptor.Arg4<Number,Number,CharSequence,CharSequence>(BASE,"SEVERE_ERR_DS_BADLY_DISCONNECTED_211",SYNC,SEVERE_ERROR,211, getClassLoader());

  /**
   * Directory server DS(%d) timed out while connecting to replication server %s for domain "%s"
   */
  public static final MessageDescriptor.Arg3<Number,CharSequence,CharSequence> WARN_TIMEOUT_CONNECTING_TO_RS =
          new MessageDescriptor.Arg3<Number,CharSequence,CharSequence>(BASE,"SEVERE_WARN_TIMEOUT_CONNECTING_TO_RS_212",SYNC,SEVERE_WARNING,212, getClassLoader());

  /**
   * Directory Server DS(%d) is disconnecting from replication server RS(%d) at %s for domain "%s" in order to find another replication server in the topology and distribute load more equally
   */
  public static final MessageDescriptor.Arg4<Number,Number,CharSequence,CharSequence> NOTE_LOAD_BALANCE_REPLICATION_SERVER =
          new MessageDescriptor.Arg4<Number,Number,CharSequence,CharSequence>(BASE,"NOTICE_LOAD_BALANCE_REPLICATION_SERVER_213",SYNC,NOTICE,213, getClassLoader());


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
            Class<?> c = Class.forName("org.opends.messages.ReplicationMessages");

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
      cl = ReplicationMessages.class.getClassLoader();
    }
    return cl;
  }
}
