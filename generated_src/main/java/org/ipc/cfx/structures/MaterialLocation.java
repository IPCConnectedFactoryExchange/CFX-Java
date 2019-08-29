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
 * created: 20.08.2019 15:52:18 by frankp
 */
package org.ipc.cfx.structures;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Describes a specific location on an endpoint where material may be loaded.
            Also includes information about the current contents of this location (if applicable).
 * original type: CFX.Structures.MaterialLocation
 */
public class MaterialLocation {

  private String locationIdentifier;
  private String locationName;
  private MaterialPackage materialPackage;
  private MaterialCarrier carrierInformation;

  /**
   * The unique identifier (barcode) of the location on the Endpoint where the MaterialPackage is to be loaded.
            If this property is left empty, the MaterialPackage will only be loaded to the carrier specified
            by the CarrierInformation property, and not to an Endpoint.
   */
  @JsonSetter("LocationIdentifier")
  public void setLocationIdentifier(String locationIdentifier) {
    this.locationIdentifier = locationIdentifier;
  }

  /**
   * The unique identifier (barcode) of the location on the Endpoint where the MaterialPackage is to be loaded.
            If this property is left empty, the MaterialPackage will only be loaded to the carrier specified
            by the CarrierInformation property, and not to an Endpoint.
   *
   * @return never null
   */
  @JsonGetter("LocationIdentifier")
  public String getLocationIdentifier() {
    return locationIdentifier == null ? "" : locationIdentifier;
  }

  /**
   * Name of the Location
   */
  @JsonSetter("LocationName")
  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }

  /**
   * Name of the Location
   *
   * @return never null
   */
  @JsonGetter("LocationName")
  public String getLocationName() {
    return locationName == null ? "" : locationName;
  }

  /**
   * The material package (reel, bin, etc) that is loaded at the position (if any).
   */
  @JsonSetter("MaterialPackage")
  public void setMaterialPackage(MaterialPackage materialPackage) {
    this.materialPackage = materialPackage;
  }

  /**
   * The material package (reel, bin, etc) that is loaded at the position (if any).
   */
  @JsonGetter("MaterialPackage")
  public MaterialPackage getMaterialPackage() {
    return materialPackage;
  }

  /**
   * The material carrier that is loaded at the position (if any)
   */
  @JsonSetter("CarrierInformation")
  public void setCarrierInformation(MaterialCarrier carrierInformation) {
    this.carrierInformation = carrierInformation;
  }

  /**
   * The material carrier that is loaded at the position (if any)
   */
  @JsonGetter("CarrierInformation")
  public MaterialCarrier getCarrierInformation() {
    return carrierInformation;
  }
}
