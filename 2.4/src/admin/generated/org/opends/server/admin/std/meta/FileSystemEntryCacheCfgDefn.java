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
import org.opends.server.admin.EnumPropertyDefinition;
import org.opends.server.admin.IntegerPropertyDefinition;
import org.opends.server.admin.ManagedObjectAlreadyExistsException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.PropertyOption;
import org.opends.server.admin.PropertyProvider;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.server.ServerManagedObject;
import org.opends.server.admin.SizePropertyDefinition;
import org.opends.server.admin.std.client.FileSystemEntryCacheCfgClient;
import org.opends.server.admin.std.server.EntryCacheCfg;
import org.opends.server.admin.std.server.FileSystemEntryCacheCfg;
import org.opends.server.admin.StringPropertyDefinition;
import org.opends.server.admin.Tag;
import org.opends.server.admin.UndefinedDefaultBehaviorProvider;
import org.opends.server.types.DN;



/**
 * An interface for querying the File System Entry Cache managed
 * object definition meta information.
 * <p>
 * The File System Entry Cache is an entry cache implementation which
 * uses a JE database to keep track of the entries.
 */
public final class FileSystemEntryCacheCfgDefn extends ManagedObjectDefinition<FileSystemEntryCacheCfgClient, FileSystemEntryCacheCfg> {

  // The singleton configuration definition instance.
  private static final FileSystemEntryCacheCfgDefn INSTANCE = new FileSystemEntryCacheCfgDefn();



  /**
   * Defines the set of permissable values for the "cache-type" property.
   * <p>
   * Specifies the policy which should be used for purging entries
   * from the cache.
   */
  public static enum CacheType {

    /**
     * FIFO based entry cache.
     */
    FIFO("fifo"),



    /**
     * LRU based entry cache.
     */
    LRU("lru");



    // String representation of the value.
    private final String name;



    // Private constructor.
    private CacheType(String name) { this.name = name; }



    /**
     * {@inheritDoc}
     */
    public String toString() { return name; }

  }



  // The "cache-directory" property definition.
  private static final StringPropertyDefinition PD_CACHE_DIRECTORY;



  // The "cache-type" property definition.
  private static final EnumPropertyDefinition<CacheType> PD_CACHE_TYPE;



  // The "compact-encoding" property definition.
  private static final BooleanPropertyDefinition PD_COMPACT_ENCODING;



  // The "db-cache-percent" property definition.
  private static final IntegerPropertyDefinition PD_DB_CACHE_PERCENT;



  // The "db-cache-size" property definition.
  private static final SizePropertyDefinition PD_DB_CACHE_SIZE;



  // The "exclude-filter" property definition.
  private static final StringPropertyDefinition PD_EXCLUDE_FILTER;



  // The "include-filter" property definition.
  private static final StringPropertyDefinition PD_INCLUDE_FILTER;



  // The "java-class" property definition.
  private static final ClassPropertyDefinition PD_JAVA_CLASS;



  // The "je-property" property definition.
  private static final StringPropertyDefinition PD_JE_PROPERTY;



  // The "lock-timeout" property definition.
  private static final DurationPropertyDefinition PD_LOCK_TIMEOUT;



  // The "max-entries" property definition.
  private static final IntegerPropertyDefinition PD_MAX_ENTRIES;



  // The "max-memory-size" property definition.
  private static final SizePropertyDefinition PD_MAX_MEMORY_SIZE;



  // The "persistent-cache" property definition.
  private static final BooleanPropertyDefinition PD_PERSISTENT_CACHE;



  // Build the "cache-directory" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "cache-directory");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.COMPONENT_RESTART, INSTANCE, "cache-directory"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("/tmp/OpenDS.FSCache");
      builder.setDefaultBehaviorProvider(provider);
      PD_CACHE_DIRECTORY = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_CACHE_DIRECTORY);
  }



  // Build the "cache-type" property definition.
  static {
      EnumPropertyDefinition.Builder<CacheType> builder = EnumPropertyDefinition.createBuilder(INSTANCE, "cache-type");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.COMPONENT_RESTART, INSTANCE, "cache-type"));
      DefaultBehaviorProvider<CacheType> provider = new DefinedDefaultBehaviorProvider<CacheType>("fifo");
      builder.setDefaultBehaviorProvider(provider);
      builder.setEnumClass(CacheType.class);
      PD_CACHE_TYPE = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_CACHE_TYPE);
  }



  // Build the "compact-encoding" property definition.
  static {
      BooleanPropertyDefinition.Builder builder = BooleanPropertyDefinition.createBuilder(INSTANCE, "compact-encoding");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "compact-encoding"));
      DefaultBehaviorProvider<Boolean> provider = new DefinedDefaultBehaviorProvider<Boolean>("true");
      builder.setDefaultBehaviorProvider(provider);
      PD_COMPACT_ENCODING = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_COMPACT_ENCODING);
  }



  // Build the "db-cache-percent" property definition.
  static {
      IntegerPropertyDefinition.Builder builder = IntegerPropertyDefinition.createBuilder(INSTANCE, "db-cache-percent");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "db-cache-percent"));
      DefaultBehaviorProvider<Integer> provider = new DefinedDefaultBehaviorProvider<Integer>("1");
      builder.setDefaultBehaviorProvider(provider);
      builder.setUpperLimit(90);
      builder.setLowerLimit(0);
      PD_DB_CACHE_PERCENT = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_DB_CACHE_PERCENT);
  }



  // Build the "db-cache-size" property definition.
  static {
      SizePropertyDefinition.Builder builder = SizePropertyDefinition.createBuilder(INSTANCE, "db-cache-size");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "db-cache-size"));
      DefaultBehaviorProvider<Long> provider = new DefinedDefaultBehaviorProvider<Long>("0b");
      builder.setDefaultBehaviorProvider(provider);
      PD_DB_CACHE_SIZE = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_DB_CACHE_SIZE);
  }



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
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("org.opends.server.extensions.FileSystemEntryCache");
      builder.setDefaultBehaviorProvider(provider);
      builder.addInstanceOf("org.opends.server.api.EntryCache");
      PD_JAVA_CLASS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_JAVA_CLASS);
  }



  // Build the "je-property" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "je-property");
      builder.setOption(PropertyOption.MULTI_VALUED);
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "je-property"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("je.env.isLocking=false");
      builder.setDefaultBehaviorProvider(provider);
      PD_JE_PROPERTY = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_JE_PROPERTY);
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



  // Build the "max-memory-size" property definition.
  static {
      SizePropertyDefinition.Builder builder = SizePropertyDefinition.createBuilder(INSTANCE, "max-memory-size");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "max-memory-size"));
      DefaultBehaviorProvider<Long> provider = new DefinedDefaultBehaviorProvider<Long>("0b");
      builder.setDefaultBehaviorProvider(provider);
      PD_MAX_MEMORY_SIZE = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_MAX_MEMORY_SIZE);
  }



  // Build the "persistent-cache" property definition.
  static {
      BooleanPropertyDefinition.Builder builder = BooleanPropertyDefinition.createBuilder(INSTANCE, "persistent-cache");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "persistent-cache"));
      DefaultBehaviorProvider<Boolean> provider = new DefinedDefaultBehaviorProvider<Boolean>("false");
      builder.setDefaultBehaviorProvider(provider);
      PD_PERSISTENT_CACHE = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_PERSISTENT_CACHE);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("database"));
  }



  /**
   * Get the File System Entry Cache configuration definition
   * singleton.
   *
   * @return Returns the File System Entry Cache configuration
   *         definition singleton.
   */
  public static FileSystemEntryCacheCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private FileSystemEntryCacheCfgDefn() {
    super("file-system-entry-cache", EntryCacheCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public FileSystemEntryCacheCfgClient createClientConfiguration(
      ManagedObject<? extends FileSystemEntryCacheCfgClient> impl) {
    return new FileSystemEntryCacheCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public FileSystemEntryCacheCfg createServerConfiguration(
      ServerManagedObject<? extends FileSystemEntryCacheCfg> impl) {
    return new FileSystemEntryCacheCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<FileSystemEntryCacheCfg> getServerConfigurationClass() {
    return FileSystemEntryCacheCfg.class;
  }



  /**
   * Get the "cache-directory" property definition.
   * <p>
   * Specifies the directory in which the JE environment should store
   * the cache.
   *
   * @return Returns the "cache-directory" property definition.
   */
  public StringPropertyDefinition getCacheDirectoryPropertyDefinition() {
    return PD_CACHE_DIRECTORY;
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
   * Get the "cache-type" property definition.
   * <p>
   * Specifies the policy which should be used for purging entries
   * from the cache.
   *
   * @return Returns the "cache-type" property definition.
   */
  public EnumPropertyDefinition<CacheType> getCacheTypePropertyDefinition() {
    return PD_CACHE_TYPE;
  }



  /**
   * Get the "compact-encoding" property definition.
   * <p>
   * Indicates whether the cache should use a compact form when
   * encoding cache entries by compressing the attribute descriptions
   * and object class sets.
   * <p>
   * Note that compression does not preserve user-supplied
   * capitalization in the object class and attribute type names.
   *
   * @return Returns the "compact-encoding" property definition.
   */
  public BooleanPropertyDefinition getCompactEncodingPropertyDefinition() {
    return PD_COMPACT_ENCODING;
  }



  /**
   * Get the "db-cache-percent" property definition.
   * <p>
   * Specifies the maximum memory usage for the internal JE cache as a
   * percentage of the total JVM memory.
   *
   * @return Returns the "db-cache-percent" property definition.
   */
  public IntegerPropertyDefinition getDBCachePercentPropertyDefinition() {
    return PD_DB_CACHE_PERCENT;
  }



  /**
   * Get the "db-cache-size" property definition.
   * <p>
   * Specifies the maximum JVM memory usage in bytes for the internal
   * JE cache.
   *
   * @return Returns the "db-cache-size" property definition.
   */
  public SizePropertyDefinition getDBCacheSizePropertyDefinition() {
    return PD_DB_CACHE_SIZE;
  }



  /**
   * Get the "enabled" property definition.
   * <p>
   * Indicates whether the File System Entry Cache is enabled.
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
   * provides the File System Entry Cache implementation.
   *
   * @return Returns the "java-class" property definition.
   */
  public ClassPropertyDefinition getJavaClassPropertyDefinition() {
    return PD_JAVA_CLASS;
  }



  /**
   * Get the "je-property" property definition.
   * <p>
   * Specifies the environment properties for the Berkeley DB Java
   * Edition database providing the backend for this entry cache.
   * <p>
   * Any Berkeley DB Java Edition property can be specified using the
   * following form: property-name=property-value. Refer to the OpenDS
   * documentation for further information on related properties, their
   * implications and range values. The definitive identification of
   * all the property parameters available in the example.properties
   * file in the Berkeley DB Java Edition distribution.
   *
   * @return Returns the "je-property" property definition.
   */
  public StringPropertyDefinition getJEPropertyPropertyDefinition() {
    return PD_JE_PROPERTY;
  }



  /**
   * Get the "lock-timeout" property definition.
   * <p>
   * The length of time to wait while attempting to acquire a read or
   * write lock.
   *
   * @return Returns the "lock-timeout" property definition.
   */
  public DurationPropertyDefinition getLockTimeoutPropertyDefinition() {
    return PD_LOCK_TIMEOUT;
  }



  /**
   * Get the "max-entries" property definition.
   * <p>
   * The maximum number of entries allowed in the cache.
   *
   * @return Returns the "max-entries" property definition.
   */
  public IntegerPropertyDefinition getMaxEntriesPropertyDefinition() {
    return PD_MAX_ENTRIES;
  }



  /**
   * Get the "max-memory-size" property definition.
   * <p>
   * The maximum size of the entry cache in bytes.
   *
   * @return Returns the "max-memory-size" property definition.
   */
  public SizePropertyDefinition getMaxMemorySizePropertyDefinition() {
    return PD_MAX_MEMORY_SIZE;
  }



  /**
   * Get the "persistent-cache" property definition.
   * <p>
   * Specifies whether the cache should persist across restarts.
   *
   * @return Returns the "persistent-cache" property definition.
   */
  public BooleanPropertyDefinition getPersistentCachePropertyDefinition() {
    return PD_PERSISTENT_CACHE;
  }



  /**
   * Managed object client implementation.
   */
  private static class FileSystemEntryCacheCfgClientImpl implements
    FileSystemEntryCacheCfgClient {

    // Private implementation.
    private ManagedObject<? extends FileSystemEntryCacheCfgClient> impl;



    // Private constructor.
    private FileSystemEntryCacheCfgClientImpl(
        ManagedObject<? extends FileSystemEntryCacheCfgClient> impl) {
      this.impl = impl;
    }



    /**
     * {@inheritDoc}
     */
    public String getCacheDirectory() {
      return impl.getPropertyValue(INSTANCE.getCacheDirectoryPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setCacheDirectory(String value) {
      impl.setPropertyValue(INSTANCE.getCacheDirectoryPropertyDefinition(), value);
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
    public CacheType getCacheType() {
      return impl.getPropertyValue(INSTANCE.getCacheTypePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setCacheType(CacheType value) {
      impl.setPropertyValue(INSTANCE.getCacheTypePropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public boolean isCompactEncoding() {
      return impl.getPropertyValue(INSTANCE.getCompactEncodingPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setCompactEncoding(Boolean value) {
      impl.setPropertyValue(INSTANCE.getCompactEncodingPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public int getDBCachePercent() {
      return impl.getPropertyValue(INSTANCE.getDBCachePercentPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setDBCachePercent(Integer value) {
      impl.setPropertyValue(INSTANCE.getDBCachePercentPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public long getDBCacheSize() {
      return impl.getPropertyValue(INSTANCE.getDBCacheSizePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setDBCacheSize(Long value) {
      impl.setPropertyValue(INSTANCE.getDBCacheSizePropertyDefinition(), value);
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
    public SortedSet<String> getJEProperty() {
      return impl.getPropertyValues(INSTANCE.getJEPropertyPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setJEProperty(Collection<String> values) {
      impl.setPropertyValues(INSTANCE.getJEPropertyPropertyDefinition(), values);
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
    public long getMaxMemorySize() {
      return impl.getPropertyValue(INSTANCE.getMaxMemorySizePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setMaxMemorySize(Long value) {
      impl.setPropertyValue(INSTANCE.getMaxMemorySizePropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public boolean isPersistentCache() {
      return impl.getPropertyValue(INSTANCE.getPersistentCachePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setPersistentCache(Boolean value) {
      impl.setPropertyValue(INSTANCE.getPersistentCachePropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public ManagedObjectDefinition<? extends FileSystemEntryCacheCfgClient, ? extends FileSystemEntryCacheCfg> definition() {
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
  private static class FileSystemEntryCacheCfgServerImpl implements
    FileSystemEntryCacheCfg {

    // Private implementation.
    private ServerManagedObject<? extends FileSystemEntryCacheCfg> impl;

    // The value of the "cache-directory" property.
    private final String pCacheDirectory;

    // The value of the "cache-level" property.
    private final int pCacheLevel;

    // The value of the "cache-type" property.
    private final CacheType pCacheType;

    // The value of the "compact-encoding" property.
    private final boolean pCompactEncoding;

    // The value of the "db-cache-percent" property.
    private final int pDBCachePercent;

    // The value of the "db-cache-size" property.
    private final long pDBCacheSize;

    // The value of the "enabled" property.
    private final boolean pEnabled;

    // The value of the "exclude-filter" property.
    private final SortedSet<String> pExcludeFilter;

    // The value of the "include-filter" property.
    private final SortedSet<String> pIncludeFilter;

    // The value of the "java-class" property.
    private final String pJavaClass;

    // The value of the "je-property" property.
    private final SortedSet<String> pJEProperty;

    // The value of the "lock-timeout" property.
    private final long pLockTimeout;

    // The value of the "max-entries" property.
    private final int pMaxEntries;

    // The value of the "max-memory-size" property.
    private final long pMaxMemorySize;

    // The value of the "persistent-cache" property.
    private final boolean pPersistentCache;



    // Private constructor.
    private FileSystemEntryCacheCfgServerImpl(ServerManagedObject<? extends FileSystemEntryCacheCfg> impl) {
      this.impl = impl;
      this.pCacheDirectory = impl.getPropertyValue(INSTANCE.getCacheDirectoryPropertyDefinition());
      this.pCacheLevel = impl.getPropertyValue(INSTANCE.getCacheLevelPropertyDefinition());
      this.pCacheType = impl.getPropertyValue(INSTANCE.getCacheTypePropertyDefinition());
      this.pCompactEncoding = impl.getPropertyValue(INSTANCE.getCompactEncodingPropertyDefinition());
      this.pDBCachePercent = impl.getPropertyValue(INSTANCE.getDBCachePercentPropertyDefinition());
      this.pDBCacheSize = impl.getPropertyValue(INSTANCE.getDBCacheSizePropertyDefinition());
      this.pEnabled = impl.getPropertyValue(INSTANCE.getEnabledPropertyDefinition());
      this.pExcludeFilter = impl.getPropertyValues(INSTANCE.getExcludeFilterPropertyDefinition());
      this.pIncludeFilter = impl.getPropertyValues(INSTANCE.getIncludeFilterPropertyDefinition());
      this.pJavaClass = impl.getPropertyValue(INSTANCE.getJavaClassPropertyDefinition());
      this.pJEProperty = impl.getPropertyValues(INSTANCE.getJEPropertyPropertyDefinition());
      this.pLockTimeout = impl.getPropertyValue(INSTANCE.getLockTimeoutPropertyDefinition());
      this.pMaxEntries = impl.getPropertyValue(INSTANCE.getMaxEntriesPropertyDefinition());
      this.pMaxMemorySize = impl.getPropertyValue(INSTANCE.getMaxMemorySizePropertyDefinition());
      this.pPersistentCache = impl.getPropertyValue(INSTANCE.getPersistentCachePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addFileSystemChangeListener(
        ConfigurationChangeListener<FileSystemEntryCacheCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeFileSystemChangeListener(
        ConfigurationChangeListener<FileSystemEntryCacheCfg> listener) {
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
    public String getCacheDirectory() {
      return pCacheDirectory;
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
    public CacheType getCacheType() {
      return pCacheType;
    }



    /**
     * {@inheritDoc}
     */
    public boolean isCompactEncoding() {
      return pCompactEncoding;
    }



    /**
     * {@inheritDoc}
     */
    public int getDBCachePercent() {
      return pDBCachePercent;
    }



    /**
     * {@inheritDoc}
     */
    public long getDBCacheSize() {
      return pDBCacheSize;
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
    public SortedSet<String> getJEProperty() {
      return pJEProperty;
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
    public long getMaxMemorySize() {
      return pMaxMemorySize;
    }



    /**
     * {@inheritDoc}
     */
    public boolean isPersistentCache() {
      return pPersistentCache;
    }



    /**
     * {@inheritDoc}
     */
    public Class<? extends FileSystemEntryCacheCfg> configurationClass() {
      return FileSystemEntryCacheCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
