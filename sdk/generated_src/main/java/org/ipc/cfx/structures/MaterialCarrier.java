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
package org.ipc.cfx.structures;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import org.ipc.cfx.structures.smtplacement.SMDTapeFeeder;
import org.ipc.cfx.structures.smtplacement.SMDTrayFeeder;
import org.ipc.cfx.structures.smtplacement.SMDTubeFeeder;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

/**
 * A dynamic structure which describes a device that is mounted at a process endpoint which contains
            source materials that are then consumed by the endpoint.  An SMD Tape Feeder would be an example of a MaterialCarrier.
            This base MaterialCarrier structure is used to describe a generic carrier, when a more specific carrier location class is
            not available, such as , , and .
 * original type: CFX.Structures.MaterialCarrier
 */
@JsonTypeInfo(use = Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "$type")
@JsonSubTypes({
  @Type(value = SMDTapeFeeder.class, name = "CFX.Structures.SMTPlacement.SMDTapeFeeder, CFX"),
  @Type(value = SMDTrayFeeder.class, name = "CFX.Structures.SMTPlacement.SMDTrayFeeder, CFX"),
  @Type(value = SMDTubeFeeder.class, name = "CFX.Structures.SMTPlacement.SMDTubeFeeder, CFX"),
})
public class MaterialCarrier {

  private String uniqueIdentifier;
  private String name;

  /**
   * The unique identifier for this carrier (barcode, RFID, etc.)
   * @param uniqueIdentifier the value
   */
  @JsonSetter("UniqueIdentifier")
  public MaterialCarrier setUniqueIdentifier(String uniqueIdentifier) {
    this.uniqueIdentifier = uniqueIdentifier;
    return this;
  }

  /**
   * The unique identifier for this carrier (barcode, RFID, etc.)
   *
   * @return never null
   */
  @JsonGetter("UniqueIdentifier")
  public String getUniqueIdentifier() {
    return uniqueIdentifier == null ? "" : uniqueIdentifier;
  }

  /**
   * A human readable name for this carrier
   * @param name the value
   */
  @JsonSetter("Name")
  public MaterialCarrier setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * A human readable name for this carrier
   *
   * @return never null
   * property inherited from MaterialCarrier 
   */
  @JsonGetter("Name")
  public String getName() {
    return name == null ? "" : name;
  }
}
