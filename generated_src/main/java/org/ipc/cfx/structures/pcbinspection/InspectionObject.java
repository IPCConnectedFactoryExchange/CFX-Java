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
   */
  @JsonSetter("Parent")
  public void setParent(org.ipc.cfx.structures.pcbinspection.InspectionObject parent) {
    this.parent = parent;
  }

  /**
   * Reference to the parent inspection object. Allows to calculate the absolute position and rotation.
   */
  @JsonGetter("Parent")
  public org.ipc.cfx.structures.pcbinspection.InspectionObject getParent() {
    return parent;
  }

  /**
   * Features to check during inspection, like "Presence", "Displacement", "Height".
   */
  @JsonSetter("Features")
  public void setFeatures(Feature[] features) {
    this.features = features;
  }

  /**
   * Features to check during inspection, like "Presence", "Displacement", "Height".
   */
  @JsonGetter("Features")
  public Feature[] getFeatures() {
    return features;
  }

  /**
   * The inspection object was detected as defect.
   */
  @JsonSetter("IsDefect")
  public void setIsDefect(boolean isDefect) {
    this.isDefect = isDefect;
  }

  /**
   * The inspection object was detected as defect.
   */
  @JsonGetter("IsDefect")
  public boolean isIsDefect() {
    return isDefect;
  }

  /**
   * The inspection object as a whole was repaired. (E.g. by replacing the whole component.)
   */
  @JsonSetter("IsRepaired")
  public void setIsRepaired(boolean isRepaired) {
    this.isRepaired = isRepaired;
  }

  /**
   * The inspection object as a whole was repaired. (E.g. by replacing the whole component.)
   */
  @JsonGetter("IsRepaired")
  public boolean isIsRepaired() {
    return isRepaired;
  }
}
