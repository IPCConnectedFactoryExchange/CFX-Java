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
import org.ipc.cfx.structures.pcbinspection.InspectionObject;
import org.ipc.cfx.structures.pcbinspection.Feature;
import org.ipc.cfx.structures.pcbinspection.Value;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

/**
 * An object that can be identified by its name.
 * original type: CFX.Structures.NamedObject
 */
@JsonTypeInfo(use = Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "$type")
@JsonSubTypes({
  @Type(value = InspectionObject.class, name = "CFX.Structures.PCBInspection.InspectionObject, CFX"),
  @Type(value = Feature.class, name = "CFX.Structures.PCBInspection.Feature, CFX"),
  @Type(value = Value.class, name = "CFX.Structures.PCBInspection.Value, CFX"),
})
public class NamedObject {

  private String name;

  /**
   * The name of this object, like &quot;C1&quot;, &quot;R1&quot;, &quot;Fiducial_1&quot;, &quot;Pin1&quot;
   * @param name the value
   */
  @JsonSetter("Name")
  public NamedObject setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of this object, like &quot;C1&quot;, &quot;R1&quot;, &quot;Fiducial_1&quot;, &quot;Pin1&quot;
   *
   * @return never null
   * property inherited from NamedObject 
   */
  @JsonGetter("Name")
  public String getName() {
    return name == null ? "" : name;
  }
}
