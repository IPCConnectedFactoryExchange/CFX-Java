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
package org.ipc.cfx.production;

import org.ipc.cfx.structures.Stage;
import org.ipc.cfx.structures.LockReason;
import org.ipc.cfx.structures.Operator;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Request that the endpoint cease active operation (locked) as soon as practically possible
            at a process endpoint.  A specific production lane or stage may be optionally specified.
            Includes a reason, and applies to all operations. The response indicates that the process
            has stopped.
            
            {
              &quot;Lane&quot;: 1,
              &quot;Stage&quot;: {
                &quot;StageSequence&quot;: 1,
                &quot;StageName&quot;: &quot;STAGE1&quot;,
                &quot;StageType&quot;: &quot;Work&quot;
              },
              &quot;Reason&quot;: &quot;QualityIssue&quot;,
              &quot;Requestor&quot;: {
                &quot;OperatorIdentifier&quot;: &quot;e4d92c77-6a19-4d1e-8c2a-b2b217f59a44&quot;,
                &quot;ActorType&quot;: &quot;Human&quot;,
                &quot;LastName&quot;: &quot;Smith&quot;,
                &quot;FirstName&quot;: &quot;Bill&quot;,
                &quot;LoginName&quot;: &quot;bill.smith@domain1.com&quot;
              }
            }
 * original type: CFX.Production.LockStationRequest
 */
public class LockStationRequest extends CFXMessage {

  private Integer lane;
  private Stage stage;
  private LockReason reason;
  private Operator requestor;

  /**
   * An optional production lane.  When specified, only that production lane shall be locked.
   * @param lane the value
   */
  @JsonSetter("Lane")
  public LockStationRequest setLane(Integer lane) {
    this.lane = lane;
    return this;
  }

  /**
   * An optional production lane.  When specified, only that production lane shall be locked.
   * @return Lane
   */
  @JsonGetter("Lane")
  public Integer getLane() {
    return lane;
  }

  /**
   * An optional stage.  When specified, only that stage shall be locked.
   * @param stage the value
   */
  @JsonSetter("Stage")
  public LockStationRequest setStage(Stage stage) {
    this.stage = stage;
    return this;
  }

  /**
   * An optional stage.  When specified, only that stage shall be locked.
   * @return Stage
   */
  @JsonGetter("Stage")
  public Stage getStage() {
    return stage;
  }

  /**
   * Reason for the request to lock the station.
   * @param reason the value
   */
  @JsonSetter("Reason")
  public LockStationRequest setReason(LockReason reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Reason for the request to lock the station.
   * @return Reason
   */
  @JsonGetter("Reason")
  public LockReason getReason() {
    return reason;
  }

  /**
   * Identifies the originator of the request. (optional)
   * @param requestor the value
   */
  @JsonSetter("Requestor")
  public LockStationRequest setRequestor(Operator requestor) {
    this.requestor = requestor;
    return this;
  }

  /**
   * Identifies the originator of the request. (optional)
   * @return Requestor
   */
  @JsonGetter("Requestor")
  public Operator getRequestor() {
    return requestor;
  }
}
