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
package org.ipc.cfx.production;

import org.ipc.cfx.structures.MaterialLocation;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent to a process endpoint to release a material locations block which was put
            into place by a previously sent BlockMaterialLocationsRequest
            
            {
              &quot;Locations&quot;: [
                {
                  &quot;LocationIdentifier&quot;: &quot;23143433&quot;,
                  &quot;LocationName&quot;: &quot;SLOT45&quot;,
                  &quot;MaterialPackage&quot;: null,
                  &quot;CarrierInformation&quot;: null
                },
                {
                  &quot;LocationIdentifier&quot;: &quot;23143454&quot;,
                  &quot;LocationName&quot;: &quot;SLOT46&quot;,
                  &quot;MaterialPackage&quot;: null,
                  &quot;CarrierInformation&quot;: null
                }
              ]
            }
 * original type: CFX.Production.UnblockMaterialLocationsRequest
 */
public class UnblockMaterialLocationsRequest extends CFXMessage {

  private MaterialLocation[] locations;

  /**
   * A list of locations to be unblocked
   * @param locations the value
   */
  @JsonSetter("Locations")
  public UnblockMaterialLocationsRequest setLocations(MaterialLocation[] locations) {
    this.locations = locations;
    return this;
  }

  /**
   * A list of locations to be unblocked
   * @return Locations
   */
  @JsonGetter("Locations")
  public MaterialLocation[] getLocations() {
    return locations;
  }
}
