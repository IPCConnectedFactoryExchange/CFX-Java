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
package org.ipc.cfx.resourceperformance;

import org.ipc.cfx.structures.Tool;
import org.ipc.cfx.structures.ToolHolder;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent when a new tool is selected for active use at a production endpoint
            Example 1 (Generic tool change):
            {
              "OldTool": null,
              "ReturnedToHolder": null,
              "NewTool": {
                "UniqueIdentifier": "UID23890430",
                "Name": "TorqueWrench_123"
              },
              "LoadedFromHolder": {
                "LocationUniqueIdentifier": "UID238943243243",
                "LocationName": "BIN45",
                "BaseName": null
              }
            }
            Example 2 (Nozzle change on SMT placement machine):
            {
              "OldTool": null,
              "ReturnedToHolder": null,
              "NewTool": {
                "$type": "CFX.Structures.SMTPlacement.SMTHeadAndNozzle, CFX",
                "HeadId": "HEAD1",
                "HeadNozzleNumber": 1,
                "NozzleType": "TYPE914",
                "UniqueIdentifier": "UID23890430",
                "Name": "NOZZLE234324"
              },
              "LoadedFromHolder": {
                "LocationUniqueIdentifier": "UID238943243243",
                "LocationName": "HOLDER14",
                "BaseName": "NEST2"
              }
            }
 * original type: CFX.ResourcePerformance.ToolChanged
 */
public class ToolChanged extends CFXMessage {

  private Tool oldTool;
  private ToolHolder returnedToHolder;
  private Tool newTool;
  private ToolHolder loadedFromHolder;

  /**
   * The tool that was previously in active use (if any)
   */
  @JsonSetter("OldTool")
  public void setOldTool(Tool oldTool) {
    this.oldTool = oldTool;
  }

  /**
   * The tool that was previously in active use (if any)
   */
  @JsonGetter("OldTool")
  public Tool getOldTool() {
    return oldTool;
  }

  /**
   * The location on the endpoint where the old tool was returned (if any)
   */
  @JsonSetter("ReturnedToHolder")
  public void setReturnedToHolder(ToolHolder returnedToHolder) {
    this.returnedToHolder = returnedToHolder;
  }

  /**
   * The location on the endpoint where the old tool was returned (if any)
   */
  @JsonGetter("ReturnedToHolder")
  public ToolHolder getReturnedToHolder() {
    return returnedToHolder;
  }

  /**
   * The new active tool
   */
  @JsonSetter("NewTool")
  public void setNewTool(Tool newTool) {
    this.newTool = newTool;
  }

  /**
   * The new active tool
   */
  @JsonGetter("NewTool")
  public Tool getNewTool() {
    return newTool;
  }

  /**
   * The location on the endpoint from which the newly active tool was selected
   */
  @JsonSetter("LoadedFromHolder")
  public void setLoadedFromHolder(ToolHolder loadedFromHolder) {
    this.loadedFromHolder = loadedFromHolder;
  }

  /**
   * The location on the endpoint from which the newly active tool was selected
   */
  @JsonGetter("LoadedFromHolder")
  public ToolHolder getLoadedFromHolder() {
    return loadedFromHolder;
  }
}
