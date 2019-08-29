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
package org.ipc.cfx.resourceperformance;

import org.ipc.cfx.structures.Parameter;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent by a process endpoint to indicate that an operator has modified a generic
            parameter or configuration setting. This does not apply to settings related to
            recipes, which are handled by the RecipeModified event. 
            Generic Example
            {
              "ModifiedParameters": [
                {
                  "$type": "CFX.Structures.GenericParameter, CFX",
                  "Name": "Torque1",
                  "Value": "35.6"
                }
              ]
            }
            Example fore Solder Reflow Oven
            {
              "ModifiedParameters": [
                {
                  "$type": "CFX.Structures.SolderReflow.ReflowOvenParameter, CFX",
                  "ConveyorSpeedSetpoint": 50.0,
                  "ConveyorWidth": 25.0,
                  "ZoneParameters": [
                    {
                      "Zone": {
                        "ReflowZoneType": "PreHeat",
                        "StageSequence": 1,
                        "StageName": "Zone1",
                        "StageType": "Work"
                      },
                      "Setpoints": [
                        {
                          "SubZone": "Top",
                          "SetpointType": "Temperature",
                          "Setpoint": 220.0
                        },
                        {
                          "SubZone": "Bottom",
                          "SetpointType": "Temperature",
                          "Setpoint": 220.0
                        }
                      ]
                    },
                    {
                      "Zone": {
                        "ReflowZoneType": "Soak",
                        "StageSequence": 2,
                        "StageName": "Zone2",
                        "StageType": "Work"
                      },
                      "Setpoints": [
                        {
                          "SubZone": "Top",
                          "SetpointType": "Temperature",
                          "Setpoint": 200.0
                        },
                        {
                          "SubZone": "Bottom",
                          "SetpointType": "Temperature",
                          "Setpoint": 220.0
                        }
                      ]
                    },
                    {
                      "Zone": {
                        "ReflowZoneType": "Reflow",
                        "StageSequence": 3,
                        "StageName": "Zone3",
                        "StageType": "Work"
                      },
                      "Setpoints": [
                        {
                          "SubZone": "Top",
                          "SetpointType": "Temperature",
                          "Setpoint": 200.0
                        },
                        {
                          "SubZone": "Bottom",
                          "SetpointType": "Temperature",
                          "Setpoint": 220.0
                        },
                        {
                          "SubZone": "WholeZone",
                          "SetpointType": "O2",
                          "Setpoint": 500.0
                        },
                        {
                          "SubZone": "WholeZone",
                          "SetpointType": "Vacuum",
                          "Setpoint": 2.0
                        },
                        {
                          "SubZone": "WholeZone",
                          "SetpointType": "VacuumHoldTime",
                          "Setpoint": 5.0
                        }
                      ]
                    },
                    {
                      "Zone": {
                        "ReflowZoneType": "Cool",
                        "StageSequence": 4,
                        "StageName": "Zone4",
                        "StageType": "Work"
                      },
                      "Setpoints": [
                        {
                          "SubZone": "Top",
                          "SetpointType": "Temperature",
                          "Setpoint": 105.0
                        },
                        {
                          "SubZone": "Bottom",
                          "SetpointType": "Temperature",
                          "Setpoint": 105.0
                        }
                      ]
                    }
                  ]
                }
              ]
            }
 * original type: CFX.ResourcePerformance.StationParametersModified
 */
public class StationParametersModified extends CFXMessage {

  private Parameter[] modifiedParameters;

  /**
   * A list of the paramters that have been modified, along with their new values.
            The Parameter structure is a dynamic structure, and may be of differing types depending on the type of endpoint.
   */
  @JsonSetter("ModifiedParameters")
  public void setModifiedParameters(Parameter[] modifiedParameters) {
    this.modifiedParameters = modifiedParameters;
  }

  /**
   * A list of the paramters that have been modified, along with their new values.
            The Parameter structure is a dynamic structure, and may be of differing types depending on the type of endpoint.
   */
  @JsonGetter("ModifiedParameters")
  public Parameter[] getModifiedParameters() {
    return modifiedParameters;
  }
}
