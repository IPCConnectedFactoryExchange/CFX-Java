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
import org.ipc.cfx.structures.Activity;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Indicates that one or more activities have been performed in the course of processing one or more production units.
            The activities may or may not be value added.  Activities are dynamic structures, and may vary depending upon the 
            nature and purpose of the endpoint.
            
            {
              "TransactionID": "2c24590d-39c5-4039-96a5-91900cecedfa",
              "Stage": {
                "StageSequence": 1,
                "StageName": "STAGE1",
                "StageType": "Work"
              },
              "Activities": [
                {
                  "$type": "CFX.Structures.UnitLoadActivity, CFX",
                  "LoadTime": "00:00:05.3000000",
                  "TimeStamp": "2018-10-25T08:45:51.5300797-04:00",
                  "ActivityInstanceId": "dec7ca54-efc7-4519-a250-0bc7dbeae1d6",
                  "ActivityState": "Completed",
                  "ActivityName": "UNIT LOAD",
                  "Comments": null,
                  "ValueAddType": "NonValueAdd"
                },
                {
                  "$type": "CFX.Structures.UnitAlignmentActivity, CFX",
                  "DX": 0.0,
                  "DY": 0.0,
                  "DZ": 0.0,
                  "DXY": 0.0,
                  "DZX": 0.0,
                  "DZY": 0.0,
                  "TimeStamp": "2018-10-25T08:45:51.5300797-04:00",
                  "ActivityInstanceId": "a6a3307b-d2e4-4c50-a8cc-9949b7866a2b",
                  "ActivityState": "Started",
                  "ActivityName": "UNIT ALIGNMENT",
                  "Comments": null,
                  "ValueAddType": "NonValueAdd"
                },
                {
                  "$type": "CFX.Structures.UnitAlignmentActivity, CFX",
                  "DX": 0.125,
                  "DY": 0.104,
                  "DZ": 0.0,
                  "DXY": 0.987,
                  "DZX": 0.0,
                  "DZY": 0.0,
                  "TimeStamp": "2018-10-25T08:45:56.5300797-04:00",
                  "ActivityInstanceId": "a6a3307b-d2e4-4c50-a8cc-9949b7866a2b",
                  "ActivityState": "Completed",
                  "ActivityName": "UNIT ALIGNMENT",
                  "Comments": null,
                  "ValueAddType": "NonValueAdd"
                },
                {
                  "$type": "CFX.Structures.SMTPlacement.SMTNozzleChangeActivity, CFX",
                  "OldNozzles": [],
                  "NewNozzles": [
                    {
                      "HeadId": "HEAD1",
                      "HeadNozzleNumber": 1,
                      "NozzleType": "409A",
                      "UniqueIdentifier": "UID234213421",
                      "Name": "Nozzle45"
                    },
                    {
                      "HeadId": "HEAD1",
                      "HeadNozzleNumber": 2,
                      "NozzleType": "302B",
                      "UniqueIdentifier": "UID234213421",
                      "Name": "Nozzle32"
                    }
                  ],
                  "TimeStamp": "2018-10-25T08:46:16.5300797-04:00",
                  "ActivityInstanceId": "fa97ae52-2374-4530-8ec5-107fc5bb1ff1",
                  "ActivityState": "Completed",
                  "ActivityName": "NOZZLE CHANGE",
                  "Comments": null,
                  "ValueAddType": "NonValueAdd"
                },
                {
                  "$type": "CFX.Structures.UnitUnloadActivity, CFX",
                  "UnloadTime": "00:00:03.2000000",
                  "TimeStamp": "2018-10-25T08:46:46.5300797-04:00",
                  "ActivityInstanceId": "b5d68d84-440f-4667-b5b7-aa481fcff002",
                  "ActivityState": "Completed",
                  "ActivityName": "UNIT UNLOAD",
                  "Comments": null,
                  "ValueAddType": "NonValueAdd"
                }
              ]
            }
 * original type: CFX.Production.ActivitiesExecuted
 */
public class ActivitiesExecuted extends CFXMessage {

  private UUID transactionID;
  private Stage stage;
  private Activity[] activities;

  /**
   * Related Transaction ID previously established by a WorkStarted Message
   */
  @JsonSetter("TransactionID")
  public void setTransactionID(UUID transactionID) {
    this.transactionID = transactionID;
  }

  /**
   * Related Transaction ID previously established by a WorkStarted Message
   */
  @JsonGetter("TransactionID")
  public UUID getTransactionID() {
    return transactionID;
  }

  /**
   * The related stage name or number
   */
  @JsonSetter("Stage")
  public void setStage(Stage stage) {
    this.stage = stage;
  }

  /**
   * The related stage name or number
   */
  @JsonGetter("Stage")
  public Stage getStage() {
    return stage;
  }

  /**
   * A list of activities that were performed.  The items in this list are dynamic structures, and
            may vary depending on the type of endpoint.
   */
  @JsonSetter("Activities")
  public void setActivities(Activity[] activities) {
    this.activities = activities;
  }

  /**
   * A list of activities that were performed.  The items in this list are dynamic structures, and
            may vary depending on the type of endpoint.
   */
  @JsonGetter("Activities")
  public Activity[] getActivities() {
    return activities;
  }
}
