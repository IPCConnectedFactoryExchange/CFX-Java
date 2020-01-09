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
package org.ipc.cfx.materials.storage;

import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * A request to a material storage endpoint to obtain a list of all the materials
            currently stored within the endpoint.
            
            {
              &quot;LocationIdentifiers&quot;: null
            }
 * original type: CFX.Materials.Storage.GetLoadedMaterialsRequest
 */
public class GetLoadedMaterialsRequest extends CFXMessage {

  private String[] locationIdentifiers;

  /**
   * An optional list of specific locations in which the requestor is interested.
            If empty, all materials loaded at the Endpoint are returned.
   * @param locationIdentifiers the value
   */
  @JsonSetter("LocationIdentifiers")
  public GetLoadedMaterialsRequest setLocationIdentifiers(String[] locationIdentifiers) {
    this.locationIdentifiers = locationIdentifiers;
    return this;
  }

  /**
   * An optional list of specific locations in which the requestor is interested.
            If empty, all materials loaded at the Endpoint are returned.
   * @return LocationIdentifiers
   */
  @JsonGetter("LocationIdentifiers")
  public String[] getLocationIdentifiers() {
    return locationIdentifiers;
  }
}
