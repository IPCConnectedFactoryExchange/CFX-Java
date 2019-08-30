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
import org.ipc.cfx.structures.solderpasteprinting.SMTSqueegee;
import org.ipc.cfx.structures.solderpasteprinting.SMTStencil;
import org.ipc.cfx.structures.pressinsertion.PressTool;
import org.ipc.cfx.structures.smtplacement.SMTHeadAndNozzle;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

/**
 * Describes a tool that is used in production
            
            {
                &quot;UniqueIdentifier&quot;: &quot;UID23890430&quot;,
                &quot;Name&quot;: &quot;SQUEEGEE234324&quot;
            }
 * original type: CFX.Structures.Tool
 */
@JsonTypeInfo(use = Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "$type")
@JsonSubTypes({
  @Type(value = SMTSqueegee.class, name = "CFX.Structures.SolderPastePrinting.SMTSqueegee, CFX"),
  @Type(value = SMTStencil.class, name = "CFX.Structures.SolderPastePrinting.SMTStencil, CFX"),
  @Type(value = PressTool.class, name = "CFX.Structures.PressInsertion.PressTool, CFX"),
  @Type(value = SMTHeadAndNozzle.class, name = "CFX.Structures.SMTPlacement.SMTHeadAndNozzle, CFX"),
})
public class Tool {

  private String uniqueIdentifier;
  private String name;

  /**
   * The unique identifier of the Tool (barcode, RFID, etc.)
   * @param uniqueIdentifier the value
   */
  @JsonSetter("UniqueIdentifier")
  public void setUniqueIdentifier(String uniqueIdentifier) {
    this.uniqueIdentifier = uniqueIdentifier;
  }

  /**
   * The unique identifier of the Tool (barcode, RFID, etc.)
   *
   * @return never null
   */
  @JsonGetter("UniqueIdentifier")
  public String getUniqueIdentifier() {
    return uniqueIdentifier == null ? "" : uniqueIdentifier;
  }

  /**
   * The name of the tool
   * @param name the value
   */
  @JsonSetter("Name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The name of the tool
   *
   * @return never null
   * property inherited from Tool 
   */
  @JsonGetter("Name")
  public String getName() {
    return name == null ? "" : name;
  }
}
