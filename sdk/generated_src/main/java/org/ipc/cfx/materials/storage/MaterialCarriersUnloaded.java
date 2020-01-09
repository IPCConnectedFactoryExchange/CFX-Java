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
 * Sent when a material carrier (typcially containing 1 or more material packages)
            is unloaded at a process endpoint.
            
            {
              &quot;CarrierIdentifiers&quot;: [
                &quot;1233334&quot;,
                &quot;1233334&quot;
              ]
            }
 * original type: CFX.Materials.Storage.MaterialCarriersUnloaded
 */
public class MaterialCarriersUnloaded extends CFXMessage {

  private String[] carrierIdentifiers;

  /**
   * List of carriers to be unloaded.  
            NOTE - This message DOES NOT mean that the MaterialPackage is unloaded from the MaterialCarrier.
                   Only that the MaterialCarrier is unloaded from its parent (slot on and Endpoint, or another MaterialCarrier).
   * @param carrierIdentifiers the value
   */
  @JsonSetter("CarrierIdentifiers")
  public MaterialCarriersUnloaded setCarrierIdentifiers(String[] carrierIdentifiers) {
    this.carrierIdentifiers = carrierIdentifiers;
    return this;
  }

  /**
   * List of carriers to be unloaded.  
            NOTE - This message DOES NOT mean that the MaterialPackage is unloaded from the MaterialCarrier.
                   Only that the MaterialCarrier is unloaded from its parent (slot on and Endpoint, or another MaterialCarrier).
   * @return CarrierIdentifiers
   */
  @JsonGetter("CarrierIdentifiers")
  public String[] getCarrierIdentifiers() {
    return carrierIdentifiers;
  }
}
