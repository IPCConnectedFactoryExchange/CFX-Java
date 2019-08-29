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
              "Result": {
                "Result": "Success",
                "ResultCode": 0,
                "Message": "OK"
              },
              "TransportOrderId": "TR329483249830000",
              "FinalDestination": "LINE 1",
              "Status": "Delivered",
              "History": [
                {
                  "EventDateTime": "2017-11-01T11:55:00",
                  "Status": "Kitting",
                  "Operator": {
                    "OperatorIdentifier": "BADGE4485",
                    "ActorType": "Human",
                    "LastName": "Smith",
                    "FirstName": "Bill",
                    "LoginName": "bill.smith@domain1.com"
                  },
                  "Location": "STOCK ROOM 1",
                  "Comments": null
                },
                {
                  "EventDateTime": "2017-11-01T14:25:00",
                  "Status": "Kitted",
                  "Operator": {
                    "OperatorIdentifier": "BADGE4485",
                    "ActorType": "Human",
                    "LastName": "Smith",
                    "FirstName": "Bill",
                    "LoginName": "bill.smith@domain1.com"
                  },
                  "Location": "STOCK ROOM 1",
                  "Comments": null
                },
                {
                  "EventDateTime": "2017-11-01T15:45:00",
                  "Status": "InTransit",
                  "Operator": {
                    "OperatorIdentifier": "BADGE4485",
                    "ActorType": "Human",
                    "LastName": "Smith",
                    "FirstName": "Bill",
                    "LoginName": "bill.smith@domain1.com"
                  },
                  "Location": "STOCK ROOM 1",
                  "Comments": null
                },
                {
                  "EventDateTime": "2017-11-01T16:55:00",
                  "Status": "InTransit",
                  "Operator": {
                    "OperatorIdentifier": "BADGE4486",
                    "ActorType": "Human",
                    "LastName": "Doe",
                    "FirstName": "John",
                    "LoginName": "john.doe@domain1.com"
                  },
                  "Location": "SMT STAGING AREA 1",
                  "Comments": null
                },
                {
                  "EventDateTime": "2017-11-01T17:22:00",
                  "Status": "Delivered",
                  "Operator": {
                    "OperatorIdentifier": "BADGE4487",
                    "ActorType": "Human",
                    "LastName": "Dolittle",
                    "FirstName": "Mike",
                    "LoginName": "mike.dolittle@domain1.com"
                  },
                  "Location": "LINE1",
                  "Comments": null
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
   * The order number of the related transport order
   */
  @JsonSetter("TransportOrderId")
  public void setTransportOrderId(String transportOrderId) {
    this.transportOrderId = transportOrderId;
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
   */
  @JsonSetter("FinalDestination")
  public void setFinalDestination(String finalDestination) {
    this.finalDestination = finalDestination;
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
   */
  @JsonSetter("Status")
  public void setStatus(TransportOrderStatus status) {
    this.status = status;
  }

  /**
   * The current status of this transport order
   */
  @JsonGetter("Status")
  public TransportOrderStatus getStatus() {
    return status;
  }

  /**
   * The history of this transport order
   */
  @JsonSetter("History")
  public void setHistory(TransportOrderHistory[] history) {
    this.history = history;
  }

  /**
   * The history of this transport order
   */
  @JsonGetter("History")
  public TransportOrderHistory[] getHistory() {
    return history;
  }
}
