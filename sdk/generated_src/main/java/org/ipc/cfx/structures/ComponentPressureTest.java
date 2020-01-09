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
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

/**
 * Describes details on a pressure test of a component
 * original type: CFX.Structures.ComponentPressureTest
 */
@JsonTypeInfo(use = Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "$type")
@JsonSubTypes({
  @Type(value = BadPressureTestRejectionDetails.class, name = "CFX.Structures.BadPressureTestRejectionDetails, CFX"),
})
public class ComponentPressureTest {

  private double expectedValue;
  private double measuredValue;
  private double toleranceMin;
  private double toleranceMax;
  private String unit;
  private boolean result;

  /**
   * Pressure expected value
   * @param expectedValue the value
   */
  @JsonSetter("ExpectedValue")
  public ComponentPressureTest setExpectedValue(double expectedValue) {
    this.expectedValue = expectedValue;
    return this;
  }

  /**
   * Pressure expected value
   * @return ExpectedValue
   */
  @JsonGetter("ExpectedValue")
  public double getExpectedValue() {
    return expectedValue;
  }

  /**
   * Pressure measured value
   * @param measuredValue the value
   */
  @JsonSetter("MeasuredValue")
  public ComponentPressureTest setMeasuredValue(double measuredValue) {
    this.measuredValue = measuredValue;
    return this;
  }

  /**
   * Pressure measured value
   * @return MeasuredValue
   */
  @JsonGetter("MeasuredValue")
  public double getMeasuredValue() {
    return measuredValue;
  }

  /**
   * Minimum pressure measure tolerance
   * @param toleranceMin the value
   */
  @JsonSetter("ToleranceMin")
  public ComponentPressureTest setToleranceMin(double toleranceMin) {
    this.toleranceMin = toleranceMin;
    return this;
  }

  /**
   * Minimum pressure measure tolerance
   * @return ToleranceMin
   */
  @JsonGetter("ToleranceMin")
  public double getToleranceMin() {
    return toleranceMin;
  }

  /**
   * Maximum pressure measure tolerance
   * @param toleranceMax the value
   */
  @JsonSetter("ToleranceMax")
  public ComponentPressureTest setToleranceMax(double toleranceMax) {
    this.toleranceMax = toleranceMax;
    return this;
  }

  /**
   * Maximum pressure measure tolerance
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
  public ComponentPressureTest setUnit(String unit) {
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
   * Result of the pressure test (true if OK)
   * @param result the value
   */
  @JsonSetter("Result")
  public ComponentPressureTest setResult(boolean result) {
    this.result = result;
    return this;
  }

  /**
   * Result of the pressure test (true if OK)
   * @return Result
   */
  @JsonGetter("Result")
  public boolean isResult() {
    return result;
  }
}
