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
 * Describes a individual step of a Press Profile
 * original type: CFX.Structures.PressInsertion.ProfileStep
 */
public class ProfileStep {

  private int sequencePosition;
  private String name;
  private double speed;
  private StepType typeOfStep;

  /**
   * The sequence position of this step in relation to the other steps in the profile.  Steps are peformed in increasing sequence integer order 1...n
   * @param sequencePosition the value
   */
  @JsonSetter("SequencePosition")
  public ProfileStep setSequencePosition(int sequencePosition) {
    this.sequencePosition = sequencePosition;
    return this;
  }

  /**
   * The sequence position of this step in relation to the other steps in the profile.  Steps are peformed in increasing sequence integer order 1...n
   * @return SequencePosition
   */
  @JsonGetter("SequencePosition")
  public int getSequencePosition() {
    return sequencePosition;
  }

  /**
   * The name of this step
   * @param name the value
   */
  @JsonSetter("Name")
  public ProfileStep setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of this step
   *
   * @return never null
   * property inherited from ProfileStep 
   */
  @JsonGetter("Name")
  public String getName() {
    return name == null ? "" : name;
  }

  /**
   * The speed of this step in mm/s.
   * @param speed the value
   */
  @JsonSetter("Speed")
  public ProfileStep setSpeed(double speed) {
    this.speed = speed;
    return this;
  }

  /**
   * The speed of this step in mm/s.
   * @return Speed
   */
  @JsonGetter("Speed")
  public double getSpeed() {
    return speed;
  }

  /**
   * An enumeration indicating the type of this step
   * @param typeOfStep the value
   */
  @JsonSetter("TypeOfStep")
  public ProfileStep setTypeOfStep(StepType typeOfStep) {
    this.typeOfStep = typeOfStep;
    return this;
  }

  /**
   * An enumeration indicating the type of this step
   * @return TypeOfStep
   */
  @JsonGetter("TypeOfStep")
  public StepType getTypeOfStep() {
    return typeOfStep;
  }
}
