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
              "Result": {
                "Result": "Success",
                "ResultCode": 0,
                "Message": null
              },
              "EndpointInformation": {
                "CFXHandle": "SMTPlus.Model_21232.SN23123",
                "CFXVersion": "1.0",
                "RequestNetworkUri": "amqp://host55:5688/",
                "RequestTargetAddress": "/queue/SN23123",
                "UniqueIdentifier": "UID1111111111111111",
                "FriendlyName": "SMD Printer 23123",
                "Vendor": "SMT Plus",
                "ModelNumber": "Model_11111",
                "SerialNumber": "SNSN23123",
                "Stages": [
                  {
                    "Stage": {
                      "StageSequence": 1,
                      "StageName": "INBOUND BUFFER",
                      "StageType": "Buffer"
                    }
                  },
                  {
                    "Stage": {
                      "StageSequence": 2,
                      "StageName": "WORK STAGE 1",
                      "StageType": "Work"
                    }
                  },
                  {
                    "Stage": {
                      "StageSequence": 3,
                      "StageName": "OUTBOUND BUFFER",
                      "StageType": "Buffer"
                    }
                  }
                ],
                "NumberOfLanes": 1,
                "HermesInformation": {
                  "Enabled": true,
                  "Version": "1.0"
                },
                "OperatingRequirements": {
                  "MinimumHumidity": 0.0,
                  "MaximumHumidity": 0.8,
                  "MinimumTemperature": -1.0,
                  "MaximumTemperature": 40.0
                },
                "SupportedTopics": [
                  {
                    "TopicName": "CFX.Production",
                    "TopicSupportType": "PublisherConsumer",
                    "SupportedMessages": []
                  },
                  {
                    "TopicName": "CFX.Production.Application",
                    "TopicSupportType": "Publisher",
                    "SupportedMessages": []
                  },
                  {
                    "TopicName": "CFX.ResourcePerformance",
                    "TopicSupportType": "Publisher",
                    "SupportedMessages": []
                  }
                ]
              }
            }
            Example of SMT Placement Machine type endpoint:
            {
              "Result": {
                "Result": "Success",
                "ResultCode": 0,
                "Message": null
              },
              "EndpointInformation": {
                "$type": "CFX.Structures.SMTPlacement.SMTPlacementEndpoint, CFX",
                "NominalPlacementCPH": 10000.0,
                "NominalUnitsPerHour": 120.0,
                "SupportedPCBDimensions": {
                  "MinimumLength": 10.0,
                  "MaximumLength": 1000.0,
                  "MinimumWidth": 10.0,
                  "MaximumWidth": 1000.0,
                  "MinimumHeight": 0.0,
                  "MaximumHeight": 50.0,
                  "MinimumWeight": 0.0,
                  "MaximumWeight": 1000.0,
                  "MinimumThickness": 0.5,
                  "MaximumThickness": 10.0
                },
                "Lanes": [
                  {
                    "LaneNumber": null,
                    "LaneName": "LANE1",
                    "SupportedPCBDimensions": null
                  },
                  {
                    "LaneNumber": null,
                    "LaneName": "LANE2",
                    "SupportedPCBDimensions": null
                  }
                ],
                "Heads": [
                  {
                    "SMTHeadType": "Pulsar",
                    "NumberOfNozzleLocations": 6,
                    "PlacementAccuracy": 0.001,
                    "Head": {
                      "HeadId": "HD212343",
                      "HeadSequence": 1,
                      "HeadName": "HEAD1"
                    }
                  },
                  {
                    "SMTHeadType": "Pulsar",
                    "NumberOfNozzleLocations": 6,
                    "PlacementAccuracy": 0.001,
                    "Head": {
                      "HeadId": "HD212344",
                      "HeadSequence": 2,
                      "HeadName": "HEAD2"
                    }
                  }
                ],
                "PlacementConstraints": {
                  "MinumumComponentBodySizeX": 0.0,
                  "MaximumComponentBodySizeX": 0.0,
                  "MinumumComponentBodySizeY": 0.0,
                  "MaximumComponentBodySizeY": 0.0,
                  "MinumumComponentHeight": 0.0,
                  "MaximumComponentHeight": 0.0,
                  "MinimumLeadWidth": 0.0,
                  "MinimumBGAPitch": 0.0,
                  "MinimumSOICPitch": 0.0,
                  "MinimumMountingPressure": 0.0,
                  "MaximumMountingPressure": 0.0
                },
                "CFXHandle": "SMTPlus.Model_21232.SN23123",
                "CFXVersion": "1.0",
                "RequestNetworkUri": "amqp://host33:5688/",
                "RequestTargetAddress": "/queue/SN23123",
                "UniqueIdentifier": "UID564545645645656564",
                "FriendlyName": "SMD Placer 23123",
                "Vendor": "SMT Plus",
                "ModelNumber": "Model_21232",
                "SerialNumber": "SN23123",
                "Stages": [
                  {
                    "$type": "CFX.Structures.SMTPlacement.SMTStageInformation, CFX",
                    "NumberOfFeederStations": 0,
                    "Stage": {
                      "StageSequence": 1,
                      "StageName": "BUFFERSTAGE1",
                      "StageType": "Buffer"
                    }
                  },
                  {
                    "$type": "CFX.Structures.SMTPlacement.SMTStageInformation, CFX",
                    "NumberOfFeederStations": 100,
                    "Stage": {
                      "StageSequence": 2,
                      "StageName": "WORKSTAGE1",
                      "StageType": "Work"
                    }
                  },
                  {
                    "$type": "CFX.Structures.SMTPlacement.SMTStageInformation, CFX",
                    "NumberOfFeederStations": 100,
                    "Stage": {
                      "StageSequence": 3,
                      "StageName": "WORKSTAGE2",
                      "StageType": "Work"
                    }
                  }
                ],
                "NumberOfLanes": 1,
                "HermesInformation": {
                  "Enabled": true,
                  "Version": "1.0"
                },
                "OperatingRequirements": {
                  "MinimumHumidity": 0.0,
                  "MaximumHumidity": 0.8,
                  "MinimumTemperature": -1.0,
                  "MaximumTemperature": 40.0
                },
                "SupportedTopics": [
                  {
                    "TopicName": "CFX.Production",
                    "TopicSupportType": "PublisherConsumer",
                    "SupportedMessages": []
                  },
                  {
                    "TopicName": "CFX.Production.Assembly",
                    "TopicSupportType": "Publisher",
                    "SupportedMessages": []
                  },
                  {
                    "TopicName": "CFX.ResourcePerformance",
                    "TopicSupportType": "Publisher",
                    "SupportedMessages": []
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
   */
  @JsonSetter("Result")
  public void setResult(RequestResult result) {
    this.result = result;
  }

  /**
   * The result of the request
   */
  @JsonGetter("Result")
  public RequestResult getResult() {
    return result;
  }

  /**
   * Dynamic structure that describes the details of this endpoint.
   */
  @JsonSetter("EndpointInformation")
  public void setEndpointInformation(Endpoint endpointInformation) {
    this.endpointInformation = endpointInformation;
  }

  /**
   * Dynamic structure that describes the details of this endpoint.
   */
  @JsonGetter("EndpointInformation")
  public Endpoint getEndpointInformation() {
    return endpointInformation;
  }
}
