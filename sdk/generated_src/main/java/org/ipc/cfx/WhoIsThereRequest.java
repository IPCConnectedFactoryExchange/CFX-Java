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
 * created: 22.11.2019 10:40:12 by frankp
 */
package org.ipc.cfx;

import org.ipc.cfx.structures.SupportedTopicQueryType;
import org.ipc.cfx.structures.SupportedTopic;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Allows any CFX endpoint to discover all of the other endpoints participating in this CFX network, 
             and their capabilities. All other CFX endpoints matching the specified criteria
             must then respond to this broadcast.  The response includes the endpoint&apos;s identity (CFX Handle),
             as well as the information needed to contact the endpoint.
             
             {
               &quot;SupportedTopicQueryType&quot;: &quot;All&quot;,
               &quot;SupportedTopics&quot;: [
                 {
                   &quot;TopicName&quot;: &quot;CFX.Production&quot;,
                   &quot;TopicSupportType&quot;: &quot;Publisher&quot;,
                   &quot;SupportedMessages&quot;: []
                 },
                 {
                   &quot;TopicName&quot;: &quot;CFX.Production.Appplication&quot;,
                   &quot;TopicSupportType&quot;: &quot;Publisher&quot;,
                   &quot;SupportedMessages&quot;: []
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
   * @param supportedTopicQueryType the value
   */
  @JsonSetter("SupportedTopicQueryType")
  public WhoIsThereRequest setSupportedTopicQueryType(SupportedTopicQueryType supportedTopicQueryType) {
    this.supportedTopicQueryType = supportedTopicQueryType;
    return this;
  }

  /**
   * If the sender is interested only in certain types of endpoints, 
            tbis property specifies how SupportedTopics list will be interpreted.
   * @return SupportedTopicQueryType
   */
  @JsonGetter("SupportedTopicQueryType")
  public SupportedTopicQueryType getSupportedTopicQueryType() {
    return supportedTopicQueryType;
  }

  /**
   * An optional list of CFX topics.  Only machines supporting any or all of these
            CFX topics will respond to this broadcast.
   * @param supportedTopics the value
   */
  @JsonSetter("SupportedTopics")
  public WhoIsThereRequest setSupportedTopics(SupportedTopic[] supportedTopics) {
    this.supportedTopics = supportedTopics;
    return this;
  }

  /**
   * An optional list of CFX topics.  Only machines supporting any or all of these
            CFX topics will respond to this broadcast.
   * @return SupportedTopics
   */
  @JsonGetter("SupportedTopics")
  public SupportedTopic[] getSupportedTopics() {
    return supportedTopics;
  }
}
