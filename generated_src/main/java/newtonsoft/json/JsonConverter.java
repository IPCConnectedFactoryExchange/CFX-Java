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
 * source: Newtonsoft.Json.DLL, Version 12.0.0.0
 * created: 20.08.2019 15:52:37 by frankp
 */
package newtonsoft.json;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import org.ipc.cfx.structures.pcbinspection.Converter;
import org.ipc.cfx.structures.pcbinspection.Converter;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

/**
 * Converts an object to and from JSON.
 * original type: Newtonsoft.Json.JsonConverter
 */
@JsonTypeInfo(use = Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "$type")
@JsonSubTypes({
  @Type(value = Converter.class, name = "CFX.Structures.PCBInspection.Converter, CFX"),
  @Type(value = Converter.class, name = "CFX.Structures.PCBInspection.Converter, CFX"),
})
public class JsonConverter {

  private boolean canRead;
  private boolean canWrite;

  /**
   * Gets a value indicating whether this  can read JSON.
   */
  @JsonSetter("CanRead")
  public void setCanRead(boolean canRead) {
    this.canRead = canRead;
  }

  /**
   * Gets a value indicating whether this  can read JSON.
   */
  @JsonGetter("CanRead")
  public boolean isCanRead() {
    return canRead;
  }

  /**
   * Gets a value indicating whether this  can write JSON.
   */
  @JsonSetter("CanWrite")
  public void setCanWrite(boolean canWrite) {
    this.canWrite = canWrite;
  }

  /**
   * Gets a value indicating whether this  can write JSON.
   */
  @JsonGetter("CanWrite")
  public boolean isCanWrite() {
    return canWrite;
  }
}
