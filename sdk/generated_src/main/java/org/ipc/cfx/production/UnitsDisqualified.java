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

import org.ipc.cfx.structures.DisqualificationReason;
import org.ipc.cfx.structures.UnitPosition;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent by a process endpoint to identify that a specific production unit is disqualified or scrapped.
            This includes logical disqualification in the case that a unit is abandoned during manufacturing
            
            {
              &quot;Reason&quot;: &quot;DefectiveRepairNotPossible&quot;,
              &quot;Comments&quot;: &quot;The units were accidentally dropped, and irrepairably damaged&quot;,
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
                  &quot;PositionNumber&quot;: 1,
                  &quot;PositionName&quot;: &quot;CIRCUIT2&quot;,
                  &quot;X&quot;: 50.45,
                  &quot;Y&quot;: 80.66,
                  &quot;Rotation&quot;: 90.0,
                  &quot;FlipX&quot;: false,
                  &quot;FlipY&quot;: false
                }
              ]
            }
 * original type: CFX.Production.UnitsDisqualified
 */
public class UnitsDisqualified extends CFXMessage {

  private String primaryIdentifier;
  private String hermesIdentifier;
  private DisqualificationReason reason;
  private String comments;
  private UnitPosition[] units;

  /**
   * The barcode, RFID, etc. that was most recently acquired by the scanner / reader.  If a single production unit is moving through the
            process, this would be the actual unique identifier of that individual unition unit.  However, if multiple production units are moving
            through the process as a group (as in the case of a PCB panel, a fixture, or any sort of carrier), this would be an identifier that
            represents the entire group of units, such as a carrier UID, a PCB panel UID, etc.
   * @param primaryIdentifier the value
   */
  @JsonSetter("PrimaryIdentifier")
  public UnitsDisqualified setPrimaryIdentifier(String primaryIdentifier) {
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
  public UnitsDisqualified setHermesIdentifier(String hermesIdentifier) {
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
   * The reason why these units are being disqualified (scrapped).
   * @param reason the value
   */
  @JsonSetter("Reason")
  public UnitsDisqualified setReason(DisqualificationReason reason) {
    this.reason = reason;
    return this;
  }

  /**
   * The reason why these units are being disqualified (scrapped).
   * @return Reason
   */
  @JsonGetter("Reason")
  public DisqualificationReason getReason() {
    return reason;
  }

  /**
   * Additional free-form comments related to this disqualification.
   * @param comments the value
   */
  @JsonSetter("Comments")
  public UnitsDisqualified setComments(String comments) {
    this.comments = comments;
    return this;
  }

  /**
   * Additional free-form comments related to this disqualification.
   *
   * @return never null
   */
  @JsonGetter("Comments")
  public String getComments() {
    return comments == null ? "" : comments;
  }

  /**
   * List of structures that identify each specific instance of production unit to be disqualified (could be within a carrier or panel).
   * @param units the value
   */
  @JsonSetter("Units")
  public UnitsDisqualified setUnits(UnitPosition[] units) {
    this.units = units;
    return this;
  }

  /**
   * List of structures that identify each specific instance of production unit to be disqualified (could be within a carrier or panel).
   * @return Units
   */
  @JsonGetter("Units")
  public UnitPosition[] getUnits() {
    return units;
  }
}
