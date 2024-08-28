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
 *      Portions Copyright 2011 ForgeRock AS
 */
package org.opends.server.workflowelement.localbackend;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;

import org.opends.messages.Message;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.server.ServerManagementContext;
import org.opends.server.admin.std.server.BackendCfg;
import org.opends.server.admin.std.server.LocalBackendWorkflowElementCfg;
import org.opends.server.admin.std.server.RootCfg;
import org.opends.server.api.Backend;
import org.opends.server.config.ConfigException;
import org.opends.server.controls.LDAPPostReadRequestControl;
import org.opends.server.controls.LDAPPostReadResponseControl;
import org.opends.server.controls.LDAPPreReadRequestControl;
import org.opends.server.controls.LDAPPreReadResponseControl;
import org.opends.server.core.*;
import org.opends.server.types.*;
import org.opends.server.workflowelement.LeafWorkflowElement;

import static org.opends.server.config.ConfigConstants.*;




/**
 * This class defines a local backend workflow element; e-g an entity that
 * handle the processing of an operation against a local backend.
 */
public class LocalBackendWorkflowElement extends
    LeafWorkflowElement<LocalBackendWorkflowElementCfg>
    implements ConfigurationChangeListener<LocalBackendWorkflowElementCfg>
{
  // the backend associated with the local workflow element
  private Backend backend;


  // the set of local backend workflow elements registered with the server
  private static TreeMap<String, LocalBackendWorkflowElement>
       registeredLocalBackends =
            new TreeMap<String, LocalBackendWorkflowElement>();

  // The set of persistent searches registered with this work flow
  // element.
  private final List<PersistentSearch> persistentSearches =
    new CopyOnWriteArrayList<PersistentSearch>();

  // a lock to guarantee safe concurrent access to the registeredLocalBackends
  // variable
  private static final Object registeredLocalBackendsLock = new Object();


  // A string indicating the type of the workflow element.
  private final String BACKEND_WORKFLOW_ELEMENT = "Backend";


  /**
   * Creates a new instance of the local backend workflow element.
   */
  public LocalBackendWorkflowElement()
  {
    // There is nothing to do in this constructor.
  }


  /**
   * Initializes a new instance of the local backend workflow element.
   * This method is intended to be called by DirectoryServer when
   * workflow configuration mode is auto as opposed to
   * initializeWorkflowElement which is invoked when workflow
   * configuration mode is manual.
   *
   * @param workflowElementID  the workflow element identifier
   * @param backend  the backend associated to that workflow element
   */
  private void initialize(String workflowElementID, Backend backend)
  {
    // Initialize the workflow ID
    super.initialize(workflowElementID, BACKEND_WORKFLOW_ELEMENT);

    this.backend  = backend;

    if (this.backend != null)
    {
      setPrivate(this.backend.isPrivateBackend());
    }
  }


  /**
   * Initializes a new instance of the local backend workflow element.
   * This method is intended to be called by DirectoryServer when
   * workflow configuration mode is manual as opposed to
   * initialize(String,Backend) which is invoked when workflow
   * configuration mode is auto.
   *
   * @param  configuration  The configuration for this local backend
   *                        workflow element.
   *
   * @throws  ConfigException  If there is a problem with the provided
   *                           configuration.
   *
   * @throws  InitializationException  If an error occurs while trying
   *                                   to initialize this workflow
   *                                   element that is not related to
   *                                   the provided configuration.
   */
  public void initializeWorkflowElement(
      LocalBackendWorkflowElementCfg configuration
      ) throws ConfigException, InitializationException
  {
    configuration.addLocalBackendChangeListener(this);

    // Read configuration and apply changes.
    processWorkflowElementConfig(configuration, true);
  }


  /**
   * {@inheritDoc}
   */
  @Override
  public void finalizeWorkflowElement()
  {
    // null all fields so that any use of the finalized object will raise
    // an NPE
    super.initialize(null, null);
    backend = null;

    // Cancel all persistent searches.
    for (PersistentSearch psearch : persistentSearches) {
      psearch.cancel();
    }
    persistentSearches.clear();
  }


  /**
   * {@inheritDoc}
   */
  public boolean isConfigurationChangeAcceptable(
      LocalBackendWorkflowElementCfg configuration,
      List<Message>                  unacceptableReasons
      )
  {
    boolean isAcceptable =
      processWorkflowElementConfig(configuration, false);

    return isAcceptable;
  }


  /**
   * {@inheritDoc}
   */
  public ConfigChangeResult applyConfigurationChange(
      LocalBackendWorkflowElementCfg configuration
      )
  {
    // Returned result.
    ConfigChangeResult changeResult = new ConfigChangeResult(
        ResultCode.SUCCESS, false, new ArrayList<Message>()
        );

    processWorkflowElementConfig(configuration, true);

    return changeResult;
  }


  /**
   * Parses the provided configuration and configure the workflow element.
   *
   * @param configuration  The new configuration containing the changes.
   * @param applyChanges   If true then take into account the new configuration.
   *
   * @return  <code>true</code> if the configuration is acceptable.
   */
  private boolean processWorkflowElementConfig(
      LocalBackendWorkflowElementCfg configuration,
      boolean                        applyChanges
      )
  {
    // returned status
    boolean isAcceptable = true;

    // If the workflow element is disabled then do nothing. Note that the
    // configuration manager could have finalized the object right before.
    if (configuration.isEnabled())
    {
      // Read configuration.
      String newBackendID = configuration.getBackend();
      Backend newBackend  = DirectoryServer.getBackend(newBackendID);

      // If the backend is null (i.e. not found in the list of
      // registered backends, this is probably because we are looking
      // for the config backend
      if (newBackend == null) {
        ServerManagementContext context = ServerManagementContext.getInstance();
        RootCfg root = context.getRootConfiguration();
        try {
          BackendCfg backendCfg = root.getBackend(newBackendID);
          if (backendCfg.getBaseDN().contains(DN.decode(DN_CONFIG_ROOT))) {
            newBackend = DirectoryServer.getConfigHandler();
          }
        } catch (Exception ex) {
          // Unable to find the backend
          newBackend = null;
        }
      }

      // Get the new configuration
      if (applyChanges)
      {
        super.initialize(
          configuration.dn().getRDN().getAttributeValue(0).toString(),
          BACKEND_WORKFLOW_ELEMENT);
        backend = newBackend;
        if (backend != null)
        {
          setPrivate(backend.isPrivateBackend());
        }
      }
    }

    return isAcceptable;
  }


  /**
   * Creates and registers a local backend with the server.
   *
   * @param workflowElementID  the identifier of the workflow element to create
   * @param backend            the backend to associate with the local backend
   *                           workflow element
   *
   * @return the existing local backend workflow element if it was
   *         already created or a newly created local backend workflow
   *         element.
   */
  public static LocalBackendWorkflowElement createAndRegister(
      String workflowElementID,
      Backend backend)
  {
    LocalBackendWorkflowElement localBackend = null;

    // If the requested workflow element does not exist then create one.
    localBackend = registeredLocalBackends.get(workflowElementID);
    if (localBackend == null)
    {
      localBackend = new LocalBackendWorkflowElement();
      localBackend.initialize(workflowElementID, backend);

      // store the new local backend in the list of registered backends
      registerLocalBackend(localBackend);
    }

    return localBackend;
  }



  /**
   * Removes a local backend that was registered with the server.
   *
   * @param workflowElementID  the identifier of the workflow element to remove
   */
  public static void remove(String workflowElementID)
  {
    deregisterLocalBackend(workflowElementID);
  }



  /**
   * Removes all the local backends that were registered with the server.
   * This function is intended to be called when the server is shutting down.
   */
  public static void removeAll()
  {
    synchronized (registeredLocalBackendsLock)
    {
      for (LocalBackendWorkflowElement localBackend:
           registeredLocalBackends.values())
      {
        deregisterLocalBackend(localBackend.getWorkflowElementID());
      }
    }
  }



  /**
   * Adds the post-read response control to the response if requested.
   *
   * @param operation
   *          The update operation.
   * @param postReadRequest
   *          The request control, if present.
   * @param entry
   *          The post-update entry.
   */
  static void addPostReadResponse(final Operation operation,
      final LDAPPostReadRequestControl postReadRequest, final Entry entry)
  {
    if (postReadRequest == null)
    {
      return;
    }

    // Even though the associated update succeeded, we should still check
    // whether or not we should return the entry.
    final SearchResultEntry unfilteredEntry =
      new SearchResultEntry(entry, null);
    if (AccessControlConfigManager.getInstance().getAccessControlHandler()
        .maySend(operation, unfilteredEntry) == false)
    {
      return;
    }

    final SearchResultEntry filteredEntry = new SearchResultEntry(
        entry.duplicate(true), null);

    if (!postReadRequest.allowsAttribute(DirectoryServer
        .getObjectClassAttributeType()))
    {
      filteredEntry.removeAttribute(DirectoryServer
          .getObjectClassAttributeType());
    }

    if (!postReadRequest.returnAllUserAttributes())
    {
      Iterator<AttributeType> iterator = filteredEntry.getUserAttributes()
          .keySet().iterator();
      while (iterator.hasNext())
      {
        final AttributeType attrType = iterator.next();
        if (!postReadRequest.allowsAttribute(attrType))
        {
          iterator.remove();
        }
      }
    }

    if (!postReadRequest.returnAllOperationalAttributes())
    {
      final Iterator<AttributeType> iterator = filteredEntry
          .getOperationalAttributes().keySet().iterator();
      while (iterator.hasNext())
      {
        AttributeType attrType = iterator.next();
        if (!postReadRequest.allowsAttribute(attrType))
        {
          iterator.remove();
        }
      }
    }

    // Strip out any attributes which access control denies access to.
    AccessControlConfigManager.getInstance().getAccessControlHandler()
        .filterEntry(operation, unfilteredEntry, filteredEntry);

    final LDAPPostReadResponseControl responseControl =
      new LDAPPostReadResponseControl(filteredEntry);
    operation.addResponseControl(responseControl);
  }



  /**
   * Adds the pre-read response control to the response if requested.
   *
   * @param operation
   *          The update operation.
   * @param preReadRequest
   *          The request control, if present.
   * @param entry
   *          The pre-update entry.
   */
  static void addPreReadResponse(final Operation operation,
      final LDAPPreReadRequestControl preReadRequest, final Entry entry)
  {
    if (preReadRequest == null)
    {
      return;
    }

    // Even though the associated update succeeded, we should still check
    // whether or not we should return the entry.
    final SearchResultEntry unfilteredEntry =
      new SearchResultEntry(entry, null);
    if (AccessControlConfigManager.getInstance().getAccessControlHandler()
        .maySend(operation, unfilteredEntry) == false)
    {
      return;
    }

    final SearchResultEntry filteredEntry = new SearchResultEntry(
        entry.duplicate(true), null);

    if (!preReadRequest.allowsAttribute(DirectoryServer
        .getObjectClassAttributeType()))
    {
      filteredEntry.removeAttribute(DirectoryServer
          .getObjectClassAttributeType());
    }

    if (!preReadRequest.returnAllUserAttributes())
    {
      Iterator<AttributeType> iterator = filteredEntry.getUserAttributes()
          .keySet().iterator();
      while (iterator.hasNext())
      {
        final AttributeType attrType = iterator.next();
        if (!preReadRequest.allowsAttribute(attrType))
        {
          iterator.remove();
        }
      }
    }

    if (!preReadRequest.returnAllOperationalAttributes())
    {
      final Iterator<AttributeType> iterator = filteredEntry
          .getOperationalAttributes().keySet().iterator();
      while (iterator.hasNext())
      {
        AttributeType attrType = iterator.next();
        if (!preReadRequest.allowsAttribute(attrType))
        {
          iterator.remove();
        }
      }
    }

    // Strip out any attributes which access control denies access to.
    AccessControlConfigManager.getInstance().getAccessControlHandler()
        .filterEntry(operation, unfilteredEntry, filteredEntry);

    final LDAPPreReadResponseControl responseControl =
      new LDAPPreReadResponseControl(filteredEntry);
    operation.addResponseControl(responseControl);
  }



  /**
   * Registers a local backend with the server.
   *
   * @param localBackend  the local backend to register with the server
   */
  private static void registerLocalBackend(
                           LocalBackendWorkflowElement localBackend)
  {
    synchronized (registeredLocalBackendsLock)
    {
      String localBackendID = localBackend.getWorkflowElementID();
      LocalBackendWorkflowElement existingLocalBackend =
        registeredLocalBackends.get(localBackendID);

      if (existingLocalBackend == null)
      {
        TreeMap<String, LocalBackendWorkflowElement> newLocalBackends =
          new TreeMap
            <String, LocalBackendWorkflowElement>(registeredLocalBackends);
        newLocalBackends.put(localBackendID, localBackend);
        registeredLocalBackends = newLocalBackends;
      }
    }
  }



  /**
   * Deregisters a local backend with the server.
   *
   * @param workflowElementID  the identifier of the workflow element to remove
   */
  private static void deregisterLocalBackend(String workflowElementID)
  {
    synchronized (registeredLocalBackendsLock)
    {
      LocalBackendWorkflowElement existingLocalBackend =
        registeredLocalBackends.get(workflowElementID);

      if (existingLocalBackend != null)
      {
        TreeMap<String, LocalBackendWorkflowElement> newLocalBackends =
             new TreeMap<String, LocalBackendWorkflowElement>(
                      registeredLocalBackends);
        newLocalBackends.remove(workflowElementID);
        registeredLocalBackends = newLocalBackends;
      }
    }
  }



  /**
   * {@inheritDoc}
   */
  public void execute(Operation operation) throws CanceledOperationException {
    switch (operation.getOperationType())
    {
      case BIND:
        LocalBackendBindOperation bindOperation =
             new LocalBackendBindOperation((BindOperation) operation);
        bindOperation.processLocalBind(this);
        break;

      case SEARCH:
        LocalBackendSearchOperation searchOperation =
             new LocalBackendSearchOperation((SearchOperation) operation);
        searchOperation.processLocalSearch(this);
        break;

      case ADD:
        LocalBackendAddOperation addOperation =
             new LocalBackendAddOperation((AddOperation) operation);
        addOperation.processLocalAdd(this);
        break;

      case DELETE:
        LocalBackendDeleteOperation deleteOperation =
             new LocalBackendDeleteOperation((DeleteOperation) operation);
        deleteOperation.processLocalDelete(this);
        break;

      case MODIFY:
        LocalBackendModifyOperation modifyOperation =
             new LocalBackendModifyOperation((ModifyOperation) operation);
        modifyOperation.processLocalModify(this);
        break;

      case MODIFY_DN:
        LocalBackendModifyDNOperation modifyDNOperation =
             new LocalBackendModifyDNOperation((ModifyDNOperation) operation);
        modifyDNOperation.processLocalModifyDN(this);
        break;

      case COMPARE:
        LocalBackendCompareOperation compareOperation =
             new LocalBackendCompareOperation((CompareOperation) operation);
        compareOperation.processLocalCompare(this);
        break;

      case ABANDON:
        // There is no processing for an abandon operation.
        break;

      default:
        throw new AssertionError("Attempted to execute an invalid operation " +
                                 "type:  " + operation.getOperationType() +
                                 " (" + operation + ")");
    }
  }



  /**
   * Attaches the current local operation to the global operation so that
   * operation runner can execute local operation post response later on.
   *
   * @param <O>              subtype of Operation
   * @param <L>              subtype of LocalBackendOperation
   * @param globalOperation  the global operation to which local operation
   *                         should be attached to
   * @param currentLocalOperation  the local operation to attach to the global
   *                               operation
   */
  @SuppressWarnings("unchecked")
  public static final <O extends Operation,L> void
              attachLocalOperation (O globalOperation, L currentLocalOperation)
  {
    List<?> existingAttachment =
      (List<?>) globalOperation.getAttachment(Operation.LOCALBACKENDOPERATIONS);

    List<L> newAttachment = new ArrayList<L>();

    if (existingAttachment != null)
    {
      // This line raises an unchecked conversion warning.
      // There is nothing we can do to prevent this warning
      // so let's get rid of it since we know the cast is safe.
      newAttachment.addAll ((List<L>) existingAttachment);
    }
    newAttachment.add (currentLocalOperation);
    globalOperation.setAttachment(Operation.LOCALBACKENDOPERATIONS,
                                  newAttachment);
  }



  /**
   * Gets the backend associated with this local backend workflow
   * element.
   *
   * @return The backend associated with this local backend workflow
   *         element.
   */
  public Backend getBackend()
  {
    return backend;
  }



  /**
   * Registers the provided persistent search operation with this
   * local backend workflow element so that it will be notified of any
   * add, delete, modify, or modify DN operations that are performed.
   *
   * @param persistentSearch
   *          The persistent search operation to register with this
   *          local backend workflow element.
   */
  void registerPersistentSearch(PersistentSearch persistentSearch)
  {
    PersistentSearch.CancellationCallback callback =
      new PersistentSearch.CancellationCallback()
    {
      public void persistentSearchCancelled(PersistentSearch psearch)
      {
        persistentSearches.remove(psearch);
      }
    };

    persistentSearches.add(persistentSearch);
    persistentSearch.registerCancellationCallback(callback);
  }



  /**
   * Gets the list of persistent searches currently active against
   * this local backend workflow element.
   *
   * @return The list of persistent searches currently active against
   *         this local backend workflow element.
   */
  List<PersistentSearch> getPersistentSearches()
  {
    return persistentSearches;
  }
}

