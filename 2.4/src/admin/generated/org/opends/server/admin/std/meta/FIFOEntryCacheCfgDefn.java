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
import org.opends.server.admin.DurationPropertyDefinition;
import org.opends.server.admin.IntegerPropertyDefinition;
import org.opends.server.admin.ManagedObjectAlreadyExistsException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.PropertyOption;
import org.opends.server.admin.PropertyProvider;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.server.ServerManagedObject;
import org.opends.server.admin.std.client.FIFOEntryCacheCfgClient;
import org.opends.server.admin.std.server.EntryCacheCfg;
import org.opends.server.admin.std.server.FIFOEntryCacheCfg;
import org.opends.server.admin.StringPropertyDefinition;
import org.opends.server.admin.Tag;
import org.opends.server.admin.UndefinedDefaultBehaviorProvider;
import org.opends.server.types.DN;



/**
 * An interface for querying the FIFO Entry Cache managed object
 * definition meta information.
 * <p>
 * FIFO Entry Caches use a FIFO queue to keep track of the cached
 * entries.
 */
public final class FIFOEntryCacheCfgDefn extends ManagedObjectDefinition<FIFOEntryCacheCfgClient, FIFOEntryCacheCfg> {

  // The singleton configuration definition instance.
  private static final FIFOEntryCacheCfgDefn INSTANCE = new FIFOEntryCacheCfgDefn();



  // The "exclude-filter" property definition.
  private static final StringPropertyDefinition PD_EXCLUDE_FILTER;



  // The "include-filter" property definition.
  private static final StringPropertyDefinition PD_INCLUDE_FILTER;



  // The "java-class" property definition.
  private static final ClassPropertyDefinition PD_JAVA_CLASS;



  // The "lock-timeout" property definition.
  private static final DurationPropertyDefinition PD_LOCK_TIMEOUT;



  // The "max-entries" property definition.
  private static final IntegerPropertyDefinition PD_MAX_ENTRIES;



  // The "max-memory-percent" property definition.
  private static final IntegerPropertyDefinition PD_MAX_MEMORY_PERCENT;



  // Build the "exclude-filter" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "exclude-filter");
      builder.setOption(PropertyOption.MULTI_VALUED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "exclude-filter"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<String>());
      PD_EXCLUDE_FILTER = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_EXCLUDE_FILTER);
  }



  // Build the "include-filter" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "include-filter");
      builder.setOption(PropertyOption.MULTI_VALUED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "include-filter"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<String>());
      PD_INCLUDE_FILTER = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_INCLUDE_FILTER);
  }



  // Build the "java-class" property definition.
  static {
      ClassPropertyDefinition.Builder builder = ClassPropertyDefinition.createBuilder(INSTANCE, "java-class");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.COMPONENT_RESTART, INSTANCE, "java-class"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("org.opends.server.extensions.FIFOEntryCache");
      builder.setDefaultBehaviorProvider(provider);
      builder.addInstanceOf("org.opends.server.api.EntryCache");
      PD_JAVA_CLASS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_JAVA_CLASS);
  }



  // Build the "lock-timeout" property definition.
  static {
      DurationPropertyDefinition.Builder builder = DurationPropertyDefinition.createBuilder(INSTANCE, "lock-timeout");
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "lock-timeout"));
      DefaultBehaviorProvider<Long> provider = new DefinedDefaultBehaviorProvider<Long>("2000.0ms");
      builder.setDefaultBehaviorProvider(provider);
      builder.setAllowUnlimited(true);
      builder.setBaseUnit("ms");
      builder.setLowerLimit("0");
      PD_LOCK_TIMEOUT = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_LOCK_TIMEOUT);
  }



  // Build the "max-entries" property definition.
  static {
      IntegerPropertyDefinition.Builder builder = IntegerPropertyDefinition.createBuilder(INSTANCE, "max-entries");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "max-entries"));
      DefaultBehaviorProvider<Integer> provider = new DefinedDefaultBehaviorProvider<Integer>("2147483647");
      builder.setDefaultBehaviorProvider(provider);
      builder.setLowerLimit(0);
      PD_MAX_ENTRIES = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_MAX_ENTRIES);
  }



  // Build the "max-memory-percent" property definition.
  static {
      IntegerPropertyDefinition.Builder builder = IntegerPropertyDefinition.createBuilder(INSTANCE, "max-memory-percent");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "max-memory-percent"));
      DefaultBehaviorProvider<Integer> provider = new DefinedDefaultBehaviorProvider<Integer>("90");
      builder.setDefaultBehaviorProvider(provider);
      builder.setUpperLimit(100);
      builder.setLowerLimit(1);
      PD_MAX_MEMORY_PERCENT = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_MAX_MEMORY_PERCENT);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("database"));
  }



  /**
   * Get the FIFO Entry Cache configuration definition singleton.
   *
   * @return Returns the FIFO Entry Cache configuration definition
   *         singleton.
   */
  public static FIFOEntryCacheCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private FIFOEntryCacheCfgDefn() {
    super("fifo-entry-cache", EntryCacheCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public FIFOEntryCacheCfgClient createClientConfiguration(
      ManagedObject<? extends FIFOEntryCacheCfgClient> impl) {
    return new FIFOEntryCacheCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public FIFOEntryCacheCfg createServerConfiguration(
      ServerManagedObject<? extends FIFOEntryCacheCfg> impl) {
    return new FIFOEntryCacheCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<FIFOEntryCacheCfg> getServerConfigurationClass() {
    return FIFOEntryCacheCfg.class;
  }



  /**
   * Get the "cache-level" property definition.
   * <p>
   * Specifies the cache level in the cache order if more than one
   * instance of the cache is configured.
   *
   * @return Returns the "cache-level" property definition.
   */
  public IntegerPropertyDefinition getCacheLevelPropertyDefinition() {
    return EntryCacheCfgDefn.getInstance().getCacheLevelPropertyDefinition();
  }



  /**
   * Get the "enabled" property definition.
   * <p>
   * Indicates whether the FIFO Entry Cache is enabled.
   *
   * @return Returns the "enabled" property definition.
   */
  public BooleanPropertyDefinition getEnabledPropertyDefinition() {
    return EntryCacheCfgDefn.getInstance().getEnabledPropertyDefinition();
  }



  /**
   * Get the "exclude-filter" property definition.
   * <p>
   * The set of filters that define the entries that should be
   * excluded from the cache.
   *
   * @return Returns the "exclude-filter" property definition.
   */
  public StringPropertyDefinition getExcludeFilterPropertyDefinition() {
    return PD_EXCLUDE_FILTER;
  }



  /**
   * Get the "include-filter" property definition.
   * <p>
   * The set of filters that define the entries that should be
   * included in the cache.
   *
   * @return Returns the "include-filter" property definition.
   */
  public StringPropertyDefinition getIncludeFilterPropertyDefinition() {
    return PD_INCLUDE_FILTER;
  }



  /**
   * Get the "java-class" property definition.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the FIFO Entry Cache implementation.
   *
   * @return Returns the "java-class" property definition.
   */
  public ClassPropertyDefinition getJavaClassPropertyDefinition() {
    return PD_JAVA_CLASS;
  }



  /**
   * Get the "lock-timeout" property definition.
   * <p>
   * Specifies the length of time to wait while attempting to acquire
   * a read or write lock.
   *
   * @return Returns the "lock-timeout" property definition.
   */
  public DurationPropertyDefinition getLockTimeoutPropertyDefinition() {
    return PD_LOCK_TIMEOUT;
  }



  /**
   * Get the "max-entries" property definition.
   * <p>
   * Specifies the maximum number of entries that we will allow in the
   * cache.
   *
   * @return Returns the "max-entries" property definition.
   */
  public IntegerPropertyDefinition getMaxEntriesPropertyDefinition() {
    return PD_MAX_ENTRIES;
  }



  /**
   * Get the "max-memory-percent" property definition.
   * <p>
   * Specifies the maximum memory usage for the entry cache as a
   * percentage of the total JVM memory.
   *
   * @return Returns the "max-memory-percent" property definition.
   */
  public IntegerPropertyDefinition getMaxMemoryPercentPropertyDefinition() {
    return PD_MAX_MEMORY_PERCENT;
  }



  /**
   * Managed object client implementation.
   */
  private static class FIFOEntryCacheCfgClientImpl implements
    FIFOEntryCacheCfgClient {

    // Private implementation.
    private ManagedObject<? extends FIFOEntryCacheCfgClient> impl;



    // Private constructor.
    private FIFOEntryCacheCfgClientImpl(
        ManagedObject<? extends FIFOEntryCacheCfgClient> impl) {
      this.impl = impl;
    }



    /**
     * {@inheritDoc}
     */
    public Integer getCacheLevel() {
      return impl.getPropertyValue(INSTANCE.getCacheLevelPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setCacheLevel(int value) {
      impl.setPropertyValue(INSTANCE.getCacheLevelPropertyDefinition(), value);
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
    public SortedSet<String> getExcludeFilter() {
      return impl.getPropertyValues(INSTANCE.getExcludeFilterPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setExcludeFilter(Collection<String> values) {
      impl.setPropertyValues(INSTANCE.getExcludeFilterPropertyDefinition(), values);
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<String> getIncludeFilter() {
      return impl.getPropertyValues(INSTANCE.getIncludeFilterPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setIncludeFilter(Collection<String> values) {
      impl.setPropertyValues(INSTANCE.getIncludeFilterPropertyDefinition(), values);
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
    public long getLockTimeout() {
      return impl.getPropertyValue(INSTANCE.getLockTimeoutPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setLockTimeout(Long value) {
      impl.setPropertyValue(INSTANCE.getLockTimeoutPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public int getMaxEntries() {
      return impl.getPropertyValue(INSTANCE.getMaxEntriesPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setMaxEntries(Integer value) {
      impl.setPropertyValue(INSTANCE.getMaxEntriesPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public int getMaxMemoryPercent() {
      return impl.getPropertyValue(INSTANCE.getMaxMemoryPercentPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setMaxMemoryPercent(Integer value) {
      impl.setPropertyValue(INSTANCE.getMaxMemoryPercentPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public ManagedObjectDefinition<? extends FIFOEntryCacheCfgClient, ? extends FIFOEntryCacheCfg> definition() {
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
  private static class FIFOEntryCacheCfgServerImpl implements
    FIFOEntryCacheCfg {

    // Private implementation.
    private ServerManagedObject<? extends FIFOEntryCacheCfg> impl;

    // The value of the "cache-level" property.
    private final int pCacheLevel;

    // The value of the "enabled" property.
    private final boolean pEnabled;

    // The value of the "exclude-filter" property.
    private final SortedSet<String> pExcludeFilter;

    // The value of the "include-filter" property.
    private final SortedSet<String> pIncludeFilter;

    // The value of the "java-class" property.
    private final String pJavaClass;

    // The value of the "lock-timeout" property.
    private final long pLockTimeout;

    // The value of the "max-entries" property.
    private final int pMaxEntries;

    // The value of the "max-memory-percent" property.
    private final int pMaxMemoryPercent;



    // Private constructor.
    private FIFOEntryCacheCfgServerImpl(ServerManagedObject<? extends FIFOEntryCacheCfg> impl) {
      this.impl = impl;
      this.pCacheLevel = impl.getPropertyValue(INSTANCE.getCacheLevelPropertyDefinition());
      this.pEnabled = impl.getPropertyValue(INSTANCE.getEnabledPropertyDefinition());
      this.pExcludeFilter = impl.getPropertyValues(INSTANCE.getExcludeFilterPropertyDefinition());
      this.pIncludeFilter = impl.getPropertyValues(INSTANCE.getIncludeFilterPropertyDefinition());
      this.pJavaClass = impl.getPropertyValue(INSTANCE.getJavaClassPropertyDefinition());
      this.pLockTimeout = impl.getPropertyValue(INSTANCE.getLockTimeoutPropertyDefinition());
      this.pMaxEntries = impl.getPropertyValue(INSTANCE.getMaxEntriesPropertyDefinition());
      this.pMaxMemoryPercent = impl.getPropertyValue(INSTANCE.getMaxMemoryPercentPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addFIFOChangeListener(
        ConfigurationChangeListener<FIFOEntryCacheCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeFIFOChangeListener(
        ConfigurationChangeListener<FIFOEntryCacheCfg> listener) {
      impl.deregisterChangeListener(listener);
    }
    /**
     * {@inheritDoc}
     */
    public void addChangeListener(
        ConfigurationChangeListener<EntryCacheCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeChangeListener(
        ConfigurationChangeListener<EntryCacheCfg> listener) {
      impl.deregisterChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public int getCacheLevel() {
      return pCacheLevel;
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
    public SortedSet<String> getExcludeFilter() {
      return pExcludeFilter;
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<String> getIncludeFilter() {
      return pIncludeFilter;
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
    public long getLockTimeout() {
      return pLockTimeout;
    }



    /**
     * {@inheritDoc}
     */
    public int getMaxEntries() {
      return pMaxEntries;
    }



    /**
     * {@inheritDoc}
     */
    public int getMaxMemoryPercent() {
      return pMaxMemoryPercent;
    }



    /**
     * {@inheritDoc}
     */
    public Class<? extends FIFOEntryCacheCfg> configurationClass() {
      return FIFOEntryCacheCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
