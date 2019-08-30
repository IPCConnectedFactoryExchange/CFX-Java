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
 * Describes a head for an endpoint that is an SMT placement machine.
 * original type: CFX.Structures.SMTPlacement.SMTHeadInformation
 */
public class SMTHeadInformation extends HeadInformation {

  private SMTHeadType sMTHeadType;
  private int numberOfNozzleLocations;
  private double placementAccuracy;

  /**
   * An enumeration indicating the purpose of this particular head
   * @param sMTHeadType the value
   */
  @JsonSetter("SMTHeadType")
  public void setSMTHeadType(SMTHeadType sMTHeadType) {
    this.sMTHeadType = sMTHeadType;
  }

  /**
   * An enumeration indicating the purpose of this particular head
   * @return SMTHeadType
   */
  @JsonGetter("SMTHeadType")
  public SMTHeadType getSMTHeadType() {
    return sMTHeadType;
  }

  /**
   * Indicates the number of nozzle locations
   * @param numberOfNozzleLocations the value
   */
  @JsonSetter("NumberOfNozzleLocations")
  public void setNumberOfNozzleLocations(int numberOfNozzleLocations) {
    this.numberOfNozzleLocations = numberOfNozzleLocations;
  }

  /**
   * Indicates the number of nozzle locations
   * @return NumberOfNozzleLocations
   */
  @JsonGetter("NumberOfNozzleLocations")
  public int getNumberOfNozzleLocations() {
    return numberOfNozzleLocations;
  }

  /**
   * The accuracy of this head, expressed in mm. For example, a head that can accurately
            place components to 1 micron would have accuracy of 0.001 mm.
   * @param placementAccuracy the value
   */
  @JsonSetter("PlacementAccuracy")
  public void setPlacementAccuracy(double placementAccuracy) {
    this.placementAccuracy = placementAccuracy;
  }

  /**
   * The accuracy of this head, expressed in mm. For example, a head that can accurately
            place components to 1 micron would have accuracy of 0.001 mm.
   * @return PlacementAccuracy
   */
  @JsonGetter("PlacementAccuracy")
  public double getPlacementAccuracy() {
    return placementAccuracy;
  }
}