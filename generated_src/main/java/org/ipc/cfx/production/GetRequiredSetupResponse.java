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
              "Result": {
                "Result": "Success",
                "ResultCode": 0,
                "Message": "OK"
              },
              "RecipeName": "RECIPE4455",
              "RecipeRevision": "C",
              "Lane": 1,
              "Stage": {
                "StageSequence": 1,
                "StageName": "STAGE1",
                "StageType": "Work"
              },
              "SetupRequirements": {
                "Lane": 1,
                "Stage": {
                  "StageSequence": 1,
                  "StageName": "STAGE1",
                  "StageType": "Work"
                },
                "SetupName": "COMMONSETUP45",
                "MaterialSetupRequirements": [
                  {
                    "Position": "B1.F.45",
                    "PartNumber": "IPN1123",
                    "ApprovedAlternateParts": [
                      "IPN2343",
                      "IPN3432"
                    ],
                    "ApprovedManufacturerParts": [
                      "MOT4329",
                      "SAM5566"
                    ]
                  },
                  {
                    "Position": "B1.F.47",
                    "PartNumber": "IPN1124",
                    "ApprovedAlternateParts": [
                      "IPN3344",
                      "IPN3376"
                    ],
                    "ApprovedManufacturerParts": [
                      "JP55443",
                      "TX554323"
                    ]
                  }
                ],
                "ToolSetupRequirements": [
                  {
                    "Position": "MODULE1.BEAM1",
                    "PartNumber": "HEADTYPE5566",
                    "ToolIdentifier": null
                  },
                  {
                    "Position": "MODULE1.BEAM2",
                    "PartNumber": "HEADTYPE5577",
                    "ToolIdentifier": null
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
   */
  @JsonSetter("Result")
  public void setResult(RequestResult result) {
    this.result = result;
  }

  /**
   * Result of the request
   */
  @JsonGetter("Result")
  public RequestResult getResult() {
    return result;
  }

  /**
   * The name of the recipe associated with the required setup.
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
   */
  @JsonSetter("Lane")
  public void setLane(Integer lane) {
    this.lane = lane;
  }

  /**
   * An optional property designating the specific Lane associated with this setup.
   */
  @JsonGetter("Lane")
  public Integer getLane() {
    return lane;
  }

  /**
   * An optional property designating the specific Stage associated with this setup.
   */
  @JsonSetter("Stage")
  public void setStage(Stage stage) {
    this.stage = stage;
  }

  /**
   * An optional property designating the specific Stage associated with this setup.
   */
  @JsonGetter("Stage")
  public Stage getStage() {
    return stage;
  }

  /**
   * 
   */
  @JsonSetter("SetupRequirements")
  public void setSetupRequirements(StationSetupRequirements setupRequirements) {
    this.setupRequirements = setupRequirements;
  }

  /**
   * 
   */
  @JsonGetter("SetupRequirements")
  public StationSetupRequirements getSetupRequirements() {
    return setupRequirements;
  }
}
