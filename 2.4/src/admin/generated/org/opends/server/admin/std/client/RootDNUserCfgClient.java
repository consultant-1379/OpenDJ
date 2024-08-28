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
import org.opends.server.admin.ConfigurationClient;
import org.opends.server.admin.IllegalPropertyValueException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.std.server.RootDNUserCfg;
import org.opends.server.types.DN;



/**
 * A client-side interface for reading and modifying Root DN User
 * settings.
 * <p>
 * A Root DN User are administrative users who can granted special
 * privileges that are not available to non-root users (for example,
 * the ability to bind to the server in lockdown mode).
 */
public interface RootDNUserCfgClient extends ConfigurationClient {

  /**
   * Get the configuration definition associated with this Root DN User.
   *
   * @return Returns the configuration definition associated with this Root DN User.
   */
  ManagedObjectDefinition<? extends RootDNUserCfgClient, ? extends RootDNUserCfg> definition();



  /**
   * Gets the "alternate-bind-dn" property.
   * <p>
   * Specifies one or more alternate DNs that can be used to bind to
   * the server as this root user.
   *
   * @return Returns the values of the "alternate-bind-dn" property.
   */
  SortedSet<DN> getAlternateBindDN();



  /**
   * Sets the "alternate-bind-dn" property.
   * <p>
   * Specifies one or more alternate DNs that can be used to bind to
   * the server as this root user.
   *
   * @param values The values of the "alternate-bind-dn" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setAlternateBindDN(Collection<DN> values) throws IllegalPropertyValueException;

}
