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
package org.ipc.cfx.resourceperformance;

import org.ipc.cfx.structures.Calibration;
import org.ipc.cfx.CFXMessage;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Sent when calibration of any sort has been performed at an endpoint.
            
            {
              "Calibration": {
                "CalibrationCode": "FID1",
                "CalibrationType": "UnitPosition",
                "Comments": "Position Check.  Fiducial FID1."
              }
            }
 * original type: CFX.ResourcePerformance.CalibrationPerformed
 */
public class CalibrationPerformed extends CFXMessage {

  private Calibration calibration;

  /**
   * A dynamic structure describing the calibration that was performed.
            The structure may varty depending on the native of the calibration.
   */
  @JsonSetter("Calibration")
  public void setCalibration(Calibration calibration) {
    this.calibration = calibration;
  }

  /**
   * A dynamic structure describing the calibration that was performed.
            The structure may varty depending on the native of the calibration.
   */
  @JsonGetter("Calibration")
  public Calibration getCalibration() {
    return calibration;
  }
}
