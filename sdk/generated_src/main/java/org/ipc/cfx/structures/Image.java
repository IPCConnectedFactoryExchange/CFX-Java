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

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * 
 * original type: CFX.Structures.Image
 */
public class Image {

  private String mimeType;
  private Byte[] imageData;

  /**
   * The MIME type of the binary image data contained by the ImageData property.
   * @param mimeType the value
   */
  @JsonSetter("MimeType")
  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  /**
   * The MIME type of the binary image data contained by the ImageData property.
   *
   * @return never null
   */
  @JsonGetter("MimeType")
  public String getMimeType() {
    return mimeType == null ? "" : mimeType;
  }

  /**
   * A binary representation of the image.
   * @param imageData the value
   */
  @JsonSetter("ImageData")
  public void setImageData(Byte[] imageData) {
    this.imageData = imageData;
  }

  /**
   * A binary representation of the image.
   * @return ImageData
   */
  @JsonGetter("ImageData")
  public Byte[] getImageData() {
    return imageData;
  }
}
