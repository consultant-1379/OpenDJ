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
package org.opends.server.admin.std.client;



import org.opends.server.admin.IllegalPropertyValueException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.std.server.DictionaryPasswordValidatorCfg;



/**
 * A client-side interface for reading and modifying Dictionary
 * Password Validator settings.
 * <p>
 * The Dictionary Password Validator determines whether a proposed
 * password is acceptable based on whether the given password value
 * appears in a provided dictionary file.
 */
public interface DictionaryPasswordValidatorCfgClient extends PasswordValidatorCfgClient {

  /**
   * Get the configuration definition associated with this Dictionary Password Validator.
   *
   * @return Returns the configuration definition associated with this Dictionary Password Validator.
   */
  ManagedObjectDefinition<? extends DictionaryPasswordValidatorCfgClient, ? extends DictionaryPasswordValidatorCfg> definition();



  /**
   * Gets the "case-sensitive-validation" property.
   * <p>
   * Indicates whether this password validator is to treat password
   * characters in a case-sensitive manner.
   * <p>
   * If it is set to true, then the validator rejects a password only
   * if it appears in the dictionary with exactly the same
   * capitalization as provided by the user.
   *
   * @return Returns the value of the "case-sensitive-validation" property.
   */
  boolean isCaseSensitiveValidation();



  /**
   * Sets the "case-sensitive-validation" property.
   * <p>
   * Indicates whether this password validator is to treat password
   * characters in a case-sensitive manner.
   * <p>
   * If it is set to true, then the validator rejects a password only
   * if it appears in the dictionary with exactly the same
   * capitalization as provided by the user.
   *
   * @param value The value of the "case-sensitive-validation" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setCaseSensitiveValidation(boolean value) throws IllegalPropertyValueException;



  /**
   * Gets the "dictionary-file" property.
   * <p>
   * Specifies the path to the file containing a list of words that
   * cannot be used as passwords.
   * <p>
   * It should be formatted with one word per line. The value can be
   * an absolute path or a path that is relative to the OpenDS
   * Directory Server instance root.
   *
   * @return Returns the value of the "dictionary-file" property.
   */
  String getDictionaryFile();



  /**
   * Sets the "dictionary-file" property.
   * <p>
   * Specifies the path to the file containing a list of words that
   * cannot be used as passwords.
   * <p>
   * It should be formatted with one word per line. The value can be
   * an absolute path or a path that is relative to the OpenDS
   * Directory Server instance root.
   *
   * @param value The value of the "dictionary-file" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setDictionaryFile(String value) throws IllegalPropertyValueException;



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
   * Sets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the password validator implementation.
   *
   * @param value The value of the "java-class" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setJavaClass(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "test-reversed-password" property.
   * <p>
   * Indicates whether this password validator is to test the reversed
   * value of the provided password as well as the order in which it
   * was given.
   * <p>
   * For example, if the user provides a new password of "password"
   * and this configuration attribute is set to true, then the value
   * "drowssap" is also tested against attribute values in the user's
   * entry.
   *
   * @return Returns the value of the "test-reversed-password" property.
   */
  boolean isTestReversedPassword();



  /**
   * Sets the "test-reversed-password" property.
   * <p>
   * Indicates whether this password validator is to test the reversed
   * value of the provided password as well as the order in which it
   * was given.
   * <p>
   * For example, if the user provides a new password of "password"
   * and this configuration attribute is set to true, then the value
   * "drowssap" is also tested against attribute values in the user's
   * entry.
   *
   * @param value The value of the "test-reversed-password" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setTestReversedPassword(boolean value) throws IllegalPropertyValueException;

}
