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
 * created: 30.08.2019 09:11:10 by frankp
 */
package org.ipc.cfx.informationsystem.workordermanagement;

import org.ipc.cfx.structures.WorkOrder;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent when a new production Work Order is created by an information system (such as ERP or MES).
            
            {
              &quot;NewOrders&quot;: [
                {
                  &quot;WorkOrderIdentifier&quot;: {
                    &quot;WorkOrderId&quot;: &quot;WO1122334455&quot;,
                    &quot;Batch&quot;: null
                  },
                  &quot;Description&quot;: &quot;Production Order for PCB Assembly&quot;,
                  &quot;Status&quot;: &quot;AwaitingApproval&quot;,
                  &quot;Router&quot;: &quot;PCB Assembly Process&quot;,
                  &quot;RouterRevision&quot;: &quot;A&quot;,
                  &quot;LotNumber&quot;: &quot;LOT4865&quot;,
                  &quot;Customer&quot;: null,
                  &quot;Department&quot;: null,
                  &quot;CreatedDate&quot;: &quot;2018-08-01T13:46:15.5391201-04:00&quot;,
                  &quot;StartDate&quot;: &quot;2018-09-09T00:00:00&quot;,
                  &quot;DateRequired&quot;: &quot;2018-09-15T17:00:00&quot;,
                  &quot;PartNumber&quot;: &quot;1122-3344&quot;,
                  &quot;PartRevision&quot;: &quot;B&quot;,
                  &quot;Quantity&quot;: 220.0,
                  &quot;UnitOfMeasure&quot;: null,
                  &quot;DependsOn&quot;: null
                }
              ]
            }
 * original type: CFX.InformationSystem.WorkOrderManagement.WorkOrdersCreated
 */
public class WorkOrdersCreated extends CFXMessage {

  private WorkOrder[] newOrders;

  /**
   * The new Work Order.
   * @param newOrders the value
   */
  @JsonSetter("NewOrders")
  public void setNewOrders(WorkOrder[] newOrders) {
    this.newOrders = newOrders;
  }

  /**
   * The new Work Order.
   * @return NewOrders
   */
  @JsonGetter("NewOrders")
  public WorkOrder[] getNewOrders() {
    return newOrders;
  }
}
