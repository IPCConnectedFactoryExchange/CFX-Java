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

import org.ipc.cfx.structures.MaterialLocation;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent when a material package (potentially contained within a material carrier)
            is loaded at a process endpoint.
            
            {
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
                  &quot;LocationName&quot;: &quot;SLOT44&quot;,
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
                  &quot;LocationIdentifier&quot;: &quot;5555646455&quot;,
                  &quot;LocationName&quot;: &quot;SLOT45&quot;,
                  &quot;MaterialPackage&quot;: {
                    &quot;UniqueIdentifier&quot;: &quot;MAT4566553421&quot;,
                    &quot;InternalPartNumber&quot;: &quot;IPN45577&quot;,
                    &quot;Quantity&quot;: 151.0
                  },
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
                  &quot;LocationName&quot;: &quot;SLOT45&quot;,
                  &quot;MaterialPackage&quot;: {
                    &quot;UniqueIdentifier&quot;: &quot;MAT4566555547&quot;,
                    &quot;InternalPartNumber&quot;: &quot;IPN45577&quot;,
                    &quot;Quantity&quot;: 151.0
                  },
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
                },
                {
                  &quot;LocationIdentifier&quot;: &quot;5555646456&quot;,
                  &quot;LocationName&quot;: &quot;SLOT46&quot;,
                  &quot;MaterialPackage&quot;: {
                    &quot;UniqueIdentifier&quot;: &quot;MAT4566588751&quot;,
                    &quot;InternalPartNumber&quot;: &quot;IPN45577&quot;,
                    &quot;Quantity&quot;: 151.0
                  },
                  &quot;CarrierInformation&quot;: {
                    &quot;$type&quot;: &quot;CFX.Structures.SMTPlacement.SMDTubeFeeder, CFX&quot;,
                    &quot;BaseUniqueIdentifier&quot;: &quot;123336&quot;,
                    &quot;BaseName&quot;: null,
                    &quot;LaneNumber&quot;: 0,
                    &quot;Width&quot;: 12.0,
                    &quot;Pitch&quot;: 24.0,
                    &quot;UniqueIdentifier&quot;: &quot;1233336&quot;,
                    &quot;Name&quot;: &quot;TUBE1233336&quot;
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
   * @param materials the value
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
   * @return Materials
   */
  @JsonGetter("Materials")
  public MaterialLocation[] getMaterials() {
    return materials;
  }
}
