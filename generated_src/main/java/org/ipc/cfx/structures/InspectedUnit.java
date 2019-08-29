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
 * Describes the results of a series of inspections performed on a single production unit.
 * original type: CFX.Structures.InspectedUnit
 */
public class InspectedUnit {

  private String unitIdentifier;
  private Integer unitPositionNumber;
  private TestResult overallResult;
  private VerificationResult verification;
  private Inspection[] inspections;

  /**
   * Unique ID of Production Unit, Panel, or Carrier
   */
  @JsonSetter("UnitIdentifier")
  public void setUnitIdentifier(String unitIdentifier) {
    this.unitIdentifier = unitIdentifier;
  }

  /**
   * Unique ID of Production Unit, Panel, or Carrier
   *
   * @return never null
   */
  @JsonGetter("UnitIdentifier")
  public String getUnitIdentifier() {
    return unitIdentifier == null ? "" : unitIdentifier;
  }

  /**
   * Logical reference of production unit as defined by CFX position rule (see CFX standard)
   */
  @JsonSetter("UnitPositionNumber")
  public void setUnitPositionNumber(Integer unitPositionNumber) {
    this.unitPositionNumber = unitPositionNumber;
  }

  /**
   * Logical reference of production unit as defined by CFX position rule (see CFX standard)
   */
  @JsonGetter("UnitPositionNumber")
  public Integer getUnitPositionNumber() {
    return unitPositionNumber;
  }

  /**
   * The overall result of the inspections performed on this unit
   */
  @JsonSetter("OverallResult")
  public void setOverallResult(TestResult overallResult) {
    this.overallResult = overallResult;
  }

  /**
   * The overall result of the inspections performed on this unit
   */
  @JsonGetter("OverallResult")
  public TestResult getOverallResult() {
    return overallResult;
  }

  /**
   * The overall result of the verification of the defect
   */
  @JsonSetter("Verification")
  public void setVerification(VerificationResult verification) {
    this.verification = verification;
  }

  /**
   * The overall result of the verification of the defect
   */
  @JsonGetter("Verification")
  public VerificationResult getVerification() {
    return verification;
  }

  /**
   * A list of the inspections performed, along with the results
   */
  @JsonSetter("Inspections")
  public void setInspections(Inspection[] inspections) {
    this.inspections = inspections;
  }

  /**
   * A list of the inspections performed, along with the results
   */
  @JsonGetter("Inspections")
  public Inspection[] getInspections() {
    return inspections;
  }
}
