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



import org.opends.server.admin.ConfigurationClient;
import org.opends.server.admin.IllegalPropertyValueException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.PropertyIsReadOnlyException;
import org.opends.server.admin.std.server.AttributeSyntaxCfg;



/**
 * A client-side interface for reading and modifying Attribute Syntax
 * settings.
 * <p>
 * Attribute Syntaxes define the type of data that may be stored in an
 * attribute with that syntax. A syntax is generally associated with a
 * set of matching rules that indicate how to perform matching
 * operations against values of that syntax.
 */
public interface AttributeSyntaxCfgClient extends ConfigurationClient {

  /**
   * Get the configuration definition associated with this Attribute Syntax.
   *
   * @return Returns the configuration definition associated with this Attribute Syntax.
   */
  ManagedObjectDefinition<? extends AttributeSyntaxCfgClient, ? extends AttributeSyntaxCfg> definition();



  /**
   * Gets the "enabled" property.
   * <p>
   * Indicates whether the Attribute Syntax is enabled.
   *
   * @return Returns the value of the "enabled" property.
   */
  Boolean isEnabled();



  /**
   * Sets the "enabled" property.
   * <p>
   * Indicates whether the Attribute Syntax is enabled.
   *
   * @param value The value of the "enabled" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setEnabled(boolean value) throws IllegalPropertyValueException;



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Attribute Syntax implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();



  /**
   * Sets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Attribute Syntax implementation.
   * <p>
   * This property is read-only and can only be modified during
   * creation of a Attribute Syntax.
   *
   * @param value The value of the "java-class" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   * @throws PropertyIsReadOnlyException
   *           If this Attribute Syntax is not being initialized.
   */
  void setJavaClass(String value) throws IllegalPropertyValueException, PropertyIsReadOnlyException;

}
