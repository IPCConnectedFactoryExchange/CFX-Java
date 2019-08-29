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
 * created: 20.08.2019 15:52:36 by frankp
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
   */
  @JsonSetter("Lane")
  public void setLane(Integer lane) {
    this.lane = lane;
  }

  /**
   * The production lane to which this setup applies (when applicable)
   */
  @JsonGetter("Lane")
  public Integer getLane() {
    return lane;
  }

  /**
   * The stage to which this setup applies (when applicable)
   */
  @JsonSetter("Stage")
  public void setStage(Stage stage) {
    this.stage = stage;
  }

  /**
   * The stage to which this setup applies (when applicable)
   */
  @JsonGetter("Stage")
  public Stage getStage() {
    return stage;
  }

  /**
   * An optional name for this particular setup
   */
  @JsonSetter("SetupName")
  public void setSetupName(String setupName) {
    this.setupName = setupName;
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
   */
  @JsonSetter("MaterialSetupRequirements")
  public void setMaterialSetupRequirements(MaterialSetupRequirement[] materialSetupRequirements) {
    this.materialSetupRequirements = materialSetupRequirements;
  }

  /**
   * A list of the materials that need to be installed / loaded at the process endpoint
            to perform a particular process.
   */
  @JsonGetter("MaterialSetupRequirements")
  public MaterialSetupRequirement[] getMaterialSetupRequirements() {
    return materialSetupRequirements;
  }

  /**
   * A list of the tools (heads, nozzels, hammers, wrenches, etc.) that need to be installed / loaded at the 
            process endpoint to perform a particular process.
   */
  @JsonSetter("ToolSetupRequirements")
  public void setToolSetupRequirements(ToolSetupRequirement[] toolSetupRequirements) {
    this.toolSetupRequirements = toolSetupRequirements;
  }

  /**
   * A list of the tools (heads, nozzels, hammers, wrenches, etc.) that need to be installed / loaded at the 
            process endpoint to perform a particular process.
   */
  @JsonGetter("ToolSetupRequirements")
  public ToolSetupRequirement[] getToolSetupRequirements() {
    return toolSetupRequirements;
  }
}
