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
package org.ipc.cfx.production.application;

import java.util.UUID;
import org.ipc.cfx.structures.UninstalledMaterial;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent when material is unapplied or removed from a production unit, as in the case
            of paste being wiped clean, for example.
            
            {
              &quot;TransactionId&quot;: &quot;f5f4d00c-c346-4a5b-a98c-4be22aec2d49&quot;,
              &quot;UnappliedMaterials&quot;: [
                {
                  &quot;UnitIdentifier&quot;: &quot;PANEL23423432&quot;,
                  &quot;UnitPositionNumber&quot;: 1,
                  &quot;QuantityUninstalled&quot;: 3.55,
                  &quot;Material&quot;: {
                    &quot;UniqueIdentifier&quot;: &quot;MAT4566556456&quot;,
                    &quot;InternalPartNumber&quot;: &quot;IPN47788&quot;,
                    &quot;Quantity&quot;: 887.0
                  },
                  &quot;UninstalledComponents&quot;: []
                },
                {
                  &quot;UnitIdentifier&quot;: &quot;PANEL23423432&quot;,
                  &quot;UnitPositionNumber&quot;: 2,
                  &quot;QuantityUninstalled&quot;: 3.55,
                  &quot;Material&quot;: {
                    &quot;UniqueIdentifier&quot;: &quot;MAT4566556456&quot;,
                    &quot;InternalPartNumber&quot;: &quot;IPN47788&quot;,
                    &quot;Quantity&quot;: 887.0
                  },
                  &quot;UninstalledComponents&quot;: []
                }
              ]
            }
 * original type: CFX.Production.Application.MaterialsUnapplied
 */
public class MaterialsUnapplied extends CFXMessage {

  private UUID transactionId;
  private UninstalledMaterial[] unappliedMaterials;

  /**
   * The id of the work transaction with which this message is associated.
   * @param transactionId the value
   */
  @JsonSetter("TransactionId")
  public MaterialsUnapplied setTransactionId(UUID transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * The id of the work transaction with which this message is associated.
   * @return TransactionId
   */
  @JsonGetter("TransactionId")
  public UUID getTransactionId() {
    return transactionId;
  }

  /**
   * A list of materials which have been uninstalled.
   * @param unappliedMaterials the value
   */
  @JsonSetter("UnappliedMaterials")
  public MaterialsUnapplied setUnappliedMaterials(UninstalledMaterial[] unappliedMaterials) {
    this.unappliedMaterials = unappliedMaterials;
    return this;
  }

  /**
   * A list of materials which have been uninstalled.
   * @return UnappliedMaterials
   */
  @JsonGetter("UnappliedMaterials")
  public UninstalledMaterial[] getUnappliedMaterials() {
    return unappliedMaterials;
  }
}
