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
 * Represents a task that was performed during a maintenance operation.
 * original type: CFX.Structures.MaintenanceTask
 */
public class MaintenanceTask {

  private String task;
  private String taskId;
  private Operator operator;
  private double manHoursConsumed;

  /**
   * Free form description of the task.
   * @param task the value
   */
  @JsonSetter("Task")
  public void setTask(String task) {
    this.task = task;
  }

  /**
   * Free form description of the task.
   *
   * @return never null
   */
  @JsonGetter("Task")
  public String getTask() {
    return task == null ? "" : task;
  }

  /**
   * A string based identifier that uniquely describes this particular instance of the task.
   * @param taskId the value
   */
  @JsonSetter("TaskId")
  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  /**
   * A string based identifier that uniquely describes this particular instance of the task.
   *
   * @return never null
   */
  @JsonGetter("TaskId")
  public String getTaskId() {
    return taskId == null ? "" : taskId;
  }

  /**
   * The operator who perform the task (optional)
   * @param operator the value
   */
  @JsonSetter("Operator")
  public void setOperator(Operator operator) {
    this.operator = operator;
  }

  /**
   * The operator who perform the task (optional)
   * @return Operator
   */
  @JsonGetter("Operator")
  public Operator getOperator() {
    return operator;
  }

  /**
   * The number of man-hours consumed while performing the task
   * @param manHoursConsumed the value
   */
  @JsonSetter("ManHoursConsumed")
  public void setManHoursConsumed(double manHoursConsumed) {
    this.manHoursConsumed = manHoursConsumed;
  }

  /**
   * The number of man-hours consumed while performing the task
   * @return ManHoursConsumed
   */
  @JsonGetter("ManHoursConsumed")
  public double getManHoursConsumed() {
    return manHoursConsumed;
  }
}
