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
 * A server-side interface for querying Blind Trust Manager Provider
 * settings.
 * <p>
 * The blind trust manager provider always trusts any certificate that
 * is presented to it, regardless of its issuer, subject, and validity
 * dates.
 */
public interface BlindTrustManagerProviderCfg extends TrustManagerProviderCfg {

  /**
   * Gets the configuration class associated with this Blind Trust Manager Provider.
   *
   * @return Returns the configuration class associated with this Blind Trust Manager Provider.
   */
  Class<? extends BlindTrustManagerProviderCfg> configurationClass();



  /**
   * Register to be notified when this Blind Trust Manager Provider is changed.
   *
   * @param listener
   *          The Blind Trust Manager Provider configuration change listener.
   */
  void addBlindChangeListener(ConfigurationChangeListener<BlindTrustManagerProviderCfg> listener);



  /**
   * Deregister an existing Blind Trust Manager Provider configuration change listener.
   *
   * @param listener
   *          The Blind Trust Manager Provider configuration change listener.
   */
  void removeBlindChangeListener(ConfigurationChangeListener<BlindTrustManagerProviderCfg> listener);



  /**
   * Gets the "java-class" property.
   * <p>
   * The fully-qualified name of the Java class that provides the
   * Blind Trust Manager Provider implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();

}
