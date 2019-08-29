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
package org.ipc.cfx.resourceperformance;

import java.util.UUID;
import org.ipc.cfx.structures.Operator;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent when a fault has been acknowledged by the operator, but not yet corrected (cleared).
            A subsequent FaultCleared message will be sent once the operator addresses the issue.
            
            {
              "Operator": {
                "OperatorIdentifier": "BADGE4486",
                "ActorType": "Human",
                "LastName": "Doe",
                "FirstName": "John",
                "LoginName": "john.doe@domain1.com"
              },
              "FaultOccurrenceId": "5af7e56c-cfbf-4f1f-aa4c-79d94a7442bc"
            }
 * original type: CFX.ResourcePerformance.FaultAcknowledged
 */
public class FaultAcknowledged extends CFXMessage {

  private UUID faultOccurrenceId;
  private Operator operator;

  /**
   * A unique identifier of the instance of the related fault.  Corresponds with the
            FaultOccurrenceId property of the corresponding FaultOccurred message
   */
  @JsonSetter("FaultOccurrenceId")
  public void setFaultOccurrenceId(UUID faultOccurrenceId) {
    this.faultOccurrenceId = faultOccurrenceId;
  }

  /**
   * A unique identifier of the instance of the related fault.  Corresponds with the
            FaultOccurrenceId property of the corresponding FaultOccurred message
   */
  @JsonGetter("FaultOccurrenceId")
  public UUID getFaultOccurrenceId() {
    return faultOccurrenceId;
  }

  /**
   * The operator or entity who has acknowledged the fault (if known, otherwise null) (optional)
   */
  @JsonSetter("Operator")
  public void setOperator(Operator operator) {
    this.operator = operator;
  }

  /**
   * The operator or entity who has acknowledged the fault (if known, otherwise null) (optional)
   */
  @JsonGetter("Operator")
  public Operator getOperator() {
    return operator;
  }
}