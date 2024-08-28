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
import org.opends.server.types.AttributeType;



/**
 * A server-side interface for querying Attribute Value Password
 * Validator settings.
 * <p>
 * The Attribute Value Password Validator attempts to determine
 * whether a proposed password is acceptable for use by determining
 * whether that password is contained in any attribute within the
 * user's entry.
 */
public interface AttributeValuePasswordValidatorCfg extends PasswordValidatorCfg {

  /**
   * Gets the configuration class associated with this Attribute Value Password Validator.
   *
   * @return Returns the configuration class associated with this Attribute Value Password Validator.
   */
  Class<? extends AttributeValuePasswordValidatorCfg> configurationClass();



  /**
   * Register to be notified when this Attribute Value Password Validator is changed.
   *
   * @param listener
   *          The Attribute Value Password Validator configuration change listener.
   */
  void addAttributeValueChangeListener(ConfigurationChangeListener<AttributeValuePasswordValidatorCfg> listener);



  /**
   * Deregister an existing Attribute Value Password Validator configuration change listener.
   *
   * @param listener
   *          The Attribute Value Password Validator configuration change listener.
   */
  void removeAttributeValueChangeListener(ConfigurationChangeListener<AttributeValuePasswordValidatorCfg> listener);



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the password validator implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();



  /**
   * Gets the "match-attribute" property.
   * <p>
   * Specifies the name(s) of the attribute(s) whose values should be
   * checked to determine whether they match the provided password. If
   * no values are provided, then the server checks if the proposed
   * password matches the value of any attribute in the user's entry.
   *
   * @return Returns an unmodifiable set containing the values of the "match-attribute" property.
   */
  SortedSet<AttributeType> getMatchAttribute();



  /**
   * Gets the "test-reversed-password" property.
   * <p>
   * Indicates whether this password validator should test the
   * reversed value of the provided password as well as the order in
   * which it was given.
   *
   * @return Returns the value of the "test-reversed-password" property.
   */
  boolean isTestReversedPassword();

}
