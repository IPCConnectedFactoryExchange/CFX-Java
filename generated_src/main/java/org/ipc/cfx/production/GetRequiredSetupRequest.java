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

import org.ipc.cfx.structures.Stage;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent to a process endpoint to request the setup requirements of the active recipe.
            The response lists the required materials and tools, along with the locations where 
            the materials/tools must be loaded.
            
            {
              "Lane": 1,
              "Stage": {
                "StageSequence": 1,
                "StageName": "STAGE1",
                "StageType": "Work"
              }
            }
 * original type: CFX.Production.GetRequiredSetupRequest
 */
public class GetRequiredSetupRequest extends CFXMessage {

  private Integer lane;
  private Stage stage;

  /**
   * An optional property designating the specific Lane.
   */
  @JsonSetter("Lane")
  public void setLane(Integer lane) {
    this.lane = lane;
  }

  /**
   * An optional property designating the specific Lane.
   */
  @JsonGetter("Lane")
  public Integer getLane() {
    return lane;
  }

  /**
   * An optional property designating the specific Stage.
   */
  @JsonSetter("Stage")
  public void setStage(Stage stage) {
    this.stage = stage;
  }

  /**
   * An optional property designating the specific Stage.
   */
  @JsonGetter("Stage")
  public Stage getStage() {
    return stage;
  }
}
