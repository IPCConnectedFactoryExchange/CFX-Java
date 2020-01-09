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
              &quot;Reason&quot;: &quot;ExpiredMaterial&quot;,
              &quot;Comments&quot;: &quot;MSD Material Has Expired&quot;,
              &quot;Locations&quot;: [
                {
                  &quot;LocationIdentifier&quot;: &quot;23143433&quot;,
                  &quot;LocationName&quot;: &quot;SLOT45&quot;,
                  &quot;MaterialPackage&quot;: null,
                  &quot;CarrierInformation&quot;: null
                },
                {
                  &quot;LocationIdentifier&quot;: &quot;23143454&quot;,
                  &quot;LocationName&quot;: &quot;SLOT46&quot;,
                  &quot;MaterialPackage&quot;: null,
                  &quot;CarrierInformation&quot;: null
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
   * @param reason the value
   */
  @JsonSetter("Reason")
  public BlockMaterialLocationsRequest setReason(BlockReason reason) {
    this.reason = reason;
    return this;
  }

  /**
   * An enumeration indicating the reason for the block.
   * @return Reason
   */
  @JsonGetter("Reason")
  public BlockReason getReason() {
    return reason;
  }

  /**
   * Free form comments indicating additional information about this block event.
   * @param comments the value
   */
  @JsonSetter("Comments")
  public BlockMaterialLocationsRequest setComments(String comments) {
    this.comments = comments;
    return this;
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
   * @param locations the value
   */
  @JsonSetter("Locations")
  public BlockMaterialLocationsRequest setLocations(MaterialLocation[] locations) {
    this.locations = locations;
    return this;
  }

  /**
   * A list of locations to be blocked
   * @return Locations
   */
  @JsonGetter("Locations")
  public MaterialLocation[] getLocations() {
    return locations;
  }
}
