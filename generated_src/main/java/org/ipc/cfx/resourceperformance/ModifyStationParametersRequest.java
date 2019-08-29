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
 * This request allows an external source to modify a generic configuration parameter of a process endpoint.
            Upon successful processing of this request, the endpoint should publish a  message in addition to the 
             message that it sends back to the requester.
            
            {
              "NewParameters": [
                {
                  "$type": "CFX.Structures.GenericParameter, CFX",
                  "Name": "Torque1",
                  "Value": "35.6"
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
   */
  @JsonSetter("NewParameters")
  public void setNewParameters(Parameter[] newParameters) {
    this.newParameters = newParameters;
  }

  /**
   * A list of the paramters to be modified.  The Parameter structure is a dynamic structure, 
            and may be of differing types depending on the type of endpoint.
   */
  @JsonGetter("NewParameters")
  public Parameter[] getNewParameters() {
    return newParameters;
  }
}
