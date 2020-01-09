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
package org.ipc.cfx.production.assembly;

import java.util.UUID;
import org.ipc.cfx.structures.PersonalizedUnit;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent by a process endpoint when a configuration or assignment is made (example MAC Address) 
            
            {
              &quot;TransactionId&quot;: &quot;e5cf340c-6858-4e26-893d-deae86bc09f1&quot;,
              &quot;PersonalizedUnits&quot;: [
                {
                  &quot;UnitIdentifier&quot;: &quot;PANEL23423432&quot;,
                  &quot;UnitPositionNumber&quot;: 1,
                  &quot;Characteristics&quot;: [
                    {
                      &quot;Name&quot;: &quot;MAC Address&quot;,
                      &quot;Value&quot;: &quot;C0-15-B9-2D-0F-3B&quot;
                    }
                  ]
                },
                {
                  &quot;UnitIdentifier&quot;: &quot;PANEL23423432&quot;,
                  &quot;UnitPositionNumber&quot;: 2,
                  &quot;Characteristics&quot;: [
                    {
                      &quot;Name&quot;: &quot;MAC Address&quot;,
                      &quot;Value&quot;: &quot;C0-15-B9-2D-0F-3C&quot;
                    }
                  ]
                }
              ]
            }
 * original type: CFX.Production.Assembly.UnitsPersonalized
 */
public class UnitsPersonalized extends CFXMessage {

  private UUID transactionId;
  private PersonalizedUnit[] personalizedUnits;

  /**
   * The id of the work transaction with which this installation is associated.
   * @param transactionId the value
   */
  @JsonSetter("TransactionId")
  public UnitsPersonalized setTransactionId(UUID transactionId) {
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
   * A list of production units that have been personalized, including
            the personalization characteristics of each.
   * @param personalizedUnits the value
   */
  @JsonSetter("PersonalizedUnits")
  public UnitsPersonalized setPersonalizedUnits(PersonalizedUnit[] personalizedUnits) {
    this.personalizedUnits = personalizedUnits;
    return this;
  }

  /**
   * A list of production units that have been personalized, including
            the personalization characteristics of each.
   * @return PersonalizedUnits
   */
  @JsonGetter("PersonalizedUnits")
  public PersonalizedUnit[] getPersonalizedUnits() {
    return personalizedUnits;
  }
}
