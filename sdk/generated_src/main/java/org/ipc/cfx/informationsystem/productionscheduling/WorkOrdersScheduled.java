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
package org.ipc.cfx.informationsystem.productionscheduling;

import org.ipc.cfx.structures.ScheduledWorkOrder;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent when a Work Order (or Work Order sub-batch) has been scheduled to be executed
            at a particular work area at a particular time.
            
            {
              &quot;ScheduledWorkOrders&quot;: [
                {
                  &quot;WorkOrderIdentifier&quot;: {
                    &quot;WorkOrderId&quot;: &quot;WO1122334455&quot;,
                    &quot;Batch&quot;: null
                  },
                  &quot;Scheduler&quot;: {
                    &quot;OperatorIdentifier&quot;: &quot;BADGE4486&quot;,
                    &quot;ActorType&quot;: &quot;Human&quot;,
                    &quot;LastName&quot;: &quot;Doe&quot;,
                    &quot;FirstName&quot;: &quot;John&quot;,
                    &quot;LoginName&quot;: &quot;john.doe@domain1.com&quot;
                  },
                  &quot;WorkArea&quot;: &quot;SMT Line 1&quot;,
                  &quot;StartTime&quot;: &quot;2018-08-02T11:00:00&quot;,
                  &quot;EndTime&quot;: &quot;2018-08-02T15:00:00&quot;,
                  &quot;ReservedResources&quot;: [
                    &quot;L1PRINTER1&quot;,
                    &quot;L1PLACER1&quot;,
                    &quot;L1PLACER2&quot;,
                    &quot;L1OVEN1&quot;
                  ],
                  &quot;ReservedTools&quot;: [
                    {
                      &quot;UniqueIdentifier&quot;: &quot;UID23890430&quot;,
                      &quot;Name&quot;: &quot;TorqueWrench_123&quot;
                    }
                  ],
                  &quot;ReservedOperators&quot;: [
                    {
                      &quot;OperatorIdentifier&quot;: &quot;BADGE489435&quot;,
                      &quot;ActorType&quot;: &quot;Human&quot;,
                      &quot;LastName&quot;: &quot;Smith&quot;,
                      &quot;FirstName&quot;: &quot;Joseph&quot;,
                      &quot;LoginName&quot;: &quot;joseph.smith@abcdrepairs.com&quot;
                    }
                  ],
                  &quot;ReservedMaterials&quot;: [
                    {
                      &quot;UniqueIdentifier&quot;: &quot;UID23849854385&quot;,
                      &quot;InternalPartNumber&quot;: &quot;PN4452&quot;,
                      &quot;Quantity&quot;: 0.0
                    },
                    {
                      &quot;UniqueIdentifier&quot;: &quot;UID23849854386&quot;,
                      &quot;InternalPartNumber&quot;: &quot;PN4452&quot;,
                      &quot;Quantity&quot;: 0.0
                    },
                    {
                      &quot;UniqueIdentifier&quot;: &quot;UID23849854446&quot;,
                      &quot;InternalPartNumber&quot;: &quot;PN3358&quot;,
                      &quot;Quantity&quot;: 0.0
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
   * @param scheduledWorkOrders the value
   */
  @JsonSetter("ScheduledWorkOrders")
  public void setScheduledWorkOrders(ScheduledWorkOrder[] scheduledWorkOrders) {
    this.scheduledWorkOrders = scheduledWorkOrders;
  }

  /**
   * A list of Work Orders that have been scheduled.
   * @return ScheduledWorkOrders
   */
  @JsonGetter("ScheduledWorkOrders")
  public ScheduledWorkOrder[] getScheduledWorkOrders() {
    return scheduledWorkOrders;
  }
}
