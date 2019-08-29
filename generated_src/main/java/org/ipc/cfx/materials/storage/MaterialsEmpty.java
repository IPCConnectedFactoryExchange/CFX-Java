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
 * Sent when one or more material packages stored at a particular location
            become fully exhausted / depleted.
            
            {
              "EmptyMaterials": [
                {
                  "LocationIdentifier": "3245434554",
                  "LocationName": "SLOT22",
                  "MaterialPackage": {
                    "UniqueIdentifier": "MAT238908348903",
                    "InternalPartNumber": "IPN-1222-55555",
                    "Quantity": 0.0
                  },
                  "CarrierInformation": {
                    "$type": "CFX.Structures.SMTPlacement.SMDTapeFeeder, CFX",
                    "BaseUniqueIdentifier": null,
                    "BaseName": null,
                    "LaneNumber": 1,
                    "TapeWidth": 8.0,
                    "TapePitch": 8.0,
                    "UniqueIdentifier": "234232432424",
                    "Name": "FEEDER2245465"
                  }
                },
                {
                  "LocationIdentifier": "3245435784",
                  "LocationName": "SLOT28",
                  "MaterialPackage": {
                    "UniqueIdentifier": "MAT238908323434",
                    "InternalPartNumber": "IPN-1222-11111",
                    "Quantity": 0.0
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
                }
              ]
            }
 * original type: CFX.Materials.Storage.MaterialsEmpty
 */
public class MaterialsEmpty extends CFXMessage {

  private MaterialLocation[] emptyMaterials;

  /**
   * A list of the material locations where the depleted material packages are stored or loaded
            at the endpoint.  Also includes the material package that is loaded at the location (if known).
            For example, if the endpoint is an SMT placement machine, the location identifies 
            the feeder slot/position where the depleted material package is loaded.
   */
  @JsonSetter("EmptyMaterials")
  public void setEmptyMaterials(MaterialLocation[] emptyMaterials) {
    this.emptyMaterials = emptyMaterials;
  }

  /**
   * A list of the material locations where the depleted material packages are stored or loaded
            at the endpoint.  Also includes the material package that is loaded at the location (if known).
            For example, if the endpoint is an SMT placement machine, the location identifies 
            the feeder slot/position where the depleted material package is loaded.
   */
  @JsonGetter("EmptyMaterials")
  public MaterialLocation[] getEmptyMaterials() {
    return emptyMaterials;
  }
}
