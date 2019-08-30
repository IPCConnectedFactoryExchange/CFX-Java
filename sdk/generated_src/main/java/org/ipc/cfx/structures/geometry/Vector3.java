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
  public void setZero(org.ipc.cfx.structures.geometry.Vector3 zero) {
    this.zero = zero;
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
  public void setOne(org.ipc.cfx.structures.geometry.Vector3 one) {
    this.one = one;
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
  public void setUnitX(org.ipc.cfx.structures.geometry.Vector3 unitX) {
    this.unitX = unitX;
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
  public void setUnitY(org.ipc.cfx.structures.geometry.Vector3 unitY) {
    this.unitY = unitY;
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
  public void setUnitZ(org.ipc.cfx.structures.geometry.Vector3 unitZ) {
    this.unitZ = unitZ;
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
  public void setUp(org.ipc.cfx.structures.geometry.Vector3 up) {
    this.up = up;
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
  public void setDown(org.ipc.cfx.structures.geometry.Vector3 down) {
    this.down = down;
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
  public void setRight(org.ipc.cfx.structures.geometry.Vector3 right) {
    this.right = right;
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
  public void setLeft(org.ipc.cfx.structures.geometry.Vector3 left) {
    this.left = left;
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
  public void setForward(org.ipc.cfx.structures.geometry.Vector3 forward) {
    this.forward = forward;
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
  public void setBackward(org.ipc.cfx.structures.geometry.Vector3 backward) {
    this.backward = backward;
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
