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

import org.ipc.cfx.structures.RequestResult;
import org.ipc.cfx.structures.MaterialLocation;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * A response to a request to a material storage endpoint to obtain a list of all the materials
            currently stored within the endpoint.
            
            {
              "Result": {
                "Result": "Success",
                "ResultCode": 0,
                "Message": "SETUP OK"
              },
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
                  "LocationName": "SLOT50",
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
 * original type: CFX.Materials.Storage.GetLoadedMaterialsResponse
 */
public class GetLoadedMaterialsResponse extends CFXMessage {

  private RequestResult result;
  private MaterialLocation[] materials;

  /**
   * The result of the request
   */
  @JsonSetter("Result")
  public void setResult(RequestResult result) {
    this.result = result;
  }

  /**
   * The result of the request
   */
  @JsonGetter("Result")
  public RequestResult getResult() {
    return result;
  }

  /**
   * A list of the materials stored at the process endpoint, including
            storage location information.
   */
  @JsonSetter("Materials")
  public void setMaterials(MaterialLocation[] materials) {
    this.materials = materials;
  }

  /**
   * A list of the materials stored at the process endpoint, including
            storage location information.
   */
  @JsonGetter("Materials")
  public MaterialLocation[] getMaterials() {
    return materials;
  }
}
