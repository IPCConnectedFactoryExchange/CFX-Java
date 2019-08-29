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

import org.ipc.cfx.structures.MaterialLocation;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent when a material package (potentially contained within a material carrier)
            is loaded at a process endpoint.
            
            {
              "Materials": [
                {
                  "LocationIdentifier": "5555646453",
                  "LocationName": "SLOT45",
                  "MaterialPackage": {
                    "UniqueIdentifier": "MAT4566556456",
                    "InternalPartNumber": "IPN47788",
                    "Quantity": 887.0
                  },
                  "CarrierInformation": {
                    "UniqueIdentifier": "1233333",
                    "Name": null
                  }
                },
                {
                  "LocationIdentifier": "5555646454",
                  "LocationName": "SLOT44",
                  "MaterialPackage": {
                    "UniqueIdentifier": "MAT4566554543",
                    "InternalPartNumber": "IPN48899",
                    "Quantity": 748.0
                  },
                  "CarrierInformation": {
                    "$type": "CFX.Structures.SMTPlacement.SMDTapeFeeder, CFX",
                    "BaseUniqueIdentifier": "123334",
                    "BaseName": null,
                    "LaneNumber": 1,
                    "TapeWidth": 8.0,
                    "TapePitch": 8.0,
                    "UniqueIdentifier": "1233334",
                    "Name": "TAPEFEEDER8mm1233334"
                  }
                },
                {
                  "LocationIdentifier": "5555646455",
                  "LocationName": "SLOT45",
                  "MaterialPackage": {
                    "UniqueIdentifier": "MAT4566553421",
                    "InternalPartNumber": "IPN45577",
                    "Quantity": 151.0
                  },
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
                  "LocationName": "SLOT45",
                  "MaterialPackage": {
                    "UniqueIdentifier": "MAT4566555547",
                    "InternalPartNumber": "IPN45577",
                    "Quantity": 151.0
                  },
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
                },
                {
                  "LocationIdentifier": "5555646456",
                  "LocationName": "SLOT46",
                  "MaterialPackage": {
                    "UniqueIdentifier": "MAT4566588751",
                    "InternalPartNumber": "IPN45577",
                    "Quantity": 151.0
                  },
                  "CarrierInformation": {
                    "$type": "CFX.Structures.SMTPlacement.SMDTubeFeeder, CFX",
                    "BaseUniqueIdentifier": "123336",
                    "BaseName": null,
                    "LaneNumber": 0,
                    "Width": 12.0,
                    "Pitch": 24.0,
                    "UniqueIdentifier": "1233336",
                    "Name": "TUBE1233336"
                  }
                },
                {
                  "LocationIdentifier": "5555646457",
                  "LocationName": "92.1",
                  "MaterialPackage": {
                    "UniqueIdentifier": "MAT4566589856",
                    "InternalPartNumber": "IPN45577",
                    "Quantity": 151.0
                  },
                  "CarrierInformation": {
                    "$type": "CFX.Structures.SMTPlacement.SMDTrayFeeder, CFX",
                    "CellDimensionX": 17.0,
                    "CellDimensionY": 17.0,
                    "CellCountX": 8,
                    "CellCountY": 3,
                    "CellPitchX": 0.0,
                    "CellPitchY": 0.0,
                    "UniqueIdentifier": "1233337",
                    "Name": "MATRIXTRAY1233337"
                  }
                }
              ]
            }
 * original type: CFX.Materials.Storage.MaterialsLoaded
 */
public class MaterialsLoaded extends CFXMessage {

  private MaterialLocation[] materials;

  /**
   * There are three usage cases are available for this message:
                1) Load MaterialPackage directly to Endpoint 
                   (LocationIdentifier = Endpoint Slot Identifier, CarrierInformation = null)
                2) Load MaterialPackage to MaterialCarrier
                   (LocationIdentifier = null, CarrierInformation = Identifier of carrier to be loaded)
                3) Load MaterialPackage to MaterialCarrier AND Load MaterialCarrier to Endpoint
                   (LocationIdentifier = Endpoint Slot Identifier, CarrierInformation = Identifier of carrier to be loaded)
   */
  @JsonSetter("Materials")
  public void setMaterials(MaterialLocation[] materials) {
    this.materials = materials;
  }

  /**
   * There are three usage cases are available for this message:
                1) Load MaterialPackage directly to Endpoint 
                   (LocationIdentifier = Endpoint Slot Identifier, CarrierInformation = null)
                2) Load MaterialPackage to MaterialCarrier
                   (LocationIdentifier = null, CarrierInformation = Identifier of carrier to be loaded)
                3) Load MaterialPackage to MaterialCarrier AND Load MaterialCarrier to Endpoint
                   (LocationIdentifier = Endpoint Slot Identifier, CarrierInformation = Identifier of carrier to be loaded)
   */
  @JsonGetter("Materials")
  public MaterialLocation[] getMaterials() {
    return materials;
  }
}
