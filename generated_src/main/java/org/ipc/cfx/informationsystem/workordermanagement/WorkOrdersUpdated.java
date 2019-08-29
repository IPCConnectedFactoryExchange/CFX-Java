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
package org.ipc.cfx.informationsystem.workordermanagement;

import org.ipc.cfx.structures.WorkOrder;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * A Work Order (or Work Order sub-batch) has been modified / updated within an information systsem (such as ERP or MES).
            
            {
              "UpdatedOrders": [
                {
                  "WorkOrderIdentifier": {
                    "WorkOrderId": "WO1122334455",
                    "Batch": null
                  },
                  "Description": "Production Order for PCB Assembly",
                  "Status": "AwaitingApproval",
                  "Router": "PCB Assembly Process",
                  "RouterRevision": "A",
                  "LotNumber": "LOT4896",
                  "Customer": null,
                  "Department": null,
                  "CreatedDate": "2018-08-01T13:46:15.8331267-04:00",
                  "StartDate": "2018-09-09T00:00:00",
                  "DateRequired": "2018-09-15T17:00:00",
                  "PartNumber": "1122-5555",
                  "PartRevision": "C",
                  "Quantity": 220.0,
                  "UnitOfMeasure": null,
                  "DependsOn": null
                }
              ]
            }
 * original type: CFX.InformationSystem.WorkOrderManagement.WorkOrdersUpdated
 */
public class WorkOrdersUpdated extends CFXMessage {

  private WorkOrder[] updatedOrders;

  /**
   * The new details of the updated Work Order (or Work Order sub-batch)
   */
  @JsonSetter("UpdatedOrders")
  public void setUpdatedOrders(WorkOrder[] updatedOrders) {
    this.updatedOrders = updatedOrders;
  }

  /**
   * The new details of the updated Work Order (or Work Order sub-batch)
   */
  @JsonGetter("UpdatedOrders")
  public WorkOrder[] getUpdatedOrders() {
    return updatedOrders;
  }
}
