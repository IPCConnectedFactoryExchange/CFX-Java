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

import org.ipc.cfx.structures.Stage;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Used to request the name of the recipe that is activated at a process
            endpoint. The response indicates the name of the recipe.
            
            {
              &quot;Lane&quot;: 1,
              &quot;Stage&quot;: null
            }
 * original type: CFX.Production.GetActiveRecipeRequest
 */
public class GetActiveRecipeRequest extends CFXMessage {

  private Integer lane;
  private Stage stage;

  /**
   * The optional number of the production lane
   * @param lane the value
   */
  @JsonSetter("Lane")
  public GetActiveRecipeRequest setLane(Integer lane) {
    this.lane = lane;
    return this;
  }

  /**
   * The optional number of the production lane
   * @return Lane
   */
  @JsonGetter("Lane")
  public Integer getLane() {
    return lane;
  }

  /**
   * The optional structure identifying the specific Stage
   * @param stage the value
   */
  @JsonSetter("Stage")
  public GetActiveRecipeRequest setStage(Stage stage) {
    this.stage = stage;
    return this;
  }

  /**
   * The optional structure identifying the specific Stage
   * @return Stage
   */
  @JsonGetter("Stage")
  public Stage getStage() {
    return stage;
  }
}
