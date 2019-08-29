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
package org.ipc.cfx.structures.smtplacement;

import org.ipc.cfx.structures.DimensionalConstraints;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Describes a lane for an endpoint that is an SMT placement machine.
 * original type: CFX.Structures.SMTPlacement.SMTLaneInformation
 */
public class SMTLaneInformation {

  private Integer laneNumber;
  private String laneName;
  private DimensionalConstraints supportedPCBDimensions;

  /**
   * The lane number.  Corresponds with Lane property in production messages.
   */
  @JsonSetter("LaneNumber")
  public void setLaneNumber(Integer laneNumber) {
    this.laneNumber = laneNumber;
  }

  /**
   * The lane number.  Corresponds with Lane property in production messages.
   */
  @JsonGetter("LaneNumber")
  public Integer getLaneNumber() {
    return laneNumber;
  }

  /**
   * The friendly name of this lane.
   */
  @JsonSetter("LaneName")
  public void setLaneName(String laneName) {
    this.laneName = laneName;
  }

  /**
   * The friendly name of this lane.
   *
   * @return never null
   */
  @JsonGetter("LaneName")
  public String getLaneName() {
    return laneName == null ? "" : laneName;
  }

  /**
   * The maximum and minimum dimensions that a PCB panel or fixture must conform
            to in order to be processed by this lane.
   */
  @JsonSetter("SupportedPCBDimensions")
  public void setSupportedPCBDimensions(DimensionalConstraints supportedPCBDimensions) {
    this.supportedPCBDimensions = supportedPCBDimensions;
  }

  /**
   * The maximum and minimum dimensions that a PCB panel or fixture must conform
            to in order to be processed by this lane.
   */
  @JsonGetter("SupportedPCBDimensions")
  public DimensionalConstraints getSupportedPCBDimensions() {
    return supportedPCBDimensions;
  }
}
