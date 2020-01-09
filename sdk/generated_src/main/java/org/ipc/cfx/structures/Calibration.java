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
 * A dynamic structure describing a calibration event.
 * original type: CFX.Structures.Calibration
 */
public class Calibration {

  private String calibrationCode;
  private CalibrationType calibrationType;
  private String comments;

  /**
   * A vendor-specific string based code identifying the specific calibration performed
   * @param calibrationCode the value
   */
  @JsonSetter("CalibrationCode")
  public Calibration setCalibrationCode(String calibrationCode) {
    this.calibrationCode = calibrationCode;
    return this;
  }

  /**
   * A vendor-specific string based code identifying the specific calibration performed
   *
   * @return never null
   */
  @JsonGetter("CalibrationCode")
  public String getCalibrationCode() {
    return calibrationCode == null ? "" : calibrationCode;
  }

  /**
   * An enumeration indicated the type of calibration that was performed
   * @param calibrationType the value
   */
  @JsonSetter("CalibrationType")
  public Calibration setCalibrationType(CalibrationType calibrationType) {
    this.calibrationType = calibrationType;
    return this;
  }

  /**
   * An enumeration indicated the type of calibration that was performed
   * @return CalibrationType
   */
  @JsonGetter("CalibrationType")
  public CalibrationType getCalibrationType() {
    return calibrationType;
  }

  /**
   * Free form comments related to this particular calibration
   * @param comments the value
   */
  @JsonSetter("Comments")
  public Calibration setComments(String comments) {
    this.comments = comments;
    return this;
  }

  /**
   * Free form comments related to this particular calibration
   *
   * @return never null
   */
  @JsonGetter("Comments")
  public String getComments() {
    return comments == null ? "" : comments;
  }
}
