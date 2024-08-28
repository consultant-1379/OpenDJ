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



/**
 * A server-side interface for querying Character Set Password
 * Validator settings.
 * <p>
 * The Character Set Password Validator determines whether a proposed
 * password is acceptable by checking whether it contains a sufficient
 * number of characters from one or more user-defined character sets.
 */
public interface CharacterSetPasswordValidatorCfg extends PasswordValidatorCfg {

  /**
   * Gets the configuration class associated with this Character Set Password Validator.
   *
   * @return Returns the configuration class associated with this Character Set Password Validator.
   */
  Class<? extends CharacterSetPasswordValidatorCfg> configurationClass();



  /**
   * Register to be notified when this Character Set Password Validator is changed.
   *
   * @param listener
   *          The Character Set Password Validator configuration change listener.
   */
  void addCharacterSetChangeListener(ConfigurationChangeListener<CharacterSetPasswordValidatorCfg> listener);



  /**
   * Deregister an existing Character Set Password Validator configuration change listener.
   *
   * @param listener
   *          The Character Set Password Validator configuration change listener.
   */
  void removeCharacterSetChangeListener(ConfigurationChangeListener<CharacterSetPasswordValidatorCfg> listener);



  /**
   * Gets the "allow-unclassified-characters" property.
   * <p>
   * Indicates whether this password validator allows passwords to
   * contain characters outside of any of the user-defined character
   * sets.
   * <p>
   * If this is "false", then only those characters in the
   * user-defined character sets may be used in passwords. Any password
   * containing a character not included in any character set will be
   * rejected.
   *
   * @return Returns the value of the "allow-unclassified-characters" property.
   */
  boolean isAllowUnclassifiedCharacters();



  /**
   * Gets the "character-set" property.
   * <p>
   * Specifies a character set containing characters that a password
   * may contain and a value indicating the minimum number of
   * characters required from that set.
   * <p>
   * Each value must be an integer (indicating the minimum required
   * characters from the set) followed by a colon and the characters to
   * include in that set (for example, "3:abcdefghijklmnopqrstuvwxyz"
   * indicates that a user password must contain at least three
   * characters from the set of lowercase ASCII letters). Multiple
   * character sets can be defined in separate values, although no
   * character can appear in more than one character set.
   *
   * @return Returns an unmodifiable set containing the values of the "character-set" property.
   */
  SortedSet<String> getCharacterSet();



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the password validator implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();

}
