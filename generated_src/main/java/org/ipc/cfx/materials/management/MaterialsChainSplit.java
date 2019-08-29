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

import org.ipc.cfx.structures.MaterialPackage;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent when a certain material package chain is is been modified by opening the
            splice plate and therefore create 2 material chains out of one.
            No new material ID will be created during this usecase.
            This use case is operatoed on the station.
 * original type: CFX.Materials.Management.MaterialsChainSplit
 */
public class MaterialsChainSplit extends CFXMessage {

  private MaterialPackage splittedMaterialPackage;
  private MaterialPackage remainingMaterialPackage;

  /**
   * The splitted chain is the packaging unit chain, which is removed from the machine
   */
  @JsonSetter("SplittedMaterialPackage")
  public void setSplittedMaterialPackage(MaterialPackage splittedMaterialPackage) {
    this.splittedMaterialPackage = splittedMaterialPackage;
  }

  /**
   * The splitted chain is the packaging unit chain, which is removed from the machine
   */
  @JsonGetter("SplittedMaterialPackage")
  public MaterialPackage getSplittedMaterialPackage() {
    return splittedMaterialPackage;
  }

  /**
   * The material Chain is the packaging unit chain, which is remaining at the station.
   */
  @JsonSetter("RemainingMaterialPackage")
  public void setRemainingMaterialPackage(MaterialPackage remainingMaterialPackage) {
    this.remainingMaterialPackage = remainingMaterialPackage;
  }

  /**
   * The material Chain is the packaging unit chain, which is remaining at the station.
   */
  @JsonGetter("RemainingMaterialPackage")
  public MaterialPackage getRemainingMaterialPackage() {
    return remainingMaterialPackage;
  }
}
