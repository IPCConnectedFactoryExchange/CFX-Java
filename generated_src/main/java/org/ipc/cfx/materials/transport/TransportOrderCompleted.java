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

import org.ipc.cfx.structures.Operator;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent when a transport order has arrived at its final destination.
            
            {
              "TransportOrderId": "TR329483249830000",
              "Comments": "Received at Line 1",
              "AcceptedBy": {
                "OperatorIdentifier": "BADGE4487",
                "ActorType": "Human",
                "LastName": "Dolittle",
                "FirstName": "Mike",
                "LoginName": "mike.dolittle@domain1.com"
              },
              "RelatedWorkOrderId": "WO2384702937403280032",
              "FinalDestination": "LINE 1"
            }
 * original type: CFX.Materials.Transport.TransportOrderCompleted
 */
public class TransportOrderCompleted extends CFXMessage {

  private String transportOrderId;
  private String comments;
  private Operator acceptedBy;
  private String relatedWorkOrderId;
  private String finalDestination;

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
   * Human readable comments related to this arrival event (when applicable)
   */
  @JsonSetter("Comments")
  public void setComments(String comments) {
    this.comments = comments;
  }

  /**
   * Human readable comments related to this arrival event (when applicable)
   *
   * @return never null
   */
  @JsonGetter("Comments")
  public String getComments() {
    return comments == null ? "" : comments;
  }

  /**
   * The operator who accepted the delivery, and recorded the arrival (optional)
   */
  @JsonSetter("AcceptedBy")
  public void setAcceptedBy(Operator acceptedBy) {
    this.acceptedBy = acceptedBy;
  }

  /**
   * The operator who accepted the delivery, and recorded the arrival (optional)
   */
  @JsonGetter("AcceptedBy")
  public Operator getAcceptedBy() {
    return acceptedBy;
  }

  /**
   * The related production work order number (where applicable)
   */
  @JsonSetter("RelatedWorkOrderId")
  public void setRelatedWorkOrderId(String relatedWorkOrderId) {
    this.relatedWorkOrderId = relatedWorkOrderId;
  }

  /**
   * The related production work order number (where applicable)
   *
   * @return never null
   */
  @JsonGetter("RelatedWorkOrderId")
  public String getRelatedWorkOrderId() {
    return relatedWorkOrderId == null ? "" : relatedWorkOrderId;
  }

  /**
   * The final destination where the transport order was delivered)
   */
  @JsonSetter("FinalDestination")
  public void setFinalDestination(String finalDestination) {
    this.finalDestination = finalDestination;
  }

  /**
   * The final destination where the transport order was delivered)
   *
   * @return never null
   */
  @JsonGetter("FinalDestination")
  public String getFinalDestination() {
    return finalDestination == null ? "" : finalDestination;
  }
}
