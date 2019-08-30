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
              &quot;MaintenanceType&quot;: &quot;Preventive&quot;,
              &quot;MaintenanceOrderNumber&quot;: &quot;MO676578576&quot;,
              &quot;MaintenanceJobCode&quot;: &quot;MNT113334&quot;,
              &quot;ConsumedMaterials&quot;: [
                {
                  &quot;MaterialLocation&quot;: {
                    &quot;LocationIdentifier&quot;: null,
                    &quot;LocationName&quot;: null,
                    &quot;MaterialPackage&quot;: {
                      &quot;UniqueIdentifier&quot;: null,
                      &quot;InternalPartNumber&quot;: &quot;PN2343243&quot;,
                      &quot;Quantity&quot;: 0.0
                    },
                    &quot;CarrierInformation&quot;: null
                  },
                  &quot;QuantityUsed&quot;: 3.0,
                  &quot;QuantitySpoiled&quot;: 0.0,
                  &quot;RemainingQuantity&quot;: 0.0
                },
                {
                  &quot;MaterialLocation&quot;: {
                    &quot;LocationIdentifier&quot;: null,
                    &quot;LocationName&quot;: null,
                    &quot;MaterialPackage&quot;: {
                      &quot;UniqueIdentifier&quot;: &quot;UID23849854385&quot;,
                      &quot;InternalPartNumber&quot;: &quot;PN4452&quot;,
                      &quot;Quantity&quot;: 0.0
                    },
                    &quot;CarrierInformation&quot;: null
                  },
                  &quot;QuantityUsed&quot;: 3.0,
                  &quot;QuantitySpoiled&quot;: 0.0,
                  &quot;RemainingQuantity&quot;: 0.0
                }
              ],
              &quot;Tasks&quot;: [
                {
                  &quot;Task&quot;: &quot;Changed hydraulic fluid in resovoir 1&quot;,
                  &quot;TaskId&quot;: &quot;HYD233432432&quot;,
                  &quot;Operator&quot;: {
                    &quot;OperatorIdentifier&quot;: &quot;BADGE489435&quot;,
                    &quot;ActorType&quot;: &quot;Human&quot;,
                    &quot;LastName&quot;: &quot;Smith&quot;,
                    &quot;FirstName&quot;: &quot;Joseph&quot;,
                    &quot;LoginName&quot;: &quot;joseph.smith@abcdrepairs.com&quot;
                  },
                  &quot;ManHoursConsumed&quot;: 0.75
                },
                {
                  &quot;Task&quot;: &quot;Checked torque on main mount bolts&quot;,
                  &quot;TaskId&quot;: &quot;CHK3432434&quot;,
                  &quot;Operator&quot;: {
                    &quot;OperatorIdentifier&quot;: &quot;BADGE489435&quot;,
                    &quot;ActorType&quot;: &quot;Human&quot;,
                    &quot;LastName&quot;: &quot;Smith&quot;,
                    &quot;FirstName&quot;: &quot;Joseph&quot;,
                    &quot;LoginName&quot;: &quot;joseph.smith@abcdrepairs.com&quot;
                  },
                  &quot;ManHoursConsumed&quot;: 0.25
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
   * @param maintenanceType the value
   */
  @JsonSetter("MaintenanceType")
  public void setMaintenanceType(MaintenanceType maintenanceType) {
    this.maintenanceType = maintenanceType;
  }

  /**
   * An enumeration describing the type of maintenance that was performed
   * @return MaintenanceType
   */
  @JsonGetter("MaintenanceType")
  public MaintenanceType getMaintenanceType() {
    return maintenanceType;
  }

  /**
   * The work order number related to this maintenance event
   * @param maintenanceOrderNumber the value
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
   * @param maintenanceJobCode the value
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
   * @param consumedMaterials the value
   */
  @JsonSetter("ConsumedMaterials")
  public void setConsumedMaterials(ConsumedMaterial[] consumedMaterials) {
    this.consumedMaterials = consumedMaterials;
  }

  /**
   * A list of the specific parts and materials that were consumed while performing
            the maintenance event
   * @return ConsumedMaterials
   */
  @JsonGetter("ConsumedMaterials")
  public ConsumedMaterial[] getConsumedMaterials() {
    return consumedMaterials;
  }

  /**
   * A list of the specific tasks that were performed while conducting this maintenance
            event
   * @param tasks the value
   */
  @JsonSetter("Tasks")
  public void setTasks(MaintenanceTask[] tasks) {
    this.tasks = tasks;
  }

  /**
   * A list of the specific tasks that were performed while conducting this maintenance
            event
   * @return Tasks
   */
  @JsonGetter("Tasks")
  public MaintenanceTask[] getTasks() {
    return tasks;
  }
}
