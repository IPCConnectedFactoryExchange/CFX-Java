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
package org.ipc.cfx.materials.management;

import org.ipc.cfx.structures.MaterialPackageDetail;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent whan one or more new material packages are introduced into the factory environment.  
            This might occurr when new material is received from suppliers, or when newly received
            material is labeled with unique identifiers for tracking, stocking, or production purposes.
            
            {
              &quot;Materials&quot;: [
                {
                  &quot;UniqueIdentifier&quot;: &quot;MAT4566556456&quot;,
                  &quot;InternalPartNumber&quot;: &quot;IPN47788&quot;,
                  &quot;Manufacturer&quot;: &quot;MOTOROLA&quot;,
                  &quot;ManufacturerPartNumber&quot;: &quot;MOT231234&quot;,
                  &quot;Vendor&quot;: &quot;Digikey&quot;,
                  &quot;VendorPartNumber&quot;: &quot;DIG23452442&quot;,
                  &quot;ManufacturerLotCode&quot;: &quot;LOT2016110588&quot;,
                  &quot;Created&quot;: &quot;2018-09-28T12:47:59.1991055-04:00&quot;,
                  &quot;ManufactureDate&quot;: &quot;2016-11-05T00:00:00&quot;,
                  &quot;ReceivedDate&quot;: &quot;2017-05-06T00:00:00&quot;,
                  &quot;Units&quot;: null,
                  &quot;InitialQuantity&quot;: 1000.0,
                  &quot;Quantity&quot;: 887.0,
                  &quot;Status&quot;: &quot;Active&quot;,
                  &quot;HazardousMaterialType&quot;: &quot;RoHS&quot;,
                  &quot;MaterialData&quot;: {
                    &quot;$type&quot;: &quot;CFX.Structures.MaterialPackageMSDData, CFX&quot;,
                    &quot;ExpirationDateTime&quot;: null,
                    &quot;OriginalExposureDateTime&quot;: &quot;2017-05-01T08:22:12&quot;,
                    &quot;LastExposureDateTime&quot;: &quot;2017-05-06T13:55:33&quot;,
                    &quot;RemainingExposureTime&quot;: &quot;6.00:00:00&quot;,
                    &quot;MSDLevel&quot;: &quot;MSL3&quot;,
                    &quot;MSDState&quot;: &quot;InDryStorage&quot;
                  }
                },
                {
                  &quot;UniqueIdentifier&quot;: &quot;MAT4566554543&quot;,
                  &quot;InternalPartNumber&quot;: &quot;IPN48899&quot;,
                  &quot;Manufacturer&quot;: &quot;SAMSUNG&quot;,
                  &quot;ManufacturerPartNumber&quot;: &quot;SAM233243&quot;,
                  &quot;Vendor&quot;: &quot;Digikey&quot;,
                  &quot;VendorPartNumber&quot;: &quot;DIG44543534&quot;,
                  &quot;ManufacturerLotCode&quot;: &quot;LOT2016101008&quot;,
                  &quot;Created&quot;: &quot;2018-09-28T12:47:59.1991055-04:00&quot;,
                  &quot;ManufactureDate&quot;: &quot;2016-10-10T00:00:00&quot;,
                  &quot;ReceivedDate&quot;: &quot;2017-09-09T00:00:00&quot;,
                  &quot;Units&quot;: null,
                  &quot;InitialQuantity&quot;: 1000.0,
                  &quot;Quantity&quot;: 748.0,
                  &quot;Status&quot;: &quot;Active&quot;,
                  &quot;HazardousMaterialType&quot;: &quot;NotHazardous&quot;,
                  &quot;MaterialData&quot;: null
                }
              ]
            }
 * original type: CFX.Materials.Management.MaterialsInitialized
 */
public class MaterialsInitialized extends CFXMessage {

  private MaterialPackageDetail[] materials;

  /**
   * A list of the new material packages, including details
   * @param materials the value
   */
  @JsonSetter("Materials")
  public MaterialsInitialized setMaterials(MaterialPackageDetail[] materials) {
    this.materials = materials;
    return this;
  }

  /**
   * A list of the new material packages, including details
   * @return Materials
   */
  @JsonGetter("Materials")
  public MaterialPackageDetail[] getMaterials() {
    return materials;
  }
}
