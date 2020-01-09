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
 * created: 22.11.2019 10:40:17 by frankp
 */
package org.ipc.cfx.structures;

import java.util.Date;
import java.util.UUID;
import org.ipc.cfx.structures.solderapplication.SelectiveActivity;
import org.ipc.cfx.structures.smtplacement.SMTNozzleChangeActivity;
import org.ipc.cfx.structures.smtplacement.SMTPlacementActivity;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Dynamic structure base class.  Describes an activity that was performed in the course of processing one or more
            production units.  Different endpoints may produce more specific structures derived from this generic Activity structure.
 * original type: CFX.Structures.Activity
 */
@JsonTypeInfo(use = Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "$type")
@JsonSubTypes({
  @Type(value = UnitAlignmentActivity.class, name = "CFX.Structures.UnitAlignmentActivity, CFX"),
  @Type(value = UnitConveyingActivity.class, name = "CFX.Structures.UnitConveyingActivity, CFX"),
  @Type(value = UnitLoadActivity.class, name = "CFX.Structures.UnitLoadActivity, CFX"),
  @Type(value = UnitUnloadActivity.class, name = "CFX.Structures.UnitUnloadActivity, CFX"),
  @Type(value = SelectiveActivity.class, name = "CFX.Structures.SolderApplication.SelectiveActivity, CFX"),
  @Type(value = SMTNozzleChangeActivity.class, name = "CFX.Structures.SMTPlacement.SMTNozzleChangeActivity, CFX"),
  @Type(value = SMTPlacementActivity.class, name = "CFX.Structures.SMTPlacement.SMTPlacementActivity, CFX"),
})
public class Activity {

  private Date timeStamp;
  private UUID activityInstanceId;
  private ActivityState activityState;
  private String activityName;
  private String comments;
  private ValueAddType valueAddType;

  /**
   * The time when the activity transitioned to the state specified by the
            ActivityState property.
   * @param timeStamp the value
   */
  @JsonSetter("TimeStamp")
  public Activity setTimeStamp(Date timeStamp) {
    this.timeStamp = timeStamp;
    return this;
  }

  /**
   * The time when the activity transitioned to the state specified by the
            ActivityState property.
   * @return TimeStamp
   */
  @JsonGetter("TimeStamp")
  public Date getTimeStamp() {
    return timeStamp;
  }

  /**
   * An id uniquely identfying a particular instance of an activity.  If the same activity occurs x times, each
            instance shall have a unique identifier.
   * @param activityInstanceId the value
   */
  @JsonSetter("ActivityInstanceId")
  public Activity setActivityInstanceId(UUID activityInstanceId) {
    this.activityInstanceId = activityInstanceId;
    return this;
  }

  /**
   * An id uniquely identfying a particular instance of an activity.  If the same activity occurs x times, each
            instance shall have a unique identifier.
   * @return ActivityInstanceId
   */
  @JsonGetter("ActivityInstanceId")
  public UUID getActivityInstanceId() {
    return activityInstanceId;
  }

  /**
   * The current state of the activity (started, completed, etc.).
   * @param activityState the value
   */
  @JsonSetter("ActivityState")
  public Activity setActivityState(ActivityState activityState) {
    this.activityState = activityState;
    return this;
  }

  /**
   * The current state of the activity (started, completed, etc.).
   * @return ActivityState
   */
  @JsonGetter("ActivityState")
  public ActivityState getActivityState() {
    return activityState;
  }

  /**
   * The name of the activity.
   * @param activityName the value
   */
  @JsonSetter("ActivityName")
  public Activity setActivityName(String activityName) {
    this.activityName = activityName;
    return this;
  }

  /**
   * The name of the activity.
   *
   * @return never null
   */
  @JsonGetter("ActivityName")
  public String getActivityName() {
    return activityName == null ? "" : activityName;
  }

  /**
   * Optional free-form comments associated with the activity.
   * @param comments the value
   */
  @JsonSetter("Comments")
  public Activity setComments(String comments) {
    this.comments = comments;
    return this;
  }

  /**
   * Optional free-form comments associated with the activity.
   *
   * @return never null
   */
  @JsonGetter("Comments")
  public String getComments() {
    return comments == null ? "" : comments;
  }

  /**
   * An enumeration describing the value-add nature of an activity or process.
   * @param valueAddType the value
   */
  @JsonSetter("ValueAddType")
  public Activity setValueAddType(ValueAddType valueAddType) {
    this.valueAddType = valueAddType;
    return this;
  }

  /**
   * An enumeration describing the value-add nature of an activity or process.
   * @return ValueAddType
   */
  @JsonGetter("ValueAddType")
  public ValueAddType getValueAddType() {
    return valueAddType;
  }
}
