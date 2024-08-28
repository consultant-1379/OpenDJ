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
import org.opends.server.types.AttributeType;



/**
 * A server-side interface for querying External Changelog Domain
 * settings.
 * <p>
 * The External Changelog Domain provides configuration of the
 * external changelog for the replication domain.
 */
public interface ExternalChangelogDomainCfg extends Configuration {

  /**
   * Gets the configuration class associated with this External Changelog Domain.
   *
   * @return Returns the configuration class associated with this External Changelog Domain.
   */
  Class<? extends ExternalChangelogDomainCfg> configurationClass();



  /**
   * Register to be notified when this External Changelog Domain is changed.
   *
   * @param listener
   *          The External Changelog Domain configuration change listener.
   */
  void addChangeListener(ConfigurationChangeListener<ExternalChangelogDomainCfg> listener);



  /**
   * Deregister an existing External Changelog Domain configuration change listener.
   *
   * @param listener
   *          The External Changelog Domain configuration change listener.
   */
  void removeChangeListener(ConfigurationChangeListener<ExternalChangelogDomainCfg> listener);



  /**
   * Gets the "ecl-include" property.
   * <p>
   * Allows to include some target entry attributes in the external
   * changelog.
   * <p>
   * Specifies an attribute that will be included in every External
   * Change Log entry related to this replication domain.
   *
   * @return Returns an unmodifiable set containing the values of the "ecl-include" property.
   */
  SortedSet<AttributeType> getECLInclude();



  /**
   * Gets the "enabled" property.
   * <p>
   * Indicates whether the External Changelog Domain is enabled.
   *
   * @return Returns the value of the "enabled" property.
   */
  boolean isEnabled();

}
