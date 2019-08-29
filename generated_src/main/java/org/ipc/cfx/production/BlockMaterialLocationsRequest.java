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
package org.ipc.cfx.production;

import org.ipc.cfx.structures.BlockReason;
import org.ipc.cfx.structures.MaterialLocation;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent to a process endpoint to block or disable a particular material setup location. 
            This is typically used where a loaded material may become unsuitable for use, 
            for example MSD expiry of an SMT material.
            
            {
              "Reason": "ExpiredMaterial",
              "Comments": "MSD Material Has Expired",
              "Locations": [
                {
                  "LocationIdentifier": "23143433",
                  "LocationName": "SLOT45",
                  "MaterialPackage": null,
                  "CarrierInformation": null
                },
                {
                  "LocationIdentifier": "23143454",
                  "LocationName": "SLOT46",
                  "MaterialPackage": null,
                  "CarrierInformation": null
                }
              ]
            }
 * original type: CFX.Production.BlockMaterialLocationsRequest
 */
public class BlockMaterialLocationsRequest extends CFXMessage {

  private BlockReason reason;
  private String comments;
  private MaterialLocation[] locations;

  /**
   * An enumeration indicating the reason for the block.
   */
  @JsonSetter("Reason")
  public void setReason(BlockReason reason) {
    this.reason = reason;
  }

  /**
   * An enumeration indicating the reason for the block.
   */
  @JsonGetter("Reason")
  public BlockReason getReason() {
    return reason;
  }

  /**
   * Free form comments indicating additional information about this block event.
   */
  @JsonSetter("Comments")
  public void setComments(String comments) {
    this.comments = comments;
  }

  /**
   * Free form comments indicating additional information about this block event.
   *
   * @return never null
   */
  @JsonGetter("Comments")
  public String getComments() {
    return comments == null ? "" : comments;
  }

  /**
   * A list of locations to be blocked
   */
  @JsonSetter("Locations")
  public void setLocations(MaterialLocation[] locations) {
    this.locations = locations;
  }

  /**
   * A list of locations to be blocked
   */
  @JsonGetter("Locations")
  public MaterialLocation[] getLocations() {
    return locations;
  }
}
