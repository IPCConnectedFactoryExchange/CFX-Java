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

import java.util.UUID;
import org.ipc.cfx.structures.UnitPosition;
import org.ipc.cfx.structures.StatusResult;
import org.ipc.cfx.structures.Operator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Describes result of a condition step.
 * original type: CFX.Structures.PressInsertion.ConditionResult
 */
public class ConditionResult {

  private String primaryIdentifier;
  private String hermesIdentifier;
  private UUID transactionID;
  private UnitPosition[] units;
  private Condition conditionSequence;
  private StatusResult conditionStatus;
  private Operator conditionOperator;

  /**
   * The barcode, RFID, etc. that was most recently acquired by the scanner / reader.  If a single production unit is moving through the
            process, this would be the actual unique identifier of that individual unition unit.  However, if multiple production units are moving
            through the process as a group (as in the case of a PCB panel, a fixture, or any sort of carrier), this would be an identifier that
            represents the entire group of units, such as a carrier UID, a PCB panel UID, etc.
   * @param primaryIdentifier the value
   */
  @JsonSetter("PrimaryIdentifier")
  public void setPrimaryIdentifier(String primaryIdentifier) {
    this.primaryIdentifier = primaryIdentifier;
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
  public void setHermesIdentifier(String hermesIdentifier) {
    this.hermesIdentifier = hermesIdentifier;
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
  public void setTransactionID(UUID transactionID) {
    this.transactionID = transactionID;
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
   * Data that identifies each specific instance of production unit with a carrier or panel.
   * @param units the value
   */
  @JsonSetter("Units")
  public void setUnits(UnitPosition[] units) {
    this.units = units;
  }

  /**
   * Data that identifies each specific instance of production unit with a carrier or panel.
   * @return Units
   */
  @JsonGetter("Units")
  public UnitPosition[] getUnits() {
    return units;
  }

  /**
   * Describes Condition sequence that was executed
   * @param conditionSequence the value
   */
  @JsonSetter("ConditionSequence")
  public void setConditionSequence(Condition conditionSequence) {
    this.conditionSequence = conditionSequence;
  }

  /**
   * Describes Condition sequence that was executed
   * @return ConditionSequence
   */
  @JsonGetter("ConditionSequence")
  public Condition getConditionSequence() {
    return conditionSequence;
  }

  /**
   * Describes result of the condition sequence
   * @param conditionStatus the value
   */
  @JsonSetter("ConditionStatus")
  public void setConditionStatus(StatusResult conditionStatus) {
    this.conditionStatus = conditionStatus;
  }

  /**
   * Describes result of the condition sequence
   * @return ConditionStatus
   */
  @JsonGetter("ConditionStatus")
  public StatusResult getConditionStatus() {
    return conditionStatus;
  }

  /**
   * Describes the Operator who ran the condition step (optional)
   * @param conditionOperator the value
   */
  @JsonSetter("ConditionOperator")
  public void setConditionOperator(Operator conditionOperator) {
    this.conditionOperator = conditionOperator;
  }

  /**
   * Describes the Operator who ran the condition step (optional)
   * @return ConditionOperator
   */
  @JsonGetter("ConditionOperator")
  public Operator getConditionOperator() {
    return conditionOperator;
  }
}
