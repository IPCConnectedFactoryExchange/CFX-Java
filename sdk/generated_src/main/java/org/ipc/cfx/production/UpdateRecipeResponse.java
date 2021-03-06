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
package org.ipc.cfx.production;

import org.ipc.cfx.structures.RequestResult;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This message is used to send a named recipe to a process endpoint. The message
            includes details of the recipe, depending on the classification of the process. 
            The response indicates whether the recipe has been received correctly or not.
            
            {
              &quot;Result&quot;: {
                &quot;Result&quot;: &quot;Success&quot;,
                &quot;ResultCode&quot;: 0,
                &quot;Message&quot;: &quot;OK&quot;
              }
            }
 * original type: CFX.Production.UpdateRecipeResponse
 */
public class UpdateRecipeResponse extends CFXMessage {

  private RequestResult result;

  /**
   * 
   * @param result the value
   */
  @JsonSetter("Result")
  public UpdateRecipeResponse setResult(RequestResult result) {
    this.result = result;
    return this;
  }

  /**
   * 
   * @return Result
   */
  @JsonGetter("Result")
  public RequestResult getResult() {
    return result;
  }
}
