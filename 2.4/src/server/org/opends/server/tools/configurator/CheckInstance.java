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
 *      Portions Copyright 2011 ForgeRock AS
 */
package org.opends.server.tools.configurator;

import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import org.opends.quicksetup.ReturnCode;
import org.opends.server.util.args.ArgumentException;
import org.opends.server.util.args.ArgumentParser;
import org.opends.server.util.args.StringArgument;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.opends.messages.Message;
import org.opends.quicksetup.Installation;
import org.opends.server.util.args.BooleanArgument;
import java.util.StringTokenizer;
import org.opends.quicksetup.BuildInformation;
import org.opends.quicksetup.QuickSetupLog;

import static org.opends.messages.ToolMessages.*;
import static org.opends.messages.QuickSetupMessages.*;

import static org.opends.server.util.DynamicConstants.*;

/**
 * This class is called by the configure command line to move the default
 * Directory Server instance.
 */
public class CheckInstance {

  static private final Logger LOG = Logger.getLogger(
          CheckInstance.class.getName());

  /** Prefix for log files. */
  static public final String LOG_FILE_PREFIX = "opendj-checkinstance-";

  private static String installRootFromSystem;
  private static String instanceRootFromSystem;
  /**
   * The user that launches this application.
   */
  public static final String CURRENT_USER_OPTION_LONG = "currentUser";
  /**
   * The value for the short option 'currentUser'.
   */
  public static final Character CURRENT_USER_OPTION_SHORT = null;
  /**
   * Should version be verified.
   */
  public static final String CHECK_VERSION_OPTION_LONG = "checkVersion";
  /**
   * The value for the short option 'checkVersion'.
   */
  public static final Character CHECK_VERSION_OPTION_SHORT = null;
  private static StringArgument currentUserArg;
  private static BooleanArgument checkVersionArg;
  private static String currentUser;
  private static String instanceOwner;
  private static boolean isWin;
  private static int SUCCESS = 0;
  private static int ARGS_ERROR = 1;
  private static int USER_ERROR = 2;
  private static int VERSION_ERROR = 3;

  /**
   * Creates a copy of the specified file.
   *
   * @param  from  The source file to be copied.
   * @param  to    The destination file to be created.
   *
   * @throws  IOException  If a problem occurs.
   */
  private static void copyFile(File from, File to)
          throws IOException
  {
    byte[]           buffer        = new byte[4096];
    FileInputStream  inputStream   = null;
    FileOutputStream outputStream  = null;

    try
    {
      inputStream  = new FileInputStream(from);
      outputStream = new FileOutputStream(to, false);

      int bytesRead = inputStream.read(buffer);
      while (bytesRead > 0)
      {
        outputStream.write(buffer, 0, bytesRead);
        bytesRead = inputStream.read(buffer);
      }
    }
    finally
    {
      if (inputStream != null)
      {
        try
        {
          inputStream.close();
        }
        catch (Exception e)
        {
        }
      }

      if (outputStream != null)
      {
        outputStream.close();
      }
    }
  }

  /**
   * The main method which is called by the configure command lines.
   *
   * @param args the arguments passed by the command line.
   */
  public static void main(String[] args) {

    try {
      QuickSetupLog.initLogFileHandler(
              File.createTempFile(LOG_FILE_PREFIX,
                      QuickSetupLog.LOG_FILE_SUFFIX));
    } catch (Throwable t) {
      System.err.println(INFO_ERROR_INITIALIZING_LOG.get());
      t.printStackTrace();
    }

    // Create the command-line argument parser for use with this program.
    Message toolDescription = INFO_CHECK_DESCRIPTION.get();
    ArgumentParser argParser =
            new ArgumentParser(CheckInstance.class.getName(),
            toolDescription, false);


    installRootFromSystem = System.getProperty("INSTALL_ROOT");
    if (installRootFromSystem == null) {
      System.err
          .println(ERR_INTERNAL.get(ERR_INSTALL_ROOT_NOT_SPECIFIED.get()));
      System.exit(ReturnCode.APPLICATION_ERROR.getReturnCode());
    }
    instanceRootFromSystem = System.getProperty("INSTANCE_ROOT");
    if (instanceRootFromSystem == null) {
      System.err.println(ERR_INTERNAL
          .get(ERR_INSTANCE_ROOT_NOT_SPECIFIED.get()));
      System.exit(ReturnCode.APPLICATION_ERROR.getReturnCode());
    }
    isWin =  System.getProperty("file.separator").equals("\\");

    // Initialize all the command-line argument types and register them with the
    // parser.
    try {
      if (!isWin) {
      currentUserArg = new StringArgument(CURRENT_USER_OPTION_LONG,
              CURRENT_USER_OPTION_SHORT,
              CURRENT_USER_OPTION_LONG,
              true, true,
              INFO_CURRENT_USER_PLACEHOLDER.get(),
              INFO_CHECK_DESCRIPTION_CURRENT_USER.get());
      argParser.addArgument(currentUserArg);
      }
      checkVersionArg = new BooleanArgument(CHECK_VERSION_OPTION_LONG,
              CHECK_VERSION_OPTION_SHORT,
              CHECK_VERSION_OPTION_LONG,
              INFO_CHECK_DESCRIPTION_CHECK_VERSION.get());
      argParser.addArgument(checkVersionArg);
    } catch (ArgumentException ae) {
      System.err.println(ERR_INTERNAL.get(ae.getMessageObject()));
      System.exit(ReturnCode.APPLICATION_ERROR.getReturnCode());
    }


    // Parse the command-line arguments provided to this program.
    try {
      argParser.parseArguments(args);
    } catch (ArgumentException ae) {
      System.err.println(ERR_INTERNAL.get(ae.getMessageObject()));
      System.exit(ARGS_ERROR);
    }

    File confDir = new File(instanceRootFromSystem,
            Installation.CONFIG_PATH_RELATIVE);

     if (!isWin) {
    // Check user
    File conf = new File (confDir, Installation.CURRENT_CONFIG_FILE_NAME);
    Process proc = null;
    int exit = 0;

    InputStreamReader reader = null;
    int c;
    StringBuffer sb = new StringBuffer();
    String[] cmdArgs = {"ls", "-l", conf.getAbsolutePath()};
    StringBuilder cmd = new StringBuilder();
    for (String arg : cmdArgs)
    {
      if (cmd.length() > 0)
      {
        cmd.append(" ");
      }
      cmd.append(arg);
    }
    try {
      proc = Runtime.getRuntime().exec(cmdArgs);
      proc.waitFor();
      reader = new InputStreamReader(proc.getInputStream());
      while (((c = reader.read()) != -1)) {
        sb.append((char) c);
      }
      exit = proc.exitValue();
      if (exit != 0) {
        LOG.log(Level.FINEST, cmd + " error= " + exit);
        System.err.println(ERR_CONFIG_LDIF_NOT_FOUND.get(
            confDir.getAbsolutePath(),
            installRootFromSystem + File.separator + "instance.loc"));
        System.exit(ReturnCode.APPLICATION_ERROR.getReturnCode());
      }
    } catch (InterruptedException ex) {
      LOG.log(Level.SEVERE, "InterruptedException" + ex.getMessage());
      System.err.println(
          ERR_CONFIG_LDIF_NOT_FOUND.get(confDir.getAbsolutePath(),
          installRootFromSystem + File.separator + "instance.loc"));
      System.exit(ReturnCode.APPLICATION_ERROR.getReturnCode());
    } catch (IOException ex) {
      LOG.log(Level.SEVERE, "IOException" + ex.getMessage() );
      System.err.println(ERR_CONFIG_LDIF_NOT_FOUND.get(
          confDir.getAbsolutePath(),
          installRootFromSystem + File.separator + "instance.loc"));
      System.exit(ReturnCode.APPLICATION_ERROR.getReturnCode());
    }

    LOG.log(Level.FINEST, cmd + " returns [" + sb.toString() + "]");
    StringTokenizer tok = new StringTokenizer(sb.toString());
    if (tok.hasMoreTokens()) {
      // access rights
      tok.nextToken();
      if (tok.hasMoreTokens()) {
        // inode
        tok.nextToken();
        if (tok.hasMoreTokens()) {
          instanceOwner = tok.nextToken();
          LOG.log(Level.FINEST, "instanceOwner=[" + instanceOwner + "]");
        } else {
          LOG.log(Level.SEVERE, "no instanceOwner");
          System.err.println(ERR_INTERNAL.get(Message.raw("no instanceOwner")));
          System.exit(ReturnCode.APPLICATION_ERROR.getReturnCode());
        }
      } else {
        LOG.log(Level.SEVERE, "no inode");
        System.err.println(ERR_INTERNAL.get(Message.raw("no inode")));
        System.exit(ReturnCode.APPLICATION_ERROR.getReturnCode());
      }
    } else {
      LOG.log(Level.SEVERE, "no access rights");
      System.err.println(ERR_INTERNAL.get(Message.raw("no access rights")));
      System.exit(ReturnCode.APPLICATION_ERROR.getReturnCode());
    }


    currentUser = currentUserArg.getValue();
    LOG.log(Level.FINEST, "currentUser=[" + currentUser + "]");

    if ((currentUser != null) && !(currentUser.equals(instanceOwner))) {
      System.err.println(ERR_CHECK_USER_ERROR.get(instanceOwner));
      System.exit(USER_ERROR);
    }
    }

    // Initialize buildinfo in not already done (ZIP delivery)
    BuildInformation installBi =
            BuildInformation.fromBuildString(MAJOR_VERSION +
            "." + MINOR_VERSION +
            "." + POINT_VERSION +
            "." + REVISION_NUMBER);
    File bif = new File(confDir, Installation.BUILDINFO_RELATIVE_PATH);
    if (!bif.exists()) {
      FileWriter fwriter = null;
      try {
        fwriter = new FileWriter(bif, true);
        fwriter.append(installBi.getBuildString());
      } catch (Exception e) {
      } finally {
        try {
          fwriter.close();
        } catch (Exception e) {
        }
      }
    }

    // Check version
    if (checkVersionArg.isPresent()) {
      BuildInformation instanceBi = installBi;

      try {
        if (bif.exists()) {
          BufferedReader breader = new BufferedReader(new FileReader(bif));

          // Read the first line and close the file.
          String line;
          try {
            line = breader.readLine();
            instanceBi = BuildInformation.fromBuildString(line);
          } finally {
            try {
              breader.close();
            } catch (Exception e) {
            }
          }

          // For pkg(5) delivery: update the file to avoid overwrite
          // during upgrade
          FileWriter fwriter  = new FileWriter(bif, true);
          try {
            fwriter.append('\n');
          } finally {
            try {
              fwriter.close();
            } catch (Exception e) {
            }
          }
        }
      } catch (Exception e) {
        LOG.log(Level.SEVERE, "error getting build information for " +
                "current instance", e);
      }

        if (!installBi.equals(instanceBi)) {
          System.err.println(ERR_CHECK_VERSION_NOT_MATCH.get());
          System.exit(VERSION_ERROR);
        }
    } else {
      LOG.log(Level.FINEST, "checkVersion not specified");
    }

    // For pkg(5) delivery: if config/upgrade/*.ldif.REV does not exist
    try {
      File upgradeDir = new File(confDir, Installation.UPGRADE_PATH);
      File tmplUpgradeDir = new File(installRootFromSystem + File.separator +
              Installation.TMPL_INSTANCE_RELATIVE_PATH +
              File.separator + Installation.CONFIG_PATH_RELATIVE +
              File.separator + Installation.UPGRADE_PATH);

      File concatenatedSchema = new File(upgradeDir,
              "schema.ldif." + REVISION_NUMBER);
      if (!concatenatedSchema.exists()) {
        File tmplConcatenatedSchema = new File(tmplUpgradeDir,
                "schema.ldif." + REVISION_NUMBER);
        copyFile(tmplConcatenatedSchema, concatenatedSchema);
      } else {
        LOG.log(Level.INFO, concatenatedSchema.getAbsolutePath() +
                "already exists");
      }

      File initialConfig = new File(upgradeDir,
              "config.ldif." + REVISION_NUMBER);
      if (!initialConfig.exists()) {
        File tmplInitialConfig = new File(tmplUpgradeDir,
                "config.ldif." + REVISION_NUMBER);
        copyFile(tmplInitialConfig, initialConfig);
      } else {
        LOG.log(Level.INFO, initialConfig.getAbsolutePath() + "already exists");
      }
    } catch (Exception e) {
      LOG.log(Level.SEVERE, "error initializing config/upgrade files", e);
    }

    System.exit(SUCCESS);

  }
}