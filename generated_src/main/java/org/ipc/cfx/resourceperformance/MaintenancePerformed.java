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
package org.ipc.cfx.resourceperformance;

import org.ipc.cfx.structures.MaintenanceType;
import org.ipc.cfx.structures.ConsumedMaterial;
import org.ipc.cfx.structures.MaintenanceTask;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent by an endpoint when maintenance has been performed.
            Information includes the type of maintenance, maintenance code, parts used, labor etc.
            
            {
              "MaintenanceType": "Preventive",
              "MaintenanceOrderNumber": "MO676578576",
              "MaintenanceJobCode": "MNT113334",
              "ConsumedMaterials": [
                {
                  "MaterialLocation": {
                    "LocationIdentifier": null,
                    "LocationName": null,
                    "MaterialPackage": {
                      "UniqueIdentifier": null,
                      "InternalPartNumber": "PN2343243",
                      "Quantity": 0.0
                    },
                    "CarrierInformation": null
                  },
                  "QuantityUsed": 3.0,
                  "QuantitySpoiled": 0.0,
                  "RemainingQuantity": 0.0
                },
                {
                  "MaterialLocation": {
                    "LocationIdentifier": null,
                    "LocationName": null,
                    "MaterialPackage": {
                      "UniqueIdentifier": "UID23849854385",
                      "InternalPartNumber": "PN4452",
                      "Quantity": 0.0
                    },
                    "CarrierInformation": null
                  },
                  "QuantityUsed": 3.0,
                  "QuantitySpoiled": 0.0,
                  "RemainingQuantity": 0.0
                }
              ],
              "Tasks": [
                {
                  "Task": "Changed hydraulic fluid in resovoir 1",
                  "TaskId": "HYD233432432",
                  "Operator": {
                    "OperatorIdentifier": "BADGE489435",
                    "ActorType": "Human",
                    "LastName": "Smith",
                    "FirstName": "Joseph",
                    "LoginName": "joseph.smith@abcdrepairs.com"
                  },
                  "ManHoursConsumed": 0.75
                },
                {
                  "Task": "Checked torque on main mount bolts",
                  "TaskId": "CHK3432434",
                  "Operator": {
                    "OperatorIdentifier": "BADGE489435",
                    "ActorType": "Human",
                    "LastName": "Smith",
                    "FirstName": "Joseph",
                    "LoginName": "joseph.smith@abcdrepairs.com"
                  },
                  "ManHoursConsumed": 0.25
                }
              ]
            }
 * original type: CFX.ResourcePerformance.MaintenancePerformed
 */
public class MaintenancePerformed extends CFXMessage {

  private MaintenanceType maintenanceType;
  private String maintenanceOrderNumber;
  private String maintenanceJobCode;
  private ConsumedMaterial[] consumedMaterials;
  private MaintenanceTask[] tasks;

  /**
   * An enumeration describing the type of maintenance that was performed
   */
  @JsonSetter("MaintenanceType")
  public void setMaintenanceType(MaintenanceType maintenanceType) {
    this.maintenanceType = maintenanceType;
  }

  /**
   * An enumeration describing the type of maintenance that was performed
   */
  @JsonGetter("MaintenanceType")
  public MaintenanceType getMaintenanceType() {
    return maintenanceType;
  }

  /**
   * The work order number related to this maintenance event
   */
  @JsonSetter("MaintenanceOrderNumber")
  public void setMaintenanceOrderNumber(String maintenanceOrderNumber) {
    this.maintenanceOrderNumber = maintenanceOrderNumber;
  }

  /**
   * The work order number related to this maintenance event
   *
   * @return never null
   */
  @JsonGetter("MaintenanceOrderNumber")
  public String getMaintenanceOrderNumber() {
    return maintenanceOrderNumber == null ? "" : maintenanceOrderNumber;
  }

  /**
   * An endpoint-specific code indicating the nature of the maintenance
            event that was conducted
   */
  @JsonSetter("MaintenanceJobCode")
  public void setMaintenanceJobCode(String maintenanceJobCode) {
    this.maintenanceJobCode = maintenanceJobCode;
  }

  /**
   * An endpoint-specific code indicating the nature of the maintenance
            event that was conducted
   *
   * @return never null
   */
  @JsonGetter("MaintenanceJobCode")
  public String getMaintenanceJobCode() {
    return maintenanceJobCode == null ? "" : maintenanceJobCode;
  }

  /**
   * A list of the specific parts and materials that were consumed while performing
            the maintenance event
   */
  @JsonSetter("ConsumedMaterials")
  public void setConsumedMaterials(ConsumedMaterial[] consumedMaterials) {
    this.consumedMaterials = consumedMaterials;
  }

  /**
   * A list of the specific parts and materials that were consumed while performing
            the maintenance event
   */
  @JsonGetter("ConsumedMaterials")
  public ConsumedMaterial[] getConsumedMaterials() {
    return consumedMaterials;
  }

  /**
   * A list of the specific tasks that were performed while conducting this maintenance
            event
   */
  @JsonSetter("Tasks")
  public void setTasks(MaintenanceTask[] tasks) {
    this.tasks = tasks;
  }

  /**
   * A list of the specific tasks that were performed while conducting this maintenance
            event
   */
  @JsonGetter("Tasks")
  public MaintenanceTask[] getTasks() {
    return tasks;
  }
}
