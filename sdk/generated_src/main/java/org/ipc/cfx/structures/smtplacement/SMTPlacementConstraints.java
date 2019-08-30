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
package org.ipc.cfx.structures.smtplacement;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Describes the placement constraints / capabilities of an SMT Placement Machine
 * original type: CFX.Structures.SMTPlacement.SMTPlacementConstraints
 */
public class SMTPlacementConstraints {

  private double minumumComponentBodySizeX;
  private double maximumComponentBodySizeX;
  private double minumumComponentBodySizeY;
  private double maximumComponentBodySizeY;
  private double minumumComponentHeight;
  private double maximumComponentHeight;
  private double minimumLeadWidth;
  private double minimumBGAPitch;
  private double minimumSOICPitch;
  private double minimumMountingPressure;
  private double maximumMountingPressure;

  /**
   * The minimum body size in the X dimension that a component
            must be in order to be placed.
   * @param minumumComponentBodySizeX the value
   */
  @JsonSetter("MinumumComponentBodySizeX")
  public void setMinumumComponentBodySizeX(double minumumComponentBodySizeX) {
    this.minumumComponentBodySizeX = minumumComponentBodySizeX;
  }

  /**
   * The minimum body size in the X dimension that a component
            must be in order to be placed.
   * @return MinumumComponentBodySizeX
   */
  @JsonGetter("MinumumComponentBodySizeX")
  public double getMinumumComponentBodySizeX() {
    return minumumComponentBodySizeX;
  }

  /**
   * The maximum body size in the X dimension that a component
            may be in order to be placed.
   * @param maximumComponentBodySizeX the value
   */
  @JsonSetter("MaximumComponentBodySizeX")
  public void setMaximumComponentBodySizeX(double maximumComponentBodySizeX) {
    this.maximumComponentBodySizeX = maximumComponentBodySizeX;
  }

  /**
   * The maximum body size in the X dimension that a component
            may be in order to be placed.
   * @return MaximumComponentBodySizeX
   */
  @JsonGetter("MaximumComponentBodySizeX")
  public double getMaximumComponentBodySizeX() {
    return maximumComponentBodySizeX;
  }

  /**
   * The minimum body size in the Y dimension that a component
            must be in order to be placed.
   * @param minumumComponentBodySizeY the value
   */
  @JsonSetter("MinumumComponentBodySizeY")
  public void setMinumumComponentBodySizeY(double minumumComponentBodySizeY) {
    this.minumumComponentBodySizeY = minumumComponentBodySizeY;
  }

  /**
   * The minimum body size in the Y dimension that a component
            must be in order to be placed.
   * @return MinumumComponentBodySizeY
   */
  @JsonGetter("MinumumComponentBodySizeY")
  public double getMinumumComponentBodySizeY() {
    return minumumComponentBodySizeY;
  }

  /**
   * The maximum body size in the Y dimension that a component
            may be in order to be placed.
   * @param maximumComponentBodySizeY the value
   */
  @JsonSetter("MaximumComponentBodySizeY")
  public void setMaximumComponentBodySizeY(double maximumComponentBodySizeY) {
    this.maximumComponentBodySizeY = maximumComponentBodySizeY;
  }

  /**
   * The maximum body size in the Y dimension that a component
            may be in order to be placed.
   * @return MaximumComponentBodySizeY
   */
  @JsonGetter("MaximumComponentBodySizeY")
  public double getMaximumComponentBodySizeY() {
    return maximumComponentBodySizeY;
  }

  /**
   * The minimum height that a component
            must be in order to be placed.
   * @param minumumComponentHeight the value
   */
  @JsonSetter("MinumumComponentHeight")
  public void setMinumumComponentHeight(double minumumComponentHeight) {
    this.minumumComponentHeight = minumumComponentHeight;
  }

  /**
   * The minimum height that a component
            must be in order to be placed.
   * @return MinumumComponentHeight
   */
  @JsonGetter("MinumumComponentHeight")
  public double getMinumumComponentHeight() {
    return minumumComponentHeight;
  }

  /**
   * The maximum height that a component
            may be in order to be placed.
   * @param maximumComponentHeight the value
   */
  @JsonSetter("MaximumComponentHeight")
  public void setMaximumComponentHeight(double maximumComponentHeight) {
    this.maximumComponentHeight = maximumComponentHeight;
  }

  /**
   * The maximum height that a component
            may be in order to be placed.
   * @return MaximumComponentHeight
   */
  @JsonGetter("MaximumComponentHeight")
  public double getMaximumComponentHeight() {
    return maximumComponentHeight;
  }

  /**
   * The minimum lead width that a component
            must have in order to be placed.
   * @param minimumLeadWidth the value
   */
  @JsonSetter("MinimumLeadWidth")
  public void setMinimumLeadWidth(double minimumLeadWidth) {
    this.minimumLeadWidth = minimumLeadWidth;
  }

  /**
   * The minimum lead width that a component
            must have in order to be placed.
   * @return MinimumLeadWidth
   */
  @JsonGetter("MinimumLeadWidth")
  public double getMinimumLeadWidth() {
    return minimumLeadWidth;
  }

  /**
   * The minimum ball pitch that a BGA type component
            must have in order to be placed.
   * @param minimumBGAPitch the value
   */
  @JsonSetter("MinimumBGAPitch")
  public void setMinimumBGAPitch(double minimumBGAPitch) {
    this.minimumBGAPitch = minimumBGAPitch;
  }

  /**
   * The minimum ball pitch that a BGA type component
            must have in order to be placed.
   * @return MinimumBGAPitch
   */
  @JsonGetter("MinimumBGAPitch")
  public double getMinimumBGAPitch() {
    return minimumBGAPitch;
  }

  /**
   * The minimum lead pitch that an SOIC type component
            must have in order to be placed.
   * @param minimumSOICPitch the value
   */
  @JsonSetter("MinimumSOICPitch")
  public void setMinimumSOICPitch(double minimumSOICPitch) {
    this.minimumSOICPitch = minimumSOICPitch;
  }

  /**
   * The minimum lead pitch that an SOIC type component
            must have in order to be placed.
   * @return MinimumSOICPitch
   */
  @JsonGetter("MinimumSOICPitch")
  public double getMinimumSOICPitch() {
    return minimumSOICPitch;
  }

  /**
   * The minimum amount of pressure that will be exerted on components during placement, 
            expressed in kPa
   * @param minimumMountingPressure the value
   */
  @JsonSetter("MinimumMountingPressure")
  public void setMinimumMountingPressure(double minimumMountingPressure) {
    this.minimumMountingPressure = minimumMountingPressure;
  }

  /**
   * The minimum amount of pressure that will be exerted on components during placement, 
            expressed in kPa
   * @return MinimumMountingPressure
   */
  @JsonGetter("MinimumMountingPressure")
  public double getMinimumMountingPressure() {
    return minimumMountingPressure;
  }

  /**
   * The minimum amount of pressure that will be exerted on components during placement, 
            expressed in kPa
   * @param maximumMountingPressure the value
   */
  @JsonSetter("MaximumMountingPressure")
  public void setMaximumMountingPressure(double maximumMountingPressure) {
    this.maximumMountingPressure = maximumMountingPressure;
  }

  /**
   * The minimum amount of pressure that will be exerted on components during placement, 
            expressed in kPa
   * @return MaximumMountingPressure
   */
  @JsonGetter("MaximumMountingPressure")
  public double getMaximumMountingPressure() {
    return maximumMountingPressure;
  }
}
