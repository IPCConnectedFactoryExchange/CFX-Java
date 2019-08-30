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
package org.ipc.cfx.structures.pressinsertion;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Statistial Process Control parameters for the pressing operation.
 * original type: CFX.Structures.PressInsertion.SPC
 */
public class SPC {

  private double startDistance;
  private double startHeight;
  private double minimumForceLimit;
  private double maximumForceLimit;

  /**
   * Gets or sets the distance from the board when SPC will be initiated
   * @param startDistance the value
   */
  @JsonSetter("StartDistance")
  public void setStartDistance(double startDistance) {
    this.startDistance = startDistance;
  }

  /**
   * Gets or sets the distance from the board when SPC will be initiated
   * @return StartDistance
   */
  @JsonGetter("StartDistance")
  public double getStartDistance() {
    return startDistance;
  }

  /**
   * Gets or sets the start height.
   * @param startHeight the value
   */
  @JsonSetter("StartHeight")
  public void setStartHeight(double startHeight) {
    this.startHeight = startHeight;
  }

  /**
   * Gets or sets the start height.
   * @return StartHeight
   */
  @JsonGetter("StartHeight")
  public double getStartHeight() {
    return startHeight;
  }

  /**
   * Gets or sets the minimum force limit per pin (N/pin).
   * @param minimumForceLimit the value
   */
  @JsonSetter("MinimumForceLimit")
  public void setMinimumForceLimit(double minimumForceLimit) {
    this.minimumForceLimit = minimumForceLimit;
  }

  /**
   * Gets or sets the minimum force limit per pin (N/pin).
   * @return MinimumForceLimit
   */
  @JsonGetter("MinimumForceLimit")
  public double getMinimumForceLimit() {
    return minimumForceLimit;
  }

  /**
   * Gets or sets the maximum force limit per pin (N/pin)
   * @param maximumForceLimit the value
   */
  @JsonSetter("MaximumForceLimit")
  public void setMaximumForceLimit(double maximumForceLimit) {
    this.maximumForceLimit = maximumForceLimit;
  }

  /**
   * Gets or sets the maximum force limit per pin (N/pin)
   * @return MaximumForceLimit
   */
  @JsonGetter("MaximumForceLimit")
  public double getMaximumForceLimit() {
    return maximumForceLimit;
  }
}
