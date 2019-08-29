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

import org.ipc.cfx.structures.MaterialCarrierLocation;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent when a material carrier (typcially containing 1 or more material packages)
            is loaded at a process endpoint.
            
            {
              "Carriers": [
                {
                  "LocationIdentifier": "5555646453",
                  "LocationName": null,
                  "CarrierInformation": {
                    "UniqueIdentifier": "1233333",
                    "Name": null
                  }
                },
                {
                  "LocationIdentifier": "5555646455",
                  "LocationName": "LANEA",
                  "CarrierInformation": {
                    "$type": "CFX.Structures.SMTPlacement.SMDTapeFeeder, CFX",
                    "BaseUniqueIdentifier": "123335",
                    "BaseName": "MULTILANEFEEDER123335",
                    "LaneNumber": 1,
                    "TapeWidth": 8.0,
                    "TapePitch": 4.0,
                    "UniqueIdentifier": "1233335A",
                    "Name": "TAPEFEEDER8mm1233335A"
                  }
                },
                {
                  "LocationIdentifier": "5555646455",
                  "LocationName": "LANEB",
                  "CarrierInformation": {
                    "$type": "CFX.Structures.SMTPlacement.SMDTapeFeeder, CFX",
                    "BaseUniqueIdentifier": "123335",
                    "BaseName": "MULTILANEFEEDER123335",
                    "LaneNumber": 2,
                    "TapeWidth": 8.0,
                    "TapePitch": 4.0,
                    "UniqueIdentifier": "1233335B",
                    "Name": "TAPEFEEDER8mm1233335B"
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
   */
  @JsonSetter("Carriers")
  public void setCarriers(MaterialCarrierLocation[] carriers) {
    this.carriers = carriers;
  }

  /**
   * There are two usage cases are available for this message:
                1) Load MaterialCarrier directly to Endpoint 
                   (LocationIdentifier = Endpoint Slot Identifier, CarrierInformation = Carrier to be loaded)
                2) Load MateriialCarrier to another MaterialCarrier
                   (LocationIdentifier = Identifier of new parent carrier, CarrierInformation = Identifier of carrier to be loaded)
   */
  @JsonGetter("Carriers")
  public MaterialCarrierLocation[] getCarriers() {
    return carriers;
  }
}
