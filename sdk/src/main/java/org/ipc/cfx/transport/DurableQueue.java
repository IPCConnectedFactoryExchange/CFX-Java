/*
 * Copyright (c) 2019
 * 
 * Use this code as you like!
 */
package org.ipc.cfx.transport;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * 
 * original type: CFX.Transport.DurableQueue
 */
public class DurableQueue {

  /**
   * 
   */
  private boolean isEmpty;

  /**
   * 
   */
  private int count;

  /**
   * original property declaration: System.Boolean IsEmpty
   * 
   */
  @JsonSetter("IsEmpty")
  public void setIsEmpty(boolean isEmpty) {
    this.isEmpty = isEmpty;
  }

  /**
   * original property declaration: System.Boolean IsEmpty
   * 
   */
  @JsonGetter("IsEmpty")
  public boolean isEmpty() {
    return isEmpty;
  }

  /**
   * original property declaration: System.Int32 Count
   * 
   */
  @JsonSetter("Count")
  public void setCount(int count) {
    this.count = count;
  }

  /**
   * original property declaration: System.Int32 Count
   * 
   */
  @JsonSetter("Count")
  public int getCount() {
    return count;
  }
}
