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
 * Sent when two separate material packages (containing the same part) are joined together.
            For example, as in the case of the splicing together of multiple reels of embossed tape
            containing SMD parts.
            
            {
              "LeadingMaterialPackage": {
                "UniqueIdentifier": "MAT4566589856",
                "InternalPartNumber": "IPN45577",
                "Quantity": 151.0
              },
              "TrailingMaterialPackage": {
                "UniqueIdentifier": "MAT4563453457",
                "InternalPartNumber": "IPN45577",
                "Quantity": 151.0
              }
            }
 * original type: CFX.Materials.Management.MaterialsJoined
 */
public class MaterialsJoined extends CFXMessage {

  private MaterialPackage leadingMaterialPackage;
  private MaterialPackage trailingMaterialPackage;

  /**
   * Of the two material packages being joined, the material package which will be consumed
            first after joining
   */
  @JsonSetter("LeadingMaterialPackage")
  public void setLeadingMaterialPackage(MaterialPackage leadingMaterialPackage) {
    this.leadingMaterialPackage = leadingMaterialPackage;
  }

  /**
   * Of the two material packages being joined, the material package which will be consumed
            first after joining
   */
  @JsonGetter("LeadingMaterialPackage")
  public MaterialPackage getLeadingMaterialPackage() {
    return leadingMaterialPackage;
  }

  /**
   * Of the two material packages being joined, the material package which will be consumed
            last after joining
   */
  @JsonSetter("TrailingMaterialPackage")
  public void setTrailingMaterialPackage(MaterialPackage trailingMaterialPackage) {
    this.trailingMaterialPackage = trailingMaterialPackage;
  }

  /**
   * Of the two material packages being joined, the material package which will be consumed
            last after joining
   */
  @JsonGetter("TrailingMaterialPackage")
  public MaterialPackage getTrailingMaterialPackage() {
    return trailingMaterialPackage;
  }
}
