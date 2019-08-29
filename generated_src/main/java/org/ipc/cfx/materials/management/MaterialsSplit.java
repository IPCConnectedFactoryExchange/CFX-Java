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

import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent when a a certain quantity of material is removed from a material package
            to form a new material package.  The sum of the new quantities of the old and 
            new material package packages should equal the quantity of the original package.
            
            {
              "SourceMaterialPackageIdentifier": "MAT4566589856",
              "SourceMaterialPackageRemainingQuantity": 121.0,
              "NewMaterialPackageIdentifier": "MAT4563453457",
              "NewMaterialPackageQuantity": 30.0
            }
 * original type: CFX.Materials.Management.MaterialsSplit
 */
public class MaterialsSplit extends CFXMessage {

  private String sourceMaterialPackageIdentifier;
  private double sourceMaterialPackageRemainingQuantity;
  private String newMaterialPackageIdentifier;
  private double newMaterialPackageQuantity;

  /**
   * The unique identifier of the original material package that is being divided
   */
  @JsonSetter("SourceMaterialPackageIdentifier")
  public void setSourceMaterialPackageIdentifier(String sourceMaterialPackageIdentifier) {
    this.sourceMaterialPackageIdentifier = sourceMaterialPackageIdentifier;
  }

  /**
   * The unique identifier of the original material package that is being divided
   *
   * @return never null
   */
  @JsonGetter("SourceMaterialPackageIdentifier")
  public String getSourceMaterialPackageIdentifier() {
    return sourceMaterialPackageIdentifier == null ? "" : sourceMaterialPackageIdentifier;
  }

  /**
   * The quantity of material remaining in the original material package after
            it was divided
   */
  @JsonSetter("SourceMaterialPackageRemainingQuantity")
  public void setSourceMaterialPackageRemainingQuantity(double sourceMaterialPackageRemainingQuantity) {
    this.sourceMaterialPackageRemainingQuantity = sourceMaterialPackageRemainingQuantity;
  }

  /**
   * The quantity of material remaining in the original material package after
            it was divided
   */
  @JsonGetter("SourceMaterialPackageRemainingQuantity")
  public double getSourceMaterialPackageRemainingQuantity() {
    return sourceMaterialPackageRemainingQuantity;
  }

  /**
   * The unique identifier of the newly created material package
   */
  @JsonSetter("NewMaterialPackageIdentifier")
  public void setNewMaterialPackageIdentifier(String newMaterialPackageIdentifier) {
    this.newMaterialPackageIdentifier = newMaterialPackageIdentifier;
  }

  /**
   * The unique identifier of the newly created material package
   *
   * @return never null
   */
  @JsonGetter("NewMaterialPackageIdentifier")
  public String getNewMaterialPackageIdentifier() {
    return newMaterialPackageIdentifier == null ? "" : newMaterialPackageIdentifier;
  }

  /**
   * The amount of material contained within newly created material package
   */
  @JsonSetter("NewMaterialPackageQuantity")
  public void setNewMaterialPackageQuantity(double newMaterialPackageQuantity) {
    this.newMaterialPackageQuantity = newMaterialPackageQuantity;
  }

  /**
   * The amount of material contained within newly created material package
   */
  @JsonGetter("NewMaterialPackageQuantity")
  public double getNewMaterialPackageQuantity() {
    return newMaterialPackageQuantity;
  }
}
