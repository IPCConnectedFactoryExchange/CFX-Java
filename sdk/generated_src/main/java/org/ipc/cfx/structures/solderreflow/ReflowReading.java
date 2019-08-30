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
package org.ipc.cfx.structures.solderreflow;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Structure that describes the setpoints and key actuals of a particular area
            within a particular zone of a reflow oven.
 * original type: CFX.Structures.SolderReflow.ReflowReading
 */
public class ReflowReading {

  private ReflowSubZoneType subZone;
  private ReflowReadingType readingType;
  private Double readingValue;

  /**
   * An enumeration that describes a particular area within a particular zone of a reflow oven.
   * @param subZone the value
   */
  @JsonSetter("SubZone")
  public void setSubZone(ReflowSubZoneType subZone) {
    this.subZone = subZone;
  }

  /**
   * An enumeration that describes a particular area within a particular zone of a reflow oven.
   * @return SubZone
   */
  @JsonGetter("SubZone")
  public ReflowSubZoneType getSubZone() {
    return subZone;
  }

  /**
   * An enumeration describing the type of reading.
   * @param readingType the value
   */
  @JsonSetter("ReadingType")
  public void setReadingType(ReflowReadingType readingType) {
    this.readingType = readingType;
  }

  /**
   * An enumeration describing the type of reading.
   * @return ReadingType
   */
  @JsonGetter("ReadingType")
  public ReflowReadingType getReadingType() {
    return readingType;
  }

  /**
   * The value of the reading (expressed in the appropriate units for the ReadingType).
   * @param readingValue the value
   */
  @JsonSetter("ReadingValue")
  public void setReadingValue(Double readingValue) {
    this.readingValue = readingValue;
  }

  /**
   * The value of the reading (expressed in the appropriate units for the ReadingType).
   * @return ReadingValue
   */
  @JsonGetter("ReadingValue")
  public Double getReadingValue() {
    return readingValue;
  }
}
