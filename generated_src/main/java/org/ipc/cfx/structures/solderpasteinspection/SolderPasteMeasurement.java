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
package org.ipc.cfx.structures.solderpasteinspection;

import org.ipc.cfx.structures.Image;
import org.ipc.cfx.structures.Measurement;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Describes the results of a measurement that was made on a solder paste deposition.
 * original type: CFX.Structures.SolderPasteInspection.SolderPasteMeasurement
 */
public class SolderPasteMeasurement extends Measurement {

  private double x;
  private double eX;
  private double y;
  private double eY;
  private double z;
  private double eZ;
  private double dX;
  private double dY;
  private double vol;
  private double eVol;
  private Image image;

  /**
   * The x dimension (length) of the paste deposition, expressed in millimeters (mm).
   */
  @JsonSetter("X")
  public void setX(double x) {
    this.x = x;
  }

  /**
   * The x dimension (length) of the paste deposition, expressed in millimeters (mm).
   */
  @JsonGetter("X")
  public double getX() {
    return x;
  }

  /**
   * The expected or nominal x dimension (length) required for this paste deposition, expressed in millimeters (mm).
   */
  @JsonSetter("EX")
  public void setEX(double eX) {
    this.eX = eX;
  }

  /**
   * The expected or nominal x dimension (length) required for this paste deposition, expressed in millimeters (mm).
   */
  @JsonGetter("EX")
  public double getEX() {
    return eX;
  }

  /**
   * The x dimension (length) of the paste deposition, expressed in millimeters (mm).
   */
  @JsonSetter("Y")
  public void setY(double y) {
    this.y = y;
  }

  /**
   * The x dimension (length) of the paste deposition, expressed in millimeters (mm).
   */
  @JsonGetter("Y")
  public double getY() {
    return y;
  }

  /**
   * The expected or nominal x dimension (length) required for this paste deposition, expressed in millimeters (mm).
   */
  @JsonSetter("EY")
  public void setEY(double eY) {
    this.eY = eY;
  }

  /**
   * The expected or nominal x dimension (length) required for this paste deposition, expressed in millimeters (mm).
   */
  @JsonGetter("EY")
  public double getEY() {
    return eY;
  }

  /**
   * The height of the paste deposition, expressed in millimeters (mm).
   */
  @JsonSetter("Z")
  public void setZ(double z) {
    this.z = z;
  }

  /**
   * The height of the paste deposition, expressed in millimeters (mm).
   */
  @JsonGetter("Z")
  public double getZ() {
    return z;
  }

  /**
   * The expected or nominal height required for this paste deposition, expressed in millimeters (mm).
   */
  @JsonSetter("EZ")
  public void setEZ(double eZ) {
    this.eZ = eZ;
  }

  /**
   * The expected or nominal height required for this paste deposition, expressed in millimeters (mm).
   */
  @JsonGetter("EZ")
  public double getEZ() {
    return eZ;
  }

  /**
   * The x location of the center of the paste deposition relative to the center of the pad.
   */
  @JsonSetter("DX")
  public void setDX(double dX) {
    this.dX = dX;
  }

  /**
   * The x location of the center of the paste deposition relative to the center of the pad.
   */
  @JsonGetter("DX")
  public double getDX() {
    return dX;
  }

  /**
   * The y location of the center of the paste deposition relative to the center of the pad.
   */
  @JsonSetter("DY")
  public void setDY(double dY) {
    this.dY = dY;
  }

  /**
   * The y location of the center of the paste deposition relative to the center of the pad.
   */
  @JsonGetter("DY")
  public double getDY() {
    return dY;
  }

  /**
   * The volume of the paste deposition, expressed in milliliters (ml)
   */
  @JsonSetter("Vol")
  public void setVol(double vol) {
    this.vol = vol;
  }

  /**
   * The volume of the paste deposition, expressed in milliliters (ml)
   */
  @JsonGetter("Vol")
  public double getVol() {
    return vol;
  }

  /**
   * The expected or nominal volume of the paste deposition, expressed in milliliters (ml)
   */
  @JsonSetter("EVol")
  public void setEVol(double eVol) {
    this.eVol = eVol;
  }

  /**
   * The expected or nominal volume of the paste deposition, expressed in milliliters (ml)
   */
  @JsonGetter("EVol")
  public double getEVol() {
    return eVol;
  }

  /**
   * An optional image of the deposit formatted in an acceptable MIME image format (JPG, PNG, etc.)
   */
  @JsonSetter("Image")
  public void setImage(Image image) {
    this.image = image;
  }

  /**
   * An optional image of the deposit formatted in an acceptable MIME image format (JPG, PNG, etc.)
   */
  @JsonGetter("Image")
  public Image getImage() {
    return image;
  }
}
