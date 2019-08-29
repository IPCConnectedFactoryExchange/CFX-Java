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
   */
  @JsonSetter("NominalPlacementCPH")
  public void setNominalPlacementCPH(double nominalPlacementCPH) {
    this.nominalPlacementCPH = nominalPlacementCPH;
  }

  /**
   * The nominal number of components that this endpoint can place per hour.
   */
  @JsonGetter("NominalPlacementCPH")
  public double getNominalPlacementCPH() {
    return nominalPlacementCPH;
  }

  /**
   * The average (nominal) number of production units per hour this endpoin
            is capable of producing.
   */
  @JsonSetter("NominalUnitsPerHour")
  public void setNominalUnitsPerHour(double nominalUnitsPerHour) {
    this.nominalUnitsPerHour = nominalUnitsPerHour;
  }

  /**
   * The average (nominal) number of production units per hour this endpoin
            is capable of producing.
   */
  @JsonGetter("NominalUnitsPerHour")
  public double getNominalUnitsPerHour() {
    return nominalUnitsPerHour;
  }

  /**
   * The maximum and minimum dimensions that a PCB panel or fixture must conform
            to in order to be processed by this SMT Placement machine.
            May be overridden for each lane (see ).
   */
  @JsonSetter("SupportedPCBDimensions")
  public void setSupportedPCBDimensions(DimensionalConstraints supportedPCBDimensions) {
    this.supportedPCBDimensions = supportedPCBDimensions;
  }

  /**
   * The maximum and minimum dimensions that a PCB panel or fixture must conform
            to in order to be processed by this SMT Placement machine.
            May be overridden for each lane (see ).
   */
  @JsonGetter("SupportedPCBDimensions")
  public DimensionalConstraints getSupportedPCBDimensions() {
    return supportedPCBDimensions;
  }

  /**
   * Information about the production lanes of this SMT placement machine.
   */
  @JsonSetter("Lanes")
  public void setLanes(SMTLaneInformation[] lanes) {
    this.lanes = lanes;
  }

  /**
   * Information about the production lanes of this SMT placement machine.
   */
  @JsonGetter("Lanes")
  public SMTLaneInformation[] getLanes() {
    return lanes;
  }

  /**
   * Information about the heads of this SMT placement machine.
   */
  @JsonSetter("Heads")
  public void setHeads(SMTHeadInformation[] heads) {
    this.heads = heads;
  }

  /**
   * Information about the heads of this SMT placement machine.
   */
  @JsonGetter("Heads")
  public SMTHeadInformation[] getHeads() {
    return heads;
  }

  /**
   * The placement constraints / capabilities of this endpoint.
   */
  @JsonSetter("PlacementConstraints")
  public void setPlacementConstraints(SMTPlacementConstraints placementConstraints) {
    this.placementConstraints = placementConstraints;
  }

  /**
   * The placement constraints / capabilities of this endpoint.
   */
  @JsonGetter("PlacementConstraints")
  public SMTPlacementConstraints getPlacementConstraints() {
    return placementConstraints;
  }
}