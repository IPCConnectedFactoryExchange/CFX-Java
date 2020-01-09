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

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Describes detailed information about a particular material package (instance of
            material that is tracked, stocked, and used within the factory environment.
 * original type: CFX.Structures.MaterialPackageDetail
 */
public class MaterialPackageDetail {

  private String uniqueIdentifier;
  private String internalPartNumber;
  private String manufacturer;
  private String manufacturerPartNumber;
  private String vendor;
  private String vendorPartNumber;
  private String manufacturerLotCode;
  private Date created;
  private Date manufactureDate;
  private Date receivedDate;
  private Date expiryDate;
  private String units;
  private double initialQuantity;
  private double quantity;
  private MaterialStatus status;
  private HazardousMaterialType hazardousMaterialType;
  private MaterialPackageData materialData;

  /**
   * The unique identifier of the material package
   * @param uniqueIdentifier the value
   */
  @JsonSetter("UniqueIdentifier")
  public MaterialPackageDetail setUniqueIdentifier(String uniqueIdentifier) {
    this.uniqueIdentifier = uniqueIdentifier;
    return this;
  }

  /**
   * The unique identifier of the material package
   *
   * @return never null
   */
  @JsonGetter("UniqueIdentifier")
  public String getUniqueIdentifier() {
    return uniqueIdentifier == null ? "" : uniqueIdentifier;
  }

  /**
   * The internal part number of the material contained within this material package
   * @param internalPartNumber the value
   */
  @JsonSetter("InternalPartNumber")
  public MaterialPackageDetail setInternalPartNumber(String internalPartNumber) {
    this.internalPartNumber = internalPartNumber;
    return this;
  }

  /**
   * The internal part number of the material contained within this material package
   *
   * @return never null
   */
  @JsonGetter("InternalPartNumber")
  public String getInternalPartNumber() {
    return internalPartNumber == null ? "" : internalPartNumber;
  }

  /**
   * The name of the manufacturer of this material
   * @param manufacturer the value
   */
  @JsonSetter("Manufacturer")
  public MaterialPackageDetail setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
    return this;
  }

  /**
   * The name of the manufacturer of this material
   *
   * @return never null
   */
  @JsonGetter("Manufacturer")
  public String getManufacturer() {
    return manufacturer == null ? "" : manufacturer;
  }

  /**
   * The part number of the material as it is known to the original manufacturer of the material
   * @param manufacturerPartNumber the value
   */
  @JsonSetter("ManufacturerPartNumber")
  public MaterialPackageDetail setManufacturerPartNumber(String manufacturerPartNumber) {
    this.manufacturerPartNumber = manufacturerPartNumber;
    return this;
  }

  /**
   * The part number of the material as it is known to the original manufacturer of the material
   *
   * @return never null
   */
  @JsonGetter("ManufacturerPartNumber")
  public String getManufacturerPartNumber() {
    return manufacturerPartNumber == null ? "" : manufacturerPartNumber;
  }

  /**
   * The name of the supplier from whom the material was purchased / supplied.
   * @param vendor the value
   */
  @JsonSetter("Vendor")
  public MaterialPackageDetail setVendor(String vendor) {
    this.vendor = vendor;
    return this;
  }

  /**
   * The name of the supplier from whom the material was purchased / supplied.
   *
   * @return never null
   */
  @JsonGetter("Vendor")
  public String getVendor() {
    return vendor == null ? "" : vendor;
  }

  /**
   * The part number of the material as it is known to the supplier or vendor of the material
   * @param vendorPartNumber the value
   */
  @JsonSetter("VendorPartNumber")
  public MaterialPackageDetail setVendorPartNumber(String vendorPartNumber) {
    this.vendorPartNumber = vendorPartNumber;
    return this;
  }

  /**
   * The part number of the material as it is known to the supplier or vendor of the material
   *
   * @return never null
   */
  @JsonGetter("VendorPartNumber")
  public String getVendorPartNumber() {
    return vendorPartNumber == null ? "" : vendorPartNumber;
  }

  /**
   * The lot code applied to this batch of material by the original manufacturer of the material
   * @param manufacturerLotCode the value
   */
  @JsonSetter("ManufacturerLotCode")
  public MaterialPackageDetail setManufacturerLotCode(String manufacturerLotCode) {
    this.manufacturerLotCode = manufacturerLotCode;
    return this;
  }

  /**
   * The lot code applied to this batch of material by the original manufacturer of the material
   *
   * @return never null
   */
  @JsonGetter("ManufacturerLotCode")
  public String getManufacturerLotCode() {
    return manufacturerLotCode == null ? "" : manufacturerLotCode;
  }

  /**
   * The date / time when this material package was introduced into the factory environment
   * @param created the value
   */
  @JsonSetter("Created")
  public MaterialPackageDetail setCreated(Date created) {
    this.created = created;
    return this;
  }

  /**
   * The date / time when this material package was introduced into the factory environment
   * @return Created
   */
  @JsonGetter("Created")
  public Date getCreated() {
    return created;
  }

  /**
   * The date / time when this material was originally manufactured by the manufacturer
   * @param manufactureDate the value
   */
  @JsonSetter("ManufactureDate")
  public MaterialPackageDetail setManufactureDate(Date manufactureDate) {
    this.manufactureDate = manufactureDate;
    return this;
  }

  /**
   * The date / time when this material was originally manufactured by the manufacturer
   * @return ManufactureDate
   */
  @JsonGetter("ManufactureDate")
  public Date getManufactureDate() {
    return manufactureDate;
  }

  /**
   * The date / time when this material was received into the factory
   * @param receivedDate the value
   */
  @JsonSetter("ReceivedDate")
  public MaterialPackageDetail setReceivedDate(Date receivedDate) {
    this.receivedDate = receivedDate;
    return this;
  }

  /**
   * The date / time when this material was received into the factory
   * @return ReceivedDate
   */
  @JsonGetter("ReceivedDate")
  public Date getReceivedDate() {
    return receivedDate;
  }

  /**
   * Gets or sets the expiry date of this material package based on manufacture definitions.
   * @param expiryDate the value
   */
  @JsonSetter("ExpiryDate")
  public MaterialPackageDetail setExpiryDate(Date expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

  /**
   * Gets or sets the expiry date of this material package based on manufacture definitions.
   * @return ExpiryDate
   */
  @JsonGetter("ExpiryDate")
  public Date getExpiryDate() {
    return expiryDate;
  }

  /**
   * The unit of measure for this material (items, liters, meters, grams, etc.)
            Only valid SI units of measure should be utilized
   * @param units the value
   */
  @JsonSetter("Units")
  public MaterialPackageDetail setUnits(String units) {
    this.units = units;
    return this;
  }

  /**
   * The unit of measure for this material (items, liters, meters, grams, etc.)
            Only valid SI units of measure should be utilized
   *
   * @return never null
   */
  @JsonGetter("Units")
  public String getUnits() {
    return units == null ? "" : units;
  }

  /**
   * The initial quantity of material contained within this material package at the time
            when it was initialized / introduced into the factory environment
   * @param initialQuantity the value
   */
  @JsonSetter("InitialQuantity")
  public MaterialPackageDetail setInitialQuantity(double initialQuantity) {
    this.initialQuantity = initialQuantity;
    return this;
  }

  /**
   * The initial quantity of material contained within this material package at the time
            when it was initialized / introduced into the factory environment
   * @return InitialQuantity
   */
  @JsonGetter("InitialQuantity")
  public double getInitialQuantity() {
    return initialQuantity;
  }

  /**
   * The quantity of material presently contained within this material package
   * @param quantity the value
   */
  @JsonSetter("Quantity")
  public MaterialPackageDetail setQuantity(double quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * The quantity of material presently contained within this material package
   * @return Quantity
   */
  @JsonGetter("Quantity")
  public double getQuantity() {
    return quantity;
  }

  /**
   * The current status of this material package
   * @param status the value
   */
  @JsonSetter("Status")
  public MaterialPackageDetail setStatus(MaterialStatus status) {
    this.status = status;
    return this;
  }

  /**
   * The current status of this material package
   * @return Status
   */
  @JsonGetter("Status")
  public MaterialStatus getStatus() {
    return status;
  }

  /**
   * Specifies whether or not a material is hazardous, and if so, the regulatory directive that controls
            the use of this substance in production.
   * @param hazardousMaterialType the value
   */
  @JsonSetter("HazardousMaterialType")
  public MaterialPackageDetail setHazardousMaterialType(HazardousMaterialType hazardousMaterialType) {
    this.hazardousMaterialType = hazardousMaterialType;
    return this;
  }

  /**
   * Specifies whether or not a material is hazardous, and if so, the regulatory directive that controls
            the use of this substance in production.
   * @return HazardousMaterialType
   */
  @JsonGetter("HazardousMaterialType")
  public HazardousMaterialType getHazardousMaterialType() {
    return hazardousMaterialType;
  }

  /**
   * Optional dynamic structure containing specialized information about this material package.
            For example, if the material package contains moisture sensitive devices, this would contain
            additional information specific to MSD material handling (exposure time, etc.).
   * @param materialData the value
   */
  @JsonSetter("MaterialData")
  public MaterialPackageDetail setMaterialData(MaterialPackageData materialData) {
    this.materialData = materialData;
    return this;
  }

  /**
   * Optional dynamic structure containing specialized information about this material package.
            For example, if the material package contains moisture sensitive devices, this would contain
            additional information specific to MSD material handling (exposure time, etc.).
   * @return MaterialData
   */
  @JsonGetter("MaterialData")
  public MaterialPackageData getMaterialData() {
    return materialData;
  }
}
