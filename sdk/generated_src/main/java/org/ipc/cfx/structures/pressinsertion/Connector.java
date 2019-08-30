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
package org.ipc.cfx.structures.pressinsertion;

import org.ipc.cfx.structures.Image;
import org.ipc.cfx.structures.ComponentDesignator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Describes a Pressed Connector
 * original type: CFX.Structures.PressInsertion.Connector
 */
public class Connector extends ComponentDesignator {

  private PressTool connectorTool;
  private PressProfile profileApplied;
  private int pinCount;
  private Image connectorImage;
  private double unseatedTop;
  private double seatedHeight;
  private double baseThickness;
  private boolean flatrockTooling;
  private ConnectorForces forces;
  private Manufacturer manufacturerData;
  private String group;
  private Pars parsSetting;
  private SPC sPCSetting;

  /**
   * Tool used to press this connector
   * @param connectorTool the value
   */
  @JsonSetter("ConnectorTool")
  public void setConnectorTool(PressTool connectorTool) {
    this.connectorTool = connectorTool;
  }

  /**
   * Tool used to press this connector
   * @return ConnectorTool
   */
  @JsonGetter("ConnectorTool")
  public PressTool getConnectorTool() {
    return connectorTool;
  }

  /**
   * Profile used to press this connector
   * @param profileApplied the value
   */
  @JsonSetter("ProfileApplied")
  public void setProfileApplied(PressProfile profileApplied) {
    this.profileApplied = profileApplied;
  }

  /**
   * Profile used to press this connector
   * @return ProfileApplied
   */
  @JsonGetter("ProfileApplied")
  public PressProfile getProfileApplied() {
    return profileApplied;
  }

  /**
   * The number of pins on this connector
   * @param pinCount the value
   */
  @JsonSetter("PinCount")
  public void setPinCount(int pinCount) {
    this.pinCount = pinCount;
  }

  /**
   * The number of pins on this connector
   * @return PinCount
   */
  @JsonGetter("PinCount")
  public int getPinCount() {
    return pinCount;
  }

  /**
   * The image of this connector
   * @param connectorImage the value
   */
  @JsonSetter("ConnectorImage")
  public void setConnectorImage(Image connectorImage) {
    this.connectorImage = connectorImage;
  }

  /**
   * The image of this connector
   * @return ConnectorImage
   */
  @JsonGetter("ConnectorImage")
  public Image getConnectorImage() {
    return connectorImage;
  }

  /**
   * The dimesion of the top of the connector from the top of the board when the connector is not seated
   * @param unseatedTop the value
   */
  @JsonSetter("UnseatedTop")
  public void setUnseatedTop(double unseatedTop) {
    this.unseatedTop = unseatedTop;
  }

  /**
   * The dimesion of the top of the connector from the top of the board when the connector is not seated
   * @return UnseatedTop
   */
  @JsonGetter("UnseatedTop")
  public double getUnseatedTop() {
    return unseatedTop;
  }

  /**
   * The dimesion of the top of the connector from the top of the board when the connector is seated
   * @param seatedHeight the value
   */
  @JsonSetter("SeatedHeight")
  public void setSeatedHeight(double seatedHeight) {
    this.seatedHeight = seatedHeight;
  }

  /**
   * The dimesion of the top of the connector from the top of the board when the connector is seated
   * @return SeatedHeight
   */
  @JsonGetter("SeatedHeight")
  public double getSeatedHeight() {
    return seatedHeight;
  }

  /**
   * The thickness of the connector
   * @param baseThickness the value
   */
  @JsonSetter("BaseThickness")
  public void setBaseThickness(double baseThickness) {
    this.baseThickness = baseThickness;
  }

  /**
   * The thickness of the connector
   * @return BaseThickness
   */
  @JsonGetter("BaseThickness")
  public double getBaseThickness() {
    return baseThickness;
  }

  /**
   * Value to signfiy if the connector requires flatrock tooling (tooling that does not have openings for the pins)
   * @param flatrockTooling the value
   */
  @JsonSetter("FlatrockTooling")
  public void setFlatrockTooling(boolean flatrockTooling) {
    this.flatrockTooling = flatrockTooling;
  }

  /**
   * Value to signfiy if the connector requires flatrock tooling (tooling that does not have openings for the pins)
   * @return FlatrockTooling
   */
  @JsonGetter("FlatrockTooling")
  public boolean isFlatrockTooling() {
    return flatrockTooling;
  }

  /**
   * Value to signfiy if the connector requires flatrock tooling (tooling that does not have openings for the pins)
   * @param forces the value
   */
  @JsonSetter("Forces")
  public void setForces(ConnectorForces forces) {
    this.forces = forces;
  }

  /**
   * Value to signfiy if the connector requires flatrock tooling (tooling that does not have openings for the pins)
   * @return Forces
   */
  @JsonGetter("Forces")
  public ConnectorForces getForces() {
    return forces;
  }

  /**
   * Manufactuer of the connector
   * @param manufacturerData the value
   */
  @JsonSetter("ManufacturerData")
  public void setManufacturerData(Manufacturer manufacturerData) {
    this.manufacturerData = manufacturerData;
  }

  /**
   * Manufactuer of the connector
   * @return ManufacturerData
   */
  @JsonGetter("ManufacturerData")
  public Manufacturer getManufacturerData() {
    return manufacturerData;
  }

  /**
   * Group identifier of the connector
   * @param group the value
   */
  @JsonSetter("Group")
  public void setGroup(String group) {
    this.group = group;
  }

  /**
   * Group identifier of the connector
   *
   * @return never null
   */
  @JsonGetter("Group")
  public String getGroup() {
    return group == null ? "" : group;
  }

  /**
   * Gets or sets the pars setting.
   * @param parsSetting the value
   */
  @JsonSetter("ParsSetting")
  public void setParsSetting(Pars parsSetting) {
    this.parsSetting = parsSetting;
  }

  /**
   * Gets or sets the pars setting.
   * @return ParsSetting
   */
  @JsonGetter("ParsSetting")
  public Pars getParsSetting() {
    return parsSetting;
  }

  /**
   * Gets or sets the SPC setting.
   * @param sPCSetting the value
   */
  @JsonSetter("SPCSetting")
  public void setSPCSetting(SPC sPCSetting) {
    this.sPCSetting = sPCSetting;
  }

  /**
   * Gets or sets the SPC setting.
   * @return SPCSetting
   */
  @JsonGetter("SPCSetting")
  public SPC getSPCSetting() {
    return sPCSetting;
  }
}
