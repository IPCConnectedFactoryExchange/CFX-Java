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
 * created: 22.11.2019 10:40:12 by frankp
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
              &quot;CFXHandle&quot;: &quot;SMTPlus.Model_21232.SN23123&quot;,
              &quot;RequestNetworkUri&quot;: &quot;amqp://host33/&quot;,
              &quot;RequestTargetAddress&quot;: &quot;/queue/SN23123&quot;
            }
 * original type: CFX.EndpointConnected
 */
public class EndpointConnected extends CFXMessage {

  private String cFXHandle;
  private String requestNetworkUri;
  private String requestTargetAddress;

  /**
   * The handle of the endpoint that is responding
   * @param cFXHandle the value
   */
  @JsonSetter("CFXHandle")
  public EndpointConnected setCFXHandle(String cFXHandle) {
    this.cFXHandle = cFXHandle;
    return this;
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
   * @param requestNetworkUri the value
   */
  @JsonSetter("RequestNetworkUri")
  public EndpointConnected setRequestNetworkUri(String requestNetworkUri) {
    this.requestNetworkUri = requestNetworkUri;
    return this;
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
   * @param requestTargetAddress the value
   */
  @JsonSetter("RequestTargetAddress")
  public EndpointConnected setRequestTargetAddress(String requestTargetAddress) {
    this.requestTargetAddress = requestTargetAddress;
    return this;
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
