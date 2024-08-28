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



/**
 * A server-side interface for querying Virtual Static Group
 * Implementation settings.
 * <p>
 * The Virtual Static Group Implementation provides a grouping
 * mechanism in which the membership for the virtual static group is
 * based on the membership for another group defined within the server.
 */
public interface VirtualStaticGroupImplementationCfg extends GroupImplementationCfg {

  /**
   * Gets the configuration class associated with this Virtual Static Group Implementation.
   *
   * @return Returns the configuration class associated with this Virtual Static Group Implementation.
   */
  Class<? extends VirtualStaticGroupImplementationCfg> configurationClass();



  /**
   * Register to be notified when this Virtual Static Group Implementation is changed.
   *
   * @param listener
   *          The Virtual Static Group Implementation configuration change listener.
   */
  void addVirtualStaticChangeListener(ConfigurationChangeListener<VirtualStaticGroupImplementationCfg> listener);



  /**
   * Deregister an existing Virtual Static Group Implementation configuration change listener.
   *
   * @param listener
   *          The Virtual Static Group Implementation configuration change listener.
   */
  void removeVirtualStaticChangeListener(ConfigurationChangeListener<VirtualStaticGroupImplementationCfg> listener);



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Virtual Static Group Implementation implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();

}
