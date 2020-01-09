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
package org.ipc.cfx.informationsystem.workordermanagement;

import org.ipc.cfx.structures.WorkOrderIdentifier;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent when a Work Order (or sub-batch of a Work Order) has been deleted within an information system (such as ERP or MES).
            
            {
              &quot;WorkOrderIdentifiers&quot;: [
                {
                  &quot;WorkOrderId&quot;: &quot;WO1122334455&quot;,
                  &quot;Batch&quot;: null
                },
                {
                  &quot;WorkOrderId&quot;: &quot;WO9988776666&quot;,
                  &quot;Batch&quot;: &quot;Batch1&quot;
                }
              ]
            }
 * original type: CFX.InformationSystem.WorkOrderManagement.WorkOrdersDeleted
 */
public class WorkOrdersDeleted extends CFXMessage {

  private WorkOrderIdentifier[] workOrderIdentifiers;

  /**
   * The identifier of the Work Order that has been deleted.
   * @param workOrderIdentifiers the value
   */
  @JsonSetter("WorkOrderIdentifiers")
  public WorkOrdersDeleted setWorkOrderIdentifiers(WorkOrderIdentifier[] workOrderIdentifiers) {
    this.workOrderIdentifiers = workOrderIdentifiers;
    return this;
  }

  /**
   * The identifier of the Work Order that has been deleted.
   * @return WorkOrderIdentifiers
   */
  @JsonGetter("WorkOrderIdentifiers")
  public WorkOrderIdentifier[] getWorkOrderIdentifiers() {
    return workOrderIdentifiers;
  }
}
