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
package org.ipc.cfx.structures.geometry;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Describes a 2D-vector.
 * original type: CFX.Structures.Geometry.Vector2
 */
public class Vector2 {

  private org.ipc.cfx.structures.geometry.Vector2 zero;
  private org.ipc.cfx.structures.geometry.Vector2 one;
  private org.ipc.cfx.structures.geometry.Vector2 unitX;
  private org.ipc.cfx.structures.geometry.Vector2 unitY;

  /**
   * Returns a  with components 0, 0.
   * @param zero the value
   */
  @JsonSetter("Zero")
  public Vector2 setZero(org.ipc.cfx.structures.geometry.Vector2 zero) {
    this.zero = zero;
    return this;
  }

  /**
   * Returns a  with components 0, 0.
   * @return Zero
   */
  @JsonGetter("Zero")
  public org.ipc.cfx.structures.geometry.Vector2 getZero() {
    return zero;
  }

  /**
   * Returns a  with components 1, 1.
   * @param one the value
   */
  @JsonSetter("One")
  public Vector2 setOne(org.ipc.cfx.structures.geometry.Vector2 one) {
    this.one = one;
    return this;
  }

  /**
   * Returns a  with components 1, 1.
   * @return One
   */
  @JsonGetter("One")
  public org.ipc.cfx.structures.geometry.Vector2 getOne() {
    return one;
  }

  /**
   * Returns a  with components 1, 0.
   * @param unitX the value
   */
  @JsonSetter("UnitX")
  public Vector2 setUnitX(org.ipc.cfx.structures.geometry.Vector2 unitX) {
    this.unitX = unitX;
    return this;
  }

  /**
   * Returns a  with components 1, 0.
   * @return UnitX
   */
  @JsonGetter("UnitX")
  public org.ipc.cfx.structures.geometry.Vector2 getUnitX() {
    return unitX;
  }

  /**
   * Returns a  with components 0, 1.
   * @param unitY the value
   */
  @JsonSetter("UnitY")
  public Vector2 setUnitY(org.ipc.cfx.structures.geometry.Vector2 unitY) {
    this.unitY = unitY;
    return this;
  }

  /**
   * Returns a  with components 0, 1.
   * @return UnitY
   */
  @JsonGetter("UnitY")
  public org.ipc.cfx.structures.geometry.Vector2 getUnitY() {
    return unitY;
  }
  // original field: X
  private double x;
  // original field: Y
  private double y;

  public double getX() {
    return x;
  }

  public void setX(double x) {
      this.x = x;
  }

  public double getY() {
    return y;
  }

  public void setY(double y) {
      this.y = y;
  }
}
