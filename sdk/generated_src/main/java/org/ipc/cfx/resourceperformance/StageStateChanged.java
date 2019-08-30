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
package org.ipc.cfx.resourceperformance;

import org.ipc.cfx.structures.Stage;
import org.ipc.cfx.structures.ResourceState;
import org.ipc.cfx.structures.Fault;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent by a process endpoint when the production state of one of its
            stages transitions from one state to another per its state model. 
            
            {
              &quot;Stage&quot;: {
                &quot;StageSequence&quot;: 2,
                &quot;StageName&quot;: &quot;STAGE2&quot;,
                &quot;StageType&quot;: &quot;Work&quot;
              },
              &quot;Lane&quot;: null,
              &quot;OldState&quot;: 2200,
              &quot;OldStateDuration&quot;: &quot;00:01:25&quot;,
              &quot;NewState&quot;: 1100,
              &quot;RelatedFault&quot;: null
            }
 * original type: CFX.ResourcePerformance.StageStateChanged
 */
public class StageStateChanged extends CFXMessage {

  private Stage stage;
  private Integer lane;
  private ResourceState oldState;
  private ResourceState oldE58State;
  private Long oldStateDuration;
  private ResourceState newState;
  private ResourceState newE58State;
  private Fault relatedFault;

  /**
   * The name of the stage that has changed state
   * @param stage the value
   */
  @JsonSetter("Stage")
  public void setStage(Stage stage) {
    this.stage = stage;
  }

  /**
   * The name of the stage that has changed state
   * @return Stage
   */
  @JsonGetter("Stage")
  public Stage getStage() {
    return stage;
  }

  /**
   * The relevant production lane (if applicable)
   * @param lane the value
   */
  @JsonSetter("Lane")
  public void setLane(Integer lane) {
    this.lane = lane;
  }

  /**
   * The relevant production lane (if applicable)
   * @return Lane
   */
  @JsonGetter("Lane")
  public Integer getLane() {
    return lane;
  }

  /**
   * The previous state prior to this state change
   * @param oldState the value
   */
  @JsonSetter("OldState")
  public void setOldState(ResourceState oldState) {
    this.oldState = oldState;
  }

  /**
   * The previous state prior to this state change
   * @return OldState
   */
  @JsonGetter("OldState")
  public ResourceState getOldState() {
    return oldState;
  }

  /**
   * Exposes vendor specific old state code (like 3312, for example) as its equivalent
            Semi E58 enumerated value.
            READ-ONLY HELPER PROPERTY, NOT A DATA PROPERTY.  WILL NOT APPEAR IN JSON DATA.
   * @param oldE58State the value
   */
  @JsonSetter("OldE58State")
  public void setOldE58State(ResourceState oldE58State) {
    this.oldE58State = oldE58State;
  }

  /**
   * Exposes vendor specific old state code (like 3312, for example) as its equivalent
            Semi E58 enumerated value.
            READ-ONLY HELPER PROPERTY, NOT A DATA PROPERTY.  WILL NOT APPEAR IN JSON DATA.
   * @return OldE58State
   */
  @JsonGetter("OldE58State")
  public ResourceState getOldE58State() {
    return oldE58State;
  }

  /**
   * The amount of time spent in the previous state.  Note:  There may be certain circumstances
            where it is impossible to provide this duration (as in the case of an unexpected power faillure or other extreme events).
            In this case it is acceptable to report a duration of &quot;null&quot;, which will be interpreted as &quot;unknown&quot; by the receiver
            of this event.
   * @param oldStateDuration the value
   */
  @JsonSetter("OldStateDuration")
  public void setOldStateDuration(Long oldStateDuration) {
    this.oldStateDuration = oldStateDuration;
  }

  /**
   * The amount of time spent in the previous state.  Note:  There may be certain circumstances
            where it is impossible to provide this duration (as in the case of an unexpected power faillure or other extreme events).
            In this case it is acceptable to report a duration of &quot;null&quot;, which will be interpreted as &quot;unknown&quot; by the receiver
            of this event.
   * @return OldStateDuration
   */
  @JsonGetter("OldStateDuration")
  public Long getOldStateDuration() {
    return oldStateDuration;
  }

  /**
   * The new state
   * @param newState the value
   */
  @JsonSetter("NewState")
  public void setNewState(ResourceState newState) {
    this.newState = newState;
  }

  /**
   * The new state
   * @return NewState
   */
  @JsonGetter("NewState")
  public ResourceState getNewState() {
    return newState;
  }

  /**
   * Exposes vendor specific new state code (like 3312, for example), as its equivalent
            Semi E58 enumerated value.
            READ-ONLY HELPER PROPERTY, NOT A DATA PROPERTY.  WILL NOT APPEAR IN JSON DATA.
   * @param newE58State the value
   */
  @JsonSetter("NewE58State")
  public void setNewE58State(ResourceState newE58State) {
    this.newE58State = newE58State;
  }

  /**
   * Exposes vendor specific new state code (like 3312, for example), as its equivalent
            Semi E58 enumerated value.
            READ-ONLY HELPER PROPERTY, NOT A DATA PROPERTY.  WILL NOT APPEAR IN JSON DATA.
   * @return NewE58State
   */
  @JsonGetter("NewE58State")
  public ResourceState getNewE58State() {
    return newE58State;
  }

  /**
   * In the case of a stoppage, information about the Fault which caused the stoppage.
            Otherwise null.
   * @param relatedFault the value
   */
  @JsonSetter("RelatedFault")
  public void setRelatedFault(Fault relatedFault) {
    this.relatedFault = relatedFault;
  }

  /**
   * In the case of a stoppage, information about the Fault which caused the stoppage.
            Otherwise null.
   * @return RelatedFault
   */
  @JsonGetter("RelatedFault")
  public Fault getRelatedFault() {
    return relatedFault;
  }
}
