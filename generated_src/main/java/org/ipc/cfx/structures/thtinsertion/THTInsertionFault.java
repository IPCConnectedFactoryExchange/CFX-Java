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
package org.ipc.cfx.structures.thtinsertion;

import org.ipc.cfx.structures.ComponentDesignator;
import org.ipc.cfx.structures.MaterialLocation;
import org.ipc.cfx.structures.Fault;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * A specific type of fault that is produced by endpoints responsible
            for the insertion of through-hole electronic components (THT insertion)
 * original type: CFX.Structures.THTInsertion.THTInsertionFault
 */
public class THTInsertionFault extends Fault {

  private THTInsertionFaultType insertionFaultType;
  private int programStep;
  private ComponentDesignator designator;
  private MaterialLocation materialLocation;

  /**
   * The specific type of THT fault
   */
  @JsonSetter("InsertionFaultType")
  public void setInsertionFaultType(THTInsertionFaultType insertionFaultType) {
    this.insertionFaultType = insertionFaultType;
  }

  /**
   * The specific type of THT fault
   */
  @JsonGetter("InsertionFaultType")
  public THTInsertionFaultType getInsertionFaultType() {
    return insertionFaultType;
  }

  /**
   * An integer representing the step in the program/recipe that was
            being executed when the fault occurred  (where applicable)
   */
  @JsonSetter("ProgramStep")
  public void setProgramStep(int programStep) {
    this.programStep = programStep;
  }

  /**
   * An integer representing the step in the program/recipe that was
            being executed when the fault occurred  (where applicable)
   */
  @JsonGetter("ProgramStep")
  public int getProgramStep() {
    return programStep;
  }

  /**
   * Identifies the specific component the inserter was trying to insert
            when the fault occurred  (where applicable)
   */
  @JsonSetter("Designator")
  public void setDesignator(ComponentDesignator designator) {
    this.designator = designator;
  }

  /**
   * Identifies the specific component the inserter was trying to insert
            when the fault occurred  (where applicable)
   */
  @JsonGetter("Designator")
  public ComponentDesignator getDesignator() {
    return designator;
  }

  /**
   * The material carrier location related to this fault (where applicable)
   */
  @JsonSetter("MaterialLocation")
  public void setMaterialLocation(MaterialLocation materialLocation) {
    this.materialLocation = materialLocation;
  }

  /**
   * The material carrier location related to this fault (where applicable)
   */
  @JsonGetter("MaterialLocation")
  public MaterialLocation getMaterialLocation() {
    return materialLocation;
  }
}
