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
import org.opends.server.admin.AliasDefaultBehaviorProvider;
import org.opends.server.admin.client.AuthorizationException;
import org.opends.server.admin.client.CommunicationException;
import org.opends.server.admin.client.ConcurrentModificationException;
import org.opends.server.admin.client.ManagedObject;
import org.opends.server.admin.client.MissingMandatoryPropertiesException;
import org.opends.server.admin.client.OperationRejectedException;
import org.opends.server.admin.DNPropertyDefinition;
import org.opends.server.admin.ManagedObjectAlreadyExistsException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.PropertyOption;
import org.opends.server.admin.PropertyProvider;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.server.ServerManagedObject;
import org.opends.server.admin.std.client.RootDNUserCfgClient;
import org.opends.server.admin.std.server.RootDNUserCfg;
import org.opends.server.admin.Tag;
import org.opends.server.admin.TopCfgDefn;
import org.opends.server.types.DN;



/**
 * An interface for querying the Root DN User managed object
 * definition meta information.
 * <p>
 * A Root DN User are administrative users who can granted special
 * privileges that are not available to non-root users (for example,
 * the ability to bind to the server in lockdown mode).
 */
public final class RootDNUserCfgDefn extends ManagedObjectDefinition<RootDNUserCfgClient, RootDNUserCfg> {

  // The singleton configuration definition instance.
  private static final RootDNUserCfgDefn INSTANCE = new RootDNUserCfgDefn();



  // The "alternate-bind-dn" property definition.
  private static final DNPropertyDefinition PD_ALTERNATE_BIND_DN;



  // Build the "alternate-bind-dn" property definition.
  static {
      DNPropertyDefinition.Builder builder = DNPropertyDefinition.createBuilder(INSTANCE, "alternate-bind-dn");
      builder.setOption(PropertyOption.MULTI_VALUED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "alternate-bind-dn"));
      builder.setDefaultBehaviorProvider(new AliasDefaultBehaviorProvider<DN>(INSTANCE, "alternate-bind-dn"));
      PD_ALTERNATE_BIND_DN = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_ALTERNATE_BIND_DN);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("core-server"));
  }



  /**
   * Get the Root DN User configuration definition singleton.
   *
   * @return Returns the Root DN User configuration definition
   *         singleton.
   */
  public static RootDNUserCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private RootDNUserCfgDefn() {
    super("root-dn-user", TopCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public RootDNUserCfgClient createClientConfiguration(
      ManagedObject<? extends RootDNUserCfgClient> impl) {
    return new RootDNUserCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public RootDNUserCfg createServerConfiguration(
      ServerManagedObject<? extends RootDNUserCfg> impl) {
    return new RootDNUserCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<RootDNUserCfg> getServerConfigurationClass() {
    return RootDNUserCfg.class;
  }



  /**
   * Get the "alternate-bind-dn" property definition.
   * <p>
   * Specifies one or more alternate DNs that can be used to bind to
   * the server as this root user.
   *
   * @return Returns the "alternate-bind-dn" property definition.
   */
  public DNPropertyDefinition getAlternateBindDNPropertyDefinition() {
    return PD_ALTERNATE_BIND_DN;
  }



  /**
   * Managed object client implementation.
   */
  private static class RootDNUserCfgClientImpl implements
    RootDNUserCfgClient {

    // Private implementation.
    private ManagedObject<? extends RootDNUserCfgClient> impl;



    // Private constructor.
    private RootDNUserCfgClientImpl(
        ManagedObject<? extends RootDNUserCfgClient> impl) {
      this.impl = impl;
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<DN> getAlternateBindDN() {
      return impl.getPropertyValues(INSTANCE.getAlternateBindDNPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setAlternateBindDN(Collection<DN> values) {
      impl.setPropertyValues(INSTANCE.getAlternateBindDNPropertyDefinition(), values);
    }



    /**
     * {@inheritDoc}
     */
    public ManagedObjectDefinition<? extends RootDNUserCfgClient, ? extends RootDNUserCfg> definition() {
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
  private static class RootDNUserCfgServerImpl implements
    RootDNUserCfg {

    // Private implementation.
    private ServerManagedObject<? extends RootDNUserCfg> impl;

    // The value of the "alternate-bind-dn" property.
    private final SortedSet<DN> pAlternateBindDN;



    // Private constructor.
    private RootDNUserCfgServerImpl(ServerManagedObject<? extends RootDNUserCfg> impl) {
      this.impl = impl;
      this.pAlternateBindDN = impl.getPropertyValues(INSTANCE.getAlternateBindDNPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addChangeListener(
        ConfigurationChangeListener<RootDNUserCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeChangeListener(
        ConfigurationChangeListener<RootDNUserCfg> listener) {
      impl.deregisterChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<DN> getAlternateBindDN() {
      return pAlternateBindDN;
    }



    /**
     * {@inheritDoc}
     */
    public Class<? extends RootDNUserCfg> configurationClass() {
      return RootDNUserCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
