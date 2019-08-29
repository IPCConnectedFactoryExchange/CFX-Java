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
 * created: 20.08.2019 15:52:36 by frankp
 */
package org.ipc.cfx.structures;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Uniquely identifies a particular Work Order (or Work Order sub-batch)
 * original type: CFX.Structures.WorkOrderIdentifier
 */
public class WorkOrderIdentifier {

  private String workOrderId;
  private String batch;

  /**
   * The order number of the Work Order
   */
  @JsonSetter("WorkOrderId")
  public void setWorkOrderId(String workOrderId) {
    this.workOrderId = workOrderId;
  }

  /**
   * The order number of the Work Order
   *
   * @return never null
   */
  @JsonGetter("WorkOrderId")
  public String getWorkOrderId() {
    return workOrderId == null ? "" : workOrderId;
  }

  /**
   * For Work Orders that are divided into two or more sub-batches, this property indicates
            the name of the sub-batch.
   */
  @JsonSetter("Batch")
  public void setBatch(String batch) {
    this.batch = batch;
  }

  /**
   * For Work Orders that are divided into two or more sub-batches, this property indicates
            the name of the sub-batch.
   *
   * @return never null
   */
  @JsonGetter("Batch")
  public String getBatch() {
    return batch == null ? "" : batch;
  }
}
