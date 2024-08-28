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
import org.opends.server.types.DN;



/**
 * A server-side interface for querying Password Modify Extended
 * Operation Handler settings.
 * <p>
 * The Password Modify Extended Operation Handler allows end users to
 * change their own passwords, or administrators to reset user
 * passwords.
 */
public interface PasswordModifyExtendedOperationHandlerCfg extends ExtendedOperationHandlerCfg {

  /**
   * Gets the configuration class associated with this Password Modify Extended Operation Handler.
   *
   * @return Returns the configuration class associated with this Password Modify Extended Operation Handler.
   */
  Class<? extends PasswordModifyExtendedOperationHandlerCfg> configurationClass();



  /**
   * Register to be notified when this Password Modify Extended Operation Handler is changed.
   *
   * @param listener
   *          The Password Modify Extended Operation Handler configuration change listener.
   */
  void addPasswordModifyChangeListener(ConfigurationChangeListener<PasswordModifyExtendedOperationHandlerCfg> listener);



  /**
   * Deregister an existing Password Modify Extended Operation Handler configuration change listener.
   *
   * @param listener
   *          The Password Modify Extended Operation Handler configuration change listener.
   */
  void removePasswordModifyChangeListener(ConfigurationChangeListener<PasswordModifyExtendedOperationHandlerCfg> listener);



  /**
   * Gets the "identity-mapper" property.
   * <p>
   * Specifies the name of the identity mapper that should be used in
   * conjunction with the password modify extended operation.
   * <p>
   * This property is used to identify a user based on an
   * authorization ID in the 'u:' form. Changes to this property take
   * effect immediately.
   *
   * @return Returns the value of the "identity-mapper" property.
   */
  String getIdentityMapper();



  /**
   * Gets the "identity-mapper" property as a DN.
   * <p>
   * Specifies the name of the identity mapper that should be used in
   * conjunction with the password modify extended operation.
   * <p>
   * This property is used to identify a user based on an
   * authorization ID in the 'u:' form. Changes to this property take
   * effect immediately.
   *
   * @return Returns the DN value of the "identity-mapper" property.
   */
  DN getIdentityMapperDN();



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Password Modify Extended Operation Handler
   * implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();

}
