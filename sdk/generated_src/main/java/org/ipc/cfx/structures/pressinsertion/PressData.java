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
 * Describes various data pertaining the result of a press.
 * original type: CFX.Structures.PressInsertion.PressData
 */
public class PressData {

  private String status;
  private String terminationMeasurement;
  private double sPCAverageForce;
  private double heightAtMaxForce;
  private double maxForce;
  private double terminationHeight;
  private double terminationForce;

  /**
   * Status indicating how the press terminated
   * @param status the value
   */
  @JsonSetter("Status")
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Status indicating how the press terminated
   *
   * @return never null
   */
  @JsonGetter("Status")
  public String getStatus() {
    return status == null ? "" : status;
  }

  /**
   * Describes the force or height measurement which caused the press to terminate
   * @param terminationMeasurement the value
   */
  @JsonSetter("TerminationMeasurement")
  public void setTerminationMeasurement(String terminationMeasurement) {
    this.terminationMeasurement = terminationMeasurement;
  }

  /**
   * Describes the force or height measurement which caused the press to terminate
   *
   * @return never null
   */
  @JsonGetter("TerminationMeasurement")
  public String getTerminationMeasurement() {
    return terminationMeasurement == null ? "" : terminationMeasurement;
  }

  /**
   * The average force measured over the SPC position range
   * @param sPCAverageForce the value
   */
  @JsonSetter("SPCAverageForce")
  public void setSPCAverageForce(double sPCAverageForce) {
    this.sPCAverageForce = sPCAverageForce;
  }

  /**
   * The average force measured over the SPC position range
   * @return SPCAverageForce
   */
  @JsonGetter("SPCAverageForce")
  public double getSPCAverageForce() {
    return sPCAverageForce;
  }

  /**
   * The height at which max pressing force was achieved
   * @param heightAtMaxForce the value
   */
  @JsonSetter("HeightAtMaxForce")
  public void setHeightAtMaxForce(double heightAtMaxForce) {
    this.heightAtMaxForce = heightAtMaxForce;
  }

  /**
   * The height at which max pressing force was achieved
   * @return HeightAtMaxForce
   */
  @JsonGetter("HeightAtMaxForce")
  public double getHeightAtMaxForce() {
    return heightAtMaxForce;
  }

  /**
   * The max force achieved during the press
   * @param maxForce the value
   */
  @JsonSetter("MaxForce")
  public void setMaxForce(double maxForce) {
    this.maxForce = maxForce;
  }

  /**
   * The max force achieved during the press
   * @return MaxForce
   */
  @JsonGetter("MaxForce")
  public double getMaxForce() {
    return maxForce;
  }

  /**
   * The height at which the press terminated
   * @param terminationHeight the value
   */
  @JsonSetter("TerminationHeight")
  public void setTerminationHeight(double terminationHeight) {
    this.terminationHeight = terminationHeight;
  }

  /**
   * The height at which the press terminated
   * @return TerminationHeight
   */
  @JsonGetter("TerminationHeight")
  public double getTerminationHeight() {
    return terminationHeight;
  }

  /**
   * The force at which the press terminated
   * @param terminationForce the value
   */
  @JsonSetter("TerminationForce")
  public void setTerminationForce(double terminationForce) {
    this.terminationForce = terminationForce;
  }

  /**
   * The force at which the press terminated
   * @return TerminationForce
   */
  @JsonGetter("TerminationForce")
  public double getTerminationForce() {
    return terminationForce;
  }
}
