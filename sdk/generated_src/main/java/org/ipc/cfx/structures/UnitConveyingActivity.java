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
 * A specialized type of Activity that occurs when a unit is conveyed in an endpoint.
 * original type: CFX.Structures.UnitConveyingActivity
 */
public class UnitConveyingActivity extends Activity {

  private float conveyingDistance;
  private Stage departureStage;
  private Stage arrivalStage;

  /**
   * The total distance of conveying (in mm)
   * @param conveyingDistance the value
   */
  @JsonSetter("ConveyingDistance")
  public UnitConveyingActivity setConveyingDistance(float conveyingDistance) {
    this.conveyingDistance = conveyingDistance;
    return this;
  }

  /**
   * The total distance of conveying (in mm)
   * @return ConveyingDistance
   */
  @JsonGetter("ConveyingDistance")
  public float getConveyingDistance() {
    return conveyingDistance;
  }

  /**
   * The Stage from where the unit is conveyed
   * @param departureStage the value
   */
  @JsonSetter("DepartureStage")
  public UnitConveyingActivity setDepartureStage(Stage departureStage) {
    this.departureStage = departureStage;
    return this;
  }

  /**
   * The Stage from where the unit is conveyed
   * @return DepartureStage
   */
  @JsonGetter("DepartureStage")
  public Stage getDepartureStage() {
    return departureStage;
  }

  /**
   * The Stage to where the unit is conveyed
   * @param arrivalStage the value
   */
  @JsonSetter("ArrivalStage")
  public UnitConveyingActivity setArrivalStage(Stage arrivalStage) {
    this.arrivalStage = arrivalStage;
    return this;
  }

  /**
   * The Stage to where the unit is conveyed
   * @return ArrivalStage
   */
  @JsonGetter("ArrivalStage")
  public Stage getArrivalStage() {
    return arrivalStage;
  }
}
