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
package org.opends.server.admin.std.meta;



import java.util.Collection;
import java.util.SortedSet;
import org.opends.server.admin.AdministratorAction;
import org.opends.server.admin.AttributeTypePropertyDefinition;
import org.opends.server.admin.BooleanPropertyDefinition;
import org.opends.server.admin.client.AuthorizationException;
import org.opends.server.admin.client.CommunicationException;
import org.opends.server.admin.client.ConcurrentModificationException;
import org.opends.server.admin.client.ManagedObject;
import org.opends.server.admin.client.MissingMandatoryPropertiesException;
import org.opends.server.admin.client.OperationRejectedException;
import org.opends.server.admin.ManagedObjectAlreadyExistsException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.PropertyOption;
import org.opends.server.admin.PropertyProvider;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.server.ServerManagedObject;
import org.opends.server.admin.std.client.ExternalChangelogDomainCfgClient;
import org.opends.server.admin.std.server.ExternalChangelogDomainCfg;
import org.opends.server.admin.TopCfgDefn;
import org.opends.server.admin.UndefinedDefaultBehaviorProvider;
import org.opends.server.types.AttributeType;
import org.opends.server.types.DN;



/**
 * An interface for querying the External Changelog Domain managed
 * object definition meta information.
 * <p>
 * The External Changelog Domain provides configuration of the
 * external changelog for the replication domain.
 */
public final class ExternalChangelogDomainCfgDefn extends ManagedObjectDefinition<ExternalChangelogDomainCfgClient, ExternalChangelogDomainCfg> {

  // The singleton configuration definition instance.
  private static final ExternalChangelogDomainCfgDefn INSTANCE = new ExternalChangelogDomainCfgDefn();



  // The "ecl-include" property definition.
  private static final AttributeTypePropertyDefinition PD_ECL_INCLUDE;



  // The "enabled" property definition.
  private static final BooleanPropertyDefinition PD_ENABLED;



  // Build the "ecl-include" property definition.
  static {
      AttributeTypePropertyDefinition.Builder builder = AttributeTypePropertyDefinition.createBuilder(INSTANCE, "ecl-include");
      builder.setOption(PropertyOption.MULTI_VALUED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "ecl-include"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<AttributeType>());
      PD_ECL_INCLUDE = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_ECL_INCLUDE);
  }



  // Build the "enabled" property definition.
  static {
      BooleanPropertyDefinition.Builder builder = BooleanPropertyDefinition.createBuilder(INSTANCE, "enabled");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "enabled"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<Boolean>());
      PD_ENABLED = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_ENABLED);
  }



  /**
   * Get the External Changelog Domain configuration definition
   * singleton.
   *
   * @return Returns the External Changelog Domain configuration
   *         definition singleton.
   */
  public static ExternalChangelogDomainCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private ExternalChangelogDomainCfgDefn() {
    super("external-changelog-domain", TopCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public ExternalChangelogDomainCfgClient createClientConfiguration(
      ManagedObject<? extends ExternalChangelogDomainCfgClient> impl) {
    return new ExternalChangelogDomainCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public ExternalChangelogDomainCfg createServerConfiguration(
      ServerManagedObject<? extends ExternalChangelogDomainCfg> impl) {
    return new ExternalChangelogDomainCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<ExternalChangelogDomainCfg> getServerConfigurationClass() {
    return ExternalChangelogDomainCfg.class;
  }



  /**
   * Get the "ecl-include" property definition.
   * <p>
   * Allows to include some target entry attributes in the external
   * changelog.
   * <p>
   * Specifies an attribute that will be included in every External
   * Change Log entry related to this replication domain.
   *
   * @return Returns the "ecl-include" property definition.
   */
  public AttributeTypePropertyDefinition getECLIncludePropertyDefinition() {
    return PD_ECL_INCLUDE;
  }



  /**
   * Get the "enabled" property definition.
   * <p>
   * Indicates whether the External Changelog Domain is enabled.
   *
   * @return Returns the "enabled" property definition.
   */
  public BooleanPropertyDefinition getEnabledPropertyDefinition() {
    return PD_ENABLED;
  }



  /**
   * Managed object client implementation.
   */
  private static class ExternalChangelogDomainCfgClientImpl implements
    ExternalChangelogDomainCfgClient {

    // Private implementation.
    private ManagedObject<? extends ExternalChangelogDomainCfgClient> impl;



    // Private constructor.
    private ExternalChangelogDomainCfgClientImpl(
        ManagedObject<? extends ExternalChangelogDomainCfgClient> impl) {
      this.impl = impl;
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<AttributeType> getECLInclude() {
      return impl.getPropertyValues(INSTANCE.getECLIncludePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setECLInclude(Collection<AttributeType> values) {
      impl.setPropertyValues(INSTANCE.getECLIncludePropertyDefinition(), values);
    }



    /**
     * {@inheritDoc}
     */
    public Boolean isEnabled() {
      return impl.getPropertyValue(INSTANCE.getEnabledPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setEnabled(boolean value) {
      impl.setPropertyValue(INSTANCE.getEnabledPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public ManagedObjectDefinition<? extends ExternalChangelogDomainCfgClient, ? extends ExternalChangelogDomainCfg> definition() {
      return INSTANCE;
    }



    /**
     * {@inheritDoc}
     */
    public PropertyProvider properties() {
      return impl;
    }



    /**
     * {@inheritDoc}
     */
    public void commit() throws ManagedObjectAlreadyExistsException,
        MissingMandatoryPropertiesException, ConcurrentModificationException,
        OperationRejectedException, AuthorizationException,
        CommunicationException {
      impl.commit();
    }

  }



  /**
   * Managed object server implementation.
   */
  private static class ExternalChangelogDomainCfgServerImpl implements
    ExternalChangelogDomainCfg {

    // Private implementation.
    private ServerManagedObject<? extends ExternalChangelogDomainCfg> impl;

    // The value of the "ecl-include" property.
    private final SortedSet<AttributeType> pECLInclude;

    // The value of the "enabled" property.
    private final boolean pEnabled;



    // Private constructor.
    private ExternalChangelogDomainCfgServerImpl(ServerManagedObject<? extends ExternalChangelogDomainCfg> impl) {
      this.impl = impl;
      this.pECLInclude = impl.getPropertyValues(INSTANCE.getECLIncludePropertyDefinition());
      this.pEnabled = impl.getPropertyValue(INSTANCE.getEnabledPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addChangeListener(
        ConfigurationChangeListener<ExternalChangelogDomainCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeChangeListener(
        ConfigurationChangeListener<ExternalChangelogDomainCfg> listener) {
      impl.deregisterChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<AttributeType> getECLInclude() {
      return pECLInclude;
    }



    /**
     * {@inheritDoc}
     */
    public boolean isEnabled() {
      return pEnabled;
    }



    /**
     * {@inheritDoc}
     */
    public Class<? extends ExternalChangelogDomainCfg> configurationClass() {
      return ExternalChangelogDomainCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
