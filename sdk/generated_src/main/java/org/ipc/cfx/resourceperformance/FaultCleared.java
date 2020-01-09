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
import org.ipc.cfx.structures.Operator;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent by a process endpoint when a fault is cleared as described in a FaultOccurred message  
            
            {
              &quot;FaultOccurrenceId&quot;: &quot;22ac3c8a-9e6d-42f8-85b2-f51bf2224ecc&quot;,
              &quot;Operator&quot;: {
                &quot;OperatorIdentifier&quot;: &quot;BADGE4486&quot;,
                &quot;ActorType&quot;: &quot;Human&quot;,
                &quot;LastName&quot;: &quot;Doe&quot;,
                &quot;FirstName&quot;: &quot;John&quot;,
                &quot;LoginName&quot;: &quot;john.doe@domain1.com&quot;
              }
            }
 * original type: CFX.ResourcePerformance.FaultCleared
 */
public class FaultCleared extends CFXMessage {

  private UUID faultOccurrenceId;
  private Operator operator;

  /**
   * A unique identifier of the instance of the related fault.  Corresponds with the
            FaultOccurrenceId property of the corresponding FaultOccurred message
   * @param faultOccurrenceId the value
   */
  @JsonSetter("FaultOccurrenceId")
  public FaultCleared setFaultOccurrenceId(UUID faultOccurrenceId) {
    this.faultOccurrenceId = faultOccurrenceId;
    return this;
  }

  /**
   * A unique identifier of the instance of the related fault.  Corresponds with the
            FaultOccurrenceId property of the corresponding FaultOccurred message
   * @return FaultOccurrenceId
   */
  @JsonGetter("FaultOccurrenceId")
  public UUID getFaultOccurrenceId() {
    return faultOccurrenceId;
  }

  /**
   * The operator or entity who has cleared the fault (if known, otherwise null) (optional)
   * @param operator the value
   */
  @JsonSetter("Operator")
  public FaultCleared setOperator(Operator operator) {
    this.operator = operator;
    return this;
  }

  /**
   * The operator or entity who has cleared the fault (if known, otherwise null) (optional)
   * @return Operator
   */
  @JsonGetter("Operator")
  public Operator getOperator() {
    return operator;
  }
}
