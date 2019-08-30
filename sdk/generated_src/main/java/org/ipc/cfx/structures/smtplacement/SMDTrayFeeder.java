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
package org.ipc.cfx.structures.smtplacement;

import org.ipc.cfx.structures.MaterialCarrier;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Describes an SMT Tray carrier
 * original type: CFX.Structures.SMTPlacement.SMDTrayFeeder
 */
public class SMDTrayFeeder extends MaterialCarrier {

  private double cellDimensionX;
  private double cellDimensionY;
  private int cellCountX;
  private int cellCountY;
  private double cellPitchX;
  private double cellPitchY;

  /**
   * The x dimension of each cell in the tray carrier
   * @param cellDimensionX the value
   */
  @JsonSetter("CellDimensionX")
  public void setCellDimensionX(double cellDimensionX) {
    this.cellDimensionX = cellDimensionX;
  }

  /**
   * The x dimension of each cell in the tray carrier
   * @return CellDimensionX
   */
  @JsonGetter("CellDimensionX")
  public double getCellDimensionX() {
    return cellDimensionX;
  }

  /**
   * The y dimension of each cell in the tray carrier
   * @param cellDimensionY the value
   */
  @JsonSetter("CellDimensionY")
  public void setCellDimensionY(double cellDimensionY) {
    this.cellDimensionY = cellDimensionY;
  }

  /**
   * The y dimension of each cell in the tray carrier
   * @return CellDimensionY
   */
  @JsonGetter("CellDimensionY")
  public double getCellDimensionY() {
    return cellDimensionY;
  }

  /**
   * The number of cells in the x axis in this tray carrier
   * @param cellCountX the value
   */
  @JsonSetter("CellCountX")
  public void setCellCountX(int cellCountX) {
    this.cellCountX = cellCountX;
  }

  /**
   * The number of cells in the x axis in this tray carrier
   * @return CellCountX
   */
  @JsonGetter("CellCountX")
  public int getCellCountX() {
    return cellCountX;
  }

  /**
   * The number of cells in the y axis in this tray carrier
   * @param cellCountY the value
   */
  @JsonSetter("CellCountY")
  public void setCellCountY(int cellCountY) {
    this.cellCountY = cellCountY;
  }

  /**
   * The number of cells in the y axis in this tray carrier
   * @return CellCountY
   */
  @JsonGetter("CellCountY")
  public int getCellCountY() {
    return cellCountY;
  }

  /**
   * The x offset between adjacent cells in the tray carrier
   * @param cellPitchX the value
   */
  @JsonSetter("CellPitchX")
  public void setCellPitchX(double cellPitchX) {
    this.cellPitchX = cellPitchX;
  }

  /**
   * The x offset between adjacent cells in the tray carrier
   * @return CellPitchX
   */
  @JsonGetter("CellPitchX")
  public double getCellPitchX() {
    return cellPitchX;
  }

  /**
   * The y offset between adjacent cells in the tray carrier
   * @param cellPitchY the value
   */
  @JsonSetter("CellPitchY")
  public void setCellPitchY(double cellPitchY) {
    this.cellPitchY = cellPitchY;
  }

  /**
   * The y offset between adjacent cells in the tray carrier
   * @return CellPitchY
   */
  @JsonGetter("CellPitchY")
  public double getCellPitchY() {
    return cellPitchY;
  }
}
