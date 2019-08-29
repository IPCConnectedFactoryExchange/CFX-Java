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

import org.ipc.cfx.structures.MaterialPackageDetail;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent whan one or more new material packages are introduced into the factory environment.  
            This might occurr when new material is received from suppliers, or when newly received
            material is labeled with unique identifiers for tracking, stocking, or production purposes.
            
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
                }
              ]
            }
 * original type: CFX.Materials.Management.MaterialsInitialized
 */
public class MaterialsInitialized extends CFXMessage {

  private MaterialPackageDetail[] materials;

  /**
   * A list of the new material packages, including details
   */
  @JsonSetter("Materials")
  public void setMaterials(MaterialPackageDetail[] materials) {
    this.materials = materials;
  }

  /**
   * A list of the new material packages, including details
   */
  @JsonGetter("Materials")
  public MaterialPackageDetail[] getMaterials() {
    return materials;
  }
}
