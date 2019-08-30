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

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import org.ipc.cfx.structures.ProcessData;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * A dynamic data structure representing data that was collected during a coating process.
 * original type: CFX.Structures.Coating.CoatingProcessData
 */
@JsonTypeInfo(use = Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "$type")
@JsonSubTypes({
  @Type(value = EncapsulationProcessData.class, name = "CFX.Structures.Coating.EncapsulationProcessData, CFX"),
})
public class CoatingProcessData extends ProcessData {

  private CoatingMeasurement[] readings;

  /**
   * A list of measurements that were taken in the course of the coating or encapsulation operation.
   * @param readings the value
   */
  @JsonSetter("Readings")
  public void setReadings(CoatingMeasurement[] readings) {
    this.readings = readings;
  }

  /**
   * A list of measurements that were taken in the course of the coating or encapsulation operation.
   * @return Readings
   */
  @JsonGetter("Readings")
  public CoatingMeasurement[] getReadings() {
    return readings;
  }
}
