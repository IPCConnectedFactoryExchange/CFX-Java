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
package org.ipc.cfx.resourceperformance;

import java.util.Date;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent by a process endpoint on a sampled interval of between 1 minute and 1 hour
            to indicate the energy usage and power consumption.
            
            {
              &quot;StartTime&quot;: &quot;2018-04-05T09:33:06.1358356-04:00&quot;,
              &quot;EndTime&quot;: &quot;2018-04-05T09:38:06.1358356-04:00&quot;,
              &quot;EnergyUsed&quot;: 0.012,
              &quot;PeakPower&quot;: 125.6,
              &quot;MinimumPower&quot;: 120.3,
              &quot;MeanPower&quot;: 124.6
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
   * @param startTime the value
   */
  @JsonSetter("StartTime")
  public EnergyConsumed setStartTime(Date startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * The start time of the sample period
   * @return StartTime
   */
  @JsonGetter("StartTime")
  public Date getStartTime() {
    return startTime;
  }

  /**
   * The end time of the sample period
   * @param endTime the value
   */
  @JsonSetter("EndTime")
  public EnergyConsumed setEndTime(Date endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * The end time of the sample period
   * @return EndTime
   */
  @JsonGetter("EndTime")
  public Date getEndTime() {
    return endTime;
  }

  /**
   * The total amount of energy consumed during the sample period
            (in kilowatt-hours)
   * @param energyUsed the value
   */
  @JsonSetter("EnergyUsed")
  public EnergyConsumed setEnergyUsed(double energyUsed) {
    this.energyUsed = energyUsed;
    return this;
  }

  /**
   * The total amount of energy consumed during the sample period
            (in kilowatt-hours)
   * @return EnergyUsed
   */
  @JsonGetter("EnergyUsed")
  public double getEnergyUsed() {
    return energyUsed;
  }

  /**
   * The maximum amount of power recorded during the sample period
            (in watts)
   * @param peakPower the value
   */
  @JsonSetter("PeakPower")
  public EnergyConsumed setPeakPower(double peakPower) {
    this.peakPower = peakPower;
    return this;
  }

  /**
   * The maximum amount of power recorded during the sample period
            (in watts)
   * @return PeakPower
   */
  @JsonGetter("PeakPower")
  public double getPeakPower() {
    return peakPower;
  }

  /**
   * The lowest amount of power recorded during the sample period
            (in watts)
   * @param minimumPower the value
   */
  @JsonSetter("MinimumPower")
  public EnergyConsumed setMinimumPower(double minimumPower) {
    this.minimumPower = minimumPower;
    return this;
  }

  /**
   * The lowest amount of power recorded during the sample period
            (in watts)
   * @return MinimumPower
   */
  @JsonGetter("MinimumPower")
  public double getMinimumPower() {
    return minimumPower;
  }

  /**
   * The average amount of power consumed during the sample period
            (in watts)
   * @param meanPower the value
   */
  @JsonSetter("MeanPower")
  public EnergyConsumed setMeanPower(double meanPower) {
    this.meanPower = meanPower;
    return this;
  }

  /**
   * The average amount of power consumed during the sample period
            (in watts)
   * @return MeanPower
   */
  @JsonGetter("MeanPower")
  public double getMeanPower() {
    return meanPower;
  }
}
