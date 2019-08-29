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
 * Sent when an endpoint detects a splice point.  A splice point is a juncture between two different material packages 
            of the same part that have been pre-joined prior to loading at the material location, or were joined-in-place
            during production.  Though the two materials are of the same part number, they may be of differing lots.
            
            {
              "DepletedMaterial": {
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
              "NewlyActiveMaterial": {
                "LocationIdentifier": "3245435784",
                "LocationName": "SLOT28",
                "MaterialPackage": {
                  "UniqueIdentifier": "MAT238908348904",
                  "InternalPartNumber": "IPN-1222-55555",
                  "Quantity": 1000.0
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
   */
  @JsonSetter("DepletedMaterial")
  public void setDepletedMaterial(MaterialLocation depletedMaterial) {
    this.depletedMaterial = depletedMaterial;
  }

  /**
   * Describes the location on the machine where a splice point was detected, along with 
            information about the material package that has been depleted.
   */
  @JsonGetter("DepletedMaterial")
  public MaterialLocation getDepletedMaterial() {
    return depletedMaterial;
  }

  /**
   * Describes the location on the machine where a splice point was detected, along with 
            information about the new material package that is now being actively consumed at 
            that location.
   */
  @JsonSetter("NewlyActiveMaterial")
  public void setNewlyActiveMaterial(MaterialLocation newlyActiveMaterial) {
    this.newlyActiveMaterial = newlyActiveMaterial;
  }

  /**
   * Describes the location on the machine where a splice point was detected, along with 
            information about the new material package that is now being actively consumed at 
            that location.
   */
  @JsonGetter("NewlyActiveMaterial")
  public MaterialLocation getNewlyActiveMaterial() {
    return newlyActiveMaterial;
  }
}
