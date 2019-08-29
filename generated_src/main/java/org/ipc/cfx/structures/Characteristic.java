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
 * created: 20.08.2019 15:52:18 by frankp
 */
package org.ipc.cfx.structures;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * A singular characteristic that has been applied to a production unit
 * original type: CFX.Structures.Characteristic
 */
public class Characteristic {

  private String name;
  private String value;

  /**
   * The name of the characteristic
   */
  @JsonSetter("Name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The name of the characteristic
   *
   * @return never null
   * property inherited from Characteristic 
   */
  @JsonGetter("Name")
  public String getName() {
    return name == null ? "" : name;
  }

  /**
   * The value of the characteristic
   */
  @JsonSetter("Value")
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * The value of the characteristic
   *
   * @return never null
   */
  @JsonGetter("Value")
  public String getValue() {
    return value == null ? "" : value;
  }
}
