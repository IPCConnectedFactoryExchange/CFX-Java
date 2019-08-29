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
 * This file was automatically created and manually modified
 * source: CFX.DLL, Version 1.0.15.0
 * created: 27.05.2019 08:35:34 by frankp
 */
package org.ipc.cfx.resourceperformance;

import org.ipc.cfx.structures.ResourceState;
import org.ipc.cfx.utilities.StateConverter;
import org.ipc.cfx.structures.Fault;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent by a process endpoint when the production state transitions
            from one state to another per its state model. 
            Example 1 (State change with no related fault):
            {
              "OldState": 2200,
              "OldStateDuration": "00:01:25",
              "NewState": 1100,
              "RelatedFault": null
            }
            Example 2 (State change with related fault):
            {
              "OldState": 1100,
              "OldStateDuration": "00:00:25",
              "NewState": 5500,
              "RelatedFault": {
                "Cause": "MechanicalFailure",
                "Severity": "Error",
                "FaultCode": "ERROR 3943480",
                "FaultOccurrenceId": "3de0cfce-42f4-4302-982b-96dba4ec3de0",
                "Lane": null,
                "Stage": null,
                "SideLocation": "Unknown",
                "AccessType": "Unknown"
              }
            }
 * original type: CFX.ResourcePerformance.StationStateChanged
 */
public class StationStateChanged extends CFXMessage {

  private ResourceState oldState;
  private Long oldStateDuration;
  private ResourceState newState;
  private Fault relatedFault;

  /**
   * An enumeration indicating the previous state prior to this state change
   */
  @JsonSetter("OldState")
  public void setOldState(ResourceState oldState) {
    this.oldState = oldState;
  }

  /**
   * An enumeration indicating the previous state prior to this state change
   */
  @JsonGetter("OldState")
  public ResourceState getOldState() {
    return oldState;
  }


  /**
   * Exposes vendor specific old state code (like 3312, for example) as its equivalent
            Semi E58 enumerated value.
            READ-ONLY HELPER PROPERTY, NOT A DATA PROPERTY.  WILL NOT APPEAR IN JSON DATA.
   */
  public ResourceState getOldE58State() {
    return StateConverter.getSemiE58State(oldState);
  }

  /**
   * The amount of time spent in the previous state.  Note:  There may be certain circumstances
            where it is impossible to provide this duration (as in the case of an unexpected power faillure or other extreme events).
            In this case it is acceptable to report a duration of "null", which will be interpreted as "unknown" by the receiver
            of this event.
   */
  @JsonSetter("OldStateDuration")
  public void setOldStateDuration(Long oldStateDuration) {
    this.oldStateDuration = oldStateDuration;
  }

  /**
   * The amount of time spent in the previous state.  Note:  There may be certain circumstances
            where it is impossible to provide this duration (as in the case of an unexpected power faillure or other extreme events).
            In this case it is acceptable to report a duration of "null", which will be interpreted as "unknown" by the receiver
            of this event.
   */
  @JsonGetter("OldStateDuration")
  public Long getOldStateDuration() {
    return oldStateDuration;
  }

  /**
   * The new state
   */
  @JsonSetter("NewState")
  public void setNewState(ResourceState newState) {
    this.newState = newState;
  }

  /**
   * The new state
   */
  @JsonGetter("NewState")
  public ResourceState getNewState() {
    return newState;
  }



  /**
   * Exposes vendor specific new state code (like 3312, for example), as its equivalent
            Semi E58 enumerated value.
            READ-ONLY HELPER PROPERTY, NOT A DATA PROPERTY.  WILL NOT APPEAR IN JSON DATA.
   */
  public ResourceState getNewE58State() {
    return StateConverter.getSemiE58State(oldState);
  }

  /**
   * In the case of a stoppage, information about the Fault which caused the stoppage.
            Otherwise null.
   */
  @JsonSetter("RelatedFault")
  public void setRelatedFault(Fault relatedFault) {
    this.relatedFault = relatedFault;
  }

  /**
   * In the case of a stoppage, information about the Fault which caused the stoppage.
            Otherwise null.
   */
  @JsonGetter("RelatedFault")
  public Fault getRelatedFault() {
    return relatedFault;
  }
}
