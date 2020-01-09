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

import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This message is used to request a process endpoint for the details of a named
            recipe. The response includes details of the recipe, depending on the 
            classification of the process.
            
            {
              &quot;RecipeName&quot;: &quot;RECIPE3234&quot;,
              &quot;Revision&quot;: null
            }
 * original type: CFX.Production.GetRecipeRequest
 */
public class GetRecipeRequest extends CFXMessage {

  private String recipeName;
  private String revision;

  /**
   * The name of the recipe to be retrieved (may include full path, if applicable)
   * @param recipeName the value
   */
  @JsonSetter("RecipeName")
  public GetRecipeRequest setRecipeName(String recipeName) {
    this.recipeName = recipeName;
    return this;
  }

  /**
   * The name of the recipe to be retrieved (may include full path, if applicable)
   *
   * @return never null
   */
  @JsonGetter("RecipeName")
  public String getRecipeName() {
    return recipeName == null ? "" : recipeName;
  }

  /**
   * Version number, e.g. “2.0” (Optional)
   * @param revision the value
   */
  @JsonSetter("Revision")
  public GetRecipeRequest setRevision(String revision) {
    this.revision = revision;
    return this;
  }

  /**
   * Version number, e.g. “2.0” (Optional)
   *
   * @return never null
   */
  @JsonGetter("Revision")
  public String getRevision() {
    return revision == null ? "" : revision;
  }
}
