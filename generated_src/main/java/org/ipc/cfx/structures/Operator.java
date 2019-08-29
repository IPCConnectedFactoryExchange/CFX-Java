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
package org.ipc.cfx.structures;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Represents an operator who performs a function
 * original type: CFX.Structures.Operator
 */
public class Operator {

  private String operatorIdentifier;
  private ActorType actorType;
  private String lastName;
  private String firstName;
  private String loginName;

  /**
   * An optional unique identifier for the Operator
   */
  @JsonSetter("OperatorIdentifier")
  public void setOperatorIdentifier(String operatorIdentifier) {
    this.operatorIdentifier = operatorIdentifier;
  }

  /**
   * An optional unique identifier for the Operator
   *
   * @return never null
   */
  @JsonGetter("OperatorIdentifier")
  public String getOperatorIdentifier() {
    return operatorIdentifier == null ? "" : operatorIdentifier;
  }

  /**
   * The nature of the operator
   */
  @JsonSetter("ActorType")
  public void setActorType(ActorType actorType) {
    this.actorType = actorType;
  }

  /**
   * The nature of the operator
   */
  @JsonGetter("ActorType")
  public ActorType getActorType() {
    return actorType;
  }

  /**
   * The Family Name of the Operator
   */
  @JsonSetter("LastName")
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * The Family Name of the Operator
   *
   * @return never null
   */
  @JsonGetter("LastName")
  public String getLastName() {
    return lastName == null ? "" : lastName;
  }

  /**
   * The Given Name of the Operator
   */
  @JsonSetter("FirstName")
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * The Given Name of the Operator
   *
   * @return never null
   */
  @JsonGetter("FirstName")
  public String getFirstName() {
    return firstName == null ? "" : firstName;
  }

  /**
   * The Login Name for this Operator
   */
  @JsonSetter("LoginName")
  public void setLoginName(String loginName) {
    this.loginName = loginName;
  }

  /**
   * The Login Name for this Operator
   *
   * @return never null
   */
  @JsonGetter("LoginName")
  public String getLoginName() {
    return loginName == null ? "" : loginName;
  }
}
