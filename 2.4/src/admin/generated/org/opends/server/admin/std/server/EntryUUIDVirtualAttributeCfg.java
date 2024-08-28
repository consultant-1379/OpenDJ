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
import org.opends.server.admin.std.meta.VirtualAttributeCfgDefn.ConflictBehavior;
import org.opends.server.types.AttributeType;



/**
 * A server-side interface for querying Entry UUID Virtual Attribute
 * settings.
 * <p>
 * The Entry UUID Virtual Attribute ensures that all entries contained
 * in private backends have values for the entryUUID operational
 * attribute.
 */
public interface EntryUUIDVirtualAttributeCfg extends VirtualAttributeCfg {

  /**
   * Gets the configuration class associated with this Entry UUID Virtual Attribute.
   *
   * @return Returns the configuration class associated with this Entry UUID Virtual Attribute.
   */
  Class<? extends EntryUUIDVirtualAttributeCfg> configurationClass();



  /**
   * Register to be notified when this Entry UUID Virtual Attribute is changed.
   *
   * @param listener
   *          The Entry UUID Virtual Attribute configuration change listener.
   */
  void addEntryUUIDChangeListener(ConfigurationChangeListener<EntryUUIDVirtualAttributeCfg> listener);



  /**
   * Deregister an existing Entry UUID Virtual Attribute configuration change listener.
   *
   * @param listener
   *          The Entry UUID Virtual Attribute configuration change listener.
   */
  void removeEntryUUIDChangeListener(ConfigurationChangeListener<EntryUUIDVirtualAttributeCfg> listener);



  /**
   * Gets the "attribute-type" property.
   * <p>
   * Specifies the attribute type for the attribute whose values are
   * to be dynamically assigned by the virtual attribute.
   *
   * @return Returns the value of the "attribute-type" property.
   */
  AttributeType getAttributeType();



  /**
   * Gets the "conflict-behavior" property.
   * <p>
   * Specifies the behavior that the server is to exhibit for entries
   * that already contain one or more real values for the associated
   * attribute.
   *
   * @return Returns the value of the "conflict-behavior" property.
   */
  ConflictBehavior getConflictBehavior();



  /**
   * Gets the "java-class" property.
   * <p>
   * Specifies the fully-qualified name of the virtual attribute
   * provider class that generates the attribute values.
   *
   * @return Returns the value of the "java-class" property.
   */
  String getJavaClass();

}
