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
 *      Portions Copyright 2011 ForgeRock AS
 */
package org.opends.server.core;

import org.opends.messages.MessageBuilder;
import org.opends.messages.Message;

import java.util.List;
import java.util.Map;

import org.opends.server.api.ClientConnection;
import org.opends.server.types.*;
import org.opends.server.controls.ControlDecoder;


/**
 * This abstract class is a generic operation wrapper intended to be
 * subclassed by a specific operation wrapper.
 */
public class OperationWrapper implements Operation
{
  // The wrapped operation.
  private Operation operation;


  /**
   * Creates a new generic operation wrapper.
   *
   * @param operation  the generic operation to wrap
   */
  public OperationWrapper(Operation operation)
  {
    this.operation = operation;
  }

  /**
   * {@inheritDoc}
   */
  public void addRequestControl(Control control)
  {
    operation.addRequestControl(control);
  }

  /**
   * {@inheritDoc}
   */
  public void addResponseControl(Control control)
  {
    operation.addResponseControl(control);
  }

  /**
   * {@inheritDoc}
   */
  public void appendAdditionalLogMessage(Message message)
  {
    operation.appendAdditionalLogMessage(message);
  }

  /**
   * {@inheritDoc}
   */
  public void appendErrorMessage(Message message)
  {
    operation.appendErrorMessage(message);
  }

  /**
   * {@inheritDoc}
   */
  public CancelResult cancel(CancelRequest cancelRequest)
  {
    return operation.cancel(cancelRequest);
  }

  /**
   * {@inheritDoc}
   */
  public void abort(CancelRequest cancelRequest)
  {
    operation.abort(cancelRequest);
  }

  /**
   * {@inheritDoc}
   */
  public void disconnectClient(
          DisconnectReason disconnectReason,
          boolean sendNotification,
          Message message
  )
  {
    operation.disconnectClient(
      disconnectReason, sendNotification, message);
  }

  /**
   * {@inheritDoc}
   */
  public boolean dontSynchronize()
  {
    return operation.dontSynchronize();
  }

  /**
   * {@inheritDoc}
   */
  public MessageBuilder getAdditionalLogMessage()
  {
    return operation.getAdditionalLogMessage();
  }

  /**
   * {@inheritDoc}
   */
  public Object getAttachment(String name)
  {
    return operation.getAttachment(name);
  }

  /**
   * {@inheritDoc}
   */
  public Map<String, Object> getAttachments()
  {
    return operation.getAttachments();
  }

  /**
   * {@inheritDoc}
   */
  public DN getAuthorizationDN()
  {
    return operation.getAuthorizationDN();
  }

  /**
   * {@inheritDoc}
   */
  public Entry getAuthorizationEntry()
  {
    return operation.getAuthorizationEntry();
  }

  /**
   * {@inheritDoc}
   */
  public CancelRequest getCancelRequest()
  {
    return operation.getCancelRequest();
  }

  /**
   * {@inheritDoc}
   */
  public CancelResult getCancelResult()
  {
    return operation.getCancelResult();
  }

  /**
   * {@inheritDoc}
   */
  public ClientConnection getClientConnection()
  {
    return operation.getClientConnection();
  }

  /**
   * {@inheritDoc}
   */
  public String[][] getCommonLogElements()
  {
    return operation.getCommonLogElements();
  }

  /**
   * {@inheritDoc}
   */
  public long getConnectionID()
  {
    return operation.getConnectionID();
  }

  /**
   * {@inheritDoc}
   */
  public MessageBuilder getErrorMessage()
  {
    return operation.getErrorMessage();
  }

  /**
   * {@inheritDoc}
   */
  public DN getMatchedDN()
  {
    return operation.getMatchedDN();
  }

  /**
   * {@inheritDoc}
   */
  public int getMessageID()
  {
    return operation.getMessageID();
  }

  /**
   * {@inheritDoc}
   */
  public long getOperationID()
  {
    return operation.getOperationID();
  }

  /**
   * {@inheritDoc}
   */
  public OperationType getOperationType()
  {
    return operation.getOperationType();
  }

  /**
   * {@inheritDoc}
   */
  public long getProcessingStartTime()
  {
    return operation.getProcessingStartTime();
  }

  /**
   * {@inheritDoc}
   */
  public long getProcessingStopTime()
  {
    return operation.getProcessingStopTime();
  }

  /**
   * {@inheritDoc}
   */
  public long getProcessingTime()
  {
    return operation.getProcessingTime();
  }

  /**
   * {@inheritDoc}
   */
  public long getProcessingNanoTime()
  {
    return operation.getProcessingNanoTime();
  }

  /**
   * {@inheritDoc}
   */
  public List<String> getReferralURLs()
  {
    return operation.getReferralURLs();
  }

  /**
   * {@inheritDoc}
   */
  public List<Control> getRequestControls()
  {
    return operation.getRequestControls();
  }

  /**
   * {@inheritDoc}
   */
  public <T extends Control> T getRequestControl(
      ControlDecoder<T> d)throws DirectoryException
  {
    return operation.getRequestControl(d);
  }

  /**
   * {@inheritDoc}
   */
  public String[][] getRequestLogElements()
  {
    return operation.getRequestLogElements();
  }

  /**
   * {@inheritDoc}
   */
  public List<Control> getResponseControls()
  {
    return operation.getResponseControls();
  }

  /**
   * {@inheritDoc}
   */
  public String[][] getResponseLogElements()
  {
    return operation.getResponseLogElements();
  }

  /**
   * {@inheritDoc}
   */
  public ResultCode getResultCode()
  {
    return operation.getResultCode();
  }

  /**
   * {@inheritDoc}
   */
  public boolean isInternalOperation()
  {
    return operation.isInternalOperation();
  }

  /**
   * {@inheritDoc}
   */
  public boolean isSynchronizationOperation()
  {
    return operation.isSynchronizationOperation();
  }

  /**
   * {@inheritDoc}
   */
  public void operationCompleted()
  {
    operation.operationCompleted();
  }

  /**
   * {@inheritDoc}
   */
  public Object removeAttachment(String name)
  {
    return operation.removeAttachment(name);
  }

  /**
   * {@inheritDoc}
   */
  public void removeRequestControl(Control control)
  {
    operation.removeRequestControl(control);
  }

  /**
   * {@inheritDoc}
   */
  public void removeResponseControl(Control control)
  {
    operation.removeResponseControl(control);
  }

  /**
   * {@inheritDoc}
   */
  public void setAdditionalLogMessage(MessageBuilder additionalLogMessage)
  {
    operation.setAdditionalLogMessage(additionalLogMessage);
  }

  /**
   * {@inheritDoc}
   */
  public Object setAttachment(String name, Object value)
  {
    return operation.setAttachment(name, value);
  }

  /**
   * {@inheritDoc}
   */
  public void setAttachments(Map<String, Object> attachments)
  {
    operation.setAttachments(attachments);
  }

  /**
   * {@inheritDoc}
   */
  public void setAuthorizationEntry(Entry authorizationEntry)
  {
    operation.setAuthorizationEntry(authorizationEntry);
  }

  /**
   * {@inheritDoc}
   */
  public void setDontSynchronize(boolean dontSynchronize)
  {
    operation.setDontSynchronize(dontSynchronize);
  }

  /**
   * {@inheritDoc}
   */
  public void setErrorMessage(MessageBuilder errorMessage)
  {
    operation.setErrorMessage(errorMessage);
  }

  /**
   * {@inheritDoc}
   */
  public void setInternalOperation(boolean isInternalOperation)
  {
    operation.setInternalOperation(isInternalOperation);
  }

  /**
   * {@inheritDoc}
   */
  public void setMatchedDN(DN matchedDN)
  {
    operation.setMatchedDN(matchedDN);
  }

  /**
   * {@inheritDoc}
   */
  public void setReferralURLs(List<String> referralURLs)
  {
    operation.setReferralURLs(referralURLs);
  }

  /**
   * {@inheritDoc}
   */
  public void setResponseData(DirectoryException directoryException)
  {
    operation.setResponseData(directoryException);
  }

  /**
   * {@inheritDoc}
   */
  public void setResultCode(ResultCode resultCode)
  {
    operation.setResultCode(resultCode);
  }

  /**
   * {@inheritDoc}
   */
  public void setSynchronizationOperation(boolean isSynchronizationOperation)
  {
    operation.setSynchronizationOperation(isSynchronizationOperation);
  }



  /**
   * {@inheritDoc}
   */
  public final int hashCode()
  {
    return getClientConnection().hashCode() * (int) getOperationID();
  }



  /**
   * {@inheritDoc}
   */
  public final boolean equals(Object obj)
  {
    if (this == obj)
    {
      return true;
    }

    if (obj instanceof Operation)
    {
      Operation other = (Operation) obj;
      if (other.getClientConnection().equals(getClientConnection()))
      {
        return other.getOperationID() == getOperationID();
      }
    }

    return false;
  }



  /**
   * {@inheritDoc}
   */
  public void toString(StringBuilder buffer)
  {
    operation.toString(buffer);
  }

  /**
   * {@inheritDoc}
   */
  public synchronized final void checkIfCanceled(boolean signalTooLate)
      throws CanceledOperationException {
    operation.checkIfCanceled(signalTooLate);
  }

  /**
   * {@inheritDoc}
   */
  public void registerPostResponseCallback(Runnable callback)
  {
    operation.registerPostResponseCallback(callback);
  }
}

