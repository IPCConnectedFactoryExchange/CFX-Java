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

import org.ipc.cfx.structures.ScheduledWorkOrderIdentifier;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent when a previously scheduled Work Order (or Work Order sub-batch) has been unscheduled
            at a particular work area at a particular time.
            
            {
              "ScheduledWorkOrderIdentifiers": [
                {
                  "WorkOrderIdentifier": {
                    "WorkOrderId": "WO1122334455",
                    "Batch": null
                  },
                  "WorkArea": "SMT Line 1"
                }
              ]
            }
 * original type: CFX.InformationSystem.ProductionScheduling.WorkOrdersUnscheduled
 */
public class WorkOrdersUnscheduled extends CFXMessage {

  private ScheduledWorkOrderIdentifier[] scheduledWorkOrderIdentifiers;

  /**
   * A list of Work Orders that have been scheduled.
   */
  @JsonSetter("ScheduledWorkOrderIdentifiers")
  public void setScheduledWorkOrderIdentifiers(ScheduledWorkOrderIdentifier[] scheduledWorkOrderIdentifiers) {
    this.scheduledWorkOrderIdentifiers = scheduledWorkOrderIdentifiers;
  }

  /**
   * A list of Work Orders that have been scheduled.
   */
  @JsonGetter("ScheduledWorkOrderIdentifiers")
  public ScheduledWorkOrderIdentifier[] getScheduledWorkOrderIdentifiers() {
    return scheduledWorkOrderIdentifiers;
  }
}
