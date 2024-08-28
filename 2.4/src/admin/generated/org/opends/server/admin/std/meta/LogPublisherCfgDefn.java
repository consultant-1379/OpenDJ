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



import org.opends.server.admin.AbstractManagedObjectDefinition;
import org.opends.server.admin.AdministratorAction;
import org.opends.server.admin.BooleanPropertyDefinition;
import org.opends.server.admin.PropertyOption;
import org.opends.server.admin.std.client.LogPublisherCfgClient;
import org.opends.server.admin.std.server.LogPublisherCfg;
import org.opends.server.admin.Tag;
import org.opends.server.admin.TopCfgDefn;
import org.opends.server.admin.UndefinedDefaultBehaviorProvider;



/**
 * An interface for querying the Log Publisher managed object
 * definition meta information.
 * <p>
 * Log Publishers are responsible for distributing log messages from
 * different loggers to a destination.
 */
public final class LogPublisherCfgDefn extends AbstractManagedObjectDefinition<LogPublisherCfgClient, LogPublisherCfg> {

  // The singleton configuration definition instance.
  private static final LogPublisherCfgDefn INSTANCE = new LogPublisherCfgDefn();



  // The "enabled" property definition.
  private static final BooleanPropertyDefinition PD_ENABLED;



  // Build the "enabled" property definition.
  static {
      BooleanPropertyDefinition.Builder builder = BooleanPropertyDefinition.createBuilder(INSTANCE, "enabled");
      builder.setOption(PropertyOption.MANDATORY);
      builder.setAdministratorAction(new AdministratorAction(AdministratorAction.Type.NONE, INSTANCE, "enabled"));
      builder.setDefaultBehaviorProvider(new UndefinedDefaultBehaviorProvider<Boolean>());
      PD_ENABLED = builder.getInstance();
      INSTANCE.registerPropertyDefinition(PD_ENABLED);
  }



  // Register the tags associated with this managed object definition.
  static {
    INSTANCE.registerTag(Tag.valueOf("logging"));
  }



  /**
   * Get the Log Publisher configuration definition singleton.
   *
   * @return Returns the Log Publisher configuration definition
   *         singleton.
   */
  public static LogPublisherCfgDefn getInstance() {
    return INSTANCE;
  }



  /**
   * Private constructor.
   */
  private LogPublisherCfgDefn() {
    super("log-publisher", TopCfgDefn.getInstance());
  }



  /**
   * Get the "enabled" property definition.
   * <p>
   * Indicates whether the Log Publisher is enabled for use.
   *
   * @return Returns the "enabled" property definition.
   */
  public BooleanPropertyDefinition getEnabledPropertyDefinition() {
    return PD_ENABLED;
  }
}
