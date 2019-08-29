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
package org.ipc.cfx.informationsystem.productionscheduling;

import org.ipc.cfx.structures.ScheduledWorkOrder;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent when a Work Order (or Work Order sub-batch) has been scheduled to be executed
            at a particular work area at a particular time.
            
            {
              "ScheduledWorkOrders": [
                {
                  "WorkOrderIdentifier": {
                    "WorkOrderId": "WO1122334455",
                    "Batch": null
                  },
                  "Scheduler": {
                    "OperatorIdentifier": "BADGE4486",
                    "ActorType": "Human",
                    "LastName": "Doe",
                    "FirstName": "John",
                    "LoginName": "john.doe@domain1.com"
                  },
                  "WorkArea": "SMT Line 1",
                  "StartTime": "2018-08-02T11:00:00",
                  "EndTime": "2018-08-02T15:00:00",
                  "ReservedResources": [
                    "L1PRINTER1",
                    "L1PLACER1",
                    "L1PLACER2",
                    "L1OVEN1"
                  ],
                  "ReservedTools": [
                    {
                      "UniqueIdentifier": "UID23890430",
                      "Name": "TorqueWrench_123"
                    }
                  ],
                  "ReservedOperators": [
                    {
                      "OperatorIdentifier": "BADGE489435",
                      "ActorType": "Human",
                      "LastName": "Smith",
                      "FirstName": "Joseph",
                      "LoginName": "joseph.smith@abcdrepairs.com"
                    }
                  ],
                  "ReservedMaterials": [
                    {
                      "UniqueIdentifier": "UID23849854385",
                      "InternalPartNumber": "PN4452",
                      "Quantity": 0.0
                    },
                    {
                      "UniqueIdentifier": "UID23849854386",
                      "InternalPartNumber": "PN4452",
                      "Quantity": 0.0
                    },
                    {
                      "UniqueIdentifier": "UID23849854446",
                      "InternalPartNumber": "PN3358",
                      "Quantity": 0.0
                    }
                  ]
                }
              ]
            }
 * original type: CFX.InformationSystem.ProductionScheduling.WorkOrdersScheduled
 */
public class WorkOrdersScheduled extends CFXMessage {

  private ScheduledWorkOrder[] scheduledWorkOrders;

  /**
   * A list of Work Orders that have been scheduled.
   */
  @JsonSetter("ScheduledWorkOrders")
  public void setScheduledWorkOrders(ScheduledWorkOrder[] scheduledWorkOrders) {
    this.scheduledWorkOrders = scheduledWorkOrders;
  }

  /**
   * A list of Work Orders that have been scheduled.
   */
  @JsonGetter("ScheduledWorkOrders")
  public ScheduledWorkOrder[] getScheduledWorkOrders() {
    return scheduledWorkOrders;
  }
}
