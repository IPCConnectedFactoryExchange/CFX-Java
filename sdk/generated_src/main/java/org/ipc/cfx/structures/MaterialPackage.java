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

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Describes a specific, single handling unit of a particular material, such as a reel of SMT parts,
            a bag of parts, bin of parts, etc.
 * original type: CFX.Structures.MaterialPackage
 */
public class MaterialPackage {

  private String uniqueIdentifier;
  private String internalPartNumber;
  private double quantity;
  private org.ipc.cfx.structures.MaterialPackage leadingMaterialPackage;
  private String batchId;
  private org.ipc.cfx.structures.MaterialPackage batchMaterialPackage;
  private double greyZone;

  /**
   * The Unique identifier of the material package (barcode/RFID that identifies
            this specific material package.
   * @param uniqueIdentifier the value
   */
  @JsonSetter("UniqueIdentifier")
  public MaterialPackage setUniqueIdentifier(String uniqueIdentifier) {
    this.uniqueIdentifier = uniqueIdentifier;
    return this;
  }

  /**
   * The Unique identifier of the material package (barcode/RFID that identifies
            this specific material package.
   *
   * @return never null
   */
  @JsonGetter("UniqueIdentifier")
  public String getUniqueIdentifier() {
    return uniqueIdentifier == null ? "" : uniqueIdentifier;
  }

  /**
   * The internal part number of the material package
   * @param internalPartNumber the value
   */
  @JsonSetter("InternalPartNumber")
  public MaterialPackage setInternalPartNumber(String internalPartNumber) {
    this.internalPartNumber = internalPartNumber;
    return this;
  }

  /**
   * The internal part number of the material package
   *
   * @return never null
   */
  @JsonGetter("InternalPartNumber")
  public String getInternalPartNumber() {
    return internalPartNumber == null ? "" : internalPartNumber;
  }

  /**
   * The quantity of parts or material contained within this material package.
   * @param quantity the value
   */
  @JsonSetter("Quantity")
  public MaterialPackage setQuantity(double quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * The quantity of parts or material contained within this material package.
   * @return Quantity
   */
  @JsonGetter("Quantity")
  public double getQuantity() {
    return quantity;
  }

  /**
   * Gets or sets the next spliced material package.
            
            When the placement machine is using tape material the operator can splice a new tape onto the existing material.
            This will lead to a chain of material. Physically the existing reel with the barcode will be separated from the
            already mounted tape and a new tape with its reel will be appended to the material. This leads to the situation that
            the material chain can only be identified by the newest material added to the chain (known as the &quot;trailing&quot; material package)
            using the barcode on its reel.  Typically the placement machine is consuming from the &quot;leading&quot; package of the chain.
            So the assumption is that we may build a chain B-&gt;A by splicing B to A, where A is the &quot;leading&quot;
            material package (consumed first), and B is the &quot;trailing&quot; material package (consumed last).  In this situation, the chain
            will be identified only by the barcode of B, and the MaterialPackage structure of B will have its LeadingMaterialPackage
            property set to A.  It should be noted that it is possible and permissible to form chains of more than 2 material packages.
            In this situation, each material package in the chain will have the LeadingMaterialPackage property set to the next package
            in the chain (with the exception of the material package that is currently being consumed (the &quot;leading&quot; material package).
   * @param leadingMaterialPackage the value
   */
  @JsonSetter("LeadingMaterialPackage")
  public MaterialPackage setLeadingMaterialPackage(org.ipc.cfx.structures.MaterialPackage leadingMaterialPackage) {
    this.leadingMaterialPackage = leadingMaterialPackage;
    return this;
  }

  /**
   * Gets or sets the next spliced material package.
            
            When the placement machine is using tape material the operator can splice a new tape onto the existing material.
            This will lead to a chain of material. Physically the existing reel with the barcode will be separated from the
            already mounted tape and a new tape with its reel will be appended to the material. This leads to the situation that
            the material chain can only be identified by the newest material added to the chain (known as the &quot;trailing&quot; material package)
            using the barcode on its reel.  Typically the placement machine is consuming from the &quot;leading&quot; package of the chain.
            So the assumption is that we may build a chain B-&gt;A by splicing B to A, where A is the &quot;leading&quot;
            material package (consumed first), and B is the &quot;trailing&quot; material package (consumed last).  In this situation, the chain
            will be identified only by the barcode of B, and the MaterialPackage structure of B will have its LeadingMaterialPackage
            property set to A.  It should be noted that it is possible and permissible to form chains of more than 2 material packages.
            In this situation, each material package in the chain will have the LeadingMaterialPackage property set to the next package
            in the chain (with the exception of the material package that is currently being consumed (the &quot;leading&quot; material package).
   * @return LeadingMaterialPackage
   */
  @JsonGetter("LeadingMaterialPackage")
  public org.ipc.cfx.structures.MaterialPackage getLeadingMaterialPackage() {
    return leadingMaterialPackage;
  }

  /**
   * Gets or sets the batch identifier.
            
            There is material in the factory where not each material unit is identifiable. This is the case for
            Trays for example. Trays are delivered as a batch of trays. But each tray does not have a unique ID, only
            the batch of trays has a unique ID.
            In this case, we assume that the unique Batch ID is in the property
            BatchID and each tray which is been mounted will get a temporary UniqueIdentifier as long as it is been
            mounted on the machine. See BatchMaterialPackage for more details.
   * @param batchId the value
   */
  @JsonSetter("BatchId")
  public MaterialPackage setBatchId(String batchId) {
    this.batchId = batchId;
    return this;
  }

  /**
   * Gets or sets the batch identifier.
            
            There is material in the factory where not each material unit is identifiable. This is the case for
            Trays for example. Trays are delivered as a batch of trays. But each tray does not have a unique ID, only
            the batch of trays has a unique ID.
            In this case, we assume that the unique Batch ID is in the property
            BatchID and each tray which is been mounted will get a temporary UniqueIdentifier as long as it is been
            mounted on the machine. See BatchMaterialPackage for more details.
   *
   * @return never null
   */
  @JsonGetter("BatchId")
  public String getBatchId() {
    return batchId == null ? "" : batchId;
  }

  /**
   * Gets or sets the batch material package.
            
            This field specify the parent batch material unit representing the complete batch.
            The BatchMaterialPackagecan be queried the quantity as well as other properties for the whole batch.
             This data is only set, when the events are send out of the line level verification system. This
             property can not be set via the interface.
   * @param batchMaterialPackage the value
   */
  @JsonSetter("BatchMaterialPackage")
  public MaterialPackage setBatchMaterialPackage(org.ipc.cfx.structures.MaterialPackage batchMaterialPackage) {
    this.batchMaterialPackage = batchMaterialPackage;
    return this;
  }

  /**
   * Gets or sets the batch material package.
            
            This field specify the parent batch material unit representing the complete batch.
            The BatchMaterialPackagecan be queried the quantity as well as other properties for the whole batch.
             This data is only set, when the events are send out of the line level verification system. This
             property can not be set via the interface.
   * @return BatchMaterialPackage
   */
  @JsonGetter("BatchMaterialPackage")
  public org.ipc.cfx.structures.MaterialPackage getBatchMaterialPackage() {
    return batchMaterialPackage;
  }

  /**
   * Gets or sets the grey zone.
             
              This specifies the grey zone between 2 material packages. A grey zone is a zone
                 where the placement system can not determine where the switch between 2 material packages
                 has been taken place. Therefore the system tracks both material packages.
                 The quality of the GreyZone is driven by the process the customer is operating and if
                 the feeder are using optional splice sensor detectors or not.
                 Background is, that some sensors can detect the splice plate and the splice plate has a length
             which covers a number of components which hide the real end of tape. Therefore the verifcation system
             will report a greyzone between the &quot;leading package&quot; and the &quot;trailing&quot; in the chain.
             The greyzone will be maintained typically by the machine, based on the feeder configuration. When the feeder has a sploice sensor the
             grey zone will be calculated when the sensor detects the splice, and will be adjusted when components are consumed.
             When the greyzone reached zero, the &quot;leading&quot; package will be consumed and the chain will be modified by removing the &quot;leading&quot; package
             from the chain, resulting in the next package in the chain becoming the new &quot;leading&quot; package.
             
             This sample scenarion explains the data change when consuming the material with a feeder with sensor:
             ActionDescriptionResulting ChainGreyzoneInitalMaterial with a defined quantity is mounted.A (100)0ProductionMaterial will be consumed during production (20 components).A (80)0SplicingNew Material will be spliced to the mounted material.B(200) -&gt; A (80)0ProductionMaterial will be consumed during production (50 components).B(200) -&gt; A (30)0Splice detectedFeeder detects the splice and calculated the grey zone (here 10) and adjust
             the quantity because sensor overrules filling level information.
             Event will be triggered, that a quantity correction has been performed. 
             B(200) -&gt; A (0)10Production
             Material will be consumed during production (5 components).
             The material in the pickup location has a quantity of zero.
             The chain will be not be modified, because the greyzone is not zero.
             The material B will be consumed. 
             B(195) -&gt; A(0)5        /// Production
             Material will be consumed during production ( components).
             The material in the pickup location has a quantity of zero.
             The chain will be modified, because the greyzone is zero.
             The material A will be consumed. An event will be send, that the
             mateiral A is been consumed. 
             B(190)0ProductionMaterial will be consumed during production (50 components).B(140) 0
   * @param greyZone the value
   */
  @JsonSetter("GreyZone")
  public MaterialPackage setGreyZone(double greyZone) {
    this.greyZone = greyZone;
    return this;
  }

  /**
   * Gets or sets the grey zone.
             
              This specifies the grey zone between 2 material packages. A grey zone is a zone
                 where the placement system can not determine where the switch between 2 material packages
                 has been taken place. Therefore the system tracks both material packages.
                 The quality of the GreyZone is driven by the process the customer is operating and if
                 the feeder are using optional splice sensor detectors or not.
                 Background is, that some sensors can detect the splice plate and the splice plate has a length
             which covers a number of components which hide the real end of tape. Therefore the verifcation system
             will report a greyzone between the &quot;leading package&quot; and the &quot;trailing&quot; in the chain.
             The greyzone will be maintained typically by the machine, based on the feeder configuration. When the feeder has a sploice sensor the
             grey zone will be calculated when the sensor detects the splice, and will be adjusted when components are consumed.
             When the greyzone reached zero, the &quot;leading&quot; package will be consumed and the chain will be modified by removing the &quot;leading&quot; package
             from the chain, resulting in the next package in the chain becoming the new &quot;leading&quot; package.
             
             This sample scenarion explains the data change when consuming the material with a feeder with sensor:
             ActionDescriptionResulting ChainGreyzoneInitalMaterial with a defined quantity is mounted.A (100)0ProductionMaterial will be consumed during production (20 components).A (80)0SplicingNew Material will be spliced to the mounted material.B(200) -&gt; A (80)0ProductionMaterial will be consumed during production (50 components).B(200) -&gt; A (30)0Splice detectedFeeder detects the splice and calculated the grey zone (here 10) and adjust
             the quantity because sensor overrules filling level information.
             Event will be triggered, that a quantity correction has been performed. 
             B(200) -&gt; A (0)10Production
             Material will be consumed during production (5 components).
             The material in the pickup location has a quantity of zero.
             The chain will be not be modified, because the greyzone is not zero.
             The material B will be consumed. 
             B(195) -&gt; A(0)5        /// Production
             Material will be consumed during production ( components).
             The material in the pickup location has a quantity of zero.
             The chain will be modified, because the greyzone is zero.
             The material A will be consumed. An event will be send, that the
             mateiral A is been consumed. 
             B(190)0ProductionMaterial will be consumed during production (50 components).B(140) 0
   * @return GreyZone
   */
  @JsonGetter("GreyZone")
  public double getGreyZone() {
    return greyZone;
  }
}
