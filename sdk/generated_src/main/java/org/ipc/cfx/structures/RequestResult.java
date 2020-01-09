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
 * A structure which indicates whether or not a CFX request to an endpoint was successful.
            If not successful, information about the nature of the failure is provided.
 * original type: CFX.Structures.RequestResult
 */
public class RequestResult {

  private StatusResult result;
  private int resultCode;
  private String message;

  /**
   * An enumeration indication whether or not the request was successfully executed
   * @param result the value
   */
  @JsonSetter("Result")
  public RequestResult setResult(StatusResult result) {
    this.result = result;
    return this;
  }

  /**
   * An enumeration indication whether or not the request was successfully executed
   * @return Result
   */
  @JsonGetter("Result")
  public StatusResult getResult() {
    return result;
  }

  /**
   * In the case of a failure, an integer-based, endpoint-specific error code
            indicating the nature of the failure
   * @param resultCode the value
   */
  @JsonSetter("ResultCode")
  public RequestResult setResultCode(int resultCode) {
    this.resultCode = resultCode;
    return this;
  }

  /**
   * In the case of a failure, an integer-based, endpoint-specific error code
            indicating the nature of the failure
   * @return ResultCode
   */
  @JsonGetter("ResultCode")
  public int getResultCode() {
    return resultCode;
  }

  /**
   * In the case of a failure, a human readable message indicating the nature of the failure
   * @param message the value
   */
  @JsonSetter("Message")
  public RequestResult setMessage(String message) {
    this.message = message;
    return this;
  }

  /**
   * In the case of a failure, a human readable message indicating the nature of the failure
   *
   * @return never null
   */
  @JsonGetter("Message")
  public String getMessage() {
    return message == null ? "" : message;
  }
}
