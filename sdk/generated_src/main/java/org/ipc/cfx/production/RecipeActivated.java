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

import org.ipc.cfx.structures.Stage;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent by a process endpoint to indicate the activation of a recipe by its name
    <pre>        
            {
              &quot;RecipeName&quot;: &quot;RECIPE3234&quot;,
              &quot;Revision&quot;: &quot;B&quot;,
              &quot;Lane&quot;: 1,
              &quot;Stage&quot;: null
            }</pre>
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
   * @param recipeName the value
   */
  @JsonSetter("RecipeName")
  public RecipeActivated setRecipeName(String recipeName) {
    this.recipeName = recipeName;
    return this;
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
   * @param revision the value
   */
  @JsonSetter("Revision")
  public RecipeActivated setRevision(String revision) {
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
   * Number of the production lane (if applicable)
   * @param lane the value
   */
  @JsonSetter("Lane")
  public RecipeActivated setLane(Integer lane) {
    this.lane = lane;
    return this;
  }

  /**
   * Number of the production lane (if applicable)
   * @return Lane
   */
  @JsonGetter("Lane")
  public Integer getLane() {
    return lane;
  }

  /**
   * An optional stage
   * @param stage the value
   */
  @JsonSetter("Stage")
  public RecipeActivated setStage(Stage stage) {
    this.stage = stage;
    return this;
  }

  /**
   * An optional stage
   * @return Stage
   */
  @JsonGetter("Stage")
  public Stage getStage() {
    return stage;
  }

  /**
   * The total amount of time that is expected to process one unit or group of units (as in the case of a carrier or panelized PCB), 
            assuming no blocked or starved conditions at the station.  This includes both productive and non-productive time, such as transfer, 
            positioning, etc.
   * @param expectedCycleTime the value
   */
  @JsonSetter("ExpectedCycleTime")
  public RecipeActivated setExpectedCycleTime(double expectedCycleTime) {
    this.expectedCycleTime = expectedCycleTime;
    return this;
  }

  /**
   * The total amount of time that is expected to process one unit or group of units (as in the case of a carrier or panelized PCB), 
            assuming no blocked or starved conditions at the station.  This includes both productive and non-productive time, such as transfer, 
            positioning, etc.
   * @return ExpectedCycleTime
   */
  @JsonGetter("ExpectedCycleTime")
  public double getExpectedCycleTime() {
    return expectedCycleTime;
  }

  /**
   * The number of units that are to be processed simulataneously by this recipe.  For example, in the case of a 2 x 2 panelized PCB, this
            property would be 4 because 4 units (PCB&apos;s) are procesed at one time per work transaction.  In the case that a station processes a
            variable number of units per transaction, this should represent the average number of units expected to be processed per transaction.
   * @param expectedUnitsPerWorkTransaction the value
   */
  @JsonSetter("ExpectedUnitsPerWorkTransaction")
  public RecipeActivated setExpectedUnitsPerWorkTransaction(double expectedUnitsPerWorkTransaction) {
    this.expectedUnitsPerWorkTransaction = expectedUnitsPerWorkTransaction;
    return this;
  }

  /**
   * The number of units that are to be processed simulataneously by this recipe.  For example, in the case of a 2 x 2 panelized PCB, this
            property would be 4 because 4 units (PCB&apos;s) are procesed at one time per work transaction.  In the case that a station processes a
            variable number of units per transaction, this should represent the average number of units expected to be processed per transaction.
   * @return ExpectedUnitsPerWorkTransaction
   */
  @JsonGetter("ExpectedUnitsPerWorkTransaction")
  public double getExpectedUnitsPerWorkTransaction() {
    return expectedUnitsPerWorkTransaction;
  }
}
