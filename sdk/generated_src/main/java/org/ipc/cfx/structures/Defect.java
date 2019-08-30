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

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Describes a defect that was discovered on a production unit
 * original type: CFX.Structures.Defect
 */
public class Defect {

  private String uniqueIdentifier;
  private String defectCode;
  private String defectCategory;
  private String description;
  private String comments;
  private ComponentDesignator componentOfInterest;
  private Region regionOfInterest;
  private Image[] defectImages;
  private Integer priority;
  private Double confidenceLevel;
  private Measurement[] relatedMeasurements;
  private Symptom[] relatedSymptoms;

  /**
   * A unique identifier for this particular defect instance
            (new and unique each time a new defect is discovered).
   * @param uniqueIdentifier the value
   */
  @JsonSetter("UniqueIdentifier")
  public void setUniqueIdentifier(String uniqueIdentifier) {
    this.uniqueIdentifier = uniqueIdentifier;
  }

  /**
   * A unique identifier for this particular defect instance
            (new and unique each time a new defect is discovered).
   *
   * @return never null
   */
  @JsonGetter("UniqueIdentifier")
  public String getUniqueIdentifier() {
    return uniqueIdentifier == null ? "" : uniqueIdentifier;
  }

  /**
   * A code identifying the type of defect
   * @param defectCode the value
   */
  @JsonSetter("DefectCode")
  public void setDefectCode(String defectCode) {
    this.defectCode = defectCode;
  }

  /**
   * A code identifying the type of defect
   *
   * @return never null
   */
  @JsonGetter("DefectCode")
  public String getDefectCode() {
    return defectCode == null ? "" : defectCode;
  }

  /**
   * An optional defect category for this particular type of defect
   * @param defectCategory the value
   */
  @JsonSetter("DefectCategory")
  public void setDefectCategory(String defectCategory) {
    this.defectCategory = defectCategory;
  }

  /**
   * An optional defect category for this particular type of defect
   *
   * @return never null
   */
  @JsonGetter("DefectCategory")
  public String getDefectCategory() {
    return defectCategory == null ? "" : defectCategory;
  }

  /**
   * A human friendly description of the defect
   * @param description the value
   */
  @JsonSetter("Description")
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * A human friendly description of the defect
   *
   * @return never null
   */
  @JsonGetter("Description")
  public String getDescription() {
    return description == null ? "" : description;
  }

  /**
   * Optional comments from the inspector who discovered this defect
   * @param comments the value
   */
  @JsonSetter("Comments")
  public void setComments(String comments) {
    this.comments = comments;
  }

  /**
   * Optional comments from the inspector who discovered this defect
   *
   * @return never null
   */
  @JsonGetter("Comments")
  public String getComments() {
    return comments == null ? "" : comments;
  }

  /**
   * An optional component or specific component pins related to this defect.
   * @param componentOfInterest the value
   */
  @JsonSetter("ComponentOfInterest")
  public void setComponentOfInterest(ComponentDesignator componentOfInterest) {
    this.componentOfInterest = componentOfInterest;
  }

  /**
   * An optional component or specific component pins related to this defect.
   * @return ComponentOfInterest
   */
  @JsonGetter("ComponentOfInterest")
  public ComponentDesignator getComponentOfInterest() {
    return componentOfInterest;
  }

  /**
   * An optional location or area on the production unit where the defect is located 
            (for cases where there is no specific component related, such as a scratch or 
            cosmetic defect).
   * @param regionOfInterest the value
   */
  @JsonSetter("RegionOfInterest")
  public void setRegionOfInterest(Region regionOfInterest) {
    this.regionOfInterest = regionOfInterest;
  }

  /**
   * An optional location or area on the production unit where the defect is located 
            (for cases where there is no specific component related, such as a scratch or 
            cosmetic defect).
   * @return RegionOfInterest
   */
  @JsonGetter("RegionOfInterest")
  public Region getRegionOfInterest() {
    return regionOfInterest;
  }

  /**
   * One of more pictures/images of the defect
   * @param defectImages the value
   */
  @JsonSetter("DefectImages")
  public void setDefectImages(Image[] defectImages) {
    this.defectImages = defectImages;
  }

  /**
   * One of more pictures/images of the defect
   * @return DefectImages
   */
  @JsonGetter("DefectImages")
  public Image[] getDefectImages() {
    return defectImages;
  }

  /**
   * The priority of this defect as compared to other defects discovered for this unit.
            A priority of 1 indicates the highest priority.
   * @param priority the value
   */
  @JsonSetter("Priority")
  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  /**
   * The priority of this defect as compared to other defects discovered for this unit.
            A priority of 1 indicates the highest priority.
   * @return Priority
   */
  @JsonGetter("Priority")
  public Integer getPriority() {
    return priority;
  }

  /**
   * A floating-point number from 1 to 100 indicating the level of confidence
            in the validity of this defect.  Intended to be used by humans that screen
            the results of inspections made by automated inspection equipment, 
            which may produce false defects from time to time.
   * @param confidenceLevel the value
   */
  @JsonSetter("ConfidenceLevel")
  public void setConfidenceLevel(Double confidenceLevel) {
    this.confidenceLevel = confidenceLevel;
  }

  /**
   * A floating-point number from 1 to 100 indicating the level of confidence
            in the validity of this defect.  Intended to be used by humans that screen
            the results of inspections made by automated inspection equipment, 
            which may produce false defects from time to time.
   * @return ConfidenceLevel
   */
  @JsonGetter("ConfidenceLevel")
  public Double getConfidenceLevel() {
    return confidenceLevel;
  }

  /**
   * A list of measurements that were taken in the course of discovering this defect
   * @param relatedMeasurements the value
   */
  @JsonSetter("RelatedMeasurements")
  public void setRelatedMeasurements(Measurement[] relatedMeasurements) {
    this.relatedMeasurements = relatedMeasurements;
  }

  /**
   * A list of measurements that were taken in the course of discovering this defect
   * @return RelatedMeasurements
   */
  @JsonGetter("RelatedMeasurements")
  public Measurement[] getRelatedMeasurements() {
    return relatedMeasurements;
  }

  /**
   * A list of symptoms that were discovered in the course of identifying this defect.
   * @param relatedSymptoms the value
   */
  @JsonSetter("RelatedSymptoms")
  public void setRelatedSymptoms(Symptom[] relatedSymptoms) {
    this.relatedSymptoms = relatedSymptoms;
  }

  /**
   * A list of symptoms that were discovered in the course of identifying this defect.
   * @return RelatedSymptoms
   */
  @JsonGetter("RelatedSymptoms")
  public Symptom[] getRelatedSymptoms() {
    return relatedSymptoms;
  }
}
