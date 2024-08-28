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



import org.opends.server.admin.IllegalPropertyValueException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.PropertyIsReadOnlyException;
import org.opends.server.admin.std.server.LocalBackendWorkflowElementCfg;



/**
 * A client-side interface for reading and modifying Local Backend
 * Workflow Element settings.
 * <p>
 * The Local Backend Workflow Element provides access to a backend.
 */
public interface LocalBackendWorkflowElementCfgClient extends WorkflowElementCfgClient {

  /**
   * Get the configuration definition associated with this Local Backend Workflow Element.
   *
   * @return Returns the configuration definition associated with this Local Backend Workflow Element.
   */
  ManagedObjectDefinition<? extends LocalBackendWorkflowElementCfgClient, ? extends LocalBackendWorkflowElementCfg> definition();



  /**
   * Gets the "backend" property.
   * <p>
   * Identifies the backend accessed by the workflow element.
   *
   * @return Returns the value of the "backend" property.
   */
  String getBackend();



  /**
   * Sets the "backend" property.
   * <p>
   * Identifies the backend accessed by the workflow element.
   * <p>
   * This property is read-only and can only be modified during
   * creation of a Local Backend Workflow Element.
   *
   * @param value The value of the "backend" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   * @throws PropertyIsReadOnlyException
   *           If this Local Backend Workflow Element is not being initialized.
   */
  void setBackend(String value) throws IllegalPropertyValueException, PropertyIsReadOnlyException;



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Local Backend Workflow Element implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();



  /**
   * Sets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Local Backend Workflow Element implementation.
   *
   * @param value The value of the "java-class" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setJavaClass(String value) throws IllegalPropertyValueException;

}
