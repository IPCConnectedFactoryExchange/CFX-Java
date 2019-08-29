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
 * Sent by a process endpoint to indicate the activation of a recipe by its name
            
            {
              "RecipeName": "RECIPE3234",
              "Revision": "B",
              "Lane": 1,
              "Stage": null
            }
 * original type: CFX.Production.RecipeActivated
 */
public class RecipeActivated extends CFXMessage {

  private String recipeName;
  private String revision;
  private Integer lane;
  private Stage stage;
  private double expectedCycleTime;
  private double expectedUnitsPerWorkTransaction;

  /**
   * THe name of the recipe (may include full path, if applicable)
   */
  @JsonSetter("RecipeName")
  public void setRecipeName(String recipeName) {
    this.recipeName = recipeName;
  }

  /**
   * THe name of the recipe (may include full path, if applicable)
   *
   * @return never null
   */
  @JsonGetter("RecipeName")
  public String getRecipeName() {
    return recipeName == null ? "" : recipeName;
  }

  /**
   * Version number, e.g. “2.0” (Optional)
   */
  @JsonSetter("Revision")
  public void setRevision(String revision) {
    this.revision = revision;
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
   * Number of the production lane (if applicable)
   */
  @JsonSetter("Lane")
  public void setLane(Integer lane) {
    this.lane = lane;
  }

  /**
   * Number of the production lane (if applicable)
   */
  @JsonGetter("Lane")
  public Integer getLane() {
    return lane;
  }

  /**
   * An optional stage
   */
  @JsonSetter("Stage")
  public void setStage(Stage stage) {
    this.stage = stage;
  }

  /**
   * An optional stage
   */
  @JsonGetter("Stage")
  public Stage getStage() {
    return stage;
  }

  /**
   * The total amount of time that is expected to process one unit or group of units (as in the case of a carrier or panelized PCB), 
            assuming no blocked or starved conditions at the station.  This includes both productive and non-productive time, such as transfer, 
            positioning, etc.
   */
  @JsonSetter("ExpectedCycleTime")
  public void setExpectedCycleTime(double expectedCycleTime) {
    this.expectedCycleTime = expectedCycleTime;
  }

  /**
   * The total amount of time that is expected to process one unit or group of units (as in the case of a carrier or panelized PCB), 
            assuming no blocked or starved conditions at the station.  This includes both productive and non-productive time, such as transfer, 
            positioning, etc.
   */
  @JsonGetter("ExpectedCycleTime")
  public double getExpectedCycleTime() {
    return expectedCycleTime;
  }

  /**
   * The number of units that are to be processed simulataneously by this recipe.  For example, in the case of a 2 x 2 panelized PCB, this
            property would be 4 because 4 units (PCB's) are procesed at one time per work transaction.  In the case that a station processes a
            variable number of units per transaction, this should represent the average number of units expected to be processed per transaction.
   */
  @JsonSetter("ExpectedUnitsPerWorkTransaction")
  public void setExpectedUnitsPerWorkTransaction(double expectedUnitsPerWorkTransaction) {
    this.expectedUnitsPerWorkTransaction = expectedUnitsPerWorkTransaction;
  }

  /**
   * The number of units that are to be processed simulataneously by this recipe.  For example, in the case of a 2 x 2 panelized PCB, this
            property would be 4 because 4 units (PCB's) are procesed at one time per work transaction.  In the case that a station processes a
            variable number of units per transaction, this should represent the average number of units expected to be processed per transaction.
   */
  @JsonGetter("ExpectedUnitsPerWorkTransaction")
  public double getExpectedUnitsPerWorkTransaction() {
    return expectedUnitsPerWorkTransaction;
  }
}
