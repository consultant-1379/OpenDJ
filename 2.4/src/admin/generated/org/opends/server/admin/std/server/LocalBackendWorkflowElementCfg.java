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



import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.types.DN;



/**
 * A server-side interface for querying Local Backend Workflow Element
 * settings.
 * <p>
 * The Local Backend Workflow Element provides access to a backend.
 */
public interface LocalBackendWorkflowElementCfg extends WorkflowElementCfg {

  /**
   * Gets the configuration class associated with this Local Backend Workflow Element.
   *
   * @return Returns the configuration class associated with this Local Backend Workflow Element.
   */
  Class<? extends LocalBackendWorkflowElementCfg> configurationClass();



  /**
   * Register to be notified when this Local Backend Workflow Element is changed.
   *
   * @param listener
   *          The Local Backend Workflow Element configuration change listener.
   */
  void addLocalBackendChangeListener(ConfigurationChangeListener<LocalBackendWorkflowElementCfg> listener);



  /**
   * Deregister an existing Local Backend Workflow Element configuration change listener.
   *
   * @param listener
   *          The Local Backend Workflow Element configuration change listener.
   */
  void removeLocalBackendChangeListener(ConfigurationChangeListener<LocalBackendWorkflowElementCfg> listener);



  /**
   * Gets the "backend" property.
   * <p>
   * Identifies the backend accessed by the workflow element.
   *
   * @return Returns the value of the "backend" property.
   */
  String getBackend();



  /**
   * Gets the "backend" property as a DN.
   * <p>
   * Identifies the backend accessed by the workflow element.
   *
   * @return Returns the DN value of the "backend" property.
   */
  DN getBackendDN();



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Local Backend Workflow Element implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();

}
