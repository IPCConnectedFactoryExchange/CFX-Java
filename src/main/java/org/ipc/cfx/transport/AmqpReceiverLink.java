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
 * source: CFX.DLL, Version 1.0.15.0
 * created: 23.05.2019 09:28:01 by frankp
 */
package org.ipc.cfx.transport;


/**
 * 
 * original type: CFX.Transport.AmqpReceiverLink
 */
public class AmqpReceiverLink extends AmqpLink {

  
  /**
   * 
   */
  private AmqpLink receiverLink;

  /**
   * 
   */
  public void setReceiverLink(AmqpLink receiverLink) {
    this.receiverLink = receiverLink;
  }

  /**
   * 
   */
  public AmqpLink getReceiverLink() {
    return receiverLink;
  }
}