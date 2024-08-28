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
package org.opends.server.admin.std.server;



import java.util.SortedSet;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.std.meta.RequestFilteringQOSPolicyCfgDefn.AllowedOperations;
import org.opends.server.admin.std.meta.RequestFilteringQOSPolicyCfgDefn.AllowedSearchScopes;
import org.opends.server.types.DN;



/**
 * A server-side interface for querying Request Filtering QOS Policy
 * settings.
 * <p>
 * The Request Filtering QOS Policy is used to define the type of
 * requests allowed by the server.
 */
public interface RequestFilteringQOSPolicyCfg extends QOSPolicyCfg {

  /**
   * Gets the configuration class associated with this Request Filtering QOS Policy.
   *
   * @return Returns the configuration class associated with this Request Filtering QOS Policy.
   */
  Class<? extends RequestFilteringQOSPolicyCfg> configurationClass();



  /**
   * Register to be notified when this Request Filtering QOS Policy is changed.
   *
   * @param listener
   *          The Request Filtering QOS Policy configuration change listener.
   */
  void addRequestFilteringChangeListener(ConfigurationChangeListener<RequestFilteringQOSPolicyCfg> listener);



  /**
   * Deregister an existing Request Filtering QOS Policy configuration change listener.
   *
   * @param listener
   *          The Request Filtering QOS Policy configuration change listener.
   */
  void removeRequestFilteringChangeListener(ConfigurationChangeListener<RequestFilteringQOSPolicyCfg> listener);



  /**
   * Gets the "allowed-attributes" property.
   * <p>
   * Specifies which attributes are allowed in search and compare
   * operations.
   *
   * @return Returns an unmodifiable set containing the values of the "allowed-attributes" property.
   */
  SortedSet<String> getAllowedAttributes();



  /**
   * Gets the "allowed-operations" property.
   * <p>
   * Specifies which operations are allowed by the server.
   *
   * @return Returns an unmodifiable set containing the values of the "allowed-operations" property.
   */
  SortedSet<AllowedOperations> getAllowedOperations();



  /**
   * Gets the "allowed-search-scopes" property.
   * <p>
   * Specifies which search scopes are allowed by the server.
   *
   * @return Returns an unmodifiable set containing the values of the "allowed-search-scopes" property.
   */
  SortedSet<AllowedSearchScopes> getAllowedSearchScopes();



  /**
   * Gets the "allowed-subtrees" property.
   * <p>
   * Specifies which subtrees are accessible to clients.
   *
   * @return Returns an unmodifiable set containing the values of the "allowed-subtrees" property.
   */
  SortedSet<DN> getAllowedSubtrees();



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
   * Gets the "prohibited-attributes" property.
   * <p>
   * Specifies which attributes are not allowed in search and compare
   * operations.
   *
   * @return Returns an unmodifiable set containing the values of the "prohibited-attributes" property.
   */
  SortedSet<String> getProhibitedAttributes();



  /**
   * Gets the "prohibited-subtrees" property.
   * <p>
   * Specifies which subtrees must be hidden from clients. Each
   * prohibited subtree must be subordinate to an allowed subtree.
   *
   * @return Returns an unmodifiable set containing the values of the "prohibited-subtrees" property.
   */
  SortedSet<DN> getProhibitedSubtrees();

}
