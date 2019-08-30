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
 * 
 * original type: CFX.Structures.ToolUsed
 */
public class ToolUsed {

  private String unitIdentifier;
  private Integer unitPositionNumber;
  private Tool tool;
  private int usageCycles;
  private InstalledComponent[] installedComponents;

  /**
   * 
   * @param unitIdentifier the value
   */
  @JsonSetter("UnitIdentifier")
  public void setUnitIdentifier(String unitIdentifier) {
    this.unitIdentifier = unitIdentifier;
  }

  /**
   * 
   *
   * @return never null
   */
  @JsonGetter("UnitIdentifier")
  public String getUnitIdentifier() {
    return unitIdentifier == null ? "" : unitIdentifier;
  }

  /**
   * 
   * @param unitPositionNumber the value
   */
  @JsonSetter("UnitPositionNumber")
  public void setUnitPositionNumber(Integer unitPositionNumber) {
    this.unitPositionNumber = unitPositionNumber;
  }

  /**
   * 
   * @return UnitPositionNumber
   */
  @JsonGetter("UnitPositionNumber")
  public Integer getUnitPositionNumber() {
    return unitPositionNumber;
  }

  /**
   * 
   * @param tool the value
   */
  @JsonSetter("Tool")
  public void setTool(Tool tool) {
    this.tool = tool;
  }

  /**
   * 
   * @return Tool
   */
  @JsonGetter("Tool")
  public Tool getTool() {
    return tool;
  }

  /**
   * 
   * @param usageCycles the value
   */
  @JsonSetter("UsageCycles")
  public void setUsageCycles(int usageCycles) {
    this.usageCycles = usageCycles;
  }

  /**
   * 
   * @return UsageCycles
   */
  @JsonGetter("UsageCycles")
  public int getUsageCycles() {
    return usageCycles;
  }

  /**
   * 
   * @param installedComponents the value
   */
  @JsonSetter("InstalledComponents")
  public void setInstalledComponents(InstalledComponent[] installedComponents) {
    this.installedComponents = installedComponents;
  }

  /**
   * 
   * @return InstalledComponents
   */
  @JsonGetter("InstalledComponents")
  public InstalledComponent[] getInstalledComponents() {
    return installedComponents;
  }
}
