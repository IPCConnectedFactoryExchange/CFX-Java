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

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * A data structure describing the set point for a particular area within a zone of a solder reflow oven.
 * original type: CFX.Structures.SolderReflow.ReflowSetPoint
 */
public class ReflowSetPoint {

  private ReflowSubZoneType subZone;
  private ReflowSetpointType setpointType;
  private Double setpoint;

  /**
   * The area within the zone to which the setpoint applies.
   * @param subZone the value
   */
  @JsonSetter("SubZone")
  public void setSubZone(ReflowSubZoneType subZone) {
    this.subZone = subZone;
  }

  /**
   * The area within the zone to which the setpoint applies.
   * @return SubZone
   */
  @JsonGetter("SubZone")
  public ReflowSubZoneType getSubZone() {
    return subZone;
  }

  /**
   * An enumeration describing the type of setpoint.
   * @param setpointType the value
   */
  @JsonSetter("SetpointType")
  public void setSetpointType(ReflowSetpointType setpointType) {
    this.setpointType = setpointType;
  }

  /**
   * An enumeration describing the type of setpoint.
   * @return SetpointType
   */
  @JsonGetter("SetpointType")
  public ReflowSetpointType getSetpointType() {
    return setpointType;
  }

  /**
   * The nominal, target value of this setpoint.
   * @param setpoint the value
   */
  @JsonSetter("Setpoint")
  public void setSetpoint(Double setpoint) {
    this.setpoint = setpoint;
  }

  /**
   * The nominal, target value of this setpoint.
   * @return Setpoint
   */
  @JsonGetter("Setpoint")
  public Double getSetpoint() {
    return setpoint;
  }
}
