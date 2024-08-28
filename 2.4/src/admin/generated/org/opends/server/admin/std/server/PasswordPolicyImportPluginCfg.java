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
import org.opends.server.admin.std.meta.PluginCfgDefn.PluginType;
import org.opends.server.types.DN;



/**
 * A server-side interface for querying Password Policy Import Plugin
 * settings.
 * <p>
 * The Password Policy Import Plugin ensures that clear-text passwords
 * contained in LDIF entries are properly encoded before they are
 * stored in the appropriate Directory Server backend.
 */
public interface PasswordPolicyImportPluginCfg extends PluginCfg {

  /**
   * Gets the configuration class associated with this Password Policy Import Plugin.
   *
   * @return Returns the configuration class associated with this Password Policy Import Plugin.
   */
  Class<? extends PasswordPolicyImportPluginCfg> configurationClass();



  /**
   * Register to be notified when this Password Policy Import Plugin is changed.
   *
   * @param listener
   *          The Password Policy Import Plugin configuration change listener.
   */
  void addPasswordPolicyImportChangeListener(ConfigurationChangeListener<PasswordPolicyImportPluginCfg> listener);



  /**
   * Deregister an existing Password Policy Import Plugin configuration change listener.
   *
   * @param listener
   *          The Password Policy Import Plugin configuration change listener.
   */
  void removePasswordPolicyImportChangeListener(ConfigurationChangeListener<PasswordPolicyImportPluginCfg> listener);



  /**
   * Gets the "default-auth-password-storage-scheme" property.
   * <p>
   * Specifies the names of password storage schemes that to be used
   * for encoding passwords contained in attributes with the auth
   * password syntax for entries that do not include the
   * ds-pwp-password-policy-dn attribute specifying which password
   * policy should be used to govern them.
   *
   * @return Returns an unmodifiable set containing the values of the "default-auth-password-storage-scheme" property.
   */
  SortedSet<String> getDefaultAuthPasswordStorageScheme();



  /**
   * Gets the "default-auth-password-storage-scheme" property as a set
   * of DNs.
   * <p>
   * Specifies the names of password storage schemes that to be used
   * for encoding passwords contained in attributes with the auth
   * password syntax for entries that do not include the
   * ds-pwp-password-policy-dn attribute specifying which password
   * policy should be used to govern them.
   *
   * @return Returns the DN values of the
   *         "default-auth-password-storage-scheme" property.
   */
  SortedSet<DN> getDefaultAuthPasswordStorageSchemeDNs();



  /**
   * Gets the "default-user-password-storage-scheme" property.
   * <p>
   * Specifies the names of the password storage schemes to be used
   * for encoding passwords contained in attributes with the user
   * password syntax for entries that do not include the
   * ds-pwp-password-policy-dn attribute specifying which password
   * policy is to be used to govern them.
   *
   * @return Returns an unmodifiable set containing the values of the "default-user-password-storage-scheme" property.
   */
  SortedSet<String> getDefaultUserPasswordStorageScheme();



  /**
   * Gets the "default-user-password-storage-scheme" property as a set
   * of DNs.
   * <p>
   * Specifies the names of the password storage schemes to be used
   * for encoding passwords contained in attributes with the user
   * password syntax for entries that do not include the
   * ds-pwp-password-policy-dn attribute specifying which password
   * policy is to be used to govern them.
   *
   * @return Returns the DN values of the
   *         "default-user-password-storage-scheme" property.
   */
  SortedSet<DN> getDefaultUserPasswordStorageSchemeDNs();



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
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the plug-in implementation.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();



  /**
   * Gets the "plugin-type" property.
   * <p>
   * Specifies the set of plug-in types for the plug-in, which
   * specifies the times at which the plug-in is invoked.
   *
   * @return Returns an unmodifiable set containing the values of the "plugin-type" property.
   */
  SortedSet<PluginType> getPluginType();

}
