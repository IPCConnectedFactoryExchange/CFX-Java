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
   * @param uniqueIdentifier the value
   */
  @JsonSetter("UniqueIdentifier")
  public Measurement setUniqueIdentifier(String uniqueIdentifier) {
    this.uniqueIdentifier = uniqueIdentifier;
    return this;
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
   * @param measurementName the value
   */
  @JsonSetter("MeasurementName")
  public Measurement setMeasurementName(String measurementName) {
    this.measurementName = measurementName;
    return this;
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
   * @param timeRecorded the value
   */
  @JsonSetter("TimeRecorded")
  public Measurement setTimeRecorded(Date timeRecorded) {
    this.timeRecorded = timeRecorded;
    return this;
  }

  /**
   * The date/time when this Measurement was recorded (if known, otherwise null)
   * @return TimeRecorded
   */
  @JsonGetter("TimeRecorded")
  public Date getTimeRecorded() {
    return timeRecorded;
  }

  /**
   * An optional positive integer describing the sequence in which the tests or measurements were performed
            that resulted in this Reading.
            ///
   * @param sequence the value
   */
  @JsonSetter("Sequence")
  public Measurement setSequence(int sequence) {
    this.sequence = sequence;
    return this;
  }

  /**
   * An optional positive integer describing the sequence in which the tests or measurements were performed
            that resulted in this Reading.
            ///
   * @return Sequence
   */
  @JsonGetter("Sequence")
  public int getSequence() {
    return sequence;
  }

  /**
   * An enumeration indicating whether or not this measurement is considered acceptable.
   * @param result the value
   */
  @JsonSetter("Result")
  public Measurement setResult(TestResult result) {
    this.result = result;
    return this;
  }

  /**
   * An enumeration indicating whether or not this measurement is considered acceptable.
   * @return Result
   */
  @JsonGetter("Result")
  public TestResult getResult() {
    return result;
  }

  /**
   * The overall result of the verification of the measurement
   * @param verification the value
   */
  @JsonSetter("Verification")
  public Measurement setVerification(VerificationResult verification) {
    this.verification = verification;
    return this;
  }

  /**
   * The overall result of the verification of the measurement
   * @return Verification
   */
  @JsonGetter("Verification")
  public VerificationResult getVerification() {
    return verification;
  }

  /**
   * An optional list of component designators (instances of a part) on a production unit(s) to be associated with this measurement.
            May include sub-components in &quot;.&quot; notation.  Examples:  R1, R2, R3   or  R2.3 (R2, pin 3)
   * @param cRDs the value
   */
  @JsonSetter("CRDs")
  public Measurement setCRDs(String cRDs) {
    this.cRDs = cRDs;
    return this;
  }

  /**
   * An optional list of component designators (instances of a part) on a production unit(s) to be associated with this measurement.
            May include sub-components in &quot;.&quot; notation.  Examples:  R1, R2, R3   or  R2.3 (R2, pin 3)
   *
   * @return never null
   */
  @JsonGetter("CRDs")
  public String getCRDs() {
    return cRDs == null ? "" : cRDs;
  }
}
