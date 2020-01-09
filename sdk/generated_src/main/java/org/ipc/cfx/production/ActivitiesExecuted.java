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
import org.ipc.cfx.structures.Activity;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Indicates that one or more activities have been performed in the course of processing one or more production units.
            The activities may or may not be value added.  Activities are dynamic structures, and may vary depending upon the 
            nature and purpose of the endpoint.
            
            {
              &quot;TransactionID&quot;: &quot;2c24590d-39c5-4039-96a5-91900cecedfa&quot;,
              &quot;Stage&quot;: {
                &quot;StageSequence&quot;: 1,
                &quot;StageName&quot;: &quot;STAGE1&quot;,
                &quot;StageType&quot;: &quot;Work&quot;
              },
              &quot;Activities&quot;: [
                {
                  &quot;$type&quot;: &quot;CFX.Structures.UnitLoadActivity, CFX&quot;,
                  &quot;LoadTime&quot;: &quot;00:00:05.3000000&quot;,
                  &quot;TimeStamp&quot;: &quot;2018-10-25T08:45:51.5300797-04:00&quot;,
                  &quot;ActivityInstanceId&quot;: &quot;dec7ca54-efc7-4519-a250-0bc7dbeae1d6&quot;,
                  &quot;ActivityState&quot;: &quot;Completed&quot;,
                  &quot;ActivityName&quot;: &quot;UNIT LOAD&quot;,
                  &quot;Comments&quot;: null,
                  &quot;ValueAddType&quot;: &quot;NonValueAdd&quot;
                },
                {
                  &quot;$type&quot;: &quot;CFX.Structures.UnitAlignmentActivity, CFX&quot;,
                  &quot;DX&quot;: 0.0,
                  &quot;DY&quot;: 0.0,
                  &quot;DZ&quot;: 0.0,
                  &quot;DXY&quot;: 0.0,
                  &quot;DZX&quot;: 0.0,
                  &quot;DZY&quot;: 0.0,
                  &quot;TimeStamp&quot;: &quot;2018-10-25T08:45:51.5300797-04:00&quot;,
                  &quot;ActivityInstanceId&quot;: &quot;a6a3307b-d2e4-4c50-a8cc-9949b7866a2b&quot;,
                  &quot;ActivityState&quot;: &quot;Started&quot;,
                  &quot;ActivityName&quot;: &quot;UNIT ALIGNMENT&quot;,
                  &quot;Comments&quot;: null,
                  &quot;ValueAddType&quot;: &quot;NonValueAdd&quot;
                },
                {
                  &quot;$type&quot;: &quot;CFX.Structures.UnitAlignmentActivity, CFX&quot;,
                  &quot;DX&quot;: 0.125,
                  &quot;DY&quot;: 0.104,
                  &quot;DZ&quot;: 0.0,
                  &quot;DXY&quot;: 0.987,
                  &quot;DZX&quot;: 0.0,
                  &quot;DZY&quot;: 0.0,
                  &quot;TimeStamp&quot;: &quot;2018-10-25T08:45:56.5300797-04:00&quot;,
                  &quot;ActivityInstanceId&quot;: &quot;a6a3307b-d2e4-4c50-a8cc-9949b7866a2b&quot;,
                  &quot;ActivityState&quot;: &quot;Completed&quot;,
                  &quot;ActivityName&quot;: &quot;UNIT ALIGNMENT&quot;,
                  &quot;Comments&quot;: null,
                  &quot;ValueAddType&quot;: &quot;NonValueAdd&quot;
                },
                {
                  &quot;$type&quot;: &quot;CFX.Structures.SMTPlacement.SMTNozzleChangeActivity, CFX&quot;,
                  &quot;OldNozzles&quot;: [],
                  &quot;NewNozzles&quot;: [
                    {
                      &quot;HeadId&quot;: &quot;HEAD1&quot;,
                      &quot;HeadNozzleNumber&quot;: 1,
                      &quot;NozzleType&quot;: &quot;409A&quot;,
                      &quot;UniqueIdentifier&quot;: &quot;UID234213421&quot;,
                      &quot;Name&quot;: &quot;Nozzle45&quot;
                    },
                    {
                      &quot;HeadId&quot;: &quot;HEAD1&quot;,
                      &quot;HeadNozzleNumber&quot;: 2,
                      &quot;NozzleType&quot;: &quot;302B&quot;,
                      &quot;UniqueIdentifier&quot;: &quot;UID234213421&quot;,
                      &quot;Name&quot;: &quot;Nozzle32&quot;
                    }
                  ],
                  &quot;TimeStamp&quot;: &quot;2018-10-25T08:46:16.5300797-04:00&quot;,
                  &quot;ActivityInstanceId&quot;: &quot;fa97ae52-2374-4530-8ec5-107fc5bb1ff1&quot;,
                  &quot;ActivityState&quot;: &quot;Completed&quot;,
                  &quot;ActivityName&quot;: &quot;NOZZLE CHANGE&quot;,
                  &quot;Comments&quot;: null,
                  &quot;ValueAddType&quot;: &quot;NonValueAdd&quot;
                },
                {
                  &quot;$type&quot;: &quot;CFX.Structures.UnitUnloadActivity, CFX&quot;,
                  &quot;UnloadTime&quot;: &quot;00:00:03.2000000&quot;,
                  &quot;TimeStamp&quot;: &quot;2018-10-25T08:46:46.5300797-04:00&quot;,
                  &quot;ActivityInstanceId&quot;: &quot;b5d68d84-440f-4667-b5b7-aa481fcff002&quot;,
                  &quot;ActivityState&quot;: &quot;Completed&quot;,
                  &quot;ActivityName&quot;: &quot;UNIT UNLOAD&quot;,
                  &quot;Comments&quot;: null,
                  &quot;ValueAddType&quot;: &quot;NonValueAdd&quot;
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
   * @param transactionID the value
   */
  @JsonSetter("TransactionID")
  public ActivitiesExecuted setTransactionID(UUID transactionID) {
    this.transactionID = transactionID;
    return this;
  }

  /**
   * Related Transaction ID previously established by a WorkStarted Message
   * @return TransactionID
   */
  @JsonGetter("TransactionID")
  public UUID getTransactionID() {
    return transactionID;
  }

  /**
   * The related stage name or number
   * @param stage the value
   */
  @JsonSetter("Stage")
  public ActivitiesExecuted setStage(Stage stage) {
    this.stage = stage;
    return this;
  }

  /**
   * The related stage name or number
   * @return Stage
   */
  @JsonGetter("Stage")
  public Stage getStage() {
    return stage;
  }

  /**
   * A list of activities that were performed.  The items in this list are dynamic structures, and
            may vary depending on the type of endpoint.
   * @param activities the value
   */
  @JsonSetter("Activities")
  public ActivitiesExecuted setActivities(Activity[] activities) {
    this.activities = activities;
    return this;
  }

  /**
   * A list of activities that were performed.  The items in this list are dynamic structures, and
            may vary depending on the type of endpoint.
   * @return Activities
   */
  @JsonGetter("Activities")
  public Activity[] getActivities() {
    return activities;
  }
}
