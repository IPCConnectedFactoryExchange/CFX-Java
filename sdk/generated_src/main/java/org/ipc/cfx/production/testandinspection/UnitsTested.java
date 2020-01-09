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
package org.ipc.cfx.production.testandinspection;

import java.util.UUID;
import org.ipc.cfx.structures.TestMethod;
import org.ipc.cfx.structures.Operator;
import org.ipc.cfx.structures.SamplingInformation;
import org.ipc.cfx.structures.TestedUnit;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent by a process endpoint when one or more units undergo a series of tests.  
            Tests can be of any form, including environmental testing, electrical testing, functional testing, etc.  
            Detail of each test performed is provided, including any measured values, and the results of each test (P/F).  
            For any failed tests, symptom detail is provided.
            Example 1 (In-Circuit Test of 2 Circuit PCB Panel):
            {
              &quot;TransactionId&quot;: &quot;c16bb3f4-8088-4697-b789-80faec48ac5a&quot;,
              &quot;TestMethod&quot;: &quot;Automated&quot;,
              &quot;Tester&quot;: {
                &quot;OperatorIdentifier&quot;: &quot;BADGE489499&quot;,
                &quot;ActorType&quot;: &quot;Human&quot;,
                &quot;LastName&quot;: &quot;Smith&quot;,
                &quot;FirstName&quot;: &quot;Joseph&quot;,
                &quot;LoginName&quot;: &quot;joseph.smith@abcdrepairs.com&quot;
              },
              &quot;SamplingInformation&quot;: {
                &quot;SamplingMethod&quot;: &quot;NoSampling&quot;,
                &quot;LotSize&quot;: null,
                &quot;SampleSize&quot;: null
              },
              &quot;TestedUnits&quot;: [
                {
                  &quot;UnitIdentifier&quot;: &quot;PANEL34543535&quot;,
                  &quot;UnitPositionNumber&quot;: 1,
                  &quot;OverallResult&quot;: &quot;Passed&quot;,
                  &quot;Tests&quot;: [
                    {
                      &quot;UniqueIdentifier&quot;: &quot;01aed4e8-fd87-46a4-a62e-57b51f2ee20f&quot;,
                      &quot;TestName&quot;: &quot;RESISTANCE_CHECK_R21&quot;,
                      &quot;TestStartTime&quot;: null,
                      &quot;TestEndTime&quot;: null,
                      &quot;TestConditions&quot;: [],
                      &quot;TestProcedure&quot;: null,
                      &quot;Comments&quot;: null,
                      &quot;Result&quot;: &quot;Passed&quot;,
                      &quot;Error&quot;: null,
                      &quot;SymptomsFound&quot;: [],
                      &quot;DefectsFound&quot;: [],
                      &quot;Measurements&quot;: [
                        {
                          &quot;$type&quot;: &quot;CFX.Structures.NumericMeasurement, CFX&quot;,
                          &quot;MeasuredValue&quot;: {
                            &quot;Value&quot;: 28300.0,
                            &quot;ValueUnits&quot;: &quot;Ohm&quot;,
                            &quot;ExpectedValue&quot;: 28.2,
                            &quot;ExpectedValueUnits&quot;: &quot;kOhm&quot;,
                            &quot;MinimumAcceptableValue&quot;: 28.0,
                            &quot;MaximumAcceptableValue&quot;: 28.4
                          },
                          &quot;UniqueIdentifier&quot;: &quot;e7398b02-e649-4918-96b8-c426629b6762&quot;,
                          &quot;MeasurementName&quot;: &quot;RESISTANCE_MEASUREMENT_R21&quot;,
                          &quot;TimeRecorded&quot;: null,
                          &quot;Sequence&quot;: 0,
                          &quot;Result&quot;: &quot;Passed&quot;,
                          &quot;CRDs&quot;: &quot;R21&quot;
                        }
                      ]
                    },
                    {
                      &quot;UniqueIdentifier&quot;: &quot;f0f075ab-baef-4a4d-9264-2d2f2948e0fe&quot;,
                      &quot;TestName&quot;: &quot;RESISTANCE_CHECK_R22&quot;,
                      &quot;TestStartTime&quot;: null,
                      &quot;TestEndTime&quot;: null,
                      &quot;TestConditions&quot;: [],
                      &quot;TestProcedure&quot;: null,
                      &quot;Comments&quot;: null,
                      &quot;Result&quot;: &quot;Failed&quot;,
                      &quot;Error&quot;: null,
                      &quot;SymptomsFound&quot;: [
                        {
                          &quot;UniqueIdentifier&quot;: &quot;4db5cb60-140c-41ba-9a27-116dfe3a12cd&quot;,
                          &quot;SymptomCode&quot;: &quot;RESFAIL2&quot;,
                          &quot;SymptomCategory&quot;: &quot;Electrical Tests&quot;,
                          &quot;Description&quot;: &quot;Resistance Value Out of Tolerance&quot;,
                          &quot;Comments&quot;: null,
                          &quot;ComponentsOfInterest&quot;: [
                            {
                              &quot;ReferenceDesignator&quot;: &quot;R22.1&quot;,
                              &quot;UnitPosition&quot;: null,
                              &quot;PartNumber&quot;: &quot;41234-8897&quot;
                            },
                            {
                              &quot;ReferenceDesignator&quot;: &quot;R22.2&quot;,
                              &quot;UnitPosition&quot;: null,
                              &quot;PartNumber&quot;: &quot;41234-8897&quot;
                            }
                          ],
                          &quot;RegionOfInterest&quot;: null,
                          &quot;Priority&quot;: 1,
                          &quot;RelatedMeasurements&quot;: [
                            {
                              &quot;$type&quot;: &quot;CFX.Structures.NumericMeasurement, CFX&quot;,
                              &quot;MeasuredValue&quot;: {
                                &quot;Value&quot;: 28.52,
                                &quot;ValueUnits&quot;: &quot;kOhm&quot;,
                                &quot;ExpectedValue&quot;: 28.2,
                                &quot;ExpectedValueUnits&quot;: &quot;kOhm&quot;,
                                &quot;MinimumAcceptableValue&quot;: 28.0,
                                &quot;MaximumAcceptableValue&quot;: 28.4
                              },
                              &quot;UniqueIdentifier&quot;: &quot;3092cb6b-2e90-4ede-b9de-c421e16ae18b&quot;,
                              &quot;MeasurementName&quot;: &quot;RESISTANCE_MEASUREMENT_R22&quot;,
                              &quot;TimeRecorded&quot;: null,
                              &quot;Sequence&quot;: 0,
                              &quot;Result&quot;: &quot;Passed&quot;,
                              &quot;CRDs&quot;: &quot;R22&quot;
                            }
                          ]
                        }
                      ],
                      &quot;DefectsFound&quot;: [],
                      &quot;Measurements&quot;: []
                    }
                  ]
                },
                {
                  &quot;UnitIdentifier&quot;: &quot;PANEL34543535&quot;,
                  &quot;UnitPositionNumber&quot;: 2,
                  &quot;OverallResult&quot;: &quot;Passed&quot;,
                  &quot;Tests&quot;: [
                    {
                      &quot;UniqueIdentifier&quot;: &quot;f9127a3a-f349-40f1-9475-e87b83d46ed5&quot;,
                      &quot;TestName&quot;: &quot;RESISTANCE_CHECK_R21&quot;,
                      &quot;TestStartTime&quot;: null,
                      &quot;TestEndTime&quot;: null,
                      &quot;TestConditions&quot;: [],
                      &quot;TestProcedure&quot;: null,
                      &quot;Comments&quot;: null,
                      &quot;Result&quot;: &quot;Passed&quot;,
                      &quot;Error&quot;: null,
                      &quot;SymptomsFound&quot;: [],
                      &quot;DefectsFound&quot;: [],
                      &quot;Measurements&quot;: [
                        {
                          &quot;$type&quot;: &quot;CFX.Structures.NumericMeasurement, CFX&quot;,
                          &quot;MeasuredValue&quot;: {
                            &quot;Value&quot;: 28300.0,
                            &quot;ValueUnits&quot;: &quot;Ohm&quot;,
                            &quot;ExpectedValue&quot;: 28.2,
                            &quot;ExpectedValueUnits&quot;: &quot;kOhm&quot;,
                            &quot;MinimumAcceptableValue&quot;: 28.0,
                            &quot;MaximumAcceptableValue&quot;: 28.4
                          },
                          &quot;UniqueIdentifier&quot;: &quot;12d217c0-1a15-48dd-9b05-ed5cfaaa87f0&quot;,
                          &quot;MeasurementName&quot;: &quot;RESISTANCE_MEASUREMENT_R21&quot;,
                          &quot;TimeRecorded&quot;: null,
                          &quot;Sequence&quot;: 0,
                          &quot;Result&quot;: &quot;Passed&quot;,
                          &quot;CRDs&quot;: &quot;R21&quot;
                        }
                      ]
                    },
                    {
                      &quot;UniqueIdentifier&quot;: &quot;8eebcda8-dbfa-40b3-b963-36c8c6f979b3&quot;,
                      &quot;TestName&quot;: &quot;RESISTANCE_CHECK_R22&quot;,
                      &quot;TestStartTime&quot;: null,
                      &quot;TestEndTime&quot;: null,
                      &quot;TestConditions&quot;: [],
                      &quot;TestProcedure&quot;: null,
                      &quot;Comments&quot;: null,
                      &quot;Result&quot;: &quot;Passed&quot;,
                      &quot;Error&quot;: null,
                      &quot;SymptomsFound&quot;: [],
                      &quot;DefectsFound&quot;: [],
                      &quot;Measurements&quot;: [
                        {
                          &quot;$type&quot;: &quot;CFX.Structures.NumericMeasurement, CFX&quot;,
                          &quot;MeasuredValue&quot;: {
                            &quot;Value&quot;: 28300.0,
                            &quot;ValueUnits&quot;: &quot;Ohm&quot;,
                            &quot;ExpectedValue&quot;: 28.2,
                            &quot;ExpectedValueUnits&quot;: &quot;kOhm&quot;,
                            &quot;MinimumAcceptableValue&quot;: 28.0,
                            &quot;MaximumAcceptableValue&quot;: 28.4
                          },
                          &quot;UniqueIdentifier&quot;: &quot;787600e1-fd83-49c5-a2d5-8e3e6e4b3b28&quot;,
                          &quot;MeasurementName&quot;: &quot;RESISTANCE_MEASUREMENT_R22&quot;,
                          &quot;TimeRecorded&quot;: null,
                          &quot;Sequence&quot;: 0,
                          &quot;Result&quot;: &quot;Passed&quot;,
                          &quot;CRDs&quot;: &quot;R22&quot;
                        }
                      ]
                    }
                  ]
                }
              ]
            }
            Example 2 (Burn-in / Hot / Cold Test of Final Production Unit):
            {
              &quot;TransactionId&quot;: &quot;1b3524e0-fd4f-4bd8-93a7-992d12bdb418&quot;,
              &quot;TestMethod&quot;: &quot;Automated&quot;,
              &quot;Tester&quot;: {
                &quot;OperatorIdentifier&quot;: &quot;BADGE489499&quot;,
                &quot;ActorType&quot;: &quot;Human&quot;,
                &quot;LastName&quot;: &quot;Smith&quot;,
                &quot;FirstName&quot;: &quot;Joseph&quot;,
                &quot;LoginName&quot;: &quot;joseph.smith@abcdrepairs.com&quot;
              },
              &quot;SamplingInformation&quot;: {
                &quot;SamplingMethod&quot;: &quot;NoSampling&quot;,
                &quot;LotSize&quot;: null,
                &quot;SampleSize&quot;: null
              },
              &quot;TestedUnits&quot;: [
                {
                  &quot;UnitIdentifier&quot;: &quot;UNIT123456789&quot;,
                  &quot;UnitPositionNumber&quot;: 1,
                  &quot;OverallResult&quot;: &quot;Passed&quot;,
                  &quot;Tests&quot;: [
                    {
                      &quot;UniqueIdentifier&quot;: &quot;5de9b7e9-9c7c-4e88-9d40-07c7618248a2&quot;,
                      &quot;TestName&quot;: &quot;HOT_TEST&quot;,
                      &quot;TestStartTime&quot;: &quot;2018-10-03T16:02:33.2831984-04:00&quot;,
                      &quot;TestEndTime&quot;: &quot;2018-10-03T16:03:05.2842009-04:00&quot;,
                      &quot;TestConditions&quot;: [
                        {
                          &quot;$type&quot;: &quot;CFX.Structures.Temperature, CFX&quot;,
                          &quot;StartTime&quot;: null,
                          &quot;EndTime&quot;: null,
                          &quot;MeanValue&quot;: 45.2,
                          &quot;MedianValue&quot;: 0.0,
                          &quot;MaxValue&quot;: 45.8,
                          &quot;MinValue&quot;: 44.9
                        },
                        {
                          &quot;$type&quot;: &quot;CFX.Structures.Humidity, CFX&quot;,
                          &quot;StartTime&quot;: null,
                          &quot;EndTime&quot;: null,
                          &quot;MeanValue&quot;: 85.5,
                          &quot;MedianValue&quot;: 0.0,
                          &quot;MaxValue&quot;: 85.7,
                          &quot;MinValue&quot;: 85.4
                        }
                      ],
                      &quot;TestProcedure&quot;: null,
                      &quot;Comments&quot;: null,
                      &quot;Result&quot;: &quot;Passed&quot;,
                      &quot;Error&quot;: null,
                      &quot;SymptomsFound&quot;: [],
                      &quot;DefectsFound&quot;: [],
                      &quot;Measurements&quot;: []
                    },
                    {
                      &quot;UniqueIdentifier&quot;: &quot;c2668251-aaba-4ceb-a584-55e8b10f0de1&quot;,
                      &quot;TestName&quot;: &quot;COLD_TEST&quot;,
                      &quot;TestStartTime&quot;: &quot;2018-10-03T16:02:33.2842009-04:00&quot;,
                      &quot;TestEndTime&quot;: &quot;2018-10-03T16:03:05.2842009-04:00&quot;,
                      &quot;TestConditions&quot;: [
                        {
                          &quot;$type&quot;: &quot;CFX.Structures.Temperature, CFX&quot;,
                          &quot;StartTime&quot;: null,
                          &quot;EndTime&quot;: null,
                          &quot;MeanValue&quot;: -6.5,
                          &quot;MedianValue&quot;: 0.0,
                          &quot;MaxValue&quot;: -6.4,
                          &quot;MinValue&quot;: -6.7
                        },
                        {
                          &quot;$type&quot;: &quot;CFX.Structures.Humidity, CFX&quot;,
                          &quot;StartTime&quot;: null,
                          &quot;EndTime&quot;: null,
                          &quot;MeanValue&quot;: 22.5,
                          &quot;MedianValue&quot;: 0.0,
                          &quot;MaxValue&quot;: 22.7,
                          &quot;MinValue&quot;: 22.4
                        }
                      ],
                      &quot;TestProcedure&quot;: null,
                      &quot;Comments&quot;: null,
                      &quot;Result&quot;: &quot;Passed&quot;,
                      &quot;Error&quot;: null,
                      &quot;SymptomsFound&quot;: [],
                      &quot;DefectsFound&quot;: [],
                      &quot;Measurements&quot;: []
                    }
                  ]
                }
              ]
            }
 * original type: CFX.Production.TestAndInspection.UnitsTested
 */
public class UnitsTested extends CFXMessage {

  private UUID transactionId;
  private TestMethod testMethod;
  private Operator tester;
  private String recipeName;
  private String recipeRevision;
  private SamplingInformation samplingInformation;
  private TestedUnit[] testedUnits;

  /**
   * The id of the work transaction with which this testing session is associated.
   * @param transactionId the value
   */
  @JsonSetter("TransactionId")
  public UnitsTested setTransactionId(UUID transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * The id of the work transaction with which this testing session is associated.
   * @return TransactionId
   */
  @JsonGetter("TransactionId")
  public UUID getTransactionId() {
    return transactionId;
  }

  /**
   * Describes how the tests were performed.
   * @param testMethod the value
   */
  @JsonSetter("TestMethod")
  public UnitsTested setTestMethod(TestMethod testMethod) {
    this.testMethod = testMethod;
    return this;
  }

  /**
   * Describes how the tests were performed.
   * @return TestMethod
   */
  @JsonGetter("TestMethod")
  public TestMethod getTestMethod() {
    return testMethod;
  }

  /**
   * Identifies the person who performed the test, or operator of the automated equipment that performed the test. (optional)
   * @param tester the value
   */
  @JsonSetter("Tester")
  public UnitsTested setTester(Operator tester) {
    this.tester = tester;
    return this;
  }

  /**
   * Identifies the person who performed the test, or operator of the automated equipment that performed the test. (optional)
   * @return Tester
   */
  @JsonGetter("Tester")
  public Operator getTester() {
    return tester;
  }

  /**
   * The name of the recipe used to perform the inspection(s) for this transaction.
   * @param recipeName the value
   */
  @JsonSetter("RecipeName")
  public UnitsTested setRecipeName(String recipeName) {
    this.recipeName = recipeName;
    return this;
  }

  /**
   * The name of the recipe used to perform the inspection(s) for this transaction.
   *
   * @return never null
   */
  @JsonGetter("RecipeName")
  public String getRecipeName() {
    return recipeName == null ? "" : recipeName;
  }

  /**
   * An optional Revision Number of the recipe used to perform the inspection(s) for this transaction.
   * @param recipeRevision the value
   */
  @JsonSetter("RecipeRevision")
  public UnitsTested setRecipeRevision(String recipeRevision) {
    this.recipeRevision = recipeRevision;
    return this;
  }

  /**
   * An optional Revision Number of the recipe used to perform the inspection(s) for this transaction.
   *
   * @return never null
   */
  @JsonGetter("RecipeRevision")
  public String getRecipeRevision() {
    return recipeRevision == null ? "" : recipeRevision;
  }

  /**
   * Describes the sampling method that was used during the test (if any).
   * @param samplingInformation the value
   */
  @JsonSetter("SamplingInformation")
  public UnitsTested setSamplingInformation(SamplingInformation samplingInformation) {
    this.samplingInformation = samplingInformation;
    return this;
  }

  /**
   * Describes the sampling method that was used during the test (if any).
   * @return SamplingInformation
   */
  @JsonGetter("SamplingInformation")
  public SamplingInformation getSamplingInformation() {
    return samplingInformation;
  }

  /**
   * A list of the units that were tested, along with the tests made, and test results.
   * @param testedUnits the value
   */
  @JsonSetter("TestedUnits")
  public UnitsTested setTestedUnits(TestedUnit[] testedUnits) {
    this.testedUnits = testedUnits;
    return this;
  }

  /**
   * A list of the units that were tested, along with the tests made, and test results.
   * @return TestedUnits
   */
  @JsonGetter("TestedUnits")
  public TestedUnit[] getTestedUnits() {
    return testedUnits;
  }
}
