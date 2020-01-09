package org.ipc.cfx.transport;

import org.apache.qpid.amqp_1_0.client.Message;

public class RequestContext {
  //
  // Zusammenfassung:
  //     Provides the context to a request processor to process the received request.
      //
      // Zusammenfassung:
      //     Gets the response (sending) link associated with the request context.
      public AmqpLink getResponseLink() { return null; }

      //
      // Zusammenfassung:
      //     Completes the request and sends the response message to the peer.
      //
      // Parameter:
      //   response:
      //     The response message to send.
      public void complete(Message response) {}
  
}
