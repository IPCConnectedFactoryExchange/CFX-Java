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

import java.util.Date;
import org.ipc.cfx.structures.smtplacement.SMTNonInstalledComponent;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Describes a particular location on a production unit where materials / parts were not installed.
 * original type: CFX.Structures.NonInstalledComponent
 */
@JsonTypeInfo(use = Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "$type")
@JsonSubTypes({
  @Type(value = SMTNonInstalledComponent.class, name = "CFX.Structures.SMTPlacement.SMTNonInstalledComponent, CFX"),
})
public class NonInstalledComponent {

  private String referenceDesignator;
  private Date nonInstallationTime;
  private NonInstalledComponentLocation location;
  private String rejectionBoxId;
  private String rejectionComment;
  private RejectionReason rejectionReason;
  private RejectionDetails rejectionDetails;

  /**
   * Location on production unit where material / parts were installed
   * @param referenceDesignator the value
   */
  @JsonSetter("ReferenceDesignator")
  public NonInstalledComponent setReferenceDesignator(String referenceDesignator) {
    this.referenceDesignator = referenceDesignator;
    return this;
  }

  /**
   * Location on production unit where material / parts were installed
   *
   * @return never null
   */
  @JsonGetter("ReferenceDesignator")
  public String getReferenceDesignator() {
    return referenceDesignator == null ? "" : referenceDesignator;
  }

  /**
   * The specific time when this material / part was tried to be installed on the production unit (optional, when known)
   * @param nonInstallationTime the value
   */
  @JsonSetter("NonInstallationTime")
  public NonInstalledComponent setNonInstallationTime(Date nonInstallationTime) {
    this.nonInstallationTime = nonInstallationTime;
    return this;
  }

  /**
   * The specific time when this material / part was tried to be installed on the production unit (optional, when known)
   * @return NonInstallationTime
   */
  @JsonGetter("NonInstallationTime")
  public Date getNonInstallationTime() {
    return nonInstallationTime;
  }

  /**
   * The final location of the component that has not been installed
   * @param location the value
   */
  @JsonSetter("Location")
  public NonInstalledComponent setLocation(NonInstalledComponentLocation location) {
    this.location = location;
    return this;
  }

  /**
   * The final location of the component that has not been installed
   * @return Location
   */
  @JsonGetter("Location")
  public NonInstalledComponentLocation getLocation() {
    return location;
  }

  /**
   * Id of the rejection box where the component has been rejected (if applicable)
   * @param rejectionBoxId the value
   */
  @JsonSetter("RejectionBoxId")
  public NonInstalledComponent setRejectionBoxId(String rejectionBoxId) {
    this.rejectionBoxId = rejectionBoxId;
    return this;
  }

  /**
   * Id of the rejection box where the component has been rejected (if applicable)
   *
   * @return never null
   */
  @JsonGetter("RejectionBoxId")
  public String getRejectionBoxId() {
    return rejectionBoxId == null ? "" : rejectionBoxId;
  }

  /**
   * A comment on the rejection
   * @param rejectionComment the value
   */
  @JsonSetter("RejectionComment")
  public NonInstalledComponent setRejectionComment(String rejectionComment) {
    this.rejectionComment = rejectionComment;
    return this;
  }

  /**
   * A comment on the rejection
   *
   * @return never null
   */
  @JsonGetter("RejectionComment")
  public String getRejectionComment() {
    return rejectionComment == null ? "" : rejectionComment;
  }

  /**
   * The reason of the rejection of this component (Unknown if not known)
   * @param rejectionReason the value
   */
  @JsonSetter("RejectionReason")
  public NonInstalledComponent setRejectionReason(RejectionReason rejectionReason) {
    this.rejectionReason = rejectionReason;
    return this;
  }

  /**
   * The reason of the rejection of this component (Unknown if not known)
   * @return RejectionReason
   */
  @JsonGetter("RejectionReason")
  public RejectionReason getRejectionReason() {
    return rejectionReason;
  }

  /**
   * The rejection details, depending on the rejection reason (optional)
   * @param rejectionDetails the value
   */
  @JsonSetter("RejectionDetails")
  public NonInstalledComponent setRejectionDetails(RejectionDetails rejectionDetails) {
    this.rejectionDetails = rejectionDetails;
    return this;
  }

  /**
   * The rejection details, depending on the rejection reason (optional)
   * @return RejectionDetails
   */
  @JsonGetter("RejectionDetails")
  public RejectionDetails getRejectionDetails() {
    return rejectionDetails;
  }
}
