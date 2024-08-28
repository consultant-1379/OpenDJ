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



import java.util.Collection;
import java.util.SortedSet;
import org.opends.server.admin.IllegalPropertyValueException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.std.meta.PluginCfgDefn.PluginType;
import org.opends.server.admin.std.server.PasswordPolicyImportPluginCfg;



/**
 * A client-side interface for reading and modifying Password Policy
 * Import Plugin settings.
 * <p>
 * The Password Policy Import Plugin ensures that clear-text passwords
 * contained in LDIF entries are properly encoded before they are
 * stored in the appropriate Directory Server backend.
 */
public interface PasswordPolicyImportPluginCfgClient extends PluginCfgClient {

  /**
   * Get the configuration definition associated with this Password Policy Import Plugin.
   *
   * @return Returns the configuration definition associated with this Password Policy Import Plugin.
   */
  ManagedObjectDefinition<? extends PasswordPolicyImportPluginCfgClient, ? extends PasswordPolicyImportPluginCfg> definition();



  /**
   * Gets the "default-auth-password-storage-scheme" property.
   * <p>
   * Specifies the names of password storage schemes that to be used
   * for encoding passwords contained in attributes with the auth
   * password syntax for entries that do not include the
   * ds-pwp-password-policy-dn attribute specifying which password
   * policy should be used to govern them.
   *
   * @return Returns the values of the "default-auth-password-storage-scheme" property.
   */
  SortedSet<String> getDefaultAuthPasswordStorageScheme();



  /**
   * Sets the "default-auth-password-storage-scheme" property.
   * <p>
   * Specifies the names of password storage schemes that to be used
   * for encoding passwords contained in attributes with the auth
   * password syntax for entries that do not include the
   * ds-pwp-password-policy-dn attribute specifying which password
   * policy should be used to govern them.
   *
   * @param values The values of the "default-auth-password-storage-scheme" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setDefaultAuthPasswordStorageScheme(Collection<String> values) throws IllegalPropertyValueException;



  /**
   * Gets the "default-user-password-storage-scheme" property.
   * <p>
   * Specifies the names of the password storage schemes to be used
   * for encoding passwords contained in attributes with the user
   * password syntax for entries that do not include the
   * ds-pwp-password-policy-dn attribute specifying which password
   * policy is to be used to govern them.
   *
   * @return Returns the values of the "default-user-password-storage-scheme" property.
   */
  SortedSet<String> getDefaultUserPasswordStorageScheme();



  /**
   * Sets the "default-user-password-storage-scheme" property.
   * <p>
   * Specifies the names of the password storage schemes to be used
   * for encoding passwords contained in attributes with the user
   * password syntax for entries that do not include the
   * ds-pwp-password-policy-dn attribute specifying which password
   * policy is to be used to govern them.
   *
   * @param values The values of the "default-user-password-storage-scheme" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setDefaultUserPasswordStorageScheme(Collection<String> values) throws IllegalPropertyValueException;



  /**
   * Gets the "invoke-for-internal-operations" property.
   * <p>
   * Indicates whether the plug-in should be invoked for internal
   * operations.
   * <p>
   * Any plug-in that can be invoked for internal operations must
   * ensure that it does not create any new internal operatons that can
   * cause the same plug-in to be re-invoked.
   *
   * @return Returns the value of the "invoke-for-internal-operations" property.
   */
  boolean isInvokeForInternalOperations();



  /**
   * Sets the "invoke-for-internal-operations" property.
   * <p>
   * Indicates whether the plug-in should be invoked for internal
   * operations.
   * <p>
   * Any plug-in that can be invoked for internal operations must
   * ensure that it does not create any new internal operatons that can
   * cause the same plug-in to be re-invoked.
   *
   * @param value The value of the "invoke-for-internal-operations" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setInvokeForInternalOperations(Boolean value) throws IllegalPropertyValueException;



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the plug-in implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();



  /**
   * Sets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the plug-in implementation.
   *
   * @param value The value of the "java-class" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setJavaClass(String value) throws IllegalPropertyValueException;



  /**
   * Gets the "plugin-type" property.
   * <p>
   * Specifies the set of plug-in types for the plug-in, which
   * specifies the times at which the plug-in is invoked.
   *
   * @return Returns the values of the "plugin-type" property.
   */
  SortedSet<PluginType> getPluginType();



  /**
   * Sets the "plugin-type" property.
   * <p>
   * Specifies the set of plug-in types for the plug-in, which
   * specifies the times at which the plug-in is invoked.
   *
   * @param values The values of the "plugin-type" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setPluginType(Collection<PluginType> values) throws IllegalPropertyValueException;

}
