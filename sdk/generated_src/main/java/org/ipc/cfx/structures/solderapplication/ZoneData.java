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
package org.ipc.cfx.structures.solderapplication;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Data specific to a single zone with the
            Selective Soldering System
 * original type: CFX.Structures.SolderApplication.ZoneData
 */
public class ZoneData {

  private int stageSequence;
  private long processTime;
  private double bottle1_Pressure;
  private double bottle2_Pressure;
  private double flux_Volume;
  private double top_Preheater_Power;
  private double top_Preheater_Soak;
  private double top_Preheater_Temp;
  private long top_Preheater_Time;
  private double bot_Preheater_Power;
  private double bot_Preheater_Soak;
  private float bot_Preheater_Temp;
  private long bot_Preheater_Time;
  private double bath_Temp;
  private boolean bath_Wave_Enabled;
  private double bath_Wave_Hgt;
  private double solder_Quantity_Used;
  private double fid_XCorrection;
  private double fid_YCorrection;

  /**
   * The identity of the zone for this set of process data.  
            Corresponds to the StageSequence number of the related Stage
   * @param stageSequence the value
   */
  @JsonSetter("StageSequence")
  public ZoneData setStageSequence(int stageSequence) {
    this.stageSequence = stageSequence;
    return this;
  }

  /**
   * The identity of the zone for this set of process data.  
            Corresponds to the StageSequence number of the related Stage
   * @return StageSequence
   */
  @JsonGetter("StageSequence")
  public int getStageSequence() {
    return stageSequence;
  }

  /**
   * The time the item was within this zone
            of the Selective Soldering System
   * @param processTime the value
   */
  @JsonSetter("ProcessTime")
  public ZoneData setProcessTime(long processTime) {
    this.processTime = processTime;
    return this;
  }

  /**
   * The time the item was within this zone
            of the Selective Soldering System
   * @return ProcessTime
   */
  @JsonGetter("ProcessTime")
  public long getProcessTime() {
    return processTime;
  }

  /**
   * Pressure of the Nitrogen for flux applicator 1
            in kPa (kilopascal)
   * @param bottle1_Pressure the value
   */
  @JsonSetter("Bottle1_Pressure")
  public ZoneData setBottle1_Pressure(double bottle1_Pressure) {
    this.bottle1_Pressure = bottle1_Pressure;
    return this;
  }

  /**
   * Pressure of the Nitrogen for flux applicator 1
            in kPa (kilopascal)
   * @return Bottle1_Pressure
   */
  @JsonGetter("Bottle1_Pressure")
  public double getBottle1_Pressure() {
    return bottle1_Pressure;
  }

  /**
   * Pressure of the Nitrogen for flux applicator 2
            in kPa (kilopascal)
   * @param bottle2_Pressure the value
   */
  @JsonSetter("Bottle2_Pressure")
  public ZoneData setBottle2_Pressure(double bottle2_Pressure) {
    this.bottle2_Pressure = bottle2_Pressure;
    return this;
  }

  /**
   * Pressure of the Nitrogen for flux applicator 2
            in kPa (kilopascal)
   * @return Bottle2_Pressure
   */
  @JsonGetter("Bottle2_Pressure")
  public double getBottle2_Pressure() {
    return bottle2_Pressure;
  }

  /**
   * The total volume of flux applied to the item
            in mg (milligrams)
   * @param flux_Volume the value
   */
  @JsonSetter("Flux_Volume")
  public ZoneData setFlux_Volume(double flux_Volume) {
    this.flux_Volume = flux_Volume;
    return this;
  }

  /**
   * The total volume of flux applied to the item
            in mg (milligrams)
   * @return Flux_Volume
   */
  @JsonGetter("Flux_Volume")
  public double getFlux_Volume() {
    return flux_Volume;
  }

  /**
   * The power setting for the top side preheater
            during the heating phase
            as a percentage (0-100%)
   * @param top_Preheater_Power the value
   */
  @JsonSetter("Top_Preheater_Power")
  public ZoneData setTop_Preheater_Power(double top_Preheater_Power) {
    this.top_Preheater_Power = top_Preheater_Power;
    return this;
  }

  /**
   * The power setting for the top side preheater
            during the heating phase
            as a percentage (0-100%)
   * @return Top_Preheater_Power
   */
  @JsonGetter("Top_Preheater_Power")
  public double getTop_Preheater_Power() {
    return top_Preheater_Power;
  }

  /**
   * The power setting for the top side preheater
            during the soak phase
            as a percentage (0-100%)
   * @param top_Preheater_Soak the value
   */
  @JsonSetter("Top_Preheater_Soak")
  public ZoneData setTop_Preheater_Soak(double top_Preheater_Soak) {
    this.top_Preheater_Soak = top_Preheater_Soak;
    return this;
  }

  /**
   * The power setting for the top side preheater
            during the soak phase
            as a percentage (0-100%)
   * @return Top_Preheater_Soak
   */
  @JsonGetter("Top_Preheater_Soak")
  public double getTop_Preheater_Soak() {
    return top_Preheater_Soak;
  }

  /**
   * The maximum temperature of the item
            during the preheating cycle
            in Celsius
   * @param top_Preheater_Temp the value
   */
  @JsonSetter("Top_Preheater_Temp")
  public ZoneData setTop_Preheater_Temp(double top_Preheater_Temp) {
    this.top_Preheater_Temp = top_Preheater_Temp;
    return this;
  }

  /**
   * The maximum temperature of the item
            during the preheating cycle
            in Celsius
   * @return Top_Preheater_Temp
   */
  @JsonGetter("Top_Preheater_Temp")
  public double getTop_Preheater_Temp() {
    return top_Preheater_Temp;
  }

  /**
   * The total time for the prehearting
            phase within this zone
   * @param top_Preheater_Time the value
   */
  @JsonSetter("Top_Preheater_Time")
  public ZoneData setTop_Preheater_Time(long top_Preheater_Time) {
    this.top_Preheater_Time = top_Preheater_Time;
    return this;
  }

  /**
   * The total time for the prehearting
            phase within this zone
   * @return Top_Preheater_Time
   */
  @JsonGetter("Top_Preheater_Time")
  public long getTop_Preheater_Time() {
    return top_Preheater_Time;
  }

  /**
   * The power setting for the bottom side preheater
            as a percentage (0-100%)
   * @param bot_Preheater_Power the value
   */
  @JsonSetter("Bot_Preheater_Power")
  public ZoneData setBot_Preheater_Power(double bot_Preheater_Power) {
    this.bot_Preheater_Power = bot_Preheater_Power;
    return this;
  }

  /**
   * The power setting for the bottom side preheater
            as a percentage (0-100%)
   * @return Bot_Preheater_Power
   */
  @JsonGetter("Bot_Preheater_Power")
  public double getBot_Preheater_Power() {
    return bot_Preheater_Power;
  }

  /**
   * The power setting for the bottom side preheater
            during the soak phase
            as a percentage (0-100%)
   * @param bot_Preheater_Soak the value
   */
  @JsonSetter("Bot_Preheater_Soak")
  public ZoneData setBot_Preheater_Soak(double bot_Preheater_Soak) {
    this.bot_Preheater_Soak = bot_Preheater_Soak;
    return this;
  }

  /**
   * The power setting for the bottom side preheater
            during the soak phase
            as a percentage (0-100%)
   * @return Bot_Preheater_Soak
   */
  @JsonGetter("Bot_Preheater_Soak")
  public double getBot_Preheater_Soak() {
    return bot_Preheater_Soak;
  }

  /**
   * The maximum temperature of the item
            during the preheating cycle
            in Celsius
   * @param bot_Preheater_Temp the value
   */
  @JsonSetter("Bot_Preheater_Temp")
  public ZoneData setBot_Preheater_Temp(float bot_Preheater_Temp) {
    this.bot_Preheater_Temp = bot_Preheater_Temp;
    return this;
  }

  /**
   * The maximum temperature of the item
            during the preheating cycle
            in Celsius
   * @return Bot_Preheater_Temp
   */
  @JsonGetter("Bot_Preheater_Temp")
  public float getBot_Preheater_Temp() {
    return bot_Preheater_Temp;
  }

  /**
   * The total time for the prehearting
            phase within this zone
   * @param bot_Preheater_Time the value
   */
  @JsonSetter("Bot_Preheater_Time")
  public ZoneData setBot_Preheater_Time(long bot_Preheater_Time) {
    this.bot_Preheater_Time = bot_Preheater_Time;
    return this;
  }

  /**
   * The total time for the prehearting
            phase within this zone
   * @return Bot_Preheater_Time
   */
  @JsonGetter("Bot_Preheater_Time")
  public long getBot_Preheater_Time() {
    return bot_Preheater_Time;
  }

  /**
   * Temperature of the solder bath
            in Celsius
   * @param bath_Temp the value
   */
  @JsonSetter("Bath_Temp")
  public ZoneData setBath_Temp(double bath_Temp) {
    this.bath_Temp = bath_Temp;
    return this;
  }

  /**
   * Temperature of the solder bath
            in Celsius
   * @return Bath_Temp
   */
  @JsonGetter("Bath_Temp")
  public double getBath_Temp() {
    return bath_Temp;
  }

  /**
   * Solder Wave Height correction enabled 
            for the selective soldering system
            &quot;True&quot; or &quot;False&quot;
   * @param bath_Wave_Enabled the value
   */
  @JsonSetter("Bath_Wave_Enabled")
  public ZoneData setBath_Wave_Enabled(boolean bath_Wave_Enabled) {
    this.bath_Wave_Enabled = bath_Wave_Enabled;
    return this;
  }

  /**
   * Solder Wave Height correction enabled 
            for the selective soldering system
            &quot;True&quot; or &quot;False&quot;
   * @return Bath_Wave_Enabled
   */
  @JsonGetter("Bath_Wave_Enabled")
  public boolean isBath_Wave_Enabled() {
    return bath_Wave_Enabled;
  }

  /**
   * The value the wave height was corrected by
            in mm (millimetres)
   * @param bath_Wave_Hgt the value
   */
  @JsonSetter("Bath_Wave_Hgt")
  public ZoneData setBath_Wave_Hgt(double bath_Wave_Hgt) {
    this.bath_Wave_Hgt = bath_Wave_Hgt;
    return this;
  }

  /**
   * The value the wave height was corrected by
            in mm (millimetres)
   * @return Bath_Wave_Hgt
   */
  @JsonGetter("Bath_Wave_Hgt")
  public double getBath_Wave_Hgt() {
    return bath_Wave_Hgt;
  }

  /**
   * The quantity of solder consumed by the soldering process
            in grams
   * @param solder_Quantity_Used the value
   */
  @JsonSetter("Solder_Quantity_Used")
  public ZoneData setSolder_Quantity_Used(double solder_Quantity_Used) {
    this.solder_Quantity_Used = solder_Quantity_Used;
    return this;
  }

  /**
   * The quantity of solder consumed by the soldering process
            in grams
   * @return Solder_Quantity_Used
   */
  @JsonGetter("Solder_Quantity_Used")
  public double getSolder_Quantity_Used() {
    return solder_Quantity_Used;
  }

  /**
   * The X-axis fiducial correction value
            in mm (millimetres)
   * @param fid_XCorrection the value
   */
  @JsonSetter("Fid_XCorrection")
  public ZoneData setFid_XCorrection(double fid_XCorrection) {
    this.fid_XCorrection = fid_XCorrection;
    return this;
  }

  /**
   * The X-axis fiducial correction value
            in mm (millimetres)
   * @return Fid_XCorrection
   */
  @JsonGetter("Fid_XCorrection")
  public double getFid_XCorrection() {
    return fid_XCorrection;
  }

  /**
   * The Y-axis fiducial correction value
            in mm (millimetres)
   * @param fid_YCorrection the value
   */
  @JsonSetter("Fid_YCorrection")
  public ZoneData setFid_YCorrection(double fid_YCorrection) {
    this.fid_YCorrection = fid_YCorrection;
    return this;
  }

  /**
   * The Y-axis fiducial correction value
            in mm (millimetres)
   * @return Fid_YCorrection
   */
  @JsonGetter("Fid_YCorrection")
  public double getFid_YCorrection() {
    return fid_YCorrection;
  }
}
