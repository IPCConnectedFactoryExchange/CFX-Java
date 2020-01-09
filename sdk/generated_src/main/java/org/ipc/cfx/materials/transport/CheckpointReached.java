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

import org.ipc.cfx.structures.TransportOrderStatus;
import org.ipc.cfx.structures.Operator;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent when a group of materials or production units that is being transported
            through the factory environment arrives at a way point along its path source
            to destination.
            
            {
              &quot;TransportOrderId&quot;: &quot;TR329483249830000&quot;,
              &quot;Comments&quot;: &quot;Arrived SMT Production Area&quot;,
              &quot;Status&quot;: &quot;InTransit&quot;,
              &quot;TrackedBy&quot;: {
                &quot;OperatorIdentifier&quot;: &quot;BADGE4486&quot;,
                &quot;ActorType&quot;: &quot;Human&quot;,
                &quot;LastName&quot;: &quot;Doe&quot;,
                &quot;FirstName&quot;: &quot;John&quot;,
                &quot;LoginName&quot;: &quot;john.doe@domain1.com&quot;
              },
              &quot;RelatedWorkOrderId&quot;: &quot;WO2384702937403280032&quot;,
              &quot;Checkpoint&quot;: &quot;SMT STAGING AREA 1&quot;,
              &quot;FinalDestination&quot;: &quot;LINE 1&quot;,
              &quot;NextCheckpoint&quot;: &quot;LINE 1&quot;
            }
 * original type: CFX.Materials.Transport.CheckpointReached
 */
public class CheckpointReached extends CFXMessage {

  private String transportOrderId;
  private String comments;
  private TransportOrderStatus status;
  private Operator trackedBy;
  private String relatedWorkOrderId;
  private String checkpoint;
  private String finalDestination;
  private String nextCheckpoint;

  /**
   * The number of the related transport order
   * @param transportOrderId the value
   */
  @JsonSetter("TransportOrderId")
  public CheckpointReached setTransportOrderId(String transportOrderId) {
    this.transportOrderId = transportOrderId;
    return this;
  }

  /**
   * The number of the related transport order
   *
   * @return never null
   */
  @JsonGetter("TransportOrderId")
  public String getTransportOrderId() {
    return transportOrderId == null ? "" : transportOrderId;
  }

  /**
   * Human readable comments related to this arrival (where applicable)
   * @param comments the value
   */
  @JsonSetter("Comments")
  public CheckpointReached setComments(String comments) {
    this.comments = comments;
    return this;
  }

  /**
   * Human readable comments related to this arrival (where applicable)
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
  public CheckpointReached setStatus(TransportOrderStatus status) {
    this.status = status;
    return this;
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
   * The operator who recorded the arrival (optional, where applicable)
   * @param trackedBy the value
   */
  @JsonSetter("TrackedBy")
  public CheckpointReached setTrackedBy(Operator trackedBy) {
    this.trackedBy = trackedBy;
    return this;
  }

  /**
   * The operator who recorded the arrival (optional, where applicable)
   * @return TrackedBy
   */
  @JsonGetter("TrackedBy")
  public Operator getTrackedBy() {
    return trackedBy;
  }

  /**
   * The related production work order number (optional, where applicable)
   * @param relatedWorkOrderId the value
   */
  @JsonSetter("RelatedWorkOrderId")
  public CheckpointReached setRelatedWorkOrderId(String relatedWorkOrderId) {
    this.relatedWorkOrderId = relatedWorkOrderId;
    return this;
  }

  /**
   * The related production work order number (optional, where applicable)
   *
   * @return never null
   */
  @JsonGetter("RelatedWorkOrderId")
  public String getRelatedWorkOrderId() {
    return relatedWorkOrderId == null ? "" : relatedWorkOrderId;
  }

  /**
   * The name of the check point that was reached
   * @param checkpoint the value
   */
  @JsonSetter("Checkpoint")
  public CheckpointReached setCheckpoint(String checkpoint) {
    this.checkpoint = checkpoint;
    return this;
  }

  /**
   * The name of the check point that was reached
   *
   * @return never null
   */
  @JsonGetter("Checkpoint")
  public String getCheckpoint() {
    return checkpoint == null ? "" : checkpoint;
  }

  /**
   * The name of the final destination of this transport order
   * @param finalDestination the value
   */
  @JsonSetter("FinalDestination")
  public CheckpointReached setFinalDestination(String finalDestination) {
    this.finalDestination = finalDestination;
    return this;
  }

  /**
   * The name of the final destination of this transport order
   *
   * @return never null
   */
  @JsonGetter("FinalDestination")
  public String getFinalDestination() {
    return finalDestination == null ? "" : finalDestination;
  }

  /**
   * The name of the next anticipated check point along the transport
            order&apos;s path from source to final destination
   * @param nextCheckpoint the value
   */
  @JsonSetter("NextCheckpoint")
  public CheckpointReached setNextCheckpoint(String nextCheckpoint) {
    this.nextCheckpoint = nextCheckpoint;
    return this;
  }

  /**
   * The name of the next anticipated check point along the transport
            order&apos;s path from source to final destination
   *
   * @return never null
   */
  @JsonGetter("NextCheckpoint")
  public String getNextCheckpoint() {
    return nextCheckpoint == null ? "" : nextCheckpoint;
  }
}
