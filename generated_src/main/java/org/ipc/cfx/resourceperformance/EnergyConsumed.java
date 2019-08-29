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
 * created: 20.08.2019 15:52:37 by frankp
 */
package org.ipc.cfx.resourceperformance;

import java.util.Date;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent by a process endpoint on a sampled interval of between 1 minute and 1 hour
            to indicate the energy usage and power consumption.
            
            {
              "StartTime": "2018-04-05T09:33:06.1358356-04:00",
              "EndTime": "2018-04-05T09:38:06.1358356-04:00",
              "EnergyUsed": 0.012,
              "PeakPower": 125.6,
              "MinimumPower": 120.3,
              "MeanPower": 124.6
            }
 * original type: CFX.ResourcePerformance.EnergyConsumed
 */
public class EnergyConsumed extends CFXMessage {

  private Date startTime;
  private Date endTime;
  private double energyUsed;
  private double peakPower;
  private double minimumPower;
  private double meanPower;

  /**
   * The start time of the sample period
   */
  @JsonSetter("StartTime")
  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  /**
   * The start time of the sample period
   */
  @JsonGetter("StartTime")
  public Date getStartTime() {
    return startTime;
  }

  /**
   * The end time of the sample period
   */
  @JsonSetter("EndTime")
  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  /**
   * The end time of the sample period
   */
  @JsonGetter("EndTime")
  public Date getEndTime() {
    return endTime;
  }

  /**
   * The total amount of energy consumed during the sample period
            (in kilowatt-hours)
   */
  @JsonSetter("EnergyUsed")
  public void setEnergyUsed(double energyUsed) {
    this.energyUsed = energyUsed;
  }

  /**
   * The total amount of energy consumed during the sample period
            (in kilowatt-hours)
   */
  @JsonGetter("EnergyUsed")
  public double getEnergyUsed() {
    return energyUsed;
  }

  /**
   * The maximum amount of power recorded during the sample period
            (in watts)
   */
  @JsonSetter("PeakPower")
  public void setPeakPower(double peakPower) {
    this.peakPower = peakPower;
  }

  /**
   * The maximum amount of power recorded during the sample period
            (in watts)
   */
  @JsonGetter("PeakPower")
  public double getPeakPower() {
    return peakPower;
  }

  /**
   * The lowest amount of power recorded during the sample period
            (in watts)
   */
  @JsonSetter("MinimumPower")
  public void setMinimumPower(double minimumPower) {
    this.minimumPower = minimumPower;
  }

  /**
   * The lowest amount of power recorded during the sample period
            (in watts)
   */
  @JsonGetter("MinimumPower")
  public double getMinimumPower() {
    return minimumPower;
  }

  /**
   * The average amount of power consumed during the sample period
            (in watts)
   */
  @JsonSetter("MeanPower")
  public void setMeanPower(double meanPower) {
    this.meanPower = meanPower;
  }

  /**
   * The average amount of power consumed during the sample period
            (in watts)
   */
  @JsonGetter("MeanPower")
  public double getMeanPower() {
    return meanPower;
  }
}
