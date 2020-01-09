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
 * 
 * original type: CFX.Structures.TestedUnit
 */
public class TestedUnit {

  private String unitIdentifier;
  private Integer unitPositionNumber;
  private TestResult overallResult;
  private Test[] tests;

  /**
   * 
   * @param unitIdentifier the value
   */
  @JsonSetter("UnitIdentifier")
  public TestedUnit setUnitIdentifier(String unitIdentifier) {
    this.unitIdentifier = unitIdentifier;
    return this;
  }

  /**
   * 
   *
   * @return never null
   */
  @JsonGetter("UnitIdentifier")
  public String getUnitIdentifier() {
    return unitIdentifier == null ? "" : unitIdentifier;
  }

  /**
   * 
   * @param unitPositionNumber the value
   */
  @JsonSetter("UnitPositionNumber")
  public TestedUnit setUnitPositionNumber(Integer unitPositionNumber) {
    this.unitPositionNumber = unitPositionNumber;
    return this;
  }

  /**
   * 
   * @return UnitPositionNumber
   */
  @JsonGetter("UnitPositionNumber")
  public Integer getUnitPositionNumber() {
    return unitPositionNumber;
  }

  /**
   * 
   * @param overallResult the value
   */
  @JsonSetter("OverallResult")
  public TestedUnit setOverallResult(TestResult overallResult) {
    this.overallResult = overallResult;
    return this;
  }

  /**
   * 
   * @return OverallResult
   */
  @JsonGetter("OverallResult")
  public TestResult getOverallResult() {
    return overallResult;
  }

  /**
   * 
   * @param tests the value
   */
  @JsonSetter("Tests")
  public TestedUnit setTests(Test[] tests) {
    this.tests = tests;
    return this;
  }

  /**
   * 
   * @return Tests
   */
  @JsonGetter("Tests")
  public Test[] getTests() {
    return tests;
  }
}
