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
 * A server-side interface for querying JMX Alert Handler settings.
 * <p>
 * The JMX Alert Handler is used to generate JMX notifications to
 * alert administrators of significant events that occur within the
 * server.
 */
public interface JMXAlertHandlerCfg extends AlertHandlerCfg {

  /**
   * Gets the configuration class associated with this JMX Alert Handler.
   *
   * @return Returns the configuration class associated with this JMX Alert Handler.
   */
  Class<? extends JMXAlertHandlerCfg> configurationClass();



  /**
   * Register to be notified when this JMX Alert Handler is changed.
   *
   * @param listener
   *          The JMX Alert Handler configuration change listener.
   */
  void addJMXChangeListener(ConfigurationChangeListener<JMXAlertHandlerCfg> listener);



  /**
   * Deregister an existing JMX Alert Handler configuration change listener.
   *
   * @param listener
   *          The JMX Alert Handler configuration change listener.
   */
  void removeJMXChangeListener(ConfigurationChangeListener<JMXAlertHandlerCfg> listener);



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the JMX Alert Handler implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();

}
