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
package org.ipc.cfx.structures.reflowprofiling;

import java.util.Date;
import org.ipc.cfx.structures.TestResult;
import org.ipc.cfx.structures.solderreflow.ReflowZoneData;
import org.ipc.cfx.structures.ProcessData;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Provides production unit reflow statistics
 * original type: CFX.Structures.ReflowProfiling.ReflowProfilingProcessData
 */
public class ReflowProfilingProcessData extends ProcessData {

  private Date timeDateUnitIn;
  private Date timeDateUnitOut;
  private String productName;
  private String barcode;
  private String recipeName;
  private String processWindowName;
  private String lotID;
  private String ovenName;
  private int lane;
  private double conveyorSpeedSetpoint;
  private double measuredConveyorSpeed;
  private TestResult result;
  private double productionUnitPWI;
  private ReflowZoneData[] zoneData;

  /**
   * Time and date Production Unit entered oven in ISO 8061 Datetime format.
   */
  @JsonSetter("TimeDateUnitIn")
  public void setTimeDateUnitIn(Date timeDateUnitIn) {
    this.timeDateUnitIn = timeDateUnitIn;
  }

  /**
   * Time and date Production Unit entered oven in ISO 8061 Datetime format.
   */
  @JsonGetter("TimeDateUnitIn")
  public Date getTimeDateUnitIn() {
    return timeDateUnitIn;
  }

  /**
   * Time and date Production Unit exited oven in short date pattern.
   */
  @JsonSetter("TimeDateUnitOut")
  public void setTimeDateUnitOut(Date timeDateUnitOut) {
    this.timeDateUnitOut = timeDateUnitOut;
  }

  /**
   * Time and date Production Unit exited oven in short date pattern.
   */
  @JsonGetter("TimeDateUnitOut")
  public Date getTimeDateUnitOut() {
    return timeDateUnitOut;
  }

  /**
   * Name of product
   */
  @JsonSetter("ProductName")
  public void setProductName(String productName) {
    this.productName = productName;
  }

  /**
   * Name of product
   *
   * @return never null
   */
  @JsonGetter("ProductName")
  public String getProductName() {
    return productName == null ? "" : productName;
  }

  /**
   * Barcode of Production Unit
   */
  @JsonSetter("Barcode")
  public void setBarcode(String barcode) {
    this.barcode = barcode;
  }

  /**
   * Barcode of Production Unit
   *
   * @return never null
   */
  @JsonGetter("Barcode")
  public String getBarcode() {
    return barcode == null ? "" : barcode;
  }

  /**
   * Name of recipe
   */
  @JsonSetter("RecipeName")
  public void setRecipeName(String recipeName) {
    this.recipeName = recipeName;
  }

  /**
   * Name of recipe
   *
   * @return never null
   */
  @JsonGetter("RecipeName")
  public String getRecipeName() {
    return recipeName == null ? "" : recipeName;
  }

  /**
   * Name of process window
   */
  @JsonSetter("ProcessWindowName")
  public void setProcessWindowName(String processWindowName) {
    this.processWindowName = processWindowName;
  }

  /**
   * Name of process window
   *
   * @return never null
   */
  @JsonGetter("ProcessWindowName")
  public String getProcessWindowName() {
    return processWindowName == null ? "" : processWindowName;
  }

  /**
   * Lot identification value
   */
  @JsonSetter("LotID")
  public void setLotID(String lotID) {
    this.lotID = lotID;
  }

  /**
   * Lot identification value
   *
   * @return never null
   */
  @JsonGetter("LotID")
  public String getLotID() {
    return lotID == null ? "" : lotID;
  }

  /**
   * Name of oven
   */
  @JsonSetter("OvenName")
  public void setOvenName(String ovenName) {
    this.ovenName = ovenName;
  }

  /**
   * Name of oven
   *
   * @return never null
   */
  @JsonGetter("OvenName")
  public String getOvenName() {
    return ovenName == null ? "" : ovenName;
  }

  /**
   * Lane within oven. 1 is “front” and 2 is “back”
   */
  @JsonSetter("Lane")
  public void setLane(int lane) {
    this.lane = lane;
  }

  /**
   * Lane within oven. 1 is “front” and 2 is “back”
   */
  @JsonGetter("Lane")
  public int getLane() {
    return lane;
  }

  /**
   * The converyor speed setpoint (in cm / minute)
   */
  @JsonSetter("ConveyorSpeedSetpoint")
  public void setConveyorSpeedSetpoint(double conveyorSpeedSetpoint) {
    this.conveyorSpeedSetpoint = conveyorSpeedSetpoint;
  }

  /**
   * The converyor speed setpoint (in cm / minute)
   */
  @JsonGetter("ConveyorSpeedSetpoint")
  public double getConveyorSpeedSetpoint() {
    return conveyorSpeedSetpoint;
  }

  /**
   * The actual conveyor speed (in cm / minute)
   */
  @JsonSetter("MeasuredConveyorSpeed")
  public void setMeasuredConveyorSpeed(double measuredConveyorSpeed) {
    this.measuredConveyorSpeed = measuredConveyorSpeed;
  }

  /**
   * The actual conveyor speed (in cm / minute)
   */
  @JsonGetter("MeasuredConveyorSpeed")
  public double getMeasuredConveyorSpeed() {
    return measuredConveyorSpeed;
  }

  /**
   * "PASS" or "FAIL". FAIL if absolute value of ProductionUnitPWI exceeds 100.0
   */
  @JsonSetter("Result")
  public void setResult(TestResult result) {
    this.result = result;
  }

  /**
   * "PASS" or "FAIL". FAIL if absolute value of ProductionUnitPWI exceeds 100.0
   */
  @JsonGetter("Result")
  public TestResult getResult() {
    return result;
  }

  /**
   * The Process Window Index of the production unit
   */
  @JsonSetter("ProductionUnitPWI")
  public void setProductionUnitPWI(double productionUnitPWI) {
    this.productionUnitPWI = productionUnitPWI;
  }

  /**
   * The Process Window Index of the production unit
   */
  @JsonGetter("ProductionUnitPWI")
  public double getProductionUnitPWI() {
    return productionUnitPWI;
  }

  /**
   * Process data (temperatures, etc.) for each zone of the reflow oven at the 
            time when this transaction tool place.
   */
  @JsonSetter("ZoneData")
  public void setZoneData(ReflowZoneData[] zoneData) {
    this.zoneData = zoneData;
  }

  /**
   * Process data (temperatures, etc.) for each zone of the reflow oven at the 
            time when this transaction tool place.
   */
  @JsonGetter("ZoneData")
  public ReflowZoneData[] getZoneData() {
    return zoneData;
  }
}
