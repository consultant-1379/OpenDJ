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



import org.opends.server.admin.IllegalPropertyValueException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.std.server.LDIFConnectionHandlerCfg;



/**
 * A client-side interface for reading and modifying LDIF Connection
 * Handler settings.
 * <p>
 * The LDIF Connection Handler is used to process changes in the
 * server using internal operations, where the changes to process are
 * read from an LDIF file.
 */
public interface LDIFConnectionHandlerCfgClient extends ConnectionHandlerCfgClient {

  /**
   * Get the configuration definition associated with this LDIF Connection Handler.
   *
   * @return Returns the configuration definition associated with this LDIF Connection Handler.
   */
  ManagedObjectDefinition<? extends LDIFConnectionHandlerCfgClient, ? extends LDIFConnectionHandlerCfg> definition();



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the LDIF Connection Handler implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();



  /**
   * Sets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the LDIF Connection Handler implementation.
   *
   * @param value The value of the "java-class" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setJavaClass(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "ldif-directory" property.
   * <p>
   * Specifies the path to the directory in which the LDIF files
   * should be placed.
   *
   * @return Returns the value of the "ldif-directory" property.
   */
  String getLDIFDirectory();



  /**
   * Sets the "ldif-directory" property.
   * <p>
   * Specifies the path to the directory in which the LDIF files
   * should be placed.
   *
   * @param value The value of the "ldif-directory" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setLDIFDirectory(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "poll-interval" property.
   * <p>
   * Specifies how frequently the LDIF connection handler should check
   * the LDIF directory to determine whether a new LDIF file has been
   * added.
   *
   * @return Returns the value of the "poll-interval" property.
   */
  long getPollInterval();



  /**
   * Sets the "poll-interval" property.
   * <p>
   * Specifies how frequently the LDIF connection handler should check
   * the LDIF directory to determine whether a new LDIF file has been
   * added.
   *
   * @param value The value of the "poll-interval" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setPollInterval(long value) throws IllegalPropertyValueException;

}
