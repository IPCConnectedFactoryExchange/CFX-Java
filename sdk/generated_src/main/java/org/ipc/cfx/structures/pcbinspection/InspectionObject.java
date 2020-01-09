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

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import org.ipc.cfx.structures.NamedObject;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Representing a physical object (panel, board, component, fiducial, pin) with features to check
              during inspection.
 * original type: CFX.Structures.PCBInspection.InspectionObject
 */
@JsonTypeInfo(use = Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "$type")
@JsonSubTypes({
  @Type(value = GeometricObject.class, name = "CFX.Structures.PCBInspection.GeometricObject, CFX"),
  @Type(value = Panel.class, name = "CFX.Structures.PCBInspection.Panel, CFX"),
})
public class InspectionObject extends NamedObject {

  private org.ipc.cfx.structures.pcbinspection.InspectionObject parent;
  private Feature[] features;
  private boolean isDefect;
  private boolean isRepaired;

  /**
   * Reference to the parent inspection object. Allows to calculate the absolute position and rotation.
   * @param parent the value
   */
  @JsonSetter("Parent")
  public InspectionObject setParent(org.ipc.cfx.structures.pcbinspection.InspectionObject parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Reference to the parent inspection object. Allows to calculate the absolute position and rotation.
   * @return Parent
   */
  @JsonGetter("Parent")
  public org.ipc.cfx.structures.pcbinspection.InspectionObject getParent() {
    return parent;
  }

  /**
   * Features to check during inspection, like &quot;Presence&quot;, &quot;Displacement&quot;, &quot;Height&quot;.
   * @param features the value
   */
  @JsonSetter("Features")
  public InspectionObject setFeatures(Feature[] features) {
    this.features = features;
    return this;
  }

  /**
   * Features to check during inspection, like &quot;Presence&quot;, &quot;Displacement&quot;, &quot;Height&quot;.
   * @return Features
   */
  @JsonGetter("Features")
  public Feature[] getFeatures() {
    return features;
  }

  /**
   * The inspection object was detected as defect.
   * @param isDefect the value
   */
  @JsonSetter("IsDefect")
  public InspectionObject setIsDefect(boolean isDefect) {
    this.isDefect = isDefect;
    return this;
  }

  /**
   * The inspection object was detected as defect.
   * @return IsDefect
   */
  @JsonGetter("IsDefect")
  public boolean isIsDefect() {
    return isDefect;
  }

  /**
   * The inspection object as a whole was repaired. (E.g. by replacing the whole component.)
   * @param isRepaired the value
   */
  @JsonSetter("IsRepaired")
  public InspectionObject setIsRepaired(boolean isRepaired) {
    this.isRepaired = isRepaired;
    return this;
  }

  /**
   * The inspection object as a whole was repaired. (E.g. by replacing the whole component.)
   * @return IsRepaired
   */
  @JsonGetter("IsRepaired")
  public boolean isIsRepaired() {
    return isRepaired;
  }
}
