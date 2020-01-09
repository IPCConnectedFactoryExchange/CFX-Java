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
              &quot;Validations&quot;: [
                &quot;UnitRouteValidation&quot;,
                &quot;UnitStatusValidation&quot;
              ],
              &quot;PrimaryIdentifier&quot;: &quot;CARRIER2342&quot;,
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
 * original type: CFX.InformationSystem.UnitValidation.ValidateUnitsRequest
 */
public class ValidateUnitsRequest extends CFXMessage {

  private ValidationType[] validations;
  private String primaryIdentifier;
  private String hermesIdentifier;
  private UnitPosition[] units;

  /**
   * List of validations to be performed”. Options are: UnitRouteValidation&quot;, &quot;UnitStatusValidation&quot;
   * @param validations the value
   */
  @JsonSetter("Validations")
  public ValidateUnitsRequest setValidations(ValidationType[] validations) {
    this.validations = validations;
    return this;
  }

  /**
   * List of validations to be performed”. Options are: UnitRouteValidation&quot;, &quot;UnitStatusValidation&quot;
   * @return Validations
   */
  @JsonGetter("Validations")
  public ValidationType[] getValidations() {
    return validations;
  }

  /**
   * Identification used for the carrier (or the unit itself if no carrier)
   * @param primaryIdentifier the value
   */
  @JsonSetter("PrimaryIdentifier")
  public ValidateUnitsRequest setPrimaryIdentifier(String primaryIdentifier) {
    this.primaryIdentifier = primaryIdentifier;
    return this;
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
   * @param hermesIdentifier the value
   */
  @JsonSetter("HermesIdentifier")
  public ValidateUnitsRequest setHermesIdentifier(String hermesIdentifier) {
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
   * List of structures that identify each specific instance of production unit that arrived (could be within a carrier or panel).
   * @param units the value
   */
  @JsonSetter("Units")
  public ValidateUnitsRequest setUnits(UnitPosition[] units) {
    this.units = units;
    return this;
  }

  /**
   * List of structures that identify each specific instance of production unit that arrived (could be within a carrier or panel).
   * @return Units
   */
  @JsonGetter("Units")
  public UnitPosition[] getUnits() {
    return units;
  }
}
