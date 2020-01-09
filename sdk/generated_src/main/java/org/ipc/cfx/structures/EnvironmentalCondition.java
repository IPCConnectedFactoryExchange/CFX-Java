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

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

/**
 * Describes an environmental condition that was in place when an action was performed.
 * original type: CFX.Structures.EnvironmentalCondition
 */
@JsonTypeInfo(use = Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "$type")
@JsonSubTypes({
  @Type(value = Humidity.class, name = "CFX.Structures.Humidity, CFX"),
  @Type(value = Temperature.class, name = "CFX.Structures.Temperature, CFX"),
})
public class EnvironmentalCondition {

  private Date startTime;
  private Date endTime;
  private double meanValue;
  private double medianValue;
  private double maxValue;
  private double minValue;

  /**
   * The start time for the sample period
   * @param startTime the value
   */
  @JsonSetter("StartTime")
  public EnvironmentalCondition setStartTime(Date startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * The start time for the sample period
   * @return StartTime
   */
  @JsonGetter("StartTime")
  public Date getStartTime() {
    return startTime;
  }

  /**
   * The end time for the sample period
   * @param endTime the value
   */
  @JsonSetter("EndTime")
  public EnvironmentalCondition setEndTime(Date endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * The end time for the sample period
   * @return EndTime
   */
  @JsonGetter("EndTime")
  public Date getEndTime() {
    return endTime;
  }

  /**
   * The average value during the sample period
   * @param meanValue the value
   */
  @JsonSetter("MeanValue")
  public EnvironmentalCondition setMeanValue(double meanValue) {
    this.meanValue = meanValue;
    return this;
  }

  /**
   * The average value during the sample period
   * @return MeanValue
   */
  @JsonGetter("MeanValue")
  public double getMeanValue() {
    return meanValue;
  }

  /**
   * The median value during the sample period
   * @param medianValue the value
   */
  @JsonSetter("MedianValue")
  public EnvironmentalCondition setMedianValue(double medianValue) {
    this.medianValue = medianValue;
    return this;
  }

  /**
   * The median value during the sample period
   * @return MedianValue
   */
  @JsonGetter("MedianValue")
  public double getMedianValue() {
    return medianValue;
  }

  /**
   * The maximum value during the sample period
   * @param maxValue the value
   */
  @JsonSetter("MaxValue")
  public EnvironmentalCondition setMaxValue(double maxValue) {
    this.maxValue = maxValue;
    return this;
  }

  /**
   * The maximum value during the sample period
   * @return MaxValue
   */
  @JsonGetter("MaxValue")
  public double getMaxValue() {
    return maxValue;
  }

  /**
   * The minimum value during the sample period
   * @param minValue the value
   */
  @JsonSetter("MinValue")
  public EnvironmentalCondition setMinValue(double minValue) {
    this.minValue = minValue;
    return this;
  }

  /**
   * The minimum value during the sample period
   * @return MinValue
   */
  @JsonGetter("MinValue")
  public double getMinValue() {
    return minValue;
  }
}
