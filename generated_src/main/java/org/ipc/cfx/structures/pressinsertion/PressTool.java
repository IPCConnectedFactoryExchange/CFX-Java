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
 * created: 20.08.2019 15:52:37 by frankp
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
   */
  @JsonSetter("ToolDimensionX")
  public void setToolDimensionX(double toolDimensionX) {
    this.toolDimensionX = toolDimensionX;
  }

  /**
   * The x dimension of the tool used for the pressing operation
   */
  @JsonGetter("ToolDimensionX")
  public double getToolDimensionX() {
    return toolDimensionX;
  }

  /**
   * The y dimension of the tool used for the pressing operation
   */
  @JsonSetter("ToolDimensionY")
  public void setToolDimensionY(double toolDimensionY) {
    this.toolDimensionY = toolDimensionY;
  }

  /**
   * The y dimension of the tool used for the pressing operation
   */
  @JsonGetter("ToolDimensionY")
  public double getToolDimensionY() {
    return toolDimensionY;
  }

  /**
   * The z dimension of the tool used for the pressing operation
   */
  @JsonSetter("ToolDimensionZ")
  public void setToolDimensionZ(double toolDimensionZ) {
    this.toolDimensionZ = toolDimensionZ;
  }

  /**
   * The z dimension of the tool used for the pressing operation
   */
  @JsonGetter("ToolDimensionZ")
  public double getToolDimensionZ() {
    return toolDimensionZ;
  }

  /**
   * The clearance dimension of the tool used for the pressing operation
   */
  @JsonSetter("ToolClearanceDimension")
  public void setToolClearanceDimension(double toolClearanceDimension) {
    this.toolClearanceDimension = toolClearanceDimension;
  }

  /**
   * The clearance dimension of the tool used for the pressing operation
   */
  @JsonGetter("ToolClearanceDimension")
  public double getToolClearanceDimension() {
    return toolClearanceDimension;
  }
}
