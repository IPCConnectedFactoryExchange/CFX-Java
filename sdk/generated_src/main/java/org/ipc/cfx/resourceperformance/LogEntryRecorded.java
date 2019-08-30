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
package org.ipc.cfx.resourceperformance;

import org.ipc.cfx.structures.LogImportance;
import org.ipc.cfx.structures.Stage;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * An informational message sent by a process endpoint regarding the something that has occurred at the station. 
            Information about the criticality of the information should also be given (information, warning, error etc.).
            
            {
              &quot;InformationId&quot;: &quot;INF21321321&quot;,
              &quot;Message&quot;: &quot;Beam 1 Zeroed and Homed&quot;,
              &quot;Importance&quot;: &quot;Information&quot;,
              &quot;Lane&quot;: 1,
              &quot;Stage&quot;: {
                &quot;StageSequence&quot;: 1,
                &quot;StageName&quot;: &quot;STAGE1&quot;,
                &quot;StageType&quot;: &quot;Work&quot;
              }
            }
 * original type: CFX.ResourcePerformance.LogEntryRecorded
 */
public class LogEntryRecorded extends CFXMessage {

  private String informationId;
  private String message;
  private LogImportance importance;
  private Integer lane;
  private Stage stage;

  /**
   * An endpoint-specific string that defines the nature of the log entry
   * @param informationId the value
   */
  @JsonSetter("InformationId")
  public void setInformationId(String informationId) {
    this.informationId = informationId;
  }

  /**
   * An endpoint-specific string that defines the nature of the log entry
   *
   * @return never null
   */
  @JsonGetter("InformationId")
  public String getInformationId() {
    return informationId == null ? "" : informationId;
  }

  /**
   * A human-friendly description of the log entry
   * @param message the value
   */
  @JsonSetter("Message")
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * A human-friendly description of the log entry
   *
   * @return never null
   */
  @JsonGetter("Message")
  public String getMessage() {
    return message == null ? "" : message;
  }

  /**
   * The relative importance of the log entry
   * @param importance the value
   */
  @JsonSetter("Importance")
  public void setImportance(LogImportance importance) {
    this.importance = importance;
  }

  /**
   * The relative importance of the log entry
   * @return Importance
   */
  @JsonGetter("Importance")
  public LogImportance getImportance() {
    return importance;
  }

  /**
   * The production lane related to the log entry (where applicable)
   * @param lane the value
   */
  @JsonSetter("Lane")
  public void setLane(Integer lane) {
    this.lane = lane;
  }

  /**
   * The production lane related to the log entry (where applicable)
   * @return Lane
   */
  @JsonGetter("Lane")
  public Integer getLane() {
    return lane;
  }

  /**
   * 
   * @param stage the value
   */
  @JsonSetter("Stage")
  public void setStage(Stage stage) {
    this.stage = stage;
  }

  /**
   * 
   * @return Stage
   */
  @JsonGetter("Stage")
  public Stage getStage() {
    return stage;
  }
}
