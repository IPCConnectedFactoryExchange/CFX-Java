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
package org.ipc.cfx.production;

import java.util.UUID;
import org.ipc.cfx.structures.UnitPosition;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent by a process endpoint when the work-cycle for a unit or group of units starts
            
            {
              &quot;TransactionID&quot;: &quot;2c24590d-39c5-4039-96a5-91900cecedfa&quot;,
              &quot;Lane&quot;: 1,
              &quot;UnitCount&quot;: 2,
              &quot;Units&quot;: [
                {
                  &quot;UnitIdentifier&quot;: &quot;CARRIER5566&quot;,
                  &quot;PositionNumber&quot;: 1,
                  &quot;PositionName&quot;: &quot;CIRCUIT1&quot;,
                  &quot;X&quot;: 50.45,
                  &quot;Y&quot;: 80.66,
                  &quot;Rotation&quot;: 0.0,
                  &quot;FlipX&quot;: false,
                  &quot;FlipY&quot;: false
                },
                {
                  &quot;UnitIdentifier&quot;: &quot;CARRIER5566&quot;,
                  &quot;PositionNumber&quot;: 2,
                  &quot;PositionName&quot;: &quot;CIRCUIT2&quot;,
                  &quot;X&quot;: 70.45,
                  &quot;Y&quot;: 80.66,
                  &quot;Rotation&quot;: 90.0,
                  &quot;FlipX&quot;: false,
                  &quot;FlipY&quot;: false
                }
              ]
            }
 * original type: CFX.Production.WorkStarted
 */
public class WorkStarted extends CFXMessage {

  private String primaryIdentifier;
  private String hermesIdentifier;
  private UUID transactionID;
  private Integer lane;
  private int unitCount;
  private UnitPosition[] units;

  /**
   * The barcode, RFID, etc. that was most recently acquired by the scanner / reader.  If a single production unit is moving through the
            process, this would be the actual unique identifier of that individual unition unit.  However, if multiple production units are moving
            through the process as a group (as in the case of a PCB panel, a fixture, or any sort of carrier), this would be an identifier that
            represents the entire group of units, such as a carrier UID, a PCB panel UID, etc.
   * @param primaryIdentifier the value
   */
  @JsonSetter("PrimaryIdentifier")
  public WorkStarted setPrimaryIdentifier(String primaryIdentifier) {
    this.primaryIdentifier = primaryIdentifier;
    return this;
  }

  /**
   * The barcode, RFID, etc. that was most recently acquired by the scanner / reader.  If a single production unit is moving through the
            process, this would be the actual unique identifier of that individual unition unit.  However, if multiple production units are moving
            through the process as a group (as in the case of a PCB panel, a fixture, or any sort of carrier), this would be an identifier that
            represents the entire group of units, such as a carrier UID, a PCB panel UID, etc.
   *
   * @return never null
   */
  @JsonGetter("PrimaryIdentifier")
  public String getPrimaryIdentifier() {
    return primaryIdentifier == null ? "" : primaryIdentifier;
  }

  /**
   * The Hermes BoardId of the carrier, a PCB panel or single production unit. If a single production unit is moving through the
            process, this would be the actual unique identifier of that individual unition unit.  However, if multiple production units are moving
            through the process as a group (as in the case of a PCB panel, a fixture, or any sort of carrier), this would be an identifier that
            represents the entire group of units, such as a carrier UID, a PCB panel UID, etc.
            HermesIdentifier will be transfered between all machines which support Hermes. The PrimaryIdentifier is containing a barcode information.
            Both can be transferred.
            
            Espcially when the line does not support the Hermes standard in the hole line, the Hermes Identifier can be unique only in the a part
            of the line. The Primary Identifier can be used to correlate the parts of hermes sublines to correlate this data as well.
   * @param hermesIdentifier the value
   */
  @JsonSetter("HermesIdentifier")
  public WorkStarted setHermesIdentifier(String hermesIdentifier) {
    this.hermesIdentifier = hermesIdentifier;
    return this;
  }

  /**
   * The Hermes BoardId of the carrier, a PCB panel or single production unit. If a single production unit is moving through the
            process, this would be the actual unique identifier of that individual unition unit.  However, if multiple production units are moving
            through the process as a group (as in the case of a PCB panel, a fixture, or any sort of carrier), this would be an identifier that
            represents the entire group of units, such as a carrier UID, a PCB panel UID, etc.
            HermesIdentifier will be transfered between all machines which support Hermes. The PrimaryIdentifier is containing a barcode information.
            Both can be transferred.
            
            Espcially when the line does not support the Hermes standard in the hole line, the Hermes Identifier can be unique only in the a part
            of the line. The Primary Identifier can be used to correlate the parts of hermes sublines to correlate this data as well.
   *
   * @return never null
   */
  @JsonGetter("HermesIdentifier")
  public String getHermesIdentifier() {
    return hermesIdentifier == null ? "" : hermesIdentifier;
  }

  /**
   * Transaction ID used to attach events and data during subsequent processing, until WorkCompleted
   * @param transactionID the value
   */
  @JsonSetter("TransactionID")
  public WorkStarted setTransactionID(UUID transactionID) {
    this.transactionID = transactionID;
    return this;
  }

  /**
   * Transaction ID used to attach events and data during subsequent processing, until WorkCompleted
   * @return TransactionID
   */
  @JsonGetter("TransactionID")
  public UUID getTransactionID() {
    return transactionID;
  }

  /**
   * Lane identifier.  Null if no specific lane
   * @param lane the value
   */
  @JsonSetter("Lane")
  public WorkStarted setLane(Integer lane) {
    this.lane = lane;
    return this;
  }

  /**
   * Lane identifier.  Null if no specific lane
   * @return Lane
   */
  @JsonGetter("Lane")
  public Integer getLane() {
    return lane;
  }

  /**
   * The number of individual production units associated with this transaction.  May be more than 1 in the case of a carrier or panel of multiple PCB’s.
   * @param unitCount the value
   */
  @JsonSetter("UnitCount")
  public WorkStarted setUnitCount(int unitCount) {
    this.unitCount = unitCount;
    return this;
  }

  /**
   * The number of individual production units associated with this transaction.  May be more than 1 in the case of a carrier or panel of multiple PCB’s.
   * @return UnitCount
   */
  @JsonGetter("UnitCount")
  public int getUnitCount() {
    return unitCount;
  }

  /**
   * Data that identifies each specific instance of production unit with a carrier or panel.
   * @param units the value
   */
  @JsonSetter("Units")
  public WorkStarted setUnits(UnitPosition[] units) {
    this.units = units;
    return this;
  }

  /**
   * Data that identifies each specific instance of production unit with a carrier or panel.
   * @return Units
   */
  @JsonGetter("Units")
  public UnitPosition[] getUnits() {
    return units;
  }
}
