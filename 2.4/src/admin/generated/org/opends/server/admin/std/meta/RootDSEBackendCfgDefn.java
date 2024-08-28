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
import org.opends.server.admin.BooleanPropertyDefinition;
import org.opends.server.admin.client.AuthorizationException;
import org.opends.server.admin.client.CommunicationException;
import org.opends.server.admin.client.ConcurrentModificationException;
import org.opends.server.admin.client.ManagedObject;
import org.opends.server.admin.client.MissingMandatoryPropertiesException;
import org.opends.server.admin.client.OperationRejectedException;
import org.opends.server.admin.DNPropertyDefinition;
import org.opends.server.admin.ManagedObjectAlreadyExistsException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.ManagedObjectOption;
import org.opends.server.admin.PropertyOption;
import org.opends.server.admin.PropertyProvider;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.server.ServerManagedObject;
import org.opends.server.admin.std.client.RootDSEBackendCfgClient;
import org.opends.server.admin.std.server.RootDSEBackendCfg;
import org.opends.server.admin.Tag;
import org.opends.server.admin.TopCfgDefn;
import org.opends.server.admin.UndefinedDefaultBehaviorProvider;
import org.opends.server.types.DN;



/**
 * An interface for querying the Root DSE Backend managed object
 * definition meta information.
 * <p>
 * The Root DSE Backend contains the Directory Server root DSE.
 */
public final class RootDSEBackendCfgDefn extends ManagedObjectDefinition<RootDSEBackendCfgClient, RootDSEBackendCfg> {

  // The singleton configuration definition instance.
  private static final RootDSEBackendCfgDefn INSTANCE = new RootDSEBackendCfgDefn();



  // The "show-all-attributes" property definition.
  private static final BooleanPropertyDefinition PD_SHOW_ALL_ATTRIBUTES;



  // The "subordinate-base-dn" property definition.
  private static final DNPropertyDefinition PD_SUBORDINATE_BASE_DN;



  // Build the "show-all-attributes" property definition.
  static {
      BooleanPropertyDefinition.Builder builder = BooleanPropertyDefinition.createBuilder(INSTANCE, "show-all-attributes");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "show-all-attributes"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<Boolean>());
      PD_SHOW_ALL_ATTRIBUTES = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_SHOW_ALL_ATTRIBUTES);
  }



  // Build the "subordinate-base-dn" property definition.
  static {
      DNPropertyDefinition.Builder builder = DNPropertyDefinition.createBuilder(INSTANCE, "subordinate-base-dn");
      builder.setOption(PropertyOption.MULTI_VALUED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "subordinate-base-dn"));
      builder.setDefaultBehaviorProvider(new AliasDefaultBehaviorProvider<DN>(INSTANCE, "subordinate-base-dn"));
      PD_SUBORDINATE_BASE_DN = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_SUBORDINATE_BASE_DN);
  }



  // Register the options associated with this managed object definition.
  static {
    INSTANCE.registerOption(ManagedObjectOption.ADVANCED);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("core-server"));
    INSTANCE.registerTag(Tag.valueOf("database"));
  }



  /**
   * Get the Root DSE Backend configuration definition singleton.
   *
   * @return Returns the Root DSE Backend configuration definition
   *         singleton.
   */
  public static RootDSEBackendCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private RootDSEBackendCfgDefn() {
    super("root-dse-backend", TopCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public RootDSEBackendCfgClient createClientConfiguration(
      ManagedObject<? extends RootDSEBackendCfgClient> impl) {
    return new RootDSEBackendCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public RootDSEBackendCfg createServerConfiguration(
      ServerManagedObject<? extends RootDSEBackendCfg> impl) {
    return new RootDSEBackendCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<RootDSEBackendCfg> getServerConfigurationClass() {
    return RootDSEBackendCfg.class;
  }



  /**
   * Get the "show-all-attributes" property definition.
   * <p>
   * Indicates whether all attributes in the root DSE are to be
   * treated like user attributes (and therefore returned to clients by
   * default) regardless of the Directory Server schema configuration.
   *
   * @return Returns the "show-all-attributes" property definition.
   */
  public BooleanPropertyDefinition getShowAllAttributesPropertyDefinition() {
    return PD_SHOW_ALL_ATTRIBUTES;
  }



  /**
   * Get the "subordinate-base-dn" property definition.
   * <p>
   * Specifies the set of base DNs used for singleLevel, wholeSubtree,
   * and subordinateSubtree searches based at the root DSE.
   *
   * @return Returns the "subordinate-base-dn" property definition.
   */
  public DNPropertyDefinition getSubordinateBaseDNPropertyDefinition() {
    return PD_SUBORDINATE_BASE_DN;
  }



  /**
   * Managed object client implementation.
   */
  private static class RootDSEBackendCfgClientImpl implements
    RootDSEBackendCfgClient {

    // Private implementation.
    private ManagedObject<? extends RootDSEBackendCfgClient> impl;



    // Private constructor.
    private RootDSEBackendCfgClientImpl(
        ManagedObject<? extends RootDSEBackendCfgClient> impl) {
      this.impl = impl;
    }



    /**
     * {@inheritDoc}
     */
    public Boolean isShowAllAttributes() {
      return impl.getPropertyValue(INSTANCE.getShowAllAttributesPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setShowAllAttributes(boolean value) {
      impl.setPropertyValue(INSTANCE.getShowAllAttributesPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<DN> getSubordinateBaseDN() {
      return impl.getPropertyValues(INSTANCE.getSubordinateBaseDNPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setSubordinateBaseDN(Collection<DN> values) {
      impl.setPropertyValues(INSTANCE.getSubordinateBaseDNPropertyDefinition(), values);
    }



    /**
     * {@inheritDoc}
     */
    public ManagedObjectDefinition<? extends RootDSEBackendCfgClient, ? extends RootDSEBackendCfg> definition() {
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
  private static class RootDSEBackendCfgServerImpl implements
    RootDSEBackendCfg {

    // Private implementation.
    private ServerManagedObject<? extends RootDSEBackendCfg> impl;

    // The value of the "show-all-attributes" property.
    private final boolean pShowAllAttributes;

    // The value of the "subordinate-base-dn" property.
    private final SortedSet<DN> pSubordinateBaseDN;



    // Private constructor.
    private RootDSEBackendCfgServerImpl(ServerManagedObject<? extends RootDSEBackendCfg> impl) {
      this.impl = impl;
      this.pShowAllAttributes = impl.getPropertyValue(INSTANCE.getShowAllAttributesPropertyDefinition());
      this.pSubordinateBaseDN = impl.getPropertyValues(INSTANCE.getSubordinateBaseDNPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addChangeListener(
        ConfigurationChangeListener<RootDSEBackendCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeChangeListener(
        ConfigurationChangeListener<RootDSEBackendCfg> listener) {
      impl.deregisterChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public boolean isShowAllAttributes() {
      return pShowAllAttributes;
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<DN> getSubordinateBaseDN() {
      return pSubordinateBaseDN;
    }



    /**
     * {@inheritDoc}
     */
    public Class<? extends RootDSEBackendCfg> configurationClass() {
      return RootDSEBackendCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
