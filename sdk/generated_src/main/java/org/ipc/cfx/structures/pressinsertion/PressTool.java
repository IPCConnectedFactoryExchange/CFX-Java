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
package org.ipc.cfx.structures.pressinsertion;

import org.ipc.cfx.structures.Tool;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * 
 * original type: CFX.Structures.PressInsertion.PressTool
 */
public class PressTool extends Tool {

  private double toolDimensionX;
  private double toolDimensionY;
  private double toolDimensionZ;
  private double toolClearanceDimension;

  /**
   * The x dimension of the tool used for the pressing operation
   * @param toolDimensionX the value
   */
  @JsonSetter("ToolDimensionX")
  public PressTool setToolDimensionX(double toolDimensionX) {
    this.toolDimensionX = toolDimensionX;
    return this;
  }

  /**
   * The x dimension of the tool used for the pressing operation
   * @return ToolDimensionX
   */
  @JsonGetter("ToolDimensionX")
  public double getToolDimensionX() {
    return toolDimensionX;
  }

  /**
   * The y dimension of the tool used for the pressing operation
   * @param toolDimensionY the value
   */
  @JsonSetter("ToolDimensionY")
  public PressTool setToolDimensionY(double toolDimensionY) {
    this.toolDimensionY = toolDimensionY;
    return this;
  }

  /**
   * The y dimension of the tool used for the pressing operation
   * @return ToolDimensionY
   */
  @JsonGetter("ToolDimensionY")
  public double getToolDimensionY() {
    return toolDimensionY;
  }

  /**
   * The z dimension of the tool used for the pressing operation
   * @param toolDimensionZ the value
   */
  @JsonSetter("ToolDimensionZ")
  public PressTool setToolDimensionZ(double toolDimensionZ) {
    this.toolDimensionZ = toolDimensionZ;
    return this;
  }

  /**
   * The z dimension of the tool used for the pressing operation
   * @return ToolDimensionZ
   */
  @JsonGetter("ToolDimensionZ")
  public double getToolDimensionZ() {
    return toolDimensionZ;
  }

  /**
   * The clearance dimension of the tool used for the pressing operation
   * @param toolClearanceDimension the value
   */
  @JsonSetter("ToolClearanceDimension")
  public PressTool setToolClearanceDimension(double toolClearanceDimension) {
    this.toolClearanceDimension = toolClearanceDimension;
    return this;
  }

  /**
   * The clearance dimension of the tool used for the pressing operation
   * @return ToolClearanceDimension
   */
  @JsonGetter("ToolClearanceDimension")
  public double getToolClearanceDimension() {
    return toolClearanceDimension;
  }
}
