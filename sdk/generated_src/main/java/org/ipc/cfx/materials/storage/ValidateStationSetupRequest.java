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
package org.ipc.cfx.materials.storage;

import org.ipc.cfx.structures.StationSetupRequirements;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Request to a process endpoint to validate that the currently loaded materials
            comply with the setup requirements supplied in this request.
            
            {
              &quot;SetupRequirements&quot;: {
                &quot;Lane&quot;: null,
                &quot;Stage&quot;: null,
                &quot;SetupName&quot;: &quot;COMMONSETUP1&quot;,
                &quot;MaterialSetupRequirements&quot;: [
                  {
                    &quot;Position&quot;: &quot;B1.F.45&quot;,
                    &quot;PartNumber&quot;: &quot;IPN1123&quot;,
                    &quot;ApprovedAlternateParts&quot;: [
                      &quot;IPN2343&quot;,
                      &quot;IPN3432&quot;
                    ],
                    &quot;ApprovedManufacturerParts&quot;: [
                      &quot;MOT4329&quot;,
                      &quot;SAM5566&quot;
                    ]
                  },
                  {
                    &quot;Position&quot;: &quot;B1.F.47&quot;,
                    &quot;PartNumber&quot;: &quot;IPN1124&quot;,
                    &quot;ApprovedAlternateParts&quot;: [
                      &quot;IPN3344&quot;,
                      &quot;IPN3376&quot;
                    ],
                    &quot;ApprovedManufacturerParts&quot;: [
                      &quot;JP55443&quot;,
                      &quot;TX554323&quot;
                    ]
                  }
                ],
                &quot;ToolSetupRequirements&quot;: [
                  {
                    &quot;Position&quot;: &quot;MODULE1.BEAM1&quot;,
                    &quot;PartNumber&quot;: &quot;HEADTYPE5566&quot;,
                    &quot;ToolIdentifier&quot;: null
                  },
                  {
                    &quot;Position&quot;: &quot;MODULE1.BEAM2&quot;,
                    &quot;PartNumber&quot;: &quot;HEADTYPE5577&quot;,
                    &quot;ToolIdentifier&quot;: null
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
   * @param setupRequirements the value
   */
  @JsonSetter("SetupRequirements")
  public ValidateStationSetupRequest setSetupRequirements(StationSetupRequirements setupRequirements) {
    this.setupRequirements = setupRequirements;
    return this;
  }

  /**
   * The setup requirements to be validated
   * @return SetupRequirements
   */
  @JsonGetter("SetupRequirements")
  public StationSetupRequirements getSetupRequirements() {
    return setupRequirements;
  }
}
