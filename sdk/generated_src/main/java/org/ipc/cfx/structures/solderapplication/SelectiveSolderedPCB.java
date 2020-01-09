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
package org.ipc.cfx.structures.solderapplication;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Message sent upon completion of the selective soldering process
 * original type: CFX.Structures.SolderApplication.SelectiveSolderedPCB
 */
public class SelectiveSolderedPCB {

  private String unitIdentifier;
  private Integer unitPositionNumber;
  private ZoneData[] zoneData;

  /**
   * Unique ID of Production Unit, Panel, or Carrier
   * @param unitIdentifier the value
   */
  @JsonSetter("UnitIdentifier")
  public SelectiveSolderedPCB setUnitIdentifier(String unitIdentifier) {
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
  public SelectiveSolderedPCB setUnitPositionNumber(Integer unitPositionNumber) {
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
   * Data sepcific to a single zone with the
            Selective Soldering System
   * @param zoneData the value
   */
  @JsonSetter("ZoneData")
  public SelectiveSolderedPCB setZoneData(ZoneData[] zoneData) {
    this.zoneData = zoneData;
    return this;
  }

  /**
   * Data sepcific to a single zone with the
            Selective Soldering System
   * @return ZoneData
   */
  @JsonGetter("ZoneData")
  public ZoneData[] getZoneData() {
    return zoneData;
  }
}
