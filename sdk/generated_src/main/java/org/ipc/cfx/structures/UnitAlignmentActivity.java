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
package org.ipc.cfx.structures;

import org.ipc.cfx.structures.smtplacement.SMTUnitAlignmentActivity;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * A specialized type of Activity that occurs when a unit is aligned (located / positioned) within a stage
            of an endpoint prior to the commencement of work.
 * original type: CFX.Structures.UnitAlignmentActivity
 */
@JsonTypeInfo(use = Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "$type")
@JsonSubTypes({
  @Type(value = SMTUnitAlignmentActivity.class, name = "CFX.Structures.SMTPlacement.SMTUnitAlignmentActivity, CFX"),
})
public class UnitAlignmentActivity extends Activity {

  private double dX;
  private double dY;
  private double dZ;
  private double dXY;
  private double dZX;
  private double dZY;

  /**
   * The amount of correction applied in the X axis, express in millimeters (mm)
   * @param dX the value
   */
  @JsonSetter("DX")
  public void setDX(double dX) {
    this.dX = dX;
  }

  /**
   * The amount of correction applied in the X axis, express in millimeters (mm)
   * @return DX
   */
  @JsonGetter("DX")
  public double getDX() {
    return dX;
  }

  /**
   * The amount of correction applied in the Y axis, express in millimeters (mm)
   * @param dY the value
   */
  @JsonSetter("DY")
  public void setDY(double dY) {
    this.dY = dY;
  }

  /**
   * The amount of correction applied in the Y axis, express in millimeters (mm)
   * @return DY
   */
  @JsonGetter("DY")
  public double getDY() {
    return dY;
  }

  /**
   * The amount of correction applied in the Z axis, express in millimeters (mm)
   * @param dZ the value
   */
  @JsonSetter("DZ")
  public void setDZ(double dZ) {
    this.dZ = dZ;
  }

  /**
   * The amount of correction applied in the Z axis, express in millimeters (mm)
   * @return DZ
   */
  @JsonGetter("DZ")
  public double getDZ() {
    return dZ;
  }

  /**
   * The counter-clockwise rotational correction applied in the X-Y plane (in degrees)
   * @param dXY the value
   */
  @JsonSetter("DXY")
  public void setDXY(double dXY) {
    this.dXY = dXY;
  }

  /**
   * The counter-clockwise rotational correction applied in the X-Y plane (in degrees)
   * @return DXY
   */
  @JsonGetter("DXY")
  public double getDXY() {
    return dXY;
  }

  /**
   * The counter-clockwise rotational correction applied in the Z-X plane (in degrees)
   * @param dZX the value
   */
  @JsonSetter("DZX")
  public void setDZX(double dZX) {
    this.dZX = dZX;
  }

  /**
   * The counter-clockwise rotational correction applied in the Z-X plane (in degrees)
   * @return DZX
   */
  @JsonGetter("DZX")
  public double getDZX() {
    return dZX;
  }

  /**
   * The counter-clockwise rotational correction applied in the Z-Y plane (in degrees)
   * @param dZY the value
   */
  @JsonSetter("DZY")
  public void setDZY(double dZY) {
    this.dZY = dZY;
  }

  /**
   * The counter-clockwise rotational correction applied in the Z-Y plane (in degrees)
   * @return DZY
   */
  @JsonGetter("DZY")
  public double getDZY() {
    return dZY;
  }
}
