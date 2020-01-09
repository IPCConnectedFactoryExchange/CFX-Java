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
              &quot;TransactionId&quot;: &quot;14d48338-09b7-4d20-acb9-bf951270793a&quot;,
              &quot;InspectionMethod&quot;: &quot;AOI&quot;,
              &quot;SamplingInformation&quot;: {
                &quot;SamplingMethod&quot;: &quot;NoSampling&quot;,
                &quot;LotSize&quot;: null,
                &quot;SampleSize&quot;: null
              },
              &quot;Inspector&quot;: {
                &quot;OperatorIdentifier&quot;: &quot;BADGE489499&quot;,
                &quot;ActorType&quot;: &quot;Human&quot;,
                &quot;LastName&quot;: &quot;Smith&quot;,
                &quot;FirstName&quot;: &quot;Joseph&quot;,
                &quot;LoginName&quot;: &quot;joseph.smith@abcdrepairs.com&quot;
              },
              &quot;InspectedUnits&quot;: [
                {
                  &quot;UnitIdentifier&quot;: &quot;PANEL34543535&quot;,
                  &quot;UnitPositionNumber&quot;: 1,
                  &quot;OverallResult&quot;: &quot;Passed&quot;,
                  &quot;Inspections&quot;: [
                    {
                      &quot;UniqueIdentifier&quot;: &quot;481f296f-d4b2-4d8e-8b05-a0a17ca33488&quot;,
                      &quot;InspectionName&quot;: &quot;INSPECT_R21&quot;,
                      &quot;InspectionStartTime&quot;: null,
                      &quot;InspectionEndTime&quot;: null,
                      &quot;TestProcedure&quot;: null,
                      &quot;Comments&quot;: null,
                      &quot;Result&quot;: &quot;Passed&quot;,
                      &quot;Error&quot;: null,
                      &quot;DefectsFound&quot;: [],
                      &quot;Symptoms&quot;: null,
                      &quot;Measurements&quot;: []
                    },
                    {
                      &quot;UniqueIdentifier&quot;: &quot;074c7aa5-8871-4629-b139-122b620bdc1b&quot;,
                      &quot;InspectionName&quot;: &quot;INSPECT_R22&quot;,
                      &quot;InspectionStartTime&quot;: null,
                      &quot;InspectionEndTime&quot;: null,
                      &quot;TestProcedure&quot;: null,
                      &quot;Comments&quot;: null,
                      &quot;Result&quot;: &quot;Passed&quot;,
                      &quot;Error&quot;: null,
                      &quot;DefectsFound&quot;: [],
                      &quot;Symptoms&quot;: null,
                      &quot;Measurements&quot;: []
                    }
                  ]
                },
                {
                  &quot;UnitIdentifier&quot;: &quot;PANEL34543535&quot;,
                  &quot;UnitPositionNumber&quot;: 2,
                  &quot;OverallResult&quot;: &quot;Failed&quot;,
                  &quot;Inspections&quot;: [
                    {
                      &quot;UniqueIdentifier&quot;: &quot;27e4a632-5670-4683-9b54-b67b7df98260&quot;,
                      &quot;InspectionName&quot;: &quot;INSPECT_R21&quot;,
                      &quot;InspectionStartTime&quot;: null,
                      &quot;InspectionEndTime&quot;: null,
                      &quot;TestProcedure&quot;: null,
                      &quot;Comments&quot;: null,
                      &quot;Result&quot;: &quot;Passed&quot;,
                      &quot;Error&quot;: null,
                      &quot;DefectsFound&quot;: [],
                      &quot;Symptoms&quot;: null,
                      &quot;Measurements&quot;: []
                    },
                    {
                      &quot;UniqueIdentifier&quot;: &quot;f7ed3609-ea35-4bcc-9170-cb5d540348d5&quot;,
                      &quot;InspectionName&quot;: &quot;INSPECT_R22&quot;,
                      &quot;InspectionStartTime&quot;: null,
                      &quot;InspectionEndTime&quot;: null,
                      &quot;TestProcedure&quot;: null,
                      &quot;Comments&quot;: null,
                      &quot;Result&quot;: &quot;Failed&quot;,
                      &quot;Error&quot;: null,
                      &quot;DefectsFound&quot;: [
                        {
                          &quot;UniqueIdentifier&quot;: &quot;53c7d9e7-e43f-4415-a3ff-8932f0437dde&quot;,
                          &quot;DefectCode&quot;: &quot;ISFSLD112&quot;,
                          &quot;DefectCategory&quot;: &quot;Solder Problems&quot;,
                          &quot;Description&quot;: &quot;Insuffiecient Solder on R22, Lead 1&quot;,
                          &quot;Comments&quot;: null,
                          &quot;ComponentOfInterest&quot;: {
                            &quot;ReferenceDesignator&quot;: &quot;R22.1&quot;,
                            &quot;UnitPosition&quot;: null,
                            &quot;PartNumber&quot;: &quot;11123-8897&quot;
                          },
                          &quot;RegionOfInterest&quot;: {
                            &quot;StartPointX&quot;: 0.0,
                            &quot;StartPointY&quot;: 0.0,
                            &quot;RegionSegments&quot;: []
                          },
                          &quot;DefectImages&quot;: [
                            {
                              &quot;MimeType&quot;: &quot;image/jpg&quot;,
                              &quot;ImageData&quot;: &quot;rFRWd9iZ&quot;
                            }
                          ],
                          &quot;Priority&quot;: 1,
                          &quot;ConfidenceLevel&quot;: 100.0,
                          &quot;RelatedMeasurements&quot;: [],
                          &quot;RelatedSymptoms&quot;: []
                        },
                        {
                          &quot;UniqueIdentifier&quot;: &quot;561d08c2-aac9-422a-8910-41a3528a8acc&quot;,
                          &quot;DefectCode&quot;: &quot;TMBSTN211&quot;,
                          &quot;DefectCategory&quot;: &quot;Solder Problems&quot;,
                          &quot;Description&quot;: &quot;Tombston on R22&quot;,
                          &quot;Comments&quot;: null,
                          &quot;ComponentOfInterest&quot;: {
                            &quot;ReferenceDesignator&quot;: &quot;R22&quot;,
                            &quot;UnitPosition&quot;: null,
                            &quot;PartNumber&quot;: &quot;11123-8897&quot;
                          },
                          &quot;RegionOfInterest&quot;: {
                            &quot;StartPointX&quot;: 0.0,
                            &quot;StartPointY&quot;: 0.0,
                            &quot;RegionSegments&quot;: []
                          },
                          &quot;DefectImages&quot;: [
                            {
                              &quot;MimeType&quot;: &quot;image/jpg&quot;,
                              &quot;ImageData&quot;: &quot;XSjjh8i5&quot;
                            }
                          ],
                          &quot;Priority&quot;: 1,
                          &quot;ConfidenceLevel&quot;: 100.0,
                          &quot;RelatedMeasurements&quot;: [],
                          &quot;RelatedSymptoms&quot;: []
                        }
                      ],
                      &quot;Symptoms&quot;: null,
                      &quot;Measurements&quot;: []
                    },
                    {
                      &quot;UniqueIdentifier&quot;: &quot;abcbe17f-9232-4005-87e0-98651e2967b5&quot;,
                      &quot;InspectionName&quot;: &quot;COSMETIC_INSPECTION&quot;,
                      &quot;InspectionStartTime&quot;: null,
                      &quot;InspectionEndTime&quot;: null,
                      &quot;TestProcedure&quot;: null,
                      &quot;Comments&quot;: null,
                      &quot;Result&quot;: &quot;Failed&quot;,
                      &quot;Error&quot;: null,
                      &quot;DefectsFound&quot;: [
                        {
                          &quot;UniqueIdentifier&quot;: &quot;8018a32b-ef92-494f-bb3d-5e0549bdea20&quot;,
                          &quot;DefectCode&quot;: &quot;SCR23443&quot;,
                          &quot;DefectCategory&quot;: &quot;Cosmetic Problems&quot;,
                          &quot;Description&quot;: &quot;Scratch Detected on PCB substrate&quot;,
                          &quot;Comments&quot;: null,
                          &quot;ComponentOfInterest&quot;: {
                            &quot;ReferenceDesignator&quot;: null,
                            &quot;UnitPosition&quot;: null,
                            &quot;PartNumber&quot;: null
                          },
                          &quot;RegionOfInterest&quot;: {
                            &quot;StartPointX&quot;: 2.3,
                            &quot;StartPointY&quot;: 4.0,
                            &quot;RegionSegments&quot;: [
                              {
                                &quot;X&quot;: 5.6,
                                &quot;Y&quot;: 4.0
                              },
                              {
                                &quot;X&quot;: 5.6,
                                &quot;Y&quot;: 1.6
                              },
                              {
                                &quot;X&quot;: 2.3,
                                &quot;Y&quot;: 1.6
                              },
                              {
                                &quot;X&quot;: 2.3,
                                &quot;Y&quot;: 4.0
                              }
                            ]
                          },
                          &quot;DefectImages&quot;: [],
                          &quot;Priority&quot;: 1,
                          &quot;ConfidenceLevel&quot;: 100.0,
                          &quot;RelatedMeasurements&quot;: [],
                          &quot;RelatedSymptoms&quot;: []
                        }
                      ],
                      &quot;Symptoms&quot;: null,
                      &quot;Measurements&quot;: []
                    }
                  ]
                }
              ]
            }
            Solder Paste Inspection Example:
            {
              &quot;TransactionId&quot;: &quot;493bdbe0-9c32-4ed1-b7bf-b25372386b99&quot;,
              &quot;InspectionMethod&quot;: &quot;SPI&quot;,
              &quot;SamplingInformation&quot;: {
                &quot;SamplingMethod&quot;: &quot;NoSampling&quot;,
                &quot;LotSize&quot;: null,
                &quot;SampleSize&quot;: null
              },
              &quot;Inspector&quot;: {
                &quot;OperatorIdentifier&quot;: &quot;BADGE489499&quot;,
                &quot;ActorType&quot;: &quot;Human&quot;,
                &quot;LastName&quot;: &quot;Smith&quot;,
                &quot;FirstName&quot;: &quot;Joseph&quot;,
                &quot;LoginName&quot;: &quot;joseph.smith@abcdrepairs.com&quot;
              },
              &quot;InspectedUnits&quot;: [
                {
                  &quot;UnitIdentifier&quot;: &quot;PANEL34543535&quot;,
                  &quot;UnitPositionNumber&quot;: 1,
                  &quot;OverallResult&quot;: &quot;Passed&quot;,
                  &quot;Inspections&quot;: [
                    {
                      &quot;UniqueIdentifier&quot;: &quot;09b88135-019d-44f0-b28d-1de766851fd1&quot;,
                      &quot;InspectionName&quot;: &quot;INSPECT_PASTE_DEPOSITIONS&quot;,
                      &quot;InspectionStartTime&quot;: null,
                      &quot;InspectionEndTime&quot;: null,
                      &quot;TestProcedure&quot;: null,
                      &quot;Comments&quot;: null,
                      &quot;Result&quot;: &quot;Passed&quot;,
                      &quot;Error&quot;: null,
                      &quot;DefectsFound&quot;: [],
                      &quot;Symptoms&quot;: null,
                      &quot;Measurements&quot;: [
                        {
                          &quot;$type&quot;: &quot;CFX.Structures.SolderPasteInspection.SolderPasteMeasurement, CFX&quot;,
                          &quot;X&quot;: 5.62,
                          &quot;EX&quot;: 5.6,
                          &quot;Y&quot;: 8.29,
                          &quot;EY&quot;: 8.3,
                          &quot;Z&quot;: 5.01,
                          &quot;EZ&quot;: 5.0,
                          &quot;DX&quot;: 0.02,
                          &quot;DY&quot;: 0.03,
                          &quot;Vol&quot;: 5.11,
                          &quot;EVol&quot;: 5.1,
                          &quot;Image&quot;: null,
                          &quot;UniqueIdentifier&quot;: &quot;9367a252-cd8b-4198-bd75-100a0ace2249&quot;,
                          &quot;MeasurementName&quot;: &quot;R1.1&quot;,
                          &quot;TimeRecorded&quot;: null,
                          &quot;Sequence&quot;: 0,
                          &quot;Result&quot;: &quot;Passed&quot;,
                          &quot;CRDs&quot;: &quot;R1.1&quot;
                        },
                        {
                          &quot;$type&quot;: &quot;CFX.Structures.SolderPasteInspection.SolderPasteMeasurement, CFX&quot;,
                          &quot;X&quot;: 5.62,
                          &quot;EX&quot;: 5.6,
                          &quot;Y&quot;: 8.29,
                          &quot;EY&quot;: 8.3,
                          &quot;Z&quot;: 5.01,
                          &quot;EZ&quot;: 5.0,
                          &quot;DX&quot;: 0.02,
                          &quot;DY&quot;: 0.03,
                          &quot;Vol&quot;: 5.11,
                          &quot;EVol&quot;: 5.1,
                          &quot;Image&quot;: null,
                          &quot;UniqueIdentifier&quot;: &quot;db0d3ac0-b6b8-40c2-8dd4-2ca426d3373a&quot;,
                          &quot;MeasurementName&quot;: &quot;R1.2&quot;,
                          &quot;TimeRecorded&quot;: null,
                          &quot;Sequence&quot;: 0,
                          &quot;Result&quot;: &quot;Passed&quot;,
                          &quot;CRDs&quot;: &quot;R1.1&quot;
                        }
                      ]
                    }
                  ]
                },
                {
                  &quot;UnitIdentifier&quot;: &quot;PANEL34543535&quot;,
                  &quot;UnitPositionNumber&quot;: 2,
                  &quot;OverallResult&quot;: &quot;Failed&quot;,
                  &quot;Inspections&quot;: [
                    {
                      &quot;UniqueIdentifier&quot;: &quot;6ae0a4c5-119c-4381-8d9d-eb193345445f&quot;,
                      &quot;InspectionName&quot;: &quot;INSPECT_PASTE_DEPOSITIONS&quot;,
                      &quot;InspectionStartTime&quot;: null,
                      &quot;InspectionEndTime&quot;: null,
                      &quot;TestProcedure&quot;: null,
                      &quot;Comments&quot;: null,
                      &quot;Result&quot;: &quot;Passed&quot;,
                      &quot;Error&quot;: null,
                      &quot;DefectsFound&quot;: [],
                      &quot;Symptoms&quot;: null,
                      &quot;Measurements&quot;: [
                        {
                          &quot;$type&quot;: &quot;CFX.Structures.SolderPasteInspection.SolderPasteMeasurement, CFX&quot;,
                          &quot;X&quot;: 5.62,
                          &quot;EX&quot;: 5.6,
                          &quot;Y&quot;: 8.29,
                          &quot;EY&quot;: 8.3,
                          &quot;Z&quot;: 5.01,
                          &quot;EZ&quot;: 5.0,
                          &quot;DX&quot;: 0.02,
                          &quot;DY&quot;: 0.03,
                          &quot;Vol&quot;: 5.11,
                          &quot;EVol&quot;: 5.1,
                          &quot;Image&quot;: null,
                          &quot;UniqueIdentifier&quot;: &quot;276b031b-69aa-47de-a087-bf4f1471ff0a&quot;,
                          &quot;MeasurementName&quot;: &quot;R1.1&quot;,
                          &quot;TimeRecorded&quot;: null,
                          &quot;Sequence&quot;: 0,
                          &quot;Result&quot;: &quot;Passed&quot;,
                          &quot;CRDs&quot;: &quot;R1.1&quot;
                        },
                        {
                          &quot;$type&quot;: &quot;CFX.Structures.SolderPasteInspection.SolderPasteMeasurement, CFX&quot;,
                          &quot;X&quot;: 5.62,
                          &quot;EX&quot;: 5.6,
                          &quot;Y&quot;: 8.29,
                          &quot;EY&quot;: 8.3,
                          &quot;Z&quot;: 5.01,
                          &quot;EZ&quot;: 5.0,
                          &quot;DX&quot;: 0.02,
                          &quot;DY&quot;: 0.03,
                          &quot;Vol&quot;: 5.11,
                          &quot;EVol&quot;: 5.1,
                          &quot;Image&quot;: null,
                          &quot;UniqueIdentifier&quot;: &quot;49e5f6cf-dd27-4ad7-aa77-469e1da576df&quot;,
                          &quot;MeasurementName&quot;: &quot;R1.2&quot;,
                          &quot;TimeRecorded&quot;: null,
                          &quot;Sequence&quot;: 0,
                          &quot;Result&quot;: &quot;Passed&quot;,
                          &quot;CRDs&quot;: &quot;R1.1&quot;
                        }
                      ]
                    }
                  ]
                }
              ]
            }
            AOI Measuring Component Offsets Example:
            {
              &quot;TransactionId&quot;: &quot;b8c5c639-2ba8-4371-8edb-f743c5a7e33e&quot;,
              &quot;InspectionMethod&quot;: &quot;SPI&quot;,
              &quot;SamplingInformation&quot;: {
                &quot;SamplingMethod&quot;: &quot;NoSampling&quot;,
                &quot;LotSize&quot;: null,
                &quot;SampleSize&quot;: null
              },
              &quot;Inspector&quot;: {
                &quot;OperatorIdentifier&quot;: &quot;BADGE489499&quot;,
                &quot;ActorType&quot;: &quot;Human&quot;,
                &quot;LastName&quot;: &quot;Smith&quot;,
                &quot;FirstName&quot;: &quot;Joseph&quot;,
                &quot;LoginName&quot;: &quot;joseph.smith@abcdrepairs.com&quot;
              },
              &quot;InspectedUnits&quot;: [
                {
                  &quot;UnitIdentifier&quot;: &quot;PANEL34543535&quot;,
                  &quot;UnitPositionNumber&quot;: 1,
                  &quot;OverallResult&quot;: &quot;Passed&quot;,
                  &quot;Inspections&quot;: [
                    {
                      &quot;UniqueIdentifier&quot;: &quot;c9b462e5-3e62-482f-9417-268def5bd059&quot;,
                      &quot;InspectionName&quot;: &quot;INSPECT_COMPONENT_OFFSETS&quot;,
                      &quot;InspectionStartTime&quot;: null,
                      &quot;InspectionEndTime&quot;: null,
                      &quot;TestProcedure&quot;: null,
                      &quot;Comments&quot;: null,
                      &quot;Result&quot;: &quot;Passed&quot;,
                      &quot;Error&quot;: null,
                      &quot;DefectsFound&quot;: [],
                      &quot;Symptoms&quot;: null,
                      &quot;Measurements&quot;: [
                        {
                          &quot;$type&quot;: &quot;CFX.Structures.PCBInspection.OffsetMeasurement, CFX&quot;,
                          &quot;DX&quot;: 0.02,
                          &quot;DY&quot;: 0.01,
                          &quot;DZ&quot;: 0.01,
                          &quot;RXY&quot;: 0.01,
                          &quot;RZX&quot;: 0.15,
                          &quot;RZY&quot;: 0.15,
                          &quot;UniqueIdentifier&quot;: &quot;63e2821c-f735-4db9-b355-0b2da6be7040&quot;,
                          &quot;MeasurementName&quot;: null,
                          &quot;TimeRecorded&quot;: null,
                          &quot;Sequence&quot;: 0,
                          &quot;Result&quot;: &quot;Passed&quot;,
                          &quot;CRDs&quot;: &quot;R1&quot;
                        },
                        {
                          &quot;$type&quot;: &quot;CFX.Structures.PCBInspection.OffsetMeasurement, CFX&quot;,
                          &quot;DX&quot;: 0.02,
                          &quot;DY&quot;: 0.01,
                          &quot;DZ&quot;: 0.01,
                          &quot;RXY&quot;: 0.01,
                          &quot;RZX&quot;: 0.15,
                          &quot;RZY&quot;: 0.15,
                          &quot;UniqueIdentifier&quot;: &quot;dbd43fd9-de85-45c6-92fa-5ff271f9634b&quot;,
                          &quot;MeasurementName&quot;: null,
                          &quot;TimeRecorded&quot;: null,
                          &quot;Sequence&quot;: 0,
                          &quot;Result&quot;: &quot;Passed&quot;,
                          &quot;CRDs&quot;: &quot;R2&quot;
                        },
                        {
                          &quot;$type&quot;: &quot;CFX.Structures.PCBInspection.OffsetMeasurement, CFX&quot;,
                          &quot;DX&quot;: 0.02,
                          &quot;DY&quot;: 0.01,
                          &quot;DZ&quot;: 0.01,
                          &quot;RXY&quot;: 0.01,
                          &quot;RZX&quot;: 0.15,
                          &quot;RZY&quot;: 0.15,
                          &quot;UniqueIdentifier&quot;: &quot;ed8cabfb-4f69-4a64-a2dc-8b77f9690312&quot;,
                          &quot;MeasurementName&quot;: null,
                          &quot;TimeRecorded&quot;: null,
                          &quot;Sequence&quot;: 0,
                          &quot;Result&quot;: &quot;Passed&quot;,
                          &quot;CRDs&quot;: &quot;R3&quot;
                        },
                        {
                          &quot;$type&quot;: &quot;CFX.Structures.PCBInspection.OffsetMeasurement, CFX&quot;,
                          &quot;DX&quot;: 0.02,
                          &quot;DY&quot;: 0.01,
                          &quot;DZ&quot;: 0.01,
                          &quot;RXY&quot;: 0.01,
                          &quot;RZX&quot;: 0.15,
                          &quot;RZY&quot;: 0.15,
                          &quot;UniqueIdentifier&quot;: &quot;8212c29f-2498-4c30-b2c7-89a403b8f466&quot;,
                          &quot;MeasurementName&quot;: null,
                          &quot;TimeRecorded&quot;: null,
                          &quot;Sequence&quot;: 0,
                          &quot;Result&quot;: &quot;Passed&quot;,
                          &quot;CRDs&quot;: &quot;R4&quot;
                        }
                      ]
                    }
                  ]
                },
                {
                  &quot;UnitIdentifier&quot;: &quot;PANEL34543535&quot;,
                  &quot;UnitPositionNumber&quot;: 2,
                  &quot;OverallResult&quot;: &quot;Failed&quot;,
                  &quot;Inspections&quot;: [
                    {
                      &quot;UniqueIdentifier&quot;: &quot;92e9b1c1-e40b-41fb-ad41-74fba7668837&quot;,
                      &quot;InspectionName&quot;: &quot;INSPECT_COMPONENT_OFFSETS&quot;,
                      &quot;InspectionStartTime&quot;: null,
                      &quot;InspectionEndTime&quot;: null,
                      &quot;TestProcedure&quot;: null,
                      &quot;Comments&quot;: null,
                      &quot;Result&quot;: &quot;Passed&quot;,
                      &quot;Error&quot;: null,
                      &quot;DefectsFound&quot;: [],
                      &quot;Symptoms&quot;: null,
                      &quot;Measurements&quot;: [
                        {
                          &quot;$type&quot;: &quot;CFX.Structures.PCBInspection.OffsetMeasurement, CFX&quot;,
                          &quot;DX&quot;: 0.02,
                          &quot;DY&quot;: 0.01,
                          &quot;DZ&quot;: 0.01,
                          &quot;RXY&quot;: 0.01,
                          &quot;RZX&quot;: 0.15,
                          &quot;RZY&quot;: 0.15,
                          &quot;UniqueIdentifier&quot;: &quot;0c8f1340-1fef-4a32-9ff4-b44521723fe8&quot;,
                          &quot;MeasurementName&quot;: null,
                          &quot;TimeRecorded&quot;: null,
                          &quot;Sequence&quot;: 0,
                          &quot;Result&quot;: &quot;Passed&quot;,
                          &quot;CRDs&quot;: &quot;R1&quot;
                        },
                        {
                          &quot;$type&quot;: &quot;CFX.Structures.PCBInspection.OffsetMeasurement, CFX&quot;,
                          &quot;DX&quot;: 0.02,
                          &quot;DY&quot;: 0.01,
                          &quot;DZ&quot;: 0.01,
                          &quot;RXY&quot;: 0.01,
                          &quot;RZX&quot;: 0.15,
                          &quot;RZY&quot;: 0.15,
                          &quot;UniqueIdentifier&quot;: &quot;43e34985-0bc4-4a07-a702-2c1578f6f2c3&quot;,
                          &quot;MeasurementName&quot;: null,
                          &quot;TimeRecorded&quot;: null,
                          &quot;Sequence&quot;: 0,
                          &quot;Result&quot;: &quot;Passed&quot;,
                          &quot;CRDs&quot;: &quot;R2&quot;
                        },
                        {
                          &quot;$type&quot;: &quot;CFX.Structures.PCBInspection.OffsetMeasurement, CFX&quot;,
                          &quot;DX&quot;: 0.02,
                          &quot;DY&quot;: 0.01,
                          &quot;DZ&quot;: 0.01,
                          &quot;RXY&quot;: 0.01,
                          &quot;RZX&quot;: 0.15,
                          &quot;RZY&quot;: 0.15,
                          &quot;UniqueIdentifier&quot;: &quot;5d2df2b8-0444-481c-b888-d47c68d51924&quot;,
                          &quot;MeasurementName&quot;: null,
                          &quot;TimeRecorded&quot;: null,
                          &quot;Sequence&quot;: 0,
                          &quot;Result&quot;: &quot;Passed&quot;,
                          &quot;CRDs&quot;: &quot;R3&quot;
                        },
                        {
                          &quot;$type&quot;: &quot;CFX.Structures.PCBInspection.OffsetMeasurement, CFX&quot;,
                          &quot;DX&quot;: 0.02,
                          &quot;DY&quot;: 0.01,
                          &quot;DZ&quot;: 0.01,
                          &quot;RXY&quot;: 0.01,
                          &quot;RZX&quot;: 0.15,
                          &quot;RZY&quot;: 0.15,
                          &quot;UniqueIdentifier&quot;: &quot;fb0ab546-5f52-4a25-9a32-a4d52eedc373&quot;,
                          &quot;MeasurementName&quot;: null,
                          &quot;TimeRecorded&quot;: null,
                          &quot;Sequence&quot;: 0,
                          &quot;Result&quot;: &quot;Passed&quot;,
                          &quot;CRDs&quot;: &quot;R4&quot;
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
   * @param transactionId the value
   */
  @JsonSetter("TransactionId")
  public UnitsInspected setTransactionId(UUID transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * The id of the work transaction with which this inspection session is associated.
   * @return TransactionId
   */
  @JsonGetter("TransactionId")
  public UUID getTransactionId() {
    return transactionId;
  }

  /**
   * Describes how the inspections were performed
   * @param inspectionMethod the value
   */
  @JsonSetter("InspectionMethod")
  public UnitsInspected setInspectionMethod(InspectionMethod inspectionMethod) {
    this.inspectionMethod = inspectionMethod;
    return this;
  }

  /**
   * Describes how the inspections were performed
   * @return InspectionMethod
   */
  @JsonGetter("InspectionMethod")
  public InspectionMethod getInspectionMethod() {
    return inspectionMethod;
  }

  /**
   * Describes the sampling method that was used during the inspections (if any)
   * @param samplingInformation the value
   */
  @JsonSetter("SamplingInformation")
  public UnitsInspected setSamplingInformation(SamplingInformation samplingInformation) {
    this.samplingInformation = samplingInformation;
    return this;
  }

  /**
   * Describes the sampling method that was used during the inspections (if any)
   * @return SamplingInformation
   */
  @JsonGetter("SamplingInformation")
  public SamplingInformation getSamplingInformation() {
    return samplingInformation;
  }

  /**
   * Identifies the person who performed the inspections, or operator of the automated equipment that performed the inspections (optional)
   * @param inspector the value
   */
  @JsonSetter("Inspector")
  public UnitsInspected setInspector(Operator inspector) {
    this.inspector = inspector;
    return this;
  }

  /**
   * Identifies the person who performed the inspections, or operator of the automated equipment that performed the inspections (optional)
   * @return Inspector
   */
  @JsonGetter("Inspector")
  public Operator getInspector() {
    return inspector;
  }

  /**
   * The name of the recipe used to perform the inspection(s) for this transaction.
   * @param recipeName the value
   */
  @JsonSetter("RecipeName")
  public UnitsInspected setRecipeName(String recipeName) {
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
  public UnitsInspected setRecipeRevision(String recipeRevision) {
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
   * A list of the units that were inspected, along with the inspections made, 
            and inspection results.
   * @param inspectedUnits the value
   */
  @JsonSetter("InspectedUnits")
  public UnitsInspected setInspectedUnits(InspectedUnit[] inspectedUnits) {
    this.inspectedUnits = inspectedUnits;
    return this;
  }

  /**
   * A list of the units that were inspected, along with the inspections made, 
            and inspection results.
   * @return InspectedUnits
   */
  @JsonGetter("InspectedUnits")
  public InspectedUnit[] getInspectedUnits() {
    return inspectedUnits;
  }
}
