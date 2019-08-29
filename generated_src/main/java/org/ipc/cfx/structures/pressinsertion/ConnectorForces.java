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
 * created: 20.08.2019 15:52:37 by frankp
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
   */
  @JsonSetter("MaximumForce")
  public void setMaximumForce(double maximumForce) {
    this.maximumForce = maximumForce;
  }

  /**
   * The maximum force
   */
  @JsonGetter("MaximumForce")
  public double getMaximumForce() {
    return maximumForce;
  }

  /**
   * The minimum force
   */
  @JsonSetter("MinimumForce")
  public void setMinimumForce(double minimumForce) {
    this.minimumForce = minimumForce;
  }

  /**
   * The minimum force
   */
  @JsonGetter("MinimumForce")
  public double getMinimumForce() {
    return minimumForce;
  }

  /**
   * Other (external) force
   */
  @JsonSetter("OtherForce")
  public void setOtherForce(double otherForce) {
    this.otherForce = otherForce;
  }

  /**
   * Other (external) force
   */
  @JsonGetter("OtherForce")
  public double getOtherForce() {
    return otherForce;
  }

  /**
   * User Defined Force
   */
  @JsonSetter("UserDefinedForce")
  public void setUserDefinedForce(double userDefinedForce) {
    this.userDefinedForce = userDefinedForce;
  }

  /**
   * User Defined Force
   */
  @JsonGetter("UserDefinedForce")
  public double getUserDefinedForce() {
    return userDefinedForce;
  }
}
