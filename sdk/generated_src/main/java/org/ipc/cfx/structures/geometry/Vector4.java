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
 * Describes a 4D-vector.
 * original type: CFX.Structures.Geometry.Vector4
 */
public class Vector4 {

  private org.ipc.cfx.structures.geometry.Vector4 zero;
  private org.ipc.cfx.structures.geometry.Vector4 one;
  private org.ipc.cfx.structures.geometry.Vector4 unitX;
  private org.ipc.cfx.structures.geometry.Vector4 unitY;
  private org.ipc.cfx.structures.geometry.Vector4 unitZ;
  private org.ipc.cfx.structures.geometry.Vector4 unitW;

  /**
   * Returns a  with components 0, 0, 0, 0.
   * @param zero the value
   */
  @JsonSetter("Zero")
  public Vector4 setZero(org.ipc.cfx.structures.geometry.Vector4 zero) {
    this.zero = zero;
    return this;
  }

  /**
   * Returns a  with components 0, 0, 0, 0.
   * @return Zero
   */
  @JsonGetter("Zero")
  public org.ipc.cfx.structures.geometry.Vector4 getZero() {
    return zero;
  }

  /**
   * Returns a  with components 1, 1, 1, 1.
   * @param one the value
   */
  @JsonSetter("One")
  public Vector4 setOne(org.ipc.cfx.structures.geometry.Vector4 one) {
    this.one = one;
    return this;
  }

  /**
   * Returns a  with components 1, 1, 1, 1.
   * @return One
   */
  @JsonGetter("One")
  public org.ipc.cfx.structures.geometry.Vector4 getOne() {
    return one;
  }

  /**
   * Returns a  with components 1, 0, 0, 0.
   * @param unitX the value
   */
  @JsonSetter("UnitX")
  public Vector4 setUnitX(org.ipc.cfx.structures.geometry.Vector4 unitX) {
    this.unitX = unitX;
    return this;
  }

  /**
   * Returns a  with components 1, 0, 0, 0.
   * @return UnitX
   */
  @JsonGetter("UnitX")
  public org.ipc.cfx.structures.geometry.Vector4 getUnitX() {
    return unitX;
  }

  /**
   * Returns a  with components 0, 1, 0, 0.
   * @param unitY the value
   */
  @JsonSetter("UnitY")
  public Vector4 setUnitY(org.ipc.cfx.structures.geometry.Vector4 unitY) {
    this.unitY = unitY;
    return this;
  }

  /**
   * Returns a  with components 0, 1, 0, 0.
   * @return UnitY
   */
  @JsonGetter("UnitY")
  public org.ipc.cfx.structures.geometry.Vector4 getUnitY() {
    return unitY;
  }

  /**
   * Returns a  with components 0, 0, 1, 0.
   * @param unitZ the value
   */
  @JsonSetter("UnitZ")
  public Vector4 setUnitZ(org.ipc.cfx.structures.geometry.Vector4 unitZ) {
    this.unitZ = unitZ;
    return this;
  }

  /**
   * Returns a  with components 0, 0, 1, 0.
   * @return UnitZ
   */
  @JsonGetter("UnitZ")
  public org.ipc.cfx.structures.geometry.Vector4 getUnitZ() {
    return unitZ;
  }

  /**
   * Returns a  with components 0, 0, 0, 1.
   * @param unitW the value
   */
  @JsonSetter("UnitW")
  public Vector4 setUnitW(org.ipc.cfx.structures.geometry.Vector4 unitW) {
    this.unitW = unitW;
    return this;
  }

  /**
   * Returns a  with components 0, 0, 0, 1.
   * @return UnitW
   */
  @JsonGetter("UnitW")
  public org.ipc.cfx.structures.geometry.Vector4 getUnitW() {
    return unitW;
  }
  // original field: X
  private double x;
  // original field: Y
  private double y;
  // original field: Z
  private double z;
  // original field: W
  private double w;

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

  public double getZ() {
    return z;
  }

  public void setZ(double z) {
      this.z = z;
  }

  public double getW() {
    return w;
  }

  public void setW(double w) {
      this.w = w;
  }
}
