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

import org.ipc.cfx.structures.WorkOrderIdentifier;
import org.ipc.cfx.structures.UnitPosition;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent when one or more production units are first introduced into the production process flow. 
            Unit initialization most often occurs when new production units are first labeled with unique identifiers (or laser marked)
            
            {
              &quot;WorkOrderIdentifier&quot;: {
                &quot;WorkOrderId&quot;: &quot;WO45648798&quot;,
                &quot;Batch&quot;: &quot;BATCH45648798-1&quot;
              },
              &quot;Units&quot;: [
                {
                  &quot;UnitIdentifier&quot;: &quot;UNIT5566687&quot;,
                  &quot;PositionNumber&quot;: 1,
                  &quot;PositionName&quot;: &quot;CIRCUIT1&quot;,
                  &quot;X&quot;: 50.45,
                  &quot;Y&quot;: 80.66,
                  &quot;Rotation&quot;: 0.0,
                  &quot;FlipX&quot;: false,
                  &quot;FlipY&quot;: false
                },
                {
                  &quot;UnitIdentifier&quot;: &quot;UNIT5566688&quot;,
                  &quot;PositionNumber&quot;: 2,
                  &quot;PositionName&quot;: &quot;CIRCUIT2&quot;,
                  &quot;X&quot;: 50.45,
                  &quot;Y&quot;: 80.66,
                  &quot;Rotation&quot;: 90.0,
                  &quot;FlipX&quot;: false,
                  &quot;FlipY&quot;: false
                }
              ]
            }
 * original type: CFX.Production.UnitsInitialized
 */
public class UnitsInitialized extends CFXMessage {

  private String primaryIdentifier;
  private String hermesIdentifier;
  private WorkOrderIdentifier workOrderIdentifier;
  private UnitPosition[] units;

  /**
   * The barcode, RFID, etc. that was most recently acquired by the scanner / reader.  If a single production unit is moving through the
            process, this would be the actual unique identifier of that individual unition unit.  However, if multiple production units are moving
            through the process as a group (as in the case of a PCB panel, a fixture, or any sort of carrier), this would be an identifier that
            represents the entire group of units, such as a carrier UID, a PCB panel UID, etc.
   * @param primaryIdentifier the value
   */
  @JsonSetter("PrimaryIdentifier")
  public UnitsInitialized setPrimaryIdentifier(String primaryIdentifier) {
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
  public UnitsInitialized setHermesIdentifier(String hermesIdentifier) {
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
   * The Work Order (and Batch, if applicable) to which these new production units are associated.
   * @param workOrderIdentifier the value
   */
  @JsonSetter("WorkOrderIdentifier")
  public UnitsInitialized setWorkOrderIdentifier(WorkOrderIdentifier workOrderIdentifier) {
    this.workOrderIdentifier = workOrderIdentifier;
    return this;
  }

  /**
   * The Work Order (and Batch, if applicable) to which these new production units are associated.
   * @return WorkOrderIdentifier
   */
  @JsonGetter("WorkOrderIdentifier")
  public WorkOrderIdentifier getWorkOrderIdentifier() {
    return workOrderIdentifier;
  }

  /**
   * A list of structures that identify each specific instance of production unit that have been initialized.
            Could be individual units, or within a carrier, panel, etc.
   * @param units the value
   */
  @JsonSetter("Units")
  public UnitsInitialized setUnits(UnitPosition[] units) {
    this.units = units;
    return this;
  }

  /**
   * A list of structures that identify each specific instance of production unit that have been initialized.
            Could be individual units, or within a carrier, panel, etc.
   * @return Units
   */
  @JsonGetter("Units")
  public UnitPosition[] getUnits() {
    return units;
  }
}
