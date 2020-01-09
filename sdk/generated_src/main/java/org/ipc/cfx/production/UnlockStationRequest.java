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
import org.ipc.cfx.structures.Operator;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Request that a process endpoint resume production, following a previous lock. The response indicates that the lock has been removed.
            
            {
              &quot;Lane&quot;: null,
              &quot;Stage&quot;: null,
              &quot;Requestor&quot;: {
                &quot;OperatorIdentifier&quot;: &quot;71926954-6b23-4f83-a5b4-ed7ef8cc226d&quot;,
                &quot;ActorType&quot;: &quot;Human&quot;,
                &quot;LastName&quot;: &quot;Smith&quot;,
                &quot;FirstName&quot;: &quot;Bill&quot;,
                &quot;LoginName&quot;: &quot;bill.smith@domain1.com&quot;
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
   * @param lane the value
   */
  @JsonSetter("Lane")
  public UnlockStationRequest setLane(Integer lane) {
    this.lane = lane;
    return this;
  }

  /**
   * An optional production lane.  When specified, only that production lane shall be unlocked.
   * @return Lane
   */
  @JsonGetter("Lane")
  public Integer getLane() {
    return lane;
  }

  /**
   * An optional stage designating the particular production stage to be unlocked
   * @param stage the value
   */
  @JsonSetter("Stage")
  public UnlockStationRequest setStage(Stage stage) {
    this.stage = stage;
    return this;
  }

  /**
   * An optional stage designating the particular production stage to be unlocked
   * @return Stage
   */
  @JsonGetter("Stage")
  public Stage getStage() {
    return stage;
  }

  /**
   * Information about the operator who is requesting that the stage be unlocked. (optional)
   * @param requestor the value
   */
  @JsonSetter("Requestor")
  public UnlockStationRequest setRequestor(Operator requestor) {
    this.requestor = requestor;
    return this;
  }

  /**
   * Information about the operator who is requesting that the stage be unlocked. (optional)
   * @return Requestor
   */
  @JsonGetter("Requestor")
  public Operator getRequestor() {
    return requestor;
  }
}
