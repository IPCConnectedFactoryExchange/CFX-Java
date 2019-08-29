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

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * A board typically is part of a (multi-)panel and may contain fiducials, components
              (an even sub-boards).
              It is an inspection object itself, too (with features on its own).
 * original type: CFX.Structures.PCBInspection.Board
 */
public class Board extends GeometricObject {

  private Fiducial[] fiducials;
  private Component[] components;
  private boolean isDefect;

  /**
   * This is a list of fiducials.
   */
  @JsonSetter("Fiducials")
  public void setFiducials(Fiducial[] fiducials) {
    this.fiducials = fiducials;
  }

  /**
   * This is a list of fiducials.
   */
  @JsonGetter("Fiducials")
  public Fiducial[] getFiducials() {
    return fiducials;
  }

  /**
   * This is the list of components in the board definition.
   */
  @JsonSetter("Components")
  public void setComponents(Component[] components) {
    this.components = components;
  }

  /**
   * This is the list of components in the board definition.
   */
  @JsonGetter("Components")
  public Component[] getComponents() {
    return components;
  }

  /**
   * A board is considered defect if there is a defect in (the features / checks of) the board itself
            or in one of it components, fiducials, or sub-boards.
   */
  @JsonSetter("IsDefect")
  public void setIsDefect(boolean isDefect) {
    this.isDefect = isDefect;
  }

  /**
   * A board is considered defect if there is a defect in (the features / checks of) the board itself
            or in one of it components, fiducials, or sub-boards.
   */
  @JsonGetter("IsDefect")
  public boolean isIsDefect() {
    return isDefect;
  }
  // original field: Boards
  private Board[] boards;

  public Board[] getBoards() {
    return boards;
  }

  public void setBoards(Board[] boards) {
      this.boards = boards;
  }
}
