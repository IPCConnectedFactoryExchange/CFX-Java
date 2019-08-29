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
package org.ipc.cfx.production.testandinspection;

import java.util.UUID;
import org.ipc.cfx.structures.InspectionMethod;
import org.ipc.cfx.structures.SamplingInformation;
import org.ipc.cfx.structures.Operator;
import org.ipc.cfx.structures.InspectedUnit;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent by a process endpoint when one or more units have been inspected.  Includes pass/fail information,
            as well as a detailed report of the inspection, including the specific measurements and inspections
            that were made, and defects that were discovered during the process.
            Generic Inspection Example (2 Circuit PCB Panel inspected via AOI):
            {
              "TransactionId": "14d48338-09b7-4d20-acb9-bf951270793a",
              "InspectionMethod": "AOI",
              "SamplingInformation": {
                "SamplingMethod": "NoSampling",
                "LotSize": null,
                "SampleSize": null
              },
              "Inspector": {
                "OperatorIdentifier": "BADGE489499",
                "ActorType": "Human",
                "LastName": "Smith",
                "FirstName": "Joseph",
                "LoginName": "joseph.smith@abcdrepairs.com"
              },
              "InspectedUnits": [
                {
                  "UnitIdentifier": "PANEL34543535",
                  "UnitPositionNumber": 1,
                  "OverallResult": "Passed",
                  "Inspections": [
                    {
                      "UniqueIdentifier": "481f296f-d4b2-4d8e-8b05-a0a17ca33488",
                      "InspectionName": "INSPECT_R21",
                      "InspectionStartTime": null,
                      "InspectionEndTime": null,
                      "TestProcedure": null,
                      "Comments": null,
                      "Result": "Passed",
                      "Error": null,
                      "DefectsFound": [],
                      "Symptoms": null,
                      "Measurements": []
                    },
                    {
                      "UniqueIdentifier": "074c7aa5-8871-4629-b139-122b620bdc1b",
                      "InspectionName": "INSPECT_R22",
                      "InspectionStartTime": null,
                      "InspectionEndTime": null,
                      "TestProcedure": null,
                      "Comments": null,
                      "Result": "Passed",
                      "Error": null,
                      "DefectsFound": [],
                      "Symptoms": null,
                      "Measurements": []
                    }
                  ]
                },
                {
                  "UnitIdentifier": "PANEL34543535",
                  "UnitPositionNumber": 2,
                  "OverallResult": "Failed",
                  "Inspections": [
                    {
                      "UniqueIdentifier": "27e4a632-5670-4683-9b54-b67b7df98260",
                      "InspectionName": "INSPECT_R21",
                      "InspectionStartTime": null,
                      "InspectionEndTime": null,
                      "TestProcedure": null,
                      "Comments": null,
                      "Result": "Passed",
                      "Error": null,
                      "DefectsFound": [],
                      "Symptoms": null,
                      "Measurements": []
                    },
                    {
                      "UniqueIdentifier": "f7ed3609-ea35-4bcc-9170-cb5d540348d5",
                      "InspectionName": "INSPECT_R22",
                      "InspectionStartTime": null,
                      "InspectionEndTime": null,
                      "TestProcedure": null,
                      "Comments": null,
                      "Result": "Failed",
                      "Error": null,
                      "DefectsFound": [
                        {
                          "UniqueIdentifier": "53c7d9e7-e43f-4415-a3ff-8932f0437dde",
                          "DefectCode": "ISFSLD112",
                          "DefectCategory": "Solder Problems",
                          "Description": "Insuffiecient Solder on R22, Lead 1",
                          "Comments": null,
                          "ComponentOfInterest": {
                            "ReferenceDesignator": "R22.1",
                            "UnitPosition": null,
                            "PartNumber": "11123-8897"
                          },
                          "RegionOfInterest": {
                            "StartPointX": 0.0,
                            "StartPointY": 0.0,
                            "RegionSegments": []
                          },
                          "DefectImages": [
                            {
                              "MimeType": "image/jpg",
                              "ImageData": "rFRWd9iZ"
                            }
                          ],
                          "Priority": 1,
                          "ConfidenceLevel": 100.0,
                          "RelatedMeasurements": [],
                          "RelatedSymptoms": []
                        },
                        {
                          "UniqueIdentifier": "561d08c2-aac9-422a-8910-41a3528a8acc",
                          "DefectCode": "TMBSTN211",
                          "DefectCategory": "Solder Problems",
                          "Description": "Tombston on R22",
                          "Comments": null,
                          "ComponentOfInterest": {
                            "ReferenceDesignator": "R22",
                            "UnitPosition": null,
                            "PartNumber": "11123-8897"
                          },
                          "RegionOfInterest": {
                            "StartPointX": 0.0,
                            "StartPointY": 0.0,
                            "RegionSegments": []
                          },
                          "DefectImages": [
                            {
                              "MimeType": "image/jpg",
                              "ImageData": "XSjjh8i5"
                            }
                          ],
                          "Priority": 1,
                          "ConfidenceLevel": 100.0,
                          "RelatedMeasurements": [],
                          "RelatedSymptoms": []
                        }
                      ],
                      "Symptoms": null,
                      "Measurements": []
                    },
                    {
                      "UniqueIdentifier": "abcbe17f-9232-4005-87e0-98651e2967b5",
                      "InspectionName": "COSMETIC_INSPECTION",
                      "InspectionStartTime": null,
                      "InspectionEndTime": null,
                      "TestProcedure": null,
                      "Comments": null,
                      "Result": "Failed",
                      "Error": null,
                      "DefectsFound": [
                        {
                          "UniqueIdentifier": "8018a32b-ef92-494f-bb3d-5e0549bdea20",
                          "DefectCode": "SCR23443",
                          "DefectCategory": "Cosmetic Problems",
                          "Description": "Scratch Detected on PCB substrate",
                          "Comments": null,
                          "ComponentOfInterest": {
                            "ReferenceDesignator": null,
                            "UnitPosition": null,
                            "PartNumber": null
                          },
                          "RegionOfInterest": {
                            "StartPointX": 2.3,
                            "StartPointY": 4.0,
                            "RegionSegments": [
                              {
                                "X": 5.6,
                                "Y": 4.0
                              },
                              {
                                "X": 5.6,
                                "Y": 1.6
                              },
                              {
                                "X": 2.3,
                                "Y": 1.6
                              },
                              {
                                "X": 2.3,
                                "Y": 4.0
                              }
                            ]
                          },
                          "DefectImages": [],
                          "Priority": 1,
                          "ConfidenceLevel": 100.0,
                          "RelatedMeasurements": [],
                          "RelatedSymptoms": []
                        }
                      ],
                      "Symptoms": null,
                      "Measurements": []
                    }
                  ]
                }
              ]
            }
            Solder Paste Inspection Example:
            {
              "TransactionId": "493bdbe0-9c32-4ed1-b7bf-b25372386b99",
              "InspectionMethod": "SPI",
              "SamplingInformation": {
                "SamplingMethod": "NoSampling",
                "LotSize": null,
                "SampleSize": null
              },
              "Inspector": {
                "OperatorIdentifier": "BADGE489499",
                "ActorType": "Human",
                "LastName": "Smith",
                "FirstName": "Joseph",
                "LoginName": "joseph.smith@abcdrepairs.com"
              },
              "InspectedUnits": [
                {
                  "UnitIdentifier": "PANEL34543535",
                  "UnitPositionNumber": 1,
                  "OverallResult": "Passed",
                  "Inspections": [
                    {
                      "UniqueIdentifier": "09b88135-019d-44f0-b28d-1de766851fd1",
                      "InspectionName": "INSPECT_PASTE_DEPOSITIONS",
                      "InspectionStartTime": null,
                      "InspectionEndTime": null,
                      "TestProcedure": null,
                      "Comments": null,
                      "Result": "Passed",
                      "Error": null,
                      "DefectsFound": [],
                      "Symptoms": null,
                      "Measurements": [
                        {
                          "$type": "CFX.Structures.SolderPasteInspection.SolderPasteMeasurement, CFX",
                          "X": 5.62,
                          "EX": 5.6,
                          "Y": 8.29,
                          "EY": 8.3,
                          "Z": 5.01,
                          "EZ": 5.0,
                          "DX": 0.02,
                          "DY": 0.03,
                          "Vol": 5.11,
                          "EVol": 5.1,
                          "Image": null,
                          "UniqueIdentifier": "9367a252-cd8b-4198-bd75-100a0ace2249",
                          "MeasurementName": "R1.1",
                          "TimeRecorded": null,
                          "Sequence": 0,
                          "Result": "Passed",
                          "CRDs": "R1.1"
                        },
                        {
                          "$type": "CFX.Structures.SolderPasteInspection.SolderPasteMeasurement, CFX",
                          "X": 5.62,
                          "EX": 5.6,
                          "Y": 8.29,
                          "EY": 8.3,
                          "Z": 5.01,
                          "EZ": 5.0,
                          "DX": 0.02,
                          "DY": 0.03,
                          "Vol": 5.11,
                          "EVol": 5.1,
                          "Image": null,
                          "UniqueIdentifier": "db0d3ac0-b6b8-40c2-8dd4-2ca426d3373a",
                          "MeasurementName": "R1.2",
                          "TimeRecorded": null,
                          "Sequence": 0,
                          "Result": "Passed",
                          "CRDs": "R1.1"
                        }
                      ]
                    }
                  ]
                },
                {
                  "UnitIdentifier": "PANEL34543535",
                  "UnitPositionNumber": 2,
                  "OverallResult": "Failed",
                  "Inspections": [
                    {
                      "UniqueIdentifier": "6ae0a4c5-119c-4381-8d9d-eb193345445f",
                      "InspectionName": "INSPECT_PASTE_DEPOSITIONS",
                      "InspectionStartTime": null,
                      "InspectionEndTime": null,
                      "TestProcedure": null,
                      "Comments": null,
                      "Result": "Passed",
                      "Error": null,
                      "DefectsFound": [],
                      "Symptoms": null,
                      "Measurements": [
                        {
                          "$type": "CFX.Structures.SolderPasteInspection.SolderPasteMeasurement, CFX",
                          "X": 5.62,
                          "EX": 5.6,
                          "Y": 8.29,
                          "EY": 8.3,
                          "Z": 5.01,
                          "EZ": 5.0,
                          "DX": 0.02,
                          "DY": 0.03,
                          "Vol": 5.11,
                          "EVol": 5.1,
                          "Image": null,
                          "UniqueIdentifier": "276b031b-69aa-47de-a087-bf4f1471ff0a",
                          "MeasurementName": "R1.1",
                          "TimeRecorded": null,
                          "Sequence": 0,
                          "Result": "Passed",
                          "CRDs": "R1.1"
                        },
                        {
                          "$type": "CFX.Structures.SolderPasteInspection.SolderPasteMeasurement, CFX",
                          "X": 5.62,
                          "EX": 5.6,
                          "Y": 8.29,
                          "EY": 8.3,
                          "Z": 5.01,
                          "EZ": 5.0,
                          "DX": 0.02,
                          "DY": 0.03,
                          "Vol": 5.11,
                          "EVol": 5.1,
                          "Image": null,
                          "UniqueIdentifier": "49e5f6cf-dd27-4ad7-aa77-469e1da576df",
                          "MeasurementName": "R1.2",
                          "TimeRecorded": null,
                          "Sequence": 0,
                          "Result": "Passed",
                          "CRDs": "R1.1"
                        }
                      ]
                    }
                  ]
                }
              ]
            }
            AOI Measuring Component Offsets Example:
            {
              "TransactionId": "b8c5c639-2ba8-4371-8edb-f743c5a7e33e",
              "InspectionMethod": "SPI",
              "SamplingInformation": {
                "SamplingMethod": "NoSampling",
                "LotSize": null,
                "SampleSize": null
              },
              "Inspector": {
                "OperatorIdentifier": "BADGE489499",
                "ActorType": "Human",
                "LastName": "Smith",
                "FirstName": "Joseph",
                "LoginName": "joseph.smith@abcdrepairs.com"
              },
              "InspectedUnits": [
                {
                  "UnitIdentifier": "PANEL34543535",
                  "UnitPositionNumber": 1,
                  "OverallResult": "Passed",
                  "Inspections": [
                    {
                      "UniqueIdentifier": "c9b462e5-3e62-482f-9417-268def5bd059",
                      "InspectionName": "INSPECT_COMPONENT_OFFSETS",
                      "InspectionStartTime": null,
                      "InspectionEndTime": null,
                      "TestProcedure": null,
                      "Comments": null,
                      "Result": "Passed",
                      "Error": null,
                      "DefectsFound": [],
                      "Symptoms": null,
                      "Measurements": [
                        {
                          "$type": "CFX.Structures.PCBInspection.OffsetMeasurement, CFX",
                          "DX": 0.02,
                          "DY": 0.01,
                          "DZ": 0.01,
                          "RXY": 0.01,
                          "RZX": 0.15,
                          "RZY": 0.15,
                          "UniqueIdentifier": "63e2821c-f735-4db9-b355-0b2da6be7040",
                          "MeasurementName": null,
                          "TimeRecorded": null,
                          "Sequence": 0,
                          "Result": "Passed",
                          "CRDs": "R1"
                        },
                        {
                          "$type": "CFX.Structures.PCBInspection.OffsetMeasurement, CFX",
                          "DX": 0.02,
                          "DY": 0.01,
                          "DZ": 0.01,
                          "RXY": 0.01,
                          "RZX": 0.15,
                          "RZY": 0.15,
                          "UniqueIdentifier": "dbd43fd9-de85-45c6-92fa-5ff271f9634b",
                          "MeasurementName": null,
                          "TimeRecorded": null,
                          "Sequence": 0,
                          "Result": "Passed",
                          "CRDs": "R2"
                        },
                        {
                          "$type": "CFX.Structures.PCBInspection.OffsetMeasurement, CFX",
                          "DX": 0.02,
                          "DY": 0.01,
                          "DZ": 0.01,
                          "RXY": 0.01,
                          "RZX": 0.15,
                          "RZY": 0.15,
                          "UniqueIdentifier": "ed8cabfb-4f69-4a64-a2dc-8b77f9690312",
                          "MeasurementName": null,
                          "TimeRecorded": null,
                          "Sequence": 0,
                          "Result": "Passed",
                          "CRDs": "R3"
                        },
                        {
                          "$type": "CFX.Structures.PCBInspection.OffsetMeasurement, CFX",
                          "DX": 0.02,
                          "DY": 0.01,
                          "DZ": 0.01,
                          "RXY": 0.01,
                          "RZX": 0.15,
                          "RZY": 0.15,
                          "UniqueIdentifier": "8212c29f-2498-4c30-b2c7-89a403b8f466",
                          "MeasurementName": null,
                          "TimeRecorded": null,
                          "Sequence": 0,
                          "Result": "Passed",
                          "CRDs": "R4"
                        }
                      ]
                    }
                  ]
                },
                {
                  "UnitIdentifier": "PANEL34543535",
                  "UnitPositionNumber": 2,
                  "OverallResult": "Failed",
                  "Inspections": [
                    {
                      "UniqueIdentifier": "92e9b1c1-e40b-41fb-ad41-74fba7668837",
                      "InspectionName": "INSPECT_COMPONENT_OFFSETS",
                      "InspectionStartTime": null,
                      "InspectionEndTime": null,
                      "TestProcedure": null,
                      "Comments": null,
                      "Result": "Passed",
                      "Error": null,
                      "DefectsFound": [],
                      "Symptoms": null,
                      "Measurements": [
                        {
                          "$type": "CFX.Structures.PCBInspection.OffsetMeasurement, CFX",
                          "DX": 0.02,
                          "DY": 0.01,
                          "DZ": 0.01,
                          "RXY": 0.01,
                          "RZX": 0.15,
                          "RZY": 0.15,
                          "UniqueIdentifier": "0c8f1340-1fef-4a32-9ff4-b44521723fe8",
                          "MeasurementName": null,
                          "TimeRecorded": null,
                          "Sequence": 0,
                          "Result": "Passed",
                          "CRDs": "R1"
                        },
                        {
                          "$type": "CFX.Structures.PCBInspection.OffsetMeasurement, CFX",
                          "DX": 0.02,
                          "DY": 0.01,
                          "DZ": 0.01,
                          "RXY": 0.01,
                          "RZX": 0.15,
                          "RZY": 0.15,
                          "UniqueIdentifier": "43e34985-0bc4-4a07-a702-2c1578f6f2c3",
                          "MeasurementName": null,
                          "TimeRecorded": null,
                          "Sequence": 0,
                          "Result": "Passed",
                          "CRDs": "R2"
                        },
                        {
                          "$type": "CFX.Structures.PCBInspection.OffsetMeasurement, CFX",
                          "DX": 0.02,
                          "DY": 0.01,
                          "DZ": 0.01,
                          "RXY": 0.01,
                          "RZX": 0.15,
                          "RZY": 0.15,
                          "UniqueIdentifier": "5d2df2b8-0444-481c-b888-d47c68d51924",
                          "MeasurementName": null,
                          "TimeRecorded": null,
                          "Sequence": 0,
                          "Result": "Passed",
                          "CRDs": "R3"
                        },
                        {
                          "$type": "CFX.Structures.PCBInspection.OffsetMeasurement, CFX",
                          "DX": 0.02,
                          "DY": 0.01,
                          "DZ": 0.01,
                          "RXY": 0.01,
                          "RZX": 0.15,
                          "RZY": 0.15,
                          "UniqueIdentifier": "fb0ab546-5f52-4a25-9a32-a4d52eedc373",
                          "MeasurementName": null,
                          "TimeRecorded": null,
                          "Sequence": 0,
                          "Result": "Passed",
                          "CRDs": "R4"
                        }
                      ]
                    }
                  ]
                }
              ]
            }
 * original type: CFX.Production.TestAndInspection.UnitsInspected
 */
public class UnitsInspected extends CFXMessage {

  private UUID transactionId;
  private InspectionMethod inspectionMethod;
  private SamplingInformation samplingInformation;
  private Operator inspector;
  private String recipeName;
  private String recipeRevision;
  private InspectedUnit[] inspectedUnits;

  /**
   * The id of the work transaction with which this inspection session is associated.
   */
  @JsonSetter("TransactionId")
  public void setTransactionId(UUID transactionId) {
    this.transactionId = transactionId;
  }

  /**
   * The id of the work transaction with which this inspection session is associated.
   */
  @JsonGetter("TransactionId")
  public UUID getTransactionId() {
    return transactionId;
  }

  /**
   * Describes how the inspections were performed
   */
  @JsonSetter("InspectionMethod")
  public void setInspectionMethod(InspectionMethod inspectionMethod) {
    this.inspectionMethod = inspectionMethod;
  }

  /**
   * Describes how the inspections were performed
   */
  @JsonGetter("InspectionMethod")
  public InspectionMethod getInspectionMethod() {
    return inspectionMethod;
  }

  /**
   * Describes the sampling method that was used during the inspections (if any)
   */
  @JsonSetter("SamplingInformation")
  public void setSamplingInformation(SamplingInformation samplingInformation) {
    this.samplingInformation = samplingInformation;
  }

  /**
   * Describes the sampling method that was used during the inspections (if any)
   */
  @JsonGetter("SamplingInformation")
  public SamplingInformation getSamplingInformation() {
    return samplingInformation;
  }

  /**
   * Identifies the person who performed the inspections, or operator of the automated equipment that performed the inspections (optional)
   */
  @JsonSetter("Inspector")
  public void setInspector(Operator inspector) {
    this.inspector = inspector;
  }

  /**
   * Identifies the person who performed the inspections, or operator of the automated equipment that performed the inspections (optional)
   */
  @JsonGetter("Inspector")
  public Operator getInspector() {
    return inspector;
  }

  /**
   * The name of the recipe used to perform the inspection(s) for this transaction.
   */
  @JsonSetter("RecipeName")
  public void setRecipeName(String recipeName) {
    this.recipeName = recipeName;
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
   */
  @JsonSetter("RecipeRevision")
  public void setRecipeRevision(String recipeRevision) {
    this.recipeRevision = recipeRevision;
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
   * A list of the units that were inspected, along with the inspections made, 
            and inspection results.
   */
  @JsonSetter("InspectedUnits")
  public void setInspectedUnits(InspectedUnit[] inspectedUnits) {
    this.inspectedUnits = inspectedUnits;
  }

  /**
   * A list of the units that were inspected, along with the inspections made, 
            and inspection results.
   */
  @JsonGetter("InspectedUnits")
  public InspectedUnit[] getInspectedUnits() {
    return inspectedUnits;
  }
}
