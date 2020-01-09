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
 * Describes an event where material is consumed in the course of production.
 * original type: CFX.Structures.ConsumedMaterial
 */
public class ConsumedMaterial {

  private MaterialLocation materialLocation;
  private double quantityUsed;
  private double quantitySpoiled;
  private double remainingQuantity;

  /**
   * The location on the process endpoint from which the material was consumed.
            Also identifies the specific material package from which the material was 
            consumed (if known)
   * @param materialLocation the value
   */
  @JsonSetter("MaterialLocation")
  public ConsumedMaterial setMaterialLocation(MaterialLocation materialLocation) {
    this.materialLocation = materialLocation;
    return this;
  }

  /**
   * The location on the process endpoint from which the material was consumed.
            Also identifies the specific material package from which the material was 
            consumed (if known)
   * @return MaterialLocation
   */
  @JsonGetter("MaterialLocation")
  public MaterialLocation getMaterialLocation() {
    return materialLocation;
  }

  /**
   * The quantity of material that was consumed for value-added purposes
   * @param quantityUsed the value
   */
  @JsonSetter("QuantityUsed")
  public ConsumedMaterial setQuantityUsed(double quantityUsed) {
    this.quantityUsed = quantityUsed;
    return this;
  }

  /**
   * The quantity of material that was consumed for value-added purposes
   * @return QuantityUsed
   */
  @JsonGetter("QuantityUsed")
  public double getQuantityUsed() {
    return quantityUsed;
  }

  /**
   * The quantity of material that was spoiled (consumed, but not for value-added purposes)
   * @param quantitySpoiled the value
   */
  @JsonSetter("QuantitySpoiled")
  public ConsumedMaterial setQuantitySpoiled(double quantitySpoiled) {
    this.quantitySpoiled = quantitySpoiled;
    return this;
  }

  /**
   * The quantity of material that was spoiled (consumed, but not for value-added purposes)
   * @return QuantitySpoiled
   */
  @JsonGetter("QuantitySpoiled")
  public double getQuantitySpoiled() {
    return quantitySpoiled;
  }

  /**
   * The quantity of material remaining in the material package after the consumption event
   * @param remainingQuantity the value
   */
  @JsonSetter("RemainingQuantity")
  public ConsumedMaterial setRemainingQuantity(double remainingQuantity) {
    this.remainingQuantity = remainingQuantity;
    return this;
  }

  /**
   * The quantity of material remaining in the material package after the consumption event
   * @return RemainingQuantity
   */
  @JsonGetter("RemainingQuantity")
  public double getRemainingQuantity() {
    return remainingQuantity;
  }
}
