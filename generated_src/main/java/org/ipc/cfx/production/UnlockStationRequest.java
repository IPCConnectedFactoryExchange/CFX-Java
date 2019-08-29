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
import org.ipc.cfx.structures.Operator;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Request that a process endpoint resume production, following a previous lock. The response indicates that the lock has been removed.
            
            {
              "Lane": null,
              "Stage": null,
              "Requestor": {
                "OperatorIdentifier": "71926954-6b23-4f83-a5b4-ed7ef8cc226d",
                "ActorType": "Human",
                "LastName": "Smith",
                "FirstName": "Bill",
                "LoginName": "bill.smith@domain1.com"
              }
            }
 * original type: CFX.Production.UnlockStationRequest
 */
public class UnlockStationRequest extends CFXMessage {

  private Integer lane;
  private Stage stage;
  private Operator requestor;

  /**
   * An optional production lane.  When specified, only that production lane shall be unlocked.
   */
  @JsonSetter("Lane")
  public void setLane(Integer lane) {
    this.lane = lane;
  }

  /**
   * An optional production lane.  When specified, only that production lane shall be unlocked.
   */
  @JsonGetter("Lane")
  public Integer getLane() {
    return lane;
  }

  /**
   * An optional stage designating the particular production stage to be unlocked
   */
  @JsonSetter("Stage")
  public void setStage(Stage stage) {
    this.stage = stage;
  }

  /**
   * An optional stage designating the particular production stage to be unlocked
   */
  @JsonGetter("Stage")
  public Stage getStage() {
    return stage;
  }

  /**
   * Information about the operator who is requesting that the stage be unlocked. (optional)
   */
  @JsonSetter("Requestor")
  public void setRequestor(Operator requestor) {
    this.requestor = requestor;
  }

  /**
   * Information about the operator who is requesting that the stage be unlocked. (optional)
   */
  @JsonGetter("Requestor")
  public Operator getRequestor() {
    return requestor;
  }
}
