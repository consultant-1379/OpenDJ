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
import org.opends.server.admin.ClassPropertyDefinition;
import org.opends.server.admin.client.AuthorizationException;
import org.opends.server.admin.client.CommunicationException;
import org.opends.server.admin.client.ConcurrentModificationException;
import org.opends.server.admin.client.IllegalManagedObjectNameException;
import org.opends.server.admin.client.ManagedObject;
import org.opends.server.admin.client.ManagedObjectDecodingException;
import org.opends.server.admin.client.MissingMandatoryPropertiesException;
import org.opends.server.admin.client.OperationRejectedException;
import org.opends.server.admin.DefaultBehaviorException;
import org.opends.server.admin.DefaultBehaviorProvider;
import org.opends.server.admin.DefinedDefaultBehaviorProvider;
import org.opends.server.admin.DefinitionDecodingException;
import org.opends.server.admin.EnumPropertyDefinition;
import org.opends.server.admin.InstantiableRelationDefinition;
import org.opends.server.admin.IntegerPropertyDefinition;
import org.opends.server.admin.ManagedObjectAlreadyExistsException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.ManagedObjectNotFoundException;
import org.opends.server.admin.PropertyOption;
import org.opends.server.admin.PropertyProvider;
import org.opends.server.admin.server.ConfigurationAddListener;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.server.ConfigurationDeleteListener;
import org.opends.server.admin.server.ServerManagedObject;
import org.opends.server.admin.std.client.DebugLogPublisherCfgClient;
import org.opends.server.admin.std.client.DebugTargetCfgClient;
import org.opends.server.admin.std.server.DebugLogPublisherCfg;
import org.opends.server.admin.std.server.DebugTargetCfg;
import org.opends.server.admin.std.server.LogPublisherCfg;
import org.opends.server.admin.Tag;
import org.opends.server.admin.UndefinedDefaultBehaviorProvider;
import org.opends.server.config.ConfigException;
import org.opends.server.types.DN;



/**
 * An interface for querying the Debug Log Publisher managed object
 * definition meta information.
 * <p>
 * Debug Log Publishers are responsible for distributing debug log
 * messages from the debug logger to a destination.
 */
public final class DebugLogPublisherCfgDefn extends ManagedObjectDefinition<DebugLogPublisherCfgClient, DebugLogPublisherCfg> {

  // The singleton configuration definition instance.
  private static final DebugLogPublisherCfgDefn INSTANCE = new DebugLogPublisherCfgDefn();



  /**
   * Defines the set of permissable values for the "default-debug-category" property.
   * <p>
   * The debug message categories to be logged when none of the
   * defined targets match the message.
   */
  public static enum DefaultDebugCategory {

    /**
     * Exception caught.
     */
    CAUGHT("caught"),



    /**
     * Constructor entry.
     */
    CONSTRUCTOR("constructor"),



    /**
     * Raw data dump.
     */
    DATA("data"),



    /**
     * Access to a backend database.
     */
    DATABASE_ACCESS("database-access"),



    /**
     * Method entry.
     */
    ENTER("enter"),



    /**
     * Method exit.
     */
    EXIT("exit"),



    /**
     * Arbitrary debug message.
     */
    MESSAGE("message"),



    /**
     * Protocol element dump.
     */
    PROTOCOL("protocol"),



    /**
     * Exception throw from method.
     */
    THROWN("thrown");



    // String representation of the value.
    private final String name;



    // Private constructor.
    private DefaultDebugCategory(String name) { this.name = name; }



    /**
     * {@inheritDoc}
     */
    public String toString() { return name; }

  }



  /**
   * Defines the set of permissable values for the "default-debug-level" property.
   * <p>
   * The lowest severity level of debug messages to log when none of
   * the defined targets match the message.
   */
  public static enum DefaultDebugLevel {

    /**
     * Messages with any severity level will be logged.
     */
    ALL("all"),



    /**
     * No messages will be logged.
     */
    DISABLED("disabled"),



    /**
     * Messages with severity level of ERROR or higher will be logged.
     */
    ERROR("error"),



    /**
     * Messages with severity level of INFO or higher will be logged.
     */
    INFO("info"),



    /**
     * Messages with severity level of VERBOSE or higher will be
     * logged.
     */
    VERBOSE("verbose"),



    /**
     * Messages with severity level of WARNING or higher will be
     * logged.
     */
    WARNING("warning");



    // String representation of the value.
    private final String name;



    // Private constructor.
    private DefaultDebugLevel(String name) { this.name = name; }



    /**
     * {@inheritDoc}
     */
    public String toString() { return name; }

  }



  // The "default-debug-category" property definition.
  private static final EnumPropertyDefinition<DefaultDebugCategory> PD_DEFAULT_DEBUG_CATEGORY;



  // The "default-debug-level" property definition.
  private static final EnumPropertyDefinition<DefaultDebugLevel> PD_DEFAULT_DEBUG_LEVEL;



  // The "default-include-throwable-cause" property definition.
  private static final BooleanPropertyDefinition PD_DEFAULT_INCLUDE_THROWABLE_CAUSE;



  // The "default-omit-method-entry-arguments" property definition.
  private static final BooleanPropertyDefinition PD_DEFAULT_OMIT_METHOD_ENTRY_ARGUMENTS;



  // The "default-omit-method-return-value" property definition.
  private static final BooleanPropertyDefinition PD_DEFAULT_OMIT_METHOD_RETURN_VALUE;



  // The "default-throwable-stack-frames" property definition.
  private static final IntegerPropertyDefinition PD_DEFAULT_THROWABLE_STACK_FRAMES;



  // The "java-class" property definition.
  private static final ClassPropertyDefinition PD_JAVA_CLASS;



  // The "debug-targets" relation definition.
  private static final InstantiableRelationDefinition<DebugTargetCfgClient, DebugTargetCfg> RD_DEBUG_TARGETS;



  // Build the "default-debug-category" property definition.
  static {
      EnumPropertyDefinition.Builder<DefaultDebugCategory> builder = EnumPropertyDefinition.createBuilder(INSTANCE, "default-debug-category");
      builder.setOption(PropertyOption.MULTI_VALUED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "default-debug-category"));
      builder.setDefaultBehaviorProvider(new AliasDefaultBehaviorProvider<DefaultDebugCategory>(INSTANCE, "default-debug-category"));
      builder.setEnumClass(DefaultDebugCategory.class);
      PD_DEFAULT_DEBUG_CATEGORY = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_DEFAULT_DEBUG_CATEGORY);
  }



  // Build the "default-debug-level" property definition.
  static {
      EnumPropertyDefinition.Builder<DefaultDebugLevel> builder = EnumPropertyDefinition.createBuilder(INSTANCE, "default-debug-level");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "default-debug-level"));
      DefaultBehaviorProvider<DefaultDebugLevel> provider = new DefinedDefaultBehaviorProvider<DefaultDebugLevel>("error");
      builder.setDefaultBehaviorProvider(provider);
      builder.setEnumClass(DefaultDebugLevel.class);
      PD_DEFAULT_DEBUG_LEVEL = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_DEFAULT_DEBUG_LEVEL);
  }



  // Build the "default-include-throwable-cause" property definition.
  static {
      BooleanPropertyDefinition.Builder builder = BooleanPropertyDefinition.createBuilder(INSTANCE, "default-include-throwable-cause");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "default-include-throwable-cause"));
      DefaultBehaviorProvider<Boolean> provider = new DefinedDefaultBehaviorProvider<Boolean>("true");
      builder.setDefaultBehaviorProvider(provider);
      PD_DEFAULT_INCLUDE_THROWABLE_CAUSE = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_DEFAULT_INCLUDE_THROWABLE_CAUSE);
  }



  // Build the "default-omit-method-entry-arguments" property definition.
  static {
      BooleanPropertyDefinition.Builder builder = BooleanPropertyDefinition.createBuilder(INSTANCE, "default-omit-method-entry-arguments");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "default-omit-method-entry-arguments"));
      DefaultBehaviorProvider<Boolean> provider = new DefinedDefaultBehaviorProvider<Boolean>("false");
      builder.setDefaultBehaviorProvider(provider);
      PD_DEFAULT_OMIT_METHOD_ENTRY_ARGUMENTS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_DEFAULT_OMIT_METHOD_ENTRY_ARGUMENTS);
  }



  // Build the "default-omit-method-return-value" property definition.
  static {
      BooleanPropertyDefinition.Builder builder = BooleanPropertyDefinition.createBuilder(INSTANCE, "default-omit-method-return-value");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "default-omit-method-return-value"));
      DefaultBehaviorProvider<Boolean> provider = new DefinedDefaultBehaviorProvider<Boolean>("false");
      builder.setDefaultBehaviorProvider(provider);
      PD_DEFAULT_OMIT_METHOD_RETURN_VALUE = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_DEFAULT_OMIT_METHOD_RETURN_VALUE);
  }



  // Build the "default-throwable-stack-frames" property definition.
  static {
      IntegerPropertyDefinition.Builder builder = IntegerPropertyDefinition.createBuilder(INSTANCE, "default-throwable-stack-frames");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "default-throwable-stack-frames"));
      DefaultBehaviorProvider<Integer> provider = new DefinedDefaultBehaviorProvider<Integer>("2147483647");
      builder.setDefaultBehaviorProvider(provider);
      builder.setUpperLimit(2147483647);
      builder.setLowerLimit(0);
      PD_DEFAULT_THROWABLE_STACK_FRAMES = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_DEFAULT_THROWABLE_STACK_FRAMES);
  }



  // Build the "java-class" property definition.
  static {
      ClassPropertyDefinition.Builder builder = ClassPropertyDefinition.createBuilder(INSTANCE, "java-class");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "java-class"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<String>());
      builder.addInstanceOf("org.opends.server.api.DebugLogPublisher");
      PD_JAVA_CLASS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_JAVA_CLASS);
  }



  // Build the "debug-targets" relation definition.
  static {
    InstantiableRelationDefinition.Builder<DebugTargetCfgClient, DebugTargetCfg> builder =
      new InstantiableRelationDefinition.Builder<DebugTargetCfgClient, DebugTargetCfg>(INSTANCE, "debug-target", "debug-targets", DebugTargetCfgDefn.getInstance());
    builder.setNamingProperty(DebugTargetCfgDefn.getInstance().getDebugScopePropertyDefinition());
    RD_DEBUG_TARGETS = builder.getInstance();
    INSTANCE.registerRelationDefinition(RD_DEBUG_TARGETS);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("logging"));
  }



  /**
   * Get the Debug Log Publisher configuration definition singleton.
   *
   * @return Returns the Debug Log Publisher configuration definition
   *         singleton.
   */
  public static DebugLogPublisherCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private DebugLogPublisherCfgDefn() {
    super("debug-log-publisher", LogPublisherCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public DebugLogPublisherCfgClient createClientConfiguration(
      ManagedObject<? extends DebugLogPublisherCfgClient> impl) {
    return new DebugLogPublisherCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public DebugLogPublisherCfg createServerConfiguration(
      ServerManagedObject<? extends DebugLogPublisherCfg> impl) {
    return new DebugLogPublisherCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<DebugLogPublisherCfg> getServerConfigurationClass() {
    return DebugLogPublisherCfg.class;
  }



  /**
   * Get the "default-debug-category" property definition.
   * <p>
   * The debug message categories to be logged when none of the
   * defined targets match the message.
   *
   * @return Returns the "default-debug-category" property definition.
   */
  public EnumPropertyDefinition<DefaultDebugCategory> getDefaultDebugCategoryPropertyDefinition() {
    return PD_DEFAULT_DEBUG_CATEGORY;
  }



  /**
   * Get the "default-debug-level" property definition.
   * <p>
   * The lowest severity level of debug messages to log when none of
   * the defined targets match the message.
   *
   * @return Returns the "default-debug-level" property definition.
   */
  public EnumPropertyDefinition<DefaultDebugLevel> getDefaultDebugLevelPropertyDefinition() {
    return PD_DEFAULT_DEBUG_LEVEL;
  }



  /**
   * Get the "default-include-throwable-cause" property definition.
   * <p>
   * Indicates whether to include the cause of exceptions in exception
   * thrown and caught messages logged by default.
   *
   * @return Returns the "default-include-throwable-cause" property definition.
   */
  public BooleanPropertyDefinition getDefaultIncludeThrowableCausePropertyDefinition() {
    return PD_DEFAULT_INCLUDE_THROWABLE_CAUSE;
  }



  /**
   * Get the "default-omit-method-entry-arguments" property definition.
   * <p>
   * Indicates whether to include method arguments in debug messages
   * logged by default.
   *
   * @return Returns the "default-omit-method-entry-arguments" property definition.
   */
  public BooleanPropertyDefinition getDefaultOmitMethodEntryArgumentsPropertyDefinition() {
    return PD_DEFAULT_OMIT_METHOD_ENTRY_ARGUMENTS;
  }



  /**
   * Get the "default-omit-method-return-value" property definition.
   * <p>
   * Indicates whether to include the return value in debug messages
   * logged by default.
   *
   * @return Returns the "default-omit-method-return-value" property definition.
   */
  public BooleanPropertyDefinition getDefaultOmitMethodReturnValuePropertyDefinition() {
    return PD_DEFAULT_OMIT_METHOD_RETURN_VALUE;
  }



  /**
   * Get the "default-throwable-stack-frames" property definition.
   * <p>
   * Indicates the number of stack frames to include in the stack
   * trace for method entry and exception thrown messages.
   *
   * @return Returns the "default-throwable-stack-frames" property definition.
   */
  public IntegerPropertyDefinition getDefaultThrowableStackFramesPropertyDefinition() {
    return PD_DEFAULT_THROWABLE_STACK_FRAMES;
  }



  /**
   * Get the "enabled" property definition.
   * <p>
   * Indicates whether the Debug Log Publisher is enabled for use.
   *
   * @return Returns the "enabled" property definition.
   */
  public BooleanPropertyDefinition getEnabledPropertyDefinition() {
    return LogPublisherCfgDefn.getInstance().getEnabledPropertyDefinition();
  }



  /**
   * Get the "java-class" property definition.
   * <p>
   * The fully-qualified name of the Java class that provides the
   * Debug Log Publisher implementation.
   *
   * @return Returns the "java-class" property definition.
   */
  public ClassPropertyDefinition getJavaClassPropertyDefinition() {
    return PD_JAVA_CLASS;
  }



  /**
   * Get the "debug-targets" relation definition.
   *
   * @return Returns the "debug-targets" relation definition.
   */
  public InstantiableRelationDefinition<DebugTargetCfgClient,DebugTargetCfg> getDebugTargetsRelationDefinition() {
    return RD_DEBUG_TARGETS;
  }



  /**
   * Managed object client implementation.
   */
  private static class DebugLogPublisherCfgClientImpl implements
    DebugLogPublisherCfgClient {

    // Private implementation.
    private ManagedObject<? extends DebugLogPublisherCfgClient> impl;



    // Private constructor.
    private DebugLogPublisherCfgClientImpl(
        ManagedObject<? extends DebugLogPublisherCfgClient> impl) {
      this.impl = impl;
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<DefaultDebugCategory> getDefaultDebugCategory() {
      return impl.getPropertyValues(INSTANCE.getDefaultDebugCategoryPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setDefaultDebugCategory(Collection<DefaultDebugCategory> values) {
      impl.setPropertyValues(INSTANCE.getDefaultDebugCategoryPropertyDefinition(), values);
    }



    /**
     * {@inheritDoc}
     */
    public DefaultDebugLevel getDefaultDebugLevel() {
      return impl.getPropertyValue(INSTANCE.getDefaultDebugLevelPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setDefaultDebugLevel(DefaultDebugLevel value) {
      impl.setPropertyValue(INSTANCE.getDefaultDebugLevelPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public boolean isDefaultIncludeThrowableCause() {
      return impl.getPropertyValue(INSTANCE.getDefaultIncludeThrowableCausePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setDefaultIncludeThrowableCause(Boolean value) {
      impl.setPropertyValue(INSTANCE.getDefaultIncludeThrowableCausePropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public boolean isDefaultOmitMethodEntryArguments() {
      return impl.getPropertyValue(INSTANCE.getDefaultOmitMethodEntryArgumentsPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setDefaultOmitMethodEntryArguments(Boolean value) {
      impl.setPropertyValue(INSTANCE.getDefaultOmitMethodEntryArgumentsPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public boolean isDefaultOmitMethodReturnValue() {
      return impl.getPropertyValue(INSTANCE.getDefaultOmitMethodReturnValuePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setDefaultOmitMethodReturnValue(Boolean value) {
      impl.setPropertyValue(INSTANCE.getDefaultOmitMethodReturnValuePropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public int getDefaultThrowableStackFrames() {
      return impl.getPropertyValue(INSTANCE.getDefaultThrowableStackFramesPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setDefaultThrowableStackFrames(Integer value) {
      impl.setPropertyValue(INSTANCE.getDefaultThrowableStackFramesPropertyDefinition(), value);
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
    public String[] listDebugTargets() throws ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.listChildren(INSTANCE.getDebugTargetsRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public DebugTargetCfgClient getDebugTarget(String name)
        throws DefinitionDecodingException, ManagedObjectDecodingException,
        ManagedObjectNotFoundException, ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.getChild(INSTANCE.getDebugTargetsRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public <M extends DebugTargetCfgClient> M createDebugTarget(
        ManagedObjectDefinition<M, ? extends DebugTargetCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException {
      return impl.createChild(INSTANCE.getDebugTargetsRelationDefinition(), d, name, exceptions).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void removeDebugTarget(String name)
        throws ManagedObjectNotFoundException, ConcurrentModificationException,
        OperationRejectedException, AuthorizationException, CommunicationException {
      impl.removeChild(INSTANCE.getDebugTargetsRelationDefinition(), name);
    }



    /**
     * {@inheritDoc}
     */
    public ManagedObjectDefinition<? extends DebugLogPublisherCfgClient, ? extends DebugLogPublisherCfg> definition() {
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
  private static class DebugLogPublisherCfgServerImpl implements
    DebugLogPublisherCfg {

    // Private implementation.
    private ServerManagedObject<? extends DebugLogPublisherCfg> impl;

    // The value of the "default-debug-category" property.
    private final SortedSet<DefaultDebugCategory> pDefaultDebugCategory;

    // The value of the "default-debug-level" property.
    private final DefaultDebugLevel pDefaultDebugLevel;

    // The value of the "default-include-throwable-cause" property.
    private final boolean pDefaultIncludeThrowableCause;

    // The value of the "default-omit-method-entry-arguments" property.
    private final boolean pDefaultOmitMethodEntryArguments;

    // The value of the "default-omit-method-return-value" property.
    private final boolean pDefaultOmitMethodReturnValue;

    // The value of the "default-throwable-stack-frames" property.
    private final int pDefaultThrowableStackFrames;

    // The value of the "enabled" property.
    private final boolean pEnabled;

    // The value of the "java-class" property.
    private final String pJavaClass;



    // Private constructor.
    private DebugLogPublisherCfgServerImpl(ServerManagedObject<? extends DebugLogPublisherCfg> impl) {
      this.impl = impl;
      this.pDefaultDebugCategory = impl.getPropertyValues(INSTANCE.getDefaultDebugCategoryPropertyDefinition());
      this.pDefaultDebugLevel = impl.getPropertyValue(INSTANCE.getDefaultDebugLevelPropertyDefinition());
      this.pDefaultIncludeThrowableCause = impl.getPropertyValue(INSTANCE.getDefaultIncludeThrowableCausePropertyDefinition());
      this.pDefaultOmitMethodEntryArguments = impl.getPropertyValue(INSTANCE.getDefaultOmitMethodEntryArgumentsPropertyDefinition());
      this.pDefaultOmitMethodReturnValue = impl.getPropertyValue(INSTANCE.getDefaultOmitMethodReturnValuePropertyDefinition());
      this.pDefaultThrowableStackFrames = impl.getPropertyValue(INSTANCE.getDefaultThrowableStackFramesPropertyDefinition());
      this.pEnabled = impl.getPropertyValue(INSTANCE.getEnabledPropertyDefinition());
      this.pJavaClass = impl.getPropertyValue(INSTANCE.getJavaClassPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addDebugChangeListener(
        ConfigurationChangeListener<DebugLogPublisherCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeDebugChangeListener(
        ConfigurationChangeListener<DebugLogPublisherCfg> listener) {
      impl.deregisterChangeListener(listener);
    }
    /**
     * {@inheritDoc}
     */
    public void addChangeListener(
        ConfigurationChangeListener<LogPublisherCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeChangeListener(
        ConfigurationChangeListener<LogPublisherCfg> listener) {
      impl.deregisterChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<DefaultDebugCategory> getDefaultDebugCategory() {
      return pDefaultDebugCategory;
    }



    /**
     * {@inheritDoc}
     */
    public DefaultDebugLevel getDefaultDebugLevel() {
      return pDefaultDebugLevel;
    }



    /**
     * {@inheritDoc}
     */
    public boolean isDefaultIncludeThrowableCause() {
      return pDefaultIncludeThrowableCause;
    }



    /**
     * {@inheritDoc}
     */
    public boolean isDefaultOmitMethodEntryArguments() {
      return pDefaultOmitMethodEntryArguments;
    }



    /**
     * {@inheritDoc}
     */
    public boolean isDefaultOmitMethodReturnValue() {
      return pDefaultOmitMethodReturnValue;
    }



    /**
     * {@inheritDoc}
     */
    public int getDefaultThrowableStackFrames() {
      return pDefaultThrowableStackFrames;
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
    public String[] listDebugTargets() {
      return impl.listChildren(INSTANCE.getDebugTargetsRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public DebugTargetCfg getDebugTarget(String name) throws ConfigException {
      return impl.getChild(INSTANCE.getDebugTargetsRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void addDebugTargetAddListener(
        ConfigurationAddListener<DebugTargetCfg> listener) throws ConfigException {
      impl.registerAddListener(INSTANCE.getDebugTargetsRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeDebugTargetAddListener(
        ConfigurationAddListener<DebugTargetCfg> listener) {
      impl.deregisterAddListener(INSTANCE.getDebugTargetsRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void addDebugTargetDeleteListener(
        ConfigurationDeleteListener<DebugTargetCfg> listener) throws ConfigException {
      impl.registerDeleteListener(INSTANCE.getDebugTargetsRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeDebugTargetDeleteListener(
        ConfigurationDeleteListener<DebugTargetCfg> listener) {
      impl.deregisterDeleteListener(INSTANCE.getDebugTargetsRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public Class<? extends DebugLogPublisherCfg> configurationClass() {
      return DebugLogPublisherCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
