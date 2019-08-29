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
import org.ipc.cfx.structures.StatusResult;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent by a press insertion machine when a condition has been completed
            
            {
              "TransactionID": "2c24590d-39c5-4039-96a5-91900cecedfa",
              "ResultOfCondition":
            }
 * original type: CFX.Production.Assembly.PressInsertion.ConditionCompleted
 */
public class ConditionCompleted extends CFXMessage {

  private UUID transactionID;
  private StatusResult resultOfCondition;

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
   * 
   */
  @JsonSetter("ResultOfCondition")
  public void setResultOfCondition(StatusResult resultOfCondition) {
    this.resultOfCondition = resultOfCondition;
  }

  /**
   * 
   */
  @JsonGetter("ResultOfCondition")
  public StatusResult getResultOfCondition() {
    return resultOfCondition;
  }
}
