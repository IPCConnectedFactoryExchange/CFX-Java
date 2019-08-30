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
 * created: 30.08.2019 09:11:09 by frankp
 */
package org.ipc.cfx.production;

import org.ipc.cfx.structures.RequestResult;
import org.ipc.cfx.structures.Recipe;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This message is used to request a process endpoint for the details of a named
            recipe. The response includes details of the recipe, depending on the 
            classification of the process.
            
            {
              &quot;Result&quot;: {
                &quot;Result&quot;: &quot;Success&quot;,
                &quot;ResultCode&quot;: 0,
                &quot;Message&quot;: null
              },
              &quot;Recipe&quot;: {
                &quot;Name&quot;: &quot;RECIPE4455&quot;,
                &quot;Revision&quot;: null,
                &quot;MimeType&quot;: &quot;application/octet-stream&quot;,
                &quot;RecipeData&quot;: &quot;ESKImSNVZlM=&quot;
              }
            }
 * original type: CFX.Production.GetRecipeResponse
 */
public class GetRecipeResponse extends CFXMessage {

  private RequestResult result;
  private Recipe recipe;

  /**
   * The result of the request
   * @param result the value
   */
  @JsonSetter("Result")
  public void setResult(RequestResult result) {
    this.result = result;
  }

  /**
   * The result of the request
   * @return Result
   */
  @JsonGetter("Result")
  public RequestResult getResult() {
    return result;
  }

  /**
   * The recipe.  This is a dynamic structure tha supports specialized recipe types 
            for different types of equipment.
   * @param recipe the value
   */
  @JsonSetter("Recipe")
  public void setRecipe(Recipe recipe) {
    this.recipe = recipe;
  }

  /**
   * The recipe.  This is a dynamic structure tha supports specialized recipe types 
            for different types of equipment.
   * @return Recipe
   */
  @JsonGetter("Recipe")
  public Recipe getRecipe() {
    return recipe;
  }
}
