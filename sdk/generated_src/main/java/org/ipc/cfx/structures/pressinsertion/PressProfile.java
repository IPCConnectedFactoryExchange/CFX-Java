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
 * Describes a Press Profile.  Press Profile consist of a sequence of steps which describe the motion of the pressing operation.
 * original type: CFX.Structures.PressInsertion.PressProfile
 */
public class PressProfile {

  private String profileName;
  private ProfileStep[] steps;

  /**
   * The  name of the profile.
   * @param profileName the value
   */
  @JsonSetter("ProfileName")
  public PressProfile setProfileName(String profileName) {
    this.profileName = profileName;
    return this;
  }

  /**
   * The  name of the profile.
   *
   * @return never null
   */
  @JsonGetter("ProfileName")
  public String getProfileName() {
    return profileName == null ? "" : profileName;
  }

  /**
   * An array of the steps of the Press Profile.
   * @param steps the value
   */
  @JsonSetter("Steps")
  public PressProfile setSteps(ProfileStep[] steps) {
    this.steps = steps;
    return this;
  }

  /**
   * An array of the steps of the Press Profile.
   * @return Steps
   */
  @JsonGetter("Steps")
  public ProfileStep[] getSteps() {
    return steps;
  }
}
