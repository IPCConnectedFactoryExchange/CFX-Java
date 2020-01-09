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
 * Describes a measurement that was made by a human or by automated equipment
            in the course of inspecting or testing a production unit in which the result
            of the measurement is a boolean (true / fales) value.
 * original type: CFX.Structures.BooleanMeasurement
 */
public class BooleanMeasurement extends Measurement {

  private boolean value;
  private boolean expectedValue;

  /**
   * The actual resulting value of this measurement
   * @param value the value
   */
  @JsonSetter("Value")
  public BooleanMeasurement setValue(boolean value) {
    this.value = value;
    return this;
  }

  /**
   * The actual resulting value of this measurement
   * @return Value
   */
  @JsonGetter("Value")
  public boolean isValue() {
    return value;
  }

  /**
   * The expected value of this measurement
   * @param expectedValue the value
   */
  @JsonSetter("ExpectedValue")
  public BooleanMeasurement setExpectedValue(boolean expectedValue) {
    this.expectedValue = expectedValue;
    return this;
  }

  /**
   * The expected value of this measurement
   * @return ExpectedValue
   */
  @JsonGetter("ExpectedValue")
  public boolean isExpectedValue() {
    return expectedValue;
  }
}
