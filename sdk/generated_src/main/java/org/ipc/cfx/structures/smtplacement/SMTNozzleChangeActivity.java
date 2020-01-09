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
package org.ipc.cfx.structures.smtplacement;

import org.ipc.cfx.structures.Activity;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * A specialized type of Activity that occurs when a unit is loaded into an endpoint.
 * original type: CFX.Structures.SMTPlacement.SMTNozzleChangeActivity
 */
public class SMTNozzleChangeActivity extends Activity {

  private SMTHeadAndNozzle[] oldNozzles;
  private SMTHeadAndNozzle[] newNozzles;

  /**
   * The nozzles that were removed (if known)
   * @param oldNozzles the value
   */
  @JsonSetter("OldNozzles")
  public SMTNozzleChangeActivity setOldNozzles(SMTHeadAndNozzle[] oldNozzles) {
    this.oldNozzles = oldNozzles;
    return this;
  }

  /**
   * The nozzles that were removed (if known)
   * @return OldNozzles
   */
  @JsonGetter("OldNozzles")
  public SMTHeadAndNozzle[] getOldNozzles() {
    return oldNozzles;
  }

  /**
   * The new nozzles that were loaded (mandatory)
   * @param newNozzles the value
   */
  @JsonSetter("NewNozzles")
  public SMTNozzleChangeActivity setNewNozzles(SMTHeadAndNozzle[] newNozzles) {
    this.newNozzles = newNozzles;
    return this;
  }

  /**
   * The new nozzles that were loaded (mandatory)
   * @return NewNozzles
   */
  @JsonGetter("NewNozzles")
  public SMTHeadAndNozzle[] getNewNozzles() {
    return newNozzles;
  }
}
