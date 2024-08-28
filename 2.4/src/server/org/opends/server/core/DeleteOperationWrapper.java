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
 *      Copyright 2008 Sun Microsystems, Inc.
 */
package org.opends.server.core;


import org.opends.server.types.ByteString;
import org.opends.server.types.DN;


/**
 * This abstract class wraps/decorates a given delete operation.
 * This class will be extended by sub-classes to enhance the
 * functionnality of the DeleteOperationBasis.
 */
public abstract class DeleteOperationWrapper extends OperationWrapper
       implements DeleteOperation
{
  // The wrapped operation.
  DeleteOperation delete;

  /**
   * Creates a new delete operation based on the provided delete operation.
   *
   * @param delete The delete operation to wrap
   */
  public DeleteOperationWrapper(DeleteOperation delete)
  {
    super(delete);
    this.delete = delete;
  }

  /**
   * {@inheritDoc}
   */
  public DN getEntryDN()
  {
    return delete.getEntryDN();
  }

  /**
   * {@inheritDoc}
   */
  public ByteString getRawEntryDN()
  {
    return delete.getRawEntryDN();
  }

  /**
   * {@inheritDoc}
   */
  public void setRawEntryDN(ByteString rawEntryDN)
  {
    delete.setRawEntryDN(rawEntryDN);
  }

  /**
   * {@inheritDoc}
   */
  public final long getChangeNumber()
  {
    return delete.getChangeNumber();
  }

  /**
   * {@inheritDoc}
   */
  public final void setChangeNumber(long changeNumber)
  {
    delete.setChangeNumber(changeNumber);
  }

  /**
   * {@inheritDoc}
   */
  public String toString()
  {
    return delete.toString();
  }

  /**
   * {@inheritDoc}
   */
  public DN getProxiedAuthorizationDN()
  {
    return delete.getProxiedAuthorizationDN();
  }

  /**
   * {@inheritDoc}
   */
  public void setProxiedAuthorizationDN(DN proxiedAuthorizationDN)
  {
    delete.setProxiedAuthorizationDN(proxiedAuthorizationDN);
  }

}
