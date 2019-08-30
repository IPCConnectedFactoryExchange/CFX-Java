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

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Describes addition detail for material packages containing moisture 
            sensitive devices
 * original type: CFX.Structures.MaterialPackageMSDData
 */
public class MaterialPackageMSDData extends MaterialPackageData {

  private Date expirationDateTime;
  private Date originalExposureDateTime;
  private Date lastExposureDateTime;
  private Long remainingExposureTime;
  private MSDLevel mSDLevel;
  private MSDState mSDState;

  /**
   * In the case where the MSD material is open and currently exposed to the
            environment, the date / time when the MSD material will expire rendering it
            no longer able to be used in production.  Otherwise null.
   * @param expirationDateTime the value
   */
  @JsonSetter("ExpirationDateTime")
  public void setExpirationDateTime(Date expirationDateTime) {
    this.expirationDateTime = expirationDateTime;
  }

  /**
   * In the case where the MSD material is open and currently exposed to the
            environment, the date / time when the MSD material will expire rendering it
            no longer able to be used in production.  Otherwise null.
   * @return ExpirationDateTime
   */
  @JsonGetter("ExpirationDateTime")
  public Date getExpirationDateTime() {
    return expirationDateTime;
  }

  /**
   * The date / time when this MSD material was originally opened and exposed to
            the environment
   * @param originalExposureDateTime the value
   */
  @JsonSetter("OriginalExposureDateTime")
  public void setOriginalExposureDateTime(Date originalExposureDateTime) {
    this.originalExposureDateTime = originalExposureDateTime;
  }

  /**
   * The date / time when this MSD material was originally opened and exposed to
            the environment
   * @return OriginalExposureDateTime
   */
  @JsonGetter("OriginalExposureDateTime")
  public Date getOriginalExposureDateTime() {
    return originalExposureDateTime;
  }

  /**
   * In the case where the MSD material is open and currently exposed to the environment,
            the date / time when the material was most recently opened and/or exposed.  Otherwise null.
   * @param lastExposureDateTime the value
   */
  @JsonSetter("LastExposureDateTime")
  public void setLastExposureDateTime(Date lastExposureDateTime) {
    this.lastExposureDateTime = lastExposureDateTime;
  }

  /**
   * In the case where the MSD material is open and currently exposed to the environment,
            the date / time when the material was most recently opened and/or exposed.  Otherwise null.
   * @return LastExposureDateTime
   */
  @JsonGetter("LastExposureDateTime")
  public Date getLastExposureDateTime() {
    return lastExposureDateTime;
  }

  /**
   * The total amount of time before the MSD expires, rendering it unable to be used in production
            (assuming the material is open and exposed to the environment)
   * @param remainingExposureTime the value
   */
  @JsonSetter("RemainingExposureTime")
  public void setRemainingExposureTime(Long remainingExposureTime) {
    this.remainingExposureTime = remainingExposureTime;
  }

  /**
   * The total amount of time before the MSD expires, rendering it unable to be used in production
            (assuming the material is open and exposed to the environment)
   * @return RemainingExposureTime
   */
  @JsonGetter("RemainingExposureTime")
  public Long getRemainingExposureTime() {
    return remainingExposureTime;
  }

  /**
   * The level of moisture sensitivity (as defined by IPC/JEDEC J-STD-033C)
   * @param mSDLevel the value
   */
  @JsonSetter("MSDLevel")
  public void setMSDLevel(MSDLevel mSDLevel) {
    this.mSDLevel = mSDLevel;
  }

  /**
   * The level of moisture sensitivity (as defined by IPC/JEDEC J-STD-033C)
   * @return MSDLevel
   */
  @JsonGetter("MSDLevel")
  public MSDLevel getMSDLevel() {
    return mSDLevel;
  }

  /**
   * An enumeration describing the current state of this MSD material
   * @param mSDState the value
   */
  @JsonSetter("MSDState")
  public void setMSDState(MSDState mSDState) {
    this.mSDState = mSDState;
  }

  /**
   * An enumeration describing the current state of this MSD material
   * @return MSDState
   */
  @JsonGetter("MSDState")
  public MSDState getMSDState() {
    return mSDState;
  }
}
