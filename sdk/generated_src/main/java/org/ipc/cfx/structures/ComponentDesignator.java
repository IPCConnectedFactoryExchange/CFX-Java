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

import org.ipc.cfx.structures.pressinsertion.Connector;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Represents and identifies a particular component (instance of a part) on a production unit, or a particular aspect
            of a particular component, such as an individual pin of an electronic component.
 * original type: CFX.Structures.ComponentDesignator
 */
@JsonTypeInfo(use = Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "$type")
@JsonSubTypes({
  @Type(value = Connector.class, name = "CFX.Structures.PressInsertion.Connector, CFX"),
})
public class ComponentDesignator {

  private String referenceDesignator;
  private UnitPosition unitPosition;
  private String partNumber;

  /**
   * A dot (&quot;.&quot;) and comma (&quot;,&quot;) delimeted string identifying a particular component on a production unit.  
            
            Examples:
            
            C34
            U2.11  (component U2, Pin 11)
            U2.1-45 (component U2, Pins 1 to 45)
            U2.1,2 (component U2, Pins 1 and 2)
   * @param referenceDesignator the value
   */
  @JsonSetter("ReferenceDesignator")
  public ComponentDesignator setReferenceDesignator(String referenceDesignator) {
    this.referenceDesignator = referenceDesignator;
    return this;
  }

  /**
   * A dot (&quot;.&quot;) and comma (&quot;,&quot;) delimeted string identifying a particular component on a production unit.  
            
            Examples:
            
            C34
            U2.11  (component U2, Pin 11)
            U2.1-45 (component U2, Pins 1 to 45)
            U2.1,2 (component U2, Pins 1 and 2)
   *
   * @return never null
   */
  @JsonGetter("ReferenceDesignator")
  public String getReferenceDesignator() {
    return referenceDesignator == null ? "" : referenceDesignator;
  }

  /**
   * Identifies the related production unit
   * @param unitPosition the value
   */
  @JsonSetter("UnitPosition")
  public ComponentDesignator setUnitPosition(UnitPosition unitPosition) {
    this.unitPosition = unitPosition;
    return this;
  }

  /**
   * Identifies the related production unit
   * @return UnitPosition
   */
  @JsonGetter("UnitPosition")
  public UnitPosition getUnitPosition() {
    return unitPosition;
  }

  /**
   * The internal part number of the designated component.
   * @param partNumber the value
   */
  @JsonSetter("PartNumber")
  public ComponentDesignator setPartNumber(String partNumber) {
    this.partNumber = partNumber;
    return this;
  }

  /**
   * The internal part number of the designated component.
   *
   * @return never null
   */
  @JsonGetter("PartNumber")
  public String getPartNumber() {
    return partNumber == null ? "" : partNumber;
  }
}
