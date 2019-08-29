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
 * created: 20.08.2019 15:52:36 by frankp
 */
package org.ipc.cfx.structures;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Describes a single event in the history of a transport order.  
            A transport order is a directive to move materials / WIP / production
            units from one location to another.
 * original type: CFX.Structures.TransportOrderHistory
 */
public class TransportOrderHistory {

  private Date eventDateTime;
  private TransportOrderStatus status;
  private Operator operator;
  private String location;
  private String comments;

  /**
   * 
   */
  @JsonSetter("EventDateTime")
  public void setEventDateTime(Date eventDateTime) {
    this.eventDateTime = eventDateTime;
  }

  /**
   * 
   */
  @JsonGetter("EventDateTime")
  public Date getEventDateTime() {
    return eventDateTime;
  }

  /**
   * The status of this transport order at the time of the event
   */
  @JsonSetter("Status")
  public void setStatus(TransportOrderStatus status) {
    this.status = status;
  }

  /**
   * The status of this transport order at the time of the event
   */
  @JsonGetter("Status")
  public TransportOrderStatus getStatus() {
    return status;
  }

  /**
   * The operator involved in this event (optional, where applicable)
   */
  @JsonSetter("Operator")
  public void setOperator(Operator operator) {
    this.operator = operator;
  }

  /**
   * The operator involved in this event (optional, where applicable)
   */
  @JsonGetter("Operator")
  public Operator getOperator() {
    return operator;
  }

  /**
   * The location where this event took place
   */
  @JsonSetter("Location")
  public void setLocation(String location) {
    this.location = location;
  }

  /**
   * The location where this event took place
   *
   * @return never null
   */
  @JsonGetter("Location")
  public String getLocation() {
    return location == null ? "" : location;
  }

  /**
   * Human readable comments related to this event (where applicable)
   */
  @JsonSetter("Comments")
  public void setComments(String comments) {
    this.comments = comments;
  }

  /**
   * Human readable comments related to this event (where applicable)
   *
   * @return never null
   */
  @JsonGetter("Comments")
  public String getComments() {
    return comments == null ? "" : comments;
  }
}
