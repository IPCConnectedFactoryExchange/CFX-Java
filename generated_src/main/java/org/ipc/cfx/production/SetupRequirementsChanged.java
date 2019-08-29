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
 * Sent whenever the setup requirement of materials, tools, etc. are changed for any reason at a process endpoint. 
            This message contains a detailed listing of the required items, and their designated positions. 
            This message is typically used for example, whenever a new recipe is activated which requires a different setup.
            If the Lane and Stage properties are left empty, the setup requirements of the entire Endpoint have been impacted.
            Otherwise, only the specified Lane and/or Stage is impacted.
            
            {
              "Lane": 1,
              "Stage": null
            }
 * original type: CFX.Production.SetupRequirementsChanged
 */
public class SetupRequirementsChanged extends CFXMessage {

  private Integer lane;
  private Stage stage;

  /**
   * An optional property designating the affected Lane.
   */
  @JsonSetter("Lane")
  public void setLane(Integer lane) {
    this.lane = lane;
  }

  /**
   * An optional property designating the affected Lane.
   */
  @JsonGetter("Lane")
  public Integer getLane() {
    return lane;
  }

  /**
   * An optional property designating the affected Stage.
   */
  @JsonSetter("Stage")
  public void setStage(Stage stage) {
    this.stage = stage;
  }

  /**
   * An optional property designating the affected Stage.
   */
  @JsonGetter("Stage")
  public Stage getStage() {
    return stage;
  }
}
