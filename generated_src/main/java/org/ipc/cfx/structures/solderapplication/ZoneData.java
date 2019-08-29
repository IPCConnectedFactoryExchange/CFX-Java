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
   */
  @JsonSetter("StageSequence")
  public void setStageSequence(int stageSequence) {
    this.stageSequence = stageSequence;
  }

  /**
   * The identity of the zone for this set of process data.  
            Corresponds to the StageSequence number of the related Stage
   */
  @JsonGetter("StageSequence")
  public int getStageSequence() {
    return stageSequence;
  }

  /**
   * The time the item was within this zone
            of the Selective Soldering System
   */
  @JsonSetter("ProcessTime")
  public void setProcessTime(long processTime) {
    this.processTime = processTime;
  }

  /**
   * The time the item was within this zone
            of the Selective Soldering System
   */
  @JsonGetter("ProcessTime")
  public long getProcessTime() {
    return processTime;
  }

  /**
   * Pressure of the Nitrogen for flux applicator 1
            in kPa (kilopascal)
   */
  @JsonSetter("Bottle1_Pressure")
  public void setBottle1_Pressure(double bottle1_Pressure) {
    this.bottle1_Pressure = bottle1_Pressure;
  }

  /**
   * Pressure of the Nitrogen for flux applicator 1
            in kPa (kilopascal)
   */
  @JsonGetter("Bottle1_Pressure")
  public double getBottle1_Pressure() {
    return bottle1_Pressure;
  }

  /**
   * Pressure of the Nitrogen for flux applicator 2
            in kPa (kilopascal)
   */
  @JsonSetter("Bottle2_Pressure")
  public void setBottle2_Pressure(double bottle2_Pressure) {
    this.bottle2_Pressure = bottle2_Pressure;
  }

  /**
   * Pressure of the Nitrogen for flux applicator 2
            in kPa (kilopascal)
   */
  @JsonGetter("Bottle2_Pressure")
  public double getBottle2_Pressure() {
    return bottle2_Pressure;
  }

  /**
   * The total volume of flux applied to the item
            in mg (milligrams)
   */
  @JsonSetter("Flux_Volume")
  public void setFlux_Volume(double flux_Volume) {
    this.flux_Volume = flux_Volume;
  }

  /**
   * The total volume of flux applied to the item
            in mg (milligrams)
   */
  @JsonGetter("Flux_Volume")
  public double getFlux_Volume() {
    return flux_Volume;
  }

  /**
   * The power setting for the top side preheater
            during the heating phase
            as a percentage (0-100%)
   */
  @JsonSetter("Top_Preheater_Power")
  public void setTop_Preheater_Power(double top_Preheater_Power) {
    this.top_Preheater_Power = top_Preheater_Power;
  }

  /**
   * The power setting for the top side preheater
            during the heating phase
            as a percentage (0-100%)
   */
  @JsonGetter("Top_Preheater_Power")
  public double getTop_Preheater_Power() {
    return top_Preheater_Power;
  }

  /**
   * The power setting for the top side preheater
            during the soak phase
            as a percentage (0-100%)
   */
  @JsonSetter("Top_Preheater_Soak")
  public void setTop_Preheater_Soak(double top_Preheater_Soak) {
    this.top_Preheater_Soak = top_Preheater_Soak;
  }

  /**
   * The power setting for the top side preheater
            during the soak phase
            as a percentage (0-100%)
   */
  @JsonGetter("Top_Preheater_Soak")
  public double getTop_Preheater_Soak() {
    return top_Preheater_Soak;
  }

  /**
   * The maximum temperature of the item
            during the preheating cycle
            in Celsius
   */
  @JsonSetter("Top_Preheater_Temp")
  public void setTop_Preheater_Temp(double top_Preheater_Temp) {
    this.top_Preheater_Temp = top_Preheater_Temp;
  }

  /**
   * The maximum temperature of the item
            during the preheating cycle
            in Celsius
   */
  @JsonGetter("Top_Preheater_Temp")
  public double getTop_Preheater_Temp() {
    return top_Preheater_Temp;
  }

  /**
   * The total time for the prehearting
            phase within this zone
   */
  @JsonSetter("Top_Preheater_Time")
  public void setTop_Preheater_Time(long top_Preheater_Time) {
    this.top_Preheater_Time = top_Preheater_Time;
  }

  /**
   * The total time for the prehearting
            phase within this zone
   */
  @JsonGetter("Top_Preheater_Time")
  public long getTop_Preheater_Time() {
    return top_Preheater_Time;
  }

  /**
   * The power setting for the bottom side preheater
            as a percentage (0-100%)
   */
  @JsonSetter("Bot_Preheater_Power")
  public void setBot_Preheater_Power(double bot_Preheater_Power) {
    this.bot_Preheater_Power = bot_Preheater_Power;
  }

  /**
   * The power setting for the bottom side preheater
            as a percentage (0-100%)
   */
  @JsonGetter("Bot_Preheater_Power")
  public double getBot_Preheater_Power() {
    return bot_Preheater_Power;
  }

  /**
   * The power setting for the bottom side preheater
            during the soak phase
            as a percentage (0-100%)
   */
  @JsonSetter("Bot_Preheater_Soak")
  public void setBot_Preheater_Soak(double bot_Preheater_Soak) {
    this.bot_Preheater_Soak = bot_Preheater_Soak;
  }

  /**
   * The power setting for the bottom side preheater
            during the soak phase
            as a percentage (0-100%)
   */
  @JsonGetter("Bot_Preheater_Soak")
  public double getBot_Preheater_Soak() {
    return bot_Preheater_Soak;
  }

  /**
   * The maximum temperature of the item
            during the preheating cycle
            in Celsius
   */
  @JsonSetter("Bot_Preheater_Temp")
  public void setBot_Preheater_Temp(float bot_Preheater_Temp) {
    this.bot_Preheater_Temp = bot_Preheater_Temp;
  }

  /**
   * The maximum temperature of the item
            during the preheating cycle
            in Celsius
   */
  @JsonGetter("Bot_Preheater_Temp")
  public float getBot_Preheater_Temp() {
    return bot_Preheater_Temp;
  }

  /**
   * The total time for the prehearting
            phase within this zone
   */
  @JsonSetter("Bot_Preheater_Time")
  public void setBot_Preheater_Time(long bot_Preheater_Time) {
    this.bot_Preheater_Time = bot_Preheater_Time;
  }

  /**
   * The total time for the prehearting
            phase within this zone
   */
  @JsonGetter("Bot_Preheater_Time")
  public long getBot_Preheater_Time() {
    return bot_Preheater_Time;
  }

  /**
   * Temperature of the solder bath
            in Celsius
   */
  @JsonSetter("Bath_Temp")
  public void setBath_Temp(double bath_Temp) {
    this.bath_Temp = bath_Temp;
  }

  /**
   * Temperature of the solder bath
            in Celsius
   */
  @JsonGetter("Bath_Temp")
  public double getBath_Temp() {
    return bath_Temp;
  }

  /**
   * Solder Wave Height correction enabled 
            for the selective soldering system
            "True" or "False"
   */
  @JsonSetter("Bath_Wave_Enabled")
  public void setBath_Wave_Enabled(boolean bath_Wave_Enabled) {
    this.bath_Wave_Enabled = bath_Wave_Enabled;
  }

  /**
   * Solder Wave Height correction enabled 
            for the selective soldering system
            "True" or "False"
   */
  @JsonGetter("Bath_Wave_Enabled")
  public boolean isBath_Wave_Enabled() {
    return bath_Wave_Enabled;
  }

  /**
   * The value the wave height was corrected by
            in mm (millimetres)
   */
  @JsonSetter("Bath_Wave_Hgt")
  public void setBath_Wave_Hgt(double bath_Wave_Hgt) {
    this.bath_Wave_Hgt = bath_Wave_Hgt;
  }

  /**
   * The value the wave height was corrected by
            in mm (millimetres)
   */
  @JsonGetter("Bath_Wave_Hgt")
  public double getBath_Wave_Hgt() {
    return bath_Wave_Hgt;
  }

  /**
   * The quantity of solder consumed by the soldering process
            in grams
   */
  @JsonSetter("Solder_Quantity_Used")
  public void setSolder_Quantity_Used(double solder_Quantity_Used) {
    this.solder_Quantity_Used = solder_Quantity_Used;
  }

  /**
   * The quantity of solder consumed by the soldering process
            in grams
   */
  @JsonGetter("Solder_Quantity_Used")
  public double getSolder_Quantity_Used() {
    return solder_Quantity_Used;
  }

  /**
   * The X-axis fiducial correction value
            in mm (millimetres)
   */
  @JsonSetter("Fid_XCorrection")
  public void setFid_XCorrection(double fid_XCorrection) {
    this.fid_XCorrection = fid_XCorrection;
  }

  /**
   * The X-axis fiducial correction value
            in mm (millimetres)
   */
  @JsonGetter("Fid_XCorrection")
  public double getFid_XCorrection() {
    return fid_XCorrection;
  }

  /**
   * The Y-axis fiducial correction value
            in mm (millimetres)
   */
  @JsonSetter("Fid_YCorrection")
  public void setFid_YCorrection(double fid_YCorrection) {
    this.fid_YCorrection = fid_YCorrection;
  }

  /**
   * The Y-axis fiducial correction value
            in mm (millimetres)
   */
  @JsonGetter("Fid_YCorrection")
  public double getFid_YCorrection() {
    return fid_YCorrection;
  }
}
