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
package org.ipc.cfx.production.application;

import java.util.UUID;
import org.ipc.cfx.structures.InstalledMaterial;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent when material is applied to a production unit, such as glue, adhesives, coatings, solder, paste, etc.
            
            {
              "TransactionId": "ce68a27a-af0b-42c2-a4b3-1066196a9f4a",
              "AppliedMaterials": [
                {
                  "UnitIdentifier": "PANEL23423432",
                  "UnitPositionNumber": 1,
                  "QuantityInstalled": 3.57,
                  "Material": {
                    "UniqueIdentifier": "MAT4566556456",
                    "InternalPartNumber": "IPN47788",
                    "Quantity": 887.0
                  },
                  "CarrierLocation": null,
                  "InstalledComponents": []
                },
                {
                  "UnitIdentifier": "PANEL23423432",
                  "UnitPositionNumber": 2,
                  "QuantityInstalled": 3.45,
                  "Material": {
                    "UniqueIdentifier": "MAT4566556456",
                    "InternalPartNumber": "IPN47788",
                    "Quantity": 887.0
                  },
                  "CarrierLocation": null,
                  "InstalledComponents": []
                }
              ]
            }
 * original type: CFX.Production.Application.MaterialsApplied
 */
public class MaterialsApplied extends CFXMessage {

  private UUID transactionId;
  private InstalledMaterial[] appliedMaterials;

  /**
   * The id of the work transaction with which this message is associated.
   */
  @JsonSetter("TransactionId")
  public void setTransactionId(UUID transactionId) {
    this.transactionId = transactionId;
  }

  /**
   * The id of the work transaction with which this message is associated.
   */
  @JsonGetter("TransactionId")
  public UUID getTransactionId() {
    return transactionId;
  }

  /**
   * A list of the specific materials which were applied.
   */
  @JsonSetter("AppliedMaterials")
  public void setAppliedMaterials(InstalledMaterial[] appliedMaterials) {
    this.appliedMaterials = appliedMaterials;
  }

  /**
   * A list of the specific materials which were applied.
   */
  @JsonGetter("AppliedMaterials")
  public InstalledMaterial[] getAppliedMaterials() {
    return appliedMaterials;
  }
}
