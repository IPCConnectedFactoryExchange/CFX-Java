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
package org.ipc.cfx.structures.pcbinspection;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * A component as a resistor, capacitor, IC, ...
              Typically has (two or more) pins (as its &quot;children&quot;).
 * original type: CFX.Structures.PCBInspection.Component
 */
public class Component extends GeometricObject {

  private String type;
  private String group;
  private Pin[] pins;
  private boolean isDefect;

  /**
   * Component type, e.g. &quot;C1206&quot;, &quot;R1206&quot;, &quot;TO252AA&quot;.
   * @param type the value
   */
  @JsonSetter("Type")
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Component type, e.g. &quot;C1206&quot;, &quot;R1206&quot;, &quot;TO252AA&quot;.
   *
   * @return never null
   */
  @JsonGetter("Type")
  public String getType() {
    return type == null ? "" : type;
  }

  /**
   * Group of component classification like &quot;Capacitor&quot;, &quot;Resistor&quot;, &quot;DPAK&quot;.
   * @param group the value
   */
  @JsonSetter("Group")
  public void setGroup(String group) {
    this.group = group;
  }

  /**
   * Group of component classification like &quot;Capacitor&quot;, &quot;Resistor&quot;, &quot;DPAK&quot;.
   *
   * @return never null
   */
  @JsonGetter("Group")
  public String getGroup() {
    return group == null ? "" : group;
  }

  /**
   * List of Pins of this component.
   * @param pins the value
   */
  @JsonSetter("Pins")
  public void setPins(Pin[] pins) {
    this.pins = pins;
  }

  /**
   * List of Pins of this component.
   * @return Pins
   */
  @JsonGetter("Pins")
  public Pin[] getPins() {
    return pins;
  }

  /**
   * Checks if this component (or one of its pins) is defect.
   * @param isDefect the value
   */
  @JsonSetter("IsDefect")
  public void setIsDefect(boolean isDefect) {
    this.isDefect = isDefect;
  }

  /**
   * Checks if this component (or one of its pins) is defect.
   * @return IsDefect
   */
  @JsonGetter("IsDefect")
  public boolean isIsDefect() {
    return isDefect;
  }
}
