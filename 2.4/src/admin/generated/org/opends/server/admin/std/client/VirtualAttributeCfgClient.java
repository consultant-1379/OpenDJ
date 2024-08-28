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
import org.opends.server.admin.ConfigurationClient;
import org.opends.server.admin.IllegalPropertyValueException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.std.meta.VirtualAttributeCfgDefn.ConflictBehavior;
import org.opends.server.admin.std.server.VirtualAttributeCfg;
import org.opends.server.types.AttributeType;
import org.opends.server.types.DN;



/**
 * A client-side interface for reading and modifying Virtual Attribute
 * settings.
 * <p>
 * Virtual Attributes are responsible for dynamically generating
 * attribute values that appear in entries but are not persistently
 * stored in the backend.
 */
public interface VirtualAttributeCfgClient extends ConfigurationClient {

  /**
   * Get the configuration definition associated with this Virtual Attribute.
   *
   * @return Returns the configuration definition associated with this Virtual Attribute.
   */
  ManagedObjectDefinition<? extends VirtualAttributeCfgClient, ? extends VirtualAttributeCfg> definition();



  /**
   * Gets the "attribute-type" property.
   * <p>
   * Specifies the attribute type for the attribute whose values are
   * to be dynamically assigned by the virtual attribute.
   *
   * @return Returns the value of the "attribute-type" property.
   */
  AttributeType getAttributeType();



  /**
   * Sets the "attribute-type" property.
   * <p>
   * Specifies the attribute type for the attribute whose values are
   * to be dynamically assigned by the virtual attribute.
   *
   * @param value The value of the "attribute-type" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setAttributeType(AttributeType value) throws IllegalPropertyValueException;



  /**
   * Gets the "base-dn" property.
   * <p>
   * Specifies the base DNs for the branches containing entries that
   * are eligible to use this virtual attribute.
   * <p>
   * If no values are given, then the server generates virtual
   * attributes anywhere in the server.
   *
   * @return Returns the values of the "base-dn" property.
   */
  SortedSet<DN> getBaseDN();



  /**
   * Sets the "base-dn" property.
   * <p>
   * Specifies the base DNs for the branches containing entries that
   * are eligible to use this virtual attribute.
   * <p>
   * If no values are given, then the server generates virtual
   * attributes anywhere in the server.
   *
   * @param values The values of the "base-dn" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setBaseDN(Collection<DN> values) throws IllegalPropertyValueException;



  /**
   * Gets the "conflict-behavior" property.
   * <p>
   * Specifies the behavior that the server is to exhibit for entries
   * that already contain one or more real values for the associated
   * attribute.
   *
   * @return Returns the value of the "conflict-behavior" property.
   */
  ConflictBehavior getConflictBehavior();



  /**
   * Sets the "conflict-behavior" property.
   * <p>
   * Specifies the behavior that the server is to exhibit for entries
   * that already contain one or more real values for the associated
   * attribute.
   *
   * @param value The value of the "conflict-behavior" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setConflictBehavior(ConflictBehavior value) throws IllegalPropertyValueException;



  /**
   * Gets the "enabled" property.
   * <p>
   * Indicates whether the Virtual Attribute is enabled for use.
   *
   * @return Returns the value of the "enabled" property.
   */
  Boolean isEnabled();



  /**
   * Sets the "enabled" property.
   * <p>
   * Indicates whether the Virtual Attribute is enabled for use.
   *
   * @param value The value of the "enabled" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setEnabled(boolean value) throws IllegalPropertyValueException;



  /**
   * Gets the "filter" property.
   * <p>
   * Specifies the search filters to be applied against entries to
   * determine if the virtual attribute is to be generated for those
   * entries.
   * <p>
   * If no values are given, then any entry is eligible to have the
   * value generated. If one or more filters are specified, then only
   * entries that match at least one of those filters are allowed to
   * have the virtual attribute.
   *
   * @return Returns the values of the "filter" property.
   */
  SortedSet<String> getFilter();



  /**
   * Sets the "filter" property.
   * <p>
   * Specifies the search filters to be applied against entries to
   * determine if the virtual attribute is to be generated for those
   * entries.
   * <p>
   * If no values are given, then any entry is eligible to have the
   * value generated. If one or more filters are specified, then only
   * entries that match at least one of those filters are allowed to
   * have the virtual attribute.
   *
   * @param values The values of the "filter" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setFilter(Collection<String> values) throws IllegalPropertyValueException;



  /**
   * Gets the "group-dn" property.
   * <p>
   * Specifies the DNs of the groups whose members can be eligible to
   * use this virtual attribute.
   * <p>
   * If no values are given, then group membership is not taken into
   * account when generating the virtual attribute. If one or more
   * group DNs are specified, then only members of those groups are
   * allowed to have the virtual attribute.
   *
   * @return Returns the values of the "group-dn" property.
   */
  SortedSet<DN> getGroupDN();



  /**
   * Sets the "group-dn" property.
   * <p>
   * Specifies the DNs of the groups whose members can be eligible to
   * use this virtual attribute.
   * <p>
   * If no values are given, then group membership is not taken into
   * account when generating the virtual attribute. If one or more
   * group DNs are specified, then only members of those groups are
   * allowed to have the virtual attribute.
   *
   * @param values The values of the "group-dn" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setGroupDN(Collection<DN> values) throws IllegalPropertyValueException;



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the virtual attribute
   * provider class that generates the attribute values.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();



  /**
   * Sets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the virtual attribute
   * provider class that generates the attribute values.
   *
   * @param value The value of the "java-class" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setJavaClass(String value) throws IllegalPropertyValueException;

}
