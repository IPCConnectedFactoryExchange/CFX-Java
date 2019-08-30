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
 * created: 30.08.2019 09:11:10 by frankp
 */
package org.ipc.cfx.materials.management.msdmanagement;

import org.ipc.cfx.structures.MaterialPackageDetail;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent when one or more MSD material packages have been placed into dry storage
            
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
                    &quot;LastExposureDateTime&quot;: &quot;2018-09-28T12:48:00.2221189-04:00&quot;,
                    &quot;RemainingExposureTime&quot;: &quot;6.00:00:00&quot;,
                    &quot;MSDLevel&quot;: &quot;MSL3&quot;,
                    &quot;MSDState&quot;: &quot;InDryStorage&quot;
                  }
                },
                {
                  &quot;UniqueIdentifier&quot;: &quot;MAT4566553421&quot;,
                  &quot;InternalPartNumber&quot;: &quot;IPN45577&quot;,
                  &quot;Manufacturer&quot;: &quot;FUJITSU&quot;,
                  &quot;ManufacturerPartNumber&quot;: &quot;FJJT234243&quot;,
                  &quot;Vendor&quot;: &quot;Digikey&quot;,
                  &quot;VendorPartNumber&quot;: &quot;DIG543534537&quot;,
                  &quot;ManufacturerLotCode&quot;: &quot;LOT2017080355&quot;,
                  &quot;Created&quot;: &quot;2018-09-28T12:47:59.1991055-04:00&quot;,
                  &quot;ManufactureDate&quot;: &quot;2017-08-03T00:00:00&quot;,
                  &quot;ReceivedDate&quot;: &quot;2017-09-10T00:00:00&quot;,
                  &quot;Units&quot;: null,
                  &quot;InitialQuantity&quot;: 500.0,
                  &quot;Quantity&quot;: 151.0,
                  &quot;Status&quot;: &quot;Active&quot;,
                  &quot;HazardousMaterialType&quot;: &quot;NotHazardous&quot;,
                  &quot;MaterialData&quot;: {
                    &quot;$type&quot;: &quot;CFX.Structures.MaterialPackageMSDData, CFX&quot;,
                    &quot;ExpirationDateTime&quot;: null,
                    &quot;OriginalExposureDateTime&quot;: &quot;2017-05-01T08:22:12&quot;,
                    &quot;LastExposureDateTime&quot;: &quot;2018-09-28T12:48:00.2221189-04:00&quot;,
                    &quot;RemainingExposureTime&quot;: &quot;6.00:00:00&quot;,
                    &quot;MSDLevel&quot;: &quot;MSL2A&quot;,
                    &quot;MSDState&quot;: &quot;InDryStorage&quot;
                  }
                }
              ]
            }
 * original type: CFX.Materials.Management.MSDManagement.MaterialsPlacedInDryStorage
 */
public class MaterialsPlacedInDryStorage extends CFXMessage {

  private MaterialPackageDetail[] materials;

  /**
   * The materials which have been placed in dry storage
   * @param materials the value
   */
  @JsonSetter("Materials")
  public void setMaterials(MaterialPackageDetail[] materials) {
    this.materials = materials;
  }

  /**
   * The materials which have been placed in dry storage
   * @return Materials
   */
  @JsonGetter("Materials")
  public MaterialPackageDetail[] getMaterials() {
    return materials;
  }
}
