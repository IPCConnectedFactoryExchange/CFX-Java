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
package org.ipc.cfx.structures;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Describes a location on a process endpoint where a tool may be stored.
 * original type: CFX.Structures.ToolHolder
 */
public class ToolHolder {

  private String locationUniqueIdentifier;
  private String locationName;
  private String baseName;

  /**
   * Unique identifier of the tool holder (barcode, RFID, etc.)
   * @param locationUniqueIdentifier the value
   */
  @JsonSetter("LocationUniqueIdentifier")
  public void setLocationUniqueIdentifier(String locationUniqueIdentifier) {
    this.locationUniqueIdentifier = locationUniqueIdentifier;
  }

  /**
   * Unique identifier of the tool holder (barcode, RFID, etc.)
   *
   * @return never null
   */
  @JsonGetter("LocationUniqueIdentifier")
  public String getLocationUniqueIdentifier() {
    return locationUniqueIdentifier == null ? "" : locationUniqueIdentifier;
  }

  /**
   * The name of the tool holder location
   * @param locationName the value
   */
  @JsonSetter("LocationName")
  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }

  /**
   * The name of the tool holder location
   *
   * @return never null
   */
  @JsonGetter("LocationName")
  public String getLocationName() {
    return locationName == null ? "" : locationName;
  }

  /**
   * If this tool holder is part of a nest or group of nozzle holders, 
            this is the nest or group name.
   * @param baseName the value
   */
  @JsonSetter("BaseName")
  public void setBaseName(String baseName) {
    this.baseName = baseName;
  }

  /**
   * If this tool holder is part of a nest or group of nozzle holders, 
            this is the nest or group name.
   *
   * @return never null
   */
  @JsonGetter("BaseName")
  public String getBaseName() {
    return baseName == null ? "" : baseName;
  }
}
