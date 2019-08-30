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
import org.ipc.cfx.structures.InstalledMaterial;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent by a process endpoint when one or more materials (see note) are installed on to a production unit. 
            This message is typically sent at the completion of production on a unit or group of units at the
            endpoint, or, at the end of each stage.
            
            {
              &quot;TransactionId&quot;: &quot;ce1cf002-50fe-4cd4-af27-5e46fdae5608&quot;,
              &quot;InstalledMaterials&quot;: [
                {
                  &quot;UnitIdentifier&quot;: &quot;PANEL23423432&quot;,
                  &quot;UnitPositionNumber&quot;: 1,
                  &quot;QuantityInstalled&quot;: 3.0,
                  &quot;Material&quot;: {
                    &quot;UniqueIdentifier&quot;: &quot;MAT4566556456&quot;,
                    &quot;InternalPartNumber&quot;: &quot;IPN47788&quot;,
                    &quot;Quantity&quot;: 887.0
                  },
                  &quot;CarrierLocation&quot;: {
                    &quot;LocationIdentifier&quot;: &quot;UID384234893&quot;,
                    &quot;LocationName&quot;: &quot;SLOT45&quot;,
                    &quot;CarrierInformation&quot;: {
                      &quot;$type&quot;: &quot;CFX.Structures.SMTPlacement.SMDTapeFeeder, CFX&quot;,
                      &quot;BaseUniqueIdentifier&quot;: &quot;123334&quot;,
                      &quot;BaseName&quot;: null,
                      &quot;LaneNumber&quot;: 1,
                      &quot;TapeWidth&quot;: 8.0,
                      &quot;TapePitch&quot;: 8.0,
                      &quot;UniqueIdentifier&quot;: &quot;1233334&quot;,
                      &quot;Name&quot;: &quot;TAPEFEEDER8mm1233334&quot;
                    }
                  },
                  &quot;InstalledComponents&quot;: [
                    {
                      &quot;ReferenceDesignator&quot;: &quot;R1&quot;,
                      &quot;InstallationTime&quot;: &quot;2018-10-03T16:03:05.1091909-04:00&quot;
                    },
                    {
                      &quot;ReferenceDesignator&quot;: &quot;R2&quot;,
                      &quot;InstallationTime&quot;: &quot;2018-10-03T16:03:05.1091909-04:00&quot;
                    },
                    {
                      &quot;ReferenceDesignator&quot;: &quot;R3&quot;,
                      &quot;InstallationTime&quot;: &quot;2018-10-03T16:03:05.1091909-04:00&quot;
                    }
                  ]
                },
                {
                  &quot;UnitIdentifier&quot;: &quot;PANEL23423432&quot;,
                  &quot;UnitPositionNumber&quot;: 2,
                  &quot;QuantityInstalled&quot;: 3.0,
                  &quot;Material&quot;: {
                    &quot;UniqueIdentifier&quot;: &quot;MAT4566556456&quot;,
                    &quot;InternalPartNumber&quot;: &quot;IPN47788&quot;,
                    &quot;Quantity&quot;: 887.0
                  },
                  &quot;CarrierLocation&quot;: {
                    &quot;LocationIdentifier&quot;: &quot;UID384234893&quot;,
                    &quot;LocationName&quot;: &quot;SLOT45&quot;,
                    &quot;CarrierInformation&quot;: {
                      &quot;$type&quot;: &quot;CFX.Structures.SMTPlacement.SMDTapeFeeder, CFX&quot;,
                      &quot;BaseUniqueIdentifier&quot;: &quot;123334&quot;,
                      &quot;BaseName&quot;: null,
                      &quot;LaneNumber&quot;: 1,
                      &quot;TapeWidth&quot;: 8.0,
                      &quot;TapePitch&quot;: 8.0,
                      &quot;UniqueIdentifier&quot;: &quot;1233334&quot;,
                      &quot;Name&quot;: &quot;TAPEFEEDER8mm1233334&quot;
                    }
                  },
                  &quot;InstalledComponents&quot;: [
                    {
                      &quot;ReferenceDesignator&quot;: &quot;R1&quot;,
                      &quot;InstallationTime&quot;: &quot;2018-10-03T16:03:05.1091909-04:00&quot;
                    },
                    {
                      &quot;ReferenceDesignator&quot;: &quot;R2&quot;,
                      &quot;InstallationTime&quot;: &quot;2018-10-03T16:03:05.1091909-04:00&quot;
                    },
                    {
                      &quot;ReferenceDesignator&quot;: &quot;R3&quot;,
                      &quot;InstallationTime&quot;: &quot;2018-10-03T16:03:05.1091909-04:00&quot;
                    }
                  ],
                  &quot;NonInstalledComponents&quot;: [
                    {
                      &quot;ReferenceDesignator&quot;: &quot;R1&quot;,
                      &quot;NonInstallationTime&quot;: &quot;2018-10-03T16:03:05.1091909-04:00&quot;,
                      &quot;Location&quot; : &quot;RejectionBox&quot;,
                      &quot;RejectionBoxId&quot; : &quot;RejectionBox1&quot;,
                      &quot;RejectionComment&quot; : &quot;Bad electrical test measure&quot;,
                      &quot;RejectionReason&quot;: &quot;BadElectricalTest&quot;,
                      &quot;RejectionDetails&quot;: {
                        &quot;$type&quot;: &quot;CFX.Structures.BadElectricalTestRejectionDetails, CFX&quot;,
                        &quot;TesterSerialNumber&quot; : &quot;ELECTRICAL-TESTER-0123456789&quot;
                        &quot;Frequency&quot;: &quot;1000&quot;
                        &quot;ExpectedValue&quot;: &quot;3300&quot;,
                        &quot;MeasuredValue&quot;: &quot;3100&quot;,
                        &quot;ToleranceMin&quot;: &quot;100&quot;,
                        &quot;ToleranceMax&quot;: &quot;100&quot;,
                        &quot;ValueUnit&quot;: &quot;Ohm&quot;,
                        &quot;result&quot;: &quot;false&quot;,
                      }
                    }
                  ]
                }
              ]
            }
 * original type: CFX.Production.Assembly.MaterialsInstalled
 */
public class MaterialsInstalled extends CFXMessage {

  private UUID transactionId;
  private InstalledMaterial[] installedMaterials;

  /**
   * The id of the work transaction with which this installation is associated.
   * @param transactionId the value
   */
  @JsonSetter("TransactionId")
  public void setTransactionId(UUID transactionId) {
    this.transactionId = transactionId;
  }

  /**
   * The id of the work transaction with which this installation is associated.
   * @return TransactionId
   */
  @JsonGetter("TransactionId")
  public UUID getTransactionId() {
    return transactionId;
  }

  /**
   * A list of the specific materials which were installed.
   * @param installedMaterials the value
   */
  @JsonSetter("InstalledMaterials")
  public void setInstalledMaterials(InstalledMaterial[] installedMaterials) {
    this.installedMaterials = installedMaterials;
  }

  /**
   * A list of the specific materials which were installed.
   * @return InstalledMaterials
   */
  @JsonGetter("InstalledMaterials")
  public InstalledMaterial[] getInstalledMaterials() {
    return installedMaterials;
  }
}
