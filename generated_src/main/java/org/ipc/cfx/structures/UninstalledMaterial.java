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
 * created: 20.08.2019 15:52:36 by frankp
 */
package org.ipc.cfx.structures;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Describes when single lot of material that is uninstalled from a production unit, 
            possibly from specific locations on the production unit.
 * original type: CFX.Structures.UninstalledMaterial
 */
public class UninstalledMaterial {

  private String unitIdentifier;
  private Integer unitPositionNumber;
  private double quantityUninstalled;
  private UninstalledReason reason;
  private MaterialPackage material;
  private InstalledComponent[] uninstalledComponents;

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
   * Logical reference of production unit as defined by CFX position rule (see CFX standard section 5.6).
   */
  @JsonSetter("UnitPositionNumber")
  public void setUnitPositionNumber(Integer unitPositionNumber) {
    this.unitPositionNumber = unitPositionNumber;
  }

  /**
   * Logical reference of production unit as defined by CFX position rule (see CFX standard section 5.6).
   */
  @JsonGetter("UnitPositionNumber")
  public Integer getUnitPositionNumber() {
    return unitPositionNumber;
  }

  /**
   * The total quantity of parts or material uninstalled of this particular MaterialPackage (lot)
   */
  @JsonSetter("QuantityUninstalled")
  public void setQuantityUninstalled(double quantityUninstalled) {
    this.quantityUninstalled = quantityUninstalled;
  }

  /**
   * The total quantity of parts or material uninstalled of this particular MaterialPackage (lot)
   */
  @JsonGetter("QuantityUninstalled")
  public double getQuantityUninstalled() {
    return quantityUninstalled;
  }

  /**
   * The reason why the material was uninstalled.
   */
  @JsonSetter("Reason")
  public void setReason(UninstalledReason reason) {
    this.reason = reason;
  }

  /**
   * The reason why the material was uninstalled.
   */
  @JsonGetter("Reason")
  public UninstalledReason getReason() {
    return reason;
  }

  /**
   * The material package that was uninstalled (if known)
   */
  @JsonSetter("Material")
  public void setMaterial(MaterialPackage material) {
    this.material = material;
  }

  /**
   * The material package that was uninstalled (if known)
   */
  @JsonGetter("Material")
  public MaterialPackage getMaterial() {
    return material;
  }

  /**
   * A list of the components that were uninstalled
   */
  @JsonSetter("UninstalledComponents")
  public void setUninstalledComponents(InstalledComponent[] uninstalledComponents) {
    this.uninstalledComponents = uninstalledComponents;
  }

  /**
   * A list of the components that were uninstalled
   */
  @JsonGetter("UninstalledComponents")
  public InstalledComponent[] getUninstalledComponents() {
    return uninstalledComponents;
  }
}
