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
import org.opends.server.admin.PropertyIsReadOnlyException;
import org.opends.server.admin.std.meta.LocalDBIndexCfgDefn.IndexType;
import org.opends.server.admin.std.server.LocalDBIndexCfg;
import org.opends.server.types.AttributeType;



/**
 * A client-side interface for reading and modifying Local DB Index
 * settings.
 * <p>
 * Local DB Indexes are used to store information that makes it
 * possible to locate entries very quickly when processing search
 * operations.
 */
public interface LocalDBIndexCfgClient extends ConfigurationClient {

  /**
   * Get the configuration definition associated with this Local DB Index.
   *
   * @return Returns the configuration definition associated with this Local DB Index.
   */
  ManagedObjectDefinition<? extends LocalDBIndexCfgClient, ? extends LocalDBIndexCfg> definition();



  /**
   * Gets the "attribute" property.
   * <p>
   * Specifies the name of the attribute for which the index is to be
   * maintained.
   *
   * @return Returns the value of the "attribute" property.
   */
  AttributeType getAttribute();



  /**
   * Sets the "attribute" property.
   * <p>
   * Specifies the name of the attribute for which the index is to be
   * maintained.
   * <p>
   * This property is read-only and can only be modified during
   * creation of a Local DB Index.
   *
   * @param value The value of the "attribute" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   * @throws PropertyIsReadOnlyException
   *           If this Local DB Index is not being initialized.
   */
  void setAttribute(AttributeType value) throws IllegalPropertyValueException, PropertyIsReadOnlyException;



  /**
   * Gets the "index-entry-limit" property.
   * <p>
   * Specifies the maximum number of entries that are allowed to match
   * a given index key before that particular index key is no longer
   * maintained.
   * <p>
   * This is analogous to the ALL IDs threshold in the Sun Java System
   * Directory Server. If this is specified, its value overrides the JE
   * backend-wide configuration. For no limit, use 0 for the value.
   *
   * @return Returns the value of the "index-entry-limit" property.
   */
  Integer getIndexEntryLimit();



  /**
   * Sets the "index-entry-limit" property.
   * <p>
   * Specifies the maximum number of entries that are allowed to match
   * a given index key before that particular index key is no longer
   * maintained.
   * <p>
   * This is analogous to the ALL IDs threshold in the Sun Java System
   * Directory Server. If this is specified, its value overrides the JE
   * backend-wide configuration. For no limit, use 0 for the value.
   *
   * @param value The value of the "index-entry-limit" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setIndexEntryLimit(Integer value) throws IllegalPropertyValueException;



  /**
   * Gets the "index-extensible-matching-rule" property.
   * <p>
   * The extensible matching rule in an extensible index.
   * <p>
   * An extensible matching rule must be specified using either LOCALE
   * or OID of the matching rule.
   *
   * @return Returns the values of the "index-extensible-matching-rule" property.
   */
  SortedSet<String> getIndexExtensibleMatchingRule();



  /**
   * Sets the "index-extensible-matching-rule" property.
   * <p>
   * The extensible matching rule in an extensible index.
   * <p>
   * An extensible matching rule must be specified using either LOCALE
   * or OID of the matching rule.
   *
   * @param values The values of the "index-extensible-matching-rule" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setIndexExtensibleMatchingRule(Collection<String> values) throws IllegalPropertyValueException;



  /**
   * Gets the "index-type" property.
   * <p>
   * Specifies the type(s) of indexing that should be performed for
   * the associated attribute.
   * <p>
   * For equality, presence, and substring index types, the associated
   * attribute type must have a corresponding matching rule.
   *
   * @return Returns the values of the "index-type" property.
   */
  SortedSet<IndexType> getIndexType();



  /**
   * Sets the "index-type" property.
   * <p>
   * Specifies the type(s) of indexing that should be performed for
   * the associated attribute.
   * <p>
   * For equality, presence, and substring index types, the associated
   * attribute type must have a corresponding matching rule.
   *
   * @param values The values of the "index-type" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setIndexType(Collection<IndexType> values) throws IllegalPropertyValueException;



  /**
   * Gets the "substring-length" property.
   * <p>
   * The length of substrings in a substring index.
   *
   * @return Returns the value of the "substring-length" property.
   */
  int getSubstringLength();



  /**
   * Sets the "substring-length" property.
   * <p>
   * The length of substrings in a substring index.
   *
   * @param value The value of the "substring-length" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setSubstringLength(Integer value) throws IllegalPropertyValueException;

}
