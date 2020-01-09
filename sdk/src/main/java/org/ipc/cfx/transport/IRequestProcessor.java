package org.ipc.cfx.transport;

public interface IRequestProcessor {
  //
  // Zusammenfassung:
  //     Defines the methods of a request processor.

      //
      // Zusammenfassung:
      //     Gets the link credit to issue to the sender client.
      int getCredit ();

      //
      // Zusammenfassung:
      //     Processes a received request.
      //
      // Parameter:
      //   requestContext:
      //     Context of the received request.
      void process(RequestContext requestContext);
  
}
