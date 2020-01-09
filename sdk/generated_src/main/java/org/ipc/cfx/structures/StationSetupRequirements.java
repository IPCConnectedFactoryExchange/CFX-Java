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

/**
 * Describes the material setup requirements for a particular process endpoint to perform a 
            particular operation on one or more partiuclar products.  Also includes information on
            where specifically the materials should be loaded (when applicable), AML (where applicable),
            and alternate part information (where applicable).
 * original type: CFX.Structures.StationSetupRequirements
 */
public class StationSetupRequirements {

  private Integer lane;
  private Stage stage;
  private String setupName;
  private MaterialSetupRequirement[] materialSetupRequirements;
  private ToolSetupRequirement[] toolSetupRequirements;

  /**
   * The production lane to which this setup applies (when applicable)
   * @param lane the value
   */
  @JsonSetter("Lane")
  public StationSetupRequirements setLane(Integer lane) {
    this.lane = lane;
    return this;
  }

  /**
   * The production lane to which this setup applies (when applicable)
   * @return Lane
   */
  @JsonGetter("Lane")
  public Integer getLane() {
    return lane;
  }

  /**
   * The stage to which this setup applies (when applicable)
   * @param stage the value
   */
  @JsonSetter("Stage")
  public StationSetupRequirements setStage(Stage stage) {
    this.stage = stage;
    return this;
  }

  /**
   * The stage to which this setup applies (when applicable)
   * @return Stage
   */
  @JsonGetter("Stage")
  public Stage getStage() {
    return stage;
  }

  /**
   * An optional name for this particular setup
   * @param setupName the value
   */
  @JsonSetter("SetupName")
  public StationSetupRequirements setSetupName(String setupName) {
    this.setupName = setupName;
    return this;
  }

  /**
   * An optional name for this particular setup
   *
   * @return never null
   */
  @JsonGetter("SetupName")
  public String getSetupName() {
    return setupName == null ? "" : setupName;
  }

  /**
   * A list of the materials that need to be installed / loaded at the process endpoint
            to perform a particular process.
   * @param materialSetupRequirements the value
   */
  @JsonSetter("MaterialSetupRequirements")
  public StationSetupRequirements setMaterialSetupRequirements(MaterialSetupRequirement[] materialSetupRequirements) {
    this.materialSetupRequirements = materialSetupRequirements;
    return this;
  }

  /**
   * A list of the materials that need to be installed / loaded at the process endpoint
            to perform a particular process.
   * @return MaterialSetupRequirements
   */
  @JsonGetter("MaterialSetupRequirements")
  public MaterialSetupRequirement[] getMaterialSetupRequirements() {
    return materialSetupRequirements;
  }

  /**
   * A list of the tools (heads, nozzels, hammers, wrenches, etc.) that need to be installed / loaded at the 
            process endpoint to perform a particular process.
   * @param toolSetupRequirements the value
   */
  @JsonSetter("ToolSetupRequirements")
  public StationSetupRequirements setToolSetupRequirements(ToolSetupRequirement[] toolSetupRequirements) {
    this.toolSetupRequirements = toolSetupRequirements;
    return this;
  }

  /**
   * A list of the tools (heads, nozzels, hammers, wrenches, etc.) that need to be installed / loaded at the 
            process endpoint to perform a particular process.
   * @return ToolSetupRequirements
   */
  @JsonGetter("ToolSetupRequirements")
  public ToolSetupRequirement[] getToolSetupRequirements() {
    return toolSetupRequirements;
  }
}
