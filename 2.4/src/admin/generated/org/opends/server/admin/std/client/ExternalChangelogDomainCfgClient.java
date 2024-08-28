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
import org.opends.server.admin.ConfigurationClient;
import org.opends.server.admin.IllegalPropertyValueException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.std.server.ExternalChangelogDomainCfg;
import org.opends.server.types.AttributeType;



/**
 * A client-side interface for reading and modifying External
 * Changelog Domain settings.
 * <p>
 * The External Changelog Domain provides configuration of the
 * external changelog for the replication domain.
 */
public interface ExternalChangelogDomainCfgClient extends ConfigurationClient {

  /**
   * Get the configuration definition associated with this External Changelog Domain.
   *
   * @return Returns the configuration definition associated with this External Changelog Domain.
   */
  ManagedObjectDefinition<? extends ExternalChangelogDomainCfgClient, ? extends ExternalChangelogDomainCfg> definition();



  /**
   * Gets the "ecl-include" property.
   * <p>
   * Allows to include some target entry attributes in the external
   * changelog.
   * <p>
   * Specifies an attribute that will be included in every External
   * Change Log entry related to this replication domain.
   *
   * @return Returns the values of the "ecl-include" property.
   */
  SortedSet<AttributeType> getECLInclude();



  /**
   * Sets the "ecl-include" property.
   * <p>
   * Allows to include some target entry attributes in the external
   * changelog.
   * <p>
   * Specifies an attribute that will be included in every External
   * Change Log entry related to this replication domain.
   *
   * @param values The values of the "ecl-include" property.
   * @throws IllegalPropertyValueException
   *           If one or more of the new values are invalid.
   */
  void setECLInclude(Collection<AttributeType> values) throws IllegalPropertyValueException;



  /**
   * Gets the "enabled" property.
   * <p>
   * Indicates whether the External Changelog Domain is enabled.
   *
   * @return Returns the value of the "enabled" property.
   */
  Boolean isEnabled();



  /**
   * Sets the "enabled" property.
   * <p>
   * Indicates whether the External Changelog Domain is enabled.
   *
   * @param value The value of the "enabled" property.
   * @throws IllegalPropertyValueException
   *           If the new value is invalid.
   */
  void setEnabled(boolean value) throws IllegalPropertyValueException;

}
