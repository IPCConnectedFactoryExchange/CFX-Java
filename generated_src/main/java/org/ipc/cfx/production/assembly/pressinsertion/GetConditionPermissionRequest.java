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
              "TransactionId": "7e712504-4d65-499f-9dcb-1974e20bae59",
              "ConditionStep": {}
              "Data": {}
            }
 * original type: CFX.Production.Assembly.PressInsertion.GetConditionPermissionRequest
 */
public class GetConditionPermissionRequest extends CFXMessage {

  private UUID transactionID;
  private ConditionStep conditionStep;
  private String data;

  /**
   * Related Transaction ID specified previously by WorkStarted Message
   */
  @JsonSetter("TransactionID")
  public void setTransactionID(UUID transactionID) {
    this.transactionID = transactionID;
  }

  /**
   * Related Transaction ID specified previously by WorkStarted Message
   */
  @JsonGetter("TransactionID")
  public UUID getTransactionID() {
    return transactionID;
  }

  /**
   * Describes a individual step of a Condition sequence that must be validated
   */
  @JsonSetter("ConditionStep")
  public void setConditionStep(ConditionStep conditionStep) {
    this.conditionStep = conditionStep;
  }

  /**
   * Describes a individual step of a Condition sequence that must be validated
   */
  @JsonGetter("ConditionStep")
  public ConditionStep getConditionStep() {
    return conditionStep;
  }

  /**
   * The data to validate
   */
  @JsonSetter("Data")
  public void setData(String data) {
    this.data = data;
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
