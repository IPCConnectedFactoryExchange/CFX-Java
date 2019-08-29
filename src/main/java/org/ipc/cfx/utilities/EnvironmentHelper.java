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

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 
 * original type: CFX.Utilities.EnvironmentHelper
 */
public class EnvironmentHelper {

	public static String getMachineName() {
		try {
			InetAddress ip = InetAddress.getLocalHost();
			return ip.getHostName();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		return "";
	}
}
