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
 * Structure representing a production units that has been processed at
            an endpoint involved in the processing of production units.
 * original type: CFX.Structures.ProcessedUnit
 */
public class ProcessedUnit {

  private String unitIdentifier;
  private Integer unitPositionNumber;
  private ProcessingResult unitResult;
  private ProcessData unitProcessData;

  /**
   * Unique ID of Production Unit, Panel, or Carrier
   * @param unitIdentifier the value
   */
  @JsonSetter("UnitIdentifier")
  public ProcessedUnit setUnitIdentifier(String unitIdentifier) {
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
   * Logical reference of production unit as defined by CFX position rule (see CFX standard)
   * @param unitPositionNumber the value
   */
  @JsonSetter("UnitPositionNumber")
  public ProcessedUnit setUnitPositionNumber(Integer unitPositionNumber) {
    this.unitPositionNumber = unitPositionNumber;
    return this;
  }

  /**
   * Logical reference of production unit as defined by CFX position rule (see CFX standard)
   * @return UnitPositionNumber
   */
  @JsonGetter("UnitPositionNumber")
  public Integer getUnitPositionNumber() {
    return unitPositionNumber;
  }

  /**
   * Indicates the overall result of the processing that was performed on the unit.
   * @param unitResult the value
   */
  @JsonSetter("UnitResult")
  public ProcessedUnit setUnitResult(ProcessingResult unitResult) {
    this.unitResult = unitResult;
    return this;
  }

  /**
   * Indicates the overall result of the processing that was performed on the unit.
   * @return UnitResult
   */
  @JsonGetter("UnitResult")
  public ProcessingResult getUnitResult() {
    return unitResult;
  }

  /**
   * Process data specific to this particular production unit.  This may be null if there is 
            no process data specfific to this individual unit.  For example, if all units processed
            during the transaction experienced the same conditions, the UnitsProcessed message will
            contain this information, and the UnitProcessData property will be null.
   * @param unitProcessData the value
   */
  @JsonSetter("UnitProcessData")
  public ProcessedUnit setUnitProcessData(ProcessData unitProcessData) {
    this.unitProcessData = unitProcessData;
    return this;
  }

  /**
   * Process data specific to this particular production unit.  This may be null if there is 
            no process data specfific to this individual unit.  For example, if all units processed
            during the transaction experienced the same conditions, the UnitsProcessed message will
            contain this information, and the UnitProcessData property will be null.
   * @return UnitProcessData
   */
  @JsonGetter("UnitProcessData")
  public ProcessData getUnitProcessData() {
    return unitProcessData;
  }
}
