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
package org.ipc.cfx.structures;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Data structure which identifies a Work Order that has already been scheduled for production.
 * original type: CFX.Structures.ScheduledWorkOrderIdentifier
 */
public class ScheduledWorkOrderIdentifier {

  private WorkOrderIdentifier workOrderIdentifier;
  private String workArea;

  /**
   * Identifies the Work Order (or Work Order sub-batch) that is scheduled.
   * @param workOrderIdentifier the value
   */
  @JsonSetter("WorkOrderIdentifier")
  public ScheduledWorkOrderIdentifier setWorkOrderIdentifier(WorkOrderIdentifier workOrderIdentifier) {
    this.workOrderIdentifier = workOrderIdentifier;
    return this;
  }

  /**
   * Identifies the Work Order (or Work Order sub-batch) that is scheduled.
   * @return WorkOrderIdentifier
   */
  @JsonGetter("WorkOrderIdentifier")
  public WorkOrderIdentifier getWorkOrderIdentifier() {
    return workOrderIdentifier;
  }

  /**
   * Identifies the physical location where the Work Order will be executed.  A single Work Order
            may be scheduled to run in different physical locations at different times.
   * @param workArea the value
   */
  @JsonSetter("WorkArea")
  public ScheduledWorkOrderIdentifier setWorkArea(String workArea) {
    this.workArea = workArea;
    return this;
  }

  /**
   * Identifies the physical location where the Work Order will be executed.  A single Work Order
            may be scheduled to run in different physical locations at different times.
   *
   * @return never null
   */
  @JsonGetter("WorkArea")
  public String getWorkArea() {
    return workArea == null ? "" : workArea;
  }
}
