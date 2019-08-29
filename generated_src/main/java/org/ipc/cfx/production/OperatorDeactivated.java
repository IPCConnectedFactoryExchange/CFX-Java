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

import org.ipc.cfx.structures.Operator;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Indicates that an activated operator is no longer active or responsible at a process endpoint
            
            {
              "Operator": {
                "OperatorIdentifier": "ea9da45d-9b1f-4e6a-974f-df06aeede42f",
                "ActorType": "Human",
                "LastName": "Smith",
                "FirstName": "Bill",
                "LoginName": "bill.smith@domain1.com"
              }
            }
 * original type: CFX.Production.OperatorDeactivated
 */
public class OperatorDeactivated extends CFXMessage {

  private Operator operator;

  /**
   * A structure which defines the Operator (optional)
   */
  @JsonSetter("Operator")
  public void setOperator(Operator operator) {
    this.operator = operator;
  }

  /**
   * A structure which defines the Operator (optional)
   */
  @JsonGetter("Operator")
  public Operator getOperator() {
    return operator;
  }
}
