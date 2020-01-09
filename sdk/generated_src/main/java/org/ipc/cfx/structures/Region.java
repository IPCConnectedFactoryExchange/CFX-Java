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
package org.ipc.cfx.structures;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Describes a planar, 2 dimensional region as defined by a series of X, Y coordinates
            that when plotted, form the region.
 * original type: CFX.Structures.Region
 */
public class Region {

  private double startPointX;
  private double startPointY;
  private Segment[] regionSegments;

  /**
   * X coordinate of first point in region outline
   * @param startPointX the value
   */
  @JsonSetter("StartPointX")
  public Region setStartPointX(double startPointX) {
    this.startPointX = startPointX;
    return this;
  }

  /**
   * X coordinate of first point in region outline
   * @return StartPointX
   */
  @JsonGetter("StartPointX")
  public double getStartPointX() {
    return startPointX;
  }

  /**
   * Y coordinate of first point in region outline
   * @param startPointY the value
   */
  @JsonSetter("StartPointY")
  public Region setStartPointY(double startPointY) {
    this.startPointY = startPointY;
    return this;
  }

  /**
   * Y coordinate of first point in region outline
   * @return StartPointY
   */
  @JsonGetter("StartPointY")
  public double getStartPointY() {
    return startPointY;
  }

  /**
   * Collection of (X, Y) coordinates that when plotted form a planar region.
   * @param regionSegments the value
   */
  @JsonSetter("RegionSegments")
  public Region setRegionSegments(Segment[] regionSegments) {
    this.regionSegments = regionSegments;
    return this;
  }

  /**
   * Collection of (X, Y) coordinates that when plotted form a planar region.
   * @return RegionSegments
   */
  @JsonGetter("RegionSegments")
  public Segment[] getRegionSegments() {
    return regionSegments;
  }
}
