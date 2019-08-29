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
 * created: 20.08.2019 15:52:36 by frankp
 */
package org.ipc.cfx.structures.solderapplication;

import org.ipc.cfx.structures.ProcessData;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Process Data specific to a single PCB within a group of PCB's that are selectively
            soldered.
 * original type: CFX.Structures.SolderApplication.SelectiveSolderPCBProcessData
 */
public class SelectiveSolderPCBProcessData extends ProcessData {

  private ZoneData[] zoneData;

  /**
   * Data sepcific to a single zone with the
            Selective Soldering System
   */
  @JsonSetter("ZoneData")
  public void setZoneData(ZoneData[] zoneData) {
    this.zoneData = zoneData;
  }

  /**
   * Data sepcific to a single zone with the
            Selective Soldering System
   */
  @JsonGetter("ZoneData")
  public ZoneData[] getZoneData() {
    return zoneData;
  }
}
