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
 * Describes details on a vision test of a component
 * original type: CFX.Structures.ComponentVisionTest
 */
public class ComponentVisionTest {

  private String informationId;
  private double expectedValue;
  private double measuredValue;
  private double toleranceMin;
  private double toleranceMax;
  private String unit;
  private boolean result;

  /**
   * If of the measured information
   * @param informationId the value
   */
  @JsonSetter("InformationId")
  public ComponentVisionTest setInformationId(String informationId) {
    this.informationId = informationId;
    return this;
  }

  /**
   * If of the measured information
   *
   * @return never null
   */
  @JsonGetter("InformationId")
  public String getInformationId() {
    return informationId == null ? "" : informationId;
  }

  /**
   * Vision expected value
   * @param expectedValue the value
   */
  @JsonSetter("ExpectedValue")
  public ComponentVisionTest setExpectedValue(double expectedValue) {
    this.expectedValue = expectedValue;
    return this;
  }

  /**
   * Vision expected value
   * @return ExpectedValue
   */
  @JsonGetter("ExpectedValue")
  public double getExpectedValue() {
    return expectedValue;
  }

  /**
   * Vision measured value
   * @param measuredValue the value
   */
  @JsonSetter("MeasuredValue")
  public ComponentVisionTest setMeasuredValue(double measuredValue) {
    this.measuredValue = measuredValue;
    return this;
  }

  /**
   * Vision measured value
   * @return MeasuredValue
   */
  @JsonGetter("MeasuredValue")
  public double getMeasuredValue() {
    return measuredValue;
  }

  /**
   * Minimum vision measure tolerance
   * @param toleranceMin the value
   */
  @JsonSetter("ToleranceMin")
  public ComponentVisionTest setToleranceMin(double toleranceMin) {
    this.toleranceMin = toleranceMin;
    return this;
  }

  /**
   * Minimum vision measure tolerance
   * @return ToleranceMin
   */
  @JsonGetter("ToleranceMin")
  public double getToleranceMin() {
    return toleranceMin;
  }

  /**
   * Maximum vision measure tolerance
   * @param toleranceMax the value
   */
  @JsonSetter("ToleranceMax")
  public ComponentVisionTest setToleranceMax(double toleranceMax) {
    this.toleranceMax = toleranceMax;
    return this;
  }

  /**
   * Maximum vision measure tolerance
   * @return ToleranceMax
   */
  @JsonGetter("ToleranceMax")
  public double getToleranceMax() {
    return toleranceMax;
  }

  /**
   * Unit used for the Expected value, the Mesasured value, and the Tolerances
   * @param unit the value
   */
  @JsonSetter("Unit")
  public ComponentVisionTest setUnit(String unit) {
    this.unit = unit;
    return this;
  }

  /**
   * Unit used for the Expected value, the Mesasured value, and the Tolerances
   *
   * @return never null
   */
  @JsonGetter("Unit")
  public String getUnit() {
    return unit == null ? "" : unit;
  }

  /**
   * Result of the vision test (true if OK)
   * @param result the value
   */
  @JsonSetter("Result")
  public ComponentVisionTest setResult(boolean result) {
    this.result = result;
    return this;
  }

  /**
   * Result of the vision test (true if OK)
   * @return Result
   */
  @JsonGetter("Result")
  public boolean isResult() {
    return result;
  }
}
