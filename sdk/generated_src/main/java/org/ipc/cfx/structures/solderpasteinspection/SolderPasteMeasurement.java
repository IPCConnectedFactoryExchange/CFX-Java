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
   * @param x the value
   */
  @JsonSetter("X")
  public void setX(double x) {
    this.x = x;
  }

  /**
   * The x dimension (length) of the paste deposition, expressed in millimeters (mm).
   * @return X
   */
  @JsonGetter("X")
  public double getX() {
    return x;
  }

  /**
   * The expected or nominal x dimension (length) required for this paste deposition, expressed in millimeters (mm).
   * @param eX the value
   */
  @JsonSetter("EX")
  public void setEX(double eX) {
    this.eX = eX;
  }

  /**
   * The expected or nominal x dimension (length) required for this paste deposition, expressed in millimeters (mm).
   * @return EX
   */
  @JsonGetter("EX")
  public double getEX() {
    return eX;
  }

  /**
   * The x dimension (length) of the paste deposition, expressed in millimeters (mm).
   * @param y the value
   */
  @JsonSetter("Y")
  public void setY(double y) {
    this.y = y;
  }

  /**
   * The x dimension (length) of the paste deposition, expressed in millimeters (mm).
   * @return Y
   */
  @JsonGetter("Y")
  public double getY() {
    return y;
  }

  /**
   * The expected or nominal x dimension (length) required for this paste deposition, expressed in millimeters (mm).
   * @param eY the value
   */
  @JsonSetter("EY")
  public void setEY(double eY) {
    this.eY = eY;
  }

  /**
   * The expected or nominal x dimension (length) required for this paste deposition, expressed in millimeters (mm).
   * @return EY
   */
  @JsonGetter("EY")
  public double getEY() {
    return eY;
  }

  /**
   * The height of the paste deposition, expressed in millimeters (mm).
   * @param z the value
   */
  @JsonSetter("Z")
  public void setZ(double z) {
    this.z = z;
  }

  /**
   * The height of the paste deposition, expressed in millimeters (mm).
   * @return Z
   */
  @JsonGetter("Z")
  public double getZ() {
    return z;
  }

  /**
   * The expected or nominal height required for this paste deposition, expressed in millimeters (mm).
   * @param eZ the value
   */
  @JsonSetter("EZ")
  public void setEZ(double eZ) {
    this.eZ = eZ;
  }

  /**
   * The expected or nominal height required for this paste deposition, expressed in millimeters (mm).
   * @return EZ
   */
  @JsonGetter("EZ")
  public double getEZ() {
    return eZ;
  }

  /**
   * The x location of the center of the paste deposition relative to the center of the pad.
   * @param dX the value
   */
  @JsonSetter("DX")
  public void setDX(double dX) {
    this.dX = dX;
  }

  /**
   * The x location of the center of the paste deposition relative to the center of the pad.
   * @return DX
   */
  @JsonGetter("DX")
  public double getDX() {
    return dX;
  }

  /**
   * The y location of the center of the paste deposition relative to the center of the pad.
   * @param dY the value
   */
  @JsonSetter("DY")
  public void setDY(double dY) {
    this.dY = dY;
  }

  /**
   * The y location of the center of the paste deposition relative to the center of the pad.
   * @return DY
   */
  @JsonGetter("DY")
  public double getDY() {
    return dY;
  }

  /**
   * The volume of the paste deposition, expressed in milliliters (ml)
   * @param vol the value
   */
  @JsonSetter("Vol")
  public void setVol(double vol) {
    this.vol = vol;
  }

  /**
   * The volume of the paste deposition, expressed in milliliters (ml)
   * @return Vol
   */
  @JsonGetter("Vol")
  public double getVol() {
    return vol;
  }

  /**
   * The expected or nominal volume of the paste deposition, expressed in milliliters (ml)
   * @param eVol the value
   */
  @JsonSetter("EVol")
  public void setEVol(double eVol) {
    this.eVol = eVol;
  }

  /**
   * The expected or nominal volume of the paste deposition, expressed in milliliters (ml)
   * @return EVol
   */
  @JsonGetter("EVol")
  public double getEVol() {
    return eVol;
  }

  /**
   * An optional image of the deposit formatted in an acceptable MIME image format (JPG, PNG, etc.)
   * @param image the value
   */
  @JsonSetter("Image")
  public void setImage(Image image) {
    this.image = image;
  }

  /**
   * An optional image of the deposit formatted in an acceptable MIME image format (JPG, PNG, etc.)
   * @return Image
   */
  @JsonGetter("Image")
  public Image getImage() {
    return image;
  }
}
