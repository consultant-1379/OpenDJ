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



/**
 * A server-side interface for querying Workflow Element settings.
 * <p>
 * Workflow Elements implement a single processing step in a Work
 * Flow.
 */
public interface WorkflowElementCfg extends Configuration {

  /**
   * Gets the configuration class associated with this Workflow Element.
   *
   * @return Returns the configuration class associated with this Workflow Element.
   */
  Class<? extends WorkflowElementCfg> configurationClass();



  /**
   * Register to be notified when this Workflow Element is changed.
   *
   * @param listener
   *          The Workflow Element configuration change listener.
   */
  void addChangeListener(ConfigurationChangeListener<WorkflowElementCfg> listener);



  /**
   * Deregister an existing Workflow Element configuration change listener.
   *
   * @param listener
   *          The Workflow Element configuration change listener.
   */
  void removeChangeListener(ConfigurationChangeListener<WorkflowElementCfg> listener);



  /**
   * Gets the "enabled" property.
   * <p>
   * Indicates whether the Workflow Element is enabled for use in the
   * server.
   * <p>
   * If a Workflow Element is not enabled, then its contents are not
   * accessible when processing operations.
   *
   * @return Returns the value of the "enabled" property.
   */
  boolean isEnabled();



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Workflow Element implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();

}
