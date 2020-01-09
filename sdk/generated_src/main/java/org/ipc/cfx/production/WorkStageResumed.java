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

import java.util.UUID;
import org.ipc.cfx.structures.Stage;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent when activity recommences at a stage within a process endpoint, following a WorkStagePaused message
            
            {
              &quot;TransactionID&quot;: &quot;2c24590d-39c5-4039-96a5-91900cecedfa&quot;,
              &quot;Stage&quot;: {
                &quot;StageSequence&quot;: 1,
                &quot;StageName&quot;: &quot;STAGE1&quot;,
                &quot;StageType&quot;: &quot;Work&quot;
              }
            }
 * original type: CFX.Production.WorkStageResumed
 */
public class WorkStageResumed extends CFXMessage {

  private UUID transactionID;
  private Stage stage;

  /**
   * Related Transaction ID specified previously by WorkStarted Message
   * @param transactionID the value
   */
  @JsonSetter("TransactionID")
  public WorkStageResumed setTransactionID(UUID transactionID) {
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
   * The stage name or number
   * @param stage the value
   */
  @JsonSetter("Stage")
  public WorkStageResumed setStage(Stage stage) {
    this.stage = stage;
    return this;
  }

  /**
   * The stage name or number
   * @return Stage
   */
  @JsonGetter("Stage")
  public Stage getStage() {
    return stage;
  }
}
