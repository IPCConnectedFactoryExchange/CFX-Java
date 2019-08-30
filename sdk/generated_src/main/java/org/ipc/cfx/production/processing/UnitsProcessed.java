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
package org.ipc.cfx.production.processing;

import java.util.UUID;
import org.ipc.cfx.structures.ProcessingResult;
import org.ipc.cfx.structures.ProcessData;
import org.ipc.cfx.structures.ProcessedUnit;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent when an endpoint processes one or more production units within
            the scope of a work transaction.  Contains dynamic structures that vary
            based upon the type of processing that was performed.
            Example 1 (Reflow Oven Processing):
            {
              &quot;TransactionId&quot;: &quot;a881ac27-9649-41c8-a13e-df118471eb1e&quot;,
              &quot;OverallResult&quot;: &quot;Succeeded&quot;,
              &quot;CommonProcessData&quot;: {
                &quot;$type&quot;: &quot;CFX.Structures.SolderReflow.ReflowProcessData, CFX&quot;,
                &quot;ConveyorSpeed&quot;: 60.0,
                &quot;ConveyorSpeedSetpoint&quot;: 0.0,
                &quot;ZoneData&quot;: [
                  {
                    &quot;Zone&quot;: {
                      &quot;ReflowZoneType&quot;: &quot;PreHeat&quot;,
                      &quot;StageSequence&quot;: 1,
                      &quot;StageName&quot;: &quot;Zone1&quot;,
                      &quot;StageType&quot;: &quot;Work&quot;
                    },
                    &quot;Setpoints&quot;: [
                      {
                        &quot;SubZone&quot;: &quot;Top&quot;,
                        &quot;SetpointType&quot;: &quot;Temperature&quot;,
                        &quot;Setpoint&quot;: 220.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;Bottom&quot;,
                        &quot;SetpointType&quot;: &quot;Temperature&quot;,
                        &quot;Setpoint&quot;: 210.0
                      }
                    ],
                    &quot;Readings&quot;: [
                      {
                        &quot;SubZone&quot;: &quot;Top&quot;,
                        &quot;ReadingType&quot;: &quot;Temperature&quot;,
                        &quot;ReadingValue&quot;: 221.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;Top&quot;,
                        &quot;ReadingType&quot;: &quot;Power&quot;,
                        &quot;ReadingValue&quot;: 220.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;Top&quot;,
                        &quot;ReadingType&quot;: &quot;PowerLevel&quot;,
                        &quot;ReadingValue&quot;: 55.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;Bottom&quot;,
                        &quot;ReadingType&quot;: &quot;Temperature&quot;,
                        &quot;ReadingValue&quot;: 209.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;Bottom&quot;,
                        &quot;ReadingType&quot;: &quot;Power&quot;,
                        &quot;ReadingValue&quot;: 195.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;Bottom&quot;,
                        &quot;ReadingType&quot;: &quot;PowerLevel&quot;,
                        &quot;ReadingValue&quot;: 45.0
                      }
                    ]
                  },
                  {
                    &quot;Zone&quot;: {
                      &quot;ReflowZoneType&quot;: &quot;Soak&quot;,
                      &quot;StageSequence&quot;: 2,
                      &quot;StageName&quot;: &quot;Zone2&quot;,
                      &quot;StageType&quot;: &quot;Work&quot;
                    },
                    &quot;Setpoints&quot;: [
                      {
                        &quot;SubZone&quot;: &quot;Top&quot;,
                        &quot;SetpointType&quot;: &quot;Temperature&quot;,
                        &quot;Setpoint&quot;: 200.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;Bottom&quot;,
                        &quot;SetpointType&quot;: &quot;Temperature&quot;,
                        &quot;Setpoint&quot;: 190.0
                      }
                    ],
                    &quot;Readings&quot;: [
                      {
                        &quot;SubZone&quot;: &quot;Top&quot;,
                        &quot;ReadingType&quot;: &quot;Temperature&quot;,
                        &quot;ReadingValue&quot;: 201.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;Top&quot;,
                        &quot;ReadingType&quot;: &quot;Power&quot;,
                        &quot;ReadingValue&quot;: 190.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;Top&quot;,
                        &quot;ReadingType&quot;: &quot;PowerLevel&quot;,
                        &quot;ReadingValue&quot;: 45.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;Bottom&quot;,
                        &quot;ReadingType&quot;: &quot;Temperature&quot;,
                        &quot;ReadingValue&quot;: 189.5
                      },
                      {
                        &quot;SubZone&quot;: &quot;Bottom&quot;,
                        &quot;ReadingType&quot;: &quot;Power&quot;,
                        &quot;ReadingValue&quot;: 185.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;Bottom&quot;,
                        &quot;ReadingType&quot;: &quot;PowerLevel&quot;,
                        &quot;ReadingValue&quot;: 42.0
                      }
                    ]
                  },
                  {
                    &quot;Zone&quot;: {
                      &quot;ReflowZoneType&quot;: &quot;Reflow&quot;,
                      &quot;StageSequence&quot;: 3,
                      &quot;StageName&quot;: &quot;Zone3&quot;,
                      &quot;StageType&quot;: &quot;Work&quot;
                    },
                    &quot;Setpoints&quot;: [
                      {
                        &quot;SubZone&quot;: &quot;Top&quot;,
                        &quot;SetpointType&quot;: &quot;Temperature&quot;,
                        &quot;Setpoint&quot;: 250.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;Bottom&quot;,
                        &quot;SetpointType&quot;: &quot;Temperature&quot;,
                        &quot;Setpoint&quot;: 240.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;WholeZone&quot;,
                        &quot;SetpointType&quot;: &quot;O2&quot;,
                        &quot;Setpoint&quot;: 500.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;WholeZone&quot;,
                        &quot;SetpointType&quot;: &quot;Vacuum&quot;,
                        &quot;Setpoint&quot;: 225.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;WholeZone&quot;,
                        &quot;SetpointType&quot;: &quot;VacuumHoldTime&quot;,
                        &quot;Setpoint&quot;: 5.0
                      }
                    ],
                    &quot;Readings&quot;: [
                      {
                        &quot;SubZone&quot;: &quot;Top&quot;,
                        &quot;ReadingType&quot;: &quot;Temperature&quot;,
                        &quot;ReadingValue&quot;: 251.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;Top&quot;,
                        &quot;ReadingType&quot;: &quot;Power&quot;,
                        &quot;ReadingValue&quot;: 230.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;Top&quot;,
                        &quot;ReadingType&quot;: &quot;PowerLevel&quot;,
                        &quot;ReadingValue&quot;: 75.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;Bottom&quot;,
                        &quot;ReadingType&quot;: &quot;Temperature&quot;,
                        &quot;ReadingValue&quot;: 239.5
                      },
                      {
                        &quot;SubZone&quot;: &quot;Bottom&quot;,
                        &quot;ReadingType&quot;: &quot;Power&quot;,
                        &quot;ReadingValue&quot;: 220.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;Bottom&quot;,
                        &quot;ReadingType&quot;: &quot;PowerLevel&quot;,
                        &quot;ReadingValue&quot;: 65.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;WholeZone&quot;,
                        &quot;ReadingType&quot;: &quot;O2&quot;,
                        &quot;ReadingValue&quot;: 498.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;WholeZone&quot;,
                        &quot;ReadingType&quot;: &quot;Vacuum&quot;,
                        &quot;ReadingValue&quot;: 224.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;WholeZone&quot;,
                        &quot;ReadingType&quot;: &quot;VacuumHoldTime&quot;,
                        &quot;ReadingValue&quot;: 5.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;WholeZone&quot;,
                        &quot;ReadingType&quot;: &quot;ConvectionRate&quot;,
                        &quot;ReadingValue&quot;: 250.0
                      }
                    ]
                  },
                  {
                    &quot;Zone&quot;: {
                      &quot;ReflowZoneType&quot;: &quot;Cool&quot;,
                      &quot;StageSequence&quot;: 4,
                      &quot;StageName&quot;: &quot;Zone4&quot;,
                      &quot;StageType&quot;: &quot;Work&quot;
                    },
                    &quot;Setpoints&quot;: [
                      {
                        &quot;SubZone&quot;: &quot;Top&quot;,
                        &quot;SetpointType&quot;: &quot;Temperature&quot;,
                        &quot;Setpoint&quot;: 150.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;Bottom&quot;,
                        &quot;SetpointType&quot;: &quot;Temperature&quot;,
                        &quot;Setpoint&quot;: 140.0
                      }
                    ],
                    &quot;Readings&quot;: [
                      {
                        &quot;SubZone&quot;: &quot;Top&quot;,
                        &quot;ReadingType&quot;: &quot;Temperature&quot;,
                        &quot;ReadingValue&quot;: 151.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;Top&quot;,
                        &quot;ReadingType&quot;: &quot;Power&quot;,
                        &quot;ReadingValue&quot;: 120.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;Top&quot;,
                        &quot;ReadingType&quot;: &quot;PowerLevel&quot;,
                        &quot;ReadingValue&quot;: 30.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;Bottom&quot;,
                        &quot;ReadingType&quot;: &quot;Temperature&quot;,
                        &quot;ReadingValue&quot;: 139.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;Bottom&quot;,
                        &quot;ReadingType&quot;: &quot;Power&quot;,
                        &quot;ReadingValue&quot;: 110.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;Bottom&quot;,
                        &quot;ReadingType&quot;: &quot;PowerLevel&quot;,
                        &quot;ReadingValue&quot;: 25.0
                      }
                    ]
                  }
                ]
              },
              &quot;UnitProcessData&quot;: []
            }
            Example 2 (Conformal Coating Process):
            {
              &quot;TransactionId&quot;: &quot;d280fd1c-e2cb-4544-be8b-78554c87a0c5&quot;,
              &quot;OverallResult&quot;: &quot;Succeeded&quot;,
              &quot;CommonProcessData&quot;: null,
              &quot;UnitProcessData&quot;: [
                {
                  &quot;UnitIdentifier&quot;: &quot;CARRIER55678&quot;,
                  &quot;UnitPositionNumber&quot;: 1,
                  &quot;UnitResult&quot;: &quot;Succeeded&quot;,
                  &quot;UnitProcessData&quot;: {
                    &quot;$type&quot;: &quot;CFX.Structures.Coating.CoatingProcessData, CFX&quot;,
                    &quot;Readings&quot;: [
                      {
                        &quot;MeasurementType&quot;: &quot;FluidVolume&quot;,
                        &quot;ActualValue&quot;: 1.1,
                        &quot;ExpectedValue&quot;: 1.0,
                        &quot;MinAcceptableValue&quot;: 0.8,
                        &quot;MaxAcceptableValue&quot;: 1.2,
                        &quot;UniqueIdentifier&quot;: &quot;c3113de4-c3f9-4c9d-8814-fee2ea12e90b&quot;,
                        &quot;MeasurementName&quot;: &quot;FluidVolume&quot;,
                        &quot;TimeRecorded&quot;: null,
                        &quot;Sequence&quot;: 0,
                        &quot;Result&quot;: &quot;Passed&quot;,
                        &quot;CRDs&quot;: null
                      },
                      {
                        &quot;MeasurementType&quot;: &quot;FluidPressure&quot;,
                        &quot;ActualValue&quot;: 32.5,
                        &quot;ExpectedValue&quot;: 32.0,
                        &quot;MinAcceptableValue&quot;: 31.0,
                        &quot;MaxAcceptableValue&quot;: 33.8,
                        &quot;UniqueIdentifier&quot;: &quot;fd246214-573b-40dd-927a-ebfb49d46ae7&quot;,
                        &quot;MeasurementName&quot;: &quot;FluidPressure&quot;,
                        &quot;TimeRecorded&quot;: null,
                        &quot;Sequence&quot;: 0,
                        &quot;Result&quot;: &quot;Passed&quot;,
                        &quot;CRDs&quot;: null
                      }
                    ]
                  }
                },
                {
                  &quot;UnitIdentifier&quot;: &quot;CARRIER55678&quot;,
                  &quot;UnitPositionNumber&quot;: 2,
                  &quot;UnitResult&quot;: &quot;Succeeded&quot;,
                  &quot;UnitProcessData&quot;: {
                    &quot;$type&quot;: &quot;CFX.Structures.Coating.CoatingProcessData, CFX&quot;,
                    &quot;Readings&quot;: [
                      {
                        &quot;MeasurementType&quot;: &quot;FluidVolume&quot;,
                        &quot;ActualValue&quot;: 1.1,
                        &quot;ExpectedValue&quot;: 1.0,
                        &quot;MinAcceptableValue&quot;: 0.8,
                        &quot;MaxAcceptableValue&quot;: 1.2,
                        &quot;UniqueIdentifier&quot;: &quot;11508f6f-fa11-4533-9db0-d3ff99bb03ba&quot;,
                        &quot;MeasurementName&quot;: &quot;FluidVolume&quot;,
                        &quot;TimeRecorded&quot;: null,
                        &quot;Sequence&quot;: 0,
                        &quot;Result&quot;: &quot;Passed&quot;,
                        &quot;CRDs&quot;: null
                      },
                      {
                        &quot;MeasurementType&quot;: &quot;FluidPressure&quot;,
                        &quot;ActualValue&quot;: 32.5,
                        &quot;ExpectedValue&quot;: 32.0,
                        &quot;MinAcceptableValue&quot;: 31.0,
                        &quot;MaxAcceptableValue&quot;: 33.8,
                        &quot;UniqueIdentifier&quot;: &quot;a0fff961-4fb4-4851-932d-fb811d2fe83d&quot;,
                        &quot;MeasurementName&quot;: &quot;FluidPressure&quot;,
                        &quot;TimeRecorded&quot;: null,
                        &quot;Sequence&quot;: 0,
                        &quot;Result&quot;: &quot;Passed&quot;,
                        &quot;CRDs&quot;: null
                      }
                    ]
                  }
                }
              ]
            }
            Example 3 (Reflow Profiling Device):
            {
              &quot;TransactionId&quot;: &quot;40e16df4-acaa-4c4a-9503-fca51ca58876&quot;,
              &quot;OverallResult&quot;: &quot;Succeeded&quot;,
              &quot;CommonProcessData&quot;: {
                &quot;$type&quot;: &quot;CFX.Structures.ReflowProfiling.ReflowProfilingProcessData, CFX&quot;,
                &quot;TimeDateUnitIn&quot;: &quot;2018-10-31T09:30:27.05191-04:00&quot;,
                &quot;TimeDateUnitOut&quot;: &quot;2018-10-31T09:31:49.05191-04:00&quot;,
                &quot;ProductName&quot;: &quot;Product1&quot;,
                &quot;Barcode&quot;: &quot;CARRIER55678&quot;,
                &quot;RecipeName&quot;: &quot;Recipe1&quot;,
                &quot;ProcessWindowName&quot;: &quot;ProcessWindow001&quot;,
                &quot;LotID&quot;: &quot;Lot5564&quot;,
                &quot;OvenName&quot;: &quot;Oven1&quot;,
                &quot;Lane&quot;: 1,
                &quot;ConveyorSpeedSetpoint&quot;: 100.0,
                &quot;MeasuredConveyorSpeed&quot;: 102.3,
                &quot;Result&quot;: &quot;Passed&quot;,
                &quot;ProductionUnitPWI&quot;: 89.6,
                &quot;ZoneData&quot;: [
                  {
                    &quot;Zone&quot;: {
                      &quot;ReflowZoneType&quot;: &quot;PreHeat&quot;,
                      &quot;StageSequence&quot;: 1,
                      &quot;StageName&quot;: &quot;Zone1&quot;,
                      &quot;StageType&quot;: &quot;Work&quot;
                    },
                    &quot;Setpoints&quot;: [
                      {
                        &quot;SubZone&quot;: &quot;Top&quot;,
                        &quot;SetpointType&quot;: &quot;Temperature&quot;,
                        &quot;Setpoint&quot;: 220.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;Bottom&quot;,
                        &quot;SetpointType&quot;: &quot;Temperature&quot;,
                        &quot;Setpoint&quot;: 210.0
                      }
                    ],
                    &quot;Readings&quot;: [
                      {
                        &quot;SubZone&quot;: &quot;Top&quot;,
                        &quot;ReadingType&quot;: &quot;Temperature&quot;,
                        &quot;ReadingValue&quot;: 221.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;Top&quot;,
                        &quot;ReadingType&quot;: &quot;Power&quot;,
                        &quot;ReadingValue&quot;: 220.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;Top&quot;,
                        &quot;ReadingType&quot;: &quot;PowerLevel&quot;,
                        &quot;ReadingValue&quot;: 55.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;Bottom&quot;,
                        &quot;ReadingType&quot;: &quot;Temperature&quot;,
                        &quot;ReadingValue&quot;: 209.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;Bottom&quot;,
                        &quot;ReadingType&quot;: &quot;Power&quot;,
                        &quot;ReadingValue&quot;: 195.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;Bottom&quot;,
                        &quot;ReadingType&quot;: &quot;PowerLevel&quot;,
                        &quot;ReadingValue&quot;: 45.0
                      }
                    ]
                  },
                  {
                    &quot;Zone&quot;: {
                      &quot;ReflowZoneType&quot;: &quot;Soak&quot;,
                      &quot;StageSequence&quot;: 2,
                      &quot;StageName&quot;: &quot;Zone2&quot;,
                      &quot;StageType&quot;: &quot;Work&quot;
                    },
                    &quot;Setpoints&quot;: [
                      {
                        &quot;SubZone&quot;: &quot;Top&quot;,
                        &quot;SetpointType&quot;: &quot;Temperature&quot;,
                        &quot;Setpoint&quot;: 200.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;Bottom&quot;,
                        &quot;SetpointType&quot;: &quot;Temperature&quot;,
                        &quot;Setpoint&quot;: 190.0
                      }
                    ],
                    &quot;Readings&quot;: [
                      {
                        &quot;SubZone&quot;: &quot;Top&quot;,
                        &quot;ReadingType&quot;: &quot;Temperature&quot;,
                        &quot;ReadingValue&quot;: 201.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;Top&quot;,
                        &quot;ReadingType&quot;: &quot;Power&quot;,
                        &quot;ReadingValue&quot;: 190.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;Top&quot;,
                        &quot;ReadingType&quot;: &quot;PowerLevel&quot;,
                        &quot;ReadingValue&quot;: 45.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;Bottom&quot;,
                        &quot;ReadingType&quot;: &quot;Temperature&quot;,
                        &quot;ReadingValue&quot;: 189.5
                      },
                      {
                        &quot;SubZone&quot;: &quot;Bottom&quot;,
                        &quot;ReadingType&quot;: &quot;Power&quot;,
                        &quot;ReadingValue&quot;: 185.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;Bottom&quot;,
                        &quot;ReadingType&quot;: &quot;PowerLevel&quot;,
                        &quot;ReadingValue&quot;: 42.0
                      }
                    ]
                  },
                  {
                    &quot;Zone&quot;: {
                      &quot;ReflowZoneType&quot;: &quot;Reflow&quot;,
                      &quot;StageSequence&quot;: 3,
                      &quot;StageName&quot;: &quot;Zone3&quot;,
                      &quot;StageType&quot;: &quot;Work&quot;
                    },
                    &quot;Setpoints&quot;: [
                      {
                        &quot;SubZone&quot;: &quot;Top&quot;,
                        &quot;SetpointType&quot;: &quot;Temperature&quot;,
                        &quot;Setpoint&quot;: 250.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;Bottom&quot;,
                        &quot;SetpointType&quot;: &quot;Temperature&quot;,
                        &quot;Setpoint&quot;: 240.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;WholeZone&quot;,
                        &quot;SetpointType&quot;: &quot;O2&quot;,
                        &quot;Setpoint&quot;: 500.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;WholeZone&quot;,
                        &quot;SetpointType&quot;: &quot;Vacuum&quot;,
                        &quot;Setpoint&quot;: 225.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;WholeZone&quot;,
                        &quot;SetpointType&quot;: &quot;VacuumHoldTime&quot;,
                        &quot;Setpoint&quot;: 5.0
                      }
                    ],
                    &quot;Readings&quot;: [
                      {
                        &quot;SubZone&quot;: &quot;Top&quot;,
                        &quot;ReadingType&quot;: &quot;Temperature&quot;,
                        &quot;ReadingValue&quot;: 251.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;Top&quot;,
                        &quot;ReadingType&quot;: &quot;Power&quot;,
                        &quot;ReadingValue&quot;: 230.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;Top&quot;,
                        &quot;ReadingType&quot;: &quot;PowerLevel&quot;,
                        &quot;ReadingValue&quot;: 75.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;Bottom&quot;,
                        &quot;ReadingType&quot;: &quot;Temperature&quot;,
                        &quot;ReadingValue&quot;: 239.5
                      },
                      {
                        &quot;SubZone&quot;: &quot;Bottom&quot;,
                        &quot;ReadingType&quot;: &quot;Power&quot;,
                        &quot;ReadingValue&quot;: 220.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;Bottom&quot;,
                        &quot;ReadingType&quot;: &quot;PowerLevel&quot;,
                        &quot;ReadingValue&quot;: 65.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;WholeZone&quot;,
                        &quot;ReadingType&quot;: &quot;O2&quot;,
                        &quot;ReadingValue&quot;: 498.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;WholeZone&quot;,
                        &quot;ReadingType&quot;: &quot;Vacuum&quot;,
                        &quot;ReadingValue&quot;: 224.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;WholeZone&quot;,
                        &quot;ReadingType&quot;: &quot;VacuumHoldTime&quot;,
                        &quot;ReadingValue&quot;: 5.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;WholeZone&quot;,
                        &quot;ReadingType&quot;: &quot;ConvectionRate&quot;,
                        &quot;ReadingValue&quot;: 250.0
                      }
                    ]
                  },
                  {
                    &quot;Zone&quot;: {
                      &quot;ReflowZoneType&quot;: &quot;Cool&quot;,
                      &quot;StageSequence&quot;: 4,
                      &quot;StageName&quot;: &quot;Zone4&quot;,
                      &quot;StageType&quot;: &quot;Work&quot;
                    },
                    &quot;Setpoints&quot;: [
                      {
                        &quot;SubZone&quot;: &quot;Top&quot;,
                        &quot;SetpointType&quot;: &quot;Temperature&quot;,
                        &quot;Setpoint&quot;: 150.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;Bottom&quot;,
                        &quot;SetpointType&quot;: &quot;Temperature&quot;,
                        &quot;Setpoint&quot;: 140.0
                      }
                    ],
                    &quot;Readings&quot;: [
                      {
                        &quot;SubZone&quot;: &quot;Top&quot;,
                        &quot;ReadingType&quot;: &quot;Temperature&quot;,
                        &quot;ReadingValue&quot;: 151.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;Top&quot;,
                        &quot;ReadingType&quot;: &quot;Power&quot;,
                        &quot;ReadingValue&quot;: 120.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;Top&quot;,
                        &quot;ReadingType&quot;: &quot;PowerLevel&quot;,
                        &quot;ReadingValue&quot;: 30.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;Bottom&quot;,
                        &quot;ReadingType&quot;: &quot;Temperature&quot;,
                        &quot;ReadingValue&quot;: 139.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;Bottom&quot;,
                        &quot;ReadingType&quot;: &quot;Power&quot;,
                        &quot;ReadingValue&quot;: 110.0
                      },
                      {
                        &quot;SubZone&quot;: &quot;Bottom&quot;,
                        &quot;ReadingType&quot;: &quot;PowerLevel&quot;,
                        &quot;ReadingValue&quot;: 25.0
                      }
                    ]
                  }
                ]
              },
              &quot;UnitProcessData&quot;: []
            }
            Example 4 (Selective Soldering Process):
            {
              &quot;TransactionId&quot;: &quot;a4275a83-4a6a-4656-a92d-402ddd4458d8&quot;,
              &quot;OverallResult&quot;: &quot;Succeeded&quot;,
              &quot;CommonProcessData&quot;: {
                &quot;$type&quot;: &quot;CFX.Structures.SolderApplication.SelectiveSolderProcessData, CFX&quot;,
                &quot;Process_Status&quot;: &quot;Completed&quot;,
                &quot;RecipeName&quot;: &quot;Panasonic 2up&quot;,
                &quot;Nitrogen_Pressure&quot;: 54.0,
                &quot;Air_Pressure&quot;: 62.0,
                &quot;Cycle_Count&quot;: 671261,
                &quot;Cycle_Time&quot;: &quot;00:01:44.2000000&quot;,
                &quot;Nitrogen_Purity&quot;: 15.0,
                &quot;Nitrogen_Flow&quot;: 39.0,
                &quot;Fiducial_Enabled&quot;: true
              },
              &quot;UnitProcessData&quot;: [
                {
                  &quot;UnitIdentifier&quot;: &quot;PANEL4325435&quot;,
                  &quot;UnitPositionNumber&quot;: 1,
                  &quot;UnitResult&quot;: &quot;Succeeded&quot;,
                  &quot;UnitProcessData&quot;: {
                    &quot;$type&quot;: &quot;CFX.Structures.SolderApplication.SelectiveSolderPCBProcessData, CFX&quot;,
                    &quot;ZoneData&quot;: [
                      {
                        &quot;StageSequence&quot;: 1,
                        &quot;ProcessTime&quot;: &quot;00:15:00&quot;,
                        &quot;Bottle1_Pressure&quot;: 7.0,
                        &quot;Bottle2_Pressure&quot;: 7.0,
                        &quot;Flux_Volume&quot;: 210.0,
                        &quot;Top_Preheater_Power&quot;: 50.0,
                        &quot;Top_Preheater_Soak&quot;: 10.0,
                        &quot;Top_Preheater_Temp&quot;: 109.0,
                        &quot;Top_Preheater_Time&quot;: &quot;00:00:37&quot;,
                        &quot;Bot_Preheater_Power&quot;: 0.0,
                        &quot;Bot_Preheater_Soak&quot;: 0.0,
                        &quot;Bot_Preheater_Temp&quot;: 0.0,
                        &quot;Bot_Preheater_Time&quot;: &quot;00:00:00&quot;,
                        &quot;Bath_Temp&quot;: 0.0,
                        &quot;Bath_Wave_Enabled&quot;: false,
                        &quot;Bath_Wave_Hgt&quot;: 0.0,
                        &quot;Solder_Quantity_Used&quot;: 0.0,
                        &quot;Fid_XCorrection&quot;: 0.15,
                        &quot;Fid_YCorrection&quot;: 0.2
                      },
                      {
                        &quot;StageSequence&quot;: 2,
                        &quot;ProcessTime&quot;: &quot;00:00:37&quot;,
                        &quot;Bottle1_Pressure&quot;: 0.0,
                        &quot;Bottle2_Pressure&quot;: 0.0,
                        &quot;Flux_Volume&quot;: 0.0,
                        &quot;Top_Preheater_Power&quot;: 50.0,
                        &quot;Top_Preheater_Soak&quot;: 10.0,
                        &quot;Top_Preheater_Temp&quot;: 109.0,
                        &quot;Top_Preheater_Time&quot;: &quot;00:00:37&quot;,
                        &quot;Bot_Preheater_Power&quot;: 50.0,
                        &quot;Bot_Preheater_Soak&quot;: 10.0,
                        &quot;Bot_Preheater_Temp&quot;: 108.0,
                        &quot;Bot_Preheater_Time&quot;: &quot;00:00:37&quot;,
                        &quot;Bath_Temp&quot;: 0.0,
                        &quot;Bath_Wave_Enabled&quot;: false,
                        &quot;Bath_Wave_Hgt&quot;: 0.0,
                        &quot;Solder_Quantity_Used&quot;: 0.0,
                        &quot;Fid_XCorrection&quot;: 0.0,
                        &quot;Fid_YCorrection&quot;: 0.0
                      },
                      {
                        &quot;StageSequence&quot;: 3,
                        &quot;ProcessTime&quot;: &quot;00:00:37&quot;,
                        &quot;Bottle1_Pressure&quot;: 0.0,
                        &quot;Bottle2_Pressure&quot;: 0.0,
                        &quot;Flux_Volume&quot;: 0.0,
                        &quot;Top_Preheater_Power&quot;: 50.0,
                        &quot;Top_Preheater_Soak&quot;: 10.0,
                        &quot;Top_Preheater_Temp&quot;: 109.0,
                        &quot;Top_Preheater_Time&quot;: &quot;00:00:37&quot;,
                        &quot;Bot_Preheater_Power&quot;: 50.0,
                        &quot;Bot_Preheater_Soak&quot;: 10.0,
                        &quot;Bot_Preheater_Temp&quot;: 108.0,
                        &quot;Bot_Preheater_Time&quot;: &quot;00:00:37&quot;,
                        &quot;Bath_Temp&quot;: 305.0,
                        &quot;Bath_Wave_Enabled&quot;: true,
                        &quot;Bath_Wave_Hgt&quot;: 0.1,
                        &quot;Solder_Quantity_Used&quot;: 5.0,
                        &quot;Fid_XCorrection&quot;: 0.15,
                        &quot;Fid_YCorrection&quot;: 0.2
                      }
                    ]
                  }
                },
                {
                  &quot;UnitIdentifier&quot;: &quot;PANEL4325435&quot;,
                  &quot;UnitPositionNumber&quot;: 2,
                  &quot;UnitResult&quot;: &quot;Succeeded&quot;,
                  &quot;UnitProcessData&quot;: {
                    &quot;$type&quot;: &quot;CFX.Structures.SolderApplication.SelectiveSolderPCBProcessData, CFX&quot;,
                    &quot;ZoneData&quot;: [
                      {
                        &quot;StageSequence&quot;: 1,
                        &quot;ProcessTime&quot;: &quot;00:15:00&quot;,
                        &quot;Bottle1_Pressure&quot;: 7.0,
                        &quot;Bottle2_Pressure&quot;: 7.0,
                        &quot;Flux_Volume&quot;: 210.0,
                        &quot;Top_Preheater_Power&quot;: 50.0,
                        &quot;Top_Preheater_Soak&quot;: 10.0,
                        &quot;Top_Preheater_Temp&quot;: 109.0,
                        &quot;Top_Preheater_Time&quot;: &quot;00:00:37&quot;,
                        &quot;Bot_Preheater_Power&quot;: 0.0,
                        &quot;Bot_Preheater_Soak&quot;: 0.0,
                        &quot;Bot_Preheater_Temp&quot;: 0.0,
                        &quot;Bot_Preheater_Time&quot;: &quot;00:00:00&quot;,
                        &quot;Bath_Temp&quot;: 0.0,
                        &quot;Bath_Wave_Enabled&quot;: false,
                        &quot;Bath_Wave_Hgt&quot;: 0.0,
                        &quot;Solder_Quantity_Used&quot;: 0.0,
                        &quot;Fid_XCorrection&quot;: 0.15,
                        &quot;Fid_YCorrection&quot;: 0.2
                      },
                      {
                        &quot;StageSequence&quot;: 2,
                        &quot;ProcessTime&quot;: &quot;00:00:37&quot;,
                        &quot;Bottle1_Pressure&quot;: 0.0,
                        &quot;Bottle2_Pressure&quot;: 0.0,
                        &quot;Flux_Volume&quot;: 0.0,
                        &quot;Top_Preheater_Power&quot;: 50.0,
                        &quot;Top_Preheater_Soak&quot;: 10.0,
                        &quot;Top_Preheater_Temp&quot;: 109.0,
                        &quot;Top_Preheater_Time&quot;: &quot;00:00:37&quot;,
                        &quot;Bot_Preheater_Power&quot;: 50.0,
                        &quot;Bot_Preheater_Soak&quot;: 10.0,
                        &quot;Bot_Preheater_Temp&quot;: 108.0,
                        &quot;Bot_Preheater_Time&quot;: &quot;00:00:37&quot;,
                        &quot;Bath_Temp&quot;: 0.0,
                        &quot;Bath_Wave_Enabled&quot;: false,
                        &quot;Bath_Wave_Hgt&quot;: 0.0,
                        &quot;Solder_Quantity_Used&quot;: 0.0,
                        &quot;Fid_XCorrection&quot;: 0.0,
                        &quot;Fid_YCorrection&quot;: 0.0
                      },
                      {
                        &quot;StageSequence&quot;: 3,
                        &quot;ProcessTime&quot;: &quot;00:00:37&quot;,
                        &quot;Bottle1_Pressure&quot;: 0.0,
                        &quot;Bottle2_Pressure&quot;: 0.0,
                        &quot;Flux_Volume&quot;: 0.0,
                        &quot;Top_Preheater_Power&quot;: 50.0,
                        &quot;Top_Preheater_Soak&quot;: 10.0,
                        &quot;Top_Preheater_Temp&quot;: 109.0,
                        &quot;Top_Preheater_Time&quot;: &quot;00:00:37&quot;,
                        &quot;Bot_Preheater_Power&quot;: 50.0,
                        &quot;Bot_Preheater_Soak&quot;: 10.0,
                        &quot;Bot_Preheater_Temp&quot;: 108.0,
                        &quot;Bot_Preheater_Time&quot;: &quot;00:00:37&quot;,
                        &quot;Bath_Temp&quot;: 305.0,
                        &quot;Bath_Wave_Enabled&quot;: true,
                        &quot;Bath_Wave_Hgt&quot;: 0.1,
                        &quot;Solder_Quantity_Used&quot;: 5.0,
                        &quot;Fid_XCorrection&quot;: 0.15,
                        &quot;Fid_YCorrection&quot;: 0.2
                      }
                    ]
                  }
                }
              ]
            }
 * original type: CFX.Production.Processing.UnitsProcessed
 */
public class UnitsProcessed extends CFXMessage {

  private UUID transactionId;
  private ProcessingResult overallResult;
  private ProcessData commonProcessData;
  private ProcessedUnit[] unitProcessData;

  /**
   * The id of the work transaction with which this message is associated.
   * @param transactionId the value
   */
  @JsonSetter("TransactionId")
  public void setTransactionId(UUID transactionId) {
    this.transactionId = transactionId;
  }

  /**
   * The id of the work transaction with which this message is associated.
   * @return TransactionId
   */
  @JsonGetter("TransactionId")
  public UUID getTransactionId() {
    return transactionId;
  }

  /**
   * The overall result of the processing operation.
   * @param overallResult the value
   */
  @JsonSetter("OverallResult")
  public void setOverallResult(ProcessingResult overallResult) {
    this.overallResult = overallResult;
  }

  /**
   * The overall result of the processing operation.
   * @return OverallResult
   */
  @JsonGetter("OverallResult")
  public ProcessingResult getOverallResult() {
    return overallResult;
  }

  /**
   * Dynamic structure containing data that is common to all production units processed
            by this work transaction.  Any data that is specfic to an individual production unit
            will instead be contained within the UnitProcessData property.
   * @param commonProcessData the value
   */
  @JsonSetter("CommonProcessData")
  public void setCommonProcessData(ProcessData commonProcessData) {
    this.commonProcessData = commonProcessData;
  }

  /**
   * Dynamic structure containing data that is common to all production units processed
            by this work transaction.  Any data that is specfic to an individual production unit
            will instead be contained within the UnitProcessData property.
   * @return CommonProcessData
   */
  @JsonGetter("CommonProcessData")
  public ProcessData getCommonProcessData() {
    return commonProcessData;
  }

  /**
   * A list of structures containing the processing data for each 
            production units processed by this transaction.
   * @param unitProcessData the value
   */
  @JsonSetter("UnitProcessData")
  public void setUnitProcessData(ProcessedUnit[] unitProcessData) {
    this.unitProcessData = unitProcessData;
  }

  /**
   * A list of structures containing the processing data for each 
            production units processed by this transaction.
   * @return UnitProcessData
   */
  @JsonGetter("UnitProcessData")
  public ProcessedUnit[] getUnitProcessData() {
    return unitProcessData;
  }
}
