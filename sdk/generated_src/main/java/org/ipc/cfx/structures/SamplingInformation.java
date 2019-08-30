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
 * Describes the sampling strategy to be employed on a particular lot of material / units during test or inspection
 * original type: CFX.Structures.SamplingInformation
 */
public class SamplingInformation {

  private SamplingMethod samplingMethod;
  private Double lotSize;
  private Double sampleSize;

  /**
   * An enumeration describing the sampling method that was employed (if any)
   * @param samplingMethod the value
   */
  @JsonSetter("SamplingMethod")
  public void setSamplingMethod(SamplingMethod samplingMethod) {
    this.samplingMethod = samplingMethod;
  }

  /**
   * An enumeration describing the sampling method that was employed (if any)
   * @return SamplingMethod
   */
  @JsonGetter("SamplingMethod")
  public SamplingMethod getSamplingMethod() {
    return samplingMethod;
  }

  /**
   * The total number of units in the lot
   * @param lotSize the value
   */
  @JsonSetter("LotSize")
  public void setLotSize(Double lotSize) {
    this.lotSize = lotSize;
  }

  /**
   * The total number of units in the lot
   * @return LotSize
   */
  @JsonGetter("LotSize")
  public Double getLotSize() {
    return lotSize;
  }

  /**
   * The number of units from the total lot to be inspected / tested.  
            This is a subset of the total lot.
   * @param sampleSize the value
   */
  @JsonSetter("SampleSize")
  public void setSampleSize(Double sampleSize) {
    this.sampleSize = sampleSize;
  }

  /**
   * The number of units from the total lot to be inspected / tested.  
            This is a subset of the total lot.
   * @return SampleSize
   */
  @JsonGetter("SampleSize")
  public Double getSampleSize() {
    return sampleSize;
  }
}
