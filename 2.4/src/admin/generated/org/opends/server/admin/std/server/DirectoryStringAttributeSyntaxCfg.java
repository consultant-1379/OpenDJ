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
 * A server-side interface for querying Directory String Attribute
 * Syntax settings.
 * <p>
 * The Directory String Attribute Syntax defines an attribute syntax
 * for storing arbitrary string (and sometimes binary) data.
 */
public interface DirectoryStringAttributeSyntaxCfg extends AttributeSyntaxCfg {

  /**
   * Gets the configuration class associated with this Directory String Attribute Syntax.
   *
   * @return Returns the configuration class associated with this Directory String Attribute Syntax.
   */
  Class<? extends DirectoryStringAttributeSyntaxCfg> configurationClass();



  /**
   * Register to be notified when this Directory String Attribute Syntax is changed.
   *
   * @param listener
   *          The Directory String Attribute Syntax configuration change listener.
   */
  void addDirectoryStringChangeListener(ConfigurationChangeListener<DirectoryStringAttributeSyntaxCfg> listener);



  /**
   * Deregister an existing Directory String Attribute Syntax configuration change listener.
   *
   * @param listener
   *          The Directory String Attribute Syntax configuration change listener.
   */
  void removeDirectoryStringChangeListener(ConfigurationChangeListener<DirectoryStringAttributeSyntaxCfg> listener);



  /**
   * Gets the "allow-zero-length-values" property.
   * <p>
   * Indicates whether zero-length (that is, an empty string) values
   * are allowed.
   * <p>
   * This is technically not allowed by the revised LDAPv3
   * specification, but some environments may require it for backward
   * compatibility with servers that do allow it.
   *
   * @return Returns the value of the "allow-zero-length-values" property.
   */
  boolean isAllowZeroLengthValues();



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Directory String Attribute Syntax implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();

}
