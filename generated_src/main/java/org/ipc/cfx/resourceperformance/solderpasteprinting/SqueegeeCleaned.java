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
package org.ipc.cfx.resourceperformance.solderpasteprinting;

import org.ipc.cfx.structures.solderpasteprinting.SMTSqueegee;
import org.ipc.cfx.structures.solderpasteprinting.SMTSqueegeeCleanType;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Indicates that a squeegee clean operation has been performed
            
            {
              "Squeegee": {
                "UniqueIdentifier": "UID23432434",
                "Name": "STENCIL234343"
              },
              "SqueegeeCleanType": "Normal",
              "TimeSinceLastClean": "00:33:00",
              "CyclesSinceLastClean": 35,
              "SqueegeeCleanCycles": 2,
              "SqueegeeCleanTime": "00:00:38"
            }
 * original type: CFX.ResourcePerformance.SolderPastePrinting.SqueegeeCleaned
 */
public class SqueegeeCleaned extends CFXMessage {

  private SMTSqueegee squeegee;
  private SMTSqueegeeCleanType squeegeeCleanType;
  private long timeSinceLastClean;
  private int cyclesSinceLastClean;
  private int squeegeeCleanCycles;
  private long squeegeeCleanTime;

  /**
   * Identifies the squeegee that has been cleaned
   */
  @JsonSetter("Squeegee")
  public void setSqueegee(SMTSqueegee squeegee) {
    this.squeegee = squeegee;
  }

  /**
   * Identifies the squeegee that has been cleaned
   */
  @JsonGetter("Squeegee")
  public SMTSqueegee getSqueegee() {
    return squeegee;
  }

  /**
   * An enumeration indicating the type of clean that was performed
   */
  @JsonSetter("SqueegeeCleanType")
  public void setSqueegeeCleanType(SMTSqueegeeCleanType squeegeeCleanType) {
    this.squeegeeCleanType = squeegeeCleanType;
  }

  /**
   * An enumeration indicating the type of clean that was performed
   */
  @JsonGetter("SqueegeeCleanType")
  public SMTSqueegeeCleanType getSqueegeeCleanType() {
    return squeegeeCleanType;
  }

  /**
   * Indicates the length of time that has ellapsed since the last time
            the squeegee was cleaned
   */
  @JsonSetter("TimeSinceLastClean")
  public void setTimeSinceLastClean(long timeSinceLastClean) {
    this.timeSinceLastClean = timeSinceLastClean;
  }

  /**
   * Indicates the length of time that has ellapsed since the last time
            the squeegee was cleaned
   */
  @JsonGetter("TimeSinceLastClean")
  public long getTimeSinceLastClean() {
    return timeSinceLastClean;
  }

  /**
   * Indicates how many printing cycles have been completed since the last
            time the squeegee was cleaned
   */
  @JsonSetter("CyclesSinceLastClean")
  public void setCyclesSinceLastClean(int cyclesSinceLastClean) {
    this.cyclesSinceLastClean = cyclesSinceLastClean;
  }

  /**
   * Indicates how many printing cycles have been completed since the last
            time the squeegee was cleaned
   */
  @JsonGetter("CyclesSinceLastClean")
  public int getCyclesSinceLastClean() {
    return cyclesSinceLastClean;
  }

  /**
   * Indicates the total number of squeegee cleaning cycles that
            have been performed since this squeegee was loaded.
   */
  @JsonSetter("SqueegeeCleanCycles")
  public void setSqueegeeCleanCycles(int squeegeeCleanCycles) {
    this.squeegeeCleanCycles = squeegeeCleanCycles;
  }

  /**
   * Indicates the total number of squeegee cleaning cycles that
            have been performed since this squeegee was loaded.
   */
  @JsonGetter("SqueegeeCleanCycles")
  public int getSqueegeeCleanCycles() {
    return squeegeeCleanCycles;
  }

  /**
   * Indicates the total amount of time that it took to perform this squeegee clean operation
   */
  @JsonSetter("SqueegeeCleanTime")
  public void setSqueegeeCleanTime(long squeegeeCleanTime) {
    this.squeegeeCleanTime = squeegeeCleanTime;
  }

  /**
   * Indicates the total amount of time that it took to perform this squeegee clean operation
   */
  @JsonGetter("SqueegeeCleanTime")
  public long getSqueegeeCleanTime() {
    return squeegeeCleanTime;
  }
}
