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

import java.util.UUID;
import org.ipc.cfx.structures.Stage;
import org.ipc.cfx.structures.WorkStagePauseReason;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent when activity pauses for some reason at a stage of the process endpoint
            
            {
              "TransactionID": "2c24590d-39c5-4039-96a5-91900cecedfa",
              "Stage": {
                "StageSequence": 1,
                "StageName": "STAGE1",
                "StageType": "Work"
              }
            }
 * original type: CFX.Production.WorkStagePaused
 */
public class WorkStagePaused extends CFXMessage {

  private UUID transactionID;
  private Stage stage;
  private WorkStagePauseReason pauseReason;

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
   * The stage name or number
   */
  @JsonSetter("Stage")
  public void setStage(Stage stage) {
    this.stage = stage;
  }

  /**
   * The stage name or number
   */
  @JsonGetter("Stage")
  public Stage getStage() {
    return stage;
  }

  /**
   * The stage name or number
   */
  @JsonSetter("PauseReason")
  public void setPauseReason(WorkStagePauseReason pauseReason) {
    this.pauseReason = pauseReason;
  }

  /**
   * The stage name or number
   */
  @JsonGetter("PauseReason")
  public WorkStagePauseReason getPauseReason() {
    return pauseReason;
  }
}