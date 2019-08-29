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
 * 
 * original type: CFX.Structures.NumericValue
 */
public class NumericValue {

  private double value;
  private String valueUnits;
  private Double expectedValue;
  private String expectedValueUnits;
  private Double minimumAcceptableValue;
  private Double maximumAcceptableValue;

  /**
   * The actual numeric value that was measured and recorded during a test or inspection
   */
  @JsonSetter("Value")
  public void setValue(double value) {
    this.value = value;
  }

  /**
   * The actual numeric value that was measured and recorded during a test or inspection
   */
  @JsonGetter("Value")
  public double getValue() {
    return value;
  }

  /**
   * The units of the value (must be a valid SI unit)
   */
  @JsonSetter("ValueUnits")
  public void setValueUnits(String valueUnits) {
    this.valueUnits = valueUnits;
  }

  /**
   * The units of the value (must be a valid SI unit)
   *
   * @return never null
   */
  @JsonGetter("ValueUnits")
  public String getValueUnits() {
    return valueUnits == null ? "" : valueUnits;
  }

  /**
   * The expected value for thie measurement
   */
  @JsonSetter("ExpectedValue")
  public void setExpectedValue(Double expectedValue) {
    this.expectedValue = expectedValue;
  }

  /**
   * The expected value for thie measurement
   */
  @JsonGetter("ExpectedValue")
  public Double getExpectedValue() {
    return expectedValue;
  }

  /**
   * The units of the expected value (must be a valid SI unit)
   */
  @JsonSetter("ExpectedValueUnits")
  public void setExpectedValueUnits(String expectedValueUnits) {
    this.expectedValueUnits = expectedValueUnits;
  }

  /**
   * The units of the expected value (must be a valid SI unit)
   *
   * @return never null
   */
  @JsonGetter("ExpectedValueUnits")
  public String getExpectedValueUnits() {
    return expectedValueUnits == null ? "" : expectedValueUnits;
  }

  /**
   * The minimum acceptable value
   */
  @JsonSetter("MinimumAcceptableValue")
  public void setMinimumAcceptableValue(Double minimumAcceptableValue) {
    this.minimumAcceptableValue = minimumAcceptableValue;
  }

  /**
   * The minimum acceptable value
   */
  @JsonGetter("MinimumAcceptableValue")
  public Double getMinimumAcceptableValue() {
    return minimumAcceptableValue;
  }

  /**
   * The minimum acceptable value
   */
  @JsonSetter("MaximumAcceptableValue")
  public void setMaximumAcceptableValue(Double maximumAcceptableValue) {
    this.maximumAcceptableValue = maximumAcceptableValue;
  }

  /**
   * The minimum acceptable value
   */
  @JsonGetter("MaximumAcceptableValue")
  public Double getMaximumAcceptableValue() {
    return maximumAcceptableValue;
  }
}
