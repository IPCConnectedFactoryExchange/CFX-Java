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
package org.ipc.cfx.structures;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Describes a single, specific material setup requirement at a particular process endpoint.
            Includes the material / part that must be loaded at the endpoint, along with the 
            specific location where the material must be loaded (where applicable), valid alternate
            part numbers that may be substituted for the primary part, and any applicable
            AML (Approved Manufacturer List) restrictions.
 * original type: CFX.Structures.MaterialSetupRequirement
 */
public class MaterialSetupRequirement {

  private String position;
  private String partNumber;
  private String[] approvedAlternateParts;
  private String[] approvedManufacturerParts;

  /**
   * The position where the required material must be installed on the Endpoint (optional).  
            Where applicable, a dot (&quot;.&quot;) notation should be utilized to designate 
            specific positions.  Examples:  MODULE1.FRONT.Pos23, STAGE2.BANK1.Pos44, etc.
   * @param position the value
   */
  @JsonSetter("Position")
  public MaterialSetupRequirement setPosition(String position) {
    this.position = position;
    return this;
  }

  /**
   * The position where the required material must be installed on the Endpoint (optional).  
            Where applicable, a dot (&quot;.&quot;) notation should be utilized to designate 
            specific positions.  Examples:  MODULE1.FRONT.Pos23, STAGE2.BANK1.Pos44, etc.
   *
   * @return never null
   */
  @JsonGetter("Position")
  public String getPosition() {
    return position == null ? "" : position;
  }

  /**
   * The internal part number of the part that must be loaded at this position.
   * @param partNumber the value
   */
  @JsonSetter("PartNumber")
  public MaterialSetupRequirement setPartNumber(String partNumber) {
    this.partNumber = partNumber;
    return this;
  }

  /**
   * The internal part number of the part that must be loaded at this position.
   *
   * @return never null
   */
  @JsonGetter("PartNumber")
  public String getPartNumber() {
    return partNumber == null ? "" : partNumber;
  }

  /**
   * An optional list of approved alternate parts (internal part numbers) that may be substituted 
            for the primary part.
   * @param approvedAlternateParts the value
   */
  @JsonSetter("ApprovedAlternateParts")
  public MaterialSetupRequirement setApprovedAlternateParts(String[] approvedAlternateParts) {
    this.approvedAlternateParts = approvedAlternateParts;
    return this;
  }

  /**
   * An optional list of approved alternate parts (internal part numbers) that may be substituted 
            for the primary part.
   * @return ApprovedAlternateParts
   */
  @JsonGetter("ApprovedAlternateParts")
  public String[] getApprovedAlternateParts() {
    return approvedAlternateParts;
  }

  /**
   * An optional list of specific manufacturer part numbers that must be utilzed.  When specified,
            a part will only be acceptable if both its internal part number matches the PartNumber property (or Alternates), 
            AND its manufacturer part number matches one of the parts specified in the ApprovedManufacturerParts property.
   * @param approvedManufacturerParts the value
   */
  @JsonSetter("ApprovedManufacturerParts")
  public MaterialSetupRequirement setApprovedManufacturerParts(String[] approvedManufacturerParts) {
    this.approvedManufacturerParts = approvedManufacturerParts;
    return this;
  }

  /**
   * An optional list of specific manufacturer part numbers that must be utilzed.  When specified,
            a part will only be acceptable if both its internal part number matches the PartNumber property (or Alternates), 
            AND its manufacturer part number matches one of the parts specified in the ApprovedManufacturerParts property.
   * @return ApprovedManufacturerParts
   */
  @JsonGetter("ApprovedManufacturerParts")
  public String[] getApprovedManufacturerParts() {
    return approvedManufacturerParts;
  }
}
