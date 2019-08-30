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
 * created: 30.08.2019 09:11:09 by frankp
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
  public void setMeasurementType(CoatingMeasurementType measurementType) {
    this.measurementType = measurementType;
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
  public void setActualValue(Double actualValue) {
    this.actualValue = actualValue;
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
  public void setExpectedValue(Double expectedValue) {
    this.expectedValue = expectedValue;
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
  public void setMinAcceptableValue(Double minAcceptableValue) {
    this.minAcceptableValue = minAcceptableValue;
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
  public void setMaxAcceptableValue(Double maxAcceptableValue) {
    this.maxAcceptableValue = maxAcceptableValue;
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
