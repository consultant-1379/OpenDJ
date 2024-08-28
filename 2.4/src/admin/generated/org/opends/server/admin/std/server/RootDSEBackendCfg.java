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
import org.opends.server.admin.Configuration;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.types.DN;



/**
 * A server-side interface for querying Root DSE Backend settings.
 * <p>
 * The Root DSE Backend contains the Directory Server root DSE.
 */
public interface RootDSEBackendCfg extends Configuration {

  /**
   * Gets the configuration class associated with this Root DSE Backend.
   *
   * @return Returns the configuration class associated with this Root DSE Backend.
   */
  Class<? extends RootDSEBackendCfg> configurationClass();



  /**
   * Register to be notified when this Root DSE Backend is changed.
   *
   * @param listener
   *          The Root DSE Backend configuration change listener.
   */
  void addChangeListener(ConfigurationChangeListener<RootDSEBackendCfg> listener);



  /**
   * Deregister an existing Root DSE Backend configuration change listener.
   *
   * @param listener
   *          The Root DSE Backend configuration change listener.
   */
  void removeChangeListener(ConfigurationChangeListener<RootDSEBackendCfg> listener);



  /**
   * Gets the "show-all-attributes" property.
   * <p>
   * Indicates whether all attributes in the root DSE are to be
   * treated like user attributes (and therefore returned to clients by
   * default) regardless of the Directory Server schema configuration.
   *
   * @return Returns the value of the "show-all-attributes" property.
   */
  boolean isShowAllAttributes();



  /**
   * Gets the "subordinate-base-dn" property.
   * <p>
   * Specifies the set of base DNs used for singleLevel, wholeSubtree,
   * and subordinateSubtree searches based at the root DSE.
   *
   * @return Returns an unmodifiable set containing the values of the "subordinate-base-dn" property.
   */
  SortedSet<DN> getSubordinateBaseDN();

}
