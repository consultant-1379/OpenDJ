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
import org.opends.server.admin.std.meta.BackendCfgDefn.WritabilityMode;
import org.opends.server.admin.std.server.SchemaBackendCfg;
import org.opends.server.types.DN;



/**
 * A client-side interface for reading and modifying Schema Backend
 * settings.
 * <p>
 * The Schema Backend provides access to the Directory Server schema
 * information, including the attribute types, object classes,
 * attribute syntaxes, matching rules, matching rule uses, DIT content
 * rules, and DIT structure rules that it contains.
 */
public interface SchemaBackendCfgClient extends BackendCfgClient {

  /**
   * Get the configuration definition associated with this Schema Backend.
   *
   * @return Returns the configuration definition associated with this Schema Backend.
   */
  ManagedObjectDefinition<? extends SchemaBackendCfgClient, ? extends SchemaBackendCfg> definition();



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the backend implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();



  /**
   * Sets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the backend implementation.
   *
   * @param value The value of the "java-class" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setJavaClass(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "schema-entry-dn" property.
   * <p>
   * Defines the base DNs of the subtrees in which the schema
   * information is published in addition to the value included in the
   * base-dn property.
   * <p>
   * The value provided in the base-dn property is the only one that
   * appears in the subschemaSubentry operational attribute of the
   * server's root DSE (which is necessary because that is a
   * single-valued attribute) and as a virtual attribute in other
   * entries. The schema-entry-dn attribute may be used to make the
   * schema information available in other locations to accommodate
   * certain client applications that have been hard-coded to expect
   * the schema to reside in a specific location.
   *
   * @return Returns the values of the "schema-entry-dn" property.
   */
  SortedSet<DN> getSchemaEntryDN();



  /**
   * Sets the "schema-entry-dn" property.
   * <p>
   * Defines the base DNs of the subtrees in which the schema
   * information is published in addition to the value included in the
   * base-dn property.
   * <p>
   * The value provided in the base-dn property is the only one that
   * appears in the subschemaSubentry operational attribute of the
   * server's root DSE (which is necessary because that is a
   * single-valued attribute) and as a virtual attribute in other
   * entries. The schema-entry-dn attribute may be used to make the
   * schema information available in other locations to accommodate
   * certain client applications that have been hard-coded to expect
   * the schema to reside in a specific location.
   *
   * @param values The values of the "schema-entry-dn" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setSchemaEntryDN(Collection<DN> values) throws IllegalPropertyValueException;



  /**
   * Gets the "show-all-attributes" property.
   * <p>
   * Indicates whether to treat all attributes in the schema entry as
   * if they were user attributes regardless of their configuration.
   * <p>
   * This may provide compatibility with some applications that expect
   * schema attributes like attributeTypes and objectClasses to be
   * included by default even if they are not requested. Note that the
   * ldapSyntaxes attribute is always treated as operational in order
   * to avoid problems with attempts to modify the schema over
   * protocol.
   *
   * @return Returns the value of the "show-all-attributes" property.
   */
  Boolean isShowAllAttributes();



  /**
   * Sets the "show-all-attributes" property.
   * <p>
   * Indicates whether to treat all attributes in the schema entry as
   * if they were user attributes regardless of their configuration.
   * <p>
   * This may provide compatibility with some applications that expect
   * schema attributes like attributeTypes and objectClasses to be
   * included by default even if they are not requested. Note that the
   * ldapSyntaxes attribute is always treated as operational in order
   * to avoid problems with attempts to modify the schema over
   * protocol.
   *
   * @param value The value of the "show-all-attributes" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setShowAllAttributes(boolean value) throws IllegalPropertyValueException;



  /**
   * Gets the "writability-mode" property.
   * <p>
   * Specifies the behavior that the backend should use when
   * processing write operations.
   *
   * @return Returns the value of the "writability-mode" property.
   */
  WritabilityMode getWritabilityMode();



  /**
   * Sets the "writability-mode" property.
   * <p>
   * Specifies the behavior that the backend should use when
   * processing write operations.
   *
   * @param value The value of the "writability-mode" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setWritabilityMode(WritabilityMode value) throws IllegalPropertyValueException;

}
