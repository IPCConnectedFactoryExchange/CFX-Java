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
package org.ipc.cfx.structures;

import com.fasterxml.jackson.annotation.JsonValue;
// assembly CFX : version = 1.1.6.0
public enum ResourceState {
  PRD("PRD"),
  PRD_REGULARWORK("PRD_RegularWork"),
  PRD_WORKFORTHIRDPARTIES("PRD_WorkForThirdParties"),
  PRD_REWORK("PRD_Rework"),
  PRD_ENGINEERING("PRD_Engineering"),
  SBY("SBY"),
  SBY_NOOPERATOR("SBY_NoOperator"),
  SBY_NOPRODUCT("SBY_NoProduct"),
  SBY_NOPRODUCTBLOCKED("SBY_NoProductBlocked"),
  SBY_NOPRODUCTSTARVED("SBY_NoProductStarved"),
  SBY_NOSUPPORTTOOL("SBY_NoSupportTool"),
  SBY_ASSOCIATEDCLUSTERMODULEDOWN("SBY_AssociatedClusterModuleDown"),
  SBY_NOHOST("SBY_NoHost"),
  ENG("ENG"),
  ENG_PROCESSEXPERIMENTS("ENG_ProcessExperiments"),
  ENG_EQUIPMENTEXPERIMENTS("ENG_EquipmentExperiments"),
  SDT("SDT"),
  SDT_USERMAINTENANCEDELAY("SDT_UserMaintenanceDelay"),
  SDT_SUPPLIEDMAINTENANCEDELAY("SDT_SuppliedMaintenanceDelay"),
  SDT_PREVENTIVEMAINTENANCE("SDT_PreventiveMaintenance"),
  SDT_CHANGEOFCONSUMABLES("SDT_ChangeOfConsumables"),
  SDT_SETUP("SDT_Setup"),
  SDT_PRODUCTIONTEST("SDT_ProductionTest"),
  SDT_FACILITIESRELATED("SDT_FacilitiesRelated"),
  USD("USD"),
  USD_USERMAINTENTANCEDELAY("USD_UserMaintentanceDelay"),
  USD_SUPPLIEDMAINTENANCEDELAY("USD_SuppliedMaintenanceDelay"),
  USD_REPAIR("USD_Repair"),
  USD_OUTOFSPECINPUTMATERIAL("USD_OutOfSpecInputMaterial"),
  USD_CHANGEOFCONSUMABLES("USD_ChangeOfConsumables"),
  USD_FACILITIESRELATED("USD_FacilitiesRelated"),
  NST("NST"),
  NST_UNWORKEDSHIFTS("NST_UnworkedShifts"),
  NST_EQUIPMENTINSTALLATION("NST_EquipmentInstallation"),
  NST_EQUIPMENTMODIFICATIONS("NST_EquipmentModifications"),
  NST_OFFLINETRAINING("NST_OfflineTraining"),
  NST_SHUTDOWNANDSTARTUP("NST_ShutdownAndStartup");
  private String text;

  private ResourceState(String text) {
    this.text = text;
  }

  @JsonValue
    public String getText() {
      return text;
    }

  }
