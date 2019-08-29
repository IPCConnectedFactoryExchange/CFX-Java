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
   */
  @JsonSetter("UnitIdentifier")
  public void setUnitIdentifier(String unitIdentifier) {
    this.unitIdentifier = unitIdentifier;
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
   */
  @JsonSetter("UnitPositionNumber")
  public void setUnitPositionNumber(Integer unitPositionNumber) {
    this.unitPositionNumber = unitPositionNumber;
  }

  /**
   * Logical reference of production unit as defined by CFX position rule (see CFX standard).
            unit’s true unique identifier.
   */
  @JsonGetter("UnitPositionNumber")
  public Integer getUnitPositionNumber() {
    return unitPositionNumber;
  }

  /**
   * The total quantity of parts or material installed of this particular MaterialPackage (lot)
   */
  @JsonSetter("QuantityInstalled")
  public void setQuantityInstalled(double quantityInstalled) {
    this.quantityInstalled = quantityInstalled;
  }

  /**
   * The total quantity of parts or material installed of this particular MaterialPackage (lot)
   */
  @JsonGetter("QuantityInstalled")
  public double getQuantityInstalled() {
    return quantityInstalled;
  }

  /**
   * The material package that was installed
   */
  @JsonSetter("Material")
  public void setMaterial(MaterialPackage material) {
    this.material = material;
  }

  /**
   * The material package that was installed
   */
  @JsonGetter("Material")
  public MaterialPackage getMaterial() {
    return material;
  }

  /**
   * Carrier and Location on the endpoint from which the material was dispensed (when applicable)
   */
  @JsonSetter("CarrierLocation")
  public void setCarrierLocation(MaterialCarrierLocation carrierLocation) {
    this.carrierLocation = carrierLocation;
  }

  /**
   * Carrier and Location on the endpoint from which the material was dispensed (when applicable)
   */
  @JsonGetter("CarrierLocation")
  public MaterialCarrierLocation getCarrierLocation() {
    return carrierLocation;
  }

  /**
   * A list of where the on the production unit the materials / parts were installed.
   */
  @JsonSetter("InstalledComponents")
  public void setInstalledComponents(InstalledComponent[] installedComponents) {
    this.installedComponents = installedComponents;
  }

  /**
   * A list of where the on the production unit the materials / parts were installed.
   */
  @JsonGetter("InstalledComponents")
  public InstalledComponent[] getInstalledComponents() {
    return installedComponents;
  }

  /**
   * A list of where the on the production unit the materials / parts were not installed.
   */
  @JsonSetter("NonInstalledComponents")
  public void setNonInstalledComponents(NonInstalledComponent[] nonInstalledComponents) {
    this.nonInstalledComponents = nonInstalledComponents;
  }

  /**
   * A list of where the on the production unit the materials / parts were not installed.
   */
  @JsonGetter("NonInstalledComponents")
  public NonInstalledComponent[] getNonInstalledComponents() {
    return nonInstalledComponents;
  }
}
