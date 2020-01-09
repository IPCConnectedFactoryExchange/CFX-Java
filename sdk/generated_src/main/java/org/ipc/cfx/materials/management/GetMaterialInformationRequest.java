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
package org.ipc.cfx.materials.management;

import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * A request (typically to an factory level software system) to obtain detailed information about a particular material package (or collection of 
            material packages).
            
            {
              &quot;MaterialPackageIdentifiers&quot;: [
                &quot;MAT4566556456&quot;,
                &quot;MAT4566554543&quot;
              ]
            }
 * original type: CFX.Materials.Management.GetMaterialInformationRequest
 */
public class GetMaterialInformationRequest extends CFXMessage {

  private String[] materialPackageIdentifiers;

  /**
   * A list of the unique identifiers of the material packages for which detailed
            information is requested.
   * @param materialPackageIdentifiers the value
   */
  @JsonSetter("MaterialPackageIdentifiers")
  public GetMaterialInformationRequest setMaterialPackageIdentifiers(String[] materialPackageIdentifiers) {
    this.materialPackageIdentifiers = materialPackageIdentifiers;
    return this;
  }

  /**
   * A list of the unique identifiers of the material packages for which detailed
            information is requested.
   * @return MaterialPackageIdentifiers
   */
  @JsonGetter("MaterialPackageIdentifiers")
  public String[] getMaterialPackageIdentifiers() {
    return materialPackageIdentifiers;
  }
}
