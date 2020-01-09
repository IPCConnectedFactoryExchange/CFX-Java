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
 * Describes a single lot of material that was installed on a production unit, possibly
            in specific locations on the production unit.
 * original type: CFX.Structures.InstalledMaterial
 */
public class InstalledMaterial {

  private String unitIdentifier;
  private Integer unitPositionNumber;
  private double quantityInstalled;
  private MaterialPackage material;
  private MaterialCarrierLocation carrierLocation;
  private InstalledComponent[] installedComponents;
  private NonInstalledComponent[] nonInstalledComponents;

  /**
   * Unique ID of Production Unit, Panel, or Carrier
   * @param unitIdentifier the value
   */
  @JsonSetter("UnitIdentifier")
  public InstalledMaterial setUnitIdentifier(String unitIdentifier) {
    this.unitIdentifier = unitIdentifier;
    return this;
  }

  /**
   * Unique ID of Production Unit, Panel, or Carrier
   *
   * @return never null
   */
  @JsonGetter("UnitIdentifier")
  public String getUnitIdentifier() {
    return unitIdentifier == null ? "" : unitIdentifier;
  }

  /**
   * Logical reference of production unit as defined by CFX position rule (see CFX standard).
            unit’s true unique identifier.
   * @param unitPositionNumber the value
   */
  @JsonSetter("UnitPositionNumber")
  public InstalledMaterial setUnitPositionNumber(Integer unitPositionNumber) {
    this.unitPositionNumber = unitPositionNumber;
    return this;
  }

  /**
   * Logical reference of production unit as defined by CFX position rule (see CFX standard).
            unit’s true unique identifier.
   * @return UnitPositionNumber
   */
  @JsonGetter("UnitPositionNumber")
  public Integer getUnitPositionNumber() {
    return unitPositionNumber;
  }

  /**
   * The total quantity of parts or material installed of this particular MaterialPackage (lot)
   * @param quantityInstalled the value
   */
  @JsonSetter("QuantityInstalled")
  public InstalledMaterial setQuantityInstalled(double quantityInstalled) {
    this.quantityInstalled = quantityInstalled;
    return this;
  }

  /**
   * The total quantity of parts or material installed of this particular MaterialPackage (lot)
   * @return QuantityInstalled
   */
  @JsonGetter("QuantityInstalled")
  public double getQuantityInstalled() {
    return quantityInstalled;
  }

  /**
   * The material package that was installed
   * @param material the value
   */
  @JsonSetter("Material")
  public InstalledMaterial setMaterial(MaterialPackage material) {
    this.material = material;
    return this;
  }

  /**
   * The material package that was installed
   * @return Material
   */
  @JsonGetter("Material")
  public MaterialPackage getMaterial() {
    return material;
  }

  /**
   * Carrier and Location on the endpoint from which the material was dispensed (when applicable)
   * @param carrierLocation the value
   */
  @JsonSetter("CarrierLocation")
  public InstalledMaterial setCarrierLocation(MaterialCarrierLocation carrierLocation) {
    this.carrierLocation = carrierLocation;
    return this;
  }

  /**
   * Carrier and Location on the endpoint from which the material was dispensed (when applicable)
   * @return CarrierLocation
   */
  @JsonGetter("CarrierLocation")
  public MaterialCarrierLocation getCarrierLocation() {
    return carrierLocation;
  }

  /**
   * A list of where the on the production unit the materials / parts were installed.
   * @param installedComponents the value
   */
  @JsonSetter("InstalledComponents")
  public InstalledMaterial setInstalledComponents(InstalledComponent[] installedComponents) {
    this.installedComponents = installedComponents;
    return this;
  }

  /**
   * A list of where the on the production unit the materials / parts were installed.
   * @return InstalledComponents
   */
  @JsonGetter("InstalledComponents")
  public InstalledComponent[] getInstalledComponents() {
    return installedComponents;
  }

  /**
   * A list of where the on the production unit the materials / parts were not installed.
   * @param nonInstalledComponents the value
   */
  @JsonSetter("NonInstalledComponents")
  public InstalledMaterial setNonInstalledComponents(NonInstalledComponent[] nonInstalledComponents) {
    this.nonInstalledComponents = nonInstalledComponents;
    return this;
  }

  /**
   * A list of where the on the production unit the materials / parts were not installed.
   * @return NonInstalledComponents
   */
  @JsonGetter("NonInstalledComponents")
  public NonInstalledComponent[] getNonInstalledComponents() {
    return nonInstalledComponents;
  }
}
