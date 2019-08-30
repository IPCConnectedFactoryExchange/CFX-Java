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

import org.ipc.cfx.structures.geometry.Vector3;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * The root element for the CFX recipe export.
 * original type: CFX.Structures.PCBInspection.Panel
 */
public class Panel extends InspectionObject {

  private Fiducial[] fiducials;
  private Board[] boards;
  private Component[] components;
  private boolean isDefect;

  /**
   * The list of fiducials of this panel.
            (Only the top-level fiducials, not the fiducials of a board.)
   * @param fiducials the value
   */
  @JsonSetter("Fiducials")
  public void setFiducials(Fiducial[] fiducials) {
    this.fiducials = fiducials;
  }

  /**
   * The list of fiducials of this panel.
            (Only the top-level fiducials, not the fiducials of a board.)
   * @return Fiducials
   */
  @JsonGetter("Fiducials")
  public Fiducial[] getFiducials() {
    return fiducials;
  }

  /**
   * The list of boards, that are part of this panel.
            (Only the top-level boards, not the sub-boards of a top-level board.)
   * @param boards the value
   */
  @JsonSetter("Boards")
  public void setBoards(Board[] boards) {
    this.boards = boards;
  }

  /**
   * The list of boards, that are part of this panel.
            (Only the top-level boards, not the sub-boards of a top-level board.)
   * @return Boards
   */
  @JsonGetter("Boards")
  public Board[] getBoards() {
    return boards;
  }

  /**
   * List of components directly assigned to this panel, not those assigned to one of its boards.
            Usually empty (as a panel consist of n boards), but allows to omit boards and assign the components directly to the panel.
   * @param components the value
   */
  @JsonSetter("Components")
  public void setComponents(Component[] components) {
    this.components = components;
  }

  /**
   * List of components directly assigned to this panel, not those assigned to one of its boards.
            Usually empty (as a panel consist of n boards), but allows to omit boards and assign the components directly to the panel.
   * @return Components
   */
  @JsonGetter("Components")
  public Component[] getComponents() {
    return components;
  }

  /**
   * Even if a panel is defective, one of its boards can still be (and typically will be) Ok.
   * @param isDefect the value
   */
  @JsonSetter("IsDefect")
  public void setIsDefect(boolean isDefect) {
    this.isDefect = isDefect;
  }

  /**
   * Even if a panel is defective, one of its boards can still be (and typically will be) Ok.
   * @return IsDefect
   */
  @JsonGetter("IsDefect")
  public boolean isIsDefect() {
    return isDefect;
  }
  // original field: Variant
  private String variant;
  // original field: Size
  private Vector3 size;

  public String getVariant() {
    return variant == null ? "" : variant;
  }

  public void setVariant(String variant) {
      this.variant = variant;
  }

  public Vector3 getSize() {
    return size;
  }

  public void setSize(Vector3 size) {
      this.size = size;
  }
}
