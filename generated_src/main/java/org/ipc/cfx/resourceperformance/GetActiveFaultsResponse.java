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

import org.ipc.cfx.structures.RequestResult;
import org.ipc.cfx.structures.Fault;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Response to an external source to modify a generic configuration parameter of a process endpoint.
            
            {
              "Result": {
                "Result": "Success",
                "ResultCode": 0,
                "Message": null
              },
              "ActiveFaults": [
                {
                  "Cause": "MechanicalFailure",
                  "Severity": "Error",
                  "FaultCode": "ERROR 3943480",
                  "FaultOccurrenceId": "85a0286a-622f-4f87-99d5-1f11c95806f3",
                  "Lane": null,
                  "Stage": null,
                  "SideLocation": "Right",
                  "AccessType": "Remote",
                  "Description": "PCB Transport is blocked",
                  "DescriptionTranslations": {
                    "de-DE": "Der Leiterplattentransport ist blockiert"
                  },
                  "OccurredAt": "2018-10-31T15:13:30.9146011-04:00",
                  "DueDateTime": "2018-10-31T18:13:30.9146011-04:00"
                },
                {
                  "Cause": "LoadError",
                  "Severity": "Error",
                  "FaultCode": "ERROR 3943555",
                  "FaultOccurrenceId": "bb1933c4-5c7f-4840-9261-72998d682b2f",
                  "Lane": null,
                  "Stage": null,
                  "SideLocation": "Right",
                  "AccessType": "Local",
                  "Description": "PCB Transport is blocked",
                  "DescriptionTranslations": {
                    "de-DE": "Der Leiterplattentransport ist blockiert"
                  },
                  "OccurredAt": "2018-10-31T15:13:30.9146011-04:00",
                  "DueDateTime": "2018-10-31T18:13:30.9146011-04:00"
                }
              ]
            }
 * original type: CFX.ResourcePerformance.GetActiveFaultsResponse
 */
public class GetActiveFaultsResponse extends CFXMessage {

  private RequestResult result;
  private Fault[] activeFaults;

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
   * 
   */
  @JsonSetter("ActiveFaults")
  public void setActiveFaults(Fault[] activeFaults) {
    this.activeFaults = activeFaults;
  }

  /**
   * 
   */
  @JsonGetter("ActiveFaults")
  public Fault[] getActiveFaults() {
    return activeFaults;
  }
}
