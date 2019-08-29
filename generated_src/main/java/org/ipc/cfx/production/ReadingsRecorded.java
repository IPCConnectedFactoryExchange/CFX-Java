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
import org.ipc.cfx.structures.Reading;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * A process endpoint uses this message to send a data object that has been acquired
            for example from a sensor or a reading taken during processing of the unit. This
            data is typically used as a traceability record. Where no unit ID is provided, 
            the measurement is applicable to the process in terms of time only.
 * original type: CFX.Production.ReadingsRecorded
 */
public class ReadingsRecorded extends CFXMessage {

  private UUID transactionId;
  private Reading[] readings;

  /**
   * If the readings related to this message are associated with a work transaction, this property
            contains the Id of the transaction.
   */
  @JsonSetter("TransactionId")
  public void setTransactionId(UUID transactionId) {
    this.transactionId = transactionId;
  }

  /**
   * If the readings related to this message are associated with a work transaction, this property
            contains the Id of the transaction.
   */
  @JsonGetter("TransactionId")
  public UUID getTransactionId() {
    return transactionId;
  }

  /**
   * A list of readings to be recorded.
   */
  @JsonSetter("Readings")
  public void setReadings(Reading[] readings) {
    this.readings = readings;
  }

  /**
   * A list of readings to be recorded.
   */
  @JsonGetter("Readings")
  public Reading[] getReadings() {
    return readings;
  }
}
