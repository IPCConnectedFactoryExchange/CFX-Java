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
 * created: 30.08.2019 09:11:09 by frankp
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
   * @param workOrderIdentifier the value
   */
  @JsonSetter("WorkOrderIdentifier")
  public void setWorkOrderIdentifier(WorkOrderIdentifier workOrderIdentifier) {
    this.workOrderIdentifier = workOrderIdentifier;
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
   * Identifies the person who was responsible for scheduling the Work Order (optional).
   * @param scheduler the value
   */
  @JsonSetter("Scheduler")
  public void setScheduler(Operator scheduler) {
    this.scheduler = scheduler;
  }

  /**
   * Identifies the person who was responsible for scheduling the Work Order (optional).
   * @return Scheduler
   */
  @JsonGetter("Scheduler")
  public Operator getScheduler() {
    return scheduler;
  }

  /**
   * Identifies the physical location where the Work Order will be executed.  A single Work Order
            may be scheduled to run in different physical locations at different times.
   * @param workArea the value
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
   * @param startTime the value
   */
  @JsonSetter("StartTime")
  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  /**
   * The time when production will begin for this Work Order in the designated work area.
   * @return StartTime
   */
  @JsonGetter("StartTime")
  public Date getStartTime() {
    return startTime;
  }

  /**
   * THe time when production is expected to be completed for this Work Order.
   * @param endTime the value
   */
  @JsonSetter("EndTime")
  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  /**
   * THe time when production is expected to be completed for this Work Order.
   * @return EndTime
   */
  @JsonGetter("EndTime")
  public Date getEndTime() {
    return endTime;
  }

  /**
   * An optional list of the physical resources / assets that are required to 
            execute the Work Order (Lines, Machines, etc.).
   * @param reservedResources the value
   */
  @JsonSetter("ReservedResources")
  public void setReservedResources(String[] reservedResources) {
    this.reservedResources = reservedResources;
  }

  /**
   * An optional list of the physical resources / assets that are required to 
            execute the Work Order (Lines, Machines, etc.).
   * @return ReservedResources
   */
  @JsonGetter("ReservedResources")
  public String[] getReservedResources() {
    return reservedResources;
  }

  /**
   * An optional list of the tools that are required to execute the Work Order.
   * @param reservedTools the value
   */
  @JsonSetter("ReservedTools")
  public void setReservedTools(Tool[] reservedTools) {
    this.reservedTools = reservedTools;
  }

  /**
   * An optional list of the tools that are required to execute the Work Order.
   * @return ReservedTools
   */
  @JsonGetter("ReservedTools")
  public Tool[] getReservedTools() {
    return reservedTools;
  }

  /**
   * An optional list of the operators that have been allocated to execute this scheduled
            Work Order.
   * @param reservedOperators the value
   */
  @JsonSetter("ReservedOperators")
  public void setReservedOperators(Operator[] reservedOperators) {
    this.reservedOperators = reservedOperators;
  }

  /**
   * An optional list of the operators that have been allocated to execute this scheduled
            Work Order.
   * @return ReservedOperators
   */
  @JsonGetter("ReservedOperators")
  public Operator[] getReservedOperators() {
    return reservedOperators;
  }

  /**
   * An optional list of the specific materials that are necessary to execute this scheduled Work Order.
   * @param reservedMaterials the value
   */
  @JsonSetter("ReservedMaterials")
  public void setReservedMaterials(MaterialPackage[] reservedMaterials) {
    this.reservedMaterials = reservedMaterials;
  }

  /**
   * An optional list of the specific materials that are necessary to execute this scheduled Work Order.
   * @return ReservedMaterials
   */
  @JsonGetter("ReservedMaterials")
  public MaterialPackage[] getReservedMaterials() {
    return reservedMaterials;
  }
}
