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
package org.ipc.cfx.materials.management.msdmanagement;

import org.ipc.cfx.structures.MaterialPackageDetail;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent when one or more MSD material packages have reached their maximum exposure time, 
            and may no longer be used in production (unless reconditioned)
            
            {
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
                    "ExpirationDateTime": "2018-09-28T12:48:00.2251223-04:00",
                    "OriginalExposureDateTime": "2017-05-01T08:22:12",
                    "LastExposureDateTime": "2018-09-28T12:48:00.2221189-04:00",
                    "RemainingExposureTime": "6.00:00:00",
                    "MSDLevel": "MSL3",
                    "MSDState": "Expired"
                  }
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
                    "ExpirationDateTime": "2018-09-28T12:48:00.2251223-04:00",
                    "OriginalExposureDateTime": "2017-05-01T08:22:12",
                    "LastExposureDateTime": "2018-09-28T12:48:00.2221189-04:00",
                    "RemainingExposureTime": "6.00:00:00",
                    "MSDLevel": "MSL2A",
                    "MSDState": "Expired"
                  }
                }
              ]
            }
 * original type: CFX.Materials.Management.MSDManagement.MaterialsExpired
 */
public class MaterialsExpired extends CFXMessage {

  private MaterialPackageDetail[] materials;

  /**
   * The materials which have expired
   */
  @JsonSetter("Materials")
  public void setMaterials(MaterialPackageDetail[] materials) {
    this.materials = materials;
  }

  /**
   * The materials which have expired
   */
  @JsonGetter("Materials")
  public MaterialPackageDetail[] getMaterials() {
    return materials;
  }
}
