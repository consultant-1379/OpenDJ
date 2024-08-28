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



import org.opends.server.admin.server.ConfigurationChangeListener;



/**
 * A server-side interface for querying Cancel Extended Operation
 * Handler settings.
 * <p>
 * The Cancel Extended Operation Handler provides support for the LDAP
 * cancel extended operation as defined in RFC 3909.
 */
public interface CancelExtendedOperationHandlerCfg extends ExtendedOperationHandlerCfg {

  /**
   * Gets the configuration class associated with this Cancel Extended Operation Handler.
   *
   * @return Returns the configuration class associated with this Cancel Extended Operation Handler.
   */
  Class<? extends CancelExtendedOperationHandlerCfg> configurationClass();



  /**
   * Register to be notified when this Cancel Extended Operation Handler is changed.
   *
   * @param listener
   *          The Cancel Extended Operation Handler configuration change listener.
   */
  void addCancelChangeListener(ConfigurationChangeListener<CancelExtendedOperationHandlerCfg> listener);



  /**
   * Deregister an existing Cancel Extended Operation Handler configuration change listener.
   *
   * @param listener
   *          The Cancel Extended Operation Handler configuration change listener.
   */
  void removeCancelChangeListener(ConfigurationChangeListener<CancelExtendedOperationHandlerCfg> listener);



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Cancel Extended Operation Handler implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();

}
