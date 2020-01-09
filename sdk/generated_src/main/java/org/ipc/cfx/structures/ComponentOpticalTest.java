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
 * Describes details on an optical test of a component
 * original type: CFX.Structures.ComponentOpticalTest
 */
@JsonTypeInfo(use = Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "$type")
@JsonSubTypes({
  @Type(value = BadOpticalTestRejectionDetails.class, name = "CFX.Structures.BadOpticalTestRejectionDetails, CFX"),
})
public class ComponentOpticalTest {

  private double expectedValue;
  private double measuredValue;
  private double toleranceMin;
  private double toleranceMax;
  private String unit;
  private boolean result;

  /**
   * Optical expected value
   * @param expectedValue the value
   */
  @JsonSetter("ExpectedValue")
  public ComponentOpticalTest setExpectedValue(double expectedValue) {
    this.expectedValue = expectedValue;
    return this;
  }

  /**
   * Optical expected value
   * @return ExpectedValue
   */
  @JsonGetter("ExpectedValue")
  public double getExpectedValue() {
    return expectedValue;
  }

  /**
   * Optical measured value
   * @param measuredValue the value
   */
  @JsonSetter("MeasuredValue")
  public ComponentOpticalTest setMeasuredValue(double measuredValue) {
    this.measuredValue = measuredValue;
    return this;
  }

  /**
   * Optical measured value
   * @return MeasuredValue
   */
  @JsonGetter("MeasuredValue")
  public double getMeasuredValue() {
    return measuredValue;
  }

  /**
   * Minimum optical measure tolerance
   * @param toleranceMin the value
   */
  @JsonSetter("ToleranceMin")
  public ComponentOpticalTest setToleranceMin(double toleranceMin) {
    this.toleranceMin = toleranceMin;
    return this;
  }

  /**
   * Minimum optical measure tolerance
   * @return ToleranceMin
   */
  @JsonGetter("ToleranceMin")
  public double getToleranceMin() {
    return toleranceMin;
  }

  /**
   * Maximum optical measure tolerance
   * @param toleranceMax the value
   */
  @JsonSetter("ToleranceMax")
  public ComponentOpticalTest setToleranceMax(double toleranceMax) {
    this.toleranceMax = toleranceMax;
    return this;
  }

  /**
   * Maximum optical measure tolerance
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
  public ComponentOpticalTest setUnit(String unit) {
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
   * Result of the optical test (true if OK)
   * @param result the value
   */
  @JsonSetter("Result")
  public ComponentOpticalTest setResult(boolean result) {
    this.result = result;
    return this;
  }

  /**
   * Result of the optical test (true if OK)
   * @return Result
   */
  @JsonGetter("Result")
  public boolean isResult() {
    return result;
  }
}
