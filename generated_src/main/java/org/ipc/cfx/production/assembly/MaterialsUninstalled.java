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
package org.ipc.cfx.production.assembly;

import java.util.UUID;
import org.ipc.cfx.structures.UninstalledMaterial;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent by a process endpoint when one or more materials (see note) are removed from a production unit.
            This message is typically sent at the completion of a production unit or group of units at the
            endpoint, or, at the end of each stage.
            
            {
              "TransactionId": "8d152f92-425d-4b5e-8c8a-da6a00f93c1b",
              "UninstalledMaterials": [
                {
                  "UnitIdentifier": "PANEL23423432",
                  "UnitPositionNumber": 1,
                  "QuantityUninstalled": 3.0,
                  "Reason": "DefectiveMaterial",
                  "Material": {
                    "UniqueIdentifier": "MAT4566556456",
                    "InternalPartNumber": "IPN47788",
                    "Quantity": 887.0
                  },
                  "UninstalledComponents": [
                    {
                      "ReferenceDesignator": "R1",
                      "InstallationTime": "2018-10-10T08:34:40.1054186-04:00"
                    },
                    {
                      "ReferenceDesignator": "R2",
                      "InstallationTime": "2018-10-10T08:34:40.1054186-04:00"
                    },
                    {
                      "ReferenceDesignator": "R3",
                      "InstallationTime": "2018-10-10T08:34:40.1054186-04:00"
                    }
                  ]
                },
                {
                  "UnitIdentifier": "PANEL23423432",
                  "UnitPositionNumber": 2,
                  "QuantityUninstalled": 3.0,
                  "Reason": "DefectiveMaterial",
                  "Material": {
                    "UniqueIdentifier": "MAT4566556456",
                    "InternalPartNumber": "IPN47788",
                    "Quantity": 887.0
                  },
                  "UninstalledComponents": [
                    {
                      "ReferenceDesignator": "R1",
                      "InstallationTime": "2018-10-10T08:34:40.1054186-04:00"
                    },
                    {
                      "ReferenceDesignator": "R2",
                      "InstallationTime": "2018-10-10T08:34:40.1054186-04:00"
                    },
                    {
                      "ReferenceDesignator": "R3",
                      "InstallationTime": "2018-10-10T08:34:40.1054186-04:00"
                    }
                  ]
                }
              ]
            }
 * original type: CFX.Production.Assembly.MaterialsUninstalled
 */
public class MaterialsUninstalled extends CFXMessage {

  private UUID transactionId;
  private UninstalledMaterial[] uninstalledMaterials;

  /**
   * The id of the work transaction with which this uninstallation is associated.
   */
  @JsonSetter("TransactionId")
  public void setTransactionId(UUID transactionId) {
    this.transactionId = transactionId;
  }

  /**
   * The id of the work transaction with which this uninstallation is associated.
   */
  @JsonGetter("TransactionId")
  public UUID getTransactionId() {
    return transactionId;
  }

  /**
   * A list of materials which have been uninstalled.
   */
  @JsonSetter("UninstalledMaterials")
  public void setUninstalledMaterials(UninstalledMaterial[] uninstalledMaterials) {
    this.uninstalledMaterials = uninstalledMaterials;
  }

  /**
   * A list of materials which have been uninstalled.
   */
  @JsonGetter("UninstalledMaterials")
  public UninstalledMaterial[] getUninstalledMaterials() {
    return uninstalledMaterials;
  }
}
