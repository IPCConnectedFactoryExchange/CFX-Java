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
 * Force parameters specific to a press fit connector
 * original type: CFX.Structures.PressInsertion.ConnectorForces
 */
public class ConnectorForces {

  private double maximumForce;
  private double minimumForce;
  private double otherForce;
  private double userDefinedForce;

  /**
   * The maximum force
   * @param maximumForce the value
   */
  @JsonSetter("MaximumForce")
  public ConnectorForces setMaximumForce(double maximumForce) {
    this.maximumForce = maximumForce;
    return this;
  }

  /**
   * The maximum force
   * @return MaximumForce
   */
  @JsonGetter("MaximumForce")
  public double getMaximumForce() {
    return maximumForce;
  }

  /**
   * The minimum force
   * @param minimumForce the value
   */
  @JsonSetter("MinimumForce")
  public ConnectorForces setMinimumForce(double minimumForce) {
    this.minimumForce = minimumForce;
    return this;
  }

  /**
   * The minimum force
   * @return MinimumForce
   */
  @JsonGetter("MinimumForce")
  public double getMinimumForce() {
    return minimumForce;
  }

  /**
   * Other (external) force
   * @param otherForce the value
   */
  @JsonSetter("OtherForce")
  public ConnectorForces setOtherForce(double otherForce) {
    this.otherForce = otherForce;
    return this;
  }

  /**
   * Other (external) force
   * @return OtherForce
   */
  @JsonGetter("OtherForce")
  public double getOtherForce() {
    return otherForce;
  }

  /**
   * User Defined Force
   * @param userDefinedForce the value
   */
  @JsonSetter("UserDefinedForce")
  public ConnectorForces setUserDefinedForce(double userDefinedForce) {
    this.userDefinedForce = userDefinedForce;
    return this;
  }

  /**
   * User Defined Force
   * @return UserDefinedForce
   */
  @JsonGetter("UserDefinedForce")
  public double getUserDefinedForce() {
    return userDefinedForce;
  }
}
