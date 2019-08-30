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
 * created: 30.08.2019 09:11:09 by frankp
 */
package org.ipc.cfx.production;

import java.util.UUID;
import org.ipc.cfx.structures.WorkResult;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent by a process endpoint when all work has been completed at a process endpoint.
            
            {
              &quot;TransactionID&quot;: &quot;2c24590d-39c5-4039-96a5-91900cecedfa&quot;,
              &quot;Result&quot;: &quot;Completed&quot;
            }
 * original type: CFX.Production.WorkCompleted
 */
public class WorkCompleted extends CFXMessage {

  private UUID transactionID;
  private WorkResult result;

  /**
   * Related Transaction ID specified previously by WorkStarted Message
   * @param transactionID the value
   */
  @JsonSetter("TransactionID")
  public void setTransactionID(UUID transactionID) {
    this.transactionID = transactionID;
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
   * 
   * @param result the value
   */
  @JsonSetter("Result")
  public void setResult(WorkResult result) {
    this.result = result;
  }

  /**
   * 
   * @return Result
   */
  @JsonGetter("Result")
  public WorkResult getResult() {
    return result;
  }
}