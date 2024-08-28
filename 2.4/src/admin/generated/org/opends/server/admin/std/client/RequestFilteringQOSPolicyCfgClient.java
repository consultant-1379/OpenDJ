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
import org.opends.server.admin.std.meta.RequestFilteringQOSPolicyCfgDefn.AllowedOperations;
import org.opends.server.admin.std.meta.RequestFilteringQOSPolicyCfgDefn.AllowedSearchScopes;
import org.opends.server.admin.std.server.RequestFilteringQOSPolicyCfg;
import org.opends.server.types.DN;



/**
 * A client-side interface for reading and modifying Request Filtering
 * QOS Policy settings.
 * <p>
 * The Request Filtering QOS Policy is used to define the type of
 * requests allowed by the server.
 */
public interface RequestFilteringQOSPolicyCfgClient extends QOSPolicyCfgClient {

  /**
   * Get the configuration definition associated with this Request Filtering QOS Policy.
   *
   * @return Returns the configuration definition associated with this Request Filtering QOS Policy.
   */
  ManagedObjectDefinition<? extends RequestFilteringQOSPolicyCfgClient, ? extends RequestFilteringQOSPolicyCfg> definition();



  /**
   * Gets the "allowed-attributes" property.
   * <p>
   * Specifies which attributes are allowed in search and compare
   * operations.
   *
   * @return Returns the values of the "allowed-attributes" property.
   */
  SortedSet<String> getAllowedAttributes();



  /**
   * Sets the "allowed-attributes" property.
   * <p>
   * Specifies which attributes are allowed in search and compare
   * operations.
   *
   * @param values The values of the "allowed-attributes" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setAllowedAttributes(Collection<String> values) throws IllegalPropertyValueException;



  /**
   * Gets the "allowed-operations" property.
   * <p>
   * Specifies which operations are allowed by the server.
   *
   * @return Returns the values of the "allowed-operations" property.
   */
  SortedSet<AllowedOperations> getAllowedOperations();



  /**
   * Sets the "allowed-operations" property.
   * <p>
   * Specifies which operations are allowed by the server.
   *
   * @param values The values of the "allowed-operations" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setAllowedOperations(Collection<AllowedOperations> values) throws IllegalPropertyValueException;



  /**
   * Gets the "allowed-search-scopes" property.
   * <p>
   * Specifies which search scopes are allowed by the server.
   *
   * @return Returns the values of the "allowed-search-scopes" property.
   */
  SortedSet<AllowedSearchScopes> getAllowedSearchScopes();



  /**
   * Sets the "allowed-search-scopes" property.
   * <p>
   * Specifies which search scopes are allowed by the server.
   *
   * @param values The values of the "allowed-search-scopes" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setAllowedSearchScopes(Collection<AllowedSearchScopes> values) throws IllegalPropertyValueException;



  /**
   * Gets the "allowed-subtrees" property.
   * <p>
   * Specifies which subtrees are accessible to clients.
   *
   * @return Returns the values of the "allowed-subtrees" property.
   */
  SortedSet<DN> getAllowedSubtrees();



  /**
   * Sets the "allowed-subtrees" property.
   * <p>
   * Specifies which subtrees are accessible to clients.
   *
   * @param values The values of the "allowed-subtrees" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setAllowedSubtrees(Collection<DN> values) throws IllegalPropertyValueException;



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Request Filtering QOS Policy implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();



  /**
   * Sets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Request Filtering QOS Policy implementation.
   *
   * @param value The value of the "java-class" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setJavaClass(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "prohibited-attributes" property.
   * <p>
   * Specifies which attributes are not allowed in search and compare
   * operations.
   *
   * @return Returns the values of the "prohibited-attributes" property.
   */
  SortedSet<String> getProhibitedAttributes();



  /**
   * Sets the "prohibited-attributes" property.
   * <p>
   * Specifies which attributes are not allowed in search and compare
   * operations.
   *
   * @param values The values of the "prohibited-attributes" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setProhibitedAttributes(Collection<String> values) throws IllegalPropertyValueException;



  /**
   * Gets the "prohibited-subtrees" property.
   * <p>
   * Specifies which subtrees must be hidden from clients. Each
   * prohibited subtree must be subordinate to an allowed subtree.
   *
   * @return Returns the values of the "prohibited-subtrees" property.
   */
  SortedSet<DN> getProhibitedSubtrees();



  /**
   * Sets the "prohibited-subtrees" property.
   * <p>
   * Specifies which subtrees must be hidden from clients. Each
   * prohibited subtree must be subordinate to an allowed subtree.
   *
   * @param values The values of the "prohibited-subtrees" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setProhibitedSubtrees(Collection<DN> values) throws IllegalPropertyValueException;

}
