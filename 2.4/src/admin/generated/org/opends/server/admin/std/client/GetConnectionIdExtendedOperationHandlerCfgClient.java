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
import org.opends.server.admin.std.server.GetConnectionIdExtendedOperationHandlerCfg;



/**
 * A client-side interface for reading and modifying Get Connection Id
 * Extended Operation Handler settings.
 * <p>
 * The Get Connection Id Extended Operation Handler provides a
 * mechanism for clients to obtain the internal connection ID that the
 * server uses to reference their client connection.
 */
public interface GetConnectionIdExtendedOperationHandlerCfgClient extends ExtendedOperationHandlerCfgClient {

  /**
   * Get the configuration definition associated with this Get Connection Id Extended Operation Handler.
   *
   * @return Returns the configuration definition associated with this Get Connection Id Extended Operation Handler.
   */
  ManagedObjectDefinition<? extends GetConnectionIdExtendedOperationHandlerCfgClient, ? extends GetConnectionIdExtendedOperationHandlerCfg> definition();



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Get Connection Id Extended Operation Handler
   * implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();



  /**
   * Sets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Get Connection Id Extended Operation Handler
   * implementation.
   *
   * @param value The value of the "java-class" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setJavaClass(String value) throws IllegalPropertyValueException;

}
