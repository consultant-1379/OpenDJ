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
import org.opends.server.admin.std.server.ExactMatchIdentityMapperCfg;
import org.opends.server.types.AttributeType;
import org.opends.server.types.DN;



/**
 * A client-side interface for reading and modifying Exact Match
 * Identity Mapper settings.
 * <p>
 * The Exact Match Identity Mapper maps an identifier string to user
 * entries by searching for the entry containing a specified attribute
 * whose value is the provided identifier. For example, the username
 * provided by the client for DIGEST-MD5 authentication must match the
 * value of the uid attribute
 */
public interface ExactMatchIdentityMapperCfgClient extends IdentityMapperCfgClient {

  /**
   * Get the configuration definition associated with this Exact Match Identity Mapper.
   *
   * @return Returns the configuration definition associated with this Exact Match Identity Mapper.
   */
  ManagedObjectDefinition<? extends ExactMatchIdentityMapperCfgClient, ? extends ExactMatchIdentityMapperCfg> definition();



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Exact Match Identity Mapper implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();



  /**
   * Sets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Exact Match Identity Mapper implementation.
   *
   * @param value The value of the "java-class" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setJavaClass(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "match-attribute" property.
   * <p>
   * Specifies the attribute whose value should exactly match the ID
   * string provided to this identity mapper.
   * <p>
   * At least one value must be provided. All values must refer to the
   * name or OID of an attribute type defined in the Directory Server
   * schema. If multiple attributes or OIDs are provided, at least one
   * of those attributes must contain the provided ID string value in
   * exactly one entry. The internal search performed includes a
   * logical OR across all of these values.
   *
   * @return Returns the values of the "match-attribute" property.
   */
  SortedSet<AttributeType> getMatchAttribute();



  /**
   * Sets the "match-attribute" property.
   * <p>
   * Specifies the attribute whose value should exactly match the ID
   * string provided to this identity mapper.
   * <p>
   * At least one value must be provided. All values must refer to the
   * name or OID of an attribute type defined in the Directory Server
   * schema. If multiple attributes or OIDs are provided, at least one
   * of those attributes must contain the provided ID string value in
   * exactly one entry. The internal search performed includes a
   * logical OR across all of these values.
   *
   * @param values The values of the "match-attribute" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setMatchAttribute(Collection<AttributeType> values) throws IllegalPropertyValueException;



  /**
   * Gets the "match-base-dn" property.
   * <p>
   * Specifies the set of base DNs below which to search for users.
   * <p>
   * The base DNs will be used when performing searches to map the
   * provided ID string to a user entry. If multiple values are given,
   * searches are performed below all specified base DNs.
   *
   * @return Returns the values of the "match-base-dn" property.
   */
  SortedSet<DN> getMatchBaseDN();



  /**
   * Sets the "match-base-dn" property.
   * <p>
   * Specifies the set of base DNs below which to search for users.
   * <p>
   * The base DNs will be used when performing searches to map the
   * provided ID string to a user entry. If multiple values are given,
   * searches are performed below all specified base DNs.
   *
   * @param values The values of the "match-base-dn" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setMatchBaseDN(Collection<DN> values) throws IllegalPropertyValueException;

}
