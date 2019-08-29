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

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Describes a single test in a series of test that an tester makes (both human or automation)
            in the course of testing a production unit.
 * original type: CFX.Structures.Test
 */
public class Test {

  private String uniqueIdentifier;
  private String testName;
  private Date testStartTime;
  private Date testEndTime;
  private EnvironmentalCondition[] testConditions;
  private String testProcedure;
  private String comments;
  private TestResult result;
  private String error;
  private Symptom[] symptomsFound;
  private Defect[] defectsFound;
  private Measurement[] measurements;

  /**
   * A unique indentifier describing a particular instance of a test that was undertaken.
            Each new occurrence or recurrence of this same inspection gets a new unique identifier.
   */
  @JsonSetter("UniqueIdentifier")
  public void setUniqueIdentifier(String uniqueIdentifier) {
    this.uniqueIdentifier = uniqueIdentifier;
  }

  /**
   * A unique indentifier describing a particular instance of a test that was undertaken.
            Each new occurrence or recurrence of this same inspection gets a new unique identifier.
   *
   * @return never null
   */
  @JsonGetter("UniqueIdentifier")
  public String getUniqueIdentifier() {
    return uniqueIdentifier == null ? "" : uniqueIdentifier;
  }

  /**
   * Identifies the nature of the test performed
   */
  @JsonSetter("TestName")
  public void setTestName(String testName) {
    this.testName = testName;
  }

  /**
   * Identifies the nature of the test performed
   *
   * @return never null
   */
  @JsonGetter("TestName")
  public String getTestName() {
    return testName == null ? "" : testName;
  }

  /**
   * Indicates the time when this particular test began (if known)
   */
  @JsonSetter("TestStartTime")
  public void setTestStartTime(Date testStartTime) {
    this.testStartTime = testStartTime;
  }

  /**
   * Indicates the time when this particular test began (if known)
   */
  @JsonGetter("TestStartTime")
  public Date getTestStartTime() {
    return testStartTime;
  }

  /**
   * Indicates the time when this particular test ended (if known)
   */
  @JsonSetter("TestEndTime")
  public void setTestEndTime(Date testEndTime) {
    this.testEndTime = testEndTime;
  }

  /**
   * Indicates the time when this particular test ended (if known)
   */
  @JsonGetter("TestEndTime")
  public Date getTestEndTime() {
    return testEndTime;
  }

  /**
   * A list of environmental conditions (temperature, humidity, etc.) which
            were in place when the test was performed.
   */
  @JsonSetter("TestConditions")
  public void setTestConditions(EnvironmentalCondition[] testConditions) {
    this.testConditions = testConditions;
  }

  /**
   * A list of environmental conditions (temperature, humidity, etc.) which
            were in place when the test was performed.
   */
  @JsonGetter("TestConditions")
  public EnvironmentalCondition[] getTestConditions() {
    return testConditions;
  }

  /**
   * Procedure to be followed to perform this test (primarily for human driven test).
   */
  @JsonSetter("TestProcedure")
  public void setTestProcedure(String testProcedure) {
    this.testProcedure = testProcedure;
  }

  /**
   * Procedure to be followed to perform this test (primarily for human driven test).
   *
   * @return never null
   */
  @JsonGetter("TestProcedure")
  public String getTestProcedure() {
    return testProcedure == null ? "" : testProcedure;
  }

  /**
   * Optional comments from the tester who tested the unit
   */
  @JsonSetter("Comments")
  public void setComments(String comments) {
    this.comments = comments;
  }

  /**
   * Optional comments from the tester who tested the unit
   *
   * @return never null
   */
  @JsonGetter("Comments")
  public String getComments() {
    return comments == null ? "" : comments;
  }

  /**
   * The overall result of the test
   */
  @JsonSetter("Result")
  public void setResult(TestResult result) {
    this.result = result;
  }

  /**
   * The overall result of the test
   */
  @JsonGetter("Result")
  public TestResult getResult() {
    return result;
  }

  /**
   * In the case that the test cannot be completed, the error that was the cause of this outcome.
   */
  @JsonSetter("Error")
  public void setError(String error) {
    this.error = error;
  }

  /**
   * In the case that the test cannot be completed, the error that was the cause of this outcome.
   *
   * @return never null
   */
  @JsonGetter("Error")
  public String getError() {
    return error == null ? "" : error;
  }

  /**
   * The symptoms that were discovered in the course of this test
   */
  @JsonSetter("SymptomsFound")
  public void setSymptomsFound(Symptom[] symptomsFound) {
    this.symptomsFound = symptomsFound;
  }

  /**
   * The symptoms that were discovered in the course of this test
   */
  @JsonGetter("SymptomsFound")
  public Symptom[] getSymptomsFound() {
    return symptomsFound;
  }

  /**
   * The defects that were discovered in the course of this test
   */
  @JsonSetter("DefectsFound")
  public void setDefectsFound(Defect[] defectsFound) {
    this.defectsFound = defectsFound;
  }

  /**
   * The defects that were discovered in the course of this test
   */
  @JsonGetter("DefectsFound")
  public Defect[] getDefectsFound() {
    return defectsFound;
  }

  /**
   * The measurements that were taken in the course of performing this test.
            NOTE - Only measurements not related to particular defects or symptoms should be recorded here.
   */
  @JsonSetter("Measurements")
  public void setMeasurements(Measurement[] measurements) {
    this.measurements = measurements;
  }

  /**
   * The measurements that were taken in the course of performing this test.
            NOTE - Only measurements not related to particular defects or symptoms should be recorded here.
   */
  @JsonGetter("Measurements")
  public Measurement[] getMeasurements() {
    return measurements;
  }
}
