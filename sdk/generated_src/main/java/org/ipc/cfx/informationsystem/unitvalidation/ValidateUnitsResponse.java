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
 * created: 30.08.2019 09:11:10 by frankp
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
              &quot;Result&quot;: {
                &quot;Result&quot;: &quot;Success&quot;,
                &quot;ResultCode&quot;: 0,
                &quot;Message&quot;: null
              },
              &quot;PrimaryResult&quot;: {
                &quot;UniqueIdentifier&quot;: &quot;CARRIER5566&quot;,
                &quot;PositionNumber&quot;: 0,
                &quot;Result&quot;: &quot;Passed&quot;,
                &quot;FailureCode&quot;: 0,
                &quot;Message&quot;: &quot;OK&quot;
              },
              &quot;ValidationResults&quot;: [
                {
                  &quot;UniqueIdentifier&quot;: &quot;CARRIER5566&quot;,
                  &quot;PositionNumber&quot;: 1,
                  &quot;Result&quot;: &quot;Passed&quot;,
                  &quot;FailureCode&quot;: 0,
                  &quot;Message&quot;: &quot;OK&quot;
                },
                {
                  &quot;UniqueIdentifier&quot;: &quot;CARRIER5566&quot;,
                  &quot;PositionNumber&quot;: 2,
                  &quot;Result&quot;: &quot;Passed&quot;,
                  &quot;FailureCode&quot;: 0,
                  &quot;Message&quot;: &quot;OK&quot;
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
   * @param result the value
   */
  @JsonSetter("Result")
  public void setResult(RequestResult result) {
    this.result = result;
  }

  /**
   * Result of the request
   * @return Result
   */
  @JsonGetter("Result")
  public RequestResult getResult() {
    return result;
  }

  /**
   * Overall result of the validation request
   * @param primaryResult the value
   */
  @JsonSetter("PrimaryResult")
  public void setPrimaryResult(ValidationResult primaryResult) {
    this.primaryResult = primaryResult;
  }

  /**
   * Overall result of the validation request
   * @return PrimaryResult
   */
  @JsonGetter("PrimaryResult")
  public ValidationResult getPrimaryResult() {
    return primaryResult;
  }

  /**
   * Individual results of the validation request (for multiple units in a carrier or PCB Panel)
   * @param validationResults the value
   */
  @JsonSetter("ValidationResults")
  public void setValidationResults(ValidationResult[] validationResults) {
    this.validationResults = validationResults;
  }

  /**
   * Individual results of the validation request (for multiple units in a carrier or PCB Panel)
   * @return ValidationResults
   */
  @JsonGetter("ValidationResults")
  public ValidationResult[] getValidationResults() {
    return validationResults;
  }
}
