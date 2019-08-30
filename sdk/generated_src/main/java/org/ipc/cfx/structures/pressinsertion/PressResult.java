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
package org.ipc.cfx.structures.pressinsertion;

import org.ipc.cfx.structures.Operator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Describes result of a connector press.
 * original type: CFX.Structures.PressInsertion.PressResult
 */
public class PressResult {

  private BoardData pressBoardData;
  private Connector pressConnector;
  private PressData data;
  private ConnectorCoordinates connectorLocation;
  private int sequenceNumber;
  private String machineID;
  private Operator pressOperator;

  /**
   * Data for board currently being processed
   * @param pressBoardData the value
   */
  @JsonSetter("PressBoardData")
  public void setPressBoardData(BoardData pressBoardData) {
    this.pressBoardData = pressBoardData;
  }

  /**
   * Data for board currently being processed
   * @return PressBoardData
   */
  @JsonGetter("PressBoardData")
  public BoardData getPressBoardData() {
    return pressBoardData;
  }

  /**
   * Connector that was pressed
   * @param pressConnector the value
   */
  @JsonSetter("PressConnector")
  public void setPressConnector(Connector pressConnector) {
    this.pressConnector = pressConnector;
  }

  /**
   * Connector that was pressed
   * @return PressConnector
   */
  @JsonGetter("PressConnector")
  public Connector getPressConnector() {
    return pressConnector;
  }

  /**
   * Data and status information about the results pressing cycle
   * @param data the value
   */
  @JsonSetter("Data")
  public void setData(PressData data) {
    this.data = data;
  }

  /**
   * Data and status information about the results pressing cycle
   * @return Data
   */
  @JsonGetter("Data")
  public PressData getData() {
    return data;
  }

  /**
   * Location on PCB of connector that was pressed
   * @param connectorLocation the value
   */
  @JsonSetter("ConnectorLocation")
  public void setConnectorLocation(ConnectorCoordinates connectorLocation) {
    this.connectorLocation = connectorLocation;
  }

  /**
   * Location on PCB of connector that was pressed
   * @return ConnectorLocation
   */
  @JsonGetter("ConnectorLocation")
  public ConnectorCoordinates getConnectorLocation() {
    return connectorLocation;
  }

  /**
   * Integer indicating where in the recipe sequence the press occurs
   * @param sequenceNumber the value
   */
  @JsonSetter("SequenceNumber")
  public void setSequenceNumber(int sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }

  /**
   * Integer indicating where in the recipe sequence the press occurs
   * @return SequenceNumber
   */
  @JsonGetter("SequenceNumber")
  public int getSequenceNumber() {
    return sequenceNumber;
  }

  /**
   * The ID of the Machine used to complete the press
   * @param machineID the value
   */
  @JsonSetter("MachineID")
  public void setMachineID(String machineID) {
    this.machineID = machineID;
  }

  /**
   * The ID of the Machine used to complete the press
   *
   * @return never null
   */
  @JsonGetter("MachineID")
  public String getMachineID() {
    return machineID == null ? "" : machineID;
  }

  /**
   * Describes the Operator who ran the press cycle (optional)
   * @param pressOperator the value
   */
  @JsonSetter("PressOperator")
  public void setPressOperator(Operator pressOperator) {
    this.pressOperator = pressOperator;
  }

  /**
   * Describes the Operator who ran the press cycle (optional)
   * @return PressOperator
   */
  @JsonGetter("PressOperator")
  public Operator getPressOperator() {
    return pressOperator;
  }
}
