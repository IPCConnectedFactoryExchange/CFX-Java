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
package org.ipc.cfx.structures.pressinsertion;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Describes a force vs position vs time data point for a press.
 * original type: CFX.Structures.PressInsertion.FPTDataPoint
 */
public class FPTDataPoint {

  private double totalForce;
  private double forceA;
  private double forceB;
  private double position;
  private double time;

  /**
   * The total force reading of the data point
   * @param totalForce the value
   */
  @JsonSetter("TotalForce")
  public void setTotalForce(double totalForce) {
    this.totalForce = totalForce;
  }

  /**
   * The total force reading of the data point
   * @return TotalForce
   */
  @JsonGetter("TotalForce")
  public double getTotalForce() {
    return totalForce;
  }

  /**
   * The force reading of load cell A of the data point
   * @param forceA the value
   */
  @JsonSetter("ForceA")
  public void setForceA(double forceA) {
    this.forceA = forceA;
  }

  /**
   * The force reading of load cell A of the data point
   * @return ForceA
   */
  @JsonGetter("ForceA")
  public double getForceA() {
    return forceA;
  }

  /**
   * The force reading of load cell B the data point
   * @param forceB the value
   */
  @JsonSetter("ForceB")
  public void setForceB(double forceB) {
    this.forceB = forceB;
  }

  /**
   * The force reading of load cell B the data point
   * @return ForceB
   */
  @JsonGetter("ForceB")
  public double getForceB() {
    return forceB;
  }

  /**
   * The position reading of the data point
   * @param position the value
   */
  @JsonSetter("Position")
  public void setPosition(double position) {
    this.position = position;
  }

  /**
   * The position reading of the data point
   * @return Position
   */
  @JsonGetter("Position")
  public double getPosition() {
    return position;
  }

  /**
   * The time reading of the data point
   * @param time the value
   */
  @JsonSetter("Time")
  public void setTime(double time) {
    this.time = time;
  }

  /**
   * The time reading of the data point
   * @return Time
   */
  @JsonGetter("Time")
  public double getTime() {
    return time;
  }
}
