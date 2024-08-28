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
 * A server-side interface for querying Telephone Number Attribute
 * Syntax settings.
 * <p>
 * Telephone Number Attribute Syntaxes define an attribute syntax for
 * storing telephone number information.
 */
public interface TelephoneNumberAttributeSyntaxCfg extends AttributeSyntaxCfg {

  /**
   * Gets the configuration class associated with this Telephone Number Attribute Syntax.
   *
   * @return Returns the configuration class associated with this Telephone Number Attribute Syntax.
   */
  Class<? extends TelephoneNumberAttributeSyntaxCfg> configurationClass();



  /**
   * Register to be notified when this Telephone Number Attribute Syntax is changed.
   *
   * @param listener
   *          The Telephone Number Attribute Syntax configuration change listener.
   */
  void addTelephoneNumberChangeListener(ConfigurationChangeListener<TelephoneNumberAttributeSyntaxCfg> listener);



  /**
   * Deregister an existing Telephone Number Attribute Syntax configuration change listener.
   *
   * @param listener
   *          The Telephone Number Attribute Syntax configuration change listener.
   */
  void removeTelephoneNumberChangeListener(ConfigurationChangeListener<TelephoneNumberAttributeSyntaxCfg> listener);



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Telephone Number Attribute Syntax implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();



  /**
   * Gets the "strict-format" property.
   * <p>
   * Indicates whether to require telephone number values to strictly
   * comply with the standard definition for this syntax.
   *
   * @return Returns the value of the "strict-format" property.
   */
  boolean isStrictFormat();

}
