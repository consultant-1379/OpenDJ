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



import org.opends.server.admin.AdministratorAction;
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
import org.opends.server.admin.ManagedObjectAlreadyExistsException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.PropertyIsReadOnlyException;
import org.opends.server.admin.PropertyOption;
import org.opends.server.admin.PropertyProvider;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.server.ServerManagedObject;
import org.opends.server.admin.std.client.AttributeTypeDescriptionAttributeSyntaxCfgClient;
import org.opends.server.admin.std.server.AttributeSyntaxCfg;
import org.opends.server.admin.std.server.AttributeTypeDescriptionAttributeSyntaxCfg;
import org.opends.server.admin.Tag;
import org.opends.server.types.DN;



/**
 * An interface for querying the Attribute Type Description Attribute
 * Syntax managed object definition meta information.
 * <p>
 * Attribute Type Description Attribute Syntaxes describe the format
 * of the directory schema attribute type definitions.
 */
public final class AttributeTypeDescriptionAttributeSyntaxCfgDefn extends ManagedObjectDefinition<AttributeTypeDescriptionAttributeSyntaxCfgClient, AttributeTypeDescriptionAttributeSyntaxCfg> {

  // The singleton configuration definition instance.
  private static final AttributeTypeDescriptionAttributeSyntaxCfgDefn INSTANCE = new AttributeTypeDescriptionAttributeSyntaxCfgDefn();



  // The "java-class" property definition.
  private static final ClassPropertyDefinition PD_JAVA_CLASS;



  // The "strip-syntax-min-upper-bound" property definition.
  private static final BooleanPropertyDefinition PD_STRIP_SYNTAX_MIN_UPPER_BOUND;



  // Build the "java-class" property definition.
  static {
      ClassPropertyDefinition.Builder builder = ClassPropertyDefinition.createBuilder(INSTANCE, "java-class");
      builder.setOption(PropertyOption.READ_ONLY);
      builder.setOption(PropertyOption.MANDATORY);
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.COMPONENT_RESTART, INSTANCE, "java-class"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("org.opends.server.schema.AttributeTypeSyntax");
      builder.setDefaultBehaviorProvider(provider);
      builder.addInstanceOf("org.opends.server.api.AttributeSyntax");
      PD_JAVA_CLASS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_JAVA_CLASS);
  }



  // Build the "strip-syntax-min-upper-bound" property definition.
  static {
      BooleanPropertyDefinition.Builder builder = BooleanPropertyDefinition.createBuilder(INSTANCE, "strip-syntax-min-upper-bound");
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "strip-syntax-min-upper-bound"));
      DefaultBehaviorProvider<Boolean> provider = new DefinedDefaultBehaviorProvider<Boolean>("false");
      builder.setDefaultBehaviorProvider(provider);
      PD_STRIP_SYNTAX_MIN_UPPER_BOUND = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_STRIP_SYNTAX_MIN_UPPER_BOUND);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("core-server"));
  }



  /**
   * Get the Attribute Type Description Attribute Syntax configuration
   * definition singleton.
   *
   * @return Returns the Attribute Type Description Attribute Syntax
   *         configuration definition singleton.
   */
  public static AttributeTypeDescriptionAttributeSyntaxCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private AttributeTypeDescriptionAttributeSyntaxCfgDefn() {
    super("attribute-type-description-attribute-syntax", AttributeSyntaxCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public AttributeTypeDescriptionAttributeSyntaxCfgClient createClientConfiguration(
      ManagedObject<? extends AttributeTypeDescriptionAttributeSyntaxCfgClient> impl) {
    return new AttributeTypeDescriptionAttributeSyntaxCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public AttributeTypeDescriptionAttributeSyntaxCfg createServerConfiguration(
      ServerManagedObject<? extends AttributeTypeDescriptionAttributeSyntaxCfg> impl) {
    return new AttributeTypeDescriptionAttributeSyntaxCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<AttributeTypeDescriptionAttributeSyntaxCfg> getServerConfigurationClass() {
    return AttributeTypeDescriptionAttributeSyntaxCfg.class;
  }



  /**
   * Get the "enabled" property definition.
   * <p>
   * Indicates whether the Attribute Type Description Attribute Syntax
   * is enabled.
   *
   * @return Returns the "enabled" property definition.
   */
  public BooleanPropertyDefinition getEnabledPropertyDefinition() {
    return AttributeSyntaxCfgDefn.getInstance().getEnabledPropertyDefinition();
  }



  /**
   * Get the "java-class" property definition.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the Attribute Type Description Attribute Syntax
   * implementation.
   *
   * @return Returns the "java-class" property definition.
   */
  public ClassPropertyDefinition getJavaClassPropertyDefinition() {
    return PD_JAVA_CLASS;
  }



  /**
   * Get the "strip-syntax-min-upper-bound" property definition.
   * <p>
   * Indicates whether the suggested minimum upper bound appended to
   * an attribute's syntax OID in it's schema definition Attribute Type
   * Description is stripped off.
   * <p>
   * When retrieving the server's schema, some APIs (JNDI) fail in
   * their syntax lookup methods, because they do not parse this value
   * correctly. This configuration option allows the server to be
   * configured to provide schema definitions these APIs can parse
   * correctly.
   *
   * @return Returns the "strip-syntax-min-upper-bound" property definition.
   */
  public BooleanPropertyDefinition getStripSyntaxMinUpperBoundPropertyDefinition() {
    return PD_STRIP_SYNTAX_MIN_UPPER_BOUND;
  }



  /**
   * Managed object client implementation.
   */
  private static class AttributeTypeDescriptionAttributeSyntaxCfgClientImpl implements
    AttributeTypeDescriptionAttributeSyntaxCfgClient {

    // Private implementation.
    private ManagedObject<? extends AttributeTypeDescriptionAttributeSyntaxCfgClient> impl;



    // Private constructor.
    private AttributeTypeDescriptionAttributeSyntaxCfgClientImpl(
        ManagedObject<? extends AttributeTypeDescriptionAttributeSyntaxCfgClient> impl) {
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
    public void setJavaClass(String value) throws PropertyIsReadOnlyException {
      impl.setPropertyValue(INSTANCE.getJavaClassPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public boolean isStripSyntaxMinUpperBound() {
      return impl.getPropertyValue(INSTANCE.getStripSyntaxMinUpperBoundPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setStripSyntaxMinUpperBound(Boolean value) {
      impl.setPropertyValue(INSTANCE.getStripSyntaxMinUpperBoundPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public ManagedObjectDefinition<? extends AttributeTypeDescriptionAttributeSyntaxCfgClient, ? extends AttributeTypeDescriptionAttributeSyntaxCfg> definition() {
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
  private static class AttributeTypeDescriptionAttributeSyntaxCfgServerImpl implements
    AttributeTypeDescriptionAttributeSyntaxCfg {

    // Private implementation.
    private ServerManagedObject<? extends AttributeTypeDescriptionAttributeSyntaxCfg> impl;

    // The value of the "enabled" property.
    private final boolean pEnabled;

    // The value of the "java-class" property.
    private final String pJavaClass;

    // The value of the "strip-syntax-min-upper-bound" property.
    private final boolean pStripSyntaxMinUpperBound;



    // Private constructor.
    private AttributeTypeDescriptionAttributeSyntaxCfgServerImpl(ServerManagedObject<? extends AttributeTypeDescriptionAttributeSyntaxCfg> impl) {
      this.impl = impl;
      this.pEnabled = impl.getPropertyValue(INSTANCE.getEnabledPropertyDefinition());
      this.pJavaClass = impl.getPropertyValue(INSTANCE.getJavaClassPropertyDefinition());
      this.pStripSyntaxMinUpperBound = impl.getPropertyValue(INSTANCE.getStripSyntaxMinUpperBoundPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addAttributeTypeDescriptionChangeListener(
        ConfigurationChangeListener<AttributeTypeDescriptionAttributeSyntaxCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeAttributeTypeDescriptionChangeListener(
        ConfigurationChangeListener<AttributeTypeDescriptionAttributeSyntaxCfg> listener) {
      impl.deregisterChangeListener(listener);
    }
    /**
     * {@inheritDoc}
     */
    public void addChangeListener(
        ConfigurationChangeListener<AttributeSyntaxCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeChangeListener(
        ConfigurationChangeListener<AttributeSyntaxCfg> listener) {
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
    public boolean isStripSyntaxMinUpperBound() {
      return pStripSyntaxMinUpperBound;
    }



    /**
     * {@inheritDoc}
     */
    public Class<? extends AttributeTypeDescriptionAttributeSyntaxCfg> configurationClass() {
      return AttributeTypeDescriptionAttributeSyntaxCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
