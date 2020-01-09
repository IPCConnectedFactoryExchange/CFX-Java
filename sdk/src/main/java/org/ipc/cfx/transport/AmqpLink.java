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
 * created: 23.05.2019 09:25:47 by frankp
 * and manually modified
 */
package org.ipc.cfx.transport;

import org.apache.qpid.amqp_1_0.client.Session;

/**
 * 
 * original type: CFX.Transport.AmqpLink
 */
public class AmqpLink {

  
  /**
   * 
   */
  private Session session;
  
  /**
   * 
   */
  private AmqpLink link;
  
  /**
   * 
   */
  private boolean isClosed;
  
  /**
   * 
   */
  private String address;
  
  /**
   * 
   */
  private LinkType linkType;

  /**
   * 
   */
  public void setSession(Session session) {
    this.session = session;
  }

  /**
   * 
   */
  public Session getSession() {
    return session;
  }

  /**
   * 
   */
  public void setLink(AmqpLink link) {
    this.link = link;
  }

  /**
   * 
   */
  public AmqpLink getLink() {
    return link;
  }

  /**
   * 
   */
  public void setIsClosed(boolean isClosed) {
    this.isClosed = isClosed;
  }

  /**
   * 
   */
  public boolean isIsClosed() {
    return isClosed;
  }

  /**
   * 
   */
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * 
   *
   * @return never null
   */
  public String getAddress() {
    return address == null ? "" : address;
  }

  /**
   * 
   */
  public void setLinkType(LinkType linkType) {
    this.linkType = linkType;
  }

  /**
   * 
   */
  public LinkType getLinkType() {
    return linkType;
  }
  
  public AmqpLink(String address)
  {
      this.address = address;
  }  
}
