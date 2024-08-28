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
import org.opends.server.admin.std.meta.CollationMatchingRuleCfgDefn.MatchingRuleType;



/**
 * A server-side interface for querying Collation Matching Rule
 * settings.
 * <p>
 * Collation Matching Rules provide support for locale-specific
 * filtering and indexing.
 */
public interface CollationMatchingRuleCfg extends MatchingRuleCfg {

  /**
   * Gets the configuration class associated with this Collation Matching Rule.
   *
   * @return Returns the configuration class associated with this Collation Matching Rule.
   */
  Class<? extends CollationMatchingRuleCfg> configurationClass();



  /**
   * Register to be notified when this Collation Matching Rule is changed.
   *
   * @param listener
   *          The Collation Matching Rule configuration change listener.
   */
  void addCollationChangeListener(ConfigurationChangeListener<CollationMatchingRuleCfg> listener);



  /**
   * Deregister an existing Collation Matching Rule configuration change listener.
   *
   * @param listener
   *          The Collation Matching Rule configuration change listener.
   */
  void removeCollationChangeListener(ConfigurationChangeListener<CollationMatchingRuleCfg> listener);



  /**
   * Gets the "collation" property.
   * <p>
   * the set of supported locales
   * <p>
   * Collation must be specified using the syntax: LOCALE:OID
   *
   * @return Returns an unmodifiable set containing the values of the "collation" property.
   */
  SortedSet<String> getCollation();



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
   * Gets the "matching-rule-type" property.
   * <p>
   * the types of matching rules that should be supported for each
   * locale
   *
   * @return Returns an unmodifiable set containing the values of the "matching-rule-type" property.
   */
  SortedSet<MatchingRuleType> getMatchingRuleType();

}
