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
              "Reason": "ManualCountAndQuantityUpdate",
              "Materials": [
                {
                  "UniqueIdentifier": "MAT4566556456",
                  "InternalPartNumber": "IPN47788",
                  "Manufacturer": "MOTOROLA",
                  "ManufacturerPartNumber": "MOT231234",
                  "Vendor": "Digikey",
                  "VendorPartNumber": "DIG23452442",
                  "ManufacturerLotCode": "LOT2016110588",
                  "Created": "2018-09-28T12:47:59.1991055-04:00",
                  "ManufactureDate": "2016-11-05T00:00:00",
                  "ReceivedDate": "2017-05-06T00:00:00",
                  "Units": null,
                  "InitialQuantity": 1000.0,
                  "Quantity": 887.0,
                  "Status": "Active",
                  "HazardousMaterialType": "RoHS",
                  "MaterialData": {
                    "$type": "CFX.Structures.MaterialPackageMSDData, CFX",
                    "ExpirationDateTime": null,
                    "OriginalExposureDateTime": "2017-05-01T08:22:12",
                    "LastExposureDateTime": "2017-05-06T13:55:33",
                    "RemainingExposureTime": "6.00:00:00",
                    "MSDLevel": "MSL3",
                    "MSDState": "InDryStorage"
                  }
                },
                {
                  "UniqueIdentifier": "MAT4566554543",
                  "InternalPartNumber": "IPN48899",
                  "Manufacturer": "SAMSUNG",
                  "ManufacturerPartNumber": "SAM233243",
                  "Vendor": "Digikey",
                  "VendorPartNumber": "DIG44543534",
                  "ManufacturerLotCode": "LOT2016101008",
                  "Created": "2018-09-28T12:47:59.1991055-04:00",
                  "ManufactureDate": "2016-10-10T00:00:00",
                  "ReceivedDate": "2017-09-09T00:00:00",
                  "Units": null,
                  "InitialQuantity": 1000.0,
                  "Quantity": 748.0,
                  "Status": "Active",
                  "HazardousMaterialType": "NotHazardous",
                  "MaterialData": null
                },
                {
                  "UniqueIdentifier": "MAT4566553421",
                  "InternalPartNumber": "IPN45577",
                  "Manufacturer": "FUJITSU",
                  "ManufacturerPartNumber": "FJJT234243",
                  "Vendor": "Digikey",
                  "VendorPartNumber": "DIG543534537",
                  "ManufacturerLotCode": "LOT2017080355",
                  "Created": "2018-09-28T12:47:59.1991055-04:00",
                  "ManufactureDate": "2017-08-03T00:00:00",
                  "ReceivedDate": "2017-09-10T00:00:00",
                  "Units": null,
                  "InitialQuantity": 500.0,
                  "Quantity": 151.0,
                  "Status": "Active",
                  "HazardousMaterialType": "NotHazardous",
                  "MaterialData": {
                    "$type": "CFX.Structures.MaterialPackageMSDData, CFX",
                    "ExpirationDateTime": null,
                    "OriginalExposureDateTime": "2017-05-01T08:22:12",
                    "LastExposureDateTime": "2017-05-06T13:55:33",
                    "RemainingExposureTime": "6.00:00:00",
                    "MSDLevel": "MSL2A",
                    "MSDState": "Exposed"
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
   */
  @JsonSetter("Reason")
  public void setReason(MaterialModifyReason reason) {
    this.reason = reason;
  }

  /**
   * The reason for the changes
   */
  @JsonGetter("Reason")
  public MaterialModifyReason getReason() {
    return reason;
  }

  /**
   * A list of material packages, including the updated information
   */
  @JsonSetter("Materials")
  public void setMaterials(MaterialPackageDetail[] materials) {
    this.materials = materials;
  }

  /**
   * A list of material packages, including the updated information
   */
  @JsonGetter("Materials")
  public MaterialPackageDetail[] getMaterials() {
    return materials;
  }
}
