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
package org.ipc.cfx.materials.storage;

import org.ipc.cfx.structures.StationSetupRequirements;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Request to a process endpoint to validate that the currently loaded materials
            comply with the setup requirements supplied in this request.
            
            {
              "SetupRequirements": {
                "Lane": null,
                "Stage": null,
                "SetupName": "COMMONSETUP1",
                "MaterialSetupRequirements": [
                  {
                    "Position": "B1.F.45",
                    "PartNumber": "IPN1123",
                    "ApprovedAlternateParts": [
                      "IPN2343",
                      "IPN3432"
                    ],
                    "ApprovedManufacturerParts": [
                      "MOT4329",
                      "SAM5566"
                    ]
                  },
                  {
                    "Position": "B1.F.47",
                    "PartNumber": "IPN1124",
                    "ApprovedAlternateParts": [
                      "IPN3344",
                      "IPN3376"
                    ],
                    "ApprovedManufacturerParts": [
                      "JP55443",
                      "TX554323"
                    ]
                  }
                ],
                "ToolSetupRequirements": [
                  {
                    "Position": "MODULE1.BEAM1",
                    "PartNumber": "HEADTYPE5566",
                    "ToolIdentifier": null
                  },
                  {
                    "Position": "MODULE1.BEAM2",
                    "PartNumber": "HEADTYPE5577",
                    "ToolIdentifier": null
                  }
                ]
              }
            }
 * original type: CFX.Materials.Storage.ValidateStationSetupRequest
 */
public class ValidateStationSetupRequest extends CFXMessage {

  private StationSetupRequirements setupRequirements;

  /**
   * The setup requirements to be validated
   */
  @JsonSetter("SetupRequirements")
  public void setSetupRequirements(StationSetupRequirements setupRequirements) {
    this.setupRequirements = setupRequirements;
  }

  /**
   * The setup requirements to be validated
   */
  @JsonGetter("SetupRequirements")
  public StationSetupRequirements getSetupRequirements() {
    return setupRequirements;
  }
}
