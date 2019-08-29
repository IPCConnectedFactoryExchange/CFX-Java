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
package org.ipc.cfx.resourceperformance;

import org.ipc.cfx.structures.Fault;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent by a process endpoint whenever a fault is encountered. A data structure must be included in the message related to specific equipment type.Generic Fault Example:
            {
              "Fault": {
                "Cause": "MechanicalFailure",
                "Severity": "Error",
                "FaultCode": "ERROR 3943480",
                "FaultOccurrenceId": "ea170e0a-43fb-4b02-af2c-928a8401dd51",
                "Lane": null,
                "Stage": null,
                "SideLocation": "Unknown",
                "AccessType": "Unknown",
                "Description": null,
                "DescriptionTranslations": {},
                "OccurredAt": "2018-10-31T15:13:31.0083597-04:00",
                "DueDateTime": null
              }
            }
            SMT Placement Fault Example:
            {
              "Fault": {
                "$type": "CFX.Structures.SMTPlacement.SMTPlacementFault, CFX",
                "PlacementFaultType": "PickupError",
                "ProgramStep": 56,
                "Designator": {
                  "ReferenceDesignator": "R31",
                  "UnitPosition": null,
                  "PartNumber": "PN123456"
                },
                "MaterialLocation": {
                  "LocationIdentifier": "UID23948348324",
                  "LocationName": "SLOT47",
                  "MaterialPackage": {
                    "UniqueIdentifier": "UID34280923084932849",
                    "InternalPartNumber": "IPN456465465465",
                    "Quantity": 854.0
                  },
                  "CarrierInformation": {
                    "$type": "CFX.Structures.SMTPlacement.SMDTapeFeeder, CFX",
                    "BaseUniqueIdentifier": null,
                    "BaseName": null,
                    "LaneNumber": 1,
                    "TapeWidth": 8.0,
                    "TapePitch": 8.0,
                    "UniqueIdentifier": "FDR2348934-32890",
                    "Name": "8MMFDR231"
                  }
                },
                "HeadAndNozzle": {
                  "HeadId": "HEAD1",
                  "HeadNozzleNumber": 3,
                  "NozzleType": "TYPE914",
                  "UniqueIdentifier": "UID2389432849",
                  "Name": "NOZZLE3243244"
                },
                "Cause": "MechanicalFailure",
                "Severity": "Error",
                "FaultCode": "ERROR 3943480",
                "FaultOccurrenceId": "a5c05bdc-41a3-4e50-b421-b084eb12ba2b",
                "Lane": 1,
                "Stage": {
                  "StageSequence": 2,
                  "StageName": "STAGE2",
                  "StageType": "Work"
                },
                "SideLocation": "Unknown",
                "AccessType": "Unknown",
                "Description": null,
                "DescriptionTranslations": {},
                "OccurredAt": "2018-10-31T15:13:31.0552292-04:00",
                "DueDateTime": null
              }
            }
            THT Insertion Fault Example:
            {
              "Fault": {
                "$type": "CFX.Structures.THTInsertion.THTInsertionFault, CFX",
                "InsertionFaultType": "ClinchError",
                "ProgramStep": 56,
                "Designator": {
                  "ReferenceDesignator": "R31",
                  "UnitPosition": null,
                  "PartNumber": "PN123456"
                },
                "MaterialLocation": {
                  "LocationIdentifier": "UID23948348324",
                  "LocationName": "SLOT47",
                  "MaterialPackage": {
                    "UniqueIdentifier": "UID34280923084932849",
                    "InternalPartNumber": "IPN456465465465",
                    "Quantity": 854.0
                  },
                  "CarrierInformation": {
                    "$type": "CFX.Structures.SMTPlacement.SMDTapeFeeder, CFX",
                    "BaseUniqueIdentifier": null,
                    "BaseName": null,
                    "LaneNumber": 1,
                    "TapeWidth": 8.0,
                    "TapePitch": 8.0,
                    "UniqueIdentifier": "FDR2348934-32890",
                    "Name": "8MMFDR231"
                  }
                },
                "Cause": "MechanicalFailure",
                "Severity": "Error",
                "FaultCode": "ERROR 3943480",
                "FaultOccurrenceId": "cdc5d80e-bd0a-4b3b-9d85-9084b23f95e5",
                "Lane": 1,
                "Stage": {
                  "StageSequence": 1,
                  "StageName": "STAGE2",
                  "StageType": "Work"
                },
                "SideLocation": "Unknown",
                "AccessType": "Unknown",
                "Description": null,
                "DescriptionTranslations": {},
                "OccurredAt": "2018-10-31T15:13:31.0708549-04:00",
                "DueDateTime": null
              }
            }
            Solder Paste Printing Fault Example:
            {
              "Fault": {
                "$type": "CFX.Structures.SolderPastePrinting.SMTSolderPastePrintingFault, CFX",
                "PrintingFaultType": "SqueegeeError",
                "Cause": "MechanicalFailure",
                "Severity": "Error",
                "FaultCode": "ERROR 234333",
                "FaultOccurrenceId": "1610b591-eba0-4d30-b56e-89fdc94f865e",
                "Lane": 1,
                "Stage": {
                  "StageSequence": 1,
                  "StageName": "PRINTSTAGE",
                  "StageType": "Work"
                },
                "SideLocation": "Unknown",
                "AccessType": "Unknown",
                "Description": null,
                "DescriptionTranslations": {},
                "OccurredAt": "2018-10-31T15:13:31.1021044-04:00",
                "DueDateTime": null
              }
            }
 * original type: CFX.ResourcePerformance.FaultOccurred
 */
public class FaultOccurred extends CFXMessage {

  private Fault fault;

  /**
   * Dynamic structure providing detailed information about the fault that has occurred.
   */
  @JsonSetter("Fault")
  public void setFault(Fault fault) {
    this.fault = fault;
  }

  /**
   * Dynamic structure providing detailed information about the fault that has occurred.
   */
  @JsonGetter("Fault")
  public Fault getFault() {
    return fault;
  }
}
