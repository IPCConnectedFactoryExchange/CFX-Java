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

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * An X/Y coordinate that is used to define a planar region.
 * original type: CFX.Structures.Segment
 */
public class Segment {

  private double x;
  private double y;

  /**
   * The X Coordinate
   * @param x the value
   */
  @JsonSetter("X")
  public void setX(double x) {
    this.x = x;
  }

  /**
   * The X Coordinate
   * @return X
   */
  @JsonGetter("X")
  public double getX() {
    return x;
  }

  /**
   * The Y Coordinate
   * @param y the value
   */
  @JsonSetter("Y")
  public void setY(double y) {
    this.y = y;
  }

  /**
   * The Y Coordinate
   * @return Y
   */
  @JsonGetter("Y")
  public double getY() {
    return y;
  }
}
