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
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Describes a single step in a series of steps that an inspector makes (both human or automation)
            in the course of inspecting a production unit.
 * original type: CFX.Structures.Inspection
 */
public class Inspection {

  private String uniqueIdentifier;
  private String inspectionName;
  private Date inspectionStartTime;
  private Date inspectionEndTime;
  private String testProcedure;
  private String comments;
  private TestResult result;
  private VerificationResult verification;
  private String error;
  private Defect[] defectsFound;
  private Symptom[] symptoms;
  private Measurement[] measurements;

  /**
   * A unique indentifier describing a particular instance of an inspection was made.
            Each new occurrence or recurrence of this same inspection gets a new unique identifier.
   * @param uniqueIdentifier the value
   */
  @JsonSetter("UniqueIdentifier")
  public Inspection setUniqueIdentifier(String uniqueIdentifier) {
    this.uniqueIdentifier = uniqueIdentifier;
    return this;
  }

  /**
   * A unique indentifier describing a particular instance of an inspection was made.
            Each new occurrence or recurrence of this same inspection gets a new unique identifier.
   *
   * @return never null
   */
  @JsonGetter("UniqueIdentifier")
  public String getUniqueIdentifier() {
    return uniqueIdentifier == null ? "" : uniqueIdentifier;
  }

  /**
   * Identifies the nature of the inspection performed
   * @param inspectionName the value
   */
  @JsonSetter("InspectionName")
  public Inspection setInspectionName(String inspectionName) {
    this.inspectionName = inspectionName;
    return this;
  }

  /**
   * Identifies the nature of the inspection performed
   *
   * @return never null
   */
  @JsonGetter("InspectionName")
  public String getInspectionName() {
    return inspectionName == null ? "" : inspectionName;
  }

  /**
   * Indicates the time when this particular inspection began (if known)
   * @param inspectionStartTime the value
   */
  @JsonSetter("InspectionStartTime")
  public Inspection setInspectionStartTime(Date inspectionStartTime) {
    this.inspectionStartTime = inspectionStartTime;
    return this;
  }

  /**
   * Indicates the time when this particular inspection began (if known)
   * @return InspectionStartTime
   */
  @JsonGetter("InspectionStartTime")
  public Date getInspectionStartTime() {
    return inspectionStartTime;
  }

  /**
   * Indicates the time when this particular inspection ended (if known)
   * @param inspectionEndTime the value
   */
  @JsonSetter("InspectionEndTime")
  public Inspection setInspectionEndTime(Date inspectionEndTime) {
    this.inspectionEndTime = inspectionEndTime;
    return this;
  }

  /**
   * Indicates the time when this particular inspection ended (if known)
   * @return InspectionEndTime
   */
  @JsonGetter("InspectionEndTime")
  public Date getInspectionEndTime() {
    return inspectionEndTime;
  }

  /**
   * Procedure to be followed to perform this inspection (primarily for human driven inspection)
   * @param testProcedure the value
   */
  @JsonSetter("TestProcedure")
  public Inspection setTestProcedure(String testProcedure) {
    this.testProcedure = testProcedure;
    return this;
  }

  /**
   * Procedure to be followed to perform this inspection (primarily for human driven inspection)
   *
   * @return never null
   */
  @JsonGetter("TestProcedure")
  public String getTestProcedure() {
    return testProcedure == null ? "" : testProcedure;
  }

  /**
   * Optional comments from the inspector who inspected the unit
   * @param comments the value
   */
  @JsonSetter("Comments")
  public Inspection setComments(String comments) {
    this.comments = comments;
    return this;
  }

  /**
   * Optional comments from the inspector who inspected the unit
   *
   * @return never null
   */
  @JsonGetter("Comments")
  public String getComments() {
    return comments == null ? "" : comments;
  }

  /**
   * The overall result of the inspection
   * @param result the value
   */
  @JsonSetter("Result")
  public Inspection setResult(TestResult result) {
    this.result = result;
    return this;
  }

  /**
   * The overall result of the inspection
   * @return Result
   */
  @JsonGetter("Result")
  public TestResult getResult() {
    return result;
  }

  /**
   * The overall result of the verification of the defect
   * @param verification the value
   */
  @JsonSetter("Verification")
  public Inspection setVerification(VerificationResult verification) {
    this.verification = verification;
    return this;
  }

  /**
   * The overall result of the verification of the defect
   * @return Verification
   */
  @JsonGetter("Verification")
  public VerificationResult getVerification() {
    return verification;
  }

  /**
   * In the case that the inspection cannot be completed, the error that was the cause of this outcome.
   * @param error the value
   */
  @JsonSetter("Error")
  public Inspection setError(String error) {
    this.error = error;
    return this;
  }

  /**
   * In the case that the inspection cannot be completed, the error that was the cause of this outcome.
   *
   * @return never null
   */
  @JsonGetter("Error")
  public String getError() {
    return error == null ? "" : error;
  }

  /**
   * The defects that were discovered in the course of performing this inspection (if any)
   * @param defectsFound the value
   */
  @JsonSetter("DefectsFound")
  public Inspection setDefectsFound(Defect[] defectsFound) {
    this.defectsFound = defectsFound;
    return this;
  }

  /**
   * The defects that were discovered in the course of performing this inspection (if any)
   * @return DefectsFound
   */
  @JsonGetter("DefectsFound")
  public Defect[] getDefectsFound() {
    return defectsFound;
  }

  /**
   * Any symptoms that were discovered during the inspection (if any).
   * @param symptoms the value
   */
  @JsonSetter("Symptoms")
  public Inspection setSymptoms(Symptom[] symptoms) {
    this.symptoms = symptoms;
    return this;
  }

  /**
   * Any symptoms that were discovered during the inspection (if any).
   * @return Symptoms
   */
  @JsonGetter("Symptoms")
  public Symptom[] getSymptoms() {
    return symptoms;
  }

  /**
   * The measurements that were taken in the course of performing this inspection (if any).
            NOTE - Only measurements not related to particular defects or symptoms should be recorded here.
   * @param measurements the value
   */
  @JsonSetter("Measurements")
  public Inspection setMeasurements(Measurement[] measurements) {
    this.measurements = measurements;
    return this;
  }

  /**
   * The measurements that were taken in the course of performing this inspection (if any).
            NOTE - Only measurements not related to particular defects or symptoms should be recorded here.
   * @return Measurements
   */
  @JsonGetter("Measurements")
  public Measurement[] getMeasurements() {
    return measurements;
  }
}
