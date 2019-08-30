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
 * Describes a single, specific tool that must be setup a particular process endpoint to execute
            a particular process.  Includes the part number of the tool, along with the 
            specific location where the tool loaded (when applicable).
 * original type: CFX.Structures.ToolSetupRequirement
 */
public class ToolSetupRequirement {

  private String position;
  private String partNumber;
  private String toolIdentifier;

  /**
   * The position where the required tool must be installed on the Endpoint (optional).  
            Where applicable, a dot (&quot;.&quot;) notation should be utilized to designate 
            specific positions.  Examples:  MODULE1.BEAM1.HEADPOS2, MODULE1.NEST3.NOZZLESLOT4, etc.
   * @param position the value
   */
  @JsonSetter("Position")
  public void setPosition(String position) {
    this.position = position;
  }

  /**
   * The position where the required tool must be installed on the Endpoint (optional).  
            Where applicable, a dot (&quot;.&quot;) notation should be utilized to designate 
            specific positions.  Examples:  MODULE1.BEAM1.HEADPOS2, MODULE1.NEST3.NOZZLESLOT4, etc.
   *
   * @return never null
   */
  @JsonGetter("Position")
  public String getPosition() {
    return position == null ? "" : position;
  }

  /**
   * The internal part number of the tool that must be loaded at this position.
   * @param partNumber the value
   */
  @JsonSetter("PartNumber")
  public void setPartNumber(String partNumber) {
    this.partNumber = partNumber;
  }

  /**
   * The internal part number of the tool that must be loaded at this position.
   *
   * @return never null
   */
  @JsonGetter("PartNumber")
  public String getPartNumber() {
    return partNumber == null ? "" : partNumber;
  }

  /**
   * Optional.  If a very specific tool is required (specific serial number), the unique identifier
            of that specific tool will be provided by this property.  If any tool of a certain part number
            may be user, this property will be null.
   * @param toolIdentifier the value
   */
  @JsonSetter("ToolIdentifier")
  public void setToolIdentifier(String toolIdentifier) {
    this.toolIdentifier = toolIdentifier;
  }

  /**
   * Optional.  If a very specific tool is required (specific serial number), the unique identifier
            of that specific tool will be provided by this property.  If any tool of a certain part number
            may be user, this property will be null.
   *
   * @return never null
   */
  @JsonGetter("ToolIdentifier")
  public String getToolIdentifier() {
    return toolIdentifier == null ? "" : toolIdentifier;
  }
}
