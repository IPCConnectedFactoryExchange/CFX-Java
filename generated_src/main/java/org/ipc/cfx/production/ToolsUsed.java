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
package org.ipc.cfx.production;

import java.util.UUID;
import org.ipc.cfx.structures.ToolUsed;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent by a process endpoint when one or more tools are used in the course of performing an assembly operation.
            JSON Example - SMT Placement Machine
            {
              "TransactionId": "ff199a2e-4b31-4321-8afe-eff177f1a860",
              "UsedTools": [
                {
                  "UnitIdentifier": "PANEL23423432",
                  "UnitPositionNumber": 1,
                  "Tool": {
                    "$type": "CFX.Structures.SMTPlacement.SMTHeadAndNozzle, CFX",
                    "HeadId": "HEAD1",
                    "HeadNozzleNumber": 2,
                    "NozzleType": "409A",
                    "UniqueIdentifier": "UID234213421",
                    "Name": "Nozzle45"
                  },
                  "UsageCycles": 3,
                  "InstalledComponents": [
                    {
                      "ReferenceDesignator": "R1",
                      "InstallationTime": "2018-10-25T08:46:46.6320834-04:00"
                    },
                    {
                      "ReferenceDesignator": "R2",
                      "InstallationTime": "2018-10-25T08:46:46.6320834-04:00"
                    },
                    {
                      "ReferenceDesignator": "R3",
                      "InstallationTime": "2018-10-25T08:46:46.6320834-04:00"
                    }
                  ]
                },
                {
                  "UnitIdentifier": "PANEL23423432",
                  "UnitPositionNumber": 2,
                  "Tool": {
                    "$type": "CFX.Structures.SMTPlacement.SMTHeadAndNozzle, CFX",
                    "HeadId": "HEAD2",
                    "HeadNozzleNumber": 3,
                    "NozzleType": "409A",
                    "UniqueIdentifier": "UID234223422",
                    "Name": "Nozzle47"
                  },
                  "UsageCycles": 3,
                  "InstalledComponents": [
                    {
                      "ReferenceDesignator": "R1",
                      "InstallationTime": "2018-10-25T08:46:46.6320834-04:00"
                    },
                    {
                      "ReferenceDesignator": "R2",
                      "InstallationTime": "2018-10-25T08:46:46.6320834-04:00"
                    },
                    {
                      "ReferenceDesignator": "R3",
                      "InstallationTime": "2018-10-25T08:46:46.6320834-04:00"
                    }
                  ]
                }
              ]
            }
            JSON Example - Hammer Used by Human in Manual Operation
            {
              "TransactionId": "8561b98b-21ba-47e6-810d-0917b58a4415",
              "UsedTools": [
                {
                  "UnitIdentifier": "PANEL23423432",
                  "UnitPositionNumber": 1,
                  "Tool": {
                    "UniqueIdentifier": "UID234228874",
                    "Name": "Hammer 45"
                  },
                  "UsageCycles": 3,
                  "InstalledComponents": []
                },
                {
                  "UnitIdentifier": "PANEL23423432",
                  "UnitPositionNumber": 2,
                  "Tool": {
                    "UniqueIdentifier": "UID234228874",
                    "Name": "Hammer 45"
                  },
                  "UsageCycles": 3,
                  "InstalledComponents": []
                }
              ]
            }
 * original type: CFX.Production.ToolsUsed
 */
public class ToolsUsed extends CFXMessage {

  private UUID transactionId;
  private ToolUsed[] usedTools;

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
   * A list of the tools that were used
   */
  @JsonSetter("UsedTools")
  public void setUsedTools(ToolUsed[] usedTools) {
    this.usedTools = usedTools;
  }

  /**
   * A list of the tools that were used
   */
  @JsonGetter("UsedTools")
  public ToolUsed[] getUsedTools() {
    return usedTools;
  }
}
