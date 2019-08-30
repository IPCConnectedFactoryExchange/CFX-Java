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
 * created: 30.08.2019 09:11:09 by frankp
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
              &quot;OldTool&quot;: null,
              &quot;ReturnedToHolder&quot;: null,
              &quot;NewTool&quot;: {
                &quot;UniqueIdentifier&quot;: &quot;UID23890430&quot;,
                &quot;Name&quot;: &quot;TorqueWrench_123&quot;
              },
              &quot;LoadedFromHolder&quot;: {
                &quot;LocationUniqueIdentifier&quot;: &quot;UID238943243243&quot;,
                &quot;LocationName&quot;: &quot;BIN45&quot;,
                &quot;BaseName&quot;: null
              }
            }
            Example 2 (Nozzle change on SMT placement machine):
            {
              &quot;OldTool&quot;: null,
              &quot;ReturnedToHolder&quot;: null,
              &quot;NewTool&quot;: {
                &quot;$type&quot;: &quot;CFX.Structures.SMTPlacement.SMTHeadAndNozzle, CFX&quot;,
                &quot;HeadId&quot;: &quot;HEAD1&quot;,
                &quot;HeadNozzleNumber&quot;: 1,
                &quot;NozzleType&quot;: &quot;TYPE914&quot;,
                &quot;UniqueIdentifier&quot;: &quot;UID23890430&quot;,
                &quot;Name&quot;: &quot;NOZZLE234324&quot;
              },
              &quot;LoadedFromHolder&quot;: {
                &quot;LocationUniqueIdentifier&quot;: &quot;UID238943243243&quot;,
                &quot;LocationName&quot;: &quot;HOLDER14&quot;,
                &quot;BaseName&quot;: &quot;NEST2&quot;
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
   * @param oldTool the value
   */
  @JsonSetter("OldTool")
  public void setOldTool(Tool oldTool) {
    this.oldTool = oldTool;
  }

  /**
   * The tool that was previously in active use (if any)
   * @return OldTool
   */
  @JsonGetter("OldTool")
  public Tool getOldTool() {
    return oldTool;
  }

  /**
   * The location on the endpoint where the old tool was returned (if any)
   * @param returnedToHolder the value
   */
  @JsonSetter("ReturnedToHolder")
  public void setReturnedToHolder(ToolHolder returnedToHolder) {
    this.returnedToHolder = returnedToHolder;
  }

  /**
   * The location on the endpoint where the old tool was returned (if any)
   * @return ReturnedToHolder
   */
  @JsonGetter("ReturnedToHolder")
  public ToolHolder getReturnedToHolder() {
    return returnedToHolder;
  }

  /**
   * The new active tool
   * @param newTool the value
   */
  @JsonSetter("NewTool")
  public void setNewTool(Tool newTool) {
    this.newTool = newTool;
  }

  /**
   * The new active tool
   * @return NewTool
   */
  @JsonGetter("NewTool")
  public Tool getNewTool() {
    return newTool;
  }

  /**
   * The location on the endpoint from which the newly active tool was selected
   * @param loadedFromHolder the value
   */
  @JsonSetter("LoadedFromHolder")
  public void setLoadedFromHolder(ToolHolder loadedFromHolder) {
    this.loadedFromHolder = loadedFromHolder;
  }

  /**
   * The location on the endpoint from which the newly active tool was selected
   * @return LoadedFromHolder
   */
  @JsonGetter("LoadedFromHolder")
  public ToolHolder getLoadedFromHolder() {
    return loadedFromHolder;
  }
}
