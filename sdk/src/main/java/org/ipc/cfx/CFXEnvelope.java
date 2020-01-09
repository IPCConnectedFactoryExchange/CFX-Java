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
 * created: 23.05.2019 10:23:59 by frankp
 */
package org.ipc.cfx;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.ipc.cfx.utilities.CFXJsonSerializer;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * The  class is the outer envelope or container in which all CFX messages are enclosed for transmission.
            Common properties, such as a globally unique identifier (ID) and the timestamp for the message (TimeStamp),
            are defined by this container class and are included with all CFX message transmissions.
            
            {
               "MessageName": "CFX.EndpointConnected",
               "Version": "1.0",
               "TimeStamp": "2018-03-26T16:52:25.3769532-04:00",
               "UniqueID": "f3b2c8ec-50b7-4c63-9cb3-2ed57c01880f",
               "Source": null,
               "Target": null,
               "RequestID": null,
               "MessageBody": {
                 "CFXHandle": "SMTPlus.Model_21232.SN23123",
                 "RequestNetworkUri": "amqp://host33/",
                 "RequestTargetAddress": "/queue/SN23123"
                }
            }
 * original type: CFX.CFXEnvelope
 */
public class CFXEnvelope {

  public CFXEnvelope() {
    setUniqueID(UUID.randomUUID());
    setVersion(CFXVERSION);
    setTimeStamp(new Date());
    setQueueFilePosition(-1);
    setTransmitted(false);
  }

  public CFXEnvelope(Class<?> messageType) {
    this();
    setMessageBody(messageType);
  }

  public CFXEnvelope(String messageType) {
    this();
    try {
      
      String className = "org.ipc."+messageType;
      
      setMessageBody(Class.forName(className));
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public CFXEnvelope(CFXMessage message) {
    this();
    setMessageBody(message);
  }

  /**
   * 
   */
  private String messageName;

  /**
   * 
   */
  private String version;

  /**
   * 
   */
  private Date timeStamp;

  /**
   * 
   */
  private UUID uniqueID;

  /**
   * 
   */
  private String source;

  /**
   * 
   */
  private String target;

  /**
   * 
   */
  private String requestID;

  /**
   * The message payload (The CFX message enclosed in this envelope).
   */
  private Object messageBody;

  @JsonIgnore
  private long queueFilePosition;
  @JsonIgnore
  private boolean transmitted;

  public long getQueueFilePosition() {
    return queueFilePosition;
  }

  public void setQueueFilePosition(long queueFilePosition) {
    this.queueFilePosition = queueFilePosition;
  }

  public boolean isTransmitted() {
    return transmitted;
  }

  public void setTransmitted(boolean transmitted) {
    this.transmitted = transmitted;
  }

  /**
   * 
   */
  @JsonSetter("MessageName")
  public void setMessageName(String messageName) {
    this.messageName = messageName;
  }

  /**
   * 
   *
   * @return never null
   */
  @JsonGetter("MessageName")
  public String getMessageName() {
    return messageName == null ? "" : messageName;
  }

  /**
   * 
   */
  @JsonSetter("Version")
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   * 
   *
   * @return never null
   */
  @JsonGetter("Version")
  public String getVersion() {
    return version == null ? "" : version;
  }

  /**
   * 
   */
  @JsonSetter("TimeStamp")
  public void setTimeStamp(Date timeStamp) {
    this.timeStamp = timeStamp;
  }

  /**
   * 
   */
  @JsonGetter("TimeStamp")
  
  public Date getTimeStamp() {
    return timeStamp;
  }

  /**
   * 
   */
  @JsonSetter("UniqueID")
  public void setUniqueID(UUID uniqueID) {
    this.uniqueID = uniqueID;
  }

  /**
   * 
   */
  @JsonGetter("UniqueID")
  public UUID getUniqueID() {
    return uniqueID;
  }

  /**
   * 
   */
  @JsonSetter("Source")
  public void setSource(String source) {
    this.source = source;
  }

  /**
   * 
   *
   * @return never null
   */
  @JsonGetter("Source")
  public String getSource() {
    return source ;
  }

  /**
   * 
   */
  @JsonSetter("Target")
  public void setTarget(String target) {
    this.target = target;
  }

  /**
   * 
   *
   * @return never null
   */
  @JsonGetter("Target")
  public String getTarget() {
    return target ;
  }

  /**
   * 
   */
  @JsonSetter("RequestID")
  public void setRequestID(String requestID) {
    this.requestID = requestID;
  }

  /**
   * 
   *
   * @return never null
   */
  @JsonGetter("RequestID")
  public String getRequestID() {
    return requestID ;
  }

  /**
   * The message payload (The CFX message enclosed in this envelope).
   */
  @JsonSetter("MessageBody")
  public void setMessageBody(Object messageBody) {
    this.messageBody = messageBody;
    if (messageBody != null && messageBody.getClass().getCanonicalName().startsWith("org.ipc.cfx.")) {

      String msgName = "CFX." + messageBody.getClass().getCanonicalName().substring(12);

      // replace after a '.' a capital character
      int searchPos = 0;
      while (searchPos <= msgName.length()) {
        int nextpos = msgName.indexOf(".", searchPos);
        if (nextpos > 0) {
          String k = msgName.substring(nextpos + 1, nextpos + 2).toUpperCase();
          msgName = msgName.substring(0, nextpos + 1) + k + msgName.substring(nextpos + 2);
          searchPos = nextpos + 1;
        } else {
          searchPos = msgName.length() + 1;
        }
      }

      setMessageName(msgName);
      setVersion(CFXVERSION);
    }
  }

  /**
   * The message payload (The CFX message enclosed in this envelope).
   */
  @JsonGetter("MessageBody")
  public Object getMessageBody() {
    return messageBody;
  }

  // original field: CFXVERSION
  private static final String CFXVERSION = "1.0";

  // public T GetMessage<T>()
  // {
  // return (T) MessageBody;
  // }

  public String toJson() {
    return CFXJsonSerializer.serializeObject(this, false);
  }

  public String toJson(boolean formatted) {
    return CFXJsonSerializer.serializeObject(this, formatted);
  }

  public static CFXEnvelope fromCFXMessage(CFXMessage msg) {
    return new CFXEnvelope(msg);
  }

  public static CFXEnvelope fromJson(String jsonData) {
    CFXEnvelope env = (CFXEnvelope) CFXJsonSerializer.deserializeObject(jsonData);
    try {
      Class<?> tp = Class.forName(toClassName(env.getMessageName()));
      
      int stx = jsonData.indexOf("MessageBody");
      int stxColon = jsonData.indexOf(":", stx);
      int endIndex = jsonData.lastIndexOf("}");
      
      String msgBody = jsonData.substring(stxColon+1, endIndex);
      
      env.setMessageBody(CFXJsonSerializer.deserializeObject(msgBody, tp));
    } catch (ClassNotFoundException e) {
      LoggerFactory.getLogger(CFXEnvelope.class).error("unable to deserialize class", e);
      e.printStackTrace();
    }
    return env;
  }

  private static String toClassName(String messageName) {
    String namespace = messageName.substring(0, messageName.lastIndexOf('.')).toLowerCase();
    String typeName = messageName.substring(messageName.lastIndexOf('.') + 1, messageName.length());
    return "org.ipc." + namespace + "." + typeName;
  }

  public static List<CFXEnvelope> fromJsonList(String jsonData) {
    List<CFXEnvelope> list = (List<CFXEnvelope>) CFXJsonSerializer.deserializeObject(jsonData, List.class);
    for (CFXEnvelope env : list) {

      try {
        Class<?> tp = Class.forName(env.getMessageName());
        env.setMessageBody(CFXJsonSerializer.deserializeObject(env.getMessageBody().toString(), tp));
      } catch (ClassNotFoundException e) {
        LoggerFactory.getLogger(CFXEnvelope.class).error("unable to deserialize class", e);
      }
    }

    return list;
  }

  public static CFXEnvelope ReadRecord(DataInputStream reader) {
    try {
      // long filePosition = reader..BaseStream.Position
      boolean transmitted = reader.readBoolean();
      int len = reader.readInt();
      byte[] data = new byte[len];
      int readBytes = reader.read(data, 0, len);
      CFXEnvelope result = fromBytes(data);
      // result.setQueueFilePosition ( filePosition)
      result.setTransmitted(transmitted);
      return result;
    } catch (Exception ex) {
      LoggerFactory.getLogger(CFXMessage.class).error("Unable to read from reader", ex);
    }

    return null;
  }

  public void WriteRecord(DataOutputStream writer) {
    // setQueueFilePosition ( writer.BaseStream.Position);
    try {
      writer.writeBoolean(isTransmitted());
      byte[] data = this.toBytes();
      writer.writeInt(data.length);
      writer.write(this.toBytes(), 0, data.length);
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public void SetRecordTransmitted(Writer writer) {
    // try
    // {
    // setTransmitted( true);
    //
    // if (getQueueFilePosition() != -1)
    // {
    // long curPos = writer.BaseStream.Position;
    // if (writer.BaseStream.Seek(getQueueFilePosition(), SeekOrigin.Begin) == getQueueFilePosition())
    // {
    // writer.Write(isTransmitted());
    // writer.BaseStream.Seek(curPos, SeekOrigin.Begin);
    // }
    //
    // writer.flush(); }
    // }
    // catch (Exception e)
    // {
    // LoggerFactory.getLogger(CFXMessage.class).error("Unable to write to writer", e);
    // }
  }

  public byte[] toBytes() {
    return this.toJson().getBytes(StandardCharsets.UTF_8);
  }

  public static CFXEnvelope fromBytes(byte[] data) {
    return CFXEnvelope.fromJson(new String(data, StandardCharsets.UTF_8));
  }

}
