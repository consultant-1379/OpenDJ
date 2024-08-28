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
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.std.meta.PluginCfgDefn.PluginType;
import org.opends.server.types.AttributeType;
import org.opends.server.types.DN;



/**
 * A server-side interface for querying Referential Integrity Plugin
 * settings.
 * <p>
 * The Referential Integrity Plugin maintains referential integrity
 * for DN valued attributes.
 */
public interface ReferentialIntegrityPluginCfg extends PluginCfg {

  /**
   * Gets the configuration class associated with this Referential Integrity Plugin.
   *
   * @return Returns the configuration class associated with this Referential Integrity Plugin.
   */
  Class<? extends ReferentialIntegrityPluginCfg> configurationClass();



  /**
   * Register to be notified when this Referential Integrity Plugin is changed.
   *
   * @param listener
   *          The Referential Integrity Plugin configuration change listener.
   */
  void addReferentialIntegrityChangeListener(ConfigurationChangeListener<ReferentialIntegrityPluginCfg> listener);



  /**
   * Deregister an existing Referential Integrity Plugin configuration change listener.
   *
   * @param listener
   *          The Referential Integrity Plugin configuration change listener.
   */
  void removeReferentialIntegrityChangeListener(ConfigurationChangeListener<ReferentialIntegrityPluginCfg> listener);



  /**
   * Gets the "attribute-type" property.
   * <p>
   * Specifies the attribute types for which referential integrity is
   * to be maintained.
   * <p>
   * At least one attribute type must be specified, and the syntax of
   * any attributes must be either a distinguished name
   * (1.3.6.1.4.1.1466.115.121.1.12) or name and optional UID
   * (1.3.6.1.4.1.1466.115.121.1.34).
   *
   * @return Returns an unmodifiable set containing the values of the "attribute-type" property.
   */
  SortedSet<AttributeType> getAttributeType();



  /**
   * Gets the "base-dn" property.
   * <p>
   * Specifies the base DN that limits the scope within which
   * referential integrity is maintained.
   *
   * @return Returns an unmodifiable set containing the values of the "base-dn" property.
   */
  SortedSet<DN> getBaseDN();



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
   * Gets the "log-file" property.
   * <p>
   * Specifies the log file location where the update records are
   * written when the plug-in is in background-mode processing.
   * <p>
   * The default location is the logs directory of the server
   * instance, using the file name "referint".
   *
   * @return Returns the value of the "log-file" property.
   */
  String getLogFile();



  /**
   * Gets the "plugin-type" property.
   * <p>
   * Specifies the set of plug-in types for the plug-in, which
   * specifies the times at which the plug-in is invoked.
   *
   * @return Returns an unmodifiable set containing the values of the "plugin-type" property.
   */
  SortedSet<PluginType> getPluginType();



  /**
   * Gets the "update-interval" property.
   * <p>
   * Specifies the interval in seconds when referential integrity
   * updates are made.
   * <p>
   * If this value is 0, then the updates are made synchronously in
   * the foreground.
   *
   * @return Returns the value of the "update-interval" property.
   */
  long getUpdateInterval();

}
