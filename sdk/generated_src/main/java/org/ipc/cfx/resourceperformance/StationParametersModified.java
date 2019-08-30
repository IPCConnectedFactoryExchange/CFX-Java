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
              &quot;ModifiedParameters&quot;: [
                {
                  &quot;$type&quot;: &quot;CFX.Structures.GenericParameter, CFX&quot;,
                  &quot;Name&quot;: &quot;Torque1&quot;,
                  &quot;Value&quot;: &quot;35.6&quot;
                }
              ]
            }
            Example fore Solder Reflow Oven
            {
              &quot;ModifiedParameters&quot;: [
                {
                  &quot;$type&quot;: &quot;CFX.Structures.SolderReflow.ReflowOvenParameter, CFX&quot;,
                  &quot;ConveyorSpeedSetpoint&quot;: 50.0,
                  &quot;ConveyorWidth&quot;: 25.0,
                  &quot;ZoneParameters&quot;: [
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
                          &quot;Setpoint&quot;: 220.0
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
                          &quot;Setpoint&quot;: 220.0
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
                          &quot;Setpoint&quot;: 200.0
                        },
                        {
                          &quot;SubZone&quot;: &quot;Bottom&quot;,
                          &quot;SetpointType&quot;: &quot;Temperature&quot;,
                          &quot;Setpoint&quot;: 220.0
                        },
                        {
                          &quot;SubZone&quot;: &quot;WholeZone&quot;,
                          &quot;SetpointType&quot;: &quot;O2&quot;,
                          &quot;Setpoint&quot;: 500.0
                        },
                        {
                          &quot;SubZone&quot;: &quot;WholeZone&quot;,
                          &quot;SetpointType&quot;: &quot;Vacuum&quot;,
                          &quot;Setpoint&quot;: 2.0
                        },
                        {
                          &quot;SubZone&quot;: &quot;WholeZone&quot;,
                          &quot;SetpointType&quot;: &quot;VacuumHoldTime&quot;,
                          &quot;Setpoint&quot;: 5.0
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
                          &quot;Setpoint&quot;: 105.0
                        },
                        {
                          &quot;SubZone&quot;: &quot;Bottom&quot;,
                          &quot;SetpointType&quot;: &quot;Temperature&quot;,
                          &quot;Setpoint&quot;: 105.0
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
   * @param modifiedParameters the value
   */
  @JsonSetter("ModifiedParameters")
  public void setModifiedParameters(Parameter[] modifiedParameters) {
    this.modifiedParameters = modifiedParameters;
  }

  /**
   * A list of the paramters that have been modified, along with their new values.
            The Parameter structure is a dynamic structure, and may be of differing types depending on the type of endpoint.
   * @return ModifiedParameters
   */
  @JsonGetter("ModifiedParameters")
  public Parameter[] getModifiedParameters() {
    return modifiedParameters;
  }
}
