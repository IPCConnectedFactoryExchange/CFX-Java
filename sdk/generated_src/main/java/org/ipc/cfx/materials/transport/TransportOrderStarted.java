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
package org.ipc.cfx.materials.transport;

import org.ipc.cfx.structures.Operator;
import org.ipc.cfx.structures.TransportOrderStatus;
import org.ipc.cfx.structures.MaterialPackage;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent when a new transport order is initiated.  A transport order is a directive to move
            materials / WIP / production units from one location to another.
            
            {
              &quot;TransportOrderId&quot;: &quot;TR329483249830000&quot;,
              &quot;StartedBy&quot;: {
                &quot;OperatorIdentifier&quot;: &quot;BADGE4485&quot;,
                &quot;ActorType&quot;: &quot;Human&quot;,
                &quot;LastName&quot;: &quot;Smith&quot;,
                &quot;FirstName&quot;: &quot;Bill&quot;,
                &quot;LoginName&quot;: &quot;bill.smith@domain1.com&quot;
              },
              &quot;Comments&quot;: &quot;Initiating new transport order.  Waiting to be kitted.&quot;,
              &quot;Status&quot;: &quot;Pending&quot;,
              &quot;RelatedWorkOrderId&quot;: &quot;WO2384702937403280032&quot;,
              &quot;Source&quot;: null,
              &quot;FinalDestination&quot;: &quot;LINE1&quot;,
              &quot;NextCheckpoint&quot;: &quot;SMT STAGING AREA 1&quot;,
              &quot;Materials&quot;: []
            }
 * original type: CFX.Materials.Transport.TransportOrderStarted
 */
public class TransportOrderStarted extends CFXMessage {

  private String transportOrderId;
  private Operator startedBy;
  private String comments;
  private TransportOrderStatus status;
  private String relatedWorkOrderId;
  private String source;
  private String finalDestination;
  private String nextCheckpoint;
  private MaterialPackage[] materials;

  /**
   * The order number of the new transport order
   * @param transportOrderId the value
   */
  @JsonSetter("TransportOrderId")
  public void setTransportOrderId(String transportOrderId) {
    this.transportOrderId = transportOrderId;
  }

  /**
   * The order number of the new transport order
   *
   * @return never null
   */
  @JsonGetter("TransportOrderId")
  public String getTransportOrderId() {
    return transportOrderId == null ? "" : transportOrderId;
  }

  /**
   * The operator who initiated the new transport order (optional, where applicable)
   * @param startedBy the value
   */
  @JsonSetter("StartedBy")
  public void setStartedBy(Operator startedBy) {
    this.startedBy = startedBy;
  }

  /**
   * The operator who initiated the new transport order (optional, where applicable)
   * @return StartedBy
   */
  @JsonGetter("StartedBy")
  public Operator getStartedBy() {
    return startedBy;
  }

  /**
   * Human readable comments related to this event
   * @param comments the value
   */
  @JsonSetter("Comments")
  public void setComments(String comments) {
    this.comments = comments;
  }

  /**
   * Human readable comments related to this event
   *
   * @return never null
   */
  @JsonGetter("Comments")
  public String getComments() {
    return comments == null ? "" : comments;
  }

  /**
   * The status of this transport order at the time of the event
   * @param status the value
   */
  @JsonSetter("Status")
  public void setStatus(TransportOrderStatus status) {
    this.status = status;
  }

  /**
   * The status of this transport order at the time of the event
   * @return Status
   */
  @JsonGetter("Status")
  public TransportOrderStatus getStatus() {
    return status;
  }

  /**
   * The related production work order number (where applicable)
   * @param relatedWorkOrderId the value
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
   * The point of origination for this this transport order.  Often
            will be a stock area, room, etc., but may be any location within
            the factory environment
   * @param source the value
   */
  @JsonSetter("Source")
  public void setSource(String source) {
    this.source = source;
  }

  /**
   * The point of origination for this this transport order.  Often
            will be a stock area, room, etc., but may be any location within
            the factory environment
   *
   * @return never null
   */
  @JsonGetter("Source")
  public String getSource() {
    return source == null ? "" : source;
  }

  /**
   * The final destination for this transport order
   * @param finalDestination the value
   */
  @JsonSetter("FinalDestination")
  public void setFinalDestination(String finalDestination) {
    this.finalDestination = finalDestination;
  }

  /**
   * The final destination for this transport order
   *
   * @return never null
   */
  @JsonGetter("FinalDestination")
  public String getFinalDestination() {
    return finalDestination == null ? "" : finalDestination;
  }

  /**
   * The next anticipated check point (way point) for this transport order
   * @param nextCheckpoint the value
   */
  @JsonSetter("NextCheckpoint")
  public void setNextCheckpoint(String nextCheckpoint) {
    this.nextCheckpoint = nextCheckpoint;
  }

  /**
   * The next anticipated check point (way point) for this transport order
   *
   * @return never null
   */
  @JsonGetter("NextCheckpoint")
  public String getNextCheckpoint() {
    return nextCheckpoint == null ? "" : nextCheckpoint;
  }

  /**
   * A list of the specific materials, WIP, and / or production units that are to be 
            transported for this transport order.
   * @param materials the value
   */
  @JsonSetter("Materials")
  public void setMaterials(MaterialPackage[] materials) {
    this.materials = materials;
  }

  /**
   * A list of the specific materials, WIP, and / or production units that are to be 
            transported for this transport order.
   * @return Materials
   */
  @JsonGetter("Materials")
  public MaterialPackage[] getMaterials() {
    return materials;
  }
}