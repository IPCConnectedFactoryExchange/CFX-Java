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
 * This file was manually created
 * source: CFX.DLL, Version 1.0.15.0
 * created: 23.05.2019 09:24:13 by frankp
 */
package org.ipc.cfx.utilities;

import java.io.IOException;

import org.ipc.cfx.CFXEnvelope;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

/**
 * 
 * original type: CFX.Utilities.CFXJsonSerializer
 */
public class CFXJsonSerializer {

  private CFXJsonSerializer() {}

  public static String serializeObject(Object o) {
    return serializeObject(o, false);
  }

  public static String serializeObject(Object o, boolean formatted) {

    ObjectMapper objectMapper = new ObjectMapper();

    String k;
    try {
      objectMapper.registerModule(new JavaTimeModule());
      objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
      if (formatted) {
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
      }
      k = objectMapper.writeValueAsString(o);
      return k;
    } catch (JsonProcessingException e) {
      LoggerFactory.getLogger(CFXEnvelope.class).error("unable to serialize object", e);

    }
    return "";
  }

  public static String serializeObjectWithTypes(Object o) {
    return serializeObject(o, false);
  }

  public static Object deserializeObject(String jsonData) {

    ObjectMapper objectMapper = new ObjectMapper();

    try {
      return objectMapper.readValue(jsonData, CFXEnvelope.class);
    } catch (IOException e) {
      LoggerFactory.getLogger(CFXJsonSerializer.class).error("unable to serialize object with class", e);

    }
    return null;
  }

  public static Object deserializeObject(String jsonData, Class<?> type) {

    ObjectMapper objectMapper = new ObjectMapper();

    try {
      return objectMapper.readValue(jsonData, type);
    } catch (IOException e) {
      LoggerFactory.getLogger(CFXEnvelope.class).error("unable to deserialize object with class", e);
    }
    return null;
  }

}
