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
 * created: 20.08.2019 15:52:37 by frankp
 */
package org.ipc.cfx.structures.pcbinspection;

import org.ipc.cfx.structures.Measurement;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Describes the results of measurements that were made on the position of a specific PCB component.
 * original type: CFX.Structures.PCBInspection.OffsetMeasurement
 */
public class OffsetMeasurement extends Measurement {

  private double dX;
  private double dY;
  private double dZ;
  private double rXY;
  private double rZX;
  private double rZY;

  /**
   * The x offset of the component from center (in mm)
   */
  @JsonSetter("DX")
  public void setDX(double dX) {
    this.dX = dX;
  }

  /**
   * The x offset of the component from center (in mm)
   */
  @JsonGetter("DX")
  public double getDX() {
    return dX;
  }

  /**
   * The y offset of the component from center (in mm)
   */
  @JsonSetter("DY")
  public void setDY(double dY) {
    this.dY = dY;
  }

  /**
   * The y offset of the component from center (in mm)
   */
  @JsonGetter("DY")
  public double getDY() {
    return dY;
  }

  /**
   * The z offset of the component from level (in mm)
   */
  @JsonSetter("DZ")
  public void setDZ(double dZ) {
    this.dZ = dZ;
  }

  /**
   * The z offset of the component from level (in mm)
   */
  @JsonGetter("DZ")
  public double getDZ() {
    return dZ;
  }

  /**
   * The counter-clockwise rotational offset on the X-Y plane (in degrees)
   */
  @JsonSetter("RXY")
  public void setRXY(double rXY) {
    this.rXY = rXY;
  }

  /**
   * The counter-clockwise rotational offset on the X-Y plane (in degrees)
   */
  @JsonGetter("RXY")
  public double getRXY() {
    return rXY;
  }

  /**
   * The counter-clockwise rotational offset on the Z-X plane (in degrees)
   */
  @JsonSetter("RZX")
  public void setRZX(double rZX) {
    this.rZX = rZX;
  }

  /**
   * The counter-clockwise rotational offset on the Z-X plane (in degrees)
   */
  @JsonGetter("RZX")
  public double getRZX() {
    return rZX;
  }

  /**
   * The counter-clockwise rotational offset on the Z-Y plane (in degrees)
   */
  @JsonSetter("RZY")
  public void setRZY(double rZY) {
    this.rZY = rZY;
  }

  /**
   * The counter-clockwise rotational offset on the Z-Y plane (in degrees)
   */
  @JsonGetter("RZY")
  public double getRZY() {
    return rZY;
  }
}
