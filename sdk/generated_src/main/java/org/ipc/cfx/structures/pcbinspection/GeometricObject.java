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

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import org.ipc.cfx.structures.geometry.Vector3;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * The geometry of a component (board, resistor, capacitor, pin, ...).
 * original type: CFX.Structures.PCBInspection.GeometricObject
 */
@JsonTypeInfo(use = Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "$type")
@JsonSubTypes({
  @Type(value = Board.class, name = "CFX.Structures.PCBInspection.Board, CFX"),
  @Type(value = Component.class, name = "CFX.Structures.PCBInspection.Component, CFX"),
  @Type(value = Fiducial.class, name = "CFX.Structures.PCBInspection.Fiducial, CFX"),
  @Type(value = Pin.class, name = "CFX.Structures.PCBInspection.Pin, CFX"),
})
public class GeometricObject extends InspectionObject {

  private Vector3 size;
  private Vector3 position;
  private Vector3 rotation;
  private Vector3 positionGlobal;
  private Vector3 rotationGlobal;

  /**
   * X=Width, Y=Height, Z=Depth, in mm.
   * @param size the value
   */
  @JsonSetter("Size")
  public void setSize(Vector3 size) {
    this.size = size;
  }

  /**
   * X=Width, Y=Height, Z=Depth, in mm.
   * @return Size
   */
  @JsonGetter("Size")
  public Vector3 getSize() {
    return size;
  }

  /**
   * Position of the center point of this object, relative to the center point
              of the parent object, in mm, as right handed coordinates.
   * @param position the value
   */
  @JsonSetter("Position")
  public void setPosition(Vector3 position) {
    this.position = position;
  }

  /**
   * Position of the center point of this object, relative to the center point
              of the parent object, in mm, as right handed coordinates.
   * @return Position
   */
  @JsonGetter("Position")
  public Vector3 getPosition() {
    return position;
  }

  /**
   * X=RotationAroundXAxis, Y=RotationAroundYAxis, Z=RotationAroundZAxis, in degrees [0..360]
              around the center of this object, right hand rule.
              Optional value. If missing in the RecipeBaseInfo message, then it is assumed to be (0.0, 0.0, 0.0).
   * @param rotation the value
   */
  @JsonSetter("Rotation")
  public void setRotation(Vector3 rotation) {
    this.rotation = rotation;
  }

  /**
   * X=RotationAroundXAxis, Y=RotationAroundYAxis, Z=RotationAroundZAxis, in degrees [0..360]
              around the center of this object, right hand rule.
              Optional value. If missing in the RecipeBaseInfo message, then it is assumed to be (0.0, 0.0, 0.0).
   * @return Rotation
   */
  @JsonGetter("Rotation")
  public Vector3 getRotation() {
    return rotation;
  }

  /**
   * The position in global coordinates, i.e. all position shifts and rotations of the
              parent objects (recursively) are factored in.
              Given in mm, as right handed coordinates.
   * @param positionGlobal the value
   */
  @JsonSetter("PositionGlobal")
  public void setPositionGlobal(Vector3 positionGlobal) {
    this.positionGlobal = positionGlobal;
  }

  /**
   * The position in global coordinates, i.e. all position shifts and rotations of the
              parent objects (recursively) are factored in.
              Given in mm, as right handed coordinates.
   * @return PositionGlobal
   */
  @JsonGetter("PositionGlobal")
  public Vector3 getPositionGlobal() {
    return positionGlobal;
  }

  /**
   * The global rotation, i.e. all rotations of the parent objects (recursively) factored in.
              X=RotationAroundXAxis, Y=RotationAroundYAxis, Z=RotationAroundZAxis, in degrees [0..360]
              around the center of this object, right hand rule.
   * @param rotationGlobal the value
   */
  @JsonSetter("RotationGlobal")
  public void setRotationGlobal(Vector3 rotationGlobal) {
    this.rotationGlobal = rotationGlobal;
  }

  /**
   * The global rotation, i.e. all rotations of the parent objects (recursively) factored in.
              X=RotationAroundXAxis, Y=RotationAroundYAxis, Z=RotationAroundZAxis, in degrees [0..360]
              around the center of this object, right hand rule.
   * @return RotationGlobal
   */
  @JsonGetter("RotationGlobal")
  public Vector3 getRotationGlobal() {
    return rotationGlobal;
  }
}
