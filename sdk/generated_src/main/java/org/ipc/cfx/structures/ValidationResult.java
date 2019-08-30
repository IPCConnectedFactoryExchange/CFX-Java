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
package org.ipc.cfx.structures;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * 
 * original type: CFX.Structures.ValidationResult
 */
public class ValidationResult {

  private String uniqueIdentifier;
  private int positionNumber;
  private ValidationStatus result;
  private int failureCode;
  private String message;

  /**
   * 
   * @param uniqueIdentifier the value
   */
  @JsonSetter("UniqueIdentifier")
  public void setUniqueIdentifier(String uniqueIdentifier) {
    this.uniqueIdentifier = uniqueIdentifier;
  }

  /**
   * 
   *
   * @return never null
   */
  @JsonGetter("UniqueIdentifier")
  public String getUniqueIdentifier() {
    return uniqueIdentifier == null ? "" : uniqueIdentifier;
  }

  /**
   * 
   * @param positionNumber the value
   */
  @JsonSetter("PositionNumber")
  public void setPositionNumber(int positionNumber) {
    this.positionNumber = positionNumber;
  }

  /**
   * 
   * @return PositionNumber
   */
  @JsonGetter("PositionNumber")
  public int getPositionNumber() {
    return positionNumber;
  }

  /**
   * 
   * @param result the value
   */
  @JsonSetter("Result")
  public void setResult(ValidationStatus result) {
    this.result = result;
  }

  /**
   * 
   * @return Result
   */
  @JsonGetter("Result")
  public ValidationStatus getResult() {
    return result;
  }

  /**
   * 
   * @param failureCode the value
   */
  @JsonSetter("FailureCode")
  public void setFailureCode(int failureCode) {
    this.failureCode = failureCode;
  }

  /**
   * 
   * @return FailureCode
   */
  @JsonGetter("FailureCode")
  public int getFailureCode() {
    return failureCode;
  }

  /**
   * 
   * @param message the value
   */
  @JsonSetter("Message")
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * 
   *
   * @return never null
   */
  @JsonGetter("Message")
  public String getMessage() {
    return message == null ? "" : message;
  }
}
