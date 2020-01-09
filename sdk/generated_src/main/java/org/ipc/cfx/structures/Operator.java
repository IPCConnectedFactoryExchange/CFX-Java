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
   * @param operatorIdentifier the value
   */
  @JsonSetter("OperatorIdentifier")
  public Operator setOperatorIdentifier(String operatorIdentifier) {
    this.operatorIdentifier = operatorIdentifier;
    return this;
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
   * @param actorType the value
   */
  @JsonSetter("ActorType")
  public Operator setActorType(ActorType actorType) {
    this.actorType = actorType;
    return this;
  }

  /**
   * The nature of the operator
   * @return ActorType
   */
  @JsonGetter("ActorType")
  public ActorType getActorType() {
    return actorType;
  }

  /**
   * The Family Name of the Operator
   * @param lastName the value
   */
  @JsonSetter("LastName")
  public Operator setLastName(String lastName) {
    this.lastName = lastName;
    return this;
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
   * @param firstName the value
   */
  @JsonSetter("FirstName")
  public Operator setFirstName(String firstName) {
    this.firstName = firstName;
    return this;
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
   * @param loginName the value
   */
  @JsonSetter("LoginName")
  public Operator setLoginName(String loginName) {
    this.loginName = loginName;
    return this;
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
