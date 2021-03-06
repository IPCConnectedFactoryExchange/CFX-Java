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
package org.ipc.cfx.structures.pressinsertion;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Describes a force vs position vs time data points for a press.
 * original type: CFX.Structures.PressInsertion.PlotData
 */
public class PlotData {

  private FPTDataPoint[] points;

  /**
   * An array containing the force position time data points
   * @param points the value
   */
  @JsonSetter("Points")
  public PlotData setPoints(FPTDataPoint[] points) {
    this.points = points;
    return this;
  }

  /**
   * An array containing the force position time data points
   * @return Points
   */
  @JsonGetter("Points")
  public FPTDataPoint[] getPoints() {
    return points;
  }
}
