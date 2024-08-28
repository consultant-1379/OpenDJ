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
import org.opends.server.admin.std.meta.CollationMatchingRuleCfgDefn.MatchingRuleType;
import org.opends.server.admin.std.server.CollationMatchingRuleCfg;



/**
 * A client-side interface for reading and modifying Collation
 * Matching Rule settings.
 * <p>
 * Collation Matching Rules provide support for locale-specific
 * filtering and indexing.
 */
public interface CollationMatchingRuleCfgClient extends MatchingRuleCfgClient {

  /**
   * Get the configuration definition associated with this Collation Matching Rule.
   *
   * @return Returns the configuration definition associated with this Collation Matching Rule.
   */
  ManagedObjectDefinition<? extends CollationMatchingRuleCfgClient, ? extends CollationMatchingRuleCfg> definition();



  /**
   * Gets the "collation" property.
   * <p>
   * the set of supported locales
   * <p>
   * Collation must be specified using the syntax: LOCALE:OID
   *
   * @return Returns the values of the "collation" property.
   */
  SortedSet<String> getCollation();



  /**
   * Sets the "collation" property.
   * <p>
   * the set of supported locales
   * <p>
   * Collation must be specified using the syntax: LOCALE:OID
   *
   * @param values The values of the "collation" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setCollation(Collection<String> values) throws IllegalPropertyValueException;



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Collation Matching Rule implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();



  /**
   * Sets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Collation Matching Rule implementation.
   *
   * @param value The value of the "java-class" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setJavaClass(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "matching-rule-type" property.
   * <p>
   * the types of matching rules that should be supported for each
   * locale
   *
   * @return Returns the values of the "matching-rule-type" property.
   */
  SortedSet<MatchingRuleType> getMatchingRuleType();



  /**
   * Sets the "matching-rule-type" property.
   * <p>
   * the types of matching rules that should be supported for each
   * locale
   *
   * @param values The values of the "matching-rule-type" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setMatchingRuleType(Collection<MatchingRuleType> values) throws IllegalPropertyValueException;

}
