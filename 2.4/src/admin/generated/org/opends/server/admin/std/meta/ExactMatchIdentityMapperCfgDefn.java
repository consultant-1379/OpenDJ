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
import org.opends.server.admin.AttributeTypePropertyDefinition;
import org.opends.server.admin.BooleanPropertyDefinition;
import org.opends.server.admin.ClassPropertyDefinition;
import org.opends.server.admin.client.AuthorizationException;
import org.opends.server.admin.client.CommunicationException;
import org.opends.server.admin.client.ConcurrentModificationException;
import org.opends.server.admin.client.ManagedObject;
import org.opends.server.admin.client.MissingMandatoryPropertiesException;
import org.opends.server.admin.client.OperationRejectedException;
import org.opends.server.admin.DefaultBehaviorProvider;
import org.opends.server.admin.DefinedDefaultBehaviorProvider;
import org.opends.server.admin.DNPropertyDefinition;
import org.opends.server.admin.ManagedObjectAlreadyExistsException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.PropertyOption;
import org.opends.server.admin.PropertyProvider;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.server.ServerManagedObject;
import org.opends.server.admin.std.client.ExactMatchIdentityMapperCfgClient;
import org.opends.server.admin.std.server.ExactMatchIdentityMapperCfg;
import org.opends.server.admin.std.server.IdentityMapperCfg;
import org.opends.server.admin.Tag;
import org.opends.server.types.AttributeType;
import org.opends.server.types.DN;



/**
 * An interface for querying the Exact Match Identity Mapper managed
 * object definition meta information.
 * <p>
 * The Exact Match Identity Mapper maps an identifier string to user
 * entries by searching for the entry containing a specified attribute
 * whose value is the provided identifier. For example, the username
 * provided by the client for DIGEST-MD5 authentication must match the
 * value of the uid attribute
 */
public final class ExactMatchIdentityMapperCfgDefn extends ManagedObjectDefinition<ExactMatchIdentityMapperCfgClient, ExactMatchIdentityMapperCfg> {

  // The singleton configuration definition instance.
  private static final ExactMatchIdentityMapperCfgDefn INSTANCE = new ExactMatchIdentityMapperCfgDefn();



  // The "java-class" property definition.
  private static final ClassPropertyDefinition PD_JAVA_CLASS;



  // The "match-attribute" property definition.
  private static final AttributeTypePropertyDefinition PD_MATCH_ATTRIBUTE;



  // The "match-base-dn" property definition.
  private static final DNPropertyDefinition PD_MATCH_BASE_DN;



  // Build the "java-class" property definition.
  static {
      ClassPropertyDefinition.Builder builder = ClassPropertyDefinition.createBuilder(INSTANCE, "java-class");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.COMPONENT_RESTART, INSTANCE, "java-class"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("org.opends.server.extensions.ExactMatchIdentityMapper");
      builder.setDefaultBehaviorProvider(provider);
      builder.addInstanceOf("org.opends.server.api.IdentityMapper");
      PD_JAVA_CLASS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_JAVA_CLASS);
  }



  // Build the "match-attribute" property definition.
  static {
      AttributeTypePropertyDefinition.Builder builder = AttributeTypePropertyDefinition.createBuilder(INSTANCE, "match-attribute");
      builder.setOption(PropertyOption.MULTI_VALUED);
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "match-attribute"));
      DefaultBehaviorProvider<AttributeType> provider = new DefinedDefaultBehaviorProvider<AttributeType>("uid");
      builder.setDefaultBehaviorProvider(provider);
      PD_MATCH_ATTRIBUTE = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_MATCH_ATTRIBUTE);
  }



  // Build the "match-base-dn" property definition.
  static {
      DNPropertyDefinition.Builder builder = DNPropertyDefinition.createBuilder(INSTANCE, "match-base-dn");
      builder.setOption(PropertyOption.MULTI_VALUED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "match-base-dn"));
      builder.setDefaultBehaviorProvider(new AliasDefaultBehaviorProvider<DN>(INSTANCE, "match-base-dn"));
      PD_MATCH_BASE_DN = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_MATCH_BASE_DN);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("security"));
    INSTANCE.registerTag(Tag.valueOf("user-management"));
  }



  /**
   * Get the Exact Match Identity Mapper configuration definition
   * singleton.
   *
   * @return Returns the Exact Match Identity Mapper configuration
   *         definition singleton.
   */
  public static ExactMatchIdentityMapperCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private ExactMatchIdentityMapperCfgDefn() {
    super("exact-match-identity-mapper", IdentityMapperCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public ExactMatchIdentityMapperCfgClient createClientConfiguration(
      ManagedObject<? extends ExactMatchIdentityMapperCfgClient> impl) {
    return new ExactMatchIdentityMapperCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public ExactMatchIdentityMapperCfg createServerConfiguration(
      ServerManagedObject<? extends ExactMatchIdentityMapperCfg> impl) {
    return new ExactMatchIdentityMapperCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<ExactMatchIdentityMapperCfg> getServerConfigurationClass() {
    return ExactMatchIdentityMapperCfg.class;
  }



  /**
   * Get the "enabled" property definition.
   * <p>
   * Indicates whether the Exact Match Identity Mapper is enabled for
   * use.
   *
   * @return Returns the "enabled" property definition.
   */
  public BooleanPropertyDefinition getEnabledPropertyDefinition() {
    return IdentityMapperCfgDefn.getInstance().getEnabledPropertyDefinition();
  }



  /**
   * Get the "java-class" property definition.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Exact Match Identity Mapper implementation.
   *
   * @return Returns the "java-class" property definition.
   */
  public ClassPropertyDefinition getJavaClassPropertyDefinition() {
    return PD_JAVA_CLASS;
  }



  /**
   * Get the "match-attribute" property definition.
   * <p>
   * Specifies the attribute whose value should exactly match the ID
   * string provided to this identity mapper.
   * <p>
   * At least one value must be provided. All values must refer to the
   * name or OID of an attribute type defined in the Directory Server
   * schema. If multiple attributes or OIDs are provided, at least one
   * of those attributes must contain the provided ID string value in
   * exactly one entry. The internal search performed includes a
   * logical OR across all of these values.
   *
   * @return Returns the "match-attribute" property definition.
   */
  public AttributeTypePropertyDefinition getMatchAttributePropertyDefinition() {
    return PD_MATCH_ATTRIBUTE;
  }



  /**
   * Get the "match-base-dn" property definition.
   * <p>
   * Specifies the set of base DNs below which to search for users.
   * <p>
   * The base DNs will be used when performing searches to map the
   * provided ID string to a user entry. If multiple values are given,
   * searches are performed below all specified base DNs.
   *
   * @return Returns the "match-base-dn" property definition.
   */
  public DNPropertyDefinition getMatchBaseDNPropertyDefinition() {
    return PD_MATCH_BASE_DN;
  }



  /**
   * Managed object client implementation.
   */
  private static class ExactMatchIdentityMapperCfgClientImpl implements
    ExactMatchIdentityMapperCfgClient {

    // Private implementation.
    private ManagedObject<? extends ExactMatchIdentityMapperCfgClient> impl;



    // Private constructor.
    private ExactMatchIdentityMapperCfgClientImpl(
        ManagedObject<? extends ExactMatchIdentityMapperCfgClient> impl) {
      this.impl = impl;
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
    public String getJavaClass() {
      return impl.getPropertyValue(INSTANCE.getJavaClassPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setJavaClass(String value) {
      impl.setPropertyValue(INSTANCE.getJavaClassPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<AttributeType> getMatchAttribute() {
      return impl.getPropertyValues(INSTANCE.getMatchAttributePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setMatchAttribute(Collection<AttributeType> values) {
      impl.setPropertyValues(INSTANCE.getMatchAttributePropertyDefinition(), values);
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<DN> getMatchBaseDN() {
      return impl.getPropertyValues(INSTANCE.getMatchBaseDNPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setMatchBaseDN(Collection<DN> values) {
      impl.setPropertyValues(INSTANCE.getMatchBaseDNPropertyDefinition(), values);
    }



    /**
     * {@inheritDoc}
     */
    public ManagedObjectDefinition<? extends ExactMatchIdentityMapperCfgClient, ? extends ExactMatchIdentityMapperCfg> definition() {
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
  private static class ExactMatchIdentityMapperCfgServerImpl implements
    ExactMatchIdentityMapperCfg {

    // Private implementation.
    private ServerManagedObject<? extends ExactMatchIdentityMapperCfg> impl;

    // The value of the "enabled" property.
    private final boolean pEnabled;

    // The value of the "java-class" property.
    private final String pJavaClass;

    // The value of the "match-attribute" property.
    private final SortedSet<AttributeType> pMatchAttribute;

    // The value of the "match-base-dn" property.
    private final SortedSet<DN> pMatchBaseDN;



    // Private constructor.
    private ExactMatchIdentityMapperCfgServerImpl(ServerManagedObject<? extends ExactMatchIdentityMapperCfg> impl) {
      this.impl = impl;
      this.pEnabled = impl.getPropertyValue(INSTANCE.getEnabledPropertyDefinition());
      this.pJavaClass = impl.getPropertyValue(INSTANCE.getJavaClassPropertyDefinition());
      this.pMatchAttribute = impl.getPropertyValues(INSTANCE.getMatchAttributePropertyDefinition());
      this.pMatchBaseDN = impl.getPropertyValues(INSTANCE.getMatchBaseDNPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addExactMatchChangeListener(
        ConfigurationChangeListener<ExactMatchIdentityMapperCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeExactMatchChangeListener(
        ConfigurationChangeListener<ExactMatchIdentityMapperCfg> listener) {
      impl.deregisterChangeListener(listener);
    }
    /**
     * {@inheritDoc}
     */
    public void addChangeListener(
        ConfigurationChangeListener<IdentityMapperCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeChangeListener(
        ConfigurationChangeListener<IdentityMapperCfg> listener) {
      impl.deregisterChangeListener(listener);
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
    public String getJavaClass() {
      return pJavaClass;
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<AttributeType> getMatchAttribute() {
      return pMatchAttribute;
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<DN> getMatchBaseDN() {
      return pMatchBaseDN;
    }



    /**
     * {@inheritDoc}
     */
    public Class<? extends ExactMatchIdentityMapperCfg> configurationClass() {
      return ExactMatchIdentityMapperCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
