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
package org.ipc.cfx.production.application.solder;

import java.util.UUID;
import org.ipc.cfx.structures.solderapplication.SelectiveSolderData;
import org.ipc.cfx.structures.solderapplication.SelectiveSolderedPCB;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Message sent upon completion of the selective soldering process
            
            {
              "TransactionId": "c4d6262d-95cb-43e6-8b5c-dfd45978dd40",
              "HeaderData": {
                "Process_Status": "Completed",
                "RecipeName": "Panasonic 2up",
                "Nitrogen_Pressure": 54.0,
                "Air_Pressure": 62.0,
                "Cycle_Count": 671261,
                "Cycle_Time": "00:01:44.2000000",
                "Nitrogen_Purity": 15.0,
                "Nitrogen_Flow": 39.0,
                "Fiducial_Enabled": true
              },
              "SolderedPCBs": [
                {
                  "UnitIdentifier": "PANEL4325435",
                  "UnitPositionNumber": 1,
                  "ZoneData": [
                    {
                      "StageSequence": 1,
                      "ProcessTime": "00:15:00",
                      "Bottle1_Pressure": 7.0,
                      "Bottle2_Pressure": 7.0,
                      "Flux_Volume": 210.0,
                      "Top_Preheater_Power": 50.0,
                      "Top_Preheater_Soak": 10.0,
                      "Top_Preheater_Temp": 109.0,
                      "Top_Preheater_Time": "00:00:37",
                      "Bot_Preheater_Power": 0.0,
                      "Bot_Preheater_Soak": 0.0,
                      "Bot_Preheater_Temp": 0.0,
                      "Bot_Preheater_Time": "00:00:00",
                      "Bath_Temp": 0.0,
                      "Bath_Wave_Enabled": false,
                      "Bath_Wave_Hgt": 0.0,
                      "Solder_Quantity_Used": 0.0,
                      "Fid_XCorrection": 0.15,
                      "Fid_YCorrection": 0.2
                    },
                    {
                      "StageSequence": 2,
                      "ProcessTime": "00:00:37",
                      "Bottle1_Pressure": 0.0,
                      "Bottle2_Pressure": 0.0,
                      "Flux_Volume": 0.0,
                      "Top_Preheater_Power": 50.0,
                      "Top_Preheater_Soak": 10.0,
                      "Top_Preheater_Temp": 109.0,
                      "Top_Preheater_Time": "00:00:37",
                      "Bot_Preheater_Power": 50.0,
                      "Bot_Preheater_Soak": 10.0,
                      "Bot_Preheater_Temp": 108.0,
                      "Bot_Preheater_Time": "00:00:37",
                      "Bath_Temp": 0.0,
                      "Bath_Wave_Enabled": false,
                      "Bath_Wave_Hgt": 0.0,
                      "Solder_Quantity_Used": 0.0,
                      "Fid_XCorrection": 0.0,
                      "Fid_YCorrection": 0.0
                    },
                    {
                      "StageSequence": 3,
                      "ProcessTime": "00:00:37",
                      "Bottle1_Pressure": 0.0,
                      "Bottle2_Pressure": 0.0,
                      "Flux_Volume": 0.0,
                      "Top_Preheater_Power": 50.0,
                      "Top_Preheater_Soak": 10.0,
                      "Top_Preheater_Temp": 109.0,
                      "Top_Preheater_Time": "00:00:37",
                      "Bot_Preheater_Power": 50.0,
                      "Bot_Preheater_Soak": 10.0,
                      "Bot_Preheater_Temp": 108.0,
                      "Bot_Preheater_Time": "00:00:37",
                      "Bath_Temp": 305.0,
                      "Bath_Wave_Enabled": true,
                      "Bath_Wave_Hgt": 0.1,
                      "Solder_Quantity_Used": 5.0,
                      "Fid_XCorrection": 0.15,
                      "Fid_YCorrection": 0.2
                    }
                  ]
                },
                {
                  "UnitIdentifier": "PANEL4325435",
                  "UnitPositionNumber": 1,
                  "ZoneData": [
                    {
                      "StageSequence": 1,
                      "ProcessTime": "00:15:00",
                      "Bottle1_Pressure": 7.0,
                      "Bottle2_Pressure": 7.0,
                      "Flux_Volume": 210.0,
                      "Top_Preheater_Power": 50.0,
                      "Top_Preheater_Soak": 10.0,
                      "Top_Preheater_Temp": 109.0,
                      "Top_Preheater_Time": "00:00:37",
                      "Bot_Preheater_Power": 0.0,
                      "Bot_Preheater_Soak": 0.0,
                      "Bot_Preheater_Temp": 0.0,
                      "Bot_Preheater_Time": "00:00:00",
                      "Bath_Temp": 0.0,
                      "Bath_Wave_Enabled": false,
                      "Bath_Wave_Hgt": 0.0,
                      "Solder_Quantity_Used": 0.0,
                      "Fid_XCorrection": 0.15,
                      "Fid_YCorrection": 0.2
                    },
                    {
                      "StageSequence": 2,
                      "ProcessTime": "00:00:37",
                      "Bottle1_Pressure": 0.0,
                      "Bottle2_Pressure": 0.0,
                      "Flux_Volume": 0.0,
                      "Top_Preheater_Power": 50.0,
                      "Top_Preheater_Soak": 10.0,
                      "Top_Preheater_Temp": 109.0,
                      "Top_Preheater_Time": "00:00:37",
                      "Bot_Preheater_Power": 50.0,
                      "Bot_Preheater_Soak": 10.0,
                      "Bot_Preheater_Temp": 108.0,
                      "Bot_Preheater_Time": "00:00:37",
                      "Bath_Temp": 0.0,
                      "Bath_Wave_Enabled": false,
                      "Bath_Wave_Hgt": 0.0,
                      "Solder_Quantity_Used": 0.0,
                      "Fid_XCorrection": 0.0,
                      "Fid_YCorrection": 0.0
                    },
                    {
                      "StageSequence": 3,
                      "ProcessTime": "00:00:37",
                      "Bottle1_Pressure": 0.0,
                      "Bottle2_Pressure": 0.0,
                      "Flux_Volume": 0.0,
                      "Top_Preheater_Power": 50.0,
                      "Top_Preheater_Soak": 10.0,
                      "Top_Preheater_Temp": 109.0,
                      "Top_Preheater_Time": "00:00:37",
                      "Bot_Preheater_Power": 50.0,
                      "Bot_Preheater_Soak": 10.0,
                      "Bot_Preheater_Temp": 108.0,
                      "Bot_Preheater_Time": "00:00:37",
                      "Bath_Temp": 305.0,
                      "Bath_Wave_Enabled": true,
                      "Bath_Wave_Hgt": 0.1,
                      "Solder_Quantity_Used": 5.0,
                      "Fid_XCorrection": 0.15,
                      "Fid_YCorrection": 0.2
                    }
                  ]
                }
              ]
            }
 * original type: CFX.Production.Application.Solder.PCBSelectiveSoldered
 */
public class PCBSelectiveSoldered extends CFXMessage {

  private UUID transactionId;
  private SelectiveSolderData headerData;
  private SelectiveSolderedPCB[] solderedPCBs;

  /**
   * The id of the work transaction with which this inspection session is associated.
   */
  @JsonSetter("TransactionId")
  public void setTransactionId(UUID transactionId) {
    this.transactionId = transactionId;
  }

  /**
   * The id of the work transaction with which this inspection session is associated.
   */
  @JsonGetter("TransactionId")
  public UUID getTransactionId() {
    return transactionId;
  }

  /**
   * General data values that apply across the selective process cycle
   */
  @JsonSetter("HeaderData")
  public void setHeaderData(SelectiveSolderData headerData) {
    this.headerData = headerData;
  }

  /**
   * General data values that apply across the selective process cycle
   */
  @JsonGetter("HeaderData")
  public SelectiveSolderData getHeaderData() {
    return headerData;
  }

  /**
   * Details of PCB that has been processed.
   */
  @JsonSetter("SolderedPCBs")
  public void setSolderedPCBs(SelectiveSolderedPCB[] solderedPCBs) {
    this.solderedPCBs = solderedPCBs;
  }

  /**
   * Details of PCB that has been processed.
   */
  @JsonGetter("SolderedPCBs")
  public SelectiveSolderedPCB[] getSolderedPCBs() {
    return solderedPCBs;
  }
}
