/*
 * Copyright (c) 2019
 * 
 * Use this code as you like!
 */
package org.ipc.cfx.transport;

import java.net.URI;
import java.security.cert.X509Certificate;

import org.apache.qpid.amqp_1_0.client.Connection;
import org.apache.qpid.amqp_1_0.client.Session;



/**
 * 
 * original type: CFX.Transport.AmqpConnection
 */
public class AmqpConnection {

	private long sendTimout;
	private URI networkUri;
	private AmqpCFXEndpoint endpoint;
	private boolean isClosed;
	private X509Certificate certificate;
	private String virtualHostName;
	private int totalSpoolSize;
	private Connection internalConnection;
	private Session internalSession;

	/**
	 * original property declaration: System.TimeSpan SendTimout
	 * 
	 */
	public void setSendTimout(long sendTimout) {
		this.sendTimout = sendTimout;
	}

	/**
	 * original property declaration: System.TimeSpan SendTimout
	 * 
	 */
	public long getSendTimout() {
		return sendTimout;
	}

	/**
	 * original property declaration: System.Uri NetworkUri
	 * 
	 */
	public void setNetworkUri(URI networkUri) {
		this.networkUri = networkUri;
	}

	/**
	 * original property declaration: System.Uri NetworkUri
	 * 
	 */
	public URI getNetworkUri() {
		return networkUri;
	}

	/**
	 * original property declaration: CFX.Transport.AmqpCFXEndpoint Endpoint
	 * 
	 */
	public void setEndpoint(AmqpCFXEndpoint endpoint) {
		this.endpoint = endpoint;
	}

	/**
	 * original property declaration: CFX.Transport.AmqpCFXEndpoint Endpoint
	 * 
	 */
	public AmqpCFXEndpoint getEndpoint() {
		return endpoint;
	}

	/**
	 * original property declaration: System.Boolean IsClosed
	 * 
	 */
	public void setIsClosed(boolean isClosed) {
		this.isClosed = isClosed;
	}

	/**
	 * original property declaration: System.Boolean IsClosed
	 * 
	 */
	public boolean isIsClosed() {
		return isClosed;
	}

	/**
	 * original property declaration:
	 * System.Security.Cryptography.X509Certificates.X509Certificate Certificate
	 * 
	 */
	public void setCertificate(X509Certificate certificate) {
		this.certificate = certificate;
	}

	/**
	 * original property declaration:
	 * System.Security.Cryptography.X509Certificates.X509Certificate Certificate
	 * 
	 */
	public X509Certificate getCertificate() {
		return certificate;
	}

	/**
	 * original property declaration: System.String VirtualHostName
	 * 
	 */
	public void setVirtualHostName(String virtualHostName) {
		this.virtualHostName = virtualHostName;
	}

	/**
	 * original property declaration: System.String VirtualHostName
	 * 
	 *
	 * @return never null
	 */
	public String getVirtualHostName() {
		return virtualHostName == null ? "" : virtualHostName;
	}

	/**
	 * original property declaration: System.Int32 TotalSpoolSize
	 * 
	 */
	public void setTotalSpoolSize(int totalSpoolSize) {
		this.totalSpoolSize = totalSpoolSize;
	}

	/**
	 * original property declaration: System.Int32 TotalSpoolSize
	 * 
	 */
	public int getTotalSpoolSize() {
		return totalSpoolSize;
	}

	/**
	 * original property declaration: Amqp.Connection InternalConnection
	 * 
	 */
	public void setInternalConnection(Connection internalConnection) {
		this.internalConnection = internalConnection;
	}

	/**
	 * original property declaration: Amqp.Connection InternalConnection
	 * 
	 */
	public Connection getInternalConnection() {
		return internalConnection;
	}

	/**
	 * original property declaration: Amqp.Session InternalSession
	 * 
	 */
	public void setInternalSession(Session internalSession) {
		this.internalSession = internalSession;
	}

	/**
	 * original property declaration: Amqp.Session InternalSession
	 * 
	 */
	public Session getInternalSession() {
		return internalSession;
	}
	
    public AmqpConnection(URI uri, AmqpCFXEndpoint endpoint, String virtualHostName , X509Certificate certificate ) {
    	super();
    	setNetworkUri(uri);
    	setEndpoint(endpoint);
    	setVirtualHostName(virtualHostName);
    	setCertificate(certificate);
    }
    	
    public void dispose() {
      cleanup();
    }
    
    public void cleanup() {
    }
}
