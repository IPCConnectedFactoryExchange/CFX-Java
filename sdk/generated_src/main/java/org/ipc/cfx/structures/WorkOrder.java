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
 * A structure that describes an order to produce a specifified quantity of units of a particular part number /
            part revision within the factory environment.
 * original type: CFX.Structures.WorkOrder
 */
public class WorkOrder {

  private WorkOrderIdentifier workOrderIdentifier;
  private String description;
  private WorkOrderStatus status;
  private String router;
  private String routerRevision;
  private String lotNumber;
  private String customer;
  private String department;
  private Date createdDate;
  private Date startDate;
  private Date dateRequired;
  private String partNumber;
  private String partRevision;
  private double quantity;
  private String unitOfMeasure;
  private WorkOrderIdentifier[] dependsOn;

  /**
   * The identifer of the Work Order or Work Order sub-batch
   * @param workOrderIdentifier the value
   */
  @JsonSetter("WorkOrderIdentifier")
  public void setWorkOrderIdentifier(WorkOrderIdentifier workOrderIdentifier) {
    this.workOrderIdentifier = workOrderIdentifier;
  }

  /**
   * The identifer of the Work Order or Work Order sub-batch
   * @return WorkOrderIdentifier
   */
  @JsonGetter("WorkOrderIdentifier")
  public WorkOrderIdentifier getWorkOrderIdentifier() {
    return workOrderIdentifier;
  }

  /**
   * A human friendly description for this Work Order.
   * @param description the value
   */
  @JsonSetter("Description")
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * A human friendly description for this Work Order.
   *
   * @return never null
   */
  @JsonGetter("Description")
  public String getDescription() {
    return description == null ? "" : description;
  }

  /**
   * The current status of the Work Order.
   * @param status the value
   */
  @JsonSetter("Status")
  public void setStatus(WorkOrderStatus status) {
    this.status = status;
  }

  /**
   * The current status of the Work Order.
   * @return Status
   */
  @JsonGetter("Status")
  public WorkOrderStatus getStatus() {
    return status;
  }

  /**
   * The name of the router or process that will be followed to produce the units for this Work Order.
   * @param router the value
   */
  @JsonSetter("Router")
  public void setRouter(String router) {
    this.router = router;
  }

  /**
   * The name of the router or process that will be followed to produce the units for this Work Order.
   *
   * @return never null
   */
  @JsonGetter("Router")
  public String getRouter() {
    return router == null ? "" : router;
  }

  /**
   * The revision of the router or process that will be followed to produce units for this Work Order.
   * @param routerRevision the value
   */
  @JsonSetter("RouterRevision")
  public void setRouterRevision(String routerRevision) {
    this.routerRevision = routerRevision;
  }

  /**
   * The revision of the router or process that will be followed to produce units for this Work Order.
   *
   * @return never null
   */
  @JsonGetter("RouterRevision")
  public String getRouterRevision() {
    return routerRevision == null ? "" : routerRevision;
  }

  /**
   * Ane lot number that is to be associated with units produced under this Work Order.
   * @param lotNumber the value
   */
  @JsonSetter("LotNumber")
  public void setLotNumber(String lotNumber) {
    this.lotNumber = lotNumber;
  }

  /**
   * Ane lot number that is to be associated with units produced under this Work Order.
   *
   * @return never null
   */
  @JsonGetter("LotNumber")
  public String getLotNumber() {
    return lotNumber == null ? "" : lotNumber;
  }

  /**
   * An optional customer name, if this Work Order is associated with particular customer.
   * @param customer the value
   */
  @JsonSetter("Customer")
  public void setCustomer(String customer) {
    this.customer = customer;
  }

  /**
   * An optional customer name, if this Work Order is associated with particular customer.
   *
   * @return never null
   */
  @JsonGetter("Customer")
  public String getCustomer() {
    return customer == null ? "" : customer;
  }

  /**
   * An optional department name, if this Work Order is to be executed by a particular department.
   * @param department the value
   */
  @JsonSetter("Department")
  public void setDepartment(String department) {
    this.department = department;
  }

  /**
   * An optional department name, if this Work Order is to be executed by a particular department.
   *
   * @return never null
   */
  @JsonGetter("Department")
  public String getDepartment() {
    return department == null ? "" : department;
  }

  /**
   * The date on which the Work Order was created.
   * @param createdDate the value
   */
  @JsonSetter("CreatedDate")
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  /**
   * The date on which the Work Order was created.
   * @return CreatedDate
   */
  @JsonGetter("CreatedDate")
  public Date getCreatedDate() {
    return createdDate;
  }

  /**
   * The date/time on which this Work Order should begin execution.
   * @param startDate the value
   */
  @JsonSetter("StartDate")
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  /**
   * The date/time on which this Work Order should begin execution.
   * @return StartDate
   */
  @JsonGetter("StartDate")
  public Date getStartDate() {
    return startDate;
  }

  /**
   * The date/time by which this Work Order should be completed.
   * @param dateRequired the value
   */
  @JsonSetter("DateRequired")
  public void setDateRequired(Date dateRequired) {
    this.dateRequired = dateRequired;
  }

  /**
   * The date/time by which this Work Order should be completed.
   * @return DateRequired
   */
  @JsonGetter("DateRequired")
  public Date getDateRequired() {
    return dateRequired;
  }

  /**
   * The part number (internal) of the assembly to be produced by this Work Order.
   * @param partNumber the value
   */
  @JsonSetter("PartNumber")
  public void setPartNumber(String partNumber) {
    this.partNumber = partNumber;
  }

  /**
   * The part number (internal) of the assembly to be produced by this Work Order.
   *
   * @return never null
   */
  @JsonGetter("PartNumber")
  public String getPartNumber() {
    return partNumber == null ? "" : partNumber;
  }

  /**
   * The revision of the assembly to be produced by this Work Order.
   * @param partRevision the value
   */
  @JsonSetter("PartRevision")
  public void setPartRevision(String partRevision) {
    this.partRevision = partRevision;
  }

  /**
   * The revision of the assembly to be produced by this Work Order.
   *
   * @return never null
   */
  @JsonGetter("PartRevision")
  public String getPartRevision() {
    return partRevision == null ? "" : partRevision;
  }

  /**
   * The quantity of units to be produced by this Work Order.
   * @param quantity the value
   */
  @JsonSetter("Quantity")
  public void setQuantity(double quantity) {
    this.quantity = quantity;
  }

  /**
   * The quantity of units to be produced by this Work Order.
   * @return Quantity
   */
  @JsonGetter("Quantity")
  public double getQuantity() {
    return quantity;
  }

  /**
   * If the Work Order is intended to produce something other than &quot;units&quot;, the unit of measure of the 
            quantity associated with this Word Order.  For example, a Work Order might be placed to produce 200m
            of red wire.  In this case, the Quantity property would be &quot;200&quot; and the UnitOfMeasure
            would be &quot;meter&quot;.  If UnitOfMeasure is left empty (blank), it is assumed that the quantity specifies
            &quot;pieces&quot; and/or &quot;units&quot; (200 units of assembly 1234-5678, for example).
   * @param unitOfMeasure the value
   */
  @JsonSetter("UnitOfMeasure")
  public void setUnitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
  }

  /**
   * If the Work Order is intended to produce something other than &quot;units&quot;, the unit of measure of the 
            quantity associated with this Word Order.  For example, a Work Order might be placed to produce 200m
            of red wire.  In this case, the Quantity property would be &quot;200&quot; and the UnitOfMeasure
            would be &quot;meter&quot;.  If UnitOfMeasure is left empty (blank), it is assumed that the quantity specifies
            &quot;pieces&quot; and/or &quot;units&quot; (200 units of assembly 1234-5678, for example).
   *
   * @return never null
   */
  @JsonGetter("UnitOfMeasure")
  public String getUnitOfMeasure() {
    return unitOfMeasure == null ? "" : unitOfMeasure;
  }

  /**
   * A list of other Work Orders (or Work Order sub-batches) upon which this Work Order (or Work Order sub-batch) is dependent.
            Dependent Work Orders feed the supply of materials into upper level Work Orders.
   * @param dependsOn the value
   */
  @JsonSetter("DependsOn")
  public void setDependsOn(WorkOrderIdentifier[] dependsOn) {
    this.dependsOn = dependsOn;
  }

  /**
   * A list of other Work Orders (or Work Order sub-batches) upon which this Work Order (or Work Order sub-batch) is dependent.
            Dependent Work Orders feed the supply of materials into upper level Work Orders.
   * @return DependsOn
   */
  @JsonGetter("DependsOn")
  public WorkOrderIdentifier[] getDependsOn() {
    return dependsOn;
  }
}
