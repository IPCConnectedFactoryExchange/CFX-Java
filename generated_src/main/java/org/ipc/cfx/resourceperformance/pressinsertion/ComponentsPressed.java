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
package org.ipc.cfx.resourceperformance.pressinsertion;

import java.util.Date;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent periodically by a Press Fit machine to indicate the number of presses which were
            successfully or unsuccessfully completed during the sample time window.
            
            {
              "StartTime": "2018-04-06T08:06:46.4471059-04:00",
              "EndTime": "2018-04-06T08:16:46.4471059-04:00",
              "TotalComponentsPressed": 10,
              "TotalComponentsNotPressed": 2
            }
 * original type: CFX.ResourcePerformance.PressInsertion.ComponentsPressed
 */
public class ComponentsPressed extends CFXMessage {

  private Date startTime;
  private Date endTime;
  private int totalComponentsPressed;
  private int totalComponentsNotPressed;

  /**
   * The start of the sample period
   */
  @JsonSetter("StartTime")
  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  /**
   * The start of the sample period
   */
  @JsonGetter("StartTime")
  public Date getStartTime() {
    return startTime;
  }

  /**
   * The end of the sample period
   */
  @JsonSetter("EndTime")
  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  /**
   * The end of the sample period
   */
  @JsonGetter("EndTime")
  public Date getEndTime() {
    return endTime;
  }

  /**
   * The total number of components that were successfully pressed during the sample period
   */
  @JsonSetter("TotalComponentsPressed")
  public void setTotalComponentsPressed(int totalComponentsPressed) {
    this.totalComponentsPressed = totalComponentsPressed;
  }

  /**
   * The total number of components that were successfully pressed during the sample period
   */
  @JsonGetter("TotalComponentsPressed")
  public int getTotalComponentsPressed() {
    return totalComponentsPressed;
  }

  /**
   * The total number of components that were not successfully pressed during the sample period
   */
  @JsonSetter("TotalComponentsNotPressed")
  public void setTotalComponentsNotPressed(int totalComponentsNotPressed) {
    this.totalComponentsNotPressed = totalComponentsNotPressed;
  }

  /**
   * The total number of components that were not successfully pressed during the sample period
   */
  @JsonGetter("TotalComponentsNotPressed")
  public int getTotalComponentsNotPressed() {
    return totalComponentsNotPressed;
  }
}
