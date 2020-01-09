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
 * Sent whenever the setup requirement of materials, tools, etc. are changed for any reason at a process endpoint. 
            This message contains a detailed listing of the required items, and their designated positions. 
            This message is typically used for example, whenever a new recipe is activated which requires a different setup.
            If the Lane and Stage properties are left empty, the setup requirements of the entire Endpoint have been impacted.
            Otherwise, only the specified Lane and/or Stage is impacted.
            
            {
              &quot;Lane&quot;: 1,
              &quot;Stage&quot;: null
            }
 * original type: CFX.Production.SetupRequirementsChanged
 */
public class SetupRequirementsChanged extends CFXMessage {

  private Integer lane;
  private Stage stage;

  /**
   * An optional property designating the affected Lane.
   * @param lane the value
   */
  @JsonSetter("Lane")
  public SetupRequirementsChanged setLane(Integer lane) {
    this.lane = lane;
    return this;
  }

  /**
   * An optional property designating the affected Lane.
   * @return Lane
   */
  @JsonGetter("Lane")
  public Integer getLane() {
    return lane;
  }

  /**
   * An optional property designating the affected Stage.
   * @param stage the value
   */
  @JsonSetter("Stage")
  public SetupRequirementsChanged setStage(Stage stage) {
    this.stage = stage;
    return this;
  }

  /**
   * An optional property designating the affected Stage.
   * @return Stage
   */
  @JsonGetter("Stage")
  public Stage getStage() {
    return stage;
  }
}
