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
 * A server-side interface for querying Unique Attribute Plugin
 * settings.
 * <p>
 * The Unique Attribute Plugin enforces constraints on the value of an
 * attribute within a portion of the directory.
 */
public interface UniqueAttributePluginCfg extends PluginCfg {

  /**
   * Gets the configuration class associated with this Unique Attribute Plugin.
   *
   * @return Returns the configuration class associated with this Unique Attribute Plugin.
   */
  Class<? extends UniqueAttributePluginCfg> configurationClass();



  /**
   * Register to be notified when this Unique Attribute Plugin is changed.
   *
   * @param listener
   *          The Unique Attribute Plugin configuration change listener.
   */
  void addUniqueAttributeChangeListener(ConfigurationChangeListener<UniqueAttributePluginCfg> listener);



  /**
   * Deregister an existing Unique Attribute Plugin configuration change listener.
   *
   * @param listener
   *          The Unique Attribute Plugin configuration change listener.
   */
  void removeUniqueAttributeChangeListener(ConfigurationChangeListener<UniqueAttributePluginCfg> listener);



  /**
   * Gets the "base-dn" property.
   * <p>
   * Specifies a base DN within which the attribute must be unique.
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
   * Gets the "plugin-type" property.
   * <p>
   * Specifies the set of plug-in types for the plug-in, which
   * specifies the times at which the plug-in is invoked.
   *
   * @return Returns an unmodifiable set containing the values of the "plugin-type" property.
   */
  SortedSet<PluginType> getPluginType();



  /**
   * Gets the "type" property.
   * <p>
   * Specifies the type of attributes to check for value uniqueness.
   *
   * @return Returns an unmodifiable set containing the values of the "type" property.
   */
  SortedSet<AttributeType> getType();

}
