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

import org.ipc.cfx.structures.MaterialPackage;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent when one or more material packages are fully exhausted / depleted
            
            {
              "Materials": [
                {
                  "UniqueIdentifier": "MAT4566556456",
                  "InternalPartNumber": "IPN47788",
                  "Quantity": 887.0
                },
                {
                  "UniqueIdentifier": "MAT4566554543",
                  "InternalPartNumber": "IPN48899",
                  "Quantity": 748.0
                },
                {
                  "UniqueIdentifier": "MAT4566553421",
                  "InternalPartNumber": "IPN45577",
                  "Quantity": 151.0
                }
              ]
            }
 * original type: CFX.Materials.Management.MaterialsRetired
 */
public class MaterialsRetired extends CFXMessage {

  private MaterialPackage[] materials;

  /**
   * A list of the materials that have been exhausted / depleted
   */
  @JsonSetter("Materials")
  public void setMaterials(MaterialPackage[] materials) {
    this.materials = materials;
  }

  /**
   * A list of the materials that have been exhausted / depleted
   */
  @JsonGetter("Materials")
  public MaterialPackage[] getMaterials() {
    return materials;
  }
}
