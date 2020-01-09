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
package org.ipc.cfx.resourceperformance;

import org.ipc.cfx.structures.Fault;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent by a process endpoint whenever a fault is encountered. A data structure must be included in the message related to specific equipment type.Generic Fault Example:
            {
              &quot;Fault&quot;: {
                &quot;Cause&quot;: &quot;MechanicalFailure&quot;,
                &quot;Severity&quot;: &quot;Error&quot;,
                &quot;FaultCode&quot;: &quot;ERROR 3943480&quot;,
                &quot;FaultOccurrenceId&quot;: &quot;ea170e0a-43fb-4b02-af2c-928a8401dd51&quot;,
                &quot;Lane&quot;: null,
                &quot;Stage&quot;: null,
                &quot;SideLocation&quot;: &quot;Unknown&quot;,
                &quot;AccessType&quot;: &quot;Unknown&quot;,
                &quot;Description&quot;: null,
                &quot;DescriptionTranslations&quot;: {},
                &quot;OccurredAt&quot;: &quot;2018-10-31T15:13:31.0083597-04:00&quot;,
                &quot;DueDateTime&quot;: null
              }
            }
            SMT Placement Fault Example:
            {
              &quot;Fault&quot;: {
                &quot;$type&quot;: &quot;CFX.Structures.SMTPlacement.SMTPlacementFault, CFX&quot;,
                &quot;PlacementFaultType&quot;: &quot;PickupError&quot;,
                &quot;ProgramStep&quot;: 56,
                &quot;Designator&quot;: {
                  &quot;ReferenceDesignator&quot;: &quot;R31&quot;,
                  &quot;UnitPosition&quot;: null,
                  &quot;PartNumber&quot;: &quot;PN123456&quot;
                },
                &quot;MaterialLocation&quot;: {
                  &quot;LocationIdentifier&quot;: &quot;UID23948348324&quot;,
                  &quot;LocationName&quot;: &quot;SLOT47&quot;,
                  &quot;MaterialPackage&quot;: {
                    &quot;UniqueIdentifier&quot;: &quot;UID34280923084932849&quot;,
                    &quot;InternalPartNumber&quot;: &quot;IPN456465465465&quot;,
                    &quot;Quantity&quot;: 854.0
                  },
                  &quot;CarrierInformation&quot;: {
                    &quot;$type&quot;: &quot;CFX.Structures.SMTPlacement.SMDTapeFeeder, CFX&quot;,
                    &quot;BaseUniqueIdentifier&quot;: null,
                    &quot;BaseName&quot;: null,
                    &quot;LaneNumber&quot;: 1,
                    &quot;TapeWidth&quot;: 8.0,
                    &quot;TapePitch&quot;: 8.0,
                    &quot;UniqueIdentifier&quot;: &quot;FDR2348934-32890&quot;,
                    &quot;Name&quot;: &quot;8MMFDR231&quot;
                  }
                },
                &quot;HeadAndNozzle&quot;: {
                  &quot;HeadId&quot;: &quot;HEAD1&quot;,
                  &quot;HeadNozzleNumber&quot;: 3,
                  &quot;NozzleType&quot;: &quot;TYPE914&quot;,
                  &quot;UniqueIdentifier&quot;: &quot;UID2389432849&quot;,
                  &quot;Name&quot;: &quot;NOZZLE3243244&quot;
                },
                &quot;Cause&quot;: &quot;MechanicalFailure&quot;,
                &quot;Severity&quot;: &quot;Error&quot;,
                &quot;FaultCode&quot;: &quot;ERROR 3943480&quot;,
                &quot;FaultOccurrenceId&quot;: &quot;a5c05bdc-41a3-4e50-b421-b084eb12ba2b&quot;,
                &quot;Lane&quot;: 1,
                &quot;Stage&quot;: {
                  &quot;StageSequence&quot;: 2,
                  &quot;StageName&quot;: &quot;STAGE2&quot;,
                  &quot;StageType&quot;: &quot;Work&quot;
                },
                &quot;SideLocation&quot;: &quot;Unknown&quot;,
                &quot;AccessType&quot;: &quot;Unknown&quot;,
                &quot;Description&quot;: null,
                &quot;DescriptionTranslations&quot;: {},
                &quot;OccurredAt&quot;: &quot;2018-10-31T15:13:31.0552292-04:00&quot;,
                &quot;DueDateTime&quot;: null
              }
            }
            THT Insertion Fault Example:
            {
              &quot;Fault&quot;: {
                &quot;$type&quot;: &quot;CFX.Structures.THTInsertion.THTInsertionFault, CFX&quot;,
                &quot;InsertionFaultType&quot;: &quot;ClinchError&quot;,
                &quot;ProgramStep&quot;: 56,
                &quot;Designator&quot;: {
                  &quot;ReferenceDesignator&quot;: &quot;R31&quot;,
                  &quot;UnitPosition&quot;: null,
                  &quot;PartNumber&quot;: &quot;PN123456&quot;
                },
                &quot;MaterialLocation&quot;: {
                  &quot;LocationIdentifier&quot;: &quot;UID23948348324&quot;,
                  &quot;LocationName&quot;: &quot;SLOT47&quot;,
                  &quot;MaterialPackage&quot;: {
                    &quot;UniqueIdentifier&quot;: &quot;UID34280923084932849&quot;,
                    &quot;InternalPartNumber&quot;: &quot;IPN456465465465&quot;,
                    &quot;Quantity&quot;: 854.0
                  },
                  &quot;CarrierInformation&quot;: {
                    &quot;$type&quot;: &quot;CFX.Structures.SMTPlacement.SMDTapeFeeder, CFX&quot;,
                    &quot;BaseUniqueIdentifier&quot;: null,
                    &quot;BaseName&quot;: null,
                    &quot;LaneNumber&quot;: 1,
                    &quot;TapeWidth&quot;: 8.0,
                    &quot;TapePitch&quot;: 8.0,
                    &quot;UniqueIdentifier&quot;: &quot;FDR2348934-32890&quot;,
                    &quot;Name&quot;: &quot;8MMFDR231&quot;
                  }
                },
                &quot;Cause&quot;: &quot;MechanicalFailure&quot;,
                &quot;Severity&quot;: &quot;Error&quot;,
                &quot;FaultCode&quot;: &quot;ERROR 3943480&quot;,
                &quot;FaultOccurrenceId&quot;: &quot;cdc5d80e-bd0a-4b3b-9d85-9084b23f95e5&quot;,
                &quot;Lane&quot;: 1,
                &quot;Stage&quot;: {
                  &quot;StageSequence&quot;: 1,
                  &quot;StageName&quot;: &quot;STAGE2&quot;,
                  &quot;StageType&quot;: &quot;Work&quot;
                },
                &quot;SideLocation&quot;: &quot;Unknown&quot;,
                &quot;AccessType&quot;: &quot;Unknown&quot;,
                &quot;Description&quot;: null,
                &quot;DescriptionTranslations&quot;: {},
                &quot;OccurredAt&quot;: &quot;2018-10-31T15:13:31.0708549-04:00&quot;,
                &quot;DueDateTime&quot;: null
              }
            }
            Solder Paste Printing Fault Example:
            {
              &quot;Fault&quot;: {
                &quot;$type&quot;: &quot;CFX.Structures.SolderPastePrinting.SMTSolderPastePrintingFault, CFX&quot;,
                &quot;PrintingFaultType&quot;: &quot;SqueegeeError&quot;,
                &quot;Cause&quot;: &quot;MechanicalFailure&quot;,
                &quot;Severity&quot;: &quot;Error&quot;,
                &quot;FaultCode&quot;: &quot;ERROR 234333&quot;,
                &quot;FaultOccurrenceId&quot;: &quot;1610b591-eba0-4d30-b56e-89fdc94f865e&quot;,
                &quot;Lane&quot;: 1,
                &quot;Stage&quot;: {
                  &quot;StageSequence&quot;: 1,
                  &quot;StageName&quot;: &quot;PRINTSTAGE&quot;,
                  &quot;StageType&quot;: &quot;Work&quot;
                },
                &quot;SideLocation&quot;: &quot;Unknown&quot;,
                &quot;AccessType&quot;: &quot;Unknown&quot;,
                &quot;Description&quot;: null,
                &quot;DescriptionTranslations&quot;: {},
                &quot;OccurredAt&quot;: &quot;2018-10-31T15:13:31.1021044-04:00&quot;,
                &quot;DueDateTime&quot;: null
              }
            }
 * original type: CFX.ResourcePerformance.FaultOccurred
 */
public class FaultOccurred extends CFXMessage {

  private Fault fault;

  /**
   * Dynamic structure providing detailed information about the fault that has occurred.
   * @param fault the value
   */
  @JsonSetter("Fault")
  public FaultOccurred setFault(Fault fault) {
    this.fault = fault;
    return this;
  }

  /**
   * Dynamic structure providing detailed information about the fault that has occurred.
   * @return Fault
   */
  @JsonGetter("Fault")
  public Fault getFault() {
    return fault;
  }
}
