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
 * source: CFX.DLL, Version 1.0.15.0
 * created: 23.05.2019 10:23:59 by frankp
 */
package org.ipc.cfx.transport;

import java.net.URI;
import java.util.Hashtable;
import java.util.List;

import javax.security.cert.X509Certificate;
import javax.xml.ws.handler.MessageContext;

import org.ipc.cfx.CFXEnvelope;
import org.ipc.cfx.NotSupportedResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AmqpRequestProcessor {

  public static Logger logger = LoggerFactory.getLogger(AmqpRequestProcessor.class);

  public URI getRequestUri() {
    return requestUri;
  }

  public void setRequestUri(URI requestUri) {
    this.requestUri = requestUri;
  }

  public long getSendTimout() {
    return sendTimout;
  }

  public void setSendTimout(long sendTimout) {
    this.sendTimout = sendTimout;
  }

  public String getCfxHandle() {
    return cfxHandle;
  }

  public void setCfxHandle(String cfxHandle) {
    this.cfxHandle = cfxHandle;
  }

  public String getRequestHandle() {
    return requestHandle;
  }

  public void setRequestHandle(String requestHandle) {
    this.requestHandle = requestHandle;
  }

  public boolean isOpen() {
    return open;
  }

  public void setOpen(boolean open) {
    this.open = open;
  }

  public Hashtable<String, InternalMessageProcessor> getListeners() {
    return listeners;
  }

  public void setListeners(Hashtable<String, InternalMessageProcessor> listeners) {
    this.listeners = listeners;
  }

  public URI requestUri;
  public long sendTimout;
  public String cfxHandle;
  public String requestHandle;
  public boolean open;

  public AmqpRequestProcessor() {
    open = false;
    listeners = new Hashtable<String, InternalMessageProcessor>();
  }

  // public event OnRequestHandler OnRequestReceived;
  // public event CFXMessageReceivedFromListenerHandler OnMessageReceivedFromListener;

  private Hashtable<String, InternalMessageProcessor> listeners;
  // private ContainerHost inboundHost;

  // event : OnMessageReceivedFromListener
  public void onMessageReceivedFromListener(String request) {}

  public void open(String cfxHandle, URI requestUri) {
    open(cfxHandle, requestUri, null);
  }

  public void open(String cfxHandle, URI requestUri, X509Certificate certificate) {
    open = false;
    if (cfxHandle == null || cfxHandle.isEmpty())
      throw new IllegalArgumentException("You must supply a CFX Handle");

    this.setCfxHandle(cfxHandle);
    setRequestUri(requestUri);

    // TODO inboundHost = new ContainerHost(RequestUri);

//    if (!string.IsNullOrWhiteSpace(RequestUri.UserInfo))
//      inboundHost = new ContainerHost(new Uri[] { RequestUri }, null, RequestUri.UserInfo);
//    else
//      inboundHost = new ContainerHost(RequestUri);
//
//    var listener = inboundHost.Listeners[0];

//    if (requestUri.getScheme().equalsIgnoreCase("amqps")) {
//      listener.SSL.Certificate = certificate;
//      listener.SSL.ClientCertificateRequired = true;
//      listener.SSL.RemoteCertificateValidationCallback = ValidateServerCertificate;
//      listener.SASL.EnableExternalMechanism = true;
//    }
//
//    if (getRequestUri().getUserInfo() == null || getRequestUri().getUserInfo().isEmpty()) {
//      listener.SASL.EnableExternalMechanism = false;
//      listener.SASL.EnableAnonymousMechanism = true;
//    } else {
//      listener.SASL.EnableExternalMechanism = true;
//      listener.SASL.EnableAnonymousMechanism = false;
//      // listener.SASL.EnablePlainMechanism(RequestUri.UserInfo.Split(':')[0], RequestUri.UserInfo.Split(':')[1]);
//    }
//
//    listener.SSL.Certificate = certificate;
//    listener.SSL.ClientCertificateRequired = true;
//    listener.SSL.ClientCertificateRequired = false;
//    listener.SSL.RemoteCertificateValidationCallback = ValidateServerCertificate;

//    inboundHost.Open();
//    logger.info("Container host is listening on {RequestUri.Host}:{RequestUri.Port}.  User {requestUri.UserInfo}");
//
//    inboundHost.RegisterRequestProcessor(RequestHandle, new InternalRequestProcessor(this));
    logger.info("Request processor is registered on {0}", getRequestHandle());
    setOpen(true);
  }

  public void AddListener(String targetAddress) throws Exception {
    if (!isOpen())
      throw new Exception("The Endpoint must have an a request processor set up via the Open method in order to receive messages on a listener.");

    String t = targetAddress.toUpperCase();
    if (listeners.containsKey(t))
      throw new Exception("The specified targetAddress is already in use.");

    Exception ex = null;
//    try {
//      InternalMessageProcessor p = new InternalMessageProcessor(this, targetAddress);
//      inboundHost.RegisterMessageProcessor(targetAddress, p);
//      logger.info("Listener registered on {0}", targetAddress);
//      listeners[t] = p;
//    } catch (Exception exception) {
//      ex = exception;
//      AppLog.Error(ex);
//    }
    if (ex != null)
      throw ex;
  }

  public void RemoveListener(String targetAddress)
  {
      String t = targetAddress.toUpperCase();
//      if (!listeners.containsKey(t)) throw new Exception("The specified targetAddress does not have an active listener.");
//      inboundHost.UnregisterMessageProcessor(targetAddress);
      InternalMessageProcessor p = null;
//      while (!listeners.TryRemove(targetAddress, out p)) Task.Yield();
  }

  public void close() {
    cleanup();
  }

  public void Dispose() {
    cleanup();
  }

  private void cleanup()
  {
//      var temp = Interlocked.Exchange(ref inboundHost, null);
//      if (temp != null)
//      {
//          for (InternalMessageProcessor p : listeners.Values)
//          {
//              temp.UnregisterMessageProcessor(p.TargetAddress);
//          }
//          listeners.Clear();
//
//          temp.UnregisterRequestProcessor(RequestHandle);
//          temp.Close();
//      }
//
//      this.inboundHost = null;
  }

  public void fire_OnMessageReceivedFromListener(String targetAddress, CFXEnvelope message) {
    // TODO Auto-generated method stub

  }

}






