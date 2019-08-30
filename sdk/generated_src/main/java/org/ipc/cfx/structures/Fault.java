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
 * created: 30.08.2019 09:11:09 by frankp
 */
package org.ipc.cfx.structures;

import org.ipc.cfx.structures.thtinsertion.THTInsertionFault;
import org.ipc.cfx.structures.solderreflow.ReflowOvenFault;
import org.ipc.cfx.structures.solderpasteprinting.SMTSolderPastePrintingFault;
import org.ipc.cfx.structures.smtplacement.SMTPlacementFault;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import java.util.UUID;
import java.util.Map;
import java.util.HashMap;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * A dynamic structure which describes a fault that has occurred in the course of production.
            May be one of:  , ,
            , or
 * original type: CFX.Structures.Fault
 */
@JsonTypeInfo(use = Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "$type")
@JsonSubTypes({
  @Type(value = THTInsertionFault.class, name = "CFX.Structures.THTInsertion.THTInsertionFault, CFX"),
  @Type(value = ReflowOvenFault.class, name = "CFX.Structures.SolderReflow.ReflowOvenFault, CFX"),
  @Type(value = SMTSolderPastePrintingFault.class, name = "CFX.Structures.SolderPastePrinting.SMTSolderPastePrintingFault, CFX"),
  @Type(value = SMTPlacementFault.class, name = "CFX.Structures.SMTPlacement.SMTPlacementFault, CFX"),
})
public class Fault {

  private FaultCause cause;
  private FaultSeverity severity;
  private String faultCode;
  private UUID faultOccurrenceId;
  private Integer lane;
  private Stage stage;
  private SideLocation sideLocation;
  private AccessType accessType;
  private String description;
  private Map<String, String> descriptionTranslations;
  private Date occurredAt;
  private Date dueDateTime;

  /**
   * The cause of this fault.
   * @param cause the value
   */
  @JsonSetter("Cause")
  public void setCause(FaultCause cause) {
    this.cause = cause;
  }

  /**
   * The cause of this fault.
   * @return Cause
   */
  @JsonGetter("Cause")
  public FaultCause getCause() {
    return cause;
  }

  /**
   * The severity of the fault
   * @param severity the value
   */
  @JsonSetter("Severity")
  public void setSeverity(FaultSeverity severity) {
    this.severity = severity;
  }

  /**
   * The severity of the fault
   * @return Severity
   */
  @JsonGetter("Severity")
  public FaultSeverity getSeverity() {
    return severity;
  }

  /**
   * An endpoint specific code indicating the nature of the fault
   * @param faultCode the value
   */
  @JsonSetter("FaultCode")
  public void setFaultCode(String faultCode) {
    this.faultCode = faultCode;
  }

  /**
   * An endpoint specific code indicating the nature of the fault
   *
   * @return never null
   */
  @JsonGetter("FaultCode")
  public String getFaultCode() {
    return faultCode == null ? "" : faultCode;
  }

  /**
   * A 128-bit unique identifier which uniquely identifier this specific 
            occurrence of the fault
   * @param faultOccurrenceId the value
   */
  @JsonSetter("FaultOccurrenceId")
  public void setFaultOccurrenceId(UUID faultOccurrenceId) {
    this.faultOccurrenceId = faultOccurrenceId;
  }

  /**
   * A 128-bit unique identifier which uniquely identifier this specific 
            occurrence of the fault
   * @return FaultOccurrenceId
   */
  @JsonGetter("FaultOccurrenceId")
  public UUID getFaultOccurrenceId() {
    return faultOccurrenceId;
  }

  /**
   * The production lane related to this fault (if applicable)
   * @param lane the value
   */
  @JsonSetter("Lane")
  public void setLane(Integer lane) {
    this.lane = lane;
  }

  /**
   * The production lane related to this fault (if applicable)
   * @return Lane
   */
  @JsonGetter("Lane")
  public Integer getLane() {
    return lane;
  }

  /**
   * The production stage related to this fualt (if applicable)
   * @param stage the value
   */
  @JsonSetter("Stage")
  public void setStage(Stage stage) {
    this.stage = stage;
  }

  /**
   * The production stage related to this fualt (if applicable)
   * @return Stage
   */
  @JsonGetter("Stage")
  public Stage getStage() {
    return stage;
  }

  /**
   * The Side location is giving an indication for the operator from which side in transport direction of the PCB unit
            the fault or error can be accessed and fixed.
   * @param sideLocation the value
   */
  @JsonSetter("SideLocation")
  public void setSideLocation(SideLocation sideLocation) {
    this.sideLocation = sideLocation;
  }

  /**
   * The Side location is giving an indication for the operator from which side in transport direction of the PCB unit
            the fault or error can be accessed and fixed.
   * @return SideLocation
   */
  @JsonGetter("SideLocation")
  public SideLocation getSideLocation() {
    return sideLocation;
  }

  /**
   * 
   * @param accessType the value
   */
  @JsonSetter("AccessType")
  public void setAccessType(AccessType accessType) {
    this.accessType = accessType;
  }

  /**
   * 
   * @return AccessType
   */
  @JsonGetter("AccessType")
  public AccessType getAccessType() {
    return accessType;
  }

  /**
   * Gets or sets the description of the fault in English.
             Max length of value is 1024 characters which might include multi-line text.
   * @param description the value
   */
  @JsonSetter("Description")
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Gets or sets the description of the fault in English.
             Max length of value is 1024 characters which might include multi-line text.
   *
   * @return never null
   */
  @JsonGetter("Description")
  public String getDescription() {
    return description == null ? "" : description;
  }

  /**
   * Gets or sets the description translations for other languages than English.
            This is a dictionary of language tags and the corresponding translation in that language.
            The key values are either Cultures or Locales as defined in
            
            Culture
            names and identifiers
            
            .
            
            Max length of key is 10 characters.
            
            Max length of value is 1024 characters which might include multi-line text.
            
            Filling this collection is optional.
            The CultureInfo class specifies a unique name for each culture, based on RFC 4646.
            The name is a combination of an ISO 639 two-letter lowercase culture code associated with a language and an
            ISO 3166 two-letter uppercase subculture code associated with a country or region.
            
            The language needs to be associated with the particular region where it is spoken,
            and this is done by using locale (language + location). For example: fr is the code for French language.
            fr-FR means French language in France. So, fr specifies only the language whereas fr-FR is the locale
   * @param descriptionTranslations the value
   */
  @JsonSetter("DescriptionTranslations")
  public void setDescriptionTranslations(Map<String, String> descriptionTranslations) {
    this.descriptionTranslations = descriptionTranslations;
  }

  /**
   * Gets or sets the description translations for other languages than English.
            This is a dictionary of language tags and the corresponding translation in that language.
            The key values are either Cultures or Locales as defined in
            
            Culture
            names and identifiers
            
            .
            
            Max length of key is 10 characters.
            
            Max length of value is 1024 characters which might include multi-line text.
            
            Filling this collection is optional.
            The CultureInfo class specifies a unique name for each culture, based on RFC 4646.
            The name is a combination of an ISO 639 two-letter lowercase culture code associated with a language and an
            ISO 3166 two-letter uppercase subculture code associated with a country or region.
            
            The language needs to be associated with the particular region where it is spoken,
            and this is done by using locale (language + location). For example: fr is the code for French language.
            fr-FR means French language in France. So, fr specifies only the language whereas fr-FR is the locale
   * @return DescriptionTranslations
   */
  public Map<String, String> getDescriptionTranslations()
  {
    return descriptionTranslations == null? new HashMap<>(): descriptionTranslations;
  }

  /**
   * The date / time when this fault occurred created on the equipment
   * @param occurredAt the value
   */
  @JsonSetter("OccurredAt")
  public void setOccurredAt(Date occurredAt) {
    this.occurredAt = occurredAt;
  }

  /**
   * The date / time when this fault occurred created on the equipment
   * @return OccurredAt
   */
  @JsonGetter("OccurredAt")
  public Date getOccurredAt() {
    return occurredAt;
  }

  /**
   * Gets or sets the due date time.
            If this is set, the fault must be resolved until the specified due time which is calculated by the equipment.
            Any fault which requires immediate attention must have a due date which is before Now time stamp.
            This value is optional
   * @param dueDateTime the value
   */
  @JsonSetter("DueDateTime")
  public void setDueDateTime(Date dueDateTime) {
    this.dueDateTime = dueDateTime;
  }

  /**
   * Gets or sets the due date time.
            If this is set, the fault must be resolved until the specified due time which is calculated by the equipment.
            Any fault which requires immediate attention must have a due date which is before Now time stamp.
            This value is optional
   * @return DueDateTime
   */
  @JsonGetter("DueDateTime")
  public Date getDueDateTime() {
    return dueDateTime;
  }
}
