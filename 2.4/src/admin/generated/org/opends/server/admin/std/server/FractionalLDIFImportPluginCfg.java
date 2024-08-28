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
 * A server-side interface for querying Fractional LDIF Import Plugin
 * settings.
 * <p>
 * The Fractional LDIF Import Plugin is used internally by the
 * replication plugin to support fractional replication.
 */
public interface FractionalLDIFImportPluginCfg extends PluginCfg {

  /**
   * Gets the configuration class associated with this Fractional LDIF Import Plugin.
   *
   * @return Returns the configuration class associated with this Fractional LDIF Import Plugin.
   */
  Class<? extends FractionalLDIFImportPluginCfg> configurationClass();



  /**
   * Register to be notified when this Fractional LDIF Import Plugin is changed.
   *
   * @param listener
   *          The Fractional LDIF Import Plugin configuration change listener.
   */
  void addFractionalLDIFImportChangeListener(ConfigurationChangeListener<FractionalLDIFImportPluginCfg> listener);



  /**
   * Deregister an existing Fractional LDIF Import Plugin configuration change listener.
   *
   * @param listener
   *          The Fractional LDIF Import Plugin configuration change listener.
   */
  void removeFractionalLDIFImportChangeListener(ConfigurationChangeListener<FractionalLDIFImportPluginCfg> listener);

}
