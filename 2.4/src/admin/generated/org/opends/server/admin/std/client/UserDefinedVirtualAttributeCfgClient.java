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
import org.opends.server.admin.std.server.UserDefinedVirtualAttributeCfg;



/**
 * A client-side interface for reading and modifying User Defined
 * Virtual Attribute settings.
 * <p>
 * The User Defined Virtual Attribute creates virtual attributes with
 * user-defined values in entries that match the criteria defined in
 * the plug-in's configuration.
 */
public interface UserDefinedVirtualAttributeCfgClient extends VirtualAttributeCfgClient {

  /**
   * Get the configuration definition associated with this User Defined Virtual Attribute.
   *
   * @return Returns the configuration definition associated with this User Defined Virtual Attribute.
   */
  ManagedObjectDefinition<? extends UserDefinedVirtualAttributeCfgClient, ? extends UserDefinedVirtualAttributeCfg> definition();



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



  /**
   * Gets the "value" property.
   * <p>
   * Specifies the values to be included in the virtual attribute.
   *
   * @return Returns the values of the "value" property.
   */
  SortedSet<String> getValue();



  /**
   * Sets the "value" property.
   * <p>
   * Specifies the values to be included in the virtual attribute.
   *
   * @param values The values of the "value" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setValue(Collection<String> values) throws IllegalPropertyValueException;

}
