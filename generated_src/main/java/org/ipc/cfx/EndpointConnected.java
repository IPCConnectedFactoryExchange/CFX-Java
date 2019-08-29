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

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent when an Endpoint joins a CFX network after it has been established. 
            Provides the same information as the response to the AreYouThereRequest 
            message. Need not be used for short-term machine to machine connection, 
            where for example only a simple request / response message is being exchanged.
            
            {
              "CFXHandle": "SMTPlus.Model_21232.SN23123",
              "RequestNetworkUri": "amqp://host33/",
              "RequestTargetAddress": "/queue/SN23123"
            }
 * original type: CFX.EndpointConnected
 */
public class EndpointConnected extends CFXMessage {

  private String cFXHandle;
  private String requestNetworkUri;
  private String requestTargetAddress;

  /**
   * The handle of the endpoint that is responding
   */
  @JsonSetter("CFXHandle")
  public void setCFXHandle(String cFXHandle) {
    this.cFXHandle = cFXHandle;
  }

  /**
   * The handle of the endpoint that is responding
   *
   * @return never null
   */
  @JsonGetter("CFXHandle")
  public String getCFXHandle() {
    return cFXHandle == null ? "" : cFXHandle;
  }

  /**
   * The network address / Uri to be used for requests to this endpoint
   */
  @JsonSetter("RequestNetworkUri")
  public void setRequestNetworkUri(String requestNetworkUri) {
    this.requestNetworkUri = requestNetworkUri;
  }

  /**
   * The network address / Uri to be used for requests to this endpoint
   *
   * @return never null
   */
  @JsonGetter("RequestNetworkUri")
  public String getRequestNetworkUri() {
    return requestNetworkUri == null ? "" : requestNetworkUri;
  }

  /**
   * The AMQP 1.0 target address to be used for requests to this endpoint
   */
  @JsonSetter("RequestTargetAddress")
  public void setRequestTargetAddress(String requestTargetAddress) {
    this.requestTargetAddress = requestTargetAddress;
  }

  /**
   * The AMQP 1.0 target address to be used for requests to this endpoint
   *
   * @return never null
   */
  @JsonGetter("RequestTargetAddress")
  public String getRequestTargetAddress() {
    return requestTargetAddress == null ? "" : requestTargetAddress;
  }
}
