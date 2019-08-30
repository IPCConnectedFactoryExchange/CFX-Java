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
package org.ipc.cfx.resourceperformance.solderpasteprinting;

import org.ipc.cfx.structures.solderpasteprinting.SMTStencil;
import org.ipc.cfx.structures.solderpasteprinting.SMTStencilCleanMode;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Indicates that a stencil clean operation has been performed
            
            {
              &quot;Stencil&quot;: {
                &quot;UniqueIdentifier&quot;: &quot;UID23432434&quot;,
                &quot;Name&quot;: &quot;STENCIL234343&quot;
              },
              &quot;StencilCleanMode&quot;: &quot;V&quot;,
              &quot;TimeSinceLastClean&quot;: &quot;00:33:00&quot;,
              &quot;CyclesSinceLastClean&quot;: 35,
              &quot;StencilCleanCycles&quot;: 2,
              &quot;StencilCleanTime&quot;: &quot;00:00:38&quot;
            }
 * original type: CFX.ResourcePerformance.SolderPastePrinting.StencilCleaned
 */
public class StencilCleaned extends CFXMessage {

  private SMTStencil stencil;
  private SMTStencilCleanMode stencilCleanMode;
  private long timeSinceLastClean;
  private int cyclesSinceLastClean;
  private int stencilCleanCycles;
  private long stencilCleanTime;

  /**
   * Identifies the stencil that has been cleaned
   * @param stencil the value
   */
  @JsonSetter("Stencil")
  public void setStencil(SMTStencil stencil) {
    this.stencil = stencil;
  }

  /**
   * Identifies the stencil that has been cleaned
   * @return Stencil
   */
  @JsonGetter("Stencil")
  public SMTStencil getStencil() {
    return stencil;
  }

  /**
   * Indicates that cleaning mode for the stencil clean operation
   * @param stencilCleanMode the value
   */
  @JsonSetter("StencilCleanMode")
  public void setStencilCleanMode(SMTStencilCleanMode stencilCleanMode) {
    this.stencilCleanMode = stencilCleanMode;
  }

  /**
   * Indicates that cleaning mode for the stencil clean operation
   * @return StencilCleanMode
   */
  @JsonGetter("StencilCleanMode")
  public SMTStencilCleanMode getStencilCleanMode() {
    return stencilCleanMode;
  }

  /**
   * Indicates the length of time that has ellapsed since the last time
            the stencil was cleaned
   * @param timeSinceLastClean the value
   */
  @JsonSetter("TimeSinceLastClean")
  public void setTimeSinceLastClean(long timeSinceLastClean) {
    this.timeSinceLastClean = timeSinceLastClean;
  }

  /**
   * Indicates the length of time that has ellapsed since the last time
            the stencil was cleaned
   * @return TimeSinceLastClean
   */
  @JsonGetter("TimeSinceLastClean")
  public long getTimeSinceLastClean() {
    return timeSinceLastClean;
  }

  /**
   * Indicates how many printing cycles have been completed since the last
            time the stencil was cleaned
   * @param cyclesSinceLastClean the value
   */
  @JsonSetter("CyclesSinceLastClean")
  public void setCyclesSinceLastClean(int cyclesSinceLastClean) {
    this.cyclesSinceLastClean = cyclesSinceLastClean;
  }

  /**
   * Indicates how many printing cycles have been completed since the last
            time the stencil was cleaned
   * @return CyclesSinceLastClean
   */
  @JsonGetter("CyclesSinceLastClean")
  public int getCyclesSinceLastClean() {
    return cyclesSinceLastClean;
  }

  /**
   * Indicates the total number of stencil cleaning cycles that
            have been performed since this squeegee was loaded.
   * @param stencilCleanCycles the value
   */
  @JsonSetter("StencilCleanCycles")
  public void setStencilCleanCycles(int stencilCleanCycles) {
    this.stencilCleanCycles = stencilCleanCycles;
  }

  /**
   * Indicates the total number of stencil cleaning cycles that
            have been performed since this squeegee was loaded.
   * @return StencilCleanCycles
   */
  @JsonGetter("StencilCleanCycles")
  public int getStencilCleanCycles() {
    return stencilCleanCycles;
  }

  /**
   * Indicates the total amount of time that it took to perform this stencil clean operation
   * @param stencilCleanTime the value
   */
  @JsonSetter("StencilCleanTime")
  public void setStencilCleanTime(long stencilCleanTime) {
    this.stencilCleanTime = stencilCleanTime;
  }

  /**
   * Indicates the total amount of time that it took to perform this stencil clean operation
   * @return StencilCleanTime
   */
  @JsonGetter("StencilCleanTime")
  public long getStencilCleanTime() {
    return stencilCleanTime;
  }
}
