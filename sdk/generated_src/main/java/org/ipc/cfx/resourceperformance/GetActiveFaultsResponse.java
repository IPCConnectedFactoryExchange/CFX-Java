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

import org.ipc.cfx.structures.RequestResult;
import org.ipc.cfx.structures.Fault;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Response to an external source to modify a generic configuration parameter of a process endpoint.
            
            {
              &quot;Result&quot;: {
                &quot;Result&quot;: &quot;Success&quot;,
                &quot;ResultCode&quot;: 0,
                &quot;Message&quot;: null
              },
              &quot;ActiveFaults&quot;: [
                {
                  &quot;Cause&quot;: &quot;MechanicalFailure&quot;,
                  &quot;Severity&quot;: &quot;Error&quot;,
                  &quot;FaultCode&quot;: &quot;ERROR 3943480&quot;,
                  &quot;FaultOccurrenceId&quot;: &quot;85a0286a-622f-4f87-99d5-1f11c95806f3&quot;,
                  &quot;Lane&quot;: null,
                  &quot;Stage&quot;: null,
                  &quot;SideLocation&quot;: &quot;Right&quot;,
                  &quot;AccessType&quot;: &quot;Remote&quot;,
                  &quot;Description&quot;: &quot;PCB Transport is blocked&quot;,
                  &quot;DescriptionTranslations&quot;: {
                    &quot;de-DE&quot;: &quot;Der Leiterplattentransport ist blockiert&quot;
                  },
                  &quot;OccurredAt&quot;: &quot;2018-10-31T15:13:30.9146011-04:00&quot;,
                  &quot;DueDateTime&quot;: &quot;2018-10-31T18:13:30.9146011-04:00&quot;
                },
                {
                  &quot;Cause&quot;: &quot;LoadError&quot;,
                  &quot;Severity&quot;: &quot;Error&quot;,
                  &quot;FaultCode&quot;: &quot;ERROR 3943555&quot;,
                  &quot;FaultOccurrenceId&quot;: &quot;bb1933c4-5c7f-4840-9261-72998d682b2f&quot;,
                  &quot;Lane&quot;: null,
                  &quot;Stage&quot;: null,
                  &quot;SideLocation&quot;: &quot;Right&quot;,
                  &quot;AccessType&quot;: &quot;Local&quot;,
                  &quot;Description&quot;: &quot;PCB Transport is blocked&quot;,
                  &quot;DescriptionTranslations&quot;: {
                    &quot;de-DE&quot;: &quot;Der Leiterplattentransport ist blockiert&quot;
                  },
                  &quot;OccurredAt&quot;: &quot;2018-10-31T15:13:30.9146011-04:00&quot;,
                  &quot;DueDateTime&quot;: &quot;2018-10-31T18:13:30.9146011-04:00&quot;
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
   * 
   * @param activeFaults the value
   */
  @JsonSetter("ActiveFaults")
  public void setActiveFaults(Fault[] activeFaults) {
    this.activeFaults = activeFaults;
  }

  /**
   * 
   * @return ActiveFaults
   */
  @JsonGetter("ActiveFaults")
  public Fault[] getActiveFaults() {
    return activeFaults;
  }
}
