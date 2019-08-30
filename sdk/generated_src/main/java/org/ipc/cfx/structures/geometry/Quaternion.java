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
 * An efficient mathematical representation for three dimensional rotations.
 * original type: CFX.Structures.Geometry.Quaternion
 */
public class Quaternion {

  private org.ipc.cfx.structures.geometry.Quaternion identity;

  /**
   * Returns a quaternion representing no rotation.
   * @param identity the value
   */
  @JsonSetter("Identity")
  public void setIdentity(org.ipc.cfx.structures.geometry.Quaternion identity) {
    this.identity = identity;
  }

  /**
   * Returns a quaternion representing no rotation.
   * @return Identity
   */
  @JsonGetter("Identity")
  public org.ipc.cfx.structures.geometry.Quaternion getIdentity() {
    return identity;
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
