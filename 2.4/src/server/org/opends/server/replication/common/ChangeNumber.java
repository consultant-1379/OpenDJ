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
package org.opends.server.replication.common;

import java.util.Date;

/**
 * Class used to represent Change Numbers.
 */
public class ChangeNumber implements java.io.Serializable,
                                     java.lang.Comparable<ChangeNumber>
{
  private static final long serialVersionUID = -8802722277749190740L;
  private final long timeStamp;
  private final int seqnum;
  private final int serverId;

  // A String representation of the ChangeNumber suitable for network
  // transmission.
  private String formatedString = null;

  /**
   * Create a new ChangeNumber from a String.
   *
   * @param str the string from which to create a ChangeNumber
   */
  public ChangeNumber(String str)
  {
    String temp = str.substring(0, 16);
    timeStamp = Long.parseLong(temp, 16);

    temp = str.substring(16, 20);
    serverId = Integer.parseInt(temp, 16);

    temp = str.substring(20, 28);
    seqnum = Integer.parseInt(temp, 16);

    formatedString = str;
  }

  /**
   * Create a new ChangeNumber.
   *
   * @param time time for the ChangeNumber
   * @param seq sequence number
   * @param serverId2 identity of server
   */
  public ChangeNumber(long time, int seq, int serverId2)
  {
    serverId = serverId2;
    timeStamp = time;
    seqnum = seq;
  }

  /**
   * Getter for the time.
   * @return the time
   */
  public long getTime()
  {
    return timeStamp;
  }

  /**
   * Get the timestamp associated to this ChangeNumber in seconds.
   * @return timestamp associated to this ChangeNumber in seconds
   */
  public long getTimeSec()
  {
    return timeStamp/1000;
  }

  /**
   * Getter for the sequence number.
   * @return the sequence number
   */
  public int getSeqnum()
  {
    return seqnum;
  }

  /**
   * Getter for the server ID.
   * @return the server ID
   */
  public int getServerId()
  {
    return serverId;
  }


  /**
   * {@inheritDoc}
   */
  public boolean equals(Object obj)
  {
    if (obj instanceof ChangeNumber)
    {
      ChangeNumber cn = (ChangeNumber) obj;
      if ((this.seqnum == cn.seqnum)  &&
          (this.serverId == cn.serverId) &&
          (this.timeStamp == cn.timeStamp) )
        return true;
      else
        return false;
    }
    else
      return false;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public int hashCode()
  {
    return this.seqnum + this.serverId + Long.valueOf(timeStamp).hashCode();
  }

  /**
   * Convert the ChangeNumber to a printable String.
   * @return the string
   */
  public String toString()
  {
    return format();
  }

  /**
   * Convert the ChangeNumber to a String that is suitable for network
   * transmission.
   *
   * @return the string
   */
  public String format()
  {
    if (formatedString != null)
      return formatedString;

    return String.format("%016x%04x%08x", timeStamp, serverId, seqnum);
  }

  /**
   * Convert the ChangeNumber to a printable String with a user friendly
   * format.
   *
   * @return the string
   */
  public String toStringUI()
  {
    Date date = new Date(timeStamp);
    return String.format(
        "%016x%04x%08x (sid=%d,tsd=%s,ts=%d,seqnum=%d)",
        timeStamp, serverId, seqnum,
        serverId, date.toString(), timeStamp, seqnum);
  }

  /**
   * Compares 2 ChangeNumber.
   * @param CN1 the first ChangeNumber to compare
   * @param CN2 the second ChangeNumber to compare
   * @return value 0 if changeNumber matches, negative if first
   * changeNumber is smaller, positive otherwise
   */
  public static int compare(ChangeNumber CN1, ChangeNumber CN2)
  {
    if (CN1 == null)
    {
      if (CN2 == null)
        return 0;
      else
        return -1;
    }
    else if (CN2 == null)
      return 1;
    else if (CN1.timeStamp < CN2.timeStamp)
      return -1;
    else if (CN2.timeStamp < CN1.timeStamp)
      return 1;
    else
    {
      // timestamps are equals compare seqnums
      if (CN1.seqnum < CN2.seqnum)
        return -1;
      else if (CN2.seqnum < CN1.seqnum)
        return 1;
      else
      {
        // timestamp and seqnum are equals compare serverIds
        if (CN1.serverId < CN2.serverId)
          return -1;
        else if (CN2.serverId < CN1.serverId)
          return 1;

        // if we get here ChangeNumber are equals
        return 0;
      }

    }
  }

 /**
  * Computes the difference in number of changes between 2
  * change numbers. First one is expected to be newer than second one. If this
  * is not the case, 0 will be returned.
  * @param op1 the first ChangeNumber
  * @param op2 the second ChangeNumber
  * @return the difference
  */
  public static int diffSeqNum(ChangeNumber op1, ChangeNumber op2)
  {
    if (op1 == null)
    {
      return 0;
    }
    if (op2 == null)
    {
      return op1.getSeqnum();
    }
    if (op2.newerOrEquals(op1))
    {
      return 0;
    }

    int seqnum1 = op1.getSeqnum();
    long time1 = op1.getTime();
    int seqnum2 = op2.getSeqnum();
    long time2 = op2.getTime();

    if (time2 <= time1)
    {
      if (seqnum2 <= seqnum1)
      {
        return seqnum1 - seqnum2;
      } else
      {
        return Integer.MAX_VALUE - (seqnum2 - seqnum1) + 1;
      }
    } else
    {
      return 0;
    }
  }

  /**
   * check if the current Object is strictly older than ChangeNumber
   * given in parameter.
   * @param CN the Changenumber to compare with
   * @return true if strictly older, false if younger or same
   */
  public Boolean older(ChangeNumber CN)
  {
    if (compare(this, CN) < 0)
      return true;

    return false;
  }

  /**
   * check if the current Object is older than ChangeNumber
   * given in parameter.
   * @param CN the Changenumber to compare with
   * @return true if older or equal, false if younger
   */
  public Boolean olderOrEqual(ChangeNumber CN)
  {
    if (compare(this, CN) <= 0)
      return true;

    return false;
  }

  /**
   * Check if the current Object is newer than ChangeNumber.
   * @param CN the Changenumber to compare with
   * @return true if newer
   */
  public boolean newerOrEquals(ChangeNumber CN)
  {
    if (compare(this, CN) >= 0)
      return true;

    return false;
  }

  /**
   * Check if the current Object is strictly newer than ChangeNumber.
   * @param CN the Changenumber to compare with
   * @return true if strictly newer
   */
  public boolean newer(ChangeNumber CN)
  {
    if (compare(this, CN) > 0)
      return true;

    return false;
  }

  /**
   * Compares this object with the specified object for order.
   * @param cn the ChangeNumber to compare with.
   * @return a negative integer, zero, or a positive integer as this object
   *         is less than, equal to, or greater than the specified object.
   */
  public int compareTo(ChangeNumber cn)
  {
    return compare(this, cn);
  }
}
