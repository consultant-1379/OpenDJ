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
 *      Copyright 2008-2010 Sun Microsystems, Inc.
 */
package org.opends.server.plugins;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.opends.messages.Message;
import org.opends.server.admin.std.server.ReferentialIntegrityPluginCfg;
import org.opends.server.admin.std.server.PluginCfg;
import org.opends.server.admin.std.meta.PluginCfgDefn;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.api.Backend;
import org.opends.server.api.DirectoryThread;
import org.opends.server.api.ServerShutdownListener;
import org.opends.server.api.plugin.*;
import org.opends.server.config.ConfigException;
import org.opends.server.core.DeleteOperation;
import org.opends.server.core.DirectoryServer;
import org.opends.server.core.ModifyOperation;
import org.opends.server.loggers.debug.DebugTracer;
import org.opends.server.protocols.internal.InternalClientConnection;
import org.opends.server.protocols.internal.InternalSearchOperation;
import org.opends.server.types.*;
import org.opends.server.types.operation.SubordinateModifyDNOperation;
import org.opends.server.types.operation.PostOperationModifyDNOperation;
import org.opends.server.types.operation.PostOperationDeleteOperation;

import static org.opends.messages.PluginMessages.*;
import static org.opends.server.loggers.ErrorLogger.*;
import static org.opends.server.loggers.debug.DebugLogger.getTracer;
import static org.opends.server.loggers.debug.DebugLogger.debugEnabled;
import static org.opends.server.schema.SchemaConstants.*;
import static org.opends.server.util.StaticUtils.*;



/**
 * This class implements a Directory Server post operation plugin that performs
 * Referential Integrity processing on successful delete and modify DN
 * operations. The plugin uses a set of configuration criteria to determine
 * what attribute types to check referential integrity on, and, the set of
 * base DNs to search for entries that might need referential integrity
 * processing. If none of these base DNs are specified in the configuration,
 * then the public naming contexts are used as the base DNs by default.
 * <BR><BR>
 * The plugin also has an option to process changes in background using
 * a thread that wakes up periodically looking for change records in a log
 * file.
 */
public class ReferentialIntegrityPlugin
        extends DirectoryServerPlugin<ReferentialIntegrityPluginCfg>
        implements ConfigurationChangeListener<ReferentialIntegrityPluginCfg>,
                   ServerShutdownListener
{
  /**
   * The tracer object for the debug logger.
   */
  private static final DebugTracer TRACER = getTracer();



  //Current plugin configuration.
  private ReferentialIntegrityPluginCfg currentConfiguration;

  //List of attribute types that will be checked during referential integrity
  //processing.
  private LinkedHashSet<AttributeType>
          attributeTypes = new LinkedHashSet<AttributeType>();

  //List of base DNs that limit the scope of the referential integrity checking.
  private Set<DN> baseDNs = new LinkedHashSet<DN>();

  //The update interval the background thread uses. If it is 0, then
  //the changes are processed in foreground.
  private long interval;

  //The flag used by the background thread to check if it should exit.
  private boolean stopRequested=false;

  //The thread name.
  private final String name="Referential Integrity Background Update Thread";

  //The name of the logfile that the update thread uses to process change
  //records. Defaults to "logs/referint", but can be changed in the
  //configuration.
  private String logFileName;

  //The File class that logfile corresponds to.
  private File logFile;

  //The Thread class that the background thread corresponds to.
  private Thread backGroundThread=null;

  /**
   * Used to save a map in the modifyDN operation attachment map that holds
   * the old entry DNs and the new entry DNs related to a modify DN rename to
   * new superior operation.
   */
  public static final String MODIFYDN_DNS="modifyDNs";

  /**
   * Used to save a set in the delete operation attachment map that
   * holds the subordinate entry DNs related to a delete operation.
   */
  public static final String DELETE_DNS="deleteDNs";

  //The buffered reader that is used to read the log file by the background
  //thread.
  private BufferedReader reader;

  //The buffered writer that is used to write update records in the log
  //when the plugin is in background processing mode.
  private BufferedWriter writer;



  /**
   * {@inheritDoc}
   */
  public final void initializePlugin(Set<PluginType> pluginTypes,
                                     ReferentialIntegrityPluginCfg pluginCfg)
         throws ConfigException
  {
    pluginCfg.addReferentialIntegrityChangeListener(this);
    currentConfiguration = pluginCfg;

    for (PluginType t : pluginTypes)
    {
      switch (t)
      {
        case POST_OPERATION_DELETE:
        case POST_OPERATION_MODIFY_DN:
        case SUBORDINATE_MODIFY_DN:
        case SUBORDINATE_DELETE:
          // These are acceptable.
          break;

        default:
          throw new
             ConfigException(ERR_PLUGIN_REFERENT_INVALID_PLUGIN_TYPE.get(
                                  t.toString()));
      }
    }

    Set<DN> cfgBaseDNs = pluginCfg.getBaseDN();
    if ((cfgBaseDNs == null) || cfgBaseDNs.isEmpty())
    {
      cfgBaseDNs = DirectoryServer.getPublicNamingContexts().keySet();
    }
    else
    {
      baseDNs.addAll(cfgBaseDNs);
    }

    // Iterate through all of the defined attribute types and ensure that they
    // have acceptable syntaxes and that they are indexed for equality below all
    // base DNs.
    for (AttributeType type : pluginCfg.getAttributeType())
    {
      if (! isAttributeSyntaxValid(type))
      {
        throw new ConfigException(
                       ERR_PLUGIN_REFERENT_INVALID_ATTRIBUTE_SYNTAX.get(
                            type.getNameOrOID(),
                             type.getSyntax().getSyntaxName()));
      }

      for (DN baseDN : cfgBaseDNs)
      {
        Backend b = DirectoryServer.getBackend(baseDN);
        if ((b != null) && (! b.isIndexed(type, IndexType.EQUALITY)))
        {
          throw new ConfigException(ERR_PLUGIN_REFERENT_ATTR_UNINDEXED.get(
                                         pluginCfg.dn().toString(),
                                         type.getNameOrOID(),
                                         b.getBackendID()));
        }
      }

      attributeTypes.add(type);
    }


    // Set up log file. Note: it is not allowed to change once the plugin is
    // active.
    setUpLogFile(pluginCfg.getLogFile());
    interval=pluginCfg.getUpdateInterval();

    //Set up background processing if interval > 0.
    if(interval > 0)
    {
      setUpBackGroundProcessing();
    }
  }



  /**
   * {@inheritDoc}
   */
  public ConfigChangeResult applyConfigurationChange(
          ReferentialIntegrityPluginCfg newConfiguration)
  {
    ResultCode         resultCode          = ResultCode.SUCCESS;
    boolean            adminActionRequired = false;
    ArrayList<Message> messages            = new ArrayList<Message>();

    //Load base DNs from new configuration.
    LinkedHashSet<DN> newConfiguredBaseDNs = new LinkedHashSet<DN>();
    for(DN baseDN : newConfiguration.getBaseDN())
    {
      newConfiguredBaseDNs.add(baseDN);
    }

    //Load attribute types from new configuration.
    LinkedHashSet<AttributeType> newAttributeTypes =
            new LinkedHashSet<AttributeType>();
    for (AttributeType type : newConfiguration.getAttributeType())
    {
      newAttributeTypes.add(type);
    }

    //User is not allowed to change the logfile name, append a message that the
    //server needs restarting for change to take effect.
    String newLogFileName=newConfiguration.getLogFile();
    if(!logFileName.equals(newLogFileName))
    {
      adminActionRequired=true;
      messages.add(
           INFO_PLUGIN_REFERENT_LOGFILE_CHANGE_REQUIRES_RESTART.get(logFileName,
                newLogFileName));
    }

    //Switch to the new lists.
    baseDNs = newConfiguredBaseDNs;
    attributeTypes = newAttributeTypes;

    //If the plugin is enabled and the interval has changed, process that
    //change. The change might start or stop the background processing thread.
    long newInterval=newConfiguration.getUpdateInterval();
    if(newConfiguration.isEnabled() && newInterval != interval)
      processIntervalChange(newInterval, messages);

    currentConfiguration = newConfiguration;
    return new ConfigChangeResult(resultCode, adminActionRequired, messages);
  }


  /**
   * {@inheritDoc}
   */
  @Override()
  public boolean isConfigurationAcceptable(PluginCfg configuration,
                                           List<Message> unacceptableReasons)
  {
    ReferentialIntegrityPluginCfg cfg =
         (ReferentialIntegrityPluginCfg) configuration;
    return isConfigurationChangeAcceptable(cfg, unacceptableReasons);
  }


  /**
   * {@inheritDoc}
   */
  public boolean isConfigurationChangeAcceptable(
          ReferentialIntegrityPluginCfg configuration,
          List<Message> unacceptableReasons)
  {
    boolean configAcceptable = true;
    for (PluginCfgDefn.PluginType pluginType : configuration.getPluginType())
    {
      switch (pluginType)
      {
        case POSTOPERATIONDELETE:
        case POSTOPERATIONMODIFYDN:
        case SUBORDINATEMODIFYDN:
        case SUBORDINATEDELETE:
          // These are acceptable.
          break;
        default:
          unacceptableReasons.add(ERR_PLUGIN_REFERENT_INVALID_PLUGIN_TYPE.
                                  get(pluginType.toString()));
          configAcceptable = false;
      }
    }

    // Iterate through the set of base DNs that we will check and ensure that
    // the corresponding backend is indexed appropriately.
    Set<DN> cfgBaseDNs = configuration.getBaseDN();
    if ((cfgBaseDNs == null) || cfgBaseDNs.isEmpty())
    {
      cfgBaseDNs = DirectoryServer.getPublicNamingContexts().keySet();
    }
    else
    {
      baseDNs.addAll(cfgBaseDNs);
    }

    //Iterate through attributes and check that each has a valid syntax
    for (AttributeType type : configuration.getAttributeType())
    {
      if (!isAttributeSyntaxValid(type))
      {
        unacceptableReasons.add(
             ERR_PLUGIN_REFERENT_INVALID_ATTRIBUTE_SYNTAX.get(
                  type.getNameOrOID(), type.getSyntax().getSyntaxName()));
        configAcceptable = false;
      }

      for (DN baseDN : cfgBaseDNs)
      {
        Backend b = DirectoryServer.getBackend(baseDN);
        if ((b != null) && (! b.isIndexed(type, IndexType.EQUALITY)))
        {
          unacceptableReasons.add(ERR_PLUGIN_REFERENT_ATTR_UNINDEXED.get(
                                       configuration.dn().toString(),
                                       type.getNameOrOID(), b.getBackendID()));
          configAcceptable = false;
        }
      }
    }

    return configAcceptable;
  }



  /**
   * {@inheritDoc}
   */
  @SuppressWarnings("unchecked")
  public PluginResult.PostOperation
         doPostOperation(PostOperationModifyDNOperation
          modifyDNOperation)
  {
    // If the operation itself failed, then we don't need to do anything because
    // nothing changed.
    if (modifyDNOperation.getResultCode() != ResultCode.SUCCESS)
    {
      return PluginResult.PostOperation.continueOperationProcessing();
    }

    Map<DN,DN>modDNmap=
         (Map<DN, DN>) modifyDNOperation.getAttachment(MODIFYDN_DNS);
    if(modDNmap == null)
    {
      modDNmap=new LinkedHashMap<DN,DN>();
      modifyDNOperation.setAttachment(MODIFYDN_DNS, modDNmap);
    }
    DN oldEntryDN=modifyDNOperation.getOriginalEntry().getDN();
    DN newEntryDN=modifyDNOperation.getUpdatedEntry().getDN();
    modDNmap.put(oldEntryDN, newEntryDN);

    processModifyDN(modDNmap, (interval != 0));

    return PluginResult.PostOperation.continueOperationProcessing();
  }



  /**
   * {@inheritDoc}
   */
  @SuppressWarnings("unchecked")
  public PluginResult.PostOperation doPostOperation(
              PostOperationDeleteOperation deleteOperation)
  {
    // If the operation itself failed, then we don't need to do anything because
    // nothing changed.
    if (deleteOperation.getResultCode() != ResultCode.SUCCESS)
    {
      return PluginResult.PostOperation.continueOperationProcessing();
    }

    Set<DN> deleteDNset =
         (Set<DN>) deleteOperation.getAttachment(DELETE_DNS);
    if(deleteDNset == null)
    {
      deleteDNset = new HashSet<DN>();
      deleteOperation.setAttachment(MODIFYDN_DNS, deleteDNset);
    }
    deleteDNset.add(deleteOperation.getEntryDN());

    processDelete(deleteDNset, (interval != 0));
    return PluginResult.PostOperation.continueOperationProcessing();
  }

  /**
   * {@inheritDoc}
   */
  @SuppressWarnings("unchecked")
  public PluginResult.SubordinateModifyDN processSubordinateModifyDN(
          SubordinateModifyDNOperation modifyDNOperation, Entry oldEntry,
          Entry newEntry, List<Modification> modifications)
  {
    //This cast gives an unchecked cast warning, suppress it since the cast
    //is ok.
    Map<DN,DN>modDNmap=
         (Map<DN, DN>) modifyDNOperation.getAttachment(MODIFYDN_DNS);
    if(modDNmap == null)
    {
      //First time through, create the map and set it in the operation
      //attachment.
      modDNmap=new LinkedHashMap<DN,DN>();
      modifyDNOperation.setAttachment(MODIFYDN_DNS, modDNmap);
    }
    modDNmap.put(oldEntry.getDN(), newEntry.getDN());
    return PluginResult.SubordinateModifyDN.continueOperationProcessing();
  }

  /**
   * {@inheritDoc}
   */
  @SuppressWarnings("unchecked")
  public PluginResult.SubordinateDelete processSubordinateDelete(
          DeleteOperation deleteOperation, Entry entry)
  {
    // This cast gives an unchecked cast warning, suppress it
    // since the cast is ok.
    Set<DN> deleteDNset =
         (Set<DN>) deleteOperation.getAttachment(DELETE_DNS);
    if(deleteDNset == null)
    {
      // First time through, create the set and set it in
      // the operation attachment.
      deleteDNset = new HashSet<DN>();
      deleteOperation.setAttachment(DELETE_DNS, deleteDNset);
    }
    deleteDNset.add(entry.getDN());
    return PluginResult.SubordinateDelete.continueOperationProcessing();
  }

  /**
   * Verify that the specified attribute has either a distinguished name syntax
   * or "name and optional UID" syntax.
   *
   * @param attribute The attribute to check the syntax of.
   *
   * @return  Returns <code>true</code> if the attribute has a valid syntax.
   *
   */
  private boolean isAttributeSyntaxValid(AttributeType attribute)
  {
    return (attribute.getSyntaxOID().equals(SYNTAX_DN_OID) ||
            attribute.getSyntaxOID().equals(SYNTAX_NAME_AND_OPTIONAL_UID_OID));
  }

  /**
   * Process the specifed new interval value. This processing depends on what
   * the current interval value is and new value will be. The values have been
   * checked for equality at this point and are not equal.
   *
   * If the old interval is 0, then the server is in foreground mode and
   * the background thread needs to be started using the new interval value.
   *
   * If the new interval value is 0, the the server is in background mode
   * and the the background thread needs to be stopped.
   *
   * If the user just wants to change the interval value, the background thread
   * needs to be interrupted so that it can use the new interval value.
   *
   * @param newInterval The new interval value to use.
   *
   * @param msgs An array list of messages that thread stop and start messages
   *             can be added to.
   *
   */
  private void processIntervalChange(long newInterval,
                                     ArrayList<Message> msgs) {
    if(interval == 0) {
      DirectoryServer.registerShutdownListener(this);
      interval=newInterval;
      msgs.add(INFO_PLUGIN_REFERENT_BACKGROUND_PROCESSING_STARTING.
              get(Long.toString(interval)));
      setUpBackGroundProcessing();
    } else if(newInterval == 0) {
      Message message=
              INFO_PLUGIN_REFERENT_BACKGROUND_PROCESSING_STOPPING.get();
      msgs.add(message);
      processServerShutdown(message);
      interval=newInterval;
    } else {
      interval=newInterval;
      backGroundThread.interrupt();
      msgs.add(
             INFO_PLUGIN_REFERENT_BACKGROUND_PROCESSING_UPDATE_INTERVAL_CHANGED.
                      get(Long.toString(interval),Long.toString(newInterval)));
    }
  }

  /**
   * Process a modify DN post operation using the specified map of old and new
   * entry DNs.  The boolean "log" is used to determine if the  map
   * is written to the log file for the background thread to pick up. If the
   * map is to be processed in foreground, than each base DN or public
   * naming context (if the base DN configuration is empty) is processed.
   *
   * @param modDNMap  The map of old entry and new entry DNs from the modify
   *                  DN operation.
   *
   * @param log Set to <code>true</code> if the map should be written to a log
   *            file so that the background thread can process the changes at
   *            a later time.
   *
   */
  private void processModifyDN(Map<DN, DN> modDNMap, boolean log)
  {
    if(modDNMap != null)
    {
      if(log)
      {
        writeLog(modDNMap);
      }
      else
      {
        for(DN baseDN : getBaseDNsToSearch())
        {
          doBaseDN(baseDN, modDNMap);
        }
      }
    }
  }

  /**
   * Used by both the background thread and the delete post operation to
   * process a delete operation on the specified entry DN.  The
   * boolean "log" is used to determine if the DN is written to the log file
   * for the background thread to pick up. This value is set to false if the
   * background thread is processing changes. If this method is being called
   * by a delete post operation, then setting the "log" value to false will
   * cause the DN to be processed in foreground
   *
   * If the DN is to be processed, than each base DN or public naming
   * context (if the base DN configuration is empty) is is checked to see if
   * entries under it contain references to the deleted entry DN that need
   * to be removed.
   *
   * @param entryDN  The DN of the deleted entry.
   *
   * @param log Set to <code>true</code> if the DN should be written to a log
   *            file so that the background thread can process the change at
   *            a later time.
   *
   */
  private void processDelete(Set<DN> deleteDNset, boolean log)
  {
    if(log)
    {
      writeLog(deleteDNset);
    }
    else
    {
      for(DN baseDN : getBaseDNsToSearch())
      {
        doBaseDN(baseDN, deleteDNset);
      }
    }
  }

  /**
   * Used by the background thread to process the specified old entry DN and
   * new entry DN. Each base DN or public naming context (if the base DN
   * configuration is empty) is checked to see  if they contain entries with
   * references to the old entry DN that need to be changed to the new entry DN.
   *
   * @param oldEntryDN  The entry DN before the modify DN operation.
   *
   * @param newEntryDN The entry DN after the modify DN operation.
   *
   */
  private void processModifyDN(DN oldEntryDN, DN newEntryDN)
  {
    for(DN baseDN : getBaseDNsToSearch())
    {
      searchBaseDN(baseDN, oldEntryDN, newEntryDN);
    }
  }

  /**
   * Return a set of DNs that are used to search for references under. If the
   * base DN configuration set is empty, then the public naming contexts
   * are used.
   *
   * @return A set of DNs to use in the reference searches.
   *
   */
  private Set<DN> getBaseDNsToSearch()
  {
    if(baseDNs.isEmpty())
    {
      return DirectoryServer.getPublicNamingContexts().keySet();
    }
    else
    {
      return baseDNs;
    }
  }

  /**
   * Search a base DN using a filter built from the configured attribute
   * types and the specified old entry DN. For each entry that is found from
   * the search, delete the old entry DN from the entry. If the new entry
   * DN is not null, then add it to the entry.
   *
   * @param baseDN  The DN to base the search at.
   *
   * @param oldEntryDN The old entry DN that needs to be deleted or replaced.
   *
   * @param newEntryDN The new entry DN that needs to be added. May be null
   *                   if the original operation was a delete.
   *
   */
  private void searchBaseDN(DN baseDN, DN oldEntryDN, DN newEntryDN)
  {
    //Build an equality search with all of the configured attribute types
    //and the old entry DN.
    HashSet<SearchFilter> componentFilters=new HashSet<SearchFilter>();
    for(AttributeType attributeType : attributeTypes)
    {
      componentFilters.add(SearchFilter.createEqualityFilter(attributeType,
          AttributeValues.create(attributeType, oldEntryDN.toString())));
    }

    InternalClientConnection conn =
         InternalClientConnection.getRootConnection();
    InternalSearchOperation operation = conn.processSearch(baseDN,
         SearchScope.WHOLE_SUBTREE, DereferencePolicy.NEVER_DEREF_ALIASES, 0, 0,
         false, SearchFilter.createORFilter(componentFilters), null);

    switch (operation.getResultCode())
    {
      case SUCCESS:
        break;

      case NO_SUCH_OBJECT:
        logError(INFO_PLUGIN_REFERENT_SEARCH_NO_SUCH_OBJECT.get(
                      baseDN.toString()));
        return;

      default:
        Message message1 = ERR_PLUGIN_REFERENT_SEARCH_FAILED.
                get(String.valueOf(operation.getErrorMessage()));
        logError(message1);
        return;
    }

    for (SearchResultEntry entry : operation.getSearchEntries())
    {
      deleteAddAttributesEntry(entry, oldEntryDN, newEntryDN);
    }
  }

  /**
   * This method is used in foreground processing of a modify DN operation.
   * It uses the specified map to perform base DN searching for each map
   * entry. The key is the old entry DN and the value is the
   * new entry DN.
   *
   * @param baseDN The DN to base the search at.
   *
   * @param modifyDNmap The map containing the modify DN old and new entry DNs.
   *
   */
  private void doBaseDN(DN baseDN, Map<DN,DN> modifyDNmap)
  {
    for(Map.Entry<DN,DN> mapEntry: modifyDNmap.entrySet())
    {
      searchBaseDN(baseDN, mapEntry.getKey(), mapEntry.getValue());
    }
  }

  /**
   * This method is used in foreground processing of a delete operation.
   * It uses the specified set to perform base DN searching for each
   * element.
   *
   * @param baseDN The DN to base the search at.
   *
   * @param deleteDNset The set containing the delete DNs.
   *
   */
  private void doBaseDN(DN baseDN, Set<DN> deleteDNset)
  {
    for(DN deletedEntryDN : deleteDNset)
    {
      searchBaseDN(baseDN, deletedEntryDN, null);
    }
  }

  /**
   * For each attribute type, delete the specified old entry DN and
   * optionally add the specified new entry DN if the DN is not null.
   * The specified entry is used to see if it contains each attribute type so
   * those types that the entry contains can be modified. An internal modify
   * is performed to change the entry.
   *
   * @param e The entry that contains the old references.
   *
   * @param oldEntryDN The old entry DN to remove references to.
   *
   * @param newEntryDN The new entry DN to add a reference to, if it is not
   *                   null.
   *
   */
  private void deleteAddAttributesEntry(Entry e, DN oldEntryDN, DN newEntryDN)
  {
    LinkedList<Modification> mods = new LinkedList<Modification>();
    DN entryDN=e.getDN();
    for(AttributeType type : attributeTypes)
    {
      if(e.hasAttribute(type))
      {
        AttributeValue value = AttributeValues
            .create(type, oldEntryDN.toString());
        if (e.hasValue(type, null, value))
        {
          mods.add(new Modification(ModificationType.DELETE, Attributes
              .create(type, value)));

          // If the new entry DN exists, create an ADD modification for
          // it.
          if(newEntryDN != null)
          {
            mods.add(new Modification(ModificationType.ADD, Attributes
                .create(type, newEntryDN.toString())));
          }
        }
      }
    }

    InternalClientConnection conn =
            InternalClientConnection.getRootConnection();
    ModifyOperation modifyOperation =
            conn.processModify(entryDN, mods);
    if(modifyOperation.getResultCode() != ResultCode.SUCCESS)
    {
      logError(ERR_PLUGIN_REFERENT_MODIFY_FAILED.get(entryDN.toString(),
                      String.valueOf(modifyOperation.getErrorMessage())));
    }
  }

  /**
   * Sets up the log file that the plugin can write update recored to and
   * the background thread can use to read update records from. The specifed
   * log file name is the name to use for the file. If the file exists from
   * a previous run, use it.
   *
   * @param logFileName The name of the file to use, may be absolute.
   *
   * @throws ConfigException If a new file cannot be created if needed.
   *
   */
  private void setUpLogFile(String logFileName)
          throws ConfigException
  {
    this.logFileName=logFileName;
    logFile=getFileForPath(logFileName);

    try
    {
      if(!logFile.exists())
      {
        logFile.createNewFile();
      }
    }
    catch (IOException io)
    {
      throw new ConfigException(ERR_PLUGIN_REFERENT_CREATE_LOGFILE.get(
                                     io.getMessage()), io);
    }
  }

  /**
   * Sets up a buffered writer that the plugin can use to write update records
   * with.
   *
   * @throws IOException If a new file writer cannot be created.
   *
   */
  private void setupWriter() throws IOException {
    writer=new BufferedWriter(new FileWriter(logFile, true));
  }


  /**
   * Sets up a buffered reader that the background thread can use to read
   * update records with.
   *
   * @throws IOException If a new file reader cannot be created.
   *
   */
  private void setupReader() throws IOException {
    reader=new BufferedReader(new FileReader(logFile));
  }

  /**
   * Write the specified map of old entry and new entry DNs to the log
   * file. Each entry of the map is a line in the file, the key is the old
   * entry normalized DN and the value is the new entry normalized DN.
   * The DNs are separated by the tab character. This map is related to a
   * modify DN operation.
   *
   * @param modDNmap The map of old entry and new entry DNs.
   *
   */
  private void writeLog(Map<DN,DN> modDNmap) {
    synchronized(logFile)
    {
      try
      {
        setupWriter();
        for(Map.Entry<DN,DN> mapEntry : modDNmap.entrySet())
        {
          writer.write(mapEntry.getKey().toNormalizedString() + "\t" +
                  mapEntry.getValue().toNormalizedString());
          writer.newLine();
        }
        writer.flush();
        writer.close();
      }
      catch (IOException io)
      {
        logError(ERR_PLUGIN_REFERENT_CLOSE_LOGFILE.get(io.getMessage()));
      }
    }
  }

  /**
   * Write the specified entry DNs to the log file.
   * These entry DNs are related to a delete operation.
   *
   * @param deletedEntryDN The DN of the deleted entry.
   *
   */
  private void writeLog(Set<DN> deleteDNset) {
    synchronized(logFile)
    {
      try
      {
        setupWriter();
        for (DN deletedEntryDN : deleteDNset)
        {
          writer.write(deletedEntryDN.toNormalizedString());
          writer.newLine();
        }
        writer.flush();
        writer.close();
      }
      catch (IOException io)
      {
        logError(ERR_PLUGIN_REFERENT_CLOSE_LOGFILE.get(io.getMessage()));
      }
    }
  }

  /**
   * Process all of the records in the log file. Each line of the file is read
   * and parsed to determine if it was a delete operation (a single normalized
   * DN) or a modify DN operation (two normalized DNs separated by a tab). The
   * corresponding operation method is called to perform the referential
   * integrity processing as though the operation was just processed. After
   * all of the records in log file have been processed, the log file is
   * cleared so that new records can be added.
   *
   */
  private void processLog() {
    synchronized(logFile) {
      try {
        if(logFile.length() == 0)
        {
          return;
        }

        setupReader();
        String line;
        while((line=reader.readLine()) != null) {
          try {
            String[] a=line.split("[\t]");
            DN origDn = DN.decode(a[0]);
            //If there is only a single DN string than it must be a delete.
            if(a.length == 1) {
              processDelete(Collections.singleton(origDn), false);
            } else {
              DN movedDN=DN.decode(a[1]);
              processModifyDN(origDn, movedDN);
            }
          } catch (DirectoryException ex) {
            //This exception should rarely happen since the plugin wrote the DN
            //strings originally.
            Message message=
                    ERR_PLUGIN_REFERENT_CANNOT_DECODE_STRING_AS_DN.
                                                           get(ex.getMessage());
            logError(message);
          }
        }
        reader.close();
        logFile.delete();
        logFile.createNewFile();
      } catch (IOException io) {
        logError(ERR_PLUGIN_REFERENT_REPLACE_LOGFILE.get(io.getMessage()));
      }
    }
  }

  /**
   * Return the listener name.
   *
   * @return The name of the listener.
   *
   */
  public String getShutdownListenerName() {
    return name;
  }


  /**
   * {@inheritDoc}
   */
  @Override()
  public final void finalizePlugin() {
    currentConfiguration.removeReferentialIntegrityChangeListener(this);
    if(interval > 0)
    {
      processServerShutdown(null);
    }
  }

  /**
   * Process a server shutdown. If the background thread is running it needs
   * to be interrupted so it can read the stop request variable and exit.
   *
   * @param reason The reason message for the shutdown.
   *
   */
  public void processServerShutdown(Message reason)
  {
    stopRequested = true;

    // Wait for back ground thread to terminate
    while (backGroundThread != null && backGroundThread.isAlive()) {
      try {
        // Interrupt if its sleeping
        backGroundThread.interrupt();
        backGroundThread.join();
      }
      catch (InterruptedException ex) {
        //Expected.
      }
    }
    DirectoryServer.deregisterShutdownListener(this);
    backGroundThread=null;
  }


  /**
   * Returns the interval time converted to milliseconds.
   *
   * @return The interval time for the background thread.
   */
  private long getInterval() {
    return interval * 1000;
  }

  /**
   * Sets up background processing of referential integrity by creating a
   * new background thread to process updates.
   *
   */
  private void setUpBackGroundProcessing()  {
    if(backGroundThread == null) {
      DirectoryServer.registerShutdownListener(this);
      stopRequested = false;
      backGroundThread = new BackGroundThread();
      backGroundThread.start();
    }
  }


  /**
   * Used by the background thread to determine if it should exit.
   *
   * @return Returns <code>true</code> if the background thread should exit.
   *
   */
  private boolean isShuttingDown()  {
    return stopRequested;
  }

  /**
   * The background referential integrity processing thread. Wakes up after
   * sleeping for a configurable interval and checks the log file for update
   * records.
   *
   */
  private class BackGroundThread extends DirectoryThread {

    /**
     * Constructor for the background thread.
     */
    public
    BackGroundThread() {
      super(name);
    }

    /**
     * Run method for the background thread.
     */
    public void run() {
      while(!isShuttingDown())  {
        try {
          sleep(getInterval());
        } catch(InterruptedException e) {
          continue;
        } catch(Exception e) {
          if (debugEnabled()) {
            TRACER.debugCaught(DebugLogLevel.ERROR, e);
          }
        }
        processLog();
      }
    }
  }
}
