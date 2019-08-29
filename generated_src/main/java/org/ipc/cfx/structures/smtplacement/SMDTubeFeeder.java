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
package org.ipc.cfx.structures.smtplacement;

import org.ipc.cfx.structures.MaterialCarrier;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Describes and SMT Tube Feeder
 * original type: CFX.Structures.SMTPlacement.SMDTubeFeeder
 */
public class SMDTubeFeeder extends MaterialCarrier {

  private String baseUniqueIdentifier;
  private String baseName;
  private int laneNumber;
  private double width;
  private double pitch;

  /**
   * The unique identifier of the vibratoryb tube feeder base of which this
            tube feeder position is a member.  If lanes are not specifically labeled, 
            both the UniqueIdentifer field and this property should be populated
            with the same value.
   */
  @JsonSetter("BaseUniqueIdentifier")
  public void setBaseUniqueIdentifier(String baseUniqueIdentifier) {
    this.baseUniqueIdentifier = baseUniqueIdentifier;
  }

  /**
   * The unique identifier of the vibratoryb tube feeder base of which this
            tube feeder position is a member.  If lanes are not specifically labeled, 
            both the UniqueIdentifer field and this property should be populated
            with the same value.
   *
   * @return never null
   */
  @JsonGetter("BaseUniqueIdentifier")
  public String getBaseUniqueIdentifier() {
    return baseUniqueIdentifier == null ? "" : baseUniqueIdentifier;
  }

  /**
   * The friendly name of the tube feeder base.
   */
  @JsonSetter("BaseName")
  public void setBaseName(String baseName) {
    this.baseName = baseName;
  }

  /**
   * The friendly name of the tube feeder base.
   *
   * @return never null
   */
  @JsonGetter("BaseName")
  public String getBaseName() {
    return baseName == null ? "" : baseName;
  }

  /**
   * The position number of this tube feeder position within its base.
   */
  @JsonSetter("LaneNumber")
  public void setLaneNumber(int laneNumber) {
    this.laneNumber = laneNumber;
  }

  /**
   * The position number of this tube feeder position within its base.
   */
  @JsonGetter("LaneNumber")
  public int getLaneNumber() {
    return laneNumber;
  }

  /**
   * The width of this lane within the tube feeder (in mm)
   */
  @JsonSetter("Width")
  public void setWidth(double width) {
    this.width = width;
  }

  /**
   * The width of this lane within the tube feeder (in mm)
   */
  @JsonGetter("Width")
  public double getWidth() {
    return width;
  }

  /**
   * The offset between this lane and the next adjacent lane in this tube feeder
   */
  @JsonSetter("Pitch")
  public void setPitch(double pitch) {
    this.pitch = pitch;
  }

  /**
   * The offset between this lane and the next adjacent lane in this tube feeder
   */
  @JsonGetter("Pitch")
  public double getPitch() {
    return pitch;
  }
}
