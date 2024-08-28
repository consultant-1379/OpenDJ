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



import java.util.Collection;
import java.util.SortedSet;
import org.opends.server.admin.IllegalPropertyValueException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.std.meta.PluginCfgDefn.PluginType;
import org.opends.server.admin.std.server.UniqueAttributePluginCfg;
import org.opends.server.types.AttributeType;
import org.opends.server.types.DN;



/**
 * A client-side interface for reading and modifying Unique Attribute
 * Plugin settings.
 * <p>
 * The Unique Attribute Plugin enforces constraints on the value of an
 * attribute within a portion of the directory.
 */
public interface UniqueAttributePluginCfgClient extends PluginCfgClient {

  /**
   * Get the configuration definition associated with this Unique Attribute Plugin.
   *
   * @return Returns the configuration definition associated with this Unique Attribute Plugin.
   */
  ManagedObjectDefinition<? extends UniqueAttributePluginCfgClient, ? extends UniqueAttributePluginCfg> definition();



  /**
   * Gets the "base-dn" property.
   * <p>
   * Specifies a base DN within which the attribute must be unique.
   *
   * @return Returns the values of the "base-dn" property.
   */
  SortedSet<DN> getBaseDN();



  /**
   * Sets the "base-dn" property.
   * <p>
   * Specifies a base DN within which the attribute must be unique.
   *
   * @param values The values of the "base-dn" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setBaseDN(Collection<DN> values) throws IllegalPropertyValueException;



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
   * Sets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the plug-in implementation.
   *
   * @param value The value of the "java-class" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setJavaClass(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "plugin-type" property.
   * <p>
   * Specifies the set of plug-in types for the plug-in, which
   * specifies the times at which the plug-in is invoked.
   *
   * @return Returns the values of the "plugin-type" property.
   */
  SortedSet<PluginType> getPluginType();



  /**
   * Sets the "plugin-type" property.
   * <p>
   * Specifies the set of plug-in types for the plug-in, which
   * specifies the times at which the plug-in is invoked.
   *
   * @param values The values of the "plugin-type" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setPluginType(Collection<PluginType> values) throws IllegalPropertyValueException;



  /**
   * Gets the "type" property.
   * <p>
   * Specifies the type of attributes to check for value uniqueness.
   *
   * @return Returns the values of the "type" property.
   */
  SortedSet<AttributeType> getType();



  /**
   * Sets the "type" property.
   * <p>
   * Specifies the type of attributes to check for value uniqueness.
   *
   * @param values The values of the "type" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setType(Collection<AttributeType> values) throws IllegalPropertyValueException;

}
