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
  public Connector setConnectorTool(PressTool connectorTool) {
    this.connectorTool = connectorTool;
    return this;
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
  public Connector setProfileApplied(PressProfile profileApplied) {
    this.profileApplied = profileApplied;
    return this;
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
  public Connector setPinCount(int pinCount) {
    this.pinCount = pinCount;
    return this;
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
  public Connector setConnectorImage(Image connectorImage) {
    this.connectorImage = connectorImage;
    return this;
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
  public Connector setUnseatedTop(double unseatedTop) {
    this.unseatedTop = unseatedTop;
    return this;
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
  public Connector setSeatedHeight(double seatedHeight) {
    this.seatedHeight = seatedHeight;
    return this;
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
  public Connector setBaseThickness(double baseThickness) {
    this.baseThickness = baseThickness;
    return this;
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
  public Connector setFlatrockTooling(boolean flatrockTooling) {
    this.flatrockTooling = flatrockTooling;
    return this;
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
  public Connector setForces(ConnectorForces forces) {
    this.forces = forces;
    return this;
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
  public Connector setManufacturerData(Manufacturer manufacturerData) {
    this.manufacturerData = manufacturerData;
    return this;
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
  public Connector setGroup(String group) {
    this.group = group;
    return this;
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
  public Connector setParsSetting(Pars parsSetting) {
    this.parsSetting = parsSetting;
    return this;
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
  public Connector setSPCSetting(SPC sPCSetting) {
    this.sPCSetting = sPCSetting;
    return this;
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
