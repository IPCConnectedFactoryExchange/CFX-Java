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
package org.ipc.cfx.structures.pcbinspection;

import org.ipc.cfx.structures.Recipe;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Represents a specialized type of recipe that is used to drive the inspection of
            a Printed Circuit Board (PCB) by a piece of inspection equipment (such as an AOI or SPI machine),
            or by a human inspector.
 * original type: CFX.Structures.PCBInspection.PCBInspectionRecipe
 */
public class PCBInspectionRecipe extends Recipe {

  private Panel panel;

  /**
   * A data structure representing the PCB panel that is to be inspected.  
            This could be a single PCB, an panel with multiple PCBs, or even a structure
            of PCBs containing sub-PCBs.
   * @param panel the value
   */
  @JsonSetter("Panel")
  public PCBInspectionRecipe setPanel(Panel panel) {
    this.panel = panel;
    return this;
  }

  /**
   * A data structure representing the PCB panel that is to be inspected.  
            This could be a single PCB, an panel with multiple PCBs, or even a structure
            of PCBs containing sub-PCBs.
   * @return Panel
   */
  @JsonGetter("Panel")
  public Panel getPanel() {
    return panel;
  }
}
