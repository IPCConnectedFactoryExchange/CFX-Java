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
package org.ipc.cfx.structures.solderreflow;

import org.ipc.cfx.structures.ProcessData;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Provides information about the conditions within a reflow oven at a given point in time.
 * original type: CFX.Structures.SolderReflow.ReflowProcessData
 */
public class ReflowProcessData extends ProcessData {

  private double conveyorSpeed;
  private double conveyorSpeedSetpoint;
  private ReflowZoneData[] zoneData;

  /**
   * The speed (in cm / minute) of the conveyor
   * @param conveyorSpeed the value
   */
  @JsonSetter("ConveyorSpeed")
  public void setConveyorSpeed(double conveyorSpeed) {
    this.conveyorSpeed = conveyorSpeed;
  }

  /**
   * The speed (in cm / minute) of the conveyor
   * @return ConveyorSpeed
   */
  @JsonGetter("ConveyorSpeed")
  public double getConveyorSpeed() {
    return conveyorSpeed;
  }

  /**
   * The converyor speed setpoint (in cm / minute)
   * @param conveyorSpeedSetpoint the value
   */
  @JsonSetter("ConveyorSpeedSetpoint")
  public void setConveyorSpeedSetpoint(double conveyorSpeedSetpoint) {
    this.conveyorSpeedSetpoint = conveyorSpeedSetpoint;
  }

  /**
   * The converyor speed setpoint (in cm / minute)
   * @return ConveyorSpeedSetpoint
   */
  @JsonGetter("ConveyorSpeedSetpoint")
  public double getConveyorSpeedSetpoint() {
    return conveyorSpeedSetpoint;
  }

  /**
   * Process data (temperatures, etc.) for each zone of the reflow oven at the 
            time when this transaction tool place.
   * @param zoneData the value
   */
  @JsonSetter("ZoneData")
  public void setZoneData(ReflowZoneData[] zoneData) {
    this.zoneData = zoneData;
  }

  /**
   * Process data (temperatures, etc.) for each zone of the reflow oven at the 
            time when this transaction tool place.
   * @return ZoneData
   */
  @JsonGetter("ZoneData")
  public ReflowZoneData[] getZoneData() {
    return zoneData;
  }
}
