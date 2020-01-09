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
package org.ipc.cfx.production.hermes;

import org.ipc.cfx.structures.WorkOrderIdentifier;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Used by an endpoint to acquire information related to a particular work order (typically at the beginnning of a Hermes enabled line).
            This information would typically then be passed down the line through the Hermes protocol / mechanism.
 * original type: CFX.Production.Hermes.GetWorkOrderDataRequest
 */
public class GetWorkOrderDataRequest extends CFXMessage {

  private WorkOrderIdentifier workOrderIdentifier;
  private String unitIdentifier;

  /**
   * The identifier of the work order to look up.
   * @param workOrderIdentifier the value
   */
  @JsonSetter("WorkOrderIdentifier")
  public GetWorkOrderDataRequest setWorkOrderIdentifier(WorkOrderIdentifier workOrderIdentifier) {
    this.workOrderIdentifier = workOrderIdentifier;
    return this;
  }

  /**
   * The identifier of the work order to look up.
   * @return WorkOrderIdentifier
   */
  @JsonGetter("WorkOrderIdentifier")
  public WorkOrderIdentifier getWorkOrderIdentifier() {
    return workOrderIdentifier;
  }

  /**
   * (OPTIONAL)  If work order informatoin is not known, an endpoint may also obtain work order data by instead populating
            this property with the identifier of a production unit that is associated with a work order and known to an upper 
            level control system.  The upper level control system will then look up the associated work order, and return the 
            appropriate work order information.
   * @param unitIdentifier the value
   */
  @JsonSetter("UnitIdentifier")
  public GetWorkOrderDataRequest setUnitIdentifier(String unitIdentifier) {
    this.unitIdentifier = unitIdentifier;
    return this;
  }

  /**
   * (OPTIONAL)  If work order informatoin is not known, an endpoint may also obtain work order data by instead populating
            this property with the identifier of a production unit that is associated with a work order and known to an upper 
            level control system.  The upper level control system will then look up the associated work order, and return the 
            appropriate work order information.
   *
   * @return never null
   */
  @JsonGetter("UnitIdentifier")
  public String getUnitIdentifier() {
    return unitIdentifier == null ? "" : unitIdentifier;
  }
}
