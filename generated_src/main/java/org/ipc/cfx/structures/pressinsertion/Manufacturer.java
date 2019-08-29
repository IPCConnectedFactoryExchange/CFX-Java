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
package org.ipc.cfx.structures.pressinsertion;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Describes a Manufacturer
            
            {
                "UniqueIdentifier": "UID23890423",
                "Name": "ACME"
            }
 * original type: CFX.Structures.PressInsertion.Manufacturer
 */
public class Manufacturer {

  private String uniqueIdentifier;
  private String name;

  /**
   * The unique identifier of the Manufacturer
   */
  @JsonSetter("UniqueIdentifier")
  public void setUniqueIdentifier(String uniqueIdentifier) {
    this.uniqueIdentifier = uniqueIdentifier;
  }

  /**
   * The unique identifier of the Manufacturer
   *
   * @return never null
   */
  @JsonGetter("UniqueIdentifier")
  public String getUniqueIdentifier() {
    return uniqueIdentifier == null ? "" : uniqueIdentifier;
  }

  /**
   * The name of the Manufacturer
   */
  @JsonSetter("Name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The name of the Manufacturer
   *
   * @return never null
   * property inherited from Manufacturer 
   */
  @JsonGetter("Name")
  public String getName() {
    return name == null ? "" : name;
  }
}
