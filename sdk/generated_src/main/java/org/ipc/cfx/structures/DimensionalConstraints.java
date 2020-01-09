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
 * Describes the maximum and mininum dimensions and weight that a production unit is permitted
            to be in order to be processed at a particular endpoint.
 * original type: CFX.Structures.DimensionalConstraints
 */
public class DimensionalConstraints {

  private double minimumLength;
  private double maximumLength;
  private double minimumWidth;
  private double maximumWidth;
  private double minimumHeight;
  private double maximumHeight;
  private double minimumWeight;
  private double maximumWeight;
  private double minimumThickness;
  private double maximumThickness;

  /**
   * The minimum dimension that a unit may be in the X axis,
            that is in the direction of flow of the conveyor.  Expressed in mm.
   * @param minimumLength the value
   */
  @JsonSetter("MinimumLength")
  public DimensionalConstraints setMinimumLength(double minimumLength) {
    this.minimumLength = minimumLength;
    return this;
  }

  /**
   * The minimum dimension that a unit may be in the X axis,
            that is in the direction of flow of the conveyor.  Expressed in mm.
   * @return MinimumLength
   */
  @JsonGetter("MinimumLength")
  public double getMinimumLength() {
    return minimumLength;
  }

  /**
   * The maximum dimension that a unit may be in the X axis,
            that is in the direction of flow of the conveyor.  Expressed in mm.
   * @param maximumLength the value
   */
  @JsonSetter("MaximumLength")
  public DimensionalConstraints setMaximumLength(double maximumLength) {
    this.maximumLength = maximumLength;
    return this;
  }

  /**
   * The maximum dimension that a unit may be in the X axis,
            that is in the direction of flow of the conveyor.  Expressed in mm.
   * @return MaximumLength
   */
  @JsonGetter("MaximumLength")
  public double getMaximumLength() {
    return maximumLength;
  }

  /**
   * The minimum dimension that a unit may be in the Y axis,
            that is perpendicular to the direction of flow of the conveyor. Expressed in mm.
   * @param minimumWidth the value
   */
  @JsonSetter("MinimumWidth")
  public DimensionalConstraints setMinimumWidth(double minimumWidth) {
    this.minimumWidth = minimumWidth;
    return this;
  }

  /**
   * The minimum dimension that a unit may be in the Y axis,
            that is perpendicular to the direction of flow of the conveyor. Expressed in mm.
   * @return MinimumWidth
   */
  @JsonGetter("MinimumWidth")
  public double getMinimumWidth() {
    return minimumWidth;
  }

  /**
   * The maximum dimension that a unit may be in the Y axis,
            that is perpendicular to the direction of flow of the conveyor. Expressed in mm.
   * @param maximumWidth the value
   */
  @JsonSetter("MaximumWidth")
  public DimensionalConstraints setMaximumWidth(double maximumWidth) {
    this.maximumWidth = maximumWidth;
    return this;
  }

  /**
   * The maximum dimension that a unit may be in the Y axis,
            that is perpendicular to the direction of flow of the conveyor. Expressed in mm.
   * @return MaximumWidth
   */
  @JsonGetter("MaximumWidth")
  public double getMaximumWidth() {
    return maximumWidth;
  }

  /**
   * The minimum height (Z dimension) that a unit may be to be processed by this endpoint.
            Expressed in mm.
   * @param minimumHeight the value
   */
  @JsonSetter("MinimumHeight")
  public DimensionalConstraints setMinimumHeight(double minimumHeight) {
    this.minimumHeight = minimumHeight;
    return this;
  }

  /**
   * The minimum height (Z dimension) that a unit may be to be processed by this endpoint.
            Expressed in mm.
   * @return MinimumHeight
   */
  @JsonGetter("MinimumHeight")
  public double getMinimumHeight() {
    return minimumHeight;
  }

  /**
   * The maximum height (Z dimension) that a unit may be to be processed by this endpoint.
            Expressed in mm.
   * @param maximumHeight the value
   */
  @JsonSetter("MaximumHeight")
  public DimensionalConstraints setMaximumHeight(double maximumHeight) {
    this.maximumHeight = maximumHeight;
    return this;
  }

  /**
   * The maximum height (Z dimension) that a unit may be to be processed by this endpoint.
            Expressed in mm.
   * @return MaximumHeight
   */
  @JsonGetter("MaximumHeight")
  public double getMaximumHeight() {
    return maximumHeight;
  }

  /**
   * The minimum weight that a unit may be to be processed by this endpoint.
            Expressed in grams.
   * @param minimumWeight the value
   */
  @JsonSetter("MinimumWeight")
  public DimensionalConstraints setMinimumWeight(double minimumWeight) {
    this.minimumWeight = minimumWeight;
    return this;
  }

  /**
   * The minimum weight that a unit may be to be processed by this endpoint.
            Expressed in grams.
   * @return MinimumWeight
   */
  @JsonGetter("MinimumWeight")
  public double getMinimumWeight() {
    return minimumWeight;
  }

  /**
   * The maximum weight that a unit may be to be processed by this endpoint.
            Expressed in grams.
   * @param maximumWeight the value
   */
  @JsonSetter("MaximumWeight")
  public DimensionalConstraints setMaximumWeight(double maximumWeight) {
    this.maximumWeight = maximumWeight;
    return this;
  }

  /**
   * The maximum weight that a unit may be to be processed by this endpoint.
            Expressed in grams.
   * @return MaximumWeight
   */
  @JsonGetter("MaximumWeight")
  public double getMaximumWeight() {
    return maximumWeight;
  }

  /**
   * The minimum thickness that a unit may be to be processed by this endpoint.
            Expressed in mm.
   * @param minimumThickness the value
   */
  @JsonSetter("MinimumThickness")
  public DimensionalConstraints setMinimumThickness(double minimumThickness) {
    this.minimumThickness = minimumThickness;
    return this;
  }

  /**
   * The minimum thickness that a unit may be to be processed by this endpoint.
            Expressed in mm.
   * @return MinimumThickness
   */
  @JsonGetter("MinimumThickness")
  public double getMinimumThickness() {
    return minimumThickness;
  }

  /**
   * The maximum thickness that a unit may be to be processed by this endpoint.
            Expressed in mm.
   * @param maximumThickness the value
   */
  @JsonSetter("MaximumThickness")
  public DimensionalConstraints setMaximumThickness(double maximumThickness) {
    this.maximumThickness = maximumThickness;
    return this;
  }

  /**
   * The maximum thickness that a unit may be to be processed by this endpoint.
            Expressed in mm.
   * @return MaximumThickness
   */
  @JsonGetter("MaximumThickness")
  public double getMaximumThickness() {
    return maximumThickness;
  }
}
