package org.ipc.cfx.transport;

import javax.xml.ws.handler.MessageContext;

public interface LinkEndpoint {

  //
  // Zusammenfassung:
  //     The base class of an AMQP link endpoint.
  //
  // Hinweise:
  //     A link endpoint represents a target or a source terminus of a node. A target
  //     link endpoint is a message sink and is also called receiving link endpoint. A
  //     source link endpoint is a message source and is also called sending link endpoint
  //     in this document.
//      protected LinkEndpoint();

      //
      // Zusammenfassung:
      //     Processes a received disposition performative.
      //
      // Parameter:
      //   dispositionContext:
      //     Context of the received disposition performative.
      //
      // Hinweise:
      //     The endpoint should handle the delivery state and the message settlement. The
      //     delivery state indicates the outcome of the delivery on the remote peer. * Accepted:
      //     message is accepted and should be retied (e.g. removed from the queue or deleted
      //     from the storage). * Released: message is no longer acquired and should be made
      //     available for redelivery. * Rejected: message cannot be processed and required
      //     action (e.g. redelivery and deadlettering) should be taken. * Modified: similar
      //     to Released except message can be modified by the outcome. After the outcome
      //     is handled, the endpoint should call dispositionContext.Complete (with an error
      //     if any). If the delivery is not settled (as indicated by dispositionContext.Settled
      //     flag), an outcome is sent to the remote peer and the delivery is settled.
//      public abstract void OnDisposition(DispositionContext dispositionContext);
      //
      // Zusammenfassung:
      //     Processes a received flow performative.
      //
      // Parameter:
      //   flowContext:
      //     Context of the received flow performative.
      //
      // Hinweise:
      //     A sending endpoint should send messages per the requested message count. A receiving
      //     endpoint may receive a flow if the sender wants to exchange flow state or send
      //     custom properties.
//      public abstract void OnFlow(FlowContext flowContext);
      //
      // Zusammenfassung:
      //     The method is called when the link is closed. Derived classes may override this
      //     method to perform necessary cleanup work.
      //
      // Parameter:
      //   link:
      //     The link that is being closed.
      //
      //   error:
      //     The error, if any, that causes the link to be closed.
//      public  void OnLinkClosed(ListenerLink link, Error error);
      //
      // Zusammenfassung:
      //     Processes a received message.
      //
      // Parameter:
      //   messageContext:
      //     Context of the received message.
      //
      // Hinweise:
      //     A receiving endpoint must implement this method to process messages. The endpoint
      //     should call messageContext.Complete to finish processing the message. An Accepted
      //     outcome or a Rejected outcome with the specified error will be sent to the client.
      //     A sending endpoint never receives messages and should not override this method.
      public  void OnMessage(MessageContext messageContext);
  }
//}
