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
package org.ipc.cfx.structures.pcbinspection;

import org.ipc.cfx.structures.NamedObject;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * A feature/charcteristic/property/attribute (of a panel, board, componemnt, etc.) to check.
 * original type: CFX.Structures.PCBInspection.Feature
 */
public class Feature extends NamedObject {

  private boolean isDefect;
  private boolean isInspected;
  private boolean isDetectedDefect;
  private boolean isVerified;
  private boolean isVerifiedDefect;
  private boolean isRepaired;
  private Value[] values;

  /**
   * The feature is detected as defect.
              A defect detected during inspection may be be identified a "false call" in verification
              or may have been repaired.
   */
  @JsonSetter("IsDefect")
  public void setIsDefect(boolean isDefect) {
    this.isDefect = isDefect;
  }

  /**
   * The feature is detected as defect.
              A defect detected during inspection may be be identified a "false call" in verification
              or may have been repaired.
   */
  @JsonGetter("IsDefect")
  public boolean isIsDefect() {
    return isDefect;
  }

  /**
   * This feature was checked.
            (The inspection may have been skipped due to a defect detected earlier, so further
            time consuming inspections are pointless.)
   */
  @JsonSetter("IsInspected")
  public void setIsInspected(boolean isInspected) {
    this.isInspected = isInspected;
  }

  /**
   * This feature was checked.
            (The inspection may have been skipped due to a defect detected earlier, so further
            time consuming inspections are pointless.)
   */
  @JsonGetter("IsInspected")
  public boolean getIsInspected() {
    return isInspected;
  }

  /**
   * The inspection has detected/classified this feature as defect.
   */
  @JsonSetter("IsDetectedDefect")
  public void setIsDetectedDefect(boolean isDetectedDefect) {
    this.isDetectedDefect = isDetectedDefect;
  }

  /**
   * The inspection has detected/classified this feature as defect.
   */
  @JsonGetter("IsDetectedDefect")
  public boolean isIsDetectedDefect() {
    return isDetectedDefect;
  }

  /**
   * This (usually defect) feature was verified (AKA "classified") by a human.
   */
  @JsonSetter("IsVerified")
  public void setIsVerified(boolean isVerified) {
    this.isVerified = isVerified;
  }

  /**
   * This (usually defect) feature was verified (AKA "classified") by a human.
   */
  @JsonGetter("IsVerified")
  public boolean isIsVerified() {
    return isVerified;
  }

  /**
   * The verification (AKA "classification) by a human has confirmed a defect.
   */
  @JsonSetter("IsVerifiedDefect")
  public void setIsVerifiedDefect(boolean isVerifiedDefect) {
    this.isVerifiedDefect = isVerifiedDefect;
  }

  /**
   * The verification (AKA "classification) by a human has confirmed a defect.
   */
  @JsonGetter("IsVerifiedDefect")
  public boolean isIsVerifiedDefect() {
    return isVerifiedDefect;
  }

  /**
   * The (eventual) defect was repaired successfully.
   */
  @JsonSetter("IsRepaired")
  public void setIsRepaired(boolean isRepaired) {
    this.isRepaired = isRepaired;
  }

  /**
   * The (eventual) defect was repaired successfully.
   */
  @JsonGetter("IsRepaired")
  public boolean isIsRepaired() {
    return isRepaired;
  }

  /**
   * List of values (of varying types).
   */
  @JsonSetter("Values")
  public void setValues(Value[] values) {
    this.values = values;
  }

  /**
   * List of values (of varying types).
   */
  @JsonGetter("Values")
  public Value[] getValues() {
    return values;
  }
}
