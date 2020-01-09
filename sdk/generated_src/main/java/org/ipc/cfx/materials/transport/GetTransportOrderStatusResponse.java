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
package org.ipc.cfx.materials.transport;

import org.ipc.cfx.structures.RequestResult;
import org.ipc.cfx.structures.TransportOrderStatus;
import org.ipc.cfx.structures.TransportOrderHistory;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * A response to a request to an endpoint (such as an upper level system, MES, ERP, etc.) to check
            the status of a particular transport order.
            
            {
              &quot;Result&quot;: {
                &quot;Result&quot;: &quot;Success&quot;,
                &quot;ResultCode&quot;: 0,
                &quot;Message&quot;: &quot;OK&quot;
              },
              &quot;TransportOrderId&quot;: &quot;TR329483249830000&quot;,
              &quot;FinalDestination&quot;: &quot;LINE 1&quot;,
              &quot;Status&quot;: &quot;Delivered&quot;,
              &quot;History&quot;: [
                {
                  &quot;EventDateTime&quot;: &quot;2017-11-01T11:55:00&quot;,
                  &quot;Status&quot;: &quot;Kitting&quot;,
                  &quot;Operator&quot;: {
                    &quot;OperatorIdentifier&quot;: &quot;BADGE4485&quot;,
                    &quot;ActorType&quot;: &quot;Human&quot;,
                    &quot;LastName&quot;: &quot;Smith&quot;,
                    &quot;FirstName&quot;: &quot;Bill&quot;,
                    &quot;LoginName&quot;: &quot;bill.smith@domain1.com&quot;
                  },
                  &quot;Location&quot;: &quot;STOCK ROOM 1&quot;,
                  &quot;Comments&quot;: null
                },
                {
                  &quot;EventDateTime&quot;: &quot;2017-11-01T14:25:00&quot;,
                  &quot;Status&quot;: &quot;Kitted&quot;,
                  &quot;Operator&quot;: {
                    &quot;OperatorIdentifier&quot;: &quot;BADGE4485&quot;,
                    &quot;ActorType&quot;: &quot;Human&quot;,
                    &quot;LastName&quot;: &quot;Smith&quot;,
                    &quot;FirstName&quot;: &quot;Bill&quot;,
                    &quot;LoginName&quot;: &quot;bill.smith@domain1.com&quot;
                  },
                  &quot;Location&quot;: &quot;STOCK ROOM 1&quot;,
                  &quot;Comments&quot;: null
                },
                {
                  &quot;EventDateTime&quot;: &quot;2017-11-01T15:45:00&quot;,
                  &quot;Status&quot;: &quot;InTransit&quot;,
                  &quot;Operator&quot;: {
                    &quot;OperatorIdentifier&quot;: &quot;BADGE4485&quot;,
                    &quot;ActorType&quot;: &quot;Human&quot;,
                    &quot;LastName&quot;: &quot;Smith&quot;,
                    &quot;FirstName&quot;: &quot;Bill&quot;,
                    &quot;LoginName&quot;: &quot;bill.smith@domain1.com&quot;
                  },
                  &quot;Location&quot;: &quot;STOCK ROOM 1&quot;,
                  &quot;Comments&quot;: null
                },
                {
                  &quot;EventDateTime&quot;: &quot;2017-11-01T16:55:00&quot;,
                  &quot;Status&quot;: &quot;InTransit&quot;,
                  &quot;Operator&quot;: {
                    &quot;OperatorIdentifier&quot;: &quot;BADGE4486&quot;,
                    &quot;ActorType&quot;: &quot;Human&quot;,
                    &quot;LastName&quot;: &quot;Doe&quot;,
                    &quot;FirstName&quot;: &quot;John&quot;,
                    &quot;LoginName&quot;: &quot;john.doe@domain1.com&quot;
                  },
                  &quot;Location&quot;: &quot;SMT STAGING AREA 1&quot;,
                  &quot;Comments&quot;: null
                },
                {
                  &quot;EventDateTime&quot;: &quot;2017-11-01T17:22:00&quot;,
                  &quot;Status&quot;: &quot;Delivered&quot;,
                  &quot;Operator&quot;: {
                    &quot;OperatorIdentifier&quot;: &quot;BADGE4487&quot;,
                    &quot;ActorType&quot;: &quot;Human&quot;,
                    &quot;LastName&quot;: &quot;Dolittle&quot;,
                    &quot;FirstName&quot;: &quot;Mike&quot;,
                    &quot;LoginName&quot;: &quot;mike.dolittle@domain1.com&quot;
                  },
                  &quot;Location&quot;: &quot;LINE1&quot;,
                  &quot;Comments&quot;: null
                }
              ]
            }
 * original type: CFX.Materials.Transport.GetTransportOrderStatusResponse
 */
public class GetTransportOrderStatusResponse extends CFXMessage {

  private RequestResult result;
  private String transportOrderId;
  private String finalDestination;
  private TransportOrderStatus status;
  private TransportOrderHistory[] history;

  /**
   * The result of the request
   * @param result the value
   */
  @JsonSetter("Result")
  public GetTransportOrderStatusResponse setResult(RequestResult result) {
    this.result = result;
    return this;
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
   * The order number of the related transport order
   * @param transportOrderId the value
   */
  @JsonSetter("TransportOrderId")
  public GetTransportOrderStatusResponse setTransportOrderId(String transportOrderId) {
    this.transportOrderId = transportOrderId;
    return this;
  }

  /**
   * The order number of the related transport order
   *
   * @return never null
   */
  @JsonGetter("TransportOrderId")
  public String getTransportOrderId() {
    return transportOrderId == null ? "" : transportOrderId;
  }

  /**
   * The final destination of this transport order
   * @param finalDestination the value
   */
  @JsonSetter("FinalDestination")
  public GetTransportOrderStatusResponse setFinalDestination(String finalDestination) {
    this.finalDestination = finalDestination;
    return this;
  }

  /**
   * The final destination of this transport order
   *
   * @return never null
   */
  @JsonGetter("FinalDestination")
  public String getFinalDestination() {
    return finalDestination == null ? "" : finalDestination;
  }

  /**
   * The current status of this transport order
   * @param status the value
   */
  @JsonSetter("Status")
  public GetTransportOrderStatusResponse setStatus(TransportOrderStatus status) {
    this.status = status;
    return this;
  }

  /**
   * The current status of this transport order
   * @return Status
   */
  @JsonGetter("Status")
  public TransportOrderStatus getStatus() {
    return status;
  }

  /**
   * The history of this transport order
   * @param history the value
   */
  @JsonSetter("History")
  public GetTransportOrderStatusResponse setHistory(TransportOrderHistory[] history) {
    this.history = history;
    return this;
  }

  /**
   * The history of this transport order
   * @return History
   */
  @JsonGetter("History")
  public TransportOrderHistory[] getHistory() {
    return history;
  }
}
