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
package org.ipc.cfx.materials.management;

import org.ipc.cfx.structures.ConsumedMaterial;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent by a process endpoint when materials are consumed
            
            {
              "ConsumedMaterials": [
                {
                  "MaterialLocation": {
                    "LocationIdentifier": "3245434554",
                    "LocationName": "SLOT22",
                    "MaterialPackage": {
                      "UniqueIdentifier": "MAT238908348903",
                      "InternalPartNumber": "IPN-1222-55555",
                      "Quantity": 344.0
                    },
                    "CarrierInformation": {
                      "$type": "CFX.Structures.SMTPlacement.SMDTapeFeeder, CFX",
                      "BaseUniqueIdentifier": null,
                      "BaseName": null,
                      "LaneNumber": 1,
                      "TapeWidth": 8.0,
                      "TapePitch": 4.0,
                      "UniqueIdentifier": "234232432424",
                      "Name": "FEEDER2245465"
                    }
                  },
                  "QuantityUsed": 42.0,
                  "QuantitySpoiled": 2.0,
                  "RemainingQuantity": 344.0
                },
                {
                  "MaterialLocation": {
                    "LocationIdentifier": "3245435784",
                    "LocationName": "SLOT28",
                    "MaterialPackage": {
                      "UniqueIdentifier": "MAT238908323434",
                      "InternalPartNumber": "IPN-1222-11111",
                      "Quantity": 258.0
                    },
                    "CarrierInformation": {
                      "$type": "CFX.Structures.SMTPlacement.SMDTapeFeeder, CFX",
                      "BaseUniqueIdentifier": null,
                      "BaseName": null,
                      "LaneNumber": 1,
                      "TapeWidth": 8.0,
                      "TapePitch": 4.0,
                      "UniqueIdentifier": "234232432424",
                      "Name": "FEEDER2245465"
                    }
                  },
                  "QuantityUsed": 88.0,
                  "QuantitySpoiled": 3.0,
                  "RemainingQuantity": 258.0
                }
              ]
            }
 * original type: CFX.Materials.Management.MaterialsConsumed
 */
public class MaterialsConsumed extends CFXMessage {

  private ConsumedMaterial[] consumedMaterials;

  /**
   * A list of one or more materials that have been consumed
   */
  @JsonSetter("ConsumedMaterials")
  public void setConsumedMaterials(ConsumedMaterial[] consumedMaterials) {
    this.consumedMaterials = consumedMaterials;
  }

  /**
   * A list of one or more materials that have been consumed
   */
  @JsonGetter("ConsumedMaterials")
  public ConsumedMaterial[] getConsumedMaterials() {
    return consumedMaterials;
  }
}
