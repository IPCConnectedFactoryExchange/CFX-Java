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
 * Used to request the name of the recipe that is activated at a process
            endpoint. The response indicates the name of the recipe.
            
            {
              &quot;Result&quot;: {
                &quot;Result&quot;: &quot;Success&quot;,
                &quot;ResultCode&quot;: 0,
                &quot;Message&quot;: &quot;OK&quot;
              },
              &quot;ActiveRecipeName&quot;: &quot;RECIPE5566&quot;,
              &quot;ActiveRecipeRevision&quot;: &quot;C&quot;
            }
 * original type: CFX.Production.GetActiveRecipeResponse
 */
public class GetActiveRecipeResponse extends CFXMessage {

  private RequestResult result;
  private String activeRecipeName;
  private String activeRecipeRevision;

  /**
   * The result of the request
   * @param result the value
   */
  @JsonSetter("Result")
  public GetActiveRecipeResponse setResult(RequestResult result) {
    this.result = result;
    return this;
  }

  /**
   * The result of the request
   * @return Result
   */
  @JsonGetter("Result")
  public RequestResult getResult() {
    return result;
  }

  /**
   * The name of the active recipe (may include full path, if applicable)
   * @param activeRecipeName the value
   */
  @JsonSetter("ActiveRecipeName")
  public GetActiveRecipeResponse setActiveRecipeName(String activeRecipeName) {
    this.activeRecipeName = activeRecipeName;
    return this;
  }

  /**
   * The name of the active recipe (may include full path, if applicable)
   *
   * @return never null
   */
  @JsonGetter("ActiveRecipeName")
  public String getActiveRecipeName() {
    return activeRecipeName == null ? "" : activeRecipeName;
  }

  /**
   * Version number, e.g. “2.0” (Optional)
   * @param activeRecipeRevision the value
   */
  @JsonSetter("ActiveRecipeRevision")
  public GetActiveRecipeResponse setActiveRecipeRevision(String activeRecipeRevision) {
    this.activeRecipeRevision = activeRecipeRevision;
    return this;
  }

  /**
   * Version number, e.g. “2.0” (Optional)
   *
   * @return never null
   */
  @JsonGetter("ActiveRecipeRevision")
  public String getActiveRecipeRevision() {
    return activeRecipeRevision == null ? "" : activeRecipeRevision;
  }
}
