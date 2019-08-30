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
package org.ipc.cfx.structures;

import java.util.Date;
import org.ipc.cfx.structures.smtplacement.SMTInstalledComponent;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Describes a particular location on a production unit where materials / parts were installed.
 * original type: CFX.Structures.InstalledComponent
 */
@JsonTypeInfo(use = Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "$type")
@JsonSubTypes({
  @Type(value = SMTInstalledComponent.class, name = "CFX.Structures.SMTPlacement.SMTInstalledComponent, CFX"),
})
public class InstalledComponent {

  private String referenceDesignator;
  private Date installationTime;
  private ComponentElectricalTest electricalTest;

  /**
   * Location on production unit where material / parts were installed
   * @param referenceDesignator the value
   */
  @JsonSetter("ReferenceDesignator")
  public void setReferenceDesignator(String referenceDesignator) {
    this.referenceDesignator = referenceDesignator;
  }

  /**
   * Location on production unit where material / parts were installed
   *
   * @return never null
   */
  @JsonGetter("ReferenceDesignator")
  public String getReferenceDesignator() {
    return referenceDesignator == null ? "" : referenceDesignator;
  }

  /**
   * The specific time when this material / part was installed on the production unit (optional, when known)
   * @param installationTime the value
   */
  @JsonSetter("InstallationTime")
  public void setInstallationTime(Date installationTime) {
    this.installationTime = installationTime;
  }

  /**
   * The specific time when this material / part was installed on the production unit (optional, when known)
   * @return InstallationTime
   */
  @JsonGetter("InstallationTime")
  public Date getInstallationTime() {
    return installationTime;
  }

  /**
   * The electrical test result of this component (optional)
   * @param electricalTest the value
   */
  @JsonSetter("ElectricalTest")
  public void setElectricalTest(ComponentElectricalTest electricalTest) {
    this.electricalTest = electricalTest;
  }

  /**
   * The electrical test result of this component (optional)
   * @return ElectricalTest
   */
  @JsonGetter("ElectricalTest")
  public ComponentElectricalTest getElectricalTest() {
    return electricalTest;
  }
}
