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

import org.ipc.cfx.structures.smtplacement.SMTPlacementEndpoint;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Describes the details of a particular Endpoint that is participating in a CFX network.
            This is a dynamic structure.
 * original type: CFX.Structures.Endpoint
 */
@JsonTypeInfo(use = Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "$type")
@JsonSubTypes({
  @Type(value = SMTPlacementEndpoint.class, name = "CFX.Structures.SMTPlacement.SMTPlacementEndpoint, CFX"),
})
public class Endpoint {

  private String cFXHandle;
  private String cFXVersion;
  private String requestNetworkUri;
  private String requestTargetAddress;
  private String uniqueIdentifier;
  private String friendlyName;
  private String vendor;
  private String modelNumber;
  private String serialNumber;
  private StageInformation[] stages;
  private int numberOfLanes;
  private HermesInformation hermesInformation;
  private OperatingRequirements operatingRequirements;
  private SupportedTopic[] supportedTopics;

  /**
   * The handle of the endpoint that is responding
   * @param cFXHandle the value
   */
  @JsonSetter("CFXHandle")
  public Endpoint setCFXHandle(String cFXHandle) {
    this.cFXHandle = cFXHandle;
    return this;
  }

  /**
   * The handle of the endpoint that is responding
   *
   * @return never null
   */
  @JsonGetter("CFXHandle")
  public String getCFXHandle() {
    return cFXHandle == null ? "" : cFXHandle;
  }

  /**
   * The version of CFX supported / utilized by this endpoint
   * @param cFXVersion the value
   */
  @JsonSetter("CFXVersion")
  public Endpoint setCFXVersion(String cFXVersion) {
    this.cFXVersion = cFXVersion;
    return this;
  }

  /**
   * The version of CFX supported / utilized by this endpoint
   *
   * @return never null
   */
  @JsonGetter("CFXVersion")
  public String getCFXVersion() {
    return cFXVersion == null ? "" : cFXVersion;
  }

  /**
   * The network address / Uri to be used for requests to this endpoint
   * @param requestNetworkUri the value
   */
  @JsonSetter("RequestNetworkUri")
  public Endpoint setRequestNetworkUri(String requestNetworkUri) {
    this.requestNetworkUri = requestNetworkUri;
    return this;
  }

  /**
   * The network address / Uri to be used for requests to this endpoint
   *
   * @return never null
   */
  @JsonGetter("RequestNetworkUri")
  public String getRequestNetworkUri() {
    return requestNetworkUri == null ? "" : requestNetworkUri;
  }

  /**
   * The AMQP 1.0 target address to be used for requests to this endpoint
   * @param requestTargetAddress the value
   */
  @JsonSetter("RequestTargetAddress")
  public Endpoint setRequestTargetAddress(String requestTargetAddress) {
    this.requestTargetAddress = requestTargetAddress;
    return this;
  }

  /**
   * The AMQP 1.0 target address to be used for requests to this endpoint
   *
   * @return never null
   */
  @JsonGetter("RequestTargetAddress")
  public String getRequestTargetAddress() {
    return requestTargetAddress == null ? "" : requestTargetAddress;
  }

  /**
   * The barcode, RFID, or other unique identifier that is used to identify this machine / endpoint.
   * @param uniqueIdentifier the value
   */
  @JsonSetter("UniqueIdentifier")
  public Endpoint setUniqueIdentifier(String uniqueIdentifier) {
    this.uniqueIdentifier = uniqueIdentifier;
    return this;
  }

  /**
   * The barcode, RFID, or other unique identifier that is used to identify this machine / endpoint.
   *
   * @return never null
   */
  @JsonGetter("UniqueIdentifier")
  public String getUniqueIdentifier() {
    return uniqueIdentifier == null ? "" : uniqueIdentifier;
  }

  /**
   * The name of the endpoint to be used in GUIs or reporting
   * @param friendlyName the value
   */
  @JsonSetter("FriendlyName")
  public Endpoint setFriendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
    return this;
  }

  /**
   * The name of the endpoint to be used in GUIs or reporting
   *
   * @return never null
   */
  @JsonGetter("FriendlyName")
  public String getFriendlyName() {
    return friendlyName == null ? "" : friendlyName;
  }

  /**
   * The name of the vendor of the endpoint.
   * @param vendor the value
   */
  @JsonSetter("Vendor")
  public Endpoint setVendor(String vendor) {
    this.vendor = vendor;
    return this;
  }

  /**
   * The name of the vendor of the endpoint.
   *
   * @return never null
   */
  @JsonGetter("Vendor")
  public String getVendor() {
    return vendor == null ? "" : vendor;
  }

  /**
   * The model number of the endpoint
   * @param modelNumber the value
   */
  @JsonSetter("ModelNumber")
  public Endpoint setModelNumber(String modelNumber) {
    this.modelNumber = modelNumber;
    return this;
  }

  /**
   * The model number of the endpoint
   *
   * @return never null
   */
  @JsonGetter("ModelNumber")
  public String getModelNumber() {
    return modelNumber == null ? "" : modelNumber;
  }

  /**
   * The serial number of the endpoint
   * @param serialNumber the value
   */
  @JsonSetter("SerialNumber")
  public Endpoint setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  /**
   * The serial number of the endpoint
   *
   * @return never null
   */
  @JsonGetter("SerialNumber")
  public String getSerialNumber() {
    return serialNumber == null ? "" : serialNumber;
  }

  /**
   * Describes the stages (zones) of the endpoint, including buffer stages.
   * @param stages the value
   */
  @JsonSetter("Stages")
  public Endpoint setStages(StageInformation[] stages) {
    this.stages = stages;
    return this;
  }

  /**
   * Describes the stages (zones) of the endpoint, including buffer stages.
   * @return Stages
   */
  @JsonGetter("Stages")
  public StageInformation[] getStages() {
    return stages;
  }

  /**
   * The number of production lanes of the endpoint
   * @param numberOfLanes the value
   */
  @JsonSetter("NumberOfLanes")
  public Endpoint setNumberOfLanes(int numberOfLanes) {
    this.numberOfLanes = numberOfLanes;
    return this;
  }

  /**
   * The number of production lanes of the endpoint
   * @return NumberOfLanes
   */
  @JsonGetter("NumberOfLanes")
  public int getNumberOfLanes() {
    return numberOfLanes;
  }

  /**
   * Contains information related to the Endpoint&apos;s support for the Hermes standard.
            If null, the Endpoint does not support Hermes.
   * @param hermesInformation the value
   */
  @JsonSetter("HermesInformation")
  public Endpoint setHermesInformation(HermesInformation hermesInformation) {
    this.hermesInformation = hermesInformation;
    return this;
  }

  /**
   * Contains information related to the Endpoint&apos;s support for the Hermes standard.
            If null, the Endpoint does not support Hermes.
   * @return HermesInformation
   */
  @JsonGetter("HermesInformation")
  public HermesInformation getHermesInformation() {
    return hermesInformation;
  }

  /**
   * Specifies the operating requirements (environmental, etc.) of a given endpoint.
            May be null if not applicable.
   * @param operatingRequirements the value
   */
  @JsonSetter("OperatingRequirements")
  public Endpoint setOperatingRequirements(OperatingRequirements operatingRequirements) {
    this.operatingRequirements = operatingRequirements;
    return this;
  }

  /**
   * Specifies the operating requirements (environmental, etc.) of a given endpoint.
            May be null if not applicable.
   * @return OperatingRequirements
   */
  @JsonGetter("OperatingRequirements")
  public OperatingRequirements getOperatingRequirements() {
    return operatingRequirements;
  }

  /**
   * A list of the s structures describing the level of support for this endpoint
   * @param supportedTopics the value
   */
  @JsonSetter("SupportedTopics")
  public Endpoint setSupportedTopics(SupportedTopic[] supportedTopics) {
    this.supportedTopics = supportedTopics;
    return this;
  }

  /**
   * A list of the s structures describing the level of support for this endpoint
   * @return SupportedTopics
   */
  @JsonGetter("SupportedTopics")
  public SupportedTopic[] getSupportedTopics() {
    return supportedTopics;
  }
}
