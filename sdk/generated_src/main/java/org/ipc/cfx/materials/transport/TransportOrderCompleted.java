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

import org.ipc.cfx.structures.Operator;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent when a transport order has arrived at its final destination.
            
            {
              &quot;TransportOrderId&quot;: &quot;TR329483249830000&quot;,
              &quot;Comments&quot;: &quot;Received at Line 1&quot;,
              &quot;AcceptedBy&quot;: {
                &quot;OperatorIdentifier&quot;: &quot;BADGE4487&quot;,
                &quot;ActorType&quot;: &quot;Human&quot;,
                &quot;LastName&quot;: &quot;Dolittle&quot;,
                &quot;FirstName&quot;: &quot;Mike&quot;,
                &quot;LoginName&quot;: &quot;mike.dolittle@domain1.com&quot;
              },
              &quot;RelatedWorkOrderId&quot;: &quot;WO2384702937403280032&quot;,
              &quot;FinalDestination&quot;: &quot;LINE 1&quot;
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
   * @param transportOrderId the value
   */
  @JsonSetter("TransportOrderId")
  public TransportOrderCompleted setTransportOrderId(String transportOrderId) {
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
   * Human readable comments related to this arrival event (when applicable)
   * @param comments the value
   */
  @JsonSetter("Comments")
  public TransportOrderCompleted setComments(String comments) {
    this.comments = comments;
    return this;
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
   * @param acceptedBy the value
   */
  @JsonSetter("AcceptedBy")
  public TransportOrderCompleted setAcceptedBy(Operator acceptedBy) {
    this.acceptedBy = acceptedBy;
    return this;
  }

  /**
   * The operator who accepted the delivery, and recorded the arrival (optional)
   * @return AcceptedBy
   */
  @JsonGetter("AcceptedBy")
  public Operator getAcceptedBy() {
    return acceptedBy;
  }

  /**
   * The related production work order number (where applicable)
   * @param relatedWorkOrderId the value
   */
  @JsonSetter("RelatedWorkOrderId")
  public TransportOrderCompleted setRelatedWorkOrderId(String relatedWorkOrderId) {
    this.relatedWorkOrderId = relatedWorkOrderId;
    return this;
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
   * @param finalDestination the value
   */
  @JsonSetter("FinalDestination")
  public TransportOrderCompleted setFinalDestination(String finalDestination) {
    this.finalDestination = finalDestination;
    return this;
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
