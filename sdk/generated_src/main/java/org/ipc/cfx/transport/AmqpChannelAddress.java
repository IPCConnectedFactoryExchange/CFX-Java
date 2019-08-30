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
package org.ipc.cfx.transport;

import java.net.URI;

/**
 * Represetns and AMQP source or target, comprised of a network address, and an AMQP source or target address.
            (eg.  amqps://user1:password1@myamqpbroker.company1.com, amqp://broker3.company1.com, etc.)
 * original type: CFX.Transport.AmqpChannelAddress
 */
public class AmqpChannelAddress {

  private URI uri;
  private String address;

  /**
   * The network address of the AMQP source or target.  May include user and port information in
            standard Uri format. (eg.  amqps://user1:password1@myamqpbroker.company1.com, amqp://broker3.company1.com, 
            amqps://myamqpbroker.company1.com:8856, etc.).
   * @param uri the value
   */
  public void setUri(URI uri) {
    this.uri = uri;
  }

  /**
   * The network address of the AMQP source or target.  May include user and port information in
            standard Uri format. (eg.  amqps://user1:password1@myamqpbroker.company1.com, amqp://broker3.company1.com, 
            amqps://myamqpbroker.company1.com:8856, etc.).
   * @return Uri
   */
  public URI getUri() {
    return uri;
  }

  /**
   * The AMQP 1.0 source or target address (eg.  /exchange/exchange1, /queue/queue1, etc.)
   * @param address the value
   */
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * The AMQP 1.0 source or target address (eg.  /exchange/exchange1, /queue/queue1, etc.)
   *
   * @return never null
   */
  public String getAddress() {
    return address == null ? "" : address;
  }
}
