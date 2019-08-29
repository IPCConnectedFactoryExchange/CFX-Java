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
package org.ipc.cfx.informationsystem.unitvalidation;

import org.ipc.cfx.structures.RequestResult;
import org.ipc.cfx.structures.ValidationResult;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent from a process endpoint in order to validate the identifier of the next production unit.  
            Process endpoints, where configured, should send this request before allowing the next unit
            to enter the process. Configuration must be provided to identify the endpoint that implements 
            CFX.InformationSystem.UnitValidation Identification and is responsible to provide the response.
            
            {
              "Result": {
                "Result": "Success",
                "ResultCode": 0,
                "Message": null
              },
              "PrimaryResult": {
                "UniqueIdentifier": "CARRIER5566",
                "PositionNumber": 0,
                "Result": "Passed",
                "FailureCode": 0,
                "Message": "OK"
              },
              "ValidationResults": [
                {
                  "UniqueIdentifier": "CARRIER5566",
                  "PositionNumber": 1,
                  "Result": "Passed",
                  "FailureCode": 0,
                  "Message": "OK"
                },
                {
                  "UniqueIdentifier": "CARRIER5566",
                  "PositionNumber": 2,
                  "Result": "Passed",
                  "FailureCode": 0,
                  "Message": "OK"
                }
              ]
            }
 * original type: CFX.InformationSystem.UnitValidation.ValidateUnitsResponse
 */
public class ValidateUnitsResponse extends CFXMessage {

  private RequestResult result;
  private ValidationResult primaryResult;
  private ValidationResult[] validationResults;

  /**
   * Result of the request
   */
  @JsonSetter("Result")
  public void setResult(RequestResult result) {
    this.result = result;
  }

  /**
   * Result of the request
   */
  @JsonGetter("Result")
  public RequestResult getResult() {
    return result;
  }

  /**
   * Overall result of the validation request
   */
  @JsonSetter("PrimaryResult")
  public void setPrimaryResult(ValidationResult primaryResult) {
    this.primaryResult = primaryResult;
  }

  /**
   * Overall result of the validation request
   */
  @JsonGetter("PrimaryResult")
  public ValidationResult getPrimaryResult() {
    return primaryResult;
  }

  /**
   * Individual results of the validation request (for multiple units in a carrier or PCB Panel)
   */
  @JsonSetter("ValidationResults")
  public void setValidationResults(ValidationResult[] validationResults) {
    this.validationResults = validationResults;
  }

  /**
   * Individual results of the validation request (for multiple units in a carrier or PCB Panel)
   */
  @JsonGetter("ValidationResults")
  public ValidationResult[] getValidationResults() {
    return validationResults;
  }
}
