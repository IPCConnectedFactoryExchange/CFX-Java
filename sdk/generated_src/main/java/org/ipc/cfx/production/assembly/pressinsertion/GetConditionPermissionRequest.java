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
package org.ipc.cfx.production.assembly.pressinsertion;

import java.util.UUID;
import org.ipc.cfx.structures.pressinsertion.ConditionStep;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This message is used to request a process endpoint for permission to proceed
            with the recipe based on the results of a condition sequence action
            
            {
              &quot;TransactionId&quot;: &quot;7e712504-4d65-499f-9dcb-1974e20bae59&quot;,
              &quot;ConditionStep&quot;: {}
              &quot;Data&quot;: {}
            }
 * original type: CFX.Production.Assembly.PressInsertion.GetConditionPermissionRequest
 */
public class GetConditionPermissionRequest extends CFXMessage {

  private UUID transactionID;
  private ConditionStep conditionStep;
  private String data;

  /**
   * Related Transaction ID specified previously by WorkStarted Message
   * @param transactionID the value
   */
  @JsonSetter("TransactionID")
  public GetConditionPermissionRequest setTransactionID(UUID transactionID) {
    this.transactionID = transactionID;
    return this;
  }

  /**
   * Related Transaction ID specified previously by WorkStarted Message
   * @return TransactionID
   */
  @JsonGetter("TransactionID")
  public UUID getTransactionID() {
    return transactionID;
  }

  /**
   * Describes a individual step of a Condition sequence that must be validated
   * @param conditionStep the value
   */
  @JsonSetter("ConditionStep")
  public GetConditionPermissionRequest setConditionStep(ConditionStep conditionStep) {
    this.conditionStep = conditionStep;
    return this;
  }

  /**
   * Describes a individual step of a Condition sequence that must be validated
   * @return ConditionStep
   */
  @JsonGetter("ConditionStep")
  public ConditionStep getConditionStep() {
    return conditionStep;
  }

  /**
   * The data to validate
   * @param data the value
   */
  @JsonSetter("Data")
  public GetConditionPermissionRequest setData(String data) {
    this.data = data;
    return this;
  }

  /**
   * The data to validate
   *
   * @return never null
   */
  @JsonGetter("Data")
  public String getData() {
    return data == null ? "" : data;
  }
}
