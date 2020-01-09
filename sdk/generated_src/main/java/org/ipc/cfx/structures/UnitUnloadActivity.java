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
package org.ipc.cfx.structures;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * A specialized type of Activity that occurs when a unit is unloaded from an endpoint.
 * original type: CFX.Structures.UnitUnloadActivity
 */
public class UnitUnloadActivity extends Activity {

  private long unloadTime;

  /**
   * The total amount of time consumed by the load event.
   * @param unloadTime the value
   */
  @JsonSetter("UnloadTime")
  public UnitUnloadActivity setUnloadTime(long unloadTime) {
    this.unloadTime = unloadTime;
    return this;
  }

  /**
   * The total amount of time consumed by the load event.
   * @return UnloadTime
   */
  @JsonGetter("UnloadTime")
  public long getUnloadTime() {
    return unloadTime;
  }
}
