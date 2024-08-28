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



import java.util.SortedSet;
import org.opends.server.admin.Configuration;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.std.meta.PluginCfgDefn.PluginType;



/**
 * A server-side interface for querying Plugin settings.
 * <p>
 * Plugins provide a mechanism for executing custom code at specified
 * points in operation processing and in the course of other events
 * like connection establishment and termination, server startup and
 * shutdown, and LDIF import and export.
 */
public interface PluginCfg extends Configuration {

  /**
   * Gets the configuration class associated with this Plugin.
   *
   * @return Returns the configuration class associated with this Plugin.
   */
  Class<? extends PluginCfg> configurationClass();



  /**
   * Register to be notified when this Plugin is changed.
   *
   * @param listener
   *          The Plugin configuration change listener.
   */
  void addChangeListener(ConfigurationChangeListener<PluginCfg> listener);



  /**
   * Deregister an existing Plugin configuration change listener.
   *
   * @param listener
   *          The Plugin configuration change listener.
   */
  void removeChangeListener(ConfigurationChangeListener<PluginCfg> listener);



  /**
   * Gets the "enabled" property.
   * <p>
   * Indicates whether the plug-in is enabled for use.
   *
   * @return Returns the value of the "enabled" property.
   */
  boolean isEnabled();



  /**
   * Gets the "invoke-for-internal-operations" property.
   * <p>
   * Indicates whether the plug-in should be invoked for internal
   * operations.
   * <p>
   * Any plug-in that can be invoked for internal operations must
   * ensure that it does not create any new internal operatons that can
   * cause the same plug-in to be re-invoked.
   *
   * @return Returns the value of the "invoke-for-internal-operations" property.
   */
  boolean isInvokeForInternalOperations();



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the plug-in implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();



  /**
   * Gets the "plugin-type" property.
   * <p>
   * Specifies the set of plug-in types for the plug-in, which
   * specifies the times at which the plug-in is invoked.
   *
   * @return Returns an unmodifiable set containing the values of the "plugin-type" property.
   */
  SortedSet<PluginType> getPluginType();

}
