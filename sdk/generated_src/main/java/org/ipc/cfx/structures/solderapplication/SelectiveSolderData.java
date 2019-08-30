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
package org.ipc.cfx.structures.solderapplication;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * General data values that apply across the selective process cycle
 * original type: CFX.Structures.SolderApplication.SelectiveSolderData
 */
public class SelectiveSolderData {

  private String process_Status;
  private String recipeName;
  private double nitrogen_Pressure;
  private float air_Pressure;
  private int cycle_Count;
  private long cycle_Time;
  private double nitrogen_Purity;
  private double nitrogen_Flow;
  private boolean fiducial_Enabled;

  /**
   * Result of the Selective Process
            &quot;Completed&quot; or &quot;Aborted&quot;
   * @param process_Status the value
   */
  @JsonSetter("Process_Status")
  public void setProcess_Status(String process_Status) {
    this.process_Status = process_Status;
  }

  /**
   * Result of the Selective Process
            &quot;Completed&quot; or &quot;Aborted&quot;
   *
   * @return never null
   */
  @JsonGetter("Process_Status")
  public String getProcess_Status() {
    return process_Status == null ? "" : process_Status;
  }

  /**
   * The name of the active recipe at the time when the processing occurred.
   * @param recipeName the value
   */
  @JsonSetter("RecipeName")
  public void setRecipeName(String recipeName) {
    this.recipeName = recipeName;
  }

  /**
   * The name of the active recipe at the time when the processing occurred.
   *
   * @return never null
   */
  @JsonGetter("RecipeName")
  public String getRecipeName() {
    return recipeName == null ? "" : recipeName;
  }

  /**
   * Pressure od the incoming Nitrogen
            in kPa (kilopascal)
   * @param nitrogen_Pressure the value
   */
  @JsonSetter("Nitrogen_Pressure")
  public void setNitrogen_Pressure(double nitrogen_Pressure) {
    this.nitrogen_Pressure = nitrogen_Pressure;
  }

  /**
   * Pressure od the incoming Nitrogen
            in kPa (kilopascal)
   * @return Nitrogen_Pressure
   */
  @JsonGetter("Nitrogen_Pressure")
  public double getNitrogen_Pressure() {
    return nitrogen_Pressure;
  }

  /**
   * Pressure od the incoming Air
            in kPa (kilopascal)
   * @param air_Pressure the value
   */
  @JsonSetter("Air_Pressure")
  public void setAir_Pressure(float air_Pressure) {
    this.air_Pressure = air_Pressure;
  }

  /**
   * Pressure od the incoming Air
            in kPa (kilopascal)
   * @return Air_Pressure
   */
  @JsonGetter("Air_Pressure")
  public float getAir_Pressure() {
    return air_Pressure;
  }

  /**
   * The total number of parts processed
            since the last reset of the Cycle Counter
   * @param cycle_Count the value
   */
  @JsonSetter("Cycle_Count")
  public void setCycle_Count(int cycle_Count) {
    this.cycle_Count = cycle_Count;
  }

  /**
   * The total number of parts processed
            since the last reset of the Cycle Counter
   * @return Cycle_Count
   */
  @JsonGetter("Cycle_Count")
  public int getCycle_Count() {
    return cycle_Count;
  }

  /**
   * The total time the item was within the Selective Soldering System
   * @param cycle_Time the value
   */
  @JsonSetter("Cycle_Time")
  public void setCycle_Time(long cycle_Time) {
    this.cycle_Time = cycle_Time;
  }

  /**
   * The total time the item was within the Selective Soldering System
   * @return Cycle_Time
   */
  @JsonGetter("Cycle_Time")
  public long getCycle_Time() {
    return cycle_Time;
  }

  /**
   * The Purity of the incoming Nitrogen supply
            in ppm (parts per million)
   * @param nitrogen_Purity the value
   */
  @JsonSetter("Nitrogen_Purity")
  public void setNitrogen_Purity(double nitrogen_Purity) {
    this.nitrogen_Purity = nitrogen_Purity;
  }

  /**
   * The Purity of the incoming Nitrogen supply
            in ppm (parts per million)
   * @return Nitrogen_Purity
   */
  @JsonGetter("Nitrogen_Purity")
  public double getNitrogen_Purity() {
    return nitrogen_Purity;
  }

  /**
   * The consumption of Nitrogen by the selective soldering system
            in LPM (litres per minute)
   * @param nitrogen_Flow the value
   */
  @JsonSetter("Nitrogen_Flow")
  public void setNitrogen_Flow(double nitrogen_Flow) {
    this.nitrogen_Flow = nitrogen_Flow;
  }

  /**
   * The consumption of Nitrogen by the selective soldering system
            in LPM (litres per minute)
   * @return Nitrogen_Flow
   */
  @JsonGetter("Nitrogen_Flow")
  public double getNitrogen_Flow() {
    return nitrogen_Flow;
  }

  /**
   * Fiducial correct enabled for the selective soldering system
            &quot;True&quot; or &quot;False&quot;
   * @param fiducial_Enabled the value
   */
  @JsonSetter("Fiducial_Enabled")
  public void setFiducial_Enabled(boolean fiducial_Enabled) {
    this.fiducial_Enabled = fiducial_Enabled;
  }

  /**
   * Fiducial correct enabled for the selective soldering system
            &quot;True&quot; or &quot;False&quot;
   * @return Fiducial_Enabled
   */
  @JsonGetter("Fiducial_Enabled")
  public boolean isFiducial_Enabled() {
    return fiducial_Enabled;
  }
}
