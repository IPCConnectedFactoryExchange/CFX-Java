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
              "Lane": 1,
              "Stage": {
                "StageSequence": 1,
                "StageName": "STAGE1",
                "StageType": "Work"
              },
              "Reason": "QualityIssue",
              "Requestor": {
                "OperatorIdentifier": "e4d92c77-6a19-4d1e-8c2a-b2b217f59a44",
                "ActorType": "Human",
                "LastName": "Smith",
                "FirstName": "Bill",
                "LoginName": "bill.smith@domain1.com"
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
   */
  @JsonSetter("Lane")
  public void setLane(Integer lane) {
    this.lane = lane;
  }

  /**
   * An optional production lane.  When specified, only that production lane shall be locked.
   */
  @JsonGetter("Lane")
  public Integer getLane() {
    return lane;
  }

  /**
   * An optional stage.  When specified, only that stage shall be locked.
   */
  @JsonSetter("Stage")
  public void setStage(Stage stage) {
    this.stage = stage;
  }

  /**
   * An optional stage.  When specified, only that stage shall be locked.
   */
  @JsonGetter("Stage")
  public Stage getStage() {
    return stage;
  }

  /**
   * Reason for the request to lock the station.
   */
  @JsonSetter("Reason")
  public void setReason(LockReason reason) {
    this.reason = reason;
  }

  /**
   * Reason for the request to lock the station.
   */
  @JsonGetter("Reason")
  public LockReason getReason() {
    return reason;
  }

  /**
   * Identifies the originator of the request. (optional)
   */
  @JsonSetter("Requestor")
  public void setRequestor(Operator requestor) {
    this.requestor = requestor;
  }

  /**
   * Identifies the originator of the request. (optional)
   */
  @JsonGetter("Requestor")
  public Operator getRequestor() {
    return requestor;
  }
}
