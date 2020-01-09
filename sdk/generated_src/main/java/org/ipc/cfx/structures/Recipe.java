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
package org.ipc.cfx.structures;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import org.ipc.cfx.structures.pcbinspection.PCBInspectionRecipe;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

/**
 * Represents a collection of instructions used by a piece of automated equipment to perform
            a function (typically upon a production unit) during production.
 * original type: CFX.Structures.Recipe
 */
@JsonTypeInfo(use = Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "$type")
@JsonSubTypes({
  @Type(value = PCBInspectionRecipe.class, name = "CFX.Structures.PCBInspection.PCBInspectionRecipe, CFX"),
})
public class Recipe {

  private String name;
  private String revision;
  private double expectedCycleTime;
  private double expectedUnitsPerWorkTransaction;
  private String mimeType;
  private Byte[] recipeData;

  /**
   * The name of the recipe (may include full path, if applicable)
   * @param name the value
   */
  @JsonSetter("Name")
  public Recipe setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the recipe (may include full path, if applicable)
   *
   * @return never null
   * property inherited from Recipe 
   */
  @JsonGetter("Name")
  public String getName() {
    return name == null ? "" : name;
  }

  /**
   * An optional version number, e.g. “2.0”
   * @param revision the value
   */
  @JsonSetter("Revision")
  public Recipe setRevision(String revision) {
    this.revision = revision;
    return this;
  }

  /**
   * An optional version number, e.g. “2.0”
   *
   * @return never null
   */
  @JsonGetter("Revision")
  public String getRevision() {
    return revision == null ? "" : revision;
  }

  /**
   * The total amount of time that is expected to process one unit or group of units (as in the case of a carrier or panelized PCB), 
            assuming no blocked or starved conditions at the station.  This includes both productive and non-productive time, such as transfer, 
            positioning, etc.
   * @param expectedCycleTime the value
   */
  @JsonSetter("ExpectedCycleTime")
  public Recipe setExpectedCycleTime(double expectedCycleTime) {
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
  public Recipe setExpectedUnitsPerWorkTransaction(double expectedUnitsPerWorkTransaction) {
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

  /**
   * The MIME type of the binary data contained by the RecipeData property.
   * @param mimeType the value
   */
  @JsonSetter("MimeType")
  public Recipe setMimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  /**
   * The MIME type of the binary data contained by the RecipeData property.
   *
   * @return never null
   */
  @JsonGetter("MimeType")
  public String getMimeType() {
    return mimeType == null ? "" : mimeType;
  }

  /**
   * A binary representation of the recipe data.
   * @param recipeData the value
   */
  @JsonSetter("RecipeData")
  public Recipe setRecipeData(Byte[] recipeData) {
    this.recipeData = recipeData;
    return this;
  }

  /**
   * A binary representation of the recipe data.
   * @return RecipeData
   */
  @JsonGetter("RecipeData")
  public Byte[] getRecipeData() {
    return recipeData;
  }
}
