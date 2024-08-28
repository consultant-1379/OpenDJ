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
import org.opends.server.admin.DefaultManagedObject;
import org.opends.server.admin.DefinedDefaultBehaviorProvider;
import org.opends.server.admin.DefinitionDecodingException;
import org.opends.server.admin.DNPropertyDefinition;
import org.opends.server.admin.DurationPropertyDefinition;
import org.opends.server.admin.EnumPropertyDefinition;
import org.opends.server.admin.InstantiableRelationDefinition;
import org.opends.server.admin.IntegerPropertyDefinition;
import org.opends.server.admin.ManagedObjectAlreadyExistsException;
import org.opends.server.admin.ManagedObjectDefinition;
import org.opends.server.admin.ManagedObjectNotFoundException;
import org.opends.server.admin.PropertyIsReadOnlyException;
import org.opends.server.admin.PropertyOption;
import org.opends.server.admin.PropertyProvider;
import org.opends.server.admin.server.ConfigurationAddListener;
import org.opends.server.admin.server.ConfigurationChangeListener;
import org.opends.server.admin.server.ConfigurationDeleteListener;
import org.opends.server.admin.server.ServerManagedObject;
import org.opends.server.admin.SizePropertyDefinition;
import org.opends.server.admin.std.client.LocalDBBackendCfgClient;
import org.opends.server.admin.std.client.LocalDBIndexCfgClient;
import org.opends.server.admin.std.client.LocalDBVLVIndexCfgClient;
import org.opends.server.admin.std.meta.BackendCfgDefn.WritabilityMode;
import org.opends.server.admin.std.meta.LocalDBIndexCfgDefn;
import org.opends.server.admin.std.server.BackendCfg;
import org.opends.server.admin.std.server.LocalDBBackendCfg;
import org.opends.server.admin.std.server.LocalDBIndexCfg;
import org.opends.server.admin.std.server.LocalDBVLVIndexCfg;
import org.opends.server.admin.StringPropertyDefinition;
import org.opends.server.admin.Tag;
import org.opends.server.admin.UndefinedDefaultBehaviorProvider;
import org.opends.server.config.ConfigException;
import org.opends.server.types.DN;



/**
 * An interface for querying the Local DB Backend managed object
 * definition meta information.
 * <p>
 * The Local DB Backend uses the Berkeley DB Java Edition to store
 * user-provided data in a local repository.
 */
public final class LocalDBBackendCfgDefn extends ManagedObjectDefinition<LocalDBBackendCfgClient, LocalDBBackendCfg> {

  // The singleton configuration definition instance.
  private static final LocalDBBackendCfgDefn INSTANCE = new LocalDBBackendCfgDefn();



  // The "compact-encoding" property definition.
  private static final BooleanPropertyDefinition PD_COMPACT_ENCODING;



  // The "db-cache-percent" property definition.
  private static final IntegerPropertyDefinition PD_DB_CACHE_PERCENT;



  // The "db-cache-size" property definition.
  private static final SizePropertyDefinition PD_DB_CACHE_SIZE;



  // The "db-checkpointer-bytes-interval" property definition.
  private static final SizePropertyDefinition PD_DB_CHECKPOINTER_BYTES_INTERVAL;



  // The "db-checkpointer-wakeup-interval" property definition.
  private static final DurationPropertyDefinition PD_DB_CHECKPOINTER_WAKEUP_INTERVAL;



  // The "db-cleaner-min-utilization" property definition.
  private static final IntegerPropertyDefinition PD_DB_CLEANER_MIN_UTILIZATION;



  // The "db-directory" property definition.
  private static final StringPropertyDefinition PD_DB_DIRECTORY;



  // The "db-directory-permissions" property definition.
  private static final StringPropertyDefinition PD_DB_DIRECTORY_PERMISSIONS;



  // The "db-evictor-core-threads" property definition.
  private static final IntegerPropertyDefinition PD_DB_EVICTOR_CORE_THREADS;



  // The "db-evictor-keep-alive" property definition.
  private static final DurationPropertyDefinition PD_DB_EVICTOR_KEEP_ALIVE;



  // The "db-evictor-lru-only" property definition.
  private static final BooleanPropertyDefinition PD_DB_EVICTOR_LRU_ONLY;



  // The "db-evictor-max-threads" property definition.
  private static final IntegerPropertyDefinition PD_DB_EVICTOR_MAX_THREADS;



  // The "db-evictor-nodes-per-scan" property definition.
  private static final IntegerPropertyDefinition PD_DB_EVICTOR_NODES_PER_SCAN;



  // The "db-log-file-max" property definition.
  private static final SizePropertyDefinition PD_DB_LOG_FILE_MAX;



  // The "db-logging-file-handler-on" property definition.
  private static final BooleanPropertyDefinition PD_DB_LOGGING_FILE_HANDLER_ON;



  // The "db-logging-level" property definition.
  private static final StringPropertyDefinition PD_DB_LOGGING_LEVEL;



  // The "db-num-cleaner-threads" property definition.
  private static final IntegerPropertyDefinition PD_DB_NUM_CLEANER_THREADS;



  // The "db-num-lock-tables" property definition.
  private static final IntegerPropertyDefinition PD_DB_NUM_LOCK_TABLES;



  // The "db-run-cleaner" property definition.
  private static final BooleanPropertyDefinition PD_DB_RUN_CLEANER;



  // The "db-txn-no-sync" property definition.
  private static final BooleanPropertyDefinition PD_DB_TXN_NO_SYNC;



  // The "db-txn-write-no-sync" property definition.
  private static final BooleanPropertyDefinition PD_DB_TXN_WRITE_NO_SYNC;



  // The "disk-full-threshold" property definition.
  private static final SizePropertyDefinition PD_DISK_FULL_THRESHOLD;



  // The "disk-low-threshold" property definition.
  private static final SizePropertyDefinition PD_DISK_LOW_THRESHOLD;



  // The "entries-compressed" property definition.
  private static final BooleanPropertyDefinition PD_ENTRIES_COMPRESSED;



  // The "import-queue-size" property definition.
  private static final IntegerPropertyDefinition PD_IMPORT_QUEUE_SIZE;



  // The "import-thread-count" property definition.
  private static final IntegerPropertyDefinition PD_IMPORT_THREAD_COUNT;



  // The "index-entry-limit" property definition.
  private static final IntegerPropertyDefinition PD_INDEX_ENTRY_LIMIT;



  // The "index-filter-analyzer-enabled" property definition.
  private static final BooleanPropertyDefinition PD_INDEX_FILTER_ANALYZER_ENABLED;



  // The "java-class" property definition.
  private static final ClassPropertyDefinition PD_JAVA_CLASS;



  // The "je-property" property definition.
  private static final StringPropertyDefinition PD_JE_PROPERTY;



  // The "max-entries" property definition.
  private static final IntegerPropertyDefinition PD_MAX_ENTRIES;



  // The "preload-time-limit" property definition.
  private static final DurationPropertyDefinition PD_PRELOAD_TIME_LIMIT;



  // The "writability-mode" property definition.
  private static final EnumPropertyDefinition<WritabilityMode> PD_WRITABILITY_MODE;



  // The "local-db-indexes" relation definition.
  private static final InstantiableRelationDefinition<LocalDBIndexCfgClient, LocalDBIndexCfg> RD_LOCAL_DB_INDEXES;



  // The "local-db-vlv-indexes" relation definition.
  private static final InstantiableRelationDefinition<LocalDBVLVIndexCfgClient, LocalDBVLVIndexCfg> RD_LOCAL_DB_VLV_INDEXES;



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
      DefaultBehaviorProvider<Integer> provider = new DefinedDefaultBehaviorProvider<Integer>("10");
      builder.setDefaultBehaviorProvider(provider);
      builder.setUpperLimit(90);
      builder.setLowerLimit(1);
      PD_DB_CACHE_PERCENT = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_DB_CACHE_PERCENT);
  }



  // Build the "db-cache-size" property definition.
  static {
      SizePropertyDefinition.Builder builder = SizePropertyDefinition.createBuilder(INSTANCE, "db-cache-size");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "db-cache-size"));
      DefaultBehaviorProvider<Long> provider = new DefinedDefaultBehaviorProvider<Long>("0 MB");
      builder.setDefaultBehaviorProvider(provider);
      builder.setLowerLimit("0 MB");
      PD_DB_CACHE_SIZE = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_DB_CACHE_SIZE);
  }



  // Build the "db-checkpointer-bytes-interval" property definition.
  static {
      SizePropertyDefinition.Builder builder = SizePropertyDefinition.createBuilder(INSTANCE, "db-checkpointer-bytes-interval");
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.SERVER_RESTART, INSTANCE, "db-checkpointer-bytes-interval"));
      DefaultBehaviorProvider<Long> provider = new DefinedDefaultBehaviorProvider<Long>("20mb");
      builder.setDefaultBehaviorProvider(provider);
      builder.setUpperLimit("9223372036854775807b");
      builder.setLowerLimit("0b");
      PD_DB_CHECKPOINTER_BYTES_INTERVAL = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_DB_CHECKPOINTER_BYTES_INTERVAL);
  }



  // Build the "db-checkpointer-wakeup-interval" property definition.
  static {
      DurationPropertyDefinition.Builder builder = DurationPropertyDefinition.createBuilder(INSTANCE, "db-checkpointer-wakeup-interval");
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.COMPONENT_RESTART, INSTANCE, "db-checkpointer-wakeup-interval"));
      DefaultBehaviorProvider<Long> provider = new DefinedDefaultBehaviorProvider<Long>("30s");
      builder.setDefaultBehaviorProvider(provider);
      builder.setBaseUnit("s");
      builder.setUpperLimit("4294");
      builder.setLowerLimit("1");
      PD_DB_CHECKPOINTER_WAKEUP_INTERVAL = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_DB_CHECKPOINTER_WAKEUP_INTERVAL);
  }



  // Build the "db-cleaner-min-utilization" property definition.
  static {
      IntegerPropertyDefinition.Builder builder = IntegerPropertyDefinition.createBuilder(INSTANCE, "db-cleaner-min-utilization");
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "db-cleaner-min-utilization"));
      DefaultBehaviorProvider<Integer> provider = new DefinedDefaultBehaviorProvider<Integer>("50");
      builder.setDefaultBehaviorProvider(provider);
      builder.setUpperLimit(90);
      builder.setLowerLimit(0);
      PD_DB_CLEANER_MIN_UTILIZATION = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_DB_CLEANER_MIN_UTILIZATION);
  }



  // Build the "db-directory" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "db-directory");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.COMPONENT_RESTART, INSTANCE, "db-directory"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("db");
      builder.setDefaultBehaviorProvider(provider);
      PD_DB_DIRECTORY = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_DB_DIRECTORY);
  }



  // Build the "db-directory-permissions" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "db-directory-permissions");
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.SERVER_RESTART, INSTANCE, "db-directory-permissions"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("700");
      builder.setDefaultBehaviorProvider(provider);
      builder.setPattern("^7[0-7][0-7]$", "MODE");
      PD_DB_DIRECTORY_PERMISSIONS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_DB_DIRECTORY_PERMISSIONS);
  }



  // Build the "db-evictor-core-threads" property definition.
  static {
      IntegerPropertyDefinition.Builder builder = IntegerPropertyDefinition.createBuilder(INSTANCE, "db-evictor-core-threads");
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "db-evictor-core-threads"));
      DefaultBehaviorProvider<Integer> provider = new DefinedDefaultBehaviorProvider<Integer>("1");
      builder.setDefaultBehaviorProvider(provider);
      builder.setUpperLimit(2147483647);
      builder.setLowerLimit(0);
      PD_DB_EVICTOR_CORE_THREADS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_DB_EVICTOR_CORE_THREADS);
  }



  // Build the "db-evictor-keep-alive" property definition.
  static {
      DurationPropertyDefinition.Builder builder = DurationPropertyDefinition.createBuilder(INSTANCE, "db-evictor-keep-alive");
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "db-evictor-keep-alive"));
      DefaultBehaviorProvider<Long> provider = new DefinedDefaultBehaviorProvider<Long>("600s");
      builder.setDefaultBehaviorProvider(provider);
      builder.setBaseUnit("s");
      builder.setUpperLimit("86400");
      builder.setLowerLimit("1");
      PD_DB_EVICTOR_KEEP_ALIVE = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_DB_EVICTOR_KEEP_ALIVE);
  }



  // Build the "db-evictor-lru-only" property definition.
  static {
      BooleanPropertyDefinition.Builder builder = BooleanPropertyDefinition.createBuilder(INSTANCE, "db-evictor-lru-only");
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.COMPONENT_RESTART, INSTANCE, "db-evictor-lru-only"));
      DefaultBehaviorProvider<Boolean> provider = new DefinedDefaultBehaviorProvider<Boolean>("true");
      builder.setDefaultBehaviorProvider(provider);
      PD_DB_EVICTOR_LRU_ONLY = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_DB_EVICTOR_LRU_ONLY);
  }



  // Build the "db-evictor-max-threads" property definition.
  static {
      IntegerPropertyDefinition.Builder builder = IntegerPropertyDefinition.createBuilder(INSTANCE, "db-evictor-max-threads");
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "db-evictor-max-threads"));
      DefaultBehaviorProvider<Integer> provider = new DefinedDefaultBehaviorProvider<Integer>("10");
      builder.setDefaultBehaviorProvider(provider);
      builder.setUpperLimit(2147483647);
      builder.setLowerLimit(1);
      PD_DB_EVICTOR_MAX_THREADS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_DB_EVICTOR_MAX_THREADS);
  }



  // Build the "db-evictor-nodes-per-scan" property definition.
  static {
      IntegerPropertyDefinition.Builder builder = IntegerPropertyDefinition.createBuilder(INSTANCE, "db-evictor-nodes-per-scan");
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.COMPONENT_RESTART, INSTANCE, "db-evictor-nodes-per-scan"));
      DefaultBehaviorProvider<Integer> provider = new DefinedDefaultBehaviorProvider<Integer>("10");
      builder.setDefaultBehaviorProvider(provider);
      builder.setUpperLimit(1000);
      builder.setLowerLimit(1);
      PD_DB_EVICTOR_NODES_PER_SCAN = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_DB_EVICTOR_NODES_PER_SCAN);
  }



  // Build the "db-log-file-max" property definition.
  static {
      SizePropertyDefinition.Builder builder = SizePropertyDefinition.createBuilder(INSTANCE, "db-log-file-max");
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.COMPONENT_RESTART, INSTANCE, "db-log-file-max"));
      DefaultBehaviorProvider<Long> provider = new DefinedDefaultBehaviorProvider<Long>("10mb");
      builder.setDefaultBehaviorProvider(provider);
      builder.setUpperLimit("4gib");
      builder.setLowerLimit("1mb");
      PD_DB_LOG_FILE_MAX = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_DB_LOG_FILE_MAX);
  }



  // Build the "db-logging-file-handler-on" property definition.
  static {
      BooleanPropertyDefinition.Builder builder = BooleanPropertyDefinition.createBuilder(INSTANCE, "db-logging-file-handler-on");
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.COMPONENT_RESTART, INSTANCE, "db-logging-file-handler-on"));
      DefaultBehaviorProvider<Boolean> provider = new DefinedDefaultBehaviorProvider<Boolean>("true");
      builder.setDefaultBehaviorProvider(provider);
      PD_DB_LOGGING_FILE_HANDLER_ON = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_DB_LOGGING_FILE_HANDLER_ON);
  }



  // Build the "db-logging-level" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "db-logging-level");
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.COMPONENT_RESTART, INSTANCE, "db-logging-level"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("CONFIG");
      builder.setDefaultBehaviorProvider(provider);
      PD_DB_LOGGING_LEVEL = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_DB_LOGGING_LEVEL);
  }



  // Build the "db-num-cleaner-threads" property definition.
  static {
      IntegerPropertyDefinition.Builder builder = IntegerPropertyDefinition.createBuilder(INSTANCE, "db-num-cleaner-threads");
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "db-num-cleaner-threads"));
      builder.setDefaultBehaviorProvider(new AliasDefaultBehaviorProvider<Integer>(INSTANCE, "db-num-cleaner-threads"));
      builder.setLowerLimit(1);
      PD_DB_NUM_CLEANER_THREADS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_DB_NUM_CLEANER_THREADS);
  }



  // Build the "db-num-lock-tables" property definition.
  static {
      IntegerPropertyDefinition.Builder builder = IntegerPropertyDefinition.createBuilder(INSTANCE, "db-num-lock-tables");
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.COMPONENT_RESTART, INSTANCE, "db-num-lock-tables"));
      builder.setDefaultBehaviorProvider(new AliasDefaultBehaviorProvider<Integer>(INSTANCE, "db-num-lock-tables"));
      builder.setUpperLimit(32767);
      builder.setLowerLimit(1);
      PD_DB_NUM_LOCK_TABLES = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_DB_NUM_LOCK_TABLES);
  }



  // Build the "db-run-cleaner" property definition.
  static {
      BooleanPropertyDefinition.Builder builder = BooleanPropertyDefinition.createBuilder(INSTANCE, "db-run-cleaner");
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "db-run-cleaner"));
      DefaultBehaviorProvider<Boolean> provider = new DefinedDefaultBehaviorProvider<Boolean>("true");
      builder.setDefaultBehaviorProvider(provider);
      PD_DB_RUN_CLEANER = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_DB_RUN_CLEANER);
  }



  // Build the "db-txn-no-sync" property definition.
  static {
      BooleanPropertyDefinition.Builder builder = BooleanPropertyDefinition.createBuilder(INSTANCE, "db-txn-no-sync");
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "db-txn-no-sync"));
      DefaultBehaviorProvider<Boolean> provider = new DefinedDefaultBehaviorProvider<Boolean>("false");
      builder.setDefaultBehaviorProvider(provider);
      PD_DB_TXN_NO_SYNC = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_DB_TXN_NO_SYNC);
  }



  // Build the "db-txn-write-no-sync" property definition.
  static {
      BooleanPropertyDefinition.Builder builder = BooleanPropertyDefinition.createBuilder(INSTANCE, "db-txn-write-no-sync");
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "db-txn-write-no-sync"));
      DefaultBehaviorProvider<Boolean> provider = new DefinedDefaultBehaviorProvider<Boolean>("true");
      builder.setDefaultBehaviorProvider(provider);
      PD_DB_TXN_WRITE_NO_SYNC = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_DB_TXN_WRITE_NO_SYNC);
  }



  // Build the "disk-full-threshold" property definition.
  static {
      SizePropertyDefinition.Builder builder = SizePropertyDefinition.createBuilder(INSTANCE, "disk-full-threshold");
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "disk-full-threshold"));
      DefaultBehaviorProvider<Long> provider = new DefinedDefaultBehaviorProvider<Long>("20 megabytes");
      builder.setDefaultBehaviorProvider(provider);
      builder.setLowerLimit("0");
      PD_DISK_FULL_THRESHOLD = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_DISK_FULL_THRESHOLD);
  }



  // Build the "disk-low-threshold" property definition.
  static {
      SizePropertyDefinition.Builder builder = SizePropertyDefinition.createBuilder(INSTANCE, "disk-low-threshold");
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "disk-low-threshold"));
      DefaultBehaviorProvider<Long> provider = new DefinedDefaultBehaviorProvider<Long>("100 megabytes");
      builder.setDefaultBehaviorProvider(provider);
      builder.setLowerLimit("0");
      PD_DISK_LOW_THRESHOLD = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_DISK_LOW_THRESHOLD);
  }



  // Build the "entries-compressed" property definition.
  static {
      BooleanPropertyDefinition.Builder builder = BooleanPropertyDefinition.createBuilder(INSTANCE, "entries-compressed");
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "entries-compressed"));
      DefaultBehaviorProvider<Boolean> provider = new DefinedDefaultBehaviorProvider<Boolean>("false");
      builder.setDefaultBehaviorProvider(provider);
      PD_ENTRIES_COMPRESSED = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_ENTRIES_COMPRESSED);
  }



  // Build the "import-queue-size" property definition.
  static {
      IntegerPropertyDefinition.Builder builder = IntegerPropertyDefinition.createBuilder(INSTANCE, "import-queue-size");
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "import-queue-size"));
      DefaultBehaviorProvider<Integer> provider = new DefinedDefaultBehaviorProvider<Integer>("100");
      builder.setDefaultBehaviorProvider(provider);
      builder.setUpperLimit(2147483647);
      builder.setLowerLimit(1);
      PD_IMPORT_QUEUE_SIZE = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_IMPORT_QUEUE_SIZE);
  }



  // Build the "import-thread-count" property definition.
  static {
      IntegerPropertyDefinition.Builder builder = IntegerPropertyDefinition.createBuilder(INSTANCE, "import-thread-count");
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "import-thread-count"));
      DefaultBehaviorProvider<Integer> provider = new DefinedDefaultBehaviorProvider<Integer>("8");
      builder.setDefaultBehaviorProvider(provider);
      builder.setUpperLimit(2147483647);
      builder.setLowerLimit(1);
      PD_IMPORT_THREAD_COUNT = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_IMPORT_THREAD_COUNT);
  }



  // Build the "index-entry-limit" property definition.
  static {
      IntegerPropertyDefinition.Builder builder = IntegerPropertyDefinition.createBuilder(INSTANCE, "index-entry-limit");
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "index-entry-limit"));
      DefaultBehaviorProvider<Integer> provider = new DefinedDefaultBehaviorProvider<Integer>("4000");
      builder.setDefaultBehaviorProvider(provider);
      builder.setUpperLimit(2147483647);
      builder.setLowerLimit(0);
      PD_INDEX_ENTRY_LIMIT = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_INDEX_ENTRY_LIMIT);
  }



  // Build the "index-filter-analyzer-enabled" property definition.
  static {
      BooleanPropertyDefinition.Builder builder = BooleanPropertyDefinition.createBuilder(INSTANCE, "index-filter-analyzer-enabled");
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "index-filter-analyzer-enabled"));
      DefaultBehaviorProvider<Boolean> provider = new DefinedDefaultBehaviorProvider<Boolean>("false");
      builder.setDefaultBehaviorProvider(provider);
      PD_INDEX_FILTER_ANALYZER_ENABLED = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_INDEX_FILTER_ANALYZER_ENABLED);
  }



  // Build the "java-class" property definition.
  static {
      ClassPropertyDefinition.Builder builder = ClassPropertyDefinition.createBuilder(INSTANCE, "java-class");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.COMPONENT_RESTART, INSTANCE, "java-class"));
      DefaultBehaviorProvider<String> provider = new DefinedDefaultBehaviorProvider<String>("org.opends.server.backends.jeb.BackendImpl");
      builder.setDefaultBehaviorProvider(provider);
      builder.addInstanceOf("org.opends.server.api.Backend");
      PD_JAVA_CLASS = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_JAVA_CLASS);
  }



  // Build the "je-property" property definition.
  static {
      StringPropertyDefinition.Builder builder = StringPropertyDefinition.createBuilder(INSTANCE, "je-property");
      builder.setOption(PropertyOption.MULTI_VALUED);
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "je-property"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<String>());
      PD_JE_PROPERTY = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_JE_PROPERTY);
  }



  // Build the "max-entries" property definition.
  static {
      IntegerPropertyDefinition.Builder builder = IntegerPropertyDefinition.createBuilder(INSTANCE, "max-entries");
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "max-entries"));
      DefaultBehaviorProvider<Integer> provider = new DefinedDefaultBehaviorProvider<Integer>("25");
      builder.setDefaultBehaviorProvider(provider);
      builder.setLowerLimit(1);
      PD_MAX_ENTRIES = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_MAX_ENTRIES);
  }



  // Build the "preload-time-limit" property definition.
  static {
      DurationPropertyDefinition.Builder builder = DurationPropertyDefinition.createBuilder(INSTANCE, "preload-time-limit");
      builder.setOption(PropertyOption.ADVANCED);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "preload-time-limit"));
      DefaultBehaviorProvider<Long> provider = new DefinedDefaultBehaviorProvider<Long>("0s");
      builder.setDefaultBehaviorProvider(provider);
      builder.setBaseUnit("ms");
      builder.setUpperLimit("2147483647");
      builder.setLowerLimit("0");
      PD_PRELOAD_TIME_LIMIT = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_PRELOAD_TIME_LIMIT);
  }



  // Build the "writability-mode" property definition.
  static {
      EnumPropertyDefinition.Builder<WritabilityMode> builder = EnumPropertyDefinition.createBuilder(INSTANCE, "writability-mode");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "writability-mode"));
      DefaultBehaviorProvider<WritabilityMode> provider = new DefinedDefaultBehaviorProvider<WritabilityMode>("enabled");
      builder.setDefaultBehaviorProvider(provider);
      builder.setEnumClass(WritabilityMode.class);
      PD_WRITABILITY_MODE = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_WRITABILITY_MODE);
  }



  // Build the "local-db-indexes" relation definition.
  static {
    InstantiableRelationDefinition.Builder<LocalDBIndexCfgClient, LocalDBIndexCfg> builder =
      new InstantiableRelationDefinition.Builder<LocalDBIndexCfgClient, LocalDBIndexCfg>(INSTANCE, "local-db-index", "local-db-indexes", LocalDBIndexCfgDefn.getInstance());
    builder.setNamingProperty(LocalDBIndexCfgDefn.getInstance().getAttributePropertyDefinition());
    {
      DefaultManagedObject.Builder<LocalDBIndexCfgClient, LocalDBIndexCfg> dmoBuilder = new DefaultManagedObject.Builder<LocalDBIndexCfgClient, LocalDBIndexCfg>(LocalDBIndexCfgDefn.getInstance());
      dmoBuilder.setPropertyValues("index-type", "presence");
      dmoBuilder.setPropertyValues("attribute", "aci");
      builder.setDefaultManagedObject("aci", dmoBuilder.getInstance());
    }
    {
      DefaultManagedObject.Builder<LocalDBIndexCfgClient, LocalDBIndexCfg> dmoBuilder = new DefaultManagedObject.Builder<LocalDBIndexCfgClient, LocalDBIndexCfg>(LocalDBIndexCfgDefn.getInstance());
      dmoBuilder.setPropertyValues("index-type", "equality");
      dmoBuilder.setPropertyValues("attribute", "entryUUID");
      builder.setDefaultManagedObject("entryUUID", dmoBuilder.getInstance());
    }
    {
      DefaultManagedObject.Builder<LocalDBIndexCfgClient, LocalDBIndexCfg> dmoBuilder = new DefaultManagedObject.Builder<LocalDBIndexCfgClient, LocalDBIndexCfg>(LocalDBIndexCfgDefn.getInstance());
      dmoBuilder.setPropertyValues("index-type", "equality");
      dmoBuilder.setPropertyValues("attribute", "objectClass");
      builder.setDefaultManagedObject("objectClass", dmoBuilder.getInstance());
    }
    {
      DefaultManagedObject.Builder<LocalDBIndexCfgClient, LocalDBIndexCfg> dmoBuilder = new DefaultManagedObject.Builder<LocalDBIndexCfgClient, LocalDBIndexCfg>(LocalDBIndexCfgDefn.getInstance());
      dmoBuilder.setPropertyValues("index-type", "ordering");
      dmoBuilder.setPropertyValues("attribute", "ds-sync-hist");
      builder.setDefaultManagedObject("ds-sync-hist", dmoBuilder.getInstance());
    }
    {
      DefaultManagedObject.Builder<LocalDBIndexCfgClient, LocalDBIndexCfg> dmoBuilder = new DefaultManagedObject.Builder<LocalDBIndexCfgClient, LocalDBIndexCfg>(LocalDBIndexCfgDefn.getInstance());
      dmoBuilder.setPropertyValues("index-type", "equality");
      dmoBuilder.setPropertyValues("attribute", "ds-sync-conflict");
      builder.setDefaultManagedObject("ds-sync-conflict", dmoBuilder.getInstance());
    }
    RD_LOCAL_DB_INDEXES = builder.getInstance();
    INSTANCE.registerRelationDefinition(RD_LOCAL_DB_INDEXES);
  }



  // Build the "local-db-vlv-indexes" relation definition.
  static {
    InstantiableRelationDefinition.Builder<LocalDBVLVIndexCfgClient, LocalDBVLVIndexCfg> builder =
      new InstantiableRelationDefinition.Builder<LocalDBVLVIndexCfgClient, LocalDBVLVIndexCfg>(INSTANCE, "local-db-vlv-index", "local-db-vlv-indexes", LocalDBVLVIndexCfgDefn.getInstance());
    builder.setNamingProperty(LocalDBVLVIndexCfgDefn.getInstance().getNamePropertyDefinition());
    RD_LOCAL_DB_VLV_INDEXES = builder.getInstance();
    INSTANCE.registerRelationDefinition(RD_LOCAL_DB_VLV_INDEXES);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("database"));
  }



  /**
   * Get the Local DB Backend configuration definition singleton.
   *
   * @return Returns the Local DB Backend configuration definition
   *         singleton.
   */
  public static LocalDBBackendCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private LocalDBBackendCfgDefn() {
    super("local-db-backend", BackendCfgDefn.getInstance());
  }



  /**
   * {@inheritDoc}
   */
  public LocalDBBackendCfgClient createClientConfiguration(
      ManagedObject<? extends LocalDBBackendCfgClient> impl) {
    return new LocalDBBackendCfgClientImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public LocalDBBackendCfg createServerConfiguration(
      ServerManagedObject<? extends LocalDBBackendCfg> impl) {
    return new LocalDBBackendCfgServerImpl(impl);
  }



  /**
   * {@inheritDoc}
   */
  public Class<LocalDBBackendCfg> getServerConfigurationClass() {
    return LocalDBBackendCfg.class;
  }



  /**
   * Get the "backend-id" property definition.
   * <p>
   * Specifies a name to identify the associated backend.
   * <p>
   * The name must be unique among all backends in the server. The
   * backend ID may not be altered after the backend is created in the
   * server.
   *
   * @return Returns the "backend-id" property definition.
   */
  public StringPropertyDefinition getBackendIdPropertyDefinition() {
    return BackendCfgDefn.getInstance().getBackendIdPropertyDefinition();
  }



  /**
   * Get the "base-dn" property definition.
   * <p>
   * Specifies the base DN(s) for the data that the backend handles.
   * <p>
   * A single backend may be responsible for one or more base DNs.
   * Note that no two backends may have the same base DN although one
   * backend may have a base DN that is below a base DN provided by
   * another backend (similar to the use of sub-suffixes in the Sun
   * Java System Directory Server). If any of the base DNs is
   * subordinate to a base DN for another backend, then all base DNs
   * for that backend must be subordinate to that same base DN.
   *
   * @return Returns the "base-dn" property definition.
   */
  public DNPropertyDefinition getBaseDNPropertyDefinition() {
    return BackendCfgDefn.getInstance().getBaseDNPropertyDefinition();
  }



  /**
   * Get the "compact-encoding" property definition.
   * <p>
   * Indicates whether the backend should use a compact form when
   * encoding entries by compressing the attribute descriptions and
   * object class sets.
   * <p>
   * Note that this property applies only to the entries themselves
   * and does not impact the index data.
   *
   * @return Returns the "compact-encoding" property definition.
   */
  public BooleanPropertyDefinition getCompactEncodingPropertyDefinition() {
    return PD_COMPACT_ENCODING;
  }



  /**
   * Get the "db-cache-percent" property definition.
   * <p>
   * Specifies the percentage of JVM memory to allocate to the
   * database cache.
   * <p>
   * Specifies the percentage of memory available to the JVM that
   * should be used for caching database contents. Note that this is
   * only used if the value of the db-cache-size property is set to "0
   * MB". Otherwise, the value of that property is used instead to
   * control the cache size configuration.
   *
   * @return Returns the "db-cache-percent" property definition.
   */
  public IntegerPropertyDefinition getDBCachePercentPropertyDefinition() {
    return PD_DB_CACHE_PERCENT;
  }



  /**
   * Get the "db-cache-size" property definition.
   * <p>
   * The amount of JVM memory to allocate to the database cache.
   * <p>
   * Specifies the amount of memory that should be used for caching
   * database contents. A value of "0 MB" indicates that the
   * db-cache-percent property should be used instead to specify the
   * cache size.
   *
   * @return Returns the "db-cache-size" property definition.
   */
  public SizePropertyDefinition getDBCacheSizePropertyDefinition() {
    return PD_DB_CACHE_SIZE;
  }



  /**
   * Get the "db-checkpointer-bytes-interval" property definition.
   * <p>
   * Specifies the maximum number of bytes that may be written to the
   * database before it is forced to perform a checkpoint.
   * <p>
   * This can be used to bound the recovery time that may be required
   * if the database environment is opened without having been properly
   * closed. If this property is set to a non-zero value, the
   * checkpointer wakeup interval is not used. To use time-based
   * checkpointing, set this property to zero.
   *
   * @return Returns the "db-checkpointer-bytes-interval" property definition.
   */
  public SizePropertyDefinition getDBCheckpointerBytesIntervalPropertyDefinition() {
    return PD_DB_CHECKPOINTER_BYTES_INTERVAL;
  }



  /**
   * Get the "db-checkpointer-wakeup-interval" property definition.
   * <p>
   * Specifies the maximum length of time that may pass between
   * checkpoints.
   * <p>
   * Note that this is only used if the value of the checkpointer
   * bytes interval is zero.
   *
   * @return Returns the "db-checkpointer-wakeup-interval" property definition.
   */
  public DurationPropertyDefinition getDBCheckpointerWakeupIntervalPropertyDefinition() {
    return PD_DB_CHECKPOINTER_WAKEUP_INTERVAL;
  }



  /**
   * Get the "db-cleaner-min-utilization" property definition.
   * <p>
   * Specifies the minimum percentage of "live" data that the database
   * cleaner attempts to keep in database log files.
   * <p>
   * If the amount of live data in any database log file drops below
   * this percentage, then the cleaner moves the remaining live data in
   * that file to the end of the database and deletes the original file
   * in order to keep the database relatively compact.
   *
   * @return Returns the "db-cleaner-min-utilization" property definition.
   */
  public IntegerPropertyDefinition getDBCleanerMinUtilizationPropertyDefinition() {
    return PD_DB_CLEANER_MIN_UTILIZATION;
  }



  /**
   * Get the "db-directory" property definition.
   * <p>
   * Specifies the path to the filesystem directory that is used to
   * hold the Berkeley DB Java Edition database files containing the
   * data for this backend.
   * <p>
   * The path may be either an absolute path or a path relative to the
   * directory containing the base of the OpenDS Directory Server
   * installation. The path may be any valid directory path in which
   * the server has appropriate permissions to read and write files and
   * has sufficient space to hold the database contents.
   *
   * @return Returns the "db-directory" property definition.
   */
  public StringPropertyDefinition getDBDirectoryPropertyDefinition() {
    return PD_DB_DIRECTORY;
  }



  /**
   * Get the "db-directory-permissions" property definition.
   * <p>
   * Specifies the permissions that should be applied to the directory
   * containing the server database files.
   * <p>
   * They should be expressed as three-digit octal values, which is
   * the traditional representation for UNIX file permissions. The
   * three digits represent the permissions that are available for the
   * directory's owner, group members, and other users (in that order),
   * and each digit is the octal representation of the read, write, and
   * execute bits. Note that this only impacts permissions on the
   * database directory and not on the files written into that
   * directory. On UNIX systems, the user's umask controls permissions
   * given to the database files.
   *
   * @return Returns the "db-directory-permissions" property definition.
   */
  public StringPropertyDefinition getDBDirectoryPermissionsPropertyDefinition() {
    return PD_DB_DIRECTORY_PERMISSIONS;
  }



  /**
   * Get the "db-evictor-core-threads" property definition.
   * <p>
   * Specifies the core number of threads in the eviction thread pool.
   * <p>
   * Specifies the core number of threads in the eviction thread pool.
   * These threads help keep memory usage within cache bounds,
   * offloading work from application threads. db-evictor-core-threads,
   * db-evictor-max-threads and db-evictor-keep-alive are used to
   * configure the core, max and keepalive attributes for the eviction
   * thread pool.
   *
   * @return Returns the "db-evictor-core-threads" property definition.
   */
  public IntegerPropertyDefinition getDBEvictorCoreThreadsPropertyDefinition() {
    return PD_DB_EVICTOR_CORE_THREADS;
  }



  /**
   * Get the "db-evictor-keep-alive" property definition.
   * <p>
   * The duration that excess threads in the eviction thread pool will
   * stay idle. After this period, idle threads will terminate.
   * <p>
   * The duration that excess threads in the eviction thread pool will
   * stay idle. After this period, idle threads will terminate.
   * db-evictor-core-threads, db-evictor-max-threads and
   * db-evictor-keep-alive are used to configure the core, max and
   * keepalive attributes for the eviction thread pool.
   *
   * @return Returns the "db-evictor-keep-alive" property definition.
   */
  public DurationPropertyDefinition getDBEvictorKeepAlivePropertyDefinition() {
    return PD_DB_EVICTOR_KEEP_ALIVE;
  }



  /**
   * Get the "db-evictor-lru-only" property definition.
   * <p>
   * Indicates whether the database should evict existing data from
   * the cache based on an LRU policy (where the least recently used
   * information will be evicted first).
   * <p>
   * If set to "false", then the eviction keeps internal nodes of the
   * underlying Btree in the cache over leaf nodes, even if the leaf
   * nodes have been accessed more recently. This may be a better
   * configuration for databases in which only a very small portion of
   * the data is cached.
   *
   * @return Returns the "db-evictor-lru-only" property definition.
   */
  public BooleanPropertyDefinition getDBEvictorLruOnlyPropertyDefinition() {
    return PD_DB_EVICTOR_LRU_ONLY;
  }



  /**
   * Get the "db-evictor-max-threads" property definition.
   * <p>
   * Specifies the maximum number of threads in the eviction thread
   * pool.
   * <p>
   * Specifies the maximum number of threads in the eviction thread
   * pool. These threads help keep memory usage within cache bounds,
   * offloading work from application threads. db-evictor-core-threads,
   * db-evictor-max-threads and db-evictor-keep-alive are used to
   * configure the core, max and keepalive attributes for the eviction
   * thread pool.
   *
   * @return Returns the "db-evictor-max-threads" property definition.
   */
  public IntegerPropertyDefinition getDBEvictorMaxThreadsPropertyDefinition() {
    return PD_DB_EVICTOR_MAX_THREADS;
  }



  /**
   * Get the "db-evictor-nodes-per-scan" property definition.
   * <p>
   * Specifies the number of Btree nodes that should be evicted from
   * the cache in a single pass if it is determined that it is
   * necessary to free existing data in order to make room for new
   * information.
   * <p>
   * Changes to this property do not take effect until the backend is
   * restarted. It is recommended that you also change this property
   * when you set db-evictor-lru-only to false. This setting controls
   * the number of Btree nodes that are considered, or sampled, each
   * time a node is evicted. A setting of 100 often produces good
   * results, but this may vary from application to application. The
   * larger the nodes per scan, the more accurate the algorithm.
   * However, setting it too high is detrimental; the need to consider
   * larger numbers of nodes for each eviction may delay the completion
   * of a given database operation, which will impact the response time
   * of the application thread.
   *
   * @return Returns the "db-evictor-nodes-per-scan" property definition.
   */
  public IntegerPropertyDefinition getDBEvictorNodesPerScanPropertyDefinition() {
    return PD_DB_EVICTOR_NODES_PER_SCAN;
  }



  /**
   * Get the "db-log-file-max" property definition.
   * <p>
   * Specifies the maximum size for a database log file.
   *
   * @return Returns the "db-log-file-max" property definition.
   */
  public SizePropertyDefinition getDBLogFileMaxPropertyDefinition() {
    return PD_DB_LOG_FILE_MAX;
  }



  /**
   * Get the "db-logging-file-handler-on" property definition.
   * <p>
   * Indicates whether the database should maintain a je.info file in
   * the same directory as the database log directory.
   * <p>
   * This file contains information about the internal processing
   * performed by the underlying database.
   *
   * @return Returns the "db-logging-file-handler-on" property definition.
   */
  public BooleanPropertyDefinition getDBLoggingFileHandlerOnPropertyDefinition() {
    return PD_DB_LOGGING_FILE_HANDLER_ON;
  }



  /**
   * Get the "db-logging-level" property definition.
   * <p>
   * Specifies the log level that should be used by the database when
   * it is writing information into the je.info file.
   * <p>
   * The database trace logging level is (in increasing order of
   * verbosity) chosen from: OFF, SEVERE, WARNING, INFO, CONFIG, FINE,
   * FINER, FINEST, ALL.
   *
   * @return Returns the "db-logging-level" property definition.
   */
  public StringPropertyDefinition getDBLoggingLevelPropertyDefinition() {
    return PD_DB_LOGGING_LEVEL;
  }



  /**
   * Get the "db-num-cleaner-threads" property definition.
   * <p>
   * Specifies the number of threads that the backend should maintain
   * to keep the database log files at or near the desired utilization.
   * <p>
   * In environments with high write throughput, multiple cleaner
   * threads may be required to maintain the desired utilization.
   *
   * @return Returns the "db-num-cleaner-threads" property definition.
   */
  public IntegerPropertyDefinition getDBNumCleanerThreadsPropertyDefinition() {
    return PD_DB_NUM_CLEANER_THREADS;
  }



  /**
   * Get the "db-num-lock-tables" property definition.
   * <p>
   * Specifies the number of lock tables that are used by the
   * underlying database.
   * <p>
   * This can be particularly important to help improve scalability by
   * avoiding contention on systems with large numbers of CPUs. The
   * value of this configuration property should be set to a prime
   * number that is less than or equal to the number of worker threads
   * configured for use in the server.
   *
   * @return Returns the "db-num-lock-tables" property definition.
   */
  public IntegerPropertyDefinition getDBNumLockTablesPropertyDefinition() {
    return PD_DB_NUM_LOCK_TABLES;
  }



  /**
   * Get the "db-run-cleaner" property definition.
   * <p>
   * Indicates whether the database cleaner threads should be enabled.
   * <p>
   * The cleaner threads are used to periodically compact the database
   * by identifying database files with a low (that is, less than the
   * amount specified by the db-cleaner-min-utilization property)
   * percentage of live data, moving the remaining live data to the end
   * of the log and deleting that file.
   *
   * @return Returns the "db-run-cleaner" property definition.
   */
  public BooleanPropertyDefinition getDBRunCleanerPropertyDefinition() {
    return PD_DB_RUN_CLEANER;
  }



  /**
   * Get the "db-txn-no-sync" property definition.
   * <p>
   * Indicates whether database writes should be primarily written to
   * an internal buffer but not immediately written to disk.
   * <p>
   * Setting the value of this configuration attribute to "true" may
   * improve write performance but could cause the most recent changes
   * to be lost if the OpenDS Directory Server or the underlying JVM
   * exits abnormally, or if an OS or hardware failure occurs (a
   * behavior similar to running with transaction durability disabled
   * in the Sun Java System Directory Server).
   *
   * @return Returns the "db-txn-no-sync" property definition.
   */
  public BooleanPropertyDefinition getDBTxnNoSyncPropertyDefinition() {
    return PD_DB_TXN_NO_SYNC;
  }



  /**
   * Get the "db-txn-write-no-sync" property definition.
   * <p>
   * Indicates whether the database should synchronously flush data as
   * it is written to disk.
   * <p>
   * If this value is set to "false", then all data written to disk is
   * synchronously flushed to persistent storage and thereby providing
   * full durability. If it is set to "true", then data may be cached
   * for a period of time by the underlying operating system before
   * actually being written to disk. This may improve performance, but
   * could cause the most recent changes to be lost in the event of an
   * underlying OS or hardware failure (but not in the case that the
   * OpenDS Directory Server or the JVM exits abnormally).
   *
   * @return Returns the "db-txn-write-no-sync" property definition.
   */
  public BooleanPropertyDefinition getDBTxnWriteNoSyncPropertyDefinition() {
    return PD_DB_TXN_WRITE_NO_SYNC;
  }



  /**
   * Get the "disk-full-threshold" property definition.
   * <p>
   * Full disk threshold to limit database updates
   * <p>
   * When the available free space on the disk used by this database
   * instance falls below the value specified, no updates are permitted
   * and the server returns an UNWILLING_TO_PERFORM error. Updates are
   * allowed again as soon as free space rises above the threshold.
   *
   * @return Returns the "disk-full-threshold" property definition.
   */
  public SizePropertyDefinition getDiskFullThresholdPropertyDefinition() {
    return PD_DISK_FULL_THRESHOLD;
  }



  /**
   * Get the "disk-low-threshold" property definition.
   * <p>
   * Low disk threshold to limit database updates
   * <p>
   * Specifies the "low" free space on the disk. When the available
   * free space on the disk used by this database instance falls below
   * the value specified, protocol updates on this database are
   * permitted only by a user with the BYPASS_LOCKDOWN privilege.
   *
   * @return Returns the "disk-low-threshold" property definition.
   */
  public SizePropertyDefinition getDiskLowThresholdPropertyDefinition() {
    return PD_DISK_LOW_THRESHOLD;
  }



  /**
   * Get the "enabled" property definition.
   * <p>
   * Indicates whether the backend is enabled in the server.
   * <p>
   * If a backend is not enabled, then its contents are not accessible
   * when processing operations.
   *
   * @return Returns the "enabled" property definition.
   */
  public BooleanPropertyDefinition getEnabledPropertyDefinition() {
    return BackendCfgDefn.getInstance().getEnabledPropertyDefinition();
  }



  /**
   * Get the "entries-compressed" property definition.
   * <p>
   * Indicates whether the backend should attempt to compress entries
   * before storing them in the database.
   * <p>
   * Note that this property applies only to the entries themselves
   * and does not impact the index data. Further, the effectiveness of
   * the compression is based on the type of data contained in the
   * entry.
   *
   * @return Returns the "entries-compressed" property definition.
   */
  public BooleanPropertyDefinition getEntriesCompressedPropertyDefinition() {
    return PD_ENTRIES_COMPRESSED;
  }



  /**
   * Get the "import-queue-size" property definition.
   * <p>
   * This parameter has been deprecated in OpenDS 2.1 and will be
   * removed in OpenDS 3.0. It is only being kept for migration ease
   * and is ignored in OpenDS versions after 2.0.
   *
   * @return Returns the "import-queue-size" property definition.
   */
  public IntegerPropertyDefinition getImportQueueSizePropertyDefinition() {
    return PD_IMPORT_QUEUE_SIZE;
  }



  /**
   * Get the "import-thread-count" property definition.
   * <p>
   * This parameter has been deprecated in OpenDS 2.1 and will be
   * removed in OpenDS 3.0. It is only being kept for migration ease
   * and is ignored in OpenDS versions after 2.0.
   * <p>
   * This parameter has been deprecated in OpenDS 2.1 and will be
   * removed in OpenDS 3.0. It is only being kept for migration ease
   * and is ignored in OpenDS versions after 2.0.
   *
   * @return Returns the "import-thread-count" property definition.
   */
  public IntegerPropertyDefinition getImportThreadCountPropertyDefinition() {
    return PD_IMPORT_THREAD_COUNT;
  }



  /**
   * Get the "index-entry-limit" property definition.
   * <p>
   * Specifies the maximum number of entries that is allowed to match
   * a given index key before that particular index key is no longer
   * maintained.
   * <p>
   * This property is analogous to the ALL IDs threshold in the Sun
   * Java System Directory Server. Note that this is the default limit
   * for the backend, and it may be overridden on a per-attribute
   * basis.A value of 0 means there is no limit.
   *
   * @return Returns the "index-entry-limit" property definition.
   */
  public IntegerPropertyDefinition getIndexEntryLimitPropertyDefinition() {
    return PD_INDEX_ENTRY_LIMIT;
  }



  /**
   * Get the "index-filter-analyzer-enabled" property definition.
   * <p>
   * Indicates whether to gather statistical information about the
   * search filters processed by the Directory Server while evaluating
   * the usage of indexes.
   * <p>
   * Analyzing indexes requires gathering search filter usage patterns
   * from user requests, especially for values as specified in the
   * filters and subsequently looking the status of those values into
   * the index files. When a search requests is processed, internal or
   * user generated, a first phase uses indexes to find potential
   * entries to be returned. Depending on the search filter, if the
   * index of one of the specified attributes matches too many entries
   * (exceeds the index entry limit), the search becomes non-indexed.
   * In any case, all entries thus gathered (or the entire DIT) are
   * matched against the filter for actually returning the search
   * result.
   *
   * @return Returns the "index-filter-analyzer-enabled" property definition.
   */
  public BooleanPropertyDefinition getIndexFilterAnalyzerEnabledPropertyDefinition() {
    return PD_INDEX_FILTER_ANALYZER_ENABLED;
  }



  /**
   * Get the "java-class" property definition.
   * <p>
   * Specifies the fully-qualified name of the Java class that
   * provides the backend implementation.
   *
   * @return Returns the "java-class" property definition.
   */
  public ClassPropertyDefinition getJavaClassPropertyDefinition() {
    return PD_JAVA_CLASS;
  }



  /**
   * Get the "je-property" property definition.
   * <p>
   * Specifies the database and environment properties for the
   * Berkeley DB Java Edition database serving the data for this
   * backend.
   * <p>
   * Any Berkeley DB Java Edition property can be specified using the
   * following form: property-name=property-value. Refer to OpenDS
   * documentation for further information on related properties, their
   * implications, and range values. The definitive identification of
   * all the property parameters is available in the example.properties
   * file of Berkeley DB Java Edition distribution.
   *
   * @return Returns the "je-property" property definition.
   */
  public StringPropertyDefinition getJEPropertyPropertyDefinition() {
    return PD_JE_PROPERTY;
  }



  /**
   * Get the "max-entries" property definition.
   * <p>
   * The maximum number of search filter statistics to keep.
   * <p>
   * When the maximum number of search filter is reached, the least
   * used one will be deleted.
   *
   * @return Returns the "max-entries" property definition.
   */
  public IntegerPropertyDefinition getMaxEntriesPropertyDefinition() {
    return PD_MAX_ENTRIES;
  }



  /**
   * Get the "preload-time-limit" property definition.
   * <p>
   * Specifies the length of time that the backend is allowed to spend
   * "pre-loading" data when it is initialized.
   * <p>
   * The pre-load process is used to pre-populate the database cache,
   * so that it can be more quickly available when the server is
   * processing requests. A duration of zero means there is no
   * pre-load.
   *
   * @return Returns the "preload-time-limit" property definition.
   */
  public DurationPropertyDefinition getPreloadTimeLimitPropertyDefinition() {
    return PD_PRELOAD_TIME_LIMIT;
  }



  /**
   * Get the "writability-mode" property definition.
   * <p>
   * Specifies the behavior that the backend should use when
   * processing write operations.
   *
   * @return Returns the "writability-mode" property definition.
   */
  public EnumPropertyDefinition<WritabilityMode> getWritabilityModePropertyDefinition() {
    return PD_WRITABILITY_MODE;
  }



  /**
   * Get the "local-db-indexes" relation definition.
   *
   * @return Returns the "local-db-indexes" relation definition.
   */
  public InstantiableRelationDefinition<LocalDBIndexCfgClient,LocalDBIndexCfg> getLocalDBIndexesRelationDefinition() {
    return RD_LOCAL_DB_INDEXES;
  }



  /**
   * Get the "local-db-vlv-indexes" relation definition.
   *
   * @return Returns the "local-db-vlv-indexes" relation definition.
   */
  public InstantiableRelationDefinition<LocalDBVLVIndexCfgClient,LocalDBVLVIndexCfg> getLocalDBVLVIndexesRelationDefinition() {
    return RD_LOCAL_DB_VLV_INDEXES;
  }



  /**
   * Managed object client implementation.
   */
  private static class LocalDBBackendCfgClientImpl implements
    LocalDBBackendCfgClient {

    // Private implementation.
    private ManagedObject<? extends LocalDBBackendCfgClient> impl;



    // Private constructor.
    private LocalDBBackendCfgClientImpl(
        ManagedObject<? extends LocalDBBackendCfgClient> impl) {
      this.impl = impl;
    }



    /**
     * {@inheritDoc}
     */
    public String getBackendId() {
      return impl.getPropertyValue(INSTANCE.getBackendIdPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setBackendId(String value) throws PropertyIsReadOnlyException {
      impl.setPropertyValue(INSTANCE.getBackendIdPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<DN> getBaseDN() {
      return impl.getPropertyValues(INSTANCE.getBaseDNPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setBaseDN(Collection<DN> values) {
      impl.setPropertyValues(INSTANCE.getBaseDNPropertyDefinition(), values);
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
    public long getDBCheckpointerBytesInterval() {
      return impl.getPropertyValue(INSTANCE.getDBCheckpointerBytesIntervalPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setDBCheckpointerBytesInterval(Long value) {
      impl.setPropertyValue(INSTANCE.getDBCheckpointerBytesIntervalPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public long getDBCheckpointerWakeupInterval() {
      return impl.getPropertyValue(INSTANCE.getDBCheckpointerWakeupIntervalPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setDBCheckpointerWakeupInterval(Long value) {
      impl.setPropertyValue(INSTANCE.getDBCheckpointerWakeupIntervalPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public int getDBCleanerMinUtilization() {
      return impl.getPropertyValue(INSTANCE.getDBCleanerMinUtilizationPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setDBCleanerMinUtilization(Integer value) {
      impl.setPropertyValue(INSTANCE.getDBCleanerMinUtilizationPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public String getDBDirectory() {
      return impl.getPropertyValue(INSTANCE.getDBDirectoryPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setDBDirectory(String value) {
      impl.setPropertyValue(INSTANCE.getDBDirectoryPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public String getDBDirectoryPermissions() {
      return impl.getPropertyValue(INSTANCE.getDBDirectoryPermissionsPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setDBDirectoryPermissions(String value) {
      impl.setPropertyValue(INSTANCE.getDBDirectoryPermissionsPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public int getDBEvictorCoreThreads() {
      return impl.getPropertyValue(INSTANCE.getDBEvictorCoreThreadsPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setDBEvictorCoreThreads(Integer value) {
      impl.setPropertyValue(INSTANCE.getDBEvictorCoreThreadsPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public long getDBEvictorKeepAlive() {
      return impl.getPropertyValue(INSTANCE.getDBEvictorKeepAlivePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setDBEvictorKeepAlive(Long value) {
      impl.setPropertyValue(INSTANCE.getDBEvictorKeepAlivePropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public boolean isDBEvictorLruOnly() {
      return impl.getPropertyValue(INSTANCE.getDBEvictorLruOnlyPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setDBEvictorLruOnly(Boolean value) {
      impl.setPropertyValue(INSTANCE.getDBEvictorLruOnlyPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public int getDBEvictorMaxThreads() {
      return impl.getPropertyValue(INSTANCE.getDBEvictorMaxThreadsPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setDBEvictorMaxThreads(Integer value) {
      impl.setPropertyValue(INSTANCE.getDBEvictorMaxThreadsPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public int getDBEvictorNodesPerScan() {
      return impl.getPropertyValue(INSTANCE.getDBEvictorNodesPerScanPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setDBEvictorNodesPerScan(Integer value) {
      impl.setPropertyValue(INSTANCE.getDBEvictorNodesPerScanPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public long getDBLogFileMax() {
      return impl.getPropertyValue(INSTANCE.getDBLogFileMaxPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setDBLogFileMax(Long value) {
      impl.setPropertyValue(INSTANCE.getDBLogFileMaxPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public boolean isDBLoggingFileHandlerOn() {
      return impl.getPropertyValue(INSTANCE.getDBLoggingFileHandlerOnPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setDBLoggingFileHandlerOn(Boolean value) {
      impl.setPropertyValue(INSTANCE.getDBLoggingFileHandlerOnPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public String getDBLoggingLevel() {
      return impl.getPropertyValue(INSTANCE.getDBLoggingLevelPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setDBLoggingLevel(String value) {
      impl.setPropertyValue(INSTANCE.getDBLoggingLevelPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public Integer getDBNumCleanerThreads() {
      return impl.getPropertyValue(INSTANCE.getDBNumCleanerThreadsPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setDBNumCleanerThreads(Integer value) {
      impl.setPropertyValue(INSTANCE.getDBNumCleanerThreadsPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public Integer getDBNumLockTables() {
      return impl.getPropertyValue(INSTANCE.getDBNumLockTablesPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setDBNumLockTables(Integer value) {
      impl.setPropertyValue(INSTANCE.getDBNumLockTablesPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public boolean isDBRunCleaner() {
      return impl.getPropertyValue(INSTANCE.getDBRunCleanerPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setDBRunCleaner(Boolean value) {
      impl.setPropertyValue(INSTANCE.getDBRunCleanerPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public boolean isDBTxnNoSync() {
      return impl.getPropertyValue(INSTANCE.getDBTxnNoSyncPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setDBTxnNoSync(Boolean value) {
      impl.setPropertyValue(INSTANCE.getDBTxnNoSyncPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public boolean isDBTxnWriteNoSync() {
      return impl.getPropertyValue(INSTANCE.getDBTxnWriteNoSyncPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setDBTxnWriteNoSync(Boolean value) {
      impl.setPropertyValue(INSTANCE.getDBTxnWriteNoSyncPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public long getDiskFullThreshold() {
      return impl.getPropertyValue(INSTANCE.getDiskFullThresholdPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setDiskFullThreshold(Long value) {
      impl.setPropertyValue(INSTANCE.getDiskFullThresholdPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public long getDiskLowThreshold() {
      return impl.getPropertyValue(INSTANCE.getDiskLowThresholdPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setDiskLowThreshold(Long value) {
      impl.setPropertyValue(INSTANCE.getDiskLowThresholdPropertyDefinition(), value);
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
    public boolean isEntriesCompressed() {
      return impl.getPropertyValue(INSTANCE.getEntriesCompressedPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setEntriesCompressed(Boolean value) {
      impl.setPropertyValue(INSTANCE.getEntriesCompressedPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public int getImportQueueSize() {
      return impl.getPropertyValue(INSTANCE.getImportQueueSizePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setImportQueueSize(Integer value) {
      impl.setPropertyValue(INSTANCE.getImportQueueSizePropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public int getImportThreadCount() {
      return impl.getPropertyValue(INSTANCE.getImportThreadCountPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setImportThreadCount(Integer value) {
      impl.setPropertyValue(INSTANCE.getImportThreadCountPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public int getIndexEntryLimit() {
      return impl.getPropertyValue(INSTANCE.getIndexEntryLimitPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setIndexEntryLimit(Integer value) {
      impl.setPropertyValue(INSTANCE.getIndexEntryLimitPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public boolean isIndexFilterAnalyzerEnabled() {
      return impl.getPropertyValue(INSTANCE.getIndexFilterAnalyzerEnabledPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setIndexFilterAnalyzerEnabled(Boolean value) {
      impl.setPropertyValue(INSTANCE.getIndexFilterAnalyzerEnabledPropertyDefinition(), value);
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
    public long getPreloadTimeLimit() {
      return impl.getPropertyValue(INSTANCE.getPreloadTimeLimitPropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setPreloadTimeLimit(Long value) {
      impl.setPropertyValue(INSTANCE.getPreloadTimeLimitPropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public WritabilityMode getWritabilityMode() {
      return impl.getPropertyValue(INSTANCE.getWritabilityModePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void setWritabilityMode(WritabilityMode value) {
      impl.setPropertyValue(INSTANCE.getWritabilityModePropertyDefinition(), value);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listLocalDBIndexes() throws ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.listChildren(INSTANCE.getLocalDBIndexesRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public LocalDBIndexCfgClient getLocalDBIndex(String name)
        throws DefinitionDecodingException, ManagedObjectDecodingException,
        ManagedObjectNotFoundException, ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.getChild(INSTANCE.getLocalDBIndexesRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public <M extends LocalDBIndexCfgClient> M createLocalDBIndex(
        ManagedObjectDefinition<M, ? extends LocalDBIndexCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException {
      return impl.createChild(INSTANCE.getLocalDBIndexesRelationDefinition(), d, name, exceptions).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void removeLocalDBIndex(String name)
        throws ManagedObjectNotFoundException, ConcurrentModificationException,
        OperationRejectedException, AuthorizationException, CommunicationException {
      impl.removeChild(INSTANCE.getLocalDBIndexesRelationDefinition(), name);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listLocalDBVLVIndexes() throws ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.listChildren(INSTANCE.getLocalDBVLVIndexesRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public LocalDBVLVIndexCfgClient getLocalDBVLVIndex(String name)
        throws DefinitionDecodingException, ManagedObjectDecodingException,
        ManagedObjectNotFoundException, ConcurrentModificationException,
        AuthorizationException, CommunicationException {
      return impl.getChild(INSTANCE.getLocalDBVLVIndexesRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public <M extends LocalDBVLVIndexCfgClient> M createLocalDBVLVIndex(
        ManagedObjectDefinition<M, ? extends LocalDBVLVIndexCfg> d, String name, Collection<DefaultBehaviorException> exceptions) throws IllegalManagedObjectNameException {
      return impl.createChild(INSTANCE.getLocalDBVLVIndexesRelationDefinition(), d, name, exceptions).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void removeLocalDBVLVIndex(String name)
        throws ManagedObjectNotFoundException, ConcurrentModificationException,
        OperationRejectedException, AuthorizationException, CommunicationException {
      impl.removeChild(INSTANCE.getLocalDBVLVIndexesRelationDefinition(), name);
    }



    /**
     * {@inheritDoc}
     */
    public ManagedObjectDefinition<? extends LocalDBBackendCfgClient, ? extends LocalDBBackendCfg> definition() {
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
  private static class LocalDBBackendCfgServerImpl implements
    LocalDBBackendCfg {

    // Private implementation.
    private ServerManagedObject<? extends LocalDBBackendCfg> impl;

    // The value of the "backend-id" property.
    private final String pBackendId;

    // The value of the "base-dn" property.
    private final SortedSet<DN> pBaseDN;

    // The value of the "compact-encoding" property.
    private final boolean pCompactEncoding;

    // The value of the "db-cache-percent" property.
    private final int pDBCachePercent;

    // The value of the "db-cache-size" property.
    private final long pDBCacheSize;

    // The value of the "db-checkpointer-bytes-interval" property.
    private final long pDBCheckpointerBytesInterval;

    // The value of the "db-checkpointer-wakeup-interval" property.
    private final long pDBCheckpointerWakeupInterval;

    // The value of the "db-cleaner-min-utilization" property.
    private final int pDBCleanerMinUtilization;

    // The value of the "db-directory" property.
    private final String pDBDirectory;

    // The value of the "db-directory-permissions" property.
    private final String pDBDirectoryPermissions;

    // The value of the "db-evictor-core-threads" property.
    private final int pDBEvictorCoreThreads;

    // The value of the "db-evictor-keep-alive" property.
    private final long pDBEvictorKeepAlive;

    // The value of the "db-evictor-lru-only" property.
    private final boolean pDBEvictorLruOnly;

    // The value of the "db-evictor-max-threads" property.
    private final int pDBEvictorMaxThreads;

    // The value of the "db-evictor-nodes-per-scan" property.
    private final int pDBEvictorNodesPerScan;

    // The value of the "db-log-file-max" property.
    private final long pDBLogFileMax;

    // The value of the "db-logging-file-handler-on" property.
    private final boolean pDBLoggingFileHandlerOn;

    // The value of the "db-logging-level" property.
    private final String pDBLoggingLevel;

    // The value of the "db-num-cleaner-threads" property.
    private final Integer pDBNumCleanerThreads;

    // The value of the "db-num-lock-tables" property.
    private final Integer pDBNumLockTables;

    // The value of the "db-run-cleaner" property.
    private final boolean pDBRunCleaner;

    // The value of the "db-txn-no-sync" property.
    private final boolean pDBTxnNoSync;

    // The value of the "db-txn-write-no-sync" property.
    private final boolean pDBTxnWriteNoSync;

    // The value of the "disk-full-threshold" property.
    private final long pDiskFullThreshold;

    // The value of the "disk-low-threshold" property.
    private final long pDiskLowThreshold;

    // The value of the "enabled" property.
    private final boolean pEnabled;

    // The value of the "entries-compressed" property.
    private final boolean pEntriesCompressed;

    // The value of the "import-queue-size" property.
    private final int pImportQueueSize;

    // The value of the "import-thread-count" property.
    private final int pImportThreadCount;

    // The value of the "index-entry-limit" property.
    private final int pIndexEntryLimit;

    // The value of the "index-filter-analyzer-enabled" property.
    private final boolean pIndexFilterAnalyzerEnabled;

    // The value of the "java-class" property.
    private final String pJavaClass;

    // The value of the "je-property" property.
    private final SortedSet<String> pJEProperty;

    // The value of the "max-entries" property.
    private final int pMaxEntries;

    // The value of the "preload-time-limit" property.
    private final long pPreloadTimeLimit;

    // The value of the "writability-mode" property.
    private final WritabilityMode pWritabilityMode;



    // Private constructor.
    private LocalDBBackendCfgServerImpl(ServerManagedObject<? extends LocalDBBackendCfg> impl) {
      this.impl = impl;
      this.pBackendId = impl.getPropertyValue(INSTANCE.getBackendIdPropertyDefinition());
      this.pBaseDN = impl.getPropertyValues(INSTANCE.getBaseDNPropertyDefinition());
      this.pCompactEncoding = impl.getPropertyValue(INSTANCE.getCompactEncodingPropertyDefinition());
      this.pDBCachePercent = impl.getPropertyValue(INSTANCE.getDBCachePercentPropertyDefinition());
      this.pDBCacheSize = impl.getPropertyValue(INSTANCE.getDBCacheSizePropertyDefinition());
      this.pDBCheckpointerBytesInterval = impl.getPropertyValue(INSTANCE.getDBCheckpointerBytesIntervalPropertyDefinition());
      this.pDBCheckpointerWakeupInterval = impl.getPropertyValue(INSTANCE.getDBCheckpointerWakeupIntervalPropertyDefinition());
      this.pDBCleanerMinUtilization = impl.getPropertyValue(INSTANCE.getDBCleanerMinUtilizationPropertyDefinition());
      this.pDBDirectory = impl.getPropertyValue(INSTANCE.getDBDirectoryPropertyDefinition());
      this.pDBDirectoryPermissions = impl.getPropertyValue(INSTANCE.getDBDirectoryPermissionsPropertyDefinition());
      this.pDBEvictorCoreThreads = impl.getPropertyValue(INSTANCE.getDBEvictorCoreThreadsPropertyDefinition());
      this.pDBEvictorKeepAlive = impl.getPropertyValue(INSTANCE.getDBEvictorKeepAlivePropertyDefinition());
      this.pDBEvictorLruOnly = impl.getPropertyValue(INSTANCE.getDBEvictorLruOnlyPropertyDefinition());
      this.pDBEvictorMaxThreads = impl.getPropertyValue(INSTANCE.getDBEvictorMaxThreadsPropertyDefinition());
      this.pDBEvictorNodesPerScan = impl.getPropertyValue(INSTANCE.getDBEvictorNodesPerScanPropertyDefinition());
      this.pDBLogFileMax = impl.getPropertyValue(INSTANCE.getDBLogFileMaxPropertyDefinition());
      this.pDBLoggingFileHandlerOn = impl.getPropertyValue(INSTANCE.getDBLoggingFileHandlerOnPropertyDefinition());
      this.pDBLoggingLevel = impl.getPropertyValue(INSTANCE.getDBLoggingLevelPropertyDefinition());
      this.pDBNumCleanerThreads = impl.getPropertyValue(INSTANCE.getDBNumCleanerThreadsPropertyDefinition());
      this.pDBNumLockTables = impl.getPropertyValue(INSTANCE.getDBNumLockTablesPropertyDefinition());
      this.pDBRunCleaner = impl.getPropertyValue(INSTANCE.getDBRunCleanerPropertyDefinition());
      this.pDBTxnNoSync = impl.getPropertyValue(INSTANCE.getDBTxnNoSyncPropertyDefinition());
      this.pDBTxnWriteNoSync = impl.getPropertyValue(INSTANCE.getDBTxnWriteNoSyncPropertyDefinition());
      this.pDiskFullThreshold = impl.getPropertyValue(INSTANCE.getDiskFullThresholdPropertyDefinition());
      this.pDiskLowThreshold = impl.getPropertyValue(INSTANCE.getDiskLowThresholdPropertyDefinition());
      this.pEnabled = impl.getPropertyValue(INSTANCE.getEnabledPropertyDefinition());
      this.pEntriesCompressed = impl.getPropertyValue(INSTANCE.getEntriesCompressedPropertyDefinition());
      this.pImportQueueSize = impl.getPropertyValue(INSTANCE.getImportQueueSizePropertyDefinition());
      this.pImportThreadCount = impl.getPropertyValue(INSTANCE.getImportThreadCountPropertyDefinition());
      this.pIndexEntryLimit = impl.getPropertyValue(INSTANCE.getIndexEntryLimitPropertyDefinition());
      this.pIndexFilterAnalyzerEnabled = impl.getPropertyValue(INSTANCE.getIndexFilterAnalyzerEnabledPropertyDefinition());
      this.pJavaClass = impl.getPropertyValue(INSTANCE.getJavaClassPropertyDefinition());
      this.pJEProperty = impl.getPropertyValues(INSTANCE.getJEPropertyPropertyDefinition());
      this.pMaxEntries = impl.getPropertyValue(INSTANCE.getMaxEntriesPropertyDefinition());
      this.pPreloadTimeLimit = impl.getPropertyValue(INSTANCE.getPreloadTimeLimitPropertyDefinition());
      this.pWritabilityMode = impl.getPropertyValue(INSTANCE.getWritabilityModePropertyDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public void addLocalDBChangeListener(
        ConfigurationChangeListener<LocalDBBackendCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeLocalDBChangeListener(
        ConfigurationChangeListener<LocalDBBackendCfg> listener) {
      impl.deregisterChangeListener(listener);
    }
    /**
     * {@inheritDoc}
     */
    public void addChangeListener(
        ConfigurationChangeListener<BackendCfg> listener) {
      impl.registerChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeChangeListener(
        ConfigurationChangeListener<BackendCfg> listener) {
      impl.deregisterChangeListener(listener);
    }



    /**
     * {@inheritDoc}
     */
    public String getBackendId() {
      return pBackendId;
    }



    /**
     * {@inheritDoc}
     */
    public SortedSet<DN> getBaseDN() {
      return pBaseDN;
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
    public long getDBCheckpointerBytesInterval() {
      return pDBCheckpointerBytesInterval;
    }



    /**
     * {@inheritDoc}
     */
    public long getDBCheckpointerWakeupInterval() {
      return pDBCheckpointerWakeupInterval;
    }



    /**
     * {@inheritDoc}
     */
    public int getDBCleanerMinUtilization() {
      return pDBCleanerMinUtilization;
    }



    /**
     * {@inheritDoc}
     */
    public String getDBDirectory() {
      return pDBDirectory;
    }



    /**
     * {@inheritDoc}
     */
    public String getDBDirectoryPermissions() {
      return pDBDirectoryPermissions;
    }



    /**
     * {@inheritDoc}
     */
    public int getDBEvictorCoreThreads() {
      return pDBEvictorCoreThreads;
    }



    /**
     * {@inheritDoc}
     */
    public long getDBEvictorKeepAlive() {
      return pDBEvictorKeepAlive;
    }



    /**
     * {@inheritDoc}
     */
    public boolean isDBEvictorLruOnly() {
      return pDBEvictorLruOnly;
    }



    /**
     * {@inheritDoc}
     */
    public int getDBEvictorMaxThreads() {
      return pDBEvictorMaxThreads;
    }



    /**
     * {@inheritDoc}
     */
    public int getDBEvictorNodesPerScan() {
      return pDBEvictorNodesPerScan;
    }



    /**
     * {@inheritDoc}
     */
    public long getDBLogFileMax() {
      return pDBLogFileMax;
    }



    /**
     * {@inheritDoc}
     */
    public boolean isDBLoggingFileHandlerOn() {
      return pDBLoggingFileHandlerOn;
    }



    /**
     * {@inheritDoc}
     */
    public String getDBLoggingLevel() {
      return pDBLoggingLevel;
    }



    /**
     * {@inheritDoc}
     */
    public Integer getDBNumCleanerThreads() {
      return pDBNumCleanerThreads;
    }



    /**
     * {@inheritDoc}
     */
    public Integer getDBNumLockTables() {
      return pDBNumLockTables;
    }



    /**
     * {@inheritDoc}
     */
    public boolean isDBRunCleaner() {
      return pDBRunCleaner;
    }



    /**
     * {@inheritDoc}
     */
    public boolean isDBTxnNoSync() {
      return pDBTxnNoSync;
    }



    /**
     * {@inheritDoc}
     */
    public boolean isDBTxnWriteNoSync() {
      return pDBTxnWriteNoSync;
    }



    /**
     * {@inheritDoc}
     */
    public long getDiskFullThreshold() {
      return pDiskFullThreshold;
    }



    /**
     * {@inheritDoc}
     */
    public long getDiskLowThreshold() {
      return pDiskLowThreshold;
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
    public boolean isEntriesCompressed() {
      return pEntriesCompressed;
    }



    /**
     * {@inheritDoc}
     */
    public int getImportQueueSize() {
      return pImportQueueSize;
    }



    /**
     * {@inheritDoc}
     */
    public int getImportThreadCount() {
      return pImportThreadCount;
    }



    /**
     * {@inheritDoc}
     */
    public int getIndexEntryLimit() {
      return pIndexEntryLimit;
    }



    /**
     * {@inheritDoc}
     */
    public boolean isIndexFilterAnalyzerEnabled() {
      return pIndexFilterAnalyzerEnabled;
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
    public int getMaxEntries() {
      return pMaxEntries;
    }



    /**
     * {@inheritDoc}
     */
    public long getPreloadTimeLimit() {
      return pPreloadTimeLimit;
    }



    /**
     * {@inheritDoc}
     */
    public WritabilityMode getWritabilityMode() {
      return pWritabilityMode;
    }



    /**
     * {@inheritDoc}
     */
    public String[] listLocalDBIndexes() {
      return impl.listChildren(INSTANCE.getLocalDBIndexesRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public LocalDBIndexCfg getLocalDBIndex(String name) throws ConfigException {
      return impl.getChild(INSTANCE.getLocalDBIndexesRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void addLocalDBIndexAddListener(
        ConfigurationAddListener<LocalDBIndexCfg> listener) throws ConfigException {
      impl.registerAddListener(INSTANCE.getLocalDBIndexesRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeLocalDBIndexAddListener(
        ConfigurationAddListener<LocalDBIndexCfg> listener) {
      impl.deregisterAddListener(INSTANCE.getLocalDBIndexesRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void addLocalDBIndexDeleteListener(
        ConfigurationDeleteListener<LocalDBIndexCfg> listener) throws ConfigException {
      impl.registerDeleteListener(INSTANCE.getLocalDBIndexesRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeLocalDBIndexDeleteListener(
        ConfigurationDeleteListener<LocalDBIndexCfg> listener) {
      impl.deregisterDeleteListener(INSTANCE.getLocalDBIndexesRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public String[] listLocalDBVLVIndexes() {
      return impl.listChildren(INSTANCE.getLocalDBVLVIndexesRelationDefinition());
    }



    /**
     * {@inheritDoc}
     */
    public LocalDBVLVIndexCfg getLocalDBVLVIndex(String name) throws ConfigException {
      return impl.getChild(INSTANCE.getLocalDBVLVIndexesRelationDefinition(), name).getConfiguration();
    }



    /**
     * {@inheritDoc}
     */
    public void addLocalDBVLVIndexAddListener(
        ConfigurationAddListener<LocalDBVLVIndexCfg> listener) throws ConfigException {
      impl.registerAddListener(INSTANCE.getLocalDBVLVIndexesRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeLocalDBVLVIndexAddListener(
        ConfigurationAddListener<LocalDBVLVIndexCfg> listener) {
      impl.deregisterAddListener(INSTANCE.getLocalDBVLVIndexesRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void addLocalDBVLVIndexDeleteListener(
        ConfigurationDeleteListener<LocalDBVLVIndexCfg> listener) throws ConfigException {
      impl.registerDeleteListener(INSTANCE.getLocalDBVLVIndexesRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public void removeLocalDBVLVIndexDeleteListener(
        ConfigurationDeleteListener<LocalDBVLVIndexCfg> listener) {
      impl.deregisterDeleteListener(INSTANCE.getLocalDBVLVIndexesRelationDefinition(), listener);
    }



    /**
     * {@inheritDoc}
     */
    public Class<? extends LocalDBBackendCfg> configurationClass() {
      return LocalDBBackendCfg.class;
    }



    /**
     * {@inheritDoc}
     */
    public DN dn() {
      return impl.getDN();
    }

  }
}
