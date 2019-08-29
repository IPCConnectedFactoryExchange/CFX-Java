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
 * Structure that specifies the operating requirements (environmental, etc.) 
            of a given endpoint.
 * original type: CFX.Structures.OperatingRequirements
 */
public class OperatingRequirements {

  private double minimumHumidity;
  private double maximumHumidity;
  private double minimumTemperature;
  private double maximumTemperature;

  /**
   * The minimum level of relative humidity (expressed as a percentage from 0 to 1) required
            for the endpoint to operate
   */
  @JsonSetter("MinimumHumidity")
  public void setMinimumHumidity(double minimumHumidity) {
    this.minimumHumidity = minimumHumidity;
  }

  /**
   * The minimum level of relative humidity (expressed as a percentage from 0 to 1) required
            for the endpoint to operate
   */
  @JsonGetter("MinimumHumidity")
  public double getMinimumHumidity() {
    return minimumHumidity;
  }

  /**
   * The maximum level of relative humidity (expressed as a percentage from 0 to 1) that the
            endpoint can tolerate
   */
  @JsonSetter("MaximumHumidity")
  public void setMaximumHumidity(double maximumHumidity) {
    this.maximumHumidity = maximumHumidity;
  }

  /**
   * The maximum level of relative humidity (expressed as a percentage from 0 to 1) that the
            endpoint can tolerate
   */
  @JsonGetter("MaximumHumidity")
  public double getMaximumHumidity() {
    return maximumHumidity;
  }

  /**
   * The minimum templerature (expressed in degrees Celsius) required
            for the endpoint to operate
   */
  @JsonSetter("MinimumTemperature")
  public void setMinimumTemperature(double minimumTemperature) {
    this.minimumTemperature = minimumTemperature;
  }

  /**
   * The minimum templerature (expressed in degrees Celsius) required
            for the endpoint to operate
   */
  @JsonGetter("MinimumTemperature")
  public double getMinimumTemperature() {
    return minimumTemperature;
  }

  /**
   * The maximum templerature (expressed in degrees Celsius) that the endpoint can tolerate.
   */
  @JsonSetter("MaximumTemperature")
  public void setMaximumTemperature(double maximumTemperature) {
    this.maximumTemperature = maximumTemperature;
  }

  /**
   * The maximum templerature (expressed in degrees Celsius) that the endpoint can tolerate.
   */
  @JsonGetter("MaximumTemperature")
  public double getMaximumTemperature() {
    return maximumTemperature;
  }
}
