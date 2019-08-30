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
package org.ipc.cfx.structures.smtplacement;

import com.fasterxml.jackson.annotation.JsonValue;
// assembly CFX : version = 1.1.3.0
public enum SMDTapePitch {
  ADJUSTABLE("Adjustable"),
  PITCH2MM("Pitch2mm"),
  PITCH4MM("Pitch4mm"),
  PITCH8MM("Pitch8mm"),
  PITCH12MM("Pitch12mm"),
  PITCH16MM("Pitch16mm"),
  PITCH24MM("Pitch24mm"),
  PITCH32MM("Pitch32mm"),
  PITCH36MM("Pitch36mm"),
  OTHER("Other");
  private String text;

  private SMDTapePitch(String text) {
    this.text = text;
  }

  @JsonValue
    public String getText() {
      return text;
    }

  }
