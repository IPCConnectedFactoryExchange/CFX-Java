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
package org.ipc.cfx.structures.lasermarking;

import org.ipc.cfx.structures.ProcessData;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Provides information about the conditions within a reflow oven at a given point in time.
 * original type: CFX.Structures.LaserMarking.LaserMarkingProcessData
 */
public class LaserMarkingProcessData extends ProcessData {

  private long laserProcessingTime;
  private String recipeName;

  /**
   * Total amount of time that the laser was used during processing.
   * @param laserProcessingTime the value
   */
  @JsonSetter("LaserProcessingTime")
  public LaserMarkingProcessData setLaserProcessingTime(long laserProcessingTime) {
    this.laserProcessingTime = laserProcessingTime;
    return this;
  }

  /**
   * Total amount of time that the laser was used during processing.
   * @return LaserProcessingTime
   */
  @JsonGetter("LaserProcessingTime")
  public long getLaserProcessingTime() {
    return laserProcessingTime;
  }

  /**
   * The name of the active recipe at the time when the processing occurred.
   * @param recipeName the value
   */
  @JsonSetter("RecipeName")
  public LaserMarkingProcessData setRecipeName(String recipeName) {
    this.recipeName = recipeName;
    return this;
  }

  /**
   * The name of the active recipe at the time when the processing occurred.
   *
   * @return never null
   */
  @JsonGetter("RecipeName")
  public String getRecipeName() {
    return recipeName == null ? "" : recipeName;
  }
}
