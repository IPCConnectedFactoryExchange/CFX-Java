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
package org.ipc.cfx.materials.management;

import org.ipc.cfx.structures.ConsumedMaterial;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent by a process endpoint when materials are consumed
            
            {
              &quot;ConsumedMaterials&quot;: [
                {
                  &quot;MaterialLocation&quot;: {
                    &quot;LocationIdentifier&quot;: &quot;3245434554&quot;,
                    &quot;LocationName&quot;: &quot;SLOT22&quot;,
                    &quot;MaterialPackage&quot;: {
                      &quot;UniqueIdentifier&quot;: &quot;MAT238908348903&quot;,
                      &quot;InternalPartNumber&quot;: &quot;IPN-1222-55555&quot;,
                      &quot;Quantity&quot;: 344.0
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
                  },
                  &quot;QuantityUsed&quot;: 42.0,
                  &quot;QuantitySpoiled&quot;: 2.0,
                  &quot;RemainingQuantity&quot;: 344.0
                },
                {
                  &quot;MaterialLocation&quot;: {
                    &quot;LocationIdentifier&quot;: &quot;3245435784&quot;,
                    &quot;LocationName&quot;: &quot;SLOT28&quot;,
                    &quot;MaterialPackage&quot;: {
                      &quot;UniqueIdentifier&quot;: &quot;MAT238908323434&quot;,
                      &quot;InternalPartNumber&quot;: &quot;IPN-1222-11111&quot;,
                      &quot;Quantity&quot;: 258.0
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
                  },
                  &quot;QuantityUsed&quot;: 88.0,
                  &quot;QuantitySpoiled&quot;: 3.0,
                  &quot;RemainingQuantity&quot;: 258.0
                }
              ]
            }
 * original type: CFX.Materials.Management.MaterialsConsumed
 */
public class MaterialsConsumed extends CFXMessage {

  private ConsumedMaterial[] consumedMaterials;

  /**
   * A list of one or more materials that have been consumed
   * @param consumedMaterials the value
   */
  @JsonSetter("ConsumedMaterials")
  public void setConsumedMaterials(ConsumedMaterial[] consumedMaterials) {
    this.consumedMaterials = consumedMaterials;
  }

  /**
   * A list of one or more materials that have been consumed
   * @return ConsumedMaterials
   */
  @JsonGetter("ConsumedMaterials")
  public ConsumedMaterial[] getConsumedMaterials() {
    return consumedMaterials;
  }
}
