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
import org.ipc.cfx.structures.WorkOrderStatus;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent when the status of a Work Order (or Work Order sub-batch) has been updated.
            
            {
              &quot;WorkOrderIdentifier&quot;: {
                &quot;WorkOrderId&quot;: &quot;WO1122334455&quot;,
                &quot;Batch&quot;: null
              },
              &quot;NewStatus&quot;: &quot;Scheduled&quot;,
              &quot;PreviousStatus&quot;: &quot;ApprovedAndPending&quot;
            }
 * original type: CFX.InformationSystem.WorkOrderManagement.WorkOrderStatusUpdated
 */
public class WorkOrderStatusUpdated extends CFXMessage {

  private WorkOrderIdentifier workOrderIdentifier;
  private WorkOrderStatus newStatus;
  private WorkOrderStatus previousStatus;

  /**
   * The Identifier of the relevant Work Order or Work Order sub-batch
   * @param workOrderIdentifier the value
   */
  @JsonSetter("WorkOrderIdentifier")
  public WorkOrderStatusUpdated setWorkOrderIdentifier(WorkOrderIdentifier workOrderIdentifier) {
    this.workOrderIdentifier = workOrderIdentifier;
    return this;
  }

  /**
   * The Identifier of the relevant Work Order or Work Order sub-batch
   * @return WorkOrderIdentifier
   */
  @JsonGetter("WorkOrderIdentifier")
  public WorkOrderIdentifier getWorkOrderIdentifier() {
    return workOrderIdentifier;
  }

  /**
   * The new current status of the Work Order (or Work Order sub-batch)
   * @param newStatus the value
   */
  @JsonSetter("NewStatus")
  public WorkOrderStatusUpdated setNewStatus(WorkOrderStatus newStatus) {
    this.newStatus = newStatus;
    return this;
  }

  /**
   * The new current status of the Work Order (or Work Order sub-batch)
   * @return NewStatus
   */
  @JsonGetter("NewStatus")
  public WorkOrderStatus getNewStatus() {
    return newStatus;
  }

  /**
   * The previous status of the Work Order (or Work Order sub-batch)
   * @param previousStatus the value
   */
  @JsonSetter("PreviousStatus")
  public WorkOrderStatusUpdated setPreviousStatus(WorkOrderStatus previousStatus) {
    this.previousStatus = previousStatus;
    return this;
  }

  /**
   * The previous status of the Work Order (or Work Order sub-batch)
   * @return PreviousStatus
   */
  @JsonGetter("PreviousStatus")
  public WorkOrderStatus getPreviousStatus() {
    return previousStatus;
  }
}
