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
 * created: 30.08.2019 09:11:09 by frankp
 */
package org.ipc.cfx.structures;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Structure that contains information related to an Endpoint&apos;s support of the Hermes standard.
 * original type: CFX.Structures.HermesInformation
 */
public class HermesInformation {

  private boolean enabled;
  private String version;

  /**
   * Whether or not the Endpoint has Hermes support enabled.
   * @param enabled the value
   */
  @JsonSetter("Enabled")
  public void setEnabled(boolean enabled) {
    this.enabled = enabled;
  }

  /**
   * Whether or not the Endpoint has Hermes support enabled.
   * @return Enabled
   */
  @JsonGetter("Enabled")
  public boolean isEnabled() {
    return enabled;
  }

  /**
   * The specific version of Hermes supported by the Endpoint.
   * @param version the value
   */
  @JsonSetter("Version")
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   * The specific version of Hermes supported by the Endpoint.
   *
   * @return never null
   */
  @JsonGetter("Version")
  public String getVersion() {
    return version == null ? "" : version;
  }
}
