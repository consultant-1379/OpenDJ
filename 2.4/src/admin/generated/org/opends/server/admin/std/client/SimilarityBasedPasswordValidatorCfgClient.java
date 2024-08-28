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
import org.opends.server.admin.std.server.SimilarityBasedPasswordValidatorCfg;



/**
 * A client-side interface for reading and modifying Similarity Based
 * Password Validator settings.
 * <p>
 * The Similarity Based Password Validator determines whether a
 * proposed password is acceptable by measuring how similar it is to
 * the user's current password.
 */
public interface SimilarityBasedPasswordValidatorCfgClient extends PasswordValidatorCfgClient {

  /**
   * Get the configuration definition associated with this Similarity Based Password Validator.
   *
   * @return Returns the configuration definition associated with this Similarity Based Password Validator.
   */
  ManagedObjectDefinition<? extends SimilarityBasedPasswordValidatorCfgClient, ? extends SimilarityBasedPasswordValidatorCfg> definition();



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
   * Gets the "min-password-difference" property.
   * <p>
   * Specifies the minimum difference of new and old password.
   * <p>
   * A value of zero indicates that no difference between passwords is
   * acceptable.
   *
   * @return Returns the value of the "min-password-difference" property.
   */
  Integer getMinPasswordDifference();



  /**
   * Sets the "min-password-difference" property.
   * <p>
   * Specifies the minimum difference of new and old password.
   * <p>
   * A value of zero indicates that no difference between passwords is
   * acceptable.
   *
   * @param value The value of the "min-password-difference" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setMinPasswordDifference(int value) throws IllegalPropertyValueException;

}
