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
 * created: 23.05.2019 09:24:13 by frankp
 */
package org.ipc.cfx.transport;

import javax.xml.ws.handler.MessageContext;

import org.ipc.cfx.CFXEnvelope;

import amqp.listener.LinkEndpoint;

/**
 * 
 * original type: CFX.Transport.InternalIncomingLinkEndpoint
 */
public class InternalIncomingLinkEndpoint extends LinkEndpoint {
  public InternalIncomingLinkEndpoint(AmqpRequestProcessor requestProcessor, String targetAddress) {
    parentProcessor = requestProcessor;
    this.targetAddress = targetAddress;
  }

  private AmqpRequestProcessor parentProcessor;
  private String targetAddress;

  public void OnMessage(MessageContext messageContext) {
//    try {
//      CFXEnvelope message = AmqpUtilities.EnvelopeFromMessage(messageContext.Message);
//      if (message != null) {
//        parentProcessor.fire_OnMessageReceivedFromListener(targetAddress, message);
//      } else {
//        AmqpRequestProcessor.logger.warn("Undecodeable message received on listener {0}", targetAddress);
//      }
//    } catch (Exception ex) {
//      AmqpRequestProcessor.logger.error("error", ex);
//    }

//    messageContext.complete();
  }

//  public void OnFlow(FlowContext flowContext) {}
//
//  public void OnDisposition(DispositionContext dispositionContext) {}
}
