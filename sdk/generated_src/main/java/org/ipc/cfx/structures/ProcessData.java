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

import org.ipc.cfx.structures.solderreflow.ReflowProcessData;
import org.ipc.cfx.structures.solderapplication.SelectiveSolderPCBProcessData;
import org.ipc.cfx.structures.solderapplication.SelectiveSolderProcessData;
import org.ipc.cfx.structures.reflowprofiling.ReflowProfilingProcessData;
import org.ipc.cfx.structures.lasermarking.LaserMarkingProcessData;
import org.ipc.cfx.structures.coating.CoatingProcessData;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

/**
 * Dynamic data structure representing data that was collected during the processing of a production unit or collection of units.
 * original type: CFX.Structures.ProcessData
 */
@JsonTypeInfo(use = Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "$type")
@JsonSubTypes({
  @Type(value = ReflowProcessData.class, name = "CFX.Structures.SolderReflow.ReflowProcessData, CFX"),
  @Type(value = SelectiveSolderPCBProcessData.class, name = "CFX.Structures.SolderApplication.SelectiveSolderPCBProcessData, CFX"),
  @Type(value = SelectiveSolderProcessData.class, name = "CFX.Structures.SolderApplication.SelectiveSolderProcessData, CFX"),
  @Type(value = ReflowProfilingProcessData.class, name = "CFX.Structures.ReflowProfiling.ReflowProfilingProcessData, CFX"),
  @Type(value = LaserMarkingProcessData.class, name = "CFX.Structures.LaserMarking.LaserMarkingProcessData, CFX"),
  @Type(value = CoatingProcessData.class, name = "CFX.Structures.Coating.CoatingProcessData, CFX"),
})
public class ProcessData {

}
