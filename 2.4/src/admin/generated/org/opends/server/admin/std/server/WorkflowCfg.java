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
package org.opends.server.admin.std.server;



import org.opends.server.admin.Configuration;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.types.DN;



/**
 * A server-side interface for querying Workflow settings.
 * <p>
 * The Workflow is a list of processing steps (Work Flow Elements)
 * that are applied to data as it is retrieved from the Directory
 * Server.
 */
public interface WorkflowCfg extends Configuration {

  /**
   * Gets the configuration class associated with this Workflow.
   *
   * @return Returns the configuration class associated with this Workflow.
   */
  Class<? extends WorkflowCfg> configurationClass();



  /**
   * Register to be notified when this Workflow is changed.
   *
   * @param listener
   *          The Workflow configuration change listener.
   */
  void addChangeListener(ConfigurationChangeListener<WorkflowCfg> listener);



  /**
   * Deregister an existing Workflow configuration change listener.
   *
   * @param listener
   *          The Workflow configuration change listener.
   */
  void removeChangeListener(ConfigurationChangeListener<WorkflowCfg> listener);



  /**
   * Gets the "base-dn" property.
   * <p>
   * Specifies the base DN of the data targeted by the Workflow .
   *
   * @return Returns the value of the "base-dn" property.
   */
  DN getBaseDN();



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
  boolean isEnabled();



  /**
   * Gets the "workflow-element" property.
   * <p>
   * Specifies the root Workflow Element in the Workflow .
   *
   * @return Returns the value of the "workflow-element" property.
   */
  String getWorkflowElement();



  /**
   * Gets the "workflow-element" property as a DN.
   * <p>
   * Specifies the root Workflow Element in the Workflow .
   *
   * @return Returns the DN value of the "workflow-element" property.
   */
  DN getWorkflowElementDN();

}
