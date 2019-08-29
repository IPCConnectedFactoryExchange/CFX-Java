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
 * created: 20.08.2019 15:52:18 by frankp
 */
package org.ipc.cfx.structures;

import java.util.Date;
import org.ipc.cfx.structures.solderpasteinspection.SolderPasteMeasurement;
import org.ipc.cfx.structures.pcbinspection.OffsetMeasurement;
import org.ipc.cfx.structures.coating.CoatingMeasurement;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Abstract base class for dynamic data structure which describes a measurement that was made by a human
            or by automated equipment in the course of inspecting or testing a production unit
 * original type: CFX.Structures.Measurement
 */
@JsonTypeInfo(use = Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "$type")
@JsonSubTypes({
  @Type(value = BooleanMeasurement.class, name = "CFX.Structures.BooleanMeasurement, CFX"),
  @Type(value = NumericMeasurement.class, name = "CFX.Structures.NumericMeasurement, CFX"),
  @Type(value = TextMeasurement.class, name = "CFX.Structures.TextMeasurement, CFX"),
  @Type(value = SolderPasteMeasurement.class, name = "CFX.Structures.SolderPasteInspection.SolderPasteMeasurement, CFX"),
  @Type(value = OffsetMeasurement.class, name = "CFX.Structures.PCBInspection.OffsetMeasurement, CFX"),
  @Type(value = CoatingMeasurement.class, name = "CFX.Structures.Coating.CoatingMeasurement, CFX"),
})
public class Measurement {

  private String uniqueIdentifier;
  private String measurementName;
  private Date timeRecorded;
  private int sequence;
  private TestResult result;
  private VerificationResult verification;
  private String cRDs;

  /**
   * A unique identifier that for this particular measurement instance
            (new and unique each time a new measurement is made or repeated).
   */
  @JsonSetter("UniqueIdentifier")
  public void setUniqueIdentifier(String uniqueIdentifier) {
    this.uniqueIdentifier = uniqueIdentifier;
  }

  /**
   * A unique identifier that for this particular measurement instance
            (new and unique each time a new measurement is made or repeated).
   *
   * @return never null
   */
  @JsonGetter("UniqueIdentifier")
  public String getUniqueIdentifier() {
    return uniqueIdentifier == null ? "" : uniqueIdentifier;
  }

  /**
   * A name that uniquely describes the test or measurement that was performed.
   */
  @JsonSetter("MeasurementName")
  public void setMeasurementName(String measurementName) {
    this.measurementName = measurementName;
  }

  /**
   * A name that uniquely describes the test or measurement that was performed.
   *
   * @return never null
   */
  @JsonGetter("MeasurementName")
  public String getMeasurementName() {
    return measurementName == null ? "" : measurementName;
  }

  /**
   * The date/time when this Measurement was recorded (if known, otherwise null)
   */
  @JsonSetter("TimeRecorded")
  public void setTimeRecorded(Date timeRecorded) {
    this.timeRecorded = timeRecorded;
  }

  /**
   * The date/time when this Measurement was recorded (if known, otherwise null)
   */
  @JsonGetter("TimeRecorded")
  public Date getTimeRecorded() {
    return timeRecorded;
  }

  /**
   * An optional positive integer describing the sequence in which the tests or measurements were performed
            that resulted in this Reading.
            ///
   */
  @JsonSetter("Sequence")
  public void setSequence(int sequence) {
    this.sequence = sequence;
  }

  /**
   * An optional positive integer describing the sequence in which the tests or measurements were performed
            that resulted in this Reading.
            ///
   */
  @JsonGetter("Sequence")
  public int getSequence() {
    return sequence;
  }

  /**
   * An enumeration indicating whether or not this measurement is considered acceptable.
   */
  @JsonSetter("Result")
  public void setResult(TestResult result) {
    this.result = result;
  }

  /**
   * An enumeration indicating whether or not this measurement is considered acceptable.
   */
  @JsonGetter("Result")
  public TestResult getResult() {
    return result;
  }

  /**
   * The overall result of the verification of the measurement
   */
  @JsonSetter("Verification")
  public void setVerification(VerificationResult verification) {
    this.verification = verification;
  }

  /**
   * The overall result of the verification of the measurement
   */
  @JsonGetter("Verification")
  public VerificationResult getVerification() {
    return verification;
  }

  /**
   * An optional list of component designators (instances of a part) on a production unit(s) to be associated with this measurement.
            May include sub-components in "." notation.  Examples:  R1, R2, R3   or  R2.3 (R2, pin 3)
   */
  @JsonSetter("CRDs")
  public void setCRDs(String cRDs) {
    this.cRDs = cRDs;
  }

  /**
   * An optional list of component designators (instances of a part) on a production unit(s) to be associated with this measurement.
            May include sub-components in "." notation.  Examples:  R1, R2, R3   or  R2.3 (R2, pin 3)
   *
   * @return never null
   */
  @JsonGetter("CRDs")
  public String getCRDs() {
    return cRDs == null ? "" : cRDs;
  }
}
