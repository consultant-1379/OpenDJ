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
 * A server-side interface for querying Start TLS Extended Operation
 * Handler settings.
 * <p>
 * The Start TLS Extended Operation Handler provides the ability
 * clients to use the StartTLS extended operation to initiate a secure
 * communication channel over an otherwise clear-text LDAP connection.
 */
public interface StartTLSExtendedOperationHandlerCfg extends ExtendedOperationHandlerCfg {

  /**
   * Gets the configuration class associated with this Start TLS Extended Operation Handler.
   *
   * @return Returns the configuration class associated with this Start TLS Extended Operation Handler.
   */
  Class<? extends StartTLSExtendedOperationHandlerCfg> configurationClass();



  /**
   * Register to be notified when this Start TLS Extended Operation Handler is changed.
   *
   * @param listener
   *          The Start TLS Extended Operation Handler configuration change listener.
   */
  void addStartTLSChangeListener(ConfigurationChangeListener<StartTLSExtendedOperationHandlerCfg> listener);



  /**
   * Deregister an existing Start TLS Extended Operation Handler configuration change listener.
   *
   * @param listener
   *          The Start TLS Extended Operation Handler configuration change listener.
   */
  void removeStartTLSChangeListener(ConfigurationChangeListener<StartTLSExtendedOperationHandlerCfg> listener);



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Start TLS Extended Operation Handler implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();

}
