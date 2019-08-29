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
package org.ipc.cfx.informationsystem.unitvalidation;

import org.ipc.cfx.structures.ValidationType;
import org.ipc.cfx.structures.UnitPosition;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent from a process endpoint in order to validate the identifier of the next production unit.  
            Process endpoints, where configured, should send this request before allowing the next unit
            to enter the process. Configuration must be provided to identify the endpoint that implements 
            CFX.InformationSystem.UnitValidation Identification and is responsible to provide the response.
            
            {
              "Validations": [
                "UnitRouteValidation",
                "UnitStatusValidation"
              ],
              "PrimaryIdentifier": "CARRIER2342",
              "Units": [
                {
                  "UnitIdentifier": "CARRIER5566",
                  "PositionNumber": 1,
                  "PositionName": "CIRCUIT1",
                  "X": 50.45,
                  "Y": 80.66,
                  "Rotation": 0.0,
                  "FlipX": false,
                  "FlipY": false
                },
                {
                  "UnitIdentifier": "CARRIER5566",
                  "PositionNumber": 2,
                  "PositionName": "CIRCUIT2",
                  "X": 70.45,
                  "Y": 80.66,
                  "Rotation": 90.0,
                  "FlipX": false,
                  "FlipY": false
                }
              ]
            }
 * original type: CFX.InformationSystem.UnitValidation.ValidateUnitsRequest
 */
public class ValidateUnitsRequest extends CFXMessage {

  private ValidationType[] validations;
  private String primaryIdentifier;
  private String hermesIdentifier;
  private UnitPosition[] units;

  /**
   * List of validations to be performed”. Options are: UnitRouteValidation", "UnitStatusValidation"
   */
  @JsonSetter("Validations")
  public void setValidations(ValidationType[] validations) {
    this.validations = validations;
  }

  /**
   * List of validations to be performed”. Options are: UnitRouteValidation", "UnitStatusValidation"
   */
  @JsonGetter("Validations")
  public ValidationType[] getValidations() {
    return validations;
  }

  /**
   * Identification used for the carrier (or the unit itself if no carrier)
   */
  @JsonSetter("PrimaryIdentifier")
  public void setPrimaryIdentifier(String primaryIdentifier) {
    this.primaryIdentifier = primaryIdentifier;
  }

  /**
   * Identification used for the carrier (or the unit itself if no carrier)
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
   * List of structures that identify each specific instance of production unit that arrived (could be within a carrier or panel).
   */
  @JsonSetter("Units")
  public void setUnits(UnitPosition[] units) {
    this.units = units;
  }

  /**
   * List of structures that identify each specific instance of production unit that arrived (could be within a carrier or panel).
   */
  @JsonGetter("Units")
  public UnitPosition[] getUnits() {
    return units;
  }
}
