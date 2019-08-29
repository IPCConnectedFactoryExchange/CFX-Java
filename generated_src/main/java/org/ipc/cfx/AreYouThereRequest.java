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
 * created: 20.08.2019 15:52:13 by frankp
 */
package org.ipc.cfx;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Allows any CFX endpoint to determine if another particular CFX endpoint is present on a CFX network.
            The response sends basic information about the endpoint, including its CFX Handle, and network
            hostname / address.
            
            {
              "CFXHandle": "SMTPlus.Model_21232.SN23123"
            }
 * original type: CFX.AreYouThereRequest
 */
public class AreYouThereRequest extends CFXMessage {

  private String cFXHandle;

  /**
   * The handle of the endpoint to which the request is directed
   */
  @JsonSetter("CFXHandle")
  public void setCFXHandle(String cFXHandle) {
    this.cFXHandle = cFXHandle;
  }

  /**
   * The handle of the endpoint to which the request is directed
   *
   * @return never null
   */
  @JsonGetter("CFXHandle")
  public String getCFXHandle() {
    return cFXHandle == null ? "" : cFXHandle;
  }
}
