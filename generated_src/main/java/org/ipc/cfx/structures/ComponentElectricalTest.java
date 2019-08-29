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
   */
  @JsonSetter("TesterSerialNumber")
  public void setTesterSerialNumber(String testerSerialNumber) {
    this.testerSerialNumber = testerSerialNumber;
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
   */
  @JsonSetter("Frequency")
  public void setFrequency(double frequency) {
    this.frequency = frequency;
  }

  /**
   * Frequency used for the measure (Hertz)
   */
  @JsonGetter("Frequency")
  public double getFrequency() {
    return frequency;
  }

  /**
   * Electrical expected value
   */
  @JsonSetter("ExpectedValue")
  public void setExpectedValue(double expectedValue) {
    this.expectedValue = expectedValue;
  }

  /**
   * Electrical expected value
   */
  @JsonGetter("ExpectedValue")
  public double getExpectedValue() {
    return expectedValue;
  }

  /**
   * Electrical measured value
   */
  @JsonSetter("MeasuredValue")
  public void setMeasuredValue(double measuredValue) {
    this.measuredValue = measuredValue;
  }

  /**
   * Electrical measured value
   */
  @JsonGetter("MeasuredValue")
  public double getMeasuredValue() {
    return measuredValue;
  }

  /**
   * Minimum electrical measure tolerance
   */
  @JsonSetter("ToleranceMin")
  public void setToleranceMin(double toleranceMin) {
    this.toleranceMin = toleranceMin;
  }

  /**
   * Minimum electrical measure tolerance
   */
  @JsonGetter("ToleranceMin")
  public double getToleranceMin() {
    return toleranceMin;
  }

  /**
   * Maximum electrical measure tolerance
   */
  @JsonSetter("ToleranceMax")
  public void setToleranceMax(double toleranceMax) {
    this.toleranceMax = toleranceMax;
  }

  /**
   * Maximum electrical measure tolerance
   */
  @JsonGetter("ToleranceMax")
  public double getToleranceMax() {
    return toleranceMax;
  }

  /**
   * Unit used for the Expected value, the Mesasured value, and the Tolerances
   */
  @JsonSetter("Unit")
  public void setUnit(ComponentElectricalTestUnit unit) {
    this.unit = unit;
  }

  /**
   * Unit used for the Expected value, the Mesasured value, and the Tolerances
   */
  @JsonGetter("Unit")
  public ComponentElectricalTestUnit getUnit() {
    return unit;
  }

  /**
   * Result of the electrical test (true if OK)
   */
  @JsonSetter("Result")
  public void setResult(boolean result) {
    this.result = result;
  }

  /**
   * Result of the electrical test (true if OK)
   */
  @JsonGetter("Result")
  public boolean isResult() {
    return result;
  }
}
