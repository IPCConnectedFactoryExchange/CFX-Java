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

import org.ipc.cfx.structures.solderreflow.ReflowZone;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * 
 * original type: CFX.Structures.Stage
 */
@JsonTypeInfo(use = Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "$type")
@JsonSubTypes({
  @Type(value = ReflowZone.class, name = "CFX.Structures.SolderReflow.ReflowZone, CFX"),
})
public class Stage {

  private int stageSequence;
  private String stageName;
  private StageType stageType;

  /**
   * Sequence of this stage in the machine
   * @param stageSequence the value
   */
  @JsonSetter("StageSequence")
  public Stage setStageSequence(int stageSequence) {
    this.stageSequence = stageSequence;
    return this;
  }

  /**
   * Sequence of this stage in the machine
   * @return StageSequence
   */
  @JsonGetter("StageSequence")
  public int getStageSequence() {
    return stageSequence;
  }

  /**
   * A friendlly name for this stage
   * @param stageName the value
   */
  @JsonSetter("StageName")
  public Stage setStageName(String stageName) {
    this.stageName = stageName;
    return this;
  }

  /**
   * A friendlly name for this stage
   *
   * @return never null
   */
  @JsonGetter("StageName")
  public String getStageName() {
    return stageName == null ? "" : stageName;
  }

  /**
   * An enumeration indicating the purpose of this particular stage
   * @param stageType the value
   */
  @JsonSetter("StageType")
  public Stage setStageType(StageType stageType) {
    this.stageType = stageType;
    return this;
  }

  /**
   * An enumeration indicating the purpose of this particular stage
   * @return StageType
   */
  @JsonGetter("StageType")
  public StageType getStageType() {
    return stageType;
  }
}
