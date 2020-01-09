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
package org.ipc.cfx.production;

import java.util.UUID;
import org.ipc.cfx.structures.ToolUsed;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent by a process endpoint when one or more tools are used in the course of performing an assembly operation.
 * <pre>
            JSON Example - SMT Placement Machine
            {
              &quot;TransactionId&quot;: &quot;ff199a2e-4b31-4321-8afe-eff177f1a860&quot;,
              &quot;UsedTools&quot;: [
                {
                  &quot;UnitIdentifier&quot;: &quot;PANEL23423432&quot;,
                  &quot;UnitPositionNumber&quot;: 1,
                  &quot;Tool&quot;: {
                    &quot;$type&quot;: &quot;CFX.Structures.SMTPlacement.SMTHeadAndNozzle, CFX&quot;,
                    &quot;HeadId&quot;: &quot;HEAD1&quot;,
                    &quot;HeadNozzleNumber&quot;: 2,
                    &quot;NozzleType&quot;: &quot;409A&quot;,
                    &quot;UniqueIdentifier&quot;: &quot;UID234213421&quot;,
                    &quot;Name&quot;: &quot;Nozzle45&quot;
                  },
                  &quot;UsageCycles&quot;: 3,
                  &quot;InstalledComponents&quot;: [
                    {
                      &quot;ReferenceDesignator&quot;: &quot;R1&quot;,
                      &quot;InstallationTime&quot;: &quot;2018-10-25T08:46:46.6320834-04:00&quot;
                    },
                    {
                      &quot;ReferenceDesignator&quot;: &quot;R2&quot;,
                      &quot;InstallationTime&quot;: &quot;2018-10-25T08:46:46.6320834-04:00&quot;
                    },
                    {
                      &quot;ReferenceDesignator&quot;: &quot;R3&quot;,
                      &quot;InstallationTime&quot;: &quot;2018-10-25T08:46:46.6320834-04:00&quot;
                    }
                  ]
                },
                {
                  &quot;UnitIdentifier&quot;: &quot;PANEL23423432&quot;,
                  &quot;UnitPositionNumber&quot;: 2,
                  &quot;Tool&quot;: {
                    &quot;$type&quot;: &quot;CFX.Structures.SMTPlacement.SMTHeadAndNozzle, CFX&quot;,
                    &quot;HeadId&quot;: &quot;HEAD2&quot;,
                    &quot;HeadNozzleNumber&quot;: 3,
                    &quot;NozzleType&quot;: &quot;409A&quot;,
                    &quot;UniqueIdentifier&quot;: &quot;UID234223422&quot;,
                    &quot;Name&quot;: &quot;Nozzle47&quot;
                  },
                  &quot;UsageCycles&quot;: 3,
                  &quot;InstalledComponents&quot;: [
                    {
                      &quot;ReferenceDesignator&quot;: &quot;R1&quot;,
                      &quot;InstallationTime&quot;: &quot;2018-10-25T08:46:46.6320834-04:00&quot;
                    },
                    {
                      &quot;ReferenceDesignator&quot;: &quot;R2&quot;,
                      &quot;InstallationTime&quot;: &quot;2018-10-25T08:46:46.6320834-04:00&quot;
                    },
                    {
                      &quot;ReferenceDesignator&quot;: &quot;R3&quot;,
                      &quot;InstallationTime&quot;: &quot;2018-10-25T08:46:46.6320834-04:00&quot;
                    }
                  ]
                }
              ]
            }
            JSON Example - Hammer Used by Human in Manual Operation
            {
              &quot;TransactionId&quot;: &quot;8561b98b-21ba-47e6-810d-0917b58a4415&quot;,
              &quot;UsedTools&quot;: [
                {
                  &quot;UnitIdentifier&quot;: &quot;PANEL23423432&quot;,
                  &quot;UnitPositionNumber&quot;: 1,
                  &quot;Tool&quot;: {
                    &quot;UniqueIdentifier&quot;: &quot;UID234228874&quot;,
                    &quot;Name&quot;: &quot;Hammer 45&quot;
                  },
                  &quot;UsageCycles&quot;: 3,
                  &quot;InstalledComponents&quot;: []
                },
                {
                  &quot;UnitIdentifier&quot;: &quot;PANEL23423432&quot;,
                  &quot;UnitPositionNumber&quot;: 2,
                  &quot;Tool&quot;: {
                    &quot;UniqueIdentifier&quot;: &quot;UID234228874&quot;,
                    &quot;Name&quot;: &quot;Hammer 45&quot;
                  },
                  &quot;UsageCycles&quot;: 3,
                  &quot;InstalledComponents&quot;: []
                }
              ]
            }
            </pre>
 * original type: CFX.Production.ToolsUsed
 */
public class ToolsUsed extends CFXMessage {

  private UUID transactionId;
  private ToolUsed[] usedTools;

  /**
   * The id of the work transaction with which this installation is associated.
   * @param transactionId the value
   */
  @JsonSetter("TransactionId")
  public ToolsUsed setTransactionId(UUID transactionId) {
    this.transactionId = transactionId;
    return this;
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
   * A list of the tools that were used
   * @param usedTools the value
   */
  @JsonSetter("UsedTools")
  public ToolsUsed setUsedTools(ToolUsed[] usedTools) {
    this.usedTools = usedTools;
    return this;
  }

  /**
   * A list of the tools that were used
   * @return UsedTools
   */
  @JsonGetter("UsedTools")
  public ToolUsed[] getUsedTools() {
    return usedTools;
  }
}
