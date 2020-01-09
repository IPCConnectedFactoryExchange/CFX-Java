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

import org.ipc.cfx.structures.MaterialLocation;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent when one or more material packages stored at a particular location
            become fully exhausted / depleted.
            
            {
              &quot;EmptyMaterials&quot;: [
                {
                  &quot;LocationIdentifier&quot;: &quot;3245434554&quot;,
                  &quot;LocationName&quot;: &quot;SLOT22&quot;,
                  &quot;MaterialPackage&quot;: {
                    &quot;UniqueIdentifier&quot;: &quot;MAT238908348903&quot;,
                    &quot;InternalPartNumber&quot;: &quot;IPN-1222-55555&quot;,
                    &quot;Quantity&quot;: 0.0
                  },
                  &quot;CarrierInformation&quot;: {
                    &quot;$type&quot;: &quot;CFX.Structures.SMTPlacement.SMDTapeFeeder, CFX&quot;,
                    &quot;BaseUniqueIdentifier&quot;: null,
                    &quot;BaseName&quot;: null,
                    &quot;LaneNumber&quot;: 1,
                    &quot;TapeWidth&quot;: 8.0,
                    &quot;TapePitch&quot;: 8.0,
                    &quot;UniqueIdentifier&quot;: &quot;234232432424&quot;,
                    &quot;Name&quot;: &quot;FEEDER2245465&quot;
                  }
                },
                {
                  &quot;LocationIdentifier&quot;: &quot;3245435784&quot;,
                  &quot;LocationName&quot;: &quot;SLOT28&quot;,
                  &quot;MaterialPackage&quot;: {
                    &quot;UniqueIdentifier&quot;: &quot;MAT238908323434&quot;,
                    &quot;InternalPartNumber&quot;: &quot;IPN-1222-11111&quot;,
                    &quot;Quantity&quot;: 0.0
                  },
                  &quot;CarrierInformation&quot;: {
                    &quot;$type&quot;: &quot;CFX.Structures.SMTPlacement.SMDTapeFeeder, CFX&quot;,
                    &quot;BaseUniqueIdentifier&quot;: null,
                    &quot;BaseName&quot;: null,
                    &quot;LaneNumber&quot;: 1,
                    &quot;TapeWidth&quot;: 8.0,
                    &quot;TapePitch&quot;: 4.0,
                    &quot;UniqueIdentifier&quot;: &quot;234232432424&quot;,
                    &quot;Name&quot;: &quot;FEEDER2245465&quot;
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
   * @param emptyMaterials the value
   */
  @JsonSetter("EmptyMaterials")
  public MaterialsEmpty setEmptyMaterials(MaterialLocation[] emptyMaterials) {
    this.emptyMaterials = emptyMaterials;
    return this;
  }

  /**
   * A list of the material locations where the depleted material packages are stored or loaded
            at the endpoint.  Also includes the material package that is loaded at the location (if known).
            For example, if the endpoint is an SMT placement machine, the location identifies 
            the feeder slot/position where the depleted material package is loaded.
   * @return EmptyMaterials
   */
  @JsonGetter("EmptyMaterials")
  public MaterialLocation[] getEmptyMaterials() {
    return emptyMaterials;
  }
}
