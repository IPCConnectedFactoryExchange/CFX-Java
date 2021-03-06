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
package org.ipc.cfx.structures;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Describes a specific location on an endpoint where a material carrier may be loaded.
            When applicable, also contains information about the currently loaded carrier, and
            the material package(s) loaded to that carrer.
 * original type: CFX.Structures.MaterialCarrierLocation
 */
public class MaterialCarrierLocation {

  private String locationIdentifier;
  private String locationName;
  private MaterialCarrier carrierInformation;

  /**
   * The unique identifier of the carrier location (barcode or RFID value)
   * @param locationIdentifier the value
   */
  @JsonSetter("LocationIdentifier")
  public MaterialCarrierLocation setLocationIdentifier(String locationIdentifier) {
    this.locationIdentifier = locationIdentifier;
    return this;
  }

  /**
   * The unique identifier of the carrier location (barcode or RFID value)
   *
   * @return never null
   */
  @JsonGetter("LocationIdentifier")
  public String getLocationIdentifier() {
    return locationIdentifier == null ? "" : locationIdentifier;
  }

  /**
   * The name of the carrier location
   * @param locationName the value
   */
  @JsonSetter("LocationName")
  public MaterialCarrierLocation setLocationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

  /**
   * The name of the carrier location
   *
   * @return never null
   */
  @JsonGetter("LocationName")
  public String getLocationName() {
    return locationName == null ? "" : locationName;
  }

  /**
   * Dynamic structure that defines the carrier that is presently loaded at the carrier location
   * @param carrierInformation the value
   */
  @JsonSetter("CarrierInformation")
  public MaterialCarrierLocation setCarrierInformation(MaterialCarrier carrierInformation) {
    this.carrierInformation = carrierInformation;
    return this;
  }

  /**
   * Dynamic structure that defines the carrier that is presently loaded at the carrier location
   * @return CarrierInformation
   */
  @JsonGetter("CarrierInformation")
  public MaterialCarrier getCarrierInformation() {
    return carrierInformation;
  }
}
