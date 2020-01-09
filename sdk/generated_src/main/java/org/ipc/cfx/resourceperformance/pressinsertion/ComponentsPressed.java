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
package org.ipc.cfx.resourceperformance.pressinsertion;

import java.util.Date;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent periodically by a Press Fit machine to indicate the number of presses which were
            successfully or unsuccessfully completed during the sample time window.
            
            {
              &quot;StartTime&quot;: &quot;2018-04-06T08:06:46.4471059-04:00&quot;,
              &quot;EndTime&quot;: &quot;2018-04-06T08:16:46.4471059-04:00&quot;,
              &quot;TotalComponentsPressed&quot;: 10,
              &quot;TotalComponentsNotPressed&quot;: 2
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
   * @param startTime the value
   */
  @JsonSetter("StartTime")
  public ComponentsPressed setStartTime(Date startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * The start of the sample period
   * @return StartTime
   */
  @JsonGetter("StartTime")
  public Date getStartTime() {
    return startTime;
  }

  /**
   * The end of the sample period
   * @param endTime the value
   */
  @JsonSetter("EndTime")
  public ComponentsPressed setEndTime(Date endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * The end of the sample period
   * @return EndTime
   */
  @JsonGetter("EndTime")
  public Date getEndTime() {
    return endTime;
  }

  /**
   * The total number of components that were successfully pressed during the sample period
   * @param totalComponentsPressed the value
   */
  @JsonSetter("TotalComponentsPressed")
  public ComponentsPressed setTotalComponentsPressed(int totalComponentsPressed) {
    this.totalComponentsPressed = totalComponentsPressed;
    return this;
  }

  /**
   * The total number of components that were successfully pressed during the sample period
   * @return TotalComponentsPressed
   */
  @JsonGetter("TotalComponentsPressed")
  public int getTotalComponentsPressed() {
    return totalComponentsPressed;
  }

  /**
   * The total number of components that were not successfully pressed during the sample period
   * @param totalComponentsNotPressed the value
   */
  @JsonSetter("TotalComponentsNotPressed")
  public ComponentsPressed setTotalComponentsNotPressed(int totalComponentsNotPressed) {
    this.totalComponentsNotPressed = totalComponentsNotPressed;
    return this;
  }

  /**
   * The total number of components that were not successfully pressed during the sample period
   * @return TotalComponentsNotPressed
   */
  @JsonGetter("TotalComponentsNotPressed")
  public int getTotalComponentsNotPressed() {
    return totalComponentsNotPressed;
  }
}
