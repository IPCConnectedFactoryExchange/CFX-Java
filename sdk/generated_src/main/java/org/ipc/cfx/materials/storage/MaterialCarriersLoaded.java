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

import org.ipc.cfx.structures.MaterialCarrierLocation;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent when a material carrier (typcially containing 1 or more material packages)
            is loaded at a process endpoint.
            
            {
              &quot;Carriers&quot;: [
                {
                  &quot;LocationIdentifier&quot;: &quot;5555646453&quot;,
                  &quot;LocationName&quot;: null,
                  &quot;CarrierInformation&quot;: {
                    &quot;UniqueIdentifier&quot;: &quot;1233333&quot;,
                    &quot;Name&quot;: null
                  }
                },
                {
                  &quot;LocationIdentifier&quot;: &quot;5555646455&quot;,
                  &quot;LocationName&quot;: &quot;LANEA&quot;,
                  &quot;CarrierInformation&quot;: {
                    &quot;$type&quot;: &quot;CFX.Structures.SMTPlacement.SMDTapeFeeder, CFX&quot;,
                    &quot;BaseUniqueIdentifier&quot;: &quot;123335&quot;,
                    &quot;BaseName&quot;: &quot;MULTILANEFEEDER123335&quot;,
                    &quot;LaneNumber&quot;: 1,
                    &quot;TapeWidth&quot;: 8.0,
                    &quot;TapePitch&quot;: 4.0,
                    &quot;UniqueIdentifier&quot;: &quot;1233335A&quot;,
                    &quot;Name&quot;: &quot;TAPEFEEDER8mm1233335A&quot;
                  }
                },
                {
                  &quot;LocationIdentifier&quot;: &quot;5555646455&quot;,
                  &quot;LocationName&quot;: &quot;LANEB&quot;,
                  &quot;CarrierInformation&quot;: {
                    &quot;$type&quot;: &quot;CFX.Structures.SMTPlacement.SMDTapeFeeder, CFX&quot;,
                    &quot;BaseUniqueIdentifier&quot;: &quot;123335&quot;,
                    &quot;BaseName&quot;: &quot;MULTILANEFEEDER123335&quot;,
                    &quot;LaneNumber&quot;: 2,
                    &quot;TapeWidth&quot;: 8.0,
                    &quot;TapePitch&quot;: 4.0,
                    &quot;UniqueIdentifier&quot;: &quot;1233335B&quot;,
                    &quot;Name&quot;: &quot;TAPEFEEDER8mm1233335B&quot;
                  }
                }
              ]
            }
 * original type: CFX.Materials.Storage.MaterialCarriersLoaded
 */
public class MaterialCarriersLoaded extends CFXMessage {

  private MaterialCarrierLocation[] carriers;

  /**
   * There are two usage cases are available for this message:
                1) Load MaterialCarrier directly to Endpoint 
                   (LocationIdentifier = Endpoint Slot Identifier, CarrierInformation = Carrier to be loaded)
                2) Load MateriialCarrier to another MaterialCarrier
                   (LocationIdentifier = Identifier of new parent carrier, CarrierInformation = Identifier of carrier to be loaded)
   * @param carriers the value
   */
  @JsonSetter("Carriers")
  public MaterialCarriersLoaded setCarriers(MaterialCarrierLocation[] carriers) {
    this.carriers = carriers;
    return this;
  }

  /**
   * There are two usage cases are available for this message:
                1) Load MaterialCarrier directly to Endpoint 
                   (LocationIdentifier = Endpoint Slot Identifier, CarrierInformation = Carrier to be loaded)
                2) Load MateriialCarrier to another MaterialCarrier
                   (LocationIdentifier = Identifier of new parent carrier, CarrierInformation = Identifier of carrier to be loaded)
   * @return Carriers
   */
  @JsonGetter("Carriers")
  public MaterialCarrierLocation[] getCarriers() {
    return carriers;
  }
}
