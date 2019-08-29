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
package org.ipc.cfx.structures.solderreflow;

import org.ipc.cfx.structures.Parameter;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Dynamic Parameter structure containing the configurable parameters of a solder reflow oven.
 * original type: CFX.Structures.SolderReflow.ReflowOvenParameter
 */
public class ReflowOvenParameter extends Parameter {

  private double conveyorSpeedSetpoint;
  private double conveyorWidth;
  private ReflowZoneParameter[] zoneParameters;

  /**
   * The desired conveyor speed, expressed in centimeters per minute (cm / min)
   */
  @JsonSetter("ConveyorSpeedSetpoint")
  public void setConveyorSpeedSetpoint(double conveyorSpeedSetpoint) {
    this.conveyorSpeedSetpoint = conveyorSpeedSetpoint;
  }

  /**
   * The desired conveyor speed, expressed in centimeters per minute (cm / min)
   */
  @JsonGetter("ConveyorSpeedSetpoint")
  public double getConveyorSpeedSetpoint() {
    return conveyorSpeedSetpoint;
  }

  /**
   * The width of the conveyor, expressed in centimeters (cm)
   */
  @JsonSetter("ConveyorWidth")
  public void setConveyorWidth(double conveyorWidth) {
    this.conveyorWidth = conveyorWidth;
  }

  /**
   * The width of the conveyor, expressed in centimeters (cm)
   */
  @JsonGetter("ConveyorWidth")
  public double getConveyorWidth() {
    return conveyorWidth;
  }

  /**
   * A list of the structures defining the parameters for each zone.
   */
  @JsonSetter("ZoneParameters")
  public void setZoneParameters(ReflowZoneParameter[] zoneParameters) {
    this.zoneParameters = zoneParameters;
  }

  /**
   * A list of the structures defining the parameters for each zone.
   */
  @JsonGetter("ZoneParameters")
  public ReflowZoneParameter[] getZoneParameters() {
    return zoneParameters;
  }
}
