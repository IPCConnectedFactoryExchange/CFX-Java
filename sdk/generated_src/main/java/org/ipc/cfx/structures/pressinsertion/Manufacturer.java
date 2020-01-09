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
package org.ipc.cfx.structures.pressinsertion;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Describes a Manufacturer
            
            {
                &quot;UniqueIdentifier&quot;: &quot;UID23890423&quot;,
                &quot;Name&quot;: &quot;ACME&quot;
            }
 * original type: CFX.Structures.PressInsertion.Manufacturer
 */
public class Manufacturer {

  private String uniqueIdentifier;
  private String name;

  /**
   * The unique identifier of the Manufacturer
   * @param uniqueIdentifier the value
   */
  @JsonSetter("UniqueIdentifier")
  public Manufacturer setUniqueIdentifier(String uniqueIdentifier) {
    this.uniqueIdentifier = uniqueIdentifier;
    return this;
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
   * @param name the value
   */
  @JsonSetter("Name")
  public Manufacturer setName(String name) {
    this.name = name;
    return this;
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
