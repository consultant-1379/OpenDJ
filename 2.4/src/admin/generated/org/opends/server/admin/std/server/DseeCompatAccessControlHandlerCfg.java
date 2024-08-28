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
import org.opends.server.authorization.dseecompat.Aci;



/**
 * A server-side interface for querying Dsee Compat Access Control
 * Handler settings.
 * <p>
 * The Dsee Compat Access Control Handler provides an implementation
 * that uses syntax compatible with the Sun Java System Directory
 * Server Enterprise Edition access control handlers.
 */
public interface DseeCompatAccessControlHandlerCfg extends AccessControlHandlerCfg {

  /**
   * Gets the configuration class associated with this Dsee Compat Access Control Handler.
   *
   * @return Returns the configuration class associated with this Dsee Compat Access Control Handler.
   */
  Class<? extends DseeCompatAccessControlHandlerCfg> configurationClass();



  /**
   * Register to be notified when this Dsee Compat Access Control Handler is changed.
   *
   * @param listener
   *          The Dsee Compat Access Control Handler configuration change listener.
   */
  void addDseeCompatChangeListener(ConfigurationChangeListener<DseeCompatAccessControlHandlerCfg> listener);



  /**
   * Deregister an existing Dsee Compat Access Control Handler configuration change listener.
   *
   * @param listener
   *          The Dsee Compat Access Control Handler configuration change listener.
   */
  void removeDseeCompatChangeListener(ConfigurationChangeListener<DseeCompatAccessControlHandlerCfg> listener);



  /**
   * Gets the "global-aci" property.
   * <p>
   * Defines global access control rules.
   * <p>
   * Global access control rules apply to all entries anywhere in the
   * data managed by the Directory Server. The global access control
   * rules may be overridden by more specific access control rules
   * placed in the data.
   *
   * @return Returns an unmodifiable set containing the values of the "global-aci" property.
   */
  SortedSet<Aci> getGlobalACI();



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Dsee Compat Access Control Handler implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();

}
