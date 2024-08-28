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
 * A server-side interface for querying User Defined Virtual Attribute
 * settings.
 * <p>
 * The User Defined Virtual Attribute creates virtual attributes with
 * user-defined values in entries that match the criteria defined in
 * the plug-in's configuration.
 */
public interface UserDefinedVirtualAttributeCfg extends VirtualAttributeCfg {

  /**
   * Gets the configuration class associated with this User Defined Virtual Attribute.
   *
   * @return Returns the configuration class associated with this User Defined Virtual Attribute.
   */
  Class<? extends UserDefinedVirtualAttributeCfg> configurationClass();



  /**
   * Register to be notified when this User Defined Virtual Attribute is changed.
   *
   * @param listener
   *          The User Defined Virtual Attribute configuration change listener.
   */
  void addUserDefinedChangeListener(ConfigurationChangeListener<UserDefinedVirtualAttributeCfg> listener);



  /**
   * Deregister an existing User Defined Virtual Attribute configuration change listener.
   *
   * @param listener
   *          The User Defined Virtual Attribute configuration change listener.
   */
  void removeUserDefinedChangeListener(ConfigurationChangeListener<UserDefinedVirtualAttributeCfg> listener);



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the virtual attribute
   * provider class that generates the attribute values.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();



  /**
   * Gets the "value" property.
   * <p>
   * Specifies the values to be included in the virtual attribute.
   *
   * @return Returns an unmodifiable set containing the values of the "value" property.
   */
  SortedSet<String> getValue();

}
