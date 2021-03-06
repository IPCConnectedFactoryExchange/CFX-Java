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
package org.ipc.cfx.structures.smtplacement;

import org.ipc.cfx.structures.MaterialCarrier;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Describes an SMT Tape feeder.
 * original type: CFX.Structures.SMTPlacement.SMDTapeFeeder
 */
public class SMDTapeFeeder extends MaterialCarrier {

  private String baseUniqueIdentifier;
  private String baseName;
  private int laneNumber;
  private double tapeWidth;
  private double tapePitch;

  /**
   * For multi-lane feeders, the unique identifier of the base.  The UniqueIdentifier
            property should be populated with the unique identifer of the specific lane 
            within the feeder (if so labeled).  If lanes are not specifically labeled, both
            the UniqueIdentifer and BaseUniqueIdentifier prooperties should be populated
            with the same value.
   * @param baseUniqueIdentifier the value
   */
  @JsonSetter("BaseUniqueIdentifier")
  public SMDTapeFeeder setBaseUniqueIdentifier(String baseUniqueIdentifier) {
    this.baseUniqueIdentifier = baseUniqueIdentifier;
    return this;
  }

  /**
   * For multi-lane feeders, the unique identifier of the base.  The UniqueIdentifier
            property should be populated with the unique identifer of the specific lane 
            within the feeder (if so labeled).  If lanes are not specifically labeled, both
            the UniqueIdentifer and BaseUniqueIdentifier prooperties should be populated
            with the same value.
   *
   * @return never null
   */
  @JsonGetter("BaseUniqueIdentifier")
  public String getBaseUniqueIdentifier() {
    return baseUniqueIdentifier == null ? "" : baseUniqueIdentifier;
  }

  /**
   * The friendly name of the tape feeder base.
   * @param baseName the value
   */
  @JsonSetter("BaseName")
  public SMDTapeFeeder setBaseName(String baseName) {
    this.baseName = baseName;
    return this;
  }

  /**
   * The friendly name of the tape feeder base.
   *
   * @return never null
   */
  @JsonGetter("BaseName")
  public String getBaseName() {
    return baseName == null ? "" : baseName;
  }

  /**
   * For multi-lane tape feeders, this is the number of the position
            of the lane within the feeder.
   * @param laneNumber the value
   */
  @JsonSetter("LaneNumber")
  public SMDTapeFeeder setLaneNumber(int laneNumber) {
    this.laneNumber = laneNumber;
    return this;
  }

  /**
   * For multi-lane tape feeders, this is the number of the position
            of the lane within the feeder.
   * @return LaneNumber
   */
  @JsonGetter("LaneNumber")
  public int getLaneNumber() {
    return laneNumber;
  }

  /**
   * The width of the tape currently loaded on this feeder (in millimeters)
   * @param tapeWidth the value
   */
  @JsonSetter("TapeWidth")
  public SMDTapeFeeder setTapeWidth(double tapeWidth) {
    this.tapeWidth = tapeWidth;
    return this;
  }

  /**
   * The width of the tape currently loaded on this feeder (in millimeters)
   * @return TapeWidth
   */
  @JsonGetter("TapeWidth")
  public double getTapeWidth() {
    return tapeWidth;
  }

  /**
   * The pitch (spacing between parts) of the tape currently loaded on this feeder (in millimeters)
   * @param tapePitch the value
   */
  @JsonSetter("TapePitch")
  public SMDTapeFeeder setTapePitch(double tapePitch) {
    this.tapePitch = tapePitch;
    return this;
  }

  /**
   * The pitch (spacing between parts) of the tape currently loaded on this feeder (in millimeters)
   * @return TapePitch
   */
  @JsonGetter("TapePitch")
  public double getTapePitch() {
    return tapePitch;
  }
}
