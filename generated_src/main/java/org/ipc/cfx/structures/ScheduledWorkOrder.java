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
 * created: 20.08.2019 15:52:36 by frankp
 */
package org.ipc.cfx.structures;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * A data structure representing a Work Order that has been scheduled to be executed
            at a particular work area within the factory at a particular time.  Includes all of the physical 
            resources, tools, personnel, and materials that are required to execute the Work Order.
 * original type: CFX.Structures.ScheduledWorkOrder
 */
public class ScheduledWorkOrder {

  private WorkOrderIdentifier workOrderIdentifier;
  private Operator scheduler;
  private String workArea;
  private Date startTime;
  private Date endTime;
  private String[] reservedResources;
  private Tool[] reservedTools;
  private Operator[] reservedOperators;
  private MaterialPackage[] reservedMaterials;

  /**
   * Identifies the Work Order (or Work Order sub-batch) that is scheduled.
   */
  @JsonSetter("WorkOrderIdentifier")
  public void setWorkOrderIdentifier(WorkOrderIdentifier workOrderIdentifier) {
    this.workOrderIdentifier = workOrderIdentifier;
  }

  /**
   * Identifies the Work Order (or Work Order sub-batch) that is scheduled.
   */
  @JsonGetter("WorkOrderIdentifier")
  public WorkOrderIdentifier getWorkOrderIdentifier() {
    return workOrderIdentifier;
  }

  /**
   * Identifies the person who was responsible for scheduling the Work Order (optional).
   */
  @JsonSetter("Scheduler")
  public void setScheduler(Operator scheduler) {
    this.scheduler = scheduler;
  }

  /**
   * Identifies the person who was responsible for scheduling the Work Order (optional).
   */
  @JsonGetter("Scheduler")
  public Operator getScheduler() {
    return scheduler;
  }

  /**
   * Identifies the physical location where the Work Order will be executed.  A single Work Order
            may be scheduled to run in different physical locations at different times.
   */
  @JsonSetter("WorkArea")
  public void setWorkArea(String workArea) {
    this.workArea = workArea;
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

  /**
   * The time when production will begin for this Work Order in the designated work area.
   */
  @JsonSetter("StartTime")
  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  /**
   * The time when production will begin for this Work Order in the designated work area.
   */
  @JsonGetter("StartTime")
  public Date getStartTime() {
    return startTime;
  }

  /**
   * THe time when production is expected to be completed for this Work Order.
   */
  @JsonSetter("EndTime")
  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  /**
   * THe time when production is expected to be completed for this Work Order.
   */
  @JsonGetter("EndTime")
  public Date getEndTime() {
    return endTime;
  }

  /**
   * An optional list of the physical resources / assets that are required to 
            execute the Work Order (Lines, Machines, etc.).
   */
  @JsonSetter("ReservedResources")
  public void setReservedResources(String[] reservedResources) {
    this.reservedResources = reservedResources;
  }

  /**
   * An optional list of the physical resources / assets that are required to 
            execute the Work Order (Lines, Machines, etc.).
   */
  @JsonGetter("ReservedResources")
  public String[] getReservedResources() {
    return reservedResources;
  }

  /**
   * An optional list of the tools that are required to execute the Work Order.
   */
  @JsonSetter("ReservedTools")
  public void setReservedTools(Tool[] reservedTools) {
    this.reservedTools = reservedTools;
  }

  /**
   * An optional list of the tools that are required to execute the Work Order.
   */
  @JsonGetter("ReservedTools")
  public Tool[] getReservedTools() {
    return reservedTools;
  }

  /**
   * An optional list of the operators that have been allocated to execute this scheduled
            Work Order.
   */
  @JsonSetter("ReservedOperators")
  public void setReservedOperators(Operator[] reservedOperators) {
    this.reservedOperators = reservedOperators;
  }

  /**
   * An optional list of the operators that have been allocated to execute this scheduled
            Work Order.
   */
  @JsonGetter("ReservedOperators")
  public Operator[] getReservedOperators() {
    return reservedOperators;
  }

  /**
   * An optional list of the specific materials that are necessary to execute this scheduled Work Order.
   */
  @JsonSetter("ReservedMaterials")
  public void setReservedMaterials(MaterialPackage[] reservedMaterials) {
    this.reservedMaterials = reservedMaterials;
  }

  /**
   * An optional list of the specific materials that are necessary to execute this scheduled Work Order.
   */
  @JsonGetter("ReservedMaterials")
  public MaterialPackage[] getReservedMaterials() {
    return reservedMaterials;
  }
}
