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
 * created: 30.08.2019 09:11:09 by frankp
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
              &quot;Result&quot;: {
                &quot;Result&quot;: &quot;Success&quot;,
                &quot;ResultCode&quot;: 0,
                &quot;Message&quot;: &quot;SETUP OK&quot;
              },
              &quot;Materials&quot;: [
                {
                  &quot;LocationIdentifier&quot;: &quot;5555646453&quot;,
                  &quot;LocationName&quot;: &quot;SLOT45&quot;,
                  &quot;MaterialPackage&quot;: {
                    &quot;UniqueIdentifier&quot;: &quot;MAT4566556456&quot;,
                    &quot;InternalPartNumber&quot;: &quot;IPN47788&quot;,
                    &quot;Quantity&quot;: 887.0
                  },
                  &quot;CarrierInformation&quot;: {
                    &quot;UniqueIdentifier&quot;: &quot;1233333&quot;,
                    &quot;Name&quot;: null
                  }
                },
                {
                  &quot;LocationIdentifier&quot;: &quot;5555646454&quot;,
                  &quot;LocationName&quot;: &quot;SLOT50&quot;,
                  &quot;MaterialPackage&quot;: {
                    &quot;UniqueIdentifier&quot;: &quot;MAT4566554543&quot;,
                    &quot;InternalPartNumber&quot;: &quot;IPN48899&quot;,
                    &quot;Quantity&quot;: 748.0
                  },
                  &quot;CarrierInformation&quot;: {
                    &quot;$type&quot;: &quot;CFX.Structures.SMTPlacement.SMDTapeFeeder, CFX&quot;,
                    &quot;BaseUniqueIdentifier&quot;: &quot;123334&quot;,
                    &quot;BaseName&quot;: null,
                    &quot;LaneNumber&quot;: 1,
                    &quot;TapeWidth&quot;: 8.0,
                    &quot;TapePitch&quot;: 8.0,
                    &quot;UniqueIdentifier&quot;: &quot;1233334&quot;,
                    &quot;Name&quot;: &quot;TAPEFEEDER8mm1233334&quot;
                  }
                },
                {
                  &quot;LocationIdentifier&quot;: &quot;5555646457&quot;,
                  &quot;LocationName&quot;: &quot;92.1&quot;,
                  &quot;MaterialPackage&quot;: {
                    &quot;UniqueIdentifier&quot;: &quot;MAT4566589856&quot;,
                    &quot;InternalPartNumber&quot;: &quot;IPN45577&quot;,
                    &quot;Quantity&quot;: 151.0
                  },
                  &quot;CarrierInformation&quot;: {
                    &quot;$type&quot;: &quot;CFX.Structures.SMTPlacement.SMDTrayFeeder, CFX&quot;,
                    &quot;CellDimensionX&quot;: 17.0,
                    &quot;CellDimensionY&quot;: 17.0,
                    &quot;CellCountX&quot;: 8,
                    &quot;CellCountY&quot;: 3,
                    &quot;CellPitchX&quot;: 0.0,
                    &quot;CellPitchY&quot;: 0.0,
                    &quot;UniqueIdentifier&quot;: &quot;1233337&quot;,
                    &quot;Name&quot;: &quot;MATRIXTRAY1233337&quot;
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
   * @param result the value
   */
  @JsonSetter("Result")
  public void setResult(RequestResult result) {
    this.result = result;
  }

  /**
   * The result of the request
   * @return Result
   */
  @JsonGetter("Result")
  public RequestResult getResult() {
    return result;
  }

  /**
   * A list of the materials stored at the process endpoint, including
            storage location information.
   * @param materials the value
   */
  @JsonSetter("Materials")
  public void setMaterials(MaterialLocation[] materials) {
    this.materials = materials;
  }

  /**
   * A list of the materials stored at the process endpoint, including
            storage location information.
   * @return Materials
   */
  @JsonGetter("Materials")
  public MaterialLocation[] getMaterials() {
    return materials;
  }
}
