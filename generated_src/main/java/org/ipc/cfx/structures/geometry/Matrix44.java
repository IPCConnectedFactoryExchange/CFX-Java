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
   */
  @JsonSetter("Backward")
  public void setBackward(Vector3 backward) {
    this.backward = backward;
  }

  /**
   * The backward vector formed from the third row M31, M32, M33 elements.
   */
  @JsonGetter("Backward")
  public Vector3 getBackward() {
    return backward;
  }

  /**
   * The down vector formed from the second row -M21, -M22, -M23 elements.
   */
  @JsonSetter("Down")
  public void setDown(Vector3 down) {
    this.down = down;
  }

  /**
   * The down vector formed from the second row -M21, -M22, -M23 elements.
   */
  @JsonGetter("Down")
  public Vector3 getDown() {
    return down;
  }

  /**
   * The forward vector formed from the third row -M31, -M32, -M33 elements.
   */
  @JsonSetter("Forward")
  public void setForward(Vector3 forward) {
    this.forward = forward;
  }

  /**
   * The forward vector formed from the third row -M31, -M32, -M33 elements.
   */
  @JsonGetter("Forward")
  public Vector3 getForward() {
    return forward;
  }

  /**
   * Returns the identity matrix.
   */
  @JsonSetter("Identity")
  public void setIdentity(org.ipc.cfx.structures.geometry.Matrix44 identity) {
    this.identity = identity;
  }

  /**
   * Returns the identity matrix.
   */
  @JsonGetter("Identity")
  public org.ipc.cfx.structures.geometry.Matrix44 getIdentity() {
    return identity;
  }

  /**
   * The left vector formed from the first row -M11, -M12, -M13 elements.
   */
  @JsonSetter("Left")
  public void setLeft(Vector3 left) {
    this.left = left;
  }

  /**
   * The left vector formed from the first row -M11, -M12, -M13 elements.
   */
  @JsonGetter("Left")
  public Vector3 getLeft() {
    return left;
  }

  /**
   * The right vector formed from the first row M11, M12, M13 elements.
   */
  @JsonSetter("Right")
  public void setRight(Vector3 right) {
    this.right = right;
  }

  /**
   * The right vector formed from the first row M11, M12, M13 elements.
   */
  @JsonGetter("Right")
  public Vector3 getRight() {
    return right;
  }

  /**
   * Position stored in this matrix.
   */
  @JsonSetter("Translation")
  public void setTranslation(Vector3 translation) {
    this.translation = translation;
  }

  /**
   * Position stored in this matrix.
   */
  @JsonGetter("Translation")
  public Vector3 getTranslation() {
    return translation;
  }

  /**
   * The upper vector formed from the second row M21, M22, M23 elements.
   */
  @JsonSetter("Up")
  public void setUp(Vector3 up) {
    this.up = up;
  }

  /**
   * The upper vector formed from the second row M21, M22, M23 elements.
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
