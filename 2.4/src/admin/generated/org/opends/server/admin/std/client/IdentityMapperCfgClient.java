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
import org.opends.server.admin.std.server.IdentityMapperCfg;



/**
 * A client-side interface for reading and modifying Identity Mapper
 * settings.
 * <p>
 * Identity Mappers are responsible for establishing a mapping between
 * an identifier string provided by a client, and the entry for the
 * user that corresponds to that identifier. Identity Mappers are used
 * to process several SASL mechanisms to map an authorization ID (e.g.,
 * a Kerberos principal when using GSSAPI) to a directory user. They
 * are also used when processing requests with the proxied
 * authorization control.
 */
public interface IdentityMapperCfgClient extends ConfigurationClient {

  /**
   * Get the configuration definition associated with this Identity Mapper.
   *
   * @return Returns the configuration definition associated with this Identity Mapper.
   */
  ManagedObjectDefinition<? extends IdentityMapperCfgClient, ? extends IdentityMapperCfg> definition();



  /**
   * Gets the "enabled" property.
   * <p>
   * Indicates whether the Identity Mapper is enabled for use.
   *
   * @return Returns the value of the "enabled" property.
   */
  Boolean isEnabled();



  /**
   * Sets the "enabled" property.
   * <p>
   * Indicates whether the Identity Mapper is enabled for use.
   *
   * @param value The value of the "enabled" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setEnabled(boolean value) throws IllegalPropertyValueException;



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Identity Mapper implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();



  /**
   * Sets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Identity Mapper implementation.
   *
   * @param value The value of the "java-class" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setJavaClass(String value) throws IllegalPropertyValueException;

}
