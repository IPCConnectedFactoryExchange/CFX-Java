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
import org.ipc.cfx.structures.InstalledMaterial;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent by a process endpoint when one or more materials (see note) are installed on to a production unit. 
            This message is typically sent at the completion of production on a unit or group of units at the
            endpoint, or, at the end of each stage.
            
            {
              "TransactionId": "ce1cf002-50fe-4cd4-af27-5e46fdae5608",
              "InstalledMaterials": [
                {
                  "UnitIdentifier": "PANEL23423432",
                  "UnitPositionNumber": 1,
                  "QuantityInstalled": 3.0,
                  "Material": {
                    "UniqueIdentifier": "MAT4566556456",
                    "InternalPartNumber": "IPN47788",
                    "Quantity": 887.0
                  },
                  "CarrierLocation": {
                    "LocationIdentifier": "UID384234893",
                    "LocationName": "SLOT45",
                    "CarrierInformation": {
                      "$type": "CFX.Structures.SMTPlacement.SMDTapeFeeder, CFX",
                      "BaseUniqueIdentifier": "123334",
                      "BaseName": null,
                      "LaneNumber": 1,
                      "TapeWidth": 8.0,
                      "TapePitch": 8.0,
                      "UniqueIdentifier": "1233334",
                      "Name": "TAPEFEEDER8mm1233334"
                    }
                  },
                  "InstalledComponents": [
                    {
                      "ReferenceDesignator": "R1",
                      "InstallationTime": "2018-10-03T16:03:05.1091909-04:00"
                    },
                    {
                      "ReferenceDesignator": "R2",
                      "InstallationTime": "2018-10-03T16:03:05.1091909-04:00"
                    },
                    {
                      "ReferenceDesignator": "R3",
                      "InstallationTime": "2018-10-03T16:03:05.1091909-04:00"
                    }
                  ]
                },
                {
                  "UnitIdentifier": "PANEL23423432",
                  "UnitPositionNumber": 2,
                  "QuantityInstalled": 3.0,
                  "Material": {
                    "UniqueIdentifier": "MAT4566556456",
                    "InternalPartNumber": "IPN47788",
                    "Quantity": 887.0
                  },
                  "CarrierLocation": {
                    "LocationIdentifier": "UID384234893",
                    "LocationName": "SLOT45",
                    "CarrierInformation": {
                      "$type": "CFX.Structures.SMTPlacement.SMDTapeFeeder, CFX",
                      "BaseUniqueIdentifier": "123334",
                      "BaseName": null,
                      "LaneNumber": 1,
                      "TapeWidth": 8.0,
                      "TapePitch": 8.0,
                      "UniqueIdentifier": "1233334",
                      "Name": "TAPEFEEDER8mm1233334"
                    }
                  },
                  "InstalledComponents": [
                    {
                      "ReferenceDesignator": "R1",
                      "InstallationTime": "2018-10-03T16:03:05.1091909-04:00"
                    },
                    {
                      "ReferenceDesignator": "R2",
                      "InstallationTime": "2018-10-03T16:03:05.1091909-04:00"
                    },
                    {
                      "ReferenceDesignator": "R3",
                      "InstallationTime": "2018-10-03T16:03:05.1091909-04:00"
                    }
                  ],
                  "NonInstalledComponents": [
                    {
                      "ReferenceDesignator": "R1",
                      "NonInstallationTime": "2018-10-03T16:03:05.1091909-04:00",
                      "Location" : "RejectionBox",
                      "RejectionBoxId" : "RejectionBox1",
                      "RejectionComment" : "Bad electrical test measure",
                      "RejectionReason": "BadElectricalTest",
                      "RejectionDetails": {
                        "$type": "CFX.Structures.BadElectricalTestRejectionDetails, CFX",
                        "TesterSerialNumber" : "ELECTRICAL-TESTER-0123456789"
                        "Frequency": "1000"
                        "ExpectedValue": "3300",
                        "MeasuredValue": "3100",
                        "ToleranceMin": "100",
                        "ToleranceMax": "100",
                        "ValueUnit": "Ohm",
                        "result": "false",
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
   */
  @JsonSetter("TransactionId")
  public void setTransactionId(UUID transactionId) {
    this.transactionId = transactionId;
  }

  /**
   * The id of the work transaction with which this installation is associated.
   */
  @JsonGetter("TransactionId")
  public UUID getTransactionId() {
    return transactionId;
  }

  /**
   * A list of the specific materials which were installed.
   */
  @JsonSetter("InstalledMaterials")
  public void setInstalledMaterials(InstalledMaterial[] installedMaterials) {
    this.installedMaterials = installedMaterials;
  }

  /**
   * A list of the specific materials which were installed.
   */
  @JsonGetter("InstalledMaterials")
  public InstalledMaterial[] getInstalledMaterials() {
    return installedMaterials;
  }
}
