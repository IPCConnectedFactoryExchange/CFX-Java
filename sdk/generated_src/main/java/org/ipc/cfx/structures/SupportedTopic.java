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
package org.ipc.cfx.structures;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * 
 * original type: CFX.Structures.SupportedTopic
 */
public class SupportedTopic {

  private String topicName;
  private TopicSupportType topicSupportType;
  private String[] supportedMessages;

  /**
   * TheIf not supporting all messages, then a list of supported messages
   * @param topicName the value
   */
  @JsonSetter("TopicName")
  public void setTopicName(String topicName) {
    this.topicName = topicName;
  }

  /**
   * TheIf not supporting all messages, then a list of supported messages
   *
   * @return never null
   */
  @JsonGetter("TopicName")
  public String getTopicName() {
    return topicName == null ? "" : topicName;
  }

  /**
   * Indicates the type of support the endpoint has for this topic.
   * @param topicSupportType the value
   */
  @JsonSetter("TopicSupportType")
  public void setTopicSupportType(TopicSupportType topicSupportType) {
    this.topicSupportType = topicSupportType;
  }

  /**
   * Indicates the type of support the endpoint has for this topic.
   * @return TopicSupportType
   */
  @JsonGetter("TopicSupportType")
  public TopicSupportType getTopicSupportType() {
    return topicSupportType;
  }

  /**
   * If an endpoint does not support ALL CFX messages that have been defined for a given CFX topic,
            then it must explicitly list which messages is does support.  An empty list implies that the 
            endpoint supports ALL messages of this topic.
   * @param supportedMessages the value
   */
  @JsonSetter("SupportedMessages")
  public void setSupportedMessages(String[] supportedMessages) {
    this.supportedMessages = supportedMessages;
  }

  /**
   * If an endpoint does not support ALL CFX messages that have been defined for a given CFX topic,
            then it must explicitly list which messages is does support.  An empty list implies that the 
            endpoint supports ALL messages of this topic.
   * @return SupportedMessages
   */
  @JsonGetter("SupportedMessages")
  public String[] getSupportedMessages() {
    return supportedMessages;
  }
}
