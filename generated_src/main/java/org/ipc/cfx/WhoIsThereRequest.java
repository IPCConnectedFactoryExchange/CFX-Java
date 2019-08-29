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
 * created: 20.08.2019 15:52:18 by frankp
 */
package org.ipc.cfx;

import org.ipc.cfx.structures.SupportedTopicQueryType;
import org.ipc.cfx.structures.SupportedTopic;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Allows any CFX endpoint to discover all of the other endpoints participating in this CFX network, 
             and their capabilities. All other CFX endpoints matching the specified criteria
             must then respond to this broadcast.  The response includes the endpoint's identity (CFX Handle),
             as well as the information needed to contact the endpoint.
             
             {
               "SupportedTopicQueryType": "All",
               "SupportedTopics": [
                 {
                   "TopicName": "CFX.Production",
                   "TopicSupportType": "Publisher",
                   "SupportedMessages": []
                 },
                 {
                   "TopicName": "CFX.Production.Appplication",
                   "TopicSupportType": "Publisher",
                   "SupportedMessages": []
                 }
               ]
             }
 * original type: CFX.WhoIsThereRequest
 */
public class WhoIsThereRequest extends CFXMessage {

  private SupportedTopicQueryType supportedTopicQueryType;
  private SupportedTopic[] supportedTopics;

  /**
   * If the sender is interested only in certain types of endpoints, 
            tbis property specifies how SupportedTopics list will be interpreted.
   */
  @JsonSetter("SupportedTopicQueryType")
  public void setSupportedTopicQueryType(SupportedTopicQueryType supportedTopicQueryType) {
    this.supportedTopicQueryType = supportedTopicQueryType;
  }

  /**
   * If the sender is interested only in certain types of endpoints, 
            tbis property specifies how SupportedTopics list will be interpreted.
   */
  @JsonGetter("SupportedTopicQueryType")
  public SupportedTopicQueryType getSupportedTopicQueryType() {
    return supportedTopicQueryType;
  }

  /**
   * An optional list of CFX topics.  Only machines supporting any or all of these
            CFX topics will respond to this broadcast.
   */
  @JsonSetter("SupportedTopics")
  public void setSupportedTopics(SupportedTopic[] supportedTopics) {
    this.supportedTopics = supportedTopics;
  }

  /**
   * An optional list of CFX topics.  Only machines supporting any or all of these
            CFX topics will respond to this broadcast.
   */
  @JsonGetter("SupportedTopics")
  public SupportedTopic[] getSupportedTopics() {
    return supportedTopics;
  }
}
