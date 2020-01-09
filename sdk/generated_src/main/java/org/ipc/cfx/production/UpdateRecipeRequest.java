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

import org.ipc.cfx.structures.Recipe;
import org.ipc.cfx.structures.RecipeModificationReason;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This message is used to send a named recipe to a process endpoint. The message
            includes details of the recipe, depending on the classification of the process. 
            The response indicates whether the recipe has been received correctly or not.
            
            {
              &quot;Overwrite&quot;: true,
              &quot;Recipe&quot;: {
                &quot;Name&quot;: &quot;RECIPE234324&quot;,
                &quot;Revision&quot;: &quot;C&quot;,
                &quot;MimeType&quot;: &quot;application/octet-stream&quot;,
                &quot;RecipeData&quot;: &quot;//w0&quot;
              },
              &quot;Reason&quot;: &quot;NewRevision&quot;
            }
 * original type: CFX.Production.UpdateRecipeRequest
 */
public class UpdateRecipeRequest extends CFXMessage {

  private boolean overwrite;
  private Recipe recipe;
  private RecipeModificationReason reason;

  /**
   * If set to true, any existing Recipe at the Endpoint with the same name will be replaced by the Recipe
            provided in this request.  If set to False, the update request will not succeed if a Recipe with the same
            name exists at the Endpoint.
   * @param overwrite the value
   */
  @JsonSetter("Overwrite")
  public UpdateRecipeRequest setOverwrite(boolean overwrite) {
    this.overwrite = overwrite;
    return this;
  }

  /**
   * If set to true, any existing Recipe at the Endpoint with the same name will be replaced by the Recipe
            provided in this request.  If set to False, the update request will not succeed if a Recipe with the same
            name exists at the Endpoint.
   * @return Overwrite
   */
  @JsonGetter("Overwrite")
  public boolean isOverwrite() {
    return overwrite;
  }

  /**
   * The new Recipe to be sent to the Endpoint.
   * @param recipe the value
   */
  @JsonSetter("Recipe")
  public UpdateRecipeRequest setRecipe(Recipe recipe) {
    this.recipe = recipe;
    return this;
  }

  /**
   * The new Recipe to be sent to the Endpoint.
   * @return Recipe
   */
  @JsonGetter("Recipe")
  public Recipe getRecipe() {
    return recipe;
  }

  /**
   * The reason for the update
   * @param reason the value
   */
  @JsonSetter("Reason")
  public UpdateRecipeRequest setReason(RecipeModificationReason reason) {
    this.reason = reason;
    return this;
  }

  /**
   * The reason for the update
   * @return Reason
   */
  @JsonGetter("Reason")
  public RecipeModificationReason getReason() {
    return reason;
  }
}
