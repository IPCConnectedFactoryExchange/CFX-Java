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
package org.ipc.cfx.resourceperformance.smtplacement;

import java.util.Date;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent periodically by an SMT placement machine to indicate the number of placements which were
            successfully or unsuccessfully completed during the sample time window.
            This sample time window shall not exceed 10 minutes.
            
            {
              "StartTime": "2018-04-05T09:28:06.161835-04:00",
              "EndTime": "2018-04-05T09:38:06.161835-04:00",
              "TotalComponentsPlaced": 875,
              "TotalComponentsNotPlaced": 45
            }
 * original type: CFX.ResourcePerformance.SMTPlacement.ComponentsPlaced
 */
public class ComponentsPlaced extends CFXMessage {

  private Date startTime;
  private Date endTime;
  private int totalComponentsPlaced;
  private int totalComponentsNotPlaced;

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
   * The total number of components that were successfully placed during the sample period
   */
  @JsonSetter("TotalComponentsPlaced")
  public void setTotalComponentsPlaced(int totalComponentsPlaced) {
    this.totalComponentsPlaced = totalComponentsPlaced;
  }

  /**
   * The total number of components that were successfully placed during the sample period
   */
  @JsonGetter("TotalComponentsPlaced")
  public int getTotalComponentsPlaced() {
    return totalComponentsPlaced;
  }

  /**
   * The total number of components that were not successfully placed during the sample period
   */
  @JsonSetter("TotalComponentsNotPlaced")
  public void setTotalComponentsNotPlaced(int totalComponentsNotPlaced) {
    this.totalComponentsNotPlaced = totalComponentsNotPlaced;
  }

  /**
   * The total number of components that were not successfully placed during the sample period
   */
  @JsonGetter("TotalComponentsNotPlaced")
  public int getTotalComponentsNotPlaced() {
    return totalComponentsNotPlaced;
  }
}
