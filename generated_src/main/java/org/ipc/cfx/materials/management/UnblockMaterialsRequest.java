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

import org.ipc.cfx.structures.Operator;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * A request to unblock one or more particular lots or instances of material from use in production.
            
            {
              "Locations": [
                {
                  "LocationIdentifier": "23143433",
                  "LocationName": "SLOT45",
                  "MaterialPackage": null,
                  "CarrierInformation": null
                },
                {
                  "LocationIdentifier": "23143454",
                  "LocationName": "SLOT46",
                  "MaterialPackage": null,
                  "CarrierInformation": null
                }
              ]
            }
 * original type: CFX.Materials.Management.UnblockMaterialsRequest
 */
public class UnblockMaterialsRequest extends CFXMessage {

  private String[] materialPackageIdentifiers;
  private String comments;
  private Operator unblocker;

  /**
   * A list of the unique identifiers of the material packages to be blocked
   */
  @JsonSetter("MaterialPackageIdentifiers")
  public void setMaterialPackageIdentifiers(String[] materialPackageIdentifiers) {
    this.materialPackageIdentifiers = materialPackageIdentifiers;
  }

  /**
   * A list of the unique identifiers of the material packages to be blocked
   */
  @JsonGetter("MaterialPackageIdentifiers")
  public String[] getMaterialPackageIdentifiers() {
    return materialPackageIdentifiers;
  }

  /**
   * Human readable comments describing the nature of the block (optional)
   */
  @JsonSetter("Comments")
  public void setComments(String comments) {
    this.comments = comments;
  }

  /**
   * Human readable comments describing the nature of the block (optional)
   *
   * @return never null
   */
  @JsonGetter("Comments")
  public String getComments() {
    return comments == null ? "" : comments;
  }

  /**
   * The person responsible for removing the block (optional)
   */
  @JsonSetter("Unblocker")
  public void setUnblocker(Operator unblocker) {
    this.unblocker = unblocker;
  }

  /**
   * The person responsible for removing the block (optional)
   */
  @JsonGetter("Unblocker")
  public Operator getUnblocker() {
    return unblocker;
  }
}
