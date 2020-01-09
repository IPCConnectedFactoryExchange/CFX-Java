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

import org.ipc.cfx.structures.DimensionalConstraints;
import org.ipc.cfx.structures.Endpoint;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Describes the details of a particular Endpoint that is participating in a CFX network, 
            and more specifically, is an SMT placement machine.  This is a dynamic structure.
 * original type: CFX.Structures.SMTPlacement.SMTPlacementEndpoint
 */
public class SMTPlacementEndpoint extends Endpoint {

  private double nominalPlacementCPH;
  private double nominalUnitsPerHour;
  private DimensionalConstraints supportedPCBDimensions;
  private SMTLaneInformation[] lanes;
  private SMTHeadInformation[] heads;
  private SMTPlacementConstraints placementConstraints;

  /**
   * The nominal number of components that this endpoint can place per hour.
   * @param nominalPlacementCPH the value
   */
  @JsonSetter("NominalPlacementCPH")
  public SMTPlacementEndpoint setNominalPlacementCPH(double nominalPlacementCPH) {
    this.nominalPlacementCPH = nominalPlacementCPH;
    return this;
  }

  /**
   * The nominal number of components that this endpoint can place per hour.
   * @return NominalPlacementCPH
   */
  @JsonGetter("NominalPlacementCPH")
  public double getNominalPlacementCPH() {
    return nominalPlacementCPH;
  }

  /**
   * The average (nominal) number of production units per hour this endpoin
            is capable of producing.
   * @param nominalUnitsPerHour the value
   */
  @JsonSetter("NominalUnitsPerHour")
  public SMTPlacementEndpoint setNominalUnitsPerHour(double nominalUnitsPerHour) {
    this.nominalUnitsPerHour = nominalUnitsPerHour;
    return this;
  }

  /**
   * The average (nominal) number of production units per hour this endpoin
            is capable of producing.
   * @return NominalUnitsPerHour
   */
  @JsonGetter("NominalUnitsPerHour")
  public double getNominalUnitsPerHour() {
    return nominalUnitsPerHour;
  }

  /**
   * The maximum and minimum dimensions that a PCB panel or fixture must conform
            to in order to be processed by this SMT Placement machine.
            May be overridden for each lane (see ).
   * @param supportedPCBDimensions the value
   */
  @JsonSetter("SupportedPCBDimensions")
  public SMTPlacementEndpoint setSupportedPCBDimensions(DimensionalConstraints supportedPCBDimensions) {
    this.supportedPCBDimensions = supportedPCBDimensions;
    return this;
  }

  /**
   * The maximum and minimum dimensions that a PCB panel or fixture must conform
            to in order to be processed by this SMT Placement machine.
            May be overridden for each lane (see ).
   * @return SupportedPCBDimensions
   */
  @JsonGetter("SupportedPCBDimensions")
  public DimensionalConstraints getSupportedPCBDimensions() {
    return supportedPCBDimensions;
  }

  /**
   * Information about the production lanes of this SMT placement machine.
   * @param lanes the value
   */
  @JsonSetter("Lanes")
  public SMTPlacementEndpoint setLanes(SMTLaneInformation[] lanes) {
    this.lanes = lanes;
    return this;
  }

  /**
   * Information about the production lanes of this SMT placement machine.
   * @return Lanes
   */
  @JsonGetter("Lanes")
  public SMTLaneInformation[] getLanes() {
    return lanes;
  }

  /**
   * Information about the heads of this SMT placement machine.
   * @param heads the value
   */
  @JsonSetter("Heads")
  public SMTPlacementEndpoint setHeads(SMTHeadInformation[] heads) {
    this.heads = heads;
    return this;
  }

  /**
   * Information about the heads of this SMT placement machine.
   * @return Heads
   */
  @JsonGetter("Heads")
  public SMTHeadInformation[] getHeads() {
    return heads;
  }

  /**
   * The placement constraints / capabilities of this endpoint.
   * @param placementConstraints the value
   */
  @JsonSetter("PlacementConstraints")
  public SMTPlacementEndpoint setPlacementConstraints(SMTPlacementConstraints placementConstraints) {
    this.placementConstraints = placementConstraints;
    return this;
  }

  /**
   * The placement constraints / capabilities of this endpoint.
   * @return PlacementConstraints
   */
  @JsonGetter("PlacementConstraints")
  public SMTPlacementConstraints getPlacementConstraints() {
    return placementConstraints;
  }
}
