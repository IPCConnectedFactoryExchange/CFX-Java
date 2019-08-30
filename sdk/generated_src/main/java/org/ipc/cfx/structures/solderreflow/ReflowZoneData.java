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
 * Provides information about the conditions of a particular zone of a reflow oven at a given point in time.
 * original type: CFX.Structures.SolderReflow.ReflowZoneData
 */
public class ReflowZoneData {

  private ReflowZone zone;
  private ReflowSetPoint[] setpoints;
  private ReflowReading[] readings;

  /**
   * Zone / Stage to which this reflow data is related.
   * @param zone the value
   */
  @JsonSetter("Zone")
  public void setZone(ReflowZone zone) {
    this.zone = zone;
  }

  /**
   * Zone / Stage to which this reflow data is related.
   * @return Zone
   */
  @JsonGetter("Zone")
  public ReflowZone getZone() {
    return zone;
  }

  /**
   * A list of current setpoints associated with this zone.
   * @param setpoints the value
   */
  @JsonSetter("Setpoints")
  public void setSetpoints(ReflowSetPoint[] setpoints) {
    this.setpoints = setpoints;
  }

  /**
   * A list of current setpoints associated with this zone.
   * @return Setpoints
   */
  @JsonGetter("Setpoints")
  public ReflowSetPoint[] getSetpoints() {
    return setpoints;
  }

  /**
   * A list of readings / measurements that have been taken for this zone.
   * @param readings the value
   */
  @JsonSetter("Readings")
  public void setReadings(ReflowReading[] readings) {
    this.readings = readings;
  }

  /**
   * A list of readings / measurements that have been taken for this zone.
   * @return Readings
   */
  @JsonGetter("Readings")
  public ReflowReading[] getReadings() {
    return readings;
  }
}
