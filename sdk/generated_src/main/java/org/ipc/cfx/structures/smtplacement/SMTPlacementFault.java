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
package org.ipc.cfx.structures.smtplacement;

import org.ipc.cfx.structures.ComponentDesignator;
import org.ipc.cfx.structures.MaterialLocation;
import org.ipc.cfx.structures.Fault;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * A specific type of fault that is produced by endpoints responsible
            for the picking and placing of SMD components
 * original type: CFX.Structures.SMTPlacement.SMTPlacementFault
 */
public class SMTPlacementFault extends Fault {

  private SMTPlacementFaultType placementFaultType;
  private int programStep;
  private ComponentDesignator designator;
  private MaterialLocation materialLocation;
  private SMTHeadAndNozzle headAndNozzle;

  /**
   * The specific type of SMT placement fault
   * @param placementFaultType the value
   */
  @JsonSetter("PlacementFaultType")
  public SMTPlacementFault setPlacementFaultType(SMTPlacementFaultType placementFaultType) {
    this.placementFaultType = placementFaultType;
    return this;
  }

  /**
   * The specific type of SMT placement fault
   * @return PlacementFaultType
   */
  @JsonGetter("PlacementFaultType")
  public SMTPlacementFaultType getPlacementFaultType() {
    return placementFaultType;
  }

  /**
   * An integer representing the step in the program/recipe that was
            being executed when the fault occurred (where applicable)
   * @param programStep the value
   */
  @JsonSetter("ProgramStep")
  public SMTPlacementFault setProgramStep(int programStep) {
    this.programStep = programStep;
    return this;
  }

  /**
   * An integer representing the step in the program/recipe that was
            being executed when the fault occurred (where applicable)
   * @return ProgramStep
   */
  @JsonGetter("ProgramStep")
  public int getProgramStep() {
    return programStep;
  }

  /**
   * Identifies the specific component the placer was trying to place
            when the fault occurred (where applicable)
   * @param designator the value
   */
  @JsonSetter("Designator")
  public SMTPlacementFault setDesignator(ComponentDesignator designator) {
    this.designator = designator;
    return this;
  }

  /**
   * Identifies the specific component the placer was trying to place
            when the fault occurred (where applicable)
   * @return Designator
   */
  @JsonGetter("Designator")
  public ComponentDesignator getDesignator() {
    return designator;
  }

  /**
   * The material carrier location related to this fault (where applicable)
   * @param materialLocation the value
   */
  @JsonSetter("MaterialLocation")
  public SMTPlacementFault setMaterialLocation(MaterialLocation materialLocation) {
    this.materialLocation = materialLocation;
    return this;
  }

  /**
   * The material carrier location related to this fault (where applicable)
   * @return MaterialLocation
   */
  @JsonGetter("MaterialLocation")
  public MaterialLocation getMaterialLocation() {
    return materialLocation;
  }

  /**
   * The placement head and nozzle related to this fault (where applicable)
   * @param headAndNozzle the value
   */
  @JsonSetter("HeadAndNozzle")
  public SMTPlacementFault setHeadAndNozzle(SMTHeadAndNozzle headAndNozzle) {
    this.headAndNozzle = headAndNozzle;
    return this;
  }

  /**
   * The placement head and nozzle related to this fault (where applicable)
   * @return HeadAndNozzle
   */
  @JsonGetter("HeadAndNozzle")
  public SMTHeadAndNozzle getHeadAndNozzle() {
    return headAndNozzle;
  }
}
