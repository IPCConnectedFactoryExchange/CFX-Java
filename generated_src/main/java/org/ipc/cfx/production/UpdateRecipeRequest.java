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
 * source: CFX.DLL, Version 1.1.3.0
 * created: 20.08.2019 15:52:37 by frankp
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
              "Overwrite": true,
              "Recipe": {
                "Name": "RECIPE234324",
                "Revision": "C",
                "MimeType": "application/octet-stream",
                "RecipeData": "//w0"
              },
              "Reason": "NewRevision"
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
   */
  @JsonSetter("Overwrite")
  public void setOverwrite(boolean overwrite) {
    this.overwrite = overwrite;
  }

  /**
   * If set to true, any existing Recipe at the Endpoint with the same name will be replaced by the Recipe
            provided in this request.  If set to False, the update request will not succeed if a Recipe with the same
            name exists at the Endpoint.
   */
  @JsonGetter("Overwrite")
  public boolean isOverwrite() {
    return overwrite;
  }

  /**
   * The new Recipe to be sent to the Endpoint.
   */
  @JsonSetter("Recipe")
  public void setRecipe(Recipe recipe) {
    this.recipe = recipe;
  }

  /**
   * The new Recipe to be sent to the Endpoint.
   */
  @JsonGetter("Recipe")
  public Recipe getRecipe() {
    return recipe;
  }

  /**
   * The reason for the update
   */
  @JsonSetter("Reason")
  public void setReason(RecipeModificationReason reason) {
    this.reason = reason;
  }

  /**
   * The reason for the update
   */
  @JsonGetter("Reason")
  public RecipeModificationReason getReason() {
    return reason;
  }
}
