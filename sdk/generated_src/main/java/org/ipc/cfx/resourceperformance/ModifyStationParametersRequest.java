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
package org.ipc.cfx.resourceperformance;

import org.ipc.cfx.structures.Parameter;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This request allows an external source to modify a generic configuration parameter of a process endpoint.
            Upon successful processing of this request, the endpoint should publish a  message in addition to the 
             message that it sends back to the requester.
            
            {
              &quot;NewParameters&quot;: [
                {
                  &quot;$type&quot;: &quot;CFX.Structures.GenericParameter, CFX&quot;,
                  &quot;Name&quot;: &quot;Torque1&quot;,
                  &quot;Value&quot;: &quot;35.6&quot;
                }
              ]
            }
 * original type: CFX.ResourcePerformance.ModifyStationParametersRequest
 */
public class ModifyStationParametersRequest extends CFXMessage {

  private Parameter[] newParameters;

  /**
   * A list of the paramters to be modified.  The Parameter structure is a dynamic structure, 
            and may be of differing types depending on the type of endpoint.
   * @param newParameters the value
   */
  @JsonSetter("NewParameters")
  public ModifyStationParametersRequest setNewParameters(Parameter[] newParameters) {
    this.newParameters = newParameters;
    return this;
  }

  /**
   * A list of the paramters to be modified.  The Parameter structure is a dynamic structure, 
            and may be of differing types depending on the type of endpoint.
   * @return NewParameters
   */
  @JsonGetter("NewParameters")
  public Parameter[] getNewParameters() {
    return newParameters;
  }
}
