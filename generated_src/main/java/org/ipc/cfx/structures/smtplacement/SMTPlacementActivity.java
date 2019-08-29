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
package org.ipc.cfx.structures.smtplacement;

import org.ipc.cfx.structures.Activity;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * A specialized type of Activity that occurs when a unit is under placement
 * original type: CFX.Structures.SMTPlacement.SMTPlacementActivity
 */
public class SMTPlacementActivity extends Activity {

  private SMTPlacementType placementType;
  private SMTHeadInformation head;

  /**
   * The type of placement for this activity
   */
  @JsonSetter("PlacementType")
  public void setPlacementType(SMTPlacementType placementType) {
    this.placementType = placementType;
  }

  /**
   * The type of placement for this activity
   */
  @JsonGetter("PlacementType")
  public SMTPlacementType getPlacementType() {
    return placementType;
  }

  /**
   * The Head used for the placement
   */
  @JsonSetter("Head")
  public void setHead(SMTHeadInformation head) {
    this.head = head;
  }

  /**
   * The Head used for the placement
   */
  @JsonGetter("Head")
  public SMTHeadInformation getHead() {
    return head;
  }
}
