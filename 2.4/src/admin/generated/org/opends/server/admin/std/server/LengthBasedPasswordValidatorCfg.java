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
 * A server-side interface for querying Length Based Password
 * Validator settings.
 * <p>
 * The Length Based Password Validator is used to determine whether a
 * proposed password is acceptable based on whether the number of
 * characters it contains falls within an acceptable range of values.
 */
public interface LengthBasedPasswordValidatorCfg extends PasswordValidatorCfg {

  /**
   * Gets the configuration class associated with this Length Based Password Validator.
   *
   * @return Returns the configuration class associated with this Length Based Password Validator.
   */
  Class<? extends LengthBasedPasswordValidatorCfg> configurationClass();



  /**
   * Register to be notified when this Length Based Password Validator is changed.
   *
   * @param listener
   *          The Length Based Password Validator configuration change listener.
   */
  void addLengthBasedChangeListener(ConfigurationChangeListener<LengthBasedPasswordValidatorCfg> listener);



  /**
   * Deregister an existing Length Based Password Validator configuration change listener.
   *
   * @param listener
   *          The Length Based Password Validator configuration change listener.
   */
  void removeLengthBasedChangeListener(ConfigurationChangeListener<LengthBasedPasswordValidatorCfg> listener);



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
   * Gets the "max-password-length" property.
   * <p>
   * Specifies the maximum number of characters that can be included
   * in a proposed password.
   * <p>
   * A value of zero indicates that there will be no upper bound
   * enforced. If both minimum and maximum lengths are defined, then
   * the minimum length must be less than or equal to the maximum
   * length.
   *
   * @return Returns the value of the "max-password-length" property.
   */
  int getMaxPasswordLength();



  /**
   * Gets the "min-password-length" property.
   * <p>
   * Specifies the minimum number of characters that must be included
   * in a proposed password.
   * <p>
   * A value of zero indicates that there will be no lower bound
   * enforced. If both minimum and maximum lengths are defined, then
   * the minimum length must be less than or equal to the maximum
   * length.
   *
   * @return Returns the value of the "min-password-length" property.
   */
  int getMinPasswordLength();

}
