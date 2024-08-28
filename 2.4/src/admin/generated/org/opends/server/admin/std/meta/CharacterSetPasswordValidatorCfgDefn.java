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
import org.opends.server.admin.PropertyOption;
import org.opends.server.admin.PropertyProvider;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.server.ServerManagedObject;
import org.opends.server.admin.std.client.CharacterSetPasswordValidatorCfgClient;
import org.opends.server.admin.std.server.CharacterSetPasswordValidatorCfg;
import org.opends.server.admin.std.server.PasswordValidatorCfg;
import org.opends.server.admin.StringPropertyDefinition;
import org.opends.server.admin.Tag;
import org.opends.server.admin.UndefinedDefaultBehaviorProvider;
import org.opends.server.types.DN;



/**
 * An interface for querying the Character Set Password Validator
 * managed object definition meta information.
 * <p>
 * The Character Set Password Validator determines whether a proposed
 * password is acceptable by checking whether it contains a sufficient
 * number of characters from one or more user-defined character sets.
 */
public final class CharacterSetPasswordValidatorCfgDefn extends ManagedObjectDefinition<CharacterSetPasswordValidatorCfgClient, CharacterSetPasswordValidatorCfg> {

  // The singleton configuration definition instance.
  private static final CharacterSetPasswordValidatorCfgDefn INSTANCE = new CharacterSetPasswordValidatorCfgDefn();



  // The "allow-unclassified-characters" property definition.
  private static final BooleanPropertyDefinition PD_ALLOW_UNCLASSIFIED_CHARACTERS;



  // The "character-set" property definition.
  private static final StringPropertyDefinition PD_CHARACTER_SET;



  // The "java-class" property definition.
  private static final ClassPropertyDefinition PD_JAVA_CLASS;



  // Build the "allow-unclassified-characters" property definition.
  static {
      BooleanPropertyDefinition.Builder builder = BooleanPropertyDefinition.createBuilder(INSTANCE, "allow-unclassified-characters");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "allow-unclassified-characters"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<Boolean>());
      PD_ALLOW_UNCLASSIFIED_CHARACTERS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_ALLOW_UNCLASSIFIED_CHARACTERS);
  }



  // Build the "character-set" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "character-set");
      builder.setOption(PropertyOption.MULTI_VALUED);
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "character-set"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<String>());
      builder.setCaseInsensitive(false);
      PD_CHARACTER_SET = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_CHARACTER_SET);
  }



  // Build the "java-class" property definition.
  static {
      ClassPropertyDefinition.Builder builder = ClassPropertyDefinition.createBuilder(INSTANCE, "java-class");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.COMPONENT_RESTART, INSTANCE, "java-class"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("org.opends.server.extensions.CharacterSetPasswordValidator");
      builder.setDefaultBehaviorProvider(provider);
      builder.addInstanceOf("org.opends.server.api.PasswordValidator");
      PD_JAVA_CLASS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_JAVA_CLASS);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("user-management"));
  }



  /**
   * Get the Character Set Password Validator configuration definition
   * singleton.
   *
   * @return Returns the Character Set Password Validator
   *         configuration definition singleton.
   */
  public static CharacterSetPasswordValidatorCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private CharacterSetPasswordValidatorCfgDefn() {
    super("character-set-password-validator", PasswordValidatorCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public CharacterSetPasswordValidatorCfgClient createClientConfiguration(
      ManagedObject<? extends CharacterSetPasswordValidatorCfgClient> impl) {
    return new CharacterSetPasswordValidatorCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public CharacterSetPasswordValidatorCfg createServerConfiguration(
      ServerManagedObject<? extends CharacterSetPasswordValidatorCfg> impl) {
    return new CharacterSetPasswordValidatorCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<CharacterSetPasswordValidatorCfg> getServerConfigurationClass() {
    return CharacterSetPasswordValidatorCfg.class;
  }



  /**
   * Get the "allow-unclassified-characters" property definition.
   * <p>
   * Indicates whether this password validator allows passwords to
   * contain characters outside of any of the user-defined character
   * sets.
   * <p>
   * If this is "false", then only those characters in the
   * user-defined character sets may be used in passwords. Any password
   * containing a character not included in any character set will be
   * rejected.
   *
   * @return Returns the "allow-unclassified-characters" property definition.
   */
  public BooleanPropertyDefinition getAllowUnclassifiedCharactersPropertyDefinition() {
    return PD_ALLOW_UNCLASSIFIED_CHARACTERS;
  }



  /**
   * Get the "character-set" property definition.
   * <p>
   * Specifies a character set containing characters that a password
   * may contain and a value indicating the minimum number of
   * characters required from that set.
   * <p>
   * Each value must be an integer (indicating the minimum required
   * characters from the set) followed by a colon and the characters to
   * include in that set (for example, "3:abcdefghijklmnopqrstuvwxyz"
   * indicates that a user password must contain at least three
   * characters from the set of lowercase ASCII letters). Multiple
   * character sets can be defined in separate values, although no
   * character can appear in more than one character set.
   *
   * @return Returns the "character-set" property definition.
   */
  public StringPropertyDefinition getCharacterSetPropertyDefinition() {
    return PD_CHARACTER_SET;
  }



  /**
   * Get the "enabled" property definition.
   * <p>
   * Indicates whether the password validator is enabled for use.
   *
   * @return Returns the "enabled" property definition.
   */
  public BooleanPropertyDefinition getEnabledPropertyDefinition() {
    return PasswordValidatorCfgDefn.getInstance().getEnabledPropertyDefinition();
  }



  /**
   * Get the "java-class" property definition.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the password validator implementation.
   *
   * @return Returns the "java-class" property definition.
   */
  public ClassPropertyDefinition getJavaClassPropertyDefinition() {
    return PD_JAVA_CLASS;
  }



  /**
   * Managed object client implementation.
   */
  private static class CharacterSetPasswordValidatorCfgClientImpl implements
    CharacterSetPasswordValidatorCfgClient {

    // Private implementation.
    private ManagedObject<? extends CharacterSetPasswordValidatorCfgClient> impl;



    // Private constructor.
    private CharacterSetPasswordValidatorCfgClientImpl(
        ManagedObject<? extends CharacterSetPasswordValidatorCfgClient> impl) {
      this.impl = impl;
    }



    /**
     * {@inheritDoc}
     */
    public Boolean isAllowUnclassifiedCharacters() {
      return impl.getPropertyValue(INSTANCE.getAllowUnclassifiedCharactersPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setAllowUnclassifiedCharacters(boolean value) {
      impl.setPropertyValue(INSTANCE.getAllowUnclassifiedCharactersPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<String> getCharacterSet() {
      return impl.getPropertyValues(INSTANCE.getCharacterSetPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setCharacterSet(Collection<String> values) {
      impl.setPropertyValues(INSTANCE.getCharacterSetPropertyDefinition(), values);
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
    public ManagedObjectDefinition<? extends CharacterSetPasswordValidatorCfgClient, ? extends CharacterSetPasswordValidatorCfg> definition() {
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
  private static class CharacterSetPasswordValidatorCfgServerImpl implements
    CharacterSetPasswordValidatorCfg {

    // Private implementation.
    private ServerManagedObject<? extends CharacterSetPasswordValidatorCfg> impl;

    // The value of the "allow-unclassified-characters" property.
    private final boolean pAllowUnclassifiedCharacters;

    // The value of the "character-set" property.
    private final SortedSet<String> pCharacterSet;

    // The value of the "enabled" property.
    private final boolean pEnabled;

    // The value of the "java-class" property.
    private final String pJavaClass;



    // Private constructor.
    private CharacterSetPasswordValidatorCfgServerImpl(ServerManagedObject<? extends CharacterSetPasswordValidatorCfg> impl) {
      this.impl = impl;
      this.pAllowUnclassifiedCharacters = impl.getPropertyValue(INSTANCE.getAllowUnclassifiedCharactersPropertyDefinition());
      this.pCharacterSet = impl.getPropertyValues(INSTANCE.getCharacterSetPropertyDefinition());
      this.pEnabled = impl.getPropertyValue(INSTANCE.getEnabledPropertyDefinition());
      this.pJavaClass = impl.getPropertyValue(INSTANCE.getJavaClassPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addCharacterSetChangeListener(
        ConfigurationChangeListener<CharacterSetPasswordValidatorCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeCharacterSetChangeListener(
        ConfigurationChangeListener<CharacterSetPasswordValidatorCfg> listener) {
      impl.deregisterChangeListener(listener);
    }
    /**
     * {@inheritDoc}
     */
    public void addChangeListener(
        ConfigurationChangeListener<PasswordValidatorCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeChangeListener(
        ConfigurationChangeListener<PasswordValidatorCfg> listener) {
      impl.deregisterChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public boolean isAllowUnclassifiedCharacters() {
      return pAllowUnclassifiedCharacters;
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<String> getCharacterSet() {
      return pCharacterSet;
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
    public Class<? extends CharacterSetPasswordValidatorCfg> configurationClass() {
      return CharacterSetPasswordValidatorCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
