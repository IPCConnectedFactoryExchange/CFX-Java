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
              &quot;TransactionId&quot;: &quot;c4d6262d-95cb-43e6-8b5c-dfd45978dd40&quot;,
              &quot;HeaderData&quot;: {
                &quot;Process_Status&quot;: &quot;Completed&quot;,
                &quot;RecipeName&quot;: &quot;Panasonic 2up&quot;,
                &quot;Nitrogen_Pressure&quot;: 54.0,
                &quot;Air_Pressure&quot;: 62.0,
                &quot;Cycle_Count&quot;: 671261,
                &quot;Cycle_Time&quot;: &quot;00:01:44.2000000&quot;,
                &quot;Nitrogen_Purity&quot;: 15.0,
                &quot;Nitrogen_Flow&quot;: 39.0,
                &quot;Fiducial_Enabled&quot;: true
              },
              &quot;SolderedPCBs&quot;: [
                {
                  &quot;UnitIdentifier&quot;: &quot;PANEL4325435&quot;,
                  &quot;UnitPositionNumber&quot;: 1,
                  &quot;ZoneData&quot;: [
                    {
                      &quot;StageSequence&quot;: 1,
                      &quot;ProcessTime&quot;: &quot;00:15:00&quot;,
                      &quot;Bottle1_Pressure&quot;: 7.0,
                      &quot;Bottle2_Pressure&quot;: 7.0,
                      &quot;Flux_Volume&quot;: 210.0,
                      &quot;Top_Preheater_Power&quot;: 50.0,
                      &quot;Top_Preheater_Soak&quot;: 10.0,
                      &quot;Top_Preheater_Temp&quot;: 109.0,
                      &quot;Top_Preheater_Time&quot;: &quot;00:00:37&quot;,
                      &quot;Bot_Preheater_Power&quot;: 0.0,
                      &quot;Bot_Preheater_Soak&quot;: 0.0,
                      &quot;Bot_Preheater_Temp&quot;: 0.0,
                      &quot;Bot_Preheater_Time&quot;: &quot;00:00:00&quot;,
                      &quot;Bath_Temp&quot;: 0.0,
                      &quot;Bath_Wave_Enabled&quot;: false,
                      &quot;Bath_Wave_Hgt&quot;: 0.0,
                      &quot;Solder_Quantity_Used&quot;: 0.0,
                      &quot;Fid_XCorrection&quot;: 0.15,
                      &quot;Fid_YCorrection&quot;: 0.2
                    },
                    {
                      &quot;StageSequence&quot;: 2,
                      &quot;ProcessTime&quot;: &quot;00:00:37&quot;,
                      &quot;Bottle1_Pressure&quot;: 0.0,
                      &quot;Bottle2_Pressure&quot;: 0.0,
                      &quot;Flux_Volume&quot;: 0.0,
                      &quot;Top_Preheater_Power&quot;: 50.0,
                      &quot;Top_Preheater_Soak&quot;: 10.0,
                      &quot;Top_Preheater_Temp&quot;: 109.0,
                      &quot;Top_Preheater_Time&quot;: &quot;00:00:37&quot;,
                      &quot;Bot_Preheater_Power&quot;: 50.0,
                      &quot;Bot_Preheater_Soak&quot;: 10.0,
                      &quot;Bot_Preheater_Temp&quot;: 108.0,
                      &quot;Bot_Preheater_Time&quot;: &quot;00:00:37&quot;,
                      &quot;Bath_Temp&quot;: 0.0,
                      &quot;Bath_Wave_Enabled&quot;: false,
                      &quot;Bath_Wave_Hgt&quot;: 0.0,
                      &quot;Solder_Quantity_Used&quot;: 0.0,
                      &quot;Fid_XCorrection&quot;: 0.0,
                      &quot;Fid_YCorrection&quot;: 0.0
                    },
                    {
                      &quot;StageSequence&quot;: 3,
                      &quot;ProcessTime&quot;: &quot;00:00:37&quot;,
                      &quot;Bottle1_Pressure&quot;: 0.0,
                      &quot;Bottle2_Pressure&quot;: 0.0,
                      &quot;Flux_Volume&quot;: 0.0,
                      &quot;Top_Preheater_Power&quot;: 50.0,
                      &quot;Top_Preheater_Soak&quot;: 10.0,
                      &quot;Top_Preheater_Temp&quot;: 109.0,
                      &quot;Top_Preheater_Time&quot;: &quot;00:00:37&quot;,
                      &quot;Bot_Preheater_Power&quot;: 50.0,
                      &quot;Bot_Preheater_Soak&quot;: 10.0,
                      &quot;Bot_Preheater_Temp&quot;: 108.0,
                      &quot;Bot_Preheater_Time&quot;: &quot;00:00:37&quot;,
                      &quot;Bath_Temp&quot;: 305.0,
                      &quot;Bath_Wave_Enabled&quot;: true,
                      &quot;Bath_Wave_Hgt&quot;: 0.1,
                      &quot;Solder_Quantity_Used&quot;: 5.0,
                      &quot;Fid_XCorrection&quot;: 0.15,
                      &quot;Fid_YCorrection&quot;: 0.2
                    }
                  ]
                },
                {
                  &quot;UnitIdentifier&quot;: &quot;PANEL4325435&quot;,
                  &quot;UnitPositionNumber&quot;: 1,
                  &quot;ZoneData&quot;: [
                    {
                      &quot;StageSequence&quot;: 1,
                      &quot;ProcessTime&quot;: &quot;00:15:00&quot;,
                      &quot;Bottle1_Pressure&quot;: 7.0,
                      &quot;Bottle2_Pressure&quot;: 7.0,
                      &quot;Flux_Volume&quot;: 210.0,
                      &quot;Top_Preheater_Power&quot;: 50.0,
                      &quot;Top_Preheater_Soak&quot;: 10.0,
                      &quot;Top_Preheater_Temp&quot;: 109.0,
                      &quot;Top_Preheater_Time&quot;: &quot;00:00:37&quot;,
                      &quot;Bot_Preheater_Power&quot;: 0.0,
                      &quot;Bot_Preheater_Soak&quot;: 0.0,
                      &quot;Bot_Preheater_Temp&quot;: 0.0,
                      &quot;Bot_Preheater_Time&quot;: &quot;00:00:00&quot;,
                      &quot;Bath_Temp&quot;: 0.0,
                      &quot;Bath_Wave_Enabled&quot;: false,
                      &quot;Bath_Wave_Hgt&quot;: 0.0,
                      &quot;Solder_Quantity_Used&quot;: 0.0,
                      &quot;Fid_XCorrection&quot;: 0.15,
                      &quot;Fid_YCorrection&quot;: 0.2
                    },
                    {
                      &quot;StageSequence&quot;: 2,
                      &quot;ProcessTime&quot;: &quot;00:00:37&quot;,
                      &quot;Bottle1_Pressure&quot;: 0.0,
                      &quot;Bottle2_Pressure&quot;: 0.0,
                      &quot;Flux_Volume&quot;: 0.0,
                      &quot;Top_Preheater_Power&quot;: 50.0,
                      &quot;Top_Preheater_Soak&quot;: 10.0,
                      &quot;Top_Preheater_Temp&quot;: 109.0,
                      &quot;Top_Preheater_Time&quot;: &quot;00:00:37&quot;,
                      &quot;Bot_Preheater_Power&quot;: 50.0,
                      &quot;Bot_Preheater_Soak&quot;: 10.0,
                      &quot;Bot_Preheater_Temp&quot;: 108.0,
                      &quot;Bot_Preheater_Time&quot;: &quot;00:00:37&quot;,
                      &quot;Bath_Temp&quot;: 0.0,
                      &quot;Bath_Wave_Enabled&quot;: false,
                      &quot;Bath_Wave_Hgt&quot;: 0.0,
                      &quot;Solder_Quantity_Used&quot;: 0.0,
                      &quot;Fid_XCorrection&quot;: 0.0,
                      &quot;Fid_YCorrection&quot;: 0.0
                    },
                    {
                      &quot;StageSequence&quot;: 3,
                      &quot;ProcessTime&quot;: &quot;00:00:37&quot;,
                      &quot;Bottle1_Pressure&quot;: 0.0,
                      &quot;Bottle2_Pressure&quot;: 0.0,
                      &quot;Flux_Volume&quot;: 0.0,
                      &quot;Top_Preheater_Power&quot;: 50.0,
                      &quot;Top_Preheater_Soak&quot;: 10.0,
                      &quot;Top_Preheater_Temp&quot;: 109.0,
                      &quot;Top_Preheater_Time&quot;: &quot;00:00:37&quot;,
                      &quot;Bot_Preheater_Power&quot;: 50.0,
                      &quot;Bot_Preheater_Soak&quot;: 10.0,
                      &quot;Bot_Preheater_Temp&quot;: 108.0,
                      &quot;Bot_Preheater_Time&quot;: &quot;00:00:37&quot;,
                      &quot;Bath_Temp&quot;: 305.0,
                      &quot;Bath_Wave_Enabled&quot;: true,
                      &quot;Bath_Wave_Hgt&quot;: 0.1,
                      &quot;Solder_Quantity_Used&quot;: 5.0,
                      &quot;Fid_XCorrection&quot;: 0.15,
                      &quot;Fid_YCorrection&quot;: 0.2
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
   * @param transactionId the value
   */
  @JsonSetter("TransactionId")
  public void setTransactionId(UUID transactionId) {
    this.transactionId = transactionId;
  }

  /**
   * The id of the work transaction with which this inspection session is associated.
   * @return TransactionId
   */
  @JsonGetter("TransactionId")
  public UUID getTransactionId() {
    return transactionId;
  }

  /**
   * General data values that apply across the selective process cycle
   * @param headerData the value
   */
  @JsonSetter("HeaderData")
  public void setHeaderData(SelectiveSolderData headerData) {
    this.headerData = headerData;
  }

  /**
   * General data values that apply across the selective process cycle
   * @return HeaderData
   */
  @JsonGetter("HeaderData")
  public SelectiveSolderData getHeaderData() {
    return headerData;
  }

  /**
   * Details of PCB that has been processed.
   * @param solderedPCBs the value
   */
  @JsonSetter("SolderedPCBs")
  public void setSolderedPCBs(SelectiveSolderedPCB[] solderedPCBs) {
    this.solderedPCBs = solderedPCBs;
  }

  /**
   * Details of PCB that has been processed.
   * @return SolderedPCBs
   */
  @JsonGetter("SolderedPCBs")
  public SelectiveSolderedPCB[] getSolderedPCBs() {
    return solderedPCBs;
  }
}
