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
import org.opends.server.admin.std.server.RegularExpressionIdentityMapperCfg;
import org.opends.server.types.AttributeType;
import org.opends.server.types.DN;



/**
 * A client-side interface for reading and modifying Regular
 * Expression Identity Mapper settings.
 * <p>
 * The Regular Expression Identity Mapper provides a way to use a
 * regular expression to translate the provided identifier when
 * searching for the appropriate user entry.
 */
public interface RegularExpressionIdentityMapperCfgClient extends IdentityMapperCfgClient {

  /**
   * Get the configuration definition associated with this Regular Expression Identity Mapper.
   *
   * @return Returns the configuration definition associated with this Regular Expression Identity Mapper.
   */
  ManagedObjectDefinition<? extends RegularExpressionIdentityMapperCfgClient, ? extends RegularExpressionIdentityMapperCfg> definition();



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Regular Expression Identity Mapper implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();



  /**
   * Sets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Regular Expression Identity Mapper implementation.
   *
   * @param value The value of the "java-class" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setJavaClass(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "match-attribute" property.
   * <p>
   * Specifies the name or OID of the attribute whose value should
   * match the provided identifier string after it has been processed
   * by the associated regular expression.
   * <p>
   * All values must refer to the name or OID of an attribute type
   * defined in the Directory Server schema. If multiple attributes or
   * OIDs are provided, at least one of those attributes must contain
   * the provided ID string value in exactly one entry.
   *
   * @return Returns the values of the "match-attribute" property.
   */
  SortedSet<AttributeType> getMatchAttribute();



  /**
   * Sets the "match-attribute" property.
   * <p>
   * Specifies the name or OID of the attribute whose value should
   * match the provided identifier string after it has been processed
   * by the associated regular expression.
   * <p>
   * All values must refer to the name or OID of an attribute type
   * defined in the Directory Server schema. If multiple attributes or
   * OIDs are provided, at least one of those attributes must contain
   * the provided ID string value in exactly one entry.
   *
   * @param values The values of the "match-attribute" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setMatchAttribute(Collection<AttributeType> values) throws IllegalPropertyValueException;



  /**
   * Gets the "match-base-dn" property.
   * <p>
   * Specifies the base DN(s) that should be used when performing
   * searches to map the provided ID string to a user entry. If
   * multiple values are given, searches are performed below all the
   * specified base DNs.
   *
   * @return Returns the values of the "match-base-dn" property.
   */
  SortedSet<DN> getMatchBaseDN();



  /**
   * Sets the "match-base-dn" property.
   * <p>
   * Specifies the base DN(s) that should be used when performing
   * searches to map the provided ID string to a user entry. If
   * multiple values are given, searches are performed below all the
   * specified base DNs.
   *
   * @param values The values of the "match-base-dn" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setMatchBaseDN(Collection<DN> values) throws IllegalPropertyValueException;



  /**
   * Gets the "match-pattern" property.
   * <p>
   * Specifies the regular expression pattern that is used to identify
   * portions of the ID string that will be replaced.
   * <p>
   * Any portion of the ID string that matches this pattern is
   * replaced in accordance with the provided replace pattern (or is
   * removed if no replace pattern is specified). If multiple
   * substrings within the given ID string match this pattern, all
   * occurrences are replaced. If no part of the given ID string
   * matches this pattern, the ID string is not altered. Exactly one
   * match pattern value must be provided, and it must be a valid
   * regular expression as described in the API documentation for the
   * java.util.regex.Pattern class, including support for capturing
   * groups.
   *
   * @return Returns the value of the "match-pattern" property.
   */
  String getMatchPattern();



  /**
   * Sets the "match-pattern" property.
   * <p>
   * Specifies the regular expression pattern that is used to identify
   * portions of the ID string that will be replaced.
   * <p>
   * Any portion of the ID string that matches this pattern is
   * replaced in accordance with the provided replace pattern (or is
   * removed if no replace pattern is specified). If multiple
   * substrings within the given ID string match this pattern, all
   * occurrences are replaced. If no part of the given ID string
   * matches this pattern, the ID string is not altered. Exactly one
   * match pattern value must be provided, and it must be a valid
   * regular expression as described in the API documentation for the
   * java.util.regex.Pattern class, including support for capturing
   * groups.
   *
   * @param value The value of the "match-pattern" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setMatchPattern(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "replace-pattern" property.
   * <p>
   * Specifies the replacement pattern that should be used for
   * substrings in the ID string that match the provided regular
   * expression pattern.
   * <p>
   * If no replacement pattern is provided, then any matching portions
   * of the ID string will be removed (i.e., replaced with an empty
   * string). The replacement pattern may include a string from a
   * capturing group by using a dollar sign ($) followed by an integer
   * value that indicates which capturing group should be used.
   *
   * @return Returns the value of the "replace-pattern" property.
   */
  String getReplacePattern();



  /**
   * Sets the "replace-pattern" property.
   * <p>
   * Specifies the replacement pattern that should be used for
   * substrings in the ID string that match the provided regular
   * expression pattern.
   * <p>
   * If no replacement pattern is provided, then any matching portions
   * of the ID string will be removed (i.e., replaced with an empty
   * string). The replacement pattern may include a string from a
   * capturing group by using a dollar sign ($) followed by an integer
   * value that indicates which capturing group should be used.
   *
   * @param value The value of the "replace-pattern" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setReplacePattern(String value) throws IllegalPropertyValueException;

}
