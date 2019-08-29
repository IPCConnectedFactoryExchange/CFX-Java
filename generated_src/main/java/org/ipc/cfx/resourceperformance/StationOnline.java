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
package org.ipc.cfx.resourceperformance;

import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent by a process endpoint when it is ready for communication to resume, for example, powered up, maintenance over, etc. 
            
            {
              "OfflineDuration": "00:23:00"
            }
 * original type: CFX.ResourcePerformance.StationOnline
 */
public class StationOnline extends CFXMessage {

  private Long offlineDuration;

  /**
   * The total amount of time the endpoint was offline prior to this notification.  Note:  There may be certain circumstances
            where it is impossible to provide this duration (as in the case of an unexpected power faillure or other extreme events).
            In this case it is acceptable to report a duration of "null", which will be interpreted as "unknown" by the receiver
            of this event.
   */
  @JsonSetter("OfflineDuration")
  public void setOfflineDuration(Long offlineDuration) {
    this.offlineDuration = offlineDuration;
  }

  /**
   * The total amount of time the endpoint was offline prior to this notification.  Note:  There may be certain circumstances
            where it is impossible to provide this duration (as in the case of an unexpected power faillure or other extreme events).
            In this case it is acceptable to report a duration of "null", which will be interpreted as "unknown" by the receiver
            of this event.
   */
  @JsonGetter("OfflineDuration")
  public Long getOfflineDuration() {
    return offlineDuration;
  }
}
