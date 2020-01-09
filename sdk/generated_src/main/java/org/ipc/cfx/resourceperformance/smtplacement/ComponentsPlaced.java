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
              &quot;StartTime&quot;: &quot;2018-04-05T09:28:06.161835-04:00&quot;,
              &quot;EndTime&quot;: &quot;2018-04-05T09:38:06.161835-04:00&quot;,
              &quot;TotalComponentsPlaced&quot;: 875,
              &quot;TotalComponentsNotPlaced&quot;: 45
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
   * @param startTime the value
   */
  @JsonSetter("StartTime")
  public ComponentsPlaced setStartTime(Date startTime) {
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
  public ComponentsPlaced setEndTime(Date endTime) {
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
   * The total number of components that were successfully placed during the sample period
   * @param totalComponentsPlaced the value
   */
  @JsonSetter("TotalComponentsPlaced")
  public ComponentsPlaced setTotalComponentsPlaced(int totalComponentsPlaced) {
    this.totalComponentsPlaced = totalComponentsPlaced;
    return this;
  }

  /**
   * The total number of components that were successfully placed during the sample period
   * @return TotalComponentsPlaced
   */
  @JsonGetter("TotalComponentsPlaced")
  public int getTotalComponentsPlaced() {
    return totalComponentsPlaced;
  }

  /**
   * The total number of components that were not successfully placed during the sample period
   * @param totalComponentsNotPlaced the value
   */
  @JsonSetter("TotalComponentsNotPlaced")
  public ComponentsPlaced setTotalComponentsNotPlaced(int totalComponentsNotPlaced) {
    this.totalComponentsNotPlaced = totalComponentsNotPlaced;
    return this;
  }

  /**
   * The total number of components that were not successfully placed during the sample period
   * @return TotalComponentsNotPlaced
   */
  @JsonGetter("TotalComponentsNotPlaced")
  public int getTotalComponentsNotPlaced() {
    return totalComponentsNotPlaced;
  }
}
