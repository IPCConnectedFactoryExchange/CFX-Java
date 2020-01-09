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

import org.ipc.cfx.structures.Operator;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Indicates that an operator is now active at or responsible for a process endpoint. 
            Having multiple operators (each needs to be activated and deactivated separately) or 
            an absence of an operator is possible. 
            
            {
              &quot;Operator&quot;: {
                &quot;OperatorIdentifier&quot;: &quot;42b7a5cc-3bbd-4010-8a01-1c5851b9a2a3&quot;,
                &quot;ActorType&quot;: &quot;Human&quot;,
                &quot;LastName&quot;: &quot;Smith&quot;,
                &quot;FirstName&quot;: &quot;Bill&quot;,
                &quot;LoginName&quot;: &quot;bill.smith@domain1.com&quot;
              }
            }
 * original type: CFX.Production.OperatorActivated
 */
public class OperatorActivated extends CFXMessage {

  private Operator operator;

  /**
   * A structure which defines the Operator.
   * @param operator the value
   */
  @JsonSetter("Operator")
  public OperatorActivated setOperator(Operator operator) {
    this.operator = operator;
    return this;
  }

  /**
   * A structure which defines the Operator.
   * @return Operator
   */
  @JsonGetter("Operator")
  public Operator getOperator() {
    return operator;
  }
}
