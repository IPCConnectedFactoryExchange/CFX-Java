/*
 * Licensed to the Apache Software Foundation (ASF)under one
 * or more contributor license agreements.See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.The ASF licenses this file
 * to you under the Apache License, Version 2.0(the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * 
 * This file was automatically created
 * source: CFX.DLL, Version 1.1.6.0
 * created: 22.11.2019 10:40:17 by frankp
 */
package org.ipc.cfx.production;

import org.ipc.cfx.structures.Operator;
import org.ipc.cfx.structures.RecipeModificationReason;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent by a process endpoint to indicate that a change has been made to a specified named recipe.
            
            {
              &quot;RecipeName&quot;: &quot;RECIPE3234&quot;,
              &quot;Revision&quot;: &quot;D&quot;,
              &quot;ModifiedBy&quot;: {
                &quot;OperatorIdentifier&quot;: &quot;95739c63-7e59-481b-a597-627cb843c8f4&quot;,
                &quot;ActorType&quot;: &quot;Human&quot;,
                &quot;LastName&quot;: &quot;Smith&quot;,
                &quot;FirstName&quot;: &quot;Bill&quot;,
                &quot;LoginName&quot;: &quot;bill.smith@domain1.com&quot;
              },
              &quot;Reason&quot;: &quot;PositionalCorrection&quot;,
              &quot;Notes&quot;: null
            }
 * original type: CFX.Production.RecipeModified
 */
public class RecipeModified extends CFXMessage {

  private String recipeName;
  private String revision;
  private Operator modifiedBy;
  private RecipeModificationReason reason;
  private String notes;

  /**
   * The name of the recipe (may include full path, if applicable)
   * @param recipeName the value
   */
  @JsonSetter("RecipeName")
  public RecipeModified setRecipeName(String recipeName) {
    this.recipeName = recipeName;
    return this;
  }

  /**
   * The name of the recipe (may include full path, if applicable)
   *
   * @return never null
   */
  @JsonGetter("RecipeName")
  public String getRecipeName() {
    return recipeName == null ? "" : recipeName;
  }

  /**
   * Version number, e.g. “2.0” (Optional)
   * @param revision the value
   */
  @JsonSetter("Revision")
  public RecipeModified setRevision(String revision) {
    this.revision = revision;
    return this;
  }

  /**
   * Version number, e.g. “2.0” (Optional)
   *
   * @return never null
   */
  @JsonGetter("Revision")
  public String getRevision() {
    return revision == null ? "" : revision;
  }

  /**
   * The operator who performed the modification. (optional)
   * @param modifiedBy the value
   */
  @JsonSetter("ModifiedBy")
  public RecipeModified setModifiedBy(Operator modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

  /**
   * The operator who performed the modification. (optional)
   * @return ModifiedBy
   */
  @JsonGetter("ModifiedBy")
  public Operator getModifiedBy() {
    return modifiedBy;
  }

  /**
   * The reason for the modification.
   * @param reason the value
   */
  @JsonSetter("Reason")
  public RecipeModified setReason(RecipeModificationReason reason) {
    this.reason = reason;
    return this;
  }

  /**
   * The reason for the modification.
   * @return Reason
   */
  @JsonGetter("Reason")
  public RecipeModificationReason getReason() {
    return reason;
  }

  /**
   * Any additional notes provided by the user who performed the modification.
   * @param notes the value
   */
  @JsonSetter("Notes")
  public RecipeModified setNotes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Any additional notes provided by the user who performed the modification.
   *
   * @return never null
   */
  @JsonGetter("Notes")
  public String getNotes() {
    return notes == null ? "" : notes;
  }
}
