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
package org.ipc.cfx.production;

import org.ipc.cfx.structures.RequestResult;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Response to UnblockMaterialLocationsRequest
            
            {
              "Result": {
                "Result": "Success",
                "ResultCode": 0,
                "Message": "BLOCKED OK"
              }
            }
 * original type: CFX.Production.UnblockMaterialLocationsResponse
 */
public class UnblockMaterialLocationsResponse extends CFXMessage {

  private RequestResult result;

  /**
   * 
   */
  @JsonSetter("Result")
  public void setResult(RequestResult result) {
    this.result = result;
  }

  /**
   * 
   */
  @JsonGetter("Result")
  public RequestResult getResult() {
    return result;
  }
}
