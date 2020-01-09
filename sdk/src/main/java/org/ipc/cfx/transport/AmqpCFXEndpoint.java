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

import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.MessageFormat;
import java.util.Hashtable;
import java.util.Optional;

import javax.security.cert.X509Certificate;

public class AmqpCFXEndpoint {

  private AmqpRequestProcessor requestProcessor;
  private Hashtable<String, AmqpConnection> channels;
  private boolean open;
  private boolean validateCertificate;
  private X509Certificate lastCertificate;
  private URI lastUri;

  private Optional<Boolean> useCompression;
  private Optional<Long> reconnectInterval;
  private Optional<Boolean> keepAliveEnabled;
  private Optional<Long> keepAliveInterval;
  private Optional<Integer> maxMessagesPerTransmit;
  private Optional<Integer> durableReceiverSetting;
  private Optional<Boolean> durableMessages;
  private Optional<Long> requestTimeout;
  private Optional<Integer> maxFrameSize;
  private String cfxHandle;

  // event : OnCFXMessageReceived
  public void onCFXMessageReceived(String request) {}

  // event : OnCFXMessageReceivedFromListener
  public void onCFXMessageReceivedFromListener(String request) {}

  // event : OnValidateCertificate
  public void onValidateCertificate(X509Certificate request) {}

  // event : OnConnectionEvent
  public void onConnectionEvent(URI request) {}

  public AmqpCFXEndpoint() {
    channels = new Hashtable<String, AmqpConnection>();
    setOpen(false);
    setValidateCertificates(true);
    setLastCertificate(null);
    setLastUri(null);
    if (!useCompression.isPresent())
      useCompression = Optional.of(false);
    if (!reconnectInterval.isPresent())
      reconnectInterval = Optional.of(5000L);
    if (!keepAliveEnabled.isPresent())
      keepAliveEnabled = Optional.of(false);
    if (!keepAliveInterval.isPresent())
      keepAliveInterval = Optional.of(60000L);
    if (!maxMessagesPerTransmit.isPresent())
      maxMessagesPerTransmit = Optional.of(30);
    if (!durableReceiverSetting.isPresent())
      durableReceiverSetting = Optional.of(1);
    if (!durableMessages.isPresent())
      durableMessages = Optional.of(true);
    if (!requestTimeout.isPresent())
      requestTimeout = Optional.of(30000L);
    if (!maxFrameSize.isPresent())
      maxFrameSize = Optional.of(250000);
  }

  private void setOpen(boolean b) {
    this.open = b;
  }

  public boolean isValidateCertificate() {
    return validateCertificate;
  }

  public void setValidateCertificates(boolean validateCertificate) {
    this.validateCertificate = validateCertificate;
  }

  public X509Certificate getLastCertificate() {
    return lastCertificate;
  }

  public void setLastCertificate(X509Certificate lastCertificate) {
    this.lastCertificate = lastCertificate;
  }

  public URI getLastUri() {
    return lastUri;
  }

  public void setLastUri(URI lastUri) {
    this.lastUri = lastUri;
  }

  /// <summary>
  /// Opens and inintializes the Endpoint. This should be called only once prior to closing the endpoint.
  /// </summary>
  /// <param name="cfxHandle">The unique CFX Handle for this endpoint.</param>
  /// <param name="requestAddress">The IP address on which this endpoint will listen for incoming requests.</param>
  /// <param name="requestPort">The TCP port on which this endpoint will listen for incoming requests. Default is 5672.</param>
  /// <param name="certificate">An X509 certificate that has been loaded from the certificate store. This is optional, and only must be set when using
  /// secure, encrypted AMQPS</param>
  
  public void open(String cfxHandle, InetAddress requestAddress) {
    open(cfxHandle, requestAddress, 5672);
  }  
  public void open(String cfxHandle, InetAddress requestAddress, int requestPort) {
    open(cfxHandle, requestAddress, requestPort, null);
  }

  public void open(String cfxHandle, InetAddress requestAddress, int requestPort, X509Certificate certificate) {
    URI uri = null;
    if (requestPort == 5673)
      try {
        uri = new URI(MessageFormat.format("amqps://{0}:{1}", requestAddress, requestPort));
      } catch (URISyntaxException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
//    else
//      uri = new URI(MessageFormat.format("amqp://{0}:{1}", requestAddress, requestPort));

    open(cfxHandle, uri, certificate);
  }

  /// <summary>
  /// Opens and inintializes the Endpoint. This should be called only once prior to closing the endpoint.
  /// </summary>
  /// <param name="cfxHandle">The unique CFX Handle for this endpoint.</param>
  /// <param name="requestUri">The Uri / network address on which this endpoint will listen for incoming requests for this endpoint. amqp:// prefix
  /// may be used for unencrypted AMQP on port 5672. amqps:// prefix may be used for secure AMQP on port 5671. You may also specify
  /// custom ports using normal hostname:port notation. Authentication may also be specified using standard user notation: eg.
  /// amqps://user1:password1@myhost/
  /// </param>
  /// <param name="certificate">An X509 certificate that has been loaded from the certificate store. This is optional, and only must be set when using
  /// secure, encrypted AMQPS</param>
  public void open(String cfxHandle) {
    this.open(cfxHandle, null, null);
  }

  public void open(String cfxHandle, URI requestUri) {
    this.open(cfxHandle, requestUri, null);
  }

  public void open(String cfxHandle, URI requestUri, X509Certificate certificate) {
    setOpen(false);

    try {
      this.cfxHandle = cfxHandle;

      if (requestUri != null) {
//        this.setRequestUri(requestUri);
//        requestProcessor = new AmqpRequestProcessor();
//        requestProcessor.Open(this.cfxHandle, this.getRequestUri, certificate);
//        requestProcessor.OnRequestReceived += RequestProcessor_OnRequestReceived;
//        requestProcessor.OnMessageReceivedFromListener += RequestProcessor_OnCFXMessageReceivedFromListener;
      }

      setOpen(true);
    } catch (Exception ex) {
      Cleanup();
      // Debug.WriteLine(ex.Message);
    }
  }

  /// <summary>
  /// Tests if the specified network address is capable of establishing an AMQP connection from this endpoint.
  /// </summary>
  /// <param name="channelUri">The network address of the target channel.</param>
  /// <param name="virtualHostName">The name of the virtual host at the destination endpoint. Default is null for default virtual host.</param>
  /// <param name="certificate">If secure amqps is being used, this property may optionally include the certificate that will be matched against the
  /// server's certificate </param>
  /// <param name="error">In the case of an error, returns information about the nature of the error.</param>
  /// <returns></returns>
  public boolean TestChannel(URI channelUri, Exception error) {
    return TestChannel(channelUri, error, null);
  }

  public boolean TestChannel(URI channelUri, Exception error, String virtualHostName )
{
//    error = null;
//    Connection conn = null;
//    Session sess = null;
//    Exception ex = null;
//
//    try
//    {
//        Open o = new Open()
//        {
//            ContainerId = Guid.NewGuid().ToString(),
//            HostName = virtualHostName,
//            MaxFrameSize = (uint)AmqpCFXEndpoint.MaxFrameSize.Value
//        };
//
//        ConnectionFactory fact = new ConnectionFactory();
//        if (string.IsNullOrWhiteSpace(channelUri.UserInfo))
//        {
//            fact.SASL.Profile = SaslProfile.Anonymous;
//        }
//
//        Task<Connection> tConn = fact.CreateAsync(new Address(channelUri.ToString()), o);
//        tConn.Wait(3000);
//        if (tConn.Status != TaskStatus.RanToCompletion) throw new Exception("Timeout");
//
//        conn = tConn.Result;
//        conn.Closed += (IAmqpObject s, Error e) => { if (e != null) ex = new Exception(e.Description); };
//        sess = new Session(conn);
//        sess.Closed += (IAmqpObject s, Error e) => { if (e != null) ex = new Exception(e.Description); };
//        if (ex != null) throw ex;
//        Task.Delay(10).Wait();
//        if (ex != null) throw ex;
//    }
//    catch (Exception ex2)
//    {
//        error = ex2;
//        Debug.WriteLine(ex2.Message);
//    }
//    finally
//    {
//        if (sess != null && !sess.IsClosed) sess.CloseAsync();
//        if (conn != null && !conn.IsClosed) conn.CloseAsync();
//    }

    if (error == null) return true;
    return false;
}

  /// <summary>
  /// Tests if the specified network address and AMQP target address is capable of receiving messages published from this endpoint.
  /// </summary>
  /// <param name="networkAddress">The network address of the target channel.</param>
  /// <param name="address">The AMQP target address to which messages will be published.</param>
  /// <param name="error">In the case of an error, returns information about the nature of the error.</param>
  /// <param name="virtualHostName">The name of the virtual host at the destination endpoint. Default is null for default virtual host. For RabbitMQ
  /// broker, use format vhost:MYVHOST</param>
  /// <param name="certificate">If secure amqps is being used, this property may optionally include the certificate that will be matched
  /// against the server's certificate. Leave null if you do not wish to perform certificate matching (secure communications will still be established
  /// using the server's certificate (if using amqps).</param>
  /// <returns>A boolean value indicated whether or not the channel is valid.</returns>
  public boolean TestPublishChannel(URI networkAddress, String address, Exception error)
  {
    return TestPublishChannel(networkAddress, address, error,null);
    }
  
    public boolean TestPublishChannel(URI networkAddress, String address, Exception error, String virtualHostName  )
    {
      return TestPublishChannel(networkAddress, address, error,null,null);
    }
public boolean TestPublishChannel(URI networkAddress, String address, Exception error, String virtualHostName , X509Certificate certificate )
{
//    error = null;
//    Connection conn = null;
//    Session sess = null;
//    SenderLink link = null;
//    Exception ex = null;
//
//    try
//    {
//        Open o = new Open()
//        {
//            ContainerId = Guid.NewGuid().ToString(),
//            HostName = virtualHostName,
//            MaxFrameSize = (uint)AmqpCFXEndpoint.MaxFrameSize.Value
//        };
//
//        ConnectionFactory fact = new ConnectionFactory();
//        if (string.IsNullOrWhiteSpace(networkAddress.UserInfo))
//        {
//            fact.SASL.Profile = SaslProfile.Anonymous;
//        }
//
//        if (networkAddress.Scheme.ToUpper() == "AMQPS")
//        {
//            LastCertificate = certificate;
//            LastUri = networkAddress;
//            fact.SSL.RemoteCertificateValidationCallback = ValidateServerCertificate;
//        }
//                        
//        Task<Connection> tConn = fact.CreateAsync(new Address(networkAddress.ToString()), o);
//        tConn.Wait(3000);
//        if (tConn.Status != TaskStatus.RanToCompletion) throw new Exception("Timeout");
//
//        conn = tConn.Result;
//        conn.Closed += (IAmqpObject s, Error e) => { if (e != null) ex = new Exception(e.Description); };
//        sess = new Session(conn);
//        sess.Closed += (IAmqpObject s, Error e) => { if (e != null) ex = new Exception(e.Description); };
//        if (ex != null) throw ex;
//        link = new SenderLink(sess, address, address);
//        link.Closed += (IAmqpObject s, Error e) => { if (e != null) ex = new Exception(e.Description); };
//        link.Close();
//        Task.Delay(10).Wait();
//        if (ex != null) throw ex;
//    }
//    catch (Exception ex2)
//    {
//        error = ex2;
//        Debug.WriteLine(ex2.Message);
//    }
//    finally
//    {
//        if (sess != null && !sess.IsClosed) sess.CloseAsync();
//        if (conn != null && !conn.IsClosed) conn.CloseAsync();
//    }

    if (error == null) return true;
    return false;
}

  private void Cleanup() {
    if (requestProcessor != null) {
      requestProcessor.close();
      requestProcessor = null;
    }

    for (AmqpConnection conn : channels.values()) {
      conn.dispose();
    }

    channels.clear();
    setOpen(false);
  }

}
