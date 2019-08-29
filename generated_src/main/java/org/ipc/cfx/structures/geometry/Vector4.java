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
   */
  @JsonSetter("Zero")
  public void setZero(org.ipc.cfx.structures.geometry.Vector4 zero) {
    this.zero = zero;
  }

  /**
   * Returns a  with components 0, 0, 0, 0.
   */
  @JsonGetter("Zero")
  public org.ipc.cfx.structures.geometry.Vector4 getZero() {
    return zero;
  }

  /**
   * Returns a  with components 1, 1, 1, 1.
   */
  @JsonSetter("One")
  public void setOne(org.ipc.cfx.structures.geometry.Vector4 one) {
    this.one = one;
  }

  /**
   * Returns a  with components 1, 1, 1, 1.
   */
  @JsonGetter("One")
  public org.ipc.cfx.structures.geometry.Vector4 getOne() {
    return one;
  }

  /**
   * Returns a  with components 1, 0, 0, 0.
   */
  @JsonSetter("UnitX")
  public void setUnitX(org.ipc.cfx.structures.geometry.Vector4 unitX) {
    this.unitX = unitX;
  }

  /**
   * Returns a  with components 1, 0, 0, 0.
   */
  @JsonGetter("UnitX")
  public org.ipc.cfx.structures.geometry.Vector4 getUnitX() {
    return unitX;
  }

  /**
   * Returns a  with components 0, 1, 0, 0.
   */
  @JsonSetter("UnitY")
  public void setUnitY(org.ipc.cfx.structures.geometry.Vector4 unitY) {
    this.unitY = unitY;
  }

  /**
   * Returns a  with components 0, 1, 0, 0.
   */
  @JsonGetter("UnitY")
  public org.ipc.cfx.structures.geometry.Vector4 getUnitY() {
    return unitY;
  }

  /**
   * Returns a  with components 0, 0, 1, 0.
   */
  @JsonSetter("UnitZ")
  public void setUnitZ(org.ipc.cfx.structures.geometry.Vector4 unitZ) {
    this.unitZ = unitZ;
  }

  /**
   * Returns a  with components 0, 0, 1, 0.
   */
  @JsonGetter("UnitZ")
  public org.ipc.cfx.structures.geometry.Vector4 getUnitZ() {
    return unitZ;
  }

  /**
   * Returns a  with components 0, 0, 0, 1.
   */
  @JsonSetter("UnitW")
  public void setUnitW(org.ipc.cfx.structures.geometry.Vector4 unitW) {
    this.unitW = unitW;
  }

  /**
   * Returns a  with components 0, 0, 0, 1.
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
