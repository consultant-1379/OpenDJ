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
 * A server-side interface for querying Anonymous SASL Mechanism
 * Handler settings.
 * <p>
 * The ANONYMOUS SASL mechanism provides the ability for clients to
 * perform an anonymous bind using a SASL mechanism.
 */
public interface AnonymousSASLMechanismHandlerCfg extends SASLMechanismHandlerCfg {

  /**
   * Gets the configuration class associated with this Anonymous SASL Mechanism Handler.
   *
   * @return Returns the configuration class associated with this Anonymous SASL Mechanism Handler.
   */
  Class<? extends AnonymousSASLMechanismHandlerCfg> configurationClass();



  /**
   * Register to be notified when this Anonymous SASL Mechanism Handler is changed.
   *
   * @param listener
   *          The Anonymous SASL Mechanism Handler configuration change listener.
   */
  void addAnonymousChangeListener(ConfigurationChangeListener<AnonymousSASLMechanismHandlerCfg> listener);



  /**
   * Deregister an existing Anonymous SASL Mechanism Handler configuration change listener.
   *
   * @param listener
   *          The Anonymous SASL Mechanism Handler configuration change listener.
   */
  void removeAnonymousChangeListener(ConfigurationChangeListener<AnonymousSASLMechanismHandlerCfg> listener);



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the SASL mechanism handler implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();

}
