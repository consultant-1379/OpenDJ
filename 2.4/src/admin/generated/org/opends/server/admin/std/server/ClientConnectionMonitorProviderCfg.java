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
 * A server-side interface for querying Client Connection Monitor
 * Provider settings.
 * <p>
 * The Client Connection Monitor Provider exposes monitor information
 * about the set of client connections that are established to the
 * Directory Server.
 */
public interface ClientConnectionMonitorProviderCfg extends MonitorProviderCfg {

  /**
   * Gets the configuration class associated with this Client Connection Monitor Provider.
   *
   * @return Returns the configuration class associated with this Client Connection Monitor Provider.
   */
  Class<? extends ClientConnectionMonitorProviderCfg> configurationClass();



  /**
   * Register to be notified when this Client Connection Monitor Provider is changed.
   *
   * @param listener
   *          The Client Connection Monitor Provider configuration change listener.
   */
  void addClientConnectionChangeListener(ConfigurationChangeListener<ClientConnectionMonitorProviderCfg> listener);



  /**
   * Deregister an existing Client Connection Monitor Provider configuration change listener.
   *
   * @param listener
   *          The Client Connection Monitor Provider configuration change listener.
   */
  void removeClientConnectionChangeListener(ConfigurationChangeListener<ClientConnectionMonitorProviderCfg> listener);



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Client Connection Monitor Provider implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();

}
