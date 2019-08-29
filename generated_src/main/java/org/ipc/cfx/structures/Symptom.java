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
 * created: 20.08.2019 15:52:36 by frankp
 */
package org.ipc.cfx.structures;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Describes a situation where a problem is identified via one or more failed tests.
            A symptom does not identify the actual cause of the failure(s), only that 
            there is a problem that needs to be investigated.
 * original type: CFX.Structures.Symptom
 */
public class Symptom {

  private String uniqueIdentifier;
  private String symptomCode;
  private String symptomCategory;
  private String description;
  private String comments;
  private ComponentDesignator[] componentsOfInterest;
  private Region regionOfInterest;
  private int priority;
  private Measurement[] relatedMeasurements;

  /**
   * A unique identifier for this particular symptom instance
            (new and unique each time a new symptom is discovered).
   */
  @JsonSetter("UniqueIdentifier")
  public void setUniqueIdentifier(String uniqueIdentifier) {
    this.uniqueIdentifier = uniqueIdentifier;
  }

  /**
   * A unique identifier for this particular symptom instance
            (new and unique each time a new symptom is discovered).
   *
   * @return never null
   */
  @JsonGetter("UniqueIdentifier")
  public String getUniqueIdentifier() {
    return uniqueIdentifier == null ? "" : uniqueIdentifier;
  }

  /**
   * A code identifying the type of symptom
   */
  @JsonSetter("SymptomCode")
  public void setSymptomCode(String symptomCode) {
    this.symptomCode = symptomCode;
  }

  /**
   * A code identifying the type of symptom
   *
   * @return never null
   */
  @JsonGetter("SymptomCode")
  public String getSymptomCode() {
    return symptomCode == null ? "" : symptomCode;
  }

  /**
   * An optional symptom category for this particular type of symptom
   */
  @JsonSetter("SymptomCategory")
  public void setSymptomCategory(String symptomCategory) {
    this.symptomCategory = symptomCategory;
  }

  /**
   * An optional symptom category for this particular type of symptom
   *
   * @return never null
   */
  @JsonGetter("SymptomCategory")
  public String getSymptomCategory() {
    return symptomCategory == null ? "" : symptomCategory;
  }

  /**
   * A human friendly description of the symptom
   */
  @JsonSetter("Description")
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * A human friendly description of the symptom
   *
   * @return never null
   */
  @JsonGetter("Description")
  public String getDescription() {
    return description == null ? "" : description;
  }

  /**
   * Optional comments from the tester who discovered this symptom
   */
  @JsonSetter("Comments")
  public void setComments(String comments) {
    this.comments = comments;
  }

  /**
   * Optional comments from the tester who discovered this symptom
   *
   * @return never null
   */
  @JsonGetter("Comments")
  public String getComments() {
    return comments == null ? "" : comments;
  }

  /**
   * A list of the components or specific component pins related to this symptom (if known)
   */
  @JsonSetter("ComponentsOfInterest")
  public void setComponentsOfInterest(ComponentDesignator[] componentsOfInterest) {
    this.componentsOfInterest = componentsOfInterest;
  }

  /**
   * A list of the components or specific component pins related to this symptom (if known)
   */
  @JsonGetter("ComponentsOfInterest")
  public ComponentDesignator[] getComponentsOfInterest() {
    return componentsOfInterest;
  }

  /**
   * An optional location or area on the production unit where the symptom is located 
            (for cases where there is no specific components that can be definitively related).
   */
  @JsonSetter("RegionOfInterest")
  public void setRegionOfInterest(Region regionOfInterest) {
    this.regionOfInterest = regionOfInterest;
  }

  /**
   * An optional location or area on the production unit where the symptom is located 
            (for cases where there is no specific components that can be definitively related).
   */
  @JsonGetter("RegionOfInterest")
  public Region getRegionOfInterest() {
    return regionOfInterest;
  }

  /**
   * The priority of this symptom as compared to other symptom discovered for this unit.
            A priority of 1 indicates the highest priority.
   */
  @JsonSetter("Priority")
  public void setPriority(int priority) {
    this.priority = priority;
  }

  /**
   * The priority of this symptom as compared to other symptom discovered for this unit.
            A priority of 1 indicates the highest priority.
   */
  @JsonGetter("Priority")
  public int getPriority() {
    return priority;
  }

  /**
   * A list of measurements that were taken which caused this symptom to be created
   */
  @JsonSetter("RelatedMeasurements")
  public void setRelatedMeasurements(Measurement[] relatedMeasurements) {
    this.relatedMeasurements = relatedMeasurements;
  }

  /**
   * A list of measurements that were taken which caused this symptom to be created
   */
  @JsonGetter("RelatedMeasurements")
  public Measurement[] getRelatedMeasurements() {
    return relatedMeasurements;
  }
}
