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
package org.ipc.cfx.structures.solderreflow;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Structure defining the parameters for a particular zone within a solder reflow oven.
 * original type: CFX.Structures.SolderReflow.ReflowZoneParameter
 */
public class ReflowZoneParameter {

  private ReflowZone zone;
  private ReflowSetPoint[] setpoints;

  /**
   * The related Zone (Stage)
   * @param zone the value
   */
  @JsonSetter("Zone")
  public ReflowZoneParameter setZone(ReflowZone zone) {
    this.zone = zone;
    return this;
  }

  /**
   * The related Zone (Stage)
   * @return Zone
   */
  @JsonGetter("Zone")
  public ReflowZone getZone() {
    return zone;
  }

  /**
   * A list of setpoints of varying types for each sub-area within this zone.
   * @param setpoints the value
   */
  @JsonSetter("Setpoints")
  public ReflowZoneParameter setSetpoints(ReflowSetPoint[] setpoints) {
    this.setpoints = setpoints;
    return this;
  }

  /**
   * A list of setpoints of varying types for each sub-area within this zone.
   * @return Setpoints
   */
  @JsonGetter("Setpoints")
  public ReflowSetPoint[] getSetpoints() {
    return setpoints;
  }
}
