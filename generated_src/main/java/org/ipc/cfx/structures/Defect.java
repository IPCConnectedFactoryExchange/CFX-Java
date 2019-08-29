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
 * created: 20.08.2019 15:52:18 by frankp
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
   */
  @JsonSetter("ComponentOfInterest")
  public void setComponentOfInterest(ComponentDesignator componentOfInterest) {
    this.componentOfInterest = componentOfInterest;
  }

  /**
   * An optional component or specific component pins related to this defect.
   */
  @JsonGetter("ComponentOfInterest")
  public ComponentDesignator getComponentOfInterest() {
    return componentOfInterest;
  }

  /**
   * An optional location or area on the production unit where the defect is located 
            (for cases where there is no specific component related, such as a scratch or 
            cosmetic defect).
   */
  @JsonSetter("RegionOfInterest")
  public void setRegionOfInterest(Region regionOfInterest) {
    this.regionOfInterest = regionOfInterest;
  }

  /**
   * An optional location or area on the production unit where the defect is located 
            (for cases where there is no specific component related, such as a scratch or 
            cosmetic defect).
   */
  @JsonGetter("RegionOfInterest")
  public Region getRegionOfInterest() {
    return regionOfInterest;
  }

  /**
   * One of more pictures/images of the defect
   */
  @JsonSetter("DefectImages")
  public void setDefectImages(Image[] defectImages) {
    this.defectImages = defectImages;
  }

  /**
   * One of more pictures/images of the defect
   */
  @JsonGetter("DefectImages")
  public Image[] getDefectImages() {
    return defectImages;
  }

  /**
   * The priority of this defect as compared to other defects discovered for this unit.
            A priority of 1 indicates the highest priority.
   */
  @JsonSetter("Priority")
  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  /**
   * The priority of this defect as compared to other defects discovered for this unit.
            A priority of 1 indicates the highest priority.
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
   */
  @JsonGetter("ConfidenceLevel")
  public Double getConfidenceLevel() {
    return confidenceLevel;
  }

  /**
   * A list of measurements that were taken in the course of discovering this defect
   */
  @JsonSetter("RelatedMeasurements")
  public void setRelatedMeasurements(Measurement[] relatedMeasurements) {
    this.relatedMeasurements = relatedMeasurements;
  }

  /**
   * A list of measurements that were taken in the course of discovering this defect
   */
  @JsonGetter("RelatedMeasurements")
  public Measurement[] getRelatedMeasurements() {
    return relatedMeasurements;
  }

  /**
   * A list of symptoms that were discovered in the course of identifying this defect.
   */
  @JsonSetter("RelatedSymptoms")
  public void setRelatedSymptoms(Symptom[] relatedSymptoms) {
    this.relatedSymptoms = relatedSymptoms;
  }

  /**
   * A list of symptoms that were discovered in the course of identifying this defect.
   */
  @JsonGetter("RelatedSymptoms")
  public Symptom[] getRelatedSymptoms() {
    return relatedSymptoms;
  }
}
