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

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Describes the coordinates of a connector's location on a PCB
 * original type: CFX.Structures.PressInsertion.ConnectorCoordinates
 */
public class ConnectorCoordinates {

  private double xPosition;
  private double yPosition;

  /**
   * The X position of the connector
   */
  @JsonSetter("XPosition")
  public void setXPosition(double xPosition) {
    this.xPosition = xPosition;
  }

  /**
   * The X position of the connector
   */
  @JsonGetter("XPosition")
  public double getXPosition() {
    return xPosition;
  }

  /**
   * The Y position of the connector
   */
  @JsonSetter("YPosition")
  public void setYPosition(double yPosition) {
    this.yPosition = yPosition;
  }

  /**
   * The Y position of the connector
   */
  @JsonGetter("YPosition")
  public double getYPosition() {
    return yPosition;
  }
}
