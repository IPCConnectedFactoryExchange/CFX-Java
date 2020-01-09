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
package org.ipc.cfx.structures.pressinsertion;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Describes a PCB that is being pressed.
 * original type: CFX.Structures.PressInsertion.BoardData
 */
public class BoardData {

  private String boardName;
  private String serialNumber;
  private String barcodeLabel;
  private Date startDateTime;
  private Date endDateTime;

  /**
   * The name of the board.
   * @param boardName the value
   */
  @JsonSetter("BoardName")
  public BoardData setBoardName(String boardName) {
    this.boardName = boardName;
    return this;
  }

  /**
   * The name of the board.
   *
   * @return never null
   */
  @JsonGetter("BoardName")
  public String getBoardName() {
    return boardName == null ? "" : boardName;
  }

  /**
   * The board serial number
   * @param serialNumber the value
   */
  @JsonSetter("SerialNumber")
  public BoardData setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  /**
   * The board serial number
   *
   * @return never null
   */
  @JsonGetter("SerialNumber")
  public String getSerialNumber() {
    return serialNumber == null ? "" : serialNumber;
  }

  /**
   * The board barcode label
   * @param barcodeLabel the value
   */
  @JsonSetter("BarcodeLabel")
  public BoardData setBarcodeLabel(String barcodeLabel) {
    this.barcodeLabel = barcodeLabel;
    return this;
  }

  /**
   * The board barcode label
   *
   * @return never null
   */
  @JsonGetter("BarcodeLabel")
  public String getBarcodeLabel() {
    return barcodeLabel == null ? "" : barcodeLabel;
  }

  /**
   * The board start date
   * @param startDateTime the value
   */
  @JsonSetter("StartDateTime")
  public BoardData setStartDateTime(Date startDateTime) {
    this.startDateTime = startDateTime;
    return this;
  }

  /**
   * The board start date
   * @return StartDateTime
   */
  @JsonGetter("StartDateTime")
  public Date getStartDateTime() {
    return startDateTime;
  }

  /**
   * The board start time
   * @param endDateTime the value
   */
  @JsonSetter("EndDateTime")
  public BoardData setEndDateTime(Date endDateTime) {
    this.endDateTime = endDateTime;
    return this;
  }

  /**
   * The board start time
   * @return EndDateTime
   */
  @JsonGetter("EndDateTime")
  public Date getEndDateTime() {
    return endDateTime;
  }
}
