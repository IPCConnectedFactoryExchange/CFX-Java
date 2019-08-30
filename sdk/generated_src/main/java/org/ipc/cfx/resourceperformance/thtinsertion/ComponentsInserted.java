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
package org.ipc.cfx.resourceperformance.thtinsertion;

import java.util.Date;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent periodically by an THT inserter to indicate the number of insertions which were
            successfully or unsuccessfully completed during the sample time window.
            This sample time window shall not exceed 10 minutes.
            
            {
              &quot;StartTime&quot;: &quot;2018-04-06T08:06:46.4471059-04:00&quot;,
              &quot;EndTime&quot;: &quot;2018-04-06T08:16:46.4471059-04:00&quot;,
              &quot;TotalComponentsInserted&quot;: 875,
              &quot;TotalComponentsNotInserted&quot;: 45
            }
 * original type: CFX.ResourcePerformance.THTInsertion.ComponentsInserted
 */
public class ComponentsInserted extends CFXMessage {

  private Date startTime;
  private Date endTime;
  private int totalComponentsInserted;
  private int totalComponentsNotInserted;

  /**
   * The start of the sample period
   * @param startTime the value
   */
  @JsonSetter("StartTime")
  public void setStartTime(Date startTime) {
    this.startTime = startTime;
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
  public void setEndTime(Date endTime) {
    this.endTime = endTime;
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
   * The total number of components that were successfully inserted during the sample period
   * @param totalComponentsInserted the value
   */
  @JsonSetter("TotalComponentsInserted")
  public void setTotalComponentsInserted(int totalComponentsInserted) {
    this.totalComponentsInserted = totalComponentsInserted;
  }

  /**
   * The total number of components that were successfully inserted during the sample period
   * @return TotalComponentsInserted
   */
  @JsonGetter("TotalComponentsInserted")
  public int getTotalComponentsInserted() {
    return totalComponentsInserted;
  }

  /**
   * The total number of components that were not successfully inserted during the sample period
   * @param totalComponentsNotInserted the value
   */
  @JsonSetter("TotalComponentsNotInserted")
  public void setTotalComponentsNotInserted(int totalComponentsNotInserted) {
    this.totalComponentsNotInserted = totalComponentsNotInserted;
  }

  /**
   * The total number of components that were not successfully inserted during the sample period
   * @return TotalComponentsNotInserted
   */
  @JsonGetter("TotalComponentsNotInserted")
  public int getTotalComponentsNotInserted() {
    return totalComponentsNotInserted;
  }
}
