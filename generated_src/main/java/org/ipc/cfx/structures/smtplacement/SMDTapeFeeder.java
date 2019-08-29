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
   */
  @JsonSetter("BaseUniqueIdentifier")
  public void setBaseUniqueIdentifier(String baseUniqueIdentifier) {
    this.baseUniqueIdentifier = baseUniqueIdentifier;
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
   */
  @JsonSetter("BaseName")
  public void setBaseName(String baseName) {
    this.baseName = baseName;
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
   */
  @JsonSetter("LaneNumber")
  public void setLaneNumber(int laneNumber) {
    this.laneNumber = laneNumber;
  }

  /**
   * For multi-lane tape feeders, this is the number of the position
            of the lane within the feeder.
   */
  @JsonGetter("LaneNumber")
  public int getLaneNumber() {
    return laneNumber;
  }

  /**
   * The width of the tape currently loaded on this feeder (in millimeters)
   */
  @JsonSetter("TapeWidth")
  public void setTapeWidth(double tapeWidth) {
    this.tapeWidth = tapeWidth;
  }

  /**
   * The width of the tape currently loaded on this feeder (in millimeters)
   */
  @JsonGetter("TapeWidth")
  public double getTapeWidth() {
    return tapeWidth;
  }

  /**
   * The pitch (spacing between parts) of the tape currently loaded on this feeder (in millimeters)
   */
  @JsonSetter("TapePitch")
  public void setTapePitch(double tapePitch) {
    this.tapePitch = tapePitch;
  }

  /**
   * The pitch (spacing between parts) of the tape currently loaded on this feeder (in millimeters)
   */
  @JsonGetter("TapePitch")
  public double getTapePitch() {
    return tapePitch;
  }
}
