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

package org.opends.quicksetup.upgrader;

import org.opends.quicksetup.UserData;

import java.io.File;

/**
 * User data specific to the upgrade process.
 */
public class UpgradeUserData extends UserData {

  /** Describes upgrade operation type. */
  public enum Operation { UPGRADE, REVERSION };

  private File installPackage;

  private Build buildToDownload;

  private Operation operation;

  /**
   * Gets the OpenDS package (.zip) file whose contents will
   * be used in the upgrade/reversion.
   * @return File object representing the OpenDS package
   */
  public File getInstallPackage() {
    return installPackage;
  }

  /**
   * Sets the OpenDS package (.zip) file whose contents will
   * be used in the upgrade/reversion.
   * @param installPackage File object representing the OpenDS package
   */
  public void setInstallPackage(File installPackage) {
    this.installPackage = installPackage;
  }

  /**
   * Gets the Build that will need to be downloaded before
   * the upgrade can begin.
   * @return Build representing the build to download
   */
  public Build getInstallPackageToDownload() {
    return buildToDownload;
  }

  /**
   * Sets the Build that will need to be downloaded before
   * the upgrade can begin.
   * @param build Build to download
   */
  public void setBuildToDownload(Build build) {
    this.buildToDownload = build;
  }

  /**
   * Indicates whether or not the upgrader should perform a
   * backup of the databases as part of the upgrade.
   * @return boolean where true indicates that the databases
   * should be backed up
   */
  public boolean getPerformDatabaseBackup() {
    // It would be nice to make this an option (see issue 1740)
    return false;
  }

  /**
   * Sets the operation the user would like to perform.
   * @param operation upgrade or reversion
   */
  public void setOperation(Operation operation) {
    this.operation = operation;
  }

  /**
   * Gets the operation the user would like to perform.
   * @return operation upgrade or reversion
   */
  public Operation getOperation() {
    return this.operation;
  }

}
