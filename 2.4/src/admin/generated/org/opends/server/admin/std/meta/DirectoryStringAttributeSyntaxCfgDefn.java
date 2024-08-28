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
import org.opends.server.admin.std.client.DirectoryStringAttributeSyntaxCfgClient;
import org.opends.server.admin.std.server.AttributeSyntaxCfg;
import org.opends.server.admin.std.server.DirectoryStringAttributeSyntaxCfg;
import org.opends.server.admin.Tag;
import org.opends.server.types.DN;



/**
 * An interface for querying the Directory String Attribute Syntax
 * managed object definition meta information.
 * <p>
 * The Directory String Attribute Syntax defines an attribute syntax
 * for storing arbitrary string (and sometimes binary) data.
 */
public final class DirectoryStringAttributeSyntaxCfgDefn extends ManagedObjectDefinition<DirectoryStringAttributeSyntaxCfgClient, DirectoryStringAttributeSyntaxCfg> {

  // The singleton configuration definition instance.
  private static final DirectoryStringAttributeSyntaxCfgDefn INSTANCE = new DirectoryStringAttributeSyntaxCfgDefn();



  // The "allow-zero-length-values" property definition.
  private static final BooleanPropertyDefinition PD_ALLOW_ZERO_LENGTH_VALUES;



  // The "java-class" property definition.
  private static final ClassPropertyDefinition PD_JAVA_CLASS;



  // Build the "allow-zero-length-values" property definition.
  static {
      BooleanPropertyDefinition.Builder builder = BooleanPropertyDefinition.createBuilder(INSTANCE, "allow-zero-length-values");
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "allow-zero-length-values"));
      DefaultBehaviorProvider<Boolean> provider = new DefinedDefaultBehaviorProvider<Boolean>("false");
      builder.setDefaultBehaviorProvider(provider);
      PD_ALLOW_ZERO_LENGTH_VALUES = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_ALLOW_ZERO_LENGTH_VALUES);
  }



  // Build the "java-class" property definition.
  static {
      ClassPropertyDefinition.Builder builder = ClassPropertyDefinition.createBuilder(INSTANCE, "java-class");
      builder.setOption(PropertyOption.READ_ONLY);
      builder.setOption(PropertyOption.MANDATORY);
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.COMPONENT_RESTART, INSTANCE, "java-class"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("org.opends.server.schema.DirectoryStringSyntax");
      builder.setDefaultBehaviorProvider(provider);
      builder.addInstanceOf("org.opends.server.api.AttributeSyntax");
      PD_JAVA_CLASS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_JAVA_CLASS);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("core-server"));
  }



  /**
   * Get the Directory String Attribute Syntax configuration
   * definition singleton.
   *
   * @return Returns the Directory String Attribute Syntax
   *         configuration definition singleton.
   */
  public static DirectoryStringAttributeSyntaxCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private DirectoryStringAttributeSyntaxCfgDefn() {
    super("directory-string-attribute-syntax", AttributeSyntaxCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public DirectoryStringAttributeSyntaxCfgClient createClientConfiguration(
      ManagedObject<? extends DirectoryStringAttributeSyntaxCfgClient> impl) {
    return new DirectoryStringAttributeSyntaxCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public DirectoryStringAttributeSyntaxCfg createServerConfiguration(
      ServerManagedObject<? extends DirectoryStringAttributeSyntaxCfg> impl) {
    return new DirectoryStringAttributeSyntaxCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<DirectoryStringAttributeSyntaxCfg> getServerConfigurationClass() {
    return DirectoryStringAttributeSyntaxCfg.class;
  }



  /**
   * Get the "allow-zero-length-values" property definition.
   * <p>
   * Indicates whether zero-length (that is, an empty string) values
   * are allowed.
   * <p>
   * This is technically not allowed by the revised LDAPv3
   * specification, but some environments may require it for backward
   * compatibility with servers that do allow it.
   *
   * @return Returns the "allow-zero-length-values" property definition.
   */
  public BooleanPropertyDefinition getAllowZeroLengthValuesPropertyDefinition() {
    return PD_ALLOW_ZERO_LENGTH_VALUES;
  }



  /**
   * Get the "enabled" property definition.
   * <p>
   * Indicates whether the Directory String Attribute Syntax is
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
   * provides the Directory String Attribute Syntax implementation.
   *
   * @return Returns the "java-class" property definition.
   */
  public ClassPropertyDefinition getJavaClassPropertyDefinition() {
    return PD_JAVA_CLASS;
  }



  /**
   * Managed object client implementation.
   */
  private static class DirectoryStringAttributeSyntaxCfgClientImpl implements
    DirectoryStringAttributeSyntaxCfgClient {

    // Private implementation.
    private ManagedObject<? extends DirectoryStringAttributeSyntaxCfgClient> impl;



    // Private constructor.
    private DirectoryStringAttributeSyntaxCfgClientImpl(
        ManagedObject<? extends DirectoryStringAttributeSyntaxCfgClient> impl) {
      this.impl = impl;
    }



    /**
     * {@inheritDoc}
     */
    public boolean isAllowZeroLengthValues() {
      return impl.getPropertyValue(INSTANCE.getAllowZeroLengthValuesPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setAllowZeroLengthValues(Boolean value) {
      impl.setPropertyValue(INSTANCE.getAllowZeroLengthValuesPropertyDefinition(), value);
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
    public ManagedObjectDefinition<? extends DirectoryStringAttributeSyntaxCfgClient, ? extends DirectoryStringAttributeSyntaxCfg> definition() {
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
  private static class DirectoryStringAttributeSyntaxCfgServerImpl implements
    DirectoryStringAttributeSyntaxCfg {

    // Private implementation.
    private ServerManagedObject<? extends DirectoryStringAttributeSyntaxCfg> impl;

    // The value of the "allow-zero-length-values" property.
    private final boolean pAllowZeroLengthValues;

    // The value of the "enabled" property.
    private final boolean pEnabled;

    // The value of the "java-class" property.
    private final String pJavaClass;



    // Private constructor.
    private DirectoryStringAttributeSyntaxCfgServerImpl(ServerManagedObject<? extends DirectoryStringAttributeSyntaxCfg> impl) {
      this.impl = impl;
      this.pAllowZeroLengthValues = impl.getPropertyValue(INSTANCE.getAllowZeroLengthValuesPropertyDefinition());
      this.pEnabled = impl.getPropertyValue(INSTANCE.getEnabledPropertyDefinition());
      this.pJavaClass = impl.getPropertyValue(INSTANCE.getJavaClassPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addDirectoryStringChangeListener(
        ConfigurationChangeListener<DirectoryStringAttributeSyntaxCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeDirectoryStringChangeListener(
        ConfigurationChangeListener<DirectoryStringAttributeSyntaxCfg> listener) {
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
    public boolean isAllowZeroLengthValues() {
      return pAllowZeroLengthValues;
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
    public Class<? extends DirectoryStringAttributeSyntaxCfg> configurationClass() {
      return DirectoryStringAttributeSyntaxCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
