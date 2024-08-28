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
import org.opends.server.admin.std.server.SevenBitCleanPluginCfg;
import org.opends.server.types.AttributeType;
import org.opends.server.types.DN;



/**
 * A client-side interface for reading and modifying Seven Bit Clean
 * Plugin settings.
 * <p>
 * The Seven Bit Clean Plugin ensures that values for a specified set
 * of attributes are 7-bit clean.
 */
public interface SevenBitCleanPluginCfgClient extends PluginCfgClient {

  /**
   * Get the configuration definition associated with this Seven Bit Clean Plugin.
   *
   * @return Returns the configuration definition associated with this Seven Bit Clean Plugin.
   */
  ManagedObjectDefinition<? extends SevenBitCleanPluginCfgClient, ? extends SevenBitCleanPluginCfg> definition();



  /**
   * Gets the "attribute-type" property.
   * <p>
   * Specifies the name or OID of an attribute type for which values
   * should be checked to ensure that they are 7-bit clean.
   *
   * @return Returns the values of the "attribute-type" property.
   */
  SortedSet<AttributeType> getAttributeType();



  /**
   * Sets the "attribute-type" property.
   * <p>
   * Specifies the name or OID of an attribute type for which values
   * should be checked to ensure that they are 7-bit clean.
   *
   * @param values The values of the "attribute-type" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setAttributeType(Collection<AttributeType> values) throws IllegalPropertyValueException;



  /**
   * Gets the "base-dn" property.
   * <p>
   * Specifies the base DN below which the checking is performed.
   * <p>
   * Any attempt to update a value for one of the configured
   * attributes below this base DN must be 7-bit clean for the
   * operation to be allowed.
   *
   * @return Returns the values of the "base-dn" property.
   */
  SortedSet<DN> getBaseDN();



  /**
   * Sets the "base-dn" property.
   * <p>
   * Specifies the base DN below which the checking is performed.
   * <p>
   * Any attempt to update a value for one of the configured
   * attributes below this base DN must be 7-bit clean for the
   * operation to be allowed.
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

}
