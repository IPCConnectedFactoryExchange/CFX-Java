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
package org.ipc.cfx.structures.smtplacement;

import org.ipc.cfx.structures.Tool;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Describes a particular nozzle and head combination that was used in the course of production.
 * original type: CFX.Structures.SMTPlacement.SMTHeadAndNozzle
 */
public class SMTHeadAndNozzle extends Tool {

  private String headId;
  private Integer headNozzleNumber;
  private String nozzleType;

  /**
   * The name or identifier of the SMT head associated with this SMT Nozzle.
   * @param headId the value
   */
  @JsonSetter("HeadId")
  public void setHeadId(String headId) {
    this.headId = headId;
  }

  /**
   * The name or identifier of the SMT head associated with this SMT Nozzle.
   *
   * @return never null
   */
  @JsonGetter("HeadId")
  public String getHeadId() {
    return headId == null ? "" : headId;
  }

  /**
   * The spindle number on the head to which this SMT Nozzle is attached
   * @param headNozzleNumber the value
   */
  @JsonSetter("HeadNozzleNumber")
  public void setHeadNozzleNumber(Integer headNozzleNumber) {
    this.headNozzleNumber = headNozzleNumber;
  }

  /**
   * The spindle number on the head to which this SMT Nozzle is attached
   * @return HeadNozzleNumber
   */
  @JsonGetter("HeadNozzleNumber")
  public Integer getHeadNozzleNumber() {
    return headNozzleNumber;
  }

  /**
   * The type or model name of this SMT Nozzle
   * @param nozzleType the value
   */
  @JsonSetter("NozzleType")
  public void setNozzleType(String nozzleType) {
    this.nozzleType = nozzleType;
  }

  /**
   * The type or model name of this SMT Nozzle
   *
   * @return never null
   */
  @JsonGetter("NozzleType")
  public String getNozzleType() {
    return nozzleType == null ? "" : nozzleType;
  }
}
