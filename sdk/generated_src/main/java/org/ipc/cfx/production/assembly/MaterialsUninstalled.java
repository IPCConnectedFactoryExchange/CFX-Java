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
              &quot;TransactionId&quot;: &quot;8d152f92-425d-4b5e-8c8a-da6a00f93c1b&quot;,
              &quot;UninstalledMaterials&quot;: [
                {
                  &quot;UnitIdentifier&quot;: &quot;PANEL23423432&quot;,
                  &quot;UnitPositionNumber&quot;: 1,
                  &quot;QuantityUninstalled&quot;: 3.0,
                  &quot;Reason&quot;: &quot;DefectiveMaterial&quot;,
                  &quot;Material&quot;: {
                    &quot;UniqueIdentifier&quot;: &quot;MAT4566556456&quot;,
                    &quot;InternalPartNumber&quot;: &quot;IPN47788&quot;,
                    &quot;Quantity&quot;: 887.0
                  },
                  &quot;UninstalledComponents&quot;: [
                    {
                      &quot;ReferenceDesignator&quot;: &quot;R1&quot;,
                      &quot;InstallationTime&quot;: &quot;2018-10-10T08:34:40.1054186-04:00&quot;
                    },
                    {
                      &quot;ReferenceDesignator&quot;: &quot;R2&quot;,
                      &quot;InstallationTime&quot;: &quot;2018-10-10T08:34:40.1054186-04:00&quot;
                    },
                    {
                      &quot;ReferenceDesignator&quot;: &quot;R3&quot;,
                      &quot;InstallationTime&quot;: &quot;2018-10-10T08:34:40.1054186-04:00&quot;
                    }
                  ]
                },
                {
                  &quot;UnitIdentifier&quot;: &quot;PANEL23423432&quot;,
                  &quot;UnitPositionNumber&quot;: 2,
                  &quot;QuantityUninstalled&quot;: 3.0,
                  &quot;Reason&quot;: &quot;DefectiveMaterial&quot;,
                  &quot;Material&quot;: {
                    &quot;UniqueIdentifier&quot;: &quot;MAT4566556456&quot;,
                    &quot;InternalPartNumber&quot;: &quot;IPN47788&quot;,
                    &quot;Quantity&quot;: 887.0
                  },
                  &quot;UninstalledComponents&quot;: [
                    {
                      &quot;ReferenceDesignator&quot;: &quot;R1&quot;,
                      &quot;InstallationTime&quot;: &quot;2018-10-10T08:34:40.1054186-04:00&quot;
                    },
                    {
                      &quot;ReferenceDesignator&quot;: &quot;R2&quot;,
                      &quot;InstallationTime&quot;: &quot;2018-10-10T08:34:40.1054186-04:00&quot;
                    },
                    {
                      &quot;ReferenceDesignator&quot;: &quot;R3&quot;,
                      &quot;InstallationTime&quot;: &quot;2018-10-10T08:34:40.1054186-04:00&quot;
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
   * @param transactionId the value
   */
  @JsonSetter("TransactionId")
  public void setTransactionId(UUID transactionId) {
    this.transactionId = transactionId;
  }

  /**
   * The id of the work transaction with which this uninstallation is associated.
   * @return TransactionId
   */
  @JsonGetter("TransactionId")
  public UUID getTransactionId() {
    return transactionId;
  }

  /**
   * A list of materials which have been uninstalled.
   * @param uninstalledMaterials the value
   */
  @JsonSetter("UninstalledMaterials")
  public void setUninstalledMaterials(UninstalledMaterial[] uninstalledMaterials) {
    this.uninstalledMaterials = uninstalledMaterials;
  }

  /**
   * A list of materials which have been uninstalled.
   * @return UninstalledMaterials
   */
  @JsonGetter("UninstalledMaterials")
  public UninstalledMaterial[] getUninstalledMaterials() {
    return uninstalledMaterials;
  }
}
