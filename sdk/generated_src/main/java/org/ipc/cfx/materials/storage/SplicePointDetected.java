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
 * Sent when an endpoint detects a splice point.  A splice point is a juncture between two different material packages 
            of the same part that have been pre-joined prior to loading at the material location, or were joined-in-place
            during production.  Though the two materials are of the same part number, they may be of differing lots.
            
            {
              &quot;DepletedMaterial&quot;: {
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
              &quot;NewlyActiveMaterial&quot;: {
                &quot;LocationIdentifier&quot;: &quot;3245435784&quot;,
                &quot;LocationName&quot;: &quot;SLOT28&quot;,
                &quot;MaterialPackage&quot;: {
                  &quot;UniqueIdentifier&quot;: &quot;MAT238908348904&quot;,
                  &quot;InternalPartNumber&quot;: &quot;IPN-1222-55555&quot;,
                  &quot;Quantity&quot;: 1000.0
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
              }
            }
 * original type: CFX.Materials.Storage.SplicePointDetected
 */
public class SplicePointDetected extends CFXMessage {

  private MaterialLocation depletedMaterial;
  private MaterialLocation newlyActiveMaterial;

  /**
   * Describes the location on the machine where a splice point was detected, along with 
            information about the material package that has been depleted.
   * @param depletedMaterial the value
   */
  @JsonSetter("DepletedMaterial")
  public void setDepletedMaterial(MaterialLocation depletedMaterial) {
    this.depletedMaterial = depletedMaterial;
  }

  /**
   * Describes the location on the machine where a splice point was detected, along with 
            information about the material package that has been depleted.
   * @return DepletedMaterial
   */
  @JsonGetter("DepletedMaterial")
  public MaterialLocation getDepletedMaterial() {
    return depletedMaterial;
  }

  /**
   * Describes the location on the machine where a splice point was detected, along with 
            information about the new material package that is now being actively consumed at 
            that location.
   * @param newlyActiveMaterial the value
   */
  @JsonSetter("NewlyActiveMaterial")
  public void setNewlyActiveMaterial(MaterialLocation newlyActiveMaterial) {
    this.newlyActiveMaterial = newlyActiveMaterial;
  }

  /**
   * Describes the location on the machine where a splice point was detected, along with 
            information about the new material package that is now being actively consumed at 
            that location.
   * @return NewlyActiveMaterial
   */
  @JsonGetter("NewlyActiveMaterial")
  public MaterialLocation getNewlyActiveMaterial() {
    return newlyActiveMaterial;
  }
}
