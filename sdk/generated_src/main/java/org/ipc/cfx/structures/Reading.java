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
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * 
 * original type: CFX.Structures.Reading
 */
public class Reading {

  private String readingIdentifier;
  private Date timeRecorded;
  private int readingSequence;
  private TestResult result;
  private String unitIdentifier;
  private Integer unitPositionNumber;
  private ComponentDesignator[] components;
  private DataType valueDataType;
  private String valueUnits;
  private String valueMimeType;
  private String value;
  private Byte[] binaryValue;
  private String expectedValue;
  private String expectedValueUnits;
  private String minimumAcceptableValue;
  private String maximumAcceptableValue;

  /**
   * A name that uniquely describes the test or measurement that was performed.
   * @param readingIdentifier the value
   */
  @JsonSetter("ReadingIdentifier")
  public Reading setReadingIdentifier(String readingIdentifier) {
    this.readingIdentifier = readingIdentifier;
    return this;
  }

  /**
   * A name that uniquely describes the test or measurement that was performed.
   *
   * @return never null
   */
  @JsonGetter("ReadingIdentifier")
  public String getReadingIdentifier() {
    return readingIdentifier == null ? "" : readingIdentifier;
  }

  /**
   * The date/time when this Reading was recorded.
   * @param timeRecorded the value
   */
  @JsonSetter("TimeRecorded")
  public Reading setTimeRecorded(Date timeRecorded) {
    this.timeRecorded = timeRecorded;
    return this;
  }

  /**
   * The date/time when this Reading was recorded.
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
   * @param readingSequence the value
   */
  @JsonSetter("ReadingSequence")
  public Reading setReadingSequence(int readingSequence) {
    this.readingSequence = readingSequence;
    return this;
  }

  /**
   * An optional positive integer describing the sequence in which the tests or measurements were performed
            that resulted in this Reading.
            ///
   * @return ReadingSequence
   */
  @JsonGetter("ReadingSequence")
  public int getReadingSequence() {
    return readingSequence;
  }

  /**
   * An enumeration indicating whether or not this reading is considered acceptable.
   * @param result the value
   */
  @JsonSetter("Result")
  public Reading setResult(TestResult result) {
    this.result = result;
    return this;
  }

  /**
   * An enumeration indicating whether or not this reading is considered acceptable.
   * @return Result
   */
  @JsonGetter("Result")
  public TestResult getResult() {
    return result;
  }

  /**
   * In the case that this Reading is associated to a particular production unit, and the Reading is not associated
            with a work transaction, this property contains the unique identifier of the production unit.
   * @param unitIdentifier the value
   */
  @JsonSetter("UnitIdentifier")
  public Reading setUnitIdentifier(String unitIdentifier) {
    this.unitIdentifier = unitIdentifier;
    return this;
  }

  /**
   * In the case that this Reading is associated to a particular production unit, and the Reading is not associated
            with a work transaction, this property contains the unique identifier of the production unit.
   *
   * @return never null
   */
  @JsonGetter("UnitIdentifier")
  public String getUnitIdentifier() {
    return unitIdentifier == null ? "" : unitIdentifier;
  }

  /**
   * In the case that this Reading is associated with a particular production unit, and the Reading is associated
            with a work transaction, this property contains the position number of the unit as it relates to the transaction.  
            If a position number is not specified, it is assumed that the Reading applies to all units associated with the
            transaction.
   * @param unitPositionNumber the value
   */
  @JsonSetter("UnitPositionNumber")
  public Reading setUnitPositionNumber(Integer unitPositionNumber) {
    this.unitPositionNumber = unitPositionNumber;
    return this;
  }

  /**
   * In the case that this Reading is associated with a particular production unit, and the Reading is associated
            with a work transaction, this property contains the position number of the unit as it relates to the transaction.  
            If a position number is not specified, it is assumed that the Reading applies to all units associated with the
            transaction.
   * @return UnitPositionNumber
   */
  @JsonGetter("UnitPositionNumber")
  public Integer getUnitPositionNumber() {
    return unitPositionNumber;
  }

  /**
   * An optional list of components (instance of a part) on a production unit(s) to be associated with this reading.
   * @param components the value
   */
  @JsonSetter("Components")
  public Reading setComponents(ComponentDesignator[] components) {
    this.components = components;
    return this;
  }

  /**
   * An optional list of components (instance of a part) on a production unit(s) to be associated with this reading.
   * @return Components
   */
  @JsonGetter("Components")
  public ComponentDesignator[] getComponents() {
    return components;
  }

  /**
   * An enumeration describing the type of value contained in the Value or BinaryValue properties.
   * @param valueDataType the value
   */
  @JsonSetter("ValueDataType")
  public Reading setValueDataType(DataType valueDataType) {
    this.valueDataType = valueDataType;
    return this;
  }

  /**
   * An enumeration describing the type of value contained in the Value or BinaryValue properties.
   * @return ValueDataType
   */
  @JsonGetter("ValueDataType")
  public DataType getValueDataType() {
    return valueDataType;
  }

  /**
   * The units of the value (must be a valid SI unit)
   * @param valueUnits the value
   */
  @JsonSetter("ValueUnits")
  public Reading setValueUnits(String valueUnits) {
    this.valueUnits = valueUnits;
    return this;
  }

  /**
   * The units of the value (must be a valid SI unit)
   *
   * @return never null
   */
  @JsonGetter("ValueUnits")
  public String getValueUnits() {
    return valueUnits == null ? "" : valueUnits;
  }

  /**
   * If the Reading is of type DataType.Binary, this property contains the MIME type
            of the binary data contained in the BinaryValue property.
   * @param valueMimeType the value
   */
  @JsonSetter("ValueMimeType")
  public Reading setValueMimeType(String valueMimeType) {
    this.valueMimeType = valueMimeType;
    return this;
  }

  /**
   * If the Reading is of type DataType.Binary, this property contains the MIME type
            of the binary data contained in the BinaryValue property.
   *
   * @return never null
   */
  @JsonGetter("ValueMimeType")
  public String getValueMimeType() {
    return valueMimeType == null ? "" : valueMimeType;
  }

  /**
   * The value of the reading
   * @param value the value
   */
  @JsonSetter("Value")
  public Reading setValue(String value) {
    this.value = value;
    return this;
  }

  /**
   * The value of the reading
   *
   * @return never null
   */
  @JsonGetter("Value")
  public String getValue() {
    return value == null ? "" : value;
  }

  /**
   * If the Reading is of type DataType.Binary, this property contains the binary
            representation of the value.
   * @param binaryValue the value
   */
  @JsonSetter("BinaryValue")
  public Reading setBinaryValue(Byte[] binaryValue) {
    this.binaryValue = binaryValue;
    return this;
  }

  /**
   * If the Reading is of type DataType.Binary, this property contains the binary
            representation of the value.
   * @return BinaryValue
   */
  @JsonGetter("BinaryValue")
  public Byte[] getBinaryValue() {
    return binaryValue;
  }

  /**
   * The expected value
   * @param expectedValue the value
   */
  @JsonSetter("ExpectedValue")
  public Reading setExpectedValue(String expectedValue) {
    this.expectedValue = expectedValue;
    return this;
  }

  /**
   * The expected value
   *
   * @return never null
   */
  @JsonGetter("ExpectedValue")
  public String getExpectedValue() {
    return expectedValue == null ? "" : expectedValue;
  }

  /**
   * The units of the expected value (must be a valid SI unit)
   * @param expectedValueUnits the value
   */
  @JsonSetter("ExpectedValueUnits")
  public Reading setExpectedValueUnits(String expectedValueUnits) {
    this.expectedValueUnits = expectedValueUnits;
    return this;
  }

  /**
   * The units of the expected value (must be a valid SI unit)
   *
   * @return never null
   */
  @JsonGetter("ExpectedValueUnits")
  public String getExpectedValueUnits() {
    return expectedValueUnits == null ? "" : expectedValueUnits;
  }

  /**
   * The minimum acceptable value
   * @param minimumAcceptableValue the value
   */
  @JsonSetter("MinimumAcceptableValue")
  public Reading setMinimumAcceptableValue(String minimumAcceptableValue) {
    this.minimumAcceptableValue = minimumAcceptableValue;
    return this;
  }

  /**
   * The minimum acceptable value
   *
   * @return never null
   */
  @JsonGetter("MinimumAcceptableValue")
  public String getMinimumAcceptableValue() {
    return minimumAcceptableValue == null ? "" : minimumAcceptableValue;
  }

  /**
   * The maximum acceptable value
   * @param maximumAcceptableValue the value
   */
  @JsonSetter("MaximumAcceptableValue")
  public Reading setMaximumAcceptableValue(String maximumAcceptableValue) {
    this.maximumAcceptableValue = maximumAcceptableValue;
    return this;
  }

  /**
   * The maximum acceptable value
   *
   * @return never null
   */
  @JsonGetter("MaximumAcceptableValue")
  public String getMaximumAcceptableValue() {
    return maximumAcceptableValue == null ? "" : maximumAcceptableValue;
  }
}
