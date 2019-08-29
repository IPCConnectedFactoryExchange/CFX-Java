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
package org.ipc.cfx.sensor.identification;

import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent by an identification device (barcode scanner, RFID reader, etc.) when the device attempts to read or interpret
            an identifier, but is unable to do so.
            Example 1 (Simple, single barcode read)
            {
              "PositionsNotRead": []
            }
            Example 2 (Camera system capable of reading all barcodes on a multi-circuit PCB panel)
            {
              "PositionsNotRead": [
                2,
                8
              ]
            }
 * original type: CFX.Sensor.Identification.IdentifiersNotRead
 */
public class IdentifiersNotRead extends CFXMessage {

  private Integer[] positionsNotRead;

  /**
   * And optional property indicated the position that cannot be read.  Used in the case that multiple 
            production units are moving through the process, and the sensor is capable if reading multiple identifiers.
   */
  @JsonSetter("PositionsNotRead")
  public void setPositionsNotRead(Integer[] positionsNotRead) {
    this.positionsNotRead = positionsNotRead;
  }

  /**
   * And optional property indicated the position that cannot be read.  Used in the case that multiple 
            production units are moving through the process, and the sensor is capable if reading multiple identifiers.
   */
  @JsonGetter("PositionsNotRead")
  public Integer[] getPositionsNotRead() {
    return positionsNotRead;
  }
}
