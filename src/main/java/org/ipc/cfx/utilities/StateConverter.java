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

import org.ipc.cfx.structures.ResourceState;

/**
 * Utility helper class for converting numeric state codes to and from SEMI enumerations
 * original type: CFX.Utilities.StateConverter
 */
public class StateConverter {


  
  public static ResourceState getSemiE10State(ResourceState state)
  {
      ResourceState result = ResourceState.NST;
      int code = (state.ordinal() / 1000) * 1000;

      try {
      result = ResourceState.values()[code];
      }catch (Exception e) {
        result = ResourceState.NST;
      }

      return result;
  }  
  /// <summary>
  /// Converts a semi state code to its E10 equivalent.
  /// </summary>
  /// <param name="state"></param>
  /// <returns></returns>
  public static ResourceState getSemiE58State(ResourceState state)
  {
      ResourceState result = ResourceState.NST;
      int code = (state.ordinal() / 100) * 100;
try {
      result = ResourceState.values()[code];
  }catch (Exception e) {
    result = ResourceState.NST;
  }

      return result;
  }
}
