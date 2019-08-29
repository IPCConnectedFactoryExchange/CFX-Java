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
package org.ipc.cfx.structures;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This structure contains information about a one of a set of production units that are processed simultaneously under a single transaction by an endpoint.
            Units may be identified in one of two ways:
                1.  The UnitIdentifier property represents the actual unique identifier of the production unit.
                2.  The UnitIdentifier property represents the unique identifier of the "carrier" or "PCB panel"
                    AND the PositionNumber property represents the position of the unit within the carrier/panel.
                    PositionNumber's are established as defined in the CFX Standard.
            
            {
                "UnitIdentifier": "CARRIER5566",
                "PositionNumber": 1,
                "PositionName": "CIRCUIT1",
                "X": 0.254,
                "Y": 0.556,
                "Rotation": 0.0,
                "FlipX": false,
                "FlipY": false
            }
 * original type: CFX.Structures.UnitPosition
 */
public class UnitPosition {

  private String unitIdentifier;
  private int positionNumber;
  private String positionName;
  private double x;
  private double y;
  private double rotation;
  private boolean flipX;
  private boolean flipY;

  /**
   * Unique ID of Production Unit, Panel, or Carrier
   */
  @JsonSetter("UnitIdentifier")
  public void setUnitIdentifier(String unitIdentifier) {
    this.unitIdentifier = unitIdentifier;
  }

  /**
   * Unique ID of Production Unit, Panel, or Carrier
   *
   * @return never null
   */
  @JsonGetter("UnitIdentifier")
  public String getUnitIdentifier() {
    return unitIdentifier == null ? "" : unitIdentifier;
  }

  /**
   * Logical reference of production unit as defined by CFX position rule (see CFX standard section 5.6).
   */
  @JsonSetter("PositionNumber")
  public void setPositionNumber(int positionNumber) {
    this.positionNumber = positionNumber;
  }

  /**
   * Logical reference of production unit as defined by CFX position rule (see CFX standard section 5.6).
   */
  @JsonGetter("PositionNumber")
  public int getPositionNumber() {
    return positionNumber;
  }

  /**
   * Optional name of position
   */
  @JsonSetter("PositionName")
  public void setPositionName(String positionName) {
    this.positionName = positionName;
  }

  /**
   * Optional name of position
   *
   * @return never null
   */
  @JsonGetter("PositionName")
  public String getPositionName() {
    return positionName == null ? "" : positionName;
  }

  /**
   * X coordinate of Production unit origin, as it is known to the endpoint, expressed in millimeters (mm)
   */
  @JsonSetter("X")
  public void setX(double x) {
    this.x = x;
  }

  /**
   * X coordinate of Production unit origin, as it is known to the endpoint, expressed in millimeters (mm)
   */
  @JsonGetter("X")
  public double getX() {
    return x;
  }

  /**
   * Y coordinate of Production unit origin, as it is known to the endpoint, expressed in millimeters (mm)
   */
  @JsonSetter("Y")
  public void setY(double y) {
    this.y = y;
  }

  /**
   * Y coordinate of Production unit origin, as it is known to the endpoint, expressed in millimeters (mm)
   */
  @JsonGetter("Y")
  public double getY() {
    return y;
  }

  /**
   * Original rotation of Production unit, as it is known to the endpoint, expressed in degrees
   */
  @JsonSetter("Rotation")
  public void setRotation(double rotation) {
    this.rotation = rotation;
  }

  /**
   * Original rotation of Production unit, as it is known to the endpoint, expressed in degrees
   */
  @JsonGetter("Rotation")
  public double getRotation() {
    return rotation;
  }

  /**
   * Is production unit flipped in X-direction
   */
  @JsonSetter("FlipX")
  public void setFlipX(boolean flipX) {
    this.flipX = flipX;
  }

  /**
   * Is production unit flipped in X-direction
   */
  @JsonGetter("FlipX")
  public boolean isFlipX() {
    return flipX;
  }

  /**
   * Is production unit flipped in Y-direction
   */
  @JsonSetter("FlipY")
  public void setFlipY(boolean flipY) {
    this.flipY = flipY;
  }

  /**
   * Is production unit flipped in Y-direction
   */
  @JsonGetter("FlipY")
  public boolean isFlipY() {
    return flipY;
  }
}
