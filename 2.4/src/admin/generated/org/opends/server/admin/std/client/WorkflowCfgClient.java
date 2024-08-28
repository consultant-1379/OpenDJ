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
package org.opends.server.admin.std.client;



import org.opends.server.admin.ConfigurationClient;
import org.opends.server.admin.IllegalPropertyValueException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.PropertyIsReadOnlyException;
import org.opends.server.admin.std.server.WorkflowCfg;
import org.opends.server.types.DN;



/**
 * A client-side interface for reading and modifying Workflow
 * settings.
 * <p>
 * The Workflow is a list of processing steps (Work Flow Elements)
 * that are applied to data as it is retrieved from the Directory
 * Server.
 */
public interface WorkflowCfgClient extends ConfigurationClient {

  /**
   * Get the configuration definition associated with this Workflow.
   *
   * @return Returns the configuration definition associated with this Workflow.
   */
  ManagedObjectDefinition<? extends WorkflowCfgClient, ? extends WorkflowCfg> definition();



  /**
   * Gets the "base-dn" property.
   * <p>
   * Specifies the base DN of the data targeted by the Workflow .
   *
   * @return Returns the value of the "base-dn" property.
   */
  DN getBaseDN();



  /**
   * Sets the "base-dn" property.
   * <p>
   * Specifies the base DN of the data targeted by the Workflow .
   * <p>
   * This property is read-only and can only be modified during
   * creation of a Workflow.
   *
   * @param value The value of the "base-dn" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   * @throws PropertyIsReadOnlyException
   *           If this Workflow is not being initialized.
   */
  void setBaseDN(DN value) throws IllegalPropertyValueException, PropertyIsReadOnlyException;



  /**
   * Gets the "enabled" property.
   * <p>
   * Indicates whether the Workflow is enabled for use in the server.
   * <p>
   * If a Workflow is not enabled, then its contents are not
   * accessible when processing operations.
   *
   * @return Returns the value of the "enabled" property.
   */
  Boolean isEnabled();



  /**
   * Sets the "enabled" property.
   * <p>
   * Indicates whether the Workflow is enabled for use in the server.
   * <p>
   * If a Workflow is not enabled, then its contents are not
   * accessible when processing operations.
   *
   * @param value The value of the "enabled" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setEnabled(boolean value) throws IllegalPropertyValueException;



  /**
   * Gets the "workflow-element" property.
   * <p>
   * Specifies the root Workflow Element in the Workflow .
   *
   * @return Returns the value of the "workflow-element" property.
   */
  String getWorkflowElement();



  /**
   * Sets the "workflow-element" property.
   * <p>
   * Specifies the root Workflow Element in the Workflow .
   *
   * @param value The value of the "workflow-element" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setWorkflowElement(String value) throws IllegalPropertyValueException;

}
