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
  public void setUniqueIdentifier(String uniqueIdentifier) {
    this.uniqueIdentifier = uniqueIdentifier;
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
  public void setInternalPartNumber(String internalPartNumber) {
    this.internalPartNumber = internalPartNumber;
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
  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
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
  public void setManufacturerPartNumber(String manufacturerPartNumber) {
    this.manufacturerPartNumber = manufacturerPartNumber;
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
  public void setVendor(String vendor) {
    this.vendor = vendor;
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
  public void setVendorPartNumber(String vendorPartNumber) {
    this.vendorPartNumber = vendorPartNumber;
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
  public void setManufacturerLotCode(String manufacturerLotCode) {
    this.manufacturerLotCode = manufacturerLotCode;
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
  public void setCreated(Date created) {
    this.created = created;
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
  public void setManufactureDate(Date manufactureDate) {
    this.manufactureDate = manufactureDate;
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
  public void setReceivedDate(Date receivedDate) {
    this.receivedDate = receivedDate;
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
  public void setExpiryDate(Date expiryDate) {
    this.expiryDate = expiryDate;
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
  public void setUnits(String units) {
    this.units = units;
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
  public void setInitialQuantity(double initialQuantity) {
    this.initialQuantity = initialQuantity;
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
  public void setQuantity(double quantity) {
    this.quantity = quantity;
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
  public void setStatus(MaterialStatus status) {
    this.status = status;
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
  public void setHazardousMaterialType(HazardousMaterialType hazardousMaterialType) {
    this.hazardousMaterialType = hazardousMaterialType;
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
  public void setMaterialData(MaterialPackageData materialData) {
    this.materialData = materialData;
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
