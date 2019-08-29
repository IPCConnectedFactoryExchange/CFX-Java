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
package org.ipc.cfx.materials.transport;

import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * A request to an endpoint (such as an upper level system, MES, ERP, etc.) to check
            the status of a particular transport order.  A transport order is a directive to move
            materials / WIP / production units from one location to another.
            
            {
              "TransportOrderId": "TR329483249830000"
            }
 * original type: CFX.Materials.Transport.GetTransportOrderStatusRequest
 */
public class GetTransportOrderStatusRequest extends CFXMessage {

  private String transportOrderId;

  /**
   * The order number of the related transport order
   */
  @JsonSetter("TransportOrderId")
  public void setTransportOrderId(String transportOrderId) {
    this.transportOrderId = transportOrderId;
  }

  /**
   * The order number of the related transport order
   *
   * @return never null
   */
  @JsonGetter("TransportOrderId")
  public String getTransportOrderId() {
    return transportOrderId == null ? "" : transportOrderId;
  }
}
