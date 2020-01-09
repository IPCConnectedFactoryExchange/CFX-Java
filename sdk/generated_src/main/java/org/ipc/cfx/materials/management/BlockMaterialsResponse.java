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

import org.ipc.cfx.structures.RequestResult;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Response to a request block one or more instances of material from use in production
            
            {
              &quot;Result&quot;: {
                &quot;Result&quot;: &quot;Success&quot;,
                &quot;ResultCode&quot;: 0,
                &quot;Message&quot;: &quot;OK&quot;
              },
              &quot;MaterialsPackagesNotBlocked&quot;: []
            }
 * original type: CFX.Materials.Management.BlockMaterialsResponse
 */
public class BlockMaterialsResponse extends CFXMessage {

  private RequestResult result;
  private String[] materialsPackagesNotBlocked;

  /**
   * The result of the request
   * @param result the value
   */
  @JsonSetter("Result")
  public BlockMaterialsResponse setResult(RequestResult result) {
    this.result = result;
    return this;
  }

  /**
   * The result of the request
   * @return Result
   */
  @JsonGetter("Result")
  public RequestResult getResult() {
    return result;
  }

  /**
   * In the case that some of the material packages identified in the request could not be blocked,
            the Result property will be set to PartialSuccess, and this property will contain a list of the identifiers
            that could not be blocked.
   * @param materialsPackagesNotBlocked the value
   */
  @JsonSetter("MaterialsPackagesNotBlocked")
  public BlockMaterialsResponse setMaterialsPackagesNotBlocked(String[] materialsPackagesNotBlocked) {
    this.materialsPackagesNotBlocked = materialsPackagesNotBlocked;
    return this;
  }

  /**
   * In the case that some of the material packages identified in the request could not be blocked,
            the Result property will be set to PartialSuccess, and this property will contain a list of the identifiers
            that could not be blocked.
   * @return MaterialsPackagesNotBlocked
   */
  @JsonGetter("MaterialsPackagesNotBlocked")
  public String[] getMaterialsPackagesNotBlocked() {
    return materialsPackagesNotBlocked;
  }
}
