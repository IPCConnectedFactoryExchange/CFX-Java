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
 * Represents the right-handed 4x4 floating point matrix, which can store translation, scale and rotation information.
 * original type: CFX.Structures.Geometry.Matrix44
 */
public class Matrix44 {

  private Vector3 backward;
  private Vector3 down;
  private Vector3 forward;
  private org.ipc.cfx.structures.geometry.Matrix44 identity;
  private Vector3 left;
  private Vector3 right;
  private Vector3 translation;
  private Vector3 up;

  /**
   * The backward vector formed from the third row M31, M32, M33 elements.
   * @param backward the value
   */
  @JsonSetter("Backward")
  public Matrix44 setBackward(Vector3 backward) {
    this.backward = backward;
    return this;
  }

  /**
   * The backward vector formed from the third row M31, M32, M33 elements.
   * @return Backward
   */
  @JsonGetter("Backward")
  public Vector3 getBackward() {
    return backward;
  }

  /**
   * The down vector formed from the second row -M21, -M22, -M23 elements.
   * @param down the value
   */
  @JsonSetter("Down")
  public Matrix44 setDown(Vector3 down) {
    this.down = down;
    return this;
  }

  /**
   * The down vector formed from the second row -M21, -M22, -M23 elements.
   * @return Down
   */
  @JsonGetter("Down")
  public Vector3 getDown() {
    return down;
  }

  /**
   * The forward vector formed from the third row -M31, -M32, -M33 elements.
   * @param forward the value
   */
  @JsonSetter("Forward")
  public Matrix44 setForward(Vector3 forward) {
    this.forward = forward;
    return this;
  }

  /**
   * The forward vector formed from the third row -M31, -M32, -M33 elements.
   * @return Forward
   */
  @JsonGetter("Forward")
  public Vector3 getForward() {
    return forward;
  }

  /**
   * Returns the identity matrix.
   * @param identity the value
   */
  @JsonSetter("Identity")
  public Matrix44 setIdentity(org.ipc.cfx.structures.geometry.Matrix44 identity) {
    this.identity = identity;
    return this;
  }

  /**
   * Returns the identity matrix.
   * @return Identity
   */
  @JsonGetter("Identity")
  public org.ipc.cfx.structures.geometry.Matrix44 getIdentity() {
    return identity;
  }

  /**
   * The left vector formed from the first row -M11, -M12, -M13 elements.
   * @param left the value
   */
  @JsonSetter("Left")
  public Matrix44 setLeft(Vector3 left) {
    this.left = left;
    return this;
  }

  /**
   * The left vector formed from the first row -M11, -M12, -M13 elements.
   * @return Left
   */
  @JsonGetter("Left")
  public Vector3 getLeft() {
    return left;
  }

  /**
   * The right vector formed from the first row M11, M12, M13 elements.
   * @param right the value
   */
  @JsonSetter("Right")
  public Matrix44 setRight(Vector3 right) {
    this.right = right;
    return this;
  }

  /**
   * The right vector formed from the first row M11, M12, M13 elements.
   * @return Right
   */
  @JsonGetter("Right")
  public Vector3 getRight() {
    return right;
  }

  /**
   * Position stored in this matrix.
   * @param translation the value
   */
  @JsonSetter("Translation")
  public Matrix44 setTranslation(Vector3 translation) {
    this.translation = translation;
    return this;
  }

  /**
   * Position stored in this matrix.
   * @return Translation
   */
  @JsonGetter("Translation")
  public Vector3 getTranslation() {
    return translation;
  }

  /**
   * The upper vector formed from the second row M21, M22, M23 elements.
   * @param up the value
   */
  @JsonSetter("Up")
  public Matrix44 setUp(Vector3 up) {
    this.up = up;
    return this;
  }

  /**
   * The upper vector formed from the second row M21, M22, M23 elements.
   * @return Up
   */
  @JsonGetter("Up")
  public Vector3 getUp() {
    return up;
  }
  // original field: M11
  private double m11;
  // original field: M12
  private double m12;
  // original field: M13
  private double m13;
  // original field: M14
  private double m14;
  // original field: M21
  private double m21;
  // original field: M22
  private double m22;
  // original field: M23
  private double m23;
  // original field: M24
  private double m24;
  // original field: M31
  private double m31;
  // original field: M32
  private double m32;
  // original field: M33
  private double m33;
  // original field: M34
  private double m34;
  // original field: M41
  private double m41;
  // original field: M42
  private double m42;
  // original field: M43
  private double m43;
  // original field: M44
  private double m44;

  public double getM11() {
    return m11;
  }

  public void setM11(double m11) {
      this.m11 = m11;
  }

  public double getM12() {
    return m12;
  }

  public void setM12(double m12) {
      this.m12 = m12;
  }

  public double getM13() {
    return m13;
  }

  public void setM13(double m13) {
      this.m13 = m13;
  }

  public double getM14() {
    return m14;
  }

  public void setM14(double m14) {
      this.m14 = m14;
  }

  public double getM21() {
    return m21;
  }

  public void setM21(double m21) {
      this.m21 = m21;
  }

  public double getM22() {
    return m22;
  }

  public void setM22(double m22) {
      this.m22 = m22;
  }

  public double getM23() {
    return m23;
  }

  public void setM23(double m23) {
      this.m23 = m23;
  }

  public double getM24() {
    return m24;
  }

  public void setM24(double m24) {
      this.m24 = m24;
  }

  public double getM31() {
    return m31;
  }

  public void setM31(double m31) {
      this.m31 = m31;
  }

  public double getM32() {
    return m32;
  }

  public void setM32(double m32) {
      this.m32 = m32;
  }

  public double getM33() {
    return m33;
  }

  public void setM33(double m33) {
      this.m33 = m33;
  }

  public double getM34() {
    return m34;
  }

  public void setM34(double m34) {
      this.m34 = m34;
  }

  public double getM41() {
    return m41;
  }

  public void setM41(double m41) {
      this.m41 = m41;
  }

  public double getM42() {
    return m42;
  }

  public void setM42(double m42) {
      this.m42 = m42;
  }

  public double getM43() {
    return m43;
  }

  public void setM43(double m43) {
      this.m43 = m43;
  }

  public double getM44() {
    return m44;
  }

  public void setM44(double m44) {
      this.m44 = m44;
  }
}
