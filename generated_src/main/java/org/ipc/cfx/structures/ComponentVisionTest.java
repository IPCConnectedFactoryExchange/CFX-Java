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
   */
  @JsonSetter("InformationId")
  public void setInformationId(String informationId) {
    this.informationId = informationId;
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
   */
  @JsonSetter("ExpectedValue")
  public void setExpectedValue(double expectedValue) {
    this.expectedValue = expectedValue;
  }

  /**
   * Vision expected value
   */
  @JsonGetter("ExpectedValue")
  public double getExpectedValue() {
    return expectedValue;
  }

  /**
   * Vision measured value
   */
  @JsonSetter("MeasuredValue")
  public void setMeasuredValue(double measuredValue) {
    this.measuredValue = measuredValue;
  }

  /**
   * Vision measured value
   */
  @JsonGetter("MeasuredValue")
  public double getMeasuredValue() {
    return measuredValue;
  }

  /**
   * Minimum vision measure tolerance
   */
  @JsonSetter("ToleranceMin")
  public void setToleranceMin(double toleranceMin) {
    this.toleranceMin = toleranceMin;
  }

  /**
   * Minimum vision measure tolerance
   */
  @JsonGetter("ToleranceMin")
  public double getToleranceMin() {
    return toleranceMin;
  }

  /**
   * Maximum vision measure tolerance
   */
  @JsonSetter("ToleranceMax")
  public void setToleranceMax(double toleranceMax) {
    this.toleranceMax = toleranceMax;
  }

  /**
   * Maximum vision measure tolerance
   */
  @JsonGetter("ToleranceMax")
  public double getToleranceMax() {
    return toleranceMax;
  }

  /**
   * Unit used for the Expected value, the Mesasured value, and the Tolerances
   */
  @JsonSetter("Unit")
  public void setUnit(String unit) {
    this.unit = unit;
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
   */
  @JsonSetter("Result")
  public void setResult(boolean result) {
    this.result = result;
  }

  /**
   * Result of the vision test (true if OK)
   */
  @JsonGetter("Result")
  public boolean isResult() {
    return result;
  }
}
