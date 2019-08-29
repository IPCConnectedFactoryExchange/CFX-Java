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
 * This file was manually created
 * source: CFX.DLL, Version 1.0.15.0
 * created: 23.05.2019 09:24:13 by frankp
 */
package org.ipc.cfx;

import java.nio.charset.Charset;
import java.text.MessageFormat;

import org.ipc.cfx.utilities.CFXJsonSerializer;
import org.slf4j.LoggerFactory;

/**
 * Abstract base class for all CFX Messages. Contains no data members. Provides for the serialization and deserialization of messages to and from JSON
 * format. original type: CFX.CFXMessage version: 1.0.15.0
 */
public class CFXMessage {

  public String toJson() {
    return toJson(false);
  }

  public String toJson(boolean formatted) {
    return CFXJsonSerializer.serializeObject(this, formatted);
  }

  public static CFXMessage fromTypeName(String messageType) {
    Class<?> type;
    try {
      type = Class.forName(messageType);
      return (CFXMessage) type.newInstance();
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
      LoggerFactory.getLogger(CFXMessage.class).error(MessageFormat.format("Unable to get class forName {0}", messageType), e);
    }
    return null;
  }

  public static CFXMessage fromJson(String jsonData) {
    return (CFXMessage) CFXJsonSerializer.deserializeObject(jsonData);
  }

  public byte[] toBytes() {
    return CFXJsonSerializer.serializeObject(this).getBytes(Charset.defaultCharset());
  }

  public static CFXMessage fromBytes(byte[] data) {
    return (CFXMessage) CFXJsonSerializer.deserializeObject(new String(data));
  }
}
