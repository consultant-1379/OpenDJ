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
import org.opends.server.admin.std.meta.LocalDBVLVIndexCfgDefn.Scope;
import org.opends.server.admin.std.server.LocalDBVLVIndexCfg;
import org.opends.server.types.DN;



/**
 * A client-side interface for reading and modifying Local DB VLV
 * Index settings.
 * <p>
 * Local DB VLV Indexes are used to store information about a specific
 * search request that makes it possible to efficiently process them
 * using the VLV control.
 */
public interface LocalDBVLVIndexCfgClient extends ConfigurationClient {

  /**
   * Get the configuration definition associated with this Local DB VLV Index.
   *
   * @return Returns the configuration definition associated with this Local DB VLV Index.
   */
  ManagedObjectDefinition<? extends LocalDBVLVIndexCfgClient, ? extends LocalDBVLVIndexCfg> definition();



  /**
   * Gets the "base-dn" property.
   * <p>
   * Specifies the base DN used in the search query that is being
   * indexed.
   *
   * @return Returns the value of the "base-dn" property.
   */
  DN getBaseDN();



  /**
   * Sets the "base-dn" property.
   * <p>
   * Specifies the base DN used in the search query that is being
   * indexed.
   *
   * @param value The value of the "base-dn" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setBaseDN(DN value) throws IllegalPropertyValueException;



  /**
   * Gets the "filter" property.
   * <p>
   * Specifies the LDAP filter used in the query that is being
   * indexed.
   *
   * @return Returns the value of the "filter" property.
   */
  String getFilter();



  /**
   * Sets the "filter" property.
   * <p>
   * Specifies the LDAP filter used in the query that is being
   * indexed.
   *
   * @param value The value of the "filter" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setFilter(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "max-block-size" property.
   * <p>
   * Specifies the number of entry IDs to store in a single sorted set
   * before it must be split.
   *
   * @return Returns the value of the "max-block-size" property.
   */
  int getMaxBlockSize();



  /**
   * Sets the "max-block-size" property.
   * <p>
   * Specifies the number of entry IDs to store in a single sorted set
   * before it must be split.
   * <p>
   * This property is read-only and can only be modified during
   * creation of a Local DB VLV Index.
   *
   * @param value The value of the "max-block-size" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   * @throws PropertyIsReadOnlyException
   *           If this Local DB VLV Index is not being initialized.
   */
  void setMaxBlockSize(Integer value) throws IllegalPropertyValueException, PropertyIsReadOnlyException;



  /**
   * Gets the "name" property.
   * <p>
   * Specifies a unique name for this VLV index.
   *
   * @return Returns the value of the "name" property.
   */
  String getName();



  /**
   * Sets the "name" property.
   * <p>
   * Specifies a unique name for this VLV index.
   * <p>
   * This property is read-only and can only be modified during
   * creation of a Local DB VLV Index.
   *
   * @param value The value of the "name" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   * @throws PropertyIsReadOnlyException
   *           If this Local DB VLV Index is not being initialized.
   */
  void setName(String value) throws IllegalPropertyValueException, PropertyIsReadOnlyException;



  /**
   * Gets the "scope" property.
   * <p>
   * Specifies the LDAP scope of the query that is being indexed.
   *
   * @return Returns the value of the "scope" property.
   */
  Scope getScope();



  /**
   * Sets the "scope" property.
   * <p>
   * Specifies the LDAP scope of the query that is being indexed.
   *
   * @param value The value of the "scope" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setScope(Scope value) throws IllegalPropertyValueException;



  /**
   * Gets the "sort-order" property.
   * <p>
   * Specifies the names of the attributes that are used to sort the
   * entries for the query being indexed.
   * <p>
   * Multiple attributes can be used to determine the sort order by
   * listing the attribute names from highest to lowest precedence.
   * Optionally, + or - can be prefixed to the attribute name to sort
   * the attribute in ascending order or descending order respectively.
   *
   * @return Returns the value of the "sort-order" property.
   */
  String getSortOrder();



  /**
   * Sets the "sort-order" property.
   * <p>
   * Specifies the names of the attributes that are used to sort the
   * entries for the query being indexed.
   * <p>
   * Multiple attributes can be used to determine the sort order by
   * listing the attribute names from highest to lowest precedence.
   * Optionally, + or - can be prefixed to the attribute name to sort
   * the attribute in ascending order or descending order respectively.
   *
   * @param value The value of the "sort-order" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setSortOrder(String value) throws IllegalPropertyValueException;

}
