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

import org.ipc.cfx.structures.Stage;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Used to activate a named recipe at the process endpoint. 
            The response indicates whether this was successful or not.
            
            {
              "RecipeName": "RECIPE1234",
              "Revision": "C",
              "Lane": 1,
              "Stage": {
                "StageSequence": 1,
                "StageName": "STAGE1",
                "StageType": "Work"
              }
            }
 * original type: CFX.Production.ActivateRecipeRequest
 */
public class ActivateRecipeRequest extends CFXMessage {

  private String recipeName;
  private String revision;
  private Integer lane;
  private Stage stage;

  /**
   * The name of the recipe. (may include full path, if applicable)
   */
  @JsonSetter("RecipeName")
  public void setRecipeName(String recipeName) {
    this.recipeName = recipeName;
  }

  /**
   * The name of the recipe. (may include full path, if applicable)
   *
   * @return never null
   */
  @JsonGetter("RecipeName")
  public String getRecipeName() {
    return recipeName == null ? "" : recipeName;
  }

  /**
   * The version indicator for the recipe (optional)
   */
  @JsonSetter("Revision")
  public void setRevision(String revision) {
    this.revision = revision;
  }

  /**
   * The version indicator for the recipe (optional)
   *
   * @return never null
   */
  @JsonGetter("Revision")
  public String getRevision() {
    return revision == null ? "" : revision;
  }

  /**
   * The optional number of the production lane where 
            the recipe should be activated
   */
  @JsonSetter("Lane")
  public void setLane(Integer lane) {
    this.lane = lane;
  }

  /**
   * The optional number of the production lane where 
            the recipe should be activated
   */
  @JsonGetter("Lane")
  public Integer getLane() {
    return lane;
  }

  /**
   * The optional name or number of the stage where
            the recipe should be activated
   */
  @JsonSetter("Stage")
  public void setStage(Stage stage) {
    this.stage = stage;
  }

  /**
   * The optional name or number of the stage where
            the recipe should be activated
   */
  @JsonGetter("Stage")
  public Stage getStage() {
    return stage;
  }
}