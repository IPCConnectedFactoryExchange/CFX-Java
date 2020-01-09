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
   * @param timeDateUnitIn the value
   */
  @JsonSetter("TimeDateUnitIn")
  public ReflowProfilingProcessData setTimeDateUnitIn(Date timeDateUnitIn) {
    this.timeDateUnitIn = timeDateUnitIn;
    return this;
  }

  /**
   * Time and date Production Unit entered oven in ISO 8061 Datetime format.
   * @return TimeDateUnitIn
   */
  @JsonGetter("TimeDateUnitIn")
  public Date getTimeDateUnitIn() {
    return timeDateUnitIn;
  }

  /**
   * Time and date Production Unit exited oven in short date pattern.
   * @param timeDateUnitOut the value
   */
  @JsonSetter("TimeDateUnitOut")
  public ReflowProfilingProcessData setTimeDateUnitOut(Date timeDateUnitOut) {
    this.timeDateUnitOut = timeDateUnitOut;
    return this;
  }

  /**
   * Time and date Production Unit exited oven in short date pattern.
   * @return TimeDateUnitOut
   */
  @JsonGetter("TimeDateUnitOut")
  public Date getTimeDateUnitOut() {
    return timeDateUnitOut;
  }

  /**
   * Name of product
   * @param productName the value
   */
  @JsonSetter("ProductName")
  public ReflowProfilingProcessData setProductName(String productName) {
    this.productName = productName;
    return this;
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
   * @param barcode the value
   */
  @JsonSetter("Barcode")
  public ReflowProfilingProcessData setBarcode(String barcode) {
    this.barcode = barcode;
    return this;
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
   * @param recipeName the value
   */
  @JsonSetter("RecipeName")
  public ReflowProfilingProcessData setRecipeName(String recipeName) {
    this.recipeName = recipeName;
    return this;
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
   * @param processWindowName the value
   */
  @JsonSetter("ProcessWindowName")
  public ReflowProfilingProcessData setProcessWindowName(String processWindowName) {
    this.processWindowName = processWindowName;
    return this;
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
   * @param lotID the value
   */
  @JsonSetter("LotID")
  public ReflowProfilingProcessData setLotID(String lotID) {
    this.lotID = lotID;
    return this;
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
   * @param ovenName the value
   */
  @JsonSetter("OvenName")
  public ReflowProfilingProcessData setOvenName(String ovenName) {
    this.ovenName = ovenName;
    return this;
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
   * @param lane the value
   */
  @JsonSetter("Lane")
  public ReflowProfilingProcessData setLane(int lane) {
    this.lane = lane;
    return this;
  }

  /**
   * Lane within oven. 1 is “front” and 2 is “back”
   * @return Lane
   */
  @JsonGetter("Lane")
  public int getLane() {
    return lane;
  }

  /**
   * The converyor speed setpoint (in cm / minute)
   * @param conveyorSpeedSetpoint the value
   */
  @JsonSetter("ConveyorSpeedSetpoint")
  public ReflowProfilingProcessData setConveyorSpeedSetpoint(double conveyorSpeedSetpoint) {
    this.conveyorSpeedSetpoint = conveyorSpeedSetpoint;
    return this;
  }

  /**
   * The converyor speed setpoint (in cm / minute)
   * @return ConveyorSpeedSetpoint
   */
  @JsonGetter("ConveyorSpeedSetpoint")
  public double getConveyorSpeedSetpoint() {
    return conveyorSpeedSetpoint;
  }

  /**
   * The actual conveyor speed (in cm / minute)
   * @param measuredConveyorSpeed the value
   */
  @JsonSetter("MeasuredConveyorSpeed")
  public ReflowProfilingProcessData setMeasuredConveyorSpeed(double measuredConveyorSpeed) {
    this.measuredConveyorSpeed = measuredConveyorSpeed;
    return this;
  }

  /**
   * The actual conveyor speed (in cm / minute)
   * @return MeasuredConveyorSpeed
   */
  @JsonGetter("MeasuredConveyorSpeed")
  public double getMeasuredConveyorSpeed() {
    return measuredConveyorSpeed;
  }

  /**
   * &quot;PASS&quot; or &quot;FAIL&quot;. FAIL if absolute value of ProductionUnitPWI exceeds 100.0
   * @param result the value
   */
  @JsonSetter("Result")
  public ReflowProfilingProcessData setResult(TestResult result) {
    this.result = result;
    return this;
  }

  /**
   * &quot;PASS&quot; or &quot;FAIL&quot;. FAIL if absolute value of ProductionUnitPWI exceeds 100.0
   * @return Result
   */
  @JsonGetter("Result")
  public TestResult getResult() {
    return result;
  }

  /**
   * The Process Window Index of the production unit
   * @param productionUnitPWI the value
   */
  @JsonSetter("ProductionUnitPWI")
  public ReflowProfilingProcessData setProductionUnitPWI(double productionUnitPWI) {
    this.productionUnitPWI = productionUnitPWI;
    return this;
  }

  /**
   * The Process Window Index of the production unit
   * @return ProductionUnitPWI
   */
  @JsonGetter("ProductionUnitPWI")
  public double getProductionUnitPWI() {
    return productionUnitPWI;
  }

  /**
   * Process data (temperatures, etc.) for each zone of the reflow oven at the 
            time when this transaction tool place.
   * @param zoneData the value
   */
  @JsonSetter("ZoneData")
  public ReflowProfilingProcessData setZoneData(ReflowZoneData[] zoneData) {
    this.zoneData = zoneData;
    return this;
  }

  /**
   * Process data (temperatures, etc.) for each zone of the reflow oven at the 
            time when this transaction tool place.
   * @return ZoneData
   */
  @JsonGetter("ZoneData")
  public ReflowZoneData[] getZoneData() {
    return zoneData;
  }
}
