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
 *      Copyright 2007-2009 Sun Microsystems, Inc.
 */
package org.opends.server.replication.plugin;

import java.util.SortedSet;

import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.std.server.ExternalChangelogDomainCfg;
import org.opends.server.types.AttributeType;
import org.opends.server.types.DN;

/**
 * This class implement a configuration object for the ExternalChangelog domain
 * that can be used in unit tests to instantiate ExternalChangelogDomain.
 */
public class ExternalChangelogDomainFakeCfg 
  implements ExternalChangelogDomainCfg
{

  // The value of the "ecl-include" property.
  private SortedSet<AttributeType> pECLInclude;

  // The value of the "enabled" property.
  private boolean pEnabled;

  private DN pDN;
  
  /**
   * Creates a new Domain with the provided information
   * (assured mode disabled, default group id)
   */
  public ExternalChangelogDomainFakeCfg(boolean isEnabled,
      SortedSet<AttributeType> eCLInclude)
  {
    this.pEnabled = isEnabled;
    this.pECLInclude = eCLInclude;
  }

  /**
   * {@inheritDoc}
   */
  public Class<? extends ExternalChangelogDomainCfg> configurationClass()
  {
    return null;
  }

  /**
   * Register to be notified when this External Changelog Domain is changed.
   *
   * @param listener
   *          The External Changelog Domain configuration change listener.
   */
  public void addChangeListener(
      ConfigurationChangeListener<ExternalChangelogDomainCfg> listener)
  {}



  /**
   * Deregister an existing External Changelog Domain configuration change listener.
   *
   * @param listener
   *          The External Changelog Domain configuration change listener.
   */
  public void removeChangeListener(
      ConfigurationChangeListener<ExternalChangelogDomainCfg> listener)
  {}



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
  public SortedSet<AttributeType> getECLInclude()
  {
    return this.pECLInclude;
  }

  /**
   * Set eclInclude.
   * @param eclInclude the attribute to include.
   */
  public void setECLInclude(SortedSet<AttributeType> eclInclude)
  {
    this.pECLInclude = eclInclude;
  }


  /**
   * Set enabled.
   * @param enabled a.
   */
  public void setEnable(boolean enabled)
  {
    this.pEnabled = enabled;
  }


  /**
   * Gets the "enabled" property.
   * <p>
   * Indicates whether the External Changelog Domain is enabled for
   * use.
   *
   * @return Returns the value of the "enabled" property.
   */
  public boolean isEnabled()
  {
    return this.pEnabled;
  }
  
  public DN dn()
  {
    return pDN;
  }

  public void setDN(DN dn)
  {
    this.pDN = dn;
  }

}