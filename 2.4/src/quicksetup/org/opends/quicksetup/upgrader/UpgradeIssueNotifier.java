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
 *      Copyright 2006-2009 Sun Microsystems, Inc.
 */

package org.opends.quicksetup.upgrader;

import org.opends.messages.Message;
import org.opends.messages.MessageBuilder;

import org.opends.quicksetup.ReturnCode;
import org.opends.quicksetup.BuildInformation;
import org.opends.quicksetup.UserInteraction;
import org.opends.quicksetup.ApplicationException;
import org.opends.quicksetup.Constants;
import org.opends.server.util.VersionCompatibilityIssue;
import static org.opends.messages.QuickSetupMessages.*;
import static org.opends.server.util.VersionCompatibilityIssue.*;

import java.util.Set;
import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;

/**
 * {@link org.opends.quicksetup.upgrader.VersionIssueNotifier} specific
 * to upgrade tools.
 */
public class UpgradeIssueNotifier extends VersionIssueNotifier {

  static private final Logger LOG =
          Logger.getLogger(UpgradeIssueNotifier.class.getName());

  /**
   * Creates a new instance that can analyze a hypothetical upgrade/reversion
   * operation from one version to another.
   * @param ui UserInteraction for relaying information to the user
   * @param current BuildInformation representing the current version
   * @param neu BuildInformation representing the proposed next version
   */
  public UpgradeIssueNotifier(UserInteraction ui,
                       BuildInformation current,
                       BuildInformation neu) {
    super(ui, current, neu);
  }

  /**
   * {@inheritDoc}
   */
  public void notifyUser() throws ApplicationException {
    Message cont = INFO_ORACLE_ACTION_PROMPT_CONTINUE.get();
    Message cancel = INFO_ORACLE_ACTION_PROMPT_CANCEL.get();
    if (hasIssues()) {
      List<Directive> issues = getIssues();
      if (!isSupported()) {
        MessageBuilder reason = new MessageBuilder();
        if (issues != null) {
          for (VersionIssueNotifier.Directive directive : issues) {
            LOG.log(Level.INFO, "Unsupported upgrade details: " +
                    directive.getMessage());
            reason.append(directive.getMessage());
            reason.append(EOL);
          }
        }
        throw new ApplicationException(
            ReturnCode.APPLICATION_ERROR,
                INFO_UPGRADE_ORACLE_UNSUPPORTED.get(
                        currentBuildInfo.toString(),
                        newBuildInfo.toString(),
                        reason.toMessage()),
                null);
      } else {
        if (ui != null) {
          String lineBreak = ui.isCLI() ?
              Constants.LINE_SEPARATOR : Constants.HTML_LINE_BREAK;
          for (VersionIssueNotifier.Directive directive : issues) {
            Message title;
            Message summary;
            Message details;
            Message defaultAction;
            UserInteraction.MessageType msgType;
            switch (directive.getType()) {
              case ACTION:
                title = INFO_GENERAL_ACTION_REQUIRED.get();
                summary = INFO_UPGRADE_ORACLE_ACTION.get();
                details = new MessageBuilder(directive.getMessage())
                        .append(lineBreak)
                        .append(lineBreak)
                        .append(INFO_ORACLE_ACTION_PROMPT.get())
                        .toMessage();
                msgType = UserInteraction.MessageType.WARNING;
                defaultAction = cancel;
                break;
              case INFO:
                title = INFO_GENERAL_INFO.get();
                summary = INFO_UPGRADE_ORACLE_INFO.get();
                details = new MessageBuilder(directive.getMessage())
                        .append(lineBreak)
                        .append(lineBreak)
                        .append(INFO_ORACLE_INFO_PROMPT.get())
                        .toMessage();
                msgType = UserInteraction.MessageType.INFORMATION;
                defaultAction = cont;
                break;
              case WARNING:
                title = INFO_GENERAL_WARNING.get();
                summary = INFO_UPGRADE_ORACLE_WARNING.get();
                details = new MessageBuilder(directive.getMessage())
                        .append(lineBreak)
                        .append(lineBreak)
                        .append(INFO_ORACLE_INFO_PROMPT.get())
                        .toMessage();
                msgType = UserInteraction.MessageType.WARNING;
                defaultAction = cont;
                break;
              default:
                LOG.log(Level.INFO, "Unexpected issue type " +
                        directive.getType());
                title = Message.EMPTY;
                summary = Message.EMPTY;
                details = directive.getMessage();
                msgType = UserInteraction.MessageType.WARNING;
                defaultAction = cont;
            }
            if (cancel.equals(ui.confirm(
                    summary,
                    details,
                    title,
                    msgType,
                    new Message[]{cont, cancel},
                    defaultAction))) {
              throw new ApplicationException(
                  ReturnCode.CANCELED,
                      INFO_UPGRADE_CANCELED.get(), null);
            }
          }
        } else {
          throw new ApplicationException(
              ReturnCode.APPLICATION_ERROR,
              INFO_ORACLE_NO_SILENT.get(), null);
        }
      }
    }
  }

  /**
   * {@inheritDoc}
   */
  protected Message getLocalizedDetailMessage(
          VersionCompatibilityIssue.Cause cause)
  {
    Message msg = cause.getLocalizedUpgradeMessage();

    // See if we need to supply a generic message
    Set<VersionCompatibilityIssue.Effect> effects = cause.getEffects();

    // If the import/export effect is present, append the detailed
    // instructions.
    if (effects.contains(Effect.UPGRADE_DATA_EXPORT_AND_REIMPORT_REQUIRED)) {
      if (ui != null)
      {
        String lineBreak = ui.isCLI() ? Constants.LINE_SEPARATOR
            : Constants.HTML_LINE_BREAK;
        msg = new MessageBuilder(msg).append(lineBreak).append(
            ui.createUnorderedList(getExportImportInstructions())).toMessage();
      }
      else
      {
        String lineBreak = Constants.LINE_SEPARATOR ;
        msg = new MessageBuilder(msg).append(lineBreak).append(
            createUnorderedList(getExportImportInstructions())).toMessage();
      }

    }
    return msg;
  }


  /**
   * {@inheritDoc}
   */
  protected boolean isActionRequired(VersionCompatibilityIssue.Cause cause) {
    boolean isAction = false;
    if (cause != null) {
      Set<VersionCompatibilityIssue.Effect> effects = cause.getEffects();
      isAction =
              effects.contains(
                      Effect.UPGRADE_DATA_EXPORT_AND_REIMPORT_REQUIRED) ||
                      (effects.contains(
                              Effect.UPGRADE_MANUAL_ACTION_REQUIRED) &&
                              cause.getLocalizedUpgradeMessage() != null);
    }
    return isAction;
  }

  /**
   * {@inheritDoc}
   */
  protected boolean isWarning(VersionCompatibilityIssue.Cause cause) {
    boolean isWarning = false;
    if (cause != null && !isActionRequired(cause)) {
      Set<VersionCompatibilityIssue.Effect> effects = cause.getEffects();
      isWarning = effects.contains(Effect.UPGRADE_SHOW_WARNING_MESSAGE) &&
              cause.getLocalizedUpgradeMessage() != null;
    }
    return isWarning;
  }

  /**
   * {@inheritDoc}
   */
  protected boolean isUnsupported(VersionCompatibilityIssue.Cause cause) {
    boolean isUnsupported = false;
    if (cause != null) {
      Set<VersionCompatibilityIssue.Effect> effects = cause.getEffects();
      for (VersionCompatibilityIssue.Effect effect : effects) {
        switch (effect) {
          case UPGRADE_NOT_POSSIBLE:
            isUnsupported = true; break;
          default:
            // assume not an tion;
        }
      }
    }
    return isUnsupported;
  }

}
