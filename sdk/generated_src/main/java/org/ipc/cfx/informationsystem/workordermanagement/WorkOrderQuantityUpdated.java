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

import org.ipc.cfx.structures.WorkOrderIdentifier;
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
              &quot;NewQuantity&quot;: 250.0,
              &quot;PreviousQuantity&quot;: 220.0
            }
 * original type: CFX.InformationSystem.WorkOrderManagement.WorkOrderQuantityUpdated
 */
public class WorkOrderQuantityUpdated extends CFXMessage {

  private WorkOrderIdentifier workOrderIdentifier;
  private double newQuantity;
  private Double previousQuantity;

  /**
   * The Identifier of the relevant Work Order or Work Order sub-batch
   * @param workOrderIdentifier the value
   */
  @JsonSetter("WorkOrderIdentifier")
  public void setWorkOrderIdentifier(WorkOrderIdentifier workOrderIdentifier) {
    this.workOrderIdentifier = workOrderIdentifier;
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
   * The new quantity of the Work Order (or Work Order sub-batch)
   * @param newQuantity the value
   */
  @JsonSetter("NewQuantity")
  public void setNewQuantity(double newQuantity) {
    this.newQuantity = newQuantity;
  }

  /**
   * The new quantity of the Work Order (or Work Order sub-batch)
   * @return NewQuantity
   */
  @JsonGetter("NewQuantity")
  public double getNewQuantity() {
    return newQuantity;
  }

  /**
   * The previous quantity of the Work Order (or Work Order sub-batch), if known.
   * @param previousQuantity the value
   */
  @JsonSetter("PreviousQuantity")
  public void setPreviousQuantity(Double previousQuantity) {
    this.previousQuantity = previousQuantity;
  }

  /**
   * The previous quantity of the Work Order (or Work Order sub-batch), if known.
   * @return PreviousQuantity
   */
  @JsonGetter("PreviousQuantity")
  public Double getPreviousQuantity() {
    return previousQuantity;
  }
}
