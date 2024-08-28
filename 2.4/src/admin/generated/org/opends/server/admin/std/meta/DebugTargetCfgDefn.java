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
import org.opends.server.admin.DefaultBehaviorProvider;
import org.opends.server.admin.DefinedDefaultBehaviorProvider;
import org.opends.server.admin.EnumPropertyDefinition;
import org.opends.server.admin.IntegerPropertyDefinition;
import org.opends.server.admin.ManagedObjectAlreadyExistsException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.PropertyIsReadOnlyException;
import org.opends.server.admin.PropertyOption;
import org.opends.server.admin.PropertyProvider;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.server.ServerManagedObject;
import org.opends.server.admin.std.client.DebugTargetCfgClient;
import org.opends.server.admin.std.server.DebugTargetCfg;
import org.opends.server.admin.StringPropertyDefinition;
import org.opends.server.admin.Tag;
import org.opends.server.admin.TopCfgDefn;
import org.opends.server.admin.UndefinedDefaultBehaviorProvider;
import org.opends.server.types.DN;



/**
 * An interface for querying the Debug Target managed object
 * definition meta information.
 * <p>
 * Debug Targets define the types of messages logged by the debug
 * logPublisher.
 */
public final class DebugTargetCfgDefn extends ManagedObjectDefinition<DebugTargetCfgClient, DebugTargetCfg> {

  // The singleton configuration definition instance.
  private static final DebugTargetCfgDefn INSTANCE = new DebugTargetCfgDefn();



  /**
   * Defines the set of permissable values for the "debug-category" property.
   * <p>
   * Specifies the debug message categories to be logged.
   */
  public static enum DebugCategory {

    /**
     * Exception caught
     */
    CAUGHT("caught"),



    /**
     * Constructor entry
     */
    CONSTRUCTOR("constructor"),



    /**
     * Raw data dump
     */
    DATA("data"),



    /**
     * Access to a backend database.
     */
    DATABASE_ACCESS("database-access"),



    /**
     * Method entry
     */
    ENTER("enter"),



    /**
     * Method exit
     */
    EXIT("exit"),



    /**
     * Arbitrary debug message
     */
    MESSAGE("message"),



    /**
     * Protocol element dump
     */
    PROTOCOL("protocol"),



    /**
     * Exception thrown from method
     */
    THROWN("thrown");



    // String representation of the value.
    private final String name;



    // Private constructor.
    private DebugCategory(String name) { this.name = name; }



    /**
     * {@inheritDoc}
     */
    public String toString() { return name; }

  }



  /**
   * Defines the set of permissable values for the "debug-level" property.
   * <p>
   * Specifies the lowest severity level of debug messages to log.
   */
  public static enum DebugLevel {

    /**
     * Messages with any severity level are logged.
     */
    ALL("all"),



    /**
     * No messages are logged.
     */
    DISABLED("disabled"),



    /**
     * Messages with severity level of ERROR or higher are logged.
     */
    ERROR("error"),



    /**
     * Messages with severity level of INFO or higher are logged.
     */
    INFO("info"),



    /**
     * Messages with severity level of VERBOSE or higher are logged.
     */
    VERBOSE("verbose"),



    /**
     * Messages with severity level of WARNING or higher are logged.
     */
    WARNING("warning");



    // String representation of the value.
    private final String name;



    // Private constructor.
    private DebugLevel(String name) { this.name = name; }



    /**
     * {@inheritDoc}
     */
    public String toString() { return name; }

  }



  // The "debug-category" property definition.
  private static final EnumPropertyDefinition<DebugCategory> PD_DEBUG_CATEGORY;



  // The "debug-level" property definition.
  private static final EnumPropertyDefinition<DebugLevel> PD_DEBUG_LEVEL;



  // The "debug-scope" property definition.
  private static final StringPropertyDefinition PD_DEBUG_SCOPE;



  // The "include-throwable-cause" property definition.
  private static final BooleanPropertyDefinition PD_INCLUDE_THROWABLE_CAUSE;



  // The "omit-method-entry-arguments" property definition.
  private static final BooleanPropertyDefinition PD_OMIT_METHOD_ENTRY_ARGUMENTS;



  // The "omit-method-return-value" property definition.
  private static final BooleanPropertyDefinition PD_OMIT_METHOD_RETURN_VALUE;



  // The "throwable-stack-frames" property definition.
  private static final IntegerPropertyDefinition PD_THROWABLE_STACK_FRAMES;



  // Build the "debug-category" property definition.
  static {
      EnumPropertyDefinition.Builder<DebugCategory> builder = EnumPropertyDefinition.createBuilder(INSTANCE, "debug-category");
      builder.setOption(PropertyOption.MULTI_VALUED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "debug-category"));
      builder.setDefaultBehaviorProvider(new AliasDefaultBehaviorProvider<DebugCategory>(INSTANCE, "debug-category"));
      builder.setEnumClass(DebugCategory.class);
      PD_DEBUG_CATEGORY = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_DEBUG_CATEGORY);
  }



  // Build the "debug-level" property definition.
  static {
      EnumPropertyDefinition.Builder<DebugLevel> builder = EnumPropertyDefinition.createBuilder(INSTANCE, "debug-level");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "debug-level"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<DebugLevel>());
      builder.setEnumClass(DebugLevel.class);
      PD_DEBUG_LEVEL = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_DEBUG_LEVEL);
  }



  // Build the "debug-scope" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "debug-scope");
      builder.setOption(PropertyOption.READ_ONLY);
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "debug-scope"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<String>());
      builder.setPattern("^([A-Za-z][A-Za-z0-9_]*\\.)*[A-Za-z][A-Za-z0-9_]*(#[A-Za-z][A-Za-z0-9_]*)?$", "STRING");
      PD_DEBUG_SCOPE = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_DEBUG_SCOPE);
  }



  // Build the "include-throwable-cause" property definition.
  static {
      BooleanPropertyDefinition.Builder builder = BooleanPropertyDefinition.createBuilder(INSTANCE, "include-throwable-cause");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "include-throwable-cause"));
      DefaultBehaviorProvider<Boolean> provider = new DefinedDefaultBehaviorProvider<Boolean>("false");
      builder.setDefaultBehaviorProvider(provider);
      PD_INCLUDE_THROWABLE_CAUSE = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_INCLUDE_THROWABLE_CAUSE);
  }



  // Build the "omit-method-entry-arguments" property definition.
  static {
      BooleanPropertyDefinition.Builder builder = BooleanPropertyDefinition.createBuilder(INSTANCE, "omit-method-entry-arguments");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "omit-method-entry-arguments"));
      DefaultBehaviorProvider<Boolean> provider = new DefinedDefaultBehaviorProvider<Boolean>("false");
      builder.setDefaultBehaviorProvider(provider);
      PD_OMIT_METHOD_ENTRY_ARGUMENTS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_OMIT_METHOD_ENTRY_ARGUMENTS);
  }



  // Build the "omit-method-return-value" property definition.
  static {
      BooleanPropertyDefinition.Builder builder = BooleanPropertyDefinition.createBuilder(INSTANCE, "omit-method-return-value");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "omit-method-return-value"));
      DefaultBehaviorProvider<Boolean> provider = new DefinedDefaultBehaviorProvider<Boolean>("false");
      builder.setDefaultBehaviorProvider(provider);
      PD_OMIT_METHOD_RETURN_VALUE = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_OMIT_METHOD_RETURN_VALUE);
  }



  // Build the "throwable-stack-frames" property definition.
  static {
      IntegerPropertyDefinition.Builder builder = IntegerPropertyDefinition.createBuilder(INSTANCE, "throwable-stack-frames");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "throwable-stack-frames"));
      DefaultBehaviorProvider<Integer> provider = new DefinedDefaultBehaviorProvider<Integer>("0");
      builder.setDefaultBehaviorProvider(provider);
      builder.setLowerLimit(0);
      PD_THROWABLE_STACK_FRAMES = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_THROWABLE_STACK_FRAMES);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("logging"));
  }



  /**
   * Get the Debug Target configuration definition singleton.
   *
   * @return Returns the Debug Target configuration definition
   *         singleton.
   */
  public static DebugTargetCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private DebugTargetCfgDefn() {
    super("debug-target", TopCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public DebugTargetCfgClient createClientConfiguration(
      ManagedObject<? extends DebugTargetCfgClient> impl) {
    return new DebugTargetCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public DebugTargetCfg createServerConfiguration(
      ServerManagedObject<? extends DebugTargetCfg> impl) {
    return new DebugTargetCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<DebugTargetCfg> getServerConfigurationClass() {
    return DebugTargetCfg.class;
  }



  /**
   * Get the "debug-category" property definition.
   * <p>
   * Specifies the debug message categories to be logged.
   *
   * @return Returns the "debug-category" property definition.
   */
  public EnumPropertyDefinition<DebugCategory> getDebugCategoryPropertyDefinition() {
    return PD_DEBUG_CATEGORY;
  }



  /**
   * Get the "debug-level" property definition.
   * <p>
   * Specifies the lowest severity level of debug messages to log.
   *
   * @return Returns the "debug-level" property definition.
   */
  public EnumPropertyDefinition<DebugLevel> getDebugLevelPropertyDefinition() {
    return PD_DEBUG_LEVEL;
  }



  /**
   * Get the "debug-scope" property definition.
   * <p>
   * Specifies the fully-qualified OpenDS Java package, class, or
   * method affected by the settings in this target definition. Use the
   * number character (#) to separate the class name and the method
   * name (that is, org.opends.server.core.DirectoryServer#startUp).
   *
   * @return Returns the "debug-scope" property definition.
   */
  public StringPropertyDefinition getDebugScopePropertyDefinition() {
    return PD_DEBUG_SCOPE;
  }



  /**
   * Get the "include-throwable-cause" property definition.
   * <p>
   * Specifies the property to indicate whether to include the cause
   * of exceptions in exception thrown and caught messages.
   *
   * @return Returns the "include-throwable-cause" property definition.
   */
  public BooleanPropertyDefinition getIncludeThrowableCausePropertyDefinition() {
    return PD_INCLUDE_THROWABLE_CAUSE;
  }



  /**
   * Get the "omit-method-entry-arguments" property definition.
   * <p>
   * Specifies the property to indicate whether to include method
   * arguments in debug messages.
   *
   * @return Returns the "omit-method-entry-arguments" property definition.
   */
  public BooleanPropertyDefinition getOmitMethodEntryArgumentsPropertyDefinition() {
    return PD_OMIT_METHOD_ENTRY_ARGUMENTS;
  }



  /**
   * Get the "omit-method-return-value" property definition.
   * <p>
   * Specifies the property to indicate whether to include the return
   * value in debug messages.
   *
   * @return Returns the "omit-method-return-value" property definition.
   */
  public BooleanPropertyDefinition getOmitMethodReturnValuePropertyDefinition() {
    return PD_OMIT_METHOD_RETURN_VALUE;
  }



  /**
   * Get the "throwable-stack-frames" property definition.
   * <p>
   * Specifies the property to indicate the number of stack frames to
   * include in the stack trace for method entry and exception thrown
   * messages.
   *
   * @return Returns the "throwable-stack-frames" property definition.
   */
  public IntegerPropertyDefinition getThrowableStackFramesPropertyDefinition() {
    return PD_THROWABLE_STACK_FRAMES;
  }



  /**
   * Managed object client implementation.
   */
  private static class DebugTargetCfgClientImpl implements
    DebugTargetCfgClient {

    // Private implementation.
    private ManagedObject<? extends DebugTargetCfgClient> impl;



    // Private constructor.
    private DebugTargetCfgClientImpl(
        ManagedObject<? extends DebugTargetCfgClient> impl) {
      this.impl = impl;
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<DebugCategory> getDebugCategory() {
      return impl.getPropertyValues(INSTANCE.getDebugCategoryPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setDebugCategory(Collection<DebugCategory> values) {
      impl.setPropertyValues(INSTANCE.getDebugCategoryPropertyDefinition(), values);
    }



    /**
     * {@inheritDoc}
     */
    public DebugLevel getDebugLevel() {
      return impl.getPropertyValue(INSTANCE.getDebugLevelPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setDebugLevel(DebugLevel value) {
      impl.setPropertyValue(INSTANCE.getDebugLevelPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public String getDebugScope() {
      return impl.getPropertyValue(INSTANCE.getDebugScopePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setDebugScope(String value) throws PropertyIsReadOnlyException {
      impl.setPropertyValue(INSTANCE.getDebugScopePropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public boolean isIncludeThrowableCause() {
      return impl.getPropertyValue(INSTANCE.getIncludeThrowableCausePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setIncludeThrowableCause(Boolean value) {
      impl.setPropertyValue(INSTANCE.getIncludeThrowableCausePropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public boolean isOmitMethodEntryArguments() {
      return impl.getPropertyValue(INSTANCE.getOmitMethodEntryArgumentsPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setOmitMethodEntryArguments(Boolean value) {
      impl.setPropertyValue(INSTANCE.getOmitMethodEntryArgumentsPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public boolean isOmitMethodReturnValue() {
      return impl.getPropertyValue(INSTANCE.getOmitMethodReturnValuePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setOmitMethodReturnValue(Boolean value) {
      impl.setPropertyValue(INSTANCE.getOmitMethodReturnValuePropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public int getThrowableStackFrames() {
      return impl.getPropertyValue(INSTANCE.getThrowableStackFramesPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setThrowableStackFrames(Integer value) {
      impl.setPropertyValue(INSTANCE.getThrowableStackFramesPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public ManagedObjectDefinition<? extends DebugTargetCfgClient, ? extends DebugTargetCfg> definition() {
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
  private static class DebugTargetCfgServerImpl implements
    DebugTargetCfg {

    // Private implementation.
    private ServerManagedObject<? extends DebugTargetCfg> impl;

    // The value of the "debug-category" property.
    private final SortedSet<DebugCategory> pDebugCategory;

    // The value of the "debug-level" property.
    private final DebugLevel pDebugLevel;

    // The value of the "debug-scope" property.
    private final String pDebugScope;

    // The value of the "include-throwable-cause" property.
    private final boolean pIncludeThrowableCause;

    // The value of the "omit-method-entry-arguments" property.
    private final boolean pOmitMethodEntryArguments;

    // The value of the "omit-method-return-value" property.
    private final boolean pOmitMethodReturnValue;

    // The value of the "throwable-stack-frames" property.
    private final int pThrowableStackFrames;



    // Private constructor.
    private DebugTargetCfgServerImpl(ServerManagedObject<? extends DebugTargetCfg> impl) {
      this.impl = impl;
      this.pDebugCategory = impl.getPropertyValues(INSTANCE.getDebugCategoryPropertyDefinition());
      this.pDebugLevel = impl.getPropertyValue(INSTANCE.getDebugLevelPropertyDefinition());
      this.pDebugScope = impl.getPropertyValue(INSTANCE.getDebugScopePropertyDefinition());
      this.pIncludeThrowableCause = impl.getPropertyValue(INSTANCE.getIncludeThrowableCausePropertyDefinition());
      this.pOmitMethodEntryArguments = impl.getPropertyValue(INSTANCE.getOmitMethodEntryArgumentsPropertyDefinition());
      this.pOmitMethodReturnValue = impl.getPropertyValue(INSTANCE.getOmitMethodReturnValuePropertyDefinition());
      this.pThrowableStackFrames = impl.getPropertyValue(INSTANCE.getThrowableStackFramesPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addChangeListener(
        ConfigurationChangeListener<DebugTargetCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeChangeListener(
        ConfigurationChangeListener<DebugTargetCfg> listener) {
      impl.deregisterChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<DebugCategory> getDebugCategory() {
      return pDebugCategory;
    }



    /**
     * {@inheritDoc}
     */
    public DebugLevel getDebugLevel() {
      return pDebugLevel;
    }



    /**
     * {@inheritDoc}
     */
    public String getDebugScope() {
      return pDebugScope;
    }



    /**
     * {@inheritDoc}
     */
    public boolean isIncludeThrowableCause() {
      return pIncludeThrowableCause;
    }



    /**
     * {@inheritDoc}
     */
    public boolean isOmitMethodEntryArguments() {
      return pOmitMethodEntryArguments;
    }



    /**
     * {@inheritDoc}
     */
    public boolean isOmitMethodReturnValue() {
      return pOmitMethodReturnValue;
    }



    /**
     * {@inheritDoc}
     */
    public int getThrowableStackFrames() {
      return pThrowableStackFrames;
    }



    /**
     * {@inheritDoc}
     */
    public Class<? extends DebugTargetCfg> configurationClass() {
      return DebugTargetCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
