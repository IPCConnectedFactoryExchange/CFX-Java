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
package org.ipc.cfx.structures.pressinsertion;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * A connector can be pressed with force that iproportional to the 
            actual resisting force detected during the pressing cycle.We call 
            this Percent Above Range Sample, or PARS.In this technique, 
            the connector’s resisting force while pressing is
            sampled and averaged over a distance range above final seating to 
            the board surface. The final force percent added assures complete 
            seating of the connector.This is the most widely used technique
            because it limits the stress to the assembly, but does not require 
            great accuracy for board thickness measurement.
 * original type: CFX.Structures.PressInsertion.Pars
 */
public class Pars {

  private double percentAbove;
  private double startHeight;
  private double distance;

  /**
   * Gets or sets the percent above the sample range.
   */
  @JsonSetter("PercentAbove")
  public void setPercentAbove(double percentAbove) {
    this.percentAbove = percentAbove;
  }

  /**
   * Gets or sets the percent above the sample range.
   */
  @JsonGetter("PercentAbove")
  public double getPercentAbove() {
    return percentAbove;
  }

  /**
   * Gets or sets the start height in mm.
   */
  @JsonSetter("StartHeight")
  public void setStartHeight(double startHeight) {
    this.startHeight = startHeight;
  }

  /**
   * Gets or sets the start height in mm.
   */
  @JsonGetter("StartHeight")
  public double getStartHeight() {
    return startHeight;
  }

  /**
   * Gets or sets the distance in mm
   */
  @JsonSetter("Distance")
  public void setDistance(double distance) {
    this.distance = distance;
  }

  /**
   * Gets or sets the distance in mm
   */
  @JsonGetter("Distance")
  public double getDistance() {
    return distance;
  }
}
