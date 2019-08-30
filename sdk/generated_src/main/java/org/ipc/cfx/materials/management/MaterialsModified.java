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

import org.ipc.cfx.structures.MaterialModifyReason;
import org.ipc.cfx.structures.MaterialPackageDetail;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent when the attributes of one or more specific material packages have been altered.
            NOTEL  When the current quantity attribute of the material package decreases in the 
            normal course of production (consumption), a MaterialsModified modified message should NOT
            be sent.  Instead, in this case a  message should be sent.
            
            {
              &quot;Reason&quot;: &quot;ManualCountAndQuantityUpdate&quot;,
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
                    &quot;LastExposureDateTime&quot;: &quot;2017-05-06T13:55:33&quot;,
                    &quot;RemainingExposureTime&quot;: &quot;6.00:00:00&quot;,
                    &quot;MSDLevel&quot;: &quot;MSL2A&quot;,
                    &quot;MSDState&quot;: &quot;Exposed&quot;
                  }
                }
              ]
            }
 * original type: CFX.Materials.Management.MaterialsModified
 */
public class MaterialsModified extends CFXMessage {

  private MaterialModifyReason reason;
  private MaterialPackageDetail[] materials;

  /**
   * The reason for the changes
   * @param reason the value
   */
  @JsonSetter("Reason")
  public void setReason(MaterialModifyReason reason) {
    this.reason = reason;
  }

  /**
   * The reason for the changes
   * @return Reason
   */
  @JsonGetter("Reason")
  public MaterialModifyReason getReason() {
    return reason;
  }

  /**
   * A list of material packages, including the updated information
   * @param materials the value
   */
  @JsonSetter("Materials")
  public void setMaterials(MaterialPackageDetail[] materials) {
    this.materials = materials;
  }

  /**
   * A list of material packages, including the updated information
   * @return Materials
   */
  @JsonGetter("Materials")
  public MaterialPackageDetail[] getMaterials() {
    return materials;
  }
}
