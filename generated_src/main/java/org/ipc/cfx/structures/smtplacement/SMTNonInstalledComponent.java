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
package org.ipc.cfx.structures.smtplacement;

import org.ipc.cfx.structures.NonInstalledComponent;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Describes a particular NonInstalledComponent for SMT Placement
 * original type: CFX.Structures.SMTPlacement.SMTNonInstalledComponent
 */
public class SMTNonInstalledComponent extends NonInstalledComponent {

  private SMTHeadAndNozzle headAndNozzle;

  /**
   * The particular Head / Nozzle with which the component has not been installed
   */
  @JsonSetter("HeadAndNozzle")
  public void setHeadAndNozzle(SMTHeadAndNozzle headAndNozzle) {
    this.headAndNozzle = headAndNozzle;
  }

  /**
   * The particular Head / Nozzle with which the component has not been installed
   */
  @JsonGetter("HeadAndNozzle")
  public SMTHeadAndNozzle getHeadAndNozzle() {
    return headAndNozzle;
  }
}