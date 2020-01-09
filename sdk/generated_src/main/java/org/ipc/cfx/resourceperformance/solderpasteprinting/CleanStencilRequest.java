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
package org.ipc.cfx.resourceperformance.solderpasteprinting;

import org.ipc.cfx.structures.solderpasteprinting.SMTStencilCleanMode;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Allows an external source to direct a request to a stencil printer
            to perform a stencil clean operation
            
            {
              &quot;CleanTypeRequested&quot;: &quot;D&quot;
            }
 * original type: CFX.ResourcePerformance.SolderPastePrinting.CleanStencilRequest
 */
public class CleanStencilRequest extends CFXMessage {

  private SMTStencilCleanMode cleanTypeRequested;

  /**
   * An enumeration indicating the type of clean operation that is
            being requested
   * @param cleanTypeRequested the value
   */
  @JsonSetter("CleanTypeRequested")
  public CleanStencilRequest setCleanTypeRequested(SMTStencilCleanMode cleanTypeRequested) {
    this.cleanTypeRequested = cleanTypeRequested;
    return this;
  }

  /**
   * An enumeration indicating the type of clean operation that is
            being requested
   * @return CleanTypeRequested
   */
  @JsonGetter("CleanTypeRequested")
  public SMTStencilCleanMode getCleanTypeRequested() {
    return cleanTypeRequested;
  }
}
