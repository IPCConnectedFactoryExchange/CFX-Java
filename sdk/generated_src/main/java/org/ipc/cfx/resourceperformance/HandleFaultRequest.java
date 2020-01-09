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
package org.ipc.cfx.resourceperformance;

import java.util.UUID;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This request allows an external source to modify the behaviour for this dedicated fault in such a way that the
            equoipment itself is not indicating the operator to handle this fault.
            Basically the fault should be handled remotly and no  operator should be guided by the equipment itself to handle
            this fault locally on the equipment. 
             message that it sends back to the requester.
            
            {
              &quot;FaultOccurrenceId&quot;: &quot;5f643ff3-8928-4079-af7f-926bcafb13f8&quot;,
              &quot;HandleRemote&quot;: true
            }
 * original type: CFX.ResourcePerformance.HandleFaultRequest
 */
public class HandleFaultRequest extends CFXMessage {

  private UUID faultOccurrenceId;
  private boolean handleRemote;

  /**
   * A 128-bit unique identifier which uniquely identifier this specific 
            occurrence of the fault
   * @param faultOccurrenceId the value
   */
  @JsonSetter("FaultOccurrenceId")
  public HandleFaultRequest setFaultOccurrenceId(UUID faultOccurrenceId) {
    this.faultOccurrenceId = faultOccurrenceId;
    return this;
  }

  /**
   * A 128-bit unique identifier which uniquely identifier this specific 
            occurrence of the fault
   * @return FaultOccurrenceId
   */
  @JsonGetter("FaultOccurrenceId")
  public UUID getFaultOccurrenceId() {
    return faultOccurrenceId;
  }

  /**
   * Gets or sets a value indicating whether the fault should be handled remotely or not.
            If handled remotely, the red light should be off on the equipment (at least for this fault)
   * @param handleRemote the value
   */
  @JsonSetter("HandleRemote")
  public HandleFaultRequest setHandleRemote(boolean handleRemote) {
    this.handleRemote = handleRemote;
    return this;
  }

  /**
   * Gets or sets a value indicating whether the fault should be handled remotely or not.
            If handled remotely, the red light should be off on the equipment (at least for this fault)
   * @return HandleRemote
   */
  @JsonGetter("HandleRemote")
  public boolean isHandleRemote() {
    return handleRemote;
  }
}
