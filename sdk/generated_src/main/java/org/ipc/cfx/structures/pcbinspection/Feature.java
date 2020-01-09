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
              A defect detected during inspection may be be identified a &quot;false call&quot; in verification
              or may have been repaired.
   * @param isDefect the value
   */
  @JsonSetter("IsDefect")
  public Feature setIsDefect(boolean isDefect) {
    this.isDefect = isDefect;
    return this;
  }

  /**
   * The feature is detected as defect.
              A defect detected during inspection may be be identified a &quot;false call&quot; in verification
              or may have been repaired.
   * @return IsDefect
   */
  @JsonGetter("IsDefect")
  public boolean isIsDefect() {
    return isDefect;
  }

  /**
   * This feature was checked.
            (The inspection may have been skipped due to a defect detected earlier, so further
            time consuming inspections are pointless.)
   * @param isInspected the value
   */
  @JsonSetter("IsInspected")
  public Feature setIsInspected(boolean isInspected) {
    this.isInspected = isInspected;
    return this;
  }

  /**
   * This feature was checked.
            (The inspection may have been skipped due to a defect detected earlier, so further
            time consuming inspections are pointless.)
   * @return IsInspected
   */
  @JsonGetter("IsInspected")
  public boolean getIsInspected() {
    return isInspected;
  }

  /**
   * The inspection has detected/classified this feature as defect.
   * @param isDetectedDefect the value
   */
  @JsonSetter("IsDetectedDefect")
  public Feature setIsDetectedDefect(boolean isDetectedDefect) {
    this.isDetectedDefect = isDetectedDefect;
    return this;
  }

  /**
   * The inspection has detected/classified this feature as defect.
   * @return IsDetectedDefect
   */
  @JsonGetter("IsDetectedDefect")
  public boolean isIsDetectedDefect() {
    return isDetectedDefect;
  }

  /**
   * This (usually defect) feature was verified (AKA &quot;classified&quot;) by a human.
   * @param isVerified the value
   */
  @JsonSetter("IsVerified")
  public Feature setIsVerified(boolean isVerified) {
    this.isVerified = isVerified;
    return this;
  }

  /**
   * This (usually defect) feature was verified (AKA &quot;classified&quot;) by a human.
   * @return IsVerified
   */
  @JsonGetter("IsVerified")
  public boolean isIsVerified() {
    return isVerified;
  }

  /**
   * The verification (AKA &quot;classification) by a human has confirmed a defect.
   * @param isVerifiedDefect the value
   */
  @JsonSetter("IsVerifiedDefect")
  public Feature setIsVerifiedDefect(boolean isVerifiedDefect) {
    this.isVerifiedDefect = isVerifiedDefect;
    return this;
  }

  /**
   * The verification (AKA &quot;classification) by a human has confirmed a defect.
   * @return IsVerifiedDefect
   */
  @JsonGetter("IsVerifiedDefect")
  public boolean isIsVerifiedDefect() {
    return isVerifiedDefect;
  }

  /**
   * The (eventual) defect was repaired successfully.
   * @param isRepaired the value
   */
  @JsonSetter("IsRepaired")
  public Feature setIsRepaired(boolean isRepaired) {
    this.isRepaired = isRepaired;
    return this;
  }

  /**
   * The (eventual) defect was repaired successfully.
   * @return IsRepaired
   */
  @JsonGetter("IsRepaired")
  public boolean isIsRepaired() {
    return isRepaired;
  }

  /**
   * List of values (of varying types).
   * @param values the value
   */
  @JsonSetter("Values")
  public Feature setValues(Value[] values) {
    this.values = values;
    return this;
  }

  /**
   * List of values (of varying types).
   * @return Values
   */
  @JsonGetter("Values")
  public Value[] getValues() {
    return values;
  }
}
