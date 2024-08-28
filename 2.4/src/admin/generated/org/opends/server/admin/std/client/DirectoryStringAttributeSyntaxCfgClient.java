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
import org.opends.server.admin.PropertyIsReadOnlyException;
import org.opends.server.admin.std.server.DirectoryStringAttributeSyntaxCfg;



/**
 * A client-side interface for reading and modifying Directory String
 * Attribute Syntax settings.
 * <p>
 * The Directory String Attribute Syntax defines an attribute syntax
 * for storing arbitrary string (and sometimes binary) data.
 */
public interface DirectoryStringAttributeSyntaxCfgClient extends AttributeSyntaxCfgClient {

  /**
   * Get the configuration definition associated with this Directory String Attribute Syntax.
   *
   * @return Returns the configuration definition associated with this Directory String Attribute Syntax.
   */
  ManagedObjectDefinition<? extends DirectoryStringAttributeSyntaxCfgClient, ? extends DirectoryStringAttributeSyntaxCfg> definition();



  /**
   * Gets the "allow-zero-length-values" property.
   * <p>
   * Indicates whether zero-length (that is, an empty string) values
   * are allowed.
   * <p>
   * This is technically not allowed by the revised LDAPv3
   * specification, but some environments may require it for backward
   * compatibility with servers that do allow it.
   *
   * @return Returns the value of the "allow-zero-length-values" property.
   */
  boolean isAllowZeroLengthValues();



  /**
   * Sets the "allow-zero-length-values" property.
   * <p>
   * Indicates whether zero-length (that is, an empty string) values
   * are allowed.
   * <p>
   * This is technically not allowed by the revised LDAPv3
   * specification, but some environments may require it for backward
   * compatibility with servers that do allow it.
   *
   * @param value The value of the "allow-zero-length-values" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setAllowZeroLengthValues(Boolean value) throws IllegalPropertyValueException;



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Directory String Attribute Syntax implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();



  /**
   * Sets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Directory String Attribute Syntax implementation.
   * <p>
   * This property is read-only and can only be modified during
   * creation of a Directory String Attribute Syntax.
   *
   * @param value The value of the "java-class" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   * @throws PropertyIsReadOnlyException
   *           If this Directory String Attribute Syntax is not being initialized.
   */
  void setJavaClass(String value) throws IllegalPropertyValueException, PropertyIsReadOnlyException;

}
