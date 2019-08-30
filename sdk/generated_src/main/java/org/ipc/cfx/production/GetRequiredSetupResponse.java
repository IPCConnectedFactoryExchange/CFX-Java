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
import org.ipc.cfx.structures.Stage;
import org.ipc.cfx.structures.StationSetupRequirements;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Response from a process endpoint to a request to obtain the setup requirements of the active recipe.
            The response lists the required materials and tools, along with the locations where 
            the materials/tools must be loaded.
            
            {
              &quot;Result&quot;: {
                &quot;Result&quot;: &quot;Success&quot;,
                &quot;ResultCode&quot;: 0,
                &quot;Message&quot;: &quot;OK&quot;
              },
              &quot;RecipeName&quot;: &quot;RECIPE4455&quot;,
              &quot;RecipeRevision&quot;: &quot;C&quot;,
              &quot;Lane&quot;: 1,
              &quot;Stage&quot;: {
                &quot;StageSequence&quot;: 1,
                &quot;StageName&quot;: &quot;STAGE1&quot;,
                &quot;StageType&quot;: &quot;Work&quot;
              },
              &quot;SetupRequirements&quot;: {
                &quot;Lane&quot;: 1,
                &quot;Stage&quot;: {
                  &quot;StageSequence&quot;: 1,
                  &quot;StageName&quot;: &quot;STAGE1&quot;,
                  &quot;StageType&quot;: &quot;Work&quot;
                },
                &quot;SetupName&quot;: &quot;COMMONSETUP45&quot;,
                &quot;MaterialSetupRequirements&quot;: [
                  {
                    &quot;Position&quot;: &quot;B1.F.45&quot;,
                    &quot;PartNumber&quot;: &quot;IPN1123&quot;,
                    &quot;ApprovedAlternateParts&quot;: [
                      &quot;IPN2343&quot;,
                      &quot;IPN3432&quot;
                    ],
                    &quot;ApprovedManufacturerParts&quot;: [
                      &quot;MOT4329&quot;,
                      &quot;SAM5566&quot;
                    ]
                  },
                  {
                    &quot;Position&quot;: &quot;B1.F.47&quot;,
                    &quot;PartNumber&quot;: &quot;IPN1124&quot;,
                    &quot;ApprovedAlternateParts&quot;: [
                      &quot;IPN3344&quot;,
                      &quot;IPN3376&quot;
                    ],
                    &quot;ApprovedManufacturerParts&quot;: [
                      &quot;JP55443&quot;,
                      &quot;TX554323&quot;
                    ]
                  }
                ],
                &quot;ToolSetupRequirements&quot;: [
                  {
                    &quot;Position&quot;: &quot;MODULE1.BEAM1&quot;,
                    &quot;PartNumber&quot;: &quot;HEADTYPE5566&quot;,
                    &quot;ToolIdentifier&quot;: null
                  },
                  {
                    &quot;Position&quot;: &quot;MODULE1.BEAM2&quot;,
                    &quot;PartNumber&quot;: &quot;HEADTYPE5577&quot;,
                    &quot;ToolIdentifier&quot;: null
                  }
                ]
              }
            }
 * original type: CFX.Production.GetRequiredSetupResponse
 */
public class GetRequiredSetupResponse extends CFXMessage {

  private RequestResult result;
  private String recipeName;
  private String recipeRevision;
  private Integer lane;
  private Stage stage;
  private StationSetupRequirements setupRequirements;

  /**
   * Result of the request
   * @param result the value
   */
  @JsonSetter("Result")
  public void setResult(RequestResult result) {
    this.result = result;
  }

  /**
   * Result of the request
   * @return Result
   */
  @JsonGetter("Result")
  public RequestResult getResult() {
    return result;
  }

  /**
   * The name of the recipe associated with the required setup.
   * @param recipeName the value
   */
  @JsonSetter("RecipeName")
  public void setRecipeName(String recipeName) {
    this.recipeName = recipeName;
  }

  /**
   * The name of the recipe associated with the required setup.
   *
   * @return never null
   */
  @JsonGetter("RecipeName")
  public String getRecipeName() {
    return recipeName == null ? "" : recipeName;
  }

  /**
   * 
   * @param recipeRevision the value
   */
  @JsonSetter("RecipeRevision")
  public void setRecipeRevision(String recipeRevision) {
    this.recipeRevision = recipeRevision;
  }

  /**
   * 
   *
   * @return never null
   */
  @JsonGetter("RecipeRevision")
  public String getRecipeRevision() {
    return recipeRevision == null ? "" : recipeRevision;
  }

  /**
   * An optional property designating the specific Lane associated with this setup.
   * @param lane the value
   */
  @JsonSetter("Lane")
  public void setLane(Integer lane) {
    this.lane = lane;
  }

  /**
   * An optional property designating the specific Lane associated with this setup.
   * @return Lane
   */
  @JsonGetter("Lane")
  public Integer getLane() {
    return lane;
  }

  /**
   * An optional property designating the specific Stage associated with this setup.
   * @param stage the value
   */
  @JsonSetter("Stage")
  public void setStage(Stage stage) {
    this.stage = stage;
  }

  /**
   * An optional property designating the specific Stage associated with this setup.
   * @return Stage
   */
  @JsonGetter("Stage")
  public Stage getStage() {
    return stage;
  }

  /**
   * 
   * @param setupRequirements the value
   */
  @JsonSetter("SetupRequirements")
  public void setSetupRequirements(StationSetupRequirements setupRequirements) {
    this.setupRequirements = setupRequirements;
  }

  /**
   * 
   * @return SetupRequirements
   */
  @JsonGetter("SetupRequirements")
  public StationSetupRequirements getSetupRequirements() {
    return setupRequirements;
  }
}
