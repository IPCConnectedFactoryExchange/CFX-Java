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

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Describes details on an electrical test of a component
 * original type: CFX.Structures.ComponentElectricalTest
 */
@JsonTypeInfo(use = Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "$type")
@JsonSubTypes({
  @Type(value = BadElectricalTestRejectionDetails.class, name = "CFX.Structures.BadElectricalTestRejectionDetails, CFX"),
})
public class ComponentElectricalTest {

  private String testerSerialNumber;
  private double frequency;
  private double expectedValue;
  private double measuredValue;
  private double toleranceMin;
  private double toleranceMax;
  private ComponentElectricalTestUnit unit;
  private boolean result;

  /**
   * Serial number of the electrical tester
   * @param testerSerialNumber the value
   */
  @JsonSetter("TesterSerialNumber")
  public ComponentElectricalTest setTesterSerialNumber(String testerSerialNumber) {
    this.testerSerialNumber = testerSerialNumber;
    return this;
  }

  /**
   * Serial number of the electrical tester
   *
   * @return never null
   */
  @JsonGetter("TesterSerialNumber")
  public String getTesterSerialNumber() {
    return testerSerialNumber == null ? "" : testerSerialNumber;
  }

  /**
   * Frequency used for the measure (Hertz)
   * @param frequency the value
   */
  @JsonSetter("Frequency")
  public ComponentElectricalTest setFrequency(double frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Frequency used for the measure (Hertz)
   * @return Frequency
   */
  @JsonGetter("Frequency")
  public double getFrequency() {
    return frequency;
  }

  /**
   * Electrical expected value
   * @param expectedValue the value
   */
  @JsonSetter("ExpectedValue")
  public ComponentElectricalTest setExpectedValue(double expectedValue) {
    this.expectedValue = expectedValue;
    return this;
  }

  /**
   * Electrical expected value
   * @return ExpectedValue
   */
  @JsonGetter("ExpectedValue")
  public double getExpectedValue() {
    return expectedValue;
  }

  /**
   * Electrical measured value
   * @param measuredValue the value
   */
  @JsonSetter("MeasuredValue")
  public ComponentElectricalTest setMeasuredValue(double measuredValue) {
    this.measuredValue = measuredValue;
    return this;
  }

  /**
   * Electrical measured value
   * @return MeasuredValue
   */
  @JsonGetter("MeasuredValue")
  public double getMeasuredValue() {
    return measuredValue;
  }

  /**
   * Minimum electrical measure tolerance
   * @param toleranceMin the value
   */
  @JsonSetter("ToleranceMin")
  public ComponentElectricalTest setToleranceMin(double toleranceMin) {
    this.toleranceMin = toleranceMin;
    return this;
  }

  /**
   * Minimum electrical measure tolerance
   * @return ToleranceMin
   */
  @JsonGetter("ToleranceMin")
  public double getToleranceMin() {
    return toleranceMin;
  }

  /**
   * Maximum electrical measure tolerance
   * @param toleranceMax the value
   */
  @JsonSetter("ToleranceMax")
  public ComponentElectricalTest setToleranceMax(double toleranceMax) {
    this.toleranceMax = toleranceMax;
    return this;
  }

  /**
   * Maximum electrical measure tolerance
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
  public ComponentElectricalTest setUnit(ComponentElectricalTestUnit unit) {
    this.unit = unit;
    return this;
  }

  /**
   * Unit used for the Expected value, the Mesasured value, and the Tolerances
   * @return Unit
   */
  @JsonGetter("Unit")
  public ComponentElectricalTestUnit getUnit() {
    return unit;
  }

  /**
   * Result of the electrical test (true if OK)
   * @param result the value
   */
  @JsonSetter("Result")
  public ComponentElectricalTest setResult(boolean result) {
    this.result = result;
    return this;
  }

  /**
   * Result of the electrical test (true if OK)
   * @return Result
   */
  @JsonGetter("Result")
  public boolean isResult() {
    return result;
  }
}
