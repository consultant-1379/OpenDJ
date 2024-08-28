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
 * A server-side interface for querying Unique Characters Password
 * Validator settings.
 * <p>
 * The Unique Characters Password Validator is used to determine
 * whether a proposed password is acceptable based on the number of
 * unique characters that it contains.
 */
public interface UniqueCharactersPasswordValidatorCfg extends PasswordValidatorCfg {

  /**
   * Gets the configuration class associated with this Unique Characters Password Validator.
   *
   * @return Returns the configuration class associated with this Unique Characters Password Validator.
   */
  Class<? extends UniqueCharactersPasswordValidatorCfg> configurationClass();



  /**
   * Register to be notified when this Unique Characters Password Validator is changed.
   *
   * @param listener
   *          The Unique Characters Password Validator configuration change listener.
   */
  void addUniqueCharactersChangeListener(ConfigurationChangeListener<UniqueCharactersPasswordValidatorCfg> listener);



  /**
   * Deregister an existing Unique Characters Password Validator configuration change listener.
   *
   * @param listener
   *          The Unique Characters Password Validator configuration change listener.
   */
  void removeUniqueCharactersChangeListener(ConfigurationChangeListener<UniqueCharactersPasswordValidatorCfg> listener);



  /**
   * Gets the "case-sensitive-validation" property.
   * <p>
   * Indicates whether this password validator should treat password
   * characters in a case-sensitive manner.
   * <p>
   * A value of true indicates that the validator does not consider a
   * capital letter to be the same as its lower-case counterpart. A
   * value of false indicates that the validator ignores differences in
   * capitalization when looking at the number of unique characters in
   * the password.
   *
   * @return Returns the value of the "case-sensitive-validation" property.
   */
  boolean isCaseSensitiveValidation();



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
   * Gets the "min-unique-characters" property.
   * <p>
   * Specifies the minimum number of unique characters that a password
   * will be allowed to contain.
   * <p>
   * A value of zero indicates that no minimum value is enforced.
   *
   * @return Returns the value of the "min-unique-characters" property.
   */
  int getMinUniqueCharacters();

}
