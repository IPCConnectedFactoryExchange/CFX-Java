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
package org.ipc.cfx;

import org.ipc.cfx.structures.RequestResult;
import org.ipc.cfx.structures.Endpoint;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Allows any CFX endpoint to request the capabilities of a specified single endpoint. The response
            includes information about the endpoint, including its CFX Handle, and network hostname / address.
            The endpoint information structure is a dynamic structure, and can vary based on the type of endpoint.
            
            Generic example:
            
            {
              &quot;Result&quot;: {
                &quot;Result&quot;: &quot;Success&quot;,
                &quot;ResultCode&quot;: 0,
                &quot;Message&quot;: null
              },
              &quot;EndpointInformation&quot;: {
                &quot;CFXHandle&quot;: &quot;SMTPlus.Model_21232.SN23123&quot;,
                &quot;CFXVersion&quot;: &quot;1.0&quot;,
                &quot;RequestNetworkUri&quot;: &quot;amqp://host55:5688/&quot;,
                &quot;RequestTargetAddress&quot;: &quot;/queue/SN23123&quot;,
                &quot;UniqueIdentifier&quot;: &quot;UID1111111111111111&quot;,
                &quot;FriendlyName&quot;: &quot;SMD Printer 23123&quot;,
                &quot;Vendor&quot;: &quot;SMT Plus&quot;,
                &quot;ModelNumber&quot;: &quot;Model_11111&quot;,
                &quot;SerialNumber&quot;: &quot;SNSN23123&quot;,
                &quot;Stages&quot;: [
                  {
                    &quot;Stage&quot;: {
                      &quot;StageSequence&quot;: 1,
                      &quot;StageName&quot;: &quot;INBOUND BUFFER&quot;,
                      &quot;StageType&quot;: &quot;Buffer&quot;
                    }
                  },
                  {
                    &quot;Stage&quot;: {
                      &quot;StageSequence&quot;: 2,
                      &quot;StageName&quot;: &quot;WORK STAGE 1&quot;,
                      &quot;StageType&quot;: &quot;Work&quot;
                    }
                  },
                  {
                    &quot;Stage&quot;: {
                      &quot;StageSequence&quot;: 3,
                      &quot;StageName&quot;: &quot;OUTBOUND BUFFER&quot;,
                      &quot;StageType&quot;: &quot;Buffer&quot;
                    }
                  }
                ],
                &quot;NumberOfLanes&quot;: 1,
                &quot;HermesInformation&quot;: {
                  &quot;Enabled&quot;: true,
                  &quot;Version&quot;: &quot;1.0&quot;
                },
                &quot;OperatingRequirements&quot;: {
                  &quot;MinimumHumidity&quot;: 0.0,
                  &quot;MaximumHumidity&quot;: 0.8,
                  &quot;MinimumTemperature&quot;: -1.0,
                  &quot;MaximumTemperature&quot;: 40.0
                },
                &quot;SupportedTopics&quot;: [
                  {
                    &quot;TopicName&quot;: &quot;CFX.Production&quot;,
                    &quot;TopicSupportType&quot;: &quot;PublisherConsumer&quot;,
                    &quot;SupportedMessages&quot;: []
                  },
                  {
                    &quot;TopicName&quot;: &quot;CFX.Production.Application&quot;,
                    &quot;TopicSupportType&quot;: &quot;Publisher&quot;,
                    &quot;SupportedMessages&quot;: []
                  },
                  {
                    &quot;TopicName&quot;: &quot;CFX.ResourcePerformance&quot;,
                    &quot;TopicSupportType&quot;: &quot;Publisher&quot;,
                    &quot;SupportedMessages&quot;: []
                  }
                ]
              }
            }
            Example of SMT Placement Machine type endpoint:
            {
              &quot;Result&quot;: {
                &quot;Result&quot;: &quot;Success&quot;,
                &quot;ResultCode&quot;: 0,
                &quot;Message&quot;: null
              },
              &quot;EndpointInformation&quot;: {
                &quot;$type&quot;: &quot;CFX.Structures.SMTPlacement.SMTPlacementEndpoint, CFX&quot;,
                &quot;NominalPlacementCPH&quot;: 10000.0,
                &quot;NominalUnitsPerHour&quot;: 120.0,
                &quot;SupportedPCBDimensions&quot;: {
                  &quot;MinimumLength&quot;: 10.0,
                  &quot;MaximumLength&quot;: 1000.0,
                  &quot;MinimumWidth&quot;: 10.0,
                  &quot;MaximumWidth&quot;: 1000.0,
                  &quot;MinimumHeight&quot;: 0.0,
                  &quot;MaximumHeight&quot;: 50.0,
                  &quot;MinimumWeight&quot;: 0.0,
                  &quot;MaximumWeight&quot;: 1000.0,
                  &quot;MinimumThickness&quot;: 0.5,
                  &quot;MaximumThickness&quot;: 10.0
                },
                &quot;Lanes&quot;: [
                  {
                    &quot;LaneNumber&quot;: null,
                    &quot;LaneName&quot;: &quot;LANE1&quot;,
                    &quot;SupportedPCBDimensions&quot;: null
                  },
                  {
                    &quot;LaneNumber&quot;: null,
                    &quot;LaneName&quot;: &quot;LANE2&quot;,
                    &quot;SupportedPCBDimensions&quot;: null
                  }
                ],
                &quot;Heads&quot;: [
                  {
                    &quot;SMTHeadType&quot;: &quot;Pulsar&quot;,
                    &quot;NumberOfNozzleLocations&quot;: 6,
                    &quot;PlacementAccuracy&quot;: 0.001,
                    &quot;Head&quot;: {
                      &quot;HeadId&quot;: &quot;HD212343&quot;,
                      &quot;HeadSequence&quot;: 1,
                      &quot;HeadName&quot;: &quot;HEAD1&quot;
                    }
                  },
                  {
                    &quot;SMTHeadType&quot;: &quot;Pulsar&quot;,
                    &quot;NumberOfNozzleLocations&quot;: 6,
                    &quot;PlacementAccuracy&quot;: 0.001,
                    &quot;Head&quot;: {
                      &quot;HeadId&quot;: &quot;HD212344&quot;,
                      &quot;HeadSequence&quot;: 2,
                      &quot;HeadName&quot;: &quot;HEAD2&quot;
                    }
                  }
                ],
                &quot;PlacementConstraints&quot;: {
                  &quot;MinumumComponentBodySizeX&quot;: 0.0,
                  &quot;MaximumComponentBodySizeX&quot;: 0.0,
                  &quot;MinumumComponentBodySizeY&quot;: 0.0,
                  &quot;MaximumComponentBodySizeY&quot;: 0.0,
                  &quot;MinumumComponentHeight&quot;: 0.0,
                  &quot;MaximumComponentHeight&quot;: 0.0,
                  &quot;MinimumLeadWidth&quot;: 0.0,
                  &quot;MinimumBGAPitch&quot;: 0.0,
                  &quot;MinimumSOICPitch&quot;: 0.0,
                  &quot;MinimumMountingPressure&quot;: 0.0,
                  &quot;MaximumMountingPressure&quot;: 0.0
                },
                &quot;CFXHandle&quot;: &quot;SMTPlus.Model_21232.SN23123&quot;,
                &quot;CFXVersion&quot;: &quot;1.0&quot;,
                &quot;RequestNetworkUri&quot;: &quot;amqp://host33:5688/&quot;,
                &quot;RequestTargetAddress&quot;: &quot;/queue/SN23123&quot;,
                &quot;UniqueIdentifier&quot;: &quot;UID564545645645656564&quot;,
                &quot;FriendlyName&quot;: &quot;SMD Placer 23123&quot;,
                &quot;Vendor&quot;: &quot;SMT Plus&quot;,
                &quot;ModelNumber&quot;: &quot;Model_21232&quot;,
                &quot;SerialNumber&quot;: &quot;SN23123&quot;,
                &quot;Stages&quot;: [
                  {
                    &quot;$type&quot;: &quot;CFX.Structures.SMTPlacement.SMTStageInformation, CFX&quot;,
                    &quot;NumberOfFeederStations&quot;: 0,
                    &quot;Stage&quot;: {
                      &quot;StageSequence&quot;: 1,
                      &quot;StageName&quot;: &quot;BUFFERSTAGE1&quot;,
                      &quot;StageType&quot;: &quot;Buffer&quot;
                    }
                  },
                  {
                    &quot;$type&quot;: &quot;CFX.Structures.SMTPlacement.SMTStageInformation, CFX&quot;,
                    &quot;NumberOfFeederStations&quot;: 100,
                    &quot;Stage&quot;: {
                      &quot;StageSequence&quot;: 2,
                      &quot;StageName&quot;: &quot;WORKSTAGE1&quot;,
                      &quot;StageType&quot;: &quot;Work&quot;
                    }
                  },
                  {
                    &quot;$type&quot;: &quot;CFX.Structures.SMTPlacement.SMTStageInformation, CFX&quot;,
                    &quot;NumberOfFeederStations&quot;: 100,
                    &quot;Stage&quot;: {
                      &quot;StageSequence&quot;: 3,
                      &quot;StageName&quot;: &quot;WORKSTAGE2&quot;,
                      &quot;StageType&quot;: &quot;Work&quot;
                    }
                  }
                ],
                &quot;NumberOfLanes&quot;: 1,
                &quot;HermesInformation&quot;: {
                  &quot;Enabled&quot;: true,
                  &quot;Version&quot;: &quot;1.0&quot;
                },
                &quot;OperatingRequirements&quot;: {
                  &quot;MinimumHumidity&quot;: 0.0,
                  &quot;MaximumHumidity&quot;: 0.8,
                  &quot;MinimumTemperature&quot;: -1.0,
                  &quot;MaximumTemperature&quot;: 40.0
                },
                &quot;SupportedTopics&quot;: [
                  {
                    &quot;TopicName&quot;: &quot;CFX.Production&quot;,
                    &quot;TopicSupportType&quot;: &quot;PublisherConsumer&quot;,
                    &quot;SupportedMessages&quot;: []
                  },
                  {
                    &quot;TopicName&quot;: &quot;CFX.Production.Assembly&quot;,
                    &quot;TopicSupportType&quot;: &quot;Publisher&quot;,
                    &quot;SupportedMessages&quot;: []
                  },
                  {
                    &quot;TopicName&quot;: &quot;CFX.ResourcePerformance&quot;,
                    &quot;TopicSupportType&quot;: &quot;Publisher&quot;,
                    &quot;SupportedMessages&quot;: []
                  }
                ]
              }
            }
 * original type: CFX.GetEndpointInformationResponse
 */
public class GetEndpointInformationResponse extends CFXMessage {

  private RequestResult result;
  private Endpoint endpointInformation;

  /**
   * The result of the request
   * @param result the value
   */
  @JsonSetter("Result")
  public void setResult(RequestResult result) {
    this.result = result;
  }

  /**
   * The result of the request
   * @return Result
   */
  @JsonGetter("Result")
  public RequestResult getResult() {
    return result;
  }

  /**
   * Dynamic structure that describes the details of this endpoint.
   * @param endpointInformation the value
   */
  @JsonSetter("EndpointInformation")
  public void setEndpointInformation(Endpoint endpointInformation) {
    this.endpointInformation = endpointInformation;
  }

  /**
   * Dynamic structure that describes the details of this endpoint.
   * @return EndpointInformation
   */
  @JsonGetter("EndpointInformation")
  public Endpoint getEndpointInformation() {
    return endpointInformation;
  }
}
