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
   */
  @JsonSetter("ReadingIdentifier")
  public void setReadingIdentifier(String readingIdentifier) {
    this.readingIdentifier = readingIdentifier;
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
   */
  @JsonSetter("TimeRecorded")
  public void setTimeRecorded(Date timeRecorded) {
    this.timeRecorded = timeRecorded;
  }

  /**
   * The date/time when this Reading was recorded.
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
  @JsonSetter("ReadingSequence")
  public void setReadingSequence(int readingSequence) {
    this.readingSequence = readingSequence;
  }

  /**
   * An optional positive integer describing the sequence in which the tests or measurements were performed
            that resulted in this Reading.
            ///
   */
  @JsonGetter("ReadingSequence")
  public int getReadingSequence() {
    return readingSequence;
  }

  /**
   * An enumeration indicating whether or not this reading is considered acceptable.
   */
  @JsonSetter("Result")
  public void setResult(TestResult result) {
    this.result = result;
  }

  /**
   * An enumeration indicating whether or not this reading is considered acceptable.
   */
  @JsonGetter("Result")
  public TestResult getResult() {
    return result;
  }

  /**
   * In the case that this Reading is associated to a particular production unit, and the Reading is not associated
            with a work transaction, this property contains the unique identifier of the production unit.
   */
  @JsonSetter("UnitIdentifier")
  public void setUnitIdentifier(String unitIdentifier) {
    this.unitIdentifier = unitIdentifier;
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
   */
  @JsonSetter("UnitPositionNumber")
  public void setUnitPositionNumber(Integer unitPositionNumber) {
    this.unitPositionNumber = unitPositionNumber;
  }

  /**
   * In the case that this Reading is associated with a particular production unit, and the Reading is associated
            with a work transaction, this property contains the position number of the unit as it relates to the transaction.  
            If a position number is not specified, it is assumed that the Reading applies to all units associated with the
            transaction.
   */
  @JsonGetter("UnitPositionNumber")
  public Integer getUnitPositionNumber() {
    return unitPositionNumber;
  }

  /**
   * An optional list of components (instance of a part) on a production unit(s) to be associated with this reading.
   */
  @JsonSetter("Components")
  public void setComponents(ComponentDesignator[] components) {
    this.components = components;
  }

  /**
   * An optional list of components (instance of a part) on a production unit(s) to be associated with this reading.
   */
  @JsonGetter("Components")
  public ComponentDesignator[] getComponents() {
    return components;
  }

  /**
   * An enumeration describing the type of value contained in the Value or BinaryValue properties.
   */
  @JsonSetter("ValueDataType")
  public void setValueDataType(DataType valueDataType) {
    this.valueDataType = valueDataType;
  }

  /**
   * An enumeration describing the type of value contained in the Value or BinaryValue properties.
   */
  @JsonGetter("ValueDataType")
  public DataType getValueDataType() {
    return valueDataType;
  }

  /**
   * The units of the value (must be a valid SI unit)
   */
  @JsonSetter("ValueUnits")
  public void setValueUnits(String valueUnits) {
    this.valueUnits = valueUnits;
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
   */
  @JsonSetter("ValueMimeType")
  public void setValueMimeType(String valueMimeType) {
    this.valueMimeType = valueMimeType;
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
   */
  @JsonSetter("Value")
  public void setValue(String value) {
    this.value = value;
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
   */
  @JsonSetter("BinaryValue")
  public void setBinaryValue(Byte[] binaryValue) {
    this.binaryValue = binaryValue;
  }

  /**
   * If the Reading is of type DataType.Binary, this property contains the binary
            representation of the value.
   */
  @JsonGetter("BinaryValue")
  public Byte[] getBinaryValue() {
    return binaryValue;
  }

  /**
   * The expected value
   */
  @JsonSetter("ExpectedValue")
  public void setExpectedValue(String expectedValue) {
    this.expectedValue = expectedValue;
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
   */
  @JsonSetter("ExpectedValueUnits")
  public void setExpectedValueUnits(String expectedValueUnits) {
    this.expectedValueUnits = expectedValueUnits;
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
   */
  @JsonSetter("MinimumAcceptableValue")
  public void setMinimumAcceptableValue(String minimumAcceptableValue) {
    this.minimumAcceptableValue = minimumAcceptableValue;
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
   */
  @JsonSetter("MaximumAcceptableValue")
  public void setMaximumAcceptableValue(String maximumAcceptableValue) {
    this.maximumAcceptableValue = maximumAcceptableValue;
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
