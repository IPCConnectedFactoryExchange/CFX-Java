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
package org.ipc.cfx.production.hermes;

import org.ipc.cfx.structures.RequestResult;
import org.ipc.cfx.structures.WorkOrderIdentifier;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Reponse to a request by a Hermes enabled endpoint to acquire information related to a particular work order.
 * original type: CFX.Production.Hermes.GetWorkOrderDataResponse
 */
public class GetWorkOrderDataResponse extends CFXMessage {

  private RequestResult result;
  private WorkOrderIdentifier workOrderIdentifier;
  private String productTypeId;
  private double length;
  private double width;
  private double thickness;
  private double topClearanceHeight;
  private double bottomClearanceHeight;
  private double weight;

  /**
   * Result of the request
   * @param result the value
   */
  @JsonSetter("Result")
  public GetWorkOrderDataResponse setResult(RequestResult result) {
    this.result = result;
    return this;
  }

  /**
   * Result of the request
   * @return Result
   */
  @JsonGetter("Result")
  public RequestResult getResult() {
    return result;
  }

  /**
   * The identifier of the work order whose data was retrieved.
   * @param workOrderIdentifier the value
   */
  @JsonSetter("WorkOrderIdentifier")
  public GetWorkOrderDataResponse setWorkOrderIdentifier(WorkOrderIdentifier workOrderIdentifier) {
    this.workOrderIdentifier = workOrderIdentifier;
    return this;
  }

  /**
   * The identifier of the work order whose data was retrieved.
   * @return WorkOrderIdentifier
   */
  @JsonGetter("WorkOrderIdentifier")
  public WorkOrderIdentifier getWorkOrderIdentifier() {
    return workOrderIdentifier;
  }

  /**
   * The Hermes product type Id of the assembly that is associated with this work order.
   * @param productTypeId the value
   */
  @JsonSetter("ProductTypeId")
  public GetWorkOrderDataResponse setProductTypeId(String productTypeId) {
    this.productTypeId = productTypeId;
    return this;
  }

  /**
   * The Hermes product type Id of the assembly that is associated with this work order.
   *
   * @return never null
   */
  @JsonGetter("ProductTypeId")
  public String getProductTypeId() {
    return productTypeId == null ? "" : productTypeId;
  }

  /**
   * The length of the PCB in millimeters (mm)
   * @param length the value
   */
  @JsonSetter("Length")
  public GetWorkOrderDataResponse setLength(double length) {
    this.length = length;
    return this;
  }

  /**
   * The length of the PCB in millimeters (mm)
   * @return Length
   */
  @JsonGetter("Length")
  public double getLength() {
    return length;
  }

  /**
   * The width of the PCB in millimeters (mm)
   * @param width the value
   */
  @JsonSetter("Width")
  public GetWorkOrderDataResponse setWidth(double width) {
    this.width = width;
    return this;
  }

  /**
   * The width of the PCB in millimeters (mm)
   * @return Width
   */
  @JsonGetter("Width")
  public double getWidth() {
    return width;
  }

  /**
   * The thickness of the PCB in millimeters (mm)
   * @param thickness the value
   */
  @JsonSetter("Thickness")
  public GetWorkOrderDataResponse setThickness(double thickness) {
    this.thickness = thickness;
    return this;
  }

  /**
   * The thickness of the PCB in millimeters (mm)
   * @return Thickness
   */
  @JsonGetter("Thickness")
  public double getThickness() {
    return thickness;
  }

  /**
   * The clearance height for the top side of the PCB millimeters (mm)
   * @param topClearanceHeight the value
   */
  @JsonSetter("TopClearanceHeight")
  public GetWorkOrderDataResponse setTopClearanceHeight(double topClearanceHeight) {
    this.topClearanceHeight = topClearanceHeight;
    return this;
  }

  /**
   * The clearance height for the top side of the PCB millimeters (mm)
   * @return TopClearanceHeight
   */
  @JsonGetter("TopClearanceHeight")
  public double getTopClearanceHeight() {
    return topClearanceHeight;
  }

  /**
   * The clearance height for the bottom side of the PCB millimeters (mm)
   * @param bottomClearanceHeight the value
   */
  @JsonSetter("BottomClearanceHeight")
  public GetWorkOrderDataResponse setBottomClearanceHeight(double bottomClearanceHeight) {
    this.bottomClearanceHeight = bottomClearanceHeight;
    return this;
  }

  /**
   * The clearance height for the bottom side of the PCB millimeters (mm)
   * @return BottomClearanceHeight
   */
  @JsonGetter("BottomClearanceHeight")
  public double getBottomClearanceHeight() {
    return bottomClearanceHeight;
  }

  /**
   * The weight of the PCB in grams (g)
   * @param weight the value
   */
  @JsonSetter("Weight")
  public GetWorkOrderDataResponse setWeight(double weight) {
    this.weight = weight;
    return this;
  }

  /**
   * The weight of the PCB in grams (g)
   * @return Weight
   */
  @JsonGetter("Weight")
  public double getWeight() {
    return weight;
  }
}
