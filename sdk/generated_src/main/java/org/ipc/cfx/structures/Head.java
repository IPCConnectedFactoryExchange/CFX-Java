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
package org.ipc.cfx.structures;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Represents a generic head on an automated endpoint.  This is the base class of a dynamic structure, permitting
            for specialized heads derived from this class.  Examples of heads are SMT placement heads used in the placement
            of electronic components on PCB&apos;s, or a dispensing head, used in the dispensing of fluids or glues.
 * original type: CFX.Structures.Head
 */
public class Head {

  private String headId;
  private int headSequence;
  private String headName;

  /**
   * A unique identifier describing this particular head instance.  Typically,
            this identifier is barcoded or otherwise labeled on the head.
   * @param headId the value
   */
  @JsonSetter("HeadId")
  public Head setHeadId(String headId) {
    this.headId = headId;
    return this;
  }

  /**
   * A unique identifier describing this particular head instance.  Typically,
            this identifier is barcoded or otherwise labeled on the head.
   *
   * @return never null
   */
  @JsonGetter("HeadId")
  public String getHeadId() {
    return headId == null ? "" : headId;
  }

  /**
   * Sequence of this head in the machine
   * @param headSequence the value
   */
  @JsonSetter("HeadSequence")
  public Head setHeadSequence(int headSequence) {
    this.headSequence = headSequence;
    return this;
  }

  /**
   * Sequence of this head in the machine
   * @return HeadSequence
   */
  @JsonGetter("HeadSequence")
  public int getHeadSequence() {
    return headSequence;
  }

  /**
   * A friendly name for this head
   * @param headName the value
   */
  @JsonSetter("HeadName")
  public Head setHeadName(String headName) {
    this.headName = headName;
    return this;
  }

  /**
   * A friendly name for this head
   *
   * @return never null
   */
  @JsonGetter("HeadName")
  public String getHeadName() {
    return headName == null ? "" : headName;
  }
}
