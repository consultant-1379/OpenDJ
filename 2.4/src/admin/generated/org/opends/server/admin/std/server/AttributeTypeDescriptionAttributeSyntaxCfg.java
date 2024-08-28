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
 * A server-side interface for querying Attribute Type Description
 * Attribute Syntax settings.
 * <p>
 * Attribute Type Description Attribute Syntaxes describe the format
 * of the directory schema attribute type definitions.
 */
public interface AttributeTypeDescriptionAttributeSyntaxCfg extends AttributeSyntaxCfg {

  /**
   * Gets the configuration class associated with this Attribute Type Description Attribute Syntax.
   *
   * @return Returns the configuration class associated with this Attribute Type Description Attribute Syntax.
   */
  Class<? extends AttributeTypeDescriptionAttributeSyntaxCfg> configurationClass();



  /**
   * Register to be notified when this Attribute Type Description Attribute Syntax is changed.
   *
   * @param listener
   *          The Attribute Type Description Attribute Syntax configuration change listener.
   */
  void addAttributeTypeDescriptionChangeListener(ConfigurationChangeListener<AttributeTypeDescriptionAttributeSyntaxCfg> listener);



  /**
   * Deregister an existing Attribute Type Description Attribute Syntax configuration change listener.
   *
   * @param listener
   *          The Attribute Type Description Attribute Syntax configuration change listener.
   */
  void removeAttributeTypeDescriptionChangeListener(ConfigurationChangeListener<AttributeTypeDescriptionAttributeSyntaxCfg> listener);



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Attribute Type Description Attribute Syntax
   * implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();



  /**
   * Gets the "strip-syntax-min-upper-bound" property.
   * <p>
   * Indicates whether the suggested minimum upper bound appended to
   * an attribute's syntax OID in it's schema definition Attribute Type
   * Description is stripped off.
   * <p>
   * When retrieving the server's schema, some APIs (JNDI) fail in
   * their syntax lookup methods, because they do not parse this value
   * correctly. This configuration option allows the server to be
   * configured to provide schema definitions these APIs can parse
   * correctly.
   *
   * @return Returns the value of the "strip-syntax-min-upper-bound" property.
   */
  boolean isStripSyntaxMinUpperBound();

}
