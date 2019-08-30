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

import org.ipc.cfx.structures.solderpasteprinting.SMTSqueegeeCleanType;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Allows an external source to direct a request to a stencil printer
            to perform a squeegee clean operation
            
            {
              &quot;CleanTypeRequested&quot;: &quot;Deep&quot;
            }
 * original type: CFX.ResourcePerformance.SolderPastePrinting.CleanSqueegeeRequest
 */
public class CleanSqueegeeRequest extends CFXMessage {

  private SMTSqueegeeCleanType cleanTypeRequested;

  /**
   * An enumeration indicating the type of clean operation that is
            being requested
   * @param cleanTypeRequested the value
   */
  @JsonSetter("CleanTypeRequested")
  public void setCleanTypeRequested(SMTSqueegeeCleanType cleanTypeRequested) {
    this.cleanTypeRequested = cleanTypeRequested;
  }

  /**
   * An enumeration indicating the type of clean operation that is
            being requested
   * @return CleanTypeRequested
   */
  @JsonGetter("CleanTypeRequested")
  public SMTSqueegeeCleanType getCleanTypeRequested() {
    return cleanTypeRequested;
  }
}
