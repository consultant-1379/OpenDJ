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
import org.opends.server.admin.std.client.TelephoneNumberAttributeSyntaxCfgClient;
import org.opends.server.admin.std.server.AttributeSyntaxCfg;
import org.opends.server.admin.std.server.TelephoneNumberAttributeSyntaxCfg;
import org.opends.server.admin.Tag;
import org.opends.server.types.DN;



/**
 * An interface for querying the Telephone Number Attribute Syntax
 * managed object definition meta information.
 * <p>
 * Telephone Number Attribute Syntaxes define an attribute syntax for
 * storing telephone number information.
 */
public final class TelephoneNumberAttributeSyntaxCfgDefn extends ManagedObjectDefinition<TelephoneNumberAttributeSyntaxCfgClient, TelephoneNumberAttributeSyntaxCfg> {

  // The singleton configuration definition instance.
  private static final TelephoneNumberAttributeSyntaxCfgDefn INSTANCE = new TelephoneNumberAttributeSyntaxCfgDefn();



  // The "java-class" property definition.
  private static final ClassPropertyDefinition PD_JAVA_CLASS;



  // The "strict-format" property definition.
  private static final BooleanPropertyDefinition PD_STRICT_FORMAT;



  // Build the "java-class" property definition.
  static {
      ClassPropertyDefinition.Builder builder = ClassPropertyDefinition.createBuilder(INSTANCE, "java-class");
      builder.setOption(PropertyOption.READ_ONLY);
      builder.setOption(PropertyOption.MANDATORY);
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.COMPONENT_RESTART, INSTANCE, "java-class"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("org.opends.server.schema.TelephoneNumberSyntax");
      builder.setDefaultBehaviorProvider(provider);
      builder.addInstanceOf("org.opends.server.api.AttributeSyntax");
      PD_JAVA_CLASS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_JAVA_CLASS);
  }



  // Build the "strict-format" property definition.
  static {
      BooleanPropertyDefinition.Builder builder = BooleanPropertyDefinition.createBuilder(INSTANCE, "strict-format");
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "strict-format"));
      DefaultBehaviorProvider<Boolean> provider = new DefinedDefaultBehaviorProvider<Boolean>("false");
      builder.setDefaultBehaviorProvider(provider);
      PD_STRICT_FORMAT = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_STRICT_FORMAT);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("core-server"));
  }



  /**
   * Get the Telephone Number Attribute Syntax configuration
   * definition singleton.
   *
   * @return Returns the Telephone Number Attribute Syntax
   *         configuration definition singleton.
   */
  public static TelephoneNumberAttributeSyntaxCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private TelephoneNumberAttributeSyntaxCfgDefn() {
    super("telephone-number-attribute-syntax", AttributeSyntaxCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public TelephoneNumberAttributeSyntaxCfgClient createClientConfiguration(
      ManagedObject<? extends TelephoneNumberAttributeSyntaxCfgClient> impl) {
    return new TelephoneNumberAttributeSyntaxCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public TelephoneNumberAttributeSyntaxCfg createServerConfiguration(
      ServerManagedObject<? extends TelephoneNumberAttributeSyntaxCfg> impl) {
    return new TelephoneNumberAttributeSyntaxCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<TelephoneNumberAttributeSyntaxCfg> getServerConfigurationClass() {
    return TelephoneNumberAttributeSyntaxCfg.class;
  }



  /**
   * Get the "enabled" property definition.
   * <p>
   * Indicates whether the Telephone Number Attribute Syntax is
   * enabled.
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
   * provides the Telephone Number Attribute Syntax implementation.
   *
   * @return Returns the "java-class" property definition.
   */
  public ClassPropertyDefinition getJavaClassPropertyDefinition() {
    return PD_JAVA_CLASS;
  }



  /**
   * Get the "strict-format" property definition.
   * <p>
   * Indicates whether to require telephone number values to strictly
   * comply with the standard definition for this syntax.
   *
   * @return Returns the "strict-format" property definition.
   */
  public BooleanPropertyDefinition getStrictFormatPropertyDefinition() {
    return PD_STRICT_FORMAT;
  }



  /**
   * Managed object client implementation.
   */
  private static class TelephoneNumberAttributeSyntaxCfgClientImpl implements
    TelephoneNumberAttributeSyntaxCfgClient {

    // Private implementation.
    private ManagedObject<? extends TelephoneNumberAttributeSyntaxCfgClient> impl;



    // Private constructor.
    private TelephoneNumberAttributeSyntaxCfgClientImpl(
        ManagedObject<? extends TelephoneNumberAttributeSyntaxCfgClient> impl) {
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
    public boolean isStrictFormat() {
      return impl.getPropertyValue(INSTANCE.getStrictFormatPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setStrictFormat(Boolean value) {
      impl.setPropertyValue(INSTANCE.getStrictFormatPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public ManagedObjectDefinition<? extends TelephoneNumberAttributeSyntaxCfgClient, ? extends TelephoneNumberAttributeSyntaxCfg> definition() {
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
  private static class TelephoneNumberAttributeSyntaxCfgServerImpl implements
    TelephoneNumberAttributeSyntaxCfg {

    // Private implementation.
    private ServerManagedObject<? extends TelephoneNumberAttributeSyntaxCfg> impl;

    // The value of the "enabled" property.
    private final boolean pEnabled;

    // The value of the "java-class" property.
    private final String pJavaClass;

    // The value of the "strict-format" property.
    private final boolean pStrictFormat;



    // Private constructor.
    private TelephoneNumberAttributeSyntaxCfgServerImpl(ServerManagedObject<? extends TelephoneNumberAttributeSyntaxCfg> impl) {
      this.impl = impl;
      this.pEnabled = impl.getPropertyValue(INSTANCE.getEnabledPropertyDefinition());
      this.pJavaClass = impl.getPropertyValue(INSTANCE.getJavaClassPropertyDefinition());
      this.pStrictFormat = impl.getPropertyValue(INSTANCE.getStrictFormatPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addTelephoneNumberChangeListener(
        ConfigurationChangeListener<TelephoneNumberAttributeSyntaxCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeTelephoneNumberChangeListener(
        ConfigurationChangeListener<TelephoneNumberAttributeSyntaxCfg> listener) {
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
    public boolean isStrictFormat() {
      return pStrictFormat;
    }



    /**
     * {@inheritDoc}
     */
    public Class<? extends TelephoneNumberAttributeSyntaxCfg> configurationClass() {
      return TelephoneNumberAttributeSyntaxCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
