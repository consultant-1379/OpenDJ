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
 *      Copyright 2006-2010 Sun Microsystems, Inc.
 */
package org.opends.server.api;



import org.opends.server.types.DN;
import org.opends.server.types.Entry;



/**
 * Generic subtree specification interface.
 */
@org.opends.server.types.PublicAPI(
     stability=org.opends.server.types.StabilityLevel.VOLATILE,
     mayInstantiate=false,
     mayExtend=true,
     mayInvoke=false)
public abstract class SubtreeSpecification
{
  /**
   * Create a new subtree specification.
   */
  protected SubtreeSpecification()
  {
    // No implementation required.
  }



  /**
   * Get the absolute base DN of the subtree specification.
   *
   * @return Returns the absolute base DN of the subtree
   *         specification.
   */
  public abstract DN getBaseDN();



  /**
   * Determine if an entry is within the scope of the subtree
   * specification.
   *
   * @param  entry  The entry.
   *
   * @return  {@code true} if the entry is within the scope of the
   *          subtree specification, or {@code false} if not.
   */
  public abstract boolean isWithinScope(Entry entry);



  /**
   * Determine if the specified DN is within the scope of the subtree
   * specification.
   *
   * @param dn  The distinguished name.
   * @return Returns <code>true</code> if the DN is within the scope
   *         of the subtree specification, or <code>false</code>
   *         otherwise.
   */
  public abstract boolean isDNWithinScope(DN dn);



  /**
   * Indicates whether the provided object is logically equal to this
   * subtree specification object.
   *
   * @param  obj  The object for which to make the determination.
   *
   * @return  {@code true} if the provided object is logically equal
   *          to this subtree specification object, or {@code false}
   *          if not.
   */
  @Override
  public abstract boolean equals(Object obj);



  /**
   * Retrieves the hash code for this subtree specification object.
   *
   * @return  The hash code for this subtree specification object.
   */
  @Override
  public abstract int hashCode();



  /**
   * Append the string representation of the subtree specification to
   * the provided string builder.
   *
   * @param  builder  The string builder.
   * @return  The string builder.
   */
  public abstract StringBuilder toString(StringBuilder builder);



  /**
   * Retrieves a string representation of this subtree specification
   * object.
   *
   * @return  A string representation of this subtree specification
   *          object.
   */
  @Override
  public final String toString()
  {
    StringBuilder builder = new StringBuilder();
    return toString(builder).toString();
  }
}

