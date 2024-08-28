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
import org.opends.server.admin.std.meta.VirtualAttributeCfgDefn.ConflictBehavior;
import org.opends.server.admin.std.server.MemberVirtualAttributeCfg;



/**
 * A client-side interface for reading and modifying Member Virtual
 * Attribute settings.
 * <p>
 * The Member Virtual Attribute generates a member or uniqueMember
 * attribute whose values are the DNs of the members of a specified
 * virtual static group.
 */
public interface MemberVirtualAttributeCfgClient extends VirtualAttributeCfgClient {

  /**
   * Get the configuration definition associated with this Member Virtual Attribute.
   *
   * @return Returns the configuration definition associated with this Member Virtual Attribute.
   */
  ManagedObjectDefinition<? extends MemberVirtualAttributeCfgClient, ? extends MemberVirtualAttributeCfg> definition();



  /**
   * Gets the "allow-retrieving-membership" property.
   * <p>
   * Indicates whether to handle requests that request all values for
   * the virtual attribute.
   * <p>
   * This operation can be very expensive in some cases and is not
   * consistent with the primary function of virtual static groups,
   * which is to make it possible to use static group idioms to
   * determine whether a given user is a member. If this attribute is
   * set to false, attempts to retrieve the entire set of values
   * receive an empty set, and only attempts to determine whether the
   * attribute has a specific value or set of values (which is the
   * primary anticipated use for virtual static groups) are handled
   * properly.
   *
   * @return Returns the value of the "allow-retrieving-membership" property.
   */
  boolean isAllowRetrievingMembership();



  /**
   * Sets the "allow-retrieving-membership" property.
   * <p>
   * Indicates whether to handle requests that request all values for
   * the virtual attribute.
   * <p>
   * This operation can be very expensive in some cases and is not
   * consistent with the primary function of virtual static groups,
   * which is to make it possible to use static group idioms to
   * determine whether a given user is a member. If this attribute is
   * set to false, attempts to retrieve the entire set of values
   * receive an empty set, and only attempts to determine whether the
   * attribute has a specific value or set of values (which is the
   * primary anticipated use for virtual static groups) are handled
   * properly.
   *
   * @param value The value of the "allow-retrieving-membership" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setAllowRetrievingMembership(boolean value) throws IllegalPropertyValueException;



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
