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
 * created: 20.08.2019 15:52:18 by frankp
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
   */
  @JsonSetter("MinimumLength")
  public void setMinimumLength(double minimumLength) {
    this.minimumLength = minimumLength;
  }

  /**
   * The minimum dimension that a unit may be in the X axis,
            that is in the direction of flow of the conveyor.  Expressed in mm.
   */
  @JsonGetter("MinimumLength")
  public double getMinimumLength() {
    return minimumLength;
  }

  /**
   * The maximum dimension that a unit may be in the X axis,
            that is in the direction of flow of the conveyor.  Expressed in mm.
   */
  @JsonSetter("MaximumLength")
  public void setMaximumLength(double maximumLength) {
    this.maximumLength = maximumLength;
  }

  /**
   * The maximum dimension that a unit may be in the X axis,
            that is in the direction of flow of the conveyor.  Expressed in mm.
   */
  @JsonGetter("MaximumLength")
  public double getMaximumLength() {
    return maximumLength;
  }

  /**
   * The minimum dimension that a unit may be in the Y axis,
            that is perpendicular to the direction of flow of the conveyor. Expressed in mm.
   */
  @JsonSetter("MinimumWidth")
  public void setMinimumWidth(double minimumWidth) {
    this.minimumWidth = minimumWidth;
  }

  /**
   * The minimum dimension that a unit may be in the Y axis,
            that is perpendicular to the direction of flow of the conveyor. Expressed in mm.
   */
  @JsonGetter("MinimumWidth")
  public double getMinimumWidth() {
    return minimumWidth;
  }

  /**
   * The maximum dimension that a unit may be in the Y axis,
            that is perpendicular to the direction of flow of the conveyor. Expressed in mm.
   */
  @JsonSetter("MaximumWidth")
  public void setMaximumWidth(double maximumWidth) {
    this.maximumWidth = maximumWidth;
  }

  /**
   * The maximum dimension that a unit may be in the Y axis,
            that is perpendicular to the direction of flow of the conveyor. Expressed in mm.
   */
  @JsonGetter("MaximumWidth")
  public double getMaximumWidth() {
    return maximumWidth;
  }

  /**
   * The minimum height (Z dimension) that a unit may be to be processed by this endpoint.
            Expressed in mm.
   */
  @JsonSetter("MinimumHeight")
  public void setMinimumHeight(double minimumHeight) {
    this.minimumHeight = minimumHeight;
  }

  /**
   * The minimum height (Z dimension) that a unit may be to be processed by this endpoint.
            Expressed in mm.
   */
  @JsonGetter("MinimumHeight")
  public double getMinimumHeight() {
    return minimumHeight;
  }

  /**
   * The maximum height (Z dimension) that a unit may be to be processed by this endpoint.
            Expressed in mm.
   */
  @JsonSetter("MaximumHeight")
  public void setMaximumHeight(double maximumHeight) {
    this.maximumHeight = maximumHeight;
  }

  /**
   * The maximum height (Z dimension) that a unit may be to be processed by this endpoint.
            Expressed in mm.
   */
  @JsonGetter("MaximumHeight")
  public double getMaximumHeight() {
    return maximumHeight;
  }

  /**
   * The minimum weight that a unit may be to be processed by this endpoint.
            Expressed in grams.
   */
  @JsonSetter("MinimumWeight")
  public void setMinimumWeight(double minimumWeight) {
    this.minimumWeight = minimumWeight;
  }

  /**
   * The minimum weight that a unit may be to be processed by this endpoint.
            Expressed in grams.
   */
  @JsonGetter("MinimumWeight")
  public double getMinimumWeight() {
    return minimumWeight;
  }

  /**
   * The maximum weight that a unit may be to be processed by this endpoint.
            Expressed in grams.
   */
  @JsonSetter("MaximumWeight")
  public void setMaximumWeight(double maximumWeight) {
    this.maximumWeight = maximumWeight;
  }

  /**
   * The maximum weight that a unit may be to be processed by this endpoint.
            Expressed in grams.
   */
  @JsonGetter("MaximumWeight")
  public double getMaximumWeight() {
    return maximumWeight;
  }

  /**
   * The minimum thickness that a unit may be to be processed by this endpoint.
            Expressed in mm.
   */
  @JsonSetter("MinimumThickness")
  public void setMinimumThickness(double minimumThickness) {
    this.minimumThickness = minimumThickness;
  }

  /**
   * The minimum thickness that a unit may be to be processed by this endpoint.
            Expressed in mm.
   */
  @JsonGetter("MinimumThickness")
  public double getMinimumThickness() {
    return minimumThickness;
  }

  /**
   * The maximum thickness that a unit may be to be processed by this endpoint.
            Expressed in mm.
   */
  @JsonSetter("MaximumThickness")
  public void setMaximumThickness(double maximumThickness) {
    this.maximumThickness = maximumThickness;
  }

  /**
   * The maximum thickness that a unit may be to be processed by this endpoint.
            Expressed in mm.
   */
  @JsonGetter("MaximumThickness")
  public double getMaximumThickness() {
    return maximumThickness;
  }
}
