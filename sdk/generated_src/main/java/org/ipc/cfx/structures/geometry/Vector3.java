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
 * Describes a 3D-vector.
 * original type: CFX.Structures.Geometry.Vector3
 */
public class Vector3 {

  private org.ipc.cfx.structures.geometry.Vector3 zero;
  private org.ipc.cfx.structures.geometry.Vector3 one;
  private org.ipc.cfx.structures.geometry.Vector3 unitX;
  private org.ipc.cfx.structures.geometry.Vector3 unitY;
  private org.ipc.cfx.structures.geometry.Vector3 unitZ;
  private org.ipc.cfx.structures.geometry.Vector3 up;
  private org.ipc.cfx.structures.geometry.Vector3 down;
  private org.ipc.cfx.structures.geometry.Vector3 right;
  private org.ipc.cfx.structures.geometry.Vector3 left;
  private org.ipc.cfx.structures.geometry.Vector3 forward;
  private org.ipc.cfx.structures.geometry.Vector3 backward;

  /**
   * Returns a  with components 0, 0, 0.
   * @param zero the value
   */
  @JsonSetter("Zero")
  public Vector3 setZero(org.ipc.cfx.structures.geometry.Vector3 zero) {
    this.zero = zero;
    return this;
  }

  /**
   * Returns a  with components 0, 0, 0.
   * @return Zero
   */
  @JsonGetter("Zero")
  public org.ipc.cfx.structures.geometry.Vector3 getZero() {
    return zero;
  }

  /**
   * Returns a  with components 1, 1, 1.
   * @param one the value
   */
  @JsonSetter("One")
  public Vector3 setOne(org.ipc.cfx.structures.geometry.Vector3 one) {
    this.one = one;
    return this;
  }

  /**
   * Returns a  with components 1, 1, 1.
   * @return One
   */
  @JsonGetter("One")
  public org.ipc.cfx.structures.geometry.Vector3 getOne() {
    return one;
  }

  /**
   * Returns a  with components 1, 0, 0.
   * @param unitX the value
   */
  @JsonSetter("UnitX")
  public Vector3 setUnitX(org.ipc.cfx.structures.geometry.Vector3 unitX) {
    this.unitX = unitX;
    return this;
  }

  /**
   * Returns a  with components 1, 0, 0.
   * @return UnitX
   */
  @JsonGetter("UnitX")
  public org.ipc.cfx.structures.geometry.Vector3 getUnitX() {
    return unitX;
  }

  /**
   * Returns a  with components 0, 1, 0.
   * @param unitY the value
   */
  @JsonSetter("UnitY")
  public Vector3 setUnitY(org.ipc.cfx.structures.geometry.Vector3 unitY) {
    this.unitY = unitY;
    return this;
  }

  /**
   * Returns a  with components 0, 1, 0.
   * @return UnitY
   */
  @JsonGetter("UnitY")
  public org.ipc.cfx.structures.geometry.Vector3 getUnitY() {
    return unitY;
  }

  /**
   * Returns a  with components 0, 0, 1.
   * @param unitZ the value
   */
  @JsonSetter("UnitZ")
  public Vector3 setUnitZ(org.ipc.cfx.structures.geometry.Vector3 unitZ) {
    this.unitZ = unitZ;
    return this;
  }

  /**
   * Returns a  with components 0, 0, 1.
   * @return UnitZ
   */
  @JsonGetter("UnitZ")
  public org.ipc.cfx.structures.geometry.Vector3 getUnitZ() {
    return unitZ;
  }

  /**
   * Returns a  with components 0, 1, 0.
   * @param up the value
   */
  @JsonSetter("Up")
  public Vector3 setUp(org.ipc.cfx.structures.geometry.Vector3 up) {
    this.up = up;
    return this;
  }

  /**
   * Returns a  with components 0, 1, 0.
   * @return Up
   */
  @JsonGetter("Up")
  public org.ipc.cfx.structures.geometry.Vector3 getUp() {
    return up;
  }

  /**
   * Returns a  with components 0, -1, 0.
   * @param down the value
   */
  @JsonSetter("Down")
  public Vector3 setDown(org.ipc.cfx.structures.geometry.Vector3 down) {
    this.down = down;
    return this;
  }

  /**
   * Returns a  with components 0, -1, 0.
   * @return Down
   */
  @JsonGetter("Down")
  public org.ipc.cfx.structures.geometry.Vector3 getDown() {
    return down;
  }

  /**
   * Returns a  with components 1, 0, 0.
   * @param right the value
   */
  @JsonSetter("Right")
  public Vector3 setRight(org.ipc.cfx.structures.geometry.Vector3 right) {
    this.right = right;
    return this;
  }

  /**
   * Returns a  with components 1, 0, 0.
   * @return Right
   */
  @JsonGetter("Right")
  public org.ipc.cfx.structures.geometry.Vector3 getRight() {
    return right;
  }

  /**
   * Returns a  with components -1, 0, 0.
   * @param left the value
   */
  @JsonSetter("Left")
  public Vector3 setLeft(org.ipc.cfx.structures.geometry.Vector3 left) {
    this.left = left;
    return this;
  }

  /**
   * Returns a  with components -1, 0, 0.
   * @return Left
   */
  @JsonGetter("Left")
  public org.ipc.cfx.structures.geometry.Vector3 getLeft() {
    return left;
  }

  /**
   * Returns a  with components 0, 0, -1.
   * @param forward the value
   */
  @JsonSetter("Forward")
  public Vector3 setForward(org.ipc.cfx.structures.geometry.Vector3 forward) {
    this.forward = forward;
    return this;
  }

  /**
   * Returns a  with components 0, 0, -1.
   * @return Forward
   */
  @JsonGetter("Forward")
  public org.ipc.cfx.structures.geometry.Vector3 getForward() {
    return forward;
  }

  /**
   * Returns a  with components 0, 0, 1.
   * @param backward the value
   */
  @JsonSetter("Backward")
  public Vector3 setBackward(org.ipc.cfx.structures.geometry.Vector3 backward) {
    this.backward = backward;
    return this;
  }

  /**
   * Returns a  with components 0, 0, 1.
   * @return Backward
   */
  @JsonGetter("Backward")
  public org.ipc.cfx.structures.geometry.Vector3 getBackward() {
    return backward;
  }
  // original field: X
  private double x;
  // original field: Y
  private double y;
  // original field: Z
  private double z;

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
}
