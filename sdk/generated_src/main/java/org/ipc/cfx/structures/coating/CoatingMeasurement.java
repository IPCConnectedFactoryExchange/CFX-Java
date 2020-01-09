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
package org.ipc.cfx.structures.coating;

import org.ipc.cfx.structures.Measurement;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Structure that describes the a particular measurement / reading that was taken by a coating or encapsulation
            endpoint in the course of dispensing.
 * original type: CFX.Structures.Coating.CoatingMeasurement
 */
public class CoatingMeasurement extends Measurement {

  private CoatingMeasurementType measurementType;
  private Double actualValue;
  private Double expectedValue;
  private Double minAcceptableValue;
  private Double maxAcceptableValue;

  /**
   * The type of reading
   * @param measurementType the value
   */
  @JsonSetter("MeasurementType")
  public CoatingMeasurement setMeasurementType(CoatingMeasurementType measurementType) {
    this.measurementType = measurementType;
    return this;
  }

  /**
   * The type of reading
   * @return MeasurementType
   */
  @JsonGetter("MeasurementType")
  public CoatingMeasurementType getMeasurementType() {
    return measurementType;
  }

  /**
   * The value of the reading (expressed in the appropriate units for the ReadingType).
   * @param actualValue the value
   */
  @JsonSetter("ActualValue")
  public CoatingMeasurement setActualValue(Double actualValue) {
    this.actualValue = actualValue;
    return this;
  }

  /**
   * The value of the reading (expressed in the appropriate units for the ReadingType).
   * @return ActualValue
   */
  @JsonGetter("ActualValue")
  public Double getActualValue() {
    return actualValue;
  }

  /**
   * The nominal or expected value for this reading (expressed in the appropriate units for the ReadingType).
   * @param expectedValue the value
   */
  @JsonSetter("ExpectedValue")
  public CoatingMeasurement setExpectedValue(Double expectedValue) {
    this.expectedValue = expectedValue;
    return this;
  }

  /**
   * The nominal or expected value for this reading (expressed in the appropriate units for the ReadingType).
   * @return ExpectedValue
   */
  @JsonGetter("ExpectedValue")
  public Double getExpectedValue() {
    return expectedValue;
  }

  /**
   * The minimum accecptable value for this reading (expressed in the appropriate units for the ReadingType).
   * @param minAcceptableValue the value
   */
  @JsonSetter("MinAcceptableValue")
  public CoatingMeasurement setMinAcceptableValue(Double minAcceptableValue) {
    this.minAcceptableValue = minAcceptableValue;
    return this;
  }

  /**
   * The minimum accecptable value for this reading (expressed in the appropriate units for the ReadingType).
   * @return MinAcceptableValue
   */
  @JsonGetter("MinAcceptableValue")
  public Double getMinAcceptableValue() {
    return minAcceptableValue;
  }

  /**
   * The maximum acceptable value for this reading (expressed in the appropriate units for the ReadingType).
   * @param maxAcceptableValue the value
   */
  @JsonSetter("MaxAcceptableValue")
  public CoatingMeasurement setMaxAcceptableValue(Double maxAcceptableValue) {
    this.maxAcceptableValue = maxAcceptableValue;
    return this;
  }

  /**
   * The maximum acceptable value for this reading (expressed in the appropriate units for the ReadingType).
   * @return MaxAcceptableValue
   */
  @JsonGetter("MaxAcceptableValue")
  public Double getMaxAcceptableValue() {
    return maxAcceptableValue;
  }
}
